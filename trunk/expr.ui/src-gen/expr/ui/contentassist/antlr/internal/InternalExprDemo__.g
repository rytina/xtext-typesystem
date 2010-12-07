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

// $ANTLR src "../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g" 4930
RULE_NUMBER : ('0'..'9')* ('.' ('0'..'9')+)?;

// $ANTLR src "../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g" 4932
RULE_INT : '$$$don\'t use this anymore$$$';

// $ANTLR src "../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g" 4934
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g" 4936
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g" 4938
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g" 4940
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g" 4942
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g" 4944
RULE_ANY_OTHER : .;


