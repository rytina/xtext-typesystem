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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_NUMBER", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'using'", "'.'", "'*'", "'function'", "'('", "')'", "'{'", "'}'", "','", "'return'", "';'", "'assert'", "'is'", "':'", "'enum'", "'var'", "'='", "'array'", "'['", "']'", "'int'", "'bool'", "'float'", "'string'", "'calc'", "'=='", "'+'", "'tested'"
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


    // $ANTLR start entryRuleUsing
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:89:1: entryRuleUsing : ruleUsing EOF ;
    public final void entryRuleUsing() throws RecognitionException {
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:90:1: ( ruleUsing EOF )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:91:1: ruleUsing EOF
            {
             before(grammarAccess.getUsingRule()); 
            pushFollow(FOLLOW_ruleUsing_in_entryRuleUsing121);
            ruleUsing();
            _fsp--;

             after(grammarAccess.getUsingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUsing128); 

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
    // $ANTLR end entryRuleUsing


    // $ANTLR start ruleUsing
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:98:1: ruleUsing : ( ( rule__Using__Group__0 ) ) ;
    public final void ruleUsing() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:102:2: ( ( ( rule__Using__Group__0 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:103:1: ( ( rule__Using__Group__0 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:103:1: ( ( rule__Using__Group__0 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:104:1: ( rule__Using__Group__0 )
            {
             before(grammarAccess.getUsingAccess().getGroup()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:105:1: ( rule__Using__Group__0 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:105:2: rule__Using__Group__0
            {
            pushFollow(FOLLOW_rule__Using__Group__0_in_ruleUsing154);
            rule__Using__Group__0();
            _fsp--;


            }

             after(grammarAccess.getUsingAccess().getGroup()); 

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
    // $ANTLR end ruleUsing


    // $ANTLR start entryRuleImportID
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:117:1: entryRuleImportID : ruleImportID EOF ;
    public final void entryRuleImportID() throws RecognitionException {
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:118:1: ( ruleImportID EOF )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:119:1: ruleImportID EOF
            {
             before(grammarAccess.getImportIDRule()); 
            pushFollow(FOLLOW_ruleImportID_in_entryRuleImportID181);
            ruleImportID();
            _fsp--;

             after(grammarAccess.getImportIDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportID188); 

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
    // $ANTLR end entryRuleImportID


    // $ANTLR start ruleImportID
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:126:1: ruleImportID : ( ( rule__ImportID__Group__0 ) ) ;
    public final void ruleImportID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:130:2: ( ( ( rule__ImportID__Group__0 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:131:1: ( ( rule__ImportID__Group__0 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:131:1: ( ( rule__ImportID__Group__0 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:132:1: ( rule__ImportID__Group__0 )
            {
             before(grammarAccess.getImportIDAccess().getGroup()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:133:1: ( rule__ImportID__Group__0 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:133:2: rule__ImportID__Group__0
            {
            pushFollow(FOLLOW_rule__ImportID__Group__0_in_ruleImportID214);
            rule__ImportID__Group__0();
            _fsp--;


            }

             after(grammarAccess.getImportIDAccess().getGroup()); 

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
    // $ANTLR end ruleImportID


    // $ANTLR start entryRuleElement
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:145:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:146:1: ( ruleElement EOF )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:147:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_ruleElement_in_entryRuleElement241);
            ruleElement();
            _fsp--;

             after(grammarAccess.getElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElement248); 

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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:154:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:158:2: ( ( ( rule__Element__Alternatives ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:159:1: ( ( rule__Element__Alternatives ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:159:1: ( ( rule__Element__Alternatives ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:160:1: ( rule__Element__Alternatives )
            {
             before(grammarAccess.getElementAccess().getAlternatives()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:161:1: ( rule__Element__Alternatives )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:161:2: rule__Element__Alternatives
            {
            pushFollow(FOLLOW_rule__Element__Alternatives_in_ruleElement274);
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


    // $ANTLR start entryRuleFunctionDeclaration
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:173:1: entryRuleFunctionDeclaration : ruleFunctionDeclaration EOF ;
    public final void entryRuleFunctionDeclaration() throws RecognitionException {
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:174:1: ( ruleFunctionDeclaration EOF )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:175:1: ruleFunctionDeclaration EOF
            {
             before(grammarAccess.getFunctionDeclarationRule()); 
            pushFollow(FOLLOW_ruleFunctionDeclaration_in_entryRuleFunctionDeclaration301);
            ruleFunctionDeclaration();
            _fsp--;

             after(grammarAccess.getFunctionDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionDeclaration308); 

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
    // $ANTLR end entryRuleFunctionDeclaration


    // $ANTLR start ruleFunctionDeclaration
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:182:1: ruleFunctionDeclaration : ( ( rule__FunctionDeclaration__Group__0 ) ) ;
    public final void ruleFunctionDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:186:2: ( ( ( rule__FunctionDeclaration__Group__0 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:187:1: ( ( rule__FunctionDeclaration__Group__0 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:187:1: ( ( rule__FunctionDeclaration__Group__0 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:188:1: ( rule__FunctionDeclaration__Group__0 )
            {
             before(grammarAccess.getFunctionDeclarationAccess().getGroup()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:189:1: ( rule__FunctionDeclaration__Group__0 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:189:2: rule__FunctionDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__0_in_ruleFunctionDeclaration334);
            rule__FunctionDeclaration__Group__0();
            _fsp--;


            }

             after(grammarAccess.getFunctionDeclarationAccess().getGroup()); 

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
    // $ANTLR end ruleFunctionDeclaration


    // $ANTLR start entryRuleReturn
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:201:1: entryRuleReturn : ruleReturn EOF ;
    public final void entryRuleReturn() throws RecognitionException {
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:202:1: ( ruleReturn EOF )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:203:1: ruleReturn EOF
            {
             before(grammarAccess.getReturnRule()); 
            pushFollow(FOLLOW_ruleReturn_in_entryRuleReturn361);
            ruleReturn();
            _fsp--;

             after(grammarAccess.getReturnRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReturn368); 

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
    // $ANTLR end entryRuleReturn


    // $ANTLR start ruleReturn
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:210:1: ruleReturn : ( ( rule__Return__Group__0 ) ) ;
    public final void ruleReturn() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:214:2: ( ( ( rule__Return__Group__0 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:215:1: ( ( rule__Return__Group__0 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:215:1: ( ( rule__Return__Group__0 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:216:1: ( rule__Return__Group__0 )
            {
             before(grammarAccess.getReturnAccess().getGroup()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:217:1: ( rule__Return__Group__0 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:217:2: rule__Return__Group__0
            {
            pushFollow(FOLLOW_rule__Return__Group__0_in_ruleReturn394);
            rule__Return__Group__0();
            _fsp--;


            }

             after(grammarAccess.getReturnAccess().getGroup()); 

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
    // $ANTLR end ruleReturn


    // $ANTLR start entryRuleParameter
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:229:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:230:1: ( ruleParameter EOF )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:231:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter421);
            ruleParameter();
            _fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter428); 

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
    // $ANTLR end entryRuleParameter


    // $ANTLR start ruleParameter
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:238:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:242:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:243:1: ( ( rule__Parameter__Group__0 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:243:1: ( ( rule__Parameter__Group__0 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:244:1: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:245:1: ( rule__Parameter__Group__0 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:245:2: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0_in_ruleParameter454);
            rule__Parameter__Group__0();
            _fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

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
    // $ANTLR end ruleParameter


    // $ANTLR start entryRuleAssert
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:257:1: entryRuleAssert : ruleAssert EOF ;
    public final void entryRuleAssert() throws RecognitionException {
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:258:1: ( ruleAssert EOF )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:259:1: ruleAssert EOF
            {
             before(grammarAccess.getAssertRule()); 
            pushFollow(FOLLOW_ruleAssert_in_entryRuleAssert481);
            ruleAssert();
            _fsp--;

             after(grammarAccess.getAssertRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssert488); 

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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:266:1: ruleAssert : ( ( rule__Assert__Group__0 ) ) ;
    public final void ruleAssert() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:270:2: ( ( ( rule__Assert__Group__0 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:271:1: ( ( rule__Assert__Group__0 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:271:1: ( ( rule__Assert__Group__0 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:272:1: ( rule__Assert__Group__0 )
            {
             before(grammarAccess.getAssertAccess().getGroup()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:273:1: ( rule__Assert__Group__0 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:273:2: rule__Assert__Group__0
            {
            pushFollow(FOLLOW_rule__Assert__Group__0_in_ruleAssert514);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:285:1: entryRuleEnumDecl : ruleEnumDecl EOF ;
    public final void entryRuleEnumDecl() throws RecognitionException {
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:286:1: ( ruleEnumDecl EOF )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:287:1: ruleEnumDecl EOF
            {
             before(grammarAccess.getEnumDeclRule()); 
            pushFollow(FOLLOW_ruleEnumDecl_in_entryRuleEnumDecl541);
            ruleEnumDecl();
            _fsp--;

             after(grammarAccess.getEnumDeclRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumDecl548); 

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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:294:1: ruleEnumDecl : ( ( rule__EnumDecl__Group__0 ) ) ;
    public final void ruleEnumDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:298:2: ( ( ( rule__EnumDecl__Group__0 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:299:1: ( ( rule__EnumDecl__Group__0 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:299:1: ( ( rule__EnumDecl__Group__0 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:300:1: ( rule__EnumDecl__Group__0 )
            {
             before(grammarAccess.getEnumDeclAccess().getGroup()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:301:1: ( rule__EnumDecl__Group__0 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:301:2: rule__EnumDecl__Group__0
            {
            pushFollow(FOLLOW_rule__EnumDecl__Group__0_in_ruleEnumDecl574);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:313:1: entryRuleEnumLiteral : ruleEnumLiteral EOF ;
    public final void entryRuleEnumLiteral() throws RecognitionException {
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:314:1: ( ruleEnumLiteral EOF )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:315:1: ruleEnumLiteral EOF
            {
             before(grammarAccess.getEnumLiteralRule()); 
            pushFollow(FOLLOW_ruleEnumLiteral_in_entryRuleEnumLiteral601);
            ruleEnumLiteral();
            _fsp--;

             after(grammarAccess.getEnumLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumLiteral608); 

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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:322:1: ruleEnumLiteral : ( ( rule__EnumLiteral__Group__0 ) ) ;
    public final void ruleEnumLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:326:2: ( ( ( rule__EnumLiteral__Group__0 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:327:1: ( ( rule__EnumLiteral__Group__0 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:327:1: ( ( rule__EnumLiteral__Group__0 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:328:1: ( rule__EnumLiteral__Group__0 )
            {
             before(grammarAccess.getEnumLiteralAccess().getGroup()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:329:1: ( rule__EnumLiteral__Group__0 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:329:2: rule__EnumLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__EnumLiteral__Group__0_in_ruleEnumLiteral634);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:341:1: entryRuleVarDecl : ruleVarDecl EOF ;
    public final void entryRuleVarDecl() throws RecognitionException {
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:342:1: ( ruleVarDecl EOF )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:343:1: ruleVarDecl EOF
            {
             before(grammarAccess.getVarDeclRule()); 
            pushFollow(FOLLOW_ruleVarDecl_in_entryRuleVarDecl661);
            ruleVarDecl();
            _fsp--;

             after(grammarAccess.getVarDeclRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarDecl668); 

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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:350:1: ruleVarDecl : ( ( rule__VarDecl__Group__0 ) ) ;
    public final void ruleVarDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:354:2: ( ( ( rule__VarDecl__Group__0 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:355:1: ( ( rule__VarDecl__Group__0 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:355:1: ( ( rule__VarDecl__Group__0 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:356:1: ( rule__VarDecl__Group__0 )
            {
             before(grammarAccess.getVarDeclAccess().getGroup()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:357:1: ( rule__VarDecl__Group__0 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:357:2: rule__VarDecl__Group__0
            {
            pushFollow(FOLLOW_rule__VarDecl__Group__0_in_ruleVarDecl694);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:369:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:370:1: ( ruleType EOF )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:371:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType721);
            ruleType();
            _fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType728); 

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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:378:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:382:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:383:1: ( ( rule__Type__Alternatives ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:383:1: ( ( rule__Type__Alternatives ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:384:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:385:1: ( rule__Type__Alternatives )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:385:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType754);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:397:1: entryRulePrimitiveType : rulePrimitiveType EOF ;
    public final void entryRulePrimitiveType() throws RecognitionException {
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:398:1: ( rulePrimitiveType EOF )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:399:1: rulePrimitiveType EOF
            {
             before(grammarAccess.getPrimitiveTypeRule()); 
            pushFollow(FOLLOW_rulePrimitiveType_in_entryRulePrimitiveType781);
            rulePrimitiveType();
            _fsp--;

             after(grammarAccess.getPrimitiveTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveType788); 

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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:406:1: rulePrimitiveType : ( ( rule__PrimitiveType__Alternatives ) ) ;
    public final void rulePrimitiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:410:2: ( ( ( rule__PrimitiveType__Alternatives ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:411:1: ( ( rule__PrimitiveType__Alternatives ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:411:1: ( ( rule__PrimitiveType__Alternatives ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:412:1: ( rule__PrimitiveType__Alternatives )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getAlternatives()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:413:1: ( rule__PrimitiveType__Alternatives )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:413:2: rule__PrimitiveType__Alternatives
            {
            pushFollow(FOLLOW_rule__PrimitiveType__Alternatives_in_rulePrimitiveType814);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:425:1: entryRuleArrayType : ruleArrayType EOF ;
    public final void entryRuleArrayType() throws RecognitionException {
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:426:1: ( ruleArrayType EOF )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:427:1: ruleArrayType EOF
            {
             before(grammarAccess.getArrayTypeRule()); 
            pushFollow(FOLLOW_ruleArrayType_in_entryRuleArrayType841);
            ruleArrayType();
            _fsp--;

             after(grammarAccess.getArrayTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayType848); 

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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:434:1: ruleArrayType : ( ( rule__ArrayType__Group__0 ) ) ;
    public final void ruleArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:438:2: ( ( ( rule__ArrayType__Group__0 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:439:1: ( ( rule__ArrayType__Group__0 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:439:1: ( ( rule__ArrayType__Group__0 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:440:1: ( rule__ArrayType__Group__0 )
            {
             before(grammarAccess.getArrayTypeAccess().getGroup()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:441:1: ( rule__ArrayType__Group__0 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:441:2: rule__ArrayType__Group__0
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__0_in_ruleArrayType874);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:453:1: entryRuleEnumType : ruleEnumType EOF ;
    public final void entryRuleEnumType() throws RecognitionException {
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:454:1: ( ruleEnumType EOF )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:455:1: ruleEnumType EOF
            {
             before(grammarAccess.getEnumTypeRule()); 
            pushFollow(FOLLOW_ruleEnumType_in_entryRuleEnumType901);
            ruleEnumType();
            _fsp--;

             after(grammarAccess.getEnumTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumType908); 

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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:462:1: ruleEnumType : ( ( rule__EnumType__EnumRefAssignment ) ) ;
    public final void ruleEnumType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:466:2: ( ( ( rule__EnumType__EnumRefAssignment ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:467:1: ( ( rule__EnumType__EnumRefAssignment ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:467:1: ( ( rule__EnumType__EnumRefAssignment ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:468:1: ( rule__EnumType__EnumRefAssignment )
            {
             before(grammarAccess.getEnumTypeAccess().getEnumRefAssignment()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:469:1: ( rule__EnumType__EnumRefAssignment )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:469:2: rule__EnumType__EnumRefAssignment
            {
            pushFollow(FOLLOW_rule__EnumType__EnumRefAssignment_in_ruleEnumType934);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:481:1: entryRuleIntType : ruleIntType EOF ;
    public final void entryRuleIntType() throws RecognitionException {
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:482:1: ( ruleIntType EOF )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:483:1: ruleIntType EOF
            {
             before(grammarAccess.getIntTypeRule()); 
            pushFollow(FOLLOW_ruleIntType_in_entryRuleIntType961);
            ruleIntType();
            _fsp--;

             after(grammarAccess.getIntTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntType968); 

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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:490:1: ruleIntType : ( ( rule__IntType__Group__0 ) ) ;
    public final void ruleIntType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:494:2: ( ( ( rule__IntType__Group__0 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:495:1: ( ( rule__IntType__Group__0 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:495:1: ( ( rule__IntType__Group__0 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:496:1: ( rule__IntType__Group__0 )
            {
             before(grammarAccess.getIntTypeAccess().getGroup()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:497:1: ( rule__IntType__Group__0 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:497:2: rule__IntType__Group__0
            {
            pushFollow(FOLLOW_rule__IntType__Group__0_in_ruleIntType994);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:509:1: entryRuleBoolType : ruleBoolType EOF ;
    public final void entryRuleBoolType() throws RecognitionException {
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:510:1: ( ruleBoolType EOF )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:511:1: ruleBoolType EOF
            {
             before(grammarAccess.getBoolTypeRule()); 
            pushFollow(FOLLOW_ruleBoolType_in_entryRuleBoolType1021);
            ruleBoolType();
            _fsp--;

             after(grammarAccess.getBoolTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolType1028); 

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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:518:1: ruleBoolType : ( ( rule__BoolType__Group__0 ) ) ;
    public final void ruleBoolType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:522:2: ( ( ( rule__BoolType__Group__0 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:523:1: ( ( rule__BoolType__Group__0 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:523:1: ( ( rule__BoolType__Group__0 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:524:1: ( rule__BoolType__Group__0 )
            {
             before(grammarAccess.getBoolTypeAccess().getGroup()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:525:1: ( rule__BoolType__Group__0 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:525:2: rule__BoolType__Group__0
            {
            pushFollow(FOLLOW_rule__BoolType__Group__0_in_ruleBoolType1054);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:537:1: entryRuleFloatType : ruleFloatType EOF ;
    public final void entryRuleFloatType() throws RecognitionException {
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:538:1: ( ruleFloatType EOF )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:539:1: ruleFloatType EOF
            {
             before(grammarAccess.getFloatTypeRule()); 
            pushFollow(FOLLOW_ruleFloatType_in_entryRuleFloatType1081);
            ruleFloatType();
            _fsp--;

             after(grammarAccess.getFloatTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatType1088); 

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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:546:1: ruleFloatType : ( ( rule__FloatType__Group__0 ) ) ;
    public final void ruleFloatType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:550:2: ( ( ( rule__FloatType__Group__0 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:551:1: ( ( rule__FloatType__Group__0 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:551:1: ( ( rule__FloatType__Group__0 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:552:1: ( rule__FloatType__Group__0 )
            {
             before(grammarAccess.getFloatTypeAccess().getGroup()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:553:1: ( rule__FloatType__Group__0 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:553:2: rule__FloatType__Group__0
            {
            pushFollow(FOLLOW_rule__FloatType__Group__0_in_ruleFloatType1114);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:565:1: entryRuleStringType : ruleStringType EOF ;
    public final void entryRuleStringType() throws RecognitionException {
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:566:1: ( ruleStringType EOF )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:567:1: ruleStringType EOF
            {
             before(grammarAccess.getStringTypeRule()); 
            pushFollow(FOLLOW_ruleStringType_in_entryRuleStringType1141);
            ruleStringType();
            _fsp--;

             after(grammarAccess.getStringTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringType1148); 

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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:574:1: ruleStringType : ( ( rule__StringType__Group__0 ) ) ;
    public final void ruleStringType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:578:2: ( ( ( rule__StringType__Group__0 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:579:1: ( ( rule__StringType__Group__0 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:579:1: ( ( rule__StringType__Group__0 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:580:1: ( rule__StringType__Group__0 )
            {
             before(grammarAccess.getStringTypeAccess().getGroup()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:581:1: ( rule__StringType__Group__0 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:581:2: rule__StringType__Group__0
            {
            pushFollow(FOLLOW_rule__StringType__Group__0_in_ruleStringType1174);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:593:1: entryRuleFormula : ruleFormula EOF ;
    public final void entryRuleFormula() throws RecognitionException {
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:594:1: ( ruleFormula EOF )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:595:1: ruleFormula EOF
            {
             before(grammarAccess.getFormulaRule()); 
            pushFollow(FOLLOW_ruleFormula_in_entryRuleFormula1201);
            ruleFormula();
            _fsp--;

             after(grammarAccess.getFormulaRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormula1208); 

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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:602:1: ruleFormula : ( ( rule__Formula__Group__0 ) ) ;
    public final void ruleFormula() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:606:2: ( ( ( rule__Formula__Group__0 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:607:1: ( ( rule__Formula__Group__0 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:607:1: ( ( rule__Formula__Group__0 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:608:1: ( rule__Formula__Group__0 )
            {
             before(grammarAccess.getFormulaAccess().getGroup()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:609:1: ( rule__Formula__Group__0 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:609:2: rule__Formula__Group__0
            {
            pushFollow(FOLLOW_rule__Formula__Group__0_in_ruleFormula1234);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:621:1: entryRuleExpr : ruleExpr EOF ;
    public final void entryRuleExpr() throws RecognitionException {
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:622:1: ( ruleExpr EOF )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:623:1: ruleExpr EOF
            {
             before(grammarAccess.getExprRule()); 
            pushFollow(FOLLOW_ruleExpr_in_entryRuleExpr1261);
            ruleExpr();
            _fsp--;

             after(grammarAccess.getExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpr1268); 

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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:630:1: ruleExpr : ( ruleComparison ) ;
    public final void ruleExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:634:2: ( ( ruleComparison ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:635:1: ( ruleComparison )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:635:1: ( ruleComparison )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:636:1: ruleComparison
            {
             before(grammarAccess.getExprAccess().getComparisonParserRuleCall()); 
            pushFollow(FOLLOW_ruleComparison_in_ruleExpr1294);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:649:1: entryRuleComparison : ruleComparison EOF ;
    public final void entryRuleComparison() throws RecognitionException {
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:650:1: ( ruleComparison EOF )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:651:1: ruleComparison EOF
            {
             before(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_ruleComparison_in_entryRuleComparison1320);
            ruleComparison();
            _fsp--;

             after(grammarAccess.getComparisonRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparison1327); 

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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:658:1: ruleComparison : ( ( rule__Comparison__Group__0 ) ) ;
    public final void ruleComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:662:2: ( ( ( rule__Comparison__Group__0 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:663:1: ( ( rule__Comparison__Group__0 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:663:1: ( ( rule__Comparison__Group__0 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:664:1: ( rule__Comparison__Group__0 )
            {
             before(grammarAccess.getComparisonAccess().getGroup()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:665:1: ( rule__Comparison__Group__0 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:665:2: rule__Comparison__Group__0
            {
            pushFollow(FOLLOW_rule__Comparison__Group__0_in_ruleComparison1353);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:677:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:678:1: ( ruleAddition EOF )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:679:1: ruleAddition EOF
            {
             before(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_ruleAddition_in_entryRuleAddition1380);
            ruleAddition();
            _fsp--;

             after(grammarAccess.getAdditionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddition1387); 

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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:686:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:690:2: ( ( ( rule__Addition__Group__0 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:691:1: ( ( rule__Addition__Group__0 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:691:1: ( ( rule__Addition__Group__0 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:692:1: ( rule__Addition__Group__0 )
            {
             before(grammarAccess.getAdditionAccess().getGroup()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:693:1: ( rule__Addition__Group__0 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:693:2: rule__Addition__Group__0
            {
            pushFollow(FOLLOW_rule__Addition__Group__0_in_ruleAddition1413);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:705:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:706:1: ( ruleMultiplication EOF )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:707:1: ruleMultiplication EOF
            {
             before(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_ruleMultiplication_in_entryRuleMultiplication1440);
            ruleMultiplication();
            _fsp--;

             after(grammarAccess.getMultiplicationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplication1447); 

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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:714:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:718:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:719:1: ( ( rule__Multiplication__Group__0 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:719:1: ( ( rule__Multiplication__Group__0 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:720:1: ( rule__Multiplication__Group__0 )
            {
             before(grammarAccess.getMultiplicationAccess().getGroup()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:721:1: ( rule__Multiplication__Group__0 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:721:2: rule__Multiplication__Group__0
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__0_in_ruleMultiplication1473);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:733:1: entryRulePostfixOperators : rulePostfixOperators EOF ;
    public final void entryRulePostfixOperators() throws RecognitionException {
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:734:1: ( rulePostfixOperators EOF )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:735:1: rulePostfixOperators EOF
            {
             before(grammarAccess.getPostfixOperatorsRule()); 
            pushFollow(FOLLOW_rulePostfixOperators_in_entryRulePostfixOperators1500);
            rulePostfixOperators();
            _fsp--;

             after(grammarAccess.getPostfixOperatorsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePostfixOperators1507); 

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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:742:1: rulePostfixOperators : ( ( rule__PostfixOperators__Group__0 ) ) ;
    public final void rulePostfixOperators() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:746:2: ( ( ( rule__PostfixOperators__Group__0 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:747:1: ( ( rule__PostfixOperators__Group__0 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:747:1: ( ( rule__PostfixOperators__Group__0 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:748:1: ( rule__PostfixOperators__Group__0 )
            {
             before(grammarAccess.getPostfixOperatorsAccess().getGroup()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:749:1: ( rule__PostfixOperators__Group__0 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:749:2: rule__PostfixOperators__Group__0
            {
            pushFollow(FOLLOW_rule__PostfixOperators__Group__0_in_rulePostfixOperators1533);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:761:1: entryRuleAtomic : ruleAtomic EOF ;
    public final void entryRuleAtomic() throws RecognitionException {
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:762:1: ( ruleAtomic EOF )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:763:1: ruleAtomic EOF
            {
             before(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_ruleAtomic_in_entryRuleAtomic1560);
            ruleAtomic();
            _fsp--;

             after(grammarAccess.getAtomicRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomic1567); 

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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:770:1: ruleAtomic : ( ( rule__Atomic__Alternatives ) ) ;
    public final void ruleAtomic() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:774:2: ( ( ( rule__Atomic__Alternatives ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:775:1: ( ( rule__Atomic__Alternatives ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:775:1: ( ( rule__Atomic__Alternatives ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:776:1: ( rule__Atomic__Alternatives )
            {
             before(grammarAccess.getAtomicAccess().getAlternatives()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:777:1: ( rule__Atomic__Alternatives )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:777:2: rule__Atomic__Alternatives
            {
            pushFollow(FOLLOW_rule__Atomic__Alternatives_in_ruleAtomic1593);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:789:1: entryRuleQID : ruleQID EOF ;
    public final void entryRuleQID() throws RecognitionException {
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:790:1: ( ruleQID EOF )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:791:1: ruleQID EOF
            {
             before(grammarAccess.getQIDRule()); 
            pushFollow(FOLLOW_ruleQID_in_entryRuleQID1620);
            ruleQID();
            _fsp--;

             after(grammarAccess.getQIDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQID1627); 

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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:798:1: ruleQID : ( ( rule__QID__Group__0 ) ) ;
    public final void ruleQID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:802:2: ( ( ( rule__QID__Group__0 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:803:1: ( ( rule__QID__Group__0 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:803:1: ( ( rule__QID__Group__0 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:804:1: ( rule__QID__Group__0 )
            {
             before(grammarAccess.getQIDAccess().getGroup()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:805:1: ( rule__QID__Group__0 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:805:2: rule__QID__Group__0
            {
            pushFollow(FOLLOW_rule__QID__Group__0_in_ruleQID1653);
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


    // $ANTLR start rule__Model__Alternatives_4
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:817:1: rule__Model__Alternatives_4 : ( ( ( rule__Model__ElementsAssignment_4_0 ) ) | ( ( rule__Model__FunctionsAssignment_4_1 ) ) );
    public final void rule__Model__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:821:1: ( ( ( rule__Model__ElementsAssignment_4_0 ) ) | ( ( rule__Model__FunctionsAssignment_4_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==22||LA1_0==24||(LA1_0>=27 && LA1_0<=28)||LA1_0==37) ) {
                alt1=1;
            }
            else if ( (LA1_0==16) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("817:1: rule__Model__Alternatives_4 : ( ( ( rule__Model__ElementsAssignment_4_0 ) ) | ( ( rule__Model__FunctionsAssignment_4_1 ) ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:822:1: ( ( rule__Model__ElementsAssignment_4_0 ) )
                    {
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:822:1: ( ( rule__Model__ElementsAssignment_4_0 ) )
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:823:1: ( rule__Model__ElementsAssignment_4_0 )
                    {
                     before(grammarAccess.getModelAccess().getElementsAssignment_4_0()); 
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:824:1: ( rule__Model__ElementsAssignment_4_0 )
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:824:2: rule__Model__ElementsAssignment_4_0
                    {
                    pushFollow(FOLLOW_rule__Model__ElementsAssignment_4_0_in_rule__Model__Alternatives_41689);
                    rule__Model__ElementsAssignment_4_0();
                    _fsp--;


                    }

                     after(grammarAccess.getModelAccess().getElementsAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:828:6: ( ( rule__Model__FunctionsAssignment_4_1 ) )
                    {
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:828:6: ( ( rule__Model__FunctionsAssignment_4_1 ) )
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:829:1: ( rule__Model__FunctionsAssignment_4_1 )
                    {
                     before(grammarAccess.getModelAccess().getFunctionsAssignment_4_1()); 
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:830:1: ( rule__Model__FunctionsAssignment_4_1 )
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:830:2: rule__Model__FunctionsAssignment_4_1
                    {
                    pushFollow(FOLLOW_rule__Model__FunctionsAssignment_4_1_in_rule__Model__Alternatives_41707);
                    rule__Model__FunctionsAssignment_4_1();
                    _fsp--;


                    }

                     after(grammarAccess.getModelAccess().getFunctionsAssignment_4_1()); 

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
    // $ANTLR end rule__Model__Alternatives_4


    // $ANTLR start rule__Element__Alternatives
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:839:1: rule__Element__Alternatives : ( ( ruleVarDecl ) | ( ruleFormula ) | ( ruleEnumDecl ) | ( ruleAssert ) | ( ruleReturn ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:843:1: ( ( ruleVarDecl ) | ( ruleFormula ) | ( ruleEnumDecl ) | ( ruleAssert ) | ( ruleReturn ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt2=1;
                }
                break;
            case 37:
                {
                alt2=2;
                }
                break;
            case 27:
                {
                alt2=3;
                }
                break;
            case 24:
                {
                alt2=4;
                }
                break;
            case 22:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("839:1: rule__Element__Alternatives : ( ( ruleVarDecl ) | ( ruleFormula ) | ( ruleEnumDecl ) | ( ruleAssert ) | ( ruleReturn ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:844:1: ( ruleVarDecl )
                    {
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:844:1: ( ruleVarDecl )
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:845:1: ruleVarDecl
                    {
                     before(grammarAccess.getElementAccess().getVarDeclParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleVarDecl_in_rule__Element__Alternatives1740);
                    ruleVarDecl();
                    _fsp--;

                     after(grammarAccess.getElementAccess().getVarDeclParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:850:6: ( ruleFormula )
                    {
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:850:6: ( ruleFormula )
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:851:1: ruleFormula
                    {
                     before(grammarAccess.getElementAccess().getFormulaParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleFormula_in_rule__Element__Alternatives1757);
                    ruleFormula();
                    _fsp--;

                     after(grammarAccess.getElementAccess().getFormulaParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:856:6: ( ruleEnumDecl )
                    {
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:856:6: ( ruleEnumDecl )
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:857:1: ruleEnumDecl
                    {
                     before(grammarAccess.getElementAccess().getEnumDeclParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleEnumDecl_in_rule__Element__Alternatives1774);
                    ruleEnumDecl();
                    _fsp--;

                     after(grammarAccess.getElementAccess().getEnumDeclParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:862:6: ( ruleAssert )
                    {
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:862:6: ( ruleAssert )
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:863:1: ruleAssert
                    {
                     before(grammarAccess.getElementAccess().getAssertParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleAssert_in_rule__Element__Alternatives1791);
                    ruleAssert();
                    _fsp--;

                     after(grammarAccess.getElementAccess().getAssertParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:868:6: ( ruleReturn )
                    {
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:868:6: ( ruleReturn )
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:869:1: ruleReturn
                    {
                     before(grammarAccess.getElementAccess().getReturnParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleReturn_in_rule__Element__Alternatives1808);
                    ruleReturn();
                    _fsp--;

                     after(grammarAccess.getElementAccess().getReturnParserRuleCall_4()); 

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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:879:1: rule__Type__Alternatives : ( ( rulePrimitiveType ) | ( ruleArrayType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:883:1: ( ( rulePrimitiveType ) | ( ruleArrayType ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID||(LA3_0>=33 && LA3_0<=36)) ) {
                alt3=1;
            }
            else if ( (LA3_0==30) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("879:1: rule__Type__Alternatives : ( ( rulePrimitiveType ) | ( ruleArrayType ) );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:884:1: ( rulePrimitiveType )
                    {
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:884:1: ( rulePrimitiveType )
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:885:1: rulePrimitiveType
                    {
                     before(grammarAccess.getTypeAccess().getPrimitiveTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulePrimitiveType_in_rule__Type__Alternatives1840);
                    rulePrimitiveType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getPrimitiveTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:890:6: ( ruleArrayType )
                    {
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:890:6: ( ruleArrayType )
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:891:1: ruleArrayType
                    {
                     before(grammarAccess.getTypeAccess().getArrayTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleArrayType_in_rule__Type__Alternatives1857);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:901:1: rule__PrimitiveType__Alternatives : ( ( ruleIntType ) | ( ruleBoolType ) | ( ruleFloatType ) | ( ruleEnumType ) | ( ruleStringType ) );
    public final void rule__PrimitiveType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:905:1: ( ( ruleIntType ) | ( ruleBoolType ) | ( ruleFloatType ) | ( ruleEnumType ) | ( ruleStringType ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt4=1;
                }
                break;
            case 34:
                {
                alt4=2;
                }
                break;
            case 35:
                {
                alt4=3;
                }
                break;
            case RULE_ID:
                {
                alt4=4;
                }
                break;
            case 36:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("901:1: rule__PrimitiveType__Alternatives : ( ( ruleIntType ) | ( ruleBoolType ) | ( ruleFloatType ) | ( ruleEnumType ) | ( ruleStringType ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:906:1: ( ruleIntType )
                    {
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:906:1: ( ruleIntType )
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:907:1: ruleIntType
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getIntTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleIntType_in_rule__PrimitiveType__Alternatives1889);
                    ruleIntType();
                    _fsp--;

                     after(grammarAccess.getPrimitiveTypeAccess().getIntTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:912:6: ( ruleBoolType )
                    {
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:912:6: ( ruleBoolType )
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:913:1: ruleBoolType
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getBoolTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleBoolType_in_rule__PrimitiveType__Alternatives1906);
                    ruleBoolType();
                    _fsp--;

                     after(grammarAccess.getPrimitiveTypeAccess().getBoolTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:918:6: ( ruleFloatType )
                    {
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:918:6: ( ruleFloatType )
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:919:1: ruleFloatType
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getFloatTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleFloatType_in_rule__PrimitiveType__Alternatives1923);
                    ruleFloatType();
                    _fsp--;

                     after(grammarAccess.getPrimitiveTypeAccess().getFloatTypeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:924:6: ( ruleEnumType )
                    {
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:924:6: ( ruleEnumType )
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:925:1: ruleEnumType
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getEnumTypeParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleEnumType_in_rule__PrimitiveType__Alternatives1940);
                    ruleEnumType();
                    _fsp--;

                     after(grammarAccess.getPrimitiveTypeAccess().getEnumTypeParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:930:6: ( ruleStringType )
                    {
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:930:6: ( ruleStringType )
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:931:1: ruleStringType
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getStringTypeParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleStringType_in_rule__PrimitiveType__Alternatives1957);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:941:1: rule__Atomic__Alternatives : ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) );
    public final void rule__Atomic__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:945:1: ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt5=1;
                }
                break;
            case RULE_NUMBER:
                {
                alt5=2;
                }
                break;
            case RULE_STRING:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("941:1: rule__Atomic__Alternatives : ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) );", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:946:1: ( ( rule__Atomic__Group_0__0 ) )
                    {
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:946:1: ( ( rule__Atomic__Group_0__0 ) )
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:947:1: ( rule__Atomic__Group_0__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_0()); 
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:948:1: ( rule__Atomic__Group_0__0 )
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:948:2: rule__Atomic__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_0__0_in_rule__Atomic__Alternatives1989);
                    rule__Atomic__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:952:6: ( ( rule__Atomic__Group_1__0 ) )
                    {
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:952:6: ( ( rule__Atomic__Group_1__0 ) )
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:953:1: ( rule__Atomic__Group_1__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_1()); 
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:954:1: ( rule__Atomic__Group_1__0 )
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:954:2: rule__Atomic__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_1__0_in_rule__Atomic__Alternatives2007);
                    rule__Atomic__Group_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:958:6: ( ( rule__Atomic__Group_2__0 ) )
                    {
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:958:6: ( ( rule__Atomic__Group_2__0 ) )
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:959:1: ( rule__Atomic__Group_2__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_2()); 
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:960:1: ( rule__Atomic__Group_2__0 )
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:960:2: rule__Atomic__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_2__0_in_rule__Atomic__Alternatives2025);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:971:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:975:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:976:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02056);
            rule__Model__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02059);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:983:1: rule__Model__Group__0__Impl : ( ( rule__Model__IsTestedAssignment_0 )? ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:987:1: ( ( ( rule__Model__IsTestedAssignment_0 )? ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:988:1: ( ( rule__Model__IsTestedAssignment_0 )? )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:988:1: ( ( rule__Model__IsTestedAssignment_0 )? )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:989:1: ( rule__Model__IsTestedAssignment_0 )?
            {
             before(grammarAccess.getModelAccess().getIsTestedAssignment_0()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:990:1: ( rule__Model__IsTestedAssignment_0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==40) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:990:2: rule__Model__IsTestedAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Model__IsTestedAssignment_0_in_rule__Model__Group__0__Impl2086);
                    rule__Model__IsTestedAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getIsTestedAssignment_0()); 

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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1000:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1004:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1005:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12117);
            rule__Model__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__12120);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1012:1: rule__Model__Group__1__Impl : ( 'model' ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1016:1: ( ( 'model' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1017:1: ( 'model' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1017:1: ( 'model' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1018:1: 'model'
            {
             before(grammarAccess.getModelAccess().getModelKeyword_1()); 
            match(input,12,FOLLOW_12_in_rule__Model__Group__1__Impl2148); 
             after(grammarAccess.getModelAccess().getModelKeyword_1()); 

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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1031:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1035:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1036:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__22179);
            rule__Model__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__22182);
            rule__Model__Group__3();
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1043:1: rule__Model__Group__2__Impl : ( ( rule__Model__NameAssignment_2 ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1047:1: ( ( ( rule__Model__NameAssignment_2 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1048:1: ( ( rule__Model__NameAssignment_2 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1048:1: ( ( rule__Model__NameAssignment_2 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1049:1: ( rule__Model__NameAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_2()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1050:1: ( rule__Model__NameAssignment_2 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1050:2: rule__Model__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Model__NameAssignment_2_in_rule__Model__Group__2__Impl2209);
            rule__Model__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getModelAccess().getNameAssignment_2()); 

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


    // $ANTLR start rule__Model__Group__3
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1060:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1064:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1065:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__32239);
            rule__Model__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Model__Group__4_in_rule__Model__Group__32242);
            rule__Model__Group__4();
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
    // $ANTLR end rule__Model__Group__3


    // $ANTLR start rule__Model__Group__3__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1072:1: rule__Model__Group__3__Impl : ( ( rule__Model__UsingsAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1076:1: ( ( ( rule__Model__UsingsAssignment_3 )* ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1077:1: ( ( rule__Model__UsingsAssignment_3 )* )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1077:1: ( ( rule__Model__UsingsAssignment_3 )* )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1078:1: ( rule__Model__UsingsAssignment_3 )*
            {
             before(grammarAccess.getModelAccess().getUsingsAssignment_3()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1079:1: ( rule__Model__UsingsAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==13) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1079:2: rule__Model__UsingsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Model__UsingsAssignment_3_in_rule__Model__Group__3__Impl2269);
            	    rule__Model__UsingsAssignment_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getUsingsAssignment_3()); 

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
    // $ANTLR end rule__Model__Group__3__Impl


    // $ANTLR start rule__Model__Group__4
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1089:1: rule__Model__Group__4 : rule__Model__Group__4__Impl ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1093:1: ( rule__Model__Group__4__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1094:2: rule__Model__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__42300);
            rule__Model__Group__4__Impl();
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
    // $ANTLR end rule__Model__Group__4


    // $ANTLR start rule__Model__Group__4__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1100:1: rule__Model__Group__4__Impl : ( ( rule__Model__Alternatives_4 )* ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1104:1: ( ( ( rule__Model__Alternatives_4 )* ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1105:1: ( ( rule__Model__Alternatives_4 )* )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1105:1: ( ( rule__Model__Alternatives_4 )* )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1106:1: ( rule__Model__Alternatives_4 )*
            {
             before(grammarAccess.getModelAccess().getAlternatives_4()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1107:1: ( rule__Model__Alternatives_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==16||LA8_0==22||LA8_0==24||(LA8_0>=27 && LA8_0<=28)||LA8_0==37) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1107:2: rule__Model__Alternatives_4
            	    {
            	    pushFollow(FOLLOW_rule__Model__Alternatives_4_in_rule__Model__Group__4__Impl2327);
            	    rule__Model__Alternatives_4();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getAlternatives_4()); 

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
    // $ANTLR end rule__Model__Group__4__Impl


    // $ANTLR start rule__Using__Group__0
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1127:1: rule__Using__Group__0 : rule__Using__Group__0__Impl rule__Using__Group__1 ;
    public final void rule__Using__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1131:1: ( rule__Using__Group__0__Impl rule__Using__Group__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1132:2: rule__Using__Group__0__Impl rule__Using__Group__1
            {
            pushFollow(FOLLOW_rule__Using__Group__0__Impl_in_rule__Using__Group__02368);
            rule__Using__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Using__Group__1_in_rule__Using__Group__02371);
            rule__Using__Group__1();
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
    // $ANTLR end rule__Using__Group__0


    // $ANTLR start rule__Using__Group__0__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1139:1: rule__Using__Group__0__Impl : ( 'using' ) ;
    public final void rule__Using__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1143:1: ( ( 'using' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1144:1: ( 'using' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1144:1: ( 'using' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1145:1: 'using'
            {
             before(grammarAccess.getUsingAccess().getUsingKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__Using__Group__0__Impl2399); 
             after(grammarAccess.getUsingAccess().getUsingKeyword_0()); 

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
    // $ANTLR end rule__Using__Group__0__Impl


    // $ANTLR start rule__Using__Group__1
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1158:1: rule__Using__Group__1 : rule__Using__Group__1__Impl ;
    public final void rule__Using__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1162:1: ( rule__Using__Group__1__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1163:2: rule__Using__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Using__Group__1__Impl_in_rule__Using__Group__12430);
            rule__Using__Group__1__Impl();
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
    // $ANTLR end rule__Using__Group__1


    // $ANTLR start rule__Using__Group__1__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1169:1: rule__Using__Group__1__Impl : ( ( rule__Using__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Using__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1173:1: ( ( ( rule__Using__ImportedNamespaceAssignment_1 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1174:1: ( ( rule__Using__ImportedNamespaceAssignment_1 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1174:1: ( ( rule__Using__ImportedNamespaceAssignment_1 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1175:1: ( rule__Using__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getUsingAccess().getImportedNamespaceAssignment_1()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1176:1: ( rule__Using__ImportedNamespaceAssignment_1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1176:2: rule__Using__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Using__ImportedNamespaceAssignment_1_in_rule__Using__Group__1__Impl2457);
            rule__Using__ImportedNamespaceAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getUsingAccess().getImportedNamespaceAssignment_1()); 

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
    // $ANTLR end rule__Using__Group__1__Impl


    // $ANTLR start rule__ImportID__Group__0
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1190:1: rule__ImportID__Group__0 : rule__ImportID__Group__0__Impl rule__ImportID__Group__1 ;
    public final void rule__ImportID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1194:1: ( rule__ImportID__Group__0__Impl rule__ImportID__Group__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1195:2: rule__ImportID__Group__0__Impl rule__ImportID__Group__1
            {
            pushFollow(FOLLOW_rule__ImportID__Group__0__Impl_in_rule__ImportID__Group__02491);
            rule__ImportID__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImportID__Group__1_in_rule__ImportID__Group__02494);
            rule__ImportID__Group__1();
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
    // $ANTLR end rule__ImportID__Group__0


    // $ANTLR start rule__ImportID__Group__0__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1202:1: rule__ImportID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__ImportID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1206:1: ( ( RULE_ID ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1207:1: ( RULE_ID )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1207:1: ( RULE_ID )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1208:1: RULE_ID
            {
             before(grammarAccess.getImportIDAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ImportID__Group__0__Impl2521); 
             after(grammarAccess.getImportIDAccess().getIDTerminalRuleCall_0()); 

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
    // $ANTLR end rule__ImportID__Group__0__Impl


    // $ANTLR start rule__ImportID__Group__1
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1219:1: rule__ImportID__Group__1 : rule__ImportID__Group__1__Impl ;
    public final void rule__ImportID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1223:1: ( rule__ImportID__Group__1__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1224:2: rule__ImportID__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ImportID__Group__1__Impl_in_rule__ImportID__Group__12550);
            rule__ImportID__Group__1__Impl();
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
    // $ANTLR end rule__ImportID__Group__1


    // $ANTLR start rule__ImportID__Group__1__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1230:1: rule__ImportID__Group__1__Impl : ( ( rule__ImportID__Group_1__0 ) ) ;
    public final void rule__ImportID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1234:1: ( ( ( rule__ImportID__Group_1__0 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1235:1: ( ( rule__ImportID__Group_1__0 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1235:1: ( ( rule__ImportID__Group_1__0 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1236:1: ( rule__ImportID__Group_1__0 )
            {
             before(grammarAccess.getImportIDAccess().getGroup_1()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1237:1: ( rule__ImportID__Group_1__0 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1237:2: rule__ImportID__Group_1__0
            {
            pushFollow(FOLLOW_rule__ImportID__Group_1__0_in_rule__ImportID__Group__1__Impl2577);
            rule__ImportID__Group_1__0();
            _fsp--;


            }

             after(grammarAccess.getImportIDAccess().getGroup_1()); 

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
    // $ANTLR end rule__ImportID__Group__1__Impl


    // $ANTLR start rule__ImportID__Group_1__0
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1251:1: rule__ImportID__Group_1__0 : rule__ImportID__Group_1__0__Impl rule__ImportID__Group_1__1 ;
    public final void rule__ImportID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1255:1: ( rule__ImportID__Group_1__0__Impl rule__ImportID__Group_1__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1256:2: rule__ImportID__Group_1__0__Impl rule__ImportID__Group_1__1
            {
            pushFollow(FOLLOW_rule__ImportID__Group_1__0__Impl_in_rule__ImportID__Group_1__02611);
            rule__ImportID__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImportID__Group_1__1_in_rule__ImportID__Group_1__02614);
            rule__ImportID__Group_1__1();
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
    // $ANTLR end rule__ImportID__Group_1__0


    // $ANTLR start rule__ImportID__Group_1__0__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1263:1: rule__ImportID__Group_1__0__Impl : ( '.' ) ;
    public final void rule__ImportID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1267:1: ( ( '.' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1268:1: ( '.' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1268:1: ( '.' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1269:1: '.'
            {
             before(grammarAccess.getImportIDAccess().getFullStopKeyword_1_0()); 
            match(input,14,FOLLOW_14_in_rule__ImportID__Group_1__0__Impl2642); 
             after(grammarAccess.getImportIDAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end rule__ImportID__Group_1__0__Impl


    // $ANTLR start rule__ImportID__Group_1__1
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1282:1: rule__ImportID__Group_1__1 : rule__ImportID__Group_1__1__Impl ;
    public final void rule__ImportID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1286:1: ( rule__ImportID__Group_1__1__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1287:2: rule__ImportID__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ImportID__Group_1__1__Impl_in_rule__ImportID__Group_1__12673);
            rule__ImportID__Group_1__1__Impl();
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
    // $ANTLR end rule__ImportID__Group_1__1


    // $ANTLR start rule__ImportID__Group_1__1__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1293:1: rule__ImportID__Group_1__1__Impl : ( '*' ) ;
    public final void rule__ImportID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1297:1: ( ( '*' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1298:1: ( '*' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1298:1: ( '*' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1299:1: '*'
            {
             before(grammarAccess.getImportIDAccess().getAsteriskKeyword_1_1()); 
            match(input,15,FOLLOW_15_in_rule__ImportID__Group_1__1__Impl2701); 
             after(grammarAccess.getImportIDAccess().getAsteriskKeyword_1_1()); 

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
    // $ANTLR end rule__ImportID__Group_1__1__Impl


    // $ANTLR start rule__FunctionDeclaration__Group__0
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1316:1: rule__FunctionDeclaration__Group__0 : rule__FunctionDeclaration__Group__0__Impl rule__FunctionDeclaration__Group__1 ;
    public final void rule__FunctionDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1320:1: ( rule__FunctionDeclaration__Group__0__Impl rule__FunctionDeclaration__Group__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1321:2: rule__FunctionDeclaration__Group__0__Impl rule__FunctionDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__0__Impl_in_rule__FunctionDeclaration__Group__02736);
            rule__FunctionDeclaration__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__1_in_rule__FunctionDeclaration__Group__02739);
            rule__FunctionDeclaration__Group__1();
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
    // $ANTLR end rule__FunctionDeclaration__Group__0


    // $ANTLR start rule__FunctionDeclaration__Group__0__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1328:1: rule__FunctionDeclaration__Group__0__Impl : ( () ) ;
    public final void rule__FunctionDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1332:1: ( ( () ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1333:1: ( () )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1333:1: ( () )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1334:1: ()
            {
             before(grammarAccess.getFunctionDeclarationAccess().getFunctionDeclarationAction_0()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1335:1: ()
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1337:1: 
            {
            }

             after(grammarAccess.getFunctionDeclarationAccess().getFunctionDeclarationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionDeclaration__Group__0__Impl


    // $ANTLR start rule__FunctionDeclaration__Group__1
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1347:1: rule__FunctionDeclaration__Group__1 : rule__FunctionDeclaration__Group__1__Impl rule__FunctionDeclaration__Group__2 ;
    public final void rule__FunctionDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1351:1: ( rule__FunctionDeclaration__Group__1__Impl rule__FunctionDeclaration__Group__2 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1352:2: rule__FunctionDeclaration__Group__1__Impl rule__FunctionDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__1__Impl_in_rule__FunctionDeclaration__Group__12797);
            rule__FunctionDeclaration__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__2_in_rule__FunctionDeclaration__Group__12800);
            rule__FunctionDeclaration__Group__2();
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
    // $ANTLR end rule__FunctionDeclaration__Group__1


    // $ANTLR start rule__FunctionDeclaration__Group__1__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1359:1: rule__FunctionDeclaration__Group__1__Impl : ( 'function' ) ;
    public final void rule__FunctionDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1363:1: ( ( 'function' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1364:1: ( 'function' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1364:1: ( 'function' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1365:1: 'function'
            {
             before(grammarAccess.getFunctionDeclarationAccess().getFunctionKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__FunctionDeclaration__Group__1__Impl2828); 
             after(grammarAccess.getFunctionDeclarationAccess().getFunctionKeyword_1()); 

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
    // $ANTLR end rule__FunctionDeclaration__Group__1__Impl


    // $ANTLR start rule__FunctionDeclaration__Group__2
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1378:1: rule__FunctionDeclaration__Group__2 : rule__FunctionDeclaration__Group__2__Impl rule__FunctionDeclaration__Group__3 ;
    public final void rule__FunctionDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1382:1: ( rule__FunctionDeclaration__Group__2__Impl rule__FunctionDeclaration__Group__3 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1383:2: rule__FunctionDeclaration__Group__2__Impl rule__FunctionDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__2__Impl_in_rule__FunctionDeclaration__Group__22859);
            rule__FunctionDeclaration__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__3_in_rule__FunctionDeclaration__Group__22862);
            rule__FunctionDeclaration__Group__3();
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
    // $ANTLR end rule__FunctionDeclaration__Group__2


    // $ANTLR start rule__FunctionDeclaration__Group__2__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1390:1: rule__FunctionDeclaration__Group__2__Impl : ( ( rule__FunctionDeclaration__TypeAssignment_2 ) ) ;
    public final void rule__FunctionDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1394:1: ( ( ( rule__FunctionDeclaration__TypeAssignment_2 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1395:1: ( ( rule__FunctionDeclaration__TypeAssignment_2 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1395:1: ( ( rule__FunctionDeclaration__TypeAssignment_2 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1396:1: ( rule__FunctionDeclaration__TypeAssignment_2 )
            {
             before(grammarAccess.getFunctionDeclarationAccess().getTypeAssignment_2()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1397:1: ( rule__FunctionDeclaration__TypeAssignment_2 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1397:2: rule__FunctionDeclaration__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__TypeAssignment_2_in_rule__FunctionDeclaration__Group__2__Impl2889);
            rule__FunctionDeclaration__TypeAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getFunctionDeclarationAccess().getTypeAssignment_2()); 

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
    // $ANTLR end rule__FunctionDeclaration__Group__2__Impl


    // $ANTLR start rule__FunctionDeclaration__Group__3
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1407:1: rule__FunctionDeclaration__Group__3 : rule__FunctionDeclaration__Group__3__Impl rule__FunctionDeclaration__Group__4 ;
    public final void rule__FunctionDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1411:1: ( rule__FunctionDeclaration__Group__3__Impl rule__FunctionDeclaration__Group__4 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1412:2: rule__FunctionDeclaration__Group__3__Impl rule__FunctionDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__3__Impl_in_rule__FunctionDeclaration__Group__32919);
            rule__FunctionDeclaration__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__4_in_rule__FunctionDeclaration__Group__32922);
            rule__FunctionDeclaration__Group__4();
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
    // $ANTLR end rule__FunctionDeclaration__Group__3


    // $ANTLR start rule__FunctionDeclaration__Group__3__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1419:1: rule__FunctionDeclaration__Group__3__Impl : ( ( rule__FunctionDeclaration__NameAssignment_3 ) ) ;
    public final void rule__FunctionDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1423:1: ( ( ( rule__FunctionDeclaration__NameAssignment_3 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1424:1: ( ( rule__FunctionDeclaration__NameAssignment_3 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1424:1: ( ( rule__FunctionDeclaration__NameAssignment_3 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1425:1: ( rule__FunctionDeclaration__NameAssignment_3 )
            {
             before(grammarAccess.getFunctionDeclarationAccess().getNameAssignment_3()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1426:1: ( rule__FunctionDeclaration__NameAssignment_3 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1426:2: rule__FunctionDeclaration__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__NameAssignment_3_in_rule__FunctionDeclaration__Group__3__Impl2949);
            rule__FunctionDeclaration__NameAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getFunctionDeclarationAccess().getNameAssignment_3()); 

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
    // $ANTLR end rule__FunctionDeclaration__Group__3__Impl


    // $ANTLR start rule__FunctionDeclaration__Group__4
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1436:1: rule__FunctionDeclaration__Group__4 : rule__FunctionDeclaration__Group__4__Impl rule__FunctionDeclaration__Group__5 ;
    public final void rule__FunctionDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1440:1: ( rule__FunctionDeclaration__Group__4__Impl rule__FunctionDeclaration__Group__5 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1441:2: rule__FunctionDeclaration__Group__4__Impl rule__FunctionDeclaration__Group__5
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__4__Impl_in_rule__FunctionDeclaration__Group__42979);
            rule__FunctionDeclaration__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__5_in_rule__FunctionDeclaration__Group__42982);
            rule__FunctionDeclaration__Group__5();
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
    // $ANTLR end rule__FunctionDeclaration__Group__4


    // $ANTLR start rule__FunctionDeclaration__Group__4__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1448:1: rule__FunctionDeclaration__Group__4__Impl : ( '(' ) ;
    public final void rule__FunctionDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1452:1: ( ( '(' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1453:1: ( '(' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1453:1: ( '(' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1454:1: '('
            {
             before(grammarAccess.getFunctionDeclarationAccess().getLeftParenthesisKeyword_4()); 
            match(input,17,FOLLOW_17_in_rule__FunctionDeclaration__Group__4__Impl3010); 
             after(grammarAccess.getFunctionDeclarationAccess().getLeftParenthesisKeyword_4()); 

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
    // $ANTLR end rule__FunctionDeclaration__Group__4__Impl


    // $ANTLR start rule__FunctionDeclaration__Group__5
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1467:1: rule__FunctionDeclaration__Group__5 : rule__FunctionDeclaration__Group__5__Impl rule__FunctionDeclaration__Group__6 ;
    public final void rule__FunctionDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1471:1: ( rule__FunctionDeclaration__Group__5__Impl rule__FunctionDeclaration__Group__6 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1472:2: rule__FunctionDeclaration__Group__5__Impl rule__FunctionDeclaration__Group__6
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__5__Impl_in_rule__FunctionDeclaration__Group__53041);
            rule__FunctionDeclaration__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__6_in_rule__FunctionDeclaration__Group__53044);
            rule__FunctionDeclaration__Group__6();
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
    // $ANTLR end rule__FunctionDeclaration__Group__5


    // $ANTLR start rule__FunctionDeclaration__Group__5__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1479:1: rule__FunctionDeclaration__Group__5__Impl : ( ( rule__FunctionDeclaration__Group_5__0 )? ) ;
    public final void rule__FunctionDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1483:1: ( ( ( rule__FunctionDeclaration__Group_5__0 )? ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1484:1: ( ( rule__FunctionDeclaration__Group_5__0 )? )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1484:1: ( ( rule__FunctionDeclaration__Group_5__0 )? )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1485:1: ( rule__FunctionDeclaration__Group_5__0 )?
            {
             before(grammarAccess.getFunctionDeclarationAccess().getGroup_5()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1486:1: ( rule__FunctionDeclaration__Group_5__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID||LA9_0==30||(LA9_0>=33 && LA9_0<=36)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1486:2: rule__FunctionDeclaration__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__FunctionDeclaration__Group_5__0_in_rule__FunctionDeclaration__Group__5__Impl3071);
                    rule__FunctionDeclaration__Group_5__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionDeclarationAccess().getGroup_5()); 

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
    // $ANTLR end rule__FunctionDeclaration__Group__5__Impl


    // $ANTLR start rule__FunctionDeclaration__Group__6
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1496:1: rule__FunctionDeclaration__Group__6 : rule__FunctionDeclaration__Group__6__Impl rule__FunctionDeclaration__Group__7 ;
    public final void rule__FunctionDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1500:1: ( rule__FunctionDeclaration__Group__6__Impl rule__FunctionDeclaration__Group__7 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1501:2: rule__FunctionDeclaration__Group__6__Impl rule__FunctionDeclaration__Group__7
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__6__Impl_in_rule__FunctionDeclaration__Group__63102);
            rule__FunctionDeclaration__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__7_in_rule__FunctionDeclaration__Group__63105);
            rule__FunctionDeclaration__Group__7();
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
    // $ANTLR end rule__FunctionDeclaration__Group__6


    // $ANTLR start rule__FunctionDeclaration__Group__6__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1508:1: rule__FunctionDeclaration__Group__6__Impl : ( ')' ) ;
    public final void rule__FunctionDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1512:1: ( ( ')' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1513:1: ( ')' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1513:1: ( ')' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1514:1: ')'
            {
             before(grammarAccess.getFunctionDeclarationAccess().getRightParenthesisKeyword_6()); 
            match(input,18,FOLLOW_18_in_rule__FunctionDeclaration__Group__6__Impl3133); 
             after(grammarAccess.getFunctionDeclarationAccess().getRightParenthesisKeyword_6()); 

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
    // $ANTLR end rule__FunctionDeclaration__Group__6__Impl


    // $ANTLR start rule__FunctionDeclaration__Group__7
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1527:1: rule__FunctionDeclaration__Group__7 : rule__FunctionDeclaration__Group__7__Impl rule__FunctionDeclaration__Group__8 ;
    public final void rule__FunctionDeclaration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1531:1: ( rule__FunctionDeclaration__Group__7__Impl rule__FunctionDeclaration__Group__8 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1532:2: rule__FunctionDeclaration__Group__7__Impl rule__FunctionDeclaration__Group__8
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__7__Impl_in_rule__FunctionDeclaration__Group__73164);
            rule__FunctionDeclaration__Group__7__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__8_in_rule__FunctionDeclaration__Group__73167);
            rule__FunctionDeclaration__Group__8();
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
    // $ANTLR end rule__FunctionDeclaration__Group__7


    // $ANTLR start rule__FunctionDeclaration__Group__7__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1539:1: rule__FunctionDeclaration__Group__7__Impl : ( '{' ) ;
    public final void rule__FunctionDeclaration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1543:1: ( ( '{' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1544:1: ( '{' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1544:1: ( '{' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1545:1: '{'
            {
             before(grammarAccess.getFunctionDeclarationAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,19,FOLLOW_19_in_rule__FunctionDeclaration__Group__7__Impl3195); 
             after(grammarAccess.getFunctionDeclarationAccess().getLeftCurlyBracketKeyword_7()); 

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
    // $ANTLR end rule__FunctionDeclaration__Group__7__Impl


    // $ANTLR start rule__FunctionDeclaration__Group__8
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1558:1: rule__FunctionDeclaration__Group__8 : rule__FunctionDeclaration__Group__8__Impl rule__FunctionDeclaration__Group__9 ;
    public final void rule__FunctionDeclaration__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1562:1: ( rule__FunctionDeclaration__Group__8__Impl rule__FunctionDeclaration__Group__9 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1563:2: rule__FunctionDeclaration__Group__8__Impl rule__FunctionDeclaration__Group__9
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__8__Impl_in_rule__FunctionDeclaration__Group__83226);
            rule__FunctionDeclaration__Group__8__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__9_in_rule__FunctionDeclaration__Group__83229);
            rule__FunctionDeclaration__Group__9();
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
    // $ANTLR end rule__FunctionDeclaration__Group__8


    // $ANTLR start rule__FunctionDeclaration__Group__8__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1570:1: rule__FunctionDeclaration__Group__8__Impl : ( ( rule__FunctionDeclaration__ElementsAssignment_8 )* ) ;
    public final void rule__FunctionDeclaration__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1574:1: ( ( ( rule__FunctionDeclaration__ElementsAssignment_8 )* ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1575:1: ( ( rule__FunctionDeclaration__ElementsAssignment_8 )* )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1575:1: ( ( rule__FunctionDeclaration__ElementsAssignment_8 )* )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1576:1: ( rule__FunctionDeclaration__ElementsAssignment_8 )*
            {
             before(grammarAccess.getFunctionDeclarationAccess().getElementsAssignment_8()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1577:1: ( rule__FunctionDeclaration__ElementsAssignment_8 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==22||LA10_0==24||(LA10_0>=27 && LA10_0<=28)||LA10_0==37) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1577:2: rule__FunctionDeclaration__ElementsAssignment_8
            	    {
            	    pushFollow(FOLLOW_rule__FunctionDeclaration__ElementsAssignment_8_in_rule__FunctionDeclaration__Group__8__Impl3256);
            	    rule__FunctionDeclaration__ElementsAssignment_8();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getFunctionDeclarationAccess().getElementsAssignment_8()); 

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
    // $ANTLR end rule__FunctionDeclaration__Group__8__Impl


    // $ANTLR start rule__FunctionDeclaration__Group__9
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1587:1: rule__FunctionDeclaration__Group__9 : rule__FunctionDeclaration__Group__9__Impl ;
    public final void rule__FunctionDeclaration__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1591:1: ( rule__FunctionDeclaration__Group__9__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1592:2: rule__FunctionDeclaration__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__9__Impl_in_rule__FunctionDeclaration__Group__93287);
            rule__FunctionDeclaration__Group__9__Impl();
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
    // $ANTLR end rule__FunctionDeclaration__Group__9


    // $ANTLR start rule__FunctionDeclaration__Group__9__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1598:1: rule__FunctionDeclaration__Group__9__Impl : ( '}' ) ;
    public final void rule__FunctionDeclaration__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1602:1: ( ( '}' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1603:1: ( '}' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1603:1: ( '}' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1604:1: '}'
            {
             before(grammarAccess.getFunctionDeclarationAccess().getRightCurlyBracketKeyword_9()); 
            match(input,20,FOLLOW_20_in_rule__FunctionDeclaration__Group__9__Impl3315); 
             after(grammarAccess.getFunctionDeclarationAccess().getRightCurlyBracketKeyword_9()); 

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
    // $ANTLR end rule__FunctionDeclaration__Group__9__Impl


    // $ANTLR start rule__FunctionDeclaration__Group_5__0
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1637:1: rule__FunctionDeclaration__Group_5__0 : rule__FunctionDeclaration__Group_5__0__Impl rule__FunctionDeclaration__Group_5__1 ;
    public final void rule__FunctionDeclaration__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1641:1: ( rule__FunctionDeclaration__Group_5__0__Impl rule__FunctionDeclaration__Group_5__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1642:2: rule__FunctionDeclaration__Group_5__0__Impl rule__FunctionDeclaration__Group_5__1
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group_5__0__Impl_in_rule__FunctionDeclaration__Group_5__03366);
            rule__FunctionDeclaration__Group_5__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FunctionDeclaration__Group_5__1_in_rule__FunctionDeclaration__Group_5__03369);
            rule__FunctionDeclaration__Group_5__1();
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
    // $ANTLR end rule__FunctionDeclaration__Group_5__0


    // $ANTLR start rule__FunctionDeclaration__Group_5__0__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1649:1: rule__FunctionDeclaration__Group_5__0__Impl : ( ( rule__FunctionDeclaration__ParamsAssignment_5_0 ) ) ;
    public final void rule__FunctionDeclaration__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1653:1: ( ( ( rule__FunctionDeclaration__ParamsAssignment_5_0 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1654:1: ( ( rule__FunctionDeclaration__ParamsAssignment_5_0 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1654:1: ( ( rule__FunctionDeclaration__ParamsAssignment_5_0 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1655:1: ( rule__FunctionDeclaration__ParamsAssignment_5_0 )
            {
             before(grammarAccess.getFunctionDeclarationAccess().getParamsAssignment_5_0()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1656:1: ( rule__FunctionDeclaration__ParamsAssignment_5_0 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1656:2: rule__FunctionDeclaration__ParamsAssignment_5_0
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__ParamsAssignment_5_0_in_rule__FunctionDeclaration__Group_5__0__Impl3396);
            rule__FunctionDeclaration__ParamsAssignment_5_0();
            _fsp--;


            }

             after(grammarAccess.getFunctionDeclarationAccess().getParamsAssignment_5_0()); 

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
    // $ANTLR end rule__FunctionDeclaration__Group_5__0__Impl


    // $ANTLR start rule__FunctionDeclaration__Group_5__1
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1666:1: rule__FunctionDeclaration__Group_5__1 : rule__FunctionDeclaration__Group_5__1__Impl ;
    public final void rule__FunctionDeclaration__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1670:1: ( rule__FunctionDeclaration__Group_5__1__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1671:2: rule__FunctionDeclaration__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group_5__1__Impl_in_rule__FunctionDeclaration__Group_5__13426);
            rule__FunctionDeclaration__Group_5__1__Impl();
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
    // $ANTLR end rule__FunctionDeclaration__Group_5__1


    // $ANTLR start rule__FunctionDeclaration__Group_5__1__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1677:1: rule__FunctionDeclaration__Group_5__1__Impl : ( ( rule__FunctionDeclaration__Group_5_1__0 )* ) ;
    public final void rule__FunctionDeclaration__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1681:1: ( ( ( rule__FunctionDeclaration__Group_5_1__0 )* ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1682:1: ( ( rule__FunctionDeclaration__Group_5_1__0 )* )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1682:1: ( ( rule__FunctionDeclaration__Group_5_1__0 )* )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1683:1: ( rule__FunctionDeclaration__Group_5_1__0 )*
            {
             before(grammarAccess.getFunctionDeclarationAccess().getGroup_5_1()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1684:1: ( rule__FunctionDeclaration__Group_5_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==21) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1684:2: rule__FunctionDeclaration__Group_5_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FunctionDeclaration__Group_5_1__0_in_rule__FunctionDeclaration__Group_5__1__Impl3453);
            	    rule__FunctionDeclaration__Group_5_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getFunctionDeclarationAccess().getGroup_5_1()); 

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
    // $ANTLR end rule__FunctionDeclaration__Group_5__1__Impl


    // $ANTLR start rule__FunctionDeclaration__Group_5_1__0
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1698:1: rule__FunctionDeclaration__Group_5_1__0 : rule__FunctionDeclaration__Group_5_1__0__Impl rule__FunctionDeclaration__Group_5_1__1 ;
    public final void rule__FunctionDeclaration__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1702:1: ( rule__FunctionDeclaration__Group_5_1__0__Impl rule__FunctionDeclaration__Group_5_1__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1703:2: rule__FunctionDeclaration__Group_5_1__0__Impl rule__FunctionDeclaration__Group_5_1__1
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group_5_1__0__Impl_in_rule__FunctionDeclaration__Group_5_1__03488);
            rule__FunctionDeclaration__Group_5_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FunctionDeclaration__Group_5_1__1_in_rule__FunctionDeclaration__Group_5_1__03491);
            rule__FunctionDeclaration__Group_5_1__1();
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
    // $ANTLR end rule__FunctionDeclaration__Group_5_1__0


    // $ANTLR start rule__FunctionDeclaration__Group_5_1__0__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1710:1: rule__FunctionDeclaration__Group_5_1__0__Impl : ( ',' ) ;
    public final void rule__FunctionDeclaration__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1714:1: ( ( ',' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1715:1: ( ',' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1715:1: ( ',' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1716:1: ','
            {
             before(grammarAccess.getFunctionDeclarationAccess().getCommaKeyword_5_1_0()); 
            match(input,21,FOLLOW_21_in_rule__FunctionDeclaration__Group_5_1__0__Impl3519); 
             after(grammarAccess.getFunctionDeclarationAccess().getCommaKeyword_5_1_0()); 

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
    // $ANTLR end rule__FunctionDeclaration__Group_5_1__0__Impl


    // $ANTLR start rule__FunctionDeclaration__Group_5_1__1
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1729:1: rule__FunctionDeclaration__Group_5_1__1 : rule__FunctionDeclaration__Group_5_1__1__Impl ;
    public final void rule__FunctionDeclaration__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1733:1: ( rule__FunctionDeclaration__Group_5_1__1__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1734:2: rule__FunctionDeclaration__Group_5_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group_5_1__1__Impl_in_rule__FunctionDeclaration__Group_5_1__13550);
            rule__FunctionDeclaration__Group_5_1__1__Impl();
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
    // $ANTLR end rule__FunctionDeclaration__Group_5_1__1


    // $ANTLR start rule__FunctionDeclaration__Group_5_1__1__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1740:1: rule__FunctionDeclaration__Group_5_1__1__Impl : ( ( rule__FunctionDeclaration__ParamsAssignment_5_1_1 ) ) ;
    public final void rule__FunctionDeclaration__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1744:1: ( ( ( rule__FunctionDeclaration__ParamsAssignment_5_1_1 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1745:1: ( ( rule__FunctionDeclaration__ParamsAssignment_5_1_1 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1745:1: ( ( rule__FunctionDeclaration__ParamsAssignment_5_1_1 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1746:1: ( rule__FunctionDeclaration__ParamsAssignment_5_1_1 )
            {
             before(grammarAccess.getFunctionDeclarationAccess().getParamsAssignment_5_1_1()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1747:1: ( rule__FunctionDeclaration__ParamsAssignment_5_1_1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1747:2: rule__FunctionDeclaration__ParamsAssignment_5_1_1
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__ParamsAssignment_5_1_1_in_rule__FunctionDeclaration__Group_5_1__1__Impl3577);
            rule__FunctionDeclaration__ParamsAssignment_5_1_1();
            _fsp--;


            }

             after(grammarAccess.getFunctionDeclarationAccess().getParamsAssignment_5_1_1()); 

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
    // $ANTLR end rule__FunctionDeclaration__Group_5_1__1__Impl


    // $ANTLR start rule__Return__Group__0
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1761:1: rule__Return__Group__0 : rule__Return__Group__0__Impl rule__Return__Group__1 ;
    public final void rule__Return__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1765:1: ( rule__Return__Group__0__Impl rule__Return__Group__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1766:2: rule__Return__Group__0__Impl rule__Return__Group__1
            {
            pushFollow(FOLLOW_rule__Return__Group__0__Impl_in_rule__Return__Group__03611);
            rule__Return__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Return__Group__1_in_rule__Return__Group__03614);
            rule__Return__Group__1();
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
    // $ANTLR end rule__Return__Group__0


    // $ANTLR start rule__Return__Group__0__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1773:1: rule__Return__Group__0__Impl : ( 'return' ) ;
    public final void rule__Return__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1777:1: ( ( 'return' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1778:1: ( 'return' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1778:1: ( 'return' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1779:1: 'return'
            {
             before(grammarAccess.getReturnAccess().getReturnKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__Return__Group__0__Impl3642); 
             after(grammarAccess.getReturnAccess().getReturnKeyword_0()); 

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
    // $ANTLR end rule__Return__Group__0__Impl


    // $ANTLR start rule__Return__Group__1
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1792:1: rule__Return__Group__1 : rule__Return__Group__1__Impl rule__Return__Group__2 ;
    public final void rule__Return__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1796:1: ( rule__Return__Group__1__Impl rule__Return__Group__2 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1797:2: rule__Return__Group__1__Impl rule__Return__Group__2
            {
            pushFollow(FOLLOW_rule__Return__Group__1__Impl_in_rule__Return__Group__13673);
            rule__Return__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Return__Group__2_in_rule__Return__Group__13676);
            rule__Return__Group__2();
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
    // $ANTLR end rule__Return__Group__1


    // $ANTLR start rule__Return__Group__1__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1804:1: rule__Return__Group__1__Impl : ( ( rule__Return__ExprAssignment_1 ) ) ;
    public final void rule__Return__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1808:1: ( ( ( rule__Return__ExprAssignment_1 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1809:1: ( ( rule__Return__ExprAssignment_1 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1809:1: ( ( rule__Return__ExprAssignment_1 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1810:1: ( rule__Return__ExprAssignment_1 )
            {
             before(grammarAccess.getReturnAccess().getExprAssignment_1()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1811:1: ( rule__Return__ExprAssignment_1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1811:2: rule__Return__ExprAssignment_1
            {
            pushFollow(FOLLOW_rule__Return__ExprAssignment_1_in_rule__Return__Group__1__Impl3703);
            rule__Return__ExprAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getReturnAccess().getExprAssignment_1()); 

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
    // $ANTLR end rule__Return__Group__1__Impl


    // $ANTLR start rule__Return__Group__2
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1821:1: rule__Return__Group__2 : rule__Return__Group__2__Impl ;
    public final void rule__Return__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1825:1: ( rule__Return__Group__2__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1826:2: rule__Return__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Return__Group__2__Impl_in_rule__Return__Group__23733);
            rule__Return__Group__2__Impl();
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
    // $ANTLR end rule__Return__Group__2


    // $ANTLR start rule__Return__Group__2__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1832:1: rule__Return__Group__2__Impl : ( ';' ) ;
    public final void rule__Return__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1836:1: ( ( ';' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1837:1: ( ';' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1837:1: ( ';' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1838:1: ';'
            {
             before(grammarAccess.getReturnAccess().getSemicolonKeyword_2()); 
            match(input,23,FOLLOW_23_in_rule__Return__Group__2__Impl3761); 
             after(grammarAccess.getReturnAccess().getSemicolonKeyword_2()); 

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
    // $ANTLR end rule__Return__Group__2__Impl


    // $ANTLR start rule__Parameter__Group__0
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1857:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1861:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1862:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__03798);
            rule__Parameter__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__03801);
            rule__Parameter__Group__1();
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
    // $ANTLR end rule__Parameter__Group__0


    // $ANTLR start rule__Parameter__Group__0__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1869:1: rule__Parameter__Group__0__Impl : ( () ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1873:1: ( ( () ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1874:1: ( () )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1874:1: ( () )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1875:1: ()
            {
             before(grammarAccess.getParameterAccess().getParameterAction_0()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1876:1: ()
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1878:1: 
            {
            }

             after(grammarAccess.getParameterAccess().getParameterAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Parameter__Group__0__Impl


    // $ANTLR start rule__Parameter__Group__1
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1888:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1892:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1893:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__13859);
            rule__Parameter__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__13862);
            rule__Parameter__Group__2();
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
    // $ANTLR end rule__Parameter__Group__1


    // $ANTLR start rule__Parameter__Group__1__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1900:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__TypeAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1904:1: ( ( ( rule__Parameter__TypeAssignment_1 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1905:1: ( ( rule__Parameter__TypeAssignment_1 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1905:1: ( ( rule__Parameter__TypeAssignment_1 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1906:1: ( rule__Parameter__TypeAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_1()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1907:1: ( rule__Parameter__TypeAssignment_1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1907:2: rule__Parameter__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Parameter__TypeAssignment_1_in_rule__Parameter__Group__1__Impl3889);
            rule__Parameter__TypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getParameterAccess().getTypeAssignment_1()); 

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
    // $ANTLR end rule__Parameter__Group__1__Impl


    // $ANTLR start rule__Parameter__Group__2
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1917:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1921:1: ( rule__Parameter__Group__2__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1922:2: rule__Parameter__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__23919);
            rule__Parameter__Group__2__Impl();
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
    // $ANTLR end rule__Parameter__Group__2


    // $ANTLR start rule__Parameter__Group__2__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1928:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__NameAssignment_2 ) ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1932:1: ( ( ( rule__Parameter__NameAssignment_2 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1933:1: ( ( rule__Parameter__NameAssignment_2 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1933:1: ( ( rule__Parameter__NameAssignment_2 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1934:1: ( rule__Parameter__NameAssignment_2 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_2()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1935:1: ( rule__Parameter__NameAssignment_2 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1935:2: rule__Parameter__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Parameter__NameAssignment_2_in_rule__Parameter__Group__2__Impl3946);
            rule__Parameter__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment_2()); 

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
    // $ANTLR end rule__Parameter__Group__2__Impl


    // $ANTLR start rule__Assert__Group__0
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1951:1: rule__Assert__Group__0 : rule__Assert__Group__0__Impl rule__Assert__Group__1 ;
    public final void rule__Assert__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1955:1: ( rule__Assert__Group__0__Impl rule__Assert__Group__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1956:2: rule__Assert__Group__0__Impl rule__Assert__Group__1
            {
            pushFollow(FOLLOW_rule__Assert__Group__0__Impl_in_rule__Assert__Group__03982);
            rule__Assert__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Assert__Group__1_in_rule__Assert__Group__03985);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1963:1: rule__Assert__Group__0__Impl : ( 'assert' ) ;
    public final void rule__Assert__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1967:1: ( ( 'assert' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1968:1: ( 'assert' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1968:1: ( 'assert' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1969:1: 'assert'
            {
             before(grammarAccess.getAssertAccess().getAssertKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__Assert__Group__0__Impl4013); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1982:1: rule__Assert__Group__1 : rule__Assert__Group__1__Impl rule__Assert__Group__2 ;
    public final void rule__Assert__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1986:1: ( rule__Assert__Group__1__Impl rule__Assert__Group__2 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1987:2: rule__Assert__Group__1__Impl rule__Assert__Group__2
            {
            pushFollow(FOLLOW_rule__Assert__Group__1__Impl_in_rule__Assert__Group__14044);
            rule__Assert__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Assert__Group__2_in_rule__Assert__Group__14047);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1994:1: rule__Assert__Group__1__Impl : ( ( rule__Assert__ActualAssignment_1 ) ) ;
    public final void rule__Assert__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1998:1: ( ( ( rule__Assert__ActualAssignment_1 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1999:1: ( ( rule__Assert__ActualAssignment_1 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1999:1: ( ( rule__Assert__ActualAssignment_1 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2000:1: ( rule__Assert__ActualAssignment_1 )
            {
             before(grammarAccess.getAssertAccess().getActualAssignment_1()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2001:1: ( rule__Assert__ActualAssignment_1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2001:2: rule__Assert__ActualAssignment_1
            {
            pushFollow(FOLLOW_rule__Assert__ActualAssignment_1_in_rule__Assert__Group__1__Impl4074);
            rule__Assert__ActualAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getAssertAccess().getActualAssignment_1()); 

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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2011:1: rule__Assert__Group__2 : rule__Assert__Group__2__Impl rule__Assert__Group__3 ;
    public final void rule__Assert__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2015:1: ( rule__Assert__Group__2__Impl rule__Assert__Group__3 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2016:2: rule__Assert__Group__2__Impl rule__Assert__Group__3
            {
            pushFollow(FOLLOW_rule__Assert__Group__2__Impl_in_rule__Assert__Group__24104);
            rule__Assert__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Assert__Group__3_in_rule__Assert__Group__24107);
            rule__Assert__Group__3();
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2023:1: rule__Assert__Group__2__Impl : ( 'is' ) ;
    public final void rule__Assert__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2027:1: ( ( 'is' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2028:1: ( 'is' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2028:1: ( 'is' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2029:1: 'is'
            {
             before(grammarAccess.getAssertAccess().getIsKeyword_2()); 
            match(input,25,FOLLOW_25_in_rule__Assert__Group__2__Impl4135); 
             after(grammarAccess.getAssertAccess().getIsKeyword_2()); 

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


    // $ANTLR start rule__Assert__Group__3
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2042:1: rule__Assert__Group__3 : rule__Assert__Group__3__Impl rule__Assert__Group__4 ;
    public final void rule__Assert__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2046:1: ( rule__Assert__Group__3__Impl rule__Assert__Group__4 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2047:2: rule__Assert__Group__3__Impl rule__Assert__Group__4
            {
            pushFollow(FOLLOW_rule__Assert__Group__3__Impl_in_rule__Assert__Group__34166);
            rule__Assert__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Assert__Group__4_in_rule__Assert__Group__34169);
            rule__Assert__Group__4();
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
    // $ANTLR end rule__Assert__Group__3


    // $ANTLR start rule__Assert__Group__3__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2054:1: rule__Assert__Group__3__Impl : ( ( rule__Assert__ExpectedAssignment_3 ) ) ;
    public final void rule__Assert__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2058:1: ( ( ( rule__Assert__ExpectedAssignment_3 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2059:1: ( ( rule__Assert__ExpectedAssignment_3 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2059:1: ( ( rule__Assert__ExpectedAssignment_3 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2060:1: ( rule__Assert__ExpectedAssignment_3 )
            {
             before(grammarAccess.getAssertAccess().getExpectedAssignment_3()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2061:1: ( rule__Assert__ExpectedAssignment_3 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2061:2: rule__Assert__ExpectedAssignment_3
            {
            pushFollow(FOLLOW_rule__Assert__ExpectedAssignment_3_in_rule__Assert__Group__3__Impl4196);
            rule__Assert__ExpectedAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getAssertAccess().getExpectedAssignment_3()); 

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
    // $ANTLR end rule__Assert__Group__3__Impl


    // $ANTLR start rule__Assert__Group__4
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2071:1: rule__Assert__Group__4 : rule__Assert__Group__4__Impl ;
    public final void rule__Assert__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2075:1: ( rule__Assert__Group__4__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2076:2: rule__Assert__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Assert__Group__4__Impl_in_rule__Assert__Group__44226);
            rule__Assert__Group__4__Impl();
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
    // $ANTLR end rule__Assert__Group__4


    // $ANTLR start rule__Assert__Group__4__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2082:1: rule__Assert__Group__4__Impl : ( ( rule__Assert__Group_4__0 )? ) ;
    public final void rule__Assert__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2086:1: ( ( ( rule__Assert__Group_4__0 )? ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2087:1: ( ( rule__Assert__Group_4__0 )? )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2087:1: ( ( rule__Assert__Group_4__0 )? )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2088:1: ( rule__Assert__Group_4__0 )?
            {
             before(grammarAccess.getAssertAccess().getGroup_4()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2089:1: ( rule__Assert__Group_4__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2089:2: rule__Assert__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Assert__Group_4__0_in_rule__Assert__Group__4__Impl4253);
                    rule__Assert__Group_4__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssertAccess().getGroup_4()); 

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
    // $ANTLR end rule__Assert__Group__4__Impl


    // $ANTLR start rule__Assert__Group_4__0
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2109:1: rule__Assert__Group_4__0 : rule__Assert__Group_4__0__Impl rule__Assert__Group_4__1 ;
    public final void rule__Assert__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2113:1: ( rule__Assert__Group_4__0__Impl rule__Assert__Group_4__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2114:2: rule__Assert__Group_4__0__Impl rule__Assert__Group_4__1
            {
            pushFollow(FOLLOW_rule__Assert__Group_4__0__Impl_in_rule__Assert__Group_4__04294);
            rule__Assert__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Assert__Group_4__1_in_rule__Assert__Group_4__04297);
            rule__Assert__Group_4__1();
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
    // $ANTLR end rule__Assert__Group_4__0


    // $ANTLR start rule__Assert__Group_4__0__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2121:1: rule__Assert__Group_4__0__Impl : ( ':' ) ;
    public final void rule__Assert__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2125:1: ( ( ':' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2126:1: ( ':' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2126:1: ( ':' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2127:1: ':'
            {
             before(grammarAccess.getAssertAccess().getColonKeyword_4_0()); 
            match(input,26,FOLLOW_26_in_rule__Assert__Group_4__0__Impl4325); 
             after(grammarAccess.getAssertAccess().getColonKeyword_4_0()); 

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
    // $ANTLR end rule__Assert__Group_4__0__Impl


    // $ANTLR start rule__Assert__Group_4__1
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2140:1: rule__Assert__Group_4__1 : rule__Assert__Group_4__1__Impl ;
    public final void rule__Assert__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2144:1: ( rule__Assert__Group_4__1__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2145:2: rule__Assert__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Assert__Group_4__1__Impl_in_rule__Assert__Group_4__14356);
            rule__Assert__Group_4__1__Impl();
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
    // $ANTLR end rule__Assert__Group_4__1


    // $ANTLR start rule__Assert__Group_4__1__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2151:1: rule__Assert__Group_4__1__Impl : ( ( rule__Assert__MsgAssignment_4_1 ) ) ;
    public final void rule__Assert__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2155:1: ( ( ( rule__Assert__MsgAssignment_4_1 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2156:1: ( ( rule__Assert__MsgAssignment_4_1 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2156:1: ( ( rule__Assert__MsgAssignment_4_1 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2157:1: ( rule__Assert__MsgAssignment_4_1 )
            {
             before(grammarAccess.getAssertAccess().getMsgAssignment_4_1()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2158:1: ( rule__Assert__MsgAssignment_4_1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2158:2: rule__Assert__MsgAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Assert__MsgAssignment_4_1_in_rule__Assert__Group_4__1__Impl4383);
            rule__Assert__MsgAssignment_4_1();
            _fsp--;


            }

             after(grammarAccess.getAssertAccess().getMsgAssignment_4_1()); 

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
    // $ANTLR end rule__Assert__Group_4__1__Impl


    // $ANTLR start rule__EnumDecl__Group__0
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2172:1: rule__EnumDecl__Group__0 : rule__EnumDecl__Group__0__Impl rule__EnumDecl__Group__1 ;
    public final void rule__EnumDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2176:1: ( rule__EnumDecl__Group__0__Impl rule__EnumDecl__Group__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2177:2: rule__EnumDecl__Group__0__Impl rule__EnumDecl__Group__1
            {
            pushFollow(FOLLOW_rule__EnumDecl__Group__0__Impl_in_rule__EnumDecl__Group__04417);
            rule__EnumDecl__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EnumDecl__Group__1_in_rule__EnumDecl__Group__04420);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2184:1: rule__EnumDecl__Group__0__Impl : ( 'enum' ) ;
    public final void rule__EnumDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2188:1: ( ( 'enum' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2189:1: ( 'enum' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2189:1: ( 'enum' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2190:1: 'enum'
            {
             before(grammarAccess.getEnumDeclAccess().getEnumKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__EnumDecl__Group__0__Impl4448); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2203:1: rule__EnumDecl__Group__1 : rule__EnumDecl__Group__1__Impl rule__EnumDecl__Group__2 ;
    public final void rule__EnumDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2207:1: ( rule__EnumDecl__Group__1__Impl rule__EnumDecl__Group__2 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2208:2: rule__EnumDecl__Group__1__Impl rule__EnumDecl__Group__2
            {
            pushFollow(FOLLOW_rule__EnumDecl__Group__1__Impl_in_rule__EnumDecl__Group__14479);
            rule__EnumDecl__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EnumDecl__Group__2_in_rule__EnumDecl__Group__14482);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2215:1: rule__EnumDecl__Group__1__Impl : ( ( rule__EnumDecl__NameAssignment_1 ) ) ;
    public final void rule__EnumDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2219:1: ( ( ( rule__EnumDecl__NameAssignment_1 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2220:1: ( ( rule__EnumDecl__NameAssignment_1 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2220:1: ( ( rule__EnumDecl__NameAssignment_1 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2221:1: ( rule__EnumDecl__NameAssignment_1 )
            {
             before(grammarAccess.getEnumDeclAccess().getNameAssignment_1()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2222:1: ( rule__EnumDecl__NameAssignment_1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2222:2: rule__EnumDecl__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__EnumDecl__NameAssignment_1_in_rule__EnumDecl__Group__1__Impl4509);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2232:1: rule__EnumDecl__Group__2 : rule__EnumDecl__Group__2__Impl rule__EnumDecl__Group__3 ;
    public final void rule__EnumDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2236:1: ( rule__EnumDecl__Group__2__Impl rule__EnumDecl__Group__3 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2237:2: rule__EnumDecl__Group__2__Impl rule__EnumDecl__Group__3
            {
            pushFollow(FOLLOW_rule__EnumDecl__Group__2__Impl_in_rule__EnumDecl__Group__24539);
            rule__EnumDecl__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EnumDecl__Group__3_in_rule__EnumDecl__Group__24542);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2244:1: rule__EnumDecl__Group__2__Impl : ( '{' ) ;
    public final void rule__EnumDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2248:1: ( ( '{' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2249:1: ( '{' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2249:1: ( '{' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2250:1: '{'
            {
             before(grammarAccess.getEnumDeclAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,19,FOLLOW_19_in_rule__EnumDecl__Group__2__Impl4570); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2263:1: rule__EnumDecl__Group__3 : rule__EnumDecl__Group__3__Impl rule__EnumDecl__Group__4 ;
    public final void rule__EnumDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2267:1: ( rule__EnumDecl__Group__3__Impl rule__EnumDecl__Group__4 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2268:2: rule__EnumDecl__Group__3__Impl rule__EnumDecl__Group__4
            {
            pushFollow(FOLLOW_rule__EnumDecl__Group__3__Impl_in_rule__EnumDecl__Group__34601);
            rule__EnumDecl__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EnumDecl__Group__4_in_rule__EnumDecl__Group__34604);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2275:1: rule__EnumDecl__Group__3__Impl : ( ( rule__EnumDecl__LiteralsAssignment_3 )* ) ;
    public final void rule__EnumDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2279:1: ( ( ( rule__EnumDecl__LiteralsAssignment_3 )* ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2280:1: ( ( rule__EnumDecl__LiteralsAssignment_3 )* )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2280:1: ( ( rule__EnumDecl__LiteralsAssignment_3 )* )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2281:1: ( rule__EnumDecl__LiteralsAssignment_3 )*
            {
             before(grammarAccess.getEnumDeclAccess().getLiteralsAssignment_3()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2282:1: ( rule__EnumDecl__LiteralsAssignment_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2282:2: rule__EnumDecl__LiteralsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__EnumDecl__LiteralsAssignment_3_in_rule__EnumDecl__Group__3__Impl4631);
            	    rule__EnumDecl__LiteralsAssignment_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2292:1: rule__EnumDecl__Group__4 : rule__EnumDecl__Group__4__Impl ;
    public final void rule__EnumDecl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2296:1: ( rule__EnumDecl__Group__4__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2297:2: rule__EnumDecl__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__EnumDecl__Group__4__Impl_in_rule__EnumDecl__Group__44662);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2303:1: rule__EnumDecl__Group__4__Impl : ( '}' ) ;
    public final void rule__EnumDecl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2307:1: ( ( '}' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2308:1: ( '}' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2308:1: ( '}' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2309:1: '}'
            {
             before(grammarAccess.getEnumDeclAccess().getRightCurlyBracketKeyword_4()); 
            match(input,20,FOLLOW_20_in_rule__EnumDecl__Group__4__Impl4690); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2332:1: rule__EnumLiteral__Group__0 : rule__EnumLiteral__Group__0__Impl rule__EnumLiteral__Group__1 ;
    public final void rule__EnumLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2336:1: ( rule__EnumLiteral__Group__0__Impl rule__EnumLiteral__Group__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2337:2: rule__EnumLiteral__Group__0__Impl rule__EnumLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__EnumLiteral__Group__0__Impl_in_rule__EnumLiteral__Group__04731);
            rule__EnumLiteral__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EnumLiteral__Group__1_in_rule__EnumLiteral__Group__04734);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2344:1: rule__EnumLiteral__Group__0__Impl : ( () ) ;
    public final void rule__EnumLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2348:1: ( ( () ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2349:1: ( () )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2349:1: ( () )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2350:1: ()
            {
             before(grammarAccess.getEnumLiteralAccess().getEnumLiteralAction_0()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2351:1: ()
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2353:1: 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2363:1: rule__EnumLiteral__Group__1 : rule__EnumLiteral__Group__1__Impl ;
    public final void rule__EnumLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2367:1: ( rule__EnumLiteral__Group__1__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2368:2: rule__EnumLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumLiteral__Group__1__Impl_in_rule__EnumLiteral__Group__14792);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2374:1: rule__EnumLiteral__Group__1__Impl : ( ( rule__EnumLiteral__NameAssignment_1 ) ) ;
    public final void rule__EnumLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2378:1: ( ( ( rule__EnumLiteral__NameAssignment_1 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2379:1: ( ( rule__EnumLiteral__NameAssignment_1 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2379:1: ( ( rule__EnumLiteral__NameAssignment_1 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2380:1: ( rule__EnumLiteral__NameAssignment_1 )
            {
             before(grammarAccess.getEnumLiteralAccess().getNameAssignment_1()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2381:1: ( rule__EnumLiteral__NameAssignment_1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2381:2: rule__EnumLiteral__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__EnumLiteral__NameAssignment_1_in_rule__EnumLiteral__Group__1__Impl4819);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2395:1: rule__VarDecl__Group__0 : rule__VarDecl__Group__0__Impl rule__VarDecl__Group__1 ;
    public final void rule__VarDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2399:1: ( rule__VarDecl__Group__0__Impl rule__VarDecl__Group__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2400:2: rule__VarDecl__Group__0__Impl rule__VarDecl__Group__1
            {
            pushFollow(FOLLOW_rule__VarDecl__Group__0__Impl_in_rule__VarDecl__Group__04853);
            rule__VarDecl__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__VarDecl__Group__1_in_rule__VarDecl__Group__04856);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2407:1: rule__VarDecl__Group__0__Impl : ( () ) ;
    public final void rule__VarDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2411:1: ( ( () ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2412:1: ( () )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2412:1: ( () )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2413:1: ()
            {
             before(grammarAccess.getVarDeclAccess().getVarDeclAction_0()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2414:1: ()
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2416:1: 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2426:1: rule__VarDecl__Group__1 : rule__VarDecl__Group__1__Impl rule__VarDecl__Group__2 ;
    public final void rule__VarDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2430:1: ( rule__VarDecl__Group__1__Impl rule__VarDecl__Group__2 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2431:2: rule__VarDecl__Group__1__Impl rule__VarDecl__Group__2
            {
            pushFollow(FOLLOW_rule__VarDecl__Group__1__Impl_in_rule__VarDecl__Group__14914);
            rule__VarDecl__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__VarDecl__Group__2_in_rule__VarDecl__Group__14917);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2438:1: rule__VarDecl__Group__1__Impl : ( 'var' ) ;
    public final void rule__VarDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2442:1: ( ( 'var' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2443:1: ( 'var' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2443:1: ( 'var' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2444:1: 'var'
            {
             before(grammarAccess.getVarDeclAccess().getVarKeyword_1()); 
            match(input,28,FOLLOW_28_in_rule__VarDecl__Group__1__Impl4945); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2457:1: rule__VarDecl__Group__2 : rule__VarDecl__Group__2__Impl rule__VarDecl__Group__3 ;
    public final void rule__VarDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2461:1: ( rule__VarDecl__Group__2__Impl rule__VarDecl__Group__3 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2462:2: rule__VarDecl__Group__2__Impl rule__VarDecl__Group__3
            {
            pushFollow(FOLLOW_rule__VarDecl__Group__2__Impl_in_rule__VarDecl__Group__24976);
            rule__VarDecl__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__VarDecl__Group__3_in_rule__VarDecl__Group__24979);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2469:1: rule__VarDecl__Group__2__Impl : ( ( rule__VarDecl__TypeAssignment_2 ) ) ;
    public final void rule__VarDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2473:1: ( ( ( rule__VarDecl__TypeAssignment_2 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2474:1: ( ( rule__VarDecl__TypeAssignment_2 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2474:1: ( ( rule__VarDecl__TypeAssignment_2 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2475:1: ( rule__VarDecl__TypeAssignment_2 )
            {
             before(grammarAccess.getVarDeclAccess().getTypeAssignment_2()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2476:1: ( rule__VarDecl__TypeAssignment_2 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2476:2: rule__VarDecl__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__VarDecl__TypeAssignment_2_in_rule__VarDecl__Group__2__Impl5006);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2486:1: rule__VarDecl__Group__3 : rule__VarDecl__Group__3__Impl rule__VarDecl__Group__4 ;
    public final void rule__VarDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2490:1: ( rule__VarDecl__Group__3__Impl rule__VarDecl__Group__4 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2491:2: rule__VarDecl__Group__3__Impl rule__VarDecl__Group__4
            {
            pushFollow(FOLLOW_rule__VarDecl__Group__3__Impl_in_rule__VarDecl__Group__35036);
            rule__VarDecl__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__VarDecl__Group__4_in_rule__VarDecl__Group__35039);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2498:1: rule__VarDecl__Group__3__Impl : ( ( rule__VarDecl__NameAssignment_3 ) ) ;
    public final void rule__VarDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2502:1: ( ( ( rule__VarDecl__NameAssignment_3 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2503:1: ( ( rule__VarDecl__NameAssignment_3 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2503:1: ( ( rule__VarDecl__NameAssignment_3 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2504:1: ( rule__VarDecl__NameAssignment_3 )
            {
             before(grammarAccess.getVarDeclAccess().getNameAssignment_3()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2505:1: ( rule__VarDecl__NameAssignment_3 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2505:2: rule__VarDecl__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__VarDecl__NameAssignment_3_in_rule__VarDecl__Group__3__Impl5066);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2515:1: rule__VarDecl__Group__4 : rule__VarDecl__Group__4__Impl rule__VarDecl__Group__5 ;
    public final void rule__VarDecl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2519:1: ( rule__VarDecl__Group__4__Impl rule__VarDecl__Group__5 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2520:2: rule__VarDecl__Group__4__Impl rule__VarDecl__Group__5
            {
            pushFollow(FOLLOW_rule__VarDecl__Group__4__Impl_in_rule__VarDecl__Group__45096);
            rule__VarDecl__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__VarDecl__Group__5_in_rule__VarDecl__Group__45099);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2527:1: rule__VarDecl__Group__4__Impl : ( ( rule__VarDecl__Group_4__0 )? ) ;
    public final void rule__VarDecl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2531:1: ( ( ( rule__VarDecl__Group_4__0 )? ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2532:1: ( ( rule__VarDecl__Group_4__0 )? )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2532:1: ( ( rule__VarDecl__Group_4__0 )? )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2533:1: ( rule__VarDecl__Group_4__0 )?
            {
             before(grammarAccess.getVarDeclAccess().getGroup_4()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2534:1: ( rule__VarDecl__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==29) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2534:2: rule__VarDecl__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__VarDecl__Group_4__0_in_rule__VarDecl__Group__4__Impl5126);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2544:1: rule__VarDecl__Group__5 : rule__VarDecl__Group__5__Impl ;
    public final void rule__VarDecl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2548:1: ( rule__VarDecl__Group__5__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2549:2: rule__VarDecl__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__VarDecl__Group__5__Impl_in_rule__VarDecl__Group__55157);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2555:1: rule__VarDecl__Group__5__Impl : ( ';' ) ;
    public final void rule__VarDecl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2559:1: ( ( ';' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2560:1: ( ';' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2560:1: ( ';' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2561:1: ';'
            {
             before(grammarAccess.getVarDeclAccess().getSemicolonKeyword_5()); 
            match(input,23,FOLLOW_23_in_rule__VarDecl__Group__5__Impl5185); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2586:1: rule__VarDecl__Group_4__0 : rule__VarDecl__Group_4__0__Impl rule__VarDecl__Group_4__1 ;
    public final void rule__VarDecl__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2590:1: ( rule__VarDecl__Group_4__0__Impl rule__VarDecl__Group_4__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2591:2: rule__VarDecl__Group_4__0__Impl rule__VarDecl__Group_4__1
            {
            pushFollow(FOLLOW_rule__VarDecl__Group_4__0__Impl_in_rule__VarDecl__Group_4__05228);
            rule__VarDecl__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__VarDecl__Group_4__1_in_rule__VarDecl__Group_4__05231);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2598:1: rule__VarDecl__Group_4__0__Impl : ( '=' ) ;
    public final void rule__VarDecl__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2602:1: ( ( '=' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2603:1: ( '=' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2603:1: ( '=' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2604:1: '='
            {
             before(grammarAccess.getVarDeclAccess().getEqualsSignKeyword_4_0()); 
            match(input,29,FOLLOW_29_in_rule__VarDecl__Group_4__0__Impl5259); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2617:1: rule__VarDecl__Group_4__1 : rule__VarDecl__Group_4__1__Impl ;
    public final void rule__VarDecl__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2621:1: ( rule__VarDecl__Group_4__1__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2622:2: rule__VarDecl__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__VarDecl__Group_4__1__Impl_in_rule__VarDecl__Group_4__15290);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2628:1: rule__VarDecl__Group_4__1__Impl : ( ( rule__VarDecl__InitAssignment_4_1 ) ) ;
    public final void rule__VarDecl__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2632:1: ( ( ( rule__VarDecl__InitAssignment_4_1 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2633:1: ( ( rule__VarDecl__InitAssignment_4_1 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2633:1: ( ( rule__VarDecl__InitAssignment_4_1 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2634:1: ( rule__VarDecl__InitAssignment_4_1 )
            {
             before(grammarAccess.getVarDeclAccess().getInitAssignment_4_1()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2635:1: ( rule__VarDecl__InitAssignment_4_1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2635:2: rule__VarDecl__InitAssignment_4_1
            {
            pushFollow(FOLLOW_rule__VarDecl__InitAssignment_4_1_in_rule__VarDecl__Group_4__1__Impl5317);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2649:1: rule__ArrayType__Group__0 : rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1 ;
    public final void rule__ArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2653:1: ( rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2654:2: rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__0__Impl_in_rule__ArrayType__Group__05351);
            rule__ArrayType__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group__1_in_rule__ArrayType__Group__05354);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2661:1: rule__ArrayType__Group__0__Impl : ( () ) ;
    public final void rule__ArrayType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2665:1: ( ( () ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2666:1: ( () )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2666:1: ( () )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2667:1: ()
            {
             before(grammarAccess.getArrayTypeAccess().getArrayTypeAction_0()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2668:1: ()
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2670:1: 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2680:1: rule__ArrayType__Group__1 : rule__ArrayType__Group__1__Impl rule__ArrayType__Group__2 ;
    public final void rule__ArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2684:1: ( rule__ArrayType__Group__1__Impl rule__ArrayType__Group__2 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2685:2: rule__ArrayType__Group__1__Impl rule__ArrayType__Group__2
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__1__Impl_in_rule__ArrayType__Group__15412);
            rule__ArrayType__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group__2_in_rule__ArrayType__Group__15415);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2692:1: rule__ArrayType__Group__1__Impl : ( 'array' ) ;
    public final void rule__ArrayType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2696:1: ( ( 'array' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2697:1: ( 'array' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2697:1: ( 'array' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2698:1: 'array'
            {
             before(grammarAccess.getArrayTypeAccess().getArrayKeyword_1()); 
            match(input,30,FOLLOW_30_in_rule__ArrayType__Group__1__Impl5443); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2711:1: rule__ArrayType__Group__2 : rule__ArrayType__Group__2__Impl rule__ArrayType__Group__3 ;
    public final void rule__ArrayType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2715:1: ( rule__ArrayType__Group__2__Impl rule__ArrayType__Group__3 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2716:2: rule__ArrayType__Group__2__Impl rule__ArrayType__Group__3
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__2__Impl_in_rule__ArrayType__Group__25474);
            rule__ArrayType__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group__3_in_rule__ArrayType__Group__25477);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2723:1: rule__ArrayType__Group__2__Impl : ( '[' ) ;
    public final void rule__ArrayType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2727:1: ( ( '[' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2728:1: ( '[' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2728:1: ( '[' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2729:1: '['
            {
             before(grammarAccess.getArrayTypeAccess().getLeftSquareBracketKeyword_2()); 
            match(input,31,FOLLOW_31_in_rule__ArrayType__Group__2__Impl5505); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2742:1: rule__ArrayType__Group__3 : rule__ArrayType__Group__3__Impl rule__ArrayType__Group__4 ;
    public final void rule__ArrayType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2746:1: ( rule__ArrayType__Group__3__Impl rule__ArrayType__Group__4 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2747:2: rule__ArrayType__Group__3__Impl rule__ArrayType__Group__4
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__3__Impl_in_rule__ArrayType__Group__35536);
            rule__ArrayType__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group__4_in_rule__ArrayType__Group__35539);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2754:1: rule__ArrayType__Group__3__Impl : ( ( rule__ArrayType__BaseTypeAssignment_3 ) ) ;
    public final void rule__ArrayType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2758:1: ( ( ( rule__ArrayType__BaseTypeAssignment_3 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2759:1: ( ( rule__ArrayType__BaseTypeAssignment_3 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2759:1: ( ( rule__ArrayType__BaseTypeAssignment_3 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2760:1: ( rule__ArrayType__BaseTypeAssignment_3 )
            {
             before(grammarAccess.getArrayTypeAccess().getBaseTypeAssignment_3()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2761:1: ( rule__ArrayType__BaseTypeAssignment_3 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2761:2: rule__ArrayType__BaseTypeAssignment_3
            {
            pushFollow(FOLLOW_rule__ArrayType__BaseTypeAssignment_3_in_rule__ArrayType__Group__3__Impl5566);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2771:1: rule__ArrayType__Group__4 : rule__ArrayType__Group__4__Impl ;
    public final void rule__ArrayType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2775:1: ( rule__ArrayType__Group__4__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2776:2: rule__ArrayType__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__4__Impl_in_rule__ArrayType__Group__45596);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2782:1: rule__ArrayType__Group__4__Impl : ( ']' ) ;
    public final void rule__ArrayType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2786:1: ( ( ']' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2787:1: ( ']' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2787:1: ( ']' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2788:1: ']'
            {
             before(grammarAccess.getArrayTypeAccess().getRightSquareBracketKeyword_4()); 
            match(input,32,FOLLOW_32_in_rule__ArrayType__Group__4__Impl5624); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2811:1: rule__IntType__Group__0 : rule__IntType__Group__0__Impl rule__IntType__Group__1 ;
    public final void rule__IntType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2815:1: ( rule__IntType__Group__0__Impl rule__IntType__Group__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2816:2: rule__IntType__Group__0__Impl rule__IntType__Group__1
            {
            pushFollow(FOLLOW_rule__IntType__Group__0__Impl_in_rule__IntType__Group__05665);
            rule__IntType__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__IntType__Group__1_in_rule__IntType__Group__05668);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2823:1: rule__IntType__Group__0__Impl : ( () ) ;
    public final void rule__IntType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2827:1: ( ( () ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2828:1: ( () )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2828:1: ( () )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2829:1: ()
            {
             before(grammarAccess.getIntTypeAccess().getIntTypeAction_0()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2830:1: ()
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2832:1: 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2842:1: rule__IntType__Group__1 : rule__IntType__Group__1__Impl ;
    public final void rule__IntType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2846:1: ( rule__IntType__Group__1__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2847:2: rule__IntType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__IntType__Group__1__Impl_in_rule__IntType__Group__15726);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2853:1: rule__IntType__Group__1__Impl : ( 'int' ) ;
    public final void rule__IntType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2857:1: ( ( 'int' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2858:1: ( 'int' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2858:1: ( 'int' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2859:1: 'int'
            {
             before(grammarAccess.getIntTypeAccess().getIntKeyword_1()); 
            match(input,33,FOLLOW_33_in_rule__IntType__Group__1__Impl5754); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2876:1: rule__BoolType__Group__0 : rule__BoolType__Group__0__Impl rule__BoolType__Group__1 ;
    public final void rule__BoolType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2880:1: ( rule__BoolType__Group__0__Impl rule__BoolType__Group__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2881:2: rule__BoolType__Group__0__Impl rule__BoolType__Group__1
            {
            pushFollow(FOLLOW_rule__BoolType__Group__0__Impl_in_rule__BoolType__Group__05789);
            rule__BoolType__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BoolType__Group__1_in_rule__BoolType__Group__05792);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2888:1: rule__BoolType__Group__0__Impl : ( () ) ;
    public final void rule__BoolType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2892:1: ( ( () ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2893:1: ( () )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2893:1: ( () )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2894:1: ()
            {
             before(grammarAccess.getBoolTypeAccess().getBoolTypeAction_0()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2895:1: ()
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2897:1: 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2907:1: rule__BoolType__Group__1 : rule__BoolType__Group__1__Impl ;
    public final void rule__BoolType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2911:1: ( rule__BoolType__Group__1__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2912:2: rule__BoolType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BoolType__Group__1__Impl_in_rule__BoolType__Group__15850);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2918:1: rule__BoolType__Group__1__Impl : ( 'bool' ) ;
    public final void rule__BoolType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2922:1: ( ( 'bool' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2923:1: ( 'bool' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2923:1: ( 'bool' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2924:1: 'bool'
            {
             before(grammarAccess.getBoolTypeAccess().getBoolKeyword_1()); 
            match(input,34,FOLLOW_34_in_rule__BoolType__Group__1__Impl5878); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2941:1: rule__FloatType__Group__0 : rule__FloatType__Group__0__Impl rule__FloatType__Group__1 ;
    public final void rule__FloatType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2945:1: ( rule__FloatType__Group__0__Impl rule__FloatType__Group__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2946:2: rule__FloatType__Group__0__Impl rule__FloatType__Group__1
            {
            pushFollow(FOLLOW_rule__FloatType__Group__0__Impl_in_rule__FloatType__Group__05913);
            rule__FloatType__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FloatType__Group__1_in_rule__FloatType__Group__05916);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2953:1: rule__FloatType__Group__0__Impl : ( () ) ;
    public final void rule__FloatType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2957:1: ( ( () ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2958:1: ( () )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2958:1: ( () )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2959:1: ()
            {
             before(grammarAccess.getFloatTypeAccess().getFloatTypeAction_0()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2960:1: ()
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2962:1: 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2972:1: rule__FloatType__Group__1 : rule__FloatType__Group__1__Impl ;
    public final void rule__FloatType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2976:1: ( rule__FloatType__Group__1__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2977:2: rule__FloatType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FloatType__Group__1__Impl_in_rule__FloatType__Group__15974);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2983:1: rule__FloatType__Group__1__Impl : ( 'float' ) ;
    public final void rule__FloatType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2987:1: ( ( 'float' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2988:1: ( 'float' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2988:1: ( 'float' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2989:1: 'float'
            {
             before(grammarAccess.getFloatTypeAccess().getFloatKeyword_1()); 
            match(input,35,FOLLOW_35_in_rule__FloatType__Group__1__Impl6002); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3006:1: rule__StringType__Group__0 : rule__StringType__Group__0__Impl rule__StringType__Group__1 ;
    public final void rule__StringType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3010:1: ( rule__StringType__Group__0__Impl rule__StringType__Group__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3011:2: rule__StringType__Group__0__Impl rule__StringType__Group__1
            {
            pushFollow(FOLLOW_rule__StringType__Group__0__Impl_in_rule__StringType__Group__06037);
            rule__StringType__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringType__Group__1_in_rule__StringType__Group__06040);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3018:1: rule__StringType__Group__0__Impl : ( () ) ;
    public final void rule__StringType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3022:1: ( ( () ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3023:1: ( () )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3023:1: ( () )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3024:1: ()
            {
             before(grammarAccess.getStringTypeAccess().getStringTypeAction_0()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3025:1: ()
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3027:1: 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3037:1: rule__StringType__Group__1 : rule__StringType__Group__1__Impl ;
    public final void rule__StringType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3041:1: ( rule__StringType__Group__1__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3042:2: rule__StringType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__StringType__Group__1__Impl_in_rule__StringType__Group__16098);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3048:1: rule__StringType__Group__1__Impl : ( 'string' ) ;
    public final void rule__StringType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3052:1: ( ( 'string' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3053:1: ( 'string' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3053:1: ( 'string' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3054:1: 'string'
            {
             before(grammarAccess.getStringTypeAccess().getStringKeyword_1()); 
            match(input,36,FOLLOW_36_in_rule__StringType__Group__1__Impl6126); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3071:1: rule__Formula__Group__0 : rule__Formula__Group__0__Impl rule__Formula__Group__1 ;
    public final void rule__Formula__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3075:1: ( rule__Formula__Group__0__Impl rule__Formula__Group__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3076:2: rule__Formula__Group__0__Impl rule__Formula__Group__1
            {
            pushFollow(FOLLOW_rule__Formula__Group__0__Impl_in_rule__Formula__Group__06161);
            rule__Formula__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Formula__Group__1_in_rule__Formula__Group__06164);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3083:1: rule__Formula__Group__0__Impl : ( () ) ;
    public final void rule__Formula__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3087:1: ( ( () ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3088:1: ( () )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3088:1: ( () )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3089:1: ()
            {
             before(grammarAccess.getFormulaAccess().getFormulaAction_0()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3090:1: ()
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3092:1: 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3102:1: rule__Formula__Group__1 : rule__Formula__Group__1__Impl rule__Formula__Group__2 ;
    public final void rule__Formula__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3106:1: ( rule__Formula__Group__1__Impl rule__Formula__Group__2 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3107:2: rule__Formula__Group__1__Impl rule__Formula__Group__2
            {
            pushFollow(FOLLOW_rule__Formula__Group__1__Impl_in_rule__Formula__Group__16222);
            rule__Formula__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Formula__Group__2_in_rule__Formula__Group__16225);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3114:1: rule__Formula__Group__1__Impl : ( 'calc' ) ;
    public final void rule__Formula__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3118:1: ( ( 'calc' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3119:1: ( 'calc' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3119:1: ( 'calc' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3120:1: 'calc'
            {
             before(grammarAccess.getFormulaAccess().getCalcKeyword_1()); 
            match(input,37,FOLLOW_37_in_rule__Formula__Group__1__Impl6253); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3133:1: rule__Formula__Group__2 : rule__Formula__Group__2__Impl rule__Formula__Group__3 ;
    public final void rule__Formula__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3137:1: ( rule__Formula__Group__2__Impl rule__Formula__Group__3 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3138:2: rule__Formula__Group__2__Impl rule__Formula__Group__3
            {
            pushFollow(FOLLOW_rule__Formula__Group__2__Impl_in_rule__Formula__Group__26284);
            rule__Formula__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Formula__Group__3_in_rule__Formula__Group__26287);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3145:1: rule__Formula__Group__2__Impl : ( ( rule__Formula__TypeAssignment_2 ) ) ;
    public final void rule__Formula__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3149:1: ( ( ( rule__Formula__TypeAssignment_2 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3150:1: ( ( rule__Formula__TypeAssignment_2 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3150:1: ( ( rule__Formula__TypeAssignment_2 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3151:1: ( rule__Formula__TypeAssignment_2 )
            {
             before(grammarAccess.getFormulaAccess().getTypeAssignment_2()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3152:1: ( rule__Formula__TypeAssignment_2 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3152:2: rule__Formula__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Formula__TypeAssignment_2_in_rule__Formula__Group__2__Impl6314);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3162:1: rule__Formula__Group__3 : rule__Formula__Group__3__Impl rule__Formula__Group__4 ;
    public final void rule__Formula__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3166:1: ( rule__Formula__Group__3__Impl rule__Formula__Group__4 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3167:2: rule__Formula__Group__3__Impl rule__Formula__Group__4
            {
            pushFollow(FOLLOW_rule__Formula__Group__3__Impl_in_rule__Formula__Group__36344);
            rule__Formula__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Formula__Group__4_in_rule__Formula__Group__36347);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3174:1: rule__Formula__Group__3__Impl : ( ( rule__Formula__NameAssignment_3 ) ) ;
    public final void rule__Formula__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3178:1: ( ( ( rule__Formula__NameAssignment_3 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3179:1: ( ( rule__Formula__NameAssignment_3 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3179:1: ( ( rule__Formula__NameAssignment_3 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3180:1: ( rule__Formula__NameAssignment_3 )
            {
             before(grammarAccess.getFormulaAccess().getNameAssignment_3()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3181:1: ( rule__Formula__NameAssignment_3 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3181:2: rule__Formula__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__Formula__NameAssignment_3_in_rule__Formula__Group__3__Impl6374);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3191:1: rule__Formula__Group__4 : rule__Formula__Group__4__Impl rule__Formula__Group__5 ;
    public final void rule__Formula__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3195:1: ( rule__Formula__Group__4__Impl rule__Formula__Group__5 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3196:2: rule__Formula__Group__4__Impl rule__Formula__Group__5
            {
            pushFollow(FOLLOW_rule__Formula__Group__4__Impl_in_rule__Formula__Group__46404);
            rule__Formula__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Formula__Group__5_in_rule__Formula__Group__46407);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3203:1: rule__Formula__Group__4__Impl : ( '=' ) ;
    public final void rule__Formula__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3207:1: ( ( '=' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3208:1: ( '=' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3208:1: ( '=' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3209:1: '='
            {
             before(grammarAccess.getFormulaAccess().getEqualsSignKeyword_4()); 
            match(input,29,FOLLOW_29_in_rule__Formula__Group__4__Impl6435); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3222:1: rule__Formula__Group__5 : rule__Formula__Group__5__Impl rule__Formula__Group__6 ;
    public final void rule__Formula__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3226:1: ( rule__Formula__Group__5__Impl rule__Formula__Group__6 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3227:2: rule__Formula__Group__5__Impl rule__Formula__Group__6
            {
            pushFollow(FOLLOW_rule__Formula__Group__5__Impl_in_rule__Formula__Group__56466);
            rule__Formula__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Formula__Group__6_in_rule__Formula__Group__56469);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3234:1: rule__Formula__Group__5__Impl : ( ( rule__Formula__ExprAssignment_5 ) ) ;
    public final void rule__Formula__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3238:1: ( ( ( rule__Formula__ExprAssignment_5 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3239:1: ( ( rule__Formula__ExprAssignment_5 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3239:1: ( ( rule__Formula__ExprAssignment_5 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3240:1: ( rule__Formula__ExprAssignment_5 )
            {
             before(grammarAccess.getFormulaAccess().getExprAssignment_5()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3241:1: ( rule__Formula__ExprAssignment_5 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3241:2: rule__Formula__ExprAssignment_5
            {
            pushFollow(FOLLOW_rule__Formula__ExprAssignment_5_in_rule__Formula__Group__5__Impl6496);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3251:1: rule__Formula__Group__6 : rule__Formula__Group__6__Impl ;
    public final void rule__Formula__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3255:1: ( rule__Formula__Group__6__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3256:2: rule__Formula__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Formula__Group__6__Impl_in_rule__Formula__Group__66526);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3262:1: rule__Formula__Group__6__Impl : ( ';' ) ;
    public final void rule__Formula__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3266:1: ( ( ';' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3267:1: ( ';' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3267:1: ( ';' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3268:1: ';'
            {
             before(grammarAccess.getFormulaAccess().getSemicolonKeyword_6()); 
            match(input,23,FOLLOW_23_in_rule__Formula__Group__6__Impl6554); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3295:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3299:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3300:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
            {
            pushFollow(FOLLOW_rule__Comparison__Group__0__Impl_in_rule__Comparison__Group__06599);
            rule__Comparison__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Comparison__Group__1_in_rule__Comparison__Group__06602);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3307:1: rule__Comparison__Group__0__Impl : ( ruleAddition ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3311:1: ( ( ruleAddition ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3312:1: ( ruleAddition )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3312:1: ( ruleAddition )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3313:1: ruleAddition
            {
             before(grammarAccess.getComparisonAccess().getAdditionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAddition_in_rule__Comparison__Group__0__Impl6629);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3324:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3328:1: ( rule__Comparison__Group__1__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3329:2: rule__Comparison__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Comparison__Group__1__Impl_in_rule__Comparison__Group__16658);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3335:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__Group_1__0 )? ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3339:1: ( ( ( rule__Comparison__Group_1__0 )? ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3340:1: ( ( rule__Comparison__Group_1__0 )? )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3340:1: ( ( rule__Comparison__Group_1__0 )? )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3341:1: ( rule__Comparison__Group_1__0 )?
            {
             before(grammarAccess.getComparisonAccess().getGroup_1()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3342:1: ( rule__Comparison__Group_1__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==38) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3342:2: rule__Comparison__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Comparison__Group_1__0_in_rule__Comparison__Group__1__Impl6685);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3356:1: rule__Comparison__Group_1__0 : rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 ;
    public final void rule__Comparison__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3360:1: ( rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3361:2: rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1__0__Impl_in_rule__Comparison__Group_1__06720);
            rule__Comparison__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Comparison__Group_1__1_in_rule__Comparison__Group_1__06723);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3368:1: rule__Comparison__Group_1__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3372:1: ( ( () ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3373:1: ( () )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3373:1: ( () )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3374:1: ()
            {
             before(grammarAccess.getComparisonAccess().getEqualsLeftAction_1_0()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3375:1: ()
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3377:1: 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3387:1: rule__Comparison__Group_1__1 : rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2 ;
    public final void rule__Comparison__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3391:1: ( rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3392:2: rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1__1__Impl_in_rule__Comparison__Group_1__16781);
            rule__Comparison__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Comparison__Group_1__2_in_rule__Comparison__Group_1__16784);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3399:1: rule__Comparison__Group_1__1__Impl : ( '==' ) ;
    public final void rule__Comparison__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3403:1: ( ( '==' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3404:1: ( '==' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3404:1: ( '==' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3405:1: '=='
            {
             before(grammarAccess.getComparisonAccess().getEqualsSignEqualsSignKeyword_1_1()); 
            match(input,38,FOLLOW_38_in_rule__Comparison__Group_1__1__Impl6812); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3418:1: rule__Comparison__Group_1__2 : rule__Comparison__Group_1__2__Impl ;
    public final void rule__Comparison__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3422:1: ( rule__Comparison__Group_1__2__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3423:2: rule__Comparison__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1__2__Impl_in_rule__Comparison__Group_1__26843);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3429:1: rule__Comparison__Group_1__2__Impl : ( ( rule__Comparison__RightAssignment_1_2 ) ) ;
    public final void rule__Comparison__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3433:1: ( ( ( rule__Comparison__RightAssignment_1_2 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3434:1: ( ( rule__Comparison__RightAssignment_1_2 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3434:1: ( ( rule__Comparison__RightAssignment_1_2 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3435:1: ( rule__Comparison__RightAssignment_1_2 )
            {
             before(grammarAccess.getComparisonAccess().getRightAssignment_1_2()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3436:1: ( rule__Comparison__RightAssignment_1_2 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3436:2: rule__Comparison__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Comparison__RightAssignment_1_2_in_rule__Comparison__Group_1__2__Impl6870);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3452:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3456:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3457:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_rule__Addition__Group__0__Impl_in_rule__Addition__Group__06906);
            rule__Addition__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Addition__Group__1_in_rule__Addition__Group__06909);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3464:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3468:1: ( ( ruleMultiplication ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3469:1: ( ruleMultiplication )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3469:1: ( ruleMultiplication )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3470:1: ruleMultiplication
            {
             before(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleMultiplication_in_rule__Addition__Group__0__Impl6936);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3481:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3485:1: ( rule__Addition__Group__1__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3486:2: rule__Addition__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group__1__Impl_in_rule__Addition__Group__16965);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3492:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3496:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3497:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3497:1: ( ( rule__Addition__Group_1__0 )* )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3498:1: ( rule__Addition__Group_1__0 )*
            {
             before(grammarAccess.getAdditionAccess().getGroup_1()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3499:1: ( rule__Addition__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==39) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3499:2: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Addition__Group_1__0_in_rule__Addition__Group__1__Impl6992);
            	    rule__Addition__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3513:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3517:1: ( rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3518:2: rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1
            {
            pushFollow(FOLLOW_rule__Addition__Group_1__0__Impl_in_rule__Addition__Group_1__07027);
            rule__Addition__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Addition__Group_1__1_in_rule__Addition__Group_1__07030);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3525:1: rule__Addition__Group_1__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3529:1: ( ( () ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3530:1: ( () )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3530:1: ( () )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3531:1: ()
            {
             before(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3532:1: ()
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3534:1: 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3544:1: rule__Addition__Group_1__1 : rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 ;
    public final void rule__Addition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3548:1: ( rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3549:2: rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2
            {
            pushFollow(FOLLOW_rule__Addition__Group_1__1__Impl_in_rule__Addition__Group_1__17088);
            rule__Addition__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Addition__Group_1__2_in_rule__Addition__Group_1__17091);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3556:1: rule__Addition__Group_1__1__Impl : ( '+' ) ;
    public final void rule__Addition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3560:1: ( ( '+' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3561:1: ( '+' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3561:1: ( '+' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3562:1: '+'
            {
             before(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_1()); 
            match(input,39,FOLLOW_39_in_rule__Addition__Group_1__1__Impl7119); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3575:1: rule__Addition__Group_1__2 : rule__Addition__Group_1__2__Impl ;
    public final void rule__Addition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3579:1: ( rule__Addition__Group_1__2__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3580:2: rule__Addition__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group_1__2__Impl_in_rule__Addition__Group_1__27150);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3586:1: rule__Addition__Group_1__2__Impl : ( ( rule__Addition__RightAssignment_1_2 ) ) ;
    public final void rule__Addition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3590:1: ( ( ( rule__Addition__RightAssignment_1_2 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3591:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3591:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3592:1: ( rule__Addition__RightAssignment_1_2 )
            {
             before(grammarAccess.getAdditionAccess().getRightAssignment_1_2()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3593:1: ( rule__Addition__RightAssignment_1_2 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3593:2: rule__Addition__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Addition__RightAssignment_1_2_in_rule__Addition__Group_1__2__Impl7177);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3609:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3613:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3614:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__0__Impl_in_rule__Multiplication__Group__07213);
            rule__Multiplication__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Multiplication__Group__1_in_rule__Multiplication__Group__07216);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3621:1: rule__Multiplication__Group__0__Impl : ( rulePostfixOperators ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3625:1: ( ( rulePostfixOperators ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3626:1: ( rulePostfixOperators )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3626:1: ( rulePostfixOperators )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3627:1: rulePostfixOperators
            {
             before(grammarAccess.getMultiplicationAccess().getPostfixOperatorsParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePostfixOperators_in_rule__Multiplication__Group__0__Impl7243);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3638:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3642:1: ( rule__Multiplication__Group__1__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3643:2: rule__Multiplication__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__1__Impl_in_rule__Multiplication__Group__17272);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3649:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3653:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3654:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3654:1: ( ( rule__Multiplication__Group_1__0 )* )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3655:1: ( rule__Multiplication__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3656:1: ( rule__Multiplication__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==15) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3656:2: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Multiplication__Group_1__0_in_rule__Multiplication__Group__1__Impl7299);
            	    rule__Multiplication__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3670:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3674:1: ( rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3675:2: rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1__0__Impl_in_rule__Multiplication__Group_1__07334);
            rule__Multiplication__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Multiplication__Group_1__1_in_rule__Multiplication__Group_1__07337);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3682:1: rule__Multiplication__Group_1__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3686:1: ( ( () ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3687:1: ( () )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3687:1: ( () )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3688:1: ()
            {
             before(grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3689:1: ()
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3691:1: 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3701:1: rule__Multiplication__Group_1__1 : rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 ;
    public final void rule__Multiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3705:1: ( rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3706:2: rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1__1__Impl_in_rule__Multiplication__Group_1__17395);
            rule__Multiplication__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Multiplication__Group_1__2_in_rule__Multiplication__Group_1__17398);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3713:1: rule__Multiplication__Group_1__1__Impl : ( '*' ) ;
    public final void rule__Multiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3717:1: ( ( '*' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3718:1: ( '*' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3718:1: ( '*' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3719:1: '*'
            {
             before(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_1()); 
            match(input,15,FOLLOW_15_in_rule__Multiplication__Group_1__1__Impl7426); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3732:1: rule__Multiplication__Group_1__2 : rule__Multiplication__Group_1__2__Impl ;
    public final void rule__Multiplication__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3736:1: ( rule__Multiplication__Group_1__2__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3737:2: rule__Multiplication__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1__2__Impl_in_rule__Multiplication__Group_1__27457);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3743:1: rule__Multiplication__Group_1__2__Impl : ( ( rule__Multiplication__RightAssignment_1_2 ) ) ;
    public final void rule__Multiplication__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3747:1: ( ( ( rule__Multiplication__RightAssignment_1_2 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3748:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3748:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3749:1: ( rule__Multiplication__RightAssignment_1_2 )
            {
             before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_2()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3750:1: ( rule__Multiplication__RightAssignment_1_2 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3750:2: rule__Multiplication__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Multiplication__RightAssignment_1_2_in_rule__Multiplication__Group_1__2__Impl7484);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3766:1: rule__PostfixOperators__Group__0 : rule__PostfixOperators__Group__0__Impl rule__PostfixOperators__Group__1 ;
    public final void rule__PostfixOperators__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3770:1: ( rule__PostfixOperators__Group__0__Impl rule__PostfixOperators__Group__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3771:2: rule__PostfixOperators__Group__0__Impl rule__PostfixOperators__Group__1
            {
            pushFollow(FOLLOW_rule__PostfixOperators__Group__0__Impl_in_rule__PostfixOperators__Group__07520);
            rule__PostfixOperators__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PostfixOperators__Group__1_in_rule__PostfixOperators__Group__07523);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3778:1: rule__PostfixOperators__Group__0__Impl : ( ruleAtomic ) ;
    public final void rule__PostfixOperators__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3782:1: ( ( ruleAtomic ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3783:1: ( ruleAtomic )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3783:1: ( ruleAtomic )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3784:1: ruleAtomic
            {
             before(grammarAccess.getPostfixOperatorsAccess().getAtomicParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAtomic_in_rule__PostfixOperators__Group__0__Impl7550);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3795:1: rule__PostfixOperators__Group__1 : rule__PostfixOperators__Group__1__Impl ;
    public final void rule__PostfixOperators__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3799:1: ( rule__PostfixOperators__Group__1__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3800:2: rule__PostfixOperators__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PostfixOperators__Group__1__Impl_in_rule__PostfixOperators__Group__17579);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3806:1: rule__PostfixOperators__Group__1__Impl : ( ( rule__PostfixOperators__Group_1__0 )? ) ;
    public final void rule__PostfixOperators__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3810:1: ( ( ( rule__PostfixOperators__Group_1__0 )? ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3811:1: ( ( rule__PostfixOperators__Group_1__0 )? )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3811:1: ( ( rule__PostfixOperators__Group_1__0 )? )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3812:1: ( rule__PostfixOperators__Group_1__0 )?
            {
             before(grammarAccess.getPostfixOperatorsAccess().getGroup_1()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3813:1: ( rule__PostfixOperators__Group_1__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==31) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3813:2: rule__PostfixOperators__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__PostfixOperators__Group_1__0_in_rule__PostfixOperators__Group__1__Impl7606);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3827:1: rule__PostfixOperators__Group_1__0 : rule__PostfixOperators__Group_1__0__Impl rule__PostfixOperators__Group_1__1 ;
    public final void rule__PostfixOperators__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3831:1: ( rule__PostfixOperators__Group_1__0__Impl rule__PostfixOperators__Group_1__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3832:2: rule__PostfixOperators__Group_1__0__Impl rule__PostfixOperators__Group_1__1
            {
            pushFollow(FOLLOW_rule__PostfixOperators__Group_1__0__Impl_in_rule__PostfixOperators__Group_1__07641);
            rule__PostfixOperators__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PostfixOperators__Group_1__1_in_rule__PostfixOperators__Group_1__07644);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3839:1: rule__PostfixOperators__Group_1__0__Impl : ( () ) ;
    public final void rule__PostfixOperators__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3843:1: ( ( () ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3844:1: ( () )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3844:1: ( () )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3845:1: ()
            {
             before(grammarAccess.getPostfixOperatorsAccess().getArrayAccessExprAction_1_0()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3846:1: ()
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3848:1: 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3858:1: rule__PostfixOperators__Group_1__1 : rule__PostfixOperators__Group_1__1__Impl rule__PostfixOperators__Group_1__2 ;
    public final void rule__PostfixOperators__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3862:1: ( rule__PostfixOperators__Group_1__1__Impl rule__PostfixOperators__Group_1__2 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3863:2: rule__PostfixOperators__Group_1__1__Impl rule__PostfixOperators__Group_1__2
            {
            pushFollow(FOLLOW_rule__PostfixOperators__Group_1__1__Impl_in_rule__PostfixOperators__Group_1__17702);
            rule__PostfixOperators__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PostfixOperators__Group_1__2_in_rule__PostfixOperators__Group_1__17705);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3870:1: rule__PostfixOperators__Group_1__1__Impl : ( '[' ) ;
    public final void rule__PostfixOperators__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3874:1: ( ( '[' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3875:1: ( '[' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3875:1: ( '[' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3876:1: '['
            {
             before(grammarAccess.getPostfixOperatorsAccess().getLeftSquareBracketKeyword_1_1()); 
            match(input,31,FOLLOW_31_in_rule__PostfixOperators__Group_1__1__Impl7733); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3889:1: rule__PostfixOperators__Group_1__2 : rule__PostfixOperators__Group_1__2__Impl rule__PostfixOperators__Group_1__3 ;
    public final void rule__PostfixOperators__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3893:1: ( rule__PostfixOperators__Group_1__2__Impl rule__PostfixOperators__Group_1__3 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3894:2: rule__PostfixOperators__Group_1__2__Impl rule__PostfixOperators__Group_1__3
            {
            pushFollow(FOLLOW_rule__PostfixOperators__Group_1__2__Impl_in_rule__PostfixOperators__Group_1__27764);
            rule__PostfixOperators__Group_1__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PostfixOperators__Group_1__3_in_rule__PostfixOperators__Group_1__27767);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3901:1: rule__PostfixOperators__Group_1__2__Impl : ( ( rule__PostfixOperators__IndexAssignment_1_2 ) ) ;
    public final void rule__PostfixOperators__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3905:1: ( ( ( rule__PostfixOperators__IndexAssignment_1_2 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3906:1: ( ( rule__PostfixOperators__IndexAssignment_1_2 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3906:1: ( ( rule__PostfixOperators__IndexAssignment_1_2 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3907:1: ( rule__PostfixOperators__IndexAssignment_1_2 )
            {
             before(grammarAccess.getPostfixOperatorsAccess().getIndexAssignment_1_2()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3908:1: ( rule__PostfixOperators__IndexAssignment_1_2 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3908:2: rule__PostfixOperators__IndexAssignment_1_2
            {
            pushFollow(FOLLOW_rule__PostfixOperators__IndexAssignment_1_2_in_rule__PostfixOperators__Group_1__2__Impl7794);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3918:1: rule__PostfixOperators__Group_1__3 : rule__PostfixOperators__Group_1__3__Impl ;
    public final void rule__PostfixOperators__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3922:1: ( rule__PostfixOperators__Group_1__3__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3923:2: rule__PostfixOperators__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__PostfixOperators__Group_1__3__Impl_in_rule__PostfixOperators__Group_1__37824);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3929:1: rule__PostfixOperators__Group_1__3__Impl : ( ']' ) ;
    public final void rule__PostfixOperators__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3933:1: ( ( ']' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3934:1: ( ']' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3934:1: ( ']' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3935:1: ']'
            {
             before(grammarAccess.getPostfixOperatorsAccess().getRightSquareBracketKeyword_1_3()); 
            match(input,32,FOLLOW_32_in_rule__PostfixOperators__Group_1__3__Impl7852); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3956:1: rule__Atomic__Group_0__0 : rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 ;
    public final void rule__Atomic__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3960:1: ( rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3961:2: rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_0__0__Impl_in_rule__Atomic__Group_0__07891);
            rule__Atomic__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_0__1_in_rule__Atomic__Group_0__07894);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3968:1: rule__Atomic__Group_0__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3972:1: ( ( () ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3973:1: ( () )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3973:1: ( () )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3974:1: ()
            {
             before(grammarAccess.getAtomicAccess().getSymbolRefAction_0_0()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3975:1: ()
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3977:1: 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3987:1: rule__Atomic__Group_0__1 : rule__Atomic__Group_0__1__Impl rule__Atomic__Group_0__2 ;
    public final void rule__Atomic__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3991:1: ( rule__Atomic__Group_0__1__Impl rule__Atomic__Group_0__2 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3992:2: rule__Atomic__Group_0__1__Impl rule__Atomic__Group_0__2
            {
            pushFollow(FOLLOW_rule__Atomic__Group_0__1__Impl_in_rule__Atomic__Group_0__17952);
            rule__Atomic__Group_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_0__2_in_rule__Atomic__Group_0__17955);
            rule__Atomic__Group_0__2();
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3999:1: rule__Atomic__Group_0__1__Impl : ( ( rule__Atomic__SymbolAssignment_0_1 ) ) ;
    public final void rule__Atomic__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4003:1: ( ( ( rule__Atomic__SymbolAssignment_0_1 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4004:1: ( ( rule__Atomic__SymbolAssignment_0_1 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4004:1: ( ( rule__Atomic__SymbolAssignment_0_1 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4005:1: ( rule__Atomic__SymbolAssignment_0_1 )
            {
             before(grammarAccess.getAtomicAccess().getSymbolAssignment_0_1()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4006:1: ( rule__Atomic__SymbolAssignment_0_1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4006:2: rule__Atomic__SymbolAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Atomic__SymbolAssignment_0_1_in_rule__Atomic__Group_0__1__Impl7982);
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


    // $ANTLR start rule__Atomic__Group_0__2
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4016:1: rule__Atomic__Group_0__2 : rule__Atomic__Group_0__2__Impl ;
    public final void rule__Atomic__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4020:1: ( rule__Atomic__Group_0__2__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4021:2: rule__Atomic__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_0__2__Impl_in_rule__Atomic__Group_0__28012);
            rule__Atomic__Group_0__2__Impl();
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
    // $ANTLR end rule__Atomic__Group_0__2


    // $ANTLR start rule__Atomic__Group_0__2__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4027:1: rule__Atomic__Group_0__2__Impl : ( ( rule__Atomic__Group_0_2__0 )? ) ;
    public final void rule__Atomic__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4031:1: ( ( ( rule__Atomic__Group_0_2__0 )? ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4032:1: ( ( rule__Atomic__Group_0_2__0 )? )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4032:1: ( ( rule__Atomic__Group_0_2__0 )? )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4033:1: ( rule__Atomic__Group_0_2__0 )?
            {
             before(grammarAccess.getAtomicAccess().getGroup_0_2()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4034:1: ( rule__Atomic__Group_0_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==17) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4034:2: rule__Atomic__Group_0_2__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_0_2__0_in_rule__Atomic__Group_0__2__Impl8039);
                    rule__Atomic__Group_0_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAtomicAccess().getGroup_0_2()); 

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
    // $ANTLR end rule__Atomic__Group_0__2__Impl


    // $ANTLR start rule__Atomic__Group_0_2__0
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4050:1: rule__Atomic__Group_0_2__0 : rule__Atomic__Group_0_2__0__Impl rule__Atomic__Group_0_2__1 ;
    public final void rule__Atomic__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4054:1: ( rule__Atomic__Group_0_2__0__Impl rule__Atomic__Group_0_2__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4055:2: rule__Atomic__Group_0_2__0__Impl rule__Atomic__Group_0_2__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_0_2__0__Impl_in_rule__Atomic__Group_0_2__08076);
            rule__Atomic__Group_0_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_0_2__1_in_rule__Atomic__Group_0_2__08079);
            rule__Atomic__Group_0_2__1();
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
    // $ANTLR end rule__Atomic__Group_0_2__0


    // $ANTLR start rule__Atomic__Group_0_2__0__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4062:1: rule__Atomic__Group_0_2__0__Impl : ( '(' ) ;
    public final void rule__Atomic__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4066:1: ( ( '(' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4067:1: ( '(' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4067:1: ( '(' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4068:1: '('
            {
             before(grammarAccess.getAtomicAccess().getLeftParenthesisKeyword_0_2_0()); 
            match(input,17,FOLLOW_17_in_rule__Atomic__Group_0_2__0__Impl8107); 
             after(grammarAccess.getAtomicAccess().getLeftParenthesisKeyword_0_2_0()); 

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
    // $ANTLR end rule__Atomic__Group_0_2__0__Impl


    // $ANTLR start rule__Atomic__Group_0_2__1
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4081:1: rule__Atomic__Group_0_2__1 : rule__Atomic__Group_0_2__1__Impl rule__Atomic__Group_0_2__2 ;
    public final void rule__Atomic__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4085:1: ( rule__Atomic__Group_0_2__1__Impl rule__Atomic__Group_0_2__2 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4086:2: rule__Atomic__Group_0_2__1__Impl rule__Atomic__Group_0_2__2
            {
            pushFollow(FOLLOW_rule__Atomic__Group_0_2__1__Impl_in_rule__Atomic__Group_0_2__18138);
            rule__Atomic__Group_0_2__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_0_2__2_in_rule__Atomic__Group_0_2__18141);
            rule__Atomic__Group_0_2__2();
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
    // $ANTLR end rule__Atomic__Group_0_2__1


    // $ANTLR start rule__Atomic__Group_0_2__1__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4093:1: rule__Atomic__Group_0_2__1__Impl : ( ( rule__Atomic__ActualsAssignment_0_2_1 )? ) ;
    public final void rule__Atomic__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4097:1: ( ( ( rule__Atomic__ActualsAssignment_0_2_1 )? ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4098:1: ( ( rule__Atomic__ActualsAssignment_0_2_1 )? )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4098:1: ( ( rule__Atomic__ActualsAssignment_0_2_1 )? )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4099:1: ( rule__Atomic__ActualsAssignment_0_2_1 )?
            {
             before(grammarAccess.getAtomicAccess().getActualsAssignment_0_2_1()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4100:1: ( rule__Atomic__ActualsAssignment_0_2_1 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=RULE_ID && LA20_0<=RULE_STRING)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4100:2: rule__Atomic__ActualsAssignment_0_2_1
                    {
                    pushFollow(FOLLOW_rule__Atomic__ActualsAssignment_0_2_1_in_rule__Atomic__Group_0_2__1__Impl8168);
                    rule__Atomic__ActualsAssignment_0_2_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAtomicAccess().getActualsAssignment_0_2_1()); 

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
    // $ANTLR end rule__Atomic__Group_0_2__1__Impl


    // $ANTLR start rule__Atomic__Group_0_2__2
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4110:1: rule__Atomic__Group_0_2__2 : rule__Atomic__Group_0_2__2__Impl rule__Atomic__Group_0_2__3 ;
    public final void rule__Atomic__Group_0_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4114:1: ( rule__Atomic__Group_0_2__2__Impl rule__Atomic__Group_0_2__3 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4115:2: rule__Atomic__Group_0_2__2__Impl rule__Atomic__Group_0_2__3
            {
            pushFollow(FOLLOW_rule__Atomic__Group_0_2__2__Impl_in_rule__Atomic__Group_0_2__28199);
            rule__Atomic__Group_0_2__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_0_2__3_in_rule__Atomic__Group_0_2__28202);
            rule__Atomic__Group_0_2__3();
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
    // $ANTLR end rule__Atomic__Group_0_2__2


    // $ANTLR start rule__Atomic__Group_0_2__2__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4122:1: rule__Atomic__Group_0_2__2__Impl : ( ( rule__Atomic__Group_0_2_2__0 )* ) ;
    public final void rule__Atomic__Group_0_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4126:1: ( ( ( rule__Atomic__Group_0_2_2__0 )* ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4127:1: ( ( rule__Atomic__Group_0_2_2__0 )* )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4127:1: ( ( rule__Atomic__Group_0_2_2__0 )* )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4128:1: ( rule__Atomic__Group_0_2_2__0 )*
            {
             before(grammarAccess.getAtomicAccess().getGroup_0_2_2()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4129:1: ( rule__Atomic__Group_0_2_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==21) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4129:2: rule__Atomic__Group_0_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Atomic__Group_0_2_2__0_in_rule__Atomic__Group_0_2__2__Impl8229);
            	    rule__Atomic__Group_0_2_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getAtomicAccess().getGroup_0_2_2()); 

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
    // $ANTLR end rule__Atomic__Group_0_2__2__Impl


    // $ANTLR start rule__Atomic__Group_0_2__3
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4139:1: rule__Atomic__Group_0_2__3 : rule__Atomic__Group_0_2__3__Impl ;
    public final void rule__Atomic__Group_0_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4143:1: ( rule__Atomic__Group_0_2__3__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4144:2: rule__Atomic__Group_0_2__3__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_0_2__3__Impl_in_rule__Atomic__Group_0_2__38260);
            rule__Atomic__Group_0_2__3__Impl();
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
    // $ANTLR end rule__Atomic__Group_0_2__3


    // $ANTLR start rule__Atomic__Group_0_2__3__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4150:1: rule__Atomic__Group_0_2__3__Impl : ( ')' ) ;
    public final void rule__Atomic__Group_0_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4154:1: ( ( ')' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4155:1: ( ')' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4155:1: ( ')' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4156:1: ')'
            {
             before(grammarAccess.getAtomicAccess().getRightParenthesisKeyword_0_2_3()); 
            match(input,18,FOLLOW_18_in_rule__Atomic__Group_0_2__3__Impl8288); 
             after(grammarAccess.getAtomicAccess().getRightParenthesisKeyword_0_2_3()); 

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
    // $ANTLR end rule__Atomic__Group_0_2__3__Impl


    // $ANTLR start rule__Atomic__Group_0_2_2__0
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4177:1: rule__Atomic__Group_0_2_2__0 : rule__Atomic__Group_0_2_2__0__Impl rule__Atomic__Group_0_2_2__1 ;
    public final void rule__Atomic__Group_0_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4181:1: ( rule__Atomic__Group_0_2_2__0__Impl rule__Atomic__Group_0_2_2__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4182:2: rule__Atomic__Group_0_2_2__0__Impl rule__Atomic__Group_0_2_2__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_0_2_2__0__Impl_in_rule__Atomic__Group_0_2_2__08327);
            rule__Atomic__Group_0_2_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_0_2_2__1_in_rule__Atomic__Group_0_2_2__08330);
            rule__Atomic__Group_0_2_2__1();
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
    // $ANTLR end rule__Atomic__Group_0_2_2__0


    // $ANTLR start rule__Atomic__Group_0_2_2__0__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4189:1: rule__Atomic__Group_0_2_2__0__Impl : ( ',' ) ;
    public final void rule__Atomic__Group_0_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4193:1: ( ( ',' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4194:1: ( ',' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4194:1: ( ',' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4195:1: ','
            {
             before(grammarAccess.getAtomicAccess().getCommaKeyword_0_2_2_0()); 
            match(input,21,FOLLOW_21_in_rule__Atomic__Group_0_2_2__0__Impl8358); 
             after(grammarAccess.getAtomicAccess().getCommaKeyword_0_2_2_0()); 

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
    // $ANTLR end rule__Atomic__Group_0_2_2__0__Impl


    // $ANTLR start rule__Atomic__Group_0_2_2__1
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4208:1: rule__Atomic__Group_0_2_2__1 : rule__Atomic__Group_0_2_2__1__Impl ;
    public final void rule__Atomic__Group_0_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4212:1: ( rule__Atomic__Group_0_2_2__1__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4213:2: rule__Atomic__Group_0_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_0_2_2__1__Impl_in_rule__Atomic__Group_0_2_2__18389);
            rule__Atomic__Group_0_2_2__1__Impl();
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
    // $ANTLR end rule__Atomic__Group_0_2_2__1


    // $ANTLR start rule__Atomic__Group_0_2_2__1__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4219:1: rule__Atomic__Group_0_2_2__1__Impl : ( ( rule__Atomic__ActualsAssignment_0_2_2_1 ) ) ;
    public final void rule__Atomic__Group_0_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4223:1: ( ( ( rule__Atomic__ActualsAssignment_0_2_2_1 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4224:1: ( ( rule__Atomic__ActualsAssignment_0_2_2_1 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4224:1: ( ( rule__Atomic__ActualsAssignment_0_2_2_1 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4225:1: ( rule__Atomic__ActualsAssignment_0_2_2_1 )
            {
             before(grammarAccess.getAtomicAccess().getActualsAssignment_0_2_2_1()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4226:1: ( rule__Atomic__ActualsAssignment_0_2_2_1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4226:2: rule__Atomic__ActualsAssignment_0_2_2_1
            {
            pushFollow(FOLLOW_rule__Atomic__ActualsAssignment_0_2_2_1_in_rule__Atomic__Group_0_2_2__1__Impl8416);
            rule__Atomic__ActualsAssignment_0_2_2_1();
            _fsp--;


            }

             after(grammarAccess.getAtomicAccess().getActualsAssignment_0_2_2_1()); 

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
    // $ANTLR end rule__Atomic__Group_0_2_2__1__Impl


    // $ANTLR start rule__Atomic__Group_1__0
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4240:1: rule__Atomic__Group_1__0 : rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 ;
    public final void rule__Atomic__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4244:1: ( rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4245:2: rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_1__0__Impl_in_rule__Atomic__Group_1__08450);
            rule__Atomic__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_1__1_in_rule__Atomic__Group_1__08453);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4252:1: rule__Atomic__Group_1__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4256:1: ( ( () ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4257:1: ( () )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4257:1: ( () )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4258:1: ()
            {
             before(grammarAccess.getAtomicAccess().getNumberLiteralAction_1_0()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4259:1: ()
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4261:1: 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4271:1: rule__Atomic__Group_1__1 : rule__Atomic__Group_1__1__Impl ;
    public final void rule__Atomic__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4275:1: ( rule__Atomic__Group_1__1__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4276:2: rule__Atomic__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_1__1__Impl_in_rule__Atomic__Group_1__18511);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4282:1: rule__Atomic__Group_1__1__Impl : ( ( rule__Atomic__ValueAssignment_1_1 ) ) ;
    public final void rule__Atomic__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4286:1: ( ( ( rule__Atomic__ValueAssignment_1_1 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4287:1: ( ( rule__Atomic__ValueAssignment_1_1 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4287:1: ( ( rule__Atomic__ValueAssignment_1_1 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4288:1: ( rule__Atomic__ValueAssignment_1_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_1_1()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4289:1: ( rule__Atomic__ValueAssignment_1_1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4289:2: rule__Atomic__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Atomic__ValueAssignment_1_1_in_rule__Atomic__Group_1__1__Impl8538);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4303:1: rule__Atomic__Group_2__0 : rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 ;
    public final void rule__Atomic__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4307:1: ( rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4308:2: rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_2__0__Impl_in_rule__Atomic__Group_2__08572);
            rule__Atomic__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_2__1_in_rule__Atomic__Group_2__08575);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4315:1: rule__Atomic__Group_2__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4319:1: ( ( () ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4320:1: ( () )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4320:1: ( () )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4321:1: ()
            {
             before(grammarAccess.getAtomicAccess().getStringLiteralAction_2_0()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4322:1: ()
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4324:1: 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4334:1: rule__Atomic__Group_2__1 : rule__Atomic__Group_2__1__Impl ;
    public final void rule__Atomic__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4338:1: ( rule__Atomic__Group_2__1__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4339:2: rule__Atomic__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_2__1__Impl_in_rule__Atomic__Group_2__18633);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4345:1: rule__Atomic__Group_2__1__Impl : ( ( rule__Atomic__ValueAssignment_2_1 ) ) ;
    public final void rule__Atomic__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4349:1: ( ( ( rule__Atomic__ValueAssignment_2_1 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4350:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4350:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4351:1: ( rule__Atomic__ValueAssignment_2_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_2_1()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4352:1: ( rule__Atomic__ValueAssignment_2_1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4352:2: rule__Atomic__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Atomic__ValueAssignment_2_1_in_rule__Atomic__Group_2__1__Impl8660);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4366:1: rule__QID__Group__0 : rule__QID__Group__0__Impl rule__QID__Group__1 ;
    public final void rule__QID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4370:1: ( rule__QID__Group__0__Impl rule__QID__Group__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4371:2: rule__QID__Group__0__Impl rule__QID__Group__1
            {
            pushFollow(FOLLOW_rule__QID__Group__0__Impl_in_rule__QID__Group__08694);
            rule__QID__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__QID__Group__1_in_rule__QID__Group__08697);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4378:1: rule__QID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4382:1: ( ( RULE_ID ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4383:1: ( RULE_ID )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4383:1: ( RULE_ID )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4384:1: RULE_ID
            {
             before(grammarAccess.getQIDAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QID__Group__0__Impl8724); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4395:1: rule__QID__Group__1 : rule__QID__Group__1__Impl ;
    public final void rule__QID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4399:1: ( rule__QID__Group__1__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4400:2: rule__QID__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QID__Group__1__Impl_in_rule__QID__Group__18753);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4406:1: rule__QID__Group__1__Impl : ( ( rule__QID__Group_1__0 )* ) ;
    public final void rule__QID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4410:1: ( ( ( rule__QID__Group_1__0 )* ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4411:1: ( ( rule__QID__Group_1__0 )* )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4411:1: ( ( rule__QID__Group_1__0 )* )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4412:1: ( rule__QID__Group_1__0 )*
            {
             before(grammarAccess.getQIDAccess().getGroup_1()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4413:1: ( rule__QID__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==14) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4413:2: rule__QID__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QID__Group_1__0_in_rule__QID__Group__1__Impl8780);
            	    rule__QID__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4427:1: rule__QID__Group_1__0 : rule__QID__Group_1__0__Impl rule__QID__Group_1__1 ;
    public final void rule__QID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4431:1: ( rule__QID__Group_1__0__Impl rule__QID__Group_1__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4432:2: rule__QID__Group_1__0__Impl rule__QID__Group_1__1
            {
            pushFollow(FOLLOW_rule__QID__Group_1__0__Impl_in_rule__QID__Group_1__08815);
            rule__QID__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__QID__Group_1__1_in_rule__QID__Group_1__08818);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4439:1: rule__QID__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4443:1: ( ( '.' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4444:1: ( '.' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4444:1: ( '.' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4445:1: '.'
            {
             before(grammarAccess.getQIDAccess().getFullStopKeyword_1_0()); 
            match(input,14,FOLLOW_14_in_rule__QID__Group_1__0__Impl8846); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4458:1: rule__QID__Group_1__1 : rule__QID__Group_1__1__Impl ;
    public final void rule__QID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4462:1: ( rule__QID__Group_1__1__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4463:2: rule__QID__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QID__Group_1__1__Impl_in_rule__QID__Group_1__18877);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4469:1: rule__QID__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4473:1: ( ( RULE_ID ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4474:1: ( RULE_ID )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4474:1: ( RULE_ID )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4475:1: RULE_ID
            {
             before(grammarAccess.getQIDAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QID__Group_1__1__Impl8904); 
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


    // $ANTLR start rule__Model__IsTestedAssignment_0
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4491:1: rule__Model__IsTestedAssignment_0 : ( ( 'tested' ) ) ;
    public final void rule__Model__IsTestedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4495:1: ( ( ( 'tested' ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4496:1: ( ( 'tested' ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4496:1: ( ( 'tested' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4497:1: ( 'tested' )
            {
             before(grammarAccess.getModelAccess().getIsTestedTestedKeyword_0_0()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4498:1: ( 'tested' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4499:1: 'tested'
            {
             before(grammarAccess.getModelAccess().getIsTestedTestedKeyword_0_0()); 
            match(input,40,FOLLOW_40_in_rule__Model__IsTestedAssignment_08947); 
             after(grammarAccess.getModelAccess().getIsTestedTestedKeyword_0_0()); 

            }

             after(grammarAccess.getModelAccess().getIsTestedTestedKeyword_0_0()); 

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
    // $ANTLR end rule__Model__IsTestedAssignment_0


    // $ANTLR start rule__Model__NameAssignment_2
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4514:1: rule__Model__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4518:1: ( ( RULE_ID ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4519:1: ( RULE_ID )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4519:1: ( RULE_ID )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4520:1: RULE_ID
            {
             before(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Model__NameAssignment_28986); 
             after(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end rule__Model__NameAssignment_2


    // $ANTLR start rule__Model__UsingsAssignment_3
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4529:1: rule__Model__UsingsAssignment_3 : ( ruleUsing ) ;
    public final void rule__Model__UsingsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4533:1: ( ( ruleUsing ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4534:1: ( ruleUsing )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4534:1: ( ruleUsing )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4535:1: ruleUsing
            {
             before(grammarAccess.getModelAccess().getUsingsUsingParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleUsing_in_rule__Model__UsingsAssignment_39017);
            ruleUsing();
            _fsp--;

             after(grammarAccess.getModelAccess().getUsingsUsingParserRuleCall_3_0()); 

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
    // $ANTLR end rule__Model__UsingsAssignment_3


    // $ANTLR start rule__Model__ElementsAssignment_4_0
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4544:1: rule__Model__ElementsAssignment_4_0 : ( ruleElement ) ;
    public final void rule__Model__ElementsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4548:1: ( ( ruleElement ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4549:1: ( ruleElement )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4549:1: ( ruleElement )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4550:1: ruleElement
            {
             before(grammarAccess.getModelAccess().getElementsElementParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_ruleElement_in_rule__Model__ElementsAssignment_4_09048);
            ruleElement();
            _fsp--;

             after(grammarAccess.getModelAccess().getElementsElementParserRuleCall_4_0_0()); 

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
    // $ANTLR end rule__Model__ElementsAssignment_4_0


    // $ANTLR start rule__Model__FunctionsAssignment_4_1
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4559:1: rule__Model__FunctionsAssignment_4_1 : ( ruleFunctionDeclaration ) ;
    public final void rule__Model__FunctionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4563:1: ( ( ruleFunctionDeclaration ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4564:1: ( ruleFunctionDeclaration )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4564:1: ( ruleFunctionDeclaration )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4565:1: ruleFunctionDeclaration
            {
             before(grammarAccess.getModelAccess().getFunctionsFunctionDeclarationParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleFunctionDeclaration_in_rule__Model__FunctionsAssignment_4_19079);
            ruleFunctionDeclaration();
            _fsp--;

             after(grammarAccess.getModelAccess().getFunctionsFunctionDeclarationParserRuleCall_4_1_0()); 

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
    // $ANTLR end rule__Model__FunctionsAssignment_4_1


    // $ANTLR start rule__Using__ImportedNamespaceAssignment_1
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4574:1: rule__Using__ImportedNamespaceAssignment_1 : ( ruleImportID ) ;
    public final void rule__Using__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4578:1: ( ( ruleImportID ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4579:1: ( ruleImportID )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4579:1: ( ruleImportID )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4580:1: ruleImportID
            {
             before(grammarAccess.getUsingAccess().getImportedNamespaceImportIDParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleImportID_in_rule__Using__ImportedNamespaceAssignment_19110);
            ruleImportID();
            _fsp--;

             after(grammarAccess.getUsingAccess().getImportedNamespaceImportIDParserRuleCall_1_0()); 

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
    // $ANTLR end rule__Using__ImportedNamespaceAssignment_1


    // $ANTLR start rule__FunctionDeclaration__TypeAssignment_2
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4589:1: rule__FunctionDeclaration__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__FunctionDeclaration__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4593:1: ( ( ruleType ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4594:1: ( ruleType )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4594:1: ( ruleType )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4595:1: ruleType
            {
             before(grammarAccess.getFunctionDeclarationAccess().getTypeTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__FunctionDeclaration__TypeAssignment_29141);
            ruleType();
            _fsp--;

             after(grammarAccess.getFunctionDeclarationAccess().getTypeTypeParserRuleCall_2_0()); 

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
    // $ANTLR end rule__FunctionDeclaration__TypeAssignment_2


    // $ANTLR start rule__FunctionDeclaration__NameAssignment_3
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4604:1: rule__FunctionDeclaration__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__FunctionDeclaration__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4608:1: ( ( RULE_ID ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4609:1: ( RULE_ID )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4609:1: ( RULE_ID )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4610:1: RULE_ID
            {
             before(grammarAccess.getFunctionDeclarationAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FunctionDeclaration__NameAssignment_39172); 
             after(grammarAccess.getFunctionDeclarationAccess().getNameIDTerminalRuleCall_3_0()); 

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
    // $ANTLR end rule__FunctionDeclaration__NameAssignment_3


    // $ANTLR start rule__FunctionDeclaration__ParamsAssignment_5_0
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4619:1: rule__FunctionDeclaration__ParamsAssignment_5_0 : ( ruleParameter ) ;
    public final void rule__FunctionDeclaration__ParamsAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4623:1: ( ( ruleParameter ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4624:1: ( ruleParameter )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4624:1: ( ruleParameter )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4625:1: ruleParameter
            {
             before(grammarAccess.getFunctionDeclarationAccess().getParamsParameterParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__FunctionDeclaration__ParamsAssignment_5_09203);
            ruleParameter();
            _fsp--;

             after(grammarAccess.getFunctionDeclarationAccess().getParamsParameterParserRuleCall_5_0_0()); 

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
    // $ANTLR end rule__FunctionDeclaration__ParamsAssignment_5_0


    // $ANTLR start rule__FunctionDeclaration__ParamsAssignment_5_1_1
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4634:1: rule__FunctionDeclaration__ParamsAssignment_5_1_1 : ( ruleParameter ) ;
    public final void rule__FunctionDeclaration__ParamsAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4638:1: ( ( ruleParameter ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4639:1: ( ruleParameter )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4639:1: ( ruleParameter )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4640:1: ruleParameter
            {
             before(grammarAccess.getFunctionDeclarationAccess().getParamsParameterParserRuleCall_5_1_1_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__FunctionDeclaration__ParamsAssignment_5_1_19234);
            ruleParameter();
            _fsp--;

             after(grammarAccess.getFunctionDeclarationAccess().getParamsParameterParserRuleCall_5_1_1_0()); 

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
    // $ANTLR end rule__FunctionDeclaration__ParamsAssignment_5_1_1


    // $ANTLR start rule__FunctionDeclaration__ElementsAssignment_8
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4649:1: rule__FunctionDeclaration__ElementsAssignment_8 : ( ruleElement ) ;
    public final void rule__FunctionDeclaration__ElementsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4653:1: ( ( ruleElement ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4654:1: ( ruleElement )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4654:1: ( ruleElement )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4655:1: ruleElement
            {
             before(grammarAccess.getFunctionDeclarationAccess().getElementsElementParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleElement_in_rule__FunctionDeclaration__ElementsAssignment_89265);
            ruleElement();
            _fsp--;

             after(grammarAccess.getFunctionDeclarationAccess().getElementsElementParserRuleCall_8_0()); 

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
    // $ANTLR end rule__FunctionDeclaration__ElementsAssignment_8


    // $ANTLR start rule__Return__ExprAssignment_1
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4664:1: rule__Return__ExprAssignment_1 : ( ruleExpr ) ;
    public final void rule__Return__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4668:1: ( ( ruleExpr ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4669:1: ( ruleExpr )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4669:1: ( ruleExpr )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4670:1: ruleExpr
            {
             before(grammarAccess.getReturnAccess().getExprExprParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleExpr_in_rule__Return__ExprAssignment_19296);
            ruleExpr();
            _fsp--;

             after(grammarAccess.getReturnAccess().getExprExprParserRuleCall_1_0()); 

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
    // $ANTLR end rule__Return__ExprAssignment_1


    // $ANTLR start rule__Parameter__TypeAssignment_1
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4679:1: rule__Parameter__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__Parameter__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4683:1: ( ( ruleType ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4684:1: ( ruleType )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4684:1: ( ruleType )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4685:1: ruleType
            {
             before(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Parameter__TypeAssignment_19327);
            ruleType();
            _fsp--;

             after(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_1_0()); 

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
    // $ANTLR end rule__Parameter__TypeAssignment_1


    // $ANTLR start rule__Parameter__NameAssignment_2
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4694:1: rule__Parameter__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4698:1: ( ( RULE_ID ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4699:1: ( RULE_ID )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4699:1: ( RULE_ID )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4700:1: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_29358); 
             after(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end rule__Parameter__NameAssignment_2


    // $ANTLR start rule__Assert__ActualAssignment_1
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4709:1: rule__Assert__ActualAssignment_1 : ( ruleExpr ) ;
    public final void rule__Assert__ActualAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4713:1: ( ( ruleExpr ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4714:1: ( ruleExpr )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4714:1: ( ruleExpr )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4715:1: ruleExpr
            {
             before(grammarAccess.getAssertAccess().getActualExprParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleExpr_in_rule__Assert__ActualAssignment_19389);
            ruleExpr();
            _fsp--;

             after(grammarAccess.getAssertAccess().getActualExprParserRuleCall_1_0()); 

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
    // $ANTLR end rule__Assert__ActualAssignment_1


    // $ANTLR start rule__Assert__ExpectedAssignment_3
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4724:1: rule__Assert__ExpectedAssignment_3 : ( ruleExpr ) ;
    public final void rule__Assert__ExpectedAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4728:1: ( ( ruleExpr ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4729:1: ( ruleExpr )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4729:1: ( ruleExpr )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4730:1: ruleExpr
            {
             before(grammarAccess.getAssertAccess().getExpectedExprParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleExpr_in_rule__Assert__ExpectedAssignment_39420);
            ruleExpr();
            _fsp--;

             after(grammarAccess.getAssertAccess().getExpectedExprParserRuleCall_3_0()); 

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
    // $ANTLR end rule__Assert__ExpectedAssignment_3


    // $ANTLR start rule__Assert__MsgAssignment_4_1
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4739:1: rule__Assert__MsgAssignment_4_1 : ( ruleExpr ) ;
    public final void rule__Assert__MsgAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4743:1: ( ( ruleExpr ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4744:1: ( ruleExpr )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4744:1: ( ruleExpr )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4745:1: ruleExpr
            {
             before(grammarAccess.getAssertAccess().getMsgExprParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleExpr_in_rule__Assert__MsgAssignment_4_19451);
            ruleExpr();
            _fsp--;

             after(grammarAccess.getAssertAccess().getMsgExprParserRuleCall_4_1_0()); 

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
    // $ANTLR end rule__Assert__MsgAssignment_4_1


    // $ANTLR start rule__EnumDecl__NameAssignment_1
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4754:1: rule__EnumDecl__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EnumDecl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4758:1: ( ( RULE_ID ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4759:1: ( RULE_ID )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4759:1: ( RULE_ID )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4760:1: RULE_ID
            {
             before(grammarAccess.getEnumDeclAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumDecl__NameAssignment_19482); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4769:1: rule__EnumDecl__LiteralsAssignment_3 : ( ruleEnumLiteral ) ;
    public final void rule__EnumDecl__LiteralsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4773:1: ( ( ruleEnumLiteral ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4774:1: ( ruleEnumLiteral )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4774:1: ( ruleEnumLiteral )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4775:1: ruleEnumLiteral
            {
             before(grammarAccess.getEnumDeclAccess().getLiteralsEnumLiteralParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEnumLiteral_in_rule__EnumDecl__LiteralsAssignment_39513);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4784:1: rule__EnumLiteral__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EnumLiteral__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4788:1: ( ( RULE_ID ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4789:1: ( RULE_ID )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4789:1: ( RULE_ID )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4790:1: RULE_ID
            {
             before(grammarAccess.getEnumLiteralAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumLiteral__NameAssignment_19544); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4799:1: rule__VarDecl__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__VarDecl__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4803:1: ( ( ruleType ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4804:1: ( ruleType )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4804:1: ( ruleType )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4805:1: ruleType
            {
             before(grammarAccess.getVarDeclAccess().getTypeTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__VarDecl__TypeAssignment_29575);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4814:1: rule__VarDecl__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__VarDecl__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4818:1: ( ( RULE_ID ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4819:1: ( RULE_ID )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4819:1: ( RULE_ID )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4820:1: RULE_ID
            {
             before(grammarAccess.getVarDeclAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VarDecl__NameAssignment_39606); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4829:1: rule__VarDecl__InitAssignment_4_1 : ( ruleExpr ) ;
    public final void rule__VarDecl__InitAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4833:1: ( ( ruleExpr ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4834:1: ( ruleExpr )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4834:1: ( ruleExpr )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4835:1: ruleExpr
            {
             before(grammarAccess.getVarDeclAccess().getInitExprParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleExpr_in_rule__VarDecl__InitAssignment_4_19637);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4844:1: rule__ArrayType__BaseTypeAssignment_3 : ( ruleType ) ;
    public final void rule__ArrayType__BaseTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4848:1: ( ( ruleType ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4849:1: ( ruleType )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4849:1: ( ruleType )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4850:1: ruleType
            {
             before(grammarAccess.getArrayTypeAccess().getBaseTypeTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__ArrayType__BaseTypeAssignment_39668);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4859:1: rule__EnumType__EnumRefAssignment : ( ( RULE_ID ) ) ;
    public final void rule__EnumType__EnumRefAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4863:1: ( ( ( RULE_ID ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4864:1: ( ( RULE_ID ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4864:1: ( ( RULE_ID ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4865:1: ( RULE_ID )
            {
             before(grammarAccess.getEnumTypeAccess().getEnumRefEnumDeclCrossReference_0()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4866:1: ( RULE_ID )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4867:1: RULE_ID
            {
             before(grammarAccess.getEnumTypeAccess().getEnumRefEnumDeclIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumType__EnumRefAssignment9703); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4878:1: rule__Formula__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__Formula__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4882:1: ( ( ruleType ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4883:1: ( ruleType )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4883:1: ( ruleType )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4884:1: ruleType
            {
             before(grammarAccess.getFormulaAccess().getTypeTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Formula__TypeAssignment_29738);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4893:1: rule__Formula__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Formula__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4897:1: ( ( RULE_ID ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4898:1: ( RULE_ID )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4898:1: ( RULE_ID )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4899:1: RULE_ID
            {
             before(grammarAccess.getFormulaAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Formula__NameAssignment_39769); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4908:1: rule__Formula__ExprAssignment_5 : ( ruleExpr ) ;
    public final void rule__Formula__ExprAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4912:1: ( ( ruleExpr ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4913:1: ( ruleExpr )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4913:1: ( ruleExpr )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4914:1: ruleExpr
            {
             before(grammarAccess.getFormulaAccess().getExprExprParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleExpr_in_rule__Formula__ExprAssignment_59800);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4923:1: rule__Comparison__RightAssignment_1_2 : ( ruleAddition ) ;
    public final void rule__Comparison__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4927:1: ( ( ruleAddition ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4928:1: ( ruleAddition )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4928:1: ( ruleAddition )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4929:1: ruleAddition
            {
             before(grammarAccess.getComparisonAccess().getRightAdditionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleAddition_in_rule__Comparison__RightAssignment_1_29831);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4938:1: rule__Addition__RightAssignment_1_2 : ( ruleMultiplication ) ;
    public final void rule__Addition__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4942:1: ( ( ruleMultiplication ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4943:1: ( ruleMultiplication )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4943:1: ( ruleMultiplication )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4944:1: ruleMultiplication
            {
             before(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleMultiplication_in_rule__Addition__RightAssignment_1_29862);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4953:1: rule__Multiplication__RightAssignment_1_2 : ( rulePostfixOperators ) ;
    public final void rule__Multiplication__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4957:1: ( ( rulePostfixOperators ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4958:1: ( rulePostfixOperators )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4958:1: ( rulePostfixOperators )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4959:1: rulePostfixOperators
            {
             before(grammarAccess.getMultiplicationAccess().getRightPostfixOperatorsParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_rulePostfixOperators_in_rule__Multiplication__RightAssignment_1_29893);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4968:1: rule__PostfixOperators__IndexAssignment_1_2 : ( ruleExpr ) ;
    public final void rule__PostfixOperators__IndexAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4972:1: ( ( ruleExpr ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4973:1: ( ruleExpr )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4973:1: ( ruleExpr )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4974:1: ruleExpr
            {
             before(grammarAccess.getPostfixOperatorsAccess().getIndexExprParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleExpr_in_rule__PostfixOperators__IndexAssignment_1_29924);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4983:1: rule__Atomic__SymbolAssignment_0_1 : ( ( ruleQID ) ) ;
    public final void rule__Atomic__SymbolAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4987:1: ( ( ( ruleQID ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4988:1: ( ( ruleQID ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4988:1: ( ( ruleQID ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4989:1: ( ruleQID )
            {
             before(grammarAccess.getAtomicAccess().getSymbolSymbolCrossReference_0_1_0()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4990:1: ( ruleQID )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4991:1: ruleQID
            {
             before(grammarAccess.getAtomicAccess().getSymbolSymbolQIDParserRuleCall_0_1_0_1()); 
            pushFollow(FOLLOW_ruleQID_in_rule__Atomic__SymbolAssignment_0_19959);
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


    // $ANTLR start rule__Atomic__ActualsAssignment_0_2_1
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:5002:1: rule__Atomic__ActualsAssignment_0_2_1 : ( ruleExpr ) ;
    public final void rule__Atomic__ActualsAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:5006:1: ( ( ruleExpr ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:5007:1: ( ruleExpr )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:5007:1: ( ruleExpr )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:5008:1: ruleExpr
            {
             before(grammarAccess.getAtomicAccess().getActualsExprParserRuleCall_0_2_1_0()); 
            pushFollow(FOLLOW_ruleExpr_in_rule__Atomic__ActualsAssignment_0_2_19994);
            ruleExpr();
            _fsp--;

             after(grammarAccess.getAtomicAccess().getActualsExprParserRuleCall_0_2_1_0()); 

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
    // $ANTLR end rule__Atomic__ActualsAssignment_0_2_1


    // $ANTLR start rule__Atomic__ActualsAssignment_0_2_2_1
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:5017:1: rule__Atomic__ActualsAssignment_0_2_2_1 : ( ruleExpr ) ;
    public final void rule__Atomic__ActualsAssignment_0_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:5021:1: ( ( ruleExpr ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:5022:1: ( ruleExpr )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:5022:1: ( ruleExpr )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:5023:1: ruleExpr
            {
             before(grammarAccess.getAtomicAccess().getActualsExprParserRuleCall_0_2_2_1_0()); 
            pushFollow(FOLLOW_ruleExpr_in_rule__Atomic__ActualsAssignment_0_2_2_110025);
            ruleExpr();
            _fsp--;

             after(grammarAccess.getAtomicAccess().getActualsExprParserRuleCall_0_2_2_1_0()); 

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
    // $ANTLR end rule__Atomic__ActualsAssignment_0_2_2_1


    // $ANTLR start rule__Atomic__ValueAssignment_1_1
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:5032:1: rule__Atomic__ValueAssignment_1_1 : ( RULE_NUMBER ) ;
    public final void rule__Atomic__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:5036:1: ( ( RULE_NUMBER ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:5037:1: ( RULE_NUMBER )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:5037:1: ( RULE_NUMBER )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:5038:1: RULE_NUMBER
            {
             before(grammarAccess.getAtomicAccess().getValueNUMBERTerminalRuleCall_1_1_0()); 
            match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__Atomic__ValueAssignment_1_110056); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:5047:1: rule__Atomic__ValueAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Atomic__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:5051:1: ( ( RULE_STRING ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:5052:1: ( RULE_STRING )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:5052:1: ( RULE_STRING )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:5053:1: RULE_STRING
            {
             before(grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Atomic__ValueAssignment_2_110087); 
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
    public static final BitSet FOLLOW_ruleUsing_in_entryRuleUsing121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUsing128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Using__Group__0_in_ruleUsing154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportID_in_entryRuleImportID181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportID188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportID__Group__0_in_ruleImportID214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_entryRuleElement241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElement248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__Alternatives_in_ruleElement274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDeclaration_in_entryRuleFunctionDeclaration301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionDeclaration308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__0_in_ruleFunctionDeclaration334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturn_in_entryRuleReturn361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReturn368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Return__Group__0_in_ruleReturn394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0_in_ruleParameter454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssert_in_entryRuleAssert481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssert488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assert__Group__0_in_ruleAssert514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumDecl_in_entryRuleEnumDecl541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumDecl548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDecl__Group__0_in_ruleEnumDecl574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumLiteral_in_entryRuleEnumLiteral601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumLiteral608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumLiteral__Group__0_in_ruleEnumLiteral634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDecl_in_entryRuleVarDecl661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarDecl668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__0_in_ruleVarDecl694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_entryRulePrimitiveType781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveType788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Alternatives_in_rulePrimitiveType814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayType_in_entryRuleArrayType841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayType848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__0_in_ruleArrayType874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumType_in_entryRuleEnumType901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumType908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__EnumRefAssignment_in_ruleEnumType934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntType_in_entryRuleIntType961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntType968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntType__Group__0_in_ruleIntType994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolType_in_entryRuleBoolType1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolType1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolType__Group__0_in_ruleBoolType1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatType_in_entryRuleFloatType1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatType1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatType__Group__0_in_ruleFloatType1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_entryRuleStringType1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringType1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringType__Group__0_in_ruleStringType1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormula_in_entryRuleFormula1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormula1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Formula__Group__0_in_ruleFormula1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_entryRuleExpr1261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpr1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleExpr1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_entryRuleComparison1320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparison1327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__0_in_ruleComparison1353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_entryRuleAddition1380 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddition1387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__0_in_ruleAddition1413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_entryRuleMultiplication1440 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplication1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__0_in_ruleMultiplication1473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePostfixOperators_in_entryRulePostfixOperators1500 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePostfixOperators1507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixOperators__Group__0_in_rulePostfixOperators1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_entryRuleAtomic1560 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomic1567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Alternatives_in_ruleAtomic1593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQID_in_entryRuleQID1620 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQID1627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QID__Group__0_in_ruleQID1653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ElementsAssignment_4_0_in_rule__Model__Alternatives_41689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__FunctionsAssignment_4_1_in_rule__Model__Alternatives_41707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDecl_in_rule__Element__Alternatives1740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormula_in_rule__Element__Alternatives1757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumDecl_in_rule__Element__Alternatives1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssert_in_rule__Element__Alternatives1791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturn_in_rule__Element__Alternatives1808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_rule__Type__Alternatives1840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayType_in_rule__Type__Alternatives1857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntType_in_rule__PrimitiveType__Alternatives1889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolType_in_rule__PrimitiveType__Alternatives1906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatType_in_rule__PrimitiveType__Alternatives1923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumType_in_rule__PrimitiveType__Alternatives1940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_rule__PrimitiveType__Alternatives1957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0__0_in_rule__Atomic__Alternatives1989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__0_in_rule__Atomic__Alternatives2007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2__0_in_rule__Atomic__Alternatives2025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02056 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__IsTestedAssignment_0_in_rule__Model__Group__0__Impl2086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12117 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__12120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Model__Group__1__Impl2148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__22179 = new BitSet(new long[]{0x0000002019412002L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__22182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__NameAssignment_2_in_rule__Model__Group__2__Impl2209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__32239 = new BitSet(new long[]{0x0000002019410002L});
    public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__32242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__UsingsAssignment_3_in_rule__Model__Group__3__Impl2269 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__42300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Alternatives_4_in_rule__Model__Group__4__Impl2327 = new BitSet(new long[]{0x0000002019410002L});
    public static final BitSet FOLLOW_rule__Using__Group__0__Impl_in_rule__Using__Group__02368 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Using__Group__1_in_rule__Using__Group__02371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Using__Group__0__Impl2399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Using__Group__1__Impl_in_rule__Using__Group__12430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Using__ImportedNamespaceAssignment_1_in_rule__Using__Group__1__Impl2457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportID__Group__0__Impl_in_rule__ImportID__Group__02491 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__ImportID__Group__1_in_rule__ImportID__Group__02494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ImportID__Group__0__Impl2521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportID__Group__1__Impl_in_rule__ImportID__Group__12550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportID__Group_1__0_in_rule__ImportID__Group__1__Impl2577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportID__Group_1__0__Impl_in_rule__ImportID__Group_1__02611 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__ImportID__Group_1__1_in_rule__ImportID__Group_1__02614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ImportID__Group_1__0__Impl2642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportID__Group_1__1__Impl_in_rule__ImportID__Group_1__12673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ImportID__Group_1__1__Impl2701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__0__Impl_in_rule__FunctionDeclaration__Group__02736 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__1_in_rule__FunctionDeclaration__Group__02739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__1__Impl_in_rule__FunctionDeclaration__Group__12797 = new BitSet(new long[]{0x0000001E40000010L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__2_in_rule__FunctionDeclaration__Group__12800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__FunctionDeclaration__Group__1__Impl2828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__2__Impl_in_rule__FunctionDeclaration__Group__22859 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__3_in_rule__FunctionDeclaration__Group__22862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__TypeAssignment_2_in_rule__FunctionDeclaration__Group__2__Impl2889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__3__Impl_in_rule__FunctionDeclaration__Group__32919 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__4_in_rule__FunctionDeclaration__Group__32922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__NameAssignment_3_in_rule__FunctionDeclaration__Group__3__Impl2949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__4__Impl_in_rule__FunctionDeclaration__Group__42979 = new BitSet(new long[]{0x0000001E40040010L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__5_in_rule__FunctionDeclaration__Group__42982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__FunctionDeclaration__Group__4__Impl3010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__5__Impl_in_rule__FunctionDeclaration__Group__53041 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__6_in_rule__FunctionDeclaration__Group__53044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group_5__0_in_rule__FunctionDeclaration__Group__5__Impl3071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__6__Impl_in_rule__FunctionDeclaration__Group__63102 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__7_in_rule__FunctionDeclaration__Group__63105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__FunctionDeclaration__Group__6__Impl3133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__7__Impl_in_rule__FunctionDeclaration__Group__73164 = new BitSet(new long[]{0x0000002019500000L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__8_in_rule__FunctionDeclaration__Group__73167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__FunctionDeclaration__Group__7__Impl3195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__8__Impl_in_rule__FunctionDeclaration__Group__83226 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__9_in_rule__FunctionDeclaration__Group__83229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__ElementsAssignment_8_in_rule__FunctionDeclaration__Group__8__Impl3256 = new BitSet(new long[]{0x0000002019400002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__9__Impl_in_rule__FunctionDeclaration__Group__93287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__FunctionDeclaration__Group__9__Impl3315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group_5__0__Impl_in_rule__FunctionDeclaration__Group_5__03366 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group_5__1_in_rule__FunctionDeclaration__Group_5__03369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__ParamsAssignment_5_0_in_rule__FunctionDeclaration__Group_5__0__Impl3396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group_5__1__Impl_in_rule__FunctionDeclaration__Group_5__13426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group_5_1__0_in_rule__FunctionDeclaration__Group_5__1__Impl3453 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group_5_1__0__Impl_in_rule__FunctionDeclaration__Group_5_1__03488 = new BitSet(new long[]{0x0000001E40000010L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group_5_1__1_in_rule__FunctionDeclaration__Group_5_1__03491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__FunctionDeclaration__Group_5_1__0__Impl3519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group_5_1__1__Impl_in_rule__FunctionDeclaration__Group_5_1__13550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__ParamsAssignment_5_1_1_in_rule__FunctionDeclaration__Group_5_1__1__Impl3577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Return__Group__0__Impl_in_rule__Return__Group__03611 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__Return__Group__1_in_rule__Return__Group__03614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Return__Group__0__Impl3642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Return__Group__1__Impl_in_rule__Return__Group__13673 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Return__Group__2_in_rule__Return__Group__13676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Return__ExprAssignment_1_in_rule__Return__Group__1__Impl3703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Return__Group__2__Impl_in_rule__Return__Group__23733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Return__Group__2__Impl3761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__03798 = new BitSet(new long[]{0x0000001E40000010L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__03801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__13859 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__13862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__TypeAssignment_1_in_rule__Parameter__Group__1__Impl3889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__23919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__NameAssignment_2_in_rule__Parameter__Group__2__Impl3946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assert__Group__0__Impl_in_rule__Assert__Group__03982 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__Assert__Group__1_in_rule__Assert__Group__03985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Assert__Group__0__Impl4013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assert__Group__1__Impl_in_rule__Assert__Group__14044 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Assert__Group__2_in_rule__Assert__Group__14047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assert__ActualAssignment_1_in_rule__Assert__Group__1__Impl4074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assert__Group__2__Impl_in_rule__Assert__Group__24104 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__Assert__Group__3_in_rule__Assert__Group__24107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Assert__Group__2__Impl4135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assert__Group__3__Impl_in_rule__Assert__Group__34166 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Assert__Group__4_in_rule__Assert__Group__34169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assert__ExpectedAssignment_3_in_rule__Assert__Group__3__Impl4196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assert__Group__4__Impl_in_rule__Assert__Group__44226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assert__Group_4__0_in_rule__Assert__Group__4__Impl4253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assert__Group_4__0__Impl_in_rule__Assert__Group_4__04294 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__Assert__Group_4__1_in_rule__Assert__Group_4__04297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Assert__Group_4__0__Impl4325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assert__Group_4__1__Impl_in_rule__Assert__Group_4__14356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assert__MsgAssignment_4_1_in_rule__Assert__Group_4__1__Impl4383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDecl__Group__0__Impl_in_rule__EnumDecl__Group__04417 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumDecl__Group__1_in_rule__EnumDecl__Group__04420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__EnumDecl__Group__0__Impl4448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDecl__Group__1__Impl_in_rule__EnumDecl__Group__14479 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__EnumDecl__Group__2_in_rule__EnumDecl__Group__14482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDecl__NameAssignment_1_in_rule__EnumDecl__Group__1__Impl4509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDecl__Group__2__Impl_in_rule__EnumDecl__Group__24539 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_rule__EnumDecl__Group__3_in_rule__EnumDecl__Group__24542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__EnumDecl__Group__2__Impl4570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDecl__Group__3__Impl_in_rule__EnumDecl__Group__34601 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__EnumDecl__Group__4_in_rule__EnumDecl__Group__34604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDecl__LiteralsAssignment_3_in_rule__EnumDecl__Group__3__Impl4631 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__EnumDecl__Group__4__Impl_in_rule__EnumDecl__Group__44662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__EnumDecl__Group__4__Impl4690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumLiteral__Group__0__Impl_in_rule__EnumLiteral__Group__04731 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumLiteral__Group__1_in_rule__EnumLiteral__Group__04734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumLiteral__Group__1__Impl_in_rule__EnumLiteral__Group__14792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumLiteral__NameAssignment_1_in_rule__EnumLiteral__Group__1__Impl4819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__0__Impl_in_rule__VarDecl__Group__04853 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__1_in_rule__VarDecl__Group__04856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__1__Impl_in_rule__VarDecl__Group__14914 = new BitSet(new long[]{0x0000001E40000010L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__2_in_rule__VarDecl__Group__14917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__VarDecl__Group__1__Impl4945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__2__Impl_in_rule__VarDecl__Group__24976 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__3_in_rule__VarDecl__Group__24979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__TypeAssignment_2_in_rule__VarDecl__Group__2__Impl5006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__3__Impl_in_rule__VarDecl__Group__35036 = new BitSet(new long[]{0x0000000020800000L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__4_in_rule__VarDecl__Group__35039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__NameAssignment_3_in_rule__VarDecl__Group__3__Impl5066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__4__Impl_in_rule__VarDecl__Group__45096 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__5_in_rule__VarDecl__Group__45099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group_4__0_in_rule__VarDecl__Group__4__Impl5126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__5__Impl_in_rule__VarDecl__Group__55157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__VarDecl__Group__5__Impl5185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group_4__0__Impl_in_rule__VarDecl__Group_4__05228 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__VarDecl__Group_4__1_in_rule__VarDecl__Group_4__05231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__VarDecl__Group_4__0__Impl5259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group_4__1__Impl_in_rule__VarDecl__Group_4__15290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__InitAssignment_4_1_in_rule__VarDecl__Group_4__1__Impl5317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__0__Impl_in_rule__ArrayType__Group__05351 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__1_in_rule__ArrayType__Group__05354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__1__Impl_in_rule__ArrayType__Group__15412 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__2_in_rule__ArrayType__Group__15415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ArrayType__Group__1__Impl5443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__2__Impl_in_rule__ArrayType__Group__25474 = new BitSet(new long[]{0x0000001E40000010L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__3_in_rule__ArrayType__Group__25477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ArrayType__Group__2__Impl5505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__3__Impl_in_rule__ArrayType__Group__35536 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__4_in_rule__ArrayType__Group__35539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__BaseTypeAssignment_3_in_rule__ArrayType__Group__3__Impl5566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__4__Impl_in_rule__ArrayType__Group__45596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ArrayType__Group__4__Impl5624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntType__Group__0__Impl_in_rule__IntType__Group__05665 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__IntType__Group__1_in_rule__IntType__Group__05668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntType__Group__1__Impl_in_rule__IntType__Group__15726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__IntType__Group__1__Impl5754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolType__Group__0__Impl_in_rule__BoolType__Group__05789 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__BoolType__Group__1_in_rule__BoolType__Group__05792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolType__Group__1__Impl_in_rule__BoolType__Group__15850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__BoolType__Group__1__Impl5878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatType__Group__0__Impl_in_rule__FloatType__Group__05913 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__FloatType__Group__1_in_rule__FloatType__Group__05916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatType__Group__1__Impl_in_rule__FloatType__Group__15974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__FloatType__Group__1__Impl6002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringType__Group__0__Impl_in_rule__StringType__Group__06037 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__StringType__Group__1_in_rule__StringType__Group__06040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringType__Group__1__Impl_in_rule__StringType__Group__16098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__StringType__Group__1__Impl6126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Formula__Group__0__Impl_in_rule__Formula__Group__06161 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Formula__Group__1_in_rule__Formula__Group__06164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Formula__Group__1__Impl_in_rule__Formula__Group__16222 = new BitSet(new long[]{0x0000001E40000010L});
    public static final BitSet FOLLOW_rule__Formula__Group__2_in_rule__Formula__Group__16225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Formula__Group__1__Impl6253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Formula__Group__2__Impl_in_rule__Formula__Group__26284 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Formula__Group__3_in_rule__Formula__Group__26287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Formula__TypeAssignment_2_in_rule__Formula__Group__2__Impl6314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Formula__Group__3__Impl_in_rule__Formula__Group__36344 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Formula__Group__4_in_rule__Formula__Group__36347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Formula__NameAssignment_3_in_rule__Formula__Group__3__Impl6374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Formula__Group__4__Impl_in_rule__Formula__Group__46404 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__Formula__Group__5_in_rule__Formula__Group__46407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Formula__Group__4__Impl6435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Formula__Group__5__Impl_in_rule__Formula__Group__56466 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Formula__Group__6_in_rule__Formula__Group__56469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Formula__ExprAssignment_5_in_rule__Formula__Group__5__Impl6496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Formula__Group__6__Impl_in_rule__Formula__Group__66526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Formula__Group__6__Impl6554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__0__Impl_in_rule__Comparison__Group__06599 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__1_in_rule__Comparison__Group__06602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_rule__Comparison__Group__0__Impl6629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__1__Impl_in_rule__Comparison__Group__16658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__0_in_rule__Comparison__Group__1__Impl6685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__0__Impl_in_rule__Comparison__Group_1__06720 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__1_in_rule__Comparison__Group_1__06723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__1__Impl_in_rule__Comparison__Group_1__16781 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__2_in_rule__Comparison__Group_1__16784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Comparison__Group_1__1__Impl6812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__2__Impl_in_rule__Comparison__Group_1__26843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__RightAssignment_1_2_in_rule__Comparison__Group_1__2__Impl6870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__0__Impl_in_rule__Addition__Group__06906 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__1_in_rule__Addition__Group__06909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_rule__Addition__Group__0__Impl6936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__1__Impl_in_rule__Addition__Group__16965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__0_in_rule__Addition__Group__1__Impl6992 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__0__Impl_in_rule__Addition__Group_1__07027 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__1_in_rule__Addition__Group_1__07030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__1__Impl_in_rule__Addition__Group_1__17088 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__2_in_rule__Addition__Group_1__17091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Addition__Group_1__1__Impl7119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__2__Impl_in_rule__Addition__Group_1__27150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__RightAssignment_1_2_in_rule__Addition__Group_1__2__Impl7177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__0__Impl_in_rule__Multiplication__Group__07213 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__1_in_rule__Multiplication__Group__07216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePostfixOperators_in_rule__Multiplication__Group__0__Impl7243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__1__Impl_in_rule__Multiplication__Group__17272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__0_in_rule__Multiplication__Group__1__Impl7299 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__0__Impl_in_rule__Multiplication__Group_1__07334 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__1_in_rule__Multiplication__Group_1__07337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__1__Impl_in_rule__Multiplication__Group_1__17395 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__2_in_rule__Multiplication__Group_1__17398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Multiplication__Group_1__1__Impl7426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__2__Impl_in_rule__Multiplication__Group_1__27457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__RightAssignment_1_2_in_rule__Multiplication__Group_1__2__Impl7484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixOperators__Group__0__Impl_in_rule__PostfixOperators__Group__07520 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__PostfixOperators__Group__1_in_rule__PostfixOperators__Group__07523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_rule__PostfixOperators__Group__0__Impl7550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixOperators__Group__1__Impl_in_rule__PostfixOperators__Group__17579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixOperators__Group_1__0_in_rule__PostfixOperators__Group__1__Impl7606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixOperators__Group_1__0__Impl_in_rule__PostfixOperators__Group_1__07641 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__PostfixOperators__Group_1__1_in_rule__PostfixOperators__Group_1__07644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixOperators__Group_1__1__Impl_in_rule__PostfixOperators__Group_1__17702 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__PostfixOperators__Group_1__2_in_rule__PostfixOperators__Group_1__17705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__PostfixOperators__Group_1__1__Impl7733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixOperators__Group_1__2__Impl_in_rule__PostfixOperators__Group_1__27764 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__PostfixOperators__Group_1__3_in_rule__PostfixOperators__Group_1__27767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixOperators__IndexAssignment_1_2_in_rule__PostfixOperators__Group_1__2__Impl7794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixOperators__Group_1__3__Impl_in_rule__PostfixOperators__Group_1__37824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__PostfixOperators__Group_1__3__Impl7852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0__0__Impl_in_rule__Atomic__Group_0__07891 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0__1_in_rule__Atomic__Group_0__07894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0__1__Impl_in_rule__Atomic__Group_0__17952 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0__2_in_rule__Atomic__Group_0__17955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__SymbolAssignment_0_1_in_rule__Atomic__Group_0__1__Impl7982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0__2__Impl_in_rule__Atomic__Group_0__28012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0_2__0_in_rule__Atomic__Group_0__2__Impl8039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0_2__0__Impl_in_rule__Atomic__Group_0_2__08076 = new BitSet(new long[]{0x0000000000240070L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0_2__1_in_rule__Atomic__Group_0_2__08079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Atomic__Group_0_2__0__Impl8107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0_2__1__Impl_in_rule__Atomic__Group_0_2__18138 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0_2__2_in_rule__Atomic__Group_0_2__18141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ActualsAssignment_0_2_1_in_rule__Atomic__Group_0_2__1__Impl8168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0_2__2__Impl_in_rule__Atomic__Group_0_2__28199 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0_2__3_in_rule__Atomic__Group_0_2__28202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0_2_2__0_in_rule__Atomic__Group_0_2__2__Impl8229 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0_2__3__Impl_in_rule__Atomic__Group_0_2__38260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Atomic__Group_0_2__3__Impl8288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0_2_2__0__Impl_in_rule__Atomic__Group_0_2_2__08327 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0_2_2__1_in_rule__Atomic__Group_0_2_2__08330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Atomic__Group_0_2_2__0__Impl8358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0_2_2__1__Impl_in_rule__Atomic__Group_0_2_2__18389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ActualsAssignment_0_2_2_1_in_rule__Atomic__Group_0_2_2__1__Impl8416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__0__Impl_in_rule__Atomic__Group_1__08450 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__1_in_rule__Atomic__Group_1__08453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__1__Impl_in_rule__Atomic__Group_1__18511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ValueAssignment_1_1_in_rule__Atomic__Group_1__1__Impl8538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2__0__Impl_in_rule__Atomic__Group_2__08572 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2__1_in_rule__Atomic__Group_2__08575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2__1__Impl_in_rule__Atomic__Group_2__18633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ValueAssignment_2_1_in_rule__Atomic__Group_2__1__Impl8660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QID__Group__0__Impl_in_rule__QID__Group__08694 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__QID__Group__1_in_rule__QID__Group__08697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QID__Group__0__Impl8724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QID__Group__1__Impl_in_rule__QID__Group__18753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QID__Group_1__0_in_rule__QID__Group__1__Impl8780 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__QID__Group_1__0__Impl_in_rule__QID__Group_1__08815 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QID__Group_1__1_in_rule__QID__Group_1__08818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__QID__Group_1__0__Impl8846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QID__Group_1__1__Impl_in_rule__QID__Group_1__18877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QID__Group_1__1__Impl8904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Model__IsTestedAssignment_08947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Model__NameAssignment_28986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsing_in_rule__Model__UsingsAssignment_39017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_rule__Model__ElementsAssignment_4_09048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDeclaration_in_rule__Model__FunctionsAssignment_4_19079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportID_in_rule__Using__ImportedNamespaceAssignment_19110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__FunctionDeclaration__TypeAssignment_29141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FunctionDeclaration__NameAssignment_39172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__FunctionDeclaration__ParamsAssignment_5_09203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__FunctionDeclaration__ParamsAssignment_5_1_19234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_rule__FunctionDeclaration__ElementsAssignment_89265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Return__ExprAssignment_19296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Parameter__TypeAssignment_19327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_29358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Assert__ActualAssignment_19389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Assert__ExpectedAssignment_39420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Assert__MsgAssignment_4_19451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumDecl__NameAssignment_19482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumLiteral_in_rule__EnumDecl__LiteralsAssignment_39513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumLiteral__NameAssignment_19544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__VarDecl__TypeAssignment_29575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VarDecl__NameAssignment_39606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__VarDecl__InitAssignment_4_19637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__ArrayType__BaseTypeAssignment_39668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumType__EnumRefAssignment9703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Formula__TypeAssignment_29738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Formula__NameAssignment_39769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Formula__ExprAssignment_59800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_rule__Comparison__RightAssignment_1_29831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_rule__Addition__RightAssignment_1_29862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePostfixOperators_in_rule__Multiplication__RightAssignment_1_29893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__PostfixOperators__IndexAssignment_1_29924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQID_in_rule__Atomic__SymbolAssignment_0_19959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Atomic__ActualsAssignment_0_2_19994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Atomic__ActualsAssignment_0_2_2_110025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__Atomic__ValueAssignment_1_110056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Atomic__ValueAssignment_2_110087 = new BitSet(new long[]{0x0000000000000002L});

}