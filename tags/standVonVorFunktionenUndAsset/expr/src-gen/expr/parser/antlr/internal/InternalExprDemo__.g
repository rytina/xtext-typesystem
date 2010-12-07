lexer grammar InternalExprDemo;
@header {
package expr.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T12 : 'model' ;
T13 : 'assert' ;
T14 : 'error' ;
T15 : 'enum' ;
T16 : '{' ;
T17 : '}' ;
T18 : 'var' ;
T19 : '=' ;
T20 : ';' ;
T21 : 'array' ;
T22 : '[' ;
T23 : ']' ;
T24 : 'int' ;
T25 : 'bool' ;
T26 : 'float' ;
T27 : 'string' ;
T28 : 'calc' ;
T29 : '==' ;
T30 : '+' ;
T31 : '*' ;
T32 : '.' ;

// $ANTLR src "../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g" 1547
RULE_NUMBER : ('0'..'9')* ('.' ('0'..'9')+)?;

// $ANTLR src "../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g" 1549
RULE_INT : '$$$don\'t use this anymore$$$';

// $ANTLR src "../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g" 1551
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g" 1553
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g" 1555
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g" 1557
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g" 1559
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g" 1561
RULE_ANY_OTHER : .;


