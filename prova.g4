// Practica desenvolupada per Jan Puig i Arnau Costa.

// Ens trobem amb un error sobre que en l'arbre de parsing tot s'identifica únicament com a un token.

grammar prova;

@header {
    import java.io.*;
    import java.lang.Object;
    import java.util.Vector;
}

@parser::members {
    SymTable TS = new SymTable<Registre>(1001);
    Bytecode x;
    int contadorVariables=0;
    Boolean errorsem=false;
    Long saltLinia;

    public void notifyErrorListeners(Token offendingToken, String msg, RecognitionException e)    {
      super.notifyErrorListeners(offendingToken,msg,e);
      errorsem=true;
    }

    private char stringTypeToType(String type) {
        char tipus = ' ';
        if (type.equals("enter")) {
            tipus='I';
        } else if (type.equals("real")) {
            tipus='F';
        } else if (type.equals("boolea")) {
            tipus='Z';
        }
        return tipus;
    }

//    private char checkType(char tipus1, char tipus2) {
//        if (tipus1 == 'F' && tipus2 == 'F') {
//            return 'F';
//        } else if ((tipus1 == 'F' || tipus2 == 'F') && ((tipus1 == 'I' || tipus2 == 'I'))){
//            return 'F';
//        } else if (tipus1 == 'I' && tipus2 == 'I') {
//            return 'I';
//        }
//    }
}

// Regla sintactica
inici
@init {
//    x=new Bytecode("compilat");
//    saltLinia=x.addConstant("S","\n");
//    Vector<Long> trad = new Vector<Long>(10);
} : estructuraGeneral EOF;

//inici : (tipusDecl | accioFuncioDecl | blocVariables | sentencia)+ EOF ;
//inici :(~EOF)+ ;

// Regles Lexiques

TK_WS: ( ' ' | '\t ' | '\n' | '\r' )+ -> skip ;
TK_LCLAU : '[' ;
TK_RCLAU : ']' ;
TK_LPAREN : '(' ;
TK_RPAREN: ')' ;
TK_LBRACKET: '{' ;
TK_RBRACKET: '}' ;
// TK_STAR : '*' ;
// TK_OP_PLUS : '+';
TK_SEMI : ';' ;
TK_PC_PROGRAMA: 'programa'  {System.out.println("he reconegut programa");};
TK_PC_FPROGRAMA: 'fprograma'  ;
TK_PC_PERIODE: 'periode';
//TK_PC_PER: 'per';
//TK_PC_SI: 'si';
//TK_MESGRAN: '>';

TK_TIPUS: 'tipus'; // Tipus
TK_FTIPUS: 'ftipus'; // Ftipus
TK_PUNTS: ':'; // Punts
TK_VECTOR: 'vector'; // Vectors
TK_TUPLA: 'tupla;'; // Tupla
TK_FTUPLA: 'ftupla;'; // Ftupla


fragment
DIGIT : '1' .. '9' ;
fragment
LLETRA : 'a' .. 'z' | 'A' .. 'Z' ;
TK_ENTER : '0' | ('+' | '-')? DIGIT (DIGIT|'0')*;
TK_REAL : [+-]? (DIGIT|'0')+ ('.' (DIGIT|'0')+)? ([eE] [+-]? DIGIT+)? ; // Real
TK_BOLEA: 'Cert' | 'Fals'; // Bolea
TK_TIPUS_BASIC: 'enter' | 'real' | 'boolea';
// TK_ENTER: ENTER
// TK_REAL: REAL
// ENTER: '0' | ('+' | '-')? DIGIT (DIGIT|'0')*;

// Tokens per fragment


TK_ACCIO: 'accio'; // Accio
TK_FACCIO: 'faccio'; // Faccio
TK_FUNCIO: 'funcio'; // Funcio
TK_FFUNCIO: 'ffuncio'; // Ffuncio
TK_RETORNA: 'retorna'; // Retorna
fragment
ENT_SOR: 'ent' | 'entsor';
TK_PARAM: ENT_SOR ? TK_IDENT ':' TK_TIPUS_BASIC (',' ENT_SOR ? TK_IDENT ':' TK_TIPUS_BASIC)*; // No estic segur de que faci falta

TK_VARIABLES: 'variables'; // Variables
TK_FVARIABLES: 'fvariables'; // Fvariables

TK_VARIABLE: (TK_IDENT (TK_COMA TK_IDENT)* ':' TK_TIPUS_BASIC)+;

TK_COMMENT : ('//' ~[\r\n]* | '/*' .*? '*/') -> skip ;

TK_COMA: ',';
TK_PUNT: '.';
TK_SUMA : '+';
TK_RESTA : '-' ;
TK_MULTIPLICACIO : '*' ;
TK_DIVISIO : '/' ;
TK_DIV_ENTERA : '\\' ;
TK_MODUL : '%' ;
TK_MENYS_UNARI : '∼' ;

TK_IGUALTAT : '==' ;
TK_DESIGUALTAT : '!=' ;
TK_MES_PETIT : '<' ;
TK_MES_PETIT_IG : '<=' ;
TK_MES_GRAN : '>' ;
TK_MES_GRAN_IG : '>=' ;


TK_NEGACIO : 'no' ;
TK_AND : '&' ;
TK_OR : '|' ;

TK_DOSPUNTS: '..';
TK_ASSIGNACIO: ':=';
TK_SI: 'si';
TK_LLAVORS: 'llavors';
TK_ALTRAMENT: 'altrament';
TK_FSI: 'fsi';
TK_EN: 'en';
TK_PER: 'per';
TK_ID: 'id';
TK_FINS: 'fins';
TK_FER: 'fer';
TK_FPER: 'fper';
TK_MENTRE: 'mentre';
TK_FMENTRE: 'fmentre';

TK_LLEGIR: 'llegir';
TK_ESCRIURE: 'escriure';
TK_ESCRIURELN: 'escriureln';


TK_IDENT : LLETRA (LLETRA | DIGIT | '0' | '_' ) * ;


//Estructura Basica
estructuraGeneral
@init {
    x=new Bytecode("compilat");
    saltLinia=x.addConstant("S","\n");
    Vector<Long> trad = new Vector<Long>(10);
}
    : tipusDecl? accioFuncioDecl? TK_PC_PROGRAMA blocVariables? (cc=sentencia {trad.addAll($cc.trad);} )+ TK_PC_FPROGRAMA
    {    if (!errorsem) {
             trad.add(x.RETURN);
             x.addMainCode(10L,10L,trad);
             x.write();
         }
    };


// Bloc de declaració de tipus
tipusDecl returns [Vector<Long> trad]
@init 	{
	$trad=new Vector<Long>(100);
    }
    : TK_TIPUS novaDefinicio+ TK_FTIPUS
    ;

novaDefinicio returns [Vector<Long> trad]
@init 	{
	$trad=new Vector<Long>(100);
    }
    : TK_IDENT TK_PUNTS TK_VECTOR TK_TIPUS_BASIC TK_ENTER TK_ENTER (TK_COMA TK_ENTER)* TK_SEMI # DefinicioVector
    | TK_IDENT TK_PUNTS TK_TUPLA TK_LBRACKET campTupla+ TK_RBRACKET TK_FTUPLA # DefinicioTupla
    ;

campTupla returns [Vector<Long> trad]
@init 	{
	$trad=new Vector<Long>(100);
    }
    : TK_IDENT TK_PUNTS TK_TIPUS_BASIC TK_SEMI
    ;

// Bloc d'accions i funcions
accioFuncioDecl returns [Vector<Long> trad]
@init 	{
	$trad=new Vector<Long>(100);
    }
    : accioDecl+
    | funcioDecl+
    ;

accioDecl returns [Vector<Long> trad]
@init 	{
	$trad=new Vector<Long>(100);
    }
    : TK_ACCIO id=TK_IDENT (TK_LPAREN parametresFormals? TK_RPAREN)? blocVariables? sentencia* TK_FACCIO{
            if (TS.existeix($id.text)) {
                notifyErrorListeners($id, "Error: Nom ja utilitzat.", null);
            } else {
                TS.inserir($id.text, new Registre("funcio", 'V'));
            }
    }
    ;

funcioDecl returns [Vector<Long> trad]
@init 	{
	$trad=new Vector<Long>(100);
    }
    : TK_FUNCIO id=TK_IDENT (TK_LPAREN parametresFormals? TK_RPAREN)? TK_RETORNA TK_TIPUS_BASIC blocVariables? sentencia* TK_RETORNA expr TK_FFUNCIO {
        if (TS.existeix($id.text)) {
            notifyErrorListeners($id, "Error: Nom ja utilitzat.", null);
        } else {
            TS.inserir($id.text, new Registre("funcio", stringTypeToType($TK_TIPUS_BASIC.text)));
        }
    }
    ;

parametresFormals returns [Vector<Long> trad]
@init 	{
	$trad=new Vector<Long>(100);
    }
    : TK_PARAM (TK_COMA TK_PARAM)*
    ;


// Bloc de declaració de variables
blocVariables returns [Vector<Long> trad]
@init 	{
	$trad=new Vector<Long>(100);
    }
    : TK_VARIABLES declaracioVariable* TK_FVARIABLES
    ;

declaracioVariable returns [Vector<Long> trad]
@init 	{
	$trad=new Vector<Long>(100);
    }
    : id1=TK_IDENT (TK_COMA id2+=TK_IDENT)* TK_PUNTS tipusDefinit TK_SEMI
    {
        // Comprovem si la variable ja ha estat declarada
        if (TS.existeix($id1.text)) {
            notifyErrorListeners($id1, "Error: Variable ja declarada.", null);
        } else {
            TS.inserir($id1.text, new Registre("variable", $tipusDefinit.tipus, contadorVariables++));
        }

        // Recorrem totes les variables separades per coma
        for (Token identificador : $id2) {
            System.out.println("Identificadors: " + identificador.getText());
            if (TS.existeix(identificador.getText())) {
                notifyErrorListeners(identificador, "Error: Variable '" + identificador.getText() + "' ja declarada.", null);
            } else {
                TS.inserir(identificador.getText(), new Registre("variable", $tipusDefinit.tipus, contadorVariables++));
            }
        }
    }
    ;



tipusDefinit returns [Vector<Long> trad, char tipus]
@init 	{
	$trad=new Vector<Long>(100);
    }
    : TK_TIPUS_BASIC {
         if ($TK_TIPUS_BASIC.text.equals("enter")) {
             $tipus='I';
         } else if ($TK_TIPUS_BASIC.text.equals("real")) {
             $tipus='F';
         } else if ($TK_TIPUS_BASIC.text.equals("boolea")) {
             $tipus='Z';
         }
     }
    | TK_IDENT
    {
        if (!TS.existeix($TK_IDENT.text)) {
            System.out.println("No existeix: " + $TK_IDENT.text);
            notifyErrorListeners($TK_IDENT, "Error: Variable '" + $TK_IDENT.text + "' no declarada.", null);
        } else {
            Registre r=(Registre)TS.obtenir($TK_IDENT.text);
            $trad.add(x.ILOAD);
            $trad.add(new Long(r.getAdreca()));
            System.out.println("Existeix molt: " + $TK_IDENT.text);
        }
    }
    ;

// Estructures de control sentencia
sentencia returns [Vector<Long> trad]
@init 	{
	$trad=new Vector<Long>(100);
    }
    : assignacio {
        $trad = $assignacio.trad;
    }
    | condicional {
        $trad = $condicional.trad;
    }
    | buclePer {
        $trad = $buclePer.trad;
    }
    | bucleMent {
        $trad = $bucleMent.trad;
    }
    | cridaAccioFuncio {
       $trad = $cridaAccioFuncio.trad;
    }
    | operacioLecturaEscritura {
        $trad = $operacioLecturaEscritura.trad;
    }
    ;

assignacio returns [Vector<Long> trad]
@init 	{
	$trad=new Vector<Long>(100);
    }
    : TK_IDENT TK_ASSIGNACIO expr TK_SEMI {
        // Verificar si la variable existe en la tabla de símbolos
        if (!TS.existeix($TK_IDENT.text)) {
            System.out.println("No existeix: " + $TK_IDENT.text);
            notifyErrorListeners($TK_IDENT, "Error: Variable '" + $TK_IDENT.text + "' no declarada.", null);
        } else {
            System.out.println("Existeix: " + $TK_IDENT.text);
            Registre r = (Registre) TS.obtenir($TK_IDENT.text);
            if ($expr.tipus != r.getTipus() && !(r.getTipus() == 'F' && $expr.tipus == 'I')){
                notifyErrorListeners($TK_IDENT, "Error: Type missmatch. " + $expr.tipus + " type cannot be casted to " + r.getTipus(), null);
            } else if ($expr.tipus == 'F'){
                $trad=$expr.trad;
                $trad.add(x.FSTORE);
                $trad.add(new Long(r.getAdreca()));
            } else if ($expr.tipus == 'I' | $expr.tipus == 'Z'){
                $trad=$expr.trad;
                $trad.add(x.ISTORE);
                $trad.add(new Long(r.getAdreca()));
            }
        }
    }
    ;

condicional returns [Vector<Long> trad] //TODO
@init 	{
	$trad=new Vector<Long>(100);
	Vector<Long> trad2 = new Vector<Long>(100);
	Vector<Long> tradAlt = new Vector<Long>(100);
	Vector<Vector<Long>> vectorSentencies = new Vector<>();
	Vector<Long> exprAlt = new Vector<Long>(100);
	Vector<Long> tradEnd = new Vector<Long>(100);
    }
    : TK_SI e1=expr TK_LLAVORS (cc=sentencia {trad2.addAll($cc.trad);})*
    (TK_ALTRAMENT e2+=expr {Vector<Long> subVector = new Vector<>();} TK_LLAVORS (s2=sentencia {subVector.addAll($s2.trad);})* {vectorSentencies.add(subVector);})*

    (TK_ALTRAMENT (s3=sentencia {tradEnd.addAll($s3.trad);})*)? TK_FSI
    {
        System.out.println("Primer: " + $e1.tipus);
        if($e1.tipus != 'Z'){
            notifyErrorListeners($e1.start, "Expr not boolean", null);
        }

        for (ExprContext ctx : $e2) {
            if(ctx.tipus != 'Z'){
                notifyErrorListeners(ctx.start, "Expr not boolean", null);
            } else {
                //System.out.println("Expr size: " + tradEnd.size());
            }
        }

        Long distanciaFinsFinal = 0L;
        for (int i = 0; i < vectorSentencies.size(); i++) {
            distanciaFinsFinal += vectorSentencies.get(i).size() + 3L;
            distanciaFinsFinal += $e2.get(i).trad.size();
        }

        for (int i = 0; i < vectorSentencies.size(); i++) {
            System.out.println("||||||||||||||||||| Vector sentencies (" + i + "): " + vectorSentencies.get(i).size());

        }

	   	$trad=$e1.trad;
	   	$trad.add(x.IFEQ);
	   	Long salt=trad2.size()+6L;
	   	$trad.add(x.nByte(salt,2));
	   	$trad.add(x.nByte(salt,1));

	   	$trad.addAll(trad2);


        for (int i = 0; i < $e2.size(); i++) {
            System.out.println("Distancia final: " + distanciaFinsFinal);
            System.out.println("Expr: " + $e2.get(i).trad);
            System.out.println("Trad: " + vectorSentencies.get(i));

            $trad.add(x.GOTO);
            salt=distanciaFinsFinal+(3L*($e2.size()-i));
            $trad.add(x.nByte(salt,2));
            $trad.add(x.nByte(salt,1));

            $trad.addAll($e2.get(i).trad);
            $trad.add(x.IFEQ);
            salt=vectorSentencies.get(i).size()+6L;
            $trad.add(x.nByte(salt,2));
            $trad.add(x.nByte(salt,1));

            $trad.addAll(vectorSentencies.get(i));

            distanciaFinsFinal -= 3 + vectorSentencies.get(i).size() + $e2.get(i).trad.size();
        }

        $trad.add(x.GOTO);
        salt=tradEnd.size()+3L;
        $trad.add(x.nByte(salt,2));
        $trad.add(x.nByte(salt,1));

        $trad.addAll(tradEnd);
    }
    ;


buclePer returns [Vector<Long> trad] //TODO aqui
@init 	{
	$trad=new Vector<Long>(100);
    }
    : TK_PER TK_IDENT TK_EN r=rang {
        Vector<Long> trad2 = new Vector<Long>(100);
    } TK_FER (s=sentencia {trad2.addAll($s.trad);} )* TK_FPER
    {
        if (!TS.existeix($TK_IDENT.text)) {
            System.out.println("No existeix: " + $TK_IDENT.text); // 12 1,4
            notifyErrorListeners($TK_IDENT, "Error: Variable '" + $TK_IDENT.text + "' no declarada.", null);
        } else {
            Registre r = (Registre) TS.obtenir($TK_IDENT.text);
            if (r.getTipus() != 'I'){
                notifyErrorListeners($TK_IDENT, "Error: Variable '" + $TK_IDENT.text + "' must be int.", null);
            }
            else{

                Long adrecaTemp=x.addConstant("I",$r.primer); //afegim a la constant pool
                $trad.add(x.LDC_W);
                $trad.add(x.nByte(adrecaTemp,2));
                $trad.add(x.nByte(adrecaTemp,1));
                $trad.add(x.ISTORE);
                $trad.add(new Long(r.getAdreca()));

                $trad.add(x.ILOAD);
                $trad.add(new Long(r.getAdreca()));

                adrecaTemp=x.addConstant("I",$r.segon); //afegim a la constant pool
                $trad.add(x.LDC_W);
                $trad.add(x.nByte(adrecaTemp,2));
                $trad.add(x.nByte(adrecaTemp,1));

                //System.out.println($trad);
                $trad.add(x.IF_ICMPGE);
                Long salt = $trad.size() + (trad2.size() + 0L) + 3L;
                $trad.add(x.nByte(salt,2));
                $trad.add(x.nByte(salt,1));


                $trad.addAll(trad2);

                $trad.add(x.ILOAD);
                $trad.add(new Long(r.getAdreca()));

                adrecaTemp=x.addConstant("I","1"); //afegim a la constant pool
                $trad.add(x.LDC_W);
                $trad.add(x.nByte(adrecaTemp,2));
                $trad.add(x.nByte(adrecaTemp,1));

                $trad.add(x.IADD);

                $trad.add(x.ISTORE);
                $trad.add(new Long(r.getAdreca()));

                salt=0L-($trad.size() - 5L) ;
                $trad.add(x.GOTO);
                $trad.add(x.nByte(salt,2));
                $trad.add(x.nByte(salt,1));


                //Rest
            }
        }
    }
    ;

//buclePer returns [Vector<Long> trad]
//@init {
//    $trad = new Vector<Long>(100);
//}
//: TK_PER TK_IDENT TK_EN r=rang {
//    Vector<Long> tradCond = new Vector<Long>(100); // Código de la condición del for
//    Vector<Long> tradCuerpo = new Vector<Long>(100); // Código del cuerpo del for
//    Vector<Long> tradIncremento = new Vector<Long>(100); // Código del incremento del for
//}
//TK_FER (s=sentencia {tradCuerpo.addAll($s.trad);})* TK_FPER
//{
//    $trad.add(x.ILOAD); // Cargar la variable (TK_IDENT)
//    $trad.addAll($r.trad); // Obtener valores del rango
//    $trad.add(x.ISTORE); // Guardar el índice inicial
//
//    Long inicioBucle = (long) $trad.size();
//    $trad.addAll(tradCond);
//    $trad.add(x.IFEQ);
//    Long saltoSalida = tradCuerpo.size() + tradIncremento.size() + 6L;
//    $trad.add(x.nByte(saltoSalida, 2));
//    $trad.add(x.nByte(saltoSalida, 1));
//
//    $trad.addAll(tradCuerpo);
//
//    $trad.addAll(tradIncremento);
//
//    Long saltoInicio = 0L - ($trad.size() - inicioBucle);
//    $trad.add(x.GOTO);
//    $trad.add(x.nByte(saltoInicio, 2));
//    $trad.add(x.nByte(saltoInicio, 1));
//};


bucleMent returns [Vector<Long> trad]
@init 	{
	$trad=new Vector<Long>(100);
    }
    : TK_MENTRE ee=expr {Vector<Long> trad2 = new Vector<Long>(100);}
        TK_FER (cc=sentencia {trad2.addAll($cc.trad);})+ TK_FMENTRE
    {
        if ($expr.tipus != 'Z'){
            notifyErrorListeners($expr.start, "Expr not boolean", null);
        } else {
            $trad=$ee.trad;
            $trad.add(x.IFEQ);
            Long salt=trad2.size()+6L;
            $trad.add(x.nByte(salt,2));
            $trad.add(x.nByte(salt,1));
            $trad.addAll(trad2);
            salt=0L-$trad.size();
            $trad.add(x.GOTO);
            $trad.add(x.nByte(salt,2));
            $trad.add(x.nByte(salt,1));
        }
    }
    ;

cridaAccioFuncio returns [Vector<Long> trad]
@init 	{
	$trad=new Vector<Long>(100);
    }
    : TK_IDENT TK_LPAREN expr (TK_COMA expr)* TK_RPAREN TK_SEMI
    ;


// Operacions de lectura i escriptura
operacioLecturaEscritura returns [Vector<Long> trad, char tipus]
@init 	{
	$trad=new Vector<Long>(100);
    }
    : TK_LLEGIR TK_LPAREN TK_IDENT (TK_PUNTS TK_TIPUS_BASIC)? TK_RPAREN TK_SEMI // Lectura
    {
          if (!TS.existeix($TK_IDENT.text)) {
              System.out.println("No existeix: " + $TK_IDENT.text);
              notifyErrorListeners($TK_IDENT, "Error: Variable '" + $TK_IDENT.text + "' no declarada.", null);
          } else {
              Registre r=(Registre)TS.obtenir($TK_IDENT.text);
              switch(r.getTipus()){
                    case 'F':
                        $trad.add(x.INVOKESTATIC);
                        $trad.add(x.nByte(x.mGetFloat,2));
                        $trad.add(x.nByte(x.mGetFloat,1));
                        $tipus = 'F';
                        $trad.add(x.FSTORE);
                        $trad.add(new Long(r.getAdreca()));
                        break;

                    case 'I':
                        $trad.add(x.INVOKESTATIC);
                        $trad.add(x.nByte(x.mGetInt,2));
                        $trad.add(x.nByte(x.mGetInt,1));
                        $tipus = 'I';
                        $trad.add(x.ISTORE);
                        $trad.add(new Long(r.getAdreca()));
                        break;

                    case 'Z':
                        $trad.add(x.INVOKESTATIC);
                        $trad.add(x.nByte(x.mGetBoolean,2));
                        $trad.add(x.nByte(x.mGetBoolean,1));
                        $tipus = 'Z';
                        $trad.add(x.ISTORE);
                        $trad.add(new Long(r.getAdreca()));
                        break;
              }
          }

    }
    | TK_ESCRIURE TK_LPAREN e1=expr {
        $trad=$e1.trad;
        $trad.add(x.INVOKESTATIC);
        switch($e1.tipus){
            case 'F':
                $trad.add(x.nByte(x.mPutFloat,2));
                $trad.add(x.nByte(x.mPutFloat,1));
                break;

            case 'I':
                $trad.add(x.nByte(x.mPutInt,2));
                $trad.add(x.nByte(x.mPutInt,1));
                break;

            case 'Z':
                $trad.add(x.nByte(x.mPutBoolean,2));
                $trad.add(x.nByte(x.mPutBoolean,1));
                break;

       }
    }(TK_COMA e2=expr {
        //$trad=$e2.trad;
        $trad.addAll($e2.trad);
        $trad.add(x.INVOKESTATIC);
        switch($e2.tipus){
             case 'F':
                 $trad.add(x.nByte(x.mPutFloat,2));
                 $trad.add(x.nByte(x.mPutFloat,1));
                 $trad.add(x.LDC_W);
                 $trad.add(x.nByte(saltLinia,2));
                 $trad.add(x.nByte(saltLinia,1));
                 $trad.add(x.INVOKESTATIC);
                 $trad.add(x.nByte(x.mPutString,2));
                 $trad.add(x.nByte(x.mPutString,1));
                 break;

             case 'I':
                 $trad.add(x.nByte(x.mPutInt,2));
                 $trad.add(x.nByte(x.mPutInt,1));
                 $trad.add(x.LDC_W);
                 $trad.add(x.nByte(saltLinia,2));
                 $trad.add(x.nByte(saltLinia,1));
                 $trad.add(x.INVOKESTATIC);
                 $trad.add(x.nByte(x.mPutString,2));
                 $trad.add(x.nByte(x.mPutString,1));
                 break;

             case 'Z':
                 $trad.add(x.nByte(x.mPutBoolean,2));
                 $trad.add(x.nByte(x.mPutBoolean,1));
                 $trad.add(x.LDC_W);
                 $trad.add(x.nByte(saltLinia,2));
                 $trad.add(x.nByte(saltLinia,1));
                 $trad.add(x.INVOKESTATIC);
                 $trad.add(x.nByte(x.mPutString,2));
                 $trad.add(x.nByte(x.mPutString,1));
                 break;

        }
    } )* TK_RPAREN TK_SEMI // Escritura
    | TK_ESCRIURELN TK_LPAREN e1=expr {
        $trad=$e1.trad;
        $trad.add(x.INVOKESTATIC);
        switch($e1.tipus){
            case 'F':
                $trad.add(x.nByte(x.mPutFloat,2));
                $trad.add(x.nByte(x.mPutFloat,1));
                $trad.add(x.LDC_W);
                $trad.add(x.nByte(saltLinia,2));
                $trad.add(x.nByte(saltLinia,1));
                $trad.add(x.INVOKESTATIC);
                $trad.add(x.nByte(x.mPutString,2));
                $trad.add(x.nByte(x.mPutString,1));
                break;

            case 'I':
                $trad.add(x.nByte(x.mPutInt,2));
                $trad.add(x.nByte(x.mPutInt,1));
                $trad.add(x.LDC_W);
                $trad.add(x.nByte(saltLinia,2));
                $trad.add(x.nByte(saltLinia,1));
                $trad.add(x.INVOKESTATIC);
                $trad.add(x.nByte(x.mPutString,2));
                $trad.add(x.nByte(x.mPutString,1));
                break;

            case 'Z':
                $trad.add(x.nByte(x.mPutBoolean,2));
                $trad.add(x.nByte(x.mPutBoolean,1));
                $trad.add(x.LDC_W);
                $trad.add(x.nByte(saltLinia,2));
                $trad.add(x.nByte(saltLinia,1));
                $trad.add(x.INVOKESTATIC);
                $trad.add(x.nByte(x.mPutString,2));
                $trad.add(x.nByte(x.mPutString,1));
                break;

       }
    }(TK_COMA e2=expr {
        //$trad=$e2.trad;
        $trad.addAll($e2.trad);
        $trad.add(x.INVOKESTATIC);
        switch($e2.tipus){
             case 'F':
                 $trad.add(x.nByte(x.mPutFloat,2));
                 $trad.add(x.nByte(x.mPutFloat,1));
                 $trad.add(x.LDC_W);
                 $trad.add(x.nByte(saltLinia,2));
                 $trad.add(x.nByte(saltLinia,1));
                 $trad.add(x.INVOKESTATIC);
                 $trad.add(x.nByte(x.mPutString,2));
                 $trad.add(x.nByte(x.mPutString,1));
                 break;

             case 'I':
                 $trad.add(x.nByte(x.mPutInt,2));
                 $trad.add(x.nByte(x.mPutInt,1));
                 $trad.add(x.LDC_W);
                 $trad.add(x.nByte(saltLinia,2));
                 $trad.add(x.nByte(saltLinia,1));
                 $trad.add(x.INVOKESTATIC);
                 $trad.add(x.nByte(x.mPutString,2));
                 $trad.add(x.nByte(x.mPutString,1));
                 break;

             case 'Z':
                 $trad.add(x.nByte(x.mPutBoolean,2));
                 $trad.add(x.nByte(x.mPutBoolean,1));
                 $trad.add(x.LDC_W);
                 $trad.add(x.nByte(saltLinia,2));
                 $trad.add(x.nByte(saltLinia,1));
                 $trad.add(x.INVOKESTATIC);
                 $trad.add(x.nByte(x.mPutString,2));
                 $trad.add(x.nByte(x.mPutString,1));
                 break;

        }
    } )* TK_RPAREN TK_SEMI // Escritureln
    ;

// Rang del bucle 'per'
rang returns [Vector<Long> trad, String primer, String segon]
@init 	{
	$trad=new Vector<Long>(100);
    }
    : TK_ENTER
    {
        $primer = "0";
        $segon = $TK_ENTER.text;
    }
    | id=TK_ENTER TK_COMA id2=TK_ENTER
    {
        $primer = $id.text;
        $segon = $id2.text;
    }
    ;

//                Long adrecaTemp=x.addConstant("I",$TK_ENTER.text); //afegim a la constant pool
//                $trad.add(x.LDC_W);
//                $trad.add(x.nByte(adrecaTemp,2));
//                $trad.add(x.nByte(adrecaTemp,1));

// Expressions
expr returns [Vector<Long> trad, char tipus]
@init 	{
	$trad=new Vector<Long>(100);
    }
    : e1=expr2
    {
        if ($e2.ctx == null) {
            $tipus = $e1.tipus;
            $trad = $e1.trad;
        }
    }
    ( TK_AND e2=expr2
    {
        if ($e2.ctx == null) {
            $tipus = $e1.tipus;
            $trad = $e1.trad;
        } else if (($e1.tipus != 'Z')) {
            notifyErrorListeners($e1.start, "Expr not boolean", null);
        } else if ($e2.tipus != 'Z'){
            notifyErrorListeners($e2.start, "Expr not boolean", null);
        } else {
            $trad=$e1.trad;
            $trad.addAll($e2.trad);
            $trad.add(x.IAND);
            $tipus = 'Z';
        }
    }
    | TK_OR e2=expr2
    {
        if ($e2.ctx == null) {
            $tipus = $e1.tipus;
            $trad = $e1.trad;
        } else if (($e1.tipus != 'Z')) {
            notifyErrorListeners($e1.start, "Expr not boolean", null);
        } else if ($e2.tipus != 'Z'){
            notifyErrorListeners($e2.start, "Expr not boolean", null);
        } else {
            $trad=$e1.trad;
            $trad.addAll($e2.trad);
            $trad.add(x.IOR);
            $tipus = 'Z';
        }
    })*
    | TK_NEGACIO e1=expr2 {
        if ($e1.ctx == null) {
            $tipus = $e1.tipus;
            $trad = $e1.trad;
        } else if (($e1.tipus != 'Z')) {
            notifyErrorListeners($e1.start, "Expr not boolean", null);
        } else {
            $trad=$e1.trad;
                $trad.add(x.IFEQ);
                Long salt=8L;
                $trad.add(x.nByte(salt,2));
                $trad.add(x.nByte(salt,1));
                $trad.add(x.BIPUSH);
                $trad.add(0L);
                $trad.add(x.GOTO);
                salt=5L;
                $trad.add(x.nByte(salt,2));
                $trad.add(x.nByte(salt,1));
                $trad.add(x.BIPUSH);
                $trad.add(1L);
                $tipus='Z';
        }
    }
    ;

expr2 returns [Vector<Long> trad, char tipus]
@init 	{
	$trad=new Vector<Long>(100);
    }
    : e1=expr3 {
        if ($e2.ctx == null) {
            $tipus = $e1.tipus;
            $trad = $e1.trad;
        }
        Integer opcio = 0;
    }
    ( TK_MES_GRAN e2=expr3
    {
        opcio = 1;
    }
    | TK_MES_GRAN_IG e2=expr3
    {
        opcio = 2;
    }
    | TK_MES_PETIT e2=expr3
    {
        opcio = 3;
    }
    | TK_MES_PETIT_IG e2=expr3
    {
        opcio = 4;
    }
    | TK_IGUALTAT e2=expr3
    {
        opcio = 5;
    }
    | TK_DESIGUALTAT e2=expr3
    {
        opcio = 6;
    }) ?
    {
        System.out.println("Opcio: " + opcio);
        $trad = $e1.trad;
        if ($e2.ctx == null) {
            $tipus = $e1.tipus;
        } else if ($e1.tipus != 'F' && $e2.tipus != 'F') {
            $trad.addAll($e2.trad);
            switch (opcio){
                case 1:
                    $trad.add(x.IF_ICMPGT); // Mes gran
                    break;
                case 2:
                    $trad.add(x.IF_ICMPGE); // Mes gran igual
                    break;
                case 3:
                    $trad.add(x.IF_ICMPLT); // Mes petit
                    break;
                case 4:
                    $trad.add(x.IF_ICMPLE); // Mes petit igual
                    break;
                case 5:
                    $trad.add(x.IF_ICMPEQ); // iguals
                    break;
                case 6:
                    $trad.add(x.IF_ICMPNE); // diferents
                    break;
            }
            Long salt=8L;
            $trad.add(x.nByte(salt,2));
            $trad.add(x.nByte(salt,1));
            $trad.add(x.BIPUSH);
            $trad.add(0L);
            $trad.add(x.GOTO);
            salt=5L;
            $trad.add(x.nByte(salt,2));
            $trad.add(x.nByte(salt,1));
            $trad.add(x.BIPUSH);
            $trad.add(1L);
            $tipus = 'Z';

        } else if ($e1.tipus != 'Z' && $e2.tipus != 'Z') {
            if($e1.tipus == 'I'){
                $trad.add(x.I2F);
            }

            $trad.addAll($e2.trad);
            if ($e2.tipus == 'I') {
                $trad.add(x.I2F);
            }
            $trad.add(x.FCMPL);
            switch (opcio){
                case 1:
                    $trad.add(x.IFGT); // Mes gran
                    break;
                case 2:
                    $trad.add(x.IFGE); // Mes gran igual
                    break;
                case 3:
                    $trad.add(x.IFLT); // Mes petit
                    break;
                case 4:
                    $trad.add(x.IFLE); // Mes petit igual
                    break;
                case 5:
                    $trad.add(x.IFEQ); // iguals
                    break;
                case 6:
                    $trad.add(x.IFNE); // diferents
                    break;
            }

            Long salt=8L;
            $trad.add(x.nByte(salt,2));
            $trad.add(x.nByte(salt,1));
            $trad.add(x.BIPUSH);
            $trad.add(0L);
            $trad.add(x.GOTO);
            salt=5L;
            $trad.add(x.nByte(salt,2));
            $trad.add(x.nByte(salt,1));
            $trad.add(x.BIPUSH);
            $trad.add(1L);
            $tipus = 'Z';

        } else {
            notifyErrorListeners($e1.start, "Can't evaluate bool and float", null);
        }
    }
    ;


expr3 returns [Vector<Long> trad, char tipus]
@init 	{
	$trad=new Vector<Long>(100);
    }
    : e1=expr4 {
        if ($e2.ctx == null) {
            $tipus = $e1.tipus;
            $trad = $e1.trad;
        }
    }( TK_SUMA e2=expr4 {
        if ($e2.ctx == null) {
            $tipus = $e1.tipus;
            $trad = $e1.trad;
        } else if (($e1.tipus == 'Z') || ($e2.tipus == 'Z')) {
            notifyErrorListeners($e1.start, "Expr can't be boolean", null);
        } else if (($e1.tipus == 'F') && ($e2.tipus == 'F')){
            $trad=$e1.trad;
            $trad.addAll($e2.trad);
            $trad.add(x.FADD);
            $tipus = 'F';
        } else if (($e1.tipus == 'I') && ($e2.tipus == 'F')){
            $trad=$e1.trad;
            $trad.add(x.I2F);
            $trad.addAll($e2.trad);
            $trad.add(x.FADD);
            $tipus = 'F';
        } else if (($e1.tipus == 'F') && ($e2.tipus == 'I')){
            $trad=$e1.trad;
            $trad.addAll($e2.trad);
            $trad.add(x.I2F);
            $trad.add(x.FADD);
            $tipus = 'F';
        } else {
            $trad=$e1.trad;
            $trad.addAll($e2.trad);
            $trad.add(x.IADD);
            $tipus = 'I';
        }
    } | TK_RESTA e2=expr4 {
       if ($e2.ctx == null) {
           $tipus = $e1.tipus;
           $trad = $e1.trad;
       } else if (($e1.tipus == 'Z') || ($e2.tipus == 'Z')) {
           notifyErrorListeners($e1.start, "Expr can't be boolean", null);
       } else if (($e1.tipus == 'F') && ($e2.tipus == 'F')){
           $trad=$e1.trad;
           $trad.addAll($e2.trad);
           $trad.add(x.FSUB);
           $tipus = 'F';
       } else if (($e1.tipus == 'I') && ($e2.tipus == 'F')){
           $trad=$e1.trad;
           $trad.add(x.I2F);
           $trad.addAll($e2.trad);
           $trad.add(x.FSUB);
           $tipus = 'F';
       } else if (($e1.tipus == 'F') && ($e2.tipus == 'I')){
           $trad=$e1.trad;
           $trad.addAll($e2.trad);
           $trad.add(x.I2F);
           $trad.add(x.FSUB);
           $tipus = 'F';
       } else {
           $trad=$e1.trad;
           $trad.addAll($e2.trad);
           $trad.add(x.ISUB);
           $tipus = 'I';
       }
    })*;


    expr4 returns [Vector<Long> trad, char tipus]
    @init 	{
    	$trad=new Vector<Long>(100);
    }
    : e1=expr5 {
        if ($e2.ctx == null) {
            $tipus = $e1.tipus;
            $trad = $e1.trad;
        }
    }( TK_MULTIPLICACIO e2=expr5
    {
        if (($e1.tipus == 'Z') || ($e2.tipus == 'Z')) {
            notifyErrorListeners($e1.start, "Expr can't be boolean", null);
        } else if (($e1.tipus == 'F') && ($e2.tipus == 'F')){
            $trad=$e1.trad;
            $trad.addAll($e2.trad);
            $trad.add(x.FMUL);
            $tipus = 'F';
        } else if (($e1.tipus == 'I') && ($e2.tipus == 'F')){
            $trad=$e1.trad;
            $trad.add(x.I2F);
            $trad.addAll($e2.trad);
            $trad.add(x.FMUL);
            $tipus = 'F';
        } else if (($e1.tipus == 'F') && ($e2.tipus == 'I')){
            $trad=$e1.trad;
            $trad.addAll($e2.trad);
            $trad.add(x.I2F);
            $trad.add(x.FMUL);
            $tipus = 'F';
        } else {
            $trad=$e1.trad;
            $trad.addAll($e2.trad);
            $trad.add(x.IMUL);
            $tipus = 'I';
        }
    }
    | TK_DIVISIO e2=expr5
    {
        if (($e1.tipus == 'Z') || ($e2.tipus == 'Z')) {
            notifyErrorListeners($e1.start, "Expr can't be boolean", null);
        } else if (($e1.tipus == 'F') && ($e2.tipus == 'F')){
            $trad=$e1.trad;
            $trad.addAll($e2.trad);
            $trad.add(x.FDIV);
            $tipus = 'F';
        } else if (($e1.tipus == 'I') && ($e2.tipus == 'F')){
            $trad=$e1.trad;
            $trad.add(x.I2F);
            $trad.addAll($e2.trad);
            $trad.add(x.FDIV);
            $tipus = 'F';
        } else if (($e1.tipus == 'F') && ($e2.tipus == 'I')){
            $trad=$e1.trad;
            $trad.addAll($e2.trad);
            $trad.add(x.I2F);
            $trad.add(x.FDIV);
            $tipus = 'F';
        } else {
            $trad=$e1.trad;
            $trad.add(x.I2F);
            $trad.addAll($e2.trad);
            $trad.add(x.I2F);
            $trad.add(x.FDIV);
            $tipus = 'F';
        }
    }
    | TK_DIV_ENTERA e2=expr5
    {
        if ($e2.ctx == null) {
            $tipus = $e1.tipus;
            $trad = $e1.trad;
        } else if (($e1.tipus == 'Z') || ($e2.tipus == 'Z') || ($e1.tipus == 'F') || ($e2.tipus == 'F')) {
            notifyErrorListeners($e1.start, "Expr must take Int", null);
        } else {
            $trad=$e1.trad;
            $trad.addAll($e2.trad);
            $trad.add(x.IDIV);
            $tipus = 'I';
        }
    }
    | TK_MODUL e2=expr5{
        if ($e2.ctx == null) {
            $tipus = $e1.tipus;
            $trad = $e1.trad;
        } else if (($e1.tipus == 'Z') || ($e2.tipus == 'Z') || ($e1.tipus == 'F') || ($e2.tipus == 'F')) {
            notifyErrorListeners($e1.start, "Expr must take Int", null);
        } else {
            $trad=$e1.trad;
            $trad.addAll($e2.trad);
            $trad.add(x.IREM);
            $tipus = 'I';
        }
    })*;

expr5 returns [Vector<Long> trad, char tipus]
@init 	{
	$trad=new Vector<Long>(100);
    }
    : exprbase {
        $tipus = $exprbase.tipus;
        $trad = $exprbase.trad;
    }
    | (TK_NEGACIO ee=exprbase) {
        if ($exprbase.tipus != 'Z') {
            notifyErrorListeners($exprbase.start, "Expr must be boolean", null);
        } else {
            $trad=$ee.trad;
            $trad.add(x.IFEQ);
            Long salt=8L;
            $trad.add(x.nByte(salt,2));
            $trad.add(x.nByte(salt,1));
            $trad.add(x.BIPUSH);
            $trad.add(0L);
            $trad.add(x.GOTO);
            salt=5L;
            $trad.add(x.nByte(salt,2));
            $trad.add(x.nByte(salt,1));
            $trad.add(x.BIPUSH);
            $trad.add(1L);
            $tipus='Z';
        }
    }
    | (TK_MENYS_UNARI exprbase) {
        if ($exprbase.tipus != 'F' && $exprbase.tipus != 'I') {
            notifyErrorListeners($exprbase.start, "Expr must be Int or Float", null);
        } else {
            if ( $exprbase.tipus != 'F') {
                $trad=$exprbase.trad;
                $trad.add(x.F2I);
                $trad.add(x.INEG);
                $tipus = 'I';
            }
            else{
                $trad=$exprbase.trad;
                $trad.add(x.INEG);
                $tipus = 'I';
            }
        }
    }
    ;


exprbase returns [Vector<Long> trad, char tipus]
@init 	{
	$trad=new Vector<Long>(100);
    }
    : TK_IDENT
    {
        if (!TS.existeix($TK_IDENT.text)) {
            System.out.println("No existeix: " + $TK_IDENT.text);
            notifyErrorListeners($TK_IDENT, "Error: Variable '" + $TK_IDENT.text + "' no declarada.", null);
        } else {
            Registre r=(Registre)TS.obtenir($TK_IDENT.text);
            if (r.getTipus() == 'I' | r.getTipus() == 'Z'){
                $trad.add(x.ILOAD);
            } else {
                $trad.add(x.FLOAD);
            }
            $trad.add(new Long(r.getAdreca()));
            System.out.println("Existeix molt: " + $TK_IDENT.text);
            $tipus=r.getTipus();
        }
    }
    | TK_LPAREN expr TK_RPAREN {
        $tipus = $expr.tipus;
        $trad = $expr.trad;
    }
    | cridaAccioFuncio//funcio
    | TK_IDENT TK_LCLAU expr3 TK_RCLAU TK_LCLAU expr3 TK_RCLAU //Acces vector
    | TK_IDENT TK_PUNT TK_IDENT //Tupla
    | TK_ENTER{
        $tipus='I';
        Long adrecaTemp=x.addConstant("I",$TK_ENTER.text); //afegim a la constant pool
        $trad.add(x.LDC_W);
        $trad.add(x.nByte(adrecaTemp,2));
        $trad.add(x.nByte(adrecaTemp,1));
    }
    | TK_REAL {
        $tipus='F';
        Long adrecaTemp=x.addConstant("F",$TK_REAL.text); //afegim a la constant pool
        $trad.add(x.LDC_W);
        $trad.add(x.nByte(adrecaTemp,2));
        $trad.add(x.nByte(adrecaTemp,1));
    }
    | TK_BOLEA {
        $tipus='Z';
        System.out.println("Text bool: " + $TK_BOLEA.text);
        Long adrecaTemp=x.addConstant("Z",$TK_BOLEA.text);
        $trad.add(x.LDC_W);
        $trad.add(x.nByte(adrecaTemp,2));
        $trad.add(x.nByte(adrecaTemp,1));
    }
    ;
