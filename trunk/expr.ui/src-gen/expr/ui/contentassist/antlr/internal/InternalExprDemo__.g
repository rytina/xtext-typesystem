lexer grammar InternalExprDemo;
@header {
package expr.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T12 : 'enum' ;
T13 : '{' ;
T14 : '}' ;
T15 : 'var' ;
T16 : ';' ;
T17 : '=' ;
T18 : 'array' ;
T19 : '[' ;
T20 : ']' ;
T21 : 'int' ;
T22 : 'bool' ;
T23 : 'float' ;
T24 : 'string' ;
T25 : 'calc' ;
T26 : '+' ;
T27 : '*' ;
T28 : '.' ;

// $ANTLR src "../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g" 2928
RULE_NUMBER : ('0'..'9')* ('.' ('0'..'9')+)?;

// $ANTLR src "../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g" 2930
RULE_INT : '$$$don\'t use this anymore$$$';

// $ANTLR src "../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g" 2932
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g" 2934
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g" 2936
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g" 2938
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g" 2940
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g" 2942
RULE_ANY_OTHER : .;


