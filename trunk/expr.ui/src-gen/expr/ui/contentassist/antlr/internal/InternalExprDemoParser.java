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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_NUMBER", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'using'", "'.'", "'*'", "'function'", "'('", "')'", "'{'", "'}'", "','", "'return'", "';'", "'assert'", "'error'", "'enum'", "'var'", "'='", "'array'", "'['", "']'", "'int'", "'bool'", "'float'", "'string'", "'calc'", "'=='", "'+'"
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


    // $ANTLR start rule__Model__Alternatives_3
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:817:1: rule__Model__Alternatives_3 : ( ( ( rule__Model__ElementsAssignment_3_0 ) ) | ( ( rule__Model__FunctionsAssignment_3_1 ) ) );
    public final void rule__Model__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:821:1: ( ( ( rule__Model__ElementsAssignment_3_0 ) ) | ( ( rule__Model__FunctionsAssignment_3_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==22||LA1_0==24||(LA1_0>=26 && LA1_0<=27)||LA1_0==36) ) {
                alt1=1;
            }
            else if ( (LA1_0==16) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("817:1: rule__Model__Alternatives_3 : ( ( ( rule__Model__ElementsAssignment_3_0 ) ) | ( ( rule__Model__FunctionsAssignment_3_1 ) ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:822:1: ( ( rule__Model__ElementsAssignment_3_0 ) )
                    {
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:822:1: ( ( rule__Model__ElementsAssignment_3_0 ) )
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:823:1: ( rule__Model__ElementsAssignment_3_0 )
                    {
                     before(grammarAccess.getModelAccess().getElementsAssignment_3_0()); 
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:824:1: ( rule__Model__ElementsAssignment_3_0 )
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:824:2: rule__Model__ElementsAssignment_3_0
                    {
                    pushFollow(FOLLOW_rule__Model__ElementsAssignment_3_0_in_rule__Model__Alternatives_31689);
                    rule__Model__ElementsAssignment_3_0();
                    _fsp--;


                    }

                     after(grammarAccess.getModelAccess().getElementsAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:828:6: ( ( rule__Model__FunctionsAssignment_3_1 ) )
                    {
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:828:6: ( ( rule__Model__FunctionsAssignment_3_1 ) )
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:829:1: ( rule__Model__FunctionsAssignment_3_1 )
                    {
                     before(grammarAccess.getModelAccess().getFunctionsAssignment_3_1()); 
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:830:1: ( rule__Model__FunctionsAssignment_3_1 )
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:830:2: rule__Model__FunctionsAssignment_3_1
                    {
                    pushFollow(FOLLOW_rule__Model__FunctionsAssignment_3_1_in_rule__Model__Alternatives_31707);
                    rule__Model__FunctionsAssignment_3_1();
                    _fsp--;


                    }

                     after(grammarAccess.getModelAccess().getFunctionsAssignment_3_1()); 

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
    // $ANTLR end rule__Model__Alternatives_3


    // $ANTLR start rule__Element__Alternatives
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:839:1: rule__Element__Alternatives : ( ( ruleVarDecl ) | ( ruleFormula ) | ( ruleEnumDecl ) | ( ruleAssert ) | ( ruleReturn ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:843:1: ( ( ruleVarDecl ) | ( ruleFormula ) | ( ruleEnumDecl ) | ( ruleAssert ) | ( ruleReturn ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt2=1;
                }
                break;
            case 36:
                {
                alt2=2;
                }
                break;
            case 26:
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

            if ( (LA3_0==RULE_ID||(LA3_0>=32 && LA3_0<=35)) ) {
                alt3=1;
            }
            else if ( (LA3_0==29) ) {
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
            case 32:
                {
                alt4=1;
                }
                break;
            case 33:
                {
                alt4=2;
                }
                break;
            case 34:
                {
                alt4=3;
                }
                break;
            case RULE_ID:
                {
                alt4=4;
                }
                break;
            case 35:
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:983:1: rule__Model__Group__0__Impl : ( 'model' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:987:1: ( ( 'model' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:988:1: ( 'model' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:988:1: ( 'model' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:989:1: 'model'
            {
             before(grammarAccess.getModelAccess().getModelKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__Model__Group__0__Impl2087); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1002:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1006:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1007:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12118);
            rule__Model__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__12121);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1014:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1018:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1019:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1019:1: ( ( rule__Model__NameAssignment_1 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1020:1: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1021:1: ( rule__Model__NameAssignment_1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1021:2: rule__Model__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__1__Impl2148);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1031:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1035:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1036:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__22178);
            rule__Model__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__22181);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1043:1: rule__Model__Group__2__Impl : ( ( rule__Model__UsingsAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1047:1: ( ( ( rule__Model__UsingsAssignment_2 )* ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1048:1: ( ( rule__Model__UsingsAssignment_2 )* )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1048:1: ( ( rule__Model__UsingsAssignment_2 )* )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1049:1: ( rule__Model__UsingsAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getUsingsAssignment_2()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1050:1: ( rule__Model__UsingsAssignment_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==13) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1050:2: rule__Model__UsingsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Model__UsingsAssignment_2_in_rule__Model__Group__2__Impl2208);
            	    rule__Model__UsingsAssignment_2();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getUsingsAssignment_2()); 

            }


            }

        }
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1060:1: rule__Model__Group__3 : rule__Model__Group__3__Impl ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1064:1: ( rule__Model__Group__3__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1065:2: rule__Model__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__32239);
            rule__Model__Group__3__Impl();
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1071:1: rule__Model__Group__3__Impl : ( ( rule__Model__Alternatives_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1075:1: ( ( ( rule__Model__Alternatives_3 )* ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1076:1: ( ( rule__Model__Alternatives_3 )* )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1076:1: ( ( rule__Model__Alternatives_3 )* )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1077:1: ( rule__Model__Alternatives_3 )*
            {
             before(grammarAccess.getModelAccess().getAlternatives_3()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1078:1: ( rule__Model__Alternatives_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==16||LA7_0==22||LA7_0==24||(LA7_0>=26 && LA7_0<=27)||LA7_0==36) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1078:2: rule__Model__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_rule__Model__Alternatives_3_in_rule__Model__Group__3__Impl2266);
            	    rule__Model__Alternatives_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getAlternatives_3()); 

            }


            }

        }
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


    // $ANTLR start rule__Using__Group__0
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1096:1: rule__Using__Group__0 : rule__Using__Group__0__Impl rule__Using__Group__1 ;
    public final void rule__Using__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1100:1: ( rule__Using__Group__0__Impl rule__Using__Group__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1101:2: rule__Using__Group__0__Impl rule__Using__Group__1
            {
            pushFollow(FOLLOW_rule__Using__Group__0__Impl_in_rule__Using__Group__02305);
            rule__Using__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Using__Group__1_in_rule__Using__Group__02308);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1108:1: rule__Using__Group__0__Impl : ( 'using' ) ;
    public final void rule__Using__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1112:1: ( ( 'using' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1113:1: ( 'using' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1113:1: ( 'using' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1114:1: 'using'
            {
             before(grammarAccess.getUsingAccess().getUsingKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__Using__Group__0__Impl2336); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1127:1: rule__Using__Group__1 : rule__Using__Group__1__Impl ;
    public final void rule__Using__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1131:1: ( rule__Using__Group__1__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1132:2: rule__Using__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Using__Group__1__Impl_in_rule__Using__Group__12367);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1138:1: rule__Using__Group__1__Impl : ( ( rule__Using__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Using__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1142:1: ( ( ( rule__Using__ImportedNamespaceAssignment_1 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1143:1: ( ( rule__Using__ImportedNamespaceAssignment_1 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1143:1: ( ( rule__Using__ImportedNamespaceAssignment_1 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1144:1: ( rule__Using__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getUsingAccess().getImportedNamespaceAssignment_1()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1145:1: ( rule__Using__ImportedNamespaceAssignment_1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1145:2: rule__Using__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Using__ImportedNamespaceAssignment_1_in_rule__Using__Group__1__Impl2394);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1159:1: rule__ImportID__Group__0 : rule__ImportID__Group__0__Impl rule__ImportID__Group__1 ;
    public final void rule__ImportID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1163:1: ( rule__ImportID__Group__0__Impl rule__ImportID__Group__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1164:2: rule__ImportID__Group__0__Impl rule__ImportID__Group__1
            {
            pushFollow(FOLLOW_rule__ImportID__Group__0__Impl_in_rule__ImportID__Group__02428);
            rule__ImportID__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImportID__Group__1_in_rule__ImportID__Group__02431);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1171:1: rule__ImportID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__ImportID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1175:1: ( ( RULE_ID ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1176:1: ( RULE_ID )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1176:1: ( RULE_ID )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1177:1: RULE_ID
            {
             before(grammarAccess.getImportIDAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ImportID__Group__0__Impl2458); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1188:1: rule__ImportID__Group__1 : rule__ImportID__Group__1__Impl ;
    public final void rule__ImportID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1192:1: ( rule__ImportID__Group__1__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1193:2: rule__ImportID__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ImportID__Group__1__Impl_in_rule__ImportID__Group__12487);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1199:1: rule__ImportID__Group__1__Impl : ( ( rule__ImportID__Group_1__0 ) ) ;
    public final void rule__ImportID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1203:1: ( ( ( rule__ImportID__Group_1__0 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1204:1: ( ( rule__ImportID__Group_1__0 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1204:1: ( ( rule__ImportID__Group_1__0 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1205:1: ( rule__ImportID__Group_1__0 )
            {
             before(grammarAccess.getImportIDAccess().getGroup_1()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1206:1: ( rule__ImportID__Group_1__0 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1206:2: rule__ImportID__Group_1__0
            {
            pushFollow(FOLLOW_rule__ImportID__Group_1__0_in_rule__ImportID__Group__1__Impl2514);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1220:1: rule__ImportID__Group_1__0 : rule__ImportID__Group_1__0__Impl rule__ImportID__Group_1__1 ;
    public final void rule__ImportID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1224:1: ( rule__ImportID__Group_1__0__Impl rule__ImportID__Group_1__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1225:2: rule__ImportID__Group_1__0__Impl rule__ImportID__Group_1__1
            {
            pushFollow(FOLLOW_rule__ImportID__Group_1__0__Impl_in_rule__ImportID__Group_1__02548);
            rule__ImportID__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ImportID__Group_1__1_in_rule__ImportID__Group_1__02551);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1232:1: rule__ImportID__Group_1__0__Impl : ( '.' ) ;
    public final void rule__ImportID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1236:1: ( ( '.' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1237:1: ( '.' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1237:1: ( '.' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1238:1: '.'
            {
             before(grammarAccess.getImportIDAccess().getFullStopKeyword_1_0()); 
            match(input,14,FOLLOW_14_in_rule__ImportID__Group_1__0__Impl2579); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1251:1: rule__ImportID__Group_1__1 : rule__ImportID__Group_1__1__Impl ;
    public final void rule__ImportID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1255:1: ( rule__ImportID__Group_1__1__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1256:2: rule__ImportID__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ImportID__Group_1__1__Impl_in_rule__ImportID__Group_1__12610);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1262:1: rule__ImportID__Group_1__1__Impl : ( '*' ) ;
    public final void rule__ImportID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1266:1: ( ( '*' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1267:1: ( '*' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1267:1: ( '*' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1268:1: '*'
            {
             before(grammarAccess.getImportIDAccess().getAsteriskKeyword_1_1()); 
            match(input,15,FOLLOW_15_in_rule__ImportID__Group_1__1__Impl2638); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1285:1: rule__FunctionDeclaration__Group__0 : rule__FunctionDeclaration__Group__0__Impl rule__FunctionDeclaration__Group__1 ;
    public final void rule__FunctionDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1289:1: ( rule__FunctionDeclaration__Group__0__Impl rule__FunctionDeclaration__Group__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1290:2: rule__FunctionDeclaration__Group__0__Impl rule__FunctionDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__0__Impl_in_rule__FunctionDeclaration__Group__02673);
            rule__FunctionDeclaration__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__1_in_rule__FunctionDeclaration__Group__02676);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1297:1: rule__FunctionDeclaration__Group__0__Impl : ( () ) ;
    public final void rule__FunctionDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1301:1: ( ( () ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1302:1: ( () )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1302:1: ( () )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1303:1: ()
            {
             before(grammarAccess.getFunctionDeclarationAccess().getFunctionDeclarationAction_0()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1304:1: ()
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1306:1: 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1316:1: rule__FunctionDeclaration__Group__1 : rule__FunctionDeclaration__Group__1__Impl rule__FunctionDeclaration__Group__2 ;
    public final void rule__FunctionDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1320:1: ( rule__FunctionDeclaration__Group__1__Impl rule__FunctionDeclaration__Group__2 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1321:2: rule__FunctionDeclaration__Group__1__Impl rule__FunctionDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__1__Impl_in_rule__FunctionDeclaration__Group__12734);
            rule__FunctionDeclaration__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__2_in_rule__FunctionDeclaration__Group__12737);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1328:1: rule__FunctionDeclaration__Group__1__Impl : ( 'function' ) ;
    public final void rule__FunctionDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1332:1: ( ( 'function' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1333:1: ( 'function' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1333:1: ( 'function' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1334:1: 'function'
            {
             before(grammarAccess.getFunctionDeclarationAccess().getFunctionKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__FunctionDeclaration__Group__1__Impl2765); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1347:1: rule__FunctionDeclaration__Group__2 : rule__FunctionDeclaration__Group__2__Impl rule__FunctionDeclaration__Group__3 ;
    public final void rule__FunctionDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1351:1: ( rule__FunctionDeclaration__Group__2__Impl rule__FunctionDeclaration__Group__3 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1352:2: rule__FunctionDeclaration__Group__2__Impl rule__FunctionDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__2__Impl_in_rule__FunctionDeclaration__Group__22796);
            rule__FunctionDeclaration__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__3_in_rule__FunctionDeclaration__Group__22799);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1359:1: rule__FunctionDeclaration__Group__2__Impl : ( ( rule__FunctionDeclaration__TypeAssignment_2 ) ) ;
    public final void rule__FunctionDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1363:1: ( ( ( rule__FunctionDeclaration__TypeAssignment_2 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1364:1: ( ( rule__FunctionDeclaration__TypeAssignment_2 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1364:1: ( ( rule__FunctionDeclaration__TypeAssignment_2 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1365:1: ( rule__FunctionDeclaration__TypeAssignment_2 )
            {
             before(grammarAccess.getFunctionDeclarationAccess().getTypeAssignment_2()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1366:1: ( rule__FunctionDeclaration__TypeAssignment_2 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1366:2: rule__FunctionDeclaration__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__TypeAssignment_2_in_rule__FunctionDeclaration__Group__2__Impl2826);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1376:1: rule__FunctionDeclaration__Group__3 : rule__FunctionDeclaration__Group__3__Impl rule__FunctionDeclaration__Group__4 ;
    public final void rule__FunctionDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1380:1: ( rule__FunctionDeclaration__Group__3__Impl rule__FunctionDeclaration__Group__4 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1381:2: rule__FunctionDeclaration__Group__3__Impl rule__FunctionDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__3__Impl_in_rule__FunctionDeclaration__Group__32856);
            rule__FunctionDeclaration__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__4_in_rule__FunctionDeclaration__Group__32859);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1388:1: rule__FunctionDeclaration__Group__3__Impl : ( ( rule__FunctionDeclaration__NameAssignment_3 ) ) ;
    public final void rule__FunctionDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1392:1: ( ( ( rule__FunctionDeclaration__NameAssignment_3 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1393:1: ( ( rule__FunctionDeclaration__NameAssignment_3 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1393:1: ( ( rule__FunctionDeclaration__NameAssignment_3 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1394:1: ( rule__FunctionDeclaration__NameAssignment_3 )
            {
             before(grammarAccess.getFunctionDeclarationAccess().getNameAssignment_3()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1395:1: ( rule__FunctionDeclaration__NameAssignment_3 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1395:2: rule__FunctionDeclaration__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__NameAssignment_3_in_rule__FunctionDeclaration__Group__3__Impl2886);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1405:1: rule__FunctionDeclaration__Group__4 : rule__FunctionDeclaration__Group__4__Impl rule__FunctionDeclaration__Group__5 ;
    public final void rule__FunctionDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1409:1: ( rule__FunctionDeclaration__Group__4__Impl rule__FunctionDeclaration__Group__5 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1410:2: rule__FunctionDeclaration__Group__4__Impl rule__FunctionDeclaration__Group__5
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__4__Impl_in_rule__FunctionDeclaration__Group__42916);
            rule__FunctionDeclaration__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__5_in_rule__FunctionDeclaration__Group__42919);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1417:1: rule__FunctionDeclaration__Group__4__Impl : ( '(' ) ;
    public final void rule__FunctionDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1421:1: ( ( '(' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1422:1: ( '(' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1422:1: ( '(' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1423:1: '('
            {
             before(grammarAccess.getFunctionDeclarationAccess().getLeftParenthesisKeyword_4()); 
            match(input,17,FOLLOW_17_in_rule__FunctionDeclaration__Group__4__Impl2947); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1436:1: rule__FunctionDeclaration__Group__5 : rule__FunctionDeclaration__Group__5__Impl rule__FunctionDeclaration__Group__6 ;
    public final void rule__FunctionDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1440:1: ( rule__FunctionDeclaration__Group__5__Impl rule__FunctionDeclaration__Group__6 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1441:2: rule__FunctionDeclaration__Group__5__Impl rule__FunctionDeclaration__Group__6
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__5__Impl_in_rule__FunctionDeclaration__Group__52978);
            rule__FunctionDeclaration__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__6_in_rule__FunctionDeclaration__Group__52981);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1448:1: rule__FunctionDeclaration__Group__5__Impl : ( ( rule__FunctionDeclaration__Group_5__0 )? ) ;
    public final void rule__FunctionDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1452:1: ( ( ( rule__FunctionDeclaration__Group_5__0 )? ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1453:1: ( ( rule__FunctionDeclaration__Group_5__0 )? )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1453:1: ( ( rule__FunctionDeclaration__Group_5__0 )? )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1454:1: ( rule__FunctionDeclaration__Group_5__0 )?
            {
             before(grammarAccess.getFunctionDeclarationAccess().getGroup_5()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1455:1: ( rule__FunctionDeclaration__Group_5__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID||LA8_0==29||(LA8_0>=32 && LA8_0<=35)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1455:2: rule__FunctionDeclaration__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__FunctionDeclaration__Group_5__0_in_rule__FunctionDeclaration__Group__5__Impl3008);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1465:1: rule__FunctionDeclaration__Group__6 : rule__FunctionDeclaration__Group__6__Impl rule__FunctionDeclaration__Group__7 ;
    public final void rule__FunctionDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1469:1: ( rule__FunctionDeclaration__Group__6__Impl rule__FunctionDeclaration__Group__7 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1470:2: rule__FunctionDeclaration__Group__6__Impl rule__FunctionDeclaration__Group__7
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__6__Impl_in_rule__FunctionDeclaration__Group__63039);
            rule__FunctionDeclaration__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__7_in_rule__FunctionDeclaration__Group__63042);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1477:1: rule__FunctionDeclaration__Group__6__Impl : ( ')' ) ;
    public final void rule__FunctionDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1481:1: ( ( ')' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1482:1: ( ')' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1482:1: ( ')' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1483:1: ')'
            {
             before(grammarAccess.getFunctionDeclarationAccess().getRightParenthesisKeyword_6()); 
            match(input,18,FOLLOW_18_in_rule__FunctionDeclaration__Group__6__Impl3070); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1496:1: rule__FunctionDeclaration__Group__7 : rule__FunctionDeclaration__Group__7__Impl rule__FunctionDeclaration__Group__8 ;
    public final void rule__FunctionDeclaration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1500:1: ( rule__FunctionDeclaration__Group__7__Impl rule__FunctionDeclaration__Group__8 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1501:2: rule__FunctionDeclaration__Group__7__Impl rule__FunctionDeclaration__Group__8
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__7__Impl_in_rule__FunctionDeclaration__Group__73101);
            rule__FunctionDeclaration__Group__7__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__8_in_rule__FunctionDeclaration__Group__73104);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1508:1: rule__FunctionDeclaration__Group__7__Impl : ( '{' ) ;
    public final void rule__FunctionDeclaration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1512:1: ( ( '{' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1513:1: ( '{' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1513:1: ( '{' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1514:1: '{'
            {
             before(grammarAccess.getFunctionDeclarationAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,19,FOLLOW_19_in_rule__FunctionDeclaration__Group__7__Impl3132); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1527:1: rule__FunctionDeclaration__Group__8 : rule__FunctionDeclaration__Group__8__Impl rule__FunctionDeclaration__Group__9 ;
    public final void rule__FunctionDeclaration__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1531:1: ( rule__FunctionDeclaration__Group__8__Impl rule__FunctionDeclaration__Group__9 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1532:2: rule__FunctionDeclaration__Group__8__Impl rule__FunctionDeclaration__Group__9
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__8__Impl_in_rule__FunctionDeclaration__Group__83163);
            rule__FunctionDeclaration__Group__8__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__9_in_rule__FunctionDeclaration__Group__83166);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1539:1: rule__FunctionDeclaration__Group__8__Impl : ( ( rule__FunctionDeclaration__ElementsAssignment_8 )* ) ;
    public final void rule__FunctionDeclaration__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1543:1: ( ( ( rule__FunctionDeclaration__ElementsAssignment_8 )* ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1544:1: ( ( rule__FunctionDeclaration__ElementsAssignment_8 )* )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1544:1: ( ( rule__FunctionDeclaration__ElementsAssignment_8 )* )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1545:1: ( rule__FunctionDeclaration__ElementsAssignment_8 )*
            {
             before(grammarAccess.getFunctionDeclarationAccess().getElementsAssignment_8()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1546:1: ( rule__FunctionDeclaration__ElementsAssignment_8 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==22||LA9_0==24||(LA9_0>=26 && LA9_0<=27)||LA9_0==36) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1546:2: rule__FunctionDeclaration__ElementsAssignment_8
            	    {
            	    pushFollow(FOLLOW_rule__FunctionDeclaration__ElementsAssignment_8_in_rule__FunctionDeclaration__Group__8__Impl3193);
            	    rule__FunctionDeclaration__ElementsAssignment_8();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1556:1: rule__FunctionDeclaration__Group__9 : rule__FunctionDeclaration__Group__9__Impl ;
    public final void rule__FunctionDeclaration__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1560:1: ( rule__FunctionDeclaration__Group__9__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1561:2: rule__FunctionDeclaration__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__9__Impl_in_rule__FunctionDeclaration__Group__93224);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1567:1: rule__FunctionDeclaration__Group__9__Impl : ( '}' ) ;
    public final void rule__FunctionDeclaration__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1571:1: ( ( '}' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1572:1: ( '}' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1572:1: ( '}' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1573:1: '}'
            {
             before(grammarAccess.getFunctionDeclarationAccess().getRightCurlyBracketKeyword_9()); 
            match(input,20,FOLLOW_20_in_rule__FunctionDeclaration__Group__9__Impl3252); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1606:1: rule__FunctionDeclaration__Group_5__0 : rule__FunctionDeclaration__Group_5__0__Impl rule__FunctionDeclaration__Group_5__1 ;
    public final void rule__FunctionDeclaration__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1610:1: ( rule__FunctionDeclaration__Group_5__0__Impl rule__FunctionDeclaration__Group_5__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1611:2: rule__FunctionDeclaration__Group_5__0__Impl rule__FunctionDeclaration__Group_5__1
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group_5__0__Impl_in_rule__FunctionDeclaration__Group_5__03303);
            rule__FunctionDeclaration__Group_5__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FunctionDeclaration__Group_5__1_in_rule__FunctionDeclaration__Group_5__03306);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1618:1: rule__FunctionDeclaration__Group_5__0__Impl : ( ( rule__FunctionDeclaration__ParamsAssignment_5_0 ) ) ;
    public final void rule__FunctionDeclaration__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1622:1: ( ( ( rule__FunctionDeclaration__ParamsAssignment_5_0 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1623:1: ( ( rule__FunctionDeclaration__ParamsAssignment_5_0 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1623:1: ( ( rule__FunctionDeclaration__ParamsAssignment_5_0 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1624:1: ( rule__FunctionDeclaration__ParamsAssignment_5_0 )
            {
             before(grammarAccess.getFunctionDeclarationAccess().getParamsAssignment_5_0()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1625:1: ( rule__FunctionDeclaration__ParamsAssignment_5_0 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1625:2: rule__FunctionDeclaration__ParamsAssignment_5_0
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__ParamsAssignment_5_0_in_rule__FunctionDeclaration__Group_5__0__Impl3333);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1635:1: rule__FunctionDeclaration__Group_5__1 : rule__FunctionDeclaration__Group_5__1__Impl ;
    public final void rule__FunctionDeclaration__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1639:1: ( rule__FunctionDeclaration__Group_5__1__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1640:2: rule__FunctionDeclaration__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group_5__1__Impl_in_rule__FunctionDeclaration__Group_5__13363);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1646:1: rule__FunctionDeclaration__Group_5__1__Impl : ( ( rule__FunctionDeclaration__Group_5_1__0 )* ) ;
    public final void rule__FunctionDeclaration__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1650:1: ( ( ( rule__FunctionDeclaration__Group_5_1__0 )* ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1651:1: ( ( rule__FunctionDeclaration__Group_5_1__0 )* )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1651:1: ( ( rule__FunctionDeclaration__Group_5_1__0 )* )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1652:1: ( rule__FunctionDeclaration__Group_5_1__0 )*
            {
             before(grammarAccess.getFunctionDeclarationAccess().getGroup_5_1()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1653:1: ( rule__FunctionDeclaration__Group_5_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1653:2: rule__FunctionDeclaration__Group_5_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FunctionDeclaration__Group_5_1__0_in_rule__FunctionDeclaration__Group_5__1__Impl3390);
            	    rule__FunctionDeclaration__Group_5_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1667:1: rule__FunctionDeclaration__Group_5_1__0 : rule__FunctionDeclaration__Group_5_1__0__Impl rule__FunctionDeclaration__Group_5_1__1 ;
    public final void rule__FunctionDeclaration__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1671:1: ( rule__FunctionDeclaration__Group_5_1__0__Impl rule__FunctionDeclaration__Group_5_1__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1672:2: rule__FunctionDeclaration__Group_5_1__0__Impl rule__FunctionDeclaration__Group_5_1__1
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group_5_1__0__Impl_in_rule__FunctionDeclaration__Group_5_1__03425);
            rule__FunctionDeclaration__Group_5_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FunctionDeclaration__Group_5_1__1_in_rule__FunctionDeclaration__Group_5_1__03428);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1679:1: rule__FunctionDeclaration__Group_5_1__0__Impl : ( ',' ) ;
    public final void rule__FunctionDeclaration__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1683:1: ( ( ',' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1684:1: ( ',' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1684:1: ( ',' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1685:1: ','
            {
             before(grammarAccess.getFunctionDeclarationAccess().getCommaKeyword_5_1_0()); 
            match(input,21,FOLLOW_21_in_rule__FunctionDeclaration__Group_5_1__0__Impl3456); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1698:1: rule__FunctionDeclaration__Group_5_1__1 : rule__FunctionDeclaration__Group_5_1__1__Impl ;
    public final void rule__FunctionDeclaration__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1702:1: ( rule__FunctionDeclaration__Group_5_1__1__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1703:2: rule__FunctionDeclaration__Group_5_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group_5_1__1__Impl_in_rule__FunctionDeclaration__Group_5_1__13487);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1709:1: rule__FunctionDeclaration__Group_5_1__1__Impl : ( ( rule__FunctionDeclaration__ParamsAssignment_5_1_1 ) ) ;
    public final void rule__FunctionDeclaration__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1713:1: ( ( ( rule__FunctionDeclaration__ParamsAssignment_5_1_1 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1714:1: ( ( rule__FunctionDeclaration__ParamsAssignment_5_1_1 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1714:1: ( ( rule__FunctionDeclaration__ParamsAssignment_5_1_1 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1715:1: ( rule__FunctionDeclaration__ParamsAssignment_5_1_1 )
            {
             before(grammarAccess.getFunctionDeclarationAccess().getParamsAssignment_5_1_1()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1716:1: ( rule__FunctionDeclaration__ParamsAssignment_5_1_1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1716:2: rule__FunctionDeclaration__ParamsAssignment_5_1_1
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__ParamsAssignment_5_1_1_in_rule__FunctionDeclaration__Group_5_1__1__Impl3514);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1730:1: rule__Return__Group__0 : rule__Return__Group__0__Impl rule__Return__Group__1 ;
    public final void rule__Return__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1734:1: ( rule__Return__Group__0__Impl rule__Return__Group__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1735:2: rule__Return__Group__0__Impl rule__Return__Group__1
            {
            pushFollow(FOLLOW_rule__Return__Group__0__Impl_in_rule__Return__Group__03548);
            rule__Return__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Return__Group__1_in_rule__Return__Group__03551);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1742:1: rule__Return__Group__0__Impl : ( 'return' ) ;
    public final void rule__Return__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1746:1: ( ( 'return' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1747:1: ( 'return' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1747:1: ( 'return' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1748:1: 'return'
            {
             before(grammarAccess.getReturnAccess().getReturnKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__Return__Group__0__Impl3579); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1761:1: rule__Return__Group__1 : rule__Return__Group__1__Impl rule__Return__Group__2 ;
    public final void rule__Return__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1765:1: ( rule__Return__Group__1__Impl rule__Return__Group__2 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1766:2: rule__Return__Group__1__Impl rule__Return__Group__2
            {
            pushFollow(FOLLOW_rule__Return__Group__1__Impl_in_rule__Return__Group__13610);
            rule__Return__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Return__Group__2_in_rule__Return__Group__13613);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1773:1: rule__Return__Group__1__Impl : ( ( rule__Return__ExprAssignment_1 ) ) ;
    public final void rule__Return__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1777:1: ( ( ( rule__Return__ExprAssignment_1 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1778:1: ( ( rule__Return__ExprAssignment_1 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1778:1: ( ( rule__Return__ExprAssignment_1 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1779:1: ( rule__Return__ExprAssignment_1 )
            {
             before(grammarAccess.getReturnAccess().getExprAssignment_1()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1780:1: ( rule__Return__ExprAssignment_1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1780:2: rule__Return__ExprAssignment_1
            {
            pushFollow(FOLLOW_rule__Return__ExprAssignment_1_in_rule__Return__Group__1__Impl3640);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1790:1: rule__Return__Group__2 : rule__Return__Group__2__Impl ;
    public final void rule__Return__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1794:1: ( rule__Return__Group__2__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1795:2: rule__Return__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Return__Group__2__Impl_in_rule__Return__Group__23670);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1801:1: rule__Return__Group__2__Impl : ( ';' ) ;
    public final void rule__Return__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1805:1: ( ( ';' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1806:1: ( ';' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1806:1: ( ';' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1807:1: ';'
            {
             before(grammarAccess.getReturnAccess().getSemicolonKeyword_2()); 
            match(input,23,FOLLOW_23_in_rule__Return__Group__2__Impl3698); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1826:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1830:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1831:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__03735);
            rule__Parameter__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__03738);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1838:1: rule__Parameter__Group__0__Impl : ( () ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1842:1: ( ( () ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1843:1: ( () )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1843:1: ( () )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1844:1: ()
            {
             before(grammarAccess.getParameterAccess().getParameterAction_0()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1845:1: ()
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1847:1: 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1857:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1861:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1862:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__13796);
            rule__Parameter__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__13799);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1869:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__TypeAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1873:1: ( ( ( rule__Parameter__TypeAssignment_1 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1874:1: ( ( rule__Parameter__TypeAssignment_1 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1874:1: ( ( rule__Parameter__TypeAssignment_1 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1875:1: ( rule__Parameter__TypeAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_1()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1876:1: ( rule__Parameter__TypeAssignment_1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1876:2: rule__Parameter__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Parameter__TypeAssignment_1_in_rule__Parameter__Group__1__Impl3826);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1886:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1890:1: ( rule__Parameter__Group__2__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1891:2: rule__Parameter__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__23856);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1897:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__NameAssignment_2 ) ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1901:1: ( ( ( rule__Parameter__NameAssignment_2 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1902:1: ( ( rule__Parameter__NameAssignment_2 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1902:1: ( ( rule__Parameter__NameAssignment_2 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1903:1: ( rule__Parameter__NameAssignment_2 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_2()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1904:1: ( rule__Parameter__NameAssignment_2 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1904:2: rule__Parameter__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Parameter__NameAssignment_2_in_rule__Parameter__Group__2__Impl3883);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1920:1: rule__Assert__Group__0 : rule__Assert__Group__0__Impl rule__Assert__Group__1 ;
    public final void rule__Assert__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1924:1: ( rule__Assert__Group__0__Impl rule__Assert__Group__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1925:2: rule__Assert__Group__0__Impl rule__Assert__Group__1
            {
            pushFollow(FOLLOW_rule__Assert__Group__0__Impl_in_rule__Assert__Group__03919);
            rule__Assert__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Assert__Group__1_in_rule__Assert__Group__03922);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1932:1: rule__Assert__Group__0__Impl : ( 'assert' ) ;
    public final void rule__Assert__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1936:1: ( ( 'assert' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1937:1: ( 'assert' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1937:1: ( 'assert' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1938:1: 'assert'
            {
             before(grammarAccess.getAssertAccess().getAssertKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__Assert__Group__0__Impl3950); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1951:1: rule__Assert__Group__1 : rule__Assert__Group__1__Impl rule__Assert__Group__2 ;
    public final void rule__Assert__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1955:1: ( rule__Assert__Group__1__Impl rule__Assert__Group__2 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1956:2: rule__Assert__Group__1__Impl rule__Assert__Group__2
            {
            pushFollow(FOLLOW_rule__Assert__Group__1__Impl_in_rule__Assert__Group__13981);
            rule__Assert__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Assert__Group__2_in_rule__Assert__Group__13984);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1963:1: rule__Assert__Group__1__Impl : ( ( rule__Assert__ExpressionAssignment_1 ) ) ;
    public final void rule__Assert__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1967:1: ( ( ( rule__Assert__ExpressionAssignment_1 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1968:1: ( ( rule__Assert__ExpressionAssignment_1 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1968:1: ( ( rule__Assert__ExpressionAssignment_1 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1969:1: ( rule__Assert__ExpressionAssignment_1 )
            {
             before(grammarAccess.getAssertAccess().getExpressionAssignment_1()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1970:1: ( rule__Assert__ExpressionAssignment_1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1970:2: rule__Assert__ExpressionAssignment_1
            {
            pushFollow(FOLLOW_rule__Assert__ExpressionAssignment_1_in_rule__Assert__Group__1__Impl4011);
            rule__Assert__ExpressionAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getAssertAccess().getExpressionAssignment_1()); 

            }


            }

        }
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1980:1: rule__Assert__Group__2 : rule__Assert__Group__2__Impl ;
    public final void rule__Assert__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1984:1: ( rule__Assert__Group__2__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1985:2: rule__Assert__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Assert__Group__2__Impl_in_rule__Assert__Group__24041);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1991:1: rule__Assert__Group__2__Impl : ( ( rule__Assert__Group_2__0 )? ) ;
    public final void rule__Assert__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1995:1: ( ( ( rule__Assert__Group_2__0 )? ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1996:1: ( ( rule__Assert__Group_2__0 )? )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1996:1: ( ( rule__Assert__Group_2__0 )? )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1997:1: ( rule__Assert__Group_2__0 )?
            {
             before(grammarAccess.getAssertAccess().getGroup_2()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1998:1: ( rule__Assert__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:1998:2: rule__Assert__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Assert__Group_2__0_in_rule__Assert__Group__2__Impl4068);
                    rule__Assert__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssertAccess().getGroup_2()); 

            }


            }

        }
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


    // $ANTLR start rule__Assert__Group_2__0
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2014:1: rule__Assert__Group_2__0 : rule__Assert__Group_2__0__Impl rule__Assert__Group_2__1 ;
    public final void rule__Assert__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2018:1: ( rule__Assert__Group_2__0__Impl rule__Assert__Group_2__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2019:2: rule__Assert__Group_2__0__Impl rule__Assert__Group_2__1
            {
            pushFollow(FOLLOW_rule__Assert__Group_2__0__Impl_in_rule__Assert__Group_2__04105);
            rule__Assert__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Assert__Group_2__1_in_rule__Assert__Group_2__04108);
            rule__Assert__Group_2__1();
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
    // $ANTLR end rule__Assert__Group_2__0


    // $ANTLR start rule__Assert__Group_2__0__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2026:1: rule__Assert__Group_2__0__Impl : ( 'error' ) ;
    public final void rule__Assert__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2030:1: ( ( 'error' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2031:1: ( 'error' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2031:1: ( 'error' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2032:1: 'error'
            {
             before(grammarAccess.getAssertAccess().getErrorKeyword_2_0()); 
            match(input,25,FOLLOW_25_in_rule__Assert__Group_2__0__Impl4136); 
             after(grammarAccess.getAssertAccess().getErrorKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Assert__Group_2__0__Impl


    // $ANTLR start rule__Assert__Group_2__1
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2045:1: rule__Assert__Group_2__1 : rule__Assert__Group_2__1__Impl ;
    public final void rule__Assert__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2049:1: ( rule__Assert__Group_2__1__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2050:2: rule__Assert__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Assert__Group_2__1__Impl_in_rule__Assert__Group_2__14167);
            rule__Assert__Group_2__1__Impl();
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
    // $ANTLR end rule__Assert__Group_2__1


    // $ANTLR start rule__Assert__Group_2__1__Impl
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2056:1: rule__Assert__Group_2__1__Impl : ( ( rule__Assert__ErrorMsgAssignment_2_1 ) ) ;
    public final void rule__Assert__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2060:1: ( ( ( rule__Assert__ErrorMsgAssignment_2_1 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2061:1: ( ( rule__Assert__ErrorMsgAssignment_2_1 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2061:1: ( ( rule__Assert__ErrorMsgAssignment_2_1 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2062:1: ( rule__Assert__ErrorMsgAssignment_2_1 )
            {
             before(grammarAccess.getAssertAccess().getErrorMsgAssignment_2_1()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2063:1: ( rule__Assert__ErrorMsgAssignment_2_1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2063:2: rule__Assert__ErrorMsgAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Assert__ErrorMsgAssignment_2_1_in_rule__Assert__Group_2__1__Impl4194);
            rule__Assert__ErrorMsgAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getAssertAccess().getErrorMsgAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Assert__Group_2__1__Impl


    // $ANTLR start rule__EnumDecl__Group__0
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2077:1: rule__EnumDecl__Group__0 : rule__EnumDecl__Group__0__Impl rule__EnumDecl__Group__1 ;
    public final void rule__EnumDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2081:1: ( rule__EnumDecl__Group__0__Impl rule__EnumDecl__Group__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2082:2: rule__EnumDecl__Group__0__Impl rule__EnumDecl__Group__1
            {
            pushFollow(FOLLOW_rule__EnumDecl__Group__0__Impl_in_rule__EnumDecl__Group__04228);
            rule__EnumDecl__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EnumDecl__Group__1_in_rule__EnumDecl__Group__04231);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2089:1: rule__EnumDecl__Group__0__Impl : ( 'enum' ) ;
    public final void rule__EnumDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2093:1: ( ( 'enum' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2094:1: ( 'enum' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2094:1: ( 'enum' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2095:1: 'enum'
            {
             before(grammarAccess.getEnumDeclAccess().getEnumKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__EnumDecl__Group__0__Impl4259); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2108:1: rule__EnumDecl__Group__1 : rule__EnumDecl__Group__1__Impl rule__EnumDecl__Group__2 ;
    public final void rule__EnumDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2112:1: ( rule__EnumDecl__Group__1__Impl rule__EnumDecl__Group__2 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2113:2: rule__EnumDecl__Group__1__Impl rule__EnumDecl__Group__2
            {
            pushFollow(FOLLOW_rule__EnumDecl__Group__1__Impl_in_rule__EnumDecl__Group__14290);
            rule__EnumDecl__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EnumDecl__Group__2_in_rule__EnumDecl__Group__14293);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2120:1: rule__EnumDecl__Group__1__Impl : ( ( rule__EnumDecl__NameAssignment_1 ) ) ;
    public final void rule__EnumDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2124:1: ( ( ( rule__EnumDecl__NameAssignment_1 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2125:1: ( ( rule__EnumDecl__NameAssignment_1 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2125:1: ( ( rule__EnumDecl__NameAssignment_1 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2126:1: ( rule__EnumDecl__NameAssignment_1 )
            {
             before(grammarAccess.getEnumDeclAccess().getNameAssignment_1()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2127:1: ( rule__EnumDecl__NameAssignment_1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2127:2: rule__EnumDecl__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__EnumDecl__NameAssignment_1_in_rule__EnumDecl__Group__1__Impl4320);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2137:1: rule__EnumDecl__Group__2 : rule__EnumDecl__Group__2__Impl rule__EnumDecl__Group__3 ;
    public final void rule__EnumDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2141:1: ( rule__EnumDecl__Group__2__Impl rule__EnumDecl__Group__3 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2142:2: rule__EnumDecl__Group__2__Impl rule__EnumDecl__Group__3
            {
            pushFollow(FOLLOW_rule__EnumDecl__Group__2__Impl_in_rule__EnumDecl__Group__24350);
            rule__EnumDecl__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EnumDecl__Group__3_in_rule__EnumDecl__Group__24353);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2149:1: rule__EnumDecl__Group__2__Impl : ( '{' ) ;
    public final void rule__EnumDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2153:1: ( ( '{' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2154:1: ( '{' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2154:1: ( '{' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2155:1: '{'
            {
             before(grammarAccess.getEnumDeclAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,19,FOLLOW_19_in_rule__EnumDecl__Group__2__Impl4381); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2168:1: rule__EnumDecl__Group__3 : rule__EnumDecl__Group__3__Impl rule__EnumDecl__Group__4 ;
    public final void rule__EnumDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2172:1: ( rule__EnumDecl__Group__3__Impl rule__EnumDecl__Group__4 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2173:2: rule__EnumDecl__Group__3__Impl rule__EnumDecl__Group__4
            {
            pushFollow(FOLLOW_rule__EnumDecl__Group__3__Impl_in_rule__EnumDecl__Group__34412);
            rule__EnumDecl__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EnumDecl__Group__4_in_rule__EnumDecl__Group__34415);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2180:1: rule__EnumDecl__Group__3__Impl : ( ( rule__EnumDecl__LiteralsAssignment_3 )* ) ;
    public final void rule__EnumDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2184:1: ( ( ( rule__EnumDecl__LiteralsAssignment_3 )* ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2185:1: ( ( rule__EnumDecl__LiteralsAssignment_3 )* )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2185:1: ( ( rule__EnumDecl__LiteralsAssignment_3 )* )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2186:1: ( rule__EnumDecl__LiteralsAssignment_3 )*
            {
             before(grammarAccess.getEnumDeclAccess().getLiteralsAssignment_3()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2187:1: ( rule__EnumDecl__LiteralsAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2187:2: rule__EnumDecl__LiteralsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__EnumDecl__LiteralsAssignment_3_in_rule__EnumDecl__Group__3__Impl4442);
            	    rule__EnumDecl__LiteralsAssignment_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2197:1: rule__EnumDecl__Group__4 : rule__EnumDecl__Group__4__Impl ;
    public final void rule__EnumDecl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2201:1: ( rule__EnumDecl__Group__4__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2202:2: rule__EnumDecl__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__EnumDecl__Group__4__Impl_in_rule__EnumDecl__Group__44473);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2208:1: rule__EnumDecl__Group__4__Impl : ( '}' ) ;
    public final void rule__EnumDecl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2212:1: ( ( '}' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2213:1: ( '}' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2213:1: ( '}' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2214:1: '}'
            {
             before(grammarAccess.getEnumDeclAccess().getRightCurlyBracketKeyword_4()); 
            match(input,20,FOLLOW_20_in_rule__EnumDecl__Group__4__Impl4501); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2237:1: rule__EnumLiteral__Group__0 : rule__EnumLiteral__Group__0__Impl rule__EnumLiteral__Group__1 ;
    public final void rule__EnumLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2241:1: ( rule__EnumLiteral__Group__0__Impl rule__EnumLiteral__Group__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2242:2: rule__EnumLiteral__Group__0__Impl rule__EnumLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__EnumLiteral__Group__0__Impl_in_rule__EnumLiteral__Group__04542);
            rule__EnumLiteral__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EnumLiteral__Group__1_in_rule__EnumLiteral__Group__04545);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2249:1: rule__EnumLiteral__Group__0__Impl : ( () ) ;
    public final void rule__EnumLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2253:1: ( ( () ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2254:1: ( () )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2254:1: ( () )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2255:1: ()
            {
             before(grammarAccess.getEnumLiteralAccess().getEnumLiteralAction_0()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2256:1: ()
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2258:1: 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2268:1: rule__EnumLiteral__Group__1 : rule__EnumLiteral__Group__1__Impl ;
    public final void rule__EnumLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2272:1: ( rule__EnumLiteral__Group__1__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2273:2: rule__EnumLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumLiteral__Group__1__Impl_in_rule__EnumLiteral__Group__14603);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2279:1: rule__EnumLiteral__Group__1__Impl : ( ( rule__EnumLiteral__NameAssignment_1 ) ) ;
    public final void rule__EnumLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2283:1: ( ( ( rule__EnumLiteral__NameAssignment_1 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2284:1: ( ( rule__EnumLiteral__NameAssignment_1 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2284:1: ( ( rule__EnumLiteral__NameAssignment_1 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2285:1: ( rule__EnumLiteral__NameAssignment_1 )
            {
             before(grammarAccess.getEnumLiteralAccess().getNameAssignment_1()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2286:1: ( rule__EnumLiteral__NameAssignment_1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2286:2: rule__EnumLiteral__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__EnumLiteral__NameAssignment_1_in_rule__EnumLiteral__Group__1__Impl4630);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2300:1: rule__VarDecl__Group__0 : rule__VarDecl__Group__0__Impl rule__VarDecl__Group__1 ;
    public final void rule__VarDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2304:1: ( rule__VarDecl__Group__0__Impl rule__VarDecl__Group__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2305:2: rule__VarDecl__Group__0__Impl rule__VarDecl__Group__1
            {
            pushFollow(FOLLOW_rule__VarDecl__Group__0__Impl_in_rule__VarDecl__Group__04664);
            rule__VarDecl__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__VarDecl__Group__1_in_rule__VarDecl__Group__04667);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2312:1: rule__VarDecl__Group__0__Impl : ( () ) ;
    public final void rule__VarDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2316:1: ( ( () ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2317:1: ( () )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2317:1: ( () )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2318:1: ()
            {
             before(grammarAccess.getVarDeclAccess().getVarDeclAction_0()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2319:1: ()
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2321:1: 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2331:1: rule__VarDecl__Group__1 : rule__VarDecl__Group__1__Impl rule__VarDecl__Group__2 ;
    public final void rule__VarDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2335:1: ( rule__VarDecl__Group__1__Impl rule__VarDecl__Group__2 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2336:2: rule__VarDecl__Group__1__Impl rule__VarDecl__Group__2
            {
            pushFollow(FOLLOW_rule__VarDecl__Group__1__Impl_in_rule__VarDecl__Group__14725);
            rule__VarDecl__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__VarDecl__Group__2_in_rule__VarDecl__Group__14728);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2343:1: rule__VarDecl__Group__1__Impl : ( 'var' ) ;
    public final void rule__VarDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2347:1: ( ( 'var' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2348:1: ( 'var' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2348:1: ( 'var' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2349:1: 'var'
            {
             before(grammarAccess.getVarDeclAccess().getVarKeyword_1()); 
            match(input,27,FOLLOW_27_in_rule__VarDecl__Group__1__Impl4756); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2362:1: rule__VarDecl__Group__2 : rule__VarDecl__Group__2__Impl rule__VarDecl__Group__3 ;
    public final void rule__VarDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2366:1: ( rule__VarDecl__Group__2__Impl rule__VarDecl__Group__3 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2367:2: rule__VarDecl__Group__2__Impl rule__VarDecl__Group__3
            {
            pushFollow(FOLLOW_rule__VarDecl__Group__2__Impl_in_rule__VarDecl__Group__24787);
            rule__VarDecl__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__VarDecl__Group__3_in_rule__VarDecl__Group__24790);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2374:1: rule__VarDecl__Group__2__Impl : ( ( rule__VarDecl__TypeAssignment_2 ) ) ;
    public final void rule__VarDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2378:1: ( ( ( rule__VarDecl__TypeAssignment_2 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2379:1: ( ( rule__VarDecl__TypeAssignment_2 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2379:1: ( ( rule__VarDecl__TypeAssignment_2 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2380:1: ( rule__VarDecl__TypeAssignment_2 )
            {
             before(grammarAccess.getVarDeclAccess().getTypeAssignment_2()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2381:1: ( rule__VarDecl__TypeAssignment_2 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2381:2: rule__VarDecl__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__VarDecl__TypeAssignment_2_in_rule__VarDecl__Group__2__Impl4817);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2391:1: rule__VarDecl__Group__3 : rule__VarDecl__Group__3__Impl rule__VarDecl__Group__4 ;
    public final void rule__VarDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2395:1: ( rule__VarDecl__Group__3__Impl rule__VarDecl__Group__4 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2396:2: rule__VarDecl__Group__3__Impl rule__VarDecl__Group__4
            {
            pushFollow(FOLLOW_rule__VarDecl__Group__3__Impl_in_rule__VarDecl__Group__34847);
            rule__VarDecl__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__VarDecl__Group__4_in_rule__VarDecl__Group__34850);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2403:1: rule__VarDecl__Group__3__Impl : ( ( rule__VarDecl__NameAssignment_3 ) ) ;
    public final void rule__VarDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2407:1: ( ( ( rule__VarDecl__NameAssignment_3 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2408:1: ( ( rule__VarDecl__NameAssignment_3 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2408:1: ( ( rule__VarDecl__NameAssignment_3 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2409:1: ( rule__VarDecl__NameAssignment_3 )
            {
             before(grammarAccess.getVarDeclAccess().getNameAssignment_3()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2410:1: ( rule__VarDecl__NameAssignment_3 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2410:2: rule__VarDecl__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__VarDecl__NameAssignment_3_in_rule__VarDecl__Group__3__Impl4877);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2420:1: rule__VarDecl__Group__4 : rule__VarDecl__Group__4__Impl rule__VarDecl__Group__5 ;
    public final void rule__VarDecl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2424:1: ( rule__VarDecl__Group__4__Impl rule__VarDecl__Group__5 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2425:2: rule__VarDecl__Group__4__Impl rule__VarDecl__Group__5
            {
            pushFollow(FOLLOW_rule__VarDecl__Group__4__Impl_in_rule__VarDecl__Group__44907);
            rule__VarDecl__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__VarDecl__Group__5_in_rule__VarDecl__Group__44910);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2432:1: rule__VarDecl__Group__4__Impl : ( ( rule__VarDecl__Group_4__0 )? ) ;
    public final void rule__VarDecl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2436:1: ( ( ( rule__VarDecl__Group_4__0 )? ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2437:1: ( ( rule__VarDecl__Group_4__0 )? )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2437:1: ( ( rule__VarDecl__Group_4__0 )? )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2438:1: ( rule__VarDecl__Group_4__0 )?
            {
             before(grammarAccess.getVarDeclAccess().getGroup_4()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2439:1: ( rule__VarDecl__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2439:2: rule__VarDecl__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__VarDecl__Group_4__0_in_rule__VarDecl__Group__4__Impl4937);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2449:1: rule__VarDecl__Group__5 : rule__VarDecl__Group__5__Impl ;
    public final void rule__VarDecl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2453:1: ( rule__VarDecl__Group__5__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2454:2: rule__VarDecl__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__VarDecl__Group__5__Impl_in_rule__VarDecl__Group__54968);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2460:1: rule__VarDecl__Group__5__Impl : ( ';' ) ;
    public final void rule__VarDecl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2464:1: ( ( ';' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2465:1: ( ';' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2465:1: ( ';' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2466:1: ';'
            {
             before(grammarAccess.getVarDeclAccess().getSemicolonKeyword_5()); 
            match(input,23,FOLLOW_23_in_rule__VarDecl__Group__5__Impl4996); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2491:1: rule__VarDecl__Group_4__0 : rule__VarDecl__Group_4__0__Impl rule__VarDecl__Group_4__1 ;
    public final void rule__VarDecl__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2495:1: ( rule__VarDecl__Group_4__0__Impl rule__VarDecl__Group_4__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2496:2: rule__VarDecl__Group_4__0__Impl rule__VarDecl__Group_4__1
            {
            pushFollow(FOLLOW_rule__VarDecl__Group_4__0__Impl_in_rule__VarDecl__Group_4__05039);
            rule__VarDecl__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__VarDecl__Group_4__1_in_rule__VarDecl__Group_4__05042);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2503:1: rule__VarDecl__Group_4__0__Impl : ( '=' ) ;
    public final void rule__VarDecl__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2507:1: ( ( '=' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2508:1: ( '=' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2508:1: ( '=' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2509:1: '='
            {
             before(grammarAccess.getVarDeclAccess().getEqualsSignKeyword_4_0()); 
            match(input,28,FOLLOW_28_in_rule__VarDecl__Group_4__0__Impl5070); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2522:1: rule__VarDecl__Group_4__1 : rule__VarDecl__Group_4__1__Impl ;
    public final void rule__VarDecl__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2526:1: ( rule__VarDecl__Group_4__1__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2527:2: rule__VarDecl__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__VarDecl__Group_4__1__Impl_in_rule__VarDecl__Group_4__15101);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2533:1: rule__VarDecl__Group_4__1__Impl : ( ( rule__VarDecl__InitAssignment_4_1 ) ) ;
    public final void rule__VarDecl__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2537:1: ( ( ( rule__VarDecl__InitAssignment_4_1 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2538:1: ( ( rule__VarDecl__InitAssignment_4_1 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2538:1: ( ( rule__VarDecl__InitAssignment_4_1 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2539:1: ( rule__VarDecl__InitAssignment_4_1 )
            {
             before(grammarAccess.getVarDeclAccess().getInitAssignment_4_1()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2540:1: ( rule__VarDecl__InitAssignment_4_1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2540:2: rule__VarDecl__InitAssignment_4_1
            {
            pushFollow(FOLLOW_rule__VarDecl__InitAssignment_4_1_in_rule__VarDecl__Group_4__1__Impl5128);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2554:1: rule__ArrayType__Group__0 : rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1 ;
    public final void rule__ArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2558:1: ( rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2559:2: rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__0__Impl_in_rule__ArrayType__Group__05162);
            rule__ArrayType__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group__1_in_rule__ArrayType__Group__05165);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2566:1: rule__ArrayType__Group__0__Impl : ( () ) ;
    public final void rule__ArrayType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2570:1: ( ( () ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2571:1: ( () )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2571:1: ( () )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2572:1: ()
            {
             before(grammarAccess.getArrayTypeAccess().getArrayTypeAction_0()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2573:1: ()
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2575:1: 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2585:1: rule__ArrayType__Group__1 : rule__ArrayType__Group__1__Impl rule__ArrayType__Group__2 ;
    public final void rule__ArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2589:1: ( rule__ArrayType__Group__1__Impl rule__ArrayType__Group__2 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2590:2: rule__ArrayType__Group__1__Impl rule__ArrayType__Group__2
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__1__Impl_in_rule__ArrayType__Group__15223);
            rule__ArrayType__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group__2_in_rule__ArrayType__Group__15226);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2597:1: rule__ArrayType__Group__1__Impl : ( 'array' ) ;
    public final void rule__ArrayType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2601:1: ( ( 'array' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2602:1: ( 'array' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2602:1: ( 'array' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2603:1: 'array'
            {
             before(grammarAccess.getArrayTypeAccess().getArrayKeyword_1()); 
            match(input,29,FOLLOW_29_in_rule__ArrayType__Group__1__Impl5254); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2616:1: rule__ArrayType__Group__2 : rule__ArrayType__Group__2__Impl rule__ArrayType__Group__3 ;
    public final void rule__ArrayType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2620:1: ( rule__ArrayType__Group__2__Impl rule__ArrayType__Group__3 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2621:2: rule__ArrayType__Group__2__Impl rule__ArrayType__Group__3
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__2__Impl_in_rule__ArrayType__Group__25285);
            rule__ArrayType__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group__3_in_rule__ArrayType__Group__25288);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2628:1: rule__ArrayType__Group__2__Impl : ( '[' ) ;
    public final void rule__ArrayType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2632:1: ( ( '[' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2633:1: ( '[' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2633:1: ( '[' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2634:1: '['
            {
             before(grammarAccess.getArrayTypeAccess().getLeftSquareBracketKeyword_2()); 
            match(input,30,FOLLOW_30_in_rule__ArrayType__Group__2__Impl5316); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2647:1: rule__ArrayType__Group__3 : rule__ArrayType__Group__3__Impl rule__ArrayType__Group__4 ;
    public final void rule__ArrayType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2651:1: ( rule__ArrayType__Group__3__Impl rule__ArrayType__Group__4 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2652:2: rule__ArrayType__Group__3__Impl rule__ArrayType__Group__4
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__3__Impl_in_rule__ArrayType__Group__35347);
            rule__ArrayType__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group__4_in_rule__ArrayType__Group__35350);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2659:1: rule__ArrayType__Group__3__Impl : ( ( rule__ArrayType__BaseTypeAssignment_3 ) ) ;
    public final void rule__ArrayType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2663:1: ( ( ( rule__ArrayType__BaseTypeAssignment_3 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2664:1: ( ( rule__ArrayType__BaseTypeAssignment_3 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2664:1: ( ( rule__ArrayType__BaseTypeAssignment_3 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2665:1: ( rule__ArrayType__BaseTypeAssignment_3 )
            {
             before(grammarAccess.getArrayTypeAccess().getBaseTypeAssignment_3()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2666:1: ( rule__ArrayType__BaseTypeAssignment_3 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2666:2: rule__ArrayType__BaseTypeAssignment_3
            {
            pushFollow(FOLLOW_rule__ArrayType__BaseTypeAssignment_3_in_rule__ArrayType__Group__3__Impl5377);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2676:1: rule__ArrayType__Group__4 : rule__ArrayType__Group__4__Impl ;
    public final void rule__ArrayType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2680:1: ( rule__ArrayType__Group__4__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2681:2: rule__ArrayType__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__4__Impl_in_rule__ArrayType__Group__45407);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2687:1: rule__ArrayType__Group__4__Impl : ( ']' ) ;
    public final void rule__ArrayType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2691:1: ( ( ']' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2692:1: ( ']' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2692:1: ( ']' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2693:1: ']'
            {
             before(grammarAccess.getArrayTypeAccess().getRightSquareBracketKeyword_4()); 
            match(input,31,FOLLOW_31_in_rule__ArrayType__Group__4__Impl5435); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2716:1: rule__IntType__Group__0 : rule__IntType__Group__0__Impl rule__IntType__Group__1 ;
    public final void rule__IntType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2720:1: ( rule__IntType__Group__0__Impl rule__IntType__Group__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2721:2: rule__IntType__Group__0__Impl rule__IntType__Group__1
            {
            pushFollow(FOLLOW_rule__IntType__Group__0__Impl_in_rule__IntType__Group__05476);
            rule__IntType__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__IntType__Group__1_in_rule__IntType__Group__05479);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2728:1: rule__IntType__Group__0__Impl : ( () ) ;
    public final void rule__IntType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2732:1: ( ( () ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2733:1: ( () )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2733:1: ( () )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2734:1: ()
            {
             before(grammarAccess.getIntTypeAccess().getIntTypeAction_0()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2735:1: ()
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2737:1: 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2747:1: rule__IntType__Group__1 : rule__IntType__Group__1__Impl ;
    public final void rule__IntType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2751:1: ( rule__IntType__Group__1__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2752:2: rule__IntType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__IntType__Group__1__Impl_in_rule__IntType__Group__15537);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2758:1: rule__IntType__Group__1__Impl : ( 'int' ) ;
    public final void rule__IntType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2762:1: ( ( 'int' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2763:1: ( 'int' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2763:1: ( 'int' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2764:1: 'int'
            {
             before(grammarAccess.getIntTypeAccess().getIntKeyword_1()); 
            match(input,32,FOLLOW_32_in_rule__IntType__Group__1__Impl5565); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2781:1: rule__BoolType__Group__0 : rule__BoolType__Group__0__Impl rule__BoolType__Group__1 ;
    public final void rule__BoolType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2785:1: ( rule__BoolType__Group__0__Impl rule__BoolType__Group__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2786:2: rule__BoolType__Group__0__Impl rule__BoolType__Group__1
            {
            pushFollow(FOLLOW_rule__BoolType__Group__0__Impl_in_rule__BoolType__Group__05600);
            rule__BoolType__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BoolType__Group__1_in_rule__BoolType__Group__05603);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2793:1: rule__BoolType__Group__0__Impl : ( () ) ;
    public final void rule__BoolType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2797:1: ( ( () ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2798:1: ( () )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2798:1: ( () )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2799:1: ()
            {
             before(grammarAccess.getBoolTypeAccess().getBoolTypeAction_0()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2800:1: ()
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2802:1: 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2812:1: rule__BoolType__Group__1 : rule__BoolType__Group__1__Impl ;
    public final void rule__BoolType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2816:1: ( rule__BoolType__Group__1__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2817:2: rule__BoolType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BoolType__Group__1__Impl_in_rule__BoolType__Group__15661);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2823:1: rule__BoolType__Group__1__Impl : ( 'bool' ) ;
    public final void rule__BoolType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2827:1: ( ( 'bool' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2828:1: ( 'bool' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2828:1: ( 'bool' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2829:1: 'bool'
            {
             before(grammarAccess.getBoolTypeAccess().getBoolKeyword_1()); 
            match(input,33,FOLLOW_33_in_rule__BoolType__Group__1__Impl5689); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2846:1: rule__FloatType__Group__0 : rule__FloatType__Group__0__Impl rule__FloatType__Group__1 ;
    public final void rule__FloatType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2850:1: ( rule__FloatType__Group__0__Impl rule__FloatType__Group__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2851:2: rule__FloatType__Group__0__Impl rule__FloatType__Group__1
            {
            pushFollow(FOLLOW_rule__FloatType__Group__0__Impl_in_rule__FloatType__Group__05724);
            rule__FloatType__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FloatType__Group__1_in_rule__FloatType__Group__05727);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2858:1: rule__FloatType__Group__0__Impl : ( () ) ;
    public final void rule__FloatType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2862:1: ( ( () ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2863:1: ( () )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2863:1: ( () )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2864:1: ()
            {
             before(grammarAccess.getFloatTypeAccess().getFloatTypeAction_0()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2865:1: ()
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2867:1: 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2877:1: rule__FloatType__Group__1 : rule__FloatType__Group__1__Impl ;
    public final void rule__FloatType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2881:1: ( rule__FloatType__Group__1__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2882:2: rule__FloatType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FloatType__Group__1__Impl_in_rule__FloatType__Group__15785);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2888:1: rule__FloatType__Group__1__Impl : ( 'float' ) ;
    public final void rule__FloatType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2892:1: ( ( 'float' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2893:1: ( 'float' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2893:1: ( 'float' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2894:1: 'float'
            {
             before(grammarAccess.getFloatTypeAccess().getFloatKeyword_1()); 
            match(input,34,FOLLOW_34_in_rule__FloatType__Group__1__Impl5813); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2911:1: rule__StringType__Group__0 : rule__StringType__Group__0__Impl rule__StringType__Group__1 ;
    public final void rule__StringType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2915:1: ( rule__StringType__Group__0__Impl rule__StringType__Group__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2916:2: rule__StringType__Group__0__Impl rule__StringType__Group__1
            {
            pushFollow(FOLLOW_rule__StringType__Group__0__Impl_in_rule__StringType__Group__05848);
            rule__StringType__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringType__Group__1_in_rule__StringType__Group__05851);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2923:1: rule__StringType__Group__0__Impl : ( () ) ;
    public final void rule__StringType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2927:1: ( ( () ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2928:1: ( () )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2928:1: ( () )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2929:1: ()
            {
             before(grammarAccess.getStringTypeAccess().getStringTypeAction_0()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2930:1: ()
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2932:1: 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2942:1: rule__StringType__Group__1 : rule__StringType__Group__1__Impl ;
    public final void rule__StringType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2946:1: ( rule__StringType__Group__1__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2947:2: rule__StringType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__StringType__Group__1__Impl_in_rule__StringType__Group__15909);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2953:1: rule__StringType__Group__1__Impl : ( 'string' ) ;
    public final void rule__StringType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2957:1: ( ( 'string' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2958:1: ( 'string' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2958:1: ( 'string' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2959:1: 'string'
            {
             before(grammarAccess.getStringTypeAccess().getStringKeyword_1()); 
            match(input,35,FOLLOW_35_in_rule__StringType__Group__1__Impl5937); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2976:1: rule__Formula__Group__0 : rule__Formula__Group__0__Impl rule__Formula__Group__1 ;
    public final void rule__Formula__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2980:1: ( rule__Formula__Group__0__Impl rule__Formula__Group__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2981:2: rule__Formula__Group__0__Impl rule__Formula__Group__1
            {
            pushFollow(FOLLOW_rule__Formula__Group__0__Impl_in_rule__Formula__Group__05972);
            rule__Formula__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Formula__Group__1_in_rule__Formula__Group__05975);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2988:1: rule__Formula__Group__0__Impl : ( () ) ;
    public final void rule__Formula__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2992:1: ( ( () ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2993:1: ( () )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2993:1: ( () )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2994:1: ()
            {
             before(grammarAccess.getFormulaAccess().getFormulaAction_0()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2995:1: ()
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:2997:1: 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3007:1: rule__Formula__Group__1 : rule__Formula__Group__1__Impl rule__Formula__Group__2 ;
    public final void rule__Formula__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3011:1: ( rule__Formula__Group__1__Impl rule__Formula__Group__2 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3012:2: rule__Formula__Group__1__Impl rule__Formula__Group__2
            {
            pushFollow(FOLLOW_rule__Formula__Group__1__Impl_in_rule__Formula__Group__16033);
            rule__Formula__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Formula__Group__2_in_rule__Formula__Group__16036);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3019:1: rule__Formula__Group__1__Impl : ( 'calc' ) ;
    public final void rule__Formula__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3023:1: ( ( 'calc' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3024:1: ( 'calc' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3024:1: ( 'calc' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3025:1: 'calc'
            {
             before(grammarAccess.getFormulaAccess().getCalcKeyword_1()); 
            match(input,36,FOLLOW_36_in_rule__Formula__Group__1__Impl6064); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3038:1: rule__Formula__Group__2 : rule__Formula__Group__2__Impl rule__Formula__Group__3 ;
    public final void rule__Formula__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3042:1: ( rule__Formula__Group__2__Impl rule__Formula__Group__3 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3043:2: rule__Formula__Group__2__Impl rule__Formula__Group__3
            {
            pushFollow(FOLLOW_rule__Formula__Group__2__Impl_in_rule__Formula__Group__26095);
            rule__Formula__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Formula__Group__3_in_rule__Formula__Group__26098);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3050:1: rule__Formula__Group__2__Impl : ( ( rule__Formula__TypeAssignment_2 ) ) ;
    public final void rule__Formula__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3054:1: ( ( ( rule__Formula__TypeAssignment_2 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3055:1: ( ( rule__Formula__TypeAssignment_2 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3055:1: ( ( rule__Formula__TypeAssignment_2 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3056:1: ( rule__Formula__TypeAssignment_2 )
            {
             before(grammarAccess.getFormulaAccess().getTypeAssignment_2()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3057:1: ( rule__Formula__TypeAssignment_2 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3057:2: rule__Formula__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Formula__TypeAssignment_2_in_rule__Formula__Group__2__Impl6125);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3067:1: rule__Formula__Group__3 : rule__Formula__Group__3__Impl rule__Formula__Group__4 ;
    public final void rule__Formula__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3071:1: ( rule__Formula__Group__3__Impl rule__Formula__Group__4 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3072:2: rule__Formula__Group__3__Impl rule__Formula__Group__4
            {
            pushFollow(FOLLOW_rule__Formula__Group__3__Impl_in_rule__Formula__Group__36155);
            rule__Formula__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Formula__Group__4_in_rule__Formula__Group__36158);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3079:1: rule__Formula__Group__3__Impl : ( ( rule__Formula__NameAssignment_3 ) ) ;
    public final void rule__Formula__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3083:1: ( ( ( rule__Formula__NameAssignment_3 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3084:1: ( ( rule__Formula__NameAssignment_3 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3084:1: ( ( rule__Formula__NameAssignment_3 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3085:1: ( rule__Formula__NameAssignment_3 )
            {
             before(grammarAccess.getFormulaAccess().getNameAssignment_3()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3086:1: ( rule__Formula__NameAssignment_3 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3086:2: rule__Formula__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__Formula__NameAssignment_3_in_rule__Formula__Group__3__Impl6185);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3096:1: rule__Formula__Group__4 : rule__Formula__Group__4__Impl rule__Formula__Group__5 ;
    public final void rule__Formula__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3100:1: ( rule__Formula__Group__4__Impl rule__Formula__Group__5 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3101:2: rule__Formula__Group__4__Impl rule__Formula__Group__5
            {
            pushFollow(FOLLOW_rule__Formula__Group__4__Impl_in_rule__Formula__Group__46215);
            rule__Formula__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Formula__Group__5_in_rule__Formula__Group__46218);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3108:1: rule__Formula__Group__4__Impl : ( '=' ) ;
    public final void rule__Formula__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3112:1: ( ( '=' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3113:1: ( '=' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3113:1: ( '=' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3114:1: '='
            {
             before(grammarAccess.getFormulaAccess().getEqualsSignKeyword_4()); 
            match(input,28,FOLLOW_28_in_rule__Formula__Group__4__Impl6246); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3127:1: rule__Formula__Group__5 : rule__Formula__Group__5__Impl rule__Formula__Group__6 ;
    public final void rule__Formula__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3131:1: ( rule__Formula__Group__5__Impl rule__Formula__Group__6 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3132:2: rule__Formula__Group__5__Impl rule__Formula__Group__6
            {
            pushFollow(FOLLOW_rule__Formula__Group__5__Impl_in_rule__Formula__Group__56277);
            rule__Formula__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Formula__Group__6_in_rule__Formula__Group__56280);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3139:1: rule__Formula__Group__5__Impl : ( ( rule__Formula__ExprAssignment_5 ) ) ;
    public final void rule__Formula__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3143:1: ( ( ( rule__Formula__ExprAssignment_5 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3144:1: ( ( rule__Formula__ExprAssignment_5 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3144:1: ( ( rule__Formula__ExprAssignment_5 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3145:1: ( rule__Formula__ExprAssignment_5 )
            {
             before(grammarAccess.getFormulaAccess().getExprAssignment_5()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3146:1: ( rule__Formula__ExprAssignment_5 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3146:2: rule__Formula__ExprAssignment_5
            {
            pushFollow(FOLLOW_rule__Formula__ExprAssignment_5_in_rule__Formula__Group__5__Impl6307);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3156:1: rule__Formula__Group__6 : rule__Formula__Group__6__Impl ;
    public final void rule__Formula__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3160:1: ( rule__Formula__Group__6__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3161:2: rule__Formula__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Formula__Group__6__Impl_in_rule__Formula__Group__66337);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3167:1: rule__Formula__Group__6__Impl : ( ';' ) ;
    public final void rule__Formula__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3171:1: ( ( ';' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3172:1: ( ';' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3172:1: ( ';' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3173:1: ';'
            {
             before(grammarAccess.getFormulaAccess().getSemicolonKeyword_6()); 
            match(input,23,FOLLOW_23_in_rule__Formula__Group__6__Impl6365); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3200:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3204:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3205:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
            {
            pushFollow(FOLLOW_rule__Comparison__Group__0__Impl_in_rule__Comparison__Group__06410);
            rule__Comparison__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Comparison__Group__1_in_rule__Comparison__Group__06413);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3212:1: rule__Comparison__Group__0__Impl : ( ruleAddition ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3216:1: ( ( ruleAddition ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3217:1: ( ruleAddition )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3217:1: ( ruleAddition )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3218:1: ruleAddition
            {
             before(grammarAccess.getComparisonAccess().getAdditionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAddition_in_rule__Comparison__Group__0__Impl6440);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3229:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3233:1: ( rule__Comparison__Group__1__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3234:2: rule__Comparison__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Comparison__Group__1__Impl_in_rule__Comparison__Group__16469);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3240:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__Group_1__0 )? ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3244:1: ( ( ( rule__Comparison__Group_1__0 )? ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3245:1: ( ( rule__Comparison__Group_1__0 )? )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3245:1: ( ( rule__Comparison__Group_1__0 )? )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3246:1: ( rule__Comparison__Group_1__0 )?
            {
             before(grammarAccess.getComparisonAccess().getGroup_1()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3247:1: ( rule__Comparison__Group_1__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==37) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3247:2: rule__Comparison__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Comparison__Group_1__0_in_rule__Comparison__Group__1__Impl6496);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3261:1: rule__Comparison__Group_1__0 : rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 ;
    public final void rule__Comparison__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3265:1: ( rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3266:2: rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1__0__Impl_in_rule__Comparison__Group_1__06531);
            rule__Comparison__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Comparison__Group_1__1_in_rule__Comparison__Group_1__06534);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3273:1: rule__Comparison__Group_1__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3277:1: ( ( () ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3278:1: ( () )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3278:1: ( () )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3279:1: ()
            {
             before(grammarAccess.getComparisonAccess().getEqualsLeftAction_1_0()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3280:1: ()
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3282:1: 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3292:1: rule__Comparison__Group_1__1 : rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2 ;
    public final void rule__Comparison__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3296:1: ( rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3297:2: rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1__1__Impl_in_rule__Comparison__Group_1__16592);
            rule__Comparison__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Comparison__Group_1__2_in_rule__Comparison__Group_1__16595);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3304:1: rule__Comparison__Group_1__1__Impl : ( '==' ) ;
    public final void rule__Comparison__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3308:1: ( ( '==' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3309:1: ( '==' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3309:1: ( '==' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3310:1: '=='
            {
             before(grammarAccess.getComparisonAccess().getEqualsSignEqualsSignKeyword_1_1()); 
            match(input,37,FOLLOW_37_in_rule__Comparison__Group_1__1__Impl6623); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3323:1: rule__Comparison__Group_1__2 : rule__Comparison__Group_1__2__Impl ;
    public final void rule__Comparison__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3327:1: ( rule__Comparison__Group_1__2__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3328:2: rule__Comparison__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1__2__Impl_in_rule__Comparison__Group_1__26654);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3334:1: rule__Comparison__Group_1__2__Impl : ( ( rule__Comparison__RightAssignment_1_2 ) ) ;
    public final void rule__Comparison__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3338:1: ( ( ( rule__Comparison__RightAssignment_1_2 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3339:1: ( ( rule__Comparison__RightAssignment_1_2 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3339:1: ( ( rule__Comparison__RightAssignment_1_2 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3340:1: ( rule__Comparison__RightAssignment_1_2 )
            {
             before(grammarAccess.getComparisonAccess().getRightAssignment_1_2()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3341:1: ( rule__Comparison__RightAssignment_1_2 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3341:2: rule__Comparison__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Comparison__RightAssignment_1_2_in_rule__Comparison__Group_1__2__Impl6681);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3357:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3361:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3362:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_rule__Addition__Group__0__Impl_in_rule__Addition__Group__06717);
            rule__Addition__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Addition__Group__1_in_rule__Addition__Group__06720);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3369:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3373:1: ( ( ruleMultiplication ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3374:1: ( ruleMultiplication )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3374:1: ( ruleMultiplication )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3375:1: ruleMultiplication
            {
             before(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleMultiplication_in_rule__Addition__Group__0__Impl6747);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3386:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3390:1: ( rule__Addition__Group__1__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3391:2: rule__Addition__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group__1__Impl_in_rule__Addition__Group__16776);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3397:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3401:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3402:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3402:1: ( ( rule__Addition__Group_1__0 )* )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3403:1: ( rule__Addition__Group_1__0 )*
            {
             before(grammarAccess.getAdditionAccess().getGroup_1()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3404:1: ( rule__Addition__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==38) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3404:2: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Addition__Group_1__0_in_rule__Addition__Group__1__Impl6803);
            	    rule__Addition__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3418:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3422:1: ( rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3423:2: rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1
            {
            pushFollow(FOLLOW_rule__Addition__Group_1__0__Impl_in_rule__Addition__Group_1__06838);
            rule__Addition__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Addition__Group_1__1_in_rule__Addition__Group_1__06841);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3430:1: rule__Addition__Group_1__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3434:1: ( ( () ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3435:1: ( () )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3435:1: ( () )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3436:1: ()
            {
             before(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3437:1: ()
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3439:1: 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3449:1: rule__Addition__Group_1__1 : rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 ;
    public final void rule__Addition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3453:1: ( rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3454:2: rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2
            {
            pushFollow(FOLLOW_rule__Addition__Group_1__1__Impl_in_rule__Addition__Group_1__16899);
            rule__Addition__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Addition__Group_1__2_in_rule__Addition__Group_1__16902);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3461:1: rule__Addition__Group_1__1__Impl : ( '+' ) ;
    public final void rule__Addition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3465:1: ( ( '+' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3466:1: ( '+' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3466:1: ( '+' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3467:1: '+'
            {
             before(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_1()); 
            match(input,38,FOLLOW_38_in_rule__Addition__Group_1__1__Impl6930); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3480:1: rule__Addition__Group_1__2 : rule__Addition__Group_1__2__Impl ;
    public final void rule__Addition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3484:1: ( rule__Addition__Group_1__2__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3485:2: rule__Addition__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group_1__2__Impl_in_rule__Addition__Group_1__26961);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3491:1: rule__Addition__Group_1__2__Impl : ( ( rule__Addition__RightAssignment_1_2 ) ) ;
    public final void rule__Addition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3495:1: ( ( ( rule__Addition__RightAssignment_1_2 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3496:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3496:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3497:1: ( rule__Addition__RightAssignment_1_2 )
            {
             before(grammarAccess.getAdditionAccess().getRightAssignment_1_2()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3498:1: ( rule__Addition__RightAssignment_1_2 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3498:2: rule__Addition__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Addition__RightAssignment_1_2_in_rule__Addition__Group_1__2__Impl6988);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3514:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3518:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3519:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__0__Impl_in_rule__Multiplication__Group__07024);
            rule__Multiplication__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Multiplication__Group__1_in_rule__Multiplication__Group__07027);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3526:1: rule__Multiplication__Group__0__Impl : ( rulePostfixOperators ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3530:1: ( ( rulePostfixOperators ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3531:1: ( rulePostfixOperators )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3531:1: ( rulePostfixOperators )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3532:1: rulePostfixOperators
            {
             before(grammarAccess.getMultiplicationAccess().getPostfixOperatorsParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePostfixOperators_in_rule__Multiplication__Group__0__Impl7054);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3543:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3547:1: ( rule__Multiplication__Group__1__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3548:2: rule__Multiplication__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__1__Impl_in_rule__Multiplication__Group__17083);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3554:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3558:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3559:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3559:1: ( ( rule__Multiplication__Group_1__0 )* )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3560:1: ( rule__Multiplication__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3561:1: ( rule__Multiplication__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==15) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3561:2: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Multiplication__Group_1__0_in_rule__Multiplication__Group__1__Impl7110);
            	    rule__Multiplication__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3575:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3579:1: ( rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3580:2: rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1__0__Impl_in_rule__Multiplication__Group_1__07145);
            rule__Multiplication__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Multiplication__Group_1__1_in_rule__Multiplication__Group_1__07148);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3587:1: rule__Multiplication__Group_1__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3591:1: ( ( () ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3592:1: ( () )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3592:1: ( () )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3593:1: ()
            {
             before(grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3594:1: ()
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3596:1: 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3606:1: rule__Multiplication__Group_1__1 : rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 ;
    public final void rule__Multiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3610:1: ( rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3611:2: rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1__1__Impl_in_rule__Multiplication__Group_1__17206);
            rule__Multiplication__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Multiplication__Group_1__2_in_rule__Multiplication__Group_1__17209);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3618:1: rule__Multiplication__Group_1__1__Impl : ( '*' ) ;
    public final void rule__Multiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3622:1: ( ( '*' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3623:1: ( '*' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3623:1: ( '*' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3624:1: '*'
            {
             before(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_1()); 
            match(input,15,FOLLOW_15_in_rule__Multiplication__Group_1__1__Impl7237); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3637:1: rule__Multiplication__Group_1__2 : rule__Multiplication__Group_1__2__Impl ;
    public final void rule__Multiplication__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3641:1: ( rule__Multiplication__Group_1__2__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3642:2: rule__Multiplication__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1__2__Impl_in_rule__Multiplication__Group_1__27268);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3648:1: rule__Multiplication__Group_1__2__Impl : ( ( rule__Multiplication__RightAssignment_1_2 ) ) ;
    public final void rule__Multiplication__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3652:1: ( ( ( rule__Multiplication__RightAssignment_1_2 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3653:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3653:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3654:1: ( rule__Multiplication__RightAssignment_1_2 )
            {
             before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_2()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3655:1: ( rule__Multiplication__RightAssignment_1_2 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3655:2: rule__Multiplication__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Multiplication__RightAssignment_1_2_in_rule__Multiplication__Group_1__2__Impl7295);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3671:1: rule__PostfixOperators__Group__0 : rule__PostfixOperators__Group__0__Impl rule__PostfixOperators__Group__1 ;
    public final void rule__PostfixOperators__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3675:1: ( rule__PostfixOperators__Group__0__Impl rule__PostfixOperators__Group__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3676:2: rule__PostfixOperators__Group__0__Impl rule__PostfixOperators__Group__1
            {
            pushFollow(FOLLOW_rule__PostfixOperators__Group__0__Impl_in_rule__PostfixOperators__Group__07331);
            rule__PostfixOperators__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PostfixOperators__Group__1_in_rule__PostfixOperators__Group__07334);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3683:1: rule__PostfixOperators__Group__0__Impl : ( ruleAtomic ) ;
    public final void rule__PostfixOperators__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3687:1: ( ( ruleAtomic ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3688:1: ( ruleAtomic )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3688:1: ( ruleAtomic )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3689:1: ruleAtomic
            {
             before(grammarAccess.getPostfixOperatorsAccess().getAtomicParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAtomic_in_rule__PostfixOperators__Group__0__Impl7361);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3700:1: rule__PostfixOperators__Group__1 : rule__PostfixOperators__Group__1__Impl ;
    public final void rule__PostfixOperators__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3704:1: ( rule__PostfixOperators__Group__1__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3705:2: rule__PostfixOperators__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PostfixOperators__Group__1__Impl_in_rule__PostfixOperators__Group__17390);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3711:1: rule__PostfixOperators__Group__1__Impl : ( ( rule__PostfixOperators__Group_1__0 )? ) ;
    public final void rule__PostfixOperators__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3715:1: ( ( ( rule__PostfixOperators__Group_1__0 )? ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3716:1: ( ( rule__PostfixOperators__Group_1__0 )? )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3716:1: ( ( rule__PostfixOperators__Group_1__0 )? )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3717:1: ( rule__PostfixOperators__Group_1__0 )?
            {
             before(grammarAccess.getPostfixOperatorsAccess().getGroup_1()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3718:1: ( rule__PostfixOperators__Group_1__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==30) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3718:2: rule__PostfixOperators__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__PostfixOperators__Group_1__0_in_rule__PostfixOperators__Group__1__Impl7417);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3732:1: rule__PostfixOperators__Group_1__0 : rule__PostfixOperators__Group_1__0__Impl rule__PostfixOperators__Group_1__1 ;
    public final void rule__PostfixOperators__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3736:1: ( rule__PostfixOperators__Group_1__0__Impl rule__PostfixOperators__Group_1__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3737:2: rule__PostfixOperators__Group_1__0__Impl rule__PostfixOperators__Group_1__1
            {
            pushFollow(FOLLOW_rule__PostfixOperators__Group_1__0__Impl_in_rule__PostfixOperators__Group_1__07452);
            rule__PostfixOperators__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PostfixOperators__Group_1__1_in_rule__PostfixOperators__Group_1__07455);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3744:1: rule__PostfixOperators__Group_1__0__Impl : ( () ) ;
    public final void rule__PostfixOperators__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3748:1: ( ( () ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3749:1: ( () )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3749:1: ( () )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3750:1: ()
            {
             before(grammarAccess.getPostfixOperatorsAccess().getArrayAccessExprAction_1_0()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3751:1: ()
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3753:1: 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3763:1: rule__PostfixOperators__Group_1__1 : rule__PostfixOperators__Group_1__1__Impl rule__PostfixOperators__Group_1__2 ;
    public final void rule__PostfixOperators__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3767:1: ( rule__PostfixOperators__Group_1__1__Impl rule__PostfixOperators__Group_1__2 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3768:2: rule__PostfixOperators__Group_1__1__Impl rule__PostfixOperators__Group_1__2
            {
            pushFollow(FOLLOW_rule__PostfixOperators__Group_1__1__Impl_in_rule__PostfixOperators__Group_1__17513);
            rule__PostfixOperators__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PostfixOperators__Group_1__2_in_rule__PostfixOperators__Group_1__17516);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3775:1: rule__PostfixOperators__Group_1__1__Impl : ( '[' ) ;
    public final void rule__PostfixOperators__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3779:1: ( ( '[' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3780:1: ( '[' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3780:1: ( '[' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3781:1: '['
            {
             before(grammarAccess.getPostfixOperatorsAccess().getLeftSquareBracketKeyword_1_1()); 
            match(input,30,FOLLOW_30_in_rule__PostfixOperators__Group_1__1__Impl7544); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3794:1: rule__PostfixOperators__Group_1__2 : rule__PostfixOperators__Group_1__2__Impl rule__PostfixOperators__Group_1__3 ;
    public final void rule__PostfixOperators__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3798:1: ( rule__PostfixOperators__Group_1__2__Impl rule__PostfixOperators__Group_1__3 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3799:2: rule__PostfixOperators__Group_1__2__Impl rule__PostfixOperators__Group_1__3
            {
            pushFollow(FOLLOW_rule__PostfixOperators__Group_1__2__Impl_in_rule__PostfixOperators__Group_1__27575);
            rule__PostfixOperators__Group_1__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PostfixOperators__Group_1__3_in_rule__PostfixOperators__Group_1__27578);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3806:1: rule__PostfixOperators__Group_1__2__Impl : ( ( rule__PostfixOperators__IndexAssignment_1_2 ) ) ;
    public final void rule__PostfixOperators__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3810:1: ( ( ( rule__PostfixOperators__IndexAssignment_1_2 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3811:1: ( ( rule__PostfixOperators__IndexAssignment_1_2 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3811:1: ( ( rule__PostfixOperators__IndexAssignment_1_2 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3812:1: ( rule__PostfixOperators__IndexAssignment_1_2 )
            {
             before(grammarAccess.getPostfixOperatorsAccess().getIndexAssignment_1_2()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3813:1: ( rule__PostfixOperators__IndexAssignment_1_2 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3813:2: rule__PostfixOperators__IndexAssignment_1_2
            {
            pushFollow(FOLLOW_rule__PostfixOperators__IndexAssignment_1_2_in_rule__PostfixOperators__Group_1__2__Impl7605);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3823:1: rule__PostfixOperators__Group_1__3 : rule__PostfixOperators__Group_1__3__Impl ;
    public final void rule__PostfixOperators__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3827:1: ( rule__PostfixOperators__Group_1__3__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3828:2: rule__PostfixOperators__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__PostfixOperators__Group_1__3__Impl_in_rule__PostfixOperators__Group_1__37635);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3834:1: rule__PostfixOperators__Group_1__3__Impl : ( ']' ) ;
    public final void rule__PostfixOperators__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3838:1: ( ( ']' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3839:1: ( ']' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3839:1: ( ']' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3840:1: ']'
            {
             before(grammarAccess.getPostfixOperatorsAccess().getRightSquareBracketKeyword_1_3()); 
            match(input,31,FOLLOW_31_in_rule__PostfixOperators__Group_1__3__Impl7663); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3861:1: rule__Atomic__Group_0__0 : rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 ;
    public final void rule__Atomic__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3865:1: ( rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3866:2: rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_0__0__Impl_in_rule__Atomic__Group_0__07702);
            rule__Atomic__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_0__1_in_rule__Atomic__Group_0__07705);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3873:1: rule__Atomic__Group_0__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3877:1: ( ( () ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3878:1: ( () )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3878:1: ( () )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3879:1: ()
            {
             before(grammarAccess.getAtomicAccess().getSymbolRefAction_0_0()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3880:1: ()
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3882:1: 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3892:1: rule__Atomic__Group_0__1 : rule__Atomic__Group_0__1__Impl rule__Atomic__Group_0__2 ;
    public final void rule__Atomic__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3896:1: ( rule__Atomic__Group_0__1__Impl rule__Atomic__Group_0__2 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3897:2: rule__Atomic__Group_0__1__Impl rule__Atomic__Group_0__2
            {
            pushFollow(FOLLOW_rule__Atomic__Group_0__1__Impl_in_rule__Atomic__Group_0__17763);
            rule__Atomic__Group_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_0__2_in_rule__Atomic__Group_0__17766);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3904:1: rule__Atomic__Group_0__1__Impl : ( ( rule__Atomic__SymbolAssignment_0_1 ) ) ;
    public final void rule__Atomic__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3908:1: ( ( ( rule__Atomic__SymbolAssignment_0_1 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3909:1: ( ( rule__Atomic__SymbolAssignment_0_1 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3909:1: ( ( rule__Atomic__SymbolAssignment_0_1 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3910:1: ( rule__Atomic__SymbolAssignment_0_1 )
            {
             before(grammarAccess.getAtomicAccess().getSymbolAssignment_0_1()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3911:1: ( rule__Atomic__SymbolAssignment_0_1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3911:2: rule__Atomic__SymbolAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Atomic__SymbolAssignment_0_1_in_rule__Atomic__Group_0__1__Impl7793);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3921:1: rule__Atomic__Group_0__2 : rule__Atomic__Group_0__2__Impl ;
    public final void rule__Atomic__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3925:1: ( rule__Atomic__Group_0__2__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3926:2: rule__Atomic__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_0__2__Impl_in_rule__Atomic__Group_0__27823);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3932:1: rule__Atomic__Group_0__2__Impl : ( ( rule__Atomic__Group_0_2__0 )? ) ;
    public final void rule__Atomic__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3936:1: ( ( ( rule__Atomic__Group_0_2__0 )? ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3937:1: ( ( rule__Atomic__Group_0_2__0 )? )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3937:1: ( ( rule__Atomic__Group_0_2__0 )? )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3938:1: ( rule__Atomic__Group_0_2__0 )?
            {
             before(grammarAccess.getAtomicAccess().getGroup_0_2()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3939:1: ( rule__Atomic__Group_0_2__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==17) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3939:2: rule__Atomic__Group_0_2__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_0_2__0_in_rule__Atomic__Group_0__2__Impl7850);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3955:1: rule__Atomic__Group_0_2__0 : rule__Atomic__Group_0_2__0__Impl rule__Atomic__Group_0_2__1 ;
    public final void rule__Atomic__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3959:1: ( rule__Atomic__Group_0_2__0__Impl rule__Atomic__Group_0_2__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3960:2: rule__Atomic__Group_0_2__0__Impl rule__Atomic__Group_0_2__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_0_2__0__Impl_in_rule__Atomic__Group_0_2__07887);
            rule__Atomic__Group_0_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_0_2__1_in_rule__Atomic__Group_0_2__07890);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3967:1: rule__Atomic__Group_0_2__0__Impl : ( '(' ) ;
    public final void rule__Atomic__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3971:1: ( ( '(' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3972:1: ( '(' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3972:1: ( '(' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3973:1: '('
            {
             before(grammarAccess.getAtomicAccess().getLeftParenthesisKeyword_0_2_0()); 
            match(input,17,FOLLOW_17_in_rule__Atomic__Group_0_2__0__Impl7918); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3986:1: rule__Atomic__Group_0_2__1 : rule__Atomic__Group_0_2__1__Impl rule__Atomic__Group_0_2__2 ;
    public final void rule__Atomic__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3990:1: ( rule__Atomic__Group_0_2__1__Impl rule__Atomic__Group_0_2__2 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3991:2: rule__Atomic__Group_0_2__1__Impl rule__Atomic__Group_0_2__2
            {
            pushFollow(FOLLOW_rule__Atomic__Group_0_2__1__Impl_in_rule__Atomic__Group_0_2__17949);
            rule__Atomic__Group_0_2__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_0_2__2_in_rule__Atomic__Group_0_2__17952);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:3998:1: rule__Atomic__Group_0_2__1__Impl : ( ( rule__Atomic__ActualsAssignment_0_2_1 )? ) ;
    public final void rule__Atomic__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4002:1: ( ( ( rule__Atomic__ActualsAssignment_0_2_1 )? ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4003:1: ( ( rule__Atomic__ActualsAssignment_0_2_1 )? )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4003:1: ( ( rule__Atomic__ActualsAssignment_0_2_1 )? )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4004:1: ( rule__Atomic__ActualsAssignment_0_2_1 )?
            {
             before(grammarAccess.getAtomicAccess().getActualsAssignment_0_2_1()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4005:1: ( rule__Atomic__ActualsAssignment_0_2_1 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=RULE_ID && LA19_0<=RULE_STRING)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4005:2: rule__Atomic__ActualsAssignment_0_2_1
                    {
                    pushFollow(FOLLOW_rule__Atomic__ActualsAssignment_0_2_1_in_rule__Atomic__Group_0_2__1__Impl7979);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4015:1: rule__Atomic__Group_0_2__2 : rule__Atomic__Group_0_2__2__Impl rule__Atomic__Group_0_2__3 ;
    public final void rule__Atomic__Group_0_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4019:1: ( rule__Atomic__Group_0_2__2__Impl rule__Atomic__Group_0_2__3 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4020:2: rule__Atomic__Group_0_2__2__Impl rule__Atomic__Group_0_2__3
            {
            pushFollow(FOLLOW_rule__Atomic__Group_0_2__2__Impl_in_rule__Atomic__Group_0_2__28010);
            rule__Atomic__Group_0_2__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_0_2__3_in_rule__Atomic__Group_0_2__28013);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4027:1: rule__Atomic__Group_0_2__2__Impl : ( ( rule__Atomic__Group_0_2_2__0 )* ) ;
    public final void rule__Atomic__Group_0_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4031:1: ( ( ( rule__Atomic__Group_0_2_2__0 )* ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4032:1: ( ( rule__Atomic__Group_0_2_2__0 )* )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4032:1: ( ( rule__Atomic__Group_0_2_2__0 )* )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4033:1: ( rule__Atomic__Group_0_2_2__0 )*
            {
             before(grammarAccess.getAtomicAccess().getGroup_0_2_2()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4034:1: ( rule__Atomic__Group_0_2_2__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==21) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4034:2: rule__Atomic__Group_0_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Atomic__Group_0_2_2__0_in_rule__Atomic__Group_0_2__2__Impl8040);
            	    rule__Atomic__Group_0_2_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4044:1: rule__Atomic__Group_0_2__3 : rule__Atomic__Group_0_2__3__Impl ;
    public final void rule__Atomic__Group_0_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4048:1: ( rule__Atomic__Group_0_2__3__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4049:2: rule__Atomic__Group_0_2__3__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_0_2__3__Impl_in_rule__Atomic__Group_0_2__38071);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4055:1: rule__Atomic__Group_0_2__3__Impl : ( ')' ) ;
    public final void rule__Atomic__Group_0_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4059:1: ( ( ')' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4060:1: ( ')' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4060:1: ( ')' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4061:1: ')'
            {
             before(grammarAccess.getAtomicAccess().getRightParenthesisKeyword_0_2_3()); 
            match(input,18,FOLLOW_18_in_rule__Atomic__Group_0_2__3__Impl8099); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4082:1: rule__Atomic__Group_0_2_2__0 : rule__Atomic__Group_0_2_2__0__Impl rule__Atomic__Group_0_2_2__1 ;
    public final void rule__Atomic__Group_0_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4086:1: ( rule__Atomic__Group_0_2_2__0__Impl rule__Atomic__Group_0_2_2__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4087:2: rule__Atomic__Group_0_2_2__0__Impl rule__Atomic__Group_0_2_2__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_0_2_2__0__Impl_in_rule__Atomic__Group_0_2_2__08138);
            rule__Atomic__Group_0_2_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_0_2_2__1_in_rule__Atomic__Group_0_2_2__08141);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4094:1: rule__Atomic__Group_0_2_2__0__Impl : ( ',' ) ;
    public final void rule__Atomic__Group_0_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4098:1: ( ( ',' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4099:1: ( ',' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4099:1: ( ',' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4100:1: ','
            {
             before(grammarAccess.getAtomicAccess().getCommaKeyword_0_2_2_0()); 
            match(input,21,FOLLOW_21_in_rule__Atomic__Group_0_2_2__0__Impl8169); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4113:1: rule__Atomic__Group_0_2_2__1 : rule__Atomic__Group_0_2_2__1__Impl ;
    public final void rule__Atomic__Group_0_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4117:1: ( rule__Atomic__Group_0_2_2__1__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4118:2: rule__Atomic__Group_0_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_0_2_2__1__Impl_in_rule__Atomic__Group_0_2_2__18200);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4124:1: rule__Atomic__Group_0_2_2__1__Impl : ( ( rule__Atomic__ActualsAssignment_0_2_2_1 ) ) ;
    public final void rule__Atomic__Group_0_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4128:1: ( ( ( rule__Atomic__ActualsAssignment_0_2_2_1 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4129:1: ( ( rule__Atomic__ActualsAssignment_0_2_2_1 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4129:1: ( ( rule__Atomic__ActualsAssignment_0_2_2_1 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4130:1: ( rule__Atomic__ActualsAssignment_0_2_2_1 )
            {
             before(grammarAccess.getAtomicAccess().getActualsAssignment_0_2_2_1()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4131:1: ( rule__Atomic__ActualsAssignment_0_2_2_1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4131:2: rule__Atomic__ActualsAssignment_0_2_2_1
            {
            pushFollow(FOLLOW_rule__Atomic__ActualsAssignment_0_2_2_1_in_rule__Atomic__Group_0_2_2__1__Impl8227);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4145:1: rule__Atomic__Group_1__0 : rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 ;
    public final void rule__Atomic__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4149:1: ( rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4150:2: rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_1__0__Impl_in_rule__Atomic__Group_1__08261);
            rule__Atomic__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_1__1_in_rule__Atomic__Group_1__08264);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4157:1: rule__Atomic__Group_1__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4161:1: ( ( () ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4162:1: ( () )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4162:1: ( () )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4163:1: ()
            {
             before(grammarAccess.getAtomicAccess().getNumberLiteralAction_1_0()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4164:1: ()
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4166:1: 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4176:1: rule__Atomic__Group_1__1 : rule__Atomic__Group_1__1__Impl ;
    public final void rule__Atomic__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4180:1: ( rule__Atomic__Group_1__1__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4181:2: rule__Atomic__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_1__1__Impl_in_rule__Atomic__Group_1__18322);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4187:1: rule__Atomic__Group_1__1__Impl : ( ( rule__Atomic__ValueAssignment_1_1 ) ) ;
    public final void rule__Atomic__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4191:1: ( ( ( rule__Atomic__ValueAssignment_1_1 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4192:1: ( ( rule__Atomic__ValueAssignment_1_1 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4192:1: ( ( rule__Atomic__ValueAssignment_1_1 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4193:1: ( rule__Atomic__ValueAssignment_1_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_1_1()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4194:1: ( rule__Atomic__ValueAssignment_1_1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4194:2: rule__Atomic__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Atomic__ValueAssignment_1_1_in_rule__Atomic__Group_1__1__Impl8349);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4208:1: rule__Atomic__Group_2__0 : rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 ;
    public final void rule__Atomic__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4212:1: ( rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4213:2: rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_2__0__Impl_in_rule__Atomic__Group_2__08383);
            rule__Atomic__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_2__1_in_rule__Atomic__Group_2__08386);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4220:1: rule__Atomic__Group_2__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4224:1: ( ( () ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4225:1: ( () )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4225:1: ( () )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4226:1: ()
            {
             before(grammarAccess.getAtomicAccess().getStringLiteralAction_2_0()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4227:1: ()
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4229:1: 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4239:1: rule__Atomic__Group_2__1 : rule__Atomic__Group_2__1__Impl ;
    public final void rule__Atomic__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4243:1: ( rule__Atomic__Group_2__1__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4244:2: rule__Atomic__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_2__1__Impl_in_rule__Atomic__Group_2__18444);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4250:1: rule__Atomic__Group_2__1__Impl : ( ( rule__Atomic__ValueAssignment_2_1 ) ) ;
    public final void rule__Atomic__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4254:1: ( ( ( rule__Atomic__ValueAssignment_2_1 ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4255:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4255:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4256:1: ( rule__Atomic__ValueAssignment_2_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_2_1()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4257:1: ( rule__Atomic__ValueAssignment_2_1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4257:2: rule__Atomic__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Atomic__ValueAssignment_2_1_in_rule__Atomic__Group_2__1__Impl8471);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4271:1: rule__QID__Group__0 : rule__QID__Group__0__Impl rule__QID__Group__1 ;
    public final void rule__QID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4275:1: ( rule__QID__Group__0__Impl rule__QID__Group__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4276:2: rule__QID__Group__0__Impl rule__QID__Group__1
            {
            pushFollow(FOLLOW_rule__QID__Group__0__Impl_in_rule__QID__Group__08505);
            rule__QID__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__QID__Group__1_in_rule__QID__Group__08508);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4283:1: rule__QID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4287:1: ( ( RULE_ID ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4288:1: ( RULE_ID )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4288:1: ( RULE_ID )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4289:1: RULE_ID
            {
             before(grammarAccess.getQIDAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QID__Group__0__Impl8535); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4300:1: rule__QID__Group__1 : rule__QID__Group__1__Impl ;
    public final void rule__QID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4304:1: ( rule__QID__Group__1__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4305:2: rule__QID__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QID__Group__1__Impl_in_rule__QID__Group__18564);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4311:1: rule__QID__Group__1__Impl : ( ( rule__QID__Group_1__0 )* ) ;
    public final void rule__QID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4315:1: ( ( ( rule__QID__Group_1__0 )* ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4316:1: ( ( rule__QID__Group_1__0 )* )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4316:1: ( ( rule__QID__Group_1__0 )* )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4317:1: ( rule__QID__Group_1__0 )*
            {
             before(grammarAccess.getQIDAccess().getGroup_1()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4318:1: ( rule__QID__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==14) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4318:2: rule__QID__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QID__Group_1__0_in_rule__QID__Group__1__Impl8591);
            	    rule__QID__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4332:1: rule__QID__Group_1__0 : rule__QID__Group_1__0__Impl rule__QID__Group_1__1 ;
    public final void rule__QID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4336:1: ( rule__QID__Group_1__0__Impl rule__QID__Group_1__1 )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4337:2: rule__QID__Group_1__0__Impl rule__QID__Group_1__1
            {
            pushFollow(FOLLOW_rule__QID__Group_1__0__Impl_in_rule__QID__Group_1__08626);
            rule__QID__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__QID__Group_1__1_in_rule__QID__Group_1__08629);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4344:1: rule__QID__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4348:1: ( ( '.' ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4349:1: ( '.' )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4349:1: ( '.' )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4350:1: '.'
            {
             before(grammarAccess.getQIDAccess().getFullStopKeyword_1_0()); 
            match(input,14,FOLLOW_14_in_rule__QID__Group_1__0__Impl8657); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4363:1: rule__QID__Group_1__1 : rule__QID__Group_1__1__Impl ;
    public final void rule__QID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4367:1: ( rule__QID__Group_1__1__Impl )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4368:2: rule__QID__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QID__Group_1__1__Impl_in_rule__QID__Group_1__18688);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4374:1: rule__QID__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4378:1: ( ( RULE_ID ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4379:1: ( RULE_ID )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4379:1: ( RULE_ID )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4380:1: RULE_ID
            {
             before(grammarAccess.getQIDAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QID__Group_1__1__Impl8715); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4396:1: rule__Model__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4400:1: ( ( RULE_ID ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4401:1: ( RULE_ID )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4401:1: ( RULE_ID )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4402:1: RULE_ID
            {
             before(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Model__NameAssignment_18753); 
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


    // $ANTLR start rule__Model__UsingsAssignment_2
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4411:1: rule__Model__UsingsAssignment_2 : ( ruleUsing ) ;
    public final void rule__Model__UsingsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4415:1: ( ( ruleUsing ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4416:1: ( ruleUsing )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4416:1: ( ruleUsing )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4417:1: ruleUsing
            {
             before(grammarAccess.getModelAccess().getUsingsUsingParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleUsing_in_rule__Model__UsingsAssignment_28784);
            ruleUsing();
            _fsp--;

             after(grammarAccess.getModelAccess().getUsingsUsingParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__UsingsAssignment_2


    // $ANTLR start rule__Model__ElementsAssignment_3_0
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4426:1: rule__Model__ElementsAssignment_3_0 : ( ruleElement ) ;
    public final void rule__Model__ElementsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4430:1: ( ( ruleElement ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4431:1: ( ruleElement )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4431:1: ( ruleElement )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4432:1: ruleElement
            {
             before(grammarAccess.getModelAccess().getElementsElementParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_ruleElement_in_rule__Model__ElementsAssignment_3_08815);
            ruleElement();
            _fsp--;

             after(grammarAccess.getModelAccess().getElementsElementParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__ElementsAssignment_3_0


    // $ANTLR start rule__Model__FunctionsAssignment_3_1
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4441:1: rule__Model__FunctionsAssignment_3_1 : ( ruleFunctionDeclaration ) ;
    public final void rule__Model__FunctionsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4445:1: ( ( ruleFunctionDeclaration ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4446:1: ( ruleFunctionDeclaration )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4446:1: ( ruleFunctionDeclaration )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4447:1: ruleFunctionDeclaration
            {
             before(grammarAccess.getModelAccess().getFunctionsFunctionDeclarationParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleFunctionDeclaration_in_rule__Model__FunctionsAssignment_3_18846);
            ruleFunctionDeclaration();
            _fsp--;

             after(grammarAccess.getModelAccess().getFunctionsFunctionDeclarationParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__FunctionsAssignment_3_1


    // $ANTLR start rule__Using__ImportedNamespaceAssignment_1
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4456:1: rule__Using__ImportedNamespaceAssignment_1 : ( ruleImportID ) ;
    public final void rule__Using__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4460:1: ( ( ruleImportID ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4461:1: ( ruleImportID )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4461:1: ( ruleImportID )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4462:1: ruleImportID
            {
             before(grammarAccess.getUsingAccess().getImportedNamespaceImportIDParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleImportID_in_rule__Using__ImportedNamespaceAssignment_18877);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4471:1: rule__FunctionDeclaration__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__FunctionDeclaration__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4475:1: ( ( ruleType ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4476:1: ( ruleType )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4476:1: ( ruleType )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4477:1: ruleType
            {
             before(grammarAccess.getFunctionDeclarationAccess().getTypeTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__FunctionDeclaration__TypeAssignment_28908);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4486:1: rule__FunctionDeclaration__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__FunctionDeclaration__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4490:1: ( ( RULE_ID ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4491:1: ( RULE_ID )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4491:1: ( RULE_ID )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4492:1: RULE_ID
            {
             before(grammarAccess.getFunctionDeclarationAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FunctionDeclaration__NameAssignment_38939); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4501:1: rule__FunctionDeclaration__ParamsAssignment_5_0 : ( ruleParameter ) ;
    public final void rule__FunctionDeclaration__ParamsAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4505:1: ( ( ruleParameter ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4506:1: ( ruleParameter )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4506:1: ( ruleParameter )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4507:1: ruleParameter
            {
             before(grammarAccess.getFunctionDeclarationAccess().getParamsParameterParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__FunctionDeclaration__ParamsAssignment_5_08970);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4516:1: rule__FunctionDeclaration__ParamsAssignment_5_1_1 : ( ruleParameter ) ;
    public final void rule__FunctionDeclaration__ParamsAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4520:1: ( ( ruleParameter ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4521:1: ( ruleParameter )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4521:1: ( ruleParameter )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4522:1: ruleParameter
            {
             before(grammarAccess.getFunctionDeclarationAccess().getParamsParameterParserRuleCall_5_1_1_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__FunctionDeclaration__ParamsAssignment_5_1_19001);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4531:1: rule__FunctionDeclaration__ElementsAssignment_8 : ( ruleElement ) ;
    public final void rule__FunctionDeclaration__ElementsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4535:1: ( ( ruleElement ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4536:1: ( ruleElement )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4536:1: ( ruleElement )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4537:1: ruleElement
            {
             before(grammarAccess.getFunctionDeclarationAccess().getElementsElementParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleElement_in_rule__FunctionDeclaration__ElementsAssignment_89032);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4546:1: rule__Return__ExprAssignment_1 : ( ruleExpr ) ;
    public final void rule__Return__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4550:1: ( ( ruleExpr ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4551:1: ( ruleExpr )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4551:1: ( ruleExpr )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4552:1: ruleExpr
            {
             before(grammarAccess.getReturnAccess().getExprExprParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleExpr_in_rule__Return__ExprAssignment_19063);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4561:1: rule__Parameter__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__Parameter__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4565:1: ( ( ruleType ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4566:1: ( ruleType )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4566:1: ( ruleType )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4567:1: ruleType
            {
             before(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Parameter__TypeAssignment_19094);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4576:1: rule__Parameter__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4580:1: ( ( RULE_ID ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4581:1: ( RULE_ID )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4581:1: ( RULE_ID )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4582:1: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_29125); 
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


    // $ANTLR start rule__Assert__ExpressionAssignment_1
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4591:1: rule__Assert__ExpressionAssignment_1 : ( ruleExpr ) ;
    public final void rule__Assert__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4595:1: ( ( ruleExpr ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4596:1: ( ruleExpr )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4596:1: ( ruleExpr )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4597:1: ruleExpr
            {
             before(grammarAccess.getAssertAccess().getExpressionExprParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleExpr_in_rule__Assert__ExpressionAssignment_19156);
            ruleExpr();
            _fsp--;

             after(grammarAccess.getAssertAccess().getExpressionExprParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Assert__ExpressionAssignment_1


    // $ANTLR start rule__Assert__ErrorMsgAssignment_2_1
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4606:1: rule__Assert__ErrorMsgAssignment_2_1 : ( ruleExpr ) ;
    public final void rule__Assert__ErrorMsgAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4610:1: ( ( ruleExpr ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4611:1: ( ruleExpr )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4611:1: ( ruleExpr )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4612:1: ruleExpr
            {
             before(grammarAccess.getAssertAccess().getErrorMsgExprParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleExpr_in_rule__Assert__ErrorMsgAssignment_2_19187);
            ruleExpr();
            _fsp--;

             after(grammarAccess.getAssertAccess().getErrorMsgExprParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Assert__ErrorMsgAssignment_2_1


    // $ANTLR start rule__EnumDecl__NameAssignment_1
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4621:1: rule__EnumDecl__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EnumDecl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4625:1: ( ( RULE_ID ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4626:1: ( RULE_ID )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4626:1: ( RULE_ID )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4627:1: RULE_ID
            {
             before(grammarAccess.getEnumDeclAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumDecl__NameAssignment_19218); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4636:1: rule__EnumDecl__LiteralsAssignment_3 : ( ruleEnumLiteral ) ;
    public final void rule__EnumDecl__LiteralsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4640:1: ( ( ruleEnumLiteral ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4641:1: ( ruleEnumLiteral )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4641:1: ( ruleEnumLiteral )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4642:1: ruleEnumLiteral
            {
             before(grammarAccess.getEnumDeclAccess().getLiteralsEnumLiteralParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEnumLiteral_in_rule__EnumDecl__LiteralsAssignment_39249);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4651:1: rule__EnumLiteral__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EnumLiteral__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4655:1: ( ( RULE_ID ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4656:1: ( RULE_ID )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4656:1: ( RULE_ID )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4657:1: RULE_ID
            {
             before(grammarAccess.getEnumLiteralAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumLiteral__NameAssignment_19280); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4666:1: rule__VarDecl__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__VarDecl__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4670:1: ( ( ruleType ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4671:1: ( ruleType )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4671:1: ( ruleType )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4672:1: ruleType
            {
             before(grammarAccess.getVarDeclAccess().getTypeTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__VarDecl__TypeAssignment_29311);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4681:1: rule__VarDecl__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__VarDecl__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4685:1: ( ( RULE_ID ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4686:1: ( RULE_ID )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4686:1: ( RULE_ID )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4687:1: RULE_ID
            {
             before(grammarAccess.getVarDeclAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VarDecl__NameAssignment_39342); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4696:1: rule__VarDecl__InitAssignment_4_1 : ( ruleExpr ) ;
    public final void rule__VarDecl__InitAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4700:1: ( ( ruleExpr ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4701:1: ( ruleExpr )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4701:1: ( ruleExpr )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4702:1: ruleExpr
            {
             before(grammarAccess.getVarDeclAccess().getInitExprParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleExpr_in_rule__VarDecl__InitAssignment_4_19373);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4711:1: rule__ArrayType__BaseTypeAssignment_3 : ( ruleType ) ;
    public final void rule__ArrayType__BaseTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4715:1: ( ( ruleType ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4716:1: ( ruleType )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4716:1: ( ruleType )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4717:1: ruleType
            {
             before(grammarAccess.getArrayTypeAccess().getBaseTypeTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__ArrayType__BaseTypeAssignment_39404);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4726:1: rule__EnumType__EnumRefAssignment : ( ( RULE_ID ) ) ;
    public final void rule__EnumType__EnumRefAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4730:1: ( ( ( RULE_ID ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4731:1: ( ( RULE_ID ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4731:1: ( ( RULE_ID ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4732:1: ( RULE_ID )
            {
             before(grammarAccess.getEnumTypeAccess().getEnumRefEnumDeclCrossReference_0()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4733:1: ( RULE_ID )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4734:1: RULE_ID
            {
             before(grammarAccess.getEnumTypeAccess().getEnumRefEnumDeclIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumType__EnumRefAssignment9439); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4745:1: rule__Formula__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__Formula__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4749:1: ( ( ruleType ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4750:1: ( ruleType )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4750:1: ( ruleType )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4751:1: ruleType
            {
             before(grammarAccess.getFormulaAccess().getTypeTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Formula__TypeAssignment_29474);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4760:1: rule__Formula__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Formula__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4764:1: ( ( RULE_ID ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4765:1: ( RULE_ID )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4765:1: ( RULE_ID )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4766:1: RULE_ID
            {
             before(grammarAccess.getFormulaAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Formula__NameAssignment_39505); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4775:1: rule__Formula__ExprAssignment_5 : ( ruleExpr ) ;
    public final void rule__Formula__ExprAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4779:1: ( ( ruleExpr ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4780:1: ( ruleExpr )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4780:1: ( ruleExpr )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4781:1: ruleExpr
            {
             before(grammarAccess.getFormulaAccess().getExprExprParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleExpr_in_rule__Formula__ExprAssignment_59536);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4790:1: rule__Comparison__RightAssignment_1_2 : ( ruleAddition ) ;
    public final void rule__Comparison__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4794:1: ( ( ruleAddition ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4795:1: ( ruleAddition )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4795:1: ( ruleAddition )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4796:1: ruleAddition
            {
             before(grammarAccess.getComparisonAccess().getRightAdditionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleAddition_in_rule__Comparison__RightAssignment_1_29567);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4805:1: rule__Addition__RightAssignment_1_2 : ( ruleMultiplication ) ;
    public final void rule__Addition__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4809:1: ( ( ruleMultiplication ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4810:1: ( ruleMultiplication )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4810:1: ( ruleMultiplication )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4811:1: ruleMultiplication
            {
             before(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleMultiplication_in_rule__Addition__RightAssignment_1_29598);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4820:1: rule__Multiplication__RightAssignment_1_2 : ( rulePostfixOperators ) ;
    public final void rule__Multiplication__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4824:1: ( ( rulePostfixOperators ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4825:1: ( rulePostfixOperators )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4825:1: ( rulePostfixOperators )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4826:1: rulePostfixOperators
            {
             before(grammarAccess.getMultiplicationAccess().getRightPostfixOperatorsParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_rulePostfixOperators_in_rule__Multiplication__RightAssignment_1_29629);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4835:1: rule__PostfixOperators__IndexAssignment_1_2 : ( ruleExpr ) ;
    public final void rule__PostfixOperators__IndexAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4839:1: ( ( ruleExpr ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4840:1: ( ruleExpr )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4840:1: ( ruleExpr )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4841:1: ruleExpr
            {
             before(grammarAccess.getPostfixOperatorsAccess().getIndexExprParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleExpr_in_rule__PostfixOperators__IndexAssignment_1_29660);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4850:1: rule__Atomic__SymbolAssignment_0_1 : ( ( ruleQID ) ) ;
    public final void rule__Atomic__SymbolAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4854:1: ( ( ( ruleQID ) ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4855:1: ( ( ruleQID ) )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4855:1: ( ( ruleQID ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4856:1: ( ruleQID )
            {
             before(grammarAccess.getAtomicAccess().getSymbolSymbolCrossReference_0_1_0()); 
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4857:1: ( ruleQID )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4858:1: ruleQID
            {
             before(grammarAccess.getAtomicAccess().getSymbolSymbolQIDParserRuleCall_0_1_0_1()); 
            pushFollow(FOLLOW_ruleQID_in_rule__Atomic__SymbolAssignment_0_19695);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4869:1: rule__Atomic__ActualsAssignment_0_2_1 : ( ruleExpr ) ;
    public final void rule__Atomic__ActualsAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4873:1: ( ( ruleExpr ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4874:1: ( ruleExpr )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4874:1: ( ruleExpr )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4875:1: ruleExpr
            {
             before(grammarAccess.getAtomicAccess().getActualsExprParserRuleCall_0_2_1_0()); 
            pushFollow(FOLLOW_ruleExpr_in_rule__Atomic__ActualsAssignment_0_2_19730);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4884:1: rule__Atomic__ActualsAssignment_0_2_2_1 : ( ruleExpr ) ;
    public final void rule__Atomic__ActualsAssignment_0_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4888:1: ( ( ruleExpr ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4889:1: ( ruleExpr )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4889:1: ( ruleExpr )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4890:1: ruleExpr
            {
             before(grammarAccess.getAtomicAccess().getActualsExprParserRuleCall_0_2_2_1_0()); 
            pushFollow(FOLLOW_ruleExpr_in_rule__Atomic__ActualsAssignment_0_2_2_19761);
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4899:1: rule__Atomic__ValueAssignment_1_1 : ( RULE_NUMBER ) ;
    public final void rule__Atomic__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4903:1: ( ( RULE_NUMBER ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4904:1: ( RULE_NUMBER )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4904:1: ( RULE_NUMBER )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4905:1: RULE_NUMBER
            {
             before(grammarAccess.getAtomicAccess().getValueNUMBERTerminalRuleCall_1_1_0()); 
            match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__Atomic__ValueAssignment_1_19792); 
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
    // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4914:1: rule__Atomic__ValueAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Atomic__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4918:1: ( ( RULE_STRING ) )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4919:1: ( RULE_STRING )
            {
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4919:1: ( RULE_STRING )
            // ../expr.ui/src-gen/expr/ui/contentassist/antlr/internal/InternalExprDemo.g:4920:1: RULE_STRING
            {
             before(grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Atomic__ValueAssignment_2_19823); 
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
    public static final BitSet FOLLOW_rule__Model__ElementsAssignment_3_0_in_rule__Model__Alternatives_31689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__FunctionsAssignment_3_1_in_rule__Model__Alternatives_31707 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02056 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Model__Group__0__Impl2087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12118 = new BitSet(new long[]{0x000000100D412002L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__12121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__1__Impl2148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__22178 = new BitSet(new long[]{0x000000100D410002L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__22181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__UsingsAssignment_2_in_rule__Model__Group__2__Impl2208 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__32239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Alternatives_3_in_rule__Model__Group__3__Impl2266 = new BitSet(new long[]{0x000000100D410002L});
    public static final BitSet FOLLOW_rule__Using__Group__0__Impl_in_rule__Using__Group__02305 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Using__Group__1_in_rule__Using__Group__02308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Using__Group__0__Impl2336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Using__Group__1__Impl_in_rule__Using__Group__12367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Using__ImportedNamespaceAssignment_1_in_rule__Using__Group__1__Impl2394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportID__Group__0__Impl_in_rule__ImportID__Group__02428 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__ImportID__Group__1_in_rule__ImportID__Group__02431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ImportID__Group__0__Impl2458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportID__Group__1__Impl_in_rule__ImportID__Group__12487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportID__Group_1__0_in_rule__ImportID__Group__1__Impl2514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportID__Group_1__0__Impl_in_rule__ImportID__Group_1__02548 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__ImportID__Group_1__1_in_rule__ImportID__Group_1__02551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ImportID__Group_1__0__Impl2579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportID__Group_1__1__Impl_in_rule__ImportID__Group_1__12610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ImportID__Group_1__1__Impl2638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__0__Impl_in_rule__FunctionDeclaration__Group__02673 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__1_in_rule__FunctionDeclaration__Group__02676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__1__Impl_in_rule__FunctionDeclaration__Group__12734 = new BitSet(new long[]{0x0000000F20000010L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__2_in_rule__FunctionDeclaration__Group__12737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__FunctionDeclaration__Group__1__Impl2765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__2__Impl_in_rule__FunctionDeclaration__Group__22796 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__3_in_rule__FunctionDeclaration__Group__22799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__TypeAssignment_2_in_rule__FunctionDeclaration__Group__2__Impl2826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__3__Impl_in_rule__FunctionDeclaration__Group__32856 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__4_in_rule__FunctionDeclaration__Group__32859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__NameAssignment_3_in_rule__FunctionDeclaration__Group__3__Impl2886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__4__Impl_in_rule__FunctionDeclaration__Group__42916 = new BitSet(new long[]{0x0000000F20040010L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__5_in_rule__FunctionDeclaration__Group__42919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__FunctionDeclaration__Group__4__Impl2947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__5__Impl_in_rule__FunctionDeclaration__Group__52978 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__6_in_rule__FunctionDeclaration__Group__52981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group_5__0_in_rule__FunctionDeclaration__Group__5__Impl3008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__6__Impl_in_rule__FunctionDeclaration__Group__63039 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__7_in_rule__FunctionDeclaration__Group__63042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__FunctionDeclaration__Group__6__Impl3070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__7__Impl_in_rule__FunctionDeclaration__Group__73101 = new BitSet(new long[]{0x000000100D500000L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__8_in_rule__FunctionDeclaration__Group__73104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__FunctionDeclaration__Group__7__Impl3132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__8__Impl_in_rule__FunctionDeclaration__Group__83163 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__9_in_rule__FunctionDeclaration__Group__83166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__ElementsAssignment_8_in_rule__FunctionDeclaration__Group__8__Impl3193 = new BitSet(new long[]{0x000000100D400002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__9__Impl_in_rule__FunctionDeclaration__Group__93224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__FunctionDeclaration__Group__9__Impl3252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group_5__0__Impl_in_rule__FunctionDeclaration__Group_5__03303 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group_5__1_in_rule__FunctionDeclaration__Group_5__03306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__ParamsAssignment_5_0_in_rule__FunctionDeclaration__Group_5__0__Impl3333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group_5__1__Impl_in_rule__FunctionDeclaration__Group_5__13363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group_5_1__0_in_rule__FunctionDeclaration__Group_5__1__Impl3390 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group_5_1__0__Impl_in_rule__FunctionDeclaration__Group_5_1__03425 = new BitSet(new long[]{0x0000000F20000010L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group_5_1__1_in_rule__FunctionDeclaration__Group_5_1__03428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__FunctionDeclaration__Group_5_1__0__Impl3456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group_5_1__1__Impl_in_rule__FunctionDeclaration__Group_5_1__13487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__ParamsAssignment_5_1_1_in_rule__FunctionDeclaration__Group_5_1__1__Impl3514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Return__Group__0__Impl_in_rule__Return__Group__03548 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__Return__Group__1_in_rule__Return__Group__03551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Return__Group__0__Impl3579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Return__Group__1__Impl_in_rule__Return__Group__13610 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Return__Group__2_in_rule__Return__Group__13613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Return__ExprAssignment_1_in_rule__Return__Group__1__Impl3640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Return__Group__2__Impl_in_rule__Return__Group__23670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Return__Group__2__Impl3698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__03735 = new BitSet(new long[]{0x0000000F20000010L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__03738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__13796 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__13799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__TypeAssignment_1_in_rule__Parameter__Group__1__Impl3826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__23856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__NameAssignment_2_in_rule__Parameter__Group__2__Impl3883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assert__Group__0__Impl_in_rule__Assert__Group__03919 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__Assert__Group__1_in_rule__Assert__Group__03922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Assert__Group__0__Impl3950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assert__Group__1__Impl_in_rule__Assert__Group__13981 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Assert__Group__2_in_rule__Assert__Group__13984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assert__ExpressionAssignment_1_in_rule__Assert__Group__1__Impl4011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assert__Group__2__Impl_in_rule__Assert__Group__24041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assert__Group_2__0_in_rule__Assert__Group__2__Impl4068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assert__Group_2__0__Impl_in_rule__Assert__Group_2__04105 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__Assert__Group_2__1_in_rule__Assert__Group_2__04108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Assert__Group_2__0__Impl4136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assert__Group_2__1__Impl_in_rule__Assert__Group_2__14167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assert__ErrorMsgAssignment_2_1_in_rule__Assert__Group_2__1__Impl4194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDecl__Group__0__Impl_in_rule__EnumDecl__Group__04228 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumDecl__Group__1_in_rule__EnumDecl__Group__04231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__EnumDecl__Group__0__Impl4259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDecl__Group__1__Impl_in_rule__EnumDecl__Group__14290 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__EnumDecl__Group__2_in_rule__EnumDecl__Group__14293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDecl__NameAssignment_1_in_rule__EnumDecl__Group__1__Impl4320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDecl__Group__2__Impl_in_rule__EnumDecl__Group__24350 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_rule__EnumDecl__Group__3_in_rule__EnumDecl__Group__24353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__EnumDecl__Group__2__Impl4381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDecl__Group__3__Impl_in_rule__EnumDecl__Group__34412 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__EnumDecl__Group__4_in_rule__EnumDecl__Group__34415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDecl__LiteralsAssignment_3_in_rule__EnumDecl__Group__3__Impl4442 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__EnumDecl__Group__4__Impl_in_rule__EnumDecl__Group__44473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__EnumDecl__Group__4__Impl4501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumLiteral__Group__0__Impl_in_rule__EnumLiteral__Group__04542 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumLiteral__Group__1_in_rule__EnumLiteral__Group__04545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumLiteral__Group__1__Impl_in_rule__EnumLiteral__Group__14603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumLiteral__NameAssignment_1_in_rule__EnumLiteral__Group__1__Impl4630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__0__Impl_in_rule__VarDecl__Group__04664 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__1_in_rule__VarDecl__Group__04667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__1__Impl_in_rule__VarDecl__Group__14725 = new BitSet(new long[]{0x0000000F20000010L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__2_in_rule__VarDecl__Group__14728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__VarDecl__Group__1__Impl4756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__2__Impl_in_rule__VarDecl__Group__24787 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__3_in_rule__VarDecl__Group__24790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__TypeAssignment_2_in_rule__VarDecl__Group__2__Impl4817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__3__Impl_in_rule__VarDecl__Group__34847 = new BitSet(new long[]{0x0000000010800000L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__4_in_rule__VarDecl__Group__34850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__NameAssignment_3_in_rule__VarDecl__Group__3__Impl4877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__4__Impl_in_rule__VarDecl__Group__44907 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__5_in_rule__VarDecl__Group__44910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group_4__0_in_rule__VarDecl__Group__4__Impl4937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__5__Impl_in_rule__VarDecl__Group__54968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__VarDecl__Group__5__Impl4996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group_4__0__Impl_in_rule__VarDecl__Group_4__05039 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__VarDecl__Group_4__1_in_rule__VarDecl__Group_4__05042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__VarDecl__Group_4__0__Impl5070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group_4__1__Impl_in_rule__VarDecl__Group_4__15101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__InitAssignment_4_1_in_rule__VarDecl__Group_4__1__Impl5128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__0__Impl_in_rule__ArrayType__Group__05162 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__1_in_rule__ArrayType__Group__05165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__1__Impl_in_rule__ArrayType__Group__15223 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__2_in_rule__ArrayType__Group__15226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ArrayType__Group__1__Impl5254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__2__Impl_in_rule__ArrayType__Group__25285 = new BitSet(new long[]{0x0000000F20000010L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__3_in_rule__ArrayType__Group__25288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ArrayType__Group__2__Impl5316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__3__Impl_in_rule__ArrayType__Group__35347 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__4_in_rule__ArrayType__Group__35350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__BaseTypeAssignment_3_in_rule__ArrayType__Group__3__Impl5377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__4__Impl_in_rule__ArrayType__Group__45407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ArrayType__Group__4__Impl5435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntType__Group__0__Impl_in_rule__IntType__Group__05476 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__IntType__Group__1_in_rule__IntType__Group__05479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntType__Group__1__Impl_in_rule__IntType__Group__15537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__IntType__Group__1__Impl5565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolType__Group__0__Impl_in_rule__BoolType__Group__05600 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__BoolType__Group__1_in_rule__BoolType__Group__05603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolType__Group__1__Impl_in_rule__BoolType__Group__15661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__BoolType__Group__1__Impl5689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatType__Group__0__Impl_in_rule__FloatType__Group__05724 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__FloatType__Group__1_in_rule__FloatType__Group__05727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatType__Group__1__Impl_in_rule__FloatType__Group__15785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__FloatType__Group__1__Impl5813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringType__Group__0__Impl_in_rule__StringType__Group__05848 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__StringType__Group__1_in_rule__StringType__Group__05851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringType__Group__1__Impl_in_rule__StringType__Group__15909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__StringType__Group__1__Impl5937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Formula__Group__0__Impl_in_rule__Formula__Group__05972 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Formula__Group__1_in_rule__Formula__Group__05975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Formula__Group__1__Impl_in_rule__Formula__Group__16033 = new BitSet(new long[]{0x0000000F20000010L});
    public static final BitSet FOLLOW_rule__Formula__Group__2_in_rule__Formula__Group__16036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Formula__Group__1__Impl6064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Formula__Group__2__Impl_in_rule__Formula__Group__26095 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Formula__Group__3_in_rule__Formula__Group__26098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Formula__TypeAssignment_2_in_rule__Formula__Group__2__Impl6125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Formula__Group__3__Impl_in_rule__Formula__Group__36155 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Formula__Group__4_in_rule__Formula__Group__36158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Formula__NameAssignment_3_in_rule__Formula__Group__3__Impl6185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Formula__Group__4__Impl_in_rule__Formula__Group__46215 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__Formula__Group__5_in_rule__Formula__Group__46218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Formula__Group__4__Impl6246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Formula__Group__5__Impl_in_rule__Formula__Group__56277 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Formula__Group__6_in_rule__Formula__Group__56280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Formula__ExprAssignment_5_in_rule__Formula__Group__5__Impl6307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Formula__Group__6__Impl_in_rule__Formula__Group__66337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Formula__Group__6__Impl6365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__0__Impl_in_rule__Comparison__Group__06410 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__1_in_rule__Comparison__Group__06413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_rule__Comparison__Group__0__Impl6440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__1__Impl_in_rule__Comparison__Group__16469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__0_in_rule__Comparison__Group__1__Impl6496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__0__Impl_in_rule__Comparison__Group_1__06531 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__1_in_rule__Comparison__Group_1__06534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__1__Impl_in_rule__Comparison__Group_1__16592 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__2_in_rule__Comparison__Group_1__16595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Comparison__Group_1__1__Impl6623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__2__Impl_in_rule__Comparison__Group_1__26654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__RightAssignment_1_2_in_rule__Comparison__Group_1__2__Impl6681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__0__Impl_in_rule__Addition__Group__06717 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__1_in_rule__Addition__Group__06720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_rule__Addition__Group__0__Impl6747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__1__Impl_in_rule__Addition__Group__16776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__0_in_rule__Addition__Group__1__Impl6803 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__0__Impl_in_rule__Addition__Group_1__06838 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__1_in_rule__Addition__Group_1__06841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__1__Impl_in_rule__Addition__Group_1__16899 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__2_in_rule__Addition__Group_1__16902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Addition__Group_1__1__Impl6930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__2__Impl_in_rule__Addition__Group_1__26961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__RightAssignment_1_2_in_rule__Addition__Group_1__2__Impl6988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__0__Impl_in_rule__Multiplication__Group__07024 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__1_in_rule__Multiplication__Group__07027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePostfixOperators_in_rule__Multiplication__Group__0__Impl7054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__1__Impl_in_rule__Multiplication__Group__17083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__0_in_rule__Multiplication__Group__1__Impl7110 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__0__Impl_in_rule__Multiplication__Group_1__07145 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__1_in_rule__Multiplication__Group_1__07148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__1__Impl_in_rule__Multiplication__Group_1__17206 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__2_in_rule__Multiplication__Group_1__17209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Multiplication__Group_1__1__Impl7237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__2__Impl_in_rule__Multiplication__Group_1__27268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__RightAssignment_1_2_in_rule__Multiplication__Group_1__2__Impl7295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixOperators__Group__0__Impl_in_rule__PostfixOperators__Group__07331 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__PostfixOperators__Group__1_in_rule__PostfixOperators__Group__07334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_rule__PostfixOperators__Group__0__Impl7361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixOperators__Group__1__Impl_in_rule__PostfixOperators__Group__17390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixOperators__Group_1__0_in_rule__PostfixOperators__Group__1__Impl7417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixOperators__Group_1__0__Impl_in_rule__PostfixOperators__Group_1__07452 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__PostfixOperators__Group_1__1_in_rule__PostfixOperators__Group_1__07455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixOperators__Group_1__1__Impl_in_rule__PostfixOperators__Group_1__17513 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__PostfixOperators__Group_1__2_in_rule__PostfixOperators__Group_1__17516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__PostfixOperators__Group_1__1__Impl7544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixOperators__Group_1__2__Impl_in_rule__PostfixOperators__Group_1__27575 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__PostfixOperators__Group_1__3_in_rule__PostfixOperators__Group_1__27578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixOperators__IndexAssignment_1_2_in_rule__PostfixOperators__Group_1__2__Impl7605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixOperators__Group_1__3__Impl_in_rule__PostfixOperators__Group_1__37635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__PostfixOperators__Group_1__3__Impl7663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0__0__Impl_in_rule__Atomic__Group_0__07702 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0__1_in_rule__Atomic__Group_0__07705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0__1__Impl_in_rule__Atomic__Group_0__17763 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0__2_in_rule__Atomic__Group_0__17766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__SymbolAssignment_0_1_in_rule__Atomic__Group_0__1__Impl7793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0__2__Impl_in_rule__Atomic__Group_0__27823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0_2__0_in_rule__Atomic__Group_0__2__Impl7850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0_2__0__Impl_in_rule__Atomic__Group_0_2__07887 = new BitSet(new long[]{0x0000000000240070L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0_2__1_in_rule__Atomic__Group_0_2__07890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Atomic__Group_0_2__0__Impl7918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0_2__1__Impl_in_rule__Atomic__Group_0_2__17949 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0_2__2_in_rule__Atomic__Group_0_2__17952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ActualsAssignment_0_2_1_in_rule__Atomic__Group_0_2__1__Impl7979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0_2__2__Impl_in_rule__Atomic__Group_0_2__28010 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0_2__3_in_rule__Atomic__Group_0_2__28013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0_2_2__0_in_rule__Atomic__Group_0_2__2__Impl8040 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0_2__3__Impl_in_rule__Atomic__Group_0_2__38071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Atomic__Group_0_2__3__Impl8099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0_2_2__0__Impl_in_rule__Atomic__Group_0_2_2__08138 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0_2_2__1_in_rule__Atomic__Group_0_2_2__08141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Atomic__Group_0_2_2__0__Impl8169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0_2_2__1__Impl_in_rule__Atomic__Group_0_2_2__18200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ActualsAssignment_0_2_2_1_in_rule__Atomic__Group_0_2_2__1__Impl8227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__0__Impl_in_rule__Atomic__Group_1__08261 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__1_in_rule__Atomic__Group_1__08264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__1__Impl_in_rule__Atomic__Group_1__18322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ValueAssignment_1_1_in_rule__Atomic__Group_1__1__Impl8349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2__0__Impl_in_rule__Atomic__Group_2__08383 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2__1_in_rule__Atomic__Group_2__08386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2__1__Impl_in_rule__Atomic__Group_2__18444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ValueAssignment_2_1_in_rule__Atomic__Group_2__1__Impl8471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QID__Group__0__Impl_in_rule__QID__Group__08505 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__QID__Group__1_in_rule__QID__Group__08508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QID__Group__0__Impl8535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QID__Group__1__Impl_in_rule__QID__Group__18564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QID__Group_1__0_in_rule__QID__Group__1__Impl8591 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__QID__Group_1__0__Impl_in_rule__QID__Group_1__08626 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QID__Group_1__1_in_rule__QID__Group_1__08629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__QID__Group_1__0__Impl8657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QID__Group_1__1__Impl_in_rule__QID__Group_1__18688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QID__Group_1__1__Impl8715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Model__NameAssignment_18753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsing_in_rule__Model__UsingsAssignment_28784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_rule__Model__ElementsAssignment_3_08815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDeclaration_in_rule__Model__FunctionsAssignment_3_18846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportID_in_rule__Using__ImportedNamespaceAssignment_18877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__FunctionDeclaration__TypeAssignment_28908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FunctionDeclaration__NameAssignment_38939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__FunctionDeclaration__ParamsAssignment_5_08970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__FunctionDeclaration__ParamsAssignment_5_1_19001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_rule__FunctionDeclaration__ElementsAssignment_89032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Return__ExprAssignment_19063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Parameter__TypeAssignment_19094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_29125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Assert__ExpressionAssignment_19156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Assert__ErrorMsgAssignment_2_19187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumDecl__NameAssignment_19218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumLiteral_in_rule__EnumDecl__LiteralsAssignment_39249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumLiteral__NameAssignment_19280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__VarDecl__TypeAssignment_29311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VarDecl__NameAssignment_39342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__VarDecl__InitAssignment_4_19373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__ArrayType__BaseTypeAssignment_39404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumType__EnumRefAssignment9439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Formula__TypeAssignment_29474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Formula__NameAssignment_39505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Formula__ExprAssignment_59536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_rule__Comparison__RightAssignment_1_29567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_rule__Addition__RightAssignment_1_29598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePostfixOperators_in_rule__Multiplication__RightAssignment_1_29629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__PostfixOperators__IndexAssignment_1_29660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQID_in_rule__Atomic__SymbolAssignment_0_19695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Atomic__ActualsAssignment_0_2_19730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Atomic__ActualsAssignment_0_2_2_19761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__Atomic__ValueAssignment_1_19792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Atomic__ValueAssignment_2_19823 = new BitSet(new long[]{0x0000000000000002L});

}