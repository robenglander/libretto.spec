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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'}'", "'profile'", "'project'", "'rootdir'", "'rootDir'", "'modules'", "'module'", "'dir'", "'specdir'", "'specDir'", "'testdir'", "'testDir'", "'maindir'", "'mainDir'", "'basepackage'", "'basePackage'", "'gen'", "'initialinstruction'", "'initialInstruction'", "'maxretries'", "'maxRetries'", "'parsecheck'", "'parseCheck'", "'defaultcorrection'", "'defaultCorrection'", "'true'", "'false'", "'rules'", "'rule'", "'pattern'", "'code'", "'correction'", "'default'", "'llmproviders'", "'llmProviders'", "'provider'", "'type'", "'model'", "'filepath'", "'filePath'", "'endpoint'", "'endPoint'", "'modelusage'", "'modelUsage'", "'primary'", "'secondary'", "'escalation'", "'enabled'", "'atretry'", "'atRetry'", "'surface'", "'for'", "'spec'", "'returnType'", "'method'", "'as'", "';'", "'paramType'", "'name'", "'recordSelfReturn'", "','", "'methodOverride'", "'returns'", "'.'", "'boolean'", "'int'", "'long'", "'double'", "'float'", "'short'", "'byte'", "'char'", "'void'", "'('", "')'", "'-'", "'_'"
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
    public static final int T__88=88;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__84=84;
    public static final int T__41=41;
    public static final int T__85=85;
    public static final int T__42=42;
    public static final int T__86=86;
    public static final int T__43=43;
    public static final int T__87=87;

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
    // InternalLibrettoProjectProfile.g:71:1: ruleProjectProfile returns [EObject current=null] : ( () ( (lv_profiles_1_0= ruleProfile ) )* ) ;
    public final EObject ruleProjectProfile() throws RecognitionException {
        EObject current = null;

        EObject lv_profiles_1_0 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:77:2: ( ( () ( (lv_profiles_1_0= ruleProfile ) )* ) )
            // InternalLibrettoProjectProfile.g:78:2: ( () ( (lv_profiles_1_0= ruleProfile ) )* )
            {
            // InternalLibrettoProjectProfile.g:78:2: ( () ( (lv_profiles_1_0= ruleProfile ) )* )
            // InternalLibrettoProjectProfile.g:79:3: () ( (lv_profiles_1_0= ruleProfile ) )*
            {
            // InternalLibrettoProjectProfile.g:79:3: ()
            // InternalLibrettoProjectProfile.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProjectProfileAccess().getProjectProfileAction_0(),
            					current);
            			

            }

            // InternalLibrettoProjectProfile.g:86:3: ( (lv_profiles_1_0= ruleProfile ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:87:4: (lv_profiles_1_0= ruleProfile )
            	    {
            	    // InternalLibrettoProjectProfile.g:87:4: (lv_profiles_1_0= ruleProfile )
            	    // InternalLibrettoProjectProfile.g:88:5: lv_profiles_1_0= ruleProfile
            	    {

            	    					newCompositeNode(grammarAccess.getProjectProfileAccess().getProfilesProfileParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_profiles_1_0=ruleProfile();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProjectProfileRule());
            	    					}
            	    					add(
            	    						current,
            	    						"profiles",
            	    						lv_profiles_1_0,
            	    						"com.robenglander.libretto.spec.LibrettoProjectProfile.Profile");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "ruleProjectProfile"


    // $ANTLR start "entryRuleProfile"
    // InternalLibrettoProjectProfile.g:109:1: entryRuleProfile returns [EObject current=null] : iv_ruleProfile= ruleProfile EOF ;
    public final EObject entryRuleProfile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProfile = null;


        try {
            // InternalLibrettoProjectProfile.g:109:48: (iv_ruleProfile= ruleProfile EOF )
            // InternalLibrettoProjectProfile.g:110:2: iv_ruleProfile= ruleProfile EOF
            {
             newCompositeNode(grammarAccess.getProfileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProfile=ruleProfile();

            state._fsp--;

             current =iv_ruleProfile; 
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
    // $ANTLR end "entryRuleProfile"


    // $ANTLR start "ruleProfile"
    // InternalLibrettoProjectProfile.g:116:1: ruleProfile returns [EObject current=null] : ( () ( (lv_profileKeyword_1_0= ruleProfileKeyword ) ) ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '{' ( ( (lv_projects_4_0= ruleProjectBlock ) ) | ( (lv_llmProviders_5_0= ruleLlmProvidersBlock ) ) | ( (lv_surfaces_6_0= ruleSurfaceBlock ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleProfile() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_7=null;
        EObject lv_profileKeyword_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_projects_4_0 = null;

        EObject lv_llmProviders_5_0 = null;

        EObject lv_surfaces_6_0 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:122:2: ( ( () ( (lv_profileKeyword_1_0= ruleProfileKeyword ) ) ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '{' ( ( (lv_projects_4_0= ruleProjectBlock ) ) | ( (lv_llmProviders_5_0= ruleLlmProvidersBlock ) ) | ( (lv_surfaces_6_0= ruleSurfaceBlock ) ) )* otherlv_7= '}' ) )
            // InternalLibrettoProjectProfile.g:123:2: ( () ( (lv_profileKeyword_1_0= ruleProfileKeyword ) ) ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '{' ( ( (lv_projects_4_0= ruleProjectBlock ) ) | ( (lv_llmProviders_5_0= ruleLlmProvidersBlock ) ) | ( (lv_surfaces_6_0= ruleSurfaceBlock ) ) )* otherlv_7= '}' )
            {
            // InternalLibrettoProjectProfile.g:123:2: ( () ( (lv_profileKeyword_1_0= ruleProfileKeyword ) ) ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '{' ( ( (lv_projects_4_0= ruleProjectBlock ) ) | ( (lv_llmProviders_5_0= ruleLlmProvidersBlock ) ) | ( (lv_surfaces_6_0= ruleSurfaceBlock ) ) )* otherlv_7= '}' )
            // InternalLibrettoProjectProfile.g:124:3: () ( (lv_profileKeyword_1_0= ruleProfileKeyword ) ) ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '{' ( ( (lv_projects_4_0= ruleProjectBlock ) ) | ( (lv_llmProviders_5_0= ruleLlmProvidersBlock ) ) | ( (lv_surfaces_6_0= ruleSurfaceBlock ) ) )* otherlv_7= '}'
            {
            // InternalLibrettoProjectProfile.g:124:3: ()
            // InternalLibrettoProjectProfile.g:125:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProfileAccess().getProfileAction_0(),
            					current);
            			

            }

            // InternalLibrettoProjectProfile.g:131:3: ( (lv_profileKeyword_1_0= ruleProfileKeyword ) )
            // InternalLibrettoProjectProfile.g:132:4: (lv_profileKeyword_1_0= ruleProfileKeyword )
            {
            // InternalLibrettoProjectProfile.g:132:4: (lv_profileKeyword_1_0= ruleProfileKeyword )
            // InternalLibrettoProjectProfile.g:133:5: lv_profileKeyword_1_0= ruleProfileKeyword
            {

            					newCompositeNode(grammarAccess.getProfileAccess().getProfileKeywordProfileKeywordParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_profileKeyword_1_0=ruleProfileKeyword();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProfileRule());
            					}
            					set(
            						current,
            						"profileKeyword",
            						lv_profileKeyword_1_0,
            						"com.robenglander.libretto.spec.LibrettoProjectProfile.ProfileKeyword");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLibrettoProjectProfile.g:150:3: ( (lv_name_2_0= ruleValidID ) )
            // InternalLibrettoProjectProfile.g:151:4: (lv_name_2_0= ruleValidID )
            {
            // InternalLibrettoProjectProfile.g:151:4: (lv_name_2_0= ruleValidID )
            // InternalLibrettoProjectProfile.g:152:5: lv_name_2_0= ruleValidID
            {

            					newCompositeNode(grammarAccess.getProfileAccess().getNameValidIDParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_2_0=ruleValidID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProfileRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"com.robenglander.libretto.spec.LibrettoProjectProfile.ValidID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,11,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getProfileAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalLibrettoProjectProfile.g:173:3: ( ( (lv_projects_4_0= ruleProjectBlock ) ) | ( (lv_llmProviders_5_0= ruleLlmProvidersBlock ) ) | ( (lv_surfaces_6_0= ruleSurfaceBlock ) ) )*
            loop2:
            do {
                int alt2=4;
                switch ( input.LA(1) ) {
                case 14:
                    {
                    alt2=1;
                    }
                    break;
                case 45:
                case 46:
                    {
                    alt2=2;
                    }
                    break;
                case 62:
                    {
                    alt2=3;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:174:4: ( (lv_projects_4_0= ruleProjectBlock ) )
            	    {
            	    // InternalLibrettoProjectProfile.g:174:4: ( (lv_projects_4_0= ruleProjectBlock ) )
            	    // InternalLibrettoProjectProfile.g:175:5: (lv_projects_4_0= ruleProjectBlock )
            	    {
            	    // InternalLibrettoProjectProfile.g:175:5: (lv_projects_4_0= ruleProjectBlock )
            	    // InternalLibrettoProjectProfile.g:176:6: lv_projects_4_0= ruleProjectBlock
            	    {

            	    						newCompositeNode(grammarAccess.getProfileAccess().getProjectsProjectBlockParserRuleCall_4_0_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_projects_4_0=ruleProjectBlock();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProfileRule());
            	    						}
            	    						add(
            	    							current,
            	    							"projects",
            	    							lv_projects_4_0,
            	    							"com.robenglander.libretto.spec.LibrettoProjectProfile.ProjectBlock");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalLibrettoProjectProfile.g:194:4: ( (lv_llmProviders_5_0= ruleLlmProvidersBlock ) )
            	    {
            	    // InternalLibrettoProjectProfile.g:194:4: ( (lv_llmProviders_5_0= ruleLlmProvidersBlock ) )
            	    // InternalLibrettoProjectProfile.g:195:5: (lv_llmProviders_5_0= ruleLlmProvidersBlock )
            	    {
            	    // InternalLibrettoProjectProfile.g:195:5: (lv_llmProviders_5_0= ruleLlmProvidersBlock )
            	    // InternalLibrettoProjectProfile.g:196:6: lv_llmProviders_5_0= ruleLlmProvidersBlock
            	    {

            	    						newCompositeNode(grammarAccess.getProfileAccess().getLlmProvidersLlmProvidersBlockParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_llmProviders_5_0=ruleLlmProvidersBlock();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProfileRule());
            	    						}
            	    						add(
            	    							current,
            	    							"llmProviders",
            	    							lv_llmProviders_5_0,
            	    							"com.robenglander.libretto.spec.LibrettoProjectProfile.LlmProvidersBlock");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalLibrettoProjectProfile.g:214:4: ( (lv_surfaces_6_0= ruleSurfaceBlock ) )
            	    {
            	    // InternalLibrettoProjectProfile.g:214:4: ( (lv_surfaces_6_0= ruleSurfaceBlock ) )
            	    // InternalLibrettoProjectProfile.g:215:5: (lv_surfaces_6_0= ruleSurfaceBlock )
            	    {
            	    // InternalLibrettoProjectProfile.g:215:5: (lv_surfaces_6_0= ruleSurfaceBlock )
            	    // InternalLibrettoProjectProfile.g:216:6: lv_surfaces_6_0= ruleSurfaceBlock
            	    {

            	    						newCompositeNode(grammarAccess.getProfileAccess().getSurfacesSurfaceBlockParserRuleCall_4_2_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_surfaces_6_0=ruleSurfaceBlock();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProfileRule());
            	    						}
            	    						add(
            	    							current,
            	    							"surfaces",
            	    							lv_surfaces_6_0,
            	    							"com.robenglander.libretto.spec.LibrettoProjectProfile.SurfaceBlock");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_7=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getProfileAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleProfile"


    // $ANTLR start "entryRuleProfileKeyword"
    // InternalLibrettoProjectProfile.g:242:1: entryRuleProfileKeyword returns [EObject current=null] : iv_ruleProfileKeyword= ruleProfileKeyword EOF ;
    public final EObject entryRuleProfileKeyword() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProfileKeyword = null;


        try {
            // InternalLibrettoProjectProfile.g:242:55: (iv_ruleProfileKeyword= ruleProfileKeyword EOF )
            // InternalLibrettoProjectProfile.g:243:2: iv_ruleProfileKeyword= ruleProfileKeyword EOF
            {
             newCompositeNode(grammarAccess.getProfileKeywordRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProfileKeyword=ruleProfileKeyword();

            state._fsp--;

             current =iv_ruleProfileKeyword; 
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
    // $ANTLR end "entryRuleProfileKeyword"


    // $ANTLR start "ruleProfileKeyword"
    // InternalLibrettoProjectProfile.g:249:1: ruleProfileKeyword returns [EObject current=null] : ( () ( (lv_keyword_1_0= 'profile' ) ) ) ;
    public final EObject ruleProfileKeyword() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_1_0=null;


        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:255:2: ( ( () ( (lv_keyword_1_0= 'profile' ) ) ) )
            // InternalLibrettoProjectProfile.g:256:2: ( () ( (lv_keyword_1_0= 'profile' ) ) )
            {
            // InternalLibrettoProjectProfile.g:256:2: ( () ( (lv_keyword_1_0= 'profile' ) ) )
            // InternalLibrettoProjectProfile.g:257:3: () ( (lv_keyword_1_0= 'profile' ) )
            {
            // InternalLibrettoProjectProfile.g:257:3: ()
            // InternalLibrettoProjectProfile.g:258:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProfileKeywordAccess().getProfileKeywordAction_0(),
            					current);
            			

            }

            // InternalLibrettoProjectProfile.g:264:3: ( (lv_keyword_1_0= 'profile' ) )
            // InternalLibrettoProjectProfile.g:265:4: (lv_keyword_1_0= 'profile' )
            {
            // InternalLibrettoProjectProfile.g:265:4: (lv_keyword_1_0= 'profile' )
            // InternalLibrettoProjectProfile.g:266:5: lv_keyword_1_0= 'profile'
            {
            lv_keyword_1_0=(Token)match(input,13,FOLLOW_2); 

            					newLeafNode(lv_keyword_1_0, grammarAccess.getProfileKeywordAccess().getKeywordProfileKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProfileKeywordRule());
            					}
            					setWithLastConsumed(current, "keyword", lv_keyword_1_0, "profile");
            				

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
    // $ANTLR end "ruleProfileKeyword"


    // $ANTLR start "entryRuleProjectBlock"
    // InternalLibrettoProjectProfile.g:282:1: entryRuleProjectBlock returns [EObject current=null] : iv_ruleProjectBlock= ruleProjectBlock EOF ;
    public final EObject entryRuleProjectBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProjectBlock = null;


        try {
            // InternalLibrettoProjectProfile.g:282:53: (iv_ruleProjectBlock= ruleProjectBlock EOF )
            // InternalLibrettoProjectProfile.g:283:2: iv_ruleProjectBlock= ruleProjectBlock EOF
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
    // InternalLibrettoProjectProfile.g:289:1: ruleProjectBlock returns [EObject current=null] : ( () ( (lv_projectKeyword_1_0= ruleProjectKeyword ) ) otherlv_2= '{' ( ( (lv_rootDirs_3_0= ruleRootDirectory ) ) | ( (lv_modules_4_0= ruleModulesBlock ) ) | ( (lv_gens_5_0= ruleGenBlock ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleProjectBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_projectKeyword_1_0 = null;

        EObject lv_rootDirs_3_0 = null;

        EObject lv_modules_4_0 = null;

        EObject lv_gens_5_0 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:295:2: ( ( () ( (lv_projectKeyword_1_0= ruleProjectKeyword ) ) otherlv_2= '{' ( ( (lv_rootDirs_3_0= ruleRootDirectory ) ) | ( (lv_modules_4_0= ruleModulesBlock ) ) | ( (lv_gens_5_0= ruleGenBlock ) ) )* otherlv_6= '}' ) )
            // InternalLibrettoProjectProfile.g:296:2: ( () ( (lv_projectKeyword_1_0= ruleProjectKeyword ) ) otherlv_2= '{' ( ( (lv_rootDirs_3_0= ruleRootDirectory ) ) | ( (lv_modules_4_0= ruleModulesBlock ) ) | ( (lv_gens_5_0= ruleGenBlock ) ) )* otherlv_6= '}' )
            {
            // InternalLibrettoProjectProfile.g:296:2: ( () ( (lv_projectKeyword_1_0= ruleProjectKeyword ) ) otherlv_2= '{' ( ( (lv_rootDirs_3_0= ruleRootDirectory ) ) | ( (lv_modules_4_0= ruleModulesBlock ) ) | ( (lv_gens_5_0= ruleGenBlock ) ) )* otherlv_6= '}' )
            // InternalLibrettoProjectProfile.g:297:3: () ( (lv_projectKeyword_1_0= ruleProjectKeyword ) ) otherlv_2= '{' ( ( (lv_rootDirs_3_0= ruleRootDirectory ) ) | ( (lv_modules_4_0= ruleModulesBlock ) ) | ( (lv_gens_5_0= ruleGenBlock ) ) )* otherlv_6= '}'
            {
            // InternalLibrettoProjectProfile.g:297:3: ()
            // InternalLibrettoProjectProfile.g:298:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProjectBlockAccess().getProjectBlockAction_0(),
            					current);
            			

            }

            // InternalLibrettoProjectProfile.g:304:3: ( (lv_projectKeyword_1_0= ruleProjectKeyword ) )
            // InternalLibrettoProjectProfile.g:305:4: (lv_projectKeyword_1_0= ruleProjectKeyword )
            {
            // InternalLibrettoProjectProfile.g:305:4: (lv_projectKeyword_1_0= ruleProjectKeyword )
            // InternalLibrettoProjectProfile.g:306:5: lv_projectKeyword_1_0= ruleProjectKeyword
            {

            					newCompositeNode(grammarAccess.getProjectBlockAccess().getProjectKeywordProjectKeywordParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_projectKeyword_1_0=ruleProjectKeyword();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProjectBlockRule());
            					}
            					set(
            						current,
            						"projectKeyword",
            						lv_projectKeyword_1_0,
            						"com.robenglander.libretto.spec.LibrettoProjectProfile.ProjectKeyword");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,11,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getProjectBlockAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLibrettoProjectProfile.g:327:3: ( ( (lv_rootDirs_3_0= ruleRootDirectory ) ) | ( (lv_modules_4_0= ruleModulesBlock ) ) | ( (lv_gens_5_0= ruleGenBlock ) ) )*
            loop3:
            do {
                int alt3=4;
                switch ( input.LA(1) ) {
                case 15:
                case 16:
                    {
                    alt3=1;
                    }
                    break;
                case 17:
                    {
                    alt3=2;
                    }
                    break;
                case 28:
                    {
                    alt3=3;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:328:4: ( (lv_rootDirs_3_0= ruleRootDirectory ) )
            	    {
            	    // InternalLibrettoProjectProfile.g:328:4: ( (lv_rootDirs_3_0= ruleRootDirectory ) )
            	    // InternalLibrettoProjectProfile.g:329:5: (lv_rootDirs_3_0= ruleRootDirectory )
            	    {
            	    // InternalLibrettoProjectProfile.g:329:5: (lv_rootDirs_3_0= ruleRootDirectory )
            	    // InternalLibrettoProjectProfile.g:330:6: lv_rootDirs_3_0= ruleRootDirectory
            	    {

            	    						newCompositeNode(grammarAccess.getProjectBlockAccess().getRootDirsRootDirectoryParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_rootDirs_3_0=ruleRootDirectory();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProjectBlockRule());
            	    						}
            	    						add(
            	    							current,
            	    							"rootDirs",
            	    							lv_rootDirs_3_0,
            	    							"com.robenglander.libretto.spec.LibrettoProjectProfile.RootDirectory");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalLibrettoProjectProfile.g:348:4: ( (lv_modules_4_0= ruleModulesBlock ) )
            	    {
            	    // InternalLibrettoProjectProfile.g:348:4: ( (lv_modules_4_0= ruleModulesBlock ) )
            	    // InternalLibrettoProjectProfile.g:349:5: (lv_modules_4_0= ruleModulesBlock )
            	    {
            	    // InternalLibrettoProjectProfile.g:349:5: (lv_modules_4_0= ruleModulesBlock )
            	    // InternalLibrettoProjectProfile.g:350:6: lv_modules_4_0= ruleModulesBlock
            	    {

            	    						newCompositeNode(grammarAccess.getProjectBlockAccess().getModulesModulesBlockParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_modules_4_0=ruleModulesBlock();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProjectBlockRule());
            	    						}
            	    						add(
            	    							current,
            	    							"modules",
            	    							lv_modules_4_0,
            	    							"com.robenglander.libretto.spec.LibrettoProjectProfile.ModulesBlock");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalLibrettoProjectProfile.g:368:4: ( (lv_gens_5_0= ruleGenBlock ) )
            	    {
            	    // InternalLibrettoProjectProfile.g:368:4: ( (lv_gens_5_0= ruleGenBlock ) )
            	    // InternalLibrettoProjectProfile.g:369:5: (lv_gens_5_0= ruleGenBlock )
            	    {
            	    // InternalLibrettoProjectProfile.g:369:5: (lv_gens_5_0= ruleGenBlock )
            	    // InternalLibrettoProjectProfile.g:370:6: lv_gens_5_0= ruleGenBlock
            	    {

            	    						newCompositeNode(grammarAccess.getProjectBlockAccess().getGensGenBlockParserRuleCall_3_2_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_gens_5_0=ruleGenBlock();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProjectBlockRule());
            	    						}
            	    						add(
            	    							current,
            	    							"gens",
            	    							lv_gens_5_0,
            	    							"com.robenglander.libretto.spec.LibrettoProjectProfile.GenBlock");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_6=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getProjectBlockAccess().getRightCurlyBracketKeyword_4());
            		

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


    // $ANTLR start "entryRuleRootDirectory"
    // InternalLibrettoProjectProfile.g:396:1: entryRuleRootDirectory returns [EObject current=null] : iv_ruleRootDirectory= ruleRootDirectory EOF ;
    public final EObject entryRuleRootDirectory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRootDirectory = null;


        try {
            // InternalLibrettoProjectProfile.g:396:54: (iv_ruleRootDirectory= ruleRootDirectory EOF )
            // InternalLibrettoProjectProfile.g:397:2: iv_ruleRootDirectory= ruleRootDirectory EOF
            {
             newCompositeNode(grammarAccess.getRootDirectoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRootDirectory=ruleRootDirectory();

            state._fsp--;

             current =iv_ruleRootDirectory; 
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
    // $ANTLR end "entryRuleRootDirectory"


    // $ANTLR start "ruleRootDirectory"
    // InternalLibrettoProjectProfile.g:403:1: ruleRootDirectory returns [EObject current=null] : ( () ( (lv_keyword_1_0= ruleRootDirKeyword ) ) ( (lv_dir_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleRootDirectory() throws RecognitionException {
        EObject current = null;

        Token lv_dir_2_0=null;
        EObject lv_keyword_1_0 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:409:2: ( ( () ( (lv_keyword_1_0= ruleRootDirKeyword ) ) ( (lv_dir_2_0= RULE_STRING ) ) ) )
            // InternalLibrettoProjectProfile.g:410:2: ( () ( (lv_keyword_1_0= ruleRootDirKeyword ) ) ( (lv_dir_2_0= RULE_STRING ) ) )
            {
            // InternalLibrettoProjectProfile.g:410:2: ( () ( (lv_keyword_1_0= ruleRootDirKeyword ) ) ( (lv_dir_2_0= RULE_STRING ) ) )
            // InternalLibrettoProjectProfile.g:411:3: () ( (lv_keyword_1_0= ruleRootDirKeyword ) ) ( (lv_dir_2_0= RULE_STRING ) )
            {
            // InternalLibrettoProjectProfile.g:411:3: ()
            // InternalLibrettoProjectProfile.g:412:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRootDirectoryAccess().getRootDirectoryAction_0(),
            					current);
            			

            }

            // InternalLibrettoProjectProfile.g:418:3: ( (lv_keyword_1_0= ruleRootDirKeyword ) )
            // InternalLibrettoProjectProfile.g:419:4: (lv_keyword_1_0= ruleRootDirKeyword )
            {
            // InternalLibrettoProjectProfile.g:419:4: (lv_keyword_1_0= ruleRootDirKeyword )
            // InternalLibrettoProjectProfile.g:420:5: lv_keyword_1_0= ruleRootDirKeyword
            {

            					newCompositeNode(grammarAccess.getRootDirectoryAccess().getKeywordRootDirKeywordParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_keyword_1_0=ruleRootDirKeyword();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRootDirectoryRule());
            					}
            					set(
            						current,
            						"keyword",
            						lv_keyword_1_0,
            						"com.robenglander.libretto.spec.LibrettoProjectProfile.RootDirKeyword");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLibrettoProjectProfile.g:437:3: ( (lv_dir_2_0= RULE_STRING ) )
            // InternalLibrettoProjectProfile.g:438:4: (lv_dir_2_0= RULE_STRING )
            {
            // InternalLibrettoProjectProfile.g:438:4: (lv_dir_2_0= RULE_STRING )
            // InternalLibrettoProjectProfile.g:439:5: lv_dir_2_0= RULE_STRING
            {
            lv_dir_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_dir_2_0, grammarAccess.getRootDirectoryAccess().getDirSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRootDirectoryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"dir",
            						lv_dir_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleRootDirectory"


    // $ANTLR start "entryRuleProjectKeyword"
    // InternalLibrettoProjectProfile.g:459:1: entryRuleProjectKeyword returns [EObject current=null] : iv_ruleProjectKeyword= ruleProjectKeyword EOF ;
    public final EObject entryRuleProjectKeyword() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProjectKeyword = null;


        try {
            // InternalLibrettoProjectProfile.g:459:55: (iv_ruleProjectKeyword= ruleProjectKeyword EOF )
            // InternalLibrettoProjectProfile.g:460:2: iv_ruleProjectKeyword= ruleProjectKeyword EOF
            {
             newCompositeNode(grammarAccess.getProjectKeywordRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProjectKeyword=ruleProjectKeyword();

            state._fsp--;

             current =iv_ruleProjectKeyword; 
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
    // $ANTLR end "entryRuleProjectKeyword"


    // $ANTLR start "ruleProjectKeyword"
    // InternalLibrettoProjectProfile.g:466:1: ruleProjectKeyword returns [EObject current=null] : ( () ( (lv_keyword_1_0= 'project' ) ) ) ;
    public final EObject ruleProjectKeyword() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_1_0=null;


        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:472:2: ( ( () ( (lv_keyword_1_0= 'project' ) ) ) )
            // InternalLibrettoProjectProfile.g:473:2: ( () ( (lv_keyword_1_0= 'project' ) ) )
            {
            // InternalLibrettoProjectProfile.g:473:2: ( () ( (lv_keyword_1_0= 'project' ) ) )
            // InternalLibrettoProjectProfile.g:474:3: () ( (lv_keyword_1_0= 'project' ) )
            {
            // InternalLibrettoProjectProfile.g:474:3: ()
            // InternalLibrettoProjectProfile.g:475:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProjectKeywordAccess().getProjectKeywordAction_0(),
            					current);
            			

            }

            // InternalLibrettoProjectProfile.g:481:3: ( (lv_keyword_1_0= 'project' ) )
            // InternalLibrettoProjectProfile.g:482:4: (lv_keyword_1_0= 'project' )
            {
            // InternalLibrettoProjectProfile.g:482:4: (lv_keyword_1_0= 'project' )
            // InternalLibrettoProjectProfile.g:483:5: lv_keyword_1_0= 'project'
            {
            lv_keyword_1_0=(Token)match(input,14,FOLLOW_2); 

            					newLeafNode(lv_keyword_1_0, grammarAccess.getProjectKeywordAccess().getKeywordProjectKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProjectKeywordRule());
            					}
            					setWithLastConsumed(current, "keyword", lv_keyword_1_0, "project");
            				

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
    // $ANTLR end "ruleProjectKeyword"


    // $ANTLR start "entryRuleRootDirKeyword"
    // InternalLibrettoProjectProfile.g:499:1: entryRuleRootDirKeyword returns [EObject current=null] : iv_ruleRootDirKeyword= ruleRootDirKeyword EOF ;
    public final EObject entryRuleRootDirKeyword() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRootDirKeyword = null;


        try {
            // InternalLibrettoProjectProfile.g:499:55: (iv_ruleRootDirKeyword= ruleRootDirKeyword EOF )
            // InternalLibrettoProjectProfile.g:500:2: iv_ruleRootDirKeyword= ruleRootDirKeyword EOF
            {
             newCompositeNode(grammarAccess.getRootDirKeywordRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRootDirKeyword=ruleRootDirKeyword();

            state._fsp--;

             current =iv_ruleRootDirKeyword; 
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
    // $ANTLR end "entryRuleRootDirKeyword"


    // $ANTLR start "ruleRootDirKeyword"
    // InternalLibrettoProjectProfile.g:506:1: ruleRootDirKeyword returns [EObject current=null] : ( () ( ( (lv_keyword_1_1= 'rootdir' | lv_keyword_1_2= 'rootDir' ) ) ) ) ;
    public final EObject ruleRootDirKeyword() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_1_1=null;
        Token lv_keyword_1_2=null;


        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:512:2: ( ( () ( ( (lv_keyword_1_1= 'rootdir' | lv_keyword_1_2= 'rootDir' ) ) ) ) )
            // InternalLibrettoProjectProfile.g:513:2: ( () ( ( (lv_keyword_1_1= 'rootdir' | lv_keyword_1_2= 'rootDir' ) ) ) )
            {
            // InternalLibrettoProjectProfile.g:513:2: ( () ( ( (lv_keyword_1_1= 'rootdir' | lv_keyword_1_2= 'rootDir' ) ) ) )
            // InternalLibrettoProjectProfile.g:514:3: () ( ( (lv_keyword_1_1= 'rootdir' | lv_keyword_1_2= 'rootDir' ) ) )
            {
            // InternalLibrettoProjectProfile.g:514:3: ()
            // InternalLibrettoProjectProfile.g:515:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRootDirKeywordAccess().getRootDirKeywordAction_0(),
            					current);
            			

            }

            // InternalLibrettoProjectProfile.g:521:3: ( ( (lv_keyword_1_1= 'rootdir' | lv_keyword_1_2= 'rootDir' ) ) )
            // InternalLibrettoProjectProfile.g:522:4: ( (lv_keyword_1_1= 'rootdir' | lv_keyword_1_2= 'rootDir' ) )
            {
            // InternalLibrettoProjectProfile.g:522:4: ( (lv_keyword_1_1= 'rootdir' | lv_keyword_1_2= 'rootDir' ) )
            // InternalLibrettoProjectProfile.g:523:5: (lv_keyword_1_1= 'rootdir' | lv_keyword_1_2= 'rootDir' )
            {
            // InternalLibrettoProjectProfile.g:523:5: (lv_keyword_1_1= 'rootdir' | lv_keyword_1_2= 'rootDir' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            else if ( (LA4_0==16) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:524:6: lv_keyword_1_1= 'rootdir'
                    {
                    lv_keyword_1_1=(Token)match(input,15,FOLLOW_2); 

                    						newLeafNode(lv_keyword_1_1, grammarAccess.getRootDirKeywordAccess().getKeywordRootdirKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRootDirKeywordRule());
                    						}
                    						setWithLastConsumed(current, "keyword", lv_keyword_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalLibrettoProjectProfile.g:535:6: lv_keyword_1_2= 'rootDir'
                    {
                    lv_keyword_1_2=(Token)match(input,16,FOLLOW_2); 

                    						newLeafNode(lv_keyword_1_2, grammarAccess.getRootDirKeywordAccess().getKeywordRootDirKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRootDirKeywordRule());
                    						}
                    						setWithLastConsumed(current, "keyword", lv_keyword_1_2, null);
                    					

                    }
                    break;

            }


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
    // $ANTLR end "ruleRootDirKeyword"


    // $ANTLR start "entryRuleModulesBlock"
    // InternalLibrettoProjectProfile.g:552:1: entryRuleModulesBlock returns [EObject current=null] : iv_ruleModulesBlock= ruleModulesBlock EOF ;
    public final EObject entryRuleModulesBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModulesBlock = null;


        try {
            // InternalLibrettoProjectProfile.g:552:53: (iv_ruleModulesBlock= ruleModulesBlock EOF )
            // InternalLibrettoProjectProfile.g:553:2: iv_ruleModulesBlock= ruleModulesBlock EOF
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
    // InternalLibrettoProjectProfile.g:559:1: ruleModulesBlock returns [EObject current=null] : ( () ( (lv_modulesKeyword_1_0= ruleModulesKeyword ) ) otherlv_2= '{' ( (lv_modules_3_0= ruleProjectModule ) )* otherlv_4= '}' ) ;
    public final EObject ruleModulesBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_modulesKeyword_1_0 = null;

        EObject lv_modules_3_0 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:565:2: ( ( () ( (lv_modulesKeyword_1_0= ruleModulesKeyword ) ) otherlv_2= '{' ( (lv_modules_3_0= ruleProjectModule ) )* otherlv_4= '}' ) )
            // InternalLibrettoProjectProfile.g:566:2: ( () ( (lv_modulesKeyword_1_0= ruleModulesKeyword ) ) otherlv_2= '{' ( (lv_modules_3_0= ruleProjectModule ) )* otherlv_4= '}' )
            {
            // InternalLibrettoProjectProfile.g:566:2: ( () ( (lv_modulesKeyword_1_0= ruleModulesKeyword ) ) otherlv_2= '{' ( (lv_modules_3_0= ruleProjectModule ) )* otherlv_4= '}' )
            // InternalLibrettoProjectProfile.g:567:3: () ( (lv_modulesKeyword_1_0= ruleModulesKeyword ) ) otherlv_2= '{' ( (lv_modules_3_0= ruleProjectModule ) )* otherlv_4= '}'
            {
            // InternalLibrettoProjectProfile.g:567:3: ()
            // InternalLibrettoProjectProfile.g:568:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getModulesBlockAccess().getModulesBlockAction_0(),
            					current);
            			

            }

            // InternalLibrettoProjectProfile.g:574:3: ( (lv_modulesKeyword_1_0= ruleModulesKeyword ) )
            // InternalLibrettoProjectProfile.g:575:4: (lv_modulesKeyword_1_0= ruleModulesKeyword )
            {
            // InternalLibrettoProjectProfile.g:575:4: (lv_modulesKeyword_1_0= ruleModulesKeyword )
            // InternalLibrettoProjectProfile.g:576:5: lv_modulesKeyword_1_0= ruleModulesKeyword
            {

            					newCompositeNode(grammarAccess.getModulesBlockAccess().getModulesKeywordModulesKeywordParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_modulesKeyword_1_0=ruleModulesKeyword();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModulesBlockRule());
            					}
            					set(
            						current,
            						"modulesKeyword",
            						lv_modulesKeyword_1_0,
            						"com.robenglander.libretto.spec.LibrettoProjectProfile.ModulesKeyword");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,11,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getModulesBlockAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLibrettoProjectProfile.g:597:3: ( (lv_modules_3_0= ruleProjectModule ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:598:4: (lv_modules_3_0= ruleProjectModule )
            	    {
            	    // InternalLibrettoProjectProfile.g:598:4: (lv_modules_3_0= ruleProjectModule )
            	    // InternalLibrettoProjectProfile.g:599:5: lv_modules_3_0= ruleProjectModule
            	    {

            	    					newCompositeNode(grammarAccess.getModulesBlockAccess().getModulesProjectModuleParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_modules_3_0=ruleProjectModule();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModulesBlockRule());
            	    					}
            	    					add(
            	    						current,
            	    						"modules",
            	    						lv_modules_3_0,
            	    						"com.robenglander.libretto.spec.LibrettoProjectProfile.ProjectModule");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_4=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getModulesBlockAccess().getRightCurlyBracketKeyword_4());
            		

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


    // $ANTLR start "entryRuleModulesKeyword"
    // InternalLibrettoProjectProfile.g:624:1: entryRuleModulesKeyword returns [EObject current=null] : iv_ruleModulesKeyword= ruleModulesKeyword EOF ;
    public final EObject entryRuleModulesKeyword() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModulesKeyword = null;


        try {
            // InternalLibrettoProjectProfile.g:624:55: (iv_ruleModulesKeyword= ruleModulesKeyword EOF )
            // InternalLibrettoProjectProfile.g:625:2: iv_ruleModulesKeyword= ruleModulesKeyword EOF
            {
             newCompositeNode(grammarAccess.getModulesKeywordRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModulesKeyword=ruleModulesKeyword();

            state._fsp--;

             current =iv_ruleModulesKeyword; 
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
    // $ANTLR end "entryRuleModulesKeyword"


    // $ANTLR start "ruleModulesKeyword"
    // InternalLibrettoProjectProfile.g:631:1: ruleModulesKeyword returns [EObject current=null] : ( () ( (lv_keyword_1_0= 'modules' ) ) ) ;
    public final EObject ruleModulesKeyword() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_1_0=null;


        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:637:2: ( ( () ( (lv_keyword_1_0= 'modules' ) ) ) )
            // InternalLibrettoProjectProfile.g:638:2: ( () ( (lv_keyword_1_0= 'modules' ) ) )
            {
            // InternalLibrettoProjectProfile.g:638:2: ( () ( (lv_keyword_1_0= 'modules' ) ) )
            // InternalLibrettoProjectProfile.g:639:3: () ( (lv_keyword_1_0= 'modules' ) )
            {
            // InternalLibrettoProjectProfile.g:639:3: ()
            // InternalLibrettoProjectProfile.g:640:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getModulesKeywordAccess().getModulesKeywordAction_0(),
            					current);
            			

            }

            // InternalLibrettoProjectProfile.g:646:3: ( (lv_keyword_1_0= 'modules' ) )
            // InternalLibrettoProjectProfile.g:647:4: (lv_keyword_1_0= 'modules' )
            {
            // InternalLibrettoProjectProfile.g:647:4: (lv_keyword_1_0= 'modules' )
            // InternalLibrettoProjectProfile.g:648:5: lv_keyword_1_0= 'modules'
            {
            lv_keyword_1_0=(Token)match(input,17,FOLLOW_2); 

            					newLeafNode(lv_keyword_1_0, grammarAccess.getModulesKeywordAccess().getKeywordModulesKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModulesKeywordRule());
            					}
            					setWithLastConsumed(current, "keyword", lv_keyword_1_0, "modules");
            				

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
    // $ANTLR end "ruleModulesKeyword"


    // $ANTLR start "entryRuleProjectModule"
    // InternalLibrettoProjectProfile.g:664:1: entryRuleProjectModule returns [EObject current=null] : iv_ruleProjectModule= ruleProjectModule EOF ;
    public final EObject entryRuleProjectModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProjectModule = null;


        try {
            // InternalLibrettoProjectProfile.g:664:54: (iv_ruleProjectModule= ruleProjectModule EOF )
            // InternalLibrettoProjectProfile.g:665:2: iv_ruleProjectModule= ruleProjectModule EOF
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
    // InternalLibrettoProjectProfile.g:671:1: ruleProjectModule returns [EObject current=null] : ( ( (lv_keyword_0_0= ruleModuleKeyword ) ) ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( ( (lv_dirs_3_0= ruleDirectory ) ) | ( (lv_specDirs_4_0= ruleSpecDirectory ) ) | ( (lv_testDirs_5_0= ruleTestDirectory ) ) | ( (lv_mainDirs_6_0= ruleMainDirectory ) ) | ( (lv_basePackages_7_0= ruleBasePackage ) ) )* otherlv_8= '}' ) ;
    public final EObject ruleProjectModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_8=null;
        EObject lv_keyword_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_dirs_3_0 = null;

        EObject lv_specDirs_4_0 = null;

        EObject lv_testDirs_5_0 = null;

        EObject lv_mainDirs_6_0 = null;

        EObject lv_basePackages_7_0 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:677:2: ( ( ( (lv_keyword_0_0= ruleModuleKeyword ) ) ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( ( (lv_dirs_3_0= ruleDirectory ) ) | ( (lv_specDirs_4_0= ruleSpecDirectory ) ) | ( (lv_testDirs_5_0= ruleTestDirectory ) ) | ( (lv_mainDirs_6_0= ruleMainDirectory ) ) | ( (lv_basePackages_7_0= ruleBasePackage ) ) )* otherlv_8= '}' ) )
            // InternalLibrettoProjectProfile.g:678:2: ( ( (lv_keyword_0_0= ruleModuleKeyword ) ) ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( ( (lv_dirs_3_0= ruleDirectory ) ) | ( (lv_specDirs_4_0= ruleSpecDirectory ) ) | ( (lv_testDirs_5_0= ruleTestDirectory ) ) | ( (lv_mainDirs_6_0= ruleMainDirectory ) ) | ( (lv_basePackages_7_0= ruleBasePackage ) ) )* otherlv_8= '}' )
            {
            // InternalLibrettoProjectProfile.g:678:2: ( ( (lv_keyword_0_0= ruleModuleKeyword ) ) ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( ( (lv_dirs_3_0= ruleDirectory ) ) | ( (lv_specDirs_4_0= ruleSpecDirectory ) ) | ( (lv_testDirs_5_0= ruleTestDirectory ) ) | ( (lv_mainDirs_6_0= ruleMainDirectory ) ) | ( (lv_basePackages_7_0= ruleBasePackage ) ) )* otherlv_8= '}' )
            // InternalLibrettoProjectProfile.g:679:3: ( (lv_keyword_0_0= ruleModuleKeyword ) ) ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( ( (lv_dirs_3_0= ruleDirectory ) ) | ( (lv_specDirs_4_0= ruleSpecDirectory ) ) | ( (lv_testDirs_5_0= ruleTestDirectory ) ) | ( (lv_mainDirs_6_0= ruleMainDirectory ) ) | ( (lv_basePackages_7_0= ruleBasePackage ) ) )* otherlv_8= '}'
            {
            // InternalLibrettoProjectProfile.g:679:3: ( (lv_keyword_0_0= ruleModuleKeyword ) )
            // InternalLibrettoProjectProfile.g:680:4: (lv_keyword_0_0= ruleModuleKeyword )
            {
            // InternalLibrettoProjectProfile.g:680:4: (lv_keyword_0_0= ruleModuleKeyword )
            // InternalLibrettoProjectProfile.g:681:5: lv_keyword_0_0= ruleModuleKeyword
            {

            					newCompositeNode(grammarAccess.getProjectModuleAccess().getKeywordModuleKeywordParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_keyword_0_0=ruleModuleKeyword();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProjectModuleRule());
            					}
            					set(
            						current,
            						"keyword",
            						lv_keyword_0_0,
            						"com.robenglander.libretto.spec.LibrettoProjectProfile.ModuleKeyword");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLibrettoProjectProfile.g:698:3: ( (lv_name_1_0= ruleValidID ) )
            // InternalLibrettoProjectProfile.g:699:4: (lv_name_1_0= ruleValidID )
            {
            // InternalLibrettoProjectProfile.g:699:4: (lv_name_1_0= ruleValidID )
            // InternalLibrettoProjectProfile.g:700:5: lv_name_1_0= ruleValidID
            {

            					newCompositeNode(grammarAccess.getProjectModuleAccess().getNameValidIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_1_0=ruleValidID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProjectModuleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"com.robenglander.libretto.spec.LibrettoProjectProfile.ValidID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,11,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getProjectModuleAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLibrettoProjectProfile.g:721:3: ( ( (lv_dirs_3_0= ruleDirectory ) ) | ( (lv_specDirs_4_0= ruleSpecDirectory ) ) | ( (lv_testDirs_5_0= ruleTestDirectory ) ) | ( (lv_mainDirs_6_0= ruleMainDirectory ) ) | ( (lv_basePackages_7_0= ruleBasePackage ) ) )*
            loop6:
            do {
                int alt6=6;
                switch ( input.LA(1) ) {
                case 19:
                    {
                    alt6=1;
                    }
                    break;
                case 20:
                case 21:
                    {
                    alt6=2;
                    }
                    break;
                case 22:
                case 23:
                    {
                    alt6=3;
                    }
                    break;
                case 24:
                case 25:
                    {
                    alt6=4;
                    }
                    break;
                case 26:
                case 27:
                    {
                    alt6=5;
                    }
                    break;

                }

                switch (alt6) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:722:4: ( (lv_dirs_3_0= ruleDirectory ) )
            	    {
            	    // InternalLibrettoProjectProfile.g:722:4: ( (lv_dirs_3_0= ruleDirectory ) )
            	    // InternalLibrettoProjectProfile.g:723:5: (lv_dirs_3_0= ruleDirectory )
            	    {
            	    // InternalLibrettoProjectProfile.g:723:5: (lv_dirs_3_0= ruleDirectory )
            	    // InternalLibrettoProjectProfile.g:724:6: lv_dirs_3_0= ruleDirectory
            	    {

            	    						newCompositeNode(grammarAccess.getProjectModuleAccess().getDirsDirectoryParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_dirs_3_0=ruleDirectory();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProjectModuleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"dirs",
            	    							lv_dirs_3_0,
            	    							"com.robenglander.libretto.spec.LibrettoProjectProfile.Directory");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalLibrettoProjectProfile.g:742:4: ( (lv_specDirs_4_0= ruleSpecDirectory ) )
            	    {
            	    // InternalLibrettoProjectProfile.g:742:4: ( (lv_specDirs_4_0= ruleSpecDirectory ) )
            	    // InternalLibrettoProjectProfile.g:743:5: (lv_specDirs_4_0= ruleSpecDirectory )
            	    {
            	    // InternalLibrettoProjectProfile.g:743:5: (lv_specDirs_4_0= ruleSpecDirectory )
            	    // InternalLibrettoProjectProfile.g:744:6: lv_specDirs_4_0= ruleSpecDirectory
            	    {

            	    						newCompositeNode(grammarAccess.getProjectModuleAccess().getSpecDirsSpecDirectoryParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_specDirs_4_0=ruleSpecDirectory();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProjectModuleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"specDirs",
            	    							lv_specDirs_4_0,
            	    							"com.robenglander.libretto.spec.LibrettoProjectProfile.SpecDirectory");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalLibrettoProjectProfile.g:762:4: ( (lv_testDirs_5_0= ruleTestDirectory ) )
            	    {
            	    // InternalLibrettoProjectProfile.g:762:4: ( (lv_testDirs_5_0= ruleTestDirectory ) )
            	    // InternalLibrettoProjectProfile.g:763:5: (lv_testDirs_5_0= ruleTestDirectory )
            	    {
            	    // InternalLibrettoProjectProfile.g:763:5: (lv_testDirs_5_0= ruleTestDirectory )
            	    // InternalLibrettoProjectProfile.g:764:6: lv_testDirs_5_0= ruleTestDirectory
            	    {

            	    						newCompositeNode(grammarAccess.getProjectModuleAccess().getTestDirsTestDirectoryParserRuleCall_3_2_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_testDirs_5_0=ruleTestDirectory();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProjectModuleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"testDirs",
            	    							lv_testDirs_5_0,
            	    							"com.robenglander.libretto.spec.LibrettoProjectProfile.TestDirectory");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalLibrettoProjectProfile.g:782:4: ( (lv_mainDirs_6_0= ruleMainDirectory ) )
            	    {
            	    // InternalLibrettoProjectProfile.g:782:4: ( (lv_mainDirs_6_0= ruleMainDirectory ) )
            	    // InternalLibrettoProjectProfile.g:783:5: (lv_mainDirs_6_0= ruleMainDirectory )
            	    {
            	    // InternalLibrettoProjectProfile.g:783:5: (lv_mainDirs_6_0= ruleMainDirectory )
            	    // InternalLibrettoProjectProfile.g:784:6: lv_mainDirs_6_0= ruleMainDirectory
            	    {

            	    						newCompositeNode(grammarAccess.getProjectModuleAccess().getMainDirsMainDirectoryParserRuleCall_3_3_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_mainDirs_6_0=ruleMainDirectory();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProjectModuleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"mainDirs",
            	    							lv_mainDirs_6_0,
            	    							"com.robenglander.libretto.spec.LibrettoProjectProfile.MainDirectory");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalLibrettoProjectProfile.g:802:4: ( (lv_basePackages_7_0= ruleBasePackage ) )
            	    {
            	    // InternalLibrettoProjectProfile.g:802:4: ( (lv_basePackages_7_0= ruleBasePackage ) )
            	    // InternalLibrettoProjectProfile.g:803:5: (lv_basePackages_7_0= ruleBasePackage )
            	    {
            	    // InternalLibrettoProjectProfile.g:803:5: (lv_basePackages_7_0= ruleBasePackage )
            	    // InternalLibrettoProjectProfile.g:804:6: lv_basePackages_7_0= ruleBasePackage
            	    {

            	    						newCompositeNode(grammarAccess.getProjectModuleAccess().getBasePackagesBasePackageParserRuleCall_3_4_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_basePackages_7_0=ruleBasePackage();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProjectModuleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"basePackages",
            	    							lv_basePackages_7_0,
            	    							"com.robenglander.libretto.spec.LibrettoProjectProfile.BasePackage");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_8=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getProjectModuleAccess().getRightCurlyBracketKeyword_4());
            		

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


    // $ANTLR start "entryRuleModuleKeyword"
    // InternalLibrettoProjectProfile.g:830:1: entryRuleModuleKeyword returns [EObject current=null] : iv_ruleModuleKeyword= ruleModuleKeyword EOF ;
    public final EObject entryRuleModuleKeyword() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModuleKeyword = null;


        try {
            // InternalLibrettoProjectProfile.g:830:54: (iv_ruleModuleKeyword= ruleModuleKeyword EOF )
            // InternalLibrettoProjectProfile.g:831:2: iv_ruleModuleKeyword= ruleModuleKeyword EOF
            {
             newCompositeNode(grammarAccess.getModuleKeywordRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModuleKeyword=ruleModuleKeyword();

            state._fsp--;

             current =iv_ruleModuleKeyword; 
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
    // $ANTLR end "entryRuleModuleKeyword"


    // $ANTLR start "ruleModuleKeyword"
    // InternalLibrettoProjectProfile.g:837:1: ruleModuleKeyword returns [EObject current=null] : ( () ( (lv_keyword_1_0= 'module' ) ) ) ;
    public final EObject ruleModuleKeyword() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_1_0=null;


        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:843:2: ( ( () ( (lv_keyword_1_0= 'module' ) ) ) )
            // InternalLibrettoProjectProfile.g:844:2: ( () ( (lv_keyword_1_0= 'module' ) ) )
            {
            // InternalLibrettoProjectProfile.g:844:2: ( () ( (lv_keyword_1_0= 'module' ) ) )
            // InternalLibrettoProjectProfile.g:845:3: () ( (lv_keyword_1_0= 'module' ) )
            {
            // InternalLibrettoProjectProfile.g:845:3: ()
            // InternalLibrettoProjectProfile.g:846:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getModuleKeywordAccess().getModuleKeywordAction_0(),
            					current);
            			

            }

            // InternalLibrettoProjectProfile.g:852:3: ( (lv_keyword_1_0= 'module' ) )
            // InternalLibrettoProjectProfile.g:853:4: (lv_keyword_1_0= 'module' )
            {
            // InternalLibrettoProjectProfile.g:853:4: (lv_keyword_1_0= 'module' )
            // InternalLibrettoProjectProfile.g:854:5: lv_keyword_1_0= 'module'
            {
            lv_keyword_1_0=(Token)match(input,18,FOLLOW_2); 

            					newLeafNode(lv_keyword_1_0, grammarAccess.getModuleKeywordAccess().getKeywordModuleKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModuleKeywordRule());
            					}
            					setWithLastConsumed(current, "keyword", lv_keyword_1_0, "module");
            				

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
    // $ANTLR end "ruleModuleKeyword"


    // $ANTLR start "entryRuleDirectory"
    // InternalLibrettoProjectProfile.g:870:1: entryRuleDirectory returns [EObject current=null] : iv_ruleDirectory= ruleDirectory EOF ;
    public final EObject entryRuleDirectory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirectory = null;


        try {
            // InternalLibrettoProjectProfile.g:870:50: (iv_ruleDirectory= ruleDirectory EOF )
            // InternalLibrettoProjectProfile.g:871:2: iv_ruleDirectory= ruleDirectory EOF
            {
             newCompositeNode(grammarAccess.getDirectoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDirectory=ruleDirectory();

            state._fsp--;

             current =iv_ruleDirectory; 
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
    // $ANTLR end "entryRuleDirectory"


    // $ANTLR start "ruleDirectory"
    // InternalLibrettoProjectProfile.g:877:1: ruleDirectory returns [EObject current=null] : ( () ( (lv_keyword_1_0= ruleDirKeyword ) ) ( (lv_dir_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleDirectory() throws RecognitionException {
        EObject current = null;

        Token lv_dir_2_0=null;
        EObject lv_keyword_1_0 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:883:2: ( ( () ( (lv_keyword_1_0= ruleDirKeyword ) ) ( (lv_dir_2_0= RULE_STRING ) ) ) )
            // InternalLibrettoProjectProfile.g:884:2: ( () ( (lv_keyword_1_0= ruleDirKeyword ) ) ( (lv_dir_2_0= RULE_STRING ) ) )
            {
            // InternalLibrettoProjectProfile.g:884:2: ( () ( (lv_keyword_1_0= ruleDirKeyword ) ) ( (lv_dir_2_0= RULE_STRING ) ) )
            // InternalLibrettoProjectProfile.g:885:3: () ( (lv_keyword_1_0= ruleDirKeyword ) ) ( (lv_dir_2_0= RULE_STRING ) )
            {
            // InternalLibrettoProjectProfile.g:885:3: ()
            // InternalLibrettoProjectProfile.g:886:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDirectoryAccess().getDirectoryAction_0(),
            					current);
            			

            }

            // InternalLibrettoProjectProfile.g:892:3: ( (lv_keyword_1_0= ruleDirKeyword ) )
            // InternalLibrettoProjectProfile.g:893:4: (lv_keyword_1_0= ruleDirKeyword )
            {
            // InternalLibrettoProjectProfile.g:893:4: (lv_keyword_1_0= ruleDirKeyword )
            // InternalLibrettoProjectProfile.g:894:5: lv_keyword_1_0= ruleDirKeyword
            {

            					newCompositeNode(grammarAccess.getDirectoryAccess().getKeywordDirKeywordParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_keyword_1_0=ruleDirKeyword();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDirectoryRule());
            					}
            					set(
            						current,
            						"keyword",
            						lv_keyword_1_0,
            						"com.robenglander.libretto.spec.LibrettoProjectProfile.DirKeyword");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLibrettoProjectProfile.g:911:3: ( (lv_dir_2_0= RULE_STRING ) )
            // InternalLibrettoProjectProfile.g:912:4: (lv_dir_2_0= RULE_STRING )
            {
            // InternalLibrettoProjectProfile.g:912:4: (lv_dir_2_0= RULE_STRING )
            // InternalLibrettoProjectProfile.g:913:5: lv_dir_2_0= RULE_STRING
            {
            lv_dir_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_dir_2_0, grammarAccess.getDirectoryAccess().getDirSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDirectoryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"dir",
            						lv_dir_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleDirectory"


    // $ANTLR start "entryRuleSpecDirectory"
    // InternalLibrettoProjectProfile.g:933:1: entryRuleSpecDirectory returns [EObject current=null] : iv_ruleSpecDirectory= ruleSpecDirectory EOF ;
    public final EObject entryRuleSpecDirectory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecDirectory = null;


        try {
            // InternalLibrettoProjectProfile.g:933:54: (iv_ruleSpecDirectory= ruleSpecDirectory EOF )
            // InternalLibrettoProjectProfile.g:934:2: iv_ruleSpecDirectory= ruleSpecDirectory EOF
            {
             newCompositeNode(grammarAccess.getSpecDirectoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpecDirectory=ruleSpecDirectory();

            state._fsp--;

             current =iv_ruleSpecDirectory; 
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
    // $ANTLR end "entryRuleSpecDirectory"


    // $ANTLR start "ruleSpecDirectory"
    // InternalLibrettoProjectProfile.g:940:1: ruleSpecDirectory returns [EObject current=null] : ( () ( (lv_keyword_1_0= ruleSpecDirKeyword ) ) ( (lv_dir_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleSpecDirectory() throws RecognitionException {
        EObject current = null;

        Token lv_dir_2_0=null;
        EObject lv_keyword_1_0 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:946:2: ( ( () ( (lv_keyword_1_0= ruleSpecDirKeyword ) ) ( (lv_dir_2_0= RULE_STRING ) ) ) )
            // InternalLibrettoProjectProfile.g:947:2: ( () ( (lv_keyword_1_0= ruleSpecDirKeyword ) ) ( (lv_dir_2_0= RULE_STRING ) ) )
            {
            // InternalLibrettoProjectProfile.g:947:2: ( () ( (lv_keyword_1_0= ruleSpecDirKeyword ) ) ( (lv_dir_2_0= RULE_STRING ) ) )
            // InternalLibrettoProjectProfile.g:948:3: () ( (lv_keyword_1_0= ruleSpecDirKeyword ) ) ( (lv_dir_2_0= RULE_STRING ) )
            {
            // InternalLibrettoProjectProfile.g:948:3: ()
            // InternalLibrettoProjectProfile.g:949:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSpecDirectoryAccess().getSpecDirectoryAction_0(),
            					current);
            			

            }

            // InternalLibrettoProjectProfile.g:955:3: ( (lv_keyword_1_0= ruleSpecDirKeyword ) )
            // InternalLibrettoProjectProfile.g:956:4: (lv_keyword_1_0= ruleSpecDirKeyword )
            {
            // InternalLibrettoProjectProfile.g:956:4: (lv_keyword_1_0= ruleSpecDirKeyword )
            // InternalLibrettoProjectProfile.g:957:5: lv_keyword_1_0= ruleSpecDirKeyword
            {

            					newCompositeNode(grammarAccess.getSpecDirectoryAccess().getKeywordSpecDirKeywordParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_keyword_1_0=ruleSpecDirKeyword();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSpecDirectoryRule());
            					}
            					set(
            						current,
            						"keyword",
            						lv_keyword_1_0,
            						"com.robenglander.libretto.spec.LibrettoProjectProfile.SpecDirKeyword");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLibrettoProjectProfile.g:974:3: ( (lv_dir_2_0= RULE_STRING ) )
            // InternalLibrettoProjectProfile.g:975:4: (lv_dir_2_0= RULE_STRING )
            {
            // InternalLibrettoProjectProfile.g:975:4: (lv_dir_2_0= RULE_STRING )
            // InternalLibrettoProjectProfile.g:976:5: lv_dir_2_0= RULE_STRING
            {
            lv_dir_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_dir_2_0, grammarAccess.getSpecDirectoryAccess().getDirSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSpecDirectoryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"dir",
            						lv_dir_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleSpecDirectory"


    // $ANTLR start "entryRuleTestDirectory"
    // InternalLibrettoProjectProfile.g:996:1: entryRuleTestDirectory returns [EObject current=null] : iv_ruleTestDirectory= ruleTestDirectory EOF ;
    public final EObject entryRuleTestDirectory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestDirectory = null;


        try {
            // InternalLibrettoProjectProfile.g:996:54: (iv_ruleTestDirectory= ruleTestDirectory EOF )
            // InternalLibrettoProjectProfile.g:997:2: iv_ruleTestDirectory= ruleTestDirectory EOF
            {
             newCompositeNode(grammarAccess.getTestDirectoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTestDirectory=ruleTestDirectory();

            state._fsp--;

             current =iv_ruleTestDirectory; 
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
    // $ANTLR end "entryRuleTestDirectory"


    // $ANTLR start "ruleTestDirectory"
    // InternalLibrettoProjectProfile.g:1003:1: ruleTestDirectory returns [EObject current=null] : ( () ( (lv_keyword_1_0= ruleTestDirKeyword ) ) ( (lv_dir_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleTestDirectory() throws RecognitionException {
        EObject current = null;

        Token lv_dir_2_0=null;
        EObject lv_keyword_1_0 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:1009:2: ( ( () ( (lv_keyword_1_0= ruleTestDirKeyword ) ) ( (lv_dir_2_0= RULE_STRING ) ) ) )
            // InternalLibrettoProjectProfile.g:1010:2: ( () ( (lv_keyword_1_0= ruleTestDirKeyword ) ) ( (lv_dir_2_0= RULE_STRING ) ) )
            {
            // InternalLibrettoProjectProfile.g:1010:2: ( () ( (lv_keyword_1_0= ruleTestDirKeyword ) ) ( (lv_dir_2_0= RULE_STRING ) ) )
            // InternalLibrettoProjectProfile.g:1011:3: () ( (lv_keyword_1_0= ruleTestDirKeyword ) ) ( (lv_dir_2_0= RULE_STRING ) )
            {
            // InternalLibrettoProjectProfile.g:1011:3: ()
            // InternalLibrettoProjectProfile.g:1012:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTestDirectoryAccess().getTestDirectoryAction_0(),
            					current);
            			

            }

            // InternalLibrettoProjectProfile.g:1018:3: ( (lv_keyword_1_0= ruleTestDirKeyword ) )
            // InternalLibrettoProjectProfile.g:1019:4: (lv_keyword_1_0= ruleTestDirKeyword )
            {
            // InternalLibrettoProjectProfile.g:1019:4: (lv_keyword_1_0= ruleTestDirKeyword )
            // InternalLibrettoProjectProfile.g:1020:5: lv_keyword_1_0= ruleTestDirKeyword
            {

            					newCompositeNode(grammarAccess.getTestDirectoryAccess().getKeywordTestDirKeywordParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_keyword_1_0=ruleTestDirKeyword();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTestDirectoryRule());
            					}
            					set(
            						current,
            						"keyword",
            						lv_keyword_1_0,
            						"com.robenglander.libretto.spec.LibrettoProjectProfile.TestDirKeyword");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLibrettoProjectProfile.g:1037:3: ( (lv_dir_2_0= RULE_STRING ) )
            // InternalLibrettoProjectProfile.g:1038:4: (lv_dir_2_0= RULE_STRING )
            {
            // InternalLibrettoProjectProfile.g:1038:4: (lv_dir_2_0= RULE_STRING )
            // InternalLibrettoProjectProfile.g:1039:5: lv_dir_2_0= RULE_STRING
            {
            lv_dir_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_dir_2_0, grammarAccess.getTestDirectoryAccess().getDirSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTestDirectoryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"dir",
            						lv_dir_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleTestDirectory"


    // $ANTLR start "entryRuleMainDirectory"
    // InternalLibrettoProjectProfile.g:1059:1: entryRuleMainDirectory returns [EObject current=null] : iv_ruleMainDirectory= ruleMainDirectory EOF ;
    public final EObject entryRuleMainDirectory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMainDirectory = null;


        try {
            // InternalLibrettoProjectProfile.g:1059:54: (iv_ruleMainDirectory= ruleMainDirectory EOF )
            // InternalLibrettoProjectProfile.g:1060:2: iv_ruleMainDirectory= ruleMainDirectory EOF
            {
             newCompositeNode(grammarAccess.getMainDirectoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMainDirectory=ruleMainDirectory();

            state._fsp--;

             current =iv_ruleMainDirectory; 
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
    // $ANTLR end "entryRuleMainDirectory"


    // $ANTLR start "ruleMainDirectory"
    // InternalLibrettoProjectProfile.g:1066:1: ruleMainDirectory returns [EObject current=null] : ( () ( (lv_keyword_1_0= ruleMainDirKeyword ) ) ( (lv_dir_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleMainDirectory() throws RecognitionException {
        EObject current = null;

        Token lv_dir_2_0=null;
        EObject lv_keyword_1_0 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:1072:2: ( ( () ( (lv_keyword_1_0= ruleMainDirKeyword ) ) ( (lv_dir_2_0= RULE_STRING ) ) ) )
            // InternalLibrettoProjectProfile.g:1073:2: ( () ( (lv_keyword_1_0= ruleMainDirKeyword ) ) ( (lv_dir_2_0= RULE_STRING ) ) )
            {
            // InternalLibrettoProjectProfile.g:1073:2: ( () ( (lv_keyword_1_0= ruleMainDirKeyword ) ) ( (lv_dir_2_0= RULE_STRING ) ) )
            // InternalLibrettoProjectProfile.g:1074:3: () ( (lv_keyword_1_0= ruleMainDirKeyword ) ) ( (lv_dir_2_0= RULE_STRING ) )
            {
            // InternalLibrettoProjectProfile.g:1074:3: ()
            // InternalLibrettoProjectProfile.g:1075:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMainDirectoryAccess().getMainDirectoryAction_0(),
            					current);
            			

            }

            // InternalLibrettoProjectProfile.g:1081:3: ( (lv_keyword_1_0= ruleMainDirKeyword ) )
            // InternalLibrettoProjectProfile.g:1082:4: (lv_keyword_1_0= ruleMainDirKeyword )
            {
            // InternalLibrettoProjectProfile.g:1082:4: (lv_keyword_1_0= ruleMainDirKeyword )
            // InternalLibrettoProjectProfile.g:1083:5: lv_keyword_1_0= ruleMainDirKeyword
            {

            					newCompositeNode(grammarAccess.getMainDirectoryAccess().getKeywordMainDirKeywordParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_keyword_1_0=ruleMainDirKeyword();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMainDirectoryRule());
            					}
            					set(
            						current,
            						"keyword",
            						lv_keyword_1_0,
            						"com.robenglander.libretto.spec.LibrettoProjectProfile.MainDirKeyword");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLibrettoProjectProfile.g:1100:3: ( (lv_dir_2_0= RULE_STRING ) )
            // InternalLibrettoProjectProfile.g:1101:4: (lv_dir_2_0= RULE_STRING )
            {
            // InternalLibrettoProjectProfile.g:1101:4: (lv_dir_2_0= RULE_STRING )
            // InternalLibrettoProjectProfile.g:1102:5: lv_dir_2_0= RULE_STRING
            {
            lv_dir_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_dir_2_0, grammarAccess.getMainDirectoryAccess().getDirSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMainDirectoryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"dir",
            						lv_dir_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleMainDirectory"


    // $ANTLR start "entryRuleBasePackage"
    // InternalLibrettoProjectProfile.g:1122:1: entryRuleBasePackage returns [EObject current=null] : iv_ruleBasePackage= ruleBasePackage EOF ;
    public final EObject entryRuleBasePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasePackage = null;


        try {
            // InternalLibrettoProjectProfile.g:1122:52: (iv_ruleBasePackage= ruleBasePackage EOF )
            // InternalLibrettoProjectProfile.g:1123:2: iv_ruleBasePackage= ruleBasePackage EOF
            {
             newCompositeNode(grammarAccess.getBasePackageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBasePackage=ruleBasePackage();

            state._fsp--;

             current =iv_ruleBasePackage; 
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
    // $ANTLR end "entryRuleBasePackage"


    // $ANTLR start "ruleBasePackage"
    // InternalLibrettoProjectProfile.g:1129:1: ruleBasePackage returns [EObject current=null] : ( () ( (lv_keyword_1_0= ruleBasePackageKeyword ) ) ( (lv_dir_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleBasePackage() throws RecognitionException {
        EObject current = null;

        Token lv_dir_2_0=null;
        EObject lv_keyword_1_0 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:1135:2: ( ( () ( (lv_keyword_1_0= ruleBasePackageKeyword ) ) ( (lv_dir_2_0= RULE_STRING ) ) ) )
            // InternalLibrettoProjectProfile.g:1136:2: ( () ( (lv_keyword_1_0= ruleBasePackageKeyword ) ) ( (lv_dir_2_0= RULE_STRING ) ) )
            {
            // InternalLibrettoProjectProfile.g:1136:2: ( () ( (lv_keyword_1_0= ruleBasePackageKeyword ) ) ( (lv_dir_2_0= RULE_STRING ) ) )
            // InternalLibrettoProjectProfile.g:1137:3: () ( (lv_keyword_1_0= ruleBasePackageKeyword ) ) ( (lv_dir_2_0= RULE_STRING ) )
            {
            // InternalLibrettoProjectProfile.g:1137:3: ()
            // InternalLibrettoProjectProfile.g:1138:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBasePackageAccess().getBasePackageAction_0(),
            					current);
            			

            }

            // InternalLibrettoProjectProfile.g:1144:3: ( (lv_keyword_1_0= ruleBasePackageKeyword ) )
            // InternalLibrettoProjectProfile.g:1145:4: (lv_keyword_1_0= ruleBasePackageKeyword )
            {
            // InternalLibrettoProjectProfile.g:1145:4: (lv_keyword_1_0= ruleBasePackageKeyword )
            // InternalLibrettoProjectProfile.g:1146:5: lv_keyword_1_0= ruleBasePackageKeyword
            {

            					newCompositeNode(grammarAccess.getBasePackageAccess().getKeywordBasePackageKeywordParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_keyword_1_0=ruleBasePackageKeyword();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBasePackageRule());
            					}
            					set(
            						current,
            						"keyword",
            						lv_keyword_1_0,
            						"com.robenglander.libretto.spec.LibrettoProjectProfile.BasePackageKeyword");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLibrettoProjectProfile.g:1163:3: ( (lv_dir_2_0= RULE_STRING ) )
            // InternalLibrettoProjectProfile.g:1164:4: (lv_dir_2_0= RULE_STRING )
            {
            // InternalLibrettoProjectProfile.g:1164:4: (lv_dir_2_0= RULE_STRING )
            // InternalLibrettoProjectProfile.g:1165:5: lv_dir_2_0= RULE_STRING
            {
            lv_dir_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_dir_2_0, grammarAccess.getBasePackageAccess().getDirSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBasePackageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"dir",
            						lv_dir_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleBasePackage"


    // $ANTLR start "entryRuleDirKeyword"
    // InternalLibrettoProjectProfile.g:1185:1: entryRuleDirKeyword returns [EObject current=null] : iv_ruleDirKeyword= ruleDirKeyword EOF ;
    public final EObject entryRuleDirKeyword() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirKeyword = null;


        try {
            // InternalLibrettoProjectProfile.g:1185:51: (iv_ruleDirKeyword= ruleDirKeyword EOF )
            // InternalLibrettoProjectProfile.g:1186:2: iv_ruleDirKeyword= ruleDirKeyword EOF
            {
             newCompositeNode(grammarAccess.getDirKeywordRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDirKeyword=ruleDirKeyword();

            state._fsp--;

             current =iv_ruleDirKeyword; 
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
    // $ANTLR end "entryRuleDirKeyword"


    // $ANTLR start "ruleDirKeyword"
    // InternalLibrettoProjectProfile.g:1192:1: ruleDirKeyword returns [EObject current=null] : ( () ( (lv_keyword_1_0= 'dir' ) ) ) ;
    public final EObject ruleDirKeyword() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_1_0=null;


        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:1198:2: ( ( () ( (lv_keyword_1_0= 'dir' ) ) ) )
            // InternalLibrettoProjectProfile.g:1199:2: ( () ( (lv_keyword_1_0= 'dir' ) ) )
            {
            // InternalLibrettoProjectProfile.g:1199:2: ( () ( (lv_keyword_1_0= 'dir' ) ) )
            // InternalLibrettoProjectProfile.g:1200:3: () ( (lv_keyword_1_0= 'dir' ) )
            {
            // InternalLibrettoProjectProfile.g:1200:3: ()
            // InternalLibrettoProjectProfile.g:1201:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDirKeywordAccess().getDirKeywordAction_0(),
            					current);
            			

            }

            // InternalLibrettoProjectProfile.g:1207:3: ( (lv_keyword_1_0= 'dir' ) )
            // InternalLibrettoProjectProfile.g:1208:4: (lv_keyword_1_0= 'dir' )
            {
            // InternalLibrettoProjectProfile.g:1208:4: (lv_keyword_1_0= 'dir' )
            // InternalLibrettoProjectProfile.g:1209:5: lv_keyword_1_0= 'dir'
            {
            lv_keyword_1_0=(Token)match(input,19,FOLLOW_2); 

            					newLeafNode(lv_keyword_1_0, grammarAccess.getDirKeywordAccess().getKeywordDirKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDirKeywordRule());
            					}
            					setWithLastConsumed(current, "keyword", lv_keyword_1_0, "dir");
            				

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
    // $ANTLR end "ruleDirKeyword"


    // $ANTLR start "entryRuleSpecDirKeyword"
    // InternalLibrettoProjectProfile.g:1225:1: entryRuleSpecDirKeyword returns [EObject current=null] : iv_ruleSpecDirKeyword= ruleSpecDirKeyword EOF ;
    public final EObject entryRuleSpecDirKeyword() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecDirKeyword = null;


        try {
            // InternalLibrettoProjectProfile.g:1225:55: (iv_ruleSpecDirKeyword= ruleSpecDirKeyword EOF )
            // InternalLibrettoProjectProfile.g:1226:2: iv_ruleSpecDirKeyword= ruleSpecDirKeyword EOF
            {
             newCompositeNode(grammarAccess.getSpecDirKeywordRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpecDirKeyword=ruleSpecDirKeyword();

            state._fsp--;

             current =iv_ruleSpecDirKeyword; 
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
    // $ANTLR end "entryRuleSpecDirKeyword"


    // $ANTLR start "ruleSpecDirKeyword"
    // InternalLibrettoProjectProfile.g:1232:1: ruleSpecDirKeyword returns [EObject current=null] : ( () ( ( (lv_keyword_1_1= 'specdir' | lv_keyword_1_2= 'specDir' ) ) ) ) ;
    public final EObject ruleSpecDirKeyword() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_1_1=null;
        Token lv_keyword_1_2=null;


        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:1238:2: ( ( () ( ( (lv_keyword_1_1= 'specdir' | lv_keyword_1_2= 'specDir' ) ) ) ) )
            // InternalLibrettoProjectProfile.g:1239:2: ( () ( ( (lv_keyword_1_1= 'specdir' | lv_keyword_1_2= 'specDir' ) ) ) )
            {
            // InternalLibrettoProjectProfile.g:1239:2: ( () ( ( (lv_keyword_1_1= 'specdir' | lv_keyword_1_2= 'specDir' ) ) ) )
            // InternalLibrettoProjectProfile.g:1240:3: () ( ( (lv_keyword_1_1= 'specdir' | lv_keyword_1_2= 'specDir' ) ) )
            {
            // InternalLibrettoProjectProfile.g:1240:3: ()
            // InternalLibrettoProjectProfile.g:1241:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSpecDirKeywordAccess().getSpecDirKeywordAction_0(),
            					current);
            			

            }

            // InternalLibrettoProjectProfile.g:1247:3: ( ( (lv_keyword_1_1= 'specdir' | lv_keyword_1_2= 'specDir' ) ) )
            // InternalLibrettoProjectProfile.g:1248:4: ( (lv_keyword_1_1= 'specdir' | lv_keyword_1_2= 'specDir' ) )
            {
            // InternalLibrettoProjectProfile.g:1248:4: ( (lv_keyword_1_1= 'specdir' | lv_keyword_1_2= 'specDir' ) )
            // InternalLibrettoProjectProfile.g:1249:5: (lv_keyword_1_1= 'specdir' | lv_keyword_1_2= 'specDir' )
            {
            // InternalLibrettoProjectProfile.g:1249:5: (lv_keyword_1_1= 'specdir' | lv_keyword_1_2= 'specDir' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            else if ( (LA7_0==21) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:1250:6: lv_keyword_1_1= 'specdir'
                    {
                    lv_keyword_1_1=(Token)match(input,20,FOLLOW_2); 

                    						newLeafNode(lv_keyword_1_1, grammarAccess.getSpecDirKeywordAccess().getKeywordSpecdirKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSpecDirKeywordRule());
                    						}
                    						setWithLastConsumed(current, "keyword", lv_keyword_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalLibrettoProjectProfile.g:1261:6: lv_keyword_1_2= 'specDir'
                    {
                    lv_keyword_1_2=(Token)match(input,21,FOLLOW_2); 

                    						newLeafNode(lv_keyword_1_2, grammarAccess.getSpecDirKeywordAccess().getKeywordSpecDirKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSpecDirKeywordRule());
                    						}
                    						setWithLastConsumed(current, "keyword", lv_keyword_1_2, null);
                    					

                    }
                    break;

            }


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
    // $ANTLR end "ruleSpecDirKeyword"


    // $ANTLR start "entryRuleTestDirKeyword"
    // InternalLibrettoProjectProfile.g:1278:1: entryRuleTestDirKeyword returns [EObject current=null] : iv_ruleTestDirKeyword= ruleTestDirKeyword EOF ;
    public final EObject entryRuleTestDirKeyword() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestDirKeyword = null;


        try {
            // InternalLibrettoProjectProfile.g:1278:55: (iv_ruleTestDirKeyword= ruleTestDirKeyword EOF )
            // InternalLibrettoProjectProfile.g:1279:2: iv_ruleTestDirKeyword= ruleTestDirKeyword EOF
            {
             newCompositeNode(grammarAccess.getTestDirKeywordRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTestDirKeyword=ruleTestDirKeyword();

            state._fsp--;

             current =iv_ruleTestDirKeyword; 
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
    // $ANTLR end "entryRuleTestDirKeyword"


    // $ANTLR start "ruleTestDirKeyword"
    // InternalLibrettoProjectProfile.g:1285:1: ruleTestDirKeyword returns [EObject current=null] : ( () ( ( (lv_keyword_1_1= 'testdir' | lv_keyword_1_2= 'testDir' ) ) ) ) ;
    public final EObject ruleTestDirKeyword() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_1_1=null;
        Token lv_keyword_1_2=null;


        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:1291:2: ( ( () ( ( (lv_keyword_1_1= 'testdir' | lv_keyword_1_2= 'testDir' ) ) ) ) )
            // InternalLibrettoProjectProfile.g:1292:2: ( () ( ( (lv_keyword_1_1= 'testdir' | lv_keyword_1_2= 'testDir' ) ) ) )
            {
            // InternalLibrettoProjectProfile.g:1292:2: ( () ( ( (lv_keyword_1_1= 'testdir' | lv_keyword_1_2= 'testDir' ) ) ) )
            // InternalLibrettoProjectProfile.g:1293:3: () ( ( (lv_keyword_1_1= 'testdir' | lv_keyword_1_2= 'testDir' ) ) )
            {
            // InternalLibrettoProjectProfile.g:1293:3: ()
            // InternalLibrettoProjectProfile.g:1294:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTestDirKeywordAccess().getTestDirKeywordAction_0(),
            					current);
            			

            }

            // InternalLibrettoProjectProfile.g:1300:3: ( ( (lv_keyword_1_1= 'testdir' | lv_keyword_1_2= 'testDir' ) ) )
            // InternalLibrettoProjectProfile.g:1301:4: ( (lv_keyword_1_1= 'testdir' | lv_keyword_1_2= 'testDir' ) )
            {
            // InternalLibrettoProjectProfile.g:1301:4: ( (lv_keyword_1_1= 'testdir' | lv_keyword_1_2= 'testDir' ) )
            // InternalLibrettoProjectProfile.g:1302:5: (lv_keyword_1_1= 'testdir' | lv_keyword_1_2= 'testDir' )
            {
            // InternalLibrettoProjectProfile.g:1302:5: (lv_keyword_1_1= 'testdir' | lv_keyword_1_2= 'testDir' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            else if ( (LA8_0==23) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:1303:6: lv_keyword_1_1= 'testdir'
                    {
                    lv_keyword_1_1=(Token)match(input,22,FOLLOW_2); 

                    						newLeafNode(lv_keyword_1_1, grammarAccess.getTestDirKeywordAccess().getKeywordTestdirKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTestDirKeywordRule());
                    						}
                    						setWithLastConsumed(current, "keyword", lv_keyword_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalLibrettoProjectProfile.g:1314:6: lv_keyword_1_2= 'testDir'
                    {
                    lv_keyword_1_2=(Token)match(input,23,FOLLOW_2); 

                    						newLeafNode(lv_keyword_1_2, grammarAccess.getTestDirKeywordAccess().getKeywordTestDirKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTestDirKeywordRule());
                    						}
                    						setWithLastConsumed(current, "keyword", lv_keyword_1_2, null);
                    					

                    }
                    break;

            }


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
    // $ANTLR end "ruleTestDirKeyword"


    // $ANTLR start "entryRuleMainDirKeyword"
    // InternalLibrettoProjectProfile.g:1331:1: entryRuleMainDirKeyword returns [EObject current=null] : iv_ruleMainDirKeyword= ruleMainDirKeyword EOF ;
    public final EObject entryRuleMainDirKeyword() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMainDirKeyword = null;


        try {
            // InternalLibrettoProjectProfile.g:1331:55: (iv_ruleMainDirKeyword= ruleMainDirKeyword EOF )
            // InternalLibrettoProjectProfile.g:1332:2: iv_ruleMainDirKeyword= ruleMainDirKeyword EOF
            {
             newCompositeNode(grammarAccess.getMainDirKeywordRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMainDirKeyword=ruleMainDirKeyword();

            state._fsp--;

             current =iv_ruleMainDirKeyword; 
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
    // $ANTLR end "entryRuleMainDirKeyword"


    // $ANTLR start "ruleMainDirKeyword"
    // InternalLibrettoProjectProfile.g:1338:1: ruleMainDirKeyword returns [EObject current=null] : ( () ( ( (lv_keyword_1_1= 'maindir' | lv_keyword_1_2= 'mainDir' ) ) ) ) ;
    public final EObject ruleMainDirKeyword() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_1_1=null;
        Token lv_keyword_1_2=null;


        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:1344:2: ( ( () ( ( (lv_keyword_1_1= 'maindir' | lv_keyword_1_2= 'mainDir' ) ) ) ) )
            // InternalLibrettoProjectProfile.g:1345:2: ( () ( ( (lv_keyword_1_1= 'maindir' | lv_keyword_1_2= 'mainDir' ) ) ) )
            {
            // InternalLibrettoProjectProfile.g:1345:2: ( () ( ( (lv_keyword_1_1= 'maindir' | lv_keyword_1_2= 'mainDir' ) ) ) )
            // InternalLibrettoProjectProfile.g:1346:3: () ( ( (lv_keyword_1_1= 'maindir' | lv_keyword_1_2= 'mainDir' ) ) )
            {
            // InternalLibrettoProjectProfile.g:1346:3: ()
            // InternalLibrettoProjectProfile.g:1347:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMainDirKeywordAccess().getMainDirKeywordAction_0(),
            					current);
            			

            }

            // InternalLibrettoProjectProfile.g:1353:3: ( ( (lv_keyword_1_1= 'maindir' | lv_keyword_1_2= 'mainDir' ) ) )
            // InternalLibrettoProjectProfile.g:1354:4: ( (lv_keyword_1_1= 'maindir' | lv_keyword_1_2= 'mainDir' ) )
            {
            // InternalLibrettoProjectProfile.g:1354:4: ( (lv_keyword_1_1= 'maindir' | lv_keyword_1_2= 'mainDir' ) )
            // InternalLibrettoProjectProfile.g:1355:5: (lv_keyword_1_1= 'maindir' | lv_keyword_1_2= 'mainDir' )
            {
            // InternalLibrettoProjectProfile.g:1355:5: (lv_keyword_1_1= 'maindir' | lv_keyword_1_2= 'mainDir' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            else if ( (LA9_0==25) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:1356:6: lv_keyword_1_1= 'maindir'
                    {
                    lv_keyword_1_1=(Token)match(input,24,FOLLOW_2); 

                    						newLeafNode(lv_keyword_1_1, grammarAccess.getMainDirKeywordAccess().getKeywordMaindirKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMainDirKeywordRule());
                    						}
                    						setWithLastConsumed(current, "keyword", lv_keyword_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalLibrettoProjectProfile.g:1367:6: lv_keyword_1_2= 'mainDir'
                    {
                    lv_keyword_1_2=(Token)match(input,25,FOLLOW_2); 

                    						newLeafNode(lv_keyword_1_2, grammarAccess.getMainDirKeywordAccess().getKeywordMainDirKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMainDirKeywordRule());
                    						}
                    						setWithLastConsumed(current, "keyword", lv_keyword_1_2, null);
                    					

                    }
                    break;

            }


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
    // $ANTLR end "ruleMainDirKeyword"


    // $ANTLR start "entryRuleBasePackageKeyword"
    // InternalLibrettoProjectProfile.g:1384:1: entryRuleBasePackageKeyword returns [EObject current=null] : iv_ruleBasePackageKeyword= ruleBasePackageKeyword EOF ;
    public final EObject entryRuleBasePackageKeyword() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasePackageKeyword = null;


        try {
            // InternalLibrettoProjectProfile.g:1384:59: (iv_ruleBasePackageKeyword= ruleBasePackageKeyword EOF )
            // InternalLibrettoProjectProfile.g:1385:2: iv_ruleBasePackageKeyword= ruleBasePackageKeyword EOF
            {
             newCompositeNode(grammarAccess.getBasePackageKeywordRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBasePackageKeyword=ruleBasePackageKeyword();

            state._fsp--;

             current =iv_ruleBasePackageKeyword; 
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
    // $ANTLR end "entryRuleBasePackageKeyword"


    // $ANTLR start "ruleBasePackageKeyword"
    // InternalLibrettoProjectProfile.g:1391:1: ruleBasePackageKeyword returns [EObject current=null] : ( () ( ( (lv_keyword_1_1= 'basepackage' | lv_keyword_1_2= 'basePackage' ) ) ) ) ;
    public final EObject ruleBasePackageKeyword() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_1_1=null;
        Token lv_keyword_1_2=null;


        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:1397:2: ( ( () ( ( (lv_keyword_1_1= 'basepackage' | lv_keyword_1_2= 'basePackage' ) ) ) ) )
            // InternalLibrettoProjectProfile.g:1398:2: ( () ( ( (lv_keyword_1_1= 'basepackage' | lv_keyword_1_2= 'basePackage' ) ) ) )
            {
            // InternalLibrettoProjectProfile.g:1398:2: ( () ( ( (lv_keyword_1_1= 'basepackage' | lv_keyword_1_2= 'basePackage' ) ) ) )
            // InternalLibrettoProjectProfile.g:1399:3: () ( ( (lv_keyword_1_1= 'basepackage' | lv_keyword_1_2= 'basePackage' ) ) )
            {
            // InternalLibrettoProjectProfile.g:1399:3: ()
            // InternalLibrettoProjectProfile.g:1400:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBasePackageKeywordAccess().getBasePackageKeywordAction_0(),
            					current);
            			

            }

            // InternalLibrettoProjectProfile.g:1406:3: ( ( (lv_keyword_1_1= 'basepackage' | lv_keyword_1_2= 'basePackage' ) ) )
            // InternalLibrettoProjectProfile.g:1407:4: ( (lv_keyword_1_1= 'basepackage' | lv_keyword_1_2= 'basePackage' ) )
            {
            // InternalLibrettoProjectProfile.g:1407:4: ( (lv_keyword_1_1= 'basepackage' | lv_keyword_1_2= 'basePackage' ) )
            // InternalLibrettoProjectProfile.g:1408:5: (lv_keyword_1_1= 'basepackage' | lv_keyword_1_2= 'basePackage' )
            {
            // InternalLibrettoProjectProfile.g:1408:5: (lv_keyword_1_1= 'basepackage' | lv_keyword_1_2= 'basePackage' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            else if ( (LA10_0==27) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:1409:6: lv_keyword_1_1= 'basepackage'
                    {
                    lv_keyword_1_1=(Token)match(input,26,FOLLOW_2); 

                    						newLeafNode(lv_keyword_1_1, grammarAccess.getBasePackageKeywordAccess().getKeywordBasepackageKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBasePackageKeywordRule());
                    						}
                    						setWithLastConsumed(current, "keyword", lv_keyword_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalLibrettoProjectProfile.g:1420:6: lv_keyword_1_2= 'basePackage'
                    {
                    lv_keyword_1_2=(Token)match(input,27,FOLLOW_2); 

                    						newLeafNode(lv_keyword_1_2, grammarAccess.getBasePackageKeywordAccess().getKeywordBasePackageKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBasePackageKeywordRule());
                    						}
                    						setWithLastConsumed(current, "keyword", lv_keyword_1_2, null);
                    					

                    }
                    break;

            }


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
    // $ANTLR end "ruleBasePackageKeyword"


    // $ANTLR start "entryRuleGenBlock"
    // InternalLibrettoProjectProfile.g:1437:1: entryRuleGenBlock returns [EObject current=null] : iv_ruleGenBlock= ruleGenBlock EOF ;
    public final EObject entryRuleGenBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenBlock = null;


        try {
            // InternalLibrettoProjectProfile.g:1437:49: (iv_ruleGenBlock= ruleGenBlock EOF )
            // InternalLibrettoProjectProfile.g:1438:2: iv_ruleGenBlock= ruleGenBlock EOF
            {
             newCompositeNode(grammarAccess.getGenBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGenBlock=ruleGenBlock();

            state._fsp--;

             current =iv_ruleGenBlock; 
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
    // $ANTLR end "entryRuleGenBlock"


    // $ANTLR start "ruleGenBlock"
    // InternalLibrettoProjectProfile.g:1444:1: ruleGenBlock returns [EObject current=null] : ( () ( (lv_keyword_1_0= ruleGenKeyword ) ) otherlv_2= '{' ( ( (lv_initialInstructions_3_0= ruleInitialInstruction ) ) | ( (lv_maxRetries_4_0= ruleMaxRetries ) ) | ( (lv_parseChecks_5_0= ruleParseCheck ) ) | ( (lv_defaultCorrections_6_0= ruleDefaultCorrection ) ) | ( (lv_remediations_7_0= ruleGenRemediationRules ) ) | ( (lv_modelUsages_8_0= ruleGenUsageBlock ) ) )* otherlv_9= '}' ) ;
    public final EObject ruleGenBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_9=null;
        EObject lv_keyword_1_0 = null;

        EObject lv_initialInstructions_3_0 = null;

        EObject lv_maxRetries_4_0 = null;

        EObject lv_parseChecks_5_0 = null;

        EObject lv_defaultCorrections_6_0 = null;

        EObject lv_remediations_7_0 = null;

        EObject lv_modelUsages_8_0 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:1450:2: ( ( () ( (lv_keyword_1_0= ruleGenKeyword ) ) otherlv_2= '{' ( ( (lv_initialInstructions_3_0= ruleInitialInstruction ) ) | ( (lv_maxRetries_4_0= ruleMaxRetries ) ) | ( (lv_parseChecks_5_0= ruleParseCheck ) ) | ( (lv_defaultCorrections_6_0= ruleDefaultCorrection ) ) | ( (lv_remediations_7_0= ruleGenRemediationRules ) ) | ( (lv_modelUsages_8_0= ruleGenUsageBlock ) ) )* otherlv_9= '}' ) )
            // InternalLibrettoProjectProfile.g:1451:2: ( () ( (lv_keyword_1_0= ruleGenKeyword ) ) otherlv_2= '{' ( ( (lv_initialInstructions_3_0= ruleInitialInstruction ) ) | ( (lv_maxRetries_4_0= ruleMaxRetries ) ) | ( (lv_parseChecks_5_0= ruleParseCheck ) ) | ( (lv_defaultCorrections_6_0= ruleDefaultCorrection ) ) | ( (lv_remediations_7_0= ruleGenRemediationRules ) ) | ( (lv_modelUsages_8_0= ruleGenUsageBlock ) ) )* otherlv_9= '}' )
            {
            // InternalLibrettoProjectProfile.g:1451:2: ( () ( (lv_keyword_1_0= ruleGenKeyword ) ) otherlv_2= '{' ( ( (lv_initialInstructions_3_0= ruleInitialInstruction ) ) | ( (lv_maxRetries_4_0= ruleMaxRetries ) ) | ( (lv_parseChecks_5_0= ruleParseCheck ) ) | ( (lv_defaultCorrections_6_0= ruleDefaultCorrection ) ) | ( (lv_remediations_7_0= ruleGenRemediationRules ) ) | ( (lv_modelUsages_8_0= ruleGenUsageBlock ) ) )* otherlv_9= '}' )
            // InternalLibrettoProjectProfile.g:1452:3: () ( (lv_keyword_1_0= ruleGenKeyword ) ) otherlv_2= '{' ( ( (lv_initialInstructions_3_0= ruleInitialInstruction ) ) | ( (lv_maxRetries_4_0= ruleMaxRetries ) ) | ( (lv_parseChecks_5_0= ruleParseCheck ) ) | ( (lv_defaultCorrections_6_0= ruleDefaultCorrection ) ) | ( (lv_remediations_7_0= ruleGenRemediationRules ) ) | ( (lv_modelUsages_8_0= ruleGenUsageBlock ) ) )* otherlv_9= '}'
            {
            // InternalLibrettoProjectProfile.g:1452:3: ()
            // InternalLibrettoProjectProfile.g:1453:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGenBlockAccess().getGenBlockAction_0(),
            					current);
            			

            }

            // InternalLibrettoProjectProfile.g:1459:3: ( (lv_keyword_1_0= ruleGenKeyword ) )
            // InternalLibrettoProjectProfile.g:1460:4: (lv_keyword_1_0= ruleGenKeyword )
            {
            // InternalLibrettoProjectProfile.g:1460:4: (lv_keyword_1_0= ruleGenKeyword )
            // InternalLibrettoProjectProfile.g:1461:5: lv_keyword_1_0= ruleGenKeyword
            {

            					newCompositeNode(grammarAccess.getGenBlockAccess().getKeywordGenKeywordParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_keyword_1_0=ruleGenKeyword();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGenBlockRule());
            					}
            					set(
            						current,
            						"keyword",
            						lv_keyword_1_0,
            						"com.robenglander.libretto.spec.LibrettoProjectProfile.GenKeyword");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,11,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getGenBlockAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLibrettoProjectProfile.g:1482:3: ( ( (lv_initialInstructions_3_0= ruleInitialInstruction ) ) | ( (lv_maxRetries_4_0= ruleMaxRetries ) ) | ( (lv_parseChecks_5_0= ruleParseCheck ) ) | ( (lv_defaultCorrections_6_0= ruleDefaultCorrection ) ) | ( (lv_remediations_7_0= ruleGenRemediationRules ) ) | ( (lv_modelUsages_8_0= ruleGenUsageBlock ) ) )*
            loop11:
            do {
                int alt11=7;
                switch ( input.LA(1) ) {
                case 29:
                case 30:
                    {
                    alt11=1;
                    }
                    break;
                case 31:
                case 32:
                    {
                    alt11=2;
                    }
                    break;
                case 33:
                case 34:
                    {
                    alt11=3;
                    }
                    break;
                case 35:
                case 36:
                    {
                    alt11=4;
                    }
                    break;
                case 39:
                    {
                    alt11=5;
                    }
                    break;
                case 54:
                case 55:
                    {
                    alt11=6;
                    }
                    break;

                }

                switch (alt11) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:1483:4: ( (lv_initialInstructions_3_0= ruleInitialInstruction ) )
            	    {
            	    // InternalLibrettoProjectProfile.g:1483:4: ( (lv_initialInstructions_3_0= ruleInitialInstruction ) )
            	    // InternalLibrettoProjectProfile.g:1484:5: (lv_initialInstructions_3_0= ruleInitialInstruction )
            	    {
            	    // InternalLibrettoProjectProfile.g:1484:5: (lv_initialInstructions_3_0= ruleInitialInstruction )
            	    // InternalLibrettoProjectProfile.g:1485:6: lv_initialInstructions_3_0= ruleInitialInstruction
            	    {

            	    						newCompositeNode(grammarAccess.getGenBlockAccess().getInitialInstructionsInitialInstructionParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_initialInstructions_3_0=ruleInitialInstruction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGenBlockRule());
            	    						}
            	    						add(
            	    							current,
            	    							"initialInstructions",
            	    							lv_initialInstructions_3_0,
            	    							"com.robenglander.libretto.spec.LibrettoProjectProfile.InitialInstruction");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalLibrettoProjectProfile.g:1503:4: ( (lv_maxRetries_4_0= ruleMaxRetries ) )
            	    {
            	    // InternalLibrettoProjectProfile.g:1503:4: ( (lv_maxRetries_4_0= ruleMaxRetries ) )
            	    // InternalLibrettoProjectProfile.g:1504:5: (lv_maxRetries_4_0= ruleMaxRetries )
            	    {
            	    // InternalLibrettoProjectProfile.g:1504:5: (lv_maxRetries_4_0= ruleMaxRetries )
            	    // InternalLibrettoProjectProfile.g:1505:6: lv_maxRetries_4_0= ruleMaxRetries
            	    {

            	    						newCompositeNode(grammarAccess.getGenBlockAccess().getMaxRetriesMaxRetriesParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_maxRetries_4_0=ruleMaxRetries();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGenBlockRule());
            	    						}
            	    						add(
            	    							current,
            	    							"maxRetries",
            	    							lv_maxRetries_4_0,
            	    							"com.robenglander.libretto.spec.LibrettoProjectProfile.MaxRetries");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalLibrettoProjectProfile.g:1523:4: ( (lv_parseChecks_5_0= ruleParseCheck ) )
            	    {
            	    // InternalLibrettoProjectProfile.g:1523:4: ( (lv_parseChecks_5_0= ruleParseCheck ) )
            	    // InternalLibrettoProjectProfile.g:1524:5: (lv_parseChecks_5_0= ruleParseCheck )
            	    {
            	    // InternalLibrettoProjectProfile.g:1524:5: (lv_parseChecks_5_0= ruleParseCheck )
            	    // InternalLibrettoProjectProfile.g:1525:6: lv_parseChecks_5_0= ruleParseCheck
            	    {

            	    						newCompositeNode(grammarAccess.getGenBlockAccess().getParseChecksParseCheckParserRuleCall_3_2_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_parseChecks_5_0=ruleParseCheck();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGenBlockRule());
            	    						}
            	    						add(
            	    							current,
            	    							"parseChecks",
            	    							lv_parseChecks_5_0,
            	    							"com.robenglander.libretto.spec.LibrettoProjectProfile.ParseCheck");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalLibrettoProjectProfile.g:1543:4: ( (lv_defaultCorrections_6_0= ruleDefaultCorrection ) )
            	    {
            	    // InternalLibrettoProjectProfile.g:1543:4: ( (lv_defaultCorrections_6_0= ruleDefaultCorrection ) )
            	    // InternalLibrettoProjectProfile.g:1544:5: (lv_defaultCorrections_6_0= ruleDefaultCorrection )
            	    {
            	    // InternalLibrettoProjectProfile.g:1544:5: (lv_defaultCorrections_6_0= ruleDefaultCorrection )
            	    // InternalLibrettoProjectProfile.g:1545:6: lv_defaultCorrections_6_0= ruleDefaultCorrection
            	    {

            	    						newCompositeNode(grammarAccess.getGenBlockAccess().getDefaultCorrectionsDefaultCorrectionParserRuleCall_3_3_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_defaultCorrections_6_0=ruleDefaultCorrection();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGenBlockRule());
            	    						}
            	    						add(
            	    							current,
            	    							"defaultCorrections",
            	    							lv_defaultCorrections_6_0,
            	    							"com.robenglander.libretto.spec.LibrettoProjectProfile.DefaultCorrection");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalLibrettoProjectProfile.g:1563:4: ( (lv_remediations_7_0= ruleGenRemediationRules ) )
            	    {
            	    // InternalLibrettoProjectProfile.g:1563:4: ( (lv_remediations_7_0= ruleGenRemediationRules ) )
            	    // InternalLibrettoProjectProfile.g:1564:5: (lv_remediations_7_0= ruleGenRemediationRules )
            	    {
            	    // InternalLibrettoProjectProfile.g:1564:5: (lv_remediations_7_0= ruleGenRemediationRules )
            	    // InternalLibrettoProjectProfile.g:1565:6: lv_remediations_7_0= ruleGenRemediationRules
            	    {

            	    						newCompositeNode(grammarAccess.getGenBlockAccess().getRemediationsGenRemediationRulesParserRuleCall_3_4_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_remediations_7_0=ruleGenRemediationRules();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGenBlockRule());
            	    						}
            	    						add(
            	    							current,
            	    							"remediations",
            	    							lv_remediations_7_0,
            	    							"com.robenglander.libretto.spec.LibrettoProjectProfile.GenRemediationRules");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalLibrettoProjectProfile.g:1583:4: ( (lv_modelUsages_8_0= ruleGenUsageBlock ) )
            	    {
            	    // InternalLibrettoProjectProfile.g:1583:4: ( (lv_modelUsages_8_0= ruleGenUsageBlock ) )
            	    // InternalLibrettoProjectProfile.g:1584:5: (lv_modelUsages_8_0= ruleGenUsageBlock )
            	    {
            	    // InternalLibrettoProjectProfile.g:1584:5: (lv_modelUsages_8_0= ruleGenUsageBlock )
            	    // InternalLibrettoProjectProfile.g:1585:6: lv_modelUsages_8_0= ruleGenUsageBlock
            	    {

            	    						newCompositeNode(grammarAccess.getGenBlockAccess().getModelUsagesGenUsageBlockParserRuleCall_3_5_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_modelUsages_8_0=ruleGenUsageBlock();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGenBlockRule());
            	    						}
            	    						add(
            	    							current,
            	    							"modelUsages",
            	    							lv_modelUsages_8_0,
            	    							"com.robenglander.libretto.spec.LibrettoProjectProfile.GenUsageBlock");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_9=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getGenBlockAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleGenBlock"


    // $ANTLR start "entryRuleGenKeyword"
    // InternalLibrettoProjectProfile.g:1611:1: entryRuleGenKeyword returns [EObject current=null] : iv_ruleGenKeyword= ruleGenKeyword EOF ;
    public final EObject entryRuleGenKeyword() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenKeyword = null;


        try {
            // InternalLibrettoProjectProfile.g:1611:51: (iv_ruleGenKeyword= ruleGenKeyword EOF )
            // InternalLibrettoProjectProfile.g:1612:2: iv_ruleGenKeyword= ruleGenKeyword EOF
            {
             newCompositeNode(grammarAccess.getGenKeywordRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGenKeyword=ruleGenKeyword();

            state._fsp--;

             current =iv_ruleGenKeyword; 
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
    // $ANTLR end "entryRuleGenKeyword"


    // $ANTLR start "ruleGenKeyword"
    // InternalLibrettoProjectProfile.g:1618:1: ruleGenKeyword returns [EObject current=null] : ( () ( (lv_keyword_1_0= 'gen' ) ) ) ;
    public final EObject ruleGenKeyword() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_1_0=null;


        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:1624:2: ( ( () ( (lv_keyword_1_0= 'gen' ) ) ) )
            // InternalLibrettoProjectProfile.g:1625:2: ( () ( (lv_keyword_1_0= 'gen' ) ) )
            {
            // InternalLibrettoProjectProfile.g:1625:2: ( () ( (lv_keyword_1_0= 'gen' ) ) )
            // InternalLibrettoProjectProfile.g:1626:3: () ( (lv_keyword_1_0= 'gen' ) )
            {
            // InternalLibrettoProjectProfile.g:1626:3: ()
            // InternalLibrettoProjectProfile.g:1627:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGenKeywordAccess().getGenKeywordAction_0(),
            					current);
            			

            }

            // InternalLibrettoProjectProfile.g:1633:3: ( (lv_keyword_1_0= 'gen' ) )
            // InternalLibrettoProjectProfile.g:1634:4: (lv_keyword_1_0= 'gen' )
            {
            // InternalLibrettoProjectProfile.g:1634:4: (lv_keyword_1_0= 'gen' )
            // InternalLibrettoProjectProfile.g:1635:5: lv_keyword_1_0= 'gen'
            {
            lv_keyword_1_0=(Token)match(input,28,FOLLOW_2); 

            					newLeafNode(lv_keyword_1_0, grammarAccess.getGenKeywordAccess().getKeywordGenKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGenKeywordRule());
            					}
            					setWithLastConsumed(current, "keyword", lv_keyword_1_0, "gen");
            				

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
    // $ANTLR end "ruleGenKeyword"


    // $ANTLR start "entryRuleInitialInstruction"
    // InternalLibrettoProjectProfile.g:1651:1: entryRuleInitialInstruction returns [EObject current=null] : iv_ruleInitialInstruction= ruleInitialInstruction EOF ;
    public final EObject entryRuleInitialInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialInstruction = null;


        try {
            // InternalLibrettoProjectProfile.g:1651:59: (iv_ruleInitialInstruction= ruleInitialInstruction EOF )
            // InternalLibrettoProjectProfile.g:1652:2: iv_ruleInitialInstruction= ruleInitialInstruction EOF
            {
             newCompositeNode(grammarAccess.getInitialInstructionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitialInstruction=ruleInitialInstruction();

            state._fsp--;

             current =iv_ruleInitialInstruction; 
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
    // $ANTLR end "entryRuleInitialInstruction"


    // $ANTLR start "ruleInitialInstruction"
    // InternalLibrettoProjectProfile.g:1658:1: ruleInitialInstruction returns [EObject current=null] : ( () ( (lv_keyword_1_0= ruleInitialInstructionKeyword ) ) ( (lv_instruction_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleInitialInstruction() throws RecognitionException {
        EObject current = null;

        Token lv_instruction_2_0=null;
        EObject lv_keyword_1_0 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:1664:2: ( ( () ( (lv_keyword_1_0= ruleInitialInstructionKeyword ) ) ( (lv_instruction_2_0= RULE_STRING ) ) ) )
            // InternalLibrettoProjectProfile.g:1665:2: ( () ( (lv_keyword_1_0= ruleInitialInstructionKeyword ) ) ( (lv_instruction_2_0= RULE_STRING ) ) )
            {
            // InternalLibrettoProjectProfile.g:1665:2: ( () ( (lv_keyword_1_0= ruleInitialInstructionKeyword ) ) ( (lv_instruction_2_0= RULE_STRING ) ) )
            // InternalLibrettoProjectProfile.g:1666:3: () ( (lv_keyword_1_0= ruleInitialInstructionKeyword ) ) ( (lv_instruction_2_0= RULE_STRING ) )
            {
            // InternalLibrettoProjectProfile.g:1666:3: ()
            // InternalLibrettoProjectProfile.g:1667:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInitialInstructionAccess().getInitialInstructionAction_0(),
            					current);
            			

            }

            // InternalLibrettoProjectProfile.g:1673:3: ( (lv_keyword_1_0= ruleInitialInstructionKeyword ) )
            // InternalLibrettoProjectProfile.g:1674:4: (lv_keyword_1_0= ruleInitialInstructionKeyword )
            {
            // InternalLibrettoProjectProfile.g:1674:4: (lv_keyword_1_0= ruleInitialInstructionKeyword )
            // InternalLibrettoProjectProfile.g:1675:5: lv_keyword_1_0= ruleInitialInstructionKeyword
            {

            					newCompositeNode(grammarAccess.getInitialInstructionAccess().getKeywordInitialInstructionKeywordParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_keyword_1_0=ruleInitialInstructionKeyword();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInitialInstructionRule());
            					}
            					set(
            						current,
            						"keyword",
            						lv_keyword_1_0,
            						"com.robenglander.libretto.spec.LibrettoProjectProfile.InitialInstructionKeyword");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLibrettoProjectProfile.g:1692:3: ( (lv_instruction_2_0= RULE_STRING ) )
            // InternalLibrettoProjectProfile.g:1693:4: (lv_instruction_2_0= RULE_STRING )
            {
            // InternalLibrettoProjectProfile.g:1693:4: (lv_instruction_2_0= RULE_STRING )
            // InternalLibrettoProjectProfile.g:1694:5: lv_instruction_2_0= RULE_STRING
            {
            lv_instruction_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_instruction_2_0, grammarAccess.getInitialInstructionAccess().getInstructionSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInitialInstructionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"instruction",
            						lv_instruction_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleInitialInstruction"


    // $ANTLR start "entryRuleMaxRetries"
    // InternalLibrettoProjectProfile.g:1714:1: entryRuleMaxRetries returns [EObject current=null] : iv_ruleMaxRetries= ruleMaxRetries EOF ;
    public final EObject entryRuleMaxRetries() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaxRetries = null;


        try {
            // InternalLibrettoProjectProfile.g:1714:51: (iv_ruleMaxRetries= ruleMaxRetries EOF )
            // InternalLibrettoProjectProfile.g:1715:2: iv_ruleMaxRetries= ruleMaxRetries EOF
            {
             newCompositeNode(grammarAccess.getMaxRetriesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMaxRetries=ruleMaxRetries();

            state._fsp--;

             current =iv_ruleMaxRetries; 
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
    // $ANTLR end "entryRuleMaxRetries"


    // $ANTLR start "ruleMaxRetries"
    // InternalLibrettoProjectProfile.g:1721:1: ruleMaxRetries returns [EObject current=null] : ( () ( (lv_keyword_1_0= ruleMaxRetriesKeyword ) ) ( (lv_maxRetries_2_0= RULE_INT ) ) ) ;
    public final EObject ruleMaxRetries() throws RecognitionException {
        EObject current = null;

        Token lv_maxRetries_2_0=null;
        EObject lv_keyword_1_0 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:1727:2: ( ( () ( (lv_keyword_1_0= ruleMaxRetriesKeyword ) ) ( (lv_maxRetries_2_0= RULE_INT ) ) ) )
            // InternalLibrettoProjectProfile.g:1728:2: ( () ( (lv_keyword_1_0= ruleMaxRetriesKeyword ) ) ( (lv_maxRetries_2_0= RULE_INT ) ) )
            {
            // InternalLibrettoProjectProfile.g:1728:2: ( () ( (lv_keyword_1_0= ruleMaxRetriesKeyword ) ) ( (lv_maxRetries_2_0= RULE_INT ) ) )
            // InternalLibrettoProjectProfile.g:1729:3: () ( (lv_keyword_1_0= ruleMaxRetriesKeyword ) ) ( (lv_maxRetries_2_0= RULE_INT ) )
            {
            // InternalLibrettoProjectProfile.g:1729:3: ()
            // InternalLibrettoProjectProfile.g:1730:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMaxRetriesAccess().getMaxRetriesAction_0(),
            					current);
            			

            }

            // InternalLibrettoProjectProfile.g:1736:3: ( (lv_keyword_1_0= ruleMaxRetriesKeyword ) )
            // InternalLibrettoProjectProfile.g:1737:4: (lv_keyword_1_0= ruleMaxRetriesKeyword )
            {
            // InternalLibrettoProjectProfile.g:1737:4: (lv_keyword_1_0= ruleMaxRetriesKeyword )
            // InternalLibrettoProjectProfile.g:1738:5: lv_keyword_1_0= ruleMaxRetriesKeyword
            {

            					newCompositeNode(grammarAccess.getMaxRetriesAccess().getKeywordMaxRetriesKeywordParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_keyword_1_0=ruleMaxRetriesKeyword();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMaxRetriesRule());
            					}
            					set(
            						current,
            						"keyword",
            						lv_keyword_1_0,
            						"com.robenglander.libretto.spec.LibrettoProjectProfile.MaxRetriesKeyword");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLibrettoProjectProfile.g:1755:3: ( (lv_maxRetries_2_0= RULE_INT ) )
            // InternalLibrettoProjectProfile.g:1756:4: (lv_maxRetries_2_0= RULE_INT )
            {
            // InternalLibrettoProjectProfile.g:1756:4: (lv_maxRetries_2_0= RULE_INT )
            // InternalLibrettoProjectProfile.g:1757:5: lv_maxRetries_2_0= RULE_INT
            {
            lv_maxRetries_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_maxRetries_2_0, grammarAccess.getMaxRetriesAccess().getMaxRetriesINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMaxRetriesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"maxRetries",
            						lv_maxRetries_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleMaxRetries"


    // $ANTLR start "entryRuleParseCheck"
    // InternalLibrettoProjectProfile.g:1777:1: entryRuleParseCheck returns [EObject current=null] : iv_ruleParseCheck= ruleParseCheck EOF ;
    public final EObject entryRuleParseCheck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParseCheck = null;


        try {
            // InternalLibrettoProjectProfile.g:1777:51: (iv_ruleParseCheck= ruleParseCheck EOF )
            // InternalLibrettoProjectProfile.g:1778:2: iv_ruleParseCheck= ruleParseCheck EOF
            {
             newCompositeNode(grammarAccess.getParseCheckRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParseCheck=ruleParseCheck();

            state._fsp--;

             current =iv_ruleParseCheck; 
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
    // $ANTLR end "entryRuleParseCheck"


    // $ANTLR start "ruleParseCheck"
    // InternalLibrettoProjectProfile.g:1784:1: ruleParseCheck returns [EObject current=null] : ( () ( (lv_keyword_1_0= ruleParseCheckKeyword ) ) ( (lv_value_2_0= ruleTrueFalseKeyword ) ) ) ;
    public final EObject ruleParseCheck() throws RecognitionException {
        EObject current = null;

        EObject lv_keyword_1_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:1790:2: ( ( () ( (lv_keyword_1_0= ruleParseCheckKeyword ) ) ( (lv_value_2_0= ruleTrueFalseKeyword ) ) ) )
            // InternalLibrettoProjectProfile.g:1791:2: ( () ( (lv_keyword_1_0= ruleParseCheckKeyword ) ) ( (lv_value_2_0= ruleTrueFalseKeyword ) ) )
            {
            // InternalLibrettoProjectProfile.g:1791:2: ( () ( (lv_keyword_1_0= ruleParseCheckKeyword ) ) ( (lv_value_2_0= ruleTrueFalseKeyword ) ) )
            // InternalLibrettoProjectProfile.g:1792:3: () ( (lv_keyword_1_0= ruleParseCheckKeyword ) ) ( (lv_value_2_0= ruleTrueFalseKeyword ) )
            {
            // InternalLibrettoProjectProfile.g:1792:3: ()
            // InternalLibrettoProjectProfile.g:1793:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParseCheckAccess().getParseCheckAction_0(),
            					current);
            			

            }

            // InternalLibrettoProjectProfile.g:1799:3: ( (lv_keyword_1_0= ruleParseCheckKeyword ) )
            // InternalLibrettoProjectProfile.g:1800:4: (lv_keyword_1_0= ruleParseCheckKeyword )
            {
            // InternalLibrettoProjectProfile.g:1800:4: (lv_keyword_1_0= ruleParseCheckKeyword )
            // InternalLibrettoProjectProfile.g:1801:5: lv_keyword_1_0= ruleParseCheckKeyword
            {

            					newCompositeNode(grammarAccess.getParseCheckAccess().getKeywordParseCheckKeywordParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
            lv_keyword_1_0=ruleParseCheckKeyword();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParseCheckRule());
            					}
            					set(
            						current,
            						"keyword",
            						lv_keyword_1_0,
            						"com.robenglander.libretto.spec.LibrettoProjectProfile.ParseCheckKeyword");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLibrettoProjectProfile.g:1818:3: ( (lv_value_2_0= ruleTrueFalseKeyword ) )
            // InternalLibrettoProjectProfile.g:1819:4: (lv_value_2_0= ruleTrueFalseKeyword )
            {
            // InternalLibrettoProjectProfile.g:1819:4: (lv_value_2_0= ruleTrueFalseKeyword )
            // InternalLibrettoProjectProfile.g:1820:5: lv_value_2_0= ruleTrueFalseKeyword
            {

            					newCompositeNode(grammarAccess.getParseCheckAccess().getValueTrueFalseKeywordParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleTrueFalseKeyword();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParseCheckRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"com.robenglander.libretto.spec.LibrettoProjectProfile.TrueFalseKeyword");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleParseCheck"


    // $ANTLR start "entryRuleDefaultCorrection"
    // InternalLibrettoProjectProfile.g:1841:1: entryRuleDefaultCorrection returns [EObject current=null] : iv_ruleDefaultCorrection= ruleDefaultCorrection EOF ;
    public final EObject entryRuleDefaultCorrection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultCorrection = null;


        try {
            // InternalLibrettoProjectProfile.g:1841:58: (iv_ruleDefaultCorrection= ruleDefaultCorrection EOF )
            // InternalLibrettoProjectProfile.g:1842:2: iv_ruleDefaultCorrection= ruleDefaultCorrection EOF
            {
             newCompositeNode(grammarAccess.getDefaultCorrectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefaultCorrection=ruleDefaultCorrection();

            state._fsp--;

             current =iv_ruleDefaultCorrection; 
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
    // $ANTLR end "entryRuleDefaultCorrection"


    // $ANTLR start "ruleDefaultCorrection"
    // InternalLibrettoProjectProfile.g:1848:1: ruleDefaultCorrection returns [EObject current=null] : ( () ( (lv_keyword_1_0= ruleDefaultCorrectionKeyword ) ) ( (lv_correction_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleDefaultCorrection() throws RecognitionException {
        EObject current = null;

        Token lv_correction_2_0=null;
        EObject lv_keyword_1_0 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:1854:2: ( ( () ( (lv_keyword_1_0= ruleDefaultCorrectionKeyword ) ) ( (lv_correction_2_0= RULE_STRING ) ) ) )
            // InternalLibrettoProjectProfile.g:1855:2: ( () ( (lv_keyword_1_0= ruleDefaultCorrectionKeyword ) ) ( (lv_correction_2_0= RULE_STRING ) ) )
            {
            // InternalLibrettoProjectProfile.g:1855:2: ( () ( (lv_keyword_1_0= ruleDefaultCorrectionKeyword ) ) ( (lv_correction_2_0= RULE_STRING ) ) )
            // InternalLibrettoProjectProfile.g:1856:3: () ( (lv_keyword_1_0= ruleDefaultCorrectionKeyword ) ) ( (lv_correction_2_0= RULE_STRING ) )
            {
            // InternalLibrettoProjectProfile.g:1856:3: ()
            // InternalLibrettoProjectProfile.g:1857:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDefaultCorrectionAccess().getDefaultCorrectionAction_0(),
            					current);
            			

            }

            // InternalLibrettoProjectProfile.g:1863:3: ( (lv_keyword_1_0= ruleDefaultCorrectionKeyword ) )
            // InternalLibrettoProjectProfile.g:1864:4: (lv_keyword_1_0= ruleDefaultCorrectionKeyword )
            {
            // InternalLibrettoProjectProfile.g:1864:4: (lv_keyword_1_0= ruleDefaultCorrectionKeyword )
            // InternalLibrettoProjectProfile.g:1865:5: lv_keyword_1_0= ruleDefaultCorrectionKeyword
            {

            					newCompositeNode(grammarAccess.getDefaultCorrectionAccess().getKeywordDefaultCorrectionKeywordParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_keyword_1_0=ruleDefaultCorrectionKeyword();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDefaultCorrectionRule());
            					}
            					set(
            						current,
            						"keyword",
            						lv_keyword_1_0,
            						"com.robenglander.libretto.spec.LibrettoProjectProfile.DefaultCorrectionKeyword");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLibrettoProjectProfile.g:1882:3: ( (lv_correction_2_0= RULE_STRING ) )
            // InternalLibrettoProjectProfile.g:1883:4: (lv_correction_2_0= RULE_STRING )
            {
            // InternalLibrettoProjectProfile.g:1883:4: (lv_correction_2_0= RULE_STRING )
            // InternalLibrettoProjectProfile.g:1884:5: lv_correction_2_0= RULE_STRING
            {
            lv_correction_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_correction_2_0, grammarAccess.getDefaultCorrectionAccess().getCorrectionSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDefaultCorrectionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"correction",
            						lv_correction_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleDefaultCorrection"


    // $ANTLR start "entryRuleInitialInstructionKeyword"
    // InternalLibrettoProjectProfile.g:1904:1: entryRuleInitialInstructionKeyword returns [EObject current=null] : iv_ruleInitialInstructionKeyword= ruleInitialInstructionKeyword EOF ;
    public final EObject entryRuleInitialInstructionKeyword() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialInstructionKeyword = null;


        try {
            // InternalLibrettoProjectProfile.g:1904:66: (iv_ruleInitialInstructionKeyword= ruleInitialInstructionKeyword EOF )
            // InternalLibrettoProjectProfile.g:1905:2: iv_ruleInitialInstructionKeyword= ruleInitialInstructionKeyword EOF
            {
             newCompositeNode(grammarAccess.getInitialInstructionKeywordRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitialInstructionKeyword=ruleInitialInstructionKeyword();

            state._fsp--;

             current =iv_ruleInitialInstructionKeyword; 
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
    // $ANTLR end "entryRuleInitialInstructionKeyword"


    // $ANTLR start "ruleInitialInstructionKeyword"
    // InternalLibrettoProjectProfile.g:1911:1: ruleInitialInstructionKeyword returns [EObject current=null] : ( () ( ( (lv_keyword_1_1= 'initialinstruction' | lv_keyword_1_2= 'initialInstruction' ) ) ) ) ;
    public final EObject ruleInitialInstructionKeyword() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_1_1=null;
        Token lv_keyword_1_2=null;


        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:1917:2: ( ( () ( ( (lv_keyword_1_1= 'initialinstruction' | lv_keyword_1_2= 'initialInstruction' ) ) ) ) )
            // InternalLibrettoProjectProfile.g:1918:2: ( () ( ( (lv_keyword_1_1= 'initialinstruction' | lv_keyword_1_2= 'initialInstruction' ) ) ) )
            {
            // InternalLibrettoProjectProfile.g:1918:2: ( () ( ( (lv_keyword_1_1= 'initialinstruction' | lv_keyword_1_2= 'initialInstruction' ) ) ) )
            // InternalLibrettoProjectProfile.g:1919:3: () ( ( (lv_keyword_1_1= 'initialinstruction' | lv_keyword_1_2= 'initialInstruction' ) ) )
            {
            // InternalLibrettoProjectProfile.g:1919:3: ()
            // InternalLibrettoProjectProfile.g:1920:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInitialInstructionKeywordAccess().getInitialInstructionKeywordAction_0(),
            					current);
            			

            }

            // InternalLibrettoProjectProfile.g:1926:3: ( ( (lv_keyword_1_1= 'initialinstruction' | lv_keyword_1_2= 'initialInstruction' ) ) )
            // InternalLibrettoProjectProfile.g:1927:4: ( (lv_keyword_1_1= 'initialinstruction' | lv_keyword_1_2= 'initialInstruction' ) )
            {
            // InternalLibrettoProjectProfile.g:1927:4: ( (lv_keyword_1_1= 'initialinstruction' | lv_keyword_1_2= 'initialInstruction' ) )
            // InternalLibrettoProjectProfile.g:1928:5: (lv_keyword_1_1= 'initialinstruction' | lv_keyword_1_2= 'initialInstruction' )
            {
            // InternalLibrettoProjectProfile.g:1928:5: (lv_keyword_1_1= 'initialinstruction' | lv_keyword_1_2= 'initialInstruction' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==29) ) {
                alt12=1;
            }
            else if ( (LA12_0==30) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:1929:6: lv_keyword_1_1= 'initialinstruction'
                    {
                    lv_keyword_1_1=(Token)match(input,29,FOLLOW_2); 

                    						newLeafNode(lv_keyword_1_1, grammarAccess.getInitialInstructionKeywordAccess().getKeywordInitialinstructionKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInitialInstructionKeywordRule());
                    						}
                    						setWithLastConsumed(current, "keyword", lv_keyword_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalLibrettoProjectProfile.g:1940:6: lv_keyword_1_2= 'initialInstruction'
                    {
                    lv_keyword_1_2=(Token)match(input,30,FOLLOW_2); 

                    						newLeafNode(lv_keyword_1_2, grammarAccess.getInitialInstructionKeywordAccess().getKeywordInitialInstructionKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInitialInstructionKeywordRule());
                    						}
                    						setWithLastConsumed(current, "keyword", lv_keyword_1_2, null);
                    					

                    }
                    break;

            }


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
    // $ANTLR end "ruleInitialInstructionKeyword"


    // $ANTLR start "entryRuleMaxRetriesKeyword"
    // InternalLibrettoProjectProfile.g:1957:1: entryRuleMaxRetriesKeyword returns [EObject current=null] : iv_ruleMaxRetriesKeyword= ruleMaxRetriesKeyword EOF ;
    public final EObject entryRuleMaxRetriesKeyword() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaxRetriesKeyword = null;


        try {
            // InternalLibrettoProjectProfile.g:1957:58: (iv_ruleMaxRetriesKeyword= ruleMaxRetriesKeyword EOF )
            // InternalLibrettoProjectProfile.g:1958:2: iv_ruleMaxRetriesKeyword= ruleMaxRetriesKeyword EOF
            {
             newCompositeNode(grammarAccess.getMaxRetriesKeywordRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMaxRetriesKeyword=ruleMaxRetriesKeyword();

            state._fsp--;

             current =iv_ruleMaxRetriesKeyword; 
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
    // $ANTLR end "entryRuleMaxRetriesKeyword"


    // $ANTLR start "ruleMaxRetriesKeyword"
    // InternalLibrettoProjectProfile.g:1964:1: ruleMaxRetriesKeyword returns [EObject current=null] : ( () ( ( (lv_keyword_1_1= 'maxretries' | lv_keyword_1_2= 'maxRetries' ) ) ) ) ;
    public final EObject ruleMaxRetriesKeyword() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_1_1=null;
        Token lv_keyword_1_2=null;


        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:1970:2: ( ( () ( ( (lv_keyword_1_1= 'maxretries' | lv_keyword_1_2= 'maxRetries' ) ) ) ) )
            // InternalLibrettoProjectProfile.g:1971:2: ( () ( ( (lv_keyword_1_1= 'maxretries' | lv_keyword_1_2= 'maxRetries' ) ) ) )
            {
            // InternalLibrettoProjectProfile.g:1971:2: ( () ( ( (lv_keyword_1_1= 'maxretries' | lv_keyword_1_2= 'maxRetries' ) ) ) )
            // InternalLibrettoProjectProfile.g:1972:3: () ( ( (lv_keyword_1_1= 'maxretries' | lv_keyword_1_2= 'maxRetries' ) ) )
            {
            // InternalLibrettoProjectProfile.g:1972:3: ()
            // InternalLibrettoProjectProfile.g:1973:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMaxRetriesKeywordAccess().getMaxRetriesKeywordAction_0(),
            					current);
            			

            }

            // InternalLibrettoProjectProfile.g:1979:3: ( ( (lv_keyword_1_1= 'maxretries' | lv_keyword_1_2= 'maxRetries' ) ) )
            // InternalLibrettoProjectProfile.g:1980:4: ( (lv_keyword_1_1= 'maxretries' | lv_keyword_1_2= 'maxRetries' ) )
            {
            // InternalLibrettoProjectProfile.g:1980:4: ( (lv_keyword_1_1= 'maxretries' | lv_keyword_1_2= 'maxRetries' ) )
            // InternalLibrettoProjectProfile.g:1981:5: (lv_keyword_1_1= 'maxretries' | lv_keyword_1_2= 'maxRetries' )
            {
            // InternalLibrettoProjectProfile.g:1981:5: (lv_keyword_1_1= 'maxretries' | lv_keyword_1_2= 'maxRetries' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==31) ) {
                alt13=1;
            }
            else if ( (LA13_0==32) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:1982:6: lv_keyword_1_1= 'maxretries'
                    {
                    lv_keyword_1_1=(Token)match(input,31,FOLLOW_2); 

                    						newLeafNode(lv_keyword_1_1, grammarAccess.getMaxRetriesKeywordAccess().getKeywordMaxretriesKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMaxRetriesKeywordRule());
                    						}
                    						setWithLastConsumed(current, "keyword", lv_keyword_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalLibrettoProjectProfile.g:1993:6: lv_keyword_1_2= 'maxRetries'
                    {
                    lv_keyword_1_2=(Token)match(input,32,FOLLOW_2); 

                    						newLeafNode(lv_keyword_1_2, grammarAccess.getMaxRetriesKeywordAccess().getKeywordMaxRetriesKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMaxRetriesKeywordRule());
                    						}
                    						setWithLastConsumed(current, "keyword", lv_keyword_1_2, null);
                    					

                    }
                    break;

            }


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
    // $ANTLR end "ruleMaxRetriesKeyword"


    // $ANTLR start "entryRuleParseCheckKeyword"
    // InternalLibrettoProjectProfile.g:2010:1: entryRuleParseCheckKeyword returns [EObject current=null] : iv_ruleParseCheckKeyword= ruleParseCheckKeyword EOF ;
    public final EObject entryRuleParseCheckKeyword() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParseCheckKeyword = null;


        try {
            // InternalLibrettoProjectProfile.g:2010:58: (iv_ruleParseCheckKeyword= ruleParseCheckKeyword EOF )
            // InternalLibrettoProjectProfile.g:2011:2: iv_ruleParseCheckKeyword= ruleParseCheckKeyword EOF
            {
             newCompositeNode(grammarAccess.getParseCheckKeywordRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParseCheckKeyword=ruleParseCheckKeyword();

            state._fsp--;

             current =iv_ruleParseCheckKeyword; 
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
    // $ANTLR end "entryRuleParseCheckKeyword"


    // $ANTLR start "ruleParseCheckKeyword"
    // InternalLibrettoProjectProfile.g:2017:1: ruleParseCheckKeyword returns [EObject current=null] : ( () ( ( (lv_keyword_1_1= 'parsecheck' | lv_keyword_1_2= 'parseCheck' ) ) ) ) ;
    public final EObject ruleParseCheckKeyword() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_1_1=null;
        Token lv_keyword_1_2=null;


        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:2023:2: ( ( () ( ( (lv_keyword_1_1= 'parsecheck' | lv_keyword_1_2= 'parseCheck' ) ) ) ) )
            // InternalLibrettoProjectProfile.g:2024:2: ( () ( ( (lv_keyword_1_1= 'parsecheck' | lv_keyword_1_2= 'parseCheck' ) ) ) )
            {
            // InternalLibrettoProjectProfile.g:2024:2: ( () ( ( (lv_keyword_1_1= 'parsecheck' | lv_keyword_1_2= 'parseCheck' ) ) ) )
            // InternalLibrettoProjectProfile.g:2025:3: () ( ( (lv_keyword_1_1= 'parsecheck' | lv_keyword_1_2= 'parseCheck' ) ) )
            {
            // InternalLibrettoProjectProfile.g:2025:3: ()
            // InternalLibrettoProjectProfile.g:2026:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParseCheckKeywordAccess().getParseCheckKeywordAction_0(),
            					current);
            			

            }

            // InternalLibrettoProjectProfile.g:2032:3: ( ( (lv_keyword_1_1= 'parsecheck' | lv_keyword_1_2= 'parseCheck' ) ) )
            // InternalLibrettoProjectProfile.g:2033:4: ( (lv_keyword_1_1= 'parsecheck' | lv_keyword_1_2= 'parseCheck' ) )
            {
            // InternalLibrettoProjectProfile.g:2033:4: ( (lv_keyword_1_1= 'parsecheck' | lv_keyword_1_2= 'parseCheck' ) )
            // InternalLibrettoProjectProfile.g:2034:5: (lv_keyword_1_1= 'parsecheck' | lv_keyword_1_2= 'parseCheck' )
            {
            // InternalLibrettoProjectProfile.g:2034:5: (lv_keyword_1_1= 'parsecheck' | lv_keyword_1_2= 'parseCheck' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==33) ) {
                alt14=1;
            }
            else if ( (LA14_0==34) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:2035:6: lv_keyword_1_1= 'parsecheck'
                    {
                    lv_keyword_1_1=(Token)match(input,33,FOLLOW_2); 

                    						newLeafNode(lv_keyword_1_1, grammarAccess.getParseCheckKeywordAccess().getKeywordParsecheckKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParseCheckKeywordRule());
                    						}
                    						setWithLastConsumed(current, "keyword", lv_keyword_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalLibrettoProjectProfile.g:2046:6: lv_keyword_1_2= 'parseCheck'
                    {
                    lv_keyword_1_2=(Token)match(input,34,FOLLOW_2); 

                    						newLeafNode(lv_keyword_1_2, grammarAccess.getParseCheckKeywordAccess().getKeywordParseCheckKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParseCheckKeywordRule());
                    						}
                    						setWithLastConsumed(current, "keyword", lv_keyword_1_2, null);
                    					

                    }
                    break;

            }


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
    // $ANTLR end "ruleParseCheckKeyword"


    // $ANTLR start "entryRuleDefaultCorrectionKeyword"
    // InternalLibrettoProjectProfile.g:2063:1: entryRuleDefaultCorrectionKeyword returns [EObject current=null] : iv_ruleDefaultCorrectionKeyword= ruleDefaultCorrectionKeyword EOF ;
    public final EObject entryRuleDefaultCorrectionKeyword() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultCorrectionKeyword = null;


        try {
            // InternalLibrettoProjectProfile.g:2063:65: (iv_ruleDefaultCorrectionKeyword= ruleDefaultCorrectionKeyword EOF )
            // InternalLibrettoProjectProfile.g:2064:2: iv_ruleDefaultCorrectionKeyword= ruleDefaultCorrectionKeyword EOF
            {
             newCompositeNode(grammarAccess.getDefaultCorrectionKeywordRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefaultCorrectionKeyword=ruleDefaultCorrectionKeyword();

            state._fsp--;

             current =iv_ruleDefaultCorrectionKeyword; 
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
    // $ANTLR end "entryRuleDefaultCorrectionKeyword"


    // $ANTLR start "ruleDefaultCorrectionKeyword"
    // InternalLibrettoProjectProfile.g:2070:1: ruleDefaultCorrectionKeyword returns [EObject current=null] : ( () ( ( (lv_keyword_1_1= 'defaultcorrection' | lv_keyword_1_2= 'defaultCorrection' ) ) ) ) ;
    public final EObject ruleDefaultCorrectionKeyword() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_1_1=null;
        Token lv_keyword_1_2=null;


        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:2076:2: ( ( () ( ( (lv_keyword_1_1= 'defaultcorrection' | lv_keyword_1_2= 'defaultCorrection' ) ) ) ) )
            // InternalLibrettoProjectProfile.g:2077:2: ( () ( ( (lv_keyword_1_1= 'defaultcorrection' | lv_keyword_1_2= 'defaultCorrection' ) ) ) )
            {
            // InternalLibrettoProjectProfile.g:2077:2: ( () ( ( (lv_keyword_1_1= 'defaultcorrection' | lv_keyword_1_2= 'defaultCorrection' ) ) ) )
            // InternalLibrettoProjectProfile.g:2078:3: () ( ( (lv_keyword_1_1= 'defaultcorrection' | lv_keyword_1_2= 'defaultCorrection' ) ) )
            {
            // InternalLibrettoProjectProfile.g:2078:3: ()
            // InternalLibrettoProjectProfile.g:2079:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDefaultCorrectionKeywordAccess().getDefaultCorrectionKeywordAction_0(),
            					current);
            			

            }

            // InternalLibrettoProjectProfile.g:2085:3: ( ( (lv_keyword_1_1= 'defaultcorrection' | lv_keyword_1_2= 'defaultCorrection' ) ) )
            // InternalLibrettoProjectProfile.g:2086:4: ( (lv_keyword_1_1= 'defaultcorrection' | lv_keyword_1_2= 'defaultCorrection' ) )
            {
            // InternalLibrettoProjectProfile.g:2086:4: ( (lv_keyword_1_1= 'defaultcorrection' | lv_keyword_1_2= 'defaultCorrection' ) )
            // InternalLibrettoProjectProfile.g:2087:5: (lv_keyword_1_1= 'defaultcorrection' | lv_keyword_1_2= 'defaultCorrection' )
            {
            // InternalLibrettoProjectProfile.g:2087:5: (lv_keyword_1_1= 'defaultcorrection' | lv_keyword_1_2= 'defaultCorrection' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==35) ) {
                alt15=1;
            }
            else if ( (LA15_0==36) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:2088:6: lv_keyword_1_1= 'defaultcorrection'
                    {
                    lv_keyword_1_1=(Token)match(input,35,FOLLOW_2); 

                    						newLeafNode(lv_keyword_1_1, grammarAccess.getDefaultCorrectionKeywordAccess().getKeywordDefaultcorrectionKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDefaultCorrectionKeywordRule());
                    						}
                    						setWithLastConsumed(current, "keyword", lv_keyword_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalLibrettoProjectProfile.g:2099:6: lv_keyword_1_2= 'defaultCorrection'
                    {
                    lv_keyword_1_2=(Token)match(input,36,FOLLOW_2); 

                    						newLeafNode(lv_keyword_1_2, grammarAccess.getDefaultCorrectionKeywordAccess().getKeywordDefaultCorrectionKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDefaultCorrectionKeywordRule());
                    						}
                    						setWithLastConsumed(current, "keyword", lv_keyword_1_2, null);
                    					

                    }
                    break;

            }


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
    // $ANTLR end "ruleDefaultCorrectionKeyword"


    // $ANTLR start "entryRuleTrueFalseKeyword"
    // InternalLibrettoProjectProfile.g:2116:1: entryRuleTrueFalseKeyword returns [EObject current=null] : iv_ruleTrueFalseKeyword= ruleTrueFalseKeyword EOF ;
    public final EObject entryRuleTrueFalseKeyword() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrueFalseKeyword = null;


        try {
            // InternalLibrettoProjectProfile.g:2116:57: (iv_ruleTrueFalseKeyword= ruleTrueFalseKeyword EOF )
            // InternalLibrettoProjectProfile.g:2117:2: iv_ruleTrueFalseKeyword= ruleTrueFalseKeyword EOF
            {
             newCompositeNode(grammarAccess.getTrueFalseKeywordRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTrueFalseKeyword=ruleTrueFalseKeyword();

            state._fsp--;

             current =iv_ruleTrueFalseKeyword; 
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
    // $ANTLR end "entryRuleTrueFalseKeyword"


    // $ANTLR start "ruleTrueFalseKeyword"
    // InternalLibrettoProjectProfile.g:2123:1: ruleTrueFalseKeyword returns [EObject current=null] : ( () ( ( (lv_keyword_1_1= 'true' | lv_keyword_1_2= 'false' ) ) ) ) ;
    public final EObject ruleTrueFalseKeyword() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_1_1=null;
        Token lv_keyword_1_2=null;


        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:2129:2: ( ( () ( ( (lv_keyword_1_1= 'true' | lv_keyword_1_2= 'false' ) ) ) ) )
            // InternalLibrettoProjectProfile.g:2130:2: ( () ( ( (lv_keyword_1_1= 'true' | lv_keyword_1_2= 'false' ) ) ) )
            {
            // InternalLibrettoProjectProfile.g:2130:2: ( () ( ( (lv_keyword_1_1= 'true' | lv_keyword_1_2= 'false' ) ) ) )
            // InternalLibrettoProjectProfile.g:2131:3: () ( ( (lv_keyword_1_1= 'true' | lv_keyword_1_2= 'false' ) ) )
            {
            // InternalLibrettoProjectProfile.g:2131:3: ()
            // InternalLibrettoProjectProfile.g:2132:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTrueFalseKeywordAccess().getTrueKeywordAction_0(),
            					current);
            			

            }

            // InternalLibrettoProjectProfile.g:2138:3: ( ( (lv_keyword_1_1= 'true' | lv_keyword_1_2= 'false' ) ) )
            // InternalLibrettoProjectProfile.g:2139:4: ( (lv_keyword_1_1= 'true' | lv_keyword_1_2= 'false' ) )
            {
            // InternalLibrettoProjectProfile.g:2139:4: ( (lv_keyword_1_1= 'true' | lv_keyword_1_2= 'false' ) )
            // InternalLibrettoProjectProfile.g:2140:5: (lv_keyword_1_1= 'true' | lv_keyword_1_2= 'false' )
            {
            // InternalLibrettoProjectProfile.g:2140:5: (lv_keyword_1_1= 'true' | lv_keyword_1_2= 'false' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==37) ) {
                alt16=1;
            }
            else if ( (LA16_0==38) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:2141:6: lv_keyword_1_1= 'true'
                    {
                    lv_keyword_1_1=(Token)match(input,37,FOLLOW_2); 

                    						newLeafNode(lv_keyword_1_1, grammarAccess.getTrueFalseKeywordAccess().getKeywordTrueKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTrueFalseKeywordRule());
                    						}
                    						setWithLastConsumed(current, "keyword", lv_keyword_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalLibrettoProjectProfile.g:2152:6: lv_keyword_1_2= 'false'
                    {
                    lv_keyword_1_2=(Token)match(input,38,FOLLOW_2); 

                    						newLeafNode(lv_keyword_1_2, grammarAccess.getTrueFalseKeywordAccess().getKeywordFalseKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTrueFalseKeywordRule());
                    						}
                    						setWithLastConsumed(current, "keyword", lv_keyword_1_2, null);
                    					

                    }
                    break;

            }


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
    // $ANTLR end "ruleTrueFalseKeyword"


    // $ANTLR start "entryRuleGenRemediationRules"
    // InternalLibrettoProjectProfile.g:2169:1: entryRuleGenRemediationRules returns [EObject current=null] : iv_ruleGenRemediationRules= ruleGenRemediationRules EOF ;
    public final EObject entryRuleGenRemediationRules() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenRemediationRules = null;


        try {
            // InternalLibrettoProjectProfile.g:2169:60: (iv_ruleGenRemediationRules= ruleGenRemediationRules EOF )
            // InternalLibrettoProjectProfile.g:2170:2: iv_ruleGenRemediationRules= ruleGenRemediationRules EOF
            {
             newCompositeNode(grammarAccess.getGenRemediationRulesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGenRemediationRules=ruleGenRemediationRules();

            state._fsp--;

             current =iv_ruleGenRemediationRules; 
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
    // $ANTLR end "entryRuleGenRemediationRules"


    // $ANTLR start "ruleGenRemediationRules"
    // InternalLibrettoProjectProfile.g:2176:1: ruleGenRemediationRules returns [EObject current=null] : ( () ( (lv_rulesKeyword_1_0= ruleRulesKeyword ) ) otherlv_2= '{' ( ( (lv_patternRules_3_0= ruleGenPatternRemediationRule ) ) | ( (lv_defaultRemediations_4_0= ruleGenDefaultRemediationRule ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleGenRemediationRules() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_rulesKeyword_1_0 = null;

        EObject lv_patternRules_3_0 = null;

        EObject lv_defaultRemediations_4_0 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:2182:2: ( ( () ( (lv_rulesKeyword_1_0= ruleRulesKeyword ) ) otherlv_2= '{' ( ( (lv_patternRules_3_0= ruleGenPatternRemediationRule ) ) | ( (lv_defaultRemediations_4_0= ruleGenDefaultRemediationRule ) ) )* otherlv_5= '}' ) )
            // InternalLibrettoProjectProfile.g:2183:2: ( () ( (lv_rulesKeyword_1_0= ruleRulesKeyword ) ) otherlv_2= '{' ( ( (lv_patternRules_3_0= ruleGenPatternRemediationRule ) ) | ( (lv_defaultRemediations_4_0= ruleGenDefaultRemediationRule ) ) )* otherlv_5= '}' )
            {
            // InternalLibrettoProjectProfile.g:2183:2: ( () ( (lv_rulesKeyword_1_0= ruleRulesKeyword ) ) otherlv_2= '{' ( ( (lv_patternRules_3_0= ruleGenPatternRemediationRule ) ) | ( (lv_defaultRemediations_4_0= ruleGenDefaultRemediationRule ) ) )* otherlv_5= '}' )
            // InternalLibrettoProjectProfile.g:2184:3: () ( (lv_rulesKeyword_1_0= ruleRulesKeyword ) ) otherlv_2= '{' ( ( (lv_patternRules_3_0= ruleGenPatternRemediationRule ) ) | ( (lv_defaultRemediations_4_0= ruleGenDefaultRemediationRule ) ) )* otherlv_5= '}'
            {
            // InternalLibrettoProjectProfile.g:2184:3: ()
            // InternalLibrettoProjectProfile.g:2185:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGenRemediationRulesAccess().getGenRemediationRulesAction_0(),
            					current);
            			

            }

            // InternalLibrettoProjectProfile.g:2191:3: ( (lv_rulesKeyword_1_0= ruleRulesKeyword ) )
            // InternalLibrettoProjectProfile.g:2192:4: (lv_rulesKeyword_1_0= ruleRulesKeyword )
            {
            // InternalLibrettoProjectProfile.g:2192:4: (lv_rulesKeyword_1_0= ruleRulesKeyword )
            // InternalLibrettoProjectProfile.g:2193:5: lv_rulesKeyword_1_0= ruleRulesKeyword
            {

            					newCompositeNode(grammarAccess.getGenRemediationRulesAccess().getRulesKeywordRulesKeywordParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_rulesKeyword_1_0=ruleRulesKeyword();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGenRemediationRulesRule());
            					}
            					set(
            						current,
            						"rulesKeyword",
            						lv_rulesKeyword_1_0,
            						"com.robenglander.libretto.spec.LibrettoProjectProfile.RulesKeyword");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,11,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getGenRemediationRulesAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLibrettoProjectProfile.g:2214:3: ( ( (lv_patternRules_3_0= ruleGenPatternRemediationRule ) ) | ( (lv_defaultRemediations_4_0= ruleGenDefaultRemediationRule ) ) )*
            loop17:
            do {
                int alt17=3;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==40) ) {
                    alt17=1;
                }
                else if ( (LA17_0==44) ) {
                    alt17=2;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:2215:4: ( (lv_patternRules_3_0= ruleGenPatternRemediationRule ) )
            	    {
            	    // InternalLibrettoProjectProfile.g:2215:4: ( (lv_patternRules_3_0= ruleGenPatternRemediationRule ) )
            	    // InternalLibrettoProjectProfile.g:2216:5: (lv_patternRules_3_0= ruleGenPatternRemediationRule )
            	    {
            	    // InternalLibrettoProjectProfile.g:2216:5: (lv_patternRules_3_0= ruleGenPatternRemediationRule )
            	    // InternalLibrettoProjectProfile.g:2217:6: lv_patternRules_3_0= ruleGenPatternRemediationRule
            	    {

            	    						newCompositeNode(grammarAccess.getGenRemediationRulesAccess().getPatternRulesGenPatternRemediationRuleParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_patternRules_3_0=ruleGenPatternRemediationRule();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGenRemediationRulesRule());
            	    						}
            	    						add(
            	    							current,
            	    							"patternRules",
            	    							lv_patternRules_3_0,
            	    							"com.robenglander.libretto.spec.LibrettoProjectProfile.GenPatternRemediationRule");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalLibrettoProjectProfile.g:2235:4: ( (lv_defaultRemediations_4_0= ruleGenDefaultRemediationRule ) )
            	    {
            	    // InternalLibrettoProjectProfile.g:2235:4: ( (lv_defaultRemediations_4_0= ruleGenDefaultRemediationRule ) )
            	    // InternalLibrettoProjectProfile.g:2236:5: (lv_defaultRemediations_4_0= ruleGenDefaultRemediationRule )
            	    {
            	    // InternalLibrettoProjectProfile.g:2236:5: (lv_defaultRemediations_4_0= ruleGenDefaultRemediationRule )
            	    // InternalLibrettoProjectProfile.g:2237:6: lv_defaultRemediations_4_0= ruleGenDefaultRemediationRule
            	    {

            	    						newCompositeNode(grammarAccess.getGenRemediationRulesAccess().getDefaultRemediationsGenDefaultRemediationRuleParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_defaultRemediations_4_0=ruleGenDefaultRemediationRule();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGenRemediationRulesRule());
            	    						}
            	    						add(
            	    							current,
            	    							"defaultRemediations",
            	    							lv_defaultRemediations_4_0,
            	    							"com.robenglander.libretto.spec.LibrettoProjectProfile.GenDefaultRemediationRule");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_5=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getGenRemediationRulesAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleGenRemediationRules"


    // $ANTLR start "entryRuleRulesKeyword"
    // InternalLibrettoProjectProfile.g:2263:1: entryRuleRulesKeyword returns [EObject current=null] : iv_ruleRulesKeyword= ruleRulesKeyword EOF ;
    public final EObject entryRuleRulesKeyword() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRulesKeyword = null;


        try {
            // InternalLibrettoProjectProfile.g:2263:53: (iv_ruleRulesKeyword= ruleRulesKeyword EOF )
            // InternalLibrettoProjectProfile.g:2264:2: iv_ruleRulesKeyword= ruleRulesKeyword EOF
            {
             newCompositeNode(grammarAccess.getRulesKeywordRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRulesKeyword=ruleRulesKeyword();

            state._fsp--;

             current =iv_ruleRulesKeyword; 
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
    // $ANTLR end "entryRuleRulesKeyword"


    // $ANTLR start "ruleRulesKeyword"
    // InternalLibrettoProjectProfile.g:2270:1: ruleRulesKeyword returns [EObject current=null] : ( () ( (lv_keyword_1_0= 'rules' ) ) ) ;
    public final EObject ruleRulesKeyword() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_1_0=null;


        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:2276:2: ( ( () ( (lv_keyword_1_0= 'rules' ) ) ) )
            // InternalLibrettoProjectProfile.g:2277:2: ( () ( (lv_keyword_1_0= 'rules' ) ) )
            {
            // InternalLibrettoProjectProfile.g:2277:2: ( () ( (lv_keyword_1_0= 'rules' ) ) )
            // InternalLibrettoProjectProfile.g:2278:3: () ( (lv_keyword_1_0= 'rules' ) )
            {
            // InternalLibrettoProjectProfile.g:2278:3: ()
            // InternalLibrettoProjectProfile.g:2279:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRulesKeywordAccess().getRulesKeywordAction_0(),
            					current);
            			

            }

            // InternalLibrettoProjectProfile.g:2285:3: ( (lv_keyword_1_0= 'rules' ) )
            // InternalLibrettoProjectProfile.g:2286:4: (lv_keyword_1_0= 'rules' )
            {
            // InternalLibrettoProjectProfile.g:2286:4: (lv_keyword_1_0= 'rules' )
            // InternalLibrettoProjectProfile.g:2287:5: lv_keyword_1_0= 'rules'
            {
            lv_keyword_1_0=(Token)match(input,39,FOLLOW_2); 

            					newLeafNode(lv_keyword_1_0, grammarAccess.getRulesKeywordAccess().getKeywordRulesKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRulesKeywordRule());
            					}
            					setWithLastConsumed(current, "keyword", lv_keyword_1_0, "rules");
            				

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
    // $ANTLR end "ruleRulesKeyword"


    // $ANTLR start "entryRuleGenPatternRemediationRule"
    // InternalLibrettoProjectProfile.g:2303:1: entryRuleGenPatternRemediationRule returns [EObject current=null] : iv_ruleGenPatternRemediationRule= ruleGenPatternRemediationRule EOF ;
    public final EObject entryRuleGenPatternRemediationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenPatternRemediationRule = null;


        try {
            // InternalLibrettoProjectProfile.g:2303:66: (iv_ruleGenPatternRemediationRule= ruleGenPatternRemediationRule EOF )
            // InternalLibrettoProjectProfile.g:2304:2: iv_ruleGenPatternRemediationRule= ruleGenPatternRemediationRule EOF
            {
             newCompositeNode(grammarAccess.getGenPatternRemediationRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGenPatternRemediationRule=ruleGenPatternRemediationRule();

            state._fsp--;

             current =iv_ruleGenPatternRemediationRule; 
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
    // $ANTLR end "entryRuleGenPatternRemediationRule"


    // $ANTLR start "ruleGenPatternRemediationRule"
    // InternalLibrettoProjectProfile.g:2310:1: ruleGenPatternRemediationRule returns [EObject current=null] : ( () ( (lv_keyword_1_0= ruleRuleKeyword ) ) otherlv_2= '{' ( ( (lv_patterns_3_0= rulePattern ) ) | ( (lv_codes_4_0= ruleCode ) ) | ( (lv_corrections_5_0= ruleCorrection ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleGenPatternRemediationRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_keyword_1_0 = null;

        EObject lv_patterns_3_0 = null;

        EObject lv_codes_4_0 = null;

        EObject lv_corrections_5_0 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:2316:2: ( ( () ( (lv_keyword_1_0= ruleRuleKeyword ) ) otherlv_2= '{' ( ( (lv_patterns_3_0= rulePattern ) ) | ( (lv_codes_4_0= ruleCode ) ) | ( (lv_corrections_5_0= ruleCorrection ) ) )* otherlv_6= '}' ) )
            // InternalLibrettoProjectProfile.g:2317:2: ( () ( (lv_keyword_1_0= ruleRuleKeyword ) ) otherlv_2= '{' ( ( (lv_patterns_3_0= rulePattern ) ) | ( (lv_codes_4_0= ruleCode ) ) | ( (lv_corrections_5_0= ruleCorrection ) ) )* otherlv_6= '}' )
            {
            // InternalLibrettoProjectProfile.g:2317:2: ( () ( (lv_keyword_1_0= ruleRuleKeyword ) ) otherlv_2= '{' ( ( (lv_patterns_3_0= rulePattern ) ) | ( (lv_codes_4_0= ruleCode ) ) | ( (lv_corrections_5_0= ruleCorrection ) ) )* otherlv_6= '}' )
            // InternalLibrettoProjectProfile.g:2318:3: () ( (lv_keyword_1_0= ruleRuleKeyword ) ) otherlv_2= '{' ( ( (lv_patterns_3_0= rulePattern ) ) | ( (lv_codes_4_0= ruleCode ) ) | ( (lv_corrections_5_0= ruleCorrection ) ) )* otherlv_6= '}'
            {
            // InternalLibrettoProjectProfile.g:2318:3: ()
            // InternalLibrettoProjectProfile.g:2319:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGenPatternRemediationRuleAccess().getGenPatternRemediationRuleAction_0(),
            					current);
            			

            }

            // InternalLibrettoProjectProfile.g:2325:3: ( (lv_keyword_1_0= ruleRuleKeyword ) )
            // InternalLibrettoProjectProfile.g:2326:4: (lv_keyword_1_0= ruleRuleKeyword )
            {
            // InternalLibrettoProjectProfile.g:2326:4: (lv_keyword_1_0= ruleRuleKeyword )
            // InternalLibrettoProjectProfile.g:2327:5: lv_keyword_1_0= ruleRuleKeyword
            {

            					newCompositeNode(grammarAccess.getGenPatternRemediationRuleAccess().getKeywordRuleKeywordParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_keyword_1_0=ruleRuleKeyword();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGenPatternRemediationRuleRule());
            					}
            					set(
            						current,
            						"keyword",
            						lv_keyword_1_0,
            						"com.robenglander.libretto.spec.LibrettoProjectProfile.RuleKeyword");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,11,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getGenPatternRemediationRuleAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLibrettoProjectProfile.g:2348:3: ( ( (lv_patterns_3_0= rulePattern ) ) | ( (lv_codes_4_0= ruleCode ) ) | ( (lv_corrections_5_0= ruleCorrection ) ) )*
            loop18:
            do {
                int alt18=4;
                switch ( input.LA(1) ) {
                case 41:
                    {
                    alt18=1;
                    }
                    break;
                case 42:
                    {
                    alt18=2;
                    }
                    break;
                case 43:
                    {
                    alt18=3;
                    }
                    break;

                }

                switch (alt18) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:2349:4: ( (lv_patterns_3_0= rulePattern ) )
            	    {
            	    // InternalLibrettoProjectProfile.g:2349:4: ( (lv_patterns_3_0= rulePattern ) )
            	    // InternalLibrettoProjectProfile.g:2350:5: (lv_patterns_3_0= rulePattern )
            	    {
            	    // InternalLibrettoProjectProfile.g:2350:5: (lv_patterns_3_0= rulePattern )
            	    // InternalLibrettoProjectProfile.g:2351:6: lv_patterns_3_0= rulePattern
            	    {

            	    						newCompositeNode(grammarAccess.getGenPatternRemediationRuleAccess().getPatternsPatternParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_patterns_3_0=rulePattern();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGenPatternRemediationRuleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"patterns",
            	    							lv_patterns_3_0,
            	    							"com.robenglander.libretto.spec.LibrettoProjectProfile.Pattern");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalLibrettoProjectProfile.g:2369:4: ( (lv_codes_4_0= ruleCode ) )
            	    {
            	    // InternalLibrettoProjectProfile.g:2369:4: ( (lv_codes_4_0= ruleCode ) )
            	    // InternalLibrettoProjectProfile.g:2370:5: (lv_codes_4_0= ruleCode )
            	    {
            	    // InternalLibrettoProjectProfile.g:2370:5: (lv_codes_4_0= ruleCode )
            	    // InternalLibrettoProjectProfile.g:2371:6: lv_codes_4_0= ruleCode
            	    {

            	    						newCompositeNode(grammarAccess.getGenPatternRemediationRuleAccess().getCodesCodeParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_codes_4_0=ruleCode();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGenPatternRemediationRuleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"codes",
            	    							lv_codes_4_0,
            	    							"com.robenglander.libretto.spec.LibrettoProjectProfile.Code");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalLibrettoProjectProfile.g:2389:4: ( (lv_corrections_5_0= ruleCorrection ) )
            	    {
            	    // InternalLibrettoProjectProfile.g:2389:4: ( (lv_corrections_5_0= ruleCorrection ) )
            	    // InternalLibrettoProjectProfile.g:2390:5: (lv_corrections_5_0= ruleCorrection )
            	    {
            	    // InternalLibrettoProjectProfile.g:2390:5: (lv_corrections_5_0= ruleCorrection )
            	    // InternalLibrettoProjectProfile.g:2391:6: lv_corrections_5_0= ruleCorrection
            	    {

            	    						newCompositeNode(grammarAccess.getGenPatternRemediationRuleAccess().getCorrectionsCorrectionParserRuleCall_3_2_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_corrections_5_0=ruleCorrection();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGenPatternRemediationRuleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"corrections",
            	    							lv_corrections_5_0,
            	    							"com.robenglander.libretto.spec.LibrettoProjectProfile.Correction");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_6=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getGenPatternRemediationRuleAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleGenPatternRemediationRule"


    // $ANTLR start "entryRuleRuleKeyword"
    // InternalLibrettoProjectProfile.g:2417:1: entryRuleRuleKeyword returns [EObject current=null] : iv_ruleRuleKeyword= ruleRuleKeyword EOF ;
    public final EObject entryRuleRuleKeyword() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleKeyword = null;


        try {
            // InternalLibrettoProjectProfile.g:2417:52: (iv_ruleRuleKeyword= ruleRuleKeyword EOF )
            // InternalLibrettoProjectProfile.g:2418:2: iv_ruleRuleKeyword= ruleRuleKeyword EOF
            {
             newCompositeNode(grammarAccess.getRuleKeywordRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRuleKeyword=ruleRuleKeyword();

            state._fsp--;

             current =iv_ruleRuleKeyword; 
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
    // $ANTLR end "entryRuleRuleKeyword"


    // $ANTLR start "ruleRuleKeyword"
    // InternalLibrettoProjectProfile.g:2424:1: ruleRuleKeyword returns [EObject current=null] : ( () ( (lv_keyword_1_0= 'rule' ) ) ) ;
    public final EObject ruleRuleKeyword() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_1_0=null;


        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:2430:2: ( ( () ( (lv_keyword_1_0= 'rule' ) ) ) )
            // InternalLibrettoProjectProfile.g:2431:2: ( () ( (lv_keyword_1_0= 'rule' ) ) )
            {
            // InternalLibrettoProjectProfile.g:2431:2: ( () ( (lv_keyword_1_0= 'rule' ) ) )
            // InternalLibrettoProjectProfile.g:2432:3: () ( (lv_keyword_1_0= 'rule' ) )
            {
            // InternalLibrettoProjectProfile.g:2432:3: ()
            // InternalLibrettoProjectProfile.g:2433:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRuleKeywordAccess().getRuleKeywordAction_0(),
            					current);
            			

            }

            // InternalLibrettoProjectProfile.g:2439:3: ( (lv_keyword_1_0= 'rule' ) )
            // InternalLibrettoProjectProfile.g:2440:4: (lv_keyword_1_0= 'rule' )
            {
            // InternalLibrettoProjectProfile.g:2440:4: (lv_keyword_1_0= 'rule' )
            // InternalLibrettoProjectProfile.g:2441:5: lv_keyword_1_0= 'rule'
            {
            lv_keyword_1_0=(Token)match(input,40,FOLLOW_2); 

            					newLeafNode(lv_keyword_1_0, grammarAccess.getRuleKeywordAccess().getKeywordRuleKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleKeywordRule());
            					}
            					setWithLastConsumed(current, "keyword", lv_keyword_1_0, "rule");
            				

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
    // $ANTLR end "ruleRuleKeyword"


    // $ANTLR start "entryRulePattern"
    // InternalLibrettoProjectProfile.g:2457:1: entryRulePattern returns [EObject current=null] : iv_rulePattern= rulePattern EOF ;
    public final EObject entryRulePattern() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePattern = null;


        try {
            // InternalLibrettoProjectProfile.g:2457:48: (iv_rulePattern= rulePattern EOF )
            // InternalLibrettoProjectProfile.g:2458:2: iv_rulePattern= rulePattern EOF
            {
             newCompositeNode(grammarAccess.getPatternRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePattern=rulePattern();

            state._fsp--;

             current =iv_rulePattern; 
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
    // $ANTLR end "entryRulePattern"


    // $ANTLR start "rulePattern"
    // InternalLibrettoProjectProfile.g:2464:1: rulePattern returns [EObject current=null] : ( () ( (lv_keyword_1_0= rulePatternKeyword ) ) ( (lv_pattern_2_0= RULE_STRING ) ) ) ;
    public final EObject rulePattern() throws RecognitionException {
        EObject current = null;

        Token lv_pattern_2_0=null;
        EObject lv_keyword_1_0 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:2470:2: ( ( () ( (lv_keyword_1_0= rulePatternKeyword ) ) ( (lv_pattern_2_0= RULE_STRING ) ) ) )
            // InternalLibrettoProjectProfile.g:2471:2: ( () ( (lv_keyword_1_0= rulePatternKeyword ) ) ( (lv_pattern_2_0= RULE_STRING ) ) )
            {
            // InternalLibrettoProjectProfile.g:2471:2: ( () ( (lv_keyword_1_0= rulePatternKeyword ) ) ( (lv_pattern_2_0= RULE_STRING ) ) )
            // InternalLibrettoProjectProfile.g:2472:3: () ( (lv_keyword_1_0= rulePatternKeyword ) ) ( (lv_pattern_2_0= RULE_STRING ) )
            {
            // InternalLibrettoProjectProfile.g:2472:3: ()
            // InternalLibrettoProjectProfile.g:2473:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPatternAccess().getPatternAction_0(),
            					current);
            			

            }

            // InternalLibrettoProjectProfile.g:2479:3: ( (lv_keyword_1_0= rulePatternKeyword ) )
            // InternalLibrettoProjectProfile.g:2480:4: (lv_keyword_1_0= rulePatternKeyword )
            {
            // InternalLibrettoProjectProfile.g:2480:4: (lv_keyword_1_0= rulePatternKeyword )
            // InternalLibrettoProjectProfile.g:2481:5: lv_keyword_1_0= rulePatternKeyword
            {

            					newCompositeNode(grammarAccess.getPatternAccess().getKeywordPatternKeywordParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_keyword_1_0=rulePatternKeyword();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPatternRule());
            					}
            					set(
            						current,
            						"keyword",
            						lv_keyword_1_0,
            						"com.robenglander.libretto.spec.LibrettoProjectProfile.PatternKeyword");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLibrettoProjectProfile.g:2498:3: ( (lv_pattern_2_0= RULE_STRING ) )
            // InternalLibrettoProjectProfile.g:2499:4: (lv_pattern_2_0= RULE_STRING )
            {
            // InternalLibrettoProjectProfile.g:2499:4: (lv_pattern_2_0= RULE_STRING )
            // InternalLibrettoProjectProfile.g:2500:5: lv_pattern_2_0= RULE_STRING
            {
            lv_pattern_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_pattern_2_0, grammarAccess.getPatternAccess().getPatternSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPatternRule());
            					}
            					setWithLastConsumed(
            						current,
            						"pattern",
            						lv_pattern_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "rulePattern"


    // $ANTLR start "entryRulePatternKeyword"
    // InternalLibrettoProjectProfile.g:2520:1: entryRulePatternKeyword returns [EObject current=null] : iv_rulePatternKeyword= rulePatternKeyword EOF ;
    public final EObject entryRulePatternKeyword() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternKeyword = null;


        try {
            // InternalLibrettoProjectProfile.g:2520:55: (iv_rulePatternKeyword= rulePatternKeyword EOF )
            // InternalLibrettoProjectProfile.g:2521:2: iv_rulePatternKeyword= rulePatternKeyword EOF
            {
             newCompositeNode(grammarAccess.getPatternKeywordRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePatternKeyword=rulePatternKeyword();

            state._fsp--;

             current =iv_rulePatternKeyword; 
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
    // $ANTLR end "entryRulePatternKeyword"


    // $ANTLR start "rulePatternKeyword"
    // InternalLibrettoProjectProfile.g:2527:1: rulePatternKeyword returns [EObject current=null] : ( () ( (lv_keyword_1_0= 'pattern' ) ) ) ;
    public final EObject rulePatternKeyword() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_1_0=null;


        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:2533:2: ( ( () ( (lv_keyword_1_0= 'pattern' ) ) ) )
            // InternalLibrettoProjectProfile.g:2534:2: ( () ( (lv_keyword_1_0= 'pattern' ) ) )
            {
            // InternalLibrettoProjectProfile.g:2534:2: ( () ( (lv_keyword_1_0= 'pattern' ) ) )
            // InternalLibrettoProjectProfile.g:2535:3: () ( (lv_keyword_1_0= 'pattern' ) )
            {
            // InternalLibrettoProjectProfile.g:2535:3: ()
            // InternalLibrettoProjectProfile.g:2536:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPatternKeywordAccess().getPatternKeywordAction_0(),
            					current);
            			

            }

            // InternalLibrettoProjectProfile.g:2542:3: ( (lv_keyword_1_0= 'pattern' ) )
            // InternalLibrettoProjectProfile.g:2543:4: (lv_keyword_1_0= 'pattern' )
            {
            // InternalLibrettoProjectProfile.g:2543:4: (lv_keyword_1_0= 'pattern' )
            // InternalLibrettoProjectProfile.g:2544:5: lv_keyword_1_0= 'pattern'
            {
            lv_keyword_1_0=(Token)match(input,41,FOLLOW_2); 

            					newLeafNode(lv_keyword_1_0, grammarAccess.getPatternKeywordAccess().getKeywordPatternKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPatternKeywordRule());
            					}
            					setWithLastConsumed(current, "keyword", lv_keyword_1_0, "pattern");
            				

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
    // $ANTLR end "rulePatternKeyword"


    // $ANTLR start "entryRuleCode"
    // InternalLibrettoProjectProfile.g:2560:1: entryRuleCode returns [EObject current=null] : iv_ruleCode= ruleCode EOF ;
    public final EObject entryRuleCode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCode = null;


        try {
            // InternalLibrettoProjectProfile.g:2560:45: (iv_ruleCode= ruleCode EOF )
            // InternalLibrettoProjectProfile.g:2561:2: iv_ruleCode= ruleCode EOF
            {
             newCompositeNode(grammarAccess.getCodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCode=ruleCode();

            state._fsp--;

             current =iv_ruleCode; 
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
    // $ANTLR end "entryRuleCode"


    // $ANTLR start "ruleCode"
    // InternalLibrettoProjectProfile.g:2567:1: ruleCode returns [EObject current=null] : ( () ( (lv_keyword_1_0= ruleCodeKeyword ) ) ( (lv_code_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleCode() throws RecognitionException {
        EObject current = null;

        Token lv_code_2_0=null;
        EObject lv_keyword_1_0 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:2573:2: ( ( () ( (lv_keyword_1_0= ruleCodeKeyword ) ) ( (lv_code_2_0= RULE_STRING ) ) ) )
            // InternalLibrettoProjectProfile.g:2574:2: ( () ( (lv_keyword_1_0= ruleCodeKeyword ) ) ( (lv_code_2_0= RULE_STRING ) ) )
            {
            // InternalLibrettoProjectProfile.g:2574:2: ( () ( (lv_keyword_1_0= ruleCodeKeyword ) ) ( (lv_code_2_0= RULE_STRING ) ) )
            // InternalLibrettoProjectProfile.g:2575:3: () ( (lv_keyword_1_0= ruleCodeKeyword ) ) ( (lv_code_2_0= RULE_STRING ) )
            {
            // InternalLibrettoProjectProfile.g:2575:3: ()
            // InternalLibrettoProjectProfile.g:2576:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCodeAccess().getCodeAction_0(),
            					current);
            			

            }

            // InternalLibrettoProjectProfile.g:2582:3: ( (lv_keyword_1_0= ruleCodeKeyword ) )
            // InternalLibrettoProjectProfile.g:2583:4: (lv_keyword_1_0= ruleCodeKeyword )
            {
            // InternalLibrettoProjectProfile.g:2583:4: (lv_keyword_1_0= ruleCodeKeyword )
            // InternalLibrettoProjectProfile.g:2584:5: lv_keyword_1_0= ruleCodeKeyword
            {

            					newCompositeNode(grammarAccess.getCodeAccess().getKeywordCodeKeywordParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_keyword_1_0=ruleCodeKeyword();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCodeRule());
            					}
            					set(
            						current,
            						"keyword",
            						lv_keyword_1_0,
            						"com.robenglander.libretto.spec.LibrettoProjectProfile.CodeKeyword");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLibrettoProjectProfile.g:2601:3: ( (lv_code_2_0= RULE_STRING ) )
            // InternalLibrettoProjectProfile.g:2602:4: (lv_code_2_0= RULE_STRING )
            {
            // InternalLibrettoProjectProfile.g:2602:4: (lv_code_2_0= RULE_STRING )
            // InternalLibrettoProjectProfile.g:2603:5: lv_code_2_0= RULE_STRING
            {
            lv_code_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_code_2_0, grammarAccess.getCodeAccess().getCodeSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"code",
            						lv_code_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleCode"


    // $ANTLR start "entryRuleCodeKeyword"
    // InternalLibrettoProjectProfile.g:2623:1: entryRuleCodeKeyword returns [EObject current=null] : iv_ruleCodeKeyword= ruleCodeKeyword EOF ;
    public final EObject entryRuleCodeKeyword() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCodeKeyword = null;


        try {
            // InternalLibrettoProjectProfile.g:2623:52: (iv_ruleCodeKeyword= ruleCodeKeyword EOF )
            // InternalLibrettoProjectProfile.g:2624:2: iv_ruleCodeKeyword= ruleCodeKeyword EOF
            {
             newCompositeNode(grammarAccess.getCodeKeywordRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCodeKeyword=ruleCodeKeyword();

            state._fsp--;

             current =iv_ruleCodeKeyword; 
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
    // $ANTLR end "entryRuleCodeKeyword"


    // $ANTLR start "ruleCodeKeyword"
    // InternalLibrettoProjectProfile.g:2630:1: ruleCodeKeyword returns [EObject current=null] : ( () ( (lv_keyword_1_0= 'code' ) ) ) ;
    public final EObject ruleCodeKeyword() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_1_0=null;


        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:2636:2: ( ( () ( (lv_keyword_1_0= 'code' ) ) ) )
            // InternalLibrettoProjectProfile.g:2637:2: ( () ( (lv_keyword_1_0= 'code' ) ) )
            {
            // InternalLibrettoProjectProfile.g:2637:2: ( () ( (lv_keyword_1_0= 'code' ) ) )
            // InternalLibrettoProjectProfile.g:2638:3: () ( (lv_keyword_1_0= 'code' ) )
            {
            // InternalLibrettoProjectProfile.g:2638:3: ()
            // InternalLibrettoProjectProfile.g:2639:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCodeKeywordAccess().getCodeKeywordAction_0(),
            					current);
            			

            }

            // InternalLibrettoProjectProfile.g:2645:3: ( (lv_keyword_1_0= 'code' ) )
            // InternalLibrettoProjectProfile.g:2646:4: (lv_keyword_1_0= 'code' )
            {
            // InternalLibrettoProjectProfile.g:2646:4: (lv_keyword_1_0= 'code' )
            // InternalLibrettoProjectProfile.g:2647:5: lv_keyword_1_0= 'code'
            {
            lv_keyword_1_0=(Token)match(input,42,FOLLOW_2); 

            					newLeafNode(lv_keyword_1_0, grammarAccess.getCodeKeywordAccess().getKeywordCodeKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCodeKeywordRule());
            					}
            					setWithLastConsumed(current, "keyword", lv_keyword_1_0, "code");
            				

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
    // $ANTLR end "ruleCodeKeyword"


    // $ANTLR start "entryRuleCorrection"
    // InternalLibrettoProjectProfile.g:2663:1: entryRuleCorrection returns [EObject current=null] : iv_ruleCorrection= ruleCorrection EOF ;
    public final EObject entryRuleCorrection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCorrection = null;


        try {
            // InternalLibrettoProjectProfile.g:2663:51: (iv_ruleCorrection= ruleCorrection EOF )
            // InternalLibrettoProjectProfile.g:2664:2: iv_ruleCorrection= ruleCorrection EOF
            {
             newCompositeNode(grammarAccess.getCorrectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCorrection=ruleCorrection();

            state._fsp--;

             current =iv_ruleCorrection; 
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
    // $ANTLR end "entryRuleCorrection"


    // $ANTLR start "ruleCorrection"
    // InternalLibrettoProjectProfile.g:2670:1: ruleCorrection returns [EObject current=null] : ( () ( (lv_keyword_1_0= ruleCorrectionKeyword ) ) ( (lv_correction_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleCorrection() throws RecognitionException {
        EObject current = null;

        Token lv_correction_2_0=null;
        EObject lv_keyword_1_0 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:2676:2: ( ( () ( (lv_keyword_1_0= ruleCorrectionKeyword ) ) ( (lv_correction_2_0= RULE_STRING ) ) ) )
            // InternalLibrettoProjectProfile.g:2677:2: ( () ( (lv_keyword_1_0= ruleCorrectionKeyword ) ) ( (lv_correction_2_0= RULE_STRING ) ) )
            {
            // InternalLibrettoProjectProfile.g:2677:2: ( () ( (lv_keyword_1_0= ruleCorrectionKeyword ) ) ( (lv_correction_2_0= RULE_STRING ) ) )
            // InternalLibrettoProjectProfile.g:2678:3: () ( (lv_keyword_1_0= ruleCorrectionKeyword ) ) ( (lv_correction_2_0= RULE_STRING ) )
            {
            // InternalLibrettoProjectProfile.g:2678:3: ()
            // InternalLibrettoProjectProfile.g:2679:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCorrectionAccess().getCorrectionAction_0(),
            					current);
            			

            }

            // InternalLibrettoProjectProfile.g:2685:3: ( (lv_keyword_1_0= ruleCorrectionKeyword ) )
            // InternalLibrettoProjectProfile.g:2686:4: (lv_keyword_1_0= ruleCorrectionKeyword )
            {
            // InternalLibrettoProjectProfile.g:2686:4: (lv_keyword_1_0= ruleCorrectionKeyword )
            // InternalLibrettoProjectProfile.g:2687:5: lv_keyword_1_0= ruleCorrectionKeyword
            {

            					newCompositeNode(grammarAccess.getCorrectionAccess().getKeywordCorrectionKeywordParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_keyword_1_0=ruleCorrectionKeyword();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCorrectionRule());
            					}
            					set(
            						current,
            						"keyword",
            						lv_keyword_1_0,
            						"com.robenglander.libretto.spec.LibrettoProjectProfile.CorrectionKeyword");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLibrettoProjectProfile.g:2704:3: ( (lv_correction_2_0= RULE_STRING ) )
            // InternalLibrettoProjectProfile.g:2705:4: (lv_correction_2_0= RULE_STRING )
            {
            // InternalLibrettoProjectProfile.g:2705:4: (lv_correction_2_0= RULE_STRING )
            // InternalLibrettoProjectProfile.g:2706:5: lv_correction_2_0= RULE_STRING
            {
            lv_correction_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_correction_2_0, grammarAccess.getCorrectionAccess().getCorrectionSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCorrectionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"correction",
            						lv_correction_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleCorrection"


    // $ANTLR start "entryRuleCorrectionKeyword"
    // InternalLibrettoProjectProfile.g:2726:1: entryRuleCorrectionKeyword returns [EObject current=null] : iv_ruleCorrectionKeyword= ruleCorrectionKeyword EOF ;
    public final EObject entryRuleCorrectionKeyword() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCorrectionKeyword = null;


        try {
            // InternalLibrettoProjectProfile.g:2726:58: (iv_ruleCorrectionKeyword= ruleCorrectionKeyword EOF )
            // InternalLibrettoProjectProfile.g:2727:2: iv_ruleCorrectionKeyword= ruleCorrectionKeyword EOF
            {
             newCompositeNode(grammarAccess.getCorrectionKeywordRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCorrectionKeyword=ruleCorrectionKeyword();

            state._fsp--;

             current =iv_ruleCorrectionKeyword; 
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
    // $ANTLR end "entryRuleCorrectionKeyword"


    // $ANTLR start "ruleCorrectionKeyword"
    // InternalLibrettoProjectProfile.g:2733:1: ruleCorrectionKeyword returns [EObject current=null] : ( () ( (lv_keyword_1_0= 'correction' ) ) ) ;
    public final EObject ruleCorrectionKeyword() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_1_0=null;


        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:2739:2: ( ( () ( (lv_keyword_1_0= 'correction' ) ) ) )
            // InternalLibrettoProjectProfile.g:2740:2: ( () ( (lv_keyword_1_0= 'correction' ) ) )
            {
            // InternalLibrettoProjectProfile.g:2740:2: ( () ( (lv_keyword_1_0= 'correction' ) ) )
            // InternalLibrettoProjectProfile.g:2741:3: () ( (lv_keyword_1_0= 'correction' ) )
            {
            // InternalLibrettoProjectProfile.g:2741:3: ()
            // InternalLibrettoProjectProfile.g:2742:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCorrectionKeywordAccess().getCorrectionKeywordAction_0(),
            					current);
            			

            }

            // InternalLibrettoProjectProfile.g:2748:3: ( (lv_keyword_1_0= 'correction' ) )
            // InternalLibrettoProjectProfile.g:2749:4: (lv_keyword_1_0= 'correction' )
            {
            // InternalLibrettoProjectProfile.g:2749:4: (lv_keyword_1_0= 'correction' )
            // InternalLibrettoProjectProfile.g:2750:5: lv_keyword_1_0= 'correction'
            {
            lv_keyword_1_0=(Token)match(input,43,FOLLOW_2); 

            					newLeafNode(lv_keyword_1_0, grammarAccess.getCorrectionKeywordAccess().getKeywordCorrectionKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCorrectionKeywordRule());
            					}
            					setWithLastConsumed(current, "keyword", lv_keyword_1_0, "correction");
            				

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
    // $ANTLR end "ruleCorrectionKeyword"


    // $ANTLR start "entryRuleGenDefaultRemediationRule"
    // InternalLibrettoProjectProfile.g:2766:1: entryRuleGenDefaultRemediationRule returns [EObject current=null] : iv_ruleGenDefaultRemediationRule= ruleGenDefaultRemediationRule EOF ;
    public final EObject entryRuleGenDefaultRemediationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenDefaultRemediationRule = null;


        try {
            // InternalLibrettoProjectProfile.g:2766:66: (iv_ruleGenDefaultRemediationRule= ruleGenDefaultRemediationRule EOF )
            // InternalLibrettoProjectProfile.g:2767:2: iv_ruleGenDefaultRemediationRule= ruleGenDefaultRemediationRule EOF
            {
             newCompositeNode(grammarAccess.getGenDefaultRemediationRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGenDefaultRemediationRule=ruleGenDefaultRemediationRule();

            state._fsp--;

             current =iv_ruleGenDefaultRemediationRule; 
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
    // $ANTLR end "entryRuleGenDefaultRemediationRule"


    // $ANTLR start "ruleGenDefaultRemediationRule"
    // InternalLibrettoProjectProfile.g:2773:1: ruleGenDefaultRemediationRule returns [EObject current=null] : ( () ( (lv_keyword_1_0= ruleDefaultKeyword ) ) otherlv_2= '{' ( ( (lv_codes_3_0= ruleCode ) ) | ( (lv_corrections_4_0= ruleCorrection ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleGenDefaultRemediationRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_keyword_1_0 = null;

        EObject lv_codes_3_0 = null;

        EObject lv_corrections_4_0 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:2779:2: ( ( () ( (lv_keyword_1_0= ruleDefaultKeyword ) ) otherlv_2= '{' ( ( (lv_codes_3_0= ruleCode ) ) | ( (lv_corrections_4_0= ruleCorrection ) ) )* otherlv_5= '}' ) )
            // InternalLibrettoProjectProfile.g:2780:2: ( () ( (lv_keyword_1_0= ruleDefaultKeyword ) ) otherlv_2= '{' ( ( (lv_codes_3_0= ruleCode ) ) | ( (lv_corrections_4_0= ruleCorrection ) ) )* otherlv_5= '}' )
            {
            // InternalLibrettoProjectProfile.g:2780:2: ( () ( (lv_keyword_1_0= ruleDefaultKeyword ) ) otherlv_2= '{' ( ( (lv_codes_3_0= ruleCode ) ) | ( (lv_corrections_4_0= ruleCorrection ) ) )* otherlv_5= '}' )
            // InternalLibrettoProjectProfile.g:2781:3: () ( (lv_keyword_1_0= ruleDefaultKeyword ) ) otherlv_2= '{' ( ( (lv_codes_3_0= ruleCode ) ) | ( (lv_corrections_4_0= ruleCorrection ) ) )* otherlv_5= '}'
            {
            // InternalLibrettoProjectProfile.g:2781:3: ()
            // InternalLibrettoProjectProfile.g:2782:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGenDefaultRemediationRuleAccess().getGenDefaultRemediationRuleAction_0(),
            					current);
            			

            }

            // InternalLibrettoProjectProfile.g:2788:3: ( (lv_keyword_1_0= ruleDefaultKeyword ) )
            // InternalLibrettoProjectProfile.g:2789:4: (lv_keyword_1_0= ruleDefaultKeyword )
            {
            // InternalLibrettoProjectProfile.g:2789:4: (lv_keyword_1_0= ruleDefaultKeyword )
            // InternalLibrettoProjectProfile.g:2790:5: lv_keyword_1_0= ruleDefaultKeyword
            {

            					newCompositeNode(grammarAccess.getGenDefaultRemediationRuleAccess().getKeywordDefaultKeywordParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_keyword_1_0=ruleDefaultKeyword();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGenDefaultRemediationRuleRule());
            					}
            					set(
            						current,
            						"keyword",
            						lv_keyword_1_0,
            						"com.robenglander.libretto.spec.LibrettoProjectProfile.DefaultKeyword");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,11,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getGenDefaultRemediationRuleAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLibrettoProjectProfile.g:2811:3: ( ( (lv_codes_3_0= ruleCode ) ) | ( (lv_corrections_4_0= ruleCorrection ) ) )*
            loop19:
            do {
                int alt19=3;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==42) ) {
                    alt19=1;
                }
                else if ( (LA19_0==43) ) {
                    alt19=2;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:2812:4: ( (lv_codes_3_0= ruleCode ) )
            	    {
            	    // InternalLibrettoProjectProfile.g:2812:4: ( (lv_codes_3_0= ruleCode ) )
            	    // InternalLibrettoProjectProfile.g:2813:5: (lv_codes_3_0= ruleCode )
            	    {
            	    // InternalLibrettoProjectProfile.g:2813:5: (lv_codes_3_0= ruleCode )
            	    // InternalLibrettoProjectProfile.g:2814:6: lv_codes_3_0= ruleCode
            	    {

            	    						newCompositeNode(grammarAccess.getGenDefaultRemediationRuleAccess().getCodesCodeParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_codes_3_0=ruleCode();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGenDefaultRemediationRuleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"codes",
            	    							lv_codes_3_0,
            	    							"com.robenglander.libretto.spec.LibrettoProjectProfile.Code");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalLibrettoProjectProfile.g:2832:4: ( (lv_corrections_4_0= ruleCorrection ) )
            	    {
            	    // InternalLibrettoProjectProfile.g:2832:4: ( (lv_corrections_4_0= ruleCorrection ) )
            	    // InternalLibrettoProjectProfile.g:2833:5: (lv_corrections_4_0= ruleCorrection )
            	    {
            	    // InternalLibrettoProjectProfile.g:2833:5: (lv_corrections_4_0= ruleCorrection )
            	    // InternalLibrettoProjectProfile.g:2834:6: lv_corrections_4_0= ruleCorrection
            	    {

            	    						newCompositeNode(grammarAccess.getGenDefaultRemediationRuleAccess().getCorrectionsCorrectionParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_corrections_4_0=ruleCorrection();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGenDefaultRemediationRuleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"corrections",
            	    							lv_corrections_4_0,
            	    							"com.robenglander.libretto.spec.LibrettoProjectProfile.Correction");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_5=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getGenDefaultRemediationRuleAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleGenDefaultRemediationRule"


    // $ANTLR start "entryRuleDefaultKeyword"
    // InternalLibrettoProjectProfile.g:2860:1: entryRuleDefaultKeyword returns [EObject current=null] : iv_ruleDefaultKeyword= ruleDefaultKeyword EOF ;
    public final EObject entryRuleDefaultKeyword() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultKeyword = null;


        try {
            // InternalLibrettoProjectProfile.g:2860:55: (iv_ruleDefaultKeyword= ruleDefaultKeyword EOF )
            // InternalLibrettoProjectProfile.g:2861:2: iv_ruleDefaultKeyword= ruleDefaultKeyword EOF
            {
             newCompositeNode(grammarAccess.getDefaultKeywordRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefaultKeyword=ruleDefaultKeyword();

            state._fsp--;

             current =iv_ruleDefaultKeyword; 
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
    // $ANTLR end "entryRuleDefaultKeyword"


    // $ANTLR start "ruleDefaultKeyword"
    // InternalLibrettoProjectProfile.g:2867:1: ruleDefaultKeyword returns [EObject current=null] : ( () ( (lv_keyword_1_0= 'default' ) ) ) ;
    public final EObject ruleDefaultKeyword() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_1_0=null;


        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:2873:2: ( ( () ( (lv_keyword_1_0= 'default' ) ) ) )
            // InternalLibrettoProjectProfile.g:2874:2: ( () ( (lv_keyword_1_0= 'default' ) ) )
            {
            // InternalLibrettoProjectProfile.g:2874:2: ( () ( (lv_keyword_1_0= 'default' ) ) )
            // InternalLibrettoProjectProfile.g:2875:3: () ( (lv_keyword_1_0= 'default' ) )
            {
            // InternalLibrettoProjectProfile.g:2875:3: ()
            // InternalLibrettoProjectProfile.g:2876:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDefaultKeywordAccess().getDefaultKeywordAction_0(),
            					current);
            			

            }

            // InternalLibrettoProjectProfile.g:2882:3: ( (lv_keyword_1_0= 'default' ) )
            // InternalLibrettoProjectProfile.g:2883:4: (lv_keyword_1_0= 'default' )
            {
            // InternalLibrettoProjectProfile.g:2883:4: (lv_keyword_1_0= 'default' )
            // InternalLibrettoProjectProfile.g:2884:5: lv_keyword_1_0= 'default'
            {
            lv_keyword_1_0=(Token)match(input,44,FOLLOW_2); 

            					newLeafNode(lv_keyword_1_0, grammarAccess.getDefaultKeywordAccess().getKeywordDefaultKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDefaultKeywordRule());
            					}
            					setWithLastConsumed(current, "keyword", lv_keyword_1_0, "default");
            				

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
    // $ANTLR end "ruleDefaultKeyword"


    // $ANTLR start "entryRuleLlmProvidersBlock"
    // InternalLibrettoProjectProfile.g:2900:1: entryRuleLlmProvidersBlock returns [EObject current=null] : iv_ruleLlmProvidersBlock= ruleLlmProvidersBlock EOF ;
    public final EObject entryRuleLlmProvidersBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLlmProvidersBlock = null;


        try {
            // InternalLibrettoProjectProfile.g:2900:58: (iv_ruleLlmProvidersBlock= ruleLlmProvidersBlock EOF )
            // InternalLibrettoProjectProfile.g:2901:2: iv_ruleLlmProvidersBlock= ruleLlmProvidersBlock EOF
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
    // InternalLibrettoProjectProfile.g:2907:1: ruleLlmProvidersBlock returns [EObject current=null] : ( () ( (lv_keyword_1_0= ruleLLMProvidersKeyword ) ) otherlv_2= '{' ( (lv_providers_3_0= ruleLLMProvider ) )* otherlv_4= '}' ) ;
    public final EObject ruleLlmProvidersBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_keyword_1_0 = null;

        EObject lv_providers_3_0 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:2913:2: ( ( () ( (lv_keyword_1_0= ruleLLMProvidersKeyword ) ) otherlv_2= '{' ( (lv_providers_3_0= ruleLLMProvider ) )* otherlv_4= '}' ) )
            // InternalLibrettoProjectProfile.g:2914:2: ( () ( (lv_keyword_1_0= ruleLLMProvidersKeyword ) ) otherlv_2= '{' ( (lv_providers_3_0= ruleLLMProvider ) )* otherlv_4= '}' )
            {
            // InternalLibrettoProjectProfile.g:2914:2: ( () ( (lv_keyword_1_0= ruleLLMProvidersKeyword ) ) otherlv_2= '{' ( (lv_providers_3_0= ruleLLMProvider ) )* otherlv_4= '}' )
            // InternalLibrettoProjectProfile.g:2915:3: () ( (lv_keyword_1_0= ruleLLMProvidersKeyword ) ) otherlv_2= '{' ( (lv_providers_3_0= ruleLLMProvider ) )* otherlv_4= '}'
            {
            // InternalLibrettoProjectProfile.g:2915:3: ()
            // InternalLibrettoProjectProfile.g:2916:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLlmProvidersBlockAccess().getLlmProvidersBlockAction_0(),
            					current);
            			

            }

            // InternalLibrettoProjectProfile.g:2922:3: ( (lv_keyword_1_0= ruleLLMProvidersKeyword ) )
            // InternalLibrettoProjectProfile.g:2923:4: (lv_keyword_1_0= ruleLLMProvidersKeyword )
            {
            // InternalLibrettoProjectProfile.g:2923:4: (lv_keyword_1_0= ruleLLMProvidersKeyword )
            // InternalLibrettoProjectProfile.g:2924:5: lv_keyword_1_0= ruleLLMProvidersKeyword
            {

            					newCompositeNode(grammarAccess.getLlmProvidersBlockAccess().getKeywordLLMProvidersKeywordParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_keyword_1_0=ruleLLMProvidersKeyword();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLlmProvidersBlockRule());
            					}
            					set(
            						current,
            						"keyword",
            						lv_keyword_1_0,
            						"com.robenglander.libretto.spec.LibrettoProjectProfile.LLMProvidersKeyword");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,11,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getLlmProvidersBlockAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLibrettoProjectProfile.g:2945:3: ( (lv_providers_3_0= ruleLLMProvider ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==47) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:2946:4: (lv_providers_3_0= ruleLLMProvider )
            	    {
            	    // InternalLibrettoProjectProfile.g:2946:4: (lv_providers_3_0= ruleLLMProvider )
            	    // InternalLibrettoProjectProfile.g:2947:5: lv_providers_3_0= ruleLLMProvider
            	    {

            	    					newCompositeNode(grammarAccess.getLlmProvidersBlockAccess().getProvidersLLMProviderParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_providers_3_0=ruleLLMProvider();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLlmProvidersBlockRule());
            	    					}
            	    					add(
            	    						current,
            	    						"providers",
            	    						lv_providers_3_0,
            	    						"com.robenglander.libretto.spec.LibrettoProjectProfile.LLMProvider");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_4=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getLlmProvidersBlockAccess().getRightCurlyBracketKeyword_4());
            		

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


    // $ANTLR start "entryRuleLLMProvidersKeyword"
    // InternalLibrettoProjectProfile.g:2972:1: entryRuleLLMProvidersKeyword returns [EObject current=null] : iv_ruleLLMProvidersKeyword= ruleLLMProvidersKeyword EOF ;
    public final EObject entryRuleLLMProvidersKeyword() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLLMProvidersKeyword = null;


        try {
            // InternalLibrettoProjectProfile.g:2972:60: (iv_ruleLLMProvidersKeyword= ruleLLMProvidersKeyword EOF )
            // InternalLibrettoProjectProfile.g:2973:2: iv_ruleLLMProvidersKeyword= ruleLLMProvidersKeyword EOF
            {
             newCompositeNode(grammarAccess.getLLMProvidersKeywordRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLLMProvidersKeyword=ruleLLMProvidersKeyword();

            state._fsp--;

             current =iv_ruleLLMProvidersKeyword; 
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
    // $ANTLR end "entryRuleLLMProvidersKeyword"


    // $ANTLR start "ruleLLMProvidersKeyword"
    // InternalLibrettoProjectProfile.g:2979:1: ruleLLMProvidersKeyword returns [EObject current=null] : ( () ( ( (lv_keyword_1_1= 'llmproviders' | lv_keyword_1_2= 'llmProviders' ) ) ) ) ;
    public final EObject ruleLLMProvidersKeyword() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_1_1=null;
        Token lv_keyword_1_2=null;


        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:2985:2: ( ( () ( ( (lv_keyword_1_1= 'llmproviders' | lv_keyword_1_2= 'llmProviders' ) ) ) ) )
            // InternalLibrettoProjectProfile.g:2986:2: ( () ( ( (lv_keyword_1_1= 'llmproviders' | lv_keyword_1_2= 'llmProviders' ) ) ) )
            {
            // InternalLibrettoProjectProfile.g:2986:2: ( () ( ( (lv_keyword_1_1= 'llmproviders' | lv_keyword_1_2= 'llmProviders' ) ) ) )
            // InternalLibrettoProjectProfile.g:2987:3: () ( ( (lv_keyword_1_1= 'llmproviders' | lv_keyword_1_2= 'llmProviders' ) ) )
            {
            // InternalLibrettoProjectProfile.g:2987:3: ()
            // InternalLibrettoProjectProfile.g:2988:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLLMProvidersKeywordAccess().getLLMProvidersKeywordAction_0(),
            					current);
            			

            }

            // InternalLibrettoProjectProfile.g:2994:3: ( ( (lv_keyword_1_1= 'llmproviders' | lv_keyword_1_2= 'llmProviders' ) ) )
            // InternalLibrettoProjectProfile.g:2995:4: ( (lv_keyword_1_1= 'llmproviders' | lv_keyword_1_2= 'llmProviders' ) )
            {
            // InternalLibrettoProjectProfile.g:2995:4: ( (lv_keyword_1_1= 'llmproviders' | lv_keyword_1_2= 'llmProviders' ) )
            // InternalLibrettoProjectProfile.g:2996:5: (lv_keyword_1_1= 'llmproviders' | lv_keyword_1_2= 'llmProviders' )
            {
            // InternalLibrettoProjectProfile.g:2996:5: (lv_keyword_1_1= 'llmproviders' | lv_keyword_1_2= 'llmProviders' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==45) ) {
                alt21=1;
            }
            else if ( (LA21_0==46) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:2997:6: lv_keyword_1_1= 'llmproviders'
                    {
                    lv_keyword_1_1=(Token)match(input,45,FOLLOW_2); 

                    						newLeafNode(lv_keyword_1_1, grammarAccess.getLLMProvidersKeywordAccess().getKeywordLlmprovidersKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLLMProvidersKeywordRule());
                    						}
                    						setWithLastConsumed(current, "keyword", lv_keyword_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalLibrettoProjectProfile.g:3008:6: lv_keyword_1_2= 'llmProviders'
                    {
                    lv_keyword_1_2=(Token)match(input,46,FOLLOW_2); 

                    						newLeafNode(lv_keyword_1_2, grammarAccess.getLLMProvidersKeywordAccess().getKeywordLlmProvidersKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLLMProvidersKeywordRule());
                    						}
                    						setWithLastConsumed(current, "keyword", lv_keyword_1_2, null);
                    					

                    }
                    break;

            }


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
    // $ANTLR end "ruleLLMProvidersKeyword"


    // $ANTLR start "entryRuleLLMProvider"
    // InternalLibrettoProjectProfile.g:3025:1: entryRuleLLMProvider returns [EObject current=null] : iv_ruleLLMProvider= ruleLLMProvider EOF ;
    public final EObject entryRuleLLMProvider() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLLMProvider = null;


        try {
            // InternalLibrettoProjectProfile.g:3025:52: (iv_ruleLLMProvider= ruleLLMProvider EOF )
            // InternalLibrettoProjectProfile.g:3026:2: iv_ruleLLMProvider= ruleLLMProvider EOF
            {
             newCompositeNode(grammarAccess.getLLMProviderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLLMProvider=ruleLLMProvider();

            state._fsp--;

             current =iv_ruleLLMProvider; 
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
    // $ANTLR end "entryRuleLLMProvider"


    // $ANTLR start "ruleLLMProvider"
    // InternalLibrettoProjectProfile.g:3032:1: ruleLLMProvider returns [EObject current=null] : ( ( (lv_keyword_0_0= ruleProviderKeyword ) ) ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( ( (lv_types_3_0= ruleProviderType ) ) | ( (lv_localModelPaths_4_0= ruleLocalModelPath ) ) | ( (lv_models_5_0= ruleModel ) ) | ( (lv_endpoints_6_0= ruleEndpoint ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleLLMProvider() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_7=null;
        EObject lv_keyword_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_types_3_0 = null;

        EObject lv_localModelPaths_4_0 = null;

        EObject lv_models_5_0 = null;

        EObject lv_endpoints_6_0 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:3038:2: ( ( ( (lv_keyword_0_0= ruleProviderKeyword ) ) ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( ( (lv_types_3_0= ruleProviderType ) ) | ( (lv_localModelPaths_4_0= ruleLocalModelPath ) ) | ( (lv_models_5_0= ruleModel ) ) | ( (lv_endpoints_6_0= ruleEndpoint ) ) )* otherlv_7= '}' ) )
            // InternalLibrettoProjectProfile.g:3039:2: ( ( (lv_keyword_0_0= ruleProviderKeyword ) ) ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( ( (lv_types_3_0= ruleProviderType ) ) | ( (lv_localModelPaths_4_0= ruleLocalModelPath ) ) | ( (lv_models_5_0= ruleModel ) ) | ( (lv_endpoints_6_0= ruleEndpoint ) ) )* otherlv_7= '}' )
            {
            // InternalLibrettoProjectProfile.g:3039:2: ( ( (lv_keyword_0_0= ruleProviderKeyword ) ) ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( ( (lv_types_3_0= ruleProviderType ) ) | ( (lv_localModelPaths_4_0= ruleLocalModelPath ) ) | ( (lv_models_5_0= ruleModel ) ) | ( (lv_endpoints_6_0= ruleEndpoint ) ) )* otherlv_7= '}' )
            // InternalLibrettoProjectProfile.g:3040:3: ( (lv_keyword_0_0= ruleProviderKeyword ) ) ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( ( (lv_types_3_0= ruleProviderType ) ) | ( (lv_localModelPaths_4_0= ruleLocalModelPath ) ) | ( (lv_models_5_0= ruleModel ) ) | ( (lv_endpoints_6_0= ruleEndpoint ) ) )* otherlv_7= '}'
            {
            // InternalLibrettoProjectProfile.g:3040:3: ( (lv_keyword_0_0= ruleProviderKeyword ) )
            // InternalLibrettoProjectProfile.g:3041:4: (lv_keyword_0_0= ruleProviderKeyword )
            {
            // InternalLibrettoProjectProfile.g:3041:4: (lv_keyword_0_0= ruleProviderKeyword )
            // InternalLibrettoProjectProfile.g:3042:5: lv_keyword_0_0= ruleProviderKeyword
            {

            					newCompositeNode(grammarAccess.getLLMProviderAccess().getKeywordProviderKeywordParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_keyword_0_0=ruleProviderKeyword();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLLMProviderRule());
            					}
            					set(
            						current,
            						"keyword",
            						lv_keyword_0_0,
            						"com.robenglander.libretto.spec.LibrettoProjectProfile.ProviderKeyword");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLibrettoProjectProfile.g:3059:3: ( (lv_name_1_0= ruleValidID ) )
            // InternalLibrettoProjectProfile.g:3060:4: (lv_name_1_0= ruleValidID )
            {
            // InternalLibrettoProjectProfile.g:3060:4: (lv_name_1_0= ruleValidID )
            // InternalLibrettoProjectProfile.g:3061:5: lv_name_1_0= ruleValidID
            {

            					newCompositeNode(grammarAccess.getLLMProviderAccess().getNameValidIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_1_0=ruleValidID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLLMProviderRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"com.robenglander.libretto.spec.LibrettoProjectProfile.ValidID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,11,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getLLMProviderAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLibrettoProjectProfile.g:3082:3: ( ( (lv_types_3_0= ruleProviderType ) ) | ( (lv_localModelPaths_4_0= ruleLocalModelPath ) ) | ( (lv_models_5_0= ruleModel ) ) | ( (lv_endpoints_6_0= ruleEndpoint ) ) )*
            loop22:
            do {
                int alt22=5;
                switch ( input.LA(1) ) {
                case 48:
                    {
                    alt22=1;
                    }
                    break;
                case 50:
                case 51:
                    {
                    alt22=2;
                    }
                    break;
                case 49:
                    {
                    alt22=3;
                    }
                    break;
                case 52:
                case 53:
                    {
                    alt22=4;
                    }
                    break;

                }

                switch (alt22) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:3083:4: ( (lv_types_3_0= ruleProviderType ) )
            	    {
            	    // InternalLibrettoProjectProfile.g:3083:4: ( (lv_types_3_0= ruleProviderType ) )
            	    // InternalLibrettoProjectProfile.g:3084:5: (lv_types_3_0= ruleProviderType )
            	    {
            	    // InternalLibrettoProjectProfile.g:3084:5: (lv_types_3_0= ruleProviderType )
            	    // InternalLibrettoProjectProfile.g:3085:6: lv_types_3_0= ruleProviderType
            	    {

            	    						newCompositeNode(grammarAccess.getLLMProviderAccess().getTypesProviderTypeParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_types_3_0=ruleProviderType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLLMProviderRule());
            	    						}
            	    						add(
            	    							current,
            	    							"types",
            	    							lv_types_3_0,
            	    							"com.robenglander.libretto.spec.LibrettoProjectProfile.ProviderType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalLibrettoProjectProfile.g:3103:4: ( (lv_localModelPaths_4_0= ruleLocalModelPath ) )
            	    {
            	    // InternalLibrettoProjectProfile.g:3103:4: ( (lv_localModelPaths_4_0= ruleLocalModelPath ) )
            	    // InternalLibrettoProjectProfile.g:3104:5: (lv_localModelPaths_4_0= ruleLocalModelPath )
            	    {
            	    // InternalLibrettoProjectProfile.g:3104:5: (lv_localModelPaths_4_0= ruleLocalModelPath )
            	    // InternalLibrettoProjectProfile.g:3105:6: lv_localModelPaths_4_0= ruleLocalModelPath
            	    {

            	    						newCompositeNode(grammarAccess.getLLMProviderAccess().getLocalModelPathsLocalModelPathParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_localModelPaths_4_0=ruleLocalModelPath();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLLMProviderRule());
            	    						}
            	    						add(
            	    							current,
            	    							"localModelPaths",
            	    							lv_localModelPaths_4_0,
            	    							"com.robenglander.libretto.spec.LibrettoProjectProfile.LocalModelPath");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalLibrettoProjectProfile.g:3123:4: ( (lv_models_5_0= ruleModel ) )
            	    {
            	    // InternalLibrettoProjectProfile.g:3123:4: ( (lv_models_5_0= ruleModel ) )
            	    // InternalLibrettoProjectProfile.g:3124:5: (lv_models_5_0= ruleModel )
            	    {
            	    // InternalLibrettoProjectProfile.g:3124:5: (lv_models_5_0= ruleModel )
            	    // InternalLibrettoProjectProfile.g:3125:6: lv_models_5_0= ruleModel
            	    {

            	    						newCompositeNode(grammarAccess.getLLMProviderAccess().getModelsModelParserRuleCall_3_2_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_models_5_0=ruleModel();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLLMProviderRule());
            	    						}
            	    						add(
            	    							current,
            	    							"models",
            	    							lv_models_5_0,
            	    							"com.robenglander.libretto.spec.LibrettoProjectProfile.Model");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalLibrettoProjectProfile.g:3143:4: ( (lv_endpoints_6_0= ruleEndpoint ) )
            	    {
            	    // InternalLibrettoProjectProfile.g:3143:4: ( (lv_endpoints_6_0= ruleEndpoint ) )
            	    // InternalLibrettoProjectProfile.g:3144:5: (lv_endpoints_6_0= ruleEndpoint )
            	    {
            	    // InternalLibrettoProjectProfile.g:3144:5: (lv_endpoints_6_0= ruleEndpoint )
            	    // InternalLibrettoProjectProfile.g:3145:6: lv_endpoints_6_0= ruleEndpoint
            	    {

            	    						newCompositeNode(grammarAccess.getLLMProviderAccess().getEndpointsEndpointParserRuleCall_3_3_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_endpoints_6_0=ruleEndpoint();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLLMProviderRule());
            	    						}
            	    						add(
            	    							current,
            	    							"endpoints",
            	    							lv_endpoints_6_0,
            	    							"com.robenglander.libretto.spec.LibrettoProjectProfile.Endpoint");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_7=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getLLMProviderAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleLLMProvider"


    // $ANTLR start "entryRuleProviderKeyword"
    // InternalLibrettoProjectProfile.g:3171:1: entryRuleProviderKeyword returns [EObject current=null] : iv_ruleProviderKeyword= ruleProviderKeyword EOF ;
    public final EObject entryRuleProviderKeyword() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProviderKeyword = null;


        try {
            // InternalLibrettoProjectProfile.g:3171:56: (iv_ruleProviderKeyword= ruleProviderKeyword EOF )
            // InternalLibrettoProjectProfile.g:3172:2: iv_ruleProviderKeyword= ruleProviderKeyword EOF
            {
             newCompositeNode(grammarAccess.getProviderKeywordRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProviderKeyword=ruleProviderKeyword();

            state._fsp--;

             current =iv_ruleProviderKeyword; 
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
    // $ANTLR end "entryRuleProviderKeyword"


    // $ANTLR start "ruleProviderKeyword"
    // InternalLibrettoProjectProfile.g:3178:1: ruleProviderKeyword returns [EObject current=null] : ( () ( (lv_keyword_1_0= 'provider' ) ) ) ;
    public final EObject ruleProviderKeyword() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_1_0=null;


        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:3184:2: ( ( () ( (lv_keyword_1_0= 'provider' ) ) ) )
            // InternalLibrettoProjectProfile.g:3185:2: ( () ( (lv_keyword_1_0= 'provider' ) ) )
            {
            // InternalLibrettoProjectProfile.g:3185:2: ( () ( (lv_keyword_1_0= 'provider' ) ) )
            // InternalLibrettoProjectProfile.g:3186:3: () ( (lv_keyword_1_0= 'provider' ) )
            {
            // InternalLibrettoProjectProfile.g:3186:3: ()
            // InternalLibrettoProjectProfile.g:3187:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProviderKeywordAccess().getProviderKeywordAction_0(),
            					current);
            			

            }

            // InternalLibrettoProjectProfile.g:3193:3: ( (lv_keyword_1_0= 'provider' ) )
            // InternalLibrettoProjectProfile.g:3194:4: (lv_keyword_1_0= 'provider' )
            {
            // InternalLibrettoProjectProfile.g:3194:4: (lv_keyword_1_0= 'provider' )
            // InternalLibrettoProjectProfile.g:3195:5: lv_keyword_1_0= 'provider'
            {
            lv_keyword_1_0=(Token)match(input,47,FOLLOW_2); 

            					newLeafNode(lv_keyword_1_0, grammarAccess.getProviderKeywordAccess().getKeywordProviderKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProviderKeywordRule());
            					}
            					setWithLastConsumed(current, "keyword", lv_keyword_1_0, "provider");
            				

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
    // $ANTLR end "ruleProviderKeyword"


    // $ANTLR start "entryRuleProviderType"
    // InternalLibrettoProjectProfile.g:3211:1: entryRuleProviderType returns [EObject current=null] : iv_ruleProviderType= ruleProviderType EOF ;
    public final EObject entryRuleProviderType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProviderType = null;


        try {
            // InternalLibrettoProjectProfile.g:3211:53: (iv_ruleProviderType= ruleProviderType EOF )
            // InternalLibrettoProjectProfile.g:3212:2: iv_ruleProviderType= ruleProviderType EOF
            {
             newCompositeNode(grammarAccess.getProviderTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProviderType=ruleProviderType();

            state._fsp--;

             current =iv_ruleProviderType; 
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
    // $ANTLR end "entryRuleProviderType"


    // $ANTLR start "ruleProviderType"
    // InternalLibrettoProjectProfile.g:3218:1: ruleProviderType returns [EObject current=null] : ( () ( (lv_keyword_1_0= ruleProviderTypeKeyword ) ) ( (lv_name_2_0= ruleValidID ) ) ) ;
    public final EObject ruleProviderType() throws RecognitionException {
        EObject current = null;

        EObject lv_keyword_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:3224:2: ( ( () ( (lv_keyword_1_0= ruleProviderTypeKeyword ) ) ( (lv_name_2_0= ruleValidID ) ) ) )
            // InternalLibrettoProjectProfile.g:3225:2: ( () ( (lv_keyword_1_0= ruleProviderTypeKeyword ) ) ( (lv_name_2_0= ruleValidID ) ) )
            {
            // InternalLibrettoProjectProfile.g:3225:2: ( () ( (lv_keyword_1_0= ruleProviderTypeKeyword ) ) ( (lv_name_2_0= ruleValidID ) ) )
            // InternalLibrettoProjectProfile.g:3226:3: () ( (lv_keyword_1_0= ruleProviderTypeKeyword ) ) ( (lv_name_2_0= ruleValidID ) )
            {
            // InternalLibrettoProjectProfile.g:3226:3: ()
            // InternalLibrettoProjectProfile.g:3227:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProviderTypeAccess().getProviderTypeAction_0(),
            					current);
            			

            }

            // InternalLibrettoProjectProfile.g:3233:3: ( (lv_keyword_1_0= ruleProviderTypeKeyword ) )
            // InternalLibrettoProjectProfile.g:3234:4: (lv_keyword_1_0= ruleProviderTypeKeyword )
            {
            // InternalLibrettoProjectProfile.g:3234:4: (lv_keyword_1_0= ruleProviderTypeKeyword )
            // InternalLibrettoProjectProfile.g:3235:5: lv_keyword_1_0= ruleProviderTypeKeyword
            {

            					newCompositeNode(grammarAccess.getProviderTypeAccess().getKeywordProviderTypeKeywordParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_keyword_1_0=ruleProviderTypeKeyword();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProviderTypeRule());
            					}
            					set(
            						current,
            						"keyword",
            						lv_keyword_1_0,
            						"com.robenglander.libretto.spec.LibrettoProjectProfile.ProviderTypeKeyword");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLibrettoProjectProfile.g:3252:3: ( (lv_name_2_0= ruleValidID ) )
            // InternalLibrettoProjectProfile.g:3253:4: (lv_name_2_0= ruleValidID )
            {
            // InternalLibrettoProjectProfile.g:3253:4: (lv_name_2_0= ruleValidID )
            // InternalLibrettoProjectProfile.g:3254:5: lv_name_2_0= ruleValidID
            {

            					newCompositeNode(grammarAccess.getProviderTypeAccess().getNameValidIDParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleValidID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProviderTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"com.robenglander.libretto.spec.LibrettoProjectProfile.ValidID");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleProviderType"


    // $ANTLR start "entryRuleProviderTypeKeyword"
    // InternalLibrettoProjectProfile.g:3275:1: entryRuleProviderTypeKeyword returns [EObject current=null] : iv_ruleProviderTypeKeyword= ruleProviderTypeKeyword EOF ;
    public final EObject entryRuleProviderTypeKeyword() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProviderTypeKeyword = null;


        try {
            // InternalLibrettoProjectProfile.g:3275:60: (iv_ruleProviderTypeKeyword= ruleProviderTypeKeyword EOF )
            // InternalLibrettoProjectProfile.g:3276:2: iv_ruleProviderTypeKeyword= ruleProviderTypeKeyword EOF
            {
             newCompositeNode(grammarAccess.getProviderTypeKeywordRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProviderTypeKeyword=ruleProviderTypeKeyword();

            state._fsp--;

             current =iv_ruleProviderTypeKeyword; 
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
    // $ANTLR end "entryRuleProviderTypeKeyword"


    // $ANTLR start "ruleProviderTypeKeyword"
    // InternalLibrettoProjectProfile.g:3282:1: ruleProviderTypeKeyword returns [EObject current=null] : ( () ( (lv_keyword_1_0= 'type' ) ) ) ;
    public final EObject ruleProviderTypeKeyword() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_1_0=null;


        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:3288:2: ( ( () ( (lv_keyword_1_0= 'type' ) ) ) )
            // InternalLibrettoProjectProfile.g:3289:2: ( () ( (lv_keyword_1_0= 'type' ) ) )
            {
            // InternalLibrettoProjectProfile.g:3289:2: ( () ( (lv_keyword_1_0= 'type' ) ) )
            // InternalLibrettoProjectProfile.g:3290:3: () ( (lv_keyword_1_0= 'type' ) )
            {
            // InternalLibrettoProjectProfile.g:3290:3: ()
            // InternalLibrettoProjectProfile.g:3291:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProviderTypeKeywordAccess().getProviderTypeKeywordAction_0(),
            					current);
            			

            }

            // InternalLibrettoProjectProfile.g:3297:3: ( (lv_keyword_1_0= 'type' ) )
            // InternalLibrettoProjectProfile.g:3298:4: (lv_keyword_1_0= 'type' )
            {
            // InternalLibrettoProjectProfile.g:3298:4: (lv_keyword_1_0= 'type' )
            // InternalLibrettoProjectProfile.g:3299:5: lv_keyword_1_0= 'type'
            {
            lv_keyword_1_0=(Token)match(input,48,FOLLOW_2); 

            					newLeafNode(lv_keyword_1_0, grammarAccess.getProviderTypeKeywordAccess().getKeywordTypeKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProviderTypeKeywordRule());
            					}
            					setWithLastConsumed(current, "keyword", lv_keyword_1_0, "type");
            				

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
    // $ANTLR end "ruleProviderTypeKeyword"


    // $ANTLR start "entryRuleLocalModelPath"
    // InternalLibrettoProjectProfile.g:3315:1: entryRuleLocalModelPath returns [EObject current=null] : iv_ruleLocalModelPath= ruleLocalModelPath EOF ;
    public final EObject entryRuleLocalModelPath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalModelPath = null;


        try {
            // InternalLibrettoProjectProfile.g:3315:55: (iv_ruleLocalModelPath= ruleLocalModelPath EOF )
            // InternalLibrettoProjectProfile.g:3316:2: iv_ruleLocalModelPath= ruleLocalModelPath EOF
            {
             newCompositeNode(grammarAccess.getLocalModelPathRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLocalModelPath=ruleLocalModelPath();

            state._fsp--;

             current =iv_ruleLocalModelPath; 
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
    // $ANTLR end "entryRuleLocalModelPath"


    // $ANTLR start "ruleLocalModelPath"
    // InternalLibrettoProjectProfile.g:3322:1: ruleLocalModelPath returns [EObject current=null] : ( () ( (lv_keyword_1_0= ruleFilePathKeyword ) ) ( (lv_path_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleLocalModelPath() throws RecognitionException {
        EObject current = null;

        Token lv_path_2_0=null;
        EObject lv_keyword_1_0 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:3328:2: ( ( () ( (lv_keyword_1_0= ruleFilePathKeyword ) ) ( (lv_path_2_0= RULE_STRING ) ) ) )
            // InternalLibrettoProjectProfile.g:3329:2: ( () ( (lv_keyword_1_0= ruleFilePathKeyword ) ) ( (lv_path_2_0= RULE_STRING ) ) )
            {
            // InternalLibrettoProjectProfile.g:3329:2: ( () ( (lv_keyword_1_0= ruleFilePathKeyword ) ) ( (lv_path_2_0= RULE_STRING ) ) )
            // InternalLibrettoProjectProfile.g:3330:3: () ( (lv_keyword_1_0= ruleFilePathKeyword ) ) ( (lv_path_2_0= RULE_STRING ) )
            {
            // InternalLibrettoProjectProfile.g:3330:3: ()
            // InternalLibrettoProjectProfile.g:3331:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLocalModelPathAccess().getLocalModelPathAction_0(),
            					current);
            			

            }

            // InternalLibrettoProjectProfile.g:3337:3: ( (lv_keyword_1_0= ruleFilePathKeyword ) )
            // InternalLibrettoProjectProfile.g:3338:4: (lv_keyword_1_0= ruleFilePathKeyword )
            {
            // InternalLibrettoProjectProfile.g:3338:4: (lv_keyword_1_0= ruleFilePathKeyword )
            // InternalLibrettoProjectProfile.g:3339:5: lv_keyword_1_0= ruleFilePathKeyword
            {

            					newCompositeNode(grammarAccess.getLocalModelPathAccess().getKeywordFilePathKeywordParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_keyword_1_0=ruleFilePathKeyword();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLocalModelPathRule());
            					}
            					set(
            						current,
            						"keyword",
            						lv_keyword_1_0,
            						"com.robenglander.libretto.spec.LibrettoProjectProfile.FilePathKeyword");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLibrettoProjectProfile.g:3356:3: ( (lv_path_2_0= RULE_STRING ) )
            // InternalLibrettoProjectProfile.g:3357:4: (lv_path_2_0= RULE_STRING )
            {
            // InternalLibrettoProjectProfile.g:3357:4: (lv_path_2_0= RULE_STRING )
            // InternalLibrettoProjectProfile.g:3358:5: lv_path_2_0= RULE_STRING
            {
            lv_path_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_path_2_0, grammarAccess.getLocalModelPathAccess().getPathSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLocalModelPathRule());
            					}
            					setWithLastConsumed(
            						current,
            						"path",
            						lv_path_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleLocalModelPath"


    // $ANTLR start "entryRuleModel"
    // InternalLibrettoProjectProfile.g:3378:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalLibrettoProjectProfile.g:3378:46: (iv_ruleModel= ruleModel EOF )
            // InternalLibrettoProjectProfile.g:3379:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalLibrettoProjectProfile.g:3385:1: ruleModel returns [EObject current=null] : ( () ( (lv_keyword_1_0= ruleModelKeyword ) ) ( (lv_mode_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token lv_mode_2_0=null;
        EObject lv_keyword_1_0 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:3391:2: ( ( () ( (lv_keyword_1_0= ruleModelKeyword ) ) ( (lv_mode_2_0= RULE_STRING ) ) ) )
            // InternalLibrettoProjectProfile.g:3392:2: ( () ( (lv_keyword_1_0= ruleModelKeyword ) ) ( (lv_mode_2_0= RULE_STRING ) ) )
            {
            // InternalLibrettoProjectProfile.g:3392:2: ( () ( (lv_keyword_1_0= ruleModelKeyword ) ) ( (lv_mode_2_0= RULE_STRING ) ) )
            // InternalLibrettoProjectProfile.g:3393:3: () ( (lv_keyword_1_0= ruleModelKeyword ) ) ( (lv_mode_2_0= RULE_STRING ) )
            {
            // InternalLibrettoProjectProfile.g:3393:3: ()
            // InternalLibrettoProjectProfile.g:3394:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getModelAccess().getModelAction_0(),
            					current);
            			

            }

            // InternalLibrettoProjectProfile.g:3400:3: ( (lv_keyword_1_0= ruleModelKeyword ) )
            // InternalLibrettoProjectProfile.g:3401:4: (lv_keyword_1_0= ruleModelKeyword )
            {
            // InternalLibrettoProjectProfile.g:3401:4: (lv_keyword_1_0= ruleModelKeyword )
            // InternalLibrettoProjectProfile.g:3402:5: lv_keyword_1_0= ruleModelKeyword
            {

            					newCompositeNode(grammarAccess.getModelAccess().getKeywordModelKeywordParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_keyword_1_0=ruleModelKeyword();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"keyword",
            						lv_keyword_1_0,
            						"com.robenglander.libretto.spec.LibrettoProjectProfile.ModelKeyword");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLibrettoProjectProfile.g:3419:3: ( (lv_mode_2_0= RULE_STRING ) )
            // InternalLibrettoProjectProfile.g:3420:4: (lv_mode_2_0= RULE_STRING )
            {
            // InternalLibrettoProjectProfile.g:3420:4: (lv_mode_2_0= RULE_STRING )
            // InternalLibrettoProjectProfile.g:3421:5: lv_mode_2_0= RULE_STRING
            {
            lv_mode_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_mode_2_0, grammarAccess.getModelAccess().getModeSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"mode",
            						lv_mode_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleModelKeyword"
    // InternalLibrettoProjectProfile.g:3441:1: entryRuleModelKeyword returns [EObject current=null] : iv_ruleModelKeyword= ruleModelKeyword EOF ;
    public final EObject entryRuleModelKeyword() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelKeyword = null;


        try {
            // InternalLibrettoProjectProfile.g:3441:53: (iv_ruleModelKeyword= ruleModelKeyword EOF )
            // InternalLibrettoProjectProfile.g:3442:2: iv_ruleModelKeyword= ruleModelKeyword EOF
            {
             newCompositeNode(grammarAccess.getModelKeywordRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModelKeyword=ruleModelKeyword();

            state._fsp--;

             current =iv_ruleModelKeyword; 
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
    // $ANTLR end "entryRuleModelKeyword"


    // $ANTLR start "ruleModelKeyword"
    // InternalLibrettoProjectProfile.g:3448:1: ruleModelKeyword returns [EObject current=null] : ( () ( (lv_keyword_1_0= 'model' ) ) ) ;
    public final EObject ruleModelKeyword() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_1_0=null;


        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:3454:2: ( ( () ( (lv_keyword_1_0= 'model' ) ) ) )
            // InternalLibrettoProjectProfile.g:3455:2: ( () ( (lv_keyword_1_0= 'model' ) ) )
            {
            // InternalLibrettoProjectProfile.g:3455:2: ( () ( (lv_keyword_1_0= 'model' ) ) )
            // InternalLibrettoProjectProfile.g:3456:3: () ( (lv_keyword_1_0= 'model' ) )
            {
            // InternalLibrettoProjectProfile.g:3456:3: ()
            // InternalLibrettoProjectProfile.g:3457:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getModelKeywordAccess().getModelKeywordAction_0(),
            					current);
            			

            }

            // InternalLibrettoProjectProfile.g:3463:3: ( (lv_keyword_1_0= 'model' ) )
            // InternalLibrettoProjectProfile.g:3464:4: (lv_keyword_1_0= 'model' )
            {
            // InternalLibrettoProjectProfile.g:3464:4: (lv_keyword_1_0= 'model' )
            // InternalLibrettoProjectProfile.g:3465:5: lv_keyword_1_0= 'model'
            {
            lv_keyword_1_0=(Token)match(input,49,FOLLOW_2); 

            					newLeafNode(lv_keyword_1_0, grammarAccess.getModelKeywordAccess().getKeywordModelKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelKeywordRule());
            					}
            					setWithLastConsumed(current, "keyword", lv_keyword_1_0, "model");
            				

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
    // $ANTLR end "ruleModelKeyword"


    // $ANTLR start "entryRuleFilePathKeyword"
    // InternalLibrettoProjectProfile.g:3481:1: entryRuleFilePathKeyword returns [EObject current=null] : iv_ruleFilePathKeyword= ruleFilePathKeyword EOF ;
    public final EObject entryRuleFilePathKeyword() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilePathKeyword = null;


        try {
            // InternalLibrettoProjectProfile.g:3481:56: (iv_ruleFilePathKeyword= ruleFilePathKeyword EOF )
            // InternalLibrettoProjectProfile.g:3482:2: iv_ruleFilePathKeyword= ruleFilePathKeyword EOF
            {
             newCompositeNode(grammarAccess.getFilePathKeywordRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFilePathKeyword=ruleFilePathKeyword();

            state._fsp--;

             current =iv_ruleFilePathKeyword; 
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
    // $ANTLR end "entryRuleFilePathKeyword"


    // $ANTLR start "ruleFilePathKeyword"
    // InternalLibrettoProjectProfile.g:3488:1: ruleFilePathKeyword returns [EObject current=null] : ( () ( ( (lv_keyword_1_1= 'filepath' | lv_keyword_1_2= 'filePath' ) ) ) ) ;
    public final EObject ruleFilePathKeyword() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_1_1=null;
        Token lv_keyword_1_2=null;


        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:3494:2: ( ( () ( ( (lv_keyword_1_1= 'filepath' | lv_keyword_1_2= 'filePath' ) ) ) ) )
            // InternalLibrettoProjectProfile.g:3495:2: ( () ( ( (lv_keyword_1_1= 'filepath' | lv_keyword_1_2= 'filePath' ) ) ) )
            {
            // InternalLibrettoProjectProfile.g:3495:2: ( () ( ( (lv_keyword_1_1= 'filepath' | lv_keyword_1_2= 'filePath' ) ) ) )
            // InternalLibrettoProjectProfile.g:3496:3: () ( ( (lv_keyword_1_1= 'filepath' | lv_keyword_1_2= 'filePath' ) ) )
            {
            // InternalLibrettoProjectProfile.g:3496:3: ()
            // InternalLibrettoProjectProfile.g:3497:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFilePathKeywordAccess().getFilePathKeywordAction_0(),
            					current);
            			

            }

            // InternalLibrettoProjectProfile.g:3503:3: ( ( (lv_keyword_1_1= 'filepath' | lv_keyword_1_2= 'filePath' ) ) )
            // InternalLibrettoProjectProfile.g:3504:4: ( (lv_keyword_1_1= 'filepath' | lv_keyword_1_2= 'filePath' ) )
            {
            // InternalLibrettoProjectProfile.g:3504:4: ( (lv_keyword_1_1= 'filepath' | lv_keyword_1_2= 'filePath' ) )
            // InternalLibrettoProjectProfile.g:3505:5: (lv_keyword_1_1= 'filepath' | lv_keyword_1_2= 'filePath' )
            {
            // InternalLibrettoProjectProfile.g:3505:5: (lv_keyword_1_1= 'filepath' | lv_keyword_1_2= 'filePath' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==50) ) {
                alt23=1;
            }
            else if ( (LA23_0==51) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:3506:6: lv_keyword_1_1= 'filepath'
                    {
                    lv_keyword_1_1=(Token)match(input,50,FOLLOW_2); 

                    						newLeafNode(lv_keyword_1_1, grammarAccess.getFilePathKeywordAccess().getKeywordFilepathKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFilePathKeywordRule());
                    						}
                    						setWithLastConsumed(current, "keyword", lv_keyword_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalLibrettoProjectProfile.g:3517:6: lv_keyword_1_2= 'filePath'
                    {
                    lv_keyword_1_2=(Token)match(input,51,FOLLOW_2); 

                    						newLeafNode(lv_keyword_1_2, grammarAccess.getFilePathKeywordAccess().getKeywordFilePathKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFilePathKeywordRule());
                    						}
                    						setWithLastConsumed(current, "keyword", lv_keyword_1_2, null);
                    					

                    }
                    break;

            }


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
    // $ANTLR end "ruleFilePathKeyword"


    // $ANTLR start "entryRuleEndpoint"
    // InternalLibrettoProjectProfile.g:3534:1: entryRuleEndpoint returns [EObject current=null] : iv_ruleEndpoint= ruleEndpoint EOF ;
    public final EObject entryRuleEndpoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEndpoint = null;


        try {
            // InternalLibrettoProjectProfile.g:3534:49: (iv_ruleEndpoint= ruleEndpoint EOF )
            // InternalLibrettoProjectProfile.g:3535:2: iv_ruleEndpoint= ruleEndpoint EOF
            {
             newCompositeNode(grammarAccess.getEndpointRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEndpoint=ruleEndpoint();

            state._fsp--;

             current =iv_ruleEndpoint; 
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
    // $ANTLR end "entryRuleEndpoint"


    // $ANTLR start "ruleEndpoint"
    // InternalLibrettoProjectProfile.g:3541:1: ruleEndpoint returns [EObject current=null] : ( () ( (lv_keyword_1_0= ruleEndpointKeyword ) ) ( (lv_mode_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleEndpoint() throws RecognitionException {
        EObject current = null;

        Token lv_mode_2_0=null;
        EObject lv_keyword_1_0 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:3547:2: ( ( () ( (lv_keyword_1_0= ruleEndpointKeyword ) ) ( (lv_mode_2_0= RULE_STRING ) ) ) )
            // InternalLibrettoProjectProfile.g:3548:2: ( () ( (lv_keyword_1_0= ruleEndpointKeyword ) ) ( (lv_mode_2_0= RULE_STRING ) ) )
            {
            // InternalLibrettoProjectProfile.g:3548:2: ( () ( (lv_keyword_1_0= ruleEndpointKeyword ) ) ( (lv_mode_2_0= RULE_STRING ) ) )
            // InternalLibrettoProjectProfile.g:3549:3: () ( (lv_keyword_1_0= ruleEndpointKeyword ) ) ( (lv_mode_2_0= RULE_STRING ) )
            {
            // InternalLibrettoProjectProfile.g:3549:3: ()
            // InternalLibrettoProjectProfile.g:3550:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEndpointAccess().getEndpointAction_0(),
            					current);
            			

            }

            // InternalLibrettoProjectProfile.g:3556:3: ( (lv_keyword_1_0= ruleEndpointKeyword ) )
            // InternalLibrettoProjectProfile.g:3557:4: (lv_keyword_1_0= ruleEndpointKeyword )
            {
            // InternalLibrettoProjectProfile.g:3557:4: (lv_keyword_1_0= ruleEndpointKeyword )
            // InternalLibrettoProjectProfile.g:3558:5: lv_keyword_1_0= ruleEndpointKeyword
            {

            					newCompositeNode(grammarAccess.getEndpointAccess().getKeywordEndpointKeywordParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_keyword_1_0=ruleEndpointKeyword();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEndpointRule());
            					}
            					set(
            						current,
            						"keyword",
            						lv_keyword_1_0,
            						"com.robenglander.libretto.spec.LibrettoProjectProfile.EndpointKeyword");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLibrettoProjectProfile.g:3575:3: ( (lv_mode_2_0= RULE_STRING ) )
            // InternalLibrettoProjectProfile.g:3576:4: (lv_mode_2_0= RULE_STRING )
            {
            // InternalLibrettoProjectProfile.g:3576:4: (lv_mode_2_0= RULE_STRING )
            // InternalLibrettoProjectProfile.g:3577:5: lv_mode_2_0= RULE_STRING
            {
            lv_mode_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_mode_2_0, grammarAccess.getEndpointAccess().getModeSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEndpointRule());
            					}
            					setWithLastConsumed(
            						current,
            						"mode",
            						lv_mode_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleEndpoint"


    // $ANTLR start "entryRuleEndpointKeyword"
    // InternalLibrettoProjectProfile.g:3597:1: entryRuleEndpointKeyword returns [EObject current=null] : iv_ruleEndpointKeyword= ruleEndpointKeyword EOF ;
    public final EObject entryRuleEndpointKeyword() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEndpointKeyword = null;


        try {
            // InternalLibrettoProjectProfile.g:3597:56: (iv_ruleEndpointKeyword= ruleEndpointKeyword EOF )
            // InternalLibrettoProjectProfile.g:3598:2: iv_ruleEndpointKeyword= ruleEndpointKeyword EOF
            {
             newCompositeNode(grammarAccess.getEndpointKeywordRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEndpointKeyword=ruleEndpointKeyword();

            state._fsp--;

             current =iv_ruleEndpointKeyword; 
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
    // $ANTLR end "entryRuleEndpointKeyword"


    // $ANTLR start "ruleEndpointKeyword"
    // InternalLibrettoProjectProfile.g:3604:1: ruleEndpointKeyword returns [EObject current=null] : ( () ( ( (lv_keyword_1_1= 'endpoint' | lv_keyword_1_2= 'endPoint' ) ) ) ) ;
    public final EObject ruleEndpointKeyword() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_1_1=null;
        Token lv_keyword_1_2=null;


        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:3610:2: ( ( () ( ( (lv_keyword_1_1= 'endpoint' | lv_keyword_1_2= 'endPoint' ) ) ) ) )
            // InternalLibrettoProjectProfile.g:3611:2: ( () ( ( (lv_keyword_1_1= 'endpoint' | lv_keyword_1_2= 'endPoint' ) ) ) )
            {
            // InternalLibrettoProjectProfile.g:3611:2: ( () ( ( (lv_keyword_1_1= 'endpoint' | lv_keyword_1_2= 'endPoint' ) ) ) )
            // InternalLibrettoProjectProfile.g:3612:3: () ( ( (lv_keyword_1_1= 'endpoint' | lv_keyword_1_2= 'endPoint' ) ) )
            {
            // InternalLibrettoProjectProfile.g:3612:3: ()
            // InternalLibrettoProjectProfile.g:3613:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEndpointKeywordAccess().getEndpointKeywordAction_0(),
            					current);
            			

            }

            // InternalLibrettoProjectProfile.g:3619:3: ( ( (lv_keyword_1_1= 'endpoint' | lv_keyword_1_2= 'endPoint' ) ) )
            // InternalLibrettoProjectProfile.g:3620:4: ( (lv_keyword_1_1= 'endpoint' | lv_keyword_1_2= 'endPoint' ) )
            {
            // InternalLibrettoProjectProfile.g:3620:4: ( (lv_keyword_1_1= 'endpoint' | lv_keyword_1_2= 'endPoint' ) )
            // InternalLibrettoProjectProfile.g:3621:5: (lv_keyword_1_1= 'endpoint' | lv_keyword_1_2= 'endPoint' )
            {
            // InternalLibrettoProjectProfile.g:3621:5: (lv_keyword_1_1= 'endpoint' | lv_keyword_1_2= 'endPoint' )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==52) ) {
                alt24=1;
            }
            else if ( (LA24_0==53) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:3622:6: lv_keyword_1_1= 'endpoint'
                    {
                    lv_keyword_1_1=(Token)match(input,52,FOLLOW_2); 

                    						newLeafNode(lv_keyword_1_1, grammarAccess.getEndpointKeywordAccess().getKeywordEndpointKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEndpointKeywordRule());
                    						}
                    						setWithLastConsumed(current, "keyword", lv_keyword_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalLibrettoProjectProfile.g:3633:6: lv_keyword_1_2= 'endPoint'
                    {
                    lv_keyword_1_2=(Token)match(input,53,FOLLOW_2); 

                    						newLeafNode(lv_keyword_1_2, grammarAccess.getEndpointKeywordAccess().getKeywordEndPointKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEndpointKeywordRule());
                    						}
                    						setWithLastConsumed(current, "keyword", lv_keyword_1_2, null);
                    					

                    }
                    break;

            }


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
    // $ANTLR end "ruleEndpointKeyword"


    // $ANTLR start "entryRuleGenUsageBlock"
    // InternalLibrettoProjectProfile.g:3650:1: entryRuleGenUsageBlock returns [EObject current=null] : iv_ruleGenUsageBlock= ruleGenUsageBlock EOF ;
    public final EObject entryRuleGenUsageBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenUsageBlock = null;


        try {
            // InternalLibrettoProjectProfile.g:3650:54: (iv_ruleGenUsageBlock= ruleGenUsageBlock EOF )
            // InternalLibrettoProjectProfile.g:3651:2: iv_ruleGenUsageBlock= ruleGenUsageBlock EOF
            {
             newCompositeNode(grammarAccess.getGenUsageBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGenUsageBlock=ruleGenUsageBlock();

            state._fsp--;

             current =iv_ruleGenUsageBlock; 
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
    // $ANTLR end "entryRuleGenUsageBlock"


    // $ANTLR start "ruleGenUsageBlock"
    // InternalLibrettoProjectProfile.g:3657:1: ruleGenUsageBlock returns [EObject current=null] : ( () ( (lv_keyword_1_0= ruleModelUsageKeyword ) ) otherlv_2= '{' ( ( (lv_primaryProviders_3_0= rulePrimaryProvider ) ) | ( (lv_secondaryProviders_4_0= ruleSecondaryProvider ) ) | ( (lv_escalations_5_0= ruleGenEscalationBlock ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleGenUsageBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_keyword_1_0 = null;

        EObject lv_primaryProviders_3_0 = null;

        EObject lv_secondaryProviders_4_0 = null;

        EObject lv_escalations_5_0 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:3663:2: ( ( () ( (lv_keyword_1_0= ruleModelUsageKeyword ) ) otherlv_2= '{' ( ( (lv_primaryProviders_3_0= rulePrimaryProvider ) ) | ( (lv_secondaryProviders_4_0= ruleSecondaryProvider ) ) | ( (lv_escalations_5_0= ruleGenEscalationBlock ) ) )* otherlv_6= '}' ) )
            // InternalLibrettoProjectProfile.g:3664:2: ( () ( (lv_keyword_1_0= ruleModelUsageKeyword ) ) otherlv_2= '{' ( ( (lv_primaryProviders_3_0= rulePrimaryProvider ) ) | ( (lv_secondaryProviders_4_0= ruleSecondaryProvider ) ) | ( (lv_escalations_5_0= ruleGenEscalationBlock ) ) )* otherlv_6= '}' )
            {
            // InternalLibrettoProjectProfile.g:3664:2: ( () ( (lv_keyword_1_0= ruleModelUsageKeyword ) ) otherlv_2= '{' ( ( (lv_primaryProviders_3_0= rulePrimaryProvider ) ) | ( (lv_secondaryProviders_4_0= ruleSecondaryProvider ) ) | ( (lv_escalations_5_0= ruleGenEscalationBlock ) ) )* otherlv_6= '}' )
            // InternalLibrettoProjectProfile.g:3665:3: () ( (lv_keyword_1_0= ruleModelUsageKeyword ) ) otherlv_2= '{' ( ( (lv_primaryProviders_3_0= rulePrimaryProvider ) ) | ( (lv_secondaryProviders_4_0= ruleSecondaryProvider ) ) | ( (lv_escalations_5_0= ruleGenEscalationBlock ) ) )* otherlv_6= '}'
            {
            // InternalLibrettoProjectProfile.g:3665:3: ()
            // InternalLibrettoProjectProfile.g:3666:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGenUsageBlockAccess().getGenUsageBlockAction_0(),
            					current);
            			

            }

            // InternalLibrettoProjectProfile.g:3672:3: ( (lv_keyword_1_0= ruleModelUsageKeyword ) )
            // InternalLibrettoProjectProfile.g:3673:4: (lv_keyword_1_0= ruleModelUsageKeyword )
            {
            // InternalLibrettoProjectProfile.g:3673:4: (lv_keyword_1_0= ruleModelUsageKeyword )
            // InternalLibrettoProjectProfile.g:3674:5: lv_keyword_1_0= ruleModelUsageKeyword
            {

            					newCompositeNode(grammarAccess.getGenUsageBlockAccess().getKeywordModelUsageKeywordParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_keyword_1_0=ruleModelUsageKeyword();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGenUsageBlockRule());
            					}
            					set(
            						current,
            						"keyword",
            						lv_keyword_1_0,
            						"com.robenglander.libretto.spec.LibrettoProjectProfile.ModelUsageKeyword");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,11,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getGenUsageBlockAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLibrettoProjectProfile.g:3695:3: ( ( (lv_primaryProviders_3_0= rulePrimaryProvider ) ) | ( (lv_secondaryProviders_4_0= ruleSecondaryProvider ) ) | ( (lv_escalations_5_0= ruleGenEscalationBlock ) ) )*
            loop25:
            do {
                int alt25=4;
                switch ( input.LA(1) ) {
                case 56:
                    {
                    alt25=1;
                    }
                    break;
                case 57:
                    {
                    alt25=2;
                    }
                    break;
                case 58:
                    {
                    alt25=3;
                    }
                    break;

                }

                switch (alt25) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:3696:4: ( (lv_primaryProviders_3_0= rulePrimaryProvider ) )
            	    {
            	    // InternalLibrettoProjectProfile.g:3696:4: ( (lv_primaryProviders_3_0= rulePrimaryProvider ) )
            	    // InternalLibrettoProjectProfile.g:3697:5: (lv_primaryProviders_3_0= rulePrimaryProvider )
            	    {
            	    // InternalLibrettoProjectProfile.g:3697:5: (lv_primaryProviders_3_0= rulePrimaryProvider )
            	    // InternalLibrettoProjectProfile.g:3698:6: lv_primaryProviders_3_0= rulePrimaryProvider
            	    {

            	    						newCompositeNode(grammarAccess.getGenUsageBlockAccess().getPrimaryProvidersPrimaryProviderParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_primaryProviders_3_0=rulePrimaryProvider();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGenUsageBlockRule());
            	    						}
            	    						add(
            	    							current,
            	    							"primaryProviders",
            	    							lv_primaryProviders_3_0,
            	    							"com.robenglander.libretto.spec.LibrettoProjectProfile.PrimaryProvider");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalLibrettoProjectProfile.g:3716:4: ( (lv_secondaryProviders_4_0= ruleSecondaryProvider ) )
            	    {
            	    // InternalLibrettoProjectProfile.g:3716:4: ( (lv_secondaryProviders_4_0= ruleSecondaryProvider ) )
            	    // InternalLibrettoProjectProfile.g:3717:5: (lv_secondaryProviders_4_0= ruleSecondaryProvider )
            	    {
            	    // InternalLibrettoProjectProfile.g:3717:5: (lv_secondaryProviders_4_0= ruleSecondaryProvider )
            	    // InternalLibrettoProjectProfile.g:3718:6: lv_secondaryProviders_4_0= ruleSecondaryProvider
            	    {

            	    						newCompositeNode(grammarAccess.getGenUsageBlockAccess().getSecondaryProvidersSecondaryProviderParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_secondaryProviders_4_0=ruleSecondaryProvider();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGenUsageBlockRule());
            	    						}
            	    						add(
            	    							current,
            	    							"secondaryProviders",
            	    							lv_secondaryProviders_4_0,
            	    							"com.robenglander.libretto.spec.LibrettoProjectProfile.SecondaryProvider");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalLibrettoProjectProfile.g:3736:4: ( (lv_escalations_5_0= ruleGenEscalationBlock ) )
            	    {
            	    // InternalLibrettoProjectProfile.g:3736:4: ( (lv_escalations_5_0= ruleGenEscalationBlock ) )
            	    // InternalLibrettoProjectProfile.g:3737:5: (lv_escalations_5_0= ruleGenEscalationBlock )
            	    {
            	    // InternalLibrettoProjectProfile.g:3737:5: (lv_escalations_5_0= ruleGenEscalationBlock )
            	    // InternalLibrettoProjectProfile.g:3738:6: lv_escalations_5_0= ruleGenEscalationBlock
            	    {

            	    						newCompositeNode(grammarAccess.getGenUsageBlockAccess().getEscalationsGenEscalationBlockParserRuleCall_3_2_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_escalations_5_0=ruleGenEscalationBlock();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGenUsageBlockRule());
            	    						}
            	    						add(
            	    							current,
            	    							"escalations",
            	    							lv_escalations_5_0,
            	    							"com.robenglander.libretto.spec.LibrettoProjectProfile.GenEscalationBlock");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            otherlv_6=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getGenUsageBlockAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleGenUsageBlock"


    // $ANTLR start "entryRuleModelUsageKeyword"
    // InternalLibrettoProjectProfile.g:3764:1: entryRuleModelUsageKeyword returns [EObject current=null] : iv_ruleModelUsageKeyword= ruleModelUsageKeyword EOF ;
    public final EObject entryRuleModelUsageKeyword() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelUsageKeyword = null;


        try {
            // InternalLibrettoProjectProfile.g:3764:58: (iv_ruleModelUsageKeyword= ruleModelUsageKeyword EOF )
            // InternalLibrettoProjectProfile.g:3765:2: iv_ruleModelUsageKeyword= ruleModelUsageKeyword EOF
            {
             newCompositeNode(grammarAccess.getModelUsageKeywordRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModelUsageKeyword=ruleModelUsageKeyword();

            state._fsp--;

             current =iv_ruleModelUsageKeyword; 
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
    // $ANTLR end "entryRuleModelUsageKeyword"


    // $ANTLR start "ruleModelUsageKeyword"
    // InternalLibrettoProjectProfile.g:3771:1: ruleModelUsageKeyword returns [EObject current=null] : ( () ( ( (lv_keyword_1_1= 'modelusage' | lv_keyword_1_2= 'modelUsage' ) ) ) ) ;
    public final EObject ruleModelUsageKeyword() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_1_1=null;
        Token lv_keyword_1_2=null;


        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:3777:2: ( ( () ( ( (lv_keyword_1_1= 'modelusage' | lv_keyword_1_2= 'modelUsage' ) ) ) ) )
            // InternalLibrettoProjectProfile.g:3778:2: ( () ( ( (lv_keyword_1_1= 'modelusage' | lv_keyword_1_2= 'modelUsage' ) ) ) )
            {
            // InternalLibrettoProjectProfile.g:3778:2: ( () ( ( (lv_keyword_1_1= 'modelusage' | lv_keyword_1_2= 'modelUsage' ) ) ) )
            // InternalLibrettoProjectProfile.g:3779:3: () ( ( (lv_keyword_1_1= 'modelusage' | lv_keyword_1_2= 'modelUsage' ) ) )
            {
            // InternalLibrettoProjectProfile.g:3779:3: ()
            // InternalLibrettoProjectProfile.g:3780:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getModelUsageKeywordAccess().getModelUsageKeywordAction_0(),
            					current);
            			

            }

            // InternalLibrettoProjectProfile.g:3786:3: ( ( (lv_keyword_1_1= 'modelusage' | lv_keyword_1_2= 'modelUsage' ) ) )
            // InternalLibrettoProjectProfile.g:3787:4: ( (lv_keyword_1_1= 'modelusage' | lv_keyword_1_2= 'modelUsage' ) )
            {
            // InternalLibrettoProjectProfile.g:3787:4: ( (lv_keyword_1_1= 'modelusage' | lv_keyword_1_2= 'modelUsage' ) )
            // InternalLibrettoProjectProfile.g:3788:5: (lv_keyword_1_1= 'modelusage' | lv_keyword_1_2= 'modelUsage' )
            {
            // InternalLibrettoProjectProfile.g:3788:5: (lv_keyword_1_1= 'modelusage' | lv_keyword_1_2= 'modelUsage' )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==54) ) {
                alt26=1;
            }
            else if ( (LA26_0==55) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:3789:6: lv_keyword_1_1= 'modelusage'
                    {
                    lv_keyword_1_1=(Token)match(input,54,FOLLOW_2); 

                    						newLeafNode(lv_keyword_1_1, grammarAccess.getModelUsageKeywordAccess().getKeywordModelusageKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getModelUsageKeywordRule());
                    						}
                    						setWithLastConsumed(current, "keyword", lv_keyword_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalLibrettoProjectProfile.g:3800:6: lv_keyword_1_2= 'modelUsage'
                    {
                    lv_keyword_1_2=(Token)match(input,55,FOLLOW_2); 

                    						newLeafNode(lv_keyword_1_2, grammarAccess.getModelUsageKeywordAccess().getKeywordModelUsageKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getModelUsageKeywordRule());
                    						}
                    						setWithLastConsumed(current, "keyword", lv_keyword_1_2, null);
                    					

                    }
                    break;

            }


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
    // $ANTLR end "ruleModelUsageKeyword"


    // $ANTLR start "entryRulePrimaryProvider"
    // InternalLibrettoProjectProfile.g:3817:1: entryRulePrimaryProvider returns [EObject current=null] : iv_rulePrimaryProvider= rulePrimaryProvider EOF ;
    public final EObject entryRulePrimaryProvider() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryProvider = null;


        try {
            // InternalLibrettoProjectProfile.g:3817:56: (iv_rulePrimaryProvider= rulePrimaryProvider EOF )
            // InternalLibrettoProjectProfile.g:3818:2: iv_rulePrimaryProvider= rulePrimaryProvider EOF
            {
             newCompositeNode(grammarAccess.getPrimaryProviderRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimaryProvider=rulePrimaryProvider();

            state._fsp--;

             current =iv_rulePrimaryProvider; 
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
    // $ANTLR end "entryRulePrimaryProvider"


    // $ANTLR start "rulePrimaryProvider"
    // InternalLibrettoProjectProfile.g:3824:1: rulePrimaryProvider returns [EObject current=null] : ( () ( (lv_keyword_1_0= rulePrimaryProviderKeyword ) ) ( (lv_name_2_0= ruleValidID ) ) ) ;
    public final EObject rulePrimaryProvider() throws RecognitionException {
        EObject current = null;

        EObject lv_keyword_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:3830:2: ( ( () ( (lv_keyword_1_0= rulePrimaryProviderKeyword ) ) ( (lv_name_2_0= ruleValidID ) ) ) )
            // InternalLibrettoProjectProfile.g:3831:2: ( () ( (lv_keyword_1_0= rulePrimaryProviderKeyword ) ) ( (lv_name_2_0= ruleValidID ) ) )
            {
            // InternalLibrettoProjectProfile.g:3831:2: ( () ( (lv_keyword_1_0= rulePrimaryProviderKeyword ) ) ( (lv_name_2_0= ruleValidID ) ) )
            // InternalLibrettoProjectProfile.g:3832:3: () ( (lv_keyword_1_0= rulePrimaryProviderKeyword ) ) ( (lv_name_2_0= ruleValidID ) )
            {
            // InternalLibrettoProjectProfile.g:3832:3: ()
            // InternalLibrettoProjectProfile.g:3833:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPrimaryProviderAccess().getPrimaryProviderAction_0(),
            					current);
            			

            }

            // InternalLibrettoProjectProfile.g:3839:3: ( (lv_keyword_1_0= rulePrimaryProviderKeyword ) )
            // InternalLibrettoProjectProfile.g:3840:4: (lv_keyword_1_0= rulePrimaryProviderKeyword )
            {
            // InternalLibrettoProjectProfile.g:3840:4: (lv_keyword_1_0= rulePrimaryProviderKeyword )
            // InternalLibrettoProjectProfile.g:3841:5: lv_keyword_1_0= rulePrimaryProviderKeyword
            {

            					newCompositeNode(grammarAccess.getPrimaryProviderAccess().getKeywordPrimaryProviderKeywordParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_keyword_1_0=rulePrimaryProviderKeyword();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPrimaryProviderRule());
            					}
            					set(
            						current,
            						"keyword",
            						lv_keyword_1_0,
            						"com.robenglander.libretto.spec.LibrettoProjectProfile.PrimaryProviderKeyword");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLibrettoProjectProfile.g:3858:3: ( (lv_name_2_0= ruleValidID ) )
            // InternalLibrettoProjectProfile.g:3859:4: (lv_name_2_0= ruleValidID )
            {
            // InternalLibrettoProjectProfile.g:3859:4: (lv_name_2_0= ruleValidID )
            // InternalLibrettoProjectProfile.g:3860:5: lv_name_2_0= ruleValidID
            {

            					newCompositeNode(grammarAccess.getPrimaryProviderAccess().getNameValidIDParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleValidID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPrimaryProviderRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"com.robenglander.libretto.spec.LibrettoProjectProfile.ValidID");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "rulePrimaryProvider"


    // $ANTLR start "entryRulePrimaryProviderKeyword"
    // InternalLibrettoProjectProfile.g:3881:1: entryRulePrimaryProviderKeyword returns [EObject current=null] : iv_rulePrimaryProviderKeyword= rulePrimaryProviderKeyword EOF ;
    public final EObject entryRulePrimaryProviderKeyword() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryProviderKeyword = null;


        try {
            // InternalLibrettoProjectProfile.g:3881:63: (iv_rulePrimaryProviderKeyword= rulePrimaryProviderKeyword EOF )
            // InternalLibrettoProjectProfile.g:3882:2: iv_rulePrimaryProviderKeyword= rulePrimaryProviderKeyword EOF
            {
             newCompositeNode(grammarAccess.getPrimaryProviderKeywordRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimaryProviderKeyword=rulePrimaryProviderKeyword();

            state._fsp--;

             current =iv_rulePrimaryProviderKeyword; 
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
    // $ANTLR end "entryRulePrimaryProviderKeyword"


    // $ANTLR start "rulePrimaryProviderKeyword"
    // InternalLibrettoProjectProfile.g:3888:1: rulePrimaryProviderKeyword returns [EObject current=null] : ( () ( (lv_keyword_1_0= 'primary' ) ) ) ;
    public final EObject rulePrimaryProviderKeyword() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_1_0=null;


        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:3894:2: ( ( () ( (lv_keyword_1_0= 'primary' ) ) ) )
            // InternalLibrettoProjectProfile.g:3895:2: ( () ( (lv_keyword_1_0= 'primary' ) ) )
            {
            // InternalLibrettoProjectProfile.g:3895:2: ( () ( (lv_keyword_1_0= 'primary' ) ) )
            // InternalLibrettoProjectProfile.g:3896:3: () ( (lv_keyword_1_0= 'primary' ) )
            {
            // InternalLibrettoProjectProfile.g:3896:3: ()
            // InternalLibrettoProjectProfile.g:3897:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPrimaryProviderKeywordAccess().getPrimaryProviderKeywordAction_0(),
            					current);
            			

            }

            // InternalLibrettoProjectProfile.g:3903:3: ( (lv_keyword_1_0= 'primary' ) )
            // InternalLibrettoProjectProfile.g:3904:4: (lv_keyword_1_0= 'primary' )
            {
            // InternalLibrettoProjectProfile.g:3904:4: (lv_keyword_1_0= 'primary' )
            // InternalLibrettoProjectProfile.g:3905:5: lv_keyword_1_0= 'primary'
            {
            lv_keyword_1_0=(Token)match(input,56,FOLLOW_2); 

            					newLeafNode(lv_keyword_1_0, grammarAccess.getPrimaryProviderKeywordAccess().getKeywordPrimaryKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPrimaryProviderKeywordRule());
            					}
            					setWithLastConsumed(current, "keyword", lv_keyword_1_0, "primary");
            				

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
    // $ANTLR end "rulePrimaryProviderKeyword"


    // $ANTLR start "entryRuleSecondaryProvider"
    // InternalLibrettoProjectProfile.g:3921:1: entryRuleSecondaryProvider returns [EObject current=null] : iv_ruleSecondaryProvider= ruleSecondaryProvider EOF ;
    public final EObject entryRuleSecondaryProvider() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecondaryProvider = null;


        try {
            // InternalLibrettoProjectProfile.g:3921:58: (iv_ruleSecondaryProvider= ruleSecondaryProvider EOF )
            // InternalLibrettoProjectProfile.g:3922:2: iv_ruleSecondaryProvider= ruleSecondaryProvider EOF
            {
             newCompositeNode(grammarAccess.getSecondaryProviderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSecondaryProvider=ruleSecondaryProvider();

            state._fsp--;

             current =iv_ruleSecondaryProvider; 
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
    // $ANTLR end "entryRuleSecondaryProvider"


    // $ANTLR start "ruleSecondaryProvider"
    // InternalLibrettoProjectProfile.g:3928:1: ruleSecondaryProvider returns [EObject current=null] : ( () ( (lv_keyword_1_0= ruleSecondaryProviderKeyword ) ) ( (lv_name_2_0= ruleValidID ) ) ) ;
    public final EObject ruleSecondaryProvider() throws RecognitionException {
        EObject current = null;

        EObject lv_keyword_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:3934:2: ( ( () ( (lv_keyword_1_0= ruleSecondaryProviderKeyword ) ) ( (lv_name_2_0= ruleValidID ) ) ) )
            // InternalLibrettoProjectProfile.g:3935:2: ( () ( (lv_keyword_1_0= ruleSecondaryProviderKeyword ) ) ( (lv_name_2_0= ruleValidID ) ) )
            {
            // InternalLibrettoProjectProfile.g:3935:2: ( () ( (lv_keyword_1_0= ruleSecondaryProviderKeyword ) ) ( (lv_name_2_0= ruleValidID ) ) )
            // InternalLibrettoProjectProfile.g:3936:3: () ( (lv_keyword_1_0= ruleSecondaryProviderKeyword ) ) ( (lv_name_2_0= ruleValidID ) )
            {
            // InternalLibrettoProjectProfile.g:3936:3: ()
            // InternalLibrettoProjectProfile.g:3937:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSecondaryProviderAccess().getSecondaryProviderAction_0(),
            					current);
            			

            }

            // InternalLibrettoProjectProfile.g:3943:3: ( (lv_keyword_1_0= ruleSecondaryProviderKeyword ) )
            // InternalLibrettoProjectProfile.g:3944:4: (lv_keyword_1_0= ruleSecondaryProviderKeyword )
            {
            // InternalLibrettoProjectProfile.g:3944:4: (lv_keyword_1_0= ruleSecondaryProviderKeyword )
            // InternalLibrettoProjectProfile.g:3945:5: lv_keyword_1_0= ruleSecondaryProviderKeyword
            {

            					newCompositeNode(grammarAccess.getSecondaryProviderAccess().getKeywordSecondaryProviderKeywordParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_keyword_1_0=ruleSecondaryProviderKeyword();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSecondaryProviderRule());
            					}
            					set(
            						current,
            						"keyword",
            						lv_keyword_1_0,
            						"com.robenglander.libretto.spec.LibrettoProjectProfile.SecondaryProviderKeyword");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLibrettoProjectProfile.g:3962:3: ( (lv_name_2_0= ruleValidID ) )
            // InternalLibrettoProjectProfile.g:3963:4: (lv_name_2_0= ruleValidID )
            {
            // InternalLibrettoProjectProfile.g:3963:4: (lv_name_2_0= ruleValidID )
            // InternalLibrettoProjectProfile.g:3964:5: lv_name_2_0= ruleValidID
            {

            					newCompositeNode(grammarAccess.getSecondaryProviderAccess().getNameValidIDParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleValidID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSecondaryProviderRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"com.robenglander.libretto.spec.LibrettoProjectProfile.ValidID");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleSecondaryProvider"


    // $ANTLR start "entryRuleSecondaryProviderKeyword"
    // InternalLibrettoProjectProfile.g:3985:1: entryRuleSecondaryProviderKeyword returns [EObject current=null] : iv_ruleSecondaryProviderKeyword= ruleSecondaryProviderKeyword EOF ;
    public final EObject entryRuleSecondaryProviderKeyword() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecondaryProviderKeyword = null;


        try {
            // InternalLibrettoProjectProfile.g:3985:65: (iv_ruleSecondaryProviderKeyword= ruleSecondaryProviderKeyword EOF )
            // InternalLibrettoProjectProfile.g:3986:2: iv_ruleSecondaryProviderKeyword= ruleSecondaryProviderKeyword EOF
            {
             newCompositeNode(grammarAccess.getSecondaryProviderKeywordRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSecondaryProviderKeyword=ruleSecondaryProviderKeyword();

            state._fsp--;

             current =iv_ruleSecondaryProviderKeyword; 
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
    // $ANTLR end "entryRuleSecondaryProviderKeyword"


    // $ANTLR start "ruleSecondaryProviderKeyword"
    // InternalLibrettoProjectProfile.g:3992:1: ruleSecondaryProviderKeyword returns [EObject current=null] : ( () ( (lv_keyword_1_0= 'secondary' ) ) ) ;
    public final EObject ruleSecondaryProviderKeyword() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_1_0=null;


        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:3998:2: ( ( () ( (lv_keyword_1_0= 'secondary' ) ) ) )
            // InternalLibrettoProjectProfile.g:3999:2: ( () ( (lv_keyword_1_0= 'secondary' ) ) )
            {
            // InternalLibrettoProjectProfile.g:3999:2: ( () ( (lv_keyword_1_0= 'secondary' ) ) )
            // InternalLibrettoProjectProfile.g:4000:3: () ( (lv_keyword_1_0= 'secondary' ) )
            {
            // InternalLibrettoProjectProfile.g:4000:3: ()
            // InternalLibrettoProjectProfile.g:4001:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSecondaryProviderKeywordAccess().getSecondaryProviderKeywordAction_0(),
            					current);
            			

            }

            // InternalLibrettoProjectProfile.g:4007:3: ( (lv_keyword_1_0= 'secondary' ) )
            // InternalLibrettoProjectProfile.g:4008:4: (lv_keyword_1_0= 'secondary' )
            {
            // InternalLibrettoProjectProfile.g:4008:4: (lv_keyword_1_0= 'secondary' )
            // InternalLibrettoProjectProfile.g:4009:5: lv_keyword_1_0= 'secondary'
            {
            lv_keyword_1_0=(Token)match(input,57,FOLLOW_2); 

            					newLeafNode(lv_keyword_1_0, grammarAccess.getSecondaryProviderKeywordAccess().getKeywordSecondaryKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSecondaryProviderKeywordRule());
            					}
            					setWithLastConsumed(current, "keyword", lv_keyword_1_0, "secondary");
            				

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
    // $ANTLR end "ruleSecondaryProviderKeyword"


    // $ANTLR start "entryRuleGenEscalationBlock"
    // InternalLibrettoProjectProfile.g:4025:1: entryRuleGenEscalationBlock returns [EObject current=null] : iv_ruleGenEscalationBlock= ruleGenEscalationBlock EOF ;
    public final EObject entryRuleGenEscalationBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenEscalationBlock = null;


        try {
            // InternalLibrettoProjectProfile.g:4025:59: (iv_ruleGenEscalationBlock= ruleGenEscalationBlock EOF )
            // InternalLibrettoProjectProfile.g:4026:2: iv_ruleGenEscalationBlock= ruleGenEscalationBlock EOF
            {
             newCompositeNode(grammarAccess.getGenEscalationBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGenEscalationBlock=ruleGenEscalationBlock();

            state._fsp--;

             current =iv_ruleGenEscalationBlock; 
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
    // $ANTLR end "entryRuleGenEscalationBlock"


    // $ANTLR start "ruleGenEscalationBlock"
    // InternalLibrettoProjectProfile.g:4032:1: ruleGenEscalationBlock returns [EObject current=null] : ( () ( (lv_keyword_1_0= ruleEscalationKeyword ) ) otherlv_2= '{' ( ( (lv_enableds_3_0= ruleEnabled ) ) | ( (lv_atRetries_4_0= ruleAtRetry ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleGenEscalationBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_keyword_1_0 = null;

        EObject lv_enableds_3_0 = null;

        EObject lv_atRetries_4_0 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:4038:2: ( ( () ( (lv_keyword_1_0= ruleEscalationKeyword ) ) otherlv_2= '{' ( ( (lv_enableds_3_0= ruleEnabled ) ) | ( (lv_atRetries_4_0= ruleAtRetry ) ) )* otherlv_5= '}' ) )
            // InternalLibrettoProjectProfile.g:4039:2: ( () ( (lv_keyword_1_0= ruleEscalationKeyword ) ) otherlv_2= '{' ( ( (lv_enableds_3_0= ruleEnabled ) ) | ( (lv_atRetries_4_0= ruleAtRetry ) ) )* otherlv_5= '}' )
            {
            // InternalLibrettoProjectProfile.g:4039:2: ( () ( (lv_keyword_1_0= ruleEscalationKeyword ) ) otherlv_2= '{' ( ( (lv_enableds_3_0= ruleEnabled ) ) | ( (lv_atRetries_4_0= ruleAtRetry ) ) )* otherlv_5= '}' )
            // InternalLibrettoProjectProfile.g:4040:3: () ( (lv_keyword_1_0= ruleEscalationKeyword ) ) otherlv_2= '{' ( ( (lv_enableds_3_0= ruleEnabled ) ) | ( (lv_atRetries_4_0= ruleAtRetry ) ) )* otherlv_5= '}'
            {
            // InternalLibrettoProjectProfile.g:4040:3: ()
            // InternalLibrettoProjectProfile.g:4041:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGenEscalationBlockAccess().getGenEscalationBlockAction_0(),
            					current);
            			

            }

            // InternalLibrettoProjectProfile.g:4047:3: ( (lv_keyword_1_0= ruleEscalationKeyword ) )
            // InternalLibrettoProjectProfile.g:4048:4: (lv_keyword_1_0= ruleEscalationKeyword )
            {
            // InternalLibrettoProjectProfile.g:4048:4: (lv_keyword_1_0= ruleEscalationKeyword )
            // InternalLibrettoProjectProfile.g:4049:5: lv_keyword_1_0= ruleEscalationKeyword
            {

            					newCompositeNode(grammarAccess.getGenEscalationBlockAccess().getKeywordEscalationKeywordParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_keyword_1_0=ruleEscalationKeyword();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGenEscalationBlockRule());
            					}
            					set(
            						current,
            						"keyword",
            						lv_keyword_1_0,
            						"com.robenglander.libretto.spec.LibrettoProjectProfile.EscalationKeyword");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,11,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getGenEscalationBlockAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLibrettoProjectProfile.g:4070:3: ( ( (lv_enableds_3_0= ruleEnabled ) ) | ( (lv_atRetries_4_0= ruleAtRetry ) ) )*
            loop27:
            do {
                int alt27=3;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==59) ) {
                    alt27=1;
                }
                else if ( ((LA27_0>=60 && LA27_0<=61)) ) {
                    alt27=2;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:4071:4: ( (lv_enableds_3_0= ruleEnabled ) )
            	    {
            	    // InternalLibrettoProjectProfile.g:4071:4: ( (lv_enableds_3_0= ruleEnabled ) )
            	    // InternalLibrettoProjectProfile.g:4072:5: (lv_enableds_3_0= ruleEnabled )
            	    {
            	    // InternalLibrettoProjectProfile.g:4072:5: (lv_enableds_3_0= ruleEnabled )
            	    // InternalLibrettoProjectProfile.g:4073:6: lv_enableds_3_0= ruleEnabled
            	    {

            	    						newCompositeNode(grammarAccess.getGenEscalationBlockAccess().getEnabledsEnabledParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_enableds_3_0=ruleEnabled();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGenEscalationBlockRule());
            	    						}
            	    						add(
            	    							current,
            	    							"enableds",
            	    							lv_enableds_3_0,
            	    							"com.robenglander.libretto.spec.LibrettoProjectProfile.Enabled");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalLibrettoProjectProfile.g:4091:4: ( (lv_atRetries_4_0= ruleAtRetry ) )
            	    {
            	    // InternalLibrettoProjectProfile.g:4091:4: ( (lv_atRetries_4_0= ruleAtRetry ) )
            	    // InternalLibrettoProjectProfile.g:4092:5: (lv_atRetries_4_0= ruleAtRetry )
            	    {
            	    // InternalLibrettoProjectProfile.g:4092:5: (lv_atRetries_4_0= ruleAtRetry )
            	    // InternalLibrettoProjectProfile.g:4093:6: lv_atRetries_4_0= ruleAtRetry
            	    {

            	    						newCompositeNode(grammarAccess.getGenEscalationBlockAccess().getAtRetriesAtRetryParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_atRetries_4_0=ruleAtRetry();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGenEscalationBlockRule());
            	    						}
            	    						add(
            	    							current,
            	    							"atRetries",
            	    							lv_atRetries_4_0,
            	    							"com.robenglander.libretto.spec.LibrettoProjectProfile.AtRetry");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            otherlv_5=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getGenEscalationBlockAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleGenEscalationBlock"


    // $ANTLR start "entryRuleEscalationKeyword"
    // InternalLibrettoProjectProfile.g:4119:1: entryRuleEscalationKeyword returns [EObject current=null] : iv_ruleEscalationKeyword= ruleEscalationKeyword EOF ;
    public final EObject entryRuleEscalationKeyword() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEscalationKeyword = null;


        try {
            // InternalLibrettoProjectProfile.g:4119:58: (iv_ruleEscalationKeyword= ruleEscalationKeyword EOF )
            // InternalLibrettoProjectProfile.g:4120:2: iv_ruleEscalationKeyword= ruleEscalationKeyword EOF
            {
             newCompositeNode(grammarAccess.getEscalationKeywordRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEscalationKeyword=ruleEscalationKeyword();

            state._fsp--;

             current =iv_ruleEscalationKeyword; 
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
    // $ANTLR end "entryRuleEscalationKeyword"


    // $ANTLR start "ruleEscalationKeyword"
    // InternalLibrettoProjectProfile.g:4126:1: ruleEscalationKeyword returns [EObject current=null] : ( () ( (lv_keyword_1_0= 'escalation' ) ) ) ;
    public final EObject ruleEscalationKeyword() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_1_0=null;


        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:4132:2: ( ( () ( (lv_keyword_1_0= 'escalation' ) ) ) )
            // InternalLibrettoProjectProfile.g:4133:2: ( () ( (lv_keyword_1_0= 'escalation' ) ) )
            {
            // InternalLibrettoProjectProfile.g:4133:2: ( () ( (lv_keyword_1_0= 'escalation' ) ) )
            // InternalLibrettoProjectProfile.g:4134:3: () ( (lv_keyword_1_0= 'escalation' ) )
            {
            // InternalLibrettoProjectProfile.g:4134:3: ()
            // InternalLibrettoProjectProfile.g:4135:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEscalationKeywordAccess().getEscalationKeywordAction_0(),
            					current);
            			

            }

            // InternalLibrettoProjectProfile.g:4141:3: ( (lv_keyword_1_0= 'escalation' ) )
            // InternalLibrettoProjectProfile.g:4142:4: (lv_keyword_1_0= 'escalation' )
            {
            // InternalLibrettoProjectProfile.g:4142:4: (lv_keyword_1_0= 'escalation' )
            // InternalLibrettoProjectProfile.g:4143:5: lv_keyword_1_0= 'escalation'
            {
            lv_keyword_1_0=(Token)match(input,58,FOLLOW_2); 

            					newLeafNode(lv_keyword_1_0, grammarAccess.getEscalationKeywordAccess().getKeywordEscalationKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEscalationKeywordRule());
            					}
            					setWithLastConsumed(current, "keyword", lv_keyword_1_0, "escalation");
            				

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
    // $ANTLR end "ruleEscalationKeyword"


    // $ANTLR start "entryRuleEnabled"
    // InternalLibrettoProjectProfile.g:4159:1: entryRuleEnabled returns [EObject current=null] : iv_ruleEnabled= ruleEnabled EOF ;
    public final EObject entryRuleEnabled() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnabled = null;


        try {
            // InternalLibrettoProjectProfile.g:4159:48: (iv_ruleEnabled= ruleEnabled EOF )
            // InternalLibrettoProjectProfile.g:4160:2: iv_ruleEnabled= ruleEnabled EOF
            {
             newCompositeNode(grammarAccess.getEnabledRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnabled=ruleEnabled();

            state._fsp--;

             current =iv_ruleEnabled; 
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
    // $ANTLR end "entryRuleEnabled"


    // $ANTLR start "ruleEnabled"
    // InternalLibrettoProjectProfile.g:4166:1: ruleEnabled returns [EObject current=null] : ( () ( (lv_keyword_1_0= ruleEnabledKeyword ) ) ( (lv_value_2_0= ruleTrueFalseKeyword ) ) ) ;
    public final EObject ruleEnabled() throws RecognitionException {
        EObject current = null;

        EObject lv_keyword_1_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:4172:2: ( ( () ( (lv_keyword_1_0= ruleEnabledKeyword ) ) ( (lv_value_2_0= ruleTrueFalseKeyword ) ) ) )
            // InternalLibrettoProjectProfile.g:4173:2: ( () ( (lv_keyword_1_0= ruleEnabledKeyword ) ) ( (lv_value_2_0= ruleTrueFalseKeyword ) ) )
            {
            // InternalLibrettoProjectProfile.g:4173:2: ( () ( (lv_keyword_1_0= ruleEnabledKeyword ) ) ( (lv_value_2_0= ruleTrueFalseKeyword ) ) )
            // InternalLibrettoProjectProfile.g:4174:3: () ( (lv_keyword_1_0= ruleEnabledKeyword ) ) ( (lv_value_2_0= ruleTrueFalseKeyword ) )
            {
            // InternalLibrettoProjectProfile.g:4174:3: ()
            // InternalLibrettoProjectProfile.g:4175:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnabledAccess().getEnabledAction_0(),
            					current);
            			

            }

            // InternalLibrettoProjectProfile.g:4181:3: ( (lv_keyword_1_0= ruleEnabledKeyword ) )
            // InternalLibrettoProjectProfile.g:4182:4: (lv_keyword_1_0= ruleEnabledKeyword )
            {
            // InternalLibrettoProjectProfile.g:4182:4: (lv_keyword_1_0= ruleEnabledKeyword )
            // InternalLibrettoProjectProfile.g:4183:5: lv_keyword_1_0= ruleEnabledKeyword
            {

            					newCompositeNode(grammarAccess.getEnabledAccess().getKeywordEnabledKeywordParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
            lv_keyword_1_0=ruleEnabledKeyword();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnabledRule());
            					}
            					set(
            						current,
            						"keyword",
            						lv_keyword_1_0,
            						"com.robenglander.libretto.spec.LibrettoProjectProfile.EnabledKeyword");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLibrettoProjectProfile.g:4200:3: ( (lv_value_2_0= ruleTrueFalseKeyword ) )
            // InternalLibrettoProjectProfile.g:4201:4: (lv_value_2_0= ruleTrueFalseKeyword )
            {
            // InternalLibrettoProjectProfile.g:4201:4: (lv_value_2_0= ruleTrueFalseKeyword )
            // InternalLibrettoProjectProfile.g:4202:5: lv_value_2_0= ruleTrueFalseKeyword
            {

            					newCompositeNode(grammarAccess.getEnabledAccess().getValueTrueFalseKeywordParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleTrueFalseKeyword();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnabledRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"com.robenglander.libretto.spec.LibrettoProjectProfile.TrueFalseKeyword");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleEnabled"


    // $ANTLR start "entryRuleEnabledKeyword"
    // InternalLibrettoProjectProfile.g:4223:1: entryRuleEnabledKeyword returns [EObject current=null] : iv_ruleEnabledKeyword= ruleEnabledKeyword EOF ;
    public final EObject entryRuleEnabledKeyword() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnabledKeyword = null;


        try {
            // InternalLibrettoProjectProfile.g:4223:55: (iv_ruleEnabledKeyword= ruleEnabledKeyword EOF )
            // InternalLibrettoProjectProfile.g:4224:2: iv_ruleEnabledKeyword= ruleEnabledKeyword EOF
            {
             newCompositeNode(grammarAccess.getEnabledKeywordRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnabledKeyword=ruleEnabledKeyword();

            state._fsp--;

             current =iv_ruleEnabledKeyword; 
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
    // $ANTLR end "entryRuleEnabledKeyword"


    // $ANTLR start "ruleEnabledKeyword"
    // InternalLibrettoProjectProfile.g:4230:1: ruleEnabledKeyword returns [EObject current=null] : ( () ( (lv_keyword_1_0= 'enabled' ) ) ) ;
    public final EObject ruleEnabledKeyword() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_1_0=null;


        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:4236:2: ( ( () ( (lv_keyword_1_0= 'enabled' ) ) ) )
            // InternalLibrettoProjectProfile.g:4237:2: ( () ( (lv_keyword_1_0= 'enabled' ) ) )
            {
            // InternalLibrettoProjectProfile.g:4237:2: ( () ( (lv_keyword_1_0= 'enabled' ) ) )
            // InternalLibrettoProjectProfile.g:4238:3: () ( (lv_keyword_1_0= 'enabled' ) )
            {
            // InternalLibrettoProjectProfile.g:4238:3: ()
            // InternalLibrettoProjectProfile.g:4239:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnabledKeywordAccess().getEnabledKeywordAction_0(),
            					current);
            			

            }

            // InternalLibrettoProjectProfile.g:4245:3: ( (lv_keyword_1_0= 'enabled' ) )
            // InternalLibrettoProjectProfile.g:4246:4: (lv_keyword_1_0= 'enabled' )
            {
            // InternalLibrettoProjectProfile.g:4246:4: (lv_keyword_1_0= 'enabled' )
            // InternalLibrettoProjectProfile.g:4247:5: lv_keyword_1_0= 'enabled'
            {
            lv_keyword_1_0=(Token)match(input,59,FOLLOW_2); 

            					newLeafNode(lv_keyword_1_0, grammarAccess.getEnabledKeywordAccess().getKeywordEnabledKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnabledKeywordRule());
            					}
            					setWithLastConsumed(current, "keyword", lv_keyword_1_0, "enabled");
            				

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
    // $ANTLR end "ruleEnabledKeyword"


    // $ANTLR start "entryRuleAtRetry"
    // InternalLibrettoProjectProfile.g:4263:1: entryRuleAtRetry returns [EObject current=null] : iv_ruleAtRetry= ruleAtRetry EOF ;
    public final EObject entryRuleAtRetry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtRetry = null;


        try {
            // InternalLibrettoProjectProfile.g:4263:48: (iv_ruleAtRetry= ruleAtRetry EOF )
            // InternalLibrettoProjectProfile.g:4264:2: iv_ruleAtRetry= ruleAtRetry EOF
            {
             newCompositeNode(grammarAccess.getAtRetryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtRetry=ruleAtRetry();

            state._fsp--;

             current =iv_ruleAtRetry; 
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
    // $ANTLR end "entryRuleAtRetry"


    // $ANTLR start "ruleAtRetry"
    // InternalLibrettoProjectProfile.g:4270:1: ruleAtRetry returns [EObject current=null] : ( () ( (lv_keyword_1_0= ruleAtRetryKeyword ) ) ( (lv_value_2_0= RULE_INT ) ) ) ;
    public final EObject ruleAtRetry() throws RecognitionException {
        EObject current = null;

        Token lv_value_2_0=null;
        EObject lv_keyword_1_0 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:4276:2: ( ( () ( (lv_keyword_1_0= ruleAtRetryKeyword ) ) ( (lv_value_2_0= RULE_INT ) ) ) )
            // InternalLibrettoProjectProfile.g:4277:2: ( () ( (lv_keyword_1_0= ruleAtRetryKeyword ) ) ( (lv_value_2_0= RULE_INT ) ) )
            {
            // InternalLibrettoProjectProfile.g:4277:2: ( () ( (lv_keyword_1_0= ruleAtRetryKeyword ) ) ( (lv_value_2_0= RULE_INT ) ) )
            // InternalLibrettoProjectProfile.g:4278:3: () ( (lv_keyword_1_0= ruleAtRetryKeyword ) ) ( (lv_value_2_0= RULE_INT ) )
            {
            // InternalLibrettoProjectProfile.g:4278:3: ()
            // InternalLibrettoProjectProfile.g:4279:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAtRetryAccess().getAtRetryAction_0(),
            					current);
            			

            }

            // InternalLibrettoProjectProfile.g:4285:3: ( (lv_keyword_1_0= ruleAtRetryKeyword ) )
            // InternalLibrettoProjectProfile.g:4286:4: (lv_keyword_1_0= ruleAtRetryKeyword )
            {
            // InternalLibrettoProjectProfile.g:4286:4: (lv_keyword_1_0= ruleAtRetryKeyword )
            // InternalLibrettoProjectProfile.g:4287:5: lv_keyword_1_0= ruleAtRetryKeyword
            {

            					newCompositeNode(grammarAccess.getAtRetryAccess().getKeywordAtRetryKeywordParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_keyword_1_0=ruleAtRetryKeyword();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAtRetryRule());
            					}
            					set(
            						current,
            						"keyword",
            						lv_keyword_1_0,
            						"com.robenglander.libretto.spec.LibrettoProjectProfile.AtRetryKeyword");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLibrettoProjectProfile.g:4304:3: ( (lv_value_2_0= RULE_INT ) )
            // InternalLibrettoProjectProfile.g:4305:4: (lv_value_2_0= RULE_INT )
            {
            // InternalLibrettoProjectProfile.g:4305:4: (lv_value_2_0= RULE_INT )
            // InternalLibrettoProjectProfile.g:4306:5: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getAtRetryAccess().getValueINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAtRetryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleAtRetry"


    // $ANTLR start "entryRuleAtRetryKeyword"
    // InternalLibrettoProjectProfile.g:4326:1: entryRuleAtRetryKeyword returns [EObject current=null] : iv_ruleAtRetryKeyword= ruleAtRetryKeyword EOF ;
    public final EObject entryRuleAtRetryKeyword() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtRetryKeyword = null;


        try {
            // InternalLibrettoProjectProfile.g:4326:55: (iv_ruleAtRetryKeyword= ruleAtRetryKeyword EOF )
            // InternalLibrettoProjectProfile.g:4327:2: iv_ruleAtRetryKeyword= ruleAtRetryKeyword EOF
            {
             newCompositeNode(grammarAccess.getAtRetryKeywordRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtRetryKeyword=ruleAtRetryKeyword();

            state._fsp--;

             current =iv_ruleAtRetryKeyword; 
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
    // $ANTLR end "entryRuleAtRetryKeyword"


    // $ANTLR start "ruleAtRetryKeyword"
    // InternalLibrettoProjectProfile.g:4333:1: ruleAtRetryKeyword returns [EObject current=null] : ( () ( ( (lv_keyword_1_1= 'atretry' | lv_keyword_1_2= 'atRetry' ) ) ) ) ;
    public final EObject ruleAtRetryKeyword() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_1_1=null;
        Token lv_keyword_1_2=null;


        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:4339:2: ( ( () ( ( (lv_keyword_1_1= 'atretry' | lv_keyword_1_2= 'atRetry' ) ) ) ) )
            // InternalLibrettoProjectProfile.g:4340:2: ( () ( ( (lv_keyword_1_1= 'atretry' | lv_keyword_1_2= 'atRetry' ) ) ) )
            {
            // InternalLibrettoProjectProfile.g:4340:2: ( () ( ( (lv_keyword_1_1= 'atretry' | lv_keyword_1_2= 'atRetry' ) ) ) )
            // InternalLibrettoProjectProfile.g:4341:3: () ( ( (lv_keyword_1_1= 'atretry' | lv_keyword_1_2= 'atRetry' ) ) )
            {
            // InternalLibrettoProjectProfile.g:4341:3: ()
            // InternalLibrettoProjectProfile.g:4342:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAtRetryKeywordAccess().getAtRetryKeywordAction_0(),
            					current);
            			

            }

            // InternalLibrettoProjectProfile.g:4348:3: ( ( (lv_keyword_1_1= 'atretry' | lv_keyword_1_2= 'atRetry' ) ) )
            // InternalLibrettoProjectProfile.g:4349:4: ( (lv_keyword_1_1= 'atretry' | lv_keyword_1_2= 'atRetry' ) )
            {
            // InternalLibrettoProjectProfile.g:4349:4: ( (lv_keyword_1_1= 'atretry' | lv_keyword_1_2= 'atRetry' ) )
            // InternalLibrettoProjectProfile.g:4350:5: (lv_keyword_1_1= 'atretry' | lv_keyword_1_2= 'atRetry' )
            {
            // InternalLibrettoProjectProfile.g:4350:5: (lv_keyword_1_1= 'atretry' | lv_keyword_1_2= 'atRetry' )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==60) ) {
                alt28=1;
            }
            else if ( (LA28_0==61) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:4351:6: lv_keyword_1_1= 'atretry'
                    {
                    lv_keyword_1_1=(Token)match(input,60,FOLLOW_2); 

                    						newLeafNode(lv_keyword_1_1, grammarAccess.getAtRetryKeywordAccess().getKeywordAtretryKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtRetryKeywordRule());
                    						}
                    						setWithLastConsumed(current, "keyword", lv_keyword_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalLibrettoProjectProfile.g:4362:6: lv_keyword_1_2= 'atRetry'
                    {
                    lv_keyword_1_2=(Token)match(input,61,FOLLOW_2); 

                    						newLeafNode(lv_keyword_1_2, grammarAccess.getAtRetryKeywordAccess().getKeywordAtRetryKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtRetryKeywordRule());
                    						}
                    						setWithLastConsumed(current, "keyword", lv_keyword_1_2, null);
                    					

                    }
                    break;

            }


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
    // $ANTLR end "ruleAtRetryKeyword"


    // $ANTLR start "entryRuleSurfaceBlock"
    // InternalLibrettoProjectProfile.g:4379:1: entryRuleSurfaceBlock returns [EObject current=null] : iv_ruleSurfaceBlock= ruleSurfaceBlock EOF ;
    public final EObject entryRuleSurfaceBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSurfaceBlock = null;


        try {
            // InternalLibrettoProjectProfile.g:4379:53: (iv_ruleSurfaceBlock= ruleSurfaceBlock EOF )
            // InternalLibrettoProjectProfile.g:4380:2: iv_ruleSurfaceBlock= ruleSurfaceBlock EOF
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
    // InternalLibrettoProjectProfile.g:4386:1: ruleSurfaceBlock returns [EObject current=null] : ( () otherlv_1= 'surface' otherlv_2= '{' ( (lv_elements_3_0= ruleSurfaceElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleSurfaceBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:4392:2: ( ( () otherlv_1= 'surface' otherlv_2= '{' ( (lv_elements_3_0= ruleSurfaceElement ) )* otherlv_4= '}' ) )
            // InternalLibrettoProjectProfile.g:4393:2: ( () otherlv_1= 'surface' otherlv_2= '{' ( (lv_elements_3_0= ruleSurfaceElement ) )* otherlv_4= '}' )
            {
            // InternalLibrettoProjectProfile.g:4393:2: ( () otherlv_1= 'surface' otherlv_2= '{' ( (lv_elements_3_0= ruleSurfaceElement ) )* otherlv_4= '}' )
            // InternalLibrettoProjectProfile.g:4394:3: () otherlv_1= 'surface' otherlv_2= '{' ( (lv_elements_3_0= ruleSurfaceElement ) )* otherlv_4= '}'
            {
            // InternalLibrettoProjectProfile.g:4394:3: ()
            // InternalLibrettoProjectProfile.g:4395:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSurfaceBlockAccess().getSurfaceBlockAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,62,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getSurfaceBlockAccess().getSurfaceKeyword_1());
            		
            otherlv_2=(Token)match(input,11,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getSurfaceBlockAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLibrettoProjectProfile.g:4409:3: ( (lv_elements_3_0= ruleSurfaceElement ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==63||LA29_0==65||LA29_0==69||LA29_0==71||LA29_0==73) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:4410:4: (lv_elements_3_0= ruleSurfaceElement )
            	    {
            	    // InternalLibrettoProjectProfile.g:4410:4: (lv_elements_3_0= ruleSurfaceElement )
            	    // InternalLibrettoProjectProfile.g:4411:5: lv_elements_3_0= ruleSurfaceElement
            	    {

            	    					newCompositeNode(grammarAccess.getSurfaceBlockAccess().getElementsSurfaceElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_elements_3_0=ruleSurfaceElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSurfaceBlockRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_3_0,
            	    						"com.robenglander.libretto.spec.LibrettoProjectProfile.SurfaceElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            otherlv_4=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSurfaceBlockAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalLibrettoProjectProfile.g:4436:1: entryRuleSurfaceElement returns [EObject current=null] : iv_ruleSurfaceElement= ruleSurfaceElement EOF ;
    public final EObject entryRuleSurfaceElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSurfaceElement = null;


        try {
            // InternalLibrettoProjectProfile.g:4436:55: (iv_ruleSurfaceElement= ruleSurfaceElement EOF )
            // InternalLibrettoProjectProfile.g:4437:2: iv_ruleSurfaceElement= ruleSurfaceElement EOF
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
    // InternalLibrettoProjectProfile.g:4443:1: ruleSurfaceElement returns [EObject current=null] : (this_ScopedSurface_0= ruleScopedSurface | this_SurfaceRule_1= ruleSurfaceRule ) ;
    public final EObject ruleSurfaceElement() throws RecognitionException {
        EObject current = null;

        EObject this_ScopedSurface_0 = null;

        EObject this_SurfaceRule_1 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:4449:2: ( (this_ScopedSurface_0= ruleScopedSurface | this_SurfaceRule_1= ruleSurfaceRule ) )
            // InternalLibrettoProjectProfile.g:4450:2: (this_ScopedSurface_0= ruleScopedSurface | this_SurfaceRule_1= ruleSurfaceRule )
            {
            // InternalLibrettoProjectProfile.g:4450:2: (this_ScopedSurface_0= ruleScopedSurface | this_SurfaceRule_1= ruleSurfaceRule )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==63) ) {
                alt30=1;
            }
            else if ( (LA30_0==65||LA30_0==69||LA30_0==71||LA30_0==73) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:4451:3: this_ScopedSurface_0= ruleScopedSurface
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
                    // InternalLibrettoProjectProfile.g:4460:3: this_SurfaceRule_1= ruleSurfaceRule
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
    // InternalLibrettoProjectProfile.g:4472:1: entryRuleScopedSurface returns [EObject current=null] : iv_ruleScopedSurface= ruleScopedSurface EOF ;
    public final EObject entryRuleScopedSurface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScopedSurface = null;


        try {
            // InternalLibrettoProjectProfile.g:4472:54: (iv_ruleScopedSurface= ruleScopedSurface EOF )
            // InternalLibrettoProjectProfile.g:4473:2: iv_ruleScopedSurface= ruleScopedSurface EOF
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
    // InternalLibrettoProjectProfile.g:4479:1: ruleScopedSurface returns [EObject current=null] : (otherlv_0= 'for' ( (otherlv_1= 'module' ( (lv_moduleId_2_0= RULE_STRING ) ) ) | (otherlv_3= 'spec' ( (lv_specId_4_0= RULE_STRING ) ) ) ) otherlv_5= '{' ( (lv_rules_6_0= ruleSurfaceRule ) )* otherlv_7= '}' ) ;
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
            // InternalLibrettoProjectProfile.g:4485:2: ( (otherlv_0= 'for' ( (otherlv_1= 'module' ( (lv_moduleId_2_0= RULE_STRING ) ) ) | (otherlv_3= 'spec' ( (lv_specId_4_0= RULE_STRING ) ) ) ) otherlv_5= '{' ( (lv_rules_6_0= ruleSurfaceRule ) )* otherlv_7= '}' ) )
            // InternalLibrettoProjectProfile.g:4486:2: (otherlv_0= 'for' ( (otherlv_1= 'module' ( (lv_moduleId_2_0= RULE_STRING ) ) ) | (otherlv_3= 'spec' ( (lv_specId_4_0= RULE_STRING ) ) ) ) otherlv_5= '{' ( (lv_rules_6_0= ruleSurfaceRule ) )* otherlv_7= '}' )
            {
            // InternalLibrettoProjectProfile.g:4486:2: (otherlv_0= 'for' ( (otherlv_1= 'module' ( (lv_moduleId_2_0= RULE_STRING ) ) ) | (otherlv_3= 'spec' ( (lv_specId_4_0= RULE_STRING ) ) ) ) otherlv_5= '{' ( (lv_rules_6_0= ruleSurfaceRule ) )* otherlv_7= '}' )
            // InternalLibrettoProjectProfile.g:4487:3: otherlv_0= 'for' ( (otherlv_1= 'module' ( (lv_moduleId_2_0= RULE_STRING ) ) ) | (otherlv_3= 'spec' ( (lv_specId_4_0= RULE_STRING ) ) ) ) otherlv_5= '{' ( (lv_rules_6_0= ruleSurfaceRule ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,63,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getScopedSurfaceAccess().getForKeyword_0());
            		
            // InternalLibrettoProjectProfile.g:4491:3: ( (otherlv_1= 'module' ( (lv_moduleId_2_0= RULE_STRING ) ) ) | (otherlv_3= 'spec' ( (lv_specId_4_0= RULE_STRING ) ) ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==18) ) {
                alt31=1;
            }
            else if ( (LA31_0==64) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:4492:4: (otherlv_1= 'module' ( (lv_moduleId_2_0= RULE_STRING ) ) )
                    {
                    // InternalLibrettoProjectProfile.g:4492:4: (otherlv_1= 'module' ( (lv_moduleId_2_0= RULE_STRING ) ) )
                    // InternalLibrettoProjectProfile.g:4493:5: otherlv_1= 'module' ( (lv_moduleId_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_8); 

                    					newLeafNode(otherlv_1, grammarAccess.getScopedSurfaceAccess().getModuleKeyword_1_0_0());
                    				
                    // InternalLibrettoProjectProfile.g:4497:5: ( (lv_moduleId_2_0= RULE_STRING ) )
                    // InternalLibrettoProjectProfile.g:4498:6: (lv_moduleId_2_0= RULE_STRING )
                    {
                    // InternalLibrettoProjectProfile.g:4498:6: (lv_moduleId_2_0= RULE_STRING )
                    // InternalLibrettoProjectProfile.g:4499:7: lv_moduleId_2_0= RULE_STRING
                    {
                    lv_moduleId_2_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

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
                    // InternalLibrettoProjectProfile.g:4517:4: (otherlv_3= 'spec' ( (lv_specId_4_0= RULE_STRING ) ) )
                    {
                    // InternalLibrettoProjectProfile.g:4517:4: (otherlv_3= 'spec' ( (lv_specId_4_0= RULE_STRING ) ) )
                    // InternalLibrettoProjectProfile.g:4518:5: otherlv_3= 'spec' ( (lv_specId_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,64,FOLLOW_8); 

                    					newLeafNode(otherlv_3, grammarAccess.getScopedSurfaceAccess().getSpecKeyword_1_1_0());
                    				
                    // InternalLibrettoProjectProfile.g:4522:5: ( (lv_specId_4_0= RULE_STRING ) )
                    // InternalLibrettoProjectProfile.g:4523:6: (lv_specId_4_0= RULE_STRING )
                    {
                    // InternalLibrettoProjectProfile.g:4523:6: (lv_specId_4_0= RULE_STRING )
                    // InternalLibrettoProjectProfile.g:4524:7: lv_specId_4_0= RULE_STRING
                    {
                    lv_specId_4_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

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

            otherlv_5=(Token)match(input,11,FOLLOW_20); 

            			newLeafNode(otherlv_5, grammarAccess.getScopedSurfaceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLibrettoProjectProfile.g:4546:3: ( (lv_rules_6_0= ruleSurfaceRule ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==65||LA32_0==69||LA32_0==71||LA32_0==73) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:4547:4: (lv_rules_6_0= ruleSurfaceRule )
            	    {
            	    // InternalLibrettoProjectProfile.g:4547:4: (lv_rules_6_0= ruleSurfaceRule )
            	    // InternalLibrettoProjectProfile.g:4548:5: lv_rules_6_0= ruleSurfaceRule
            	    {

            	    					newCompositeNode(grammarAccess.getScopedSurfaceAccess().getRulesSurfaceRuleParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_20);
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
            	    break loop32;
                }
            } while (true);

            otherlv_7=(Token)match(input,12,FOLLOW_2); 

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
    // InternalLibrettoProjectProfile.g:4573:1: entryRuleSurfaceRule returns [EObject current=null] : iv_ruleSurfaceRule= ruleSurfaceRule EOF ;
    public final EObject entryRuleSurfaceRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSurfaceRule = null;


        try {
            // InternalLibrettoProjectProfile.g:4573:52: (iv_ruleSurfaceRule= ruleSurfaceRule EOF )
            // InternalLibrettoProjectProfile.g:4574:2: iv_ruleSurfaceRule= ruleSurfaceRule EOF
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
    // InternalLibrettoProjectProfile.g:4580:1: ruleSurfaceRule returns [EObject current=null] : (this_ReturnTypeRule_0= ruleReturnTypeRule | this_ParamTypeRule_1= ruleParamTypeRule | this_RecordSelfReturnRule_2= ruleRecordSelfReturnRule | this_MethodOverrideRule_3= ruleMethodOverrideRule ) ;
    public final EObject ruleSurfaceRule() throws RecognitionException {
        EObject current = null;

        EObject this_ReturnTypeRule_0 = null;

        EObject this_ParamTypeRule_1 = null;

        EObject this_RecordSelfReturnRule_2 = null;

        EObject this_MethodOverrideRule_3 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:4586:2: ( (this_ReturnTypeRule_0= ruleReturnTypeRule | this_ParamTypeRule_1= ruleParamTypeRule | this_RecordSelfReturnRule_2= ruleRecordSelfReturnRule | this_MethodOverrideRule_3= ruleMethodOverrideRule ) )
            // InternalLibrettoProjectProfile.g:4587:2: (this_ReturnTypeRule_0= ruleReturnTypeRule | this_ParamTypeRule_1= ruleParamTypeRule | this_RecordSelfReturnRule_2= ruleRecordSelfReturnRule | this_MethodOverrideRule_3= ruleMethodOverrideRule )
            {
            // InternalLibrettoProjectProfile.g:4587:2: (this_ReturnTypeRule_0= ruleReturnTypeRule | this_ParamTypeRule_1= ruleParamTypeRule | this_RecordSelfReturnRule_2= ruleRecordSelfReturnRule | this_MethodOverrideRule_3= ruleMethodOverrideRule )
            int alt33=4;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt33=1;
                }
                break;
            case 69:
                {
                alt33=2;
                }
                break;
            case 71:
                {
                alt33=3;
                }
                break;
            case 73:
                {
                alt33=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:4588:3: this_ReturnTypeRule_0= ruleReturnTypeRule
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
                    // InternalLibrettoProjectProfile.g:4597:3: this_ParamTypeRule_1= ruleParamTypeRule
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
                    // InternalLibrettoProjectProfile.g:4606:3: this_RecordSelfReturnRule_2= ruleRecordSelfReturnRule
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
                    // InternalLibrettoProjectProfile.g:4615:3: this_MethodOverrideRule_3= ruleMethodOverrideRule
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
    // InternalLibrettoProjectProfile.g:4627:1: entryRuleReturnTypeRule returns [EObject current=null] : iv_ruleReturnTypeRule= ruleReturnTypeRule EOF ;
    public final EObject entryRuleReturnTypeRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnTypeRule = null;


        try {
            // InternalLibrettoProjectProfile.g:4627:55: (iv_ruleReturnTypeRule= ruleReturnTypeRule EOF )
            // InternalLibrettoProjectProfile.g:4628:2: iv_ruleReturnTypeRule= ruleReturnTypeRule EOF
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
    // InternalLibrettoProjectProfile.g:4634:1: ruleReturnTypeRule returns [EObject current=null] : (otherlv_0= 'returnType' otherlv_1= 'method' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_javaType_4_0= ruleJavaType ) ) (otherlv_5= ';' )? ) ;
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
            // InternalLibrettoProjectProfile.g:4640:2: ( (otherlv_0= 'returnType' otherlv_1= 'method' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_javaType_4_0= ruleJavaType ) ) (otherlv_5= ';' )? ) )
            // InternalLibrettoProjectProfile.g:4641:2: (otherlv_0= 'returnType' otherlv_1= 'method' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_javaType_4_0= ruleJavaType ) ) (otherlv_5= ';' )? )
            {
            // InternalLibrettoProjectProfile.g:4641:2: (otherlv_0= 'returnType' otherlv_1= 'method' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_javaType_4_0= ruleJavaType ) ) (otherlv_5= ';' )? )
            // InternalLibrettoProjectProfile.g:4642:3: otherlv_0= 'returnType' otherlv_1= 'method' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_javaType_4_0= ruleJavaType ) ) (otherlv_5= ';' )?
            {
            otherlv_0=(Token)match(input,65,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getReturnTypeRuleAccess().getReturnTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,66,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getReturnTypeRuleAccess().getMethodKeyword_1());
            		
            // InternalLibrettoProjectProfile.g:4650:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalLibrettoProjectProfile.g:4651:4: (lv_name_2_0= RULE_ID )
            {
            // InternalLibrettoProjectProfile.g:4651:4: (lv_name_2_0= RULE_ID )
            // InternalLibrettoProjectProfile.g:4652:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_23); 

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

            otherlv_3=(Token)match(input,67,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getReturnTypeRuleAccess().getAsKeyword_3());
            		
            // InternalLibrettoProjectProfile.g:4672:3: ( (lv_javaType_4_0= ruleJavaType ) )
            // InternalLibrettoProjectProfile.g:4673:4: (lv_javaType_4_0= ruleJavaType )
            {
            // InternalLibrettoProjectProfile.g:4673:4: (lv_javaType_4_0= ruleJavaType )
            // InternalLibrettoProjectProfile.g:4674:5: lv_javaType_4_0= ruleJavaType
            {

            					newCompositeNode(grammarAccess.getReturnTypeRuleAccess().getJavaTypeJavaTypeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_25);
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

            // InternalLibrettoProjectProfile.g:4691:3: (otherlv_5= ';' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==68) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:4692:4: otherlv_5= ';'
                    {
                    otherlv_5=(Token)match(input,68,FOLLOW_2); 

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
    // InternalLibrettoProjectProfile.g:4701:1: entryRuleParamTypeRule returns [EObject current=null] : iv_ruleParamTypeRule= ruleParamTypeRule EOF ;
    public final EObject entryRuleParamTypeRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamTypeRule = null;


        try {
            // InternalLibrettoProjectProfile.g:4701:54: (iv_ruleParamTypeRule= ruleParamTypeRule EOF )
            // InternalLibrettoProjectProfile.g:4702:2: iv_ruleParamTypeRule= ruleParamTypeRule EOF
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
    // InternalLibrettoProjectProfile.g:4708:1: ruleParamTypeRule returns [EObject current=null] : (otherlv_0= 'paramType' otherlv_1= 'name' ( (lv_paramName_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_javaType_4_0= ruleJavaType ) ) (otherlv_5= ';' )? ) ;
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
            // InternalLibrettoProjectProfile.g:4714:2: ( (otherlv_0= 'paramType' otherlv_1= 'name' ( (lv_paramName_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_javaType_4_0= ruleJavaType ) ) (otherlv_5= ';' )? ) )
            // InternalLibrettoProjectProfile.g:4715:2: (otherlv_0= 'paramType' otherlv_1= 'name' ( (lv_paramName_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_javaType_4_0= ruleJavaType ) ) (otherlv_5= ';' )? )
            {
            // InternalLibrettoProjectProfile.g:4715:2: (otherlv_0= 'paramType' otherlv_1= 'name' ( (lv_paramName_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_javaType_4_0= ruleJavaType ) ) (otherlv_5= ';' )? )
            // InternalLibrettoProjectProfile.g:4716:3: otherlv_0= 'paramType' otherlv_1= 'name' ( (lv_paramName_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_javaType_4_0= ruleJavaType ) ) (otherlv_5= ';' )?
            {
            otherlv_0=(Token)match(input,69,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getParamTypeRuleAccess().getParamTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,70,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getParamTypeRuleAccess().getNameKeyword_1());
            		
            // InternalLibrettoProjectProfile.g:4724:3: ( (lv_paramName_2_0= RULE_ID ) )
            // InternalLibrettoProjectProfile.g:4725:4: (lv_paramName_2_0= RULE_ID )
            {
            // InternalLibrettoProjectProfile.g:4725:4: (lv_paramName_2_0= RULE_ID )
            // InternalLibrettoProjectProfile.g:4726:5: lv_paramName_2_0= RULE_ID
            {
            lv_paramName_2_0=(Token)match(input,RULE_ID,FOLLOW_23); 

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

            otherlv_3=(Token)match(input,67,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getParamTypeRuleAccess().getAsKeyword_3());
            		
            // InternalLibrettoProjectProfile.g:4746:3: ( (lv_javaType_4_0= ruleJavaType ) )
            // InternalLibrettoProjectProfile.g:4747:4: (lv_javaType_4_0= ruleJavaType )
            {
            // InternalLibrettoProjectProfile.g:4747:4: (lv_javaType_4_0= ruleJavaType )
            // InternalLibrettoProjectProfile.g:4748:5: lv_javaType_4_0= ruleJavaType
            {

            					newCompositeNode(grammarAccess.getParamTypeRuleAccess().getJavaTypeJavaTypeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_25);
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

            // InternalLibrettoProjectProfile.g:4765:3: (otherlv_5= ';' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==68) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:4766:4: otherlv_5= ';'
                    {
                    otherlv_5=(Token)match(input,68,FOLLOW_2); 

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
    // InternalLibrettoProjectProfile.g:4775:1: entryRuleRecordSelfReturnRule returns [EObject current=null] : iv_ruleRecordSelfReturnRule= ruleRecordSelfReturnRule EOF ;
    public final EObject entryRuleRecordSelfReturnRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecordSelfReturnRule = null;


        try {
            // InternalLibrettoProjectProfile.g:4775:61: (iv_ruleRecordSelfReturnRule= ruleRecordSelfReturnRule EOF )
            // InternalLibrettoProjectProfile.g:4776:2: iv_ruleRecordSelfReturnRule= ruleRecordSelfReturnRule EOF
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
    // InternalLibrettoProjectProfile.g:4782:1: ruleRecordSelfReturnRule returns [EObject current=null] : (otherlv_0= 'recordSelfReturn' ( (lv_methods_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_methods_3_0= RULE_ID ) ) )* (otherlv_4= ';' )? ) ;
    public final EObject ruleRecordSelfReturnRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_methods_1_0=null;
        Token otherlv_2=null;
        Token lv_methods_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:4788:2: ( (otherlv_0= 'recordSelfReturn' ( (lv_methods_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_methods_3_0= RULE_ID ) ) )* (otherlv_4= ';' )? ) )
            // InternalLibrettoProjectProfile.g:4789:2: (otherlv_0= 'recordSelfReturn' ( (lv_methods_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_methods_3_0= RULE_ID ) ) )* (otherlv_4= ';' )? )
            {
            // InternalLibrettoProjectProfile.g:4789:2: (otherlv_0= 'recordSelfReturn' ( (lv_methods_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_methods_3_0= RULE_ID ) ) )* (otherlv_4= ';' )? )
            // InternalLibrettoProjectProfile.g:4790:3: otherlv_0= 'recordSelfReturn' ( (lv_methods_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_methods_3_0= RULE_ID ) ) )* (otherlv_4= ';' )?
            {
            otherlv_0=(Token)match(input,71,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRecordSelfReturnRuleAccess().getRecordSelfReturnKeyword_0());
            		
            // InternalLibrettoProjectProfile.g:4794:3: ( (lv_methods_1_0= RULE_ID ) )
            // InternalLibrettoProjectProfile.g:4795:4: (lv_methods_1_0= RULE_ID )
            {
            // InternalLibrettoProjectProfile.g:4795:4: (lv_methods_1_0= RULE_ID )
            // InternalLibrettoProjectProfile.g:4796:5: lv_methods_1_0= RULE_ID
            {
            lv_methods_1_0=(Token)match(input,RULE_ID,FOLLOW_27); 

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

            // InternalLibrettoProjectProfile.g:4812:3: (otherlv_2= ',' ( (lv_methods_3_0= RULE_ID ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==72) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:4813:4: otherlv_2= ',' ( (lv_methods_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,72,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getRecordSelfReturnRuleAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalLibrettoProjectProfile.g:4817:4: ( (lv_methods_3_0= RULE_ID ) )
            	    // InternalLibrettoProjectProfile.g:4818:5: (lv_methods_3_0= RULE_ID )
            	    {
            	    // InternalLibrettoProjectProfile.g:4818:5: (lv_methods_3_0= RULE_ID )
            	    // InternalLibrettoProjectProfile.g:4819:6: lv_methods_3_0= RULE_ID
            	    {
            	    lv_methods_3_0=(Token)match(input,RULE_ID,FOLLOW_27); 

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
            	    break loop36;
                }
            } while (true);

            // InternalLibrettoProjectProfile.g:4836:3: (otherlv_4= ';' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==68) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:4837:4: otherlv_4= ';'
                    {
                    otherlv_4=(Token)match(input,68,FOLLOW_2); 

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
    // InternalLibrettoProjectProfile.g:4846:1: entryRuleMethodOverrideRule returns [EObject current=null] : iv_ruleMethodOverrideRule= ruleMethodOverrideRule EOF ;
    public final EObject entryRuleMethodOverrideRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodOverrideRule = null;


        try {
            // InternalLibrettoProjectProfile.g:4846:59: (iv_ruleMethodOverrideRule= ruleMethodOverrideRule EOF )
            // InternalLibrettoProjectProfile.g:4847:2: iv_ruleMethodOverrideRule= ruleMethodOverrideRule EOF
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
    // InternalLibrettoProjectProfile.g:4853:1: ruleMethodOverrideRule returns [EObject current=null] : (otherlv_0= 'methodOverride' ( (lv_signature_1_0= ruleOperationSignature ) ) otherlv_2= 'returns' ( (lv_javaType_3_0= ruleJavaType ) ) (otherlv_4= ';' )? ) ;
    public final EObject ruleMethodOverrideRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_signature_1_0 = null;

        EObject lv_javaType_3_0 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:4859:2: ( (otherlv_0= 'methodOverride' ( (lv_signature_1_0= ruleOperationSignature ) ) otherlv_2= 'returns' ( (lv_javaType_3_0= ruleJavaType ) ) (otherlv_4= ';' )? ) )
            // InternalLibrettoProjectProfile.g:4860:2: (otherlv_0= 'methodOverride' ( (lv_signature_1_0= ruleOperationSignature ) ) otherlv_2= 'returns' ( (lv_javaType_3_0= ruleJavaType ) ) (otherlv_4= ';' )? )
            {
            // InternalLibrettoProjectProfile.g:4860:2: (otherlv_0= 'methodOverride' ( (lv_signature_1_0= ruleOperationSignature ) ) otherlv_2= 'returns' ( (lv_javaType_3_0= ruleJavaType ) ) (otherlv_4= ';' )? )
            // InternalLibrettoProjectProfile.g:4861:3: otherlv_0= 'methodOverride' ( (lv_signature_1_0= ruleOperationSignature ) ) otherlv_2= 'returns' ( (lv_javaType_3_0= ruleJavaType ) ) (otherlv_4= ';' )?
            {
            otherlv_0=(Token)match(input,73,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMethodOverrideRuleAccess().getMethodOverrideKeyword_0());
            		
            // InternalLibrettoProjectProfile.g:4865:3: ( (lv_signature_1_0= ruleOperationSignature ) )
            // InternalLibrettoProjectProfile.g:4866:4: (lv_signature_1_0= ruleOperationSignature )
            {
            // InternalLibrettoProjectProfile.g:4866:4: (lv_signature_1_0= ruleOperationSignature )
            // InternalLibrettoProjectProfile.g:4867:5: lv_signature_1_0= ruleOperationSignature
            {

            					newCompositeNode(grammarAccess.getMethodOverrideRuleAccess().getSignatureOperationSignatureParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_28);
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

            otherlv_2=(Token)match(input,74,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getMethodOverrideRuleAccess().getReturnsKeyword_2());
            		
            // InternalLibrettoProjectProfile.g:4888:3: ( (lv_javaType_3_0= ruleJavaType ) )
            // InternalLibrettoProjectProfile.g:4889:4: (lv_javaType_3_0= ruleJavaType )
            {
            // InternalLibrettoProjectProfile.g:4889:4: (lv_javaType_3_0= ruleJavaType )
            // InternalLibrettoProjectProfile.g:4890:5: lv_javaType_3_0= ruleJavaType
            {

            					newCompositeNode(grammarAccess.getMethodOverrideRuleAccess().getJavaTypeJavaTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_25);
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

            // InternalLibrettoProjectProfile.g:4907:3: (otherlv_4= ';' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==68) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:4908:4: otherlv_4= ';'
                    {
                    otherlv_4=(Token)match(input,68,FOLLOW_2); 

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
    // InternalLibrettoProjectProfile.g:4917:1: entryRuleJavaType returns [EObject current=null] : iv_ruleJavaType= ruleJavaType EOF ;
    public final EObject entryRuleJavaType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJavaType = null;


        try {
            // InternalLibrettoProjectProfile.g:4917:49: (iv_ruleJavaType= ruleJavaType EOF )
            // InternalLibrettoProjectProfile.g:4918:2: iv_ruleJavaType= ruleJavaType EOF
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
    // InternalLibrettoProjectProfile.g:4924:1: ruleJavaType returns [EObject current=null] : (this_PrimitiveType_0= rulePrimitiveType | this_QualifiedName_1= ruleQualifiedName ) ;
    public final EObject ruleJavaType() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveType_0 = null;

        EObject this_QualifiedName_1 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:4930:2: ( (this_PrimitiveType_0= rulePrimitiveType | this_QualifiedName_1= ruleQualifiedName ) )
            // InternalLibrettoProjectProfile.g:4931:2: (this_PrimitiveType_0= rulePrimitiveType | this_QualifiedName_1= ruleQualifiedName )
            {
            // InternalLibrettoProjectProfile.g:4931:2: (this_PrimitiveType_0= rulePrimitiveType | this_QualifiedName_1= ruleQualifiedName )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=76 && LA39_0<=84)) ) {
                alt39=1;
            }
            else if ( (LA39_0==RULE_ID) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:4932:3: this_PrimitiveType_0= rulePrimitiveType
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
                    // InternalLibrettoProjectProfile.g:4941:3: this_QualifiedName_1= ruleQualifiedName
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
    // InternalLibrettoProjectProfile.g:4953:1: entryRuleQualifiedName returns [EObject current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final EObject entryRuleQualifiedName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedName = null;


        try {
            // InternalLibrettoProjectProfile.g:4953:54: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalLibrettoProjectProfile.g:4954:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalLibrettoProjectProfile.g:4960:1: ruleQualifiedName returns [EObject current=null] : ( ( (lv_segments_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_segments_2_0= RULE_ID ) ) )* ) ;
    public final EObject ruleQualifiedName() throws RecognitionException {
        EObject current = null;

        Token lv_segments_0_0=null;
        Token otherlv_1=null;
        Token lv_segments_2_0=null;


        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:4966:2: ( ( ( (lv_segments_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_segments_2_0= RULE_ID ) ) )* ) )
            // InternalLibrettoProjectProfile.g:4967:2: ( ( (lv_segments_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_segments_2_0= RULE_ID ) ) )* )
            {
            // InternalLibrettoProjectProfile.g:4967:2: ( ( (lv_segments_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_segments_2_0= RULE_ID ) ) )* )
            // InternalLibrettoProjectProfile.g:4968:3: ( (lv_segments_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_segments_2_0= RULE_ID ) ) )*
            {
            // InternalLibrettoProjectProfile.g:4968:3: ( (lv_segments_0_0= RULE_ID ) )
            // InternalLibrettoProjectProfile.g:4969:4: (lv_segments_0_0= RULE_ID )
            {
            // InternalLibrettoProjectProfile.g:4969:4: (lv_segments_0_0= RULE_ID )
            // InternalLibrettoProjectProfile.g:4970:5: lv_segments_0_0= RULE_ID
            {
            lv_segments_0_0=(Token)match(input,RULE_ID,FOLLOW_29); 

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

            // InternalLibrettoProjectProfile.g:4986:3: (otherlv_1= '.' ( (lv_segments_2_0= RULE_ID ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==75) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:4987:4: otherlv_1= '.' ( (lv_segments_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,75,FOLLOW_4); 

            	    				newLeafNode(otherlv_1, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    // InternalLibrettoProjectProfile.g:4991:4: ( (lv_segments_2_0= RULE_ID ) )
            	    // InternalLibrettoProjectProfile.g:4992:5: (lv_segments_2_0= RULE_ID )
            	    {
            	    // InternalLibrettoProjectProfile.g:4992:5: (lv_segments_2_0= RULE_ID )
            	    // InternalLibrettoProjectProfile.g:4993:6: lv_segments_2_0= RULE_ID
            	    {
            	    lv_segments_2_0=(Token)match(input,RULE_ID,FOLLOW_29); 

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
            	    break loop40;
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
    // InternalLibrettoProjectProfile.g:5014:1: entryRulePrimitiveType returns [EObject current=null] : iv_rulePrimitiveType= rulePrimitiveType EOF ;
    public final EObject entryRulePrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveType = null;


        try {
            // InternalLibrettoProjectProfile.g:5014:54: (iv_rulePrimitiveType= rulePrimitiveType EOF )
            // InternalLibrettoProjectProfile.g:5015:2: iv_rulePrimitiveType= rulePrimitiveType EOF
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
    // InternalLibrettoProjectProfile.g:5021:1: rulePrimitiveType returns [EObject current=null] : ( ( (lv_kind_0_1= 'boolean' | lv_kind_0_2= 'int' | lv_kind_0_3= 'long' | lv_kind_0_4= 'double' | lv_kind_0_5= 'float' | lv_kind_0_6= 'short' | lv_kind_0_7= 'byte' | lv_kind_0_8= 'char' | lv_kind_0_9= 'void' ) ) ) ;
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
            // InternalLibrettoProjectProfile.g:5027:2: ( ( ( (lv_kind_0_1= 'boolean' | lv_kind_0_2= 'int' | lv_kind_0_3= 'long' | lv_kind_0_4= 'double' | lv_kind_0_5= 'float' | lv_kind_0_6= 'short' | lv_kind_0_7= 'byte' | lv_kind_0_8= 'char' | lv_kind_0_9= 'void' ) ) ) )
            // InternalLibrettoProjectProfile.g:5028:2: ( ( (lv_kind_0_1= 'boolean' | lv_kind_0_2= 'int' | lv_kind_0_3= 'long' | lv_kind_0_4= 'double' | lv_kind_0_5= 'float' | lv_kind_0_6= 'short' | lv_kind_0_7= 'byte' | lv_kind_0_8= 'char' | lv_kind_0_9= 'void' ) ) )
            {
            // InternalLibrettoProjectProfile.g:5028:2: ( ( (lv_kind_0_1= 'boolean' | lv_kind_0_2= 'int' | lv_kind_0_3= 'long' | lv_kind_0_4= 'double' | lv_kind_0_5= 'float' | lv_kind_0_6= 'short' | lv_kind_0_7= 'byte' | lv_kind_0_8= 'char' | lv_kind_0_9= 'void' ) ) )
            // InternalLibrettoProjectProfile.g:5029:3: ( (lv_kind_0_1= 'boolean' | lv_kind_0_2= 'int' | lv_kind_0_3= 'long' | lv_kind_0_4= 'double' | lv_kind_0_5= 'float' | lv_kind_0_6= 'short' | lv_kind_0_7= 'byte' | lv_kind_0_8= 'char' | lv_kind_0_9= 'void' ) )
            {
            // InternalLibrettoProjectProfile.g:5029:3: ( (lv_kind_0_1= 'boolean' | lv_kind_0_2= 'int' | lv_kind_0_3= 'long' | lv_kind_0_4= 'double' | lv_kind_0_5= 'float' | lv_kind_0_6= 'short' | lv_kind_0_7= 'byte' | lv_kind_0_8= 'char' | lv_kind_0_9= 'void' ) )
            // InternalLibrettoProjectProfile.g:5030:4: (lv_kind_0_1= 'boolean' | lv_kind_0_2= 'int' | lv_kind_0_3= 'long' | lv_kind_0_4= 'double' | lv_kind_0_5= 'float' | lv_kind_0_6= 'short' | lv_kind_0_7= 'byte' | lv_kind_0_8= 'char' | lv_kind_0_9= 'void' )
            {
            // InternalLibrettoProjectProfile.g:5030:4: (lv_kind_0_1= 'boolean' | lv_kind_0_2= 'int' | lv_kind_0_3= 'long' | lv_kind_0_4= 'double' | lv_kind_0_5= 'float' | lv_kind_0_6= 'short' | lv_kind_0_7= 'byte' | lv_kind_0_8= 'char' | lv_kind_0_9= 'void' )
            int alt41=9;
            switch ( input.LA(1) ) {
            case 76:
                {
                alt41=1;
                }
                break;
            case 77:
                {
                alt41=2;
                }
                break;
            case 78:
                {
                alt41=3;
                }
                break;
            case 79:
                {
                alt41=4;
                }
                break;
            case 80:
                {
                alt41=5;
                }
                break;
            case 81:
                {
                alt41=6;
                }
                break;
            case 82:
                {
                alt41=7;
                }
                break;
            case 83:
                {
                alt41=8;
                }
                break;
            case 84:
                {
                alt41=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:5031:5: lv_kind_0_1= 'boolean'
                    {
                    lv_kind_0_1=(Token)match(input,76,FOLLOW_2); 

                    					newLeafNode(lv_kind_0_1, grammarAccess.getPrimitiveTypeAccess().getKindBooleanKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "kind", lv_kind_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalLibrettoProjectProfile.g:5042:5: lv_kind_0_2= 'int'
                    {
                    lv_kind_0_2=(Token)match(input,77,FOLLOW_2); 

                    					newLeafNode(lv_kind_0_2, grammarAccess.getPrimitiveTypeAccess().getKindIntKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "kind", lv_kind_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalLibrettoProjectProfile.g:5053:5: lv_kind_0_3= 'long'
                    {
                    lv_kind_0_3=(Token)match(input,78,FOLLOW_2); 

                    					newLeafNode(lv_kind_0_3, grammarAccess.getPrimitiveTypeAccess().getKindLongKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "kind", lv_kind_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalLibrettoProjectProfile.g:5064:5: lv_kind_0_4= 'double'
                    {
                    lv_kind_0_4=(Token)match(input,79,FOLLOW_2); 

                    					newLeafNode(lv_kind_0_4, grammarAccess.getPrimitiveTypeAccess().getKindDoubleKeyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "kind", lv_kind_0_4, null);
                    				

                    }
                    break;
                case 5 :
                    // InternalLibrettoProjectProfile.g:5075:5: lv_kind_0_5= 'float'
                    {
                    lv_kind_0_5=(Token)match(input,80,FOLLOW_2); 

                    					newLeafNode(lv_kind_0_5, grammarAccess.getPrimitiveTypeAccess().getKindFloatKeyword_0_4());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "kind", lv_kind_0_5, null);
                    				

                    }
                    break;
                case 6 :
                    // InternalLibrettoProjectProfile.g:5086:5: lv_kind_0_6= 'short'
                    {
                    lv_kind_0_6=(Token)match(input,81,FOLLOW_2); 

                    					newLeafNode(lv_kind_0_6, grammarAccess.getPrimitiveTypeAccess().getKindShortKeyword_0_5());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "kind", lv_kind_0_6, null);
                    				

                    }
                    break;
                case 7 :
                    // InternalLibrettoProjectProfile.g:5097:5: lv_kind_0_7= 'byte'
                    {
                    lv_kind_0_7=(Token)match(input,82,FOLLOW_2); 

                    					newLeafNode(lv_kind_0_7, grammarAccess.getPrimitiveTypeAccess().getKindByteKeyword_0_6());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "kind", lv_kind_0_7, null);
                    				

                    }
                    break;
                case 8 :
                    // InternalLibrettoProjectProfile.g:5108:5: lv_kind_0_8= 'char'
                    {
                    lv_kind_0_8=(Token)match(input,83,FOLLOW_2); 

                    					newLeafNode(lv_kind_0_8, grammarAccess.getPrimitiveTypeAccess().getKindCharKeyword_0_7());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "kind", lv_kind_0_8, null);
                    				

                    }
                    break;
                case 9 :
                    // InternalLibrettoProjectProfile.g:5119:5: lv_kind_0_9= 'void'
                    {
                    lv_kind_0_9=(Token)match(input,84,FOLLOW_2); 

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
    // InternalLibrettoProjectProfile.g:5135:1: entryRuleOperationSignature returns [EObject current=null] : iv_ruleOperationSignature= ruleOperationSignature EOF ;
    public final EObject entryRuleOperationSignature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationSignature = null;


        try {
            // InternalLibrettoProjectProfile.g:5135:59: (iv_ruleOperationSignature= ruleOperationSignature EOF )
            // InternalLibrettoProjectProfile.g:5136:2: iv_ruleOperationSignature= ruleOperationSignature EOF
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
    // InternalLibrettoProjectProfile.g:5142:1: ruleOperationSignature returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleTypedParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleTypedParam ) ) )* )? otherlv_5= ')' ) ;
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
            // InternalLibrettoProjectProfile.g:5148:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleTypedParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleTypedParam ) ) )* )? otherlv_5= ')' ) )
            // InternalLibrettoProjectProfile.g:5149:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleTypedParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleTypedParam ) ) )* )? otherlv_5= ')' )
            {
            // InternalLibrettoProjectProfile.g:5149:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleTypedParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleTypedParam ) ) )* )? otherlv_5= ')' )
            // InternalLibrettoProjectProfile.g:5150:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleTypedParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleTypedParam ) ) )* )? otherlv_5= ')'
            {
            // InternalLibrettoProjectProfile.g:5150:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalLibrettoProjectProfile.g:5151:4: (lv_name_0_0= RULE_ID )
            {
            // InternalLibrettoProjectProfile.g:5151:4: (lv_name_0_0= RULE_ID )
            // InternalLibrettoProjectProfile.g:5152:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_30); 

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

            otherlv_1=(Token)match(input,85,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getOperationSignatureAccess().getLeftParenthesisKeyword_1());
            		
            // InternalLibrettoProjectProfile.g:5172:3: ( ( (lv_params_2_0= ruleTypedParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleTypedParam ) ) )* )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_ID||(LA43_0>=76 && LA43_0<=84)) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:5173:4: ( (lv_params_2_0= ruleTypedParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleTypedParam ) ) )*
                    {
                    // InternalLibrettoProjectProfile.g:5173:4: ( (lv_params_2_0= ruleTypedParam ) )
                    // InternalLibrettoProjectProfile.g:5174:5: (lv_params_2_0= ruleTypedParam )
                    {
                    // InternalLibrettoProjectProfile.g:5174:5: (lv_params_2_0= ruleTypedParam )
                    // InternalLibrettoProjectProfile.g:5175:6: lv_params_2_0= ruleTypedParam
                    {

                    						newCompositeNode(grammarAccess.getOperationSignatureAccess().getParamsTypedParamParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_32);
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

                    // InternalLibrettoProjectProfile.g:5192:4: (otherlv_3= ',' ( (lv_params_4_0= ruleTypedParam ) ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==72) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // InternalLibrettoProjectProfile.g:5193:5: otherlv_3= ',' ( (lv_params_4_0= ruleTypedParam ) )
                    	    {
                    	    otherlv_3=(Token)match(input,72,FOLLOW_24); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getOperationSignatureAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalLibrettoProjectProfile.g:5197:5: ( (lv_params_4_0= ruleTypedParam ) )
                    	    // InternalLibrettoProjectProfile.g:5198:6: (lv_params_4_0= ruleTypedParam )
                    	    {
                    	    // InternalLibrettoProjectProfile.g:5198:6: (lv_params_4_0= ruleTypedParam )
                    	    // InternalLibrettoProjectProfile.g:5199:7: lv_params_4_0= ruleTypedParam
                    	    {

                    	    							newCompositeNode(grammarAccess.getOperationSignatureAccess().getParamsTypedParamParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_32);
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
                    	    break loop42;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,86,FOLLOW_2); 

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
    // InternalLibrettoProjectProfile.g:5226:1: entryRuleTypedParam returns [EObject current=null] : iv_ruleTypedParam= ruleTypedParam EOF ;
    public final EObject entryRuleTypedParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedParam = null;


        try {
            // InternalLibrettoProjectProfile.g:5226:51: (iv_ruleTypedParam= ruleTypedParam EOF )
            // InternalLibrettoProjectProfile.g:5227:2: iv_ruleTypedParam= ruleTypedParam EOF
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
    // InternalLibrettoProjectProfile.g:5233:1: ruleTypedParam returns [EObject current=null] : ( ( (lv_type_0_0= ruleJavaType ) ) ( (lv_paramName_1_0= RULE_ID ) ) ) ;
    public final EObject ruleTypedParam() throws RecognitionException {
        EObject current = null;

        Token lv_paramName_1_0=null;
        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:5239:2: ( ( ( (lv_type_0_0= ruleJavaType ) ) ( (lv_paramName_1_0= RULE_ID ) ) ) )
            // InternalLibrettoProjectProfile.g:5240:2: ( ( (lv_type_0_0= ruleJavaType ) ) ( (lv_paramName_1_0= RULE_ID ) ) )
            {
            // InternalLibrettoProjectProfile.g:5240:2: ( ( (lv_type_0_0= ruleJavaType ) ) ( (lv_paramName_1_0= RULE_ID ) ) )
            // InternalLibrettoProjectProfile.g:5241:3: ( (lv_type_0_0= ruleJavaType ) ) ( (lv_paramName_1_0= RULE_ID ) )
            {
            // InternalLibrettoProjectProfile.g:5241:3: ( (lv_type_0_0= ruleJavaType ) )
            // InternalLibrettoProjectProfile.g:5242:4: (lv_type_0_0= ruleJavaType )
            {
            // InternalLibrettoProjectProfile.g:5242:4: (lv_type_0_0= ruleJavaType )
            // InternalLibrettoProjectProfile.g:5243:5: lv_type_0_0= ruleJavaType
            {

            					newCompositeNode(grammarAccess.getTypedParamAccess().getTypeJavaTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
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

            // InternalLibrettoProjectProfile.g:5260:3: ( (lv_paramName_1_0= RULE_ID ) )
            // InternalLibrettoProjectProfile.g:5261:4: (lv_paramName_1_0= RULE_ID )
            {
            // InternalLibrettoProjectProfile.g:5261:4: (lv_paramName_1_0= RULE_ID )
            // InternalLibrettoProjectProfile.g:5262:5: lv_paramName_1_0= RULE_ID
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


    // $ANTLR start "entryRuleValidID"
    // InternalLibrettoProjectProfile.g:5282:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // InternalLibrettoProjectProfile.g:5282:47: (iv_ruleValidID= ruleValidID EOF )
            // InternalLibrettoProjectProfile.g:5283:2: iv_ruleValidID= ruleValidID EOF
            {
             newCompositeNode(grammarAccess.getValidIDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValidID=ruleValidID();

            state._fsp--;

             current =iv_ruleValidID.getText(); 
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
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // InternalLibrettoProjectProfile.g:5289:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( (kw= '.' | kw= '-' | kw= '_' ) this_ID_4= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_4=null;


        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:5295:2: ( (this_ID_0= RULE_ID ( (kw= '.' | kw= '-' | kw= '_' ) this_ID_4= RULE_ID )* ) )
            // InternalLibrettoProjectProfile.g:5296:2: (this_ID_0= RULE_ID ( (kw= '.' | kw= '-' | kw= '_' ) this_ID_4= RULE_ID )* )
            {
            // InternalLibrettoProjectProfile.g:5296:2: (this_ID_0= RULE_ID ( (kw= '.' | kw= '-' | kw= '_' ) this_ID_4= RULE_ID )* )
            // InternalLibrettoProjectProfile.g:5297:3: this_ID_0= RULE_ID ( (kw= '.' | kw= '-' | kw= '_' ) this_ID_4= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_33); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getValidIDAccess().getIDTerminalRuleCall_0());
            		
            // InternalLibrettoProjectProfile.g:5304:3: ( (kw= '.' | kw= '-' | kw= '_' ) this_ID_4= RULE_ID )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==75||(LA45_0>=87 && LA45_0<=88)) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:5305:4: (kw= '.' | kw= '-' | kw= '_' ) this_ID_4= RULE_ID
            	    {
            	    // InternalLibrettoProjectProfile.g:5305:4: (kw= '.' | kw= '-' | kw= '_' )
            	    int alt44=3;
            	    switch ( input.LA(1) ) {
            	    case 75:
            	        {
            	        alt44=1;
            	        }
            	        break;
            	    case 87:
            	        {
            	        alt44=2;
            	        }
            	        break;
            	    case 88:
            	        {
            	        alt44=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 44, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt44) {
            	        case 1 :
            	            // InternalLibrettoProjectProfile.g:5306:5: kw= '.'
            	            {
            	            kw=(Token)match(input,75,FOLLOW_4); 

            	            					current.merge(kw);
            	            					newLeafNode(kw, grammarAccess.getValidIDAccess().getFullStopKeyword_1_0_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalLibrettoProjectProfile.g:5312:5: kw= '-'
            	            {
            	            kw=(Token)match(input,87,FOLLOW_4); 

            	            					current.merge(kw);
            	            					newLeafNode(kw, grammarAccess.getValidIDAccess().getHyphenMinusKeyword_1_0_1());
            	            				

            	            }
            	            break;
            	        case 3 :
            	            // InternalLibrettoProjectProfile.g:5318:5: kw= '_'
            	            {
            	            kw=(Token)match(input,88,FOLLOW_4); 

            	            					current.merge(kw);
            	            					newLeafNode(kw, grammarAccess.getValidIDAccess().get_Keyword_1_0_2());
            	            				

            	            }
            	            break;

            	    }

            	    this_ID_4=(Token)match(input,RULE_ID,FOLLOW_33); 

            	    				current.merge(this_ID_4);
            	    			

            	    				newLeafNode(this_ID_4, grammarAccess.getValidIDAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop45;
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
    // $ANTLR end "ruleValidID"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x4000600000005000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000010039000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000041000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000FF81000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00C0009FE0001000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000110000001000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000E0000001000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000800000001000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x003F000000001000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0700000000001000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x3800000000001000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x8000000000001000L,0x00000000000002A2L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000001L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000040L,0x00000000001FF000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000110L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000040L,0x00000000005FF000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400100L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000002L,0x0000000001800800L});

}