/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar proyectoLenguajes;

programa
 : bloque EOF
 ;

bloque
 : sentencia*
 ;

sentencia
 : asignacion
 | sent_if
 | sentencia_for
 | impresion
 ;

asignacion
 : ID ASIGN expresion SCOL
 ;

sent_if
 : IF condicion_bloque (ELSEIF condicion_bloque)* (ELSE bloque_sentencias)?
 ;

condicion_bloque
 : expresion bloque_sentencias
 ;

bloque_sentencias
 : ALLAV bloque CLLAV 
 ;

sentencia_for
 : FOR ID IN RANGE APAR INT COMA INT CPAR bloque_sentencias
 ;

impresion
 : PRINT (ID|STRING) (PLUS(ID|STRING))* SCOL  
 ;

expresion
 : expresion PLUS expresion             #plusExpr
 | expresion MINUS expresion            #minusExpr
 | expresion LTEQ expresion             #lteqExpr
 | expresion GTEQ expresion             #gteqExpr
 | expresion LT expresion               #ltExpr
 | expresion GT expresion               #gtExpr
 | expresion NEQ expresion              #neqExpr
 | expresion EQ expresion               #eqExpr
 | atom                       		#atomExpr
 ;

atom
 : APAR expresion CPAR 	#parExpr
 | (INT | FLOAT)  	#numberAtom
 | (TRUE | FALSE) 	#booleanAtom
 | ID             	#idAtom
 | STRING         	#stringAtom
 ;

ASIGN : '=';
SCOL : ';';
APAR : '(';
CPAR : ')';
ALLAV : '{';
CLLAV : '}';
COMA : ',';

IF: 'if';    
ELSEIF: 'elif';
ELSE: 'else';
FOR : 'for';
IN : 'in';
RANGE : 'range';
PRINT : 'print';
TRUE : 'true';
FALSE : 'false';

EQ : '==';
NEQ : '!=';
GT : '>';
LT : '<';
GTEQ : '>=';
LTEQ : '<=';
PLUS : '+';
MINUS : '-';

ID
 : [a-zA-Z_] [a-zA-Z_0-9]*
 ;

INT :	'0'..'9'+
    ;
    
FLOAT
    :   ('0'..'9')+ '.' ('0'..'9')* 
    |   '.' ('0'..'9')+ 
    ;

STRING
    :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
    ;

ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UNICODE_ESC
    |   OCTAL_ESC
    ;

OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;
    
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

