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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_NUMBER", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'assert'", "';'", "'enum'", "'{'", "'}'", "'var'", "'='", "'array'", "'['", "']'", "'int'", "'bool'", "'float'", "'string'", "'calc'", "'=='", "'+'", "'*'", "'.'"
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
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:86:1: ruleModel returns [EObject current=null] : ( 'model' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleElement ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_elements_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:91:6: ( ( 'model' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleElement ) )* ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:92:1: ( 'model' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleElement ) )* )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:92:1: ( 'model' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleElement ) )* )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:92:3: 'model' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleElement ) )*
            {
            match(input,12,FOLLOW_12_in_ruleModel120); 

                    createLeafNode(grammarAccess.getModelAccess().getModelKeyword_0(), null); 
                
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:96:1: ( (lv_name_1_0= RULE_ID ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:97:1: (lv_name_1_0= RULE_ID )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:97:1: (lv_name_1_0= RULE_ID )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:98:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleModel137); 

            			createLeafNode(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
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

            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:120:2: ( (lv_elements_2_0= ruleElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13||LA1_0==15||LA1_0==18||LA1_0==27) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:121:1: (lv_elements_2_0= ruleElement )
            	    {
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:121:1: (lv_elements_2_0= ruleElement )
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:122:3: lv_elements_2_0= ruleElement
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getElementsElementParserRuleCall_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleElement_in_ruleModel163);
            	    lv_elements_2_0=ruleElement();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"elements",
            	    	        		lv_elements_2_0, 
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
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:152:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:153:2: (iv_ruleElement= ruleElement EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:154:2: iv_ruleElement= ruleElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getElementRule(), currentNode); 
            pushFollow(FOLLOW_ruleElement_in_entryRuleElement200);
            iv_ruleElement=ruleElement();
            _fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElement210); 

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
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:161:1: ruleElement returns [EObject current=null] : (this_VarDecl_0= ruleVarDecl | this_Formula_1= ruleFormula | this_EnumDecl_2= ruleEnumDecl | this_Assert_3= ruleAssert ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_VarDecl_0 = null;

        EObject this_Formula_1 = null;

        EObject this_EnumDecl_2 = null;

        EObject this_Assert_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:166:6: ( (this_VarDecl_0= ruleVarDecl | this_Formula_1= ruleFormula | this_EnumDecl_2= ruleEnumDecl | this_Assert_3= ruleAssert ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:167:1: (this_VarDecl_0= ruleVarDecl | this_Formula_1= ruleFormula | this_EnumDecl_2= ruleEnumDecl | this_Assert_3= ruleAssert )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:167:1: (this_VarDecl_0= ruleVarDecl | this_Formula_1= ruleFormula | this_EnumDecl_2= ruleEnumDecl | this_Assert_3= ruleAssert )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt2=1;
                }
                break;
            case 27:
                {
                alt2=2;
                }
                break;
            case 15:
                {
                alt2=3;
                }
                break;
            case 13:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("167:1: (this_VarDecl_0= ruleVarDecl | this_Formula_1= ruleFormula | this_EnumDecl_2= ruleEnumDecl | this_Assert_3= ruleAssert )", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:168:5: this_VarDecl_0= ruleVarDecl
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getElementAccess().getVarDeclParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleVarDecl_in_ruleElement257);
                    this_VarDecl_0=ruleVarDecl();
                    _fsp--;

                     
                            current = this_VarDecl_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:178:5: this_Formula_1= ruleFormula
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getElementAccess().getFormulaParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFormula_in_ruleElement284);
                    this_Formula_1=ruleFormula();
                    _fsp--;

                     
                            current = this_Formula_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:188:5: this_EnumDecl_2= ruleEnumDecl
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getElementAccess().getEnumDeclParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEnumDecl_in_ruleElement311);
                    this_EnumDecl_2=ruleEnumDecl();
                    _fsp--;

                     
                            current = this_EnumDecl_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:198:5: this_Assert_3= ruleAssert
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getElementAccess().getAssertParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAssert_in_ruleElement338);
                    this_Assert_3=ruleAssert();
                    _fsp--;

                     
                            current = this_Assert_3; 
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


    // $ANTLR start entryRuleAssert
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:214:1: entryRuleAssert returns [EObject current=null] : iv_ruleAssert= ruleAssert EOF ;
    public final EObject entryRuleAssert() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssert = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:215:2: (iv_ruleAssert= ruleAssert EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:216:2: iv_ruleAssert= ruleAssert EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAssertRule(), currentNode); 
            pushFollow(FOLLOW_ruleAssert_in_entryRuleAssert373);
            iv_ruleAssert=ruleAssert();
            _fsp--;

             current =iv_ruleAssert; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssert383); 

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
    // $ANTLR end entryRuleAssert


    // $ANTLR start ruleAssert
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:223:1: ruleAssert returns [EObject current=null] : ( 'assert' ( (lv_expr_1_0= ruleExpr ) ) ';' ) ;
    public final EObject ruleAssert() throws RecognitionException {
        EObject current = null;

        EObject lv_expr_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:228:6: ( ( 'assert' ( (lv_expr_1_0= ruleExpr ) ) ';' ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:229:1: ( 'assert' ( (lv_expr_1_0= ruleExpr ) ) ';' )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:229:1: ( 'assert' ( (lv_expr_1_0= ruleExpr ) ) ';' )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:229:3: 'assert' ( (lv_expr_1_0= ruleExpr ) ) ';'
            {
            match(input,13,FOLLOW_13_in_ruleAssert418); 

                    createLeafNode(grammarAccess.getAssertAccess().getAssertKeyword_0(), null); 
                
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:233:1: ( (lv_expr_1_0= ruleExpr ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:234:1: (lv_expr_1_0= ruleExpr )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:234:1: (lv_expr_1_0= ruleExpr )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:235:3: lv_expr_1_0= ruleExpr
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAssertAccess().getExprExprParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleAssert439);
            lv_expr_1_0=ruleExpr();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAssertRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"expr",
            	        		lv_expr_1_0, 
            	        		"Expr", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,14,FOLLOW_14_in_ruleAssert449); 

                    createLeafNode(grammarAccess.getAssertAccess().getSemicolonKeyword_2(), null); 
                

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
    // $ANTLR end ruleAssert


    // $ANTLR start entryRuleEnumDecl
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:269:1: entryRuleEnumDecl returns [EObject current=null] : iv_ruleEnumDecl= ruleEnumDecl EOF ;
    public final EObject entryRuleEnumDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumDecl = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:270:2: (iv_ruleEnumDecl= ruleEnumDecl EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:271:2: iv_ruleEnumDecl= ruleEnumDecl EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEnumDeclRule(), currentNode); 
            pushFollow(FOLLOW_ruleEnumDecl_in_entryRuleEnumDecl485);
            iv_ruleEnumDecl=ruleEnumDecl();
            _fsp--;

             current =iv_ruleEnumDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumDecl495); 

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
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:278:1: ruleEnumDecl returns [EObject current=null] : ( 'enum' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_literals_3_0= ruleEnumLiteral ) )* '}' ) ;
    public final EObject ruleEnumDecl() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_literals_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:283:6: ( ( 'enum' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_literals_3_0= ruleEnumLiteral ) )* '}' ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:284:1: ( 'enum' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_literals_3_0= ruleEnumLiteral ) )* '}' )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:284:1: ( 'enum' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_literals_3_0= ruleEnumLiteral ) )* '}' )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:284:3: 'enum' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_literals_3_0= ruleEnumLiteral ) )* '}'
            {
            match(input,15,FOLLOW_15_in_ruleEnumDecl530); 

                    createLeafNode(grammarAccess.getEnumDeclAccess().getEnumKeyword_0(), null); 
                
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:288:1: ( (lv_name_1_0= RULE_ID ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:289:1: (lv_name_1_0= RULE_ID )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:289:1: (lv_name_1_0= RULE_ID )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:290:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumDecl547); 

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

            match(input,16,FOLLOW_16_in_ruleEnumDecl562); 

                    createLeafNode(grammarAccess.getEnumDeclAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:316:1: ( (lv_literals_3_0= ruleEnumLiteral ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:317:1: (lv_literals_3_0= ruleEnumLiteral )
            	    {
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:317:1: (lv_literals_3_0= ruleEnumLiteral )
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:318:3: lv_literals_3_0= ruleEnumLiteral
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getEnumDeclAccess().getLiteralsEnumLiteralParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleEnumLiteral_in_ruleEnumDecl583);
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

            match(input,17,FOLLOW_17_in_ruleEnumDecl594); 

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
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:352:1: entryRuleEnumLiteral returns [EObject current=null] : iv_ruleEnumLiteral= ruleEnumLiteral EOF ;
    public final EObject entryRuleEnumLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumLiteral = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:353:2: (iv_ruleEnumLiteral= ruleEnumLiteral EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:354:2: iv_ruleEnumLiteral= ruleEnumLiteral EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEnumLiteralRule(), currentNode); 
            pushFollow(FOLLOW_ruleEnumLiteral_in_entryRuleEnumLiteral630);
            iv_ruleEnumLiteral=ruleEnumLiteral();
            _fsp--;

             current =iv_ruleEnumLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumLiteral640); 

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
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:361:1: ruleEnumLiteral returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEnumLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:366:6: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:367:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:367:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:367:2: () ( (lv_name_1_0= RULE_ID ) )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:367:2: ()
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:368:5: 
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

            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:378:2: ( (lv_name_1_0= RULE_ID ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:379:1: (lv_name_1_0= RULE_ID )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:379:1: (lv_name_1_0= RULE_ID )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:380:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumLiteral691); 

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
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:410:1: entryRuleVarDecl returns [EObject current=null] : iv_ruleVarDecl= ruleVarDecl EOF ;
    public final EObject entryRuleVarDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDecl = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:411:2: (iv_ruleVarDecl= ruleVarDecl EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:412:2: iv_ruleVarDecl= ruleVarDecl EOF
            {
             currentNode = createCompositeNode(grammarAccess.getVarDeclRule(), currentNode); 
            pushFollow(FOLLOW_ruleVarDecl_in_entryRuleVarDecl732);
            iv_ruleVarDecl=ruleVarDecl();
            _fsp--;

             current =iv_ruleVarDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarDecl742); 

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
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:419:1: ruleVarDecl returns [EObject current=null] : ( () 'var' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) ( '=' ( (lv_init_5_0= ruleExpr ) ) )? ';' ) ;
    public final EObject ruleVarDecl() throws RecognitionException {
        EObject current = null;

        Token lv_name_3_0=null;
        EObject lv_type_2_0 = null;

        EObject lv_init_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:424:6: ( ( () 'var' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) ( '=' ( (lv_init_5_0= ruleExpr ) ) )? ';' ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:425:1: ( () 'var' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) ( '=' ( (lv_init_5_0= ruleExpr ) ) )? ';' )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:425:1: ( () 'var' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) ( '=' ( (lv_init_5_0= ruleExpr ) ) )? ';' )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:425:2: () 'var' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) ( '=' ( (lv_init_5_0= ruleExpr ) ) )? ';'
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:425:2: ()
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:426:5: 
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

            match(input,18,FOLLOW_18_in_ruleVarDecl786); 

                    createLeafNode(grammarAccess.getVarDeclAccess().getVarKeyword_1(), null); 
                
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:440:1: ( (lv_type_2_0= ruleType ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:441:1: (lv_type_2_0= ruleType )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:441:1: (lv_type_2_0= ruleType )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:442:3: lv_type_2_0= ruleType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getVarDeclAccess().getTypeTypeParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleVarDecl807);
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

            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:464:2: ( (lv_name_3_0= RULE_ID ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:465:1: (lv_name_3_0= RULE_ID )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:465:1: (lv_name_3_0= RULE_ID )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:466:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVarDecl824); 

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

            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:488:2: ( '=' ( (lv_init_5_0= ruleExpr ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:488:4: '=' ( (lv_init_5_0= ruleExpr ) )
                    {
                    match(input,19,FOLLOW_19_in_ruleVarDecl840); 

                            createLeafNode(grammarAccess.getVarDeclAccess().getEqualsSignKeyword_4_0(), null); 
                        
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:492:1: ( (lv_init_5_0= ruleExpr ) )
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:493:1: (lv_init_5_0= ruleExpr )
                    {
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:493:1: (lv_init_5_0= ruleExpr )
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:494:3: lv_init_5_0= ruleExpr
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getVarDeclAccess().getInitExprParserRuleCall_4_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpr_in_ruleVarDecl861);
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

            match(input,14,FOLLOW_14_in_ruleVarDecl873); 

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
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:528:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:529:2: (iv_ruleType= ruleType EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:530:2: iv_ruleType= ruleType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType909);
            iv_ruleType=ruleType();
            _fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType919); 

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
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:537:1: ruleType returns [EObject current=null] : (this_PrimitiveType_0= rulePrimitiveType | this_ArrayType_1= ruleArrayType ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveType_0 = null;

        EObject this_ArrayType_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:542:6: ( (this_PrimitiveType_0= rulePrimitiveType | this_ArrayType_1= ruleArrayType ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:543:1: (this_PrimitiveType_0= rulePrimitiveType | this_ArrayType_1= ruleArrayType )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:543:1: (this_PrimitiveType_0= rulePrimitiveType | this_ArrayType_1= ruleArrayType )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID||(LA5_0>=23 && LA5_0<=26)) ) {
                alt5=1;
            }
            else if ( (LA5_0==20) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("543:1: (this_PrimitiveType_0= rulePrimitiveType | this_ArrayType_1= ruleArrayType )", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:544:5: this_PrimitiveType_0= rulePrimitiveType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getPrimitiveTypeParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePrimitiveType_in_ruleType966);
                    this_PrimitiveType_0=rulePrimitiveType();
                    _fsp--;

                     
                            current = this_PrimitiveType_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:554:5: this_ArrayType_1= ruleArrayType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getArrayTypeParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleArrayType_in_ruleType993);
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
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:570:1: entryRulePrimitiveType returns [EObject current=null] : iv_rulePrimitiveType= rulePrimitiveType EOF ;
    public final EObject entryRulePrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveType = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:571:2: (iv_rulePrimitiveType= rulePrimitiveType EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:572:2: iv_rulePrimitiveType= rulePrimitiveType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPrimitiveTypeRule(), currentNode); 
            pushFollow(FOLLOW_rulePrimitiveType_in_entryRulePrimitiveType1028);
            iv_rulePrimitiveType=rulePrimitiveType();
            _fsp--;

             current =iv_rulePrimitiveType; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveType1038); 

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
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:579:1: rulePrimitiveType returns [EObject current=null] : (this_IntType_0= ruleIntType | this_BoolType_1= ruleBoolType | this_FloatType_2= ruleFloatType | this_EnumType_3= ruleEnumType | this_StringType_4= ruleStringType ) ;
    public final EObject rulePrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject this_IntType_0 = null;

        EObject this_BoolType_1 = null;

        EObject this_FloatType_2 = null;

        EObject this_EnumType_3 = null;

        EObject this_StringType_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:584:6: ( (this_IntType_0= ruleIntType | this_BoolType_1= ruleBoolType | this_FloatType_2= ruleFloatType | this_EnumType_3= ruleEnumType | this_StringType_4= ruleStringType ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:585:1: (this_IntType_0= ruleIntType | this_BoolType_1= ruleBoolType | this_FloatType_2= ruleFloatType | this_EnumType_3= ruleEnumType | this_StringType_4= ruleStringType )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:585:1: (this_IntType_0= ruleIntType | this_BoolType_1= ruleBoolType | this_FloatType_2= ruleFloatType | this_EnumType_3= ruleEnumType | this_StringType_4= ruleStringType )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt6=1;
                }
                break;
            case 24:
                {
                alt6=2;
                }
                break;
            case 25:
                {
                alt6=3;
                }
                break;
            case RULE_ID:
                {
                alt6=4;
                }
                break;
            case 26:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("585:1: (this_IntType_0= ruleIntType | this_BoolType_1= ruleBoolType | this_FloatType_2= ruleFloatType | this_EnumType_3= ruleEnumType | this_StringType_4= ruleStringType )", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:586:5: this_IntType_0= ruleIntType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPrimitiveTypeAccess().getIntTypeParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleIntType_in_rulePrimitiveType1085);
                    this_IntType_0=ruleIntType();
                    _fsp--;

                     
                            current = this_IntType_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:596:5: this_BoolType_1= ruleBoolType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPrimitiveTypeAccess().getBoolTypeParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBoolType_in_rulePrimitiveType1112);
                    this_BoolType_1=ruleBoolType();
                    _fsp--;

                     
                            current = this_BoolType_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:606:5: this_FloatType_2= ruleFloatType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPrimitiveTypeAccess().getFloatTypeParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFloatType_in_rulePrimitiveType1139);
                    this_FloatType_2=ruleFloatType();
                    _fsp--;

                     
                            current = this_FloatType_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:616:5: this_EnumType_3= ruleEnumType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPrimitiveTypeAccess().getEnumTypeParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEnumType_in_rulePrimitiveType1166);
                    this_EnumType_3=ruleEnumType();
                    _fsp--;

                     
                            current = this_EnumType_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:626:5: this_StringType_4= ruleStringType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPrimitiveTypeAccess().getStringTypeParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStringType_in_rulePrimitiveType1193);
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
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:642:1: entryRuleArrayType returns [EObject current=null] : iv_ruleArrayType= ruleArrayType EOF ;
    public final EObject entryRuleArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayType = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:643:2: (iv_ruleArrayType= ruleArrayType EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:644:2: iv_ruleArrayType= ruleArrayType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getArrayTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleArrayType_in_entryRuleArrayType1228);
            iv_ruleArrayType=ruleArrayType();
            _fsp--;

             current =iv_ruleArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayType1238); 

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
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:651:1: ruleArrayType returns [EObject current=null] : ( () 'array' '[' ( (lv_baseType_3_0= ruleType ) ) ']' ) ;
    public final EObject ruleArrayType() throws RecognitionException {
        EObject current = null;

        EObject lv_baseType_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:656:6: ( ( () 'array' '[' ( (lv_baseType_3_0= ruleType ) ) ']' ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:657:1: ( () 'array' '[' ( (lv_baseType_3_0= ruleType ) ) ']' )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:657:1: ( () 'array' '[' ( (lv_baseType_3_0= ruleType ) ) ']' )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:657:2: () 'array' '[' ( (lv_baseType_3_0= ruleType ) ) ']'
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:657:2: ()
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:658:5: 
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

            match(input,20,FOLLOW_20_in_ruleArrayType1282); 

                    createLeafNode(grammarAccess.getArrayTypeAccess().getArrayKeyword_1(), null); 
                
            match(input,21,FOLLOW_21_in_ruleArrayType1292); 

                    createLeafNode(grammarAccess.getArrayTypeAccess().getLeftSquareBracketKeyword_2(), null); 
                
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:676:1: ( (lv_baseType_3_0= ruleType ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:677:1: (lv_baseType_3_0= ruleType )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:677:1: (lv_baseType_3_0= ruleType )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:678:3: lv_baseType_3_0= ruleType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getArrayTypeAccess().getBaseTypeTypeParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleArrayType1313);
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

            match(input,22,FOLLOW_22_in_ruleArrayType1323); 

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
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:712:1: entryRuleEnumType returns [EObject current=null] : iv_ruleEnumType= ruleEnumType EOF ;
    public final EObject entryRuleEnumType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumType = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:713:2: (iv_ruleEnumType= ruleEnumType EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:714:2: iv_ruleEnumType= ruleEnumType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEnumTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleEnumType_in_entryRuleEnumType1359);
            iv_ruleEnumType=ruleEnumType();
            _fsp--;

             current =iv_ruleEnumType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumType1369); 

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
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:721:1: ruleEnumType returns [EObject current=null] : ( ( RULE_ID ) ) ;
    public final EObject ruleEnumType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:726:6: ( ( ( RULE_ID ) ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:727:1: ( ( RULE_ID ) )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:727:1: ( ( RULE_ID ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:728:1: ( RULE_ID )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:728:1: ( RULE_ID )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:729:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getEnumTypeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumType1411); 

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
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:749:1: entryRuleIntType returns [EObject current=null] : iv_ruleIntType= ruleIntType EOF ;
    public final EObject entryRuleIntType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntType = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:750:2: (iv_ruleIntType= ruleIntType EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:751:2: iv_ruleIntType= ruleIntType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getIntTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleIntType_in_entryRuleIntType1446);
            iv_ruleIntType=ruleIntType();
            _fsp--;

             current =iv_ruleIntType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntType1456); 

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
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:758:1: ruleIntType returns [EObject current=null] : ( () 'int' ) ;
    public final EObject ruleIntType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:763:6: ( ( () 'int' ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:764:1: ( () 'int' )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:764:1: ( () 'int' )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:764:2: () 'int'
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:764:2: ()
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:765:5: 
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

            match(input,23,FOLLOW_23_in_ruleIntType1500); 

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
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:787:1: entryRuleBoolType returns [EObject current=null] : iv_ruleBoolType= ruleBoolType EOF ;
    public final EObject entryRuleBoolType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolType = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:788:2: (iv_ruleBoolType= ruleBoolType EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:789:2: iv_ruleBoolType= ruleBoolType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBoolTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleBoolType_in_entryRuleBoolType1536);
            iv_ruleBoolType=ruleBoolType();
            _fsp--;

             current =iv_ruleBoolType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolType1546); 

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
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:796:1: ruleBoolType returns [EObject current=null] : ( () 'bool' ) ;
    public final EObject ruleBoolType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:801:6: ( ( () 'bool' ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:802:1: ( () 'bool' )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:802:1: ( () 'bool' )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:802:2: () 'bool'
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:802:2: ()
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:803:5: 
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

            match(input,24,FOLLOW_24_in_ruleBoolType1590); 

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
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:825:1: entryRuleFloatType returns [EObject current=null] : iv_ruleFloatType= ruleFloatType EOF ;
    public final EObject entryRuleFloatType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatType = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:826:2: (iv_ruleFloatType= ruleFloatType EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:827:2: iv_ruleFloatType= ruleFloatType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFloatTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleFloatType_in_entryRuleFloatType1626);
            iv_ruleFloatType=ruleFloatType();
            _fsp--;

             current =iv_ruleFloatType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatType1636); 

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
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:834:1: ruleFloatType returns [EObject current=null] : ( () 'float' ) ;
    public final EObject ruleFloatType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:839:6: ( ( () 'float' ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:840:1: ( () 'float' )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:840:1: ( () 'float' )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:840:2: () 'float'
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:840:2: ()
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:841:5: 
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

            match(input,25,FOLLOW_25_in_ruleFloatType1680); 

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
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:863:1: entryRuleStringType returns [EObject current=null] : iv_ruleStringType= ruleStringType EOF ;
    public final EObject entryRuleStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringType = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:864:2: (iv_ruleStringType= ruleStringType EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:865:2: iv_ruleStringType= ruleStringType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStringTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleStringType_in_entryRuleStringType1716);
            iv_ruleStringType=ruleStringType();
            _fsp--;

             current =iv_ruleStringType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringType1726); 

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
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:872:1: ruleStringType returns [EObject current=null] : ( () 'string' ) ;
    public final EObject ruleStringType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:877:6: ( ( () 'string' ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:878:1: ( () 'string' )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:878:1: ( () 'string' )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:878:2: () 'string'
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:878:2: ()
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:879:5: 
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

            match(input,26,FOLLOW_26_in_ruleStringType1770); 

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
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:901:1: entryRuleFormula returns [EObject current=null] : iv_ruleFormula= ruleFormula EOF ;
    public final EObject entryRuleFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormula = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:902:2: (iv_ruleFormula= ruleFormula EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:903:2: iv_ruleFormula= ruleFormula EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFormulaRule(), currentNode); 
            pushFollow(FOLLOW_ruleFormula_in_entryRuleFormula1806);
            iv_ruleFormula=ruleFormula();
            _fsp--;

             current =iv_ruleFormula; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormula1816); 

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
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:910:1: ruleFormula returns [EObject current=null] : ( () 'calc' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) '=' ( (lv_expr_5_0= ruleExpr ) ) ';' ) ;
    public final EObject ruleFormula() throws RecognitionException {
        EObject current = null;

        Token lv_name_3_0=null;
        EObject lv_type_2_0 = null;

        EObject lv_expr_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:915:6: ( ( () 'calc' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) '=' ( (lv_expr_5_0= ruleExpr ) ) ';' ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:916:1: ( () 'calc' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) '=' ( (lv_expr_5_0= ruleExpr ) ) ';' )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:916:1: ( () 'calc' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) '=' ( (lv_expr_5_0= ruleExpr ) ) ';' )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:916:2: () 'calc' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) '=' ( (lv_expr_5_0= ruleExpr ) ) ';'
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:916:2: ()
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:917:5: 
            {
             
                    temp=factory.create(grammarAccess.getFormulaAccess().getFormulaAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getFormulaAccess().getFormulaAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,27,FOLLOW_27_in_ruleFormula1860); 

                    createLeafNode(grammarAccess.getFormulaAccess().getCalcKeyword_1(), null); 
                
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:931:1: ( (lv_type_2_0= ruleType ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:932:1: (lv_type_2_0= ruleType )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:932:1: (lv_type_2_0= ruleType )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:933:3: lv_type_2_0= ruleType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getFormulaAccess().getTypeTypeParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleFormula1881);
            lv_type_2_0=ruleType();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFormulaRule().getType().getClassifier());
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

            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:955:2: ( (lv_name_3_0= RULE_ID ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:956:1: (lv_name_3_0= RULE_ID )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:956:1: (lv_name_3_0= RULE_ID )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:957:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFormula1898); 

            			createLeafNode(grammarAccess.getFormulaAccess().getNameIDTerminalRuleCall_3_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFormulaRule().getType().getClassifier());
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

            match(input,19,FOLLOW_19_in_ruleFormula1913); 

                    createLeafNode(grammarAccess.getFormulaAccess().getEqualsSignKeyword_4(), null); 
                
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:983:1: ( (lv_expr_5_0= ruleExpr ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:984:1: (lv_expr_5_0= ruleExpr )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:984:1: (lv_expr_5_0= ruleExpr )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:985:3: lv_expr_5_0= ruleExpr
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getFormulaAccess().getExprExprParserRuleCall_5_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleFormula1934);
            lv_expr_5_0=ruleExpr();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFormulaRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"expr",
            	        		lv_expr_5_0, 
            	        		"Expr", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,14,FOLLOW_14_in_ruleFormula1944); 

                    createLeafNode(grammarAccess.getFormulaAccess().getSemicolonKeyword_6(), null); 
                

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
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1019:1: entryRuleExpr returns [EObject current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final EObject entryRuleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1020:2: (iv_ruleExpr= ruleExpr EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1021:2: iv_ruleExpr= ruleExpr EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExprRule(), currentNode); 
            pushFollow(FOLLOW_ruleExpr_in_entryRuleExpr1980);
            iv_ruleExpr=ruleExpr();
            _fsp--;

             current =iv_ruleExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpr1990); 

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
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1028:1: ruleExpr returns [EObject current=null] : this_Comparison_0= ruleComparison ;
    public final EObject ruleExpr() throws RecognitionException {
        EObject current = null;

        EObject this_Comparison_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1033:6: (this_Comparison_0= ruleComparison )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1035:5: this_Comparison_0= ruleComparison
            {
             
                    currentNode=createCompositeNode(grammarAccess.getExprAccess().getComparisonParserRuleCall(), currentNode); 
                
            pushFollow(FOLLOW_ruleComparison_in_ruleExpr2036);
            this_Comparison_0=ruleComparison();
            _fsp--;

             
                    current = this_Comparison_0; 
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


    // $ANTLR start entryRuleComparison
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1051:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1052:2: (iv_ruleComparison= ruleComparison EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1053:2: iv_ruleComparison= ruleComparison EOF
            {
             currentNode = createCompositeNode(grammarAccess.getComparisonRule(), currentNode); 
            pushFollow(FOLLOW_ruleComparison_in_entryRuleComparison2070);
            iv_ruleComparison=ruleComparison();
            _fsp--;

             current =iv_ruleComparison; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparison2080); 

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
    // $ANTLR end entryRuleComparison


    // $ANTLR start ruleComparison
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1060:1: ruleComparison returns [EObject current=null] : (this_Addition_0= ruleAddition ( () '==' ( (lv_right_3_0= ruleAddition ) ) )? ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        EObject this_Addition_0 = null;

        EObject lv_right_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1065:6: ( (this_Addition_0= ruleAddition ( () '==' ( (lv_right_3_0= ruleAddition ) ) )? ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1066:1: (this_Addition_0= ruleAddition ( () '==' ( (lv_right_3_0= ruleAddition ) ) )? )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1066:1: (this_Addition_0= ruleAddition ( () '==' ( (lv_right_3_0= ruleAddition ) ) )? )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1067:5: this_Addition_0= ruleAddition ( () '==' ( (lv_right_3_0= ruleAddition ) ) )?
            {
             
                    currentNode=createCompositeNode(grammarAccess.getComparisonAccess().getAdditionParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleAddition_in_ruleComparison2127);
            this_Addition_0=ruleAddition();
            _fsp--;

             
                    current = this_Addition_0; 
                    currentNode = currentNode.getParent();
                
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1075:1: ( () '==' ( (lv_right_3_0= ruleAddition ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==28) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1075:2: () '==' ( (lv_right_3_0= ruleAddition ) )
                    {
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1075:2: ()
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1076:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getComparisonAccess().getEqualsLeftAction_1_0().getType().getClassifier());
                            try {
                            	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
                            } catch(ValueConverterException vce) {
                            	handleValueConverterException(vce);
                            }
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getComparisonAccess().getEqualsLeftAction_1_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    match(input,28,FOLLOW_28_in_ruleComparison2146); 

                            createLeafNode(grammarAccess.getComparisonAccess().getEqualsSignEqualsSignKeyword_1_1(), null); 
                        
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1095:1: ( (lv_right_3_0= ruleAddition ) )
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1096:1: (lv_right_3_0= ruleAddition )
                    {
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1096:1: (lv_right_3_0= ruleAddition )
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1097:3: lv_right_3_0= ruleAddition
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getComparisonAccess().getRightAdditionParserRuleCall_1_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleAddition_in_ruleComparison2167);
                    lv_right_3_0=ruleAddition();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getComparisonRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"right",
                    	        		lv_right_3_0, 
                    	        		"Addition", 
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
    // $ANTLR end ruleComparison


    // $ANTLR start entryRuleAddition
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1127:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1128:2: (iv_ruleAddition= ruleAddition EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1129:2: iv_ruleAddition= ruleAddition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAdditionRule(), currentNode); 
            pushFollow(FOLLOW_ruleAddition_in_entryRuleAddition2205);
            iv_ruleAddition=ruleAddition();
            _fsp--;

             current =iv_ruleAddition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddition2215); 

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
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1136:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( () '+' ( (lv_right_3_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        EObject this_Multiplication_0 = null;

        EObject lv_right_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1141:6: ( (this_Multiplication_0= ruleMultiplication ( () '+' ( (lv_right_3_0= ruleMultiplication ) ) )* ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1142:1: (this_Multiplication_0= ruleMultiplication ( () '+' ( (lv_right_3_0= ruleMultiplication ) ) )* )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1142:1: (this_Multiplication_0= ruleMultiplication ( () '+' ( (lv_right_3_0= ruleMultiplication ) ) )* )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1143:5: this_Multiplication_0= ruleMultiplication ( () '+' ( (lv_right_3_0= ruleMultiplication ) ) )*
            {
             
                    currentNode=createCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleMultiplication_in_ruleAddition2262);
            this_Multiplication_0=ruleMultiplication();
            _fsp--;

             
                    current = this_Multiplication_0; 
                    currentNode = currentNode.getParent();
                
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1151:1: ( () '+' ( (lv_right_3_0= ruleMultiplication ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==29) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1151:2: () '+' ( (lv_right_3_0= ruleMultiplication ) )
            	    {
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1151:2: ()
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1152:5: 
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

            	    match(input,29,FOLLOW_29_in_ruleAddition2281); 

            	            createLeafNode(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_1(), null); 
            	        
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1171:1: ( (lv_right_3_0= ruleMultiplication ) )
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1172:1: (lv_right_3_0= ruleMultiplication )
            	    {
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1172:1: (lv_right_3_0= ruleMultiplication )
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1173:3: lv_right_3_0= ruleMultiplication
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleMultiplication_in_ruleAddition2302);
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
    // $ANTLR end ruleAddition


    // $ANTLR start entryRuleMultiplication
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1203:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1204:2: (iv_ruleMultiplication= ruleMultiplication EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1205:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMultiplicationRule(), currentNode); 
            pushFollow(FOLLOW_ruleMultiplication_in_entryRuleMultiplication2340);
            iv_ruleMultiplication=ruleMultiplication();
            _fsp--;

             current =iv_ruleMultiplication; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplication2350); 

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
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1212:1: ruleMultiplication returns [EObject current=null] : (this_PostfixOperators_0= rulePostfixOperators ( () '*' ( (lv_right_3_0= rulePostfixOperators ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject this_PostfixOperators_0 = null;

        EObject lv_right_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1217:6: ( (this_PostfixOperators_0= rulePostfixOperators ( () '*' ( (lv_right_3_0= rulePostfixOperators ) ) )* ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1218:1: (this_PostfixOperators_0= rulePostfixOperators ( () '*' ( (lv_right_3_0= rulePostfixOperators ) ) )* )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1218:1: (this_PostfixOperators_0= rulePostfixOperators ( () '*' ( (lv_right_3_0= rulePostfixOperators ) ) )* )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1219:5: this_PostfixOperators_0= rulePostfixOperators ( () '*' ( (lv_right_3_0= rulePostfixOperators ) ) )*
            {
             
                    currentNode=createCompositeNode(grammarAccess.getMultiplicationAccess().getPostfixOperatorsParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_rulePostfixOperators_in_ruleMultiplication2397);
            this_PostfixOperators_0=rulePostfixOperators();
            _fsp--;

             
                    current = this_PostfixOperators_0; 
                    currentNode = currentNode.getParent();
                
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1227:1: ( () '*' ( (lv_right_3_0= rulePostfixOperators ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==30) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1227:2: () '*' ( (lv_right_3_0= rulePostfixOperators ) )
            	    {
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1227:2: ()
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1228:5: 
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

            	    match(input,30,FOLLOW_30_in_ruleMultiplication2416); 

            	            createLeafNode(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_1(), null); 
            	        
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1247:1: ( (lv_right_3_0= rulePostfixOperators ) )
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1248:1: (lv_right_3_0= rulePostfixOperators )
            	    {
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1248:1: (lv_right_3_0= rulePostfixOperators )
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1249:3: lv_right_3_0= rulePostfixOperators
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getMultiplicationAccess().getRightPostfixOperatorsParserRuleCall_1_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_rulePostfixOperators_in_ruleMultiplication2437);
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
            	    break loop9;
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
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1279:1: entryRulePostfixOperators returns [EObject current=null] : iv_rulePostfixOperators= rulePostfixOperators EOF ;
    public final EObject entryRulePostfixOperators() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostfixOperators = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1280:2: (iv_rulePostfixOperators= rulePostfixOperators EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1281:2: iv_rulePostfixOperators= rulePostfixOperators EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPostfixOperatorsRule(), currentNode); 
            pushFollow(FOLLOW_rulePostfixOperators_in_entryRulePostfixOperators2475);
            iv_rulePostfixOperators=rulePostfixOperators();
            _fsp--;

             current =iv_rulePostfixOperators; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePostfixOperators2485); 

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
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1288:1: rulePostfixOperators returns [EObject current=null] : (this_Atomic_0= ruleAtomic ( () '[' ( (lv_index_3_0= ruleExpr ) ) ']' )? ) ;
    public final EObject rulePostfixOperators() throws RecognitionException {
        EObject current = null;

        EObject this_Atomic_0 = null;

        EObject lv_index_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1293:6: ( (this_Atomic_0= ruleAtomic ( () '[' ( (lv_index_3_0= ruleExpr ) ) ']' )? ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1294:1: (this_Atomic_0= ruleAtomic ( () '[' ( (lv_index_3_0= ruleExpr ) ) ']' )? )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1294:1: (this_Atomic_0= ruleAtomic ( () '[' ( (lv_index_3_0= ruleExpr ) ) ']' )? )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1295:5: this_Atomic_0= ruleAtomic ( () '[' ( (lv_index_3_0= ruleExpr ) ) ']' )?
            {
             
                    currentNode=createCompositeNode(grammarAccess.getPostfixOperatorsAccess().getAtomicParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleAtomic_in_rulePostfixOperators2532);
            this_Atomic_0=ruleAtomic();
            _fsp--;

             
                    current = this_Atomic_0; 
                    currentNode = currentNode.getParent();
                
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1303:1: ( () '[' ( (lv_index_3_0= ruleExpr ) ) ']' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1303:2: () '[' ( (lv_index_3_0= ruleExpr ) ) ']'
                    {
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1303:2: ()
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1304:5: 
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

                    match(input,21,FOLLOW_21_in_rulePostfixOperators2551); 

                            createLeafNode(grammarAccess.getPostfixOperatorsAccess().getLeftSquareBracketKeyword_1_1(), null); 
                        
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1323:1: ( (lv_index_3_0= ruleExpr ) )
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1324:1: (lv_index_3_0= ruleExpr )
                    {
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1324:1: (lv_index_3_0= ruleExpr )
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1325:3: lv_index_3_0= ruleExpr
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getPostfixOperatorsAccess().getIndexExprParserRuleCall_1_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpr_in_rulePostfixOperators2572);
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

                    match(input,22,FOLLOW_22_in_rulePostfixOperators2582); 

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
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1359:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1360:2: (iv_ruleAtomic= ruleAtomic EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1361:2: iv_ruleAtomic= ruleAtomic EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAtomicRule(), currentNode); 
            pushFollow(FOLLOW_ruleAtomic_in_entryRuleAtomic2620);
            iv_ruleAtomic=ruleAtomic();
            _fsp--;

             current =iv_ruleAtomic; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomic2630); 

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
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1368:1: ruleAtomic returns [EObject current=null] : ( ( () ( ( ruleQID ) ) ) | ( () ( (lv_value_3_0= RULE_NUMBER ) ) ) | ( () ( (lv_value_5_0= RULE_STRING ) ) ) ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        Token lv_value_3_0=null;
        Token lv_value_5_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1373:6: ( ( ( () ( ( ruleQID ) ) ) | ( () ( (lv_value_3_0= RULE_NUMBER ) ) ) | ( () ( (lv_value_5_0= RULE_STRING ) ) ) ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1374:1: ( ( () ( ( ruleQID ) ) ) | ( () ( (lv_value_3_0= RULE_NUMBER ) ) ) | ( () ( (lv_value_5_0= RULE_STRING ) ) ) )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1374:1: ( ( () ( ( ruleQID ) ) ) | ( () ( (lv_value_3_0= RULE_NUMBER ) ) ) | ( () ( (lv_value_5_0= RULE_STRING ) ) ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt11=1;
                }
                break;
            case RULE_NUMBER:
                {
                alt11=2;
                }
                break;
            case RULE_STRING:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1374:1: ( ( () ( ( ruleQID ) ) ) | ( () ( (lv_value_3_0= RULE_NUMBER ) ) ) | ( () ( (lv_value_5_0= RULE_STRING ) ) ) )", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1374:2: ( () ( ( ruleQID ) ) )
                    {
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1374:2: ( () ( ( ruleQID ) ) )
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1374:3: () ( ( ruleQID ) )
                    {
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1374:3: ()
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1375:5: 
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

                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1385:2: ( ( ruleQID ) )
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1386:1: ( ruleQID )
                    {
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1386:1: ( ruleQID )
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1387:3: ruleQID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getAtomicRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAtomicAccess().getSymbolSymbolCrossReference_0_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleQID_in_ruleAtomic2688);
                    ruleQID();
                    _fsp--;

                     
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1402:6: ( () ( (lv_value_3_0= RULE_NUMBER ) ) )
                    {
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1402:6: ( () ( (lv_value_3_0= RULE_NUMBER ) ) )
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1402:7: () ( (lv_value_3_0= RULE_NUMBER ) )
                    {
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1402:7: ()
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1403:5: 
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

                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1413:2: ( (lv_value_3_0= RULE_NUMBER ) )
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1414:1: (lv_value_3_0= RULE_NUMBER )
                    {
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1414:1: (lv_value_3_0= RULE_NUMBER )
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1415:3: lv_value_3_0= RULE_NUMBER
                    {
                    lv_value_3_0=(Token)input.LT(1);
                    match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleAtomic2722); 

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
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1438:6: ( () ( (lv_value_5_0= RULE_STRING ) ) )
                    {
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1438:6: ( () ( (lv_value_5_0= RULE_STRING ) ) )
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1438:7: () ( (lv_value_5_0= RULE_STRING ) )
                    {
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1438:7: ()
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1439:5: 
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

                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1449:2: ( (lv_value_5_0= RULE_STRING ) )
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1450:1: (lv_value_5_0= RULE_STRING )
                    {
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1450:1: (lv_value_5_0= RULE_STRING )
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1451:3: lv_value_5_0= RULE_STRING
                    {
                    lv_value_5_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAtomic2761); 

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
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1481:1: entryRuleQID returns [String current=null] : iv_ruleQID= ruleQID EOF ;
    public final String entryRuleQID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQID = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1482:2: (iv_ruleQID= ruleQID EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1483:2: iv_ruleQID= ruleQID EOF
            {
             currentNode = createCompositeNode(grammarAccess.getQIDRule(), currentNode); 
            pushFollow(FOLLOW_ruleQID_in_entryRuleQID2804);
            iv_ruleQID=ruleQID();
            _fsp--;

             current =iv_ruleQID.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQID2815); 

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
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1490:1: ruleQID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1495:6: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1496:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1496:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1496:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQID2855); 

            		current.merge(this_ID_0);
                
             
                createLeafNode(grammarAccess.getQIDAccess().getIDTerminalRuleCall_0(), null); 
                
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1503:1: (kw= '.' this_ID_2= RULE_ID )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==31) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1504:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,31,FOLLOW_31_in_ruleQID2874); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getQIDAccess().getFullStopKeyword_1_0(), null); 
            	        
            	    this_ID_2=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQID2889); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        createLeafNode(grammarAccess.getQIDAccess().getIDTerminalRuleCall_1_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop12;
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
    public static final BitSet FOLLOW_12_in_ruleModel120 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModel137 = new BitSet(new long[]{0x000000000804A002L});
    public static final BitSet FOLLOW_ruleElement_in_ruleModel163 = new BitSet(new long[]{0x000000000804A002L});
    public static final BitSet FOLLOW_ruleElement_in_entryRuleElement200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElement210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDecl_in_ruleElement257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormula_in_ruleElement284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumDecl_in_ruleElement311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssert_in_ruleElement338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssert_in_entryRuleAssert373 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssert383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleAssert418 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleAssert439 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleAssert449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumDecl_in_entryRuleEnumDecl485 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumDecl495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleEnumDecl530 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumDecl547 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleEnumDecl562 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_ruleEnumLiteral_in_ruleEnumDecl583 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_17_in_ruleEnumDecl594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumLiteral_in_entryRuleEnumLiteral630 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumLiteral640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumLiteral691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDecl_in_entryRuleVarDecl732 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarDecl742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleVarDecl786 = new BitSet(new long[]{0x0000000007900010L});
    public static final BitSet FOLLOW_ruleType_in_ruleVarDecl807 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVarDecl824 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_19_in_ruleVarDecl840 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleVarDecl861 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleVarDecl873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType909 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_ruleType966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayType_in_ruleType993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_entryRulePrimitiveType1028 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveType1038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntType_in_rulePrimitiveType1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolType_in_rulePrimitiveType1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatType_in_rulePrimitiveType1139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumType_in_rulePrimitiveType1166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_rulePrimitiveType1193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayType_in_entryRuleArrayType1228 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayType1238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleArrayType1282 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleArrayType1292 = new BitSet(new long[]{0x0000000007900010L});
    public static final BitSet FOLLOW_ruleType_in_ruleArrayType1313 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleArrayType1323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumType_in_entryRuleEnumType1359 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumType1369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumType1411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntType_in_entryRuleIntType1446 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntType1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleIntType1500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolType_in_entryRuleBoolType1536 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolType1546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleBoolType1590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatType_in_entryRuleFloatType1626 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatType1636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleFloatType1680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_entryRuleStringType1716 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringType1726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleStringType1770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormula_in_entryRuleFormula1806 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormula1816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleFormula1860 = new BitSet(new long[]{0x0000000007900010L});
    public static final BitSet FOLLOW_ruleType_in_ruleFormula1881 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFormula1898 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleFormula1913 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleFormula1934 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleFormula1944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_entryRuleExpr1980 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpr1990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleExpr2036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_entryRuleComparison2070 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparison2080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleComparison2127 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleComparison2146 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleComparison2167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_entryRuleAddition2205 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddition2215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition2262 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleAddition2281 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition2302 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_entryRuleMultiplication2340 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplication2350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePostfixOperators_in_ruleMultiplication2397 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleMultiplication2416 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rulePostfixOperators_in_ruleMultiplication2437 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rulePostfixOperators_in_entryRulePostfixOperators2475 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePostfixOperators2485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_rulePostfixOperators2532 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_rulePostfixOperators2551 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleExpr_in_rulePostfixOperators2572 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_rulePostfixOperators2582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_entryRuleAtomic2620 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomic2630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQID_in_ruleAtomic2688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleAtomic2722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAtomic2761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQID_in_entryRuleQID2804 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQID2815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQID2855 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_ruleQID2874 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQID2889 = new BitSet(new long[]{0x0000000080000002L});

}