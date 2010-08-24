lexer grammar InternalExprDemo;
@header {
package expr.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T12 : 'enum' ;
T13 : '{' ;
T14 : '}' ;
T15 : 'var' ;
T16 : ';' ;
T17 : 'array' ;
T18 : '[' ;
T19 : ']' ;
T20 : 'int' ;
T21 : 'bool' ;
T22 : 'float' ;
T23 : 'calc' ;
T24 : '=' ;
T25 : '+' ;
T26 : '*' ;
T27 : '.' ;

// $ANTLR src "../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g" 1231
RULE_NUMBER : ('0'..'9')* ('.' ('0'..'9')+)?;

// $ANTLR src "../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g" 1233
RULE_INT : '$$$don\'t use this anymore$$$';

// $ANTLR src "../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g" 1235
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g" 1237
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g" 1239
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g" 1241
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g" 1243
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g" 1245
RULE_ANY_OTHER : .;


