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
TK_REAL : [+-]? DIGIT+ ('.' DIGIT+)? ([eE] [+-]? DIGIT+)? ; // Real
TK_BOLEA: 'true' | 'false'; // Bolea
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
TK_LN: 'ln';
TK_PER: 'per';
TK_ID: 'id';
TK_FINS: 'fins';
TK_FER: 'fer';
TK_FPER: 'fper';
TK_MENTRE: 'mentre';
TK_FMENTRE: 'fmentre';

TK_LLEGIR: 'llegir';
TK_ESCRIURE: 'escriure';

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
	$trad=new Vector<Long>(10);
    }
    : TK_TIPUS novaDefinicio+ TK_FTIPUS
    ;

novaDefinicio returns [Vector<Long> trad]
@init 	{
	$trad=new Vector<Long>(10);
    }
    : TK_IDENT TK_PUNTS TK_VECTOR TK_TIPUS_BASIC TK_ENTER TK_ENTER (TK_COMA TK_ENTER)* TK_SEMI # DefinicioVector
    | TK_IDENT TK_PUNTS TK_TUPLA TK_LBRACKET campTupla+ TK_RBRACKET TK_FTUPLA # DefinicioTupla
    ;

campTupla returns [Vector<Long> trad]
@init 	{
	$trad=new Vector<Long>(10);
    }
    : TK_IDENT TK_PUNTS TK_TIPUS_BASIC TK_SEMI
    ;

// Bloc d'accions i funcions
accioFuncioDecl returns [Vector<Long> trad] //TODO
@init 	{
	$trad=new Vector<Long>(10);
    }
    : accioDecl+
    | funcioDecl+
    ;

accioDecl returns [Vector<Long> trad]
@init 	{
	$trad=new Vector<Long>(10);
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
	$trad=new Vector<Long>(10);
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
	$trad=new Vector<Long>(10);
    }
    : TK_PARAM (TK_COMA TK_PARAM)*
    ;


// Bloc de declaració de variables
blocVariables returns [Vector<Long> trad]
@init 	{
	$trad=new Vector<Long>(10);
    }
    : TK_VARIABLES declaracioVariable* TK_FVARIABLES
    ;

declaracioVariable returns [Vector<Long> trad]
@init 	{
	$trad=new Vector<Long>(10);
    }
    : id1=TK_IDENT (TK_COMA id2+=TK_IDENT)* TK_PUNTS tipusDefinit TK_SEMI
    {
        // Comprovem si la variable ja ha estat declarada
        if (TS.existeix($id1.text)) {
            notifyErrorListeners($id1, "Error: Variable ja declarada.", null);
        } else {
            int adreca = contadorVariables;
            TS.inserir($id1.text, new Registre("variable", $tipusDefinit.tipus, adreca));
            contadorVariables++;
        }

        // Recorrem totes les variables separades per coma
        for (Token identificador : $id2) {
            System.out.println("Identificadors: " + identificador.getText());
            if (TS.existeix(identificador.getText())) {
                notifyErrorListeners(identificador, "Error: Variable '" + identificador.getText() + "' ja declarada.", null);
            } else {
                TS.inserir(identificador.getText(), new Registre("variable", $tipusDefinit.tipus));
            }
        }
    }
    ;



tipusDefinit returns [Vector<Long> trad, char tipus]
@init 	{
	$trad=new Vector<Long>(10);
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
	$trad=new Vector<Long>(10);
    }
    : assignacio
    | condicional
    | buclePer
    | bucleMent
    | cridaAccioFuncio
    | operacioLecturaEscritura
    ;

assignacio returns [Vector<Long> trad]
@init 	{
	$trad=new Vector<Long>(10);
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
            }
        }
    }
    ;

condicional returns [Vector<Long> trad]
@init 	{
	$trad=new Vector<Long>(10);
    }
    : TK_SI e1=expr TK_LLAVORS sentencia* (TK_ALTRAMENT e2+=expr TK_LLAVORS sentencia*)* (TK_ALTRAMENT sentencia*)? TK_FSI
    {
        System.out.println("Primer: " + $e1.tipus);
        if($e1.tipus != 'Z'){
            notifyErrorListeners($e1.start, "Expr not boolean", null);
        }
        for (ExprContext ctx : $e2) {
            System.out.println("Segon: " + ctx.tipus);
            if(ctx.tipus != 'Z'){
                notifyErrorListeners(ctx.start, "Expr not boolean", null);
            }
        }
    }
    ;

buclePer returns [Vector<Long> trad]
@init 	{
	$trad=new Vector<Long>(10);
    }
    : TK_PER TK_IDENT TK_EN r=rang TK_FER sentencia* TK_FPER
    ;

bucleMent returns [Vector<Long> trad]
@init 	{
	$trad=new Vector<Long>(10);
    }
    : TK_MENTRE expr TK_FER sentencia+ TK_FMENTRE
    {
        if ($expr.tipus != 'Z'){
            notifyErrorListeners($expr.start, "Expr not boolean", null);
        }
    }
    ;

cridaAccioFuncio returns [Vector<Long> trad]
@init 	{
	$trad=new Vector<Long>(10);
    }
    : TK_IDENT TK_LPAREN expr (TK_COMA expr)* TK_RPAREN TK_SEMI
    ;


// Operacions de lectura i escriptura
operacioLecturaEscritura returns [Vector<Long> trad]
@init 	{
	$trad=new Vector<Long>(10);
    }
    : TK_LLEGIR TK_LPAREN TK_IDENT (TK_PUNTS TK_TIPUS_BASIC)? TK_RPAREN TK_SEMI // Lectura
    | TK_ESCRIURE TK_LPAREN expr (TK_COMA expr)* TK_RPAREN TK_SEMI // Escritura
    | TK_ESCRIURE TK_LN TK_LPAREN (expr (TK_COMA expr)*)? TK_RPAREN TK_SEMI // EscrituraLn
    ;

// Rang del bucle 'per'
rang returns [Vector<Long> trad, Vector<Long> trad]
@init 	{
	$trad=new Vector<Long>(10);
    }
    : TK_ENTER (TK_COMA TK_ENTER)?
    ;

// Expressions
expr returns [Vector<Long> trad, char tipus]
@init 	{
	$trad=new Vector<Long>(10);
    }
    : e1=expr2 ( ( TK_AND | TK_OR | TK_NEGACIO ) e2=expr2)*
    {
        if ($e2.ctx == null) {
            $tipus = $e1.tipus;
        } else if (($e1.tipus != 'Z')) {
            notifyErrorListeners($e1.start, "Expr not boolean", null);
        } else if ($e2.tipus != 'Z'){
            notifyErrorListeners($e2.start, "Expr not boolean", null);
        } else {
            $tipus = 'Z';
        }
    }
    ;

expr2 returns [Vector<Long> trad, char tipus]
@init 	{
	$trad=new Vector<Long>(10);
    }
    : e1=expr3 ( ( TK_MES_GRAN | TK_MES_GRAN_IG | TK_MES_PETIT | TK_MES_PETIT_IG) e2=expr3) *
    {
        if ($e2.ctx == null) {
            $tipus = $e1.tipus;
        } else if ($e1.tipus != 'Z') {
            notifyErrorListeners($e1.start, "Expr not boolean", null);
        } else if ($e2.tipus != 'Z') {
            notifyErrorListeners($e2.start, "Expr not boolean", null);
        } else if (($e1.tipus == $e2.tipus)) {
            $tipus = $e1.tipus;
        } else if (($e1.tipus == 'F' && $e2.tipus == 'I') || ($e1.tipus == 'I' && $e2.tipus == 'F')){
            $tipus = 'F';
        }
    }
    | e1=expr3 ( ( TK_IGUALTAT | TK_DESIGUALTAT) e2=expr3) *
    {
        if ($e2.ctx == null) {
            $tipus = $e1.tipus;
        } else if (($e1.tipus == $e2.tipus)) {
            $tipus = $e1.tipus;
        } else if (($e1.tipus == 'F' && $e2.tipus == 'I') || ($e1.tipus == 'I' && $e2.tipus == 'F')){
            $tipus = 'F';
        } else {
            notifyErrorListeners($e1.start, "Not matching expresions for comparing", null);
        }
    }
    ;


expr3 returns [Vector<Long> trad, char tipus]
@init 	{
	$trad=new Vector<Long>(10);
    }
    : e1=expr4 ( ( TK_SUMA | TK_RESTA ) e2=expr4 )*
    {
        if ($e2.ctx == null) {
            $tipus = $e1.tipus;
        } else if (($e1.tipus == 'Z') || ($e2.tipus == 'Z')) {
            notifyErrorListeners($e1.start, "Expr can't be boolean", null);
        } else if (($e1.tipus == 'F') || ($e2.tipus == 'F') ){
            $tipus = 'F';
        } else {
            $tipus = 'I';
        }
    }
    ;


expr4 returns [Vector<Long> trad, char tipus]
@init 	{
	$trad=new Vector<Long>(10);
    }
    : e1=expr5 (( TK_MULTIPLICACIO {

    } | TK_DIVISIO {

    } | TK_MODUL {

    }) e2=expr5
    {
        if ($e2.ctx == null) {
            $tipus = $e1.tipus;
        } else if (($e1.tipus == 'Z') || ($e2.tipus == 'Z')) {
            notifyErrorListeners($e1.start, "Expr can't be boolean", null);
        } else if (($e1.tipus == 'F') || ($e2.tipus == 'F') ){
            $tipus = 'F';
        } else {
            $tipus = 'I';
        }
    })*
    ;



expr5 returns [Vector<Long> trad, char tipus]
@init 	{
	$trad=new Vector<Long>(10);
    }
    : exprbase {
        $tipus = $exprbase.tipus;
        $trad = $expr.trad;
    }
    | (TK_NEGACIO exprbase) {
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
            // TODO Fer que traduccio sigui 0 - exprebase.trad
        }
    }
    ;


exprbase returns [Vector<Long> trad, char tipus]
@init 	{
	$trad=new Vector<Long>(10);
    }
    : TK_IDENT
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
    | TK_LPAREN expr TK_RPAREN {
        $tipus = $expr.tipus;
        $trad = $expr.trad;
    }
    | cridaAccioFuncio//funcio
    | TK_IDENT TK_LCLAU expr3 TK_RCLAU TK_LCLAU expr3 TK_RCLAU //Acces vector
    | TK_IDENT TK_PUNT TK_IDENT //Tupla
    | TK_ENTER{
        $tipus='I';
        Long adrecaTemp=x.addConstant("I",$TK_ENTER.text): //afegim a la constant pool
        trad.add(x.LDC_W);
        trad.add(x.nByte(adrecaTemp,2));
        trad.add(x.nByte(adrecaTemp,1));
    }
    | TK_REAL {
        $tipus='F';
        Long adrecaTemp=x.addConstant("F",$TK_REAL.text): //afegim a la constant pool
        trad.add(x.LDC_W);
        trad.add(x.nByte(adrecaTemp,2));
        trad.add(x.nByte(adrecaTemp,1));
    }
    | TK_BOLEA {
        $tipus='Z';
        Long adrecaTemp=x.addConstant("Z",$TK_BOLEA.text): //afegim a la constant pool
        trad.add(x.LDC_W);
        trad.add(x.nByte(adrecaTemp,2));
        trad.add(x.nByte(adrecaTemp,1));
    }
    ;
