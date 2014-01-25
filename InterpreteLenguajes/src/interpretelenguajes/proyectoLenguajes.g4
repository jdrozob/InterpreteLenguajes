/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar proyectoLenguajes;

parse
 : block EOF
 ;

block
 : stat*
 ;

stat
 : assignment
 | if_stat
 | for_stat
 | print_stat
 ;

assignment
 : ID ASSIGN expr SCOL
 ;

if_stat
 : IF condition_block (ELSEIF condition_block)* (ELSE stat_block)?
 ;

condition_block
 : expr stat_block
 ;

stat_block
 : OBRACE block CBRACE 
 ;

for_stat
 : FOR ID IN RANGE OPAR INT COMA INT CPAR stat_block
 ;

print_stat
 : PRINT (ID|STRING) (PLUS(ID|STRING))* SCOL  
 ;

expr
 : expr PLUS expr             #plusExpr
 | expr MINUS expr            #minusExpr
 | expr LTEQ expr             #lteqExpr
 | expr GTEQ expr             #gteqExpr
 | expr LT expr               #ltExpr
 | expr GT expr               #gtExpr
 | expr NEQ expr              #neqExpr
 | expr EQ expr               #eqExpr
 | atom                       #atomExpr
 ;

atom
 : OPAR expr CPAR 	#parExpr
 | (INT | FLOAT)  	#numberAtom
 | (TRUE | FALSE) 	#booleanAtom
 | ID             	#idAtom
 | STRING         	#stringAtom
 ;

ASSIGN : '=';
SCOL : ';';
OPAR : '(';
CPAR : ')';
OBRACE : '{';
CBRACE : '}';
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

