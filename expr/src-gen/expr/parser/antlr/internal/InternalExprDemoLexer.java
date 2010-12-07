package expr.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalExprDemoLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int RULE_ANY_OTHER=11;
    public static final int T29=29;
    public static final int T28=28;
    public static final int T27=27;
    public static final int T26=26;
    public static final int T25=25;
    public static final int Tokens=41;
    public static final int T24=24;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=9;
    public static final int T23=23;
    public static final int T40=40;
    public static final int T22=22;
    public static final int T21=21;
    public static final int T20=20;
    public static final int RULE_ML_COMMENT=8;
    public static final int RULE_STRING=6;
    public static final int RULE_NUMBER=5;
    public static final int RULE_INT=7;
    public static final int T38=38;
    public static final int T37=37;
    public static final int T12=12;
    public static final int T13=13;
    public static final int T39=39;
    public static final int T14=14;
    public static final int T34=34;
    public static final int RULE_WS=10;
    public static final int T15=15;
    public static final int T33=33;
    public static final int T16=16;
    public static final int T36=36;
    public static final int T17=17;
    public static final int T35=35;
    public static final int T18=18;
    public static final int T30=30;
    public static final int T19=19;
    public static final int T32=32;
    public static final int T31=31;
    public InternalExprDemoLexer() {;} 
    public InternalExprDemoLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g"; }

    // $ANTLR start T12
    public final void mT12() throws RecognitionException {
        try {
            int _type = T12;
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:10:5: ( 'tested' )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:10:7: 'tested'
            {
            match("tested"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T12

    // $ANTLR start T13
    public final void mT13() throws RecognitionException {
        try {
            int _type = T13;
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:11:5: ( 'model' )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:11:7: 'model'
            {
            match("model"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T13

    // $ANTLR start T14
    public final void mT14() throws RecognitionException {
        try {
            int _type = T14;
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:12:5: ( 'using' )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:12:7: 'using'
            {
            match("using"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T14

    // $ANTLR start T15
    public final void mT15() throws RecognitionException {
        try {
            int _type = T15;
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:13:5: ( '.' )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:13:7: '.'
            {
            match('.'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T15

    // $ANTLR start T16
    public final void mT16() throws RecognitionException {
        try {
            int _type = T16;
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:14:5: ( '*' )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:14:7: '*'
            {
            match('*'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T16

    // $ANTLR start T17
    public final void mT17() throws RecognitionException {
        try {
            int _type = T17;
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:15:5: ( 'function' )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:15:7: 'function'
            {
            match("function"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T17

    // $ANTLR start T18
    public final void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:16:5: ( '(' )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:16:7: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T18

    // $ANTLR start T19
    public final void mT19() throws RecognitionException {
        try {
            int _type = T19;
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:17:5: ( ',' )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:17:7: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T19

    // $ANTLR start T20
    public final void mT20() throws RecognitionException {
        try {
            int _type = T20;
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:18:5: ( ')' )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:18:7: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T20

    // $ANTLR start T21
    public final void mT21() throws RecognitionException {
        try {
            int _type = T21;
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:19:5: ( '{' )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:19:7: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T21

    // $ANTLR start T22
    public final void mT22() throws RecognitionException {
        try {
            int _type = T22;
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:20:5: ( '}' )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:20:7: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T22

    // $ANTLR start T23
    public final void mT23() throws RecognitionException {
        try {
            int _type = T23;
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:21:5: ( 'return' )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:21:7: 'return'
            {
            match("return"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T23

    // $ANTLR start T24
    public final void mT24() throws RecognitionException {
        try {
            int _type = T24;
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:22:5: ( ';' )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:22:7: ';'
            {
            match(';'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T24

    // $ANTLR start T25
    public final void mT25() throws RecognitionException {
        try {
            int _type = T25;
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:23:5: ( 'assert' )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:23:7: 'assert'
            {
            match("assert"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T25

    // $ANTLR start T26
    public final void mT26() throws RecognitionException {
        try {
            int _type = T26;
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:24:5: ( 'is' )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:24:7: 'is'
            {
            match("is"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T26

    // $ANTLR start T27
    public final void mT27() throws RecognitionException {
        try {
            int _type = T27;
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:25:5: ( ':' )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:25:7: ':'
            {
            match(':'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T27

    // $ANTLR start T28
    public final void mT28() throws RecognitionException {
        try {
            int _type = T28;
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:26:5: ( 'enum' )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:26:7: 'enum'
            {
            match("enum"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T28

    // $ANTLR start T29
    public final void mT29() throws RecognitionException {
        try {
            int _type = T29;
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:27:5: ( 'var' )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:27:7: 'var'
            {
            match("var"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T29

    // $ANTLR start T30
    public final void mT30() throws RecognitionException {
        try {
            int _type = T30;
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:28:5: ( '=' )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:28:7: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T30

    // $ANTLR start T31
    public final void mT31() throws RecognitionException {
        try {
            int _type = T31;
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:29:5: ( 'array' )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:29:7: 'array'
            {
            match("array"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T31

    // $ANTLR start T32
    public final void mT32() throws RecognitionException {
        try {
            int _type = T32;
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:30:5: ( '[' )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:30:7: '['
            {
            match('['); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T32

    // $ANTLR start T33
    public final void mT33() throws RecognitionException {
        try {
            int _type = T33;
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:31:5: ( ']' )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:31:7: ']'
            {
            match(']'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T33

    // $ANTLR start T34
    public final void mT34() throws RecognitionException {
        try {
            int _type = T34;
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:32:5: ( 'int' )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:32:7: 'int'
            {
            match("int"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T34

    // $ANTLR start T35
    public final void mT35() throws RecognitionException {
        try {
            int _type = T35;
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:33:5: ( 'bool' )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:33:7: 'bool'
            {
            match("bool"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T35

    // $ANTLR start T36
    public final void mT36() throws RecognitionException {
        try {
            int _type = T36;
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:34:5: ( 'float' )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:34:7: 'float'
            {
            match("float"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T36

    // $ANTLR start T37
    public final void mT37() throws RecognitionException {
        try {
            int _type = T37;
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:35:5: ( 'string' )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:35:7: 'string'
            {
            match("string"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T37

    // $ANTLR start T38
    public final void mT38() throws RecognitionException {
        try {
            int _type = T38;
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:36:5: ( 'calc' )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:36:7: 'calc'
            {
            match("calc"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T38

    // $ANTLR start T39
    public final void mT39() throws RecognitionException {
        try {
            int _type = T39;
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:37:5: ( '==' )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:37:7: '=='
            {
            match("=="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T39

    // $ANTLR start T40
    public final void mT40() throws RecognitionException {
        try {
            int _type = T40;
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:38:5: ( '+' )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:38:7: '+'
            {
            match('+'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T40

    // $ANTLR start RULE_NUMBER
    public final void mRULE_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_NUMBER;
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:2123:13: ( ( '0' .. '9' )* ( '.' ( '0' .. '9' )+ )? )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:2123:15: ( '0' .. '9' )* ( '.' ( '0' .. '9' )+ )?
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:2123:15: ( '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:2123:16: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:2123:27: ( '.' ( '0' .. '9' )+ )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='.') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:2123:28: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:2123:32: ( '0' .. '9' )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:2123:33: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt2 >= 1 ) break loop2;
                                EarlyExitException eee =
                                    new EarlyExitException(2, input);
                                throw eee;
                        }
                        cnt2++;
                    } while (true);


                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_NUMBER

    // $ANTLR start RULE_INT
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:2125:10: ( '$$$don\\'t use this anymore$$$' )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:2125:12: '$$$don\\'t use this anymore$$$'
            {
            match("$$$don\'t use this anymore$$$"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INT

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:2127:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:2127:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:2127:11: ( '^' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='^') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:2127:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:2127:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ID

    // $ANTLR start RULE_STRING
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:2129:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:2129:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:2129:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2129:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:2129:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:2129:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFE')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:2129:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:2129:62: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:2129:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:2129:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFE')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:2129:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:2129:129: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_STRING

    // $ANTLR start RULE_ML_COMMENT
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:2131:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:2131:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:2131:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFE')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFE')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:2131:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match("*/"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ML_COMMENT

    // $ANTLR start RULE_SL_COMMENT
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:2133:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:2133:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:2133:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFE')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:2133:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:2133:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:2133:41: ( '\\r' )? '\\n'
                    {
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:2133:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:2133:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SL_COMMENT

    // $ANTLR start RULE_WS
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:2135:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:2135:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:2135:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_WS

    // $ANTLR start RULE_ANY_OTHER
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:2137:16: ( . )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:2137:18: .
            {
            matchAny(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ANY_OTHER

    public void mTokens() throws RecognitionException {
        // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1:8: ( T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | RULE_NUMBER | RULE_INT | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=37;
        int LA14_0 = input.LA(1);

        if ( (LA14_0=='t') ) {
            int LA14_1 = input.LA(2);

            if ( (LA14_1=='e') ) {
                int LA14_36 = input.LA(3);

                if ( (LA14_36=='s') ) {
                    int LA14_71 = input.LA(4);

                    if ( (LA14_71=='t') ) {
                        int LA14_86 = input.LA(5);

                        if ( (LA14_86=='e') ) {
                            int LA14_100 = input.LA(6);

                            if ( (LA14_100=='d') ) {
                                int LA14_112 = input.LA(7);

                                if ( ((LA14_112>='0' && LA14_112<='9')||(LA14_112>='A' && LA14_112<='Z')||LA14_112=='_'||(LA14_112>='a' && LA14_112<='z')) ) {
                                    alt14=32;
                                }
                                else {
                                    alt14=1;}
                            }
                            else {
                                alt14=32;}
                        }
                        else {
                            alt14=32;}
                    }
                    else {
                        alt14=32;}
                }
                else {
                    alt14=32;}
            }
            else {
                alt14=32;}
        }
        else if ( (LA14_0=='m') ) {
            int LA14_2 = input.LA(2);

            if ( (LA14_2=='o') ) {
                int LA14_38 = input.LA(3);

                if ( (LA14_38=='d') ) {
                    int LA14_72 = input.LA(4);

                    if ( (LA14_72=='e') ) {
                        int LA14_87 = input.LA(5);

                        if ( (LA14_87=='l') ) {
                            int LA14_101 = input.LA(6);

                            if ( ((LA14_101>='0' && LA14_101<='9')||(LA14_101>='A' && LA14_101<='Z')||LA14_101=='_'||(LA14_101>='a' && LA14_101<='z')) ) {
                                alt14=32;
                            }
                            else {
                                alt14=2;}
                        }
                        else {
                            alt14=32;}
                    }
                    else {
                        alt14=32;}
                }
                else {
                    alt14=32;}
            }
            else {
                alt14=32;}
        }
        else if ( (LA14_0=='u') ) {
            int LA14_3 = input.LA(2);

            if ( (LA14_3=='s') ) {
                int LA14_39 = input.LA(3);

                if ( (LA14_39=='i') ) {
                    int LA14_73 = input.LA(4);

                    if ( (LA14_73=='n') ) {
                        int LA14_88 = input.LA(5);

                        if ( (LA14_88=='g') ) {
                            int LA14_102 = input.LA(6);

                            if ( ((LA14_102>='0' && LA14_102<='9')||(LA14_102>='A' && LA14_102<='Z')||LA14_102=='_'||(LA14_102>='a' && LA14_102<='z')) ) {
                                alt14=32;
                            }
                            else {
                                alt14=3;}
                        }
                        else {
                            alt14=32;}
                    }
                    else {
                        alt14=32;}
                }
                else {
                    alt14=32;}
            }
            else {
                alt14=32;}
        }
        else if ( (LA14_0=='.') ) {
            int LA14_4 = input.LA(2);

            if ( ((LA14_4>='0' && LA14_4<='9')) ) {
                alt14=30;
            }
            else {
                alt14=4;}
        }
        else if ( (LA14_0=='*') ) {
            alt14=5;
        }
        else if ( (LA14_0=='f') ) {
            switch ( input.LA(2) ) {
            case 'l':
                {
                int LA14_42 = input.LA(3);

                if ( (LA14_42=='o') ) {
                    int LA14_74 = input.LA(4);

                    if ( (LA14_74=='a') ) {
                        int LA14_89 = input.LA(5);

                        if ( (LA14_89=='t') ) {
                            int LA14_103 = input.LA(6);

                            if ( ((LA14_103>='0' && LA14_103<='9')||(LA14_103>='A' && LA14_103<='Z')||LA14_103=='_'||(LA14_103>='a' && LA14_103<='z')) ) {
                                alt14=32;
                            }
                            else {
                                alt14=25;}
                        }
                        else {
                            alt14=32;}
                    }
                    else {
                        alt14=32;}
                }
                else {
                    alt14=32;}
                }
                break;
            case 'u':
                {
                int LA14_43 = input.LA(3);

                if ( (LA14_43=='n') ) {
                    int LA14_75 = input.LA(4);

                    if ( (LA14_75=='c') ) {
                        int LA14_90 = input.LA(5);

                        if ( (LA14_90=='t') ) {
                            int LA14_104 = input.LA(6);

                            if ( (LA14_104=='i') ) {
                                int LA14_116 = input.LA(7);

                                if ( (LA14_116=='o') ) {
                                    int LA14_122 = input.LA(8);

                                    if ( (LA14_122=='n') ) {
                                        int LA14_126 = input.LA(9);

                                        if ( ((LA14_126>='0' && LA14_126<='9')||(LA14_126>='A' && LA14_126<='Z')||LA14_126=='_'||(LA14_126>='a' && LA14_126<='z')) ) {
                                            alt14=32;
                                        }
                                        else {
                                            alt14=6;}
                                    }
                                    else {
                                        alt14=32;}
                                }
                                else {
                                    alt14=32;}
                            }
                            else {
                                alt14=32;}
                        }
                        else {
                            alt14=32;}
                    }
                    else {
                        alt14=32;}
                }
                else {
                    alt14=32;}
                }
                break;
            default:
                alt14=32;}

        }
        else if ( (LA14_0=='(') ) {
            alt14=7;
        }
        else if ( (LA14_0==',') ) {
            alt14=8;
        }
        else if ( (LA14_0==')') ) {
            alt14=9;
        }
        else if ( (LA14_0=='{') ) {
            alt14=10;
        }
        else if ( (LA14_0=='}') ) {
            alt14=11;
        }
        else if ( (LA14_0=='r') ) {
            int LA14_12 = input.LA(2);

            if ( (LA14_12=='e') ) {
                int LA14_49 = input.LA(3);

                if ( (LA14_49=='t') ) {
                    int LA14_76 = input.LA(4);

                    if ( (LA14_76=='u') ) {
                        int LA14_91 = input.LA(5);

                        if ( (LA14_91=='r') ) {
                            int LA14_105 = input.LA(6);

                            if ( (LA14_105=='n') ) {
                                int LA14_117 = input.LA(7);

                                if ( ((LA14_117>='0' && LA14_117<='9')||(LA14_117>='A' && LA14_117<='Z')||LA14_117=='_'||(LA14_117>='a' && LA14_117<='z')) ) {
                                    alt14=32;
                                }
                                else {
                                    alt14=12;}
                            }
                            else {
                                alt14=32;}
                        }
                        else {
                            alt14=32;}
                    }
                    else {
                        alt14=32;}
                }
                else {
                    alt14=32;}
            }
            else {
                alt14=32;}
        }
        else if ( (LA14_0==';') ) {
            alt14=13;
        }
        else if ( (LA14_0=='a') ) {
            switch ( input.LA(2) ) {
            case 's':
                {
                int LA14_51 = input.LA(3);

                if ( (LA14_51=='s') ) {
                    int LA14_77 = input.LA(4);

                    if ( (LA14_77=='e') ) {
                        int LA14_92 = input.LA(5);

                        if ( (LA14_92=='r') ) {
                            int LA14_106 = input.LA(6);

                            if ( (LA14_106=='t') ) {
                                int LA14_118 = input.LA(7);

                                if ( ((LA14_118>='0' && LA14_118<='9')||(LA14_118>='A' && LA14_118<='Z')||LA14_118=='_'||(LA14_118>='a' && LA14_118<='z')) ) {
                                    alt14=32;
                                }
                                else {
                                    alt14=14;}
                            }
                            else {
                                alt14=32;}
                        }
                        else {
                            alt14=32;}
                    }
                    else {
                        alt14=32;}
                }
                else {
                    alt14=32;}
                }
                break;
            case 'r':
                {
                int LA14_52 = input.LA(3);

                if ( (LA14_52=='r') ) {
                    int LA14_78 = input.LA(4);

                    if ( (LA14_78=='a') ) {
                        int LA14_93 = input.LA(5);

                        if ( (LA14_93=='y') ) {
                            int LA14_107 = input.LA(6);

                            if ( ((LA14_107>='0' && LA14_107<='9')||(LA14_107>='A' && LA14_107<='Z')||LA14_107=='_'||(LA14_107>='a' && LA14_107<='z')) ) {
                                alt14=32;
                            }
                            else {
                                alt14=20;}
                        }
                        else {
                            alt14=32;}
                    }
                    else {
                        alt14=32;}
                }
                else {
                    alt14=32;}
                }
                break;
            default:
                alt14=32;}

        }
        else if ( (LA14_0=='i') ) {
            switch ( input.LA(2) ) {
            case 's':
                {
                int LA14_53 = input.LA(3);

                if ( ((LA14_53>='0' && LA14_53<='9')||(LA14_53>='A' && LA14_53<='Z')||LA14_53=='_'||(LA14_53>='a' && LA14_53<='z')) ) {
                    alt14=32;
                }
                else {
                    alt14=15;}
                }
                break;
            case 'n':
                {
                int LA14_54 = input.LA(3);

                if ( (LA14_54=='t') ) {
                    int LA14_80 = input.LA(4);

                    if ( ((LA14_80>='0' && LA14_80<='9')||(LA14_80>='A' && LA14_80<='Z')||LA14_80=='_'||(LA14_80>='a' && LA14_80<='z')) ) {
                        alt14=32;
                    }
                    else {
                        alt14=23;}
                }
                else {
                    alt14=32;}
                }
                break;
            default:
                alt14=32;}

        }
        else if ( (LA14_0==':') ) {
            alt14=16;
        }
        else if ( (LA14_0=='e') ) {
            int LA14_17 = input.LA(2);

            if ( (LA14_17=='n') ) {
                int LA14_56 = input.LA(3);

                if ( (LA14_56=='u') ) {
                    int LA14_81 = input.LA(4);

                    if ( (LA14_81=='m') ) {
                        int LA14_95 = input.LA(5);

                        if ( ((LA14_95>='0' && LA14_95<='9')||(LA14_95>='A' && LA14_95<='Z')||LA14_95=='_'||(LA14_95>='a' && LA14_95<='z')) ) {
                            alt14=32;
                        }
                        else {
                            alt14=17;}
                    }
                    else {
                        alt14=32;}
                }
                else {
                    alt14=32;}
            }
            else {
                alt14=32;}
        }
        else if ( (LA14_0=='v') ) {
            int LA14_18 = input.LA(2);

            if ( (LA14_18=='a') ) {
                int LA14_57 = input.LA(3);

                if ( (LA14_57=='r') ) {
                    int LA14_82 = input.LA(4);

                    if ( ((LA14_82>='0' && LA14_82<='9')||(LA14_82>='A' && LA14_82<='Z')||LA14_82=='_'||(LA14_82>='a' && LA14_82<='z')) ) {
                        alt14=32;
                    }
                    else {
                        alt14=18;}
                }
                else {
                    alt14=32;}
            }
            else {
                alt14=32;}
        }
        else if ( (LA14_0=='=') ) {
            int LA14_19 = input.LA(2);

            if ( (LA14_19=='=') ) {
                alt14=28;
            }
            else {
                alt14=19;}
        }
        else if ( (LA14_0=='[') ) {
            alt14=21;
        }
        else if ( (LA14_0==']') ) {
            alt14=22;
        }
        else if ( (LA14_0=='b') ) {
            int LA14_22 = input.LA(2);

            if ( (LA14_22=='o') ) {
                int LA14_62 = input.LA(3);

                if ( (LA14_62=='o') ) {
                    int LA14_83 = input.LA(4);

                    if ( (LA14_83=='l') ) {
                        int LA14_97 = input.LA(5);

                        if ( ((LA14_97>='0' && LA14_97<='9')||(LA14_97>='A' && LA14_97<='Z')||LA14_97=='_'||(LA14_97>='a' && LA14_97<='z')) ) {
                            alt14=32;
                        }
                        else {
                            alt14=24;}
                    }
                    else {
                        alt14=32;}
                }
                else {
                    alt14=32;}
            }
            else {
                alt14=32;}
        }
        else if ( (LA14_0=='s') ) {
            int LA14_23 = input.LA(2);

            if ( (LA14_23=='t') ) {
                int LA14_63 = input.LA(3);

                if ( (LA14_63=='r') ) {
                    int LA14_84 = input.LA(4);

                    if ( (LA14_84=='i') ) {
                        int LA14_98 = input.LA(5);

                        if ( (LA14_98=='n') ) {
                            int LA14_110 = input.LA(6);

                            if ( (LA14_110=='g') ) {
                                int LA14_120 = input.LA(7);

                                if ( ((LA14_120>='0' && LA14_120<='9')||(LA14_120>='A' && LA14_120<='Z')||LA14_120=='_'||(LA14_120>='a' && LA14_120<='z')) ) {
                                    alt14=32;
                                }
                                else {
                                    alt14=26;}
                            }
                            else {
                                alt14=32;}
                        }
                        else {
                            alt14=32;}
                    }
                    else {
                        alt14=32;}
                }
                else {
                    alt14=32;}
            }
            else {
                alt14=32;}
        }
        else if ( (LA14_0=='c') ) {
            int LA14_24 = input.LA(2);

            if ( (LA14_24=='a') ) {
                int LA14_64 = input.LA(3);

                if ( (LA14_64=='l') ) {
                    int LA14_85 = input.LA(4);

                    if ( (LA14_85=='c') ) {
                        int LA14_99 = input.LA(5);

                        if ( ((LA14_99>='0' && LA14_99<='9')||(LA14_99>='A' && LA14_99<='Z')||LA14_99=='_'||(LA14_99>='a' && LA14_99<='z')) ) {
                            alt14=32;
                        }
                        else {
                            alt14=27;}
                    }
                    else {
                        alt14=32;}
                }
                else {
                    alt14=32;}
            }
            else {
                alt14=32;}
        }
        else if ( (LA14_0=='+') ) {
            alt14=29;
        }
        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {
            alt14=30;
        }
        else if ( (LA14_0=='$') ) {
            int LA14_28 = input.LA(2);

            if ( (LA14_28=='$') ) {
                alt14=31;
            }
            else {
                alt14=37;}
        }
        else if ( (LA14_0=='^') ) {
            int LA14_29 = input.LA(2);

            if ( ((LA14_29>='A' && LA14_29<='Z')||LA14_29=='_'||(LA14_29>='a' && LA14_29<='z')) ) {
                alt14=32;
            }
            else {
                alt14=37;}
        }
        else if ( ((LA14_0>='A' && LA14_0<='Z')||LA14_0=='_'||LA14_0=='d'||(LA14_0>='g' && LA14_0<='h')||(LA14_0>='j' && LA14_0<='l')||(LA14_0>='n' && LA14_0<='q')||(LA14_0>='w' && LA14_0<='z')) ) {
            alt14=32;
        }
        else if ( (LA14_0=='\"') ) {
            int LA14_31 = input.LA(2);

            if ( ((LA14_31>='\u0000' && LA14_31<='\uFFFE')) ) {
                alt14=33;
            }
            else {
                alt14=37;}
        }
        else if ( (LA14_0=='\'') ) {
            int LA14_32 = input.LA(2);

            if ( ((LA14_32>='\u0000' && LA14_32<='\uFFFE')) ) {
                alt14=33;
            }
            else {
                alt14=37;}
        }
        else if ( (LA14_0=='/') ) {
            switch ( input.LA(2) ) {
            case '/':
                {
                alt14=35;
                }
                break;
            case '*':
                {
                alt14=34;
                }
                break;
            default:
                alt14=37;}

        }
        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
            alt14=36;
        }
        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||LA14_0=='#'||(LA14_0>='%' && LA14_0<='&')||LA14_0=='-'||LA14_0=='<'||(LA14_0>='>' && LA14_0<='@')||LA14_0=='\\'||LA14_0=='`'||LA14_0=='|'||(LA14_0>='~' && LA14_0<='\uFFFE')) ) {
            alt14=37;
        }
        else {
            alt14=30;}
        switch (alt14) {
            case 1 :
                // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1:10: T12
                {
                mT12(); 

                }
                break;
            case 2 :
                // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1:14: T13
                {
                mT13(); 

                }
                break;
            case 3 :
                // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1:18: T14
                {
                mT14(); 

                }
                break;
            case 4 :
                // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1:22: T15
                {
                mT15(); 

                }
                break;
            case 5 :
                // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1:26: T16
                {
                mT16(); 

                }
                break;
            case 6 :
                // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1:30: T17
                {
                mT17(); 

                }
                break;
            case 7 :
                // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1:34: T18
                {
                mT18(); 

                }
                break;
            case 8 :
                // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1:38: T19
                {
                mT19(); 

                }
                break;
            case 9 :
                // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1:42: T20
                {
                mT20(); 

                }
                break;
            case 10 :
                // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1:46: T21
                {
                mT21(); 

                }
                break;
            case 11 :
                // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1:50: T22
                {
                mT22(); 

                }
                break;
            case 12 :
                // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1:54: T23
                {
                mT23(); 

                }
                break;
            case 13 :
                // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1:58: T24
                {
                mT24(); 

                }
                break;
            case 14 :
                // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1:62: T25
                {
                mT25(); 

                }
                break;
            case 15 :
                // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1:66: T26
                {
                mT26(); 

                }
                break;
            case 16 :
                // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1:70: T27
                {
                mT27(); 

                }
                break;
            case 17 :
                // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1:74: T28
                {
                mT28(); 

                }
                break;
            case 18 :
                // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1:78: T29
                {
                mT29(); 

                }
                break;
            case 19 :
                // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1:82: T30
                {
                mT30(); 

                }
                break;
            case 20 :
                // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1:86: T31
                {
                mT31(); 

                }
                break;
            case 21 :
                // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1:90: T32
                {
                mT32(); 

                }
                break;
            case 22 :
                // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1:94: T33
                {
                mT33(); 

                }
                break;
            case 23 :
                // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1:98: T34
                {
                mT34(); 

                }
                break;
            case 24 :
                // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1:102: T35
                {
                mT35(); 

                }
                break;
            case 25 :
                // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1:106: T36
                {
                mT36(); 

                }
                break;
            case 26 :
                // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1:110: T37
                {
                mT37(); 

                }
                break;
            case 27 :
                // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1:114: T38
                {
                mT38(); 

                }
                break;
            case 28 :
                // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1:118: T39
                {
                mT39(); 

                }
                break;
            case 29 :
                // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1:122: T40
                {
                mT40(); 

                }
                break;
            case 30 :
                // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1:126: RULE_NUMBER
                {
                mRULE_NUMBER(); 

                }
                break;
            case 31 :
                // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1:138: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 32 :
                // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1:147: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 33 :
                // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1:155: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 34 :
                // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1:167: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 35 :
                // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1:183: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 36 :
                // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1:199: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 37 :
                // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1:207: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}