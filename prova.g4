// Practica desenvolupada per Jan Puig i Arnau Costa.

// Ens trobem amb un error sobre que en l'arbre de parsing tot s'identifica únicament com a un token.

grammar prova;

// Regla sintactica
inici : estructuraGeneral EOF;
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
TK_PC_PROGRAMA: 'programa'  {System.out.println("he reconegut programa")};
TK_PC_FPROGRAMA: 'fprograma'  ;
TK_PC_PERIODE: 'periode';
//TK_PC_PER: 'per';
//TK_PC_SI: 'si';
// TK_MESGRAN: '>';

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

TK_MIDA: 'mida';

TK_IDENT : LLETRA (LLETRA | DIGIT | '0' | '_' ) * ;


//Estructura Basica
estructuraGeneral
    :
        tipusDecl? accioFuncioDecl? TK_PC_PROGRAMA blocVariables? sentencia+ TK_PC_FPROGRAMA
    ;


// Bloc de declaració de tipus
tipusDecl
    : TK_TIPUS novaDefinicio+ TK_FTIPUS
    ;

novaDefinicio
    : TK_IDENT TK_PUNTS TK_VECTOR TK_TIPUS_BASIC TK_ENTER TK_ENTER (TK_COMA TK_ENTER)* TK_SEMI # DefinicioVector
    | TK_IDENT TK_PUNTS TK_TUPLA TK_LBRACKET campTupla+ TK_RBRACKET TK_FTUPLA # DefinicioTupla
    ;

campTupla
    : TK_IDENT TK_PUNTS TK_TIPUS_BASIC TK_SEMI
    ;

// Bloc d'accions i funcions
accioFuncioDecl
    : accioDecl
    | funcioDecl
    ;

accioDecl
    : TK_ACCIO TK_IDENT (TK_LPAREN parametresFormals? TK_RPAREN)? blocVariables? sentencia* TK_FACCIO
    ;

funcioDecl
    : TK_FUNCIO TK_IDENT (TK_LPAREN parametresFormals? TK_RPAREN)? TK_RETORNA TK_TIPUS_BASIC blocVariables? sentencia* TK_RETORNA expr TK_FFUNCIO
    ;

parametresFormals
    : TK_PARAM (TK_COMA TK_PARAM)*
    ;


// Bloc de declaració de variables
blocVariables
    : TK_VARIABLES declaracioVariable* TK_FVARIABLES
    ;

declaracioVariable
    : TK_IDENT (TK_COMA TK_IDENT)* TK_PUNTS tipusDefinit TK_SEMI
    ;


tipusDefinit
    : TK_TIPUS_BASIC
    | TK_IDENT
    ;

// Estructures de control sentencia
sentencia
    : assignacio
    | condicional
    | buclePer
    | bucleMent
    | cridaAccio
    | operacioLecturaEscritura
    ;

assignacio
    : TK_IDENT TK_ASSIGNACIO expr TK_SEMI
    ;

condicional
    : TK_SI expr TK_LLAVORS sentencia* (TK_ALTRAMENT expr TK_LLAVORS sentencia*)* (TK_ALTRAMENT sentencia*)? TK_FSI
    ;

buclePer
    : TK_PER TK_IDENT TK_EN rang TK_FER sentencia* TK_FPER
    ;

bucleMent
    : TK_MENTRE expr TK_FER sentencia+ TK_FMENTRE
    ;

cridaAccio
    : TK_IDENT TK_LPAREN expr (TK_COMA expr)* TK_RPAREN TK_SEMI
    ;

// Operacions de lectura i escriptura
operacioLecturaEscritura
    : TK_LLEGIR TK_LPAREN TK_IDENT (TK_PUNTS TK_TIPUS_BASIC)? TK_RPAREN TK_SEMI # Lectura
    | TK_ESCRIURE TK_LPAREN expr (TK_COMA expr)* TK_RPAREN TK_SEMI # Escritura
    | TK_ESCRIURE TK_LN TK_LPAREN (expr (TK_COMA expr)*)? TK_RPAREN TK_SEMI # EscrituraLn
    ;

// Rang del bucle 'per'
rang
    : TK_ENTER TK_DOSPUNTS TK_ENTER
    | TK_ENTER
    ;

// Expressions
expr
    : expr2 ( ( TK_AND | TK_OR | TK_NEGACIO ) expr2)*
    ;

expr2
    : expr3 ( ( TK_IGUALTAT | TK_MES_GRAN | TK_MES_GRAN_IG | TK_MES_PETIT | TK_MES_PETIT_IG | TK_DESIGUALTAT) expr3) *
    ;

expr3
    : expr4 ( ( TK_SUMA | TK_RESTA ) expr4)*
    ;

expr4
    : expr5 ( ( TK_MULTIPLICACIO | TK_DIVISIO | TK_MODUL ) expr5)*
    ;

expr5
    : exprbase ( ( TK_NEGACIO | TK_MENYS_UNARI ) exprbase)*
    ;

exprbase
    : TK_TIPUS_BASIC
    | TK_IDENT                // Identificador
    | TK_LPAREN expr TK_RPAREN
    | cridaAccio //funcio
    | TK_IDENT TK_LCLAU expr3 TK_RCLAU TK_LCLAU expr3 TK_RCLAU //Acces vector
    | TK_IDENT TK_PUNT TK_IDENT //Tupla
    ;
