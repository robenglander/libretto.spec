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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'profile'", "'{'", "'}'", "'project'", "'rootDir'", "'modules'", "'module'", "'dir'", "'specDir'", "'testDir'", "'mainDir'", "'basePackage'", "'gen'", "'initialInstruction'", "'maxRetries'", "'parseCheck'", "'true'", "'false'", "'defaultCorrection'", "'rules'", "'rule'", "'pattern'", "'code'", "'correction'", "'default'", "'llmProviders'", "'provider'", "'kind'", "'local'", "'openai'", "'ollama'", "'localModelPath'", "'model'", "'endpoint'", "'modelUsage'", "'primary'", "'secondary'", "'escalation'", "'enabled'", "'escalateAtRetry'", "'surface'", "'for'", "'spec'", "'returnType'", "'method'", "'as'", "';'", "'paramType'", "'name'", "'recordSelfReturn'", "','", "'methodOverride'", "'returns'", "'.'", "'boolean'", "'int'", "'long'", "'double'", "'float'", "'short'", "'byte'", "'char'", "'void'", "'('", "')'", "'-'", "'_'"
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
    // InternalLibrettoProjectProfile.g:71:1: ruleProjectProfile returns [EObject current=null] : ( () otherlv_1= 'profile' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '{' ( ( (lv_projects_4_0= ruleProjectBlock ) ) | ( (lv_llmProviders_5_0= ruleLlmProvidersBlock ) ) | ( (lv_surfaces_6_0= ruleSurfaceBlock ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleProjectProfile() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_projects_4_0 = null;

        EObject lv_llmProviders_5_0 = null;

        EObject lv_surfaces_6_0 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:77:2: ( ( () otherlv_1= 'profile' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '{' ( ( (lv_projects_4_0= ruleProjectBlock ) ) | ( (lv_llmProviders_5_0= ruleLlmProvidersBlock ) ) | ( (lv_surfaces_6_0= ruleSurfaceBlock ) ) )* otherlv_7= '}' ) )
            // InternalLibrettoProjectProfile.g:78:2: ( () otherlv_1= 'profile' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '{' ( ( (lv_projects_4_0= ruleProjectBlock ) ) | ( (lv_llmProviders_5_0= ruleLlmProvidersBlock ) ) | ( (lv_surfaces_6_0= ruleSurfaceBlock ) ) )* otherlv_7= '}' )
            {
            // InternalLibrettoProjectProfile.g:78:2: ( () otherlv_1= 'profile' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '{' ( ( (lv_projects_4_0= ruleProjectBlock ) ) | ( (lv_llmProviders_5_0= ruleLlmProvidersBlock ) ) | ( (lv_surfaces_6_0= ruleSurfaceBlock ) ) )* otherlv_7= '}' )
            // InternalLibrettoProjectProfile.g:79:3: () otherlv_1= 'profile' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '{' ( ( (lv_projects_4_0= ruleProjectBlock ) ) | ( (lv_llmProviders_5_0= ruleLlmProvidersBlock ) ) | ( (lv_surfaces_6_0= ruleSurfaceBlock ) ) )* otherlv_7= '}'
            {
            // InternalLibrettoProjectProfile.g:79:3: ()
            // InternalLibrettoProjectProfile.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProjectProfileAccess().getProjectProfileAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getProjectProfileAccess().getProfileKeyword_1());
            		
            // InternalLibrettoProjectProfile.g:90:3: ( (lv_name_2_0= ruleValidID ) )
            // InternalLibrettoProjectProfile.g:91:4: (lv_name_2_0= ruleValidID )
            {
            // InternalLibrettoProjectProfile.g:91:4: (lv_name_2_0= ruleValidID )
            // InternalLibrettoProjectProfile.g:92:5: lv_name_2_0= ruleValidID
            {

            					newCompositeNode(grammarAccess.getProjectProfileAccess().getNameValidIDParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleValidID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProjectProfileRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"com.robenglander.libretto.spec.LibrettoProjectProfile.ValidID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getProjectProfileAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalLibrettoProjectProfile.g:113:3: ( ( (lv_projects_4_0= ruleProjectBlock ) ) | ( (lv_llmProviders_5_0= ruleLlmProvidersBlock ) ) | ( (lv_surfaces_6_0= ruleSurfaceBlock ) ) )*
            loop1:
            do {
                int alt1=4;
                switch ( input.LA(1) ) {
                case 14:
                    {
                    alt1=1;
                    }
                    break;
                case 36:
                    {
                    alt1=2;
                    }
                    break;
                case 51:
                    {
                    alt1=3;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:114:4: ( (lv_projects_4_0= ruleProjectBlock ) )
            	    {
            	    // InternalLibrettoProjectProfile.g:114:4: ( (lv_projects_4_0= ruleProjectBlock ) )
            	    // InternalLibrettoProjectProfile.g:115:5: (lv_projects_4_0= ruleProjectBlock )
            	    {
            	    // InternalLibrettoProjectProfile.g:115:5: (lv_projects_4_0= ruleProjectBlock )
            	    // InternalLibrettoProjectProfile.g:116:6: lv_projects_4_0= ruleProjectBlock
            	    {

            	    						newCompositeNode(grammarAccess.getProjectProfileAccess().getProjectsProjectBlockParserRuleCall_4_0_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_projects_4_0=ruleProjectBlock();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProjectProfileRule());
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
            	    // InternalLibrettoProjectProfile.g:134:4: ( (lv_llmProviders_5_0= ruleLlmProvidersBlock ) )
            	    {
            	    // InternalLibrettoProjectProfile.g:134:4: ( (lv_llmProviders_5_0= ruleLlmProvidersBlock ) )
            	    // InternalLibrettoProjectProfile.g:135:5: (lv_llmProviders_5_0= ruleLlmProvidersBlock )
            	    {
            	    // InternalLibrettoProjectProfile.g:135:5: (lv_llmProviders_5_0= ruleLlmProvidersBlock )
            	    // InternalLibrettoProjectProfile.g:136:6: lv_llmProviders_5_0= ruleLlmProvidersBlock
            	    {

            	    						newCompositeNode(grammarAccess.getProjectProfileAccess().getLlmProvidersLlmProvidersBlockParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_llmProviders_5_0=ruleLlmProvidersBlock();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProjectProfileRule());
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
            	    // InternalLibrettoProjectProfile.g:154:4: ( (lv_surfaces_6_0= ruleSurfaceBlock ) )
            	    {
            	    // InternalLibrettoProjectProfile.g:154:4: ( (lv_surfaces_6_0= ruleSurfaceBlock ) )
            	    // InternalLibrettoProjectProfile.g:155:5: (lv_surfaces_6_0= ruleSurfaceBlock )
            	    {
            	    // InternalLibrettoProjectProfile.g:155:5: (lv_surfaces_6_0= ruleSurfaceBlock )
            	    // InternalLibrettoProjectProfile.g:156:6: lv_surfaces_6_0= ruleSurfaceBlock
            	    {

            	    						newCompositeNode(grammarAccess.getProjectProfileAccess().getSurfacesSurfaceBlockParserRuleCall_4_2_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_surfaces_6_0=ruleSurfaceBlock();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProjectProfileRule());
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
            	    break loop1;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getProjectProfileAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalLibrettoProjectProfile.g:182:1: entryRuleProjectBlock returns [EObject current=null] : iv_ruleProjectBlock= ruleProjectBlock EOF ;
    public final EObject entryRuleProjectBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProjectBlock = null;


        try {
            // InternalLibrettoProjectProfile.g:182:53: (iv_ruleProjectBlock= ruleProjectBlock EOF )
            // InternalLibrettoProjectProfile.g:183:2: iv_ruleProjectBlock= ruleProjectBlock EOF
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
    // InternalLibrettoProjectProfile.g:189:1: ruleProjectBlock returns [EObject current=null] : ( () otherlv_1= 'project' otherlv_2= '{' ( (otherlv_3= 'rootDir' ( (lv_rootDir_4_0= RULE_STRING ) ) ) | ( (lv_modules_5_0= ruleModulesBlock ) ) | ( (lv_gens_6_0= ruleGenBlock ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleProjectBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_rootDir_4_0=null;
        Token otherlv_7=null;
        EObject lv_modules_5_0 = null;

        EObject lv_gens_6_0 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:195:2: ( ( () otherlv_1= 'project' otherlv_2= '{' ( (otherlv_3= 'rootDir' ( (lv_rootDir_4_0= RULE_STRING ) ) ) | ( (lv_modules_5_0= ruleModulesBlock ) ) | ( (lv_gens_6_0= ruleGenBlock ) ) )* otherlv_7= '}' ) )
            // InternalLibrettoProjectProfile.g:196:2: ( () otherlv_1= 'project' otherlv_2= '{' ( (otherlv_3= 'rootDir' ( (lv_rootDir_4_0= RULE_STRING ) ) ) | ( (lv_modules_5_0= ruleModulesBlock ) ) | ( (lv_gens_6_0= ruleGenBlock ) ) )* otherlv_7= '}' )
            {
            // InternalLibrettoProjectProfile.g:196:2: ( () otherlv_1= 'project' otherlv_2= '{' ( (otherlv_3= 'rootDir' ( (lv_rootDir_4_0= RULE_STRING ) ) ) | ( (lv_modules_5_0= ruleModulesBlock ) ) | ( (lv_gens_6_0= ruleGenBlock ) ) )* otherlv_7= '}' )
            // InternalLibrettoProjectProfile.g:197:3: () otherlv_1= 'project' otherlv_2= '{' ( (otherlv_3= 'rootDir' ( (lv_rootDir_4_0= RULE_STRING ) ) ) | ( (lv_modules_5_0= ruleModulesBlock ) ) | ( (lv_gens_6_0= ruleGenBlock ) ) )* otherlv_7= '}'
            {
            // InternalLibrettoProjectProfile.g:197:3: ()
            // InternalLibrettoProjectProfile.g:198:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProjectBlockAccess().getProjectBlockAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getProjectBlockAccess().getProjectKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getProjectBlockAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLibrettoProjectProfile.g:212:3: ( (otherlv_3= 'rootDir' ( (lv_rootDir_4_0= RULE_STRING ) ) ) | ( (lv_modules_5_0= ruleModulesBlock ) ) | ( (lv_gens_6_0= ruleGenBlock ) ) )*
            loop2:
            do {
                int alt2=4;
                switch ( input.LA(1) ) {
                case 15:
                    {
                    alt2=1;
                    }
                    break;
                case 16:
                    {
                    alt2=2;
                    }
                    break;
                case 23:
                    {
                    alt2=3;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:213:4: (otherlv_3= 'rootDir' ( (lv_rootDir_4_0= RULE_STRING ) ) )
            	    {
            	    // InternalLibrettoProjectProfile.g:213:4: (otherlv_3= 'rootDir' ( (lv_rootDir_4_0= RULE_STRING ) ) )
            	    // InternalLibrettoProjectProfile.g:214:5: otherlv_3= 'rootDir' ( (lv_rootDir_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_7); 

            	    					newLeafNode(otherlv_3, grammarAccess.getProjectBlockAccess().getRootDirKeyword_3_0_0());
            	    				
            	    // InternalLibrettoProjectProfile.g:218:5: ( (lv_rootDir_4_0= RULE_STRING ) )
            	    // InternalLibrettoProjectProfile.g:219:6: (lv_rootDir_4_0= RULE_STRING )
            	    {
            	    // InternalLibrettoProjectProfile.g:219:6: (lv_rootDir_4_0= RULE_STRING )
            	    // InternalLibrettoProjectProfile.g:220:7: lv_rootDir_4_0= RULE_STRING
            	    {
            	    lv_rootDir_4_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            	    							newLeafNode(lv_rootDir_4_0, grammarAccess.getProjectBlockAccess().getRootDirSTRINGTerminalRuleCall_3_0_1_0());
            	    						

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getProjectBlockRule());
            	    							}
            	    							addWithLastConsumed(
            	    								current,
            	    								"rootDir",
            	    								lv_rootDir_4_0,
            	    								"org.eclipse.xtext.common.Terminals.STRING");
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalLibrettoProjectProfile.g:238:4: ( (lv_modules_5_0= ruleModulesBlock ) )
            	    {
            	    // InternalLibrettoProjectProfile.g:238:4: ( (lv_modules_5_0= ruleModulesBlock ) )
            	    // InternalLibrettoProjectProfile.g:239:5: (lv_modules_5_0= ruleModulesBlock )
            	    {
            	    // InternalLibrettoProjectProfile.g:239:5: (lv_modules_5_0= ruleModulesBlock )
            	    // InternalLibrettoProjectProfile.g:240:6: lv_modules_5_0= ruleModulesBlock
            	    {

            	    						newCompositeNode(grammarAccess.getProjectBlockAccess().getModulesModulesBlockParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_modules_5_0=ruleModulesBlock();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProjectBlockRule());
            	    						}
            	    						add(
            	    							current,
            	    							"modules",
            	    							lv_modules_5_0,
            	    							"com.robenglander.libretto.spec.LibrettoProjectProfile.ModulesBlock");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalLibrettoProjectProfile.g:258:4: ( (lv_gens_6_0= ruleGenBlock ) )
            	    {
            	    // InternalLibrettoProjectProfile.g:258:4: ( (lv_gens_6_0= ruleGenBlock ) )
            	    // InternalLibrettoProjectProfile.g:259:5: (lv_gens_6_0= ruleGenBlock )
            	    {
            	    // InternalLibrettoProjectProfile.g:259:5: (lv_gens_6_0= ruleGenBlock )
            	    // InternalLibrettoProjectProfile.g:260:6: lv_gens_6_0= ruleGenBlock
            	    {

            	    						newCompositeNode(grammarAccess.getProjectBlockAccess().getGensGenBlockParserRuleCall_3_2_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_gens_6_0=ruleGenBlock();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProjectBlockRule());
            	    						}
            	    						add(
            	    							current,
            	    							"gens",
            	    							lv_gens_6_0,
            	    							"com.robenglander.libretto.spec.LibrettoProjectProfile.GenBlock");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getProjectBlockAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalLibrettoProjectProfile.g:286:1: entryRuleModulesBlock returns [EObject current=null] : iv_ruleModulesBlock= ruleModulesBlock EOF ;
    public final EObject entryRuleModulesBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModulesBlock = null;


        try {
            // InternalLibrettoProjectProfile.g:286:53: (iv_ruleModulesBlock= ruleModulesBlock EOF )
            // InternalLibrettoProjectProfile.g:287:2: iv_ruleModulesBlock= ruleModulesBlock EOF
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
    // InternalLibrettoProjectProfile.g:293:1: ruleModulesBlock returns [EObject current=null] : ( () otherlv_1= 'modules' otherlv_2= '{' ( (lv_modules_3_0= ruleProjectModule ) )* otherlv_4= '}' ) ;
    public final EObject ruleModulesBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_modules_3_0 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:299:2: ( ( () otherlv_1= 'modules' otherlv_2= '{' ( (lv_modules_3_0= ruleProjectModule ) )* otherlv_4= '}' ) )
            // InternalLibrettoProjectProfile.g:300:2: ( () otherlv_1= 'modules' otherlv_2= '{' ( (lv_modules_3_0= ruleProjectModule ) )* otherlv_4= '}' )
            {
            // InternalLibrettoProjectProfile.g:300:2: ( () otherlv_1= 'modules' otherlv_2= '{' ( (lv_modules_3_0= ruleProjectModule ) )* otherlv_4= '}' )
            // InternalLibrettoProjectProfile.g:301:3: () otherlv_1= 'modules' otherlv_2= '{' ( (lv_modules_3_0= ruleProjectModule ) )* otherlv_4= '}'
            {
            // InternalLibrettoProjectProfile.g:301:3: ()
            // InternalLibrettoProjectProfile.g:302:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getModulesBlockAccess().getModulesBlockAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getModulesBlockAccess().getModulesKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getModulesBlockAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLibrettoProjectProfile.g:316:3: ( (lv_modules_3_0= ruleProjectModule ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:317:4: (lv_modules_3_0= ruleProjectModule )
            	    {
            	    // InternalLibrettoProjectProfile.g:317:4: (lv_modules_3_0= ruleProjectModule )
            	    // InternalLibrettoProjectProfile.g:318:5: lv_modules_3_0= ruleProjectModule
            	    {

            	    					newCompositeNode(grammarAccess.getModulesBlockAccess().getModulesProjectModuleParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_8);
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
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

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


    // $ANTLR start "entryRuleProjectModule"
    // InternalLibrettoProjectProfile.g:343:1: entryRuleProjectModule returns [EObject current=null] : iv_ruleProjectModule= ruleProjectModule EOF ;
    public final EObject entryRuleProjectModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProjectModule = null;


        try {
            // InternalLibrettoProjectProfile.g:343:54: (iv_ruleProjectModule= ruleProjectModule EOF )
            // InternalLibrettoProjectProfile.g:344:2: iv_ruleProjectModule= ruleProjectModule EOF
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
    // InternalLibrettoProjectProfile.g:350:1: ruleProjectModule returns [EObject current=null] : (otherlv_0= 'module' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( (otherlv_3= 'dir' ( (lv_dirs_4_0= RULE_STRING ) ) ) | (otherlv_5= 'specDir' ( (lv_specDirs_6_0= RULE_STRING ) ) ) | (otherlv_7= 'testDir' ( (lv_testDirs_8_0= RULE_STRING ) ) ) | (otherlv_9= 'mainDir' ( (lv_mainDirs_10_0= RULE_STRING ) ) ) | (otherlv_11= 'basePackage' ( (lv_basePackages_12_0= RULE_STRING ) ) ) )* otherlv_13= '}' ) ;
    public final EObject ruleProjectModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_dirs_4_0=null;
        Token otherlv_5=null;
        Token lv_specDirs_6_0=null;
        Token otherlv_7=null;
        Token lv_testDirs_8_0=null;
        Token otherlv_9=null;
        Token lv_mainDirs_10_0=null;
        Token otherlv_11=null;
        Token lv_basePackages_12_0=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:356:2: ( (otherlv_0= 'module' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( (otherlv_3= 'dir' ( (lv_dirs_4_0= RULE_STRING ) ) ) | (otherlv_5= 'specDir' ( (lv_specDirs_6_0= RULE_STRING ) ) ) | (otherlv_7= 'testDir' ( (lv_testDirs_8_0= RULE_STRING ) ) ) | (otherlv_9= 'mainDir' ( (lv_mainDirs_10_0= RULE_STRING ) ) ) | (otherlv_11= 'basePackage' ( (lv_basePackages_12_0= RULE_STRING ) ) ) )* otherlv_13= '}' ) )
            // InternalLibrettoProjectProfile.g:357:2: (otherlv_0= 'module' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( (otherlv_3= 'dir' ( (lv_dirs_4_0= RULE_STRING ) ) ) | (otherlv_5= 'specDir' ( (lv_specDirs_6_0= RULE_STRING ) ) ) | (otherlv_7= 'testDir' ( (lv_testDirs_8_0= RULE_STRING ) ) ) | (otherlv_9= 'mainDir' ( (lv_mainDirs_10_0= RULE_STRING ) ) ) | (otherlv_11= 'basePackage' ( (lv_basePackages_12_0= RULE_STRING ) ) ) )* otherlv_13= '}' )
            {
            // InternalLibrettoProjectProfile.g:357:2: (otherlv_0= 'module' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( (otherlv_3= 'dir' ( (lv_dirs_4_0= RULE_STRING ) ) ) | (otherlv_5= 'specDir' ( (lv_specDirs_6_0= RULE_STRING ) ) ) | (otherlv_7= 'testDir' ( (lv_testDirs_8_0= RULE_STRING ) ) ) | (otherlv_9= 'mainDir' ( (lv_mainDirs_10_0= RULE_STRING ) ) ) | (otherlv_11= 'basePackage' ( (lv_basePackages_12_0= RULE_STRING ) ) ) )* otherlv_13= '}' )
            // InternalLibrettoProjectProfile.g:358:3: otherlv_0= 'module' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( (otherlv_3= 'dir' ( (lv_dirs_4_0= RULE_STRING ) ) ) | (otherlv_5= 'specDir' ( (lv_specDirs_6_0= RULE_STRING ) ) ) | (otherlv_7= 'testDir' ( (lv_testDirs_8_0= RULE_STRING ) ) ) | (otherlv_9= 'mainDir' ( (lv_mainDirs_10_0= RULE_STRING ) ) ) | (otherlv_11= 'basePackage' ( (lv_basePackages_12_0= RULE_STRING ) ) ) )* otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProjectModuleAccess().getModuleKeyword_0());
            		
            // InternalLibrettoProjectProfile.g:362:3: ( (lv_name_1_0= ruleValidID ) )
            // InternalLibrettoProjectProfile.g:363:4: (lv_name_1_0= ruleValidID )
            {
            // InternalLibrettoProjectProfile.g:363:4: (lv_name_1_0= ruleValidID )
            // InternalLibrettoProjectProfile.g:364:5: lv_name_1_0= ruleValidID
            {

            					newCompositeNode(grammarAccess.getProjectModuleAccess().getNameValidIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
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

            otherlv_2=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getProjectModuleAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLibrettoProjectProfile.g:385:3: ( (otherlv_3= 'dir' ( (lv_dirs_4_0= RULE_STRING ) ) ) | (otherlv_5= 'specDir' ( (lv_specDirs_6_0= RULE_STRING ) ) ) | (otherlv_7= 'testDir' ( (lv_testDirs_8_0= RULE_STRING ) ) ) | (otherlv_9= 'mainDir' ( (lv_mainDirs_10_0= RULE_STRING ) ) ) | (otherlv_11= 'basePackage' ( (lv_basePackages_12_0= RULE_STRING ) ) ) )*
            loop4:
            do {
                int alt4=6;
                switch ( input.LA(1) ) {
                case 18:
                    {
                    alt4=1;
                    }
                    break;
                case 19:
                    {
                    alt4=2;
                    }
                    break;
                case 20:
                    {
                    alt4=3;
                    }
                    break;
                case 21:
                    {
                    alt4=4;
                    }
                    break;
                case 22:
                    {
                    alt4=5;
                    }
                    break;

                }

                switch (alt4) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:386:4: (otherlv_3= 'dir' ( (lv_dirs_4_0= RULE_STRING ) ) )
            	    {
            	    // InternalLibrettoProjectProfile.g:386:4: (otherlv_3= 'dir' ( (lv_dirs_4_0= RULE_STRING ) ) )
            	    // InternalLibrettoProjectProfile.g:387:5: otherlv_3= 'dir' ( (lv_dirs_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,18,FOLLOW_7); 

            	    					newLeafNode(otherlv_3, grammarAccess.getProjectModuleAccess().getDirKeyword_3_0_0());
            	    				
            	    // InternalLibrettoProjectProfile.g:391:5: ( (lv_dirs_4_0= RULE_STRING ) )
            	    // InternalLibrettoProjectProfile.g:392:6: (lv_dirs_4_0= RULE_STRING )
            	    {
            	    // InternalLibrettoProjectProfile.g:392:6: (lv_dirs_4_0= RULE_STRING )
            	    // InternalLibrettoProjectProfile.g:393:7: lv_dirs_4_0= RULE_STRING
            	    {
            	    lv_dirs_4_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            	    							newLeafNode(lv_dirs_4_0, grammarAccess.getProjectModuleAccess().getDirsSTRINGTerminalRuleCall_3_0_1_0());
            	    						

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getProjectModuleRule());
            	    							}
            	    							addWithLastConsumed(
            	    								current,
            	    								"dirs",
            	    								lv_dirs_4_0,
            	    								"org.eclipse.xtext.common.Terminals.STRING");
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalLibrettoProjectProfile.g:411:4: (otherlv_5= 'specDir' ( (lv_specDirs_6_0= RULE_STRING ) ) )
            	    {
            	    // InternalLibrettoProjectProfile.g:411:4: (otherlv_5= 'specDir' ( (lv_specDirs_6_0= RULE_STRING ) ) )
            	    // InternalLibrettoProjectProfile.g:412:5: otherlv_5= 'specDir' ( (lv_specDirs_6_0= RULE_STRING ) )
            	    {
            	    otherlv_5=(Token)match(input,19,FOLLOW_7); 

            	    					newLeafNode(otherlv_5, grammarAccess.getProjectModuleAccess().getSpecDirKeyword_3_1_0());
            	    				
            	    // InternalLibrettoProjectProfile.g:416:5: ( (lv_specDirs_6_0= RULE_STRING ) )
            	    // InternalLibrettoProjectProfile.g:417:6: (lv_specDirs_6_0= RULE_STRING )
            	    {
            	    // InternalLibrettoProjectProfile.g:417:6: (lv_specDirs_6_0= RULE_STRING )
            	    // InternalLibrettoProjectProfile.g:418:7: lv_specDirs_6_0= RULE_STRING
            	    {
            	    lv_specDirs_6_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            	    							newLeafNode(lv_specDirs_6_0, grammarAccess.getProjectModuleAccess().getSpecDirsSTRINGTerminalRuleCall_3_1_1_0());
            	    						

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getProjectModuleRule());
            	    							}
            	    							addWithLastConsumed(
            	    								current,
            	    								"specDirs",
            	    								lv_specDirs_6_0,
            	    								"org.eclipse.xtext.common.Terminals.STRING");
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalLibrettoProjectProfile.g:436:4: (otherlv_7= 'testDir' ( (lv_testDirs_8_0= RULE_STRING ) ) )
            	    {
            	    // InternalLibrettoProjectProfile.g:436:4: (otherlv_7= 'testDir' ( (lv_testDirs_8_0= RULE_STRING ) ) )
            	    // InternalLibrettoProjectProfile.g:437:5: otherlv_7= 'testDir' ( (lv_testDirs_8_0= RULE_STRING ) )
            	    {
            	    otherlv_7=(Token)match(input,20,FOLLOW_7); 

            	    					newLeafNode(otherlv_7, grammarAccess.getProjectModuleAccess().getTestDirKeyword_3_2_0());
            	    				
            	    // InternalLibrettoProjectProfile.g:441:5: ( (lv_testDirs_8_0= RULE_STRING ) )
            	    // InternalLibrettoProjectProfile.g:442:6: (lv_testDirs_8_0= RULE_STRING )
            	    {
            	    // InternalLibrettoProjectProfile.g:442:6: (lv_testDirs_8_0= RULE_STRING )
            	    // InternalLibrettoProjectProfile.g:443:7: lv_testDirs_8_0= RULE_STRING
            	    {
            	    lv_testDirs_8_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            	    							newLeafNode(lv_testDirs_8_0, grammarAccess.getProjectModuleAccess().getTestDirsSTRINGTerminalRuleCall_3_2_1_0());
            	    						

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getProjectModuleRule());
            	    							}
            	    							addWithLastConsumed(
            	    								current,
            	    								"testDirs",
            	    								lv_testDirs_8_0,
            	    								"org.eclipse.xtext.common.Terminals.STRING");
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalLibrettoProjectProfile.g:461:4: (otherlv_9= 'mainDir' ( (lv_mainDirs_10_0= RULE_STRING ) ) )
            	    {
            	    // InternalLibrettoProjectProfile.g:461:4: (otherlv_9= 'mainDir' ( (lv_mainDirs_10_0= RULE_STRING ) ) )
            	    // InternalLibrettoProjectProfile.g:462:5: otherlv_9= 'mainDir' ( (lv_mainDirs_10_0= RULE_STRING ) )
            	    {
            	    otherlv_9=(Token)match(input,21,FOLLOW_7); 

            	    					newLeafNode(otherlv_9, grammarAccess.getProjectModuleAccess().getMainDirKeyword_3_3_0());
            	    				
            	    // InternalLibrettoProjectProfile.g:466:5: ( (lv_mainDirs_10_0= RULE_STRING ) )
            	    // InternalLibrettoProjectProfile.g:467:6: (lv_mainDirs_10_0= RULE_STRING )
            	    {
            	    // InternalLibrettoProjectProfile.g:467:6: (lv_mainDirs_10_0= RULE_STRING )
            	    // InternalLibrettoProjectProfile.g:468:7: lv_mainDirs_10_0= RULE_STRING
            	    {
            	    lv_mainDirs_10_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            	    							newLeafNode(lv_mainDirs_10_0, grammarAccess.getProjectModuleAccess().getMainDirsSTRINGTerminalRuleCall_3_3_1_0());
            	    						

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getProjectModuleRule());
            	    							}
            	    							addWithLastConsumed(
            	    								current,
            	    								"mainDirs",
            	    								lv_mainDirs_10_0,
            	    								"org.eclipse.xtext.common.Terminals.STRING");
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalLibrettoProjectProfile.g:486:4: (otherlv_11= 'basePackage' ( (lv_basePackages_12_0= RULE_STRING ) ) )
            	    {
            	    // InternalLibrettoProjectProfile.g:486:4: (otherlv_11= 'basePackage' ( (lv_basePackages_12_0= RULE_STRING ) ) )
            	    // InternalLibrettoProjectProfile.g:487:5: otherlv_11= 'basePackage' ( (lv_basePackages_12_0= RULE_STRING ) )
            	    {
            	    otherlv_11=(Token)match(input,22,FOLLOW_7); 

            	    					newLeafNode(otherlv_11, grammarAccess.getProjectModuleAccess().getBasePackageKeyword_3_4_0());
            	    				
            	    // InternalLibrettoProjectProfile.g:491:5: ( (lv_basePackages_12_0= RULE_STRING ) )
            	    // InternalLibrettoProjectProfile.g:492:6: (lv_basePackages_12_0= RULE_STRING )
            	    {
            	    // InternalLibrettoProjectProfile.g:492:6: (lv_basePackages_12_0= RULE_STRING )
            	    // InternalLibrettoProjectProfile.g:493:7: lv_basePackages_12_0= RULE_STRING
            	    {
            	    lv_basePackages_12_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            	    							newLeafNode(lv_basePackages_12_0, grammarAccess.getProjectModuleAccess().getBasePackagesSTRINGTerminalRuleCall_3_4_1_0());
            	    						

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getProjectModuleRule());
            	    							}
            	    							addWithLastConsumed(
            	    								current,
            	    								"basePackages",
            	    								lv_basePackages_12_0,
            	    								"org.eclipse.xtext.common.Terminals.STRING");
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_13=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getProjectModuleAccess().getRightCurlyBracketKeyword_4());
            		

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


    // $ANTLR start "entryRuleGenBlock"
    // InternalLibrettoProjectProfile.g:519:1: entryRuleGenBlock returns [EObject current=null] : iv_ruleGenBlock= ruleGenBlock EOF ;
    public final EObject entryRuleGenBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenBlock = null;


        try {
            // InternalLibrettoProjectProfile.g:519:49: (iv_ruleGenBlock= ruleGenBlock EOF )
            // InternalLibrettoProjectProfile.g:520:2: iv_ruleGenBlock= ruleGenBlock EOF
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
    // InternalLibrettoProjectProfile.g:526:1: ruleGenBlock returns [EObject current=null] : ( () otherlv_1= 'gen' otherlv_2= '{' ( (otherlv_3= 'initialInstruction' ( (lv_initialInstructions_4_0= RULE_STRING ) ) ) | (otherlv_5= 'maxRetries' ( (lv_maxRetries_6_0= RULE_INT ) ) ) | (otherlv_7= 'parseCheck' ( ( (lv_parseChecks_8_1= 'true' | lv_parseChecks_8_2= 'false' ) ) ) ) | (otherlv_9= 'defaultCorrection' ( (lv_defaultCorrections_10_0= RULE_STRING ) ) ) | ( (lv_remediations_11_0= ruleGenRemediationRules ) ) | ( (lv_modelUsages_12_0= ruleGenUsageBlock ) ) )* otherlv_13= '}' ) ;
    public final EObject ruleGenBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_initialInstructions_4_0=null;
        Token otherlv_5=null;
        Token lv_maxRetries_6_0=null;
        Token otherlv_7=null;
        Token lv_parseChecks_8_1=null;
        Token lv_parseChecks_8_2=null;
        Token otherlv_9=null;
        Token lv_defaultCorrections_10_0=null;
        Token otherlv_13=null;
        EObject lv_remediations_11_0 = null;

        EObject lv_modelUsages_12_0 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:532:2: ( ( () otherlv_1= 'gen' otherlv_2= '{' ( (otherlv_3= 'initialInstruction' ( (lv_initialInstructions_4_0= RULE_STRING ) ) ) | (otherlv_5= 'maxRetries' ( (lv_maxRetries_6_0= RULE_INT ) ) ) | (otherlv_7= 'parseCheck' ( ( (lv_parseChecks_8_1= 'true' | lv_parseChecks_8_2= 'false' ) ) ) ) | (otherlv_9= 'defaultCorrection' ( (lv_defaultCorrections_10_0= RULE_STRING ) ) ) | ( (lv_remediations_11_0= ruleGenRemediationRules ) ) | ( (lv_modelUsages_12_0= ruleGenUsageBlock ) ) )* otherlv_13= '}' ) )
            // InternalLibrettoProjectProfile.g:533:2: ( () otherlv_1= 'gen' otherlv_2= '{' ( (otherlv_3= 'initialInstruction' ( (lv_initialInstructions_4_0= RULE_STRING ) ) ) | (otherlv_5= 'maxRetries' ( (lv_maxRetries_6_0= RULE_INT ) ) ) | (otherlv_7= 'parseCheck' ( ( (lv_parseChecks_8_1= 'true' | lv_parseChecks_8_2= 'false' ) ) ) ) | (otherlv_9= 'defaultCorrection' ( (lv_defaultCorrections_10_0= RULE_STRING ) ) ) | ( (lv_remediations_11_0= ruleGenRemediationRules ) ) | ( (lv_modelUsages_12_0= ruleGenUsageBlock ) ) )* otherlv_13= '}' )
            {
            // InternalLibrettoProjectProfile.g:533:2: ( () otherlv_1= 'gen' otherlv_2= '{' ( (otherlv_3= 'initialInstruction' ( (lv_initialInstructions_4_0= RULE_STRING ) ) ) | (otherlv_5= 'maxRetries' ( (lv_maxRetries_6_0= RULE_INT ) ) ) | (otherlv_7= 'parseCheck' ( ( (lv_parseChecks_8_1= 'true' | lv_parseChecks_8_2= 'false' ) ) ) ) | (otherlv_9= 'defaultCorrection' ( (lv_defaultCorrections_10_0= RULE_STRING ) ) ) | ( (lv_remediations_11_0= ruleGenRemediationRules ) ) | ( (lv_modelUsages_12_0= ruleGenUsageBlock ) ) )* otherlv_13= '}' )
            // InternalLibrettoProjectProfile.g:534:3: () otherlv_1= 'gen' otherlv_2= '{' ( (otherlv_3= 'initialInstruction' ( (lv_initialInstructions_4_0= RULE_STRING ) ) ) | (otherlv_5= 'maxRetries' ( (lv_maxRetries_6_0= RULE_INT ) ) ) | (otherlv_7= 'parseCheck' ( ( (lv_parseChecks_8_1= 'true' | lv_parseChecks_8_2= 'false' ) ) ) ) | (otherlv_9= 'defaultCorrection' ( (lv_defaultCorrections_10_0= RULE_STRING ) ) ) | ( (lv_remediations_11_0= ruleGenRemediationRules ) ) | ( (lv_modelUsages_12_0= ruleGenUsageBlock ) ) )* otherlv_13= '}'
            {
            // InternalLibrettoProjectProfile.g:534:3: ()
            // InternalLibrettoProjectProfile.g:535:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGenBlockAccess().getGenBlockAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getGenBlockAccess().getGenKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getGenBlockAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLibrettoProjectProfile.g:549:3: ( (otherlv_3= 'initialInstruction' ( (lv_initialInstructions_4_0= RULE_STRING ) ) ) | (otherlv_5= 'maxRetries' ( (lv_maxRetries_6_0= RULE_INT ) ) ) | (otherlv_7= 'parseCheck' ( ( (lv_parseChecks_8_1= 'true' | lv_parseChecks_8_2= 'false' ) ) ) ) | (otherlv_9= 'defaultCorrection' ( (lv_defaultCorrections_10_0= RULE_STRING ) ) ) | ( (lv_remediations_11_0= ruleGenRemediationRules ) ) | ( (lv_modelUsages_12_0= ruleGenUsageBlock ) ) )*
            loop6:
            do {
                int alt6=7;
                switch ( input.LA(1) ) {
                case 24:
                    {
                    alt6=1;
                    }
                    break;
                case 25:
                    {
                    alt6=2;
                    }
                    break;
                case 26:
                    {
                    alt6=3;
                    }
                    break;
                case 29:
                    {
                    alt6=4;
                    }
                    break;
                case 30:
                    {
                    alt6=5;
                    }
                    break;
                case 45:
                    {
                    alt6=6;
                    }
                    break;

                }

                switch (alt6) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:550:4: (otherlv_3= 'initialInstruction' ( (lv_initialInstructions_4_0= RULE_STRING ) ) )
            	    {
            	    // InternalLibrettoProjectProfile.g:550:4: (otherlv_3= 'initialInstruction' ( (lv_initialInstructions_4_0= RULE_STRING ) ) )
            	    // InternalLibrettoProjectProfile.g:551:5: otherlv_3= 'initialInstruction' ( (lv_initialInstructions_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,24,FOLLOW_7); 

            	    					newLeafNode(otherlv_3, grammarAccess.getGenBlockAccess().getInitialInstructionKeyword_3_0_0());
            	    				
            	    // InternalLibrettoProjectProfile.g:555:5: ( (lv_initialInstructions_4_0= RULE_STRING ) )
            	    // InternalLibrettoProjectProfile.g:556:6: (lv_initialInstructions_4_0= RULE_STRING )
            	    {
            	    // InternalLibrettoProjectProfile.g:556:6: (lv_initialInstructions_4_0= RULE_STRING )
            	    // InternalLibrettoProjectProfile.g:557:7: lv_initialInstructions_4_0= RULE_STRING
            	    {
            	    lv_initialInstructions_4_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            	    							newLeafNode(lv_initialInstructions_4_0, grammarAccess.getGenBlockAccess().getInitialInstructionsSTRINGTerminalRuleCall_3_0_1_0());
            	    						

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getGenBlockRule());
            	    							}
            	    							addWithLastConsumed(
            	    								current,
            	    								"initialInstructions",
            	    								lv_initialInstructions_4_0,
            	    								"org.eclipse.xtext.common.Terminals.STRING");
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalLibrettoProjectProfile.g:575:4: (otherlv_5= 'maxRetries' ( (lv_maxRetries_6_0= RULE_INT ) ) )
            	    {
            	    // InternalLibrettoProjectProfile.g:575:4: (otherlv_5= 'maxRetries' ( (lv_maxRetries_6_0= RULE_INT ) ) )
            	    // InternalLibrettoProjectProfile.g:576:5: otherlv_5= 'maxRetries' ( (lv_maxRetries_6_0= RULE_INT ) )
            	    {
            	    otherlv_5=(Token)match(input,25,FOLLOW_11); 

            	    					newLeafNode(otherlv_5, grammarAccess.getGenBlockAccess().getMaxRetriesKeyword_3_1_0());
            	    				
            	    // InternalLibrettoProjectProfile.g:580:5: ( (lv_maxRetries_6_0= RULE_INT ) )
            	    // InternalLibrettoProjectProfile.g:581:6: (lv_maxRetries_6_0= RULE_INT )
            	    {
            	    // InternalLibrettoProjectProfile.g:581:6: (lv_maxRetries_6_0= RULE_INT )
            	    // InternalLibrettoProjectProfile.g:582:7: lv_maxRetries_6_0= RULE_INT
            	    {
            	    lv_maxRetries_6_0=(Token)match(input,RULE_INT,FOLLOW_10); 

            	    							newLeafNode(lv_maxRetries_6_0, grammarAccess.getGenBlockAccess().getMaxRetriesINTTerminalRuleCall_3_1_1_0());
            	    						

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getGenBlockRule());
            	    							}
            	    							addWithLastConsumed(
            	    								current,
            	    								"maxRetries",
            	    								lv_maxRetries_6_0,
            	    								"org.eclipse.xtext.common.Terminals.INT");
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalLibrettoProjectProfile.g:600:4: (otherlv_7= 'parseCheck' ( ( (lv_parseChecks_8_1= 'true' | lv_parseChecks_8_2= 'false' ) ) ) )
            	    {
            	    // InternalLibrettoProjectProfile.g:600:4: (otherlv_7= 'parseCheck' ( ( (lv_parseChecks_8_1= 'true' | lv_parseChecks_8_2= 'false' ) ) ) )
            	    // InternalLibrettoProjectProfile.g:601:5: otherlv_7= 'parseCheck' ( ( (lv_parseChecks_8_1= 'true' | lv_parseChecks_8_2= 'false' ) ) )
            	    {
            	    otherlv_7=(Token)match(input,26,FOLLOW_12); 

            	    					newLeafNode(otherlv_7, grammarAccess.getGenBlockAccess().getParseCheckKeyword_3_2_0());
            	    				
            	    // InternalLibrettoProjectProfile.g:605:5: ( ( (lv_parseChecks_8_1= 'true' | lv_parseChecks_8_2= 'false' ) ) )
            	    // InternalLibrettoProjectProfile.g:606:6: ( (lv_parseChecks_8_1= 'true' | lv_parseChecks_8_2= 'false' ) )
            	    {
            	    // InternalLibrettoProjectProfile.g:606:6: ( (lv_parseChecks_8_1= 'true' | lv_parseChecks_8_2= 'false' ) )
            	    // InternalLibrettoProjectProfile.g:607:7: (lv_parseChecks_8_1= 'true' | lv_parseChecks_8_2= 'false' )
            	    {
            	    // InternalLibrettoProjectProfile.g:607:7: (lv_parseChecks_8_1= 'true' | lv_parseChecks_8_2= 'false' )
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==27) ) {
            	        alt5=1;
            	    }
            	    else if ( (LA5_0==28) ) {
            	        alt5=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 5, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // InternalLibrettoProjectProfile.g:608:8: lv_parseChecks_8_1= 'true'
            	            {
            	            lv_parseChecks_8_1=(Token)match(input,27,FOLLOW_10); 

            	            								newLeafNode(lv_parseChecks_8_1, grammarAccess.getGenBlockAccess().getParseChecksTrueKeyword_3_2_1_0_0());
            	            							

            	            								if (current==null) {
            	            									current = createModelElement(grammarAccess.getGenBlockRule());
            	            								}
            	            								addWithLastConsumed(current, "parseChecks", lv_parseChecks_8_1, null);
            	            							

            	            }
            	            break;
            	        case 2 :
            	            // InternalLibrettoProjectProfile.g:619:8: lv_parseChecks_8_2= 'false'
            	            {
            	            lv_parseChecks_8_2=(Token)match(input,28,FOLLOW_10); 

            	            								newLeafNode(lv_parseChecks_8_2, grammarAccess.getGenBlockAccess().getParseChecksFalseKeyword_3_2_1_0_1());
            	            							

            	            								if (current==null) {
            	            									current = createModelElement(grammarAccess.getGenBlockRule());
            	            								}
            	            								addWithLastConsumed(current, "parseChecks", lv_parseChecks_8_2, null);
            	            							

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalLibrettoProjectProfile.g:634:4: (otherlv_9= 'defaultCorrection' ( (lv_defaultCorrections_10_0= RULE_STRING ) ) )
            	    {
            	    // InternalLibrettoProjectProfile.g:634:4: (otherlv_9= 'defaultCorrection' ( (lv_defaultCorrections_10_0= RULE_STRING ) ) )
            	    // InternalLibrettoProjectProfile.g:635:5: otherlv_9= 'defaultCorrection' ( (lv_defaultCorrections_10_0= RULE_STRING ) )
            	    {
            	    otherlv_9=(Token)match(input,29,FOLLOW_7); 

            	    					newLeafNode(otherlv_9, grammarAccess.getGenBlockAccess().getDefaultCorrectionKeyword_3_3_0());
            	    				
            	    // InternalLibrettoProjectProfile.g:639:5: ( (lv_defaultCorrections_10_0= RULE_STRING ) )
            	    // InternalLibrettoProjectProfile.g:640:6: (lv_defaultCorrections_10_0= RULE_STRING )
            	    {
            	    // InternalLibrettoProjectProfile.g:640:6: (lv_defaultCorrections_10_0= RULE_STRING )
            	    // InternalLibrettoProjectProfile.g:641:7: lv_defaultCorrections_10_0= RULE_STRING
            	    {
            	    lv_defaultCorrections_10_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            	    							newLeafNode(lv_defaultCorrections_10_0, grammarAccess.getGenBlockAccess().getDefaultCorrectionsSTRINGTerminalRuleCall_3_3_1_0());
            	    						

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getGenBlockRule());
            	    							}
            	    							addWithLastConsumed(
            	    								current,
            	    								"defaultCorrections",
            	    								lv_defaultCorrections_10_0,
            	    								"org.eclipse.xtext.common.Terminals.STRING");
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalLibrettoProjectProfile.g:659:4: ( (lv_remediations_11_0= ruleGenRemediationRules ) )
            	    {
            	    // InternalLibrettoProjectProfile.g:659:4: ( (lv_remediations_11_0= ruleGenRemediationRules ) )
            	    // InternalLibrettoProjectProfile.g:660:5: (lv_remediations_11_0= ruleGenRemediationRules )
            	    {
            	    // InternalLibrettoProjectProfile.g:660:5: (lv_remediations_11_0= ruleGenRemediationRules )
            	    // InternalLibrettoProjectProfile.g:661:6: lv_remediations_11_0= ruleGenRemediationRules
            	    {

            	    						newCompositeNode(grammarAccess.getGenBlockAccess().getRemediationsGenRemediationRulesParserRuleCall_3_4_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_remediations_11_0=ruleGenRemediationRules();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGenBlockRule());
            	    						}
            	    						add(
            	    							current,
            	    							"remediations",
            	    							lv_remediations_11_0,
            	    							"com.robenglander.libretto.spec.LibrettoProjectProfile.GenRemediationRules");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalLibrettoProjectProfile.g:679:4: ( (lv_modelUsages_12_0= ruleGenUsageBlock ) )
            	    {
            	    // InternalLibrettoProjectProfile.g:679:4: ( (lv_modelUsages_12_0= ruleGenUsageBlock ) )
            	    // InternalLibrettoProjectProfile.g:680:5: (lv_modelUsages_12_0= ruleGenUsageBlock )
            	    {
            	    // InternalLibrettoProjectProfile.g:680:5: (lv_modelUsages_12_0= ruleGenUsageBlock )
            	    // InternalLibrettoProjectProfile.g:681:6: lv_modelUsages_12_0= ruleGenUsageBlock
            	    {

            	    						newCompositeNode(grammarAccess.getGenBlockAccess().getModelUsagesGenUsageBlockParserRuleCall_3_5_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_modelUsages_12_0=ruleGenUsageBlock();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGenBlockRule());
            	    						}
            	    						add(
            	    							current,
            	    							"modelUsages",
            	    							lv_modelUsages_12_0,
            	    							"com.robenglander.libretto.spec.LibrettoProjectProfile.GenUsageBlock");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_13=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getGenBlockAccess().getRightCurlyBracketKeyword_4());
            		

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


    // $ANTLR start "entryRuleGenRemediationRules"
    // InternalLibrettoProjectProfile.g:707:1: entryRuleGenRemediationRules returns [EObject current=null] : iv_ruleGenRemediationRules= ruleGenRemediationRules EOF ;
    public final EObject entryRuleGenRemediationRules() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenRemediationRules = null;


        try {
            // InternalLibrettoProjectProfile.g:707:60: (iv_ruleGenRemediationRules= ruleGenRemediationRules EOF )
            // InternalLibrettoProjectProfile.g:708:2: iv_ruleGenRemediationRules= ruleGenRemediationRules EOF
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
    // InternalLibrettoProjectProfile.g:714:1: ruleGenRemediationRules returns [EObject current=null] : ( () otherlv_1= 'rules' otherlv_2= '{' ( ( (lv_patternRules_3_0= ruleGenPatternRemediationRule ) ) ( (lv_defaultRemediations_4_0= ruleGenDefaultRemediationRule ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleGenRemediationRules() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_patternRules_3_0 = null;

        EObject lv_defaultRemediations_4_0 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:720:2: ( ( () otherlv_1= 'rules' otherlv_2= '{' ( ( (lv_patternRules_3_0= ruleGenPatternRemediationRule ) ) ( (lv_defaultRemediations_4_0= ruleGenDefaultRemediationRule ) ) )* otherlv_5= '}' ) )
            // InternalLibrettoProjectProfile.g:721:2: ( () otherlv_1= 'rules' otherlv_2= '{' ( ( (lv_patternRules_3_0= ruleGenPatternRemediationRule ) ) ( (lv_defaultRemediations_4_0= ruleGenDefaultRemediationRule ) ) )* otherlv_5= '}' )
            {
            // InternalLibrettoProjectProfile.g:721:2: ( () otherlv_1= 'rules' otherlv_2= '{' ( ( (lv_patternRules_3_0= ruleGenPatternRemediationRule ) ) ( (lv_defaultRemediations_4_0= ruleGenDefaultRemediationRule ) ) )* otherlv_5= '}' )
            // InternalLibrettoProjectProfile.g:722:3: () otherlv_1= 'rules' otherlv_2= '{' ( ( (lv_patternRules_3_0= ruleGenPatternRemediationRule ) ) ( (lv_defaultRemediations_4_0= ruleGenDefaultRemediationRule ) ) )* otherlv_5= '}'
            {
            // InternalLibrettoProjectProfile.g:722:3: ()
            // InternalLibrettoProjectProfile.g:723:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGenRemediationRulesAccess().getGenRemediationRulesAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getGenRemediationRulesAccess().getRulesKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getGenRemediationRulesAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLibrettoProjectProfile.g:737:3: ( ( (lv_patternRules_3_0= ruleGenPatternRemediationRule ) ) ( (lv_defaultRemediations_4_0= ruleGenDefaultRemediationRule ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==31) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:738:4: ( (lv_patternRules_3_0= ruleGenPatternRemediationRule ) ) ( (lv_defaultRemediations_4_0= ruleGenDefaultRemediationRule ) )
            	    {
            	    // InternalLibrettoProjectProfile.g:738:4: ( (lv_patternRules_3_0= ruleGenPatternRemediationRule ) )
            	    // InternalLibrettoProjectProfile.g:739:5: (lv_patternRules_3_0= ruleGenPatternRemediationRule )
            	    {
            	    // InternalLibrettoProjectProfile.g:739:5: (lv_patternRules_3_0= ruleGenPatternRemediationRule )
            	    // InternalLibrettoProjectProfile.g:740:6: lv_patternRules_3_0= ruleGenPatternRemediationRule
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

            	    // InternalLibrettoProjectProfile.g:757:4: ( (lv_defaultRemediations_4_0= ruleGenDefaultRemediationRule ) )
            	    // InternalLibrettoProjectProfile.g:758:5: (lv_defaultRemediations_4_0= ruleGenDefaultRemediationRule )
            	    {
            	    // InternalLibrettoProjectProfile.g:758:5: (lv_defaultRemediations_4_0= ruleGenDefaultRemediationRule )
            	    // InternalLibrettoProjectProfile.g:759:6: lv_defaultRemediations_4_0= ruleGenDefaultRemediationRule
            	    {

            	    						newCompositeNode(grammarAccess.getGenRemediationRulesAccess().getDefaultRemediationsGenDefaultRemediationRuleParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_13);
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
            	    break loop7;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

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


    // $ANTLR start "entryRuleGenPatternRemediationRule"
    // InternalLibrettoProjectProfile.g:785:1: entryRuleGenPatternRemediationRule returns [EObject current=null] : iv_ruleGenPatternRemediationRule= ruleGenPatternRemediationRule EOF ;
    public final EObject entryRuleGenPatternRemediationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenPatternRemediationRule = null;


        try {
            // InternalLibrettoProjectProfile.g:785:66: (iv_ruleGenPatternRemediationRule= ruleGenPatternRemediationRule EOF )
            // InternalLibrettoProjectProfile.g:786:2: iv_ruleGenPatternRemediationRule= ruleGenPatternRemediationRule EOF
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
    // InternalLibrettoProjectProfile.g:792:1: ruleGenPatternRemediationRule returns [EObject current=null] : ( () otherlv_1= 'rule' otherlv_2= '{' ( (otherlv_3= 'pattern' ( (lv_patterns_4_0= RULE_STRING ) ) ) | (otherlv_5= 'code' ( (lv_codes_6_0= RULE_STRING ) ) ) | (otherlv_7= 'correction' ( (lv_corrections_8_0= RULE_STRING ) ) ) )* otherlv_9= '}' ) ;
    public final EObject ruleGenPatternRemediationRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_patterns_4_0=null;
        Token otherlv_5=null;
        Token lv_codes_6_0=null;
        Token otherlv_7=null;
        Token lv_corrections_8_0=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:798:2: ( ( () otherlv_1= 'rule' otherlv_2= '{' ( (otherlv_3= 'pattern' ( (lv_patterns_4_0= RULE_STRING ) ) ) | (otherlv_5= 'code' ( (lv_codes_6_0= RULE_STRING ) ) ) | (otherlv_7= 'correction' ( (lv_corrections_8_0= RULE_STRING ) ) ) )* otherlv_9= '}' ) )
            // InternalLibrettoProjectProfile.g:799:2: ( () otherlv_1= 'rule' otherlv_2= '{' ( (otherlv_3= 'pattern' ( (lv_patterns_4_0= RULE_STRING ) ) ) | (otherlv_5= 'code' ( (lv_codes_6_0= RULE_STRING ) ) ) | (otherlv_7= 'correction' ( (lv_corrections_8_0= RULE_STRING ) ) ) )* otherlv_9= '}' )
            {
            // InternalLibrettoProjectProfile.g:799:2: ( () otherlv_1= 'rule' otherlv_2= '{' ( (otherlv_3= 'pattern' ( (lv_patterns_4_0= RULE_STRING ) ) ) | (otherlv_5= 'code' ( (lv_codes_6_0= RULE_STRING ) ) ) | (otherlv_7= 'correction' ( (lv_corrections_8_0= RULE_STRING ) ) ) )* otherlv_9= '}' )
            // InternalLibrettoProjectProfile.g:800:3: () otherlv_1= 'rule' otherlv_2= '{' ( (otherlv_3= 'pattern' ( (lv_patterns_4_0= RULE_STRING ) ) ) | (otherlv_5= 'code' ( (lv_codes_6_0= RULE_STRING ) ) ) | (otherlv_7= 'correction' ( (lv_corrections_8_0= RULE_STRING ) ) ) )* otherlv_9= '}'
            {
            // InternalLibrettoProjectProfile.g:800:3: ()
            // InternalLibrettoProjectProfile.g:801:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGenPatternRemediationRuleAccess().getGenPatternRemediationRuleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getGenPatternRemediationRuleAccess().getRuleKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getGenPatternRemediationRuleAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLibrettoProjectProfile.g:815:3: ( (otherlv_3= 'pattern' ( (lv_patterns_4_0= RULE_STRING ) ) ) | (otherlv_5= 'code' ( (lv_codes_6_0= RULE_STRING ) ) ) | (otherlv_7= 'correction' ( (lv_corrections_8_0= RULE_STRING ) ) ) )*
            loop8:
            do {
                int alt8=4;
                switch ( input.LA(1) ) {
                case 32:
                    {
                    alt8=1;
                    }
                    break;
                case 33:
                    {
                    alt8=2;
                    }
                    break;
                case 34:
                    {
                    alt8=3;
                    }
                    break;

                }

                switch (alt8) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:816:4: (otherlv_3= 'pattern' ( (lv_patterns_4_0= RULE_STRING ) ) )
            	    {
            	    // InternalLibrettoProjectProfile.g:816:4: (otherlv_3= 'pattern' ( (lv_patterns_4_0= RULE_STRING ) ) )
            	    // InternalLibrettoProjectProfile.g:817:5: otherlv_3= 'pattern' ( (lv_patterns_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,32,FOLLOW_7); 

            	    					newLeafNode(otherlv_3, grammarAccess.getGenPatternRemediationRuleAccess().getPatternKeyword_3_0_0());
            	    				
            	    // InternalLibrettoProjectProfile.g:821:5: ( (lv_patterns_4_0= RULE_STRING ) )
            	    // InternalLibrettoProjectProfile.g:822:6: (lv_patterns_4_0= RULE_STRING )
            	    {
            	    // InternalLibrettoProjectProfile.g:822:6: (lv_patterns_4_0= RULE_STRING )
            	    // InternalLibrettoProjectProfile.g:823:7: lv_patterns_4_0= RULE_STRING
            	    {
            	    lv_patterns_4_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            	    							newLeafNode(lv_patterns_4_0, grammarAccess.getGenPatternRemediationRuleAccess().getPatternsSTRINGTerminalRuleCall_3_0_1_0());
            	    						

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getGenPatternRemediationRuleRule());
            	    							}
            	    							addWithLastConsumed(
            	    								current,
            	    								"patterns",
            	    								lv_patterns_4_0,
            	    								"org.eclipse.xtext.common.Terminals.STRING");
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalLibrettoProjectProfile.g:841:4: (otherlv_5= 'code' ( (lv_codes_6_0= RULE_STRING ) ) )
            	    {
            	    // InternalLibrettoProjectProfile.g:841:4: (otherlv_5= 'code' ( (lv_codes_6_0= RULE_STRING ) ) )
            	    // InternalLibrettoProjectProfile.g:842:5: otherlv_5= 'code' ( (lv_codes_6_0= RULE_STRING ) )
            	    {
            	    otherlv_5=(Token)match(input,33,FOLLOW_7); 

            	    					newLeafNode(otherlv_5, grammarAccess.getGenPatternRemediationRuleAccess().getCodeKeyword_3_1_0());
            	    				
            	    // InternalLibrettoProjectProfile.g:846:5: ( (lv_codes_6_0= RULE_STRING ) )
            	    // InternalLibrettoProjectProfile.g:847:6: (lv_codes_6_0= RULE_STRING )
            	    {
            	    // InternalLibrettoProjectProfile.g:847:6: (lv_codes_6_0= RULE_STRING )
            	    // InternalLibrettoProjectProfile.g:848:7: lv_codes_6_0= RULE_STRING
            	    {
            	    lv_codes_6_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            	    							newLeafNode(lv_codes_6_0, grammarAccess.getGenPatternRemediationRuleAccess().getCodesSTRINGTerminalRuleCall_3_1_1_0());
            	    						

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getGenPatternRemediationRuleRule());
            	    							}
            	    							addWithLastConsumed(
            	    								current,
            	    								"codes",
            	    								lv_codes_6_0,
            	    								"org.eclipse.xtext.common.Terminals.STRING");
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalLibrettoProjectProfile.g:866:4: (otherlv_7= 'correction' ( (lv_corrections_8_0= RULE_STRING ) ) )
            	    {
            	    // InternalLibrettoProjectProfile.g:866:4: (otherlv_7= 'correction' ( (lv_corrections_8_0= RULE_STRING ) ) )
            	    // InternalLibrettoProjectProfile.g:867:5: otherlv_7= 'correction' ( (lv_corrections_8_0= RULE_STRING ) )
            	    {
            	    otherlv_7=(Token)match(input,34,FOLLOW_7); 

            	    					newLeafNode(otherlv_7, grammarAccess.getGenPatternRemediationRuleAccess().getCorrectionKeyword_3_2_0());
            	    				
            	    // InternalLibrettoProjectProfile.g:871:5: ( (lv_corrections_8_0= RULE_STRING ) )
            	    // InternalLibrettoProjectProfile.g:872:6: (lv_corrections_8_0= RULE_STRING )
            	    {
            	    // InternalLibrettoProjectProfile.g:872:6: (lv_corrections_8_0= RULE_STRING )
            	    // InternalLibrettoProjectProfile.g:873:7: lv_corrections_8_0= RULE_STRING
            	    {
            	    lv_corrections_8_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            	    							newLeafNode(lv_corrections_8_0, grammarAccess.getGenPatternRemediationRuleAccess().getCorrectionsSTRINGTerminalRuleCall_3_2_1_0());
            	    						

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getGenPatternRemediationRuleRule());
            	    							}
            	    							addWithLastConsumed(
            	    								current,
            	    								"corrections",
            	    								lv_corrections_8_0,
            	    								"org.eclipse.xtext.common.Terminals.STRING");
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_9=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getGenPatternRemediationRuleAccess().getRightCurlyBracketKeyword_4());
            		

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


    // $ANTLR start "entryRuleGenDefaultRemediationRule"
    // InternalLibrettoProjectProfile.g:899:1: entryRuleGenDefaultRemediationRule returns [EObject current=null] : iv_ruleGenDefaultRemediationRule= ruleGenDefaultRemediationRule EOF ;
    public final EObject entryRuleGenDefaultRemediationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenDefaultRemediationRule = null;


        try {
            // InternalLibrettoProjectProfile.g:899:66: (iv_ruleGenDefaultRemediationRule= ruleGenDefaultRemediationRule EOF )
            // InternalLibrettoProjectProfile.g:900:2: iv_ruleGenDefaultRemediationRule= ruleGenDefaultRemediationRule EOF
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
    // InternalLibrettoProjectProfile.g:906:1: ruleGenDefaultRemediationRule returns [EObject current=null] : ( () otherlv_1= 'default' otherlv_2= '{' ( (otherlv_3= 'code' ( (lv_codes_4_0= RULE_STRING ) ) ) | (otherlv_5= 'correction' ( (lv_correction_6_0= RULE_STRING ) ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleGenDefaultRemediationRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_codes_4_0=null;
        Token otherlv_5=null;
        Token lv_correction_6_0=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:912:2: ( ( () otherlv_1= 'default' otherlv_2= '{' ( (otherlv_3= 'code' ( (lv_codes_4_0= RULE_STRING ) ) ) | (otherlv_5= 'correction' ( (lv_correction_6_0= RULE_STRING ) ) ) )* otherlv_7= '}' ) )
            // InternalLibrettoProjectProfile.g:913:2: ( () otherlv_1= 'default' otherlv_2= '{' ( (otherlv_3= 'code' ( (lv_codes_4_0= RULE_STRING ) ) ) | (otherlv_5= 'correction' ( (lv_correction_6_0= RULE_STRING ) ) ) )* otherlv_7= '}' )
            {
            // InternalLibrettoProjectProfile.g:913:2: ( () otherlv_1= 'default' otherlv_2= '{' ( (otherlv_3= 'code' ( (lv_codes_4_0= RULE_STRING ) ) ) | (otherlv_5= 'correction' ( (lv_correction_6_0= RULE_STRING ) ) ) )* otherlv_7= '}' )
            // InternalLibrettoProjectProfile.g:914:3: () otherlv_1= 'default' otherlv_2= '{' ( (otherlv_3= 'code' ( (lv_codes_4_0= RULE_STRING ) ) ) | (otherlv_5= 'correction' ( (lv_correction_6_0= RULE_STRING ) ) ) )* otherlv_7= '}'
            {
            // InternalLibrettoProjectProfile.g:914:3: ()
            // InternalLibrettoProjectProfile.g:915:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGenDefaultRemediationRuleAccess().getGenDefaultRemediationRuleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getGenDefaultRemediationRuleAccess().getDefaultKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getGenDefaultRemediationRuleAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLibrettoProjectProfile.g:929:3: ( (otherlv_3= 'code' ( (lv_codes_4_0= RULE_STRING ) ) ) | (otherlv_5= 'correction' ( (lv_correction_6_0= RULE_STRING ) ) ) )*
            loop9:
            do {
                int alt9=3;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==33) ) {
                    alt9=1;
                }
                else if ( (LA9_0==34) ) {
                    alt9=2;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:930:4: (otherlv_3= 'code' ( (lv_codes_4_0= RULE_STRING ) ) )
            	    {
            	    // InternalLibrettoProjectProfile.g:930:4: (otherlv_3= 'code' ( (lv_codes_4_0= RULE_STRING ) ) )
            	    // InternalLibrettoProjectProfile.g:931:5: otherlv_3= 'code' ( (lv_codes_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,33,FOLLOW_7); 

            	    					newLeafNode(otherlv_3, grammarAccess.getGenDefaultRemediationRuleAccess().getCodeKeyword_3_0_0());
            	    				
            	    // InternalLibrettoProjectProfile.g:935:5: ( (lv_codes_4_0= RULE_STRING ) )
            	    // InternalLibrettoProjectProfile.g:936:6: (lv_codes_4_0= RULE_STRING )
            	    {
            	    // InternalLibrettoProjectProfile.g:936:6: (lv_codes_4_0= RULE_STRING )
            	    // InternalLibrettoProjectProfile.g:937:7: lv_codes_4_0= RULE_STRING
            	    {
            	    lv_codes_4_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            	    							newLeafNode(lv_codes_4_0, grammarAccess.getGenDefaultRemediationRuleAccess().getCodesSTRINGTerminalRuleCall_3_0_1_0());
            	    						

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getGenDefaultRemediationRuleRule());
            	    							}
            	    							addWithLastConsumed(
            	    								current,
            	    								"codes",
            	    								lv_codes_4_0,
            	    								"org.eclipse.xtext.common.Terminals.STRING");
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalLibrettoProjectProfile.g:955:4: (otherlv_5= 'correction' ( (lv_correction_6_0= RULE_STRING ) ) )
            	    {
            	    // InternalLibrettoProjectProfile.g:955:4: (otherlv_5= 'correction' ( (lv_correction_6_0= RULE_STRING ) ) )
            	    // InternalLibrettoProjectProfile.g:956:5: otherlv_5= 'correction' ( (lv_correction_6_0= RULE_STRING ) )
            	    {
            	    otherlv_5=(Token)match(input,34,FOLLOW_7); 

            	    					newLeafNode(otherlv_5, grammarAccess.getGenDefaultRemediationRuleAccess().getCorrectionKeyword_3_1_0());
            	    				
            	    // InternalLibrettoProjectProfile.g:960:5: ( (lv_correction_6_0= RULE_STRING ) )
            	    // InternalLibrettoProjectProfile.g:961:6: (lv_correction_6_0= RULE_STRING )
            	    {
            	    // InternalLibrettoProjectProfile.g:961:6: (lv_correction_6_0= RULE_STRING )
            	    // InternalLibrettoProjectProfile.g:962:7: lv_correction_6_0= RULE_STRING
            	    {
            	    lv_correction_6_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            	    							newLeafNode(lv_correction_6_0, grammarAccess.getGenDefaultRemediationRuleAccess().getCorrectionSTRINGTerminalRuleCall_3_1_1_0());
            	    						

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getGenDefaultRemediationRuleRule());
            	    							}
            	    							addWithLastConsumed(
            	    								current,
            	    								"correction",
            	    								lv_correction_6_0,
            	    								"org.eclipse.xtext.common.Terminals.STRING");
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getGenDefaultRemediationRuleAccess().getRightCurlyBracketKeyword_4());
            		

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


    // $ANTLR start "entryRuleLlmProvidersBlock"
    // InternalLibrettoProjectProfile.g:988:1: entryRuleLlmProvidersBlock returns [EObject current=null] : iv_ruleLlmProvidersBlock= ruleLlmProvidersBlock EOF ;
    public final EObject entryRuleLlmProvidersBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLlmProvidersBlock = null;


        try {
            // InternalLibrettoProjectProfile.g:988:58: (iv_ruleLlmProvidersBlock= ruleLlmProvidersBlock EOF )
            // InternalLibrettoProjectProfile.g:989:2: iv_ruleLlmProvidersBlock= ruleLlmProvidersBlock EOF
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
    // InternalLibrettoProjectProfile.g:995:1: ruleLlmProvidersBlock returns [EObject current=null] : ( () otherlv_1= 'llmProviders' otherlv_2= '{' ( (lv_providers_3_0= ruleNamedLlmProvider ) )* otherlv_4= '}' ) ;
    public final EObject ruleLlmProvidersBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_providers_3_0 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:1001:2: ( ( () otherlv_1= 'llmProviders' otherlv_2= '{' ( (lv_providers_3_0= ruleNamedLlmProvider ) )* otherlv_4= '}' ) )
            // InternalLibrettoProjectProfile.g:1002:2: ( () otherlv_1= 'llmProviders' otherlv_2= '{' ( (lv_providers_3_0= ruleNamedLlmProvider ) )* otherlv_4= '}' )
            {
            // InternalLibrettoProjectProfile.g:1002:2: ( () otherlv_1= 'llmProviders' otherlv_2= '{' ( (lv_providers_3_0= ruleNamedLlmProvider ) )* otherlv_4= '}' )
            // InternalLibrettoProjectProfile.g:1003:3: () otherlv_1= 'llmProviders' otherlv_2= '{' ( (lv_providers_3_0= ruleNamedLlmProvider ) )* otherlv_4= '}'
            {
            // InternalLibrettoProjectProfile.g:1003:3: ()
            // InternalLibrettoProjectProfile.g:1004:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLlmProvidersBlockAccess().getLlmProvidersBlockAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getLlmProvidersBlockAccess().getLlmProvidersKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getLlmProvidersBlockAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLibrettoProjectProfile.g:1018:3: ( (lv_providers_3_0= ruleNamedLlmProvider ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==37) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:1019:4: (lv_providers_3_0= ruleNamedLlmProvider )
            	    {
            	    // InternalLibrettoProjectProfile.g:1019:4: (lv_providers_3_0= ruleNamedLlmProvider )
            	    // InternalLibrettoProjectProfile.g:1020:5: lv_providers_3_0= ruleNamedLlmProvider
            	    {

            	    					newCompositeNode(grammarAccess.getLlmProvidersBlockAccess().getProvidersNamedLlmProviderParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_providers_3_0=ruleNamedLlmProvider();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLlmProvidersBlockRule());
            	    					}
            	    					add(
            	    						current,
            	    						"providers",
            	    						lv_providers_3_0,
            	    						"com.robenglander.libretto.spec.LibrettoProjectProfile.NamedLlmProvider");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

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


    // $ANTLR start "entryRuleNamedLlmProvider"
    // InternalLibrettoProjectProfile.g:1045:1: entryRuleNamedLlmProvider returns [EObject current=null] : iv_ruleNamedLlmProvider= ruleNamedLlmProvider EOF ;
    public final EObject entryRuleNamedLlmProvider() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedLlmProvider = null;


        try {
            // InternalLibrettoProjectProfile.g:1045:57: (iv_ruleNamedLlmProvider= ruleNamedLlmProvider EOF )
            // InternalLibrettoProjectProfile.g:1046:2: iv_ruleNamedLlmProvider= ruleNamedLlmProvider EOF
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
    // InternalLibrettoProjectProfile.g:1052:1: ruleNamedLlmProvider returns [EObject current=null] : (otherlv_0= 'provider' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( (otherlv_3= 'kind' ( ( (lv_kinds_4_1= 'local' | lv_kinds_4_2= 'openai' | lv_kinds_4_3= 'ollama' ) ) ) ) | (otherlv_5= 'localModelPath' ( (lv_localModelPaths_6_0= RULE_STRING ) ) ) | (otherlv_7= 'model' ( (lv_models_8_0= RULE_STRING ) ) ) | (otherlv_9= 'endpoint' ( (lv_endpoints_10_0= RULE_STRING ) ) ) )* otherlv_11= '}' ) ;
    public final EObject ruleNamedLlmProvider() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_kinds_4_1=null;
        Token lv_kinds_4_2=null;
        Token lv_kinds_4_3=null;
        Token otherlv_5=null;
        Token lv_localModelPaths_6_0=null;
        Token otherlv_7=null;
        Token lv_models_8_0=null;
        Token otherlv_9=null;
        Token lv_endpoints_10_0=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:1058:2: ( (otherlv_0= 'provider' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( (otherlv_3= 'kind' ( ( (lv_kinds_4_1= 'local' | lv_kinds_4_2= 'openai' | lv_kinds_4_3= 'ollama' ) ) ) ) | (otherlv_5= 'localModelPath' ( (lv_localModelPaths_6_0= RULE_STRING ) ) ) | (otherlv_7= 'model' ( (lv_models_8_0= RULE_STRING ) ) ) | (otherlv_9= 'endpoint' ( (lv_endpoints_10_0= RULE_STRING ) ) ) )* otherlv_11= '}' ) )
            // InternalLibrettoProjectProfile.g:1059:2: (otherlv_0= 'provider' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( (otherlv_3= 'kind' ( ( (lv_kinds_4_1= 'local' | lv_kinds_4_2= 'openai' | lv_kinds_4_3= 'ollama' ) ) ) ) | (otherlv_5= 'localModelPath' ( (lv_localModelPaths_6_0= RULE_STRING ) ) ) | (otherlv_7= 'model' ( (lv_models_8_0= RULE_STRING ) ) ) | (otherlv_9= 'endpoint' ( (lv_endpoints_10_0= RULE_STRING ) ) ) )* otherlv_11= '}' )
            {
            // InternalLibrettoProjectProfile.g:1059:2: (otherlv_0= 'provider' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( (otherlv_3= 'kind' ( ( (lv_kinds_4_1= 'local' | lv_kinds_4_2= 'openai' | lv_kinds_4_3= 'ollama' ) ) ) ) | (otherlv_5= 'localModelPath' ( (lv_localModelPaths_6_0= RULE_STRING ) ) ) | (otherlv_7= 'model' ( (lv_models_8_0= RULE_STRING ) ) ) | (otherlv_9= 'endpoint' ( (lv_endpoints_10_0= RULE_STRING ) ) ) )* otherlv_11= '}' )
            // InternalLibrettoProjectProfile.g:1060:3: otherlv_0= 'provider' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( (otherlv_3= 'kind' ( ( (lv_kinds_4_1= 'local' | lv_kinds_4_2= 'openai' | lv_kinds_4_3= 'ollama' ) ) ) ) | (otherlv_5= 'localModelPath' ( (lv_localModelPaths_6_0= RULE_STRING ) ) ) | (otherlv_7= 'model' ( (lv_models_8_0= RULE_STRING ) ) ) | (otherlv_9= 'endpoint' ( (lv_endpoints_10_0= RULE_STRING ) ) ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getNamedLlmProviderAccess().getProviderKeyword_0());
            		
            // InternalLibrettoProjectProfile.g:1064:3: ( (lv_name_1_0= ruleValidID ) )
            // InternalLibrettoProjectProfile.g:1065:4: (lv_name_1_0= ruleValidID )
            {
            // InternalLibrettoProjectProfile.g:1065:4: (lv_name_1_0= ruleValidID )
            // InternalLibrettoProjectProfile.g:1066:5: lv_name_1_0= ruleValidID
            {

            					newCompositeNode(grammarAccess.getNamedLlmProviderAccess().getNameValidIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleValidID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNamedLlmProviderRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"com.robenglander.libretto.spec.LibrettoProjectProfile.ValidID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getNamedLlmProviderAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLibrettoProjectProfile.g:1087:3: ( (otherlv_3= 'kind' ( ( (lv_kinds_4_1= 'local' | lv_kinds_4_2= 'openai' | lv_kinds_4_3= 'ollama' ) ) ) ) | (otherlv_5= 'localModelPath' ( (lv_localModelPaths_6_0= RULE_STRING ) ) ) | (otherlv_7= 'model' ( (lv_models_8_0= RULE_STRING ) ) ) | (otherlv_9= 'endpoint' ( (lv_endpoints_10_0= RULE_STRING ) ) ) )*
            loop12:
            do {
                int alt12=5;
                switch ( input.LA(1) ) {
                case 38:
                    {
                    alt12=1;
                    }
                    break;
                case 42:
                    {
                    alt12=2;
                    }
                    break;
                case 43:
                    {
                    alt12=3;
                    }
                    break;
                case 44:
                    {
                    alt12=4;
                    }
                    break;

                }

                switch (alt12) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:1088:4: (otherlv_3= 'kind' ( ( (lv_kinds_4_1= 'local' | lv_kinds_4_2= 'openai' | lv_kinds_4_3= 'ollama' ) ) ) )
            	    {
            	    // InternalLibrettoProjectProfile.g:1088:4: (otherlv_3= 'kind' ( ( (lv_kinds_4_1= 'local' | lv_kinds_4_2= 'openai' | lv_kinds_4_3= 'ollama' ) ) ) )
            	    // InternalLibrettoProjectProfile.g:1089:5: otherlv_3= 'kind' ( ( (lv_kinds_4_1= 'local' | lv_kinds_4_2= 'openai' | lv_kinds_4_3= 'ollama' ) ) )
            	    {
            	    otherlv_3=(Token)match(input,38,FOLLOW_19); 

            	    					newLeafNode(otherlv_3, grammarAccess.getNamedLlmProviderAccess().getKindKeyword_3_0_0());
            	    				
            	    // InternalLibrettoProjectProfile.g:1093:5: ( ( (lv_kinds_4_1= 'local' | lv_kinds_4_2= 'openai' | lv_kinds_4_3= 'ollama' ) ) )
            	    // InternalLibrettoProjectProfile.g:1094:6: ( (lv_kinds_4_1= 'local' | lv_kinds_4_2= 'openai' | lv_kinds_4_3= 'ollama' ) )
            	    {
            	    // InternalLibrettoProjectProfile.g:1094:6: ( (lv_kinds_4_1= 'local' | lv_kinds_4_2= 'openai' | lv_kinds_4_3= 'ollama' ) )
            	    // InternalLibrettoProjectProfile.g:1095:7: (lv_kinds_4_1= 'local' | lv_kinds_4_2= 'openai' | lv_kinds_4_3= 'ollama' )
            	    {
            	    // InternalLibrettoProjectProfile.g:1095:7: (lv_kinds_4_1= 'local' | lv_kinds_4_2= 'openai' | lv_kinds_4_3= 'ollama' )
            	    int alt11=3;
            	    switch ( input.LA(1) ) {
            	    case 39:
            	        {
            	        alt11=1;
            	        }
            	        break;
            	    case 40:
            	        {
            	        alt11=2;
            	        }
            	        break;
            	    case 41:
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
            	            // InternalLibrettoProjectProfile.g:1096:8: lv_kinds_4_1= 'local'
            	            {
            	            lv_kinds_4_1=(Token)match(input,39,FOLLOW_18); 

            	            								newLeafNode(lv_kinds_4_1, grammarAccess.getNamedLlmProviderAccess().getKindsLocalKeyword_3_0_1_0_0());
            	            							

            	            								if (current==null) {
            	            									current = createModelElement(grammarAccess.getNamedLlmProviderRule());
            	            								}
            	            								addWithLastConsumed(current, "kinds", lv_kinds_4_1, null);
            	            							

            	            }
            	            break;
            	        case 2 :
            	            // InternalLibrettoProjectProfile.g:1107:8: lv_kinds_4_2= 'openai'
            	            {
            	            lv_kinds_4_2=(Token)match(input,40,FOLLOW_18); 

            	            								newLeafNode(lv_kinds_4_2, grammarAccess.getNamedLlmProviderAccess().getKindsOpenaiKeyword_3_0_1_0_1());
            	            							

            	            								if (current==null) {
            	            									current = createModelElement(grammarAccess.getNamedLlmProviderRule());
            	            								}
            	            								addWithLastConsumed(current, "kinds", lv_kinds_4_2, null);
            	            							

            	            }
            	            break;
            	        case 3 :
            	            // InternalLibrettoProjectProfile.g:1118:8: lv_kinds_4_3= 'ollama'
            	            {
            	            lv_kinds_4_3=(Token)match(input,41,FOLLOW_18); 

            	            								newLeafNode(lv_kinds_4_3, grammarAccess.getNamedLlmProviderAccess().getKindsOllamaKeyword_3_0_1_0_2());
            	            							

            	            								if (current==null) {
            	            									current = createModelElement(grammarAccess.getNamedLlmProviderRule());
            	            								}
            	            								addWithLastConsumed(current, "kinds", lv_kinds_4_3, null);
            	            							

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalLibrettoProjectProfile.g:1133:4: (otherlv_5= 'localModelPath' ( (lv_localModelPaths_6_0= RULE_STRING ) ) )
            	    {
            	    // InternalLibrettoProjectProfile.g:1133:4: (otherlv_5= 'localModelPath' ( (lv_localModelPaths_6_0= RULE_STRING ) ) )
            	    // InternalLibrettoProjectProfile.g:1134:5: otherlv_5= 'localModelPath' ( (lv_localModelPaths_6_0= RULE_STRING ) )
            	    {
            	    otherlv_5=(Token)match(input,42,FOLLOW_7); 

            	    					newLeafNode(otherlv_5, grammarAccess.getNamedLlmProviderAccess().getLocalModelPathKeyword_3_1_0());
            	    				
            	    // InternalLibrettoProjectProfile.g:1138:5: ( (lv_localModelPaths_6_0= RULE_STRING ) )
            	    // InternalLibrettoProjectProfile.g:1139:6: (lv_localModelPaths_6_0= RULE_STRING )
            	    {
            	    // InternalLibrettoProjectProfile.g:1139:6: (lv_localModelPaths_6_0= RULE_STRING )
            	    // InternalLibrettoProjectProfile.g:1140:7: lv_localModelPaths_6_0= RULE_STRING
            	    {
            	    lv_localModelPaths_6_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            	    							newLeafNode(lv_localModelPaths_6_0, grammarAccess.getNamedLlmProviderAccess().getLocalModelPathsSTRINGTerminalRuleCall_3_1_1_0());
            	    						

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getNamedLlmProviderRule());
            	    							}
            	    							addWithLastConsumed(
            	    								current,
            	    								"localModelPaths",
            	    								lv_localModelPaths_6_0,
            	    								"org.eclipse.xtext.common.Terminals.STRING");
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalLibrettoProjectProfile.g:1158:4: (otherlv_7= 'model' ( (lv_models_8_0= RULE_STRING ) ) )
            	    {
            	    // InternalLibrettoProjectProfile.g:1158:4: (otherlv_7= 'model' ( (lv_models_8_0= RULE_STRING ) ) )
            	    // InternalLibrettoProjectProfile.g:1159:5: otherlv_7= 'model' ( (lv_models_8_0= RULE_STRING ) )
            	    {
            	    otherlv_7=(Token)match(input,43,FOLLOW_7); 

            	    					newLeafNode(otherlv_7, grammarAccess.getNamedLlmProviderAccess().getModelKeyword_3_2_0());
            	    				
            	    // InternalLibrettoProjectProfile.g:1163:5: ( (lv_models_8_0= RULE_STRING ) )
            	    // InternalLibrettoProjectProfile.g:1164:6: (lv_models_8_0= RULE_STRING )
            	    {
            	    // InternalLibrettoProjectProfile.g:1164:6: (lv_models_8_0= RULE_STRING )
            	    // InternalLibrettoProjectProfile.g:1165:7: lv_models_8_0= RULE_STRING
            	    {
            	    lv_models_8_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            	    							newLeafNode(lv_models_8_0, grammarAccess.getNamedLlmProviderAccess().getModelsSTRINGTerminalRuleCall_3_2_1_0());
            	    						

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getNamedLlmProviderRule());
            	    							}
            	    							addWithLastConsumed(
            	    								current,
            	    								"models",
            	    								lv_models_8_0,
            	    								"org.eclipse.xtext.common.Terminals.STRING");
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalLibrettoProjectProfile.g:1183:4: (otherlv_9= 'endpoint' ( (lv_endpoints_10_0= RULE_STRING ) ) )
            	    {
            	    // InternalLibrettoProjectProfile.g:1183:4: (otherlv_9= 'endpoint' ( (lv_endpoints_10_0= RULE_STRING ) ) )
            	    // InternalLibrettoProjectProfile.g:1184:5: otherlv_9= 'endpoint' ( (lv_endpoints_10_0= RULE_STRING ) )
            	    {
            	    otherlv_9=(Token)match(input,44,FOLLOW_7); 

            	    					newLeafNode(otherlv_9, grammarAccess.getNamedLlmProviderAccess().getEndpointKeyword_3_3_0());
            	    				
            	    // InternalLibrettoProjectProfile.g:1188:5: ( (lv_endpoints_10_0= RULE_STRING ) )
            	    // InternalLibrettoProjectProfile.g:1189:6: (lv_endpoints_10_0= RULE_STRING )
            	    {
            	    // InternalLibrettoProjectProfile.g:1189:6: (lv_endpoints_10_0= RULE_STRING )
            	    // InternalLibrettoProjectProfile.g:1190:7: lv_endpoints_10_0= RULE_STRING
            	    {
            	    lv_endpoints_10_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            	    							newLeafNode(lv_endpoints_10_0, grammarAccess.getNamedLlmProviderAccess().getEndpointsSTRINGTerminalRuleCall_3_3_1_0());
            	    						

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getNamedLlmProviderRule());
            	    							}
            	    							addWithLastConsumed(
            	    								current,
            	    								"endpoints",
            	    								lv_endpoints_10_0,
            	    								"org.eclipse.xtext.common.Terminals.STRING");
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_11=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getNamedLlmProviderAccess().getRightCurlyBracketKeyword_4());
            		

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


    // $ANTLR start "entryRuleGenUsageBlock"
    // InternalLibrettoProjectProfile.g:1216:1: entryRuleGenUsageBlock returns [EObject current=null] : iv_ruleGenUsageBlock= ruleGenUsageBlock EOF ;
    public final EObject entryRuleGenUsageBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenUsageBlock = null;


        try {
            // InternalLibrettoProjectProfile.g:1216:54: (iv_ruleGenUsageBlock= ruleGenUsageBlock EOF )
            // InternalLibrettoProjectProfile.g:1217:2: iv_ruleGenUsageBlock= ruleGenUsageBlock EOF
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
    // InternalLibrettoProjectProfile.g:1223:1: ruleGenUsageBlock returns [EObject current=null] : ( () otherlv_1= 'modelUsage' otherlv_2= '{' ( (otherlv_3= 'primary' ( (lv_primaryProviders_4_0= RULE_STRING ) ) ) | (otherlv_5= 'secondary' ( (lv_secondaryProviders_6_0= RULE_STRING ) ) ) | ( (lv_escalations_7_0= ruleGenEscalationBlock ) ) )* otherlv_8= '}' ) ;
    public final EObject ruleGenUsageBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_primaryProviders_4_0=null;
        Token otherlv_5=null;
        Token lv_secondaryProviders_6_0=null;
        Token otherlv_8=null;
        EObject lv_escalations_7_0 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:1229:2: ( ( () otherlv_1= 'modelUsage' otherlv_2= '{' ( (otherlv_3= 'primary' ( (lv_primaryProviders_4_0= RULE_STRING ) ) ) | (otherlv_5= 'secondary' ( (lv_secondaryProviders_6_0= RULE_STRING ) ) ) | ( (lv_escalations_7_0= ruleGenEscalationBlock ) ) )* otherlv_8= '}' ) )
            // InternalLibrettoProjectProfile.g:1230:2: ( () otherlv_1= 'modelUsage' otherlv_2= '{' ( (otherlv_3= 'primary' ( (lv_primaryProviders_4_0= RULE_STRING ) ) ) | (otherlv_5= 'secondary' ( (lv_secondaryProviders_6_0= RULE_STRING ) ) ) | ( (lv_escalations_7_0= ruleGenEscalationBlock ) ) )* otherlv_8= '}' )
            {
            // InternalLibrettoProjectProfile.g:1230:2: ( () otherlv_1= 'modelUsage' otherlv_2= '{' ( (otherlv_3= 'primary' ( (lv_primaryProviders_4_0= RULE_STRING ) ) ) | (otherlv_5= 'secondary' ( (lv_secondaryProviders_6_0= RULE_STRING ) ) ) | ( (lv_escalations_7_0= ruleGenEscalationBlock ) ) )* otherlv_8= '}' )
            // InternalLibrettoProjectProfile.g:1231:3: () otherlv_1= 'modelUsage' otherlv_2= '{' ( (otherlv_3= 'primary' ( (lv_primaryProviders_4_0= RULE_STRING ) ) ) | (otherlv_5= 'secondary' ( (lv_secondaryProviders_6_0= RULE_STRING ) ) ) | ( (lv_escalations_7_0= ruleGenEscalationBlock ) ) )* otherlv_8= '}'
            {
            // InternalLibrettoProjectProfile.g:1231:3: ()
            // InternalLibrettoProjectProfile.g:1232:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGenUsageBlockAccess().getGenUsageBlockAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,45,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getGenUsageBlockAccess().getModelUsageKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getGenUsageBlockAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLibrettoProjectProfile.g:1246:3: ( (otherlv_3= 'primary' ( (lv_primaryProviders_4_0= RULE_STRING ) ) ) | (otherlv_5= 'secondary' ( (lv_secondaryProviders_6_0= RULE_STRING ) ) ) | ( (lv_escalations_7_0= ruleGenEscalationBlock ) ) )*
            loop13:
            do {
                int alt13=4;
                switch ( input.LA(1) ) {
                case 46:
                    {
                    alt13=1;
                    }
                    break;
                case 47:
                    {
                    alt13=2;
                    }
                    break;
                case 48:
                    {
                    alt13=3;
                    }
                    break;

                }

                switch (alt13) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:1247:4: (otherlv_3= 'primary' ( (lv_primaryProviders_4_0= RULE_STRING ) ) )
            	    {
            	    // InternalLibrettoProjectProfile.g:1247:4: (otherlv_3= 'primary' ( (lv_primaryProviders_4_0= RULE_STRING ) ) )
            	    // InternalLibrettoProjectProfile.g:1248:5: otherlv_3= 'primary' ( (lv_primaryProviders_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,46,FOLLOW_7); 

            	    					newLeafNode(otherlv_3, grammarAccess.getGenUsageBlockAccess().getPrimaryKeyword_3_0_0());
            	    				
            	    // InternalLibrettoProjectProfile.g:1252:5: ( (lv_primaryProviders_4_0= RULE_STRING ) )
            	    // InternalLibrettoProjectProfile.g:1253:6: (lv_primaryProviders_4_0= RULE_STRING )
            	    {
            	    // InternalLibrettoProjectProfile.g:1253:6: (lv_primaryProviders_4_0= RULE_STRING )
            	    // InternalLibrettoProjectProfile.g:1254:7: lv_primaryProviders_4_0= RULE_STRING
            	    {
            	    lv_primaryProviders_4_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

            	    							newLeafNode(lv_primaryProviders_4_0, grammarAccess.getGenUsageBlockAccess().getPrimaryProvidersSTRINGTerminalRuleCall_3_0_1_0());
            	    						

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getGenUsageBlockRule());
            	    							}
            	    							addWithLastConsumed(
            	    								current,
            	    								"primaryProviders",
            	    								lv_primaryProviders_4_0,
            	    								"org.eclipse.xtext.common.Terminals.STRING");
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalLibrettoProjectProfile.g:1272:4: (otherlv_5= 'secondary' ( (lv_secondaryProviders_6_0= RULE_STRING ) ) )
            	    {
            	    // InternalLibrettoProjectProfile.g:1272:4: (otherlv_5= 'secondary' ( (lv_secondaryProviders_6_0= RULE_STRING ) ) )
            	    // InternalLibrettoProjectProfile.g:1273:5: otherlv_5= 'secondary' ( (lv_secondaryProviders_6_0= RULE_STRING ) )
            	    {
            	    otherlv_5=(Token)match(input,47,FOLLOW_7); 

            	    					newLeafNode(otherlv_5, grammarAccess.getGenUsageBlockAccess().getSecondaryKeyword_3_1_0());
            	    				
            	    // InternalLibrettoProjectProfile.g:1277:5: ( (lv_secondaryProviders_6_0= RULE_STRING ) )
            	    // InternalLibrettoProjectProfile.g:1278:6: (lv_secondaryProviders_6_0= RULE_STRING )
            	    {
            	    // InternalLibrettoProjectProfile.g:1278:6: (lv_secondaryProviders_6_0= RULE_STRING )
            	    // InternalLibrettoProjectProfile.g:1279:7: lv_secondaryProviders_6_0= RULE_STRING
            	    {
            	    lv_secondaryProviders_6_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

            	    							newLeafNode(lv_secondaryProviders_6_0, grammarAccess.getGenUsageBlockAccess().getSecondaryProvidersSTRINGTerminalRuleCall_3_1_1_0());
            	    						

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getGenUsageBlockRule());
            	    							}
            	    							addWithLastConsumed(
            	    								current,
            	    								"secondaryProviders",
            	    								lv_secondaryProviders_6_0,
            	    								"org.eclipse.xtext.common.Terminals.STRING");
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalLibrettoProjectProfile.g:1297:4: ( (lv_escalations_7_0= ruleGenEscalationBlock ) )
            	    {
            	    // InternalLibrettoProjectProfile.g:1297:4: ( (lv_escalations_7_0= ruleGenEscalationBlock ) )
            	    // InternalLibrettoProjectProfile.g:1298:5: (lv_escalations_7_0= ruleGenEscalationBlock )
            	    {
            	    // InternalLibrettoProjectProfile.g:1298:5: (lv_escalations_7_0= ruleGenEscalationBlock )
            	    // InternalLibrettoProjectProfile.g:1299:6: lv_escalations_7_0= ruleGenEscalationBlock
            	    {

            	    						newCompositeNode(grammarAccess.getGenUsageBlockAccess().getEscalationsGenEscalationBlockParserRuleCall_3_2_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_escalations_7_0=ruleGenEscalationBlock();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGenUsageBlockRule());
            	    						}
            	    						add(
            	    							current,
            	    							"escalations",
            	    							lv_escalations_7_0,
            	    							"com.robenglander.libretto.spec.LibrettoProjectProfile.GenEscalationBlock");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_8=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getGenUsageBlockAccess().getRightCurlyBracketKeyword_4());
            		

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


    // $ANTLR start "entryRuleGenEscalationBlock"
    // InternalLibrettoProjectProfile.g:1325:1: entryRuleGenEscalationBlock returns [EObject current=null] : iv_ruleGenEscalationBlock= ruleGenEscalationBlock EOF ;
    public final EObject entryRuleGenEscalationBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenEscalationBlock = null;


        try {
            // InternalLibrettoProjectProfile.g:1325:59: (iv_ruleGenEscalationBlock= ruleGenEscalationBlock EOF )
            // InternalLibrettoProjectProfile.g:1326:2: iv_ruleGenEscalationBlock= ruleGenEscalationBlock EOF
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
    // InternalLibrettoProjectProfile.g:1332:1: ruleGenEscalationBlock returns [EObject current=null] : ( () otherlv_1= 'escalation' otherlv_2= '{' ( (otherlv_3= 'enabled' ( ( (lv_enableds_4_1= 'true' | lv_enableds_4_2= 'false' ) ) ) ) | (otherlv_5= 'escalateAtRetry' ( (lv_escalateAtRetries_6_0= RULE_INT ) ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleGenEscalationBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_enableds_4_1=null;
        Token lv_enableds_4_2=null;
        Token otherlv_5=null;
        Token lv_escalateAtRetries_6_0=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:1338:2: ( ( () otherlv_1= 'escalation' otherlv_2= '{' ( (otherlv_3= 'enabled' ( ( (lv_enableds_4_1= 'true' | lv_enableds_4_2= 'false' ) ) ) ) | (otherlv_5= 'escalateAtRetry' ( (lv_escalateAtRetries_6_0= RULE_INT ) ) ) )* otherlv_7= '}' ) )
            // InternalLibrettoProjectProfile.g:1339:2: ( () otherlv_1= 'escalation' otherlv_2= '{' ( (otherlv_3= 'enabled' ( ( (lv_enableds_4_1= 'true' | lv_enableds_4_2= 'false' ) ) ) ) | (otherlv_5= 'escalateAtRetry' ( (lv_escalateAtRetries_6_0= RULE_INT ) ) ) )* otherlv_7= '}' )
            {
            // InternalLibrettoProjectProfile.g:1339:2: ( () otherlv_1= 'escalation' otherlv_2= '{' ( (otherlv_3= 'enabled' ( ( (lv_enableds_4_1= 'true' | lv_enableds_4_2= 'false' ) ) ) ) | (otherlv_5= 'escalateAtRetry' ( (lv_escalateAtRetries_6_0= RULE_INT ) ) ) )* otherlv_7= '}' )
            // InternalLibrettoProjectProfile.g:1340:3: () otherlv_1= 'escalation' otherlv_2= '{' ( (otherlv_3= 'enabled' ( ( (lv_enableds_4_1= 'true' | lv_enableds_4_2= 'false' ) ) ) ) | (otherlv_5= 'escalateAtRetry' ( (lv_escalateAtRetries_6_0= RULE_INT ) ) ) )* otherlv_7= '}'
            {
            // InternalLibrettoProjectProfile.g:1340:3: ()
            // InternalLibrettoProjectProfile.g:1341:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGenEscalationBlockAccess().getGenEscalationBlockAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,48,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getGenEscalationBlockAccess().getEscalationKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getGenEscalationBlockAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLibrettoProjectProfile.g:1355:3: ( (otherlv_3= 'enabled' ( ( (lv_enableds_4_1= 'true' | lv_enableds_4_2= 'false' ) ) ) ) | (otherlv_5= 'escalateAtRetry' ( (lv_escalateAtRetries_6_0= RULE_INT ) ) ) )*
            loop15:
            do {
                int alt15=3;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==49) ) {
                    alt15=1;
                }
                else if ( (LA15_0==50) ) {
                    alt15=2;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:1356:4: (otherlv_3= 'enabled' ( ( (lv_enableds_4_1= 'true' | lv_enableds_4_2= 'false' ) ) ) )
            	    {
            	    // InternalLibrettoProjectProfile.g:1356:4: (otherlv_3= 'enabled' ( ( (lv_enableds_4_1= 'true' | lv_enableds_4_2= 'false' ) ) ) )
            	    // InternalLibrettoProjectProfile.g:1357:5: otherlv_3= 'enabled' ( ( (lv_enableds_4_1= 'true' | lv_enableds_4_2= 'false' ) ) )
            	    {
            	    otherlv_3=(Token)match(input,49,FOLLOW_12); 

            	    					newLeafNode(otherlv_3, grammarAccess.getGenEscalationBlockAccess().getEnabledKeyword_3_0_0());
            	    				
            	    // InternalLibrettoProjectProfile.g:1361:5: ( ( (lv_enableds_4_1= 'true' | lv_enableds_4_2= 'false' ) ) )
            	    // InternalLibrettoProjectProfile.g:1362:6: ( (lv_enableds_4_1= 'true' | lv_enableds_4_2= 'false' ) )
            	    {
            	    // InternalLibrettoProjectProfile.g:1362:6: ( (lv_enableds_4_1= 'true' | lv_enableds_4_2= 'false' ) )
            	    // InternalLibrettoProjectProfile.g:1363:7: (lv_enableds_4_1= 'true' | lv_enableds_4_2= 'false' )
            	    {
            	    // InternalLibrettoProjectProfile.g:1363:7: (lv_enableds_4_1= 'true' | lv_enableds_4_2= 'false' )
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==27) ) {
            	        alt14=1;
            	    }
            	    else if ( (LA14_0==28) ) {
            	        alt14=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 14, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // InternalLibrettoProjectProfile.g:1364:8: lv_enableds_4_1= 'true'
            	            {
            	            lv_enableds_4_1=(Token)match(input,27,FOLLOW_21); 

            	            								newLeafNode(lv_enableds_4_1, grammarAccess.getGenEscalationBlockAccess().getEnabledsTrueKeyword_3_0_1_0_0());
            	            							

            	            								if (current==null) {
            	            									current = createModelElement(grammarAccess.getGenEscalationBlockRule());
            	            								}
            	            								addWithLastConsumed(current, "enableds", lv_enableds_4_1, null);
            	            							

            	            }
            	            break;
            	        case 2 :
            	            // InternalLibrettoProjectProfile.g:1375:8: lv_enableds_4_2= 'false'
            	            {
            	            lv_enableds_4_2=(Token)match(input,28,FOLLOW_21); 

            	            								newLeafNode(lv_enableds_4_2, grammarAccess.getGenEscalationBlockAccess().getEnabledsFalseKeyword_3_0_1_0_1());
            	            							

            	            								if (current==null) {
            	            									current = createModelElement(grammarAccess.getGenEscalationBlockRule());
            	            								}
            	            								addWithLastConsumed(current, "enableds", lv_enableds_4_2, null);
            	            							

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalLibrettoProjectProfile.g:1390:4: (otherlv_5= 'escalateAtRetry' ( (lv_escalateAtRetries_6_0= RULE_INT ) ) )
            	    {
            	    // InternalLibrettoProjectProfile.g:1390:4: (otherlv_5= 'escalateAtRetry' ( (lv_escalateAtRetries_6_0= RULE_INT ) ) )
            	    // InternalLibrettoProjectProfile.g:1391:5: otherlv_5= 'escalateAtRetry' ( (lv_escalateAtRetries_6_0= RULE_INT ) )
            	    {
            	    otherlv_5=(Token)match(input,50,FOLLOW_11); 

            	    					newLeafNode(otherlv_5, grammarAccess.getGenEscalationBlockAccess().getEscalateAtRetryKeyword_3_1_0());
            	    				
            	    // InternalLibrettoProjectProfile.g:1395:5: ( (lv_escalateAtRetries_6_0= RULE_INT ) )
            	    // InternalLibrettoProjectProfile.g:1396:6: (lv_escalateAtRetries_6_0= RULE_INT )
            	    {
            	    // InternalLibrettoProjectProfile.g:1396:6: (lv_escalateAtRetries_6_0= RULE_INT )
            	    // InternalLibrettoProjectProfile.g:1397:7: lv_escalateAtRetries_6_0= RULE_INT
            	    {
            	    lv_escalateAtRetries_6_0=(Token)match(input,RULE_INT,FOLLOW_21); 

            	    							newLeafNode(lv_escalateAtRetries_6_0, grammarAccess.getGenEscalationBlockAccess().getEscalateAtRetriesINTTerminalRuleCall_3_1_1_0());
            	    						

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getGenEscalationBlockRule());
            	    							}
            	    							addWithLastConsumed(
            	    								current,
            	    								"escalateAtRetries",
            	    								lv_escalateAtRetries_6_0,
            	    								"org.eclipse.xtext.common.Terminals.INT");
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getGenEscalationBlockAccess().getRightCurlyBracketKeyword_4());
            		

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


    // $ANTLR start "entryRuleSurfaceBlock"
    // InternalLibrettoProjectProfile.g:1423:1: entryRuleSurfaceBlock returns [EObject current=null] : iv_ruleSurfaceBlock= ruleSurfaceBlock EOF ;
    public final EObject entryRuleSurfaceBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSurfaceBlock = null;


        try {
            // InternalLibrettoProjectProfile.g:1423:53: (iv_ruleSurfaceBlock= ruleSurfaceBlock EOF )
            // InternalLibrettoProjectProfile.g:1424:2: iv_ruleSurfaceBlock= ruleSurfaceBlock EOF
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
    // InternalLibrettoProjectProfile.g:1430:1: ruleSurfaceBlock returns [EObject current=null] : ( () otherlv_1= 'surface' otherlv_2= '{' ( (lv_elements_3_0= ruleSurfaceElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleSurfaceBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:1436:2: ( ( () otherlv_1= 'surface' otherlv_2= '{' ( (lv_elements_3_0= ruleSurfaceElement ) )* otherlv_4= '}' ) )
            // InternalLibrettoProjectProfile.g:1437:2: ( () otherlv_1= 'surface' otherlv_2= '{' ( (lv_elements_3_0= ruleSurfaceElement ) )* otherlv_4= '}' )
            {
            // InternalLibrettoProjectProfile.g:1437:2: ( () otherlv_1= 'surface' otherlv_2= '{' ( (lv_elements_3_0= ruleSurfaceElement ) )* otherlv_4= '}' )
            // InternalLibrettoProjectProfile.g:1438:3: () otherlv_1= 'surface' otherlv_2= '{' ( (lv_elements_3_0= ruleSurfaceElement ) )* otherlv_4= '}'
            {
            // InternalLibrettoProjectProfile.g:1438:3: ()
            // InternalLibrettoProjectProfile.g:1439:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSurfaceBlockAccess().getSurfaceBlockAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,51,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSurfaceBlockAccess().getSurfaceKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getSurfaceBlockAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLibrettoProjectProfile.g:1453:3: ( (lv_elements_3_0= ruleSurfaceElement ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==52||LA16_0==54||LA16_0==58||LA16_0==60||LA16_0==62) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:1454:4: (lv_elements_3_0= ruleSurfaceElement )
            	    {
            	    // InternalLibrettoProjectProfile.g:1454:4: (lv_elements_3_0= ruleSurfaceElement )
            	    // InternalLibrettoProjectProfile.g:1455:5: lv_elements_3_0= ruleSurfaceElement
            	    {

            	    					newCompositeNode(grammarAccess.getSurfaceBlockAccess().getElementsSurfaceElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_22);
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
            	    break loop16;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

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
    // InternalLibrettoProjectProfile.g:1480:1: entryRuleSurfaceElement returns [EObject current=null] : iv_ruleSurfaceElement= ruleSurfaceElement EOF ;
    public final EObject entryRuleSurfaceElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSurfaceElement = null;


        try {
            // InternalLibrettoProjectProfile.g:1480:55: (iv_ruleSurfaceElement= ruleSurfaceElement EOF )
            // InternalLibrettoProjectProfile.g:1481:2: iv_ruleSurfaceElement= ruleSurfaceElement EOF
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
    // InternalLibrettoProjectProfile.g:1487:1: ruleSurfaceElement returns [EObject current=null] : (this_ScopedSurface_0= ruleScopedSurface | this_SurfaceRule_1= ruleSurfaceRule ) ;
    public final EObject ruleSurfaceElement() throws RecognitionException {
        EObject current = null;

        EObject this_ScopedSurface_0 = null;

        EObject this_SurfaceRule_1 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:1493:2: ( (this_ScopedSurface_0= ruleScopedSurface | this_SurfaceRule_1= ruleSurfaceRule ) )
            // InternalLibrettoProjectProfile.g:1494:2: (this_ScopedSurface_0= ruleScopedSurface | this_SurfaceRule_1= ruleSurfaceRule )
            {
            // InternalLibrettoProjectProfile.g:1494:2: (this_ScopedSurface_0= ruleScopedSurface | this_SurfaceRule_1= ruleSurfaceRule )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==52) ) {
                alt17=1;
            }
            else if ( (LA17_0==54||LA17_0==58||LA17_0==60||LA17_0==62) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:1495:3: this_ScopedSurface_0= ruleScopedSurface
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
                    // InternalLibrettoProjectProfile.g:1504:3: this_SurfaceRule_1= ruleSurfaceRule
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
    // InternalLibrettoProjectProfile.g:1516:1: entryRuleScopedSurface returns [EObject current=null] : iv_ruleScopedSurface= ruleScopedSurface EOF ;
    public final EObject entryRuleScopedSurface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScopedSurface = null;


        try {
            // InternalLibrettoProjectProfile.g:1516:54: (iv_ruleScopedSurface= ruleScopedSurface EOF )
            // InternalLibrettoProjectProfile.g:1517:2: iv_ruleScopedSurface= ruleScopedSurface EOF
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
    // InternalLibrettoProjectProfile.g:1523:1: ruleScopedSurface returns [EObject current=null] : (otherlv_0= 'for' ( (otherlv_1= 'module' ( (lv_moduleId_2_0= RULE_STRING ) ) ) | (otherlv_3= 'spec' ( (lv_specId_4_0= RULE_STRING ) ) ) ) otherlv_5= '{' ( (lv_rules_6_0= ruleSurfaceRule ) )* otherlv_7= '}' ) ;
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
            // InternalLibrettoProjectProfile.g:1529:2: ( (otherlv_0= 'for' ( (otherlv_1= 'module' ( (lv_moduleId_2_0= RULE_STRING ) ) ) | (otherlv_3= 'spec' ( (lv_specId_4_0= RULE_STRING ) ) ) ) otherlv_5= '{' ( (lv_rules_6_0= ruleSurfaceRule ) )* otherlv_7= '}' ) )
            // InternalLibrettoProjectProfile.g:1530:2: (otherlv_0= 'for' ( (otherlv_1= 'module' ( (lv_moduleId_2_0= RULE_STRING ) ) ) | (otherlv_3= 'spec' ( (lv_specId_4_0= RULE_STRING ) ) ) ) otherlv_5= '{' ( (lv_rules_6_0= ruleSurfaceRule ) )* otherlv_7= '}' )
            {
            // InternalLibrettoProjectProfile.g:1530:2: (otherlv_0= 'for' ( (otherlv_1= 'module' ( (lv_moduleId_2_0= RULE_STRING ) ) ) | (otherlv_3= 'spec' ( (lv_specId_4_0= RULE_STRING ) ) ) ) otherlv_5= '{' ( (lv_rules_6_0= ruleSurfaceRule ) )* otherlv_7= '}' )
            // InternalLibrettoProjectProfile.g:1531:3: otherlv_0= 'for' ( (otherlv_1= 'module' ( (lv_moduleId_2_0= RULE_STRING ) ) ) | (otherlv_3= 'spec' ( (lv_specId_4_0= RULE_STRING ) ) ) ) otherlv_5= '{' ( (lv_rules_6_0= ruleSurfaceRule ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getScopedSurfaceAccess().getForKeyword_0());
            		
            // InternalLibrettoProjectProfile.g:1535:3: ( (otherlv_1= 'module' ( (lv_moduleId_2_0= RULE_STRING ) ) ) | (otherlv_3= 'spec' ( (lv_specId_4_0= RULE_STRING ) ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==17) ) {
                alt18=1;
            }
            else if ( (LA18_0==53) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:1536:4: (otherlv_1= 'module' ( (lv_moduleId_2_0= RULE_STRING ) ) )
                    {
                    // InternalLibrettoProjectProfile.g:1536:4: (otherlv_1= 'module' ( (lv_moduleId_2_0= RULE_STRING ) ) )
                    // InternalLibrettoProjectProfile.g:1537:5: otherlv_1= 'module' ( (lv_moduleId_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_7); 

                    					newLeafNode(otherlv_1, grammarAccess.getScopedSurfaceAccess().getModuleKeyword_1_0_0());
                    				
                    // InternalLibrettoProjectProfile.g:1541:5: ( (lv_moduleId_2_0= RULE_STRING ) )
                    // InternalLibrettoProjectProfile.g:1542:6: (lv_moduleId_2_0= RULE_STRING )
                    {
                    // InternalLibrettoProjectProfile.g:1542:6: (lv_moduleId_2_0= RULE_STRING )
                    // InternalLibrettoProjectProfile.g:1543:7: lv_moduleId_2_0= RULE_STRING
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
                    // InternalLibrettoProjectProfile.g:1561:4: (otherlv_3= 'spec' ( (lv_specId_4_0= RULE_STRING ) ) )
                    {
                    // InternalLibrettoProjectProfile.g:1561:4: (otherlv_3= 'spec' ( (lv_specId_4_0= RULE_STRING ) ) )
                    // InternalLibrettoProjectProfile.g:1562:5: otherlv_3= 'spec' ( (lv_specId_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,53,FOLLOW_7); 

                    					newLeafNode(otherlv_3, grammarAccess.getScopedSurfaceAccess().getSpecKeyword_1_1_0());
                    				
                    // InternalLibrettoProjectProfile.g:1566:5: ( (lv_specId_4_0= RULE_STRING ) )
                    // InternalLibrettoProjectProfile.g:1567:6: (lv_specId_4_0= RULE_STRING )
                    {
                    // InternalLibrettoProjectProfile.g:1567:6: (lv_specId_4_0= RULE_STRING )
                    // InternalLibrettoProjectProfile.g:1568:7: lv_specId_4_0= RULE_STRING
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

            otherlv_5=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_5, grammarAccess.getScopedSurfaceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLibrettoProjectProfile.g:1590:3: ( (lv_rules_6_0= ruleSurfaceRule ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==54||LA19_0==58||LA19_0==60||LA19_0==62) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:1591:4: (lv_rules_6_0= ruleSurfaceRule )
            	    {
            	    // InternalLibrettoProjectProfile.g:1591:4: (lv_rules_6_0= ruleSurfaceRule )
            	    // InternalLibrettoProjectProfile.g:1592:5: lv_rules_6_0= ruleSurfaceRule
            	    {

            	    					newCompositeNode(grammarAccess.getScopedSurfaceAccess().getRulesSurfaceRuleParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_22);
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
            	    break loop19;
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
    // InternalLibrettoProjectProfile.g:1617:1: entryRuleSurfaceRule returns [EObject current=null] : iv_ruleSurfaceRule= ruleSurfaceRule EOF ;
    public final EObject entryRuleSurfaceRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSurfaceRule = null;


        try {
            // InternalLibrettoProjectProfile.g:1617:52: (iv_ruleSurfaceRule= ruleSurfaceRule EOF )
            // InternalLibrettoProjectProfile.g:1618:2: iv_ruleSurfaceRule= ruleSurfaceRule EOF
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
    // InternalLibrettoProjectProfile.g:1624:1: ruleSurfaceRule returns [EObject current=null] : (this_ReturnTypeRule_0= ruleReturnTypeRule | this_ParamTypeRule_1= ruleParamTypeRule | this_RecordSelfReturnRule_2= ruleRecordSelfReturnRule | this_MethodOverrideRule_3= ruleMethodOverrideRule ) ;
    public final EObject ruleSurfaceRule() throws RecognitionException {
        EObject current = null;

        EObject this_ReturnTypeRule_0 = null;

        EObject this_ParamTypeRule_1 = null;

        EObject this_RecordSelfReturnRule_2 = null;

        EObject this_MethodOverrideRule_3 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:1630:2: ( (this_ReturnTypeRule_0= ruleReturnTypeRule | this_ParamTypeRule_1= ruleParamTypeRule | this_RecordSelfReturnRule_2= ruleRecordSelfReturnRule | this_MethodOverrideRule_3= ruleMethodOverrideRule ) )
            // InternalLibrettoProjectProfile.g:1631:2: (this_ReturnTypeRule_0= ruleReturnTypeRule | this_ParamTypeRule_1= ruleParamTypeRule | this_RecordSelfReturnRule_2= ruleRecordSelfReturnRule | this_MethodOverrideRule_3= ruleMethodOverrideRule )
            {
            // InternalLibrettoProjectProfile.g:1631:2: (this_ReturnTypeRule_0= ruleReturnTypeRule | this_ParamTypeRule_1= ruleParamTypeRule | this_RecordSelfReturnRule_2= ruleRecordSelfReturnRule | this_MethodOverrideRule_3= ruleMethodOverrideRule )
            int alt20=4;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt20=1;
                }
                break;
            case 58:
                {
                alt20=2;
                }
                break;
            case 60:
                {
                alt20=3;
                }
                break;
            case 62:
                {
                alt20=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:1632:3: this_ReturnTypeRule_0= ruleReturnTypeRule
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
                    // InternalLibrettoProjectProfile.g:1641:3: this_ParamTypeRule_1= ruleParamTypeRule
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
                    // InternalLibrettoProjectProfile.g:1650:3: this_RecordSelfReturnRule_2= ruleRecordSelfReturnRule
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
                    // InternalLibrettoProjectProfile.g:1659:3: this_MethodOverrideRule_3= ruleMethodOverrideRule
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
    // InternalLibrettoProjectProfile.g:1671:1: entryRuleReturnTypeRule returns [EObject current=null] : iv_ruleReturnTypeRule= ruleReturnTypeRule EOF ;
    public final EObject entryRuleReturnTypeRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnTypeRule = null;


        try {
            // InternalLibrettoProjectProfile.g:1671:55: (iv_ruleReturnTypeRule= ruleReturnTypeRule EOF )
            // InternalLibrettoProjectProfile.g:1672:2: iv_ruleReturnTypeRule= ruleReturnTypeRule EOF
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
    // InternalLibrettoProjectProfile.g:1678:1: ruleReturnTypeRule returns [EObject current=null] : (otherlv_0= 'returnType' otherlv_1= 'method' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_javaType_4_0= ruleJavaType ) ) (otherlv_5= ';' )? ) ;
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
            // InternalLibrettoProjectProfile.g:1684:2: ( (otherlv_0= 'returnType' otherlv_1= 'method' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_javaType_4_0= ruleJavaType ) ) (otherlv_5= ';' )? ) )
            // InternalLibrettoProjectProfile.g:1685:2: (otherlv_0= 'returnType' otherlv_1= 'method' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_javaType_4_0= ruleJavaType ) ) (otherlv_5= ';' )? )
            {
            // InternalLibrettoProjectProfile.g:1685:2: (otherlv_0= 'returnType' otherlv_1= 'method' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_javaType_4_0= ruleJavaType ) ) (otherlv_5= ';' )? )
            // InternalLibrettoProjectProfile.g:1686:3: otherlv_0= 'returnType' otherlv_1= 'method' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_javaType_4_0= ruleJavaType ) ) (otherlv_5= ';' )?
            {
            otherlv_0=(Token)match(input,54,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getReturnTypeRuleAccess().getReturnTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,55,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getReturnTypeRuleAccess().getMethodKeyword_1());
            		
            // InternalLibrettoProjectProfile.g:1694:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalLibrettoProjectProfile.g:1695:4: (lv_name_2_0= RULE_ID )
            {
            // InternalLibrettoProjectProfile.g:1695:4: (lv_name_2_0= RULE_ID )
            // InternalLibrettoProjectProfile.g:1696:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_25); 

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

            otherlv_3=(Token)match(input,56,FOLLOW_26); 

            			newLeafNode(otherlv_3, grammarAccess.getReturnTypeRuleAccess().getAsKeyword_3());
            		
            // InternalLibrettoProjectProfile.g:1716:3: ( (lv_javaType_4_0= ruleJavaType ) )
            // InternalLibrettoProjectProfile.g:1717:4: (lv_javaType_4_0= ruleJavaType )
            {
            // InternalLibrettoProjectProfile.g:1717:4: (lv_javaType_4_0= ruleJavaType )
            // InternalLibrettoProjectProfile.g:1718:5: lv_javaType_4_0= ruleJavaType
            {

            					newCompositeNode(grammarAccess.getReturnTypeRuleAccess().getJavaTypeJavaTypeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_27);
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

            // InternalLibrettoProjectProfile.g:1735:3: (otherlv_5= ';' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==57) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:1736:4: otherlv_5= ';'
                    {
                    otherlv_5=(Token)match(input,57,FOLLOW_2); 

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
    // InternalLibrettoProjectProfile.g:1745:1: entryRuleParamTypeRule returns [EObject current=null] : iv_ruleParamTypeRule= ruleParamTypeRule EOF ;
    public final EObject entryRuleParamTypeRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamTypeRule = null;


        try {
            // InternalLibrettoProjectProfile.g:1745:54: (iv_ruleParamTypeRule= ruleParamTypeRule EOF )
            // InternalLibrettoProjectProfile.g:1746:2: iv_ruleParamTypeRule= ruleParamTypeRule EOF
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
    // InternalLibrettoProjectProfile.g:1752:1: ruleParamTypeRule returns [EObject current=null] : (otherlv_0= 'paramType' otherlv_1= 'name' ( (lv_paramName_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_javaType_4_0= ruleJavaType ) ) (otherlv_5= ';' )? ) ;
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
            // InternalLibrettoProjectProfile.g:1758:2: ( (otherlv_0= 'paramType' otherlv_1= 'name' ( (lv_paramName_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_javaType_4_0= ruleJavaType ) ) (otherlv_5= ';' )? ) )
            // InternalLibrettoProjectProfile.g:1759:2: (otherlv_0= 'paramType' otherlv_1= 'name' ( (lv_paramName_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_javaType_4_0= ruleJavaType ) ) (otherlv_5= ';' )? )
            {
            // InternalLibrettoProjectProfile.g:1759:2: (otherlv_0= 'paramType' otherlv_1= 'name' ( (lv_paramName_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_javaType_4_0= ruleJavaType ) ) (otherlv_5= ';' )? )
            // InternalLibrettoProjectProfile.g:1760:3: otherlv_0= 'paramType' otherlv_1= 'name' ( (lv_paramName_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_javaType_4_0= ruleJavaType ) ) (otherlv_5= ';' )?
            {
            otherlv_0=(Token)match(input,58,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getParamTypeRuleAccess().getParamTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,59,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getParamTypeRuleAccess().getNameKeyword_1());
            		
            // InternalLibrettoProjectProfile.g:1768:3: ( (lv_paramName_2_0= RULE_ID ) )
            // InternalLibrettoProjectProfile.g:1769:4: (lv_paramName_2_0= RULE_ID )
            {
            // InternalLibrettoProjectProfile.g:1769:4: (lv_paramName_2_0= RULE_ID )
            // InternalLibrettoProjectProfile.g:1770:5: lv_paramName_2_0= RULE_ID
            {
            lv_paramName_2_0=(Token)match(input,RULE_ID,FOLLOW_25); 

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

            otherlv_3=(Token)match(input,56,FOLLOW_26); 

            			newLeafNode(otherlv_3, grammarAccess.getParamTypeRuleAccess().getAsKeyword_3());
            		
            // InternalLibrettoProjectProfile.g:1790:3: ( (lv_javaType_4_0= ruleJavaType ) )
            // InternalLibrettoProjectProfile.g:1791:4: (lv_javaType_4_0= ruleJavaType )
            {
            // InternalLibrettoProjectProfile.g:1791:4: (lv_javaType_4_0= ruleJavaType )
            // InternalLibrettoProjectProfile.g:1792:5: lv_javaType_4_0= ruleJavaType
            {

            					newCompositeNode(grammarAccess.getParamTypeRuleAccess().getJavaTypeJavaTypeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_27);
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

            // InternalLibrettoProjectProfile.g:1809:3: (otherlv_5= ';' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==57) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:1810:4: otherlv_5= ';'
                    {
                    otherlv_5=(Token)match(input,57,FOLLOW_2); 

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
    // InternalLibrettoProjectProfile.g:1819:1: entryRuleRecordSelfReturnRule returns [EObject current=null] : iv_ruleRecordSelfReturnRule= ruleRecordSelfReturnRule EOF ;
    public final EObject entryRuleRecordSelfReturnRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecordSelfReturnRule = null;


        try {
            // InternalLibrettoProjectProfile.g:1819:61: (iv_ruleRecordSelfReturnRule= ruleRecordSelfReturnRule EOF )
            // InternalLibrettoProjectProfile.g:1820:2: iv_ruleRecordSelfReturnRule= ruleRecordSelfReturnRule EOF
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
    // InternalLibrettoProjectProfile.g:1826:1: ruleRecordSelfReturnRule returns [EObject current=null] : (otherlv_0= 'recordSelfReturn' ( (lv_methods_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_methods_3_0= RULE_ID ) ) )* (otherlv_4= ';' )? ) ;
    public final EObject ruleRecordSelfReturnRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_methods_1_0=null;
        Token otherlv_2=null;
        Token lv_methods_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:1832:2: ( (otherlv_0= 'recordSelfReturn' ( (lv_methods_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_methods_3_0= RULE_ID ) ) )* (otherlv_4= ';' )? ) )
            // InternalLibrettoProjectProfile.g:1833:2: (otherlv_0= 'recordSelfReturn' ( (lv_methods_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_methods_3_0= RULE_ID ) ) )* (otherlv_4= ';' )? )
            {
            // InternalLibrettoProjectProfile.g:1833:2: (otherlv_0= 'recordSelfReturn' ( (lv_methods_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_methods_3_0= RULE_ID ) ) )* (otherlv_4= ';' )? )
            // InternalLibrettoProjectProfile.g:1834:3: otherlv_0= 'recordSelfReturn' ( (lv_methods_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_methods_3_0= RULE_ID ) ) )* (otherlv_4= ';' )?
            {
            otherlv_0=(Token)match(input,60,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRecordSelfReturnRuleAccess().getRecordSelfReturnKeyword_0());
            		
            // InternalLibrettoProjectProfile.g:1838:3: ( (lv_methods_1_0= RULE_ID ) )
            // InternalLibrettoProjectProfile.g:1839:4: (lv_methods_1_0= RULE_ID )
            {
            // InternalLibrettoProjectProfile.g:1839:4: (lv_methods_1_0= RULE_ID )
            // InternalLibrettoProjectProfile.g:1840:5: lv_methods_1_0= RULE_ID
            {
            lv_methods_1_0=(Token)match(input,RULE_ID,FOLLOW_29); 

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

            // InternalLibrettoProjectProfile.g:1856:3: (otherlv_2= ',' ( (lv_methods_3_0= RULE_ID ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==61) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:1857:4: otherlv_2= ',' ( (lv_methods_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,61,FOLLOW_3); 

            	    				newLeafNode(otherlv_2, grammarAccess.getRecordSelfReturnRuleAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalLibrettoProjectProfile.g:1861:4: ( (lv_methods_3_0= RULE_ID ) )
            	    // InternalLibrettoProjectProfile.g:1862:5: (lv_methods_3_0= RULE_ID )
            	    {
            	    // InternalLibrettoProjectProfile.g:1862:5: (lv_methods_3_0= RULE_ID )
            	    // InternalLibrettoProjectProfile.g:1863:6: lv_methods_3_0= RULE_ID
            	    {
            	    lv_methods_3_0=(Token)match(input,RULE_ID,FOLLOW_29); 

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
            	    break loop23;
                }
            } while (true);

            // InternalLibrettoProjectProfile.g:1880:3: (otherlv_4= ';' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==57) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:1881:4: otherlv_4= ';'
                    {
                    otherlv_4=(Token)match(input,57,FOLLOW_2); 

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
    // InternalLibrettoProjectProfile.g:1890:1: entryRuleMethodOverrideRule returns [EObject current=null] : iv_ruleMethodOverrideRule= ruleMethodOverrideRule EOF ;
    public final EObject entryRuleMethodOverrideRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodOverrideRule = null;


        try {
            // InternalLibrettoProjectProfile.g:1890:59: (iv_ruleMethodOverrideRule= ruleMethodOverrideRule EOF )
            // InternalLibrettoProjectProfile.g:1891:2: iv_ruleMethodOverrideRule= ruleMethodOverrideRule EOF
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
    // InternalLibrettoProjectProfile.g:1897:1: ruleMethodOverrideRule returns [EObject current=null] : (otherlv_0= 'methodOverride' ( (lv_signature_1_0= ruleOperationSignature ) ) otherlv_2= 'returns' ( (lv_javaType_3_0= ruleJavaType ) ) (otherlv_4= ';' )? ) ;
    public final EObject ruleMethodOverrideRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_signature_1_0 = null;

        EObject lv_javaType_3_0 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:1903:2: ( (otherlv_0= 'methodOverride' ( (lv_signature_1_0= ruleOperationSignature ) ) otherlv_2= 'returns' ( (lv_javaType_3_0= ruleJavaType ) ) (otherlv_4= ';' )? ) )
            // InternalLibrettoProjectProfile.g:1904:2: (otherlv_0= 'methodOverride' ( (lv_signature_1_0= ruleOperationSignature ) ) otherlv_2= 'returns' ( (lv_javaType_3_0= ruleJavaType ) ) (otherlv_4= ';' )? )
            {
            // InternalLibrettoProjectProfile.g:1904:2: (otherlv_0= 'methodOverride' ( (lv_signature_1_0= ruleOperationSignature ) ) otherlv_2= 'returns' ( (lv_javaType_3_0= ruleJavaType ) ) (otherlv_4= ';' )? )
            // InternalLibrettoProjectProfile.g:1905:3: otherlv_0= 'methodOverride' ( (lv_signature_1_0= ruleOperationSignature ) ) otherlv_2= 'returns' ( (lv_javaType_3_0= ruleJavaType ) ) (otherlv_4= ';' )?
            {
            otherlv_0=(Token)match(input,62,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMethodOverrideRuleAccess().getMethodOverrideKeyword_0());
            		
            // InternalLibrettoProjectProfile.g:1909:3: ( (lv_signature_1_0= ruleOperationSignature ) )
            // InternalLibrettoProjectProfile.g:1910:4: (lv_signature_1_0= ruleOperationSignature )
            {
            // InternalLibrettoProjectProfile.g:1910:4: (lv_signature_1_0= ruleOperationSignature )
            // InternalLibrettoProjectProfile.g:1911:5: lv_signature_1_0= ruleOperationSignature
            {

            					newCompositeNode(grammarAccess.getMethodOverrideRuleAccess().getSignatureOperationSignatureParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_30);
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

            otherlv_2=(Token)match(input,63,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getMethodOverrideRuleAccess().getReturnsKeyword_2());
            		
            // InternalLibrettoProjectProfile.g:1932:3: ( (lv_javaType_3_0= ruleJavaType ) )
            // InternalLibrettoProjectProfile.g:1933:4: (lv_javaType_3_0= ruleJavaType )
            {
            // InternalLibrettoProjectProfile.g:1933:4: (lv_javaType_3_0= ruleJavaType )
            // InternalLibrettoProjectProfile.g:1934:5: lv_javaType_3_0= ruleJavaType
            {

            					newCompositeNode(grammarAccess.getMethodOverrideRuleAccess().getJavaTypeJavaTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_27);
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

            // InternalLibrettoProjectProfile.g:1951:3: (otherlv_4= ';' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==57) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:1952:4: otherlv_4= ';'
                    {
                    otherlv_4=(Token)match(input,57,FOLLOW_2); 

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
    // InternalLibrettoProjectProfile.g:1961:1: entryRuleJavaType returns [EObject current=null] : iv_ruleJavaType= ruleJavaType EOF ;
    public final EObject entryRuleJavaType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJavaType = null;


        try {
            // InternalLibrettoProjectProfile.g:1961:49: (iv_ruleJavaType= ruleJavaType EOF )
            // InternalLibrettoProjectProfile.g:1962:2: iv_ruleJavaType= ruleJavaType EOF
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
    // InternalLibrettoProjectProfile.g:1968:1: ruleJavaType returns [EObject current=null] : (this_PrimitiveType_0= rulePrimitiveType | this_QualifiedName_1= ruleQualifiedName ) ;
    public final EObject ruleJavaType() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveType_0 = null;

        EObject this_QualifiedName_1 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:1974:2: ( (this_PrimitiveType_0= rulePrimitiveType | this_QualifiedName_1= ruleQualifiedName ) )
            // InternalLibrettoProjectProfile.g:1975:2: (this_PrimitiveType_0= rulePrimitiveType | this_QualifiedName_1= ruleQualifiedName )
            {
            // InternalLibrettoProjectProfile.g:1975:2: (this_PrimitiveType_0= rulePrimitiveType | this_QualifiedName_1= ruleQualifiedName )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=65 && LA26_0<=73)) ) {
                alt26=1;
            }
            else if ( (LA26_0==RULE_ID) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:1976:3: this_PrimitiveType_0= rulePrimitiveType
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
                    // InternalLibrettoProjectProfile.g:1985:3: this_QualifiedName_1= ruleQualifiedName
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
    // InternalLibrettoProjectProfile.g:1997:1: entryRuleQualifiedName returns [EObject current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final EObject entryRuleQualifiedName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedName = null;


        try {
            // InternalLibrettoProjectProfile.g:1997:54: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalLibrettoProjectProfile.g:1998:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalLibrettoProjectProfile.g:2004:1: ruleQualifiedName returns [EObject current=null] : ( ( (lv_segments_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_segments_2_0= RULE_ID ) ) )* ) ;
    public final EObject ruleQualifiedName() throws RecognitionException {
        EObject current = null;

        Token lv_segments_0_0=null;
        Token otherlv_1=null;
        Token lv_segments_2_0=null;


        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:2010:2: ( ( ( (lv_segments_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_segments_2_0= RULE_ID ) ) )* ) )
            // InternalLibrettoProjectProfile.g:2011:2: ( ( (lv_segments_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_segments_2_0= RULE_ID ) ) )* )
            {
            // InternalLibrettoProjectProfile.g:2011:2: ( ( (lv_segments_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_segments_2_0= RULE_ID ) ) )* )
            // InternalLibrettoProjectProfile.g:2012:3: ( (lv_segments_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_segments_2_0= RULE_ID ) ) )*
            {
            // InternalLibrettoProjectProfile.g:2012:3: ( (lv_segments_0_0= RULE_ID ) )
            // InternalLibrettoProjectProfile.g:2013:4: (lv_segments_0_0= RULE_ID )
            {
            // InternalLibrettoProjectProfile.g:2013:4: (lv_segments_0_0= RULE_ID )
            // InternalLibrettoProjectProfile.g:2014:5: lv_segments_0_0= RULE_ID
            {
            lv_segments_0_0=(Token)match(input,RULE_ID,FOLLOW_31); 

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

            // InternalLibrettoProjectProfile.g:2030:3: (otherlv_1= '.' ( (lv_segments_2_0= RULE_ID ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==64) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:2031:4: otherlv_1= '.' ( (lv_segments_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,64,FOLLOW_3); 

            	    				newLeafNode(otherlv_1, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    // InternalLibrettoProjectProfile.g:2035:4: ( (lv_segments_2_0= RULE_ID ) )
            	    // InternalLibrettoProjectProfile.g:2036:5: (lv_segments_2_0= RULE_ID )
            	    {
            	    // InternalLibrettoProjectProfile.g:2036:5: (lv_segments_2_0= RULE_ID )
            	    // InternalLibrettoProjectProfile.g:2037:6: lv_segments_2_0= RULE_ID
            	    {
            	    lv_segments_2_0=(Token)match(input,RULE_ID,FOLLOW_31); 

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
            	    break loop27;
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
    // InternalLibrettoProjectProfile.g:2058:1: entryRulePrimitiveType returns [EObject current=null] : iv_rulePrimitiveType= rulePrimitiveType EOF ;
    public final EObject entryRulePrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveType = null;


        try {
            // InternalLibrettoProjectProfile.g:2058:54: (iv_rulePrimitiveType= rulePrimitiveType EOF )
            // InternalLibrettoProjectProfile.g:2059:2: iv_rulePrimitiveType= rulePrimitiveType EOF
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
    // InternalLibrettoProjectProfile.g:2065:1: rulePrimitiveType returns [EObject current=null] : ( ( (lv_kind_0_1= 'boolean' | lv_kind_0_2= 'int' | lv_kind_0_3= 'long' | lv_kind_0_4= 'double' | lv_kind_0_5= 'float' | lv_kind_0_6= 'short' | lv_kind_0_7= 'byte' | lv_kind_0_8= 'char' | lv_kind_0_9= 'void' ) ) ) ;
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
            // InternalLibrettoProjectProfile.g:2071:2: ( ( ( (lv_kind_0_1= 'boolean' | lv_kind_0_2= 'int' | lv_kind_0_3= 'long' | lv_kind_0_4= 'double' | lv_kind_0_5= 'float' | lv_kind_0_6= 'short' | lv_kind_0_7= 'byte' | lv_kind_0_8= 'char' | lv_kind_0_9= 'void' ) ) ) )
            // InternalLibrettoProjectProfile.g:2072:2: ( ( (lv_kind_0_1= 'boolean' | lv_kind_0_2= 'int' | lv_kind_0_3= 'long' | lv_kind_0_4= 'double' | lv_kind_0_5= 'float' | lv_kind_0_6= 'short' | lv_kind_0_7= 'byte' | lv_kind_0_8= 'char' | lv_kind_0_9= 'void' ) ) )
            {
            // InternalLibrettoProjectProfile.g:2072:2: ( ( (lv_kind_0_1= 'boolean' | lv_kind_0_2= 'int' | lv_kind_0_3= 'long' | lv_kind_0_4= 'double' | lv_kind_0_5= 'float' | lv_kind_0_6= 'short' | lv_kind_0_7= 'byte' | lv_kind_0_8= 'char' | lv_kind_0_9= 'void' ) ) )
            // InternalLibrettoProjectProfile.g:2073:3: ( (lv_kind_0_1= 'boolean' | lv_kind_0_2= 'int' | lv_kind_0_3= 'long' | lv_kind_0_4= 'double' | lv_kind_0_5= 'float' | lv_kind_0_6= 'short' | lv_kind_0_7= 'byte' | lv_kind_0_8= 'char' | lv_kind_0_9= 'void' ) )
            {
            // InternalLibrettoProjectProfile.g:2073:3: ( (lv_kind_0_1= 'boolean' | lv_kind_0_2= 'int' | lv_kind_0_3= 'long' | lv_kind_0_4= 'double' | lv_kind_0_5= 'float' | lv_kind_0_6= 'short' | lv_kind_0_7= 'byte' | lv_kind_0_8= 'char' | lv_kind_0_9= 'void' ) )
            // InternalLibrettoProjectProfile.g:2074:4: (lv_kind_0_1= 'boolean' | lv_kind_0_2= 'int' | lv_kind_0_3= 'long' | lv_kind_0_4= 'double' | lv_kind_0_5= 'float' | lv_kind_0_6= 'short' | lv_kind_0_7= 'byte' | lv_kind_0_8= 'char' | lv_kind_0_9= 'void' )
            {
            // InternalLibrettoProjectProfile.g:2074:4: (lv_kind_0_1= 'boolean' | lv_kind_0_2= 'int' | lv_kind_0_3= 'long' | lv_kind_0_4= 'double' | lv_kind_0_5= 'float' | lv_kind_0_6= 'short' | lv_kind_0_7= 'byte' | lv_kind_0_8= 'char' | lv_kind_0_9= 'void' )
            int alt28=9;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt28=1;
                }
                break;
            case 66:
                {
                alt28=2;
                }
                break;
            case 67:
                {
                alt28=3;
                }
                break;
            case 68:
                {
                alt28=4;
                }
                break;
            case 69:
                {
                alt28=5;
                }
                break;
            case 70:
                {
                alt28=6;
                }
                break;
            case 71:
                {
                alt28=7;
                }
                break;
            case 72:
                {
                alt28=8;
                }
                break;
            case 73:
                {
                alt28=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:2075:5: lv_kind_0_1= 'boolean'
                    {
                    lv_kind_0_1=(Token)match(input,65,FOLLOW_2); 

                    					newLeafNode(lv_kind_0_1, grammarAccess.getPrimitiveTypeAccess().getKindBooleanKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "kind", lv_kind_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalLibrettoProjectProfile.g:2086:5: lv_kind_0_2= 'int'
                    {
                    lv_kind_0_2=(Token)match(input,66,FOLLOW_2); 

                    					newLeafNode(lv_kind_0_2, grammarAccess.getPrimitiveTypeAccess().getKindIntKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "kind", lv_kind_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalLibrettoProjectProfile.g:2097:5: lv_kind_0_3= 'long'
                    {
                    lv_kind_0_3=(Token)match(input,67,FOLLOW_2); 

                    					newLeafNode(lv_kind_0_3, grammarAccess.getPrimitiveTypeAccess().getKindLongKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "kind", lv_kind_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalLibrettoProjectProfile.g:2108:5: lv_kind_0_4= 'double'
                    {
                    lv_kind_0_4=(Token)match(input,68,FOLLOW_2); 

                    					newLeafNode(lv_kind_0_4, grammarAccess.getPrimitiveTypeAccess().getKindDoubleKeyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "kind", lv_kind_0_4, null);
                    				

                    }
                    break;
                case 5 :
                    // InternalLibrettoProjectProfile.g:2119:5: lv_kind_0_5= 'float'
                    {
                    lv_kind_0_5=(Token)match(input,69,FOLLOW_2); 

                    					newLeafNode(lv_kind_0_5, grammarAccess.getPrimitiveTypeAccess().getKindFloatKeyword_0_4());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "kind", lv_kind_0_5, null);
                    				

                    }
                    break;
                case 6 :
                    // InternalLibrettoProjectProfile.g:2130:5: lv_kind_0_6= 'short'
                    {
                    lv_kind_0_6=(Token)match(input,70,FOLLOW_2); 

                    					newLeafNode(lv_kind_0_6, grammarAccess.getPrimitiveTypeAccess().getKindShortKeyword_0_5());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "kind", lv_kind_0_6, null);
                    				

                    }
                    break;
                case 7 :
                    // InternalLibrettoProjectProfile.g:2141:5: lv_kind_0_7= 'byte'
                    {
                    lv_kind_0_7=(Token)match(input,71,FOLLOW_2); 

                    					newLeafNode(lv_kind_0_7, grammarAccess.getPrimitiveTypeAccess().getKindByteKeyword_0_6());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "kind", lv_kind_0_7, null);
                    				

                    }
                    break;
                case 8 :
                    // InternalLibrettoProjectProfile.g:2152:5: lv_kind_0_8= 'char'
                    {
                    lv_kind_0_8=(Token)match(input,72,FOLLOW_2); 

                    					newLeafNode(lv_kind_0_8, grammarAccess.getPrimitiveTypeAccess().getKindCharKeyword_0_7());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "kind", lv_kind_0_8, null);
                    				

                    }
                    break;
                case 9 :
                    // InternalLibrettoProjectProfile.g:2163:5: lv_kind_0_9= 'void'
                    {
                    lv_kind_0_9=(Token)match(input,73,FOLLOW_2); 

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
    // InternalLibrettoProjectProfile.g:2179:1: entryRuleOperationSignature returns [EObject current=null] : iv_ruleOperationSignature= ruleOperationSignature EOF ;
    public final EObject entryRuleOperationSignature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationSignature = null;


        try {
            // InternalLibrettoProjectProfile.g:2179:59: (iv_ruleOperationSignature= ruleOperationSignature EOF )
            // InternalLibrettoProjectProfile.g:2180:2: iv_ruleOperationSignature= ruleOperationSignature EOF
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
    // InternalLibrettoProjectProfile.g:2186:1: ruleOperationSignature returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleTypedParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleTypedParam ) ) )* )? otherlv_5= ')' ) ;
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
            // InternalLibrettoProjectProfile.g:2192:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleTypedParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleTypedParam ) ) )* )? otherlv_5= ')' ) )
            // InternalLibrettoProjectProfile.g:2193:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleTypedParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleTypedParam ) ) )* )? otherlv_5= ')' )
            {
            // InternalLibrettoProjectProfile.g:2193:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleTypedParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleTypedParam ) ) )* )? otherlv_5= ')' )
            // InternalLibrettoProjectProfile.g:2194:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleTypedParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleTypedParam ) ) )* )? otherlv_5= ')'
            {
            // InternalLibrettoProjectProfile.g:2194:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalLibrettoProjectProfile.g:2195:4: (lv_name_0_0= RULE_ID )
            {
            // InternalLibrettoProjectProfile.g:2195:4: (lv_name_0_0= RULE_ID )
            // InternalLibrettoProjectProfile.g:2196:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_32); 

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

            otherlv_1=(Token)match(input,74,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getOperationSignatureAccess().getLeftParenthesisKeyword_1());
            		
            // InternalLibrettoProjectProfile.g:2216:3: ( ( (lv_params_2_0= ruleTypedParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleTypedParam ) ) )* )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID||(LA30_0>=65 && LA30_0<=73)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:2217:4: ( (lv_params_2_0= ruleTypedParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleTypedParam ) ) )*
                    {
                    // InternalLibrettoProjectProfile.g:2217:4: ( (lv_params_2_0= ruleTypedParam ) )
                    // InternalLibrettoProjectProfile.g:2218:5: (lv_params_2_0= ruleTypedParam )
                    {
                    // InternalLibrettoProjectProfile.g:2218:5: (lv_params_2_0= ruleTypedParam )
                    // InternalLibrettoProjectProfile.g:2219:6: lv_params_2_0= ruleTypedParam
                    {

                    						newCompositeNode(grammarAccess.getOperationSignatureAccess().getParamsTypedParamParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_34);
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

                    // InternalLibrettoProjectProfile.g:2236:4: (otherlv_3= ',' ( (lv_params_4_0= ruleTypedParam ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==61) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalLibrettoProjectProfile.g:2237:5: otherlv_3= ',' ( (lv_params_4_0= ruleTypedParam ) )
                    	    {
                    	    otherlv_3=(Token)match(input,61,FOLLOW_26); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getOperationSignatureAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalLibrettoProjectProfile.g:2241:5: ( (lv_params_4_0= ruleTypedParam ) )
                    	    // InternalLibrettoProjectProfile.g:2242:6: (lv_params_4_0= ruleTypedParam )
                    	    {
                    	    // InternalLibrettoProjectProfile.g:2242:6: (lv_params_4_0= ruleTypedParam )
                    	    // InternalLibrettoProjectProfile.g:2243:7: lv_params_4_0= ruleTypedParam
                    	    {

                    	    							newCompositeNode(grammarAccess.getOperationSignatureAccess().getParamsTypedParamParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_34);
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
                    	    break loop29;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,75,FOLLOW_2); 

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
    // InternalLibrettoProjectProfile.g:2270:1: entryRuleTypedParam returns [EObject current=null] : iv_ruleTypedParam= ruleTypedParam EOF ;
    public final EObject entryRuleTypedParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedParam = null;


        try {
            // InternalLibrettoProjectProfile.g:2270:51: (iv_ruleTypedParam= ruleTypedParam EOF )
            // InternalLibrettoProjectProfile.g:2271:2: iv_ruleTypedParam= ruleTypedParam EOF
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
    // InternalLibrettoProjectProfile.g:2277:1: ruleTypedParam returns [EObject current=null] : ( ( (lv_type_0_0= ruleJavaType ) ) ( (lv_paramName_1_0= RULE_ID ) ) ) ;
    public final EObject ruleTypedParam() throws RecognitionException {
        EObject current = null;

        Token lv_paramName_1_0=null;
        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:2283:2: ( ( ( (lv_type_0_0= ruleJavaType ) ) ( (lv_paramName_1_0= RULE_ID ) ) ) )
            // InternalLibrettoProjectProfile.g:2284:2: ( ( (lv_type_0_0= ruleJavaType ) ) ( (lv_paramName_1_0= RULE_ID ) ) )
            {
            // InternalLibrettoProjectProfile.g:2284:2: ( ( (lv_type_0_0= ruleJavaType ) ) ( (lv_paramName_1_0= RULE_ID ) ) )
            // InternalLibrettoProjectProfile.g:2285:3: ( (lv_type_0_0= ruleJavaType ) ) ( (lv_paramName_1_0= RULE_ID ) )
            {
            // InternalLibrettoProjectProfile.g:2285:3: ( (lv_type_0_0= ruleJavaType ) )
            // InternalLibrettoProjectProfile.g:2286:4: (lv_type_0_0= ruleJavaType )
            {
            // InternalLibrettoProjectProfile.g:2286:4: (lv_type_0_0= ruleJavaType )
            // InternalLibrettoProjectProfile.g:2287:5: lv_type_0_0= ruleJavaType
            {

            					newCompositeNode(grammarAccess.getTypedParamAccess().getTypeJavaTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
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

            // InternalLibrettoProjectProfile.g:2304:3: ( (lv_paramName_1_0= RULE_ID ) )
            // InternalLibrettoProjectProfile.g:2305:4: (lv_paramName_1_0= RULE_ID )
            {
            // InternalLibrettoProjectProfile.g:2305:4: (lv_paramName_1_0= RULE_ID )
            // InternalLibrettoProjectProfile.g:2306:5: lv_paramName_1_0= RULE_ID
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
    // InternalLibrettoProjectProfile.g:2326:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // InternalLibrettoProjectProfile.g:2326:47: (iv_ruleValidID= ruleValidID EOF )
            // InternalLibrettoProjectProfile.g:2327:2: iv_ruleValidID= ruleValidID EOF
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
    // InternalLibrettoProjectProfile.g:2333:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( (kw= '.' | kw= '-' | kw= '_' ) this_ID_4= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_4=null;


        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:2339:2: ( (this_ID_0= RULE_ID ( (kw= '.' | kw= '-' | kw= '_' ) this_ID_4= RULE_ID )* ) )
            // InternalLibrettoProjectProfile.g:2340:2: (this_ID_0= RULE_ID ( (kw= '.' | kw= '-' | kw= '_' ) this_ID_4= RULE_ID )* )
            {
            // InternalLibrettoProjectProfile.g:2340:2: (this_ID_0= RULE_ID ( (kw= '.' | kw= '-' | kw= '_' ) this_ID_4= RULE_ID )* )
            // InternalLibrettoProjectProfile.g:2341:3: this_ID_0= RULE_ID ( (kw= '.' | kw= '-' | kw= '_' ) this_ID_4= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_35); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getValidIDAccess().getIDTerminalRuleCall_0());
            		
            // InternalLibrettoProjectProfile.g:2348:3: ( (kw= '.' | kw= '-' | kw= '_' ) this_ID_4= RULE_ID )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==64||(LA32_0>=76 && LA32_0<=77)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:2349:4: (kw= '.' | kw= '-' | kw= '_' ) this_ID_4= RULE_ID
            	    {
            	    // InternalLibrettoProjectProfile.g:2349:4: (kw= '.' | kw= '-' | kw= '_' )
            	    int alt31=3;
            	    switch ( input.LA(1) ) {
            	    case 64:
            	        {
            	        alt31=1;
            	        }
            	        break;
            	    case 76:
            	        {
            	        alt31=2;
            	        }
            	        break;
            	    case 77:
            	        {
            	        alt31=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 31, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt31) {
            	        case 1 :
            	            // InternalLibrettoProjectProfile.g:2350:5: kw= '.'
            	            {
            	            kw=(Token)match(input,64,FOLLOW_3); 

            	            					current.merge(kw);
            	            					newLeafNode(kw, grammarAccess.getValidIDAccess().getFullStopKeyword_1_0_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalLibrettoProjectProfile.g:2356:5: kw= '-'
            	            {
            	            kw=(Token)match(input,76,FOLLOW_3); 

            	            					current.merge(kw);
            	            					newLeafNode(kw, grammarAccess.getValidIDAccess().getHyphenMinusKeyword_1_0_1());
            	            				

            	            }
            	            break;
            	        case 3 :
            	            // InternalLibrettoProjectProfile.g:2362:5: kw= '_'
            	            {
            	            kw=(Token)match(input,77,FOLLOW_3); 

            	            					current.merge(kw);
            	            					newLeafNode(kw, grammarAccess.getValidIDAccess().get_Keyword_1_0_2());
            	            				

            	            }
            	            break;

            	    }

            	    this_ID_4=(Token)match(input,RULE_ID,FOLLOW_35); 

            	    				current.merge(this_ID_4);
            	    			

            	    				newLeafNode(this_ID_4, grammarAccess.getValidIDAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop32;
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0008001000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000081A000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000007C2000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000200067002000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000080002000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000700002000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000600002000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000002000002000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00001C4000002000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000038000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0001C00000002000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0006000000002000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x5450000000002000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0020000000020000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000040L,0x00000000000003FEL});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x2200000000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000BFEL});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003001L});

}