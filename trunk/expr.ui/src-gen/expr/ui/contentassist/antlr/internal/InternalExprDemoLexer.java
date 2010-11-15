package expr.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


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
    public static final int Tokens=32;
    public static final int T24=24;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=9;
    public static final int T23=23;
    public static final int T22=22;
    public static final int T21=21;
    public static final int T20=20;
    public static final int RULE_ML_COMMENT=8;
    public static final int RULE_STRING=6;
    public static final int RULE_NUMBER=5;
    public static final int RULE_INT=7;
    public static final int T12=12;
    public static final int T13=13;
    public static final int T14=14;
    public static final int RULE_WS=10;
    public static final int T15=15;
    public static final int T16=16;
    public static final int T17=17;
    public static final int T18=18;
    public static final int T30=30;
    public static final int T19=19;
    public static final int T31=31;
    public InternalExprDemoLexer() {;} 
    public InternalExprDemoLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g"; }

    // $ANTLR start T12
    public final void mT12() throws RecognitionException {
        try {
            int _type = T12;
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:10:5: ( 'model' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:10:7: 'model'
            {
            match("model"); 


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
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:11:5: ( 'assert' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:11:7: 'assert'
            {
            match("assert"); 


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
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:12:5: ( ';' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:12:7: ';'
            {
            match(';'); 

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
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:13:5: ( 'enum' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:13:7: 'enum'
            {
            match("enum"); 


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
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:14:5: ( '{' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:14:7: '{'
            {
            match('{'); 

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
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:15:5: ( '}' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:15:7: '}'
            {
            match('}'); 

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
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:16:5: ( 'var' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:16:7: 'var'
            {
            match("var"); 


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
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:17:5: ( '=' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:17:7: '='
            {
            match('='); 

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
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:18:5: ( 'array' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:18:7: 'array'
            {
            match("array"); 


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
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:19:5: ( '[' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:19:7: '['
            {
            match('['); 

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
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:20:5: ( ']' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:20:7: ']'
            {
            match(']'); 

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
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:21:5: ( 'int' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:21:7: 'int'
            {
            match("int"); 


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
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:22:5: ( 'bool' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:22:7: 'bool'
            {
            match("bool"); 


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
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:23:5: ( 'float' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:23:7: 'float'
            {
            match("float"); 


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
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:24:5: ( 'string' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:24:7: 'string'
            {
            match("string"); 


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
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:25:5: ( 'calc' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:25:7: 'calc'
            {
            match("calc"); 


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
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:26:5: ( '==' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:26:7: '=='
            {
            match("=="); 


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
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:27:5: ( '+' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:27:7: '+'
            {
            match('+'); 

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
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:28:5: ( '*' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:28:7: '*'
            {
            match('*'); 

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
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:29:5: ( '.' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:29:7: '.'
            {
            match('.'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T31

    // $ANTLR start RULE_NUMBER
    public final void mRULE_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_NUMBER;
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3415:13: ( ( '0' .. '9' )* ( '.' ( '0' .. '9' )+ )? )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3415:15: ( '0' .. '9' )* ( '.' ( '0' .. '9' )+ )?
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3415:15: ( '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3415:16: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3415:27: ( '.' ( '0' .. '9' )+ )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='.') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3415:28: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3415:32: ( '0' .. '9' )+
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
                    	    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3415:33: '0' .. '9'
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
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3417:10: ( '$$$don\\'t use this anymore$$$' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3417:12: '$$$don\\'t use this anymore$$$'
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
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3419:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3419:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3419:11: ( '^' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='^') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3419:11: '^'
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

            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3419:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:
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
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3421:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3421:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3421:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    new NoViableAltException("3421:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3421:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3421:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3421:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3421:62: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3421:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3421:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3421:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3421:129: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3423:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3423:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3423:24: ( options {greedy=false; } : . )*
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
            	    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3423:52: .
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
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3425:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3425:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3425:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFE')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3425:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3425:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3425:41: ( '\\r' )? '\\n'
                    {
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3425:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3425:41: '\\r'
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
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3427:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3427:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3427:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:
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
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3429:16: ( . )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3429:18: .
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
        // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1:8: ( T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | RULE_NUMBER | RULE_INT | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=28;
        int LA14_0 = input.LA(1);

        if ( (LA14_0=='m') ) {
            int LA14_1 = input.LA(2);

            if ( (LA14_1=='o') ) {
                int LA14_29 = input.LA(3);

                if ( (LA14_29=='d') ) {
                    int LA14_55 = input.LA(4);

                    if ( (LA14_55=='e') ) {
                        int LA14_65 = input.LA(5);

                        if ( (LA14_65=='l') ) {
                            int LA14_75 = input.LA(6);

                            if ( ((LA14_75>='0' && LA14_75<='9')||(LA14_75>='A' && LA14_75<='Z')||LA14_75=='_'||(LA14_75>='a' && LA14_75<='z')) ) {
                                alt14=23;
                            }
                            else {
                                alt14=1;}
                        }
                        else {
                            alt14=23;}
                    }
                    else {
                        alt14=23;}
                }
                else {
                    alt14=23;}
            }
            else {
                alt14=23;}
        }
        else if ( (LA14_0=='a') ) {
            switch ( input.LA(2) ) {
            case 's':
                {
                int LA14_31 = input.LA(3);

                if ( (LA14_31=='s') ) {
                    int LA14_56 = input.LA(4);

                    if ( (LA14_56=='e') ) {
                        int LA14_66 = input.LA(5);

                        if ( (LA14_66=='r') ) {
                            int LA14_76 = input.LA(6);

                            if ( (LA14_76=='t') ) {
                                int LA14_84 = input.LA(7);

                                if ( ((LA14_84>='0' && LA14_84<='9')||(LA14_84>='A' && LA14_84<='Z')||LA14_84=='_'||(LA14_84>='a' && LA14_84<='z')) ) {
                                    alt14=23;
                                }
                                else {
                                    alt14=2;}
                            }
                            else {
                                alt14=23;}
                        }
                        else {
                            alt14=23;}
                    }
                    else {
                        alt14=23;}
                }
                else {
                    alt14=23;}
                }
                break;
            case 'r':
                {
                int LA14_32 = input.LA(3);

                if ( (LA14_32=='r') ) {
                    int LA14_57 = input.LA(4);

                    if ( (LA14_57=='a') ) {
                        int LA14_67 = input.LA(5);

                        if ( (LA14_67=='y') ) {
                            int LA14_77 = input.LA(6);

                            if ( ((LA14_77>='0' && LA14_77<='9')||(LA14_77>='A' && LA14_77<='Z')||LA14_77=='_'||(LA14_77>='a' && LA14_77<='z')) ) {
                                alt14=23;
                            }
                            else {
                                alt14=9;}
                        }
                        else {
                            alt14=23;}
                    }
                    else {
                        alt14=23;}
                }
                else {
                    alt14=23;}
                }
                break;
            default:
                alt14=23;}

        }
        else if ( (LA14_0==';') ) {
            alt14=3;
        }
        else if ( (LA14_0=='e') ) {
            int LA14_4 = input.LA(2);

            if ( (LA14_4=='n') ) {
                int LA14_34 = input.LA(3);

                if ( (LA14_34=='u') ) {
                    int LA14_58 = input.LA(4);

                    if ( (LA14_58=='m') ) {
                        int LA14_68 = input.LA(5);

                        if ( ((LA14_68>='0' && LA14_68<='9')||(LA14_68>='A' && LA14_68<='Z')||LA14_68=='_'||(LA14_68>='a' && LA14_68<='z')) ) {
                            alt14=23;
                        }
                        else {
                            alt14=4;}
                    }
                    else {
                        alt14=23;}
                }
                else {
                    alt14=23;}
            }
            else {
                alt14=23;}
        }
        else if ( (LA14_0=='{') ) {
            alt14=5;
        }
        else if ( (LA14_0=='}') ) {
            alt14=6;
        }
        else if ( (LA14_0=='v') ) {
            int LA14_7 = input.LA(2);

            if ( (LA14_7=='a') ) {
                int LA14_37 = input.LA(3);

                if ( (LA14_37=='r') ) {
                    int LA14_59 = input.LA(4);

                    if ( ((LA14_59>='0' && LA14_59<='9')||(LA14_59>='A' && LA14_59<='Z')||LA14_59=='_'||(LA14_59>='a' && LA14_59<='z')) ) {
                        alt14=23;
                    }
                    else {
                        alt14=7;}
                }
                else {
                    alt14=23;}
            }
            else {
                alt14=23;}
        }
        else if ( (LA14_0=='=') ) {
            int LA14_8 = input.LA(2);

            if ( (LA14_8=='=') ) {
                alt14=17;
            }
            else {
                alt14=8;}
        }
        else if ( (LA14_0=='[') ) {
            alt14=10;
        }
        else if ( (LA14_0==']') ) {
            alt14=11;
        }
        else if ( (LA14_0=='i') ) {
            int LA14_11 = input.LA(2);

            if ( (LA14_11=='n') ) {
                int LA14_42 = input.LA(3);

                if ( (LA14_42=='t') ) {
                    int LA14_60 = input.LA(4);

                    if ( ((LA14_60>='0' && LA14_60<='9')||(LA14_60>='A' && LA14_60<='Z')||LA14_60=='_'||(LA14_60>='a' && LA14_60<='z')) ) {
                        alt14=23;
                    }
                    else {
                        alt14=12;}
                }
                else {
                    alt14=23;}
            }
            else {
                alt14=23;}
        }
        else if ( (LA14_0=='b') ) {
            int LA14_12 = input.LA(2);

            if ( (LA14_12=='o') ) {
                int LA14_43 = input.LA(3);

                if ( (LA14_43=='o') ) {
                    int LA14_61 = input.LA(4);

                    if ( (LA14_61=='l') ) {
                        int LA14_71 = input.LA(5);

                        if ( ((LA14_71>='0' && LA14_71<='9')||(LA14_71>='A' && LA14_71<='Z')||LA14_71=='_'||(LA14_71>='a' && LA14_71<='z')) ) {
                            alt14=23;
                        }
                        else {
                            alt14=13;}
                    }
                    else {
                        alt14=23;}
                }
                else {
                    alt14=23;}
            }
            else {
                alt14=23;}
        }
        else if ( (LA14_0=='f') ) {
            int LA14_13 = input.LA(2);

            if ( (LA14_13=='l') ) {
                int LA14_44 = input.LA(3);

                if ( (LA14_44=='o') ) {
                    int LA14_62 = input.LA(4);

                    if ( (LA14_62=='a') ) {
                        int LA14_72 = input.LA(5);

                        if ( (LA14_72=='t') ) {
                            int LA14_80 = input.LA(6);

                            if ( ((LA14_80>='0' && LA14_80<='9')||(LA14_80>='A' && LA14_80<='Z')||LA14_80=='_'||(LA14_80>='a' && LA14_80<='z')) ) {
                                alt14=23;
                            }
                            else {
                                alt14=14;}
                        }
                        else {
                            alt14=23;}
                    }
                    else {
                        alt14=23;}
                }
                else {
                    alt14=23;}
            }
            else {
                alt14=23;}
        }
        else if ( (LA14_0=='s') ) {
            int LA14_14 = input.LA(2);

            if ( (LA14_14=='t') ) {
                int LA14_45 = input.LA(3);

                if ( (LA14_45=='r') ) {
                    int LA14_63 = input.LA(4);

                    if ( (LA14_63=='i') ) {
                        int LA14_73 = input.LA(5);

                        if ( (LA14_73=='n') ) {
                            int LA14_81 = input.LA(6);

                            if ( (LA14_81=='g') ) {
                                int LA14_87 = input.LA(7);

                                if ( ((LA14_87>='0' && LA14_87<='9')||(LA14_87>='A' && LA14_87<='Z')||LA14_87=='_'||(LA14_87>='a' && LA14_87<='z')) ) {
                                    alt14=23;
                                }
                                else {
                                    alt14=15;}
                            }
                            else {
                                alt14=23;}
                        }
                        else {
                            alt14=23;}
                    }
                    else {
                        alt14=23;}
                }
                else {
                    alt14=23;}
            }
            else {
                alt14=23;}
        }
        else if ( (LA14_0=='c') ) {
            int LA14_15 = input.LA(2);

            if ( (LA14_15=='a') ) {
                int LA14_46 = input.LA(3);

                if ( (LA14_46=='l') ) {
                    int LA14_64 = input.LA(4);

                    if ( (LA14_64=='c') ) {
                        int LA14_74 = input.LA(5);

                        if ( ((LA14_74>='0' && LA14_74<='9')||(LA14_74>='A' && LA14_74<='Z')||LA14_74=='_'||(LA14_74>='a' && LA14_74<='z')) ) {
                            alt14=23;
                        }
                        else {
                            alt14=16;}
                    }
                    else {
                        alt14=23;}
                }
                else {
                    alt14=23;}
            }
            else {
                alt14=23;}
        }
        else if ( (LA14_0=='+') ) {
            alt14=18;
        }
        else if ( (LA14_0=='*') ) {
            alt14=19;
        }
        else if ( (LA14_0=='.') ) {
            int LA14_18 = input.LA(2);

            if ( ((LA14_18>='0' && LA14_18<='9')) ) {
                alt14=21;
            }
            else {
                alt14=20;}
        }
        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {
            alt14=21;
        }
        else if ( (LA14_0=='$') ) {
            int LA14_21 = input.LA(2);

            if ( (LA14_21=='$') ) {
                alt14=22;
            }
            else {
                alt14=28;}
        }
        else if ( (LA14_0=='^') ) {
            int LA14_22 = input.LA(2);

            if ( ((LA14_22>='A' && LA14_22<='Z')||LA14_22=='_'||(LA14_22>='a' && LA14_22<='z')) ) {
                alt14=23;
            }
            else {
                alt14=28;}
        }
        else if ( ((LA14_0>='A' && LA14_0<='Z')||LA14_0=='_'||LA14_0=='d'||(LA14_0>='g' && LA14_0<='h')||(LA14_0>='j' && LA14_0<='l')||(LA14_0>='n' && LA14_0<='r')||(LA14_0>='t' && LA14_0<='u')||(LA14_0>='w' && LA14_0<='z')) ) {
            alt14=23;
        }
        else if ( (LA14_0=='\"') ) {
            int LA14_24 = input.LA(2);

            if ( ((LA14_24>='\u0000' && LA14_24<='\uFFFE')) ) {
                alt14=24;
            }
            else {
                alt14=28;}
        }
        else if ( (LA14_0=='\'') ) {
            int LA14_25 = input.LA(2);

            if ( ((LA14_25>='\u0000' && LA14_25<='\uFFFE')) ) {
                alt14=24;
            }
            else {
                alt14=28;}
        }
        else if ( (LA14_0=='/') ) {
            switch ( input.LA(2) ) {
            case '*':
                {
                alt14=25;
                }
                break;
            case '/':
                {
                alt14=26;
                }
                break;
            default:
                alt14=28;}

        }
        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
            alt14=27;
        }
        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||LA14_0=='#'||(LA14_0>='%' && LA14_0<='&')||(LA14_0>='(' && LA14_0<=')')||(LA14_0>=',' && LA14_0<='-')||LA14_0==':'||LA14_0=='<'||(LA14_0>='>' && LA14_0<='@')||LA14_0=='\\'||LA14_0=='`'||LA14_0=='|'||(LA14_0>='~' && LA14_0<='\uFFFE')) ) {
            alt14=28;
        }
        else {
            alt14=21;}
        switch (alt14) {
            case 1 :
                // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1:10: T12
                {
                mT12(); 

                }
                break;
            case 2 :
                // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1:14: T13
                {
                mT13(); 

                }
                break;
            case 3 :
                // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1:18: T14
                {
                mT14(); 

                }
                break;
            case 4 :
                // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1:22: T15
                {
                mT15(); 

                }
                break;
            case 5 :
                // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1:26: T16
                {
                mT16(); 

                }
                break;
            case 6 :
                // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1:30: T17
                {
                mT17(); 

                }
                break;
            case 7 :
                // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1:34: T18
                {
                mT18(); 

                }
                break;
            case 8 :
                // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1:38: T19
                {
                mT19(); 

                }
                break;
            case 9 :
                // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1:42: T20
                {
                mT20(); 

                }
                break;
            case 10 :
                // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1:46: T21
                {
                mT21(); 

                }
                break;
            case 11 :
                // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1:50: T22
                {
                mT22(); 

                }
                break;
            case 12 :
                // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1:54: T23
                {
                mT23(); 

                }
                break;
            case 13 :
                // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1:58: T24
                {
                mT24(); 

                }
                break;
            case 14 :
                // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1:62: T25
                {
                mT25(); 

                }
                break;
            case 15 :
                // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1:66: T26
                {
                mT26(); 

                }
                break;
            case 16 :
                // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1:70: T27
                {
                mT27(); 

                }
                break;
            case 17 :
                // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1:74: T28
                {
                mT28(); 

                }
                break;
            case 18 :
                // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1:78: T29
                {
                mT29(); 

                }
                break;
            case 19 :
                // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1:82: T30
                {
                mT30(); 

                }
                break;
            case 20 :
                // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1:86: T31
                {
                mT31(); 

                }
                break;
            case 21 :
                // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1:90: RULE_NUMBER
                {
                mRULE_NUMBER(); 

                }
                break;
            case 22 :
                // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1:102: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 23 :
                // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1:111: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 24 :
                // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1:119: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 25 :
                // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1:131: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 26 :
                // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1:147: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 27 :
                // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1:163: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 28 :
                // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1:171: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}