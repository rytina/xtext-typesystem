lexer grammar InternalExprDemo;
@header {
package expr.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T12 : 'model' ;
T13 : 'using' ;
T14 : '.' ;
T15 : '*' ;
T16 : 'function' ;
T17 : '(' ;
T18 : ')' ;
T19 : '{' ;
T20 : '}' ;
T21 : ',' ;
T22 : 'return' ;
T23 : ';' ;
T24 : 'assert' ;
T25 : 'is' ;
T26 : ':' ;
T27 : 'enum' ;
T28 : 'var' ;
T29 : '=' ;
T30 : 'array' ;
T31 : '[' ;
T32 : ']' ;
T33 : 'int' ;
T34 : 'bool' ;
T35 : 'float' ;
T36 : 'string' ;
T37 : 'calc' ;
T38 : '==' ;
T39 : '+' ;
T40 : 'tested' ;
T41 : 'readonly' ;

// $ANTLR src "../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g" 5117
RULE_NUMBER : ('0'..'9')* ('.' ('0'..'9')+)?;

// $ANTLR src "../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g" 5119
RULE_INT : '$$$don\'t use this anymore$$$';

// $ANTLR src "../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g" 5121
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g" 5123
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g" 5125
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g" 5127
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g" 5129
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g" 5131
RULE_ANY_OTHER : .;


