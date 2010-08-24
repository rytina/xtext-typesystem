package expr.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import expr.services.ExprDemoGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalExprDemoParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_NUMBER", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'enum'", "'{'", "'}'", "'var'", "';'", "'array'", "'['", "']'", "'int'", "'bool'", "'float'", "'calc'", "'='", "'+'", "'*'", "'.'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=7;
    public static final int RULE_NUMBER=5;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=6;
    public static final int RULE_WS=10;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;

        public InternalExprDemoParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g"; }


     
     	private ExprDemoGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ExprDemoGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start entryRuleModel
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:61:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:62:1: ( ruleModel EOF )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:63:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();
            _fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleModel


    // $ANTLR start ruleModel
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:70:1: ruleModel : ( ( rule__Model__ElementsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:74:2: ( ( ( rule__Model__ElementsAssignment )* ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:75:1: ( ( rule__Model__ElementsAssignment )* )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:75:1: ( ( rule__Model__ElementsAssignment )* )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:76:1: ( rule__Model__ElementsAssignment )*
            {
             before(grammarAccess.getModelAccess().getElementsAssignment()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:77:1: ( rule__Model__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12||LA1_0==15||LA1_0==23) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:77:2: rule__Model__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Model__ElementsAssignment_in_ruleModel94);
            	    rule__Model__ElementsAssignment();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getElementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleModel


    // $ANTLR start entryRuleElement
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:89:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:90:1: ( ruleElement EOF )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:91:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_ruleElement_in_entryRuleElement122);
            ruleElement();
            _fsp--;

             after(grammarAccess.getElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElement129); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleElement


    // $ANTLR start ruleElement
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:98:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:102:2: ( ( ( rule__Element__Alternatives ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:103:1: ( ( rule__Element__Alternatives ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:103:1: ( ( rule__Element__Alternatives ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:104:1: ( rule__Element__Alternatives )
            {
             before(grammarAccess.getElementAccess().getAlternatives()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:105:1: ( rule__Element__Alternatives )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:105:2: rule__Element__Alternatives
            {
            pushFollow(FOLLOW_rule__Element__Alternatives_in_ruleElement155);
            rule__Element__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleElement


    // $ANTLR start entryRuleEnumDecl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:117:1: entryRuleEnumDecl : ruleEnumDecl EOF ;
    public final void entryRuleEnumDecl() throws RecognitionException {
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:118:1: ( ruleEnumDecl EOF )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:119:1: ruleEnumDecl EOF
            {
             before(grammarAccess.getEnumDeclRule()); 
            pushFollow(FOLLOW_ruleEnumDecl_in_entryRuleEnumDecl182);
            ruleEnumDecl();
            _fsp--;

             after(grammarAccess.getEnumDeclRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumDecl189); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleEnumDecl


    // $ANTLR start ruleEnumDecl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:126:1: ruleEnumDecl : ( ( rule__EnumDecl__Group__0 ) ) ;
    public final void ruleEnumDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:130:2: ( ( ( rule__EnumDecl__Group__0 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:131:1: ( ( rule__EnumDecl__Group__0 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:131:1: ( ( rule__EnumDecl__Group__0 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:132:1: ( rule__EnumDecl__Group__0 )
            {
             before(grammarAccess.getEnumDeclAccess().getGroup()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:133:1: ( rule__EnumDecl__Group__0 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:133:2: rule__EnumDecl__Group__0
            {
            pushFollow(FOLLOW_rule__EnumDecl__Group__0_in_ruleEnumDecl215);
            rule__EnumDecl__Group__0();
            _fsp--;


            }

             after(grammarAccess.getEnumDeclAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleEnumDecl


    // $ANTLR start entryRuleEnumLiteral
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:145:1: entryRuleEnumLiteral : ruleEnumLiteral EOF ;
    public final void entryRuleEnumLiteral() throws RecognitionException {
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:146:1: ( ruleEnumLiteral EOF )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:147:1: ruleEnumLiteral EOF
            {
             before(grammarAccess.getEnumLiteralRule()); 
            pushFollow(FOLLOW_ruleEnumLiteral_in_entryRuleEnumLiteral242);
            ruleEnumLiteral();
            _fsp--;

             after(grammarAccess.getEnumLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumLiteral249); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleEnumLiteral


    // $ANTLR start ruleEnumLiteral
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:154:1: ruleEnumLiteral : ( ( rule__EnumLiteral__Group__0 ) ) ;
    public final void ruleEnumLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:158:2: ( ( ( rule__EnumLiteral__Group__0 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:159:1: ( ( rule__EnumLiteral__Group__0 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:159:1: ( ( rule__EnumLiteral__Group__0 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:160:1: ( rule__EnumLiteral__Group__0 )
            {
             before(grammarAccess.getEnumLiteralAccess().getGroup()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:161:1: ( rule__EnumLiteral__Group__0 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:161:2: rule__EnumLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__EnumLiteral__Group__0_in_ruleEnumLiteral275);
            rule__EnumLiteral__Group__0();
            _fsp--;


            }

             after(grammarAccess.getEnumLiteralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleEnumLiteral


    // $ANTLR start entryRuleVarDecl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:173:1: entryRuleVarDecl : ruleVarDecl EOF ;
    public final void entryRuleVarDecl() throws RecognitionException {
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:174:1: ( ruleVarDecl EOF )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:175:1: ruleVarDecl EOF
            {
             before(grammarAccess.getVarDeclRule()); 
            pushFollow(FOLLOW_ruleVarDecl_in_entryRuleVarDecl302);
            ruleVarDecl();
            _fsp--;

             after(grammarAccess.getVarDeclRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarDecl309); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleVarDecl


    // $ANTLR start ruleVarDecl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:182:1: ruleVarDecl : ( ( rule__VarDecl__Group__0 ) ) ;
    public final void ruleVarDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:186:2: ( ( ( rule__VarDecl__Group__0 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:187:1: ( ( rule__VarDecl__Group__0 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:187:1: ( ( rule__VarDecl__Group__0 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:188:1: ( rule__VarDecl__Group__0 )
            {
             before(grammarAccess.getVarDeclAccess().getGroup()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:189:1: ( rule__VarDecl__Group__0 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:189:2: rule__VarDecl__Group__0
            {
            pushFollow(FOLLOW_rule__VarDecl__Group__0_in_ruleVarDecl335);
            rule__VarDecl__Group__0();
            _fsp--;


            }

             after(grammarAccess.getVarDeclAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleVarDecl


    // $ANTLR start entryRuleType
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:201:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:202:1: ( ruleType EOF )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:203:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType362);
            ruleType();
            _fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType369); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleType


    // $ANTLR start ruleType
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:210:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:214:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:215:1: ( ( rule__Type__Alternatives ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:215:1: ( ( rule__Type__Alternatives ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:216:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:217:1: ( rule__Type__Alternatives )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:217:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType395);
            rule__Type__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleType


    // $ANTLR start entryRulePrimitiveType
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:229:1: entryRulePrimitiveType : rulePrimitiveType EOF ;
    public final void entryRulePrimitiveType() throws RecognitionException {
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:230:1: ( rulePrimitiveType EOF )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:231:1: rulePrimitiveType EOF
            {
             before(grammarAccess.getPrimitiveTypeRule()); 
            pushFollow(FOLLOW_rulePrimitiveType_in_entryRulePrimitiveType422);
            rulePrimitiveType();
            _fsp--;

             after(grammarAccess.getPrimitiveTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveType429); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRulePrimitiveType


    // $ANTLR start rulePrimitiveType
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:238:1: rulePrimitiveType : ( ( rule__PrimitiveType__Alternatives ) ) ;
    public final void rulePrimitiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:242:2: ( ( ( rule__PrimitiveType__Alternatives ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:243:1: ( ( rule__PrimitiveType__Alternatives ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:243:1: ( ( rule__PrimitiveType__Alternatives ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:244:1: ( rule__PrimitiveType__Alternatives )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getAlternatives()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:245:1: ( rule__PrimitiveType__Alternatives )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:245:2: rule__PrimitiveType__Alternatives
            {
            pushFollow(FOLLOW_rule__PrimitiveType__Alternatives_in_rulePrimitiveType455);
            rule__PrimitiveType__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getPrimitiveTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulePrimitiveType


    // $ANTLR start entryRuleArrayType
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:257:1: entryRuleArrayType : ruleArrayType EOF ;
    public final void entryRuleArrayType() throws RecognitionException {
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:258:1: ( ruleArrayType EOF )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:259:1: ruleArrayType EOF
            {
             before(grammarAccess.getArrayTypeRule()); 
            pushFollow(FOLLOW_ruleArrayType_in_entryRuleArrayType482);
            ruleArrayType();
            _fsp--;

             after(grammarAccess.getArrayTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayType489); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleArrayType


    // $ANTLR start ruleArrayType
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:266:1: ruleArrayType : ( ( rule__ArrayType__Group__0 ) ) ;
    public final void ruleArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:270:2: ( ( ( rule__ArrayType__Group__0 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:271:1: ( ( rule__ArrayType__Group__0 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:271:1: ( ( rule__ArrayType__Group__0 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:272:1: ( rule__ArrayType__Group__0 )
            {
             before(grammarAccess.getArrayTypeAccess().getGroup()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:273:1: ( rule__ArrayType__Group__0 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:273:2: rule__ArrayType__Group__0
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__0_in_ruleArrayType515);
            rule__ArrayType__Group__0();
            _fsp--;


            }

             after(grammarAccess.getArrayTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleArrayType


    // $ANTLR start entryRuleEnumType
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:285:1: entryRuleEnumType : ruleEnumType EOF ;
    public final void entryRuleEnumType() throws RecognitionException {
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:286:1: ( ruleEnumType EOF )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:287:1: ruleEnumType EOF
            {
             before(grammarAccess.getEnumTypeRule()); 
            pushFollow(FOLLOW_ruleEnumType_in_entryRuleEnumType542);
            ruleEnumType();
            _fsp--;

             after(grammarAccess.getEnumTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumType549); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleEnumType


    // $ANTLR start ruleEnumType
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:294:1: ruleEnumType : ( ( rule__EnumType__EnumRefAssignment ) ) ;
    public final void ruleEnumType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:298:2: ( ( ( rule__EnumType__EnumRefAssignment ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:299:1: ( ( rule__EnumType__EnumRefAssignment ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:299:1: ( ( rule__EnumType__EnumRefAssignment ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:300:1: ( rule__EnumType__EnumRefAssignment )
            {
             before(grammarAccess.getEnumTypeAccess().getEnumRefAssignment()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:301:1: ( rule__EnumType__EnumRefAssignment )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:301:2: rule__EnumType__EnumRefAssignment
            {
            pushFollow(FOLLOW_rule__EnumType__EnumRefAssignment_in_ruleEnumType575);
            rule__EnumType__EnumRefAssignment();
            _fsp--;


            }

             after(grammarAccess.getEnumTypeAccess().getEnumRefAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleEnumType


    // $ANTLR start entryRuleIntType
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:313:1: entryRuleIntType : ruleIntType EOF ;
    public final void entryRuleIntType() throws RecognitionException {
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:314:1: ( ruleIntType EOF )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:315:1: ruleIntType EOF
            {
             before(grammarAccess.getIntTypeRule()); 
            pushFollow(FOLLOW_ruleIntType_in_entryRuleIntType602);
            ruleIntType();
            _fsp--;

             after(grammarAccess.getIntTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntType609); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleIntType


    // $ANTLR start ruleIntType
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:322:1: ruleIntType : ( ( rule__IntType__Group__0 ) ) ;
    public final void ruleIntType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:326:2: ( ( ( rule__IntType__Group__0 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:327:1: ( ( rule__IntType__Group__0 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:327:1: ( ( rule__IntType__Group__0 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:328:1: ( rule__IntType__Group__0 )
            {
             before(grammarAccess.getIntTypeAccess().getGroup()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:329:1: ( rule__IntType__Group__0 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:329:2: rule__IntType__Group__0
            {
            pushFollow(FOLLOW_rule__IntType__Group__0_in_ruleIntType635);
            rule__IntType__Group__0();
            _fsp--;


            }

             after(grammarAccess.getIntTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleIntType


    // $ANTLR start entryRuleBoolType
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:341:1: entryRuleBoolType : ruleBoolType EOF ;
    public final void entryRuleBoolType() throws RecognitionException {
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:342:1: ( ruleBoolType EOF )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:343:1: ruleBoolType EOF
            {
             before(grammarAccess.getBoolTypeRule()); 
            pushFollow(FOLLOW_ruleBoolType_in_entryRuleBoolType662);
            ruleBoolType();
            _fsp--;

             after(grammarAccess.getBoolTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolType669); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleBoolType


    // $ANTLR start ruleBoolType
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:350:1: ruleBoolType : ( ( rule__BoolType__Group__0 ) ) ;
    public final void ruleBoolType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:354:2: ( ( ( rule__BoolType__Group__0 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:355:1: ( ( rule__BoolType__Group__0 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:355:1: ( ( rule__BoolType__Group__0 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:356:1: ( rule__BoolType__Group__0 )
            {
             before(grammarAccess.getBoolTypeAccess().getGroup()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:357:1: ( rule__BoolType__Group__0 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:357:2: rule__BoolType__Group__0
            {
            pushFollow(FOLLOW_rule__BoolType__Group__0_in_ruleBoolType695);
            rule__BoolType__Group__0();
            _fsp--;


            }

             after(grammarAccess.getBoolTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleBoolType


    // $ANTLR start entryRuleFloatType
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:369:1: entryRuleFloatType : ruleFloatType EOF ;
    public final void entryRuleFloatType() throws RecognitionException {
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:370:1: ( ruleFloatType EOF )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:371:1: ruleFloatType EOF
            {
             before(grammarAccess.getFloatTypeRule()); 
            pushFollow(FOLLOW_ruleFloatType_in_entryRuleFloatType722);
            ruleFloatType();
            _fsp--;

             after(grammarAccess.getFloatTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatType729); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleFloatType


    // $ANTLR start ruleFloatType
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:378:1: ruleFloatType : ( ( rule__FloatType__Group__0 ) ) ;
    public final void ruleFloatType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:382:2: ( ( ( rule__FloatType__Group__0 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:383:1: ( ( rule__FloatType__Group__0 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:383:1: ( ( rule__FloatType__Group__0 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:384:1: ( rule__FloatType__Group__0 )
            {
             before(grammarAccess.getFloatTypeAccess().getGroup()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:385:1: ( rule__FloatType__Group__0 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:385:2: rule__FloatType__Group__0
            {
            pushFollow(FOLLOW_rule__FloatType__Group__0_in_ruleFloatType755);
            rule__FloatType__Group__0();
            _fsp--;


            }

             after(grammarAccess.getFloatTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleFloatType


    // $ANTLR start entryRuleFormula
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:397:1: entryRuleFormula : ruleFormula EOF ;
    public final void entryRuleFormula() throws RecognitionException {
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:398:1: ( ruleFormula EOF )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:399:1: ruleFormula EOF
            {
             before(grammarAccess.getFormulaRule()); 
            pushFollow(FOLLOW_ruleFormula_in_entryRuleFormula782);
            ruleFormula();
            _fsp--;

             after(grammarAccess.getFormulaRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormula789); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleFormula


    // $ANTLR start ruleFormula
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:406:1: ruleFormula : ( ( rule__Formula__Group__0 ) ) ;
    public final void ruleFormula() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:410:2: ( ( ( rule__Formula__Group__0 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:411:1: ( ( rule__Formula__Group__0 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:411:1: ( ( rule__Formula__Group__0 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:412:1: ( rule__Formula__Group__0 )
            {
             before(grammarAccess.getFormulaAccess().getGroup()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:413:1: ( rule__Formula__Group__0 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:413:2: rule__Formula__Group__0
            {
            pushFollow(FOLLOW_rule__Formula__Group__0_in_ruleFormula815);
            rule__Formula__Group__0();
            _fsp--;


            }

             after(grammarAccess.getFormulaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleFormula


    // $ANTLR start entryRuleExpr
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:425:1: entryRuleExpr : ruleExpr EOF ;
    public final void entryRuleExpr() throws RecognitionException {
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:426:1: ( ruleExpr EOF )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:427:1: ruleExpr EOF
            {
             before(grammarAccess.getExprRule()); 
            pushFollow(FOLLOW_ruleExpr_in_entryRuleExpr842);
            ruleExpr();
            _fsp--;

             after(grammarAccess.getExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpr849); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleExpr


    // $ANTLR start ruleExpr
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:434:1: ruleExpr : ( ruleAddition ) ;
    public final void ruleExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:438:2: ( ( ruleAddition ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:439:1: ( ruleAddition )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:439:1: ( ruleAddition )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:440:1: ruleAddition
            {
             before(grammarAccess.getExprAccess().getAdditionParserRuleCall()); 
            pushFollow(FOLLOW_ruleAddition_in_ruleExpr875);
            ruleAddition();
            _fsp--;

             after(grammarAccess.getExprAccess().getAdditionParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleExpr


    // $ANTLR start entryRuleAddition
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:453:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:454:1: ( ruleAddition EOF )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:455:1: ruleAddition EOF
            {
             before(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_ruleAddition_in_entryRuleAddition901);
            ruleAddition();
            _fsp--;

             after(grammarAccess.getAdditionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddition908); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleAddition


    // $ANTLR start ruleAddition
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:462:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:466:2: ( ( ( rule__Addition__Group__0 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:467:1: ( ( rule__Addition__Group__0 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:467:1: ( ( rule__Addition__Group__0 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:468:1: ( rule__Addition__Group__0 )
            {
             before(grammarAccess.getAdditionAccess().getGroup()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:469:1: ( rule__Addition__Group__0 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:469:2: rule__Addition__Group__0
            {
            pushFollow(FOLLOW_rule__Addition__Group__0_in_ruleAddition934);
            rule__Addition__Group__0();
            _fsp--;


            }

             after(grammarAccess.getAdditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleAddition


    // $ANTLR start entryRuleMultiplication
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:481:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:482:1: ( ruleMultiplication EOF )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:483:1: ruleMultiplication EOF
            {
             before(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_ruleMultiplication_in_entryRuleMultiplication961);
            ruleMultiplication();
            _fsp--;

             after(grammarAccess.getMultiplicationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplication968); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleMultiplication


    // $ANTLR start ruleMultiplication
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:490:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:494:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:495:1: ( ( rule__Multiplication__Group__0 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:495:1: ( ( rule__Multiplication__Group__0 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:496:1: ( rule__Multiplication__Group__0 )
            {
             before(grammarAccess.getMultiplicationAccess().getGroup()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:497:1: ( rule__Multiplication__Group__0 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:497:2: rule__Multiplication__Group__0
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__0_in_ruleMultiplication994);
            rule__Multiplication__Group__0();
            _fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleMultiplication


    // $ANTLR start entryRulePostfixOperators
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:509:1: entryRulePostfixOperators : rulePostfixOperators EOF ;
    public final void entryRulePostfixOperators() throws RecognitionException {
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:510:1: ( rulePostfixOperators EOF )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:511:1: rulePostfixOperators EOF
            {
             before(grammarAccess.getPostfixOperatorsRule()); 
            pushFollow(FOLLOW_rulePostfixOperators_in_entryRulePostfixOperators1021);
            rulePostfixOperators();
            _fsp--;

             after(grammarAccess.getPostfixOperatorsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePostfixOperators1028); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRulePostfixOperators


    // $ANTLR start rulePostfixOperators
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:518:1: rulePostfixOperators : ( ( rule__PostfixOperators__Group__0 ) ) ;
    public final void rulePostfixOperators() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:522:2: ( ( ( rule__PostfixOperators__Group__0 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:523:1: ( ( rule__PostfixOperators__Group__0 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:523:1: ( ( rule__PostfixOperators__Group__0 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:524:1: ( rule__PostfixOperators__Group__0 )
            {
             before(grammarAccess.getPostfixOperatorsAccess().getGroup()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:525:1: ( rule__PostfixOperators__Group__0 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:525:2: rule__PostfixOperators__Group__0
            {
            pushFollow(FOLLOW_rule__PostfixOperators__Group__0_in_rulePostfixOperators1054);
            rule__PostfixOperators__Group__0();
            _fsp--;


            }

             after(grammarAccess.getPostfixOperatorsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulePostfixOperators


    // $ANTLR start entryRuleAtomic
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:537:1: entryRuleAtomic : ruleAtomic EOF ;
    public final void entryRuleAtomic() throws RecognitionException {
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:538:1: ( ruleAtomic EOF )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:539:1: ruleAtomic EOF
            {
             before(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_ruleAtomic_in_entryRuleAtomic1081);
            ruleAtomic();
            _fsp--;

             after(grammarAccess.getAtomicRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomic1088); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleAtomic


    // $ANTLR start ruleAtomic
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:546:1: ruleAtomic : ( ( rule__Atomic__Alternatives ) ) ;
    public final void ruleAtomic() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:550:2: ( ( ( rule__Atomic__Alternatives ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:551:1: ( ( rule__Atomic__Alternatives ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:551:1: ( ( rule__Atomic__Alternatives ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:552:1: ( rule__Atomic__Alternatives )
            {
             before(grammarAccess.getAtomicAccess().getAlternatives()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:553:1: ( rule__Atomic__Alternatives )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:553:2: rule__Atomic__Alternatives
            {
            pushFollow(FOLLOW_rule__Atomic__Alternatives_in_ruleAtomic1114);
            rule__Atomic__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getAtomicAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleAtomic


    // $ANTLR start entryRuleQID
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:565:1: entryRuleQID : ruleQID EOF ;
    public final void entryRuleQID() throws RecognitionException {
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:566:1: ( ruleQID EOF )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:567:1: ruleQID EOF
            {
             before(grammarAccess.getQIDRule()); 
            pushFollow(FOLLOW_ruleQID_in_entryRuleQID1141);
            ruleQID();
            _fsp--;

             after(grammarAccess.getQIDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQID1148); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleQID


    // $ANTLR start ruleQID
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:574:1: ruleQID : ( ( rule__QID__Group__0 ) ) ;
    public final void ruleQID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:578:2: ( ( ( rule__QID__Group__0 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:579:1: ( ( rule__QID__Group__0 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:579:1: ( ( rule__QID__Group__0 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:580:1: ( rule__QID__Group__0 )
            {
             before(grammarAccess.getQIDAccess().getGroup()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:581:1: ( rule__QID__Group__0 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:581:2: rule__QID__Group__0
            {
            pushFollow(FOLLOW_rule__QID__Group__0_in_ruleQID1174);
            rule__QID__Group__0();
            _fsp--;


            }

             after(grammarAccess.getQIDAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleQID


    // $ANTLR start rule__Element__Alternatives
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:593:1: rule__Element__Alternatives : ( ( ruleVarDecl ) | ( ruleFormula ) | ( ruleEnumDecl ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:597:1: ( ( ruleVarDecl ) | ( ruleFormula ) | ( ruleEnumDecl ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt2=1;
                }
                break;
            case 23:
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
                    new NoViableAltException("593:1: rule__Element__Alternatives : ( ( ruleVarDecl ) | ( ruleFormula ) | ( ruleEnumDecl ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:598:1: ( ruleVarDecl )
                    {
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:598:1: ( ruleVarDecl )
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:599:1: ruleVarDecl
                    {
                     before(grammarAccess.getElementAccess().getVarDeclParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleVarDecl_in_rule__Element__Alternatives1210);
                    ruleVarDecl();
                    _fsp--;

                     after(grammarAccess.getElementAccess().getVarDeclParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:604:6: ( ruleFormula )
                    {
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:604:6: ( ruleFormula )
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:605:1: ruleFormula
                    {
                     before(grammarAccess.getElementAccess().getFormulaParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleFormula_in_rule__Element__Alternatives1227);
                    ruleFormula();
                    _fsp--;

                     after(grammarAccess.getElementAccess().getFormulaParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:610:6: ( ruleEnumDecl )
                    {
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:610:6: ( ruleEnumDecl )
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:611:1: ruleEnumDecl
                    {
                     before(grammarAccess.getElementAccess().getEnumDeclParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleEnumDecl_in_rule__Element__Alternatives1244);
                    ruleEnumDecl();
                    _fsp--;

                     after(grammarAccess.getElementAccess().getEnumDeclParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Element__Alternatives


    // $ANTLR start rule__Type__Alternatives
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:621:1: rule__Type__Alternatives : ( ( rulePrimitiveType ) | ( ruleArrayType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:625:1: ( ( rulePrimitiveType ) | ( ruleArrayType ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID||(LA3_0>=20 && LA3_0<=22)) ) {
                alt3=1;
            }
            else if ( (LA3_0==17) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("621:1: rule__Type__Alternatives : ( ( rulePrimitiveType ) | ( ruleArrayType ) );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:626:1: ( rulePrimitiveType )
                    {
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:626:1: ( rulePrimitiveType )
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:627:1: rulePrimitiveType
                    {
                     before(grammarAccess.getTypeAccess().getPrimitiveTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulePrimitiveType_in_rule__Type__Alternatives1276);
                    rulePrimitiveType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getPrimitiveTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:632:6: ( ruleArrayType )
                    {
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:632:6: ( ruleArrayType )
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:633:1: ruleArrayType
                    {
                     before(grammarAccess.getTypeAccess().getArrayTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleArrayType_in_rule__Type__Alternatives1293);
                    ruleArrayType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getArrayTypeParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Type__Alternatives


    // $ANTLR start rule__PrimitiveType__Alternatives
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:643:1: rule__PrimitiveType__Alternatives : ( ( ruleIntType ) | ( ruleBoolType ) | ( ruleFloatType ) | ( ruleEnumType ) );
    public final void rule__PrimitiveType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:647:1: ( ( ruleIntType ) | ( ruleBoolType ) | ( ruleFloatType ) | ( ruleEnumType ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt4=1;
                }
                break;
            case 21:
                {
                alt4=2;
                }
                break;
            case 22:
                {
                alt4=3;
                }
                break;
            case RULE_ID:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("643:1: rule__PrimitiveType__Alternatives : ( ( ruleIntType ) | ( ruleBoolType ) | ( ruleFloatType ) | ( ruleEnumType ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:648:1: ( ruleIntType )
                    {
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:648:1: ( ruleIntType )
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:649:1: ruleIntType
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getIntTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleIntType_in_rule__PrimitiveType__Alternatives1325);
                    ruleIntType();
                    _fsp--;

                     after(grammarAccess.getPrimitiveTypeAccess().getIntTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:654:6: ( ruleBoolType )
                    {
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:654:6: ( ruleBoolType )
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:655:1: ruleBoolType
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getBoolTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleBoolType_in_rule__PrimitiveType__Alternatives1342);
                    ruleBoolType();
                    _fsp--;

                     after(grammarAccess.getPrimitiveTypeAccess().getBoolTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:660:6: ( ruleFloatType )
                    {
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:660:6: ( ruleFloatType )
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:661:1: ruleFloatType
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getFloatTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleFloatType_in_rule__PrimitiveType__Alternatives1359);
                    ruleFloatType();
                    _fsp--;

                     after(grammarAccess.getPrimitiveTypeAccess().getFloatTypeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:666:6: ( ruleEnumType )
                    {
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:666:6: ( ruleEnumType )
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:667:1: ruleEnumType
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getEnumTypeParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleEnumType_in_rule__PrimitiveType__Alternatives1376);
                    ruleEnumType();
                    _fsp--;

                     after(grammarAccess.getPrimitiveTypeAccess().getEnumTypeParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PrimitiveType__Alternatives


    // $ANTLR start rule__Atomic__Alternatives
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:677:1: rule__Atomic__Alternatives : ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) );
    public final void rule__Atomic__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:681:1: ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_NUMBER) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("677:1: rule__Atomic__Alternatives : ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:682:1: ( ( rule__Atomic__Group_0__0 ) )
                    {
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:682:1: ( ( rule__Atomic__Group_0__0 ) )
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:683:1: ( rule__Atomic__Group_0__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_0()); 
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:684:1: ( rule__Atomic__Group_0__0 )
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:684:2: rule__Atomic__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_0__0_in_rule__Atomic__Alternatives1408);
                    rule__Atomic__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:688:6: ( ( rule__Atomic__Group_1__0 ) )
                    {
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:688:6: ( ( rule__Atomic__Group_1__0 ) )
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:689:1: ( rule__Atomic__Group_1__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_1()); 
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:690:1: ( rule__Atomic__Group_1__0 )
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:690:2: rule__Atomic__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_1__0_in_rule__Atomic__Alternatives1426);
                    rule__Atomic__Group_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Atomic__Alternatives


    // $ANTLR start rule__EnumDecl__Group__0
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:701:1: rule__EnumDecl__Group__0 : rule__EnumDecl__Group__0__Impl rule__EnumDecl__Group__1 ;
    public final void rule__EnumDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:705:1: ( rule__EnumDecl__Group__0__Impl rule__EnumDecl__Group__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:706:2: rule__EnumDecl__Group__0__Impl rule__EnumDecl__Group__1
            {
            pushFollow(FOLLOW_rule__EnumDecl__Group__0__Impl_in_rule__EnumDecl__Group__01457);
            rule__EnumDecl__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EnumDecl__Group__1_in_rule__EnumDecl__Group__01460);
            rule__EnumDecl__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumDecl__Group__0


    // $ANTLR start rule__EnumDecl__Group__0__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:713:1: rule__EnumDecl__Group__0__Impl : ( 'enum' ) ;
    public final void rule__EnumDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:717:1: ( ( 'enum' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:718:1: ( 'enum' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:718:1: ( 'enum' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:719:1: 'enum'
            {
             before(grammarAccess.getEnumDeclAccess().getEnumKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__EnumDecl__Group__0__Impl1488); 
             after(grammarAccess.getEnumDeclAccess().getEnumKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumDecl__Group__0__Impl


    // $ANTLR start rule__EnumDecl__Group__1
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:732:1: rule__EnumDecl__Group__1 : rule__EnumDecl__Group__1__Impl rule__EnumDecl__Group__2 ;
    public final void rule__EnumDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:736:1: ( rule__EnumDecl__Group__1__Impl rule__EnumDecl__Group__2 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:737:2: rule__EnumDecl__Group__1__Impl rule__EnumDecl__Group__2
            {
            pushFollow(FOLLOW_rule__EnumDecl__Group__1__Impl_in_rule__EnumDecl__Group__11519);
            rule__EnumDecl__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EnumDecl__Group__2_in_rule__EnumDecl__Group__11522);
            rule__EnumDecl__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumDecl__Group__1


    // $ANTLR start rule__EnumDecl__Group__1__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:744:1: rule__EnumDecl__Group__1__Impl : ( ( rule__EnumDecl__NameAssignment_1 ) ) ;
    public final void rule__EnumDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:748:1: ( ( ( rule__EnumDecl__NameAssignment_1 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:749:1: ( ( rule__EnumDecl__NameAssignment_1 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:749:1: ( ( rule__EnumDecl__NameAssignment_1 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:750:1: ( rule__EnumDecl__NameAssignment_1 )
            {
             before(grammarAccess.getEnumDeclAccess().getNameAssignment_1()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:751:1: ( rule__EnumDecl__NameAssignment_1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:751:2: rule__EnumDecl__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__EnumDecl__NameAssignment_1_in_rule__EnumDecl__Group__1__Impl1549);
            rule__EnumDecl__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getEnumDeclAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumDecl__Group__1__Impl


    // $ANTLR start rule__EnumDecl__Group__2
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:761:1: rule__EnumDecl__Group__2 : rule__EnumDecl__Group__2__Impl rule__EnumDecl__Group__3 ;
    public final void rule__EnumDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:765:1: ( rule__EnumDecl__Group__2__Impl rule__EnumDecl__Group__3 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:766:2: rule__EnumDecl__Group__2__Impl rule__EnumDecl__Group__3
            {
            pushFollow(FOLLOW_rule__EnumDecl__Group__2__Impl_in_rule__EnumDecl__Group__21579);
            rule__EnumDecl__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EnumDecl__Group__3_in_rule__EnumDecl__Group__21582);
            rule__EnumDecl__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumDecl__Group__2


    // $ANTLR start rule__EnumDecl__Group__2__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:773:1: rule__EnumDecl__Group__2__Impl : ( '{' ) ;
    public final void rule__EnumDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:777:1: ( ( '{' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:778:1: ( '{' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:778:1: ( '{' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:779:1: '{'
            {
             before(grammarAccess.getEnumDeclAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__EnumDecl__Group__2__Impl1610); 
             after(grammarAccess.getEnumDeclAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumDecl__Group__2__Impl


    // $ANTLR start rule__EnumDecl__Group__3
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:792:1: rule__EnumDecl__Group__3 : rule__EnumDecl__Group__3__Impl rule__EnumDecl__Group__4 ;
    public final void rule__EnumDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:796:1: ( rule__EnumDecl__Group__3__Impl rule__EnumDecl__Group__4 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:797:2: rule__EnumDecl__Group__3__Impl rule__EnumDecl__Group__4
            {
            pushFollow(FOLLOW_rule__EnumDecl__Group__3__Impl_in_rule__EnumDecl__Group__31641);
            rule__EnumDecl__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EnumDecl__Group__4_in_rule__EnumDecl__Group__31644);
            rule__EnumDecl__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumDecl__Group__3


    // $ANTLR start rule__EnumDecl__Group__3__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:804:1: rule__EnumDecl__Group__3__Impl : ( ( rule__EnumDecl__LiteralsAssignment_3 )* ) ;
    public final void rule__EnumDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:808:1: ( ( ( rule__EnumDecl__LiteralsAssignment_3 )* ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:809:1: ( ( rule__EnumDecl__LiteralsAssignment_3 )* )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:809:1: ( ( rule__EnumDecl__LiteralsAssignment_3 )* )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:810:1: ( rule__EnumDecl__LiteralsAssignment_3 )*
            {
             before(grammarAccess.getEnumDeclAccess().getLiteralsAssignment_3()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:811:1: ( rule__EnumDecl__LiteralsAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:811:2: rule__EnumDecl__LiteralsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__EnumDecl__LiteralsAssignment_3_in_rule__EnumDecl__Group__3__Impl1671);
            	    rule__EnumDecl__LiteralsAssignment_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getEnumDeclAccess().getLiteralsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumDecl__Group__3__Impl


    // $ANTLR start rule__EnumDecl__Group__4
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:821:1: rule__EnumDecl__Group__4 : rule__EnumDecl__Group__4__Impl ;
    public final void rule__EnumDecl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:825:1: ( rule__EnumDecl__Group__4__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:826:2: rule__EnumDecl__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__EnumDecl__Group__4__Impl_in_rule__EnumDecl__Group__41702);
            rule__EnumDecl__Group__4__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumDecl__Group__4


    // $ANTLR start rule__EnumDecl__Group__4__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:832:1: rule__EnumDecl__Group__4__Impl : ( '}' ) ;
    public final void rule__EnumDecl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:836:1: ( ( '}' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:837:1: ( '}' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:837:1: ( '}' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:838:1: '}'
            {
             before(grammarAccess.getEnumDeclAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_14_in_rule__EnumDecl__Group__4__Impl1730); 
             after(grammarAccess.getEnumDeclAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumDecl__Group__4__Impl


    // $ANTLR start rule__EnumLiteral__Group__0
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:861:1: rule__EnumLiteral__Group__0 : rule__EnumLiteral__Group__0__Impl rule__EnumLiteral__Group__1 ;
    public final void rule__EnumLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:865:1: ( rule__EnumLiteral__Group__0__Impl rule__EnumLiteral__Group__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:866:2: rule__EnumLiteral__Group__0__Impl rule__EnumLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__EnumLiteral__Group__0__Impl_in_rule__EnumLiteral__Group__01771);
            rule__EnumLiteral__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EnumLiteral__Group__1_in_rule__EnumLiteral__Group__01774);
            rule__EnumLiteral__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumLiteral__Group__0


    // $ANTLR start rule__EnumLiteral__Group__0__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:873:1: rule__EnumLiteral__Group__0__Impl : ( () ) ;
    public final void rule__EnumLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:877:1: ( ( () ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:878:1: ( () )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:878:1: ( () )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:879:1: ()
            {
             before(grammarAccess.getEnumLiteralAccess().getEnumLiteralAction_0()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:880:1: ()
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:882:1: 
            {
            }

             after(grammarAccess.getEnumLiteralAccess().getEnumLiteralAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumLiteral__Group__0__Impl


    // $ANTLR start rule__EnumLiteral__Group__1
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:892:1: rule__EnumLiteral__Group__1 : rule__EnumLiteral__Group__1__Impl ;
    public final void rule__EnumLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:896:1: ( rule__EnumLiteral__Group__1__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:897:2: rule__EnumLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumLiteral__Group__1__Impl_in_rule__EnumLiteral__Group__11832);
            rule__EnumLiteral__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumLiteral__Group__1


    // $ANTLR start rule__EnumLiteral__Group__1__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:903:1: rule__EnumLiteral__Group__1__Impl : ( ( rule__EnumLiteral__NameAssignment_1 ) ) ;
    public final void rule__EnumLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:907:1: ( ( ( rule__EnumLiteral__NameAssignment_1 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:908:1: ( ( rule__EnumLiteral__NameAssignment_1 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:908:1: ( ( rule__EnumLiteral__NameAssignment_1 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:909:1: ( rule__EnumLiteral__NameAssignment_1 )
            {
             before(grammarAccess.getEnumLiteralAccess().getNameAssignment_1()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:910:1: ( rule__EnumLiteral__NameAssignment_1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:910:2: rule__EnumLiteral__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__EnumLiteral__NameAssignment_1_in_rule__EnumLiteral__Group__1__Impl1859);
            rule__EnumLiteral__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getEnumLiteralAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumLiteral__Group__1__Impl


    // $ANTLR start rule__VarDecl__Group__0
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:924:1: rule__VarDecl__Group__0 : rule__VarDecl__Group__0__Impl rule__VarDecl__Group__1 ;
    public final void rule__VarDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:928:1: ( rule__VarDecl__Group__0__Impl rule__VarDecl__Group__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:929:2: rule__VarDecl__Group__0__Impl rule__VarDecl__Group__1
            {
            pushFollow(FOLLOW_rule__VarDecl__Group__0__Impl_in_rule__VarDecl__Group__01893);
            rule__VarDecl__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__VarDecl__Group__1_in_rule__VarDecl__Group__01896);
            rule__VarDecl__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VarDecl__Group__0


    // $ANTLR start rule__VarDecl__Group__0__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:936:1: rule__VarDecl__Group__0__Impl : ( () ) ;
    public final void rule__VarDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:940:1: ( ( () ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:941:1: ( () )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:941:1: ( () )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:942:1: ()
            {
             before(grammarAccess.getVarDeclAccess().getVarDeclAction_0()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:943:1: ()
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:945:1: 
            {
            }

             after(grammarAccess.getVarDeclAccess().getVarDeclAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VarDecl__Group__0__Impl


    // $ANTLR start rule__VarDecl__Group__1
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:955:1: rule__VarDecl__Group__1 : rule__VarDecl__Group__1__Impl rule__VarDecl__Group__2 ;
    public final void rule__VarDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:959:1: ( rule__VarDecl__Group__1__Impl rule__VarDecl__Group__2 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:960:2: rule__VarDecl__Group__1__Impl rule__VarDecl__Group__2
            {
            pushFollow(FOLLOW_rule__VarDecl__Group__1__Impl_in_rule__VarDecl__Group__11954);
            rule__VarDecl__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__VarDecl__Group__2_in_rule__VarDecl__Group__11957);
            rule__VarDecl__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VarDecl__Group__1


    // $ANTLR start rule__VarDecl__Group__1__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:967:1: rule__VarDecl__Group__1__Impl : ( 'var' ) ;
    public final void rule__VarDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:971:1: ( ( 'var' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:972:1: ( 'var' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:972:1: ( 'var' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:973:1: 'var'
            {
             before(grammarAccess.getVarDeclAccess().getVarKeyword_1()); 
            match(input,15,FOLLOW_15_in_rule__VarDecl__Group__1__Impl1985); 
             after(grammarAccess.getVarDeclAccess().getVarKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VarDecl__Group__1__Impl


    // $ANTLR start rule__VarDecl__Group__2
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:986:1: rule__VarDecl__Group__2 : rule__VarDecl__Group__2__Impl rule__VarDecl__Group__3 ;
    public final void rule__VarDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:990:1: ( rule__VarDecl__Group__2__Impl rule__VarDecl__Group__3 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:991:2: rule__VarDecl__Group__2__Impl rule__VarDecl__Group__3
            {
            pushFollow(FOLLOW_rule__VarDecl__Group__2__Impl_in_rule__VarDecl__Group__22016);
            rule__VarDecl__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__VarDecl__Group__3_in_rule__VarDecl__Group__22019);
            rule__VarDecl__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VarDecl__Group__2


    // $ANTLR start rule__VarDecl__Group__2__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:998:1: rule__VarDecl__Group__2__Impl : ( ( rule__VarDecl__TypeAssignment_2 ) ) ;
    public final void rule__VarDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1002:1: ( ( ( rule__VarDecl__TypeAssignment_2 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1003:1: ( ( rule__VarDecl__TypeAssignment_2 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1003:1: ( ( rule__VarDecl__TypeAssignment_2 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1004:1: ( rule__VarDecl__TypeAssignment_2 )
            {
             before(grammarAccess.getVarDeclAccess().getTypeAssignment_2()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1005:1: ( rule__VarDecl__TypeAssignment_2 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1005:2: rule__VarDecl__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__VarDecl__TypeAssignment_2_in_rule__VarDecl__Group__2__Impl2046);
            rule__VarDecl__TypeAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getVarDeclAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VarDecl__Group__2__Impl


    // $ANTLR start rule__VarDecl__Group__3
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1015:1: rule__VarDecl__Group__3 : rule__VarDecl__Group__3__Impl rule__VarDecl__Group__4 ;
    public final void rule__VarDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1019:1: ( rule__VarDecl__Group__3__Impl rule__VarDecl__Group__4 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1020:2: rule__VarDecl__Group__3__Impl rule__VarDecl__Group__4
            {
            pushFollow(FOLLOW_rule__VarDecl__Group__3__Impl_in_rule__VarDecl__Group__32076);
            rule__VarDecl__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__VarDecl__Group__4_in_rule__VarDecl__Group__32079);
            rule__VarDecl__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VarDecl__Group__3


    // $ANTLR start rule__VarDecl__Group__3__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1027:1: rule__VarDecl__Group__3__Impl : ( ( rule__VarDecl__NameAssignment_3 ) ) ;
    public final void rule__VarDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1031:1: ( ( ( rule__VarDecl__NameAssignment_3 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1032:1: ( ( rule__VarDecl__NameAssignment_3 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1032:1: ( ( rule__VarDecl__NameAssignment_3 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1033:1: ( rule__VarDecl__NameAssignment_3 )
            {
             before(grammarAccess.getVarDeclAccess().getNameAssignment_3()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1034:1: ( rule__VarDecl__NameAssignment_3 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1034:2: rule__VarDecl__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__VarDecl__NameAssignment_3_in_rule__VarDecl__Group__3__Impl2106);
            rule__VarDecl__NameAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getVarDeclAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VarDecl__Group__3__Impl


    // $ANTLR start rule__VarDecl__Group__4
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1044:1: rule__VarDecl__Group__4 : rule__VarDecl__Group__4__Impl ;
    public final void rule__VarDecl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1048:1: ( rule__VarDecl__Group__4__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1049:2: rule__VarDecl__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__VarDecl__Group__4__Impl_in_rule__VarDecl__Group__42136);
            rule__VarDecl__Group__4__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VarDecl__Group__4


    // $ANTLR start rule__VarDecl__Group__4__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1055:1: rule__VarDecl__Group__4__Impl : ( ';' ) ;
    public final void rule__VarDecl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1059:1: ( ( ';' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1060:1: ( ';' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1060:1: ( ';' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1061:1: ';'
            {
             before(grammarAccess.getVarDeclAccess().getSemicolonKeyword_4()); 
            match(input,16,FOLLOW_16_in_rule__VarDecl__Group__4__Impl2164); 
             after(grammarAccess.getVarDeclAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VarDecl__Group__4__Impl


    // $ANTLR start rule__ArrayType__Group__0
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1084:1: rule__ArrayType__Group__0 : rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1 ;
    public final void rule__ArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1088:1: ( rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1089:2: rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__0__Impl_in_rule__ArrayType__Group__02205);
            rule__ArrayType__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group__1_in_rule__ArrayType__Group__02208);
            rule__ArrayType__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ArrayType__Group__0


    // $ANTLR start rule__ArrayType__Group__0__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1096:1: rule__ArrayType__Group__0__Impl : ( () ) ;
    public final void rule__ArrayType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1100:1: ( ( () ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1101:1: ( () )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1101:1: ( () )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1102:1: ()
            {
             before(grammarAccess.getArrayTypeAccess().getArrayTypeAction_0()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1103:1: ()
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1105:1: 
            {
            }

             after(grammarAccess.getArrayTypeAccess().getArrayTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ArrayType__Group__0__Impl


    // $ANTLR start rule__ArrayType__Group__1
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1115:1: rule__ArrayType__Group__1 : rule__ArrayType__Group__1__Impl rule__ArrayType__Group__2 ;
    public final void rule__ArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1119:1: ( rule__ArrayType__Group__1__Impl rule__ArrayType__Group__2 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1120:2: rule__ArrayType__Group__1__Impl rule__ArrayType__Group__2
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__1__Impl_in_rule__ArrayType__Group__12266);
            rule__ArrayType__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group__2_in_rule__ArrayType__Group__12269);
            rule__ArrayType__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ArrayType__Group__1


    // $ANTLR start rule__ArrayType__Group__1__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1127:1: rule__ArrayType__Group__1__Impl : ( 'array' ) ;
    public final void rule__ArrayType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1131:1: ( ( 'array' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1132:1: ( 'array' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1132:1: ( 'array' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1133:1: 'array'
            {
             before(grammarAccess.getArrayTypeAccess().getArrayKeyword_1()); 
            match(input,17,FOLLOW_17_in_rule__ArrayType__Group__1__Impl2297); 
             after(grammarAccess.getArrayTypeAccess().getArrayKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ArrayType__Group__1__Impl


    // $ANTLR start rule__ArrayType__Group__2
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1146:1: rule__ArrayType__Group__2 : rule__ArrayType__Group__2__Impl rule__ArrayType__Group__3 ;
    public final void rule__ArrayType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1150:1: ( rule__ArrayType__Group__2__Impl rule__ArrayType__Group__3 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1151:2: rule__ArrayType__Group__2__Impl rule__ArrayType__Group__3
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__2__Impl_in_rule__ArrayType__Group__22328);
            rule__ArrayType__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group__3_in_rule__ArrayType__Group__22331);
            rule__ArrayType__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ArrayType__Group__2


    // $ANTLR start rule__ArrayType__Group__2__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1158:1: rule__ArrayType__Group__2__Impl : ( '[' ) ;
    public final void rule__ArrayType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1162:1: ( ( '[' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1163:1: ( '[' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1163:1: ( '[' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1164:1: '['
            {
             before(grammarAccess.getArrayTypeAccess().getLeftSquareBracketKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__ArrayType__Group__2__Impl2359); 
             after(grammarAccess.getArrayTypeAccess().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ArrayType__Group__2__Impl


    // $ANTLR start rule__ArrayType__Group__3
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1177:1: rule__ArrayType__Group__3 : rule__ArrayType__Group__3__Impl rule__ArrayType__Group__4 ;
    public final void rule__ArrayType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1181:1: ( rule__ArrayType__Group__3__Impl rule__ArrayType__Group__4 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1182:2: rule__ArrayType__Group__3__Impl rule__ArrayType__Group__4
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__3__Impl_in_rule__ArrayType__Group__32390);
            rule__ArrayType__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group__4_in_rule__ArrayType__Group__32393);
            rule__ArrayType__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ArrayType__Group__3


    // $ANTLR start rule__ArrayType__Group__3__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1189:1: rule__ArrayType__Group__3__Impl : ( ( rule__ArrayType__BaseTypeAssignment_3 ) ) ;
    public final void rule__ArrayType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1193:1: ( ( ( rule__ArrayType__BaseTypeAssignment_3 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1194:1: ( ( rule__ArrayType__BaseTypeAssignment_3 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1194:1: ( ( rule__ArrayType__BaseTypeAssignment_3 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1195:1: ( rule__ArrayType__BaseTypeAssignment_3 )
            {
             before(grammarAccess.getArrayTypeAccess().getBaseTypeAssignment_3()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1196:1: ( rule__ArrayType__BaseTypeAssignment_3 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1196:2: rule__ArrayType__BaseTypeAssignment_3
            {
            pushFollow(FOLLOW_rule__ArrayType__BaseTypeAssignment_3_in_rule__ArrayType__Group__3__Impl2420);
            rule__ArrayType__BaseTypeAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getArrayTypeAccess().getBaseTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ArrayType__Group__3__Impl


    // $ANTLR start rule__ArrayType__Group__4
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1206:1: rule__ArrayType__Group__4 : rule__ArrayType__Group__4__Impl ;
    public final void rule__ArrayType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1210:1: ( rule__ArrayType__Group__4__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1211:2: rule__ArrayType__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__4__Impl_in_rule__ArrayType__Group__42450);
            rule__ArrayType__Group__4__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ArrayType__Group__4


    // $ANTLR start rule__ArrayType__Group__4__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1217:1: rule__ArrayType__Group__4__Impl : ( ']' ) ;
    public final void rule__ArrayType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1221:1: ( ( ']' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1222:1: ( ']' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1222:1: ( ']' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1223:1: ']'
            {
             before(grammarAccess.getArrayTypeAccess().getRightSquareBracketKeyword_4()); 
            match(input,19,FOLLOW_19_in_rule__ArrayType__Group__4__Impl2478); 
             after(grammarAccess.getArrayTypeAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ArrayType__Group__4__Impl


    // $ANTLR start rule__IntType__Group__0
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1246:1: rule__IntType__Group__0 : rule__IntType__Group__0__Impl rule__IntType__Group__1 ;
    public final void rule__IntType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1250:1: ( rule__IntType__Group__0__Impl rule__IntType__Group__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1251:2: rule__IntType__Group__0__Impl rule__IntType__Group__1
            {
            pushFollow(FOLLOW_rule__IntType__Group__0__Impl_in_rule__IntType__Group__02519);
            rule__IntType__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__IntType__Group__1_in_rule__IntType__Group__02522);
            rule__IntType__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntType__Group__0


    // $ANTLR start rule__IntType__Group__0__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1258:1: rule__IntType__Group__0__Impl : ( () ) ;
    public final void rule__IntType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1262:1: ( ( () ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1263:1: ( () )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1263:1: ( () )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1264:1: ()
            {
             before(grammarAccess.getIntTypeAccess().getIntTypeAction_0()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1265:1: ()
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1267:1: 
            {
            }

             after(grammarAccess.getIntTypeAccess().getIntTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntType__Group__0__Impl


    // $ANTLR start rule__IntType__Group__1
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1277:1: rule__IntType__Group__1 : rule__IntType__Group__1__Impl ;
    public final void rule__IntType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1281:1: ( rule__IntType__Group__1__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1282:2: rule__IntType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__IntType__Group__1__Impl_in_rule__IntType__Group__12580);
            rule__IntType__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntType__Group__1


    // $ANTLR start rule__IntType__Group__1__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1288:1: rule__IntType__Group__1__Impl : ( 'int' ) ;
    public final void rule__IntType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1292:1: ( ( 'int' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1293:1: ( 'int' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1293:1: ( 'int' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1294:1: 'int'
            {
             before(grammarAccess.getIntTypeAccess().getIntKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__IntType__Group__1__Impl2608); 
             after(grammarAccess.getIntTypeAccess().getIntKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntType__Group__1__Impl


    // $ANTLR start rule__BoolType__Group__0
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1311:1: rule__BoolType__Group__0 : rule__BoolType__Group__0__Impl rule__BoolType__Group__1 ;
    public final void rule__BoolType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1315:1: ( rule__BoolType__Group__0__Impl rule__BoolType__Group__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1316:2: rule__BoolType__Group__0__Impl rule__BoolType__Group__1
            {
            pushFollow(FOLLOW_rule__BoolType__Group__0__Impl_in_rule__BoolType__Group__02643);
            rule__BoolType__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BoolType__Group__1_in_rule__BoolType__Group__02646);
            rule__BoolType__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BoolType__Group__0


    // $ANTLR start rule__BoolType__Group__0__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1323:1: rule__BoolType__Group__0__Impl : ( () ) ;
    public final void rule__BoolType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1327:1: ( ( () ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1328:1: ( () )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1328:1: ( () )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1329:1: ()
            {
             before(grammarAccess.getBoolTypeAccess().getBoolTypeAction_0()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1330:1: ()
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1332:1: 
            {
            }

             after(grammarAccess.getBoolTypeAccess().getBoolTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BoolType__Group__0__Impl


    // $ANTLR start rule__BoolType__Group__1
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1342:1: rule__BoolType__Group__1 : rule__BoolType__Group__1__Impl ;
    public final void rule__BoolType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1346:1: ( rule__BoolType__Group__1__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1347:2: rule__BoolType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BoolType__Group__1__Impl_in_rule__BoolType__Group__12704);
            rule__BoolType__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BoolType__Group__1


    // $ANTLR start rule__BoolType__Group__1__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1353:1: rule__BoolType__Group__1__Impl : ( 'bool' ) ;
    public final void rule__BoolType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1357:1: ( ( 'bool' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1358:1: ( 'bool' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1358:1: ( 'bool' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1359:1: 'bool'
            {
             before(grammarAccess.getBoolTypeAccess().getBoolKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__BoolType__Group__1__Impl2732); 
             after(grammarAccess.getBoolTypeAccess().getBoolKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BoolType__Group__1__Impl


    // $ANTLR start rule__FloatType__Group__0
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1376:1: rule__FloatType__Group__0 : rule__FloatType__Group__0__Impl rule__FloatType__Group__1 ;
    public final void rule__FloatType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1380:1: ( rule__FloatType__Group__0__Impl rule__FloatType__Group__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1381:2: rule__FloatType__Group__0__Impl rule__FloatType__Group__1
            {
            pushFollow(FOLLOW_rule__FloatType__Group__0__Impl_in_rule__FloatType__Group__02767);
            rule__FloatType__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FloatType__Group__1_in_rule__FloatType__Group__02770);
            rule__FloatType__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FloatType__Group__0


    // $ANTLR start rule__FloatType__Group__0__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1388:1: rule__FloatType__Group__0__Impl : ( () ) ;
    public final void rule__FloatType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1392:1: ( ( () ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1393:1: ( () )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1393:1: ( () )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1394:1: ()
            {
             before(grammarAccess.getFloatTypeAccess().getFloatTypeAction_0()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1395:1: ()
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1397:1: 
            {
            }

             after(grammarAccess.getFloatTypeAccess().getFloatTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FloatType__Group__0__Impl


    // $ANTLR start rule__FloatType__Group__1
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1407:1: rule__FloatType__Group__1 : rule__FloatType__Group__1__Impl ;
    public final void rule__FloatType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1411:1: ( rule__FloatType__Group__1__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1412:2: rule__FloatType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FloatType__Group__1__Impl_in_rule__FloatType__Group__12828);
            rule__FloatType__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FloatType__Group__1


    // $ANTLR start rule__FloatType__Group__1__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1418:1: rule__FloatType__Group__1__Impl : ( 'float' ) ;
    public final void rule__FloatType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1422:1: ( ( 'float' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1423:1: ( 'float' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1423:1: ( 'float' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1424:1: 'float'
            {
             before(grammarAccess.getFloatTypeAccess().getFloatKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__FloatType__Group__1__Impl2856); 
             after(grammarAccess.getFloatTypeAccess().getFloatKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FloatType__Group__1__Impl


    // $ANTLR start rule__Formula__Group__0
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1441:1: rule__Formula__Group__0 : rule__Formula__Group__0__Impl rule__Formula__Group__1 ;
    public final void rule__Formula__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1445:1: ( rule__Formula__Group__0__Impl rule__Formula__Group__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1446:2: rule__Formula__Group__0__Impl rule__Formula__Group__1
            {
            pushFollow(FOLLOW_rule__Formula__Group__0__Impl_in_rule__Formula__Group__02891);
            rule__Formula__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Formula__Group__1_in_rule__Formula__Group__02894);
            rule__Formula__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Formula__Group__0


    // $ANTLR start rule__Formula__Group__0__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1453:1: rule__Formula__Group__0__Impl : ( 'calc' ) ;
    public final void rule__Formula__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1457:1: ( ( 'calc' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1458:1: ( 'calc' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1458:1: ( 'calc' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1459:1: 'calc'
            {
             before(grammarAccess.getFormulaAccess().getCalcKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Formula__Group__0__Impl2922); 
             after(grammarAccess.getFormulaAccess().getCalcKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Formula__Group__0__Impl


    // $ANTLR start rule__Formula__Group__1
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1472:1: rule__Formula__Group__1 : rule__Formula__Group__1__Impl rule__Formula__Group__2 ;
    public final void rule__Formula__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1476:1: ( rule__Formula__Group__1__Impl rule__Formula__Group__2 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1477:2: rule__Formula__Group__1__Impl rule__Formula__Group__2
            {
            pushFollow(FOLLOW_rule__Formula__Group__1__Impl_in_rule__Formula__Group__12953);
            rule__Formula__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Formula__Group__2_in_rule__Formula__Group__12956);
            rule__Formula__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Formula__Group__1


    // $ANTLR start rule__Formula__Group__1__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1484:1: rule__Formula__Group__1__Impl : ( ( rule__Formula__TypeAssignment_1 ) ) ;
    public final void rule__Formula__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1488:1: ( ( ( rule__Formula__TypeAssignment_1 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1489:1: ( ( rule__Formula__TypeAssignment_1 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1489:1: ( ( rule__Formula__TypeAssignment_1 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1490:1: ( rule__Formula__TypeAssignment_1 )
            {
             before(grammarAccess.getFormulaAccess().getTypeAssignment_1()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1491:1: ( rule__Formula__TypeAssignment_1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1491:2: rule__Formula__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Formula__TypeAssignment_1_in_rule__Formula__Group__1__Impl2983);
            rule__Formula__TypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getFormulaAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Formula__Group__1__Impl


    // $ANTLR start rule__Formula__Group__2
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1501:1: rule__Formula__Group__2 : rule__Formula__Group__2__Impl rule__Formula__Group__3 ;
    public final void rule__Formula__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1505:1: ( rule__Formula__Group__2__Impl rule__Formula__Group__3 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1506:2: rule__Formula__Group__2__Impl rule__Formula__Group__3
            {
            pushFollow(FOLLOW_rule__Formula__Group__2__Impl_in_rule__Formula__Group__23013);
            rule__Formula__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Formula__Group__3_in_rule__Formula__Group__23016);
            rule__Formula__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Formula__Group__2


    // $ANTLR start rule__Formula__Group__2__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1513:1: rule__Formula__Group__2__Impl : ( ( rule__Formula__NameAssignment_2 ) ) ;
    public final void rule__Formula__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1517:1: ( ( ( rule__Formula__NameAssignment_2 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1518:1: ( ( rule__Formula__NameAssignment_2 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1518:1: ( ( rule__Formula__NameAssignment_2 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1519:1: ( rule__Formula__NameAssignment_2 )
            {
             before(grammarAccess.getFormulaAccess().getNameAssignment_2()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1520:1: ( rule__Formula__NameAssignment_2 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1520:2: rule__Formula__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Formula__NameAssignment_2_in_rule__Formula__Group__2__Impl3043);
            rule__Formula__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getFormulaAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Formula__Group__2__Impl


    // $ANTLR start rule__Formula__Group__3
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1530:1: rule__Formula__Group__3 : rule__Formula__Group__3__Impl rule__Formula__Group__4 ;
    public final void rule__Formula__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1534:1: ( rule__Formula__Group__3__Impl rule__Formula__Group__4 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1535:2: rule__Formula__Group__3__Impl rule__Formula__Group__4
            {
            pushFollow(FOLLOW_rule__Formula__Group__3__Impl_in_rule__Formula__Group__33073);
            rule__Formula__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Formula__Group__4_in_rule__Formula__Group__33076);
            rule__Formula__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Formula__Group__3


    // $ANTLR start rule__Formula__Group__3__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1542:1: rule__Formula__Group__3__Impl : ( '=' ) ;
    public final void rule__Formula__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1546:1: ( ( '=' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1547:1: ( '=' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1547:1: ( '=' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1548:1: '='
            {
             before(grammarAccess.getFormulaAccess().getEqualsSignKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__Formula__Group__3__Impl3104); 
             after(grammarAccess.getFormulaAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Formula__Group__3__Impl


    // $ANTLR start rule__Formula__Group__4
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1561:1: rule__Formula__Group__4 : rule__Formula__Group__4__Impl rule__Formula__Group__5 ;
    public final void rule__Formula__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1565:1: ( rule__Formula__Group__4__Impl rule__Formula__Group__5 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1566:2: rule__Formula__Group__4__Impl rule__Formula__Group__5
            {
            pushFollow(FOLLOW_rule__Formula__Group__4__Impl_in_rule__Formula__Group__43135);
            rule__Formula__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Formula__Group__5_in_rule__Formula__Group__43138);
            rule__Formula__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Formula__Group__4


    // $ANTLR start rule__Formula__Group__4__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1573:1: rule__Formula__Group__4__Impl : ( ( rule__Formula__ExprAssignment_4 ) ) ;
    public final void rule__Formula__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1577:1: ( ( ( rule__Formula__ExprAssignment_4 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1578:1: ( ( rule__Formula__ExprAssignment_4 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1578:1: ( ( rule__Formula__ExprAssignment_4 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1579:1: ( rule__Formula__ExprAssignment_4 )
            {
             before(grammarAccess.getFormulaAccess().getExprAssignment_4()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1580:1: ( rule__Formula__ExprAssignment_4 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1580:2: rule__Formula__ExprAssignment_4
            {
            pushFollow(FOLLOW_rule__Formula__ExprAssignment_4_in_rule__Formula__Group__4__Impl3165);
            rule__Formula__ExprAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getFormulaAccess().getExprAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Formula__Group__4__Impl


    // $ANTLR start rule__Formula__Group__5
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1590:1: rule__Formula__Group__5 : rule__Formula__Group__5__Impl ;
    public final void rule__Formula__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1594:1: ( rule__Formula__Group__5__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1595:2: rule__Formula__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Formula__Group__5__Impl_in_rule__Formula__Group__53195);
            rule__Formula__Group__5__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Formula__Group__5


    // $ANTLR start rule__Formula__Group__5__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1601:1: rule__Formula__Group__5__Impl : ( ';' ) ;
    public final void rule__Formula__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1605:1: ( ( ';' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1606:1: ( ';' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1606:1: ( ';' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1607:1: ';'
            {
             before(grammarAccess.getFormulaAccess().getSemicolonKeyword_5()); 
            match(input,16,FOLLOW_16_in_rule__Formula__Group__5__Impl3223); 
             after(grammarAccess.getFormulaAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Formula__Group__5__Impl


    // $ANTLR start rule__Addition__Group__0
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1632:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1636:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1637:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_rule__Addition__Group__0__Impl_in_rule__Addition__Group__03266);
            rule__Addition__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Addition__Group__1_in_rule__Addition__Group__03269);
            rule__Addition__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Addition__Group__0


    // $ANTLR start rule__Addition__Group__0__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1644:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1648:1: ( ( ruleMultiplication ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1649:1: ( ruleMultiplication )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1649:1: ( ruleMultiplication )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1650:1: ruleMultiplication
            {
             before(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleMultiplication_in_rule__Addition__Group__0__Impl3296);
            ruleMultiplication();
            _fsp--;

             after(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Addition__Group__0__Impl


    // $ANTLR start rule__Addition__Group__1
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1661:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1665:1: ( rule__Addition__Group__1__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1666:2: rule__Addition__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group__1__Impl_in_rule__Addition__Group__13325);
            rule__Addition__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Addition__Group__1


    // $ANTLR start rule__Addition__Group__1__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1672:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1676:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1677:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1677:1: ( ( rule__Addition__Group_1__0 )* )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1678:1: ( rule__Addition__Group_1__0 )*
            {
             before(grammarAccess.getAdditionAccess().getGroup_1()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1679:1: ( rule__Addition__Group_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==25) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1679:2: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Addition__Group_1__0_in_rule__Addition__Group__1__Impl3352);
            	    rule__Addition__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getAdditionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Addition__Group__1__Impl


    // $ANTLR start rule__Addition__Group_1__0
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1693:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1697:1: ( rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1698:2: rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1
            {
            pushFollow(FOLLOW_rule__Addition__Group_1__0__Impl_in_rule__Addition__Group_1__03387);
            rule__Addition__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Addition__Group_1__1_in_rule__Addition__Group_1__03390);
            rule__Addition__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Addition__Group_1__0


    // $ANTLR start rule__Addition__Group_1__0__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1705:1: rule__Addition__Group_1__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1709:1: ( ( () ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1710:1: ( () )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1710:1: ( () )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1711:1: ()
            {
             before(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1712:1: ()
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1714:1: 
            {
            }

             after(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Addition__Group_1__0__Impl


    // $ANTLR start rule__Addition__Group_1__1
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1724:1: rule__Addition__Group_1__1 : rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 ;
    public final void rule__Addition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1728:1: ( rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1729:2: rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2
            {
            pushFollow(FOLLOW_rule__Addition__Group_1__1__Impl_in_rule__Addition__Group_1__13448);
            rule__Addition__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Addition__Group_1__2_in_rule__Addition__Group_1__13451);
            rule__Addition__Group_1__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Addition__Group_1__1


    // $ANTLR start rule__Addition__Group_1__1__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1736:1: rule__Addition__Group_1__1__Impl : ( '+' ) ;
    public final void rule__Addition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1740:1: ( ( '+' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1741:1: ( '+' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1741:1: ( '+' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1742:1: '+'
            {
             before(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_1()); 
            match(input,25,FOLLOW_25_in_rule__Addition__Group_1__1__Impl3479); 
             after(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Addition__Group_1__1__Impl


    // $ANTLR start rule__Addition__Group_1__2
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1755:1: rule__Addition__Group_1__2 : rule__Addition__Group_1__2__Impl ;
    public final void rule__Addition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1759:1: ( rule__Addition__Group_1__2__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1760:2: rule__Addition__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group_1__2__Impl_in_rule__Addition__Group_1__23510);
            rule__Addition__Group_1__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Addition__Group_1__2


    // $ANTLR start rule__Addition__Group_1__2__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1766:1: rule__Addition__Group_1__2__Impl : ( ( rule__Addition__RightAssignment_1_2 ) ) ;
    public final void rule__Addition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1770:1: ( ( ( rule__Addition__RightAssignment_1_2 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1771:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1771:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1772:1: ( rule__Addition__RightAssignment_1_2 )
            {
             before(grammarAccess.getAdditionAccess().getRightAssignment_1_2()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1773:1: ( rule__Addition__RightAssignment_1_2 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1773:2: rule__Addition__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Addition__RightAssignment_1_2_in_rule__Addition__Group_1__2__Impl3537);
            rule__Addition__RightAssignment_1_2();
            _fsp--;


            }

             after(grammarAccess.getAdditionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Addition__Group_1__2__Impl


    // $ANTLR start rule__Multiplication__Group__0
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1789:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1793:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1794:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__0__Impl_in_rule__Multiplication__Group__03573);
            rule__Multiplication__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Multiplication__Group__1_in_rule__Multiplication__Group__03576);
            rule__Multiplication__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Multiplication__Group__0


    // $ANTLR start rule__Multiplication__Group__0__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1801:1: rule__Multiplication__Group__0__Impl : ( rulePostfixOperators ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1805:1: ( ( rulePostfixOperators ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1806:1: ( rulePostfixOperators )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1806:1: ( rulePostfixOperators )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1807:1: rulePostfixOperators
            {
             before(grammarAccess.getMultiplicationAccess().getPostfixOperatorsParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePostfixOperators_in_rule__Multiplication__Group__0__Impl3603);
            rulePostfixOperators();
            _fsp--;

             after(grammarAccess.getMultiplicationAccess().getPostfixOperatorsParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Multiplication__Group__0__Impl


    // $ANTLR start rule__Multiplication__Group__1
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1818:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1822:1: ( rule__Multiplication__Group__1__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1823:2: rule__Multiplication__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__1__Impl_in_rule__Multiplication__Group__13632);
            rule__Multiplication__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Multiplication__Group__1


    // $ANTLR start rule__Multiplication__Group__1__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1829:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1833:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1834:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1834:1: ( ( rule__Multiplication__Group_1__0 )* )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1835:1: ( rule__Multiplication__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1836:1: ( rule__Multiplication__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==26) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1836:2: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Multiplication__Group_1__0_in_rule__Multiplication__Group__1__Impl3659);
            	    rule__Multiplication__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getMultiplicationAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Multiplication__Group__1__Impl


    // $ANTLR start rule__Multiplication__Group_1__0
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1850:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1854:1: ( rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1855:2: rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1__0__Impl_in_rule__Multiplication__Group_1__03694);
            rule__Multiplication__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Multiplication__Group_1__1_in_rule__Multiplication__Group_1__03697);
            rule__Multiplication__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Multiplication__Group_1__0


    // $ANTLR start rule__Multiplication__Group_1__0__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1862:1: rule__Multiplication__Group_1__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1866:1: ( ( () ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1867:1: ( () )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1867:1: ( () )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1868:1: ()
            {
             before(grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1869:1: ()
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1871:1: 
            {
            }

             after(grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Multiplication__Group_1__0__Impl


    // $ANTLR start rule__Multiplication__Group_1__1
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1881:1: rule__Multiplication__Group_1__1 : rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 ;
    public final void rule__Multiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1885:1: ( rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1886:2: rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1__1__Impl_in_rule__Multiplication__Group_1__13755);
            rule__Multiplication__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Multiplication__Group_1__2_in_rule__Multiplication__Group_1__13758);
            rule__Multiplication__Group_1__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Multiplication__Group_1__1


    // $ANTLR start rule__Multiplication__Group_1__1__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1893:1: rule__Multiplication__Group_1__1__Impl : ( '*' ) ;
    public final void rule__Multiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1897:1: ( ( '*' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1898:1: ( '*' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1898:1: ( '*' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1899:1: '*'
            {
             before(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_1()); 
            match(input,26,FOLLOW_26_in_rule__Multiplication__Group_1__1__Impl3786); 
             after(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Multiplication__Group_1__1__Impl


    // $ANTLR start rule__Multiplication__Group_1__2
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1912:1: rule__Multiplication__Group_1__2 : rule__Multiplication__Group_1__2__Impl ;
    public final void rule__Multiplication__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1916:1: ( rule__Multiplication__Group_1__2__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1917:2: rule__Multiplication__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1__2__Impl_in_rule__Multiplication__Group_1__23817);
            rule__Multiplication__Group_1__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Multiplication__Group_1__2


    // $ANTLR start rule__Multiplication__Group_1__2__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1923:1: rule__Multiplication__Group_1__2__Impl : ( ( rule__Multiplication__RightAssignment_1_2 ) ) ;
    public final void rule__Multiplication__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1927:1: ( ( ( rule__Multiplication__RightAssignment_1_2 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1928:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1928:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1929:1: ( rule__Multiplication__RightAssignment_1_2 )
            {
             before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_2()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1930:1: ( rule__Multiplication__RightAssignment_1_2 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1930:2: rule__Multiplication__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Multiplication__RightAssignment_1_2_in_rule__Multiplication__Group_1__2__Impl3844);
            rule__Multiplication__RightAssignment_1_2();
            _fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Multiplication__Group_1__2__Impl


    // $ANTLR start rule__PostfixOperators__Group__0
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1946:1: rule__PostfixOperators__Group__0 : rule__PostfixOperators__Group__0__Impl rule__PostfixOperators__Group__1 ;
    public final void rule__PostfixOperators__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1950:1: ( rule__PostfixOperators__Group__0__Impl rule__PostfixOperators__Group__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1951:2: rule__PostfixOperators__Group__0__Impl rule__PostfixOperators__Group__1
            {
            pushFollow(FOLLOW_rule__PostfixOperators__Group__0__Impl_in_rule__PostfixOperators__Group__03880);
            rule__PostfixOperators__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PostfixOperators__Group__1_in_rule__PostfixOperators__Group__03883);
            rule__PostfixOperators__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PostfixOperators__Group__0


    // $ANTLR start rule__PostfixOperators__Group__0__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1958:1: rule__PostfixOperators__Group__0__Impl : ( ruleAtomic ) ;
    public final void rule__PostfixOperators__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1962:1: ( ( ruleAtomic ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1963:1: ( ruleAtomic )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1963:1: ( ruleAtomic )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1964:1: ruleAtomic
            {
             before(grammarAccess.getPostfixOperatorsAccess().getAtomicParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAtomic_in_rule__PostfixOperators__Group__0__Impl3910);
            ruleAtomic();
            _fsp--;

             after(grammarAccess.getPostfixOperatorsAccess().getAtomicParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PostfixOperators__Group__0__Impl


    // $ANTLR start rule__PostfixOperators__Group__1
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1975:1: rule__PostfixOperators__Group__1 : rule__PostfixOperators__Group__1__Impl ;
    public final void rule__PostfixOperators__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1979:1: ( rule__PostfixOperators__Group__1__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1980:2: rule__PostfixOperators__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PostfixOperators__Group__1__Impl_in_rule__PostfixOperators__Group__13939);
            rule__PostfixOperators__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PostfixOperators__Group__1


    // $ANTLR start rule__PostfixOperators__Group__1__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1986:1: rule__PostfixOperators__Group__1__Impl : ( ( rule__PostfixOperators__Group_1__0 )? ) ;
    public final void rule__PostfixOperators__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1990:1: ( ( ( rule__PostfixOperators__Group_1__0 )? ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1991:1: ( ( rule__PostfixOperators__Group_1__0 )? )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1991:1: ( ( rule__PostfixOperators__Group_1__0 )? )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1992:1: ( rule__PostfixOperators__Group_1__0 )?
            {
             before(grammarAccess.getPostfixOperatorsAccess().getGroup_1()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1993:1: ( rule__PostfixOperators__Group_1__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1993:2: rule__PostfixOperators__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__PostfixOperators__Group_1__0_in_rule__PostfixOperators__Group__1__Impl3966);
                    rule__PostfixOperators__Group_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPostfixOperatorsAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PostfixOperators__Group__1__Impl


    // $ANTLR start rule__PostfixOperators__Group_1__0
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2007:1: rule__PostfixOperators__Group_1__0 : rule__PostfixOperators__Group_1__0__Impl rule__PostfixOperators__Group_1__1 ;
    public final void rule__PostfixOperators__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2011:1: ( rule__PostfixOperators__Group_1__0__Impl rule__PostfixOperators__Group_1__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2012:2: rule__PostfixOperators__Group_1__0__Impl rule__PostfixOperators__Group_1__1
            {
            pushFollow(FOLLOW_rule__PostfixOperators__Group_1__0__Impl_in_rule__PostfixOperators__Group_1__04001);
            rule__PostfixOperators__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PostfixOperators__Group_1__1_in_rule__PostfixOperators__Group_1__04004);
            rule__PostfixOperators__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PostfixOperators__Group_1__0


    // $ANTLR start rule__PostfixOperators__Group_1__0__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2019:1: rule__PostfixOperators__Group_1__0__Impl : ( () ) ;
    public final void rule__PostfixOperators__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2023:1: ( ( () ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2024:1: ( () )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2024:1: ( () )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2025:1: ()
            {
             before(grammarAccess.getPostfixOperatorsAccess().getArrayAccessExprAction_1_0()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2026:1: ()
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2028:1: 
            {
            }

             after(grammarAccess.getPostfixOperatorsAccess().getArrayAccessExprAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PostfixOperators__Group_1__0__Impl


    // $ANTLR start rule__PostfixOperators__Group_1__1
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2038:1: rule__PostfixOperators__Group_1__1 : rule__PostfixOperators__Group_1__1__Impl rule__PostfixOperators__Group_1__2 ;
    public final void rule__PostfixOperators__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2042:1: ( rule__PostfixOperators__Group_1__1__Impl rule__PostfixOperators__Group_1__2 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2043:2: rule__PostfixOperators__Group_1__1__Impl rule__PostfixOperators__Group_1__2
            {
            pushFollow(FOLLOW_rule__PostfixOperators__Group_1__1__Impl_in_rule__PostfixOperators__Group_1__14062);
            rule__PostfixOperators__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PostfixOperators__Group_1__2_in_rule__PostfixOperators__Group_1__14065);
            rule__PostfixOperators__Group_1__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PostfixOperators__Group_1__1


    // $ANTLR start rule__PostfixOperators__Group_1__1__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2050:1: rule__PostfixOperators__Group_1__1__Impl : ( '[' ) ;
    public final void rule__PostfixOperators__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2054:1: ( ( '[' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2055:1: ( '[' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2055:1: ( '[' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2056:1: '['
            {
             before(grammarAccess.getPostfixOperatorsAccess().getLeftSquareBracketKeyword_1_1()); 
            match(input,18,FOLLOW_18_in_rule__PostfixOperators__Group_1__1__Impl4093); 
             after(grammarAccess.getPostfixOperatorsAccess().getLeftSquareBracketKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PostfixOperators__Group_1__1__Impl


    // $ANTLR start rule__PostfixOperators__Group_1__2
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2069:1: rule__PostfixOperators__Group_1__2 : rule__PostfixOperators__Group_1__2__Impl rule__PostfixOperators__Group_1__3 ;
    public final void rule__PostfixOperators__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2073:1: ( rule__PostfixOperators__Group_1__2__Impl rule__PostfixOperators__Group_1__3 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2074:2: rule__PostfixOperators__Group_1__2__Impl rule__PostfixOperators__Group_1__3
            {
            pushFollow(FOLLOW_rule__PostfixOperators__Group_1__2__Impl_in_rule__PostfixOperators__Group_1__24124);
            rule__PostfixOperators__Group_1__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PostfixOperators__Group_1__3_in_rule__PostfixOperators__Group_1__24127);
            rule__PostfixOperators__Group_1__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PostfixOperators__Group_1__2


    // $ANTLR start rule__PostfixOperators__Group_1__2__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2081:1: rule__PostfixOperators__Group_1__2__Impl : ( ( rule__PostfixOperators__IndexAssignment_1_2 ) ) ;
    public final void rule__PostfixOperators__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2085:1: ( ( ( rule__PostfixOperators__IndexAssignment_1_2 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2086:1: ( ( rule__PostfixOperators__IndexAssignment_1_2 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2086:1: ( ( rule__PostfixOperators__IndexAssignment_1_2 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2087:1: ( rule__PostfixOperators__IndexAssignment_1_2 )
            {
             before(grammarAccess.getPostfixOperatorsAccess().getIndexAssignment_1_2()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2088:1: ( rule__PostfixOperators__IndexAssignment_1_2 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2088:2: rule__PostfixOperators__IndexAssignment_1_2
            {
            pushFollow(FOLLOW_rule__PostfixOperators__IndexAssignment_1_2_in_rule__PostfixOperators__Group_1__2__Impl4154);
            rule__PostfixOperators__IndexAssignment_1_2();
            _fsp--;


            }

             after(grammarAccess.getPostfixOperatorsAccess().getIndexAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PostfixOperators__Group_1__2__Impl


    // $ANTLR start rule__PostfixOperators__Group_1__3
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2098:1: rule__PostfixOperators__Group_1__3 : rule__PostfixOperators__Group_1__3__Impl ;
    public final void rule__PostfixOperators__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2102:1: ( rule__PostfixOperators__Group_1__3__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2103:2: rule__PostfixOperators__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__PostfixOperators__Group_1__3__Impl_in_rule__PostfixOperators__Group_1__34184);
            rule__PostfixOperators__Group_1__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PostfixOperators__Group_1__3


    // $ANTLR start rule__PostfixOperators__Group_1__3__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2109:1: rule__PostfixOperators__Group_1__3__Impl : ( ']' ) ;
    public final void rule__PostfixOperators__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2113:1: ( ( ']' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2114:1: ( ']' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2114:1: ( ']' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2115:1: ']'
            {
             before(grammarAccess.getPostfixOperatorsAccess().getRightSquareBracketKeyword_1_3()); 
            match(input,19,FOLLOW_19_in_rule__PostfixOperators__Group_1__3__Impl4212); 
             after(grammarAccess.getPostfixOperatorsAccess().getRightSquareBracketKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PostfixOperators__Group_1__3__Impl


    // $ANTLR start rule__Atomic__Group_0__0
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2136:1: rule__Atomic__Group_0__0 : rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 ;
    public final void rule__Atomic__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2140:1: ( rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2141:2: rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_0__0__Impl_in_rule__Atomic__Group_0__04251);
            rule__Atomic__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_0__1_in_rule__Atomic__Group_0__04254);
            rule__Atomic__Group_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Atomic__Group_0__0


    // $ANTLR start rule__Atomic__Group_0__0__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2148:1: rule__Atomic__Group_0__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2152:1: ( ( () ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2153:1: ( () )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2153:1: ( () )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2154:1: ()
            {
             before(grammarAccess.getAtomicAccess().getSymbolRefAction_0_0()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2155:1: ()
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2157:1: 
            {
            }

             after(grammarAccess.getAtomicAccess().getSymbolRefAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Atomic__Group_0__0__Impl


    // $ANTLR start rule__Atomic__Group_0__1
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2167:1: rule__Atomic__Group_0__1 : rule__Atomic__Group_0__1__Impl ;
    public final void rule__Atomic__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2171:1: ( rule__Atomic__Group_0__1__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2172:2: rule__Atomic__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_0__1__Impl_in_rule__Atomic__Group_0__14312);
            rule__Atomic__Group_0__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Atomic__Group_0__1


    // $ANTLR start rule__Atomic__Group_0__1__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2178:1: rule__Atomic__Group_0__1__Impl : ( ( rule__Atomic__SymbolAssignment_0_1 ) ) ;
    public final void rule__Atomic__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2182:1: ( ( ( rule__Atomic__SymbolAssignment_0_1 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2183:1: ( ( rule__Atomic__SymbolAssignment_0_1 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2183:1: ( ( rule__Atomic__SymbolAssignment_0_1 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2184:1: ( rule__Atomic__SymbolAssignment_0_1 )
            {
             before(grammarAccess.getAtomicAccess().getSymbolAssignment_0_1()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2185:1: ( rule__Atomic__SymbolAssignment_0_1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2185:2: rule__Atomic__SymbolAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Atomic__SymbolAssignment_0_1_in_rule__Atomic__Group_0__1__Impl4339);
            rule__Atomic__SymbolAssignment_0_1();
            _fsp--;


            }

             after(grammarAccess.getAtomicAccess().getSymbolAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Atomic__Group_0__1__Impl


    // $ANTLR start rule__Atomic__Group_1__0
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2199:1: rule__Atomic__Group_1__0 : rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 ;
    public final void rule__Atomic__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2203:1: ( rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2204:2: rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_1__0__Impl_in_rule__Atomic__Group_1__04373);
            rule__Atomic__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_1__1_in_rule__Atomic__Group_1__04376);
            rule__Atomic__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Atomic__Group_1__0


    // $ANTLR start rule__Atomic__Group_1__0__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2211:1: rule__Atomic__Group_1__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2215:1: ( ( () ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2216:1: ( () )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2216:1: ( () )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2217:1: ()
            {
             before(grammarAccess.getAtomicAccess().getNumberLiteralAction_1_0()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2218:1: ()
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2220:1: 
            {
            }

             after(grammarAccess.getAtomicAccess().getNumberLiteralAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Atomic__Group_1__0__Impl


    // $ANTLR start rule__Atomic__Group_1__1
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2230:1: rule__Atomic__Group_1__1 : rule__Atomic__Group_1__1__Impl ;
    public final void rule__Atomic__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2234:1: ( rule__Atomic__Group_1__1__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2235:2: rule__Atomic__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_1__1__Impl_in_rule__Atomic__Group_1__14434);
            rule__Atomic__Group_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Atomic__Group_1__1


    // $ANTLR start rule__Atomic__Group_1__1__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2241:1: rule__Atomic__Group_1__1__Impl : ( ( rule__Atomic__ValueAssignment_1_1 ) ) ;
    public final void rule__Atomic__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2245:1: ( ( ( rule__Atomic__ValueAssignment_1_1 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2246:1: ( ( rule__Atomic__ValueAssignment_1_1 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2246:1: ( ( rule__Atomic__ValueAssignment_1_1 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2247:1: ( rule__Atomic__ValueAssignment_1_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_1_1()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2248:1: ( rule__Atomic__ValueAssignment_1_1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2248:2: rule__Atomic__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Atomic__ValueAssignment_1_1_in_rule__Atomic__Group_1__1__Impl4461);
            rule__Atomic__ValueAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getAtomicAccess().getValueAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Atomic__Group_1__1__Impl


    // $ANTLR start rule__QID__Group__0
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2262:1: rule__QID__Group__0 : rule__QID__Group__0__Impl rule__QID__Group__1 ;
    public final void rule__QID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2266:1: ( rule__QID__Group__0__Impl rule__QID__Group__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2267:2: rule__QID__Group__0__Impl rule__QID__Group__1
            {
            pushFollow(FOLLOW_rule__QID__Group__0__Impl_in_rule__QID__Group__04495);
            rule__QID__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__QID__Group__1_in_rule__QID__Group__04498);
            rule__QID__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__QID__Group__0


    // $ANTLR start rule__QID__Group__0__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2274:1: rule__QID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2278:1: ( ( RULE_ID ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2279:1: ( RULE_ID )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2279:1: ( RULE_ID )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2280:1: RULE_ID
            {
             before(grammarAccess.getQIDAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QID__Group__0__Impl4525); 
             after(grammarAccess.getQIDAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__QID__Group__0__Impl


    // $ANTLR start rule__QID__Group__1
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2291:1: rule__QID__Group__1 : rule__QID__Group__1__Impl ;
    public final void rule__QID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2295:1: ( rule__QID__Group__1__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2296:2: rule__QID__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QID__Group__1__Impl_in_rule__QID__Group__14554);
            rule__QID__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__QID__Group__1


    // $ANTLR start rule__QID__Group__1__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2302:1: rule__QID__Group__1__Impl : ( ( rule__QID__Group_1__0 )* ) ;
    public final void rule__QID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2306:1: ( ( ( rule__QID__Group_1__0 )* ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2307:1: ( ( rule__QID__Group_1__0 )* )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2307:1: ( ( rule__QID__Group_1__0 )* )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2308:1: ( rule__QID__Group_1__0 )*
            {
             before(grammarAccess.getQIDAccess().getGroup_1()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2309:1: ( rule__QID__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==27) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2309:2: rule__QID__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QID__Group_1__0_in_rule__QID__Group__1__Impl4581);
            	    rule__QID__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getQIDAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__QID__Group__1__Impl


    // $ANTLR start rule__QID__Group_1__0
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2323:1: rule__QID__Group_1__0 : rule__QID__Group_1__0__Impl rule__QID__Group_1__1 ;
    public final void rule__QID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2327:1: ( rule__QID__Group_1__0__Impl rule__QID__Group_1__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2328:2: rule__QID__Group_1__0__Impl rule__QID__Group_1__1
            {
            pushFollow(FOLLOW_rule__QID__Group_1__0__Impl_in_rule__QID__Group_1__04616);
            rule__QID__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__QID__Group_1__1_in_rule__QID__Group_1__04619);
            rule__QID__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__QID__Group_1__0


    // $ANTLR start rule__QID__Group_1__0__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2335:1: rule__QID__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2339:1: ( ( '.' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2340:1: ( '.' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2340:1: ( '.' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2341:1: '.'
            {
             before(grammarAccess.getQIDAccess().getFullStopKeyword_1_0()); 
            match(input,27,FOLLOW_27_in_rule__QID__Group_1__0__Impl4647); 
             after(grammarAccess.getQIDAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__QID__Group_1__0__Impl


    // $ANTLR start rule__QID__Group_1__1
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2354:1: rule__QID__Group_1__1 : rule__QID__Group_1__1__Impl ;
    public final void rule__QID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2358:1: ( rule__QID__Group_1__1__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2359:2: rule__QID__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QID__Group_1__1__Impl_in_rule__QID__Group_1__14678);
            rule__QID__Group_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__QID__Group_1__1


    // $ANTLR start rule__QID__Group_1__1__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2365:1: rule__QID__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2369:1: ( ( RULE_ID ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2370:1: ( RULE_ID )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2370:1: ( RULE_ID )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2371:1: RULE_ID
            {
             before(grammarAccess.getQIDAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QID__Group_1__1__Impl4705); 
             after(grammarAccess.getQIDAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__QID__Group_1__1__Impl


    // $ANTLR start rule__Model__ElementsAssignment
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2387:1: rule__Model__ElementsAssignment : ( ruleElement ) ;
    public final void rule__Model__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2391:1: ( ( ruleElement ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2392:1: ( ruleElement )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2392:1: ( ruleElement )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2393:1: ruleElement
            {
             before(grammarAccess.getModelAccess().getElementsElementParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleElement_in_rule__Model__ElementsAssignment4743);
            ruleElement();
            _fsp--;

             after(grammarAccess.getModelAccess().getElementsElementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__ElementsAssignment


    // $ANTLR start rule__EnumDecl__NameAssignment_1
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2402:1: rule__EnumDecl__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EnumDecl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2406:1: ( ( RULE_ID ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2407:1: ( RULE_ID )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2407:1: ( RULE_ID )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2408:1: RULE_ID
            {
             before(grammarAccess.getEnumDeclAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumDecl__NameAssignment_14774); 
             after(grammarAccess.getEnumDeclAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumDecl__NameAssignment_1


    // $ANTLR start rule__EnumDecl__LiteralsAssignment_3
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2417:1: rule__EnumDecl__LiteralsAssignment_3 : ( ruleEnumLiteral ) ;
    public final void rule__EnumDecl__LiteralsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2421:1: ( ( ruleEnumLiteral ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2422:1: ( ruleEnumLiteral )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2422:1: ( ruleEnumLiteral )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2423:1: ruleEnumLiteral
            {
             before(grammarAccess.getEnumDeclAccess().getLiteralsEnumLiteralParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEnumLiteral_in_rule__EnumDecl__LiteralsAssignment_34805);
            ruleEnumLiteral();
            _fsp--;

             after(grammarAccess.getEnumDeclAccess().getLiteralsEnumLiteralParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumDecl__LiteralsAssignment_3


    // $ANTLR start rule__EnumLiteral__NameAssignment_1
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2432:1: rule__EnumLiteral__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EnumLiteral__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2436:1: ( ( RULE_ID ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2437:1: ( RULE_ID )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2437:1: ( RULE_ID )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2438:1: RULE_ID
            {
             before(grammarAccess.getEnumLiteralAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumLiteral__NameAssignment_14836); 
             after(grammarAccess.getEnumLiteralAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumLiteral__NameAssignment_1


    // $ANTLR start rule__VarDecl__TypeAssignment_2
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2447:1: rule__VarDecl__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__VarDecl__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2451:1: ( ( ruleType ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2452:1: ( ruleType )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2452:1: ( ruleType )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2453:1: ruleType
            {
             before(grammarAccess.getVarDeclAccess().getTypeTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__VarDecl__TypeAssignment_24867);
            ruleType();
            _fsp--;

             after(grammarAccess.getVarDeclAccess().getTypeTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VarDecl__TypeAssignment_2


    // $ANTLR start rule__VarDecl__NameAssignment_3
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2462:1: rule__VarDecl__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__VarDecl__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2466:1: ( ( RULE_ID ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2467:1: ( RULE_ID )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2467:1: ( RULE_ID )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2468:1: RULE_ID
            {
             before(grammarAccess.getVarDeclAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VarDecl__NameAssignment_34898); 
             after(grammarAccess.getVarDeclAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VarDecl__NameAssignment_3


    // $ANTLR start rule__ArrayType__BaseTypeAssignment_3
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2477:1: rule__ArrayType__BaseTypeAssignment_3 : ( ruleType ) ;
    public final void rule__ArrayType__BaseTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2481:1: ( ( ruleType ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2482:1: ( ruleType )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2482:1: ( ruleType )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2483:1: ruleType
            {
             before(grammarAccess.getArrayTypeAccess().getBaseTypeTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__ArrayType__BaseTypeAssignment_34929);
            ruleType();
            _fsp--;

             after(grammarAccess.getArrayTypeAccess().getBaseTypeTypeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ArrayType__BaseTypeAssignment_3


    // $ANTLR start rule__EnumType__EnumRefAssignment
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2492:1: rule__EnumType__EnumRefAssignment : ( ( RULE_ID ) ) ;
    public final void rule__EnumType__EnumRefAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2496:1: ( ( ( RULE_ID ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2497:1: ( ( RULE_ID ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2497:1: ( ( RULE_ID ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2498:1: ( RULE_ID )
            {
             before(grammarAccess.getEnumTypeAccess().getEnumRefEnumDeclCrossReference_0()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2499:1: ( RULE_ID )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2500:1: RULE_ID
            {
             before(grammarAccess.getEnumTypeAccess().getEnumRefEnumDeclIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumType__EnumRefAssignment4964); 
             after(grammarAccess.getEnumTypeAccess().getEnumRefEnumDeclIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getEnumTypeAccess().getEnumRefEnumDeclCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumType__EnumRefAssignment


    // $ANTLR start rule__Formula__TypeAssignment_1
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2511:1: rule__Formula__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__Formula__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2515:1: ( ( ruleType ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2516:1: ( ruleType )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2516:1: ( ruleType )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2517:1: ruleType
            {
             before(grammarAccess.getFormulaAccess().getTypeTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Formula__TypeAssignment_14999);
            ruleType();
            _fsp--;

             after(grammarAccess.getFormulaAccess().getTypeTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Formula__TypeAssignment_1


    // $ANTLR start rule__Formula__NameAssignment_2
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2526:1: rule__Formula__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Formula__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2530:1: ( ( RULE_ID ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2531:1: ( RULE_ID )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2531:1: ( RULE_ID )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2532:1: RULE_ID
            {
             before(grammarAccess.getFormulaAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Formula__NameAssignment_25030); 
             after(grammarAccess.getFormulaAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Formula__NameAssignment_2


    // $ANTLR start rule__Formula__ExprAssignment_4
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2541:1: rule__Formula__ExprAssignment_4 : ( ruleExpr ) ;
    public final void rule__Formula__ExprAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2545:1: ( ( ruleExpr ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2546:1: ( ruleExpr )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2546:1: ( ruleExpr )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2547:1: ruleExpr
            {
             before(grammarAccess.getFormulaAccess().getExprExprParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleExpr_in_rule__Formula__ExprAssignment_45061);
            ruleExpr();
            _fsp--;

             after(grammarAccess.getFormulaAccess().getExprExprParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Formula__ExprAssignment_4


    // $ANTLR start rule__Addition__RightAssignment_1_2
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2556:1: rule__Addition__RightAssignment_1_2 : ( ruleMultiplication ) ;
    public final void rule__Addition__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2560:1: ( ( ruleMultiplication ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2561:1: ( ruleMultiplication )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2561:1: ( ruleMultiplication )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2562:1: ruleMultiplication
            {
             before(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleMultiplication_in_rule__Addition__RightAssignment_1_25092);
            ruleMultiplication();
            _fsp--;

             after(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Addition__RightAssignment_1_2


    // $ANTLR start rule__Multiplication__RightAssignment_1_2
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2571:1: rule__Multiplication__RightAssignment_1_2 : ( rulePostfixOperators ) ;
    public final void rule__Multiplication__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2575:1: ( ( rulePostfixOperators ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2576:1: ( rulePostfixOperators )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2576:1: ( rulePostfixOperators )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2577:1: rulePostfixOperators
            {
             before(grammarAccess.getMultiplicationAccess().getRightPostfixOperatorsParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_rulePostfixOperators_in_rule__Multiplication__RightAssignment_1_25123);
            rulePostfixOperators();
            _fsp--;

             after(grammarAccess.getMultiplicationAccess().getRightPostfixOperatorsParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Multiplication__RightAssignment_1_2


    // $ANTLR start rule__PostfixOperators__IndexAssignment_1_2
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2586:1: rule__PostfixOperators__IndexAssignment_1_2 : ( ruleExpr ) ;
    public final void rule__PostfixOperators__IndexAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2590:1: ( ( ruleExpr ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2591:1: ( ruleExpr )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2591:1: ( ruleExpr )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2592:1: ruleExpr
            {
             before(grammarAccess.getPostfixOperatorsAccess().getIndexExprParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleExpr_in_rule__PostfixOperators__IndexAssignment_1_25154);
            ruleExpr();
            _fsp--;

             after(grammarAccess.getPostfixOperatorsAccess().getIndexExprParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PostfixOperators__IndexAssignment_1_2


    // $ANTLR start rule__Atomic__SymbolAssignment_0_1
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2601:1: rule__Atomic__SymbolAssignment_0_1 : ( ( ruleQID ) ) ;
    public final void rule__Atomic__SymbolAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2605:1: ( ( ( ruleQID ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2606:1: ( ( ruleQID ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2606:1: ( ( ruleQID ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2607:1: ( ruleQID )
            {
             before(grammarAccess.getAtomicAccess().getSymbolSymbolCrossReference_0_1_0()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2608:1: ( ruleQID )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2609:1: ruleQID
            {
             before(grammarAccess.getAtomicAccess().getSymbolSymbolQIDParserRuleCall_0_1_0_1()); 
            pushFollow(FOLLOW_ruleQID_in_rule__Atomic__SymbolAssignment_0_15189);
            ruleQID();
            _fsp--;

             after(grammarAccess.getAtomicAccess().getSymbolSymbolQIDParserRuleCall_0_1_0_1()); 

            }

             after(grammarAccess.getAtomicAccess().getSymbolSymbolCrossReference_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Atomic__SymbolAssignment_0_1


    // $ANTLR start rule__Atomic__ValueAssignment_1_1
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2620:1: rule__Atomic__ValueAssignment_1_1 : ( RULE_NUMBER ) ;
    public final void rule__Atomic__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2624:1: ( ( RULE_NUMBER ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2625:1: ( RULE_NUMBER )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2625:1: ( RULE_NUMBER )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2626:1: RULE_NUMBER
            {
             before(grammarAccess.getAtomicAccess().getValueNUMBERTerminalRuleCall_1_1_0()); 
            match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__Atomic__ValueAssignment_1_15224); 
             after(grammarAccess.getAtomicAccess().getValueNUMBERTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Atomic__ValueAssignment_1_1


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ElementsAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000000809002L});
    public static final BitSet FOLLOW_ruleElement_in_entryRuleElement122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElement129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__Alternatives_in_ruleElement155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumDecl_in_entryRuleEnumDecl182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumDecl189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDecl__Group__0_in_ruleEnumDecl215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumLiteral_in_entryRuleEnumLiteral242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumLiteral249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumLiteral__Group__0_in_ruleEnumLiteral275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDecl_in_entryRuleVarDecl302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarDecl309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__0_in_ruleVarDecl335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_entryRulePrimitiveType422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveType429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Alternatives_in_rulePrimitiveType455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayType_in_entryRuleArrayType482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayType489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__0_in_ruleArrayType515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumType_in_entryRuleEnumType542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumType549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__EnumRefAssignment_in_ruleEnumType575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntType_in_entryRuleIntType602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntType609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntType__Group__0_in_ruleIntType635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolType_in_entryRuleBoolType662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolType669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolType__Group__0_in_ruleBoolType695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatType_in_entryRuleFloatType722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatType729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatType__Group__0_in_ruleFloatType755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormula_in_entryRuleFormula782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormula789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Formula__Group__0_in_ruleFormula815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_entryRuleExpr842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpr849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleExpr875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_entryRuleAddition901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddition908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__0_in_ruleAddition934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_entryRuleMultiplication961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplication968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__0_in_ruleMultiplication994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePostfixOperators_in_entryRulePostfixOperators1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePostfixOperators1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixOperators__Group__0_in_rulePostfixOperators1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_entryRuleAtomic1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomic1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Alternatives_in_ruleAtomic1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQID_in_entryRuleQID1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQID1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QID__Group__0_in_ruleQID1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDecl_in_rule__Element__Alternatives1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormula_in_rule__Element__Alternatives1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumDecl_in_rule__Element__Alternatives1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_rule__Type__Alternatives1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayType_in_rule__Type__Alternatives1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntType_in_rule__PrimitiveType__Alternatives1325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolType_in_rule__PrimitiveType__Alternatives1342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatType_in_rule__PrimitiveType__Alternatives1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumType_in_rule__PrimitiveType__Alternatives1376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0__0_in_rule__Atomic__Alternatives1408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__0_in_rule__Atomic__Alternatives1426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDecl__Group__0__Impl_in_rule__EnumDecl__Group__01457 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumDecl__Group__1_in_rule__EnumDecl__Group__01460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__EnumDecl__Group__0__Impl1488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDecl__Group__1__Impl_in_rule__EnumDecl__Group__11519 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__EnumDecl__Group__2_in_rule__EnumDecl__Group__11522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDecl__NameAssignment_1_in_rule__EnumDecl__Group__1__Impl1549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDecl__Group__2__Impl_in_rule__EnumDecl__Group__21579 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_rule__EnumDecl__Group__3_in_rule__EnumDecl__Group__21582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__EnumDecl__Group__2__Impl1610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDecl__Group__3__Impl_in_rule__EnumDecl__Group__31641 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__EnumDecl__Group__4_in_rule__EnumDecl__Group__31644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDecl__LiteralsAssignment_3_in_rule__EnumDecl__Group__3__Impl1671 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__EnumDecl__Group__4__Impl_in_rule__EnumDecl__Group__41702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__EnumDecl__Group__4__Impl1730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumLiteral__Group__0__Impl_in_rule__EnumLiteral__Group__01771 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumLiteral__Group__1_in_rule__EnumLiteral__Group__01774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumLiteral__Group__1__Impl_in_rule__EnumLiteral__Group__11832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumLiteral__NameAssignment_1_in_rule__EnumLiteral__Group__1__Impl1859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__0__Impl_in_rule__VarDecl__Group__01893 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__1_in_rule__VarDecl__Group__01896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__1__Impl_in_rule__VarDecl__Group__11954 = new BitSet(new long[]{0x0000000000720010L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__2_in_rule__VarDecl__Group__11957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__VarDecl__Group__1__Impl1985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__2__Impl_in_rule__VarDecl__Group__22016 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__3_in_rule__VarDecl__Group__22019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__TypeAssignment_2_in_rule__VarDecl__Group__2__Impl2046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__3__Impl_in_rule__VarDecl__Group__32076 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__4_in_rule__VarDecl__Group__32079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__NameAssignment_3_in_rule__VarDecl__Group__3__Impl2106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__4__Impl_in_rule__VarDecl__Group__42136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__VarDecl__Group__4__Impl2164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__0__Impl_in_rule__ArrayType__Group__02205 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__1_in_rule__ArrayType__Group__02208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__1__Impl_in_rule__ArrayType__Group__12266 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__2_in_rule__ArrayType__Group__12269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ArrayType__Group__1__Impl2297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__2__Impl_in_rule__ArrayType__Group__22328 = new BitSet(new long[]{0x0000000000720010L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__3_in_rule__ArrayType__Group__22331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ArrayType__Group__2__Impl2359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__3__Impl_in_rule__ArrayType__Group__32390 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__4_in_rule__ArrayType__Group__32393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__BaseTypeAssignment_3_in_rule__ArrayType__Group__3__Impl2420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__4__Impl_in_rule__ArrayType__Group__42450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ArrayType__Group__4__Impl2478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntType__Group__0__Impl_in_rule__IntType__Group__02519 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__IntType__Group__1_in_rule__IntType__Group__02522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntType__Group__1__Impl_in_rule__IntType__Group__12580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__IntType__Group__1__Impl2608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolType__Group__0__Impl_in_rule__BoolType__Group__02643 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__BoolType__Group__1_in_rule__BoolType__Group__02646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolType__Group__1__Impl_in_rule__BoolType__Group__12704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__BoolType__Group__1__Impl2732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatType__Group__0__Impl_in_rule__FloatType__Group__02767 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__FloatType__Group__1_in_rule__FloatType__Group__02770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatType__Group__1__Impl_in_rule__FloatType__Group__12828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__FloatType__Group__1__Impl2856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Formula__Group__0__Impl_in_rule__Formula__Group__02891 = new BitSet(new long[]{0x0000000000720010L});
    public static final BitSet FOLLOW_rule__Formula__Group__1_in_rule__Formula__Group__02894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Formula__Group__0__Impl2922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Formula__Group__1__Impl_in_rule__Formula__Group__12953 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Formula__Group__2_in_rule__Formula__Group__12956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Formula__TypeAssignment_1_in_rule__Formula__Group__1__Impl2983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Formula__Group__2__Impl_in_rule__Formula__Group__23013 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Formula__Group__3_in_rule__Formula__Group__23016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Formula__NameAssignment_2_in_rule__Formula__Group__2__Impl3043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Formula__Group__3__Impl_in_rule__Formula__Group__33073 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Formula__Group__4_in_rule__Formula__Group__33076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Formula__Group__3__Impl3104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Formula__Group__4__Impl_in_rule__Formula__Group__43135 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Formula__Group__5_in_rule__Formula__Group__43138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Formula__ExprAssignment_4_in_rule__Formula__Group__4__Impl3165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Formula__Group__5__Impl_in_rule__Formula__Group__53195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Formula__Group__5__Impl3223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__0__Impl_in_rule__Addition__Group__03266 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__1_in_rule__Addition__Group__03269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_rule__Addition__Group__0__Impl3296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__1__Impl_in_rule__Addition__Group__13325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__0_in_rule__Addition__Group__1__Impl3352 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__0__Impl_in_rule__Addition__Group_1__03387 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__1_in_rule__Addition__Group_1__03390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__1__Impl_in_rule__Addition__Group_1__13448 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__2_in_rule__Addition__Group_1__13451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Addition__Group_1__1__Impl3479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__2__Impl_in_rule__Addition__Group_1__23510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__RightAssignment_1_2_in_rule__Addition__Group_1__2__Impl3537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__0__Impl_in_rule__Multiplication__Group__03573 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__1_in_rule__Multiplication__Group__03576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePostfixOperators_in_rule__Multiplication__Group__0__Impl3603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__1__Impl_in_rule__Multiplication__Group__13632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__0_in_rule__Multiplication__Group__1__Impl3659 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__0__Impl_in_rule__Multiplication__Group_1__03694 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__1_in_rule__Multiplication__Group_1__03697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__1__Impl_in_rule__Multiplication__Group_1__13755 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__2_in_rule__Multiplication__Group_1__13758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Multiplication__Group_1__1__Impl3786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__2__Impl_in_rule__Multiplication__Group_1__23817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__RightAssignment_1_2_in_rule__Multiplication__Group_1__2__Impl3844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixOperators__Group__0__Impl_in_rule__PostfixOperators__Group__03880 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__PostfixOperators__Group__1_in_rule__PostfixOperators__Group__03883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_rule__PostfixOperators__Group__0__Impl3910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixOperators__Group__1__Impl_in_rule__PostfixOperators__Group__13939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixOperators__Group_1__0_in_rule__PostfixOperators__Group__1__Impl3966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixOperators__Group_1__0__Impl_in_rule__PostfixOperators__Group_1__04001 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__PostfixOperators__Group_1__1_in_rule__PostfixOperators__Group_1__04004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixOperators__Group_1__1__Impl_in_rule__PostfixOperators__Group_1__14062 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__PostfixOperators__Group_1__2_in_rule__PostfixOperators__Group_1__14065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__PostfixOperators__Group_1__1__Impl4093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixOperators__Group_1__2__Impl_in_rule__PostfixOperators__Group_1__24124 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__PostfixOperators__Group_1__3_in_rule__PostfixOperators__Group_1__24127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixOperators__IndexAssignment_1_2_in_rule__PostfixOperators__Group_1__2__Impl4154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixOperators__Group_1__3__Impl_in_rule__PostfixOperators__Group_1__34184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__PostfixOperators__Group_1__3__Impl4212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0__0__Impl_in_rule__Atomic__Group_0__04251 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0__1_in_rule__Atomic__Group_0__04254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0__1__Impl_in_rule__Atomic__Group_0__14312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__SymbolAssignment_0_1_in_rule__Atomic__Group_0__1__Impl4339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__0__Impl_in_rule__Atomic__Group_1__04373 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__1_in_rule__Atomic__Group_1__04376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__1__Impl_in_rule__Atomic__Group_1__14434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ValueAssignment_1_1_in_rule__Atomic__Group_1__1__Impl4461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QID__Group__0__Impl_in_rule__QID__Group__04495 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__QID__Group__1_in_rule__QID__Group__04498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QID__Group__0__Impl4525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QID__Group__1__Impl_in_rule__QID__Group__14554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QID__Group_1__0_in_rule__QID__Group__1__Impl4581 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__QID__Group_1__0__Impl_in_rule__QID__Group_1__04616 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QID__Group_1__1_in_rule__QID__Group_1__04619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__QID__Group_1__0__Impl4647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QID__Group_1__1__Impl_in_rule__QID__Group_1__14678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QID__Group_1__1__Impl4705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_rule__Model__ElementsAssignment4743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumDecl__NameAssignment_14774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumLiteral_in_rule__EnumDecl__LiteralsAssignment_34805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumLiteral__NameAssignment_14836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__VarDecl__TypeAssignment_24867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VarDecl__NameAssignment_34898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__ArrayType__BaseTypeAssignment_34929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumType__EnumRefAssignment4964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Formula__TypeAssignment_14999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Formula__NameAssignment_25030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Formula__ExprAssignment_45061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_rule__Addition__RightAssignment_1_25092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePostfixOperators_in_rule__Multiplication__RightAssignment_1_25123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__PostfixOperators__IndexAssignment_1_25154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQID_in_rule__Atomic__SymbolAssignment_0_15189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__Atomic__ValueAssignment_1_15224 = new BitSet(new long[]{0x0000000000000002L});

}