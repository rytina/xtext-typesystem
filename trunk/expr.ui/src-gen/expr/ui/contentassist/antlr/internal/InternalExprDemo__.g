lexer grammar InternalExprDemo;
@header {
package expr.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T12 : 'model' ;
T13 : 'assert' ;
T14 : ';' ;
T15 : 'enum' ;
T16 : '{' ;
T17 : '}' ;
T18 : 'var' ;
T19 : '=' ;
T20 : 'array' ;
T21 : '[' ;
T22 : ']' ;
T23 : 'int' ;
T24 : 'bool' ;
T25 : 'float' ;
T26 : 'string' ;
T27 : 'calc' ;
T28 : '==' ;
T29 : '+' ;
T30 : '*' ;
T31 : '.' ;

// $ANTLR src "../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g" 3415
RULE_NUMBER : ('0'..'9')* ('.' ('0'..'9')+)?;

// $ANTLR src "../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g" 3417
RULE_INT : '$$$don\'t use this anymore$$$';

// $ANTLR src "../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g" 3419
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g" 3421
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g" 3423
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g" 3425
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g" 3427
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g" 3429
RULE_ANY_OTHER : .;


