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


    // $ANTLR start "rule__GenRemediationRules__Alternatives_3"
    // InternalLibrettoProjectProfile.g:861:1: rule__GenRemediationRules__Alternatives_3 : ( ( ( rule__GenRemediationRules__PatternRulesAssignment_3_0 ) ) | ( ( rule__GenRemediationRules__DefaultRemediationsAssignment_3_1 ) ) );
    public final void rule__GenRemediationRules__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:865:1: ( ( ( rule__GenRemediationRules__PatternRulesAssignment_3_0 ) ) | ( ( rule__GenRemediationRules__DefaultRemediationsAssignment_3_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==46) ) {
                alt6=1;
            }
            else if ( (LA6_0==50) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:866:2: ( ( rule__GenRemediationRules__PatternRulesAssignment_3_0 ) )
                    {
                    // InternalLibrettoProjectProfile.g:866:2: ( ( rule__GenRemediationRules__PatternRulesAssignment_3_0 ) )
                    // InternalLibrettoProjectProfile.g:867:3: ( rule__GenRemediationRules__PatternRulesAssignment_3_0 )
                    {
                     before(grammarAccess.getGenRemediationRulesAccess().getPatternRulesAssignment_3_0()); 
                    // InternalLibrettoProjectProfile.g:868:3: ( rule__GenRemediationRules__PatternRulesAssignment_3_0 )
                    // InternalLibrettoProjectProfile.g:868:4: rule__GenRemediationRules__PatternRulesAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GenRemediationRules__PatternRulesAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGenRemediationRulesAccess().getPatternRulesAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLibrettoProjectProfile.g:872:2: ( ( rule__GenRemediationRules__DefaultRemediationsAssignment_3_1 ) )
                    {
                    // InternalLibrettoProjectProfile.g:872:2: ( ( rule__GenRemediationRules__DefaultRemediationsAssignment_3_1 ) )
                    // InternalLibrettoProjectProfile.g:873:3: ( rule__GenRemediationRules__DefaultRemediationsAssignment_3_1 )
                    {
                     before(grammarAccess.getGenRemediationRulesAccess().getDefaultRemediationsAssignment_3_1()); 
                    // InternalLibrettoProjectProfile.g:874:3: ( rule__GenRemediationRules__DefaultRemediationsAssignment_3_1 )
                    // InternalLibrettoProjectProfile.g:874:4: rule__GenRemediationRules__DefaultRemediationsAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__GenRemediationRules__DefaultRemediationsAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getGenRemediationRulesAccess().getDefaultRemediationsAssignment_3_1()); 

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
    // $ANTLR end "rule__GenRemediationRules__Alternatives_3"


    // $ANTLR start "rule__GenPatternRemediationRule__Alternatives_3"
    // InternalLibrettoProjectProfile.g:882:1: rule__GenPatternRemediationRule__Alternatives_3 : ( ( ( rule__GenPatternRemediationRule__Group_3_0__0 ) ) | ( ( rule__GenPatternRemediationRule__Group_3_1__0 ) ) | ( ( rule__GenPatternRemediationRule__Group_3_2__0 ) ) );
    public final void rule__GenPatternRemediationRule__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:886:1: ( ( ( rule__GenPatternRemediationRule__Group_3_0__0 ) ) | ( ( rule__GenPatternRemediationRule__Group_3_1__0 ) ) | ( ( rule__GenPatternRemediationRule__Group_3_2__0 ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt7=1;
                }
                break;
            case 48:
                {
                alt7=2;
                }
                break;
            case 49:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:887:2: ( ( rule__GenPatternRemediationRule__Group_3_0__0 ) )
                    {
                    // InternalLibrettoProjectProfile.g:887:2: ( ( rule__GenPatternRemediationRule__Group_3_0__0 ) )
                    // InternalLibrettoProjectProfile.g:888:3: ( rule__GenPatternRemediationRule__Group_3_0__0 )
                    {
                     before(grammarAccess.getGenPatternRemediationRuleAccess().getGroup_3_0()); 
                    // InternalLibrettoProjectProfile.g:889:3: ( rule__GenPatternRemediationRule__Group_3_0__0 )
                    // InternalLibrettoProjectProfile.g:889:4: rule__GenPatternRemediationRule__Group_3_0__0
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
                    // InternalLibrettoProjectProfile.g:893:2: ( ( rule__GenPatternRemediationRule__Group_3_1__0 ) )
                    {
                    // InternalLibrettoProjectProfile.g:893:2: ( ( rule__GenPatternRemediationRule__Group_3_1__0 ) )
                    // InternalLibrettoProjectProfile.g:894:3: ( rule__GenPatternRemediationRule__Group_3_1__0 )
                    {
                     before(grammarAccess.getGenPatternRemediationRuleAccess().getGroup_3_1()); 
                    // InternalLibrettoProjectProfile.g:895:3: ( rule__GenPatternRemediationRule__Group_3_1__0 )
                    // InternalLibrettoProjectProfile.g:895:4: rule__GenPatternRemediationRule__Group_3_1__0
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
                    // InternalLibrettoProjectProfile.g:899:2: ( ( rule__GenPatternRemediationRule__Group_3_2__0 ) )
                    {
                    // InternalLibrettoProjectProfile.g:899:2: ( ( rule__GenPatternRemediationRule__Group_3_2__0 ) )
                    // InternalLibrettoProjectProfile.g:900:3: ( rule__GenPatternRemediationRule__Group_3_2__0 )
                    {
                     before(grammarAccess.getGenPatternRemediationRuleAccess().getGroup_3_2()); 
                    // InternalLibrettoProjectProfile.g:901:3: ( rule__GenPatternRemediationRule__Group_3_2__0 )
                    // InternalLibrettoProjectProfile.g:901:4: rule__GenPatternRemediationRule__Group_3_2__0
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
    // InternalLibrettoProjectProfile.g:909:1: rule__GenDefaultRemediationRule__Alternatives_3 : ( ( ( rule__GenDefaultRemediationRule__Group_3_0__0 ) ) | ( ( rule__GenDefaultRemediationRule__Group_3_1__0 ) ) );
    public final void rule__GenDefaultRemediationRule__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:913:1: ( ( ( rule__GenDefaultRemediationRule__Group_3_0__0 ) ) | ( ( rule__GenDefaultRemediationRule__Group_3_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==48) ) {
                alt8=1;
            }
            else if ( (LA8_0==49) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:914:2: ( ( rule__GenDefaultRemediationRule__Group_3_0__0 ) )
                    {
                    // InternalLibrettoProjectProfile.g:914:2: ( ( rule__GenDefaultRemediationRule__Group_3_0__0 ) )
                    // InternalLibrettoProjectProfile.g:915:3: ( rule__GenDefaultRemediationRule__Group_3_0__0 )
                    {
                     before(grammarAccess.getGenDefaultRemediationRuleAccess().getGroup_3_0()); 
                    // InternalLibrettoProjectProfile.g:916:3: ( rule__GenDefaultRemediationRule__Group_3_0__0 )
                    // InternalLibrettoProjectProfile.g:916:4: rule__GenDefaultRemediationRule__Group_3_0__0
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
                    // InternalLibrettoProjectProfile.g:920:2: ( ( rule__GenDefaultRemediationRule__Group_3_1__0 ) )
                    {
                    // InternalLibrettoProjectProfile.g:920:2: ( ( rule__GenDefaultRemediationRule__Group_3_1__0 ) )
                    // InternalLibrettoProjectProfile.g:921:3: ( rule__GenDefaultRemediationRule__Group_3_1__0 )
                    {
                     before(grammarAccess.getGenDefaultRemediationRuleAccess().getGroup_3_1()); 
                    // InternalLibrettoProjectProfile.g:922:3: ( rule__GenDefaultRemediationRule__Group_3_1__0 )
                    // InternalLibrettoProjectProfile.g:922:4: rule__GenDefaultRemediationRule__Group_3_1__0
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
    // InternalLibrettoProjectProfile.g:930:1: rule__NamedLlmProvider__Alternatives_3 : ( ( ( rule__NamedLlmProvider__Group_3_0__0 ) ) | ( ( rule__NamedLlmProvider__Group_3_1__0 ) ) | ( ( rule__NamedLlmProvider__Group_3_2__0 ) ) | ( ( rule__NamedLlmProvider__Group_3_3__0 ) ) );
    public final void rule__NamedLlmProvider__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:934:1: ( ( ( rule__NamedLlmProvider__Group_3_0__0 ) ) | ( ( rule__NamedLlmProvider__Group_3_1__0 ) ) | ( ( rule__NamedLlmProvider__Group_3_2__0 ) ) | ( ( rule__NamedLlmProvider__Group_3_3__0 ) ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt9=1;
                }
                break;
            case 54:
                {
                alt9=2;
                }
                break;
            case 55:
                {
                alt9=3;
                }
                break;
            case 56:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:935:2: ( ( rule__NamedLlmProvider__Group_3_0__0 ) )
                    {
                    // InternalLibrettoProjectProfile.g:935:2: ( ( rule__NamedLlmProvider__Group_3_0__0 ) )
                    // InternalLibrettoProjectProfile.g:936:3: ( rule__NamedLlmProvider__Group_3_0__0 )
                    {
                     before(grammarAccess.getNamedLlmProviderAccess().getGroup_3_0()); 
                    // InternalLibrettoProjectProfile.g:937:3: ( rule__NamedLlmProvider__Group_3_0__0 )
                    // InternalLibrettoProjectProfile.g:937:4: rule__NamedLlmProvider__Group_3_0__0
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
                    // InternalLibrettoProjectProfile.g:941:2: ( ( rule__NamedLlmProvider__Group_3_1__0 ) )
                    {
                    // InternalLibrettoProjectProfile.g:941:2: ( ( rule__NamedLlmProvider__Group_3_1__0 ) )
                    // InternalLibrettoProjectProfile.g:942:3: ( rule__NamedLlmProvider__Group_3_1__0 )
                    {
                     before(grammarAccess.getNamedLlmProviderAccess().getGroup_3_1()); 
                    // InternalLibrettoProjectProfile.g:943:3: ( rule__NamedLlmProvider__Group_3_1__0 )
                    // InternalLibrettoProjectProfile.g:943:4: rule__NamedLlmProvider__Group_3_1__0
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
                    // InternalLibrettoProjectProfile.g:947:2: ( ( rule__NamedLlmProvider__Group_3_2__0 ) )
                    {
                    // InternalLibrettoProjectProfile.g:947:2: ( ( rule__NamedLlmProvider__Group_3_2__0 ) )
                    // InternalLibrettoProjectProfile.g:948:3: ( rule__NamedLlmProvider__Group_3_2__0 )
                    {
                     before(grammarAccess.getNamedLlmProviderAccess().getGroup_3_2()); 
                    // InternalLibrettoProjectProfile.g:949:3: ( rule__NamedLlmProvider__Group_3_2__0 )
                    // InternalLibrettoProjectProfile.g:949:4: rule__NamedLlmProvider__Group_3_2__0
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
                    // InternalLibrettoProjectProfile.g:953:2: ( ( rule__NamedLlmProvider__Group_3_3__0 ) )
                    {
                    // InternalLibrettoProjectProfile.g:953:2: ( ( rule__NamedLlmProvider__Group_3_3__0 ) )
                    // InternalLibrettoProjectProfile.g:954:3: ( rule__NamedLlmProvider__Group_3_3__0 )
                    {
                     before(grammarAccess.getNamedLlmProviderAccess().getGroup_3_3()); 
                    // InternalLibrettoProjectProfile.g:955:3: ( rule__NamedLlmProvider__Group_3_3__0 )
                    // InternalLibrettoProjectProfile.g:955:4: rule__NamedLlmProvider__Group_3_3__0
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
    // InternalLibrettoProjectProfile.g:963:1: rule__NamedLlmProvider__KindsAlternatives_3_0_1_0 : ( ( 'local' ) | ( 'openai' ) | ( 'ollama' ) );
    public final void rule__NamedLlmProvider__KindsAlternatives_3_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:967:1: ( ( 'local' ) | ( 'openai' ) | ( 'ollama' ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt10=1;
                }
                break;
            case 14:
                {
                alt10=2;
                }
                break;
            case 15:
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
                    // InternalLibrettoProjectProfile.g:968:2: ( 'local' )
                    {
                    // InternalLibrettoProjectProfile.g:968:2: ( 'local' )
                    // InternalLibrettoProjectProfile.g:969:3: 'local'
                    {
                     before(grammarAccess.getNamedLlmProviderAccess().getKindsLocalKeyword_3_0_1_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getNamedLlmProviderAccess().getKindsLocalKeyword_3_0_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLibrettoProjectProfile.g:974:2: ( 'openai' )
                    {
                    // InternalLibrettoProjectProfile.g:974:2: ( 'openai' )
                    // InternalLibrettoProjectProfile.g:975:3: 'openai'
                    {
                     before(grammarAccess.getNamedLlmProviderAccess().getKindsOpenaiKeyword_3_0_1_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getNamedLlmProviderAccess().getKindsOpenaiKeyword_3_0_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLibrettoProjectProfile.g:980:2: ( 'ollama' )
                    {
                    // InternalLibrettoProjectProfile.g:980:2: ( 'ollama' )
                    // InternalLibrettoProjectProfile.g:981:3: 'ollama'
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
    // InternalLibrettoProjectProfile.g:990:1: rule__GenUsageBlock__Alternatives_3 : ( ( ( rule__GenUsageBlock__Group_3_0__0 ) ) | ( ( rule__GenUsageBlock__Group_3_1__0 ) ) | ( ( rule__GenUsageBlock__EscalationsAssignment_3_2 ) ) );
    public final void rule__GenUsageBlock__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:994:1: ( ( ( rule__GenUsageBlock__Group_3_0__0 ) ) | ( ( rule__GenUsageBlock__Group_3_1__0 ) ) | ( ( rule__GenUsageBlock__EscalationsAssignment_3_2 ) ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt11=1;
                }
                break;
            case 59:
                {
                alt11=2;
                }
                break;
            case 60:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:995:2: ( ( rule__GenUsageBlock__Group_3_0__0 ) )
                    {
                    // InternalLibrettoProjectProfile.g:995:2: ( ( rule__GenUsageBlock__Group_3_0__0 ) )
                    // InternalLibrettoProjectProfile.g:996:3: ( rule__GenUsageBlock__Group_3_0__0 )
                    {
                     before(grammarAccess.getGenUsageBlockAccess().getGroup_3_0()); 
                    // InternalLibrettoProjectProfile.g:997:3: ( rule__GenUsageBlock__Group_3_0__0 )
                    // InternalLibrettoProjectProfile.g:997:4: rule__GenUsageBlock__Group_3_0__0
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
                    // InternalLibrettoProjectProfile.g:1001:2: ( ( rule__GenUsageBlock__Group_3_1__0 ) )
                    {
                    // InternalLibrettoProjectProfile.g:1001:2: ( ( rule__GenUsageBlock__Group_3_1__0 ) )
                    // InternalLibrettoProjectProfile.g:1002:3: ( rule__GenUsageBlock__Group_3_1__0 )
                    {
                     before(grammarAccess.getGenUsageBlockAccess().getGroup_3_1()); 
                    // InternalLibrettoProjectProfile.g:1003:3: ( rule__GenUsageBlock__Group_3_1__0 )
                    // InternalLibrettoProjectProfile.g:1003:4: rule__GenUsageBlock__Group_3_1__0
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
                    // InternalLibrettoProjectProfile.g:1007:2: ( ( rule__GenUsageBlock__EscalationsAssignment_3_2 ) )
                    {
                    // InternalLibrettoProjectProfile.g:1007:2: ( ( rule__GenUsageBlock__EscalationsAssignment_3_2 ) )
                    // InternalLibrettoProjectProfile.g:1008:3: ( rule__GenUsageBlock__EscalationsAssignment_3_2 )
                    {
                     before(grammarAccess.getGenUsageBlockAccess().getEscalationsAssignment_3_2()); 
                    // InternalLibrettoProjectProfile.g:1009:3: ( rule__GenUsageBlock__EscalationsAssignment_3_2 )
                    // InternalLibrettoProjectProfile.g:1009:4: rule__GenUsageBlock__EscalationsAssignment_3_2
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
    // InternalLibrettoProjectProfile.g:1017:1: rule__GenEscalationBlock__Alternatives_3 : ( ( ( rule__GenEscalationBlock__Group_3_0__0 ) ) | ( ( rule__GenEscalationBlock__Group_3_1__0 ) ) );
    public final void rule__GenEscalationBlock__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1021:1: ( ( ( rule__GenEscalationBlock__Group_3_0__0 ) ) | ( ( rule__GenEscalationBlock__Group_3_1__0 ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==61) ) {
                alt12=1;
            }
            else if ( (LA12_0==62) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:1022:2: ( ( rule__GenEscalationBlock__Group_3_0__0 ) )
                    {
                    // InternalLibrettoProjectProfile.g:1022:2: ( ( rule__GenEscalationBlock__Group_3_0__0 ) )
                    // InternalLibrettoProjectProfile.g:1023:3: ( rule__GenEscalationBlock__Group_3_0__0 )
                    {
                     before(grammarAccess.getGenEscalationBlockAccess().getGroup_3_0()); 
                    // InternalLibrettoProjectProfile.g:1024:3: ( rule__GenEscalationBlock__Group_3_0__0 )
                    // InternalLibrettoProjectProfile.g:1024:4: rule__GenEscalationBlock__Group_3_0__0
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
                    // InternalLibrettoProjectProfile.g:1028:2: ( ( rule__GenEscalationBlock__Group_3_1__0 ) )
                    {
                    // InternalLibrettoProjectProfile.g:1028:2: ( ( rule__GenEscalationBlock__Group_3_1__0 ) )
                    // InternalLibrettoProjectProfile.g:1029:3: ( rule__GenEscalationBlock__Group_3_1__0 )
                    {
                     before(grammarAccess.getGenEscalationBlockAccess().getGroup_3_1()); 
                    // InternalLibrettoProjectProfile.g:1030:3: ( rule__GenEscalationBlock__Group_3_1__0 )
                    // InternalLibrettoProjectProfile.g:1030:4: rule__GenEscalationBlock__Group_3_1__0
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
    // InternalLibrettoProjectProfile.g:1038:1: rule__GenEscalationBlock__EnabledsAlternatives_3_0_1_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__GenEscalationBlock__EnabledsAlternatives_3_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1042:1: ( ( 'true' ) | ( 'false' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==11) ) {
                alt13=1;
            }
            else if ( (LA13_0==12) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:1043:2: ( 'true' )
                    {
                    // InternalLibrettoProjectProfile.g:1043:2: ( 'true' )
                    // InternalLibrettoProjectProfile.g:1044:3: 'true'
                    {
                     before(grammarAccess.getGenEscalationBlockAccess().getEnabledsTrueKeyword_3_0_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getGenEscalationBlockAccess().getEnabledsTrueKeyword_3_0_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLibrettoProjectProfile.g:1049:2: ( 'false' )
                    {
                    // InternalLibrettoProjectProfile.g:1049:2: ( 'false' )
                    // InternalLibrettoProjectProfile.g:1050:3: 'false'
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
    // InternalLibrettoProjectProfile.g:1059:1: rule__SurfaceElement__Alternatives : ( ( ruleScopedSurface ) | ( ruleSurfaceRule ) );
    public final void rule__SurfaceElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1063:1: ( ( ruleScopedSurface ) | ( ruleSurfaceRule ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==64) ) {
                alt14=1;
            }
            else if ( (LA14_0==66||LA14_0==70||LA14_0==72||LA14_0==74) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:1064:2: ( ruleScopedSurface )
                    {
                    // InternalLibrettoProjectProfile.g:1064:2: ( ruleScopedSurface )
                    // InternalLibrettoProjectProfile.g:1065:3: ruleScopedSurface
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
                    // InternalLibrettoProjectProfile.g:1070:2: ( ruleSurfaceRule )
                    {
                    // InternalLibrettoProjectProfile.g:1070:2: ( ruleSurfaceRule )
                    // InternalLibrettoProjectProfile.g:1071:3: ruleSurfaceRule
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
    // InternalLibrettoProjectProfile.g:1080:1: rule__ScopedSurface__Alternatives_1 : ( ( ( rule__ScopedSurface__Group_1_0__0 ) ) | ( ( rule__ScopedSurface__Group_1_1__0 ) ) );
    public final void rule__ScopedSurface__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1084:1: ( ( ( rule__ScopedSurface__Group_1_0__0 ) ) | ( ( rule__ScopedSurface__Group_1_1__0 ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==34) ) {
                alt15=1;
            }
            else if ( (LA15_0==65) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:1085:2: ( ( rule__ScopedSurface__Group_1_0__0 ) )
                    {
                    // InternalLibrettoProjectProfile.g:1085:2: ( ( rule__ScopedSurface__Group_1_0__0 ) )
                    // InternalLibrettoProjectProfile.g:1086:3: ( rule__ScopedSurface__Group_1_0__0 )
                    {
                     before(grammarAccess.getScopedSurfaceAccess().getGroup_1_0()); 
                    // InternalLibrettoProjectProfile.g:1087:3: ( rule__ScopedSurface__Group_1_0__0 )
                    // InternalLibrettoProjectProfile.g:1087:4: rule__ScopedSurface__Group_1_0__0
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
                    // InternalLibrettoProjectProfile.g:1091:2: ( ( rule__ScopedSurface__Group_1_1__0 ) )
                    {
                    // InternalLibrettoProjectProfile.g:1091:2: ( ( rule__ScopedSurface__Group_1_1__0 ) )
                    // InternalLibrettoProjectProfile.g:1092:3: ( rule__ScopedSurface__Group_1_1__0 )
                    {
                     before(grammarAccess.getScopedSurfaceAccess().getGroup_1_1()); 
                    // InternalLibrettoProjectProfile.g:1093:3: ( rule__ScopedSurface__Group_1_1__0 )
                    // InternalLibrettoProjectProfile.g:1093:4: rule__ScopedSurface__Group_1_1__0
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
    // InternalLibrettoProjectProfile.g:1101:1: rule__SurfaceRule__Alternatives : ( ( ruleReturnTypeRule ) | ( ruleParamTypeRule ) | ( ruleRecordSelfReturnRule ) | ( ruleMethodOverrideRule ) );
    public final void rule__SurfaceRule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1105:1: ( ( ruleReturnTypeRule ) | ( ruleParamTypeRule ) | ( ruleRecordSelfReturnRule ) | ( ruleMethodOverrideRule ) )
            int alt16=4;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt16=1;
                }
                break;
            case 70:
                {
                alt16=2;
                }
                break;
            case 72:
                {
                alt16=3;
                }
                break;
            case 74:
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:1106:2: ( ruleReturnTypeRule )
                    {
                    // InternalLibrettoProjectProfile.g:1106:2: ( ruleReturnTypeRule )
                    // InternalLibrettoProjectProfile.g:1107:3: ruleReturnTypeRule
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
                    // InternalLibrettoProjectProfile.g:1112:2: ( ruleParamTypeRule )
                    {
                    // InternalLibrettoProjectProfile.g:1112:2: ( ruleParamTypeRule )
                    // InternalLibrettoProjectProfile.g:1113:3: ruleParamTypeRule
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
                    // InternalLibrettoProjectProfile.g:1118:2: ( ruleRecordSelfReturnRule )
                    {
                    // InternalLibrettoProjectProfile.g:1118:2: ( ruleRecordSelfReturnRule )
                    // InternalLibrettoProjectProfile.g:1119:3: ruleRecordSelfReturnRule
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
                    // InternalLibrettoProjectProfile.g:1124:2: ( ruleMethodOverrideRule )
                    {
                    // InternalLibrettoProjectProfile.g:1124:2: ( ruleMethodOverrideRule )
                    // InternalLibrettoProjectProfile.g:1125:3: ruleMethodOverrideRule
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
    // InternalLibrettoProjectProfile.g:1134:1: rule__JavaType__Alternatives : ( ( rulePrimitiveType ) | ( ruleQualifiedName ) );
    public final void rule__JavaType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1138:1: ( ( rulePrimitiveType ) | ( ruleQualifiedName ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=16 && LA17_0<=24)) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_ID) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:1139:2: ( rulePrimitiveType )
                    {
                    // InternalLibrettoProjectProfile.g:1139:2: ( rulePrimitiveType )
                    // InternalLibrettoProjectProfile.g:1140:3: rulePrimitiveType
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
                    // InternalLibrettoProjectProfile.g:1145:2: ( ruleQualifiedName )
                    {
                    // InternalLibrettoProjectProfile.g:1145:2: ( ruleQualifiedName )
                    // InternalLibrettoProjectProfile.g:1146:3: ruleQualifiedName
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
    // InternalLibrettoProjectProfile.g:1155:1: rule__PrimitiveType__KindAlternatives_0 : ( ( 'boolean' ) | ( 'int' ) | ( 'long' ) | ( 'double' ) | ( 'float' ) | ( 'short' ) | ( 'byte' ) | ( 'char' ) | ( 'void' ) );
    public final void rule__PrimitiveType__KindAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1159:1: ( ( 'boolean' ) | ( 'int' ) | ( 'long' ) | ( 'double' ) | ( 'float' ) | ( 'short' ) | ( 'byte' ) | ( 'char' ) | ( 'void' ) )
            int alt18=9;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt18=1;
                }
                break;
            case 17:
                {
                alt18=2;
                }
                break;
            case 18:
                {
                alt18=3;
                }
                break;
            case 19:
                {
                alt18=4;
                }
                break;
            case 20:
                {
                alt18=5;
                }
                break;
            case 21:
                {
                alt18=6;
                }
                break;
            case 22:
                {
                alt18=7;
                }
                break;
            case 23:
                {
                alt18=8;
                }
                break;
            case 24:
                {
                alt18=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:1160:2: ( 'boolean' )
                    {
                    // InternalLibrettoProjectProfile.g:1160:2: ( 'boolean' )
                    // InternalLibrettoProjectProfile.g:1161:3: 'boolean'
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getKindBooleanKeyword_0_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getPrimitiveTypeAccess().getKindBooleanKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLibrettoProjectProfile.g:1166:2: ( 'int' )
                    {
                    // InternalLibrettoProjectProfile.g:1166:2: ( 'int' )
                    // InternalLibrettoProjectProfile.g:1167:3: 'int'
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getKindIntKeyword_0_1()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getPrimitiveTypeAccess().getKindIntKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLibrettoProjectProfile.g:1172:2: ( 'long' )
                    {
                    // InternalLibrettoProjectProfile.g:1172:2: ( 'long' )
                    // InternalLibrettoProjectProfile.g:1173:3: 'long'
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getKindLongKeyword_0_2()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getPrimitiveTypeAccess().getKindLongKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalLibrettoProjectProfile.g:1178:2: ( 'double' )
                    {
                    // InternalLibrettoProjectProfile.g:1178:2: ( 'double' )
                    // InternalLibrettoProjectProfile.g:1179:3: 'double'
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getKindDoubleKeyword_0_3()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getPrimitiveTypeAccess().getKindDoubleKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalLibrettoProjectProfile.g:1184:2: ( 'float' )
                    {
                    // InternalLibrettoProjectProfile.g:1184:2: ( 'float' )
                    // InternalLibrettoProjectProfile.g:1185:3: 'float'
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getKindFloatKeyword_0_4()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getPrimitiveTypeAccess().getKindFloatKeyword_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalLibrettoProjectProfile.g:1190:2: ( 'short' )
                    {
                    // InternalLibrettoProjectProfile.g:1190:2: ( 'short' )
                    // InternalLibrettoProjectProfile.g:1191:3: 'short'
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getKindShortKeyword_0_5()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getPrimitiveTypeAccess().getKindShortKeyword_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalLibrettoProjectProfile.g:1196:2: ( 'byte' )
                    {
                    // InternalLibrettoProjectProfile.g:1196:2: ( 'byte' )
                    // InternalLibrettoProjectProfile.g:1197:3: 'byte'
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getKindByteKeyword_0_6()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getPrimitiveTypeAccess().getKindByteKeyword_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalLibrettoProjectProfile.g:1202:2: ( 'char' )
                    {
                    // InternalLibrettoProjectProfile.g:1202:2: ( 'char' )
                    // InternalLibrettoProjectProfile.g:1203:3: 'char'
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getKindCharKeyword_0_7()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getPrimitiveTypeAccess().getKindCharKeyword_0_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalLibrettoProjectProfile.g:1208:2: ( 'void' )
                    {
                    // InternalLibrettoProjectProfile.g:1208:2: ( 'void' )
                    // InternalLibrettoProjectProfile.g:1209:3: 'void'
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
    // InternalLibrettoProjectProfile.g:1218:1: rule__ValidID__Alternatives_1_0 : ( ( '.' ) | ( '-' ) | ( '_' ) );
    public final void rule__ValidID__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1222:1: ( ( '.' ) | ( '-' ) | ( '_' ) )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt19=1;
                }
                break;
            case 26:
                {
                alt19=2;
                }
                break;
            case 27:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:1223:2: ( '.' )
                    {
                    // InternalLibrettoProjectProfile.g:1223:2: ( '.' )
                    // InternalLibrettoProjectProfile.g:1224:3: '.'
                    {
                     before(grammarAccess.getValidIDAccess().getFullStopKeyword_1_0_0()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getValidIDAccess().getFullStopKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLibrettoProjectProfile.g:1229:2: ( '-' )
                    {
                    // InternalLibrettoProjectProfile.g:1229:2: ( '-' )
                    // InternalLibrettoProjectProfile.g:1230:3: '-'
                    {
                     before(grammarAccess.getValidIDAccess().getHyphenMinusKeyword_1_0_1()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getValidIDAccess().getHyphenMinusKeyword_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLibrettoProjectProfile.g:1235:2: ( '_' )
                    {
                    // InternalLibrettoProjectProfile.g:1235:2: ( '_' )
                    // InternalLibrettoProjectProfile.g:1236:3: '_'
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
    // InternalLibrettoProjectProfile.g:1245:1: rule__ProjectProfile__Group__0 : rule__ProjectProfile__Group__0__Impl rule__ProjectProfile__Group__1 ;
    public final void rule__ProjectProfile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1249:1: ( rule__ProjectProfile__Group__0__Impl rule__ProjectProfile__Group__1 )
            // InternalLibrettoProjectProfile.g:1250:2: rule__ProjectProfile__Group__0__Impl rule__ProjectProfile__Group__1
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
    // InternalLibrettoProjectProfile.g:1257:1: rule__ProjectProfile__Group__0__Impl : ( () ) ;
    public final void rule__ProjectProfile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1261:1: ( ( () ) )
            // InternalLibrettoProjectProfile.g:1262:1: ( () )
            {
            // InternalLibrettoProjectProfile.g:1262:1: ( () )
            // InternalLibrettoProjectProfile.g:1263:2: ()
            {
             before(grammarAccess.getProjectProfileAccess().getProjectProfileAction_0()); 
            // InternalLibrettoProjectProfile.g:1264:2: ()
            // InternalLibrettoProjectProfile.g:1264:3: 
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
    // InternalLibrettoProjectProfile.g:1272:1: rule__ProjectProfile__Group__1 : rule__ProjectProfile__Group__1__Impl rule__ProjectProfile__Group__2 ;
    public final void rule__ProjectProfile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1276:1: ( rule__ProjectProfile__Group__1__Impl rule__ProjectProfile__Group__2 )
            // InternalLibrettoProjectProfile.g:1277:2: rule__ProjectProfile__Group__1__Impl rule__ProjectProfile__Group__2
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
    // InternalLibrettoProjectProfile.g:1284:1: rule__ProjectProfile__Group__1__Impl : ( 'profile' ) ;
    public final void rule__ProjectProfile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1288:1: ( ( 'profile' ) )
            // InternalLibrettoProjectProfile.g:1289:1: ( 'profile' )
            {
            // InternalLibrettoProjectProfile.g:1289:1: ( 'profile' )
            // InternalLibrettoProjectProfile.g:1290:2: 'profile'
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
    // InternalLibrettoProjectProfile.g:1299:1: rule__ProjectProfile__Group__2 : rule__ProjectProfile__Group__2__Impl rule__ProjectProfile__Group__3 ;
    public final void rule__ProjectProfile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1303:1: ( rule__ProjectProfile__Group__2__Impl rule__ProjectProfile__Group__3 )
            // InternalLibrettoProjectProfile.g:1304:2: rule__ProjectProfile__Group__2__Impl rule__ProjectProfile__Group__3
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
    // InternalLibrettoProjectProfile.g:1311:1: rule__ProjectProfile__Group__2__Impl : ( ( rule__ProjectProfile__NameAssignment_2 ) ) ;
    public final void rule__ProjectProfile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1315:1: ( ( ( rule__ProjectProfile__NameAssignment_2 ) ) )
            // InternalLibrettoProjectProfile.g:1316:1: ( ( rule__ProjectProfile__NameAssignment_2 ) )
            {
            // InternalLibrettoProjectProfile.g:1316:1: ( ( rule__ProjectProfile__NameAssignment_2 ) )
            // InternalLibrettoProjectProfile.g:1317:2: ( rule__ProjectProfile__NameAssignment_2 )
            {
             before(grammarAccess.getProjectProfileAccess().getNameAssignment_2()); 
            // InternalLibrettoProjectProfile.g:1318:2: ( rule__ProjectProfile__NameAssignment_2 )
            // InternalLibrettoProjectProfile.g:1318:3: rule__ProjectProfile__NameAssignment_2
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
    // InternalLibrettoProjectProfile.g:1326:1: rule__ProjectProfile__Group__3 : rule__ProjectProfile__Group__3__Impl rule__ProjectProfile__Group__4 ;
    public final void rule__ProjectProfile__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1330:1: ( rule__ProjectProfile__Group__3__Impl rule__ProjectProfile__Group__4 )
            // InternalLibrettoProjectProfile.g:1331:2: rule__ProjectProfile__Group__3__Impl rule__ProjectProfile__Group__4
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
    // InternalLibrettoProjectProfile.g:1338:1: rule__ProjectProfile__Group__3__Impl : ( '{' ) ;
    public final void rule__ProjectProfile__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1342:1: ( ( '{' ) )
            // InternalLibrettoProjectProfile.g:1343:1: ( '{' )
            {
            // InternalLibrettoProjectProfile.g:1343:1: ( '{' )
            // InternalLibrettoProjectProfile.g:1344:2: '{'
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
    // InternalLibrettoProjectProfile.g:1353:1: rule__ProjectProfile__Group__4 : rule__ProjectProfile__Group__4__Impl rule__ProjectProfile__Group__5 ;
    public final void rule__ProjectProfile__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1357:1: ( rule__ProjectProfile__Group__4__Impl rule__ProjectProfile__Group__5 )
            // InternalLibrettoProjectProfile.g:1358:2: rule__ProjectProfile__Group__4__Impl rule__ProjectProfile__Group__5
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
    // InternalLibrettoProjectProfile.g:1365:1: rule__ProjectProfile__Group__4__Impl : ( ( rule__ProjectProfile__Alternatives_4 )* ) ;
    public final void rule__ProjectProfile__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1369:1: ( ( ( rule__ProjectProfile__Alternatives_4 )* ) )
            // InternalLibrettoProjectProfile.g:1370:1: ( ( rule__ProjectProfile__Alternatives_4 )* )
            {
            // InternalLibrettoProjectProfile.g:1370:1: ( ( rule__ProjectProfile__Alternatives_4 )* )
            // InternalLibrettoProjectProfile.g:1371:2: ( rule__ProjectProfile__Alternatives_4 )*
            {
             before(grammarAccess.getProjectProfileAccess().getAlternatives_4()); 
            // InternalLibrettoProjectProfile.g:1372:2: ( rule__ProjectProfile__Alternatives_4 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==31||LA20_0==51||LA20_0==63) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:1372:3: rule__ProjectProfile__Alternatives_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__ProjectProfile__Alternatives_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalLibrettoProjectProfile.g:1380:1: rule__ProjectProfile__Group__5 : rule__ProjectProfile__Group__5__Impl ;
    public final void rule__ProjectProfile__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1384:1: ( rule__ProjectProfile__Group__5__Impl )
            // InternalLibrettoProjectProfile.g:1385:2: rule__ProjectProfile__Group__5__Impl
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
    // InternalLibrettoProjectProfile.g:1391:1: rule__ProjectProfile__Group__5__Impl : ( '}' ) ;
    public final void rule__ProjectProfile__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1395:1: ( ( '}' ) )
            // InternalLibrettoProjectProfile.g:1396:1: ( '}' )
            {
            // InternalLibrettoProjectProfile.g:1396:1: ( '}' )
            // InternalLibrettoProjectProfile.g:1397:2: '}'
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
    // InternalLibrettoProjectProfile.g:1407:1: rule__ProjectBlock__Group__0 : rule__ProjectBlock__Group__0__Impl rule__ProjectBlock__Group__1 ;
    public final void rule__ProjectBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1411:1: ( rule__ProjectBlock__Group__0__Impl rule__ProjectBlock__Group__1 )
            // InternalLibrettoProjectProfile.g:1412:2: rule__ProjectBlock__Group__0__Impl rule__ProjectBlock__Group__1
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
    // InternalLibrettoProjectProfile.g:1419:1: rule__ProjectBlock__Group__0__Impl : ( () ) ;
    public final void rule__ProjectBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1423:1: ( ( () ) )
            // InternalLibrettoProjectProfile.g:1424:1: ( () )
            {
            // InternalLibrettoProjectProfile.g:1424:1: ( () )
            // InternalLibrettoProjectProfile.g:1425:2: ()
            {
             before(grammarAccess.getProjectBlockAccess().getProjectBlockAction_0()); 
            // InternalLibrettoProjectProfile.g:1426:2: ()
            // InternalLibrettoProjectProfile.g:1426:3: 
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
    // InternalLibrettoProjectProfile.g:1434:1: rule__ProjectBlock__Group__1 : rule__ProjectBlock__Group__1__Impl rule__ProjectBlock__Group__2 ;
    public final void rule__ProjectBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1438:1: ( rule__ProjectBlock__Group__1__Impl rule__ProjectBlock__Group__2 )
            // InternalLibrettoProjectProfile.g:1439:2: rule__ProjectBlock__Group__1__Impl rule__ProjectBlock__Group__2
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
    // InternalLibrettoProjectProfile.g:1446:1: rule__ProjectBlock__Group__1__Impl : ( 'project' ) ;
    public final void rule__ProjectBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1450:1: ( ( 'project' ) )
            // InternalLibrettoProjectProfile.g:1451:1: ( 'project' )
            {
            // InternalLibrettoProjectProfile.g:1451:1: ( 'project' )
            // InternalLibrettoProjectProfile.g:1452:2: 'project'
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
    // InternalLibrettoProjectProfile.g:1461:1: rule__ProjectBlock__Group__2 : rule__ProjectBlock__Group__2__Impl rule__ProjectBlock__Group__3 ;
    public final void rule__ProjectBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1465:1: ( rule__ProjectBlock__Group__2__Impl rule__ProjectBlock__Group__3 )
            // InternalLibrettoProjectProfile.g:1466:2: rule__ProjectBlock__Group__2__Impl rule__ProjectBlock__Group__3
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
    // InternalLibrettoProjectProfile.g:1473:1: rule__ProjectBlock__Group__2__Impl : ( '{' ) ;
    public final void rule__ProjectBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1477:1: ( ( '{' ) )
            // InternalLibrettoProjectProfile.g:1478:1: ( '{' )
            {
            // InternalLibrettoProjectProfile.g:1478:1: ( '{' )
            // InternalLibrettoProjectProfile.g:1479:2: '{'
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
    // InternalLibrettoProjectProfile.g:1488:1: rule__ProjectBlock__Group__3 : rule__ProjectBlock__Group__3__Impl rule__ProjectBlock__Group__4 ;
    public final void rule__ProjectBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1492:1: ( rule__ProjectBlock__Group__3__Impl rule__ProjectBlock__Group__4 )
            // InternalLibrettoProjectProfile.g:1493:2: rule__ProjectBlock__Group__3__Impl rule__ProjectBlock__Group__4
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
    // InternalLibrettoProjectProfile.g:1500:1: rule__ProjectBlock__Group__3__Impl : ( ( rule__ProjectBlock__Alternatives_3 )* ) ;
    public final void rule__ProjectBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1504:1: ( ( ( rule__ProjectBlock__Alternatives_3 )* ) )
            // InternalLibrettoProjectProfile.g:1505:1: ( ( rule__ProjectBlock__Alternatives_3 )* )
            {
            // InternalLibrettoProjectProfile.g:1505:1: ( ( rule__ProjectBlock__Alternatives_3 )* )
            // InternalLibrettoProjectProfile.g:1506:2: ( rule__ProjectBlock__Alternatives_3 )*
            {
             before(grammarAccess.getProjectBlockAccess().getAlternatives_3()); 
            // InternalLibrettoProjectProfile.g:1507:2: ( rule__ProjectBlock__Alternatives_3 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=32 && LA21_0<=33)||LA21_0==40) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:1507:3: rule__ProjectBlock__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ProjectBlock__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalLibrettoProjectProfile.g:1515:1: rule__ProjectBlock__Group__4 : rule__ProjectBlock__Group__4__Impl ;
    public final void rule__ProjectBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1519:1: ( rule__ProjectBlock__Group__4__Impl )
            // InternalLibrettoProjectProfile.g:1520:2: rule__ProjectBlock__Group__4__Impl
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
    // InternalLibrettoProjectProfile.g:1526:1: rule__ProjectBlock__Group__4__Impl : ( '}' ) ;
    public final void rule__ProjectBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1530:1: ( ( '}' ) )
            // InternalLibrettoProjectProfile.g:1531:1: ( '}' )
            {
            // InternalLibrettoProjectProfile.g:1531:1: ( '}' )
            // InternalLibrettoProjectProfile.g:1532:2: '}'
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
    // InternalLibrettoProjectProfile.g:1542:1: rule__ProjectBlock__Group_3_0__0 : rule__ProjectBlock__Group_3_0__0__Impl rule__ProjectBlock__Group_3_0__1 ;
    public final void rule__ProjectBlock__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1546:1: ( rule__ProjectBlock__Group_3_0__0__Impl rule__ProjectBlock__Group_3_0__1 )
            // InternalLibrettoProjectProfile.g:1547:2: rule__ProjectBlock__Group_3_0__0__Impl rule__ProjectBlock__Group_3_0__1
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
    // InternalLibrettoProjectProfile.g:1554:1: rule__ProjectBlock__Group_3_0__0__Impl : ( 'rootDir' ) ;
    public final void rule__ProjectBlock__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1558:1: ( ( 'rootDir' ) )
            // InternalLibrettoProjectProfile.g:1559:1: ( 'rootDir' )
            {
            // InternalLibrettoProjectProfile.g:1559:1: ( 'rootDir' )
            // InternalLibrettoProjectProfile.g:1560:2: 'rootDir'
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
    // InternalLibrettoProjectProfile.g:1569:1: rule__ProjectBlock__Group_3_0__1 : rule__ProjectBlock__Group_3_0__1__Impl ;
    public final void rule__ProjectBlock__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1573:1: ( rule__ProjectBlock__Group_3_0__1__Impl )
            // InternalLibrettoProjectProfile.g:1574:2: rule__ProjectBlock__Group_3_0__1__Impl
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
    // InternalLibrettoProjectProfile.g:1580:1: rule__ProjectBlock__Group_3_0__1__Impl : ( ( rule__ProjectBlock__RootDirAssignment_3_0_1 ) ) ;
    public final void rule__ProjectBlock__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1584:1: ( ( ( rule__ProjectBlock__RootDirAssignment_3_0_1 ) ) )
            // InternalLibrettoProjectProfile.g:1585:1: ( ( rule__ProjectBlock__RootDirAssignment_3_0_1 ) )
            {
            // InternalLibrettoProjectProfile.g:1585:1: ( ( rule__ProjectBlock__RootDirAssignment_3_0_1 ) )
            // InternalLibrettoProjectProfile.g:1586:2: ( rule__ProjectBlock__RootDirAssignment_3_0_1 )
            {
             before(grammarAccess.getProjectBlockAccess().getRootDirAssignment_3_0_1()); 
            // InternalLibrettoProjectProfile.g:1587:2: ( rule__ProjectBlock__RootDirAssignment_3_0_1 )
            // InternalLibrettoProjectProfile.g:1587:3: rule__ProjectBlock__RootDirAssignment_3_0_1
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
    // InternalLibrettoProjectProfile.g:1596:1: rule__ModulesBlock__Group__0 : rule__ModulesBlock__Group__0__Impl rule__ModulesBlock__Group__1 ;
    public final void rule__ModulesBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1600:1: ( rule__ModulesBlock__Group__0__Impl rule__ModulesBlock__Group__1 )
            // InternalLibrettoProjectProfile.g:1601:2: rule__ModulesBlock__Group__0__Impl rule__ModulesBlock__Group__1
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
    // InternalLibrettoProjectProfile.g:1608:1: rule__ModulesBlock__Group__0__Impl : ( () ) ;
    public final void rule__ModulesBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1612:1: ( ( () ) )
            // InternalLibrettoProjectProfile.g:1613:1: ( () )
            {
            // InternalLibrettoProjectProfile.g:1613:1: ( () )
            // InternalLibrettoProjectProfile.g:1614:2: ()
            {
             before(grammarAccess.getModulesBlockAccess().getModulesBlockAction_0()); 
            // InternalLibrettoProjectProfile.g:1615:2: ()
            // InternalLibrettoProjectProfile.g:1615:3: 
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
    // InternalLibrettoProjectProfile.g:1623:1: rule__ModulesBlock__Group__1 : rule__ModulesBlock__Group__1__Impl rule__ModulesBlock__Group__2 ;
    public final void rule__ModulesBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1627:1: ( rule__ModulesBlock__Group__1__Impl rule__ModulesBlock__Group__2 )
            // InternalLibrettoProjectProfile.g:1628:2: rule__ModulesBlock__Group__1__Impl rule__ModulesBlock__Group__2
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
    // InternalLibrettoProjectProfile.g:1635:1: rule__ModulesBlock__Group__1__Impl : ( 'modules' ) ;
    public final void rule__ModulesBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1639:1: ( ( 'modules' ) )
            // InternalLibrettoProjectProfile.g:1640:1: ( 'modules' )
            {
            // InternalLibrettoProjectProfile.g:1640:1: ( 'modules' )
            // InternalLibrettoProjectProfile.g:1641:2: 'modules'
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
    // InternalLibrettoProjectProfile.g:1650:1: rule__ModulesBlock__Group__2 : rule__ModulesBlock__Group__2__Impl rule__ModulesBlock__Group__3 ;
    public final void rule__ModulesBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1654:1: ( rule__ModulesBlock__Group__2__Impl rule__ModulesBlock__Group__3 )
            // InternalLibrettoProjectProfile.g:1655:2: rule__ModulesBlock__Group__2__Impl rule__ModulesBlock__Group__3
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
    // InternalLibrettoProjectProfile.g:1662:1: rule__ModulesBlock__Group__2__Impl : ( '{' ) ;
    public final void rule__ModulesBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1666:1: ( ( '{' ) )
            // InternalLibrettoProjectProfile.g:1667:1: ( '{' )
            {
            // InternalLibrettoProjectProfile.g:1667:1: ( '{' )
            // InternalLibrettoProjectProfile.g:1668:2: '{'
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
    // InternalLibrettoProjectProfile.g:1677:1: rule__ModulesBlock__Group__3 : rule__ModulesBlock__Group__3__Impl rule__ModulesBlock__Group__4 ;
    public final void rule__ModulesBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1681:1: ( rule__ModulesBlock__Group__3__Impl rule__ModulesBlock__Group__4 )
            // InternalLibrettoProjectProfile.g:1682:2: rule__ModulesBlock__Group__3__Impl rule__ModulesBlock__Group__4
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
    // InternalLibrettoProjectProfile.g:1689:1: rule__ModulesBlock__Group__3__Impl : ( ( rule__ModulesBlock__ModulesAssignment_3 )* ) ;
    public final void rule__ModulesBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1693:1: ( ( ( rule__ModulesBlock__ModulesAssignment_3 )* ) )
            // InternalLibrettoProjectProfile.g:1694:1: ( ( rule__ModulesBlock__ModulesAssignment_3 )* )
            {
            // InternalLibrettoProjectProfile.g:1694:1: ( ( rule__ModulesBlock__ModulesAssignment_3 )* )
            // InternalLibrettoProjectProfile.g:1695:2: ( rule__ModulesBlock__ModulesAssignment_3 )*
            {
             before(grammarAccess.getModulesBlockAccess().getModulesAssignment_3()); 
            // InternalLibrettoProjectProfile.g:1696:2: ( rule__ModulesBlock__ModulesAssignment_3 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==34) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:1696:3: rule__ModulesBlock__ModulesAssignment_3
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__ModulesBlock__ModulesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalLibrettoProjectProfile.g:1704:1: rule__ModulesBlock__Group__4 : rule__ModulesBlock__Group__4__Impl ;
    public final void rule__ModulesBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1708:1: ( rule__ModulesBlock__Group__4__Impl )
            // InternalLibrettoProjectProfile.g:1709:2: rule__ModulesBlock__Group__4__Impl
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
    // InternalLibrettoProjectProfile.g:1715:1: rule__ModulesBlock__Group__4__Impl : ( '}' ) ;
    public final void rule__ModulesBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1719:1: ( ( '}' ) )
            // InternalLibrettoProjectProfile.g:1720:1: ( '}' )
            {
            // InternalLibrettoProjectProfile.g:1720:1: ( '}' )
            // InternalLibrettoProjectProfile.g:1721:2: '}'
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
    // InternalLibrettoProjectProfile.g:1731:1: rule__ProjectModule__Group__0 : rule__ProjectModule__Group__0__Impl rule__ProjectModule__Group__1 ;
    public final void rule__ProjectModule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1735:1: ( rule__ProjectModule__Group__0__Impl rule__ProjectModule__Group__1 )
            // InternalLibrettoProjectProfile.g:1736:2: rule__ProjectModule__Group__0__Impl rule__ProjectModule__Group__1
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
    // InternalLibrettoProjectProfile.g:1743:1: rule__ProjectModule__Group__0__Impl : ( 'module' ) ;
    public final void rule__ProjectModule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1747:1: ( ( 'module' ) )
            // InternalLibrettoProjectProfile.g:1748:1: ( 'module' )
            {
            // InternalLibrettoProjectProfile.g:1748:1: ( 'module' )
            // InternalLibrettoProjectProfile.g:1749:2: 'module'
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
    // InternalLibrettoProjectProfile.g:1758:1: rule__ProjectModule__Group__1 : rule__ProjectModule__Group__1__Impl rule__ProjectModule__Group__2 ;
    public final void rule__ProjectModule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1762:1: ( rule__ProjectModule__Group__1__Impl rule__ProjectModule__Group__2 )
            // InternalLibrettoProjectProfile.g:1763:2: rule__ProjectModule__Group__1__Impl rule__ProjectModule__Group__2
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
    // InternalLibrettoProjectProfile.g:1770:1: rule__ProjectModule__Group__1__Impl : ( ( rule__ProjectModule__NameAssignment_1 ) ) ;
    public final void rule__ProjectModule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1774:1: ( ( ( rule__ProjectModule__NameAssignment_1 ) ) )
            // InternalLibrettoProjectProfile.g:1775:1: ( ( rule__ProjectModule__NameAssignment_1 ) )
            {
            // InternalLibrettoProjectProfile.g:1775:1: ( ( rule__ProjectModule__NameAssignment_1 ) )
            // InternalLibrettoProjectProfile.g:1776:2: ( rule__ProjectModule__NameAssignment_1 )
            {
             before(grammarAccess.getProjectModuleAccess().getNameAssignment_1()); 
            // InternalLibrettoProjectProfile.g:1777:2: ( rule__ProjectModule__NameAssignment_1 )
            // InternalLibrettoProjectProfile.g:1777:3: rule__ProjectModule__NameAssignment_1
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
    // InternalLibrettoProjectProfile.g:1785:1: rule__ProjectModule__Group__2 : rule__ProjectModule__Group__2__Impl rule__ProjectModule__Group__3 ;
    public final void rule__ProjectModule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1789:1: ( rule__ProjectModule__Group__2__Impl rule__ProjectModule__Group__3 )
            // InternalLibrettoProjectProfile.g:1790:2: rule__ProjectModule__Group__2__Impl rule__ProjectModule__Group__3
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
    // InternalLibrettoProjectProfile.g:1797:1: rule__ProjectModule__Group__2__Impl : ( '{' ) ;
    public final void rule__ProjectModule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1801:1: ( ( '{' ) )
            // InternalLibrettoProjectProfile.g:1802:1: ( '{' )
            {
            // InternalLibrettoProjectProfile.g:1802:1: ( '{' )
            // InternalLibrettoProjectProfile.g:1803:2: '{'
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
    // InternalLibrettoProjectProfile.g:1812:1: rule__ProjectModule__Group__3 : rule__ProjectModule__Group__3__Impl rule__ProjectModule__Group__4 ;
    public final void rule__ProjectModule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1816:1: ( rule__ProjectModule__Group__3__Impl rule__ProjectModule__Group__4 )
            // InternalLibrettoProjectProfile.g:1817:2: rule__ProjectModule__Group__3__Impl rule__ProjectModule__Group__4
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
    // InternalLibrettoProjectProfile.g:1824:1: rule__ProjectModule__Group__3__Impl : ( ( rule__ProjectModule__Alternatives_3 )* ) ;
    public final void rule__ProjectModule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1828:1: ( ( ( rule__ProjectModule__Alternatives_3 )* ) )
            // InternalLibrettoProjectProfile.g:1829:1: ( ( rule__ProjectModule__Alternatives_3 )* )
            {
            // InternalLibrettoProjectProfile.g:1829:1: ( ( rule__ProjectModule__Alternatives_3 )* )
            // InternalLibrettoProjectProfile.g:1830:2: ( rule__ProjectModule__Alternatives_3 )*
            {
             before(grammarAccess.getProjectModuleAccess().getAlternatives_3()); 
            // InternalLibrettoProjectProfile.g:1831:2: ( rule__ProjectModule__Alternatives_3 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=35 && LA23_0<=39)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:1831:3: rule__ProjectModule__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__ProjectModule__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalLibrettoProjectProfile.g:1839:1: rule__ProjectModule__Group__4 : rule__ProjectModule__Group__4__Impl ;
    public final void rule__ProjectModule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1843:1: ( rule__ProjectModule__Group__4__Impl )
            // InternalLibrettoProjectProfile.g:1844:2: rule__ProjectModule__Group__4__Impl
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
    // InternalLibrettoProjectProfile.g:1850:1: rule__ProjectModule__Group__4__Impl : ( '}' ) ;
    public final void rule__ProjectModule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1854:1: ( ( '}' ) )
            // InternalLibrettoProjectProfile.g:1855:1: ( '}' )
            {
            // InternalLibrettoProjectProfile.g:1855:1: ( '}' )
            // InternalLibrettoProjectProfile.g:1856:2: '}'
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
    // InternalLibrettoProjectProfile.g:1866:1: rule__ProjectModule__Group_3_0__0 : rule__ProjectModule__Group_3_0__0__Impl rule__ProjectModule__Group_3_0__1 ;
    public final void rule__ProjectModule__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1870:1: ( rule__ProjectModule__Group_3_0__0__Impl rule__ProjectModule__Group_3_0__1 )
            // InternalLibrettoProjectProfile.g:1871:2: rule__ProjectModule__Group_3_0__0__Impl rule__ProjectModule__Group_3_0__1
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
    // InternalLibrettoProjectProfile.g:1878:1: rule__ProjectModule__Group_3_0__0__Impl : ( 'dir' ) ;
    public final void rule__ProjectModule__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1882:1: ( ( 'dir' ) )
            // InternalLibrettoProjectProfile.g:1883:1: ( 'dir' )
            {
            // InternalLibrettoProjectProfile.g:1883:1: ( 'dir' )
            // InternalLibrettoProjectProfile.g:1884:2: 'dir'
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
    // InternalLibrettoProjectProfile.g:1893:1: rule__ProjectModule__Group_3_0__1 : rule__ProjectModule__Group_3_0__1__Impl ;
    public final void rule__ProjectModule__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1897:1: ( rule__ProjectModule__Group_3_0__1__Impl )
            // InternalLibrettoProjectProfile.g:1898:2: rule__ProjectModule__Group_3_0__1__Impl
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
    // InternalLibrettoProjectProfile.g:1904:1: rule__ProjectModule__Group_3_0__1__Impl : ( ( rule__ProjectModule__DirsAssignment_3_0_1 ) ) ;
    public final void rule__ProjectModule__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1908:1: ( ( ( rule__ProjectModule__DirsAssignment_3_0_1 ) ) )
            // InternalLibrettoProjectProfile.g:1909:1: ( ( rule__ProjectModule__DirsAssignment_3_0_1 ) )
            {
            // InternalLibrettoProjectProfile.g:1909:1: ( ( rule__ProjectModule__DirsAssignment_3_0_1 ) )
            // InternalLibrettoProjectProfile.g:1910:2: ( rule__ProjectModule__DirsAssignment_3_0_1 )
            {
             before(grammarAccess.getProjectModuleAccess().getDirsAssignment_3_0_1()); 
            // InternalLibrettoProjectProfile.g:1911:2: ( rule__ProjectModule__DirsAssignment_3_0_1 )
            // InternalLibrettoProjectProfile.g:1911:3: rule__ProjectModule__DirsAssignment_3_0_1
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
    // InternalLibrettoProjectProfile.g:1920:1: rule__ProjectModule__Group_3_1__0 : rule__ProjectModule__Group_3_1__0__Impl rule__ProjectModule__Group_3_1__1 ;
    public final void rule__ProjectModule__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1924:1: ( rule__ProjectModule__Group_3_1__0__Impl rule__ProjectModule__Group_3_1__1 )
            // InternalLibrettoProjectProfile.g:1925:2: rule__ProjectModule__Group_3_1__0__Impl rule__ProjectModule__Group_3_1__1
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
    // InternalLibrettoProjectProfile.g:1932:1: rule__ProjectModule__Group_3_1__0__Impl : ( 'specDir' ) ;
    public final void rule__ProjectModule__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1936:1: ( ( 'specDir' ) )
            // InternalLibrettoProjectProfile.g:1937:1: ( 'specDir' )
            {
            // InternalLibrettoProjectProfile.g:1937:1: ( 'specDir' )
            // InternalLibrettoProjectProfile.g:1938:2: 'specDir'
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
    // InternalLibrettoProjectProfile.g:1947:1: rule__ProjectModule__Group_3_1__1 : rule__ProjectModule__Group_3_1__1__Impl ;
    public final void rule__ProjectModule__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1951:1: ( rule__ProjectModule__Group_3_1__1__Impl )
            // InternalLibrettoProjectProfile.g:1952:2: rule__ProjectModule__Group_3_1__1__Impl
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
    // InternalLibrettoProjectProfile.g:1958:1: rule__ProjectModule__Group_3_1__1__Impl : ( ( rule__ProjectModule__SpecDirsAssignment_3_1_1 ) ) ;
    public final void rule__ProjectModule__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1962:1: ( ( ( rule__ProjectModule__SpecDirsAssignment_3_1_1 ) ) )
            // InternalLibrettoProjectProfile.g:1963:1: ( ( rule__ProjectModule__SpecDirsAssignment_3_1_1 ) )
            {
            // InternalLibrettoProjectProfile.g:1963:1: ( ( rule__ProjectModule__SpecDirsAssignment_3_1_1 ) )
            // InternalLibrettoProjectProfile.g:1964:2: ( rule__ProjectModule__SpecDirsAssignment_3_1_1 )
            {
             before(grammarAccess.getProjectModuleAccess().getSpecDirsAssignment_3_1_1()); 
            // InternalLibrettoProjectProfile.g:1965:2: ( rule__ProjectModule__SpecDirsAssignment_3_1_1 )
            // InternalLibrettoProjectProfile.g:1965:3: rule__ProjectModule__SpecDirsAssignment_3_1_1
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
    // InternalLibrettoProjectProfile.g:1974:1: rule__ProjectModule__Group_3_2__0 : rule__ProjectModule__Group_3_2__0__Impl rule__ProjectModule__Group_3_2__1 ;
    public final void rule__ProjectModule__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1978:1: ( rule__ProjectModule__Group_3_2__0__Impl rule__ProjectModule__Group_3_2__1 )
            // InternalLibrettoProjectProfile.g:1979:2: rule__ProjectModule__Group_3_2__0__Impl rule__ProjectModule__Group_3_2__1
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
    // InternalLibrettoProjectProfile.g:1986:1: rule__ProjectModule__Group_3_2__0__Impl : ( 'testDir' ) ;
    public final void rule__ProjectModule__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1990:1: ( ( 'testDir' ) )
            // InternalLibrettoProjectProfile.g:1991:1: ( 'testDir' )
            {
            // InternalLibrettoProjectProfile.g:1991:1: ( 'testDir' )
            // InternalLibrettoProjectProfile.g:1992:2: 'testDir'
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
    // InternalLibrettoProjectProfile.g:2001:1: rule__ProjectModule__Group_3_2__1 : rule__ProjectModule__Group_3_2__1__Impl ;
    public final void rule__ProjectModule__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2005:1: ( rule__ProjectModule__Group_3_2__1__Impl )
            // InternalLibrettoProjectProfile.g:2006:2: rule__ProjectModule__Group_3_2__1__Impl
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
    // InternalLibrettoProjectProfile.g:2012:1: rule__ProjectModule__Group_3_2__1__Impl : ( ( rule__ProjectModule__TestDirsAssignment_3_2_1 ) ) ;
    public final void rule__ProjectModule__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2016:1: ( ( ( rule__ProjectModule__TestDirsAssignment_3_2_1 ) ) )
            // InternalLibrettoProjectProfile.g:2017:1: ( ( rule__ProjectModule__TestDirsAssignment_3_2_1 ) )
            {
            // InternalLibrettoProjectProfile.g:2017:1: ( ( rule__ProjectModule__TestDirsAssignment_3_2_1 ) )
            // InternalLibrettoProjectProfile.g:2018:2: ( rule__ProjectModule__TestDirsAssignment_3_2_1 )
            {
             before(grammarAccess.getProjectModuleAccess().getTestDirsAssignment_3_2_1()); 
            // InternalLibrettoProjectProfile.g:2019:2: ( rule__ProjectModule__TestDirsAssignment_3_2_1 )
            // InternalLibrettoProjectProfile.g:2019:3: rule__ProjectModule__TestDirsAssignment_3_2_1
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
    // InternalLibrettoProjectProfile.g:2028:1: rule__ProjectModule__Group_3_3__0 : rule__ProjectModule__Group_3_3__0__Impl rule__ProjectModule__Group_3_3__1 ;
    public final void rule__ProjectModule__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2032:1: ( rule__ProjectModule__Group_3_3__0__Impl rule__ProjectModule__Group_3_3__1 )
            // InternalLibrettoProjectProfile.g:2033:2: rule__ProjectModule__Group_3_3__0__Impl rule__ProjectModule__Group_3_3__1
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
    // InternalLibrettoProjectProfile.g:2040:1: rule__ProjectModule__Group_3_3__0__Impl : ( 'mainDir' ) ;
    public final void rule__ProjectModule__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2044:1: ( ( 'mainDir' ) )
            // InternalLibrettoProjectProfile.g:2045:1: ( 'mainDir' )
            {
            // InternalLibrettoProjectProfile.g:2045:1: ( 'mainDir' )
            // InternalLibrettoProjectProfile.g:2046:2: 'mainDir'
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
    // InternalLibrettoProjectProfile.g:2055:1: rule__ProjectModule__Group_3_3__1 : rule__ProjectModule__Group_3_3__1__Impl ;
    public final void rule__ProjectModule__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2059:1: ( rule__ProjectModule__Group_3_3__1__Impl )
            // InternalLibrettoProjectProfile.g:2060:2: rule__ProjectModule__Group_3_3__1__Impl
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
    // InternalLibrettoProjectProfile.g:2066:1: rule__ProjectModule__Group_3_3__1__Impl : ( ( rule__ProjectModule__MainDirsAssignment_3_3_1 ) ) ;
    public final void rule__ProjectModule__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2070:1: ( ( ( rule__ProjectModule__MainDirsAssignment_3_3_1 ) ) )
            // InternalLibrettoProjectProfile.g:2071:1: ( ( rule__ProjectModule__MainDirsAssignment_3_3_1 ) )
            {
            // InternalLibrettoProjectProfile.g:2071:1: ( ( rule__ProjectModule__MainDirsAssignment_3_3_1 ) )
            // InternalLibrettoProjectProfile.g:2072:2: ( rule__ProjectModule__MainDirsAssignment_3_3_1 )
            {
             before(grammarAccess.getProjectModuleAccess().getMainDirsAssignment_3_3_1()); 
            // InternalLibrettoProjectProfile.g:2073:2: ( rule__ProjectModule__MainDirsAssignment_3_3_1 )
            // InternalLibrettoProjectProfile.g:2073:3: rule__ProjectModule__MainDirsAssignment_3_3_1
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
    // InternalLibrettoProjectProfile.g:2082:1: rule__ProjectModule__Group_3_4__0 : rule__ProjectModule__Group_3_4__0__Impl rule__ProjectModule__Group_3_4__1 ;
    public final void rule__ProjectModule__Group_3_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2086:1: ( rule__ProjectModule__Group_3_4__0__Impl rule__ProjectModule__Group_3_4__1 )
            // InternalLibrettoProjectProfile.g:2087:2: rule__ProjectModule__Group_3_4__0__Impl rule__ProjectModule__Group_3_4__1
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
    // InternalLibrettoProjectProfile.g:2094:1: rule__ProjectModule__Group_3_4__0__Impl : ( 'basePackage' ) ;
    public final void rule__ProjectModule__Group_3_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2098:1: ( ( 'basePackage' ) )
            // InternalLibrettoProjectProfile.g:2099:1: ( 'basePackage' )
            {
            // InternalLibrettoProjectProfile.g:2099:1: ( 'basePackage' )
            // InternalLibrettoProjectProfile.g:2100:2: 'basePackage'
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
    // InternalLibrettoProjectProfile.g:2109:1: rule__ProjectModule__Group_3_4__1 : rule__ProjectModule__Group_3_4__1__Impl ;
    public final void rule__ProjectModule__Group_3_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2113:1: ( rule__ProjectModule__Group_3_4__1__Impl )
            // InternalLibrettoProjectProfile.g:2114:2: rule__ProjectModule__Group_3_4__1__Impl
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
    // InternalLibrettoProjectProfile.g:2120:1: rule__ProjectModule__Group_3_4__1__Impl : ( ( rule__ProjectModule__BasePackagesAssignment_3_4_1 ) ) ;
    public final void rule__ProjectModule__Group_3_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2124:1: ( ( ( rule__ProjectModule__BasePackagesAssignment_3_4_1 ) ) )
            // InternalLibrettoProjectProfile.g:2125:1: ( ( rule__ProjectModule__BasePackagesAssignment_3_4_1 ) )
            {
            // InternalLibrettoProjectProfile.g:2125:1: ( ( rule__ProjectModule__BasePackagesAssignment_3_4_1 ) )
            // InternalLibrettoProjectProfile.g:2126:2: ( rule__ProjectModule__BasePackagesAssignment_3_4_1 )
            {
             before(grammarAccess.getProjectModuleAccess().getBasePackagesAssignment_3_4_1()); 
            // InternalLibrettoProjectProfile.g:2127:2: ( rule__ProjectModule__BasePackagesAssignment_3_4_1 )
            // InternalLibrettoProjectProfile.g:2127:3: rule__ProjectModule__BasePackagesAssignment_3_4_1
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
    // InternalLibrettoProjectProfile.g:2136:1: rule__GenBlock__Group__0 : rule__GenBlock__Group__0__Impl rule__GenBlock__Group__1 ;
    public final void rule__GenBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2140:1: ( rule__GenBlock__Group__0__Impl rule__GenBlock__Group__1 )
            // InternalLibrettoProjectProfile.g:2141:2: rule__GenBlock__Group__0__Impl rule__GenBlock__Group__1
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
    // InternalLibrettoProjectProfile.g:2148:1: rule__GenBlock__Group__0__Impl : ( () ) ;
    public final void rule__GenBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2152:1: ( ( () ) )
            // InternalLibrettoProjectProfile.g:2153:1: ( () )
            {
            // InternalLibrettoProjectProfile.g:2153:1: ( () )
            // InternalLibrettoProjectProfile.g:2154:2: ()
            {
             before(grammarAccess.getGenBlockAccess().getGenBlockAction_0()); 
            // InternalLibrettoProjectProfile.g:2155:2: ()
            // InternalLibrettoProjectProfile.g:2155:3: 
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
    // InternalLibrettoProjectProfile.g:2163:1: rule__GenBlock__Group__1 : rule__GenBlock__Group__1__Impl rule__GenBlock__Group__2 ;
    public final void rule__GenBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2167:1: ( rule__GenBlock__Group__1__Impl rule__GenBlock__Group__2 )
            // InternalLibrettoProjectProfile.g:2168:2: rule__GenBlock__Group__1__Impl rule__GenBlock__Group__2
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
    // InternalLibrettoProjectProfile.g:2175:1: rule__GenBlock__Group__1__Impl : ( 'gen' ) ;
    public final void rule__GenBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2179:1: ( ( 'gen' ) )
            // InternalLibrettoProjectProfile.g:2180:1: ( 'gen' )
            {
            // InternalLibrettoProjectProfile.g:2180:1: ( 'gen' )
            // InternalLibrettoProjectProfile.g:2181:2: 'gen'
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
    // InternalLibrettoProjectProfile.g:2190:1: rule__GenBlock__Group__2 : rule__GenBlock__Group__2__Impl rule__GenBlock__Group__3 ;
    public final void rule__GenBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2194:1: ( rule__GenBlock__Group__2__Impl rule__GenBlock__Group__3 )
            // InternalLibrettoProjectProfile.g:2195:2: rule__GenBlock__Group__2__Impl rule__GenBlock__Group__3
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
    // InternalLibrettoProjectProfile.g:2202:1: rule__GenBlock__Group__2__Impl : ( '{' ) ;
    public final void rule__GenBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2206:1: ( ( '{' ) )
            // InternalLibrettoProjectProfile.g:2207:1: ( '{' )
            {
            // InternalLibrettoProjectProfile.g:2207:1: ( '{' )
            // InternalLibrettoProjectProfile.g:2208:2: '{'
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
    // InternalLibrettoProjectProfile.g:2217:1: rule__GenBlock__Group__3 : rule__GenBlock__Group__3__Impl rule__GenBlock__Group__4 ;
    public final void rule__GenBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2221:1: ( rule__GenBlock__Group__3__Impl rule__GenBlock__Group__4 )
            // InternalLibrettoProjectProfile.g:2222:2: rule__GenBlock__Group__3__Impl rule__GenBlock__Group__4
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
    // InternalLibrettoProjectProfile.g:2229:1: rule__GenBlock__Group__3__Impl : ( ( rule__GenBlock__Alternatives_3 )* ) ;
    public final void rule__GenBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2233:1: ( ( ( rule__GenBlock__Alternatives_3 )* ) )
            // InternalLibrettoProjectProfile.g:2234:1: ( ( rule__GenBlock__Alternatives_3 )* )
            {
            // InternalLibrettoProjectProfile.g:2234:1: ( ( rule__GenBlock__Alternatives_3 )* )
            // InternalLibrettoProjectProfile.g:2235:2: ( rule__GenBlock__Alternatives_3 )*
            {
             before(grammarAccess.getGenBlockAccess().getAlternatives_3()); 
            // InternalLibrettoProjectProfile.g:2236:2: ( rule__GenBlock__Alternatives_3 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=41 && LA24_0<=45)||LA24_0==57) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:2236:3: rule__GenBlock__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__GenBlock__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalLibrettoProjectProfile.g:2244:1: rule__GenBlock__Group__4 : rule__GenBlock__Group__4__Impl ;
    public final void rule__GenBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2248:1: ( rule__GenBlock__Group__4__Impl )
            // InternalLibrettoProjectProfile.g:2249:2: rule__GenBlock__Group__4__Impl
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
    // InternalLibrettoProjectProfile.g:2255:1: rule__GenBlock__Group__4__Impl : ( '}' ) ;
    public final void rule__GenBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2259:1: ( ( '}' ) )
            // InternalLibrettoProjectProfile.g:2260:1: ( '}' )
            {
            // InternalLibrettoProjectProfile.g:2260:1: ( '}' )
            // InternalLibrettoProjectProfile.g:2261:2: '}'
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
    // InternalLibrettoProjectProfile.g:2271:1: rule__GenBlock__Group_3_0__0 : rule__GenBlock__Group_3_0__0__Impl rule__GenBlock__Group_3_0__1 ;
    public final void rule__GenBlock__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2275:1: ( rule__GenBlock__Group_3_0__0__Impl rule__GenBlock__Group_3_0__1 )
            // InternalLibrettoProjectProfile.g:2276:2: rule__GenBlock__Group_3_0__0__Impl rule__GenBlock__Group_3_0__1
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
    // InternalLibrettoProjectProfile.g:2283:1: rule__GenBlock__Group_3_0__0__Impl : ( 'initialInstruction' ) ;
    public final void rule__GenBlock__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2287:1: ( ( 'initialInstruction' ) )
            // InternalLibrettoProjectProfile.g:2288:1: ( 'initialInstruction' )
            {
            // InternalLibrettoProjectProfile.g:2288:1: ( 'initialInstruction' )
            // InternalLibrettoProjectProfile.g:2289:2: 'initialInstruction'
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
    // InternalLibrettoProjectProfile.g:2298:1: rule__GenBlock__Group_3_0__1 : rule__GenBlock__Group_3_0__1__Impl ;
    public final void rule__GenBlock__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2302:1: ( rule__GenBlock__Group_3_0__1__Impl )
            // InternalLibrettoProjectProfile.g:2303:2: rule__GenBlock__Group_3_0__1__Impl
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
    // InternalLibrettoProjectProfile.g:2309:1: rule__GenBlock__Group_3_0__1__Impl : ( ( rule__GenBlock__InitialInstructionsAssignment_3_0_1 ) ) ;
    public final void rule__GenBlock__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2313:1: ( ( ( rule__GenBlock__InitialInstructionsAssignment_3_0_1 ) ) )
            // InternalLibrettoProjectProfile.g:2314:1: ( ( rule__GenBlock__InitialInstructionsAssignment_3_0_1 ) )
            {
            // InternalLibrettoProjectProfile.g:2314:1: ( ( rule__GenBlock__InitialInstructionsAssignment_3_0_1 ) )
            // InternalLibrettoProjectProfile.g:2315:2: ( rule__GenBlock__InitialInstructionsAssignment_3_0_1 )
            {
             before(grammarAccess.getGenBlockAccess().getInitialInstructionsAssignment_3_0_1()); 
            // InternalLibrettoProjectProfile.g:2316:2: ( rule__GenBlock__InitialInstructionsAssignment_3_0_1 )
            // InternalLibrettoProjectProfile.g:2316:3: rule__GenBlock__InitialInstructionsAssignment_3_0_1
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
    // InternalLibrettoProjectProfile.g:2325:1: rule__GenBlock__Group_3_1__0 : rule__GenBlock__Group_3_1__0__Impl rule__GenBlock__Group_3_1__1 ;
    public final void rule__GenBlock__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2329:1: ( rule__GenBlock__Group_3_1__0__Impl rule__GenBlock__Group_3_1__1 )
            // InternalLibrettoProjectProfile.g:2330:2: rule__GenBlock__Group_3_1__0__Impl rule__GenBlock__Group_3_1__1
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
    // InternalLibrettoProjectProfile.g:2337:1: rule__GenBlock__Group_3_1__0__Impl : ( 'maxRetries' ) ;
    public final void rule__GenBlock__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2341:1: ( ( 'maxRetries' ) )
            // InternalLibrettoProjectProfile.g:2342:1: ( 'maxRetries' )
            {
            // InternalLibrettoProjectProfile.g:2342:1: ( 'maxRetries' )
            // InternalLibrettoProjectProfile.g:2343:2: 'maxRetries'
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
    // InternalLibrettoProjectProfile.g:2352:1: rule__GenBlock__Group_3_1__1 : rule__GenBlock__Group_3_1__1__Impl ;
    public final void rule__GenBlock__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2356:1: ( rule__GenBlock__Group_3_1__1__Impl )
            // InternalLibrettoProjectProfile.g:2357:2: rule__GenBlock__Group_3_1__1__Impl
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
    // InternalLibrettoProjectProfile.g:2363:1: rule__GenBlock__Group_3_1__1__Impl : ( ( rule__GenBlock__MaxRetriesAssignment_3_1_1 ) ) ;
    public final void rule__GenBlock__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2367:1: ( ( ( rule__GenBlock__MaxRetriesAssignment_3_1_1 ) ) )
            // InternalLibrettoProjectProfile.g:2368:1: ( ( rule__GenBlock__MaxRetriesAssignment_3_1_1 ) )
            {
            // InternalLibrettoProjectProfile.g:2368:1: ( ( rule__GenBlock__MaxRetriesAssignment_3_1_1 ) )
            // InternalLibrettoProjectProfile.g:2369:2: ( rule__GenBlock__MaxRetriesAssignment_3_1_1 )
            {
             before(grammarAccess.getGenBlockAccess().getMaxRetriesAssignment_3_1_1()); 
            // InternalLibrettoProjectProfile.g:2370:2: ( rule__GenBlock__MaxRetriesAssignment_3_1_1 )
            // InternalLibrettoProjectProfile.g:2370:3: rule__GenBlock__MaxRetriesAssignment_3_1_1
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
    // InternalLibrettoProjectProfile.g:2379:1: rule__GenBlock__Group_3_2__0 : rule__GenBlock__Group_3_2__0__Impl rule__GenBlock__Group_3_2__1 ;
    public final void rule__GenBlock__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2383:1: ( rule__GenBlock__Group_3_2__0__Impl rule__GenBlock__Group_3_2__1 )
            // InternalLibrettoProjectProfile.g:2384:2: rule__GenBlock__Group_3_2__0__Impl rule__GenBlock__Group_3_2__1
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
    // InternalLibrettoProjectProfile.g:2391:1: rule__GenBlock__Group_3_2__0__Impl : ( 'parseCheck' ) ;
    public final void rule__GenBlock__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2395:1: ( ( 'parseCheck' ) )
            // InternalLibrettoProjectProfile.g:2396:1: ( 'parseCheck' )
            {
            // InternalLibrettoProjectProfile.g:2396:1: ( 'parseCheck' )
            // InternalLibrettoProjectProfile.g:2397:2: 'parseCheck'
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
    // InternalLibrettoProjectProfile.g:2406:1: rule__GenBlock__Group_3_2__1 : rule__GenBlock__Group_3_2__1__Impl ;
    public final void rule__GenBlock__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2410:1: ( rule__GenBlock__Group_3_2__1__Impl )
            // InternalLibrettoProjectProfile.g:2411:2: rule__GenBlock__Group_3_2__1__Impl
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
    // InternalLibrettoProjectProfile.g:2417:1: rule__GenBlock__Group_3_2__1__Impl : ( ( rule__GenBlock__ParseChecksAssignment_3_2_1 ) ) ;
    public final void rule__GenBlock__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2421:1: ( ( ( rule__GenBlock__ParseChecksAssignment_3_2_1 ) ) )
            // InternalLibrettoProjectProfile.g:2422:1: ( ( rule__GenBlock__ParseChecksAssignment_3_2_1 ) )
            {
            // InternalLibrettoProjectProfile.g:2422:1: ( ( rule__GenBlock__ParseChecksAssignment_3_2_1 ) )
            // InternalLibrettoProjectProfile.g:2423:2: ( rule__GenBlock__ParseChecksAssignment_3_2_1 )
            {
             before(grammarAccess.getGenBlockAccess().getParseChecksAssignment_3_2_1()); 
            // InternalLibrettoProjectProfile.g:2424:2: ( rule__GenBlock__ParseChecksAssignment_3_2_1 )
            // InternalLibrettoProjectProfile.g:2424:3: rule__GenBlock__ParseChecksAssignment_3_2_1
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
    // InternalLibrettoProjectProfile.g:2433:1: rule__GenBlock__Group_3_3__0 : rule__GenBlock__Group_3_3__0__Impl rule__GenBlock__Group_3_3__1 ;
    public final void rule__GenBlock__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2437:1: ( rule__GenBlock__Group_3_3__0__Impl rule__GenBlock__Group_3_3__1 )
            // InternalLibrettoProjectProfile.g:2438:2: rule__GenBlock__Group_3_3__0__Impl rule__GenBlock__Group_3_3__1
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
    // InternalLibrettoProjectProfile.g:2445:1: rule__GenBlock__Group_3_3__0__Impl : ( 'defaultCorrection' ) ;
    public final void rule__GenBlock__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2449:1: ( ( 'defaultCorrection' ) )
            // InternalLibrettoProjectProfile.g:2450:1: ( 'defaultCorrection' )
            {
            // InternalLibrettoProjectProfile.g:2450:1: ( 'defaultCorrection' )
            // InternalLibrettoProjectProfile.g:2451:2: 'defaultCorrection'
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
    // InternalLibrettoProjectProfile.g:2460:1: rule__GenBlock__Group_3_3__1 : rule__GenBlock__Group_3_3__1__Impl ;
    public final void rule__GenBlock__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2464:1: ( rule__GenBlock__Group_3_3__1__Impl )
            // InternalLibrettoProjectProfile.g:2465:2: rule__GenBlock__Group_3_3__1__Impl
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
    // InternalLibrettoProjectProfile.g:2471:1: rule__GenBlock__Group_3_3__1__Impl : ( ( rule__GenBlock__DefaultCorrectionsAssignment_3_3_1 ) ) ;
    public final void rule__GenBlock__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2475:1: ( ( ( rule__GenBlock__DefaultCorrectionsAssignment_3_3_1 ) ) )
            // InternalLibrettoProjectProfile.g:2476:1: ( ( rule__GenBlock__DefaultCorrectionsAssignment_3_3_1 ) )
            {
            // InternalLibrettoProjectProfile.g:2476:1: ( ( rule__GenBlock__DefaultCorrectionsAssignment_3_3_1 ) )
            // InternalLibrettoProjectProfile.g:2477:2: ( rule__GenBlock__DefaultCorrectionsAssignment_3_3_1 )
            {
             before(grammarAccess.getGenBlockAccess().getDefaultCorrectionsAssignment_3_3_1()); 
            // InternalLibrettoProjectProfile.g:2478:2: ( rule__GenBlock__DefaultCorrectionsAssignment_3_3_1 )
            // InternalLibrettoProjectProfile.g:2478:3: rule__GenBlock__DefaultCorrectionsAssignment_3_3_1
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
    // InternalLibrettoProjectProfile.g:2487:1: rule__GenRemediationRules__Group__0 : rule__GenRemediationRules__Group__0__Impl rule__GenRemediationRules__Group__1 ;
    public final void rule__GenRemediationRules__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2491:1: ( rule__GenRemediationRules__Group__0__Impl rule__GenRemediationRules__Group__1 )
            // InternalLibrettoProjectProfile.g:2492:2: rule__GenRemediationRules__Group__0__Impl rule__GenRemediationRules__Group__1
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
    // InternalLibrettoProjectProfile.g:2499:1: rule__GenRemediationRules__Group__0__Impl : ( () ) ;
    public final void rule__GenRemediationRules__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2503:1: ( ( () ) )
            // InternalLibrettoProjectProfile.g:2504:1: ( () )
            {
            // InternalLibrettoProjectProfile.g:2504:1: ( () )
            // InternalLibrettoProjectProfile.g:2505:2: ()
            {
             before(grammarAccess.getGenRemediationRulesAccess().getGenRemediationRulesAction_0()); 
            // InternalLibrettoProjectProfile.g:2506:2: ()
            // InternalLibrettoProjectProfile.g:2506:3: 
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
    // InternalLibrettoProjectProfile.g:2514:1: rule__GenRemediationRules__Group__1 : rule__GenRemediationRules__Group__1__Impl rule__GenRemediationRules__Group__2 ;
    public final void rule__GenRemediationRules__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2518:1: ( rule__GenRemediationRules__Group__1__Impl rule__GenRemediationRules__Group__2 )
            // InternalLibrettoProjectProfile.g:2519:2: rule__GenRemediationRules__Group__1__Impl rule__GenRemediationRules__Group__2
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
    // InternalLibrettoProjectProfile.g:2526:1: rule__GenRemediationRules__Group__1__Impl : ( 'rules' ) ;
    public final void rule__GenRemediationRules__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2530:1: ( ( 'rules' ) )
            // InternalLibrettoProjectProfile.g:2531:1: ( 'rules' )
            {
            // InternalLibrettoProjectProfile.g:2531:1: ( 'rules' )
            // InternalLibrettoProjectProfile.g:2532:2: 'rules'
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
    // InternalLibrettoProjectProfile.g:2541:1: rule__GenRemediationRules__Group__2 : rule__GenRemediationRules__Group__2__Impl rule__GenRemediationRules__Group__3 ;
    public final void rule__GenRemediationRules__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2545:1: ( rule__GenRemediationRules__Group__2__Impl rule__GenRemediationRules__Group__3 )
            // InternalLibrettoProjectProfile.g:2546:2: rule__GenRemediationRules__Group__2__Impl rule__GenRemediationRules__Group__3
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
    // InternalLibrettoProjectProfile.g:2553:1: rule__GenRemediationRules__Group__2__Impl : ( '{' ) ;
    public final void rule__GenRemediationRules__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2557:1: ( ( '{' ) )
            // InternalLibrettoProjectProfile.g:2558:1: ( '{' )
            {
            // InternalLibrettoProjectProfile.g:2558:1: ( '{' )
            // InternalLibrettoProjectProfile.g:2559:2: '{'
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
    // InternalLibrettoProjectProfile.g:2568:1: rule__GenRemediationRules__Group__3 : rule__GenRemediationRules__Group__3__Impl rule__GenRemediationRules__Group__4 ;
    public final void rule__GenRemediationRules__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2572:1: ( rule__GenRemediationRules__Group__3__Impl rule__GenRemediationRules__Group__4 )
            // InternalLibrettoProjectProfile.g:2573:2: rule__GenRemediationRules__Group__3__Impl rule__GenRemediationRules__Group__4
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
    // InternalLibrettoProjectProfile.g:2580:1: rule__GenRemediationRules__Group__3__Impl : ( ( rule__GenRemediationRules__Alternatives_3 )* ) ;
    public final void rule__GenRemediationRules__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2584:1: ( ( ( rule__GenRemediationRules__Alternatives_3 )* ) )
            // InternalLibrettoProjectProfile.g:2585:1: ( ( rule__GenRemediationRules__Alternatives_3 )* )
            {
            // InternalLibrettoProjectProfile.g:2585:1: ( ( rule__GenRemediationRules__Alternatives_3 )* )
            // InternalLibrettoProjectProfile.g:2586:2: ( rule__GenRemediationRules__Alternatives_3 )*
            {
             before(grammarAccess.getGenRemediationRulesAccess().getAlternatives_3()); 
            // InternalLibrettoProjectProfile.g:2587:2: ( rule__GenRemediationRules__Alternatives_3 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==46||LA25_0==50) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:2587:3: rule__GenRemediationRules__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__GenRemediationRules__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getGenRemediationRulesAccess().getAlternatives_3()); 

            }


            }

        }
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
    // InternalLibrettoProjectProfile.g:2595:1: rule__GenRemediationRules__Group__4 : rule__GenRemediationRules__Group__4__Impl ;
    public final void rule__GenRemediationRules__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2599:1: ( rule__GenRemediationRules__Group__4__Impl )
            // InternalLibrettoProjectProfile.g:2600:2: rule__GenRemediationRules__Group__4__Impl
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
    // InternalLibrettoProjectProfile.g:2606:1: rule__GenRemediationRules__Group__4__Impl : ( '}' ) ;
    public final void rule__GenRemediationRules__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2610:1: ( ( '}' ) )
            // InternalLibrettoProjectProfile.g:2611:1: ( '}' )
            {
            // InternalLibrettoProjectProfile.g:2611:1: ( '}' )
            // InternalLibrettoProjectProfile.g:2612:2: '}'
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


    // $ANTLR start "rule__GenPatternRemediationRule__Group__0"
    // InternalLibrettoProjectProfile.g:2622:1: rule__GenPatternRemediationRule__Group__0 : rule__GenPatternRemediationRule__Group__0__Impl rule__GenPatternRemediationRule__Group__1 ;
    public final void rule__GenPatternRemediationRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2626:1: ( rule__GenPatternRemediationRule__Group__0__Impl rule__GenPatternRemediationRule__Group__1 )
            // InternalLibrettoProjectProfile.g:2627:2: rule__GenPatternRemediationRule__Group__0__Impl rule__GenPatternRemediationRule__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalLibrettoProjectProfile.g:2634:1: rule__GenPatternRemediationRule__Group__0__Impl : ( () ) ;
    public final void rule__GenPatternRemediationRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2638:1: ( ( () ) )
            // InternalLibrettoProjectProfile.g:2639:1: ( () )
            {
            // InternalLibrettoProjectProfile.g:2639:1: ( () )
            // InternalLibrettoProjectProfile.g:2640:2: ()
            {
             before(grammarAccess.getGenPatternRemediationRuleAccess().getGenPatternRemediationRuleAction_0()); 
            // InternalLibrettoProjectProfile.g:2641:2: ()
            // InternalLibrettoProjectProfile.g:2641:3: 
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
    // InternalLibrettoProjectProfile.g:2649:1: rule__GenPatternRemediationRule__Group__1 : rule__GenPatternRemediationRule__Group__1__Impl rule__GenPatternRemediationRule__Group__2 ;
    public final void rule__GenPatternRemediationRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2653:1: ( rule__GenPatternRemediationRule__Group__1__Impl rule__GenPatternRemediationRule__Group__2 )
            // InternalLibrettoProjectProfile.g:2654:2: rule__GenPatternRemediationRule__Group__1__Impl rule__GenPatternRemediationRule__Group__2
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
    // InternalLibrettoProjectProfile.g:2661:1: rule__GenPatternRemediationRule__Group__1__Impl : ( 'rule' ) ;
    public final void rule__GenPatternRemediationRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2665:1: ( ( 'rule' ) )
            // InternalLibrettoProjectProfile.g:2666:1: ( 'rule' )
            {
            // InternalLibrettoProjectProfile.g:2666:1: ( 'rule' )
            // InternalLibrettoProjectProfile.g:2667:2: 'rule'
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
    // InternalLibrettoProjectProfile.g:2676:1: rule__GenPatternRemediationRule__Group__2 : rule__GenPatternRemediationRule__Group__2__Impl rule__GenPatternRemediationRule__Group__3 ;
    public final void rule__GenPatternRemediationRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2680:1: ( rule__GenPatternRemediationRule__Group__2__Impl rule__GenPatternRemediationRule__Group__3 )
            // InternalLibrettoProjectProfile.g:2681:2: rule__GenPatternRemediationRule__Group__2__Impl rule__GenPatternRemediationRule__Group__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalLibrettoProjectProfile.g:2688:1: rule__GenPatternRemediationRule__Group__2__Impl : ( '{' ) ;
    public final void rule__GenPatternRemediationRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2692:1: ( ( '{' ) )
            // InternalLibrettoProjectProfile.g:2693:1: ( '{' )
            {
            // InternalLibrettoProjectProfile.g:2693:1: ( '{' )
            // InternalLibrettoProjectProfile.g:2694:2: '{'
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
    // InternalLibrettoProjectProfile.g:2703:1: rule__GenPatternRemediationRule__Group__3 : rule__GenPatternRemediationRule__Group__3__Impl rule__GenPatternRemediationRule__Group__4 ;
    public final void rule__GenPatternRemediationRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2707:1: ( rule__GenPatternRemediationRule__Group__3__Impl rule__GenPatternRemediationRule__Group__4 )
            // InternalLibrettoProjectProfile.g:2708:2: rule__GenPatternRemediationRule__Group__3__Impl rule__GenPatternRemediationRule__Group__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalLibrettoProjectProfile.g:2715:1: rule__GenPatternRemediationRule__Group__3__Impl : ( ( rule__GenPatternRemediationRule__Alternatives_3 )* ) ;
    public final void rule__GenPatternRemediationRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2719:1: ( ( ( rule__GenPatternRemediationRule__Alternatives_3 )* ) )
            // InternalLibrettoProjectProfile.g:2720:1: ( ( rule__GenPatternRemediationRule__Alternatives_3 )* )
            {
            // InternalLibrettoProjectProfile.g:2720:1: ( ( rule__GenPatternRemediationRule__Alternatives_3 )* )
            // InternalLibrettoProjectProfile.g:2721:2: ( rule__GenPatternRemediationRule__Alternatives_3 )*
            {
             before(grammarAccess.getGenPatternRemediationRuleAccess().getAlternatives_3()); 
            // InternalLibrettoProjectProfile.g:2722:2: ( rule__GenPatternRemediationRule__Alternatives_3 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=47 && LA26_0<=49)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:2722:3: rule__GenPatternRemediationRule__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__GenPatternRemediationRule__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalLibrettoProjectProfile.g:2730:1: rule__GenPatternRemediationRule__Group__4 : rule__GenPatternRemediationRule__Group__4__Impl ;
    public final void rule__GenPatternRemediationRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2734:1: ( rule__GenPatternRemediationRule__Group__4__Impl )
            // InternalLibrettoProjectProfile.g:2735:2: rule__GenPatternRemediationRule__Group__4__Impl
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
    // InternalLibrettoProjectProfile.g:2741:1: rule__GenPatternRemediationRule__Group__4__Impl : ( '}' ) ;
    public final void rule__GenPatternRemediationRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2745:1: ( ( '}' ) )
            // InternalLibrettoProjectProfile.g:2746:1: ( '}' )
            {
            // InternalLibrettoProjectProfile.g:2746:1: ( '}' )
            // InternalLibrettoProjectProfile.g:2747:2: '}'
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
    // InternalLibrettoProjectProfile.g:2757:1: rule__GenPatternRemediationRule__Group_3_0__0 : rule__GenPatternRemediationRule__Group_3_0__0__Impl rule__GenPatternRemediationRule__Group_3_0__1 ;
    public final void rule__GenPatternRemediationRule__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2761:1: ( rule__GenPatternRemediationRule__Group_3_0__0__Impl rule__GenPatternRemediationRule__Group_3_0__1 )
            // InternalLibrettoProjectProfile.g:2762:2: rule__GenPatternRemediationRule__Group_3_0__0__Impl rule__GenPatternRemediationRule__Group_3_0__1
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
    // InternalLibrettoProjectProfile.g:2769:1: rule__GenPatternRemediationRule__Group_3_0__0__Impl : ( 'pattern' ) ;
    public final void rule__GenPatternRemediationRule__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2773:1: ( ( 'pattern' ) )
            // InternalLibrettoProjectProfile.g:2774:1: ( 'pattern' )
            {
            // InternalLibrettoProjectProfile.g:2774:1: ( 'pattern' )
            // InternalLibrettoProjectProfile.g:2775:2: 'pattern'
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
    // InternalLibrettoProjectProfile.g:2784:1: rule__GenPatternRemediationRule__Group_3_0__1 : rule__GenPatternRemediationRule__Group_3_0__1__Impl ;
    public final void rule__GenPatternRemediationRule__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2788:1: ( rule__GenPatternRemediationRule__Group_3_0__1__Impl )
            // InternalLibrettoProjectProfile.g:2789:2: rule__GenPatternRemediationRule__Group_3_0__1__Impl
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
    // InternalLibrettoProjectProfile.g:2795:1: rule__GenPatternRemediationRule__Group_3_0__1__Impl : ( ( rule__GenPatternRemediationRule__PatternsAssignment_3_0_1 ) ) ;
    public final void rule__GenPatternRemediationRule__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2799:1: ( ( ( rule__GenPatternRemediationRule__PatternsAssignment_3_0_1 ) ) )
            // InternalLibrettoProjectProfile.g:2800:1: ( ( rule__GenPatternRemediationRule__PatternsAssignment_3_0_1 ) )
            {
            // InternalLibrettoProjectProfile.g:2800:1: ( ( rule__GenPatternRemediationRule__PatternsAssignment_3_0_1 ) )
            // InternalLibrettoProjectProfile.g:2801:2: ( rule__GenPatternRemediationRule__PatternsAssignment_3_0_1 )
            {
             before(grammarAccess.getGenPatternRemediationRuleAccess().getPatternsAssignment_3_0_1()); 
            // InternalLibrettoProjectProfile.g:2802:2: ( rule__GenPatternRemediationRule__PatternsAssignment_3_0_1 )
            // InternalLibrettoProjectProfile.g:2802:3: rule__GenPatternRemediationRule__PatternsAssignment_3_0_1
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
    // InternalLibrettoProjectProfile.g:2811:1: rule__GenPatternRemediationRule__Group_3_1__0 : rule__GenPatternRemediationRule__Group_3_1__0__Impl rule__GenPatternRemediationRule__Group_3_1__1 ;
    public final void rule__GenPatternRemediationRule__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2815:1: ( rule__GenPatternRemediationRule__Group_3_1__0__Impl rule__GenPatternRemediationRule__Group_3_1__1 )
            // InternalLibrettoProjectProfile.g:2816:2: rule__GenPatternRemediationRule__Group_3_1__0__Impl rule__GenPatternRemediationRule__Group_3_1__1
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
    // InternalLibrettoProjectProfile.g:2823:1: rule__GenPatternRemediationRule__Group_3_1__0__Impl : ( 'code' ) ;
    public final void rule__GenPatternRemediationRule__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2827:1: ( ( 'code' ) )
            // InternalLibrettoProjectProfile.g:2828:1: ( 'code' )
            {
            // InternalLibrettoProjectProfile.g:2828:1: ( 'code' )
            // InternalLibrettoProjectProfile.g:2829:2: 'code'
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
    // InternalLibrettoProjectProfile.g:2838:1: rule__GenPatternRemediationRule__Group_3_1__1 : rule__GenPatternRemediationRule__Group_3_1__1__Impl ;
    public final void rule__GenPatternRemediationRule__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2842:1: ( rule__GenPatternRemediationRule__Group_3_1__1__Impl )
            // InternalLibrettoProjectProfile.g:2843:2: rule__GenPatternRemediationRule__Group_3_1__1__Impl
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
    // InternalLibrettoProjectProfile.g:2849:1: rule__GenPatternRemediationRule__Group_3_1__1__Impl : ( ( rule__GenPatternRemediationRule__CodesAssignment_3_1_1 ) ) ;
    public final void rule__GenPatternRemediationRule__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2853:1: ( ( ( rule__GenPatternRemediationRule__CodesAssignment_3_1_1 ) ) )
            // InternalLibrettoProjectProfile.g:2854:1: ( ( rule__GenPatternRemediationRule__CodesAssignment_3_1_1 ) )
            {
            // InternalLibrettoProjectProfile.g:2854:1: ( ( rule__GenPatternRemediationRule__CodesAssignment_3_1_1 ) )
            // InternalLibrettoProjectProfile.g:2855:2: ( rule__GenPatternRemediationRule__CodesAssignment_3_1_1 )
            {
             before(grammarAccess.getGenPatternRemediationRuleAccess().getCodesAssignment_3_1_1()); 
            // InternalLibrettoProjectProfile.g:2856:2: ( rule__GenPatternRemediationRule__CodesAssignment_3_1_1 )
            // InternalLibrettoProjectProfile.g:2856:3: rule__GenPatternRemediationRule__CodesAssignment_3_1_1
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
    // InternalLibrettoProjectProfile.g:2865:1: rule__GenPatternRemediationRule__Group_3_2__0 : rule__GenPatternRemediationRule__Group_3_2__0__Impl rule__GenPatternRemediationRule__Group_3_2__1 ;
    public final void rule__GenPatternRemediationRule__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2869:1: ( rule__GenPatternRemediationRule__Group_3_2__0__Impl rule__GenPatternRemediationRule__Group_3_2__1 )
            // InternalLibrettoProjectProfile.g:2870:2: rule__GenPatternRemediationRule__Group_3_2__0__Impl rule__GenPatternRemediationRule__Group_3_2__1
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
    // InternalLibrettoProjectProfile.g:2877:1: rule__GenPatternRemediationRule__Group_3_2__0__Impl : ( 'correction' ) ;
    public final void rule__GenPatternRemediationRule__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2881:1: ( ( 'correction' ) )
            // InternalLibrettoProjectProfile.g:2882:1: ( 'correction' )
            {
            // InternalLibrettoProjectProfile.g:2882:1: ( 'correction' )
            // InternalLibrettoProjectProfile.g:2883:2: 'correction'
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
    // InternalLibrettoProjectProfile.g:2892:1: rule__GenPatternRemediationRule__Group_3_2__1 : rule__GenPatternRemediationRule__Group_3_2__1__Impl ;
    public final void rule__GenPatternRemediationRule__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2896:1: ( rule__GenPatternRemediationRule__Group_3_2__1__Impl )
            // InternalLibrettoProjectProfile.g:2897:2: rule__GenPatternRemediationRule__Group_3_2__1__Impl
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
    // InternalLibrettoProjectProfile.g:2903:1: rule__GenPatternRemediationRule__Group_3_2__1__Impl : ( ( rule__GenPatternRemediationRule__CorrectionsAssignment_3_2_1 ) ) ;
    public final void rule__GenPatternRemediationRule__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2907:1: ( ( ( rule__GenPatternRemediationRule__CorrectionsAssignment_3_2_1 ) ) )
            // InternalLibrettoProjectProfile.g:2908:1: ( ( rule__GenPatternRemediationRule__CorrectionsAssignment_3_2_1 ) )
            {
            // InternalLibrettoProjectProfile.g:2908:1: ( ( rule__GenPatternRemediationRule__CorrectionsAssignment_3_2_1 ) )
            // InternalLibrettoProjectProfile.g:2909:2: ( rule__GenPatternRemediationRule__CorrectionsAssignment_3_2_1 )
            {
             before(grammarAccess.getGenPatternRemediationRuleAccess().getCorrectionsAssignment_3_2_1()); 
            // InternalLibrettoProjectProfile.g:2910:2: ( rule__GenPatternRemediationRule__CorrectionsAssignment_3_2_1 )
            // InternalLibrettoProjectProfile.g:2910:3: rule__GenPatternRemediationRule__CorrectionsAssignment_3_2_1
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
    // InternalLibrettoProjectProfile.g:2919:1: rule__GenDefaultRemediationRule__Group__0 : rule__GenDefaultRemediationRule__Group__0__Impl rule__GenDefaultRemediationRule__Group__1 ;
    public final void rule__GenDefaultRemediationRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2923:1: ( rule__GenDefaultRemediationRule__Group__0__Impl rule__GenDefaultRemediationRule__Group__1 )
            // InternalLibrettoProjectProfile.g:2924:2: rule__GenDefaultRemediationRule__Group__0__Impl rule__GenDefaultRemediationRule__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalLibrettoProjectProfile.g:2931:1: rule__GenDefaultRemediationRule__Group__0__Impl : ( () ) ;
    public final void rule__GenDefaultRemediationRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2935:1: ( ( () ) )
            // InternalLibrettoProjectProfile.g:2936:1: ( () )
            {
            // InternalLibrettoProjectProfile.g:2936:1: ( () )
            // InternalLibrettoProjectProfile.g:2937:2: ()
            {
             before(grammarAccess.getGenDefaultRemediationRuleAccess().getGenDefaultRemediationRuleAction_0()); 
            // InternalLibrettoProjectProfile.g:2938:2: ()
            // InternalLibrettoProjectProfile.g:2938:3: 
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
    // InternalLibrettoProjectProfile.g:2946:1: rule__GenDefaultRemediationRule__Group__1 : rule__GenDefaultRemediationRule__Group__1__Impl rule__GenDefaultRemediationRule__Group__2 ;
    public final void rule__GenDefaultRemediationRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2950:1: ( rule__GenDefaultRemediationRule__Group__1__Impl rule__GenDefaultRemediationRule__Group__2 )
            // InternalLibrettoProjectProfile.g:2951:2: rule__GenDefaultRemediationRule__Group__1__Impl rule__GenDefaultRemediationRule__Group__2
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
    // InternalLibrettoProjectProfile.g:2958:1: rule__GenDefaultRemediationRule__Group__1__Impl : ( 'default' ) ;
    public final void rule__GenDefaultRemediationRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2962:1: ( ( 'default' ) )
            // InternalLibrettoProjectProfile.g:2963:1: ( 'default' )
            {
            // InternalLibrettoProjectProfile.g:2963:1: ( 'default' )
            // InternalLibrettoProjectProfile.g:2964:2: 'default'
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
    // InternalLibrettoProjectProfile.g:2973:1: rule__GenDefaultRemediationRule__Group__2 : rule__GenDefaultRemediationRule__Group__2__Impl rule__GenDefaultRemediationRule__Group__3 ;
    public final void rule__GenDefaultRemediationRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2977:1: ( rule__GenDefaultRemediationRule__Group__2__Impl rule__GenDefaultRemediationRule__Group__3 )
            // InternalLibrettoProjectProfile.g:2978:2: rule__GenDefaultRemediationRule__Group__2__Impl rule__GenDefaultRemediationRule__Group__3
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
    // InternalLibrettoProjectProfile.g:2985:1: rule__GenDefaultRemediationRule__Group__2__Impl : ( '{' ) ;
    public final void rule__GenDefaultRemediationRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2989:1: ( ( '{' ) )
            // InternalLibrettoProjectProfile.g:2990:1: ( '{' )
            {
            // InternalLibrettoProjectProfile.g:2990:1: ( '{' )
            // InternalLibrettoProjectProfile.g:2991:2: '{'
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
    // InternalLibrettoProjectProfile.g:3000:1: rule__GenDefaultRemediationRule__Group__3 : rule__GenDefaultRemediationRule__Group__3__Impl rule__GenDefaultRemediationRule__Group__4 ;
    public final void rule__GenDefaultRemediationRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3004:1: ( rule__GenDefaultRemediationRule__Group__3__Impl rule__GenDefaultRemediationRule__Group__4 )
            // InternalLibrettoProjectProfile.g:3005:2: rule__GenDefaultRemediationRule__Group__3__Impl rule__GenDefaultRemediationRule__Group__4
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
    // InternalLibrettoProjectProfile.g:3012:1: rule__GenDefaultRemediationRule__Group__3__Impl : ( ( rule__GenDefaultRemediationRule__Alternatives_3 )* ) ;
    public final void rule__GenDefaultRemediationRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3016:1: ( ( ( rule__GenDefaultRemediationRule__Alternatives_3 )* ) )
            // InternalLibrettoProjectProfile.g:3017:1: ( ( rule__GenDefaultRemediationRule__Alternatives_3 )* )
            {
            // InternalLibrettoProjectProfile.g:3017:1: ( ( rule__GenDefaultRemediationRule__Alternatives_3 )* )
            // InternalLibrettoProjectProfile.g:3018:2: ( rule__GenDefaultRemediationRule__Alternatives_3 )*
            {
             before(grammarAccess.getGenDefaultRemediationRuleAccess().getAlternatives_3()); 
            // InternalLibrettoProjectProfile.g:3019:2: ( rule__GenDefaultRemediationRule__Alternatives_3 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=48 && LA27_0<=49)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:3019:3: rule__GenDefaultRemediationRule__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__GenDefaultRemediationRule__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalLibrettoProjectProfile.g:3027:1: rule__GenDefaultRemediationRule__Group__4 : rule__GenDefaultRemediationRule__Group__4__Impl ;
    public final void rule__GenDefaultRemediationRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3031:1: ( rule__GenDefaultRemediationRule__Group__4__Impl )
            // InternalLibrettoProjectProfile.g:3032:2: rule__GenDefaultRemediationRule__Group__4__Impl
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
    // InternalLibrettoProjectProfile.g:3038:1: rule__GenDefaultRemediationRule__Group__4__Impl : ( '}' ) ;
    public final void rule__GenDefaultRemediationRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3042:1: ( ( '}' ) )
            // InternalLibrettoProjectProfile.g:3043:1: ( '}' )
            {
            // InternalLibrettoProjectProfile.g:3043:1: ( '}' )
            // InternalLibrettoProjectProfile.g:3044:2: '}'
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
    // InternalLibrettoProjectProfile.g:3054:1: rule__GenDefaultRemediationRule__Group_3_0__0 : rule__GenDefaultRemediationRule__Group_3_0__0__Impl rule__GenDefaultRemediationRule__Group_3_0__1 ;
    public final void rule__GenDefaultRemediationRule__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3058:1: ( rule__GenDefaultRemediationRule__Group_3_0__0__Impl rule__GenDefaultRemediationRule__Group_3_0__1 )
            // InternalLibrettoProjectProfile.g:3059:2: rule__GenDefaultRemediationRule__Group_3_0__0__Impl rule__GenDefaultRemediationRule__Group_3_0__1
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
    // InternalLibrettoProjectProfile.g:3066:1: rule__GenDefaultRemediationRule__Group_3_0__0__Impl : ( 'code' ) ;
    public final void rule__GenDefaultRemediationRule__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3070:1: ( ( 'code' ) )
            // InternalLibrettoProjectProfile.g:3071:1: ( 'code' )
            {
            // InternalLibrettoProjectProfile.g:3071:1: ( 'code' )
            // InternalLibrettoProjectProfile.g:3072:2: 'code'
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
    // InternalLibrettoProjectProfile.g:3081:1: rule__GenDefaultRemediationRule__Group_3_0__1 : rule__GenDefaultRemediationRule__Group_3_0__1__Impl ;
    public final void rule__GenDefaultRemediationRule__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3085:1: ( rule__GenDefaultRemediationRule__Group_3_0__1__Impl )
            // InternalLibrettoProjectProfile.g:3086:2: rule__GenDefaultRemediationRule__Group_3_0__1__Impl
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
    // InternalLibrettoProjectProfile.g:3092:1: rule__GenDefaultRemediationRule__Group_3_0__1__Impl : ( ( rule__GenDefaultRemediationRule__CodesAssignment_3_0_1 ) ) ;
    public final void rule__GenDefaultRemediationRule__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3096:1: ( ( ( rule__GenDefaultRemediationRule__CodesAssignment_3_0_1 ) ) )
            // InternalLibrettoProjectProfile.g:3097:1: ( ( rule__GenDefaultRemediationRule__CodesAssignment_3_0_1 ) )
            {
            // InternalLibrettoProjectProfile.g:3097:1: ( ( rule__GenDefaultRemediationRule__CodesAssignment_3_0_1 ) )
            // InternalLibrettoProjectProfile.g:3098:2: ( rule__GenDefaultRemediationRule__CodesAssignment_3_0_1 )
            {
             before(grammarAccess.getGenDefaultRemediationRuleAccess().getCodesAssignment_3_0_1()); 
            // InternalLibrettoProjectProfile.g:3099:2: ( rule__GenDefaultRemediationRule__CodesAssignment_3_0_1 )
            // InternalLibrettoProjectProfile.g:3099:3: rule__GenDefaultRemediationRule__CodesAssignment_3_0_1
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
    // InternalLibrettoProjectProfile.g:3108:1: rule__GenDefaultRemediationRule__Group_3_1__0 : rule__GenDefaultRemediationRule__Group_3_1__0__Impl rule__GenDefaultRemediationRule__Group_3_1__1 ;
    public final void rule__GenDefaultRemediationRule__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3112:1: ( rule__GenDefaultRemediationRule__Group_3_1__0__Impl rule__GenDefaultRemediationRule__Group_3_1__1 )
            // InternalLibrettoProjectProfile.g:3113:2: rule__GenDefaultRemediationRule__Group_3_1__0__Impl rule__GenDefaultRemediationRule__Group_3_1__1
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
    // InternalLibrettoProjectProfile.g:3120:1: rule__GenDefaultRemediationRule__Group_3_1__0__Impl : ( 'correction' ) ;
    public final void rule__GenDefaultRemediationRule__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3124:1: ( ( 'correction' ) )
            // InternalLibrettoProjectProfile.g:3125:1: ( 'correction' )
            {
            // InternalLibrettoProjectProfile.g:3125:1: ( 'correction' )
            // InternalLibrettoProjectProfile.g:3126:2: 'correction'
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
    // InternalLibrettoProjectProfile.g:3135:1: rule__GenDefaultRemediationRule__Group_3_1__1 : rule__GenDefaultRemediationRule__Group_3_1__1__Impl ;
    public final void rule__GenDefaultRemediationRule__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3139:1: ( rule__GenDefaultRemediationRule__Group_3_1__1__Impl )
            // InternalLibrettoProjectProfile.g:3140:2: rule__GenDefaultRemediationRule__Group_3_1__1__Impl
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
    // InternalLibrettoProjectProfile.g:3146:1: rule__GenDefaultRemediationRule__Group_3_1__1__Impl : ( ( rule__GenDefaultRemediationRule__CorrectionAssignment_3_1_1 ) ) ;
    public final void rule__GenDefaultRemediationRule__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3150:1: ( ( ( rule__GenDefaultRemediationRule__CorrectionAssignment_3_1_1 ) ) )
            // InternalLibrettoProjectProfile.g:3151:1: ( ( rule__GenDefaultRemediationRule__CorrectionAssignment_3_1_1 ) )
            {
            // InternalLibrettoProjectProfile.g:3151:1: ( ( rule__GenDefaultRemediationRule__CorrectionAssignment_3_1_1 ) )
            // InternalLibrettoProjectProfile.g:3152:2: ( rule__GenDefaultRemediationRule__CorrectionAssignment_3_1_1 )
            {
             before(grammarAccess.getGenDefaultRemediationRuleAccess().getCorrectionAssignment_3_1_1()); 
            // InternalLibrettoProjectProfile.g:3153:2: ( rule__GenDefaultRemediationRule__CorrectionAssignment_3_1_1 )
            // InternalLibrettoProjectProfile.g:3153:3: rule__GenDefaultRemediationRule__CorrectionAssignment_3_1_1
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
    // InternalLibrettoProjectProfile.g:3162:1: rule__LlmProvidersBlock__Group__0 : rule__LlmProvidersBlock__Group__0__Impl rule__LlmProvidersBlock__Group__1 ;
    public final void rule__LlmProvidersBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3166:1: ( rule__LlmProvidersBlock__Group__0__Impl rule__LlmProvidersBlock__Group__1 )
            // InternalLibrettoProjectProfile.g:3167:2: rule__LlmProvidersBlock__Group__0__Impl rule__LlmProvidersBlock__Group__1
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
    // InternalLibrettoProjectProfile.g:3174:1: rule__LlmProvidersBlock__Group__0__Impl : ( () ) ;
    public final void rule__LlmProvidersBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3178:1: ( ( () ) )
            // InternalLibrettoProjectProfile.g:3179:1: ( () )
            {
            // InternalLibrettoProjectProfile.g:3179:1: ( () )
            // InternalLibrettoProjectProfile.g:3180:2: ()
            {
             before(grammarAccess.getLlmProvidersBlockAccess().getLlmProvidersBlockAction_0()); 
            // InternalLibrettoProjectProfile.g:3181:2: ()
            // InternalLibrettoProjectProfile.g:3181:3: 
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
    // InternalLibrettoProjectProfile.g:3189:1: rule__LlmProvidersBlock__Group__1 : rule__LlmProvidersBlock__Group__1__Impl rule__LlmProvidersBlock__Group__2 ;
    public final void rule__LlmProvidersBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3193:1: ( rule__LlmProvidersBlock__Group__1__Impl rule__LlmProvidersBlock__Group__2 )
            // InternalLibrettoProjectProfile.g:3194:2: rule__LlmProvidersBlock__Group__1__Impl rule__LlmProvidersBlock__Group__2
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
    // InternalLibrettoProjectProfile.g:3201:1: rule__LlmProvidersBlock__Group__1__Impl : ( 'llmProviders' ) ;
    public final void rule__LlmProvidersBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3205:1: ( ( 'llmProviders' ) )
            // InternalLibrettoProjectProfile.g:3206:1: ( 'llmProviders' )
            {
            // InternalLibrettoProjectProfile.g:3206:1: ( 'llmProviders' )
            // InternalLibrettoProjectProfile.g:3207:2: 'llmProviders'
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
    // InternalLibrettoProjectProfile.g:3216:1: rule__LlmProvidersBlock__Group__2 : rule__LlmProvidersBlock__Group__2__Impl rule__LlmProvidersBlock__Group__3 ;
    public final void rule__LlmProvidersBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3220:1: ( rule__LlmProvidersBlock__Group__2__Impl rule__LlmProvidersBlock__Group__3 )
            // InternalLibrettoProjectProfile.g:3221:2: rule__LlmProvidersBlock__Group__2__Impl rule__LlmProvidersBlock__Group__3
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
    // InternalLibrettoProjectProfile.g:3228:1: rule__LlmProvidersBlock__Group__2__Impl : ( '{' ) ;
    public final void rule__LlmProvidersBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3232:1: ( ( '{' ) )
            // InternalLibrettoProjectProfile.g:3233:1: ( '{' )
            {
            // InternalLibrettoProjectProfile.g:3233:1: ( '{' )
            // InternalLibrettoProjectProfile.g:3234:2: '{'
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
    // InternalLibrettoProjectProfile.g:3243:1: rule__LlmProvidersBlock__Group__3 : rule__LlmProvidersBlock__Group__3__Impl rule__LlmProvidersBlock__Group__4 ;
    public final void rule__LlmProvidersBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3247:1: ( rule__LlmProvidersBlock__Group__3__Impl rule__LlmProvidersBlock__Group__4 )
            // InternalLibrettoProjectProfile.g:3248:2: rule__LlmProvidersBlock__Group__3__Impl rule__LlmProvidersBlock__Group__4
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
    // InternalLibrettoProjectProfile.g:3255:1: rule__LlmProvidersBlock__Group__3__Impl : ( ( rule__LlmProvidersBlock__ProvidersAssignment_3 )* ) ;
    public final void rule__LlmProvidersBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3259:1: ( ( ( rule__LlmProvidersBlock__ProvidersAssignment_3 )* ) )
            // InternalLibrettoProjectProfile.g:3260:1: ( ( rule__LlmProvidersBlock__ProvidersAssignment_3 )* )
            {
            // InternalLibrettoProjectProfile.g:3260:1: ( ( rule__LlmProvidersBlock__ProvidersAssignment_3 )* )
            // InternalLibrettoProjectProfile.g:3261:2: ( rule__LlmProvidersBlock__ProvidersAssignment_3 )*
            {
             before(grammarAccess.getLlmProvidersBlockAccess().getProvidersAssignment_3()); 
            // InternalLibrettoProjectProfile.g:3262:2: ( rule__LlmProvidersBlock__ProvidersAssignment_3 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==52) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:3262:3: rule__LlmProvidersBlock__ProvidersAssignment_3
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__LlmProvidersBlock__ProvidersAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalLibrettoProjectProfile.g:3270:1: rule__LlmProvidersBlock__Group__4 : rule__LlmProvidersBlock__Group__4__Impl ;
    public final void rule__LlmProvidersBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3274:1: ( rule__LlmProvidersBlock__Group__4__Impl )
            // InternalLibrettoProjectProfile.g:3275:2: rule__LlmProvidersBlock__Group__4__Impl
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
    // InternalLibrettoProjectProfile.g:3281:1: rule__LlmProvidersBlock__Group__4__Impl : ( '}' ) ;
    public final void rule__LlmProvidersBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3285:1: ( ( '}' ) )
            // InternalLibrettoProjectProfile.g:3286:1: ( '}' )
            {
            // InternalLibrettoProjectProfile.g:3286:1: ( '}' )
            // InternalLibrettoProjectProfile.g:3287:2: '}'
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
    // InternalLibrettoProjectProfile.g:3297:1: rule__NamedLlmProvider__Group__0 : rule__NamedLlmProvider__Group__0__Impl rule__NamedLlmProvider__Group__1 ;
    public final void rule__NamedLlmProvider__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3301:1: ( rule__NamedLlmProvider__Group__0__Impl rule__NamedLlmProvider__Group__1 )
            // InternalLibrettoProjectProfile.g:3302:2: rule__NamedLlmProvider__Group__0__Impl rule__NamedLlmProvider__Group__1
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
    // InternalLibrettoProjectProfile.g:3309:1: rule__NamedLlmProvider__Group__0__Impl : ( 'provider' ) ;
    public final void rule__NamedLlmProvider__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3313:1: ( ( 'provider' ) )
            // InternalLibrettoProjectProfile.g:3314:1: ( 'provider' )
            {
            // InternalLibrettoProjectProfile.g:3314:1: ( 'provider' )
            // InternalLibrettoProjectProfile.g:3315:2: 'provider'
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
    // InternalLibrettoProjectProfile.g:3324:1: rule__NamedLlmProvider__Group__1 : rule__NamedLlmProvider__Group__1__Impl rule__NamedLlmProvider__Group__2 ;
    public final void rule__NamedLlmProvider__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3328:1: ( rule__NamedLlmProvider__Group__1__Impl rule__NamedLlmProvider__Group__2 )
            // InternalLibrettoProjectProfile.g:3329:2: rule__NamedLlmProvider__Group__1__Impl rule__NamedLlmProvider__Group__2
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
    // InternalLibrettoProjectProfile.g:3336:1: rule__NamedLlmProvider__Group__1__Impl : ( ( rule__NamedLlmProvider__NameAssignment_1 ) ) ;
    public final void rule__NamedLlmProvider__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3340:1: ( ( ( rule__NamedLlmProvider__NameAssignment_1 ) ) )
            // InternalLibrettoProjectProfile.g:3341:1: ( ( rule__NamedLlmProvider__NameAssignment_1 ) )
            {
            // InternalLibrettoProjectProfile.g:3341:1: ( ( rule__NamedLlmProvider__NameAssignment_1 ) )
            // InternalLibrettoProjectProfile.g:3342:2: ( rule__NamedLlmProvider__NameAssignment_1 )
            {
             before(grammarAccess.getNamedLlmProviderAccess().getNameAssignment_1()); 
            // InternalLibrettoProjectProfile.g:3343:2: ( rule__NamedLlmProvider__NameAssignment_1 )
            // InternalLibrettoProjectProfile.g:3343:3: rule__NamedLlmProvider__NameAssignment_1
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
    // InternalLibrettoProjectProfile.g:3351:1: rule__NamedLlmProvider__Group__2 : rule__NamedLlmProvider__Group__2__Impl rule__NamedLlmProvider__Group__3 ;
    public final void rule__NamedLlmProvider__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3355:1: ( rule__NamedLlmProvider__Group__2__Impl rule__NamedLlmProvider__Group__3 )
            // InternalLibrettoProjectProfile.g:3356:2: rule__NamedLlmProvider__Group__2__Impl rule__NamedLlmProvider__Group__3
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
    // InternalLibrettoProjectProfile.g:3363:1: rule__NamedLlmProvider__Group__2__Impl : ( '{' ) ;
    public final void rule__NamedLlmProvider__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3367:1: ( ( '{' ) )
            // InternalLibrettoProjectProfile.g:3368:1: ( '{' )
            {
            // InternalLibrettoProjectProfile.g:3368:1: ( '{' )
            // InternalLibrettoProjectProfile.g:3369:2: '{'
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
    // InternalLibrettoProjectProfile.g:3378:1: rule__NamedLlmProvider__Group__3 : rule__NamedLlmProvider__Group__3__Impl rule__NamedLlmProvider__Group__4 ;
    public final void rule__NamedLlmProvider__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3382:1: ( rule__NamedLlmProvider__Group__3__Impl rule__NamedLlmProvider__Group__4 )
            // InternalLibrettoProjectProfile.g:3383:2: rule__NamedLlmProvider__Group__3__Impl rule__NamedLlmProvider__Group__4
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
    // InternalLibrettoProjectProfile.g:3390:1: rule__NamedLlmProvider__Group__3__Impl : ( ( rule__NamedLlmProvider__Alternatives_3 )* ) ;
    public final void rule__NamedLlmProvider__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3394:1: ( ( ( rule__NamedLlmProvider__Alternatives_3 )* ) )
            // InternalLibrettoProjectProfile.g:3395:1: ( ( rule__NamedLlmProvider__Alternatives_3 )* )
            {
            // InternalLibrettoProjectProfile.g:3395:1: ( ( rule__NamedLlmProvider__Alternatives_3 )* )
            // InternalLibrettoProjectProfile.g:3396:2: ( rule__NamedLlmProvider__Alternatives_3 )*
            {
             before(grammarAccess.getNamedLlmProviderAccess().getAlternatives_3()); 
            // InternalLibrettoProjectProfile.g:3397:2: ( rule__NamedLlmProvider__Alternatives_3 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=53 && LA29_0<=56)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:3397:3: rule__NamedLlmProvider__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__NamedLlmProvider__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalLibrettoProjectProfile.g:3405:1: rule__NamedLlmProvider__Group__4 : rule__NamedLlmProvider__Group__4__Impl ;
    public final void rule__NamedLlmProvider__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3409:1: ( rule__NamedLlmProvider__Group__4__Impl )
            // InternalLibrettoProjectProfile.g:3410:2: rule__NamedLlmProvider__Group__4__Impl
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
    // InternalLibrettoProjectProfile.g:3416:1: rule__NamedLlmProvider__Group__4__Impl : ( '}' ) ;
    public final void rule__NamedLlmProvider__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3420:1: ( ( '}' ) )
            // InternalLibrettoProjectProfile.g:3421:1: ( '}' )
            {
            // InternalLibrettoProjectProfile.g:3421:1: ( '}' )
            // InternalLibrettoProjectProfile.g:3422:2: '}'
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
    // InternalLibrettoProjectProfile.g:3432:1: rule__NamedLlmProvider__Group_3_0__0 : rule__NamedLlmProvider__Group_3_0__0__Impl rule__NamedLlmProvider__Group_3_0__1 ;
    public final void rule__NamedLlmProvider__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3436:1: ( rule__NamedLlmProvider__Group_3_0__0__Impl rule__NamedLlmProvider__Group_3_0__1 )
            // InternalLibrettoProjectProfile.g:3437:2: rule__NamedLlmProvider__Group_3_0__0__Impl rule__NamedLlmProvider__Group_3_0__1
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
    // InternalLibrettoProjectProfile.g:3444:1: rule__NamedLlmProvider__Group_3_0__0__Impl : ( 'kind' ) ;
    public final void rule__NamedLlmProvider__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3448:1: ( ( 'kind' ) )
            // InternalLibrettoProjectProfile.g:3449:1: ( 'kind' )
            {
            // InternalLibrettoProjectProfile.g:3449:1: ( 'kind' )
            // InternalLibrettoProjectProfile.g:3450:2: 'kind'
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
    // InternalLibrettoProjectProfile.g:3459:1: rule__NamedLlmProvider__Group_3_0__1 : rule__NamedLlmProvider__Group_3_0__1__Impl ;
    public final void rule__NamedLlmProvider__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3463:1: ( rule__NamedLlmProvider__Group_3_0__1__Impl )
            // InternalLibrettoProjectProfile.g:3464:2: rule__NamedLlmProvider__Group_3_0__1__Impl
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
    // InternalLibrettoProjectProfile.g:3470:1: rule__NamedLlmProvider__Group_3_0__1__Impl : ( ( rule__NamedLlmProvider__KindsAssignment_3_0_1 ) ) ;
    public final void rule__NamedLlmProvider__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3474:1: ( ( ( rule__NamedLlmProvider__KindsAssignment_3_0_1 ) ) )
            // InternalLibrettoProjectProfile.g:3475:1: ( ( rule__NamedLlmProvider__KindsAssignment_3_0_1 ) )
            {
            // InternalLibrettoProjectProfile.g:3475:1: ( ( rule__NamedLlmProvider__KindsAssignment_3_0_1 ) )
            // InternalLibrettoProjectProfile.g:3476:2: ( rule__NamedLlmProvider__KindsAssignment_3_0_1 )
            {
             before(grammarAccess.getNamedLlmProviderAccess().getKindsAssignment_3_0_1()); 
            // InternalLibrettoProjectProfile.g:3477:2: ( rule__NamedLlmProvider__KindsAssignment_3_0_1 )
            // InternalLibrettoProjectProfile.g:3477:3: rule__NamedLlmProvider__KindsAssignment_3_0_1
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
    // InternalLibrettoProjectProfile.g:3486:1: rule__NamedLlmProvider__Group_3_1__0 : rule__NamedLlmProvider__Group_3_1__0__Impl rule__NamedLlmProvider__Group_3_1__1 ;
    public final void rule__NamedLlmProvider__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3490:1: ( rule__NamedLlmProvider__Group_3_1__0__Impl rule__NamedLlmProvider__Group_3_1__1 )
            // InternalLibrettoProjectProfile.g:3491:2: rule__NamedLlmProvider__Group_3_1__0__Impl rule__NamedLlmProvider__Group_3_1__1
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
    // InternalLibrettoProjectProfile.g:3498:1: rule__NamedLlmProvider__Group_3_1__0__Impl : ( 'localModelPath' ) ;
    public final void rule__NamedLlmProvider__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3502:1: ( ( 'localModelPath' ) )
            // InternalLibrettoProjectProfile.g:3503:1: ( 'localModelPath' )
            {
            // InternalLibrettoProjectProfile.g:3503:1: ( 'localModelPath' )
            // InternalLibrettoProjectProfile.g:3504:2: 'localModelPath'
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
    // InternalLibrettoProjectProfile.g:3513:1: rule__NamedLlmProvider__Group_3_1__1 : rule__NamedLlmProvider__Group_3_1__1__Impl ;
    public final void rule__NamedLlmProvider__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3517:1: ( rule__NamedLlmProvider__Group_3_1__1__Impl )
            // InternalLibrettoProjectProfile.g:3518:2: rule__NamedLlmProvider__Group_3_1__1__Impl
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
    // InternalLibrettoProjectProfile.g:3524:1: rule__NamedLlmProvider__Group_3_1__1__Impl : ( ( rule__NamedLlmProvider__LocalModelPathsAssignment_3_1_1 ) ) ;
    public final void rule__NamedLlmProvider__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3528:1: ( ( ( rule__NamedLlmProvider__LocalModelPathsAssignment_3_1_1 ) ) )
            // InternalLibrettoProjectProfile.g:3529:1: ( ( rule__NamedLlmProvider__LocalModelPathsAssignment_3_1_1 ) )
            {
            // InternalLibrettoProjectProfile.g:3529:1: ( ( rule__NamedLlmProvider__LocalModelPathsAssignment_3_1_1 ) )
            // InternalLibrettoProjectProfile.g:3530:2: ( rule__NamedLlmProvider__LocalModelPathsAssignment_3_1_1 )
            {
             before(grammarAccess.getNamedLlmProviderAccess().getLocalModelPathsAssignment_3_1_1()); 
            // InternalLibrettoProjectProfile.g:3531:2: ( rule__NamedLlmProvider__LocalModelPathsAssignment_3_1_1 )
            // InternalLibrettoProjectProfile.g:3531:3: rule__NamedLlmProvider__LocalModelPathsAssignment_3_1_1
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
    // InternalLibrettoProjectProfile.g:3540:1: rule__NamedLlmProvider__Group_3_2__0 : rule__NamedLlmProvider__Group_3_2__0__Impl rule__NamedLlmProvider__Group_3_2__1 ;
    public final void rule__NamedLlmProvider__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3544:1: ( rule__NamedLlmProvider__Group_3_2__0__Impl rule__NamedLlmProvider__Group_3_2__1 )
            // InternalLibrettoProjectProfile.g:3545:2: rule__NamedLlmProvider__Group_3_2__0__Impl rule__NamedLlmProvider__Group_3_2__1
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
    // InternalLibrettoProjectProfile.g:3552:1: rule__NamedLlmProvider__Group_3_2__0__Impl : ( 'model' ) ;
    public final void rule__NamedLlmProvider__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3556:1: ( ( 'model' ) )
            // InternalLibrettoProjectProfile.g:3557:1: ( 'model' )
            {
            // InternalLibrettoProjectProfile.g:3557:1: ( 'model' )
            // InternalLibrettoProjectProfile.g:3558:2: 'model'
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
    // InternalLibrettoProjectProfile.g:3567:1: rule__NamedLlmProvider__Group_3_2__1 : rule__NamedLlmProvider__Group_3_2__1__Impl ;
    public final void rule__NamedLlmProvider__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3571:1: ( rule__NamedLlmProvider__Group_3_2__1__Impl )
            // InternalLibrettoProjectProfile.g:3572:2: rule__NamedLlmProvider__Group_3_2__1__Impl
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
    // InternalLibrettoProjectProfile.g:3578:1: rule__NamedLlmProvider__Group_3_2__1__Impl : ( ( rule__NamedLlmProvider__ModelsAssignment_3_2_1 ) ) ;
    public final void rule__NamedLlmProvider__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3582:1: ( ( ( rule__NamedLlmProvider__ModelsAssignment_3_2_1 ) ) )
            // InternalLibrettoProjectProfile.g:3583:1: ( ( rule__NamedLlmProvider__ModelsAssignment_3_2_1 ) )
            {
            // InternalLibrettoProjectProfile.g:3583:1: ( ( rule__NamedLlmProvider__ModelsAssignment_3_2_1 ) )
            // InternalLibrettoProjectProfile.g:3584:2: ( rule__NamedLlmProvider__ModelsAssignment_3_2_1 )
            {
             before(grammarAccess.getNamedLlmProviderAccess().getModelsAssignment_3_2_1()); 
            // InternalLibrettoProjectProfile.g:3585:2: ( rule__NamedLlmProvider__ModelsAssignment_3_2_1 )
            // InternalLibrettoProjectProfile.g:3585:3: rule__NamedLlmProvider__ModelsAssignment_3_2_1
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
    // InternalLibrettoProjectProfile.g:3594:1: rule__NamedLlmProvider__Group_3_3__0 : rule__NamedLlmProvider__Group_3_3__0__Impl rule__NamedLlmProvider__Group_3_3__1 ;
    public final void rule__NamedLlmProvider__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3598:1: ( rule__NamedLlmProvider__Group_3_3__0__Impl rule__NamedLlmProvider__Group_3_3__1 )
            // InternalLibrettoProjectProfile.g:3599:2: rule__NamedLlmProvider__Group_3_3__0__Impl rule__NamedLlmProvider__Group_3_3__1
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
    // InternalLibrettoProjectProfile.g:3606:1: rule__NamedLlmProvider__Group_3_3__0__Impl : ( 'endpoint' ) ;
    public final void rule__NamedLlmProvider__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3610:1: ( ( 'endpoint' ) )
            // InternalLibrettoProjectProfile.g:3611:1: ( 'endpoint' )
            {
            // InternalLibrettoProjectProfile.g:3611:1: ( 'endpoint' )
            // InternalLibrettoProjectProfile.g:3612:2: 'endpoint'
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
    // InternalLibrettoProjectProfile.g:3621:1: rule__NamedLlmProvider__Group_3_3__1 : rule__NamedLlmProvider__Group_3_3__1__Impl ;
    public final void rule__NamedLlmProvider__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3625:1: ( rule__NamedLlmProvider__Group_3_3__1__Impl )
            // InternalLibrettoProjectProfile.g:3626:2: rule__NamedLlmProvider__Group_3_3__1__Impl
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
    // InternalLibrettoProjectProfile.g:3632:1: rule__NamedLlmProvider__Group_3_3__1__Impl : ( ( rule__NamedLlmProvider__EndpointsAssignment_3_3_1 ) ) ;
    public final void rule__NamedLlmProvider__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3636:1: ( ( ( rule__NamedLlmProvider__EndpointsAssignment_3_3_1 ) ) )
            // InternalLibrettoProjectProfile.g:3637:1: ( ( rule__NamedLlmProvider__EndpointsAssignment_3_3_1 ) )
            {
            // InternalLibrettoProjectProfile.g:3637:1: ( ( rule__NamedLlmProvider__EndpointsAssignment_3_3_1 ) )
            // InternalLibrettoProjectProfile.g:3638:2: ( rule__NamedLlmProvider__EndpointsAssignment_3_3_1 )
            {
             before(grammarAccess.getNamedLlmProviderAccess().getEndpointsAssignment_3_3_1()); 
            // InternalLibrettoProjectProfile.g:3639:2: ( rule__NamedLlmProvider__EndpointsAssignment_3_3_1 )
            // InternalLibrettoProjectProfile.g:3639:3: rule__NamedLlmProvider__EndpointsAssignment_3_3_1
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
    // InternalLibrettoProjectProfile.g:3648:1: rule__GenUsageBlock__Group__0 : rule__GenUsageBlock__Group__0__Impl rule__GenUsageBlock__Group__1 ;
    public final void rule__GenUsageBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3652:1: ( rule__GenUsageBlock__Group__0__Impl rule__GenUsageBlock__Group__1 )
            // InternalLibrettoProjectProfile.g:3653:2: rule__GenUsageBlock__Group__0__Impl rule__GenUsageBlock__Group__1
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
    // InternalLibrettoProjectProfile.g:3660:1: rule__GenUsageBlock__Group__0__Impl : ( () ) ;
    public final void rule__GenUsageBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3664:1: ( ( () ) )
            // InternalLibrettoProjectProfile.g:3665:1: ( () )
            {
            // InternalLibrettoProjectProfile.g:3665:1: ( () )
            // InternalLibrettoProjectProfile.g:3666:2: ()
            {
             before(grammarAccess.getGenUsageBlockAccess().getGenUsageBlockAction_0()); 
            // InternalLibrettoProjectProfile.g:3667:2: ()
            // InternalLibrettoProjectProfile.g:3667:3: 
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
    // InternalLibrettoProjectProfile.g:3675:1: rule__GenUsageBlock__Group__1 : rule__GenUsageBlock__Group__1__Impl rule__GenUsageBlock__Group__2 ;
    public final void rule__GenUsageBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3679:1: ( rule__GenUsageBlock__Group__1__Impl rule__GenUsageBlock__Group__2 )
            // InternalLibrettoProjectProfile.g:3680:2: rule__GenUsageBlock__Group__1__Impl rule__GenUsageBlock__Group__2
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
    // InternalLibrettoProjectProfile.g:3687:1: rule__GenUsageBlock__Group__1__Impl : ( 'modelUsage' ) ;
    public final void rule__GenUsageBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3691:1: ( ( 'modelUsage' ) )
            // InternalLibrettoProjectProfile.g:3692:1: ( 'modelUsage' )
            {
            // InternalLibrettoProjectProfile.g:3692:1: ( 'modelUsage' )
            // InternalLibrettoProjectProfile.g:3693:2: 'modelUsage'
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
    // InternalLibrettoProjectProfile.g:3702:1: rule__GenUsageBlock__Group__2 : rule__GenUsageBlock__Group__2__Impl rule__GenUsageBlock__Group__3 ;
    public final void rule__GenUsageBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3706:1: ( rule__GenUsageBlock__Group__2__Impl rule__GenUsageBlock__Group__3 )
            // InternalLibrettoProjectProfile.g:3707:2: rule__GenUsageBlock__Group__2__Impl rule__GenUsageBlock__Group__3
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
    // InternalLibrettoProjectProfile.g:3714:1: rule__GenUsageBlock__Group__2__Impl : ( '{' ) ;
    public final void rule__GenUsageBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3718:1: ( ( '{' ) )
            // InternalLibrettoProjectProfile.g:3719:1: ( '{' )
            {
            // InternalLibrettoProjectProfile.g:3719:1: ( '{' )
            // InternalLibrettoProjectProfile.g:3720:2: '{'
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
    // InternalLibrettoProjectProfile.g:3729:1: rule__GenUsageBlock__Group__3 : rule__GenUsageBlock__Group__3__Impl rule__GenUsageBlock__Group__4 ;
    public final void rule__GenUsageBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3733:1: ( rule__GenUsageBlock__Group__3__Impl rule__GenUsageBlock__Group__4 )
            // InternalLibrettoProjectProfile.g:3734:2: rule__GenUsageBlock__Group__3__Impl rule__GenUsageBlock__Group__4
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
    // InternalLibrettoProjectProfile.g:3741:1: rule__GenUsageBlock__Group__3__Impl : ( ( rule__GenUsageBlock__Alternatives_3 )* ) ;
    public final void rule__GenUsageBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3745:1: ( ( ( rule__GenUsageBlock__Alternatives_3 )* ) )
            // InternalLibrettoProjectProfile.g:3746:1: ( ( rule__GenUsageBlock__Alternatives_3 )* )
            {
            // InternalLibrettoProjectProfile.g:3746:1: ( ( rule__GenUsageBlock__Alternatives_3 )* )
            // InternalLibrettoProjectProfile.g:3747:2: ( rule__GenUsageBlock__Alternatives_3 )*
            {
             before(grammarAccess.getGenUsageBlockAccess().getAlternatives_3()); 
            // InternalLibrettoProjectProfile.g:3748:2: ( rule__GenUsageBlock__Alternatives_3 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=58 && LA30_0<=60)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:3748:3: rule__GenUsageBlock__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__GenUsageBlock__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalLibrettoProjectProfile.g:3756:1: rule__GenUsageBlock__Group__4 : rule__GenUsageBlock__Group__4__Impl ;
    public final void rule__GenUsageBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3760:1: ( rule__GenUsageBlock__Group__4__Impl )
            // InternalLibrettoProjectProfile.g:3761:2: rule__GenUsageBlock__Group__4__Impl
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
    // InternalLibrettoProjectProfile.g:3767:1: rule__GenUsageBlock__Group__4__Impl : ( '}' ) ;
    public final void rule__GenUsageBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3771:1: ( ( '}' ) )
            // InternalLibrettoProjectProfile.g:3772:1: ( '}' )
            {
            // InternalLibrettoProjectProfile.g:3772:1: ( '}' )
            // InternalLibrettoProjectProfile.g:3773:2: '}'
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
    // InternalLibrettoProjectProfile.g:3783:1: rule__GenUsageBlock__Group_3_0__0 : rule__GenUsageBlock__Group_3_0__0__Impl rule__GenUsageBlock__Group_3_0__1 ;
    public final void rule__GenUsageBlock__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3787:1: ( rule__GenUsageBlock__Group_3_0__0__Impl rule__GenUsageBlock__Group_3_0__1 )
            // InternalLibrettoProjectProfile.g:3788:2: rule__GenUsageBlock__Group_3_0__0__Impl rule__GenUsageBlock__Group_3_0__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalLibrettoProjectProfile.g:3795:1: rule__GenUsageBlock__Group_3_0__0__Impl : ( 'primary' ) ;
    public final void rule__GenUsageBlock__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3799:1: ( ( 'primary' ) )
            // InternalLibrettoProjectProfile.g:3800:1: ( 'primary' )
            {
            // InternalLibrettoProjectProfile.g:3800:1: ( 'primary' )
            // InternalLibrettoProjectProfile.g:3801:2: 'primary'
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
    // InternalLibrettoProjectProfile.g:3810:1: rule__GenUsageBlock__Group_3_0__1 : rule__GenUsageBlock__Group_3_0__1__Impl ;
    public final void rule__GenUsageBlock__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3814:1: ( rule__GenUsageBlock__Group_3_0__1__Impl )
            // InternalLibrettoProjectProfile.g:3815:2: rule__GenUsageBlock__Group_3_0__1__Impl
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
    // InternalLibrettoProjectProfile.g:3821:1: rule__GenUsageBlock__Group_3_0__1__Impl : ( ( rule__GenUsageBlock__PrimaryProvidersAssignment_3_0_1 ) ) ;
    public final void rule__GenUsageBlock__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3825:1: ( ( ( rule__GenUsageBlock__PrimaryProvidersAssignment_3_0_1 ) ) )
            // InternalLibrettoProjectProfile.g:3826:1: ( ( rule__GenUsageBlock__PrimaryProvidersAssignment_3_0_1 ) )
            {
            // InternalLibrettoProjectProfile.g:3826:1: ( ( rule__GenUsageBlock__PrimaryProvidersAssignment_3_0_1 ) )
            // InternalLibrettoProjectProfile.g:3827:2: ( rule__GenUsageBlock__PrimaryProvidersAssignment_3_0_1 )
            {
             before(grammarAccess.getGenUsageBlockAccess().getPrimaryProvidersAssignment_3_0_1()); 
            // InternalLibrettoProjectProfile.g:3828:2: ( rule__GenUsageBlock__PrimaryProvidersAssignment_3_0_1 )
            // InternalLibrettoProjectProfile.g:3828:3: rule__GenUsageBlock__PrimaryProvidersAssignment_3_0_1
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
    // InternalLibrettoProjectProfile.g:3837:1: rule__GenUsageBlock__Group_3_1__0 : rule__GenUsageBlock__Group_3_1__0__Impl rule__GenUsageBlock__Group_3_1__1 ;
    public final void rule__GenUsageBlock__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3841:1: ( rule__GenUsageBlock__Group_3_1__0__Impl rule__GenUsageBlock__Group_3_1__1 )
            // InternalLibrettoProjectProfile.g:3842:2: rule__GenUsageBlock__Group_3_1__0__Impl rule__GenUsageBlock__Group_3_1__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalLibrettoProjectProfile.g:3849:1: rule__GenUsageBlock__Group_3_1__0__Impl : ( 'secondary' ) ;
    public final void rule__GenUsageBlock__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3853:1: ( ( 'secondary' ) )
            // InternalLibrettoProjectProfile.g:3854:1: ( 'secondary' )
            {
            // InternalLibrettoProjectProfile.g:3854:1: ( 'secondary' )
            // InternalLibrettoProjectProfile.g:3855:2: 'secondary'
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
    // InternalLibrettoProjectProfile.g:3864:1: rule__GenUsageBlock__Group_3_1__1 : rule__GenUsageBlock__Group_3_1__1__Impl ;
    public final void rule__GenUsageBlock__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3868:1: ( rule__GenUsageBlock__Group_3_1__1__Impl )
            // InternalLibrettoProjectProfile.g:3869:2: rule__GenUsageBlock__Group_3_1__1__Impl
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
    // InternalLibrettoProjectProfile.g:3875:1: rule__GenUsageBlock__Group_3_1__1__Impl : ( ( rule__GenUsageBlock__SecondaryProvidersAssignment_3_1_1 ) ) ;
    public final void rule__GenUsageBlock__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3879:1: ( ( ( rule__GenUsageBlock__SecondaryProvidersAssignment_3_1_1 ) ) )
            // InternalLibrettoProjectProfile.g:3880:1: ( ( rule__GenUsageBlock__SecondaryProvidersAssignment_3_1_1 ) )
            {
            // InternalLibrettoProjectProfile.g:3880:1: ( ( rule__GenUsageBlock__SecondaryProvidersAssignment_3_1_1 ) )
            // InternalLibrettoProjectProfile.g:3881:2: ( rule__GenUsageBlock__SecondaryProvidersAssignment_3_1_1 )
            {
             before(grammarAccess.getGenUsageBlockAccess().getSecondaryProvidersAssignment_3_1_1()); 
            // InternalLibrettoProjectProfile.g:3882:2: ( rule__GenUsageBlock__SecondaryProvidersAssignment_3_1_1 )
            // InternalLibrettoProjectProfile.g:3882:3: rule__GenUsageBlock__SecondaryProvidersAssignment_3_1_1
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
    // InternalLibrettoProjectProfile.g:3891:1: rule__GenEscalationBlock__Group__0 : rule__GenEscalationBlock__Group__0__Impl rule__GenEscalationBlock__Group__1 ;
    public final void rule__GenEscalationBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3895:1: ( rule__GenEscalationBlock__Group__0__Impl rule__GenEscalationBlock__Group__1 )
            // InternalLibrettoProjectProfile.g:3896:2: rule__GenEscalationBlock__Group__0__Impl rule__GenEscalationBlock__Group__1
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
    // InternalLibrettoProjectProfile.g:3903:1: rule__GenEscalationBlock__Group__0__Impl : ( () ) ;
    public final void rule__GenEscalationBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3907:1: ( ( () ) )
            // InternalLibrettoProjectProfile.g:3908:1: ( () )
            {
            // InternalLibrettoProjectProfile.g:3908:1: ( () )
            // InternalLibrettoProjectProfile.g:3909:2: ()
            {
             before(grammarAccess.getGenEscalationBlockAccess().getGenEscalationBlockAction_0()); 
            // InternalLibrettoProjectProfile.g:3910:2: ()
            // InternalLibrettoProjectProfile.g:3910:3: 
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
    // InternalLibrettoProjectProfile.g:3918:1: rule__GenEscalationBlock__Group__1 : rule__GenEscalationBlock__Group__1__Impl rule__GenEscalationBlock__Group__2 ;
    public final void rule__GenEscalationBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3922:1: ( rule__GenEscalationBlock__Group__1__Impl rule__GenEscalationBlock__Group__2 )
            // InternalLibrettoProjectProfile.g:3923:2: rule__GenEscalationBlock__Group__1__Impl rule__GenEscalationBlock__Group__2
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
    // InternalLibrettoProjectProfile.g:3930:1: rule__GenEscalationBlock__Group__1__Impl : ( 'escalation' ) ;
    public final void rule__GenEscalationBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3934:1: ( ( 'escalation' ) )
            // InternalLibrettoProjectProfile.g:3935:1: ( 'escalation' )
            {
            // InternalLibrettoProjectProfile.g:3935:1: ( 'escalation' )
            // InternalLibrettoProjectProfile.g:3936:2: 'escalation'
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
    // InternalLibrettoProjectProfile.g:3945:1: rule__GenEscalationBlock__Group__2 : rule__GenEscalationBlock__Group__2__Impl rule__GenEscalationBlock__Group__3 ;
    public final void rule__GenEscalationBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3949:1: ( rule__GenEscalationBlock__Group__2__Impl rule__GenEscalationBlock__Group__3 )
            // InternalLibrettoProjectProfile.g:3950:2: rule__GenEscalationBlock__Group__2__Impl rule__GenEscalationBlock__Group__3
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
    // InternalLibrettoProjectProfile.g:3957:1: rule__GenEscalationBlock__Group__2__Impl : ( '{' ) ;
    public final void rule__GenEscalationBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3961:1: ( ( '{' ) )
            // InternalLibrettoProjectProfile.g:3962:1: ( '{' )
            {
            // InternalLibrettoProjectProfile.g:3962:1: ( '{' )
            // InternalLibrettoProjectProfile.g:3963:2: '{'
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
    // InternalLibrettoProjectProfile.g:3972:1: rule__GenEscalationBlock__Group__3 : rule__GenEscalationBlock__Group__3__Impl rule__GenEscalationBlock__Group__4 ;
    public final void rule__GenEscalationBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3976:1: ( rule__GenEscalationBlock__Group__3__Impl rule__GenEscalationBlock__Group__4 )
            // InternalLibrettoProjectProfile.g:3977:2: rule__GenEscalationBlock__Group__3__Impl rule__GenEscalationBlock__Group__4
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
    // InternalLibrettoProjectProfile.g:3984:1: rule__GenEscalationBlock__Group__3__Impl : ( ( rule__GenEscalationBlock__Alternatives_3 )* ) ;
    public final void rule__GenEscalationBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3988:1: ( ( ( rule__GenEscalationBlock__Alternatives_3 )* ) )
            // InternalLibrettoProjectProfile.g:3989:1: ( ( rule__GenEscalationBlock__Alternatives_3 )* )
            {
            // InternalLibrettoProjectProfile.g:3989:1: ( ( rule__GenEscalationBlock__Alternatives_3 )* )
            // InternalLibrettoProjectProfile.g:3990:2: ( rule__GenEscalationBlock__Alternatives_3 )*
            {
             before(grammarAccess.getGenEscalationBlockAccess().getAlternatives_3()); 
            // InternalLibrettoProjectProfile.g:3991:2: ( rule__GenEscalationBlock__Alternatives_3 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=61 && LA31_0<=62)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:3991:3: rule__GenEscalationBlock__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_42);
            	    rule__GenEscalationBlock__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalLibrettoProjectProfile.g:3999:1: rule__GenEscalationBlock__Group__4 : rule__GenEscalationBlock__Group__4__Impl ;
    public final void rule__GenEscalationBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4003:1: ( rule__GenEscalationBlock__Group__4__Impl )
            // InternalLibrettoProjectProfile.g:4004:2: rule__GenEscalationBlock__Group__4__Impl
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
    // InternalLibrettoProjectProfile.g:4010:1: rule__GenEscalationBlock__Group__4__Impl : ( '}' ) ;
    public final void rule__GenEscalationBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4014:1: ( ( '}' ) )
            // InternalLibrettoProjectProfile.g:4015:1: ( '}' )
            {
            // InternalLibrettoProjectProfile.g:4015:1: ( '}' )
            // InternalLibrettoProjectProfile.g:4016:2: '}'
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
    // InternalLibrettoProjectProfile.g:4026:1: rule__GenEscalationBlock__Group_3_0__0 : rule__GenEscalationBlock__Group_3_0__0__Impl rule__GenEscalationBlock__Group_3_0__1 ;
    public final void rule__GenEscalationBlock__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4030:1: ( rule__GenEscalationBlock__Group_3_0__0__Impl rule__GenEscalationBlock__Group_3_0__1 )
            // InternalLibrettoProjectProfile.g:4031:2: rule__GenEscalationBlock__Group_3_0__0__Impl rule__GenEscalationBlock__Group_3_0__1
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
    // InternalLibrettoProjectProfile.g:4038:1: rule__GenEscalationBlock__Group_3_0__0__Impl : ( 'enabled' ) ;
    public final void rule__GenEscalationBlock__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4042:1: ( ( 'enabled' ) )
            // InternalLibrettoProjectProfile.g:4043:1: ( 'enabled' )
            {
            // InternalLibrettoProjectProfile.g:4043:1: ( 'enabled' )
            // InternalLibrettoProjectProfile.g:4044:2: 'enabled'
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
    // InternalLibrettoProjectProfile.g:4053:1: rule__GenEscalationBlock__Group_3_0__1 : rule__GenEscalationBlock__Group_3_0__1__Impl ;
    public final void rule__GenEscalationBlock__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4057:1: ( rule__GenEscalationBlock__Group_3_0__1__Impl )
            // InternalLibrettoProjectProfile.g:4058:2: rule__GenEscalationBlock__Group_3_0__1__Impl
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
    // InternalLibrettoProjectProfile.g:4064:1: rule__GenEscalationBlock__Group_3_0__1__Impl : ( ( rule__GenEscalationBlock__EnabledsAssignment_3_0_1 ) ) ;
    public final void rule__GenEscalationBlock__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4068:1: ( ( ( rule__GenEscalationBlock__EnabledsAssignment_3_0_1 ) ) )
            // InternalLibrettoProjectProfile.g:4069:1: ( ( rule__GenEscalationBlock__EnabledsAssignment_3_0_1 ) )
            {
            // InternalLibrettoProjectProfile.g:4069:1: ( ( rule__GenEscalationBlock__EnabledsAssignment_3_0_1 ) )
            // InternalLibrettoProjectProfile.g:4070:2: ( rule__GenEscalationBlock__EnabledsAssignment_3_0_1 )
            {
             before(grammarAccess.getGenEscalationBlockAccess().getEnabledsAssignment_3_0_1()); 
            // InternalLibrettoProjectProfile.g:4071:2: ( rule__GenEscalationBlock__EnabledsAssignment_3_0_1 )
            // InternalLibrettoProjectProfile.g:4071:3: rule__GenEscalationBlock__EnabledsAssignment_3_0_1
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
    // InternalLibrettoProjectProfile.g:4080:1: rule__GenEscalationBlock__Group_3_1__0 : rule__GenEscalationBlock__Group_3_1__0__Impl rule__GenEscalationBlock__Group_3_1__1 ;
    public final void rule__GenEscalationBlock__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4084:1: ( rule__GenEscalationBlock__Group_3_1__0__Impl rule__GenEscalationBlock__Group_3_1__1 )
            // InternalLibrettoProjectProfile.g:4085:2: rule__GenEscalationBlock__Group_3_1__0__Impl rule__GenEscalationBlock__Group_3_1__1
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
    // InternalLibrettoProjectProfile.g:4092:1: rule__GenEscalationBlock__Group_3_1__0__Impl : ( 'escalateAtRetry' ) ;
    public final void rule__GenEscalationBlock__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4096:1: ( ( 'escalateAtRetry' ) )
            // InternalLibrettoProjectProfile.g:4097:1: ( 'escalateAtRetry' )
            {
            // InternalLibrettoProjectProfile.g:4097:1: ( 'escalateAtRetry' )
            // InternalLibrettoProjectProfile.g:4098:2: 'escalateAtRetry'
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
    // InternalLibrettoProjectProfile.g:4107:1: rule__GenEscalationBlock__Group_3_1__1 : rule__GenEscalationBlock__Group_3_1__1__Impl ;
    public final void rule__GenEscalationBlock__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4111:1: ( rule__GenEscalationBlock__Group_3_1__1__Impl )
            // InternalLibrettoProjectProfile.g:4112:2: rule__GenEscalationBlock__Group_3_1__1__Impl
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
    // InternalLibrettoProjectProfile.g:4118:1: rule__GenEscalationBlock__Group_3_1__1__Impl : ( ( rule__GenEscalationBlock__EscalateAtRetriesAssignment_3_1_1 ) ) ;
    public final void rule__GenEscalationBlock__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4122:1: ( ( ( rule__GenEscalationBlock__EscalateAtRetriesAssignment_3_1_1 ) ) )
            // InternalLibrettoProjectProfile.g:4123:1: ( ( rule__GenEscalationBlock__EscalateAtRetriesAssignment_3_1_1 ) )
            {
            // InternalLibrettoProjectProfile.g:4123:1: ( ( rule__GenEscalationBlock__EscalateAtRetriesAssignment_3_1_1 ) )
            // InternalLibrettoProjectProfile.g:4124:2: ( rule__GenEscalationBlock__EscalateAtRetriesAssignment_3_1_1 )
            {
             before(grammarAccess.getGenEscalationBlockAccess().getEscalateAtRetriesAssignment_3_1_1()); 
            // InternalLibrettoProjectProfile.g:4125:2: ( rule__GenEscalationBlock__EscalateAtRetriesAssignment_3_1_1 )
            // InternalLibrettoProjectProfile.g:4125:3: rule__GenEscalationBlock__EscalateAtRetriesAssignment_3_1_1
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
    // InternalLibrettoProjectProfile.g:4134:1: rule__SurfaceBlock__Group__0 : rule__SurfaceBlock__Group__0__Impl rule__SurfaceBlock__Group__1 ;
    public final void rule__SurfaceBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4138:1: ( rule__SurfaceBlock__Group__0__Impl rule__SurfaceBlock__Group__1 )
            // InternalLibrettoProjectProfile.g:4139:2: rule__SurfaceBlock__Group__0__Impl rule__SurfaceBlock__Group__1
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
    // InternalLibrettoProjectProfile.g:4146:1: rule__SurfaceBlock__Group__0__Impl : ( () ) ;
    public final void rule__SurfaceBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4150:1: ( ( () ) )
            // InternalLibrettoProjectProfile.g:4151:1: ( () )
            {
            // InternalLibrettoProjectProfile.g:4151:1: ( () )
            // InternalLibrettoProjectProfile.g:4152:2: ()
            {
             before(grammarAccess.getSurfaceBlockAccess().getSurfaceBlockAction_0()); 
            // InternalLibrettoProjectProfile.g:4153:2: ()
            // InternalLibrettoProjectProfile.g:4153:3: 
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
    // InternalLibrettoProjectProfile.g:4161:1: rule__SurfaceBlock__Group__1 : rule__SurfaceBlock__Group__1__Impl rule__SurfaceBlock__Group__2 ;
    public final void rule__SurfaceBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4165:1: ( rule__SurfaceBlock__Group__1__Impl rule__SurfaceBlock__Group__2 )
            // InternalLibrettoProjectProfile.g:4166:2: rule__SurfaceBlock__Group__1__Impl rule__SurfaceBlock__Group__2
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
    // InternalLibrettoProjectProfile.g:4173:1: rule__SurfaceBlock__Group__1__Impl : ( 'surface' ) ;
    public final void rule__SurfaceBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4177:1: ( ( 'surface' ) )
            // InternalLibrettoProjectProfile.g:4178:1: ( 'surface' )
            {
            // InternalLibrettoProjectProfile.g:4178:1: ( 'surface' )
            // InternalLibrettoProjectProfile.g:4179:2: 'surface'
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
    // InternalLibrettoProjectProfile.g:4188:1: rule__SurfaceBlock__Group__2 : rule__SurfaceBlock__Group__2__Impl rule__SurfaceBlock__Group__3 ;
    public final void rule__SurfaceBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4192:1: ( rule__SurfaceBlock__Group__2__Impl rule__SurfaceBlock__Group__3 )
            // InternalLibrettoProjectProfile.g:4193:2: rule__SurfaceBlock__Group__2__Impl rule__SurfaceBlock__Group__3
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
    // InternalLibrettoProjectProfile.g:4200:1: rule__SurfaceBlock__Group__2__Impl : ( '{' ) ;
    public final void rule__SurfaceBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4204:1: ( ( '{' ) )
            // InternalLibrettoProjectProfile.g:4205:1: ( '{' )
            {
            // InternalLibrettoProjectProfile.g:4205:1: ( '{' )
            // InternalLibrettoProjectProfile.g:4206:2: '{'
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
    // InternalLibrettoProjectProfile.g:4215:1: rule__SurfaceBlock__Group__3 : rule__SurfaceBlock__Group__3__Impl rule__SurfaceBlock__Group__4 ;
    public final void rule__SurfaceBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4219:1: ( rule__SurfaceBlock__Group__3__Impl rule__SurfaceBlock__Group__4 )
            // InternalLibrettoProjectProfile.g:4220:2: rule__SurfaceBlock__Group__3__Impl rule__SurfaceBlock__Group__4
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
    // InternalLibrettoProjectProfile.g:4227:1: rule__SurfaceBlock__Group__3__Impl : ( ( rule__SurfaceBlock__ElementsAssignment_3 )* ) ;
    public final void rule__SurfaceBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4231:1: ( ( ( rule__SurfaceBlock__ElementsAssignment_3 )* ) )
            // InternalLibrettoProjectProfile.g:4232:1: ( ( rule__SurfaceBlock__ElementsAssignment_3 )* )
            {
            // InternalLibrettoProjectProfile.g:4232:1: ( ( rule__SurfaceBlock__ElementsAssignment_3 )* )
            // InternalLibrettoProjectProfile.g:4233:2: ( rule__SurfaceBlock__ElementsAssignment_3 )*
            {
             before(grammarAccess.getSurfaceBlockAccess().getElementsAssignment_3()); 
            // InternalLibrettoProjectProfile.g:4234:2: ( rule__SurfaceBlock__ElementsAssignment_3 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==64||LA32_0==66||LA32_0==70||LA32_0==72||LA32_0==74) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:4234:3: rule__SurfaceBlock__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_45);
            	    rule__SurfaceBlock__ElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalLibrettoProjectProfile.g:4242:1: rule__SurfaceBlock__Group__4 : rule__SurfaceBlock__Group__4__Impl ;
    public final void rule__SurfaceBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4246:1: ( rule__SurfaceBlock__Group__4__Impl )
            // InternalLibrettoProjectProfile.g:4247:2: rule__SurfaceBlock__Group__4__Impl
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
    // InternalLibrettoProjectProfile.g:4253:1: rule__SurfaceBlock__Group__4__Impl : ( '}' ) ;
    public final void rule__SurfaceBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4257:1: ( ( '}' ) )
            // InternalLibrettoProjectProfile.g:4258:1: ( '}' )
            {
            // InternalLibrettoProjectProfile.g:4258:1: ( '}' )
            // InternalLibrettoProjectProfile.g:4259:2: '}'
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
    // InternalLibrettoProjectProfile.g:4269:1: rule__ScopedSurface__Group__0 : rule__ScopedSurface__Group__0__Impl rule__ScopedSurface__Group__1 ;
    public final void rule__ScopedSurface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4273:1: ( rule__ScopedSurface__Group__0__Impl rule__ScopedSurface__Group__1 )
            // InternalLibrettoProjectProfile.g:4274:2: rule__ScopedSurface__Group__0__Impl rule__ScopedSurface__Group__1
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
    // InternalLibrettoProjectProfile.g:4281:1: rule__ScopedSurface__Group__0__Impl : ( 'for' ) ;
    public final void rule__ScopedSurface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4285:1: ( ( 'for' ) )
            // InternalLibrettoProjectProfile.g:4286:1: ( 'for' )
            {
            // InternalLibrettoProjectProfile.g:4286:1: ( 'for' )
            // InternalLibrettoProjectProfile.g:4287:2: 'for'
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
    // InternalLibrettoProjectProfile.g:4296:1: rule__ScopedSurface__Group__1 : rule__ScopedSurface__Group__1__Impl rule__ScopedSurface__Group__2 ;
    public final void rule__ScopedSurface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4300:1: ( rule__ScopedSurface__Group__1__Impl rule__ScopedSurface__Group__2 )
            // InternalLibrettoProjectProfile.g:4301:2: rule__ScopedSurface__Group__1__Impl rule__ScopedSurface__Group__2
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
    // InternalLibrettoProjectProfile.g:4308:1: rule__ScopedSurface__Group__1__Impl : ( ( rule__ScopedSurface__Alternatives_1 ) ) ;
    public final void rule__ScopedSurface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4312:1: ( ( ( rule__ScopedSurface__Alternatives_1 ) ) )
            // InternalLibrettoProjectProfile.g:4313:1: ( ( rule__ScopedSurface__Alternatives_1 ) )
            {
            // InternalLibrettoProjectProfile.g:4313:1: ( ( rule__ScopedSurface__Alternatives_1 ) )
            // InternalLibrettoProjectProfile.g:4314:2: ( rule__ScopedSurface__Alternatives_1 )
            {
             before(grammarAccess.getScopedSurfaceAccess().getAlternatives_1()); 
            // InternalLibrettoProjectProfile.g:4315:2: ( rule__ScopedSurface__Alternatives_1 )
            // InternalLibrettoProjectProfile.g:4315:3: rule__ScopedSurface__Alternatives_1
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
    // InternalLibrettoProjectProfile.g:4323:1: rule__ScopedSurface__Group__2 : rule__ScopedSurface__Group__2__Impl rule__ScopedSurface__Group__3 ;
    public final void rule__ScopedSurface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4327:1: ( rule__ScopedSurface__Group__2__Impl rule__ScopedSurface__Group__3 )
            // InternalLibrettoProjectProfile.g:4328:2: rule__ScopedSurface__Group__2__Impl rule__ScopedSurface__Group__3
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
    // InternalLibrettoProjectProfile.g:4335:1: rule__ScopedSurface__Group__2__Impl : ( '{' ) ;
    public final void rule__ScopedSurface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4339:1: ( ( '{' ) )
            // InternalLibrettoProjectProfile.g:4340:1: ( '{' )
            {
            // InternalLibrettoProjectProfile.g:4340:1: ( '{' )
            // InternalLibrettoProjectProfile.g:4341:2: '{'
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
    // InternalLibrettoProjectProfile.g:4350:1: rule__ScopedSurface__Group__3 : rule__ScopedSurface__Group__3__Impl rule__ScopedSurface__Group__4 ;
    public final void rule__ScopedSurface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4354:1: ( rule__ScopedSurface__Group__3__Impl rule__ScopedSurface__Group__4 )
            // InternalLibrettoProjectProfile.g:4355:2: rule__ScopedSurface__Group__3__Impl rule__ScopedSurface__Group__4
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
    // InternalLibrettoProjectProfile.g:4362:1: rule__ScopedSurface__Group__3__Impl : ( ( rule__ScopedSurface__RulesAssignment_3 )* ) ;
    public final void rule__ScopedSurface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4366:1: ( ( ( rule__ScopedSurface__RulesAssignment_3 )* ) )
            // InternalLibrettoProjectProfile.g:4367:1: ( ( rule__ScopedSurface__RulesAssignment_3 )* )
            {
            // InternalLibrettoProjectProfile.g:4367:1: ( ( rule__ScopedSurface__RulesAssignment_3 )* )
            // InternalLibrettoProjectProfile.g:4368:2: ( rule__ScopedSurface__RulesAssignment_3 )*
            {
             before(grammarAccess.getScopedSurfaceAccess().getRulesAssignment_3()); 
            // InternalLibrettoProjectProfile.g:4369:2: ( rule__ScopedSurface__RulesAssignment_3 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==66||LA33_0==70||LA33_0==72||LA33_0==74) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:4369:3: rule__ScopedSurface__RulesAssignment_3
            	    {
            	    pushFollow(FOLLOW_45);
            	    rule__ScopedSurface__RulesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // InternalLibrettoProjectProfile.g:4377:1: rule__ScopedSurface__Group__4 : rule__ScopedSurface__Group__4__Impl ;
    public final void rule__ScopedSurface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4381:1: ( rule__ScopedSurface__Group__4__Impl )
            // InternalLibrettoProjectProfile.g:4382:2: rule__ScopedSurface__Group__4__Impl
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
    // InternalLibrettoProjectProfile.g:4388:1: rule__ScopedSurface__Group__4__Impl : ( '}' ) ;
    public final void rule__ScopedSurface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4392:1: ( ( '}' ) )
            // InternalLibrettoProjectProfile.g:4393:1: ( '}' )
            {
            // InternalLibrettoProjectProfile.g:4393:1: ( '}' )
            // InternalLibrettoProjectProfile.g:4394:2: '}'
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
    // InternalLibrettoProjectProfile.g:4404:1: rule__ScopedSurface__Group_1_0__0 : rule__ScopedSurface__Group_1_0__0__Impl rule__ScopedSurface__Group_1_0__1 ;
    public final void rule__ScopedSurface__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4408:1: ( rule__ScopedSurface__Group_1_0__0__Impl rule__ScopedSurface__Group_1_0__1 )
            // InternalLibrettoProjectProfile.g:4409:2: rule__ScopedSurface__Group_1_0__0__Impl rule__ScopedSurface__Group_1_0__1
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
    // InternalLibrettoProjectProfile.g:4416:1: rule__ScopedSurface__Group_1_0__0__Impl : ( 'module' ) ;
    public final void rule__ScopedSurface__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4420:1: ( ( 'module' ) )
            // InternalLibrettoProjectProfile.g:4421:1: ( 'module' )
            {
            // InternalLibrettoProjectProfile.g:4421:1: ( 'module' )
            // InternalLibrettoProjectProfile.g:4422:2: 'module'
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
    // InternalLibrettoProjectProfile.g:4431:1: rule__ScopedSurface__Group_1_0__1 : rule__ScopedSurface__Group_1_0__1__Impl ;
    public final void rule__ScopedSurface__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4435:1: ( rule__ScopedSurface__Group_1_0__1__Impl )
            // InternalLibrettoProjectProfile.g:4436:2: rule__ScopedSurface__Group_1_0__1__Impl
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
    // InternalLibrettoProjectProfile.g:4442:1: rule__ScopedSurface__Group_1_0__1__Impl : ( ( rule__ScopedSurface__ModuleIdAssignment_1_0_1 ) ) ;
    public final void rule__ScopedSurface__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4446:1: ( ( ( rule__ScopedSurface__ModuleIdAssignment_1_0_1 ) ) )
            // InternalLibrettoProjectProfile.g:4447:1: ( ( rule__ScopedSurface__ModuleIdAssignment_1_0_1 ) )
            {
            // InternalLibrettoProjectProfile.g:4447:1: ( ( rule__ScopedSurface__ModuleIdAssignment_1_0_1 ) )
            // InternalLibrettoProjectProfile.g:4448:2: ( rule__ScopedSurface__ModuleIdAssignment_1_0_1 )
            {
             before(grammarAccess.getScopedSurfaceAccess().getModuleIdAssignment_1_0_1()); 
            // InternalLibrettoProjectProfile.g:4449:2: ( rule__ScopedSurface__ModuleIdAssignment_1_0_1 )
            // InternalLibrettoProjectProfile.g:4449:3: rule__ScopedSurface__ModuleIdAssignment_1_0_1
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
    // InternalLibrettoProjectProfile.g:4458:1: rule__ScopedSurface__Group_1_1__0 : rule__ScopedSurface__Group_1_1__0__Impl rule__ScopedSurface__Group_1_1__1 ;
    public final void rule__ScopedSurface__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4462:1: ( rule__ScopedSurface__Group_1_1__0__Impl rule__ScopedSurface__Group_1_1__1 )
            // InternalLibrettoProjectProfile.g:4463:2: rule__ScopedSurface__Group_1_1__0__Impl rule__ScopedSurface__Group_1_1__1
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
    // InternalLibrettoProjectProfile.g:4470:1: rule__ScopedSurface__Group_1_1__0__Impl : ( 'spec' ) ;
    public final void rule__ScopedSurface__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4474:1: ( ( 'spec' ) )
            // InternalLibrettoProjectProfile.g:4475:1: ( 'spec' )
            {
            // InternalLibrettoProjectProfile.g:4475:1: ( 'spec' )
            // InternalLibrettoProjectProfile.g:4476:2: 'spec'
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
    // InternalLibrettoProjectProfile.g:4485:1: rule__ScopedSurface__Group_1_1__1 : rule__ScopedSurface__Group_1_1__1__Impl ;
    public final void rule__ScopedSurface__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4489:1: ( rule__ScopedSurface__Group_1_1__1__Impl )
            // InternalLibrettoProjectProfile.g:4490:2: rule__ScopedSurface__Group_1_1__1__Impl
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
    // InternalLibrettoProjectProfile.g:4496:1: rule__ScopedSurface__Group_1_1__1__Impl : ( ( rule__ScopedSurface__SpecIdAssignment_1_1_1 ) ) ;
    public final void rule__ScopedSurface__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4500:1: ( ( ( rule__ScopedSurface__SpecIdAssignment_1_1_1 ) ) )
            // InternalLibrettoProjectProfile.g:4501:1: ( ( rule__ScopedSurface__SpecIdAssignment_1_1_1 ) )
            {
            // InternalLibrettoProjectProfile.g:4501:1: ( ( rule__ScopedSurface__SpecIdAssignment_1_1_1 ) )
            // InternalLibrettoProjectProfile.g:4502:2: ( rule__ScopedSurface__SpecIdAssignment_1_1_1 )
            {
             before(grammarAccess.getScopedSurfaceAccess().getSpecIdAssignment_1_1_1()); 
            // InternalLibrettoProjectProfile.g:4503:2: ( rule__ScopedSurface__SpecIdAssignment_1_1_1 )
            // InternalLibrettoProjectProfile.g:4503:3: rule__ScopedSurface__SpecIdAssignment_1_1_1
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
    // InternalLibrettoProjectProfile.g:4512:1: rule__ReturnTypeRule__Group__0 : rule__ReturnTypeRule__Group__0__Impl rule__ReturnTypeRule__Group__1 ;
    public final void rule__ReturnTypeRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4516:1: ( rule__ReturnTypeRule__Group__0__Impl rule__ReturnTypeRule__Group__1 )
            // InternalLibrettoProjectProfile.g:4517:2: rule__ReturnTypeRule__Group__0__Impl rule__ReturnTypeRule__Group__1
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
    // InternalLibrettoProjectProfile.g:4524:1: rule__ReturnTypeRule__Group__0__Impl : ( 'returnType' ) ;
    public final void rule__ReturnTypeRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4528:1: ( ( 'returnType' ) )
            // InternalLibrettoProjectProfile.g:4529:1: ( 'returnType' )
            {
            // InternalLibrettoProjectProfile.g:4529:1: ( 'returnType' )
            // InternalLibrettoProjectProfile.g:4530:2: 'returnType'
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
    // InternalLibrettoProjectProfile.g:4539:1: rule__ReturnTypeRule__Group__1 : rule__ReturnTypeRule__Group__1__Impl rule__ReturnTypeRule__Group__2 ;
    public final void rule__ReturnTypeRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4543:1: ( rule__ReturnTypeRule__Group__1__Impl rule__ReturnTypeRule__Group__2 )
            // InternalLibrettoProjectProfile.g:4544:2: rule__ReturnTypeRule__Group__1__Impl rule__ReturnTypeRule__Group__2
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
    // InternalLibrettoProjectProfile.g:4551:1: rule__ReturnTypeRule__Group__1__Impl : ( 'method' ) ;
    public final void rule__ReturnTypeRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4555:1: ( ( 'method' ) )
            // InternalLibrettoProjectProfile.g:4556:1: ( 'method' )
            {
            // InternalLibrettoProjectProfile.g:4556:1: ( 'method' )
            // InternalLibrettoProjectProfile.g:4557:2: 'method'
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
    // InternalLibrettoProjectProfile.g:4566:1: rule__ReturnTypeRule__Group__2 : rule__ReturnTypeRule__Group__2__Impl rule__ReturnTypeRule__Group__3 ;
    public final void rule__ReturnTypeRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4570:1: ( rule__ReturnTypeRule__Group__2__Impl rule__ReturnTypeRule__Group__3 )
            // InternalLibrettoProjectProfile.g:4571:2: rule__ReturnTypeRule__Group__2__Impl rule__ReturnTypeRule__Group__3
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
    // InternalLibrettoProjectProfile.g:4578:1: rule__ReturnTypeRule__Group__2__Impl : ( ( rule__ReturnTypeRule__NameAssignment_2 ) ) ;
    public final void rule__ReturnTypeRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4582:1: ( ( ( rule__ReturnTypeRule__NameAssignment_2 ) ) )
            // InternalLibrettoProjectProfile.g:4583:1: ( ( rule__ReturnTypeRule__NameAssignment_2 ) )
            {
            // InternalLibrettoProjectProfile.g:4583:1: ( ( rule__ReturnTypeRule__NameAssignment_2 ) )
            // InternalLibrettoProjectProfile.g:4584:2: ( rule__ReturnTypeRule__NameAssignment_2 )
            {
             before(grammarAccess.getReturnTypeRuleAccess().getNameAssignment_2()); 
            // InternalLibrettoProjectProfile.g:4585:2: ( rule__ReturnTypeRule__NameAssignment_2 )
            // InternalLibrettoProjectProfile.g:4585:3: rule__ReturnTypeRule__NameAssignment_2
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
    // InternalLibrettoProjectProfile.g:4593:1: rule__ReturnTypeRule__Group__3 : rule__ReturnTypeRule__Group__3__Impl rule__ReturnTypeRule__Group__4 ;
    public final void rule__ReturnTypeRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4597:1: ( rule__ReturnTypeRule__Group__3__Impl rule__ReturnTypeRule__Group__4 )
            // InternalLibrettoProjectProfile.g:4598:2: rule__ReturnTypeRule__Group__3__Impl rule__ReturnTypeRule__Group__4
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
    // InternalLibrettoProjectProfile.g:4605:1: rule__ReturnTypeRule__Group__3__Impl : ( 'as' ) ;
    public final void rule__ReturnTypeRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4609:1: ( ( 'as' ) )
            // InternalLibrettoProjectProfile.g:4610:1: ( 'as' )
            {
            // InternalLibrettoProjectProfile.g:4610:1: ( 'as' )
            // InternalLibrettoProjectProfile.g:4611:2: 'as'
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
    // InternalLibrettoProjectProfile.g:4620:1: rule__ReturnTypeRule__Group__4 : rule__ReturnTypeRule__Group__4__Impl rule__ReturnTypeRule__Group__5 ;
    public final void rule__ReturnTypeRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4624:1: ( rule__ReturnTypeRule__Group__4__Impl rule__ReturnTypeRule__Group__5 )
            // InternalLibrettoProjectProfile.g:4625:2: rule__ReturnTypeRule__Group__4__Impl rule__ReturnTypeRule__Group__5
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
    // InternalLibrettoProjectProfile.g:4632:1: rule__ReturnTypeRule__Group__4__Impl : ( ( rule__ReturnTypeRule__JavaTypeAssignment_4 ) ) ;
    public final void rule__ReturnTypeRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4636:1: ( ( ( rule__ReturnTypeRule__JavaTypeAssignment_4 ) ) )
            // InternalLibrettoProjectProfile.g:4637:1: ( ( rule__ReturnTypeRule__JavaTypeAssignment_4 ) )
            {
            // InternalLibrettoProjectProfile.g:4637:1: ( ( rule__ReturnTypeRule__JavaTypeAssignment_4 ) )
            // InternalLibrettoProjectProfile.g:4638:2: ( rule__ReturnTypeRule__JavaTypeAssignment_4 )
            {
             before(grammarAccess.getReturnTypeRuleAccess().getJavaTypeAssignment_4()); 
            // InternalLibrettoProjectProfile.g:4639:2: ( rule__ReturnTypeRule__JavaTypeAssignment_4 )
            // InternalLibrettoProjectProfile.g:4639:3: rule__ReturnTypeRule__JavaTypeAssignment_4
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
    // InternalLibrettoProjectProfile.g:4647:1: rule__ReturnTypeRule__Group__5 : rule__ReturnTypeRule__Group__5__Impl ;
    public final void rule__ReturnTypeRule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4651:1: ( rule__ReturnTypeRule__Group__5__Impl )
            // InternalLibrettoProjectProfile.g:4652:2: rule__ReturnTypeRule__Group__5__Impl
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
    // InternalLibrettoProjectProfile.g:4658:1: rule__ReturnTypeRule__Group__5__Impl : ( ( ';' )? ) ;
    public final void rule__ReturnTypeRule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4662:1: ( ( ( ';' )? ) )
            // InternalLibrettoProjectProfile.g:4663:1: ( ( ';' )? )
            {
            // InternalLibrettoProjectProfile.g:4663:1: ( ( ';' )? )
            // InternalLibrettoProjectProfile.g:4664:2: ( ';' )?
            {
             before(grammarAccess.getReturnTypeRuleAccess().getSemicolonKeyword_5()); 
            // InternalLibrettoProjectProfile.g:4665:2: ( ';' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==69) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:4665:3: ';'
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
    // InternalLibrettoProjectProfile.g:4674:1: rule__ParamTypeRule__Group__0 : rule__ParamTypeRule__Group__0__Impl rule__ParamTypeRule__Group__1 ;
    public final void rule__ParamTypeRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4678:1: ( rule__ParamTypeRule__Group__0__Impl rule__ParamTypeRule__Group__1 )
            // InternalLibrettoProjectProfile.g:4679:2: rule__ParamTypeRule__Group__0__Impl rule__ParamTypeRule__Group__1
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
    // InternalLibrettoProjectProfile.g:4686:1: rule__ParamTypeRule__Group__0__Impl : ( 'paramType' ) ;
    public final void rule__ParamTypeRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4690:1: ( ( 'paramType' ) )
            // InternalLibrettoProjectProfile.g:4691:1: ( 'paramType' )
            {
            // InternalLibrettoProjectProfile.g:4691:1: ( 'paramType' )
            // InternalLibrettoProjectProfile.g:4692:2: 'paramType'
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
    // InternalLibrettoProjectProfile.g:4701:1: rule__ParamTypeRule__Group__1 : rule__ParamTypeRule__Group__1__Impl rule__ParamTypeRule__Group__2 ;
    public final void rule__ParamTypeRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4705:1: ( rule__ParamTypeRule__Group__1__Impl rule__ParamTypeRule__Group__2 )
            // InternalLibrettoProjectProfile.g:4706:2: rule__ParamTypeRule__Group__1__Impl rule__ParamTypeRule__Group__2
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
    // InternalLibrettoProjectProfile.g:4713:1: rule__ParamTypeRule__Group__1__Impl : ( 'name' ) ;
    public final void rule__ParamTypeRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4717:1: ( ( 'name' ) )
            // InternalLibrettoProjectProfile.g:4718:1: ( 'name' )
            {
            // InternalLibrettoProjectProfile.g:4718:1: ( 'name' )
            // InternalLibrettoProjectProfile.g:4719:2: 'name'
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
    // InternalLibrettoProjectProfile.g:4728:1: rule__ParamTypeRule__Group__2 : rule__ParamTypeRule__Group__2__Impl rule__ParamTypeRule__Group__3 ;
    public final void rule__ParamTypeRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4732:1: ( rule__ParamTypeRule__Group__2__Impl rule__ParamTypeRule__Group__3 )
            // InternalLibrettoProjectProfile.g:4733:2: rule__ParamTypeRule__Group__2__Impl rule__ParamTypeRule__Group__3
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
    // InternalLibrettoProjectProfile.g:4740:1: rule__ParamTypeRule__Group__2__Impl : ( ( rule__ParamTypeRule__ParamNameAssignment_2 ) ) ;
    public final void rule__ParamTypeRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4744:1: ( ( ( rule__ParamTypeRule__ParamNameAssignment_2 ) ) )
            // InternalLibrettoProjectProfile.g:4745:1: ( ( rule__ParamTypeRule__ParamNameAssignment_2 ) )
            {
            // InternalLibrettoProjectProfile.g:4745:1: ( ( rule__ParamTypeRule__ParamNameAssignment_2 ) )
            // InternalLibrettoProjectProfile.g:4746:2: ( rule__ParamTypeRule__ParamNameAssignment_2 )
            {
             before(grammarAccess.getParamTypeRuleAccess().getParamNameAssignment_2()); 
            // InternalLibrettoProjectProfile.g:4747:2: ( rule__ParamTypeRule__ParamNameAssignment_2 )
            // InternalLibrettoProjectProfile.g:4747:3: rule__ParamTypeRule__ParamNameAssignment_2
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
    // InternalLibrettoProjectProfile.g:4755:1: rule__ParamTypeRule__Group__3 : rule__ParamTypeRule__Group__3__Impl rule__ParamTypeRule__Group__4 ;
    public final void rule__ParamTypeRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4759:1: ( rule__ParamTypeRule__Group__3__Impl rule__ParamTypeRule__Group__4 )
            // InternalLibrettoProjectProfile.g:4760:2: rule__ParamTypeRule__Group__3__Impl rule__ParamTypeRule__Group__4
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
    // InternalLibrettoProjectProfile.g:4767:1: rule__ParamTypeRule__Group__3__Impl : ( 'as' ) ;
    public final void rule__ParamTypeRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4771:1: ( ( 'as' ) )
            // InternalLibrettoProjectProfile.g:4772:1: ( 'as' )
            {
            // InternalLibrettoProjectProfile.g:4772:1: ( 'as' )
            // InternalLibrettoProjectProfile.g:4773:2: 'as'
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
    // InternalLibrettoProjectProfile.g:4782:1: rule__ParamTypeRule__Group__4 : rule__ParamTypeRule__Group__4__Impl rule__ParamTypeRule__Group__5 ;
    public final void rule__ParamTypeRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4786:1: ( rule__ParamTypeRule__Group__4__Impl rule__ParamTypeRule__Group__5 )
            // InternalLibrettoProjectProfile.g:4787:2: rule__ParamTypeRule__Group__4__Impl rule__ParamTypeRule__Group__5
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
    // InternalLibrettoProjectProfile.g:4794:1: rule__ParamTypeRule__Group__4__Impl : ( ( rule__ParamTypeRule__JavaTypeAssignment_4 ) ) ;
    public final void rule__ParamTypeRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4798:1: ( ( ( rule__ParamTypeRule__JavaTypeAssignment_4 ) ) )
            // InternalLibrettoProjectProfile.g:4799:1: ( ( rule__ParamTypeRule__JavaTypeAssignment_4 ) )
            {
            // InternalLibrettoProjectProfile.g:4799:1: ( ( rule__ParamTypeRule__JavaTypeAssignment_4 ) )
            // InternalLibrettoProjectProfile.g:4800:2: ( rule__ParamTypeRule__JavaTypeAssignment_4 )
            {
             before(grammarAccess.getParamTypeRuleAccess().getJavaTypeAssignment_4()); 
            // InternalLibrettoProjectProfile.g:4801:2: ( rule__ParamTypeRule__JavaTypeAssignment_4 )
            // InternalLibrettoProjectProfile.g:4801:3: rule__ParamTypeRule__JavaTypeAssignment_4
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
    // InternalLibrettoProjectProfile.g:4809:1: rule__ParamTypeRule__Group__5 : rule__ParamTypeRule__Group__5__Impl ;
    public final void rule__ParamTypeRule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4813:1: ( rule__ParamTypeRule__Group__5__Impl )
            // InternalLibrettoProjectProfile.g:4814:2: rule__ParamTypeRule__Group__5__Impl
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
    // InternalLibrettoProjectProfile.g:4820:1: rule__ParamTypeRule__Group__5__Impl : ( ( ';' )? ) ;
    public final void rule__ParamTypeRule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4824:1: ( ( ( ';' )? ) )
            // InternalLibrettoProjectProfile.g:4825:1: ( ( ';' )? )
            {
            // InternalLibrettoProjectProfile.g:4825:1: ( ( ';' )? )
            // InternalLibrettoProjectProfile.g:4826:2: ( ';' )?
            {
             before(grammarAccess.getParamTypeRuleAccess().getSemicolonKeyword_5()); 
            // InternalLibrettoProjectProfile.g:4827:2: ( ';' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==69) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:4827:3: ';'
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
    // InternalLibrettoProjectProfile.g:4836:1: rule__RecordSelfReturnRule__Group__0 : rule__RecordSelfReturnRule__Group__0__Impl rule__RecordSelfReturnRule__Group__1 ;
    public final void rule__RecordSelfReturnRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4840:1: ( rule__RecordSelfReturnRule__Group__0__Impl rule__RecordSelfReturnRule__Group__1 )
            // InternalLibrettoProjectProfile.g:4841:2: rule__RecordSelfReturnRule__Group__0__Impl rule__RecordSelfReturnRule__Group__1
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
    // InternalLibrettoProjectProfile.g:4848:1: rule__RecordSelfReturnRule__Group__0__Impl : ( 'recordSelfReturn' ) ;
    public final void rule__RecordSelfReturnRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4852:1: ( ( 'recordSelfReturn' ) )
            // InternalLibrettoProjectProfile.g:4853:1: ( 'recordSelfReturn' )
            {
            // InternalLibrettoProjectProfile.g:4853:1: ( 'recordSelfReturn' )
            // InternalLibrettoProjectProfile.g:4854:2: 'recordSelfReturn'
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
    // InternalLibrettoProjectProfile.g:4863:1: rule__RecordSelfReturnRule__Group__1 : rule__RecordSelfReturnRule__Group__1__Impl rule__RecordSelfReturnRule__Group__2 ;
    public final void rule__RecordSelfReturnRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4867:1: ( rule__RecordSelfReturnRule__Group__1__Impl rule__RecordSelfReturnRule__Group__2 )
            // InternalLibrettoProjectProfile.g:4868:2: rule__RecordSelfReturnRule__Group__1__Impl rule__RecordSelfReturnRule__Group__2
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
    // InternalLibrettoProjectProfile.g:4875:1: rule__RecordSelfReturnRule__Group__1__Impl : ( ( rule__RecordSelfReturnRule__MethodsAssignment_1 ) ) ;
    public final void rule__RecordSelfReturnRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4879:1: ( ( ( rule__RecordSelfReturnRule__MethodsAssignment_1 ) ) )
            // InternalLibrettoProjectProfile.g:4880:1: ( ( rule__RecordSelfReturnRule__MethodsAssignment_1 ) )
            {
            // InternalLibrettoProjectProfile.g:4880:1: ( ( rule__RecordSelfReturnRule__MethodsAssignment_1 ) )
            // InternalLibrettoProjectProfile.g:4881:2: ( rule__RecordSelfReturnRule__MethodsAssignment_1 )
            {
             before(grammarAccess.getRecordSelfReturnRuleAccess().getMethodsAssignment_1()); 
            // InternalLibrettoProjectProfile.g:4882:2: ( rule__RecordSelfReturnRule__MethodsAssignment_1 )
            // InternalLibrettoProjectProfile.g:4882:3: rule__RecordSelfReturnRule__MethodsAssignment_1
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
    // InternalLibrettoProjectProfile.g:4890:1: rule__RecordSelfReturnRule__Group__2 : rule__RecordSelfReturnRule__Group__2__Impl rule__RecordSelfReturnRule__Group__3 ;
    public final void rule__RecordSelfReturnRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4894:1: ( rule__RecordSelfReturnRule__Group__2__Impl rule__RecordSelfReturnRule__Group__3 )
            // InternalLibrettoProjectProfile.g:4895:2: rule__RecordSelfReturnRule__Group__2__Impl rule__RecordSelfReturnRule__Group__3
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
    // InternalLibrettoProjectProfile.g:4902:1: rule__RecordSelfReturnRule__Group__2__Impl : ( ( rule__RecordSelfReturnRule__Group_2__0 )* ) ;
    public final void rule__RecordSelfReturnRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4906:1: ( ( ( rule__RecordSelfReturnRule__Group_2__0 )* ) )
            // InternalLibrettoProjectProfile.g:4907:1: ( ( rule__RecordSelfReturnRule__Group_2__0 )* )
            {
            // InternalLibrettoProjectProfile.g:4907:1: ( ( rule__RecordSelfReturnRule__Group_2__0 )* )
            // InternalLibrettoProjectProfile.g:4908:2: ( rule__RecordSelfReturnRule__Group_2__0 )*
            {
             before(grammarAccess.getRecordSelfReturnRuleAccess().getGroup_2()); 
            // InternalLibrettoProjectProfile.g:4909:2: ( rule__RecordSelfReturnRule__Group_2__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==73) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:4909:3: rule__RecordSelfReturnRule__Group_2__0
            	    {
            	    pushFollow(FOLLOW_53);
            	    rule__RecordSelfReturnRule__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
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
    // InternalLibrettoProjectProfile.g:4917:1: rule__RecordSelfReturnRule__Group__3 : rule__RecordSelfReturnRule__Group__3__Impl ;
    public final void rule__RecordSelfReturnRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4921:1: ( rule__RecordSelfReturnRule__Group__3__Impl )
            // InternalLibrettoProjectProfile.g:4922:2: rule__RecordSelfReturnRule__Group__3__Impl
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
    // InternalLibrettoProjectProfile.g:4928:1: rule__RecordSelfReturnRule__Group__3__Impl : ( ( ';' )? ) ;
    public final void rule__RecordSelfReturnRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4932:1: ( ( ( ';' )? ) )
            // InternalLibrettoProjectProfile.g:4933:1: ( ( ';' )? )
            {
            // InternalLibrettoProjectProfile.g:4933:1: ( ( ';' )? )
            // InternalLibrettoProjectProfile.g:4934:2: ( ';' )?
            {
             before(grammarAccess.getRecordSelfReturnRuleAccess().getSemicolonKeyword_3()); 
            // InternalLibrettoProjectProfile.g:4935:2: ( ';' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==69) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:4935:3: ';'
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
    // InternalLibrettoProjectProfile.g:4944:1: rule__RecordSelfReturnRule__Group_2__0 : rule__RecordSelfReturnRule__Group_2__0__Impl rule__RecordSelfReturnRule__Group_2__1 ;
    public final void rule__RecordSelfReturnRule__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4948:1: ( rule__RecordSelfReturnRule__Group_2__0__Impl rule__RecordSelfReturnRule__Group_2__1 )
            // InternalLibrettoProjectProfile.g:4949:2: rule__RecordSelfReturnRule__Group_2__0__Impl rule__RecordSelfReturnRule__Group_2__1
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
    // InternalLibrettoProjectProfile.g:4956:1: rule__RecordSelfReturnRule__Group_2__0__Impl : ( ',' ) ;
    public final void rule__RecordSelfReturnRule__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4960:1: ( ( ',' ) )
            // InternalLibrettoProjectProfile.g:4961:1: ( ',' )
            {
            // InternalLibrettoProjectProfile.g:4961:1: ( ',' )
            // InternalLibrettoProjectProfile.g:4962:2: ','
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
    // InternalLibrettoProjectProfile.g:4971:1: rule__RecordSelfReturnRule__Group_2__1 : rule__RecordSelfReturnRule__Group_2__1__Impl ;
    public final void rule__RecordSelfReturnRule__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4975:1: ( rule__RecordSelfReturnRule__Group_2__1__Impl )
            // InternalLibrettoProjectProfile.g:4976:2: rule__RecordSelfReturnRule__Group_2__1__Impl
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
    // InternalLibrettoProjectProfile.g:4982:1: rule__RecordSelfReturnRule__Group_2__1__Impl : ( ( rule__RecordSelfReturnRule__MethodsAssignment_2_1 ) ) ;
    public final void rule__RecordSelfReturnRule__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:4986:1: ( ( ( rule__RecordSelfReturnRule__MethodsAssignment_2_1 ) ) )
            // InternalLibrettoProjectProfile.g:4987:1: ( ( rule__RecordSelfReturnRule__MethodsAssignment_2_1 ) )
            {
            // InternalLibrettoProjectProfile.g:4987:1: ( ( rule__RecordSelfReturnRule__MethodsAssignment_2_1 ) )
            // InternalLibrettoProjectProfile.g:4988:2: ( rule__RecordSelfReturnRule__MethodsAssignment_2_1 )
            {
             before(grammarAccess.getRecordSelfReturnRuleAccess().getMethodsAssignment_2_1()); 
            // InternalLibrettoProjectProfile.g:4989:2: ( rule__RecordSelfReturnRule__MethodsAssignment_2_1 )
            // InternalLibrettoProjectProfile.g:4989:3: rule__RecordSelfReturnRule__MethodsAssignment_2_1
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
    // InternalLibrettoProjectProfile.g:4998:1: rule__MethodOverrideRule__Group__0 : rule__MethodOverrideRule__Group__0__Impl rule__MethodOverrideRule__Group__1 ;
    public final void rule__MethodOverrideRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5002:1: ( rule__MethodOverrideRule__Group__0__Impl rule__MethodOverrideRule__Group__1 )
            // InternalLibrettoProjectProfile.g:5003:2: rule__MethodOverrideRule__Group__0__Impl rule__MethodOverrideRule__Group__1
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
    // InternalLibrettoProjectProfile.g:5010:1: rule__MethodOverrideRule__Group__0__Impl : ( 'methodOverride' ) ;
    public final void rule__MethodOverrideRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5014:1: ( ( 'methodOverride' ) )
            // InternalLibrettoProjectProfile.g:5015:1: ( 'methodOverride' )
            {
            // InternalLibrettoProjectProfile.g:5015:1: ( 'methodOverride' )
            // InternalLibrettoProjectProfile.g:5016:2: 'methodOverride'
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
    // InternalLibrettoProjectProfile.g:5025:1: rule__MethodOverrideRule__Group__1 : rule__MethodOverrideRule__Group__1__Impl rule__MethodOverrideRule__Group__2 ;
    public final void rule__MethodOverrideRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5029:1: ( rule__MethodOverrideRule__Group__1__Impl rule__MethodOverrideRule__Group__2 )
            // InternalLibrettoProjectProfile.g:5030:2: rule__MethodOverrideRule__Group__1__Impl rule__MethodOverrideRule__Group__2
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
    // InternalLibrettoProjectProfile.g:5037:1: rule__MethodOverrideRule__Group__1__Impl : ( ( rule__MethodOverrideRule__SignatureAssignment_1 ) ) ;
    public final void rule__MethodOverrideRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5041:1: ( ( ( rule__MethodOverrideRule__SignatureAssignment_1 ) ) )
            // InternalLibrettoProjectProfile.g:5042:1: ( ( rule__MethodOverrideRule__SignatureAssignment_1 ) )
            {
            // InternalLibrettoProjectProfile.g:5042:1: ( ( rule__MethodOverrideRule__SignatureAssignment_1 ) )
            // InternalLibrettoProjectProfile.g:5043:2: ( rule__MethodOverrideRule__SignatureAssignment_1 )
            {
             before(grammarAccess.getMethodOverrideRuleAccess().getSignatureAssignment_1()); 
            // InternalLibrettoProjectProfile.g:5044:2: ( rule__MethodOverrideRule__SignatureAssignment_1 )
            // InternalLibrettoProjectProfile.g:5044:3: rule__MethodOverrideRule__SignatureAssignment_1
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
    // InternalLibrettoProjectProfile.g:5052:1: rule__MethodOverrideRule__Group__2 : rule__MethodOverrideRule__Group__2__Impl rule__MethodOverrideRule__Group__3 ;
    public final void rule__MethodOverrideRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5056:1: ( rule__MethodOverrideRule__Group__2__Impl rule__MethodOverrideRule__Group__3 )
            // InternalLibrettoProjectProfile.g:5057:2: rule__MethodOverrideRule__Group__2__Impl rule__MethodOverrideRule__Group__3
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
    // InternalLibrettoProjectProfile.g:5064:1: rule__MethodOverrideRule__Group__2__Impl : ( 'returns' ) ;
    public final void rule__MethodOverrideRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5068:1: ( ( 'returns' ) )
            // InternalLibrettoProjectProfile.g:5069:1: ( 'returns' )
            {
            // InternalLibrettoProjectProfile.g:5069:1: ( 'returns' )
            // InternalLibrettoProjectProfile.g:5070:2: 'returns'
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
    // InternalLibrettoProjectProfile.g:5079:1: rule__MethodOverrideRule__Group__3 : rule__MethodOverrideRule__Group__3__Impl rule__MethodOverrideRule__Group__4 ;
    public final void rule__MethodOverrideRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5083:1: ( rule__MethodOverrideRule__Group__3__Impl rule__MethodOverrideRule__Group__4 )
            // InternalLibrettoProjectProfile.g:5084:2: rule__MethodOverrideRule__Group__3__Impl rule__MethodOverrideRule__Group__4
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
    // InternalLibrettoProjectProfile.g:5091:1: rule__MethodOverrideRule__Group__3__Impl : ( ( rule__MethodOverrideRule__JavaTypeAssignment_3 ) ) ;
    public final void rule__MethodOverrideRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5095:1: ( ( ( rule__MethodOverrideRule__JavaTypeAssignment_3 ) ) )
            // InternalLibrettoProjectProfile.g:5096:1: ( ( rule__MethodOverrideRule__JavaTypeAssignment_3 ) )
            {
            // InternalLibrettoProjectProfile.g:5096:1: ( ( rule__MethodOverrideRule__JavaTypeAssignment_3 ) )
            // InternalLibrettoProjectProfile.g:5097:2: ( rule__MethodOverrideRule__JavaTypeAssignment_3 )
            {
             before(grammarAccess.getMethodOverrideRuleAccess().getJavaTypeAssignment_3()); 
            // InternalLibrettoProjectProfile.g:5098:2: ( rule__MethodOverrideRule__JavaTypeAssignment_3 )
            // InternalLibrettoProjectProfile.g:5098:3: rule__MethodOverrideRule__JavaTypeAssignment_3
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
    // InternalLibrettoProjectProfile.g:5106:1: rule__MethodOverrideRule__Group__4 : rule__MethodOverrideRule__Group__4__Impl ;
    public final void rule__MethodOverrideRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5110:1: ( rule__MethodOverrideRule__Group__4__Impl )
            // InternalLibrettoProjectProfile.g:5111:2: rule__MethodOverrideRule__Group__4__Impl
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
    // InternalLibrettoProjectProfile.g:5117:1: rule__MethodOverrideRule__Group__4__Impl : ( ( ';' )? ) ;
    public final void rule__MethodOverrideRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5121:1: ( ( ( ';' )? ) )
            // InternalLibrettoProjectProfile.g:5122:1: ( ( ';' )? )
            {
            // InternalLibrettoProjectProfile.g:5122:1: ( ( ';' )? )
            // InternalLibrettoProjectProfile.g:5123:2: ( ';' )?
            {
             before(grammarAccess.getMethodOverrideRuleAccess().getSemicolonKeyword_4()); 
            // InternalLibrettoProjectProfile.g:5124:2: ( ';' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==69) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:5124:3: ';'
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
    // InternalLibrettoProjectProfile.g:5133:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5137:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalLibrettoProjectProfile.g:5138:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
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
    // InternalLibrettoProjectProfile.g:5145:1: rule__QualifiedName__Group__0__Impl : ( ( rule__QualifiedName__SegmentsAssignment_0 ) ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5149:1: ( ( ( rule__QualifiedName__SegmentsAssignment_0 ) ) )
            // InternalLibrettoProjectProfile.g:5150:1: ( ( rule__QualifiedName__SegmentsAssignment_0 ) )
            {
            // InternalLibrettoProjectProfile.g:5150:1: ( ( rule__QualifiedName__SegmentsAssignment_0 ) )
            // InternalLibrettoProjectProfile.g:5151:2: ( rule__QualifiedName__SegmentsAssignment_0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getSegmentsAssignment_0()); 
            // InternalLibrettoProjectProfile.g:5152:2: ( rule__QualifiedName__SegmentsAssignment_0 )
            // InternalLibrettoProjectProfile.g:5152:3: rule__QualifiedName__SegmentsAssignment_0
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
    // InternalLibrettoProjectProfile.g:5160:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5164:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalLibrettoProjectProfile.g:5165:2: rule__QualifiedName__Group__1__Impl
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
    // InternalLibrettoProjectProfile.g:5171:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5175:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalLibrettoProjectProfile.g:5176:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalLibrettoProjectProfile.g:5176:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalLibrettoProjectProfile.g:5177:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalLibrettoProjectProfile.g:5178:2: ( rule__QualifiedName__Group_1__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==25) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:5178:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_56);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
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
    // InternalLibrettoProjectProfile.g:5187:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5191:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalLibrettoProjectProfile.g:5192:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalLibrettoProjectProfile.g:5199:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5203:1: ( ( '.' ) )
            // InternalLibrettoProjectProfile.g:5204:1: ( '.' )
            {
            // InternalLibrettoProjectProfile.g:5204:1: ( '.' )
            // InternalLibrettoProjectProfile.g:5205:2: '.'
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
    // InternalLibrettoProjectProfile.g:5214:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5218:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalLibrettoProjectProfile.g:5219:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalLibrettoProjectProfile.g:5225:1: rule__QualifiedName__Group_1__1__Impl : ( ( rule__QualifiedName__SegmentsAssignment_1_1 ) ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5229:1: ( ( ( rule__QualifiedName__SegmentsAssignment_1_1 ) ) )
            // InternalLibrettoProjectProfile.g:5230:1: ( ( rule__QualifiedName__SegmentsAssignment_1_1 ) )
            {
            // InternalLibrettoProjectProfile.g:5230:1: ( ( rule__QualifiedName__SegmentsAssignment_1_1 ) )
            // InternalLibrettoProjectProfile.g:5231:2: ( rule__QualifiedName__SegmentsAssignment_1_1 )
            {
             before(grammarAccess.getQualifiedNameAccess().getSegmentsAssignment_1_1()); 
            // InternalLibrettoProjectProfile.g:5232:2: ( rule__QualifiedName__SegmentsAssignment_1_1 )
            // InternalLibrettoProjectProfile.g:5232:3: rule__QualifiedName__SegmentsAssignment_1_1
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
    // InternalLibrettoProjectProfile.g:5241:1: rule__OperationSignature__Group__0 : rule__OperationSignature__Group__0__Impl rule__OperationSignature__Group__1 ;
    public final void rule__OperationSignature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5245:1: ( rule__OperationSignature__Group__0__Impl rule__OperationSignature__Group__1 )
            // InternalLibrettoProjectProfile.g:5246:2: rule__OperationSignature__Group__0__Impl rule__OperationSignature__Group__1
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
    // InternalLibrettoProjectProfile.g:5253:1: rule__OperationSignature__Group__0__Impl : ( ( rule__OperationSignature__NameAssignment_0 ) ) ;
    public final void rule__OperationSignature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5257:1: ( ( ( rule__OperationSignature__NameAssignment_0 ) ) )
            // InternalLibrettoProjectProfile.g:5258:1: ( ( rule__OperationSignature__NameAssignment_0 ) )
            {
            // InternalLibrettoProjectProfile.g:5258:1: ( ( rule__OperationSignature__NameAssignment_0 ) )
            // InternalLibrettoProjectProfile.g:5259:2: ( rule__OperationSignature__NameAssignment_0 )
            {
             before(grammarAccess.getOperationSignatureAccess().getNameAssignment_0()); 
            // InternalLibrettoProjectProfile.g:5260:2: ( rule__OperationSignature__NameAssignment_0 )
            // InternalLibrettoProjectProfile.g:5260:3: rule__OperationSignature__NameAssignment_0
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
    // InternalLibrettoProjectProfile.g:5268:1: rule__OperationSignature__Group__1 : rule__OperationSignature__Group__1__Impl rule__OperationSignature__Group__2 ;
    public final void rule__OperationSignature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5272:1: ( rule__OperationSignature__Group__1__Impl rule__OperationSignature__Group__2 )
            // InternalLibrettoProjectProfile.g:5273:2: rule__OperationSignature__Group__1__Impl rule__OperationSignature__Group__2
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
    // InternalLibrettoProjectProfile.g:5280:1: rule__OperationSignature__Group__1__Impl : ( '(' ) ;
    public final void rule__OperationSignature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5284:1: ( ( '(' ) )
            // InternalLibrettoProjectProfile.g:5285:1: ( '(' )
            {
            // InternalLibrettoProjectProfile.g:5285:1: ( '(' )
            // InternalLibrettoProjectProfile.g:5286:2: '('
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
    // InternalLibrettoProjectProfile.g:5295:1: rule__OperationSignature__Group__2 : rule__OperationSignature__Group__2__Impl rule__OperationSignature__Group__3 ;
    public final void rule__OperationSignature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5299:1: ( rule__OperationSignature__Group__2__Impl rule__OperationSignature__Group__3 )
            // InternalLibrettoProjectProfile.g:5300:2: rule__OperationSignature__Group__2__Impl rule__OperationSignature__Group__3
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
    // InternalLibrettoProjectProfile.g:5307:1: rule__OperationSignature__Group__2__Impl : ( ( rule__OperationSignature__Group_2__0 )? ) ;
    public final void rule__OperationSignature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5311:1: ( ( ( rule__OperationSignature__Group_2__0 )? ) )
            // InternalLibrettoProjectProfile.g:5312:1: ( ( rule__OperationSignature__Group_2__0 )? )
            {
            // InternalLibrettoProjectProfile.g:5312:1: ( ( rule__OperationSignature__Group_2__0 )? )
            // InternalLibrettoProjectProfile.g:5313:2: ( rule__OperationSignature__Group_2__0 )?
            {
             before(grammarAccess.getOperationSignatureAccess().getGroup_2()); 
            // InternalLibrettoProjectProfile.g:5314:2: ( rule__OperationSignature__Group_2__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ID||(LA40_0>=16 && LA40_0<=24)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:5314:3: rule__OperationSignature__Group_2__0
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
    // InternalLibrettoProjectProfile.g:5322:1: rule__OperationSignature__Group__3 : rule__OperationSignature__Group__3__Impl ;
    public final void rule__OperationSignature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5326:1: ( rule__OperationSignature__Group__3__Impl )
            // InternalLibrettoProjectProfile.g:5327:2: rule__OperationSignature__Group__3__Impl
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
    // InternalLibrettoProjectProfile.g:5333:1: rule__OperationSignature__Group__3__Impl : ( ')' ) ;
    public final void rule__OperationSignature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5337:1: ( ( ')' ) )
            // InternalLibrettoProjectProfile.g:5338:1: ( ')' )
            {
            // InternalLibrettoProjectProfile.g:5338:1: ( ')' )
            // InternalLibrettoProjectProfile.g:5339:2: ')'
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
    // InternalLibrettoProjectProfile.g:5349:1: rule__OperationSignature__Group_2__0 : rule__OperationSignature__Group_2__0__Impl rule__OperationSignature__Group_2__1 ;
    public final void rule__OperationSignature__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5353:1: ( rule__OperationSignature__Group_2__0__Impl rule__OperationSignature__Group_2__1 )
            // InternalLibrettoProjectProfile.g:5354:2: rule__OperationSignature__Group_2__0__Impl rule__OperationSignature__Group_2__1
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
    // InternalLibrettoProjectProfile.g:5361:1: rule__OperationSignature__Group_2__0__Impl : ( ( rule__OperationSignature__ParamsAssignment_2_0 ) ) ;
    public final void rule__OperationSignature__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5365:1: ( ( ( rule__OperationSignature__ParamsAssignment_2_0 ) ) )
            // InternalLibrettoProjectProfile.g:5366:1: ( ( rule__OperationSignature__ParamsAssignment_2_0 ) )
            {
            // InternalLibrettoProjectProfile.g:5366:1: ( ( rule__OperationSignature__ParamsAssignment_2_0 ) )
            // InternalLibrettoProjectProfile.g:5367:2: ( rule__OperationSignature__ParamsAssignment_2_0 )
            {
             before(grammarAccess.getOperationSignatureAccess().getParamsAssignment_2_0()); 
            // InternalLibrettoProjectProfile.g:5368:2: ( rule__OperationSignature__ParamsAssignment_2_0 )
            // InternalLibrettoProjectProfile.g:5368:3: rule__OperationSignature__ParamsAssignment_2_0
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
    // InternalLibrettoProjectProfile.g:5376:1: rule__OperationSignature__Group_2__1 : rule__OperationSignature__Group_2__1__Impl ;
    public final void rule__OperationSignature__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5380:1: ( rule__OperationSignature__Group_2__1__Impl )
            // InternalLibrettoProjectProfile.g:5381:2: rule__OperationSignature__Group_2__1__Impl
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
    // InternalLibrettoProjectProfile.g:5387:1: rule__OperationSignature__Group_2__1__Impl : ( ( rule__OperationSignature__Group_2_1__0 )* ) ;
    public final void rule__OperationSignature__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5391:1: ( ( ( rule__OperationSignature__Group_2_1__0 )* ) )
            // InternalLibrettoProjectProfile.g:5392:1: ( ( rule__OperationSignature__Group_2_1__0 )* )
            {
            // InternalLibrettoProjectProfile.g:5392:1: ( ( rule__OperationSignature__Group_2_1__0 )* )
            // InternalLibrettoProjectProfile.g:5393:2: ( rule__OperationSignature__Group_2_1__0 )*
            {
             before(grammarAccess.getOperationSignatureAccess().getGroup_2_1()); 
            // InternalLibrettoProjectProfile.g:5394:2: ( rule__OperationSignature__Group_2_1__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==73) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:5394:3: rule__OperationSignature__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_53);
            	    rule__OperationSignature__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
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
    // InternalLibrettoProjectProfile.g:5403:1: rule__OperationSignature__Group_2_1__0 : rule__OperationSignature__Group_2_1__0__Impl rule__OperationSignature__Group_2_1__1 ;
    public final void rule__OperationSignature__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5407:1: ( rule__OperationSignature__Group_2_1__0__Impl rule__OperationSignature__Group_2_1__1 )
            // InternalLibrettoProjectProfile.g:5408:2: rule__OperationSignature__Group_2_1__0__Impl rule__OperationSignature__Group_2_1__1
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
    // InternalLibrettoProjectProfile.g:5415:1: rule__OperationSignature__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__OperationSignature__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5419:1: ( ( ',' ) )
            // InternalLibrettoProjectProfile.g:5420:1: ( ',' )
            {
            // InternalLibrettoProjectProfile.g:5420:1: ( ',' )
            // InternalLibrettoProjectProfile.g:5421:2: ','
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
    // InternalLibrettoProjectProfile.g:5430:1: rule__OperationSignature__Group_2_1__1 : rule__OperationSignature__Group_2_1__1__Impl ;
    public final void rule__OperationSignature__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5434:1: ( rule__OperationSignature__Group_2_1__1__Impl )
            // InternalLibrettoProjectProfile.g:5435:2: rule__OperationSignature__Group_2_1__1__Impl
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
    // InternalLibrettoProjectProfile.g:5441:1: rule__OperationSignature__Group_2_1__1__Impl : ( ( rule__OperationSignature__ParamsAssignment_2_1_1 ) ) ;
    public final void rule__OperationSignature__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5445:1: ( ( ( rule__OperationSignature__ParamsAssignment_2_1_1 ) ) )
            // InternalLibrettoProjectProfile.g:5446:1: ( ( rule__OperationSignature__ParamsAssignment_2_1_1 ) )
            {
            // InternalLibrettoProjectProfile.g:5446:1: ( ( rule__OperationSignature__ParamsAssignment_2_1_1 ) )
            // InternalLibrettoProjectProfile.g:5447:2: ( rule__OperationSignature__ParamsAssignment_2_1_1 )
            {
             before(grammarAccess.getOperationSignatureAccess().getParamsAssignment_2_1_1()); 
            // InternalLibrettoProjectProfile.g:5448:2: ( rule__OperationSignature__ParamsAssignment_2_1_1 )
            // InternalLibrettoProjectProfile.g:5448:3: rule__OperationSignature__ParamsAssignment_2_1_1
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
    // InternalLibrettoProjectProfile.g:5457:1: rule__TypedParam__Group__0 : rule__TypedParam__Group__0__Impl rule__TypedParam__Group__1 ;
    public final void rule__TypedParam__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5461:1: ( rule__TypedParam__Group__0__Impl rule__TypedParam__Group__1 )
            // InternalLibrettoProjectProfile.g:5462:2: rule__TypedParam__Group__0__Impl rule__TypedParam__Group__1
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
    // InternalLibrettoProjectProfile.g:5469:1: rule__TypedParam__Group__0__Impl : ( ( rule__TypedParam__TypeAssignment_0 ) ) ;
    public final void rule__TypedParam__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5473:1: ( ( ( rule__TypedParam__TypeAssignment_0 ) ) )
            // InternalLibrettoProjectProfile.g:5474:1: ( ( rule__TypedParam__TypeAssignment_0 ) )
            {
            // InternalLibrettoProjectProfile.g:5474:1: ( ( rule__TypedParam__TypeAssignment_0 ) )
            // InternalLibrettoProjectProfile.g:5475:2: ( rule__TypedParam__TypeAssignment_0 )
            {
             before(grammarAccess.getTypedParamAccess().getTypeAssignment_0()); 
            // InternalLibrettoProjectProfile.g:5476:2: ( rule__TypedParam__TypeAssignment_0 )
            // InternalLibrettoProjectProfile.g:5476:3: rule__TypedParam__TypeAssignment_0
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
    // InternalLibrettoProjectProfile.g:5484:1: rule__TypedParam__Group__1 : rule__TypedParam__Group__1__Impl ;
    public final void rule__TypedParam__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5488:1: ( rule__TypedParam__Group__1__Impl )
            // InternalLibrettoProjectProfile.g:5489:2: rule__TypedParam__Group__1__Impl
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
    // InternalLibrettoProjectProfile.g:5495:1: rule__TypedParam__Group__1__Impl : ( ( rule__TypedParam__ParamNameAssignment_1 ) ) ;
    public final void rule__TypedParam__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5499:1: ( ( ( rule__TypedParam__ParamNameAssignment_1 ) ) )
            // InternalLibrettoProjectProfile.g:5500:1: ( ( rule__TypedParam__ParamNameAssignment_1 ) )
            {
            // InternalLibrettoProjectProfile.g:5500:1: ( ( rule__TypedParam__ParamNameAssignment_1 ) )
            // InternalLibrettoProjectProfile.g:5501:2: ( rule__TypedParam__ParamNameAssignment_1 )
            {
             before(grammarAccess.getTypedParamAccess().getParamNameAssignment_1()); 
            // InternalLibrettoProjectProfile.g:5502:2: ( rule__TypedParam__ParamNameAssignment_1 )
            // InternalLibrettoProjectProfile.g:5502:3: rule__TypedParam__ParamNameAssignment_1
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
    // InternalLibrettoProjectProfile.g:5511:1: rule__ValidID__Group__0 : rule__ValidID__Group__0__Impl rule__ValidID__Group__1 ;
    public final void rule__ValidID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5515:1: ( rule__ValidID__Group__0__Impl rule__ValidID__Group__1 )
            // InternalLibrettoProjectProfile.g:5516:2: rule__ValidID__Group__0__Impl rule__ValidID__Group__1
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
    // InternalLibrettoProjectProfile.g:5523:1: rule__ValidID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__ValidID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5527:1: ( ( RULE_ID ) )
            // InternalLibrettoProjectProfile.g:5528:1: ( RULE_ID )
            {
            // InternalLibrettoProjectProfile.g:5528:1: ( RULE_ID )
            // InternalLibrettoProjectProfile.g:5529:2: RULE_ID
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
    // InternalLibrettoProjectProfile.g:5538:1: rule__ValidID__Group__1 : rule__ValidID__Group__1__Impl ;
    public final void rule__ValidID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5542:1: ( rule__ValidID__Group__1__Impl )
            // InternalLibrettoProjectProfile.g:5543:2: rule__ValidID__Group__1__Impl
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
    // InternalLibrettoProjectProfile.g:5549:1: rule__ValidID__Group__1__Impl : ( ( rule__ValidID__Group_1__0 )* ) ;
    public final void rule__ValidID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5553:1: ( ( ( rule__ValidID__Group_1__0 )* ) )
            // InternalLibrettoProjectProfile.g:5554:1: ( ( rule__ValidID__Group_1__0 )* )
            {
            // InternalLibrettoProjectProfile.g:5554:1: ( ( rule__ValidID__Group_1__0 )* )
            // InternalLibrettoProjectProfile.g:5555:2: ( rule__ValidID__Group_1__0 )*
            {
             before(grammarAccess.getValidIDAccess().getGroup_1()); 
            // InternalLibrettoProjectProfile.g:5556:2: ( rule__ValidID__Group_1__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>=25 && LA42_0<=27)) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:5556:3: rule__ValidID__Group_1__0
            	    {
            	    pushFollow(FOLLOW_61);
            	    rule__ValidID__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
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
    // InternalLibrettoProjectProfile.g:5565:1: rule__ValidID__Group_1__0 : rule__ValidID__Group_1__0__Impl rule__ValidID__Group_1__1 ;
    public final void rule__ValidID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5569:1: ( rule__ValidID__Group_1__0__Impl rule__ValidID__Group_1__1 )
            // InternalLibrettoProjectProfile.g:5570:2: rule__ValidID__Group_1__0__Impl rule__ValidID__Group_1__1
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
    // InternalLibrettoProjectProfile.g:5577:1: rule__ValidID__Group_1__0__Impl : ( ( rule__ValidID__Alternatives_1_0 ) ) ;
    public final void rule__ValidID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5581:1: ( ( ( rule__ValidID__Alternatives_1_0 ) ) )
            // InternalLibrettoProjectProfile.g:5582:1: ( ( rule__ValidID__Alternatives_1_0 ) )
            {
            // InternalLibrettoProjectProfile.g:5582:1: ( ( rule__ValidID__Alternatives_1_0 ) )
            // InternalLibrettoProjectProfile.g:5583:2: ( rule__ValidID__Alternatives_1_0 )
            {
             before(grammarAccess.getValidIDAccess().getAlternatives_1_0()); 
            // InternalLibrettoProjectProfile.g:5584:2: ( rule__ValidID__Alternatives_1_0 )
            // InternalLibrettoProjectProfile.g:5584:3: rule__ValidID__Alternatives_1_0
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
    // InternalLibrettoProjectProfile.g:5592:1: rule__ValidID__Group_1__1 : rule__ValidID__Group_1__1__Impl ;
    public final void rule__ValidID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5596:1: ( rule__ValidID__Group_1__1__Impl )
            // InternalLibrettoProjectProfile.g:5597:2: rule__ValidID__Group_1__1__Impl
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
    // InternalLibrettoProjectProfile.g:5603:1: rule__ValidID__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__ValidID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5607:1: ( ( RULE_ID ) )
            // InternalLibrettoProjectProfile.g:5608:1: ( RULE_ID )
            {
            // InternalLibrettoProjectProfile.g:5608:1: ( RULE_ID )
            // InternalLibrettoProjectProfile.g:5609:2: RULE_ID
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
    // InternalLibrettoProjectProfile.g:5619:1: rule__ProjectProfile__NameAssignment_2 : ( ruleValidID ) ;
    public final void rule__ProjectProfile__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5623:1: ( ( ruleValidID ) )
            // InternalLibrettoProjectProfile.g:5624:2: ( ruleValidID )
            {
            // InternalLibrettoProjectProfile.g:5624:2: ( ruleValidID )
            // InternalLibrettoProjectProfile.g:5625:3: ruleValidID
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
    // InternalLibrettoProjectProfile.g:5634:1: rule__ProjectProfile__ProjectsAssignment_4_0 : ( ruleProjectBlock ) ;
    public final void rule__ProjectProfile__ProjectsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5638:1: ( ( ruleProjectBlock ) )
            // InternalLibrettoProjectProfile.g:5639:2: ( ruleProjectBlock )
            {
            // InternalLibrettoProjectProfile.g:5639:2: ( ruleProjectBlock )
            // InternalLibrettoProjectProfile.g:5640:3: ruleProjectBlock
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
    // InternalLibrettoProjectProfile.g:5649:1: rule__ProjectProfile__LlmProvidersAssignment_4_1 : ( ruleLlmProvidersBlock ) ;
    public final void rule__ProjectProfile__LlmProvidersAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5653:1: ( ( ruleLlmProvidersBlock ) )
            // InternalLibrettoProjectProfile.g:5654:2: ( ruleLlmProvidersBlock )
            {
            // InternalLibrettoProjectProfile.g:5654:2: ( ruleLlmProvidersBlock )
            // InternalLibrettoProjectProfile.g:5655:3: ruleLlmProvidersBlock
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
    // InternalLibrettoProjectProfile.g:5664:1: rule__ProjectProfile__SurfacesAssignment_4_2 : ( ruleSurfaceBlock ) ;
    public final void rule__ProjectProfile__SurfacesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5668:1: ( ( ruleSurfaceBlock ) )
            // InternalLibrettoProjectProfile.g:5669:2: ( ruleSurfaceBlock )
            {
            // InternalLibrettoProjectProfile.g:5669:2: ( ruleSurfaceBlock )
            // InternalLibrettoProjectProfile.g:5670:3: ruleSurfaceBlock
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
    // InternalLibrettoProjectProfile.g:5679:1: rule__ProjectBlock__RootDirAssignment_3_0_1 : ( RULE_STRING ) ;
    public final void rule__ProjectBlock__RootDirAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5683:1: ( ( RULE_STRING ) )
            // InternalLibrettoProjectProfile.g:5684:2: ( RULE_STRING )
            {
            // InternalLibrettoProjectProfile.g:5684:2: ( RULE_STRING )
            // InternalLibrettoProjectProfile.g:5685:3: RULE_STRING
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
    // InternalLibrettoProjectProfile.g:5694:1: rule__ProjectBlock__ModulesAssignment_3_1 : ( ruleModulesBlock ) ;
    public final void rule__ProjectBlock__ModulesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5698:1: ( ( ruleModulesBlock ) )
            // InternalLibrettoProjectProfile.g:5699:2: ( ruleModulesBlock )
            {
            // InternalLibrettoProjectProfile.g:5699:2: ( ruleModulesBlock )
            // InternalLibrettoProjectProfile.g:5700:3: ruleModulesBlock
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
    // InternalLibrettoProjectProfile.g:5709:1: rule__ProjectBlock__GensAssignment_3_2 : ( ruleGenBlock ) ;
    public final void rule__ProjectBlock__GensAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5713:1: ( ( ruleGenBlock ) )
            // InternalLibrettoProjectProfile.g:5714:2: ( ruleGenBlock )
            {
            // InternalLibrettoProjectProfile.g:5714:2: ( ruleGenBlock )
            // InternalLibrettoProjectProfile.g:5715:3: ruleGenBlock
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
    // InternalLibrettoProjectProfile.g:5724:1: rule__ModulesBlock__ModulesAssignment_3 : ( ruleProjectModule ) ;
    public final void rule__ModulesBlock__ModulesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5728:1: ( ( ruleProjectModule ) )
            // InternalLibrettoProjectProfile.g:5729:2: ( ruleProjectModule )
            {
            // InternalLibrettoProjectProfile.g:5729:2: ( ruleProjectModule )
            // InternalLibrettoProjectProfile.g:5730:3: ruleProjectModule
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
    // InternalLibrettoProjectProfile.g:5739:1: rule__ProjectModule__NameAssignment_1 : ( ruleValidID ) ;
    public final void rule__ProjectModule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5743:1: ( ( ruleValidID ) )
            // InternalLibrettoProjectProfile.g:5744:2: ( ruleValidID )
            {
            // InternalLibrettoProjectProfile.g:5744:2: ( ruleValidID )
            // InternalLibrettoProjectProfile.g:5745:3: ruleValidID
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
    // InternalLibrettoProjectProfile.g:5754:1: rule__ProjectModule__DirsAssignment_3_0_1 : ( RULE_STRING ) ;
    public final void rule__ProjectModule__DirsAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5758:1: ( ( RULE_STRING ) )
            // InternalLibrettoProjectProfile.g:5759:2: ( RULE_STRING )
            {
            // InternalLibrettoProjectProfile.g:5759:2: ( RULE_STRING )
            // InternalLibrettoProjectProfile.g:5760:3: RULE_STRING
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
    // InternalLibrettoProjectProfile.g:5769:1: rule__ProjectModule__SpecDirsAssignment_3_1_1 : ( RULE_STRING ) ;
    public final void rule__ProjectModule__SpecDirsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5773:1: ( ( RULE_STRING ) )
            // InternalLibrettoProjectProfile.g:5774:2: ( RULE_STRING )
            {
            // InternalLibrettoProjectProfile.g:5774:2: ( RULE_STRING )
            // InternalLibrettoProjectProfile.g:5775:3: RULE_STRING
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
    // InternalLibrettoProjectProfile.g:5784:1: rule__ProjectModule__TestDirsAssignment_3_2_1 : ( RULE_STRING ) ;
    public final void rule__ProjectModule__TestDirsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5788:1: ( ( RULE_STRING ) )
            // InternalLibrettoProjectProfile.g:5789:2: ( RULE_STRING )
            {
            // InternalLibrettoProjectProfile.g:5789:2: ( RULE_STRING )
            // InternalLibrettoProjectProfile.g:5790:3: RULE_STRING
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
    // InternalLibrettoProjectProfile.g:5799:1: rule__ProjectModule__MainDirsAssignment_3_3_1 : ( RULE_STRING ) ;
    public final void rule__ProjectModule__MainDirsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5803:1: ( ( RULE_STRING ) )
            // InternalLibrettoProjectProfile.g:5804:2: ( RULE_STRING )
            {
            // InternalLibrettoProjectProfile.g:5804:2: ( RULE_STRING )
            // InternalLibrettoProjectProfile.g:5805:3: RULE_STRING
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
    // InternalLibrettoProjectProfile.g:5814:1: rule__ProjectModule__BasePackagesAssignment_3_4_1 : ( RULE_STRING ) ;
    public final void rule__ProjectModule__BasePackagesAssignment_3_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5818:1: ( ( RULE_STRING ) )
            // InternalLibrettoProjectProfile.g:5819:2: ( RULE_STRING )
            {
            // InternalLibrettoProjectProfile.g:5819:2: ( RULE_STRING )
            // InternalLibrettoProjectProfile.g:5820:3: RULE_STRING
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
    // InternalLibrettoProjectProfile.g:5829:1: rule__GenBlock__InitialInstructionsAssignment_3_0_1 : ( RULE_STRING ) ;
    public final void rule__GenBlock__InitialInstructionsAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5833:1: ( ( RULE_STRING ) )
            // InternalLibrettoProjectProfile.g:5834:2: ( RULE_STRING )
            {
            // InternalLibrettoProjectProfile.g:5834:2: ( RULE_STRING )
            // InternalLibrettoProjectProfile.g:5835:3: RULE_STRING
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
    // InternalLibrettoProjectProfile.g:5844:1: rule__GenBlock__MaxRetriesAssignment_3_1_1 : ( RULE_INT ) ;
    public final void rule__GenBlock__MaxRetriesAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5848:1: ( ( RULE_INT ) )
            // InternalLibrettoProjectProfile.g:5849:2: ( RULE_INT )
            {
            // InternalLibrettoProjectProfile.g:5849:2: ( RULE_INT )
            // InternalLibrettoProjectProfile.g:5850:3: RULE_INT
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
    // InternalLibrettoProjectProfile.g:5859:1: rule__GenBlock__ParseChecksAssignment_3_2_1 : ( ( rule__GenBlock__ParseChecksAlternatives_3_2_1_0 ) ) ;
    public final void rule__GenBlock__ParseChecksAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5863:1: ( ( ( rule__GenBlock__ParseChecksAlternatives_3_2_1_0 ) ) )
            // InternalLibrettoProjectProfile.g:5864:2: ( ( rule__GenBlock__ParseChecksAlternatives_3_2_1_0 ) )
            {
            // InternalLibrettoProjectProfile.g:5864:2: ( ( rule__GenBlock__ParseChecksAlternatives_3_2_1_0 ) )
            // InternalLibrettoProjectProfile.g:5865:3: ( rule__GenBlock__ParseChecksAlternatives_3_2_1_0 )
            {
             before(grammarAccess.getGenBlockAccess().getParseChecksAlternatives_3_2_1_0()); 
            // InternalLibrettoProjectProfile.g:5866:3: ( rule__GenBlock__ParseChecksAlternatives_3_2_1_0 )
            // InternalLibrettoProjectProfile.g:5866:4: rule__GenBlock__ParseChecksAlternatives_3_2_1_0
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
    // InternalLibrettoProjectProfile.g:5874:1: rule__GenBlock__DefaultCorrectionsAssignment_3_3_1 : ( RULE_STRING ) ;
    public final void rule__GenBlock__DefaultCorrectionsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5878:1: ( ( RULE_STRING ) )
            // InternalLibrettoProjectProfile.g:5879:2: ( RULE_STRING )
            {
            // InternalLibrettoProjectProfile.g:5879:2: ( RULE_STRING )
            // InternalLibrettoProjectProfile.g:5880:3: RULE_STRING
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
    // InternalLibrettoProjectProfile.g:5889:1: rule__GenBlock__RemediationsAssignment_3_4 : ( ruleGenRemediationRules ) ;
    public final void rule__GenBlock__RemediationsAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5893:1: ( ( ruleGenRemediationRules ) )
            // InternalLibrettoProjectProfile.g:5894:2: ( ruleGenRemediationRules )
            {
            // InternalLibrettoProjectProfile.g:5894:2: ( ruleGenRemediationRules )
            // InternalLibrettoProjectProfile.g:5895:3: ruleGenRemediationRules
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
    // InternalLibrettoProjectProfile.g:5904:1: rule__GenBlock__ModelUsagesAssignment_3_5 : ( ruleGenUsageBlock ) ;
    public final void rule__GenBlock__ModelUsagesAssignment_3_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5908:1: ( ( ruleGenUsageBlock ) )
            // InternalLibrettoProjectProfile.g:5909:2: ( ruleGenUsageBlock )
            {
            // InternalLibrettoProjectProfile.g:5909:2: ( ruleGenUsageBlock )
            // InternalLibrettoProjectProfile.g:5910:3: ruleGenUsageBlock
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
    // InternalLibrettoProjectProfile.g:5919:1: rule__GenRemediationRules__PatternRulesAssignment_3_0 : ( ruleGenPatternRemediationRule ) ;
    public final void rule__GenRemediationRules__PatternRulesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5923:1: ( ( ruleGenPatternRemediationRule ) )
            // InternalLibrettoProjectProfile.g:5924:2: ( ruleGenPatternRemediationRule )
            {
            // InternalLibrettoProjectProfile.g:5924:2: ( ruleGenPatternRemediationRule )
            // InternalLibrettoProjectProfile.g:5925:3: ruleGenPatternRemediationRule
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
    // InternalLibrettoProjectProfile.g:5934:1: rule__GenRemediationRules__DefaultRemediationsAssignment_3_1 : ( ruleGenDefaultRemediationRule ) ;
    public final void rule__GenRemediationRules__DefaultRemediationsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5938:1: ( ( ruleGenDefaultRemediationRule ) )
            // InternalLibrettoProjectProfile.g:5939:2: ( ruleGenDefaultRemediationRule )
            {
            // InternalLibrettoProjectProfile.g:5939:2: ( ruleGenDefaultRemediationRule )
            // InternalLibrettoProjectProfile.g:5940:3: ruleGenDefaultRemediationRule
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
    // InternalLibrettoProjectProfile.g:5949:1: rule__GenPatternRemediationRule__PatternsAssignment_3_0_1 : ( RULE_STRING ) ;
    public final void rule__GenPatternRemediationRule__PatternsAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5953:1: ( ( RULE_STRING ) )
            // InternalLibrettoProjectProfile.g:5954:2: ( RULE_STRING )
            {
            // InternalLibrettoProjectProfile.g:5954:2: ( RULE_STRING )
            // InternalLibrettoProjectProfile.g:5955:3: RULE_STRING
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
    // InternalLibrettoProjectProfile.g:5964:1: rule__GenPatternRemediationRule__CodesAssignment_3_1_1 : ( RULE_STRING ) ;
    public final void rule__GenPatternRemediationRule__CodesAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5968:1: ( ( RULE_STRING ) )
            // InternalLibrettoProjectProfile.g:5969:2: ( RULE_STRING )
            {
            // InternalLibrettoProjectProfile.g:5969:2: ( RULE_STRING )
            // InternalLibrettoProjectProfile.g:5970:3: RULE_STRING
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
    // InternalLibrettoProjectProfile.g:5979:1: rule__GenPatternRemediationRule__CorrectionsAssignment_3_2_1 : ( RULE_STRING ) ;
    public final void rule__GenPatternRemediationRule__CorrectionsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5983:1: ( ( RULE_STRING ) )
            // InternalLibrettoProjectProfile.g:5984:2: ( RULE_STRING )
            {
            // InternalLibrettoProjectProfile.g:5984:2: ( RULE_STRING )
            // InternalLibrettoProjectProfile.g:5985:3: RULE_STRING
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
    // InternalLibrettoProjectProfile.g:5994:1: rule__GenDefaultRemediationRule__CodesAssignment_3_0_1 : ( RULE_STRING ) ;
    public final void rule__GenDefaultRemediationRule__CodesAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:5998:1: ( ( RULE_STRING ) )
            // InternalLibrettoProjectProfile.g:5999:2: ( RULE_STRING )
            {
            // InternalLibrettoProjectProfile.g:5999:2: ( RULE_STRING )
            // InternalLibrettoProjectProfile.g:6000:3: RULE_STRING
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
    // InternalLibrettoProjectProfile.g:6009:1: rule__GenDefaultRemediationRule__CorrectionAssignment_3_1_1 : ( RULE_STRING ) ;
    public final void rule__GenDefaultRemediationRule__CorrectionAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:6013:1: ( ( RULE_STRING ) )
            // InternalLibrettoProjectProfile.g:6014:2: ( RULE_STRING )
            {
            // InternalLibrettoProjectProfile.g:6014:2: ( RULE_STRING )
            // InternalLibrettoProjectProfile.g:6015:3: RULE_STRING
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
    // InternalLibrettoProjectProfile.g:6024:1: rule__LlmProvidersBlock__ProvidersAssignment_3 : ( ruleNamedLlmProvider ) ;
    public final void rule__LlmProvidersBlock__ProvidersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:6028:1: ( ( ruleNamedLlmProvider ) )
            // InternalLibrettoProjectProfile.g:6029:2: ( ruleNamedLlmProvider )
            {
            // InternalLibrettoProjectProfile.g:6029:2: ( ruleNamedLlmProvider )
            // InternalLibrettoProjectProfile.g:6030:3: ruleNamedLlmProvider
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
    // InternalLibrettoProjectProfile.g:6039:1: rule__NamedLlmProvider__NameAssignment_1 : ( ruleValidID ) ;
    public final void rule__NamedLlmProvider__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:6043:1: ( ( ruleValidID ) )
            // InternalLibrettoProjectProfile.g:6044:2: ( ruleValidID )
            {
            // InternalLibrettoProjectProfile.g:6044:2: ( ruleValidID )
            // InternalLibrettoProjectProfile.g:6045:3: ruleValidID
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
    // InternalLibrettoProjectProfile.g:6054:1: rule__NamedLlmProvider__KindsAssignment_3_0_1 : ( ( rule__NamedLlmProvider__KindsAlternatives_3_0_1_0 ) ) ;
    public final void rule__NamedLlmProvider__KindsAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:6058:1: ( ( ( rule__NamedLlmProvider__KindsAlternatives_3_0_1_0 ) ) )
            // InternalLibrettoProjectProfile.g:6059:2: ( ( rule__NamedLlmProvider__KindsAlternatives_3_0_1_0 ) )
            {
            // InternalLibrettoProjectProfile.g:6059:2: ( ( rule__NamedLlmProvider__KindsAlternatives_3_0_1_0 ) )
            // InternalLibrettoProjectProfile.g:6060:3: ( rule__NamedLlmProvider__KindsAlternatives_3_0_1_0 )
            {
             before(grammarAccess.getNamedLlmProviderAccess().getKindsAlternatives_3_0_1_0()); 
            // InternalLibrettoProjectProfile.g:6061:3: ( rule__NamedLlmProvider__KindsAlternatives_3_0_1_0 )
            // InternalLibrettoProjectProfile.g:6061:4: rule__NamedLlmProvider__KindsAlternatives_3_0_1_0
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
    // InternalLibrettoProjectProfile.g:6069:1: rule__NamedLlmProvider__LocalModelPathsAssignment_3_1_1 : ( RULE_STRING ) ;
    public final void rule__NamedLlmProvider__LocalModelPathsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:6073:1: ( ( RULE_STRING ) )
            // InternalLibrettoProjectProfile.g:6074:2: ( RULE_STRING )
            {
            // InternalLibrettoProjectProfile.g:6074:2: ( RULE_STRING )
            // InternalLibrettoProjectProfile.g:6075:3: RULE_STRING
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
    // InternalLibrettoProjectProfile.g:6084:1: rule__NamedLlmProvider__ModelsAssignment_3_2_1 : ( RULE_STRING ) ;
    public final void rule__NamedLlmProvider__ModelsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:6088:1: ( ( RULE_STRING ) )
            // InternalLibrettoProjectProfile.g:6089:2: ( RULE_STRING )
            {
            // InternalLibrettoProjectProfile.g:6089:2: ( RULE_STRING )
            // InternalLibrettoProjectProfile.g:6090:3: RULE_STRING
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
    // InternalLibrettoProjectProfile.g:6099:1: rule__NamedLlmProvider__EndpointsAssignment_3_3_1 : ( RULE_STRING ) ;
    public final void rule__NamedLlmProvider__EndpointsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:6103:1: ( ( RULE_STRING ) )
            // InternalLibrettoProjectProfile.g:6104:2: ( RULE_STRING )
            {
            // InternalLibrettoProjectProfile.g:6104:2: ( RULE_STRING )
            // InternalLibrettoProjectProfile.g:6105:3: RULE_STRING
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
    // InternalLibrettoProjectProfile.g:6114:1: rule__GenUsageBlock__PrimaryProvidersAssignment_3_0_1 : ( ruleValidID ) ;
    public final void rule__GenUsageBlock__PrimaryProvidersAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:6118:1: ( ( ruleValidID ) )
            // InternalLibrettoProjectProfile.g:6119:2: ( ruleValidID )
            {
            // InternalLibrettoProjectProfile.g:6119:2: ( ruleValidID )
            // InternalLibrettoProjectProfile.g:6120:3: ruleValidID
            {
             before(grammarAccess.getGenUsageBlockAccess().getPrimaryProvidersValidIDParserRuleCall_3_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getGenUsageBlockAccess().getPrimaryProvidersValidIDParserRuleCall_3_0_1_0()); 

            }


            }

        }
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
    // InternalLibrettoProjectProfile.g:6129:1: rule__GenUsageBlock__SecondaryProvidersAssignment_3_1_1 : ( ruleValidID ) ;
    public final void rule__GenUsageBlock__SecondaryProvidersAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:6133:1: ( ( ruleValidID ) )
            // InternalLibrettoProjectProfile.g:6134:2: ( ruleValidID )
            {
            // InternalLibrettoProjectProfile.g:6134:2: ( ruleValidID )
            // InternalLibrettoProjectProfile.g:6135:3: ruleValidID
            {
             before(grammarAccess.getGenUsageBlockAccess().getSecondaryProvidersValidIDParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getGenUsageBlockAccess().getSecondaryProvidersValidIDParserRuleCall_3_1_1_0()); 

            }


            }

        }
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
    // InternalLibrettoProjectProfile.g:6144:1: rule__GenUsageBlock__EscalationsAssignment_3_2 : ( ruleGenEscalationBlock ) ;
    public final void rule__GenUsageBlock__EscalationsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:6148:1: ( ( ruleGenEscalationBlock ) )
            // InternalLibrettoProjectProfile.g:6149:2: ( ruleGenEscalationBlock )
            {
            // InternalLibrettoProjectProfile.g:6149:2: ( ruleGenEscalationBlock )
            // InternalLibrettoProjectProfile.g:6150:3: ruleGenEscalationBlock
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
    // InternalLibrettoProjectProfile.g:6159:1: rule__GenEscalationBlock__EnabledsAssignment_3_0_1 : ( ( rule__GenEscalationBlock__EnabledsAlternatives_3_0_1_0 ) ) ;
    public final void rule__GenEscalationBlock__EnabledsAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:6163:1: ( ( ( rule__GenEscalationBlock__EnabledsAlternatives_3_0_1_0 ) ) )
            // InternalLibrettoProjectProfile.g:6164:2: ( ( rule__GenEscalationBlock__EnabledsAlternatives_3_0_1_0 ) )
            {
            // InternalLibrettoProjectProfile.g:6164:2: ( ( rule__GenEscalationBlock__EnabledsAlternatives_3_0_1_0 ) )
            // InternalLibrettoProjectProfile.g:6165:3: ( rule__GenEscalationBlock__EnabledsAlternatives_3_0_1_0 )
            {
             before(grammarAccess.getGenEscalationBlockAccess().getEnabledsAlternatives_3_0_1_0()); 
            // InternalLibrettoProjectProfile.g:6166:3: ( rule__GenEscalationBlock__EnabledsAlternatives_3_0_1_0 )
            // InternalLibrettoProjectProfile.g:6166:4: rule__GenEscalationBlock__EnabledsAlternatives_3_0_1_0
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
    // InternalLibrettoProjectProfile.g:6174:1: rule__GenEscalationBlock__EscalateAtRetriesAssignment_3_1_1 : ( RULE_INT ) ;
    public final void rule__GenEscalationBlock__EscalateAtRetriesAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:6178:1: ( ( RULE_INT ) )
            // InternalLibrettoProjectProfile.g:6179:2: ( RULE_INT )
            {
            // InternalLibrettoProjectProfile.g:6179:2: ( RULE_INT )
            // InternalLibrettoProjectProfile.g:6180:3: RULE_INT
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
    // InternalLibrettoProjectProfile.g:6189:1: rule__SurfaceBlock__ElementsAssignment_3 : ( ruleSurfaceElement ) ;
    public final void rule__SurfaceBlock__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:6193:1: ( ( ruleSurfaceElement ) )
            // InternalLibrettoProjectProfile.g:6194:2: ( ruleSurfaceElement )
            {
            // InternalLibrettoProjectProfile.g:6194:2: ( ruleSurfaceElement )
            // InternalLibrettoProjectProfile.g:6195:3: ruleSurfaceElement
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
    // InternalLibrettoProjectProfile.g:6204:1: rule__ScopedSurface__ModuleIdAssignment_1_0_1 : ( RULE_STRING ) ;
    public final void rule__ScopedSurface__ModuleIdAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:6208:1: ( ( RULE_STRING ) )
            // InternalLibrettoProjectProfile.g:6209:2: ( RULE_STRING )
            {
            // InternalLibrettoProjectProfile.g:6209:2: ( RULE_STRING )
            // InternalLibrettoProjectProfile.g:6210:3: RULE_STRING
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
    // InternalLibrettoProjectProfile.g:6219:1: rule__ScopedSurface__SpecIdAssignment_1_1_1 : ( RULE_STRING ) ;
    public final void rule__ScopedSurface__SpecIdAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:6223:1: ( ( RULE_STRING ) )
            // InternalLibrettoProjectProfile.g:6224:2: ( RULE_STRING )
            {
            // InternalLibrettoProjectProfile.g:6224:2: ( RULE_STRING )
            // InternalLibrettoProjectProfile.g:6225:3: RULE_STRING
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
    // InternalLibrettoProjectProfile.g:6234:1: rule__ScopedSurface__RulesAssignment_3 : ( ruleSurfaceRule ) ;
    public final void rule__ScopedSurface__RulesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:6238:1: ( ( ruleSurfaceRule ) )
            // InternalLibrettoProjectProfile.g:6239:2: ( ruleSurfaceRule )
            {
            // InternalLibrettoProjectProfile.g:6239:2: ( ruleSurfaceRule )
            // InternalLibrettoProjectProfile.g:6240:3: ruleSurfaceRule
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
    // InternalLibrettoProjectProfile.g:6249:1: rule__ReturnTypeRule__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ReturnTypeRule__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:6253:1: ( ( RULE_ID ) )
            // InternalLibrettoProjectProfile.g:6254:2: ( RULE_ID )
            {
            // InternalLibrettoProjectProfile.g:6254:2: ( RULE_ID )
            // InternalLibrettoProjectProfile.g:6255:3: RULE_ID
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
    // InternalLibrettoProjectProfile.g:6264:1: rule__ReturnTypeRule__JavaTypeAssignment_4 : ( ruleJavaType ) ;
    public final void rule__ReturnTypeRule__JavaTypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:6268:1: ( ( ruleJavaType ) )
            // InternalLibrettoProjectProfile.g:6269:2: ( ruleJavaType )
            {
            // InternalLibrettoProjectProfile.g:6269:2: ( ruleJavaType )
            // InternalLibrettoProjectProfile.g:6270:3: ruleJavaType
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
    // InternalLibrettoProjectProfile.g:6279:1: rule__ParamTypeRule__ParamNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ParamTypeRule__ParamNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:6283:1: ( ( RULE_ID ) )
            // InternalLibrettoProjectProfile.g:6284:2: ( RULE_ID )
            {
            // InternalLibrettoProjectProfile.g:6284:2: ( RULE_ID )
            // InternalLibrettoProjectProfile.g:6285:3: RULE_ID
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
    // InternalLibrettoProjectProfile.g:6294:1: rule__ParamTypeRule__JavaTypeAssignment_4 : ( ruleJavaType ) ;
    public final void rule__ParamTypeRule__JavaTypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:6298:1: ( ( ruleJavaType ) )
            // InternalLibrettoProjectProfile.g:6299:2: ( ruleJavaType )
            {
            // InternalLibrettoProjectProfile.g:6299:2: ( ruleJavaType )
            // InternalLibrettoProjectProfile.g:6300:3: ruleJavaType
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
    // InternalLibrettoProjectProfile.g:6309:1: rule__RecordSelfReturnRule__MethodsAssignment_1 : ( RULE_ID ) ;
    public final void rule__RecordSelfReturnRule__MethodsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:6313:1: ( ( RULE_ID ) )
            // InternalLibrettoProjectProfile.g:6314:2: ( RULE_ID )
            {
            // InternalLibrettoProjectProfile.g:6314:2: ( RULE_ID )
            // InternalLibrettoProjectProfile.g:6315:3: RULE_ID
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
    // InternalLibrettoProjectProfile.g:6324:1: rule__RecordSelfReturnRule__MethodsAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__RecordSelfReturnRule__MethodsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:6328:1: ( ( RULE_ID ) )
            // InternalLibrettoProjectProfile.g:6329:2: ( RULE_ID )
            {
            // InternalLibrettoProjectProfile.g:6329:2: ( RULE_ID )
            // InternalLibrettoProjectProfile.g:6330:3: RULE_ID
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
    // InternalLibrettoProjectProfile.g:6339:1: rule__MethodOverrideRule__SignatureAssignment_1 : ( ruleOperationSignature ) ;
    public final void rule__MethodOverrideRule__SignatureAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:6343:1: ( ( ruleOperationSignature ) )
            // InternalLibrettoProjectProfile.g:6344:2: ( ruleOperationSignature )
            {
            // InternalLibrettoProjectProfile.g:6344:2: ( ruleOperationSignature )
            // InternalLibrettoProjectProfile.g:6345:3: ruleOperationSignature
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
    // InternalLibrettoProjectProfile.g:6354:1: rule__MethodOverrideRule__JavaTypeAssignment_3 : ( ruleJavaType ) ;
    public final void rule__MethodOverrideRule__JavaTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:6358:1: ( ( ruleJavaType ) )
            // InternalLibrettoProjectProfile.g:6359:2: ( ruleJavaType )
            {
            // InternalLibrettoProjectProfile.g:6359:2: ( ruleJavaType )
            // InternalLibrettoProjectProfile.g:6360:3: ruleJavaType
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
    // InternalLibrettoProjectProfile.g:6369:1: rule__QualifiedName__SegmentsAssignment_0 : ( RULE_ID ) ;
    public final void rule__QualifiedName__SegmentsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:6373:1: ( ( RULE_ID ) )
            // InternalLibrettoProjectProfile.g:6374:2: ( RULE_ID )
            {
            // InternalLibrettoProjectProfile.g:6374:2: ( RULE_ID )
            // InternalLibrettoProjectProfile.g:6375:3: RULE_ID
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
    // InternalLibrettoProjectProfile.g:6384:1: rule__QualifiedName__SegmentsAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__QualifiedName__SegmentsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:6388:1: ( ( RULE_ID ) )
            // InternalLibrettoProjectProfile.g:6389:2: ( RULE_ID )
            {
            // InternalLibrettoProjectProfile.g:6389:2: ( RULE_ID )
            // InternalLibrettoProjectProfile.g:6390:3: RULE_ID
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
    // InternalLibrettoProjectProfile.g:6399:1: rule__PrimitiveType__KindAssignment : ( ( rule__PrimitiveType__KindAlternatives_0 ) ) ;
    public final void rule__PrimitiveType__KindAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:6403:1: ( ( ( rule__PrimitiveType__KindAlternatives_0 ) ) )
            // InternalLibrettoProjectProfile.g:6404:2: ( ( rule__PrimitiveType__KindAlternatives_0 ) )
            {
            // InternalLibrettoProjectProfile.g:6404:2: ( ( rule__PrimitiveType__KindAlternatives_0 ) )
            // InternalLibrettoProjectProfile.g:6405:3: ( rule__PrimitiveType__KindAlternatives_0 )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getKindAlternatives_0()); 
            // InternalLibrettoProjectProfile.g:6406:3: ( rule__PrimitiveType__KindAlternatives_0 )
            // InternalLibrettoProjectProfile.g:6406:4: rule__PrimitiveType__KindAlternatives_0
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
    // InternalLibrettoProjectProfile.g:6414:1: rule__OperationSignature__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__OperationSignature__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:6418:1: ( ( RULE_ID ) )
            // InternalLibrettoProjectProfile.g:6419:2: ( RULE_ID )
            {
            // InternalLibrettoProjectProfile.g:6419:2: ( RULE_ID )
            // InternalLibrettoProjectProfile.g:6420:3: RULE_ID
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
    // InternalLibrettoProjectProfile.g:6429:1: rule__OperationSignature__ParamsAssignment_2_0 : ( ruleTypedParam ) ;
    public final void rule__OperationSignature__ParamsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:6433:1: ( ( ruleTypedParam ) )
            // InternalLibrettoProjectProfile.g:6434:2: ( ruleTypedParam )
            {
            // InternalLibrettoProjectProfile.g:6434:2: ( ruleTypedParam )
            // InternalLibrettoProjectProfile.g:6435:3: ruleTypedParam
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
    // InternalLibrettoProjectProfile.g:6444:1: rule__OperationSignature__ParamsAssignment_2_1_1 : ( ruleTypedParam ) ;
    public final void rule__OperationSignature__ParamsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:6448:1: ( ( ruleTypedParam ) )
            // InternalLibrettoProjectProfile.g:6449:2: ( ruleTypedParam )
            {
            // InternalLibrettoProjectProfile.g:6449:2: ( ruleTypedParam )
            // InternalLibrettoProjectProfile.g:6450:3: ruleTypedParam
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
    // InternalLibrettoProjectProfile.g:6459:1: rule__TypedParam__TypeAssignment_0 : ( ruleJavaType ) ;
    public final void rule__TypedParam__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:6463:1: ( ( ruleJavaType ) )
            // InternalLibrettoProjectProfile.g:6464:2: ( ruleJavaType )
            {
            // InternalLibrettoProjectProfile.g:6464:2: ( ruleJavaType )
            // InternalLibrettoProjectProfile.g:6465:3: ruleJavaType
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
    // InternalLibrettoProjectProfile.g:6474:1: rule__TypedParam__ParamNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TypedParam__ParamNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:6478:1: ( ( RULE_ID ) )
            // InternalLibrettoProjectProfile.g:6479:2: ( RULE_ID )
            {
            // InternalLibrettoProjectProfile.g:6479:2: ( RULE_ID )
            // InternalLibrettoProjectProfile.g:6480:3: RULE_ID
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
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0004400040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0004400000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0003800040000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0003800000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0004400000000000L});
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