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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'boolean'", "'int'", "'long'", "'double'", "'float'", "'short'", "'byte'", "'char'", "'void'", "'profile'", "'{'", "'}'", "'project'", "'rootDir'", "';'", "'modules'", "'module'", "'dir'", "'specsDir'", "'testsDir'", "'mainJavaDir'", "'basePackage'", "'surface'", "'for'", "'spec'", "'returnType'", "'method'", "'as'", "'paramType'", "'name'", "'recordSelfReturn'", "','", "'methodOverride'", "'returns'", "'.'", "'('", "')'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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


    // $ANTLR start "entryRuleSurfaceBlock"
    // InternalLibrettoProjectProfile.g:153:1: entryRuleSurfaceBlock : ruleSurfaceBlock EOF ;
    public final void entryRuleSurfaceBlock() throws RecognitionException {
        try {
            // InternalLibrettoProjectProfile.g:154:1: ( ruleSurfaceBlock EOF )
            // InternalLibrettoProjectProfile.g:155:1: ruleSurfaceBlock EOF
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
    // InternalLibrettoProjectProfile.g:162:1: ruleSurfaceBlock : ( ( rule__SurfaceBlock__Group__0 ) ) ;
    public final void ruleSurfaceBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:166:2: ( ( ( rule__SurfaceBlock__Group__0 ) ) )
            // InternalLibrettoProjectProfile.g:167:2: ( ( rule__SurfaceBlock__Group__0 ) )
            {
            // InternalLibrettoProjectProfile.g:167:2: ( ( rule__SurfaceBlock__Group__0 ) )
            // InternalLibrettoProjectProfile.g:168:3: ( rule__SurfaceBlock__Group__0 )
            {
             before(grammarAccess.getSurfaceBlockAccess().getGroup()); 
            // InternalLibrettoProjectProfile.g:169:3: ( rule__SurfaceBlock__Group__0 )
            // InternalLibrettoProjectProfile.g:169:4: rule__SurfaceBlock__Group__0
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
    // InternalLibrettoProjectProfile.g:178:1: entryRuleSurfaceElement : ruleSurfaceElement EOF ;
    public final void entryRuleSurfaceElement() throws RecognitionException {
        try {
            // InternalLibrettoProjectProfile.g:179:1: ( ruleSurfaceElement EOF )
            // InternalLibrettoProjectProfile.g:180:1: ruleSurfaceElement EOF
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
    // InternalLibrettoProjectProfile.g:187:1: ruleSurfaceElement : ( ( rule__SurfaceElement__Alternatives ) ) ;
    public final void ruleSurfaceElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:191:2: ( ( ( rule__SurfaceElement__Alternatives ) ) )
            // InternalLibrettoProjectProfile.g:192:2: ( ( rule__SurfaceElement__Alternatives ) )
            {
            // InternalLibrettoProjectProfile.g:192:2: ( ( rule__SurfaceElement__Alternatives ) )
            // InternalLibrettoProjectProfile.g:193:3: ( rule__SurfaceElement__Alternatives )
            {
             before(grammarAccess.getSurfaceElementAccess().getAlternatives()); 
            // InternalLibrettoProjectProfile.g:194:3: ( rule__SurfaceElement__Alternatives )
            // InternalLibrettoProjectProfile.g:194:4: rule__SurfaceElement__Alternatives
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
    // InternalLibrettoProjectProfile.g:203:1: entryRuleScopedSurface : ruleScopedSurface EOF ;
    public final void entryRuleScopedSurface() throws RecognitionException {
        try {
            // InternalLibrettoProjectProfile.g:204:1: ( ruleScopedSurface EOF )
            // InternalLibrettoProjectProfile.g:205:1: ruleScopedSurface EOF
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
    // InternalLibrettoProjectProfile.g:212:1: ruleScopedSurface : ( ( rule__ScopedSurface__Group__0 ) ) ;
    public final void ruleScopedSurface() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:216:2: ( ( ( rule__ScopedSurface__Group__0 ) ) )
            // InternalLibrettoProjectProfile.g:217:2: ( ( rule__ScopedSurface__Group__0 ) )
            {
            // InternalLibrettoProjectProfile.g:217:2: ( ( rule__ScopedSurface__Group__0 ) )
            // InternalLibrettoProjectProfile.g:218:3: ( rule__ScopedSurface__Group__0 )
            {
             before(grammarAccess.getScopedSurfaceAccess().getGroup()); 
            // InternalLibrettoProjectProfile.g:219:3: ( rule__ScopedSurface__Group__0 )
            // InternalLibrettoProjectProfile.g:219:4: rule__ScopedSurface__Group__0
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
    // InternalLibrettoProjectProfile.g:228:1: entryRuleSurfaceRule : ruleSurfaceRule EOF ;
    public final void entryRuleSurfaceRule() throws RecognitionException {
        try {
            // InternalLibrettoProjectProfile.g:229:1: ( ruleSurfaceRule EOF )
            // InternalLibrettoProjectProfile.g:230:1: ruleSurfaceRule EOF
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
    // InternalLibrettoProjectProfile.g:237:1: ruleSurfaceRule : ( ( rule__SurfaceRule__Alternatives ) ) ;
    public final void ruleSurfaceRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:241:2: ( ( ( rule__SurfaceRule__Alternatives ) ) )
            // InternalLibrettoProjectProfile.g:242:2: ( ( rule__SurfaceRule__Alternatives ) )
            {
            // InternalLibrettoProjectProfile.g:242:2: ( ( rule__SurfaceRule__Alternatives ) )
            // InternalLibrettoProjectProfile.g:243:3: ( rule__SurfaceRule__Alternatives )
            {
             before(grammarAccess.getSurfaceRuleAccess().getAlternatives()); 
            // InternalLibrettoProjectProfile.g:244:3: ( rule__SurfaceRule__Alternatives )
            // InternalLibrettoProjectProfile.g:244:4: rule__SurfaceRule__Alternatives
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
    // InternalLibrettoProjectProfile.g:253:1: entryRuleReturnTypeRule : ruleReturnTypeRule EOF ;
    public final void entryRuleReturnTypeRule() throws RecognitionException {
        try {
            // InternalLibrettoProjectProfile.g:254:1: ( ruleReturnTypeRule EOF )
            // InternalLibrettoProjectProfile.g:255:1: ruleReturnTypeRule EOF
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
    // InternalLibrettoProjectProfile.g:262:1: ruleReturnTypeRule : ( ( rule__ReturnTypeRule__Group__0 ) ) ;
    public final void ruleReturnTypeRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:266:2: ( ( ( rule__ReturnTypeRule__Group__0 ) ) )
            // InternalLibrettoProjectProfile.g:267:2: ( ( rule__ReturnTypeRule__Group__0 ) )
            {
            // InternalLibrettoProjectProfile.g:267:2: ( ( rule__ReturnTypeRule__Group__0 ) )
            // InternalLibrettoProjectProfile.g:268:3: ( rule__ReturnTypeRule__Group__0 )
            {
             before(grammarAccess.getReturnTypeRuleAccess().getGroup()); 
            // InternalLibrettoProjectProfile.g:269:3: ( rule__ReturnTypeRule__Group__0 )
            // InternalLibrettoProjectProfile.g:269:4: rule__ReturnTypeRule__Group__0
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
    // InternalLibrettoProjectProfile.g:278:1: entryRuleParamTypeRule : ruleParamTypeRule EOF ;
    public final void entryRuleParamTypeRule() throws RecognitionException {
        try {
            // InternalLibrettoProjectProfile.g:279:1: ( ruleParamTypeRule EOF )
            // InternalLibrettoProjectProfile.g:280:1: ruleParamTypeRule EOF
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
    // InternalLibrettoProjectProfile.g:287:1: ruleParamTypeRule : ( ( rule__ParamTypeRule__Group__0 ) ) ;
    public final void ruleParamTypeRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:291:2: ( ( ( rule__ParamTypeRule__Group__0 ) ) )
            // InternalLibrettoProjectProfile.g:292:2: ( ( rule__ParamTypeRule__Group__0 ) )
            {
            // InternalLibrettoProjectProfile.g:292:2: ( ( rule__ParamTypeRule__Group__0 ) )
            // InternalLibrettoProjectProfile.g:293:3: ( rule__ParamTypeRule__Group__0 )
            {
             before(grammarAccess.getParamTypeRuleAccess().getGroup()); 
            // InternalLibrettoProjectProfile.g:294:3: ( rule__ParamTypeRule__Group__0 )
            // InternalLibrettoProjectProfile.g:294:4: rule__ParamTypeRule__Group__0
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
    // InternalLibrettoProjectProfile.g:303:1: entryRuleRecordSelfReturnRule : ruleRecordSelfReturnRule EOF ;
    public final void entryRuleRecordSelfReturnRule() throws RecognitionException {
        try {
            // InternalLibrettoProjectProfile.g:304:1: ( ruleRecordSelfReturnRule EOF )
            // InternalLibrettoProjectProfile.g:305:1: ruleRecordSelfReturnRule EOF
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
    // InternalLibrettoProjectProfile.g:312:1: ruleRecordSelfReturnRule : ( ( rule__RecordSelfReturnRule__Group__0 ) ) ;
    public final void ruleRecordSelfReturnRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:316:2: ( ( ( rule__RecordSelfReturnRule__Group__0 ) ) )
            // InternalLibrettoProjectProfile.g:317:2: ( ( rule__RecordSelfReturnRule__Group__0 ) )
            {
            // InternalLibrettoProjectProfile.g:317:2: ( ( rule__RecordSelfReturnRule__Group__0 ) )
            // InternalLibrettoProjectProfile.g:318:3: ( rule__RecordSelfReturnRule__Group__0 )
            {
             before(grammarAccess.getRecordSelfReturnRuleAccess().getGroup()); 
            // InternalLibrettoProjectProfile.g:319:3: ( rule__RecordSelfReturnRule__Group__0 )
            // InternalLibrettoProjectProfile.g:319:4: rule__RecordSelfReturnRule__Group__0
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
    // InternalLibrettoProjectProfile.g:328:1: entryRuleMethodOverrideRule : ruleMethodOverrideRule EOF ;
    public final void entryRuleMethodOverrideRule() throws RecognitionException {
        try {
            // InternalLibrettoProjectProfile.g:329:1: ( ruleMethodOverrideRule EOF )
            // InternalLibrettoProjectProfile.g:330:1: ruleMethodOverrideRule EOF
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
    // InternalLibrettoProjectProfile.g:337:1: ruleMethodOverrideRule : ( ( rule__MethodOverrideRule__Group__0 ) ) ;
    public final void ruleMethodOverrideRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:341:2: ( ( ( rule__MethodOverrideRule__Group__0 ) ) )
            // InternalLibrettoProjectProfile.g:342:2: ( ( rule__MethodOverrideRule__Group__0 ) )
            {
            // InternalLibrettoProjectProfile.g:342:2: ( ( rule__MethodOverrideRule__Group__0 ) )
            // InternalLibrettoProjectProfile.g:343:3: ( rule__MethodOverrideRule__Group__0 )
            {
             before(grammarAccess.getMethodOverrideRuleAccess().getGroup()); 
            // InternalLibrettoProjectProfile.g:344:3: ( rule__MethodOverrideRule__Group__0 )
            // InternalLibrettoProjectProfile.g:344:4: rule__MethodOverrideRule__Group__0
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
    // InternalLibrettoProjectProfile.g:353:1: entryRuleJavaType : ruleJavaType EOF ;
    public final void entryRuleJavaType() throws RecognitionException {
        try {
            // InternalLibrettoProjectProfile.g:354:1: ( ruleJavaType EOF )
            // InternalLibrettoProjectProfile.g:355:1: ruleJavaType EOF
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
    // InternalLibrettoProjectProfile.g:362:1: ruleJavaType : ( ( rule__JavaType__Alternatives ) ) ;
    public final void ruleJavaType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:366:2: ( ( ( rule__JavaType__Alternatives ) ) )
            // InternalLibrettoProjectProfile.g:367:2: ( ( rule__JavaType__Alternatives ) )
            {
            // InternalLibrettoProjectProfile.g:367:2: ( ( rule__JavaType__Alternatives ) )
            // InternalLibrettoProjectProfile.g:368:3: ( rule__JavaType__Alternatives )
            {
             before(grammarAccess.getJavaTypeAccess().getAlternatives()); 
            // InternalLibrettoProjectProfile.g:369:3: ( rule__JavaType__Alternatives )
            // InternalLibrettoProjectProfile.g:369:4: rule__JavaType__Alternatives
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
    // InternalLibrettoProjectProfile.g:378:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalLibrettoProjectProfile.g:379:1: ( ruleQualifiedName EOF )
            // InternalLibrettoProjectProfile.g:380:1: ruleQualifiedName EOF
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
    // InternalLibrettoProjectProfile.g:387:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:391:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalLibrettoProjectProfile.g:392:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalLibrettoProjectProfile.g:392:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalLibrettoProjectProfile.g:393:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalLibrettoProjectProfile.g:394:3: ( rule__QualifiedName__Group__0 )
            // InternalLibrettoProjectProfile.g:394:4: rule__QualifiedName__Group__0
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
    // InternalLibrettoProjectProfile.g:403:1: entryRulePrimitiveType : rulePrimitiveType EOF ;
    public final void entryRulePrimitiveType() throws RecognitionException {
        try {
            // InternalLibrettoProjectProfile.g:404:1: ( rulePrimitiveType EOF )
            // InternalLibrettoProjectProfile.g:405:1: rulePrimitiveType EOF
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
    // InternalLibrettoProjectProfile.g:412:1: rulePrimitiveType : ( ( rule__PrimitiveType__KindAssignment ) ) ;
    public final void rulePrimitiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:416:2: ( ( ( rule__PrimitiveType__KindAssignment ) ) )
            // InternalLibrettoProjectProfile.g:417:2: ( ( rule__PrimitiveType__KindAssignment ) )
            {
            // InternalLibrettoProjectProfile.g:417:2: ( ( rule__PrimitiveType__KindAssignment ) )
            // InternalLibrettoProjectProfile.g:418:3: ( rule__PrimitiveType__KindAssignment )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getKindAssignment()); 
            // InternalLibrettoProjectProfile.g:419:3: ( rule__PrimitiveType__KindAssignment )
            // InternalLibrettoProjectProfile.g:419:4: rule__PrimitiveType__KindAssignment
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
    // InternalLibrettoProjectProfile.g:428:1: entryRuleOperationSignature : ruleOperationSignature EOF ;
    public final void entryRuleOperationSignature() throws RecognitionException {
        try {
            // InternalLibrettoProjectProfile.g:429:1: ( ruleOperationSignature EOF )
            // InternalLibrettoProjectProfile.g:430:1: ruleOperationSignature EOF
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
    // InternalLibrettoProjectProfile.g:437:1: ruleOperationSignature : ( ( rule__OperationSignature__Group__0 ) ) ;
    public final void ruleOperationSignature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:441:2: ( ( ( rule__OperationSignature__Group__0 ) ) )
            // InternalLibrettoProjectProfile.g:442:2: ( ( rule__OperationSignature__Group__0 ) )
            {
            // InternalLibrettoProjectProfile.g:442:2: ( ( rule__OperationSignature__Group__0 ) )
            // InternalLibrettoProjectProfile.g:443:3: ( rule__OperationSignature__Group__0 )
            {
             before(grammarAccess.getOperationSignatureAccess().getGroup()); 
            // InternalLibrettoProjectProfile.g:444:3: ( rule__OperationSignature__Group__0 )
            // InternalLibrettoProjectProfile.g:444:4: rule__OperationSignature__Group__0
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
    // InternalLibrettoProjectProfile.g:453:1: entryRuleTypedParam : ruleTypedParam EOF ;
    public final void entryRuleTypedParam() throws RecognitionException {
        try {
            // InternalLibrettoProjectProfile.g:454:1: ( ruleTypedParam EOF )
            // InternalLibrettoProjectProfile.g:455:1: ruleTypedParam EOF
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
    // InternalLibrettoProjectProfile.g:462:1: ruleTypedParam : ( ( rule__TypedParam__Group__0 ) ) ;
    public final void ruleTypedParam() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:466:2: ( ( ( rule__TypedParam__Group__0 ) ) )
            // InternalLibrettoProjectProfile.g:467:2: ( ( rule__TypedParam__Group__0 ) )
            {
            // InternalLibrettoProjectProfile.g:467:2: ( ( rule__TypedParam__Group__0 ) )
            // InternalLibrettoProjectProfile.g:468:3: ( rule__TypedParam__Group__0 )
            {
             before(grammarAccess.getTypedParamAccess().getGroup()); 
            // InternalLibrettoProjectProfile.g:469:3: ( rule__TypedParam__Group__0 )
            // InternalLibrettoProjectProfile.g:469:4: rule__TypedParam__Group__0
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


    // $ANTLR start "rule__SurfaceElement__Alternatives"
    // InternalLibrettoProjectProfile.g:477:1: rule__SurfaceElement__Alternatives : ( ( ruleScopedSurface ) | ( ruleSurfaceRule ) );
    public final void rule__SurfaceElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:481:1: ( ( ruleScopedSurface ) | ( ruleSurfaceRule ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==34) ) {
                alt1=1;
            }
            else if ( (LA1_0==36||LA1_0==39||LA1_0==41||LA1_0==43) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:482:2: ( ruleScopedSurface )
                    {
                    // InternalLibrettoProjectProfile.g:482:2: ( ruleScopedSurface )
                    // InternalLibrettoProjectProfile.g:483:3: ruleScopedSurface
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
                    // InternalLibrettoProjectProfile.g:488:2: ( ruleSurfaceRule )
                    {
                    // InternalLibrettoProjectProfile.g:488:2: ( ruleSurfaceRule )
                    // InternalLibrettoProjectProfile.g:489:3: ruleSurfaceRule
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
    // InternalLibrettoProjectProfile.g:498:1: rule__ScopedSurface__Alternatives_1 : ( ( ( rule__ScopedSurface__Group_1_0__0 ) ) | ( ( rule__ScopedSurface__Group_1_1__0 ) ) );
    public final void rule__ScopedSurface__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:502:1: ( ( ( rule__ScopedSurface__Group_1_0__0 ) ) | ( ( rule__ScopedSurface__Group_1_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==27) ) {
                alt2=1;
            }
            else if ( (LA2_0==35) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:503:2: ( ( rule__ScopedSurface__Group_1_0__0 ) )
                    {
                    // InternalLibrettoProjectProfile.g:503:2: ( ( rule__ScopedSurface__Group_1_0__0 ) )
                    // InternalLibrettoProjectProfile.g:504:3: ( rule__ScopedSurface__Group_1_0__0 )
                    {
                     before(grammarAccess.getScopedSurfaceAccess().getGroup_1_0()); 
                    // InternalLibrettoProjectProfile.g:505:3: ( rule__ScopedSurface__Group_1_0__0 )
                    // InternalLibrettoProjectProfile.g:505:4: rule__ScopedSurface__Group_1_0__0
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
                    // InternalLibrettoProjectProfile.g:509:2: ( ( rule__ScopedSurface__Group_1_1__0 ) )
                    {
                    // InternalLibrettoProjectProfile.g:509:2: ( ( rule__ScopedSurface__Group_1_1__0 ) )
                    // InternalLibrettoProjectProfile.g:510:3: ( rule__ScopedSurface__Group_1_1__0 )
                    {
                     before(grammarAccess.getScopedSurfaceAccess().getGroup_1_1()); 
                    // InternalLibrettoProjectProfile.g:511:3: ( rule__ScopedSurface__Group_1_1__0 )
                    // InternalLibrettoProjectProfile.g:511:4: rule__ScopedSurface__Group_1_1__0
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
    // InternalLibrettoProjectProfile.g:519:1: rule__SurfaceRule__Alternatives : ( ( ruleReturnTypeRule ) | ( ruleParamTypeRule ) | ( ruleRecordSelfReturnRule ) | ( ruleMethodOverrideRule ) );
    public final void rule__SurfaceRule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:523:1: ( ( ruleReturnTypeRule ) | ( ruleParamTypeRule ) | ( ruleRecordSelfReturnRule ) | ( ruleMethodOverrideRule ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt3=1;
                }
                break;
            case 39:
                {
                alt3=2;
                }
                break;
            case 41:
                {
                alt3=3;
                }
                break;
            case 43:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:524:2: ( ruleReturnTypeRule )
                    {
                    // InternalLibrettoProjectProfile.g:524:2: ( ruleReturnTypeRule )
                    // InternalLibrettoProjectProfile.g:525:3: ruleReturnTypeRule
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
                    // InternalLibrettoProjectProfile.g:530:2: ( ruleParamTypeRule )
                    {
                    // InternalLibrettoProjectProfile.g:530:2: ( ruleParamTypeRule )
                    // InternalLibrettoProjectProfile.g:531:3: ruleParamTypeRule
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
                    // InternalLibrettoProjectProfile.g:536:2: ( ruleRecordSelfReturnRule )
                    {
                    // InternalLibrettoProjectProfile.g:536:2: ( ruleRecordSelfReturnRule )
                    // InternalLibrettoProjectProfile.g:537:3: ruleRecordSelfReturnRule
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
                    // InternalLibrettoProjectProfile.g:542:2: ( ruleMethodOverrideRule )
                    {
                    // InternalLibrettoProjectProfile.g:542:2: ( ruleMethodOverrideRule )
                    // InternalLibrettoProjectProfile.g:543:3: ruleMethodOverrideRule
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
    // InternalLibrettoProjectProfile.g:552:1: rule__JavaType__Alternatives : ( ( rulePrimitiveType ) | ( ruleQualifiedName ) );
    public final void rule__JavaType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:556:1: ( ( rulePrimitiveType ) | ( ruleQualifiedName ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=11 && LA4_0<=19)) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:557:2: ( rulePrimitiveType )
                    {
                    // InternalLibrettoProjectProfile.g:557:2: ( rulePrimitiveType )
                    // InternalLibrettoProjectProfile.g:558:3: rulePrimitiveType
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
                    // InternalLibrettoProjectProfile.g:563:2: ( ruleQualifiedName )
                    {
                    // InternalLibrettoProjectProfile.g:563:2: ( ruleQualifiedName )
                    // InternalLibrettoProjectProfile.g:564:3: ruleQualifiedName
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
    // InternalLibrettoProjectProfile.g:573:1: rule__PrimitiveType__KindAlternatives_0 : ( ( 'boolean' ) | ( 'int' ) | ( 'long' ) | ( 'double' ) | ( 'float' ) | ( 'short' ) | ( 'byte' ) | ( 'char' ) | ( 'void' ) );
    public final void rule__PrimitiveType__KindAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:577:1: ( ( 'boolean' ) | ( 'int' ) | ( 'long' ) | ( 'double' ) | ( 'float' ) | ( 'short' ) | ( 'byte' ) | ( 'char' ) | ( 'void' ) )
            int alt5=9;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt5=1;
                }
                break;
            case 12:
                {
                alt5=2;
                }
                break;
            case 13:
                {
                alt5=3;
                }
                break;
            case 14:
                {
                alt5=4;
                }
                break;
            case 15:
                {
                alt5=5;
                }
                break;
            case 16:
                {
                alt5=6;
                }
                break;
            case 17:
                {
                alt5=7;
                }
                break;
            case 18:
                {
                alt5=8;
                }
                break;
            case 19:
                {
                alt5=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:578:2: ( 'boolean' )
                    {
                    // InternalLibrettoProjectProfile.g:578:2: ( 'boolean' )
                    // InternalLibrettoProjectProfile.g:579:3: 'boolean'
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getKindBooleanKeyword_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getPrimitiveTypeAccess().getKindBooleanKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLibrettoProjectProfile.g:584:2: ( 'int' )
                    {
                    // InternalLibrettoProjectProfile.g:584:2: ( 'int' )
                    // InternalLibrettoProjectProfile.g:585:3: 'int'
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getKindIntKeyword_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getPrimitiveTypeAccess().getKindIntKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLibrettoProjectProfile.g:590:2: ( 'long' )
                    {
                    // InternalLibrettoProjectProfile.g:590:2: ( 'long' )
                    // InternalLibrettoProjectProfile.g:591:3: 'long'
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getKindLongKeyword_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getPrimitiveTypeAccess().getKindLongKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalLibrettoProjectProfile.g:596:2: ( 'double' )
                    {
                    // InternalLibrettoProjectProfile.g:596:2: ( 'double' )
                    // InternalLibrettoProjectProfile.g:597:3: 'double'
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getKindDoubleKeyword_0_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getPrimitiveTypeAccess().getKindDoubleKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalLibrettoProjectProfile.g:602:2: ( 'float' )
                    {
                    // InternalLibrettoProjectProfile.g:602:2: ( 'float' )
                    // InternalLibrettoProjectProfile.g:603:3: 'float'
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getKindFloatKeyword_0_4()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getPrimitiveTypeAccess().getKindFloatKeyword_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalLibrettoProjectProfile.g:608:2: ( 'short' )
                    {
                    // InternalLibrettoProjectProfile.g:608:2: ( 'short' )
                    // InternalLibrettoProjectProfile.g:609:3: 'short'
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getKindShortKeyword_0_5()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getPrimitiveTypeAccess().getKindShortKeyword_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalLibrettoProjectProfile.g:614:2: ( 'byte' )
                    {
                    // InternalLibrettoProjectProfile.g:614:2: ( 'byte' )
                    // InternalLibrettoProjectProfile.g:615:3: 'byte'
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getKindByteKeyword_0_6()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getPrimitiveTypeAccess().getKindByteKeyword_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalLibrettoProjectProfile.g:620:2: ( 'char' )
                    {
                    // InternalLibrettoProjectProfile.g:620:2: ( 'char' )
                    // InternalLibrettoProjectProfile.g:621:3: 'char'
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getKindCharKeyword_0_7()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getPrimitiveTypeAccess().getKindCharKeyword_0_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalLibrettoProjectProfile.g:626:2: ( 'void' )
                    {
                    // InternalLibrettoProjectProfile.g:626:2: ( 'void' )
                    // InternalLibrettoProjectProfile.g:627:3: 'void'
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getKindVoidKeyword_0_8()); 
                    match(input,19,FOLLOW_2); 
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


    // $ANTLR start "rule__ProjectProfile__Group__0"
    // InternalLibrettoProjectProfile.g:636:1: rule__ProjectProfile__Group__0 : rule__ProjectProfile__Group__0__Impl rule__ProjectProfile__Group__1 ;
    public final void rule__ProjectProfile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:640:1: ( rule__ProjectProfile__Group__0__Impl rule__ProjectProfile__Group__1 )
            // InternalLibrettoProjectProfile.g:641:2: rule__ProjectProfile__Group__0__Impl rule__ProjectProfile__Group__1
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
    // InternalLibrettoProjectProfile.g:648:1: rule__ProjectProfile__Group__0__Impl : ( 'profile' ) ;
    public final void rule__ProjectProfile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:652:1: ( ( 'profile' ) )
            // InternalLibrettoProjectProfile.g:653:1: ( 'profile' )
            {
            // InternalLibrettoProjectProfile.g:653:1: ( 'profile' )
            // InternalLibrettoProjectProfile.g:654:2: 'profile'
            {
             before(grammarAccess.getProjectProfileAccess().getProfileKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getProjectProfileAccess().getProfileKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectProfile__Group__0__Impl"


    // $ANTLR start "rule__ProjectProfile__Group__1"
    // InternalLibrettoProjectProfile.g:663:1: rule__ProjectProfile__Group__1 : rule__ProjectProfile__Group__1__Impl rule__ProjectProfile__Group__2 ;
    public final void rule__ProjectProfile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:667:1: ( rule__ProjectProfile__Group__1__Impl rule__ProjectProfile__Group__2 )
            // InternalLibrettoProjectProfile.g:668:2: rule__ProjectProfile__Group__1__Impl rule__ProjectProfile__Group__2
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
    // InternalLibrettoProjectProfile.g:675:1: rule__ProjectProfile__Group__1__Impl : ( ( rule__ProjectProfile__ProfileNameAssignment_1 ) ) ;
    public final void rule__ProjectProfile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:679:1: ( ( ( rule__ProjectProfile__ProfileNameAssignment_1 ) ) )
            // InternalLibrettoProjectProfile.g:680:1: ( ( rule__ProjectProfile__ProfileNameAssignment_1 ) )
            {
            // InternalLibrettoProjectProfile.g:680:1: ( ( rule__ProjectProfile__ProfileNameAssignment_1 ) )
            // InternalLibrettoProjectProfile.g:681:2: ( rule__ProjectProfile__ProfileNameAssignment_1 )
            {
             before(grammarAccess.getProjectProfileAccess().getProfileNameAssignment_1()); 
            // InternalLibrettoProjectProfile.g:682:2: ( rule__ProjectProfile__ProfileNameAssignment_1 )
            // InternalLibrettoProjectProfile.g:682:3: rule__ProjectProfile__ProfileNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ProjectProfile__ProfileNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProjectProfileAccess().getProfileNameAssignment_1()); 

            }


            }

        }
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
    // InternalLibrettoProjectProfile.g:690:1: rule__ProjectProfile__Group__2 : rule__ProjectProfile__Group__2__Impl rule__ProjectProfile__Group__3 ;
    public final void rule__ProjectProfile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:694:1: ( rule__ProjectProfile__Group__2__Impl rule__ProjectProfile__Group__3 )
            // InternalLibrettoProjectProfile.g:695:2: rule__ProjectProfile__Group__2__Impl rule__ProjectProfile__Group__3
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
    // InternalLibrettoProjectProfile.g:702:1: rule__ProjectProfile__Group__2__Impl : ( '{' ) ;
    public final void rule__ProjectProfile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:706:1: ( ( '{' ) )
            // InternalLibrettoProjectProfile.g:707:1: ( '{' )
            {
            // InternalLibrettoProjectProfile.g:707:1: ( '{' )
            // InternalLibrettoProjectProfile.g:708:2: '{'
            {
             before(grammarAccess.getProjectProfileAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getProjectProfileAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // InternalLibrettoProjectProfile.g:717:1: rule__ProjectProfile__Group__3 : rule__ProjectProfile__Group__3__Impl rule__ProjectProfile__Group__4 ;
    public final void rule__ProjectProfile__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:721:1: ( rule__ProjectProfile__Group__3__Impl rule__ProjectProfile__Group__4 )
            // InternalLibrettoProjectProfile.g:722:2: rule__ProjectProfile__Group__3__Impl rule__ProjectProfile__Group__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalLibrettoProjectProfile.g:729:1: rule__ProjectProfile__Group__3__Impl : ( ( rule__ProjectProfile__ProjectAssignment_3 )? ) ;
    public final void rule__ProjectProfile__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:733:1: ( ( ( rule__ProjectProfile__ProjectAssignment_3 )? ) )
            // InternalLibrettoProjectProfile.g:734:1: ( ( rule__ProjectProfile__ProjectAssignment_3 )? )
            {
            // InternalLibrettoProjectProfile.g:734:1: ( ( rule__ProjectProfile__ProjectAssignment_3 )? )
            // InternalLibrettoProjectProfile.g:735:2: ( rule__ProjectProfile__ProjectAssignment_3 )?
            {
             before(grammarAccess.getProjectProfileAccess().getProjectAssignment_3()); 
            // InternalLibrettoProjectProfile.g:736:2: ( rule__ProjectProfile__ProjectAssignment_3 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:736:3: rule__ProjectProfile__ProjectAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProjectProfile__ProjectAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProjectProfileAccess().getProjectAssignment_3()); 

            }


            }

        }
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
    // InternalLibrettoProjectProfile.g:744:1: rule__ProjectProfile__Group__4 : rule__ProjectProfile__Group__4__Impl rule__ProjectProfile__Group__5 ;
    public final void rule__ProjectProfile__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:748:1: ( rule__ProjectProfile__Group__4__Impl rule__ProjectProfile__Group__5 )
            // InternalLibrettoProjectProfile.g:749:2: rule__ProjectProfile__Group__4__Impl rule__ProjectProfile__Group__5
            {
            pushFollow(FOLLOW_5);
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
    // InternalLibrettoProjectProfile.g:756:1: rule__ProjectProfile__Group__4__Impl : ( ( rule__ProjectProfile__SurfaceAssignment_4 )? ) ;
    public final void rule__ProjectProfile__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:760:1: ( ( ( rule__ProjectProfile__SurfaceAssignment_4 )? ) )
            // InternalLibrettoProjectProfile.g:761:1: ( ( rule__ProjectProfile__SurfaceAssignment_4 )? )
            {
            // InternalLibrettoProjectProfile.g:761:1: ( ( rule__ProjectProfile__SurfaceAssignment_4 )? )
            // InternalLibrettoProjectProfile.g:762:2: ( rule__ProjectProfile__SurfaceAssignment_4 )?
            {
             before(grammarAccess.getProjectProfileAccess().getSurfaceAssignment_4()); 
            // InternalLibrettoProjectProfile.g:763:2: ( rule__ProjectProfile__SurfaceAssignment_4 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==33) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:763:3: rule__ProjectProfile__SurfaceAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProjectProfile__SurfaceAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProjectProfileAccess().getSurfaceAssignment_4()); 

            }


            }

        }
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
    // InternalLibrettoProjectProfile.g:771:1: rule__ProjectProfile__Group__5 : rule__ProjectProfile__Group__5__Impl ;
    public final void rule__ProjectProfile__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:775:1: ( rule__ProjectProfile__Group__5__Impl )
            // InternalLibrettoProjectProfile.g:776:2: rule__ProjectProfile__Group__5__Impl
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
    // InternalLibrettoProjectProfile.g:782:1: rule__ProjectProfile__Group__5__Impl : ( '}' ) ;
    public final void rule__ProjectProfile__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:786:1: ( ( '}' ) )
            // InternalLibrettoProjectProfile.g:787:1: ( '}' )
            {
            // InternalLibrettoProjectProfile.g:787:1: ( '}' )
            // InternalLibrettoProjectProfile.g:788:2: '}'
            {
             before(grammarAccess.getProjectProfileAccess().getRightCurlyBracketKeyword_5()); 
            match(input,22,FOLLOW_2); 
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
    // InternalLibrettoProjectProfile.g:798:1: rule__ProjectBlock__Group__0 : rule__ProjectBlock__Group__0__Impl rule__ProjectBlock__Group__1 ;
    public final void rule__ProjectBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:802:1: ( rule__ProjectBlock__Group__0__Impl rule__ProjectBlock__Group__1 )
            // InternalLibrettoProjectProfile.g:803:2: rule__ProjectBlock__Group__0__Impl rule__ProjectBlock__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalLibrettoProjectProfile.g:810:1: rule__ProjectBlock__Group__0__Impl : ( 'project' ) ;
    public final void rule__ProjectBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:814:1: ( ( 'project' ) )
            // InternalLibrettoProjectProfile.g:815:1: ( 'project' )
            {
            // InternalLibrettoProjectProfile.g:815:1: ( 'project' )
            // InternalLibrettoProjectProfile.g:816:2: 'project'
            {
             before(grammarAccess.getProjectBlockAccess().getProjectKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getProjectBlockAccess().getProjectKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectBlock__Group__0__Impl"


    // $ANTLR start "rule__ProjectBlock__Group__1"
    // InternalLibrettoProjectProfile.g:825:1: rule__ProjectBlock__Group__1 : rule__ProjectBlock__Group__1__Impl rule__ProjectBlock__Group__2 ;
    public final void rule__ProjectBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:829:1: ( rule__ProjectBlock__Group__1__Impl rule__ProjectBlock__Group__2 )
            // InternalLibrettoProjectProfile.g:830:2: rule__ProjectBlock__Group__1__Impl rule__ProjectBlock__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalLibrettoProjectProfile.g:837:1: rule__ProjectBlock__Group__1__Impl : ( '{' ) ;
    public final void rule__ProjectBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:841:1: ( ( '{' ) )
            // InternalLibrettoProjectProfile.g:842:1: ( '{' )
            {
            // InternalLibrettoProjectProfile.g:842:1: ( '{' )
            // InternalLibrettoProjectProfile.g:843:2: '{'
            {
             before(grammarAccess.getProjectBlockAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getProjectBlockAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // InternalLibrettoProjectProfile.g:852:1: rule__ProjectBlock__Group__2 : rule__ProjectBlock__Group__2__Impl rule__ProjectBlock__Group__3 ;
    public final void rule__ProjectBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:856:1: ( rule__ProjectBlock__Group__2__Impl rule__ProjectBlock__Group__3 )
            // InternalLibrettoProjectProfile.g:857:2: rule__ProjectBlock__Group__2__Impl rule__ProjectBlock__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalLibrettoProjectProfile.g:864:1: rule__ProjectBlock__Group__2__Impl : ( ( rule__ProjectBlock__Group_2__0 )? ) ;
    public final void rule__ProjectBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:868:1: ( ( ( rule__ProjectBlock__Group_2__0 )? ) )
            // InternalLibrettoProjectProfile.g:869:1: ( ( rule__ProjectBlock__Group_2__0 )? )
            {
            // InternalLibrettoProjectProfile.g:869:1: ( ( rule__ProjectBlock__Group_2__0 )? )
            // InternalLibrettoProjectProfile.g:870:2: ( rule__ProjectBlock__Group_2__0 )?
            {
             before(grammarAccess.getProjectBlockAccess().getGroup_2()); 
            // InternalLibrettoProjectProfile.g:871:2: ( rule__ProjectBlock__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:871:3: rule__ProjectBlock__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProjectBlock__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProjectBlockAccess().getGroup_2()); 

            }


            }

        }
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
    // InternalLibrettoProjectProfile.g:879:1: rule__ProjectBlock__Group__3 : rule__ProjectBlock__Group__3__Impl rule__ProjectBlock__Group__4 ;
    public final void rule__ProjectBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:883:1: ( rule__ProjectBlock__Group__3__Impl rule__ProjectBlock__Group__4 )
            // InternalLibrettoProjectProfile.g:884:2: rule__ProjectBlock__Group__3__Impl rule__ProjectBlock__Group__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalLibrettoProjectProfile.g:891:1: rule__ProjectBlock__Group__3__Impl : ( ( rule__ProjectBlock__ModulesAssignment_3 )? ) ;
    public final void rule__ProjectBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:895:1: ( ( ( rule__ProjectBlock__ModulesAssignment_3 )? ) )
            // InternalLibrettoProjectProfile.g:896:1: ( ( rule__ProjectBlock__ModulesAssignment_3 )? )
            {
            // InternalLibrettoProjectProfile.g:896:1: ( ( rule__ProjectBlock__ModulesAssignment_3 )? )
            // InternalLibrettoProjectProfile.g:897:2: ( rule__ProjectBlock__ModulesAssignment_3 )?
            {
             before(grammarAccess.getProjectBlockAccess().getModulesAssignment_3()); 
            // InternalLibrettoProjectProfile.g:898:2: ( rule__ProjectBlock__ModulesAssignment_3 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:898:3: rule__ProjectBlock__ModulesAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProjectBlock__ModulesAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProjectBlockAccess().getModulesAssignment_3()); 

            }


            }

        }
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
    // InternalLibrettoProjectProfile.g:906:1: rule__ProjectBlock__Group__4 : rule__ProjectBlock__Group__4__Impl ;
    public final void rule__ProjectBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:910:1: ( rule__ProjectBlock__Group__4__Impl )
            // InternalLibrettoProjectProfile.g:911:2: rule__ProjectBlock__Group__4__Impl
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
    // InternalLibrettoProjectProfile.g:917:1: rule__ProjectBlock__Group__4__Impl : ( '}' ) ;
    public final void rule__ProjectBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:921:1: ( ( '}' ) )
            // InternalLibrettoProjectProfile.g:922:1: ( '}' )
            {
            // InternalLibrettoProjectProfile.g:922:1: ( '}' )
            // InternalLibrettoProjectProfile.g:923:2: '}'
            {
             before(grammarAccess.getProjectBlockAccess().getRightCurlyBracketKeyword_4()); 
            match(input,22,FOLLOW_2); 
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


    // $ANTLR start "rule__ProjectBlock__Group_2__0"
    // InternalLibrettoProjectProfile.g:933:1: rule__ProjectBlock__Group_2__0 : rule__ProjectBlock__Group_2__0__Impl rule__ProjectBlock__Group_2__1 ;
    public final void rule__ProjectBlock__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:937:1: ( rule__ProjectBlock__Group_2__0__Impl rule__ProjectBlock__Group_2__1 )
            // InternalLibrettoProjectProfile.g:938:2: rule__ProjectBlock__Group_2__0__Impl rule__ProjectBlock__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__ProjectBlock__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectBlock__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectBlock__Group_2__0"


    // $ANTLR start "rule__ProjectBlock__Group_2__0__Impl"
    // InternalLibrettoProjectProfile.g:945:1: rule__ProjectBlock__Group_2__0__Impl : ( 'rootDir' ) ;
    public final void rule__ProjectBlock__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:949:1: ( ( 'rootDir' ) )
            // InternalLibrettoProjectProfile.g:950:1: ( 'rootDir' )
            {
            // InternalLibrettoProjectProfile.g:950:1: ( 'rootDir' )
            // InternalLibrettoProjectProfile.g:951:2: 'rootDir'
            {
             before(grammarAccess.getProjectBlockAccess().getRootDirKeyword_2_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getProjectBlockAccess().getRootDirKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectBlock__Group_2__0__Impl"


    // $ANTLR start "rule__ProjectBlock__Group_2__1"
    // InternalLibrettoProjectProfile.g:960:1: rule__ProjectBlock__Group_2__1 : rule__ProjectBlock__Group_2__1__Impl rule__ProjectBlock__Group_2__2 ;
    public final void rule__ProjectBlock__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:964:1: ( rule__ProjectBlock__Group_2__1__Impl rule__ProjectBlock__Group_2__2 )
            // InternalLibrettoProjectProfile.g:965:2: rule__ProjectBlock__Group_2__1__Impl rule__ProjectBlock__Group_2__2
            {
            pushFollow(FOLLOW_7);
            rule__ProjectBlock__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectBlock__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectBlock__Group_2__1"


    // $ANTLR start "rule__ProjectBlock__Group_2__1__Impl"
    // InternalLibrettoProjectProfile.g:972:1: rule__ProjectBlock__Group_2__1__Impl : ( ( rule__ProjectBlock__RootDirAssignment_2_1 ) ) ;
    public final void rule__ProjectBlock__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:976:1: ( ( ( rule__ProjectBlock__RootDirAssignment_2_1 ) ) )
            // InternalLibrettoProjectProfile.g:977:1: ( ( rule__ProjectBlock__RootDirAssignment_2_1 ) )
            {
            // InternalLibrettoProjectProfile.g:977:1: ( ( rule__ProjectBlock__RootDirAssignment_2_1 ) )
            // InternalLibrettoProjectProfile.g:978:2: ( rule__ProjectBlock__RootDirAssignment_2_1 )
            {
             before(grammarAccess.getProjectBlockAccess().getRootDirAssignment_2_1()); 
            // InternalLibrettoProjectProfile.g:979:2: ( rule__ProjectBlock__RootDirAssignment_2_1 )
            // InternalLibrettoProjectProfile.g:979:3: rule__ProjectBlock__RootDirAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ProjectBlock__RootDirAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getProjectBlockAccess().getRootDirAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectBlock__Group_2__1__Impl"


    // $ANTLR start "rule__ProjectBlock__Group_2__2"
    // InternalLibrettoProjectProfile.g:987:1: rule__ProjectBlock__Group_2__2 : rule__ProjectBlock__Group_2__2__Impl ;
    public final void rule__ProjectBlock__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:991:1: ( rule__ProjectBlock__Group_2__2__Impl )
            // InternalLibrettoProjectProfile.g:992:2: rule__ProjectBlock__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProjectBlock__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectBlock__Group_2__2"


    // $ANTLR start "rule__ProjectBlock__Group_2__2__Impl"
    // InternalLibrettoProjectProfile.g:998:1: rule__ProjectBlock__Group_2__2__Impl : ( ';' ) ;
    public final void rule__ProjectBlock__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1002:1: ( ( ';' ) )
            // InternalLibrettoProjectProfile.g:1003:1: ( ';' )
            {
            // InternalLibrettoProjectProfile.g:1003:1: ( ';' )
            // InternalLibrettoProjectProfile.g:1004:2: ';'
            {
             before(grammarAccess.getProjectBlockAccess().getSemicolonKeyword_2_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getProjectBlockAccess().getSemicolonKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectBlock__Group_2__2__Impl"


    // $ANTLR start "rule__ModulesBlock__Group__0"
    // InternalLibrettoProjectProfile.g:1014:1: rule__ModulesBlock__Group__0 : rule__ModulesBlock__Group__0__Impl rule__ModulesBlock__Group__1 ;
    public final void rule__ModulesBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1018:1: ( rule__ModulesBlock__Group__0__Impl rule__ModulesBlock__Group__1 )
            // InternalLibrettoProjectProfile.g:1019:2: rule__ModulesBlock__Group__0__Impl rule__ModulesBlock__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalLibrettoProjectProfile.g:1026:1: rule__ModulesBlock__Group__0__Impl : ( 'modules' ) ;
    public final void rule__ModulesBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1030:1: ( ( 'modules' ) )
            // InternalLibrettoProjectProfile.g:1031:1: ( 'modules' )
            {
            // InternalLibrettoProjectProfile.g:1031:1: ( 'modules' )
            // InternalLibrettoProjectProfile.g:1032:2: 'modules'
            {
             before(grammarAccess.getModulesBlockAccess().getModulesKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getModulesBlockAccess().getModulesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModulesBlock__Group__0__Impl"


    // $ANTLR start "rule__ModulesBlock__Group__1"
    // InternalLibrettoProjectProfile.g:1041:1: rule__ModulesBlock__Group__1 : rule__ModulesBlock__Group__1__Impl rule__ModulesBlock__Group__2 ;
    public final void rule__ModulesBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1045:1: ( rule__ModulesBlock__Group__1__Impl rule__ModulesBlock__Group__2 )
            // InternalLibrettoProjectProfile.g:1046:2: rule__ModulesBlock__Group__1__Impl rule__ModulesBlock__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalLibrettoProjectProfile.g:1053:1: rule__ModulesBlock__Group__1__Impl : ( '{' ) ;
    public final void rule__ModulesBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1057:1: ( ( '{' ) )
            // InternalLibrettoProjectProfile.g:1058:1: ( '{' )
            {
            // InternalLibrettoProjectProfile.g:1058:1: ( '{' )
            // InternalLibrettoProjectProfile.g:1059:2: '{'
            {
             before(grammarAccess.getModulesBlockAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getModulesBlockAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // InternalLibrettoProjectProfile.g:1068:1: rule__ModulesBlock__Group__2 : rule__ModulesBlock__Group__2__Impl rule__ModulesBlock__Group__3 ;
    public final void rule__ModulesBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1072:1: ( rule__ModulesBlock__Group__2__Impl rule__ModulesBlock__Group__3 )
            // InternalLibrettoProjectProfile.g:1073:2: rule__ModulesBlock__Group__2__Impl rule__ModulesBlock__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalLibrettoProjectProfile.g:1080:1: rule__ModulesBlock__Group__2__Impl : ( ( rule__ModulesBlock__ModulesAssignment_2 )* ) ;
    public final void rule__ModulesBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1084:1: ( ( ( rule__ModulesBlock__ModulesAssignment_2 )* ) )
            // InternalLibrettoProjectProfile.g:1085:1: ( ( rule__ModulesBlock__ModulesAssignment_2 )* )
            {
            // InternalLibrettoProjectProfile.g:1085:1: ( ( rule__ModulesBlock__ModulesAssignment_2 )* )
            // InternalLibrettoProjectProfile.g:1086:2: ( rule__ModulesBlock__ModulesAssignment_2 )*
            {
             before(grammarAccess.getModulesBlockAccess().getModulesAssignment_2()); 
            // InternalLibrettoProjectProfile.g:1087:2: ( rule__ModulesBlock__ModulesAssignment_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==27) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:1087:3: rule__ModulesBlock__ModulesAssignment_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ModulesBlock__ModulesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getModulesBlockAccess().getModulesAssignment_2()); 

            }


            }

        }
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
    // InternalLibrettoProjectProfile.g:1095:1: rule__ModulesBlock__Group__3 : rule__ModulesBlock__Group__3__Impl ;
    public final void rule__ModulesBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1099:1: ( rule__ModulesBlock__Group__3__Impl )
            // InternalLibrettoProjectProfile.g:1100:2: rule__ModulesBlock__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModulesBlock__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalLibrettoProjectProfile.g:1106:1: rule__ModulesBlock__Group__3__Impl : ( '}' ) ;
    public final void rule__ModulesBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1110:1: ( ( '}' ) )
            // InternalLibrettoProjectProfile.g:1111:1: ( '}' )
            {
            // InternalLibrettoProjectProfile.g:1111:1: ( '}' )
            // InternalLibrettoProjectProfile.g:1112:2: '}'
            {
             before(grammarAccess.getModulesBlockAccess().getRightCurlyBracketKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getModulesBlockAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__ProjectModule__Group__0"
    // InternalLibrettoProjectProfile.g:1122:1: rule__ProjectModule__Group__0 : rule__ProjectModule__Group__0__Impl rule__ProjectModule__Group__1 ;
    public final void rule__ProjectModule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1126:1: ( rule__ProjectModule__Group__0__Impl rule__ProjectModule__Group__1 )
            // InternalLibrettoProjectProfile.g:1127:2: rule__ProjectModule__Group__0__Impl rule__ProjectModule__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalLibrettoProjectProfile.g:1134:1: rule__ProjectModule__Group__0__Impl : ( 'module' ) ;
    public final void rule__ProjectModule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1138:1: ( ( 'module' ) )
            // InternalLibrettoProjectProfile.g:1139:1: ( 'module' )
            {
            // InternalLibrettoProjectProfile.g:1139:1: ( 'module' )
            // InternalLibrettoProjectProfile.g:1140:2: 'module'
            {
             before(grammarAccess.getProjectModuleAccess().getModuleKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalLibrettoProjectProfile.g:1149:1: rule__ProjectModule__Group__1 : rule__ProjectModule__Group__1__Impl rule__ProjectModule__Group__2 ;
    public final void rule__ProjectModule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1153:1: ( rule__ProjectModule__Group__1__Impl rule__ProjectModule__Group__2 )
            // InternalLibrettoProjectProfile.g:1154:2: rule__ProjectModule__Group__1__Impl rule__ProjectModule__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalLibrettoProjectProfile.g:1161:1: rule__ProjectModule__Group__1__Impl : ( ( rule__ProjectModule__NameAssignment_1 ) ) ;
    public final void rule__ProjectModule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1165:1: ( ( ( rule__ProjectModule__NameAssignment_1 ) ) )
            // InternalLibrettoProjectProfile.g:1166:1: ( ( rule__ProjectModule__NameAssignment_1 ) )
            {
            // InternalLibrettoProjectProfile.g:1166:1: ( ( rule__ProjectModule__NameAssignment_1 ) )
            // InternalLibrettoProjectProfile.g:1167:2: ( rule__ProjectModule__NameAssignment_1 )
            {
             before(grammarAccess.getProjectModuleAccess().getNameAssignment_1()); 
            // InternalLibrettoProjectProfile.g:1168:2: ( rule__ProjectModule__NameAssignment_1 )
            // InternalLibrettoProjectProfile.g:1168:3: rule__ProjectModule__NameAssignment_1
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
    // InternalLibrettoProjectProfile.g:1176:1: rule__ProjectModule__Group__2 : rule__ProjectModule__Group__2__Impl rule__ProjectModule__Group__3 ;
    public final void rule__ProjectModule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1180:1: ( rule__ProjectModule__Group__2__Impl rule__ProjectModule__Group__3 )
            // InternalLibrettoProjectProfile.g:1181:2: rule__ProjectModule__Group__2__Impl rule__ProjectModule__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalLibrettoProjectProfile.g:1188:1: rule__ProjectModule__Group__2__Impl : ( '{' ) ;
    public final void rule__ProjectModule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1192:1: ( ( '{' ) )
            // InternalLibrettoProjectProfile.g:1193:1: ( '{' )
            {
            // InternalLibrettoProjectProfile.g:1193:1: ( '{' )
            // InternalLibrettoProjectProfile.g:1194:2: '{'
            {
             before(grammarAccess.getProjectModuleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,21,FOLLOW_2); 
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
    // InternalLibrettoProjectProfile.g:1203:1: rule__ProjectModule__Group__3 : rule__ProjectModule__Group__3__Impl rule__ProjectModule__Group__4 ;
    public final void rule__ProjectModule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1207:1: ( rule__ProjectModule__Group__3__Impl rule__ProjectModule__Group__4 )
            // InternalLibrettoProjectProfile.g:1208:2: rule__ProjectModule__Group__3__Impl rule__ProjectModule__Group__4
            {
            pushFollow(FOLLOW_3);
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
    // InternalLibrettoProjectProfile.g:1215:1: rule__ProjectModule__Group__3__Impl : ( 'dir' ) ;
    public final void rule__ProjectModule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1219:1: ( ( 'dir' ) )
            // InternalLibrettoProjectProfile.g:1220:1: ( 'dir' )
            {
            // InternalLibrettoProjectProfile.g:1220:1: ( 'dir' )
            // InternalLibrettoProjectProfile.g:1221:2: 'dir'
            {
             before(grammarAccess.getProjectModuleAccess().getDirKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getProjectModuleAccess().getDirKeyword_3()); 

            }


            }

        }
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
    // InternalLibrettoProjectProfile.g:1230:1: rule__ProjectModule__Group__4 : rule__ProjectModule__Group__4__Impl rule__ProjectModule__Group__5 ;
    public final void rule__ProjectModule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1234:1: ( rule__ProjectModule__Group__4__Impl rule__ProjectModule__Group__5 )
            // InternalLibrettoProjectProfile.g:1235:2: rule__ProjectModule__Group__4__Impl rule__ProjectModule__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__ProjectModule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectModule__Group__5();

            state._fsp--;


            }

        }
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
    // InternalLibrettoProjectProfile.g:1242:1: rule__ProjectModule__Group__4__Impl : ( ( rule__ProjectModule__DirAssignment_4 ) ) ;
    public final void rule__ProjectModule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1246:1: ( ( ( rule__ProjectModule__DirAssignment_4 ) ) )
            // InternalLibrettoProjectProfile.g:1247:1: ( ( rule__ProjectModule__DirAssignment_4 ) )
            {
            // InternalLibrettoProjectProfile.g:1247:1: ( ( rule__ProjectModule__DirAssignment_4 ) )
            // InternalLibrettoProjectProfile.g:1248:2: ( rule__ProjectModule__DirAssignment_4 )
            {
             before(grammarAccess.getProjectModuleAccess().getDirAssignment_4()); 
            // InternalLibrettoProjectProfile.g:1249:2: ( rule__ProjectModule__DirAssignment_4 )
            // InternalLibrettoProjectProfile.g:1249:3: rule__ProjectModule__DirAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ProjectModule__DirAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getProjectModuleAccess().getDirAssignment_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__ProjectModule__Group__5"
    // InternalLibrettoProjectProfile.g:1257:1: rule__ProjectModule__Group__5 : rule__ProjectModule__Group__5__Impl rule__ProjectModule__Group__6 ;
    public final void rule__ProjectModule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1261:1: ( rule__ProjectModule__Group__5__Impl rule__ProjectModule__Group__6 )
            // InternalLibrettoProjectProfile.g:1262:2: rule__ProjectModule__Group__5__Impl rule__ProjectModule__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__ProjectModule__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectModule__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModule__Group__5"


    // $ANTLR start "rule__ProjectModule__Group__5__Impl"
    // InternalLibrettoProjectProfile.g:1269:1: rule__ProjectModule__Group__5__Impl : ( ';' ) ;
    public final void rule__ProjectModule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1273:1: ( ( ';' ) )
            // InternalLibrettoProjectProfile.g:1274:1: ( ';' )
            {
            // InternalLibrettoProjectProfile.g:1274:1: ( ';' )
            // InternalLibrettoProjectProfile.g:1275:2: ';'
            {
             before(grammarAccess.getProjectModuleAccess().getSemicolonKeyword_5()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getProjectModuleAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModule__Group__5__Impl"


    // $ANTLR start "rule__ProjectModule__Group__6"
    // InternalLibrettoProjectProfile.g:1284:1: rule__ProjectModule__Group__6 : rule__ProjectModule__Group__6__Impl rule__ProjectModule__Group__7 ;
    public final void rule__ProjectModule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1288:1: ( rule__ProjectModule__Group__6__Impl rule__ProjectModule__Group__7 )
            // InternalLibrettoProjectProfile.g:1289:2: rule__ProjectModule__Group__6__Impl rule__ProjectModule__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__ProjectModule__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectModule__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModule__Group__6"


    // $ANTLR start "rule__ProjectModule__Group__6__Impl"
    // InternalLibrettoProjectProfile.g:1296:1: rule__ProjectModule__Group__6__Impl : ( ( rule__ProjectModule__Group_6__0 )? ) ;
    public final void rule__ProjectModule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1300:1: ( ( ( rule__ProjectModule__Group_6__0 )? ) )
            // InternalLibrettoProjectProfile.g:1301:1: ( ( rule__ProjectModule__Group_6__0 )? )
            {
            // InternalLibrettoProjectProfile.g:1301:1: ( ( rule__ProjectModule__Group_6__0 )? )
            // InternalLibrettoProjectProfile.g:1302:2: ( rule__ProjectModule__Group_6__0 )?
            {
             before(grammarAccess.getProjectModuleAccess().getGroup_6()); 
            // InternalLibrettoProjectProfile.g:1303:2: ( rule__ProjectModule__Group_6__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==29) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:1303:3: rule__ProjectModule__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProjectModule__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProjectModuleAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModule__Group__6__Impl"


    // $ANTLR start "rule__ProjectModule__Group__7"
    // InternalLibrettoProjectProfile.g:1311:1: rule__ProjectModule__Group__7 : rule__ProjectModule__Group__7__Impl rule__ProjectModule__Group__8 ;
    public final void rule__ProjectModule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1315:1: ( rule__ProjectModule__Group__7__Impl rule__ProjectModule__Group__8 )
            // InternalLibrettoProjectProfile.g:1316:2: rule__ProjectModule__Group__7__Impl rule__ProjectModule__Group__8
            {
            pushFollow(FOLLOW_11);
            rule__ProjectModule__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectModule__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModule__Group__7"


    // $ANTLR start "rule__ProjectModule__Group__7__Impl"
    // InternalLibrettoProjectProfile.g:1323:1: rule__ProjectModule__Group__7__Impl : ( ( rule__ProjectModule__Group_7__0 )? ) ;
    public final void rule__ProjectModule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1327:1: ( ( ( rule__ProjectModule__Group_7__0 )? ) )
            // InternalLibrettoProjectProfile.g:1328:1: ( ( rule__ProjectModule__Group_7__0 )? )
            {
            // InternalLibrettoProjectProfile.g:1328:1: ( ( rule__ProjectModule__Group_7__0 )? )
            // InternalLibrettoProjectProfile.g:1329:2: ( rule__ProjectModule__Group_7__0 )?
            {
             before(grammarAccess.getProjectModuleAccess().getGroup_7()); 
            // InternalLibrettoProjectProfile.g:1330:2: ( rule__ProjectModule__Group_7__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:1330:3: rule__ProjectModule__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProjectModule__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProjectModuleAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModule__Group__7__Impl"


    // $ANTLR start "rule__ProjectModule__Group__8"
    // InternalLibrettoProjectProfile.g:1338:1: rule__ProjectModule__Group__8 : rule__ProjectModule__Group__8__Impl rule__ProjectModule__Group__9 ;
    public final void rule__ProjectModule__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1342:1: ( rule__ProjectModule__Group__8__Impl rule__ProjectModule__Group__9 )
            // InternalLibrettoProjectProfile.g:1343:2: rule__ProjectModule__Group__8__Impl rule__ProjectModule__Group__9
            {
            pushFollow(FOLLOW_11);
            rule__ProjectModule__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectModule__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModule__Group__8"


    // $ANTLR start "rule__ProjectModule__Group__8__Impl"
    // InternalLibrettoProjectProfile.g:1350:1: rule__ProjectModule__Group__8__Impl : ( ( rule__ProjectModule__Group_8__0 )? ) ;
    public final void rule__ProjectModule__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1354:1: ( ( ( rule__ProjectModule__Group_8__0 )? ) )
            // InternalLibrettoProjectProfile.g:1355:1: ( ( rule__ProjectModule__Group_8__0 )? )
            {
            // InternalLibrettoProjectProfile.g:1355:1: ( ( rule__ProjectModule__Group_8__0 )? )
            // InternalLibrettoProjectProfile.g:1356:2: ( rule__ProjectModule__Group_8__0 )?
            {
             before(grammarAccess.getProjectModuleAccess().getGroup_8()); 
            // InternalLibrettoProjectProfile.g:1357:2: ( rule__ProjectModule__Group_8__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==31) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:1357:3: rule__ProjectModule__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProjectModule__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProjectModuleAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModule__Group__8__Impl"


    // $ANTLR start "rule__ProjectModule__Group__9"
    // InternalLibrettoProjectProfile.g:1365:1: rule__ProjectModule__Group__9 : rule__ProjectModule__Group__9__Impl rule__ProjectModule__Group__10 ;
    public final void rule__ProjectModule__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1369:1: ( rule__ProjectModule__Group__9__Impl rule__ProjectModule__Group__10 )
            // InternalLibrettoProjectProfile.g:1370:2: rule__ProjectModule__Group__9__Impl rule__ProjectModule__Group__10
            {
            pushFollow(FOLLOW_11);
            rule__ProjectModule__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectModule__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModule__Group__9"


    // $ANTLR start "rule__ProjectModule__Group__9__Impl"
    // InternalLibrettoProjectProfile.g:1377:1: rule__ProjectModule__Group__9__Impl : ( ( rule__ProjectModule__Group_9__0 )? ) ;
    public final void rule__ProjectModule__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1381:1: ( ( ( rule__ProjectModule__Group_9__0 )? ) )
            // InternalLibrettoProjectProfile.g:1382:1: ( ( rule__ProjectModule__Group_9__0 )? )
            {
            // InternalLibrettoProjectProfile.g:1382:1: ( ( rule__ProjectModule__Group_9__0 )? )
            // InternalLibrettoProjectProfile.g:1383:2: ( rule__ProjectModule__Group_9__0 )?
            {
             before(grammarAccess.getProjectModuleAccess().getGroup_9()); 
            // InternalLibrettoProjectProfile.g:1384:2: ( rule__ProjectModule__Group_9__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==32) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:1384:3: rule__ProjectModule__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProjectModule__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProjectModuleAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModule__Group__9__Impl"


    // $ANTLR start "rule__ProjectModule__Group__10"
    // InternalLibrettoProjectProfile.g:1392:1: rule__ProjectModule__Group__10 : rule__ProjectModule__Group__10__Impl ;
    public final void rule__ProjectModule__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1396:1: ( rule__ProjectModule__Group__10__Impl )
            // InternalLibrettoProjectProfile.g:1397:2: rule__ProjectModule__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProjectModule__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModule__Group__10"


    // $ANTLR start "rule__ProjectModule__Group__10__Impl"
    // InternalLibrettoProjectProfile.g:1403:1: rule__ProjectModule__Group__10__Impl : ( '}' ) ;
    public final void rule__ProjectModule__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1407:1: ( ( '}' ) )
            // InternalLibrettoProjectProfile.g:1408:1: ( '}' )
            {
            // InternalLibrettoProjectProfile.g:1408:1: ( '}' )
            // InternalLibrettoProjectProfile.g:1409:2: '}'
            {
             before(grammarAccess.getProjectModuleAccess().getRightCurlyBracketKeyword_10()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getProjectModuleAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModule__Group__10__Impl"


    // $ANTLR start "rule__ProjectModule__Group_6__0"
    // InternalLibrettoProjectProfile.g:1419:1: rule__ProjectModule__Group_6__0 : rule__ProjectModule__Group_6__0__Impl rule__ProjectModule__Group_6__1 ;
    public final void rule__ProjectModule__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1423:1: ( rule__ProjectModule__Group_6__0__Impl rule__ProjectModule__Group_6__1 )
            // InternalLibrettoProjectProfile.g:1424:2: rule__ProjectModule__Group_6__0__Impl rule__ProjectModule__Group_6__1
            {
            pushFollow(FOLLOW_3);
            rule__ProjectModule__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectModule__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModule__Group_6__0"


    // $ANTLR start "rule__ProjectModule__Group_6__0__Impl"
    // InternalLibrettoProjectProfile.g:1431:1: rule__ProjectModule__Group_6__0__Impl : ( 'specsDir' ) ;
    public final void rule__ProjectModule__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1435:1: ( ( 'specsDir' ) )
            // InternalLibrettoProjectProfile.g:1436:1: ( 'specsDir' )
            {
            // InternalLibrettoProjectProfile.g:1436:1: ( 'specsDir' )
            // InternalLibrettoProjectProfile.g:1437:2: 'specsDir'
            {
             before(grammarAccess.getProjectModuleAccess().getSpecsDirKeyword_6_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getProjectModuleAccess().getSpecsDirKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModule__Group_6__0__Impl"


    // $ANTLR start "rule__ProjectModule__Group_6__1"
    // InternalLibrettoProjectProfile.g:1446:1: rule__ProjectModule__Group_6__1 : rule__ProjectModule__Group_6__1__Impl rule__ProjectModule__Group_6__2 ;
    public final void rule__ProjectModule__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1450:1: ( rule__ProjectModule__Group_6__1__Impl rule__ProjectModule__Group_6__2 )
            // InternalLibrettoProjectProfile.g:1451:2: rule__ProjectModule__Group_6__1__Impl rule__ProjectModule__Group_6__2
            {
            pushFollow(FOLLOW_7);
            rule__ProjectModule__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectModule__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModule__Group_6__1"


    // $ANTLR start "rule__ProjectModule__Group_6__1__Impl"
    // InternalLibrettoProjectProfile.g:1458:1: rule__ProjectModule__Group_6__1__Impl : ( ( rule__ProjectModule__SpecsDirAssignment_6_1 ) ) ;
    public final void rule__ProjectModule__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1462:1: ( ( ( rule__ProjectModule__SpecsDirAssignment_6_1 ) ) )
            // InternalLibrettoProjectProfile.g:1463:1: ( ( rule__ProjectModule__SpecsDirAssignment_6_1 ) )
            {
            // InternalLibrettoProjectProfile.g:1463:1: ( ( rule__ProjectModule__SpecsDirAssignment_6_1 ) )
            // InternalLibrettoProjectProfile.g:1464:2: ( rule__ProjectModule__SpecsDirAssignment_6_1 )
            {
             before(grammarAccess.getProjectModuleAccess().getSpecsDirAssignment_6_1()); 
            // InternalLibrettoProjectProfile.g:1465:2: ( rule__ProjectModule__SpecsDirAssignment_6_1 )
            // InternalLibrettoProjectProfile.g:1465:3: rule__ProjectModule__SpecsDirAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__ProjectModule__SpecsDirAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getProjectModuleAccess().getSpecsDirAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModule__Group_6__1__Impl"


    // $ANTLR start "rule__ProjectModule__Group_6__2"
    // InternalLibrettoProjectProfile.g:1473:1: rule__ProjectModule__Group_6__2 : rule__ProjectModule__Group_6__2__Impl ;
    public final void rule__ProjectModule__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1477:1: ( rule__ProjectModule__Group_6__2__Impl )
            // InternalLibrettoProjectProfile.g:1478:2: rule__ProjectModule__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProjectModule__Group_6__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModule__Group_6__2"


    // $ANTLR start "rule__ProjectModule__Group_6__2__Impl"
    // InternalLibrettoProjectProfile.g:1484:1: rule__ProjectModule__Group_6__2__Impl : ( ';' ) ;
    public final void rule__ProjectModule__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1488:1: ( ( ';' ) )
            // InternalLibrettoProjectProfile.g:1489:1: ( ';' )
            {
            // InternalLibrettoProjectProfile.g:1489:1: ( ';' )
            // InternalLibrettoProjectProfile.g:1490:2: ';'
            {
             before(grammarAccess.getProjectModuleAccess().getSemicolonKeyword_6_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getProjectModuleAccess().getSemicolonKeyword_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModule__Group_6__2__Impl"


    // $ANTLR start "rule__ProjectModule__Group_7__0"
    // InternalLibrettoProjectProfile.g:1500:1: rule__ProjectModule__Group_7__0 : rule__ProjectModule__Group_7__0__Impl rule__ProjectModule__Group_7__1 ;
    public final void rule__ProjectModule__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1504:1: ( rule__ProjectModule__Group_7__0__Impl rule__ProjectModule__Group_7__1 )
            // InternalLibrettoProjectProfile.g:1505:2: rule__ProjectModule__Group_7__0__Impl rule__ProjectModule__Group_7__1
            {
            pushFollow(FOLLOW_3);
            rule__ProjectModule__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectModule__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModule__Group_7__0"


    // $ANTLR start "rule__ProjectModule__Group_7__0__Impl"
    // InternalLibrettoProjectProfile.g:1512:1: rule__ProjectModule__Group_7__0__Impl : ( 'testsDir' ) ;
    public final void rule__ProjectModule__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1516:1: ( ( 'testsDir' ) )
            // InternalLibrettoProjectProfile.g:1517:1: ( 'testsDir' )
            {
            // InternalLibrettoProjectProfile.g:1517:1: ( 'testsDir' )
            // InternalLibrettoProjectProfile.g:1518:2: 'testsDir'
            {
             before(grammarAccess.getProjectModuleAccess().getTestsDirKeyword_7_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getProjectModuleAccess().getTestsDirKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModule__Group_7__0__Impl"


    // $ANTLR start "rule__ProjectModule__Group_7__1"
    // InternalLibrettoProjectProfile.g:1527:1: rule__ProjectModule__Group_7__1 : rule__ProjectModule__Group_7__1__Impl rule__ProjectModule__Group_7__2 ;
    public final void rule__ProjectModule__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1531:1: ( rule__ProjectModule__Group_7__1__Impl rule__ProjectModule__Group_7__2 )
            // InternalLibrettoProjectProfile.g:1532:2: rule__ProjectModule__Group_7__1__Impl rule__ProjectModule__Group_7__2
            {
            pushFollow(FOLLOW_7);
            rule__ProjectModule__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectModule__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModule__Group_7__1"


    // $ANTLR start "rule__ProjectModule__Group_7__1__Impl"
    // InternalLibrettoProjectProfile.g:1539:1: rule__ProjectModule__Group_7__1__Impl : ( ( rule__ProjectModule__TestsDirAssignment_7_1 ) ) ;
    public final void rule__ProjectModule__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1543:1: ( ( ( rule__ProjectModule__TestsDirAssignment_7_1 ) ) )
            // InternalLibrettoProjectProfile.g:1544:1: ( ( rule__ProjectModule__TestsDirAssignment_7_1 ) )
            {
            // InternalLibrettoProjectProfile.g:1544:1: ( ( rule__ProjectModule__TestsDirAssignment_7_1 ) )
            // InternalLibrettoProjectProfile.g:1545:2: ( rule__ProjectModule__TestsDirAssignment_7_1 )
            {
             before(grammarAccess.getProjectModuleAccess().getTestsDirAssignment_7_1()); 
            // InternalLibrettoProjectProfile.g:1546:2: ( rule__ProjectModule__TestsDirAssignment_7_1 )
            // InternalLibrettoProjectProfile.g:1546:3: rule__ProjectModule__TestsDirAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__ProjectModule__TestsDirAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getProjectModuleAccess().getTestsDirAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModule__Group_7__1__Impl"


    // $ANTLR start "rule__ProjectModule__Group_7__2"
    // InternalLibrettoProjectProfile.g:1554:1: rule__ProjectModule__Group_7__2 : rule__ProjectModule__Group_7__2__Impl ;
    public final void rule__ProjectModule__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1558:1: ( rule__ProjectModule__Group_7__2__Impl )
            // InternalLibrettoProjectProfile.g:1559:2: rule__ProjectModule__Group_7__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProjectModule__Group_7__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModule__Group_7__2"


    // $ANTLR start "rule__ProjectModule__Group_7__2__Impl"
    // InternalLibrettoProjectProfile.g:1565:1: rule__ProjectModule__Group_7__2__Impl : ( ';' ) ;
    public final void rule__ProjectModule__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1569:1: ( ( ';' ) )
            // InternalLibrettoProjectProfile.g:1570:1: ( ';' )
            {
            // InternalLibrettoProjectProfile.g:1570:1: ( ';' )
            // InternalLibrettoProjectProfile.g:1571:2: ';'
            {
             before(grammarAccess.getProjectModuleAccess().getSemicolonKeyword_7_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getProjectModuleAccess().getSemicolonKeyword_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModule__Group_7__2__Impl"


    // $ANTLR start "rule__ProjectModule__Group_8__0"
    // InternalLibrettoProjectProfile.g:1581:1: rule__ProjectModule__Group_8__0 : rule__ProjectModule__Group_8__0__Impl rule__ProjectModule__Group_8__1 ;
    public final void rule__ProjectModule__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1585:1: ( rule__ProjectModule__Group_8__0__Impl rule__ProjectModule__Group_8__1 )
            // InternalLibrettoProjectProfile.g:1586:2: rule__ProjectModule__Group_8__0__Impl rule__ProjectModule__Group_8__1
            {
            pushFollow(FOLLOW_3);
            rule__ProjectModule__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectModule__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModule__Group_8__0"


    // $ANTLR start "rule__ProjectModule__Group_8__0__Impl"
    // InternalLibrettoProjectProfile.g:1593:1: rule__ProjectModule__Group_8__0__Impl : ( 'mainJavaDir' ) ;
    public final void rule__ProjectModule__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1597:1: ( ( 'mainJavaDir' ) )
            // InternalLibrettoProjectProfile.g:1598:1: ( 'mainJavaDir' )
            {
            // InternalLibrettoProjectProfile.g:1598:1: ( 'mainJavaDir' )
            // InternalLibrettoProjectProfile.g:1599:2: 'mainJavaDir'
            {
             before(grammarAccess.getProjectModuleAccess().getMainJavaDirKeyword_8_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getProjectModuleAccess().getMainJavaDirKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModule__Group_8__0__Impl"


    // $ANTLR start "rule__ProjectModule__Group_8__1"
    // InternalLibrettoProjectProfile.g:1608:1: rule__ProjectModule__Group_8__1 : rule__ProjectModule__Group_8__1__Impl rule__ProjectModule__Group_8__2 ;
    public final void rule__ProjectModule__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1612:1: ( rule__ProjectModule__Group_8__1__Impl rule__ProjectModule__Group_8__2 )
            // InternalLibrettoProjectProfile.g:1613:2: rule__ProjectModule__Group_8__1__Impl rule__ProjectModule__Group_8__2
            {
            pushFollow(FOLLOW_7);
            rule__ProjectModule__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectModule__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModule__Group_8__1"


    // $ANTLR start "rule__ProjectModule__Group_8__1__Impl"
    // InternalLibrettoProjectProfile.g:1620:1: rule__ProjectModule__Group_8__1__Impl : ( ( rule__ProjectModule__MainJavaDirAssignment_8_1 ) ) ;
    public final void rule__ProjectModule__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1624:1: ( ( ( rule__ProjectModule__MainJavaDirAssignment_8_1 ) ) )
            // InternalLibrettoProjectProfile.g:1625:1: ( ( rule__ProjectModule__MainJavaDirAssignment_8_1 ) )
            {
            // InternalLibrettoProjectProfile.g:1625:1: ( ( rule__ProjectModule__MainJavaDirAssignment_8_1 ) )
            // InternalLibrettoProjectProfile.g:1626:2: ( rule__ProjectModule__MainJavaDirAssignment_8_1 )
            {
             before(grammarAccess.getProjectModuleAccess().getMainJavaDirAssignment_8_1()); 
            // InternalLibrettoProjectProfile.g:1627:2: ( rule__ProjectModule__MainJavaDirAssignment_8_1 )
            // InternalLibrettoProjectProfile.g:1627:3: rule__ProjectModule__MainJavaDirAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__ProjectModule__MainJavaDirAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getProjectModuleAccess().getMainJavaDirAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModule__Group_8__1__Impl"


    // $ANTLR start "rule__ProjectModule__Group_8__2"
    // InternalLibrettoProjectProfile.g:1635:1: rule__ProjectModule__Group_8__2 : rule__ProjectModule__Group_8__2__Impl ;
    public final void rule__ProjectModule__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1639:1: ( rule__ProjectModule__Group_8__2__Impl )
            // InternalLibrettoProjectProfile.g:1640:2: rule__ProjectModule__Group_8__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProjectModule__Group_8__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModule__Group_8__2"


    // $ANTLR start "rule__ProjectModule__Group_8__2__Impl"
    // InternalLibrettoProjectProfile.g:1646:1: rule__ProjectModule__Group_8__2__Impl : ( ';' ) ;
    public final void rule__ProjectModule__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1650:1: ( ( ';' ) )
            // InternalLibrettoProjectProfile.g:1651:1: ( ';' )
            {
            // InternalLibrettoProjectProfile.g:1651:1: ( ';' )
            // InternalLibrettoProjectProfile.g:1652:2: ';'
            {
             before(grammarAccess.getProjectModuleAccess().getSemicolonKeyword_8_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getProjectModuleAccess().getSemicolonKeyword_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModule__Group_8__2__Impl"


    // $ANTLR start "rule__ProjectModule__Group_9__0"
    // InternalLibrettoProjectProfile.g:1662:1: rule__ProjectModule__Group_9__0 : rule__ProjectModule__Group_9__0__Impl rule__ProjectModule__Group_9__1 ;
    public final void rule__ProjectModule__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1666:1: ( rule__ProjectModule__Group_9__0__Impl rule__ProjectModule__Group_9__1 )
            // InternalLibrettoProjectProfile.g:1667:2: rule__ProjectModule__Group_9__0__Impl rule__ProjectModule__Group_9__1
            {
            pushFollow(FOLLOW_3);
            rule__ProjectModule__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectModule__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModule__Group_9__0"


    // $ANTLR start "rule__ProjectModule__Group_9__0__Impl"
    // InternalLibrettoProjectProfile.g:1674:1: rule__ProjectModule__Group_9__0__Impl : ( 'basePackage' ) ;
    public final void rule__ProjectModule__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1678:1: ( ( 'basePackage' ) )
            // InternalLibrettoProjectProfile.g:1679:1: ( 'basePackage' )
            {
            // InternalLibrettoProjectProfile.g:1679:1: ( 'basePackage' )
            // InternalLibrettoProjectProfile.g:1680:2: 'basePackage'
            {
             before(grammarAccess.getProjectModuleAccess().getBasePackageKeyword_9_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getProjectModuleAccess().getBasePackageKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModule__Group_9__0__Impl"


    // $ANTLR start "rule__ProjectModule__Group_9__1"
    // InternalLibrettoProjectProfile.g:1689:1: rule__ProjectModule__Group_9__1 : rule__ProjectModule__Group_9__1__Impl rule__ProjectModule__Group_9__2 ;
    public final void rule__ProjectModule__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1693:1: ( rule__ProjectModule__Group_9__1__Impl rule__ProjectModule__Group_9__2 )
            // InternalLibrettoProjectProfile.g:1694:2: rule__ProjectModule__Group_9__1__Impl rule__ProjectModule__Group_9__2
            {
            pushFollow(FOLLOW_7);
            rule__ProjectModule__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectModule__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModule__Group_9__1"


    // $ANTLR start "rule__ProjectModule__Group_9__1__Impl"
    // InternalLibrettoProjectProfile.g:1701:1: rule__ProjectModule__Group_9__1__Impl : ( ( rule__ProjectModule__BasePackageAssignment_9_1 ) ) ;
    public final void rule__ProjectModule__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1705:1: ( ( ( rule__ProjectModule__BasePackageAssignment_9_1 ) ) )
            // InternalLibrettoProjectProfile.g:1706:1: ( ( rule__ProjectModule__BasePackageAssignment_9_1 ) )
            {
            // InternalLibrettoProjectProfile.g:1706:1: ( ( rule__ProjectModule__BasePackageAssignment_9_1 ) )
            // InternalLibrettoProjectProfile.g:1707:2: ( rule__ProjectModule__BasePackageAssignment_9_1 )
            {
             before(grammarAccess.getProjectModuleAccess().getBasePackageAssignment_9_1()); 
            // InternalLibrettoProjectProfile.g:1708:2: ( rule__ProjectModule__BasePackageAssignment_9_1 )
            // InternalLibrettoProjectProfile.g:1708:3: rule__ProjectModule__BasePackageAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__ProjectModule__BasePackageAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getProjectModuleAccess().getBasePackageAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModule__Group_9__1__Impl"


    // $ANTLR start "rule__ProjectModule__Group_9__2"
    // InternalLibrettoProjectProfile.g:1716:1: rule__ProjectModule__Group_9__2 : rule__ProjectModule__Group_9__2__Impl ;
    public final void rule__ProjectModule__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1720:1: ( rule__ProjectModule__Group_9__2__Impl )
            // InternalLibrettoProjectProfile.g:1721:2: rule__ProjectModule__Group_9__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProjectModule__Group_9__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModule__Group_9__2"


    // $ANTLR start "rule__ProjectModule__Group_9__2__Impl"
    // InternalLibrettoProjectProfile.g:1727:1: rule__ProjectModule__Group_9__2__Impl : ( ';' ) ;
    public final void rule__ProjectModule__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1731:1: ( ( ';' ) )
            // InternalLibrettoProjectProfile.g:1732:1: ( ';' )
            {
            // InternalLibrettoProjectProfile.g:1732:1: ( ';' )
            // InternalLibrettoProjectProfile.g:1733:2: ';'
            {
             before(grammarAccess.getProjectModuleAccess().getSemicolonKeyword_9_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getProjectModuleAccess().getSemicolonKeyword_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModule__Group_9__2__Impl"


    // $ANTLR start "rule__SurfaceBlock__Group__0"
    // InternalLibrettoProjectProfile.g:1743:1: rule__SurfaceBlock__Group__0 : rule__SurfaceBlock__Group__0__Impl rule__SurfaceBlock__Group__1 ;
    public final void rule__SurfaceBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1747:1: ( rule__SurfaceBlock__Group__0__Impl rule__SurfaceBlock__Group__1 )
            // InternalLibrettoProjectProfile.g:1748:2: rule__SurfaceBlock__Group__0__Impl rule__SurfaceBlock__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalLibrettoProjectProfile.g:1755:1: rule__SurfaceBlock__Group__0__Impl : ( 'surface' ) ;
    public final void rule__SurfaceBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1759:1: ( ( 'surface' ) )
            // InternalLibrettoProjectProfile.g:1760:1: ( 'surface' )
            {
            // InternalLibrettoProjectProfile.g:1760:1: ( 'surface' )
            // InternalLibrettoProjectProfile.g:1761:2: 'surface'
            {
             before(grammarAccess.getSurfaceBlockAccess().getSurfaceKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getSurfaceBlockAccess().getSurfaceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurfaceBlock__Group__0__Impl"


    // $ANTLR start "rule__SurfaceBlock__Group__1"
    // InternalLibrettoProjectProfile.g:1770:1: rule__SurfaceBlock__Group__1 : rule__SurfaceBlock__Group__1__Impl rule__SurfaceBlock__Group__2 ;
    public final void rule__SurfaceBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1774:1: ( rule__SurfaceBlock__Group__1__Impl rule__SurfaceBlock__Group__2 )
            // InternalLibrettoProjectProfile.g:1775:2: rule__SurfaceBlock__Group__1__Impl rule__SurfaceBlock__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalLibrettoProjectProfile.g:1782:1: rule__SurfaceBlock__Group__1__Impl : ( '{' ) ;
    public final void rule__SurfaceBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1786:1: ( ( '{' ) )
            // InternalLibrettoProjectProfile.g:1787:1: ( '{' )
            {
            // InternalLibrettoProjectProfile.g:1787:1: ( '{' )
            // InternalLibrettoProjectProfile.g:1788:2: '{'
            {
             before(grammarAccess.getSurfaceBlockAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSurfaceBlockAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // InternalLibrettoProjectProfile.g:1797:1: rule__SurfaceBlock__Group__2 : rule__SurfaceBlock__Group__2__Impl rule__SurfaceBlock__Group__3 ;
    public final void rule__SurfaceBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1801:1: ( rule__SurfaceBlock__Group__2__Impl rule__SurfaceBlock__Group__3 )
            // InternalLibrettoProjectProfile.g:1802:2: rule__SurfaceBlock__Group__2__Impl rule__SurfaceBlock__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalLibrettoProjectProfile.g:1809:1: rule__SurfaceBlock__Group__2__Impl : ( ( rule__SurfaceBlock__ElementsAssignment_2 )* ) ;
    public final void rule__SurfaceBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1813:1: ( ( ( rule__SurfaceBlock__ElementsAssignment_2 )* ) )
            // InternalLibrettoProjectProfile.g:1814:1: ( ( rule__SurfaceBlock__ElementsAssignment_2 )* )
            {
            // InternalLibrettoProjectProfile.g:1814:1: ( ( rule__SurfaceBlock__ElementsAssignment_2 )* )
            // InternalLibrettoProjectProfile.g:1815:2: ( rule__SurfaceBlock__ElementsAssignment_2 )*
            {
             before(grammarAccess.getSurfaceBlockAccess().getElementsAssignment_2()); 
            // InternalLibrettoProjectProfile.g:1816:2: ( rule__SurfaceBlock__ElementsAssignment_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==34||LA15_0==36||LA15_0==39||LA15_0==41||LA15_0==43) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:1816:3: rule__SurfaceBlock__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__SurfaceBlock__ElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getSurfaceBlockAccess().getElementsAssignment_2()); 

            }


            }

        }
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
    // InternalLibrettoProjectProfile.g:1824:1: rule__SurfaceBlock__Group__3 : rule__SurfaceBlock__Group__3__Impl ;
    public final void rule__SurfaceBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1828:1: ( rule__SurfaceBlock__Group__3__Impl )
            // InternalLibrettoProjectProfile.g:1829:2: rule__SurfaceBlock__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SurfaceBlock__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalLibrettoProjectProfile.g:1835:1: rule__SurfaceBlock__Group__3__Impl : ( '}' ) ;
    public final void rule__SurfaceBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1839:1: ( ( '}' ) )
            // InternalLibrettoProjectProfile.g:1840:1: ( '}' )
            {
            // InternalLibrettoProjectProfile.g:1840:1: ( '}' )
            // InternalLibrettoProjectProfile.g:1841:2: '}'
            {
             before(grammarAccess.getSurfaceBlockAccess().getRightCurlyBracketKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSurfaceBlockAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__ScopedSurface__Group__0"
    // InternalLibrettoProjectProfile.g:1851:1: rule__ScopedSurface__Group__0 : rule__ScopedSurface__Group__0__Impl rule__ScopedSurface__Group__1 ;
    public final void rule__ScopedSurface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1855:1: ( rule__ScopedSurface__Group__0__Impl rule__ScopedSurface__Group__1 )
            // InternalLibrettoProjectProfile.g:1856:2: rule__ScopedSurface__Group__0__Impl rule__ScopedSurface__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalLibrettoProjectProfile.g:1863:1: rule__ScopedSurface__Group__0__Impl : ( 'for' ) ;
    public final void rule__ScopedSurface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1867:1: ( ( 'for' ) )
            // InternalLibrettoProjectProfile.g:1868:1: ( 'for' )
            {
            // InternalLibrettoProjectProfile.g:1868:1: ( 'for' )
            // InternalLibrettoProjectProfile.g:1869:2: 'for'
            {
             before(grammarAccess.getScopedSurfaceAccess().getForKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalLibrettoProjectProfile.g:1878:1: rule__ScopedSurface__Group__1 : rule__ScopedSurface__Group__1__Impl rule__ScopedSurface__Group__2 ;
    public final void rule__ScopedSurface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1882:1: ( rule__ScopedSurface__Group__1__Impl rule__ScopedSurface__Group__2 )
            // InternalLibrettoProjectProfile.g:1883:2: rule__ScopedSurface__Group__1__Impl rule__ScopedSurface__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalLibrettoProjectProfile.g:1890:1: rule__ScopedSurface__Group__1__Impl : ( ( rule__ScopedSurface__Alternatives_1 ) ) ;
    public final void rule__ScopedSurface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1894:1: ( ( ( rule__ScopedSurface__Alternatives_1 ) ) )
            // InternalLibrettoProjectProfile.g:1895:1: ( ( rule__ScopedSurface__Alternatives_1 ) )
            {
            // InternalLibrettoProjectProfile.g:1895:1: ( ( rule__ScopedSurface__Alternatives_1 ) )
            // InternalLibrettoProjectProfile.g:1896:2: ( rule__ScopedSurface__Alternatives_1 )
            {
             before(grammarAccess.getScopedSurfaceAccess().getAlternatives_1()); 
            // InternalLibrettoProjectProfile.g:1897:2: ( rule__ScopedSurface__Alternatives_1 )
            // InternalLibrettoProjectProfile.g:1897:3: rule__ScopedSurface__Alternatives_1
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
    // InternalLibrettoProjectProfile.g:1905:1: rule__ScopedSurface__Group__2 : rule__ScopedSurface__Group__2__Impl rule__ScopedSurface__Group__3 ;
    public final void rule__ScopedSurface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1909:1: ( rule__ScopedSurface__Group__2__Impl rule__ScopedSurface__Group__3 )
            // InternalLibrettoProjectProfile.g:1910:2: rule__ScopedSurface__Group__2__Impl rule__ScopedSurface__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalLibrettoProjectProfile.g:1917:1: rule__ScopedSurface__Group__2__Impl : ( '{' ) ;
    public final void rule__ScopedSurface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1921:1: ( ( '{' ) )
            // InternalLibrettoProjectProfile.g:1922:1: ( '{' )
            {
            // InternalLibrettoProjectProfile.g:1922:1: ( '{' )
            // InternalLibrettoProjectProfile.g:1923:2: '{'
            {
             before(grammarAccess.getScopedSurfaceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,21,FOLLOW_2); 
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
    // InternalLibrettoProjectProfile.g:1932:1: rule__ScopedSurface__Group__3 : rule__ScopedSurface__Group__3__Impl rule__ScopedSurface__Group__4 ;
    public final void rule__ScopedSurface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1936:1: ( rule__ScopedSurface__Group__3__Impl rule__ScopedSurface__Group__4 )
            // InternalLibrettoProjectProfile.g:1937:2: rule__ScopedSurface__Group__3__Impl rule__ScopedSurface__Group__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalLibrettoProjectProfile.g:1944:1: rule__ScopedSurface__Group__3__Impl : ( ( rule__ScopedSurface__RulesAssignment_3 )* ) ;
    public final void rule__ScopedSurface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1948:1: ( ( ( rule__ScopedSurface__RulesAssignment_3 )* ) )
            // InternalLibrettoProjectProfile.g:1949:1: ( ( rule__ScopedSurface__RulesAssignment_3 )* )
            {
            // InternalLibrettoProjectProfile.g:1949:1: ( ( rule__ScopedSurface__RulesAssignment_3 )* )
            // InternalLibrettoProjectProfile.g:1950:2: ( rule__ScopedSurface__RulesAssignment_3 )*
            {
             before(grammarAccess.getScopedSurfaceAccess().getRulesAssignment_3()); 
            // InternalLibrettoProjectProfile.g:1951:2: ( rule__ScopedSurface__RulesAssignment_3 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==36||LA16_0==39||LA16_0==41||LA16_0==43) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:1951:3: rule__ScopedSurface__RulesAssignment_3
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__ScopedSurface__RulesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalLibrettoProjectProfile.g:1959:1: rule__ScopedSurface__Group__4 : rule__ScopedSurface__Group__4__Impl ;
    public final void rule__ScopedSurface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1963:1: ( rule__ScopedSurface__Group__4__Impl )
            // InternalLibrettoProjectProfile.g:1964:2: rule__ScopedSurface__Group__4__Impl
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
    // InternalLibrettoProjectProfile.g:1970:1: rule__ScopedSurface__Group__4__Impl : ( '}' ) ;
    public final void rule__ScopedSurface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1974:1: ( ( '}' ) )
            // InternalLibrettoProjectProfile.g:1975:1: ( '}' )
            {
            // InternalLibrettoProjectProfile.g:1975:1: ( '}' )
            // InternalLibrettoProjectProfile.g:1976:2: '}'
            {
             before(grammarAccess.getScopedSurfaceAccess().getRightCurlyBracketKeyword_4()); 
            match(input,22,FOLLOW_2); 
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
    // InternalLibrettoProjectProfile.g:1986:1: rule__ScopedSurface__Group_1_0__0 : rule__ScopedSurface__Group_1_0__0__Impl rule__ScopedSurface__Group_1_0__1 ;
    public final void rule__ScopedSurface__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:1990:1: ( rule__ScopedSurface__Group_1_0__0__Impl rule__ScopedSurface__Group_1_0__1 )
            // InternalLibrettoProjectProfile.g:1991:2: rule__ScopedSurface__Group_1_0__0__Impl rule__ScopedSurface__Group_1_0__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalLibrettoProjectProfile.g:1998:1: rule__ScopedSurface__Group_1_0__0__Impl : ( 'module' ) ;
    public final void rule__ScopedSurface__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2002:1: ( ( 'module' ) )
            // InternalLibrettoProjectProfile.g:2003:1: ( 'module' )
            {
            // InternalLibrettoProjectProfile.g:2003:1: ( 'module' )
            // InternalLibrettoProjectProfile.g:2004:2: 'module'
            {
             before(grammarAccess.getScopedSurfaceAccess().getModuleKeyword_1_0_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalLibrettoProjectProfile.g:2013:1: rule__ScopedSurface__Group_1_0__1 : rule__ScopedSurface__Group_1_0__1__Impl ;
    public final void rule__ScopedSurface__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2017:1: ( rule__ScopedSurface__Group_1_0__1__Impl )
            // InternalLibrettoProjectProfile.g:2018:2: rule__ScopedSurface__Group_1_0__1__Impl
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
    // InternalLibrettoProjectProfile.g:2024:1: rule__ScopedSurface__Group_1_0__1__Impl : ( ( rule__ScopedSurface__ModuleIdAssignment_1_0_1 ) ) ;
    public final void rule__ScopedSurface__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2028:1: ( ( ( rule__ScopedSurface__ModuleIdAssignment_1_0_1 ) ) )
            // InternalLibrettoProjectProfile.g:2029:1: ( ( rule__ScopedSurface__ModuleIdAssignment_1_0_1 ) )
            {
            // InternalLibrettoProjectProfile.g:2029:1: ( ( rule__ScopedSurface__ModuleIdAssignment_1_0_1 ) )
            // InternalLibrettoProjectProfile.g:2030:2: ( rule__ScopedSurface__ModuleIdAssignment_1_0_1 )
            {
             before(grammarAccess.getScopedSurfaceAccess().getModuleIdAssignment_1_0_1()); 
            // InternalLibrettoProjectProfile.g:2031:2: ( rule__ScopedSurface__ModuleIdAssignment_1_0_1 )
            // InternalLibrettoProjectProfile.g:2031:3: rule__ScopedSurface__ModuleIdAssignment_1_0_1
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
    // InternalLibrettoProjectProfile.g:2040:1: rule__ScopedSurface__Group_1_1__0 : rule__ScopedSurface__Group_1_1__0__Impl rule__ScopedSurface__Group_1_1__1 ;
    public final void rule__ScopedSurface__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2044:1: ( rule__ScopedSurface__Group_1_1__0__Impl rule__ScopedSurface__Group_1_1__1 )
            // InternalLibrettoProjectProfile.g:2045:2: rule__ScopedSurface__Group_1_1__0__Impl rule__ScopedSurface__Group_1_1__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalLibrettoProjectProfile.g:2052:1: rule__ScopedSurface__Group_1_1__0__Impl : ( 'spec' ) ;
    public final void rule__ScopedSurface__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2056:1: ( ( 'spec' ) )
            // InternalLibrettoProjectProfile.g:2057:1: ( 'spec' )
            {
            // InternalLibrettoProjectProfile.g:2057:1: ( 'spec' )
            // InternalLibrettoProjectProfile.g:2058:2: 'spec'
            {
             before(grammarAccess.getScopedSurfaceAccess().getSpecKeyword_1_1_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalLibrettoProjectProfile.g:2067:1: rule__ScopedSurface__Group_1_1__1 : rule__ScopedSurface__Group_1_1__1__Impl ;
    public final void rule__ScopedSurface__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2071:1: ( rule__ScopedSurface__Group_1_1__1__Impl )
            // InternalLibrettoProjectProfile.g:2072:2: rule__ScopedSurface__Group_1_1__1__Impl
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
    // InternalLibrettoProjectProfile.g:2078:1: rule__ScopedSurface__Group_1_1__1__Impl : ( ( rule__ScopedSurface__SpecIdAssignment_1_1_1 ) ) ;
    public final void rule__ScopedSurface__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2082:1: ( ( ( rule__ScopedSurface__SpecIdAssignment_1_1_1 ) ) )
            // InternalLibrettoProjectProfile.g:2083:1: ( ( rule__ScopedSurface__SpecIdAssignment_1_1_1 ) )
            {
            // InternalLibrettoProjectProfile.g:2083:1: ( ( rule__ScopedSurface__SpecIdAssignment_1_1_1 ) )
            // InternalLibrettoProjectProfile.g:2084:2: ( rule__ScopedSurface__SpecIdAssignment_1_1_1 )
            {
             before(grammarAccess.getScopedSurfaceAccess().getSpecIdAssignment_1_1_1()); 
            // InternalLibrettoProjectProfile.g:2085:2: ( rule__ScopedSurface__SpecIdAssignment_1_1_1 )
            // InternalLibrettoProjectProfile.g:2085:3: rule__ScopedSurface__SpecIdAssignment_1_1_1
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
    // InternalLibrettoProjectProfile.g:2094:1: rule__ReturnTypeRule__Group__0 : rule__ReturnTypeRule__Group__0__Impl rule__ReturnTypeRule__Group__1 ;
    public final void rule__ReturnTypeRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2098:1: ( rule__ReturnTypeRule__Group__0__Impl rule__ReturnTypeRule__Group__1 )
            // InternalLibrettoProjectProfile.g:2099:2: rule__ReturnTypeRule__Group__0__Impl rule__ReturnTypeRule__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalLibrettoProjectProfile.g:2106:1: rule__ReturnTypeRule__Group__0__Impl : ( 'returnType' ) ;
    public final void rule__ReturnTypeRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2110:1: ( ( 'returnType' ) )
            // InternalLibrettoProjectProfile.g:2111:1: ( 'returnType' )
            {
            // InternalLibrettoProjectProfile.g:2111:1: ( 'returnType' )
            // InternalLibrettoProjectProfile.g:2112:2: 'returnType'
            {
             before(grammarAccess.getReturnTypeRuleAccess().getReturnTypeKeyword_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalLibrettoProjectProfile.g:2121:1: rule__ReturnTypeRule__Group__1 : rule__ReturnTypeRule__Group__1__Impl rule__ReturnTypeRule__Group__2 ;
    public final void rule__ReturnTypeRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2125:1: ( rule__ReturnTypeRule__Group__1__Impl rule__ReturnTypeRule__Group__2 )
            // InternalLibrettoProjectProfile.g:2126:2: rule__ReturnTypeRule__Group__1__Impl rule__ReturnTypeRule__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalLibrettoProjectProfile.g:2133:1: rule__ReturnTypeRule__Group__1__Impl : ( 'method' ) ;
    public final void rule__ReturnTypeRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2137:1: ( ( 'method' ) )
            // InternalLibrettoProjectProfile.g:2138:1: ( 'method' )
            {
            // InternalLibrettoProjectProfile.g:2138:1: ( 'method' )
            // InternalLibrettoProjectProfile.g:2139:2: 'method'
            {
             before(grammarAccess.getReturnTypeRuleAccess().getMethodKeyword_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalLibrettoProjectProfile.g:2148:1: rule__ReturnTypeRule__Group__2 : rule__ReturnTypeRule__Group__2__Impl rule__ReturnTypeRule__Group__3 ;
    public final void rule__ReturnTypeRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2152:1: ( rule__ReturnTypeRule__Group__2__Impl rule__ReturnTypeRule__Group__3 )
            // InternalLibrettoProjectProfile.g:2153:2: rule__ReturnTypeRule__Group__2__Impl rule__ReturnTypeRule__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalLibrettoProjectProfile.g:2160:1: rule__ReturnTypeRule__Group__2__Impl : ( ( rule__ReturnTypeRule__NameAssignment_2 ) ) ;
    public final void rule__ReturnTypeRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2164:1: ( ( ( rule__ReturnTypeRule__NameAssignment_2 ) ) )
            // InternalLibrettoProjectProfile.g:2165:1: ( ( rule__ReturnTypeRule__NameAssignment_2 ) )
            {
            // InternalLibrettoProjectProfile.g:2165:1: ( ( rule__ReturnTypeRule__NameAssignment_2 ) )
            // InternalLibrettoProjectProfile.g:2166:2: ( rule__ReturnTypeRule__NameAssignment_2 )
            {
             before(grammarAccess.getReturnTypeRuleAccess().getNameAssignment_2()); 
            // InternalLibrettoProjectProfile.g:2167:2: ( rule__ReturnTypeRule__NameAssignment_2 )
            // InternalLibrettoProjectProfile.g:2167:3: rule__ReturnTypeRule__NameAssignment_2
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
    // InternalLibrettoProjectProfile.g:2175:1: rule__ReturnTypeRule__Group__3 : rule__ReturnTypeRule__Group__3__Impl rule__ReturnTypeRule__Group__4 ;
    public final void rule__ReturnTypeRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2179:1: ( rule__ReturnTypeRule__Group__3__Impl rule__ReturnTypeRule__Group__4 )
            // InternalLibrettoProjectProfile.g:2180:2: rule__ReturnTypeRule__Group__3__Impl rule__ReturnTypeRule__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalLibrettoProjectProfile.g:2187:1: rule__ReturnTypeRule__Group__3__Impl : ( 'as' ) ;
    public final void rule__ReturnTypeRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2191:1: ( ( 'as' ) )
            // InternalLibrettoProjectProfile.g:2192:1: ( 'as' )
            {
            // InternalLibrettoProjectProfile.g:2192:1: ( 'as' )
            // InternalLibrettoProjectProfile.g:2193:2: 'as'
            {
             before(grammarAccess.getReturnTypeRuleAccess().getAsKeyword_3()); 
            match(input,38,FOLLOW_2); 
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
    // InternalLibrettoProjectProfile.g:2202:1: rule__ReturnTypeRule__Group__4 : rule__ReturnTypeRule__Group__4__Impl rule__ReturnTypeRule__Group__5 ;
    public final void rule__ReturnTypeRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2206:1: ( rule__ReturnTypeRule__Group__4__Impl rule__ReturnTypeRule__Group__5 )
            // InternalLibrettoProjectProfile.g:2207:2: rule__ReturnTypeRule__Group__4__Impl rule__ReturnTypeRule__Group__5
            {
            pushFollow(FOLLOW_7);
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
    // InternalLibrettoProjectProfile.g:2214:1: rule__ReturnTypeRule__Group__4__Impl : ( ( rule__ReturnTypeRule__JavaTypeAssignment_4 ) ) ;
    public final void rule__ReturnTypeRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2218:1: ( ( ( rule__ReturnTypeRule__JavaTypeAssignment_4 ) ) )
            // InternalLibrettoProjectProfile.g:2219:1: ( ( rule__ReturnTypeRule__JavaTypeAssignment_4 ) )
            {
            // InternalLibrettoProjectProfile.g:2219:1: ( ( rule__ReturnTypeRule__JavaTypeAssignment_4 ) )
            // InternalLibrettoProjectProfile.g:2220:2: ( rule__ReturnTypeRule__JavaTypeAssignment_4 )
            {
             before(grammarAccess.getReturnTypeRuleAccess().getJavaTypeAssignment_4()); 
            // InternalLibrettoProjectProfile.g:2221:2: ( rule__ReturnTypeRule__JavaTypeAssignment_4 )
            // InternalLibrettoProjectProfile.g:2221:3: rule__ReturnTypeRule__JavaTypeAssignment_4
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
    // InternalLibrettoProjectProfile.g:2229:1: rule__ReturnTypeRule__Group__5 : rule__ReturnTypeRule__Group__5__Impl ;
    public final void rule__ReturnTypeRule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2233:1: ( rule__ReturnTypeRule__Group__5__Impl )
            // InternalLibrettoProjectProfile.g:2234:2: rule__ReturnTypeRule__Group__5__Impl
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
    // InternalLibrettoProjectProfile.g:2240:1: rule__ReturnTypeRule__Group__5__Impl : ( ';' ) ;
    public final void rule__ReturnTypeRule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2244:1: ( ( ';' ) )
            // InternalLibrettoProjectProfile.g:2245:1: ( ';' )
            {
            // InternalLibrettoProjectProfile.g:2245:1: ( ';' )
            // InternalLibrettoProjectProfile.g:2246:2: ';'
            {
             before(grammarAccess.getReturnTypeRuleAccess().getSemicolonKeyword_5()); 
            match(input,25,FOLLOW_2); 
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
    // InternalLibrettoProjectProfile.g:2256:1: rule__ParamTypeRule__Group__0 : rule__ParamTypeRule__Group__0__Impl rule__ParamTypeRule__Group__1 ;
    public final void rule__ParamTypeRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2260:1: ( rule__ParamTypeRule__Group__0__Impl rule__ParamTypeRule__Group__1 )
            // InternalLibrettoProjectProfile.g:2261:2: rule__ParamTypeRule__Group__0__Impl rule__ParamTypeRule__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalLibrettoProjectProfile.g:2268:1: rule__ParamTypeRule__Group__0__Impl : ( 'paramType' ) ;
    public final void rule__ParamTypeRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2272:1: ( ( 'paramType' ) )
            // InternalLibrettoProjectProfile.g:2273:1: ( 'paramType' )
            {
            // InternalLibrettoProjectProfile.g:2273:1: ( 'paramType' )
            // InternalLibrettoProjectProfile.g:2274:2: 'paramType'
            {
             before(grammarAccess.getParamTypeRuleAccess().getParamTypeKeyword_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalLibrettoProjectProfile.g:2283:1: rule__ParamTypeRule__Group__1 : rule__ParamTypeRule__Group__1__Impl rule__ParamTypeRule__Group__2 ;
    public final void rule__ParamTypeRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2287:1: ( rule__ParamTypeRule__Group__1__Impl rule__ParamTypeRule__Group__2 )
            // InternalLibrettoProjectProfile.g:2288:2: rule__ParamTypeRule__Group__1__Impl rule__ParamTypeRule__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalLibrettoProjectProfile.g:2295:1: rule__ParamTypeRule__Group__1__Impl : ( 'name' ) ;
    public final void rule__ParamTypeRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2299:1: ( ( 'name' ) )
            // InternalLibrettoProjectProfile.g:2300:1: ( 'name' )
            {
            // InternalLibrettoProjectProfile.g:2300:1: ( 'name' )
            // InternalLibrettoProjectProfile.g:2301:2: 'name'
            {
             before(grammarAccess.getParamTypeRuleAccess().getNameKeyword_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalLibrettoProjectProfile.g:2310:1: rule__ParamTypeRule__Group__2 : rule__ParamTypeRule__Group__2__Impl rule__ParamTypeRule__Group__3 ;
    public final void rule__ParamTypeRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2314:1: ( rule__ParamTypeRule__Group__2__Impl rule__ParamTypeRule__Group__3 )
            // InternalLibrettoProjectProfile.g:2315:2: rule__ParamTypeRule__Group__2__Impl rule__ParamTypeRule__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalLibrettoProjectProfile.g:2322:1: rule__ParamTypeRule__Group__2__Impl : ( ( rule__ParamTypeRule__ParamNameAssignment_2 ) ) ;
    public final void rule__ParamTypeRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2326:1: ( ( ( rule__ParamTypeRule__ParamNameAssignment_2 ) ) )
            // InternalLibrettoProjectProfile.g:2327:1: ( ( rule__ParamTypeRule__ParamNameAssignment_2 ) )
            {
            // InternalLibrettoProjectProfile.g:2327:1: ( ( rule__ParamTypeRule__ParamNameAssignment_2 ) )
            // InternalLibrettoProjectProfile.g:2328:2: ( rule__ParamTypeRule__ParamNameAssignment_2 )
            {
             before(grammarAccess.getParamTypeRuleAccess().getParamNameAssignment_2()); 
            // InternalLibrettoProjectProfile.g:2329:2: ( rule__ParamTypeRule__ParamNameAssignment_2 )
            // InternalLibrettoProjectProfile.g:2329:3: rule__ParamTypeRule__ParamNameAssignment_2
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
    // InternalLibrettoProjectProfile.g:2337:1: rule__ParamTypeRule__Group__3 : rule__ParamTypeRule__Group__3__Impl rule__ParamTypeRule__Group__4 ;
    public final void rule__ParamTypeRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2341:1: ( rule__ParamTypeRule__Group__3__Impl rule__ParamTypeRule__Group__4 )
            // InternalLibrettoProjectProfile.g:2342:2: rule__ParamTypeRule__Group__3__Impl rule__ParamTypeRule__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalLibrettoProjectProfile.g:2349:1: rule__ParamTypeRule__Group__3__Impl : ( 'as' ) ;
    public final void rule__ParamTypeRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2353:1: ( ( 'as' ) )
            // InternalLibrettoProjectProfile.g:2354:1: ( 'as' )
            {
            // InternalLibrettoProjectProfile.g:2354:1: ( 'as' )
            // InternalLibrettoProjectProfile.g:2355:2: 'as'
            {
             before(grammarAccess.getParamTypeRuleAccess().getAsKeyword_3()); 
            match(input,38,FOLLOW_2); 
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
    // InternalLibrettoProjectProfile.g:2364:1: rule__ParamTypeRule__Group__4 : rule__ParamTypeRule__Group__4__Impl rule__ParamTypeRule__Group__5 ;
    public final void rule__ParamTypeRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2368:1: ( rule__ParamTypeRule__Group__4__Impl rule__ParamTypeRule__Group__5 )
            // InternalLibrettoProjectProfile.g:2369:2: rule__ParamTypeRule__Group__4__Impl rule__ParamTypeRule__Group__5
            {
            pushFollow(FOLLOW_7);
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
    // InternalLibrettoProjectProfile.g:2376:1: rule__ParamTypeRule__Group__4__Impl : ( ( rule__ParamTypeRule__JavaTypeAssignment_4 ) ) ;
    public final void rule__ParamTypeRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2380:1: ( ( ( rule__ParamTypeRule__JavaTypeAssignment_4 ) ) )
            // InternalLibrettoProjectProfile.g:2381:1: ( ( rule__ParamTypeRule__JavaTypeAssignment_4 ) )
            {
            // InternalLibrettoProjectProfile.g:2381:1: ( ( rule__ParamTypeRule__JavaTypeAssignment_4 ) )
            // InternalLibrettoProjectProfile.g:2382:2: ( rule__ParamTypeRule__JavaTypeAssignment_4 )
            {
             before(grammarAccess.getParamTypeRuleAccess().getJavaTypeAssignment_4()); 
            // InternalLibrettoProjectProfile.g:2383:2: ( rule__ParamTypeRule__JavaTypeAssignment_4 )
            // InternalLibrettoProjectProfile.g:2383:3: rule__ParamTypeRule__JavaTypeAssignment_4
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
    // InternalLibrettoProjectProfile.g:2391:1: rule__ParamTypeRule__Group__5 : rule__ParamTypeRule__Group__5__Impl ;
    public final void rule__ParamTypeRule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2395:1: ( rule__ParamTypeRule__Group__5__Impl )
            // InternalLibrettoProjectProfile.g:2396:2: rule__ParamTypeRule__Group__5__Impl
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
    // InternalLibrettoProjectProfile.g:2402:1: rule__ParamTypeRule__Group__5__Impl : ( ';' ) ;
    public final void rule__ParamTypeRule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2406:1: ( ( ';' ) )
            // InternalLibrettoProjectProfile.g:2407:1: ( ';' )
            {
            // InternalLibrettoProjectProfile.g:2407:1: ( ';' )
            // InternalLibrettoProjectProfile.g:2408:2: ';'
            {
             before(grammarAccess.getParamTypeRuleAccess().getSemicolonKeyword_5()); 
            match(input,25,FOLLOW_2); 
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
    // InternalLibrettoProjectProfile.g:2418:1: rule__RecordSelfReturnRule__Group__0 : rule__RecordSelfReturnRule__Group__0__Impl rule__RecordSelfReturnRule__Group__1 ;
    public final void rule__RecordSelfReturnRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2422:1: ( rule__RecordSelfReturnRule__Group__0__Impl rule__RecordSelfReturnRule__Group__1 )
            // InternalLibrettoProjectProfile.g:2423:2: rule__RecordSelfReturnRule__Group__0__Impl rule__RecordSelfReturnRule__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalLibrettoProjectProfile.g:2430:1: rule__RecordSelfReturnRule__Group__0__Impl : ( 'recordSelfReturn' ) ;
    public final void rule__RecordSelfReturnRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2434:1: ( ( 'recordSelfReturn' ) )
            // InternalLibrettoProjectProfile.g:2435:1: ( 'recordSelfReturn' )
            {
            // InternalLibrettoProjectProfile.g:2435:1: ( 'recordSelfReturn' )
            // InternalLibrettoProjectProfile.g:2436:2: 'recordSelfReturn'
            {
             before(grammarAccess.getRecordSelfReturnRuleAccess().getRecordSelfReturnKeyword_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalLibrettoProjectProfile.g:2445:1: rule__RecordSelfReturnRule__Group__1 : rule__RecordSelfReturnRule__Group__1__Impl rule__RecordSelfReturnRule__Group__2 ;
    public final void rule__RecordSelfReturnRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2449:1: ( rule__RecordSelfReturnRule__Group__1__Impl rule__RecordSelfReturnRule__Group__2 )
            // InternalLibrettoProjectProfile.g:2450:2: rule__RecordSelfReturnRule__Group__1__Impl rule__RecordSelfReturnRule__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalLibrettoProjectProfile.g:2457:1: rule__RecordSelfReturnRule__Group__1__Impl : ( ( rule__RecordSelfReturnRule__MethodsAssignment_1 ) ) ;
    public final void rule__RecordSelfReturnRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2461:1: ( ( ( rule__RecordSelfReturnRule__MethodsAssignment_1 ) ) )
            // InternalLibrettoProjectProfile.g:2462:1: ( ( rule__RecordSelfReturnRule__MethodsAssignment_1 ) )
            {
            // InternalLibrettoProjectProfile.g:2462:1: ( ( rule__RecordSelfReturnRule__MethodsAssignment_1 ) )
            // InternalLibrettoProjectProfile.g:2463:2: ( rule__RecordSelfReturnRule__MethodsAssignment_1 )
            {
             before(grammarAccess.getRecordSelfReturnRuleAccess().getMethodsAssignment_1()); 
            // InternalLibrettoProjectProfile.g:2464:2: ( rule__RecordSelfReturnRule__MethodsAssignment_1 )
            // InternalLibrettoProjectProfile.g:2464:3: rule__RecordSelfReturnRule__MethodsAssignment_1
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
    // InternalLibrettoProjectProfile.g:2472:1: rule__RecordSelfReturnRule__Group__2 : rule__RecordSelfReturnRule__Group__2__Impl rule__RecordSelfReturnRule__Group__3 ;
    public final void rule__RecordSelfReturnRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2476:1: ( rule__RecordSelfReturnRule__Group__2__Impl rule__RecordSelfReturnRule__Group__3 )
            // InternalLibrettoProjectProfile.g:2477:2: rule__RecordSelfReturnRule__Group__2__Impl rule__RecordSelfReturnRule__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalLibrettoProjectProfile.g:2484:1: rule__RecordSelfReturnRule__Group__2__Impl : ( ( rule__RecordSelfReturnRule__Group_2__0 )* ) ;
    public final void rule__RecordSelfReturnRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2488:1: ( ( ( rule__RecordSelfReturnRule__Group_2__0 )* ) )
            // InternalLibrettoProjectProfile.g:2489:1: ( ( rule__RecordSelfReturnRule__Group_2__0 )* )
            {
            // InternalLibrettoProjectProfile.g:2489:1: ( ( rule__RecordSelfReturnRule__Group_2__0 )* )
            // InternalLibrettoProjectProfile.g:2490:2: ( rule__RecordSelfReturnRule__Group_2__0 )*
            {
             before(grammarAccess.getRecordSelfReturnRuleAccess().getGroup_2()); 
            // InternalLibrettoProjectProfile.g:2491:2: ( rule__RecordSelfReturnRule__Group_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==42) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:2491:3: rule__RecordSelfReturnRule__Group_2__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__RecordSelfReturnRule__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalLibrettoProjectProfile.g:2499:1: rule__RecordSelfReturnRule__Group__3 : rule__RecordSelfReturnRule__Group__3__Impl ;
    public final void rule__RecordSelfReturnRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2503:1: ( rule__RecordSelfReturnRule__Group__3__Impl )
            // InternalLibrettoProjectProfile.g:2504:2: rule__RecordSelfReturnRule__Group__3__Impl
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
    // InternalLibrettoProjectProfile.g:2510:1: rule__RecordSelfReturnRule__Group__3__Impl : ( ';' ) ;
    public final void rule__RecordSelfReturnRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2514:1: ( ( ';' ) )
            // InternalLibrettoProjectProfile.g:2515:1: ( ';' )
            {
            // InternalLibrettoProjectProfile.g:2515:1: ( ';' )
            // InternalLibrettoProjectProfile.g:2516:2: ';'
            {
             before(grammarAccess.getRecordSelfReturnRuleAccess().getSemicolonKeyword_3()); 
            match(input,25,FOLLOW_2); 
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
    // InternalLibrettoProjectProfile.g:2526:1: rule__RecordSelfReturnRule__Group_2__0 : rule__RecordSelfReturnRule__Group_2__0__Impl rule__RecordSelfReturnRule__Group_2__1 ;
    public final void rule__RecordSelfReturnRule__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2530:1: ( rule__RecordSelfReturnRule__Group_2__0__Impl rule__RecordSelfReturnRule__Group_2__1 )
            // InternalLibrettoProjectProfile.g:2531:2: rule__RecordSelfReturnRule__Group_2__0__Impl rule__RecordSelfReturnRule__Group_2__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalLibrettoProjectProfile.g:2538:1: rule__RecordSelfReturnRule__Group_2__0__Impl : ( ',' ) ;
    public final void rule__RecordSelfReturnRule__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2542:1: ( ( ',' ) )
            // InternalLibrettoProjectProfile.g:2543:1: ( ',' )
            {
            // InternalLibrettoProjectProfile.g:2543:1: ( ',' )
            // InternalLibrettoProjectProfile.g:2544:2: ','
            {
             before(grammarAccess.getRecordSelfReturnRuleAccess().getCommaKeyword_2_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalLibrettoProjectProfile.g:2553:1: rule__RecordSelfReturnRule__Group_2__1 : rule__RecordSelfReturnRule__Group_2__1__Impl ;
    public final void rule__RecordSelfReturnRule__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2557:1: ( rule__RecordSelfReturnRule__Group_2__1__Impl )
            // InternalLibrettoProjectProfile.g:2558:2: rule__RecordSelfReturnRule__Group_2__1__Impl
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
    // InternalLibrettoProjectProfile.g:2564:1: rule__RecordSelfReturnRule__Group_2__1__Impl : ( ( rule__RecordSelfReturnRule__MethodsAssignment_2_1 ) ) ;
    public final void rule__RecordSelfReturnRule__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2568:1: ( ( ( rule__RecordSelfReturnRule__MethodsAssignment_2_1 ) ) )
            // InternalLibrettoProjectProfile.g:2569:1: ( ( rule__RecordSelfReturnRule__MethodsAssignment_2_1 ) )
            {
            // InternalLibrettoProjectProfile.g:2569:1: ( ( rule__RecordSelfReturnRule__MethodsAssignment_2_1 ) )
            // InternalLibrettoProjectProfile.g:2570:2: ( rule__RecordSelfReturnRule__MethodsAssignment_2_1 )
            {
             before(grammarAccess.getRecordSelfReturnRuleAccess().getMethodsAssignment_2_1()); 
            // InternalLibrettoProjectProfile.g:2571:2: ( rule__RecordSelfReturnRule__MethodsAssignment_2_1 )
            // InternalLibrettoProjectProfile.g:2571:3: rule__RecordSelfReturnRule__MethodsAssignment_2_1
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
    // InternalLibrettoProjectProfile.g:2580:1: rule__MethodOverrideRule__Group__0 : rule__MethodOverrideRule__Group__0__Impl rule__MethodOverrideRule__Group__1 ;
    public final void rule__MethodOverrideRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2584:1: ( rule__MethodOverrideRule__Group__0__Impl rule__MethodOverrideRule__Group__1 )
            // InternalLibrettoProjectProfile.g:2585:2: rule__MethodOverrideRule__Group__0__Impl rule__MethodOverrideRule__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalLibrettoProjectProfile.g:2592:1: rule__MethodOverrideRule__Group__0__Impl : ( 'methodOverride' ) ;
    public final void rule__MethodOverrideRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2596:1: ( ( 'methodOverride' ) )
            // InternalLibrettoProjectProfile.g:2597:1: ( 'methodOverride' )
            {
            // InternalLibrettoProjectProfile.g:2597:1: ( 'methodOverride' )
            // InternalLibrettoProjectProfile.g:2598:2: 'methodOverride'
            {
             before(grammarAccess.getMethodOverrideRuleAccess().getMethodOverrideKeyword_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalLibrettoProjectProfile.g:2607:1: rule__MethodOverrideRule__Group__1 : rule__MethodOverrideRule__Group__1__Impl rule__MethodOverrideRule__Group__2 ;
    public final void rule__MethodOverrideRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2611:1: ( rule__MethodOverrideRule__Group__1__Impl rule__MethodOverrideRule__Group__2 )
            // InternalLibrettoProjectProfile.g:2612:2: rule__MethodOverrideRule__Group__1__Impl rule__MethodOverrideRule__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalLibrettoProjectProfile.g:2619:1: rule__MethodOverrideRule__Group__1__Impl : ( ( rule__MethodOverrideRule__SignatureAssignment_1 ) ) ;
    public final void rule__MethodOverrideRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2623:1: ( ( ( rule__MethodOverrideRule__SignatureAssignment_1 ) ) )
            // InternalLibrettoProjectProfile.g:2624:1: ( ( rule__MethodOverrideRule__SignatureAssignment_1 ) )
            {
            // InternalLibrettoProjectProfile.g:2624:1: ( ( rule__MethodOverrideRule__SignatureAssignment_1 ) )
            // InternalLibrettoProjectProfile.g:2625:2: ( rule__MethodOverrideRule__SignatureAssignment_1 )
            {
             before(grammarAccess.getMethodOverrideRuleAccess().getSignatureAssignment_1()); 
            // InternalLibrettoProjectProfile.g:2626:2: ( rule__MethodOverrideRule__SignatureAssignment_1 )
            // InternalLibrettoProjectProfile.g:2626:3: rule__MethodOverrideRule__SignatureAssignment_1
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
    // InternalLibrettoProjectProfile.g:2634:1: rule__MethodOverrideRule__Group__2 : rule__MethodOverrideRule__Group__2__Impl rule__MethodOverrideRule__Group__3 ;
    public final void rule__MethodOverrideRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2638:1: ( rule__MethodOverrideRule__Group__2__Impl rule__MethodOverrideRule__Group__3 )
            // InternalLibrettoProjectProfile.g:2639:2: rule__MethodOverrideRule__Group__2__Impl rule__MethodOverrideRule__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalLibrettoProjectProfile.g:2646:1: rule__MethodOverrideRule__Group__2__Impl : ( 'returns' ) ;
    public final void rule__MethodOverrideRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2650:1: ( ( 'returns' ) )
            // InternalLibrettoProjectProfile.g:2651:1: ( 'returns' )
            {
            // InternalLibrettoProjectProfile.g:2651:1: ( 'returns' )
            // InternalLibrettoProjectProfile.g:2652:2: 'returns'
            {
             before(grammarAccess.getMethodOverrideRuleAccess().getReturnsKeyword_2()); 
            match(input,44,FOLLOW_2); 
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
    // InternalLibrettoProjectProfile.g:2661:1: rule__MethodOverrideRule__Group__3 : rule__MethodOverrideRule__Group__3__Impl rule__MethodOverrideRule__Group__4 ;
    public final void rule__MethodOverrideRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2665:1: ( rule__MethodOverrideRule__Group__3__Impl rule__MethodOverrideRule__Group__4 )
            // InternalLibrettoProjectProfile.g:2666:2: rule__MethodOverrideRule__Group__3__Impl rule__MethodOverrideRule__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalLibrettoProjectProfile.g:2673:1: rule__MethodOverrideRule__Group__3__Impl : ( ( rule__MethodOverrideRule__JavaTypeAssignment_3 ) ) ;
    public final void rule__MethodOverrideRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2677:1: ( ( ( rule__MethodOverrideRule__JavaTypeAssignment_3 ) ) )
            // InternalLibrettoProjectProfile.g:2678:1: ( ( rule__MethodOverrideRule__JavaTypeAssignment_3 ) )
            {
            // InternalLibrettoProjectProfile.g:2678:1: ( ( rule__MethodOverrideRule__JavaTypeAssignment_3 ) )
            // InternalLibrettoProjectProfile.g:2679:2: ( rule__MethodOverrideRule__JavaTypeAssignment_3 )
            {
             before(grammarAccess.getMethodOverrideRuleAccess().getJavaTypeAssignment_3()); 
            // InternalLibrettoProjectProfile.g:2680:2: ( rule__MethodOverrideRule__JavaTypeAssignment_3 )
            // InternalLibrettoProjectProfile.g:2680:3: rule__MethodOverrideRule__JavaTypeAssignment_3
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
    // InternalLibrettoProjectProfile.g:2688:1: rule__MethodOverrideRule__Group__4 : rule__MethodOverrideRule__Group__4__Impl ;
    public final void rule__MethodOverrideRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2692:1: ( rule__MethodOverrideRule__Group__4__Impl )
            // InternalLibrettoProjectProfile.g:2693:2: rule__MethodOverrideRule__Group__4__Impl
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
    // InternalLibrettoProjectProfile.g:2699:1: rule__MethodOverrideRule__Group__4__Impl : ( ';' ) ;
    public final void rule__MethodOverrideRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2703:1: ( ( ';' ) )
            // InternalLibrettoProjectProfile.g:2704:1: ( ';' )
            {
            // InternalLibrettoProjectProfile.g:2704:1: ( ';' )
            // InternalLibrettoProjectProfile.g:2705:2: ';'
            {
             before(grammarAccess.getMethodOverrideRuleAccess().getSemicolonKeyword_4()); 
            match(input,25,FOLLOW_2); 
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
    // InternalLibrettoProjectProfile.g:2715:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2719:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalLibrettoProjectProfile.g:2720:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalLibrettoProjectProfile.g:2727:1: rule__QualifiedName__Group__0__Impl : ( ( rule__QualifiedName__SegmentsAssignment_0 ) ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2731:1: ( ( ( rule__QualifiedName__SegmentsAssignment_0 ) ) )
            // InternalLibrettoProjectProfile.g:2732:1: ( ( rule__QualifiedName__SegmentsAssignment_0 ) )
            {
            // InternalLibrettoProjectProfile.g:2732:1: ( ( rule__QualifiedName__SegmentsAssignment_0 ) )
            // InternalLibrettoProjectProfile.g:2733:2: ( rule__QualifiedName__SegmentsAssignment_0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getSegmentsAssignment_0()); 
            // InternalLibrettoProjectProfile.g:2734:2: ( rule__QualifiedName__SegmentsAssignment_0 )
            // InternalLibrettoProjectProfile.g:2734:3: rule__QualifiedName__SegmentsAssignment_0
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
    // InternalLibrettoProjectProfile.g:2742:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2746:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalLibrettoProjectProfile.g:2747:2: rule__QualifiedName__Group__1__Impl
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
    // InternalLibrettoProjectProfile.g:2753:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2757:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalLibrettoProjectProfile.g:2758:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalLibrettoProjectProfile.g:2758:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalLibrettoProjectProfile.g:2759:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalLibrettoProjectProfile.g:2760:2: ( rule__QualifiedName__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==45) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:2760:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalLibrettoProjectProfile.g:2769:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2773:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalLibrettoProjectProfile.g:2774:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalLibrettoProjectProfile.g:2781:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2785:1: ( ( '.' ) )
            // InternalLibrettoProjectProfile.g:2786:1: ( '.' )
            {
            // InternalLibrettoProjectProfile.g:2786:1: ( '.' )
            // InternalLibrettoProjectProfile.g:2787:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalLibrettoProjectProfile.g:2796:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2800:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalLibrettoProjectProfile.g:2801:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalLibrettoProjectProfile.g:2807:1: rule__QualifiedName__Group_1__1__Impl : ( ( rule__QualifiedName__SegmentsAssignment_1_1 ) ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2811:1: ( ( ( rule__QualifiedName__SegmentsAssignment_1_1 ) ) )
            // InternalLibrettoProjectProfile.g:2812:1: ( ( rule__QualifiedName__SegmentsAssignment_1_1 ) )
            {
            // InternalLibrettoProjectProfile.g:2812:1: ( ( rule__QualifiedName__SegmentsAssignment_1_1 ) )
            // InternalLibrettoProjectProfile.g:2813:2: ( rule__QualifiedName__SegmentsAssignment_1_1 )
            {
             before(grammarAccess.getQualifiedNameAccess().getSegmentsAssignment_1_1()); 
            // InternalLibrettoProjectProfile.g:2814:2: ( rule__QualifiedName__SegmentsAssignment_1_1 )
            // InternalLibrettoProjectProfile.g:2814:3: rule__QualifiedName__SegmentsAssignment_1_1
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
    // InternalLibrettoProjectProfile.g:2823:1: rule__OperationSignature__Group__0 : rule__OperationSignature__Group__0__Impl rule__OperationSignature__Group__1 ;
    public final void rule__OperationSignature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2827:1: ( rule__OperationSignature__Group__0__Impl rule__OperationSignature__Group__1 )
            // InternalLibrettoProjectProfile.g:2828:2: rule__OperationSignature__Group__0__Impl rule__OperationSignature__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalLibrettoProjectProfile.g:2835:1: rule__OperationSignature__Group__0__Impl : ( ( rule__OperationSignature__NameAssignment_0 ) ) ;
    public final void rule__OperationSignature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2839:1: ( ( ( rule__OperationSignature__NameAssignment_0 ) ) )
            // InternalLibrettoProjectProfile.g:2840:1: ( ( rule__OperationSignature__NameAssignment_0 ) )
            {
            // InternalLibrettoProjectProfile.g:2840:1: ( ( rule__OperationSignature__NameAssignment_0 ) )
            // InternalLibrettoProjectProfile.g:2841:2: ( rule__OperationSignature__NameAssignment_0 )
            {
             before(grammarAccess.getOperationSignatureAccess().getNameAssignment_0()); 
            // InternalLibrettoProjectProfile.g:2842:2: ( rule__OperationSignature__NameAssignment_0 )
            // InternalLibrettoProjectProfile.g:2842:3: rule__OperationSignature__NameAssignment_0
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
    // InternalLibrettoProjectProfile.g:2850:1: rule__OperationSignature__Group__1 : rule__OperationSignature__Group__1__Impl rule__OperationSignature__Group__2 ;
    public final void rule__OperationSignature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2854:1: ( rule__OperationSignature__Group__1__Impl rule__OperationSignature__Group__2 )
            // InternalLibrettoProjectProfile.g:2855:2: rule__OperationSignature__Group__1__Impl rule__OperationSignature__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalLibrettoProjectProfile.g:2862:1: rule__OperationSignature__Group__1__Impl : ( '(' ) ;
    public final void rule__OperationSignature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2866:1: ( ( '(' ) )
            // InternalLibrettoProjectProfile.g:2867:1: ( '(' )
            {
            // InternalLibrettoProjectProfile.g:2867:1: ( '(' )
            // InternalLibrettoProjectProfile.g:2868:2: '('
            {
             before(grammarAccess.getOperationSignatureAccess().getLeftParenthesisKeyword_1()); 
            match(input,46,FOLLOW_2); 
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
    // InternalLibrettoProjectProfile.g:2877:1: rule__OperationSignature__Group__2 : rule__OperationSignature__Group__2__Impl rule__OperationSignature__Group__3 ;
    public final void rule__OperationSignature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2881:1: ( rule__OperationSignature__Group__2__Impl rule__OperationSignature__Group__3 )
            // InternalLibrettoProjectProfile.g:2882:2: rule__OperationSignature__Group__2__Impl rule__OperationSignature__Group__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalLibrettoProjectProfile.g:2889:1: rule__OperationSignature__Group__2__Impl : ( ( rule__OperationSignature__Group_2__0 )? ) ;
    public final void rule__OperationSignature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2893:1: ( ( ( rule__OperationSignature__Group_2__0 )? ) )
            // InternalLibrettoProjectProfile.g:2894:1: ( ( rule__OperationSignature__Group_2__0 )? )
            {
            // InternalLibrettoProjectProfile.g:2894:1: ( ( rule__OperationSignature__Group_2__0 )? )
            // InternalLibrettoProjectProfile.g:2895:2: ( rule__OperationSignature__Group_2__0 )?
            {
             before(grammarAccess.getOperationSignatureAccess().getGroup_2()); 
            // InternalLibrettoProjectProfile.g:2896:2: ( rule__OperationSignature__Group_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID||(LA19_0>=11 && LA19_0<=19)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:2896:3: rule__OperationSignature__Group_2__0
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
    // InternalLibrettoProjectProfile.g:2904:1: rule__OperationSignature__Group__3 : rule__OperationSignature__Group__3__Impl ;
    public final void rule__OperationSignature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2908:1: ( rule__OperationSignature__Group__3__Impl )
            // InternalLibrettoProjectProfile.g:2909:2: rule__OperationSignature__Group__3__Impl
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
    // InternalLibrettoProjectProfile.g:2915:1: rule__OperationSignature__Group__3__Impl : ( ')' ) ;
    public final void rule__OperationSignature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2919:1: ( ( ')' ) )
            // InternalLibrettoProjectProfile.g:2920:1: ( ')' )
            {
            // InternalLibrettoProjectProfile.g:2920:1: ( ')' )
            // InternalLibrettoProjectProfile.g:2921:2: ')'
            {
             before(grammarAccess.getOperationSignatureAccess().getRightParenthesisKeyword_3()); 
            match(input,47,FOLLOW_2); 
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
    // InternalLibrettoProjectProfile.g:2931:1: rule__OperationSignature__Group_2__0 : rule__OperationSignature__Group_2__0__Impl rule__OperationSignature__Group_2__1 ;
    public final void rule__OperationSignature__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2935:1: ( rule__OperationSignature__Group_2__0__Impl rule__OperationSignature__Group_2__1 )
            // InternalLibrettoProjectProfile.g:2936:2: rule__OperationSignature__Group_2__0__Impl rule__OperationSignature__Group_2__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalLibrettoProjectProfile.g:2943:1: rule__OperationSignature__Group_2__0__Impl : ( ( rule__OperationSignature__ParamsAssignment_2_0 ) ) ;
    public final void rule__OperationSignature__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2947:1: ( ( ( rule__OperationSignature__ParamsAssignment_2_0 ) ) )
            // InternalLibrettoProjectProfile.g:2948:1: ( ( rule__OperationSignature__ParamsAssignment_2_0 ) )
            {
            // InternalLibrettoProjectProfile.g:2948:1: ( ( rule__OperationSignature__ParamsAssignment_2_0 ) )
            // InternalLibrettoProjectProfile.g:2949:2: ( rule__OperationSignature__ParamsAssignment_2_0 )
            {
             before(grammarAccess.getOperationSignatureAccess().getParamsAssignment_2_0()); 
            // InternalLibrettoProjectProfile.g:2950:2: ( rule__OperationSignature__ParamsAssignment_2_0 )
            // InternalLibrettoProjectProfile.g:2950:3: rule__OperationSignature__ParamsAssignment_2_0
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
    // InternalLibrettoProjectProfile.g:2958:1: rule__OperationSignature__Group_2__1 : rule__OperationSignature__Group_2__1__Impl ;
    public final void rule__OperationSignature__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2962:1: ( rule__OperationSignature__Group_2__1__Impl )
            // InternalLibrettoProjectProfile.g:2963:2: rule__OperationSignature__Group_2__1__Impl
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
    // InternalLibrettoProjectProfile.g:2969:1: rule__OperationSignature__Group_2__1__Impl : ( ( rule__OperationSignature__Group_2_1__0 )* ) ;
    public final void rule__OperationSignature__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2973:1: ( ( ( rule__OperationSignature__Group_2_1__0 )* ) )
            // InternalLibrettoProjectProfile.g:2974:1: ( ( rule__OperationSignature__Group_2_1__0 )* )
            {
            // InternalLibrettoProjectProfile.g:2974:1: ( ( rule__OperationSignature__Group_2_1__0 )* )
            // InternalLibrettoProjectProfile.g:2975:2: ( rule__OperationSignature__Group_2_1__0 )*
            {
             before(grammarAccess.getOperationSignatureAccess().getGroup_2_1()); 
            // InternalLibrettoProjectProfile.g:2976:2: ( rule__OperationSignature__Group_2_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==42) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:2976:3: rule__OperationSignature__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__OperationSignature__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalLibrettoProjectProfile.g:2985:1: rule__OperationSignature__Group_2_1__0 : rule__OperationSignature__Group_2_1__0__Impl rule__OperationSignature__Group_2_1__1 ;
    public final void rule__OperationSignature__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:2989:1: ( rule__OperationSignature__Group_2_1__0__Impl rule__OperationSignature__Group_2_1__1 )
            // InternalLibrettoProjectProfile.g:2990:2: rule__OperationSignature__Group_2_1__0__Impl rule__OperationSignature__Group_2_1__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalLibrettoProjectProfile.g:2997:1: rule__OperationSignature__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__OperationSignature__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3001:1: ( ( ',' ) )
            // InternalLibrettoProjectProfile.g:3002:1: ( ',' )
            {
            // InternalLibrettoProjectProfile.g:3002:1: ( ',' )
            // InternalLibrettoProjectProfile.g:3003:2: ','
            {
             before(grammarAccess.getOperationSignatureAccess().getCommaKeyword_2_1_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalLibrettoProjectProfile.g:3012:1: rule__OperationSignature__Group_2_1__1 : rule__OperationSignature__Group_2_1__1__Impl ;
    public final void rule__OperationSignature__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3016:1: ( rule__OperationSignature__Group_2_1__1__Impl )
            // InternalLibrettoProjectProfile.g:3017:2: rule__OperationSignature__Group_2_1__1__Impl
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
    // InternalLibrettoProjectProfile.g:3023:1: rule__OperationSignature__Group_2_1__1__Impl : ( ( rule__OperationSignature__ParamsAssignment_2_1_1 ) ) ;
    public final void rule__OperationSignature__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3027:1: ( ( ( rule__OperationSignature__ParamsAssignment_2_1_1 ) ) )
            // InternalLibrettoProjectProfile.g:3028:1: ( ( rule__OperationSignature__ParamsAssignment_2_1_1 ) )
            {
            // InternalLibrettoProjectProfile.g:3028:1: ( ( rule__OperationSignature__ParamsAssignment_2_1_1 ) )
            // InternalLibrettoProjectProfile.g:3029:2: ( rule__OperationSignature__ParamsAssignment_2_1_1 )
            {
             before(grammarAccess.getOperationSignatureAccess().getParamsAssignment_2_1_1()); 
            // InternalLibrettoProjectProfile.g:3030:2: ( rule__OperationSignature__ParamsAssignment_2_1_1 )
            // InternalLibrettoProjectProfile.g:3030:3: rule__OperationSignature__ParamsAssignment_2_1_1
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
    // InternalLibrettoProjectProfile.g:3039:1: rule__TypedParam__Group__0 : rule__TypedParam__Group__0__Impl rule__TypedParam__Group__1 ;
    public final void rule__TypedParam__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3043:1: ( rule__TypedParam__Group__0__Impl rule__TypedParam__Group__1 )
            // InternalLibrettoProjectProfile.g:3044:2: rule__TypedParam__Group__0__Impl rule__TypedParam__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalLibrettoProjectProfile.g:3051:1: rule__TypedParam__Group__0__Impl : ( ( rule__TypedParam__TypeAssignment_0 ) ) ;
    public final void rule__TypedParam__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3055:1: ( ( ( rule__TypedParam__TypeAssignment_0 ) ) )
            // InternalLibrettoProjectProfile.g:3056:1: ( ( rule__TypedParam__TypeAssignment_0 ) )
            {
            // InternalLibrettoProjectProfile.g:3056:1: ( ( rule__TypedParam__TypeAssignment_0 ) )
            // InternalLibrettoProjectProfile.g:3057:2: ( rule__TypedParam__TypeAssignment_0 )
            {
             before(grammarAccess.getTypedParamAccess().getTypeAssignment_0()); 
            // InternalLibrettoProjectProfile.g:3058:2: ( rule__TypedParam__TypeAssignment_0 )
            // InternalLibrettoProjectProfile.g:3058:3: rule__TypedParam__TypeAssignment_0
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
    // InternalLibrettoProjectProfile.g:3066:1: rule__TypedParam__Group__1 : rule__TypedParam__Group__1__Impl ;
    public final void rule__TypedParam__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3070:1: ( rule__TypedParam__Group__1__Impl )
            // InternalLibrettoProjectProfile.g:3071:2: rule__TypedParam__Group__1__Impl
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
    // InternalLibrettoProjectProfile.g:3077:1: rule__TypedParam__Group__1__Impl : ( ( rule__TypedParam__ParamNameAssignment_1 ) ) ;
    public final void rule__TypedParam__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3081:1: ( ( ( rule__TypedParam__ParamNameAssignment_1 ) ) )
            // InternalLibrettoProjectProfile.g:3082:1: ( ( rule__TypedParam__ParamNameAssignment_1 ) )
            {
            // InternalLibrettoProjectProfile.g:3082:1: ( ( rule__TypedParam__ParamNameAssignment_1 ) )
            // InternalLibrettoProjectProfile.g:3083:2: ( rule__TypedParam__ParamNameAssignment_1 )
            {
             before(grammarAccess.getTypedParamAccess().getParamNameAssignment_1()); 
            // InternalLibrettoProjectProfile.g:3084:2: ( rule__TypedParam__ParamNameAssignment_1 )
            // InternalLibrettoProjectProfile.g:3084:3: rule__TypedParam__ParamNameAssignment_1
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


    // $ANTLR start "rule__ProjectProfile__ProfileNameAssignment_1"
    // InternalLibrettoProjectProfile.g:3093:1: rule__ProjectProfile__ProfileNameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ProjectProfile__ProfileNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3097:1: ( ( RULE_STRING ) )
            // InternalLibrettoProjectProfile.g:3098:2: ( RULE_STRING )
            {
            // InternalLibrettoProjectProfile.g:3098:2: ( RULE_STRING )
            // InternalLibrettoProjectProfile.g:3099:3: RULE_STRING
            {
             before(grammarAccess.getProjectProfileAccess().getProfileNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getProjectProfileAccess().getProfileNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectProfile__ProfileNameAssignment_1"


    // $ANTLR start "rule__ProjectProfile__ProjectAssignment_3"
    // InternalLibrettoProjectProfile.g:3108:1: rule__ProjectProfile__ProjectAssignment_3 : ( ruleProjectBlock ) ;
    public final void rule__ProjectProfile__ProjectAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3112:1: ( ( ruleProjectBlock ) )
            // InternalLibrettoProjectProfile.g:3113:2: ( ruleProjectBlock )
            {
            // InternalLibrettoProjectProfile.g:3113:2: ( ruleProjectBlock )
            // InternalLibrettoProjectProfile.g:3114:3: ruleProjectBlock
            {
             before(grammarAccess.getProjectProfileAccess().getProjectProjectBlockParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleProjectBlock();

            state._fsp--;

             after(grammarAccess.getProjectProfileAccess().getProjectProjectBlockParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectProfile__ProjectAssignment_3"


    // $ANTLR start "rule__ProjectProfile__SurfaceAssignment_4"
    // InternalLibrettoProjectProfile.g:3123:1: rule__ProjectProfile__SurfaceAssignment_4 : ( ruleSurfaceBlock ) ;
    public final void rule__ProjectProfile__SurfaceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3127:1: ( ( ruleSurfaceBlock ) )
            // InternalLibrettoProjectProfile.g:3128:2: ( ruleSurfaceBlock )
            {
            // InternalLibrettoProjectProfile.g:3128:2: ( ruleSurfaceBlock )
            // InternalLibrettoProjectProfile.g:3129:3: ruleSurfaceBlock
            {
             before(grammarAccess.getProjectProfileAccess().getSurfaceSurfaceBlockParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSurfaceBlock();

            state._fsp--;

             after(grammarAccess.getProjectProfileAccess().getSurfaceSurfaceBlockParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectProfile__SurfaceAssignment_4"


    // $ANTLR start "rule__ProjectBlock__RootDirAssignment_2_1"
    // InternalLibrettoProjectProfile.g:3138:1: rule__ProjectBlock__RootDirAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__ProjectBlock__RootDirAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3142:1: ( ( RULE_STRING ) )
            // InternalLibrettoProjectProfile.g:3143:2: ( RULE_STRING )
            {
            // InternalLibrettoProjectProfile.g:3143:2: ( RULE_STRING )
            // InternalLibrettoProjectProfile.g:3144:3: RULE_STRING
            {
             before(grammarAccess.getProjectBlockAccess().getRootDirSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getProjectBlockAccess().getRootDirSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectBlock__RootDirAssignment_2_1"


    // $ANTLR start "rule__ProjectBlock__ModulesAssignment_3"
    // InternalLibrettoProjectProfile.g:3153:1: rule__ProjectBlock__ModulesAssignment_3 : ( ruleModulesBlock ) ;
    public final void rule__ProjectBlock__ModulesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3157:1: ( ( ruleModulesBlock ) )
            // InternalLibrettoProjectProfile.g:3158:2: ( ruleModulesBlock )
            {
            // InternalLibrettoProjectProfile.g:3158:2: ( ruleModulesBlock )
            // InternalLibrettoProjectProfile.g:3159:3: ruleModulesBlock
            {
             before(grammarAccess.getProjectBlockAccess().getModulesModulesBlockParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleModulesBlock();

            state._fsp--;

             after(grammarAccess.getProjectBlockAccess().getModulesModulesBlockParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectBlock__ModulesAssignment_3"


    // $ANTLR start "rule__ModulesBlock__ModulesAssignment_2"
    // InternalLibrettoProjectProfile.g:3168:1: rule__ModulesBlock__ModulesAssignment_2 : ( ruleProjectModule ) ;
    public final void rule__ModulesBlock__ModulesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3172:1: ( ( ruleProjectModule ) )
            // InternalLibrettoProjectProfile.g:3173:2: ( ruleProjectModule )
            {
            // InternalLibrettoProjectProfile.g:3173:2: ( ruleProjectModule )
            // InternalLibrettoProjectProfile.g:3174:3: ruleProjectModule
            {
             before(grammarAccess.getModulesBlockAccess().getModulesProjectModuleParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleProjectModule();

            state._fsp--;

             after(grammarAccess.getModulesBlockAccess().getModulesProjectModuleParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModulesBlock__ModulesAssignment_2"


    // $ANTLR start "rule__ProjectModule__NameAssignment_1"
    // InternalLibrettoProjectProfile.g:3183:1: rule__ProjectModule__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ProjectModule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3187:1: ( ( RULE_STRING ) )
            // InternalLibrettoProjectProfile.g:3188:2: ( RULE_STRING )
            {
            // InternalLibrettoProjectProfile.g:3188:2: ( RULE_STRING )
            // InternalLibrettoProjectProfile.g:3189:3: RULE_STRING
            {
             before(grammarAccess.getProjectModuleAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getProjectModuleAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__ProjectModule__DirAssignment_4"
    // InternalLibrettoProjectProfile.g:3198:1: rule__ProjectModule__DirAssignment_4 : ( RULE_STRING ) ;
    public final void rule__ProjectModule__DirAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3202:1: ( ( RULE_STRING ) )
            // InternalLibrettoProjectProfile.g:3203:2: ( RULE_STRING )
            {
            // InternalLibrettoProjectProfile.g:3203:2: ( RULE_STRING )
            // InternalLibrettoProjectProfile.g:3204:3: RULE_STRING
            {
             before(grammarAccess.getProjectModuleAccess().getDirSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getProjectModuleAccess().getDirSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModule__DirAssignment_4"


    // $ANTLR start "rule__ProjectModule__SpecsDirAssignment_6_1"
    // InternalLibrettoProjectProfile.g:3213:1: rule__ProjectModule__SpecsDirAssignment_6_1 : ( RULE_STRING ) ;
    public final void rule__ProjectModule__SpecsDirAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3217:1: ( ( RULE_STRING ) )
            // InternalLibrettoProjectProfile.g:3218:2: ( RULE_STRING )
            {
            // InternalLibrettoProjectProfile.g:3218:2: ( RULE_STRING )
            // InternalLibrettoProjectProfile.g:3219:3: RULE_STRING
            {
             before(grammarAccess.getProjectModuleAccess().getSpecsDirSTRINGTerminalRuleCall_6_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getProjectModuleAccess().getSpecsDirSTRINGTerminalRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModule__SpecsDirAssignment_6_1"


    // $ANTLR start "rule__ProjectModule__TestsDirAssignment_7_1"
    // InternalLibrettoProjectProfile.g:3228:1: rule__ProjectModule__TestsDirAssignment_7_1 : ( RULE_STRING ) ;
    public final void rule__ProjectModule__TestsDirAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3232:1: ( ( RULE_STRING ) )
            // InternalLibrettoProjectProfile.g:3233:2: ( RULE_STRING )
            {
            // InternalLibrettoProjectProfile.g:3233:2: ( RULE_STRING )
            // InternalLibrettoProjectProfile.g:3234:3: RULE_STRING
            {
             before(grammarAccess.getProjectModuleAccess().getTestsDirSTRINGTerminalRuleCall_7_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getProjectModuleAccess().getTestsDirSTRINGTerminalRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModule__TestsDirAssignment_7_1"


    // $ANTLR start "rule__ProjectModule__MainJavaDirAssignment_8_1"
    // InternalLibrettoProjectProfile.g:3243:1: rule__ProjectModule__MainJavaDirAssignment_8_1 : ( RULE_STRING ) ;
    public final void rule__ProjectModule__MainJavaDirAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3247:1: ( ( RULE_STRING ) )
            // InternalLibrettoProjectProfile.g:3248:2: ( RULE_STRING )
            {
            // InternalLibrettoProjectProfile.g:3248:2: ( RULE_STRING )
            // InternalLibrettoProjectProfile.g:3249:3: RULE_STRING
            {
             before(grammarAccess.getProjectModuleAccess().getMainJavaDirSTRINGTerminalRuleCall_8_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getProjectModuleAccess().getMainJavaDirSTRINGTerminalRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModule__MainJavaDirAssignment_8_1"


    // $ANTLR start "rule__ProjectModule__BasePackageAssignment_9_1"
    // InternalLibrettoProjectProfile.g:3258:1: rule__ProjectModule__BasePackageAssignment_9_1 : ( RULE_STRING ) ;
    public final void rule__ProjectModule__BasePackageAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3262:1: ( ( RULE_STRING ) )
            // InternalLibrettoProjectProfile.g:3263:2: ( RULE_STRING )
            {
            // InternalLibrettoProjectProfile.g:3263:2: ( RULE_STRING )
            // InternalLibrettoProjectProfile.g:3264:3: RULE_STRING
            {
             before(grammarAccess.getProjectModuleAccess().getBasePackageSTRINGTerminalRuleCall_9_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getProjectModuleAccess().getBasePackageSTRINGTerminalRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectModule__BasePackageAssignment_9_1"


    // $ANTLR start "rule__SurfaceBlock__ElementsAssignment_2"
    // InternalLibrettoProjectProfile.g:3273:1: rule__SurfaceBlock__ElementsAssignment_2 : ( ruleSurfaceElement ) ;
    public final void rule__SurfaceBlock__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3277:1: ( ( ruleSurfaceElement ) )
            // InternalLibrettoProjectProfile.g:3278:2: ( ruleSurfaceElement )
            {
            // InternalLibrettoProjectProfile.g:3278:2: ( ruleSurfaceElement )
            // InternalLibrettoProjectProfile.g:3279:3: ruleSurfaceElement
            {
             before(grammarAccess.getSurfaceBlockAccess().getElementsSurfaceElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSurfaceElement();

            state._fsp--;

             after(grammarAccess.getSurfaceBlockAccess().getElementsSurfaceElementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurfaceBlock__ElementsAssignment_2"


    // $ANTLR start "rule__ScopedSurface__ModuleIdAssignment_1_0_1"
    // InternalLibrettoProjectProfile.g:3288:1: rule__ScopedSurface__ModuleIdAssignment_1_0_1 : ( RULE_STRING ) ;
    public final void rule__ScopedSurface__ModuleIdAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3292:1: ( ( RULE_STRING ) )
            // InternalLibrettoProjectProfile.g:3293:2: ( RULE_STRING )
            {
            // InternalLibrettoProjectProfile.g:3293:2: ( RULE_STRING )
            // InternalLibrettoProjectProfile.g:3294:3: RULE_STRING
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
    // InternalLibrettoProjectProfile.g:3303:1: rule__ScopedSurface__SpecIdAssignment_1_1_1 : ( RULE_STRING ) ;
    public final void rule__ScopedSurface__SpecIdAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3307:1: ( ( RULE_STRING ) )
            // InternalLibrettoProjectProfile.g:3308:2: ( RULE_STRING )
            {
            // InternalLibrettoProjectProfile.g:3308:2: ( RULE_STRING )
            // InternalLibrettoProjectProfile.g:3309:3: RULE_STRING
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
    // InternalLibrettoProjectProfile.g:3318:1: rule__ScopedSurface__RulesAssignment_3 : ( ruleSurfaceRule ) ;
    public final void rule__ScopedSurface__RulesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3322:1: ( ( ruleSurfaceRule ) )
            // InternalLibrettoProjectProfile.g:3323:2: ( ruleSurfaceRule )
            {
            // InternalLibrettoProjectProfile.g:3323:2: ( ruleSurfaceRule )
            // InternalLibrettoProjectProfile.g:3324:3: ruleSurfaceRule
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
    // InternalLibrettoProjectProfile.g:3333:1: rule__ReturnTypeRule__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ReturnTypeRule__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3337:1: ( ( RULE_ID ) )
            // InternalLibrettoProjectProfile.g:3338:2: ( RULE_ID )
            {
            // InternalLibrettoProjectProfile.g:3338:2: ( RULE_ID )
            // InternalLibrettoProjectProfile.g:3339:3: RULE_ID
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
    // InternalLibrettoProjectProfile.g:3348:1: rule__ReturnTypeRule__JavaTypeAssignment_4 : ( ruleJavaType ) ;
    public final void rule__ReturnTypeRule__JavaTypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3352:1: ( ( ruleJavaType ) )
            // InternalLibrettoProjectProfile.g:3353:2: ( ruleJavaType )
            {
            // InternalLibrettoProjectProfile.g:3353:2: ( ruleJavaType )
            // InternalLibrettoProjectProfile.g:3354:3: ruleJavaType
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
    // InternalLibrettoProjectProfile.g:3363:1: rule__ParamTypeRule__ParamNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ParamTypeRule__ParamNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3367:1: ( ( RULE_ID ) )
            // InternalLibrettoProjectProfile.g:3368:2: ( RULE_ID )
            {
            // InternalLibrettoProjectProfile.g:3368:2: ( RULE_ID )
            // InternalLibrettoProjectProfile.g:3369:3: RULE_ID
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
    // InternalLibrettoProjectProfile.g:3378:1: rule__ParamTypeRule__JavaTypeAssignment_4 : ( ruleJavaType ) ;
    public final void rule__ParamTypeRule__JavaTypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3382:1: ( ( ruleJavaType ) )
            // InternalLibrettoProjectProfile.g:3383:2: ( ruleJavaType )
            {
            // InternalLibrettoProjectProfile.g:3383:2: ( ruleJavaType )
            // InternalLibrettoProjectProfile.g:3384:3: ruleJavaType
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
    // InternalLibrettoProjectProfile.g:3393:1: rule__RecordSelfReturnRule__MethodsAssignment_1 : ( RULE_ID ) ;
    public final void rule__RecordSelfReturnRule__MethodsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3397:1: ( ( RULE_ID ) )
            // InternalLibrettoProjectProfile.g:3398:2: ( RULE_ID )
            {
            // InternalLibrettoProjectProfile.g:3398:2: ( RULE_ID )
            // InternalLibrettoProjectProfile.g:3399:3: RULE_ID
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
    // InternalLibrettoProjectProfile.g:3408:1: rule__RecordSelfReturnRule__MethodsAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__RecordSelfReturnRule__MethodsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3412:1: ( ( RULE_ID ) )
            // InternalLibrettoProjectProfile.g:3413:2: ( RULE_ID )
            {
            // InternalLibrettoProjectProfile.g:3413:2: ( RULE_ID )
            // InternalLibrettoProjectProfile.g:3414:3: RULE_ID
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
    // InternalLibrettoProjectProfile.g:3423:1: rule__MethodOverrideRule__SignatureAssignment_1 : ( ruleOperationSignature ) ;
    public final void rule__MethodOverrideRule__SignatureAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3427:1: ( ( ruleOperationSignature ) )
            // InternalLibrettoProjectProfile.g:3428:2: ( ruleOperationSignature )
            {
            // InternalLibrettoProjectProfile.g:3428:2: ( ruleOperationSignature )
            // InternalLibrettoProjectProfile.g:3429:3: ruleOperationSignature
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
    // InternalLibrettoProjectProfile.g:3438:1: rule__MethodOverrideRule__JavaTypeAssignment_3 : ( ruleJavaType ) ;
    public final void rule__MethodOverrideRule__JavaTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3442:1: ( ( ruleJavaType ) )
            // InternalLibrettoProjectProfile.g:3443:2: ( ruleJavaType )
            {
            // InternalLibrettoProjectProfile.g:3443:2: ( ruleJavaType )
            // InternalLibrettoProjectProfile.g:3444:3: ruleJavaType
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
    // InternalLibrettoProjectProfile.g:3453:1: rule__QualifiedName__SegmentsAssignment_0 : ( RULE_ID ) ;
    public final void rule__QualifiedName__SegmentsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3457:1: ( ( RULE_ID ) )
            // InternalLibrettoProjectProfile.g:3458:2: ( RULE_ID )
            {
            // InternalLibrettoProjectProfile.g:3458:2: ( RULE_ID )
            // InternalLibrettoProjectProfile.g:3459:3: RULE_ID
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
    // InternalLibrettoProjectProfile.g:3468:1: rule__QualifiedName__SegmentsAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__QualifiedName__SegmentsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3472:1: ( ( RULE_ID ) )
            // InternalLibrettoProjectProfile.g:3473:2: ( RULE_ID )
            {
            // InternalLibrettoProjectProfile.g:3473:2: ( RULE_ID )
            // InternalLibrettoProjectProfile.g:3474:3: RULE_ID
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
    // InternalLibrettoProjectProfile.g:3483:1: rule__PrimitiveType__KindAssignment : ( ( rule__PrimitiveType__KindAlternatives_0 ) ) ;
    public final void rule__PrimitiveType__KindAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3487:1: ( ( ( rule__PrimitiveType__KindAlternatives_0 ) ) )
            // InternalLibrettoProjectProfile.g:3488:2: ( ( rule__PrimitiveType__KindAlternatives_0 ) )
            {
            // InternalLibrettoProjectProfile.g:3488:2: ( ( rule__PrimitiveType__KindAlternatives_0 ) )
            // InternalLibrettoProjectProfile.g:3489:3: ( rule__PrimitiveType__KindAlternatives_0 )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getKindAlternatives_0()); 
            // InternalLibrettoProjectProfile.g:3490:3: ( rule__PrimitiveType__KindAlternatives_0 )
            // InternalLibrettoProjectProfile.g:3490:4: rule__PrimitiveType__KindAlternatives_0
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
    // InternalLibrettoProjectProfile.g:3498:1: rule__OperationSignature__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__OperationSignature__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3502:1: ( ( RULE_ID ) )
            // InternalLibrettoProjectProfile.g:3503:2: ( RULE_ID )
            {
            // InternalLibrettoProjectProfile.g:3503:2: ( RULE_ID )
            // InternalLibrettoProjectProfile.g:3504:3: RULE_ID
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
    // InternalLibrettoProjectProfile.g:3513:1: rule__OperationSignature__ParamsAssignment_2_0 : ( ruleTypedParam ) ;
    public final void rule__OperationSignature__ParamsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3517:1: ( ( ruleTypedParam ) )
            // InternalLibrettoProjectProfile.g:3518:2: ( ruleTypedParam )
            {
            // InternalLibrettoProjectProfile.g:3518:2: ( ruleTypedParam )
            // InternalLibrettoProjectProfile.g:3519:3: ruleTypedParam
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
    // InternalLibrettoProjectProfile.g:3528:1: rule__OperationSignature__ParamsAssignment_2_1_1 : ( ruleTypedParam ) ;
    public final void rule__OperationSignature__ParamsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3532:1: ( ( ruleTypedParam ) )
            // InternalLibrettoProjectProfile.g:3533:2: ( ruleTypedParam )
            {
            // InternalLibrettoProjectProfile.g:3533:2: ( ruleTypedParam )
            // InternalLibrettoProjectProfile.g:3534:3: ruleTypedParam
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
    // InternalLibrettoProjectProfile.g:3543:1: rule__TypedParam__TypeAssignment_0 : ( ruleJavaType ) ;
    public final void rule__TypedParam__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3547:1: ( ( ruleJavaType ) )
            // InternalLibrettoProjectProfile.g:3548:2: ( ruleJavaType )
            {
            // InternalLibrettoProjectProfile.g:3548:2: ( ruleJavaType )
            // InternalLibrettoProjectProfile.g:3549:3: ruleJavaType
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
    // InternalLibrettoProjectProfile.g:3558:1: rule__TypedParam__ParamNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TypedParam__ParamNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLibrettoProjectProfile.g:3562:1: ( ( RULE_ID ) )
            // InternalLibrettoProjectProfile.g:3563:2: ( RULE_ID )
            {
            // InternalLibrettoProjectProfile.g:3563:2: ( RULE_ID )
            // InternalLibrettoProjectProfile.g:3564:3: RULE_ID
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000200C00000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000005400000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000008400000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000001E0400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000A9400400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000A9400000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000808000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000000FF820L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000040002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00008000000FF820L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000040000000000L});

}