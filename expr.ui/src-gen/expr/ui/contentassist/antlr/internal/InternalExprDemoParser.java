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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:70:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:74:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:75:1: ( ( rule__Model__Group__0 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:75:1: ( ( rule__Model__Group__0 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:76:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:77:1: ( rule__Model__Group__0 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:77:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel94);
            rule__Model__Group__0();
            _fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

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
            pushFollow(FOLLOW_ruleElement_in_entryRuleElement121);
            ruleElement();
            _fsp--;

             after(grammarAccess.getElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElement128); 

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
            pushFollow(FOLLOW_rule__Element__Alternatives_in_ruleElement154);
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


    // $ANTLR start entryRuleAssert
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:117:1: entryRuleAssert : ruleAssert EOF ;
    public final void entryRuleAssert() throws RecognitionException {
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:118:1: ( ruleAssert EOF )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:119:1: ruleAssert EOF
            {
             before(grammarAccess.getAssertRule()); 
            pushFollow(FOLLOW_ruleAssert_in_entryRuleAssert181);
            ruleAssert();
            _fsp--;

             after(grammarAccess.getAssertRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssert188); 

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
    // $ANTLR end entryRuleAssert


    // $ANTLR start ruleAssert
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:126:1: ruleAssert : ( ( rule__Assert__Group__0 ) ) ;
    public final void ruleAssert() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:130:2: ( ( ( rule__Assert__Group__0 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:131:1: ( ( rule__Assert__Group__0 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:131:1: ( ( rule__Assert__Group__0 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:132:1: ( rule__Assert__Group__0 )
            {
             before(grammarAccess.getAssertAccess().getGroup()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:133:1: ( rule__Assert__Group__0 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:133:2: rule__Assert__Group__0
            {
            pushFollow(FOLLOW_rule__Assert__Group__0_in_ruleAssert214);
            rule__Assert__Group__0();
            _fsp--;


            }

             after(grammarAccess.getAssertAccess().getGroup()); 

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
    // $ANTLR end ruleAssert


    // $ANTLR start entryRuleEnumDecl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:145:1: entryRuleEnumDecl : ruleEnumDecl EOF ;
    public final void entryRuleEnumDecl() throws RecognitionException {
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:146:1: ( ruleEnumDecl EOF )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:147:1: ruleEnumDecl EOF
            {
             before(grammarAccess.getEnumDeclRule()); 
            pushFollow(FOLLOW_ruleEnumDecl_in_entryRuleEnumDecl241);
            ruleEnumDecl();
            _fsp--;

             after(grammarAccess.getEnumDeclRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumDecl248); 

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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:154:1: ruleEnumDecl : ( ( rule__EnumDecl__Group__0 ) ) ;
    public final void ruleEnumDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:158:2: ( ( ( rule__EnumDecl__Group__0 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:159:1: ( ( rule__EnumDecl__Group__0 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:159:1: ( ( rule__EnumDecl__Group__0 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:160:1: ( rule__EnumDecl__Group__0 )
            {
             before(grammarAccess.getEnumDeclAccess().getGroup()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:161:1: ( rule__EnumDecl__Group__0 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:161:2: rule__EnumDecl__Group__0
            {
            pushFollow(FOLLOW_rule__EnumDecl__Group__0_in_ruleEnumDecl274);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:173:1: entryRuleEnumLiteral : ruleEnumLiteral EOF ;
    public final void entryRuleEnumLiteral() throws RecognitionException {
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:174:1: ( ruleEnumLiteral EOF )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:175:1: ruleEnumLiteral EOF
            {
             before(grammarAccess.getEnumLiteralRule()); 
            pushFollow(FOLLOW_ruleEnumLiteral_in_entryRuleEnumLiteral301);
            ruleEnumLiteral();
            _fsp--;

             after(grammarAccess.getEnumLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumLiteral308); 

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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:182:1: ruleEnumLiteral : ( ( rule__EnumLiteral__Group__0 ) ) ;
    public final void ruleEnumLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:186:2: ( ( ( rule__EnumLiteral__Group__0 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:187:1: ( ( rule__EnumLiteral__Group__0 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:187:1: ( ( rule__EnumLiteral__Group__0 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:188:1: ( rule__EnumLiteral__Group__0 )
            {
             before(grammarAccess.getEnumLiteralAccess().getGroup()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:189:1: ( rule__EnumLiteral__Group__0 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:189:2: rule__EnumLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__EnumLiteral__Group__0_in_ruleEnumLiteral334);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:201:1: entryRuleVarDecl : ruleVarDecl EOF ;
    public final void entryRuleVarDecl() throws RecognitionException {
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:202:1: ( ruleVarDecl EOF )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:203:1: ruleVarDecl EOF
            {
             before(grammarAccess.getVarDeclRule()); 
            pushFollow(FOLLOW_ruleVarDecl_in_entryRuleVarDecl361);
            ruleVarDecl();
            _fsp--;

             after(grammarAccess.getVarDeclRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarDecl368); 

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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:210:1: ruleVarDecl : ( ( rule__VarDecl__Group__0 ) ) ;
    public final void ruleVarDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:214:2: ( ( ( rule__VarDecl__Group__0 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:215:1: ( ( rule__VarDecl__Group__0 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:215:1: ( ( rule__VarDecl__Group__0 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:216:1: ( rule__VarDecl__Group__0 )
            {
             before(grammarAccess.getVarDeclAccess().getGroup()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:217:1: ( rule__VarDecl__Group__0 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:217:2: rule__VarDecl__Group__0
            {
            pushFollow(FOLLOW_rule__VarDecl__Group__0_in_ruleVarDecl394);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:229:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:230:1: ( ruleType EOF )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:231:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType421);
            ruleType();
            _fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType428); 

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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:238:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:242:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:243:1: ( ( rule__Type__Alternatives ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:243:1: ( ( rule__Type__Alternatives ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:244:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:245:1: ( rule__Type__Alternatives )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:245:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType454);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:257:1: entryRulePrimitiveType : rulePrimitiveType EOF ;
    public final void entryRulePrimitiveType() throws RecognitionException {
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:258:1: ( rulePrimitiveType EOF )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:259:1: rulePrimitiveType EOF
            {
             before(grammarAccess.getPrimitiveTypeRule()); 
            pushFollow(FOLLOW_rulePrimitiveType_in_entryRulePrimitiveType481);
            rulePrimitiveType();
            _fsp--;

             after(grammarAccess.getPrimitiveTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveType488); 

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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:266:1: rulePrimitiveType : ( ( rule__PrimitiveType__Alternatives ) ) ;
    public final void rulePrimitiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:270:2: ( ( ( rule__PrimitiveType__Alternatives ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:271:1: ( ( rule__PrimitiveType__Alternatives ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:271:1: ( ( rule__PrimitiveType__Alternatives ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:272:1: ( rule__PrimitiveType__Alternatives )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getAlternatives()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:273:1: ( rule__PrimitiveType__Alternatives )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:273:2: rule__PrimitiveType__Alternatives
            {
            pushFollow(FOLLOW_rule__PrimitiveType__Alternatives_in_rulePrimitiveType514);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:285:1: entryRuleArrayType : ruleArrayType EOF ;
    public final void entryRuleArrayType() throws RecognitionException {
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:286:1: ( ruleArrayType EOF )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:287:1: ruleArrayType EOF
            {
             before(grammarAccess.getArrayTypeRule()); 
            pushFollow(FOLLOW_ruleArrayType_in_entryRuleArrayType541);
            ruleArrayType();
            _fsp--;

             after(grammarAccess.getArrayTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayType548); 

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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:294:1: ruleArrayType : ( ( rule__ArrayType__Group__0 ) ) ;
    public final void ruleArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:298:2: ( ( ( rule__ArrayType__Group__0 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:299:1: ( ( rule__ArrayType__Group__0 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:299:1: ( ( rule__ArrayType__Group__0 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:300:1: ( rule__ArrayType__Group__0 )
            {
             before(grammarAccess.getArrayTypeAccess().getGroup()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:301:1: ( rule__ArrayType__Group__0 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:301:2: rule__ArrayType__Group__0
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__0_in_ruleArrayType574);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:313:1: entryRuleEnumType : ruleEnumType EOF ;
    public final void entryRuleEnumType() throws RecognitionException {
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:314:1: ( ruleEnumType EOF )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:315:1: ruleEnumType EOF
            {
             before(grammarAccess.getEnumTypeRule()); 
            pushFollow(FOLLOW_ruleEnumType_in_entryRuleEnumType601);
            ruleEnumType();
            _fsp--;

             after(grammarAccess.getEnumTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumType608); 

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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:322:1: ruleEnumType : ( ( rule__EnumType__EnumRefAssignment ) ) ;
    public final void ruleEnumType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:326:2: ( ( ( rule__EnumType__EnumRefAssignment ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:327:1: ( ( rule__EnumType__EnumRefAssignment ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:327:1: ( ( rule__EnumType__EnumRefAssignment ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:328:1: ( rule__EnumType__EnumRefAssignment )
            {
             before(grammarAccess.getEnumTypeAccess().getEnumRefAssignment()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:329:1: ( rule__EnumType__EnumRefAssignment )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:329:2: rule__EnumType__EnumRefAssignment
            {
            pushFollow(FOLLOW_rule__EnumType__EnumRefAssignment_in_ruleEnumType634);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:341:1: entryRuleIntType : ruleIntType EOF ;
    public final void entryRuleIntType() throws RecognitionException {
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:342:1: ( ruleIntType EOF )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:343:1: ruleIntType EOF
            {
             before(grammarAccess.getIntTypeRule()); 
            pushFollow(FOLLOW_ruleIntType_in_entryRuleIntType661);
            ruleIntType();
            _fsp--;

             after(grammarAccess.getIntTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntType668); 

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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:350:1: ruleIntType : ( ( rule__IntType__Group__0 ) ) ;
    public final void ruleIntType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:354:2: ( ( ( rule__IntType__Group__0 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:355:1: ( ( rule__IntType__Group__0 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:355:1: ( ( rule__IntType__Group__0 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:356:1: ( rule__IntType__Group__0 )
            {
             before(grammarAccess.getIntTypeAccess().getGroup()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:357:1: ( rule__IntType__Group__0 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:357:2: rule__IntType__Group__0
            {
            pushFollow(FOLLOW_rule__IntType__Group__0_in_ruleIntType694);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:369:1: entryRuleBoolType : ruleBoolType EOF ;
    public final void entryRuleBoolType() throws RecognitionException {
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:370:1: ( ruleBoolType EOF )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:371:1: ruleBoolType EOF
            {
             before(grammarAccess.getBoolTypeRule()); 
            pushFollow(FOLLOW_ruleBoolType_in_entryRuleBoolType721);
            ruleBoolType();
            _fsp--;

             after(grammarAccess.getBoolTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolType728); 

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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:378:1: ruleBoolType : ( ( rule__BoolType__Group__0 ) ) ;
    public final void ruleBoolType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:382:2: ( ( ( rule__BoolType__Group__0 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:383:1: ( ( rule__BoolType__Group__0 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:383:1: ( ( rule__BoolType__Group__0 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:384:1: ( rule__BoolType__Group__0 )
            {
             before(grammarAccess.getBoolTypeAccess().getGroup()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:385:1: ( rule__BoolType__Group__0 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:385:2: rule__BoolType__Group__0
            {
            pushFollow(FOLLOW_rule__BoolType__Group__0_in_ruleBoolType754);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:397:1: entryRuleFloatType : ruleFloatType EOF ;
    public final void entryRuleFloatType() throws RecognitionException {
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:398:1: ( ruleFloatType EOF )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:399:1: ruleFloatType EOF
            {
             before(grammarAccess.getFloatTypeRule()); 
            pushFollow(FOLLOW_ruleFloatType_in_entryRuleFloatType781);
            ruleFloatType();
            _fsp--;

             after(grammarAccess.getFloatTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatType788); 

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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:406:1: ruleFloatType : ( ( rule__FloatType__Group__0 ) ) ;
    public final void ruleFloatType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:410:2: ( ( ( rule__FloatType__Group__0 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:411:1: ( ( rule__FloatType__Group__0 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:411:1: ( ( rule__FloatType__Group__0 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:412:1: ( rule__FloatType__Group__0 )
            {
             before(grammarAccess.getFloatTypeAccess().getGroup()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:413:1: ( rule__FloatType__Group__0 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:413:2: rule__FloatType__Group__0
            {
            pushFollow(FOLLOW_rule__FloatType__Group__0_in_ruleFloatType814);
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


    // $ANTLR start entryRuleStringType
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:425:1: entryRuleStringType : ruleStringType EOF ;
    public final void entryRuleStringType() throws RecognitionException {
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:426:1: ( ruleStringType EOF )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:427:1: ruleStringType EOF
            {
             before(grammarAccess.getStringTypeRule()); 
            pushFollow(FOLLOW_ruleStringType_in_entryRuleStringType841);
            ruleStringType();
            _fsp--;

             after(grammarAccess.getStringTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringType848); 

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
    // $ANTLR end entryRuleStringType


    // $ANTLR start ruleStringType
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:434:1: ruleStringType : ( ( rule__StringType__Group__0 ) ) ;
    public final void ruleStringType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:438:2: ( ( ( rule__StringType__Group__0 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:439:1: ( ( rule__StringType__Group__0 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:439:1: ( ( rule__StringType__Group__0 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:440:1: ( rule__StringType__Group__0 )
            {
             before(grammarAccess.getStringTypeAccess().getGroup()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:441:1: ( rule__StringType__Group__0 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:441:2: rule__StringType__Group__0
            {
            pushFollow(FOLLOW_rule__StringType__Group__0_in_ruleStringType874);
            rule__StringType__Group__0();
            _fsp--;


            }

             after(grammarAccess.getStringTypeAccess().getGroup()); 

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
    // $ANTLR end ruleStringType


    // $ANTLR start entryRuleFormula
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:453:1: entryRuleFormula : ruleFormula EOF ;
    public final void entryRuleFormula() throws RecognitionException {
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:454:1: ( ruleFormula EOF )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:455:1: ruleFormula EOF
            {
             before(grammarAccess.getFormulaRule()); 
            pushFollow(FOLLOW_ruleFormula_in_entryRuleFormula901);
            ruleFormula();
            _fsp--;

             after(grammarAccess.getFormulaRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormula908); 

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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:462:1: ruleFormula : ( ( rule__Formula__Group__0 ) ) ;
    public final void ruleFormula() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:466:2: ( ( ( rule__Formula__Group__0 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:467:1: ( ( rule__Formula__Group__0 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:467:1: ( ( rule__Formula__Group__0 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:468:1: ( rule__Formula__Group__0 )
            {
             before(grammarAccess.getFormulaAccess().getGroup()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:469:1: ( rule__Formula__Group__0 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:469:2: rule__Formula__Group__0
            {
            pushFollow(FOLLOW_rule__Formula__Group__0_in_ruleFormula934);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:481:1: entryRuleExpr : ruleExpr EOF ;
    public final void entryRuleExpr() throws RecognitionException {
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:482:1: ( ruleExpr EOF )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:483:1: ruleExpr EOF
            {
             before(grammarAccess.getExprRule()); 
            pushFollow(FOLLOW_ruleExpr_in_entryRuleExpr961);
            ruleExpr();
            _fsp--;

             after(grammarAccess.getExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpr968); 

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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:490:1: ruleExpr : ( ruleComparison ) ;
    public final void ruleExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:494:2: ( ( ruleComparison ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:495:1: ( ruleComparison )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:495:1: ( ruleComparison )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:496:1: ruleComparison
            {
             before(grammarAccess.getExprAccess().getComparisonParserRuleCall()); 
            pushFollow(FOLLOW_ruleComparison_in_ruleExpr994);
            ruleComparison();
            _fsp--;

             after(grammarAccess.getExprAccess().getComparisonParserRuleCall()); 

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


    // $ANTLR start entryRuleComparison
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:509:1: entryRuleComparison : ruleComparison EOF ;
    public final void entryRuleComparison() throws RecognitionException {
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:510:1: ( ruleComparison EOF )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:511:1: ruleComparison EOF
            {
             before(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_ruleComparison_in_entryRuleComparison1020);
            ruleComparison();
            _fsp--;

             after(grammarAccess.getComparisonRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparison1027); 

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
    // $ANTLR end entryRuleComparison


    // $ANTLR start ruleComparison
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:518:1: ruleComparison : ( ( rule__Comparison__Group__0 ) ) ;
    public final void ruleComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:522:2: ( ( ( rule__Comparison__Group__0 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:523:1: ( ( rule__Comparison__Group__0 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:523:1: ( ( rule__Comparison__Group__0 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:524:1: ( rule__Comparison__Group__0 )
            {
             before(grammarAccess.getComparisonAccess().getGroup()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:525:1: ( rule__Comparison__Group__0 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:525:2: rule__Comparison__Group__0
            {
            pushFollow(FOLLOW_rule__Comparison__Group__0_in_ruleComparison1053);
            rule__Comparison__Group__0();
            _fsp--;


            }

             after(grammarAccess.getComparisonAccess().getGroup()); 

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
    // $ANTLR end ruleComparison


    // $ANTLR start entryRuleAddition
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:537:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:538:1: ( ruleAddition EOF )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:539:1: ruleAddition EOF
            {
             before(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_ruleAddition_in_entryRuleAddition1080);
            ruleAddition();
            _fsp--;

             after(grammarAccess.getAdditionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddition1087); 

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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:546:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:550:2: ( ( ( rule__Addition__Group__0 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:551:1: ( ( rule__Addition__Group__0 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:551:1: ( ( rule__Addition__Group__0 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:552:1: ( rule__Addition__Group__0 )
            {
             before(grammarAccess.getAdditionAccess().getGroup()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:553:1: ( rule__Addition__Group__0 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:553:2: rule__Addition__Group__0
            {
            pushFollow(FOLLOW_rule__Addition__Group__0_in_ruleAddition1113);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:565:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:566:1: ( ruleMultiplication EOF )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:567:1: ruleMultiplication EOF
            {
             before(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_ruleMultiplication_in_entryRuleMultiplication1140);
            ruleMultiplication();
            _fsp--;

             after(grammarAccess.getMultiplicationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplication1147); 

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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:574:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:578:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:579:1: ( ( rule__Multiplication__Group__0 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:579:1: ( ( rule__Multiplication__Group__0 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:580:1: ( rule__Multiplication__Group__0 )
            {
             before(grammarAccess.getMultiplicationAccess().getGroup()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:581:1: ( rule__Multiplication__Group__0 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:581:2: rule__Multiplication__Group__0
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__0_in_ruleMultiplication1173);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:593:1: entryRulePostfixOperators : rulePostfixOperators EOF ;
    public final void entryRulePostfixOperators() throws RecognitionException {
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:594:1: ( rulePostfixOperators EOF )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:595:1: rulePostfixOperators EOF
            {
             before(grammarAccess.getPostfixOperatorsRule()); 
            pushFollow(FOLLOW_rulePostfixOperators_in_entryRulePostfixOperators1200);
            rulePostfixOperators();
            _fsp--;

             after(grammarAccess.getPostfixOperatorsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePostfixOperators1207); 

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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:602:1: rulePostfixOperators : ( ( rule__PostfixOperators__Group__0 ) ) ;
    public final void rulePostfixOperators() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:606:2: ( ( ( rule__PostfixOperators__Group__0 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:607:1: ( ( rule__PostfixOperators__Group__0 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:607:1: ( ( rule__PostfixOperators__Group__0 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:608:1: ( rule__PostfixOperators__Group__0 )
            {
             before(grammarAccess.getPostfixOperatorsAccess().getGroup()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:609:1: ( rule__PostfixOperators__Group__0 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:609:2: rule__PostfixOperators__Group__0
            {
            pushFollow(FOLLOW_rule__PostfixOperators__Group__0_in_rulePostfixOperators1233);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:621:1: entryRuleAtomic : ruleAtomic EOF ;
    public final void entryRuleAtomic() throws RecognitionException {
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:622:1: ( ruleAtomic EOF )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:623:1: ruleAtomic EOF
            {
             before(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_ruleAtomic_in_entryRuleAtomic1260);
            ruleAtomic();
            _fsp--;

             after(grammarAccess.getAtomicRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomic1267); 

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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:630:1: ruleAtomic : ( ( rule__Atomic__Alternatives ) ) ;
    public final void ruleAtomic() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:634:2: ( ( ( rule__Atomic__Alternatives ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:635:1: ( ( rule__Atomic__Alternatives ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:635:1: ( ( rule__Atomic__Alternatives ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:636:1: ( rule__Atomic__Alternatives )
            {
             before(grammarAccess.getAtomicAccess().getAlternatives()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:637:1: ( rule__Atomic__Alternatives )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:637:2: rule__Atomic__Alternatives
            {
            pushFollow(FOLLOW_rule__Atomic__Alternatives_in_ruleAtomic1293);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:649:1: entryRuleQID : ruleQID EOF ;
    public final void entryRuleQID() throws RecognitionException {
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:650:1: ( ruleQID EOF )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:651:1: ruleQID EOF
            {
             before(grammarAccess.getQIDRule()); 
            pushFollow(FOLLOW_ruleQID_in_entryRuleQID1320);
            ruleQID();
            _fsp--;

             after(grammarAccess.getQIDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQID1327); 

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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:658:1: ruleQID : ( ( rule__QID__Group__0 ) ) ;
    public final void ruleQID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:662:2: ( ( ( rule__QID__Group__0 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:663:1: ( ( rule__QID__Group__0 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:663:1: ( ( rule__QID__Group__0 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:664:1: ( rule__QID__Group__0 )
            {
             before(grammarAccess.getQIDAccess().getGroup()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:665:1: ( rule__QID__Group__0 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:665:2: rule__QID__Group__0
            {
            pushFollow(FOLLOW_rule__QID__Group__0_in_ruleQID1353);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:677:1: rule__Element__Alternatives : ( ( ruleVarDecl ) | ( ruleFormula ) | ( ruleEnumDecl ) | ( ruleAssert ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:681:1: ( ( ruleVarDecl ) | ( ruleFormula ) | ( ruleEnumDecl ) | ( ruleAssert ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt1=1;
                }
                break;
            case 27:
                {
                alt1=2;
                }
                break;
            case 15:
                {
                alt1=3;
                }
                break;
            case 13:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("677:1: rule__Element__Alternatives : ( ( ruleVarDecl ) | ( ruleFormula ) | ( ruleEnumDecl ) | ( ruleAssert ) );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:682:1: ( ruleVarDecl )
                    {
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:682:1: ( ruleVarDecl )
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:683:1: ruleVarDecl
                    {
                     before(grammarAccess.getElementAccess().getVarDeclParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleVarDecl_in_rule__Element__Alternatives1389);
                    ruleVarDecl();
                    _fsp--;

                     after(grammarAccess.getElementAccess().getVarDeclParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:688:6: ( ruleFormula )
                    {
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:688:6: ( ruleFormula )
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:689:1: ruleFormula
                    {
                     before(grammarAccess.getElementAccess().getFormulaParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleFormula_in_rule__Element__Alternatives1406);
                    ruleFormula();
                    _fsp--;

                     after(grammarAccess.getElementAccess().getFormulaParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:694:6: ( ruleEnumDecl )
                    {
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:694:6: ( ruleEnumDecl )
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:695:1: ruleEnumDecl
                    {
                     before(grammarAccess.getElementAccess().getEnumDeclParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleEnumDecl_in_rule__Element__Alternatives1423);
                    ruleEnumDecl();
                    _fsp--;

                     after(grammarAccess.getElementAccess().getEnumDeclParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:700:6: ( ruleAssert )
                    {
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:700:6: ( ruleAssert )
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:701:1: ruleAssert
                    {
                     before(grammarAccess.getElementAccess().getAssertParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleAssert_in_rule__Element__Alternatives1440);
                    ruleAssert();
                    _fsp--;

                     after(grammarAccess.getElementAccess().getAssertParserRuleCall_3()); 

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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:711:1: rule__Type__Alternatives : ( ( rulePrimitiveType ) | ( ruleArrayType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:715:1: ( ( rulePrimitiveType ) | ( ruleArrayType ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID||(LA2_0>=23 && LA2_0<=26)) ) {
                alt2=1;
            }
            else if ( (LA2_0==20) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("711:1: rule__Type__Alternatives : ( ( rulePrimitiveType ) | ( ruleArrayType ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:716:1: ( rulePrimitiveType )
                    {
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:716:1: ( rulePrimitiveType )
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:717:1: rulePrimitiveType
                    {
                     before(grammarAccess.getTypeAccess().getPrimitiveTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulePrimitiveType_in_rule__Type__Alternatives1472);
                    rulePrimitiveType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getPrimitiveTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:722:6: ( ruleArrayType )
                    {
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:722:6: ( ruleArrayType )
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:723:1: ruleArrayType
                    {
                     before(grammarAccess.getTypeAccess().getArrayTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleArrayType_in_rule__Type__Alternatives1489);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:733:1: rule__PrimitiveType__Alternatives : ( ( ruleIntType ) | ( ruleBoolType ) | ( ruleFloatType ) | ( ruleEnumType ) | ( ruleStringType ) );
    public final void rule__PrimitiveType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:737:1: ( ( ruleIntType ) | ( ruleBoolType ) | ( ruleFloatType ) | ( ruleEnumType ) | ( ruleStringType ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt3=1;
                }
                break;
            case 24:
                {
                alt3=2;
                }
                break;
            case 25:
                {
                alt3=3;
                }
                break;
            case RULE_ID:
                {
                alt3=4;
                }
                break;
            case 26:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("733:1: rule__PrimitiveType__Alternatives : ( ( ruleIntType ) | ( ruleBoolType ) | ( ruleFloatType ) | ( ruleEnumType ) | ( ruleStringType ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:738:1: ( ruleIntType )
                    {
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:738:1: ( ruleIntType )
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:739:1: ruleIntType
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getIntTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleIntType_in_rule__PrimitiveType__Alternatives1521);
                    ruleIntType();
                    _fsp--;

                     after(grammarAccess.getPrimitiveTypeAccess().getIntTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:744:6: ( ruleBoolType )
                    {
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:744:6: ( ruleBoolType )
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:745:1: ruleBoolType
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getBoolTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleBoolType_in_rule__PrimitiveType__Alternatives1538);
                    ruleBoolType();
                    _fsp--;

                     after(grammarAccess.getPrimitiveTypeAccess().getBoolTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:750:6: ( ruleFloatType )
                    {
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:750:6: ( ruleFloatType )
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:751:1: ruleFloatType
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getFloatTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleFloatType_in_rule__PrimitiveType__Alternatives1555);
                    ruleFloatType();
                    _fsp--;

                     after(grammarAccess.getPrimitiveTypeAccess().getFloatTypeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:756:6: ( ruleEnumType )
                    {
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:756:6: ( ruleEnumType )
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:757:1: ruleEnumType
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getEnumTypeParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleEnumType_in_rule__PrimitiveType__Alternatives1572);
                    ruleEnumType();
                    _fsp--;

                     after(grammarAccess.getPrimitiveTypeAccess().getEnumTypeParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:762:6: ( ruleStringType )
                    {
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:762:6: ( ruleStringType )
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:763:1: ruleStringType
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getStringTypeParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleStringType_in_rule__PrimitiveType__Alternatives1589);
                    ruleStringType();
                    _fsp--;

                     after(grammarAccess.getPrimitiveTypeAccess().getStringTypeParserRuleCall_4()); 

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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:773:1: rule__Atomic__Alternatives : ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) );
    public final void rule__Atomic__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:777:1: ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt4=1;
                }
                break;
            case RULE_NUMBER:
                {
                alt4=2;
                }
                break;
            case RULE_STRING:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("773:1: rule__Atomic__Alternatives : ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:778:1: ( ( rule__Atomic__Group_0__0 ) )
                    {
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:778:1: ( ( rule__Atomic__Group_0__0 ) )
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:779:1: ( rule__Atomic__Group_0__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_0()); 
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:780:1: ( rule__Atomic__Group_0__0 )
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:780:2: rule__Atomic__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_0__0_in_rule__Atomic__Alternatives1621);
                    rule__Atomic__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:784:6: ( ( rule__Atomic__Group_1__0 ) )
                    {
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:784:6: ( ( rule__Atomic__Group_1__0 ) )
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:785:1: ( rule__Atomic__Group_1__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_1()); 
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:786:1: ( rule__Atomic__Group_1__0 )
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:786:2: rule__Atomic__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_1__0_in_rule__Atomic__Alternatives1639);
                    rule__Atomic__Group_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:790:6: ( ( rule__Atomic__Group_2__0 ) )
                    {
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:790:6: ( ( rule__Atomic__Group_2__0 ) )
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:791:1: ( rule__Atomic__Group_2__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_2()); 
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:792:1: ( rule__Atomic__Group_2__0 )
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:792:2: rule__Atomic__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_2__0_in_rule__Atomic__Alternatives1657);
                    rule__Atomic__Group_2__0();
                    _fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_2()); 

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


    // $ANTLR start rule__Model__Group__0
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:803:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:807:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:808:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01688);
            rule__Model__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01691);
            rule__Model__Group__1();
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
    // $ANTLR end rule__Model__Group__0


    // $ANTLR start rule__Model__Group__0__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:815:1: rule__Model__Group__0__Impl : ( 'model' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:819:1: ( ( 'model' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:820:1: ( 'model' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:820:1: ( 'model' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:821:1: 'model'
            {
             before(grammarAccess.getModelAccess().getModelKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__Model__Group__0__Impl1719); 
             after(grammarAccess.getModelAccess().getModelKeyword_0()); 

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
    // $ANTLR end rule__Model__Group__0__Impl


    // $ANTLR start rule__Model__Group__1
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:834:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:838:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:839:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11750);
            rule__Model__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11753);
            rule__Model__Group__2();
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
    // $ANTLR end rule__Model__Group__1


    // $ANTLR start rule__Model__Group__1__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:846:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:850:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:851:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:851:1: ( ( rule__Model__NameAssignment_1 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:852:1: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:853:1: ( rule__Model__NameAssignment_1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:853:2: rule__Model__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__1__Impl1780);
            rule__Model__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getModelAccess().getNameAssignment_1()); 

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
    // $ANTLR end rule__Model__Group__1__Impl


    // $ANTLR start rule__Model__Group__2
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:863:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:867:1: ( rule__Model__Group__2__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:868:2: rule__Model__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21810);
            rule__Model__Group__2__Impl();
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
    // $ANTLR end rule__Model__Group__2


    // $ANTLR start rule__Model__Group__2__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:874:1: rule__Model__Group__2__Impl : ( ( rule__Model__ElementsAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:878:1: ( ( ( rule__Model__ElementsAssignment_2 )* ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:879:1: ( ( rule__Model__ElementsAssignment_2 )* )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:879:1: ( ( rule__Model__ElementsAssignment_2 )* )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:880:1: ( rule__Model__ElementsAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_2()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:881:1: ( rule__Model__ElementsAssignment_2 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==13||LA5_0==15||LA5_0==18||LA5_0==27) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:881:2: rule__Model__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Model__ElementsAssignment_2_in_rule__Model__Group__2__Impl1837);
            	    rule__Model__ElementsAssignment_2();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getElementsAssignment_2()); 

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
    // $ANTLR end rule__Model__Group__2__Impl


    // $ANTLR start rule__Assert__Group__0
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:897:1: rule__Assert__Group__0 : rule__Assert__Group__0__Impl rule__Assert__Group__1 ;
    public final void rule__Assert__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:901:1: ( rule__Assert__Group__0__Impl rule__Assert__Group__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:902:2: rule__Assert__Group__0__Impl rule__Assert__Group__1
            {
            pushFollow(FOLLOW_rule__Assert__Group__0__Impl_in_rule__Assert__Group__01874);
            rule__Assert__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Assert__Group__1_in_rule__Assert__Group__01877);
            rule__Assert__Group__1();
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
    // $ANTLR end rule__Assert__Group__0


    // $ANTLR start rule__Assert__Group__0__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:909:1: rule__Assert__Group__0__Impl : ( 'assert' ) ;
    public final void rule__Assert__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:913:1: ( ( 'assert' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:914:1: ( 'assert' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:914:1: ( 'assert' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:915:1: 'assert'
            {
             before(grammarAccess.getAssertAccess().getAssertKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__Assert__Group__0__Impl1905); 
             after(grammarAccess.getAssertAccess().getAssertKeyword_0()); 

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
    // $ANTLR end rule__Assert__Group__0__Impl


    // $ANTLR start rule__Assert__Group__1
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:928:1: rule__Assert__Group__1 : rule__Assert__Group__1__Impl rule__Assert__Group__2 ;
    public final void rule__Assert__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:932:1: ( rule__Assert__Group__1__Impl rule__Assert__Group__2 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:933:2: rule__Assert__Group__1__Impl rule__Assert__Group__2
            {
            pushFollow(FOLLOW_rule__Assert__Group__1__Impl_in_rule__Assert__Group__11936);
            rule__Assert__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Assert__Group__2_in_rule__Assert__Group__11939);
            rule__Assert__Group__2();
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
    // $ANTLR end rule__Assert__Group__1


    // $ANTLR start rule__Assert__Group__1__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:940:1: rule__Assert__Group__1__Impl : ( ( rule__Assert__ExprAssignment_1 ) ) ;
    public final void rule__Assert__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:944:1: ( ( ( rule__Assert__ExprAssignment_1 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:945:1: ( ( rule__Assert__ExprAssignment_1 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:945:1: ( ( rule__Assert__ExprAssignment_1 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:946:1: ( rule__Assert__ExprAssignment_1 )
            {
             before(grammarAccess.getAssertAccess().getExprAssignment_1()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:947:1: ( rule__Assert__ExprAssignment_1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:947:2: rule__Assert__ExprAssignment_1
            {
            pushFollow(FOLLOW_rule__Assert__ExprAssignment_1_in_rule__Assert__Group__1__Impl1966);
            rule__Assert__ExprAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getAssertAccess().getExprAssignment_1()); 

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
    // $ANTLR end rule__Assert__Group__1__Impl


    // $ANTLR start rule__Assert__Group__2
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:957:1: rule__Assert__Group__2 : rule__Assert__Group__2__Impl ;
    public final void rule__Assert__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:961:1: ( rule__Assert__Group__2__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:962:2: rule__Assert__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Assert__Group__2__Impl_in_rule__Assert__Group__21996);
            rule__Assert__Group__2__Impl();
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
    // $ANTLR end rule__Assert__Group__2


    // $ANTLR start rule__Assert__Group__2__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:968:1: rule__Assert__Group__2__Impl : ( ';' ) ;
    public final void rule__Assert__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:972:1: ( ( ';' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:973:1: ( ';' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:973:1: ( ';' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:974:1: ';'
            {
             before(grammarAccess.getAssertAccess().getSemicolonKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__Assert__Group__2__Impl2024); 
             after(grammarAccess.getAssertAccess().getSemicolonKeyword_2()); 

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
    // $ANTLR end rule__Assert__Group__2__Impl


    // $ANTLR start rule__EnumDecl__Group__0
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:993:1: rule__EnumDecl__Group__0 : rule__EnumDecl__Group__0__Impl rule__EnumDecl__Group__1 ;
    public final void rule__EnumDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:997:1: ( rule__EnumDecl__Group__0__Impl rule__EnumDecl__Group__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:998:2: rule__EnumDecl__Group__0__Impl rule__EnumDecl__Group__1
            {
            pushFollow(FOLLOW_rule__EnumDecl__Group__0__Impl_in_rule__EnumDecl__Group__02061);
            rule__EnumDecl__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EnumDecl__Group__1_in_rule__EnumDecl__Group__02064);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1005:1: rule__EnumDecl__Group__0__Impl : ( 'enum' ) ;
    public final void rule__EnumDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1009:1: ( ( 'enum' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1010:1: ( 'enum' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1010:1: ( 'enum' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1011:1: 'enum'
            {
             before(grammarAccess.getEnumDeclAccess().getEnumKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__EnumDecl__Group__0__Impl2092); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1024:1: rule__EnumDecl__Group__1 : rule__EnumDecl__Group__1__Impl rule__EnumDecl__Group__2 ;
    public final void rule__EnumDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1028:1: ( rule__EnumDecl__Group__1__Impl rule__EnumDecl__Group__2 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1029:2: rule__EnumDecl__Group__1__Impl rule__EnumDecl__Group__2
            {
            pushFollow(FOLLOW_rule__EnumDecl__Group__1__Impl_in_rule__EnumDecl__Group__12123);
            rule__EnumDecl__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EnumDecl__Group__2_in_rule__EnumDecl__Group__12126);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1036:1: rule__EnumDecl__Group__1__Impl : ( ( rule__EnumDecl__NameAssignment_1 ) ) ;
    public final void rule__EnumDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1040:1: ( ( ( rule__EnumDecl__NameAssignment_1 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1041:1: ( ( rule__EnumDecl__NameAssignment_1 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1041:1: ( ( rule__EnumDecl__NameAssignment_1 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1042:1: ( rule__EnumDecl__NameAssignment_1 )
            {
             before(grammarAccess.getEnumDeclAccess().getNameAssignment_1()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1043:1: ( rule__EnumDecl__NameAssignment_1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1043:2: rule__EnumDecl__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__EnumDecl__NameAssignment_1_in_rule__EnumDecl__Group__1__Impl2153);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1053:1: rule__EnumDecl__Group__2 : rule__EnumDecl__Group__2__Impl rule__EnumDecl__Group__3 ;
    public final void rule__EnumDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1057:1: ( rule__EnumDecl__Group__2__Impl rule__EnumDecl__Group__3 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1058:2: rule__EnumDecl__Group__2__Impl rule__EnumDecl__Group__3
            {
            pushFollow(FOLLOW_rule__EnumDecl__Group__2__Impl_in_rule__EnumDecl__Group__22183);
            rule__EnumDecl__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EnumDecl__Group__3_in_rule__EnumDecl__Group__22186);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1065:1: rule__EnumDecl__Group__2__Impl : ( '{' ) ;
    public final void rule__EnumDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1069:1: ( ( '{' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1070:1: ( '{' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1070:1: ( '{' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1071:1: '{'
            {
             before(grammarAccess.getEnumDeclAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__EnumDecl__Group__2__Impl2214); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1084:1: rule__EnumDecl__Group__3 : rule__EnumDecl__Group__3__Impl rule__EnumDecl__Group__4 ;
    public final void rule__EnumDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1088:1: ( rule__EnumDecl__Group__3__Impl rule__EnumDecl__Group__4 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1089:2: rule__EnumDecl__Group__3__Impl rule__EnumDecl__Group__4
            {
            pushFollow(FOLLOW_rule__EnumDecl__Group__3__Impl_in_rule__EnumDecl__Group__32245);
            rule__EnumDecl__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EnumDecl__Group__4_in_rule__EnumDecl__Group__32248);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1096:1: rule__EnumDecl__Group__3__Impl : ( ( rule__EnumDecl__LiteralsAssignment_3 )* ) ;
    public final void rule__EnumDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1100:1: ( ( ( rule__EnumDecl__LiteralsAssignment_3 )* ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1101:1: ( ( rule__EnumDecl__LiteralsAssignment_3 )* )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1101:1: ( ( rule__EnumDecl__LiteralsAssignment_3 )* )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1102:1: ( rule__EnumDecl__LiteralsAssignment_3 )*
            {
             before(grammarAccess.getEnumDeclAccess().getLiteralsAssignment_3()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1103:1: ( rule__EnumDecl__LiteralsAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1103:2: rule__EnumDecl__LiteralsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__EnumDecl__LiteralsAssignment_3_in_rule__EnumDecl__Group__3__Impl2275);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1113:1: rule__EnumDecl__Group__4 : rule__EnumDecl__Group__4__Impl ;
    public final void rule__EnumDecl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1117:1: ( rule__EnumDecl__Group__4__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1118:2: rule__EnumDecl__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__EnumDecl__Group__4__Impl_in_rule__EnumDecl__Group__42306);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1124:1: rule__EnumDecl__Group__4__Impl : ( '}' ) ;
    public final void rule__EnumDecl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1128:1: ( ( '}' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1129:1: ( '}' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1129:1: ( '}' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1130:1: '}'
            {
             before(grammarAccess.getEnumDeclAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_17_in_rule__EnumDecl__Group__4__Impl2334); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1153:1: rule__EnumLiteral__Group__0 : rule__EnumLiteral__Group__0__Impl rule__EnumLiteral__Group__1 ;
    public final void rule__EnumLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1157:1: ( rule__EnumLiteral__Group__0__Impl rule__EnumLiteral__Group__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1158:2: rule__EnumLiteral__Group__0__Impl rule__EnumLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__EnumLiteral__Group__0__Impl_in_rule__EnumLiteral__Group__02375);
            rule__EnumLiteral__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EnumLiteral__Group__1_in_rule__EnumLiteral__Group__02378);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1165:1: rule__EnumLiteral__Group__0__Impl : ( () ) ;
    public final void rule__EnumLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1169:1: ( ( () ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1170:1: ( () )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1170:1: ( () )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1171:1: ()
            {
             before(grammarAccess.getEnumLiteralAccess().getEnumLiteralAction_0()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1172:1: ()
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1174:1: 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1184:1: rule__EnumLiteral__Group__1 : rule__EnumLiteral__Group__1__Impl ;
    public final void rule__EnumLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1188:1: ( rule__EnumLiteral__Group__1__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1189:2: rule__EnumLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumLiteral__Group__1__Impl_in_rule__EnumLiteral__Group__12436);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1195:1: rule__EnumLiteral__Group__1__Impl : ( ( rule__EnumLiteral__NameAssignment_1 ) ) ;
    public final void rule__EnumLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1199:1: ( ( ( rule__EnumLiteral__NameAssignment_1 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1200:1: ( ( rule__EnumLiteral__NameAssignment_1 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1200:1: ( ( rule__EnumLiteral__NameAssignment_1 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1201:1: ( rule__EnumLiteral__NameAssignment_1 )
            {
             before(grammarAccess.getEnumLiteralAccess().getNameAssignment_1()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1202:1: ( rule__EnumLiteral__NameAssignment_1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1202:2: rule__EnumLiteral__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__EnumLiteral__NameAssignment_1_in_rule__EnumLiteral__Group__1__Impl2463);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1216:1: rule__VarDecl__Group__0 : rule__VarDecl__Group__0__Impl rule__VarDecl__Group__1 ;
    public final void rule__VarDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1220:1: ( rule__VarDecl__Group__0__Impl rule__VarDecl__Group__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1221:2: rule__VarDecl__Group__0__Impl rule__VarDecl__Group__1
            {
            pushFollow(FOLLOW_rule__VarDecl__Group__0__Impl_in_rule__VarDecl__Group__02497);
            rule__VarDecl__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__VarDecl__Group__1_in_rule__VarDecl__Group__02500);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1228:1: rule__VarDecl__Group__0__Impl : ( () ) ;
    public final void rule__VarDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1232:1: ( ( () ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1233:1: ( () )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1233:1: ( () )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1234:1: ()
            {
             before(grammarAccess.getVarDeclAccess().getVarDeclAction_0()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1235:1: ()
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1237:1: 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1247:1: rule__VarDecl__Group__1 : rule__VarDecl__Group__1__Impl rule__VarDecl__Group__2 ;
    public final void rule__VarDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1251:1: ( rule__VarDecl__Group__1__Impl rule__VarDecl__Group__2 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1252:2: rule__VarDecl__Group__1__Impl rule__VarDecl__Group__2
            {
            pushFollow(FOLLOW_rule__VarDecl__Group__1__Impl_in_rule__VarDecl__Group__12558);
            rule__VarDecl__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__VarDecl__Group__2_in_rule__VarDecl__Group__12561);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1259:1: rule__VarDecl__Group__1__Impl : ( 'var' ) ;
    public final void rule__VarDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1263:1: ( ( 'var' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1264:1: ( 'var' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1264:1: ( 'var' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1265:1: 'var'
            {
             before(grammarAccess.getVarDeclAccess().getVarKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__VarDecl__Group__1__Impl2589); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1278:1: rule__VarDecl__Group__2 : rule__VarDecl__Group__2__Impl rule__VarDecl__Group__3 ;
    public final void rule__VarDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1282:1: ( rule__VarDecl__Group__2__Impl rule__VarDecl__Group__3 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1283:2: rule__VarDecl__Group__2__Impl rule__VarDecl__Group__3
            {
            pushFollow(FOLLOW_rule__VarDecl__Group__2__Impl_in_rule__VarDecl__Group__22620);
            rule__VarDecl__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__VarDecl__Group__3_in_rule__VarDecl__Group__22623);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1290:1: rule__VarDecl__Group__2__Impl : ( ( rule__VarDecl__TypeAssignment_2 ) ) ;
    public final void rule__VarDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1294:1: ( ( ( rule__VarDecl__TypeAssignment_2 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1295:1: ( ( rule__VarDecl__TypeAssignment_2 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1295:1: ( ( rule__VarDecl__TypeAssignment_2 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1296:1: ( rule__VarDecl__TypeAssignment_2 )
            {
             before(grammarAccess.getVarDeclAccess().getTypeAssignment_2()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1297:1: ( rule__VarDecl__TypeAssignment_2 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1297:2: rule__VarDecl__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__VarDecl__TypeAssignment_2_in_rule__VarDecl__Group__2__Impl2650);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1307:1: rule__VarDecl__Group__3 : rule__VarDecl__Group__3__Impl rule__VarDecl__Group__4 ;
    public final void rule__VarDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1311:1: ( rule__VarDecl__Group__3__Impl rule__VarDecl__Group__4 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1312:2: rule__VarDecl__Group__3__Impl rule__VarDecl__Group__4
            {
            pushFollow(FOLLOW_rule__VarDecl__Group__3__Impl_in_rule__VarDecl__Group__32680);
            rule__VarDecl__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__VarDecl__Group__4_in_rule__VarDecl__Group__32683);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1319:1: rule__VarDecl__Group__3__Impl : ( ( rule__VarDecl__NameAssignment_3 ) ) ;
    public final void rule__VarDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1323:1: ( ( ( rule__VarDecl__NameAssignment_3 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1324:1: ( ( rule__VarDecl__NameAssignment_3 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1324:1: ( ( rule__VarDecl__NameAssignment_3 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1325:1: ( rule__VarDecl__NameAssignment_3 )
            {
             before(grammarAccess.getVarDeclAccess().getNameAssignment_3()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1326:1: ( rule__VarDecl__NameAssignment_3 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1326:2: rule__VarDecl__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__VarDecl__NameAssignment_3_in_rule__VarDecl__Group__3__Impl2710);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1336:1: rule__VarDecl__Group__4 : rule__VarDecl__Group__4__Impl rule__VarDecl__Group__5 ;
    public final void rule__VarDecl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1340:1: ( rule__VarDecl__Group__4__Impl rule__VarDecl__Group__5 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1341:2: rule__VarDecl__Group__4__Impl rule__VarDecl__Group__5
            {
            pushFollow(FOLLOW_rule__VarDecl__Group__4__Impl_in_rule__VarDecl__Group__42740);
            rule__VarDecl__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__VarDecl__Group__5_in_rule__VarDecl__Group__42743);
            rule__VarDecl__Group__5();
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1348:1: rule__VarDecl__Group__4__Impl : ( ( rule__VarDecl__Group_4__0 )? ) ;
    public final void rule__VarDecl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1352:1: ( ( ( rule__VarDecl__Group_4__0 )? ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1353:1: ( ( rule__VarDecl__Group_4__0 )? )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1353:1: ( ( rule__VarDecl__Group_4__0 )? )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1354:1: ( rule__VarDecl__Group_4__0 )?
            {
             before(grammarAccess.getVarDeclAccess().getGroup_4()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1355:1: ( rule__VarDecl__Group_4__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1355:2: rule__VarDecl__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__VarDecl__Group_4__0_in_rule__VarDecl__Group__4__Impl2770);
                    rule__VarDecl__Group_4__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVarDeclAccess().getGroup_4()); 

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


    // $ANTLR start rule__VarDecl__Group__5
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1365:1: rule__VarDecl__Group__5 : rule__VarDecl__Group__5__Impl ;
    public final void rule__VarDecl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1369:1: ( rule__VarDecl__Group__5__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1370:2: rule__VarDecl__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__VarDecl__Group__5__Impl_in_rule__VarDecl__Group__52801);
            rule__VarDecl__Group__5__Impl();
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
    // $ANTLR end rule__VarDecl__Group__5


    // $ANTLR start rule__VarDecl__Group__5__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1376:1: rule__VarDecl__Group__5__Impl : ( ';' ) ;
    public final void rule__VarDecl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1380:1: ( ( ';' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1381:1: ( ';' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1381:1: ( ';' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1382:1: ';'
            {
             before(grammarAccess.getVarDeclAccess().getSemicolonKeyword_5()); 
            match(input,14,FOLLOW_14_in_rule__VarDecl__Group__5__Impl2829); 
             after(grammarAccess.getVarDeclAccess().getSemicolonKeyword_5()); 

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
    // $ANTLR end rule__VarDecl__Group__5__Impl


    // $ANTLR start rule__VarDecl__Group_4__0
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1407:1: rule__VarDecl__Group_4__0 : rule__VarDecl__Group_4__0__Impl rule__VarDecl__Group_4__1 ;
    public final void rule__VarDecl__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1411:1: ( rule__VarDecl__Group_4__0__Impl rule__VarDecl__Group_4__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1412:2: rule__VarDecl__Group_4__0__Impl rule__VarDecl__Group_4__1
            {
            pushFollow(FOLLOW_rule__VarDecl__Group_4__0__Impl_in_rule__VarDecl__Group_4__02872);
            rule__VarDecl__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__VarDecl__Group_4__1_in_rule__VarDecl__Group_4__02875);
            rule__VarDecl__Group_4__1();
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
    // $ANTLR end rule__VarDecl__Group_4__0


    // $ANTLR start rule__VarDecl__Group_4__0__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1419:1: rule__VarDecl__Group_4__0__Impl : ( '=' ) ;
    public final void rule__VarDecl__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1423:1: ( ( '=' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1424:1: ( '=' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1424:1: ( '=' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1425:1: '='
            {
             before(grammarAccess.getVarDeclAccess().getEqualsSignKeyword_4_0()); 
            match(input,19,FOLLOW_19_in_rule__VarDecl__Group_4__0__Impl2903); 
             after(grammarAccess.getVarDeclAccess().getEqualsSignKeyword_4_0()); 

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
    // $ANTLR end rule__VarDecl__Group_4__0__Impl


    // $ANTLR start rule__VarDecl__Group_4__1
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1438:1: rule__VarDecl__Group_4__1 : rule__VarDecl__Group_4__1__Impl ;
    public final void rule__VarDecl__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1442:1: ( rule__VarDecl__Group_4__1__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1443:2: rule__VarDecl__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__VarDecl__Group_4__1__Impl_in_rule__VarDecl__Group_4__12934);
            rule__VarDecl__Group_4__1__Impl();
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
    // $ANTLR end rule__VarDecl__Group_4__1


    // $ANTLR start rule__VarDecl__Group_4__1__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1449:1: rule__VarDecl__Group_4__1__Impl : ( ( rule__VarDecl__InitAssignment_4_1 ) ) ;
    public final void rule__VarDecl__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1453:1: ( ( ( rule__VarDecl__InitAssignment_4_1 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1454:1: ( ( rule__VarDecl__InitAssignment_4_1 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1454:1: ( ( rule__VarDecl__InitAssignment_4_1 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1455:1: ( rule__VarDecl__InitAssignment_4_1 )
            {
             before(grammarAccess.getVarDeclAccess().getInitAssignment_4_1()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1456:1: ( rule__VarDecl__InitAssignment_4_1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1456:2: rule__VarDecl__InitAssignment_4_1
            {
            pushFollow(FOLLOW_rule__VarDecl__InitAssignment_4_1_in_rule__VarDecl__Group_4__1__Impl2961);
            rule__VarDecl__InitAssignment_4_1();
            _fsp--;


            }

             after(grammarAccess.getVarDeclAccess().getInitAssignment_4_1()); 

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
    // $ANTLR end rule__VarDecl__Group_4__1__Impl


    // $ANTLR start rule__ArrayType__Group__0
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1470:1: rule__ArrayType__Group__0 : rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1 ;
    public final void rule__ArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1474:1: ( rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1475:2: rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__0__Impl_in_rule__ArrayType__Group__02995);
            rule__ArrayType__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group__1_in_rule__ArrayType__Group__02998);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1482:1: rule__ArrayType__Group__0__Impl : ( () ) ;
    public final void rule__ArrayType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1486:1: ( ( () ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1487:1: ( () )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1487:1: ( () )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1488:1: ()
            {
             before(grammarAccess.getArrayTypeAccess().getArrayTypeAction_0()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1489:1: ()
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1491:1: 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1501:1: rule__ArrayType__Group__1 : rule__ArrayType__Group__1__Impl rule__ArrayType__Group__2 ;
    public final void rule__ArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1505:1: ( rule__ArrayType__Group__1__Impl rule__ArrayType__Group__2 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1506:2: rule__ArrayType__Group__1__Impl rule__ArrayType__Group__2
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__1__Impl_in_rule__ArrayType__Group__13056);
            rule__ArrayType__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group__2_in_rule__ArrayType__Group__13059);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1513:1: rule__ArrayType__Group__1__Impl : ( 'array' ) ;
    public final void rule__ArrayType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1517:1: ( ( 'array' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1518:1: ( 'array' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1518:1: ( 'array' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1519:1: 'array'
            {
             before(grammarAccess.getArrayTypeAccess().getArrayKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__ArrayType__Group__1__Impl3087); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1532:1: rule__ArrayType__Group__2 : rule__ArrayType__Group__2__Impl rule__ArrayType__Group__3 ;
    public final void rule__ArrayType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1536:1: ( rule__ArrayType__Group__2__Impl rule__ArrayType__Group__3 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1537:2: rule__ArrayType__Group__2__Impl rule__ArrayType__Group__3
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__2__Impl_in_rule__ArrayType__Group__23118);
            rule__ArrayType__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group__3_in_rule__ArrayType__Group__23121);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1544:1: rule__ArrayType__Group__2__Impl : ( '[' ) ;
    public final void rule__ArrayType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1548:1: ( ( '[' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1549:1: ( '[' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1549:1: ( '[' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1550:1: '['
            {
             before(grammarAccess.getArrayTypeAccess().getLeftSquareBracketKeyword_2()); 
            match(input,21,FOLLOW_21_in_rule__ArrayType__Group__2__Impl3149); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1563:1: rule__ArrayType__Group__3 : rule__ArrayType__Group__3__Impl rule__ArrayType__Group__4 ;
    public final void rule__ArrayType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1567:1: ( rule__ArrayType__Group__3__Impl rule__ArrayType__Group__4 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1568:2: rule__ArrayType__Group__3__Impl rule__ArrayType__Group__4
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__3__Impl_in_rule__ArrayType__Group__33180);
            rule__ArrayType__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group__4_in_rule__ArrayType__Group__33183);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1575:1: rule__ArrayType__Group__3__Impl : ( ( rule__ArrayType__BaseTypeAssignment_3 ) ) ;
    public final void rule__ArrayType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1579:1: ( ( ( rule__ArrayType__BaseTypeAssignment_3 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1580:1: ( ( rule__ArrayType__BaseTypeAssignment_3 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1580:1: ( ( rule__ArrayType__BaseTypeAssignment_3 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1581:1: ( rule__ArrayType__BaseTypeAssignment_3 )
            {
             before(grammarAccess.getArrayTypeAccess().getBaseTypeAssignment_3()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1582:1: ( rule__ArrayType__BaseTypeAssignment_3 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1582:2: rule__ArrayType__BaseTypeAssignment_3
            {
            pushFollow(FOLLOW_rule__ArrayType__BaseTypeAssignment_3_in_rule__ArrayType__Group__3__Impl3210);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1592:1: rule__ArrayType__Group__4 : rule__ArrayType__Group__4__Impl ;
    public final void rule__ArrayType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1596:1: ( rule__ArrayType__Group__4__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1597:2: rule__ArrayType__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__4__Impl_in_rule__ArrayType__Group__43240);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1603:1: rule__ArrayType__Group__4__Impl : ( ']' ) ;
    public final void rule__ArrayType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1607:1: ( ( ']' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1608:1: ( ']' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1608:1: ( ']' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1609:1: ']'
            {
             before(grammarAccess.getArrayTypeAccess().getRightSquareBracketKeyword_4()); 
            match(input,22,FOLLOW_22_in_rule__ArrayType__Group__4__Impl3268); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1632:1: rule__IntType__Group__0 : rule__IntType__Group__0__Impl rule__IntType__Group__1 ;
    public final void rule__IntType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1636:1: ( rule__IntType__Group__0__Impl rule__IntType__Group__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1637:2: rule__IntType__Group__0__Impl rule__IntType__Group__1
            {
            pushFollow(FOLLOW_rule__IntType__Group__0__Impl_in_rule__IntType__Group__03309);
            rule__IntType__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__IntType__Group__1_in_rule__IntType__Group__03312);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1644:1: rule__IntType__Group__0__Impl : ( () ) ;
    public final void rule__IntType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1648:1: ( ( () ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1649:1: ( () )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1649:1: ( () )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1650:1: ()
            {
             before(grammarAccess.getIntTypeAccess().getIntTypeAction_0()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1651:1: ()
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1653:1: 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1663:1: rule__IntType__Group__1 : rule__IntType__Group__1__Impl ;
    public final void rule__IntType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1667:1: ( rule__IntType__Group__1__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1668:2: rule__IntType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__IntType__Group__1__Impl_in_rule__IntType__Group__13370);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1674:1: rule__IntType__Group__1__Impl : ( 'int' ) ;
    public final void rule__IntType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1678:1: ( ( 'int' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1679:1: ( 'int' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1679:1: ( 'int' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1680:1: 'int'
            {
             before(grammarAccess.getIntTypeAccess().getIntKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__IntType__Group__1__Impl3398); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1697:1: rule__BoolType__Group__0 : rule__BoolType__Group__0__Impl rule__BoolType__Group__1 ;
    public final void rule__BoolType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1701:1: ( rule__BoolType__Group__0__Impl rule__BoolType__Group__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1702:2: rule__BoolType__Group__0__Impl rule__BoolType__Group__1
            {
            pushFollow(FOLLOW_rule__BoolType__Group__0__Impl_in_rule__BoolType__Group__03433);
            rule__BoolType__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BoolType__Group__1_in_rule__BoolType__Group__03436);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1709:1: rule__BoolType__Group__0__Impl : ( () ) ;
    public final void rule__BoolType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1713:1: ( ( () ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1714:1: ( () )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1714:1: ( () )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1715:1: ()
            {
             before(grammarAccess.getBoolTypeAccess().getBoolTypeAction_0()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1716:1: ()
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1718:1: 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1728:1: rule__BoolType__Group__1 : rule__BoolType__Group__1__Impl ;
    public final void rule__BoolType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1732:1: ( rule__BoolType__Group__1__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1733:2: rule__BoolType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BoolType__Group__1__Impl_in_rule__BoolType__Group__13494);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1739:1: rule__BoolType__Group__1__Impl : ( 'bool' ) ;
    public final void rule__BoolType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1743:1: ( ( 'bool' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1744:1: ( 'bool' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1744:1: ( 'bool' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1745:1: 'bool'
            {
             before(grammarAccess.getBoolTypeAccess().getBoolKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__BoolType__Group__1__Impl3522); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1762:1: rule__FloatType__Group__0 : rule__FloatType__Group__0__Impl rule__FloatType__Group__1 ;
    public final void rule__FloatType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1766:1: ( rule__FloatType__Group__0__Impl rule__FloatType__Group__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1767:2: rule__FloatType__Group__0__Impl rule__FloatType__Group__1
            {
            pushFollow(FOLLOW_rule__FloatType__Group__0__Impl_in_rule__FloatType__Group__03557);
            rule__FloatType__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FloatType__Group__1_in_rule__FloatType__Group__03560);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1774:1: rule__FloatType__Group__0__Impl : ( () ) ;
    public final void rule__FloatType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1778:1: ( ( () ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1779:1: ( () )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1779:1: ( () )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1780:1: ()
            {
             before(grammarAccess.getFloatTypeAccess().getFloatTypeAction_0()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1781:1: ()
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1783:1: 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1793:1: rule__FloatType__Group__1 : rule__FloatType__Group__1__Impl ;
    public final void rule__FloatType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1797:1: ( rule__FloatType__Group__1__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1798:2: rule__FloatType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FloatType__Group__1__Impl_in_rule__FloatType__Group__13618);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1804:1: rule__FloatType__Group__1__Impl : ( 'float' ) ;
    public final void rule__FloatType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1808:1: ( ( 'float' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1809:1: ( 'float' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1809:1: ( 'float' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1810:1: 'float'
            {
             before(grammarAccess.getFloatTypeAccess().getFloatKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__FloatType__Group__1__Impl3646); 
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


    // $ANTLR start rule__StringType__Group__0
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1827:1: rule__StringType__Group__0 : rule__StringType__Group__0__Impl rule__StringType__Group__1 ;
    public final void rule__StringType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1831:1: ( rule__StringType__Group__0__Impl rule__StringType__Group__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1832:2: rule__StringType__Group__0__Impl rule__StringType__Group__1
            {
            pushFollow(FOLLOW_rule__StringType__Group__0__Impl_in_rule__StringType__Group__03681);
            rule__StringType__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringType__Group__1_in_rule__StringType__Group__03684);
            rule__StringType__Group__1();
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
    // $ANTLR end rule__StringType__Group__0


    // $ANTLR start rule__StringType__Group__0__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1839:1: rule__StringType__Group__0__Impl : ( () ) ;
    public final void rule__StringType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1843:1: ( ( () ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1844:1: ( () )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1844:1: ( () )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1845:1: ()
            {
             before(grammarAccess.getStringTypeAccess().getStringTypeAction_0()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1846:1: ()
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1848:1: 
            {
            }

             after(grammarAccess.getStringTypeAccess().getStringTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringType__Group__0__Impl


    // $ANTLR start rule__StringType__Group__1
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1858:1: rule__StringType__Group__1 : rule__StringType__Group__1__Impl ;
    public final void rule__StringType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1862:1: ( rule__StringType__Group__1__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1863:2: rule__StringType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__StringType__Group__1__Impl_in_rule__StringType__Group__13742);
            rule__StringType__Group__1__Impl();
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
    // $ANTLR end rule__StringType__Group__1


    // $ANTLR start rule__StringType__Group__1__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1869:1: rule__StringType__Group__1__Impl : ( 'string' ) ;
    public final void rule__StringType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1873:1: ( ( 'string' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1874:1: ( 'string' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1874:1: ( 'string' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1875:1: 'string'
            {
             before(grammarAccess.getStringTypeAccess().getStringKeyword_1()); 
            match(input,26,FOLLOW_26_in_rule__StringType__Group__1__Impl3770); 
             after(grammarAccess.getStringTypeAccess().getStringKeyword_1()); 

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
    // $ANTLR end rule__StringType__Group__1__Impl


    // $ANTLR start rule__Formula__Group__0
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1892:1: rule__Formula__Group__0 : rule__Formula__Group__0__Impl rule__Formula__Group__1 ;
    public final void rule__Formula__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1896:1: ( rule__Formula__Group__0__Impl rule__Formula__Group__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1897:2: rule__Formula__Group__0__Impl rule__Formula__Group__1
            {
            pushFollow(FOLLOW_rule__Formula__Group__0__Impl_in_rule__Formula__Group__03805);
            rule__Formula__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Formula__Group__1_in_rule__Formula__Group__03808);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1904:1: rule__Formula__Group__0__Impl : ( () ) ;
    public final void rule__Formula__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1908:1: ( ( () ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1909:1: ( () )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1909:1: ( () )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1910:1: ()
            {
             before(grammarAccess.getFormulaAccess().getFormulaAction_0()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1911:1: ()
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1913:1: 
            {
            }

             after(grammarAccess.getFormulaAccess().getFormulaAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Formula__Group__0__Impl


    // $ANTLR start rule__Formula__Group__1
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1923:1: rule__Formula__Group__1 : rule__Formula__Group__1__Impl rule__Formula__Group__2 ;
    public final void rule__Formula__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1927:1: ( rule__Formula__Group__1__Impl rule__Formula__Group__2 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1928:2: rule__Formula__Group__1__Impl rule__Formula__Group__2
            {
            pushFollow(FOLLOW_rule__Formula__Group__1__Impl_in_rule__Formula__Group__13866);
            rule__Formula__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Formula__Group__2_in_rule__Formula__Group__13869);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1935:1: rule__Formula__Group__1__Impl : ( 'calc' ) ;
    public final void rule__Formula__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1939:1: ( ( 'calc' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1940:1: ( 'calc' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1940:1: ( 'calc' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1941:1: 'calc'
            {
             before(grammarAccess.getFormulaAccess().getCalcKeyword_1()); 
            match(input,27,FOLLOW_27_in_rule__Formula__Group__1__Impl3897); 
             after(grammarAccess.getFormulaAccess().getCalcKeyword_1()); 

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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1954:1: rule__Formula__Group__2 : rule__Formula__Group__2__Impl rule__Formula__Group__3 ;
    public final void rule__Formula__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1958:1: ( rule__Formula__Group__2__Impl rule__Formula__Group__3 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1959:2: rule__Formula__Group__2__Impl rule__Formula__Group__3
            {
            pushFollow(FOLLOW_rule__Formula__Group__2__Impl_in_rule__Formula__Group__23928);
            rule__Formula__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Formula__Group__3_in_rule__Formula__Group__23931);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1966:1: rule__Formula__Group__2__Impl : ( ( rule__Formula__TypeAssignment_2 ) ) ;
    public final void rule__Formula__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1970:1: ( ( ( rule__Formula__TypeAssignment_2 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1971:1: ( ( rule__Formula__TypeAssignment_2 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1971:1: ( ( rule__Formula__TypeAssignment_2 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1972:1: ( rule__Formula__TypeAssignment_2 )
            {
             before(grammarAccess.getFormulaAccess().getTypeAssignment_2()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1973:1: ( rule__Formula__TypeAssignment_2 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1973:2: rule__Formula__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Formula__TypeAssignment_2_in_rule__Formula__Group__2__Impl3958);
            rule__Formula__TypeAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getFormulaAccess().getTypeAssignment_2()); 

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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1983:1: rule__Formula__Group__3 : rule__Formula__Group__3__Impl rule__Formula__Group__4 ;
    public final void rule__Formula__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1987:1: ( rule__Formula__Group__3__Impl rule__Formula__Group__4 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1988:2: rule__Formula__Group__3__Impl rule__Formula__Group__4
            {
            pushFollow(FOLLOW_rule__Formula__Group__3__Impl_in_rule__Formula__Group__33988);
            rule__Formula__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Formula__Group__4_in_rule__Formula__Group__33991);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1995:1: rule__Formula__Group__3__Impl : ( ( rule__Formula__NameAssignment_3 ) ) ;
    public final void rule__Formula__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1999:1: ( ( ( rule__Formula__NameAssignment_3 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2000:1: ( ( rule__Formula__NameAssignment_3 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2000:1: ( ( rule__Formula__NameAssignment_3 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2001:1: ( rule__Formula__NameAssignment_3 )
            {
             before(grammarAccess.getFormulaAccess().getNameAssignment_3()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2002:1: ( rule__Formula__NameAssignment_3 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2002:2: rule__Formula__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__Formula__NameAssignment_3_in_rule__Formula__Group__3__Impl4018);
            rule__Formula__NameAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getFormulaAccess().getNameAssignment_3()); 

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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2012:1: rule__Formula__Group__4 : rule__Formula__Group__4__Impl rule__Formula__Group__5 ;
    public final void rule__Formula__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2016:1: ( rule__Formula__Group__4__Impl rule__Formula__Group__5 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2017:2: rule__Formula__Group__4__Impl rule__Formula__Group__5
            {
            pushFollow(FOLLOW_rule__Formula__Group__4__Impl_in_rule__Formula__Group__44048);
            rule__Formula__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Formula__Group__5_in_rule__Formula__Group__44051);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2024:1: rule__Formula__Group__4__Impl : ( '=' ) ;
    public final void rule__Formula__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2028:1: ( ( '=' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2029:1: ( '=' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2029:1: ( '=' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2030:1: '='
            {
             before(grammarAccess.getFormulaAccess().getEqualsSignKeyword_4()); 
            match(input,19,FOLLOW_19_in_rule__Formula__Group__4__Impl4079); 
             after(grammarAccess.getFormulaAccess().getEqualsSignKeyword_4()); 

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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2043:1: rule__Formula__Group__5 : rule__Formula__Group__5__Impl rule__Formula__Group__6 ;
    public final void rule__Formula__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2047:1: ( rule__Formula__Group__5__Impl rule__Formula__Group__6 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2048:2: rule__Formula__Group__5__Impl rule__Formula__Group__6
            {
            pushFollow(FOLLOW_rule__Formula__Group__5__Impl_in_rule__Formula__Group__54110);
            rule__Formula__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Formula__Group__6_in_rule__Formula__Group__54113);
            rule__Formula__Group__6();
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2055:1: rule__Formula__Group__5__Impl : ( ( rule__Formula__ExprAssignment_5 ) ) ;
    public final void rule__Formula__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2059:1: ( ( ( rule__Formula__ExprAssignment_5 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2060:1: ( ( rule__Formula__ExprAssignment_5 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2060:1: ( ( rule__Formula__ExprAssignment_5 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2061:1: ( rule__Formula__ExprAssignment_5 )
            {
             before(grammarAccess.getFormulaAccess().getExprAssignment_5()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2062:1: ( rule__Formula__ExprAssignment_5 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2062:2: rule__Formula__ExprAssignment_5
            {
            pushFollow(FOLLOW_rule__Formula__ExprAssignment_5_in_rule__Formula__Group__5__Impl4140);
            rule__Formula__ExprAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getFormulaAccess().getExprAssignment_5()); 

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


    // $ANTLR start rule__Formula__Group__6
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2072:1: rule__Formula__Group__6 : rule__Formula__Group__6__Impl ;
    public final void rule__Formula__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2076:1: ( rule__Formula__Group__6__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2077:2: rule__Formula__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Formula__Group__6__Impl_in_rule__Formula__Group__64170);
            rule__Formula__Group__6__Impl();
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
    // $ANTLR end rule__Formula__Group__6


    // $ANTLR start rule__Formula__Group__6__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2083:1: rule__Formula__Group__6__Impl : ( ';' ) ;
    public final void rule__Formula__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2087:1: ( ( ';' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2088:1: ( ';' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2088:1: ( ';' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2089:1: ';'
            {
             before(grammarAccess.getFormulaAccess().getSemicolonKeyword_6()); 
            match(input,14,FOLLOW_14_in_rule__Formula__Group__6__Impl4198); 
             after(grammarAccess.getFormulaAccess().getSemicolonKeyword_6()); 

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
    // $ANTLR end rule__Formula__Group__6__Impl


    // $ANTLR start rule__Comparison__Group__0
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2116:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2120:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2121:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
            {
            pushFollow(FOLLOW_rule__Comparison__Group__0__Impl_in_rule__Comparison__Group__04243);
            rule__Comparison__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Comparison__Group__1_in_rule__Comparison__Group__04246);
            rule__Comparison__Group__1();
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
    // $ANTLR end rule__Comparison__Group__0


    // $ANTLR start rule__Comparison__Group__0__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2128:1: rule__Comparison__Group__0__Impl : ( ruleAddition ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2132:1: ( ( ruleAddition ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2133:1: ( ruleAddition )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2133:1: ( ruleAddition )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2134:1: ruleAddition
            {
             before(grammarAccess.getComparisonAccess().getAdditionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAddition_in_rule__Comparison__Group__0__Impl4273);
            ruleAddition();
            _fsp--;

             after(grammarAccess.getComparisonAccess().getAdditionParserRuleCall_0()); 

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
    // $ANTLR end rule__Comparison__Group__0__Impl


    // $ANTLR start rule__Comparison__Group__1
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2145:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2149:1: ( rule__Comparison__Group__1__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2150:2: rule__Comparison__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Comparison__Group__1__Impl_in_rule__Comparison__Group__14302);
            rule__Comparison__Group__1__Impl();
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
    // $ANTLR end rule__Comparison__Group__1


    // $ANTLR start rule__Comparison__Group__1__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2156:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__Group_1__0 )? ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2160:1: ( ( ( rule__Comparison__Group_1__0 )? ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2161:1: ( ( rule__Comparison__Group_1__0 )? )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2161:1: ( ( rule__Comparison__Group_1__0 )? )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2162:1: ( rule__Comparison__Group_1__0 )?
            {
             before(grammarAccess.getComparisonAccess().getGroup_1()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2163:1: ( rule__Comparison__Group_1__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==28) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2163:2: rule__Comparison__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Comparison__Group_1__0_in_rule__Comparison__Group__1__Impl4329);
                    rule__Comparison__Group_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComparisonAccess().getGroup_1()); 

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
    // $ANTLR end rule__Comparison__Group__1__Impl


    // $ANTLR start rule__Comparison__Group_1__0
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2177:1: rule__Comparison__Group_1__0 : rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 ;
    public final void rule__Comparison__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2181:1: ( rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2182:2: rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1__0__Impl_in_rule__Comparison__Group_1__04364);
            rule__Comparison__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Comparison__Group_1__1_in_rule__Comparison__Group_1__04367);
            rule__Comparison__Group_1__1();
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
    // $ANTLR end rule__Comparison__Group_1__0


    // $ANTLR start rule__Comparison__Group_1__0__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2189:1: rule__Comparison__Group_1__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2193:1: ( ( () ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2194:1: ( () )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2194:1: ( () )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2195:1: ()
            {
             before(grammarAccess.getComparisonAccess().getEqualsLeftAction_1_0()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2196:1: ()
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2198:1: 
            {
            }

             after(grammarAccess.getComparisonAccess().getEqualsLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Comparison__Group_1__0__Impl


    // $ANTLR start rule__Comparison__Group_1__1
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2208:1: rule__Comparison__Group_1__1 : rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2 ;
    public final void rule__Comparison__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2212:1: ( rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2213:2: rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1__1__Impl_in_rule__Comparison__Group_1__14425);
            rule__Comparison__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Comparison__Group_1__2_in_rule__Comparison__Group_1__14428);
            rule__Comparison__Group_1__2();
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
    // $ANTLR end rule__Comparison__Group_1__1


    // $ANTLR start rule__Comparison__Group_1__1__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2220:1: rule__Comparison__Group_1__1__Impl : ( '==' ) ;
    public final void rule__Comparison__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2224:1: ( ( '==' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2225:1: ( '==' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2225:1: ( '==' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2226:1: '=='
            {
             before(grammarAccess.getComparisonAccess().getEqualsSignEqualsSignKeyword_1_1()); 
            match(input,28,FOLLOW_28_in_rule__Comparison__Group_1__1__Impl4456); 
             after(grammarAccess.getComparisonAccess().getEqualsSignEqualsSignKeyword_1_1()); 

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
    // $ANTLR end rule__Comparison__Group_1__1__Impl


    // $ANTLR start rule__Comparison__Group_1__2
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2239:1: rule__Comparison__Group_1__2 : rule__Comparison__Group_1__2__Impl ;
    public final void rule__Comparison__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2243:1: ( rule__Comparison__Group_1__2__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2244:2: rule__Comparison__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1__2__Impl_in_rule__Comparison__Group_1__24487);
            rule__Comparison__Group_1__2__Impl();
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
    // $ANTLR end rule__Comparison__Group_1__2


    // $ANTLR start rule__Comparison__Group_1__2__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2250:1: rule__Comparison__Group_1__2__Impl : ( ( rule__Comparison__RightAssignment_1_2 ) ) ;
    public final void rule__Comparison__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2254:1: ( ( ( rule__Comparison__RightAssignment_1_2 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2255:1: ( ( rule__Comparison__RightAssignment_1_2 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2255:1: ( ( rule__Comparison__RightAssignment_1_2 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2256:1: ( rule__Comparison__RightAssignment_1_2 )
            {
             before(grammarAccess.getComparisonAccess().getRightAssignment_1_2()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2257:1: ( rule__Comparison__RightAssignment_1_2 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2257:2: rule__Comparison__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Comparison__RightAssignment_1_2_in_rule__Comparison__Group_1__2__Impl4514);
            rule__Comparison__RightAssignment_1_2();
            _fsp--;


            }

             after(grammarAccess.getComparisonAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end rule__Comparison__Group_1__2__Impl


    // $ANTLR start rule__Addition__Group__0
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2273:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2277:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2278:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_rule__Addition__Group__0__Impl_in_rule__Addition__Group__04550);
            rule__Addition__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Addition__Group__1_in_rule__Addition__Group__04553);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2285:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2289:1: ( ( ruleMultiplication ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2290:1: ( ruleMultiplication )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2290:1: ( ruleMultiplication )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2291:1: ruleMultiplication
            {
             before(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleMultiplication_in_rule__Addition__Group__0__Impl4580);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2302:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2306:1: ( rule__Addition__Group__1__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2307:2: rule__Addition__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group__1__Impl_in_rule__Addition__Group__14609);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2313:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2317:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2318:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2318:1: ( ( rule__Addition__Group_1__0 )* )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2319:1: ( rule__Addition__Group_1__0 )*
            {
             before(grammarAccess.getAdditionAccess().getGroup_1()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2320:1: ( rule__Addition__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==29) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2320:2: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Addition__Group_1__0_in_rule__Addition__Group__1__Impl4636);
            	    rule__Addition__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2334:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2338:1: ( rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2339:2: rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1
            {
            pushFollow(FOLLOW_rule__Addition__Group_1__0__Impl_in_rule__Addition__Group_1__04671);
            rule__Addition__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Addition__Group_1__1_in_rule__Addition__Group_1__04674);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2346:1: rule__Addition__Group_1__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2350:1: ( ( () ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2351:1: ( () )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2351:1: ( () )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2352:1: ()
            {
             before(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2353:1: ()
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2355:1: 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2365:1: rule__Addition__Group_1__1 : rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 ;
    public final void rule__Addition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2369:1: ( rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2370:2: rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2
            {
            pushFollow(FOLLOW_rule__Addition__Group_1__1__Impl_in_rule__Addition__Group_1__14732);
            rule__Addition__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Addition__Group_1__2_in_rule__Addition__Group_1__14735);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2377:1: rule__Addition__Group_1__1__Impl : ( '+' ) ;
    public final void rule__Addition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2381:1: ( ( '+' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2382:1: ( '+' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2382:1: ( '+' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2383:1: '+'
            {
             before(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_1()); 
            match(input,29,FOLLOW_29_in_rule__Addition__Group_1__1__Impl4763); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2396:1: rule__Addition__Group_1__2 : rule__Addition__Group_1__2__Impl ;
    public final void rule__Addition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2400:1: ( rule__Addition__Group_1__2__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2401:2: rule__Addition__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group_1__2__Impl_in_rule__Addition__Group_1__24794);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2407:1: rule__Addition__Group_1__2__Impl : ( ( rule__Addition__RightAssignment_1_2 ) ) ;
    public final void rule__Addition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2411:1: ( ( ( rule__Addition__RightAssignment_1_2 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2412:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2412:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2413:1: ( rule__Addition__RightAssignment_1_2 )
            {
             before(grammarAccess.getAdditionAccess().getRightAssignment_1_2()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2414:1: ( rule__Addition__RightAssignment_1_2 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2414:2: rule__Addition__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Addition__RightAssignment_1_2_in_rule__Addition__Group_1__2__Impl4821);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2430:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2434:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2435:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__0__Impl_in_rule__Multiplication__Group__04857);
            rule__Multiplication__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Multiplication__Group__1_in_rule__Multiplication__Group__04860);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2442:1: rule__Multiplication__Group__0__Impl : ( rulePostfixOperators ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2446:1: ( ( rulePostfixOperators ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2447:1: ( rulePostfixOperators )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2447:1: ( rulePostfixOperators )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2448:1: rulePostfixOperators
            {
             before(grammarAccess.getMultiplicationAccess().getPostfixOperatorsParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePostfixOperators_in_rule__Multiplication__Group__0__Impl4887);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2459:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2463:1: ( rule__Multiplication__Group__1__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2464:2: rule__Multiplication__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__1__Impl_in_rule__Multiplication__Group__14916);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2470:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2474:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2475:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2475:1: ( ( rule__Multiplication__Group_1__0 )* )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2476:1: ( rule__Multiplication__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2477:1: ( rule__Multiplication__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==30) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2477:2: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Multiplication__Group_1__0_in_rule__Multiplication__Group__1__Impl4943);
            	    rule__Multiplication__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2491:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2495:1: ( rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2496:2: rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1__0__Impl_in_rule__Multiplication__Group_1__04978);
            rule__Multiplication__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Multiplication__Group_1__1_in_rule__Multiplication__Group_1__04981);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2503:1: rule__Multiplication__Group_1__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2507:1: ( ( () ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2508:1: ( () )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2508:1: ( () )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2509:1: ()
            {
             before(grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2510:1: ()
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2512:1: 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2522:1: rule__Multiplication__Group_1__1 : rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 ;
    public final void rule__Multiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2526:1: ( rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2527:2: rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1__1__Impl_in_rule__Multiplication__Group_1__15039);
            rule__Multiplication__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Multiplication__Group_1__2_in_rule__Multiplication__Group_1__15042);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2534:1: rule__Multiplication__Group_1__1__Impl : ( '*' ) ;
    public final void rule__Multiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2538:1: ( ( '*' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2539:1: ( '*' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2539:1: ( '*' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2540:1: '*'
            {
             before(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_1()); 
            match(input,30,FOLLOW_30_in_rule__Multiplication__Group_1__1__Impl5070); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2553:1: rule__Multiplication__Group_1__2 : rule__Multiplication__Group_1__2__Impl ;
    public final void rule__Multiplication__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2557:1: ( rule__Multiplication__Group_1__2__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2558:2: rule__Multiplication__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1__2__Impl_in_rule__Multiplication__Group_1__25101);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2564:1: rule__Multiplication__Group_1__2__Impl : ( ( rule__Multiplication__RightAssignment_1_2 ) ) ;
    public final void rule__Multiplication__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2568:1: ( ( ( rule__Multiplication__RightAssignment_1_2 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2569:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2569:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2570:1: ( rule__Multiplication__RightAssignment_1_2 )
            {
             before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_2()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2571:1: ( rule__Multiplication__RightAssignment_1_2 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2571:2: rule__Multiplication__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Multiplication__RightAssignment_1_2_in_rule__Multiplication__Group_1__2__Impl5128);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2587:1: rule__PostfixOperators__Group__0 : rule__PostfixOperators__Group__0__Impl rule__PostfixOperators__Group__1 ;
    public final void rule__PostfixOperators__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2591:1: ( rule__PostfixOperators__Group__0__Impl rule__PostfixOperators__Group__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2592:2: rule__PostfixOperators__Group__0__Impl rule__PostfixOperators__Group__1
            {
            pushFollow(FOLLOW_rule__PostfixOperators__Group__0__Impl_in_rule__PostfixOperators__Group__05164);
            rule__PostfixOperators__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PostfixOperators__Group__1_in_rule__PostfixOperators__Group__05167);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2599:1: rule__PostfixOperators__Group__0__Impl : ( ruleAtomic ) ;
    public final void rule__PostfixOperators__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2603:1: ( ( ruleAtomic ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2604:1: ( ruleAtomic )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2604:1: ( ruleAtomic )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2605:1: ruleAtomic
            {
             before(grammarAccess.getPostfixOperatorsAccess().getAtomicParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAtomic_in_rule__PostfixOperators__Group__0__Impl5194);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2616:1: rule__PostfixOperators__Group__1 : rule__PostfixOperators__Group__1__Impl ;
    public final void rule__PostfixOperators__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2620:1: ( rule__PostfixOperators__Group__1__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2621:2: rule__PostfixOperators__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PostfixOperators__Group__1__Impl_in_rule__PostfixOperators__Group__15223);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2627:1: rule__PostfixOperators__Group__1__Impl : ( ( rule__PostfixOperators__Group_1__0 )? ) ;
    public final void rule__PostfixOperators__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2631:1: ( ( ( rule__PostfixOperators__Group_1__0 )? ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2632:1: ( ( rule__PostfixOperators__Group_1__0 )? )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2632:1: ( ( rule__PostfixOperators__Group_1__0 )? )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2633:1: ( rule__PostfixOperators__Group_1__0 )?
            {
             before(grammarAccess.getPostfixOperatorsAccess().getGroup_1()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2634:1: ( rule__PostfixOperators__Group_1__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2634:2: rule__PostfixOperators__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__PostfixOperators__Group_1__0_in_rule__PostfixOperators__Group__1__Impl5250);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2648:1: rule__PostfixOperators__Group_1__0 : rule__PostfixOperators__Group_1__0__Impl rule__PostfixOperators__Group_1__1 ;
    public final void rule__PostfixOperators__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2652:1: ( rule__PostfixOperators__Group_1__0__Impl rule__PostfixOperators__Group_1__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2653:2: rule__PostfixOperators__Group_1__0__Impl rule__PostfixOperators__Group_1__1
            {
            pushFollow(FOLLOW_rule__PostfixOperators__Group_1__0__Impl_in_rule__PostfixOperators__Group_1__05285);
            rule__PostfixOperators__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PostfixOperators__Group_1__1_in_rule__PostfixOperators__Group_1__05288);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2660:1: rule__PostfixOperators__Group_1__0__Impl : ( () ) ;
    public final void rule__PostfixOperators__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2664:1: ( ( () ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2665:1: ( () )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2665:1: ( () )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2666:1: ()
            {
             before(grammarAccess.getPostfixOperatorsAccess().getArrayAccessExprAction_1_0()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2667:1: ()
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2669:1: 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2679:1: rule__PostfixOperators__Group_1__1 : rule__PostfixOperators__Group_1__1__Impl rule__PostfixOperators__Group_1__2 ;
    public final void rule__PostfixOperators__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2683:1: ( rule__PostfixOperators__Group_1__1__Impl rule__PostfixOperators__Group_1__2 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2684:2: rule__PostfixOperators__Group_1__1__Impl rule__PostfixOperators__Group_1__2
            {
            pushFollow(FOLLOW_rule__PostfixOperators__Group_1__1__Impl_in_rule__PostfixOperators__Group_1__15346);
            rule__PostfixOperators__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PostfixOperators__Group_1__2_in_rule__PostfixOperators__Group_1__15349);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2691:1: rule__PostfixOperators__Group_1__1__Impl : ( '[' ) ;
    public final void rule__PostfixOperators__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2695:1: ( ( '[' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2696:1: ( '[' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2696:1: ( '[' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2697:1: '['
            {
             before(grammarAccess.getPostfixOperatorsAccess().getLeftSquareBracketKeyword_1_1()); 
            match(input,21,FOLLOW_21_in_rule__PostfixOperators__Group_1__1__Impl5377); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2710:1: rule__PostfixOperators__Group_1__2 : rule__PostfixOperators__Group_1__2__Impl rule__PostfixOperators__Group_1__3 ;
    public final void rule__PostfixOperators__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2714:1: ( rule__PostfixOperators__Group_1__2__Impl rule__PostfixOperators__Group_1__3 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2715:2: rule__PostfixOperators__Group_1__2__Impl rule__PostfixOperators__Group_1__3
            {
            pushFollow(FOLLOW_rule__PostfixOperators__Group_1__2__Impl_in_rule__PostfixOperators__Group_1__25408);
            rule__PostfixOperators__Group_1__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PostfixOperators__Group_1__3_in_rule__PostfixOperators__Group_1__25411);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2722:1: rule__PostfixOperators__Group_1__2__Impl : ( ( rule__PostfixOperators__IndexAssignment_1_2 ) ) ;
    public final void rule__PostfixOperators__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2726:1: ( ( ( rule__PostfixOperators__IndexAssignment_1_2 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2727:1: ( ( rule__PostfixOperators__IndexAssignment_1_2 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2727:1: ( ( rule__PostfixOperators__IndexAssignment_1_2 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2728:1: ( rule__PostfixOperators__IndexAssignment_1_2 )
            {
             before(grammarAccess.getPostfixOperatorsAccess().getIndexAssignment_1_2()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2729:1: ( rule__PostfixOperators__IndexAssignment_1_2 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2729:2: rule__PostfixOperators__IndexAssignment_1_2
            {
            pushFollow(FOLLOW_rule__PostfixOperators__IndexAssignment_1_2_in_rule__PostfixOperators__Group_1__2__Impl5438);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2739:1: rule__PostfixOperators__Group_1__3 : rule__PostfixOperators__Group_1__3__Impl ;
    public final void rule__PostfixOperators__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2743:1: ( rule__PostfixOperators__Group_1__3__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2744:2: rule__PostfixOperators__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__PostfixOperators__Group_1__3__Impl_in_rule__PostfixOperators__Group_1__35468);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2750:1: rule__PostfixOperators__Group_1__3__Impl : ( ']' ) ;
    public final void rule__PostfixOperators__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2754:1: ( ( ']' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2755:1: ( ']' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2755:1: ( ']' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2756:1: ']'
            {
             before(grammarAccess.getPostfixOperatorsAccess().getRightSquareBracketKeyword_1_3()); 
            match(input,22,FOLLOW_22_in_rule__PostfixOperators__Group_1__3__Impl5496); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2777:1: rule__Atomic__Group_0__0 : rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 ;
    public final void rule__Atomic__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2781:1: ( rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2782:2: rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_0__0__Impl_in_rule__Atomic__Group_0__05535);
            rule__Atomic__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_0__1_in_rule__Atomic__Group_0__05538);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2789:1: rule__Atomic__Group_0__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2793:1: ( ( () ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2794:1: ( () )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2794:1: ( () )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2795:1: ()
            {
             before(grammarAccess.getAtomicAccess().getSymbolRefAction_0_0()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2796:1: ()
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2798:1: 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2808:1: rule__Atomic__Group_0__1 : rule__Atomic__Group_0__1__Impl ;
    public final void rule__Atomic__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2812:1: ( rule__Atomic__Group_0__1__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2813:2: rule__Atomic__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_0__1__Impl_in_rule__Atomic__Group_0__15596);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2819:1: rule__Atomic__Group_0__1__Impl : ( ( rule__Atomic__SymbolAssignment_0_1 ) ) ;
    public final void rule__Atomic__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2823:1: ( ( ( rule__Atomic__SymbolAssignment_0_1 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2824:1: ( ( rule__Atomic__SymbolAssignment_0_1 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2824:1: ( ( rule__Atomic__SymbolAssignment_0_1 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2825:1: ( rule__Atomic__SymbolAssignment_0_1 )
            {
             before(grammarAccess.getAtomicAccess().getSymbolAssignment_0_1()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2826:1: ( rule__Atomic__SymbolAssignment_0_1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2826:2: rule__Atomic__SymbolAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Atomic__SymbolAssignment_0_1_in_rule__Atomic__Group_0__1__Impl5623);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2840:1: rule__Atomic__Group_1__0 : rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 ;
    public final void rule__Atomic__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2844:1: ( rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2845:2: rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_1__0__Impl_in_rule__Atomic__Group_1__05657);
            rule__Atomic__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_1__1_in_rule__Atomic__Group_1__05660);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2852:1: rule__Atomic__Group_1__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2856:1: ( ( () ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2857:1: ( () )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2857:1: ( () )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2858:1: ()
            {
             before(grammarAccess.getAtomicAccess().getNumberLiteralAction_1_0()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2859:1: ()
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2861:1: 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2871:1: rule__Atomic__Group_1__1 : rule__Atomic__Group_1__1__Impl ;
    public final void rule__Atomic__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2875:1: ( rule__Atomic__Group_1__1__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2876:2: rule__Atomic__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_1__1__Impl_in_rule__Atomic__Group_1__15718);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2882:1: rule__Atomic__Group_1__1__Impl : ( ( rule__Atomic__ValueAssignment_1_1 ) ) ;
    public final void rule__Atomic__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2886:1: ( ( ( rule__Atomic__ValueAssignment_1_1 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2887:1: ( ( rule__Atomic__ValueAssignment_1_1 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2887:1: ( ( rule__Atomic__ValueAssignment_1_1 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2888:1: ( rule__Atomic__ValueAssignment_1_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_1_1()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2889:1: ( rule__Atomic__ValueAssignment_1_1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2889:2: rule__Atomic__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Atomic__ValueAssignment_1_1_in_rule__Atomic__Group_1__1__Impl5745);
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


    // $ANTLR start rule__Atomic__Group_2__0
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2903:1: rule__Atomic__Group_2__0 : rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 ;
    public final void rule__Atomic__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2907:1: ( rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2908:2: rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_2__0__Impl_in_rule__Atomic__Group_2__05779);
            rule__Atomic__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_2__1_in_rule__Atomic__Group_2__05782);
            rule__Atomic__Group_2__1();
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
    // $ANTLR end rule__Atomic__Group_2__0


    // $ANTLR start rule__Atomic__Group_2__0__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2915:1: rule__Atomic__Group_2__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2919:1: ( ( () ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2920:1: ( () )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2920:1: ( () )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2921:1: ()
            {
             before(grammarAccess.getAtomicAccess().getStringLiteralAction_2_0()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2922:1: ()
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2924:1: 
            {
            }

             after(grammarAccess.getAtomicAccess().getStringLiteralAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Atomic__Group_2__0__Impl


    // $ANTLR start rule__Atomic__Group_2__1
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2934:1: rule__Atomic__Group_2__1 : rule__Atomic__Group_2__1__Impl ;
    public final void rule__Atomic__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2938:1: ( rule__Atomic__Group_2__1__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2939:2: rule__Atomic__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_2__1__Impl_in_rule__Atomic__Group_2__15840);
            rule__Atomic__Group_2__1__Impl();
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
    // $ANTLR end rule__Atomic__Group_2__1


    // $ANTLR start rule__Atomic__Group_2__1__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2945:1: rule__Atomic__Group_2__1__Impl : ( ( rule__Atomic__ValueAssignment_2_1 ) ) ;
    public final void rule__Atomic__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2949:1: ( ( ( rule__Atomic__ValueAssignment_2_1 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2950:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2950:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2951:1: ( rule__Atomic__ValueAssignment_2_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_2_1()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2952:1: ( rule__Atomic__ValueAssignment_2_1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2952:2: rule__Atomic__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Atomic__ValueAssignment_2_1_in_rule__Atomic__Group_2__1__Impl5867);
            rule__Atomic__ValueAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getAtomicAccess().getValueAssignment_2_1()); 

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
    // $ANTLR end rule__Atomic__Group_2__1__Impl


    // $ANTLR start rule__QID__Group__0
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2966:1: rule__QID__Group__0 : rule__QID__Group__0__Impl rule__QID__Group__1 ;
    public final void rule__QID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2970:1: ( rule__QID__Group__0__Impl rule__QID__Group__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2971:2: rule__QID__Group__0__Impl rule__QID__Group__1
            {
            pushFollow(FOLLOW_rule__QID__Group__0__Impl_in_rule__QID__Group__05901);
            rule__QID__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__QID__Group__1_in_rule__QID__Group__05904);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2978:1: rule__QID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2982:1: ( ( RULE_ID ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2983:1: ( RULE_ID )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2983:1: ( RULE_ID )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2984:1: RULE_ID
            {
             before(grammarAccess.getQIDAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QID__Group__0__Impl5931); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2995:1: rule__QID__Group__1 : rule__QID__Group__1__Impl ;
    public final void rule__QID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2999:1: ( rule__QID__Group__1__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3000:2: rule__QID__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QID__Group__1__Impl_in_rule__QID__Group__15960);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3006:1: rule__QID__Group__1__Impl : ( ( rule__QID__Group_1__0 )* ) ;
    public final void rule__QID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3010:1: ( ( ( rule__QID__Group_1__0 )* ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3011:1: ( ( rule__QID__Group_1__0 )* )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3011:1: ( ( rule__QID__Group_1__0 )* )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3012:1: ( rule__QID__Group_1__0 )*
            {
             before(grammarAccess.getQIDAccess().getGroup_1()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3013:1: ( rule__QID__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==31) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3013:2: rule__QID__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QID__Group_1__0_in_rule__QID__Group__1__Impl5987);
            	    rule__QID__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3027:1: rule__QID__Group_1__0 : rule__QID__Group_1__0__Impl rule__QID__Group_1__1 ;
    public final void rule__QID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3031:1: ( rule__QID__Group_1__0__Impl rule__QID__Group_1__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3032:2: rule__QID__Group_1__0__Impl rule__QID__Group_1__1
            {
            pushFollow(FOLLOW_rule__QID__Group_1__0__Impl_in_rule__QID__Group_1__06022);
            rule__QID__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__QID__Group_1__1_in_rule__QID__Group_1__06025);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3039:1: rule__QID__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3043:1: ( ( '.' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3044:1: ( '.' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3044:1: ( '.' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3045:1: '.'
            {
             before(grammarAccess.getQIDAccess().getFullStopKeyword_1_0()); 
            match(input,31,FOLLOW_31_in_rule__QID__Group_1__0__Impl6053); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3058:1: rule__QID__Group_1__1 : rule__QID__Group_1__1__Impl ;
    public final void rule__QID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3062:1: ( rule__QID__Group_1__1__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3063:2: rule__QID__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QID__Group_1__1__Impl_in_rule__QID__Group_1__16084);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3069:1: rule__QID__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3073:1: ( ( RULE_ID ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3074:1: ( RULE_ID )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3074:1: ( RULE_ID )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3075:1: RULE_ID
            {
             before(grammarAccess.getQIDAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QID__Group_1__1__Impl6111); 
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


    // $ANTLR start rule__Model__NameAssignment_1
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3091:1: rule__Model__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3095:1: ( ( RULE_ID ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3096:1: ( RULE_ID )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3096:1: ( RULE_ID )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3097:1: RULE_ID
            {
             before(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Model__NameAssignment_16149); 
             after(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end rule__Model__NameAssignment_1


    // $ANTLR start rule__Model__ElementsAssignment_2
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3106:1: rule__Model__ElementsAssignment_2 : ( ruleElement ) ;
    public final void rule__Model__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3110:1: ( ( ruleElement ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3111:1: ( ruleElement )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3111:1: ( ruleElement )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3112:1: ruleElement
            {
             before(grammarAccess.getModelAccess().getElementsElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleElement_in_rule__Model__ElementsAssignment_26180);
            ruleElement();
            _fsp--;

             after(grammarAccess.getModelAccess().getElementsElementParserRuleCall_2_0()); 

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
    // $ANTLR end rule__Model__ElementsAssignment_2


    // $ANTLR start rule__Assert__ExprAssignment_1
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3121:1: rule__Assert__ExprAssignment_1 : ( ruleExpr ) ;
    public final void rule__Assert__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3125:1: ( ( ruleExpr ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3126:1: ( ruleExpr )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3126:1: ( ruleExpr )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3127:1: ruleExpr
            {
             before(grammarAccess.getAssertAccess().getExprExprParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleExpr_in_rule__Assert__ExprAssignment_16211);
            ruleExpr();
            _fsp--;

             after(grammarAccess.getAssertAccess().getExprExprParserRuleCall_1_0()); 

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
    // $ANTLR end rule__Assert__ExprAssignment_1


    // $ANTLR start rule__EnumDecl__NameAssignment_1
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3136:1: rule__EnumDecl__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EnumDecl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3140:1: ( ( RULE_ID ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3141:1: ( RULE_ID )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3141:1: ( RULE_ID )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3142:1: RULE_ID
            {
             before(grammarAccess.getEnumDeclAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumDecl__NameAssignment_16242); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3151:1: rule__EnumDecl__LiteralsAssignment_3 : ( ruleEnumLiteral ) ;
    public final void rule__EnumDecl__LiteralsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3155:1: ( ( ruleEnumLiteral ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3156:1: ( ruleEnumLiteral )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3156:1: ( ruleEnumLiteral )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3157:1: ruleEnumLiteral
            {
             before(grammarAccess.getEnumDeclAccess().getLiteralsEnumLiteralParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEnumLiteral_in_rule__EnumDecl__LiteralsAssignment_36273);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3166:1: rule__EnumLiteral__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EnumLiteral__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3170:1: ( ( RULE_ID ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3171:1: ( RULE_ID )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3171:1: ( RULE_ID )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3172:1: RULE_ID
            {
             before(grammarAccess.getEnumLiteralAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumLiteral__NameAssignment_16304); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3181:1: rule__VarDecl__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__VarDecl__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3185:1: ( ( ruleType ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3186:1: ( ruleType )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3186:1: ( ruleType )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3187:1: ruleType
            {
             before(grammarAccess.getVarDeclAccess().getTypeTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__VarDecl__TypeAssignment_26335);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3196:1: rule__VarDecl__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__VarDecl__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3200:1: ( ( RULE_ID ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3201:1: ( RULE_ID )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3201:1: ( RULE_ID )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3202:1: RULE_ID
            {
             before(grammarAccess.getVarDeclAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VarDecl__NameAssignment_36366); 
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


    // $ANTLR start rule__VarDecl__InitAssignment_4_1
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3211:1: rule__VarDecl__InitAssignment_4_1 : ( ruleExpr ) ;
    public final void rule__VarDecl__InitAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3215:1: ( ( ruleExpr ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3216:1: ( ruleExpr )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3216:1: ( ruleExpr )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3217:1: ruleExpr
            {
             before(grammarAccess.getVarDeclAccess().getInitExprParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleExpr_in_rule__VarDecl__InitAssignment_4_16397);
            ruleExpr();
            _fsp--;

             after(grammarAccess.getVarDeclAccess().getInitExprParserRuleCall_4_1_0()); 

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
    // $ANTLR end rule__VarDecl__InitAssignment_4_1


    // $ANTLR start rule__ArrayType__BaseTypeAssignment_3
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3226:1: rule__ArrayType__BaseTypeAssignment_3 : ( ruleType ) ;
    public final void rule__ArrayType__BaseTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3230:1: ( ( ruleType ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3231:1: ( ruleType )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3231:1: ( ruleType )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3232:1: ruleType
            {
             before(grammarAccess.getArrayTypeAccess().getBaseTypeTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__ArrayType__BaseTypeAssignment_36428);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3241:1: rule__EnumType__EnumRefAssignment : ( ( RULE_ID ) ) ;
    public final void rule__EnumType__EnumRefAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3245:1: ( ( ( RULE_ID ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3246:1: ( ( RULE_ID ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3246:1: ( ( RULE_ID ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3247:1: ( RULE_ID )
            {
             before(grammarAccess.getEnumTypeAccess().getEnumRefEnumDeclCrossReference_0()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3248:1: ( RULE_ID )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3249:1: RULE_ID
            {
             before(grammarAccess.getEnumTypeAccess().getEnumRefEnumDeclIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumType__EnumRefAssignment6463); 
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


    // $ANTLR start rule__Formula__TypeAssignment_2
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3260:1: rule__Formula__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__Formula__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3264:1: ( ( ruleType ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3265:1: ( ruleType )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3265:1: ( ruleType )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3266:1: ruleType
            {
             before(grammarAccess.getFormulaAccess().getTypeTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Formula__TypeAssignment_26498);
            ruleType();
            _fsp--;

             after(grammarAccess.getFormulaAccess().getTypeTypeParserRuleCall_2_0()); 

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
    // $ANTLR end rule__Formula__TypeAssignment_2


    // $ANTLR start rule__Formula__NameAssignment_3
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3275:1: rule__Formula__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Formula__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3279:1: ( ( RULE_ID ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3280:1: ( RULE_ID )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3280:1: ( RULE_ID )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3281:1: RULE_ID
            {
             before(grammarAccess.getFormulaAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Formula__NameAssignment_36529); 
             after(grammarAccess.getFormulaAccess().getNameIDTerminalRuleCall_3_0()); 

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
    // $ANTLR end rule__Formula__NameAssignment_3


    // $ANTLR start rule__Formula__ExprAssignment_5
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3290:1: rule__Formula__ExprAssignment_5 : ( ruleExpr ) ;
    public final void rule__Formula__ExprAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3294:1: ( ( ruleExpr ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3295:1: ( ruleExpr )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3295:1: ( ruleExpr )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3296:1: ruleExpr
            {
             before(grammarAccess.getFormulaAccess().getExprExprParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleExpr_in_rule__Formula__ExprAssignment_56560);
            ruleExpr();
            _fsp--;

             after(grammarAccess.getFormulaAccess().getExprExprParserRuleCall_5_0()); 

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
    // $ANTLR end rule__Formula__ExprAssignment_5


    // $ANTLR start rule__Comparison__RightAssignment_1_2
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3305:1: rule__Comparison__RightAssignment_1_2 : ( ruleAddition ) ;
    public final void rule__Comparison__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3309:1: ( ( ruleAddition ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3310:1: ( ruleAddition )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3310:1: ( ruleAddition )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3311:1: ruleAddition
            {
             before(grammarAccess.getComparisonAccess().getRightAdditionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleAddition_in_rule__Comparison__RightAssignment_1_26591);
            ruleAddition();
            _fsp--;

             after(grammarAccess.getComparisonAccess().getRightAdditionParserRuleCall_1_2_0()); 

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
    // $ANTLR end rule__Comparison__RightAssignment_1_2


    // $ANTLR start rule__Addition__RightAssignment_1_2
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3320:1: rule__Addition__RightAssignment_1_2 : ( ruleMultiplication ) ;
    public final void rule__Addition__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3324:1: ( ( ruleMultiplication ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3325:1: ( ruleMultiplication )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3325:1: ( ruleMultiplication )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3326:1: ruleMultiplication
            {
             before(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleMultiplication_in_rule__Addition__RightAssignment_1_26622);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3335:1: rule__Multiplication__RightAssignment_1_2 : ( rulePostfixOperators ) ;
    public final void rule__Multiplication__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3339:1: ( ( rulePostfixOperators ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3340:1: ( rulePostfixOperators )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3340:1: ( rulePostfixOperators )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3341:1: rulePostfixOperators
            {
             before(grammarAccess.getMultiplicationAccess().getRightPostfixOperatorsParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_rulePostfixOperators_in_rule__Multiplication__RightAssignment_1_26653);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3350:1: rule__PostfixOperators__IndexAssignment_1_2 : ( ruleExpr ) ;
    public final void rule__PostfixOperators__IndexAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3354:1: ( ( ruleExpr ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3355:1: ( ruleExpr )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3355:1: ( ruleExpr )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3356:1: ruleExpr
            {
             before(grammarAccess.getPostfixOperatorsAccess().getIndexExprParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleExpr_in_rule__PostfixOperators__IndexAssignment_1_26684);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3365:1: rule__Atomic__SymbolAssignment_0_1 : ( ( ruleQID ) ) ;
    public final void rule__Atomic__SymbolAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3369:1: ( ( ( ruleQID ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3370:1: ( ( ruleQID ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3370:1: ( ( ruleQID ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3371:1: ( ruleQID )
            {
             before(grammarAccess.getAtomicAccess().getSymbolSymbolCrossReference_0_1_0()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3372:1: ( ruleQID )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3373:1: ruleQID
            {
             before(grammarAccess.getAtomicAccess().getSymbolSymbolQIDParserRuleCall_0_1_0_1()); 
            pushFollow(FOLLOW_ruleQID_in_rule__Atomic__SymbolAssignment_0_16719);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3384:1: rule__Atomic__ValueAssignment_1_1 : ( RULE_NUMBER ) ;
    public final void rule__Atomic__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3388:1: ( ( RULE_NUMBER ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3389:1: ( RULE_NUMBER )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3389:1: ( RULE_NUMBER )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3390:1: RULE_NUMBER
            {
             before(grammarAccess.getAtomicAccess().getValueNUMBERTerminalRuleCall_1_1_0()); 
            match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__Atomic__ValueAssignment_1_16754); 
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


    // $ANTLR start rule__Atomic__ValueAssignment_2_1
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3399:1: rule__Atomic__ValueAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Atomic__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3403:1: ( ( RULE_STRING ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3404:1: ( RULE_STRING )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3404:1: ( RULE_STRING )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3405:1: RULE_STRING
            {
             before(grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Atomic__ValueAssignment_2_16785); 
             after(grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_2_1_0()); 

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
    // $ANTLR end rule__Atomic__ValueAssignment_2_1


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_entryRuleElement121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElement128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__Alternatives_in_ruleElement154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssert_in_entryRuleAssert181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssert188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assert__Group__0_in_ruleAssert214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumDecl_in_entryRuleEnumDecl241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumDecl248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDecl__Group__0_in_ruleEnumDecl274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumLiteral_in_entryRuleEnumLiteral301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumLiteral308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumLiteral__Group__0_in_ruleEnumLiteral334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDecl_in_entryRuleVarDecl361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarDecl368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__0_in_ruleVarDecl394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_entryRulePrimitiveType481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveType488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Alternatives_in_rulePrimitiveType514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayType_in_entryRuleArrayType541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayType548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__0_in_ruleArrayType574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumType_in_entryRuleEnumType601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumType608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__EnumRefAssignment_in_ruleEnumType634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntType_in_entryRuleIntType661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntType668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntType__Group__0_in_ruleIntType694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolType_in_entryRuleBoolType721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolType728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolType__Group__0_in_ruleBoolType754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatType_in_entryRuleFloatType781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatType788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatType__Group__0_in_ruleFloatType814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_entryRuleStringType841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringType848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringType__Group__0_in_ruleStringType874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormula_in_entryRuleFormula901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormula908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Formula__Group__0_in_ruleFormula934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_entryRuleExpr961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpr968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleExpr994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_entryRuleComparison1020 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparison1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__0_in_ruleComparison1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_entryRuleAddition1080 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddition1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__0_in_ruleAddition1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_entryRuleMultiplication1140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplication1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__0_in_ruleMultiplication1173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePostfixOperators_in_entryRulePostfixOperators1200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePostfixOperators1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixOperators__Group__0_in_rulePostfixOperators1233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_entryRuleAtomic1260 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomic1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Alternatives_in_ruleAtomic1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQID_in_entryRuleQID1320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQID1327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QID__Group__0_in_ruleQID1353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDecl_in_rule__Element__Alternatives1389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormula_in_rule__Element__Alternatives1406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumDecl_in_rule__Element__Alternatives1423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssert_in_rule__Element__Alternatives1440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_rule__Type__Alternatives1472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayType_in_rule__Type__Alternatives1489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntType_in_rule__PrimitiveType__Alternatives1521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolType_in_rule__PrimitiveType__Alternatives1538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatType_in_rule__PrimitiveType__Alternatives1555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumType_in_rule__PrimitiveType__Alternatives1572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_rule__PrimitiveType__Alternatives1589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0__0_in_rule__Atomic__Alternatives1621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__0_in_rule__Atomic__Alternatives1639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2__0_in_rule__Atomic__Alternatives1657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01688 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Model__Group__0__Impl1719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11750 = new BitSet(new long[]{0x000000000804A002L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__1__Impl1780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ElementsAssignment_2_in_rule__Model__Group__2__Impl1837 = new BitSet(new long[]{0x000000000804A002L});
    public static final BitSet FOLLOW_rule__Assert__Group__0__Impl_in_rule__Assert__Group__01874 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__Assert__Group__1_in_rule__Assert__Group__01877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Assert__Group__0__Impl1905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assert__Group__1__Impl_in_rule__Assert__Group__11936 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Assert__Group__2_in_rule__Assert__Group__11939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assert__ExprAssignment_1_in_rule__Assert__Group__1__Impl1966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assert__Group__2__Impl_in_rule__Assert__Group__21996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Assert__Group__2__Impl2024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDecl__Group__0__Impl_in_rule__EnumDecl__Group__02061 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumDecl__Group__1_in_rule__EnumDecl__Group__02064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__EnumDecl__Group__0__Impl2092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDecl__Group__1__Impl_in_rule__EnumDecl__Group__12123 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__EnumDecl__Group__2_in_rule__EnumDecl__Group__12126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDecl__NameAssignment_1_in_rule__EnumDecl__Group__1__Impl2153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDecl__Group__2__Impl_in_rule__EnumDecl__Group__22183 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_rule__EnumDecl__Group__3_in_rule__EnumDecl__Group__22186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__EnumDecl__Group__2__Impl2214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDecl__Group__3__Impl_in_rule__EnumDecl__Group__32245 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__EnumDecl__Group__4_in_rule__EnumDecl__Group__32248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDecl__LiteralsAssignment_3_in_rule__EnumDecl__Group__3__Impl2275 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__EnumDecl__Group__4__Impl_in_rule__EnumDecl__Group__42306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__EnumDecl__Group__4__Impl2334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumLiteral__Group__0__Impl_in_rule__EnumLiteral__Group__02375 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumLiteral__Group__1_in_rule__EnumLiteral__Group__02378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumLiteral__Group__1__Impl_in_rule__EnumLiteral__Group__12436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumLiteral__NameAssignment_1_in_rule__EnumLiteral__Group__1__Impl2463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__0__Impl_in_rule__VarDecl__Group__02497 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__1_in_rule__VarDecl__Group__02500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__1__Impl_in_rule__VarDecl__Group__12558 = new BitSet(new long[]{0x0000000007900010L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__2_in_rule__VarDecl__Group__12561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__VarDecl__Group__1__Impl2589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__2__Impl_in_rule__VarDecl__Group__22620 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__3_in_rule__VarDecl__Group__22623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__TypeAssignment_2_in_rule__VarDecl__Group__2__Impl2650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__3__Impl_in_rule__VarDecl__Group__32680 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__4_in_rule__VarDecl__Group__32683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__NameAssignment_3_in_rule__VarDecl__Group__3__Impl2710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__4__Impl_in_rule__VarDecl__Group__42740 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__5_in_rule__VarDecl__Group__42743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group_4__0_in_rule__VarDecl__Group__4__Impl2770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__5__Impl_in_rule__VarDecl__Group__52801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__VarDecl__Group__5__Impl2829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group_4__0__Impl_in_rule__VarDecl__Group_4__02872 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__VarDecl__Group_4__1_in_rule__VarDecl__Group_4__02875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__VarDecl__Group_4__0__Impl2903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group_4__1__Impl_in_rule__VarDecl__Group_4__12934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__InitAssignment_4_1_in_rule__VarDecl__Group_4__1__Impl2961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__0__Impl_in_rule__ArrayType__Group__02995 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__1_in_rule__ArrayType__Group__02998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__1__Impl_in_rule__ArrayType__Group__13056 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__2_in_rule__ArrayType__Group__13059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ArrayType__Group__1__Impl3087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__2__Impl_in_rule__ArrayType__Group__23118 = new BitSet(new long[]{0x0000000007900010L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__3_in_rule__ArrayType__Group__23121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ArrayType__Group__2__Impl3149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__3__Impl_in_rule__ArrayType__Group__33180 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__4_in_rule__ArrayType__Group__33183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__BaseTypeAssignment_3_in_rule__ArrayType__Group__3__Impl3210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__4__Impl_in_rule__ArrayType__Group__43240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ArrayType__Group__4__Impl3268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntType__Group__0__Impl_in_rule__IntType__Group__03309 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__IntType__Group__1_in_rule__IntType__Group__03312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntType__Group__1__Impl_in_rule__IntType__Group__13370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__IntType__Group__1__Impl3398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolType__Group__0__Impl_in_rule__BoolType__Group__03433 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__BoolType__Group__1_in_rule__BoolType__Group__03436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolType__Group__1__Impl_in_rule__BoolType__Group__13494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__BoolType__Group__1__Impl3522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatType__Group__0__Impl_in_rule__FloatType__Group__03557 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__FloatType__Group__1_in_rule__FloatType__Group__03560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatType__Group__1__Impl_in_rule__FloatType__Group__13618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__FloatType__Group__1__Impl3646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringType__Group__0__Impl_in_rule__StringType__Group__03681 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__StringType__Group__1_in_rule__StringType__Group__03684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringType__Group__1__Impl_in_rule__StringType__Group__13742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__StringType__Group__1__Impl3770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Formula__Group__0__Impl_in_rule__Formula__Group__03805 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Formula__Group__1_in_rule__Formula__Group__03808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Formula__Group__1__Impl_in_rule__Formula__Group__13866 = new BitSet(new long[]{0x0000000007900010L});
    public static final BitSet FOLLOW_rule__Formula__Group__2_in_rule__Formula__Group__13869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Formula__Group__1__Impl3897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Formula__Group__2__Impl_in_rule__Formula__Group__23928 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Formula__Group__3_in_rule__Formula__Group__23931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Formula__TypeAssignment_2_in_rule__Formula__Group__2__Impl3958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Formula__Group__3__Impl_in_rule__Formula__Group__33988 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Formula__Group__4_in_rule__Formula__Group__33991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Formula__NameAssignment_3_in_rule__Formula__Group__3__Impl4018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Formula__Group__4__Impl_in_rule__Formula__Group__44048 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__Formula__Group__5_in_rule__Formula__Group__44051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Formula__Group__4__Impl4079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Formula__Group__5__Impl_in_rule__Formula__Group__54110 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Formula__Group__6_in_rule__Formula__Group__54113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Formula__ExprAssignment_5_in_rule__Formula__Group__5__Impl4140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Formula__Group__6__Impl_in_rule__Formula__Group__64170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Formula__Group__6__Impl4198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__0__Impl_in_rule__Comparison__Group__04243 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__1_in_rule__Comparison__Group__04246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_rule__Comparison__Group__0__Impl4273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__1__Impl_in_rule__Comparison__Group__14302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__0_in_rule__Comparison__Group__1__Impl4329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__0__Impl_in_rule__Comparison__Group_1__04364 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__1_in_rule__Comparison__Group_1__04367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__1__Impl_in_rule__Comparison__Group_1__14425 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__2_in_rule__Comparison__Group_1__14428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Comparison__Group_1__1__Impl4456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__2__Impl_in_rule__Comparison__Group_1__24487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__RightAssignment_1_2_in_rule__Comparison__Group_1__2__Impl4514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__0__Impl_in_rule__Addition__Group__04550 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__1_in_rule__Addition__Group__04553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_rule__Addition__Group__0__Impl4580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__1__Impl_in_rule__Addition__Group__14609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__0_in_rule__Addition__Group__1__Impl4636 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__0__Impl_in_rule__Addition__Group_1__04671 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__1_in_rule__Addition__Group_1__04674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__1__Impl_in_rule__Addition__Group_1__14732 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__2_in_rule__Addition__Group_1__14735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Addition__Group_1__1__Impl4763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__2__Impl_in_rule__Addition__Group_1__24794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__RightAssignment_1_2_in_rule__Addition__Group_1__2__Impl4821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__0__Impl_in_rule__Multiplication__Group__04857 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__1_in_rule__Multiplication__Group__04860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePostfixOperators_in_rule__Multiplication__Group__0__Impl4887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__1__Impl_in_rule__Multiplication__Group__14916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__0_in_rule__Multiplication__Group__1__Impl4943 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__0__Impl_in_rule__Multiplication__Group_1__04978 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__1_in_rule__Multiplication__Group_1__04981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__1__Impl_in_rule__Multiplication__Group_1__15039 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__2_in_rule__Multiplication__Group_1__15042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Multiplication__Group_1__1__Impl5070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__2__Impl_in_rule__Multiplication__Group_1__25101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__RightAssignment_1_2_in_rule__Multiplication__Group_1__2__Impl5128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixOperators__Group__0__Impl_in_rule__PostfixOperators__Group__05164 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__PostfixOperators__Group__1_in_rule__PostfixOperators__Group__05167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_rule__PostfixOperators__Group__0__Impl5194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixOperators__Group__1__Impl_in_rule__PostfixOperators__Group__15223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixOperators__Group_1__0_in_rule__PostfixOperators__Group__1__Impl5250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixOperators__Group_1__0__Impl_in_rule__PostfixOperators__Group_1__05285 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__PostfixOperators__Group_1__1_in_rule__PostfixOperators__Group_1__05288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixOperators__Group_1__1__Impl_in_rule__PostfixOperators__Group_1__15346 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__PostfixOperators__Group_1__2_in_rule__PostfixOperators__Group_1__15349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__PostfixOperators__Group_1__1__Impl5377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixOperators__Group_1__2__Impl_in_rule__PostfixOperators__Group_1__25408 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__PostfixOperators__Group_1__3_in_rule__PostfixOperators__Group_1__25411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixOperators__IndexAssignment_1_2_in_rule__PostfixOperators__Group_1__2__Impl5438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixOperators__Group_1__3__Impl_in_rule__PostfixOperators__Group_1__35468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__PostfixOperators__Group_1__3__Impl5496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0__0__Impl_in_rule__Atomic__Group_0__05535 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0__1_in_rule__Atomic__Group_0__05538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0__1__Impl_in_rule__Atomic__Group_0__15596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__SymbolAssignment_0_1_in_rule__Atomic__Group_0__1__Impl5623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__0__Impl_in_rule__Atomic__Group_1__05657 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__1_in_rule__Atomic__Group_1__05660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__1__Impl_in_rule__Atomic__Group_1__15718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ValueAssignment_1_1_in_rule__Atomic__Group_1__1__Impl5745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2__0__Impl_in_rule__Atomic__Group_2__05779 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2__1_in_rule__Atomic__Group_2__05782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2__1__Impl_in_rule__Atomic__Group_2__15840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ValueAssignment_2_1_in_rule__Atomic__Group_2__1__Impl5867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QID__Group__0__Impl_in_rule__QID__Group__05901 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__QID__Group__1_in_rule__QID__Group__05904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QID__Group__0__Impl5931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QID__Group__1__Impl_in_rule__QID__Group__15960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QID__Group_1__0_in_rule__QID__Group__1__Impl5987 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__QID__Group_1__0__Impl_in_rule__QID__Group_1__06022 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QID__Group_1__1_in_rule__QID__Group_1__06025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__QID__Group_1__0__Impl6053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QID__Group_1__1__Impl_in_rule__QID__Group_1__16084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QID__Group_1__1__Impl6111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Model__NameAssignment_16149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_rule__Model__ElementsAssignment_26180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Assert__ExprAssignment_16211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumDecl__NameAssignment_16242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumLiteral_in_rule__EnumDecl__LiteralsAssignment_36273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumLiteral__NameAssignment_16304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__VarDecl__TypeAssignment_26335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VarDecl__NameAssignment_36366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__VarDecl__InitAssignment_4_16397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__ArrayType__BaseTypeAssignment_36428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumType__EnumRefAssignment6463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Formula__TypeAssignment_26498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Formula__NameAssignment_36529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Formula__ExprAssignment_56560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_rule__Comparison__RightAssignment_1_26591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_rule__Addition__RightAssignment_1_26622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePostfixOperators_in_rule__Multiplication__RightAssignment_1_26653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__PostfixOperators__IndexAssignment_1_26684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQID_in_rule__Atomic__SymbolAssignment_0_16719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__Atomic__ValueAssignment_1_16754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Atomic__ValueAssignment_2_16785 = new BitSet(new long[]{0x0000000000000002L});

}