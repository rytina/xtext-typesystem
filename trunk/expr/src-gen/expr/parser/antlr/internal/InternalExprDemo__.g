lexer grammar InternalExprDemo;
@header {
package expr.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T12 : 'model' ;
T13 : 'using' ;
T14 : '.' ;
T15 : '*' ;
T16 : 'function' ;
T17 : '(' ;
T18 : ',' ;
T19 : ')' ;
T20 : '{' ;
T21 : '}' ;
T22 : 'return' ;
T23 : ';' ;
T24 : 'assert' ;
T25 : 'error' ;
T26 : 'enum' ;
T27 : 'var' ;
T28 : '=' ;
T29 : 'array' ;
T30 : '[' ;
T31 : ']' ;
T32 : 'int' ;
T33 : 'bool' ;
T34 : 'float' ;
T35 : 'string' ;
T36 : 'calc' ;
T37 : '==' ;
T38 : '+' ;

// $ANTLR src "../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g" 2074
RULE_NUMBER : ('0'..'9')* ('.' ('0'..'9')+)?;

// $ANTLR src "../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g" 2076
RULE_INT : '$$$don\'t use this anymore$$$';

// $ANTLR src "../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g" 2078
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g" 2080
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g" 2082
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g" 2084
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g" 2086
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g" 2088
RULE_ANY_OTHER : .;


