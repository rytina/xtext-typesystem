package expr.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import expr.services.ExprDemoGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalExprDemoParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_NUMBER", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'enum'", "'{'", "'}'", "'var'", "'='", "';'", "'array'", "'['", "']'", "'int'", "'bool'", "'float'", "'string'", "'calc'", "'+'", "'*'", "'.'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int RULE_NUMBER=5;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=7;
    public static final int RULE_WS=10;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;

        public InternalExprDemoParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g"; }



     	private ExprDemoGrammarAccess grammarAccess;
     	
        public InternalExprDemoParser(TokenStream input, IAstFactory factory, ExprDemoGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("expr/parser/antlr/internal/InternalExprDemo.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected ExprDemoGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleModel
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:77:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:78:2: (iv_ruleModel= ruleModel EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:79:2: iv_ruleModel= ruleModel EOF
            {
             currentNode = createCompositeNode(grammarAccess.getModelRule(), currentNode); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();
            _fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleModel


    // $ANTLR start ruleModel
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:86:1: ruleModel returns [EObject current=null] : ( (lv_elements_0_0= ruleElement ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:91:6: ( ( (lv_elements_0_0= ruleElement ) )* )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:92:1: ( (lv_elements_0_0= ruleElement ) )*
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:92:1: ( (lv_elements_0_0= ruleElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12||LA1_0==15||LA1_0==25) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:93:1: (lv_elements_0_0= ruleElement )
            	    {
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:93:1: (lv_elements_0_0= ruleElement )
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:94:3: lv_elements_0_0= ruleElement
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getElementsElementParserRuleCall_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleElement_in_ruleModel130);
            	    lv_elements_0_0=ruleElement();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"elements",
            	    	        		lv_elements_0_0, 
            	    	        		"Element", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleModel


    // $ANTLR start entryRuleElement
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:124:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:125:2: (iv_ruleElement= ruleElement EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:126:2: iv_ruleElement= ruleElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getElementRule(), currentNode); 
            pushFollow(FOLLOW_ruleElement_in_entryRuleElement166);
            iv_ruleElement=ruleElement();
            _fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElement176); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleElement


    // $ANTLR start ruleElement
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:133:1: ruleElement returns [EObject current=null] : (this_VarDecl_0= ruleVarDecl | this_Formula_1= ruleFormula | this_EnumDecl_2= ruleEnumDecl ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_VarDecl_0 = null;

        EObject this_Formula_1 = null;

        EObject this_EnumDecl_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:138:6: ( (this_VarDecl_0= ruleVarDecl | this_Formula_1= ruleFormula | this_EnumDecl_2= ruleEnumDecl ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:139:1: (this_VarDecl_0= ruleVarDecl | this_Formula_1= ruleFormula | this_EnumDecl_2= ruleEnumDecl )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:139:1: (this_VarDecl_0= ruleVarDecl | this_Formula_1= ruleFormula | this_EnumDecl_2= ruleEnumDecl )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt2=1;
                }
                break;
            case 25:
                {
                alt2=2;
                }
                break;
            case 12:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("139:1: (this_VarDecl_0= ruleVarDecl | this_Formula_1= ruleFormula | this_EnumDecl_2= ruleEnumDecl )", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:140:5: this_VarDecl_0= ruleVarDecl
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getElementAccess().getVarDeclParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleVarDecl_in_ruleElement223);
                    this_VarDecl_0=ruleVarDecl();
                    _fsp--;

                     
                            current = this_VarDecl_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:150:5: this_Formula_1= ruleFormula
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getElementAccess().getFormulaParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFormula_in_ruleElement250);
                    this_Formula_1=ruleFormula();
                    _fsp--;

                     
                            current = this_Formula_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:160:5: this_EnumDecl_2= ruleEnumDecl
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getElementAccess().getEnumDeclParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEnumDecl_in_ruleElement277);
                    this_EnumDecl_2=ruleEnumDecl();
                    _fsp--;

                     
                            current = this_EnumDecl_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleElement


    // $ANTLR start entryRuleEnumDecl
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:176:1: entryRuleEnumDecl returns [EObject current=null] : iv_ruleEnumDecl= ruleEnumDecl EOF ;
    public final EObject entryRuleEnumDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumDecl = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:177:2: (iv_ruleEnumDecl= ruleEnumDecl EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:178:2: iv_ruleEnumDecl= ruleEnumDecl EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEnumDeclRule(), currentNode); 
            pushFollow(FOLLOW_ruleEnumDecl_in_entryRuleEnumDecl312);
            iv_ruleEnumDecl=ruleEnumDecl();
            _fsp--;

             current =iv_ruleEnumDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumDecl322); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEnumDecl


    // $ANTLR start ruleEnumDecl
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:185:1: ruleEnumDecl returns [EObject current=null] : ( 'enum' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_literals_3_0= ruleEnumLiteral ) )* '}' ) ;
    public final EObject ruleEnumDecl() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_literals_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:190:6: ( ( 'enum' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_literals_3_0= ruleEnumLiteral ) )* '}' ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:191:1: ( 'enum' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_literals_3_0= ruleEnumLiteral ) )* '}' )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:191:1: ( 'enum' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_literals_3_0= ruleEnumLiteral ) )* '}' )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:191:3: 'enum' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_literals_3_0= ruleEnumLiteral ) )* '}'
            {
            match(input,12,FOLLOW_12_in_ruleEnumDecl357); 

                    createLeafNode(grammarAccess.getEnumDeclAccess().getEnumKeyword_0(), null); 
                
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:195:1: ( (lv_name_1_0= RULE_ID ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:196:1: (lv_name_1_0= RULE_ID )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:196:1: (lv_name_1_0= RULE_ID )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:197:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumDecl374); 

            			createLeafNode(grammarAccess.getEnumDeclAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEnumDeclRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,13,FOLLOW_13_in_ruleEnumDecl389); 

                    createLeafNode(grammarAccess.getEnumDeclAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:223:1: ( (lv_literals_3_0= ruleEnumLiteral ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:224:1: (lv_literals_3_0= ruleEnumLiteral )
            	    {
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:224:1: (lv_literals_3_0= ruleEnumLiteral )
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:225:3: lv_literals_3_0= ruleEnumLiteral
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getEnumDeclAccess().getLiteralsEnumLiteralParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleEnumLiteral_in_ruleEnumDecl410);
            	    lv_literals_3_0=ruleEnumLiteral();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getEnumDeclRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"literals",
            	    	        		lv_literals_3_0, 
            	    	        		"EnumLiteral", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match(input,14,FOLLOW_14_in_ruleEnumDecl421); 

                    createLeafNode(grammarAccess.getEnumDeclAccess().getRightCurlyBracketKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEnumDecl


    // $ANTLR start entryRuleEnumLiteral
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:259:1: entryRuleEnumLiteral returns [EObject current=null] : iv_ruleEnumLiteral= ruleEnumLiteral EOF ;
    public final EObject entryRuleEnumLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumLiteral = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:260:2: (iv_ruleEnumLiteral= ruleEnumLiteral EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:261:2: iv_ruleEnumLiteral= ruleEnumLiteral EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEnumLiteralRule(), currentNode); 
            pushFollow(FOLLOW_ruleEnumLiteral_in_entryRuleEnumLiteral457);
            iv_ruleEnumLiteral=ruleEnumLiteral();
            _fsp--;

             current =iv_ruleEnumLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumLiteral467); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEnumLiteral


    // $ANTLR start ruleEnumLiteral
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:268:1: ruleEnumLiteral returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEnumLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:273:6: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:274:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:274:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:274:2: () ( (lv_name_1_0= RULE_ID ) )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:274:2: ()
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:275:5: 
            {
             
                    temp=factory.create(grammarAccess.getEnumLiteralAccess().getEnumLiteralAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getEnumLiteralAccess().getEnumLiteralAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:285:2: ( (lv_name_1_0= RULE_ID ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:286:1: (lv_name_1_0= RULE_ID )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:286:1: (lv_name_1_0= RULE_ID )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:287:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumLiteral518); 

            			createLeafNode(grammarAccess.getEnumLiteralAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEnumLiteralRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEnumLiteral


    // $ANTLR start entryRuleVarDecl
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:317:1: entryRuleVarDecl returns [EObject current=null] : iv_ruleVarDecl= ruleVarDecl EOF ;
    public final EObject entryRuleVarDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDecl = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:318:2: (iv_ruleVarDecl= ruleVarDecl EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:319:2: iv_ruleVarDecl= ruleVarDecl EOF
            {
             currentNode = createCompositeNode(grammarAccess.getVarDeclRule(), currentNode); 
            pushFollow(FOLLOW_ruleVarDecl_in_entryRuleVarDecl559);
            iv_ruleVarDecl=ruleVarDecl();
            _fsp--;

             current =iv_ruleVarDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarDecl569); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleVarDecl


    // $ANTLR start ruleVarDecl
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:326:1: ruleVarDecl returns [EObject current=null] : ( () 'var' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) ( '=' ( (lv_init_5_0= ruleExpr ) ) )? ';' ) ;
    public final EObject ruleVarDecl() throws RecognitionException {
        EObject current = null;

        Token lv_name_3_0=null;
        EObject lv_type_2_0 = null;

        EObject lv_init_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:331:6: ( ( () 'var' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) ( '=' ( (lv_init_5_0= ruleExpr ) ) )? ';' ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:332:1: ( () 'var' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) ( '=' ( (lv_init_5_0= ruleExpr ) ) )? ';' )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:332:1: ( () 'var' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) ( '=' ( (lv_init_5_0= ruleExpr ) ) )? ';' )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:332:2: () 'var' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) ( '=' ( (lv_init_5_0= ruleExpr ) ) )? ';'
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:332:2: ()
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:333:5: 
            {
             
                    temp=factory.create(grammarAccess.getVarDeclAccess().getVarDeclAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getVarDeclAccess().getVarDeclAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,15,FOLLOW_15_in_ruleVarDecl613); 

                    createLeafNode(grammarAccess.getVarDeclAccess().getVarKeyword_1(), null); 
                
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:347:1: ( (lv_type_2_0= ruleType ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:348:1: (lv_type_2_0= ruleType )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:348:1: (lv_type_2_0= ruleType )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:349:3: lv_type_2_0= ruleType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getVarDeclAccess().getTypeTypeParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleVarDecl634);
            lv_type_2_0=ruleType();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getVarDeclRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"type",
            	        		lv_type_2_0, 
            	        		"Type", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:371:2: ( (lv_name_3_0= RULE_ID ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:372:1: (lv_name_3_0= RULE_ID )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:372:1: (lv_name_3_0= RULE_ID )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:373:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVarDecl651); 

            			createLeafNode(grammarAccess.getVarDeclAccess().getNameIDTerminalRuleCall_3_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getVarDeclRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_3_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:395:2: ( '=' ( (lv_init_5_0= ruleExpr ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:395:4: '=' ( (lv_init_5_0= ruleExpr ) )
                    {
                    match(input,16,FOLLOW_16_in_ruleVarDecl667); 

                            createLeafNode(grammarAccess.getVarDeclAccess().getEqualsSignKeyword_4_0(), null); 
                        
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:399:1: ( (lv_init_5_0= ruleExpr ) )
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:400:1: (lv_init_5_0= ruleExpr )
                    {
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:400:1: (lv_init_5_0= ruleExpr )
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:401:3: lv_init_5_0= ruleExpr
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getVarDeclAccess().getInitExprParserRuleCall_4_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpr_in_ruleVarDecl688);
                    lv_init_5_0=ruleExpr();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getVarDeclRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"init",
                    	        		lv_init_5_0, 
                    	        		"Expr", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            match(input,17,FOLLOW_17_in_ruleVarDecl700); 

                    createLeafNode(grammarAccess.getVarDeclAccess().getSemicolonKeyword_5(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleVarDecl


    // $ANTLR start entryRuleType
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:435:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:436:2: (iv_ruleType= ruleType EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:437:2: iv_ruleType= ruleType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType736);
            iv_ruleType=ruleType();
            _fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType746); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleType


    // $ANTLR start ruleType
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:444:1: ruleType returns [EObject current=null] : (this_PrimitiveType_0= rulePrimitiveType | this_ArrayType_1= ruleArrayType ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveType_0 = null;

        EObject this_ArrayType_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:449:6: ( (this_PrimitiveType_0= rulePrimitiveType | this_ArrayType_1= ruleArrayType ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:450:1: (this_PrimitiveType_0= rulePrimitiveType | this_ArrayType_1= ruleArrayType )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:450:1: (this_PrimitiveType_0= rulePrimitiveType | this_ArrayType_1= ruleArrayType )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID||(LA5_0>=21 && LA5_0<=24)) ) {
                alt5=1;
            }
            else if ( (LA5_0==18) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("450:1: (this_PrimitiveType_0= rulePrimitiveType | this_ArrayType_1= ruleArrayType )", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:451:5: this_PrimitiveType_0= rulePrimitiveType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getPrimitiveTypeParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePrimitiveType_in_ruleType793);
                    this_PrimitiveType_0=rulePrimitiveType();
                    _fsp--;

                     
                            current = this_PrimitiveType_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:461:5: this_ArrayType_1= ruleArrayType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getArrayTypeParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleArrayType_in_ruleType820);
                    this_ArrayType_1=ruleArrayType();
                    _fsp--;

                     
                            current = this_ArrayType_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleType


    // $ANTLR start entryRulePrimitiveType
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:477:1: entryRulePrimitiveType returns [EObject current=null] : iv_rulePrimitiveType= rulePrimitiveType EOF ;
    public final EObject entryRulePrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveType = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:478:2: (iv_rulePrimitiveType= rulePrimitiveType EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:479:2: iv_rulePrimitiveType= rulePrimitiveType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPrimitiveTypeRule(), currentNode); 
            pushFollow(FOLLOW_rulePrimitiveType_in_entryRulePrimitiveType855);
            iv_rulePrimitiveType=rulePrimitiveType();
            _fsp--;

             current =iv_rulePrimitiveType; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveType865); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePrimitiveType


    // $ANTLR start rulePrimitiveType
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:486:1: rulePrimitiveType returns [EObject current=null] : (this_IntType_0= ruleIntType | this_BoolType_1= ruleBoolType | this_FloatType_2= ruleFloatType | this_EnumType_3= ruleEnumType | this_StringType_4= ruleStringType ) ;
    public final EObject rulePrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject this_IntType_0 = null;

        EObject this_BoolType_1 = null;

        EObject this_FloatType_2 = null;

        EObject this_EnumType_3 = null;

        EObject this_StringType_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:491:6: ( (this_IntType_0= ruleIntType | this_BoolType_1= ruleBoolType | this_FloatType_2= ruleFloatType | this_EnumType_3= ruleEnumType | this_StringType_4= ruleStringType ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:492:1: (this_IntType_0= ruleIntType | this_BoolType_1= ruleBoolType | this_FloatType_2= ruleFloatType | this_EnumType_3= ruleEnumType | this_StringType_4= ruleStringType )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:492:1: (this_IntType_0= ruleIntType | this_BoolType_1= ruleBoolType | this_FloatType_2= ruleFloatType | this_EnumType_3= ruleEnumType | this_StringType_4= ruleStringType )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt6=1;
                }
                break;
            case 22:
                {
                alt6=2;
                }
                break;
            case 23:
                {
                alt6=3;
                }
                break;
            case RULE_ID:
                {
                alt6=4;
                }
                break;
            case 24:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("492:1: (this_IntType_0= ruleIntType | this_BoolType_1= ruleBoolType | this_FloatType_2= ruleFloatType | this_EnumType_3= ruleEnumType | this_StringType_4= ruleStringType )", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:493:5: this_IntType_0= ruleIntType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPrimitiveTypeAccess().getIntTypeParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleIntType_in_rulePrimitiveType912);
                    this_IntType_0=ruleIntType();
                    _fsp--;

                     
                            current = this_IntType_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:503:5: this_BoolType_1= ruleBoolType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPrimitiveTypeAccess().getBoolTypeParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBoolType_in_rulePrimitiveType939);
                    this_BoolType_1=ruleBoolType();
                    _fsp--;

                     
                            current = this_BoolType_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:513:5: this_FloatType_2= ruleFloatType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPrimitiveTypeAccess().getFloatTypeParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFloatType_in_rulePrimitiveType966);
                    this_FloatType_2=ruleFloatType();
                    _fsp--;

                     
                            current = this_FloatType_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:523:5: this_EnumType_3= ruleEnumType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPrimitiveTypeAccess().getEnumTypeParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEnumType_in_rulePrimitiveType993);
                    this_EnumType_3=ruleEnumType();
                    _fsp--;

                     
                            current = this_EnumType_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:533:5: this_StringType_4= ruleStringType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPrimitiveTypeAccess().getStringTypeParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStringType_in_rulePrimitiveType1020);
                    this_StringType_4=ruleStringType();
                    _fsp--;

                     
                            current = this_StringType_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePrimitiveType


    // $ANTLR start entryRuleArrayType
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:549:1: entryRuleArrayType returns [EObject current=null] : iv_ruleArrayType= ruleArrayType EOF ;
    public final EObject entryRuleArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayType = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:550:2: (iv_ruleArrayType= ruleArrayType EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:551:2: iv_ruleArrayType= ruleArrayType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getArrayTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleArrayType_in_entryRuleArrayType1055);
            iv_ruleArrayType=ruleArrayType();
            _fsp--;

             current =iv_ruleArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayType1065); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleArrayType


    // $ANTLR start ruleArrayType
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:558:1: ruleArrayType returns [EObject current=null] : ( () 'array' '[' ( (lv_baseType_3_0= ruleType ) ) ']' ) ;
    public final EObject ruleArrayType() throws RecognitionException {
        EObject current = null;

        EObject lv_baseType_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:563:6: ( ( () 'array' '[' ( (lv_baseType_3_0= ruleType ) ) ']' ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:564:1: ( () 'array' '[' ( (lv_baseType_3_0= ruleType ) ) ']' )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:564:1: ( () 'array' '[' ( (lv_baseType_3_0= ruleType ) ) ']' )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:564:2: () 'array' '[' ( (lv_baseType_3_0= ruleType ) ) ']'
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:564:2: ()
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:565:5: 
            {
             
                    temp=factory.create(grammarAccess.getArrayTypeAccess().getArrayTypeAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getArrayTypeAccess().getArrayTypeAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,18,FOLLOW_18_in_ruleArrayType1109); 

                    createLeafNode(grammarAccess.getArrayTypeAccess().getArrayKeyword_1(), null); 
                
            match(input,19,FOLLOW_19_in_ruleArrayType1119); 

                    createLeafNode(grammarAccess.getArrayTypeAccess().getLeftSquareBracketKeyword_2(), null); 
                
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:583:1: ( (lv_baseType_3_0= ruleType ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:584:1: (lv_baseType_3_0= ruleType )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:584:1: (lv_baseType_3_0= ruleType )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:585:3: lv_baseType_3_0= ruleType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getArrayTypeAccess().getBaseTypeTypeParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleArrayType1140);
            lv_baseType_3_0=ruleType();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getArrayTypeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"baseType",
            	        		lv_baseType_3_0, 
            	        		"Type", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,20,FOLLOW_20_in_ruleArrayType1150); 

                    createLeafNode(grammarAccess.getArrayTypeAccess().getRightSquareBracketKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleArrayType


    // $ANTLR start entryRuleEnumType
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:619:1: entryRuleEnumType returns [EObject current=null] : iv_ruleEnumType= ruleEnumType EOF ;
    public final EObject entryRuleEnumType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumType = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:620:2: (iv_ruleEnumType= ruleEnumType EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:621:2: iv_ruleEnumType= ruleEnumType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEnumTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleEnumType_in_entryRuleEnumType1186);
            iv_ruleEnumType=ruleEnumType();
            _fsp--;

             current =iv_ruleEnumType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumType1196); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEnumType


    // $ANTLR start ruleEnumType
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:628:1: ruleEnumType returns [EObject current=null] : ( ( RULE_ID ) ) ;
    public final EObject ruleEnumType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:633:6: ( ( ( RULE_ID ) ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:634:1: ( ( RULE_ID ) )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:634:1: ( ( RULE_ID ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:635:1: ( RULE_ID )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:635:1: ( RULE_ID )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:636:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getEnumTypeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumType1238); 

            		createLeafNode(grammarAccess.getEnumTypeAccess().getEnumRefEnumDeclCrossReference_0(), "enumRef"); 
            	

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEnumType


    // $ANTLR start entryRuleIntType
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:656:1: entryRuleIntType returns [EObject current=null] : iv_ruleIntType= ruleIntType EOF ;
    public final EObject entryRuleIntType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntType = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:657:2: (iv_ruleIntType= ruleIntType EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:658:2: iv_ruleIntType= ruleIntType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getIntTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleIntType_in_entryRuleIntType1273);
            iv_ruleIntType=ruleIntType();
            _fsp--;

             current =iv_ruleIntType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntType1283); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleIntType


    // $ANTLR start ruleIntType
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:665:1: ruleIntType returns [EObject current=null] : ( () 'int' ) ;
    public final EObject ruleIntType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:670:6: ( ( () 'int' ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:671:1: ( () 'int' )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:671:1: ( () 'int' )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:671:2: () 'int'
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:671:2: ()
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:672:5: 
            {
             
                    temp=factory.create(grammarAccess.getIntTypeAccess().getIntTypeAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getIntTypeAccess().getIntTypeAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,21,FOLLOW_21_in_ruleIntType1327); 

                    createLeafNode(grammarAccess.getIntTypeAccess().getIntKeyword_1(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleIntType


    // $ANTLR start entryRuleBoolType
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:694:1: entryRuleBoolType returns [EObject current=null] : iv_ruleBoolType= ruleBoolType EOF ;
    public final EObject entryRuleBoolType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolType = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:695:2: (iv_ruleBoolType= ruleBoolType EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:696:2: iv_ruleBoolType= ruleBoolType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBoolTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleBoolType_in_entryRuleBoolType1363);
            iv_ruleBoolType=ruleBoolType();
            _fsp--;

             current =iv_ruleBoolType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolType1373); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBoolType


    // $ANTLR start ruleBoolType
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:703:1: ruleBoolType returns [EObject current=null] : ( () 'bool' ) ;
    public final EObject ruleBoolType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:708:6: ( ( () 'bool' ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:709:1: ( () 'bool' )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:709:1: ( () 'bool' )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:709:2: () 'bool'
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:709:2: ()
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:710:5: 
            {
             
                    temp=factory.create(grammarAccess.getBoolTypeAccess().getBoolTypeAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getBoolTypeAccess().getBoolTypeAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,22,FOLLOW_22_in_ruleBoolType1417); 

                    createLeafNode(grammarAccess.getBoolTypeAccess().getBoolKeyword_1(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleBoolType


    // $ANTLR start entryRuleFloatType
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:732:1: entryRuleFloatType returns [EObject current=null] : iv_ruleFloatType= ruleFloatType EOF ;
    public final EObject entryRuleFloatType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatType = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:733:2: (iv_ruleFloatType= ruleFloatType EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:734:2: iv_ruleFloatType= ruleFloatType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFloatTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleFloatType_in_entryRuleFloatType1453);
            iv_ruleFloatType=ruleFloatType();
            _fsp--;

             current =iv_ruleFloatType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatType1463); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFloatType


    // $ANTLR start ruleFloatType
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:741:1: ruleFloatType returns [EObject current=null] : ( () 'float' ) ;
    public final EObject ruleFloatType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:746:6: ( ( () 'float' ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:747:1: ( () 'float' )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:747:1: ( () 'float' )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:747:2: () 'float'
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:747:2: ()
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:748:5: 
            {
             
                    temp=factory.create(grammarAccess.getFloatTypeAccess().getFloatTypeAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getFloatTypeAccess().getFloatTypeAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,23,FOLLOW_23_in_ruleFloatType1507); 

                    createLeafNode(grammarAccess.getFloatTypeAccess().getFloatKeyword_1(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFloatType


    // $ANTLR start entryRuleStringType
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:770:1: entryRuleStringType returns [EObject current=null] : iv_ruleStringType= ruleStringType EOF ;
    public final EObject entryRuleStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringType = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:771:2: (iv_ruleStringType= ruleStringType EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:772:2: iv_ruleStringType= ruleStringType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStringTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleStringType_in_entryRuleStringType1543);
            iv_ruleStringType=ruleStringType();
            _fsp--;

             current =iv_ruleStringType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringType1553); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleStringType


    // $ANTLR start ruleStringType
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:779:1: ruleStringType returns [EObject current=null] : ( () 'string' ) ;
    public final EObject ruleStringType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:784:6: ( ( () 'string' ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:785:1: ( () 'string' )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:785:1: ( () 'string' )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:785:2: () 'string'
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:785:2: ()
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:786:5: 
            {
             
                    temp=factory.create(grammarAccess.getStringTypeAccess().getStringTypeAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getStringTypeAccess().getStringTypeAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,24,FOLLOW_24_in_ruleStringType1597); 

                    createLeafNode(grammarAccess.getStringTypeAccess().getStringKeyword_1(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleStringType


    // $ANTLR start entryRuleFormula
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:808:1: entryRuleFormula returns [EObject current=null] : iv_ruleFormula= ruleFormula EOF ;
    public final EObject entryRuleFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormula = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:809:2: (iv_ruleFormula= ruleFormula EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:810:2: iv_ruleFormula= ruleFormula EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFormulaRule(), currentNode); 
            pushFollow(FOLLOW_ruleFormula_in_entryRuleFormula1633);
            iv_ruleFormula=ruleFormula();
            _fsp--;

             current =iv_ruleFormula; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormula1643); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFormula


    // $ANTLR start ruleFormula
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:817:1: ruleFormula returns [EObject current=null] : ( 'calc' ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) '=' ( (lv_expr_4_0= ruleExpr ) ) ';' ) ;
    public final EObject ruleFormula() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_type_1_0 = null;

        EObject lv_expr_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:822:6: ( ( 'calc' ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) '=' ( (lv_expr_4_0= ruleExpr ) ) ';' ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:823:1: ( 'calc' ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) '=' ( (lv_expr_4_0= ruleExpr ) ) ';' )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:823:1: ( 'calc' ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) '=' ( (lv_expr_4_0= ruleExpr ) ) ';' )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:823:3: 'calc' ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) '=' ( (lv_expr_4_0= ruleExpr ) ) ';'
            {
            match(input,25,FOLLOW_25_in_ruleFormula1678); 

                    createLeafNode(grammarAccess.getFormulaAccess().getCalcKeyword_0(), null); 
                
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:827:1: ( (lv_type_1_0= ruleType ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:828:1: (lv_type_1_0= ruleType )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:828:1: (lv_type_1_0= ruleType )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:829:3: lv_type_1_0= ruleType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getFormulaAccess().getTypeTypeParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleFormula1699);
            lv_type_1_0=ruleType();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFormulaRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"type",
            	        		lv_type_1_0, 
            	        		"Type", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:851:2: ( (lv_name_2_0= RULE_ID ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:852:1: (lv_name_2_0= RULE_ID )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:852:1: (lv_name_2_0= RULE_ID )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:853:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFormula1716); 

            			createLeafNode(grammarAccess.getFormulaAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFormulaRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_2_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,16,FOLLOW_16_in_ruleFormula1731); 

                    createLeafNode(grammarAccess.getFormulaAccess().getEqualsSignKeyword_3(), null); 
                
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:879:1: ( (lv_expr_4_0= ruleExpr ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:880:1: (lv_expr_4_0= ruleExpr )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:880:1: (lv_expr_4_0= ruleExpr )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:881:3: lv_expr_4_0= ruleExpr
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getFormulaAccess().getExprExprParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleFormula1752);
            lv_expr_4_0=ruleExpr();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFormulaRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"expr",
            	        		lv_expr_4_0, 
            	        		"Expr", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,17,FOLLOW_17_in_ruleFormula1762); 

                    createLeafNode(grammarAccess.getFormulaAccess().getSemicolonKeyword_5(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFormula


    // $ANTLR start entryRuleExpr
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:915:1: entryRuleExpr returns [EObject current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final EObject entryRuleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:916:2: (iv_ruleExpr= ruleExpr EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:917:2: iv_ruleExpr= ruleExpr EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExprRule(), currentNode); 
            pushFollow(FOLLOW_ruleExpr_in_entryRuleExpr1798);
            iv_ruleExpr=ruleExpr();
            _fsp--;

             current =iv_ruleExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpr1808); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleExpr


    // $ANTLR start ruleExpr
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:924:1: ruleExpr returns [EObject current=null] : this_Addition_0= ruleAddition ;
    public final EObject ruleExpr() throws RecognitionException {
        EObject current = null;

        EObject this_Addition_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:929:6: (this_Addition_0= ruleAddition )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:931:5: this_Addition_0= ruleAddition
            {
             
                    currentNode=createCompositeNode(grammarAccess.getExprAccess().getAdditionParserRuleCall(), currentNode); 
                
            pushFollow(FOLLOW_ruleAddition_in_ruleExpr1854);
            this_Addition_0=ruleAddition();
            _fsp--;

             
                    current = this_Addition_0; 
                    currentNode = currentNode.getParent();
                

            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleExpr


    // $ANTLR start entryRuleAddition
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:947:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:948:2: (iv_ruleAddition= ruleAddition EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:949:2: iv_ruleAddition= ruleAddition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAdditionRule(), currentNode); 
            pushFollow(FOLLOW_ruleAddition_in_entryRuleAddition1888);
            iv_ruleAddition=ruleAddition();
            _fsp--;

             current =iv_ruleAddition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddition1898); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAddition


    // $ANTLR start ruleAddition
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:956:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( () '+' ( (lv_right_3_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        EObject this_Multiplication_0 = null;

        EObject lv_right_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:961:6: ( (this_Multiplication_0= ruleMultiplication ( () '+' ( (lv_right_3_0= ruleMultiplication ) ) )* ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:962:1: (this_Multiplication_0= ruleMultiplication ( () '+' ( (lv_right_3_0= ruleMultiplication ) ) )* )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:962:1: (this_Multiplication_0= ruleMultiplication ( () '+' ( (lv_right_3_0= ruleMultiplication ) ) )* )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:963:5: this_Multiplication_0= ruleMultiplication ( () '+' ( (lv_right_3_0= ruleMultiplication ) ) )*
            {
             
                    currentNode=createCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleMultiplication_in_ruleAddition1945);
            this_Multiplication_0=ruleMultiplication();
            _fsp--;

             
                    current = this_Multiplication_0; 
                    currentNode = currentNode.getParent();
                
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:971:1: ( () '+' ( (lv_right_3_0= ruleMultiplication ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==26) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:971:2: () '+' ( (lv_right_3_0= ruleMultiplication ) )
            	    {
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:971:2: ()
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:972:5: 
            	    {
            	     
            	            temp=factory.create(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0().getType().getClassifier());
            	            try {
            	            	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
            	            } catch(ValueConverterException vce) {
            	            	handleValueConverterException(vce);
            	            }
            	            current = temp; 
            	            temp = null;
            	            CompositeNode newNode = createCompositeNode(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0(), currentNode.getParent());
            	        newNode.getChildren().add(currentNode);
            	        moveLookaheadInfo(currentNode, newNode);
            	        currentNode = newNode; 
            	            associateNodeWithAstElement(currentNode, current); 
            	        

            	    }

            	    match(input,26,FOLLOW_26_in_ruleAddition1964); 

            	            createLeafNode(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_1(), null); 
            	        
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:991:1: ( (lv_right_3_0= ruleMultiplication ) )
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:992:1: (lv_right_3_0= ruleMultiplication )
            	    {
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:992:1: (lv_right_3_0= ruleMultiplication )
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:993:3: lv_right_3_0= ruleMultiplication
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleMultiplication_in_ruleAddition1985);
            	    lv_right_3_0=ruleMultiplication();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getAdditionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"right",
            	    	        		lv_right_3_0, 
            	    	        		"Multiplication", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAddition


    // $ANTLR start entryRuleMultiplication
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1023:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1024:2: (iv_ruleMultiplication= ruleMultiplication EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1025:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMultiplicationRule(), currentNode); 
            pushFollow(FOLLOW_ruleMultiplication_in_entryRuleMultiplication2023);
            iv_ruleMultiplication=ruleMultiplication();
            _fsp--;

             current =iv_ruleMultiplication; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplication2033); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleMultiplication


    // $ANTLR start ruleMultiplication
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1032:1: ruleMultiplication returns [EObject current=null] : (this_PostfixOperators_0= rulePostfixOperators ( () '*' ( (lv_right_3_0= rulePostfixOperators ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject this_PostfixOperators_0 = null;

        EObject lv_right_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1037:6: ( (this_PostfixOperators_0= rulePostfixOperators ( () '*' ( (lv_right_3_0= rulePostfixOperators ) ) )* ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1038:1: (this_PostfixOperators_0= rulePostfixOperators ( () '*' ( (lv_right_3_0= rulePostfixOperators ) ) )* )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1038:1: (this_PostfixOperators_0= rulePostfixOperators ( () '*' ( (lv_right_3_0= rulePostfixOperators ) ) )* )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1039:5: this_PostfixOperators_0= rulePostfixOperators ( () '*' ( (lv_right_3_0= rulePostfixOperators ) ) )*
            {
             
                    currentNode=createCompositeNode(grammarAccess.getMultiplicationAccess().getPostfixOperatorsParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_rulePostfixOperators_in_ruleMultiplication2080);
            this_PostfixOperators_0=rulePostfixOperators();
            _fsp--;

             
                    current = this_PostfixOperators_0; 
                    currentNode = currentNode.getParent();
                
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1047:1: ( () '*' ( (lv_right_3_0= rulePostfixOperators ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==27) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1047:2: () '*' ( (lv_right_3_0= rulePostfixOperators ) )
            	    {
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1047:2: ()
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1048:5: 
            	    {
            	     
            	            temp=factory.create(grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0().getType().getClassifier());
            	            try {
            	            	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
            	            } catch(ValueConverterException vce) {
            	            	handleValueConverterException(vce);
            	            }
            	            current = temp; 
            	            temp = null;
            	            CompositeNode newNode = createCompositeNode(grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0(), currentNode.getParent());
            	        newNode.getChildren().add(currentNode);
            	        moveLookaheadInfo(currentNode, newNode);
            	        currentNode = newNode; 
            	            associateNodeWithAstElement(currentNode, current); 
            	        

            	    }

            	    match(input,27,FOLLOW_27_in_ruleMultiplication2099); 

            	            createLeafNode(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_1(), null); 
            	        
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1067:1: ( (lv_right_3_0= rulePostfixOperators ) )
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1068:1: (lv_right_3_0= rulePostfixOperators )
            	    {
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1068:1: (lv_right_3_0= rulePostfixOperators )
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1069:3: lv_right_3_0= rulePostfixOperators
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getMultiplicationAccess().getRightPostfixOperatorsParserRuleCall_1_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_rulePostfixOperators_in_ruleMultiplication2120);
            	    lv_right_3_0=rulePostfixOperators();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getMultiplicationRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"right",
            	    	        		lv_right_3_0, 
            	    	        		"PostfixOperators", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleMultiplication


    // $ANTLR start entryRulePostfixOperators
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1099:1: entryRulePostfixOperators returns [EObject current=null] : iv_rulePostfixOperators= rulePostfixOperators EOF ;
    public final EObject entryRulePostfixOperators() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostfixOperators = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1100:2: (iv_rulePostfixOperators= rulePostfixOperators EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1101:2: iv_rulePostfixOperators= rulePostfixOperators EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPostfixOperatorsRule(), currentNode); 
            pushFollow(FOLLOW_rulePostfixOperators_in_entryRulePostfixOperators2158);
            iv_rulePostfixOperators=rulePostfixOperators();
            _fsp--;

             current =iv_rulePostfixOperators; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePostfixOperators2168); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePostfixOperators


    // $ANTLR start rulePostfixOperators
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1108:1: rulePostfixOperators returns [EObject current=null] : (this_Atomic_0= ruleAtomic ( () '[' ( (lv_index_3_0= ruleExpr ) ) ']' )? ) ;
    public final EObject rulePostfixOperators() throws RecognitionException {
        EObject current = null;

        EObject this_Atomic_0 = null;

        EObject lv_index_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1113:6: ( (this_Atomic_0= ruleAtomic ( () '[' ( (lv_index_3_0= ruleExpr ) ) ']' )? ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1114:1: (this_Atomic_0= ruleAtomic ( () '[' ( (lv_index_3_0= ruleExpr ) ) ']' )? )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1114:1: (this_Atomic_0= ruleAtomic ( () '[' ( (lv_index_3_0= ruleExpr ) ) ']' )? )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1115:5: this_Atomic_0= ruleAtomic ( () '[' ( (lv_index_3_0= ruleExpr ) ) ']' )?
            {
             
                    currentNode=createCompositeNode(grammarAccess.getPostfixOperatorsAccess().getAtomicParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleAtomic_in_rulePostfixOperators2215);
            this_Atomic_0=ruleAtomic();
            _fsp--;

             
                    current = this_Atomic_0; 
                    currentNode = currentNode.getParent();
                
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1123:1: ( () '[' ( (lv_index_3_0= ruleExpr ) ) ']' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1123:2: () '[' ( (lv_index_3_0= ruleExpr ) ) ']'
                    {
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1123:2: ()
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1124:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getPostfixOperatorsAccess().getArrayAccessExprAction_1_0().getType().getClassifier());
                            try {
                            	factory.set(temp, "expr", current, null /*ParserRule*/, currentNode);
                            } catch(ValueConverterException vce) {
                            	handleValueConverterException(vce);
                            }
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getPostfixOperatorsAccess().getArrayAccessExprAction_1_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    match(input,19,FOLLOW_19_in_rulePostfixOperators2234); 

                            createLeafNode(grammarAccess.getPostfixOperatorsAccess().getLeftSquareBracketKeyword_1_1(), null); 
                        
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1143:1: ( (lv_index_3_0= ruleExpr ) )
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1144:1: (lv_index_3_0= ruleExpr )
                    {
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1144:1: (lv_index_3_0= ruleExpr )
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1145:3: lv_index_3_0= ruleExpr
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getPostfixOperatorsAccess().getIndexExprParserRuleCall_1_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpr_in_rulePostfixOperators2255);
                    lv_index_3_0=ruleExpr();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPostfixOperatorsRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"index",
                    	        		lv_index_3_0, 
                    	        		"Expr", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,20,FOLLOW_20_in_rulePostfixOperators2265); 

                            createLeafNode(grammarAccess.getPostfixOperatorsAccess().getRightSquareBracketKeyword_1_3(), null); 
                        

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePostfixOperators


    // $ANTLR start entryRuleAtomic
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1179:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1180:2: (iv_ruleAtomic= ruleAtomic EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1181:2: iv_ruleAtomic= ruleAtomic EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAtomicRule(), currentNode); 
            pushFollow(FOLLOW_ruleAtomic_in_entryRuleAtomic2303);
            iv_ruleAtomic=ruleAtomic();
            _fsp--;

             current =iv_ruleAtomic; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomic2313); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAtomic


    // $ANTLR start ruleAtomic
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1188:1: ruleAtomic returns [EObject current=null] : ( ( () ( ( ruleQID ) ) ) | ( () ( (lv_value_3_0= RULE_NUMBER ) ) ) | ( () ( (lv_value_5_0= RULE_STRING ) ) ) ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        Token lv_value_3_0=null;
        Token lv_value_5_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1193:6: ( ( ( () ( ( ruleQID ) ) ) | ( () ( (lv_value_3_0= RULE_NUMBER ) ) ) | ( () ( (lv_value_5_0= RULE_STRING ) ) ) ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1194:1: ( ( () ( ( ruleQID ) ) ) | ( () ( (lv_value_3_0= RULE_NUMBER ) ) ) | ( () ( (lv_value_5_0= RULE_STRING ) ) ) )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1194:1: ( ( () ( ( ruleQID ) ) ) | ( () ( (lv_value_3_0= RULE_NUMBER ) ) ) | ( () ( (lv_value_5_0= RULE_STRING ) ) ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt10=1;
                }
                break;
            case RULE_NUMBER:
                {
                alt10=2;
                }
                break;
            case RULE_STRING:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1194:1: ( ( () ( ( ruleQID ) ) ) | ( () ( (lv_value_3_0= RULE_NUMBER ) ) ) | ( () ( (lv_value_5_0= RULE_STRING ) ) ) )", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1194:2: ( () ( ( ruleQID ) ) )
                    {
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1194:2: ( () ( ( ruleQID ) ) )
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1194:3: () ( ( ruleQID ) )
                    {
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1194:3: ()
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1195:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getAtomicAccess().getSymbolRefAction_0_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getAtomicAccess().getSymbolRefAction_0_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1205:2: ( ( ruleQID ) )
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1206:1: ( ruleQID )
                    {
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1206:1: ( ruleQID )
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1207:3: ruleQID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getAtomicRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAtomicAccess().getSymbolSymbolCrossReference_0_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleQID_in_ruleAtomic2371);
                    ruleQID();
                    _fsp--;

                     
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1222:6: ( () ( (lv_value_3_0= RULE_NUMBER ) ) )
                    {
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1222:6: ( () ( (lv_value_3_0= RULE_NUMBER ) ) )
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1222:7: () ( (lv_value_3_0= RULE_NUMBER ) )
                    {
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1222:7: ()
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1223:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getAtomicAccess().getNumberLiteralAction_1_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getAtomicAccess().getNumberLiteralAction_1_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1233:2: ( (lv_value_3_0= RULE_NUMBER ) )
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1234:1: (lv_value_3_0= RULE_NUMBER )
                    {
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1234:1: (lv_value_3_0= RULE_NUMBER )
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1235:3: lv_value_3_0= RULE_NUMBER
                    {
                    lv_value_3_0=(Token)input.LT(1);
                    match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleAtomic2405); 

                    			createLeafNode(grammarAccess.getAtomicAccess().getValueNUMBERTerminalRuleCall_1_1_0(), "value"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAtomicRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"value",
                    	        		lv_value_3_0, 
                    	        		"NUMBER", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1258:6: ( () ( (lv_value_5_0= RULE_STRING ) ) )
                    {
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1258:6: ( () ( (lv_value_5_0= RULE_STRING ) ) )
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1258:7: () ( (lv_value_5_0= RULE_STRING ) )
                    {
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1258:7: ()
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1259:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getAtomicAccess().getStringLiteralAction_2_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getAtomicAccess().getStringLiteralAction_2_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1269:2: ( (lv_value_5_0= RULE_STRING ) )
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1270:1: (lv_value_5_0= RULE_STRING )
                    {
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1270:1: (lv_value_5_0= RULE_STRING )
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1271:3: lv_value_5_0= RULE_STRING
                    {
                    lv_value_5_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAtomic2444); 

                    			createLeafNode(grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_2_1_0(), "value"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAtomicRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"value",
                    	        		lv_value_5_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAtomic


    // $ANTLR start entryRuleQID
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1301:1: entryRuleQID returns [String current=null] : iv_ruleQID= ruleQID EOF ;
    public final String entryRuleQID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQID = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1302:2: (iv_ruleQID= ruleQID EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1303:2: iv_ruleQID= ruleQID EOF
            {
             currentNode = createCompositeNode(grammarAccess.getQIDRule(), currentNode); 
            pushFollow(FOLLOW_ruleQID_in_entryRuleQID2487);
            iv_ruleQID=ruleQID();
            _fsp--;

             current =iv_ruleQID.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQID2498); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleQID


    // $ANTLR start ruleQID
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1310:1: ruleQID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1315:6: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1316:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1316:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1316:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQID2538); 

            		current.merge(this_ID_0);
                
             
                createLeafNode(grammarAccess.getQIDAccess().getIDTerminalRuleCall_0(), null); 
                
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1323:1: (kw= '.' this_ID_2= RULE_ID )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==28) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1324:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,28,FOLLOW_28_in_ruleQID2557); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getQIDAccess().getFullStopKeyword_1_0(), null); 
            	        
            	    this_ID_2=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQID2572); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        createLeafNode(grammarAccess.getQIDAccess().getIDTerminalRuleCall_1_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleQID


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_ruleModel130 = new BitSet(new long[]{0x0000000002009002L});
    public static final BitSet FOLLOW_ruleElement_in_entryRuleElement166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElement176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDecl_in_ruleElement223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormula_in_ruleElement250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumDecl_in_ruleElement277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumDecl_in_entryRuleEnumDecl312 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumDecl322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleEnumDecl357 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumDecl374 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEnumDecl389 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleEnumLiteral_in_ruleEnumDecl410 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_14_in_ruleEnumDecl421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumLiteral_in_entryRuleEnumLiteral457 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumLiteral467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumLiteral518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDecl_in_entryRuleVarDecl559 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarDecl569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleVarDecl613 = new BitSet(new long[]{0x0000000001E40010L});
    public static final BitSet FOLLOW_ruleType_in_ruleVarDecl634 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVarDecl651 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleVarDecl667 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleVarDecl688 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleVarDecl700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType736 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_ruleType793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayType_in_ruleType820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_entryRulePrimitiveType855 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveType865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntType_in_rulePrimitiveType912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolType_in_rulePrimitiveType939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatType_in_rulePrimitiveType966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumType_in_rulePrimitiveType993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_rulePrimitiveType1020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayType_in_entryRuleArrayType1055 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayType1065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleArrayType1109 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleArrayType1119 = new BitSet(new long[]{0x0000000001E40010L});
    public static final BitSet FOLLOW_ruleType_in_ruleArrayType1140 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleArrayType1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumType_in_entryRuleEnumType1186 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumType1196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumType1238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntType_in_entryRuleIntType1273 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntType1283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleIntType1327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolType_in_entryRuleBoolType1363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolType1373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleBoolType1417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatType_in_entryRuleFloatType1453 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatType1463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleFloatType1507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_entryRuleStringType1543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringType1553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleStringType1597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormula_in_entryRuleFormula1633 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormula1643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleFormula1678 = new BitSet(new long[]{0x0000000001E40010L});
    public static final BitSet FOLLOW_ruleType_in_ruleFormula1699 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFormula1716 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFormula1731 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleFormula1752 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleFormula1762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_entryRuleExpr1798 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpr1808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleExpr1854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_entryRuleAddition1888 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddition1898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition1945 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleAddition1964 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition1985 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_entryRuleMultiplication2023 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplication2033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePostfixOperators_in_ruleMultiplication2080 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleMultiplication2099 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rulePostfixOperators_in_ruleMultiplication2120 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rulePostfixOperators_in_entryRulePostfixOperators2158 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePostfixOperators2168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_rulePostfixOperators2215 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_rulePostfixOperators2234 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleExpr_in_rulePostfixOperators2255 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_rulePostfixOperators2265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_entryRuleAtomic2303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomic2313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQID_in_ruleAtomic2371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleAtomic2405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAtomic2444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQID_in_entryRuleQID2487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQID2498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQID2538 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleQID2557 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQID2572 = new BitSet(new long[]{0x0000000010000002L});

}