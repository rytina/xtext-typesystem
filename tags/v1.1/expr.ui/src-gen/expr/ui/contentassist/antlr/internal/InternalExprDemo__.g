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

// $ANTLR src "../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g" 2636
RULE_NUMBER : ('0'..'9')* ('.' ('0'..'9')+)?;

// $ANTLR src "../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g" 2638
RULE_INT : '$$$don\'t use this anymore$$$';

// $ANTLR src "../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g" 2640
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g" 2642
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g" 2644
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g" 2646
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g" 2648
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g" 2650
RULE_ANY_OTHER : .;


