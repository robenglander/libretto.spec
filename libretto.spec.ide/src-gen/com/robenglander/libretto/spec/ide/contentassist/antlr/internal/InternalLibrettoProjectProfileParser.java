package com.robenglander.libretto.spec.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import com.robenglander.libretto.spec.services.LibrettoProjectProfileGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLibrettoProjectProfileParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'local'", "'openai'", "'ollama'", "'boolean'", "'int'", "'long'", "'double'", "'float'", "'short'", "'byte'", "'char'", "'void'", "'.'", "'-'", "'_'", "'profile'", "'{'", "'}'", "'project'", "'rootDir'", "'modules'", "'module'", "'dir'", "'specDir'", "'testDir'", "'mainDir'", "'basePackage'", "'gen'", "'initialInstruction'", "'maxRetries'", "'parseCheck'", "'defaultCorrection'", "'rules'", "'rule'", "'pattern'", "'code'", "'correction'", "'default'", "'llmProviders'", "'provider'", "'kind'", "'localModelPath'", "'model'", "'endpoint'", "'modelUsage'", "'primary'", "'secondary'", "'escalation'", "'enabled'", "'escalateAtRetry'", "'surface'", "'for'", "'spec'", "'returnType'", "'method'", "'as'", "';'", "'paramType'", "'name'", "'recordSelfReturn'", "','", "'methodOverride'", "'returns'", "'('", "')'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalLibrettoProjectProfileParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLibrettoProjectProfileParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLibrettoProjectProfileParser.tokenNames; }
    public String getGrammarFileName() { return "InternalLibrettoProjectProfile.g"; }


    	private LibrettoProjectProfileGrammarAccess grammarAccess;

    	public void setGrammarAccess(LibrettoProjectProfileGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleProjectProfile"
    // InternalLibrettoProjectProfile.g:53:1: entryRuleProjectProfile : ruleProjectProfile EOF ;
    public final void entryRuleProjectProfile() throws RecognitionException {
        try {
            // InternalLibrettoProjectProfile.g:54:1: ( ruleProjectProfile EOF )
            // InternalLibrettoProjectProfile.g:55:1: ruleProjectProfile EOF
            {
             before(grammarAccess.getProjectProfileRule()); 
            pushFollow(FOLLOW_1);
            ruleProjectProfile();

            state._fsp--;

             after(grammarAccess.getProjectProfileRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProjectProfile"


    // $ANTLR start "ruleProjectProfile"
    // InternalLibrettoProjectProfile.g:62:1: ruleProjectProfile : ( ( rule__ProjectProfile__Group__0 ) ) ;
    public final void ruleProjectProfile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:66:2: ( ( ( rule__ProjectProfile__Group__0 ) ) )
            // InternalLibrettoProjectProfile.g:67:2: ( ( rule__ProjectProfile__Group__0 ) )
            {
            // InternalLibrettoProjectProfile.g:67:2: ( ( rule__ProjectProfile__Group__0 ) )
            // InternalLibrettoProjectProfile.g:68:3: ( rule__ProjectProfile__Group__0 )
            {
             before(grammarAccess.getProjectProfileAccess().getGroup()); 
            // InternalLibrettoProjectProfile.g:69:3: ( rule__ProjectProfile__Group__0 )
            // InternalLibrettoProjectProfile.g:69:4: rule__ProjectProfile__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ProjectProfile__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProjectProfileAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProjectProfile"


    // $ANTLR start "entryRuleProjectBlock"
    // InternalLibrettoProjectProfile.g:78:1: entryRuleProjectBlock : ruleProjectBlock EOF ;
    public final void entryRuleProjectBlock() throws RecognitionException {
        try {
            // InternalLibrettoProjectProfile.g:79:1: ( ruleProjectBlock EOF )
            // InternalLibrettoProjectProfile.g:80:1: ruleProjectBlock EOF
            {
             before(grammarAccess.getProjectBlockRule()); 
            pushFollow(FOLLOW_1);
            ruleProjectBlock();

            state._fsp--;

             after(grammarAccess.getProjectBlockRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProjectBlock"


    // $ANTLR start "ruleProjectBlock"
    // InternalLibrettoProjectProfile.g:87:1: ruleProjectBlock : ( ( rule__ProjectBlock__Group__0 ) ) ;
    public final void ruleProjectBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:91:2: ( ( ( rule__ProjectBlock__Group__0 ) ) )
            // InternalLibrettoProjectProfile.g:92:2: ( ( rule__ProjectBlock__Group__0 ) )
            {
            // InternalLibrettoProjectProfile.g:92:2: ( ( rule__ProjectBlock__Group__0 ) )
            // InternalLibrettoProjectProfile.g:93:3: ( rule__ProjectBlock__Group__0 )
            {
             before(grammarAccess.getProjectBlockAccess().getGroup()); 
            // InternalLibrettoProjectProfile.g:94:3: ( rule__ProjectBlock__Group__0 )
            // InternalLibrettoProjectProfile.g:94:4: rule__ProjectBlock__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ProjectBlock__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProjectBlockAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProjectBlock"


    // $ANTLR start "entryRuleModulesBlock"
    // InternalLibrettoProjectProfile.g:103:1: entryRuleModulesBlock : ruleModulesBlock EOF ;
    public final void entryRuleModulesBlock() throws RecognitionException {
        try {
            // InternalLibrettoProjectProfile.g:104:1: ( ruleModulesBlock EOF )
            // InternalLibrettoProjectProfile.g:105:1: ruleModulesBlock EOF
            {
             before(grammarAccess.getModulesBlockRule()); 
            pushFollow(FOLLOW_1);
            ruleModulesBlock();

            state._fsp--;

             after(grammarAccess.getModulesBlockRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleModulesBlock"


    // $ANTLR start "ruleModulesBlock"
    // InternalLibrettoProjectProfile.g:112:1: ruleModulesBlock : ( ( rule__ModulesBlock__Group__0 ) ) ;
    public final void ruleModulesBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:116:2: ( ( ( rule__ModulesBlock__Group__0 ) ) )
            // InternalLibrettoProjectProfile.g:117:2: ( ( rule__ModulesBlock__Group__0 ) )
            {
            // InternalLibrettoProjectProfile.g:117:2: ( ( rule__ModulesBlock__Group__0 ) )
            // InternalLibrettoProjectProfile.g:118:3: ( rule__ModulesBlock__Group__0 )
            {
             before(grammarAccess.getModulesBlockAccess().getGroup()); 
            // InternalLibrettoProjectProfile.g:119:3: ( rule__ModulesBlock__Group__0 )
            // InternalLibrettoProjectProfile.g:119:4: rule__ModulesBlock__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ModulesBlock__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModulesBlockAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModulesBlock"


    // $ANTLR start "entryRuleProjectModule"
    // InternalLibrettoProjectProfile.g:128:1: entryRuleProjectModule : ruleProjectModule EOF ;
    public final void entryRuleProjectModule() throws RecognitionException {
        try {
            // InternalLibrettoProjectProfile.g:129:1: ( ruleProjectModule EOF )
            // InternalLibrettoProjectProfile.g:130:1: ruleProjectModule EOF
            {
             before(grammarAccess.getProjectModuleRule()); 
            pushFollow(FOLLOW_1);
            ruleProjectModule();

            state._fsp--;

             after(grammarAccess.getProjectModuleRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProjectModule"


    // $ANTLR start "ruleProjectModule"
    // InternalLibrettoProjectProfile.g:137:1: ruleProjectModule : ( ( rule__ProjectModule__Group__0 ) ) ;
    public final void ruleProjectModule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:141:2: ( ( ( rule__ProjectModule__Group__0 ) ) )
            // InternalLibrettoProjectProfile.g:142:2: ( ( rule__ProjectModule__Group__0 ) )
            {
            // InternalLibrettoProjectProfile.g:142:2: ( ( rule__ProjectModule__Group__0 ) )
            // InternalLibrettoProjectProfile.g:143:3: ( rule__ProjectModule__Group__0 )
            {
             before(grammarAccess.getProjectModuleAccess().getGroup()); 
            // InternalLibrettoProjectProfile.g:144:3: ( rule__ProjectModule__Group__0 )
            // InternalLibrettoProjectProfile.g:144:4: rule__ProjectModule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ProjectModule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProjectModuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProjectModule"


    // $ANTLR start "entryRuleGenBlock"
    // InternalLibrettoProjectProfile.g:153:1: entryRuleGenBlock : ruleGenBlock EOF ;
    public final void entryRuleGenBlock() throws RecognitionException {
        try {
            // InternalLibrettoProjectProfile.g:154:1: ( ruleGenBlock EOF )
            // InternalLibrettoProjectProfile.g:155:1: ruleGenBlock EOF
            {
             before(grammarAccess.getGenBlockRule()); 
            pushFollow(FOLLOW_1);
            ruleGenBlock();

            state._fsp--;

             after(grammarAccess.getGenBlockRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGenBlock"


    // $ANTLR start "ruleGenBlock"
    // InternalLibrettoProjectProfile.g:162:1: ruleGenBlock : ( ( rule__GenBlock__Group__0 ) ) ;
    public final void ruleGenBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:166:2: ( ( ( rule__GenBlock__Group__0 ) ) )
            // InternalLibrettoProjectProfile.g:167:2: ( ( rule__GenBlock__Group__0 ) )
            {
            // InternalLibrettoProjectProfile.g:167:2: ( ( rule__GenBlock__Group__0 ) )
            // InternalLibrettoProjectProfile.g:168:3: ( rule__GenBlock__Group__0 )
            {
             before(grammarAccess.getGenBlockAccess().getGroup()); 
            // InternalLibrettoProjectProfile.g:169:3: ( rule__GenBlock__Group__0 )
            // InternalLibrettoProjectProfile.g:169:4: rule__GenBlock__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GenBlock__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGenBlockAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGenBlock"


    // $ANTLR start "entryRuleGenRemediationRules"
    // InternalLibrettoProjectProfile.g:178:1: entryRuleGenRemediationRules : ruleGenRemediationRules EOF ;
    public final void entryRuleGenRemediationRules() throws RecognitionException {
        try {
            // InternalLibrettoProjectProfile.g:179:1: ( ruleGenRemediationRules EOF )
            // InternalLibrettoProjectProfile.g:180:1: ruleGenRemediationRules EOF
            {
             before(grammarAccess.getGenRemediationRulesRule()); 
            pushFollow(FOLLOW_1);
            ruleGenRemediationRules();

            state._fsp--;

             after(grammarAccess.getGenRemediationRulesRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGenRemediationRules"


    // $ANTLR start "ruleGenRemediationRules"
    // InternalLibrettoProjectProfile.g:187:1: ruleGenRemediationRules : ( ( rule__GenRemediationRules__Group__0 ) ) ;
    public final void ruleGenRemediationRules() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:191:2: ( ( ( rule__GenRemediationRules__Group__0 ) ) )
            // InternalLibrettoProjectProfile.g:192:2: ( ( rule__GenRemediationRules__Group__0 ) )
            {
            // InternalLibrettoProjectProfile.g:192:2: ( ( rule__GenRemediationRules__Group__0 ) )
            // InternalLibrettoProjectProfile.g:193:3: ( rule__GenRemediationRules__Group__0 )
            {
             before(grammarAccess.getGenRemediationRulesAccess().getGroup()); 
            // InternalLibrettoProjectProfile.g:194:3: ( rule__GenRemediationRules__Group__0 )
            // InternalLibrettoProjectProfile.g:194:4: rule__GenRemediationRules__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GenRemediationRules__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGenRemediationRulesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGenRemediationRules"


    // $ANTLR start "entryRuleGenPatternRemediationRule"
    // InternalLibrettoProjectProfile.g:203:1: entryRuleGenPatternRemediationRule : ruleGenPatternRemediationRule EOF ;
    public final void entryRuleGenPatternRemediationRule() throws RecognitionException {
        try {
            // InternalLibrettoProjectProfile.g:204:1: ( ruleGenPatternRemediationRule EOF )
            // InternalLibrettoProjectProfile.g:205:1: ruleGenPatternRemediationRule EOF
            {
             before(grammarAccess.getGenPatternRemediationRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleGenPatternRemediationRule();

            state._fsp--;

             after(grammarAccess.getGenPatternRemediationRuleRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGenPatternRemediationRule"


    // $ANTLR start "ruleGenPatternRemediationRule"
    // InternalLibrettoProjectProfile.g:212:1: ruleGenPatternRemediationRule : ( ( rule__GenPatternRemediationRule__Group__0 ) ) ;
    public final void ruleGenPatternRemediationRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:216:2: ( ( ( rule__GenPatternRemediationRule__Group__0 ) ) )
            // InternalLibrettoProjectProfile.g:217:2: ( ( rule__GenPatternRemediationRule__Group__0 ) )
            {
            // InternalLibrettoProjectProfile.g:217:2: ( ( rule__GenPatternRemediationRule__Group__0 ) )
            // InternalLibrettoProjectProfile.g:218:3: ( rule__GenPatternRemediationRule__Group__0 )
            {
             before(grammarAccess.getGenPatternRemediationRuleAccess().getGroup()); 
            // InternalLibrettoProjectProfile.g:219:3: ( rule__GenPatternRemediationRule__Group__0 )
            // InternalLibrettoProjectProfile.g:219:4: rule__GenPatternRemediationRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GenPatternRemediationRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGenPatternRemediationRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGenPatternRemediationRule"


    // $ANTLR start "entryRuleGenDefaultRemediationRule"
    // InternalLibrettoProjectProfile.g:228:1: entryRuleGenDefaultRemediationRule : ruleGenDefaultRemediationRule EOF ;
    public final void entryRuleGenDefaultRemediationRule() throws RecognitionException {
        try {
            // InternalLibrettoProjectProfile.g:229:1: ( ruleGenDefaultRemediationRule EOF )
            // InternalLibrettoProjectProfile.g:230:1: ruleGenDefaultRemediationRule EOF
            {
             before(grammarAccess.getGenDefaultRemediationRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleGenDefaultRemediationRule();

            state._fsp--;

             after(grammarAccess.getGenDefaultRemediationRuleRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGenDefaultRemediationRule"


    // $ANTLR start "ruleGenDefaultRemediationRule"
    // InternalLibrettoProjectProfile.g:237:1: ruleGenDefaultRemediationRule : ( ( rule__GenDefaultRemediationRule__Group__0 ) ) ;
    public final void ruleGenDefaultRemediationRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:241:2: ( ( ( rule__GenDefaultRemediationRule__Group__0 ) ) )
            // InternalLibrettoProjectProfile.g:242:2: ( ( rule__GenDefaultRemediationRule__Group__0 ) )
            {
            // InternalLibrettoProjectProfile.g:242:2: ( ( rule__GenDefaultRemediationRule__Group__0 ) )
            // InternalLibrettoProjectProfile.g:243:3: ( rule__GenDefaultRemediationRule__Group__0 )
            {
             before(grammarAccess.getGenDefaultRemediationRuleAccess().getGroup()); 
            // InternalLibrettoProjectProfile.g:244:3: ( rule__GenDefaultRemediationRule__Group__0 )
            // InternalLibrettoProjectProfile.g:244:4: rule__GenDefaultRemediationRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GenDefaultRemediationRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGenDefaultRemediationRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGenDefaultRemediationRule"


    // $ANTLR start "entryRuleLlmProvidersBlock"
    // InternalLibrettoProjectProfile.g:253:1: entryRuleLlmProvidersBlock : ruleLlmProvidersBlock EOF ;
    public final void entryRuleLlmProvidersBlock() throws RecognitionException {
        try {
            // InternalLibrettoProjectProfile.g:254:1: ( ruleLlmProvidersBlock EOF )
            // InternalLibrettoProjectProfile.g:255:1: ruleLlmProvidersBlock EOF
            {
             before(grammarAccess.getLlmProvidersBlockRule()); 
            pushFollow(FOLLOW_1);
            ruleLlmProvidersBlock();

            state._fsp--;

             after(grammarAccess.getLlmProvidersBlockRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLlmProvidersBlock"


    // $ANTLR start "ruleLlmProvidersBlock"
    // InternalLibrettoProjectProfile.g:262:1: ruleLlmProvidersBlock : ( ( rule__LlmProvidersBlock__Group__0 ) ) ;
    public final void ruleLlmProvidersBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:266:2: ( ( ( rule__LlmProvidersBlock__Group__0 ) ) )
            // InternalLibrettoProjectProfile.g:267:2: ( ( rule__LlmProvidersBlock__Group__0 ) )
            {
            // InternalLibrettoProjectProfile.g:267:2: ( ( rule__LlmProvidersBlock__Group__0 ) )
            // InternalLibrettoProjectProfile.g:268:3: ( rule__LlmProvidersBlock__Group__0 )
            {
             before(grammarAccess.getLlmProvidersBlockAccess().getGroup()); 
            // InternalLibrettoProjectProfile.g:269:3: ( rule__LlmProvidersBlock__Group__0 )
            // InternalLibrettoProjectProfile.g:269:4: rule__LlmProvidersBlock__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LlmProvidersBlock__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLlmProvidersBlockAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLlmProvidersBlock"


    // $ANTLR start "entryRuleNamedLlmProvider"
    // InternalLibrettoProjectProfile.g:278:1: entryRuleNamedLlmProvider : ruleNamedLlmProvider EOF ;
    public final void entryRuleNamedLlmProvider() throws RecognitionException {
        try {
            // InternalLibrettoProjectProfile.g:279:1: ( ruleNamedLlmProvider EOF )
            // InternalLibrettoProjectProfile.g:280:1: ruleNamedLlmProvider EOF
            {
             before(grammarAccess.getNamedLlmProviderRule()); 
            pushFollow(FOLLOW_1);
            ruleNamedLlmProvider();

            state._fsp--;

             after(grammarAccess.getNamedLlmProviderRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNamedLlmProvider"


    // $ANTLR start "ruleNamedLlmProvider"
    // InternalLibrettoProjectProfile.g:287:1: ruleNamedLlmProvider : ( ( rule__NamedLlmProvider__Group__0 ) ) ;
    public final void ruleNamedLlmProvider() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:291:2: ( ( ( rule__NamedLlmProvider__Group__0 ) ) )
            // InternalLibrettoProjectProfile.g:292:2: ( ( rule__NamedLlmProvider__Group__0 ) )
            {
            // InternalLibrettoProjectProfile.g:292:2: ( ( rule__NamedLlmProvider__Group__0 ) )
            // InternalLibrettoProjectProfile.g:293:3: ( rule__NamedLlmProvider__Group__0 )
            {
             before(grammarAccess.getNamedLlmProviderAccess().getGroup()); 
            // InternalLibrettoProjectProfile.g:294:3: ( rule__NamedLlmProvider__Group__0 )
            // InternalLibrettoProjectProfile.g:294:4: rule__NamedLlmProvider__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NamedLlmProvider__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNamedLlmProviderAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNamedLlmProvider"


    // $ANTLR start "entryRuleGenUsageBlock"
    // InternalLibrettoProjectProfile.g:303:1: entryRuleGenUsageBlock : ruleGenUsageBlock EOF ;
    public final void entryRuleGenUsageBlock() throws RecognitionException {
        try {
            // InternalLibrettoProjectProfile.g:304:1: ( ruleGenUsageBlock EOF )
            // InternalLibrettoProjectProfile.g:305:1: ruleGenUsageBlock EOF
            {
             before(grammarAccess.getGenUsageBlockRule()); 
            pushFollow(FOLLOW_1);
            ruleGenUsageBlock();

            state._fsp--;

             after(grammarAccess.getGenUsageBlockRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGenUsageBlock"


    // $ANTLR start "ruleGenUsageBlock"
    // InternalLibrettoProjectProfile.g:312:1: ruleGenUsageBlock : ( ( rule__GenUsageBlock__Group__0 ) ) ;
    public final void ruleGenUsageBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:316:2: ( ( ( rule__GenUsageBlock__Group__0 ) ) )
            // InternalLibrettoProjectProfile.g:317:2: ( ( rule__GenUsageBlock__Group__0 ) )
            {
            // InternalLibrettoProjectProfile.g:317:2: ( ( rule__GenUsageBlock__Group__0 ) )
            // InternalLibrettoProjectProfile.g:318:3: ( rule__GenUsageBlock__Group__0 )
            {
             before(grammarAccess.getGenUsageBlockAccess().getGroup()); 
            // InternalLibrettoProjectProfile.g:319:3: ( rule__GenUsageBlock__Group__0 )
            // InternalLibrettoProjectProfile.g:319:4: rule__GenUsageBlock__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GenUsageBlock__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGenUsageBlockAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGenUsageBlock"


    // $ANTLR start "entryRuleGenEscalationBlock"
    // InternalLibrettoProjectProfile.g:328:1: entryRuleGenEscalationBlock : ruleGenEscalationBlock EOF ;
    public final void entryRuleGenEscalationBlock() throws RecognitionException {
        try {
            // InternalLibrettoProjectProfile.g:329:1: ( ruleGenEscalationBlock EOF )
            // InternalLibrettoProjectProfile.g:330:1: ruleGenEscalationBlock EOF
            {
             before(grammarAccess.getGenEscalationBlockRule()); 
            pushFollow(FOLLOW_1);
            ruleGenEscalationBlock();

            state._fsp--;

             after(grammarAccess.getGenEscalationBlockRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGenEscalationBlock"


    // $ANTLR start "ruleGenEscalationBlock"
    // InternalLibrettoProjectProfile.g:337:1: ruleGenEscalationBlock : ( ( rule__GenEscalationBlock__Group__0 ) ) ;
    public final void ruleGenEscalationBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:341:2: ( ( ( rule__GenEscalationBlock__Group__0 ) ) )
            // InternalLibrettoProjectProfile.g:342:2: ( ( rule__GenEscalationBlock__Group__0 ) )
            {
            // InternalLibrettoProjectProfile.g:342:2: ( ( rule__GenEscalationBlock__Group__0 ) )
            // InternalLibrettoProjectProfile.g:343:3: ( rule__GenEscalationBlock__Group__0 )
            {
             before(grammarAccess.getGenEscalationBlockAccess().getGroup()); 
            // InternalLibrettoProjectProfile.g:344:3: ( rule__GenEscalationBlock__Group__0 )
            // InternalLibrettoProjectProfile.g:344:4: rule__GenEscalationBlock__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GenEscalationBlock__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGenEscalationBlockAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGenEscalationBlock"


    // $ANTLR start "entryRuleSurfaceBlock"
    // InternalLibrettoProjectProfile.g:353:1: entryRuleSurfaceBlock : ruleSurfaceBlock EOF ;
    public final void entryRuleSurfaceBlock() throws RecognitionException {
        try {
            // InternalLibrettoProjectProfile.g:354:1: ( ruleSurfaceBlock EOF )
            // InternalLibrettoProjectProfile.g:355:1: ruleSurfaceBlock EOF
            {
             before(grammarAccess.getSurfaceBlockRule()); 
            pushFollow(FOLLOW_1);
            ruleSurfaceBlock();

            state._fsp--;

             after(grammarAccess.getSurfaceBlockRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSurfaceBlock"


    // $ANTLR start "ruleSurfaceBlock"
    // InternalLibrettoProjectProfile.g:362:1: ruleSurfaceBlock : ( ( rule__SurfaceBlock__Group__0 ) ) ;
    public final void ruleSurfaceBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:366:2: ( ( ( rule__SurfaceBlock__Group__0 ) ) )
            // InternalLibrettoProjectProfile.g:367:2: ( ( rule__SurfaceBlock__Group__0 ) )
            {
            // InternalLibrettoProjectProfile.g:367:2: ( ( rule__SurfaceBlock__Group__0 ) )
            // InternalLibrettoProjectProfile.g:368:3: ( rule__SurfaceBlock__Group__0 )
            {
             before(grammarAccess.getSurfaceBlockAccess().getGroup()); 
            // InternalLibrettoProjectProfile.g:369:3: ( rule__SurfaceBlock__Group__0 )
            // InternalLibrettoProjectProfile.g:369:4: rule__SurfaceBlock__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SurfaceBlock__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSurfaceBlockAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSurfaceBlock"


    // $ANTLR start "entryRuleSurfaceElement"
    // InternalLibrettoProjectProfile.g:378:1: entryRuleSurfaceElement : ruleSurfaceElement EOF ;
    public final void entryRuleSurfaceElement() throws RecognitionException {
        try {
            // InternalLibrettoProjectProfile.g:379:1: ( ruleSurfaceElement EOF )
            // InternalLibrettoProjectProfile.g:380:1: ruleSurfaceElement EOF
            {
             before(grammarAccess.getSurfaceElementRule()); 
            pushFollow(FOLLOW_1);
            ruleSurfaceElement();

            state._fsp--;

             after(grammarAccess.getSurfaceElementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSurfaceElement"


    // $ANTLR start "ruleSurfaceElement"
    // InternalLibrettoProjectProfile.g:387:1: ruleSurfaceElement : ( ( rule__SurfaceElement__Alternatives ) ) ;
    public final void ruleSurfaceElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:391:2: ( ( ( rule__SurfaceElement__Alternatives ) ) )
            // InternalLibrettoProjectProfile.g:392:2: ( ( rule__SurfaceElement__Alternatives ) )
            {
            // InternalLibrettoProjectProfile.g:392:2: ( ( rule__SurfaceElement__Alternatives ) )
            // InternalLibrettoProjectProfile.g:393:3: ( rule__SurfaceElement__Alternatives )
            {
             before(grammarAccess.getSurfaceElementAccess().getAlternatives()); 
            // InternalLibrettoProjectProfile.g:394:3: ( rule__SurfaceElement__Alternatives )
            // InternalLibrettoProjectProfile.g:394:4: rule__SurfaceElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SurfaceElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSurfaceElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSurfaceElement"


    // $ANTLR start "entryRuleScopedSurface"
    // InternalLibrettoProjectProfile.g:403:1: entryRuleScopedSurface : ruleScopedSurface EOF ;
    public final void entryRuleScopedSurface() throws RecognitionException {
        try {
            // InternalLibrettoProjectProfile.g:404:1: ( ruleScopedSurface EOF )
            // InternalLibrettoProjectProfile.g:405:1: ruleScopedSurface EOF
            {
             before(grammarAccess.getScopedSurfaceRule()); 
            pushFollow(FOLLOW_1);
            ruleScopedSurface();

            state._fsp--;

             after(grammarAccess.getScopedSurfaceRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleScopedSurface"


    // $ANTLR start "ruleScopedSurface"
    // InternalLibrettoProjectProfile.g:412:1: ruleScopedSurface : ( ( rule__ScopedSurface__Group__0 ) ) ;
    public final void ruleScopedSurface() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:416:2: ( ( ( rule__ScopedSurface__Group__0 ) ) )
            // InternalLibrettoProjectProfile.g:417:2: ( ( rule__ScopedSurface__Group__0 ) )
            {
            // InternalLibrettoProjectProfile.g:417:2: ( ( rule__ScopedSurface__Group__0 ) )
            // InternalLibrettoProjectProfile.g:418:3: ( rule__ScopedSurface__Group__0 )
            {
             before(grammarAccess.getScopedSurfaceAccess().getGroup()); 
            // InternalLibrettoProjectProfile.g:419:3: ( rule__ScopedSurface__Group__0 )
            // InternalLibrettoProjectProfile.g:419:4: rule__ScopedSurface__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ScopedSurface__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScopedSurfaceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScopedSurface"


    // $ANTLR start "entryRuleSurfaceRule"
    // InternalLibrettoProjectProfile.g:428:1: entryRuleSurfaceRule : ruleSurfaceRule EOF ;
    public final void entryRuleSurfaceRule() throws RecognitionException {
        try {
            // InternalLibrettoProjectProfile.g:429:1: ( ruleSurfaceRule EOF )
            // InternalLibrettoProjectProfile.g:430:1: ruleSurfaceRule EOF
            {
             before(grammarAccess.getSurfaceRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleSurfaceRule();

            state._fsp--;

             after(grammarAccess.getSurfaceRuleRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSurfaceRule"


    // $ANTLR start "ruleSurfaceRule"
    // InternalLibrettoProjectProfile.g:437:1: ruleSurfaceRule : ( ( rule__SurfaceRule__Alternatives ) ) ;
    public final void ruleSurfaceRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:441:2: ( ( ( rule__SurfaceRule__Alternatives ) ) )
            // InternalLibrettoProjectProfile.g:442:2: ( ( rule__SurfaceRule__Alternatives ) )
            {
            // InternalLibrettoProjectProfile.g:442:2: ( ( rule__SurfaceRule__Alternatives ) )
            // InternalLibrettoProjectProfile.g:443:3: ( rule__SurfaceRule__Alternatives )
            {
             before(grammarAccess.getSurfaceRuleAccess().getAlternatives()); 
            // InternalLibrettoProjectProfile.g:444:3: ( rule__SurfaceRule__Alternatives )
            // InternalLibrettoProjectProfile.g:444:4: rule__SurfaceRule__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SurfaceRule__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSurfaceRuleAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSurfaceRule"


    // $ANTLR start "entryRuleReturnTypeRule"
    // InternalLibrettoProjectProfile.g:453:1: entryRuleReturnTypeRule : ruleReturnTypeRule EOF ;
    public final void entryRuleReturnTypeRule() throws RecognitionException {
        try {
            // InternalLibrettoProjectProfile.g:454:1: ( ruleReturnTypeRule EOF )
            // InternalLibrettoProjectProfile.g:455:1: ruleReturnTypeRule EOF
            {
             before(grammarAccess.getReturnTypeRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleReturnTypeRule();

            state._fsp--;

             after(grammarAccess.getReturnTypeRuleRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleReturnTypeRule"


    // $ANTLR start "ruleReturnTypeRule"
    // InternalLibrettoProjectProfile.g:462:1: ruleReturnTypeRule : ( ( rule__ReturnTypeRule__Group__0 ) ) ;
    public final void ruleReturnTypeRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:466:2: ( ( ( rule__ReturnTypeRule__Group__0 ) ) )
            // InternalLibrettoProjectProfile.g:467:2: ( ( rule__ReturnTypeRule__Group__0 ) )
            {
            // InternalLibrettoProjectProfile.g:467:2: ( ( rule__ReturnTypeRule__Group__0 ) )
            // InternalLibrettoProjectProfile.g:468:3: ( rule__ReturnTypeRule__Group__0 )
            {
             before(grammarAccess.getReturnTypeRuleAccess().getGroup()); 
            // InternalLibrettoProjectProfile.g:469:3: ( rule__ReturnTypeRule__Group__0 )
            // InternalLibrettoProjectProfile.g:469:4: rule__ReturnTypeRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReturnTypeRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReturnTypeRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReturnTypeRule"


    // $ANTLR start "entryRuleParamTypeRule"
    // InternalLibrettoProjectProfile.g:478:1: entryRuleParamTypeRule : ruleParamTypeRule EOF ;
    public final void entryRuleParamTypeRule() throws RecognitionException {
        try {
            // InternalLibrettoProjectProfile.g:479:1: ( ruleParamTypeRule EOF )
            // InternalLibrettoProjectProfile.g:480:1: ruleParamTypeRule EOF
            {
             before(grammarAccess.getParamTypeRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleParamTypeRule();

            state._fsp--;

             after(grammarAccess.getParamTypeRuleRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParamTypeRule"


    // $ANTLR start "ruleParamTypeRule"
    // InternalLibrettoProjectProfile.g:487:1: ruleParamTypeRule : ( ( rule__ParamTypeRule__Group__0 ) ) ;
    public final void ruleParamTypeRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:491:2: ( ( ( rule__ParamTypeRule__Group__0 ) ) )
            // InternalLibrettoProjectProfile.g:492:2: ( ( rule__ParamTypeRule__Group__0 ) )
            {
            // InternalLibrettoProjectProfile.g:492:2: ( ( rule__ParamTypeRule__Group__0 ) )
            // InternalLibrettoProjectProfile.g:493:3: ( rule__ParamTypeRule__Group__0 )
            {
             before(grammarAccess.getParamTypeRuleAccess().getGroup()); 
            // InternalLibrettoProjectProfile.g:494:3: ( rule__ParamTypeRule__Group__0 )
            // InternalLibrettoProjectProfile.g:494:4: rule__ParamTypeRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParamTypeRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParamTypeRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParamTypeRule"


    // $ANTLR start "entryRuleRecordSelfReturnRule"
    // InternalLibrettoProjectProfile.g:503:1: entryRuleRecordSelfReturnRule : ruleRecordSelfReturnRule EOF ;
    public final void entryRuleRecordSelfReturnRule() throws RecognitionException {
        try {
            // InternalLibrettoProjectProfile.g:504:1: ( ruleRecordSelfReturnRule EOF )
            // InternalLibrettoProjectProfile.g:505:1: ruleRecordSelfReturnRule EOF
            {
             before(grammarAccess.getRecordSelfReturnRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleRecordSelfReturnRule();

            state._fsp--;

             after(grammarAccess.getRecordSelfReturnRuleRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRecordSelfReturnRule"


    // $ANTLR start "ruleRecordSelfReturnRule"
    // InternalLibrettoProjectProfile.g:512:1: ruleRecordSelfReturnRule : ( ( rule__RecordSelfReturnRule__Group__0 ) ) ;
    public final void ruleRecordSelfReturnRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:516:2: ( ( ( rule__RecordSelfReturnRule__Group__0 ) ) )
            // InternalLibrettoProjectProfile.g:517:2: ( ( rule__RecordSelfReturnRule__Group__0 ) )
            {
            // InternalLibrettoProjectProfile.g:517:2: ( ( rule__RecordSelfReturnRule__Group__0 ) )
            // InternalLibrettoProjectProfile.g:518:3: ( rule__RecordSelfReturnRule__Group__0 )
            {
             before(grammarAccess.getRecordSelfReturnRuleAccess().getGroup()); 
            // InternalLibrettoProjectProfile.g:519:3: ( rule__RecordSelfReturnRule__Group__0 )
            // InternalLibrettoProjectProfile.g:519:4: rule__RecordSelfReturnRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RecordSelfReturnRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRecordSelfReturnRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRecordSelfReturnRule"


    // $ANTLR start "entryRuleMethodOverrideRule"
    // InternalLibrettoProjectProfile.g:528:1: entryRuleMethodOverrideRule : ruleMethodOverrideRule EOF ;
    public final void entryRuleMethodOverrideRule() throws RecognitionException {
        try {
            // InternalLibrettoProjectProfile.g:529:1: ( ruleMethodOverrideRule EOF )
            // InternalLibrettoProjectProfile.g:530:1: ruleMethodOverrideRule EOF
            {
             before(grammarAccess.getMethodOverrideRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleMethodOverrideRule();

            state._fsp--;

             after(grammarAccess.getMethodOverrideRuleRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMethodOverrideRule"


    // $ANTLR start "ruleMethodOverrideRule"
    // InternalLibrettoProjectProfile.g:537:1: ruleMethodOverrideRule : ( ( rule__MethodOverrideRule__Group__0 ) ) ;
    public final void ruleMethodOverrideRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:541:2: ( ( ( rule__MethodOverrideRule__Group__0 ) ) )
            // InternalLibrettoProjectProfile.g:542:2: ( ( rule__MethodOverrideRule__Group__0 ) )
            {
            // InternalLibrettoProjectProfile.g:542:2: ( ( rule__MethodOverrideRule__Group__0 ) )
            // InternalLibrettoProjectProfile.g:543:3: ( rule__MethodOverrideRule__Group__0 )
            {
             before(grammarAccess.getMethodOverrideRuleAccess().getGroup()); 
            // InternalLibrettoProjectProfile.g:544:3: ( rule__MethodOverrideRule__Group__0 )
            // InternalLibrettoProjectProfile.g:544:4: rule__MethodOverrideRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MethodOverrideRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMethodOverrideRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMethodOverrideRule"


    // $ANTLR start "entryRuleJavaType"
    // InternalLibrettoProjectProfile.g:553:1: entryRuleJavaType : ruleJavaType EOF ;
    public final void entryRuleJavaType() throws RecognitionException {
        try {
            // InternalLibrettoProjectProfile.g:554:1: ( ruleJavaType EOF )
            // InternalLibrettoProjectProfile.g:555:1: ruleJavaType EOF
            {
             before(grammarAccess.getJavaTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleJavaType();

            state._fsp--;

             after(grammarAccess.getJavaTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleJavaType"


    // $ANTLR start "ruleJavaType"
    // InternalLibrettoProjectProfile.g:562:1: ruleJavaType : ( ( rule__JavaType__Alternatives ) ) ;
    public final void ruleJavaType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:566:2: ( ( ( rule__JavaType__Alternatives ) ) )
            // InternalLibrettoProjectProfile.g:567:2: ( ( rule__JavaType__Alternatives ) )
            {
            // InternalLibrettoProjectProfile.g:567:2: ( ( rule__JavaType__Alternatives ) )
            // InternalLibrettoProjectProfile.g:568:3: ( rule__JavaType__Alternatives )
            {
             before(grammarAccess.getJavaTypeAccess().getAlternatives()); 
            // InternalLibrettoProjectProfile.g:569:3: ( rule__JavaType__Alternatives )
            // InternalLibrettoProjectProfile.g:569:4: rule__JavaType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__JavaType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getJavaTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJavaType"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalLibrettoProjectProfile.g:578:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalLibrettoProjectProfile.g:579:1: ( ruleQualifiedName EOF )
            // InternalLibrettoProjectProfile.g:580:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalLibrettoProjectProfile.g:587:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:591:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalLibrettoProjectProfile.g:592:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalLibrettoProjectProfile.g:592:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalLibrettoProjectProfile.g:593:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalLibrettoProjectProfile.g:594:3: ( rule__QualifiedName__Group__0 )
            // InternalLibrettoProjectProfile.g:594:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRulePrimitiveType"
    // InternalLibrettoProjectProfile.g:603:1: entryRulePrimitiveType : rulePrimitiveType EOF ;
    public final void entryRulePrimitiveType() throws RecognitionException {
        try {
            // InternalLibrettoProjectProfile.g:604:1: ( rulePrimitiveType EOF )
            // InternalLibrettoProjectProfile.g:605:1: rulePrimitiveType EOF
            {
             before(grammarAccess.getPrimitiveTypeRule()); 
            pushFollow(FOLLOW_1);
            rulePrimitiveType();

            state._fsp--;

             after(grammarAccess.getPrimitiveTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePrimitiveType"


    // $ANTLR start "rulePrimitiveType"
    // InternalLibrettoProjectProfile.g:612:1: rulePrimitiveType : ( ( rule__PrimitiveType__KindAssignment ) ) ;
    public final void rulePrimitiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:616:2: ( ( ( rule__PrimitiveType__KindAssignment ) ) )
            // InternalLibrettoProjectProfile.g:617:2: ( ( rule__PrimitiveType__KindAssignment ) )
            {
            // InternalLibrettoProjectProfile.g:617:2: ( ( rule__PrimitiveType__KindAssignment ) )
            // InternalLibrettoProjectProfile.g:618:3: ( rule__PrimitiveType__KindAssignment )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getKindAssignment()); 
            // InternalLibrettoProjectProfile.g:619:3: ( rule__PrimitiveType__KindAssignment )
            // InternalLibrettoProjectProfile.g:619:4: rule__PrimitiveType__KindAssignment
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveType__KindAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveTypeAccess().getKindAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimitiveType"


    // $ANTLR start "entryRuleOperationSignature"
    // InternalLibrettoProjectProfile.g:628:1: entryRuleOperationSignature : ruleOperationSignature EOF ;
    public final void entryRuleOperationSignature() throws RecognitionException {
        try {
            // InternalLibrettoProjectProfile.g:629:1: ( ruleOperationSignature EOF )
            // InternalLibrettoProjectProfile.g:630:1: ruleOperationSignature EOF
            {
             before(grammarAccess.getOperationSignatureRule()); 
            pushFollow(FOLLOW_1);
            ruleOperationSignature();

            state._fsp--;

             after(grammarAccess.getOperationSignatureRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOperationSignature"


    // $ANTLR start "ruleOperationSignature"
    // InternalLibrettoProjectProfile.g:637:1: ruleOperationSignature : ( ( rule__OperationSignature__Group__0 ) ) ;
    public final void ruleOperationSignature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:641:2: ( ( ( rule__OperationSignature__Group__0 ) ) )
            // InternalLibrettoProjectProfile.g:642:2: ( ( rule__OperationSignature__Group__0 ) )
            {
            // InternalLibrettoProjectProfile.g:642:2: ( ( rule__OperationSignature__Group__0 ) )
            // InternalLibrettoProjectProfile.g:643:3: ( rule__OperationSignature__Group__0 )
            {
             before(grammarAccess.getOperationSignatureAccess().getGroup()); 
            // InternalLibrettoProjectProfile.g:644:3: ( rule__OperationSignature__Group__0 )
            // InternalLibrettoProjectProfile.g:644:4: rule__OperationSignature__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OperationSignature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOperationSignatureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperationSignature"


    // $ANTLR start "entryRuleTypedParam"
    // InternalLibrettoProjectProfile.g:653:1: entryRuleTypedParam : ruleTypedParam EOF ;
    public final void entryRuleTypedParam() throws RecognitionException {
        try {
            // InternalLibrettoProjectProfile.g:654:1: ( ruleTypedParam EOF )
            // InternalLibrettoProjectProfile.g:655:1: ruleTypedParam EOF
            {
             before(grammarAccess.getTypedParamRule()); 
            pushFollow(FOLLOW_1);
            ruleTypedParam();

            state._fsp--;

             after(grammarAccess.getTypedParamRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTypedParam"


    // $ANTLR start "ruleTypedParam"
    // InternalLibrettoProjectProfile.g:662:1: ruleTypedParam : ( ( rule__TypedParam__Group__0 ) ) ;
    public final void ruleTypedParam() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:666:2: ( ( ( rule__TypedParam__Group__0 ) ) )
            // InternalLibrettoProjectProfile.g:667:2: ( ( rule__TypedParam__Group__0 ) )
            {
            // InternalLibrettoProjectProfile.g:667:2: ( ( rule__TypedParam__Group__0 ) )
            // InternalLibrettoProjectProfile.g:668:3: ( rule__TypedParam__Group__0 )
            {
             before(grammarAccess.getTypedParamAccess().getGroup()); 
            // InternalLibrettoProjectProfile.g:669:3: ( rule__TypedParam__Group__0 )
            // InternalLibrettoProjectProfile.g:669:4: rule__TypedParam__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TypedParam__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypedParamAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypedParam"


    // $ANTLR start "entryRuleValidID"
    // InternalLibrettoProjectProfile.g:678:1: entryRuleValidID : ruleValidID EOF ;
    public final void entryRuleValidID() throws RecognitionException {
        try {
            // InternalLibrettoProjectProfile.g:679:1: ( ruleValidID EOF )
            // InternalLibrettoProjectProfile.g:680:1: ruleValidID EOF
            {
             before(grammarAccess.getValidIDRule()); 
            pushFollow(FOLLOW_1);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getValidIDRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // InternalLibrettoProjectProfile.g:687:1: ruleValidID : ( ( rule__ValidID__Group__0 ) ) ;
    public final void ruleValidID() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:691:2: ( ( ( rule__ValidID__Group__0 ) ) )
            // InternalLibrettoProjectProfile.g:692:2: ( ( rule__ValidID__Group__0 ) )
            {
            // InternalLibrettoProjectProfile.g:692:2: ( ( rule__ValidID__Group__0 ) )
            // InternalLibrettoProjectProfile.g:693:3: ( rule__ValidID__Group__0 )
            {
             before(grammarAccess.getValidIDAccess().getGroup()); 
            // InternalLibrettoProjectProfile.g:694:3: ( rule__ValidID__Group__0 )
            // InternalLibrettoProjectProfile.g:694:4: rule__ValidID__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ValidID__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getValidIDAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValidID"


    // $ANTLR start "rule__ProjectProfile__Alternatives_4"
    // InternalLibrettoProjectProfile.g:702:1: rule__ProjectProfile__Alternatives_4 : ( ( ( rule__ProjectProfile__ProjectsAssignment_4_0 ) ) | ( ( rule__ProjectProfile__LlmProvidersAssignment_4_1 ) ) | ( ( rule__ProjectProfile__SurfacesAssignment_4_2 ) ) );
    public final void rule__ProjectProfile__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:706:1: ( ( ( rule__ProjectProfile__ProjectsAssignment_4_0 ) ) | ( ( rule__ProjectProfile__LlmProvidersAssignment_4_1 ) ) | ( ( rule__ProjectProfile__SurfacesAssignment_4_2 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt1=1;
                }
                break;
            case 51:
                {
                alt1=2;
                }
                break;
            case 63:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:707:2: ( ( rule__ProjectProfile__ProjectsAssignment_4_0 ) )
                    {
                    // InternalLibrettoProjectProfile.g:707:2: ( ( rule__ProjectProfile__ProjectsAssignment_4_0 ) )
                    // InternalLibrettoProjectProfile.g:708:3: ( rule__ProjectProfile__ProjectsAssignment_4_0 )
                    {
                     before(grammarAccess.getProjectProfileAccess().getProjectsAssignment_4_0()); 
                    // InternalLibrettoProjectProfile.g:709:3: ( rule__ProjectProfile__ProjectsAssignment_4_0 )
                    // InternalLibrettoProjectProfile.g:709:4: rule__ProjectProfile__ProjectsAssignment_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProjectProfile__ProjectsAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getProjectProfileAccess().getProjectsAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLibrettoProjectProfile.g:713:2: ( ( rule__ProjectProfile__LlmProvidersAssignment_4_1 ) )
                    {
                    // InternalLibrettoProjectProfile.g:713:2: ( ( rule__ProjectProfile__LlmProvidersAssignment_4_1 ) )
                    // InternalLibrettoProjectProfile.g:714:3: ( rule__ProjectProfile__LlmProvidersAssignment_4_1 )
                    {
                     before(grammarAccess.getProjectProfileAccess().getLlmProvidersAssignment_4_1()); 
                    // InternalLibrettoProjectProfile.g:715:3: ( rule__ProjectProfile__LlmProvidersAssignment_4_1 )
                    // InternalLibrettoProjectProfile.g:715:4: rule__ProjectProfile__LlmProvidersAssignment_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProjectProfile__LlmProvidersAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getProjectProfileAccess().getLlmProvidersAssignment_4_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLibrettoProjectProfile.g:719:2: ( ( rule__ProjectProfile__SurfacesAssignment_4_2 ) )
                    {
                    // InternalLibrettoProjectProfile.g:719:2: ( ( rule__ProjectProfile__SurfacesAssignment_4_2 ) )
                    // InternalLibrettoProjectProfile.g:720:3: ( rule__ProjectProfile__SurfacesAssignment_4_2 )
                    {
                     before(grammarAccess.getProjectProfileAccess().getSurfacesAssignment_4_2()); 
                    // InternalLibrettoProjectProfile.g:721:3: ( rule__ProjectProfile__SurfacesAssignment_4_2 )
                    // InternalLibrettoProjectProfile.g:721:4: rule__ProjectProfile__SurfacesAssignment_4_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProjectProfile__SurfacesAssignment_4_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getProjectProfileAccess().getSurfacesAssignment_4_2()); 

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
    // $ANTLR end "rule__ProjectProfile__Alternatives_4"


    // $ANTLR start "rule__ProjectBlock__Alternatives_3"
    // InternalLibrettoProjectProfile.g:729:1: rule__ProjectBlock__Alternatives_3 : ( ( ( rule__ProjectBlock__Group_3_0__0 ) ) | ( ( rule__ProjectBlock__ModulesAssignment_3_1 ) ) | ( ( rule__ProjectBlock__GensAssignment_3_2 ) ) );
    public final void rule__ProjectBlock__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:733:1: ( ( ( rule__ProjectBlock__Group_3_0__0 ) ) | ( ( rule__ProjectBlock__ModulesAssignment_3_1 ) ) | ( ( rule__ProjectBlock__GensAssignment_3_2 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt2=1;
                }
                break;
            case 33:
                {
                alt2=2;
                }
                break;
            case 40:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:734:2: ( ( rule__ProjectBlock__Group_3_0__0 ) )
                    {
                    // InternalLibrettoProjectProfile.g:734:2: ( ( rule__ProjectBlock__Group_3_0__0 ) )
                    // InternalLibrettoProjectProfile.g:735:3: ( rule__ProjectBlock__Group_3_0__0 )
                    {
                     before(grammarAccess.getProjectBlockAccess().getGroup_3_0()); 
                    // InternalLibrettoProjectProfile.g:736:3: ( rule__ProjectBlock__Group_3_0__0 )
                    // InternalLibrettoProjectProfile.g:736:4: rule__ProjectBlock__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProjectBlock__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getProjectBlockAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLibrettoProjectProfile.g:740:2: ( ( rule__ProjectBlock__ModulesAssignment_3_1 ) )
                    {
                    // InternalLibrettoProjectProfile.g:740:2: ( ( rule__ProjectBlock__ModulesAssignment_3_1 ) )
                    // InternalLibrettoProjectProfile.g:741:3: ( rule__ProjectBlock__ModulesAssignment_3_1 )
                    {
                     before(grammarAccess.getProjectBlockAccess().getModulesAssignment_3_1()); 
                    // InternalLibrettoProjectProfile.g:742:3: ( rule__ProjectBlock__ModulesAssignment_3_1 )
                    // InternalLibrettoProjectProfile.g:742:4: rule__ProjectBlock__ModulesAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProjectBlock__ModulesAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getProjectBlockAccess().getModulesAssignment_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLibrettoProjectProfile.g:746:2: ( ( rule__ProjectBlock__GensAssignment_3_2 ) )
                    {
                    // InternalLibrettoProjectProfile.g:746:2: ( ( rule__ProjectBlock__GensAssignment_3_2 ) )
                    // InternalLibrettoProjectProfile.g:747:3: ( rule__ProjectBlock__GensAssignment_3_2 )
                    {
                     before(grammarAccess.getProjectBlockAccess().getGensAssignment_3_2()); 
                    // InternalLibrettoProjectProfile.g:748:3: ( rule__ProjectBlock__GensAssignment_3_2 )
                    // InternalLibrettoProjectProfile.g:748:4: rule__ProjectBlock__GensAssignment_3_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProjectBlock__GensAssignment_3_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getProjectBlockAccess().getGensAssignment_3_2()); 

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
    // $ANTLR end "rule__ProjectBlock__Alternatives_3"


    // $ANTLR start "rule__ProjectModule__Alternatives_3"
    // InternalLibrettoProjectProfile.g:756:1: rule__ProjectModule__Alternatives_3 : ( ( ( rule__ProjectModule__Group_3_0__0 ) ) | ( ( rule__ProjectModule__Group_3_1__0 ) ) | ( ( rule__ProjectModule__Group_3_2__0 ) ) | ( ( rule__ProjectModule__Group_3_3__0 ) ) | ( ( rule__ProjectModule__Group_3_4__0 ) ) );
    public final void rule__ProjectModule__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:760:1: ( ( ( rule__ProjectModule__Group_3_0__0 ) ) | ( ( rule__ProjectModule__Group_3_1__0 ) ) | ( ( rule__ProjectModule__Group_3_2__0 ) ) | ( ( rule__ProjectModule__Group_3_3__0 ) ) | ( ( rule__ProjectModule__Group_3_4__0 ) ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt3=1;
                }
                break;
            case 36:
                {
                alt3=2;
                }
                break;
            case 37:
                {
                alt3=3;
                }
                break;
            case 38:
                {
                alt3=4;
                }
                break;
            case 39:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:761:2: ( ( rule__ProjectModule__Group_3_0__0 ) )
                    {
                    // InternalLibrettoProjectProfile.g:761:2: ( ( rule__ProjectModule__Group_3_0__0 ) )
                    // InternalLibrettoProjectProfile.g:762:3: ( rule__ProjectModule__Group_3_0__0 )
                    {
                     before(grammarAccess.getProjectModuleAccess().getGroup_3_0()); 
                    // InternalLibrettoProjectProfile.g:763:3: ( rule__ProjectModule__Group_3_0__0 )
                    // InternalLibrettoProjectProfile.g:763:4: rule__ProjectModule__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProjectModule__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getProjectModuleAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLibrettoProjectProfile.g:767:2: ( ( rule__ProjectModule__Group_3_1__0 ) )
                    {
                    // InternalLibrettoProjectProfile.g:767:2: ( ( rule__ProjectModule__Group_3_1__0 ) )
                    // InternalLibrettoProjectProfile.g:768:3: ( rule__ProjectModule__Group_3_1__0 )
                    {
                     before(grammarAccess.getProjectModuleAccess().getGroup_3_1()); 
                    // InternalLibrettoProjectProfile.g:769:3: ( rule__ProjectModule__Group_3_1__0 )
                    // InternalLibrettoProjectProfile.g:769:4: rule__ProjectModule__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProjectModule__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getProjectModuleAccess().getGroup_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLibrettoProjectProfile.g:773:2: ( ( rule__ProjectModule__Group_3_2__0 ) )
                    {
                    // InternalLibrettoProjectProfile.g:773:2: ( ( rule__ProjectModule__Group_3_2__0 ) )
                    // InternalLibrettoProjectProfile.g:774:3: ( rule__ProjectModule__Group_3_2__0 )
                    {
                     before(grammarAccess.getProjectModuleAccess().getGroup_3_2()); 
                    // InternalLibrettoProjectProfile.g:775:3: ( rule__ProjectModule__Group_3_2__0 )
                    // InternalLibrettoProjectProfile.g:775:4: rule__ProjectModule__Group_3_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProjectModule__Group_3_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getProjectModuleAccess().getGroup_3_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalLibrettoProjectProfile.g:779:2: ( ( rule__ProjectModule__Group_3_3__0 ) )
                    {
                    // InternalLibrettoProjectProfile.g:779:2: ( ( rule__ProjectModule__Group_3_3__0 ) )
                    // InternalLibrettoProjectProfile.g:780:3: ( rule__ProjectModule__Group_3_3__0 )
                    {
                     before(grammarAccess.getProjectModuleAccess().getGroup_3_3()); 
                    // InternalLibrettoProjectProfile.g:781:3: ( rule__ProjectModule__Group_3_3__0 )
                    // InternalLibrettoProjectProfile.g:781:4: rule__ProjectModule__Group_3_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProjectModule__Group_3_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getProjectModuleAccess().getGroup_3_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalLibrettoProjectProfile.g:785:2: ( ( rule__ProjectModule__Group_3_4__0 ) )
                    {
                    // InternalLibrettoProjectProfile.g:785:2: ( ( rule__ProjectModule__Group_3_4__0 ) )
                    // InternalLibrettoProjectProfile.g:786:3: ( rule__ProjectModule__Group_3_4__0 )
                    {
                     before(grammarAccess.getProjectModuleAccess().getGroup_3_4()); 
                    // InternalLibrettoProjectProfile.g:787:3: ( rule__ProjectModule__Group_3_4__0 )
                    // InternalLibrettoProjectProfile.g:787:4: rule__ProjectModule__Group_3_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProjectModule__Group_3_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getProjectModuleAccess().getGroup_3_4()); 

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
    // $ANTLR end "rule__ProjectModule__Alternatives_3"


    // $ANTLR start "rule__GenBlock__Alternatives_3"
    // InternalLibrettoProjectProfile.g:795:1: rule__GenBlock__Alternatives_3 : ( ( ( rule__GenBlock__Group_3_0__0 ) ) | ( ( rule__GenBlock__Group_3_1__0 ) ) | ( ( rule__GenBlock__Group_3_2__0 ) ) | ( ( rule__GenBlock__Group_3_3__0 ) ) | ( ( rule__GenBlock__RemediationsAssignment_3_4 ) ) | ( ( rule__GenBlock__ModelUsagesAssignment_3_5 ) ) );
    public final void rule__GenBlock__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:799:1: ( ( ( rule__GenBlock__Group_3_0__0 ) ) | ( ( rule__GenBlock__Group_3_1__0 ) ) | ( ( rule__GenBlock__Group_3_2__0 ) ) | ( ( rule__GenBlock__Group_3_3__0 ) ) | ( ( rule__GenBlock__RemediationsAssignment_3_4 ) ) | ( ( rule__GenBlock__ModelUsagesAssignment_3_5 ) ) )
            int alt4=6;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt4=1;
                }
                break;
            case 42:
                {
                alt4=2;
                }
                break;
            case 43:
                {
                alt4=3;
                }
                break;
            case 44:
                {
                alt4=4;
                }
                break;
            case 45:
                {
                alt4=5;
                }
                break;
            case 57:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:800:2: ( ( rule__GenBlock__Group_3_0__0 ) )
                    {
                    // InternalLibrettoProjectProfile.g:800:2: ( ( rule__GenBlock__Group_3_0__0 ) )
                    // InternalLibrettoProjectProfile.g:801:3: ( rule__GenBlock__Group_3_0__0 )
                    {
                     before(grammarAccess.getGenBlockAccess().getGroup_3_0()); 
                    // InternalLibrettoProjectProfile.g:802:3: ( rule__GenBlock__Group_3_0__0 )
                    // InternalLibrettoProjectProfile.g:802:4: rule__GenBlock__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GenBlock__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGenBlockAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLibrettoProjectProfile.g:806:2: ( ( rule__GenBlock__Group_3_1__0 ) )
                    {
                    // InternalLibrettoProjectProfile.g:806:2: ( ( rule__GenBlock__Group_3_1__0 ) )
                    // InternalLibrettoProjectProfile.g:807:3: ( rule__GenBlock__Group_3_1__0 )
                    {
                     before(grammarAccess.getGenBlockAccess().getGroup_3_1()); 
                    // InternalLibrettoProjectProfile.g:808:3: ( rule__GenBlock__Group_3_1__0 )
                    // InternalLibrettoProjectProfile.g:808:4: rule__GenBlock__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GenBlock__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGenBlockAccess().getGroup_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLibrettoProjectProfile.g:812:2: ( ( rule__GenBlock__Group_3_2__0 ) )
                    {
                    // InternalLibrettoProjectProfile.g:812:2: ( ( rule__GenBlock__Group_3_2__0 ) )
                    // InternalLibrettoProjectProfile.g:813:3: ( rule__GenBlock__Group_3_2__0 )
                    {
                     before(grammarAccess.getGenBlockAccess().getGroup_3_2()); 
                    // InternalLibrettoProjectProfile.g:814:3: ( rule__GenBlock__Group_3_2__0 )
                    // InternalLibrettoProjectProfile.g:814:4: rule__GenBlock__Group_3_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GenBlock__Group_3_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGenBlockAccess().getGroup_3_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalLibrettoProjectProfile.g:818:2: ( ( rule__GenBlock__Group_3_3__0 ) )
                    {
                    // InternalLibrettoProjectProfile.g:818:2: ( ( rule__GenBlock__Group_3_3__0 ) )
                    // InternalLibrettoProjectProfile.g:819:3: ( rule__GenBlock__Group_3_3__0 )
                    {
                     before(grammarAccess.getGenBlockAccess().getGroup_3_3()); 
                    // InternalLibrettoProjectProfile.g:820:3: ( rule__GenBlock__Group_3_3__0 )
                    // InternalLibrettoProjectProfile.g:820:4: rule__GenBlock__Group_3_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GenBlock__Group_3_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGenBlockAccess().getGroup_3_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalLibrettoProjectProfile.g:824:2: ( ( rule__GenBlock__RemediationsAssignment_3_4 ) )
                    {
                    // InternalLibrettoProjectProfile.g:824:2: ( ( rule__GenBlock__RemediationsAssignment_3_4 ) )
                    // InternalLibrettoProjectProfile.g:825:3: ( rule__GenBlock__RemediationsAssignment_3_4 )
                    {
                     before(grammarAccess.getGenBlockAccess().getRemediationsAssignment_3_4()); 
                    // InternalLibrettoProjectProfile.g:826:3: ( rule__GenBlock__RemediationsAssignment_3_4 )
                    // InternalLibrettoProjectProfile.g:826:4: rule__GenBlock__RemediationsAssignment_3_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__GenBlock__RemediationsAssignment_3_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getGenBlockAccess().getRemediationsAssignment_3_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalLibrettoProjectProfile.g:830:2: ( ( rule__GenBlock__ModelUsagesAssignment_3_5 ) )
                    {
                    // InternalLibrettoProjectProfile.g:830:2: ( ( rule__GenBlock__ModelUsagesAssignment_3_5 ) )
                    // InternalLibrettoProjectProfile.g:831:3: ( rule__GenBlock__ModelUsagesAssignment_3_5 )
                    {
                     before(grammarAccess.getGenBlockAccess().getModelUsagesAssignment_3_5()); 
                    // InternalLibrettoProjectProfile.g:832:3: ( rule__GenBlock__ModelUsagesAssignment_3_5 )
                    // InternalLibrettoProjectProfile.g:832:4: rule__GenBlock__ModelUsagesAssignment_3_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__GenBlock__ModelUsagesAssignment_3_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getGenBlockAccess().getModelUsagesAssignment_3_5()); 

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
    // $ANTLR end "rule__GenBlock__Alternatives_3"


    // $ANTLR start "rule__GenBlock__ParseChecksAlternatives_3_2_1_0"
    // InternalLibrettoProjectProfile.g:840:1: rule__GenBlock__ParseChecksAlternatives_3_2_1_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__GenBlock__ParseChecksAlternatives_3_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:844:1: ( ( 'true' ) | ( 'false' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==11) ) {
                alt5=1;
            }
            else if ( (LA5_0==12) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:845:2: ( 'true' )
                    {
                    // InternalLibrettoProjectProfile.g:845:2: ( 'true' )
                    // InternalLibrettoProjectProfile.g:846:3: 'true'
                    {
                     before(grammarAccess.getGenBlockAccess().getParseChecksTrueKeyword_3_2_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getGenBlockAccess().getParseChecksTrueKeyword_3_2_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLibrettoProjectProfile.g:851:2: ( 'false' )
                    {
                    // InternalLibrettoProjectProfile.g:851:2: ( 'false' )
                    // InternalLibrettoProjectProfile.g:852:3: 'false'
                    {
                     before(grammarAccess.getGenBlockAccess().getParseChecksFalseKeyword_3_2_1_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getGenBlockAccess().getParseChecksFalseKeyword_3_2_1_0_1()); 

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
    // $ANTLR end "rule__GenBlock__ParseChecksAlternatives_3_2_1_0"


    // $ANTLR start "rule__GenPatternRemediationRule__Alternatives_3"
    // InternalLibrettoProjectProfile.g:861:1: rule__GenPatternRemediationRule__Alternatives_3 : ( ( ( rule__GenPatternRemediationRule__Group_3_0__0 ) ) | ( ( rule__GenPatternRemediationRule__Group_3_1__0 ) ) | ( ( rule__GenPatternRemediationRule__Group_3_2__0 ) ) );
    public final void rule__GenPatternRemediationRule__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:865:1: ( ( ( rule__GenPatternRemediationRule__Group_3_0__0 ) ) | ( ( rule__GenPatternRemediationRule__Group_3_1__0 ) ) | ( ( rule__GenPatternRemediationRule__Group_3_2__0 ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt6=1;
                }
                break;
            case 48:
                {
                alt6=2;
                }
                break;
            case 49:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:866:2: ( ( rule__GenPatternRemediationRule__Group_3_0__0 ) )
                    {
                    // InternalLibrettoProjectProfile.g:866:2: ( ( rule__GenPatternRemediationRule__Group_3_0__0 ) )
                    // InternalLibrettoProjectProfile.g:867:3: ( rule__GenPatternRemediationRule__Group_3_0__0 )
                    {
                     before(grammarAccess.getGenPatternRemediationRuleAccess().getGroup_3_0()); 
                    // InternalLibrettoProjectProfile.g:868:3: ( rule__GenPatternRemediationRule__Group_3_0__0 )
                    // InternalLibrettoProjectProfile.g:868:4: rule__GenPatternRemediationRule__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GenPatternRemediationRule__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGenPatternRemediationRuleAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLibrettoProjectProfile.g:872:2: ( ( rule__GenPatternRemediationRule__Group_3_1__0 ) )
                    {
                    // InternalLibrettoProjectProfile.g:872:2: ( ( rule__GenPatternRemediationRule__Group_3_1__0 ) )
                    // InternalLibrettoProjectProfile.g:873:3: ( rule__GenPatternRemediationRule__Group_3_1__0 )
                    {
                     before(grammarAccess.getGenPatternRemediationRuleAccess().getGroup_3_1()); 
                    // InternalLibrettoProjectProfile.g:874:3: ( rule__GenPatternRemediationRule__Group_3_1__0 )
                    // InternalLibrettoProjectProfile.g:874:4: rule__GenPatternRemediationRule__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GenPatternRemediationRule__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGenPatternRemediationRuleAccess().getGroup_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLibrettoProjectProfile.g:878:2: ( ( rule__GenPatternRemediationRule__Group_3_2__0 ) )
                    {
                    // InternalLibrettoProjectProfile.g:878:2: ( ( rule__GenPatternRemediationRule__Group_3_2__0 ) )
                    // InternalLibrettoProjectProfile.g:879:3: ( rule__GenPatternRemediationRule__Group_3_2__0 )
                    {
                     before(grammarAccess.getGenPatternRemediationRuleAccess().getGroup_3_2()); 
                    // InternalLibrettoProjectProfile.g:880:3: ( rule__GenPatternRemediationRule__Group_3_2__0 )
                    // InternalLibrettoProjectProfile.g:880:4: rule__GenPatternRemediationRule__Group_3_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GenPatternRemediationRule__Group_3_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGenPatternRemediationRuleAccess().getGroup_3_2()); 

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
    // $ANTLR end "rule__GenPatternRemediationRule__Alternatives_3"


    // $ANTLR start "rule__GenDefaultRemediationRule__Alternatives_3"
    // InternalLibrettoProjectProfile.g:888:1: rule__GenDefaultRemediationRule__Alternatives_3 : ( ( ( rule__GenDefaultRemediationRule__Group_3_0__0 ) ) | ( ( rule__GenDefaultRemediationRule__Group_3_1__0 ) ) );
    public final void rule__GenDefaultRemediationRule__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:892:1: ( ( ( rule__GenDefaultRemediationRule__Group_3_0__0 ) ) | ( ( rule__GenDefaultRemediationRule__Group_3_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==48) ) {
                alt7=1;
            }
            else if ( (LA7_0==49) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:893:2: ( ( rule__GenDefaultRemediationRule__Group_3_0__0 ) )
                    {
                    // InternalLibrettoProjectProfile.g:893:2: ( ( rule__GenDefaultRemediationRule__Group_3_0__0 ) )
                    // InternalLibrettoProjectProfile.g:894:3: ( rule__GenDefaultRemediationRule__Group_3_0__0 )
                    {
                     before(grammarAccess.getGenDefaultRemediationRuleAccess().getGroup_3_0()); 
                    // InternalLibrettoProjectProfile.g:895:3: ( rule__GenDefaultRemediationRule__Group_3_0__0 )
                    // InternalLibrettoProjectProfile.g:895:4: rule__GenDefaultRemediationRule__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GenDefaultRemediationRule__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGenDefaultRemediationRuleAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLibrettoProjectProfile.g:899:2: ( ( rule__GenDefaultRemediationRule__Group_3_1__0 ) )
                    {
                    // InternalLibrettoProjectProfile.g:899:2: ( ( rule__GenDefaultRemediationRule__Group_3_1__0 ) )
                    // InternalLibrettoProjectProfile.g:900:3: ( rule__GenDefaultRemediationRule__Group_3_1__0 )
                    {
                     before(grammarAccess.getGenDefaultRemediationRuleAccess().getGroup_3_1()); 
                    // InternalLibrettoProjectProfile.g:901:3: ( rule__GenDefaultRemediationRule__Group_3_1__0 )
                    // InternalLibrettoProjectProfile.g:901:4: rule__GenDefaultRemediationRule__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GenDefaultRemediationRule__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGenDefaultRemediationRuleAccess().getGroup_3_1()); 

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
    // $ANTLR end "rule__GenDefaultRemediationRule__Alternatives_3"


    // $ANTLR start "rule__NamedLlmProvider__Alternatives_3"
    // InternalLibrettoProjectProfile.g:909:1: rule__NamedLlmProvider__Alternatives_3 : ( ( ( rule__NamedLlmProvider__Group_3_0__0 ) ) | ( ( rule__NamedLlmProvider__Group_3_1__0 ) ) | ( ( rule__NamedLlmProvider__Group_3_2__0 ) ) | ( ( rule__NamedLlmProvider__Group_3_3__0 ) ) );
    public final void rule__NamedLlmProvider__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:913:1: ( ( ( rule__NamedLlmProvider__Group_3_0__0 ) ) | ( ( rule__NamedLlmProvider__Group_3_1__0 ) ) | ( ( rule__NamedLlmProvider__Group_3_2__0 ) ) | ( ( rule__NamedLlmProvider__Group_3_3__0 ) ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt8=1;
                }
                break;
            case 54:
                {
                alt8=2;
                }
                break;
            case 55:
                {
                alt8=3;
                }
                break;
            case 56:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:914:2: ( ( rule__NamedLlmProvider__Group_3_0__0 ) )
                    {
                    // InternalLibrettoProjectProfile.g:914:2: ( ( rule__NamedLlmProvider__Group_3_0__0 ) )
                    // InternalLibrettoProjectProfile.g:915:3: ( rule__NamedLlmProvider__Group_3_0__0 )
                    {
                     before(grammarAccess.getNamedLlmProviderAccess().getGroup_3_0()); 
                    // InternalLibrettoProjectProfile.g:916:3: ( rule__NamedLlmProvider__Group_3_0__0 )
                    // InternalLibrettoProjectProfile.g:916:4: rule__NamedLlmProvider__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NamedLlmProvider__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNamedLlmProviderAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLibrettoProjectProfile.g:920:2: ( ( rule__NamedLlmProvider__Group_3_1__0 ) )
                    {
                    // InternalLibrettoProjectProfile.g:920:2: ( ( rule__NamedLlmProvider__Group_3_1__0 ) )
                    // InternalLibrettoProjectProfile.g:921:3: ( rule__NamedLlmProvider__Group_3_1__0 )
                    {
                     before(grammarAccess.getNamedLlmProviderAccess().getGroup_3_1()); 
                    // InternalLibrettoProjectProfile.g:922:3: ( rule__NamedLlmProvider__Group_3_1__0 )
                    // InternalLibrettoProjectProfile.g:922:4: rule__NamedLlmProvider__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NamedLlmProvider__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNamedLlmProviderAccess().getGroup_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLibrettoProjectProfile.g:926:2: ( ( rule__NamedLlmProvider__Group_3_2__0 ) )
                    {
                    // InternalLibrettoProjectProfile.g:926:2: ( ( rule__NamedLlmProvider__Group_3_2__0 ) )
                    // InternalLibrettoProjectProfile.g:927:3: ( rule__NamedLlmProvider__Group_3_2__0 )
                    {
                     before(grammarAccess.getNamedLlmProviderAccess().getGroup_3_2()); 
                    // InternalLibrettoProjectProfile.g:928:3: ( rule__NamedLlmProvider__Group_3_2__0 )
                    // InternalLibrettoProjectProfile.g:928:4: rule__NamedLlmProvider__Group_3_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NamedLlmProvider__Group_3_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNamedLlmProviderAccess().getGroup_3_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalLibrettoProjectProfile.g:932:2: ( ( rule__NamedLlmProvider__Group_3_3__0 ) )
                    {
                    // InternalLibrettoProjectProfile.g:932:2: ( ( rule__NamedLlmProvider__Group_3_3__0 ) )
                    // InternalLibrettoProjectProfile.g:933:3: ( rule__NamedLlmProvider__Group_3_3__0 )
                    {
                     before(grammarAccess.getNamedLlmProviderAccess().getGroup_3_3()); 
                    // InternalLibrettoProjectProfile.g:934:3: ( rule__NamedLlmProvider__Group_3_3__0 )
                    // InternalLibrettoProjectProfile.g:934:4: rule__NamedLlmProvider__Group_3_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NamedLlmProvider__Group_3_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNamedLlmProviderAccess().getGroup_3_3()); 

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
    // $ANTLR end "rule__NamedLlmProvider__Alternatives_3"


    // $ANTLR start "rule__NamedLlmProvider__KindsAlternatives_3_0_1_0"
    // InternalLibrettoProjectProfile.g:942:1: rule__NamedLlmProvider__KindsAlternatives_3_0_1_0 : ( ( 'local' ) | ( 'openai' ) | ( 'ollama' ) );
    public final void rule__NamedLlmProvider__KindsAlternatives_3_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:946:1: ( ( 'local' ) | ( 'openai' ) | ( 'ollama' ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt9=1;
                }
                break;
            case 14:
                {
                alt9=2;
                }
                break;
            case 15:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:947:2: ( 'local' )
                    {
                    // InternalLibrettoProjectProfile.g:947:2: ( 'local' )
                    // InternalLibrettoProjectProfile.g:948:3: 'local'
                    {
                     before(grammarAccess.getNamedLlmProviderAccess().getKindsLocalKeyword_3_0_1_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getNamedLlmProviderAccess().getKindsLocalKeyword_3_0_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLibrettoProjectProfile.g:953:2: ( 'openai' )
                    {
                    // InternalLibrettoProjectProfile.g:953:2: ( 'openai' )
                    // InternalLibrettoProjectProfile.g:954:3: 'openai'
                    {
                     before(grammarAccess.getNamedLlmProviderAccess().getKindsOpenaiKeyword_3_0_1_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getNamedLlmProviderAccess().getKindsOpenaiKeyword_3_0_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLibrettoProjectProfile.g:959:2: ( 'ollama' )
                    {
                    // InternalLibrettoProjectProfile.g:959:2: ( 'ollama' )
                    // InternalLibrettoProjectProfile.g:960:3: 'ollama'
                    {
                     before(grammarAccess.getNamedLlmProviderAccess().getKindsOllamaKeyword_3_0_1_0_2()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getNamedLlmProviderAccess().getKindsOllamaKeyword_3_0_1_0_2()); 

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
    // $ANTLR end "rule__NamedLlmProvider__KindsAlternatives_3_0_1_0"


    // $ANTLR start "rule__GenUsageBlock__Alternatives_3"
    // InternalLibrettoProjectProfile.g:969:1: rule__GenUsageBlock__Alternatives_3 : ( ( ( rule__GenUsageBlock__Group_3_0__0 ) ) | ( ( rule__GenUsageBlock__Group_3_1__0 ) ) | ( ( rule__GenUsageBlock__EscalationsAssignment_3_2 ) ) );
    public final void rule__GenUsageBlock__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:973:1: ( ( ( rule__GenUsageBlock__Group_3_0__0 ) ) | ( ( rule__GenUsageBlock__Group_3_1__0 ) ) | ( ( rule__GenUsageBlock__EscalationsAssignment_3_2 ) ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt10=1;
                }
                break;
            case 59:
                {
                alt10=2;
                }
                break;
            case 60:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:974:2: ( ( rule__GenUsageBlock__Group_3_0__0 ) )
                    {
                    // InternalLibrettoProjectProfile.g:974:2: ( ( rule__GenUsageBlock__Group_3_0__0 ) )
                    // InternalLibrettoProjectProfile.g:975:3: ( rule__GenUsageBlock__Group_3_0__0 )
                    {
                     before(grammarAccess.getGenUsageBlockAccess().getGroup_3_0()); 
                    // InternalLibrettoProjectProfile.g:976:3: ( rule__GenUsageBlock__Group_3_0__0 )
                    // InternalLibrettoProjectProfile.g:976:4: rule__GenUsageBlock__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GenUsageBlock__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGenUsageBlockAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLibrettoProjectProfile.g:980:2: ( ( rule__GenUsageBlock__Group_3_1__0 ) )
                    {
                    // InternalLibrettoProjectProfile.g:980:2: ( ( rule__GenUsageBlock__Group_3_1__0 ) )
                    // InternalLibrettoProjectProfile.g:981:3: ( rule__GenUsageBlock__Group_3_1__0 )
                    {
                     before(grammarAccess.getGenUsageBlockAccess().getGroup_3_1()); 
                    // InternalLibrettoProjectProfile.g:982:3: ( rule__GenUsageBlock__Group_3_1__0 )
                    // InternalLibrettoProjectProfile.g:982:4: rule__GenUsageBlock__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GenUsageBlock__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGenUsageBlockAccess().getGroup_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLibrettoProjectProfile.g:986:2: ( ( rule__GenUsageBlock__EscalationsAssignment_3_2 ) )
                    {
                    // InternalLibrettoProjectProfile.g:986:2: ( ( rule__GenUsageBlock__EscalationsAssignment_3_2 ) )
                    // InternalLibrettoProjectProfile.g:987:3: ( rule__GenUsageBlock__EscalationsAssignment_3_2 )
                    {
                     before(grammarAccess.getGenUsageBlockAccess().getEscalationsAssignment_3_2()); 
                    // InternalLibrettoProjectProfile.g:988:3: ( rule__GenUsageBlock__EscalationsAssignment_3_2 )
                    // InternalLibrettoProjectProfile.g:988:4: rule__GenUsageBlock__EscalationsAssignment_3_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__GenUsageBlock__EscalationsAssignment_3_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getGenUsageBlockAccess().getEscalationsAssignment_3_2()); 

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
    // $ANTLR end "rule__GenUsageBlock__Alternatives_3"


    // $ANTLR start "rule__GenEscalationBlock__Alternatives_3"
    // InternalLibrettoProjectProfile.g:996:1: rule__GenEscalationBlock__Alternatives_3 : ( ( ( rule__GenEscalationBlock__Group_3_0__0 ) ) | ( ( rule__GenEscalationBlock__Group_3_1__0 ) ) );
    public final void rule__GenEscalationBlock__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1000:1: ( ( ( rule__GenEscalationBlock__Group_3_0__0 ) ) | ( ( rule__GenEscalationBlock__Group_3_1__0 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==61) ) {
                alt11=1;
            }
            else if ( (LA11_0==62) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:1001:2: ( ( rule__GenEscalationBlock__Group_3_0__0 ) )
                    {
                    // InternalLibrettoProjectProfile.g:1001:2: ( ( rule__GenEscalationBlock__Group_3_0__0 ) )
                    // InternalLibrettoProjectProfile.g:1002:3: ( rule__GenEscalationBlock__Group_3_0__0 )
                    {
                     before(grammarAccess.getGenEscalationBlockAccess().getGroup_3_0()); 
                    // InternalLibrettoProjectProfile.g:1003:3: ( rule__GenEscalationBlock__Group_3_0__0 )
                    // InternalLibrettoProjectProfile.g:1003:4: rule__GenEscalationBlock__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GenEscalationBlock__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGenEscalationBlockAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLibrettoProjectProfile.g:1007:2: ( ( rule__GenEscalationBlock__Group_3_1__0 ) )
                    {
                    // InternalLibrettoProjectProfile.g:1007:2: ( ( rule__GenEscalationBlock__Group_3_1__0 ) )
                    // InternalLibrettoProjectProfile.g:1008:3: ( rule__GenEscalationBlock__Group_3_1__0 )
                    {
                     before(grammarAccess.getGenEscalationBlockAccess().getGroup_3_1()); 
                    // InternalLibrettoProjectProfile.g:1009:3: ( rule__GenEscalationBlock__Group_3_1__0 )
                    // InternalLibrettoProjectProfile.g:1009:4: rule__GenEscalationBlock__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GenEscalationBlock__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGenEscalationBlockAccess().getGroup_3_1()); 

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
    // $ANTLR end "rule__GenEscalationBlock__Alternatives_3"


    // $ANTLR start "rule__GenEscalationBlock__EnabledsAlternatives_3_0_1_0"
    // InternalLibrettoProjectProfile.g:1017:1: rule__GenEscalationBlock__EnabledsAlternatives_3_0_1_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__GenEscalationBlock__EnabledsAlternatives_3_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1021:1: ( ( 'true' ) | ( 'false' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==11) ) {
                alt12=1;
            }
            else if ( (LA12_0==12) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:1022:2: ( 'true' )
                    {
                    // InternalLibrettoProjectProfile.g:1022:2: ( 'true' )
                    // InternalLibrettoProjectProfile.g:1023:3: 'true'
                    {
                     before(grammarAccess.getGenEscalationBlockAccess().getEnabledsTrueKeyword_3_0_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getGenEscalationBlockAccess().getEnabledsTrueKeyword_3_0_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLibrettoProjectProfile.g:1028:2: ( 'false' )
                    {
                    // InternalLibrettoProjectProfile.g:1028:2: ( 'false' )
                    // InternalLibrettoProjectProfile.g:1029:3: 'false'
                    {
                     before(grammarAccess.getGenEscalationBlockAccess().getEnabledsFalseKeyword_3_0_1_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getGenEscalationBlockAccess().getEnabledsFalseKeyword_3_0_1_0_1()); 

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
    // $ANTLR end "rule__GenEscalationBlock__EnabledsAlternatives_3_0_1_0"


    // $ANTLR start "rule__SurfaceElement__Alternatives"
    // InternalLibrettoProjectProfile.g:1038:1: rule__SurfaceElement__Alternatives : ( ( ruleScopedSurface ) | ( ruleSurfaceRule ) );
    public final void rule__SurfaceElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1042:1: ( ( ruleScopedSurface ) | ( ruleSurfaceRule ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==64) ) {
                alt13=1;
            }
            else if ( (LA13_0==66||LA13_0==70||LA13_0==72||LA13_0==74) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:1043:2: ( ruleScopedSurface )
                    {
                    // InternalLibrettoProjectProfile.g:1043:2: ( ruleScopedSurface )
                    // InternalLibrettoProjectProfile.g:1044:3: ruleScopedSurface
                    {
                     before(grammarAccess.getSurfaceElementAccess().getScopedSurfaceParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleScopedSurface();

                    state._fsp--;

                     after(grammarAccess.getSurfaceElementAccess().getScopedSurfaceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLibrettoProjectProfile.g:1049:2: ( ruleSurfaceRule )
                    {
                    // InternalLibrettoProjectProfile.g:1049:2: ( ruleSurfaceRule )
                    // InternalLibrettoProjectProfile.g:1050:3: ruleSurfaceRule
                    {
                     before(grammarAccess.getSurfaceElementAccess().getSurfaceRuleParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSurfaceRule();

                    state._fsp--;

                     after(grammarAccess.getSurfaceElementAccess().getSurfaceRuleParserRuleCall_1()); 

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
    // $ANTLR end "rule__SurfaceElement__Alternatives"


    // $ANTLR start "rule__ScopedSurface__Alternatives_1"
    // InternalLibrettoProjectProfile.g:1059:1: rule__ScopedSurface__Alternatives_1 : ( ( ( rule__ScopedSurface__Group_1_0__0 ) ) | ( ( rule__ScopedSurface__Group_1_1__0 ) ) );
    public final void rule__ScopedSurface__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1063:1: ( ( ( rule__ScopedSurface__Group_1_0__0 ) ) | ( ( rule__ScopedSurface__Group_1_1__0 ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==34) ) {
                alt14=1;
            }
            else if ( (LA14_0==65) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:1064:2: ( ( rule__ScopedSurface__Group_1_0__0 ) )
                    {
                    // InternalLibrettoProjectProfile.g:1064:2: ( ( rule__ScopedSurface__Group_1_0__0 ) )
                    // InternalLibrettoProjectProfile.g:1065:3: ( rule__ScopedSurface__Group_1_0__0 )
                    {
                     before(grammarAccess.getScopedSurfaceAccess().getGroup_1_0()); 
                    // InternalLibrettoProjectProfile.g:1066:3: ( rule__ScopedSurface__Group_1_0__0 )
                    // InternalLibrettoProjectProfile.g:1066:4: rule__ScopedSurface__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ScopedSurface__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getScopedSurfaceAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLibrettoProjectProfile.g:1070:2: ( ( rule__ScopedSurface__Group_1_1__0 ) )
                    {
                    // InternalLibrettoProjectProfile.g:1070:2: ( ( rule__ScopedSurface__Group_1_1__0 ) )
                    // InternalLibrettoProjectProfile.g:1071:3: ( rule__ScopedSurface__Group_1_1__0 )
                    {
                     before(grammarAccess.getScopedSurfaceAccess().getGroup_1_1()); 
                    // InternalLibrettoProjectProfile.g:1072:3: ( rule__ScopedSurface__Group_1_1__0 )
                    // InternalLibrettoProjectProfile.g:1072:4: rule__ScopedSurface__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ScopedSurface__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getScopedSurfaceAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__ScopedSurface__Alternatives_1"


    // $ANTLR start "rule__SurfaceRule__Alternatives"
    // InternalLibrettoProjectProfile.g:1080:1: rule__SurfaceRule__Alternatives : ( ( ruleReturnTypeRule ) | ( ruleParamTypeRule ) | ( ruleRecordSelfReturnRule ) | ( ruleMethodOverrideRule ) );
    public final void rule__SurfaceRule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1084:1: ( ( ruleReturnTypeRule ) | ( ruleParamTypeRule ) | ( ruleRecordSelfReturnRule ) | ( ruleMethodOverrideRule ) )
            int alt15=4;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt15=1;
                }
                break;
            case 70:
                {
                alt15=2;
                }
                break;
            case 72:
                {
                alt15=3;
                }
                break;
            case 74:
                {
                alt15=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:1085:2: ( ruleReturnTypeRule )
                    {
                    // InternalLibrettoProjectProfile.g:1085:2: ( ruleReturnTypeRule )
                    // InternalLibrettoProjectProfile.g:1086:3: ruleReturnTypeRule
                    {
                     before(grammarAccess.getSurfaceRuleAccess().getReturnTypeRuleParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleReturnTypeRule();

                    state._fsp--;

                     after(grammarAccess.getSurfaceRuleAccess().getReturnTypeRuleParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLibrettoProjectProfile.g:1091:2: ( ruleParamTypeRule )
                    {
                    // InternalLibrettoProjectProfile.g:1091:2: ( ruleParamTypeRule )
                    // InternalLibrettoProjectProfile.g:1092:3: ruleParamTypeRule
                    {
                     before(grammarAccess.getSurfaceRuleAccess().getParamTypeRuleParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleParamTypeRule();

                    state._fsp--;

                     after(grammarAccess.getSurfaceRuleAccess().getParamTypeRuleParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLibrettoProjectProfile.g:1097:2: ( ruleRecordSelfReturnRule )
                    {
                    // InternalLibrettoProjectProfile.g:1097:2: ( ruleRecordSelfReturnRule )
                    // InternalLibrettoProjectProfile.g:1098:3: ruleRecordSelfReturnRule
                    {
                     before(grammarAccess.getSurfaceRuleAccess().getRecordSelfReturnRuleParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleRecordSelfReturnRule();

                    state._fsp--;

                     after(grammarAccess.getSurfaceRuleAccess().getRecordSelfReturnRuleParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalLibrettoProjectProfile.g:1103:2: ( ruleMethodOverrideRule )
                    {
                    // InternalLibrettoProjectProfile.g:1103:2: ( ruleMethodOverrideRule )
                    // InternalLibrettoProjectProfile.g:1104:3: ruleMethodOverrideRule
                    {
                     before(grammarAccess.getSurfaceRuleAccess().getMethodOverrideRuleParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleMethodOverrideRule();

                    state._fsp--;

                     after(grammarAccess.getSurfaceRuleAccess().getMethodOverrideRuleParserRuleCall_3()); 

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
    // $ANTLR end "rule__SurfaceRule__Alternatives"


    // $ANTLR start "rule__JavaType__Alternatives"
    // InternalLibrettoProjectProfile.g:1113:1: rule__JavaType__Alternatives : ( ( rulePrimitiveType ) | ( ruleQualifiedName ) );
    public final void rule__JavaType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1117:1: ( ( rulePrimitiveType ) | ( ruleQualifiedName ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=16 && LA16_0<=24)) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_ID) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:1118:2: ( rulePrimitiveType )
                    {
                    // InternalLibrettoProjectProfile.g:1118:2: ( rulePrimitiveType )
                    // InternalLibrettoProjectProfile.g:1119:3: rulePrimitiveType
                    {
                     before(grammarAccess.getJavaTypeAccess().getPrimitiveTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePrimitiveType();

                    state._fsp--;

                     after(grammarAccess.getJavaTypeAccess().getPrimitiveTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLibrettoProjectProfile.g:1124:2: ( ruleQualifiedName )
                    {
                    // InternalLibrettoProjectProfile.g:1124:2: ( ruleQualifiedName )
                    // InternalLibrettoProjectProfile.g:1125:3: ruleQualifiedName
                    {
                     before(grammarAccess.getJavaTypeAccess().getQualifiedNameParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleQualifiedName();

                    state._fsp--;

                     after(grammarAccess.getJavaTypeAccess().getQualifiedNameParserRuleCall_1()); 

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
    // $ANTLR end "rule__JavaType__Alternatives"


    // $ANTLR start "rule__PrimitiveType__KindAlternatives_0"
    // InternalLibrettoProjectProfile.g:1134:1: rule__PrimitiveType__KindAlternatives_0 : ( ( 'boolean' ) | ( 'int' ) | ( 'long' ) | ( 'double' ) | ( 'float' ) | ( 'short' ) | ( 'byte' ) | ( 'char' ) | ( 'void' ) );
    public final void rule__PrimitiveType__KindAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1138:1: ( ( 'boolean' ) | ( 'int' ) | ( 'long' ) | ( 'double' ) | ( 'float' ) | ( 'short' ) | ( 'byte' ) | ( 'char' ) | ( 'void' ) )
            int alt17=9;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt17=1;
                }
                break;
            case 17:
                {
                alt17=2;
                }
                break;
            case 18:
                {
                alt17=3;
                }
                break;
            case 19:
                {
                alt17=4;
                }
                break;
            case 20:
                {
                alt17=5;
                }
                break;
            case 21:
                {
                alt17=6;
                }
                break;
            case 22:
                {
                alt17=7;
                }
                break;
            case 23:
                {
                alt17=8;
                }
                break;
            case 24:
                {
                alt17=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:1139:2: ( 'boolean' )
                    {
                    // InternalLibrettoProjectProfile.g:1139:2: ( 'boolean' )
                    // InternalLibrettoProjectProfile.g:1140:3: 'boolean'
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getKindBooleanKeyword_0_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getPrimitiveTypeAccess().getKindBooleanKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLibrettoProjectProfile.g:1145:2: ( 'int' )
                    {
                    // InternalLibrettoProjectProfile.g:1145:2: ( 'int' )
                    // InternalLibrettoProjectProfile.g:1146:3: 'int'
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getKindIntKeyword_0_1()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getPrimitiveTypeAccess().getKindIntKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLibrettoProjectProfile.g:1151:2: ( 'long' )
                    {
                    // InternalLibrettoProjectProfile.g:1151:2: ( 'long' )
                    // InternalLibrettoProjectProfile.g:1152:3: 'long'
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getKindLongKeyword_0_2()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getPrimitiveTypeAccess().getKindLongKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalLibrettoProjectProfile.g:1157:2: ( 'double' )
                    {
                    // InternalLibrettoProjectProfile.g:1157:2: ( 'double' )
                    // InternalLibrettoProjectProfile.g:1158:3: 'double'
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getKindDoubleKeyword_0_3()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getPrimitiveTypeAccess().getKindDoubleKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalLibrettoProjectProfile.g:1163:2: ( 'float' )
                    {
                    // InternalLibrettoProjectProfile.g:1163:2: ( 'float' )
                    // InternalLibrettoProjectProfile.g:1164:3: 'float'
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getKindFloatKeyword_0_4()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getPrimitiveTypeAccess().getKindFloatKeyword_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalLibrettoProjectProfile.g:1169:2: ( 'short' )
                    {
                    // InternalLibrettoProjectProfile.g:1169:2: ( 'short' )
                    // InternalLibrettoProjectProfile.g:1170:3: 'short'
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getKindShortKeyword_0_5()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getPrimitiveTypeAccess().getKindShortKeyword_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalLibrettoProjectProfile.g:1175:2: ( 'byte' )
                    {
                    // InternalLibrettoProjectProfile.g:1175:2: ( 'byte' )
                    // InternalLibrettoProjectProfile.g:1176:3: 'byte'
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getKindByteKeyword_0_6()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getPrimitiveTypeAccess().getKindByteKeyword_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalLibrettoProjectProfile.g:1181:2: ( 'char' )
                    {
                    // InternalLibrettoProjectProfile.g:1181:2: ( 'char' )
                    // InternalLibrettoProjectProfile.g:1182:3: 'char'
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getKindCharKeyword_0_7()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getPrimitiveTypeAccess().getKindCharKeyword_0_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalLibrettoProjectProfile.g:1187:2: ( 'void' )
                    {
                    // InternalLibrettoProjectProfile.g:1187:2: ( 'void' )
                    // InternalLibrettoProjectProfile.g:1188:3: 'void'
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getKindVoidKeyword_0_8()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getPrimitiveTypeAccess().getKindVoidKeyword_0_8()); 

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
    // $ANTLR end "rule__PrimitiveType__KindAlternatives_0"


    // $ANTLR start "rule__ValidID__Alternatives_1_0"
    // InternalLibrettoProjectProfile.g:1197:1: rule__ValidID__Alternatives_1_0 : ( ( '.' ) | ( '-' ) | ( '_' ) );
    public final void rule__ValidID__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1201:1: ( ( '.' ) | ( '-' ) | ( '_' ) )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt18=1;
                }
                break;
            case 26:
                {
                alt18=2;
                }
                break;
            case 27:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:1202:2: ( '.' )
                    {
                    // InternalLibrettoProjectProfile.g:1202:2: ( '.' )
                    // InternalLibrettoProjectProfile.g:1203:3: '.'
                    {
                     before(grammarAccess.getValidIDAccess().getFullStopKeyword_1_0_0()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getValidIDAccess().getFullStopKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLibrettoProjectProfile.g:1208:2: ( '-' )
                    {
                    // InternalLibrettoProjectProfile.g:1208:2: ( '-' )
                    // InternalLibrettoProjectProfile.g:1209:3: '-'
                    {
                     before(grammarAccess.getValidIDAccess().getHyphenMinusKeyword_1_0_1()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getValidIDAccess().getHyphenMinusKeyword_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLibrettoProjectProfile.g:1214:2: ( '_' )
                    {
                    // InternalLibrettoProjectProfile.g:1214:2: ( '_' )
                    // InternalLibrettoProjectProfile.g:1215:3: '_'
                    {
                     before(grammarAccess.getValidIDAccess().get_Keyword_1_0_2()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getValidIDAccess().get_Keyword_1_0_2()); 

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
    // $ANTLR end "rule__ValidID__Alternatives_1_0"


    // $ANTLR start "rule__ProjectProfile__Group__0"
    // InternalLibrettoProjectProfile.g:1224:1: rule__ProjectProfile__Group__0 : rule__ProjectProfile__Group__0__Impl rule__ProjectProfile__Group__1 ;
    public final void rule__ProjectProfile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1228:1: ( rule__ProjectProfile__Group__0__Impl rule__ProjectProfile__Group__1 )
            // InternalLibrettoProjectProfile.g:1229:2: rule__ProjectProfile__Group__0__Impl rule__ProjectProfile__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ProjectProfile__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectProfile__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectProfile__Group__0"


    // $ANTLR start "rule__ProjectProfile__Group__0__Impl"
    // InternalLibrettoProjectProfile.g:1236:1: rule__ProjectProfile__Group__0__Impl : ( () ) ;
    public final void rule__ProjectProfile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1240:1: ( ( () ) )
            // InternalLibrettoProjectProfile.g:1241:1: ( () )
            {
            // InternalLibrettoProjectProfile.g:1241:1: ( () )
            // InternalLibrettoProjectProfile.g:1242:2: ()
            {
             before(grammarAccess.getProjectProfileAccess().getProjectProfileAction_0()); 
            // InternalLibrettoProjectProfile.g:1243:2: ()
            // InternalLibrettoProjectProfile.g:1243:3: 
            {
            }

             after(grammarAccess.getProjectProfileAccess().getProjectProfileAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectProfile__Group__0__Impl"


    // $ANTLR start "rule__ProjectProfile__Group__1"
    // InternalLibrettoProjectProfile.g:1251:1: rule__ProjectProfile__Group__1 : rule__ProjectProfile__Group__1__Impl rule__ProjectProfile__Group__2 ;
    public final void rule__ProjectProfile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1255:1: ( rule__ProjectProfile__Group__1__Impl rule__ProjectProfile__Group__2 )
            // InternalLibrettoProjectProfile.g:1256:2: rule__ProjectProfile__Group__1__Impl rule__ProjectProfile__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ProjectProfile__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectProfile__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectProfile__Group__1"


    // $ANTLR start "rule__ProjectProfile__Group__1__Impl"
    // InternalLibrettoProjectProfile.g:1263:1: rule__ProjectProfile__Group__1__Impl : ( 'profile' ) ;
    public final void rule__ProjectProfile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1267:1: ( ( 'profile' ) )
            // InternalLibrettoProjectProfile.g:1268:1: ( 'profile' )
            {
            // InternalLibrettoProjectProfile.g:1268:1: ( 'profile' )
            // InternalLibrettoProjectProfile.g:1269:2: 'profile'
            {
             before(grammarAccess.getProjectProfileAccess().getProfileKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getProjectProfileAccess().getProfileKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectProfile__Group__1__Impl"


    // $ANTLR start "rule__ProjectProfile__Group__2"
    // InternalLibrettoProjectProfile.g:1278:1: rule__ProjectProfile__Group__2 : rule__ProjectProfile__Group__2__Impl rule__ProjectProfile__Group__3 ;
    public final void rule__ProjectProfile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1282:1: ( rule__ProjectProfile__Group__2__Impl rule__ProjectProfile__Group__3 )
            // InternalLibrettoProjectProfile.g:1283:2: rule__ProjectProfile__Group__2__Impl rule__ProjectProfile__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ProjectProfile__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectProfile__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectProfile__Group__2"


    // $ANTLR start "rule__ProjectProfile__Group__2__Impl"
    // InternalLibrettoProjectProfile.g:1290:1: rule__ProjectProfile__Group__2__Impl : ( ( rule__ProjectProfile__NameAssignment_2 ) ) ;
    public final void rule__ProjectProfile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1294:1: ( ( ( rule__ProjectProfile__NameAssignment_2 ) ) )
            // InternalLibrettoProjectProfile.g:1295:1: ( ( rule__ProjectProfile__NameAssignment_2 ) )
            {
            // InternalLibrettoProjectProfile.g:1295:1: ( ( rule__ProjectProfile__NameAssignment_2 ) )
            // InternalLibrettoProjectProfile.g:1296:2: ( rule__ProjectProfile__NameAssignment_2 )
            {
             before(grammarAccess.getProjectProfileAccess().getNameAssignment_2()); 
            // InternalLibrettoProjectProfile.g:1297:2: ( rule__ProjectProfile__NameAssignment_2 )
            // InternalLibrettoProjectProfile.g:1297:3: rule__ProjectProfile__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ProjectProfile__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getProjectProfileAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectProfile__Group__2__Impl"


    // $ANTLR start "rule__ProjectProfile__Group__3"
    // InternalLibrettoProjectProfile.g:1305:1: rule__ProjectProfile__Group__3 : rule__ProjectProfile__Group__3__Impl rule__ProjectProfile__Group__4 ;
    public final void rule__ProjectProfile__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1309:1: ( rule__ProjectProfile__Group__3__Impl rule__ProjectProfile__Group__4 )
            // InternalLibrettoProjectProfile.g:1310:2: rule__ProjectProfile__Group__3__Impl rule__ProjectProfile__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__ProjectProfile__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectProfile__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectProfile__Group__3"


    // $ANTLR start "rule__ProjectProfile__Group__3__Impl"
    // InternalLibrettoProjectProfile.g:1317:1: rule__ProjectProfile__Group__3__Impl : ( '{' ) ;
    public final void rule__ProjectProfile__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1321:1: ( ( '{' ) )
            // InternalLibrettoProjectProfile.g:1322:1: ( '{' )
            {
            // InternalLibrettoProjectProfile.g:1322:1: ( '{' )
            // InternalLibrettoProjectProfile.g:1323:2: '{'
            {
             before(grammarAccess.getProjectProfileAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getProjectProfileAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectProfile__Group__3__Impl"


    // $ANTLR start "rule__ProjectProfile__Group__4"
    // InternalLibrettoProjectProfile.g:1332:1: rule__ProjectProfile__Group__4 : rule__ProjectProfile__Group__4__Impl rule__ProjectProfile__Group__5 ;
    public final void rule__ProjectProfile__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1336:1: ( rule__ProjectProfile__Group__4__Impl rule__ProjectProfile__Group__5 )
            // InternalLibrettoProjectProfile.g:1337:2: rule__ProjectProfile__Group__4__Impl rule__ProjectProfile__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__ProjectProfile__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectProfile__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectProfile__Group__4"


    // $ANTLR start "rule__ProjectProfile__Group__4__Impl"
    // InternalLibrettoProjectProfile.g:1344:1: rule__ProjectProfile__Group__4__Impl : ( ( rule__ProjectProfile__Alternatives_4 )* ) ;
    public final void rule__ProjectProfile__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1348:1: ( ( ( rule__ProjectProfile__Alternatives_4 )* ) )
            // InternalLibrettoProjectProfile.g:1349:1: ( ( rule__ProjectProfile__Alternatives_4 )* )
            {
            // InternalLibrettoProjectProfile.g:1349:1: ( ( rule__ProjectProfile__Alternatives_4 )* )
            // InternalLibrettoProjectProfile.g:1350:2: ( rule__ProjectProfile__Alternatives_4 )*
            {
             before(grammarAccess.getProjectProfileAccess().getAlternatives_4()); 
            // InternalLibrettoProjectProfile.g:1351:2: ( rule__ProjectProfile__Alternatives_4 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==31||LA19_0==51||LA19_0==63) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:1351:3: rule__ProjectProfile__Alternatives_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__ProjectProfile__Alternatives_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getProjectProfileAccess().getAlternatives_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectProfile__Group__4__Impl"


    // $ANTLR start "rule__ProjectProfile__Group__5"
    // InternalLibrettoProjectProfile.g:1359:1: rule__ProjectProfile__Group__5 : rule__ProjectProfile__Group__5__Impl ;
    public final void rule__ProjectProfile__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1363:1: ( rule__ProjectProfile__Group__5__Impl )
            // InternalLibrettoProjectProfile.g:1364:2: rule__ProjectProfile__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProjectProfile__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectProfile__Group__5"


    // $ANTLR start "rule__ProjectProfile__Group__5__Impl"
    // InternalLibrettoProjectProfile.g:1370:1: rule__ProjectProfile__Group__5__Impl : ( '}' ) ;
    public final void rule__ProjectProfile__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1374:1: ( ( '}' ) )
            // InternalLibrettoProjectProfile.g:1375:1: ( '}' )
            {
            // InternalLibrettoProjectProfile.g:1375:1: ( '}' )
            // InternalLibrettoProjectProfile.g:1376:2: '}'
            {
             before(grammarAccess.getProjectProfileAccess().getRightCurlyBracketKeyword_5()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getProjectProfileAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectProfile__Group__5__Impl"


    // $ANTLR start "rule__ProjectBlock__Group__0"
    // InternalLibrettoProjectProfile.g:1386:1: rule__ProjectBlock__Group__0 : rule__ProjectBlock__Group__0__Impl rule__ProjectBlock__Group__1 ;
    public final void rule__ProjectBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1390:1: ( rule__ProjectBlock__Group__0__Impl rule__ProjectBlock__Group__1 )
            // InternalLibrettoProjectProfile.g:1391:2: rule__ProjectBlock__Group__0__Impl rule__ProjectBlock__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ProjectBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectBlock__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectBlock__Group__0"


    // $ANTLR start "rule__ProjectBlock__Group__0__Impl"
    // InternalLibrettoProjectProfile.g:1398:1: rule__ProjectBlock__Group__0__Impl : ( () ) ;
    public final void rule__ProjectBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1402:1: ( ( () ) )
            // InternalLibrettoProjectProfile.g:1403:1: ( () )
            {
            // InternalLibrettoProjectProfile.g:1403:1: ( () )
            // InternalLibrettoProjectProfile.g:1404:2: ()
            {
             before(grammarAccess.getProjectBlockAccess().getProjectBlockAction_0()); 
            // InternalLibrettoProjectProfile.g:1405:2: ()
            // InternalLibrettoProjectProfile.g:1405:3: 
            {
            }

             after(grammarAccess.getProjectBlockAccess().getProjectBlockAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectBlock__Group__0__Impl"


    // $ANTLR start "rule__ProjectBlock__Group__1"
    // InternalLibrettoProjectProfile.g:1413:1: rule__ProjectBlock__Group__1 : rule__ProjectBlock__Group__1__Impl rule__ProjectBlock__Group__2 ;
    public final void rule__ProjectBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1417:1: ( rule__ProjectBlock__Group__1__Impl rule__ProjectBlock__Group__2 )
            // InternalLibrettoProjectProfile.g:1418:2: rule__ProjectBlock__Group__1__Impl rule__ProjectBlock__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ProjectBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectBlock__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectBlock__Group__1"


    // $ANTLR start "rule__ProjectBlock__Group__1__Impl"
    // InternalLibrettoProjectProfile.g:1425:1: rule__ProjectBlock__Group__1__Impl : ( 'project' ) ;
    public final void rule__ProjectBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1429:1: ( ( 'project' ) )
            // InternalLibrettoProjectProfile.g:1430:1: ( 'project' )
            {
            // InternalLibrettoProjectProfile.g:1430:1: ( 'project' )
            // InternalLibrettoProjectProfile.g:1431:2: 'project'
            {
             before(grammarAccess.getProjectBlockAccess().getProjectKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getProjectBlockAccess().getProjectKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectBlock__Group__1__Impl"


    // $ANTLR start "rule__ProjectBlock__Group__2"
    // InternalLibrettoProjectProfile.g:1440:1: rule__ProjectBlock__Group__2 : rule__ProjectBlock__Group__2__Impl rule__ProjectBlock__Group__3 ;
    public final void rule__ProjectBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1444:1: ( rule__ProjectBlock__Group__2__Impl rule__ProjectBlock__Group__3 )
            // InternalLibrettoProjectProfile.g:1445:2: rule__ProjectBlock__Group__2__Impl rule__ProjectBlock__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__ProjectBlock__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectBlock__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectBlock__Group__2"


    // $ANTLR start "rule__ProjectBlock__Group__2__Impl"
    // InternalLibrettoProjectProfile.g:1452:1: rule__ProjectBlock__Group__2__Impl : ( '{' ) ;
    public final void rule__ProjectBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1456:1: ( ( '{' ) )
            // InternalLibrettoProjectProfile.g:1457:1: ( '{' )
            {
            // InternalLibrettoProjectProfile.g:1457:1: ( '{' )
            // InternalLibrettoProjectProfile.g:1458:2: '{'
            {
             before(grammarAccess.getProjectBlockAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getProjectBlockAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectBlock__Group__2__Impl"


    // $ANTLR start "rule__ProjectBlock__Group__3"
    // InternalLibrettoProjectProfile.g:1467:1: rule__ProjectBlock__Group__3 : rule__ProjectBlock__Group__3__Impl rule__ProjectBlock__Group__4 ;
    public final void rule__ProjectBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1471:1: ( rule__ProjectBlock__Group__3__Impl rule__ProjectBlock__Group__4 )
            // InternalLibrettoProjectProfile.g:1472:2: rule__ProjectBlock__Group__3__Impl rule__ProjectBlock__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__ProjectBlock__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectBlock__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectBlock__Group__3"


    // $ANTLR start "rule__ProjectBlock__Group__3__Impl"
    // InternalLibrettoProjectProfile.g:1479:1: rule__ProjectBlock__Group__3__Impl : ( ( rule__ProjectBlock__Alternatives_3 )* ) ;
    public final void rule__ProjectBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1483:1: ( ( ( rule__ProjectBlock__Alternatives_3 )* ) )
            // InternalLibrettoProjectProfile.g:1484:1: ( ( rule__ProjectBlock__Alternatives_3 )* )
            {
            // InternalLibrettoProjectProfile.g:1484:1: ( ( rule__ProjectBlock__Alternatives_3 )* )
            // InternalLibrettoProjectProfile.g:1485:2: ( rule__ProjectBlock__Alternatives_3 )*
            {
             before(grammarAccess.getProjectBlockAccess().getAlternatives_3()); 
            // InternalLibrettoProjectProfile.g:1486:2: ( rule__ProjectBlock__Alternatives_3 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=32 && LA20_0<=33)||LA20_0==40) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:1486:3: rule__ProjectBlock__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ProjectBlock__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getProjectBlockAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectBlock__Group__3__Impl"


    // $ANTLR start "rule__ProjectBlock__Group__4"
    // InternalLibrettoProjectProfile.g:1494:1: rule__ProjectBlock__Group__4 : rule__ProjectBlock__Group__4__Impl ;
    public final void rule__ProjectBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1498:1: ( rule__ProjectBlock__Group__4__Impl )
            // InternalLibrettoProjectProfile.g:1499:2: rule__ProjectBlock__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProjectBlock__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectBlock__Group__4"


    // $ANTLR start "rule__ProjectBlock__Group__4__Impl"
    // InternalLibrettoProjectProfile.g:1505:1: rule__ProjectBlock__Group__4__Impl : ( '}' ) ;
    public final void rule__ProjectBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1509:1: ( ( '}' ) )
            // InternalLibrettoProjectProfile.g:1510:1: ( '}' )
            {
            // InternalLibrettoProjectProfile.g:1510:1: ( '}' )
            // InternalLibrettoProjectProfile.g:1511:2: '}'
            {
             before(grammarAccess.getProjectBlockAccess().getRightCurlyBracketKeyword_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getProjectBlockAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectBlock__Group__4__Impl"


    // $ANTLR start "rule__ProjectBlock__Group_3_0__0"
    // InternalLibrettoProjectProfile.g:1521:1: rule__ProjectBlock__Group_3_0__0 : rule__ProjectBlock__Group_3_0__0__Impl rule__ProjectBlock__Group_3_0__1 ;
    public final void rule__ProjectBlock__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1525:1: ( rule__ProjectBlock__Group_3_0__0__Impl rule__ProjectBlock__Group_3_0__1 )
            // InternalLibrettoProjectProfile.g:1526:2: rule__ProjectBlock__Group_3_0__0__Impl rule__ProjectBlock__Group_3_0__1
            {
            pushFollow(FOLLOW_11);
            rule__ProjectBlock__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectBlock__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectBlock__Group_3_0__0"


    // $ANTLR start "rule__ProjectBlock__Group_3_0__0__Impl"
    // InternalLibrettoProjectProfile.g:1533:1: rule__ProjectBlock__Group_3_0__0__Impl : ( 'rootDir' ) ;
    public final void rule__ProjectBlock__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1537:1: ( ( 'rootDir' ) )
            // InternalLibrettoProjectProfile.g:1538:1: ( 'rootDir' )
            {
            // InternalLibrettoProjectProfile.g:1538:1: ( 'rootDir' )
            // InternalLibrettoProjectProfile.g:1539:2: 'rootDir'
            {
             before(grammarAccess.getProjectBlockAccess().getRootDirKeyword_3_0_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getProjectBlockAccess().getRootDirKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectBlock__Group_3_0__0__Impl"


    // $ANTLR start "rule__ProjectBlock__Group_3_0__1"
    // InternalLibrettoProjectProfile.g:1548:1: rule__ProjectBlock__Group_3_0__1 : rule__ProjectBlock__Group_3_0__1__Impl ;
    public final void rule__ProjectBlock__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1552:1: ( rule__ProjectBlock__Group_3_0__1__Impl )
            // InternalLibrettoProjectProfile.g:1553:2: rule__ProjectBlock__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProjectBlock__Group_3_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectBlock__Group_3_0__1"


    // $ANTLR start "rule__ProjectBlock__Group_3_0__1__Impl"
    // InternalLibrettoProjectProfile.g:1559:1: rule__ProjectBlock__Group_3_0__1__Impl : ( ( rule__ProjectBlock__RootDirAssignment_3_0_1 ) ) ;
    public final void rule__ProjectBlock__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1563:1: ( ( ( rule__ProjectBlock__RootDirAssignment_3_0_1 ) ) )
            // InternalLibrettoProjectProfile.g:1564:1: ( ( rule__ProjectBlock__RootDirAssignment_3_0_1 ) )
            {
            // InternalLibrettoProjectProfile.g:1564:1: ( ( rule__ProjectBlock__RootDirAssignment_3_0_1 ) )
            // InternalLibrettoProjectProfile.g:1565:2: ( rule__ProjectBlock__RootDirAssignment_3_0_1 )
            {
             before(grammarAccess.getProjectBlockAccess().getRootDirAssignment_3_0_1()); 
            // InternalLibrettoProjectProfile.g:1566:2: ( rule__ProjectBlock__RootDirAssignment_3_0_1 )
            // InternalLibrettoProjectProfile.g:1566:3: rule__ProjectBlock__RootDirAssignment_3_0_1
            {
            pushFollow(FOLLOW_2);
            rule__ProjectBlock__RootDirAssignment_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getProjectBlockAccess().getRootDirAssignment_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectBlock__Group_3_0__1__Impl"


    // $ANTLR start "rule__ModulesBlock__Group__0"
    // InternalLibrettoProjectProfile.g:1575:1: rule__ModulesBlock__Group__0 : rule__ModulesBlock__Group__0__Impl rule__ModulesBlock__Group__1 ;
    public final void rule__ModulesBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1579:1: ( rule__ModulesBlock__Group__0__Impl rule__ModulesBlock__Group__1 )
            // InternalLibrettoProjectProfile.g:1580:2: rule__ModulesBlock__Group__0__Impl rule__ModulesBlock__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__ModulesBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModulesBlock__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModulesBlock__Group__0"


    // $ANTLR start "rule__ModulesBlock__Group__0__Impl"
    // InternalLibrettoProjectProfile.g:1587:1: rule__ModulesBlock__Group__0__Impl : ( () ) ;
    public final void rule__ModulesBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1591:1: ( ( () ) )
            // InternalLibrettoProjectProfile.g:1592:1: ( () )
            {
            // InternalLibrettoProjectProfile.g:1592:1: ( () )
            // InternalLibrettoProjectProfile.g:1593:2: ()
            {
             before(grammarAccess.getModulesBlockAccess().getModulesBlockAction_0()); 
            // InternalLibrettoProjectProfile.g:1594:2: ()
            // InternalLibrettoProjectProfile.g:1594:3: 
            {
            }

             after(grammarAccess.getModulesBlockAccess().getModulesBlockAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModulesBlock__Group__0__Impl"


    // $ANTLR start "rule__ModulesBlock__Group__1"
    // InternalLibrettoProjectProfile.g:1602:1: rule__ModulesBlock__Group__1 : rule__ModulesBlock__Group__1__Impl rule__ModulesBlock__Group__2 ;
    public final void rule__ModulesBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1606:1: ( rule__ModulesBlock__Group__1__Impl rule__ModulesBlock__Group__2 )
            // InternalLibrettoProjectProfile.g:1607:2: rule__ModulesBlock__Group__1__Impl rule__ModulesBlock__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ModulesBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModulesBlock__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModulesBlock__Group__1"


    // $ANTLR start "rule__ModulesBlock__Group__1__Impl"
    // InternalLibrettoProjectProfile.g:1614:1: rule__ModulesBlock__Group__1__Impl : ( 'modules' ) ;
    public final void rule__ModulesBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1618:1: ( ( 'modules' ) )
            // InternalLibrettoProjectProfile.g:1619:1: ( 'modules' )
            {
            // InternalLibrettoProjectProfile.g:1619:1: ( 'modules' )
            // InternalLibrettoProjectProfile.g:1620:2: 'modules'
            {
             before(grammarAccess.getModulesBlockAccess().getModulesKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getModulesBlockAccess().getModulesKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModulesBlock__Group__1__Impl"


    // $ANTLR start "rule__ModulesBlock__Group__2"
    // InternalLibrettoProjectProfile.g:1629:1: rule__ModulesBlock__Group__2 : rule__ModulesBlock__Group__2__Impl rule__ModulesBlock__Group__3 ;
    public final void rule__ModulesBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1633:1: ( rule__ModulesBlock__Group__2__Impl rule__ModulesBlock__Group__3 )
            // InternalLibrettoProjectProfile.g:1634:2: rule__ModulesBlock__Group__2__Impl rule__ModulesBlock__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__ModulesBlock__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModulesBlock__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModulesBlock__Group__2"


    // $ANTLR start "rule__ModulesBlock__Group__2__Impl"
    // InternalLibrettoProjectProfile.g:1641:1: rule__ModulesBlock__Group__2__Impl : ( '{' ) ;
    public final void rule__ModulesBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1645:1: ( ( '{' ) )
            // InternalLibrettoProjectProfile.g:1646:1: ( '{' )
            {
            // InternalLibrettoProjectProfile.g:1646:1: ( '{' )
            // InternalLibrettoProjectProfile.g:1647:2: '{'
            {
             before(grammarAccess.getModulesBlockAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getModulesBlockAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModulesBlock__Group__2__Impl"


    // $ANTLR start "rule__ModulesBlock__Group__3"
    // InternalLibrettoProjectProfile.g:1656:1: rule__ModulesBlock__Group__3 : rule__ModulesBlock__Group__3__Impl rule__ModulesBlock__Group__4 ;
    public final void rule__ModulesBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1660:1: ( rule__ModulesBlock__Group__3__Impl rule__ModulesBlock__Group__4 )
            // InternalLibrettoProjectProfile.g:1661:2: rule__ModulesBlock__Group__3__Impl rule__ModulesBlock__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__ModulesBlock__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModulesBlock__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModulesBlock__Group__3"


    // $ANTLR start "rule__ModulesBlock__Group__3__Impl"
    // InternalLibrettoProjectProfile.g:1668:1: rule__ModulesBlock__Group__3__Impl : ( ( rule__ModulesBlock__ModulesAssignment_3 )* ) ;
    public final void rule__ModulesBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1672:1: ( ( ( rule__ModulesBlock__ModulesAssignment_3 )* ) )
            // InternalLibrettoProjectProfile.g:1673:1: ( ( rule__ModulesBlock__ModulesAssignment_3 )* )
            {
            // InternalLibrettoProjectProfile.g:1673:1: ( ( rule__ModulesBlock__ModulesAssignment_3 )* )
            // InternalLibrettoProjectProfile.g:1674:2: ( rule__ModulesBlock__ModulesAssignment_3 )*
            {
             before(grammarAccess.getModulesBlockAccess().getModulesAssignment_3()); 
            // InternalLibrettoProjectProfile.g:1675:2: ( rule__ModulesBlock__ModulesAssignment_3 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==34) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:1675:3: rule__ModulesBlock__ModulesAssignment_3
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__ModulesBlock__ModulesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getModulesBlockAccess().getModulesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModulesBlock__Group__3__Impl"


    // $ANTLR start "rule__ModulesBlock__Group__4"
    // InternalLibrettoProjectProfile.g:1683:1: rule__ModulesBlock__Group__4 : rule__ModulesBlock__Group__4__Impl ;
    public final void rule__ModulesBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1687:1: ( rule__ModulesBlock__Group__4__Impl )
            // InternalLibrettoProjectProfile.g:1688:2: rule__ModulesBlock__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModulesBlock__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModulesBlock__Group__4"


    // $ANTLR start "rule__ModulesBlock__Group__4__Impl"
    // InternalLibrettoProjectProfile.g:1694:1: rule__ModulesBlock__Group__4__Impl : ( '}' ) ;
    public final void rule__ModulesBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1698:1: ( ( '}' ) )
            // InternalLibrettoProjectProfile.g:1699:1: ( '}' )
            {
            // InternalLibrettoProjectProfile.g:1699:1: ( '}' )
            // InternalLibrettoProjectProfile.g:1700:2: '}'
            {
             before(grammarAccess.getModulesBlockAccess().getRightCurlyBracketKeyword_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getModulesBlockAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModulesBlock__Group__4__Impl"


    // $ANTLR start "rule__ProjectModule__Group__0"
    // InternalLibrettoProjectProfile.g:1710:1: rule__ProjectModule__Group__0 : rule__ProjectModule__Group__0__Impl rule__ProjectModule__Group__1 ;
    public final void rule__ProjectModule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1714:1: ( rule__ProjectModule__Group__0__Impl rule__ProjectModule__Group__1 )
            // InternalLibrettoProjectProfile.g:1715:2: rule__ProjectModule__Group__0__Impl rule__ProjectModule__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ProjectModule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectModule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModule__Group__0"


    // $ANTLR start "rule__ProjectModule__Group__0__Impl"
    // InternalLibrettoProjectProfile.g:1722:1: rule__ProjectModule__Group__0__Impl : ( 'module' ) ;
    public final void rule__ProjectModule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1726:1: ( ( 'module' ) )
            // InternalLibrettoProjectProfile.g:1727:1: ( 'module' )
            {
            // InternalLibrettoProjectProfile.g:1727:1: ( 'module' )
            // InternalLibrettoProjectProfile.g:1728:2: 'module'
            {
             before(grammarAccess.getProjectModuleAccess().getModuleKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getProjectModuleAccess().getModuleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModule__Group__0__Impl"


    // $ANTLR start "rule__ProjectModule__Group__1"
    // InternalLibrettoProjectProfile.g:1737:1: rule__ProjectModule__Group__1 : rule__ProjectModule__Group__1__Impl rule__ProjectModule__Group__2 ;
    public final void rule__ProjectModule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1741:1: ( rule__ProjectModule__Group__1__Impl rule__ProjectModule__Group__2 )
            // InternalLibrettoProjectProfile.g:1742:2: rule__ProjectModule__Group__1__Impl rule__ProjectModule__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ProjectModule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectModule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModule__Group__1"


    // $ANTLR start "rule__ProjectModule__Group__1__Impl"
    // InternalLibrettoProjectProfile.g:1749:1: rule__ProjectModule__Group__1__Impl : ( ( rule__ProjectModule__NameAssignment_1 ) ) ;
    public final void rule__ProjectModule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1753:1: ( ( ( rule__ProjectModule__NameAssignment_1 ) ) )
            // InternalLibrettoProjectProfile.g:1754:1: ( ( rule__ProjectModule__NameAssignment_1 ) )
            {
            // InternalLibrettoProjectProfile.g:1754:1: ( ( rule__ProjectModule__NameAssignment_1 ) )
            // InternalLibrettoProjectProfile.g:1755:2: ( rule__ProjectModule__NameAssignment_1 )
            {
             before(grammarAccess.getProjectModuleAccess().getNameAssignment_1()); 
            // InternalLibrettoProjectProfile.g:1756:2: ( rule__ProjectModule__NameAssignment_1 )
            // InternalLibrettoProjectProfile.g:1756:3: rule__ProjectModule__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ProjectModule__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProjectModuleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModule__Group__1__Impl"


    // $ANTLR start "rule__ProjectModule__Group__2"
    // InternalLibrettoProjectProfile.g:1764:1: rule__ProjectModule__Group__2 : rule__ProjectModule__Group__2__Impl rule__ProjectModule__Group__3 ;
    public final void rule__ProjectModule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1768:1: ( rule__ProjectModule__Group__2__Impl rule__ProjectModule__Group__3 )
            // InternalLibrettoProjectProfile.g:1769:2: rule__ProjectModule__Group__2__Impl rule__ProjectModule__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__ProjectModule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectModule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModule__Group__2"


    // $ANTLR start "rule__ProjectModule__Group__2__Impl"
    // InternalLibrettoProjectProfile.g:1776:1: rule__ProjectModule__Group__2__Impl : ( '{' ) ;
    public final void rule__ProjectModule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1780:1: ( ( '{' ) )
            // InternalLibrettoProjectProfile.g:1781:1: ( '{' )
            {
            // InternalLibrettoProjectProfile.g:1781:1: ( '{' )
            // InternalLibrettoProjectProfile.g:1782:2: '{'
            {
             before(grammarAccess.getProjectModuleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getProjectModuleAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModule__Group__2__Impl"


    // $ANTLR start "rule__ProjectModule__Group__3"
    // InternalLibrettoProjectProfile.g:1791:1: rule__ProjectModule__Group__3 : rule__ProjectModule__Group__3__Impl rule__ProjectModule__Group__4 ;
    public final void rule__ProjectModule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1795:1: ( rule__ProjectModule__Group__3__Impl rule__ProjectModule__Group__4 )
            // InternalLibrettoProjectProfile.g:1796:2: rule__ProjectModule__Group__3__Impl rule__ProjectModule__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__ProjectModule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectModule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModule__Group__3"


    // $ANTLR start "rule__ProjectModule__Group__3__Impl"
    // InternalLibrettoProjectProfile.g:1803:1: rule__ProjectModule__Group__3__Impl : ( ( rule__ProjectModule__Alternatives_3 )* ) ;
    public final void rule__ProjectModule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1807:1: ( ( ( rule__ProjectModule__Alternatives_3 )* ) )
            // InternalLibrettoProjectProfile.g:1808:1: ( ( rule__ProjectModule__Alternatives_3 )* )
            {
            // InternalLibrettoProjectProfile.g:1808:1: ( ( rule__ProjectModule__Alternatives_3 )* )
            // InternalLibrettoProjectProfile.g:1809:2: ( rule__ProjectModule__Alternatives_3 )*
            {
             before(grammarAccess.getProjectModuleAccess().getAlternatives_3()); 
            // InternalLibrettoProjectProfile.g:1810:2: ( rule__ProjectModule__Alternatives_3 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=35 && LA22_0<=39)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:1810:3: rule__ProjectModule__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__ProjectModule__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getProjectModuleAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModule__Group__3__Impl"


    // $ANTLR start "rule__ProjectModule__Group__4"
    // InternalLibrettoProjectProfile.g:1818:1: rule__ProjectModule__Group__4 : rule__ProjectModule__Group__4__Impl ;
    public final void rule__ProjectModule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1822:1: ( rule__ProjectModule__Group__4__Impl )
            // InternalLibrettoProjectProfile.g:1823:2: rule__ProjectModule__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProjectModule__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModule__Group__4"


    // $ANTLR start "rule__ProjectModule__Group__4__Impl"
    // InternalLibrettoProjectProfile.g:1829:1: rule__ProjectModule__Group__4__Impl : ( '}' ) ;
    public final void rule__ProjectModule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1833:1: ( ( '}' ) )
            // InternalLibrettoProjectProfile.g:1834:1: ( '}' )
            {
            // InternalLibrettoProjectProfile.g:1834:1: ( '}' )
            // InternalLibrettoProjectProfile.g:1835:2: '}'
            {
             before(grammarAccess.getProjectModuleAccess().getRightCurlyBracketKeyword_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getProjectModuleAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModule__Group__4__Impl"


    // $ANTLR start "rule__ProjectModule__Group_3_0__0"
    // InternalLibrettoProjectProfile.g:1845:1: rule__ProjectModule__Group_3_0__0 : rule__ProjectModule__Group_3_0__0__Impl rule__ProjectModule__Group_3_0__1 ;
    public final void rule__ProjectModule__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1849:1: ( rule__ProjectModule__Group_3_0__0__Impl rule__ProjectModule__Group_3_0__1 )
            // InternalLibrettoProjectProfile.g:1850:2: rule__ProjectModule__Group_3_0__0__Impl rule__ProjectModule__Group_3_0__1
            {
            pushFollow(FOLLOW_11);
            rule__ProjectModule__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectModule__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModule__Group_3_0__0"


    // $ANTLR start "rule__ProjectModule__Group_3_0__0__Impl"
    // InternalLibrettoProjectProfile.g:1857:1: rule__ProjectModule__Group_3_0__0__Impl : ( 'dir' ) ;
    public final void rule__ProjectModule__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1861:1: ( ( 'dir' ) )
            // InternalLibrettoProjectProfile.g:1862:1: ( 'dir' )
            {
            // InternalLibrettoProjectProfile.g:1862:1: ( 'dir' )
            // InternalLibrettoProjectProfile.g:1863:2: 'dir'
            {
             before(grammarAccess.getProjectModuleAccess().getDirKeyword_3_0_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getProjectModuleAccess().getDirKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModule__Group_3_0__0__Impl"


    // $ANTLR start "rule__ProjectModule__Group_3_0__1"
    // InternalLibrettoProjectProfile.g:1872:1: rule__ProjectModule__Group_3_0__1 : rule__ProjectModule__Group_3_0__1__Impl ;
    public final void rule__ProjectModule__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1876:1: ( rule__ProjectModule__Group_3_0__1__Impl )
            // InternalLibrettoProjectProfile.g:1877:2: rule__ProjectModule__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProjectModule__Group_3_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModule__Group_3_0__1"


    // $ANTLR start "rule__ProjectModule__Group_3_0__1__Impl"
    // InternalLibrettoProjectProfile.g:1883:1: rule__ProjectModule__Group_3_0__1__Impl : ( ( rule__ProjectModule__DirsAssignment_3_0_1 ) ) ;
    public final void rule__ProjectModule__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1887:1: ( ( ( rule__ProjectModule__DirsAssignment_3_0_1 ) ) )
            // InternalLibrettoProjectProfile.g:1888:1: ( ( rule__ProjectModule__DirsAssignment_3_0_1 ) )
            {
            // InternalLibrettoProjectProfile.g:1888:1: ( ( rule__ProjectModule__DirsAssignment_3_0_1 ) )
            // InternalLibrettoProjectProfile.g:1889:2: ( rule__ProjectModule__DirsAssignment_3_0_1 )
            {
             before(grammarAccess.getProjectModuleAccess().getDirsAssignment_3_0_1()); 
            // InternalLibrettoProjectProfile.g:1890:2: ( rule__ProjectModule__DirsAssignment_3_0_1 )
            // InternalLibrettoProjectProfile.g:1890:3: rule__ProjectModule__DirsAssignment_3_0_1
            {
            pushFollow(FOLLOW_2);
            rule__ProjectModule__DirsAssignment_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getProjectModuleAccess().getDirsAssignment_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModule__Group_3_0__1__Impl"


    // $ANTLR start "rule__ProjectModule__Group_3_1__0"
    // InternalLibrettoProjectProfile.g:1899:1: rule__ProjectModule__Group_3_1__0 : rule__ProjectModule__Group_3_1__0__Impl rule__ProjectModule__Group_3_1__1 ;
    public final void rule__ProjectModule__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1903:1: ( rule__ProjectModule__Group_3_1__0__Impl rule__ProjectModule__Group_3_1__1 )
            // InternalLibrettoProjectProfile.g:1904:2: rule__ProjectModule__Group_3_1__0__Impl rule__ProjectModule__Group_3_1__1
            {
            pushFollow(FOLLOW_11);
            rule__ProjectModule__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectModule__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModule__Group_3_1__0"


    // $ANTLR start "rule__ProjectModule__Group_3_1__0__Impl"
    // InternalLibrettoProjectProfile.g:1911:1: rule__ProjectModule__Group_3_1__0__Impl : ( 'specDir' ) ;
    public final void rule__ProjectModule__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1915:1: ( ( 'specDir' ) )
            // InternalLibrettoProjectProfile.g:1916:1: ( 'specDir' )
            {
            // InternalLibrettoProjectProfile.g:1916:1: ( 'specDir' )
            // InternalLibrettoProjectProfile.g:1917:2: 'specDir'
            {
             before(grammarAccess.getProjectModuleAccess().getSpecDirKeyword_3_1_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getProjectModuleAccess().getSpecDirKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModule__Group_3_1__0__Impl"


    // $ANTLR start "rule__ProjectModule__Group_3_1__1"
    // InternalLibrettoProjectProfile.g:1926:1: rule__ProjectModule__Group_3_1__1 : rule__ProjectModule__Group_3_1__1__Impl ;
    public final void rule__ProjectModule__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1930:1: ( rule__ProjectModule__Group_3_1__1__Impl )
            // InternalLibrettoProjectProfile.g:1931:2: rule__ProjectModule__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProjectModule__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModule__Group_3_1__1"


    // $ANTLR start "rule__ProjectModule__Group_3_1__1__Impl"
    // InternalLibrettoProjectProfile.g:1937:1: rule__ProjectModule__Group_3_1__1__Impl : ( ( rule__ProjectModule__SpecDirsAssignment_3_1_1 ) ) ;
    public final void rule__ProjectModule__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1941:1: ( ( ( rule__ProjectModule__SpecDirsAssignment_3_1_1 ) ) )
            // InternalLibrettoProjectProfile.g:1942:1: ( ( rule__ProjectModule__SpecDirsAssignment_3_1_1 ) )
            {
            // InternalLibrettoProjectProfile.g:1942:1: ( ( rule__ProjectModule__SpecDirsAssignment_3_1_1 ) )
            // InternalLibrettoProjectProfile.g:1943:2: ( rule__ProjectModule__SpecDirsAssignment_3_1_1 )
            {
             before(grammarAccess.getProjectModuleAccess().getSpecDirsAssignment_3_1_1()); 
            // InternalLibrettoProjectProfile.g:1944:2: ( rule__ProjectModule__SpecDirsAssignment_3_1_1 )
            // InternalLibrettoProjectProfile.g:1944:3: rule__ProjectModule__SpecDirsAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ProjectModule__SpecDirsAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getProjectModuleAccess().getSpecDirsAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModule__Group_3_1__1__Impl"


    // $ANTLR start "rule__ProjectModule__Group_3_2__0"
    // InternalLibrettoProjectProfile.g:1953:1: rule__ProjectModule__Group_3_2__0 : rule__ProjectModule__Group_3_2__0__Impl rule__ProjectModule__Group_3_2__1 ;
    public final void rule__ProjectModule__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1957:1: ( rule__ProjectModule__Group_3_2__0__Impl rule__ProjectModule__Group_3_2__1 )
            // InternalLibrettoProjectProfile.g:1958:2: rule__ProjectModule__Group_3_2__0__Impl rule__ProjectModule__Group_3_2__1
            {
            pushFollow(FOLLOW_11);
            rule__ProjectModule__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectModule__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModule__Group_3_2__0"


    // $ANTLR start "rule__ProjectModule__Group_3_2__0__Impl"
    // InternalLibrettoProjectProfile.g:1965:1: rule__ProjectModule__Group_3_2__0__Impl : ( 'testDir' ) ;
    public final void rule__ProjectModule__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1969:1: ( ( 'testDir' ) )
            // InternalLibrettoProjectProfile.g:1970:1: ( 'testDir' )
            {
            // InternalLibrettoProjectProfile.g:1970:1: ( 'testDir' )
            // InternalLibrettoProjectProfile.g:1971:2: 'testDir'
            {
             before(grammarAccess.getProjectModuleAccess().getTestDirKeyword_3_2_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getProjectModuleAccess().getTestDirKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModule__Group_3_2__0__Impl"


    // $ANTLR start "rule__ProjectModule__Group_3_2__1"
    // InternalLibrettoProjectProfile.g:1980:1: rule__ProjectModule__Group_3_2__1 : rule__ProjectModule__Group_3_2__1__Impl ;
    public final void rule__ProjectModule__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1984:1: ( rule__ProjectModule__Group_3_2__1__Impl )
            // InternalLibrettoProjectProfile.g:1985:2: rule__ProjectModule__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProjectModule__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModule__Group_3_2__1"


    // $ANTLR start "rule__ProjectModule__Group_3_2__1__Impl"
    // InternalLibrettoProjectProfile.g:1991:1: rule__ProjectModule__Group_3_2__1__Impl : ( ( rule__ProjectModule__TestDirsAssignment_3_2_1 ) ) ;
    public final void rule__ProjectModule__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1995:1: ( ( ( rule__ProjectModule__TestDirsAssignment_3_2_1 ) ) )
            // InternalLibrettoProjectProfile.g:1996:1: ( ( rule__ProjectModule__TestDirsAssignment_3_2_1 ) )
            {
            // InternalLibrettoProjectProfile.g:1996:1: ( ( rule__ProjectModule__TestDirsAssignment_3_2_1 ) )
            // InternalLibrettoProjectProfile.g:1997:2: ( rule__ProjectModule__TestDirsAssignment_3_2_1 )
            {
             before(grammarAccess.getProjectModuleAccess().getTestDirsAssignment_3_2_1()); 
            // InternalLibrettoProjectProfile.g:1998:2: ( rule__ProjectModule__TestDirsAssignment_3_2_1 )
            // InternalLibrettoProjectProfile.g:1998:3: rule__ProjectModule__TestDirsAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ProjectModule__TestDirsAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getProjectModuleAccess().getTestDirsAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModule__Group_3_2__1__Impl"


    // $ANTLR start "rule__ProjectModule__Group_3_3__0"
    // InternalLibrettoProjectProfile.g:2007:1: rule__ProjectModule__Group_3_3__0 : rule__ProjectModule__Group_3_3__0__Impl rule__ProjectModule__Group_3_3__1 ;
    public final void rule__ProjectModule__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2011:1: ( rule__ProjectModule__Group_3_3__0__Impl rule__ProjectModule__Group_3_3__1 )
            // InternalLibrettoProjectProfile.g:2012:2: rule__ProjectModule__Group_3_3__0__Impl rule__ProjectModule__Group_3_3__1
            {
            pushFollow(FOLLOW_11);
            rule__ProjectModule__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectModule__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModule__Group_3_3__0"


    // $ANTLR start "rule__ProjectModule__Group_3_3__0__Impl"
    // InternalLibrettoProjectProfile.g:2019:1: rule__ProjectModule__Group_3_3__0__Impl : ( 'mainDir' ) ;
    public final void rule__ProjectModule__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2023:1: ( ( 'mainDir' ) )
            // InternalLibrettoProjectProfile.g:2024:1: ( 'mainDir' )
            {
            // InternalLibrettoProjectProfile.g:2024:1: ( 'mainDir' )
            // InternalLibrettoProjectProfile.g:2025:2: 'mainDir'
            {
             before(grammarAccess.getProjectModuleAccess().getMainDirKeyword_3_3_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getProjectModuleAccess().getMainDirKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModule__Group_3_3__0__Impl"


    // $ANTLR start "rule__ProjectModule__Group_3_3__1"
    // InternalLibrettoProjectProfile.g:2034:1: rule__ProjectModule__Group_3_3__1 : rule__ProjectModule__Group_3_3__1__Impl ;
    public final void rule__ProjectModule__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2038:1: ( rule__ProjectModule__Group_3_3__1__Impl )
            // InternalLibrettoProjectProfile.g:2039:2: rule__ProjectModule__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProjectModule__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModule__Group_3_3__1"


    // $ANTLR start "rule__ProjectModule__Group_3_3__1__Impl"
    // InternalLibrettoProjectProfile.g:2045:1: rule__ProjectModule__Group_3_3__1__Impl : ( ( rule__ProjectModule__MainDirsAssignment_3_3_1 ) ) ;
    public final void rule__ProjectModule__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2049:1: ( ( ( rule__ProjectModule__MainDirsAssignment_3_3_1 ) ) )
            // InternalLibrettoProjectProfile.g:2050:1: ( ( rule__ProjectModule__MainDirsAssignment_3_3_1 ) )
            {
            // InternalLibrettoProjectProfile.g:2050:1: ( ( rule__ProjectModule__MainDirsAssignment_3_3_1 ) )
            // InternalLibrettoProjectProfile.g:2051:2: ( rule__ProjectModule__MainDirsAssignment_3_3_1 )
            {
             before(grammarAccess.getProjectModuleAccess().getMainDirsAssignment_3_3_1()); 
            // InternalLibrettoProjectProfile.g:2052:2: ( rule__ProjectModule__MainDirsAssignment_3_3_1 )
            // InternalLibrettoProjectProfile.g:2052:3: rule__ProjectModule__MainDirsAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ProjectModule__MainDirsAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getProjectModuleAccess().getMainDirsAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModule__Group_3_3__1__Impl"


    // $ANTLR start "rule__ProjectModule__Group_3_4__0"
    // InternalLibrettoProjectProfile.g:2061:1: rule__ProjectModule__Group_3_4__0 : rule__ProjectModule__Group_3_4__0__Impl rule__ProjectModule__Group_3_4__1 ;
    public final void rule__ProjectModule__Group_3_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2065:1: ( rule__ProjectModule__Group_3_4__0__Impl rule__ProjectModule__Group_3_4__1 )
            // InternalLibrettoProjectProfile.g:2066:2: rule__ProjectModule__Group_3_4__0__Impl rule__ProjectModule__Group_3_4__1
            {
            pushFollow(FOLLOW_11);
            rule__ProjectModule__Group_3_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectModule__Group_3_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModule__Group_3_4__0"


    // $ANTLR start "rule__ProjectModule__Group_3_4__0__Impl"
    // InternalLibrettoProjectProfile.g:2073:1: rule__ProjectModule__Group_3_4__0__Impl : ( 'basePackage' ) ;
    public final void rule__ProjectModule__Group_3_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2077:1: ( ( 'basePackage' ) )
            // InternalLibrettoProjectProfile.g:2078:1: ( 'basePackage' )
            {
            // InternalLibrettoProjectProfile.g:2078:1: ( 'basePackage' )
            // InternalLibrettoProjectProfile.g:2079:2: 'basePackage'
            {
             before(grammarAccess.getProjectModuleAccess().getBasePackageKeyword_3_4_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getProjectModuleAccess().getBasePackageKeyword_3_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModule__Group_3_4__0__Impl"


    // $ANTLR start "rule__ProjectModule__Group_3_4__1"
    // InternalLibrettoProjectProfile.g:2088:1: rule__ProjectModule__Group_3_4__1 : rule__ProjectModule__Group_3_4__1__Impl ;
    public final void rule__ProjectModule__Group_3_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2092:1: ( rule__ProjectModule__Group_3_4__1__Impl )
            // InternalLibrettoProjectProfile.g:2093:2: rule__ProjectModule__Group_3_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProjectModule__Group_3_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModule__Group_3_4__1"


    // $ANTLR start "rule__ProjectModule__Group_3_4__1__Impl"
    // InternalLibrettoProjectProfile.g:2099:1: rule__ProjectModule__Group_3_4__1__Impl : ( ( rule__ProjectModule__BasePackagesAssignment_3_4_1 ) ) ;
    public final void rule__ProjectModule__Group_3_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2103:1: ( ( ( rule__ProjectModule__BasePackagesAssignment_3_4_1 ) ) )
            // InternalLibrettoProjectProfile.g:2104:1: ( ( rule__ProjectModule__BasePackagesAssignment_3_4_1 ) )
            {
            // InternalLibrettoProjectProfile.g:2104:1: ( ( rule__ProjectModule__BasePackagesAssignment_3_4_1 ) )
            // InternalLibrettoProjectProfile.g:2105:2: ( rule__ProjectModule__BasePackagesAssignment_3_4_1 )
            {
             before(grammarAccess.getProjectModuleAccess().getBasePackagesAssignment_3_4_1()); 
            // InternalLibrettoProjectProfile.g:2106:2: ( rule__ProjectModule__BasePackagesAssignment_3_4_1 )
            // InternalLibrettoProjectProfile.g:2106:3: rule__ProjectModule__BasePackagesAssignment_3_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ProjectModule__BasePackagesAssignment_3_4_1();

            state._fsp--;


            }

             after(grammarAccess.getProjectModuleAccess().getBasePackagesAssignment_3_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModule__Group_3_4__1__Impl"


    // $ANTLR start "rule__GenBlock__Group__0"
    // InternalLibrettoProjectProfile.g:2115:1: rule__GenBlock__Group__0 : rule__GenBlock__Group__0__Impl rule__GenBlock__Group__1 ;
    public final void rule__GenBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2119:1: ( rule__GenBlock__Group__0__Impl rule__GenBlock__Group__1 )
            // InternalLibrettoProjectProfile.g:2120:2: rule__GenBlock__Group__0__Impl rule__GenBlock__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__GenBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GenBlock__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenBlock__Group__0"


    // $ANTLR start "rule__GenBlock__Group__0__Impl"
    // InternalLibrettoProjectProfile.g:2127:1: rule__GenBlock__Group__0__Impl : ( () ) ;
    public final void rule__GenBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2131:1: ( ( () ) )
            // InternalLibrettoProjectProfile.g:2132:1: ( () )
            {
            // InternalLibrettoProjectProfile.g:2132:1: ( () )
            // InternalLibrettoProjectProfile.g:2133:2: ()
            {
             before(grammarAccess.getGenBlockAccess().getGenBlockAction_0()); 
            // InternalLibrettoProjectProfile.g:2134:2: ()
            // InternalLibrettoProjectProfile.g:2134:3: 
            {
            }

             after(grammarAccess.getGenBlockAccess().getGenBlockAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenBlock__Group__0__Impl"


    // $ANTLR start "rule__GenBlock__Group__1"
    // InternalLibrettoProjectProfile.g:2142:1: rule__GenBlock__Group__1 : rule__GenBlock__Group__1__Impl rule__GenBlock__Group__2 ;
    public final void rule__GenBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2146:1: ( rule__GenBlock__Group__1__Impl rule__GenBlock__Group__2 )
            // InternalLibrettoProjectProfile.g:2147:2: rule__GenBlock__Group__1__Impl rule__GenBlock__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__GenBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GenBlock__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenBlock__Group__1"


    // $ANTLR start "rule__GenBlock__Group__1__Impl"
    // InternalLibrettoProjectProfile.g:2154:1: rule__GenBlock__Group__1__Impl : ( 'gen' ) ;
    public final void rule__GenBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2158:1: ( ( 'gen' ) )
            // InternalLibrettoProjectProfile.g:2159:1: ( 'gen' )
            {
            // InternalLibrettoProjectProfile.g:2159:1: ( 'gen' )
            // InternalLibrettoProjectProfile.g:2160:2: 'gen'
            {
             before(grammarAccess.getGenBlockAccess().getGenKeyword_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getGenBlockAccess().getGenKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenBlock__Group__1__Impl"


    // $ANTLR start "rule__GenBlock__Group__2"
    // InternalLibrettoProjectProfile.g:2169:1: rule__GenBlock__Group__2 : rule__GenBlock__Group__2__Impl rule__GenBlock__Group__3 ;
    public final void rule__GenBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2173:1: ( rule__GenBlock__Group__2__Impl rule__GenBlock__Group__3 )
            // InternalLibrettoProjectProfile.g:2174:2: rule__GenBlock__Group__2__Impl rule__GenBlock__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__GenBlock__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GenBlock__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenBlock__Group__2"


    // $ANTLR start "rule__GenBlock__Group__2__Impl"
    // InternalLibrettoProjectProfile.g:2181:1: rule__GenBlock__Group__2__Impl : ( '{' ) ;
    public final void rule__GenBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2185:1: ( ( '{' ) )
            // InternalLibrettoProjectProfile.g:2186:1: ( '{' )
            {
            // InternalLibrettoProjectProfile.g:2186:1: ( '{' )
            // InternalLibrettoProjectProfile.g:2187:2: '{'
            {
             before(grammarAccess.getGenBlockAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getGenBlockAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenBlock__Group__2__Impl"


    // $ANTLR start "rule__GenBlock__Group__3"
    // InternalLibrettoProjectProfile.g:2196:1: rule__GenBlock__Group__3 : rule__GenBlock__Group__3__Impl rule__GenBlock__Group__4 ;
    public final void rule__GenBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2200:1: ( rule__GenBlock__Group__3__Impl rule__GenBlock__Group__4 )
            // InternalLibrettoProjectProfile.g:2201:2: rule__GenBlock__Group__3__Impl rule__GenBlock__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__GenBlock__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GenBlock__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenBlock__Group__3"


    // $ANTLR start "rule__GenBlock__Group__3__Impl"
    // InternalLibrettoProjectProfile.g:2208:1: rule__GenBlock__Group__3__Impl : ( ( rule__GenBlock__Alternatives_3 )* ) ;
    public final void rule__GenBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2212:1: ( ( ( rule__GenBlock__Alternatives_3 )* ) )
            // InternalLibrettoProjectProfile.g:2213:1: ( ( rule__GenBlock__Alternatives_3 )* )
            {
            // InternalLibrettoProjectProfile.g:2213:1: ( ( rule__GenBlock__Alternatives_3 )* )
            // InternalLibrettoProjectProfile.g:2214:2: ( rule__GenBlock__Alternatives_3 )*
            {
             before(grammarAccess.getGenBlockAccess().getAlternatives_3()); 
            // InternalLibrettoProjectProfile.g:2215:2: ( rule__GenBlock__Alternatives_3 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=41 && LA23_0<=45)||LA23_0==57) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:2215:3: rule__GenBlock__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__GenBlock__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getGenBlockAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenBlock__Group__3__Impl"


    // $ANTLR start "rule__GenBlock__Group__4"
    // InternalLibrettoProjectProfile.g:2223:1: rule__GenBlock__Group__4 : rule__GenBlock__Group__4__Impl ;
    public final void rule__GenBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2227:1: ( rule__GenBlock__Group__4__Impl )
            // InternalLibrettoProjectProfile.g:2228:2: rule__GenBlock__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GenBlock__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenBlock__Group__4"


    // $ANTLR start "rule__GenBlock__Group__4__Impl"
    // InternalLibrettoProjectProfile.g:2234:1: rule__GenBlock__Group__4__Impl : ( '}' ) ;
    public final void rule__GenBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2238:1: ( ( '}' ) )
            // InternalLibrettoProjectProfile.g:2239:1: ( '}' )
            {
            // InternalLibrettoProjectProfile.g:2239:1: ( '}' )
            // InternalLibrettoProjectProfile.g:2240:2: '}'
            {
             before(grammarAccess.getGenBlockAccess().getRightCurlyBracketKeyword_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getGenBlockAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenBlock__Group__4__Impl"


    // $ANTLR start "rule__GenBlock__Group_3_0__0"
    // InternalLibrettoProjectProfile.g:2250:1: rule__GenBlock__Group_3_0__0 : rule__GenBlock__Group_3_0__0__Impl rule__GenBlock__Group_3_0__1 ;
    public final void rule__GenBlock__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2254:1: ( rule__GenBlock__Group_3_0__0__Impl rule__GenBlock__Group_3_0__1 )
            // InternalLibrettoProjectProfile.g:2255:2: rule__GenBlock__Group_3_0__0__Impl rule__GenBlock__Group_3_0__1
            {
            pushFollow(FOLLOW_11);
            rule__GenBlock__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GenBlock__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenBlock__Group_3_0__0"


    // $ANTLR start "rule__GenBlock__Group_3_0__0__Impl"
    // InternalLibrettoProjectProfile.g:2262:1: rule__GenBlock__Group_3_0__0__Impl : ( 'initialInstruction' ) ;
    public final void rule__GenBlock__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2266:1: ( ( 'initialInstruction' ) )
            // InternalLibrettoProjectProfile.g:2267:1: ( 'initialInstruction' )
            {
            // InternalLibrettoProjectProfile.g:2267:1: ( 'initialInstruction' )
            // InternalLibrettoProjectProfile.g:2268:2: 'initialInstruction'
            {
             before(grammarAccess.getGenBlockAccess().getInitialInstructionKeyword_3_0_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getGenBlockAccess().getInitialInstructionKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenBlock__Group_3_0__0__Impl"


    // $ANTLR start "rule__GenBlock__Group_3_0__1"
    // InternalLibrettoProjectProfile.g:2277:1: rule__GenBlock__Group_3_0__1 : rule__GenBlock__Group_3_0__1__Impl ;
    public final void rule__GenBlock__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2281:1: ( rule__GenBlock__Group_3_0__1__Impl )
            // InternalLibrettoProjectProfile.g:2282:2: rule__GenBlock__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GenBlock__Group_3_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenBlock__Group_3_0__1"


    // $ANTLR start "rule__GenBlock__Group_3_0__1__Impl"
    // InternalLibrettoProjectProfile.g:2288:1: rule__GenBlock__Group_3_0__1__Impl : ( ( rule__GenBlock__InitialInstructionsAssignment_3_0_1 ) ) ;
    public final void rule__GenBlock__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2292:1: ( ( ( rule__GenBlock__InitialInstructionsAssignment_3_0_1 ) ) )
            // InternalLibrettoProjectProfile.g:2293:1: ( ( rule__GenBlock__InitialInstructionsAssignment_3_0_1 ) )
            {
            // InternalLibrettoProjectProfile.g:2293:1: ( ( rule__GenBlock__InitialInstructionsAssignment_3_0_1 ) )
            // InternalLibrettoProjectProfile.g:2294:2: ( rule__GenBlock__InitialInstructionsAssignment_3_0_1 )
            {
             before(grammarAccess.getGenBlockAccess().getInitialInstructionsAssignment_3_0_1()); 
            // InternalLibrettoProjectProfile.g:2295:2: ( rule__GenBlock__InitialInstructionsAssignment_3_0_1 )
            // InternalLibrettoProjectProfile.g:2295:3: rule__GenBlock__InitialInstructionsAssignment_3_0_1
            {
            pushFollow(FOLLOW_2);
            rule__GenBlock__InitialInstructionsAssignment_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getGenBlockAccess().getInitialInstructionsAssignment_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenBlock__Group_3_0__1__Impl"


    // $ANTLR start "rule__GenBlock__Group_3_1__0"
    // InternalLibrettoProjectProfile.g:2304:1: rule__GenBlock__Group_3_1__0 : rule__GenBlock__Group_3_1__0__Impl rule__GenBlock__Group_3_1__1 ;
    public final void rule__GenBlock__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2308:1: ( rule__GenBlock__Group_3_1__0__Impl rule__GenBlock__Group_3_1__1 )
            // InternalLibrettoProjectProfile.g:2309:2: rule__GenBlock__Group_3_1__0__Impl rule__GenBlock__Group_3_1__1
            {
            pushFollow(FOLLOW_20);
            rule__GenBlock__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GenBlock__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenBlock__Group_3_1__0"


    // $ANTLR start "rule__GenBlock__Group_3_1__0__Impl"
    // InternalLibrettoProjectProfile.g:2316:1: rule__GenBlock__Group_3_1__0__Impl : ( 'maxRetries' ) ;
    public final void rule__GenBlock__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2320:1: ( ( 'maxRetries' ) )
            // InternalLibrettoProjectProfile.g:2321:1: ( 'maxRetries' )
            {
            // InternalLibrettoProjectProfile.g:2321:1: ( 'maxRetries' )
            // InternalLibrettoProjectProfile.g:2322:2: 'maxRetries'
            {
             before(grammarAccess.getGenBlockAccess().getMaxRetriesKeyword_3_1_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getGenBlockAccess().getMaxRetriesKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenBlock__Group_3_1__0__Impl"


    // $ANTLR start "rule__GenBlock__Group_3_1__1"
    // InternalLibrettoProjectProfile.g:2331:1: rule__GenBlock__Group_3_1__1 : rule__GenBlock__Group_3_1__1__Impl ;
    public final void rule__GenBlock__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2335:1: ( rule__GenBlock__Group_3_1__1__Impl )
            // InternalLibrettoProjectProfile.g:2336:2: rule__GenBlock__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GenBlock__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenBlock__Group_3_1__1"


    // $ANTLR start "rule__GenBlock__Group_3_1__1__Impl"
    // InternalLibrettoProjectProfile.g:2342:1: rule__GenBlock__Group_3_1__1__Impl : ( ( rule__GenBlock__MaxRetriesAssignment_3_1_1 ) ) ;
    public final void rule__GenBlock__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2346:1: ( ( ( rule__GenBlock__MaxRetriesAssignment_3_1_1 ) ) )
            // InternalLibrettoProjectProfile.g:2347:1: ( ( rule__GenBlock__MaxRetriesAssignment_3_1_1 ) )
            {
            // InternalLibrettoProjectProfile.g:2347:1: ( ( rule__GenBlock__MaxRetriesAssignment_3_1_1 ) )
            // InternalLibrettoProjectProfile.g:2348:2: ( rule__GenBlock__MaxRetriesAssignment_3_1_1 )
            {
             before(grammarAccess.getGenBlockAccess().getMaxRetriesAssignment_3_1_1()); 
            // InternalLibrettoProjectProfile.g:2349:2: ( rule__GenBlock__MaxRetriesAssignment_3_1_1 )
            // InternalLibrettoProjectProfile.g:2349:3: rule__GenBlock__MaxRetriesAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__GenBlock__MaxRetriesAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getGenBlockAccess().getMaxRetriesAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenBlock__Group_3_1__1__Impl"


    // $ANTLR start "rule__GenBlock__Group_3_2__0"
    // InternalLibrettoProjectProfile.g:2358:1: rule__GenBlock__Group_3_2__0 : rule__GenBlock__Group_3_2__0__Impl rule__GenBlock__Group_3_2__1 ;
    public final void rule__GenBlock__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2362:1: ( rule__GenBlock__Group_3_2__0__Impl rule__GenBlock__Group_3_2__1 )
            // InternalLibrettoProjectProfile.g:2363:2: rule__GenBlock__Group_3_2__0__Impl rule__GenBlock__Group_3_2__1
            {
            pushFollow(FOLLOW_21);
            rule__GenBlock__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GenBlock__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenBlock__Group_3_2__0"


    // $ANTLR start "rule__GenBlock__Group_3_2__0__Impl"
    // InternalLibrettoProjectProfile.g:2370:1: rule__GenBlock__Group_3_2__0__Impl : ( 'parseCheck' ) ;
    public final void rule__GenBlock__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2374:1: ( ( 'parseCheck' ) )
            // InternalLibrettoProjectProfile.g:2375:1: ( 'parseCheck' )
            {
            // InternalLibrettoProjectProfile.g:2375:1: ( 'parseCheck' )
            // InternalLibrettoProjectProfile.g:2376:2: 'parseCheck'
            {
             before(grammarAccess.getGenBlockAccess().getParseCheckKeyword_3_2_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getGenBlockAccess().getParseCheckKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenBlock__Group_3_2__0__Impl"


    // $ANTLR start "rule__GenBlock__Group_3_2__1"
    // InternalLibrettoProjectProfile.g:2385:1: rule__GenBlock__Group_3_2__1 : rule__GenBlock__Group_3_2__1__Impl ;
    public final void rule__GenBlock__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2389:1: ( rule__GenBlock__Group_3_2__1__Impl )
            // InternalLibrettoProjectProfile.g:2390:2: rule__GenBlock__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GenBlock__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenBlock__Group_3_2__1"


    // $ANTLR start "rule__GenBlock__Group_3_2__1__Impl"
    // InternalLibrettoProjectProfile.g:2396:1: rule__GenBlock__Group_3_2__1__Impl : ( ( rule__GenBlock__ParseChecksAssignment_3_2_1 ) ) ;
    public final void rule__GenBlock__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2400:1: ( ( ( rule__GenBlock__ParseChecksAssignment_3_2_1 ) ) )
            // InternalLibrettoProjectProfile.g:2401:1: ( ( rule__GenBlock__ParseChecksAssignment_3_2_1 ) )
            {
            // InternalLibrettoProjectProfile.g:2401:1: ( ( rule__GenBlock__ParseChecksAssignment_3_2_1 ) )
            // InternalLibrettoProjectProfile.g:2402:2: ( rule__GenBlock__ParseChecksAssignment_3_2_1 )
            {
             before(grammarAccess.getGenBlockAccess().getParseChecksAssignment_3_2_1()); 
            // InternalLibrettoProjectProfile.g:2403:2: ( rule__GenBlock__ParseChecksAssignment_3_2_1 )
            // InternalLibrettoProjectProfile.g:2403:3: rule__GenBlock__ParseChecksAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__GenBlock__ParseChecksAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getGenBlockAccess().getParseChecksAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenBlock__Group_3_2__1__Impl"


    // $ANTLR start "rule__GenBlock__Group_3_3__0"
    // InternalLibrettoProjectProfile.g:2412:1: rule__GenBlock__Group_3_3__0 : rule__GenBlock__Group_3_3__0__Impl rule__GenBlock__Group_3_3__1 ;
    public final void rule__GenBlock__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2416:1: ( rule__GenBlock__Group_3_3__0__Impl rule__GenBlock__Group_3_3__1 )
            // InternalLibrettoProjectProfile.g:2417:2: rule__GenBlock__Group_3_3__0__Impl rule__GenBlock__Group_3_3__1
            {
            pushFollow(FOLLOW_11);
            rule__GenBlock__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GenBlock__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenBlock__Group_3_3__0"


    // $ANTLR start "rule__GenBlock__Group_3_3__0__Impl"
    // InternalLibrettoProjectProfile.g:2424:1: rule__GenBlock__Group_3_3__0__Impl : ( 'defaultCorrection' ) ;
    public final void rule__GenBlock__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2428:1: ( ( 'defaultCorrection' ) )
            // InternalLibrettoProjectProfile.g:2429:1: ( 'defaultCorrection' )
            {
            // InternalLibrettoProjectProfile.g:2429:1: ( 'defaultCorrection' )
            // InternalLibrettoProjectProfile.g:2430:2: 'defaultCorrection'
            {
             before(grammarAccess.getGenBlockAccess().getDefaultCorrectionKeyword_3_3_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getGenBlockAccess().getDefaultCorrectionKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenBlock__Group_3_3__0__Impl"


    // $ANTLR start "rule__GenBlock__Group_3_3__1"
    // InternalLibrettoProjectProfile.g:2439:1: rule__GenBlock__Group_3_3__1 : rule__GenBlock__Group_3_3__1__Impl ;
    public final void rule__GenBlock__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2443:1: ( rule__GenBlock__Group_3_3__1__Impl )
            // InternalLibrettoProjectProfile.g:2444:2: rule__GenBlock__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GenBlock__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenBlock__Group_3_3__1"


    // $ANTLR start "rule__GenBlock__Group_3_3__1__Impl"
    // InternalLibrettoProjectProfile.g:2450:1: rule__GenBlock__Group_3_3__1__Impl : ( ( rule__GenBlock__DefaultCorrectionsAssignment_3_3_1 ) ) ;
    public final void rule__GenBlock__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2454:1: ( ( ( rule__GenBlock__DefaultCorrectionsAssignment_3_3_1 ) ) )
            // InternalLibrettoProjectProfile.g:2455:1: ( ( rule__GenBlock__DefaultCorrectionsAssignment_3_3_1 ) )
            {
            // InternalLibrettoProjectProfile.g:2455:1: ( ( rule__GenBlock__DefaultCorrectionsAssignment_3_3_1 ) )
            // InternalLibrettoProjectProfile.g:2456:2: ( rule__GenBlock__DefaultCorrectionsAssignment_3_3_1 )
            {
             before(grammarAccess.getGenBlockAccess().getDefaultCorrectionsAssignment_3_3_1()); 
            // InternalLibrettoProjectProfile.g:2457:2: ( rule__GenBlock__DefaultCorrectionsAssignment_3_3_1 )
            // InternalLibrettoProjectProfile.g:2457:3: rule__GenBlock__DefaultCorrectionsAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__GenBlock__DefaultCorrectionsAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getGenBlockAccess().getDefaultCorrectionsAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenBlock__Group_3_3__1__Impl"


    // $ANTLR start "rule__GenRemediationRules__Group__0"
    // InternalLibrettoProjectProfile.g:2466:1: rule__GenRemediationRules__Group__0 : rule__GenRemediationRules__Group__0__Impl rule__GenRemediationRules__Group__1 ;
    public final void rule__GenRemediationRules__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2470:1: ( rule__GenRemediationRules__Group__0__Impl rule__GenRemediationRules__Group__1 )
            // InternalLibrettoProjectProfile.g:2471:2: rule__GenRemediationRules__Group__0__Impl rule__GenRemediationRules__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__GenRemediationRules__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GenRemediationRules__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenRemediationRules__Group__0"


    // $ANTLR start "rule__GenRemediationRules__Group__0__Impl"
    // InternalLibrettoProjectProfile.g:2478:1: rule__GenRemediationRules__Group__0__Impl : ( () ) ;
    public final void rule__GenRemediationRules__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2482:1: ( ( () ) )
            // InternalLibrettoProjectProfile.g:2483:1: ( () )
            {
            // InternalLibrettoProjectProfile.g:2483:1: ( () )
            // InternalLibrettoProjectProfile.g:2484:2: ()
            {
             before(grammarAccess.getGenRemediationRulesAccess().getGenRemediationRulesAction_0()); 
            // InternalLibrettoProjectProfile.g:2485:2: ()
            // InternalLibrettoProjectProfile.g:2485:3: 
            {
            }

             after(grammarAccess.getGenRemediationRulesAccess().getGenRemediationRulesAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenRemediationRules__Group__0__Impl"


    // $ANTLR start "rule__GenRemediationRules__Group__1"
    // InternalLibrettoProjectProfile.g:2493:1: rule__GenRemediationRules__Group__1 : rule__GenRemediationRules__Group__1__Impl rule__GenRemediationRules__Group__2 ;
    public final void rule__GenRemediationRules__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2497:1: ( rule__GenRemediationRules__Group__1__Impl rule__GenRemediationRules__Group__2 )
            // InternalLibrettoProjectProfile.g:2498:2: rule__GenRemediationRules__Group__1__Impl rule__GenRemediationRules__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__GenRemediationRules__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GenRemediationRules__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenRemediationRules__Group__1"


    // $ANTLR start "rule__GenRemediationRules__Group__1__Impl"
    // InternalLibrettoProjectProfile.g:2505:1: rule__GenRemediationRules__Group__1__Impl : ( 'rules' ) ;
    public final void rule__GenRemediationRules__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2509:1: ( ( 'rules' ) )
            // InternalLibrettoProjectProfile.g:2510:1: ( 'rules' )
            {
            // InternalLibrettoProjectProfile.g:2510:1: ( 'rules' )
            // InternalLibrettoProjectProfile.g:2511:2: 'rules'
            {
             before(grammarAccess.getGenRemediationRulesAccess().getRulesKeyword_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getGenRemediationRulesAccess().getRulesKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenRemediationRules__Group__1__Impl"


    // $ANTLR start "rule__GenRemediationRules__Group__2"
    // InternalLibrettoProjectProfile.g:2520:1: rule__GenRemediationRules__Group__2 : rule__GenRemediationRules__Group__2__Impl rule__GenRemediationRules__Group__3 ;
    public final void rule__GenRemediationRules__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2524:1: ( rule__GenRemediationRules__Group__2__Impl rule__GenRemediationRules__Group__3 )
            // InternalLibrettoProjectProfile.g:2525:2: rule__GenRemediationRules__Group__2__Impl rule__GenRemediationRules__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__GenRemediationRules__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GenRemediationRules__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenRemediationRules__Group__2"


    // $ANTLR start "rule__GenRemediationRules__Group__2__Impl"
    // InternalLibrettoProjectProfile.g:2532:1: rule__GenRemediationRules__Group__2__Impl : ( '{' ) ;
    public final void rule__GenRemediationRules__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2536:1: ( ( '{' ) )
            // InternalLibrettoProjectProfile.g:2537:1: ( '{' )
            {
            // InternalLibrettoProjectProfile.g:2537:1: ( '{' )
            // InternalLibrettoProjectProfile.g:2538:2: '{'
            {
             before(grammarAccess.getGenRemediationRulesAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getGenRemediationRulesAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenRemediationRules__Group__2__Impl"


    // $ANTLR start "rule__GenRemediationRules__Group__3"
    // InternalLibrettoProjectProfile.g:2547:1: rule__GenRemediationRules__Group__3 : rule__GenRemediationRules__Group__3__Impl rule__GenRemediationRules__Group__4 ;
    public final void rule__GenRemediationRules__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2551:1: ( rule__GenRemediationRules__Group__3__Impl rule__GenRemediationRules__Group__4 )
            // InternalLibrettoProjectProfile.g:2552:2: rule__GenRemediationRules__Group__3__Impl rule__GenRemediationRules__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__GenRemediationRules__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GenRemediationRules__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenRemediationRules__Group__3"


    // $ANTLR start "rule__GenRemediationRules__Group__3__Impl"
    // InternalLibrettoProjectProfile.g:2559:1: rule__GenRemediationRules__Group__3__Impl : ( ( rule__GenRemediationRules__Group_3__0 )* ) ;
    public final void rule__GenRemediationRules__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2563:1: ( ( ( rule__GenRemediationRules__Group_3__0 )* ) )
            // InternalLibrettoProjectProfile.g:2564:1: ( ( rule__GenRemediationRules__Group_3__0 )* )
            {
            // InternalLibrettoProjectProfile.g:2564:1: ( ( rule__GenRemediationRules__Group_3__0 )* )
            // InternalLibrettoProjectProfile.g:2565:2: ( rule__GenRemediationRules__Group_3__0 )*
            {
             before(grammarAccess.getGenRemediationRulesAccess().getGroup_3()); 
            // InternalLibrettoProjectProfile.g:2566:2: ( rule__GenRemediationRules__Group_3__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==46) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:2566:3: rule__GenRemediationRules__Group_3__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__GenRemediationRules__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getGenRemediationRulesAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenRemediationRules__Group__3__Impl"


    // $ANTLR start "rule__GenRemediationRules__Group__4"
    // InternalLibrettoProjectProfile.g:2574:1: rule__GenRemediationRules__Group__4 : rule__GenRemediationRules__Group__4__Impl ;
    public final void rule__GenRemediationRules__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2578:1: ( rule__GenRemediationRules__Group__4__Impl )
            // InternalLibrettoProjectProfile.g:2579:2: rule__GenRemediationRules__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GenRemediationRules__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenRemediationRules__Group__4"


    // $ANTLR start "rule__GenRemediationRules__Group__4__Impl"
    // InternalLibrettoProjectProfile.g:2585:1: rule__GenRemediationRules__Group__4__Impl : ( '}' ) ;
    public final void rule__GenRemediationRules__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2589:1: ( ( '}' ) )
            // InternalLibrettoProjectProfile.g:2590:1: ( '}' )
            {
            // InternalLibrettoProjectProfile.g:2590:1: ( '}' )
            // InternalLibrettoProjectProfile.g:2591:2: '}'
            {
             before(grammarAccess.getGenRemediationRulesAccess().getRightCurlyBracketKeyword_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getGenRemediationRulesAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenRemediationRules__Group__4__Impl"


    // $ANTLR start "rule__GenRemediationRules__Group_3__0"
    // InternalLibrettoProjectProfile.g:2601:1: rule__GenRemediationRules__Group_3__0 : rule__GenRemediationRules__Group_3__0__Impl rule__GenRemediationRules__Group_3__1 ;
    public final void rule__GenRemediationRules__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2605:1: ( rule__GenRemediationRules__Group_3__0__Impl rule__GenRemediationRules__Group_3__1 )
            // InternalLibrettoProjectProfile.g:2606:2: rule__GenRemediationRules__Group_3__0__Impl rule__GenRemediationRules__Group_3__1
            {
            pushFollow(FOLLOW_25);
            rule__GenRemediationRules__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GenRemediationRules__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenRemediationRules__Group_3__0"


    // $ANTLR start "rule__GenRemediationRules__Group_3__0__Impl"
    // InternalLibrettoProjectProfile.g:2613:1: rule__GenRemediationRules__Group_3__0__Impl : ( ( rule__GenRemediationRules__PatternRulesAssignment_3_0 ) ) ;
    public final void rule__GenRemediationRules__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2617:1: ( ( ( rule__GenRemediationRules__PatternRulesAssignment_3_0 ) ) )
            // InternalLibrettoProjectProfile.g:2618:1: ( ( rule__GenRemediationRules__PatternRulesAssignment_3_0 ) )
            {
            // InternalLibrettoProjectProfile.g:2618:1: ( ( rule__GenRemediationRules__PatternRulesAssignment_3_0 ) )
            // InternalLibrettoProjectProfile.g:2619:2: ( rule__GenRemediationRules__PatternRulesAssignment_3_0 )
            {
             before(grammarAccess.getGenRemediationRulesAccess().getPatternRulesAssignment_3_0()); 
            // InternalLibrettoProjectProfile.g:2620:2: ( rule__GenRemediationRules__PatternRulesAssignment_3_0 )
            // InternalLibrettoProjectProfile.g:2620:3: rule__GenRemediationRules__PatternRulesAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__GenRemediationRules__PatternRulesAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getGenRemediationRulesAccess().getPatternRulesAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenRemediationRules__Group_3__0__Impl"


    // $ANTLR start "rule__GenRemediationRules__Group_3__1"
    // InternalLibrettoProjectProfile.g:2628:1: rule__GenRemediationRules__Group_3__1 : rule__GenRemediationRules__Group_3__1__Impl ;
    public final void rule__GenRemediationRules__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2632:1: ( rule__GenRemediationRules__Group_3__1__Impl )
            // InternalLibrettoProjectProfile.g:2633:2: rule__GenRemediationRules__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GenRemediationRules__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenRemediationRules__Group_3__1"


    // $ANTLR start "rule__GenRemediationRules__Group_3__1__Impl"
    // InternalLibrettoProjectProfile.g:2639:1: rule__GenRemediationRules__Group_3__1__Impl : ( ( rule__GenRemediationRules__DefaultRemediationsAssignment_3_1 ) ) ;
    public final void rule__GenRemediationRules__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2643:1: ( ( ( rule__GenRemediationRules__DefaultRemediationsAssignment_3_1 ) ) )
            // InternalLibrettoProjectProfile.g:2644:1: ( ( rule__GenRemediationRules__DefaultRemediationsAssignment_3_1 ) )
            {
            // InternalLibrettoProjectProfile.g:2644:1: ( ( rule__GenRemediationRules__DefaultRemediationsAssignment_3_1 ) )
            // InternalLibrettoProjectProfile.g:2645:2: ( rule__GenRemediationRules__DefaultRemediationsAssignment_3_1 )
            {
             before(grammarAccess.getGenRemediationRulesAccess().getDefaultRemediationsAssignment_3_1()); 
            // InternalLibrettoProjectProfile.g:2646:2: ( rule__GenRemediationRules__DefaultRemediationsAssignment_3_1 )
            // InternalLibrettoProjectProfile.g:2646:3: rule__GenRemediationRules__DefaultRemediationsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__GenRemediationRules__DefaultRemediationsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getGenRemediationRulesAccess().getDefaultRemediationsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenRemediationRules__Group_3__1__Impl"


    // $ANTLR start "rule__GenPatternRemediationRule__Group__0"
    // InternalLibrettoProjectProfile.g:2655:1: rule__GenPatternRemediationRule__Group__0 : rule__GenPatternRemediationRule__Group__0__Impl rule__GenPatternRemediationRule__Group__1 ;
    public final void rule__GenPatternRemediationRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2659:1: ( rule__GenPatternRemediationRule__Group__0__Impl rule__GenPatternRemediationRule__Group__1 )
            // InternalLibrettoProjectProfile.g:2660:2: rule__GenPatternRemediationRule__Group__0__Impl rule__GenPatternRemediationRule__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__GenPatternRemediationRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GenPatternRemediationRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenPatternRemediationRule__Group__0"


    // $ANTLR start "rule__GenPatternRemediationRule__Group__0__Impl"
    // InternalLibrettoProjectProfile.g:2667:1: rule__GenPatternRemediationRule__Group__0__Impl : ( () ) ;
    public final void rule__GenPatternRemediationRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2671:1: ( ( () ) )
            // InternalLibrettoProjectProfile.g:2672:1: ( () )
            {
            // InternalLibrettoProjectProfile.g:2672:1: ( () )
            // InternalLibrettoProjectProfile.g:2673:2: ()
            {
             before(grammarAccess.getGenPatternRemediationRuleAccess().getGenPatternRemediationRuleAction_0()); 
            // InternalLibrettoProjectProfile.g:2674:2: ()
            // InternalLibrettoProjectProfile.g:2674:3: 
            {
            }

             after(grammarAccess.getGenPatternRemediationRuleAccess().getGenPatternRemediationRuleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenPatternRemediationRule__Group__0__Impl"


    // $ANTLR start "rule__GenPatternRemediationRule__Group__1"
    // InternalLibrettoProjectProfile.g:2682:1: rule__GenPatternRemediationRule__Group__1 : rule__GenPatternRemediationRule__Group__1__Impl rule__GenPatternRemediationRule__Group__2 ;
    public final void rule__GenPatternRemediationRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2686:1: ( rule__GenPatternRemediationRule__Group__1__Impl rule__GenPatternRemediationRule__Group__2 )
            // InternalLibrettoProjectProfile.g:2687:2: rule__GenPatternRemediationRule__Group__1__Impl rule__GenPatternRemediationRule__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__GenPatternRemediationRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GenPatternRemediationRule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenPatternRemediationRule__Group__1"


    // $ANTLR start "rule__GenPatternRemediationRule__Group__1__Impl"
    // InternalLibrettoProjectProfile.g:2694:1: rule__GenPatternRemediationRule__Group__1__Impl : ( 'rule' ) ;
    public final void rule__GenPatternRemediationRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2698:1: ( ( 'rule' ) )
            // InternalLibrettoProjectProfile.g:2699:1: ( 'rule' )
            {
            // InternalLibrettoProjectProfile.g:2699:1: ( 'rule' )
            // InternalLibrettoProjectProfile.g:2700:2: 'rule'
            {
             before(grammarAccess.getGenPatternRemediationRuleAccess().getRuleKeyword_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getGenPatternRemediationRuleAccess().getRuleKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenPatternRemediationRule__Group__1__Impl"


    // $ANTLR start "rule__GenPatternRemediationRule__Group__2"
    // InternalLibrettoProjectProfile.g:2709:1: rule__GenPatternRemediationRule__Group__2 : rule__GenPatternRemediationRule__Group__2__Impl rule__GenPatternRemediationRule__Group__3 ;
    public final void rule__GenPatternRemediationRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2713:1: ( rule__GenPatternRemediationRule__Group__2__Impl rule__GenPatternRemediationRule__Group__3 )
            // InternalLibrettoProjectProfile.g:2714:2: rule__GenPatternRemediationRule__Group__2__Impl rule__GenPatternRemediationRule__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__GenPatternRemediationRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GenPatternRemediationRule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenPatternRemediationRule__Group__2"


    // $ANTLR start "rule__GenPatternRemediationRule__Group__2__Impl"
    // InternalLibrettoProjectProfile.g:2721:1: rule__GenPatternRemediationRule__Group__2__Impl : ( '{' ) ;
    public final void rule__GenPatternRemediationRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2725:1: ( ( '{' ) )
            // InternalLibrettoProjectProfile.g:2726:1: ( '{' )
            {
            // InternalLibrettoProjectProfile.g:2726:1: ( '{' )
            // InternalLibrettoProjectProfile.g:2727:2: '{'
            {
             before(grammarAccess.getGenPatternRemediationRuleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getGenPatternRemediationRuleAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenPatternRemediationRule__Group__2__Impl"


    // $ANTLR start "rule__GenPatternRemediationRule__Group__3"
    // InternalLibrettoProjectProfile.g:2736:1: rule__GenPatternRemediationRule__Group__3 : rule__GenPatternRemediationRule__Group__3__Impl rule__GenPatternRemediationRule__Group__4 ;
    public final void rule__GenPatternRemediationRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2740:1: ( rule__GenPatternRemediationRule__Group__3__Impl rule__GenPatternRemediationRule__Group__4 )
            // InternalLibrettoProjectProfile.g:2741:2: rule__GenPatternRemediationRule__Group__3__Impl rule__GenPatternRemediationRule__Group__4
            {
            pushFollow(FOLLOW_27);
            rule__GenPatternRemediationRule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GenPatternRemediationRule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenPatternRemediationRule__Group__3"


    // $ANTLR start "rule__GenPatternRemediationRule__Group__3__Impl"
    // InternalLibrettoProjectProfile.g:2748:1: rule__GenPatternRemediationRule__Group__3__Impl : ( ( rule__GenPatternRemediationRule__Alternatives_3 )* ) ;
    public final void rule__GenPatternRemediationRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2752:1: ( ( ( rule__GenPatternRemediationRule__Alternatives_3 )* ) )
            // InternalLibrettoProjectProfile.g:2753:1: ( ( rule__GenPatternRemediationRule__Alternatives_3 )* )
            {
            // InternalLibrettoProjectProfile.g:2753:1: ( ( rule__GenPatternRemediationRule__Alternatives_3 )* )
            // InternalLibrettoProjectProfile.g:2754:2: ( rule__GenPatternRemediationRule__Alternatives_3 )*
            {
             before(grammarAccess.getGenPatternRemediationRuleAccess().getAlternatives_3()); 
            // InternalLibrettoProjectProfile.g:2755:2: ( rule__GenPatternRemediationRule__Alternatives_3 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=47 && LA25_0<=49)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:2755:3: rule__GenPatternRemediationRule__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__GenPatternRemediationRule__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getGenPatternRemediationRuleAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenPatternRemediationRule__Group__3__Impl"


    // $ANTLR start "rule__GenPatternRemediationRule__Group__4"
    // InternalLibrettoProjectProfile.g:2763:1: rule__GenPatternRemediationRule__Group__4 : rule__GenPatternRemediationRule__Group__4__Impl ;
    public final void rule__GenPatternRemediationRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2767:1: ( rule__GenPatternRemediationRule__Group__4__Impl )
            // InternalLibrettoProjectProfile.g:2768:2: rule__GenPatternRemediationRule__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GenPatternRemediationRule__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenPatternRemediationRule__Group__4"


    // $ANTLR start "rule__GenPatternRemediationRule__Group__4__Impl"
    // InternalLibrettoProjectProfile.g:2774:1: rule__GenPatternRemediationRule__Group__4__Impl : ( '}' ) ;
    public final void rule__GenPatternRemediationRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2778:1: ( ( '}' ) )
            // InternalLibrettoProjectProfile.g:2779:1: ( '}' )
            {
            // InternalLibrettoProjectProfile.g:2779:1: ( '}' )
            // InternalLibrettoProjectProfile.g:2780:2: '}'
            {
             before(grammarAccess.getGenPatternRemediationRuleAccess().getRightCurlyBracketKeyword_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getGenPatternRemediationRuleAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenPatternRemediationRule__Group__4__Impl"


    // $ANTLR start "rule__GenPatternRemediationRule__Group_3_0__0"
    // InternalLibrettoProjectProfile.g:2790:1: rule__GenPatternRemediationRule__Group_3_0__0 : rule__GenPatternRemediationRule__Group_3_0__0__Impl rule__GenPatternRemediationRule__Group_3_0__1 ;
    public final void rule__GenPatternRemediationRule__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2794:1: ( rule__GenPatternRemediationRule__Group_3_0__0__Impl rule__GenPatternRemediationRule__Group_3_0__1 )
            // InternalLibrettoProjectProfile.g:2795:2: rule__GenPatternRemediationRule__Group_3_0__0__Impl rule__GenPatternRemediationRule__Group_3_0__1
            {
            pushFollow(FOLLOW_11);
            rule__GenPatternRemediationRule__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GenPatternRemediationRule__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenPatternRemediationRule__Group_3_0__0"


    // $ANTLR start "rule__GenPatternRemediationRule__Group_3_0__0__Impl"
    // InternalLibrettoProjectProfile.g:2802:1: rule__GenPatternRemediationRule__Group_3_0__0__Impl : ( 'pattern' ) ;
    public final void rule__GenPatternRemediationRule__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2806:1: ( ( 'pattern' ) )
            // InternalLibrettoProjectProfile.g:2807:1: ( 'pattern' )
            {
            // InternalLibrettoProjectProfile.g:2807:1: ( 'pattern' )
            // InternalLibrettoProjectProfile.g:2808:2: 'pattern'
            {
             before(grammarAccess.getGenPatternRemediationRuleAccess().getPatternKeyword_3_0_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getGenPatternRemediationRuleAccess().getPatternKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenPatternRemediationRule__Group_3_0__0__Impl"


    // $ANTLR start "rule__GenPatternRemediationRule__Group_3_0__1"
    // InternalLibrettoProjectProfile.g:2817:1: rule__GenPatternRemediationRule__Group_3_0__1 : rule__GenPatternRemediationRule__Group_3_0__1__Impl ;
    public final void rule__GenPatternRemediationRule__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2821:1: ( rule__GenPatternRemediationRule__Group_3_0__1__Impl )
            // InternalLibrettoProjectProfile.g:2822:2: rule__GenPatternRemediationRule__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GenPatternRemediationRule__Group_3_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenPatternRemediationRule__Group_3_0__1"


    // $ANTLR start "rule__GenPatternRemediationRule__Group_3_0__1__Impl"
    // InternalLibrettoProjectProfile.g:2828:1: rule__GenPatternRemediationRule__Group_3_0__1__Impl : ( ( rule__GenPatternRemediationRule__PatternsAssignment_3_0_1 ) ) ;
    public final void rule__GenPatternRemediationRule__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2832:1: ( ( ( rule__GenPatternRemediationRule__PatternsAssignment_3_0_1 ) ) )
            // InternalLibrettoProjectProfile.g:2833:1: ( ( rule__GenPatternRemediationRule__PatternsAssignment_3_0_1 ) )
            {
            // InternalLibrettoProjectProfile.g:2833:1: ( ( rule__GenPatternRemediationRule__PatternsAssignment_3_0_1 ) )
            // InternalLibrettoProjectProfile.g:2834:2: ( rule__GenPatternRemediationRule__PatternsAssignment_3_0_1 )
            {
             before(grammarAccess.getGenPatternRemediationRuleAccess().getPatternsAssignment_3_0_1()); 
            // InternalLibrettoProjectProfile.g:2835:2: ( rule__GenPatternRemediationRule__PatternsAssignment_3_0_1 )
            // InternalLibrettoProjectProfile.g:2835:3: rule__GenPatternRemediationRule__PatternsAssignment_3_0_1
            {
            pushFollow(FOLLOW_2);
            rule__GenPatternRemediationRule__PatternsAssignment_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getGenPatternRemediationRuleAccess().getPatternsAssignment_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenPatternRemediationRule__Group_3_0__1__Impl"


    // $ANTLR start "rule__GenPatternRemediationRule__Group_3_1__0"
    // InternalLibrettoProjectProfile.g:2844:1: rule__GenPatternRemediationRule__Group_3_1__0 : rule__GenPatternRemediationRule__Group_3_1__0__Impl rule__GenPatternRemediationRule__Group_3_1__1 ;
    public final void rule__GenPatternRemediationRule__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2848:1: ( rule__GenPatternRemediationRule__Group_3_1__0__Impl rule__GenPatternRemediationRule__Group_3_1__1 )
            // InternalLibrettoProjectProfile.g:2849:2: rule__GenPatternRemediationRule__Group_3_1__0__Impl rule__GenPatternRemediationRule__Group_3_1__1
            {
            pushFollow(FOLLOW_11);
            rule__GenPatternRemediationRule__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GenPatternRemediationRule__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenPatternRemediationRule__Group_3_1__0"


    // $ANTLR start "rule__GenPatternRemediationRule__Group_3_1__0__Impl"
    // InternalLibrettoProjectProfile.g:2856:1: rule__GenPatternRemediationRule__Group_3_1__0__Impl : ( 'code' ) ;
    public final void rule__GenPatternRemediationRule__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2860:1: ( ( 'code' ) )
            // InternalLibrettoProjectProfile.g:2861:1: ( 'code' )
            {
            // InternalLibrettoProjectProfile.g:2861:1: ( 'code' )
            // InternalLibrettoProjectProfile.g:2862:2: 'code'
            {
             before(grammarAccess.getGenPatternRemediationRuleAccess().getCodeKeyword_3_1_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getGenPatternRemediationRuleAccess().getCodeKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenPatternRemediationRule__Group_3_1__0__Impl"


    // $ANTLR start "rule__GenPatternRemediationRule__Group_3_1__1"
    // InternalLibrettoProjectProfile.g:2871:1: rule__GenPatternRemediationRule__Group_3_1__1 : rule__GenPatternRemediationRule__Group_3_1__1__Impl ;
    public final void rule__GenPatternRemediationRule__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2875:1: ( rule__GenPatternRemediationRule__Group_3_1__1__Impl )
            // InternalLibrettoProjectProfile.g:2876:2: rule__GenPatternRemediationRule__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GenPatternRemediationRule__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenPatternRemediationRule__Group_3_1__1"


    // $ANTLR start "rule__GenPatternRemediationRule__Group_3_1__1__Impl"
    // InternalLibrettoProjectProfile.g:2882:1: rule__GenPatternRemediationRule__Group_3_1__1__Impl : ( ( rule__GenPatternRemediationRule__CodesAssignment_3_1_1 ) ) ;
    public final void rule__GenPatternRemediationRule__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2886:1: ( ( ( rule__GenPatternRemediationRule__CodesAssignment_3_1_1 ) ) )
            // InternalLibrettoProjectProfile.g:2887:1: ( ( rule__GenPatternRemediationRule__CodesAssignment_3_1_1 ) )
            {
            // InternalLibrettoProjectProfile.g:2887:1: ( ( rule__GenPatternRemediationRule__CodesAssignment_3_1_1 ) )
            // InternalLibrettoProjectProfile.g:2888:2: ( rule__GenPatternRemediationRule__CodesAssignment_3_1_1 )
            {
             before(grammarAccess.getGenPatternRemediationRuleAccess().getCodesAssignment_3_1_1()); 
            // InternalLibrettoProjectProfile.g:2889:2: ( rule__GenPatternRemediationRule__CodesAssignment_3_1_1 )
            // InternalLibrettoProjectProfile.g:2889:3: rule__GenPatternRemediationRule__CodesAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__GenPatternRemediationRule__CodesAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getGenPatternRemediationRuleAccess().getCodesAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenPatternRemediationRule__Group_3_1__1__Impl"


    // $ANTLR start "rule__GenPatternRemediationRule__Group_3_2__0"
    // InternalLibrettoProjectProfile.g:2898:1: rule__GenPatternRemediationRule__Group_3_2__0 : rule__GenPatternRemediationRule__Group_3_2__0__Impl rule__GenPatternRemediationRule__Group_3_2__1 ;
    public final void rule__GenPatternRemediationRule__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2902:1: ( rule__GenPatternRemediationRule__Group_3_2__0__Impl rule__GenPatternRemediationRule__Group_3_2__1 )
            // InternalLibrettoProjectProfile.g:2903:2: rule__GenPatternRemediationRule__Group_3_2__0__Impl rule__GenPatternRemediationRule__Group_3_2__1
            {
            pushFollow(FOLLOW_11);
            rule__GenPatternRemediationRule__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GenPatternRemediationRule__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenPatternRemediationRule__Group_3_2__0"


    // $ANTLR start "rule__GenPatternRemediationRule__Group_3_2__0__Impl"
    // InternalLibrettoProjectProfile.g:2910:1: rule__GenPatternRemediationRule__Group_3_2__0__Impl : ( 'correction' ) ;
    public final void rule__GenPatternRemediationRule__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2914:1: ( ( 'correction' ) )
            // InternalLibrettoProjectProfile.g:2915:1: ( 'correction' )
            {
            // InternalLibrettoProjectProfile.g:2915:1: ( 'correction' )
            // InternalLibrettoProjectProfile.g:2916:2: 'correction'
            {
             before(grammarAccess.getGenPatternRemediationRuleAccess().getCorrectionKeyword_3_2_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getGenPatternRemediationRuleAccess().getCorrectionKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenPatternRemediationRule__Group_3_2__0__Impl"


    // $ANTLR start "rule__GenPatternRemediationRule__Group_3_2__1"
    // InternalLibrettoProjectProfile.g:2925:1: rule__GenPatternRemediationRule__Group_3_2__1 : rule__GenPatternRemediationRule__Group_3_2__1__Impl ;
    public final void rule__GenPatternRemediationRule__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2929:1: ( rule__GenPatternRemediationRule__Group_3_2__1__Impl )
            // InternalLibrettoProjectProfile.g:2930:2: rule__GenPatternRemediationRule__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GenPatternRemediationRule__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenPatternRemediationRule__Group_3_2__1"


    // $ANTLR start "rule__GenPatternRemediationRule__Group_3_2__1__Impl"
    // InternalLibrettoProjectProfile.g:2936:1: rule__GenPatternRemediationRule__Group_3_2__1__Impl : ( ( rule__GenPatternRemediationRule__CorrectionsAssignment_3_2_1 ) ) ;
    public final void rule__GenPatternRemediationRule__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2940:1: ( ( ( rule__GenPatternRemediationRule__CorrectionsAssignment_3_2_1 ) ) )
            // InternalLibrettoProjectProfile.g:2941:1: ( ( rule__GenPatternRemediationRule__CorrectionsAssignment_3_2_1 ) )
            {
            // InternalLibrettoProjectProfile.g:2941:1: ( ( rule__GenPatternRemediationRule__CorrectionsAssignment_3_2_1 ) )
            // InternalLibrettoProjectProfile.g:2942:2: ( rule__GenPatternRemediationRule__CorrectionsAssignment_3_2_1 )
            {
             before(grammarAccess.getGenPatternRemediationRuleAccess().getCorrectionsAssignment_3_2_1()); 
            // InternalLibrettoProjectProfile.g:2943:2: ( rule__GenPatternRemediationRule__CorrectionsAssignment_3_2_1 )
            // InternalLibrettoProjectProfile.g:2943:3: rule__GenPatternRemediationRule__CorrectionsAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__GenPatternRemediationRule__CorrectionsAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getGenPatternRemediationRuleAccess().getCorrectionsAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenPatternRemediationRule__Group_3_2__1__Impl"


    // $ANTLR start "rule__GenDefaultRemediationRule__Group__0"
    // InternalLibrettoProjectProfile.g:2952:1: rule__GenDefaultRemediationRule__Group__0 : rule__GenDefaultRemediationRule__Group__0__Impl rule__GenDefaultRemediationRule__Group__1 ;
    public final void rule__GenDefaultRemediationRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2956:1: ( rule__GenDefaultRemediationRule__Group__0__Impl rule__GenDefaultRemediationRule__Group__1 )
            // InternalLibrettoProjectProfile.g:2957:2: rule__GenDefaultRemediationRule__Group__0__Impl rule__GenDefaultRemediationRule__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__GenDefaultRemediationRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GenDefaultRemediationRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenDefaultRemediationRule__Group__0"


    // $ANTLR start "rule__GenDefaultRemediationRule__Group__0__Impl"
    // InternalLibrettoProjectProfile.g:2964:1: rule__GenDefaultRemediationRule__Group__0__Impl : ( () ) ;
    public final void rule__GenDefaultRemediationRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2968:1: ( ( () ) )
            // InternalLibrettoProjectProfile.g:2969:1: ( () )
            {
            // InternalLibrettoProjectProfile.g:2969:1: ( () )
            // InternalLibrettoProjectProfile.g:2970:2: ()
            {
             before(grammarAccess.getGenDefaultRemediationRuleAccess().getGenDefaultRemediationRuleAction_0()); 
            // InternalLibrettoProjectProfile.g:2971:2: ()
            // InternalLibrettoProjectProfile.g:2971:3: 
            {
            }

             after(grammarAccess.getGenDefaultRemediationRuleAccess().getGenDefaultRemediationRuleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenDefaultRemediationRule__Group__0__Impl"


    // $ANTLR start "rule__GenDefaultRemediationRule__Group__1"
    // InternalLibrettoProjectProfile.g:2979:1: rule__GenDefaultRemediationRule__Group__1 : rule__GenDefaultRemediationRule__Group__1__Impl rule__GenDefaultRemediationRule__Group__2 ;
    public final void rule__GenDefaultRemediationRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2983:1: ( rule__GenDefaultRemediationRule__Group__1__Impl rule__GenDefaultRemediationRule__Group__2 )
            // InternalLibrettoProjectProfile.g:2984:2: rule__GenDefaultRemediationRule__Group__1__Impl rule__GenDefaultRemediationRule__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__GenDefaultRemediationRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GenDefaultRemediationRule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenDefaultRemediationRule__Group__1"


    // $ANTLR start "rule__GenDefaultRemediationRule__Group__1__Impl"
    // InternalLibrettoProjectProfile.g:2991:1: rule__GenDefaultRemediationRule__Group__1__Impl : ( 'default' ) ;
    public final void rule__GenDefaultRemediationRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2995:1: ( ( 'default' ) )
            // InternalLibrettoProjectProfile.g:2996:1: ( 'default' )
            {
            // InternalLibrettoProjectProfile.g:2996:1: ( 'default' )
            // InternalLibrettoProjectProfile.g:2997:2: 'default'
            {
             before(grammarAccess.getGenDefaultRemediationRuleAccess().getDefaultKeyword_1()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getGenDefaultRemediationRuleAccess().getDefaultKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenDefaultRemediationRule__Group__1__Impl"


    // $ANTLR start "rule__GenDefaultRemediationRule__Group__2"
    // InternalLibrettoProjectProfile.g:3006:1: rule__GenDefaultRemediationRule__Group__2 : rule__GenDefaultRemediationRule__Group__2__Impl rule__GenDefaultRemediationRule__Group__3 ;
    public final void rule__GenDefaultRemediationRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3010:1: ( rule__GenDefaultRemediationRule__Group__2__Impl rule__GenDefaultRemediationRule__Group__3 )
            // InternalLibrettoProjectProfile.g:3011:2: rule__GenDefaultRemediationRule__Group__2__Impl rule__GenDefaultRemediationRule__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__GenDefaultRemediationRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GenDefaultRemediationRule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenDefaultRemediationRule__Group__2"


    // $ANTLR start "rule__GenDefaultRemediationRule__Group__2__Impl"
    // InternalLibrettoProjectProfile.g:3018:1: rule__GenDefaultRemediationRule__Group__2__Impl : ( '{' ) ;
    public final void rule__GenDefaultRemediationRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3022:1: ( ( '{' ) )
            // InternalLibrettoProjectProfile.g:3023:1: ( '{' )
            {
            // InternalLibrettoProjectProfile.g:3023:1: ( '{' )
            // InternalLibrettoProjectProfile.g:3024:2: '{'
            {
             before(grammarAccess.getGenDefaultRemediationRuleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getGenDefaultRemediationRuleAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenDefaultRemediationRule__Group__2__Impl"


    // $ANTLR start "rule__GenDefaultRemediationRule__Group__3"
    // InternalLibrettoProjectProfile.g:3033:1: rule__GenDefaultRemediationRule__Group__3 : rule__GenDefaultRemediationRule__Group__3__Impl rule__GenDefaultRemediationRule__Group__4 ;
    public final void rule__GenDefaultRemediationRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3037:1: ( rule__GenDefaultRemediationRule__Group__3__Impl rule__GenDefaultRemediationRule__Group__4 )
            // InternalLibrettoProjectProfile.g:3038:2: rule__GenDefaultRemediationRule__Group__3__Impl rule__GenDefaultRemediationRule__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__GenDefaultRemediationRule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GenDefaultRemediationRule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenDefaultRemediationRule__Group__3"


    // $ANTLR start "rule__GenDefaultRemediationRule__Group__3__Impl"
    // InternalLibrettoProjectProfile.g:3045:1: rule__GenDefaultRemediationRule__Group__3__Impl : ( ( rule__GenDefaultRemediationRule__Alternatives_3 )* ) ;
    public final void rule__GenDefaultRemediationRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3049:1: ( ( ( rule__GenDefaultRemediationRule__Alternatives_3 )* ) )
            // InternalLibrettoProjectProfile.g:3050:1: ( ( rule__GenDefaultRemediationRule__Alternatives_3 )* )
            {
            // InternalLibrettoProjectProfile.g:3050:1: ( ( rule__GenDefaultRemediationRule__Alternatives_3 )* )
            // InternalLibrettoProjectProfile.g:3051:2: ( rule__GenDefaultRemediationRule__Alternatives_3 )*
            {
             before(grammarAccess.getGenDefaultRemediationRuleAccess().getAlternatives_3()); 
            // InternalLibrettoProjectProfile.g:3052:2: ( rule__GenDefaultRemediationRule__Alternatives_3 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=48 && LA26_0<=49)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:3052:3: rule__GenDefaultRemediationRule__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__GenDefaultRemediationRule__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getGenDefaultRemediationRuleAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenDefaultRemediationRule__Group__3__Impl"


    // $ANTLR start "rule__GenDefaultRemediationRule__Group__4"
    // InternalLibrettoProjectProfile.g:3060:1: rule__GenDefaultRemediationRule__Group__4 : rule__GenDefaultRemediationRule__Group__4__Impl ;
    public final void rule__GenDefaultRemediationRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3064:1: ( rule__GenDefaultRemediationRule__Group__4__Impl )
            // InternalLibrettoProjectProfile.g:3065:2: rule__GenDefaultRemediationRule__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GenDefaultRemediationRule__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenDefaultRemediationRule__Group__4"


    // $ANTLR start "rule__GenDefaultRemediationRule__Group__4__Impl"
    // InternalLibrettoProjectProfile.g:3071:1: rule__GenDefaultRemediationRule__Group__4__Impl : ( '}' ) ;
    public final void rule__GenDefaultRemediationRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3075:1: ( ( '}' ) )
            // InternalLibrettoProjectProfile.g:3076:1: ( '}' )
            {
            // InternalLibrettoProjectProfile.g:3076:1: ( '}' )
            // InternalLibrettoProjectProfile.g:3077:2: '}'
            {
             before(grammarAccess.getGenDefaultRemediationRuleAccess().getRightCurlyBracketKeyword_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getGenDefaultRemediationRuleAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenDefaultRemediationRule__Group__4__Impl"


    // $ANTLR start "rule__GenDefaultRemediationRule__Group_3_0__0"
    // InternalLibrettoProjectProfile.g:3087:1: rule__GenDefaultRemediationRule__Group_3_0__0 : rule__GenDefaultRemediationRule__Group_3_0__0__Impl rule__GenDefaultRemediationRule__Group_3_0__1 ;
    public final void rule__GenDefaultRemediationRule__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3091:1: ( rule__GenDefaultRemediationRule__Group_3_0__0__Impl rule__GenDefaultRemediationRule__Group_3_0__1 )
            // InternalLibrettoProjectProfile.g:3092:2: rule__GenDefaultRemediationRule__Group_3_0__0__Impl rule__GenDefaultRemediationRule__Group_3_0__1
            {
            pushFollow(FOLLOW_11);
            rule__GenDefaultRemediationRule__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GenDefaultRemediationRule__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenDefaultRemediationRule__Group_3_0__0"


    // $ANTLR start "rule__GenDefaultRemediationRule__Group_3_0__0__Impl"
    // InternalLibrettoProjectProfile.g:3099:1: rule__GenDefaultRemediationRule__Group_3_0__0__Impl : ( 'code' ) ;
    public final void rule__GenDefaultRemediationRule__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3103:1: ( ( 'code' ) )
            // InternalLibrettoProjectProfile.g:3104:1: ( 'code' )
            {
            // InternalLibrettoProjectProfile.g:3104:1: ( 'code' )
            // InternalLibrettoProjectProfile.g:3105:2: 'code'
            {
             before(grammarAccess.getGenDefaultRemediationRuleAccess().getCodeKeyword_3_0_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getGenDefaultRemediationRuleAccess().getCodeKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenDefaultRemediationRule__Group_3_0__0__Impl"


    // $ANTLR start "rule__GenDefaultRemediationRule__Group_3_0__1"
    // InternalLibrettoProjectProfile.g:3114:1: rule__GenDefaultRemediationRule__Group_3_0__1 : rule__GenDefaultRemediationRule__Group_3_0__1__Impl ;
    public final void rule__GenDefaultRemediationRule__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3118:1: ( rule__GenDefaultRemediationRule__Group_3_0__1__Impl )
            // InternalLibrettoProjectProfile.g:3119:2: rule__GenDefaultRemediationRule__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GenDefaultRemediationRule__Group_3_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenDefaultRemediationRule__Group_3_0__1"


    // $ANTLR start "rule__GenDefaultRemediationRule__Group_3_0__1__Impl"
    // InternalLibrettoProjectProfile.g:3125:1: rule__GenDefaultRemediationRule__Group_3_0__1__Impl : ( ( rule__GenDefaultRemediationRule__CodesAssignment_3_0_1 ) ) ;
    public final void rule__GenDefaultRemediationRule__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3129:1: ( ( ( rule__GenDefaultRemediationRule__CodesAssignment_3_0_1 ) ) )
            // InternalLibrettoProjectProfile.g:3130:1: ( ( rule__GenDefaultRemediationRule__CodesAssignment_3_0_1 ) )
            {
            // InternalLibrettoProjectProfile.g:3130:1: ( ( rule__GenDefaultRemediationRule__CodesAssignment_3_0_1 ) )
            // InternalLibrettoProjectProfile.g:3131:2: ( rule__GenDefaultRemediationRule__CodesAssignment_3_0_1 )
            {
             before(grammarAccess.getGenDefaultRemediationRuleAccess().getCodesAssignment_3_0_1()); 
            // InternalLibrettoProjectProfile.g:3132:2: ( rule__GenDefaultRemediationRule__CodesAssignment_3_0_1 )
            // InternalLibrettoProjectProfile.g:3132:3: rule__GenDefaultRemediationRule__CodesAssignment_3_0_1
            {
            pushFollow(FOLLOW_2);
            rule__GenDefaultRemediationRule__CodesAssignment_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getGenDefaultRemediationRuleAccess().getCodesAssignment_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenDefaultRemediationRule__Group_3_0__1__Impl"


    // $ANTLR start "rule__GenDefaultRemediationRule__Group_3_1__0"
    // InternalLibrettoProjectProfile.g:3141:1: rule__GenDefaultRemediationRule__Group_3_1__0 : rule__GenDefaultRemediationRule__Group_3_1__0__Impl rule__GenDefaultRemediationRule__Group_3_1__1 ;
    public final void rule__GenDefaultRemediationRule__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3145:1: ( rule__GenDefaultRemediationRule__Group_3_1__0__Impl rule__GenDefaultRemediationRule__Group_3_1__1 )
            // InternalLibrettoProjectProfile.g:3146:2: rule__GenDefaultRemediationRule__Group_3_1__0__Impl rule__GenDefaultRemediationRule__Group_3_1__1
            {
            pushFollow(FOLLOW_11);
            rule__GenDefaultRemediationRule__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GenDefaultRemediationRule__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenDefaultRemediationRule__Group_3_1__0"


    // $ANTLR start "rule__GenDefaultRemediationRule__Group_3_1__0__Impl"
    // InternalLibrettoProjectProfile.g:3153:1: rule__GenDefaultRemediationRule__Group_3_1__0__Impl : ( 'correction' ) ;
    public final void rule__GenDefaultRemediationRule__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3157:1: ( ( 'correction' ) )
            // InternalLibrettoProjectProfile.g:3158:1: ( 'correction' )
            {
            // InternalLibrettoProjectProfile.g:3158:1: ( 'correction' )
            // InternalLibrettoProjectProfile.g:3159:2: 'correction'
            {
             before(grammarAccess.getGenDefaultRemediationRuleAccess().getCorrectionKeyword_3_1_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getGenDefaultRemediationRuleAccess().getCorrectionKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenDefaultRemediationRule__Group_3_1__0__Impl"


    // $ANTLR start "rule__GenDefaultRemediationRule__Group_3_1__1"
    // InternalLibrettoProjectProfile.g:3168:1: rule__GenDefaultRemediationRule__Group_3_1__1 : rule__GenDefaultRemediationRule__Group_3_1__1__Impl ;
    public final void rule__GenDefaultRemediationRule__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3172:1: ( rule__GenDefaultRemediationRule__Group_3_1__1__Impl )
            // InternalLibrettoProjectProfile.g:3173:2: rule__GenDefaultRemediationRule__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GenDefaultRemediationRule__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenDefaultRemediationRule__Group_3_1__1"


    // $ANTLR start "rule__GenDefaultRemediationRule__Group_3_1__1__Impl"
    // InternalLibrettoProjectProfile.g:3179:1: rule__GenDefaultRemediationRule__Group_3_1__1__Impl : ( ( rule__GenDefaultRemediationRule__CorrectionAssignment_3_1_1 ) ) ;
    public final void rule__GenDefaultRemediationRule__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3183:1: ( ( ( rule__GenDefaultRemediationRule__CorrectionAssignment_3_1_1 ) ) )
            // InternalLibrettoProjectProfile.g:3184:1: ( ( rule__GenDefaultRemediationRule__CorrectionAssignment_3_1_1 ) )
            {
            // InternalLibrettoProjectProfile.g:3184:1: ( ( rule__GenDefaultRemediationRule__CorrectionAssignment_3_1_1 ) )
            // InternalLibrettoProjectProfile.g:3185:2: ( rule__GenDefaultRemediationRule__CorrectionAssignment_3_1_1 )
            {
             before(grammarAccess.getGenDefaultRemediationRuleAccess().getCorrectionAssignment_3_1_1()); 
            // InternalLibrettoProjectProfile.g:3186:2: ( rule__GenDefaultRemediationRule__CorrectionAssignment_3_1_1 )
            // InternalLibrettoProjectProfile.g:3186:3: rule__GenDefaultRemediationRule__CorrectionAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__GenDefaultRemediationRule__CorrectionAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getGenDefaultRemediationRuleAccess().getCorrectionAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenDefaultRemediationRule__Group_3_1__1__Impl"


    // $ANTLR start "rule__LlmProvidersBlock__Group__0"
    // InternalLibrettoProjectProfile.g:3195:1: rule__LlmProvidersBlock__Group__0 : rule__LlmProvidersBlock__Group__0__Impl rule__LlmProvidersBlock__Group__1 ;
    public final void rule__LlmProvidersBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3199:1: ( rule__LlmProvidersBlock__Group__0__Impl rule__LlmProvidersBlock__Group__1 )
            // InternalLibrettoProjectProfile.g:3200:2: rule__LlmProvidersBlock__Group__0__Impl rule__LlmProvidersBlock__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__LlmProvidersBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LlmProvidersBlock__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LlmProvidersBlock__Group__0"


    // $ANTLR start "rule__LlmProvidersBlock__Group__0__Impl"
    // InternalLibrettoProjectProfile.g:3207:1: rule__LlmProvidersBlock__Group__0__Impl : ( () ) ;
    public final void rule__LlmProvidersBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3211:1: ( ( () ) )
            // InternalLibrettoProjectProfile.g:3212:1: ( () )
            {
            // InternalLibrettoProjectProfile.g:3212:1: ( () )
            // InternalLibrettoProjectProfile.g:3213:2: ()
            {
             before(grammarAccess.getLlmProvidersBlockAccess().getLlmProvidersBlockAction_0()); 
            // InternalLibrettoProjectProfile.g:3214:2: ()
            // InternalLibrettoProjectProfile.g:3214:3: 
            {
            }

             after(grammarAccess.getLlmProvidersBlockAccess().getLlmProvidersBlockAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LlmProvidersBlock__Group__0__Impl"


    // $ANTLR start "rule__LlmProvidersBlock__Group__1"
    // InternalLibrettoProjectProfile.g:3222:1: rule__LlmProvidersBlock__Group__1 : rule__LlmProvidersBlock__Group__1__Impl rule__LlmProvidersBlock__Group__2 ;
    public final void rule__LlmProvidersBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3226:1: ( rule__LlmProvidersBlock__Group__1__Impl rule__LlmProvidersBlock__Group__2 )
            // InternalLibrettoProjectProfile.g:3227:2: rule__LlmProvidersBlock__Group__1__Impl rule__LlmProvidersBlock__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__LlmProvidersBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LlmProvidersBlock__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LlmProvidersBlock__Group__1"


    // $ANTLR start "rule__LlmProvidersBlock__Group__1__Impl"
    // InternalLibrettoProjectProfile.g:3234:1: rule__LlmProvidersBlock__Group__1__Impl : ( 'llmProviders' ) ;
    public final void rule__LlmProvidersBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3238:1: ( ( 'llmProviders' ) )
            // InternalLibrettoProjectProfile.g:3239:1: ( 'llmProviders' )
            {
            // InternalLibrettoProjectProfile.g:3239:1: ( 'llmProviders' )
            // InternalLibrettoProjectProfile.g:3240:2: 'llmProviders'
            {
             before(grammarAccess.getLlmProvidersBlockAccess().getLlmProvidersKeyword_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getLlmProvidersBlockAccess().getLlmProvidersKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LlmProvidersBlock__Group__1__Impl"


    // $ANTLR start "rule__LlmProvidersBlock__Group__2"
    // InternalLibrettoProjectProfile.g:3249:1: rule__LlmProvidersBlock__Group__2 : rule__LlmProvidersBlock__Group__2__Impl rule__LlmProvidersBlock__Group__3 ;
    public final void rule__LlmProvidersBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3253:1: ( rule__LlmProvidersBlock__Group__2__Impl rule__LlmProvidersBlock__Group__3 )
            // InternalLibrettoProjectProfile.g:3254:2: rule__LlmProvidersBlock__Group__2__Impl rule__LlmProvidersBlock__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__LlmProvidersBlock__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LlmProvidersBlock__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LlmProvidersBlock__Group__2"


    // $ANTLR start "rule__LlmProvidersBlock__Group__2__Impl"
    // InternalLibrettoProjectProfile.g:3261:1: rule__LlmProvidersBlock__Group__2__Impl : ( '{' ) ;
    public final void rule__LlmProvidersBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3265:1: ( ( '{' ) )
            // InternalLibrettoProjectProfile.g:3266:1: ( '{' )
            {
            // InternalLibrettoProjectProfile.g:3266:1: ( '{' )
            // InternalLibrettoProjectProfile.g:3267:2: '{'
            {
             before(grammarAccess.getLlmProvidersBlockAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getLlmProvidersBlockAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LlmProvidersBlock__Group__2__Impl"


    // $ANTLR start "rule__LlmProvidersBlock__Group__3"
    // InternalLibrettoProjectProfile.g:3276:1: rule__LlmProvidersBlock__Group__3 : rule__LlmProvidersBlock__Group__3__Impl rule__LlmProvidersBlock__Group__4 ;
    public final void rule__LlmProvidersBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3280:1: ( rule__LlmProvidersBlock__Group__3__Impl rule__LlmProvidersBlock__Group__4 )
            // InternalLibrettoProjectProfile.g:3281:2: rule__LlmProvidersBlock__Group__3__Impl rule__LlmProvidersBlock__Group__4
            {
            pushFollow(FOLLOW_32);
            rule__LlmProvidersBlock__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LlmProvidersBlock__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LlmProvidersBlock__Group__3"


    // $ANTLR start "rule__LlmProvidersBlock__Group__3__Impl"
    // InternalLibrettoProjectProfile.g:3288:1: rule__LlmProvidersBlock__Group__3__Impl : ( ( rule__LlmProvidersBlock__ProvidersAssignment_3 )* ) ;
    public final void rule__LlmProvidersBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3292:1: ( ( ( rule__LlmProvidersBlock__ProvidersAssignment_3 )* ) )
            // InternalLibrettoProjectProfile.g:3293:1: ( ( rule__LlmProvidersBlock__ProvidersAssignment_3 )* )
            {
            // InternalLibrettoProjectProfile.g:3293:1: ( ( rule__LlmProvidersBlock__ProvidersAssignment_3 )* )
            // InternalLibrettoProjectProfile.g:3294:2: ( rule__LlmProvidersBlock__ProvidersAssignment_3 )*
            {
             before(grammarAccess.getLlmProvidersBlockAccess().getProvidersAssignment_3()); 
            // InternalLibrettoProjectProfile.g:3295:2: ( rule__LlmProvidersBlock__ProvidersAssignment_3 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==52) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:3295:3: rule__LlmProvidersBlock__ProvidersAssignment_3
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__LlmProvidersBlock__ProvidersAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getLlmProvidersBlockAccess().getProvidersAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LlmProvidersBlock__Group__3__Impl"


    // $ANTLR start "rule__LlmProvidersBlock__Group__4"
    // InternalLibrettoProjectProfile.g:3303:1: rule__LlmProvidersBlock__Group__4 : rule__LlmProvidersBlock__Group__4__Impl ;
    public final void rule__LlmProvidersBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3307:1: ( rule__LlmProvidersBlock__Group__4__Impl )
            // InternalLibrettoProjectProfile.g:3308:2: rule__LlmProvidersBlock__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LlmProvidersBlock__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LlmProvidersBlock__Group__4"


    // $ANTLR start "rule__LlmProvidersBlock__Group__4__Impl"
    // InternalLibrettoProjectProfile.g:3314:1: rule__LlmProvidersBlock__Group__4__Impl : ( '}' ) ;
    public final void rule__LlmProvidersBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3318:1: ( ( '}' ) )
            // InternalLibrettoProjectProfile.g:3319:1: ( '}' )
            {
            // InternalLibrettoProjectProfile.g:3319:1: ( '}' )
            // InternalLibrettoProjectProfile.g:3320:2: '}'
            {
             before(grammarAccess.getLlmProvidersBlockAccess().getRightCurlyBracketKeyword_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getLlmProvidersBlockAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LlmProvidersBlock__Group__4__Impl"


    // $ANTLR start "rule__NamedLlmProvider__Group__0"
    // InternalLibrettoProjectProfile.g:3330:1: rule__NamedLlmProvider__Group__0 : rule__NamedLlmProvider__Group__0__Impl rule__NamedLlmProvider__Group__1 ;
    public final void rule__NamedLlmProvider__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3334:1: ( rule__NamedLlmProvider__Group__0__Impl rule__NamedLlmProvider__Group__1 )
            // InternalLibrettoProjectProfile.g:3335:2: rule__NamedLlmProvider__Group__0__Impl rule__NamedLlmProvider__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__NamedLlmProvider__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedLlmProvider__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedLlmProvider__Group__0"


    // $ANTLR start "rule__NamedLlmProvider__Group__0__Impl"
    // InternalLibrettoProjectProfile.g:3342:1: rule__NamedLlmProvider__Group__0__Impl : ( 'provider' ) ;
    public final void rule__NamedLlmProvider__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3346:1: ( ( 'provider' ) )
            // InternalLibrettoProjectProfile.g:3347:1: ( 'provider' )
            {
            // InternalLibrettoProjectProfile.g:3347:1: ( 'provider' )
            // InternalLibrettoProjectProfile.g:3348:2: 'provider'
            {
             before(grammarAccess.getNamedLlmProviderAccess().getProviderKeyword_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getNamedLlmProviderAccess().getProviderKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedLlmProvider__Group__0__Impl"


    // $ANTLR start "rule__NamedLlmProvider__Group__1"
    // InternalLibrettoProjectProfile.g:3357:1: rule__NamedLlmProvider__Group__1 : rule__NamedLlmProvider__Group__1__Impl rule__NamedLlmProvider__Group__2 ;
    public final void rule__NamedLlmProvider__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3361:1: ( rule__NamedLlmProvider__Group__1__Impl rule__NamedLlmProvider__Group__2 )
            // InternalLibrettoProjectProfile.g:3362:2: rule__NamedLlmProvider__Group__1__Impl rule__NamedLlmProvider__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__NamedLlmProvider__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedLlmProvider__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedLlmProvider__Group__1"


    // $ANTLR start "rule__NamedLlmProvider__Group__1__Impl"
    // InternalLibrettoProjectProfile.g:3369:1: rule__NamedLlmProvider__Group__1__Impl : ( ( rule__NamedLlmProvider__NameAssignment_1 ) ) ;
    public final void rule__NamedLlmProvider__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3373:1: ( ( ( rule__NamedLlmProvider__NameAssignment_1 ) ) )
            // InternalLibrettoProjectProfile.g:3374:1: ( ( rule__NamedLlmProvider__NameAssignment_1 ) )
            {
            // InternalLibrettoProjectProfile.g:3374:1: ( ( rule__NamedLlmProvider__NameAssignment_1 ) )
            // InternalLibrettoProjectProfile.g:3375:2: ( rule__NamedLlmProvider__NameAssignment_1 )
            {
             before(grammarAccess.getNamedLlmProviderAccess().getNameAssignment_1()); 
            // InternalLibrettoProjectProfile.g:3376:2: ( rule__NamedLlmProvider__NameAssignment_1 )
            // InternalLibrettoProjectProfile.g:3376:3: rule__NamedLlmProvider__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NamedLlmProvider__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNamedLlmProviderAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedLlmProvider__Group__1__Impl"


    // $ANTLR start "rule__NamedLlmProvider__Group__2"
    // InternalLibrettoProjectProfile.g:3384:1: rule__NamedLlmProvider__Group__2 : rule__NamedLlmProvider__Group__2__Impl rule__NamedLlmProvider__Group__3 ;
    public final void rule__NamedLlmProvider__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3388:1: ( rule__NamedLlmProvider__Group__2__Impl rule__NamedLlmProvider__Group__3 )
            // InternalLibrettoProjectProfile.g:3389:2: rule__NamedLlmProvider__Group__2__Impl rule__NamedLlmProvider__Group__3
            {
            pushFollow(FOLLOW_34);
            rule__NamedLlmProvider__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedLlmProvider__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedLlmProvider__Group__2"


    // $ANTLR start "rule__NamedLlmProvider__Group__2__Impl"
    // InternalLibrettoProjectProfile.g:3396:1: rule__NamedLlmProvider__Group__2__Impl : ( '{' ) ;
    public final void rule__NamedLlmProvider__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3400:1: ( ( '{' ) )
            // InternalLibrettoProjectProfile.g:3401:1: ( '{' )
            {
            // InternalLibrettoProjectProfile.g:3401:1: ( '{' )
            // InternalLibrettoProjectProfile.g:3402:2: '{'
            {
             before(grammarAccess.getNamedLlmProviderAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getNamedLlmProviderAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedLlmProvider__Group__2__Impl"


    // $ANTLR start "rule__NamedLlmProvider__Group__3"
    // InternalLibrettoProjectProfile.g:3411:1: rule__NamedLlmProvider__Group__3 : rule__NamedLlmProvider__Group__3__Impl rule__NamedLlmProvider__Group__4 ;
    public final void rule__NamedLlmProvider__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3415:1: ( rule__NamedLlmProvider__Group__3__Impl rule__NamedLlmProvider__Group__4 )
            // InternalLibrettoProjectProfile.g:3416:2: rule__NamedLlmProvider__Group__3__Impl rule__NamedLlmProvider__Group__4
            {
            pushFollow(FOLLOW_34);
            rule__NamedLlmProvider__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedLlmProvider__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedLlmProvider__Group__3"


    // $ANTLR start "rule__NamedLlmProvider__Group__3__Impl"
    // InternalLibrettoProjectProfile.g:3423:1: rule__NamedLlmProvider__Group__3__Impl : ( ( rule__NamedLlmProvider__Alternatives_3 )* ) ;
    public final void rule__NamedLlmProvider__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3427:1: ( ( ( rule__NamedLlmProvider__Alternatives_3 )* ) )
            // InternalLibrettoProjectProfile.g:3428:1: ( ( rule__NamedLlmProvider__Alternatives_3 )* )
            {
            // InternalLibrettoProjectProfile.g:3428:1: ( ( rule__NamedLlmProvider__Alternatives_3 )* )
            // InternalLibrettoProjectProfile.g:3429:2: ( rule__NamedLlmProvider__Alternatives_3 )*
            {
             before(grammarAccess.getNamedLlmProviderAccess().getAlternatives_3()); 
            // InternalLibrettoProjectProfile.g:3430:2: ( rule__NamedLlmProvider__Alternatives_3 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=53 && LA28_0<=56)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:3430:3: rule__NamedLlmProvider__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__NamedLlmProvider__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getNamedLlmProviderAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedLlmProvider__Group__3__Impl"


    // $ANTLR start "rule__NamedLlmProvider__Group__4"
    // InternalLibrettoProjectProfile.g:3438:1: rule__NamedLlmProvider__Group__4 : rule__NamedLlmProvider__Group__4__Impl ;
    public final void rule__NamedLlmProvider__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3442:1: ( rule__NamedLlmProvider__Group__4__Impl )
            // InternalLibrettoProjectProfile.g:3443:2: rule__NamedLlmProvider__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NamedLlmProvider__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedLlmProvider__Group__4"


    // $ANTLR start "rule__NamedLlmProvider__Group__4__Impl"
    // InternalLibrettoProjectProfile.g:3449:1: rule__NamedLlmProvider__Group__4__Impl : ( '}' ) ;
    public final void rule__NamedLlmProvider__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3453:1: ( ( '}' ) )
            // InternalLibrettoProjectProfile.g:3454:1: ( '}' )
            {
            // InternalLibrettoProjectProfile.g:3454:1: ( '}' )
            // InternalLibrettoProjectProfile.g:3455:2: '}'
            {
             before(grammarAccess.getNamedLlmProviderAccess().getRightCurlyBracketKeyword_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getNamedLlmProviderAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedLlmProvider__Group__4__Impl"


    // $ANTLR start "rule__NamedLlmProvider__Group_3_0__0"
    // InternalLibrettoProjectProfile.g:3465:1: rule__NamedLlmProvider__Group_3_0__0 : rule__NamedLlmProvider__Group_3_0__0__Impl rule__NamedLlmProvider__Group_3_0__1 ;
    public final void rule__NamedLlmProvider__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3469:1: ( rule__NamedLlmProvider__Group_3_0__0__Impl rule__NamedLlmProvider__Group_3_0__1 )
            // InternalLibrettoProjectProfile.g:3470:2: rule__NamedLlmProvider__Group_3_0__0__Impl rule__NamedLlmProvider__Group_3_0__1
            {
            pushFollow(FOLLOW_36);
            rule__NamedLlmProvider__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedLlmProvider__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedLlmProvider__Group_3_0__0"


    // $ANTLR start "rule__NamedLlmProvider__Group_3_0__0__Impl"
    // InternalLibrettoProjectProfile.g:3477:1: rule__NamedLlmProvider__Group_3_0__0__Impl : ( 'kind' ) ;
    public final void rule__NamedLlmProvider__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3481:1: ( ( 'kind' ) )
            // InternalLibrettoProjectProfile.g:3482:1: ( 'kind' )
            {
            // InternalLibrettoProjectProfile.g:3482:1: ( 'kind' )
            // InternalLibrettoProjectProfile.g:3483:2: 'kind'
            {
             before(grammarAccess.getNamedLlmProviderAccess().getKindKeyword_3_0_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getNamedLlmProviderAccess().getKindKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedLlmProvider__Group_3_0__0__Impl"


    // $ANTLR start "rule__NamedLlmProvider__Group_3_0__1"
    // InternalLibrettoProjectProfile.g:3492:1: rule__NamedLlmProvider__Group_3_0__1 : rule__NamedLlmProvider__Group_3_0__1__Impl ;
    public final void rule__NamedLlmProvider__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3496:1: ( rule__NamedLlmProvider__Group_3_0__1__Impl )
            // InternalLibrettoProjectProfile.g:3497:2: rule__NamedLlmProvider__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NamedLlmProvider__Group_3_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedLlmProvider__Group_3_0__1"


    // $ANTLR start "rule__NamedLlmProvider__Group_3_0__1__Impl"
    // InternalLibrettoProjectProfile.g:3503:1: rule__NamedLlmProvider__Group_3_0__1__Impl : ( ( rule__NamedLlmProvider__KindsAssignment_3_0_1 ) ) ;
    public final void rule__NamedLlmProvider__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3507:1: ( ( ( rule__NamedLlmProvider__KindsAssignment_3_0_1 ) ) )
            // InternalLibrettoProjectProfile.g:3508:1: ( ( rule__NamedLlmProvider__KindsAssignment_3_0_1 ) )
            {
            // InternalLibrettoProjectProfile.g:3508:1: ( ( rule__NamedLlmProvider__KindsAssignment_3_0_1 ) )
            // InternalLibrettoProjectProfile.g:3509:2: ( rule__NamedLlmProvider__KindsAssignment_3_0_1 )
            {
             before(grammarAccess.getNamedLlmProviderAccess().getKindsAssignment_3_0_1()); 
            // InternalLibrettoProjectProfile.g:3510:2: ( rule__NamedLlmProvider__KindsAssignment_3_0_1 )
            // InternalLibrettoProjectProfile.g:3510:3: rule__NamedLlmProvider__KindsAssignment_3_0_1
            {
            pushFollow(FOLLOW_2);
            rule__NamedLlmProvider__KindsAssignment_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getNamedLlmProviderAccess().getKindsAssignment_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedLlmProvider__Group_3_0__1__Impl"


    // $ANTLR start "rule__NamedLlmProvider__Group_3_1__0"
    // InternalLibrettoProjectProfile.g:3519:1: rule__NamedLlmProvider__Group_3_1__0 : rule__NamedLlmProvider__Group_3_1__0__Impl rule__NamedLlmProvider__Group_3_1__1 ;
    public final void rule__NamedLlmProvider__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3523:1: ( rule__NamedLlmProvider__Group_3_1__0__Impl rule__NamedLlmProvider__Group_3_1__1 )
            // InternalLibrettoProjectProfile.g:3524:2: rule__NamedLlmProvider__Group_3_1__0__Impl rule__NamedLlmProvider__Group_3_1__1
            {
            pushFollow(FOLLOW_11);
            rule__NamedLlmProvider__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedLlmProvider__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedLlmProvider__Group_3_1__0"


    // $ANTLR start "rule__NamedLlmProvider__Group_3_1__0__Impl"
    // InternalLibrettoProjectProfile.g:3531:1: rule__NamedLlmProvider__Group_3_1__0__Impl : ( 'localModelPath' ) ;
    public final void rule__NamedLlmProvider__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3535:1: ( ( 'localModelPath' ) )
            // InternalLibrettoProjectProfile.g:3536:1: ( 'localModelPath' )
            {
            // InternalLibrettoProjectProfile.g:3536:1: ( 'localModelPath' )
            // InternalLibrettoProjectProfile.g:3537:2: 'localModelPath'
            {
             before(grammarAccess.getNamedLlmProviderAccess().getLocalModelPathKeyword_3_1_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getNamedLlmProviderAccess().getLocalModelPathKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedLlmProvider__Group_3_1__0__Impl"


    // $ANTLR start "rule__NamedLlmProvider__Group_3_1__1"
    // InternalLibrettoProjectProfile.g:3546:1: rule__NamedLlmProvider__Group_3_1__1 : rule__NamedLlmProvider__Group_3_1__1__Impl ;
    public final void rule__NamedLlmProvider__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3550:1: ( rule__NamedLlmProvider__Group_3_1__1__Impl )
            // InternalLibrettoProjectProfile.g:3551:2: rule__NamedLlmProvider__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NamedLlmProvider__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedLlmProvider__Group_3_1__1"


    // $ANTLR start "rule__NamedLlmProvider__Group_3_1__1__Impl"
    // InternalLibrettoProjectProfile.g:3557:1: rule__NamedLlmProvider__Group_3_1__1__Impl : ( ( rule__NamedLlmProvider__LocalModelPathsAssignment_3_1_1 ) ) ;
    public final void rule__NamedLlmProvider__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3561:1: ( ( ( rule__NamedLlmProvider__LocalModelPathsAssignment_3_1_1 ) ) )
            // InternalLibrettoProjectProfile.g:3562:1: ( ( rule__NamedLlmProvider__LocalModelPathsAssignment_3_1_1 ) )
            {
            // InternalLibrettoProjectProfile.g:3562:1: ( ( rule__NamedLlmProvider__LocalModelPathsAssignment_3_1_1 ) )
            // InternalLibrettoProjectProfile.g:3563:2: ( rule__NamedLlmProvider__LocalModelPathsAssignment_3_1_1 )
            {
             before(grammarAccess.getNamedLlmProviderAccess().getLocalModelPathsAssignment_3_1_1()); 
            // InternalLibrettoProjectProfile.g:3564:2: ( rule__NamedLlmProvider__LocalModelPathsAssignment_3_1_1 )
            // InternalLibrettoProjectProfile.g:3564:3: rule__NamedLlmProvider__LocalModelPathsAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__NamedLlmProvider__LocalModelPathsAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getNamedLlmProviderAccess().getLocalModelPathsAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedLlmProvider__Group_3_1__1__Impl"


    // $ANTLR start "rule__NamedLlmProvider__Group_3_2__0"
    // InternalLibrettoProjectProfile.g:3573:1: rule__NamedLlmProvider__Group_3_2__0 : rule__NamedLlmProvider__Group_3_2__0__Impl rule__NamedLlmProvider__Group_3_2__1 ;
    public final void rule__NamedLlmProvider__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3577:1: ( rule__NamedLlmProvider__Group_3_2__0__Impl rule__NamedLlmProvider__Group_3_2__1 )
            // InternalLibrettoProjectProfile.g:3578:2: rule__NamedLlmProvider__Group_3_2__0__Impl rule__NamedLlmProvider__Group_3_2__1
            {
            pushFollow(FOLLOW_11);
            rule__NamedLlmProvider__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedLlmProvider__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedLlmProvider__Group_3_2__0"


    // $ANTLR start "rule__NamedLlmProvider__Group_3_2__0__Impl"
    // InternalLibrettoProjectProfile.g:3585:1: rule__NamedLlmProvider__Group_3_2__0__Impl : ( 'model' ) ;
    public final void rule__NamedLlmProvider__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3589:1: ( ( 'model' ) )
            // InternalLibrettoProjectProfile.g:3590:1: ( 'model' )
            {
            // InternalLibrettoProjectProfile.g:3590:1: ( 'model' )
            // InternalLibrettoProjectProfile.g:3591:2: 'model'
            {
             before(grammarAccess.getNamedLlmProviderAccess().getModelKeyword_3_2_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getNamedLlmProviderAccess().getModelKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedLlmProvider__Group_3_2__0__Impl"


    // $ANTLR start "rule__NamedLlmProvider__Group_3_2__1"
    // InternalLibrettoProjectProfile.g:3600:1: rule__NamedLlmProvider__Group_3_2__1 : rule__NamedLlmProvider__Group_3_2__1__Impl ;
    public final void rule__NamedLlmProvider__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3604:1: ( rule__NamedLlmProvider__Group_3_2__1__Impl )
            // InternalLibrettoProjectProfile.g:3605:2: rule__NamedLlmProvider__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NamedLlmProvider__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedLlmProvider__Group_3_2__1"


    // $ANTLR start "rule__NamedLlmProvider__Group_3_2__1__Impl"
    // InternalLibrettoProjectProfile.g:3611:1: rule__NamedLlmProvider__Group_3_2__1__Impl : ( ( rule__NamedLlmProvider__ModelsAssignment_3_2_1 ) ) ;
    public final void rule__NamedLlmProvider__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3615:1: ( ( ( rule__NamedLlmProvider__ModelsAssignment_3_2_1 ) ) )
            // InternalLibrettoProjectProfile.g:3616:1: ( ( rule__NamedLlmProvider__ModelsAssignment_3_2_1 ) )
            {
            // InternalLibrettoProjectProfile.g:3616:1: ( ( rule__NamedLlmProvider__ModelsAssignment_3_2_1 ) )
            // InternalLibrettoProjectProfile.g:3617:2: ( rule__NamedLlmProvider__ModelsAssignment_3_2_1 )
            {
             before(grammarAccess.getNamedLlmProviderAccess().getModelsAssignment_3_2_1()); 
            // InternalLibrettoProjectProfile.g:3618:2: ( rule__NamedLlmProvider__ModelsAssignment_3_2_1 )
            // InternalLibrettoProjectProfile.g:3618:3: rule__NamedLlmProvider__ModelsAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__NamedLlmProvider__ModelsAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getNamedLlmProviderAccess().getModelsAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedLlmProvider__Group_3_2__1__Impl"


    // $ANTLR start "rule__NamedLlmProvider__Group_3_3__0"
    // InternalLibrettoProjectProfile.g:3627:1: rule__NamedLlmProvider__Group_3_3__0 : rule__NamedLlmProvider__Group_3_3__0__Impl rule__NamedLlmProvider__Group_3_3__1 ;
    public final void rule__NamedLlmProvider__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3631:1: ( rule__NamedLlmProvider__Group_3_3__0__Impl rule__NamedLlmProvider__Group_3_3__1 )
            // InternalLibrettoProjectProfile.g:3632:2: rule__NamedLlmProvider__Group_3_3__0__Impl rule__NamedLlmProvider__Group_3_3__1
            {
            pushFollow(FOLLOW_11);
            rule__NamedLlmProvider__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedLlmProvider__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedLlmProvider__Group_3_3__0"


    // $ANTLR start "rule__NamedLlmProvider__Group_3_3__0__Impl"
    // InternalLibrettoProjectProfile.g:3639:1: rule__NamedLlmProvider__Group_3_3__0__Impl : ( 'endpoint' ) ;
    public final void rule__NamedLlmProvider__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3643:1: ( ( 'endpoint' ) )
            // InternalLibrettoProjectProfile.g:3644:1: ( 'endpoint' )
            {
            // InternalLibrettoProjectProfile.g:3644:1: ( 'endpoint' )
            // InternalLibrettoProjectProfile.g:3645:2: 'endpoint'
            {
             before(grammarAccess.getNamedLlmProviderAccess().getEndpointKeyword_3_3_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getNamedLlmProviderAccess().getEndpointKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedLlmProvider__Group_3_3__0__Impl"


    // $ANTLR start "rule__NamedLlmProvider__Group_3_3__1"
    // InternalLibrettoProjectProfile.g:3654:1: rule__NamedLlmProvider__Group_3_3__1 : rule__NamedLlmProvider__Group_3_3__1__Impl ;
    public final void rule__NamedLlmProvider__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3658:1: ( rule__NamedLlmProvider__Group_3_3__1__Impl )
            // InternalLibrettoProjectProfile.g:3659:2: rule__NamedLlmProvider__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NamedLlmProvider__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedLlmProvider__Group_3_3__1"


    // $ANTLR start "rule__NamedLlmProvider__Group_3_3__1__Impl"
    // InternalLibrettoProjectProfile.g:3665:1: rule__NamedLlmProvider__Group_3_3__1__Impl : ( ( rule__NamedLlmProvider__EndpointsAssignment_3_3_1 ) ) ;
    public final void rule__NamedLlmProvider__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3669:1: ( ( ( rule__NamedLlmProvider__EndpointsAssignment_3_3_1 ) ) )
            // InternalLibrettoProjectProfile.g:3670:1: ( ( rule__NamedLlmProvider__EndpointsAssignment_3_3_1 ) )
            {
            // InternalLibrettoProjectProfile.g:3670:1: ( ( rule__NamedLlmProvider__EndpointsAssignment_3_3_1 ) )
            // InternalLibrettoProjectProfile.g:3671:2: ( rule__NamedLlmProvider__EndpointsAssignment_3_3_1 )
            {
             before(grammarAccess.getNamedLlmProviderAccess().getEndpointsAssignment_3_3_1()); 
            // InternalLibrettoProjectProfile.g:3672:2: ( rule__NamedLlmProvider__EndpointsAssignment_3_3_1 )
            // InternalLibrettoProjectProfile.g:3672:3: rule__NamedLlmProvider__EndpointsAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__NamedLlmProvider__EndpointsAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getNamedLlmProviderAccess().getEndpointsAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedLlmProvider__Group_3_3__1__Impl"


    // $ANTLR start "rule__GenUsageBlock__Group__0"
    // InternalLibrettoProjectProfile.g:3681:1: rule__GenUsageBlock__Group__0 : rule__GenUsageBlock__Group__0__Impl rule__GenUsageBlock__Group__1 ;
    public final void rule__GenUsageBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3685:1: ( rule__GenUsageBlock__Group__0__Impl rule__GenUsageBlock__Group__1 )
            // InternalLibrettoProjectProfile.g:3686:2: rule__GenUsageBlock__Group__0__Impl rule__GenUsageBlock__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__GenUsageBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GenUsageBlock__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenUsageBlock__Group__0"


    // $ANTLR start "rule__GenUsageBlock__Group__0__Impl"
    // InternalLibrettoProjectProfile.g:3693:1: rule__GenUsageBlock__Group__0__Impl : ( () ) ;
    public final void rule__GenUsageBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3697:1: ( ( () ) )
            // InternalLibrettoProjectProfile.g:3698:1: ( () )
            {
            // InternalLibrettoProjectProfile.g:3698:1: ( () )
            // InternalLibrettoProjectProfile.g:3699:2: ()
            {
             before(grammarAccess.getGenUsageBlockAccess().getGenUsageBlockAction_0()); 
            // InternalLibrettoProjectProfile.g:3700:2: ()
            // InternalLibrettoProjectProfile.g:3700:3: 
            {
            }

             after(grammarAccess.getGenUsageBlockAccess().getGenUsageBlockAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenUsageBlock__Group__0__Impl"


    // $ANTLR start "rule__GenUsageBlock__Group__1"
    // InternalLibrettoProjectProfile.g:3708:1: rule__GenUsageBlock__Group__1 : rule__GenUsageBlock__Group__1__Impl rule__GenUsageBlock__Group__2 ;
    public final void rule__GenUsageBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3712:1: ( rule__GenUsageBlock__Group__1__Impl rule__GenUsageBlock__Group__2 )
            // InternalLibrettoProjectProfile.g:3713:2: rule__GenUsageBlock__Group__1__Impl rule__GenUsageBlock__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__GenUsageBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GenUsageBlock__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenUsageBlock__Group__1"


    // $ANTLR start "rule__GenUsageBlock__Group__1__Impl"
    // InternalLibrettoProjectProfile.g:3720:1: rule__GenUsageBlock__Group__1__Impl : ( 'modelUsage' ) ;
    public final void rule__GenUsageBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3724:1: ( ( 'modelUsage' ) )
            // InternalLibrettoProjectProfile.g:3725:1: ( 'modelUsage' )
            {
            // InternalLibrettoProjectProfile.g:3725:1: ( 'modelUsage' )
            // InternalLibrettoProjectProfile.g:3726:2: 'modelUsage'
            {
             before(grammarAccess.getGenUsageBlockAccess().getModelUsageKeyword_1()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getGenUsageBlockAccess().getModelUsageKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenUsageBlock__Group__1__Impl"


    // $ANTLR start "rule__GenUsageBlock__Group__2"
    // InternalLibrettoProjectProfile.g:3735:1: rule__GenUsageBlock__Group__2 : rule__GenUsageBlock__Group__2__Impl rule__GenUsageBlock__Group__3 ;
    public final void rule__GenUsageBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3739:1: ( rule__GenUsageBlock__Group__2__Impl rule__GenUsageBlock__Group__3 )
            // InternalLibrettoProjectProfile.g:3740:2: rule__GenUsageBlock__Group__2__Impl rule__GenUsageBlock__Group__3
            {
            pushFollow(FOLLOW_38);
            rule__GenUsageBlock__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GenUsageBlock__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenUsageBlock__Group__2"


    // $ANTLR start "rule__GenUsageBlock__Group__2__Impl"
    // InternalLibrettoProjectProfile.g:3747:1: rule__GenUsageBlock__Group__2__Impl : ( '{' ) ;
    public final void rule__GenUsageBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3751:1: ( ( '{' ) )
            // InternalLibrettoProjectProfile.g:3752:1: ( '{' )
            {
            // InternalLibrettoProjectProfile.g:3752:1: ( '{' )
            // InternalLibrettoProjectProfile.g:3753:2: '{'
            {
             before(grammarAccess.getGenUsageBlockAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getGenUsageBlockAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenUsageBlock__Group__2__Impl"


    // $ANTLR start "rule__GenUsageBlock__Group__3"
    // InternalLibrettoProjectProfile.g:3762:1: rule__GenUsageBlock__Group__3 : rule__GenUsageBlock__Group__3__Impl rule__GenUsageBlock__Group__4 ;
    public final void rule__GenUsageBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3766:1: ( rule__GenUsageBlock__Group__3__Impl rule__GenUsageBlock__Group__4 )
            // InternalLibrettoProjectProfile.g:3767:2: rule__GenUsageBlock__Group__3__Impl rule__GenUsageBlock__Group__4
            {
            pushFollow(FOLLOW_38);
            rule__GenUsageBlock__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GenUsageBlock__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenUsageBlock__Group__3"


    // $ANTLR start "rule__GenUsageBlock__Group__3__Impl"
    // InternalLibrettoProjectProfile.g:3774:1: rule__GenUsageBlock__Group__3__Impl : ( ( rule__GenUsageBlock__Alternatives_3 )* ) ;
    public final void rule__GenUsageBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3778:1: ( ( ( rule__GenUsageBlock__Alternatives_3 )* ) )
            // InternalLibrettoProjectProfile.g:3779:1: ( ( rule__GenUsageBlock__Alternatives_3 )* )
            {
            // InternalLibrettoProjectProfile.g:3779:1: ( ( rule__GenUsageBlock__Alternatives_3 )* )
            // InternalLibrettoProjectProfile.g:3780:2: ( rule__GenUsageBlock__Alternatives_3 )*
            {
             before(grammarAccess.getGenUsageBlockAccess().getAlternatives_3()); 
            // InternalLibrettoProjectProfile.g:3781:2: ( rule__GenUsageBlock__Alternatives_3 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=58 && LA29_0<=60)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:3781:3: rule__GenUsageBlock__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__GenUsageBlock__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getGenUsageBlockAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenUsageBlock__Group__3__Impl"


    // $ANTLR start "rule__GenUsageBlock__Group__4"
    // InternalLibrettoProjectProfile.g:3789:1: rule__GenUsageBlock__Group__4 : rule__GenUsageBlock__Group__4__Impl ;
    public final void rule__GenUsageBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3793:1: ( rule__GenUsageBlock__Group__4__Impl )
            // InternalLibrettoProjectProfile.g:3794:2: rule__GenUsageBlock__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GenUsageBlock__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenUsageBlock__Group__4"


    // $ANTLR start "rule__GenUsageBlock__Group__4__Impl"
    // InternalLibrettoProjectProfile.g:3800:1: rule__GenUsageBlock__Group__4__Impl : ( '}' ) ;
    public final void rule__GenUsageBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3804:1: ( ( '}' ) )
            // InternalLibrettoProjectProfile.g:3805:1: ( '}' )
            {
            // InternalLibrettoProjectProfile.g:3805:1: ( '}' )
            // InternalLibrettoProjectProfile.g:3806:2: '}'
            {
             before(grammarAccess.getGenUsageBlockAccess().getRightCurlyBracketKeyword_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getGenUsageBlockAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenUsageBlock__Group__4__Impl"


    // $ANTLR start "rule__GenUsageBlock__Group_3_0__0"
    // InternalLibrettoProjectProfile.g:3816:1: rule__GenUsageBlock__Group_3_0__0 : rule__GenUsageBlock__Group_3_0__0__Impl rule__GenUsageBlock__Group_3_0__1 ;
    public final void rule__GenUsageBlock__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3820:1: ( rule__GenUsageBlock__Group_3_0__0__Impl rule__GenUsageBlock__Group_3_0__1 )
            // InternalLibrettoProjectProfile.g:3821:2: rule__GenUsageBlock__Group_3_0__0__Impl rule__GenUsageBlock__Group_3_0__1
            {
            pushFollow(FOLLOW_11);
            rule__GenUsageBlock__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GenUsageBlock__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenUsageBlock__Group_3_0__0"


    // $ANTLR start "rule__GenUsageBlock__Group_3_0__0__Impl"
    // InternalLibrettoProjectProfile.g:3828:1: rule__GenUsageBlock__Group_3_0__0__Impl : ( 'primary' ) ;
    public final void rule__GenUsageBlock__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3832:1: ( ( 'primary' ) )
            // InternalLibrettoProjectProfile.g:3833:1: ( 'primary' )
            {
            // InternalLibrettoProjectProfile.g:3833:1: ( 'primary' )
            // InternalLibrettoProjectProfile.g:3834:2: 'primary'
            {
             before(grammarAccess.getGenUsageBlockAccess().getPrimaryKeyword_3_0_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getGenUsageBlockAccess().getPrimaryKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenUsageBlock__Group_3_0__0__Impl"


    // $ANTLR start "rule__GenUsageBlock__Group_3_0__1"
    // InternalLibrettoProjectProfile.g:3843:1: rule__GenUsageBlock__Group_3_0__1 : rule__GenUsageBlock__Group_3_0__1__Impl ;
    public final void rule__GenUsageBlock__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3847:1: ( rule__GenUsageBlock__Group_3_0__1__Impl )
            // InternalLibrettoProjectProfile.g:3848:2: rule__GenUsageBlock__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GenUsageBlock__Group_3_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenUsageBlock__Group_3_0__1"


    // $ANTLR start "rule__GenUsageBlock__Group_3_0__1__Impl"
    // InternalLibrettoProjectProfile.g:3854:1: rule__GenUsageBlock__Group_3_0__1__Impl : ( ( rule__GenUsageBlock__PrimaryProvidersAssignment_3_0_1 ) ) ;
    public final void rule__GenUsageBlock__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3858:1: ( ( ( rule__GenUsageBlock__PrimaryProvidersAssignment_3_0_1 ) ) )
            // InternalLibrettoProjectProfile.g:3859:1: ( ( rule__GenUsageBlock__PrimaryProvidersAssignment_3_0_1 ) )
            {
            // InternalLibrettoProjectProfile.g:3859:1: ( ( rule__GenUsageBlock__PrimaryProvidersAssignment_3_0_1 ) )
            // InternalLibrettoProjectProfile.g:3860:2: ( rule__GenUsageBlock__PrimaryProvidersAssignment_3_0_1 )
            {
             before(grammarAccess.getGenUsageBlockAccess().getPrimaryProvidersAssignment_3_0_1()); 
            // InternalLibrettoProjectProfile.g:3861:2: ( rule__GenUsageBlock__PrimaryProvidersAssignment_3_0_1 )
            // InternalLibrettoProjectProfile.g:3861:3: rule__GenUsageBlock__PrimaryProvidersAssignment_3_0_1
            {
            pushFollow(FOLLOW_2);
            rule__GenUsageBlock__PrimaryProvidersAssignment_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getGenUsageBlockAccess().getPrimaryProvidersAssignment_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenUsageBlock__Group_3_0__1__Impl"


    // $ANTLR start "rule__GenUsageBlock__Group_3_1__0"
    // InternalLibrettoProjectProfile.g:3870:1: rule__GenUsageBlock__Group_3_1__0 : rule__GenUsageBlock__Group_3_1__0__Impl rule__GenUsageBlock__Group_3_1__1 ;
    public final void rule__GenUsageBlock__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3874:1: ( rule__GenUsageBlock__Group_3_1__0__Impl rule__GenUsageBlock__Group_3_1__1 )
            // InternalLibrettoProjectProfile.g:3875:2: rule__GenUsageBlock__Group_3_1__0__Impl rule__GenUsageBlock__Group_3_1__1
            {
            pushFollow(FOLLOW_11);
            rule__GenUsageBlock__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GenUsageBlock__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenUsageBlock__Group_3_1__0"


    // $ANTLR start "rule__GenUsageBlock__Group_3_1__0__Impl"
    // InternalLibrettoProjectProfile.g:3882:1: rule__GenUsageBlock__Group_3_1__0__Impl : ( 'secondary' ) ;
    public final void rule__GenUsageBlock__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3886:1: ( ( 'secondary' ) )
            // InternalLibrettoProjectProfile.g:3887:1: ( 'secondary' )
            {
            // InternalLibrettoProjectProfile.g:3887:1: ( 'secondary' )
            // InternalLibrettoProjectProfile.g:3888:2: 'secondary'
            {
             before(grammarAccess.getGenUsageBlockAccess().getSecondaryKeyword_3_1_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getGenUsageBlockAccess().getSecondaryKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenUsageBlock__Group_3_1__0__Impl"


    // $ANTLR start "rule__GenUsageBlock__Group_3_1__1"
    // InternalLibrettoProjectProfile.g:3897:1: rule__GenUsageBlock__Group_3_1__1 : rule__GenUsageBlock__Group_3_1__1__Impl ;
    public final void rule__GenUsageBlock__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3901:1: ( rule__GenUsageBlock__Group_3_1__1__Impl )
            // InternalLibrettoProjectProfile.g:3902:2: rule__GenUsageBlock__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GenUsageBlock__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenUsageBlock__Group_3_1__1"


    // $ANTLR start "rule__GenUsageBlock__Group_3_1__1__Impl"
    // InternalLibrettoProjectProfile.g:3908:1: rule__GenUsageBlock__Group_3_1__1__Impl : ( ( rule__GenUsageBlock__SecondaryProvidersAssignment_3_1_1 ) ) ;
    public final void rule__GenUsageBlock__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3912:1: ( ( ( rule__GenUsageBlock__SecondaryProvidersAssignment_3_1_1 ) ) )
            // InternalLibrettoProjectProfile.g:3913:1: ( ( rule__GenUsageBlock__SecondaryProvidersAssignment_3_1_1 ) )
            {
            // InternalLibrettoProjectProfile.g:3913:1: ( ( rule__GenUsageBlock__SecondaryProvidersAssignment_3_1_1 ) )
            // InternalLibrettoProjectProfile.g:3914:2: ( rule__GenUsageBlock__SecondaryProvidersAssignment_3_1_1 )
            {
             before(grammarAccess.getGenUsageBlockAccess().getSecondaryProvidersAssignment_3_1_1()); 
            // InternalLibrettoProjectProfile.g:3915:2: ( rule__GenUsageBlock__SecondaryProvidersAssignment_3_1_1 )
            // InternalLibrettoProjectProfile.g:3915:3: rule__GenUsageBlock__SecondaryProvidersAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__GenUsageBlock__SecondaryProvidersAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getGenUsageBlockAccess().getSecondaryProvidersAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenUsageBlock__Group_3_1__1__Impl"


    // $ANTLR start "rule__GenEscalationBlock__Group__0"
    // InternalLibrettoProjectProfile.g:3924:1: rule__GenEscalationBlock__Group__0 : rule__GenEscalationBlock__Group__0__Impl rule__GenEscalationBlock__Group__1 ;
    public final void rule__GenEscalationBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3928:1: ( rule__GenEscalationBlock__Group__0__Impl rule__GenEscalationBlock__Group__1 )
            // InternalLibrettoProjectProfile.g:3929:2: rule__GenEscalationBlock__Group__0__Impl rule__GenEscalationBlock__Group__1
            {
            pushFollow(FOLLOW_40);
            rule__GenEscalationBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GenEscalationBlock__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenEscalationBlock__Group__0"


    // $ANTLR start "rule__GenEscalationBlock__Group__0__Impl"
    // InternalLibrettoProjectProfile.g:3936:1: rule__GenEscalationBlock__Group__0__Impl : ( () ) ;
    public final void rule__GenEscalationBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3940:1: ( ( () ) )
            // InternalLibrettoProjectProfile.g:3941:1: ( () )
            {
            // InternalLibrettoProjectProfile.g:3941:1: ( () )
            // InternalLibrettoProjectProfile.g:3942:2: ()
            {
             before(grammarAccess.getGenEscalationBlockAccess().getGenEscalationBlockAction_0()); 
            // InternalLibrettoProjectProfile.g:3943:2: ()
            // InternalLibrettoProjectProfile.g:3943:3: 
            {
            }

             after(grammarAccess.getGenEscalationBlockAccess().getGenEscalationBlockAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenEscalationBlock__Group__0__Impl"


    // $ANTLR start "rule__GenEscalationBlock__Group__1"
    // InternalLibrettoProjectProfile.g:3951:1: rule__GenEscalationBlock__Group__1 : rule__GenEscalationBlock__Group__1__Impl rule__GenEscalationBlock__Group__2 ;
    public final void rule__GenEscalationBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3955:1: ( rule__GenEscalationBlock__Group__1__Impl rule__GenEscalationBlock__Group__2 )
            // InternalLibrettoProjectProfile.g:3956:2: rule__GenEscalationBlock__Group__1__Impl rule__GenEscalationBlock__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__GenEscalationBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GenEscalationBlock__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenEscalationBlock__Group__1"


    // $ANTLR start "rule__GenEscalationBlock__Group__1__Impl"
    // InternalLibrettoProjectProfile.g:3963:1: rule__GenEscalationBlock__Group__1__Impl : ( 'escalation' ) ;
    public final void rule__GenEscalationBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3967:1: ( ( 'escalation' ) )
            // InternalLibrettoProjectProfile.g:3968:1: ( 'escalation' )
            {
            // InternalLibrettoProjectProfile.g:3968:1: ( 'escalation' )
            // InternalLibrettoProjectProfile.g:3969:2: 'escalation'
            {
             before(grammarAccess.getGenEscalationBlockAccess().getEscalationKeyword_1()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getGenEscalationBlockAccess().getEscalationKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenEscalationBlock__Group__1__Impl"


    // $ANTLR start "rule__GenEscalationBlock__Group__2"
    // InternalLibrettoProjectProfile.g:3978:1: rule__GenEscalationBlock__Group__2 : rule__GenEscalationBlock__Group__2__Impl rule__GenEscalationBlock__Group__3 ;
    public final void rule__GenEscalationBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3982:1: ( rule__GenEscalationBlock__Group__2__Impl rule__GenEscalationBlock__Group__3 )
            // InternalLibrettoProjectProfile.g:3983:2: rule__GenEscalationBlock__Group__2__Impl rule__GenEscalationBlock__Group__3
            {
            pushFollow(FOLLOW_41);
            rule__GenEscalationBlock__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GenEscalationBlock__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenEscalationBlock__Group__2"


    // $ANTLR start "rule__GenEscalationBlock__Group__2__Impl"
    // InternalLibrettoProjectProfile.g:3990:1: rule__GenEscalationBlock__Group__2__Impl : ( '{' ) ;
    public final void rule__GenEscalationBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3994:1: ( ( '{' ) )
            // InternalLibrettoProjectProfile.g:3995:1: ( '{' )
            {
            // InternalLibrettoProjectProfile.g:3995:1: ( '{' )
            // InternalLibrettoProjectProfile.g:3996:2: '{'
            {
             before(grammarAccess.getGenEscalationBlockAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getGenEscalationBlockAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenEscalationBlock__Group__2__Impl"


    // $ANTLR start "rule__GenEscalationBlock__Group__3"
    // InternalLibrettoProjectProfile.g:4005:1: rule__GenEscalationBlock__Group__3 : rule__GenEscalationBlock__Group__3__Impl rule__GenEscalationBlock__Group__4 ;
    public final void rule__GenEscalationBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4009:1: ( rule__GenEscalationBlock__Group__3__Impl rule__GenEscalationBlock__Group__4 )
            // InternalLibrettoProjectProfile.g:4010:2: rule__GenEscalationBlock__Group__3__Impl rule__GenEscalationBlock__Group__4
            {
            pushFollow(FOLLOW_41);
            rule__GenEscalationBlock__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GenEscalationBlock__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenEscalationBlock__Group__3"


    // $ANTLR start "rule__GenEscalationBlock__Group__3__Impl"
    // InternalLibrettoProjectProfile.g:4017:1: rule__GenEscalationBlock__Group__3__Impl : ( ( rule__GenEscalationBlock__Alternatives_3 )* ) ;
    public final void rule__GenEscalationBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4021:1: ( ( ( rule__GenEscalationBlock__Alternatives_3 )* ) )
            // InternalLibrettoProjectProfile.g:4022:1: ( ( rule__GenEscalationBlock__Alternatives_3 )* )
            {
            // InternalLibrettoProjectProfile.g:4022:1: ( ( rule__GenEscalationBlock__Alternatives_3 )* )
            // InternalLibrettoProjectProfile.g:4023:2: ( rule__GenEscalationBlock__Alternatives_3 )*
            {
             before(grammarAccess.getGenEscalationBlockAccess().getAlternatives_3()); 
            // InternalLibrettoProjectProfile.g:4024:2: ( rule__GenEscalationBlock__Alternatives_3 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=61 && LA30_0<=62)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:4024:3: rule__GenEscalationBlock__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_42);
            	    rule__GenEscalationBlock__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getGenEscalationBlockAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenEscalationBlock__Group__3__Impl"


    // $ANTLR start "rule__GenEscalationBlock__Group__4"
    // InternalLibrettoProjectProfile.g:4032:1: rule__GenEscalationBlock__Group__4 : rule__GenEscalationBlock__Group__4__Impl ;
    public final void rule__GenEscalationBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4036:1: ( rule__GenEscalationBlock__Group__4__Impl )
            // InternalLibrettoProjectProfile.g:4037:2: rule__GenEscalationBlock__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GenEscalationBlock__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenEscalationBlock__Group__4"


    // $ANTLR start "rule__GenEscalationBlock__Group__4__Impl"
    // InternalLibrettoProjectProfile.g:4043:1: rule__GenEscalationBlock__Group__4__Impl : ( '}' ) ;
    public final void rule__GenEscalationBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4047:1: ( ( '}' ) )
            // InternalLibrettoProjectProfile.g:4048:1: ( '}' )
            {
            // InternalLibrettoProjectProfile.g:4048:1: ( '}' )
            // InternalLibrettoProjectProfile.g:4049:2: '}'
            {
             before(grammarAccess.getGenEscalationBlockAccess().getRightCurlyBracketKeyword_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getGenEscalationBlockAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenEscalationBlock__Group__4__Impl"


    // $ANTLR start "rule__GenEscalationBlock__Group_3_0__0"
    // InternalLibrettoProjectProfile.g:4059:1: rule__GenEscalationBlock__Group_3_0__0 : rule__GenEscalationBlock__Group_3_0__0__Impl rule__GenEscalationBlock__Group_3_0__1 ;
    public final void rule__GenEscalationBlock__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4063:1: ( rule__GenEscalationBlock__Group_3_0__0__Impl rule__GenEscalationBlock__Group_3_0__1 )
            // InternalLibrettoProjectProfile.g:4064:2: rule__GenEscalationBlock__Group_3_0__0__Impl rule__GenEscalationBlock__Group_3_0__1
            {
            pushFollow(FOLLOW_21);
            rule__GenEscalationBlock__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GenEscalationBlock__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenEscalationBlock__Group_3_0__0"


    // $ANTLR start "rule__GenEscalationBlock__Group_3_0__0__Impl"
    // InternalLibrettoProjectProfile.g:4071:1: rule__GenEscalationBlock__Group_3_0__0__Impl : ( 'enabled' ) ;
    public final void rule__GenEscalationBlock__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4075:1: ( ( 'enabled' ) )
            // InternalLibrettoProjectProfile.g:4076:1: ( 'enabled' )
            {
            // InternalLibrettoProjectProfile.g:4076:1: ( 'enabled' )
            // InternalLibrettoProjectProfile.g:4077:2: 'enabled'
            {
             before(grammarAccess.getGenEscalationBlockAccess().getEnabledKeyword_3_0_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getGenEscalationBlockAccess().getEnabledKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenEscalationBlock__Group_3_0__0__Impl"


    // $ANTLR start "rule__GenEscalationBlock__Group_3_0__1"
    // InternalLibrettoProjectProfile.g:4086:1: rule__GenEscalationBlock__Group_3_0__1 : rule__GenEscalationBlock__Group_3_0__1__Impl ;
    public final void rule__GenEscalationBlock__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4090:1: ( rule__GenEscalationBlock__Group_3_0__1__Impl )
            // InternalLibrettoProjectProfile.g:4091:2: rule__GenEscalationBlock__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GenEscalationBlock__Group_3_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenEscalationBlock__Group_3_0__1"


    // $ANTLR start "rule__GenEscalationBlock__Group_3_0__1__Impl"
    // InternalLibrettoProjectProfile.g:4097:1: rule__GenEscalationBlock__Group_3_0__1__Impl : ( ( rule__GenEscalationBlock__EnabledsAssignment_3_0_1 ) ) ;
    public final void rule__GenEscalationBlock__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4101:1: ( ( ( rule__GenEscalationBlock__EnabledsAssignment_3_0_1 ) ) )
            // InternalLibrettoProjectProfile.g:4102:1: ( ( rule__GenEscalationBlock__EnabledsAssignment_3_0_1 ) )
            {
            // InternalLibrettoProjectProfile.g:4102:1: ( ( rule__GenEscalationBlock__EnabledsAssignment_3_0_1 ) )
            // InternalLibrettoProjectProfile.g:4103:2: ( rule__GenEscalationBlock__EnabledsAssignment_3_0_1 )
            {
             before(grammarAccess.getGenEscalationBlockAccess().getEnabledsAssignment_3_0_1()); 
            // InternalLibrettoProjectProfile.g:4104:2: ( rule__GenEscalationBlock__EnabledsAssignment_3_0_1 )
            // InternalLibrettoProjectProfile.g:4104:3: rule__GenEscalationBlock__EnabledsAssignment_3_0_1
            {
            pushFollow(FOLLOW_2);
            rule__GenEscalationBlock__EnabledsAssignment_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getGenEscalationBlockAccess().getEnabledsAssignment_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenEscalationBlock__Group_3_0__1__Impl"


    // $ANTLR start "rule__GenEscalationBlock__Group_3_1__0"
    // InternalLibrettoProjectProfile.g:4113:1: rule__GenEscalationBlock__Group_3_1__0 : rule__GenEscalationBlock__Group_3_1__0__Impl rule__GenEscalationBlock__Group_3_1__1 ;
    public final void rule__GenEscalationBlock__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4117:1: ( rule__GenEscalationBlock__Group_3_1__0__Impl rule__GenEscalationBlock__Group_3_1__1 )
            // InternalLibrettoProjectProfile.g:4118:2: rule__GenEscalationBlock__Group_3_1__0__Impl rule__GenEscalationBlock__Group_3_1__1
            {
            pushFollow(FOLLOW_20);
            rule__GenEscalationBlock__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GenEscalationBlock__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenEscalationBlock__Group_3_1__0"


    // $ANTLR start "rule__GenEscalationBlock__Group_3_1__0__Impl"
    // InternalLibrettoProjectProfile.g:4125:1: rule__GenEscalationBlock__Group_3_1__0__Impl : ( 'escalateAtRetry' ) ;
    public final void rule__GenEscalationBlock__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4129:1: ( ( 'escalateAtRetry' ) )
            // InternalLibrettoProjectProfile.g:4130:1: ( 'escalateAtRetry' )
            {
            // InternalLibrettoProjectProfile.g:4130:1: ( 'escalateAtRetry' )
            // InternalLibrettoProjectProfile.g:4131:2: 'escalateAtRetry'
            {
             before(grammarAccess.getGenEscalationBlockAccess().getEscalateAtRetryKeyword_3_1_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getGenEscalationBlockAccess().getEscalateAtRetryKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenEscalationBlock__Group_3_1__0__Impl"


    // $ANTLR start "rule__GenEscalationBlock__Group_3_1__1"
    // InternalLibrettoProjectProfile.g:4140:1: rule__GenEscalationBlock__Group_3_1__1 : rule__GenEscalationBlock__Group_3_1__1__Impl ;
    public final void rule__GenEscalationBlock__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4144:1: ( rule__GenEscalationBlock__Group_3_1__1__Impl )
            // InternalLibrettoProjectProfile.g:4145:2: rule__GenEscalationBlock__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GenEscalationBlock__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenEscalationBlock__Group_3_1__1"


    // $ANTLR start "rule__GenEscalationBlock__Group_3_1__1__Impl"
    // InternalLibrettoProjectProfile.g:4151:1: rule__GenEscalationBlock__Group_3_1__1__Impl : ( ( rule__GenEscalationBlock__EscalateAtRetriesAssignment_3_1_1 ) ) ;
    public final void rule__GenEscalationBlock__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4155:1: ( ( ( rule__GenEscalationBlock__EscalateAtRetriesAssignment_3_1_1 ) ) )
            // InternalLibrettoProjectProfile.g:4156:1: ( ( rule__GenEscalationBlock__EscalateAtRetriesAssignment_3_1_1 ) )
            {
            // InternalLibrettoProjectProfile.g:4156:1: ( ( rule__GenEscalationBlock__EscalateAtRetriesAssignment_3_1_1 ) )
            // InternalLibrettoProjectProfile.g:4157:2: ( rule__GenEscalationBlock__EscalateAtRetriesAssignment_3_1_1 )
            {
             before(grammarAccess.getGenEscalationBlockAccess().getEscalateAtRetriesAssignment_3_1_1()); 
            // InternalLibrettoProjectProfile.g:4158:2: ( rule__GenEscalationBlock__EscalateAtRetriesAssignment_3_1_1 )
            // InternalLibrettoProjectProfile.g:4158:3: rule__GenEscalationBlock__EscalateAtRetriesAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__GenEscalationBlock__EscalateAtRetriesAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getGenEscalationBlockAccess().getEscalateAtRetriesAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenEscalationBlock__Group_3_1__1__Impl"


    // $ANTLR start "rule__SurfaceBlock__Group__0"
    // InternalLibrettoProjectProfile.g:4167:1: rule__SurfaceBlock__Group__0 : rule__SurfaceBlock__Group__0__Impl rule__SurfaceBlock__Group__1 ;
    public final void rule__SurfaceBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4171:1: ( rule__SurfaceBlock__Group__0__Impl rule__SurfaceBlock__Group__1 )
            // InternalLibrettoProjectProfile.g:4172:2: rule__SurfaceBlock__Group__0__Impl rule__SurfaceBlock__Group__1
            {
            pushFollow(FOLLOW_43);
            rule__SurfaceBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SurfaceBlock__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurfaceBlock__Group__0"


    // $ANTLR start "rule__SurfaceBlock__Group__0__Impl"
    // InternalLibrettoProjectProfile.g:4179:1: rule__SurfaceBlock__Group__0__Impl : ( () ) ;
    public final void rule__SurfaceBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4183:1: ( ( () ) )
            // InternalLibrettoProjectProfile.g:4184:1: ( () )
            {
            // InternalLibrettoProjectProfile.g:4184:1: ( () )
            // InternalLibrettoProjectProfile.g:4185:2: ()
            {
             before(grammarAccess.getSurfaceBlockAccess().getSurfaceBlockAction_0()); 
            // InternalLibrettoProjectProfile.g:4186:2: ()
            // InternalLibrettoProjectProfile.g:4186:3: 
            {
            }

             after(grammarAccess.getSurfaceBlockAccess().getSurfaceBlockAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurfaceBlock__Group__0__Impl"


    // $ANTLR start "rule__SurfaceBlock__Group__1"
    // InternalLibrettoProjectProfile.g:4194:1: rule__SurfaceBlock__Group__1 : rule__SurfaceBlock__Group__1__Impl rule__SurfaceBlock__Group__2 ;
    public final void rule__SurfaceBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4198:1: ( rule__SurfaceBlock__Group__1__Impl rule__SurfaceBlock__Group__2 )
            // InternalLibrettoProjectProfile.g:4199:2: rule__SurfaceBlock__Group__1__Impl rule__SurfaceBlock__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__SurfaceBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SurfaceBlock__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurfaceBlock__Group__1"


    // $ANTLR start "rule__SurfaceBlock__Group__1__Impl"
    // InternalLibrettoProjectProfile.g:4206:1: rule__SurfaceBlock__Group__1__Impl : ( 'surface' ) ;
    public final void rule__SurfaceBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4210:1: ( ( 'surface' ) )
            // InternalLibrettoProjectProfile.g:4211:1: ( 'surface' )
            {
            // InternalLibrettoProjectProfile.g:4211:1: ( 'surface' )
            // InternalLibrettoProjectProfile.g:4212:2: 'surface'
            {
             before(grammarAccess.getSurfaceBlockAccess().getSurfaceKeyword_1()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getSurfaceBlockAccess().getSurfaceKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurfaceBlock__Group__1__Impl"


    // $ANTLR start "rule__SurfaceBlock__Group__2"
    // InternalLibrettoProjectProfile.g:4221:1: rule__SurfaceBlock__Group__2 : rule__SurfaceBlock__Group__2__Impl rule__SurfaceBlock__Group__3 ;
    public final void rule__SurfaceBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4225:1: ( rule__SurfaceBlock__Group__2__Impl rule__SurfaceBlock__Group__3 )
            // InternalLibrettoProjectProfile.g:4226:2: rule__SurfaceBlock__Group__2__Impl rule__SurfaceBlock__Group__3
            {
            pushFollow(FOLLOW_44);
            rule__SurfaceBlock__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SurfaceBlock__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurfaceBlock__Group__2"


    // $ANTLR start "rule__SurfaceBlock__Group__2__Impl"
    // InternalLibrettoProjectProfile.g:4233:1: rule__SurfaceBlock__Group__2__Impl : ( '{' ) ;
    public final void rule__SurfaceBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4237:1: ( ( '{' ) )
            // InternalLibrettoProjectProfile.g:4238:1: ( '{' )
            {
            // InternalLibrettoProjectProfile.g:4238:1: ( '{' )
            // InternalLibrettoProjectProfile.g:4239:2: '{'
            {
             before(grammarAccess.getSurfaceBlockAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getSurfaceBlockAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurfaceBlock__Group__2__Impl"


    // $ANTLR start "rule__SurfaceBlock__Group__3"
    // InternalLibrettoProjectProfile.g:4248:1: rule__SurfaceBlock__Group__3 : rule__SurfaceBlock__Group__3__Impl rule__SurfaceBlock__Group__4 ;
    public final void rule__SurfaceBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4252:1: ( rule__SurfaceBlock__Group__3__Impl rule__SurfaceBlock__Group__4 )
            // InternalLibrettoProjectProfile.g:4253:2: rule__SurfaceBlock__Group__3__Impl rule__SurfaceBlock__Group__4
            {
            pushFollow(FOLLOW_44);
            rule__SurfaceBlock__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SurfaceBlock__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurfaceBlock__Group__3"


    // $ANTLR start "rule__SurfaceBlock__Group__3__Impl"
    // InternalLibrettoProjectProfile.g:4260:1: rule__SurfaceBlock__Group__3__Impl : ( ( rule__SurfaceBlock__ElementsAssignment_3 )* ) ;
    public final void rule__SurfaceBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4264:1: ( ( ( rule__SurfaceBlock__ElementsAssignment_3 )* ) )
            // InternalLibrettoProjectProfile.g:4265:1: ( ( rule__SurfaceBlock__ElementsAssignment_3 )* )
            {
            // InternalLibrettoProjectProfile.g:4265:1: ( ( rule__SurfaceBlock__ElementsAssignment_3 )* )
            // InternalLibrettoProjectProfile.g:4266:2: ( rule__SurfaceBlock__ElementsAssignment_3 )*
            {
             before(grammarAccess.getSurfaceBlockAccess().getElementsAssignment_3()); 
            // InternalLibrettoProjectProfile.g:4267:2: ( rule__SurfaceBlock__ElementsAssignment_3 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==64||LA31_0==66||LA31_0==70||LA31_0==72||LA31_0==74) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:4267:3: rule__SurfaceBlock__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_45);
            	    rule__SurfaceBlock__ElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getSurfaceBlockAccess().getElementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurfaceBlock__Group__3__Impl"


    // $ANTLR start "rule__SurfaceBlock__Group__4"
    // InternalLibrettoProjectProfile.g:4275:1: rule__SurfaceBlock__Group__4 : rule__SurfaceBlock__Group__4__Impl ;
    public final void rule__SurfaceBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4279:1: ( rule__SurfaceBlock__Group__4__Impl )
            // InternalLibrettoProjectProfile.g:4280:2: rule__SurfaceBlock__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SurfaceBlock__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurfaceBlock__Group__4"


    // $ANTLR start "rule__SurfaceBlock__Group__4__Impl"
    // InternalLibrettoProjectProfile.g:4286:1: rule__SurfaceBlock__Group__4__Impl : ( '}' ) ;
    public final void rule__SurfaceBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4290:1: ( ( '}' ) )
            // InternalLibrettoProjectProfile.g:4291:1: ( '}' )
            {
            // InternalLibrettoProjectProfile.g:4291:1: ( '}' )
            // InternalLibrettoProjectProfile.g:4292:2: '}'
            {
             before(grammarAccess.getSurfaceBlockAccess().getRightCurlyBracketKeyword_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getSurfaceBlockAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurfaceBlock__Group__4__Impl"


    // $ANTLR start "rule__ScopedSurface__Group__0"
    // InternalLibrettoProjectProfile.g:4302:1: rule__ScopedSurface__Group__0 : rule__ScopedSurface__Group__0__Impl rule__ScopedSurface__Group__1 ;
    public final void rule__ScopedSurface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4306:1: ( rule__ScopedSurface__Group__0__Impl rule__ScopedSurface__Group__1 )
            // InternalLibrettoProjectProfile.g:4307:2: rule__ScopedSurface__Group__0__Impl rule__ScopedSurface__Group__1
            {
            pushFollow(FOLLOW_46);
            rule__ScopedSurface__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScopedSurface__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopedSurface__Group__0"


    // $ANTLR start "rule__ScopedSurface__Group__0__Impl"
    // InternalLibrettoProjectProfile.g:4314:1: rule__ScopedSurface__Group__0__Impl : ( 'for' ) ;
    public final void rule__ScopedSurface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4318:1: ( ( 'for' ) )
            // InternalLibrettoProjectProfile.g:4319:1: ( 'for' )
            {
            // InternalLibrettoProjectProfile.g:4319:1: ( 'for' )
            // InternalLibrettoProjectProfile.g:4320:2: 'for'
            {
             before(grammarAccess.getScopedSurfaceAccess().getForKeyword_0()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getScopedSurfaceAccess().getForKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopedSurface__Group__0__Impl"


    // $ANTLR start "rule__ScopedSurface__Group__1"
    // InternalLibrettoProjectProfile.g:4329:1: rule__ScopedSurface__Group__1 : rule__ScopedSurface__Group__1__Impl rule__ScopedSurface__Group__2 ;
    public final void rule__ScopedSurface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4333:1: ( rule__ScopedSurface__Group__1__Impl rule__ScopedSurface__Group__2 )
            // InternalLibrettoProjectProfile.g:4334:2: rule__ScopedSurface__Group__1__Impl rule__ScopedSurface__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ScopedSurface__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScopedSurface__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopedSurface__Group__1"


    // $ANTLR start "rule__ScopedSurface__Group__1__Impl"
    // InternalLibrettoProjectProfile.g:4341:1: rule__ScopedSurface__Group__1__Impl : ( ( rule__ScopedSurface__Alternatives_1 ) ) ;
    public final void rule__ScopedSurface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4345:1: ( ( ( rule__ScopedSurface__Alternatives_1 ) ) )
            // InternalLibrettoProjectProfile.g:4346:1: ( ( rule__ScopedSurface__Alternatives_1 ) )
            {
            // InternalLibrettoProjectProfile.g:4346:1: ( ( rule__ScopedSurface__Alternatives_1 ) )
            // InternalLibrettoProjectProfile.g:4347:2: ( rule__ScopedSurface__Alternatives_1 )
            {
             before(grammarAccess.getScopedSurfaceAccess().getAlternatives_1()); 
            // InternalLibrettoProjectProfile.g:4348:2: ( rule__ScopedSurface__Alternatives_1 )
            // InternalLibrettoProjectProfile.g:4348:3: rule__ScopedSurface__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__ScopedSurface__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getScopedSurfaceAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopedSurface__Group__1__Impl"


    // $ANTLR start "rule__ScopedSurface__Group__2"
    // InternalLibrettoProjectProfile.g:4356:1: rule__ScopedSurface__Group__2 : rule__ScopedSurface__Group__2__Impl rule__ScopedSurface__Group__3 ;
    public final void rule__ScopedSurface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4360:1: ( rule__ScopedSurface__Group__2__Impl rule__ScopedSurface__Group__3 )
            // InternalLibrettoProjectProfile.g:4361:2: rule__ScopedSurface__Group__2__Impl rule__ScopedSurface__Group__3
            {
            pushFollow(FOLLOW_44);
            rule__ScopedSurface__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScopedSurface__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopedSurface__Group__2"


    // $ANTLR start "rule__ScopedSurface__Group__2__Impl"
    // InternalLibrettoProjectProfile.g:4368:1: rule__ScopedSurface__Group__2__Impl : ( '{' ) ;
    public final void rule__ScopedSurface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4372:1: ( ( '{' ) )
            // InternalLibrettoProjectProfile.g:4373:1: ( '{' )
            {
            // InternalLibrettoProjectProfile.g:4373:1: ( '{' )
            // InternalLibrettoProjectProfile.g:4374:2: '{'
            {
             before(grammarAccess.getScopedSurfaceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getScopedSurfaceAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopedSurface__Group__2__Impl"


    // $ANTLR start "rule__ScopedSurface__Group__3"
    // InternalLibrettoProjectProfile.g:4383:1: rule__ScopedSurface__Group__3 : rule__ScopedSurface__Group__3__Impl rule__ScopedSurface__Group__4 ;
    public final void rule__ScopedSurface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4387:1: ( rule__ScopedSurface__Group__3__Impl rule__ScopedSurface__Group__4 )
            // InternalLibrettoProjectProfile.g:4388:2: rule__ScopedSurface__Group__3__Impl rule__ScopedSurface__Group__4
            {
            pushFollow(FOLLOW_44);
            rule__ScopedSurface__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScopedSurface__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopedSurface__Group__3"


    // $ANTLR start "rule__ScopedSurface__Group__3__Impl"
    // InternalLibrettoProjectProfile.g:4395:1: rule__ScopedSurface__Group__3__Impl : ( ( rule__ScopedSurface__RulesAssignment_3 )* ) ;
    public final void rule__ScopedSurface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4399:1: ( ( ( rule__ScopedSurface__RulesAssignment_3 )* ) )
            // InternalLibrettoProjectProfile.g:4400:1: ( ( rule__ScopedSurface__RulesAssignment_3 )* )
            {
            // InternalLibrettoProjectProfile.g:4400:1: ( ( rule__ScopedSurface__RulesAssignment_3 )* )
            // InternalLibrettoProjectProfile.g:4401:2: ( rule__ScopedSurface__RulesAssignment_3 )*
            {
             before(grammarAccess.getScopedSurfaceAccess().getRulesAssignment_3()); 
            // InternalLibrettoProjectProfile.g:4402:2: ( rule__ScopedSurface__RulesAssignment_3 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==66||LA32_0==70||LA32_0==72||LA32_0==74) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:4402:3: rule__ScopedSurface__RulesAssignment_3
            	    {
            	    pushFollow(FOLLOW_45);
            	    rule__ScopedSurface__RulesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getScopedSurfaceAccess().getRulesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopedSurface__Group__3__Impl"


    // $ANTLR start "rule__ScopedSurface__Group__4"
    // InternalLibrettoProjectProfile.g:4410:1: rule__ScopedSurface__Group__4 : rule__ScopedSurface__Group__4__Impl ;
    public final void rule__ScopedSurface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4414:1: ( rule__ScopedSurface__Group__4__Impl )
            // InternalLibrettoProjectProfile.g:4415:2: rule__ScopedSurface__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ScopedSurface__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopedSurface__Group__4"


    // $ANTLR start "rule__ScopedSurface__Group__4__Impl"
    // InternalLibrettoProjectProfile.g:4421:1: rule__ScopedSurface__Group__4__Impl : ( '}' ) ;
    public final void rule__ScopedSurface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4425:1: ( ( '}' ) )
            // InternalLibrettoProjectProfile.g:4426:1: ( '}' )
            {
            // InternalLibrettoProjectProfile.g:4426:1: ( '}' )
            // InternalLibrettoProjectProfile.g:4427:2: '}'
            {
             before(grammarAccess.getScopedSurfaceAccess().getRightCurlyBracketKeyword_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getScopedSurfaceAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopedSurface__Group__4__Impl"


    // $ANTLR start "rule__ScopedSurface__Group_1_0__0"
    // InternalLibrettoProjectProfile.g:4437:1: rule__ScopedSurface__Group_1_0__0 : rule__ScopedSurface__Group_1_0__0__Impl rule__ScopedSurface__Group_1_0__1 ;
    public final void rule__ScopedSurface__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4441:1: ( rule__ScopedSurface__Group_1_0__0__Impl rule__ScopedSurface__Group_1_0__1 )
            // InternalLibrettoProjectProfile.g:4442:2: rule__ScopedSurface__Group_1_0__0__Impl rule__ScopedSurface__Group_1_0__1
            {
            pushFollow(FOLLOW_11);
            rule__ScopedSurface__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScopedSurface__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopedSurface__Group_1_0__0"


    // $ANTLR start "rule__ScopedSurface__Group_1_0__0__Impl"
    // InternalLibrettoProjectProfile.g:4449:1: rule__ScopedSurface__Group_1_0__0__Impl : ( 'module' ) ;
    public final void rule__ScopedSurface__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4453:1: ( ( 'module' ) )
            // InternalLibrettoProjectProfile.g:4454:1: ( 'module' )
            {
            // InternalLibrettoProjectProfile.g:4454:1: ( 'module' )
            // InternalLibrettoProjectProfile.g:4455:2: 'module'
            {
             before(grammarAccess.getScopedSurfaceAccess().getModuleKeyword_1_0_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getScopedSurfaceAccess().getModuleKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopedSurface__Group_1_0__0__Impl"


    // $ANTLR start "rule__ScopedSurface__Group_1_0__1"
    // InternalLibrettoProjectProfile.g:4464:1: rule__ScopedSurface__Group_1_0__1 : rule__ScopedSurface__Group_1_0__1__Impl ;
    public final void rule__ScopedSurface__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4468:1: ( rule__ScopedSurface__Group_1_0__1__Impl )
            // InternalLibrettoProjectProfile.g:4469:2: rule__ScopedSurface__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ScopedSurface__Group_1_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopedSurface__Group_1_0__1"


    // $ANTLR start "rule__ScopedSurface__Group_1_0__1__Impl"
    // InternalLibrettoProjectProfile.g:4475:1: rule__ScopedSurface__Group_1_0__1__Impl : ( ( rule__ScopedSurface__ModuleIdAssignment_1_0_1 ) ) ;
    public final void rule__ScopedSurface__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4479:1: ( ( ( rule__ScopedSurface__ModuleIdAssignment_1_0_1 ) ) )
            // InternalLibrettoProjectProfile.g:4480:1: ( ( rule__ScopedSurface__ModuleIdAssignment_1_0_1 ) )
            {
            // InternalLibrettoProjectProfile.g:4480:1: ( ( rule__ScopedSurface__ModuleIdAssignment_1_0_1 ) )
            // InternalLibrettoProjectProfile.g:4481:2: ( rule__ScopedSurface__ModuleIdAssignment_1_0_1 )
            {
             before(grammarAccess.getScopedSurfaceAccess().getModuleIdAssignment_1_0_1()); 
            // InternalLibrettoProjectProfile.g:4482:2: ( rule__ScopedSurface__ModuleIdAssignment_1_0_1 )
            // InternalLibrettoProjectProfile.g:4482:3: rule__ScopedSurface__ModuleIdAssignment_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__ScopedSurface__ModuleIdAssignment_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getScopedSurfaceAccess().getModuleIdAssignment_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopedSurface__Group_1_0__1__Impl"


    // $ANTLR start "rule__ScopedSurface__Group_1_1__0"
    // InternalLibrettoProjectProfile.g:4491:1: rule__ScopedSurface__Group_1_1__0 : rule__ScopedSurface__Group_1_1__0__Impl rule__ScopedSurface__Group_1_1__1 ;
    public final void rule__ScopedSurface__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4495:1: ( rule__ScopedSurface__Group_1_1__0__Impl rule__ScopedSurface__Group_1_1__1 )
            // InternalLibrettoProjectProfile.g:4496:2: rule__ScopedSurface__Group_1_1__0__Impl rule__ScopedSurface__Group_1_1__1
            {
            pushFollow(FOLLOW_11);
            rule__ScopedSurface__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScopedSurface__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopedSurface__Group_1_1__0"


    // $ANTLR start "rule__ScopedSurface__Group_1_1__0__Impl"
    // InternalLibrettoProjectProfile.g:4503:1: rule__ScopedSurface__Group_1_1__0__Impl : ( 'spec' ) ;
    public final void rule__ScopedSurface__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4507:1: ( ( 'spec' ) )
            // InternalLibrettoProjectProfile.g:4508:1: ( 'spec' )
            {
            // InternalLibrettoProjectProfile.g:4508:1: ( 'spec' )
            // InternalLibrettoProjectProfile.g:4509:2: 'spec'
            {
             before(grammarAccess.getScopedSurfaceAccess().getSpecKeyword_1_1_0()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getScopedSurfaceAccess().getSpecKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopedSurface__Group_1_1__0__Impl"


    // $ANTLR start "rule__ScopedSurface__Group_1_1__1"
    // InternalLibrettoProjectProfile.g:4518:1: rule__ScopedSurface__Group_1_1__1 : rule__ScopedSurface__Group_1_1__1__Impl ;
    public final void rule__ScopedSurface__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4522:1: ( rule__ScopedSurface__Group_1_1__1__Impl )
            // InternalLibrettoProjectProfile.g:4523:2: rule__ScopedSurface__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ScopedSurface__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopedSurface__Group_1_1__1"


    // $ANTLR start "rule__ScopedSurface__Group_1_1__1__Impl"
    // InternalLibrettoProjectProfile.g:4529:1: rule__ScopedSurface__Group_1_1__1__Impl : ( ( rule__ScopedSurface__SpecIdAssignment_1_1_1 ) ) ;
    public final void rule__ScopedSurface__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4533:1: ( ( ( rule__ScopedSurface__SpecIdAssignment_1_1_1 ) ) )
            // InternalLibrettoProjectProfile.g:4534:1: ( ( rule__ScopedSurface__SpecIdAssignment_1_1_1 ) )
            {
            // InternalLibrettoProjectProfile.g:4534:1: ( ( rule__ScopedSurface__SpecIdAssignment_1_1_1 ) )
            // InternalLibrettoProjectProfile.g:4535:2: ( rule__ScopedSurface__SpecIdAssignment_1_1_1 )
            {
             before(grammarAccess.getScopedSurfaceAccess().getSpecIdAssignment_1_1_1()); 
            // InternalLibrettoProjectProfile.g:4536:2: ( rule__ScopedSurface__SpecIdAssignment_1_1_1 )
            // InternalLibrettoProjectProfile.g:4536:3: rule__ScopedSurface__SpecIdAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ScopedSurface__SpecIdAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getScopedSurfaceAccess().getSpecIdAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopedSurface__Group_1_1__1__Impl"


    // $ANTLR start "rule__ReturnTypeRule__Group__0"
    // InternalLibrettoProjectProfile.g:4545:1: rule__ReturnTypeRule__Group__0 : rule__ReturnTypeRule__Group__0__Impl rule__ReturnTypeRule__Group__1 ;
    public final void rule__ReturnTypeRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4549:1: ( rule__ReturnTypeRule__Group__0__Impl rule__ReturnTypeRule__Group__1 )
            // InternalLibrettoProjectProfile.g:4550:2: rule__ReturnTypeRule__Group__0__Impl rule__ReturnTypeRule__Group__1
            {
            pushFollow(FOLLOW_47);
            rule__ReturnTypeRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReturnTypeRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnTypeRule__Group__0"


    // $ANTLR start "rule__ReturnTypeRule__Group__0__Impl"
    // InternalLibrettoProjectProfile.g:4557:1: rule__ReturnTypeRule__Group__0__Impl : ( 'returnType' ) ;
    public final void rule__ReturnTypeRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4561:1: ( ( 'returnType' ) )
            // InternalLibrettoProjectProfile.g:4562:1: ( 'returnType' )
            {
            // InternalLibrettoProjectProfile.g:4562:1: ( 'returnType' )
            // InternalLibrettoProjectProfile.g:4563:2: 'returnType'
            {
             before(grammarAccess.getReturnTypeRuleAccess().getReturnTypeKeyword_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getReturnTypeRuleAccess().getReturnTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnTypeRule__Group__0__Impl"


    // $ANTLR start "rule__ReturnTypeRule__Group__1"
    // InternalLibrettoProjectProfile.g:4572:1: rule__ReturnTypeRule__Group__1 : rule__ReturnTypeRule__Group__1__Impl rule__ReturnTypeRule__Group__2 ;
    public final void rule__ReturnTypeRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4576:1: ( rule__ReturnTypeRule__Group__1__Impl rule__ReturnTypeRule__Group__2 )
            // InternalLibrettoProjectProfile.g:4577:2: rule__ReturnTypeRule__Group__1__Impl rule__ReturnTypeRule__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ReturnTypeRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReturnTypeRule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnTypeRule__Group__1"


    // $ANTLR start "rule__ReturnTypeRule__Group__1__Impl"
    // InternalLibrettoProjectProfile.g:4584:1: rule__ReturnTypeRule__Group__1__Impl : ( 'method' ) ;
    public final void rule__ReturnTypeRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4588:1: ( ( 'method' ) )
            // InternalLibrettoProjectProfile.g:4589:1: ( 'method' )
            {
            // InternalLibrettoProjectProfile.g:4589:1: ( 'method' )
            // InternalLibrettoProjectProfile.g:4590:2: 'method'
            {
             before(grammarAccess.getReturnTypeRuleAccess().getMethodKeyword_1()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getReturnTypeRuleAccess().getMethodKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnTypeRule__Group__1__Impl"


    // $ANTLR start "rule__ReturnTypeRule__Group__2"
    // InternalLibrettoProjectProfile.g:4599:1: rule__ReturnTypeRule__Group__2 : rule__ReturnTypeRule__Group__2__Impl rule__ReturnTypeRule__Group__3 ;
    public final void rule__ReturnTypeRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4603:1: ( rule__ReturnTypeRule__Group__2__Impl rule__ReturnTypeRule__Group__3 )
            // InternalLibrettoProjectProfile.g:4604:2: rule__ReturnTypeRule__Group__2__Impl rule__ReturnTypeRule__Group__3
            {
            pushFollow(FOLLOW_48);
            rule__ReturnTypeRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReturnTypeRule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnTypeRule__Group__2"


    // $ANTLR start "rule__ReturnTypeRule__Group__2__Impl"
    // InternalLibrettoProjectProfile.g:4611:1: rule__ReturnTypeRule__Group__2__Impl : ( ( rule__ReturnTypeRule__NameAssignment_2 ) ) ;
    public final void rule__ReturnTypeRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4615:1: ( ( ( rule__ReturnTypeRule__NameAssignment_2 ) ) )
            // InternalLibrettoProjectProfile.g:4616:1: ( ( rule__ReturnTypeRule__NameAssignment_2 ) )
            {
            // InternalLibrettoProjectProfile.g:4616:1: ( ( rule__ReturnTypeRule__NameAssignment_2 ) )
            // InternalLibrettoProjectProfile.g:4617:2: ( rule__ReturnTypeRule__NameAssignment_2 )
            {
             before(grammarAccess.getReturnTypeRuleAccess().getNameAssignment_2()); 
            // InternalLibrettoProjectProfile.g:4618:2: ( rule__ReturnTypeRule__NameAssignment_2 )
            // InternalLibrettoProjectProfile.g:4618:3: rule__ReturnTypeRule__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ReturnTypeRule__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getReturnTypeRuleAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnTypeRule__Group__2__Impl"


    // $ANTLR start "rule__ReturnTypeRule__Group__3"
    // InternalLibrettoProjectProfile.g:4626:1: rule__ReturnTypeRule__Group__3 : rule__ReturnTypeRule__Group__3__Impl rule__ReturnTypeRule__Group__4 ;
    public final void rule__ReturnTypeRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4630:1: ( rule__ReturnTypeRule__Group__3__Impl rule__ReturnTypeRule__Group__4 )
            // InternalLibrettoProjectProfile.g:4631:2: rule__ReturnTypeRule__Group__3__Impl rule__ReturnTypeRule__Group__4
            {
            pushFollow(FOLLOW_49);
            rule__ReturnTypeRule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReturnTypeRule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnTypeRule__Group__3"


    // $ANTLR start "rule__ReturnTypeRule__Group__3__Impl"
    // InternalLibrettoProjectProfile.g:4638:1: rule__ReturnTypeRule__Group__3__Impl : ( 'as' ) ;
    public final void rule__ReturnTypeRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4642:1: ( ( 'as' ) )
            // InternalLibrettoProjectProfile.g:4643:1: ( 'as' )
            {
            // InternalLibrettoProjectProfile.g:4643:1: ( 'as' )
            // InternalLibrettoProjectProfile.g:4644:2: 'as'
            {
             before(grammarAccess.getReturnTypeRuleAccess().getAsKeyword_3()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getReturnTypeRuleAccess().getAsKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnTypeRule__Group__3__Impl"


    // $ANTLR start "rule__ReturnTypeRule__Group__4"
    // InternalLibrettoProjectProfile.g:4653:1: rule__ReturnTypeRule__Group__4 : rule__ReturnTypeRule__Group__4__Impl rule__ReturnTypeRule__Group__5 ;
    public final void rule__ReturnTypeRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4657:1: ( rule__ReturnTypeRule__Group__4__Impl rule__ReturnTypeRule__Group__5 )
            // InternalLibrettoProjectProfile.g:4658:2: rule__ReturnTypeRule__Group__4__Impl rule__ReturnTypeRule__Group__5
            {
            pushFollow(FOLLOW_50);
            rule__ReturnTypeRule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReturnTypeRule__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnTypeRule__Group__4"


    // $ANTLR start "rule__ReturnTypeRule__Group__4__Impl"
    // InternalLibrettoProjectProfile.g:4665:1: rule__ReturnTypeRule__Group__4__Impl : ( ( rule__ReturnTypeRule__JavaTypeAssignment_4 ) ) ;
    public final void rule__ReturnTypeRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4669:1: ( ( ( rule__ReturnTypeRule__JavaTypeAssignment_4 ) ) )
            // InternalLibrettoProjectProfile.g:4670:1: ( ( rule__ReturnTypeRule__JavaTypeAssignment_4 ) )
            {
            // InternalLibrettoProjectProfile.g:4670:1: ( ( rule__ReturnTypeRule__JavaTypeAssignment_4 ) )
            // InternalLibrettoProjectProfile.g:4671:2: ( rule__ReturnTypeRule__JavaTypeAssignment_4 )
            {
             before(grammarAccess.getReturnTypeRuleAccess().getJavaTypeAssignment_4()); 
            // InternalLibrettoProjectProfile.g:4672:2: ( rule__ReturnTypeRule__JavaTypeAssignment_4 )
            // InternalLibrettoProjectProfile.g:4672:3: rule__ReturnTypeRule__JavaTypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ReturnTypeRule__JavaTypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getReturnTypeRuleAccess().getJavaTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnTypeRule__Group__4__Impl"


    // $ANTLR start "rule__ReturnTypeRule__Group__5"
    // InternalLibrettoProjectProfile.g:4680:1: rule__ReturnTypeRule__Group__5 : rule__ReturnTypeRule__Group__5__Impl ;
    public final void rule__ReturnTypeRule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4684:1: ( rule__ReturnTypeRule__Group__5__Impl )
            // InternalLibrettoProjectProfile.g:4685:2: rule__ReturnTypeRule__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReturnTypeRule__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnTypeRule__Group__5"


    // $ANTLR start "rule__ReturnTypeRule__Group__5__Impl"
    // InternalLibrettoProjectProfile.g:4691:1: rule__ReturnTypeRule__Group__5__Impl : ( ( ';' )? ) ;
    public final void rule__ReturnTypeRule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4695:1: ( ( ( ';' )? ) )
            // InternalLibrettoProjectProfile.g:4696:1: ( ( ';' )? )
            {
            // InternalLibrettoProjectProfile.g:4696:1: ( ( ';' )? )
            // InternalLibrettoProjectProfile.g:4697:2: ( ';' )?
            {
             before(grammarAccess.getReturnTypeRuleAccess().getSemicolonKeyword_5()); 
            // InternalLibrettoProjectProfile.g:4698:2: ( ';' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==69) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:4698:3: ';'
                    {
                    match(input,69,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getReturnTypeRuleAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnTypeRule__Group__5__Impl"


    // $ANTLR start "rule__ParamTypeRule__Group__0"
    // InternalLibrettoProjectProfile.g:4707:1: rule__ParamTypeRule__Group__0 : rule__ParamTypeRule__Group__0__Impl rule__ParamTypeRule__Group__1 ;
    public final void rule__ParamTypeRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4711:1: ( rule__ParamTypeRule__Group__0__Impl rule__ParamTypeRule__Group__1 )
            // InternalLibrettoProjectProfile.g:4712:2: rule__ParamTypeRule__Group__0__Impl rule__ParamTypeRule__Group__1
            {
            pushFollow(FOLLOW_51);
            rule__ParamTypeRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParamTypeRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamTypeRule__Group__0"


    // $ANTLR start "rule__ParamTypeRule__Group__0__Impl"
    // InternalLibrettoProjectProfile.g:4719:1: rule__ParamTypeRule__Group__0__Impl : ( 'paramType' ) ;
    public final void rule__ParamTypeRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4723:1: ( ( 'paramType' ) )
            // InternalLibrettoProjectProfile.g:4724:1: ( 'paramType' )
            {
            // InternalLibrettoProjectProfile.g:4724:1: ( 'paramType' )
            // InternalLibrettoProjectProfile.g:4725:2: 'paramType'
            {
             before(grammarAccess.getParamTypeRuleAccess().getParamTypeKeyword_0()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getParamTypeRuleAccess().getParamTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamTypeRule__Group__0__Impl"


    // $ANTLR start "rule__ParamTypeRule__Group__1"
    // InternalLibrettoProjectProfile.g:4734:1: rule__ParamTypeRule__Group__1 : rule__ParamTypeRule__Group__1__Impl rule__ParamTypeRule__Group__2 ;
    public final void rule__ParamTypeRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4738:1: ( rule__ParamTypeRule__Group__1__Impl rule__ParamTypeRule__Group__2 )
            // InternalLibrettoProjectProfile.g:4739:2: rule__ParamTypeRule__Group__1__Impl rule__ParamTypeRule__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ParamTypeRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParamTypeRule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamTypeRule__Group__1"


    // $ANTLR start "rule__ParamTypeRule__Group__1__Impl"
    // InternalLibrettoProjectProfile.g:4746:1: rule__ParamTypeRule__Group__1__Impl : ( 'name' ) ;
    public final void rule__ParamTypeRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4750:1: ( ( 'name' ) )
            // InternalLibrettoProjectProfile.g:4751:1: ( 'name' )
            {
            // InternalLibrettoProjectProfile.g:4751:1: ( 'name' )
            // InternalLibrettoProjectProfile.g:4752:2: 'name'
            {
             before(grammarAccess.getParamTypeRuleAccess().getNameKeyword_1()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getParamTypeRuleAccess().getNameKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamTypeRule__Group__1__Impl"


    // $ANTLR start "rule__ParamTypeRule__Group__2"
    // InternalLibrettoProjectProfile.g:4761:1: rule__ParamTypeRule__Group__2 : rule__ParamTypeRule__Group__2__Impl rule__ParamTypeRule__Group__3 ;
    public final void rule__ParamTypeRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4765:1: ( rule__ParamTypeRule__Group__2__Impl rule__ParamTypeRule__Group__3 )
            // InternalLibrettoProjectProfile.g:4766:2: rule__ParamTypeRule__Group__2__Impl rule__ParamTypeRule__Group__3
            {
            pushFollow(FOLLOW_48);
            rule__ParamTypeRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParamTypeRule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamTypeRule__Group__2"


    // $ANTLR start "rule__ParamTypeRule__Group__2__Impl"
    // InternalLibrettoProjectProfile.g:4773:1: rule__ParamTypeRule__Group__2__Impl : ( ( rule__ParamTypeRule__ParamNameAssignment_2 ) ) ;
    public final void rule__ParamTypeRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4777:1: ( ( ( rule__ParamTypeRule__ParamNameAssignment_2 ) ) )
            // InternalLibrettoProjectProfile.g:4778:1: ( ( rule__ParamTypeRule__ParamNameAssignment_2 ) )
            {
            // InternalLibrettoProjectProfile.g:4778:1: ( ( rule__ParamTypeRule__ParamNameAssignment_2 ) )
            // InternalLibrettoProjectProfile.g:4779:2: ( rule__ParamTypeRule__ParamNameAssignment_2 )
            {
             before(grammarAccess.getParamTypeRuleAccess().getParamNameAssignment_2()); 
            // InternalLibrettoProjectProfile.g:4780:2: ( rule__ParamTypeRule__ParamNameAssignment_2 )
            // InternalLibrettoProjectProfile.g:4780:3: rule__ParamTypeRule__ParamNameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ParamTypeRule__ParamNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParamTypeRuleAccess().getParamNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamTypeRule__Group__2__Impl"


    // $ANTLR start "rule__ParamTypeRule__Group__3"
    // InternalLibrettoProjectProfile.g:4788:1: rule__ParamTypeRule__Group__3 : rule__ParamTypeRule__Group__3__Impl rule__ParamTypeRule__Group__4 ;
    public final void rule__ParamTypeRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4792:1: ( rule__ParamTypeRule__Group__3__Impl rule__ParamTypeRule__Group__4 )
            // InternalLibrettoProjectProfile.g:4793:2: rule__ParamTypeRule__Group__3__Impl rule__ParamTypeRule__Group__4
            {
            pushFollow(FOLLOW_49);
            rule__ParamTypeRule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParamTypeRule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamTypeRule__Group__3"


    // $ANTLR start "rule__ParamTypeRule__Group__3__Impl"
    // InternalLibrettoProjectProfile.g:4800:1: rule__ParamTypeRule__Group__3__Impl : ( 'as' ) ;
    public final void rule__ParamTypeRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4804:1: ( ( 'as' ) )
            // InternalLibrettoProjectProfile.g:4805:1: ( 'as' )
            {
            // InternalLibrettoProjectProfile.g:4805:1: ( 'as' )
            // InternalLibrettoProjectProfile.g:4806:2: 'as'
            {
             before(grammarAccess.getParamTypeRuleAccess().getAsKeyword_3()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getParamTypeRuleAccess().getAsKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamTypeRule__Group__3__Impl"


    // $ANTLR start "rule__ParamTypeRule__Group__4"
    // InternalLibrettoProjectProfile.g:4815:1: rule__ParamTypeRule__Group__4 : rule__ParamTypeRule__Group__4__Impl rule__ParamTypeRule__Group__5 ;
    public final void rule__ParamTypeRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4819:1: ( rule__ParamTypeRule__Group__4__Impl rule__ParamTypeRule__Group__5 )
            // InternalLibrettoProjectProfile.g:4820:2: rule__ParamTypeRule__Group__4__Impl rule__ParamTypeRule__Group__5
            {
            pushFollow(FOLLOW_50);
            rule__ParamTypeRule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParamTypeRule__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamTypeRule__Group__4"


    // $ANTLR start "rule__ParamTypeRule__Group__4__Impl"
    // InternalLibrettoProjectProfile.g:4827:1: rule__ParamTypeRule__Group__4__Impl : ( ( rule__ParamTypeRule__JavaTypeAssignment_4 ) ) ;
    public final void rule__ParamTypeRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4831:1: ( ( ( rule__ParamTypeRule__JavaTypeAssignment_4 ) ) )
            // InternalLibrettoProjectProfile.g:4832:1: ( ( rule__ParamTypeRule__JavaTypeAssignment_4 ) )
            {
            // InternalLibrettoProjectProfile.g:4832:1: ( ( rule__ParamTypeRule__JavaTypeAssignment_4 ) )
            // InternalLibrettoProjectProfile.g:4833:2: ( rule__ParamTypeRule__JavaTypeAssignment_4 )
            {
             before(grammarAccess.getParamTypeRuleAccess().getJavaTypeAssignment_4()); 
            // InternalLibrettoProjectProfile.g:4834:2: ( rule__ParamTypeRule__JavaTypeAssignment_4 )
            // InternalLibrettoProjectProfile.g:4834:3: rule__ParamTypeRule__JavaTypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ParamTypeRule__JavaTypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getParamTypeRuleAccess().getJavaTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamTypeRule__Group__4__Impl"


    // $ANTLR start "rule__ParamTypeRule__Group__5"
    // InternalLibrettoProjectProfile.g:4842:1: rule__ParamTypeRule__Group__5 : rule__ParamTypeRule__Group__5__Impl ;
    public final void rule__ParamTypeRule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4846:1: ( rule__ParamTypeRule__Group__5__Impl )
            // InternalLibrettoProjectProfile.g:4847:2: rule__ParamTypeRule__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParamTypeRule__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamTypeRule__Group__5"


    // $ANTLR start "rule__ParamTypeRule__Group__5__Impl"
    // InternalLibrettoProjectProfile.g:4853:1: rule__ParamTypeRule__Group__5__Impl : ( ( ';' )? ) ;
    public final void rule__ParamTypeRule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4857:1: ( ( ( ';' )? ) )
            // InternalLibrettoProjectProfile.g:4858:1: ( ( ';' )? )
            {
            // InternalLibrettoProjectProfile.g:4858:1: ( ( ';' )? )
            // InternalLibrettoProjectProfile.g:4859:2: ( ';' )?
            {
             before(grammarAccess.getParamTypeRuleAccess().getSemicolonKeyword_5()); 
            // InternalLibrettoProjectProfile.g:4860:2: ( ';' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==69) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:4860:3: ';'
                    {
                    match(input,69,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getParamTypeRuleAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamTypeRule__Group__5__Impl"


    // $ANTLR start "rule__RecordSelfReturnRule__Group__0"
    // InternalLibrettoProjectProfile.g:4869:1: rule__RecordSelfReturnRule__Group__0 : rule__RecordSelfReturnRule__Group__0__Impl rule__RecordSelfReturnRule__Group__1 ;
    public final void rule__RecordSelfReturnRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4873:1: ( rule__RecordSelfReturnRule__Group__0__Impl rule__RecordSelfReturnRule__Group__1 )
            // InternalLibrettoProjectProfile.g:4874:2: rule__RecordSelfReturnRule__Group__0__Impl rule__RecordSelfReturnRule__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__RecordSelfReturnRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordSelfReturnRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordSelfReturnRule__Group__0"


    // $ANTLR start "rule__RecordSelfReturnRule__Group__0__Impl"
    // InternalLibrettoProjectProfile.g:4881:1: rule__RecordSelfReturnRule__Group__0__Impl : ( 'recordSelfReturn' ) ;
    public final void rule__RecordSelfReturnRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4885:1: ( ( 'recordSelfReturn' ) )
            // InternalLibrettoProjectProfile.g:4886:1: ( 'recordSelfReturn' )
            {
            // InternalLibrettoProjectProfile.g:4886:1: ( 'recordSelfReturn' )
            // InternalLibrettoProjectProfile.g:4887:2: 'recordSelfReturn'
            {
             before(grammarAccess.getRecordSelfReturnRuleAccess().getRecordSelfReturnKeyword_0()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getRecordSelfReturnRuleAccess().getRecordSelfReturnKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordSelfReturnRule__Group__0__Impl"


    // $ANTLR start "rule__RecordSelfReturnRule__Group__1"
    // InternalLibrettoProjectProfile.g:4896:1: rule__RecordSelfReturnRule__Group__1 : rule__RecordSelfReturnRule__Group__1__Impl rule__RecordSelfReturnRule__Group__2 ;
    public final void rule__RecordSelfReturnRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4900:1: ( rule__RecordSelfReturnRule__Group__1__Impl rule__RecordSelfReturnRule__Group__2 )
            // InternalLibrettoProjectProfile.g:4901:2: rule__RecordSelfReturnRule__Group__1__Impl rule__RecordSelfReturnRule__Group__2
            {
            pushFollow(FOLLOW_52);
            rule__RecordSelfReturnRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordSelfReturnRule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordSelfReturnRule__Group__1"


    // $ANTLR start "rule__RecordSelfReturnRule__Group__1__Impl"
    // InternalLibrettoProjectProfile.g:4908:1: rule__RecordSelfReturnRule__Group__1__Impl : ( ( rule__RecordSelfReturnRule__MethodsAssignment_1 ) ) ;
    public final void rule__RecordSelfReturnRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4912:1: ( ( ( rule__RecordSelfReturnRule__MethodsAssignment_1 ) ) )
            // InternalLibrettoProjectProfile.g:4913:1: ( ( rule__RecordSelfReturnRule__MethodsAssignment_1 ) )
            {
            // InternalLibrettoProjectProfile.g:4913:1: ( ( rule__RecordSelfReturnRule__MethodsAssignment_1 ) )
            // InternalLibrettoProjectProfile.g:4914:2: ( rule__RecordSelfReturnRule__MethodsAssignment_1 )
            {
             before(grammarAccess.getRecordSelfReturnRuleAccess().getMethodsAssignment_1()); 
            // InternalLibrettoProjectProfile.g:4915:2: ( rule__RecordSelfReturnRule__MethodsAssignment_1 )
            // InternalLibrettoProjectProfile.g:4915:3: rule__RecordSelfReturnRule__MethodsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RecordSelfReturnRule__MethodsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRecordSelfReturnRuleAccess().getMethodsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordSelfReturnRule__Group__1__Impl"


    // $ANTLR start "rule__RecordSelfReturnRule__Group__2"
    // InternalLibrettoProjectProfile.g:4923:1: rule__RecordSelfReturnRule__Group__2 : rule__RecordSelfReturnRule__Group__2__Impl rule__RecordSelfReturnRule__Group__3 ;
    public final void rule__RecordSelfReturnRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4927:1: ( rule__RecordSelfReturnRule__Group__2__Impl rule__RecordSelfReturnRule__Group__3 )
            // InternalLibrettoProjectProfile.g:4928:2: rule__RecordSelfReturnRule__Group__2__Impl rule__RecordSelfReturnRule__Group__3
            {
            pushFollow(FOLLOW_52);
            rule__RecordSelfReturnRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordSelfReturnRule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordSelfReturnRule__Group__2"


    // $ANTLR start "rule__RecordSelfReturnRule__Group__2__Impl"
    // InternalLibrettoProjectProfile.g:4935:1: rule__RecordSelfReturnRule__Group__2__Impl : ( ( rule__RecordSelfReturnRule__Group_2__0 )* ) ;
    public final void rule__RecordSelfReturnRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4939:1: ( ( ( rule__RecordSelfReturnRule__Group_2__0 )* ) )
            // InternalLibrettoProjectProfile.g:4940:1: ( ( rule__RecordSelfReturnRule__Group_2__0 )* )
            {
            // InternalLibrettoProjectProfile.g:4940:1: ( ( rule__RecordSelfReturnRule__Group_2__0 )* )
            // InternalLibrettoProjectProfile.g:4941:2: ( rule__RecordSelfReturnRule__Group_2__0 )*
            {
             before(grammarAccess.getRecordSelfReturnRuleAccess().getGroup_2()); 
            // InternalLibrettoProjectProfile.g:4942:2: ( rule__RecordSelfReturnRule__Group_2__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==73) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:4942:3: rule__RecordSelfReturnRule__Group_2__0
            	    {
            	    pushFollow(FOLLOW_53);
            	    rule__RecordSelfReturnRule__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getRecordSelfReturnRuleAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordSelfReturnRule__Group__2__Impl"


    // $ANTLR start "rule__RecordSelfReturnRule__Group__3"
    // InternalLibrettoProjectProfile.g:4950:1: rule__RecordSelfReturnRule__Group__3 : rule__RecordSelfReturnRule__Group__3__Impl ;
    public final void rule__RecordSelfReturnRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4954:1: ( rule__RecordSelfReturnRule__Group__3__Impl )
            // InternalLibrettoProjectProfile.g:4955:2: rule__RecordSelfReturnRule__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RecordSelfReturnRule__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordSelfReturnRule__Group__3"


    // $ANTLR start "rule__RecordSelfReturnRule__Group__3__Impl"
    // InternalLibrettoProjectProfile.g:4961:1: rule__RecordSelfReturnRule__Group__3__Impl : ( ( ';' )? ) ;
    public final void rule__RecordSelfReturnRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4965:1: ( ( ( ';' )? ) )
            // InternalLibrettoProjectProfile.g:4966:1: ( ( ';' )? )
            {
            // InternalLibrettoProjectProfile.g:4966:1: ( ( ';' )? )
            // InternalLibrettoProjectProfile.g:4967:2: ( ';' )?
            {
             before(grammarAccess.getRecordSelfReturnRuleAccess().getSemicolonKeyword_3()); 
            // InternalLibrettoProjectProfile.g:4968:2: ( ';' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==69) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:4968:3: ';'
                    {
                    match(input,69,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getRecordSelfReturnRuleAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordSelfReturnRule__Group__3__Impl"


    // $ANTLR start "rule__RecordSelfReturnRule__Group_2__0"
    // InternalLibrettoProjectProfile.g:4977:1: rule__RecordSelfReturnRule__Group_2__0 : rule__RecordSelfReturnRule__Group_2__0__Impl rule__RecordSelfReturnRule__Group_2__1 ;
    public final void rule__RecordSelfReturnRule__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4981:1: ( rule__RecordSelfReturnRule__Group_2__0__Impl rule__RecordSelfReturnRule__Group_2__1 )
            // InternalLibrettoProjectProfile.g:4982:2: rule__RecordSelfReturnRule__Group_2__0__Impl rule__RecordSelfReturnRule__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__RecordSelfReturnRule__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordSelfReturnRule__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordSelfReturnRule__Group_2__0"


    // $ANTLR start "rule__RecordSelfReturnRule__Group_2__0__Impl"
    // InternalLibrettoProjectProfile.g:4989:1: rule__RecordSelfReturnRule__Group_2__0__Impl : ( ',' ) ;
    public final void rule__RecordSelfReturnRule__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4993:1: ( ( ',' ) )
            // InternalLibrettoProjectProfile.g:4994:1: ( ',' )
            {
            // InternalLibrettoProjectProfile.g:4994:1: ( ',' )
            // InternalLibrettoProjectProfile.g:4995:2: ','
            {
             before(grammarAccess.getRecordSelfReturnRuleAccess().getCommaKeyword_2_0()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getRecordSelfReturnRuleAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordSelfReturnRule__Group_2__0__Impl"


    // $ANTLR start "rule__RecordSelfReturnRule__Group_2__1"
    // InternalLibrettoProjectProfile.g:5004:1: rule__RecordSelfReturnRule__Group_2__1 : rule__RecordSelfReturnRule__Group_2__1__Impl ;
    public final void rule__RecordSelfReturnRule__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5008:1: ( rule__RecordSelfReturnRule__Group_2__1__Impl )
            // InternalLibrettoProjectProfile.g:5009:2: rule__RecordSelfReturnRule__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RecordSelfReturnRule__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordSelfReturnRule__Group_2__1"


    // $ANTLR start "rule__RecordSelfReturnRule__Group_2__1__Impl"
    // InternalLibrettoProjectProfile.g:5015:1: rule__RecordSelfReturnRule__Group_2__1__Impl : ( ( rule__RecordSelfReturnRule__MethodsAssignment_2_1 ) ) ;
    public final void rule__RecordSelfReturnRule__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5019:1: ( ( ( rule__RecordSelfReturnRule__MethodsAssignment_2_1 ) ) )
            // InternalLibrettoProjectProfile.g:5020:1: ( ( rule__RecordSelfReturnRule__MethodsAssignment_2_1 ) )
            {
            // InternalLibrettoProjectProfile.g:5020:1: ( ( rule__RecordSelfReturnRule__MethodsAssignment_2_1 ) )
            // InternalLibrettoProjectProfile.g:5021:2: ( rule__RecordSelfReturnRule__MethodsAssignment_2_1 )
            {
             before(grammarAccess.getRecordSelfReturnRuleAccess().getMethodsAssignment_2_1()); 
            // InternalLibrettoProjectProfile.g:5022:2: ( rule__RecordSelfReturnRule__MethodsAssignment_2_1 )
            // InternalLibrettoProjectProfile.g:5022:3: rule__RecordSelfReturnRule__MethodsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__RecordSelfReturnRule__MethodsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getRecordSelfReturnRuleAccess().getMethodsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordSelfReturnRule__Group_2__1__Impl"


    // $ANTLR start "rule__MethodOverrideRule__Group__0"
    // InternalLibrettoProjectProfile.g:5031:1: rule__MethodOverrideRule__Group__0 : rule__MethodOverrideRule__Group__0__Impl rule__MethodOverrideRule__Group__1 ;
    public final void rule__MethodOverrideRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5035:1: ( rule__MethodOverrideRule__Group__0__Impl rule__MethodOverrideRule__Group__1 )
            // InternalLibrettoProjectProfile.g:5036:2: rule__MethodOverrideRule__Group__0__Impl rule__MethodOverrideRule__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__MethodOverrideRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodOverrideRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodOverrideRule__Group__0"


    // $ANTLR start "rule__MethodOverrideRule__Group__0__Impl"
    // InternalLibrettoProjectProfile.g:5043:1: rule__MethodOverrideRule__Group__0__Impl : ( 'methodOverride' ) ;
    public final void rule__MethodOverrideRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5047:1: ( ( 'methodOverride' ) )
            // InternalLibrettoProjectProfile.g:5048:1: ( 'methodOverride' )
            {
            // InternalLibrettoProjectProfile.g:5048:1: ( 'methodOverride' )
            // InternalLibrettoProjectProfile.g:5049:2: 'methodOverride'
            {
             before(grammarAccess.getMethodOverrideRuleAccess().getMethodOverrideKeyword_0()); 
            match(input,74,FOLLOW_2); 
             after(grammarAccess.getMethodOverrideRuleAccess().getMethodOverrideKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodOverrideRule__Group__0__Impl"


    // $ANTLR start "rule__MethodOverrideRule__Group__1"
    // InternalLibrettoProjectProfile.g:5058:1: rule__MethodOverrideRule__Group__1 : rule__MethodOverrideRule__Group__1__Impl rule__MethodOverrideRule__Group__2 ;
    public final void rule__MethodOverrideRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5062:1: ( rule__MethodOverrideRule__Group__1__Impl rule__MethodOverrideRule__Group__2 )
            // InternalLibrettoProjectProfile.g:5063:2: rule__MethodOverrideRule__Group__1__Impl rule__MethodOverrideRule__Group__2
            {
            pushFollow(FOLLOW_54);
            rule__MethodOverrideRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodOverrideRule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodOverrideRule__Group__1"


    // $ANTLR start "rule__MethodOverrideRule__Group__1__Impl"
    // InternalLibrettoProjectProfile.g:5070:1: rule__MethodOverrideRule__Group__1__Impl : ( ( rule__MethodOverrideRule__SignatureAssignment_1 ) ) ;
    public final void rule__MethodOverrideRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5074:1: ( ( ( rule__MethodOverrideRule__SignatureAssignment_1 ) ) )
            // InternalLibrettoProjectProfile.g:5075:1: ( ( rule__MethodOverrideRule__SignatureAssignment_1 ) )
            {
            // InternalLibrettoProjectProfile.g:5075:1: ( ( rule__MethodOverrideRule__SignatureAssignment_1 ) )
            // InternalLibrettoProjectProfile.g:5076:2: ( rule__MethodOverrideRule__SignatureAssignment_1 )
            {
             before(grammarAccess.getMethodOverrideRuleAccess().getSignatureAssignment_1()); 
            // InternalLibrettoProjectProfile.g:5077:2: ( rule__MethodOverrideRule__SignatureAssignment_1 )
            // InternalLibrettoProjectProfile.g:5077:3: rule__MethodOverrideRule__SignatureAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MethodOverrideRule__SignatureAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodOverrideRuleAccess().getSignatureAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodOverrideRule__Group__1__Impl"


    // $ANTLR start "rule__MethodOverrideRule__Group__2"
    // InternalLibrettoProjectProfile.g:5085:1: rule__MethodOverrideRule__Group__2 : rule__MethodOverrideRule__Group__2__Impl rule__MethodOverrideRule__Group__3 ;
    public final void rule__MethodOverrideRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5089:1: ( rule__MethodOverrideRule__Group__2__Impl rule__MethodOverrideRule__Group__3 )
            // InternalLibrettoProjectProfile.g:5090:2: rule__MethodOverrideRule__Group__2__Impl rule__MethodOverrideRule__Group__3
            {
            pushFollow(FOLLOW_49);
            rule__MethodOverrideRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodOverrideRule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodOverrideRule__Group__2"


    // $ANTLR start "rule__MethodOverrideRule__Group__2__Impl"
    // InternalLibrettoProjectProfile.g:5097:1: rule__MethodOverrideRule__Group__2__Impl : ( 'returns' ) ;
    public final void rule__MethodOverrideRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5101:1: ( ( 'returns' ) )
            // InternalLibrettoProjectProfile.g:5102:1: ( 'returns' )
            {
            // InternalLibrettoProjectProfile.g:5102:1: ( 'returns' )
            // InternalLibrettoProjectProfile.g:5103:2: 'returns'
            {
             before(grammarAccess.getMethodOverrideRuleAccess().getReturnsKeyword_2()); 
            match(input,75,FOLLOW_2); 
             after(grammarAccess.getMethodOverrideRuleAccess().getReturnsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodOverrideRule__Group__2__Impl"


    // $ANTLR start "rule__MethodOverrideRule__Group__3"
    // InternalLibrettoProjectProfile.g:5112:1: rule__MethodOverrideRule__Group__3 : rule__MethodOverrideRule__Group__3__Impl rule__MethodOverrideRule__Group__4 ;
    public final void rule__MethodOverrideRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5116:1: ( rule__MethodOverrideRule__Group__3__Impl rule__MethodOverrideRule__Group__4 )
            // InternalLibrettoProjectProfile.g:5117:2: rule__MethodOverrideRule__Group__3__Impl rule__MethodOverrideRule__Group__4
            {
            pushFollow(FOLLOW_50);
            rule__MethodOverrideRule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodOverrideRule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodOverrideRule__Group__3"


    // $ANTLR start "rule__MethodOverrideRule__Group__3__Impl"
    // InternalLibrettoProjectProfile.g:5124:1: rule__MethodOverrideRule__Group__3__Impl : ( ( rule__MethodOverrideRule__JavaTypeAssignment_3 ) ) ;
    public final void rule__MethodOverrideRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5128:1: ( ( ( rule__MethodOverrideRule__JavaTypeAssignment_3 ) ) )
            // InternalLibrettoProjectProfile.g:5129:1: ( ( rule__MethodOverrideRule__JavaTypeAssignment_3 ) )
            {
            // InternalLibrettoProjectProfile.g:5129:1: ( ( rule__MethodOverrideRule__JavaTypeAssignment_3 ) )
            // InternalLibrettoProjectProfile.g:5130:2: ( rule__MethodOverrideRule__JavaTypeAssignment_3 )
            {
             before(grammarAccess.getMethodOverrideRuleAccess().getJavaTypeAssignment_3()); 
            // InternalLibrettoProjectProfile.g:5131:2: ( rule__MethodOverrideRule__JavaTypeAssignment_3 )
            // InternalLibrettoProjectProfile.g:5131:3: rule__MethodOverrideRule__JavaTypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MethodOverrideRule__JavaTypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMethodOverrideRuleAccess().getJavaTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodOverrideRule__Group__3__Impl"


    // $ANTLR start "rule__MethodOverrideRule__Group__4"
    // InternalLibrettoProjectProfile.g:5139:1: rule__MethodOverrideRule__Group__4 : rule__MethodOverrideRule__Group__4__Impl ;
    public final void rule__MethodOverrideRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5143:1: ( rule__MethodOverrideRule__Group__4__Impl )
            // InternalLibrettoProjectProfile.g:5144:2: rule__MethodOverrideRule__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MethodOverrideRule__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodOverrideRule__Group__4"


    // $ANTLR start "rule__MethodOverrideRule__Group__4__Impl"
    // InternalLibrettoProjectProfile.g:5150:1: rule__MethodOverrideRule__Group__4__Impl : ( ( ';' )? ) ;
    public final void rule__MethodOverrideRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5154:1: ( ( ( ';' )? ) )
            // InternalLibrettoProjectProfile.g:5155:1: ( ( ';' )? )
            {
            // InternalLibrettoProjectProfile.g:5155:1: ( ( ';' )? )
            // InternalLibrettoProjectProfile.g:5156:2: ( ';' )?
            {
             before(grammarAccess.getMethodOverrideRuleAccess().getSemicolonKeyword_4()); 
            // InternalLibrettoProjectProfile.g:5157:2: ( ';' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==69) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:5157:3: ';'
                    {
                    match(input,69,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getMethodOverrideRuleAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodOverrideRule__Group__4__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalLibrettoProjectProfile.g:5166:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5170:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalLibrettoProjectProfile.g:5171:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_55);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalLibrettoProjectProfile.g:5178:1: rule__QualifiedName__Group__0__Impl : ( ( rule__QualifiedName__SegmentsAssignment_0 ) ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5182:1: ( ( ( rule__QualifiedName__SegmentsAssignment_0 ) ) )
            // InternalLibrettoProjectProfile.g:5183:1: ( ( rule__QualifiedName__SegmentsAssignment_0 ) )
            {
            // InternalLibrettoProjectProfile.g:5183:1: ( ( rule__QualifiedName__SegmentsAssignment_0 ) )
            // InternalLibrettoProjectProfile.g:5184:2: ( rule__QualifiedName__SegmentsAssignment_0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getSegmentsAssignment_0()); 
            // InternalLibrettoProjectProfile.g:5185:2: ( rule__QualifiedName__SegmentsAssignment_0 )
            // InternalLibrettoProjectProfile.g:5185:3: rule__QualifiedName__SegmentsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__SegmentsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getSegmentsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalLibrettoProjectProfile.g:5193:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5197:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalLibrettoProjectProfile.g:5198:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalLibrettoProjectProfile.g:5204:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5208:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalLibrettoProjectProfile.g:5209:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalLibrettoProjectProfile.g:5209:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalLibrettoProjectProfile.g:5210:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalLibrettoProjectProfile.g:5211:2: ( rule__QualifiedName__Group_1__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==25) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:5211:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_56);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalLibrettoProjectProfile.g:5220:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5224:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalLibrettoProjectProfile.g:5225:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalLibrettoProjectProfile.g:5232:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5236:1: ( ( '.' ) )
            // InternalLibrettoProjectProfile.g:5237:1: ( '.' )
            {
            // InternalLibrettoProjectProfile.g:5237:1: ( '.' )
            // InternalLibrettoProjectProfile.g:5238:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalLibrettoProjectProfile.g:5247:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5251:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalLibrettoProjectProfile.g:5252:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalLibrettoProjectProfile.g:5258:1: rule__QualifiedName__Group_1__1__Impl : ( ( rule__QualifiedName__SegmentsAssignment_1_1 ) ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5262:1: ( ( ( rule__QualifiedName__SegmentsAssignment_1_1 ) ) )
            // InternalLibrettoProjectProfile.g:5263:1: ( ( rule__QualifiedName__SegmentsAssignment_1_1 ) )
            {
            // InternalLibrettoProjectProfile.g:5263:1: ( ( rule__QualifiedName__SegmentsAssignment_1_1 ) )
            // InternalLibrettoProjectProfile.g:5264:2: ( rule__QualifiedName__SegmentsAssignment_1_1 )
            {
             before(grammarAccess.getQualifiedNameAccess().getSegmentsAssignment_1_1()); 
            // InternalLibrettoProjectProfile.g:5265:2: ( rule__QualifiedName__SegmentsAssignment_1_1 )
            // InternalLibrettoProjectProfile.g:5265:3: rule__QualifiedName__SegmentsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__SegmentsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getSegmentsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__OperationSignature__Group__0"
    // InternalLibrettoProjectProfile.g:5274:1: rule__OperationSignature__Group__0 : rule__OperationSignature__Group__0__Impl rule__OperationSignature__Group__1 ;
    public final void rule__OperationSignature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5278:1: ( rule__OperationSignature__Group__0__Impl rule__OperationSignature__Group__1 )
            // InternalLibrettoProjectProfile.g:5279:2: rule__OperationSignature__Group__0__Impl rule__OperationSignature__Group__1
            {
            pushFollow(FOLLOW_57);
            rule__OperationSignature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationSignature__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationSignature__Group__0"


    // $ANTLR start "rule__OperationSignature__Group__0__Impl"
    // InternalLibrettoProjectProfile.g:5286:1: rule__OperationSignature__Group__0__Impl : ( ( rule__OperationSignature__NameAssignment_0 ) ) ;
    public final void rule__OperationSignature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5290:1: ( ( ( rule__OperationSignature__NameAssignment_0 ) ) )
            // InternalLibrettoProjectProfile.g:5291:1: ( ( rule__OperationSignature__NameAssignment_0 ) )
            {
            // InternalLibrettoProjectProfile.g:5291:1: ( ( rule__OperationSignature__NameAssignment_0 ) )
            // InternalLibrettoProjectProfile.g:5292:2: ( rule__OperationSignature__NameAssignment_0 )
            {
             before(grammarAccess.getOperationSignatureAccess().getNameAssignment_0()); 
            // InternalLibrettoProjectProfile.g:5293:2: ( rule__OperationSignature__NameAssignment_0 )
            // InternalLibrettoProjectProfile.g:5293:3: rule__OperationSignature__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__OperationSignature__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getOperationSignatureAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationSignature__Group__0__Impl"


    // $ANTLR start "rule__OperationSignature__Group__1"
    // InternalLibrettoProjectProfile.g:5301:1: rule__OperationSignature__Group__1 : rule__OperationSignature__Group__1__Impl rule__OperationSignature__Group__2 ;
    public final void rule__OperationSignature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5305:1: ( rule__OperationSignature__Group__1__Impl rule__OperationSignature__Group__2 )
            // InternalLibrettoProjectProfile.g:5306:2: rule__OperationSignature__Group__1__Impl rule__OperationSignature__Group__2
            {
            pushFollow(FOLLOW_58);
            rule__OperationSignature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationSignature__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationSignature__Group__1"


    // $ANTLR start "rule__OperationSignature__Group__1__Impl"
    // InternalLibrettoProjectProfile.g:5313:1: rule__OperationSignature__Group__1__Impl : ( '(' ) ;
    public final void rule__OperationSignature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5317:1: ( ( '(' ) )
            // InternalLibrettoProjectProfile.g:5318:1: ( '(' )
            {
            // InternalLibrettoProjectProfile.g:5318:1: ( '(' )
            // InternalLibrettoProjectProfile.g:5319:2: '('
            {
             before(grammarAccess.getOperationSignatureAccess().getLeftParenthesisKeyword_1()); 
            match(input,76,FOLLOW_2); 
             after(grammarAccess.getOperationSignatureAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationSignature__Group__1__Impl"


    // $ANTLR start "rule__OperationSignature__Group__2"
    // InternalLibrettoProjectProfile.g:5328:1: rule__OperationSignature__Group__2 : rule__OperationSignature__Group__2__Impl rule__OperationSignature__Group__3 ;
    public final void rule__OperationSignature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5332:1: ( rule__OperationSignature__Group__2__Impl rule__OperationSignature__Group__3 )
            // InternalLibrettoProjectProfile.g:5333:2: rule__OperationSignature__Group__2__Impl rule__OperationSignature__Group__3
            {
            pushFollow(FOLLOW_58);
            rule__OperationSignature__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationSignature__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationSignature__Group__2"


    // $ANTLR start "rule__OperationSignature__Group__2__Impl"
    // InternalLibrettoProjectProfile.g:5340:1: rule__OperationSignature__Group__2__Impl : ( ( rule__OperationSignature__Group_2__0 )? ) ;
    public final void rule__OperationSignature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5344:1: ( ( ( rule__OperationSignature__Group_2__0 )? ) )
            // InternalLibrettoProjectProfile.g:5345:1: ( ( rule__OperationSignature__Group_2__0 )? )
            {
            // InternalLibrettoProjectProfile.g:5345:1: ( ( rule__OperationSignature__Group_2__0 )? )
            // InternalLibrettoProjectProfile.g:5346:2: ( rule__OperationSignature__Group_2__0 )?
            {
             before(grammarAccess.getOperationSignatureAccess().getGroup_2()); 
            // InternalLibrettoProjectProfile.g:5347:2: ( rule__OperationSignature__Group_2__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_ID||(LA39_0>=16 && LA39_0<=24)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:5347:3: rule__OperationSignature__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OperationSignature__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperationSignatureAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationSignature__Group__2__Impl"


    // $ANTLR start "rule__OperationSignature__Group__3"
    // InternalLibrettoProjectProfile.g:5355:1: rule__OperationSignature__Group__3 : rule__OperationSignature__Group__3__Impl ;
    public final void rule__OperationSignature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5359:1: ( rule__OperationSignature__Group__3__Impl )
            // InternalLibrettoProjectProfile.g:5360:2: rule__OperationSignature__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OperationSignature__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationSignature__Group__3"


    // $ANTLR start "rule__OperationSignature__Group__3__Impl"
    // InternalLibrettoProjectProfile.g:5366:1: rule__OperationSignature__Group__3__Impl : ( ')' ) ;
    public final void rule__OperationSignature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5370:1: ( ( ')' ) )
            // InternalLibrettoProjectProfile.g:5371:1: ( ')' )
            {
            // InternalLibrettoProjectProfile.g:5371:1: ( ')' )
            // InternalLibrettoProjectProfile.g:5372:2: ')'
            {
             before(grammarAccess.getOperationSignatureAccess().getRightParenthesisKeyword_3()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getOperationSignatureAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationSignature__Group__3__Impl"


    // $ANTLR start "rule__OperationSignature__Group_2__0"
    // InternalLibrettoProjectProfile.g:5382:1: rule__OperationSignature__Group_2__0 : rule__OperationSignature__Group_2__0__Impl rule__OperationSignature__Group_2__1 ;
    public final void rule__OperationSignature__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5386:1: ( rule__OperationSignature__Group_2__0__Impl rule__OperationSignature__Group_2__1 )
            // InternalLibrettoProjectProfile.g:5387:2: rule__OperationSignature__Group_2__0__Impl rule__OperationSignature__Group_2__1
            {
            pushFollow(FOLLOW_59);
            rule__OperationSignature__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationSignature__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationSignature__Group_2__0"


    // $ANTLR start "rule__OperationSignature__Group_2__0__Impl"
    // InternalLibrettoProjectProfile.g:5394:1: rule__OperationSignature__Group_2__0__Impl : ( ( rule__OperationSignature__ParamsAssignment_2_0 ) ) ;
    public final void rule__OperationSignature__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5398:1: ( ( ( rule__OperationSignature__ParamsAssignment_2_0 ) ) )
            // InternalLibrettoProjectProfile.g:5399:1: ( ( rule__OperationSignature__ParamsAssignment_2_0 ) )
            {
            // InternalLibrettoProjectProfile.g:5399:1: ( ( rule__OperationSignature__ParamsAssignment_2_0 ) )
            // InternalLibrettoProjectProfile.g:5400:2: ( rule__OperationSignature__ParamsAssignment_2_0 )
            {
             before(grammarAccess.getOperationSignatureAccess().getParamsAssignment_2_0()); 
            // InternalLibrettoProjectProfile.g:5401:2: ( rule__OperationSignature__ParamsAssignment_2_0 )
            // InternalLibrettoProjectProfile.g:5401:3: rule__OperationSignature__ParamsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__OperationSignature__ParamsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getOperationSignatureAccess().getParamsAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationSignature__Group_2__0__Impl"


    // $ANTLR start "rule__OperationSignature__Group_2__1"
    // InternalLibrettoProjectProfile.g:5409:1: rule__OperationSignature__Group_2__1 : rule__OperationSignature__Group_2__1__Impl ;
    public final void rule__OperationSignature__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5413:1: ( rule__OperationSignature__Group_2__1__Impl )
            // InternalLibrettoProjectProfile.g:5414:2: rule__OperationSignature__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OperationSignature__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationSignature__Group_2__1"


    // $ANTLR start "rule__OperationSignature__Group_2__1__Impl"
    // InternalLibrettoProjectProfile.g:5420:1: rule__OperationSignature__Group_2__1__Impl : ( ( rule__OperationSignature__Group_2_1__0 )* ) ;
    public final void rule__OperationSignature__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5424:1: ( ( ( rule__OperationSignature__Group_2_1__0 )* ) )
            // InternalLibrettoProjectProfile.g:5425:1: ( ( rule__OperationSignature__Group_2_1__0 )* )
            {
            // InternalLibrettoProjectProfile.g:5425:1: ( ( rule__OperationSignature__Group_2_1__0 )* )
            // InternalLibrettoProjectProfile.g:5426:2: ( rule__OperationSignature__Group_2_1__0 )*
            {
             before(grammarAccess.getOperationSignatureAccess().getGroup_2_1()); 
            // InternalLibrettoProjectProfile.g:5427:2: ( rule__OperationSignature__Group_2_1__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==73) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:5427:3: rule__OperationSignature__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_53);
            	    rule__OperationSignature__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getOperationSignatureAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationSignature__Group_2__1__Impl"


    // $ANTLR start "rule__OperationSignature__Group_2_1__0"
    // InternalLibrettoProjectProfile.g:5436:1: rule__OperationSignature__Group_2_1__0 : rule__OperationSignature__Group_2_1__0__Impl rule__OperationSignature__Group_2_1__1 ;
    public final void rule__OperationSignature__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5440:1: ( rule__OperationSignature__Group_2_1__0__Impl rule__OperationSignature__Group_2_1__1 )
            // InternalLibrettoProjectProfile.g:5441:2: rule__OperationSignature__Group_2_1__0__Impl rule__OperationSignature__Group_2_1__1
            {
            pushFollow(FOLLOW_49);
            rule__OperationSignature__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationSignature__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationSignature__Group_2_1__0"


    // $ANTLR start "rule__OperationSignature__Group_2_1__0__Impl"
    // InternalLibrettoProjectProfile.g:5448:1: rule__OperationSignature__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__OperationSignature__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5452:1: ( ( ',' ) )
            // InternalLibrettoProjectProfile.g:5453:1: ( ',' )
            {
            // InternalLibrettoProjectProfile.g:5453:1: ( ',' )
            // InternalLibrettoProjectProfile.g:5454:2: ','
            {
             before(grammarAccess.getOperationSignatureAccess().getCommaKeyword_2_1_0()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getOperationSignatureAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationSignature__Group_2_1__0__Impl"


    // $ANTLR start "rule__OperationSignature__Group_2_1__1"
    // InternalLibrettoProjectProfile.g:5463:1: rule__OperationSignature__Group_2_1__1 : rule__OperationSignature__Group_2_1__1__Impl ;
    public final void rule__OperationSignature__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5467:1: ( rule__OperationSignature__Group_2_1__1__Impl )
            // InternalLibrettoProjectProfile.g:5468:2: rule__OperationSignature__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OperationSignature__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationSignature__Group_2_1__1"


    // $ANTLR start "rule__OperationSignature__Group_2_1__1__Impl"
    // InternalLibrettoProjectProfile.g:5474:1: rule__OperationSignature__Group_2_1__1__Impl : ( ( rule__OperationSignature__ParamsAssignment_2_1_1 ) ) ;
    public final void rule__OperationSignature__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5478:1: ( ( ( rule__OperationSignature__ParamsAssignment_2_1_1 ) ) )
            // InternalLibrettoProjectProfile.g:5479:1: ( ( rule__OperationSignature__ParamsAssignment_2_1_1 ) )
            {
            // InternalLibrettoProjectProfile.g:5479:1: ( ( rule__OperationSignature__ParamsAssignment_2_1_1 ) )
            // InternalLibrettoProjectProfile.g:5480:2: ( rule__OperationSignature__ParamsAssignment_2_1_1 )
            {
             before(grammarAccess.getOperationSignatureAccess().getParamsAssignment_2_1_1()); 
            // InternalLibrettoProjectProfile.g:5481:2: ( rule__OperationSignature__ParamsAssignment_2_1_1 )
            // InternalLibrettoProjectProfile.g:5481:3: rule__OperationSignature__ParamsAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__OperationSignature__ParamsAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getOperationSignatureAccess().getParamsAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationSignature__Group_2_1__1__Impl"


    // $ANTLR start "rule__TypedParam__Group__0"
    // InternalLibrettoProjectProfile.g:5490:1: rule__TypedParam__Group__0 : rule__TypedParam__Group__0__Impl rule__TypedParam__Group__1 ;
    public final void rule__TypedParam__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5494:1: ( rule__TypedParam__Group__0__Impl rule__TypedParam__Group__1 )
            // InternalLibrettoProjectProfile.g:5495:2: rule__TypedParam__Group__0__Impl rule__TypedParam__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__TypedParam__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypedParam__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedParam__Group__0"


    // $ANTLR start "rule__TypedParam__Group__0__Impl"
    // InternalLibrettoProjectProfile.g:5502:1: rule__TypedParam__Group__0__Impl : ( ( rule__TypedParam__TypeAssignment_0 ) ) ;
    public final void rule__TypedParam__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5506:1: ( ( ( rule__TypedParam__TypeAssignment_0 ) ) )
            // InternalLibrettoProjectProfile.g:5507:1: ( ( rule__TypedParam__TypeAssignment_0 ) )
            {
            // InternalLibrettoProjectProfile.g:5507:1: ( ( rule__TypedParam__TypeAssignment_0 ) )
            // InternalLibrettoProjectProfile.g:5508:2: ( rule__TypedParam__TypeAssignment_0 )
            {
             before(grammarAccess.getTypedParamAccess().getTypeAssignment_0()); 
            // InternalLibrettoProjectProfile.g:5509:2: ( rule__TypedParam__TypeAssignment_0 )
            // InternalLibrettoProjectProfile.g:5509:3: rule__TypedParam__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TypedParam__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTypedParamAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedParam__Group__0__Impl"


    // $ANTLR start "rule__TypedParam__Group__1"
    // InternalLibrettoProjectProfile.g:5517:1: rule__TypedParam__Group__1 : rule__TypedParam__Group__1__Impl ;
    public final void rule__TypedParam__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5521:1: ( rule__TypedParam__Group__1__Impl )
            // InternalLibrettoProjectProfile.g:5522:2: rule__TypedParam__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypedParam__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedParam__Group__1"


    // $ANTLR start "rule__TypedParam__Group__1__Impl"
    // InternalLibrettoProjectProfile.g:5528:1: rule__TypedParam__Group__1__Impl : ( ( rule__TypedParam__ParamNameAssignment_1 ) ) ;
    public final void rule__TypedParam__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5532:1: ( ( ( rule__TypedParam__ParamNameAssignment_1 ) ) )
            // InternalLibrettoProjectProfile.g:5533:1: ( ( rule__TypedParam__ParamNameAssignment_1 ) )
            {
            // InternalLibrettoProjectProfile.g:5533:1: ( ( rule__TypedParam__ParamNameAssignment_1 ) )
            // InternalLibrettoProjectProfile.g:5534:2: ( rule__TypedParam__ParamNameAssignment_1 )
            {
             before(grammarAccess.getTypedParamAccess().getParamNameAssignment_1()); 
            // InternalLibrettoProjectProfile.g:5535:2: ( rule__TypedParam__ParamNameAssignment_1 )
            // InternalLibrettoProjectProfile.g:5535:3: rule__TypedParam__ParamNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TypedParam__ParamNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTypedParamAccess().getParamNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedParam__Group__1__Impl"


    // $ANTLR start "rule__ValidID__Group__0"
    // InternalLibrettoProjectProfile.g:5544:1: rule__ValidID__Group__0 : rule__ValidID__Group__0__Impl rule__ValidID__Group__1 ;
    public final void rule__ValidID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5548:1: ( rule__ValidID__Group__0__Impl rule__ValidID__Group__1 )
            // InternalLibrettoProjectProfile.g:5549:2: rule__ValidID__Group__0__Impl rule__ValidID__Group__1
            {
            pushFollow(FOLLOW_60);
            rule__ValidID__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValidID__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidID__Group__0"


    // $ANTLR start "rule__ValidID__Group__0__Impl"
    // InternalLibrettoProjectProfile.g:5556:1: rule__ValidID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__ValidID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5560:1: ( ( RULE_ID ) )
            // InternalLibrettoProjectProfile.g:5561:1: ( RULE_ID )
            {
            // InternalLibrettoProjectProfile.g:5561:1: ( RULE_ID )
            // InternalLibrettoProjectProfile.g:5562:2: RULE_ID
            {
             before(grammarAccess.getValidIDAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getValidIDAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidID__Group__0__Impl"


    // $ANTLR start "rule__ValidID__Group__1"
    // InternalLibrettoProjectProfile.g:5571:1: rule__ValidID__Group__1 : rule__ValidID__Group__1__Impl ;
    public final void rule__ValidID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5575:1: ( rule__ValidID__Group__1__Impl )
            // InternalLibrettoProjectProfile.g:5576:2: rule__ValidID__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ValidID__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidID__Group__1"


    // $ANTLR start "rule__ValidID__Group__1__Impl"
    // InternalLibrettoProjectProfile.g:5582:1: rule__ValidID__Group__1__Impl : ( ( rule__ValidID__Group_1__0 )* ) ;
    public final void rule__ValidID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5586:1: ( ( ( rule__ValidID__Group_1__0 )* ) )
            // InternalLibrettoProjectProfile.g:5587:1: ( ( rule__ValidID__Group_1__0 )* )
            {
            // InternalLibrettoProjectProfile.g:5587:1: ( ( rule__ValidID__Group_1__0 )* )
            // InternalLibrettoProjectProfile.g:5588:2: ( rule__ValidID__Group_1__0 )*
            {
             before(grammarAccess.getValidIDAccess().getGroup_1()); 
            // InternalLibrettoProjectProfile.g:5589:2: ( rule__ValidID__Group_1__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>=25 && LA41_0<=27)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:5589:3: rule__ValidID__Group_1__0
            	    {
            	    pushFollow(FOLLOW_61);
            	    rule__ValidID__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             after(grammarAccess.getValidIDAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidID__Group__1__Impl"


    // $ANTLR start "rule__ValidID__Group_1__0"
    // InternalLibrettoProjectProfile.g:5598:1: rule__ValidID__Group_1__0 : rule__ValidID__Group_1__0__Impl rule__ValidID__Group_1__1 ;
    public final void rule__ValidID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5602:1: ( rule__ValidID__Group_1__0__Impl rule__ValidID__Group_1__1 )
            // InternalLibrettoProjectProfile.g:5603:2: rule__ValidID__Group_1__0__Impl rule__ValidID__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__ValidID__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValidID__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidID__Group_1__0"


    // $ANTLR start "rule__ValidID__Group_1__0__Impl"
    // InternalLibrettoProjectProfile.g:5610:1: rule__ValidID__Group_1__0__Impl : ( ( rule__ValidID__Alternatives_1_0 ) ) ;
    public final void rule__ValidID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5614:1: ( ( ( rule__ValidID__Alternatives_1_0 ) ) )
            // InternalLibrettoProjectProfile.g:5615:1: ( ( rule__ValidID__Alternatives_1_0 ) )
            {
            // InternalLibrettoProjectProfile.g:5615:1: ( ( rule__ValidID__Alternatives_1_0 ) )
            // InternalLibrettoProjectProfile.g:5616:2: ( rule__ValidID__Alternatives_1_0 )
            {
             before(grammarAccess.getValidIDAccess().getAlternatives_1_0()); 
            // InternalLibrettoProjectProfile.g:5617:2: ( rule__ValidID__Alternatives_1_0 )
            // InternalLibrettoProjectProfile.g:5617:3: rule__ValidID__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ValidID__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getValidIDAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidID__Group_1__0__Impl"


    // $ANTLR start "rule__ValidID__Group_1__1"
    // InternalLibrettoProjectProfile.g:5625:1: rule__ValidID__Group_1__1 : rule__ValidID__Group_1__1__Impl ;
    public final void rule__ValidID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5629:1: ( rule__ValidID__Group_1__1__Impl )
            // InternalLibrettoProjectProfile.g:5630:2: rule__ValidID__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ValidID__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidID__Group_1__1"


    // $ANTLR start "rule__ValidID__Group_1__1__Impl"
    // InternalLibrettoProjectProfile.g:5636:1: rule__ValidID__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__ValidID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5640:1: ( ( RULE_ID ) )
            // InternalLibrettoProjectProfile.g:5641:1: ( RULE_ID )
            {
            // InternalLibrettoProjectProfile.g:5641:1: ( RULE_ID )
            // InternalLibrettoProjectProfile.g:5642:2: RULE_ID
            {
             before(grammarAccess.getValidIDAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getValidIDAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidID__Group_1__1__Impl"


    // $ANTLR start "rule__ProjectProfile__NameAssignment_2"
    // InternalLibrettoProjectProfile.g:5652:1: rule__ProjectProfile__NameAssignment_2 : ( ruleValidID ) ;
    public final void rule__ProjectProfile__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5656:1: ( ( ruleValidID ) )
            // InternalLibrettoProjectProfile.g:5657:2: ( ruleValidID )
            {
            // InternalLibrettoProjectProfile.g:5657:2: ( ruleValidID )
            // InternalLibrettoProjectProfile.g:5658:3: ruleValidID
            {
             before(grammarAccess.getProjectProfileAccess().getNameValidIDParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getProjectProfileAccess().getNameValidIDParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectProfile__NameAssignment_2"


    // $ANTLR start "rule__ProjectProfile__ProjectsAssignment_4_0"
    // InternalLibrettoProjectProfile.g:5667:1: rule__ProjectProfile__ProjectsAssignment_4_0 : ( ruleProjectBlock ) ;
    public final void rule__ProjectProfile__ProjectsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5671:1: ( ( ruleProjectBlock ) )
            // InternalLibrettoProjectProfile.g:5672:2: ( ruleProjectBlock )
            {
            // InternalLibrettoProjectProfile.g:5672:2: ( ruleProjectBlock )
            // InternalLibrettoProjectProfile.g:5673:3: ruleProjectBlock
            {
             before(grammarAccess.getProjectProfileAccess().getProjectsProjectBlockParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleProjectBlock();

            state._fsp--;

             after(grammarAccess.getProjectProfileAccess().getProjectsProjectBlockParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectProfile__ProjectsAssignment_4_0"


    // $ANTLR start "rule__ProjectProfile__LlmProvidersAssignment_4_1"
    // InternalLibrettoProjectProfile.g:5682:1: rule__ProjectProfile__LlmProvidersAssignment_4_1 : ( ruleLlmProvidersBlock ) ;
    public final void rule__ProjectProfile__LlmProvidersAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5686:1: ( ( ruleLlmProvidersBlock ) )
            // InternalLibrettoProjectProfile.g:5687:2: ( ruleLlmProvidersBlock )
            {
            // InternalLibrettoProjectProfile.g:5687:2: ( ruleLlmProvidersBlock )
            // InternalLibrettoProjectProfile.g:5688:3: ruleLlmProvidersBlock
            {
             before(grammarAccess.getProjectProfileAccess().getLlmProvidersLlmProvidersBlockParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLlmProvidersBlock();

            state._fsp--;

             after(grammarAccess.getProjectProfileAccess().getLlmProvidersLlmProvidersBlockParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectProfile__LlmProvidersAssignment_4_1"


    // $ANTLR start "rule__ProjectProfile__SurfacesAssignment_4_2"
    // InternalLibrettoProjectProfile.g:5697:1: rule__ProjectProfile__SurfacesAssignment_4_2 : ( ruleSurfaceBlock ) ;
    public final void rule__ProjectProfile__SurfacesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5701:1: ( ( ruleSurfaceBlock ) )
            // InternalLibrettoProjectProfile.g:5702:2: ( ruleSurfaceBlock )
            {
            // InternalLibrettoProjectProfile.g:5702:2: ( ruleSurfaceBlock )
            // InternalLibrettoProjectProfile.g:5703:3: ruleSurfaceBlock
            {
             before(grammarAccess.getProjectProfileAccess().getSurfacesSurfaceBlockParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSurfaceBlock();

            state._fsp--;

             after(grammarAccess.getProjectProfileAccess().getSurfacesSurfaceBlockParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectProfile__SurfacesAssignment_4_2"


    // $ANTLR start "rule__ProjectBlock__RootDirAssignment_3_0_1"
    // InternalLibrettoProjectProfile.g:5712:1: rule__ProjectBlock__RootDirAssignment_3_0_1 : ( RULE_STRING ) ;
    public final void rule__ProjectBlock__RootDirAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5716:1: ( ( RULE_STRING ) )
            // InternalLibrettoProjectProfile.g:5717:2: ( RULE_STRING )
            {
            // InternalLibrettoProjectProfile.g:5717:2: ( RULE_STRING )
            // InternalLibrettoProjectProfile.g:5718:3: RULE_STRING
            {
             before(grammarAccess.getProjectBlockAccess().getRootDirSTRINGTerminalRuleCall_3_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getProjectBlockAccess().getRootDirSTRINGTerminalRuleCall_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectBlock__RootDirAssignment_3_0_1"


    // $ANTLR start "rule__ProjectBlock__ModulesAssignment_3_1"
    // InternalLibrettoProjectProfile.g:5727:1: rule__ProjectBlock__ModulesAssignment_3_1 : ( ruleModulesBlock ) ;
    public final void rule__ProjectBlock__ModulesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5731:1: ( ( ruleModulesBlock ) )
            // InternalLibrettoProjectProfile.g:5732:2: ( ruleModulesBlock )
            {
            // InternalLibrettoProjectProfile.g:5732:2: ( ruleModulesBlock )
            // InternalLibrettoProjectProfile.g:5733:3: ruleModulesBlock
            {
             before(grammarAccess.getProjectBlockAccess().getModulesModulesBlockParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleModulesBlock();

            state._fsp--;

             after(grammarAccess.getProjectBlockAccess().getModulesModulesBlockParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectBlock__ModulesAssignment_3_1"


    // $ANTLR start "rule__ProjectBlock__GensAssignment_3_2"
    // InternalLibrettoProjectProfile.g:5742:1: rule__ProjectBlock__GensAssignment_3_2 : ( ruleGenBlock ) ;
    public final void rule__ProjectBlock__GensAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5746:1: ( ( ruleGenBlock ) )
            // InternalLibrettoProjectProfile.g:5747:2: ( ruleGenBlock )
            {
            // InternalLibrettoProjectProfile.g:5747:2: ( ruleGenBlock )
            // InternalLibrettoProjectProfile.g:5748:3: ruleGenBlock
            {
             before(grammarAccess.getProjectBlockAccess().getGensGenBlockParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleGenBlock();

            state._fsp--;

             after(grammarAccess.getProjectBlockAccess().getGensGenBlockParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectBlock__GensAssignment_3_2"


    // $ANTLR start "rule__ModulesBlock__ModulesAssignment_3"
    // InternalLibrettoProjectProfile.g:5757:1: rule__ModulesBlock__ModulesAssignment_3 : ( ruleProjectModule ) ;
    public final void rule__ModulesBlock__ModulesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5761:1: ( ( ruleProjectModule ) )
            // InternalLibrettoProjectProfile.g:5762:2: ( ruleProjectModule )
            {
            // InternalLibrettoProjectProfile.g:5762:2: ( ruleProjectModule )
            // InternalLibrettoProjectProfile.g:5763:3: ruleProjectModule
            {
             before(grammarAccess.getModulesBlockAccess().getModulesProjectModuleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleProjectModule();

            state._fsp--;

             after(grammarAccess.getModulesBlockAccess().getModulesProjectModuleParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModulesBlock__ModulesAssignment_3"


    // $ANTLR start "rule__ProjectModule__NameAssignment_1"
    // InternalLibrettoProjectProfile.g:5772:1: rule__ProjectModule__NameAssignment_1 : ( ruleValidID ) ;
    public final void rule__ProjectModule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5776:1: ( ( ruleValidID ) )
            // InternalLibrettoProjectProfile.g:5777:2: ( ruleValidID )
            {
            // InternalLibrettoProjectProfile.g:5777:2: ( ruleValidID )
            // InternalLibrettoProjectProfile.g:5778:3: ruleValidID
            {
             before(grammarAccess.getProjectModuleAccess().getNameValidIDParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getProjectModuleAccess().getNameValidIDParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModule__NameAssignment_1"


    // $ANTLR start "rule__ProjectModule__DirsAssignment_3_0_1"
    // InternalLibrettoProjectProfile.g:5787:1: rule__ProjectModule__DirsAssignment_3_0_1 : ( RULE_STRING ) ;
    public final void rule__ProjectModule__DirsAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5791:1: ( ( RULE_STRING ) )
            // InternalLibrettoProjectProfile.g:5792:2: ( RULE_STRING )
            {
            // InternalLibrettoProjectProfile.g:5792:2: ( RULE_STRING )
            // InternalLibrettoProjectProfile.g:5793:3: RULE_STRING
            {
             before(grammarAccess.getProjectModuleAccess().getDirsSTRINGTerminalRuleCall_3_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getProjectModuleAccess().getDirsSTRINGTerminalRuleCall_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModule__DirsAssignment_3_0_1"


    // $ANTLR start "rule__ProjectModule__SpecDirsAssignment_3_1_1"
    // InternalLibrettoProjectProfile.g:5802:1: rule__ProjectModule__SpecDirsAssignment_3_1_1 : ( RULE_STRING ) ;
    public final void rule__ProjectModule__SpecDirsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5806:1: ( ( RULE_STRING ) )
            // InternalLibrettoProjectProfile.g:5807:2: ( RULE_STRING )
            {
            // InternalLibrettoProjectProfile.g:5807:2: ( RULE_STRING )
            // InternalLibrettoProjectProfile.g:5808:3: RULE_STRING
            {
             before(grammarAccess.getProjectModuleAccess().getSpecDirsSTRINGTerminalRuleCall_3_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getProjectModuleAccess().getSpecDirsSTRINGTerminalRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModule__SpecDirsAssignment_3_1_1"


    // $ANTLR start "rule__ProjectModule__TestDirsAssignment_3_2_1"
    // InternalLibrettoProjectProfile.g:5817:1: rule__ProjectModule__TestDirsAssignment_3_2_1 : ( RULE_STRING ) ;
    public final void rule__ProjectModule__TestDirsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5821:1: ( ( RULE_STRING ) )
            // InternalLibrettoProjectProfile.g:5822:2: ( RULE_STRING )
            {
            // InternalLibrettoProjectProfile.g:5822:2: ( RULE_STRING )
            // InternalLibrettoProjectProfile.g:5823:3: RULE_STRING
            {
             before(grammarAccess.getProjectModuleAccess().getTestDirsSTRINGTerminalRuleCall_3_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getProjectModuleAccess().getTestDirsSTRINGTerminalRuleCall_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModule__TestDirsAssignment_3_2_1"


    // $ANTLR start "rule__ProjectModule__MainDirsAssignment_3_3_1"
    // InternalLibrettoProjectProfile.g:5832:1: rule__ProjectModule__MainDirsAssignment_3_3_1 : ( RULE_STRING ) ;
    public final void rule__ProjectModule__MainDirsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5836:1: ( ( RULE_STRING ) )
            // InternalLibrettoProjectProfile.g:5837:2: ( RULE_STRING )
            {
            // InternalLibrettoProjectProfile.g:5837:2: ( RULE_STRING )
            // InternalLibrettoProjectProfile.g:5838:3: RULE_STRING
            {
             before(grammarAccess.getProjectModuleAccess().getMainDirsSTRINGTerminalRuleCall_3_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getProjectModuleAccess().getMainDirsSTRINGTerminalRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModule__MainDirsAssignment_3_3_1"


    // $ANTLR start "rule__ProjectModule__BasePackagesAssignment_3_4_1"
    // InternalLibrettoProjectProfile.g:5847:1: rule__ProjectModule__BasePackagesAssignment_3_4_1 : ( RULE_STRING ) ;
    public final void rule__ProjectModule__BasePackagesAssignment_3_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5851:1: ( ( RULE_STRING ) )
            // InternalLibrettoProjectProfile.g:5852:2: ( RULE_STRING )
            {
            // InternalLibrettoProjectProfile.g:5852:2: ( RULE_STRING )
            // InternalLibrettoProjectProfile.g:5853:3: RULE_STRING
            {
             before(grammarAccess.getProjectModuleAccess().getBasePackagesSTRINGTerminalRuleCall_3_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getProjectModuleAccess().getBasePackagesSTRINGTerminalRuleCall_3_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModule__BasePackagesAssignment_3_4_1"


    // $ANTLR start "rule__GenBlock__InitialInstructionsAssignment_3_0_1"
    // InternalLibrettoProjectProfile.g:5862:1: rule__GenBlock__InitialInstructionsAssignment_3_0_1 : ( RULE_STRING ) ;
    public final void rule__GenBlock__InitialInstructionsAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5866:1: ( ( RULE_STRING ) )
            // InternalLibrettoProjectProfile.g:5867:2: ( RULE_STRING )
            {
            // InternalLibrettoProjectProfile.g:5867:2: ( RULE_STRING )
            // InternalLibrettoProjectProfile.g:5868:3: RULE_STRING
            {
             before(grammarAccess.getGenBlockAccess().getInitialInstructionsSTRINGTerminalRuleCall_3_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGenBlockAccess().getInitialInstructionsSTRINGTerminalRuleCall_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenBlock__InitialInstructionsAssignment_3_0_1"


    // $ANTLR start "rule__GenBlock__MaxRetriesAssignment_3_1_1"
    // InternalLibrettoProjectProfile.g:5877:1: rule__GenBlock__MaxRetriesAssignment_3_1_1 : ( RULE_INT ) ;
    public final void rule__GenBlock__MaxRetriesAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5881:1: ( ( RULE_INT ) )
            // InternalLibrettoProjectProfile.g:5882:2: ( RULE_INT )
            {
            // InternalLibrettoProjectProfile.g:5882:2: ( RULE_INT )
            // InternalLibrettoProjectProfile.g:5883:3: RULE_INT
            {
             before(grammarAccess.getGenBlockAccess().getMaxRetriesINTTerminalRuleCall_3_1_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getGenBlockAccess().getMaxRetriesINTTerminalRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenBlock__MaxRetriesAssignment_3_1_1"


    // $ANTLR start "rule__GenBlock__ParseChecksAssignment_3_2_1"
    // InternalLibrettoProjectProfile.g:5892:1: rule__GenBlock__ParseChecksAssignment_3_2_1 : ( ( rule__GenBlock__ParseChecksAlternatives_3_2_1_0 ) ) ;
    public final void rule__GenBlock__ParseChecksAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5896:1: ( ( ( rule__GenBlock__ParseChecksAlternatives_3_2_1_0 ) ) )
            // InternalLibrettoProjectProfile.g:5897:2: ( ( rule__GenBlock__ParseChecksAlternatives_3_2_1_0 ) )
            {
            // InternalLibrettoProjectProfile.g:5897:2: ( ( rule__GenBlock__ParseChecksAlternatives_3_2_1_0 ) )
            // InternalLibrettoProjectProfile.g:5898:3: ( rule__GenBlock__ParseChecksAlternatives_3_2_1_0 )
            {
             before(grammarAccess.getGenBlockAccess().getParseChecksAlternatives_3_2_1_0()); 
            // InternalLibrettoProjectProfile.g:5899:3: ( rule__GenBlock__ParseChecksAlternatives_3_2_1_0 )
            // InternalLibrettoProjectProfile.g:5899:4: rule__GenBlock__ParseChecksAlternatives_3_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__GenBlock__ParseChecksAlternatives_3_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getGenBlockAccess().getParseChecksAlternatives_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenBlock__ParseChecksAssignment_3_2_1"


    // $ANTLR start "rule__GenBlock__DefaultCorrectionsAssignment_3_3_1"
    // InternalLibrettoProjectProfile.g:5907:1: rule__GenBlock__DefaultCorrectionsAssignment_3_3_1 : ( RULE_STRING ) ;
    public final void rule__GenBlock__DefaultCorrectionsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5911:1: ( ( RULE_STRING ) )
            // InternalLibrettoProjectProfile.g:5912:2: ( RULE_STRING )
            {
            // InternalLibrettoProjectProfile.g:5912:2: ( RULE_STRING )
            // InternalLibrettoProjectProfile.g:5913:3: RULE_STRING
            {
             before(grammarAccess.getGenBlockAccess().getDefaultCorrectionsSTRINGTerminalRuleCall_3_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGenBlockAccess().getDefaultCorrectionsSTRINGTerminalRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenBlock__DefaultCorrectionsAssignment_3_3_1"


    // $ANTLR start "rule__GenBlock__RemediationsAssignment_3_4"
    // InternalLibrettoProjectProfile.g:5922:1: rule__GenBlock__RemediationsAssignment_3_4 : ( ruleGenRemediationRules ) ;
    public final void rule__GenBlock__RemediationsAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5926:1: ( ( ruleGenRemediationRules ) )
            // InternalLibrettoProjectProfile.g:5927:2: ( ruleGenRemediationRules )
            {
            // InternalLibrettoProjectProfile.g:5927:2: ( ruleGenRemediationRules )
            // InternalLibrettoProjectProfile.g:5928:3: ruleGenRemediationRules
            {
             before(grammarAccess.getGenBlockAccess().getRemediationsGenRemediationRulesParserRuleCall_3_4_0()); 
            pushFollow(FOLLOW_2);
            ruleGenRemediationRules();

            state._fsp--;

             after(grammarAccess.getGenBlockAccess().getRemediationsGenRemediationRulesParserRuleCall_3_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenBlock__RemediationsAssignment_3_4"


    // $ANTLR start "rule__GenBlock__ModelUsagesAssignment_3_5"
    // InternalLibrettoProjectProfile.g:5937:1: rule__GenBlock__ModelUsagesAssignment_3_5 : ( ruleGenUsageBlock ) ;
    public final void rule__GenBlock__ModelUsagesAssignment_3_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5941:1: ( ( ruleGenUsageBlock ) )
            // InternalLibrettoProjectProfile.g:5942:2: ( ruleGenUsageBlock )
            {
            // InternalLibrettoProjectProfile.g:5942:2: ( ruleGenUsageBlock )
            // InternalLibrettoProjectProfile.g:5943:3: ruleGenUsageBlock
            {
             before(grammarAccess.getGenBlockAccess().getModelUsagesGenUsageBlockParserRuleCall_3_5_0()); 
            pushFollow(FOLLOW_2);
            ruleGenUsageBlock();

            state._fsp--;

             after(grammarAccess.getGenBlockAccess().getModelUsagesGenUsageBlockParserRuleCall_3_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenBlock__ModelUsagesAssignment_3_5"


    // $ANTLR start "rule__GenRemediationRules__PatternRulesAssignment_3_0"
    // InternalLibrettoProjectProfile.g:5952:1: rule__GenRemediationRules__PatternRulesAssignment_3_0 : ( ruleGenPatternRemediationRule ) ;
    public final void rule__GenRemediationRules__PatternRulesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5956:1: ( ( ruleGenPatternRemediationRule ) )
            // InternalLibrettoProjectProfile.g:5957:2: ( ruleGenPatternRemediationRule )
            {
            // InternalLibrettoProjectProfile.g:5957:2: ( ruleGenPatternRemediationRule )
            // InternalLibrettoProjectProfile.g:5958:3: ruleGenPatternRemediationRule
            {
             before(grammarAccess.getGenRemediationRulesAccess().getPatternRulesGenPatternRemediationRuleParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleGenPatternRemediationRule();

            state._fsp--;

             after(grammarAccess.getGenRemediationRulesAccess().getPatternRulesGenPatternRemediationRuleParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenRemediationRules__PatternRulesAssignment_3_0"


    // $ANTLR start "rule__GenRemediationRules__DefaultRemediationsAssignment_3_1"
    // InternalLibrettoProjectProfile.g:5967:1: rule__GenRemediationRules__DefaultRemediationsAssignment_3_1 : ( ruleGenDefaultRemediationRule ) ;
    public final void rule__GenRemediationRules__DefaultRemediationsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5971:1: ( ( ruleGenDefaultRemediationRule ) )
            // InternalLibrettoProjectProfile.g:5972:2: ( ruleGenDefaultRemediationRule )
            {
            // InternalLibrettoProjectProfile.g:5972:2: ( ruleGenDefaultRemediationRule )
            // InternalLibrettoProjectProfile.g:5973:3: ruleGenDefaultRemediationRule
            {
             before(grammarAccess.getGenRemediationRulesAccess().getDefaultRemediationsGenDefaultRemediationRuleParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGenDefaultRemediationRule();

            state._fsp--;

             after(grammarAccess.getGenRemediationRulesAccess().getDefaultRemediationsGenDefaultRemediationRuleParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenRemediationRules__DefaultRemediationsAssignment_3_1"


    // $ANTLR start "rule__GenPatternRemediationRule__PatternsAssignment_3_0_1"
    // InternalLibrettoProjectProfile.g:5982:1: rule__GenPatternRemediationRule__PatternsAssignment_3_0_1 : ( RULE_STRING ) ;
    public final void rule__GenPatternRemediationRule__PatternsAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5986:1: ( ( RULE_STRING ) )
            // InternalLibrettoProjectProfile.g:5987:2: ( RULE_STRING )
            {
            // InternalLibrettoProjectProfile.g:5987:2: ( RULE_STRING )
            // InternalLibrettoProjectProfile.g:5988:3: RULE_STRING
            {
             before(grammarAccess.getGenPatternRemediationRuleAccess().getPatternsSTRINGTerminalRuleCall_3_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGenPatternRemediationRuleAccess().getPatternsSTRINGTerminalRuleCall_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenPatternRemediationRule__PatternsAssignment_3_0_1"


    // $ANTLR start "rule__GenPatternRemediationRule__CodesAssignment_3_1_1"
    // InternalLibrettoProjectProfile.g:5997:1: rule__GenPatternRemediationRule__CodesAssignment_3_1_1 : ( RULE_STRING ) ;
    public final void rule__GenPatternRemediationRule__CodesAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:6001:1: ( ( RULE_STRING ) )
            // InternalLibrettoProjectProfile.g:6002:2: ( RULE_STRING )
            {
            // InternalLibrettoProjectProfile.g:6002:2: ( RULE_STRING )
            // InternalLibrettoProjectProfile.g:6003:3: RULE_STRING
            {
             before(grammarAccess.getGenPatternRemediationRuleAccess().getCodesSTRINGTerminalRuleCall_3_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGenPatternRemediationRuleAccess().getCodesSTRINGTerminalRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenPatternRemediationRule__CodesAssignment_3_1_1"


    // $ANTLR start "rule__GenPatternRemediationRule__CorrectionsAssignment_3_2_1"
    // InternalLibrettoProjectProfile.g:6012:1: rule__GenPatternRemediationRule__CorrectionsAssignment_3_2_1 : ( RULE_STRING ) ;
    public final void rule__GenPatternRemediationRule__CorrectionsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:6016:1: ( ( RULE_STRING ) )
            // InternalLibrettoProjectProfile.g:6017:2: ( RULE_STRING )
            {
            // InternalLibrettoProjectProfile.g:6017:2: ( RULE_STRING )
            // InternalLibrettoProjectProfile.g:6018:3: RULE_STRING
            {
             before(grammarAccess.getGenPatternRemediationRuleAccess().getCorrectionsSTRINGTerminalRuleCall_3_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGenPatternRemediationRuleAccess().getCorrectionsSTRINGTerminalRuleCall_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenPatternRemediationRule__CorrectionsAssignment_3_2_1"


    // $ANTLR start "rule__GenDefaultRemediationRule__CodesAssignment_3_0_1"
    // InternalLibrettoProjectProfile.g:6027:1: rule__GenDefaultRemediationRule__CodesAssignment_3_0_1 : ( RULE_STRING ) ;
    public final void rule__GenDefaultRemediationRule__CodesAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:6031:1: ( ( RULE_STRING ) )
            // InternalLibrettoProjectProfile.g:6032:2: ( RULE_STRING )
            {
            // InternalLibrettoProjectProfile.g:6032:2: ( RULE_STRING )
            // InternalLibrettoProjectProfile.g:6033:3: RULE_STRING
            {
             before(grammarAccess.getGenDefaultRemediationRuleAccess().getCodesSTRINGTerminalRuleCall_3_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGenDefaultRemediationRuleAccess().getCodesSTRINGTerminalRuleCall_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenDefaultRemediationRule__CodesAssignment_3_0_1"


    // $ANTLR start "rule__GenDefaultRemediationRule__CorrectionAssignment_3_1_1"
    // InternalLibrettoProjectProfile.g:6042:1: rule__GenDefaultRemediationRule__CorrectionAssignment_3_1_1 : ( RULE_STRING ) ;
    public final void rule__GenDefaultRemediationRule__CorrectionAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:6046:1: ( ( RULE_STRING ) )
            // InternalLibrettoProjectProfile.g:6047:2: ( RULE_STRING )
            {
            // InternalLibrettoProjectProfile.g:6047:2: ( RULE_STRING )
            // InternalLibrettoProjectProfile.g:6048:3: RULE_STRING
            {
             before(grammarAccess.getGenDefaultRemediationRuleAccess().getCorrectionSTRINGTerminalRuleCall_3_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGenDefaultRemediationRuleAccess().getCorrectionSTRINGTerminalRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenDefaultRemediationRule__CorrectionAssignment_3_1_1"


    // $ANTLR start "rule__LlmProvidersBlock__ProvidersAssignment_3"
    // InternalLibrettoProjectProfile.g:6057:1: rule__LlmProvidersBlock__ProvidersAssignment_3 : ( ruleNamedLlmProvider ) ;
    public final void rule__LlmProvidersBlock__ProvidersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:6061:1: ( ( ruleNamedLlmProvider ) )
            // InternalLibrettoProjectProfile.g:6062:2: ( ruleNamedLlmProvider )
            {
            // InternalLibrettoProjectProfile.g:6062:2: ( ruleNamedLlmProvider )
            // InternalLibrettoProjectProfile.g:6063:3: ruleNamedLlmProvider
            {
             before(grammarAccess.getLlmProvidersBlockAccess().getProvidersNamedLlmProviderParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleNamedLlmProvider();

            state._fsp--;

             after(grammarAccess.getLlmProvidersBlockAccess().getProvidersNamedLlmProviderParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LlmProvidersBlock__ProvidersAssignment_3"


    // $ANTLR start "rule__NamedLlmProvider__NameAssignment_1"
    // InternalLibrettoProjectProfile.g:6072:1: rule__NamedLlmProvider__NameAssignment_1 : ( ruleValidID ) ;
    public final void rule__NamedLlmProvider__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:6076:1: ( ( ruleValidID ) )
            // InternalLibrettoProjectProfile.g:6077:2: ( ruleValidID )
            {
            // InternalLibrettoProjectProfile.g:6077:2: ( ruleValidID )
            // InternalLibrettoProjectProfile.g:6078:3: ruleValidID
            {
             before(grammarAccess.getNamedLlmProviderAccess().getNameValidIDParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getNamedLlmProviderAccess().getNameValidIDParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedLlmProvider__NameAssignment_1"


    // $ANTLR start "rule__NamedLlmProvider__KindsAssignment_3_0_1"
    // InternalLibrettoProjectProfile.g:6087:1: rule__NamedLlmProvider__KindsAssignment_3_0_1 : ( ( rule__NamedLlmProvider__KindsAlternatives_3_0_1_0 ) ) ;
    public final void rule__NamedLlmProvider__KindsAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:6091:1: ( ( ( rule__NamedLlmProvider__KindsAlternatives_3_0_1_0 ) ) )
            // InternalLibrettoProjectProfile.g:6092:2: ( ( rule__NamedLlmProvider__KindsAlternatives_3_0_1_0 ) )
            {
            // InternalLibrettoProjectProfile.g:6092:2: ( ( rule__NamedLlmProvider__KindsAlternatives_3_0_1_0 ) )
            // InternalLibrettoProjectProfile.g:6093:3: ( rule__NamedLlmProvider__KindsAlternatives_3_0_1_0 )
            {
             before(grammarAccess.getNamedLlmProviderAccess().getKindsAlternatives_3_0_1_0()); 
            // InternalLibrettoProjectProfile.g:6094:3: ( rule__NamedLlmProvider__KindsAlternatives_3_0_1_0 )
            // InternalLibrettoProjectProfile.g:6094:4: rule__NamedLlmProvider__KindsAlternatives_3_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__NamedLlmProvider__KindsAlternatives_3_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getNamedLlmProviderAccess().getKindsAlternatives_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedLlmProvider__KindsAssignment_3_0_1"


    // $ANTLR start "rule__NamedLlmProvider__LocalModelPathsAssignment_3_1_1"
    // InternalLibrettoProjectProfile.g:6102:1: rule__NamedLlmProvider__LocalModelPathsAssignment_3_1_1 : ( RULE_STRING ) ;
    public final void rule__NamedLlmProvider__LocalModelPathsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:6106:1: ( ( RULE_STRING ) )
            // InternalLibrettoProjectProfile.g:6107:2: ( RULE_STRING )
            {
            // InternalLibrettoProjectProfile.g:6107:2: ( RULE_STRING )
            // InternalLibrettoProjectProfile.g:6108:3: RULE_STRING
            {
             before(grammarAccess.getNamedLlmProviderAccess().getLocalModelPathsSTRINGTerminalRuleCall_3_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getNamedLlmProviderAccess().getLocalModelPathsSTRINGTerminalRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedLlmProvider__LocalModelPathsAssignment_3_1_1"


    // $ANTLR start "rule__NamedLlmProvider__ModelsAssignment_3_2_1"
    // InternalLibrettoProjectProfile.g:6117:1: rule__NamedLlmProvider__ModelsAssignment_3_2_1 : ( RULE_STRING ) ;
    public final void rule__NamedLlmProvider__ModelsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:6121:1: ( ( RULE_STRING ) )
            // InternalLibrettoProjectProfile.g:6122:2: ( RULE_STRING )
            {
            // InternalLibrettoProjectProfile.g:6122:2: ( RULE_STRING )
            // InternalLibrettoProjectProfile.g:6123:3: RULE_STRING
            {
             before(grammarAccess.getNamedLlmProviderAccess().getModelsSTRINGTerminalRuleCall_3_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getNamedLlmProviderAccess().getModelsSTRINGTerminalRuleCall_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedLlmProvider__ModelsAssignment_3_2_1"


    // $ANTLR start "rule__NamedLlmProvider__EndpointsAssignment_3_3_1"
    // InternalLibrettoProjectProfile.g:6132:1: rule__NamedLlmProvider__EndpointsAssignment_3_3_1 : ( RULE_STRING ) ;
    public final void rule__NamedLlmProvider__EndpointsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:6136:1: ( ( RULE_STRING ) )
            // InternalLibrettoProjectProfile.g:6137:2: ( RULE_STRING )
            {
            // InternalLibrettoProjectProfile.g:6137:2: ( RULE_STRING )
            // InternalLibrettoProjectProfile.g:6138:3: RULE_STRING
            {
             before(grammarAccess.getNamedLlmProviderAccess().getEndpointsSTRINGTerminalRuleCall_3_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getNamedLlmProviderAccess().getEndpointsSTRINGTerminalRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedLlmProvider__EndpointsAssignment_3_3_1"


    // $ANTLR start "rule__GenUsageBlock__PrimaryProvidersAssignment_3_0_1"
    // InternalLibrettoProjectProfile.g:6147:1: rule__GenUsageBlock__PrimaryProvidersAssignment_3_0_1 : ( RULE_STRING ) ;
    public final void rule__GenUsageBlock__PrimaryProvidersAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:6151:1: ( ( RULE_STRING ) )
            // InternalLibrettoProjectProfile.g:6152:2: ( RULE_STRING )
            {
            // InternalLibrettoProjectProfile.g:6152:2: ( RULE_STRING )
            // InternalLibrettoProjectProfile.g:6153:3: RULE_STRING
            {
             before(grammarAccess.getGenUsageBlockAccess().getPrimaryProvidersSTRINGTerminalRuleCall_3_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGenUsageBlockAccess().getPrimaryProvidersSTRINGTerminalRuleCall_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenUsageBlock__PrimaryProvidersAssignment_3_0_1"


    // $ANTLR start "rule__GenUsageBlock__SecondaryProvidersAssignment_3_1_1"
    // InternalLibrettoProjectProfile.g:6162:1: rule__GenUsageBlock__SecondaryProvidersAssignment_3_1_1 : ( RULE_STRING ) ;
    public final void rule__GenUsageBlock__SecondaryProvidersAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:6166:1: ( ( RULE_STRING ) )
            // InternalLibrettoProjectProfile.g:6167:2: ( RULE_STRING )
            {
            // InternalLibrettoProjectProfile.g:6167:2: ( RULE_STRING )
            // InternalLibrettoProjectProfile.g:6168:3: RULE_STRING
            {
             before(grammarAccess.getGenUsageBlockAccess().getSecondaryProvidersSTRINGTerminalRuleCall_3_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGenUsageBlockAccess().getSecondaryProvidersSTRINGTerminalRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenUsageBlock__SecondaryProvidersAssignment_3_1_1"


    // $ANTLR start "rule__GenUsageBlock__EscalationsAssignment_3_2"
    // InternalLibrettoProjectProfile.g:6177:1: rule__GenUsageBlock__EscalationsAssignment_3_2 : ( ruleGenEscalationBlock ) ;
    public final void rule__GenUsageBlock__EscalationsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:6181:1: ( ( ruleGenEscalationBlock ) )
            // InternalLibrettoProjectProfile.g:6182:2: ( ruleGenEscalationBlock )
            {
            // InternalLibrettoProjectProfile.g:6182:2: ( ruleGenEscalationBlock )
            // InternalLibrettoProjectProfile.g:6183:3: ruleGenEscalationBlock
            {
             before(grammarAccess.getGenUsageBlockAccess().getEscalationsGenEscalationBlockParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleGenEscalationBlock();

            state._fsp--;

             after(grammarAccess.getGenUsageBlockAccess().getEscalationsGenEscalationBlockParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenUsageBlock__EscalationsAssignment_3_2"


    // $ANTLR start "rule__GenEscalationBlock__EnabledsAssignment_3_0_1"
    // InternalLibrettoProjectProfile.g:6192:1: rule__GenEscalationBlock__EnabledsAssignment_3_0_1 : ( ( rule__GenEscalationBlock__EnabledsAlternatives_3_0_1_0 ) ) ;
    public final void rule__GenEscalationBlock__EnabledsAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:6196:1: ( ( ( rule__GenEscalationBlock__EnabledsAlternatives_3_0_1_0 ) ) )
            // InternalLibrettoProjectProfile.g:6197:2: ( ( rule__GenEscalationBlock__EnabledsAlternatives_3_0_1_0 ) )
            {
            // InternalLibrettoProjectProfile.g:6197:2: ( ( rule__GenEscalationBlock__EnabledsAlternatives_3_0_1_0 ) )
            // InternalLibrettoProjectProfile.g:6198:3: ( rule__GenEscalationBlock__EnabledsAlternatives_3_0_1_0 )
            {
             before(grammarAccess.getGenEscalationBlockAccess().getEnabledsAlternatives_3_0_1_0()); 
            // InternalLibrettoProjectProfile.g:6199:3: ( rule__GenEscalationBlock__EnabledsAlternatives_3_0_1_0 )
            // InternalLibrettoProjectProfile.g:6199:4: rule__GenEscalationBlock__EnabledsAlternatives_3_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__GenEscalationBlock__EnabledsAlternatives_3_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getGenEscalationBlockAccess().getEnabledsAlternatives_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenEscalationBlock__EnabledsAssignment_3_0_1"


    // $ANTLR start "rule__GenEscalationBlock__EscalateAtRetriesAssignment_3_1_1"
    // InternalLibrettoProjectProfile.g:6207:1: rule__GenEscalationBlock__EscalateAtRetriesAssignment_3_1_1 : ( RULE_INT ) ;
    public final void rule__GenEscalationBlock__EscalateAtRetriesAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:6211:1: ( ( RULE_INT ) )
            // InternalLibrettoProjectProfile.g:6212:2: ( RULE_INT )
            {
            // InternalLibrettoProjectProfile.g:6212:2: ( RULE_INT )
            // InternalLibrettoProjectProfile.g:6213:3: RULE_INT
            {
             before(grammarAccess.getGenEscalationBlockAccess().getEscalateAtRetriesINTTerminalRuleCall_3_1_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getGenEscalationBlockAccess().getEscalateAtRetriesINTTerminalRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenEscalationBlock__EscalateAtRetriesAssignment_3_1_1"


    // $ANTLR start "rule__SurfaceBlock__ElementsAssignment_3"
    // InternalLibrettoProjectProfile.g:6222:1: rule__SurfaceBlock__ElementsAssignment_3 : ( ruleSurfaceElement ) ;
    public final void rule__SurfaceBlock__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:6226:1: ( ( ruleSurfaceElement ) )
            // InternalLibrettoProjectProfile.g:6227:2: ( ruleSurfaceElement )
            {
            // InternalLibrettoProjectProfile.g:6227:2: ( ruleSurfaceElement )
            // InternalLibrettoProjectProfile.g:6228:3: ruleSurfaceElement
            {
             before(grammarAccess.getSurfaceBlockAccess().getElementsSurfaceElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSurfaceElement();

            state._fsp--;

             after(grammarAccess.getSurfaceBlockAccess().getElementsSurfaceElementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurfaceBlock__ElementsAssignment_3"


    // $ANTLR start "rule__ScopedSurface__ModuleIdAssignment_1_0_1"
    // InternalLibrettoProjectProfile.g:6237:1: rule__ScopedSurface__ModuleIdAssignment_1_0_1 : ( RULE_STRING ) ;
    public final void rule__ScopedSurface__ModuleIdAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:6241:1: ( ( RULE_STRING ) )
            // InternalLibrettoProjectProfile.g:6242:2: ( RULE_STRING )
            {
            // InternalLibrettoProjectProfile.g:6242:2: ( RULE_STRING )
            // InternalLibrettoProjectProfile.g:6243:3: RULE_STRING
            {
             before(grammarAccess.getScopedSurfaceAccess().getModuleIdSTRINGTerminalRuleCall_1_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getScopedSurfaceAccess().getModuleIdSTRINGTerminalRuleCall_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopedSurface__ModuleIdAssignment_1_0_1"


    // $ANTLR start "rule__ScopedSurface__SpecIdAssignment_1_1_1"
    // InternalLibrettoProjectProfile.g:6252:1: rule__ScopedSurface__SpecIdAssignment_1_1_1 : ( RULE_STRING ) ;
    public final void rule__ScopedSurface__SpecIdAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:6256:1: ( ( RULE_STRING ) )
            // InternalLibrettoProjectProfile.g:6257:2: ( RULE_STRING )
            {
            // InternalLibrettoProjectProfile.g:6257:2: ( RULE_STRING )
            // InternalLibrettoProjectProfile.g:6258:3: RULE_STRING
            {
             before(grammarAccess.getScopedSurfaceAccess().getSpecIdSTRINGTerminalRuleCall_1_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getScopedSurfaceAccess().getSpecIdSTRINGTerminalRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopedSurface__SpecIdAssignment_1_1_1"


    // $ANTLR start "rule__ScopedSurface__RulesAssignment_3"
    // InternalLibrettoProjectProfile.g:6267:1: rule__ScopedSurface__RulesAssignment_3 : ( ruleSurfaceRule ) ;
    public final void rule__ScopedSurface__RulesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:6271:1: ( ( ruleSurfaceRule ) )
            // InternalLibrettoProjectProfile.g:6272:2: ( ruleSurfaceRule )
            {
            // InternalLibrettoProjectProfile.g:6272:2: ( ruleSurfaceRule )
            // InternalLibrettoProjectProfile.g:6273:3: ruleSurfaceRule
            {
             before(grammarAccess.getScopedSurfaceAccess().getRulesSurfaceRuleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSurfaceRule();

            state._fsp--;

             after(grammarAccess.getScopedSurfaceAccess().getRulesSurfaceRuleParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopedSurface__RulesAssignment_3"


    // $ANTLR start "rule__ReturnTypeRule__NameAssignment_2"
    // InternalLibrettoProjectProfile.g:6282:1: rule__ReturnTypeRule__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ReturnTypeRule__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:6286:1: ( ( RULE_ID ) )
            // InternalLibrettoProjectProfile.g:6287:2: ( RULE_ID )
            {
            // InternalLibrettoProjectProfile.g:6287:2: ( RULE_ID )
            // InternalLibrettoProjectProfile.g:6288:3: RULE_ID
            {
             before(grammarAccess.getReturnTypeRuleAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReturnTypeRuleAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnTypeRule__NameAssignment_2"


    // $ANTLR start "rule__ReturnTypeRule__JavaTypeAssignment_4"
    // InternalLibrettoProjectProfile.g:6297:1: rule__ReturnTypeRule__JavaTypeAssignment_4 : ( ruleJavaType ) ;
    public final void rule__ReturnTypeRule__JavaTypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:6301:1: ( ( ruleJavaType ) )
            // InternalLibrettoProjectProfile.g:6302:2: ( ruleJavaType )
            {
            // InternalLibrettoProjectProfile.g:6302:2: ( ruleJavaType )
            // InternalLibrettoProjectProfile.g:6303:3: ruleJavaType
            {
             before(grammarAccess.getReturnTypeRuleAccess().getJavaTypeJavaTypeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleJavaType();

            state._fsp--;

             after(grammarAccess.getReturnTypeRuleAccess().getJavaTypeJavaTypeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnTypeRule__JavaTypeAssignment_4"


    // $ANTLR start "rule__ParamTypeRule__ParamNameAssignment_2"
    // InternalLibrettoProjectProfile.g:6312:1: rule__ParamTypeRule__ParamNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ParamTypeRule__ParamNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:6316:1: ( ( RULE_ID ) )
            // InternalLibrettoProjectProfile.g:6317:2: ( RULE_ID )
            {
            // InternalLibrettoProjectProfile.g:6317:2: ( RULE_ID )
            // InternalLibrettoProjectProfile.g:6318:3: RULE_ID
            {
             before(grammarAccess.getParamTypeRuleAccess().getParamNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParamTypeRuleAccess().getParamNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamTypeRule__ParamNameAssignment_2"


    // $ANTLR start "rule__ParamTypeRule__JavaTypeAssignment_4"
    // InternalLibrettoProjectProfile.g:6327:1: rule__ParamTypeRule__JavaTypeAssignment_4 : ( ruleJavaType ) ;
    public final void rule__ParamTypeRule__JavaTypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:6331:1: ( ( ruleJavaType ) )
            // InternalLibrettoProjectProfile.g:6332:2: ( ruleJavaType )
            {
            // InternalLibrettoProjectProfile.g:6332:2: ( ruleJavaType )
            // InternalLibrettoProjectProfile.g:6333:3: ruleJavaType
            {
             before(grammarAccess.getParamTypeRuleAccess().getJavaTypeJavaTypeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleJavaType();

            state._fsp--;

             after(grammarAccess.getParamTypeRuleAccess().getJavaTypeJavaTypeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamTypeRule__JavaTypeAssignment_4"


    // $ANTLR start "rule__RecordSelfReturnRule__MethodsAssignment_1"
    // InternalLibrettoProjectProfile.g:6342:1: rule__RecordSelfReturnRule__MethodsAssignment_1 : ( RULE_ID ) ;
    public final void rule__RecordSelfReturnRule__MethodsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:6346:1: ( ( RULE_ID ) )
            // InternalLibrettoProjectProfile.g:6347:2: ( RULE_ID )
            {
            // InternalLibrettoProjectProfile.g:6347:2: ( RULE_ID )
            // InternalLibrettoProjectProfile.g:6348:3: RULE_ID
            {
             before(grammarAccess.getRecordSelfReturnRuleAccess().getMethodsIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRecordSelfReturnRuleAccess().getMethodsIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordSelfReturnRule__MethodsAssignment_1"


    // $ANTLR start "rule__RecordSelfReturnRule__MethodsAssignment_2_1"
    // InternalLibrettoProjectProfile.g:6357:1: rule__RecordSelfReturnRule__MethodsAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__RecordSelfReturnRule__MethodsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:6361:1: ( ( RULE_ID ) )
            // InternalLibrettoProjectProfile.g:6362:2: ( RULE_ID )
            {
            // InternalLibrettoProjectProfile.g:6362:2: ( RULE_ID )
            // InternalLibrettoProjectProfile.g:6363:3: RULE_ID
            {
             before(grammarAccess.getRecordSelfReturnRuleAccess().getMethodsIDTerminalRuleCall_2_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRecordSelfReturnRuleAccess().getMethodsIDTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordSelfReturnRule__MethodsAssignment_2_1"


    // $ANTLR start "rule__MethodOverrideRule__SignatureAssignment_1"
    // InternalLibrettoProjectProfile.g:6372:1: rule__MethodOverrideRule__SignatureAssignment_1 : ( ruleOperationSignature ) ;
    public final void rule__MethodOverrideRule__SignatureAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:6376:1: ( ( ruleOperationSignature ) )
            // InternalLibrettoProjectProfile.g:6377:2: ( ruleOperationSignature )
            {
            // InternalLibrettoProjectProfile.g:6377:2: ( ruleOperationSignature )
            // InternalLibrettoProjectProfile.g:6378:3: ruleOperationSignature
            {
             before(grammarAccess.getMethodOverrideRuleAccess().getSignatureOperationSignatureParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOperationSignature();

            state._fsp--;

             after(grammarAccess.getMethodOverrideRuleAccess().getSignatureOperationSignatureParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodOverrideRule__SignatureAssignment_1"


    // $ANTLR start "rule__MethodOverrideRule__JavaTypeAssignment_3"
    // InternalLibrettoProjectProfile.g:6387:1: rule__MethodOverrideRule__JavaTypeAssignment_3 : ( ruleJavaType ) ;
    public final void rule__MethodOverrideRule__JavaTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:6391:1: ( ( ruleJavaType ) )
            // InternalLibrettoProjectProfile.g:6392:2: ( ruleJavaType )
            {
            // InternalLibrettoProjectProfile.g:6392:2: ( ruleJavaType )
            // InternalLibrettoProjectProfile.g:6393:3: ruleJavaType
            {
             before(grammarAccess.getMethodOverrideRuleAccess().getJavaTypeJavaTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleJavaType();

            state._fsp--;

             after(grammarAccess.getMethodOverrideRuleAccess().getJavaTypeJavaTypeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodOverrideRule__JavaTypeAssignment_3"


    // $ANTLR start "rule__QualifiedName__SegmentsAssignment_0"
    // InternalLibrettoProjectProfile.g:6402:1: rule__QualifiedName__SegmentsAssignment_0 : ( RULE_ID ) ;
    public final void rule__QualifiedName__SegmentsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:6406:1: ( ( RULE_ID ) )
            // InternalLibrettoProjectProfile.g:6407:2: ( RULE_ID )
            {
            // InternalLibrettoProjectProfile.g:6407:2: ( RULE_ID )
            // InternalLibrettoProjectProfile.g:6408:3: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getSegmentsIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getSegmentsIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__SegmentsAssignment_0"


    // $ANTLR start "rule__QualifiedName__SegmentsAssignment_1_1"
    // InternalLibrettoProjectProfile.g:6417:1: rule__QualifiedName__SegmentsAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__QualifiedName__SegmentsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:6421:1: ( ( RULE_ID ) )
            // InternalLibrettoProjectProfile.g:6422:2: ( RULE_ID )
            {
            // InternalLibrettoProjectProfile.g:6422:2: ( RULE_ID )
            // InternalLibrettoProjectProfile.g:6423:3: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getSegmentsIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getSegmentsIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__SegmentsAssignment_1_1"


    // $ANTLR start "rule__PrimitiveType__KindAssignment"
    // InternalLibrettoProjectProfile.g:6432:1: rule__PrimitiveType__KindAssignment : ( ( rule__PrimitiveType__KindAlternatives_0 ) ) ;
    public final void rule__PrimitiveType__KindAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:6436:1: ( ( ( rule__PrimitiveType__KindAlternatives_0 ) ) )
            // InternalLibrettoProjectProfile.g:6437:2: ( ( rule__PrimitiveType__KindAlternatives_0 ) )
            {
            // InternalLibrettoProjectProfile.g:6437:2: ( ( rule__PrimitiveType__KindAlternatives_0 ) )
            // InternalLibrettoProjectProfile.g:6438:3: ( rule__PrimitiveType__KindAlternatives_0 )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getKindAlternatives_0()); 
            // InternalLibrettoProjectProfile.g:6439:3: ( rule__PrimitiveType__KindAlternatives_0 )
            // InternalLibrettoProjectProfile.g:6439:4: rule__PrimitiveType__KindAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveType__KindAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveTypeAccess().getKindAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__KindAssignment"


    // $ANTLR start "rule__OperationSignature__NameAssignment_0"
    // InternalLibrettoProjectProfile.g:6447:1: rule__OperationSignature__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__OperationSignature__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:6451:1: ( ( RULE_ID ) )
            // InternalLibrettoProjectProfile.g:6452:2: ( RULE_ID )
            {
            // InternalLibrettoProjectProfile.g:6452:2: ( RULE_ID )
            // InternalLibrettoProjectProfile.g:6453:3: RULE_ID
            {
             before(grammarAccess.getOperationSignatureAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOperationSignatureAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationSignature__NameAssignment_0"


    // $ANTLR start "rule__OperationSignature__ParamsAssignment_2_0"
    // InternalLibrettoProjectProfile.g:6462:1: rule__OperationSignature__ParamsAssignment_2_0 : ( ruleTypedParam ) ;
    public final void rule__OperationSignature__ParamsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:6466:1: ( ( ruleTypedParam ) )
            // InternalLibrettoProjectProfile.g:6467:2: ( ruleTypedParam )
            {
            // InternalLibrettoProjectProfile.g:6467:2: ( ruleTypedParam )
            // InternalLibrettoProjectProfile.g:6468:3: ruleTypedParam
            {
             before(grammarAccess.getOperationSignatureAccess().getParamsTypedParamParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTypedParam();

            state._fsp--;

             after(grammarAccess.getOperationSignatureAccess().getParamsTypedParamParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationSignature__ParamsAssignment_2_0"


    // $ANTLR start "rule__OperationSignature__ParamsAssignment_2_1_1"
    // InternalLibrettoProjectProfile.g:6477:1: rule__OperationSignature__ParamsAssignment_2_1_1 : ( ruleTypedParam ) ;
    public final void rule__OperationSignature__ParamsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:6481:1: ( ( ruleTypedParam ) )
            // InternalLibrettoProjectProfile.g:6482:2: ( ruleTypedParam )
            {
            // InternalLibrettoProjectProfile.g:6482:2: ( ruleTypedParam )
            // InternalLibrettoProjectProfile.g:6483:3: ruleTypedParam
            {
             before(grammarAccess.getOperationSignatureAccess().getParamsTypedParamParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTypedParam();

            state._fsp--;

             after(grammarAccess.getOperationSignatureAccess().getParamsTypedParamParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationSignature__ParamsAssignment_2_1_1"


    // $ANTLR start "rule__TypedParam__TypeAssignment_0"
    // InternalLibrettoProjectProfile.g:6492:1: rule__TypedParam__TypeAssignment_0 : ( ruleJavaType ) ;
    public final void rule__TypedParam__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:6496:1: ( ( ruleJavaType ) )
            // InternalLibrettoProjectProfile.g:6497:2: ( ruleJavaType )
            {
            // InternalLibrettoProjectProfile.g:6497:2: ( ruleJavaType )
            // InternalLibrettoProjectProfile.g:6498:3: ruleJavaType
            {
             before(grammarAccess.getTypedParamAccess().getTypeJavaTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleJavaType();

            state._fsp--;

             after(grammarAccess.getTypedParamAccess().getTypeJavaTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedParam__TypeAssignment_0"


    // $ANTLR start "rule__TypedParam__ParamNameAssignment_1"
    // InternalLibrettoProjectProfile.g:6507:1: rule__TypedParam__ParamNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TypedParam__ParamNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:6511:1: ( ( RULE_ID ) )
            // InternalLibrettoProjectProfile.g:6512:2: ( RULE_ID )
            {
            // InternalLibrettoProjectProfile.g:6512:2: ( RULE_ID )
            // InternalLibrettoProjectProfile.g:6513:3: RULE_ID
            {
             before(grammarAccess.getTypedParamAccess().getParamNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypedParamAccess().getParamNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedParam__ParamNameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x80080000C0000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x8008000080000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000010340000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000010300000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000440000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000F840000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000F800000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000010300000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x02003E0040000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x02003E0000000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000400040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0003800040000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0003800000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0003000040000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0003000000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0010000040000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x01E0000040000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x01E0000000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x02003E0000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x1C00000040000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x1C00000000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x1C00000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x6000000040000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x6000000000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x8008000080000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000545L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000545L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000400000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000001FF0010L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000220L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000001FF0010L,0x0000000000002000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x000000000E000002L});

}