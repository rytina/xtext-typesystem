lexer grammar InternalExprDemo;
@header {
package expr.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T12 : 'tested' ;
T13 : 'model' ;
T14 : 'using' ;
T15 : '.' ;
T16 : '*' ;
T17 : 'function' ;
T18 : '(' ;
T19 : ',' ;
T20 : ')' ;
T21 : '{' ;
T22 : '}' ;
T23 : 'return' ;
T24 : ';' ;
T25 : 'assert' ;
T26 : 'is' ;
T27 : ':' ;
T28 : 'enum' ;
T29 : 'readonly' ;
T30 : 'var' ;
T31 : '=' ;
T32 : 'array' ;
T33 : '[' ;
T34 : ']' ;
T35 : 'int' ;
T36 : 'bool' ;
T37 : 'float' ;
T38 : 'string' ;
T39 : 'calc' ;
T40 : '==' ;
T41 : '+' ;

// $ANTLR src "../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g" 2144
RULE_NUMBER : ('0'..'9')* ('.' ('0'..'9')+)?;

// $ANTLR src "../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g" 2146
RULE_INT : '$$$don\'t use this anymore$$$';

// $ANTLR src "../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g" 2148
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g" 2150
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g" 2152
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g" 2154
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g" 2156
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g" 2158
RULE_ANY_OTHER : .;


