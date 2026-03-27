package com.robenglander.libretto.spec.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.robenglander.libretto.spec.services.LibrettoProjectProfileGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLibrettoProjectProfileParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'profile'", "'{'", "'}'", "'project'", "'rootDir'", "';'", "'modules'", "'module'", "'dir'", "'specsDir'", "'testsDir'", "'mainJavaDir'", "'basePackage'", "'testgen'", "'initialInstruction'", "'forbiddenPatterns'", "'['", "','", "']'", "'maxRetries'", "'parseCheck'", "'true'", "'false'", "'forModule'", "'remediations'", "'defaultCorrection'", "'rules'", "'rule'", "'pattern'", "'code'", "'correction'", "'default'", "'remediationRules'", "'instruction'", "'llmProviders'", "'provider'", "'kind'", "'local'", "'openai'", "'ollama'", "'localModelPath'", "'model'", "'endpoint'", "'usage'", "'primary'", "'secondary'", "'escalation'", "'enabled'", "'escalateAtRetry'", "'target'", "'surface'", "'for'", "'spec'", "'returnType'", "'method'", "'as'", "'paramType'", "'name'", "'recordSelfReturn'", "'methodOverride'", "'returns'", "'.'", "'boolean'", "'int'", "'long'", "'double'", "'float'", "'short'", "'byte'", "'char'", "'void'", "'('", "')'"
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
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
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
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
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

        public InternalLibrettoProjectProfileParser(TokenStream input, LibrettoProjectProfileGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ProjectProfile";
       	}

       	@Override
       	protected LibrettoProjectProfileGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProjectProfile"
    // InternalLibrettoProjectProfile.g:64:1: entryRuleProjectProfile returns [EObject current=null] : iv_ruleProjectProfile= ruleProjectProfile EOF ;
    public final EObject entryRuleProjectProfile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProjectProfile = null;


        try {
            // InternalLibrettoProjectProfile.g:64:55: (iv_ruleProjectProfile= ruleProjectProfile EOF )
            // InternalLibrettoProjectProfile.g:65:2: iv_ruleProjectProfile= ruleProjectProfile EOF
            {
             newCompositeNode(grammarAccess.getProjectProfileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProjectProfile=ruleProjectProfile();

            state._fsp--;

             current =iv_ruleProjectProfile; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProjectProfile"


    // $ANTLR start "ruleProjectProfile"
    // InternalLibrettoProjectProfile.g:71:1: ruleProjectProfile returns [EObject current=null] : (otherlv_0= 'profile' ( (lv_profileName_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_project_3_0= ruleProjectBlock ) )? ( (lv_llmProviders_4_0= ruleLlmProvidersBlock ) )? ( (lv_surface_5_0= ruleSurfaceBlock ) )? otherlv_6= '}' ) ;
    public final EObject ruleProjectProfile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_profileName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_project_3_0 = null;

        EObject lv_llmProviders_4_0 = null;

        EObject lv_surface_5_0 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:77:2: ( (otherlv_0= 'profile' ( (lv_profileName_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_project_3_0= ruleProjectBlock ) )? ( (lv_llmProviders_4_0= ruleLlmProvidersBlock ) )? ( (lv_surface_5_0= ruleSurfaceBlock ) )? otherlv_6= '}' ) )
            // InternalLibrettoProjectProfile.g:78:2: (otherlv_0= 'profile' ( (lv_profileName_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_project_3_0= ruleProjectBlock ) )? ( (lv_llmProviders_4_0= ruleLlmProvidersBlock ) )? ( (lv_surface_5_0= ruleSurfaceBlock ) )? otherlv_6= '}' )
            {
            // InternalLibrettoProjectProfile.g:78:2: (otherlv_0= 'profile' ( (lv_profileName_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_project_3_0= ruleProjectBlock ) )? ( (lv_llmProviders_4_0= ruleLlmProvidersBlock ) )? ( (lv_surface_5_0= ruleSurfaceBlock ) )? otherlv_6= '}' )
            // InternalLibrettoProjectProfile.g:79:3: otherlv_0= 'profile' ( (lv_profileName_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_project_3_0= ruleProjectBlock ) )? ( (lv_llmProviders_4_0= ruleLlmProvidersBlock ) )? ( (lv_surface_5_0= ruleSurfaceBlock ) )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProjectProfileAccess().getProfileKeyword_0());
            		
            // InternalLibrettoProjectProfile.g:83:3: ( (lv_profileName_1_0= RULE_STRING ) )
            // InternalLibrettoProjectProfile.g:84:4: (lv_profileName_1_0= RULE_STRING )
            {
            // InternalLibrettoProjectProfile.g:84:4: (lv_profileName_1_0= RULE_STRING )
            // InternalLibrettoProjectProfile.g:85:5: lv_profileName_1_0= RULE_STRING
            {
            lv_profileName_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_profileName_1_0, grammarAccess.getProjectProfileAccess().getProfileNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProjectProfileRule());
            					}
            					setWithLastConsumed(
            						current,
            						"profileName",
            						lv_profileName_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getProjectProfileAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLibrettoProjectProfile.g:105:3: ( (lv_project_3_0= ruleProjectBlock ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:106:4: (lv_project_3_0= ruleProjectBlock )
                    {
                    // InternalLibrettoProjectProfile.g:106:4: (lv_project_3_0= ruleProjectBlock )
                    // InternalLibrettoProjectProfile.g:107:5: lv_project_3_0= ruleProjectBlock
                    {

                    					newCompositeNode(grammarAccess.getProjectProfileAccess().getProjectProjectBlockParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_6);
                    lv_project_3_0=ruleProjectBlock();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getProjectProfileRule());
                    					}
                    					set(
                    						current,
                    						"project",
                    						lv_project_3_0,
                    						"com.robenglander.libretto.spec.LibrettoProjectProfile.ProjectBlock");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalLibrettoProjectProfile.g:124:3: ( (lv_llmProviders_4_0= ruleLlmProvidersBlock ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==45) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:125:4: (lv_llmProviders_4_0= ruleLlmProvidersBlock )
                    {
                    // InternalLibrettoProjectProfile.g:125:4: (lv_llmProviders_4_0= ruleLlmProvidersBlock )
                    // InternalLibrettoProjectProfile.g:126:5: lv_llmProviders_4_0= ruleLlmProvidersBlock
                    {

                    					newCompositeNode(grammarAccess.getProjectProfileAccess().getLlmProvidersLlmProvidersBlockParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_llmProviders_4_0=ruleLlmProvidersBlock();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getProjectProfileRule());
                    					}
                    					set(
                    						current,
                    						"llmProviders",
                    						lv_llmProviders_4_0,
                    						"com.robenglander.libretto.spec.LibrettoProjectProfile.LlmProvidersBlock");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalLibrettoProjectProfile.g:143:3: ( (lv_surface_5_0= ruleSurfaceBlock ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==61) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:144:4: (lv_surface_5_0= ruleSurfaceBlock )
                    {
                    // InternalLibrettoProjectProfile.g:144:4: (lv_surface_5_0= ruleSurfaceBlock )
                    // InternalLibrettoProjectProfile.g:145:5: lv_surface_5_0= ruleSurfaceBlock
                    {

                    					newCompositeNode(grammarAccess.getProjectProfileAccess().getSurfaceSurfaceBlockParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_8);
                    lv_surface_5_0=ruleSurfaceBlock();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getProjectProfileRule());
                    					}
                    					set(
                    						current,
                    						"surface",
                    						lv_surface_5_0,
                    						"com.robenglander.libretto.spec.LibrettoProjectProfile.SurfaceBlock");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getProjectProfileAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProjectProfile"


    // $ANTLR start "entryRuleProjectBlock"
    // InternalLibrettoProjectProfile.g:170:1: entryRuleProjectBlock returns [EObject current=null] : iv_ruleProjectBlock= ruleProjectBlock EOF ;
    public final EObject entryRuleProjectBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProjectBlock = null;


        try {
            // InternalLibrettoProjectProfile.g:170:53: (iv_ruleProjectBlock= ruleProjectBlock EOF )
            // InternalLibrettoProjectProfile.g:171:2: iv_ruleProjectBlock= ruleProjectBlock EOF
            {
             newCompositeNode(grammarAccess.getProjectBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProjectBlock=ruleProjectBlock();

            state._fsp--;

             current =iv_ruleProjectBlock; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProjectBlock"


    // $ANTLR start "ruleProjectBlock"
    // InternalLibrettoProjectProfile.g:177:1: ruleProjectBlock returns [EObject current=null] : (otherlv_0= 'project' otherlv_1= '{' (otherlv_2= 'rootDir' ( (lv_rootDir_3_0= RULE_STRING ) ) (otherlv_4= ';' )? )? ( (lv_modules_5_0= ruleModulesBlock ) )? ( (lv_testGen_6_0= ruleTestGenBlock ) )? otherlv_7= '}' ) ;
    public final EObject ruleProjectBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_rootDir_3_0=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_modules_5_0 = null;

        EObject lv_testGen_6_0 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:183:2: ( (otherlv_0= 'project' otherlv_1= '{' (otherlv_2= 'rootDir' ( (lv_rootDir_3_0= RULE_STRING ) ) (otherlv_4= ';' )? )? ( (lv_modules_5_0= ruleModulesBlock ) )? ( (lv_testGen_6_0= ruleTestGenBlock ) )? otherlv_7= '}' ) )
            // InternalLibrettoProjectProfile.g:184:2: (otherlv_0= 'project' otherlv_1= '{' (otherlv_2= 'rootDir' ( (lv_rootDir_3_0= RULE_STRING ) ) (otherlv_4= ';' )? )? ( (lv_modules_5_0= ruleModulesBlock ) )? ( (lv_testGen_6_0= ruleTestGenBlock ) )? otherlv_7= '}' )
            {
            // InternalLibrettoProjectProfile.g:184:2: (otherlv_0= 'project' otherlv_1= '{' (otherlv_2= 'rootDir' ( (lv_rootDir_3_0= RULE_STRING ) ) (otherlv_4= ';' )? )? ( (lv_modules_5_0= ruleModulesBlock ) )? ( (lv_testGen_6_0= ruleTestGenBlock ) )? otherlv_7= '}' )
            // InternalLibrettoProjectProfile.g:185:3: otherlv_0= 'project' otherlv_1= '{' (otherlv_2= 'rootDir' ( (lv_rootDir_3_0= RULE_STRING ) ) (otherlv_4= ';' )? )? ( (lv_modules_5_0= ruleModulesBlock ) )? ( (lv_testGen_6_0= ruleTestGenBlock ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getProjectBlockAccess().getProjectKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getProjectBlockAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalLibrettoProjectProfile.g:193:3: (otherlv_2= 'rootDir' ( (lv_rootDir_3_0= RULE_STRING ) ) (otherlv_4= ';' )? )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:194:4: otherlv_2= 'rootDir' ( (lv_rootDir_3_0= RULE_STRING ) ) (otherlv_4= ';' )?
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getProjectBlockAccess().getRootDirKeyword_2_0());
                    			
                    // InternalLibrettoProjectProfile.g:198:4: ( (lv_rootDir_3_0= RULE_STRING ) )
                    // InternalLibrettoProjectProfile.g:199:5: (lv_rootDir_3_0= RULE_STRING )
                    {
                    // InternalLibrettoProjectProfile.g:199:5: (lv_rootDir_3_0= RULE_STRING )
                    // InternalLibrettoProjectProfile.g:200:6: lv_rootDir_3_0= RULE_STRING
                    {
                    lv_rootDir_3_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

                    						newLeafNode(lv_rootDir_3_0, grammarAccess.getProjectBlockAccess().getRootDirSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProjectBlockRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"rootDir",
                    							lv_rootDir_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalLibrettoProjectProfile.g:216:4: (otherlv_4= ';' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==16) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalLibrettoProjectProfile.g:217:5: otherlv_4= ';'
                            {
                            otherlv_4=(Token)match(input,16,FOLLOW_11); 

                            					newLeafNode(otherlv_4, grammarAccess.getProjectBlockAccess().getSemicolonKeyword_2_2());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalLibrettoProjectProfile.g:223:3: ( (lv_modules_5_0= ruleModulesBlock ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:224:4: (lv_modules_5_0= ruleModulesBlock )
                    {
                    // InternalLibrettoProjectProfile.g:224:4: (lv_modules_5_0= ruleModulesBlock )
                    // InternalLibrettoProjectProfile.g:225:5: lv_modules_5_0= ruleModulesBlock
                    {

                    					newCompositeNode(grammarAccess.getProjectBlockAccess().getModulesModulesBlockParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_12);
                    lv_modules_5_0=ruleModulesBlock();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getProjectBlockRule());
                    					}
                    					set(
                    						current,
                    						"modules",
                    						lv_modules_5_0,
                    						"com.robenglander.libretto.spec.LibrettoProjectProfile.ModulesBlock");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalLibrettoProjectProfile.g:242:3: ( (lv_testGen_6_0= ruleTestGenBlock ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:243:4: (lv_testGen_6_0= ruleTestGenBlock )
                    {
                    // InternalLibrettoProjectProfile.g:243:4: (lv_testGen_6_0= ruleTestGenBlock )
                    // InternalLibrettoProjectProfile.g:244:5: lv_testGen_6_0= ruleTestGenBlock
                    {

                    					newCompositeNode(grammarAccess.getProjectBlockAccess().getTestGenTestGenBlockParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_8);
                    lv_testGen_6_0=ruleTestGenBlock();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getProjectBlockRule());
                    					}
                    					set(
                    						current,
                    						"testGen",
                    						lv_testGen_6_0,
                    						"com.robenglander.libretto.spec.LibrettoProjectProfile.TestGenBlock");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getProjectBlockAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProjectBlock"


    // $ANTLR start "entryRuleModulesBlock"
    // InternalLibrettoProjectProfile.g:269:1: entryRuleModulesBlock returns [EObject current=null] : iv_ruleModulesBlock= ruleModulesBlock EOF ;
    public final EObject entryRuleModulesBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModulesBlock = null;


        try {
            // InternalLibrettoProjectProfile.g:269:53: (iv_ruleModulesBlock= ruleModulesBlock EOF )
            // InternalLibrettoProjectProfile.g:270:2: iv_ruleModulesBlock= ruleModulesBlock EOF
            {
             newCompositeNode(grammarAccess.getModulesBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModulesBlock=ruleModulesBlock();

            state._fsp--;

             current =iv_ruleModulesBlock; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleModulesBlock"


    // $ANTLR start "ruleModulesBlock"
    // InternalLibrettoProjectProfile.g:276:1: ruleModulesBlock returns [EObject current=null] : (otherlv_0= 'modules' otherlv_1= '{' ( (lv_modules_2_0= ruleProjectModule ) )* otherlv_3= '}' ) ;
    public final EObject ruleModulesBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_modules_2_0 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:282:2: ( (otherlv_0= 'modules' otherlv_1= '{' ( (lv_modules_2_0= ruleProjectModule ) )* otherlv_3= '}' ) )
            // InternalLibrettoProjectProfile.g:283:2: (otherlv_0= 'modules' otherlv_1= '{' ( (lv_modules_2_0= ruleProjectModule ) )* otherlv_3= '}' )
            {
            // InternalLibrettoProjectProfile.g:283:2: (otherlv_0= 'modules' otherlv_1= '{' ( (lv_modules_2_0= ruleProjectModule ) )* otherlv_3= '}' )
            // InternalLibrettoProjectProfile.g:284:3: otherlv_0= 'modules' otherlv_1= '{' ( (lv_modules_2_0= ruleProjectModule ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getModulesBlockAccess().getModulesKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getModulesBlockAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalLibrettoProjectProfile.g:292:3: ( (lv_modules_2_0= ruleProjectModule ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:293:4: (lv_modules_2_0= ruleProjectModule )
            	    {
            	    // InternalLibrettoProjectProfile.g:293:4: (lv_modules_2_0= ruleProjectModule )
            	    // InternalLibrettoProjectProfile.g:294:5: lv_modules_2_0= ruleProjectModule
            	    {

            	    					newCompositeNode(grammarAccess.getModulesBlockAccess().getModulesProjectModuleParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_modules_2_0=ruleProjectModule();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModulesBlockRule());
            	    					}
            	    					add(
            	    						current,
            	    						"modules",
            	    						lv_modules_2_0,
            	    						"com.robenglander.libretto.spec.LibrettoProjectProfile.ProjectModule");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getModulesBlockAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModulesBlock"


    // $ANTLR start "entryRuleProjectModule"
    // InternalLibrettoProjectProfile.g:319:1: entryRuleProjectModule returns [EObject current=null] : iv_ruleProjectModule= ruleProjectModule EOF ;
    public final EObject entryRuleProjectModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProjectModule = null;


        try {
            // InternalLibrettoProjectProfile.g:319:54: (iv_ruleProjectModule= ruleProjectModule EOF )
            // InternalLibrettoProjectProfile.g:320:2: iv_ruleProjectModule= ruleProjectModule EOF
            {
             newCompositeNode(grammarAccess.getProjectModuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProjectModule=ruleProjectModule();

            state._fsp--;

             current =iv_ruleProjectModule; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProjectModule"


    // $ANTLR start "ruleProjectModule"
    // InternalLibrettoProjectProfile.g:326:1: ruleProjectModule returns [EObject current=null] : (otherlv_0= 'module' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'dir' ( (lv_dir_4_0= RULE_STRING ) ) (otherlv_5= ';' )? (otherlv_6= 'specsDir' ( (lv_specsDir_7_0= RULE_STRING ) ) (otherlv_8= ';' )? )? (otherlv_9= 'testsDir' ( (lv_testsDir_10_0= RULE_STRING ) ) (otherlv_11= ';' )? )? (otherlv_12= 'mainJavaDir' ( (lv_mainJavaDir_13_0= RULE_STRING ) ) (otherlv_14= ';' )? )? (otherlv_15= 'basePackage' ( (lv_basePackage_16_0= RULE_STRING ) ) (otherlv_17= ';' )? )? otherlv_18= '}' ) ;
    public final EObject ruleProjectModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_dir_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_specsDir_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_testsDir_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_mainJavaDir_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_basePackage_16_0=null;
        Token otherlv_17=null;
        Token otherlv_18=null;


        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:332:2: ( (otherlv_0= 'module' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'dir' ( (lv_dir_4_0= RULE_STRING ) ) (otherlv_5= ';' )? (otherlv_6= 'specsDir' ( (lv_specsDir_7_0= RULE_STRING ) ) (otherlv_8= ';' )? )? (otherlv_9= 'testsDir' ( (lv_testsDir_10_0= RULE_STRING ) ) (otherlv_11= ';' )? )? (otherlv_12= 'mainJavaDir' ( (lv_mainJavaDir_13_0= RULE_STRING ) ) (otherlv_14= ';' )? )? (otherlv_15= 'basePackage' ( (lv_basePackage_16_0= RULE_STRING ) ) (otherlv_17= ';' )? )? otherlv_18= '}' ) )
            // InternalLibrettoProjectProfile.g:333:2: (otherlv_0= 'module' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'dir' ( (lv_dir_4_0= RULE_STRING ) ) (otherlv_5= ';' )? (otherlv_6= 'specsDir' ( (lv_specsDir_7_0= RULE_STRING ) ) (otherlv_8= ';' )? )? (otherlv_9= 'testsDir' ( (lv_testsDir_10_0= RULE_STRING ) ) (otherlv_11= ';' )? )? (otherlv_12= 'mainJavaDir' ( (lv_mainJavaDir_13_0= RULE_STRING ) ) (otherlv_14= ';' )? )? (otherlv_15= 'basePackage' ( (lv_basePackage_16_0= RULE_STRING ) ) (otherlv_17= ';' )? )? otherlv_18= '}' )
            {
            // InternalLibrettoProjectProfile.g:333:2: (otherlv_0= 'module' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'dir' ( (lv_dir_4_0= RULE_STRING ) ) (otherlv_5= ';' )? (otherlv_6= 'specsDir' ( (lv_specsDir_7_0= RULE_STRING ) ) (otherlv_8= ';' )? )? (otherlv_9= 'testsDir' ( (lv_testsDir_10_0= RULE_STRING ) ) (otherlv_11= ';' )? )? (otherlv_12= 'mainJavaDir' ( (lv_mainJavaDir_13_0= RULE_STRING ) ) (otherlv_14= ';' )? )? (otherlv_15= 'basePackage' ( (lv_basePackage_16_0= RULE_STRING ) ) (otherlv_17= ';' )? )? otherlv_18= '}' )
            // InternalLibrettoProjectProfile.g:334:3: otherlv_0= 'module' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'dir' ( (lv_dir_4_0= RULE_STRING ) ) (otherlv_5= ';' )? (otherlv_6= 'specsDir' ( (lv_specsDir_7_0= RULE_STRING ) ) (otherlv_8= ';' )? )? (otherlv_9= 'testsDir' ( (lv_testsDir_10_0= RULE_STRING ) ) (otherlv_11= ';' )? )? (otherlv_12= 'mainJavaDir' ( (lv_mainJavaDir_13_0= RULE_STRING ) ) (otherlv_14= ';' )? )? (otherlv_15= 'basePackage' ( (lv_basePackage_16_0= RULE_STRING ) ) (otherlv_17= ';' )? )? otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProjectModuleAccess().getModuleKeyword_0());
            		
            // InternalLibrettoProjectProfile.g:338:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalLibrettoProjectProfile.g:339:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalLibrettoProjectProfile.g:339:4: (lv_name_1_0= RULE_STRING )
            // InternalLibrettoProjectProfile.g:340:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getProjectModuleAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProjectModuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getProjectModuleAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getProjectModuleAccess().getDirKeyword_3());
            		
            // InternalLibrettoProjectProfile.g:364:3: ( (lv_dir_4_0= RULE_STRING ) )
            // InternalLibrettoProjectProfile.g:365:4: (lv_dir_4_0= RULE_STRING )
            {
            // InternalLibrettoProjectProfile.g:365:4: (lv_dir_4_0= RULE_STRING )
            // InternalLibrettoProjectProfile.g:366:5: lv_dir_4_0= RULE_STRING
            {
            lv_dir_4_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_dir_4_0, grammarAccess.getProjectModuleAccess().getDirSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProjectModuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"dir",
            						lv_dir_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalLibrettoProjectProfile.g:382:3: (otherlv_5= ';' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:383:4: otherlv_5= ';'
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_16); 

                    				newLeafNode(otherlv_5, grammarAccess.getProjectModuleAccess().getSemicolonKeyword_5());
                    			

                    }
                    break;

            }

            // InternalLibrettoProjectProfile.g:388:3: (otherlv_6= 'specsDir' ( (lv_specsDir_7_0= RULE_STRING ) ) (otherlv_8= ';' )? )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:389:4: otherlv_6= 'specsDir' ( (lv_specsDir_7_0= RULE_STRING ) ) (otherlv_8= ';' )?
                    {
                    otherlv_6=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getProjectModuleAccess().getSpecsDirKeyword_6_0());
                    			
                    // InternalLibrettoProjectProfile.g:393:4: ( (lv_specsDir_7_0= RULE_STRING ) )
                    // InternalLibrettoProjectProfile.g:394:5: (lv_specsDir_7_0= RULE_STRING )
                    {
                    // InternalLibrettoProjectProfile.g:394:5: (lv_specsDir_7_0= RULE_STRING )
                    // InternalLibrettoProjectProfile.g:395:6: lv_specsDir_7_0= RULE_STRING
                    {
                    lv_specsDir_7_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

                    						newLeafNode(lv_specsDir_7_0, grammarAccess.getProjectModuleAccess().getSpecsDirSTRINGTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProjectModuleRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"specsDir",
                    							lv_specsDir_7_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalLibrettoProjectProfile.g:411:4: (otherlv_8= ';' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==16) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalLibrettoProjectProfile.g:412:5: otherlv_8= ';'
                            {
                            otherlv_8=(Token)match(input,16,FOLLOW_18); 

                            					newLeafNode(otherlv_8, grammarAccess.getProjectModuleAccess().getSemicolonKeyword_6_2());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalLibrettoProjectProfile.g:418:3: (otherlv_9= 'testsDir' ( (lv_testsDir_10_0= RULE_STRING ) ) (otherlv_11= ';' )? )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:419:4: otherlv_9= 'testsDir' ( (lv_testsDir_10_0= RULE_STRING ) ) (otherlv_11= ';' )?
                    {
                    otherlv_9=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getProjectModuleAccess().getTestsDirKeyword_7_0());
                    			
                    // InternalLibrettoProjectProfile.g:423:4: ( (lv_testsDir_10_0= RULE_STRING ) )
                    // InternalLibrettoProjectProfile.g:424:5: (lv_testsDir_10_0= RULE_STRING )
                    {
                    // InternalLibrettoProjectProfile.g:424:5: (lv_testsDir_10_0= RULE_STRING )
                    // InternalLibrettoProjectProfile.g:425:6: lv_testsDir_10_0= RULE_STRING
                    {
                    lv_testsDir_10_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

                    						newLeafNode(lv_testsDir_10_0, grammarAccess.getProjectModuleAccess().getTestsDirSTRINGTerminalRuleCall_7_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProjectModuleRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"testsDir",
                    							lv_testsDir_10_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalLibrettoProjectProfile.g:441:4: (otherlv_11= ';' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==16) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalLibrettoProjectProfile.g:442:5: otherlv_11= ';'
                            {
                            otherlv_11=(Token)match(input,16,FOLLOW_20); 

                            					newLeafNode(otherlv_11, grammarAccess.getProjectModuleAccess().getSemicolonKeyword_7_2());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalLibrettoProjectProfile.g:448:3: (otherlv_12= 'mainJavaDir' ( (lv_mainJavaDir_13_0= RULE_STRING ) ) (otherlv_14= ';' )? )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==22) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:449:4: otherlv_12= 'mainJavaDir' ( (lv_mainJavaDir_13_0= RULE_STRING ) ) (otherlv_14= ';' )?
                    {
                    otherlv_12=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getProjectModuleAccess().getMainJavaDirKeyword_8_0());
                    			
                    // InternalLibrettoProjectProfile.g:453:4: ( (lv_mainJavaDir_13_0= RULE_STRING ) )
                    // InternalLibrettoProjectProfile.g:454:5: (lv_mainJavaDir_13_0= RULE_STRING )
                    {
                    // InternalLibrettoProjectProfile.g:454:5: (lv_mainJavaDir_13_0= RULE_STRING )
                    // InternalLibrettoProjectProfile.g:455:6: lv_mainJavaDir_13_0= RULE_STRING
                    {
                    lv_mainJavaDir_13_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

                    						newLeafNode(lv_mainJavaDir_13_0, grammarAccess.getProjectModuleAccess().getMainJavaDirSTRINGTerminalRuleCall_8_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProjectModuleRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"mainJavaDir",
                    							lv_mainJavaDir_13_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalLibrettoProjectProfile.g:471:4: (otherlv_14= ';' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==16) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalLibrettoProjectProfile.g:472:5: otherlv_14= ';'
                            {
                            otherlv_14=(Token)match(input,16,FOLLOW_22); 

                            					newLeafNode(otherlv_14, grammarAccess.getProjectModuleAccess().getSemicolonKeyword_8_2());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalLibrettoProjectProfile.g:478:3: (otherlv_15= 'basePackage' ( (lv_basePackage_16_0= RULE_STRING ) ) (otherlv_17= ';' )? )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==23) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:479:4: otherlv_15= 'basePackage' ( (lv_basePackage_16_0= RULE_STRING ) ) (otherlv_17= ';' )?
                    {
                    otherlv_15=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getProjectModuleAccess().getBasePackageKeyword_9_0());
                    			
                    // InternalLibrettoProjectProfile.g:483:4: ( (lv_basePackage_16_0= RULE_STRING ) )
                    // InternalLibrettoProjectProfile.g:484:5: (lv_basePackage_16_0= RULE_STRING )
                    {
                    // InternalLibrettoProjectProfile.g:484:5: (lv_basePackage_16_0= RULE_STRING )
                    // InternalLibrettoProjectProfile.g:485:6: lv_basePackage_16_0= RULE_STRING
                    {
                    lv_basePackage_16_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

                    						newLeafNode(lv_basePackage_16_0, grammarAccess.getProjectModuleAccess().getBasePackageSTRINGTerminalRuleCall_9_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProjectModuleRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"basePackage",
                    							lv_basePackage_16_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalLibrettoProjectProfile.g:501:4: (otherlv_17= ';' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==16) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalLibrettoProjectProfile.g:502:5: otherlv_17= ';'
                            {
                            otherlv_17=(Token)match(input,16,FOLLOW_8); 

                            					newLeafNode(otherlv_17, grammarAccess.getProjectModuleAccess().getSemicolonKeyword_9_2());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_18=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getProjectModuleAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProjectModule"


    // $ANTLR start "entryRuleTestGenBlock"
    // InternalLibrettoProjectProfile.g:516:1: entryRuleTestGenBlock returns [EObject current=null] : iv_ruleTestGenBlock= ruleTestGenBlock EOF ;
    public final EObject entryRuleTestGenBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestGenBlock = null;


        try {
            // InternalLibrettoProjectProfile.g:516:53: (iv_ruleTestGenBlock= ruleTestGenBlock EOF )
            // InternalLibrettoProjectProfile.g:517:2: iv_ruleTestGenBlock= ruleTestGenBlock EOF
            {
             newCompositeNode(grammarAccess.getTestGenBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTestGenBlock=ruleTestGenBlock();

            state._fsp--;

             current =iv_ruleTestGenBlock; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTestGenBlock"


    // $ANTLR start "ruleTestGenBlock"
    // InternalLibrettoProjectProfile.g:523:1: ruleTestGenBlock returns [EObject current=null] : (otherlv_0= 'testgen' otherlv_1= '{' (otherlv_2= 'initialInstruction' ( (lv_initialInstruction_3_0= RULE_STRING ) ) (otherlv_4= ';' )? )? (otherlv_5= 'forbiddenPatterns' otherlv_6= '[' ( (lv_forbiddenPatterns_7_0= RULE_STRING ) ) (otherlv_8= ',' ( (lv_forbiddenPatterns_9_0= RULE_STRING ) ) )* otherlv_10= ']' (otherlv_11= ';' )? )? (otherlv_12= 'maxRetries' ( (lv_maxRetries_13_0= RULE_INT ) ) (otherlv_14= ';' )? )? (otherlv_15= 'parseCheck' ( ( (lv_parseCheck_16_1= 'true' | lv_parseCheck_16_2= 'false' ) ) ) (otherlv_17= ';' )? )? ( (lv_remediations_18_0= ruleTestGenRemediationsBlock ) )? ( (lv_legacyRemediationRules_19_0= ruleTestGenLegacyRemediationRulesBlock ) )? ( (lv_usage_20_0= ruleTestGenUsageBlock ) )? ( (lv_modulePolicies_21_0= ruleTestGenModulePolicy ) )* otherlv_22= '}' ) ;
    public final EObject ruleTestGenBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_initialInstruction_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_forbiddenPatterns_7_0=null;
        Token otherlv_8=null;
        Token lv_forbiddenPatterns_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_maxRetries_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_parseCheck_16_1=null;
        Token lv_parseCheck_16_2=null;
        Token otherlv_17=null;
        Token otherlv_22=null;
        EObject lv_remediations_18_0 = null;

        EObject lv_legacyRemediationRules_19_0 = null;

        EObject lv_usage_20_0 = null;

        EObject lv_modulePolicies_21_0 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:529:2: ( (otherlv_0= 'testgen' otherlv_1= '{' (otherlv_2= 'initialInstruction' ( (lv_initialInstruction_3_0= RULE_STRING ) ) (otherlv_4= ';' )? )? (otherlv_5= 'forbiddenPatterns' otherlv_6= '[' ( (lv_forbiddenPatterns_7_0= RULE_STRING ) ) (otherlv_8= ',' ( (lv_forbiddenPatterns_9_0= RULE_STRING ) ) )* otherlv_10= ']' (otherlv_11= ';' )? )? (otherlv_12= 'maxRetries' ( (lv_maxRetries_13_0= RULE_INT ) ) (otherlv_14= ';' )? )? (otherlv_15= 'parseCheck' ( ( (lv_parseCheck_16_1= 'true' | lv_parseCheck_16_2= 'false' ) ) ) (otherlv_17= ';' )? )? ( (lv_remediations_18_0= ruleTestGenRemediationsBlock ) )? ( (lv_legacyRemediationRules_19_0= ruleTestGenLegacyRemediationRulesBlock ) )? ( (lv_usage_20_0= ruleTestGenUsageBlock ) )? ( (lv_modulePolicies_21_0= ruleTestGenModulePolicy ) )* otherlv_22= '}' ) )
            // InternalLibrettoProjectProfile.g:530:2: (otherlv_0= 'testgen' otherlv_1= '{' (otherlv_2= 'initialInstruction' ( (lv_initialInstruction_3_0= RULE_STRING ) ) (otherlv_4= ';' )? )? (otherlv_5= 'forbiddenPatterns' otherlv_6= '[' ( (lv_forbiddenPatterns_7_0= RULE_STRING ) ) (otherlv_8= ',' ( (lv_forbiddenPatterns_9_0= RULE_STRING ) ) )* otherlv_10= ']' (otherlv_11= ';' )? )? (otherlv_12= 'maxRetries' ( (lv_maxRetries_13_0= RULE_INT ) ) (otherlv_14= ';' )? )? (otherlv_15= 'parseCheck' ( ( (lv_parseCheck_16_1= 'true' | lv_parseCheck_16_2= 'false' ) ) ) (otherlv_17= ';' )? )? ( (lv_remediations_18_0= ruleTestGenRemediationsBlock ) )? ( (lv_legacyRemediationRules_19_0= ruleTestGenLegacyRemediationRulesBlock ) )? ( (lv_usage_20_0= ruleTestGenUsageBlock ) )? ( (lv_modulePolicies_21_0= ruleTestGenModulePolicy ) )* otherlv_22= '}' )
            {
            // InternalLibrettoProjectProfile.g:530:2: (otherlv_0= 'testgen' otherlv_1= '{' (otherlv_2= 'initialInstruction' ( (lv_initialInstruction_3_0= RULE_STRING ) ) (otherlv_4= ';' )? )? (otherlv_5= 'forbiddenPatterns' otherlv_6= '[' ( (lv_forbiddenPatterns_7_0= RULE_STRING ) ) (otherlv_8= ',' ( (lv_forbiddenPatterns_9_0= RULE_STRING ) ) )* otherlv_10= ']' (otherlv_11= ';' )? )? (otherlv_12= 'maxRetries' ( (lv_maxRetries_13_0= RULE_INT ) ) (otherlv_14= ';' )? )? (otherlv_15= 'parseCheck' ( ( (lv_parseCheck_16_1= 'true' | lv_parseCheck_16_2= 'false' ) ) ) (otherlv_17= ';' )? )? ( (lv_remediations_18_0= ruleTestGenRemediationsBlock ) )? ( (lv_legacyRemediationRules_19_0= ruleTestGenLegacyRemediationRulesBlock ) )? ( (lv_usage_20_0= ruleTestGenUsageBlock ) )? ( (lv_modulePolicies_21_0= ruleTestGenModulePolicy ) )* otherlv_22= '}' )
            // InternalLibrettoProjectProfile.g:531:3: otherlv_0= 'testgen' otherlv_1= '{' (otherlv_2= 'initialInstruction' ( (lv_initialInstruction_3_0= RULE_STRING ) ) (otherlv_4= ';' )? )? (otherlv_5= 'forbiddenPatterns' otherlv_6= '[' ( (lv_forbiddenPatterns_7_0= RULE_STRING ) ) (otherlv_8= ',' ( (lv_forbiddenPatterns_9_0= RULE_STRING ) ) )* otherlv_10= ']' (otherlv_11= ';' )? )? (otherlv_12= 'maxRetries' ( (lv_maxRetries_13_0= RULE_INT ) ) (otherlv_14= ';' )? )? (otherlv_15= 'parseCheck' ( ( (lv_parseCheck_16_1= 'true' | lv_parseCheck_16_2= 'false' ) ) ) (otherlv_17= ';' )? )? ( (lv_remediations_18_0= ruleTestGenRemediationsBlock ) )? ( (lv_legacyRemediationRules_19_0= ruleTestGenLegacyRemediationRulesBlock ) )? ( (lv_usage_20_0= ruleTestGenUsageBlock ) )? ( (lv_modulePolicies_21_0= ruleTestGenModulePolicy ) )* otherlv_22= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTestGenBlockAccess().getTestgenKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getTestGenBlockAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalLibrettoProjectProfile.g:539:3: (otherlv_2= 'initialInstruction' ( (lv_initialInstruction_3_0= RULE_STRING ) ) (otherlv_4= ';' )? )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==25) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:540:4: otherlv_2= 'initialInstruction' ( (lv_initialInstruction_3_0= RULE_STRING ) ) (otherlv_4= ';' )?
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getTestGenBlockAccess().getInitialInstructionKeyword_2_0());
                    			
                    // InternalLibrettoProjectProfile.g:544:4: ( (lv_initialInstruction_3_0= RULE_STRING ) )
                    // InternalLibrettoProjectProfile.g:545:5: (lv_initialInstruction_3_0= RULE_STRING )
                    {
                    // InternalLibrettoProjectProfile.g:545:5: (lv_initialInstruction_3_0= RULE_STRING )
                    // InternalLibrettoProjectProfile.g:546:6: lv_initialInstruction_3_0= RULE_STRING
                    {
                    lv_initialInstruction_3_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

                    						newLeafNode(lv_initialInstruction_3_0, grammarAccess.getTestGenBlockAccess().getInitialInstructionSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTestGenBlockRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"initialInstruction",
                    							lv_initialInstruction_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalLibrettoProjectProfile.g:562:4: (otherlv_4= ';' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==16) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalLibrettoProjectProfile.g:563:5: otherlv_4= ';'
                            {
                            otherlv_4=(Token)match(input,16,FOLLOW_26); 

                            					newLeafNode(otherlv_4, grammarAccess.getTestGenBlockAccess().getSemicolonKeyword_2_2());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalLibrettoProjectProfile.g:569:3: (otherlv_5= 'forbiddenPatterns' otherlv_6= '[' ( (lv_forbiddenPatterns_7_0= RULE_STRING ) ) (otherlv_8= ',' ( (lv_forbiddenPatterns_9_0= RULE_STRING ) ) )* otherlv_10= ']' (otherlv_11= ';' )? )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==26) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:570:4: otherlv_5= 'forbiddenPatterns' otherlv_6= '[' ( (lv_forbiddenPatterns_7_0= RULE_STRING ) ) (otherlv_8= ',' ( (lv_forbiddenPatterns_9_0= RULE_STRING ) ) )* otherlv_10= ']' (otherlv_11= ';' )?
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_27); 

                    				newLeafNode(otherlv_5, grammarAccess.getTestGenBlockAccess().getForbiddenPatternsKeyword_3_0());
                    			
                    otherlv_6=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getTestGenBlockAccess().getLeftSquareBracketKeyword_3_1());
                    			
                    // InternalLibrettoProjectProfile.g:578:4: ( (lv_forbiddenPatterns_7_0= RULE_STRING ) )
                    // InternalLibrettoProjectProfile.g:579:5: (lv_forbiddenPatterns_7_0= RULE_STRING )
                    {
                    // InternalLibrettoProjectProfile.g:579:5: (lv_forbiddenPatterns_7_0= RULE_STRING )
                    // InternalLibrettoProjectProfile.g:580:6: lv_forbiddenPatterns_7_0= RULE_STRING
                    {
                    lv_forbiddenPatterns_7_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

                    						newLeafNode(lv_forbiddenPatterns_7_0, grammarAccess.getTestGenBlockAccess().getForbiddenPatternsSTRINGTerminalRuleCall_3_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTestGenBlockRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"forbiddenPatterns",
                    							lv_forbiddenPatterns_7_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalLibrettoProjectProfile.g:596:4: (otherlv_8= ',' ( (lv_forbiddenPatterns_9_0= RULE_STRING ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==28) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalLibrettoProjectProfile.g:597:5: otherlv_8= ',' ( (lv_forbiddenPatterns_9_0= RULE_STRING ) )
                    	    {
                    	    otherlv_8=(Token)match(input,28,FOLLOW_3); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getTestGenBlockAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalLibrettoProjectProfile.g:601:5: ( (lv_forbiddenPatterns_9_0= RULE_STRING ) )
                    	    // InternalLibrettoProjectProfile.g:602:6: (lv_forbiddenPatterns_9_0= RULE_STRING )
                    	    {
                    	    // InternalLibrettoProjectProfile.g:602:6: (lv_forbiddenPatterns_9_0= RULE_STRING )
                    	    // InternalLibrettoProjectProfile.g:603:7: lv_forbiddenPatterns_9_0= RULE_STRING
                    	    {
                    	    lv_forbiddenPatterns_9_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

                    	    							newLeafNode(lv_forbiddenPatterns_9_0, grammarAccess.getTestGenBlockAccess().getForbiddenPatternsSTRINGTerminalRuleCall_3_3_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getTestGenBlockRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"forbiddenPatterns",
                    	    								lv_forbiddenPatterns_9_0,
                    	    								"org.eclipse.xtext.common.Terminals.STRING");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,29,FOLLOW_29); 

                    				newLeafNode(otherlv_10, grammarAccess.getTestGenBlockAccess().getRightSquareBracketKeyword_3_4());
                    			
                    // InternalLibrettoProjectProfile.g:624:4: (otherlv_11= ';' )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==16) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalLibrettoProjectProfile.g:625:5: otherlv_11= ';'
                            {
                            otherlv_11=(Token)match(input,16,FOLLOW_30); 

                            					newLeafNode(otherlv_11, grammarAccess.getTestGenBlockAccess().getSemicolonKeyword_3_5());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalLibrettoProjectProfile.g:631:3: (otherlv_12= 'maxRetries' ( (lv_maxRetries_13_0= RULE_INT ) ) (otherlv_14= ';' )? )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==30) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:632:4: otherlv_12= 'maxRetries' ( (lv_maxRetries_13_0= RULE_INT ) ) (otherlv_14= ';' )?
                    {
                    otherlv_12=(Token)match(input,30,FOLLOW_31); 

                    				newLeafNode(otherlv_12, grammarAccess.getTestGenBlockAccess().getMaxRetriesKeyword_4_0());
                    			
                    // InternalLibrettoProjectProfile.g:636:4: ( (lv_maxRetries_13_0= RULE_INT ) )
                    // InternalLibrettoProjectProfile.g:637:5: (lv_maxRetries_13_0= RULE_INT )
                    {
                    // InternalLibrettoProjectProfile.g:637:5: (lv_maxRetries_13_0= RULE_INT )
                    // InternalLibrettoProjectProfile.g:638:6: lv_maxRetries_13_0= RULE_INT
                    {
                    lv_maxRetries_13_0=(Token)match(input,RULE_INT,FOLLOW_32); 

                    						newLeafNode(lv_maxRetries_13_0, grammarAccess.getTestGenBlockAccess().getMaxRetriesINTTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTestGenBlockRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"maxRetries",
                    							lv_maxRetries_13_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalLibrettoProjectProfile.g:654:4: (otherlv_14= ';' )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==16) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalLibrettoProjectProfile.g:655:5: otherlv_14= ';'
                            {
                            otherlv_14=(Token)match(input,16,FOLLOW_33); 

                            					newLeafNode(otherlv_14, grammarAccess.getTestGenBlockAccess().getSemicolonKeyword_4_2());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalLibrettoProjectProfile.g:661:3: (otherlv_15= 'parseCheck' ( ( (lv_parseCheck_16_1= 'true' | lv_parseCheck_16_2= 'false' ) ) ) (otherlv_17= ';' )? )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==31) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:662:4: otherlv_15= 'parseCheck' ( ( (lv_parseCheck_16_1= 'true' | lv_parseCheck_16_2= 'false' ) ) ) (otherlv_17= ';' )?
                    {
                    otherlv_15=(Token)match(input,31,FOLLOW_34); 

                    				newLeafNode(otherlv_15, grammarAccess.getTestGenBlockAccess().getParseCheckKeyword_5_0());
                    			
                    // InternalLibrettoProjectProfile.g:666:4: ( ( (lv_parseCheck_16_1= 'true' | lv_parseCheck_16_2= 'false' ) ) )
                    // InternalLibrettoProjectProfile.g:667:5: ( (lv_parseCheck_16_1= 'true' | lv_parseCheck_16_2= 'false' ) )
                    {
                    // InternalLibrettoProjectProfile.g:667:5: ( (lv_parseCheck_16_1= 'true' | lv_parseCheck_16_2= 'false' ) )
                    // InternalLibrettoProjectProfile.g:668:6: (lv_parseCheck_16_1= 'true' | lv_parseCheck_16_2= 'false' )
                    {
                    // InternalLibrettoProjectProfile.g:668:6: (lv_parseCheck_16_1= 'true' | lv_parseCheck_16_2= 'false' )
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==32) ) {
                        alt25=1;
                    }
                    else if ( (LA25_0==33) ) {
                        alt25=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 0, input);

                        throw nvae;
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalLibrettoProjectProfile.g:669:7: lv_parseCheck_16_1= 'true'
                            {
                            lv_parseCheck_16_1=(Token)match(input,32,FOLLOW_35); 

                            							newLeafNode(lv_parseCheck_16_1, grammarAccess.getTestGenBlockAccess().getParseCheckTrueKeyword_5_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getTestGenBlockRule());
                            							}
                            							setWithLastConsumed(current, "parseCheck", lv_parseCheck_16_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalLibrettoProjectProfile.g:680:7: lv_parseCheck_16_2= 'false'
                            {
                            lv_parseCheck_16_2=(Token)match(input,33,FOLLOW_35); 

                            							newLeafNode(lv_parseCheck_16_2, grammarAccess.getTestGenBlockAccess().getParseCheckFalseKeyword_5_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getTestGenBlockRule());
                            							}
                            							setWithLastConsumed(current, "parseCheck", lv_parseCheck_16_2, null);
                            						

                            }
                            break;

                    }


                    }


                    }

                    // InternalLibrettoProjectProfile.g:693:4: (otherlv_17= ';' )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==16) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalLibrettoProjectProfile.g:694:5: otherlv_17= ';'
                            {
                            otherlv_17=(Token)match(input,16,FOLLOW_36); 

                            					newLeafNode(otherlv_17, grammarAccess.getTestGenBlockAccess().getSemicolonKeyword_5_2());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalLibrettoProjectProfile.g:700:3: ( (lv_remediations_18_0= ruleTestGenRemediationsBlock ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==35) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:701:4: (lv_remediations_18_0= ruleTestGenRemediationsBlock )
                    {
                    // InternalLibrettoProjectProfile.g:701:4: (lv_remediations_18_0= ruleTestGenRemediationsBlock )
                    // InternalLibrettoProjectProfile.g:702:5: lv_remediations_18_0= ruleTestGenRemediationsBlock
                    {

                    					newCompositeNode(grammarAccess.getTestGenBlockAccess().getRemediationsTestGenRemediationsBlockParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_37);
                    lv_remediations_18_0=ruleTestGenRemediationsBlock();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTestGenBlockRule());
                    					}
                    					set(
                    						current,
                    						"remediations",
                    						lv_remediations_18_0,
                    						"com.robenglander.libretto.spec.LibrettoProjectProfile.TestGenRemediationsBlock");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalLibrettoProjectProfile.g:719:3: ( (lv_legacyRemediationRules_19_0= ruleTestGenLegacyRemediationRulesBlock ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==43) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:720:4: (lv_legacyRemediationRules_19_0= ruleTestGenLegacyRemediationRulesBlock )
                    {
                    // InternalLibrettoProjectProfile.g:720:4: (lv_legacyRemediationRules_19_0= ruleTestGenLegacyRemediationRulesBlock )
                    // InternalLibrettoProjectProfile.g:721:5: lv_legacyRemediationRules_19_0= ruleTestGenLegacyRemediationRulesBlock
                    {

                    					newCompositeNode(grammarAccess.getTestGenBlockAccess().getLegacyRemediationRulesTestGenLegacyRemediationRulesBlockParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_38);
                    lv_legacyRemediationRules_19_0=ruleTestGenLegacyRemediationRulesBlock();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTestGenBlockRule());
                    					}
                    					set(
                    						current,
                    						"legacyRemediationRules",
                    						lv_legacyRemediationRules_19_0,
                    						"com.robenglander.libretto.spec.LibrettoProjectProfile.TestGenLegacyRemediationRulesBlock");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalLibrettoProjectProfile.g:738:3: ( (lv_usage_20_0= ruleTestGenUsageBlock ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==54) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:739:4: (lv_usage_20_0= ruleTestGenUsageBlock )
                    {
                    // InternalLibrettoProjectProfile.g:739:4: (lv_usage_20_0= ruleTestGenUsageBlock )
                    // InternalLibrettoProjectProfile.g:740:5: lv_usage_20_0= ruleTestGenUsageBlock
                    {

                    					newCompositeNode(grammarAccess.getTestGenBlockAccess().getUsageTestGenUsageBlockParserRuleCall_8_0());
                    				
                    pushFollow(FOLLOW_39);
                    lv_usage_20_0=ruleTestGenUsageBlock();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTestGenBlockRule());
                    					}
                    					set(
                    						current,
                    						"usage",
                    						lv_usage_20_0,
                    						"com.robenglander.libretto.spec.LibrettoProjectProfile.TestGenUsageBlock");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalLibrettoProjectProfile.g:757:3: ( (lv_modulePolicies_21_0= ruleTestGenModulePolicy ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==34) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:758:4: (lv_modulePolicies_21_0= ruleTestGenModulePolicy )
            	    {
            	    // InternalLibrettoProjectProfile.g:758:4: (lv_modulePolicies_21_0= ruleTestGenModulePolicy )
            	    // InternalLibrettoProjectProfile.g:759:5: lv_modulePolicies_21_0= ruleTestGenModulePolicy
            	    {

            	    					newCompositeNode(grammarAccess.getTestGenBlockAccess().getModulePoliciesTestGenModulePolicyParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_39);
            	    lv_modulePolicies_21_0=ruleTestGenModulePolicy();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTestGenBlockRule());
            	    					}
            	    					add(
            	    						current,
            	    						"modulePolicies",
            	    						lv_modulePolicies_21_0,
            	    						"com.robenglander.libretto.spec.LibrettoProjectProfile.TestGenModulePolicy");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            otherlv_22=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getTestGenBlockAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTestGenBlock"


    // $ANTLR start "entryRuleTestGenModulePolicy"
    // InternalLibrettoProjectProfile.g:784:1: entryRuleTestGenModulePolicy returns [EObject current=null] : iv_ruleTestGenModulePolicy= ruleTestGenModulePolicy EOF ;
    public final EObject entryRuleTestGenModulePolicy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestGenModulePolicy = null;


        try {
            // InternalLibrettoProjectProfile.g:784:60: (iv_ruleTestGenModulePolicy= ruleTestGenModulePolicy EOF )
            // InternalLibrettoProjectProfile.g:785:2: iv_ruleTestGenModulePolicy= ruleTestGenModulePolicy EOF
            {
             newCompositeNode(grammarAccess.getTestGenModulePolicyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTestGenModulePolicy=ruleTestGenModulePolicy();

            state._fsp--;

             current =iv_ruleTestGenModulePolicy; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTestGenModulePolicy"


    // $ANTLR start "ruleTestGenModulePolicy"
    // InternalLibrettoProjectProfile.g:791:1: ruleTestGenModulePolicy returns [EObject current=null] : (otherlv_0= 'forModule' ( (lv_moduleId_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'initialInstruction' ( (lv_initialInstruction_4_0= RULE_STRING ) ) (otherlv_5= ';' )? )? (otherlv_6= 'forbiddenPatterns' otherlv_7= '[' ( (lv_forbiddenPatterns_8_0= RULE_STRING ) ) (otherlv_9= ',' ( (lv_forbiddenPatterns_10_0= RULE_STRING ) ) )* otherlv_11= ']' (otherlv_12= ';' )? )? (otherlv_13= 'maxRetries' ( (lv_maxRetries_14_0= RULE_INT ) ) (otherlv_15= ';' )? )? (otherlv_16= 'parseCheck' ( ( (lv_parseCheck_17_1= 'true' | lv_parseCheck_17_2= 'false' ) ) ) (otherlv_18= ';' )? )? ( (lv_remediations_19_0= ruleTestGenRemediationsBlock ) )? ( (lv_legacyRemediationRules_20_0= ruleTestGenLegacyRemediationRulesBlock ) )? ( (lv_usage_21_0= ruleTestGenUsageBlock ) )? otherlv_22= '}' ) ;
    public final EObject ruleTestGenModulePolicy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_moduleId_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_initialInstruction_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_forbiddenPatterns_8_0=null;
        Token otherlv_9=null;
        Token lv_forbiddenPatterns_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_maxRetries_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_parseCheck_17_1=null;
        Token lv_parseCheck_17_2=null;
        Token otherlv_18=null;
        Token otherlv_22=null;
        EObject lv_remediations_19_0 = null;

        EObject lv_legacyRemediationRules_20_0 = null;

        EObject lv_usage_21_0 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:797:2: ( (otherlv_0= 'forModule' ( (lv_moduleId_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'initialInstruction' ( (lv_initialInstruction_4_0= RULE_STRING ) ) (otherlv_5= ';' )? )? (otherlv_6= 'forbiddenPatterns' otherlv_7= '[' ( (lv_forbiddenPatterns_8_0= RULE_STRING ) ) (otherlv_9= ',' ( (lv_forbiddenPatterns_10_0= RULE_STRING ) ) )* otherlv_11= ']' (otherlv_12= ';' )? )? (otherlv_13= 'maxRetries' ( (lv_maxRetries_14_0= RULE_INT ) ) (otherlv_15= ';' )? )? (otherlv_16= 'parseCheck' ( ( (lv_parseCheck_17_1= 'true' | lv_parseCheck_17_2= 'false' ) ) ) (otherlv_18= ';' )? )? ( (lv_remediations_19_0= ruleTestGenRemediationsBlock ) )? ( (lv_legacyRemediationRules_20_0= ruleTestGenLegacyRemediationRulesBlock ) )? ( (lv_usage_21_0= ruleTestGenUsageBlock ) )? otherlv_22= '}' ) )
            // InternalLibrettoProjectProfile.g:798:2: (otherlv_0= 'forModule' ( (lv_moduleId_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'initialInstruction' ( (lv_initialInstruction_4_0= RULE_STRING ) ) (otherlv_5= ';' )? )? (otherlv_6= 'forbiddenPatterns' otherlv_7= '[' ( (lv_forbiddenPatterns_8_0= RULE_STRING ) ) (otherlv_9= ',' ( (lv_forbiddenPatterns_10_0= RULE_STRING ) ) )* otherlv_11= ']' (otherlv_12= ';' )? )? (otherlv_13= 'maxRetries' ( (lv_maxRetries_14_0= RULE_INT ) ) (otherlv_15= ';' )? )? (otherlv_16= 'parseCheck' ( ( (lv_parseCheck_17_1= 'true' | lv_parseCheck_17_2= 'false' ) ) ) (otherlv_18= ';' )? )? ( (lv_remediations_19_0= ruleTestGenRemediationsBlock ) )? ( (lv_legacyRemediationRules_20_0= ruleTestGenLegacyRemediationRulesBlock ) )? ( (lv_usage_21_0= ruleTestGenUsageBlock ) )? otherlv_22= '}' )
            {
            // InternalLibrettoProjectProfile.g:798:2: (otherlv_0= 'forModule' ( (lv_moduleId_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'initialInstruction' ( (lv_initialInstruction_4_0= RULE_STRING ) ) (otherlv_5= ';' )? )? (otherlv_6= 'forbiddenPatterns' otherlv_7= '[' ( (lv_forbiddenPatterns_8_0= RULE_STRING ) ) (otherlv_9= ',' ( (lv_forbiddenPatterns_10_0= RULE_STRING ) ) )* otherlv_11= ']' (otherlv_12= ';' )? )? (otherlv_13= 'maxRetries' ( (lv_maxRetries_14_0= RULE_INT ) ) (otherlv_15= ';' )? )? (otherlv_16= 'parseCheck' ( ( (lv_parseCheck_17_1= 'true' | lv_parseCheck_17_2= 'false' ) ) ) (otherlv_18= ';' )? )? ( (lv_remediations_19_0= ruleTestGenRemediationsBlock ) )? ( (lv_legacyRemediationRules_20_0= ruleTestGenLegacyRemediationRulesBlock ) )? ( (lv_usage_21_0= ruleTestGenUsageBlock ) )? otherlv_22= '}' )
            // InternalLibrettoProjectProfile.g:799:3: otherlv_0= 'forModule' ( (lv_moduleId_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'initialInstruction' ( (lv_initialInstruction_4_0= RULE_STRING ) ) (otherlv_5= ';' )? )? (otherlv_6= 'forbiddenPatterns' otherlv_7= '[' ( (lv_forbiddenPatterns_8_0= RULE_STRING ) ) (otherlv_9= ',' ( (lv_forbiddenPatterns_10_0= RULE_STRING ) ) )* otherlv_11= ']' (otherlv_12= ';' )? )? (otherlv_13= 'maxRetries' ( (lv_maxRetries_14_0= RULE_INT ) ) (otherlv_15= ';' )? )? (otherlv_16= 'parseCheck' ( ( (lv_parseCheck_17_1= 'true' | lv_parseCheck_17_2= 'false' ) ) ) (otherlv_18= ';' )? )? ( (lv_remediations_19_0= ruleTestGenRemediationsBlock ) )? ( (lv_legacyRemediationRules_20_0= ruleTestGenLegacyRemediationRulesBlock ) )? ( (lv_usage_21_0= ruleTestGenUsageBlock ) )? otherlv_22= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTestGenModulePolicyAccess().getForModuleKeyword_0());
            		
            // InternalLibrettoProjectProfile.g:803:3: ( (lv_moduleId_1_0= RULE_STRING ) )
            // InternalLibrettoProjectProfile.g:804:4: (lv_moduleId_1_0= RULE_STRING )
            {
            // InternalLibrettoProjectProfile.g:804:4: (lv_moduleId_1_0= RULE_STRING )
            // InternalLibrettoProjectProfile.g:805:5: lv_moduleId_1_0= RULE_STRING
            {
            lv_moduleId_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_moduleId_1_0, grammarAccess.getTestGenModulePolicyAccess().getModuleIdSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTestGenModulePolicyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"moduleId",
            						lv_moduleId_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_40); 

            			newLeafNode(otherlv_2, grammarAccess.getTestGenModulePolicyAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLibrettoProjectProfile.g:825:3: (otherlv_3= 'initialInstruction' ( (lv_initialInstruction_4_0= RULE_STRING ) ) (otherlv_5= ';' )? )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==25) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:826:4: otherlv_3= 'initialInstruction' ( (lv_initialInstruction_4_0= RULE_STRING ) ) (otherlv_5= ';' )?
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getTestGenModulePolicyAccess().getInitialInstructionKeyword_3_0());
                    			
                    // InternalLibrettoProjectProfile.g:830:4: ( (lv_initialInstruction_4_0= RULE_STRING ) )
                    // InternalLibrettoProjectProfile.g:831:5: (lv_initialInstruction_4_0= RULE_STRING )
                    {
                    // InternalLibrettoProjectProfile.g:831:5: (lv_initialInstruction_4_0= RULE_STRING )
                    // InternalLibrettoProjectProfile.g:832:6: lv_initialInstruction_4_0= RULE_STRING
                    {
                    lv_initialInstruction_4_0=(Token)match(input,RULE_STRING,FOLLOW_41); 

                    						newLeafNode(lv_initialInstruction_4_0, grammarAccess.getTestGenModulePolicyAccess().getInitialInstructionSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTestGenModulePolicyRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"initialInstruction",
                    							lv_initialInstruction_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalLibrettoProjectProfile.g:848:4: (otherlv_5= ';' )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==16) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalLibrettoProjectProfile.g:849:5: otherlv_5= ';'
                            {
                            otherlv_5=(Token)match(input,16,FOLLOW_42); 

                            					newLeafNode(otherlv_5, grammarAccess.getTestGenModulePolicyAccess().getSemicolonKeyword_3_2());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalLibrettoProjectProfile.g:855:3: (otherlv_6= 'forbiddenPatterns' otherlv_7= '[' ( (lv_forbiddenPatterns_8_0= RULE_STRING ) ) (otherlv_9= ',' ( (lv_forbiddenPatterns_10_0= RULE_STRING ) ) )* otherlv_11= ']' (otherlv_12= ';' )? )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==26) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:856:4: otherlv_6= 'forbiddenPatterns' otherlv_7= '[' ( (lv_forbiddenPatterns_8_0= RULE_STRING ) ) (otherlv_9= ',' ( (lv_forbiddenPatterns_10_0= RULE_STRING ) ) )* otherlv_11= ']' (otherlv_12= ';' )?
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_27); 

                    				newLeafNode(otherlv_6, grammarAccess.getTestGenModulePolicyAccess().getForbiddenPatternsKeyword_4_0());
                    			
                    otherlv_7=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getTestGenModulePolicyAccess().getLeftSquareBracketKeyword_4_1());
                    			
                    // InternalLibrettoProjectProfile.g:864:4: ( (lv_forbiddenPatterns_8_0= RULE_STRING ) )
                    // InternalLibrettoProjectProfile.g:865:5: (lv_forbiddenPatterns_8_0= RULE_STRING )
                    {
                    // InternalLibrettoProjectProfile.g:865:5: (lv_forbiddenPatterns_8_0= RULE_STRING )
                    // InternalLibrettoProjectProfile.g:866:6: lv_forbiddenPatterns_8_0= RULE_STRING
                    {
                    lv_forbiddenPatterns_8_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

                    						newLeafNode(lv_forbiddenPatterns_8_0, grammarAccess.getTestGenModulePolicyAccess().getForbiddenPatternsSTRINGTerminalRuleCall_4_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTestGenModulePolicyRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"forbiddenPatterns",
                    							lv_forbiddenPatterns_8_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalLibrettoProjectProfile.g:882:4: (otherlv_9= ',' ( (lv_forbiddenPatterns_10_0= RULE_STRING ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==28) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalLibrettoProjectProfile.g:883:5: otherlv_9= ',' ( (lv_forbiddenPatterns_10_0= RULE_STRING ) )
                    	    {
                    	    otherlv_9=(Token)match(input,28,FOLLOW_3); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getTestGenModulePolicyAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalLibrettoProjectProfile.g:887:5: ( (lv_forbiddenPatterns_10_0= RULE_STRING ) )
                    	    // InternalLibrettoProjectProfile.g:888:6: (lv_forbiddenPatterns_10_0= RULE_STRING )
                    	    {
                    	    // InternalLibrettoProjectProfile.g:888:6: (lv_forbiddenPatterns_10_0= RULE_STRING )
                    	    // InternalLibrettoProjectProfile.g:889:7: lv_forbiddenPatterns_10_0= RULE_STRING
                    	    {
                    	    lv_forbiddenPatterns_10_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

                    	    							newLeafNode(lv_forbiddenPatterns_10_0, grammarAccess.getTestGenModulePolicyAccess().getForbiddenPatternsSTRINGTerminalRuleCall_4_3_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getTestGenModulePolicyRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"forbiddenPatterns",
                    	    								lv_forbiddenPatterns_10_0,
                    	    								"org.eclipse.xtext.common.Terminals.STRING");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,29,FOLLOW_43); 

                    				newLeafNode(otherlv_11, grammarAccess.getTestGenModulePolicyAccess().getRightSquareBracketKeyword_4_4());
                    			
                    // InternalLibrettoProjectProfile.g:910:4: (otherlv_12= ';' )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==16) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalLibrettoProjectProfile.g:911:5: otherlv_12= ';'
                            {
                            otherlv_12=(Token)match(input,16,FOLLOW_44); 

                            					newLeafNode(otherlv_12, grammarAccess.getTestGenModulePolicyAccess().getSemicolonKeyword_4_5());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalLibrettoProjectProfile.g:917:3: (otherlv_13= 'maxRetries' ( (lv_maxRetries_14_0= RULE_INT ) ) (otherlv_15= ';' )? )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==30) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:918:4: otherlv_13= 'maxRetries' ( (lv_maxRetries_14_0= RULE_INT ) ) (otherlv_15= ';' )?
                    {
                    otherlv_13=(Token)match(input,30,FOLLOW_31); 

                    				newLeafNode(otherlv_13, grammarAccess.getTestGenModulePolicyAccess().getMaxRetriesKeyword_5_0());
                    			
                    // InternalLibrettoProjectProfile.g:922:4: ( (lv_maxRetries_14_0= RULE_INT ) )
                    // InternalLibrettoProjectProfile.g:923:5: (lv_maxRetries_14_0= RULE_INT )
                    {
                    // InternalLibrettoProjectProfile.g:923:5: (lv_maxRetries_14_0= RULE_INT )
                    // InternalLibrettoProjectProfile.g:924:6: lv_maxRetries_14_0= RULE_INT
                    {
                    lv_maxRetries_14_0=(Token)match(input,RULE_INT,FOLLOW_45); 

                    						newLeafNode(lv_maxRetries_14_0, grammarAccess.getTestGenModulePolicyAccess().getMaxRetriesINTTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTestGenModulePolicyRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"maxRetries",
                    							lv_maxRetries_14_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalLibrettoProjectProfile.g:940:4: (otherlv_15= ';' )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==16) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // InternalLibrettoProjectProfile.g:941:5: otherlv_15= ';'
                            {
                            otherlv_15=(Token)match(input,16,FOLLOW_46); 

                            					newLeafNode(otherlv_15, grammarAccess.getTestGenModulePolicyAccess().getSemicolonKeyword_5_2());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalLibrettoProjectProfile.g:947:3: (otherlv_16= 'parseCheck' ( ( (lv_parseCheck_17_1= 'true' | lv_parseCheck_17_2= 'false' ) ) ) (otherlv_18= ';' )? )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==31) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:948:4: otherlv_16= 'parseCheck' ( ( (lv_parseCheck_17_1= 'true' | lv_parseCheck_17_2= 'false' ) ) ) (otherlv_18= ';' )?
                    {
                    otherlv_16=(Token)match(input,31,FOLLOW_34); 

                    				newLeafNode(otherlv_16, grammarAccess.getTestGenModulePolicyAccess().getParseCheckKeyword_6_0());
                    			
                    // InternalLibrettoProjectProfile.g:952:4: ( ( (lv_parseCheck_17_1= 'true' | lv_parseCheck_17_2= 'false' ) ) )
                    // InternalLibrettoProjectProfile.g:953:5: ( (lv_parseCheck_17_1= 'true' | lv_parseCheck_17_2= 'false' ) )
                    {
                    // InternalLibrettoProjectProfile.g:953:5: ( (lv_parseCheck_17_1= 'true' | lv_parseCheck_17_2= 'false' ) )
                    // InternalLibrettoProjectProfile.g:954:6: (lv_parseCheck_17_1= 'true' | lv_parseCheck_17_2= 'false' )
                    {
                    // InternalLibrettoProjectProfile.g:954:6: (lv_parseCheck_17_1= 'true' | lv_parseCheck_17_2= 'false' )
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==32) ) {
                        alt39=1;
                    }
                    else if ( (LA39_0==33) ) {
                        alt39=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 39, 0, input);

                        throw nvae;
                    }
                    switch (alt39) {
                        case 1 :
                            // InternalLibrettoProjectProfile.g:955:7: lv_parseCheck_17_1= 'true'
                            {
                            lv_parseCheck_17_1=(Token)match(input,32,FOLLOW_47); 

                            							newLeafNode(lv_parseCheck_17_1, grammarAccess.getTestGenModulePolicyAccess().getParseCheckTrueKeyword_6_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getTestGenModulePolicyRule());
                            							}
                            							setWithLastConsumed(current, "parseCheck", lv_parseCheck_17_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalLibrettoProjectProfile.g:966:7: lv_parseCheck_17_2= 'false'
                            {
                            lv_parseCheck_17_2=(Token)match(input,33,FOLLOW_47); 

                            							newLeafNode(lv_parseCheck_17_2, grammarAccess.getTestGenModulePolicyAccess().getParseCheckFalseKeyword_6_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getTestGenModulePolicyRule());
                            							}
                            							setWithLastConsumed(current, "parseCheck", lv_parseCheck_17_2, null);
                            						

                            }
                            break;

                    }


                    }


                    }

                    // InternalLibrettoProjectProfile.g:979:4: (otherlv_18= ';' )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==16) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // InternalLibrettoProjectProfile.g:980:5: otherlv_18= ';'
                            {
                            otherlv_18=(Token)match(input,16,FOLLOW_48); 

                            					newLeafNode(otherlv_18, grammarAccess.getTestGenModulePolicyAccess().getSemicolonKeyword_6_2());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalLibrettoProjectProfile.g:986:3: ( (lv_remediations_19_0= ruleTestGenRemediationsBlock ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==35) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:987:4: (lv_remediations_19_0= ruleTestGenRemediationsBlock )
                    {
                    // InternalLibrettoProjectProfile.g:987:4: (lv_remediations_19_0= ruleTestGenRemediationsBlock )
                    // InternalLibrettoProjectProfile.g:988:5: lv_remediations_19_0= ruleTestGenRemediationsBlock
                    {

                    					newCompositeNode(grammarAccess.getTestGenModulePolicyAccess().getRemediationsTestGenRemediationsBlockParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_49);
                    lv_remediations_19_0=ruleTestGenRemediationsBlock();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTestGenModulePolicyRule());
                    					}
                    					set(
                    						current,
                    						"remediations",
                    						lv_remediations_19_0,
                    						"com.robenglander.libretto.spec.LibrettoProjectProfile.TestGenRemediationsBlock");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalLibrettoProjectProfile.g:1005:3: ( (lv_legacyRemediationRules_20_0= ruleTestGenLegacyRemediationRulesBlock ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==43) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:1006:4: (lv_legacyRemediationRules_20_0= ruleTestGenLegacyRemediationRulesBlock )
                    {
                    // InternalLibrettoProjectProfile.g:1006:4: (lv_legacyRemediationRules_20_0= ruleTestGenLegacyRemediationRulesBlock )
                    // InternalLibrettoProjectProfile.g:1007:5: lv_legacyRemediationRules_20_0= ruleTestGenLegacyRemediationRulesBlock
                    {

                    					newCompositeNode(grammarAccess.getTestGenModulePolicyAccess().getLegacyRemediationRulesTestGenLegacyRemediationRulesBlockParserRuleCall_8_0());
                    				
                    pushFollow(FOLLOW_50);
                    lv_legacyRemediationRules_20_0=ruleTestGenLegacyRemediationRulesBlock();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTestGenModulePolicyRule());
                    					}
                    					set(
                    						current,
                    						"legacyRemediationRules",
                    						lv_legacyRemediationRules_20_0,
                    						"com.robenglander.libretto.spec.LibrettoProjectProfile.TestGenLegacyRemediationRulesBlock");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalLibrettoProjectProfile.g:1024:3: ( (lv_usage_21_0= ruleTestGenUsageBlock ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==54) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:1025:4: (lv_usage_21_0= ruleTestGenUsageBlock )
                    {
                    // InternalLibrettoProjectProfile.g:1025:4: (lv_usage_21_0= ruleTestGenUsageBlock )
                    // InternalLibrettoProjectProfile.g:1026:5: lv_usage_21_0= ruleTestGenUsageBlock
                    {

                    					newCompositeNode(grammarAccess.getTestGenModulePolicyAccess().getUsageTestGenUsageBlockParserRuleCall_9_0());
                    				
                    pushFollow(FOLLOW_8);
                    lv_usage_21_0=ruleTestGenUsageBlock();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTestGenModulePolicyRule());
                    					}
                    					set(
                    						current,
                    						"usage",
                    						lv_usage_21_0,
                    						"com.robenglander.libretto.spec.LibrettoProjectProfile.TestGenUsageBlock");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_22=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getTestGenModulePolicyAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTestGenModulePolicy"


    // $ANTLR start "entryRuleTestGenRemediationsBlock"
    // InternalLibrettoProjectProfile.g:1051:1: entryRuleTestGenRemediationsBlock returns [EObject current=null] : iv_ruleTestGenRemediationsBlock= ruleTestGenRemediationsBlock EOF ;
    public final EObject entryRuleTestGenRemediationsBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestGenRemediationsBlock = null;


        try {
            // InternalLibrettoProjectProfile.g:1051:65: (iv_ruleTestGenRemediationsBlock= ruleTestGenRemediationsBlock EOF )
            // InternalLibrettoProjectProfile.g:1052:2: iv_ruleTestGenRemediationsBlock= ruleTestGenRemediationsBlock EOF
            {
             newCompositeNode(grammarAccess.getTestGenRemediationsBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTestGenRemediationsBlock=ruleTestGenRemediationsBlock();

            state._fsp--;

             current =iv_ruleTestGenRemediationsBlock; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTestGenRemediationsBlock"


    // $ANTLR start "ruleTestGenRemediationsBlock"
    // InternalLibrettoProjectProfile.g:1058:1: ruleTestGenRemediationsBlock returns [EObject current=null] : (otherlv_0= 'remediations' otherlv_1= '{' (otherlv_2= 'maxRetries' ( (lv_maxRetries_3_0= RULE_INT ) ) (otherlv_4= ';' )? )? (otherlv_5= 'parseCheck' ( ( (lv_parseCheck_6_1= 'true' | lv_parseCheck_6_2= 'false' ) ) ) (otherlv_7= ';' )? )? (otherlv_8= 'defaultCorrection' ( (lv_defaultCorrection_9_0= RULE_STRING ) ) (otherlv_10= ';' )? )? (otherlv_11= 'forbiddenPatterns' otherlv_12= '[' ( (lv_forbiddenPatterns_13_0= RULE_STRING ) ) (otherlv_14= ',' ( (lv_forbiddenPatterns_15_0= RULE_STRING ) ) )* otherlv_16= ']' (otherlv_17= ';' )? )? ( (lv_rulesContainer_18_0= ruleTestGenRemediationRulesContainer ) )? otherlv_19= '}' ) ;
    public final EObject ruleTestGenRemediationsBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_maxRetries_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_parseCheck_6_1=null;
        Token lv_parseCheck_6_2=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_defaultCorrection_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_forbiddenPatterns_13_0=null;
        Token otherlv_14=null;
        Token lv_forbiddenPatterns_15_0=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        EObject lv_rulesContainer_18_0 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:1064:2: ( (otherlv_0= 'remediations' otherlv_1= '{' (otherlv_2= 'maxRetries' ( (lv_maxRetries_3_0= RULE_INT ) ) (otherlv_4= ';' )? )? (otherlv_5= 'parseCheck' ( ( (lv_parseCheck_6_1= 'true' | lv_parseCheck_6_2= 'false' ) ) ) (otherlv_7= ';' )? )? (otherlv_8= 'defaultCorrection' ( (lv_defaultCorrection_9_0= RULE_STRING ) ) (otherlv_10= ';' )? )? (otherlv_11= 'forbiddenPatterns' otherlv_12= '[' ( (lv_forbiddenPatterns_13_0= RULE_STRING ) ) (otherlv_14= ',' ( (lv_forbiddenPatterns_15_0= RULE_STRING ) ) )* otherlv_16= ']' (otherlv_17= ';' )? )? ( (lv_rulesContainer_18_0= ruleTestGenRemediationRulesContainer ) )? otherlv_19= '}' ) )
            // InternalLibrettoProjectProfile.g:1065:2: (otherlv_0= 'remediations' otherlv_1= '{' (otherlv_2= 'maxRetries' ( (lv_maxRetries_3_0= RULE_INT ) ) (otherlv_4= ';' )? )? (otherlv_5= 'parseCheck' ( ( (lv_parseCheck_6_1= 'true' | lv_parseCheck_6_2= 'false' ) ) ) (otherlv_7= ';' )? )? (otherlv_8= 'defaultCorrection' ( (lv_defaultCorrection_9_0= RULE_STRING ) ) (otherlv_10= ';' )? )? (otherlv_11= 'forbiddenPatterns' otherlv_12= '[' ( (lv_forbiddenPatterns_13_0= RULE_STRING ) ) (otherlv_14= ',' ( (lv_forbiddenPatterns_15_0= RULE_STRING ) ) )* otherlv_16= ']' (otherlv_17= ';' )? )? ( (lv_rulesContainer_18_0= ruleTestGenRemediationRulesContainer ) )? otherlv_19= '}' )
            {
            // InternalLibrettoProjectProfile.g:1065:2: (otherlv_0= 'remediations' otherlv_1= '{' (otherlv_2= 'maxRetries' ( (lv_maxRetries_3_0= RULE_INT ) ) (otherlv_4= ';' )? )? (otherlv_5= 'parseCheck' ( ( (lv_parseCheck_6_1= 'true' | lv_parseCheck_6_2= 'false' ) ) ) (otherlv_7= ';' )? )? (otherlv_8= 'defaultCorrection' ( (lv_defaultCorrection_9_0= RULE_STRING ) ) (otherlv_10= ';' )? )? (otherlv_11= 'forbiddenPatterns' otherlv_12= '[' ( (lv_forbiddenPatterns_13_0= RULE_STRING ) ) (otherlv_14= ',' ( (lv_forbiddenPatterns_15_0= RULE_STRING ) ) )* otherlv_16= ']' (otherlv_17= ';' )? )? ( (lv_rulesContainer_18_0= ruleTestGenRemediationRulesContainer ) )? otherlv_19= '}' )
            // InternalLibrettoProjectProfile.g:1066:3: otherlv_0= 'remediations' otherlv_1= '{' (otherlv_2= 'maxRetries' ( (lv_maxRetries_3_0= RULE_INT ) ) (otherlv_4= ';' )? )? (otherlv_5= 'parseCheck' ( ( (lv_parseCheck_6_1= 'true' | lv_parseCheck_6_2= 'false' ) ) ) (otherlv_7= ';' )? )? (otherlv_8= 'defaultCorrection' ( (lv_defaultCorrection_9_0= RULE_STRING ) ) (otherlv_10= ';' )? )? (otherlv_11= 'forbiddenPatterns' otherlv_12= '[' ( (lv_forbiddenPatterns_13_0= RULE_STRING ) ) (otherlv_14= ',' ( (lv_forbiddenPatterns_15_0= RULE_STRING ) ) )* otherlv_16= ']' (otherlv_17= ';' )? )? ( (lv_rulesContainer_18_0= ruleTestGenRemediationRulesContainer ) )? otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTestGenRemediationsBlockAccess().getRemediationsKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_51); 

            			newLeafNode(otherlv_1, grammarAccess.getTestGenRemediationsBlockAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalLibrettoProjectProfile.g:1074:3: (otherlv_2= 'maxRetries' ( (lv_maxRetries_3_0= RULE_INT ) ) (otherlv_4= ';' )? )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==30) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:1075:4: otherlv_2= 'maxRetries' ( (lv_maxRetries_3_0= RULE_INT ) ) (otherlv_4= ';' )?
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_31); 

                    				newLeafNode(otherlv_2, grammarAccess.getTestGenRemediationsBlockAccess().getMaxRetriesKeyword_2_0());
                    			
                    // InternalLibrettoProjectProfile.g:1079:4: ( (lv_maxRetries_3_0= RULE_INT ) )
                    // InternalLibrettoProjectProfile.g:1080:5: (lv_maxRetries_3_0= RULE_INT )
                    {
                    // InternalLibrettoProjectProfile.g:1080:5: (lv_maxRetries_3_0= RULE_INT )
                    // InternalLibrettoProjectProfile.g:1081:6: lv_maxRetries_3_0= RULE_INT
                    {
                    lv_maxRetries_3_0=(Token)match(input,RULE_INT,FOLLOW_52); 

                    						newLeafNode(lv_maxRetries_3_0, grammarAccess.getTestGenRemediationsBlockAccess().getMaxRetriesINTTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTestGenRemediationsBlockRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"maxRetries",
                    							lv_maxRetries_3_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalLibrettoProjectProfile.g:1097:4: (otherlv_4= ';' )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==16) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // InternalLibrettoProjectProfile.g:1098:5: otherlv_4= ';'
                            {
                            otherlv_4=(Token)match(input,16,FOLLOW_53); 

                            					newLeafNode(otherlv_4, grammarAccess.getTestGenRemediationsBlockAccess().getSemicolonKeyword_2_2());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalLibrettoProjectProfile.g:1104:3: (otherlv_5= 'parseCheck' ( ( (lv_parseCheck_6_1= 'true' | lv_parseCheck_6_2= 'false' ) ) ) (otherlv_7= ';' )? )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==31) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:1105:4: otherlv_5= 'parseCheck' ( ( (lv_parseCheck_6_1= 'true' | lv_parseCheck_6_2= 'false' ) ) ) (otherlv_7= ';' )?
                    {
                    otherlv_5=(Token)match(input,31,FOLLOW_34); 

                    				newLeafNode(otherlv_5, grammarAccess.getTestGenRemediationsBlockAccess().getParseCheckKeyword_3_0());
                    			
                    // InternalLibrettoProjectProfile.g:1109:4: ( ( (lv_parseCheck_6_1= 'true' | lv_parseCheck_6_2= 'false' ) ) )
                    // InternalLibrettoProjectProfile.g:1110:5: ( (lv_parseCheck_6_1= 'true' | lv_parseCheck_6_2= 'false' ) )
                    {
                    // InternalLibrettoProjectProfile.g:1110:5: ( (lv_parseCheck_6_1= 'true' | lv_parseCheck_6_2= 'false' ) )
                    // InternalLibrettoProjectProfile.g:1111:6: (lv_parseCheck_6_1= 'true' | lv_parseCheck_6_2= 'false' )
                    {
                    // InternalLibrettoProjectProfile.g:1111:6: (lv_parseCheck_6_1= 'true' | lv_parseCheck_6_2= 'false' )
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==32) ) {
                        alt47=1;
                    }
                    else if ( (LA47_0==33) ) {
                        alt47=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 47, 0, input);

                        throw nvae;
                    }
                    switch (alt47) {
                        case 1 :
                            // InternalLibrettoProjectProfile.g:1112:7: lv_parseCheck_6_1= 'true'
                            {
                            lv_parseCheck_6_1=(Token)match(input,32,FOLLOW_54); 

                            							newLeafNode(lv_parseCheck_6_1, grammarAccess.getTestGenRemediationsBlockAccess().getParseCheckTrueKeyword_3_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getTestGenRemediationsBlockRule());
                            							}
                            							setWithLastConsumed(current, "parseCheck", lv_parseCheck_6_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalLibrettoProjectProfile.g:1123:7: lv_parseCheck_6_2= 'false'
                            {
                            lv_parseCheck_6_2=(Token)match(input,33,FOLLOW_54); 

                            							newLeafNode(lv_parseCheck_6_2, grammarAccess.getTestGenRemediationsBlockAccess().getParseCheckFalseKeyword_3_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getTestGenRemediationsBlockRule());
                            							}
                            							setWithLastConsumed(current, "parseCheck", lv_parseCheck_6_2, null);
                            						

                            }
                            break;

                    }


                    }


                    }

                    // InternalLibrettoProjectProfile.g:1136:4: (otherlv_7= ';' )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==16) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // InternalLibrettoProjectProfile.g:1137:5: otherlv_7= ';'
                            {
                            otherlv_7=(Token)match(input,16,FOLLOW_55); 

                            					newLeafNode(otherlv_7, grammarAccess.getTestGenRemediationsBlockAccess().getSemicolonKeyword_3_2());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalLibrettoProjectProfile.g:1143:3: (otherlv_8= 'defaultCorrection' ( (lv_defaultCorrection_9_0= RULE_STRING ) ) (otherlv_10= ';' )? )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==36) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:1144:4: otherlv_8= 'defaultCorrection' ( (lv_defaultCorrection_9_0= RULE_STRING ) ) (otherlv_10= ';' )?
                    {
                    otherlv_8=(Token)match(input,36,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getTestGenRemediationsBlockAccess().getDefaultCorrectionKeyword_4_0());
                    			
                    // InternalLibrettoProjectProfile.g:1148:4: ( (lv_defaultCorrection_9_0= RULE_STRING ) )
                    // InternalLibrettoProjectProfile.g:1149:5: (lv_defaultCorrection_9_0= RULE_STRING )
                    {
                    // InternalLibrettoProjectProfile.g:1149:5: (lv_defaultCorrection_9_0= RULE_STRING )
                    // InternalLibrettoProjectProfile.g:1150:6: lv_defaultCorrection_9_0= RULE_STRING
                    {
                    lv_defaultCorrection_9_0=(Token)match(input,RULE_STRING,FOLLOW_56); 

                    						newLeafNode(lv_defaultCorrection_9_0, grammarAccess.getTestGenRemediationsBlockAccess().getDefaultCorrectionSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTestGenRemediationsBlockRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"defaultCorrection",
                    							lv_defaultCorrection_9_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalLibrettoProjectProfile.g:1166:4: (otherlv_10= ';' )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==16) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // InternalLibrettoProjectProfile.g:1167:5: otherlv_10= ';'
                            {
                            otherlv_10=(Token)match(input,16,FOLLOW_57); 

                            					newLeafNode(otherlv_10, grammarAccess.getTestGenRemediationsBlockAccess().getSemicolonKeyword_4_2());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalLibrettoProjectProfile.g:1173:3: (otherlv_11= 'forbiddenPatterns' otherlv_12= '[' ( (lv_forbiddenPatterns_13_0= RULE_STRING ) ) (otherlv_14= ',' ( (lv_forbiddenPatterns_15_0= RULE_STRING ) ) )* otherlv_16= ']' (otherlv_17= ';' )? )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==26) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:1174:4: otherlv_11= 'forbiddenPatterns' otherlv_12= '[' ( (lv_forbiddenPatterns_13_0= RULE_STRING ) ) (otherlv_14= ',' ( (lv_forbiddenPatterns_15_0= RULE_STRING ) ) )* otherlv_16= ']' (otherlv_17= ';' )?
                    {
                    otherlv_11=(Token)match(input,26,FOLLOW_27); 

                    				newLeafNode(otherlv_11, grammarAccess.getTestGenRemediationsBlockAccess().getForbiddenPatternsKeyword_5_0());
                    			
                    otherlv_12=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getTestGenRemediationsBlockAccess().getLeftSquareBracketKeyword_5_1());
                    			
                    // InternalLibrettoProjectProfile.g:1182:4: ( (lv_forbiddenPatterns_13_0= RULE_STRING ) )
                    // InternalLibrettoProjectProfile.g:1183:5: (lv_forbiddenPatterns_13_0= RULE_STRING )
                    {
                    // InternalLibrettoProjectProfile.g:1183:5: (lv_forbiddenPatterns_13_0= RULE_STRING )
                    // InternalLibrettoProjectProfile.g:1184:6: lv_forbiddenPatterns_13_0= RULE_STRING
                    {
                    lv_forbiddenPatterns_13_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

                    						newLeafNode(lv_forbiddenPatterns_13_0, grammarAccess.getTestGenRemediationsBlockAccess().getForbiddenPatternsSTRINGTerminalRuleCall_5_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTestGenRemediationsBlockRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"forbiddenPatterns",
                    							lv_forbiddenPatterns_13_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalLibrettoProjectProfile.g:1200:4: (otherlv_14= ',' ( (lv_forbiddenPatterns_15_0= RULE_STRING ) ) )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==28) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // InternalLibrettoProjectProfile.g:1201:5: otherlv_14= ',' ( (lv_forbiddenPatterns_15_0= RULE_STRING ) )
                    	    {
                    	    otherlv_14=(Token)match(input,28,FOLLOW_3); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getTestGenRemediationsBlockAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalLibrettoProjectProfile.g:1205:5: ( (lv_forbiddenPatterns_15_0= RULE_STRING ) )
                    	    // InternalLibrettoProjectProfile.g:1206:6: (lv_forbiddenPatterns_15_0= RULE_STRING )
                    	    {
                    	    // InternalLibrettoProjectProfile.g:1206:6: (lv_forbiddenPatterns_15_0= RULE_STRING )
                    	    // InternalLibrettoProjectProfile.g:1207:7: lv_forbiddenPatterns_15_0= RULE_STRING
                    	    {
                    	    lv_forbiddenPatterns_15_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

                    	    							newLeafNode(lv_forbiddenPatterns_15_0, grammarAccess.getTestGenRemediationsBlockAccess().getForbiddenPatternsSTRINGTerminalRuleCall_5_3_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getTestGenRemediationsBlockRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"forbiddenPatterns",
                    	    								lv_forbiddenPatterns_15_0,
                    	    								"org.eclipse.xtext.common.Terminals.STRING");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop52;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,29,FOLLOW_58); 

                    				newLeafNode(otherlv_16, grammarAccess.getTestGenRemediationsBlockAccess().getRightSquareBracketKeyword_5_4());
                    			
                    // InternalLibrettoProjectProfile.g:1228:4: (otherlv_17= ';' )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==16) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // InternalLibrettoProjectProfile.g:1229:5: otherlv_17= ';'
                            {
                            otherlv_17=(Token)match(input,16,FOLLOW_59); 

                            					newLeafNode(otherlv_17, grammarAccess.getTestGenRemediationsBlockAccess().getSemicolonKeyword_5_5());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalLibrettoProjectProfile.g:1235:3: ( (lv_rulesContainer_18_0= ruleTestGenRemediationRulesContainer ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==37) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:1236:4: (lv_rulesContainer_18_0= ruleTestGenRemediationRulesContainer )
                    {
                    // InternalLibrettoProjectProfile.g:1236:4: (lv_rulesContainer_18_0= ruleTestGenRemediationRulesContainer )
                    // InternalLibrettoProjectProfile.g:1237:5: lv_rulesContainer_18_0= ruleTestGenRemediationRulesContainer
                    {

                    					newCompositeNode(grammarAccess.getTestGenRemediationsBlockAccess().getRulesContainerTestGenRemediationRulesContainerParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_8);
                    lv_rulesContainer_18_0=ruleTestGenRemediationRulesContainer();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTestGenRemediationsBlockRule());
                    					}
                    					set(
                    						current,
                    						"rulesContainer",
                    						lv_rulesContainer_18_0,
                    						"com.robenglander.libretto.spec.LibrettoProjectProfile.TestGenRemediationRulesContainer");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_19=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getTestGenRemediationsBlockAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTestGenRemediationsBlock"


    // $ANTLR start "entryRuleTestGenRemediationRulesContainer"
    // InternalLibrettoProjectProfile.g:1262:1: entryRuleTestGenRemediationRulesContainer returns [EObject current=null] : iv_ruleTestGenRemediationRulesContainer= ruleTestGenRemediationRulesContainer EOF ;
    public final EObject entryRuleTestGenRemediationRulesContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestGenRemediationRulesContainer = null;


        try {
            // InternalLibrettoProjectProfile.g:1262:73: (iv_ruleTestGenRemediationRulesContainer= ruleTestGenRemediationRulesContainer EOF )
            // InternalLibrettoProjectProfile.g:1263:2: iv_ruleTestGenRemediationRulesContainer= ruleTestGenRemediationRulesContainer EOF
            {
             newCompositeNode(grammarAccess.getTestGenRemediationRulesContainerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTestGenRemediationRulesContainer=ruleTestGenRemediationRulesContainer();

            state._fsp--;

             current =iv_ruleTestGenRemediationRulesContainer; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTestGenRemediationRulesContainer"


    // $ANTLR start "ruleTestGenRemediationRulesContainer"
    // InternalLibrettoProjectProfile.g:1269:1: ruleTestGenRemediationRulesContainer returns [EObject current=null] : (otherlv_0= 'rules' otherlv_1= '{' ( (lv_patternRules_2_0= ruleTestGenPatternRemediationRule ) )* ( (lv_defaultRemediation_3_0= ruleTestGenDefaultRemediationRule ) )? otherlv_4= '}' ) ;
    public final EObject ruleTestGenRemediationRulesContainer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_patternRules_2_0 = null;

        EObject lv_defaultRemediation_3_0 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:1275:2: ( (otherlv_0= 'rules' otherlv_1= '{' ( (lv_patternRules_2_0= ruleTestGenPatternRemediationRule ) )* ( (lv_defaultRemediation_3_0= ruleTestGenDefaultRemediationRule ) )? otherlv_4= '}' ) )
            // InternalLibrettoProjectProfile.g:1276:2: (otherlv_0= 'rules' otherlv_1= '{' ( (lv_patternRules_2_0= ruleTestGenPatternRemediationRule ) )* ( (lv_defaultRemediation_3_0= ruleTestGenDefaultRemediationRule ) )? otherlv_4= '}' )
            {
            // InternalLibrettoProjectProfile.g:1276:2: (otherlv_0= 'rules' otherlv_1= '{' ( (lv_patternRules_2_0= ruleTestGenPatternRemediationRule ) )* ( (lv_defaultRemediation_3_0= ruleTestGenDefaultRemediationRule ) )? otherlv_4= '}' )
            // InternalLibrettoProjectProfile.g:1277:3: otherlv_0= 'rules' otherlv_1= '{' ( (lv_patternRules_2_0= ruleTestGenPatternRemediationRule ) )* ( (lv_defaultRemediation_3_0= ruleTestGenDefaultRemediationRule ) )? otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTestGenRemediationRulesContainerAccess().getRulesKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_60); 

            			newLeafNode(otherlv_1, grammarAccess.getTestGenRemediationRulesContainerAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalLibrettoProjectProfile.g:1285:3: ( (lv_patternRules_2_0= ruleTestGenPatternRemediationRule ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==38) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:1286:4: (lv_patternRules_2_0= ruleTestGenPatternRemediationRule )
            	    {
            	    // InternalLibrettoProjectProfile.g:1286:4: (lv_patternRules_2_0= ruleTestGenPatternRemediationRule )
            	    // InternalLibrettoProjectProfile.g:1287:5: lv_patternRules_2_0= ruleTestGenPatternRemediationRule
            	    {

            	    					newCompositeNode(grammarAccess.getTestGenRemediationRulesContainerAccess().getPatternRulesTestGenPatternRemediationRuleParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_60);
            	    lv_patternRules_2_0=ruleTestGenPatternRemediationRule();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTestGenRemediationRulesContainerRule());
            	    					}
            	    					add(
            	    						current,
            	    						"patternRules",
            	    						lv_patternRules_2_0,
            	    						"com.robenglander.libretto.spec.LibrettoProjectProfile.TestGenPatternRemediationRule");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

            // InternalLibrettoProjectProfile.g:1304:3: ( (lv_defaultRemediation_3_0= ruleTestGenDefaultRemediationRule ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==42) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:1305:4: (lv_defaultRemediation_3_0= ruleTestGenDefaultRemediationRule )
                    {
                    // InternalLibrettoProjectProfile.g:1305:4: (lv_defaultRemediation_3_0= ruleTestGenDefaultRemediationRule )
                    // InternalLibrettoProjectProfile.g:1306:5: lv_defaultRemediation_3_0= ruleTestGenDefaultRemediationRule
                    {

                    					newCompositeNode(grammarAccess.getTestGenRemediationRulesContainerAccess().getDefaultRemediationTestGenDefaultRemediationRuleParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_8);
                    lv_defaultRemediation_3_0=ruleTestGenDefaultRemediationRule();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTestGenRemediationRulesContainerRule());
                    					}
                    					set(
                    						current,
                    						"defaultRemediation",
                    						lv_defaultRemediation_3_0,
                    						"com.robenglander.libretto.spec.LibrettoProjectProfile.TestGenDefaultRemediationRule");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getTestGenRemediationRulesContainerAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTestGenRemediationRulesContainer"


    // $ANTLR start "entryRuleTestGenPatternRemediationRule"
    // InternalLibrettoProjectProfile.g:1331:1: entryRuleTestGenPatternRemediationRule returns [EObject current=null] : iv_ruleTestGenPatternRemediationRule= ruleTestGenPatternRemediationRule EOF ;
    public final EObject entryRuleTestGenPatternRemediationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestGenPatternRemediationRule = null;


        try {
            // InternalLibrettoProjectProfile.g:1331:70: (iv_ruleTestGenPatternRemediationRule= ruleTestGenPatternRemediationRule EOF )
            // InternalLibrettoProjectProfile.g:1332:2: iv_ruleTestGenPatternRemediationRule= ruleTestGenPatternRemediationRule EOF
            {
             newCompositeNode(grammarAccess.getTestGenPatternRemediationRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTestGenPatternRemediationRule=ruleTestGenPatternRemediationRule();

            state._fsp--;

             current =iv_ruleTestGenPatternRemediationRule; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTestGenPatternRemediationRule"


    // $ANTLR start "ruleTestGenPatternRemediationRule"
    // InternalLibrettoProjectProfile.g:1338:1: ruleTestGenPatternRemediationRule returns [EObject current=null] : (otherlv_0= 'rule' otherlv_1= '{' otherlv_2= 'pattern' ( (lv_pattern_3_0= RULE_STRING ) ) (otherlv_4= ';' )? otherlv_5= 'code' ( (lv_code_6_0= RULE_STRING ) ) (otherlv_7= ';' )? otherlv_8= 'correction' ( (lv_correction_9_0= RULE_STRING ) ) (otherlv_10= ';' )? otherlv_11= '}' ) ;
    public final EObject ruleTestGenPatternRemediationRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_pattern_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_code_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_correction_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;


        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:1344:2: ( (otherlv_0= 'rule' otherlv_1= '{' otherlv_2= 'pattern' ( (lv_pattern_3_0= RULE_STRING ) ) (otherlv_4= ';' )? otherlv_5= 'code' ( (lv_code_6_0= RULE_STRING ) ) (otherlv_7= ';' )? otherlv_8= 'correction' ( (lv_correction_9_0= RULE_STRING ) ) (otherlv_10= ';' )? otherlv_11= '}' ) )
            // InternalLibrettoProjectProfile.g:1345:2: (otherlv_0= 'rule' otherlv_1= '{' otherlv_2= 'pattern' ( (lv_pattern_3_0= RULE_STRING ) ) (otherlv_4= ';' )? otherlv_5= 'code' ( (lv_code_6_0= RULE_STRING ) ) (otherlv_7= ';' )? otherlv_8= 'correction' ( (lv_correction_9_0= RULE_STRING ) ) (otherlv_10= ';' )? otherlv_11= '}' )
            {
            // InternalLibrettoProjectProfile.g:1345:2: (otherlv_0= 'rule' otherlv_1= '{' otherlv_2= 'pattern' ( (lv_pattern_3_0= RULE_STRING ) ) (otherlv_4= ';' )? otherlv_5= 'code' ( (lv_code_6_0= RULE_STRING ) ) (otherlv_7= ';' )? otherlv_8= 'correction' ( (lv_correction_9_0= RULE_STRING ) ) (otherlv_10= ';' )? otherlv_11= '}' )
            // InternalLibrettoProjectProfile.g:1346:3: otherlv_0= 'rule' otherlv_1= '{' otherlv_2= 'pattern' ( (lv_pattern_3_0= RULE_STRING ) ) (otherlv_4= ';' )? otherlv_5= 'code' ( (lv_code_6_0= RULE_STRING ) ) (otherlv_7= ';' )? otherlv_8= 'correction' ( (lv_correction_9_0= RULE_STRING ) ) (otherlv_10= ';' )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTestGenPatternRemediationRuleAccess().getRuleKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_61); 

            			newLeafNode(otherlv_1, grammarAccess.getTestGenPatternRemediationRuleAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getTestGenPatternRemediationRuleAccess().getPatternKeyword_2());
            		
            // InternalLibrettoProjectProfile.g:1358:3: ( (lv_pattern_3_0= RULE_STRING ) )
            // InternalLibrettoProjectProfile.g:1359:4: (lv_pattern_3_0= RULE_STRING )
            {
            // InternalLibrettoProjectProfile.g:1359:4: (lv_pattern_3_0= RULE_STRING )
            // InternalLibrettoProjectProfile.g:1360:5: lv_pattern_3_0= RULE_STRING
            {
            lv_pattern_3_0=(Token)match(input,RULE_STRING,FOLLOW_62); 

            					newLeafNode(lv_pattern_3_0, grammarAccess.getTestGenPatternRemediationRuleAccess().getPatternSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTestGenPatternRemediationRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"pattern",
            						lv_pattern_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalLibrettoProjectProfile.g:1376:3: (otherlv_4= ';' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==16) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:1377:4: otherlv_4= ';'
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_63); 

                    				newLeafNode(otherlv_4, grammarAccess.getTestGenPatternRemediationRuleAccess().getSemicolonKeyword_4());
                    			

                    }
                    break;

            }

            otherlv_5=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getTestGenPatternRemediationRuleAccess().getCodeKeyword_5());
            		
            // InternalLibrettoProjectProfile.g:1386:3: ( (lv_code_6_0= RULE_STRING ) )
            // InternalLibrettoProjectProfile.g:1387:4: (lv_code_6_0= RULE_STRING )
            {
            // InternalLibrettoProjectProfile.g:1387:4: (lv_code_6_0= RULE_STRING )
            // InternalLibrettoProjectProfile.g:1388:5: lv_code_6_0= RULE_STRING
            {
            lv_code_6_0=(Token)match(input,RULE_STRING,FOLLOW_64); 

            					newLeafNode(lv_code_6_0, grammarAccess.getTestGenPatternRemediationRuleAccess().getCodeSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTestGenPatternRemediationRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"code",
            						lv_code_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalLibrettoProjectProfile.g:1404:3: (otherlv_7= ';' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==16) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:1405:4: otherlv_7= ';'
                    {
                    otherlv_7=(Token)match(input,16,FOLLOW_65); 

                    				newLeafNode(otherlv_7, grammarAccess.getTestGenPatternRemediationRuleAccess().getSemicolonKeyword_7());
                    			

                    }
                    break;

            }

            otherlv_8=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getTestGenPatternRemediationRuleAccess().getCorrectionKeyword_8());
            		
            // InternalLibrettoProjectProfile.g:1414:3: ( (lv_correction_9_0= RULE_STRING ) )
            // InternalLibrettoProjectProfile.g:1415:4: (lv_correction_9_0= RULE_STRING )
            {
            // InternalLibrettoProjectProfile.g:1415:4: (lv_correction_9_0= RULE_STRING )
            // InternalLibrettoProjectProfile.g:1416:5: lv_correction_9_0= RULE_STRING
            {
            lv_correction_9_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

            					newLeafNode(lv_correction_9_0, grammarAccess.getTestGenPatternRemediationRuleAccess().getCorrectionSTRINGTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTestGenPatternRemediationRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"correction",
            						lv_correction_9_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalLibrettoProjectProfile.g:1432:3: (otherlv_10= ';' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==16) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:1433:4: otherlv_10= ';'
                    {
                    otherlv_10=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_10, grammarAccess.getTestGenPatternRemediationRuleAccess().getSemicolonKeyword_10());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getTestGenPatternRemediationRuleAccess().getRightCurlyBracketKeyword_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTestGenPatternRemediationRule"


    // $ANTLR start "entryRuleTestGenDefaultRemediationRule"
    // InternalLibrettoProjectProfile.g:1446:1: entryRuleTestGenDefaultRemediationRule returns [EObject current=null] : iv_ruleTestGenDefaultRemediationRule= ruleTestGenDefaultRemediationRule EOF ;
    public final EObject entryRuleTestGenDefaultRemediationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestGenDefaultRemediationRule = null;


        try {
            // InternalLibrettoProjectProfile.g:1446:70: (iv_ruleTestGenDefaultRemediationRule= ruleTestGenDefaultRemediationRule EOF )
            // InternalLibrettoProjectProfile.g:1447:2: iv_ruleTestGenDefaultRemediationRule= ruleTestGenDefaultRemediationRule EOF
            {
             newCompositeNode(grammarAccess.getTestGenDefaultRemediationRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTestGenDefaultRemediationRule=ruleTestGenDefaultRemediationRule();

            state._fsp--;

             current =iv_ruleTestGenDefaultRemediationRule; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTestGenDefaultRemediationRule"


    // $ANTLR start "ruleTestGenDefaultRemediationRule"
    // InternalLibrettoProjectProfile.g:1453:1: ruleTestGenDefaultRemediationRule returns [EObject current=null] : (otherlv_0= 'default' otherlv_1= '{' otherlv_2= 'code' ( (lv_code_3_0= RULE_STRING ) ) (otherlv_4= ';' )? otherlv_5= 'correction' ( (lv_correction_6_0= RULE_STRING ) ) (otherlv_7= ';' )? otherlv_8= '}' ) ;
    public final EObject ruleTestGenDefaultRemediationRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_code_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_correction_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:1459:2: ( (otherlv_0= 'default' otherlv_1= '{' otherlv_2= 'code' ( (lv_code_3_0= RULE_STRING ) ) (otherlv_4= ';' )? otherlv_5= 'correction' ( (lv_correction_6_0= RULE_STRING ) ) (otherlv_7= ';' )? otherlv_8= '}' ) )
            // InternalLibrettoProjectProfile.g:1460:2: (otherlv_0= 'default' otherlv_1= '{' otherlv_2= 'code' ( (lv_code_3_0= RULE_STRING ) ) (otherlv_4= ';' )? otherlv_5= 'correction' ( (lv_correction_6_0= RULE_STRING ) ) (otherlv_7= ';' )? otherlv_8= '}' )
            {
            // InternalLibrettoProjectProfile.g:1460:2: (otherlv_0= 'default' otherlv_1= '{' otherlv_2= 'code' ( (lv_code_3_0= RULE_STRING ) ) (otherlv_4= ';' )? otherlv_5= 'correction' ( (lv_correction_6_0= RULE_STRING ) ) (otherlv_7= ';' )? otherlv_8= '}' )
            // InternalLibrettoProjectProfile.g:1461:3: otherlv_0= 'default' otherlv_1= '{' otherlv_2= 'code' ( (lv_code_3_0= RULE_STRING ) ) (otherlv_4= ';' )? otherlv_5= 'correction' ( (lv_correction_6_0= RULE_STRING ) ) (otherlv_7= ';' )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTestGenDefaultRemediationRuleAccess().getDefaultKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_63); 

            			newLeafNode(otherlv_1, grammarAccess.getTestGenDefaultRemediationRuleAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getTestGenDefaultRemediationRuleAccess().getCodeKeyword_2());
            		
            // InternalLibrettoProjectProfile.g:1473:3: ( (lv_code_3_0= RULE_STRING ) )
            // InternalLibrettoProjectProfile.g:1474:4: (lv_code_3_0= RULE_STRING )
            {
            // InternalLibrettoProjectProfile.g:1474:4: (lv_code_3_0= RULE_STRING )
            // InternalLibrettoProjectProfile.g:1475:5: lv_code_3_0= RULE_STRING
            {
            lv_code_3_0=(Token)match(input,RULE_STRING,FOLLOW_64); 

            					newLeafNode(lv_code_3_0, grammarAccess.getTestGenDefaultRemediationRuleAccess().getCodeSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTestGenDefaultRemediationRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"code",
            						lv_code_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalLibrettoProjectProfile.g:1491:3: (otherlv_4= ';' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==16) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:1492:4: otherlv_4= ';'
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_65); 

                    				newLeafNode(otherlv_4, grammarAccess.getTestGenDefaultRemediationRuleAccess().getSemicolonKeyword_4());
                    			

                    }
                    break;

            }

            otherlv_5=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getTestGenDefaultRemediationRuleAccess().getCorrectionKeyword_5());
            		
            // InternalLibrettoProjectProfile.g:1501:3: ( (lv_correction_6_0= RULE_STRING ) )
            // InternalLibrettoProjectProfile.g:1502:4: (lv_correction_6_0= RULE_STRING )
            {
            // InternalLibrettoProjectProfile.g:1502:4: (lv_correction_6_0= RULE_STRING )
            // InternalLibrettoProjectProfile.g:1503:5: lv_correction_6_0= RULE_STRING
            {
            lv_correction_6_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

            					newLeafNode(lv_correction_6_0, grammarAccess.getTestGenDefaultRemediationRuleAccess().getCorrectionSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTestGenDefaultRemediationRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"correction",
            						lv_correction_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalLibrettoProjectProfile.g:1519:3: (otherlv_7= ';' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==16) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:1520:4: otherlv_7= ';'
                    {
                    otherlv_7=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_7, grammarAccess.getTestGenDefaultRemediationRuleAccess().getSemicolonKeyword_7());
                    			

                    }
                    break;

            }

            otherlv_8=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getTestGenDefaultRemediationRuleAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTestGenDefaultRemediationRule"


    // $ANTLR start "entryRuleTestGenLegacyRemediationRulesBlock"
    // InternalLibrettoProjectProfile.g:1533:1: entryRuleTestGenLegacyRemediationRulesBlock returns [EObject current=null] : iv_ruleTestGenLegacyRemediationRulesBlock= ruleTestGenLegacyRemediationRulesBlock EOF ;
    public final EObject entryRuleTestGenLegacyRemediationRulesBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestGenLegacyRemediationRulesBlock = null;


        try {
            // InternalLibrettoProjectProfile.g:1533:75: (iv_ruleTestGenLegacyRemediationRulesBlock= ruleTestGenLegacyRemediationRulesBlock EOF )
            // InternalLibrettoProjectProfile.g:1534:2: iv_ruleTestGenLegacyRemediationRulesBlock= ruleTestGenLegacyRemediationRulesBlock EOF
            {
             newCompositeNode(grammarAccess.getTestGenLegacyRemediationRulesBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTestGenLegacyRemediationRulesBlock=ruleTestGenLegacyRemediationRulesBlock();

            state._fsp--;

             current =iv_ruleTestGenLegacyRemediationRulesBlock; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTestGenLegacyRemediationRulesBlock"


    // $ANTLR start "ruleTestGenLegacyRemediationRulesBlock"
    // InternalLibrettoProjectProfile.g:1540:1: ruleTestGenLegacyRemediationRulesBlock returns [EObject current=null] : (otherlv_0= 'remediationRules' otherlv_1= '{' ( (lv_rules_2_0= ruleTestGenLegacyRemediationRule ) )* otherlv_3= '}' ) ;
    public final EObject ruleTestGenLegacyRemediationRulesBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_rules_2_0 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:1546:2: ( (otherlv_0= 'remediationRules' otherlv_1= '{' ( (lv_rules_2_0= ruleTestGenLegacyRemediationRule ) )* otherlv_3= '}' ) )
            // InternalLibrettoProjectProfile.g:1547:2: (otherlv_0= 'remediationRules' otherlv_1= '{' ( (lv_rules_2_0= ruleTestGenLegacyRemediationRule ) )* otherlv_3= '}' )
            {
            // InternalLibrettoProjectProfile.g:1547:2: (otherlv_0= 'remediationRules' otherlv_1= '{' ( (lv_rules_2_0= ruleTestGenLegacyRemediationRule ) )* otherlv_3= '}' )
            // InternalLibrettoProjectProfile.g:1548:3: otherlv_0= 'remediationRules' otherlv_1= '{' ( (lv_rules_2_0= ruleTestGenLegacyRemediationRule ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTestGenLegacyRemediationRulesBlockAccess().getRemediationRulesKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_66); 

            			newLeafNode(otherlv_1, grammarAccess.getTestGenLegacyRemediationRulesBlockAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalLibrettoProjectProfile.g:1556:3: ( (lv_rules_2_0= ruleTestGenLegacyRemediationRule ) )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==38) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:1557:4: (lv_rules_2_0= ruleTestGenLegacyRemediationRule )
            	    {
            	    // InternalLibrettoProjectProfile.g:1557:4: (lv_rules_2_0= ruleTestGenLegacyRemediationRule )
            	    // InternalLibrettoProjectProfile.g:1558:5: lv_rules_2_0= ruleTestGenLegacyRemediationRule
            	    {

            	    					newCompositeNode(grammarAccess.getTestGenLegacyRemediationRulesBlockAccess().getRulesTestGenLegacyRemediationRuleParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_66);
            	    lv_rules_2_0=ruleTestGenLegacyRemediationRule();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTestGenLegacyRemediationRulesBlockRule());
            	    					}
            	    					add(
            	    						current,
            	    						"rules",
            	    						lv_rules_2_0,
            	    						"com.robenglander.libretto.spec.LibrettoProjectProfile.TestGenLegacyRemediationRule");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getTestGenLegacyRemediationRulesBlockAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTestGenLegacyRemediationRulesBlock"


    // $ANTLR start "entryRuleTestGenLegacyRemediationRule"
    // InternalLibrettoProjectProfile.g:1583:1: entryRuleTestGenLegacyRemediationRule returns [EObject current=null] : iv_ruleTestGenLegacyRemediationRule= ruleTestGenLegacyRemediationRule EOF ;
    public final EObject entryRuleTestGenLegacyRemediationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestGenLegacyRemediationRule = null;


        try {
            // InternalLibrettoProjectProfile.g:1583:69: (iv_ruleTestGenLegacyRemediationRule= ruleTestGenLegacyRemediationRule EOF )
            // InternalLibrettoProjectProfile.g:1584:2: iv_ruleTestGenLegacyRemediationRule= ruleTestGenLegacyRemediationRule EOF
            {
             newCompositeNode(grammarAccess.getTestGenLegacyRemediationRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTestGenLegacyRemediationRule=ruleTestGenLegacyRemediationRule();

            state._fsp--;

             current =iv_ruleTestGenLegacyRemediationRule; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTestGenLegacyRemediationRule"


    // $ANTLR start "ruleTestGenLegacyRemediationRule"
    // InternalLibrettoProjectProfile.g:1590:1: ruleTestGenLegacyRemediationRule returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_key_1_0= RULE_STRING ) ) otherlv_2= 'instruction' ( (lv_instruction_3_0= RULE_STRING ) ) (otherlv_4= ';' )? ) ;
    public final EObject ruleTestGenLegacyRemediationRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_key_1_0=null;
        Token otherlv_2=null;
        Token lv_instruction_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:1596:2: ( (otherlv_0= 'rule' ( (lv_key_1_0= RULE_STRING ) ) otherlv_2= 'instruction' ( (lv_instruction_3_0= RULE_STRING ) ) (otherlv_4= ';' )? ) )
            // InternalLibrettoProjectProfile.g:1597:2: (otherlv_0= 'rule' ( (lv_key_1_0= RULE_STRING ) ) otherlv_2= 'instruction' ( (lv_instruction_3_0= RULE_STRING ) ) (otherlv_4= ';' )? )
            {
            // InternalLibrettoProjectProfile.g:1597:2: (otherlv_0= 'rule' ( (lv_key_1_0= RULE_STRING ) ) otherlv_2= 'instruction' ( (lv_instruction_3_0= RULE_STRING ) ) (otherlv_4= ';' )? )
            // InternalLibrettoProjectProfile.g:1598:3: otherlv_0= 'rule' ( (lv_key_1_0= RULE_STRING ) ) otherlv_2= 'instruction' ( (lv_instruction_3_0= RULE_STRING ) ) (otherlv_4= ';' )?
            {
            otherlv_0=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTestGenLegacyRemediationRuleAccess().getRuleKeyword_0());
            		
            // InternalLibrettoProjectProfile.g:1602:3: ( (lv_key_1_0= RULE_STRING ) )
            // InternalLibrettoProjectProfile.g:1603:4: (lv_key_1_0= RULE_STRING )
            {
            // InternalLibrettoProjectProfile.g:1603:4: (lv_key_1_0= RULE_STRING )
            // InternalLibrettoProjectProfile.g:1604:5: lv_key_1_0= RULE_STRING
            {
            lv_key_1_0=(Token)match(input,RULE_STRING,FOLLOW_67); 

            					newLeafNode(lv_key_1_0, grammarAccess.getTestGenLegacyRemediationRuleAccess().getKeySTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTestGenLegacyRemediationRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"key",
            						lv_key_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,44,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getTestGenLegacyRemediationRuleAccess().getInstructionKeyword_2());
            		
            // InternalLibrettoProjectProfile.g:1624:3: ( (lv_instruction_3_0= RULE_STRING ) )
            // InternalLibrettoProjectProfile.g:1625:4: (lv_instruction_3_0= RULE_STRING )
            {
            // InternalLibrettoProjectProfile.g:1625:4: (lv_instruction_3_0= RULE_STRING )
            // InternalLibrettoProjectProfile.g:1626:5: lv_instruction_3_0= RULE_STRING
            {
            lv_instruction_3_0=(Token)match(input,RULE_STRING,FOLLOW_68); 

            					newLeafNode(lv_instruction_3_0, grammarAccess.getTestGenLegacyRemediationRuleAccess().getInstructionSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTestGenLegacyRemediationRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"instruction",
            						lv_instruction_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalLibrettoProjectProfile.g:1642:3: (otherlv_4= ';' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==16) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:1643:4: otherlv_4= ';'
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getTestGenLegacyRemediationRuleAccess().getSemicolonKeyword_4());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTestGenLegacyRemediationRule"


    // $ANTLR start "entryRuleLlmProvidersBlock"
    // InternalLibrettoProjectProfile.g:1652:1: entryRuleLlmProvidersBlock returns [EObject current=null] : iv_ruleLlmProvidersBlock= ruleLlmProvidersBlock EOF ;
    public final EObject entryRuleLlmProvidersBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLlmProvidersBlock = null;


        try {
            // InternalLibrettoProjectProfile.g:1652:58: (iv_ruleLlmProvidersBlock= ruleLlmProvidersBlock EOF )
            // InternalLibrettoProjectProfile.g:1653:2: iv_ruleLlmProvidersBlock= ruleLlmProvidersBlock EOF
            {
             newCompositeNode(grammarAccess.getLlmProvidersBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLlmProvidersBlock=ruleLlmProvidersBlock();

            state._fsp--;

             current =iv_ruleLlmProvidersBlock; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLlmProvidersBlock"


    // $ANTLR start "ruleLlmProvidersBlock"
    // InternalLibrettoProjectProfile.g:1659:1: ruleLlmProvidersBlock returns [EObject current=null] : (otherlv_0= 'llmProviders' otherlv_1= '{' ( (lv_providers_2_0= ruleNamedLlmProvider ) )* otherlv_3= '}' ) ;
    public final EObject ruleLlmProvidersBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_providers_2_0 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:1665:2: ( (otherlv_0= 'llmProviders' otherlv_1= '{' ( (lv_providers_2_0= ruleNamedLlmProvider ) )* otherlv_3= '}' ) )
            // InternalLibrettoProjectProfile.g:1666:2: (otherlv_0= 'llmProviders' otherlv_1= '{' ( (lv_providers_2_0= ruleNamedLlmProvider ) )* otherlv_3= '}' )
            {
            // InternalLibrettoProjectProfile.g:1666:2: (otherlv_0= 'llmProviders' otherlv_1= '{' ( (lv_providers_2_0= ruleNamedLlmProvider ) )* otherlv_3= '}' )
            // InternalLibrettoProjectProfile.g:1667:3: otherlv_0= 'llmProviders' otherlv_1= '{' ( (lv_providers_2_0= ruleNamedLlmProvider ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLlmProvidersBlockAccess().getLlmProvidersKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_69); 

            			newLeafNode(otherlv_1, grammarAccess.getLlmProvidersBlockAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalLibrettoProjectProfile.g:1675:3: ( (lv_providers_2_0= ruleNamedLlmProvider ) )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==46) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:1676:4: (lv_providers_2_0= ruleNamedLlmProvider )
            	    {
            	    // InternalLibrettoProjectProfile.g:1676:4: (lv_providers_2_0= ruleNamedLlmProvider )
            	    // InternalLibrettoProjectProfile.g:1677:5: lv_providers_2_0= ruleNamedLlmProvider
            	    {

            	    					newCompositeNode(grammarAccess.getLlmProvidersBlockAccess().getProvidersNamedLlmProviderParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_69);
            	    lv_providers_2_0=ruleNamedLlmProvider();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLlmProvidersBlockRule());
            	    					}
            	    					add(
            	    						current,
            	    						"providers",
            	    						lv_providers_2_0,
            	    						"com.robenglander.libretto.spec.LibrettoProjectProfile.NamedLlmProvider");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getLlmProvidersBlockAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLlmProvidersBlock"


    // $ANTLR start "entryRuleNamedLlmProvider"
    // InternalLibrettoProjectProfile.g:1702:1: entryRuleNamedLlmProvider returns [EObject current=null] : iv_ruleNamedLlmProvider= ruleNamedLlmProvider EOF ;
    public final EObject entryRuleNamedLlmProvider() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedLlmProvider = null;


        try {
            // InternalLibrettoProjectProfile.g:1702:57: (iv_ruleNamedLlmProvider= ruleNamedLlmProvider EOF )
            // InternalLibrettoProjectProfile.g:1703:2: iv_ruleNamedLlmProvider= ruleNamedLlmProvider EOF
            {
             newCompositeNode(grammarAccess.getNamedLlmProviderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNamedLlmProvider=ruleNamedLlmProvider();

            state._fsp--;

             current =iv_ruleNamedLlmProvider; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNamedLlmProvider"


    // $ANTLR start "ruleNamedLlmProvider"
    // InternalLibrettoProjectProfile.g:1709:1: ruleNamedLlmProvider returns [EObject current=null] : (otherlv_0= 'provider' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'kind' ( ( (lv_kind_4_1= 'local' | lv_kind_4_2= 'openai' | lv_kind_4_3= 'ollama' ) ) ) (otherlv_5= ';' )? (otherlv_6= 'localModelPath' ( (lv_localModelPath_7_0= RULE_STRING ) ) (otherlv_8= ';' )? )? (otherlv_9= 'model' ( (lv_model_10_0= RULE_STRING ) ) (otherlv_11= ';' )? )? (otherlv_12= 'endpoint' ( (lv_endpoint_13_0= RULE_STRING ) ) (otherlv_14= ';' )? )? otherlv_15= '}' ) ;
    public final EObject ruleNamedLlmProvider() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_kind_4_1=null;
        Token lv_kind_4_2=null;
        Token lv_kind_4_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_localModelPath_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_model_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_endpoint_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;


        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:1715:2: ( (otherlv_0= 'provider' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'kind' ( ( (lv_kind_4_1= 'local' | lv_kind_4_2= 'openai' | lv_kind_4_3= 'ollama' ) ) ) (otherlv_5= ';' )? (otherlv_6= 'localModelPath' ( (lv_localModelPath_7_0= RULE_STRING ) ) (otherlv_8= ';' )? )? (otherlv_9= 'model' ( (lv_model_10_0= RULE_STRING ) ) (otherlv_11= ';' )? )? (otherlv_12= 'endpoint' ( (lv_endpoint_13_0= RULE_STRING ) ) (otherlv_14= ';' )? )? otherlv_15= '}' ) )
            // InternalLibrettoProjectProfile.g:1716:2: (otherlv_0= 'provider' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'kind' ( ( (lv_kind_4_1= 'local' | lv_kind_4_2= 'openai' | lv_kind_4_3= 'ollama' ) ) ) (otherlv_5= ';' )? (otherlv_6= 'localModelPath' ( (lv_localModelPath_7_0= RULE_STRING ) ) (otherlv_8= ';' )? )? (otherlv_9= 'model' ( (lv_model_10_0= RULE_STRING ) ) (otherlv_11= ';' )? )? (otherlv_12= 'endpoint' ( (lv_endpoint_13_0= RULE_STRING ) ) (otherlv_14= ';' )? )? otherlv_15= '}' )
            {
            // InternalLibrettoProjectProfile.g:1716:2: (otherlv_0= 'provider' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'kind' ( ( (lv_kind_4_1= 'local' | lv_kind_4_2= 'openai' | lv_kind_4_3= 'ollama' ) ) ) (otherlv_5= ';' )? (otherlv_6= 'localModelPath' ( (lv_localModelPath_7_0= RULE_STRING ) ) (otherlv_8= ';' )? )? (otherlv_9= 'model' ( (lv_model_10_0= RULE_STRING ) ) (otherlv_11= ';' )? )? (otherlv_12= 'endpoint' ( (lv_endpoint_13_0= RULE_STRING ) ) (otherlv_14= ';' )? )? otherlv_15= '}' )
            // InternalLibrettoProjectProfile.g:1717:3: otherlv_0= 'provider' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'kind' ( ( (lv_kind_4_1= 'local' | lv_kind_4_2= 'openai' | lv_kind_4_3= 'ollama' ) ) ) (otherlv_5= ';' )? (otherlv_6= 'localModelPath' ( (lv_localModelPath_7_0= RULE_STRING ) ) (otherlv_8= ';' )? )? (otherlv_9= 'model' ( (lv_model_10_0= RULE_STRING ) ) (otherlv_11= ';' )? )? (otherlv_12= 'endpoint' ( (lv_endpoint_13_0= RULE_STRING ) ) (otherlv_14= ';' )? )? otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getNamedLlmProviderAccess().getProviderKeyword_0());
            		
            // InternalLibrettoProjectProfile.g:1721:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalLibrettoProjectProfile.g:1722:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalLibrettoProjectProfile.g:1722:4: (lv_name_1_0= RULE_STRING )
            // InternalLibrettoProjectProfile.g:1723:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getNamedLlmProviderAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNamedLlmProviderRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_70); 

            			newLeafNode(otherlv_2, grammarAccess.getNamedLlmProviderAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,47,FOLLOW_71); 

            			newLeafNode(otherlv_3, grammarAccess.getNamedLlmProviderAccess().getKindKeyword_3());
            		
            // InternalLibrettoProjectProfile.g:1747:3: ( ( (lv_kind_4_1= 'local' | lv_kind_4_2= 'openai' | lv_kind_4_3= 'ollama' ) ) )
            // InternalLibrettoProjectProfile.g:1748:4: ( (lv_kind_4_1= 'local' | lv_kind_4_2= 'openai' | lv_kind_4_3= 'ollama' ) )
            {
            // InternalLibrettoProjectProfile.g:1748:4: ( (lv_kind_4_1= 'local' | lv_kind_4_2= 'openai' | lv_kind_4_3= 'ollama' ) )
            // InternalLibrettoProjectProfile.g:1749:5: (lv_kind_4_1= 'local' | lv_kind_4_2= 'openai' | lv_kind_4_3= 'ollama' )
            {
            // InternalLibrettoProjectProfile.g:1749:5: (lv_kind_4_1= 'local' | lv_kind_4_2= 'openai' | lv_kind_4_3= 'ollama' )
            int alt66=3;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt66=1;
                }
                break;
            case 49:
                {
                alt66=2;
                }
                break;
            case 50:
                {
                alt66=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }

            switch (alt66) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:1750:6: lv_kind_4_1= 'local'
                    {
                    lv_kind_4_1=(Token)match(input,48,FOLLOW_72); 

                    						newLeafNode(lv_kind_4_1, grammarAccess.getNamedLlmProviderAccess().getKindLocalKeyword_4_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNamedLlmProviderRule());
                    						}
                    						setWithLastConsumed(current, "kind", lv_kind_4_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalLibrettoProjectProfile.g:1761:6: lv_kind_4_2= 'openai'
                    {
                    lv_kind_4_2=(Token)match(input,49,FOLLOW_72); 

                    						newLeafNode(lv_kind_4_2, grammarAccess.getNamedLlmProviderAccess().getKindOpenaiKeyword_4_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNamedLlmProviderRule());
                    						}
                    						setWithLastConsumed(current, "kind", lv_kind_4_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalLibrettoProjectProfile.g:1772:6: lv_kind_4_3= 'ollama'
                    {
                    lv_kind_4_3=(Token)match(input,50,FOLLOW_72); 

                    						newLeafNode(lv_kind_4_3, grammarAccess.getNamedLlmProviderAccess().getKindOllamaKeyword_4_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNamedLlmProviderRule());
                    						}
                    						setWithLastConsumed(current, "kind", lv_kind_4_3, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalLibrettoProjectProfile.g:1785:3: (otherlv_5= ';' )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==16) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:1786:4: otherlv_5= ';'
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_73); 

                    				newLeafNode(otherlv_5, grammarAccess.getNamedLlmProviderAccess().getSemicolonKeyword_5());
                    			

                    }
                    break;

            }

            // InternalLibrettoProjectProfile.g:1791:3: (otherlv_6= 'localModelPath' ( (lv_localModelPath_7_0= RULE_STRING ) ) (otherlv_8= ';' )? )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==51) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:1792:4: otherlv_6= 'localModelPath' ( (lv_localModelPath_7_0= RULE_STRING ) ) (otherlv_8= ';' )?
                    {
                    otherlv_6=(Token)match(input,51,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getNamedLlmProviderAccess().getLocalModelPathKeyword_6_0());
                    			
                    // InternalLibrettoProjectProfile.g:1796:4: ( (lv_localModelPath_7_0= RULE_STRING ) )
                    // InternalLibrettoProjectProfile.g:1797:5: (lv_localModelPath_7_0= RULE_STRING )
                    {
                    // InternalLibrettoProjectProfile.g:1797:5: (lv_localModelPath_7_0= RULE_STRING )
                    // InternalLibrettoProjectProfile.g:1798:6: lv_localModelPath_7_0= RULE_STRING
                    {
                    lv_localModelPath_7_0=(Token)match(input,RULE_STRING,FOLLOW_74); 

                    						newLeafNode(lv_localModelPath_7_0, grammarAccess.getNamedLlmProviderAccess().getLocalModelPathSTRINGTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNamedLlmProviderRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"localModelPath",
                    							lv_localModelPath_7_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalLibrettoProjectProfile.g:1814:4: (otherlv_8= ';' )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==16) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // InternalLibrettoProjectProfile.g:1815:5: otherlv_8= ';'
                            {
                            otherlv_8=(Token)match(input,16,FOLLOW_75); 

                            					newLeafNode(otherlv_8, grammarAccess.getNamedLlmProviderAccess().getSemicolonKeyword_6_2());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalLibrettoProjectProfile.g:1821:3: (otherlv_9= 'model' ( (lv_model_10_0= RULE_STRING ) ) (otherlv_11= ';' )? )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==52) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:1822:4: otherlv_9= 'model' ( (lv_model_10_0= RULE_STRING ) ) (otherlv_11= ';' )?
                    {
                    otherlv_9=(Token)match(input,52,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getNamedLlmProviderAccess().getModelKeyword_7_0());
                    			
                    // InternalLibrettoProjectProfile.g:1826:4: ( (lv_model_10_0= RULE_STRING ) )
                    // InternalLibrettoProjectProfile.g:1827:5: (lv_model_10_0= RULE_STRING )
                    {
                    // InternalLibrettoProjectProfile.g:1827:5: (lv_model_10_0= RULE_STRING )
                    // InternalLibrettoProjectProfile.g:1828:6: lv_model_10_0= RULE_STRING
                    {
                    lv_model_10_0=(Token)match(input,RULE_STRING,FOLLOW_76); 

                    						newLeafNode(lv_model_10_0, grammarAccess.getNamedLlmProviderAccess().getModelSTRINGTerminalRuleCall_7_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNamedLlmProviderRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"model",
                    							lv_model_10_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalLibrettoProjectProfile.g:1844:4: (otherlv_11= ';' )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==16) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // InternalLibrettoProjectProfile.g:1845:5: otherlv_11= ';'
                            {
                            otherlv_11=(Token)match(input,16,FOLLOW_77); 

                            					newLeafNode(otherlv_11, grammarAccess.getNamedLlmProviderAccess().getSemicolonKeyword_7_2());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalLibrettoProjectProfile.g:1851:3: (otherlv_12= 'endpoint' ( (lv_endpoint_13_0= RULE_STRING ) ) (otherlv_14= ';' )? )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==53) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:1852:4: otherlv_12= 'endpoint' ( (lv_endpoint_13_0= RULE_STRING ) ) (otherlv_14= ';' )?
                    {
                    otherlv_12=(Token)match(input,53,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getNamedLlmProviderAccess().getEndpointKeyword_8_0());
                    			
                    // InternalLibrettoProjectProfile.g:1856:4: ( (lv_endpoint_13_0= RULE_STRING ) )
                    // InternalLibrettoProjectProfile.g:1857:5: (lv_endpoint_13_0= RULE_STRING )
                    {
                    // InternalLibrettoProjectProfile.g:1857:5: (lv_endpoint_13_0= RULE_STRING )
                    // InternalLibrettoProjectProfile.g:1858:6: lv_endpoint_13_0= RULE_STRING
                    {
                    lv_endpoint_13_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

                    						newLeafNode(lv_endpoint_13_0, grammarAccess.getNamedLlmProviderAccess().getEndpointSTRINGTerminalRuleCall_8_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNamedLlmProviderRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"endpoint",
                    							lv_endpoint_13_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalLibrettoProjectProfile.g:1874:4: (otherlv_14= ';' )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==16) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // InternalLibrettoProjectProfile.g:1875:5: otherlv_14= ';'
                            {
                            otherlv_14=(Token)match(input,16,FOLLOW_8); 

                            					newLeafNode(otherlv_14, grammarAccess.getNamedLlmProviderAccess().getSemicolonKeyword_8_2());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getNamedLlmProviderAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNamedLlmProvider"


    // $ANTLR start "entryRuleTestGenUsageBlock"
    // InternalLibrettoProjectProfile.g:1889:1: entryRuleTestGenUsageBlock returns [EObject current=null] : iv_ruleTestGenUsageBlock= ruleTestGenUsageBlock EOF ;
    public final EObject entryRuleTestGenUsageBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestGenUsageBlock = null;


        try {
            // InternalLibrettoProjectProfile.g:1889:58: (iv_ruleTestGenUsageBlock= ruleTestGenUsageBlock EOF )
            // InternalLibrettoProjectProfile.g:1890:2: iv_ruleTestGenUsageBlock= ruleTestGenUsageBlock EOF
            {
             newCompositeNode(grammarAccess.getTestGenUsageBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTestGenUsageBlock=ruleTestGenUsageBlock();

            state._fsp--;

             current =iv_ruleTestGenUsageBlock; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTestGenUsageBlock"


    // $ANTLR start "ruleTestGenUsageBlock"
    // InternalLibrettoProjectProfile.g:1896:1: ruleTestGenUsageBlock returns [EObject current=null] : (otherlv_0= 'usage' otherlv_1= '{' (otherlv_2= 'primary' ( (lv_primaryProvider_3_0= RULE_STRING ) ) (otherlv_4= ';' )? )? (otherlv_5= 'secondary' ( (lv_secondaryProvider_6_0= RULE_STRING ) ) (otherlv_7= ';' )? )? ( (lv_escalation_8_0= ruleTestGenEscalationBlock ) )? otherlv_9= '}' ) ;
    public final EObject ruleTestGenUsageBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_primaryProvider_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_secondaryProvider_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_escalation_8_0 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:1902:2: ( (otherlv_0= 'usage' otherlv_1= '{' (otherlv_2= 'primary' ( (lv_primaryProvider_3_0= RULE_STRING ) ) (otherlv_4= ';' )? )? (otherlv_5= 'secondary' ( (lv_secondaryProvider_6_0= RULE_STRING ) ) (otherlv_7= ';' )? )? ( (lv_escalation_8_0= ruleTestGenEscalationBlock ) )? otherlv_9= '}' ) )
            // InternalLibrettoProjectProfile.g:1903:2: (otherlv_0= 'usage' otherlv_1= '{' (otherlv_2= 'primary' ( (lv_primaryProvider_3_0= RULE_STRING ) ) (otherlv_4= ';' )? )? (otherlv_5= 'secondary' ( (lv_secondaryProvider_6_0= RULE_STRING ) ) (otherlv_7= ';' )? )? ( (lv_escalation_8_0= ruleTestGenEscalationBlock ) )? otherlv_9= '}' )
            {
            // InternalLibrettoProjectProfile.g:1903:2: (otherlv_0= 'usage' otherlv_1= '{' (otherlv_2= 'primary' ( (lv_primaryProvider_3_0= RULE_STRING ) ) (otherlv_4= ';' )? )? (otherlv_5= 'secondary' ( (lv_secondaryProvider_6_0= RULE_STRING ) ) (otherlv_7= ';' )? )? ( (lv_escalation_8_0= ruleTestGenEscalationBlock ) )? otherlv_9= '}' )
            // InternalLibrettoProjectProfile.g:1904:3: otherlv_0= 'usage' otherlv_1= '{' (otherlv_2= 'primary' ( (lv_primaryProvider_3_0= RULE_STRING ) ) (otherlv_4= ';' )? )? (otherlv_5= 'secondary' ( (lv_secondaryProvider_6_0= RULE_STRING ) ) (otherlv_7= ';' )? )? ( (lv_escalation_8_0= ruleTestGenEscalationBlock ) )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTestGenUsageBlockAccess().getUsageKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_78); 

            			newLeafNode(otherlv_1, grammarAccess.getTestGenUsageBlockAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalLibrettoProjectProfile.g:1912:3: (otherlv_2= 'primary' ( (lv_primaryProvider_3_0= RULE_STRING ) ) (otherlv_4= ';' )? )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==55) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:1913:4: otherlv_2= 'primary' ( (lv_primaryProvider_3_0= RULE_STRING ) ) (otherlv_4= ';' )?
                    {
                    otherlv_2=(Token)match(input,55,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getTestGenUsageBlockAccess().getPrimaryKeyword_2_0());
                    			
                    // InternalLibrettoProjectProfile.g:1917:4: ( (lv_primaryProvider_3_0= RULE_STRING ) )
                    // InternalLibrettoProjectProfile.g:1918:5: (lv_primaryProvider_3_0= RULE_STRING )
                    {
                    // InternalLibrettoProjectProfile.g:1918:5: (lv_primaryProvider_3_0= RULE_STRING )
                    // InternalLibrettoProjectProfile.g:1919:6: lv_primaryProvider_3_0= RULE_STRING
                    {
                    lv_primaryProvider_3_0=(Token)match(input,RULE_STRING,FOLLOW_79); 

                    						newLeafNode(lv_primaryProvider_3_0, grammarAccess.getTestGenUsageBlockAccess().getPrimaryProviderSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTestGenUsageBlockRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"primaryProvider",
                    							lv_primaryProvider_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalLibrettoProjectProfile.g:1935:4: (otherlv_4= ';' )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==16) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // InternalLibrettoProjectProfile.g:1936:5: otherlv_4= ';'
                            {
                            otherlv_4=(Token)match(input,16,FOLLOW_80); 

                            					newLeafNode(otherlv_4, grammarAccess.getTestGenUsageBlockAccess().getSemicolonKeyword_2_2());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalLibrettoProjectProfile.g:1942:3: (otherlv_5= 'secondary' ( (lv_secondaryProvider_6_0= RULE_STRING ) ) (otherlv_7= ';' )? )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==56) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:1943:4: otherlv_5= 'secondary' ( (lv_secondaryProvider_6_0= RULE_STRING ) ) (otherlv_7= ';' )?
                    {
                    otherlv_5=(Token)match(input,56,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getTestGenUsageBlockAccess().getSecondaryKeyword_3_0());
                    			
                    // InternalLibrettoProjectProfile.g:1947:4: ( (lv_secondaryProvider_6_0= RULE_STRING ) )
                    // InternalLibrettoProjectProfile.g:1948:5: (lv_secondaryProvider_6_0= RULE_STRING )
                    {
                    // InternalLibrettoProjectProfile.g:1948:5: (lv_secondaryProvider_6_0= RULE_STRING )
                    // InternalLibrettoProjectProfile.g:1949:6: lv_secondaryProvider_6_0= RULE_STRING
                    {
                    lv_secondaryProvider_6_0=(Token)match(input,RULE_STRING,FOLLOW_81); 

                    						newLeafNode(lv_secondaryProvider_6_0, grammarAccess.getTestGenUsageBlockAccess().getSecondaryProviderSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTestGenUsageBlockRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"secondaryProvider",
                    							lv_secondaryProvider_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalLibrettoProjectProfile.g:1965:4: (otherlv_7= ';' )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==16) ) {
                        alt76=1;
                    }
                    switch (alt76) {
                        case 1 :
                            // InternalLibrettoProjectProfile.g:1966:5: otherlv_7= ';'
                            {
                            otherlv_7=(Token)match(input,16,FOLLOW_82); 

                            					newLeafNode(otherlv_7, grammarAccess.getTestGenUsageBlockAccess().getSemicolonKeyword_3_2());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalLibrettoProjectProfile.g:1972:3: ( (lv_escalation_8_0= ruleTestGenEscalationBlock ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==57) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:1973:4: (lv_escalation_8_0= ruleTestGenEscalationBlock )
                    {
                    // InternalLibrettoProjectProfile.g:1973:4: (lv_escalation_8_0= ruleTestGenEscalationBlock )
                    // InternalLibrettoProjectProfile.g:1974:5: lv_escalation_8_0= ruleTestGenEscalationBlock
                    {

                    					newCompositeNode(grammarAccess.getTestGenUsageBlockAccess().getEscalationTestGenEscalationBlockParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_8);
                    lv_escalation_8_0=ruleTestGenEscalationBlock();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTestGenUsageBlockRule());
                    					}
                    					set(
                    						current,
                    						"escalation",
                    						lv_escalation_8_0,
                    						"com.robenglander.libretto.spec.LibrettoProjectProfile.TestGenEscalationBlock");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getTestGenUsageBlockAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTestGenUsageBlock"


    // $ANTLR start "entryRuleTestGenEscalationBlock"
    // InternalLibrettoProjectProfile.g:1999:1: entryRuleTestGenEscalationBlock returns [EObject current=null] : iv_ruleTestGenEscalationBlock= ruleTestGenEscalationBlock EOF ;
    public final EObject entryRuleTestGenEscalationBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestGenEscalationBlock = null;


        try {
            // InternalLibrettoProjectProfile.g:1999:63: (iv_ruleTestGenEscalationBlock= ruleTestGenEscalationBlock EOF )
            // InternalLibrettoProjectProfile.g:2000:2: iv_ruleTestGenEscalationBlock= ruleTestGenEscalationBlock EOF
            {
             newCompositeNode(grammarAccess.getTestGenEscalationBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTestGenEscalationBlock=ruleTestGenEscalationBlock();

            state._fsp--;

             current =iv_ruleTestGenEscalationBlock; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTestGenEscalationBlock"


    // $ANTLR start "ruleTestGenEscalationBlock"
    // InternalLibrettoProjectProfile.g:2006:1: ruleTestGenEscalationBlock returns [EObject current=null] : (otherlv_0= 'escalation' otherlv_1= '{' (otherlv_2= 'enabled' ( ( (lv_enabled_3_1= 'true' | lv_enabled_3_2= 'false' ) ) ) (otherlv_4= ';' )? )? (otherlv_5= 'escalateAtRetry' ( (lv_escalateAtRetry_6_0= RULE_INT ) ) (otherlv_7= ';' )? )? (otherlv_8= 'target' ( (lv_target_9_0= 'secondary' ) ) (otherlv_10= ';' )? )? otherlv_11= '}' ) ;
    public final EObject ruleTestGenEscalationBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_enabled_3_1=null;
        Token lv_enabled_3_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_escalateAtRetry_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_target_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;


        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:2012:2: ( (otherlv_0= 'escalation' otherlv_1= '{' (otherlv_2= 'enabled' ( ( (lv_enabled_3_1= 'true' | lv_enabled_3_2= 'false' ) ) ) (otherlv_4= ';' )? )? (otherlv_5= 'escalateAtRetry' ( (lv_escalateAtRetry_6_0= RULE_INT ) ) (otherlv_7= ';' )? )? (otherlv_8= 'target' ( (lv_target_9_0= 'secondary' ) ) (otherlv_10= ';' )? )? otherlv_11= '}' ) )
            // InternalLibrettoProjectProfile.g:2013:2: (otherlv_0= 'escalation' otherlv_1= '{' (otherlv_2= 'enabled' ( ( (lv_enabled_3_1= 'true' | lv_enabled_3_2= 'false' ) ) ) (otherlv_4= ';' )? )? (otherlv_5= 'escalateAtRetry' ( (lv_escalateAtRetry_6_0= RULE_INT ) ) (otherlv_7= ';' )? )? (otherlv_8= 'target' ( (lv_target_9_0= 'secondary' ) ) (otherlv_10= ';' )? )? otherlv_11= '}' )
            {
            // InternalLibrettoProjectProfile.g:2013:2: (otherlv_0= 'escalation' otherlv_1= '{' (otherlv_2= 'enabled' ( ( (lv_enabled_3_1= 'true' | lv_enabled_3_2= 'false' ) ) ) (otherlv_4= ';' )? )? (otherlv_5= 'escalateAtRetry' ( (lv_escalateAtRetry_6_0= RULE_INT ) ) (otherlv_7= ';' )? )? (otherlv_8= 'target' ( (lv_target_9_0= 'secondary' ) ) (otherlv_10= ';' )? )? otherlv_11= '}' )
            // InternalLibrettoProjectProfile.g:2014:3: otherlv_0= 'escalation' otherlv_1= '{' (otherlv_2= 'enabled' ( ( (lv_enabled_3_1= 'true' | lv_enabled_3_2= 'false' ) ) ) (otherlv_4= ';' )? )? (otherlv_5= 'escalateAtRetry' ( (lv_escalateAtRetry_6_0= RULE_INT ) ) (otherlv_7= ';' )? )? (otherlv_8= 'target' ( (lv_target_9_0= 'secondary' ) ) (otherlv_10= ';' )? )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTestGenEscalationBlockAccess().getEscalationKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_83); 

            			newLeafNode(otherlv_1, grammarAccess.getTestGenEscalationBlockAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalLibrettoProjectProfile.g:2022:3: (otherlv_2= 'enabled' ( ( (lv_enabled_3_1= 'true' | lv_enabled_3_2= 'false' ) ) ) (otherlv_4= ';' )? )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==58) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:2023:4: otherlv_2= 'enabled' ( ( (lv_enabled_3_1= 'true' | lv_enabled_3_2= 'false' ) ) ) (otherlv_4= ';' )?
                    {
                    otherlv_2=(Token)match(input,58,FOLLOW_34); 

                    				newLeafNode(otherlv_2, grammarAccess.getTestGenEscalationBlockAccess().getEnabledKeyword_2_0());
                    			
                    // InternalLibrettoProjectProfile.g:2027:4: ( ( (lv_enabled_3_1= 'true' | lv_enabled_3_2= 'false' ) ) )
                    // InternalLibrettoProjectProfile.g:2028:5: ( (lv_enabled_3_1= 'true' | lv_enabled_3_2= 'false' ) )
                    {
                    // InternalLibrettoProjectProfile.g:2028:5: ( (lv_enabled_3_1= 'true' | lv_enabled_3_2= 'false' ) )
                    // InternalLibrettoProjectProfile.g:2029:6: (lv_enabled_3_1= 'true' | lv_enabled_3_2= 'false' )
                    {
                    // InternalLibrettoProjectProfile.g:2029:6: (lv_enabled_3_1= 'true' | lv_enabled_3_2= 'false' )
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==32) ) {
                        alt79=1;
                    }
                    else if ( (LA79_0==33) ) {
                        alt79=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 79, 0, input);

                        throw nvae;
                    }
                    switch (alt79) {
                        case 1 :
                            // InternalLibrettoProjectProfile.g:2030:7: lv_enabled_3_1= 'true'
                            {
                            lv_enabled_3_1=(Token)match(input,32,FOLLOW_84); 

                            							newLeafNode(lv_enabled_3_1, grammarAccess.getTestGenEscalationBlockAccess().getEnabledTrueKeyword_2_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getTestGenEscalationBlockRule());
                            							}
                            							setWithLastConsumed(current, "enabled", lv_enabled_3_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalLibrettoProjectProfile.g:2041:7: lv_enabled_3_2= 'false'
                            {
                            lv_enabled_3_2=(Token)match(input,33,FOLLOW_84); 

                            							newLeafNode(lv_enabled_3_2, grammarAccess.getTestGenEscalationBlockAccess().getEnabledFalseKeyword_2_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getTestGenEscalationBlockRule());
                            							}
                            							setWithLastConsumed(current, "enabled", lv_enabled_3_2, null);
                            						

                            }
                            break;

                    }


                    }


                    }

                    // InternalLibrettoProjectProfile.g:2054:4: (otherlv_4= ';' )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==16) ) {
                        alt80=1;
                    }
                    switch (alt80) {
                        case 1 :
                            // InternalLibrettoProjectProfile.g:2055:5: otherlv_4= ';'
                            {
                            otherlv_4=(Token)match(input,16,FOLLOW_85); 

                            					newLeafNode(otherlv_4, grammarAccess.getTestGenEscalationBlockAccess().getSemicolonKeyword_2_2());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalLibrettoProjectProfile.g:2061:3: (otherlv_5= 'escalateAtRetry' ( (lv_escalateAtRetry_6_0= RULE_INT ) ) (otherlv_7= ';' )? )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==59) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:2062:4: otherlv_5= 'escalateAtRetry' ( (lv_escalateAtRetry_6_0= RULE_INT ) ) (otherlv_7= ';' )?
                    {
                    otherlv_5=(Token)match(input,59,FOLLOW_31); 

                    				newLeafNode(otherlv_5, grammarAccess.getTestGenEscalationBlockAccess().getEscalateAtRetryKeyword_3_0());
                    			
                    // InternalLibrettoProjectProfile.g:2066:4: ( (lv_escalateAtRetry_6_0= RULE_INT ) )
                    // InternalLibrettoProjectProfile.g:2067:5: (lv_escalateAtRetry_6_0= RULE_INT )
                    {
                    // InternalLibrettoProjectProfile.g:2067:5: (lv_escalateAtRetry_6_0= RULE_INT )
                    // InternalLibrettoProjectProfile.g:2068:6: lv_escalateAtRetry_6_0= RULE_INT
                    {
                    lv_escalateAtRetry_6_0=(Token)match(input,RULE_INT,FOLLOW_86); 

                    						newLeafNode(lv_escalateAtRetry_6_0, grammarAccess.getTestGenEscalationBlockAccess().getEscalateAtRetryINTTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTestGenEscalationBlockRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"escalateAtRetry",
                    							lv_escalateAtRetry_6_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalLibrettoProjectProfile.g:2084:4: (otherlv_7= ';' )?
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==16) ) {
                        alt82=1;
                    }
                    switch (alt82) {
                        case 1 :
                            // InternalLibrettoProjectProfile.g:2085:5: otherlv_7= ';'
                            {
                            otherlv_7=(Token)match(input,16,FOLLOW_87); 

                            					newLeafNode(otherlv_7, grammarAccess.getTestGenEscalationBlockAccess().getSemicolonKeyword_3_2());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalLibrettoProjectProfile.g:2091:3: (otherlv_8= 'target' ( (lv_target_9_0= 'secondary' ) ) (otherlv_10= ';' )? )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==60) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:2092:4: otherlv_8= 'target' ( (lv_target_9_0= 'secondary' ) ) (otherlv_10= ';' )?
                    {
                    otherlv_8=(Token)match(input,60,FOLLOW_88); 

                    				newLeafNode(otherlv_8, grammarAccess.getTestGenEscalationBlockAccess().getTargetKeyword_4_0());
                    			
                    // InternalLibrettoProjectProfile.g:2096:4: ( (lv_target_9_0= 'secondary' ) )
                    // InternalLibrettoProjectProfile.g:2097:5: (lv_target_9_0= 'secondary' )
                    {
                    // InternalLibrettoProjectProfile.g:2097:5: (lv_target_9_0= 'secondary' )
                    // InternalLibrettoProjectProfile.g:2098:6: lv_target_9_0= 'secondary'
                    {
                    lv_target_9_0=(Token)match(input,56,FOLLOW_23); 

                    						newLeafNode(lv_target_9_0, grammarAccess.getTestGenEscalationBlockAccess().getTargetSecondaryKeyword_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTestGenEscalationBlockRule());
                    						}
                    						setWithLastConsumed(current, "target", lv_target_9_0, "secondary");
                    					

                    }


                    }

                    // InternalLibrettoProjectProfile.g:2110:4: (otherlv_10= ';' )?
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==16) ) {
                        alt84=1;
                    }
                    switch (alt84) {
                        case 1 :
                            // InternalLibrettoProjectProfile.g:2111:5: otherlv_10= ';'
                            {
                            otherlv_10=(Token)match(input,16,FOLLOW_8); 

                            					newLeafNode(otherlv_10, grammarAccess.getTestGenEscalationBlockAccess().getSemicolonKeyword_4_2());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getTestGenEscalationBlockAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTestGenEscalationBlock"


    // $ANTLR start "entryRuleSurfaceBlock"
    // InternalLibrettoProjectProfile.g:2125:1: entryRuleSurfaceBlock returns [EObject current=null] : iv_ruleSurfaceBlock= ruleSurfaceBlock EOF ;
    public final EObject entryRuleSurfaceBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSurfaceBlock = null;


        try {
            // InternalLibrettoProjectProfile.g:2125:53: (iv_ruleSurfaceBlock= ruleSurfaceBlock EOF )
            // InternalLibrettoProjectProfile.g:2126:2: iv_ruleSurfaceBlock= ruleSurfaceBlock EOF
            {
             newCompositeNode(grammarAccess.getSurfaceBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSurfaceBlock=ruleSurfaceBlock();

            state._fsp--;

             current =iv_ruleSurfaceBlock; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSurfaceBlock"


    // $ANTLR start "ruleSurfaceBlock"
    // InternalLibrettoProjectProfile.g:2132:1: ruleSurfaceBlock returns [EObject current=null] : (otherlv_0= 'surface' otherlv_1= '{' ( (lv_elements_2_0= ruleSurfaceElement ) )* otherlv_3= '}' ) ;
    public final EObject ruleSurfaceBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:2138:2: ( (otherlv_0= 'surface' otherlv_1= '{' ( (lv_elements_2_0= ruleSurfaceElement ) )* otherlv_3= '}' ) )
            // InternalLibrettoProjectProfile.g:2139:2: (otherlv_0= 'surface' otherlv_1= '{' ( (lv_elements_2_0= ruleSurfaceElement ) )* otherlv_3= '}' )
            {
            // InternalLibrettoProjectProfile.g:2139:2: (otherlv_0= 'surface' otherlv_1= '{' ( (lv_elements_2_0= ruleSurfaceElement ) )* otherlv_3= '}' )
            // InternalLibrettoProjectProfile.g:2140:3: otherlv_0= 'surface' otherlv_1= '{' ( (lv_elements_2_0= ruleSurfaceElement ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,61,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSurfaceBlockAccess().getSurfaceKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_89); 

            			newLeafNode(otherlv_1, grammarAccess.getSurfaceBlockAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalLibrettoProjectProfile.g:2148:3: ( (lv_elements_2_0= ruleSurfaceElement ) )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==62||LA86_0==64||LA86_0==67||(LA86_0>=69 && LA86_0<=70)) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:2149:4: (lv_elements_2_0= ruleSurfaceElement )
            	    {
            	    // InternalLibrettoProjectProfile.g:2149:4: (lv_elements_2_0= ruleSurfaceElement )
            	    // InternalLibrettoProjectProfile.g:2150:5: lv_elements_2_0= ruleSurfaceElement
            	    {

            	    					newCompositeNode(grammarAccess.getSurfaceBlockAccess().getElementsSurfaceElementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_89);
            	    lv_elements_2_0=ruleSurfaceElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSurfaceBlockRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_2_0,
            	    						"com.robenglander.libretto.spec.LibrettoProjectProfile.SurfaceElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop86;
                }
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getSurfaceBlockAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSurfaceBlock"


    // $ANTLR start "entryRuleSurfaceElement"
    // InternalLibrettoProjectProfile.g:2175:1: entryRuleSurfaceElement returns [EObject current=null] : iv_ruleSurfaceElement= ruleSurfaceElement EOF ;
    public final EObject entryRuleSurfaceElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSurfaceElement = null;


        try {
            // InternalLibrettoProjectProfile.g:2175:55: (iv_ruleSurfaceElement= ruleSurfaceElement EOF )
            // InternalLibrettoProjectProfile.g:2176:2: iv_ruleSurfaceElement= ruleSurfaceElement EOF
            {
             newCompositeNode(grammarAccess.getSurfaceElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSurfaceElement=ruleSurfaceElement();

            state._fsp--;

             current =iv_ruleSurfaceElement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSurfaceElement"


    // $ANTLR start "ruleSurfaceElement"
    // InternalLibrettoProjectProfile.g:2182:1: ruleSurfaceElement returns [EObject current=null] : (this_ScopedSurface_0= ruleScopedSurface | this_SurfaceRule_1= ruleSurfaceRule ) ;
    public final EObject ruleSurfaceElement() throws RecognitionException {
        EObject current = null;

        EObject this_ScopedSurface_0 = null;

        EObject this_SurfaceRule_1 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:2188:2: ( (this_ScopedSurface_0= ruleScopedSurface | this_SurfaceRule_1= ruleSurfaceRule ) )
            // InternalLibrettoProjectProfile.g:2189:2: (this_ScopedSurface_0= ruleScopedSurface | this_SurfaceRule_1= ruleSurfaceRule )
            {
            // InternalLibrettoProjectProfile.g:2189:2: (this_ScopedSurface_0= ruleScopedSurface | this_SurfaceRule_1= ruleSurfaceRule )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==62) ) {
                alt87=1;
            }
            else if ( (LA87_0==64||LA87_0==67||(LA87_0>=69 && LA87_0<=70)) ) {
                alt87=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }
            switch (alt87) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:2190:3: this_ScopedSurface_0= ruleScopedSurface
                    {

                    			newCompositeNode(grammarAccess.getSurfaceElementAccess().getScopedSurfaceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ScopedSurface_0=ruleScopedSurface();

                    state._fsp--;


                    			current = this_ScopedSurface_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalLibrettoProjectProfile.g:2199:3: this_SurfaceRule_1= ruleSurfaceRule
                    {

                    			newCompositeNode(grammarAccess.getSurfaceElementAccess().getSurfaceRuleParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SurfaceRule_1=ruleSurfaceRule();

                    state._fsp--;


                    			current = this_SurfaceRule_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSurfaceElement"


    // $ANTLR start "entryRuleScopedSurface"
    // InternalLibrettoProjectProfile.g:2211:1: entryRuleScopedSurface returns [EObject current=null] : iv_ruleScopedSurface= ruleScopedSurface EOF ;
    public final EObject entryRuleScopedSurface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScopedSurface = null;


        try {
            // InternalLibrettoProjectProfile.g:2211:54: (iv_ruleScopedSurface= ruleScopedSurface EOF )
            // InternalLibrettoProjectProfile.g:2212:2: iv_ruleScopedSurface= ruleScopedSurface EOF
            {
             newCompositeNode(grammarAccess.getScopedSurfaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScopedSurface=ruleScopedSurface();

            state._fsp--;

             current =iv_ruleScopedSurface; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleScopedSurface"


    // $ANTLR start "ruleScopedSurface"
    // InternalLibrettoProjectProfile.g:2218:1: ruleScopedSurface returns [EObject current=null] : (otherlv_0= 'for' ( (otherlv_1= 'module' ( (lv_moduleId_2_0= RULE_STRING ) ) ) | (otherlv_3= 'spec' ( (lv_specId_4_0= RULE_STRING ) ) ) ) otherlv_5= '{' ( (lv_rules_6_0= ruleSurfaceRule ) )* otherlv_7= '}' ) ;
    public final EObject ruleScopedSurface() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_moduleId_2_0=null;
        Token otherlv_3=null;
        Token lv_specId_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_rules_6_0 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:2224:2: ( (otherlv_0= 'for' ( (otherlv_1= 'module' ( (lv_moduleId_2_0= RULE_STRING ) ) ) | (otherlv_3= 'spec' ( (lv_specId_4_0= RULE_STRING ) ) ) ) otherlv_5= '{' ( (lv_rules_6_0= ruleSurfaceRule ) )* otherlv_7= '}' ) )
            // InternalLibrettoProjectProfile.g:2225:2: (otherlv_0= 'for' ( (otherlv_1= 'module' ( (lv_moduleId_2_0= RULE_STRING ) ) ) | (otherlv_3= 'spec' ( (lv_specId_4_0= RULE_STRING ) ) ) ) otherlv_5= '{' ( (lv_rules_6_0= ruleSurfaceRule ) )* otherlv_7= '}' )
            {
            // InternalLibrettoProjectProfile.g:2225:2: (otherlv_0= 'for' ( (otherlv_1= 'module' ( (lv_moduleId_2_0= RULE_STRING ) ) ) | (otherlv_3= 'spec' ( (lv_specId_4_0= RULE_STRING ) ) ) ) otherlv_5= '{' ( (lv_rules_6_0= ruleSurfaceRule ) )* otherlv_7= '}' )
            // InternalLibrettoProjectProfile.g:2226:3: otherlv_0= 'for' ( (otherlv_1= 'module' ( (lv_moduleId_2_0= RULE_STRING ) ) ) | (otherlv_3= 'spec' ( (lv_specId_4_0= RULE_STRING ) ) ) ) otherlv_5= '{' ( (lv_rules_6_0= ruleSurfaceRule ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,62,FOLLOW_90); 

            			newLeafNode(otherlv_0, grammarAccess.getScopedSurfaceAccess().getForKeyword_0());
            		
            // InternalLibrettoProjectProfile.g:2230:3: ( (otherlv_1= 'module' ( (lv_moduleId_2_0= RULE_STRING ) ) ) | (otherlv_3= 'spec' ( (lv_specId_4_0= RULE_STRING ) ) ) )
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==18) ) {
                alt88=1;
            }
            else if ( (LA88_0==63) ) {
                alt88=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }
            switch (alt88) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:2231:4: (otherlv_1= 'module' ( (lv_moduleId_2_0= RULE_STRING ) ) )
                    {
                    // InternalLibrettoProjectProfile.g:2231:4: (otherlv_1= 'module' ( (lv_moduleId_2_0= RULE_STRING ) ) )
                    // InternalLibrettoProjectProfile.g:2232:5: otherlv_1= 'module' ( (lv_moduleId_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_3); 

                    					newLeafNode(otherlv_1, grammarAccess.getScopedSurfaceAccess().getModuleKeyword_1_0_0());
                    				
                    // InternalLibrettoProjectProfile.g:2236:5: ( (lv_moduleId_2_0= RULE_STRING ) )
                    // InternalLibrettoProjectProfile.g:2237:6: (lv_moduleId_2_0= RULE_STRING )
                    {
                    // InternalLibrettoProjectProfile.g:2237:6: (lv_moduleId_2_0= RULE_STRING )
                    // InternalLibrettoProjectProfile.g:2238:7: lv_moduleId_2_0= RULE_STRING
                    {
                    lv_moduleId_2_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

                    							newLeafNode(lv_moduleId_2_0, grammarAccess.getScopedSurfaceAccess().getModuleIdSTRINGTerminalRuleCall_1_0_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getScopedSurfaceRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"moduleId",
                    								lv_moduleId_2_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalLibrettoProjectProfile.g:2256:4: (otherlv_3= 'spec' ( (lv_specId_4_0= RULE_STRING ) ) )
                    {
                    // InternalLibrettoProjectProfile.g:2256:4: (otherlv_3= 'spec' ( (lv_specId_4_0= RULE_STRING ) ) )
                    // InternalLibrettoProjectProfile.g:2257:5: otherlv_3= 'spec' ( (lv_specId_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,63,FOLLOW_3); 

                    					newLeafNode(otherlv_3, grammarAccess.getScopedSurfaceAccess().getSpecKeyword_1_1_0());
                    				
                    // InternalLibrettoProjectProfile.g:2261:5: ( (lv_specId_4_0= RULE_STRING ) )
                    // InternalLibrettoProjectProfile.g:2262:6: (lv_specId_4_0= RULE_STRING )
                    {
                    // InternalLibrettoProjectProfile.g:2262:6: (lv_specId_4_0= RULE_STRING )
                    // InternalLibrettoProjectProfile.g:2263:7: lv_specId_4_0= RULE_STRING
                    {
                    lv_specId_4_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

                    							newLeafNode(lv_specId_4_0, grammarAccess.getScopedSurfaceAccess().getSpecIdSTRINGTerminalRuleCall_1_1_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getScopedSurfaceRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"specId",
                    								lv_specId_4_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,12,FOLLOW_89); 

            			newLeafNode(otherlv_5, grammarAccess.getScopedSurfaceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLibrettoProjectProfile.g:2285:3: ( (lv_rules_6_0= ruleSurfaceRule ) )*
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==64||LA89_0==67||(LA89_0>=69 && LA89_0<=70)) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:2286:4: (lv_rules_6_0= ruleSurfaceRule )
            	    {
            	    // InternalLibrettoProjectProfile.g:2286:4: (lv_rules_6_0= ruleSurfaceRule )
            	    // InternalLibrettoProjectProfile.g:2287:5: lv_rules_6_0= ruleSurfaceRule
            	    {

            	    					newCompositeNode(grammarAccess.getScopedSurfaceAccess().getRulesSurfaceRuleParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_89);
            	    lv_rules_6_0=ruleSurfaceRule();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getScopedSurfaceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"rules",
            	    						lv_rules_6_0,
            	    						"com.robenglander.libretto.spec.LibrettoProjectProfile.SurfaceRule");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop89;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getScopedSurfaceAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScopedSurface"


    // $ANTLR start "entryRuleSurfaceRule"
    // InternalLibrettoProjectProfile.g:2312:1: entryRuleSurfaceRule returns [EObject current=null] : iv_ruleSurfaceRule= ruleSurfaceRule EOF ;
    public final EObject entryRuleSurfaceRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSurfaceRule = null;


        try {
            // InternalLibrettoProjectProfile.g:2312:52: (iv_ruleSurfaceRule= ruleSurfaceRule EOF )
            // InternalLibrettoProjectProfile.g:2313:2: iv_ruleSurfaceRule= ruleSurfaceRule EOF
            {
             newCompositeNode(grammarAccess.getSurfaceRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSurfaceRule=ruleSurfaceRule();

            state._fsp--;

             current =iv_ruleSurfaceRule; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSurfaceRule"


    // $ANTLR start "ruleSurfaceRule"
    // InternalLibrettoProjectProfile.g:2319:1: ruleSurfaceRule returns [EObject current=null] : (this_ReturnTypeRule_0= ruleReturnTypeRule | this_ParamTypeRule_1= ruleParamTypeRule | this_RecordSelfReturnRule_2= ruleRecordSelfReturnRule | this_MethodOverrideRule_3= ruleMethodOverrideRule ) ;
    public final EObject ruleSurfaceRule() throws RecognitionException {
        EObject current = null;

        EObject this_ReturnTypeRule_0 = null;

        EObject this_ParamTypeRule_1 = null;

        EObject this_RecordSelfReturnRule_2 = null;

        EObject this_MethodOverrideRule_3 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:2325:2: ( (this_ReturnTypeRule_0= ruleReturnTypeRule | this_ParamTypeRule_1= ruleParamTypeRule | this_RecordSelfReturnRule_2= ruleRecordSelfReturnRule | this_MethodOverrideRule_3= ruleMethodOverrideRule ) )
            // InternalLibrettoProjectProfile.g:2326:2: (this_ReturnTypeRule_0= ruleReturnTypeRule | this_ParamTypeRule_1= ruleParamTypeRule | this_RecordSelfReturnRule_2= ruleRecordSelfReturnRule | this_MethodOverrideRule_3= ruleMethodOverrideRule )
            {
            // InternalLibrettoProjectProfile.g:2326:2: (this_ReturnTypeRule_0= ruleReturnTypeRule | this_ParamTypeRule_1= ruleParamTypeRule | this_RecordSelfReturnRule_2= ruleRecordSelfReturnRule | this_MethodOverrideRule_3= ruleMethodOverrideRule )
            int alt90=4;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt90=1;
                }
                break;
            case 67:
                {
                alt90=2;
                }
                break;
            case 69:
                {
                alt90=3;
                }
                break;
            case 70:
                {
                alt90=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }

            switch (alt90) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:2327:3: this_ReturnTypeRule_0= ruleReturnTypeRule
                    {

                    			newCompositeNode(grammarAccess.getSurfaceRuleAccess().getReturnTypeRuleParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ReturnTypeRule_0=ruleReturnTypeRule();

                    state._fsp--;


                    			current = this_ReturnTypeRule_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalLibrettoProjectProfile.g:2336:3: this_ParamTypeRule_1= ruleParamTypeRule
                    {

                    			newCompositeNode(grammarAccess.getSurfaceRuleAccess().getParamTypeRuleParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParamTypeRule_1=ruleParamTypeRule();

                    state._fsp--;


                    			current = this_ParamTypeRule_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalLibrettoProjectProfile.g:2345:3: this_RecordSelfReturnRule_2= ruleRecordSelfReturnRule
                    {

                    			newCompositeNode(grammarAccess.getSurfaceRuleAccess().getRecordSelfReturnRuleParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_RecordSelfReturnRule_2=ruleRecordSelfReturnRule();

                    state._fsp--;


                    			current = this_RecordSelfReturnRule_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalLibrettoProjectProfile.g:2354:3: this_MethodOverrideRule_3= ruleMethodOverrideRule
                    {

                    			newCompositeNode(grammarAccess.getSurfaceRuleAccess().getMethodOverrideRuleParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_MethodOverrideRule_3=ruleMethodOverrideRule();

                    state._fsp--;


                    			current = this_MethodOverrideRule_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSurfaceRule"


    // $ANTLR start "entryRuleReturnTypeRule"
    // InternalLibrettoProjectProfile.g:2366:1: entryRuleReturnTypeRule returns [EObject current=null] : iv_ruleReturnTypeRule= ruleReturnTypeRule EOF ;
    public final EObject entryRuleReturnTypeRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnTypeRule = null;


        try {
            // InternalLibrettoProjectProfile.g:2366:55: (iv_ruleReturnTypeRule= ruleReturnTypeRule EOF )
            // InternalLibrettoProjectProfile.g:2367:2: iv_ruleReturnTypeRule= ruleReturnTypeRule EOF
            {
             newCompositeNode(grammarAccess.getReturnTypeRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReturnTypeRule=ruleReturnTypeRule();

            state._fsp--;

             current =iv_ruleReturnTypeRule; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleReturnTypeRule"


    // $ANTLR start "ruleReturnTypeRule"
    // InternalLibrettoProjectProfile.g:2373:1: ruleReturnTypeRule returns [EObject current=null] : (otherlv_0= 'returnType' otherlv_1= 'method' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_javaType_4_0= ruleJavaType ) ) (otherlv_5= ';' )? ) ;
    public final EObject ruleReturnTypeRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_javaType_4_0 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:2379:2: ( (otherlv_0= 'returnType' otherlv_1= 'method' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_javaType_4_0= ruleJavaType ) ) (otherlv_5= ';' )? ) )
            // InternalLibrettoProjectProfile.g:2380:2: (otherlv_0= 'returnType' otherlv_1= 'method' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_javaType_4_0= ruleJavaType ) ) (otherlv_5= ';' )? )
            {
            // InternalLibrettoProjectProfile.g:2380:2: (otherlv_0= 'returnType' otherlv_1= 'method' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_javaType_4_0= ruleJavaType ) ) (otherlv_5= ';' )? )
            // InternalLibrettoProjectProfile.g:2381:3: otherlv_0= 'returnType' otherlv_1= 'method' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_javaType_4_0= ruleJavaType ) ) (otherlv_5= ';' )?
            {
            otherlv_0=(Token)match(input,64,FOLLOW_91); 

            			newLeafNode(otherlv_0, grammarAccess.getReturnTypeRuleAccess().getReturnTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,65,FOLLOW_92); 

            			newLeafNode(otherlv_1, grammarAccess.getReturnTypeRuleAccess().getMethodKeyword_1());
            		
            // InternalLibrettoProjectProfile.g:2389:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalLibrettoProjectProfile.g:2390:4: (lv_name_2_0= RULE_ID )
            {
            // InternalLibrettoProjectProfile.g:2390:4: (lv_name_2_0= RULE_ID )
            // InternalLibrettoProjectProfile.g:2391:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_93); 

            					newLeafNode(lv_name_2_0, grammarAccess.getReturnTypeRuleAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReturnTypeRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,66,FOLLOW_94); 

            			newLeafNode(otherlv_3, grammarAccess.getReturnTypeRuleAccess().getAsKeyword_3());
            		
            // InternalLibrettoProjectProfile.g:2411:3: ( (lv_javaType_4_0= ruleJavaType ) )
            // InternalLibrettoProjectProfile.g:2412:4: (lv_javaType_4_0= ruleJavaType )
            {
            // InternalLibrettoProjectProfile.g:2412:4: (lv_javaType_4_0= ruleJavaType )
            // InternalLibrettoProjectProfile.g:2413:5: lv_javaType_4_0= ruleJavaType
            {

            					newCompositeNode(grammarAccess.getReturnTypeRuleAccess().getJavaTypeJavaTypeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_68);
            lv_javaType_4_0=ruleJavaType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReturnTypeRuleRule());
            					}
            					set(
            						current,
            						"javaType",
            						lv_javaType_4_0,
            						"com.robenglander.libretto.spec.LibrettoProjectProfile.JavaType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLibrettoProjectProfile.g:2430:3: (otherlv_5= ';' )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==16) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:2431:4: otherlv_5= ';'
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getReturnTypeRuleAccess().getSemicolonKeyword_5());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReturnTypeRule"


    // $ANTLR start "entryRuleParamTypeRule"
    // InternalLibrettoProjectProfile.g:2440:1: entryRuleParamTypeRule returns [EObject current=null] : iv_ruleParamTypeRule= ruleParamTypeRule EOF ;
    public final EObject entryRuleParamTypeRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamTypeRule = null;


        try {
            // InternalLibrettoProjectProfile.g:2440:54: (iv_ruleParamTypeRule= ruleParamTypeRule EOF )
            // InternalLibrettoProjectProfile.g:2441:2: iv_ruleParamTypeRule= ruleParamTypeRule EOF
            {
             newCompositeNode(grammarAccess.getParamTypeRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParamTypeRule=ruleParamTypeRule();

            state._fsp--;

             current =iv_ruleParamTypeRule; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParamTypeRule"


    // $ANTLR start "ruleParamTypeRule"
    // InternalLibrettoProjectProfile.g:2447:1: ruleParamTypeRule returns [EObject current=null] : (otherlv_0= 'paramType' otherlv_1= 'name' ( (lv_paramName_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_javaType_4_0= ruleJavaType ) ) (otherlv_5= ';' )? ) ;
    public final EObject ruleParamTypeRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_paramName_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_javaType_4_0 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:2453:2: ( (otherlv_0= 'paramType' otherlv_1= 'name' ( (lv_paramName_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_javaType_4_0= ruleJavaType ) ) (otherlv_5= ';' )? ) )
            // InternalLibrettoProjectProfile.g:2454:2: (otherlv_0= 'paramType' otherlv_1= 'name' ( (lv_paramName_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_javaType_4_0= ruleJavaType ) ) (otherlv_5= ';' )? )
            {
            // InternalLibrettoProjectProfile.g:2454:2: (otherlv_0= 'paramType' otherlv_1= 'name' ( (lv_paramName_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_javaType_4_0= ruleJavaType ) ) (otherlv_5= ';' )? )
            // InternalLibrettoProjectProfile.g:2455:3: otherlv_0= 'paramType' otherlv_1= 'name' ( (lv_paramName_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_javaType_4_0= ruleJavaType ) ) (otherlv_5= ';' )?
            {
            otherlv_0=(Token)match(input,67,FOLLOW_95); 

            			newLeafNode(otherlv_0, grammarAccess.getParamTypeRuleAccess().getParamTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,68,FOLLOW_92); 

            			newLeafNode(otherlv_1, grammarAccess.getParamTypeRuleAccess().getNameKeyword_1());
            		
            // InternalLibrettoProjectProfile.g:2463:3: ( (lv_paramName_2_0= RULE_ID ) )
            // InternalLibrettoProjectProfile.g:2464:4: (lv_paramName_2_0= RULE_ID )
            {
            // InternalLibrettoProjectProfile.g:2464:4: (lv_paramName_2_0= RULE_ID )
            // InternalLibrettoProjectProfile.g:2465:5: lv_paramName_2_0= RULE_ID
            {
            lv_paramName_2_0=(Token)match(input,RULE_ID,FOLLOW_93); 

            					newLeafNode(lv_paramName_2_0, grammarAccess.getParamTypeRuleAccess().getParamNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParamTypeRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"paramName",
            						lv_paramName_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,66,FOLLOW_94); 

            			newLeafNode(otherlv_3, grammarAccess.getParamTypeRuleAccess().getAsKeyword_3());
            		
            // InternalLibrettoProjectProfile.g:2485:3: ( (lv_javaType_4_0= ruleJavaType ) )
            // InternalLibrettoProjectProfile.g:2486:4: (lv_javaType_4_0= ruleJavaType )
            {
            // InternalLibrettoProjectProfile.g:2486:4: (lv_javaType_4_0= ruleJavaType )
            // InternalLibrettoProjectProfile.g:2487:5: lv_javaType_4_0= ruleJavaType
            {

            					newCompositeNode(grammarAccess.getParamTypeRuleAccess().getJavaTypeJavaTypeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_68);
            lv_javaType_4_0=ruleJavaType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParamTypeRuleRule());
            					}
            					set(
            						current,
            						"javaType",
            						lv_javaType_4_0,
            						"com.robenglander.libretto.spec.LibrettoProjectProfile.JavaType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLibrettoProjectProfile.g:2504:3: (otherlv_5= ';' )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==16) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:2505:4: otherlv_5= ';'
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getParamTypeRuleAccess().getSemicolonKeyword_5());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParamTypeRule"


    // $ANTLR start "entryRuleRecordSelfReturnRule"
    // InternalLibrettoProjectProfile.g:2514:1: entryRuleRecordSelfReturnRule returns [EObject current=null] : iv_ruleRecordSelfReturnRule= ruleRecordSelfReturnRule EOF ;
    public final EObject entryRuleRecordSelfReturnRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecordSelfReturnRule = null;


        try {
            // InternalLibrettoProjectProfile.g:2514:61: (iv_ruleRecordSelfReturnRule= ruleRecordSelfReturnRule EOF )
            // InternalLibrettoProjectProfile.g:2515:2: iv_ruleRecordSelfReturnRule= ruleRecordSelfReturnRule EOF
            {
             newCompositeNode(grammarAccess.getRecordSelfReturnRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRecordSelfReturnRule=ruleRecordSelfReturnRule();

            state._fsp--;

             current =iv_ruleRecordSelfReturnRule; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRecordSelfReturnRule"


    // $ANTLR start "ruleRecordSelfReturnRule"
    // InternalLibrettoProjectProfile.g:2521:1: ruleRecordSelfReturnRule returns [EObject current=null] : (otherlv_0= 'recordSelfReturn' ( (lv_methods_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_methods_3_0= RULE_ID ) ) )* (otherlv_4= ';' )? ) ;
    public final EObject ruleRecordSelfReturnRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_methods_1_0=null;
        Token otherlv_2=null;
        Token lv_methods_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:2527:2: ( (otherlv_0= 'recordSelfReturn' ( (lv_methods_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_methods_3_0= RULE_ID ) ) )* (otherlv_4= ';' )? ) )
            // InternalLibrettoProjectProfile.g:2528:2: (otherlv_0= 'recordSelfReturn' ( (lv_methods_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_methods_3_0= RULE_ID ) ) )* (otherlv_4= ';' )? )
            {
            // InternalLibrettoProjectProfile.g:2528:2: (otherlv_0= 'recordSelfReturn' ( (lv_methods_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_methods_3_0= RULE_ID ) ) )* (otherlv_4= ';' )? )
            // InternalLibrettoProjectProfile.g:2529:3: otherlv_0= 'recordSelfReturn' ( (lv_methods_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_methods_3_0= RULE_ID ) ) )* (otherlv_4= ';' )?
            {
            otherlv_0=(Token)match(input,69,FOLLOW_92); 

            			newLeafNode(otherlv_0, grammarAccess.getRecordSelfReturnRuleAccess().getRecordSelfReturnKeyword_0());
            		
            // InternalLibrettoProjectProfile.g:2533:3: ( (lv_methods_1_0= RULE_ID ) )
            // InternalLibrettoProjectProfile.g:2534:4: (lv_methods_1_0= RULE_ID )
            {
            // InternalLibrettoProjectProfile.g:2534:4: (lv_methods_1_0= RULE_ID )
            // InternalLibrettoProjectProfile.g:2535:5: lv_methods_1_0= RULE_ID
            {
            lv_methods_1_0=(Token)match(input,RULE_ID,FOLLOW_96); 

            					newLeafNode(lv_methods_1_0, grammarAccess.getRecordSelfReturnRuleAccess().getMethodsIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRecordSelfReturnRuleRule());
            					}
            					addWithLastConsumed(
            						current,
            						"methods",
            						lv_methods_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalLibrettoProjectProfile.g:2551:3: (otherlv_2= ',' ( (lv_methods_3_0= RULE_ID ) ) )*
            loop93:
            do {
                int alt93=2;
                int LA93_0 = input.LA(1);

                if ( (LA93_0==28) ) {
                    alt93=1;
                }


                switch (alt93) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:2552:4: otherlv_2= ',' ( (lv_methods_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,28,FOLLOW_92); 

            	    				newLeafNode(otherlv_2, grammarAccess.getRecordSelfReturnRuleAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalLibrettoProjectProfile.g:2556:4: ( (lv_methods_3_0= RULE_ID ) )
            	    // InternalLibrettoProjectProfile.g:2557:5: (lv_methods_3_0= RULE_ID )
            	    {
            	    // InternalLibrettoProjectProfile.g:2557:5: (lv_methods_3_0= RULE_ID )
            	    // InternalLibrettoProjectProfile.g:2558:6: lv_methods_3_0= RULE_ID
            	    {
            	    lv_methods_3_0=(Token)match(input,RULE_ID,FOLLOW_96); 

            	    						newLeafNode(lv_methods_3_0, grammarAccess.getRecordSelfReturnRuleAccess().getMethodsIDTerminalRuleCall_2_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getRecordSelfReturnRuleRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"methods",
            	    							lv_methods_3_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop93;
                }
            } while (true);

            // InternalLibrettoProjectProfile.g:2575:3: (otherlv_4= ';' )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==16) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:2576:4: otherlv_4= ';'
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getRecordSelfReturnRuleAccess().getSemicolonKeyword_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRecordSelfReturnRule"


    // $ANTLR start "entryRuleMethodOverrideRule"
    // InternalLibrettoProjectProfile.g:2585:1: entryRuleMethodOverrideRule returns [EObject current=null] : iv_ruleMethodOverrideRule= ruleMethodOverrideRule EOF ;
    public final EObject entryRuleMethodOverrideRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodOverrideRule = null;


        try {
            // InternalLibrettoProjectProfile.g:2585:59: (iv_ruleMethodOverrideRule= ruleMethodOverrideRule EOF )
            // InternalLibrettoProjectProfile.g:2586:2: iv_ruleMethodOverrideRule= ruleMethodOverrideRule EOF
            {
             newCompositeNode(grammarAccess.getMethodOverrideRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethodOverrideRule=ruleMethodOverrideRule();

            state._fsp--;

             current =iv_ruleMethodOverrideRule; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMethodOverrideRule"


    // $ANTLR start "ruleMethodOverrideRule"
    // InternalLibrettoProjectProfile.g:2592:1: ruleMethodOverrideRule returns [EObject current=null] : (otherlv_0= 'methodOverride' ( (lv_signature_1_0= ruleOperationSignature ) ) otherlv_2= 'returns' ( (lv_javaType_3_0= ruleJavaType ) ) (otherlv_4= ';' )? ) ;
    public final EObject ruleMethodOverrideRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_signature_1_0 = null;

        EObject lv_javaType_3_0 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:2598:2: ( (otherlv_0= 'methodOverride' ( (lv_signature_1_0= ruleOperationSignature ) ) otherlv_2= 'returns' ( (lv_javaType_3_0= ruleJavaType ) ) (otherlv_4= ';' )? ) )
            // InternalLibrettoProjectProfile.g:2599:2: (otherlv_0= 'methodOverride' ( (lv_signature_1_0= ruleOperationSignature ) ) otherlv_2= 'returns' ( (lv_javaType_3_0= ruleJavaType ) ) (otherlv_4= ';' )? )
            {
            // InternalLibrettoProjectProfile.g:2599:2: (otherlv_0= 'methodOverride' ( (lv_signature_1_0= ruleOperationSignature ) ) otherlv_2= 'returns' ( (lv_javaType_3_0= ruleJavaType ) ) (otherlv_4= ';' )? )
            // InternalLibrettoProjectProfile.g:2600:3: otherlv_0= 'methodOverride' ( (lv_signature_1_0= ruleOperationSignature ) ) otherlv_2= 'returns' ( (lv_javaType_3_0= ruleJavaType ) ) (otherlv_4= ';' )?
            {
            otherlv_0=(Token)match(input,70,FOLLOW_92); 

            			newLeafNode(otherlv_0, grammarAccess.getMethodOverrideRuleAccess().getMethodOverrideKeyword_0());
            		
            // InternalLibrettoProjectProfile.g:2604:3: ( (lv_signature_1_0= ruleOperationSignature ) )
            // InternalLibrettoProjectProfile.g:2605:4: (lv_signature_1_0= ruleOperationSignature )
            {
            // InternalLibrettoProjectProfile.g:2605:4: (lv_signature_1_0= ruleOperationSignature )
            // InternalLibrettoProjectProfile.g:2606:5: lv_signature_1_0= ruleOperationSignature
            {

            					newCompositeNode(grammarAccess.getMethodOverrideRuleAccess().getSignatureOperationSignatureParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_97);
            lv_signature_1_0=ruleOperationSignature();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMethodOverrideRuleRule());
            					}
            					set(
            						current,
            						"signature",
            						lv_signature_1_0,
            						"com.robenglander.libretto.spec.LibrettoProjectProfile.OperationSignature");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,71,FOLLOW_94); 

            			newLeafNode(otherlv_2, grammarAccess.getMethodOverrideRuleAccess().getReturnsKeyword_2());
            		
            // InternalLibrettoProjectProfile.g:2627:3: ( (lv_javaType_3_0= ruleJavaType ) )
            // InternalLibrettoProjectProfile.g:2628:4: (lv_javaType_3_0= ruleJavaType )
            {
            // InternalLibrettoProjectProfile.g:2628:4: (lv_javaType_3_0= ruleJavaType )
            // InternalLibrettoProjectProfile.g:2629:5: lv_javaType_3_0= ruleJavaType
            {

            					newCompositeNode(grammarAccess.getMethodOverrideRuleAccess().getJavaTypeJavaTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_68);
            lv_javaType_3_0=ruleJavaType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMethodOverrideRuleRule());
            					}
            					set(
            						current,
            						"javaType",
            						lv_javaType_3_0,
            						"com.robenglander.libretto.spec.LibrettoProjectProfile.JavaType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLibrettoProjectProfile.g:2646:3: (otherlv_4= ';' )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==16) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:2647:4: otherlv_4= ';'
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getMethodOverrideRuleAccess().getSemicolonKeyword_4());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMethodOverrideRule"


    // $ANTLR start "entryRuleJavaType"
    // InternalLibrettoProjectProfile.g:2656:1: entryRuleJavaType returns [EObject current=null] : iv_ruleJavaType= ruleJavaType EOF ;
    public final EObject entryRuleJavaType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJavaType = null;


        try {
            // InternalLibrettoProjectProfile.g:2656:49: (iv_ruleJavaType= ruleJavaType EOF )
            // InternalLibrettoProjectProfile.g:2657:2: iv_ruleJavaType= ruleJavaType EOF
            {
             newCompositeNode(grammarAccess.getJavaTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJavaType=ruleJavaType();

            state._fsp--;

             current =iv_ruleJavaType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleJavaType"


    // $ANTLR start "ruleJavaType"
    // InternalLibrettoProjectProfile.g:2663:1: ruleJavaType returns [EObject current=null] : (this_PrimitiveType_0= rulePrimitiveType | this_QualifiedName_1= ruleQualifiedName ) ;
    public final EObject ruleJavaType() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveType_0 = null;

        EObject this_QualifiedName_1 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:2669:2: ( (this_PrimitiveType_0= rulePrimitiveType | this_QualifiedName_1= ruleQualifiedName ) )
            // InternalLibrettoProjectProfile.g:2670:2: (this_PrimitiveType_0= rulePrimitiveType | this_QualifiedName_1= ruleQualifiedName )
            {
            // InternalLibrettoProjectProfile.g:2670:2: (this_PrimitiveType_0= rulePrimitiveType | this_QualifiedName_1= ruleQualifiedName )
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( ((LA96_0>=73 && LA96_0<=81)) ) {
                alt96=1;
            }
            else if ( (LA96_0==RULE_ID) ) {
                alt96=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }
            switch (alt96) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:2671:3: this_PrimitiveType_0= rulePrimitiveType
                    {

                    			newCompositeNode(grammarAccess.getJavaTypeAccess().getPrimitiveTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrimitiveType_0=rulePrimitiveType();

                    state._fsp--;


                    			current = this_PrimitiveType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalLibrettoProjectProfile.g:2680:3: this_QualifiedName_1= ruleQualifiedName
                    {

                    			newCompositeNode(grammarAccess.getJavaTypeAccess().getQualifiedNameParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_QualifiedName_1=ruleQualifiedName();

                    state._fsp--;


                    			current = this_QualifiedName_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJavaType"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalLibrettoProjectProfile.g:2692:1: entryRuleQualifiedName returns [EObject current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final EObject entryRuleQualifiedName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedName = null;


        try {
            // InternalLibrettoProjectProfile.g:2692:54: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalLibrettoProjectProfile.g:2693:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalLibrettoProjectProfile.g:2699:1: ruleQualifiedName returns [EObject current=null] : ( ( (lv_segments_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_segments_2_0= RULE_ID ) ) )* ) ;
    public final EObject ruleQualifiedName() throws RecognitionException {
        EObject current = null;

        Token lv_segments_0_0=null;
        Token otherlv_1=null;
        Token lv_segments_2_0=null;


        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:2705:2: ( ( ( (lv_segments_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_segments_2_0= RULE_ID ) ) )* ) )
            // InternalLibrettoProjectProfile.g:2706:2: ( ( (lv_segments_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_segments_2_0= RULE_ID ) ) )* )
            {
            // InternalLibrettoProjectProfile.g:2706:2: ( ( (lv_segments_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_segments_2_0= RULE_ID ) ) )* )
            // InternalLibrettoProjectProfile.g:2707:3: ( (lv_segments_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_segments_2_0= RULE_ID ) ) )*
            {
            // InternalLibrettoProjectProfile.g:2707:3: ( (lv_segments_0_0= RULE_ID ) )
            // InternalLibrettoProjectProfile.g:2708:4: (lv_segments_0_0= RULE_ID )
            {
            // InternalLibrettoProjectProfile.g:2708:4: (lv_segments_0_0= RULE_ID )
            // InternalLibrettoProjectProfile.g:2709:5: lv_segments_0_0= RULE_ID
            {
            lv_segments_0_0=(Token)match(input,RULE_ID,FOLLOW_98); 

            					newLeafNode(lv_segments_0_0, grammarAccess.getQualifiedNameAccess().getSegmentsIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQualifiedNameRule());
            					}
            					addWithLastConsumed(
            						current,
            						"segments",
            						lv_segments_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalLibrettoProjectProfile.g:2725:3: (otherlv_1= '.' ( (lv_segments_2_0= RULE_ID ) ) )*
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( (LA97_0==72) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:2726:4: otherlv_1= '.' ( (lv_segments_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,72,FOLLOW_92); 

            	    				newLeafNode(otherlv_1, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    // InternalLibrettoProjectProfile.g:2730:4: ( (lv_segments_2_0= RULE_ID ) )
            	    // InternalLibrettoProjectProfile.g:2731:5: (lv_segments_2_0= RULE_ID )
            	    {
            	    // InternalLibrettoProjectProfile.g:2731:5: (lv_segments_2_0= RULE_ID )
            	    // InternalLibrettoProjectProfile.g:2732:6: lv_segments_2_0= RULE_ID
            	    {
            	    lv_segments_2_0=(Token)match(input,RULE_ID,FOLLOW_98); 

            	    						newLeafNode(lv_segments_2_0, grammarAccess.getQualifiedNameAccess().getSegmentsIDTerminalRuleCall_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getQualifiedNameRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"segments",
            	    							lv_segments_2_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop97;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRulePrimitiveType"
    // InternalLibrettoProjectProfile.g:2753:1: entryRulePrimitiveType returns [EObject current=null] : iv_rulePrimitiveType= rulePrimitiveType EOF ;
    public final EObject entryRulePrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveType = null;


        try {
            // InternalLibrettoProjectProfile.g:2753:54: (iv_rulePrimitiveType= rulePrimitiveType EOF )
            // InternalLibrettoProjectProfile.g:2754:2: iv_rulePrimitiveType= rulePrimitiveType EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimitiveType=rulePrimitiveType();

            state._fsp--;

             current =iv_rulePrimitiveType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePrimitiveType"


    // $ANTLR start "rulePrimitiveType"
    // InternalLibrettoProjectProfile.g:2760:1: rulePrimitiveType returns [EObject current=null] : ( ( (lv_kind_0_1= 'boolean' | lv_kind_0_2= 'int' | lv_kind_0_3= 'long' | lv_kind_0_4= 'double' | lv_kind_0_5= 'float' | lv_kind_0_6= 'short' | lv_kind_0_7= 'byte' | lv_kind_0_8= 'char' | lv_kind_0_9= 'void' ) ) ) ;
    public final EObject rulePrimitiveType() throws RecognitionException {
        EObject current = null;

        Token lv_kind_0_1=null;
        Token lv_kind_0_2=null;
        Token lv_kind_0_3=null;
        Token lv_kind_0_4=null;
        Token lv_kind_0_5=null;
        Token lv_kind_0_6=null;
        Token lv_kind_0_7=null;
        Token lv_kind_0_8=null;
        Token lv_kind_0_9=null;


        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:2766:2: ( ( ( (lv_kind_0_1= 'boolean' | lv_kind_0_2= 'int' | lv_kind_0_3= 'long' | lv_kind_0_4= 'double' | lv_kind_0_5= 'float' | lv_kind_0_6= 'short' | lv_kind_0_7= 'byte' | lv_kind_0_8= 'char' | lv_kind_0_9= 'void' ) ) ) )
            // InternalLibrettoProjectProfile.g:2767:2: ( ( (lv_kind_0_1= 'boolean' | lv_kind_0_2= 'int' | lv_kind_0_3= 'long' | lv_kind_0_4= 'double' | lv_kind_0_5= 'float' | lv_kind_0_6= 'short' | lv_kind_0_7= 'byte' | lv_kind_0_8= 'char' | lv_kind_0_9= 'void' ) ) )
            {
            // InternalLibrettoProjectProfile.g:2767:2: ( ( (lv_kind_0_1= 'boolean' | lv_kind_0_2= 'int' | lv_kind_0_3= 'long' | lv_kind_0_4= 'double' | lv_kind_0_5= 'float' | lv_kind_0_6= 'short' | lv_kind_0_7= 'byte' | lv_kind_0_8= 'char' | lv_kind_0_9= 'void' ) ) )
            // InternalLibrettoProjectProfile.g:2768:3: ( (lv_kind_0_1= 'boolean' | lv_kind_0_2= 'int' | lv_kind_0_3= 'long' | lv_kind_0_4= 'double' | lv_kind_0_5= 'float' | lv_kind_0_6= 'short' | lv_kind_0_7= 'byte' | lv_kind_0_8= 'char' | lv_kind_0_9= 'void' ) )
            {
            // InternalLibrettoProjectProfile.g:2768:3: ( (lv_kind_0_1= 'boolean' | lv_kind_0_2= 'int' | lv_kind_0_3= 'long' | lv_kind_0_4= 'double' | lv_kind_0_5= 'float' | lv_kind_0_6= 'short' | lv_kind_0_7= 'byte' | lv_kind_0_8= 'char' | lv_kind_0_9= 'void' ) )
            // InternalLibrettoProjectProfile.g:2769:4: (lv_kind_0_1= 'boolean' | lv_kind_0_2= 'int' | lv_kind_0_3= 'long' | lv_kind_0_4= 'double' | lv_kind_0_5= 'float' | lv_kind_0_6= 'short' | lv_kind_0_7= 'byte' | lv_kind_0_8= 'char' | lv_kind_0_9= 'void' )
            {
            // InternalLibrettoProjectProfile.g:2769:4: (lv_kind_0_1= 'boolean' | lv_kind_0_2= 'int' | lv_kind_0_3= 'long' | lv_kind_0_4= 'double' | lv_kind_0_5= 'float' | lv_kind_0_6= 'short' | lv_kind_0_7= 'byte' | lv_kind_0_8= 'char' | lv_kind_0_9= 'void' )
            int alt98=9;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt98=1;
                }
                break;
            case 74:
                {
                alt98=2;
                }
                break;
            case 75:
                {
                alt98=3;
                }
                break;
            case 76:
                {
                alt98=4;
                }
                break;
            case 77:
                {
                alt98=5;
                }
                break;
            case 78:
                {
                alt98=6;
                }
                break;
            case 79:
                {
                alt98=7;
                }
                break;
            case 80:
                {
                alt98=8;
                }
                break;
            case 81:
                {
                alt98=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;
            }

            switch (alt98) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:2770:5: lv_kind_0_1= 'boolean'
                    {
                    lv_kind_0_1=(Token)match(input,73,FOLLOW_2); 

                    					newLeafNode(lv_kind_0_1, grammarAccess.getPrimitiveTypeAccess().getKindBooleanKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "kind", lv_kind_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalLibrettoProjectProfile.g:2781:5: lv_kind_0_2= 'int'
                    {
                    lv_kind_0_2=(Token)match(input,74,FOLLOW_2); 

                    					newLeafNode(lv_kind_0_2, grammarAccess.getPrimitiveTypeAccess().getKindIntKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "kind", lv_kind_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalLibrettoProjectProfile.g:2792:5: lv_kind_0_3= 'long'
                    {
                    lv_kind_0_3=(Token)match(input,75,FOLLOW_2); 

                    					newLeafNode(lv_kind_0_3, grammarAccess.getPrimitiveTypeAccess().getKindLongKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "kind", lv_kind_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalLibrettoProjectProfile.g:2803:5: lv_kind_0_4= 'double'
                    {
                    lv_kind_0_4=(Token)match(input,76,FOLLOW_2); 

                    					newLeafNode(lv_kind_0_4, grammarAccess.getPrimitiveTypeAccess().getKindDoubleKeyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "kind", lv_kind_0_4, null);
                    				

                    }
                    break;
                case 5 :
                    // InternalLibrettoProjectProfile.g:2814:5: lv_kind_0_5= 'float'
                    {
                    lv_kind_0_5=(Token)match(input,77,FOLLOW_2); 

                    					newLeafNode(lv_kind_0_5, grammarAccess.getPrimitiveTypeAccess().getKindFloatKeyword_0_4());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "kind", lv_kind_0_5, null);
                    				

                    }
                    break;
                case 6 :
                    // InternalLibrettoProjectProfile.g:2825:5: lv_kind_0_6= 'short'
                    {
                    lv_kind_0_6=(Token)match(input,78,FOLLOW_2); 

                    					newLeafNode(lv_kind_0_6, grammarAccess.getPrimitiveTypeAccess().getKindShortKeyword_0_5());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "kind", lv_kind_0_6, null);
                    				

                    }
                    break;
                case 7 :
                    // InternalLibrettoProjectProfile.g:2836:5: lv_kind_0_7= 'byte'
                    {
                    lv_kind_0_7=(Token)match(input,79,FOLLOW_2); 

                    					newLeafNode(lv_kind_0_7, grammarAccess.getPrimitiveTypeAccess().getKindByteKeyword_0_6());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "kind", lv_kind_0_7, null);
                    				

                    }
                    break;
                case 8 :
                    // InternalLibrettoProjectProfile.g:2847:5: lv_kind_0_8= 'char'
                    {
                    lv_kind_0_8=(Token)match(input,80,FOLLOW_2); 

                    					newLeafNode(lv_kind_0_8, grammarAccess.getPrimitiveTypeAccess().getKindCharKeyword_0_7());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "kind", lv_kind_0_8, null);
                    				

                    }
                    break;
                case 9 :
                    // InternalLibrettoProjectProfile.g:2858:5: lv_kind_0_9= 'void'
                    {
                    lv_kind_0_9=(Token)match(input,81,FOLLOW_2); 

                    					newLeafNode(lv_kind_0_9, grammarAccess.getPrimitiveTypeAccess().getKindVoidKeyword_0_8());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "kind", lv_kind_0_9, null);
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitiveType"


    // $ANTLR start "entryRuleOperationSignature"
    // InternalLibrettoProjectProfile.g:2874:1: entryRuleOperationSignature returns [EObject current=null] : iv_ruleOperationSignature= ruleOperationSignature EOF ;
    public final EObject entryRuleOperationSignature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationSignature = null;


        try {
            // InternalLibrettoProjectProfile.g:2874:59: (iv_ruleOperationSignature= ruleOperationSignature EOF )
            // InternalLibrettoProjectProfile.g:2875:2: iv_ruleOperationSignature= ruleOperationSignature EOF
            {
             newCompositeNode(grammarAccess.getOperationSignatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperationSignature=ruleOperationSignature();

            state._fsp--;

             current =iv_ruleOperationSignature; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOperationSignature"


    // $ANTLR start "ruleOperationSignature"
    // InternalLibrettoProjectProfile.g:2881:1: ruleOperationSignature returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleTypedParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleTypedParam ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleOperationSignature() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_params_2_0 = null;

        EObject lv_params_4_0 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:2887:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleTypedParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleTypedParam ) ) )* )? otherlv_5= ')' ) )
            // InternalLibrettoProjectProfile.g:2888:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleTypedParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleTypedParam ) ) )* )? otherlv_5= ')' )
            {
            // InternalLibrettoProjectProfile.g:2888:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleTypedParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleTypedParam ) ) )* )? otherlv_5= ')' )
            // InternalLibrettoProjectProfile.g:2889:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleTypedParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleTypedParam ) ) )* )? otherlv_5= ')'
            {
            // InternalLibrettoProjectProfile.g:2889:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalLibrettoProjectProfile.g:2890:4: (lv_name_0_0= RULE_ID )
            {
            // InternalLibrettoProjectProfile.g:2890:4: (lv_name_0_0= RULE_ID )
            // InternalLibrettoProjectProfile.g:2891:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_99); 

            					newLeafNode(lv_name_0_0, grammarAccess.getOperationSignatureAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOperationSignatureRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,82,FOLLOW_100); 

            			newLeafNode(otherlv_1, grammarAccess.getOperationSignatureAccess().getLeftParenthesisKeyword_1());
            		
            // InternalLibrettoProjectProfile.g:2911:3: ( ( (lv_params_2_0= ruleTypedParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleTypedParam ) ) )* )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==RULE_ID||(LA100_0>=73 && LA100_0<=81)) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:2912:4: ( (lv_params_2_0= ruleTypedParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleTypedParam ) ) )*
                    {
                    // InternalLibrettoProjectProfile.g:2912:4: ( (lv_params_2_0= ruleTypedParam ) )
                    // InternalLibrettoProjectProfile.g:2913:5: (lv_params_2_0= ruleTypedParam )
                    {
                    // InternalLibrettoProjectProfile.g:2913:5: (lv_params_2_0= ruleTypedParam )
                    // InternalLibrettoProjectProfile.g:2914:6: lv_params_2_0= ruleTypedParam
                    {

                    						newCompositeNode(grammarAccess.getOperationSignatureAccess().getParamsTypedParamParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_101);
                    lv_params_2_0=ruleTypedParam();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOperationSignatureRule());
                    						}
                    						add(
                    							current,
                    							"params",
                    							lv_params_2_0,
                    							"com.robenglander.libretto.spec.LibrettoProjectProfile.TypedParam");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalLibrettoProjectProfile.g:2931:4: (otherlv_3= ',' ( (lv_params_4_0= ruleTypedParam ) ) )*
                    loop99:
                    do {
                        int alt99=2;
                        int LA99_0 = input.LA(1);

                        if ( (LA99_0==28) ) {
                            alt99=1;
                        }


                        switch (alt99) {
                    	case 1 :
                    	    // InternalLibrettoProjectProfile.g:2932:5: otherlv_3= ',' ( (lv_params_4_0= ruleTypedParam ) )
                    	    {
                    	    otherlv_3=(Token)match(input,28,FOLLOW_94); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getOperationSignatureAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalLibrettoProjectProfile.g:2936:5: ( (lv_params_4_0= ruleTypedParam ) )
                    	    // InternalLibrettoProjectProfile.g:2937:6: (lv_params_4_0= ruleTypedParam )
                    	    {
                    	    // InternalLibrettoProjectProfile.g:2937:6: (lv_params_4_0= ruleTypedParam )
                    	    // InternalLibrettoProjectProfile.g:2938:7: lv_params_4_0= ruleTypedParam
                    	    {

                    	    							newCompositeNode(grammarAccess.getOperationSignatureAccess().getParamsTypedParamParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_101);
                    	    lv_params_4_0=ruleTypedParam();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOperationSignatureRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"params",
                    	    								lv_params_4_0,
                    	    								"com.robenglander.libretto.spec.LibrettoProjectProfile.TypedParam");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop99;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,83,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getOperationSignatureAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperationSignature"


    // $ANTLR start "entryRuleTypedParam"
    // InternalLibrettoProjectProfile.g:2965:1: entryRuleTypedParam returns [EObject current=null] : iv_ruleTypedParam= ruleTypedParam EOF ;
    public final EObject entryRuleTypedParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedParam = null;


        try {
            // InternalLibrettoProjectProfile.g:2965:51: (iv_ruleTypedParam= ruleTypedParam EOF )
            // InternalLibrettoProjectProfile.g:2966:2: iv_ruleTypedParam= ruleTypedParam EOF
            {
             newCompositeNode(grammarAccess.getTypedParamRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypedParam=ruleTypedParam();

            state._fsp--;

             current =iv_ruleTypedParam; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTypedParam"


    // $ANTLR start "ruleTypedParam"
    // InternalLibrettoProjectProfile.g:2972:1: ruleTypedParam returns [EObject current=null] : ( ( (lv_type_0_0= ruleJavaType ) ) ( (lv_paramName_1_0= RULE_ID ) ) ) ;
    public final EObject ruleTypedParam() throws RecognitionException {
        EObject current = null;

        Token lv_paramName_1_0=null;
        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:2978:2: ( ( ( (lv_type_0_0= ruleJavaType ) ) ( (lv_paramName_1_0= RULE_ID ) ) ) )
            // InternalLibrettoProjectProfile.g:2979:2: ( ( (lv_type_0_0= ruleJavaType ) ) ( (lv_paramName_1_0= RULE_ID ) ) )
            {
            // InternalLibrettoProjectProfile.g:2979:2: ( ( (lv_type_0_0= ruleJavaType ) ) ( (lv_paramName_1_0= RULE_ID ) ) )
            // InternalLibrettoProjectProfile.g:2980:3: ( (lv_type_0_0= ruleJavaType ) ) ( (lv_paramName_1_0= RULE_ID ) )
            {
            // InternalLibrettoProjectProfile.g:2980:3: ( (lv_type_0_0= ruleJavaType ) )
            // InternalLibrettoProjectProfile.g:2981:4: (lv_type_0_0= ruleJavaType )
            {
            // InternalLibrettoProjectProfile.g:2981:4: (lv_type_0_0= ruleJavaType )
            // InternalLibrettoProjectProfile.g:2982:5: lv_type_0_0= ruleJavaType
            {

            					newCompositeNode(grammarAccess.getTypedParamAccess().getTypeJavaTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_92);
            lv_type_0_0=ruleJavaType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTypedParamRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"com.robenglander.libretto.spec.LibrettoProjectProfile.JavaType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLibrettoProjectProfile.g:2999:3: ( (lv_paramName_1_0= RULE_ID ) )
            // InternalLibrettoProjectProfile.g:3000:4: (lv_paramName_1_0= RULE_ID )
            {
            // InternalLibrettoProjectProfile.g:3000:4: (lv_paramName_1_0= RULE_ID )
            // InternalLibrettoProjectProfile.g:3001:5: lv_paramName_1_0= RULE_ID
            {
            lv_paramName_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_paramName_1_0, grammarAccess.getTypedParamAccess().getParamNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypedParamRule());
            					}
            					setWithLastConsumed(
            						current,
            						"paramName",
            						lv_paramName_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypedParam"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x2000200000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x2000200000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x2000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000102A000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001032000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001022000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001002000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000F12000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000F02000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000E12000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000E02000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000C12000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000C02000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000812000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0040080CC6002000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0040080CC4012000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0040080CC4002000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0040080CC0012000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0040080CC0002000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0040080C80012000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0040080C80002000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0040080C00012000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0040080C00002000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0040080400002000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0040000400002000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000400002000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x00400808C6002000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x00400808C4012000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x00400808C4002000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x00400808C0012000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x00400808C0002000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0040080880012000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0040080880002000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0040080800012000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0040080800002000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0040080000002000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0040000000002000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x00000030C4002000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000003084012000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000003084002000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000003004012000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000003004002000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000002004012000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000002004002000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000002000012000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000002000002000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000044000002000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000010000010000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000020000010000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000004000002000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000400000002000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0007000000000000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0038000000012000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0038000000002000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0030000000012000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0030000000002000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0020000000012000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0020000000002000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0380000000002000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0300000000012000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0300000000002000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0200000000012000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0200000000002000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x1C00000000002000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x1800000000012000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x1800000000002000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x1000000000012000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x1000000000002000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x4000000000002000L,0x0000000000000069L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x8000000000040000L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000000000000040L,0x000000000003FE00L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000000010010002L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x0000000000000040L,0x00000000000BFE00L});
    public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x0000000010000000L,0x0000000000080000L});

}