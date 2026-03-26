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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'profile'", "'{'", "'}'", "'project'", "'rootDir'", "';'", "'modules'", "'module'", "'dir'", "'specsDir'", "'testsDir'", "'mainJavaDir'", "'basePackage'", "'surface'", "'for'", "'spec'", "'returnType'", "'method'", "'as'", "'paramType'", "'name'", "'recordSelfReturn'", "','", "'methodOverride'", "'returns'", "'.'", "'boolean'", "'int'", "'long'", "'double'", "'float'", "'short'", "'byte'", "'char'", "'void'", "'('", "')'"
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
    // InternalLibrettoProjectProfile.g:71:1: ruleProjectProfile returns [EObject current=null] : (otherlv_0= 'profile' ( (lv_profileName_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_project_3_0= ruleProjectBlock ) )? ( (lv_surface_4_0= ruleSurfaceBlock ) )? otherlv_5= '}' ) ;
    public final EObject ruleProjectProfile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_profileName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_project_3_0 = null;

        EObject lv_surface_4_0 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:77:2: ( (otherlv_0= 'profile' ( (lv_profileName_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_project_3_0= ruleProjectBlock ) )? ( (lv_surface_4_0= ruleSurfaceBlock ) )? otherlv_5= '}' ) )
            // InternalLibrettoProjectProfile.g:78:2: (otherlv_0= 'profile' ( (lv_profileName_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_project_3_0= ruleProjectBlock ) )? ( (lv_surface_4_0= ruleSurfaceBlock ) )? otherlv_5= '}' )
            {
            // InternalLibrettoProjectProfile.g:78:2: (otherlv_0= 'profile' ( (lv_profileName_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_project_3_0= ruleProjectBlock ) )? ( (lv_surface_4_0= ruleSurfaceBlock ) )? otherlv_5= '}' )
            // InternalLibrettoProjectProfile.g:79:3: otherlv_0= 'profile' ( (lv_profileName_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_project_3_0= ruleProjectBlock ) )? ( (lv_surface_4_0= ruleSurfaceBlock ) )? otherlv_5= '}'
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

            // InternalLibrettoProjectProfile.g:124:3: ( (lv_surface_4_0= ruleSurfaceBlock ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==24) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:125:4: (lv_surface_4_0= ruleSurfaceBlock )
                    {
                    // InternalLibrettoProjectProfile.g:125:4: (lv_surface_4_0= ruleSurfaceBlock )
                    // InternalLibrettoProjectProfile.g:126:5: lv_surface_4_0= ruleSurfaceBlock
                    {

                    					newCompositeNode(grammarAccess.getProjectProfileAccess().getSurfaceSurfaceBlockParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_surface_4_0=ruleSurfaceBlock();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getProjectProfileRule());
                    					}
                    					set(
                    						current,
                    						"surface",
                    						lv_surface_4_0,
                    						"com.robenglander.libretto.spec.LibrettoProjectProfile.SurfaceBlock");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getProjectProfileAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalLibrettoProjectProfile.g:151:1: entryRuleProjectBlock returns [EObject current=null] : iv_ruleProjectBlock= ruleProjectBlock EOF ;
    public final EObject entryRuleProjectBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProjectBlock = null;


        try {
            // InternalLibrettoProjectProfile.g:151:53: (iv_ruleProjectBlock= ruleProjectBlock EOF )
            // InternalLibrettoProjectProfile.g:152:2: iv_ruleProjectBlock= ruleProjectBlock EOF
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
    // InternalLibrettoProjectProfile.g:158:1: ruleProjectBlock returns [EObject current=null] : (otherlv_0= 'project' otherlv_1= '{' (otherlv_2= 'rootDir' ( (lv_rootDir_3_0= RULE_STRING ) ) otherlv_4= ';' )? ( (lv_modules_5_0= ruleModulesBlock ) )? otherlv_6= '}' ) ;
    public final EObject ruleProjectBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_rootDir_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_modules_5_0 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:164:2: ( (otherlv_0= 'project' otherlv_1= '{' (otherlv_2= 'rootDir' ( (lv_rootDir_3_0= RULE_STRING ) ) otherlv_4= ';' )? ( (lv_modules_5_0= ruleModulesBlock ) )? otherlv_6= '}' ) )
            // InternalLibrettoProjectProfile.g:165:2: (otherlv_0= 'project' otherlv_1= '{' (otherlv_2= 'rootDir' ( (lv_rootDir_3_0= RULE_STRING ) ) otherlv_4= ';' )? ( (lv_modules_5_0= ruleModulesBlock ) )? otherlv_6= '}' )
            {
            // InternalLibrettoProjectProfile.g:165:2: (otherlv_0= 'project' otherlv_1= '{' (otherlv_2= 'rootDir' ( (lv_rootDir_3_0= RULE_STRING ) ) otherlv_4= ';' )? ( (lv_modules_5_0= ruleModulesBlock ) )? otherlv_6= '}' )
            // InternalLibrettoProjectProfile.g:166:3: otherlv_0= 'project' otherlv_1= '{' (otherlv_2= 'rootDir' ( (lv_rootDir_3_0= RULE_STRING ) ) otherlv_4= ';' )? ( (lv_modules_5_0= ruleModulesBlock ) )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getProjectBlockAccess().getProjectKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getProjectBlockAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalLibrettoProjectProfile.g:174:3: (otherlv_2= 'rootDir' ( (lv_rootDir_3_0= RULE_STRING ) ) otherlv_4= ';' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:175:4: otherlv_2= 'rootDir' ( (lv_rootDir_3_0= RULE_STRING ) ) otherlv_4= ';'
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getProjectBlockAccess().getRootDirKeyword_2_0());
                    			
                    // InternalLibrettoProjectProfile.g:179:4: ( (lv_rootDir_3_0= RULE_STRING ) )
                    // InternalLibrettoProjectProfile.g:180:5: (lv_rootDir_3_0= RULE_STRING )
                    {
                    // InternalLibrettoProjectProfile.g:180:5: (lv_rootDir_3_0= RULE_STRING )
                    // InternalLibrettoProjectProfile.g:181:6: lv_rootDir_3_0= RULE_STRING
                    {
                    lv_rootDir_3_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

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

                    otherlv_4=(Token)match(input,16,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getProjectBlockAccess().getSemicolonKeyword_2_2());
                    			

                    }
                    break;

            }

            // InternalLibrettoProjectProfile.g:202:3: ( (lv_modules_5_0= ruleModulesBlock ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:203:4: (lv_modules_5_0= ruleModulesBlock )
                    {
                    // InternalLibrettoProjectProfile.g:203:4: (lv_modules_5_0= ruleModulesBlock )
                    // InternalLibrettoProjectProfile.g:204:5: lv_modules_5_0= ruleModulesBlock
                    {

                    					newCompositeNode(grammarAccess.getProjectBlockAccess().getModulesModulesBlockParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_7);
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

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

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


    // $ANTLR start "entryRuleModulesBlock"
    // InternalLibrettoProjectProfile.g:229:1: entryRuleModulesBlock returns [EObject current=null] : iv_ruleModulesBlock= ruleModulesBlock EOF ;
    public final EObject entryRuleModulesBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModulesBlock = null;


        try {
            // InternalLibrettoProjectProfile.g:229:53: (iv_ruleModulesBlock= ruleModulesBlock EOF )
            // InternalLibrettoProjectProfile.g:230:2: iv_ruleModulesBlock= ruleModulesBlock EOF
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
    // InternalLibrettoProjectProfile.g:236:1: ruleModulesBlock returns [EObject current=null] : (otherlv_0= 'modules' otherlv_1= '{' ( (lv_modules_2_0= ruleProjectModule ) )* otherlv_3= '}' ) ;
    public final EObject ruleModulesBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_modules_2_0 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:242:2: ( (otherlv_0= 'modules' otherlv_1= '{' ( (lv_modules_2_0= ruleProjectModule ) )* otherlv_3= '}' ) )
            // InternalLibrettoProjectProfile.g:243:2: (otherlv_0= 'modules' otherlv_1= '{' ( (lv_modules_2_0= ruleProjectModule ) )* otherlv_3= '}' )
            {
            // InternalLibrettoProjectProfile.g:243:2: (otherlv_0= 'modules' otherlv_1= '{' ( (lv_modules_2_0= ruleProjectModule ) )* otherlv_3= '}' )
            // InternalLibrettoProjectProfile.g:244:3: otherlv_0= 'modules' otherlv_1= '{' ( (lv_modules_2_0= ruleProjectModule ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getModulesBlockAccess().getModulesKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getModulesBlockAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalLibrettoProjectProfile.g:252:3: ( (lv_modules_2_0= ruleProjectModule ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:253:4: (lv_modules_2_0= ruleProjectModule )
            	    {
            	    // InternalLibrettoProjectProfile.g:253:4: (lv_modules_2_0= ruleProjectModule )
            	    // InternalLibrettoProjectProfile.g:254:5: lv_modules_2_0= ruleProjectModule
            	    {

            	    					newCompositeNode(grammarAccess.getModulesBlockAccess().getModulesProjectModuleParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_11);
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
            	    break loop5;
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
    // InternalLibrettoProjectProfile.g:279:1: entryRuleProjectModule returns [EObject current=null] : iv_ruleProjectModule= ruleProjectModule EOF ;
    public final EObject entryRuleProjectModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProjectModule = null;


        try {
            // InternalLibrettoProjectProfile.g:279:54: (iv_ruleProjectModule= ruleProjectModule EOF )
            // InternalLibrettoProjectProfile.g:280:2: iv_ruleProjectModule= ruleProjectModule EOF
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
    // InternalLibrettoProjectProfile.g:286:1: ruleProjectModule returns [EObject current=null] : (otherlv_0= 'module' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'dir' ( (lv_dir_4_0= RULE_STRING ) ) otherlv_5= ';' (otherlv_6= 'specsDir' ( (lv_specsDir_7_0= RULE_STRING ) ) otherlv_8= ';' )? (otherlv_9= 'testsDir' ( (lv_testsDir_10_0= RULE_STRING ) ) otherlv_11= ';' )? (otherlv_12= 'mainJavaDir' ( (lv_mainJavaDir_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'basePackage' ( (lv_basePackage_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= '}' ) ;
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
            // InternalLibrettoProjectProfile.g:292:2: ( (otherlv_0= 'module' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'dir' ( (lv_dir_4_0= RULE_STRING ) ) otherlv_5= ';' (otherlv_6= 'specsDir' ( (lv_specsDir_7_0= RULE_STRING ) ) otherlv_8= ';' )? (otherlv_9= 'testsDir' ( (lv_testsDir_10_0= RULE_STRING ) ) otherlv_11= ';' )? (otherlv_12= 'mainJavaDir' ( (lv_mainJavaDir_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'basePackage' ( (lv_basePackage_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= '}' ) )
            // InternalLibrettoProjectProfile.g:293:2: (otherlv_0= 'module' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'dir' ( (lv_dir_4_0= RULE_STRING ) ) otherlv_5= ';' (otherlv_6= 'specsDir' ( (lv_specsDir_7_0= RULE_STRING ) ) otherlv_8= ';' )? (otherlv_9= 'testsDir' ( (lv_testsDir_10_0= RULE_STRING ) ) otherlv_11= ';' )? (otherlv_12= 'mainJavaDir' ( (lv_mainJavaDir_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'basePackage' ( (lv_basePackage_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= '}' )
            {
            // InternalLibrettoProjectProfile.g:293:2: (otherlv_0= 'module' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'dir' ( (lv_dir_4_0= RULE_STRING ) ) otherlv_5= ';' (otherlv_6= 'specsDir' ( (lv_specsDir_7_0= RULE_STRING ) ) otherlv_8= ';' )? (otherlv_9= 'testsDir' ( (lv_testsDir_10_0= RULE_STRING ) ) otherlv_11= ';' )? (otherlv_12= 'mainJavaDir' ( (lv_mainJavaDir_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'basePackage' ( (lv_basePackage_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= '}' )
            // InternalLibrettoProjectProfile.g:294:3: otherlv_0= 'module' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'dir' ( (lv_dir_4_0= RULE_STRING ) ) otherlv_5= ';' (otherlv_6= 'specsDir' ( (lv_specsDir_7_0= RULE_STRING ) ) otherlv_8= ';' )? (otherlv_9= 'testsDir' ( (lv_testsDir_10_0= RULE_STRING ) ) otherlv_11= ';' )? (otherlv_12= 'mainJavaDir' ( (lv_mainJavaDir_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'basePackage' ( (lv_basePackage_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProjectModuleAccess().getModuleKeyword_0());
            		
            // InternalLibrettoProjectProfile.g:298:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalLibrettoProjectProfile.g:299:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalLibrettoProjectProfile.g:299:4: (lv_name_1_0= RULE_STRING )
            // InternalLibrettoProjectProfile.g:300:5: lv_name_1_0= RULE_STRING
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

            otherlv_2=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getProjectModuleAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getProjectModuleAccess().getDirKeyword_3());
            		
            // InternalLibrettoProjectProfile.g:324:3: ( (lv_dir_4_0= RULE_STRING ) )
            // InternalLibrettoProjectProfile.g:325:4: (lv_dir_4_0= RULE_STRING )
            {
            // InternalLibrettoProjectProfile.g:325:4: (lv_dir_4_0= RULE_STRING )
            // InternalLibrettoProjectProfile.g:326:5: lv_dir_4_0= RULE_STRING
            {
            lv_dir_4_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

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

            otherlv_5=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_5, grammarAccess.getProjectModuleAccess().getSemicolonKeyword_5());
            		
            // InternalLibrettoProjectProfile.g:346:3: (otherlv_6= 'specsDir' ( (lv_specsDir_7_0= RULE_STRING ) ) otherlv_8= ';' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:347:4: otherlv_6= 'specsDir' ( (lv_specsDir_7_0= RULE_STRING ) ) otherlv_8= ';'
                    {
                    otherlv_6=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getProjectModuleAccess().getSpecsDirKeyword_6_0());
                    			
                    // InternalLibrettoProjectProfile.g:351:4: ( (lv_specsDir_7_0= RULE_STRING ) )
                    // InternalLibrettoProjectProfile.g:352:5: (lv_specsDir_7_0= RULE_STRING )
                    {
                    // InternalLibrettoProjectProfile.g:352:5: (lv_specsDir_7_0= RULE_STRING )
                    // InternalLibrettoProjectProfile.g:353:6: lv_specsDir_7_0= RULE_STRING
                    {
                    lv_specsDir_7_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

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

                    otherlv_8=(Token)match(input,16,FOLLOW_14); 

                    				newLeafNode(otherlv_8, grammarAccess.getProjectModuleAccess().getSemicolonKeyword_6_2());
                    			

                    }
                    break;

            }

            // InternalLibrettoProjectProfile.g:374:3: (otherlv_9= 'testsDir' ( (lv_testsDir_10_0= RULE_STRING ) ) otherlv_11= ';' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:375:4: otherlv_9= 'testsDir' ( (lv_testsDir_10_0= RULE_STRING ) ) otherlv_11= ';'
                    {
                    otherlv_9=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getProjectModuleAccess().getTestsDirKeyword_7_0());
                    			
                    // InternalLibrettoProjectProfile.g:379:4: ( (lv_testsDir_10_0= RULE_STRING ) )
                    // InternalLibrettoProjectProfile.g:380:5: (lv_testsDir_10_0= RULE_STRING )
                    {
                    // InternalLibrettoProjectProfile.g:380:5: (lv_testsDir_10_0= RULE_STRING )
                    // InternalLibrettoProjectProfile.g:381:6: lv_testsDir_10_0= RULE_STRING
                    {
                    lv_testsDir_10_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

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

                    otherlv_11=(Token)match(input,16,FOLLOW_15); 

                    				newLeafNode(otherlv_11, grammarAccess.getProjectModuleAccess().getSemicolonKeyword_7_2());
                    			

                    }
                    break;

            }

            // InternalLibrettoProjectProfile.g:402:3: (otherlv_12= 'mainJavaDir' ( (lv_mainJavaDir_13_0= RULE_STRING ) ) otherlv_14= ';' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:403:4: otherlv_12= 'mainJavaDir' ( (lv_mainJavaDir_13_0= RULE_STRING ) ) otherlv_14= ';'
                    {
                    otherlv_12=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getProjectModuleAccess().getMainJavaDirKeyword_8_0());
                    			
                    // InternalLibrettoProjectProfile.g:407:4: ( (lv_mainJavaDir_13_0= RULE_STRING ) )
                    // InternalLibrettoProjectProfile.g:408:5: (lv_mainJavaDir_13_0= RULE_STRING )
                    {
                    // InternalLibrettoProjectProfile.g:408:5: (lv_mainJavaDir_13_0= RULE_STRING )
                    // InternalLibrettoProjectProfile.g:409:6: lv_mainJavaDir_13_0= RULE_STRING
                    {
                    lv_mainJavaDir_13_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

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

                    otherlv_14=(Token)match(input,16,FOLLOW_16); 

                    				newLeafNode(otherlv_14, grammarAccess.getProjectModuleAccess().getSemicolonKeyword_8_2());
                    			

                    }
                    break;

            }

            // InternalLibrettoProjectProfile.g:430:3: (otherlv_15= 'basePackage' ( (lv_basePackage_16_0= RULE_STRING ) ) otherlv_17= ';' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:431:4: otherlv_15= 'basePackage' ( (lv_basePackage_16_0= RULE_STRING ) ) otherlv_17= ';'
                    {
                    otherlv_15=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getProjectModuleAccess().getBasePackageKeyword_9_0());
                    			
                    // InternalLibrettoProjectProfile.g:435:4: ( (lv_basePackage_16_0= RULE_STRING ) )
                    // InternalLibrettoProjectProfile.g:436:5: (lv_basePackage_16_0= RULE_STRING )
                    {
                    // InternalLibrettoProjectProfile.g:436:5: (lv_basePackage_16_0= RULE_STRING )
                    // InternalLibrettoProjectProfile.g:437:6: lv_basePackage_16_0= RULE_STRING
                    {
                    lv_basePackage_16_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

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

                    otherlv_17=(Token)match(input,16,FOLLOW_7); 

                    				newLeafNode(otherlv_17, grammarAccess.getProjectModuleAccess().getSemicolonKeyword_9_2());
                    			

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


    // $ANTLR start "entryRuleSurfaceBlock"
    // InternalLibrettoProjectProfile.g:466:1: entryRuleSurfaceBlock returns [EObject current=null] : iv_ruleSurfaceBlock= ruleSurfaceBlock EOF ;
    public final EObject entryRuleSurfaceBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSurfaceBlock = null;


        try {
            // InternalLibrettoProjectProfile.g:466:53: (iv_ruleSurfaceBlock= ruleSurfaceBlock EOF )
            // InternalLibrettoProjectProfile.g:467:2: iv_ruleSurfaceBlock= ruleSurfaceBlock EOF
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
    // InternalLibrettoProjectProfile.g:473:1: ruleSurfaceBlock returns [EObject current=null] : (otherlv_0= 'surface' otherlv_1= '{' ( (lv_elements_2_0= ruleSurfaceElement ) )* otherlv_3= '}' ) ;
    public final EObject ruleSurfaceBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:479:2: ( (otherlv_0= 'surface' otherlv_1= '{' ( (lv_elements_2_0= ruleSurfaceElement ) )* otherlv_3= '}' ) )
            // InternalLibrettoProjectProfile.g:480:2: (otherlv_0= 'surface' otherlv_1= '{' ( (lv_elements_2_0= ruleSurfaceElement ) )* otherlv_3= '}' )
            {
            // InternalLibrettoProjectProfile.g:480:2: (otherlv_0= 'surface' otherlv_1= '{' ( (lv_elements_2_0= ruleSurfaceElement ) )* otherlv_3= '}' )
            // InternalLibrettoProjectProfile.g:481:3: otherlv_0= 'surface' otherlv_1= '{' ( (lv_elements_2_0= ruleSurfaceElement ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSurfaceBlockAccess().getSurfaceKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getSurfaceBlockAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalLibrettoProjectProfile.g:489:3: ( (lv_elements_2_0= ruleSurfaceElement ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==25||LA10_0==27||LA10_0==30||LA10_0==32||LA10_0==34) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:490:4: (lv_elements_2_0= ruleSurfaceElement )
            	    {
            	    // InternalLibrettoProjectProfile.g:490:4: (lv_elements_2_0= ruleSurfaceElement )
            	    // InternalLibrettoProjectProfile.g:491:5: lv_elements_2_0= ruleSurfaceElement
            	    {

            	    					newCompositeNode(grammarAccess.getSurfaceBlockAccess().getElementsSurfaceElementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_17);
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
            	    break loop10;
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
    // InternalLibrettoProjectProfile.g:516:1: entryRuleSurfaceElement returns [EObject current=null] : iv_ruleSurfaceElement= ruleSurfaceElement EOF ;
    public final EObject entryRuleSurfaceElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSurfaceElement = null;


        try {
            // InternalLibrettoProjectProfile.g:516:55: (iv_ruleSurfaceElement= ruleSurfaceElement EOF )
            // InternalLibrettoProjectProfile.g:517:2: iv_ruleSurfaceElement= ruleSurfaceElement EOF
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
    // InternalLibrettoProjectProfile.g:523:1: ruleSurfaceElement returns [EObject current=null] : (this_ScopedSurface_0= ruleScopedSurface | this_SurfaceRule_1= ruleSurfaceRule ) ;
    public final EObject ruleSurfaceElement() throws RecognitionException {
        EObject current = null;

        EObject this_ScopedSurface_0 = null;

        EObject this_SurfaceRule_1 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:529:2: ( (this_ScopedSurface_0= ruleScopedSurface | this_SurfaceRule_1= ruleSurfaceRule ) )
            // InternalLibrettoProjectProfile.g:530:2: (this_ScopedSurface_0= ruleScopedSurface | this_SurfaceRule_1= ruleSurfaceRule )
            {
            // InternalLibrettoProjectProfile.g:530:2: (this_ScopedSurface_0= ruleScopedSurface | this_SurfaceRule_1= ruleSurfaceRule )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            else if ( (LA11_0==27||LA11_0==30||LA11_0==32||LA11_0==34) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:531:3: this_ScopedSurface_0= ruleScopedSurface
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
                    // InternalLibrettoProjectProfile.g:540:3: this_SurfaceRule_1= ruleSurfaceRule
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
    // InternalLibrettoProjectProfile.g:552:1: entryRuleScopedSurface returns [EObject current=null] : iv_ruleScopedSurface= ruleScopedSurface EOF ;
    public final EObject entryRuleScopedSurface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScopedSurface = null;


        try {
            // InternalLibrettoProjectProfile.g:552:54: (iv_ruleScopedSurface= ruleScopedSurface EOF )
            // InternalLibrettoProjectProfile.g:553:2: iv_ruleScopedSurface= ruleScopedSurface EOF
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
    // InternalLibrettoProjectProfile.g:559:1: ruleScopedSurface returns [EObject current=null] : (otherlv_0= 'for' ( (otherlv_1= 'module' ( (lv_moduleId_2_0= RULE_STRING ) ) ) | (otherlv_3= 'spec' ( (lv_specId_4_0= RULE_STRING ) ) ) ) otherlv_5= '{' ( (lv_rules_6_0= ruleSurfaceRule ) )* otherlv_7= '}' ) ;
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
            // InternalLibrettoProjectProfile.g:565:2: ( (otherlv_0= 'for' ( (otherlv_1= 'module' ( (lv_moduleId_2_0= RULE_STRING ) ) ) | (otherlv_3= 'spec' ( (lv_specId_4_0= RULE_STRING ) ) ) ) otherlv_5= '{' ( (lv_rules_6_0= ruleSurfaceRule ) )* otherlv_7= '}' ) )
            // InternalLibrettoProjectProfile.g:566:2: (otherlv_0= 'for' ( (otherlv_1= 'module' ( (lv_moduleId_2_0= RULE_STRING ) ) ) | (otherlv_3= 'spec' ( (lv_specId_4_0= RULE_STRING ) ) ) ) otherlv_5= '{' ( (lv_rules_6_0= ruleSurfaceRule ) )* otherlv_7= '}' )
            {
            // InternalLibrettoProjectProfile.g:566:2: (otherlv_0= 'for' ( (otherlv_1= 'module' ( (lv_moduleId_2_0= RULE_STRING ) ) ) | (otherlv_3= 'spec' ( (lv_specId_4_0= RULE_STRING ) ) ) ) otherlv_5= '{' ( (lv_rules_6_0= ruleSurfaceRule ) )* otherlv_7= '}' )
            // InternalLibrettoProjectProfile.g:567:3: otherlv_0= 'for' ( (otherlv_1= 'module' ( (lv_moduleId_2_0= RULE_STRING ) ) ) | (otherlv_3= 'spec' ( (lv_specId_4_0= RULE_STRING ) ) ) ) otherlv_5= '{' ( (lv_rules_6_0= ruleSurfaceRule ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getScopedSurfaceAccess().getForKeyword_0());
            		
            // InternalLibrettoProjectProfile.g:571:3: ( (otherlv_1= 'module' ( (lv_moduleId_2_0= RULE_STRING ) ) ) | (otherlv_3= 'spec' ( (lv_specId_4_0= RULE_STRING ) ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18) ) {
                alt12=1;
            }
            else if ( (LA12_0==26) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:572:4: (otherlv_1= 'module' ( (lv_moduleId_2_0= RULE_STRING ) ) )
                    {
                    // InternalLibrettoProjectProfile.g:572:4: (otherlv_1= 'module' ( (lv_moduleId_2_0= RULE_STRING ) ) )
                    // InternalLibrettoProjectProfile.g:573:5: otherlv_1= 'module' ( (lv_moduleId_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_3); 

                    					newLeafNode(otherlv_1, grammarAccess.getScopedSurfaceAccess().getModuleKeyword_1_0_0());
                    				
                    // InternalLibrettoProjectProfile.g:577:5: ( (lv_moduleId_2_0= RULE_STRING ) )
                    // InternalLibrettoProjectProfile.g:578:6: (lv_moduleId_2_0= RULE_STRING )
                    {
                    // InternalLibrettoProjectProfile.g:578:6: (lv_moduleId_2_0= RULE_STRING )
                    // InternalLibrettoProjectProfile.g:579:7: lv_moduleId_2_0= RULE_STRING
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
                    // InternalLibrettoProjectProfile.g:597:4: (otherlv_3= 'spec' ( (lv_specId_4_0= RULE_STRING ) ) )
                    {
                    // InternalLibrettoProjectProfile.g:597:4: (otherlv_3= 'spec' ( (lv_specId_4_0= RULE_STRING ) ) )
                    // InternalLibrettoProjectProfile.g:598:5: otherlv_3= 'spec' ( (lv_specId_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_3); 

                    					newLeafNode(otherlv_3, grammarAccess.getScopedSurfaceAccess().getSpecKeyword_1_1_0());
                    				
                    // InternalLibrettoProjectProfile.g:602:5: ( (lv_specId_4_0= RULE_STRING ) )
                    // InternalLibrettoProjectProfile.g:603:6: (lv_specId_4_0= RULE_STRING )
                    {
                    // InternalLibrettoProjectProfile.g:603:6: (lv_specId_4_0= RULE_STRING )
                    // InternalLibrettoProjectProfile.g:604:7: lv_specId_4_0= RULE_STRING
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

            otherlv_5=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_5, grammarAccess.getScopedSurfaceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLibrettoProjectProfile.g:626:3: ( (lv_rules_6_0= ruleSurfaceRule ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==27||LA13_0==30||LA13_0==32||LA13_0==34) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:627:4: (lv_rules_6_0= ruleSurfaceRule )
            	    {
            	    // InternalLibrettoProjectProfile.g:627:4: (lv_rules_6_0= ruleSurfaceRule )
            	    // InternalLibrettoProjectProfile.g:628:5: lv_rules_6_0= ruleSurfaceRule
            	    {

            	    					newCompositeNode(grammarAccess.getScopedSurfaceAccess().getRulesSurfaceRuleParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_17);
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
            	    break loop13;
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
    // InternalLibrettoProjectProfile.g:653:1: entryRuleSurfaceRule returns [EObject current=null] : iv_ruleSurfaceRule= ruleSurfaceRule EOF ;
    public final EObject entryRuleSurfaceRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSurfaceRule = null;


        try {
            // InternalLibrettoProjectProfile.g:653:52: (iv_ruleSurfaceRule= ruleSurfaceRule EOF )
            // InternalLibrettoProjectProfile.g:654:2: iv_ruleSurfaceRule= ruleSurfaceRule EOF
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
    // InternalLibrettoProjectProfile.g:660:1: ruleSurfaceRule returns [EObject current=null] : (this_ReturnTypeRule_0= ruleReturnTypeRule | this_ParamTypeRule_1= ruleParamTypeRule | this_RecordSelfReturnRule_2= ruleRecordSelfReturnRule | this_MethodOverrideRule_3= ruleMethodOverrideRule ) ;
    public final EObject ruleSurfaceRule() throws RecognitionException {
        EObject current = null;

        EObject this_ReturnTypeRule_0 = null;

        EObject this_ParamTypeRule_1 = null;

        EObject this_RecordSelfReturnRule_2 = null;

        EObject this_MethodOverrideRule_3 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:666:2: ( (this_ReturnTypeRule_0= ruleReturnTypeRule | this_ParamTypeRule_1= ruleParamTypeRule | this_RecordSelfReturnRule_2= ruleRecordSelfReturnRule | this_MethodOverrideRule_3= ruleMethodOverrideRule ) )
            // InternalLibrettoProjectProfile.g:667:2: (this_ReturnTypeRule_0= ruleReturnTypeRule | this_ParamTypeRule_1= ruleParamTypeRule | this_RecordSelfReturnRule_2= ruleRecordSelfReturnRule | this_MethodOverrideRule_3= ruleMethodOverrideRule )
            {
            // InternalLibrettoProjectProfile.g:667:2: (this_ReturnTypeRule_0= ruleReturnTypeRule | this_ParamTypeRule_1= ruleParamTypeRule | this_RecordSelfReturnRule_2= ruleRecordSelfReturnRule | this_MethodOverrideRule_3= ruleMethodOverrideRule )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt14=1;
                }
                break;
            case 30:
                {
                alt14=2;
                }
                break;
            case 32:
                {
                alt14=3;
                }
                break;
            case 34:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:668:3: this_ReturnTypeRule_0= ruleReturnTypeRule
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
                    // InternalLibrettoProjectProfile.g:677:3: this_ParamTypeRule_1= ruleParamTypeRule
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
                    // InternalLibrettoProjectProfile.g:686:3: this_RecordSelfReturnRule_2= ruleRecordSelfReturnRule
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
                    // InternalLibrettoProjectProfile.g:695:3: this_MethodOverrideRule_3= ruleMethodOverrideRule
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
    // InternalLibrettoProjectProfile.g:707:1: entryRuleReturnTypeRule returns [EObject current=null] : iv_ruleReturnTypeRule= ruleReturnTypeRule EOF ;
    public final EObject entryRuleReturnTypeRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnTypeRule = null;


        try {
            // InternalLibrettoProjectProfile.g:707:55: (iv_ruleReturnTypeRule= ruleReturnTypeRule EOF )
            // InternalLibrettoProjectProfile.g:708:2: iv_ruleReturnTypeRule= ruleReturnTypeRule EOF
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
    // InternalLibrettoProjectProfile.g:714:1: ruleReturnTypeRule returns [EObject current=null] : (otherlv_0= 'returnType' otherlv_1= 'method' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_javaType_4_0= ruleJavaType ) ) otherlv_5= ';' ) ;
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
            // InternalLibrettoProjectProfile.g:720:2: ( (otherlv_0= 'returnType' otherlv_1= 'method' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_javaType_4_0= ruleJavaType ) ) otherlv_5= ';' ) )
            // InternalLibrettoProjectProfile.g:721:2: (otherlv_0= 'returnType' otherlv_1= 'method' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_javaType_4_0= ruleJavaType ) ) otherlv_5= ';' )
            {
            // InternalLibrettoProjectProfile.g:721:2: (otherlv_0= 'returnType' otherlv_1= 'method' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_javaType_4_0= ruleJavaType ) ) otherlv_5= ';' )
            // InternalLibrettoProjectProfile.g:722:3: otherlv_0= 'returnType' otherlv_1= 'method' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_javaType_4_0= ruleJavaType ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getReturnTypeRuleAccess().getReturnTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getReturnTypeRuleAccess().getMethodKeyword_1());
            		
            // InternalLibrettoProjectProfile.g:730:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalLibrettoProjectProfile.g:731:4: (lv_name_2_0= RULE_ID )
            {
            // InternalLibrettoProjectProfile.g:731:4: (lv_name_2_0= RULE_ID )
            // InternalLibrettoProjectProfile.g:732:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_21); 

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

            otherlv_3=(Token)match(input,29,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getReturnTypeRuleAccess().getAsKeyword_3());
            		
            // InternalLibrettoProjectProfile.g:752:3: ( (lv_javaType_4_0= ruleJavaType ) )
            // InternalLibrettoProjectProfile.g:753:4: (lv_javaType_4_0= ruleJavaType )
            {
            // InternalLibrettoProjectProfile.g:753:4: (lv_javaType_4_0= ruleJavaType )
            // InternalLibrettoProjectProfile.g:754:5: lv_javaType_4_0= ruleJavaType
            {

            					newCompositeNode(grammarAccess.getReturnTypeRuleAccess().getJavaTypeJavaTypeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
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

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getReturnTypeRuleAccess().getSemicolonKeyword_5());
            		

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
    // InternalLibrettoProjectProfile.g:779:1: entryRuleParamTypeRule returns [EObject current=null] : iv_ruleParamTypeRule= ruleParamTypeRule EOF ;
    public final EObject entryRuleParamTypeRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamTypeRule = null;


        try {
            // InternalLibrettoProjectProfile.g:779:54: (iv_ruleParamTypeRule= ruleParamTypeRule EOF )
            // InternalLibrettoProjectProfile.g:780:2: iv_ruleParamTypeRule= ruleParamTypeRule EOF
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
    // InternalLibrettoProjectProfile.g:786:1: ruleParamTypeRule returns [EObject current=null] : (otherlv_0= 'paramType' otherlv_1= 'name' ( (lv_paramName_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_javaType_4_0= ruleJavaType ) ) otherlv_5= ';' ) ;
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
            // InternalLibrettoProjectProfile.g:792:2: ( (otherlv_0= 'paramType' otherlv_1= 'name' ( (lv_paramName_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_javaType_4_0= ruleJavaType ) ) otherlv_5= ';' ) )
            // InternalLibrettoProjectProfile.g:793:2: (otherlv_0= 'paramType' otherlv_1= 'name' ( (lv_paramName_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_javaType_4_0= ruleJavaType ) ) otherlv_5= ';' )
            {
            // InternalLibrettoProjectProfile.g:793:2: (otherlv_0= 'paramType' otherlv_1= 'name' ( (lv_paramName_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_javaType_4_0= ruleJavaType ) ) otherlv_5= ';' )
            // InternalLibrettoProjectProfile.g:794:3: otherlv_0= 'paramType' otherlv_1= 'name' ( (lv_paramName_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_javaType_4_0= ruleJavaType ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getParamTypeRuleAccess().getParamTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,31,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getParamTypeRuleAccess().getNameKeyword_1());
            		
            // InternalLibrettoProjectProfile.g:802:3: ( (lv_paramName_2_0= RULE_ID ) )
            // InternalLibrettoProjectProfile.g:803:4: (lv_paramName_2_0= RULE_ID )
            {
            // InternalLibrettoProjectProfile.g:803:4: (lv_paramName_2_0= RULE_ID )
            // InternalLibrettoProjectProfile.g:804:5: lv_paramName_2_0= RULE_ID
            {
            lv_paramName_2_0=(Token)match(input,RULE_ID,FOLLOW_21); 

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

            otherlv_3=(Token)match(input,29,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getParamTypeRuleAccess().getAsKeyword_3());
            		
            // InternalLibrettoProjectProfile.g:824:3: ( (lv_javaType_4_0= ruleJavaType ) )
            // InternalLibrettoProjectProfile.g:825:4: (lv_javaType_4_0= ruleJavaType )
            {
            // InternalLibrettoProjectProfile.g:825:4: (lv_javaType_4_0= ruleJavaType )
            // InternalLibrettoProjectProfile.g:826:5: lv_javaType_4_0= ruleJavaType
            {

            					newCompositeNode(grammarAccess.getParamTypeRuleAccess().getJavaTypeJavaTypeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
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

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getParamTypeRuleAccess().getSemicolonKeyword_5());
            		

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
    // InternalLibrettoProjectProfile.g:851:1: entryRuleRecordSelfReturnRule returns [EObject current=null] : iv_ruleRecordSelfReturnRule= ruleRecordSelfReturnRule EOF ;
    public final EObject entryRuleRecordSelfReturnRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecordSelfReturnRule = null;


        try {
            // InternalLibrettoProjectProfile.g:851:61: (iv_ruleRecordSelfReturnRule= ruleRecordSelfReturnRule EOF )
            // InternalLibrettoProjectProfile.g:852:2: iv_ruleRecordSelfReturnRule= ruleRecordSelfReturnRule EOF
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
    // InternalLibrettoProjectProfile.g:858:1: ruleRecordSelfReturnRule returns [EObject current=null] : (otherlv_0= 'recordSelfReturn' ( (lv_methods_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_methods_3_0= RULE_ID ) ) )* otherlv_4= ';' ) ;
    public final EObject ruleRecordSelfReturnRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_methods_1_0=null;
        Token otherlv_2=null;
        Token lv_methods_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:864:2: ( (otherlv_0= 'recordSelfReturn' ( (lv_methods_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_methods_3_0= RULE_ID ) ) )* otherlv_4= ';' ) )
            // InternalLibrettoProjectProfile.g:865:2: (otherlv_0= 'recordSelfReturn' ( (lv_methods_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_methods_3_0= RULE_ID ) ) )* otherlv_4= ';' )
            {
            // InternalLibrettoProjectProfile.g:865:2: (otherlv_0= 'recordSelfReturn' ( (lv_methods_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_methods_3_0= RULE_ID ) ) )* otherlv_4= ';' )
            // InternalLibrettoProjectProfile.g:866:3: otherlv_0= 'recordSelfReturn' ( (lv_methods_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_methods_3_0= RULE_ID ) ) )* otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getRecordSelfReturnRuleAccess().getRecordSelfReturnKeyword_0());
            		
            // InternalLibrettoProjectProfile.g:870:3: ( (lv_methods_1_0= RULE_ID ) )
            // InternalLibrettoProjectProfile.g:871:4: (lv_methods_1_0= RULE_ID )
            {
            // InternalLibrettoProjectProfile.g:871:4: (lv_methods_1_0= RULE_ID )
            // InternalLibrettoProjectProfile.g:872:5: lv_methods_1_0= RULE_ID
            {
            lv_methods_1_0=(Token)match(input,RULE_ID,FOLLOW_24); 

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

            // InternalLibrettoProjectProfile.g:888:3: (otherlv_2= ',' ( (lv_methods_3_0= RULE_ID ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==33) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:889:4: otherlv_2= ',' ( (lv_methods_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,33,FOLLOW_20); 

            	    				newLeafNode(otherlv_2, grammarAccess.getRecordSelfReturnRuleAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalLibrettoProjectProfile.g:893:4: ( (lv_methods_3_0= RULE_ID ) )
            	    // InternalLibrettoProjectProfile.g:894:5: (lv_methods_3_0= RULE_ID )
            	    {
            	    // InternalLibrettoProjectProfile.g:894:5: (lv_methods_3_0= RULE_ID )
            	    // InternalLibrettoProjectProfile.g:895:6: lv_methods_3_0= RULE_ID
            	    {
            	    lv_methods_3_0=(Token)match(input,RULE_ID,FOLLOW_24); 

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
            	    break loop15;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getRecordSelfReturnRuleAccess().getSemicolonKeyword_3());
            		

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
    // InternalLibrettoProjectProfile.g:920:1: entryRuleMethodOverrideRule returns [EObject current=null] : iv_ruleMethodOverrideRule= ruleMethodOverrideRule EOF ;
    public final EObject entryRuleMethodOverrideRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodOverrideRule = null;


        try {
            // InternalLibrettoProjectProfile.g:920:59: (iv_ruleMethodOverrideRule= ruleMethodOverrideRule EOF )
            // InternalLibrettoProjectProfile.g:921:2: iv_ruleMethodOverrideRule= ruleMethodOverrideRule EOF
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
    // InternalLibrettoProjectProfile.g:927:1: ruleMethodOverrideRule returns [EObject current=null] : (otherlv_0= 'methodOverride' ( (lv_signature_1_0= ruleOperationSignature ) ) otherlv_2= 'returns' ( (lv_javaType_3_0= ruleJavaType ) ) otherlv_4= ';' ) ;
    public final EObject ruleMethodOverrideRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_signature_1_0 = null;

        EObject lv_javaType_3_0 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:933:2: ( (otherlv_0= 'methodOverride' ( (lv_signature_1_0= ruleOperationSignature ) ) otherlv_2= 'returns' ( (lv_javaType_3_0= ruleJavaType ) ) otherlv_4= ';' ) )
            // InternalLibrettoProjectProfile.g:934:2: (otherlv_0= 'methodOverride' ( (lv_signature_1_0= ruleOperationSignature ) ) otherlv_2= 'returns' ( (lv_javaType_3_0= ruleJavaType ) ) otherlv_4= ';' )
            {
            // InternalLibrettoProjectProfile.g:934:2: (otherlv_0= 'methodOverride' ( (lv_signature_1_0= ruleOperationSignature ) ) otherlv_2= 'returns' ( (lv_javaType_3_0= ruleJavaType ) ) otherlv_4= ';' )
            // InternalLibrettoProjectProfile.g:935:3: otherlv_0= 'methodOverride' ( (lv_signature_1_0= ruleOperationSignature ) ) otherlv_2= 'returns' ( (lv_javaType_3_0= ruleJavaType ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getMethodOverrideRuleAccess().getMethodOverrideKeyword_0());
            		
            // InternalLibrettoProjectProfile.g:939:3: ( (lv_signature_1_0= ruleOperationSignature ) )
            // InternalLibrettoProjectProfile.g:940:4: (lv_signature_1_0= ruleOperationSignature )
            {
            // InternalLibrettoProjectProfile.g:940:4: (lv_signature_1_0= ruleOperationSignature )
            // InternalLibrettoProjectProfile.g:941:5: lv_signature_1_0= ruleOperationSignature
            {

            					newCompositeNode(grammarAccess.getMethodOverrideRuleAccess().getSignatureOperationSignatureParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_25);
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

            otherlv_2=(Token)match(input,35,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getMethodOverrideRuleAccess().getReturnsKeyword_2());
            		
            // InternalLibrettoProjectProfile.g:962:3: ( (lv_javaType_3_0= ruleJavaType ) )
            // InternalLibrettoProjectProfile.g:963:4: (lv_javaType_3_0= ruleJavaType )
            {
            // InternalLibrettoProjectProfile.g:963:4: (lv_javaType_3_0= ruleJavaType )
            // InternalLibrettoProjectProfile.g:964:5: lv_javaType_3_0= ruleJavaType
            {

            					newCompositeNode(grammarAccess.getMethodOverrideRuleAccess().getJavaTypeJavaTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
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

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getMethodOverrideRuleAccess().getSemicolonKeyword_4());
            		

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
    // InternalLibrettoProjectProfile.g:989:1: entryRuleJavaType returns [EObject current=null] : iv_ruleJavaType= ruleJavaType EOF ;
    public final EObject entryRuleJavaType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJavaType = null;


        try {
            // InternalLibrettoProjectProfile.g:989:49: (iv_ruleJavaType= ruleJavaType EOF )
            // InternalLibrettoProjectProfile.g:990:2: iv_ruleJavaType= ruleJavaType EOF
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
    // InternalLibrettoProjectProfile.g:996:1: ruleJavaType returns [EObject current=null] : (this_PrimitiveType_0= rulePrimitiveType | this_QualifiedName_1= ruleQualifiedName ) ;
    public final EObject ruleJavaType() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveType_0 = null;

        EObject this_QualifiedName_1 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:1002:2: ( (this_PrimitiveType_0= rulePrimitiveType | this_QualifiedName_1= ruleQualifiedName ) )
            // InternalLibrettoProjectProfile.g:1003:2: (this_PrimitiveType_0= rulePrimitiveType | this_QualifiedName_1= ruleQualifiedName )
            {
            // InternalLibrettoProjectProfile.g:1003:2: (this_PrimitiveType_0= rulePrimitiveType | this_QualifiedName_1= ruleQualifiedName )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=37 && LA16_0<=45)) ) {
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
                    // InternalLibrettoProjectProfile.g:1004:3: this_PrimitiveType_0= rulePrimitiveType
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
                    // InternalLibrettoProjectProfile.g:1013:3: this_QualifiedName_1= ruleQualifiedName
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
    // InternalLibrettoProjectProfile.g:1025:1: entryRuleQualifiedName returns [EObject current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final EObject entryRuleQualifiedName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedName = null;


        try {
            // InternalLibrettoProjectProfile.g:1025:54: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalLibrettoProjectProfile.g:1026:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalLibrettoProjectProfile.g:1032:1: ruleQualifiedName returns [EObject current=null] : ( ( (lv_segments_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_segments_2_0= RULE_ID ) ) )* ) ;
    public final EObject ruleQualifiedName() throws RecognitionException {
        EObject current = null;

        Token lv_segments_0_0=null;
        Token otherlv_1=null;
        Token lv_segments_2_0=null;


        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:1038:2: ( ( ( (lv_segments_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_segments_2_0= RULE_ID ) ) )* ) )
            // InternalLibrettoProjectProfile.g:1039:2: ( ( (lv_segments_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_segments_2_0= RULE_ID ) ) )* )
            {
            // InternalLibrettoProjectProfile.g:1039:2: ( ( (lv_segments_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_segments_2_0= RULE_ID ) ) )* )
            // InternalLibrettoProjectProfile.g:1040:3: ( (lv_segments_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_segments_2_0= RULE_ID ) ) )*
            {
            // InternalLibrettoProjectProfile.g:1040:3: ( (lv_segments_0_0= RULE_ID ) )
            // InternalLibrettoProjectProfile.g:1041:4: (lv_segments_0_0= RULE_ID )
            {
            // InternalLibrettoProjectProfile.g:1041:4: (lv_segments_0_0= RULE_ID )
            // InternalLibrettoProjectProfile.g:1042:5: lv_segments_0_0= RULE_ID
            {
            lv_segments_0_0=(Token)match(input,RULE_ID,FOLLOW_26); 

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

            // InternalLibrettoProjectProfile.g:1058:3: (otherlv_1= '.' ( (lv_segments_2_0= RULE_ID ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==36) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalLibrettoProjectProfile.g:1059:4: otherlv_1= '.' ( (lv_segments_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,36,FOLLOW_20); 

            	    				newLeafNode(otherlv_1, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    // InternalLibrettoProjectProfile.g:1063:4: ( (lv_segments_2_0= RULE_ID ) )
            	    // InternalLibrettoProjectProfile.g:1064:5: (lv_segments_2_0= RULE_ID )
            	    {
            	    // InternalLibrettoProjectProfile.g:1064:5: (lv_segments_2_0= RULE_ID )
            	    // InternalLibrettoProjectProfile.g:1065:6: lv_segments_2_0= RULE_ID
            	    {
            	    lv_segments_2_0=(Token)match(input,RULE_ID,FOLLOW_26); 

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
            	    break loop17;
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
    // InternalLibrettoProjectProfile.g:1086:1: entryRulePrimitiveType returns [EObject current=null] : iv_rulePrimitiveType= rulePrimitiveType EOF ;
    public final EObject entryRulePrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveType = null;


        try {
            // InternalLibrettoProjectProfile.g:1086:54: (iv_rulePrimitiveType= rulePrimitiveType EOF )
            // InternalLibrettoProjectProfile.g:1087:2: iv_rulePrimitiveType= rulePrimitiveType EOF
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
    // InternalLibrettoProjectProfile.g:1093:1: rulePrimitiveType returns [EObject current=null] : ( ( (lv_kind_0_1= 'boolean' | lv_kind_0_2= 'int' | lv_kind_0_3= 'long' | lv_kind_0_4= 'double' | lv_kind_0_5= 'float' | lv_kind_0_6= 'short' | lv_kind_0_7= 'byte' | lv_kind_0_8= 'char' | lv_kind_0_9= 'void' ) ) ) ;
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
            // InternalLibrettoProjectProfile.g:1099:2: ( ( ( (lv_kind_0_1= 'boolean' | lv_kind_0_2= 'int' | lv_kind_0_3= 'long' | lv_kind_0_4= 'double' | lv_kind_0_5= 'float' | lv_kind_0_6= 'short' | lv_kind_0_7= 'byte' | lv_kind_0_8= 'char' | lv_kind_0_9= 'void' ) ) ) )
            // InternalLibrettoProjectProfile.g:1100:2: ( ( (lv_kind_0_1= 'boolean' | lv_kind_0_2= 'int' | lv_kind_0_3= 'long' | lv_kind_0_4= 'double' | lv_kind_0_5= 'float' | lv_kind_0_6= 'short' | lv_kind_0_7= 'byte' | lv_kind_0_8= 'char' | lv_kind_0_9= 'void' ) ) )
            {
            // InternalLibrettoProjectProfile.g:1100:2: ( ( (lv_kind_0_1= 'boolean' | lv_kind_0_2= 'int' | lv_kind_0_3= 'long' | lv_kind_0_4= 'double' | lv_kind_0_5= 'float' | lv_kind_0_6= 'short' | lv_kind_0_7= 'byte' | lv_kind_0_8= 'char' | lv_kind_0_9= 'void' ) ) )
            // InternalLibrettoProjectProfile.g:1101:3: ( (lv_kind_0_1= 'boolean' | lv_kind_0_2= 'int' | lv_kind_0_3= 'long' | lv_kind_0_4= 'double' | lv_kind_0_5= 'float' | lv_kind_0_6= 'short' | lv_kind_0_7= 'byte' | lv_kind_0_8= 'char' | lv_kind_0_9= 'void' ) )
            {
            // InternalLibrettoProjectProfile.g:1101:3: ( (lv_kind_0_1= 'boolean' | lv_kind_0_2= 'int' | lv_kind_0_3= 'long' | lv_kind_0_4= 'double' | lv_kind_0_5= 'float' | lv_kind_0_6= 'short' | lv_kind_0_7= 'byte' | lv_kind_0_8= 'char' | lv_kind_0_9= 'void' ) )
            // InternalLibrettoProjectProfile.g:1102:4: (lv_kind_0_1= 'boolean' | lv_kind_0_2= 'int' | lv_kind_0_3= 'long' | lv_kind_0_4= 'double' | lv_kind_0_5= 'float' | lv_kind_0_6= 'short' | lv_kind_0_7= 'byte' | lv_kind_0_8= 'char' | lv_kind_0_9= 'void' )
            {
            // InternalLibrettoProjectProfile.g:1102:4: (lv_kind_0_1= 'boolean' | lv_kind_0_2= 'int' | lv_kind_0_3= 'long' | lv_kind_0_4= 'double' | lv_kind_0_5= 'float' | lv_kind_0_6= 'short' | lv_kind_0_7= 'byte' | lv_kind_0_8= 'char' | lv_kind_0_9= 'void' )
            int alt18=9;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt18=1;
                }
                break;
            case 38:
                {
                alt18=2;
                }
                break;
            case 39:
                {
                alt18=3;
                }
                break;
            case 40:
                {
                alt18=4;
                }
                break;
            case 41:
                {
                alt18=5;
                }
                break;
            case 42:
                {
                alt18=6;
                }
                break;
            case 43:
                {
                alt18=7;
                }
                break;
            case 44:
                {
                alt18=8;
                }
                break;
            case 45:
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
                    // InternalLibrettoProjectProfile.g:1103:5: lv_kind_0_1= 'boolean'
                    {
                    lv_kind_0_1=(Token)match(input,37,FOLLOW_2); 

                    					newLeafNode(lv_kind_0_1, grammarAccess.getPrimitiveTypeAccess().getKindBooleanKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "kind", lv_kind_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalLibrettoProjectProfile.g:1114:5: lv_kind_0_2= 'int'
                    {
                    lv_kind_0_2=(Token)match(input,38,FOLLOW_2); 

                    					newLeafNode(lv_kind_0_2, grammarAccess.getPrimitiveTypeAccess().getKindIntKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "kind", lv_kind_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalLibrettoProjectProfile.g:1125:5: lv_kind_0_3= 'long'
                    {
                    lv_kind_0_3=(Token)match(input,39,FOLLOW_2); 

                    					newLeafNode(lv_kind_0_3, grammarAccess.getPrimitiveTypeAccess().getKindLongKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "kind", lv_kind_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalLibrettoProjectProfile.g:1136:5: lv_kind_0_4= 'double'
                    {
                    lv_kind_0_4=(Token)match(input,40,FOLLOW_2); 

                    					newLeafNode(lv_kind_0_4, grammarAccess.getPrimitiveTypeAccess().getKindDoubleKeyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "kind", lv_kind_0_4, null);
                    				

                    }
                    break;
                case 5 :
                    // InternalLibrettoProjectProfile.g:1147:5: lv_kind_0_5= 'float'
                    {
                    lv_kind_0_5=(Token)match(input,41,FOLLOW_2); 

                    					newLeafNode(lv_kind_0_5, grammarAccess.getPrimitiveTypeAccess().getKindFloatKeyword_0_4());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "kind", lv_kind_0_5, null);
                    				

                    }
                    break;
                case 6 :
                    // InternalLibrettoProjectProfile.g:1158:5: lv_kind_0_6= 'short'
                    {
                    lv_kind_0_6=(Token)match(input,42,FOLLOW_2); 

                    					newLeafNode(lv_kind_0_6, grammarAccess.getPrimitiveTypeAccess().getKindShortKeyword_0_5());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "kind", lv_kind_0_6, null);
                    				

                    }
                    break;
                case 7 :
                    // InternalLibrettoProjectProfile.g:1169:5: lv_kind_0_7= 'byte'
                    {
                    lv_kind_0_7=(Token)match(input,43,FOLLOW_2); 

                    					newLeafNode(lv_kind_0_7, grammarAccess.getPrimitiveTypeAccess().getKindByteKeyword_0_6());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "kind", lv_kind_0_7, null);
                    				

                    }
                    break;
                case 8 :
                    // InternalLibrettoProjectProfile.g:1180:5: lv_kind_0_8= 'char'
                    {
                    lv_kind_0_8=(Token)match(input,44,FOLLOW_2); 

                    					newLeafNode(lv_kind_0_8, grammarAccess.getPrimitiveTypeAccess().getKindCharKeyword_0_7());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "kind", lv_kind_0_8, null);
                    				

                    }
                    break;
                case 9 :
                    // InternalLibrettoProjectProfile.g:1191:5: lv_kind_0_9= 'void'
                    {
                    lv_kind_0_9=(Token)match(input,45,FOLLOW_2); 

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
    // InternalLibrettoProjectProfile.g:1207:1: entryRuleOperationSignature returns [EObject current=null] : iv_ruleOperationSignature= ruleOperationSignature EOF ;
    public final EObject entryRuleOperationSignature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationSignature = null;


        try {
            // InternalLibrettoProjectProfile.g:1207:59: (iv_ruleOperationSignature= ruleOperationSignature EOF )
            // InternalLibrettoProjectProfile.g:1208:2: iv_ruleOperationSignature= ruleOperationSignature EOF
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
    // InternalLibrettoProjectProfile.g:1214:1: ruleOperationSignature returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleTypedParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleTypedParam ) ) )* )? otherlv_5= ')' ) ;
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
            // InternalLibrettoProjectProfile.g:1220:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleTypedParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleTypedParam ) ) )* )? otherlv_5= ')' ) )
            // InternalLibrettoProjectProfile.g:1221:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleTypedParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleTypedParam ) ) )* )? otherlv_5= ')' )
            {
            // InternalLibrettoProjectProfile.g:1221:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleTypedParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleTypedParam ) ) )* )? otherlv_5= ')' )
            // InternalLibrettoProjectProfile.g:1222:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleTypedParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleTypedParam ) ) )* )? otherlv_5= ')'
            {
            // InternalLibrettoProjectProfile.g:1222:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalLibrettoProjectProfile.g:1223:4: (lv_name_0_0= RULE_ID )
            {
            // InternalLibrettoProjectProfile.g:1223:4: (lv_name_0_0= RULE_ID )
            // InternalLibrettoProjectProfile.g:1224:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_27); 

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

            otherlv_1=(Token)match(input,46,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getOperationSignatureAccess().getLeftParenthesisKeyword_1());
            		
            // InternalLibrettoProjectProfile.g:1244:3: ( ( (lv_params_2_0= ruleTypedParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleTypedParam ) ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID||(LA20_0>=37 && LA20_0<=45)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalLibrettoProjectProfile.g:1245:4: ( (lv_params_2_0= ruleTypedParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleTypedParam ) ) )*
                    {
                    // InternalLibrettoProjectProfile.g:1245:4: ( (lv_params_2_0= ruleTypedParam ) )
                    // InternalLibrettoProjectProfile.g:1246:5: (lv_params_2_0= ruleTypedParam )
                    {
                    // InternalLibrettoProjectProfile.g:1246:5: (lv_params_2_0= ruleTypedParam )
                    // InternalLibrettoProjectProfile.g:1247:6: lv_params_2_0= ruleTypedParam
                    {

                    						newCompositeNode(grammarAccess.getOperationSignatureAccess().getParamsTypedParamParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    // InternalLibrettoProjectProfile.g:1264:4: (otherlv_3= ',' ( (lv_params_4_0= ruleTypedParam ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==33) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalLibrettoProjectProfile.g:1265:5: otherlv_3= ',' ( (lv_params_4_0= ruleTypedParam ) )
                    	    {
                    	    otherlv_3=(Token)match(input,33,FOLLOW_22); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getOperationSignatureAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalLibrettoProjectProfile.g:1269:5: ( (lv_params_4_0= ruleTypedParam ) )
                    	    // InternalLibrettoProjectProfile.g:1270:6: (lv_params_4_0= ruleTypedParam )
                    	    {
                    	    // InternalLibrettoProjectProfile.g:1270:6: (lv_params_4_0= ruleTypedParam )
                    	    // InternalLibrettoProjectProfile.g:1271:7: lv_params_4_0= ruleTypedParam
                    	    {

                    	    							newCompositeNode(grammarAccess.getOperationSignatureAccess().getParamsTypedParamParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_29);
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
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,47,FOLLOW_2); 

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
    // InternalLibrettoProjectProfile.g:1298:1: entryRuleTypedParam returns [EObject current=null] : iv_ruleTypedParam= ruleTypedParam EOF ;
    public final EObject entryRuleTypedParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedParam = null;


        try {
            // InternalLibrettoProjectProfile.g:1298:51: (iv_ruleTypedParam= ruleTypedParam EOF )
            // InternalLibrettoProjectProfile.g:1299:2: iv_ruleTypedParam= ruleTypedParam EOF
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
    // InternalLibrettoProjectProfile.g:1305:1: ruleTypedParam returns [EObject current=null] : ( ( (lv_type_0_0= ruleJavaType ) ) ( (lv_paramName_1_0= RULE_ID ) ) ) ;
    public final EObject ruleTypedParam() throws RecognitionException {
        EObject current = null;

        Token lv_paramName_1_0=null;
        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalLibrettoProjectProfile.g:1311:2: ( ( ( (lv_type_0_0= ruleJavaType ) ) ( (lv_paramName_1_0= RULE_ID ) ) ) )
            // InternalLibrettoProjectProfile.g:1312:2: ( ( (lv_type_0_0= ruleJavaType ) ) ( (lv_paramName_1_0= RULE_ID ) ) )
            {
            // InternalLibrettoProjectProfile.g:1312:2: ( ( (lv_type_0_0= ruleJavaType ) ) ( (lv_paramName_1_0= RULE_ID ) ) )
            // InternalLibrettoProjectProfile.g:1313:3: ( (lv_type_0_0= ruleJavaType ) ) ( (lv_paramName_1_0= RULE_ID ) )
            {
            // InternalLibrettoProjectProfile.g:1313:3: ( (lv_type_0_0= ruleJavaType ) )
            // InternalLibrettoProjectProfile.g:1314:4: (lv_type_0_0= ruleJavaType )
            {
            // InternalLibrettoProjectProfile.g:1314:4: (lv_type_0_0= ruleJavaType )
            // InternalLibrettoProjectProfile.g:1315:5: lv_type_0_0= ruleJavaType
            {

            					newCompositeNode(grammarAccess.getTypedParamAccess().getTypeJavaTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_20);
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

            // InternalLibrettoProjectProfile.g:1332:3: ( (lv_paramName_1_0= RULE_ID ) )
            // InternalLibrettoProjectProfile.g:1333:4: (lv_paramName_1_0= RULE_ID )
            {
            // InternalLibrettoProjectProfile.g:1333:4: (lv_paramName_1_0= RULE_ID )
            // InternalLibrettoProjectProfile.g:1334:5: lv_paramName_1_0= RULE_ID
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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000002A000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000F02000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000E02000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000C02000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000054A002000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004040000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00003FE000000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200010000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000BFE000000020L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000800200000000L});

}