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
T29 : 'var' ;
T30 : '=' ;
T31 : 'array' ;
T32 : '[' ;
T33 : ']' ;
T34 : 'int' ;
T35 : 'bool' ;
T36 : 'float' ;
T37 : 'string' ;
T38 : 'calc' ;
T39 : '==' ;
T40 : '+' ;

// $ANTLR src "../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g" 2123
RULE_NUMBER : ('0'..'9')* ('.' ('0'..'9')+)?;

// $ANTLR src "../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g" 2125
RULE_INT : '$$$don\'t use this anymore$$$';

// $ANTLR src "../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g" 2127
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g" 2129
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g" 2131
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g" 2133
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g" 2135
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g" 2137
RULE_ANY_OTHER : .;


