package com.robenglander.libretto.spec.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.robenglander.libretto.spec.services.LibrettoSpecGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLibrettoSpecParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_LIBRETTO_ID", "RULE_BEHAVIOR_ID", "RULE_ACCEPTANCE_TEST_ID", "RULE_IMPLEMENTATION_DIRECTIVE_ID", "RULE_REF_ID", "RULE_OOS_ID", "RULE_STRING", "RULE_TEXT_BLOCK", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'spec'", "'{'", "'}'", "'metadata'", "'references'", "'prose'", "'out_of_scope'", "'operation_surface'", "'implements_surface'", "'boundary_exports'", "'boundary_imports'", "'behaviors'", "'acceptance_tests'", "'implementation_directives'", "'title'", "':'", "'version'", "'status'", "'module'", "'package'", "'compiled_at'", "'compiler_version'", "'model_metadata'", "'dependencies'", "'dependency'", "'target_spec'", "'reference'", "'type'", "'citation'", "'locator'", "'authority_notes'", "'section_context'", "'subsection_context'", "'out_of_scope_item'", "'statement'", "'behavior'", "'actor'", "'action'", "'objects'", "'reads'", "'writes'", "'conditions'", "'outcomes'", "'label'", "'notes'", "'context'", "'operation'", "'operation_expression'", "'outcome_class'", "'implements'", "'boundary'", "'spec_id'", "'operation_id'", "'profile_id'", "'raw'", "'acceptance_test'", "'validates'", "'preconditions'", "'actions'", "'assertions'", "'implementation_directive'", "'applies_to'", "'strength'", "'directive'", "'category'", "'constraints'", "'allowed_flexibility'", "'rationale'", "'source'", "'section'", "'subsection'", "'text'", "'['", "','", "']'", "'.'", "'returns'", "'rejects'", "'draft'", "'public'", "'required'", "'strongly_preferred'", "'preferred'", "'advisory'"
    };
    public static final int T__50=50;
    public static final int RULE_TEXT_BLOCK=11;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=12;
    public static final int RULE_INT=13;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=14;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int RULE_LIBRETTO_ID=4;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int RULE_BEHAVIOR_ID=5;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_IMPLEMENTATION_DIRECTIVE_ID=7;
    public static final int RULE_OOS_ID=9;
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
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int RULE_ACCEPTANCE_TEST_ID=6;
    public static final int T__18=18;
    public static final int T__99=99;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=10;
    public static final int RULE_SL_COMMENT=15;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=16;
    public static final int RULE_ANY_OTHER=17;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int RULE_REF_ID=8;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

    // delegates
    // delegators


        public InternalLibrettoSpecParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLibrettoSpecParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLibrettoSpecParser.tokenNames; }
    public String getGrammarFileName() { return "InternalLibrettoSpec.g"; }



     	private LibrettoSpecGrammarAccess grammarAccess;

        public InternalLibrettoSpecParser(TokenStream input, LibrettoSpecGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Spec";
       	}

       	@Override
       	protected LibrettoSpecGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSpec"
    // InternalLibrettoSpec.g:65:1: entryRuleSpec returns [EObject current=null] : iv_ruleSpec= ruleSpec EOF ;
    public final EObject entryRuleSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpec = null;


        try {
            // InternalLibrettoSpec.g:65:45: (iv_ruleSpec= ruleSpec EOF )
            // InternalLibrettoSpec.g:66:2: iv_ruleSpec= ruleSpec EOF
            {
             newCompositeNode(grammarAccess.getSpecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpec=ruleSpec();

            state._fsp--;

             current =iv_ruleSpec; 
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
    // $ANTLR end "entryRuleSpec"


    // $ANTLR start "ruleSpec"
    // InternalLibrettoSpec.g:72:1: ruleSpec returns [EObject current=null] : (otherlv_0= 'spec' ( (lv_specId_1_0= RULE_LIBRETTO_ID ) ) otherlv_2= '{' ( (lv_sections_3_0= ruleSpecSection ) )* otherlv_4= '}' ) ;
    public final EObject ruleSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_specId_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_sections_3_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:78:2: ( (otherlv_0= 'spec' ( (lv_specId_1_0= RULE_LIBRETTO_ID ) ) otherlv_2= '{' ( (lv_sections_3_0= ruleSpecSection ) )* otherlv_4= '}' ) )
            // InternalLibrettoSpec.g:79:2: (otherlv_0= 'spec' ( (lv_specId_1_0= RULE_LIBRETTO_ID ) ) otherlv_2= '{' ( (lv_sections_3_0= ruleSpecSection ) )* otherlv_4= '}' )
            {
            // InternalLibrettoSpec.g:79:2: (otherlv_0= 'spec' ( (lv_specId_1_0= RULE_LIBRETTO_ID ) ) otherlv_2= '{' ( (lv_sections_3_0= ruleSpecSection ) )* otherlv_4= '}' )
            // InternalLibrettoSpec.g:80:3: otherlv_0= 'spec' ( (lv_specId_1_0= RULE_LIBRETTO_ID ) ) otherlv_2= '{' ( (lv_sections_3_0= ruleSpecSection ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSpecAccess().getSpecKeyword_0());
            		
            // InternalLibrettoSpec.g:84:3: ( (lv_specId_1_0= RULE_LIBRETTO_ID ) )
            // InternalLibrettoSpec.g:85:4: (lv_specId_1_0= RULE_LIBRETTO_ID )
            {
            // InternalLibrettoSpec.g:85:4: (lv_specId_1_0= RULE_LIBRETTO_ID )
            // InternalLibrettoSpec.g:86:5: lv_specId_1_0= RULE_LIBRETTO_ID
            {
            lv_specId_1_0=(Token)match(input,RULE_LIBRETTO_ID,FOLLOW_4); 

            					newLeafNode(lv_specId_1_0, grammarAccess.getSpecAccess().getSpecIdLIBRETTO_IDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSpecRule());
            					}
            					setWithLastConsumed(
            						current,
            						"specId",
            						lv_specId_1_0,
            						"com.robenglander.libretto.spec.LibrettoSpec.LIBRETTO_ID");
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getSpecAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLibrettoSpec.g:106:3: ( (lv_sections_3_0= ruleSpecSection ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=21 && LA1_0<=31)||LA1_0==41) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalLibrettoSpec.g:107:4: (lv_sections_3_0= ruleSpecSection )
            	    {
            	    // InternalLibrettoSpec.g:107:4: (lv_sections_3_0= ruleSpecSection )
            	    // InternalLibrettoSpec.g:108:5: lv_sections_3_0= ruleSpecSection
            	    {

            	    					newCompositeNode(grammarAccess.getSpecAccess().getSectionsSpecSectionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_sections_3_0=ruleSpecSection();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSpecRule());
            	    					}
            	    					add(
            	    						current,
            	    						"sections",
            	    						lv_sections_3_0,
            	    						"com.robenglander.libretto.spec.LibrettoSpec.SpecSection");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSpecAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleSpec"


    // $ANTLR start "entryRuleSpecSection"
    // InternalLibrettoSpec.g:133:1: entryRuleSpecSection returns [EObject current=null] : iv_ruleSpecSection= ruleSpecSection EOF ;
    public final EObject entryRuleSpecSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecSection = null;


        try {
            // InternalLibrettoSpec.g:133:52: (iv_ruleSpecSection= ruleSpecSection EOF )
            // InternalLibrettoSpec.g:134:2: iv_ruleSpecSection= ruleSpecSection EOF
            {
             newCompositeNode(grammarAccess.getSpecSectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpecSection=ruleSpecSection();

            state._fsp--;

             current =iv_ruleSpecSection; 
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
    // $ANTLR end "entryRuleSpecSection"


    // $ANTLR start "ruleSpecSection"
    // InternalLibrettoSpec.g:140:1: ruleSpecSection returns [EObject current=null] : (this_MetadataSection_0= ruleMetadataSection | this_DependenciesSection_1= ruleDependenciesSection | this_ReferencesSection_2= ruleReferencesSection | this_ProseSection_3= ruleProseSection | this_OutOfScopeSection_4= ruleOutOfScopeSection | this_OperationSurfaceSection_5= ruleOperationSurfaceSection | this_ImplementsSurfaceSection_6= ruleImplementsSurfaceSection | this_BoundaryExportsSection_7= ruleBoundaryExportsSection | this_BoundaryImportsSection_8= ruleBoundaryImportsSection | this_BehaviorsSection_9= ruleBehaviorsSection | this_AcceptanceTestsSection_10= ruleAcceptanceTestsSection | this_ImplementationDirectivesSection_11= ruleImplementationDirectivesSection ) ;
    public final EObject ruleSpecSection() throws RecognitionException {
        EObject current = null;

        EObject this_MetadataSection_0 = null;

        EObject this_DependenciesSection_1 = null;

        EObject this_ReferencesSection_2 = null;

        EObject this_ProseSection_3 = null;

        EObject this_OutOfScopeSection_4 = null;

        EObject this_OperationSurfaceSection_5 = null;

        EObject this_ImplementsSurfaceSection_6 = null;

        EObject this_BoundaryExportsSection_7 = null;

        EObject this_BoundaryImportsSection_8 = null;

        EObject this_BehaviorsSection_9 = null;

        EObject this_AcceptanceTestsSection_10 = null;

        EObject this_ImplementationDirectivesSection_11 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:146:2: ( (this_MetadataSection_0= ruleMetadataSection | this_DependenciesSection_1= ruleDependenciesSection | this_ReferencesSection_2= ruleReferencesSection | this_ProseSection_3= ruleProseSection | this_OutOfScopeSection_4= ruleOutOfScopeSection | this_OperationSurfaceSection_5= ruleOperationSurfaceSection | this_ImplementsSurfaceSection_6= ruleImplementsSurfaceSection | this_BoundaryExportsSection_7= ruleBoundaryExportsSection | this_BoundaryImportsSection_8= ruleBoundaryImportsSection | this_BehaviorsSection_9= ruleBehaviorsSection | this_AcceptanceTestsSection_10= ruleAcceptanceTestsSection | this_ImplementationDirectivesSection_11= ruleImplementationDirectivesSection ) )
            // InternalLibrettoSpec.g:147:2: (this_MetadataSection_0= ruleMetadataSection | this_DependenciesSection_1= ruleDependenciesSection | this_ReferencesSection_2= ruleReferencesSection | this_ProseSection_3= ruleProseSection | this_OutOfScopeSection_4= ruleOutOfScopeSection | this_OperationSurfaceSection_5= ruleOperationSurfaceSection | this_ImplementsSurfaceSection_6= ruleImplementsSurfaceSection | this_BoundaryExportsSection_7= ruleBoundaryExportsSection | this_BoundaryImportsSection_8= ruleBoundaryImportsSection | this_BehaviorsSection_9= ruleBehaviorsSection | this_AcceptanceTestsSection_10= ruleAcceptanceTestsSection | this_ImplementationDirectivesSection_11= ruleImplementationDirectivesSection )
            {
            // InternalLibrettoSpec.g:147:2: (this_MetadataSection_0= ruleMetadataSection | this_DependenciesSection_1= ruleDependenciesSection | this_ReferencesSection_2= ruleReferencesSection | this_ProseSection_3= ruleProseSection | this_OutOfScopeSection_4= ruleOutOfScopeSection | this_OperationSurfaceSection_5= ruleOperationSurfaceSection | this_ImplementsSurfaceSection_6= ruleImplementsSurfaceSection | this_BoundaryExportsSection_7= ruleBoundaryExportsSection | this_BoundaryImportsSection_8= ruleBoundaryImportsSection | this_BehaviorsSection_9= ruleBehaviorsSection | this_AcceptanceTestsSection_10= ruleAcceptanceTestsSection | this_ImplementationDirectivesSection_11= ruleImplementationDirectivesSection )
            int alt2=12;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt2=1;
                }
                break;
            case 41:
                {
                alt2=2;
                }
                break;
            case 22:
                {
                alt2=3;
                }
                break;
            case 23:
                {
                alt2=4;
                }
                break;
            case 24:
                {
                alt2=5;
                }
                break;
            case 25:
                {
                alt2=6;
                }
                break;
            case 26:
                {
                alt2=7;
                }
                break;
            case 27:
                {
                alt2=8;
                }
                break;
            case 28:
                {
                alt2=9;
                }
                break;
            case 29:
                {
                alt2=10;
                }
                break;
            case 30:
                {
                alt2=11;
                }
                break;
            case 31:
                {
                alt2=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalLibrettoSpec.g:148:3: this_MetadataSection_0= ruleMetadataSection
                    {

                    			newCompositeNode(grammarAccess.getSpecSectionAccess().getMetadataSectionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MetadataSection_0=ruleMetadataSection();

                    state._fsp--;


                    			current = this_MetadataSection_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalLibrettoSpec.g:157:3: this_DependenciesSection_1= ruleDependenciesSection
                    {

                    			newCompositeNode(grammarAccess.getSpecSectionAccess().getDependenciesSectionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DependenciesSection_1=ruleDependenciesSection();

                    state._fsp--;


                    			current = this_DependenciesSection_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalLibrettoSpec.g:166:3: this_ReferencesSection_2= ruleReferencesSection
                    {

                    			newCompositeNode(grammarAccess.getSpecSectionAccess().getReferencesSectionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ReferencesSection_2=ruleReferencesSection();

                    state._fsp--;


                    			current = this_ReferencesSection_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalLibrettoSpec.g:175:3: this_ProseSection_3= ruleProseSection
                    {

                    			newCompositeNode(grammarAccess.getSpecSectionAccess().getProseSectionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProseSection_3=ruleProseSection();

                    state._fsp--;


                    			current = this_ProseSection_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalLibrettoSpec.g:184:3: this_OutOfScopeSection_4= ruleOutOfScopeSection
                    {

                    			newCompositeNode(grammarAccess.getSpecSectionAccess().getOutOfScopeSectionParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_OutOfScopeSection_4=ruleOutOfScopeSection();

                    state._fsp--;


                    			current = this_OutOfScopeSection_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalLibrettoSpec.g:193:3: this_OperationSurfaceSection_5= ruleOperationSurfaceSection
                    {

                    			newCompositeNode(grammarAccess.getSpecSectionAccess().getOperationSurfaceSectionParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_OperationSurfaceSection_5=ruleOperationSurfaceSection();

                    state._fsp--;


                    			current = this_OperationSurfaceSection_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalLibrettoSpec.g:202:3: this_ImplementsSurfaceSection_6= ruleImplementsSurfaceSection
                    {

                    			newCompositeNode(grammarAccess.getSpecSectionAccess().getImplementsSurfaceSectionParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_ImplementsSurfaceSection_6=ruleImplementsSurfaceSection();

                    state._fsp--;


                    			current = this_ImplementsSurfaceSection_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalLibrettoSpec.g:211:3: this_BoundaryExportsSection_7= ruleBoundaryExportsSection
                    {

                    			newCompositeNode(grammarAccess.getSpecSectionAccess().getBoundaryExportsSectionParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_BoundaryExportsSection_7=ruleBoundaryExportsSection();

                    state._fsp--;


                    			current = this_BoundaryExportsSection_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalLibrettoSpec.g:220:3: this_BoundaryImportsSection_8= ruleBoundaryImportsSection
                    {

                    			newCompositeNode(grammarAccess.getSpecSectionAccess().getBoundaryImportsSectionParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_BoundaryImportsSection_8=ruleBoundaryImportsSection();

                    state._fsp--;


                    			current = this_BoundaryImportsSection_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalLibrettoSpec.g:229:3: this_BehaviorsSection_9= ruleBehaviorsSection
                    {

                    			newCompositeNode(grammarAccess.getSpecSectionAccess().getBehaviorsSectionParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_BehaviorsSection_9=ruleBehaviorsSection();

                    state._fsp--;


                    			current = this_BehaviorsSection_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalLibrettoSpec.g:238:3: this_AcceptanceTestsSection_10= ruleAcceptanceTestsSection
                    {

                    			newCompositeNode(grammarAccess.getSpecSectionAccess().getAcceptanceTestsSectionParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_AcceptanceTestsSection_10=ruleAcceptanceTestsSection();

                    state._fsp--;


                    			current = this_AcceptanceTestsSection_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalLibrettoSpec.g:247:3: this_ImplementationDirectivesSection_11= ruleImplementationDirectivesSection
                    {

                    			newCompositeNode(grammarAccess.getSpecSectionAccess().getImplementationDirectivesSectionParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_ImplementationDirectivesSection_11=ruleImplementationDirectivesSection();

                    state._fsp--;


                    			current = this_ImplementationDirectivesSection_11;
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
    // $ANTLR end "ruleSpecSection"


    // $ANTLR start "entryRuleMetadataSection"
    // InternalLibrettoSpec.g:259:1: entryRuleMetadataSection returns [EObject current=null] : iv_ruleMetadataSection= ruleMetadataSection EOF ;
    public final EObject entryRuleMetadataSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetadataSection = null;


        try {
            // InternalLibrettoSpec.g:259:56: (iv_ruleMetadataSection= ruleMetadataSection EOF )
            // InternalLibrettoSpec.g:260:2: iv_ruleMetadataSection= ruleMetadataSection EOF
            {
             newCompositeNode(grammarAccess.getMetadataSectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMetadataSection=ruleMetadataSection();

            state._fsp--;

             current =iv_ruleMetadataSection; 
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
    // $ANTLR end "entryRuleMetadataSection"


    // $ANTLR start "ruleMetadataSection"
    // InternalLibrettoSpec.g:266:1: ruleMetadataSection returns [EObject current=null] : ( () otherlv_1= 'metadata' otherlv_2= '{' ( (lv_fields_3_0= ruleMetadataField ) )* otherlv_4= '}' ) ;
    public final EObject ruleMetadataSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_fields_3_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:272:2: ( ( () otherlv_1= 'metadata' otherlv_2= '{' ( (lv_fields_3_0= ruleMetadataField ) )* otherlv_4= '}' ) )
            // InternalLibrettoSpec.g:273:2: ( () otherlv_1= 'metadata' otherlv_2= '{' ( (lv_fields_3_0= ruleMetadataField ) )* otherlv_4= '}' )
            {
            // InternalLibrettoSpec.g:273:2: ( () otherlv_1= 'metadata' otherlv_2= '{' ( (lv_fields_3_0= ruleMetadataField ) )* otherlv_4= '}' )
            // InternalLibrettoSpec.g:274:3: () otherlv_1= 'metadata' otherlv_2= '{' ( (lv_fields_3_0= ruleMetadataField ) )* otherlv_4= '}'
            {
            // InternalLibrettoSpec.g:274:3: ()
            // InternalLibrettoSpec.g:275:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMetadataSectionAccess().getMetadataSectionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getMetadataSectionAccess().getMetadataKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getMetadataSectionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLibrettoSpec.g:289:3: ( (lv_fields_3_0= ruleMetadataField ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==32||(LA3_0>=34 && LA3_0<=40)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalLibrettoSpec.g:290:4: (lv_fields_3_0= ruleMetadataField )
            	    {
            	    // InternalLibrettoSpec.g:290:4: (lv_fields_3_0= ruleMetadataField )
            	    // InternalLibrettoSpec.g:291:5: lv_fields_3_0= ruleMetadataField
            	    {

            	    					newCompositeNode(grammarAccess.getMetadataSectionAccess().getFieldsMetadataFieldParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_fields_3_0=ruleMetadataField();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMetadataSectionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"fields",
            	    						lv_fields_3_0,
            	    						"com.robenglander.libretto.spec.LibrettoSpec.MetadataField");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getMetadataSectionAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleMetadataSection"


    // $ANTLR start "entryRuleDependenciesSection"
    // InternalLibrettoSpec.g:316:1: entryRuleDependenciesSection returns [EObject current=null] : iv_ruleDependenciesSection= ruleDependenciesSection EOF ;
    public final EObject entryRuleDependenciesSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependenciesSection = null;


        try {
            // InternalLibrettoSpec.g:316:60: (iv_ruleDependenciesSection= ruleDependenciesSection EOF )
            // InternalLibrettoSpec.g:317:2: iv_ruleDependenciesSection= ruleDependenciesSection EOF
            {
             newCompositeNode(grammarAccess.getDependenciesSectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDependenciesSection=ruleDependenciesSection();

            state._fsp--;

             current =iv_ruleDependenciesSection; 
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
    // $ANTLR end "entryRuleDependenciesSection"


    // $ANTLR start "ruleDependenciesSection"
    // InternalLibrettoSpec.g:323:1: ruleDependenciesSection returns [EObject current=null] : ( () ( (lv_sectionKeyword_1_0= ruleDependenciesSectionKeyword ) ) otherlv_2= '{' ( (lv_records_3_0= ruleDependencyRecord ) )* otherlv_4= '}' ) ;
    public final EObject ruleDependenciesSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_sectionKeyword_1_0 = null;

        EObject lv_records_3_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:329:2: ( ( () ( (lv_sectionKeyword_1_0= ruleDependenciesSectionKeyword ) ) otherlv_2= '{' ( (lv_records_3_0= ruleDependencyRecord ) )* otherlv_4= '}' ) )
            // InternalLibrettoSpec.g:330:2: ( () ( (lv_sectionKeyword_1_0= ruleDependenciesSectionKeyword ) ) otherlv_2= '{' ( (lv_records_3_0= ruleDependencyRecord ) )* otherlv_4= '}' )
            {
            // InternalLibrettoSpec.g:330:2: ( () ( (lv_sectionKeyword_1_0= ruleDependenciesSectionKeyword ) ) otherlv_2= '{' ( (lv_records_3_0= ruleDependencyRecord ) )* otherlv_4= '}' )
            // InternalLibrettoSpec.g:331:3: () ( (lv_sectionKeyword_1_0= ruleDependenciesSectionKeyword ) ) otherlv_2= '{' ( (lv_records_3_0= ruleDependencyRecord ) )* otherlv_4= '}'
            {
            // InternalLibrettoSpec.g:331:3: ()
            // InternalLibrettoSpec.g:332:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDependenciesSectionAccess().getDependenciesSectionAction_0(),
            					current);
            			

            }

            // InternalLibrettoSpec.g:338:3: ( (lv_sectionKeyword_1_0= ruleDependenciesSectionKeyword ) )
            // InternalLibrettoSpec.g:339:4: (lv_sectionKeyword_1_0= ruleDependenciesSectionKeyword )
            {
            // InternalLibrettoSpec.g:339:4: (lv_sectionKeyword_1_0= ruleDependenciesSectionKeyword )
            // InternalLibrettoSpec.g:340:5: lv_sectionKeyword_1_0= ruleDependenciesSectionKeyword
            {

            					newCompositeNode(grammarAccess.getDependenciesSectionAccess().getSectionKeywordDependenciesSectionKeywordParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_sectionKeyword_1_0=ruleDependenciesSectionKeyword();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDependenciesSectionRule());
            					}
            					set(
            						current,
            						"sectionKeyword",
            						lv_sectionKeyword_1_0,
            						"com.robenglander.libretto.spec.LibrettoSpec.DependenciesSectionKeyword");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getDependenciesSectionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLibrettoSpec.g:361:3: ( (lv_records_3_0= ruleDependencyRecord ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==42) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalLibrettoSpec.g:362:4: (lv_records_3_0= ruleDependencyRecord )
            	    {
            	    // InternalLibrettoSpec.g:362:4: (lv_records_3_0= ruleDependencyRecord )
            	    // InternalLibrettoSpec.g:363:5: lv_records_3_0= ruleDependencyRecord
            	    {

            	    					newCompositeNode(grammarAccess.getDependenciesSectionAccess().getRecordsDependencyRecordParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_records_3_0=ruleDependencyRecord();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDependenciesSectionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"records",
            	    						lv_records_3_0,
            	    						"com.robenglander.libretto.spec.LibrettoSpec.DependencyRecord");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDependenciesSectionAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleDependenciesSection"


    // $ANTLR start "entryRuleReferencesSection"
    // InternalLibrettoSpec.g:388:1: entryRuleReferencesSection returns [EObject current=null] : iv_ruleReferencesSection= ruleReferencesSection EOF ;
    public final EObject entryRuleReferencesSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferencesSection = null;


        try {
            // InternalLibrettoSpec.g:388:58: (iv_ruleReferencesSection= ruleReferencesSection EOF )
            // InternalLibrettoSpec.g:389:2: iv_ruleReferencesSection= ruleReferencesSection EOF
            {
             newCompositeNode(grammarAccess.getReferencesSectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReferencesSection=ruleReferencesSection();

            state._fsp--;

             current =iv_ruleReferencesSection; 
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
    // $ANTLR end "entryRuleReferencesSection"


    // $ANTLR start "ruleReferencesSection"
    // InternalLibrettoSpec.g:395:1: ruleReferencesSection returns [EObject current=null] : ( () otherlv_1= 'references' otherlv_2= '{' ( (lv_records_3_0= ruleReferenceRecord ) )* otherlv_4= '}' ) ;
    public final EObject ruleReferencesSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_records_3_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:401:2: ( ( () otherlv_1= 'references' otherlv_2= '{' ( (lv_records_3_0= ruleReferenceRecord ) )* otherlv_4= '}' ) )
            // InternalLibrettoSpec.g:402:2: ( () otherlv_1= 'references' otherlv_2= '{' ( (lv_records_3_0= ruleReferenceRecord ) )* otherlv_4= '}' )
            {
            // InternalLibrettoSpec.g:402:2: ( () otherlv_1= 'references' otherlv_2= '{' ( (lv_records_3_0= ruleReferenceRecord ) )* otherlv_4= '}' )
            // InternalLibrettoSpec.g:403:3: () otherlv_1= 'references' otherlv_2= '{' ( (lv_records_3_0= ruleReferenceRecord ) )* otherlv_4= '}'
            {
            // InternalLibrettoSpec.g:403:3: ()
            // InternalLibrettoSpec.g:404:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getReferencesSectionAccess().getReferencesSectionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getReferencesSectionAccess().getReferencesKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getReferencesSectionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLibrettoSpec.g:418:3: ( (lv_records_3_0= ruleReferenceRecord ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==44) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalLibrettoSpec.g:419:4: (lv_records_3_0= ruleReferenceRecord )
            	    {
            	    // InternalLibrettoSpec.g:419:4: (lv_records_3_0= ruleReferenceRecord )
            	    // InternalLibrettoSpec.g:420:5: lv_records_3_0= ruleReferenceRecord
            	    {

            	    					newCompositeNode(grammarAccess.getReferencesSectionAccess().getRecordsReferenceRecordParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_records_3_0=ruleReferenceRecord();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getReferencesSectionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"records",
            	    						lv_records_3_0,
            	    						"com.robenglander.libretto.spec.LibrettoSpec.ReferenceRecord");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getReferencesSectionAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleReferencesSection"


    // $ANTLR start "entryRuleProseSection"
    // InternalLibrettoSpec.g:445:1: entryRuleProseSection returns [EObject current=null] : iv_ruleProseSection= ruleProseSection EOF ;
    public final EObject entryRuleProseSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProseSection = null;


        try {
            // InternalLibrettoSpec.g:445:53: (iv_ruleProseSection= ruleProseSection EOF )
            // InternalLibrettoSpec.g:446:2: iv_ruleProseSection= ruleProseSection EOF
            {
             newCompositeNode(grammarAccess.getProseSectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProseSection=ruleProseSection();

            state._fsp--;

             current =iv_ruleProseSection; 
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
    // $ANTLR end "entryRuleProseSection"


    // $ANTLR start "ruleProseSection"
    // InternalLibrettoSpec.g:452:1: ruleProseSection returns [EObject current=null] : ( () otherlv_1= 'prose' otherlv_2= '{' ( (lv_records_3_0= ruleProseRecord ) )* otherlv_4= '}' ) ;
    public final EObject ruleProseSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_records_3_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:458:2: ( ( () otherlv_1= 'prose' otherlv_2= '{' ( (lv_records_3_0= ruleProseRecord ) )* otherlv_4= '}' ) )
            // InternalLibrettoSpec.g:459:2: ( () otherlv_1= 'prose' otherlv_2= '{' ( (lv_records_3_0= ruleProseRecord ) )* otherlv_4= '}' )
            {
            // InternalLibrettoSpec.g:459:2: ( () otherlv_1= 'prose' otherlv_2= '{' ( (lv_records_3_0= ruleProseRecord ) )* otherlv_4= '}' )
            // InternalLibrettoSpec.g:460:3: () otherlv_1= 'prose' otherlv_2= '{' ( (lv_records_3_0= ruleProseRecord ) )* otherlv_4= '}'
            {
            // InternalLibrettoSpec.g:460:3: ()
            // InternalLibrettoSpec.g:461:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProseSectionAccess().getProseSectionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getProseSectionAccess().getProseKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getProseSectionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLibrettoSpec.g:475:3: ( (lv_records_3_0= ruleProseRecord ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=49 && LA6_0<=50)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalLibrettoSpec.g:476:4: (lv_records_3_0= ruleProseRecord )
            	    {
            	    // InternalLibrettoSpec.g:476:4: (lv_records_3_0= ruleProseRecord )
            	    // InternalLibrettoSpec.g:477:5: lv_records_3_0= ruleProseRecord
            	    {

            	    					newCompositeNode(grammarAccess.getProseSectionAccess().getRecordsProseRecordParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_records_3_0=ruleProseRecord();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProseSectionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"records",
            	    						lv_records_3_0,
            	    						"com.robenglander.libretto.spec.LibrettoSpec.ProseRecord");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getProseSectionAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleProseSection"


    // $ANTLR start "entryRuleOutOfScopeSection"
    // InternalLibrettoSpec.g:502:1: entryRuleOutOfScopeSection returns [EObject current=null] : iv_ruleOutOfScopeSection= ruleOutOfScopeSection EOF ;
    public final EObject entryRuleOutOfScopeSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutOfScopeSection = null;


        try {
            // InternalLibrettoSpec.g:502:58: (iv_ruleOutOfScopeSection= ruleOutOfScopeSection EOF )
            // InternalLibrettoSpec.g:503:2: iv_ruleOutOfScopeSection= ruleOutOfScopeSection EOF
            {
             newCompositeNode(grammarAccess.getOutOfScopeSectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutOfScopeSection=ruleOutOfScopeSection();

            state._fsp--;

             current =iv_ruleOutOfScopeSection; 
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
    // $ANTLR end "entryRuleOutOfScopeSection"


    // $ANTLR start "ruleOutOfScopeSection"
    // InternalLibrettoSpec.g:509:1: ruleOutOfScopeSection returns [EObject current=null] : ( () otherlv_1= 'out_of_scope' otherlv_2= '{' ( (lv_records_3_0= ruleOutOfScopeRecord ) )* otherlv_4= '}' ) ;
    public final EObject ruleOutOfScopeSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_records_3_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:515:2: ( ( () otherlv_1= 'out_of_scope' otherlv_2= '{' ( (lv_records_3_0= ruleOutOfScopeRecord ) )* otherlv_4= '}' ) )
            // InternalLibrettoSpec.g:516:2: ( () otherlv_1= 'out_of_scope' otherlv_2= '{' ( (lv_records_3_0= ruleOutOfScopeRecord ) )* otherlv_4= '}' )
            {
            // InternalLibrettoSpec.g:516:2: ( () otherlv_1= 'out_of_scope' otherlv_2= '{' ( (lv_records_3_0= ruleOutOfScopeRecord ) )* otherlv_4= '}' )
            // InternalLibrettoSpec.g:517:3: () otherlv_1= 'out_of_scope' otherlv_2= '{' ( (lv_records_3_0= ruleOutOfScopeRecord ) )* otherlv_4= '}'
            {
            // InternalLibrettoSpec.g:517:3: ()
            // InternalLibrettoSpec.g:518:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOutOfScopeSectionAccess().getOutOfScopeSectionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getOutOfScopeSectionAccess().getOut_of_scopeKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getOutOfScopeSectionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLibrettoSpec.g:532:3: ( (lv_records_3_0= ruleOutOfScopeRecord ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==51) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalLibrettoSpec.g:533:4: (lv_records_3_0= ruleOutOfScopeRecord )
            	    {
            	    // InternalLibrettoSpec.g:533:4: (lv_records_3_0= ruleOutOfScopeRecord )
            	    // InternalLibrettoSpec.g:534:5: lv_records_3_0= ruleOutOfScopeRecord
            	    {

            	    					newCompositeNode(grammarAccess.getOutOfScopeSectionAccess().getRecordsOutOfScopeRecordParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_records_3_0=ruleOutOfScopeRecord();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getOutOfScopeSectionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"records",
            	    						lv_records_3_0,
            	    						"com.robenglander.libretto.spec.LibrettoSpec.OutOfScopeRecord");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getOutOfScopeSectionAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleOutOfScopeSection"


    // $ANTLR start "entryRuleOperationSurfaceSection"
    // InternalLibrettoSpec.g:559:1: entryRuleOperationSurfaceSection returns [EObject current=null] : iv_ruleOperationSurfaceSection= ruleOperationSurfaceSection EOF ;
    public final EObject entryRuleOperationSurfaceSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationSurfaceSection = null;


        try {
            // InternalLibrettoSpec.g:559:64: (iv_ruleOperationSurfaceSection= ruleOperationSurfaceSection EOF )
            // InternalLibrettoSpec.g:560:2: iv_ruleOperationSurfaceSection= ruleOperationSurfaceSection EOF
            {
             newCompositeNode(grammarAccess.getOperationSurfaceSectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperationSurfaceSection=ruleOperationSurfaceSection();

            state._fsp--;

             current =iv_ruleOperationSurfaceSection; 
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
    // $ANTLR end "entryRuleOperationSurfaceSection"


    // $ANTLR start "ruleOperationSurfaceSection"
    // InternalLibrettoSpec.g:566:1: ruleOperationSurfaceSection returns [EObject current=null] : ( () otherlv_1= 'operation_surface' otherlv_2= '{' ( (lv_records_3_0= ruleOperationSurfaceRecord ) )* otherlv_4= '}' ) ;
    public final EObject ruleOperationSurfaceSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_records_3_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:572:2: ( ( () otherlv_1= 'operation_surface' otherlv_2= '{' ( (lv_records_3_0= ruleOperationSurfaceRecord ) )* otherlv_4= '}' ) )
            // InternalLibrettoSpec.g:573:2: ( () otherlv_1= 'operation_surface' otherlv_2= '{' ( (lv_records_3_0= ruleOperationSurfaceRecord ) )* otherlv_4= '}' )
            {
            // InternalLibrettoSpec.g:573:2: ( () otherlv_1= 'operation_surface' otherlv_2= '{' ( (lv_records_3_0= ruleOperationSurfaceRecord ) )* otherlv_4= '}' )
            // InternalLibrettoSpec.g:574:3: () otherlv_1= 'operation_surface' otherlv_2= '{' ( (lv_records_3_0= ruleOperationSurfaceRecord ) )* otherlv_4= '}'
            {
            // InternalLibrettoSpec.g:574:3: ()
            // InternalLibrettoSpec.g:575:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOperationSurfaceSectionAccess().getOperationSurfaceSectionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getOperationSurfaceSectionAccess().getOperation_surfaceKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getOperationSurfaceSectionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLibrettoSpec.g:589:3: ( (lv_records_3_0= ruleOperationSurfaceRecord ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==64) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalLibrettoSpec.g:590:4: (lv_records_3_0= ruleOperationSurfaceRecord )
            	    {
            	    // InternalLibrettoSpec.g:590:4: (lv_records_3_0= ruleOperationSurfaceRecord )
            	    // InternalLibrettoSpec.g:591:5: lv_records_3_0= ruleOperationSurfaceRecord
            	    {

            	    					newCompositeNode(grammarAccess.getOperationSurfaceSectionAccess().getRecordsOperationSurfaceRecordParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_records_3_0=ruleOperationSurfaceRecord();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getOperationSurfaceSectionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"records",
            	    						lv_records_3_0,
            	    						"com.robenglander.libretto.spec.LibrettoSpec.OperationSurfaceRecord");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getOperationSurfaceSectionAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleOperationSurfaceSection"


    // $ANTLR start "entryRuleImplementsSurfaceSection"
    // InternalLibrettoSpec.g:616:1: entryRuleImplementsSurfaceSection returns [EObject current=null] : iv_ruleImplementsSurfaceSection= ruleImplementsSurfaceSection EOF ;
    public final EObject entryRuleImplementsSurfaceSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementsSurfaceSection = null;


        try {
            // InternalLibrettoSpec.g:616:65: (iv_ruleImplementsSurfaceSection= ruleImplementsSurfaceSection EOF )
            // InternalLibrettoSpec.g:617:2: iv_ruleImplementsSurfaceSection= ruleImplementsSurfaceSection EOF
            {
             newCompositeNode(grammarAccess.getImplementsSurfaceSectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImplementsSurfaceSection=ruleImplementsSurfaceSection();

            state._fsp--;

             current =iv_ruleImplementsSurfaceSection; 
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
    // $ANTLR end "entryRuleImplementsSurfaceSection"


    // $ANTLR start "ruleImplementsSurfaceSection"
    // InternalLibrettoSpec.g:623:1: ruleImplementsSurfaceSection returns [EObject current=null] : ( () otherlv_1= 'implements_surface' otherlv_2= '{' ( (lv_records_3_0= ruleImplementsSurfaceRecord ) )* otherlv_4= '}' ) ;
    public final EObject ruleImplementsSurfaceSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_records_3_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:629:2: ( ( () otherlv_1= 'implements_surface' otherlv_2= '{' ( (lv_records_3_0= ruleImplementsSurfaceRecord ) )* otherlv_4= '}' ) )
            // InternalLibrettoSpec.g:630:2: ( () otherlv_1= 'implements_surface' otherlv_2= '{' ( (lv_records_3_0= ruleImplementsSurfaceRecord ) )* otherlv_4= '}' )
            {
            // InternalLibrettoSpec.g:630:2: ( () otherlv_1= 'implements_surface' otherlv_2= '{' ( (lv_records_3_0= ruleImplementsSurfaceRecord ) )* otherlv_4= '}' )
            // InternalLibrettoSpec.g:631:3: () otherlv_1= 'implements_surface' otherlv_2= '{' ( (lv_records_3_0= ruleImplementsSurfaceRecord ) )* otherlv_4= '}'
            {
            // InternalLibrettoSpec.g:631:3: ()
            // InternalLibrettoSpec.g:632:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getImplementsSurfaceSectionAccess().getImplementsSurfaceSectionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getImplementsSurfaceSectionAccess().getImplements_surfaceKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getImplementsSurfaceSectionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLibrettoSpec.g:646:3: ( (lv_records_3_0= ruleImplementsSurfaceRecord ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==67) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalLibrettoSpec.g:647:4: (lv_records_3_0= ruleImplementsSurfaceRecord )
            	    {
            	    // InternalLibrettoSpec.g:647:4: (lv_records_3_0= ruleImplementsSurfaceRecord )
            	    // InternalLibrettoSpec.g:648:5: lv_records_3_0= ruleImplementsSurfaceRecord
            	    {

            	    					newCompositeNode(grammarAccess.getImplementsSurfaceSectionAccess().getRecordsImplementsSurfaceRecordParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_records_3_0=ruleImplementsSurfaceRecord();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getImplementsSurfaceSectionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"records",
            	    						lv_records_3_0,
            	    						"com.robenglander.libretto.spec.LibrettoSpec.ImplementsSurfaceRecord");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getImplementsSurfaceSectionAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleImplementsSurfaceSection"


    // $ANTLR start "entryRuleBoundaryExportsSection"
    // InternalLibrettoSpec.g:673:1: entryRuleBoundaryExportsSection returns [EObject current=null] : iv_ruleBoundaryExportsSection= ruleBoundaryExportsSection EOF ;
    public final EObject entryRuleBoundaryExportsSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoundaryExportsSection = null;


        try {
            // InternalLibrettoSpec.g:673:63: (iv_ruleBoundaryExportsSection= ruleBoundaryExportsSection EOF )
            // InternalLibrettoSpec.g:674:2: iv_ruleBoundaryExportsSection= ruleBoundaryExportsSection EOF
            {
             newCompositeNode(grammarAccess.getBoundaryExportsSectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoundaryExportsSection=ruleBoundaryExportsSection();

            state._fsp--;

             current =iv_ruleBoundaryExportsSection; 
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
    // $ANTLR end "entryRuleBoundaryExportsSection"


    // $ANTLR start "ruleBoundaryExportsSection"
    // InternalLibrettoSpec.g:680:1: ruleBoundaryExportsSection returns [EObject current=null] : ( () otherlv_1= 'boundary_exports' otherlv_2= '{' ( (lv_records_3_0= ruleBoundaryRecord ) )* otherlv_4= '}' ) ;
    public final EObject ruleBoundaryExportsSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_records_3_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:686:2: ( ( () otherlv_1= 'boundary_exports' otherlv_2= '{' ( (lv_records_3_0= ruleBoundaryRecord ) )* otherlv_4= '}' ) )
            // InternalLibrettoSpec.g:687:2: ( () otherlv_1= 'boundary_exports' otherlv_2= '{' ( (lv_records_3_0= ruleBoundaryRecord ) )* otherlv_4= '}' )
            {
            // InternalLibrettoSpec.g:687:2: ( () otherlv_1= 'boundary_exports' otherlv_2= '{' ( (lv_records_3_0= ruleBoundaryRecord ) )* otherlv_4= '}' )
            // InternalLibrettoSpec.g:688:3: () otherlv_1= 'boundary_exports' otherlv_2= '{' ( (lv_records_3_0= ruleBoundaryRecord ) )* otherlv_4= '}'
            {
            // InternalLibrettoSpec.g:688:3: ()
            // InternalLibrettoSpec.g:689:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBoundaryExportsSectionAccess().getBoundaryExportsSectionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getBoundaryExportsSectionAccess().getBoundary_exportsKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getBoundaryExportsSectionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLibrettoSpec.g:703:3: ( (lv_records_3_0= ruleBoundaryRecord ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==68) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalLibrettoSpec.g:704:4: (lv_records_3_0= ruleBoundaryRecord )
            	    {
            	    // InternalLibrettoSpec.g:704:4: (lv_records_3_0= ruleBoundaryRecord )
            	    // InternalLibrettoSpec.g:705:5: lv_records_3_0= ruleBoundaryRecord
            	    {

            	    					newCompositeNode(grammarAccess.getBoundaryExportsSectionAccess().getRecordsBoundaryRecordParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_records_3_0=ruleBoundaryRecord();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBoundaryExportsSectionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"records",
            	    						lv_records_3_0,
            	    						"com.robenglander.libretto.spec.LibrettoSpec.BoundaryRecord");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getBoundaryExportsSectionAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleBoundaryExportsSection"


    // $ANTLR start "entryRuleBoundaryImportsSection"
    // InternalLibrettoSpec.g:730:1: entryRuleBoundaryImportsSection returns [EObject current=null] : iv_ruleBoundaryImportsSection= ruleBoundaryImportsSection EOF ;
    public final EObject entryRuleBoundaryImportsSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoundaryImportsSection = null;


        try {
            // InternalLibrettoSpec.g:730:63: (iv_ruleBoundaryImportsSection= ruleBoundaryImportsSection EOF )
            // InternalLibrettoSpec.g:731:2: iv_ruleBoundaryImportsSection= ruleBoundaryImportsSection EOF
            {
             newCompositeNode(grammarAccess.getBoundaryImportsSectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoundaryImportsSection=ruleBoundaryImportsSection();

            state._fsp--;

             current =iv_ruleBoundaryImportsSection; 
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
    // $ANTLR end "entryRuleBoundaryImportsSection"


    // $ANTLR start "ruleBoundaryImportsSection"
    // InternalLibrettoSpec.g:737:1: ruleBoundaryImportsSection returns [EObject current=null] : ( () otherlv_1= 'boundary_imports' otherlv_2= '{' ( (lv_records_3_0= ruleBoundaryRecord ) )* otherlv_4= '}' ) ;
    public final EObject ruleBoundaryImportsSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_records_3_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:743:2: ( ( () otherlv_1= 'boundary_imports' otherlv_2= '{' ( (lv_records_3_0= ruleBoundaryRecord ) )* otherlv_4= '}' ) )
            // InternalLibrettoSpec.g:744:2: ( () otherlv_1= 'boundary_imports' otherlv_2= '{' ( (lv_records_3_0= ruleBoundaryRecord ) )* otherlv_4= '}' )
            {
            // InternalLibrettoSpec.g:744:2: ( () otherlv_1= 'boundary_imports' otherlv_2= '{' ( (lv_records_3_0= ruleBoundaryRecord ) )* otherlv_4= '}' )
            // InternalLibrettoSpec.g:745:3: () otherlv_1= 'boundary_imports' otherlv_2= '{' ( (lv_records_3_0= ruleBoundaryRecord ) )* otherlv_4= '}'
            {
            // InternalLibrettoSpec.g:745:3: ()
            // InternalLibrettoSpec.g:746:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBoundaryImportsSectionAccess().getBoundaryImportsSectionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getBoundaryImportsSectionAccess().getBoundary_importsKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getBoundaryImportsSectionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLibrettoSpec.g:760:3: ( (lv_records_3_0= ruleBoundaryRecord ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==68) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalLibrettoSpec.g:761:4: (lv_records_3_0= ruleBoundaryRecord )
            	    {
            	    // InternalLibrettoSpec.g:761:4: (lv_records_3_0= ruleBoundaryRecord )
            	    // InternalLibrettoSpec.g:762:5: lv_records_3_0= ruleBoundaryRecord
            	    {

            	    					newCompositeNode(grammarAccess.getBoundaryImportsSectionAccess().getRecordsBoundaryRecordParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_records_3_0=ruleBoundaryRecord();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBoundaryImportsSectionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"records",
            	    						lv_records_3_0,
            	    						"com.robenglander.libretto.spec.LibrettoSpec.BoundaryRecord");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getBoundaryImportsSectionAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleBoundaryImportsSection"


    // $ANTLR start "entryRuleBehaviorsSection"
    // InternalLibrettoSpec.g:787:1: entryRuleBehaviorsSection returns [EObject current=null] : iv_ruleBehaviorsSection= ruleBehaviorsSection EOF ;
    public final EObject entryRuleBehaviorsSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviorsSection = null;


        try {
            // InternalLibrettoSpec.g:787:57: (iv_ruleBehaviorsSection= ruleBehaviorsSection EOF )
            // InternalLibrettoSpec.g:788:2: iv_ruleBehaviorsSection= ruleBehaviorsSection EOF
            {
             newCompositeNode(grammarAccess.getBehaviorsSectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBehaviorsSection=ruleBehaviorsSection();

            state._fsp--;

             current =iv_ruleBehaviorsSection; 
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
    // $ANTLR end "entryRuleBehaviorsSection"


    // $ANTLR start "ruleBehaviorsSection"
    // InternalLibrettoSpec.g:794:1: ruleBehaviorsSection returns [EObject current=null] : ( () otherlv_1= 'behaviors' otherlv_2= '{' ( (lv_records_3_0= ruleBehaviorRecord ) )* otherlv_4= '}' ) ;
    public final EObject ruleBehaviorsSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_records_3_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:800:2: ( ( () otherlv_1= 'behaviors' otherlv_2= '{' ( (lv_records_3_0= ruleBehaviorRecord ) )* otherlv_4= '}' ) )
            // InternalLibrettoSpec.g:801:2: ( () otherlv_1= 'behaviors' otherlv_2= '{' ( (lv_records_3_0= ruleBehaviorRecord ) )* otherlv_4= '}' )
            {
            // InternalLibrettoSpec.g:801:2: ( () otherlv_1= 'behaviors' otherlv_2= '{' ( (lv_records_3_0= ruleBehaviorRecord ) )* otherlv_4= '}' )
            // InternalLibrettoSpec.g:802:3: () otherlv_1= 'behaviors' otherlv_2= '{' ( (lv_records_3_0= ruleBehaviorRecord ) )* otherlv_4= '}'
            {
            // InternalLibrettoSpec.g:802:3: ()
            // InternalLibrettoSpec.g:803:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBehaviorsSectionAccess().getBehaviorsSectionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getBehaviorsSectionAccess().getBehaviorsKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getBehaviorsSectionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLibrettoSpec.g:817:3: ( (lv_records_3_0= ruleBehaviorRecord ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==53) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalLibrettoSpec.g:818:4: (lv_records_3_0= ruleBehaviorRecord )
            	    {
            	    // InternalLibrettoSpec.g:818:4: (lv_records_3_0= ruleBehaviorRecord )
            	    // InternalLibrettoSpec.g:819:5: lv_records_3_0= ruleBehaviorRecord
            	    {

            	    					newCompositeNode(grammarAccess.getBehaviorsSectionAccess().getRecordsBehaviorRecordParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_records_3_0=ruleBehaviorRecord();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBehaviorsSectionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"records",
            	    						lv_records_3_0,
            	    						"com.robenglander.libretto.spec.LibrettoSpec.BehaviorRecord");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getBehaviorsSectionAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleBehaviorsSection"


    // $ANTLR start "entryRuleAcceptanceTestsSection"
    // InternalLibrettoSpec.g:844:1: entryRuleAcceptanceTestsSection returns [EObject current=null] : iv_ruleAcceptanceTestsSection= ruleAcceptanceTestsSection EOF ;
    public final EObject entryRuleAcceptanceTestsSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAcceptanceTestsSection = null;


        try {
            // InternalLibrettoSpec.g:844:63: (iv_ruleAcceptanceTestsSection= ruleAcceptanceTestsSection EOF )
            // InternalLibrettoSpec.g:845:2: iv_ruleAcceptanceTestsSection= ruleAcceptanceTestsSection EOF
            {
             newCompositeNode(grammarAccess.getAcceptanceTestsSectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAcceptanceTestsSection=ruleAcceptanceTestsSection();

            state._fsp--;

             current =iv_ruleAcceptanceTestsSection; 
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
    // $ANTLR end "entryRuleAcceptanceTestsSection"


    // $ANTLR start "ruleAcceptanceTestsSection"
    // InternalLibrettoSpec.g:851:1: ruleAcceptanceTestsSection returns [EObject current=null] : ( () otherlv_1= 'acceptance_tests' otherlv_2= '{' ( (lv_records_3_0= ruleAcceptanceTestRecord ) )* otherlv_4= '}' ) ;
    public final EObject ruleAcceptanceTestsSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_records_3_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:857:2: ( ( () otherlv_1= 'acceptance_tests' otherlv_2= '{' ( (lv_records_3_0= ruleAcceptanceTestRecord ) )* otherlv_4= '}' ) )
            // InternalLibrettoSpec.g:858:2: ( () otherlv_1= 'acceptance_tests' otherlv_2= '{' ( (lv_records_3_0= ruleAcceptanceTestRecord ) )* otherlv_4= '}' )
            {
            // InternalLibrettoSpec.g:858:2: ( () otherlv_1= 'acceptance_tests' otherlv_2= '{' ( (lv_records_3_0= ruleAcceptanceTestRecord ) )* otherlv_4= '}' )
            // InternalLibrettoSpec.g:859:3: () otherlv_1= 'acceptance_tests' otherlv_2= '{' ( (lv_records_3_0= ruleAcceptanceTestRecord ) )* otherlv_4= '}'
            {
            // InternalLibrettoSpec.g:859:3: ()
            // InternalLibrettoSpec.g:860:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAcceptanceTestsSectionAccess().getAcceptanceTestsSectionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAcceptanceTestsSectionAccess().getAcceptance_testsKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getAcceptanceTestsSectionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLibrettoSpec.g:874:3: ( (lv_records_3_0= ruleAcceptanceTestRecord ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==73) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalLibrettoSpec.g:875:4: (lv_records_3_0= ruleAcceptanceTestRecord )
            	    {
            	    // InternalLibrettoSpec.g:875:4: (lv_records_3_0= ruleAcceptanceTestRecord )
            	    // InternalLibrettoSpec.g:876:5: lv_records_3_0= ruleAcceptanceTestRecord
            	    {

            	    					newCompositeNode(grammarAccess.getAcceptanceTestsSectionAccess().getRecordsAcceptanceTestRecordParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_records_3_0=ruleAcceptanceTestRecord();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAcceptanceTestsSectionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"records",
            	    						lv_records_3_0,
            	    						"com.robenglander.libretto.spec.LibrettoSpec.AcceptanceTestRecord");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getAcceptanceTestsSectionAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleAcceptanceTestsSection"


    // $ANTLR start "entryRuleImplementationDirectivesSection"
    // InternalLibrettoSpec.g:901:1: entryRuleImplementationDirectivesSection returns [EObject current=null] : iv_ruleImplementationDirectivesSection= ruleImplementationDirectivesSection EOF ;
    public final EObject entryRuleImplementationDirectivesSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementationDirectivesSection = null;


        try {
            // InternalLibrettoSpec.g:901:72: (iv_ruleImplementationDirectivesSection= ruleImplementationDirectivesSection EOF )
            // InternalLibrettoSpec.g:902:2: iv_ruleImplementationDirectivesSection= ruleImplementationDirectivesSection EOF
            {
             newCompositeNode(grammarAccess.getImplementationDirectivesSectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImplementationDirectivesSection=ruleImplementationDirectivesSection();

            state._fsp--;

             current =iv_ruleImplementationDirectivesSection; 
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
    // $ANTLR end "entryRuleImplementationDirectivesSection"


    // $ANTLR start "ruleImplementationDirectivesSection"
    // InternalLibrettoSpec.g:908:1: ruleImplementationDirectivesSection returns [EObject current=null] : ( () otherlv_1= 'implementation_directives' otherlv_2= '{' ( (lv_records_3_0= ruleImplementationDirectiveRecord ) )* otherlv_4= '}' ) ;
    public final EObject ruleImplementationDirectivesSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_records_3_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:914:2: ( ( () otherlv_1= 'implementation_directives' otherlv_2= '{' ( (lv_records_3_0= ruleImplementationDirectiveRecord ) )* otherlv_4= '}' ) )
            // InternalLibrettoSpec.g:915:2: ( () otherlv_1= 'implementation_directives' otherlv_2= '{' ( (lv_records_3_0= ruleImplementationDirectiveRecord ) )* otherlv_4= '}' )
            {
            // InternalLibrettoSpec.g:915:2: ( () otherlv_1= 'implementation_directives' otherlv_2= '{' ( (lv_records_3_0= ruleImplementationDirectiveRecord ) )* otherlv_4= '}' )
            // InternalLibrettoSpec.g:916:3: () otherlv_1= 'implementation_directives' otherlv_2= '{' ( (lv_records_3_0= ruleImplementationDirectiveRecord ) )* otherlv_4= '}'
            {
            // InternalLibrettoSpec.g:916:3: ()
            // InternalLibrettoSpec.g:917:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getImplementationDirectivesSectionAccess().getImplementationDirectivesSectionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getImplementationDirectivesSectionAccess().getImplementation_directivesKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getImplementationDirectivesSectionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLibrettoSpec.g:931:3: ( (lv_records_3_0= ruleImplementationDirectiveRecord ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==78) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalLibrettoSpec.g:932:4: (lv_records_3_0= ruleImplementationDirectiveRecord )
            	    {
            	    // InternalLibrettoSpec.g:932:4: (lv_records_3_0= ruleImplementationDirectiveRecord )
            	    // InternalLibrettoSpec.g:933:5: lv_records_3_0= ruleImplementationDirectiveRecord
            	    {

            	    					newCompositeNode(grammarAccess.getImplementationDirectivesSectionAccess().getRecordsImplementationDirectiveRecordParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_records_3_0=ruleImplementationDirectiveRecord();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getImplementationDirectivesSectionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"records",
            	    						lv_records_3_0,
            	    						"com.robenglander.libretto.spec.LibrettoSpec.ImplementationDirectiveRecord");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getImplementationDirectivesSectionAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleImplementationDirectivesSection"


    // $ANTLR start "entryRuleMetadataField"
    // InternalLibrettoSpec.g:958:1: entryRuleMetadataField returns [EObject current=null] : iv_ruleMetadataField= ruleMetadataField EOF ;
    public final EObject entryRuleMetadataField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetadataField = null;


        try {
            // InternalLibrettoSpec.g:958:54: (iv_ruleMetadataField= ruleMetadataField EOF )
            // InternalLibrettoSpec.g:959:2: iv_ruleMetadataField= ruleMetadataField EOF
            {
             newCompositeNode(grammarAccess.getMetadataFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMetadataField=ruleMetadataField();

            state._fsp--;

             current =iv_ruleMetadataField; 
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
    // $ANTLR end "entryRuleMetadataField"


    // $ANTLR start "ruleMetadataField"
    // InternalLibrettoSpec.g:965:1: ruleMetadataField returns [EObject current=null] : ( (otherlv_0= 'title' otherlv_1= ':' ( (lv_title_2_0= ruleTextValue ) ) ) | (otherlv_3= 'version' otherlv_4= ':' ( (lv_version_5_0= ruleTextValue ) ) ) | (otherlv_6= 'status' otherlv_7= ':' ( (lv_status_8_0= ruleMetadataStatusValue ) ) ) | (otherlv_9= 'module' otherlv_10= ':' ( (lv_moduleName_11_0= ruleTextValue ) ) ) | (otherlv_12= 'package' otherlv_13= ':' ( (lv_javaPackage_14_0= ruleTextValue ) ) ) | (otherlv_15= 'compiled_at' otherlv_16= ':' ( (lv_compiledAt_17_0= ruleTextValue ) ) ) | (otherlv_18= 'compiler_version' otherlv_19= ':' ( (lv_compilerVersion_20_0= ruleTextValue ) ) ) | (otherlv_21= 'model_metadata' otherlv_22= ':' ( (lv_modelMetadata_23_0= ruleTextValue ) ) ) ) ;
    public final EObject ruleMetadataField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        EObject lv_title_2_0 = null;

        EObject lv_version_5_0 = null;

        Enumerator lv_status_8_0 = null;

        EObject lv_moduleName_11_0 = null;

        EObject lv_javaPackage_14_0 = null;

        EObject lv_compiledAt_17_0 = null;

        EObject lv_compilerVersion_20_0 = null;

        EObject lv_modelMetadata_23_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:971:2: ( ( (otherlv_0= 'title' otherlv_1= ':' ( (lv_title_2_0= ruleTextValue ) ) ) | (otherlv_3= 'version' otherlv_4= ':' ( (lv_version_5_0= ruleTextValue ) ) ) | (otherlv_6= 'status' otherlv_7= ':' ( (lv_status_8_0= ruleMetadataStatusValue ) ) ) | (otherlv_9= 'module' otherlv_10= ':' ( (lv_moduleName_11_0= ruleTextValue ) ) ) | (otherlv_12= 'package' otherlv_13= ':' ( (lv_javaPackage_14_0= ruleTextValue ) ) ) | (otherlv_15= 'compiled_at' otherlv_16= ':' ( (lv_compiledAt_17_0= ruleTextValue ) ) ) | (otherlv_18= 'compiler_version' otherlv_19= ':' ( (lv_compilerVersion_20_0= ruleTextValue ) ) ) | (otherlv_21= 'model_metadata' otherlv_22= ':' ( (lv_modelMetadata_23_0= ruleTextValue ) ) ) ) )
            // InternalLibrettoSpec.g:972:2: ( (otherlv_0= 'title' otherlv_1= ':' ( (lv_title_2_0= ruleTextValue ) ) ) | (otherlv_3= 'version' otherlv_4= ':' ( (lv_version_5_0= ruleTextValue ) ) ) | (otherlv_6= 'status' otherlv_7= ':' ( (lv_status_8_0= ruleMetadataStatusValue ) ) ) | (otherlv_9= 'module' otherlv_10= ':' ( (lv_moduleName_11_0= ruleTextValue ) ) ) | (otherlv_12= 'package' otherlv_13= ':' ( (lv_javaPackage_14_0= ruleTextValue ) ) ) | (otherlv_15= 'compiled_at' otherlv_16= ':' ( (lv_compiledAt_17_0= ruleTextValue ) ) ) | (otherlv_18= 'compiler_version' otherlv_19= ':' ( (lv_compilerVersion_20_0= ruleTextValue ) ) ) | (otherlv_21= 'model_metadata' otherlv_22= ':' ( (lv_modelMetadata_23_0= ruleTextValue ) ) ) )
            {
            // InternalLibrettoSpec.g:972:2: ( (otherlv_0= 'title' otherlv_1= ':' ( (lv_title_2_0= ruleTextValue ) ) ) | (otherlv_3= 'version' otherlv_4= ':' ( (lv_version_5_0= ruleTextValue ) ) ) | (otherlv_6= 'status' otherlv_7= ':' ( (lv_status_8_0= ruleMetadataStatusValue ) ) ) | (otherlv_9= 'module' otherlv_10= ':' ( (lv_moduleName_11_0= ruleTextValue ) ) ) | (otherlv_12= 'package' otherlv_13= ':' ( (lv_javaPackage_14_0= ruleTextValue ) ) ) | (otherlv_15= 'compiled_at' otherlv_16= ':' ( (lv_compiledAt_17_0= ruleTextValue ) ) ) | (otherlv_18= 'compiler_version' otherlv_19= ':' ( (lv_compilerVersion_20_0= ruleTextValue ) ) ) | (otherlv_21= 'model_metadata' otherlv_22= ':' ( (lv_modelMetadata_23_0= ruleTextValue ) ) ) )
            int alt15=8;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt15=1;
                }
                break;
            case 34:
                {
                alt15=2;
                }
                break;
            case 35:
                {
                alt15=3;
                }
                break;
            case 36:
                {
                alt15=4;
                }
                break;
            case 37:
                {
                alt15=5;
                }
                break;
            case 38:
                {
                alt15=6;
                }
                break;
            case 39:
                {
                alt15=7;
                }
                break;
            case 40:
                {
                alt15=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalLibrettoSpec.g:973:3: (otherlv_0= 'title' otherlv_1= ':' ( (lv_title_2_0= ruleTextValue ) ) )
                    {
                    // InternalLibrettoSpec.g:973:3: (otherlv_0= 'title' otherlv_1= ':' ( (lv_title_2_0= ruleTextValue ) ) )
                    // InternalLibrettoSpec.g:974:4: otherlv_0= 'title' otherlv_1= ':' ( (lv_title_2_0= ruleTextValue ) )
                    {
                    otherlv_0=(Token)match(input,32,FOLLOW_17); 

                    				newLeafNode(otherlv_0, grammarAccess.getMetadataFieldAccess().getTitleKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,33,FOLLOW_18); 

                    				newLeafNode(otherlv_1, grammarAccess.getMetadataFieldAccess().getColonKeyword_0_1());
                    			
                    // InternalLibrettoSpec.g:982:4: ( (lv_title_2_0= ruleTextValue ) )
                    // InternalLibrettoSpec.g:983:5: (lv_title_2_0= ruleTextValue )
                    {
                    // InternalLibrettoSpec.g:983:5: (lv_title_2_0= ruleTextValue )
                    // InternalLibrettoSpec.g:984:6: lv_title_2_0= ruleTextValue
                    {

                    						newCompositeNode(grammarAccess.getMetadataFieldAccess().getTitleTextValueParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_title_2_0=ruleTextValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMetadataFieldRule());
                    						}
                    						set(
                    							current,
                    							"title",
                    							lv_title_2_0,
                    							"com.robenglander.libretto.spec.LibrettoSpec.TextValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalLibrettoSpec.g:1003:3: (otherlv_3= 'version' otherlv_4= ':' ( (lv_version_5_0= ruleTextValue ) ) )
                    {
                    // InternalLibrettoSpec.g:1003:3: (otherlv_3= 'version' otherlv_4= ':' ( (lv_version_5_0= ruleTextValue ) ) )
                    // InternalLibrettoSpec.g:1004:4: otherlv_3= 'version' otherlv_4= ':' ( (lv_version_5_0= ruleTextValue ) )
                    {
                    otherlv_3=(Token)match(input,34,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getMetadataFieldAccess().getVersionKeyword_1_0());
                    			
                    otherlv_4=(Token)match(input,33,FOLLOW_18); 

                    				newLeafNode(otherlv_4, grammarAccess.getMetadataFieldAccess().getColonKeyword_1_1());
                    			
                    // InternalLibrettoSpec.g:1012:4: ( (lv_version_5_0= ruleTextValue ) )
                    // InternalLibrettoSpec.g:1013:5: (lv_version_5_0= ruleTextValue )
                    {
                    // InternalLibrettoSpec.g:1013:5: (lv_version_5_0= ruleTextValue )
                    // InternalLibrettoSpec.g:1014:6: lv_version_5_0= ruleTextValue
                    {

                    						newCompositeNode(grammarAccess.getMetadataFieldAccess().getVersionTextValueParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_version_5_0=ruleTextValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMetadataFieldRule());
                    						}
                    						set(
                    							current,
                    							"version",
                    							lv_version_5_0,
                    							"com.robenglander.libretto.spec.LibrettoSpec.TextValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalLibrettoSpec.g:1033:3: (otherlv_6= 'status' otherlv_7= ':' ( (lv_status_8_0= ruleMetadataStatusValue ) ) )
                    {
                    // InternalLibrettoSpec.g:1033:3: (otherlv_6= 'status' otherlv_7= ':' ( (lv_status_8_0= ruleMetadataStatusValue ) ) )
                    // InternalLibrettoSpec.g:1034:4: otherlv_6= 'status' otherlv_7= ':' ( (lv_status_8_0= ruleMetadataStatusValue ) )
                    {
                    otherlv_6=(Token)match(input,35,FOLLOW_17); 

                    				newLeafNode(otherlv_6, grammarAccess.getMetadataFieldAccess().getStatusKeyword_2_0());
                    			
                    otherlv_7=(Token)match(input,33,FOLLOW_19); 

                    				newLeafNode(otherlv_7, grammarAccess.getMetadataFieldAccess().getColonKeyword_2_1());
                    			
                    // InternalLibrettoSpec.g:1042:4: ( (lv_status_8_0= ruleMetadataStatusValue ) )
                    // InternalLibrettoSpec.g:1043:5: (lv_status_8_0= ruleMetadataStatusValue )
                    {
                    // InternalLibrettoSpec.g:1043:5: (lv_status_8_0= ruleMetadataStatusValue )
                    // InternalLibrettoSpec.g:1044:6: lv_status_8_0= ruleMetadataStatusValue
                    {

                    						newCompositeNode(grammarAccess.getMetadataFieldAccess().getStatusMetadataStatusValueEnumRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_status_8_0=ruleMetadataStatusValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMetadataFieldRule());
                    						}
                    						set(
                    							current,
                    							"status",
                    							lv_status_8_0,
                    							"com.robenglander.libretto.spec.LibrettoSpec.MetadataStatusValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalLibrettoSpec.g:1063:3: (otherlv_9= 'module' otherlv_10= ':' ( (lv_moduleName_11_0= ruleTextValue ) ) )
                    {
                    // InternalLibrettoSpec.g:1063:3: (otherlv_9= 'module' otherlv_10= ':' ( (lv_moduleName_11_0= ruleTextValue ) ) )
                    // InternalLibrettoSpec.g:1064:4: otherlv_9= 'module' otherlv_10= ':' ( (lv_moduleName_11_0= ruleTextValue ) )
                    {
                    otherlv_9=(Token)match(input,36,FOLLOW_17); 

                    				newLeafNode(otherlv_9, grammarAccess.getMetadataFieldAccess().getModuleKeyword_3_0());
                    			
                    otherlv_10=(Token)match(input,33,FOLLOW_18); 

                    				newLeafNode(otherlv_10, grammarAccess.getMetadataFieldAccess().getColonKeyword_3_1());
                    			
                    // InternalLibrettoSpec.g:1072:4: ( (lv_moduleName_11_0= ruleTextValue ) )
                    // InternalLibrettoSpec.g:1073:5: (lv_moduleName_11_0= ruleTextValue )
                    {
                    // InternalLibrettoSpec.g:1073:5: (lv_moduleName_11_0= ruleTextValue )
                    // InternalLibrettoSpec.g:1074:6: lv_moduleName_11_0= ruleTextValue
                    {

                    						newCompositeNode(grammarAccess.getMetadataFieldAccess().getModuleNameTextValueParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_moduleName_11_0=ruleTextValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMetadataFieldRule());
                    						}
                    						set(
                    							current,
                    							"moduleName",
                    							lv_moduleName_11_0,
                    							"com.robenglander.libretto.spec.LibrettoSpec.TextValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalLibrettoSpec.g:1093:3: (otherlv_12= 'package' otherlv_13= ':' ( (lv_javaPackage_14_0= ruleTextValue ) ) )
                    {
                    // InternalLibrettoSpec.g:1093:3: (otherlv_12= 'package' otherlv_13= ':' ( (lv_javaPackage_14_0= ruleTextValue ) ) )
                    // InternalLibrettoSpec.g:1094:4: otherlv_12= 'package' otherlv_13= ':' ( (lv_javaPackage_14_0= ruleTextValue ) )
                    {
                    otherlv_12=(Token)match(input,37,FOLLOW_17); 

                    				newLeafNode(otherlv_12, grammarAccess.getMetadataFieldAccess().getPackageKeyword_4_0());
                    			
                    otherlv_13=(Token)match(input,33,FOLLOW_18); 

                    				newLeafNode(otherlv_13, grammarAccess.getMetadataFieldAccess().getColonKeyword_4_1());
                    			
                    // InternalLibrettoSpec.g:1102:4: ( (lv_javaPackage_14_0= ruleTextValue ) )
                    // InternalLibrettoSpec.g:1103:5: (lv_javaPackage_14_0= ruleTextValue )
                    {
                    // InternalLibrettoSpec.g:1103:5: (lv_javaPackage_14_0= ruleTextValue )
                    // InternalLibrettoSpec.g:1104:6: lv_javaPackage_14_0= ruleTextValue
                    {

                    						newCompositeNode(grammarAccess.getMetadataFieldAccess().getJavaPackageTextValueParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_javaPackage_14_0=ruleTextValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMetadataFieldRule());
                    						}
                    						set(
                    							current,
                    							"javaPackage",
                    							lv_javaPackage_14_0,
                    							"com.robenglander.libretto.spec.LibrettoSpec.TextValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalLibrettoSpec.g:1123:3: (otherlv_15= 'compiled_at' otherlv_16= ':' ( (lv_compiledAt_17_0= ruleTextValue ) ) )
                    {
                    // InternalLibrettoSpec.g:1123:3: (otherlv_15= 'compiled_at' otherlv_16= ':' ( (lv_compiledAt_17_0= ruleTextValue ) ) )
                    // InternalLibrettoSpec.g:1124:4: otherlv_15= 'compiled_at' otherlv_16= ':' ( (lv_compiledAt_17_0= ruleTextValue ) )
                    {
                    otherlv_15=(Token)match(input,38,FOLLOW_17); 

                    				newLeafNode(otherlv_15, grammarAccess.getMetadataFieldAccess().getCompiled_atKeyword_5_0());
                    			
                    otherlv_16=(Token)match(input,33,FOLLOW_18); 

                    				newLeafNode(otherlv_16, grammarAccess.getMetadataFieldAccess().getColonKeyword_5_1());
                    			
                    // InternalLibrettoSpec.g:1132:4: ( (lv_compiledAt_17_0= ruleTextValue ) )
                    // InternalLibrettoSpec.g:1133:5: (lv_compiledAt_17_0= ruleTextValue )
                    {
                    // InternalLibrettoSpec.g:1133:5: (lv_compiledAt_17_0= ruleTextValue )
                    // InternalLibrettoSpec.g:1134:6: lv_compiledAt_17_0= ruleTextValue
                    {

                    						newCompositeNode(grammarAccess.getMetadataFieldAccess().getCompiledAtTextValueParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_compiledAt_17_0=ruleTextValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMetadataFieldRule());
                    						}
                    						set(
                    							current,
                    							"compiledAt",
                    							lv_compiledAt_17_0,
                    							"com.robenglander.libretto.spec.LibrettoSpec.TextValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalLibrettoSpec.g:1153:3: (otherlv_18= 'compiler_version' otherlv_19= ':' ( (lv_compilerVersion_20_0= ruleTextValue ) ) )
                    {
                    // InternalLibrettoSpec.g:1153:3: (otherlv_18= 'compiler_version' otherlv_19= ':' ( (lv_compilerVersion_20_0= ruleTextValue ) ) )
                    // InternalLibrettoSpec.g:1154:4: otherlv_18= 'compiler_version' otherlv_19= ':' ( (lv_compilerVersion_20_0= ruleTextValue ) )
                    {
                    otherlv_18=(Token)match(input,39,FOLLOW_17); 

                    				newLeafNode(otherlv_18, grammarAccess.getMetadataFieldAccess().getCompiler_versionKeyword_6_0());
                    			
                    otherlv_19=(Token)match(input,33,FOLLOW_18); 

                    				newLeafNode(otherlv_19, grammarAccess.getMetadataFieldAccess().getColonKeyword_6_1());
                    			
                    // InternalLibrettoSpec.g:1162:4: ( (lv_compilerVersion_20_0= ruleTextValue ) )
                    // InternalLibrettoSpec.g:1163:5: (lv_compilerVersion_20_0= ruleTextValue )
                    {
                    // InternalLibrettoSpec.g:1163:5: (lv_compilerVersion_20_0= ruleTextValue )
                    // InternalLibrettoSpec.g:1164:6: lv_compilerVersion_20_0= ruleTextValue
                    {

                    						newCompositeNode(grammarAccess.getMetadataFieldAccess().getCompilerVersionTextValueParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_compilerVersion_20_0=ruleTextValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMetadataFieldRule());
                    						}
                    						set(
                    							current,
                    							"compilerVersion",
                    							lv_compilerVersion_20_0,
                    							"com.robenglander.libretto.spec.LibrettoSpec.TextValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalLibrettoSpec.g:1183:3: (otherlv_21= 'model_metadata' otherlv_22= ':' ( (lv_modelMetadata_23_0= ruleTextValue ) ) )
                    {
                    // InternalLibrettoSpec.g:1183:3: (otherlv_21= 'model_metadata' otherlv_22= ':' ( (lv_modelMetadata_23_0= ruleTextValue ) ) )
                    // InternalLibrettoSpec.g:1184:4: otherlv_21= 'model_metadata' otherlv_22= ':' ( (lv_modelMetadata_23_0= ruleTextValue ) )
                    {
                    otherlv_21=(Token)match(input,40,FOLLOW_17); 

                    				newLeafNode(otherlv_21, grammarAccess.getMetadataFieldAccess().getModel_metadataKeyword_7_0());
                    			
                    otherlv_22=(Token)match(input,33,FOLLOW_18); 

                    				newLeafNode(otherlv_22, grammarAccess.getMetadataFieldAccess().getColonKeyword_7_1());
                    			
                    // InternalLibrettoSpec.g:1192:4: ( (lv_modelMetadata_23_0= ruleTextValue ) )
                    // InternalLibrettoSpec.g:1193:5: (lv_modelMetadata_23_0= ruleTextValue )
                    {
                    // InternalLibrettoSpec.g:1193:5: (lv_modelMetadata_23_0= ruleTextValue )
                    // InternalLibrettoSpec.g:1194:6: lv_modelMetadata_23_0= ruleTextValue
                    {

                    						newCompositeNode(grammarAccess.getMetadataFieldAccess().getModelMetadataTextValueParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_modelMetadata_23_0=ruleTextValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMetadataFieldRule());
                    						}
                    						set(
                    							current,
                    							"modelMetadata",
                    							lv_modelMetadata_23_0,
                    							"com.robenglander.libretto.spec.LibrettoSpec.TextValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


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
    // $ANTLR end "ruleMetadataField"


    // $ANTLR start "entryRuleDependenciesSectionKeyword"
    // InternalLibrettoSpec.g:1216:1: entryRuleDependenciesSectionKeyword returns [EObject current=null] : iv_ruleDependenciesSectionKeyword= ruleDependenciesSectionKeyword EOF ;
    public final EObject entryRuleDependenciesSectionKeyword() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependenciesSectionKeyword = null;


        try {
            // InternalLibrettoSpec.g:1216:67: (iv_ruleDependenciesSectionKeyword= ruleDependenciesSectionKeyword EOF )
            // InternalLibrettoSpec.g:1217:2: iv_ruleDependenciesSectionKeyword= ruleDependenciesSectionKeyword EOF
            {
             newCompositeNode(grammarAccess.getDependenciesSectionKeywordRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDependenciesSectionKeyword=ruleDependenciesSectionKeyword();

            state._fsp--;

             current =iv_ruleDependenciesSectionKeyword; 
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
    // $ANTLR end "entryRuleDependenciesSectionKeyword"


    // $ANTLR start "ruleDependenciesSectionKeyword"
    // InternalLibrettoSpec.g:1223:1: ruleDependenciesSectionKeyword returns [EObject current=null] : ( () otherlv_1= 'dependencies' ) ;
    public final EObject ruleDependenciesSectionKeyword() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalLibrettoSpec.g:1229:2: ( ( () otherlv_1= 'dependencies' ) )
            // InternalLibrettoSpec.g:1230:2: ( () otherlv_1= 'dependencies' )
            {
            // InternalLibrettoSpec.g:1230:2: ( () otherlv_1= 'dependencies' )
            // InternalLibrettoSpec.g:1231:3: () otherlv_1= 'dependencies'
            {
            // InternalLibrettoSpec.g:1231:3: ()
            // InternalLibrettoSpec.g:1232:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDependenciesSectionKeywordAccess().getDependenciesSectionKeywordAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getDependenciesSectionKeywordAccess().getDependenciesKeyword_1());
            		

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
    // $ANTLR end "ruleDependenciesSectionKeyword"


    // $ANTLR start "entryRuleDependencyKeyword"
    // InternalLibrettoSpec.g:1246:1: entryRuleDependencyKeyword returns [EObject current=null] : iv_ruleDependencyKeyword= ruleDependencyKeyword EOF ;
    public final EObject entryRuleDependencyKeyword() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependencyKeyword = null;


        try {
            // InternalLibrettoSpec.g:1246:58: (iv_ruleDependencyKeyword= ruleDependencyKeyword EOF )
            // InternalLibrettoSpec.g:1247:2: iv_ruleDependencyKeyword= ruleDependencyKeyword EOF
            {
             newCompositeNode(grammarAccess.getDependencyKeywordRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDependencyKeyword=ruleDependencyKeyword();

            state._fsp--;

             current =iv_ruleDependencyKeyword; 
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
    // $ANTLR end "entryRuleDependencyKeyword"


    // $ANTLR start "ruleDependencyKeyword"
    // InternalLibrettoSpec.g:1253:1: ruleDependencyKeyword returns [EObject current=null] : ( () otherlv_1= 'dependency' ) ;
    public final EObject ruleDependencyKeyword() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalLibrettoSpec.g:1259:2: ( ( () otherlv_1= 'dependency' ) )
            // InternalLibrettoSpec.g:1260:2: ( () otherlv_1= 'dependency' )
            {
            // InternalLibrettoSpec.g:1260:2: ( () otherlv_1= 'dependency' )
            // InternalLibrettoSpec.g:1261:3: () otherlv_1= 'dependency'
            {
            // InternalLibrettoSpec.g:1261:3: ()
            // InternalLibrettoSpec.g:1262:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDependencyKeywordAccess().getDependencyKeywordAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,42,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getDependencyKeywordAccess().getDependencyKeyword_1());
            		

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
    // $ANTLR end "ruleDependencyKeyword"


    // $ANTLR start "entryRuleDependencyRecord"
    // InternalLibrettoSpec.g:1276:1: entryRuleDependencyRecord returns [EObject current=null] : iv_ruleDependencyRecord= ruleDependencyRecord EOF ;
    public final EObject entryRuleDependencyRecord() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependencyRecord = null;


        try {
            // InternalLibrettoSpec.g:1276:57: (iv_ruleDependencyRecord= ruleDependencyRecord EOF )
            // InternalLibrettoSpec.g:1277:2: iv_ruleDependencyRecord= ruleDependencyRecord EOF
            {
             newCompositeNode(grammarAccess.getDependencyRecordRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDependencyRecord=ruleDependencyRecord();

            state._fsp--;

             current =iv_ruleDependencyRecord; 
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
    // $ANTLR end "entryRuleDependencyRecord"


    // $ANTLR start "ruleDependencyRecord"
    // InternalLibrettoSpec.g:1283:1: ruleDependencyRecord returns [EObject current=null] : ( ( (lv_keyword_0_0= ruleDependencyKeyword ) ) ( (lv_id_1_0= RULE_LIBRETTO_ID ) ) otherlv_2= '{' ( (lv_items_3_0= ruleDependencyRecordItem ) )* otherlv_4= '}' ) ;
    public final EObject ruleDependencyRecord() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_keyword_0_0 = null;

        EObject lv_items_3_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:1289:2: ( ( ( (lv_keyword_0_0= ruleDependencyKeyword ) ) ( (lv_id_1_0= RULE_LIBRETTO_ID ) ) otherlv_2= '{' ( (lv_items_3_0= ruleDependencyRecordItem ) )* otherlv_4= '}' ) )
            // InternalLibrettoSpec.g:1290:2: ( ( (lv_keyword_0_0= ruleDependencyKeyword ) ) ( (lv_id_1_0= RULE_LIBRETTO_ID ) ) otherlv_2= '{' ( (lv_items_3_0= ruleDependencyRecordItem ) )* otherlv_4= '}' )
            {
            // InternalLibrettoSpec.g:1290:2: ( ( (lv_keyword_0_0= ruleDependencyKeyword ) ) ( (lv_id_1_0= RULE_LIBRETTO_ID ) ) otherlv_2= '{' ( (lv_items_3_0= ruleDependencyRecordItem ) )* otherlv_4= '}' )
            // InternalLibrettoSpec.g:1291:3: ( (lv_keyword_0_0= ruleDependencyKeyword ) ) ( (lv_id_1_0= RULE_LIBRETTO_ID ) ) otherlv_2= '{' ( (lv_items_3_0= ruleDependencyRecordItem ) )* otherlv_4= '}'
            {
            // InternalLibrettoSpec.g:1291:3: ( (lv_keyword_0_0= ruleDependencyKeyword ) )
            // InternalLibrettoSpec.g:1292:4: (lv_keyword_0_0= ruleDependencyKeyword )
            {
            // InternalLibrettoSpec.g:1292:4: (lv_keyword_0_0= ruleDependencyKeyword )
            // InternalLibrettoSpec.g:1293:5: lv_keyword_0_0= ruleDependencyKeyword
            {

            					newCompositeNode(grammarAccess.getDependencyRecordAccess().getKeywordDependencyKeywordParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_keyword_0_0=ruleDependencyKeyword();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDependencyRecordRule());
            					}
            					set(
            						current,
            						"keyword",
            						lv_keyword_0_0,
            						"com.robenglander.libretto.spec.LibrettoSpec.DependencyKeyword");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLibrettoSpec.g:1310:3: ( (lv_id_1_0= RULE_LIBRETTO_ID ) )
            // InternalLibrettoSpec.g:1311:4: (lv_id_1_0= RULE_LIBRETTO_ID )
            {
            // InternalLibrettoSpec.g:1311:4: (lv_id_1_0= RULE_LIBRETTO_ID )
            // InternalLibrettoSpec.g:1312:5: lv_id_1_0= RULE_LIBRETTO_ID
            {
            lv_id_1_0=(Token)match(input,RULE_LIBRETTO_ID,FOLLOW_4); 

            					newLeafNode(lv_id_1_0, grammarAccess.getDependencyRecordAccess().getIdLIBRETTO_IDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDependencyRecordRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_1_0,
            						"com.robenglander.libretto.spec.LibrettoSpec.LIBRETTO_ID");
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getDependencyRecordAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLibrettoSpec.g:1332:3: ( (lv_items_3_0= ruleDependencyRecordItem ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==43||LA16_0==62) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalLibrettoSpec.g:1333:4: (lv_items_3_0= ruleDependencyRecordItem )
            	    {
            	    // InternalLibrettoSpec.g:1333:4: (lv_items_3_0= ruleDependencyRecordItem )
            	    // InternalLibrettoSpec.g:1334:5: lv_items_3_0= ruleDependencyRecordItem
            	    {

            	    					newCompositeNode(grammarAccess.getDependencyRecordAccess().getItemsDependencyRecordItemParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_items_3_0=ruleDependencyRecordItem();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDependencyRecordRule());
            	    					}
            	    					add(
            	    						current,
            	    						"items",
            	    						lv_items_3_0,
            	    						"com.robenglander.libretto.spec.LibrettoSpec.DependencyRecordItem");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDependencyRecordAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleDependencyRecord"


    // $ANTLR start "entryRuleDependencyRecordItem"
    // InternalLibrettoSpec.g:1359:1: entryRuleDependencyRecordItem returns [EObject current=null] : iv_ruleDependencyRecordItem= ruleDependencyRecordItem EOF ;
    public final EObject entryRuleDependencyRecordItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependencyRecordItem = null;


        try {
            // InternalLibrettoSpec.g:1359:61: (iv_ruleDependencyRecordItem= ruleDependencyRecordItem EOF )
            // InternalLibrettoSpec.g:1360:2: iv_ruleDependencyRecordItem= ruleDependencyRecordItem EOF
            {
             newCompositeNode(grammarAccess.getDependencyRecordItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDependencyRecordItem=ruleDependencyRecordItem();

            state._fsp--;

             current =iv_ruleDependencyRecordItem; 
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
    // $ANTLR end "entryRuleDependencyRecordItem"


    // $ANTLR start "ruleDependencyRecordItem"
    // InternalLibrettoSpec.g:1366:1: ruleDependencyRecordItem returns [EObject current=null] : (this_DependencyTargetSpecItem_0= ruleDependencyTargetSpecItem | this_DependencyNotesItem_1= ruleDependencyNotesItem ) ;
    public final EObject ruleDependencyRecordItem() throws RecognitionException {
        EObject current = null;

        EObject this_DependencyTargetSpecItem_0 = null;

        EObject this_DependencyNotesItem_1 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:1372:2: ( (this_DependencyTargetSpecItem_0= ruleDependencyTargetSpecItem | this_DependencyNotesItem_1= ruleDependencyNotesItem ) )
            // InternalLibrettoSpec.g:1373:2: (this_DependencyTargetSpecItem_0= ruleDependencyTargetSpecItem | this_DependencyNotesItem_1= ruleDependencyNotesItem )
            {
            // InternalLibrettoSpec.g:1373:2: (this_DependencyTargetSpecItem_0= ruleDependencyTargetSpecItem | this_DependencyNotesItem_1= ruleDependencyNotesItem )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==43) ) {
                alt17=1;
            }
            else if ( (LA17_0==62) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalLibrettoSpec.g:1374:3: this_DependencyTargetSpecItem_0= ruleDependencyTargetSpecItem
                    {

                    			newCompositeNode(grammarAccess.getDependencyRecordItemAccess().getDependencyTargetSpecItemParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DependencyTargetSpecItem_0=ruleDependencyTargetSpecItem();

                    state._fsp--;


                    			current = this_DependencyTargetSpecItem_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalLibrettoSpec.g:1383:3: this_DependencyNotesItem_1= ruleDependencyNotesItem
                    {

                    			newCompositeNode(grammarAccess.getDependencyRecordItemAccess().getDependencyNotesItemParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DependencyNotesItem_1=ruleDependencyNotesItem();

                    state._fsp--;


                    			current = this_DependencyNotesItem_1;
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
    // $ANTLR end "ruleDependencyRecordItem"


    // $ANTLR start "entryRuleDependencyTargetSpecItem"
    // InternalLibrettoSpec.g:1395:1: entryRuleDependencyTargetSpecItem returns [EObject current=null] : iv_ruleDependencyTargetSpecItem= ruleDependencyTargetSpecItem EOF ;
    public final EObject entryRuleDependencyTargetSpecItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependencyTargetSpecItem = null;


        try {
            // InternalLibrettoSpec.g:1395:65: (iv_ruleDependencyTargetSpecItem= ruleDependencyTargetSpecItem EOF )
            // InternalLibrettoSpec.g:1396:2: iv_ruleDependencyTargetSpecItem= ruleDependencyTargetSpecItem EOF
            {
             newCompositeNode(grammarAccess.getDependencyTargetSpecItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDependencyTargetSpecItem=ruleDependencyTargetSpecItem();

            state._fsp--;

             current =iv_ruleDependencyTargetSpecItem; 
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
    // $ANTLR end "entryRuleDependencyTargetSpecItem"


    // $ANTLR start "ruleDependencyTargetSpecItem"
    // InternalLibrettoSpec.g:1402:1: ruleDependencyTargetSpecItem returns [EObject current=null] : ( (lv_targetSpec_0_0= ruleTargetSpecField ) ) ;
    public final EObject ruleDependencyTargetSpecItem() throws RecognitionException {
        EObject current = null;

        EObject lv_targetSpec_0_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:1408:2: ( ( (lv_targetSpec_0_0= ruleTargetSpecField ) ) )
            // InternalLibrettoSpec.g:1409:2: ( (lv_targetSpec_0_0= ruleTargetSpecField ) )
            {
            // InternalLibrettoSpec.g:1409:2: ( (lv_targetSpec_0_0= ruleTargetSpecField ) )
            // InternalLibrettoSpec.g:1410:3: (lv_targetSpec_0_0= ruleTargetSpecField )
            {
            // InternalLibrettoSpec.g:1410:3: (lv_targetSpec_0_0= ruleTargetSpecField )
            // InternalLibrettoSpec.g:1411:4: lv_targetSpec_0_0= ruleTargetSpecField
            {

            				newCompositeNode(grammarAccess.getDependencyTargetSpecItemAccess().getTargetSpecTargetSpecFieldParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_targetSpec_0_0=ruleTargetSpecField();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getDependencyTargetSpecItemRule());
            				}
            				set(
            					current,
            					"targetSpec",
            					lv_targetSpec_0_0,
            					"com.robenglander.libretto.spec.LibrettoSpec.TargetSpecField");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleDependencyTargetSpecItem"


    // $ANTLR start "entryRuleDependencyNotesItem"
    // InternalLibrettoSpec.g:1431:1: entryRuleDependencyNotesItem returns [EObject current=null] : iv_ruleDependencyNotesItem= ruleDependencyNotesItem EOF ;
    public final EObject entryRuleDependencyNotesItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependencyNotesItem = null;


        try {
            // InternalLibrettoSpec.g:1431:60: (iv_ruleDependencyNotesItem= ruleDependencyNotesItem EOF )
            // InternalLibrettoSpec.g:1432:2: iv_ruleDependencyNotesItem= ruleDependencyNotesItem EOF
            {
             newCompositeNode(grammarAccess.getDependencyNotesItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDependencyNotesItem=ruleDependencyNotesItem();

            state._fsp--;

             current =iv_ruleDependencyNotesItem; 
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
    // $ANTLR end "entryRuleDependencyNotesItem"


    // $ANTLR start "ruleDependencyNotesItem"
    // InternalLibrettoSpec.g:1438:1: ruleDependencyNotesItem returns [EObject current=null] : ( (lv_notes_0_0= ruleNotesField ) ) ;
    public final EObject ruleDependencyNotesItem() throws RecognitionException {
        EObject current = null;

        EObject lv_notes_0_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:1444:2: ( ( (lv_notes_0_0= ruleNotesField ) ) )
            // InternalLibrettoSpec.g:1445:2: ( (lv_notes_0_0= ruleNotesField ) )
            {
            // InternalLibrettoSpec.g:1445:2: ( (lv_notes_0_0= ruleNotesField ) )
            // InternalLibrettoSpec.g:1446:3: (lv_notes_0_0= ruleNotesField )
            {
            // InternalLibrettoSpec.g:1446:3: (lv_notes_0_0= ruleNotesField )
            // InternalLibrettoSpec.g:1447:4: lv_notes_0_0= ruleNotesField
            {

            				newCompositeNode(grammarAccess.getDependencyNotesItemAccess().getNotesNotesFieldParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_notes_0_0=ruleNotesField();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getDependencyNotesItemRule());
            				}
            				set(
            					current,
            					"notes",
            					lv_notes_0_0,
            					"com.robenglander.libretto.spec.LibrettoSpec.NotesField");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleDependencyNotesItem"


    // $ANTLR start "entryRuleTargetSpecField"
    // InternalLibrettoSpec.g:1467:1: entryRuleTargetSpecField returns [EObject current=null] : iv_ruleTargetSpecField= ruleTargetSpecField EOF ;
    public final EObject entryRuleTargetSpecField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTargetSpecField = null;


        try {
            // InternalLibrettoSpec.g:1467:56: (iv_ruleTargetSpecField= ruleTargetSpecField EOF )
            // InternalLibrettoSpec.g:1468:2: iv_ruleTargetSpecField= ruleTargetSpecField EOF
            {
             newCompositeNode(grammarAccess.getTargetSpecFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTargetSpecField=ruleTargetSpecField();

            state._fsp--;

             current =iv_ruleTargetSpecField; 
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
    // $ANTLR end "entryRuleTargetSpecField"


    // $ANTLR start "ruleTargetSpecField"
    // InternalLibrettoSpec.g:1474:1: ruleTargetSpecField returns [EObject current=null] : (otherlv_0= 'target_spec' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) ) ;
    public final EObject ruleTargetSpecField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:1480:2: ( (otherlv_0= 'target_spec' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) ) )
            // InternalLibrettoSpec.g:1481:2: (otherlv_0= 'target_spec' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) )
            {
            // InternalLibrettoSpec.g:1481:2: (otherlv_0= 'target_spec' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) )
            // InternalLibrettoSpec.g:1482:3: otherlv_0= 'target_spec' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getTargetSpecFieldAccess().getTarget_specKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getTargetSpecFieldAccess().getColonKeyword_1());
            		
            // InternalLibrettoSpec.g:1490:3: ( (lv_value_2_0= ruleTextValue ) )
            // InternalLibrettoSpec.g:1491:4: (lv_value_2_0= ruleTextValue )
            {
            // InternalLibrettoSpec.g:1491:4: (lv_value_2_0= ruleTextValue )
            // InternalLibrettoSpec.g:1492:5: lv_value_2_0= ruleTextValue
            {

            					newCompositeNode(grammarAccess.getTargetSpecFieldAccess().getValueTextValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleTextValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTargetSpecFieldRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"com.robenglander.libretto.spec.LibrettoSpec.TextValue");
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
    // $ANTLR end "ruleTargetSpecField"


    // $ANTLR start "entryRuleReferenceRecord"
    // InternalLibrettoSpec.g:1513:1: entryRuleReferenceRecord returns [EObject current=null] : iv_ruleReferenceRecord= ruleReferenceRecord EOF ;
    public final EObject entryRuleReferenceRecord() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceRecord = null;


        try {
            // InternalLibrettoSpec.g:1513:56: (iv_ruleReferenceRecord= ruleReferenceRecord EOF )
            // InternalLibrettoSpec.g:1514:2: iv_ruleReferenceRecord= ruleReferenceRecord EOF
            {
             newCompositeNode(grammarAccess.getReferenceRecordRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReferenceRecord=ruleReferenceRecord();

            state._fsp--;

             current =iv_ruleReferenceRecord; 
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
    // $ANTLR end "entryRuleReferenceRecord"


    // $ANTLR start "ruleReferenceRecord"
    // InternalLibrettoSpec.g:1520:1: ruleReferenceRecord returns [EObject current=null] : (otherlv_0= 'reference' ( (lv_id_1_0= ruleRefId ) ) otherlv_2= '{' ( (lv_items_3_0= ruleReferenceRecordItem ) )* otherlv_4= '}' ) ;
    public final EObject ruleReferenceRecord() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_id_1_0 = null;

        EObject lv_items_3_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:1526:2: ( (otherlv_0= 'reference' ( (lv_id_1_0= ruleRefId ) ) otherlv_2= '{' ( (lv_items_3_0= ruleReferenceRecordItem ) )* otherlv_4= '}' ) )
            // InternalLibrettoSpec.g:1527:2: (otherlv_0= 'reference' ( (lv_id_1_0= ruleRefId ) ) otherlv_2= '{' ( (lv_items_3_0= ruleReferenceRecordItem ) )* otherlv_4= '}' )
            {
            // InternalLibrettoSpec.g:1527:2: (otherlv_0= 'reference' ( (lv_id_1_0= ruleRefId ) ) otherlv_2= '{' ( (lv_items_3_0= ruleReferenceRecordItem ) )* otherlv_4= '}' )
            // InternalLibrettoSpec.g:1528:3: otherlv_0= 'reference' ( (lv_id_1_0= ruleRefId ) ) otherlv_2= '{' ( (lv_items_3_0= ruleReferenceRecordItem ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getReferenceRecordAccess().getReferenceKeyword_0());
            		
            // InternalLibrettoSpec.g:1532:3: ( (lv_id_1_0= ruleRefId ) )
            // InternalLibrettoSpec.g:1533:4: (lv_id_1_0= ruleRefId )
            {
            // InternalLibrettoSpec.g:1533:4: (lv_id_1_0= ruleRefId )
            // InternalLibrettoSpec.g:1534:5: lv_id_1_0= ruleRefId
            {

            					newCompositeNode(grammarAccess.getReferenceRecordAccess().getIdRefIdParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_id_1_0=ruleRefId();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReferenceRecordRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_1_0,
            						"com.robenglander.libretto.spec.LibrettoSpec.RefId");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getReferenceRecordAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLibrettoSpec.g:1555:3: ( (lv_items_3_0= ruleReferenceRecordItem ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==21||LA18_0==32||(LA18_0>=45 && LA18_0<=48)||LA18_0==63) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalLibrettoSpec.g:1556:4: (lv_items_3_0= ruleReferenceRecordItem )
            	    {
            	    // InternalLibrettoSpec.g:1556:4: (lv_items_3_0= ruleReferenceRecordItem )
            	    // InternalLibrettoSpec.g:1557:5: lv_items_3_0= ruleReferenceRecordItem
            	    {

            	    					newCompositeNode(grammarAccess.getReferenceRecordAccess().getItemsReferenceRecordItemParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_22);
            	    lv_items_3_0=ruleReferenceRecordItem();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getReferenceRecordRule());
            	    					}
            	    					add(
            	    						current,
            	    						"items",
            	    						lv_items_3_0,
            	    						"com.robenglander.libretto.spec.LibrettoSpec.ReferenceRecordItem");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getReferenceRecordAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleReferenceRecord"


    // $ANTLR start "entryRuleReferenceRecordItem"
    // InternalLibrettoSpec.g:1582:1: entryRuleReferenceRecordItem returns [EObject current=null] : iv_ruleReferenceRecordItem= ruleReferenceRecordItem EOF ;
    public final EObject entryRuleReferenceRecordItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceRecordItem = null;


        try {
            // InternalLibrettoSpec.g:1582:60: (iv_ruleReferenceRecordItem= ruleReferenceRecordItem EOF )
            // InternalLibrettoSpec.g:1583:2: iv_ruleReferenceRecordItem= ruleReferenceRecordItem EOF
            {
             newCompositeNode(grammarAccess.getReferenceRecordItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReferenceRecordItem=ruleReferenceRecordItem();

            state._fsp--;

             current =iv_ruleReferenceRecordItem; 
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
    // $ANTLR end "entryRuleReferenceRecordItem"


    // $ANTLR start "ruleReferenceRecordItem"
    // InternalLibrettoSpec.g:1589:1: ruleReferenceRecordItem returns [EObject current=null] : (this_ReferenceTitleItem_0= ruleReferenceTitleItem | this_ReferenceTypeItem_1= ruleReferenceTypeItem | this_ReferenceCitationItem_2= ruleReferenceCitationItem | this_ReferenceLocatorItem_3= ruleReferenceLocatorItem | this_ReferenceAuthorityNotesItem_4= ruleReferenceAuthorityNotesItem | this_ReferenceMetadataTextItem_5= ruleReferenceMetadataTextItem | this_ReferenceContextItem_6= ruleReferenceContextItem ) ;
    public final EObject ruleReferenceRecordItem() throws RecognitionException {
        EObject current = null;

        EObject this_ReferenceTitleItem_0 = null;

        EObject this_ReferenceTypeItem_1 = null;

        EObject this_ReferenceCitationItem_2 = null;

        EObject this_ReferenceLocatorItem_3 = null;

        EObject this_ReferenceAuthorityNotesItem_4 = null;

        EObject this_ReferenceMetadataTextItem_5 = null;

        EObject this_ReferenceContextItem_6 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:1595:2: ( (this_ReferenceTitleItem_0= ruleReferenceTitleItem | this_ReferenceTypeItem_1= ruleReferenceTypeItem | this_ReferenceCitationItem_2= ruleReferenceCitationItem | this_ReferenceLocatorItem_3= ruleReferenceLocatorItem | this_ReferenceAuthorityNotesItem_4= ruleReferenceAuthorityNotesItem | this_ReferenceMetadataTextItem_5= ruleReferenceMetadataTextItem | this_ReferenceContextItem_6= ruleReferenceContextItem ) )
            // InternalLibrettoSpec.g:1596:2: (this_ReferenceTitleItem_0= ruleReferenceTitleItem | this_ReferenceTypeItem_1= ruleReferenceTypeItem | this_ReferenceCitationItem_2= ruleReferenceCitationItem | this_ReferenceLocatorItem_3= ruleReferenceLocatorItem | this_ReferenceAuthorityNotesItem_4= ruleReferenceAuthorityNotesItem | this_ReferenceMetadataTextItem_5= ruleReferenceMetadataTextItem | this_ReferenceContextItem_6= ruleReferenceContextItem )
            {
            // InternalLibrettoSpec.g:1596:2: (this_ReferenceTitleItem_0= ruleReferenceTitleItem | this_ReferenceTypeItem_1= ruleReferenceTypeItem | this_ReferenceCitationItem_2= ruleReferenceCitationItem | this_ReferenceLocatorItem_3= ruleReferenceLocatorItem | this_ReferenceAuthorityNotesItem_4= ruleReferenceAuthorityNotesItem | this_ReferenceMetadataTextItem_5= ruleReferenceMetadataTextItem | this_ReferenceContextItem_6= ruleReferenceContextItem )
            int alt19=7;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt19=1;
                }
                break;
            case 45:
                {
                alt19=2;
                }
                break;
            case 46:
                {
                alt19=3;
                }
                break;
            case 47:
                {
                alt19=4;
                }
                break;
            case 48:
                {
                alt19=5;
                }
                break;
            case 21:
                {
                alt19=6;
                }
                break;
            case 63:
                {
                alt19=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalLibrettoSpec.g:1597:3: this_ReferenceTitleItem_0= ruleReferenceTitleItem
                    {

                    			newCompositeNode(grammarAccess.getReferenceRecordItemAccess().getReferenceTitleItemParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ReferenceTitleItem_0=ruleReferenceTitleItem();

                    state._fsp--;


                    			current = this_ReferenceTitleItem_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalLibrettoSpec.g:1606:3: this_ReferenceTypeItem_1= ruleReferenceTypeItem
                    {

                    			newCompositeNode(grammarAccess.getReferenceRecordItemAccess().getReferenceTypeItemParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ReferenceTypeItem_1=ruleReferenceTypeItem();

                    state._fsp--;


                    			current = this_ReferenceTypeItem_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalLibrettoSpec.g:1615:3: this_ReferenceCitationItem_2= ruleReferenceCitationItem
                    {

                    			newCompositeNode(grammarAccess.getReferenceRecordItemAccess().getReferenceCitationItemParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ReferenceCitationItem_2=ruleReferenceCitationItem();

                    state._fsp--;


                    			current = this_ReferenceCitationItem_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalLibrettoSpec.g:1624:3: this_ReferenceLocatorItem_3= ruleReferenceLocatorItem
                    {

                    			newCompositeNode(grammarAccess.getReferenceRecordItemAccess().getReferenceLocatorItemParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ReferenceLocatorItem_3=ruleReferenceLocatorItem();

                    state._fsp--;


                    			current = this_ReferenceLocatorItem_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalLibrettoSpec.g:1633:3: this_ReferenceAuthorityNotesItem_4= ruleReferenceAuthorityNotesItem
                    {

                    			newCompositeNode(grammarAccess.getReferenceRecordItemAccess().getReferenceAuthorityNotesItemParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ReferenceAuthorityNotesItem_4=ruleReferenceAuthorityNotesItem();

                    state._fsp--;


                    			current = this_ReferenceAuthorityNotesItem_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalLibrettoSpec.g:1642:3: this_ReferenceMetadataTextItem_5= ruleReferenceMetadataTextItem
                    {

                    			newCompositeNode(grammarAccess.getReferenceRecordItemAccess().getReferenceMetadataTextItemParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_ReferenceMetadataTextItem_5=ruleReferenceMetadataTextItem();

                    state._fsp--;


                    			current = this_ReferenceMetadataTextItem_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalLibrettoSpec.g:1651:3: this_ReferenceContextItem_6= ruleReferenceContextItem
                    {

                    			newCompositeNode(grammarAccess.getReferenceRecordItemAccess().getReferenceContextItemParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_ReferenceContextItem_6=ruleReferenceContextItem();

                    state._fsp--;


                    			current = this_ReferenceContextItem_6;
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
    // $ANTLR end "ruleReferenceRecordItem"


    // $ANTLR start "entryRuleReferenceTitleItem"
    // InternalLibrettoSpec.g:1663:1: entryRuleReferenceTitleItem returns [EObject current=null] : iv_ruleReferenceTitleItem= ruleReferenceTitleItem EOF ;
    public final EObject entryRuleReferenceTitleItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceTitleItem = null;


        try {
            // InternalLibrettoSpec.g:1663:59: (iv_ruleReferenceTitleItem= ruleReferenceTitleItem EOF )
            // InternalLibrettoSpec.g:1664:2: iv_ruleReferenceTitleItem= ruleReferenceTitleItem EOF
            {
             newCompositeNode(grammarAccess.getReferenceTitleItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReferenceTitleItem=ruleReferenceTitleItem();

            state._fsp--;

             current =iv_ruleReferenceTitleItem; 
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
    // $ANTLR end "entryRuleReferenceTitleItem"


    // $ANTLR start "ruleReferenceTitleItem"
    // InternalLibrettoSpec.g:1670:1: ruleReferenceTitleItem returns [EObject current=null] : ( (lv_title_0_0= ruleTitleField ) ) ;
    public final EObject ruleReferenceTitleItem() throws RecognitionException {
        EObject current = null;

        EObject lv_title_0_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:1676:2: ( ( (lv_title_0_0= ruleTitleField ) ) )
            // InternalLibrettoSpec.g:1677:2: ( (lv_title_0_0= ruleTitleField ) )
            {
            // InternalLibrettoSpec.g:1677:2: ( (lv_title_0_0= ruleTitleField ) )
            // InternalLibrettoSpec.g:1678:3: (lv_title_0_0= ruleTitleField )
            {
            // InternalLibrettoSpec.g:1678:3: (lv_title_0_0= ruleTitleField )
            // InternalLibrettoSpec.g:1679:4: lv_title_0_0= ruleTitleField
            {

            				newCompositeNode(grammarAccess.getReferenceTitleItemAccess().getTitleTitleFieldParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_title_0_0=ruleTitleField();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getReferenceTitleItemRule());
            				}
            				set(
            					current,
            					"title",
            					lv_title_0_0,
            					"com.robenglander.libretto.spec.LibrettoSpec.TitleField");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleReferenceTitleItem"


    // $ANTLR start "entryRuleReferenceTypeItem"
    // InternalLibrettoSpec.g:1699:1: entryRuleReferenceTypeItem returns [EObject current=null] : iv_ruleReferenceTypeItem= ruleReferenceTypeItem EOF ;
    public final EObject entryRuleReferenceTypeItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceTypeItem = null;


        try {
            // InternalLibrettoSpec.g:1699:58: (iv_ruleReferenceTypeItem= ruleReferenceTypeItem EOF )
            // InternalLibrettoSpec.g:1700:2: iv_ruleReferenceTypeItem= ruleReferenceTypeItem EOF
            {
             newCompositeNode(grammarAccess.getReferenceTypeItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReferenceTypeItem=ruleReferenceTypeItem();

            state._fsp--;

             current =iv_ruleReferenceTypeItem; 
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
    // $ANTLR end "entryRuleReferenceTypeItem"


    // $ANTLR start "ruleReferenceTypeItem"
    // InternalLibrettoSpec.g:1706:1: ruleReferenceTypeItem returns [EObject current=null] : ( (lv_type_0_0= ruleTypeField ) ) ;
    public final EObject ruleReferenceTypeItem() throws RecognitionException {
        EObject current = null;

        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:1712:2: ( ( (lv_type_0_0= ruleTypeField ) ) )
            // InternalLibrettoSpec.g:1713:2: ( (lv_type_0_0= ruleTypeField ) )
            {
            // InternalLibrettoSpec.g:1713:2: ( (lv_type_0_0= ruleTypeField ) )
            // InternalLibrettoSpec.g:1714:3: (lv_type_0_0= ruleTypeField )
            {
            // InternalLibrettoSpec.g:1714:3: (lv_type_0_0= ruleTypeField )
            // InternalLibrettoSpec.g:1715:4: lv_type_0_0= ruleTypeField
            {

            				newCompositeNode(grammarAccess.getReferenceTypeItemAccess().getTypeTypeFieldParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_type_0_0=ruleTypeField();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getReferenceTypeItemRule());
            				}
            				set(
            					current,
            					"type",
            					lv_type_0_0,
            					"com.robenglander.libretto.spec.LibrettoSpec.TypeField");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleReferenceTypeItem"


    // $ANTLR start "entryRuleReferenceCitationItem"
    // InternalLibrettoSpec.g:1735:1: entryRuleReferenceCitationItem returns [EObject current=null] : iv_ruleReferenceCitationItem= ruleReferenceCitationItem EOF ;
    public final EObject entryRuleReferenceCitationItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceCitationItem = null;


        try {
            // InternalLibrettoSpec.g:1735:62: (iv_ruleReferenceCitationItem= ruleReferenceCitationItem EOF )
            // InternalLibrettoSpec.g:1736:2: iv_ruleReferenceCitationItem= ruleReferenceCitationItem EOF
            {
             newCompositeNode(grammarAccess.getReferenceCitationItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReferenceCitationItem=ruleReferenceCitationItem();

            state._fsp--;

             current =iv_ruleReferenceCitationItem; 
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
    // $ANTLR end "entryRuleReferenceCitationItem"


    // $ANTLR start "ruleReferenceCitationItem"
    // InternalLibrettoSpec.g:1742:1: ruleReferenceCitationItem returns [EObject current=null] : ( (lv_citation_0_0= ruleCitationField ) ) ;
    public final EObject ruleReferenceCitationItem() throws RecognitionException {
        EObject current = null;

        EObject lv_citation_0_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:1748:2: ( ( (lv_citation_0_0= ruleCitationField ) ) )
            // InternalLibrettoSpec.g:1749:2: ( (lv_citation_0_0= ruleCitationField ) )
            {
            // InternalLibrettoSpec.g:1749:2: ( (lv_citation_0_0= ruleCitationField ) )
            // InternalLibrettoSpec.g:1750:3: (lv_citation_0_0= ruleCitationField )
            {
            // InternalLibrettoSpec.g:1750:3: (lv_citation_0_0= ruleCitationField )
            // InternalLibrettoSpec.g:1751:4: lv_citation_0_0= ruleCitationField
            {

            				newCompositeNode(grammarAccess.getReferenceCitationItemAccess().getCitationCitationFieldParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_citation_0_0=ruleCitationField();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getReferenceCitationItemRule());
            				}
            				set(
            					current,
            					"citation",
            					lv_citation_0_0,
            					"com.robenglander.libretto.spec.LibrettoSpec.CitationField");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleReferenceCitationItem"


    // $ANTLR start "entryRuleReferenceLocatorItem"
    // InternalLibrettoSpec.g:1771:1: entryRuleReferenceLocatorItem returns [EObject current=null] : iv_ruleReferenceLocatorItem= ruleReferenceLocatorItem EOF ;
    public final EObject entryRuleReferenceLocatorItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceLocatorItem = null;


        try {
            // InternalLibrettoSpec.g:1771:61: (iv_ruleReferenceLocatorItem= ruleReferenceLocatorItem EOF )
            // InternalLibrettoSpec.g:1772:2: iv_ruleReferenceLocatorItem= ruleReferenceLocatorItem EOF
            {
             newCompositeNode(grammarAccess.getReferenceLocatorItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReferenceLocatorItem=ruleReferenceLocatorItem();

            state._fsp--;

             current =iv_ruleReferenceLocatorItem; 
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
    // $ANTLR end "entryRuleReferenceLocatorItem"


    // $ANTLR start "ruleReferenceLocatorItem"
    // InternalLibrettoSpec.g:1778:1: ruleReferenceLocatorItem returns [EObject current=null] : ( (lv_locator_0_0= ruleLocatorField ) ) ;
    public final EObject ruleReferenceLocatorItem() throws RecognitionException {
        EObject current = null;

        EObject lv_locator_0_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:1784:2: ( ( (lv_locator_0_0= ruleLocatorField ) ) )
            // InternalLibrettoSpec.g:1785:2: ( (lv_locator_0_0= ruleLocatorField ) )
            {
            // InternalLibrettoSpec.g:1785:2: ( (lv_locator_0_0= ruleLocatorField ) )
            // InternalLibrettoSpec.g:1786:3: (lv_locator_0_0= ruleLocatorField )
            {
            // InternalLibrettoSpec.g:1786:3: (lv_locator_0_0= ruleLocatorField )
            // InternalLibrettoSpec.g:1787:4: lv_locator_0_0= ruleLocatorField
            {

            				newCompositeNode(grammarAccess.getReferenceLocatorItemAccess().getLocatorLocatorFieldParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_locator_0_0=ruleLocatorField();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getReferenceLocatorItemRule());
            				}
            				set(
            					current,
            					"locator",
            					lv_locator_0_0,
            					"com.robenglander.libretto.spec.LibrettoSpec.LocatorField");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleReferenceLocatorItem"


    // $ANTLR start "entryRuleReferenceAuthorityNotesItem"
    // InternalLibrettoSpec.g:1807:1: entryRuleReferenceAuthorityNotesItem returns [EObject current=null] : iv_ruleReferenceAuthorityNotesItem= ruleReferenceAuthorityNotesItem EOF ;
    public final EObject entryRuleReferenceAuthorityNotesItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceAuthorityNotesItem = null;


        try {
            // InternalLibrettoSpec.g:1807:68: (iv_ruleReferenceAuthorityNotesItem= ruleReferenceAuthorityNotesItem EOF )
            // InternalLibrettoSpec.g:1808:2: iv_ruleReferenceAuthorityNotesItem= ruleReferenceAuthorityNotesItem EOF
            {
             newCompositeNode(grammarAccess.getReferenceAuthorityNotesItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReferenceAuthorityNotesItem=ruleReferenceAuthorityNotesItem();

            state._fsp--;

             current =iv_ruleReferenceAuthorityNotesItem; 
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
    // $ANTLR end "entryRuleReferenceAuthorityNotesItem"


    // $ANTLR start "ruleReferenceAuthorityNotesItem"
    // InternalLibrettoSpec.g:1814:1: ruleReferenceAuthorityNotesItem returns [EObject current=null] : ( (lv_authorityNotes_0_0= ruleAuthorityNotesField ) ) ;
    public final EObject ruleReferenceAuthorityNotesItem() throws RecognitionException {
        EObject current = null;

        EObject lv_authorityNotes_0_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:1820:2: ( ( (lv_authorityNotes_0_0= ruleAuthorityNotesField ) ) )
            // InternalLibrettoSpec.g:1821:2: ( (lv_authorityNotes_0_0= ruleAuthorityNotesField ) )
            {
            // InternalLibrettoSpec.g:1821:2: ( (lv_authorityNotes_0_0= ruleAuthorityNotesField ) )
            // InternalLibrettoSpec.g:1822:3: (lv_authorityNotes_0_0= ruleAuthorityNotesField )
            {
            // InternalLibrettoSpec.g:1822:3: (lv_authorityNotes_0_0= ruleAuthorityNotesField )
            // InternalLibrettoSpec.g:1823:4: lv_authorityNotes_0_0= ruleAuthorityNotesField
            {

            				newCompositeNode(grammarAccess.getReferenceAuthorityNotesItemAccess().getAuthorityNotesAuthorityNotesFieldParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_authorityNotes_0_0=ruleAuthorityNotesField();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getReferenceAuthorityNotesItemRule());
            				}
            				set(
            					current,
            					"authorityNotes",
            					lv_authorityNotes_0_0,
            					"com.robenglander.libretto.spec.LibrettoSpec.AuthorityNotesField");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleReferenceAuthorityNotesItem"


    // $ANTLR start "entryRuleReferenceMetadataTextItem"
    // InternalLibrettoSpec.g:1843:1: entryRuleReferenceMetadataTextItem returns [EObject current=null] : iv_ruleReferenceMetadataTextItem= ruleReferenceMetadataTextItem EOF ;
    public final EObject entryRuleReferenceMetadataTextItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceMetadataTextItem = null;


        try {
            // InternalLibrettoSpec.g:1843:66: (iv_ruleReferenceMetadataTextItem= ruleReferenceMetadataTextItem EOF )
            // InternalLibrettoSpec.g:1844:2: iv_ruleReferenceMetadataTextItem= ruleReferenceMetadataTextItem EOF
            {
             newCompositeNode(grammarAccess.getReferenceMetadataTextItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReferenceMetadataTextItem=ruleReferenceMetadataTextItem();

            state._fsp--;

             current =iv_ruleReferenceMetadataTextItem; 
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
    // $ANTLR end "entryRuleReferenceMetadataTextItem"


    // $ANTLR start "ruleReferenceMetadataTextItem"
    // InternalLibrettoSpec.g:1850:1: ruleReferenceMetadataTextItem returns [EObject current=null] : ( (lv_metadataText_0_0= ruleMetadataTextField ) ) ;
    public final EObject ruleReferenceMetadataTextItem() throws RecognitionException {
        EObject current = null;

        EObject lv_metadataText_0_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:1856:2: ( ( (lv_metadataText_0_0= ruleMetadataTextField ) ) )
            // InternalLibrettoSpec.g:1857:2: ( (lv_metadataText_0_0= ruleMetadataTextField ) )
            {
            // InternalLibrettoSpec.g:1857:2: ( (lv_metadataText_0_0= ruleMetadataTextField ) )
            // InternalLibrettoSpec.g:1858:3: (lv_metadataText_0_0= ruleMetadataTextField )
            {
            // InternalLibrettoSpec.g:1858:3: (lv_metadataText_0_0= ruleMetadataTextField )
            // InternalLibrettoSpec.g:1859:4: lv_metadataText_0_0= ruleMetadataTextField
            {

            				newCompositeNode(grammarAccess.getReferenceMetadataTextItemAccess().getMetadataTextMetadataTextFieldParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_metadataText_0_0=ruleMetadataTextField();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getReferenceMetadataTextItemRule());
            				}
            				set(
            					current,
            					"metadataText",
            					lv_metadataText_0_0,
            					"com.robenglander.libretto.spec.LibrettoSpec.MetadataTextField");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleReferenceMetadataTextItem"


    // $ANTLR start "entryRuleReferenceContextItem"
    // InternalLibrettoSpec.g:1879:1: entryRuleReferenceContextItem returns [EObject current=null] : iv_ruleReferenceContextItem= ruleReferenceContextItem EOF ;
    public final EObject entryRuleReferenceContextItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceContextItem = null;


        try {
            // InternalLibrettoSpec.g:1879:61: (iv_ruleReferenceContextItem= ruleReferenceContextItem EOF )
            // InternalLibrettoSpec.g:1880:2: iv_ruleReferenceContextItem= ruleReferenceContextItem EOF
            {
             newCompositeNode(grammarAccess.getReferenceContextItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReferenceContextItem=ruleReferenceContextItem();

            state._fsp--;

             current =iv_ruleReferenceContextItem; 
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
    // $ANTLR end "entryRuleReferenceContextItem"


    // $ANTLR start "ruleReferenceContextItem"
    // InternalLibrettoSpec.g:1886:1: ruleReferenceContextItem returns [EObject current=null] : ( (lv_context_0_0= ruleContextField ) ) ;
    public final EObject ruleReferenceContextItem() throws RecognitionException {
        EObject current = null;

        EObject lv_context_0_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:1892:2: ( ( (lv_context_0_0= ruleContextField ) ) )
            // InternalLibrettoSpec.g:1893:2: ( (lv_context_0_0= ruleContextField ) )
            {
            // InternalLibrettoSpec.g:1893:2: ( (lv_context_0_0= ruleContextField ) )
            // InternalLibrettoSpec.g:1894:3: (lv_context_0_0= ruleContextField )
            {
            // InternalLibrettoSpec.g:1894:3: (lv_context_0_0= ruleContextField )
            // InternalLibrettoSpec.g:1895:4: lv_context_0_0= ruleContextField
            {

            				newCompositeNode(grammarAccess.getReferenceContextItemAccess().getContextContextFieldParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_context_0_0=ruleContextField();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getReferenceContextItemRule());
            				}
            				set(
            					current,
            					"context",
            					lv_context_0_0,
            					"com.robenglander.libretto.spec.LibrettoSpec.ContextField");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleReferenceContextItem"


    // $ANTLR start "entryRuleTitleField"
    // InternalLibrettoSpec.g:1915:1: entryRuleTitleField returns [EObject current=null] : iv_ruleTitleField= ruleTitleField EOF ;
    public final EObject entryRuleTitleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTitleField = null;


        try {
            // InternalLibrettoSpec.g:1915:51: (iv_ruleTitleField= ruleTitleField EOF )
            // InternalLibrettoSpec.g:1916:2: iv_ruleTitleField= ruleTitleField EOF
            {
             newCompositeNode(grammarAccess.getTitleFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTitleField=ruleTitleField();

            state._fsp--;

             current =iv_ruleTitleField; 
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
    // $ANTLR end "entryRuleTitleField"


    // $ANTLR start "ruleTitleField"
    // InternalLibrettoSpec.g:1922:1: ruleTitleField returns [EObject current=null] : (otherlv_0= 'title' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) ) ;
    public final EObject ruleTitleField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:1928:2: ( (otherlv_0= 'title' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) ) )
            // InternalLibrettoSpec.g:1929:2: (otherlv_0= 'title' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) )
            {
            // InternalLibrettoSpec.g:1929:2: (otherlv_0= 'title' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) )
            // InternalLibrettoSpec.g:1930:3: otherlv_0= 'title' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getTitleFieldAccess().getTitleKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getTitleFieldAccess().getColonKeyword_1());
            		
            // InternalLibrettoSpec.g:1938:3: ( (lv_value_2_0= ruleTextValue ) )
            // InternalLibrettoSpec.g:1939:4: (lv_value_2_0= ruleTextValue )
            {
            // InternalLibrettoSpec.g:1939:4: (lv_value_2_0= ruleTextValue )
            // InternalLibrettoSpec.g:1940:5: lv_value_2_0= ruleTextValue
            {

            					newCompositeNode(grammarAccess.getTitleFieldAccess().getValueTextValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleTextValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTitleFieldRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"com.robenglander.libretto.spec.LibrettoSpec.TextValue");
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
    // $ANTLR end "ruleTitleField"


    // $ANTLR start "entryRuleTypeField"
    // InternalLibrettoSpec.g:1961:1: entryRuleTypeField returns [EObject current=null] : iv_ruleTypeField= ruleTypeField EOF ;
    public final EObject entryRuleTypeField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeField = null;


        try {
            // InternalLibrettoSpec.g:1961:50: (iv_ruleTypeField= ruleTypeField EOF )
            // InternalLibrettoSpec.g:1962:2: iv_ruleTypeField= ruleTypeField EOF
            {
             newCompositeNode(grammarAccess.getTypeFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeField=ruleTypeField();

            state._fsp--;

             current =iv_ruleTypeField; 
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
    // $ANTLR end "entryRuleTypeField"


    // $ANTLR start "ruleTypeField"
    // InternalLibrettoSpec.g:1968:1: ruleTypeField returns [EObject current=null] : (otherlv_0= 'type' otherlv_1= ':' ( (lv_value_2_0= ruleIdentifierValue ) ) ) ;
    public final EObject ruleTypeField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:1974:2: ( (otherlv_0= 'type' otherlv_1= ':' ( (lv_value_2_0= ruleIdentifierValue ) ) ) )
            // InternalLibrettoSpec.g:1975:2: (otherlv_0= 'type' otherlv_1= ':' ( (lv_value_2_0= ruleIdentifierValue ) ) )
            {
            // InternalLibrettoSpec.g:1975:2: (otherlv_0= 'type' otherlv_1= ':' ( (lv_value_2_0= ruleIdentifierValue ) ) )
            // InternalLibrettoSpec.g:1976:3: otherlv_0= 'type' otherlv_1= ':' ( (lv_value_2_0= ruleIdentifierValue ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeFieldAccess().getTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTypeFieldAccess().getColonKeyword_1());
            		
            // InternalLibrettoSpec.g:1984:3: ( (lv_value_2_0= ruleIdentifierValue ) )
            // InternalLibrettoSpec.g:1985:4: (lv_value_2_0= ruleIdentifierValue )
            {
            // InternalLibrettoSpec.g:1985:4: (lv_value_2_0= ruleIdentifierValue )
            // InternalLibrettoSpec.g:1986:5: lv_value_2_0= ruleIdentifierValue
            {

            					newCompositeNode(grammarAccess.getTypeFieldAccess().getValueIdentifierValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleIdentifierValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTypeFieldRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"com.robenglander.libretto.spec.LibrettoSpec.IdentifierValue");
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
    // $ANTLR end "ruleTypeField"


    // $ANTLR start "entryRuleCitationField"
    // InternalLibrettoSpec.g:2007:1: entryRuleCitationField returns [EObject current=null] : iv_ruleCitationField= ruleCitationField EOF ;
    public final EObject entryRuleCitationField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCitationField = null;


        try {
            // InternalLibrettoSpec.g:2007:54: (iv_ruleCitationField= ruleCitationField EOF )
            // InternalLibrettoSpec.g:2008:2: iv_ruleCitationField= ruleCitationField EOF
            {
             newCompositeNode(grammarAccess.getCitationFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCitationField=ruleCitationField();

            state._fsp--;

             current =iv_ruleCitationField; 
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
    // $ANTLR end "entryRuleCitationField"


    // $ANTLR start "ruleCitationField"
    // InternalLibrettoSpec.g:2014:1: ruleCitationField returns [EObject current=null] : (otherlv_0= 'citation' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) ) ;
    public final EObject ruleCitationField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:2020:2: ( (otherlv_0= 'citation' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) ) )
            // InternalLibrettoSpec.g:2021:2: (otherlv_0= 'citation' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) )
            {
            // InternalLibrettoSpec.g:2021:2: (otherlv_0= 'citation' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) )
            // InternalLibrettoSpec.g:2022:3: otherlv_0= 'citation' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) )
            {
            otherlv_0=(Token)match(input,46,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getCitationFieldAccess().getCitationKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getCitationFieldAccess().getColonKeyword_1());
            		
            // InternalLibrettoSpec.g:2030:3: ( (lv_value_2_0= ruleTextValue ) )
            // InternalLibrettoSpec.g:2031:4: (lv_value_2_0= ruleTextValue )
            {
            // InternalLibrettoSpec.g:2031:4: (lv_value_2_0= ruleTextValue )
            // InternalLibrettoSpec.g:2032:5: lv_value_2_0= ruleTextValue
            {

            					newCompositeNode(grammarAccess.getCitationFieldAccess().getValueTextValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleTextValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCitationFieldRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"com.robenglander.libretto.spec.LibrettoSpec.TextValue");
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
    // $ANTLR end "ruleCitationField"


    // $ANTLR start "entryRuleLocatorField"
    // InternalLibrettoSpec.g:2053:1: entryRuleLocatorField returns [EObject current=null] : iv_ruleLocatorField= ruleLocatorField EOF ;
    public final EObject entryRuleLocatorField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocatorField = null;


        try {
            // InternalLibrettoSpec.g:2053:53: (iv_ruleLocatorField= ruleLocatorField EOF )
            // InternalLibrettoSpec.g:2054:2: iv_ruleLocatorField= ruleLocatorField EOF
            {
             newCompositeNode(grammarAccess.getLocatorFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLocatorField=ruleLocatorField();

            state._fsp--;

             current =iv_ruleLocatorField; 
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
    // $ANTLR end "entryRuleLocatorField"


    // $ANTLR start "ruleLocatorField"
    // InternalLibrettoSpec.g:2060:1: ruleLocatorField returns [EObject current=null] : (otherlv_0= 'locator' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) ) ;
    public final EObject ruleLocatorField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:2066:2: ( (otherlv_0= 'locator' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) ) )
            // InternalLibrettoSpec.g:2067:2: (otherlv_0= 'locator' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) )
            {
            // InternalLibrettoSpec.g:2067:2: (otherlv_0= 'locator' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) )
            // InternalLibrettoSpec.g:2068:3: otherlv_0= 'locator' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) )
            {
            otherlv_0=(Token)match(input,47,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getLocatorFieldAccess().getLocatorKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getLocatorFieldAccess().getColonKeyword_1());
            		
            // InternalLibrettoSpec.g:2076:3: ( (lv_value_2_0= ruleTextValue ) )
            // InternalLibrettoSpec.g:2077:4: (lv_value_2_0= ruleTextValue )
            {
            // InternalLibrettoSpec.g:2077:4: (lv_value_2_0= ruleTextValue )
            // InternalLibrettoSpec.g:2078:5: lv_value_2_0= ruleTextValue
            {

            					newCompositeNode(grammarAccess.getLocatorFieldAccess().getValueTextValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleTextValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLocatorFieldRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"com.robenglander.libretto.spec.LibrettoSpec.TextValue");
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
    // $ANTLR end "ruleLocatorField"


    // $ANTLR start "entryRuleAuthorityNotesField"
    // InternalLibrettoSpec.g:2099:1: entryRuleAuthorityNotesField returns [EObject current=null] : iv_ruleAuthorityNotesField= ruleAuthorityNotesField EOF ;
    public final EObject entryRuleAuthorityNotesField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAuthorityNotesField = null;


        try {
            // InternalLibrettoSpec.g:2099:60: (iv_ruleAuthorityNotesField= ruleAuthorityNotesField EOF )
            // InternalLibrettoSpec.g:2100:2: iv_ruleAuthorityNotesField= ruleAuthorityNotesField EOF
            {
             newCompositeNode(grammarAccess.getAuthorityNotesFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAuthorityNotesField=ruleAuthorityNotesField();

            state._fsp--;

             current =iv_ruleAuthorityNotesField; 
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
    // $ANTLR end "entryRuleAuthorityNotesField"


    // $ANTLR start "ruleAuthorityNotesField"
    // InternalLibrettoSpec.g:2106:1: ruleAuthorityNotesField returns [EObject current=null] : (otherlv_0= 'authority_notes' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) ) ;
    public final EObject ruleAuthorityNotesField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:2112:2: ( (otherlv_0= 'authority_notes' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) ) )
            // InternalLibrettoSpec.g:2113:2: (otherlv_0= 'authority_notes' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) )
            {
            // InternalLibrettoSpec.g:2113:2: (otherlv_0= 'authority_notes' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) )
            // InternalLibrettoSpec.g:2114:3: otherlv_0= 'authority_notes' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) )
            {
            otherlv_0=(Token)match(input,48,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getAuthorityNotesFieldAccess().getAuthority_notesKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getAuthorityNotesFieldAccess().getColonKeyword_1());
            		
            // InternalLibrettoSpec.g:2122:3: ( (lv_value_2_0= ruleTextValue ) )
            // InternalLibrettoSpec.g:2123:4: (lv_value_2_0= ruleTextValue )
            {
            // InternalLibrettoSpec.g:2123:4: (lv_value_2_0= ruleTextValue )
            // InternalLibrettoSpec.g:2124:5: lv_value_2_0= ruleTextValue
            {

            					newCompositeNode(grammarAccess.getAuthorityNotesFieldAccess().getValueTextValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleTextValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAuthorityNotesFieldRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"com.robenglander.libretto.spec.LibrettoSpec.TextValue");
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
    // $ANTLR end "ruleAuthorityNotesField"


    // $ANTLR start "entryRuleMetadataTextField"
    // InternalLibrettoSpec.g:2145:1: entryRuleMetadataTextField returns [EObject current=null] : iv_ruleMetadataTextField= ruleMetadataTextField EOF ;
    public final EObject entryRuleMetadataTextField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetadataTextField = null;


        try {
            // InternalLibrettoSpec.g:2145:58: (iv_ruleMetadataTextField= ruleMetadataTextField EOF )
            // InternalLibrettoSpec.g:2146:2: iv_ruleMetadataTextField= ruleMetadataTextField EOF
            {
             newCompositeNode(grammarAccess.getMetadataTextFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMetadataTextField=ruleMetadataTextField();

            state._fsp--;

             current =iv_ruleMetadataTextField; 
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
    // $ANTLR end "entryRuleMetadataTextField"


    // $ANTLR start "ruleMetadataTextField"
    // InternalLibrettoSpec.g:2152:1: ruleMetadataTextField returns [EObject current=null] : (otherlv_0= 'metadata' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) ) ;
    public final EObject ruleMetadataTextField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:2158:2: ( (otherlv_0= 'metadata' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) ) )
            // InternalLibrettoSpec.g:2159:2: (otherlv_0= 'metadata' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) )
            {
            // InternalLibrettoSpec.g:2159:2: (otherlv_0= 'metadata' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) )
            // InternalLibrettoSpec.g:2160:3: otherlv_0= 'metadata' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getMetadataTextFieldAccess().getMetadataKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getMetadataTextFieldAccess().getColonKeyword_1());
            		
            // InternalLibrettoSpec.g:2168:3: ( (lv_value_2_0= ruleTextValue ) )
            // InternalLibrettoSpec.g:2169:4: (lv_value_2_0= ruleTextValue )
            {
            // InternalLibrettoSpec.g:2169:4: (lv_value_2_0= ruleTextValue )
            // InternalLibrettoSpec.g:2170:5: lv_value_2_0= ruleTextValue
            {

            					newCompositeNode(grammarAccess.getMetadataTextFieldAccess().getValueTextValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleTextValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMetadataTextFieldRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"com.robenglander.libretto.spec.LibrettoSpec.TextValue");
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
    // $ANTLR end "ruleMetadataTextField"


    // $ANTLR start "entryRuleProseRecord"
    // InternalLibrettoSpec.g:2191:1: entryRuleProseRecord returns [EObject current=null] : iv_ruleProseRecord= ruleProseRecord EOF ;
    public final EObject entryRuleProseRecord() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProseRecord = null;


        try {
            // InternalLibrettoSpec.g:2191:52: (iv_ruleProseRecord= ruleProseRecord EOF )
            // InternalLibrettoSpec.g:2192:2: iv_ruleProseRecord= ruleProseRecord EOF
            {
             newCompositeNode(grammarAccess.getProseRecordRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProseRecord=ruleProseRecord();

            state._fsp--;

             current =iv_ruleProseRecord; 
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
    // $ANTLR end "entryRuleProseRecord"


    // $ANTLR start "ruleProseRecord"
    // InternalLibrettoSpec.g:2198:1: ruleProseRecord returns [EObject current=null] : (this_SectionContextRecord_0= ruleSectionContextRecord | this_SubsectionContextRecord_1= ruleSubsectionContextRecord ) ;
    public final EObject ruleProseRecord() throws RecognitionException {
        EObject current = null;

        EObject this_SectionContextRecord_0 = null;

        EObject this_SubsectionContextRecord_1 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:2204:2: ( (this_SectionContextRecord_0= ruleSectionContextRecord | this_SubsectionContextRecord_1= ruleSubsectionContextRecord ) )
            // InternalLibrettoSpec.g:2205:2: (this_SectionContextRecord_0= ruleSectionContextRecord | this_SubsectionContextRecord_1= ruleSubsectionContextRecord )
            {
            // InternalLibrettoSpec.g:2205:2: (this_SectionContextRecord_0= ruleSectionContextRecord | this_SubsectionContextRecord_1= ruleSubsectionContextRecord )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==49) ) {
                alt20=1;
            }
            else if ( (LA20_0==50) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalLibrettoSpec.g:2206:3: this_SectionContextRecord_0= ruleSectionContextRecord
                    {

                    			newCompositeNode(grammarAccess.getProseRecordAccess().getSectionContextRecordParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SectionContextRecord_0=ruleSectionContextRecord();

                    state._fsp--;


                    			current = this_SectionContextRecord_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalLibrettoSpec.g:2215:3: this_SubsectionContextRecord_1= ruleSubsectionContextRecord
                    {

                    			newCompositeNode(grammarAccess.getProseRecordAccess().getSubsectionContextRecordParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SubsectionContextRecord_1=ruleSubsectionContextRecord();

                    state._fsp--;


                    			current = this_SubsectionContextRecord_1;
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
    // $ANTLR end "ruleProseRecord"


    // $ANTLR start "entryRuleSectionContextRecord"
    // InternalLibrettoSpec.g:2227:1: entryRuleSectionContextRecord returns [EObject current=null] : iv_ruleSectionContextRecord= ruleSectionContextRecord EOF ;
    public final EObject entryRuleSectionContextRecord() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSectionContextRecord = null;


        try {
            // InternalLibrettoSpec.g:2227:61: (iv_ruleSectionContextRecord= ruleSectionContextRecord EOF )
            // InternalLibrettoSpec.g:2228:2: iv_ruleSectionContextRecord= ruleSectionContextRecord EOF
            {
             newCompositeNode(grammarAccess.getSectionContextRecordRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSectionContextRecord=ruleSectionContextRecord();

            state._fsp--;

             current =iv_ruleSectionContextRecord; 
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
    // $ANTLR end "entryRuleSectionContextRecord"


    // $ANTLR start "ruleSectionContextRecord"
    // InternalLibrettoSpec.g:2234:1: ruleSectionContextRecord returns [EObject current=null] : (otherlv_0= 'section_context' otherlv_1= '{' ( (lv_items_2_0= ruleSectionContextRecordItem ) )* otherlv_3= '}' ) ;
    public final EObject ruleSectionContextRecord() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_items_2_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:2240:2: ( (otherlv_0= 'section_context' otherlv_1= '{' ( (lv_items_2_0= ruleSectionContextRecordItem ) )* otherlv_3= '}' ) )
            // InternalLibrettoSpec.g:2241:2: (otherlv_0= 'section_context' otherlv_1= '{' ( (lv_items_2_0= ruleSectionContextRecordItem ) )* otherlv_3= '}' )
            {
            // InternalLibrettoSpec.g:2241:2: (otherlv_0= 'section_context' otherlv_1= '{' ( (lv_items_2_0= ruleSectionContextRecordItem ) )* otherlv_3= '}' )
            // InternalLibrettoSpec.g:2242:3: otherlv_0= 'section_context' otherlv_1= '{' ( (lv_items_2_0= ruleSectionContextRecordItem ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSectionContextRecordAccess().getSection_contextKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getSectionContextRecordAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalLibrettoSpec.g:2250:3: ( (lv_items_2_0= ruleSectionContextRecordItem ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==87||LA21_0==89) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalLibrettoSpec.g:2251:4: (lv_items_2_0= ruleSectionContextRecordItem )
            	    {
            	    // InternalLibrettoSpec.g:2251:4: (lv_items_2_0= ruleSectionContextRecordItem )
            	    // InternalLibrettoSpec.g:2252:5: lv_items_2_0= ruleSectionContextRecordItem
            	    {

            	    					newCompositeNode(grammarAccess.getSectionContextRecordAccess().getItemsSectionContextRecordItemParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_23);
            	    lv_items_2_0=ruleSectionContextRecordItem();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSectionContextRecordRule());
            	    					}
            	    					add(
            	    						current,
            	    						"items",
            	    						lv_items_2_0,
            	    						"com.robenglander.libretto.spec.LibrettoSpec.SectionContextRecordItem");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_3=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getSectionContextRecordAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleSectionContextRecord"


    // $ANTLR start "entryRuleSectionContextRecordItem"
    // InternalLibrettoSpec.g:2277:1: entryRuleSectionContextRecordItem returns [EObject current=null] : iv_ruleSectionContextRecordItem= ruleSectionContextRecordItem EOF ;
    public final EObject entryRuleSectionContextRecordItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSectionContextRecordItem = null;


        try {
            // InternalLibrettoSpec.g:2277:65: (iv_ruleSectionContextRecordItem= ruleSectionContextRecordItem EOF )
            // InternalLibrettoSpec.g:2278:2: iv_ruleSectionContextRecordItem= ruleSectionContextRecordItem EOF
            {
             newCompositeNode(grammarAccess.getSectionContextRecordItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSectionContextRecordItem=ruleSectionContextRecordItem();

            state._fsp--;

             current =iv_ruleSectionContextRecordItem; 
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
    // $ANTLR end "entryRuleSectionContextRecordItem"


    // $ANTLR start "ruleSectionContextRecordItem"
    // InternalLibrettoSpec.g:2284:1: ruleSectionContextRecordItem returns [EObject current=null] : (this_SectionContextSectionItem_0= ruleSectionContextSectionItem | this_SectionContextTextItem_1= ruleSectionContextTextItem ) ;
    public final EObject ruleSectionContextRecordItem() throws RecognitionException {
        EObject current = null;

        EObject this_SectionContextSectionItem_0 = null;

        EObject this_SectionContextTextItem_1 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:2290:2: ( (this_SectionContextSectionItem_0= ruleSectionContextSectionItem | this_SectionContextTextItem_1= ruleSectionContextTextItem ) )
            // InternalLibrettoSpec.g:2291:2: (this_SectionContextSectionItem_0= ruleSectionContextSectionItem | this_SectionContextTextItem_1= ruleSectionContextTextItem )
            {
            // InternalLibrettoSpec.g:2291:2: (this_SectionContextSectionItem_0= ruleSectionContextSectionItem | this_SectionContextTextItem_1= ruleSectionContextTextItem )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==87) ) {
                alt22=1;
            }
            else if ( (LA22_0==89) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalLibrettoSpec.g:2292:3: this_SectionContextSectionItem_0= ruleSectionContextSectionItem
                    {

                    			newCompositeNode(grammarAccess.getSectionContextRecordItemAccess().getSectionContextSectionItemParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SectionContextSectionItem_0=ruleSectionContextSectionItem();

                    state._fsp--;


                    			current = this_SectionContextSectionItem_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalLibrettoSpec.g:2301:3: this_SectionContextTextItem_1= ruleSectionContextTextItem
                    {

                    			newCompositeNode(grammarAccess.getSectionContextRecordItemAccess().getSectionContextTextItemParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SectionContextTextItem_1=ruleSectionContextTextItem();

                    state._fsp--;


                    			current = this_SectionContextTextItem_1;
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
    // $ANTLR end "ruleSectionContextRecordItem"


    // $ANTLR start "entryRuleSectionContextSectionItem"
    // InternalLibrettoSpec.g:2313:1: entryRuleSectionContextSectionItem returns [EObject current=null] : iv_ruleSectionContextSectionItem= ruleSectionContextSectionItem EOF ;
    public final EObject entryRuleSectionContextSectionItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSectionContextSectionItem = null;


        try {
            // InternalLibrettoSpec.g:2313:66: (iv_ruleSectionContextSectionItem= ruleSectionContextSectionItem EOF )
            // InternalLibrettoSpec.g:2314:2: iv_ruleSectionContextSectionItem= ruleSectionContextSectionItem EOF
            {
             newCompositeNode(grammarAccess.getSectionContextSectionItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSectionContextSectionItem=ruleSectionContextSectionItem();

            state._fsp--;

             current =iv_ruleSectionContextSectionItem; 
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
    // $ANTLR end "entryRuleSectionContextSectionItem"


    // $ANTLR start "ruleSectionContextSectionItem"
    // InternalLibrettoSpec.g:2320:1: ruleSectionContextSectionItem returns [EObject current=null] : ( (lv_section_0_0= ruleSectionField ) ) ;
    public final EObject ruleSectionContextSectionItem() throws RecognitionException {
        EObject current = null;

        EObject lv_section_0_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:2326:2: ( ( (lv_section_0_0= ruleSectionField ) ) )
            // InternalLibrettoSpec.g:2327:2: ( (lv_section_0_0= ruleSectionField ) )
            {
            // InternalLibrettoSpec.g:2327:2: ( (lv_section_0_0= ruleSectionField ) )
            // InternalLibrettoSpec.g:2328:3: (lv_section_0_0= ruleSectionField )
            {
            // InternalLibrettoSpec.g:2328:3: (lv_section_0_0= ruleSectionField )
            // InternalLibrettoSpec.g:2329:4: lv_section_0_0= ruleSectionField
            {

            				newCompositeNode(grammarAccess.getSectionContextSectionItemAccess().getSectionSectionFieldParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_section_0_0=ruleSectionField();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getSectionContextSectionItemRule());
            				}
            				set(
            					current,
            					"section",
            					lv_section_0_0,
            					"com.robenglander.libretto.spec.LibrettoSpec.SectionField");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleSectionContextSectionItem"


    // $ANTLR start "entryRuleSectionContextTextItem"
    // InternalLibrettoSpec.g:2349:1: entryRuleSectionContextTextItem returns [EObject current=null] : iv_ruleSectionContextTextItem= ruleSectionContextTextItem EOF ;
    public final EObject entryRuleSectionContextTextItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSectionContextTextItem = null;


        try {
            // InternalLibrettoSpec.g:2349:63: (iv_ruleSectionContextTextItem= ruleSectionContextTextItem EOF )
            // InternalLibrettoSpec.g:2350:2: iv_ruleSectionContextTextItem= ruleSectionContextTextItem EOF
            {
             newCompositeNode(grammarAccess.getSectionContextTextItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSectionContextTextItem=ruleSectionContextTextItem();

            state._fsp--;

             current =iv_ruleSectionContextTextItem; 
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
    // $ANTLR end "entryRuleSectionContextTextItem"


    // $ANTLR start "ruleSectionContextTextItem"
    // InternalLibrettoSpec.g:2356:1: ruleSectionContextTextItem returns [EObject current=null] : ( (lv_text_0_0= ruleTextField ) ) ;
    public final EObject ruleSectionContextTextItem() throws RecognitionException {
        EObject current = null;

        EObject lv_text_0_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:2362:2: ( ( (lv_text_0_0= ruleTextField ) ) )
            // InternalLibrettoSpec.g:2363:2: ( (lv_text_0_0= ruleTextField ) )
            {
            // InternalLibrettoSpec.g:2363:2: ( (lv_text_0_0= ruleTextField ) )
            // InternalLibrettoSpec.g:2364:3: (lv_text_0_0= ruleTextField )
            {
            // InternalLibrettoSpec.g:2364:3: (lv_text_0_0= ruleTextField )
            // InternalLibrettoSpec.g:2365:4: lv_text_0_0= ruleTextField
            {

            				newCompositeNode(grammarAccess.getSectionContextTextItemAccess().getTextTextFieldParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_text_0_0=ruleTextField();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getSectionContextTextItemRule());
            				}
            				set(
            					current,
            					"text",
            					lv_text_0_0,
            					"com.robenglander.libretto.spec.LibrettoSpec.TextField");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleSectionContextTextItem"


    // $ANTLR start "entryRuleSubsectionContextRecord"
    // InternalLibrettoSpec.g:2385:1: entryRuleSubsectionContextRecord returns [EObject current=null] : iv_ruleSubsectionContextRecord= ruleSubsectionContextRecord EOF ;
    public final EObject entryRuleSubsectionContextRecord() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubsectionContextRecord = null;


        try {
            // InternalLibrettoSpec.g:2385:64: (iv_ruleSubsectionContextRecord= ruleSubsectionContextRecord EOF )
            // InternalLibrettoSpec.g:2386:2: iv_ruleSubsectionContextRecord= ruleSubsectionContextRecord EOF
            {
             newCompositeNode(grammarAccess.getSubsectionContextRecordRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubsectionContextRecord=ruleSubsectionContextRecord();

            state._fsp--;

             current =iv_ruleSubsectionContextRecord; 
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
    // $ANTLR end "entryRuleSubsectionContextRecord"


    // $ANTLR start "ruleSubsectionContextRecord"
    // InternalLibrettoSpec.g:2392:1: ruleSubsectionContextRecord returns [EObject current=null] : (otherlv_0= 'subsection_context' otherlv_1= '{' ( (lv_items_2_0= ruleSubsectionContextRecordItem ) )* otherlv_3= '}' ) ;
    public final EObject ruleSubsectionContextRecord() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_items_2_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:2398:2: ( (otherlv_0= 'subsection_context' otherlv_1= '{' ( (lv_items_2_0= ruleSubsectionContextRecordItem ) )* otherlv_3= '}' ) )
            // InternalLibrettoSpec.g:2399:2: (otherlv_0= 'subsection_context' otherlv_1= '{' ( (lv_items_2_0= ruleSubsectionContextRecordItem ) )* otherlv_3= '}' )
            {
            // InternalLibrettoSpec.g:2399:2: (otherlv_0= 'subsection_context' otherlv_1= '{' ( (lv_items_2_0= ruleSubsectionContextRecordItem ) )* otherlv_3= '}' )
            // InternalLibrettoSpec.g:2400:3: otherlv_0= 'subsection_context' otherlv_1= '{' ( (lv_items_2_0= ruleSubsectionContextRecordItem ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSubsectionContextRecordAccess().getSubsection_contextKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getSubsectionContextRecordAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalLibrettoSpec.g:2408:3: ( (lv_items_2_0= ruleSubsectionContextRecordItem ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=87 && LA23_0<=89)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalLibrettoSpec.g:2409:4: (lv_items_2_0= ruleSubsectionContextRecordItem )
            	    {
            	    // InternalLibrettoSpec.g:2409:4: (lv_items_2_0= ruleSubsectionContextRecordItem )
            	    // InternalLibrettoSpec.g:2410:5: lv_items_2_0= ruleSubsectionContextRecordItem
            	    {

            	    					newCompositeNode(grammarAccess.getSubsectionContextRecordAccess().getItemsSubsectionContextRecordItemParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_24);
            	    lv_items_2_0=ruleSubsectionContextRecordItem();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSubsectionContextRecordRule());
            	    					}
            	    					add(
            	    						current,
            	    						"items",
            	    						lv_items_2_0,
            	    						"com.robenglander.libretto.spec.LibrettoSpec.SubsectionContextRecordItem");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            otherlv_3=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getSubsectionContextRecordAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleSubsectionContextRecord"


    // $ANTLR start "entryRuleSubsectionContextRecordItem"
    // InternalLibrettoSpec.g:2435:1: entryRuleSubsectionContextRecordItem returns [EObject current=null] : iv_ruleSubsectionContextRecordItem= ruleSubsectionContextRecordItem EOF ;
    public final EObject entryRuleSubsectionContextRecordItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubsectionContextRecordItem = null;


        try {
            // InternalLibrettoSpec.g:2435:68: (iv_ruleSubsectionContextRecordItem= ruleSubsectionContextRecordItem EOF )
            // InternalLibrettoSpec.g:2436:2: iv_ruleSubsectionContextRecordItem= ruleSubsectionContextRecordItem EOF
            {
             newCompositeNode(grammarAccess.getSubsectionContextRecordItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubsectionContextRecordItem=ruleSubsectionContextRecordItem();

            state._fsp--;

             current =iv_ruleSubsectionContextRecordItem; 
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
    // $ANTLR end "entryRuleSubsectionContextRecordItem"


    // $ANTLR start "ruleSubsectionContextRecordItem"
    // InternalLibrettoSpec.g:2442:1: ruleSubsectionContextRecordItem returns [EObject current=null] : (this_SubsectionContextSectionItem_0= ruleSubsectionContextSectionItem | this_SubsectionContextSubsectionItem_1= ruleSubsectionContextSubsectionItem | this_SubsectionContextTextItem_2= ruleSubsectionContextTextItem ) ;
    public final EObject ruleSubsectionContextRecordItem() throws RecognitionException {
        EObject current = null;

        EObject this_SubsectionContextSectionItem_0 = null;

        EObject this_SubsectionContextSubsectionItem_1 = null;

        EObject this_SubsectionContextTextItem_2 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:2448:2: ( (this_SubsectionContextSectionItem_0= ruleSubsectionContextSectionItem | this_SubsectionContextSubsectionItem_1= ruleSubsectionContextSubsectionItem | this_SubsectionContextTextItem_2= ruleSubsectionContextTextItem ) )
            // InternalLibrettoSpec.g:2449:2: (this_SubsectionContextSectionItem_0= ruleSubsectionContextSectionItem | this_SubsectionContextSubsectionItem_1= ruleSubsectionContextSubsectionItem | this_SubsectionContextTextItem_2= ruleSubsectionContextTextItem )
            {
            // InternalLibrettoSpec.g:2449:2: (this_SubsectionContextSectionItem_0= ruleSubsectionContextSectionItem | this_SubsectionContextSubsectionItem_1= ruleSubsectionContextSubsectionItem | this_SubsectionContextTextItem_2= ruleSubsectionContextTextItem )
            int alt24=3;
            switch ( input.LA(1) ) {
            case 87:
                {
                alt24=1;
                }
                break;
            case 88:
                {
                alt24=2;
                }
                break;
            case 89:
                {
                alt24=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalLibrettoSpec.g:2450:3: this_SubsectionContextSectionItem_0= ruleSubsectionContextSectionItem
                    {

                    			newCompositeNode(grammarAccess.getSubsectionContextRecordItemAccess().getSubsectionContextSectionItemParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SubsectionContextSectionItem_0=ruleSubsectionContextSectionItem();

                    state._fsp--;


                    			current = this_SubsectionContextSectionItem_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalLibrettoSpec.g:2459:3: this_SubsectionContextSubsectionItem_1= ruleSubsectionContextSubsectionItem
                    {

                    			newCompositeNode(grammarAccess.getSubsectionContextRecordItemAccess().getSubsectionContextSubsectionItemParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SubsectionContextSubsectionItem_1=ruleSubsectionContextSubsectionItem();

                    state._fsp--;


                    			current = this_SubsectionContextSubsectionItem_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalLibrettoSpec.g:2468:3: this_SubsectionContextTextItem_2= ruleSubsectionContextTextItem
                    {

                    			newCompositeNode(grammarAccess.getSubsectionContextRecordItemAccess().getSubsectionContextTextItemParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_SubsectionContextTextItem_2=ruleSubsectionContextTextItem();

                    state._fsp--;


                    			current = this_SubsectionContextTextItem_2;
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
    // $ANTLR end "ruleSubsectionContextRecordItem"


    // $ANTLR start "entryRuleSubsectionContextSectionItem"
    // InternalLibrettoSpec.g:2480:1: entryRuleSubsectionContextSectionItem returns [EObject current=null] : iv_ruleSubsectionContextSectionItem= ruleSubsectionContextSectionItem EOF ;
    public final EObject entryRuleSubsectionContextSectionItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubsectionContextSectionItem = null;


        try {
            // InternalLibrettoSpec.g:2480:69: (iv_ruleSubsectionContextSectionItem= ruleSubsectionContextSectionItem EOF )
            // InternalLibrettoSpec.g:2481:2: iv_ruleSubsectionContextSectionItem= ruleSubsectionContextSectionItem EOF
            {
             newCompositeNode(grammarAccess.getSubsectionContextSectionItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubsectionContextSectionItem=ruleSubsectionContextSectionItem();

            state._fsp--;

             current =iv_ruleSubsectionContextSectionItem; 
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
    // $ANTLR end "entryRuleSubsectionContextSectionItem"


    // $ANTLR start "ruleSubsectionContextSectionItem"
    // InternalLibrettoSpec.g:2487:1: ruleSubsectionContextSectionItem returns [EObject current=null] : ( (lv_section_0_0= ruleSectionField ) ) ;
    public final EObject ruleSubsectionContextSectionItem() throws RecognitionException {
        EObject current = null;

        EObject lv_section_0_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:2493:2: ( ( (lv_section_0_0= ruleSectionField ) ) )
            // InternalLibrettoSpec.g:2494:2: ( (lv_section_0_0= ruleSectionField ) )
            {
            // InternalLibrettoSpec.g:2494:2: ( (lv_section_0_0= ruleSectionField ) )
            // InternalLibrettoSpec.g:2495:3: (lv_section_0_0= ruleSectionField )
            {
            // InternalLibrettoSpec.g:2495:3: (lv_section_0_0= ruleSectionField )
            // InternalLibrettoSpec.g:2496:4: lv_section_0_0= ruleSectionField
            {

            				newCompositeNode(grammarAccess.getSubsectionContextSectionItemAccess().getSectionSectionFieldParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_section_0_0=ruleSectionField();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getSubsectionContextSectionItemRule());
            				}
            				set(
            					current,
            					"section",
            					lv_section_0_0,
            					"com.robenglander.libretto.spec.LibrettoSpec.SectionField");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleSubsectionContextSectionItem"


    // $ANTLR start "entryRuleSubsectionContextSubsectionItem"
    // InternalLibrettoSpec.g:2516:1: entryRuleSubsectionContextSubsectionItem returns [EObject current=null] : iv_ruleSubsectionContextSubsectionItem= ruleSubsectionContextSubsectionItem EOF ;
    public final EObject entryRuleSubsectionContextSubsectionItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubsectionContextSubsectionItem = null;


        try {
            // InternalLibrettoSpec.g:2516:72: (iv_ruleSubsectionContextSubsectionItem= ruleSubsectionContextSubsectionItem EOF )
            // InternalLibrettoSpec.g:2517:2: iv_ruleSubsectionContextSubsectionItem= ruleSubsectionContextSubsectionItem EOF
            {
             newCompositeNode(grammarAccess.getSubsectionContextSubsectionItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubsectionContextSubsectionItem=ruleSubsectionContextSubsectionItem();

            state._fsp--;

             current =iv_ruleSubsectionContextSubsectionItem; 
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
    // $ANTLR end "entryRuleSubsectionContextSubsectionItem"


    // $ANTLR start "ruleSubsectionContextSubsectionItem"
    // InternalLibrettoSpec.g:2523:1: ruleSubsectionContextSubsectionItem returns [EObject current=null] : ( (lv_subsection_0_0= ruleSubsectionField ) ) ;
    public final EObject ruleSubsectionContextSubsectionItem() throws RecognitionException {
        EObject current = null;

        EObject lv_subsection_0_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:2529:2: ( ( (lv_subsection_0_0= ruleSubsectionField ) ) )
            // InternalLibrettoSpec.g:2530:2: ( (lv_subsection_0_0= ruleSubsectionField ) )
            {
            // InternalLibrettoSpec.g:2530:2: ( (lv_subsection_0_0= ruleSubsectionField ) )
            // InternalLibrettoSpec.g:2531:3: (lv_subsection_0_0= ruleSubsectionField )
            {
            // InternalLibrettoSpec.g:2531:3: (lv_subsection_0_0= ruleSubsectionField )
            // InternalLibrettoSpec.g:2532:4: lv_subsection_0_0= ruleSubsectionField
            {

            				newCompositeNode(grammarAccess.getSubsectionContextSubsectionItemAccess().getSubsectionSubsectionFieldParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_subsection_0_0=ruleSubsectionField();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getSubsectionContextSubsectionItemRule());
            				}
            				set(
            					current,
            					"subsection",
            					lv_subsection_0_0,
            					"com.robenglander.libretto.spec.LibrettoSpec.SubsectionField");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleSubsectionContextSubsectionItem"


    // $ANTLR start "entryRuleSubsectionContextTextItem"
    // InternalLibrettoSpec.g:2552:1: entryRuleSubsectionContextTextItem returns [EObject current=null] : iv_ruleSubsectionContextTextItem= ruleSubsectionContextTextItem EOF ;
    public final EObject entryRuleSubsectionContextTextItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubsectionContextTextItem = null;


        try {
            // InternalLibrettoSpec.g:2552:66: (iv_ruleSubsectionContextTextItem= ruleSubsectionContextTextItem EOF )
            // InternalLibrettoSpec.g:2553:2: iv_ruleSubsectionContextTextItem= ruleSubsectionContextTextItem EOF
            {
             newCompositeNode(grammarAccess.getSubsectionContextTextItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubsectionContextTextItem=ruleSubsectionContextTextItem();

            state._fsp--;

             current =iv_ruleSubsectionContextTextItem; 
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
    // $ANTLR end "entryRuleSubsectionContextTextItem"


    // $ANTLR start "ruleSubsectionContextTextItem"
    // InternalLibrettoSpec.g:2559:1: ruleSubsectionContextTextItem returns [EObject current=null] : ( (lv_text_0_0= ruleTextField ) ) ;
    public final EObject ruleSubsectionContextTextItem() throws RecognitionException {
        EObject current = null;

        EObject lv_text_0_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:2565:2: ( ( (lv_text_0_0= ruleTextField ) ) )
            // InternalLibrettoSpec.g:2566:2: ( (lv_text_0_0= ruleTextField ) )
            {
            // InternalLibrettoSpec.g:2566:2: ( (lv_text_0_0= ruleTextField ) )
            // InternalLibrettoSpec.g:2567:3: (lv_text_0_0= ruleTextField )
            {
            // InternalLibrettoSpec.g:2567:3: (lv_text_0_0= ruleTextField )
            // InternalLibrettoSpec.g:2568:4: lv_text_0_0= ruleTextField
            {

            				newCompositeNode(grammarAccess.getSubsectionContextTextItemAccess().getTextTextFieldParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_text_0_0=ruleTextField();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getSubsectionContextTextItemRule());
            				}
            				set(
            					current,
            					"text",
            					lv_text_0_0,
            					"com.robenglander.libretto.spec.LibrettoSpec.TextField");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleSubsectionContextTextItem"


    // $ANTLR start "entryRuleOutOfScopeRecord"
    // InternalLibrettoSpec.g:2588:1: entryRuleOutOfScopeRecord returns [EObject current=null] : iv_ruleOutOfScopeRecord= ruleOutOfScopeRecord EOF ;
    public final EObject entryRuleOutOfScopeRecord() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutOfScopeRecord = null;


        try {
            // InternalLibrettoSpec.g:2588:57: (iv_ruleOutOfScopeRecord= ruleOutOfScopeRecord EOF )
            // InternalLibrettoSpec.g:2589:2: iv_ruleOutOfScopeRecord= ruleOutOfScopeRecord EOF
            {
             newCompositeNode(grammarAccess.getOutOfScopeRecordRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutOfScopeRecord=ruleOutOfScopeRecord();

            state._fsp--;

             current =iv_ruleOutOfScopeRecord; 
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
    // $ANTLR end "entryRuleOutOfScopeRecord"


    // $ANTLR start "ruleOutOfScopeRecord"
    // InternalLibrettoSpec.g:2595:1: ruleOutOfScopeRecord returns [EObject current=null] : (otherlv_0= 'out_of_scope_item' ( (lv_id_1_0= ruleOosId ) ) otherlv_2= '{' ( (lv_items_3_0= ruleOutOfScopeRecordItem ) )* otherlv_4= '}' ) ;
    public final EObject ruleOutOfScopeRecord() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_id_1_0 = null;

        EObject lv_items_3_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:2601:2: ( (otherlv_0= 'out_of_scope_item' ( (lv_id_1_0= ruleOosId ) ) otherlv_2= '{' ( (lv_items_3_0= ruleOutOfScopeRecordItem ) )* otherlv_4= '}' ) )
            // InternalLibrettoSpec.g:2602:2: (otherlv_0= 'out_of_scope_item' ( (lv_id_1_0= ruleOosId ) ) otherlv_2= '{' ( (lv_items_3_0= ruleOutOfScopeRecordItem ) )* otherlv_4= '}' )
            {
            // InternalLibrettoSpec.g:2602:2: (otherlv_0= 'out_of_scope_item' ( (lv_id_1_0= ruleOosId ) ) otherlv_2= '{' ( (lv_items_3_0= ruleOutOfScopeRecordItem ) )* otherlv_4= '}' )
            // InternalLibrettoSpec.g:2603:3: otherlv_0= 'out_of_scope_item' ( (lv_id_1_0= ruleOosId ) ) otherlv_2= '{' ( (lv_items_3_0= ruleOutOfScopeRecordItem ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getOutOfScopeRecordAccess().getOut_of_scope_itemKeyword_0());
            		
            // InternalLibrettoSpec.g:2607:3: ( (lv_id_1_0= ruleOosId ) )
            // InternalLibrettoSpec.g:2608:4: (lv_id_1_0= ruleOosId )
            {
            // InternalLibrettoSpec.g:2608:4: (lv_id_1_0= ruleOosId )
            // InternalLibrettoSpec.g:2609:5: lv_id_1_0= ruleOosId
            {

            					newCompositeNode(grammarAccess.getOutOfScopeRecordAccess().getIdOosIdParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_id_1_0=ruleOosId();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOutOfScopeRecordRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_1_0,
            						"com.robenglander.libretto.spec.LibrettoSpec.OosId");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getOutOfScopeRecordAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLibrettoSpec.g:2630:3: ( (lv_items_3_0= ruleOutOfScopeRecordItem ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==52) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalLibrettoSpec.g:2631:4: (lv_items_3_0= ruleOutOfScopeRecordItem )
            	    {
            	    // InternalLibrettoSpec.g:2631:4: (lv_items_3_0= ruleOutOfScopeRecordItem )
            	    // InternalLibrettoSpec.g:2632:5: lv_items_3_0= ruleOutOfScopeRecordItem
            	    {

            	    					newCompositeNode(grammarAccess.getOutOfScopeRecordAccess().getItemsOutOfScopeRecordItemParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_26);
            	    lv_items_3_0=ruleOutOfScopeRecordItem();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getOutOfScopeRecordRule());
            	    					}
            	    					add(
            	    						current,
            	    						"items",
            	    						lv_items_3_0,
            	    						"com.robenglander.libretto.spec.LibrettoSpec.OutOfScopeRecordItem");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getOutOfScopeRecordAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleOutOfScopeRecord"


    // $ANTLR start "entryRuleOutOfScopeRecordItem"
    // InternalLibrettoSpec.g:2657:1: entryRuleOutOfScopeRecordItem returns [EObject current=null] : iv_ruleOutOfScopeRecordItem= ruleOutOfScopeRecordItem EOF ;
    public final EObject entryRuleOutOfScopeRecordItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutOfScopeRecordItem = null;


        try {
            // InternalLibrettoSpec.g:2657:61: (iv_ruleOutOfScopeRecordItem= ruleOutOfScopeRecordItem EOF )
            // InternalLibrettoSpec.g:2658:2: iv_ruleOutOfScopeRecordItem= ruleOutOfScopeRecordItem EOF
            {
             newCompositeNode(grammarAccess.getOutOfScopeRecordItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutOfScopeRecordItem=ruleOutOfScopeRecordItem();

            state._fsp--;

             current =iv_ruleOutOfScopeRecordItem; 
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
    // $ANTLR end "entryRuleOutOfScopeRecordItem"


    // $ANTLR start "ruleOutOfScopeRecordItem"
    // InternalLibrettoSpec.g:2664:1: ruleOutOfScopeRecordItem returns [EObject current=null] : this_OutOfScopeStatementItem_0= ruleOutOfScopeStatementItem ;
    public final EObject ruleOutOfScopeRecordItem() throws RecognitionException {
        EObject current = null;

        EObject this_OutOfScopeStatementItem_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:2670:2: (this_OutOfScopeStatementItem_0= ruleOutOfScopeStatementItem )
            // InternalLibrettoSpec.g:2671:2: this_OutOfScopeStatementItem_0= ruleOutOfScopeStatementItem
            {

            		newCompositeNode(grammarAccess.getOutOfScopeRecordItemAccess().getOutOfScopeStatementItemParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_OutOfScopeStatementItem_0=ruleOutOfScopeStatementItem();

            state._fsp--;


            		current = this_OutOfScopeStatementItem_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleOutOfScopeRecordItem"


    // $ANTLR start "entryRuleOutOfScopeStatementItem"
    // InternalLibrettoSpec.g:2682:1: entryRuleOutOfScopeStatementItem returns [EObject current=null] : iv_ruleOutOfScopeStatementItem= ruleOutOfScopeStatementItem EOF ;
    public final EObject entryRuleOutOfScopeStatementItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutOfScopeStatementItem = null;


        try {
            // InternalLibrettoSpec.g:2682:64: (iv_ruleOutOfScopeStatementItem= ruleOutOfScopeStatementItem EOF )
            // InternalLibrettoSpec.g:2683:2: iv_ruleOutOfScopeStatementItem= ruleOutOfScopeStatementItem EOF
            {
             newCompositeNode(grammarAccess.getOutOfScopeStatementItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutOfScopeStatementItem=ruleOutOfScopeStatementItem();

            state._fsp--;

             current =iv_ruleOutOfScopeStatementItem; 
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
    // $ANTLR end "entryRuleOutOfScopeStatementItem"


    // $ANTLR start "ruleOutOfScopeStatementItem"
    // InternalLibrettoSpec.g:2689:1: ruleOutOfScopeStatementItem returns [EObject current=null] : ( (lv_statement_0_0= ruleStatementField ) ) ;
    public final EObject ruleOutOfScopeStatementItem() throws RecognitionException {
        EObject current = null;

        EObject lv_statement_0_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:2695:2: ( ( (lv_statement_0_0= ruleStatementField ) ) )
            // InternalLibrettoSpec.g:2696:2: ( (lv_statement_0_0= ruleStatementField ) )
            {
            // InternalLibrettoSpec.g:2696:2: ( (lv_statement_0_0= ruleStatementField ) )
            // InternalLibrettoSpec.g:2697:3: (lv_statement_0_0= ruleStatementField )
            {
            // InternalLibrettoSpec.g:2697:3: (lv_statement_0_0= ruleStatementField )
            // InternalLibrettoSpec.g:2698:4: lv_statement_0_0= ruleStatementField
            {

            				newCompositeNode(grammarAccess.getOutOfScopeStatementItemAccess().getStatementStatementFieldParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_statement_0_0=ruleStatementField();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getOutOfScopeStatementItemRule());
            				}
            				set(
            					current,
            					"statement",
            					lv_statement_0_0,
            					"com.robenglander.libretto.spec.LibrettoSpec.StatementField");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleOutOfScopeStatementItem"


    // $ANTLR start "entryRuleStatementField"
    // InternalLibrettoSpec.g:2718:1: entryRuleStatementField returns [EObject current=null] : iv_ruleStatementField= ruleStatementField EOF ;
    public final EObject entryRuleStatementField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatementField = null;


        try {
            // InternalLibrettoSpec.g:2718:55: (iv_ruleStatementField= ruleStatementField EOF )
            // InternalLibrettoSpec.g:2719:2: iv_ruleStatementField= ruleStatementField EOF
            {
             newCompositeNode(grammarAccess.getStatementFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatementField=ruleStatementField();

            state._fsp--;

             current =iv_ruleStatementField; 
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
    // $ANTLR end "entryRuleStatementField"


    // $ANTLR start "ruleStatementField"
    // InternalLibrettoSpec.g:2725:1: ruleStatementField returns [EObject current=null] : (otherlv_0= 'statement' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) ) ;
    public final EObject ruleStatementField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:2731:2: ( (otherlv_0= 'statement' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) ) )
            // InternalLibrettoSpec.g:2732:2: (otherlv_0= 'statement' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) )
            {
            // InternalLibrettoSpec.g:2732:2: (otherlv_0= 'statement' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) )
            // InternalLibrettoSpec.g:2733:3: otherlv_0= 'statement' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) )
            {
            otherlv_0=(Token)match(input,52,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getStatementFieldAccess().getStatementKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getStatementFieldAccess().getColonKeyword_1());
            		
            // InternalLibrettoSpec.g:2741:3: ( (lv_value_2_0= ruleTextValue ) )
            // InternalLibrettoSpec.g:2742:4: (lv_value_2_0= ruleTextValue )
            {
            // InternalLibrettoSpec.g:2742:4: (lv_value_2_0= ruleTextValue )
            // InternalLibrettoSpec.g:2743:5: lv_value_2_0= ruleTextValue
            {

            					newCompositeNode(grammarAccess.getStatementFieldAccess().getValueTextValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleTextValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStatementFieldRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"com.robenglander.libretto.spec.LibrettoSpec.TextValue");
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
    // $ANTLR end "ruleStatementField"


    // $ANTLR start "entryRuleBehaviorRecord"
    // InternalLibrettoSpec.g:2764:1: entryRuleBehaviorRecord returns [EObject current=null] : iv_ruleBehaviorRecord= ruleBehaviorRecord EOF ;
    public final EObject entryRuleBehaviorRecord() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviorRecord = null;


        try {
            // InternalLibrettoSpec.g:2764:55: (iv_ruleBehaviorRecord= ruleBehaviorRecord EOF )
            // InternalLibrettoSpec.g:2765:2: iv_ruleBehaviorRecord= ruleBehaviorRecord EOF
            {
             newCompositeNode(grammarAccess.getBehaviorRecordRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBehaviorRecord=ruleBehaviorRecord();

            state._fsp--;

             current =iv_ruleBehaviorRecord; 
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
    // $ANTLR end "entryRuleBehaviorRecord"


    // $ANTLR start "ruleBehaviorRecord"
    // InternalLibrettoSpec.g:2771:1: ruleBehaviorRecord returns [EObject current=null] : (otherlv_0= 'behavior' ( (lv_id_1_0= ruleBehaviorId ) ) otherlv_2= '{' ( (lv_items_3_0= ruleBehaviorRecordItem ) )* otherlv_4= '}' ) ;
    public final EObject ruleBehaviorRecord() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_id_1_0 = null;

        EObject lv_items_3_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:2777:2: ( (otherlv_0= 'behavior' ( (lv_id_1_0= ruleBehaviorId ) ) otherlv_2= '{' ( (lv_items_3_0= ruleBehaviorRecordItem ) )* otherlv_4= '}' ) )
            // InternalLibrettoSpec.g:2778:2: (otherlv_0= 'behavior' ( (lv_id_1_0= ruleBehaviorId ) ) otherlv_2= '{' ( (lv_items_3_0= ruleBehaviorRecordItem ) )* otherlv_4= '}' )
            {
            // InternalLibrettoSpec.g:2778:2: (otherlv_0= 'behavior' ( (lv_id_1_0= ruleBehaviorId ) ) otherlv_2= '{' ( (lv_items_3_0= ruleBehaviorRecordItem ) )* otherlv_4= '}' )
            // InternalLibrettoSpec.g:2779:3: otherlv_0= 'behavior' ( (lv_id_1_0= ruleBehaviorId ) ) otherlv_2= '{' ( (lv_items_3_0= ruleBehaviorRecordItem ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getBehaviorRecordAccess().getBehaviorKeyword_0());
            		
            // InternalLibrettoSpec.g:2783:3: ( (lv_id_1_0= ruleBehaviorId ) )
            // InternalLibrettoSpec.g:2784:4: (lv_id_1_0= ruleBehaviorId )
            {
            // InternalLibrettoSpec.g:2784:4: (lv_id_1_0= ruleBehaviorId )
            // InternalLibrettoSpec.g:2785:5: lv_id_1_0= ruleBehaviorId
            {

            					newCompositeNode(grammarAccess.getBehaviorRecordAccess().getIdBehaviorIdParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_id_1_0=ruleBehaviorId();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBehaviorRecordRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_1_0,
            						"com.robenglander.libretto.spec.LibrettoSpec.BehaviorId");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_28); 

            			newLeafNode(otherlv_2, grammarAccess.getBehaviorRecordAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLibrettoSpec.g:2806:3: ( (lv_items_3_0= ruleBehaviorRecordItem ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==22||LA26_0==41||(LA26_0>=54 && LA26_0<=63)||LA26_0==86) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalLibrettoSpec.g:2807:4: (lv_items_3_0= ruleBehaviorRecordItem )
            	    {
            	    // InternalLibrettoSpec.g:2807:4: (lv_items_3_0= ruleBehaviorRecordItem )
            	    // InternalLibrettoSpec.g:2808:5: lv_items_3_0= ruleBehaviorRecordItem
            	    {

            	    					newCompositeNode(grammarAccess.getBehaviorRecordAccess().getItemsBehaviorRecordItemParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_28);
            	    lv_items_3_0=ruleBehaviorRecordItem();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBehaviorRecordRule());
            	    					}
            	    					add(
            	    						current,
            	    						"items",
            	    						lv_items_3_0,
            	    						"com.robenglander.libretto.spec.LibrettoSpec.BehaviorRecordItem");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getBehaviorRecordAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleBehaviorRecord"


    // $ANTLR start "entryRuleBehaviorRecordItem"
    // InternalLibrettoSpec.g:2833:1: entryRuleBehaviorRecordItem returns [EObject current=null] : iv_ruleBehaviorRecordItem= ruleBehaviorRecordItem EOF ;
    public final EObject entryRuleBehaviorRecordItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviorRecordItem = null;


        try {
            // InternalLibrettoSpec.g:2833:59: (iv_ruleBehaviorRecordItem= ruleBehaviorRecordItem EOF )
            // InternalLibrettoSpec.g:2834:2: iv_ruleBehaviorRecordItem= ruleBehaviorRecordItem EOF
            {
             newCompositeNode(grammarAccess.getBehaviorRecordItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBehaviorRecordItem=ruleBehaviorRecordItem();

            state._fsp--;

             current =iv_ruleBehaviorRecordItem; 
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
    // $ANTLR end "entryRuleBehaviorRecordItem"


    // $ANTLR start "ruleBehaviorRecordItem"
    // InternalLibrettoSpec.g:2840:1: ruleBehaviorRecordItem returns [EObject current=null] : (this_BehaviorSourceItem_0= ruleBehaviorSourceItem | this_BehaviorActorItem_1= ruleBehaviorActorItem | this_BehaviorActionItem_2= ruleBehaviorActionItem | this_BehaviorObjectsItem_3= ruleBehaviorObjectsItem | this_BehaviorReadsItem_4= ruleBehaviorReadsItem | this_BehaviorWritesItem_5= ruleBehaviorWritesItem | this_BehaviorConditionsItem_6= ruleBehaviorConditionsItem | this_BehaviorOutcomesItem_7= ruleBehaviorOutcomesItem | this_BehaviorLabelItem_8= ruleBehaviorLabelItem | this_BehaviorReferencesItem_9= ruleBehaviorReferencesItem | this_BehaviorNotesItem_10= ruleBehaviorNotesItem | this_BehaviorContextItem_11= ruleBehaviorContextItem | this_BehaviorDependenciesItem_12= ruleBehaviorDependenciesItem ) ;
    public final EObject ruleBehaviorRecordItem() throws RecognitionException {
        EObject current = null;

        EObject this_BehaviorSourceItem_0 = null;

        EObject this_BehaviorActorItem_1 = null;

        EObject this_BehaviorActionItem_2 = null;

        EObject this_BehaviorObjectsItem_3 = null;

        EObject this_BehaviorReadsItem_4 = null;

        EObject this_BehaviorWritesItem_5 = null;

        EObject this_BehaviorConditionsItem_6 = null;

        EObject this_BehaviorOutcomesItem_7 = null;

        EObject this_BehaviorLabelItem_8 = null;

        EObject this_BehaviorReferencesItem_9 = null;

        EObject this_BehaviorNotesItem_10 = null;

        EObject this_BehaviorContextItem_11 = null;

        EObject this_BehaviorDependenciesItem_12 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:2846:2: ( (this_BehaviorSourceItem_0= ruleBehaviorSourceItem | this_BehaviorActorItem_1= ruleBehaviorActorItem | this_BehaviorActionItem_2= ruleBehaviorActionItem | this_BehaviorObjectsItem_3= ruleBehaviorObjectsItem | this_BehaviorReadsItem_4= ruleBehaviorReadsItem | this_BehaviorWritesItem_5= ruleBehaviorWritesItem | this_BehaviorConditionsItem_6= ruleBehaviorConditionsItem | this_BehaviorOutcomesItem_7= ruleBehaviorOutcomesItem | this_BehaviorLabelItem_8= ruleBehaviorLabelItem | this_BehaviorReferencesItem_9= ruleBehaviorReferencesItem | this_BehaviorNotesItem_10= ruleBehaviorNotesItem | this_BehaviorContextItem_11= ruleBehaviorContextItem | this_BehaviorDependenciesItem_12= ruleBehaviorDependenciesItem ) )
            // InternalLibrettoSpec.g:2847:2: (this_BehaviorSourceItem_0= ruleBehaviorSourceItem | this_BehaviorActorItem_1= ruleBehaviorActorItem | this_BehaviorActionItem_2= ruleBehaviorActionItem | this_BehaviorObjectsItem_3= ruleBehaviorObjectsItem | this_BehaviorReadsItem_4= ruleBehaviorReadsItem | this_BehaviorWritesItem_5= ruleBehaviorWritesItem | this_BehaviorConditionsItem_6= ruleBehaviorConditionsItem | this_BehaviorOutcomesItem_7= ruleBehaviorOutcomesItem | this_BehaviorLabelItem_8= ruleBehaviorLabelItem | this_BehaviorReferencesItem_9= ruleBehaviorReferencesItem | this_BehaviorNotesItem_10= ruleBehaviorNotesItem | this_BehaviorContextItem_11= ruleBehaviorContextItem | this_BehaviorDependenciesItem_12= ruleBehaviorDependenciesItem )
            {
            // InternalLibrettoSpec.g:2847:2: (this_BehaviorSourceItem_0= ruleBehaviorSourceItem | this_BehaviorActorItem_1= ruleBehaviorActorItem | this_BehaviorActionItem_2= ruleBehaviorActionItem | this_BehaviorObjectsItem_3= ruleBehaviorObjectsItem | this_BehaviorReadsItem_4= ruleBehaviorReadsItem | this_BehaviorWritesItem_5= ruleBehaviorWritesItem | this_BehaviorConditionsItem_6= ruleBehaviorConditionsItem | this_BehaviorOutcomesItem_7= ruleBehaviorOutcomesItem | this_BehaviorLabelItem_8= ruleBehaviorLabelItem | this_BehaviorReferencesItem_9= ruleBehaviorReferencesItem | this_BehaviorNotesItem_10= ruleBehaviorNotesItem | this_BehaviorContextItem_11= ruleBehaviorContextItem | this_BehaviorDependenciesItem_12= ruleBehaviorDependenciesItem )
            int alt27=13;
            switch ( input.LA(1) ) {
            case 86:
                {
                alt27=1;
                }
                break;
            case 54:
                {
                alt27=2;
                }
                break;
            case 55:
                {
                alt27=3;
                }
                break;
            case 56:
                {
                alt27=4;
                }
                break;
            case 57:
                {
                alt27=5;
                }
                break;
            case 58:
                {
                alt27=6;
                }
                break;
            case 59:
                {
                alt27=7;
                }
                break;
            case 60:
                {
                alt27=8;
                }
                break;
            case 61:
                {
                alt27=9;
                }
                break;
            case 22:
                {
                alt27=10;
                }
                break;
            case 62:
                {
                alt27=11;
                }
                break;
            case 63:
                {
                alt27=12;
                }
                break;
            case 41:
                {
                alt27=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalLibrettoSpec.g:2848:3: this_BehaviorSourceItem_0= ruleBehaviorSourceItem
                    {

                    			newCompositeNode(grammarAccess.getBehaviorRecordItemAccess().getBehaviorSourceItemParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BehaviorSourceItem_0=ruleBehaviorSourceItem();

                    state._fsp--;


                    			current = this_BehaviorSourceItem_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalLibrettoSpec.g:2857:3: this_BehaviorActorItem_1= ruleBehaviorActorItem
                    {

                    			newCompositeNode(grammarAccess.getBehaviorRecordItemAccess().getBehaviorActorItemParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_BehaviorActorItem_1=ruleBehaviorActorItem();

                    state._fsp--;


                    			current = this_BehaviorActorItem_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalLibrettoSpec.g:2866:3: this_BehaviorActionItem_2= ruleBehaviorActionItem
                    {

                    			newCompositeNode(grammarAccess.getBehaviorRecordItemAccess().getBehaviorActionItemParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_BehaviorActionItem_2=ruleBehaviorActionItem();

                    state._fsp--;


                    			current = this_BehaviorActionItem_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalLibrettoSpec.g:2875:3: this_BehaviorObjectsItem_3= ruleBehaviorObjectsItem
                    {

                    			newCompositeNode(grammarAccess.getBehaviorRecordItemAccess().getBehaviorObjectsItemParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_BehaviorObjectsItem_3=ruleBehaviorObjectsItem();

                    state._fsp--;


                    			current = this_BehaviorObjectsItem_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalLibrettoSpec.g:2884:3: this_BehaviorReadsItem_4= ruleBehaviorReadsItem
                    {

                    			newCompositeNode(grammarAccess.getBehaviorRecordItemAccess().getBehaviorReadsItemParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_BehaviorReadsItem_4=ruleBehaviorReadsItem();

                    state._fsp--;


                    			current = this_BehaviorReadsItem_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalLibrettoSpec.g:2893:3: this_BehaviorWritesItem_5= ruleBehaviorWritesItem
                    {

                    			newCompositeNode(grammarAccess.getBehaviorRecordItemAccess().getBehaviorWritesItemParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_BehaviorWritesItem_5=ruleBehaviorWritesItem();

                    state._fsp--;


                    			current = this_BehaviorWritesItem_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalLibrettoSpec.g:2902:3: this_BehaviorConditionsItem_6= ruleBehaviorConditionsItem
                    {

                    			newCompositeNode(grammarAccess.getBehaviorRecordItemAccess().getBehaviorConditionsItemParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_BehaviorConditionsItem_6=ruleBehaviorConditionsItem();

                    state._fsp--;


                    			current = this_BehaviorConditionsItem_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalLibrettoSpec.g:2911:3: this_BehaviorOutcomesItem_7= ruleBehaviorOutcomesItem
                    {

                    			newCompositeNode(grammarAccess.getBehaviorRecordItemAccess().getBehaviorOutcomesItemParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_BehaviorOutcomesItem_7=ruleBehaviorOutcomesItem();

                    state._fsp--;


                    			current = this_BehaviorOutcomesItem_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalLibrettoSpec.g:2920:3: this_BehaviorLabelItem_8= ruleBehaviorLabelItem
                    {

                    			newCompositeNode(grammarAccess.getBehaviorRecordItemAccess().getBehaviorLabelItemParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_BehaviorLabelItem_8=ruleBehaviorLabelItem();

                    state._fsp--;


                    			current = this_BehaviorLabelItem_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalLibrettoSpec.g:2929:3: this_BehaviorReferencesItem_9= ruleBehaviorReferencesItem
                    {

                    			newCompositeNode(grammarAccess.getBehaviorRecordItemAccess().getBehaviorReferencesItemParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_BehaviorReferencesItem_9=ruleBehaviorReferencesItem();

                    state._fsp--;


                    			current = this_BehaviorReferencesItem_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalLibrettoSpec.g:2938:3: this_BehaviorNotesItem_10= ruleBehaviorNotesItem
                    {

                    			newCompositeNode(grammarAccess.getBehaviorRecordItemAccess().getBehaviorNotesItemParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_BehaviorNotesItem_10=ruleBehaviorNotesItem();

                    state._fsp--;


                    			current = this_BehaviorNotesItem_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalLibrettoSpec.g:2947:3: this_BehaviorContextItem_11= ruleBehaviorContextItem
                    {

                    			newCompositeNode(grammarAccess.getBehaviorRecordItemAccess().getBehaviorContextItemParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_BehaviorContextItem_11=ruleBehaviorContextItem();

                    state._fsp--;


                    			current = this_BehaviorContextItem_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalLibrettoSpec.g:2956:3: this_BehaviorDependenciesItem_12= ruleBehaviorDependenciesItem
                    {

                    			newCompositeNode(grammarAccess.getBehaviorRecordItemAccess().getBehaviorDependenciesItemParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_BehaviorDependenciesItem_12=ruleBehaviorDependenciesItem();

                    state._fsp--;


                    			current = this_BehaviorDependenciesItem_12;
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
    // $ANTLR end "ruleBehaviorRecordItem"


    // $ANTLR start "entryRuleBehaviorSourceItem"
    // InternalLibrettoSpec.g:2968:1: entryRuleBehaviorSourceItem returns [EObject current=null] : iv_ruleBehaviorSourceItem= ruleBehaviorSourceItem EOF ;
    public final EObject entryRuleBehaviorSourceItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviorSourceItem = null;


        try {
            // InternalLibrettoSpec.g:2968:59: (iv_ruleBehaviorSourceItem= ruleBehaviorSourceItem EOF )
            // InternalLibrettoSpec.g:2969:2: iv_ruleBehaviorSourceItem= ruleBehaviorSourceItem EOF
            {
             newCompositeNode(grammarAccess.getBehaviorSourceItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBehaviorSourceItem=ruleBehaviorSourceItem();

            state._fsp--;

             current =iv_ruleBehaviorSourceItem; 
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
    // $ANTLR end "entryRuleBehaviorSourceItem"


    // $ANTLR start "ruleBehaviorSourceItem"
    // InternalLibrettoSpec.g:2975:1: ruleBehaviorSourceItem returns [EObject current=null] : ( (lv_source_0_0= ruleSourceBlock ) ) ;
    public final EObject ruleBehaviorSourceItem() throws RecognitionException {
        EObject current = null;

        EObject lv_source_0_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:2981:2: ( ( (lv_source_0_0= ruleSourceBlock ) ) )
            // InternalLibrettoSpec.g:2982:2: ( (lv_source_0_0= ruleSourceBlock ) )
            {
            // InternalLibrettoSpec.g:2982:2: ( (lv_source_0_0= ruleSourceBlock ) )
            // InternalLibrettoSpec.g:2983:3: (lv_source_0_0= ruleSourceBlock )
            {
            // InternalLibrettoSpec.g:2983:3: (lv_source_0_0= ruleSourceBlock )
            // InternalLibrettoSpec.g:2984:4: lv_source_0_0= ruleSourceBlock
            {

            				newCompositeNode(grammarAccess.getBehaviorSourceItemAccess().getSourceSourceBlockParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_source_0_0=ruleSourceBlock();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getBehaviorSourceItemRule());
            				}
            				set(
            					current,
            					"source",
            					lv_source_0_0,
            					"com.robenglander.libretto.spec.LibrettoSpec.SourceBlock");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleBehaviorSourceItem"


    // $ANTLR start "entryRuleBehaviorActorItem"
    // InternalLibrettoSpec.g:3004:1: entryRuleBehaviorActorItem returns [EObject current=null] : iv_ruleBehaviorActorItem= ruleBehaviorActorItem EOF ;
    public final EObject entryRuleBehaviorActorItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviorActorItem = null;


        try {
            // InternalLibrettoSpec.g:3004:58: (iv_ruleBehaviorActorItem= ruleBehaviorActorItem EOF )
            // InternalLibrettoSpec.g:3005:2: iv_ruleBehaviorActorItem= ruleBehaviorActorItem EOF
            {
             newCompositeNode(grammarAccess.getBehaviorActorItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBehaviorActorItem=ruleBehaviorActorItem();

            state._fsp--;

             current =iv_ruleBehaviorActorItem; 
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
    // $ANTLR end "entryRuleBehaviorActorItem"


    // $ANTLR start "ruleBehaviorActorItem"
    // InternalLibrettoSpec.g:3011:1: ruleBehaviorActorItem returns [EObject current=null] : ( (lv_actor_0_0= ruleActorField ) ) ;
    public final EObject ruleBehaviorActorItem() throws RecognitionException {
        EObject current = null;

        EObject lv_actor_0_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:3017:2: ( ( (lv_actor_0_0= ruleActorField ) ) )
            // InternalLibrettoSpec.g:3018:2: ( (lv_actor_0_0= ruleActorField ) )
            {
            // InternalLibrettoSpec.g:3018:2: ( (lv_actor_0_0= ruleActorField ) )
            // InternalLibrettoSpec.g:3019:3: (lv_actor_0_0= ruleActorField )
            {
            // InternalLibrettoSpec.g:3019:3: (lv_actor_0_0= ruleActorField )
            // InternalLibrettoSpec.g:3020:4: lv_actor_0_0= ruleActorField
            {

            				newCompositeNode(grammarAccess.getBehaviorActorItemAccess().getActorActorFieldParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_actor_0_0=ruleActorField();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getBehaviorActorItemRule());
            				}
            				set(
            					current,
            					"actor",
            					lv_actor_0_0,
            					"com.robenglander.libretto.spec.LibrettoSpec.ActorField");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleBehaviorActorItem"


    // $ANTLR start "entryRuleBehaviorActionItem"
    // InternalLibrettoSpec.g:3040:1: entryRuleBehaviorActionItem returns [EObject current=null] : iv_ruleBehaviorActionItem= ruleBehaviorActionItem EOF ;
    public final EObject entryRuleBehaviorActionItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviorActionItem = null;


        try {
            // InternalLibrettoSpec.g:3040:59: (iv_ruleBehaviorActionItem= ruleBehaviorActionItem EOF )
            // InternalLibrettoSpec.g:3041:2: iv_ruleBehaviorActionItem= ruleBehaviorActionItem EOF
            {
             newCompositeNode(grammarAccess.getBehaviorActionItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBehaviorActionItem=ruleBehaviorActionItem();

            state._fsp--;

             current =iv_ruleBehaviorActionItem; 
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
    // $ANTLR end "entryRuleBehaviorActionItem"


    // $ANTLR start "ruleBehaviorActionItem"
    // InternalLibrettoSpec.g:3047:1: ruleBehaviorActionItem returns [EObject current=null] : ( (lv_action_0_0= ruleActionField ) ) ;
    public final EObject ruleBehaviorActionItem() throws RecognitionException {
        EObject current = null;

        EObject lv_action_0_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:3053:2: ( ( (lv_action_0_0= ruleActionField ) ) )
            // InternalLibrettoSpec.g:3054:2: ( (lv_action_0_0= ruleActionField ) )
            {
            // InternalLibrettoSpec.g:3054:2: ( (lv_action_0_0= ruleActionField ) )
            // InternalLibrettoSpec.g:3055:3: (lv_action_0_0= ruleActionField )
            {
            // InternalLibrettoSpec.g:3055:3: (lv_action_0_0= ruleActionField )
            // InternalLibrettoSpec.g:3056:4: lv_action_0_0= ruleActionField
            {

            				newCompositeNode(grammarAccess.getBehaviorActionItemAccess().getActionActionFieldParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_action_0_0=ruleActionField();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getBehaviorActionItemRule());
            				}
            				set(
            					current,
            					"action",
            					lv_action_0_0,
            					"com.robenglander.libretto.spec.LibrettoSpec.ActionField");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleBehaviorActionItem"


    // $ANTLR start "entryRuleBehaviorObjectsItem"
    // InternalLibrettoSpec.g:3076:1: entryRuleBehaviorObjectsItem returns [EObject current=null] : iv_ruleBehaviorObjectsItem= ruleBehaviorObjectsItem EOF ;
    public final EObject entryRuleBehaviorObjectsItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviorObjectsItem = null;


        try {
            // InternalLibrettoSpec.g:3076:60: (iv_ruleBehaviorObjectsItem= ruleBehaviorObjectsItem EOF )
            // InternalLibrettoSpec.g:3077:2: iv_ruleBehaviorObjectsItem= ruleBehaviorObjectsItem EOF
            {
             newCompositeNode(grammarAccess.getBehaviorObjectsItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBehaviorObjectsItem=ruleBehaviorObjectsItem();

            state._fsp--;

             current =iv_ruleBehaviorObjectsItem; 
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
    // $ANTLR end "entryRuleBehaviorObjectsItem"


    // $ANTLR start "ruleBehaviorObjectsItem"
    // InternalLibrettoSpec.g:3083:1: ruleBehaviorObjectsItem returns [EObject current=null] : ( (lv_objects_0_0= ruleObjectsField ) ) ;
    public final EObject ruleBehaviorObjectsItem() throws RecognitionException {
        EObject current = null;

        EObject lv_objects_0_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:3089:2: ( ( (lv_objects_0_0= ruleObjectsField ) ) )
            // InternalLibrettoSpec.g:3090:2: ( (lv_objects_0_0= ruleObjectsField ) )
            {
            // InternalLibrettoSpec.g:3090:2: ( (lv_objects_0_0= ruleObjectsField ) )
            // InternalLibrettoSpec.g:3091:3: (lv_objects_0_0= ruleObjectsField )
            {
            // InternalLibrettoSpec.g:3091:3: (lv_objects_0_0= ruleObjectsField )
            // InternalLibrettoSpec.g:3092:4: lv_objects_0_0= ruleObjectsField
            {

            				newCompositeNode(grammarAccess.getBehaviorObjectsItemAccess().getObjectsObjectsFieldParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_objects_0_0=ruleObjectsField();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getBehaviorObjectsItemRule());
            				}
            				set(
            					current,
            					"objects",
            					lv_objects_0_0,
            					"com.robenglander.libretto.spec.LibrettoSpec.ObjectsField");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleBehaviorObjectsItem"


    // $ANTLR start "entryRuleBehaviorReadsItem"
    // InternalLibrettoSpec.g:3112:1: entryRuleBehaviorReadsItem returns [EObject current=null] : iv_ruleBehaviorReadsItem= ruleBehaviorReadsItem EOF ;
    public final EObject entryRuleBehaviorReadsItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviorReadsItem = null;


        try {
            // InternalLibrettoSpec.g:3112:58: (iv_ruleBehaviorReadsItem= ruleBehaviorReadsItem EOF )
            // InternalLibrettoSpec.g:3113:2: iv_ruleBehaviorReadsItem= ruleBehaviorReadsItem EOF
            {
             newCompositeNode(grammarAccess.getBehaviorReadsItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBehaviorReadsItem=ruleBehaviorReadsItem();

            state._fsp--;

             current =iv_ruleBehaviorReadsItem; 
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
    // $ANTLR end "entryRuleBehaviorReadsItem"


    // $ANTLR start "ruleBehaviorReadsItem"
    // InternalLibrettoSpec.g:3119:1: ruleBehaviorReadsItem returns [EObject current=null] : ( (lv_reads_0_0= ruleReadsField ) ) ;
    public final EObject ruleBehaviorReadsItem() throws RecognitionException {
        EObject current = null;

        EObject lv_reads_0_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:3125:2: ( ( (lv_reads_0_0= ruleReadsField ) ) )
            // InternalLibrettoSpec.g:3126:2: ( (lv_reads_0_0= ruleReadsField ) )
            {
            // InternalLibrettoSpec.g:3126:2: ( (lv_reads_0_0= ruleReadsField ) )
            // InternalLibrettoSpec.g:3127:3: (lv_reads_0_0= ruleReadsField )
            {
            // InternalLibrettoSpec.g:3127:3: (lv_reads_0_0= ruleReadsField )
            // InternalLibrettoSpec.g:3128:4: lv_reads_0_0= ruleReadsField
            {

            				newCompositeNode(grammarAccess.getBehaviorReadsItemAccess().getReadsReadsFieldParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_reads_0_0=ruleReadsField();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getBehaviorReadsItemRule());
            				}
            				set(
            					current,
            					"reads",
            					lv_reads_0_0,
            					"com.robenglander.libretto.spec.LibrettoSpec.ReadsField");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleBehaviorReadsItem"


    // $ANTLR start "entryRuleBehaviorWritesItem"
    // InternalLibrettoSpec.g:3148:1: entryRuleBehaviorWritesItem returns [EObject current=null] : iv_ruleBehaviorWritesItem= ruleBehaviorWritesItem EOF ;
    public final EObject entryRuleBehaviorWritesItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviorWritesItem = null;


        try {
            // InternalLibrettoSpec.g:3148:59: (iv_ruleBehaviorWritesItem= ruleBehaviorWritesItem EOF )
            // InternalLibrettoSpec.g:3149:2: iv_ruleBehaviorWritesItem= ruleBehaviorWritesItem EOF
            {
             newCompositeNode(grammarAccess.getBehaviorWritesItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBehaviorWritesItem=ruleBehaviorWritesItem();

            state._fsp--;

             current =iv_ruleBehaviorWritesItem; 
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
    // $ANTLR end "entryRuleBehaviorWritesItem"


    // $ANTLR start "ruleBehaviorWritesItem"
    // InternalLibrettoSpec.g:3155:1: ruleBehaviorWritesItem returns [EObject current=null] : ( (lv_writes_0_0= ruleWritesField ) ) ;
    public final EObject ruleBehaviorWritesItem() throws RecognitionException {
        EObject current = null;

        EObject lv_writes_0_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:3161:2: ( ( (lv_writes_0_0= ruleWritesField ) ) )
            // InternalLibrettoSpec.g:3162:2: ( (lv_writes_0_0= ruleWritesField ) )
            {
            // InternalLibrettoSpec.g:3162:2: ( (lv_writes_0_0= ruleWritesField ) )
            // InternalLibrettoSpec.g:3163:3: (lv_writes_0_0= ruleWritesField )
            {
            // InternalLibrettoSpec.g:3163:3: (lv_writes_0_0= ruleWritesField )
            // InternalLibrettoSpec.g:3164:4: lv_writes_0_0= ruleWritesField
            {

            				newCompositeNode(grammarAccess.getBehaviorWritesItemAccess().getWritesWritesFieldParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_writes_0_0=ruleWritesField();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getBehaviorWritesItemRule());
            				}
            				set(
            					current,
            					"writes",
            					lv_writes_0_0,
            					"com.robenglander.libretto.spec.LibrettoSpec.WritesField");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleBehaviorWritesItem"


    // $ANTLR start "entryRuleBehaviorConditionsItem"
    // InternalLibrettoSpec.g:3184:1: entryRuleBehaviorConditionsItem returns [EObject current=null] : iv_ruleBehaviorConditionsItem= ruleBehaviorConditionsItem EOF ;
    public final EObject entryRuleBehaviorConditionsItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviorConditionsItem = null;


        try {
            // InternalLibrettoSpec.g:3184:63: (iv_ruleBehaviorConditionsItem= ruleBehaviorConditionsItem EOF )
            // InternalLibrettoSpec.g:3185:2: iv_ruleBehaviorConditionsItem= ruleBehaviorConditionsItem EOF
            {
             newCompositeNode(grammarAccess.getBehaviorConditionsItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBehaviorConditionsItem=ruleBehaviorConditionsItem();

            state._fsp--;

             current =iv_ruleBehaviorConditionsItem; 
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
    // $ANTLR end "entryRuleBehaviorConditionsItem"


    // $ANTLR start "ruleBehaviorConditionsItem"
    // InternalLibrettoSpec.g:3191:1: ruleBehaviorConditionsItem returns [EObject current=null] : ( (lv_conditions_0_0= ruleConditionsField ) ) ;
    public final EObject ruleBehaviorConditionsItem() throws RecognitionException {
        EObject current = null;

        EObject lv_conditions_0_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:3197:2: ( ( (lv_conditions_0_0= ruleConditionsField ) ) )
            // InternalLibrettoSpec.g:3198:2: ( (lv_conditions_0_0= ruleConditionsField ) )
            {
            // InternalLibrettoSpec.g:3198:2: ( (lv_conditions_0_0= ruleConditionsField ) )
            // InternalLibrettoSpec.g:3199:3: (lv_conditions_0_0= ruleConditionsField )
            {
            // InternalLibrettoSpec.g:3199:3: (lv_conditions_0_0= ruleConditionsField )
            // InternalLibrettoSpec.g:3200:4: lv_conditions_0_0= ruleConditionsField
            {

            				newCompositeNode(grammarAccess.getBehaviorConditionsItemAccess().getConditionsConditionsFieldParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_conditions_0_0=ruleConditionsField();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getBehaviorConditionsItemRule());
            				}
            				set(
            					current,
            					"conditions",
            					lv_conditions_0_0,
            					"com.robenglander.libretto.spec.LibrettoSpec.ConditionsField");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleBehaviorConditionsItem"


    // $ANTLR start "entryRuleBehaviorOutcomesItem"
    // InternalLibrettoSpec.g:3220:1: entryRuleBehaviorOutcomesItem returns [EObject current=null] : iv_ruleBehaviorOutcomesItem= ruleBehaviorOutcomesItem EOF ;
    public final EObject entryRuleBehaviorOutcomesItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviorOutcomesItem = null;


        try {
            // InternalLibrettoSpec.g:3220:61: (iv_ruleBehaviorOutcomesItem= ruleBehaviorOutcomesItem EOF )
            // InternalLibrettoSpec.g:3221:2: iv_ruleBehaviorOutcomesItem= ruleBehaviorOutcomesItem EOF
            {
             newCompositeNode(grammarAccess.getBehaviorOutcomesItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBehaviorOutcomesItem=ruleBehaviorOutcomesItem();

            state._fsp--;

             current =iv_ruleBehaviorOutcomesItem; 
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
    // $ANTLR end "entryRuleBehaviorOutcomesItem"


    // $ANTLR start "ruleBehaviorOutcomesItem"
    // InternalLibrettoSpec.g:3227:1: ruleBehaviorOutcomesItem returns [EObject current=null] : ( (lv_outcomes_0_0= ruleOutcomesField ) ) ;
    public final EObject ruleBehaviorOutcomesItem() throws RecognitionException {
        EObject current = null;

        EObject lv_outcomes_0_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:3233:2: ( ( (lv_outcomes_0_0= ruleOutcomesField ) ) )
            // InternalLibrettoSpec.g:3234:2: ( (lv_outcomes_0_0= ruleOutcomesField ) )
            {
            // InternalLibrettoSpec.g:3234:2: ( (lv_outcomes_0_0= ruleOutcomesField ) )
            // InternalLibrettoSpec.g:3235:3: (lv_outcomes_0_0= ruleOutcomesField )
            {
            // InternalLibrettoSpec.g:3235:3: (lv_outcomes_0_0= ruleOutcomesField )
            // InternalLibrettoSpec.g:3236:4: lv_outcomes_0_0= ruleOutcomesField
            {

            				newCompositeNode(grammarAccess.getBehaviorOutcomesItemAccess().getOutcomesOutcomesFieldParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_outcomes_0_0=ruleOutcomesField();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getBehaviorOutcomesItemRule());
            				}
            				set(
            					current,
            					"outcomes",
            					lv_outcomes_0_0,
            					"com.robenglander.libretto.spec.LibrettoSpec.OutcomesField");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleBehaviorOutcomesItem"


    // $ANTLR start "entryRuleBehaviorLabelItem"
    // InternalLibrettoSpec.g:3256:1: entryRuleBehaviorLabelItem returns [EObject current=null] : iv_ruleBehaviorLabelItem= ruleBehaviorLabelItem EOF ;
    public final EObject entryRuleBehaviorLabelItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviorLabelItem = null;


        try {
            // InternalLibrettoSpec.g:3256:58: (iv_ruleBehaviorLabelItem= ruleBehaviorLabelItem EOF )
            // InternalLibrettoSpec.g:3257:2: iv_ruleBehaviorLabelItem= ruleBehaviorLabelItem EOF
            {
             newCompositeNode(grammarAccess.getBehaviorLabelItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBehaviorLabelItem=ruleBehaviorLabelItem();

            state._fsp--;

             current =iv_ruleBehaviorLabelItem; 
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
    // $ANTLR end "entryRuleBehaviorLabelItem"


    // $ANTLR start "ruleBehaviorLabelItem"
    // InternalLibrettoSpec.g:3263:1: ruleBehaviorLabelItem returns [EObject current=null] : ( (lv_label_0_0= ruleLabelField ) ) ;
    public final EObject ruleBehaviorLabelItem() throws RecognitionException {
        EObject current = null;

        EObject lv_label_0_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:3269:2: ( ( (lv_label_0_0= ruleLabelField ) ) )
            // InternalLibrettoSpec.g:3270:2: ( (lv_label_0_0= ruleLabelField ) )
            {
            // InternalLibrettoSpec.g:3270:2: ( (lv_label_0_0= ruleLabelField ) )
            // InternalLibrettoSpec.g:3271:3: (lv_label_0_0= ruleLabelField )
            {
            // InternalLibrettoSpec.g:3271:3: (lv_label_0_0= ruleLabelField )
            // InternalLibrettoSpec.g:3272:4: lv_label_0_0= ruleLabelField
            {

            				newCompositeNode(grammarAccess.getBehaviorLabelItemAccess().getLabelLabelFieldParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_label_0_0=ruleLabelField();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getBehaviorLabelItemRule());
            				}
            				set(
            					current,
            					"label",
            					lv_label_0_0,
            					"com.robenglander.libretto.spec.LibrettoSpec.LabelField");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleBehaviorLabelItem"


    // $ANTLR start "entryRuleBehaviorReferencesItem"
    // InternalLibrettoSpec.g:3292:1: entryRuleBehaviorReferencesItem returns [EObject current=null] : iv_ruleBehaviorReferencesItem= ruleBehaviorReferencesItem EOF ;
    public final EObject entryRuleBehaviorReferencesItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviorReferencesItem = null;


        try {
            // InternalLibrettoSpec.g:3292:63: (iv_ruleBehaviorReferencesItem= ruleBehaviorReferencesItem EOF )
            // InternalLibrettoSpec.g:3293:2: iv_ruleBehaviorReferencesItem= ruleBehaviorReferencesItem EOF
            {
             newCompositeNode(grammarAccess.getBehaviorReferencesItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBehaviorReferencesItem=ruleBehaviorReferencesItem();

            state._fsp--;

             current =iv_ruleBehaviorReferencesItem; 
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
    // $ANTLR end "entryRuleBehaviorReferencesItem"


    // $ANTLR start "ruleBehaviorReferencesItem"
    // InternalLibrettoSpec.g:3299:1: ruleBehaviorReferencesItem returns [EObject current=null] : ( (lv_references_0_0= ruleReferencesField ) ) ;
    public final EObject ruleBehaviorReferencesItem() throws RecognitionException {
        EObject current = null;

        EObject lv_references_0_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:3305:2: ( ( (lv_references_0_0= ruleReferencesField ) ) )
            // InternalLibrettoSpec.g:3306:2: ( (lv_references_0_0= ruleReferencesField ) )
            {
            // InternalLibrettoSpec.g:3306:2: ( (lv_references_0_0= ruleReferencesField ) )
            // InternalLibrettoSpec.g:3307:3: (lv_references_0_0= ruleReferencesField )
            {
            // InternalLibrettoSpec.g:3307:3: (lv_references_0_0= ruleReferencesField )
            // InternalLibrettoSpec.g:3308:4: lv_references_0_0= ruleReferencesField
            {

            				newCompositeNode(grammarAccess.getBehaviorReferencesItemAccess().getReferencesReferencesFieldParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_references_0_0=ruleReferencesField();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getBehaviorReferencesItemRule());
            				}
            				set(
            					current,
            					"references",
            					lv_references_0_0,
            					"com.robenglander.libretto.spec.LibrettoSpec.ReferencesField");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleBehaviorReferencesItem"


    // $ANTLR start "entryRuleBehaviorNotesItem"
    // InternalLibrettoSpec.g:3328:1: entryRuleBehaviorNotesItem returns [EObject current=null] : iv_ruleBehaviorNotesItem= ruleBehaviorNotesItem EOF ;
    public final EObject entryRuleBehaviorNotesItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviorNotesItem = null;


        try {
            // InternalLibrettoSpec.g:3328:58: (iv_ruleBehaviorNotesItem= ruleBehaviorNotesItem EOF )
            // InternalLibrettoSpec.g:3329:2: iv_ruleBehaviorNotesItem= ruleBehaviorNotesItem EOF
            {
             newCompositeNode(grammarAccess.getBehaviorNotesItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBehaviorNotesItem=ruleBehaviorNotesItem();

            state._fsp--;

             current =iv_ruleBehaviorNotesItem; 
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
    // $ANTLR end "entryRuleBehaviorNotesItem"


    // $ANTLR start "ruleBehaviorNotesItem"
    // InternalLibrettoSpec.g:3335:1: ruleBehaviorNotesItem returns [EObject current=null] : ( (lv_notes_0_0= ruleNotesField ) ) ;
    public final EObject ruleBehaviorNotesItem() throws RecognitionException {
        EObject current = null;

        EObject lv_notes_0_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:3341:2: ( ( (lv_notes_0_0= ruleNotesField ) ) )
            // InternalLibrettoSpec.g:3342:2: ( (lv_notes_0_0= ruleNotesField ) )
            {
            // InternalLibrettoSpec.g:3342:2: ( (lv_notes_0_0= ruleNotesField ) )
            // InternalLibrettoSpec.g:3343:3: (lv_notes_0_0= ruleNotesField )
            {
            // InternalLibrettoSpec.g:3343:3: (lv_notes_0_0= ruleNotesField )
            // InternalLibrettoSpec.g:3344:4: lv_notes_0_0= ruleNotesField
            {

            				newCompositeNode(grammarAccess.getBehaviorNotesItemAccess().getNotesNotesFieldParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_notes_0_0=ruleNotesField();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getBehaviorNotesItemRule());
            				}
            				set(
            					current,
            					"notes",
            					lv_notes_0_0,
            					"com.robenglander.libretto.spec.LibrettoSpec.NotesField");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleBehaviorNotesItem"


    // $ANTLR start "entryRuleBehaviorContextItem"
    // InternalLibrettoSpec.g:3364:1: entryRuleBehaviorContextItem returns [EObject current=null] : iv_ruleBehaviorContextItem= ruleBehaviorContextItem EOF ;
    public final EObject entryRuleBehaviorContextItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviorContextItem = null;


        try {
            // InternalLibrettoSpec.g:3364:60: (iv_ruleBehaviorContextItem= ruleBehaviorContextItem EOF )
            // InternalLibrettoSpec.g:3365:2: iv_ruleBehaviorContextItem= ruleBehaviorContextItem EOF
            {
             newCompositeNode(grammarAccess.getBehaviorContextItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBehaviorContextItem=ruleBehaviorContextItem();

            state._fsp--;

             current =iv_ruleBehaviorContextItem; 
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
    // $ANTLR end "entryRuleBehaviorContextItem"


    // $ANTLR start "ruleBehaviorContextItem"
    // InternalLibrettoSpec.g:3371:1: ruleBehaviorContextItem returns [EObject current=null] : ( (lv_context_0_0= ruleContextField ) ) ;
    public final EObject ruleBehaviorContextItem() throws RecognitionException {
        EObject current = null;

        EObject lv_context_0_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:3377:2: ( ( (lv_context_0_0= ruleContextField ) ) )
            // InternalLibrettoSpec.g:3378:2: ( (lv_context_0_0= ruleContextField ) )
            {
            // InternalLibrettoSpec.g:3378:2: ( (lv_context_0_0= ruleContextField ) )
            // InternalLibrettoSpec.g:3379:3: (lv_context_0_0= ruleContextField )
            {
            // InternalLibrettoSpec.g:3379:3: (lv_context_0_0= ruleContextField )
            // InternalLibrettoSpec.g:3380:4: lv_context_0_0= ruleContextField
            {

            				newCompositeNode(grammarAccess.getBehaviorContextItemAccess().getContextContextFieldParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_context_0_0=ruleContextField();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getBehaviorContextItemRule());
            				}
            				set(
            					current,
            					"context",
            					lv_context_0_0,
            					"com.robenglander.libretto.spec.LibrettoSpec.ContextField");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleBehaviorContextItem"


    // $ANTLR start "entryRuleBehaviorDependenciesItem"
    // InternalLibrettoSpec.g:3400:1: entryRuleBehaviorDependenciesItem returns [EObject current=null] : iv_ruleBehaviorDependenciesItem= ruleBehaviorDependenciesItem EOF ;
    public final EObject entryRuleBehaviorDependenciesItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviorDependenciesItem = null;


        try {
            // InternalLibrettoSpec.g:3400:65: (iv_ruleBehaviorDependenciesItem= ruleBehaviorDependenciesItem EOF )
            // InternalLibrettoSpec.g:3401:2: iv_ruleBehaviorDependenciesItem= ruleBehaviorDependenciesItem EOF
            {
             newCompositeNode(grammarAccess.getBehaviorDependenciesItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBehaviorDependenciesItem=ruleBehaviorDependenciesItem();

            state._fsp--;

             current =iv_ruleBehaviorDependenciesItem; 
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
    // $ANTLR end "entryRuleBehaviorDependenciesItem"


    // $ANTLR start "ruleBehaviorDependenciesItem"
    // InternalLibrettoSpec.g:3407:1: ruleBehaviorDependenciesItem returns [EObject current=null] : ( (lv_dependencies_0_0= ruleDependenciesField ) ) ;
    public final EObject ruleBehaviorDependenciesItem() throws RecognitionException {
        EObject current = null;

        EObject lv_dependencies_0_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:3413:2: ( ( (lv_dependencies_0_0= ruleDependenciesField ) ) )
            // InternalLibrettoSpec.g:3414:2: ( (lv_dependencies_0_0= ruleDependenciesField ) )
            {
            // InternalLibrettoSpec.g:3414:2: ( (lv_dependencies_0_0= ruleDependenciesField ) )
            // InternalLibrettoSpec.g:3415:3: (lv_dependencies_0_0= ruleDependenciesField )
            {
            // InternalLibrettoSpec.g:3415:3: (lv_dependencies_0_0= ruleDependenciesField )
            // InternalLibrettoSpec.g:3416:4: lv_dependencies_0_0= ruleDependenciesField
            {

            				newCompositeNode(grammarAccess.getBehaviorDependenciesItemAccess().getDependenciesDependenciesFieldParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_dependencies_0_0=ruleDependenciesField();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getBehaviorDependenciesItemRule());
            				}
            				set(
            					current,
            					"dependencies",
            					lv_dependencies_0_0,
            					"com.robenglander.libretto.spec.LibrettoSpec.DependenciesField");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleBehaviorDependenciesItem"


    // $ANTLR start "entryRuleActorField"
    // InternalLibrettoSpec.g:3436:1: entryRuleActorField returns [EObject current=null] : iv_ruleActorField= ruleActorField EOF ;
    public final EObject entryRuleActorField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActorField = null;


        try {
            // InternalLibrettoSpec.g:3436:51: (iv_ruleActorField= ruleActorField EOF )
            // InternalLibrettoSpec.g:3437:2: iv_ruleActorField= ruleActorField EOF
            {
             newCompositeNode(grammarAccess.getActorFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActorField=ruleActorField();

            state._fsp--;

             current =iv_ruleActorField; 
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
    // $ANTLR end "entryRuleActorField"


    // $ANTLR start "ruleActorField"
    // InternalLibrettoSpec.g:3443:1: ruleActorField returns [EObject current=null] : (otherlv_0= 'actor' otherlv_1= ':' ( (lv_value_2_0= ruleIdentifierValue ) ) ) ;
    public final EObject ruleActorField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:3449:2: ( (otherlv_0= 'actor' otherlv_1= ':' ( (lv_value_2_0= ruleIdentifierValue ) ) ) )
            // InternalLibrettoSpec.g:3450:2: (otherlv_0= 'actor' otherlv_1= ':' ( (lv_value_2_0= ruleIdentifierValue ) ) )
            {
            // InternalLibrettoSpec.g:3450:2: (otherlv_0= 'actor' otherlv_1= ':' ( (lv_value_2_0= ruleIdentifierValue ) ) )
            // InternalLibrettoSpec.g:3451:3: otherlv_0= 'actor' otherlv_1= ':' ( (lv_value_2_0= ruleIdentifierValue ) )
            {
            otherlv_0=(Token)match(input,54,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getActorFieldAccess().getActorKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getActorFieldAccess().getColonKeyword_1());
            		
            // InternalLibrettoSpec.g:3459:3: ( (lv_value_2_0= ruleIdentifierValue ) )
            // InternalLibrettoSpec.g:3460:4: (lv_value_2_0= ruleIdentifierValue )
            {
            // InternalLibrettoSpec.g:3460:4: (lv_value_2_0= ruleIdentifierValue )
            // InternalLibrettoSpec.g:3461:5: lv_value_2_0= ruleIdentifierValue
            {

            					newCompositeNode(grammarAccess.getActorFieldAccess().getValueIdentifierValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleIdentifierValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActorFieldRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"com.robenglander.libretto.spec.LibrettoSpec.IdentifierValue");
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
    // $ANTLR end "ruleActorField"


    // $ANTLR start "entryRuleActionField"
    // InternalLibrettoSpec.g:3482:1: entryRuleActionField returns [EObject current=null] : iv_ruleActionField= ruleActionField EOF ;
    public final EObject entryRuleActionField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionField = null;


        try {
            // InternalLibrettoSpec.g:3482:52: (iv_ruleActionField= ruleActionField EOF )
            // InternalLibrettoSpec.g:3483:2: iv_ruleActionField= ruleActionField EOF
            {
             newCompositeNode(grammarAccess.getActionFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActionField=ruleActionField();

            state._fsp--;

             current =iv_ruleActionField; 
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
    // $ANTLR end "entryRuleActionField"


    // $ANTLR start "ruleActionField"
    // InternalLibrettoSpec.g:3489:1: ruleActionField returns [EObject current=null] : (otherlv_0= 'action' otherlv_1= ':' ( (lv_value_2_0= ruleIdentifierValue ) ) ) ;
    public final EObject ruleActionField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:3495:2: ( (otherlv_0= 'action' otherlv_1= ':' ( (lv_value_2_0= ruleIdentifierValue ) ) ) )
            // InternalLibrettoSpec.g:3496:2: (otherlv_0= 'action' otherlv_1= ':' ( (lv_value_2_0= ruleIdentifierValue ) ) )
            {
            // InternalLibrettoSpec.g:3496:2: (otherlv_0= 'action' otherlv_1= ':' ( (lv_value_2_0= ruleIdentifierValue ) ) )
            // InternalLibrettoSpec.g:3497:3: otherlv_0= 'action' otherlv_1= ':' ( (lv_value_2_0= ruleIdentifierValue ) )
            {
            otherlv_0=(Token)match(input,55,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getActionFieldAccess().getActionKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getActionFieldAccess().getColonKeyword_1());
            		
            // InternalLibrettoSpec.g:3505:3: ( (lv_value_2_0= ruleIdentifierValue ) )
            // InternalLibrettoSpec.g:3506:4: (lv_value_2_0= ruleIdentifierValue )
            {
            // InternalLibrettoSpec.g:3506:4: (lv_value_2_0= ruleIdentifierValue )
            // InternalLibrettoSpec.g:3507:5: lv_value_2_0= ruleIdentifierValue
            {

            					newCompositeNode(grammarAccess.getActionFieldAccess().getValueIdentifierValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleIdentifierValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionFieldRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"com.robenglander.libretto.spec.LibrettoSpec.IdentifierValue");
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
    // $ANTLR end "ruleActionField"


    // $ANTLR start "entryRuleObjectsField"
    // InternalLibrettoSpec.g:3528:1: entryRuleObjectsField returns [EObject current=null] : iv_ruleObjectsField= ruleObjectsField EOF ;
    public final EObject entryRuleObjectsField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectsField = null;


        try {
            // InternalLibrettoSpec.g:3528:53: (iv_ruleObjectsField= ruleObjectsField EOF )
            // InternalLibrettoSpec.g:3529:2: iv_ruleObjectsField= ruleObjectsField EOF
            {
             newCompositeNode(grammarAccess.getObjectsFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjectsField=ruleObjectsField();

            state._fsp--;

             current =iv_ruleObjectsField; 
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
    // $ANTLR end "entryRuleObjectsField"


    // $ANTLR start "ruleObjectsField"
    // InternalLibrettoSpec.g:3535:1: ruleObjectsField returns [EObject current=null] : (otherlv_0= 'objects' otherlv_1= ':' ( (lv_value_2_0= ruleIdentifierList ) ) ) ;
    public final EObject ruleObjectsField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:3541:2: ( (otherlv_0= 'objects' otherlv_1= ':' ( (lv_value_2_0= ruleIdentifierList ) ) ) )
            // InternalLibrettoSpec.g:3542:2: (otherlv_0= 'objects' otherlv_1= ':' ( (lv_value_2_0= ruleIdentifierList ) ) )
            {
            // InternalLibrettoSpec.g:3542:2: (otherlv_0= 'objects' otherlv_1= ':' ( (lv_value_2_0= ruleIdentifierList ) ) )
            // InternalLibrettoSpec.g:3543:3: otherlv_0= 'objects' otherlv_1= ':' ( (lv_value_2_0= ruleIdentifierList ) )
            {
            otherlv_0=(Token)match(input,56,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getObjectsFieldAccess().getObjectsKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectsFieldAccess().getColonKeyword_1());
            		
            // InternalLibrettoSpec.g:3551:3: ( (lv_value_2_0= ruleIdentifierList ) )
            // InternalLibrettoSpec.g:3552:4: (lv_value_2_0= ruleIdentifierList )
            {
            // InternalLibrettoSpec.g:3552:4: (lv_value_2_0= ruleIdentifierList )
            // InternalLibrettoSpec.g:3553:5: lv_value_2_0= ruleIdentifierList
            {

            					newCompositeNode(grammarAccess.getObjectsFieldAccess().getValueIdentifierListParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleIdentifierList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObjectsFieldRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"com.robenglander.libretto.spec.LibrettoSpec.IdentifierList");
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
    // $ANTLR end "ruleObjectsField"


    // $ANTLR start "entryRuleReadsField"
    // InternalLibrettoSpec.g:3574:1: entryRuleReadsField returns [EObject current=null] : iv_ruleReadsField= ruleReadsField EOF ;
    public final EObject entryRuleReadsField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReadsField = null;


        try {
            // InternalLibrettoSpec.g:3574:51: (iv_ruleReadsField= ruleReadsField EOF )
            // InternalLibrettoSpec.g:3575:2: iv_ruleReadsField= ruleReadsField EOF
            {
             newCompositeNode(grammarAccess.getReadsFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReadsField=ruleReadsField();

            state._fsp--;

             current =iv_ruleReadsField; 
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
    // $ANTLR end "entryRuleReadsField"


    // $ANTLR start "ruleReadsField"
    // InternalLibrettoSpec.g:3581:1: ruleReadsField returns [EObject current=null] : (otherlv_0= 'reads' otherlv_1= ':' ( (lv_value_2_0= ruleIdentifierList ) ) ) ;
    public final EObject ruleReadsField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:3587:2: ( (otherlv_0= 'reads' otherlv_1= ':' ( (lv_value_2_0= ruleIdentifierList ) ) ) )
            // InternalLibrettoSpec.g:3588:2: (otherlv_0= 'reads' otherlv_1= ':' ( (lv_value_2_0= ruleIdentifierList ) ) )
            {
            // InternalLibrettoSpec.g:3588:2: (otherlv_0= 'reads' otherlv_1= ':' ( (lv_value_2_0= ruleIdentifierList ) ) )
            // InternalLibrettoSpec.g:3589:3: otherlv_0= 'reads' otherlv_1= ':' ( (lv_value_2_0= ruleIdentifierList ) )
            {
            otherlv_0=(Token)match(input,57,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getReadsFieldAccess().getReadsKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getReadsFieldAccess().getColonKeyword_1());
            		
            // InternalLibrettoSpec.g:3597:3: ( (lv_value_2_0= ruleIdentifierList ) )
            // InternalLibrettoSpec.g:3598:4: (lv_value_2_0= ruleIdentifierList )
            {
            // InternalLibrettoSpec.g:3598:4: (lv_value_2_0= ruleIdentifierList )
            // InternalLibrettoSpec.g:3599:5: lv_value_2_0= ruleIdentifierList
            {

            					newCompositeNode(grammarAccess.getReadsFieldAccess().getValueIdentifierListParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleIdentifierList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReadsFieldRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"com.robenglander.libretto.spec.LibrettoSpec.IdentifierList");
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
    // $ANTLR end "ruleReadsField"


    // $ANTLR start "entryRuleWritesField"
    // InternalLibrettoSpec.g:3620:1: entryRuleWritesField returns [EObject current=null] : iv_ruleWritesField= ruleWritesField EOF ;
    public final EObject entryRuleWritesField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWritesField = null;


        try {
            // InternalLibrettoSpec.g:3620:52: (iv_ruleWritesField= ruleWritesField EOF )
            // InternalLibrettoSpec.g:3621:2: iv_ruleWritesField= ruleWritesField EOF
            {
             newCompositeNode(grammarAccess.getWritesFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWritesField=ruleWritesField();

            state._fsp--;

             current =iv_ruleWritesField; 
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
    // $ANTLR end "entryRuleWritesField"


    // $ANTLR start "ruleWritesField"
    // InternalLibrettoSpec.g:3627:1: ruleWritesField returns [EObject current=null] : (otherlv_0= 'writes' otherlv_1= ':' ( (lv_value_2_0= ruleIdentifierList ) ) ) ;
    public final EObject ruleWritesField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:3633:2: ( (otherlv_0= 'writes' otherlv_1= ':' ( (lv_value_2_0= ruleIdentifierList ) ) ) )
            // InternalLibrettoSpec.g:3634:2: (otherlv_0= 'writes' otherlv_1= ':' ( (lv_value_2_0= ruleIdentifierList ) ) )
            {
            // InternalLibrettoSpec.g:3634:2: (otherlv_0= 'writes' otherlv_1= ':' ( (lv_value_2_0= ruleIdentifierList ) ) )
            // InternalLibrettoSpec.g:3635:3: otherlv_0= 'writes' otherlv_1= ':' ( (lv_value_2_0= ruleIdentifierList ) )
            {
            otherlv_0=(Token)match(input,58,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getWritesFieldAccess().getWritesKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getWritesFieldAccess().getColonKeyword_1());
            		
            // InternalLibrettoSpec.g:3643:3: ( (lv_value_2_0= ruleIdentifierList ) )
            // InternalLibrettoSpec.g:3644:4: (lv_value_2_0= ruleIdentifierList )
            {
            // InternalLibrettoSpec.g:3644:4: (lv_value_2_0= ruleIdentifierList )
            // InternalLibrettoSpec.g:3645:5: lv_value_2_0= ruleIdentifierList
            {

            					newCompositeNode(grammarAccess.getWritesFieldAccess().getValueIdentifierListParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleIdentifierList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWritesFieldRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"com.robenglander.libretto.spec.LibrettoSpec.IdentifierList");
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
    // $ANTLR end "ruleWritesField"


    // $ANTLR start "entryRuleConditionsField"
    // InternalLibrettoSpec.g:3666:1: entryRuleConditionsField returns [EObject current=null] : iv_ruleConditionsField= ruleConditionsField EOF ;
    public final EObject entryRuleConditionsField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionsField = null;


        try {
            // InternalLibrettoSpec.g:3666:56: (iv_ruleConditionsField= ruleConditionsField EOF )
            // InternalLibrettoSpec.g:3667:2: iv_ruleConditionsField= ruleConditionsField EOF
            {
             newCompositeNode(grammarAccess.getConditionsFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionsField=ruleConditionsField();

            state._fsp--;

             current =iv_ruleConditionsField; 
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
    // $ANTLR end "entryRuleConditionsField"


    // $ANTLR start "ruleConditionsField"
    // InternalLibrettoSpec.g:3673:1: ruleConditionsField returns [EObject current=null] : (otherlv_0= 'conditions' otherlv_1= ':' ( (lv_value_2_0= ruleTextList ) ) ) ;
    public final EObject ruleConditionsField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:3679:2: ( (otherlv_0= 'conditions' otherlv_1= ':' ( (lv_value_2_0= ruleTextList ) ) ) )
            // InternalLibrettoSpec.g:3680:2: (otherlv_0= 'conditions' otherlv_1= ':' ( (lv_value_2_0= ruleTextList ) ) )
            {
            // InternalLibrettoSpec.g:3680:2: (otherlv_0= 'conditions' otherlv_1= ':' ( (lv_value_2_0= ruleTextList ) ) )
            // InternalLibrettoSpec.g:3681:3: otherlv_0= 'conditions' otherlv_1= ':' ( (lv_value_2_0= ruleTextList ) )
            {
            otherlv_0=(Token)match(input,59,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionsFieldAccess().getConditionsKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getConditionsFieldAccess().getColonKeyword_1());
            		
            // InternalLibrettoSpec.g:3689:3: ( (lv_value_2_0= ruleTextList ) )
            // InternalLibrettoSpec.g:3690:4: (lv_value_2_0= ruleTextList )
            {
            // InternalLibrettoSpec.g:3690:4: (lv_value_2_0= ruleTextList )
            // InternalLibrettoSpec.g:3691:5: lv_value_2_0= ruleTextList
            {

            					newCompositeNode(grammarAccess.getConditionsFieldAccess().getValueTextListParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleTextList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionsFieldRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"com.robenglander.libretto.spec.LibrettoSpec.TextList");
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
    // $ANTLR end "ruleConditionsField"


    // $ANTLR start "entryRuleOutcomesField"
    // InternalLibrettoSpec.g:3712:1: entryRuleOutcomesField returns [EObject current=null] : iv_ruleOutcomesField= ruleOutcomesField EOF ;
    public final EObject entryRuleOutcomesField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutcomesField = null;


        try {
            // InternalLibrettoSpec.g:3712:54: (iv_ruleOutcomesField= ruleOutcomesField EOF )
            // InternalLibrettoSpec.g:3713:2: iv_ruleOutcomesField= ruleOutcomesField EOF
            {
             newCompositeNode(grammarAccess.getOutcomesFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutcomesField=ruleOutcomesField();

            state._fsp--;

             current =iv_ruleOutcomesField; 
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
    // $ANTLR end "entryRuleOutcomesField"


    // $ANTLR start "ruleOutcomesField"
    // InternalLibrettoSpec.g:3719:1: ruleOutcomesField returns [EObject current=null] : (otherlv_0= 'outcomes' otherlv_1= ':' ( (lv_value_2_0= ruleTextList ) ) ) ;
    public final EObject ruleOutcomesField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:3725:2: ( (otherlv_0= 'outcomes' otherlv_1= ':' ( (lv_value_2_0= ruleTextList ) ) ) )
            // InternalLibrettoSpec.g:3726:2: (otherlv_0= 'outcomes' otherlv_1= ':' ( (lv_value_2_0= ruleTextList ) ) )
            {
            // InternalLibrettoSpec.g:3726:2: (otherlv_0= 'outcomes' otherlv_1= ':' ( (lv_value_2_0= ruleTextList ) ) )
            // InternalLibrettoSpec.g:3727:3: otherlv_0= 'outcomes' otherlv_1= ':' ( (lv_value_2_0= ruleTextList ) )
            {
            otherlv_0=(Token)match(input,60,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getOutcomesFieldAccess().getOutcomesKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getOutcomesFieldAccess().getColonKeyword_1());
            		
            // InternalLibrettoSpec.g:3735:3: ( (lv_value_2_0= ruleTextList ) )
            // InternalLibrettoSpec.g:3736:4: (lv_value_2_0= ruleTextList )
            {
            // InternalLibrettoSpec.g:3736:4: (lv_value_2_0= ruleTextList )
            // InternalLibrettoSpec.g:3737:5: lv_value_2_0= ruleTextList
            {

            					newCompositeNode(grammarAccess.getOutcomesFieldAccess().getValueTextListParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleTextList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOutcomesFieldRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"com.robenglander.libretto.spec.LibrettoSpec.TextList");
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
    // $ANTLR end "ruleOutcomesField"


    // $ANTLR start "entryRuleLabelField"
    // InternalLibrettoSpec.g:3758:1: entryRuleLabelField returns [EObject current=null] : iv_ruleLabelField= ruleLabelField EOF ;
    public final EObject entryRuleLabelField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabelField = null;


        try {
            // InternalLibrettoSpec.g:3758:51: (iv_ruleLabelField= ruleLabelField EOF )
            // InternalLibrettoSpec.g:3759:2: iv_ruleLabelField= ruleLabelField EOF
            {
             newCompositeNode(grammarAccess.getLabelFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLabelField=ruleLabelField();

            state._fsp--;

             current =iv_ruleLabelField; 
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
    // $ANTLR end "entryRuleLabelField"


    // $ANTLR start "ruleLabelField"
    // InternalLibrettoSpec.g:3765:1: ruleLabelField returns [EObject current=null] : (otherlv_0= 'label' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) ) ;
    public final EObject ruleLabelField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:3771:2: ( (otherlv_0= 'label' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) ) )
            // InternalLibrettoSpec.g:3772:2: (otherlv_0= 'label' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) )
            {
            // InternalLibrettoSpec.g:3772:2: (otherlv_0= 'label' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) )
            // InternalLibrettoSpec.g:3773:3: otherlv_0= 'label' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) )
            {
            otherlv_0=(Token)match(input,61,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getLabelFieldAccess().getLabelKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getLabelFieldAccess().getColonKeyword_1());
            		
            // InternalLibrettoSpec.g:3781:3: ( (lv_value_2_0= ruleTextValue ) )
            // InternalLibrettoSpec.g:3782:4: (lv_value_2_0= ruleTextValue )
            {
            // InternalLibrettoSpec.g:3782:4: (lv_value_2_0= ruleTextValue )
            // InternalLibrettoSpec.g:3783:5: lv_value_2_0= ruleTextValue
            {

            					newCompositeNode(grammarAccess.getLabelFieldAccess().getValueTextValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleTextValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLabelFieldRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"com.robenglander.libretto.spec.LibrettoSpec.TextValue");
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
    // $ANTLR end "ruleLabelField"


    // $ANTLR start "entryRuleReferencesField"
    // InternalLibrettoSpec.g:3804:1: entryRuleReferencesField returns [EObject current=null] : iv_ruleReferencesField= ruleReferencesField EOF ;
    public final EObject entryRuleReferencesField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferencesField = null;


        try {
            // InternalLibrettoSpec.g:3804:56: (iv_ruleReferencesField= ruleReferencesField EOF )
            // InternalLibrettoSpec.g:3805:2: iv_ruleReferencesField= ruleReferencesField EOF
            {
             newCompositeNode(grammarAccess.getReferencesFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReferencesField=ruleReferencesField();

            state._fsp--;

             current =iv_ruleReferencesField; 
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
    // $ANTLR end "entryRuleReferencesField"


    // $ANTLR start "ruleReferencesField"
    // InternalLibrettoSpec.g:3811:1: ruleReferencesField returns [EObject current=null] : (otherlv_0= 'references' otherlv_1= ':' ( (lv_value_2_0= ruleReferenceIdList ) ) ) ;
    public final EObject ruleReferencesField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:3817:2: ( (otherlv_0= 'references' otherlv_1= ':' ( (lv_value_2_0= ruleReferenceIdList ) ) ) )
            // InternalLibrettoSpec.g:3818:2: (otherlv_0= 'references' otherlv_1= ':' ( (lv_value_2_0= ruleReferenceIdList ) ) )
            {
            // InternalLibrettoSpec.g:3818:2: (otherlv_0= 'references' otherlv_1= ':' ( (lv_value_2_0= ruleReferenceIdList ) ) )
            // InternalLibrettoSpec.g:3819:3: otherlv_0= 'references' otherlv_1= ':' ( (lv_value_2_0= ruleReferenceIdList ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getReferencesFieldAccess().getReferencesKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getReferencesFieldAccess().getColonKeyword_1());
            		
            // InternalLibrettoSpec.g:3827:3: ( (lv_value_2_0= ruleReferenceIdList ) )
            // InternalLibrettoSpec.g:3828:4: (lv_value_2_0= ruleReferenceIdList )
            {
            // InternalLibrettoSpec.g:3828:4: (lv_value_2_0= ruleReferenceIdList )
            // InternalLibrettoSpec.g:3829:5: lv_value_2_0= ruleReferenceIdList
            {

            					newCompositeNode(grammarAccess.getReferencesFieldAccess().getValueReferenceIdListParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleReferenceIdList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReferencesFieldRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"com.robenglander.libretto.spec.LibrettoSpec.ReferenceIdList");
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
    // $ANTLR end "ruleReferencesField"


    // $ANTLR start "entryRuleDependenciesField"
    // InternalLibrettoSpec.g:3850:1: entryRuleDependenciesField returns [EObject current=null] : iv_ruleDependenciesField= ruleDependenciesField EOF ;
    public final EObject entryRuleDependenciesField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependenciesField = null;


        try {
            // InternalLibrettoSpec.g:3850:58: (iv_ruleDependenciesField= ruleDependenciesField EOF )
            // InternalLibrettoSpec.g:3851:2: iv_ruleDependenciesField= ruleDependenciesField EOF
            {
             newCompositeNode(grammarAccess.getDependenciesFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDependenciesField=ruleDependenciesField();

            state._fsp--;

             current =iv_ruleDependenciesField; 
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
    // $ANTLR end "entryRuleDependenciesField"


    // $ANTLR start "ruleDependenciesField"
    // InternalLibrettoSpec.g:3857:1: ruleDependenciesField returns [EObject current=null] : (otherlv_0= 'dependencies' otherlv_1= ':' ( (lv_value_2_0= ruleIdentifierList ) ) ) ;
    public final EObject ruleDependenciesField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:3863:2: ( (otherlv_0= 'dependencies' otherlv_1= ':' ( (lv_value_2_0= ruleIdentifierList ) ) ) )
            // InternalLibrettoSpec.g:3864:2: (otherlv_0= 'dependencies' otherlv_1= ':' ( (lv_value_2_0= ruleIdentifierList ) ) )
            {
            // InternalLibrettoSpec.g:3864:2: (otherlv_0= 'dependencies' otherlv_1= ':' ( (lv_value_2_0= ruleIdentifierList ) ) )
            // InternalLibrettoSpec.g:3865:3: otherlv_0= 'dependencies' otherlv_1= ':' ( (lv_value_2_0= ruleIdentifierList ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getDependenciesFieldAccess().getDependenciesKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getDependenciesFieldAccess().getColonKeyword_1());
            		
            // InternalLibrettoSpec.g:3873:3: ( (lv_value_2_0= ruleIdentifierList ) )
            // InternalLibrettoSpec.g:3874:4: (lv_value_2_0= ruleIdentifierList )
            {
            // InternalLibrettoSpec.g:3874:4: (lv_value_2_0= ruleIdentifierList )
            // InternalLibrettoSpec.g:3875:5: lv_value_2_0= ruleIdentifierList
            {

            					newCompositeNode(grammarAccess.getDependenciesFieldAccess().getValueIdentifierListParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleIdentifierList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDependenciesFieldRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"com.robenglander.libretto.spec.LibrettoSpec.IdentifierList");
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
    // $ANTLR end "ruleDependenciesField"


    // $ANTLR start "entryRuleNotesField"
    // InternalLibrettoSpec.g:3896:1: entryRuleNotesField returns [EObject current=null] : iv_ruleNotesField= ruleNotesField EOF ;
    public final EObject entryRuleNotesField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotesField = null;


        try {
            // InternalLibrettoSpec.g:3896:51: (iv_ruleNotesField= ruleNotesField EOF )
            // InternalLibrettoSpec.g:3897:2: iv_ruleNotesField= ruleNotesField EOF
            {
             newCompositeNode(grammarAccess.getNotesFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNotesField=ruleNotesField();

            state._fsp--;

             current =iv_ruleNotesField; 
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
    // $ANTLR end "entryRuleNotesField"


    // $ANTLR start "ruleNotesField"
    // InternalLibrettoSpec.g:3903:1: ruleNotesField returns [EObject current=null] : (otherlv_0= 'notes' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) ) ;
    public final EObject ruleNotesField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:3909:2: ( (otherlv_0= 'notes' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) ) )
            // InternalLibrettoSpec.g:3910:2: (otherlv_0= 'notes' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) )
            {
            // InternalLibrettoSpec.g:3910:2: (otherlv_0= 'notes' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) )
            // InternalLibrettoSpec.g:3911:3: otherlv_0= 'notes' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) )
            {
            otherlv_0=(Token)match(input,62,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getNotesFieldAccess().getNotesKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getNotesFieldAccess().getColonKeyword_1());
            		
            // InternalLibrettoSpec.g:3919:3: ( (lv_value_2_0= ruleTextValue ) )
            // InternalLibrettoSpec.g:3920:4: (lv_value_2_0= ruleTextValue )
            {
            // InternalLibrettoSpec.g:3920:4: (lv_value_2_0= ruleTextValue )
            // InternalLibrettoSpec.g:3921:5: lv_value_2_0= ruleTextValue
            {

            					newCompositeNode(grammarAccess.getNotesFieldAccess().getValueTextValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleTextValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNotesFieldRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"com.robenglander.libretto.spec.LibrettoSpec.TextValue");
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
    // $ANTLR end "ruleNotesField"


    // $ANTLR start "entryRuleContextField"
    // InternalLibrettoSpec.g:3942:1: entryRuleContextField returns [EObject current=null] : iv_ruleContextField= ruleContextField EOF ;
    public final EObject entryRuleContextField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextField = null;


        try {
            // InternalLibrettoSpec.g:3942:53: (iv_ruleContextField= ruleContextField EOF )
            // InternalLibrettoSpec.g:3943:2: iv_ruleContextField= ruleContextField EOF
            {
             newCompositeNode(grammarAccess.getContextFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContextField=ruleContextField();

            state._fsp--;

             current =iv_ruleContextField; 
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
    // $ANTLR end "entryRuleContextField"


    // $ANTLR start "ruleContextField"
    // InternalLibrettoSpec.g:3949:1: ruleContextField returns [EObject current=null] : (otherlv_0= 'context' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) ) ;
    public final EObject ruleContextField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:3955:2: ( (otherlv_0= 'context' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) ) )
            // InternalLibrettoSpec.g:3956:2: (otherlv_0= 'context' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) )
            {
            // InternalLibrettoSpec.g:3956:2: (otherlv_0= 'context' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) )
            // InternalLibrettoSpec.g:3957:3: otherlv_0= 'context' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) )
            {
            otherlv_0=(Token)match(input,63,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getContextFieldAccess().getContextKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getContextFieldAccess().getColonKeyword_1());
            		
            // InternalLibrettoSpec.g:3965:3: ( (lv_value_2_0= ruleTextValue ) )
            // InternalLibrettoSpec.g:3966:4: (lv_value_2_0= ruleTextValue )
            {
            // InternalLibrettoSpec.g:3966:4: (lv_value_2_0= ruleTextValue )
            // InternalLibrettoSpec.g:3967:5: lv_value_2_0= ruleTextValue
            {

            					newCompositeNode(grammarAccess.getContextFieldAccess().getValueTextValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleTextValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContextFieldRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"com.robenglander.libretto.spec.LibrettoSpec.TextValue");
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
    // $ANTLR end "ruleContextField"


    // $ANTLR start "entryRuleOperationSurfaceRecord"
    // InternalLibrettoSpec.g:3988:1: entryRuleOperationSurfaceRecord returns [EObject current=null] : iv_ruleOperationSurfaceRecord= ruleOperationSurfaceRecord EOF ;
    public final EObject entryRuleOperationSurfaceRecord() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationSurfaceRecord = null;


        try {
            // InternalLibrettoSpec.g:3988:63: (iv_ruleOperationSurfaceRecord= ruleOperationSurfaceRecord EOF )
            // InternalLibrettoSpec.g:3989:2: iv_ruleOperationSurfaceRecord= ruleOperationSurfaceRecord EOF
            {
             newCompositeNode(grammarAccess.getOperationSurfaceRecordRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperationSurfaceRecord=ruleOperationSurfaceRecord();

            state._fsp--;

             current =iv_ruleOperationSurfaceRecord; 
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
    // $ANTLR end "entryRuleOperationSurfaceRecord"


    // $ANTLR start "ruleOperationSurfaceRecord"
    // InternalLibrettoSpec.g:3995:1: ruleOperationSurfaceRecord returns [EObject current=null] : (otherlv_0= 'operation' ( (lv_id_1_0= RULE_LIBRETTO_ID ) ) otherlv_2= '{' ( (lv_items_3_0= ruleOperationSurfaceRecordItem ) )* otherlv_4= '}' ) ;
    public final EObject ruleOperationSurfaceRecord() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_items_3_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:4001:2: ( (otherlv_0= 'operation' ( (lv_id_1_0= RULE_LIBRETTO_ID ) ) otherlv_2= '{' ( (lv_items_3_0= ruleOperationSurfaceRecordItem ) )* otherlv_4= '}' ) )
            // InternalLibrettoSpec.g:4002:2: (otherlv_0= 'operation' ( (lv_id_1_0= RULE_LIBRETTO_ID ) ) otherlv_2= '{' ( (lv_items_3_0= ruleOperationSurfaceRecordItem ) )* otherlv_4= '}' )
            {
            // InternalLibrettoSpec.g:4002:2: (otherlv_0= 'operation' ( (lv_id_1_0= RULE_LIBRETTO_ID ) ) otherlv_2= '{' ( (lv_items_3_0= ruleOperationSurfaceRecordItem ) )* otherlv_4= '}' )
            // InternalLibrettoSpec.g:4003:3: otherlv_0= 'operation' ( (lv_id_1_0= RULE_LIBRETTO_ID ) ) otherlv_2= '{' ( (lv_items_3_0= ruleOperationSurfaceRecordItem ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,64,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getOperationSurfaceRecordAccess().getOperationKeyword_0());
            		
            // InternalLibrettoSpec.g:4007:3: ( (lv_id_1_0= RULE_LIBRETTO_ID ) )
            // InternalLibrettoSpec.g:4008:4: (lv_id_1_0= RULE_LIBRETTO_ID )
            {
            // InternalLibrettoSpec.g:4008:4: (lv_id_1_0= RULE_LIBRETTO_ID )
            // InternalLibrettoSpec.g:4009:5: lv_id_1_0= RULE_LIBRETTO_ID
            {
            lv_id_1_0=(Token)match(input,RULE_LIBRETTO_ID,FOLLOW_4); 

            					newLeafNode(lv_id_1_0, grammarAccess.getOperationSurfaceRecordAccess().getIdLIBRETTO_IDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOperationSurfaceRecordRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_1_0,
            						"com.robenglander.libretto.spec.LibrettoSpec.LIBRETTO_ID");
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getOperationSurfaceRecordAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLibrettoSpec.g:4029:3: ( (lv_items_3_0= ruleOperationSurfaceRecordItem ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=65 && LA28_0<=66)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalLibrettoSpec.g:4030:4: (lv_items_3_0= ruleOperationSurfaceRecordItem )
            	    {
            	    // InternalLibrettoSpec.g:4030:4: (lv_items_3_0= ruleOperationSurfaceRecordItem )
            	    // InternalLibrettoSpec.g:4031:5: lv_items_3_0= ruleOperationSurfaceRecordItem
            	    {

            	    					newCompositeNode(grammarAccess.getOperationSurfaceRecordAccess().getItemsOperationSurfaceRecordItemParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_30);
            	    lv_items_3_0=ruleOperationSurfaceRecordItem();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getOperationSurfaceRecordRule());
            	    					}
            	    					add(
            	    						current,
            	    						"items",
            	    						lv_items_3_0,
            	    						"com.robenglander.libretto.spec.LibrettoSpec.OperationSurfaceRecordItem");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getOperationSurfaceRecordAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleOperationSurfaceRecord"


    // $ANTLR start "entryRuleOperationSurfaceRecordItem"
    // InternalLibrettoSpec.g:4056:1: entryRuleOperationSurfaceRecordItem returns [EObject current=null] : iv_ruleOperationSurfaceRecordItem= ruleOperationSurfaceRecordItem EOF ;
    public final EObject entryRuleOperationSurfaceRecordItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationSurfaceRecordItem = null;


        try {
            // InternalLibrettoSpec.g:4056:67: (iv_ruleOperationSurfaceRecordItem= ruleOperationSurfaceRecordItem EOF )
            // InternalLibrettoSpec.g:4057:2: iv_ruleOperationSurfaceRecordItem= ruleOperationSurfaceRecordItem EOF
            {
             newCompositeNode(grammarAccess.getOperationSurfaceRecordItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperationSurfaceRecordItem=ruleOperationSurfaceRecordItem();

            state._fsp--;

             current =iv_ruleOperationSurfaceRecordItem; 
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
    // $ANTLR end "entryRuleOperationSurfaceRecordItem"


    // $ANTLR start "ruleOperationSurfaceRecordItem"
    // InternalLibrettoSpec.g:4063:1: ruleOperationSurfaceRecordItem returns [EObject current=null] : (this_OperationSurfaceExpressionItem_0= ruleOperationSurfaceExpressionItem | this_OperationSurfaceOutcomeItem_1= ruleOperationSurfaceOutcomeItem ) ;
    public final EObject ruleOperationSurfaceRecordItem() throws RecognitionException {
        EObject current = null;

        EObject this_OperationSurfaceExpressionItem_0 = null;

        EObject this_OperationSurfaceOutcomeItem_1 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:4069:2: ( (this_OperationSurfaceExpressionItem_0= ruleOperationSurfaceExpressionItem | this_OperationSurfaceOutcomeItem_1= ruleOperationSurfaceOutcomeItem ) )
            // InternalLibrettoSpec.g:4070:2: (this_OperationSurfaceExpressionItem_0= ruleOperationSurfaceExpressionItem | this_OperationSurfaceOutcomeItem_1= ruleOperationSurfaceOutcomeItem )
            {
            // InternalLibrettoSpec.g:4070:2: (this_OperationSurfaceExpressionItem_0= ruleOperationSurfaceExpressionItem | this_OperationSurfaceOutcomeItem_1= ruleOperationSurfaceOutcomeItem )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==65) ) {
                alt29=1;
            }
            else if ( (LA29_0==66) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalLibrettoSpec.g:4071:3: this_OperationSurfaceExpressionItem_0= ruleOperationSurfaceExpressionItem
                    {

                    			newCompositeNode(grammarAccess.getOperationSurfaceRecordItemAccess().getOperationSurfaceExpressionItemParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_OperationSurfaceExpressionItem_0=ruleOperationSurfaceExpressionItem();

                    state._fsp--;


                    			current = this_OperationSurfaceExpressionItem_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalLibrettoSpec.g:4080:3: this_OperationSurfaceOutcomeItem_1= ruleOperationSurfaceOutcomeItem
                    {

                    			newCompositeNode(grammarAccess.getOperationSurfaceRecordItemAccess().getOperationSurfaceOutcomeItemParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_OperationSurfaceOutcomeItem_1=ruleOperationSurfaceOutcomeItem();

                    state._fsp--;


                    			current = this_OperationSurfaceOutcomeItem_1;
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
    // $ANTLR end "ruleOperationSurfaceRecordItem"


    // $ANTLR start "entryRuleOperationSurfaceExpressionItem"
    // InternalLibrettoSpec.g:4092:1: entryRuleOperationSurfaceExpressionItem returns [EObject current=null] : iv_ruleOperationSurfaceExpressionItem= ruleOperationSurfaceExpressionItem EOF ;
    public final EObject entryRuleOperationSurfaceExpressionItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationSurfaceExpressionItem = null;


        try {
            // InternalLibrettoSpec.g:4092:71: (iv_ruleOperationSurfaceExpressionItem= ruleOperationSurfaceExpressionItem EOF )
            // InternalLibrettoSpec.g:4093:2: iv_ruleOperationSurfaceExpressionItem= ruleOperationSurfaceExpressionItem EOF
            {
             newCompositeNode(grammarAccess.getOperationSurfaceExpressionItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperationSurfaceExpressionItem=ruleOperationSurfaceExpressionItem();

            state._fsp--;

             current =iv_ruleOperationSurfaceExpressionItem; 
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
    // $ANTLR end "entryRuleOperationSurfaceExpressionItem"


    // $ANTLR start "ruleOperationSurfaceExpressionItem"
    // InternalLibrettoSpec.g:4099:1: ruleOperationSurfaceExpressionItem returns [EObject current=null] : ( (lv_operationExpression_0_0= ruleOperationExpressionField ) ) ;
    public final EObject ruleOperationSurfaceExpressionItem() throws RecognitionException {
        EObject current = null;

        EObject lv_operationExpression_0_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:4105:2: ( ( (lv_operationExpression_0_0= ruleOperationExpressionField ) ) )
            // InternalLibrettoSpec.g:4106:2: ( (lv_operationExpression_0_0= ruleOperationExpressionField ) )
            {
            // InternalLibrettoSpec.g:4106:2: ( (lv_operationExpression_0_0= ruleOperationExpressionField ) )
            // InternalLibrettoSpec.g:4107:3: (lv_operationExpression_0_0= ruleOperationExpressionField )
            {
            // InternalLibrettoSpec.g:4107:3: (lv_operationExpression_0_0= ruleOperationExpressionField )
            // InternalLibrettoSpec.g:4108:4: lv_operationExpression_0_0= ruleOperationExpressionField
            {

            				newCompositeNode(grammarAccess.getOperationSurfaceExpressionItemAccess().getOperationExpressionOperationExpressionFieldParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_operationExpression_0_0=ruleOperationExpressionField();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getOperationSurfaceExpressionItemRule());
            				}
            				set(
            					current,
            					"operationExpression",
            					lv_operationExpression_0_0,
            					"com.robenglander.libretto.spec.LibrettoSpec.OperationExpressionField");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleOperationSurfaceExpressionItem"


    // $ANTLR start "entryRuleOperationSurfaceOutcomeItem"
    // InternalLibrettoSpec.g:4128:1: entryRuleOperationSurfaceOutcomeItem returns [EObject current=null] : iv_ruleOperationSurfaceOutcomeItem= ruleOperationSurfaceOutcomeItem EOF ;
    public final EObject entryRuleOperationSurfaceOutcomeItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationSurfaceOutcomeItem = null;


        try {
            // InternalLibrettoSpec.g:4128:68: (iv_ruleOperationSurfaceOutcomeItem= ruleOperationSurfaceOutcomeItem EOF )
            // InternalLibrettoSpec.g:4129:2: iv_ruleOperationSurfaceOutcomeItem= ruleOperationSurfaceOutcomeItem EOF
            {
             newCompositeNode(grammarAccess.getOperationSurfaceOutcomeItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperationSurfaceOutcomeItem=ruleOperationSurfaceOutcomeItem();

            state._fsp--;

             current =iv_ruleOperationSurfaceOutcomeItem; 
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
    // $ANTLR end "entryRuleOperationSurfaceOutcomeItem"


    // $ANTLR start "ruleOperationSurfaceOutcomeItem"
    // InternalLibrettoSpec.g:4135:1: ruleOperationSurfaceOutcomeItem returns [EObject current=null] : ( (lv_outcomeClass_0_0= ruleOutcomeClassField ) ) ;
    public final EObject ruleOperationSurfaceOutcomeItem() throws RecognitionException {
        EObject current = null;

        EObject lv_outcomeClass_0_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:4141:2: ( ( (lv_outcomeClass_0_0= ruleOutcomeClassField ) ) )
            // InternalLibrettoSpec.g:4142:2: ( (lv_outcomeClass_0_0= ruleOutcomeClassField ) )
            {
            // InternalLibrettoSpec.g:4142:2: ( (lv_outcomeClass_0_0= ruleOutcomeClassField ) )
            // InternalLibrettoSpec.g:4143:3: (lv_outcomeClass_0_0= ruleOutcomeClassField )
            {
            // InternalLibrettoSpec.g:4143:3: (lv_outcomeClass_0_0= ruleOutcomeClassField )
            // InternalLibrettoSpec.g:4144:4: lv_outcomeClass_0_0= ruleOutcomeClassField
            {

            				newCompositeNode(grammarAccess.getOperationSurfaceOutcomeItemAccess().getOutcomeClassOutcomeClassFieldParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_outcomeClass_0_0=ruleOutcomeClassField();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getOperationSurfaceOutcomeItemRule());
            				}
            				set(
            					current,
            					"outcomeClass",
            					lv_outcomeClass_0_0,
            					"com.robenglander.libretto.spec.LibrettoSpec.OutcomeClassField");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleOperationSurfaceOutcomeItem"


    // $ANTLR start "entryRuleOperationExpressionField"
    // InternalLibrettoSpec.g:4164:1: entryRuleOperationExpressionField returns [EObject current=null] : iv_ruleOperationExpressionField= ruleOperationExpressionField EOF ;
    public final EObject entryRuleOperationExpressionField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationExpressionField = null;


        try {
            // InternalLibrettoSpec.g:4164:65: (iv_ruleOperationExpressionField= ruleOperationExpressionField EOF )
            // InternalLibrettoSpec.g:4165:2: iv_ruleOperationExpressionField= ruleOperationExpressionField EOF
            {
             newCompositeNode(grammarAccess.getOperationExpressionFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperationExpressionField=ruleOperationExpressionField();

            state._fsp--;

             current =iv_ruleOperationExpressionField; 
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
    // $ANTLR end "entryRuleOperationExpressionField"


    // $ANTLR start "ruleOperationExpressionField"
    // InternalLibrettoSpec.g:4171:1: ruleOperationExpressionField returns [EObject current=null] : (otherlv_0= 'operation_expression' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) ) ;
    public final EObject ruleOperationExpressionField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:4177:2: ( (otherlv_0= 'operation_expression' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) ) )
            // InternalLibrettoSpec.g:4178:2: (otherlv_0= 'operation_expression' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) )
            {
            // InternalLibrettoSpec.g:4178:2: (otherlv_0= 'operation_expression' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) )
            // InternalLibrettoSpec.g:4179:3: otherlv_0= 'operation_expression' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) )
            {
            otherlv_0=(Token)match(input,65,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getOperationExpressionFieldAccess().getOperation_expressionKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getOperationExpressionFieldAccess().getColonKeyword_1());
            		
            // InternalLibrettoSpec.g:4187:3: ( (lv_value_2_0= ruleTextValue ) )
            // InternalLibrettoSpec.g:4188:4: (lv_value_2_0= ruleTextValue )
            {
            // InternalLibrettoSpec.g:4188:4: (lv_value_2_0= ruleTextValue )
            // InternalLibrettoSpec.g:4189:5: lv_value_2_0= ruleTextValue
            {

            					newCompositeNode(grammarAccess.getOperationExpressionFieldAccess().getValueTextValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleTextValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationExpressionFieldRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"com.robenglander.libretto.spec.LibrettoSpec.TextValue");
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
    // $ANTLR end "ruleOperationExpressionField"


    // $ANTLR start "entryRuleOutcomeClassField"
    // InternalLibrettoSpec.g:4210:1: entryRuleOutcomeClassField returns [EObject current=null] : iv_ruleOutcomeClassField= ruleOutcomeClassField EOF ;
    public final EObject entryRuleOutcomeClassField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutcomeClassField = null;


        try {
            // InternalLibrettoSpec.g:4210:58: (iv_ruleOutcomeClassField= ruleOutcomeClassField EOF )
            // InternalLibrettoSpec.g:4211:2: iv_ruleOutcomeClassField= ruleOutcomeClassField EOF
            {
             newCompositeNode(grammarAccess.getOutcomeClassFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutcomeClassField=ruleOutcomeClassField();

            state._fsp--;

             current =iv_ruleOutcomeClassField; 
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
    // $ANTLR end "entryRuleOutcomeClassField"


    // $ANTLR start "ruleOutcomeClassField"
    // InternalLibrettoSpec.g:4217:1: ruleOutcomeClassField returns [EObject current=null] : (otherlv_0= 'outcome_class' otherlv_1= ':' ( (lv_value_2_0= ruleOutcomeClassValue ) ) ) ;
    public final EObject ruleOutcomeClassField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Enumerator lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:4223:2: ( (otherlv_0= 'outcome_class' otherlv_1= ':' ( (lv_value_2_0= ruleOutcomeClassValue ) ) ) )
            // InternalLibrettoSpec.g:4224:2: (otherlv_0= 'outcome_class' otherlv_1= ':' ( (lv_value_2_0= ruleOutcomeClassValue ) ) )
            {
            // InternalLibrettoSpec.g:4224:2: (otherlv_0= 'outcome_class' otherlv_1= ':' ( (lv_value_2_0= ruleOutcomeClassValue ) ) )
            // InternalLibrettoSpec.g:4225:3: otherlv_0= 'outcome_class' otherlv_1= ':' ( (lv_value_2_0= ruleOutcomeClassValue ) )
            {
            otherlv_0=(Token)match(input,66,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getOutcomeClassFieldAccess().getOutcome_classKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getOutcomeClassFieldAccess().getColonKeyword_1());
            		
            // InternalLibrettoSpec.g:4233:3: ( (lv_value_2_0= ruleOutcomeClassValue ) )
            // InternalLibrettoSpec.g:4234:4: (lv_value_2_0= ruleOutcomeClassValue )
            {
            // InternalLibrettoSpec.g:4234:4: (lv_value_2_0= ruleOutcomeClassValue )
            // InternalLibrettoSpec.g:4235:5: lv_value_2_0= ruleOutcomeClassValue
            {

            					newCompositeNode(grammarAccess.getOutcomeClassFieldAccess().getValueOutcomeClassValueEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleOutcomeClassValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOutcomeClassFieldRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"com.robenglander.libretto.spec.LibrettoSpec.OutcomeClassValue");
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
    // $ANTLR end "ruleOutcomeClassField"


    // $ANTLR start "entryRuleImplementsSurfaceRecord"
    // InternalLibrettoSpec.g:4256:1: entryRuleImplementsSurfaceRecord returns [EObject current=null] : iv_ruleImplementsSurfaceRecord= ruleImplementsSurfaceRecord EOF ;
    public final EObject entryRuleImplementsSurfaceRecord() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementsSurfaceRecord = null;


        try {
            // InternalLibrettoSpec.g:4256:64: (iv_ruleImplementsSurfaceRecord= ruleImplementsSurfaceRecord EOF )
            // InternalLibrettoSpec.g:4257:2: iv_ruleImplementsSurfaceRecord= ruleImplementsSurfaceRecord EOF
            {
             newCompositeNode(grammarAccess.getImplementsSurfaceRecordRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImplementsSurfaceRecord=ruleImplementsSurfaceRecord();

            state._fsp--;

             current =iv_ruleImplementsSurfaceRecord; 
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
    // $ANTLR end "entryRuleImplementsSurfaceRecord"


    // $ANTLR start "ruleImplementsSurfaceRecord"
    // InternalLibrettoSpec.g:4263:1: ruleImplementsSurfaceRecord returns [EObject current=null] : (otherlv_0= 'implements' ( (lv_items_1_0= ruleImplementsSurfaceRecordItem ) )* ) ;
    public final EObject ruleImplementsSurfaceRecord() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_items_1_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:4269:2: ( (otherlv_0= 'implements' ( (lv_items_1_0= ruleImplementsSurfaceRecordItem ) )* ) )
            // InternalLibrettoSpec.g:4270:2: (otherlv_0= 'implements' ( (lv_items_1_0= ruleImplementsSurfaceRecordItem ) )* )
            {
            // InternalLibrettoSpec.g:4270:2: (otherlv_0= 'implements' ( (lv_items_1_0= ruleImplementsSurfaceRecordItem ) )* )
            // InternalLibrettoSpec.g:4271:3: otherlv_0= 'implements' ( (lv_items_1_0= ruleImplementsSurfaceRecordItem ) )*
            {
            otherlv_0=(Token)match(input,67,FOLLOW_32); 

            			newLeafNode(otherlv_0, grammarAccess.getImplementsSurfaceRecordAccess().getImplementsKeyword_0());
            		
            // InternalLibrettoSpec.g:4275:3: ( (lv_items_1_0= ruleImplementsSurfaceRecordItem ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==43) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalLibrettoSpec.g:4276:4: (lv_items_1_0= ruleImplementsSurfaceRecordItem )
            	    {
            	    // InternalLibrettoSpec.g:4276:4: (lv_items_1_0= ruleImplementsSurfaceRecordItem )
            	    // InternalLibrettoSpec.g:4277:5: lv_items_1_0= ruleImplementsSurfaceRecordItem
            	    {

            	    					newCompositeNode(grammarAccess.getImplementsSurfaceRecordAccess().getItemsImplementsSurfaceRecordItemParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_32);
            	    lv_items_1_0=ruleImplementsSurfaceRecordItem();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getImplementsSurfaceRecordRule());
            	    					}
            	    					add(
            	    						current,
            	    						"items",
            	    						lv_items_1_0,
            	    						"com.robenglander.libretto.spec.LibrettoSpec.ImplementsSurfaceRecordItem");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // $ANTLR end "ruleImplementsSurfaceRecord"


    // $ANTLR start "entryRuleImplementsSurfaceRecordItem"
    // InternalLibrettoSpec.g:4298:1: entryRuleImplementsSurfaceRecordItem returns [EObject current=null] : iv_ruleImplementsSurfaceRecordItem= ruleImplementsSurfaceRecordItem EOF ;
    public final EObject entryRuleImplementsSurfaceRecordItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementsSurfaceRecordItem = null;


        try {
            // InternalLibrettoSpec.g:4298:68: (iv_ruleImplementsSurfaceRecordItem= ruleImplementsSurfaceRecordItem EOF )
            // InternalLibrettoSpec.g:4299:2: iv_ruleImplementsSurfaceRecordItem= ruleImplementsSurfaceRecordItem EOF
            {
             newCompositeNode(grammarAccess.getImplementsSurfaceRecordItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImplementsSurfaceRecordItem=ruleImplementsSurfaceRecordItem();

            state._fsp--;

             current =iv_ruleImplementsSurfaceRecordItem; 
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
    // $ANTLR end "entryRuleImplementsSurfaceRecordItem"


    // $ANTLR start "ruleImplementsSurfaceRecordItem"
    // InternalLibrettoSpec.g:4305:1: ruleImplementsSurfaceRecordItem returns [EObject current=null] : this_ImplementsSurfaceTargetItem_0= ruleImplementsSurfaceTargetItem ;
    public final EObject ruleImplementsSurfaceRecordItem() throws RecognitionException {
        EObject current = null;

        EObject this_ImplementsSurfaceTargetItem_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:4311:2: (this_ImplementsSurfaceTargetItem_0= ruleImplementsSurfaceTargetItem )
            // InternalLibrettoSpec.g:4312:2: this_ImplementsSurfaceTargetItem_0= ruleImplementsSurfaceTargetItem
            {

            		newCompositeNode(grammarAccess.getImplementsSurfaceRecordItemAccess().getImplementsSurfaceTargetItemParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_ImplementsSurfaceTargetItem_0=ruleImplementsSurfaceTargetItem();

            state._fsp--;


            		current = this_ImplementsSurfaceTargetItem_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleImplementsSurfaceRecordItem"


    // $ANTLR start "entryRuleImplementsSurfaceTargetItem"
    // InternalLibrettoSpec.g:4323:1: entryRuleImplementsSurfaceTargetItem returns [EObject current=null] : iv_ruleImplementsSurfaceTargetItem= ruleImplementsSurfaceTargetItem EOF ;
    public final EObject entryRuleImplementsSurfaceTargetItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementsSurfaceTargetItem = null;


        try {
            // InternalLibrettoSpec.g:4323:68: (iv_ruleImplementsSurfaceTargetItem= ruleImplementsSurfaceTargetItem EOF )
            // InternalLibrettoSpec.g:4324:2: iv_ruleImplementsSurfaceTargetItem= ruleImplementsSurfaceTargetItem EOF
            {
             newCompositeNode(grammarAccess.getImplementsSurfaceTargetItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImplementsSurfaceTargetItem=ruleImplementsSurfaceTargetItem();

            state._fsp--;

             current =iv_ruleImplementsSurfaceTargetItem; 
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
    // $ANTLR end "entryRuleImplementsSurfaceTargetItem"


    // $ANTLR start "ruleImplementsSurfaceTargetItem"
    // InternalLibrettoSpec.g:4330:1: ruleImplementsSurfaceTargetItem returns [EObject current=null] : ( (lv_targetSpec_0_0= ruleImplementsSurfaceTargetField ) ) ;
    public final EObject ruleImplementsSurfaceTargetItem() throws RecognitionException {
        EObject current = null;

        EObject lv_targetSpec_0_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:4336:2: ( ( (lv_targetSpec_0_0= ruleImplementsSurfaceTargetField ) ) )
            // InternalLibrettoSpec.g:4337:2: ( (lv_targetSpec_0_0= ruleImplementsSurfaceTargetField ) )
            {
            // InternalLibrettoSpec.g:4337:2: ( (lv_targetSpec_0_0= ruleImplementsSurfaceTargetField ) )
            // InternalLibrettoSpec.g:4338:3: (lv_targetSpec_0_0= ruleImplementsSurfaceTargetField )
            {
            // InternalLibrettoSpec.g:4338:3: (lv_targetSpec_0_0= ruleImplementsSurfaceTargetField )
            // InternalLibrettoSpec.g:4339:4: lv_targetSpec_0_0= ruleImplementsSurfaceTargetField
            {

            				newCompositeNode(grammarAccess.getImplementsSurfaceTargetItemAccess().getTargetSpecImplementsSurfaceTargetFieldParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_targetSpec_0_0=ruleImplementsSurfaceTargetField();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getImplementsSurfaceTargetItemRule());
            				}
            				set(
            					current,
            					"targetSpec",
            					lv_targetSpec_0_0,
            					"com.robenglander.libretto.spec.LibrettoSpec.ImplementsSurfaceTargetField");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleImplementsSurfaceTargetItem"


    // $ANTLR start "entryRuleImplementsSurfaceTargetField"
    // InternalLibrettoSpec.g:4359:1: entryRuleImplementsSurfaceTargetField returns [EObject current=null] : iv_ruleImplementsSurfaceTargetField= ruleImplementsSurfaceTargetField EOF ;
    public final EObject entryRuleImplementsSurfaceTargetField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementsSurfaceTargetField = null;


        try {
            // InternalLibrettoSpec.g:4359:69: (iv_ruleImplementsSurfaceTargetField= ruleImplementsSurfaceTargetField EOF )
            // InternalLibrettoSpec.g:4360:2: iv_ruleImplementsSurfaceTargetField= ruleImplementsSurfaceTargetField EOF
            {
             newCompositeNode(grammarAccess.getImplementsSurfaceTargetFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImplementsSurfaceTargetField=ruleImplementsSurfaceTargetField();

            state._fsp--;

             current =iv_ruleImplementsSurfaceTargetField; 
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
    // $ANTLR end "entryRuleImplementsSurfaceTargetField"


    // $ANTLR start "ruleImplementsSurfaceTargetField"
    // InternalLibrettoSpec.g:4366:1: ruleImplementsSurfaceTargetField returns [EObject current=null] : (otherlv_0= 'target_spec' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) ) ;
    public final EObject ruleImplementsSurfaceTargetField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:4372:2: ( (otherlv_0= 'target_spec' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) ) )
            // InternalLibrettoSpec.g:4373:2: (otherlv_0= 'target_spec' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) )
            {
            // InternalLibrettoSpec.g:4373:2: (otherlv_0= 'target_spec' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) )
            // InternalLibrettoSpec.g:4374:3: otherlv_0= 'target_spec' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getImplementsSurfaceTargetFieldAccess().getTarget_specKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getImplementsSurfaceTargetFieldAccess().getColonKeyword_1());
            		
            // InternalLibrettoSpec.g:4382:3: ( (lv_value_2_0= ruleTextValue ) )
            // InternalLibrettoSpec.g:4383:4: (lv_value_2_0= ruleTextValue )
            {
            // InternalLibrettoSpec.g:4383:4: (lv_value_2_0= ruleTextValue )
            // InternalLibrettoSpec.g:4384:5: lv_value_2_0= ruleTextValue
            {

            					newCompositeNode(grammarAccess.getImplementsSurfaceTargetFieldAccess().getValueTextValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleTextValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImplementsSurfaceTargetFieldRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"com.robenglander.libretto.spec.LibrettoSpec.TextValue");
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
    // $ANTLR end "ruleImplementsSurfaceTargetField"


    // $ANTLR start "entryRuleBoundaryRecord"
    // InternalLibrettoSpec.g:4405:1: entryRuleBoundaryRecord returns [EObject current=null] : iv_ruleBoundaryRecord= ruleBoundaryRecord EOF ;
    public final EObject entryRuleBoundaryRecord() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoundaryRecord = null;


        try {
            // InternalLibrettoSpec.g:4405:55: (iv_ruleBoundaryRecord= ruleBoundaryRecord EOF )
            // InternalLibrettoSpec.g:4406:2: iv_ruleBoundaryRecord= ruleBoundaryRecord EOF
            {
             newCompositeNode(grammarAccess.getBoundaryRecordRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoundaryRecord=ruleBoundaryRecord();

            state._fsp--;

             current =iv_ruleBoundaryRecord; 
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
    // $ANTLR end "entryRuleBoundaryRecord"


    // $ANTLR start "ruleBoundaryRecord"
    // InternalLibrettoSpec.g:4412:1: ruleBoundaryRecord returns [EObject current=null] : (otherlv_0= 'boundary' otherlv_1= '{' ( (lv_items_2_0= ruleBoundaryRecordItem ) )* otherlv_3= '}' ) ;
    public final EObject ruleBoundaryRecord() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_items_2_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:4418:2: ( (otherlv_0= 'boundary' otherlv_1= '{' ( (lv_items_2_0= ruleBoundaryRecordItem ) )* otherlv_3= '}' ) )
            // InternalLibrettoSpec.g:4419:2: (otherlv_0= 'boundary' otherlv_1= '{' ( (lv_items_2_0= ruleBoundaryRecordItem ) )* otherlv_3= '}' )
            {
            // InternalLibrettoSpec.g:4419:2: (otherlv_0= 'boundary' otherlv_1= '{' ( (lv_items_2_0= ruleBoundaryRecordItem ) )* otherlv_3= '}' )
            // InternalLibrettoSpec.g:4420:3: otherlv_0= 'boundary' otherlv_1= '{' ( (lv_items_2_0= ruleBoundaryRecordItem ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,68,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getBoundaryRecordAccess().getBoundaryKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getBoundaryRecordAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalLibrettoSpec.g:4428:3: ( (lv_items_2_0= ruleBoundaryRecordItem ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=69 && LA31_0<=72)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalLibrettoSpec.g:4429:4: (lv_items_2_0= ruleBoundaryRecordItem )
            	    {
            	    // InternalLibrettoSpec.g:4429:4: (lv_items_2_0= ruleBoundaryRecordItem )
            	    // InternalLibrettoSpec.g:4430:5: lv_items_2_0= ruleBoundaryRecordItem
            	    {

            	    					newCompositeNode(grammarAccess.getBoundaryRecordAccess().getItemsBoundaryRecordItemParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_33);
            	    lv_items_2_0=ruleBoundaryRecordItem();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBoundaryRecordRule());
            	    					}
            	    					add(
            	    						current,
            	    						"items",
            	    						lv_items_2_0,
            	    						"com.robenglander.libretto.spec.LibrettoSpec.BoundaryRecordItem");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            otherlv_3=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getBoundaryRecordAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleBoundaryRecord"


    // $ANTLR start "entryRuleBoundaryRecordItem"
    // InternalLibrettoSpec.g:4455:1: entryRuleBoundaryRecordItem returns [EObject current=null] : iv_ruleBoundaryRecordItem= ruleBoundaryRecordItem EOF ;
    public final EObject entryRuleBoundaryRecordItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoundaryRecordItem = null;


        try {
            // InternalLibrettoSpec.g:4455:59: (iv_ruleBoundaryRecordItem= ruleBoundaryRecordItem EOF )
            // InternalLibrettoSpec.g:4456:2: iv_ruleBoundaryRecordItem= ruleBoundaryRecordItem EOF
            {
             newCompositeNode(grammarAccess.getBoundaryRecordItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoundaryRecordItem=ruleBoundaryRecordItem();

            state._fsp--;

             current =iv_ruleBoundaryRecordItem; 
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
    // $ANTLR end "entryRuleBoundaryRecordItem"


    // $ANTLR start "ruleBoundaryRecordItem"
    // InternalLibrettoSpec.g:4462:1: ruleBoundaryRecordItem returns [EObject current=null] : (this_BoundarySpecIdElement_0= ruleBoundarySpecIdElement | this_BoundaryOperationIdElement_1= ruleBoundaryOperationIdElement | this_BoundaryProfileIdElement_2= ruleBoundaryProfileIdElement | this_BoundaryRawElement_3= ruleBoundaryRawElement ) ;
    public final EObject ruleBoundaryRecordItem() throws RecognitionException {
        EObject current = null;

        EObject this_BoundarySpecIdElement_0 = null;

        EObject this_BoundaryOperationIdElement_1 = null;

        EObject this_BoundaryProfileIdElement_2 = null;

        EObject this_BoundaryRawElement_3 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:4468:2: ( (this_BoundarySpecIdElement_0= ruleBoundarySpecIdElement | this_BoundaryOperationIdElement_1= ruleBoundaryOperationIdElement | this_BoundaryProfileIdElement_2= ruleBoundaryProfileIdElement | this_BoundaryRawElement_3= ruleBoundaryRawElement ) )
            // InternalLibrettoSpec.g:4469:2: (this_BoundarySpecIdElement_0= ruleBoundarySpecIdElement | this_BoundaryOperationIdElement_1= ruleBoundaryOperationIdElement | this_BoundaryProfileIdElement_2= ruleBoundaryProfileIdElement | this_BoundaryRawElement_3= ruleBoundaryRawElement )
            {
            // InternalLibrettoSpec.g:4469:2: (this_BoundarySpecIdElement_0= ruleBoundarySpecIdElement | this_BoundaryOperationIdElement_1= ruleBoundaryOperationIdElement | this_BoundaryProfileIdElement_2= ruleBoundaryProfileIdElement | this_BoundaryRawElement_3= ruleBoundaryRawElement )
            int alt32=4;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt32=1;
                }
                break;
            case 70:
                {
                alt32=2;
                }
                break;
            case 71:
                {
                alt32=3;
                }
                break;
            case 72:
                {
                alt32=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalLibrettoSpec.g:4470:3: this_BoundarySpecIdElement_0= ruleBoundarySpecIdElement
                    {

                    			newCompositeNode(grammarAccess.getBoundaryRecordItemAccess().getBoundarySpecIdElementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BoundarySpecIdElement_0=ruleBoundarySpecIdElement();

                    state._fsp--;


                    			current = this_BoundarySpecIdElement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalLibrettoSpec.g:4479:3: this_BoundaryOperationIdElement_1= ruleBoundaryOperationIdElement
                    {

                    			newCompositeNode(grammarAccess.getBoundaryRecordItemAccess().getBoundaryOperationIdElementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_BoundaryOperationIdElement_1=ruleBoundaryOperationIdElement();

                    state._fsp--;


                    			current = this_BoundaryOperationIdElement_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalLibrettoSpec.g:4488:3: this_BoundaryProfileIdElement_2= ruleBoundaryProfileIdElement
                    {

                    			newCompositeNode(grammarAccess.getBoundaryRecordItemAccess().getBoundaryProfileIdElementParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_BoundaryProfileIdElement_2=ruleBoundaryProfileIdElement();

                    state._fsp--;


                    			current = this_BoundaryProfileIdElement_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalLibrettoSpec.g:4497:3: this_BoundaryRawElement_3= ruleBoundaryRawElement
                    {

                    			newCompositeNode(grammarAccess.getBoundaryRecordItemAccess().getBoundaryRawElementParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_BoundaryRawElement_3=ruleBoundaryRawElement();

                    state._fsp--;


                    			current = this_BoundaryRawElement_3;
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
    // $ANTLR end "ruleBoundaryRecordItem"


    // $ANTLR start "entryRuleBoundarySpecIdElement"
    // InternalLibrettoSpec.g:4509:1: entryRuleBoundarySpecIdElement returns [EObject current=null] : iv_ruleBoundarySpecIdElement= ruleBoundarySpecIdElement EOF ;
    public final EObject entryRuleBoundarySpecIdElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoundarySpecIdElement = null;


        try {
            // InternalLibrettoSpec.g:4509:62: (iv_ruleBoundarySpecIdElement= ruleBoundarySpecIdElement EOF )
            // InternalLibrettoSpec.g:4510:2: iv_ruleBoundarySpecIdElement= ruleBoundarySpecIdElement EOF
            {
             newCompositeNode(grammarAccess.getBoundarySpecIdElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoundarySpecIdElement=ruleBoundarySpecIdElement();

            state._fsp--;

             current =iv_ruleBoundarySpecIdElement; 
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
    // $ANTLR end "entryRuleBoundarySpecIdElement"


    // $ANTLR start "ruleBoundarySpecIdElement"
    // InternalLibrettoSpec.g:4516:1: ruleBoundarySpecIdElement returns [EObject current=null] : ( (lv_specIdField_0_0= ruleBoundarySpecIdField ) ) ;
    public final EObject ruleBoundarySpecIdElement() throws RecognitionException {
        EObject current = null;

        EObject lv_specIdField_0_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:4522:2: ( ( (lv_specIdField_0_0= ruleBoundarySpecIdField ) ) )
            // InternalLibrettoSpec.g:4523:2: ( (lv_specIdField_0_0= ruleBoundarySpecIdField ) )
            {
            // InternalLibrettoSpec.g:4523:2: ( (lv_specIdField_0_0= ruleBoundarySpecIdField ) )
            // InternalLibrettoSpec.g:4524:3: (lv_specIdField_0_0= ruleBoundarySpecIdField )
            {
            // InternalLibrettoSpec.g:4524:3: (lv_specIdField_0_0= ruleBoundarySpecIdField )
            // InternalLibrettoSpec.g:4525:4: lv_specIdField_0_0= ruleBoundarySpecIdField
            {

            				newCompositeNode(grammarAccess.getBoundarySpecIdElementAccess().getSpecIdFieldBoundarySpecIdFieldParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_specIdField_0_0=ruleBoundarySpecIdField();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getBoundarySpecIdElementRule());
            				}
            				set(
            					current,
            					"specIdField",
            					lv_specIdField_0_0,
            					"com.robenglander.libretto.spec.LibrettoSpec.BoundarySpecIdField");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleBoundarySpecIdElement"


    // $ANTLR start "entryRuleBoundaryOperationIdElement"
    // InternalLibrettoSpec.g:4545:1: entryRuleBoundaryOperationIdElement returns [EObject current=null] : iv_ruleBoundaryOperationIdElement= ruleBoundaryOperationIdElement EOF ;
    public final EObject entryRuleBoundaryOperationIdElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoundaryOperationIdElement = null;


        try {
            // InternalLibrettoSpec.g:4545:67: (iv_ruleBoundaryOperationIdElement= ruleBoundaryOperationIdElement EOF )
            // InternalLibrettoSpec.g:4546:2: iv_ruleBoundaryOperationIdElement= ruleBoundaryOperationIdElement EOF
            {
             newCompositeNode(grammarAccess.getBoundaryOperationIdElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoundaryOperationIdElement=ruleBoundaryOperationIdElement();

            state._fsp--;

             current =iv_ruleBoundaryOperationIdElement; 
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
    // $ANTLR end "entryRuleBoundaryOperationIdElement"


    // $ANTLR start "ruleBoundaryOperationIdElement"
    // InternalLibrettoSpec.g:4552:1: ruleBoundaryOperationIdElement returns [EObject current=null] : ( (lv_operationIdField_0_0= ruleBoundaryOperationIdField ) ) ;
    public final EObject ruleBoundaryOperationIdElement() throws RecognitionException {
        EObject current = null;

        EObject lv_operationIdField_0_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:4558:2: ( ( (lv_operationIdField_0_0= ruleBoundaryOperationIdField ) ) )
            // InternalLibrettoSpec.g:4559:2: ( (lv_operationIdField_0_0= ruleBoundaryOperationIdField ) )
            {
            // InternalLibrettoSpec.g:4559:2: ( (lv_operationIdField_0_0= ruleBoundaryOperationIdField ) )
            // InternalLibrettoSpec.g:4560:3: (lv_operationIdField_0_0= ruleBoundaryOperationIdField )
            {
            // InternalLibrettoSpec.g:4560:3: (lv_operationIdField_0_0= ruleBoundaryOperationIdField )
            // InternalLibrettoSpec.g:4561:4: lv_operationIdField_0_0= ruleBoundaryOperationIdField
            {

            				newCompositeNode(grammarAccess.getBoundaryOperationIdElementAccess().getOperationIdFieldBoundaryOperationIdFieldParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_operationIdField_0_0=ruleBoundaryOperationIdField();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getBoundaryOperationIdElementRule());
            				}
            				set(
            					current,
            					"operationIdField",
            					lv_operationIdField_0_0,
            					"com.robenglander.libretto.spec.LibrettoSpec.BoundaryOperationIdField");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleBoundaryOperationIdElement"


    // $ANTLR start "entryRuleBoundaryProfileIdElement"
    // InternalLibrettoSpec.g:4581:1: entryRuleBoundaryProfileIdElement returns [EObject current=null] : iv_ruleBoundaryProfileIdElement= ruleBoundaryProfileIdElement EOF ;
    public final EObject entryRuleBoundaryProfileIdElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoundaryProfileIdElement = null;


        try {
            // InternalLibrettoSpec.g:4581:65: (iv_ruleBoundaryProfileIdElement= ruleBoundaryProfileIdElement EOF )
            // InternalLibrettoSpec.g:4582:2: iv_ruleBoundaryProfileIdElement= ruleBoundaryProfileIdElement EOF
            {
             newCompositeNode(grammarAccess.getBoundaryProfileIdElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoundaryProfileIdElement=ruleBoundaryProfileIdElement();

            state._fsp--;

             current =iv_ruleBoundaryProfileIdElement; 
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
    // $ANTLR end "entryRuleBoundaryProfileIdElement"


    // $ANTLR start "ruleBoundaryProfileIdElement"
    // InternalLibrettoSpec.g:4588:1: ruleBoundaryProfileIdElement returns [EObject current=null] : ( (lv_profileIdField_0_0= ruleBoundaryProfileIdField ) ) ;
    public final EObject ruleBoundaryProfileIdElement() throws RecognitionException {
        EObject current = null;

        EObject lv_profileIdField_0_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:4594:2: ( ( (lv_profileIdField_0_0= ruleBoundaryProfileIdField ) ) )
            // InternalLibrettoSpec.g:4595:2: ( (lv_profileIdField_0_0= ruleBoundaryProfileIdField ) )
            {
            // InternalLibrettoSpec.g:4595:2: ( (lv_profileIdField_0_0= ruleBoundaryProfileIdField ) )
            // InternalLibrettoSpec.g:4596:3: (lv_profileIdField_0_0= ruleBoundaryProfileIdField )
            {
            // InternalLibrettoSpec.g:4596:3: (lv_profileIdField_0_0= ruleBoundaryProfileIdField )
            // InternalLibrettoSpec.g:4597:4: lv_profileIdField_0_0= ruleBoundaryProfileIdField
            {

            				newCompositeNode(grammarAccess.getBoundaryProfileIdElementAccess().getProfileIdFieldBoundaryProfileIdFieldParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_profileIdField_0_0=ruleBoundaryProfileIdField();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getBoundaryProfileIdElementRule());
            				}
            				set(
            					current,
            					"profileIdField",
            					lv_profileIdField_0_0,
            					"com.robenglander.libretto.spec.LibrettoSpec.BoundaryProfileIdField");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleBoundaryProfileIdElement"


    // $ANTLR start "entryRuleBoundaryRawElement"
    // InternalLibrettoSpec.g:4617:1: entryRuleBoundaryRawElement returns [EObject current=null] : iv_ruleBoundaryRawElement= ruleBoundaryRawElement EOF ;
    public final EObject entryRuleBoundaryRawElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoundaryRawElement = null;


        try {
            // InternalLibrettoSpec.g:4617:59: (iv_ruleBoundaryRawElement= ruleBoundaryRawElement EOF )
            // InternalLibrettoSpec.g:4618:2: iv_ruleBoundaryRawElement= ruleBoundaryRawElement EOF
            {
             newCompositeNode(grammarAccess.getBoundaryRawElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoundaryRawElement=ruleBoundaryRawElement();

            state._fsp--;

             current =iv_ruleBoundaryRawElement; 
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
    // $ANTLR end "entryRuleBoundaryRawElement"


    // $ANTLR start "ruleBoundaryRawElement"
    // InternalLibrettoSpec.g:4624:1: ruleBoundaryRawElement returns [EObject current=null] : ( (lv_rawField_0_0= ruleBoundaryRawField ) ) ;
    public final EObject ruleBoundaryRawElement() throws RecognitionException {
        EObject current = null;

        EObject lv_rawField_0_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:4630:2: ( ( (lv_rawField_0_0= ruleBoundaryRawField ) ) )
            // InternalLibrettoSpec.g:4631:2: ( (lv_rawField_0_0= ruleBoundaryRawField ) )
            {
            // InternalLibrettoSpec.g:4631:2: ( (lv_rawField_0_0= ruleBoundaryRawField ) )
            // InternalLibrettoSpec.g:4632:3: (lv_rawField_0_0= ruleBoundaryRawField )
            {
            // InternalLibrettoSpec.g:4632:3: (lv_rawField_0_0= ruleBoundaryRawField )
            // InternalLibrettoSpec.g:4633:4: lv_rawField_0_0= ruleBoundaryRawField
            {

            				newCompositeNode(grammarAccess.getBoundaryRawElementAccess().getRawFieldBoundaryRawFieldParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_rawField_0_0=ruleBoundaryRawField();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getBoundaryRawElementRule());
            				}
            				set(
            					current,
            					"rawField",
            					lv_rawField_0_0,
            					"com.robenglander.libretto.spec.LibrettoSpec.BoundaryRawField");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleBoundaryRawElement"


    // $ANTLR start "entryRuleBoundarySpecIdField"
    // InternalLibrettoSpec.g:4653:1: entryRuleBoundarySpecIdField returns [EObject current=null] : iv_ruleBoundarySpecIdField= ruleBoundarySpecIdField EOF ;
    public final EObject entryRuleBoundarySpecIdField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoundarySpecIdField = null;


        try {
            // InternalLibrettoSpec.g:4653:60: (iv_ruleBoundarySpecIdField= ruleBoundarySpecIdField EOF )
            // InternalLibrettoSpec.g:4654:2: iv_ruleBoundarySpecIdField= ruleBoundarySpecIdField EOF
            {
             newCompositeNode(grammarAccess.getBoundarySpecIdFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoundarySpecIdField=ruleBoundarySpecIdField();

            state._fsp--;

             current =iv_ruleBoundarySpecIdField; 
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
    // $ANTLR end "entryRuleBoundarySpecIdField"


    // $ANTLR start "ruleBoundarySpecIdField"
    // InternalLibrettoSpec.g:4660:1: ruleBoundarySpecIdField returns [EObject current=null] : (otherlv_0= 'spec_id' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) ) ;
    public final EObject ruleBoundarySpecIdField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:4666:2: ( (otherlv_0= 'spec_id' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) ) )
            // InternalLibrettoSpec.g:4667:2: (otherlv_0= 'spec_id' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) )
            {
            // InternalLibrettoSpec.g:4667:2: (otherlv_0= 'spec_id' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) )
            // InternalLibrettoSpec.g:4668:3: otherlv_0= 'spec_id' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) )
            {
            otherlv_0=(Token)match(input,69,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getBoundarySpecIdFieldAccess().getSpec_idKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getBoundarySpecIdFieldAccess().getColonKeyword_1());
            		
            // InternalLibrettoSpec.g:4676:3: ( (lv_value_2_0= ruleTextValue ) )
            // InternalLibrettoSpec.g:4677:4: (lv_value_2_0= ruleTextValue )
            {
            // InternalLibrettoSpec.g:4677:4: (lv_value_2_0= ruleTextValue )
            // InternalLibrettoSpec.g:4678:5: lv_value_2_0= ruleTextValue
            {

            					newCompositeNode(grammarAccess.getBoundarySpecIdFieldAccess().getValueTextValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleTextValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBoundarySpecIdFieldRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"com.robenglander.libretto.spec.LibrettoSpec.TextValue");
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
    // $ANTLR end "ruleBoundarySpecIdField"


    // $ANTLR start "entryRuleBoundaryOperationIdField"
    // InternalLibrettoSpec.g:4699:1: entryRuleBoundaryOperationIdField returns [EObject current=null] : iv_ruleBoundaryOperationIdField= ruleBoundaryOperationIdField EOF ;
    public final EObject entryRuleBoundaryOperationIdField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoundaryOperationIdField = null;


        try {
            // InternalLibrettoSpec.g:4699:65: (iv_ruleBoundaryOperationIdField= ruleBoundaryOperationIdField EOF )
            // InternalLibrettoSpec.g:4700:2: iv_ruleBoundaryOperationIdField= ruleBoundaryOperationIdField EOF
            {
             newCompositeNode(grammarAccess.getBoundaryOperationIdFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoundaryOperationIdField=ruleBoundaryOperationIdField();

            state._fsp--;

             current =iv_ruleBoundaryOperationIdField; 
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
    // $ANTLR end "entryRuleBoundaryOperationIdField"


    // $ANTLR start "ruleBoundaryOperationIdField"
    // InternalLibrettoSpec.g:4706:1: ruleBoundaryOperationIdField returns [EObject current=null] : (otherlv_0= 'operation_id' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) ) ;
    public final EObject ruleBoundaryOperationIdField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:4712:2: ( (otherlv_0= 'operation_id' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) ) )
            // InternalLibrettoSpec.g:4713:2: (otherlv_0= 'operation_id' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) )
            {
            // InternalLibrettoSpec.g:4713:2: (otherlv_0= 'operation_id' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) )
            // InternalLibrettoSpec.g:4714:3: otherlv_0= 'operation_id' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) )
            {
            otherlv_0=(Token)match(input,70,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getBoundaryOperationIdFieldAccess().getOperation_idKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getBoundaryOperationIdFieldAccess().getColonKeyword_1());
            		
            // InternalLibrettoSpec.g:4722:3: ( (lv_value_2_0= ruleTextValue ) )
            // InternalLibrettoSpec.g:4723:4: (lv_value_2_0= ruleTextValue )
            {
            // InternalLibrettoSpec.g:4723:4: (lv_value_2_0= ruleTextValue )
            // InternalLibrettoSpec.g:4724:5: lv_value_2_0= ruleTextValue
            {

            					newCompositeNode(grammarAccess.getBoundaryOperationIdFieldAccess().getValueTextValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleTextValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBoundaryOperationIdFieldRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"com.robenglander.libretto.spec.LibrettoSpec.TextValue");
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
    // $ANTLR end "ruleBoundaryOperationIdField"


    // $ANTLR start "entryRuleBoundaryProfileIdField"
    // InternalLibrettoSpec.g:4745:1: entryRuleBoundaryProfileIdField returns [EObject current=null] : iv_ruleBoundaryProfileIdField= ruleBoundaryProfileIdField EOF ;
    public final EObject entryRuleBoundaryProfileIdField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoundaryProfileIdField = null;


        try {
            // InternalLibrettoSpec.g:4745:63: (iv_ruleBoundaryProfileIdField= ruleBoundaryProfileIdField EOF )
            // InternalLibrettoSpec.g:4746:2: iv_ruleBoundaryProfileIdField= ruleBoundaryProfileIdField EOF
            {
             newCompositeNode(grammarAccess.getBoundaryProfileIdFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoundaryProfileIdField=ruleBoundaryProfileIdField();

            state._fsp--;

             current =iv_ruleBoundaryProfileIdField; 
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
    // $ANTLR end "entryRuleBoundaryProfileIdField"


    // $ANTLR start "ruleBoundaryProfileIdField"
    // InternalLibrettoSpec.g:4752:1: ruleBoundaryProfileIdField returns [EObject current=null] : (otherlv_0= 'profile_id' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) ) ;
    public final EObject ruleBoundaryProfileIdField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:4758:2: ( (otherlv_0= 'profile_id' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) ) )
            // InternalLibrettoSpec.g:4759:2: (otherlv_0= 'profile_id' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) )
            {
            // InternalLibrettoSpec.g:4759:2: (otherlv_0= 'profile_id' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) )
            // InternalLibrettoSpec.g:4760:3: otherlv_0= 'profile_id' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) )
            {
            otherlv_0=(Token)match(input,71,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getBoundaryProfileIdFieldAccess().getProfile_idKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getBoundaryProfileIdFieldAccess().getColonKeyword_1());
            		
            // InternalLibrettoSpec.g:4768:3: ( (lv_value_2_0= ruleTextValue ) )
            // InternalLibrettoSpec.g:4769:4: (lv_value_2_0= ruleTextValue )
            {
            // InternalLibrettoSpec.g:4769:4: (lv_value_2_0= ruleTextValue )
            // InternalLibrettoSpec.g:4770:5: lv_value_2_0= ruleTextValue
            {

            					newCompositeNode(grammarAccess.getBoundaryProfileIdFieldAccess().getValueTextValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleTextValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBoundaryProfileIdFieldRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"com.robenglander.libretto.spec.LibrettoSpec.TextValue");
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
    // $ANTLR end "ruleBoundaryProfileIdField"


    // $ANTLR start "entryRuleBoundaryRawField"
    // InternalLibrettoSpec.g:4791:1: entryRuleBoundaryRawField returns [EObject current=null] : iv_ruleBoundaryRawField= ruleBoundaryRawField EOF ;
    public final EObject entryRuleBoundaryRawField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoundaryRawField = null;


        try {
            // InternalLibrettoSpec.g:4791:57: (iv_ruleBoundaryRawField= ruleBoundaryRawField EOF )
            // InternalLibrettoSpec.g:4792:2: iv_ruleBoundaryRawField= ruleBoundaryRawField EOF
            {
             newCompositeNode(grammarAccess.getBoundaryRawFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoundaryRawField=ruleBoundaryRawField();

            state._fsp--;

             current =iv_ruleBoundaryRawField; 
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
    // $ANTLR end "entryRuleBoundaryRawField"


    // $ANTLR start "ruleBoundaryRawField"
    // InternalLibrettoSpec.g:4798:1: ruleBoundaryRawField returns [EObject current=null] : (otherlv_0= 'raw' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) ) ;
    public final EObject ruleBoundaryRawField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:4804:2: ( (otherlv_0= 'raw' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) ) )
            // InternalLibrettoSpec.g:4805:2: (otherlv_0= 'raw' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) )
            {
            // InternalLibrettoSpec.g:4805:2: (otherlv_0= 'raw' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) )
            // InternalLibrettoSpec.g:4806:3: otherlv_0= 'raw' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) )
            {
            otherlv_0=(Token)match(input,72,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getBoundaryRawFieldAccess().getRawKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getBoundaryRawFieldAccess().getColonKeyword_1());
            		
            // InternalLibrettoSpec.g:4814:3: ( (lv_value_2_0= ruleTextValue ) )
            // InternalLibrettoSpec.g:4815:4: (lv_value_2_0= ruleTextValue )
            {
            // InternalLibrettoSpec.g:4815:4: (lv_value_2_0= ruleTextValue )
            // InternalLibrettoSpec.g:4816:5: lv_value_2_0= ruleTextValue
            {

            					newCompositeNode(grammarAccess.getBoundaryRawFieldAccess().getValueTextValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleTextValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBoundaryRawFieldRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"com.robenglander.libretto.spec.LibrettoSpec.TextValue");
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
    // $ANTLR end "ruleBoundaryRawField"


    // $ANTLR start "entryRuleAcceptanceTestRecord"
    // InternalLibrettoSpec.g:4837:1: entryRuleAcceptanceTestRecord returns [EObject current=null] : iv_ruleAcceptanceTestRecord= ruleAcceptanceTestRecord EOF ;
    public final EObject entryRuleAcceptanceTestRecord() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAcceptanceTestRecord = null;


        try {
            // InternalLibrettoSpec.g:4837:61: (iv_ruleAcceptanceTestRecord= ruleAcceptanceTestRecord EOF )
            // InternalLibrettoSpec.g:4838:2: iv_ruleAcceptanceTestRecord= ruleAcceptanceTestRecord EOF
            {
             newCompositeNode(grammarAccess.getAcceptanceTestRecordRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAcceptanceTestRecord=ruleAcceptanceTestRecord();

            state._fsp--;

             current =iv_ruleAcceptanceTestRecord; 
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
    // $ANTLR end "entryRuleAcceptanceTestRecord"


    // $ANTLR start "ruleAcceptanceTestRecord"
    // InternalLibrettoSpec.g:4844:1: ruleAcceptanceTestRecord returns [EObject current=null] : (otherlv_0= 'acceptance_test' ( (lv_id_1_0= ruleAcceptanceTestId ) ) otherlv_2= '{' ( (lv_items_3_0= ruleAcceptanceTestRecordItem ) )* otherlv_4= '}' ) ;
    public final EObject ruleAcceptanceTestRecord() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_id_1_0 = null;

        EObject lv_items_3_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:4850:2: ( (otherlv_0= 'acceptance_test' ( (lv_id_1_0= ruleAcceptanceTestId ) ) otherlv_2= '{' ( (lv_items_3_0= ruleAcceptanceTestRecordItem ) )* otherlv_4= '}' ) )
            // InternalLibrettoSpec.g:4851:2: (otherlv_0= 'acceptance_test' ( (lv_id_1_0= ruleAcceptanceTestId ) ) otherlv_2= '{' ( (lv_items_3_0= ruleAcceptanceTestRecordItem ) )* otherlv_4= '}' )
            {
            // InternalLibrettoSpec.g:4851:2: (otherlv_0= 'acceptance_test' ( (lv_id_1_0= ruleAcceptanceTestId ) ) otherlv_2= '{' ( (lv_items_3_0= ruleAcceptanceTestRecordItem ) )* otherlv_4= '}' )
            // InternalLibrettoSpec.g:4852:3: otherlv_0= 'acceptance_test' ( (lv_id_1_0= ruleAcceptanceTestId ) ) otherlv_2= '{' ( (lv_items_3_0= ruleAcceptanceTestRecordItem ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,73,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getAcceptanceTestRecordAccess().getAcceptance_testKeyword_0());
            		
            // InternalLibrettoSpec.g:4856:3: ( (lv_id_1_0= ruleAcceptanceTestId ) )
            // InternalLibrettoSpec.g:4857:4: (lv_id_1_0= ruleAcceptanceTestId )
            {
            // InternalLibrettoSpec.g:4857:4: (lv_id_1_0= ruleAcceptanceTestId )
            // InternalLibrettoSpec.g:4858:5: lv_id_1_0= ruleAcceptanceTestId
            {

            					newCompositeNode(grammarAccess.getAcceptanceTestRecordAccess().getIdAcceptanceTestIdParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_id_1_0=ruleAcceptanceTestId();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAcceptanceTestRecordRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_1_0,
            						"com.robenglander.libretto.spec.LibrettoSpec.AcceptanceTestId");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_35); 

            			newLeafNode(otherlv_2, grammarAccess.getAcceptanceTestRecordAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLibrettoSpec.g:4879:3: ( (lv_items_3_0= ruleAcceptanceTestRecordItem ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==22||LA33_0==32||(LA33_0>=62 && LA33_0<=63)||(LA33_0>=74 && LA33_0<=77)||LA33_0==86) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalLibrettoSpec.g:4880:4: (lv_items_3_0= ruleAcceptanceTestRecordItem )
            	    {
            	    // InternalLibrettoSpec.g:4880:4: (lv_items_3_0= ruleAcceptanceTestRecordItem )
            	    // InternalLibrettoSpec.g:4881:5: lv_items_3_0= ruleAcceptanceTestRecordItem
            	    {

            	    					newCompositeNode(grammarAccess.getAcceptanceTestRecordAccess().getItemsAcceptanceTestRecordItemParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_35);
            	    lv_items_3_0=ruleAcceptanceTestRecordItem();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAcceptanceTestRecordRule());
            	    					}
            	    					add(
            	    						current,
            	    						"items",
            	    						lv_items_3_0,
            	    						"com.robenglander.libretto.spec.LibrettoSpec.AcceptanceTestRecordItem");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getAcceptanceTestRecordAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleAcceptanceTestRecord"


    // $ANTLR start "entryRuleAcceptanceTestRecordItem"
    // InternalLibrettoSpec.g:4906:1: entryRuleAcceptanceTestRecordItem returns [EObject current=null] : iv_ruleAcceptanceTestRecordItem= ruleAcceptanceTestRecordItem EOF ;
    public final EObject entryRuleAcceptanceTestRecordItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAcceptanceTestRecordItem = null;


        try {
            // InternalLibrettoSpec.g:4906:65: (iv_ruleAcceptanceTestRecordItem= ruleAcceptanceTestRecordItem EOF )
            // InternalLibrettoSpec.g:4907:2: iv_ruleAcceptanceTestRecordItem= ruleAcceptanceTestRecordItem EOF
            {
             newCompositeNode(grammarAccess.getAcceptanceTestRecordItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAcceptanceTestRecordItem=ruleAcceptanceTestRecordItem();

            state._fsp--;

             current =iv_ruleAcceptanceTestRecordItem; 
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
    // $ANTLR end "entryRuleAcceptanceTestRecordItem"


    // $ANTLR start "ruleAcceptanceTestRecordItem"
    // InternalLibrettoSpec.g:4913:1: ruleAcceptanceTestRecordItem returns [EObject current=null] : (this_AcceptanceTestSourceItem_0= ruleAcceptanceTestSourceItem | this_AcceptanceTestValidatesItem_1= ruleAcceptanceTestValidatesItem | this_AcceptanceTestPreconditionsItem_2= ruleAcceptanceTestPreconditionsItem | this_AcceptanceTestActionsItem_3= ruleAcceptanceTestActionsItem | this_AcceptanceTestAssertionsItem_4= ruleAcceptanceTestAssertionsItem | this_AcceptanceTestTitleItem_5= ruleAcceptanceTestTitleItem | this_AcceptanceTestReferencesItem_6= ruleAcceptanceTestReferencesItem | this_AcceptanceTestNotesItem_7= ruleAcceptanceTestNotesItem | this_AcceptanceTestContextItem_8= ruleAcceptanceTestContextItem ) ;
    public final EObject ruleAcceptanceTestRecordItem() throws RecognitionException {
        EObject current = null;

        EObject this_AcceptanceTestSourceItem_0 = null;

        EObject this_AcceptanceTestValidatesItem_1 = null;

        EObject this_AcceptanceTestPreconditionsItem_2 = null;

        EObject this_AcceptanceTestActionsItem_3 = null;

        EObject this_AcceptanceTestAssertionsItem_4 = null;

        EObject this_AcceptanceTestTitleItem_5 = null;

        EObject this_AcceptanceTestReferencesItem_6 = null;

        EObject this_AcceptanceTestNotesItem_7 = null;

        EObject this_AcceptanceTestContextItem_8 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:4919:2: ( (this_AcceptanceTestSourceItem_0= ruleAcceptanceTestSourceItem | this_AcceptanceTestValidatesItem_1= ruleAcceptanceTestValidatesItem | this_AcceptanceTestPreconditionsItem_2= ruleAcceptanceTestPreconditionsItem | this_AcceptanceTestActionsItem_3= ruleAcceptanceTestActionsItem | this_AcceptanceTestAssertionsItem_4= ruleAcceptanceTestAssertionsItem | this_AcceptanceTestTitleItem_5= ruleAcceptanceTestTitleItem | this_AcceptanceTestReferencesItem_6= ruleAcceptanceTestReferencesItem | this_AcceptanceTestNotesItem_7= ruleAcceptanceTestNotesItem | this_AcceptanceTestContextItem_8= ruleAcceptanceTestContextItem ) )
            // InternalLibrettoSpec.g:4920:2: (this_AcceptanceTestSourceItem_0= ruleAcceptanceTestSourceItem | this_AcceptanceTestValidatesItem_1= ruleAcceptanceTestValidatesItem | this_AcceptanceTestPreconditionsItem_2= ruleAcceptanceTestPreconditionsItem | this_AcceptanceTestActionsItem_3= ruleAcceptanceTestActionsItem | this_AcceptanceTestAssertionsItem_4= ruleAcceptanceTestAssertionsItem | this_AcceptanceTestTitleItem_5= ruleAcceptanceTestTitleItem | this_AcceptanceTestReferencesItem_6= ruleAcceptanceTestReferencesItem | this_AcceptanceTestNotesItem_7= ruleAcceptanceTestNotesItem | this_AcceptanceTestContextItem_8= ruleAcceptanceTestContextItem )
            {
            // InternalLibrettoSpec.g:4920:2: (this_AcceptanceTestSourceItem_0= ruleAcceptanceTestSourceItem | this_AcceptanceTestValidatesItem_1= ruleAcceptanceTestValidatesItem | this_AcceptanceTestPreconditionsItem_2= ruleAcceptanceTestPreconditionsItem | this_AcceptanceTestActionsItem_3= ruleAcceptanceTestActionsItem | this_AcceptanceTestAssertionsItem_4= ruleAcceptanceTestAssertionsItem | this_AcceptanceTestTitleItem_5= ruleAcceptanceTestTitleItem | this_AcceptanceTestReferencesItem_6= ruleAcceptanceTestReferencesItem | this_AcceptanceTestNotesItem_7= ruleAcceptanceTestNotesItem | this_AcceptanceTestContextItem_8= ruleAcceptanceTestContextItem )
            int alt34=9;
            switch ( input.LA(1) ) {
            case 86:
                {
                alt34=1;
                }
                break;
            case 74:
                {
                alt34=2;
                }
                break;
            case 75:
                {
                alt34=3;
                }
                break;
            case 76:
                {
                alt34=4;
                }
                break;
            case 77:
                {
                alt34=5;
                }
                break;
            case 32:
                {
                alt34=6;
                }
                break;
            case 22:
                {
                alt34=7;
                }
                break;
            case 62:
                {
                alt34=8;
                }
                break;
            case 63:
                {
                alt34=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalLibrettoSpec.g:4921:3: this_AcceptanceTestSourceItem_0= ruleAcceptanceTestSourceItem
                    {

                    			newCompositeNode(grammarAccess.getAcceptanceTestRecordItemAccess().getAcceptanceTestSourceItemParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AcceptanceTestSourceItem_0=ruleAcceptanceTestSourceItem();

                    state._fsp--;


                    			current = this_AcceptanceTestSourceItem_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalLibrettoSpec.g:4930:3: this_AcceptanceTestValidatesItem_1= ruleAcceptanceTestValidatesItem
                    {

                    			newCompositeNode(grammarAccess.getAcceptanceTestRecordItemAccess().getAcceptanceTestValidatesItemParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AcceptanceTestValidatesItem_1=ruleAcceptanceTestValidatesItem();

                    state._fsp--;


                    			current = this_AcceptanceTestValidatesItem_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalLibrettoSpec.g:4939:3: this_AcceptanceTestPreconditionsItem_2= ruleAcceptanceTestPreconditionsItem
                    {

                    			newCompositeNode(grammarAccess.getAcceptanceTestRecordItemAccess().getAcceptanceTestPreconditionsItemParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_AcceptanceTestPreconditionsItem_2=ruleAcceptanceTestPreconditionsItem();

                    state._fsp--;


                    			current = this_AcceptanceTestPreconditionsItem_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalLibrettoSpec.g:4948:3: this_AcceptanceTestActionsItem_3= ruleAcceptanceTestActionsItem
                    {

                    			newCompositeNode(grammarAccess.getAcceptanceTestRecordItemAccess().getAcceptanceTestActionsItemParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_AcceptanceTestActionsItem_3=ruleAcceptanceTestActionsItem();

                    state._fsp--;


                    			current = this_AcceptanceTestActionsItem_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalLibrettoSpec.g:4957:3: this_AcceptanceTestAssertionsItem_4= ruleAcceptanceTestAssertionsItem
                    {

                    			newCompositeNode(grammarAccess.getAcceptanceTestRecordItemAccess().getAcceptanceTestAssertionsItemParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_AcceptanceTestAssertionsItem_4=ruleAcceptanceTestAssertionsItem();

                    state._fsp--;


                    			current = this_AcceptanceTestAssertionsItem_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalLibrettoSpec.g:4966:3: this_AcceptanceTestTitleItem_5= ruleAcceptanceTestTitleItem
                    {

                    			newCompositeNode(grammarAccess.getAcceptanceTestRecordItemAccess().getAcceptanceTestTitleItemParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_AcceptanceTestTitleItem_5=ruleAcceptanceTestTitleItem();

                    state._fsp--;


                    			current = this_AcceptanceTestTitleItem_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalLibrettoSpec.g:4975:3: this_AcceptanceTestReferencesItem_6= ruleAcceptanceTestReferencesItem
                    {

                    			newCompositeNode(grammarAccess.getAcceptanceTestRecordItemAccess().getAcceptanceTestReferencesItemParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_AcceptanceTestReferencesItem_6=ruleAcceptanceTestReferencesItem();

                    state._fsp--;


                    			current = this_AcceptanceTestReferencesItem_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalLibrettoSpec.g:4984:3: this_AcceptanceTestNotesItem_7= ruleAcceptanceTestNotesItem
                    {

                    			newCompositeNode(grammarAccess.getAcceptanceTestRecordItemAccess().getAcceptanceTestNotesItemParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_AcceptanceTestNotesItem_7=ruleAcceptanceTestNotesItem();

                    state._fsp--;


                    			current = this_AcceptanceTestNotesItem_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalLibrettoSpec.g:4993:3: this_AcceptanceTestContextItem_8= ruleAcceptanceTestContextItem
                    {

                    			newCompositeNode(grammarAccess.getAcceptanceTestRecordItemAccess().getAcceptanceTestContextItemParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_AcceptanceTestContextItem_8=ruleAcceptanceTestContextItem();

                    state._fsp--;


                    			current = this_AcceptanceTestContextItem_8;
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
    // $ANTLR end "ruleAcceptanceTestRecordItem"


    // $ANTLR start "entryRuleAcceptanceTestSourceItem"
    // InternalLibrettoSpec.g:5005:1: entryRuleAcceptanceTestSourceItem returns [EObject current=null] : iv_ruleAcceptanceTestSourceItem= ruleAcceptanceTestSourceItem EOF ;
    public final EObject entryRuleAcceptanceTestSourceItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAcceptanceTestSourceItem = null;


        try {
            // InternalLibrettoSpec.g:5005:65: (iv_ruleAcceptanceTestSourceItem= ruleAcceptanceTestSourceItem EOF )
            // InternalLibrettoSpec.g:5006:2: iv_ruleAcceptanceTestSourceItem= ruleAcceptanceTestSourceItem EOF
            {
             newCompositeNode(grammarAccess.getAcceptanceTestSourceItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAcceptanceTestSourceItem=ruleAcceptanceTestSourceItem();

            state._fsp--;

             current =iv_ruleAcceptanceTestSourceItem; 
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
    // $ANTLR end "entryRuleAcceptanceTestSourceItem"


    // $ANTLR start "ruleAcceptanceTestSourceItem"
    // InternalLibrettoSpec.g:5012:1: ruleAcceptanceTestSourceItem returns [EObject current=null] : ( (lv_source_0_0= ruleSourceBlock ) ) ;
    public final EObject ruleAcceptanceTestSourceItem() throws RecognitionException {
        EObject current = null;

        EObject lv_source_0_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:5018:2: ( ( (lv_source_0_0= ruleSourceBlock ) ) )
            // InternalLibrettoSpec.g:5019:2: ( (lv_source_0_0= ruleSourceBlock ) )
            {
            // InternalLibrettoSpec.g:5019:2: ( (lv_source_0_0= ruleSourceBlock ) )
            // InternalLibrettoSpec.g:5020:3: (lv_source_0_0= ruleSourceBlock )
            {
            // InternalLibrettoSpec.g:5020:3: (lv_source_0_0= ruleSourceBlock )
            // InternalLibrettoSpec.g:5021:4: lv_source_0_0= ruleSourceBlock
            {

            				newCompositeNode(grammarAccess.getAcceptanceTestSourceItemAccess().getSourceSourceBlockParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_source_0_0=ruleSourceBlock();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getAcceptanceTestSourceItemRule());
            				}
            				set(
            					current,
            					"source",
            					lv_source_0_0,
            					"com.robenglander.libretto.spec.LibrettoSpec.SourceBlock");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleAcceptanceTestSourceItem"


    // $ANTLR start "entryRuleAcceptanceTestValidatesItem"
    // InternalLibrettoSpec.g:5041:1: entryRuleAcceptanceTestValidatesItem returns [EObject current=null] : iv_ruleAcceptanceTestValidatesItem= ruleAcceptanceTestValidatesItem EOF ;
    public final EObject entryRuleAcceptanceTestValidatesItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAcceptanceTestValidatesItem = null;


        try {
            // InternalLibrettoSpec.g:5041:68: (iv_ruleAcceptanceTestValidatesItem= ruleAcceptanceTestValidatesItem EOF )
            // InternalLibrettoSpec.g:5042:2: iv_ruleAcceptanceTestValidatesItem= ruleAcceptanceTestValidatesItem EOF
            {
             newCompositeNode(grammarAccess.getAcceptanceTestValidatesItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAcceptanceTestValidatesItem=ruleAcceptanceTestValidatesItem();

            state._fsp--;

             current =iv_ruleAcceptanceTestValidatesItem; 
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
    // $ANTLR end "entryRuleAcceptanceTestValidatesItem"


    // $ANTLR start "ruleAcceptanceTestValidatesItem"
    // InternalLibrettoSpec.g:5048:1: ruleAcceptanceTestValidatesItem returns [EObject current=null] : ( (lv_validates_0_0= ruleValidatesField ) ) ;
    public final EObject ruleAcceptanceTestValidatesItem() throws RecognitionException {
        EObject current = null;

        EObject lv_validates_0_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:5054:2: ( ( (lv_validates_0_0= ruleValidatesField ) ) )
            // InternalLibrettoSpec.g:5055:2: ( (lv_validates_0_0= ruleValidatesField ) )
            {
            // InternalLibrettoSpec.g:5055:2: ( (lv_validates_0_0= ruleValidatesField ) )
            // InternalLibrettoSpec.g:5056:3: (lv_validates_0_0= ruleValidatesField )
            {
            // InternalLibrettoSpec.g:5056:3: (lv_validates_0_0= ruleValidatesField )
            // InternalLibrettoSpec.g:5057:4: lv_validates_0_0= ruleValidatesField
            {

            				newCompositeNode(grammarAccess.getAcceptanceTestValidatesItemAccess().getValidatesValidatesFieldParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_validates_0_0=ruleValidatesField();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getAcceptanceTestValidatesItemRule());
            				}
            				set(
            					current,
            					"validates",
            					lv_validates_0_0,
            					"com.robenglander.libretto.spec.LibrettoSpec.ValidatesField");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleAcceptanceTestValidatesItem"


    // $ANTLR start "entryRuleAcceptanceTestPreconditionsItem"
    // InternalLibrettoSpec.g:5077:1: entryRuleAcceptanceTestPreconditionsItem returns [EObject current=null] : iv_ruleAcceptanceTestPreconditionsItem= ruleAcceptanceTestPreconditionsItem EOF ;
    public final EObject entryRuleAcceptanceTestPreconditionsItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAcceptanceTestPreconditionsItem = null;


        try {
            // InternalLibrettoSpec.g:5077:72: (iv_ruleAcceptanceTestPreconditionsItem= ruleAcceptanceTestPreconditionsItem EOF )
            // InternalLibrettoSpec.g:5078:2: iv_ruleAcceptanceTestPreconditionsItem= ruleAcceptanceTestPreconditionsItem EOF
            {
             newCompositeNode(grammarAccess.getAcceptanceTestPreconditionsItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAcceptanceTestPreconditionsItem=ruleAcceptanceTestPreconditionsItem();

            state._fsp--;

             current =iv_ruleAcceptanceTestPreconditionsItem; 
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
    // $ANTLR end "entryRuleAcceptanceTestPreconditionsItem"


    // $ANTLR start "ruleAcceptanceTestPreconditionsItem"
    // InternalLibrettoSpec.g:5084:1: ruleAcceptanceTestPreconditionsItem returns [EObject current=null] : ( (lv_preconditions_0_0= rulePreconditionsField ) ) ;
    public final EObject ruleAcceptanceTestPreconditionsItem() throws RecognitionException {
        EObject current = null;

        EObject lv_preconditions_0_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:5090:2: ( ( (lv_preconditions_0_0= rulePreconditionsField ) ) )
            // InternalLibrettoSpec.g:5091:2: ( (lv_preconditions_0_0= rulePreconditionsField ) )
            {
            // InternalLibrettoSpec.g:5091:2: ( (lv_preconditions_0_0= rulePreconditionsField ) )
            // InternalLibrettoSpec.g:5092:3: (lv_preconditions_0_0= rulePreconditionsField )
            {
            // InternalLibrettoSpec.g:5092:3: (lv_preconditions_0_0= rulePreconditionsField )
            // InternalLibrettoSpec.g:5093:4: lv_preconditions_0_0= rulePreconditionsField
            {

            				newCompositeNode(grammarAccess.getAcceptanceTestPreconditionsItemAccess().getPreconditionsPreconditionsFieldParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_preconditions_0_0=rulePreconditionsField();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getAcceptanceTestPreconditionsItemRule());
            				}
            				set(
            					current,
            					"preconditions",
            					lv_preconditions_0_0,
            					"com.robenglander.libretto.spec.LibrettoSpec.PreconditionsField");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleAcceptanceTestPreconditionsItem"


    // $ANTLR start "entryRuleAcceptanceTestActionsItem"
    // InternalLibrettoSpec.g:5113:1: entryRuleAcceptanceTestActionsItem returns [EObject current=null] : iv_ruleAcceptanceTestActionsItem= ruleAcceptanceTestActionsItem EOF ;
    public final EObject entryRuleAcceptanceTestActionsItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAcceptanceTestActionsItem = null;


        try {
            // InternalLibrettoSpec.g:5113:66: (iv_ruleAcceptanceTestActionsItem= ruleAcceptanceTestActionsItem EOF )
            // InternalLibrettoSpec.g:5114:2: iv_ruleAcceptanceTestActionsItem= ruleAcceptanceTestActionsItem EOF
            {
             newCompositeNode(grammarAccess.getAcceptanceTestActionsItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAcceptanceTestActionsItem=ruleAcceptanceTestActionsItem();

            state._fsp--;

             current =iv_ruleAcceptanceTestActionsItem; 
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
    // $ANTLR end "entryRuleAcceptanceTestActionsItem"


    // $ANTLR start "ruleAcceptanceTestActionsItem"
    // InternalLibrettoSpec.g:5120:1: ruleAcceptanceTestActionsItem returns [EObject current=null] : ( (lv_actions_0_0= ruleActionsField ) ) ;
    public final EObject ruleAcceptanceTestActionsItem() throws RecognitionException {
        EObject current = null;

        EObject lv_actions_0_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:5126:2: ( ( (lv_actions_0_0= ruleActionsField ) ) )
            // InternalLibrettoSpec.g:5127:2: ( (lv_actions_0_0= ruleActionsField ) )
            {
            // InternalLibrettoSpec.g:5127:2: ( (lv_actions_0_0= ruleActionsField ) )
            // InternalLibrettoSpec.g:5128:3: (lv_actions_0_0= ruleActionsField )
            {
            // InternalLibrettoSpec.g:5128:3: (lv_actions_0_0= ruleActionsField )
            // InternalLibrettoSpec.g:5129:4: lv_actions_0_0= ruleActionsField
            {

            				newCompositeNode(grammarAccess.getAcceptanceTestActionsItemAccess().getActionsActionsFieldParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_actions_0_0=ruleActionsField();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getAcceptanceTestActionsItemRule());
            				}
            				set(
            					current,
            					"actions",
            					lv_actions_0_0,
            					"com.robenglander.libretto.spec.LibrettoSpec.ActionsField");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleAcceptanceTestActionsItem"


    // $ANTLR start "entryRuleAcceptanceTestAssertionsItem"
    // InternalLibrettoSpec.g:5149:1: entryRuleAcceptanceTestAssertionsItem returns [EObject current=null] : iv_ruleAcceptanceTestAssertionsItem= ruleAcceptanceTestAssertionsItem EOF ;
    public final EObject entryRuleAcceptanceTestAssertionsItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAcceptanceTestAssertionsItem = null;


        try {
            // InternalLibrettoSpec.g:5149:69: (iv_ruleAcceptanceTestAssertionsItem= ruleAcceptanceTestAssertionsItem EOF )
            // InternalLibrettoSpec.g:5150:2: iv_ruleAcceptanceTestAssertionsItem= ruleAcceptanceTestAssertionsItem EOF
            {
             newCompositeNode(grammarAccess.getAcceptanceTestAssertionsItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAcceptanceTestAssertionsItem=ruleAcceptanceTestAssertionsItem();

            state._fsp--;

             current =iv_ruleAcceptanceTestAssertionsItem; 
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
    // $ANTLR end "entryRuleAcceptanceTestAssertionsItem"


    // $ANTLR start "ruleAcceptanceTestAssertionsItem"
    // InternalLibrettoSpec.g:5156:1: ruleAcceptanceTestAssertionsItem returns [EObject current=null] : ( (lv_assertions_0_0= ruleAssertionsField ) ) ;
    public final EObject ruleAcceptanceTestAssertionsItem() throws RecognitionException {
        EObject current = null;

        EObject lv_assertions_0_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:5162:2: ( ( (lv_assertions_0_0= ruleAssertionsField ) ) )
            // InternalLibrettoSpec.g:5163:2: ( (lv_assertions_0_0= ruleAssertionsField ) )
            {
            // InternalLibrettoSpec.g:5163:2: ( (lv_assertions_0_0= ruleAssertionsField ) )
            // InternalLibrettoSpec.g:5164:3: (lv_assertions_0_0= ruleAssertionsField )
            {
            // InternalLibrettoSpec.g:5164:3: (lv_assertions_0_0= ruleAssertionsField )
            // InternalLibrettoSpec.g:5165:4: lv_assertions_0_0= ruleAssertionsField
            {

            				newCompositeNode(grammarAccess.getAcceptanceTestAssertionsItemAccess().getAssertionsAssertionsFieldParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_assertions_0_0=ruleAssertionsField();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getAcceptanceTestAssertionsItemRule());
            				}
            				set(
            					current,
            					"assertions",
            					lv_assertions_0_0,
            					"com.robenglander.libretto.spec.LibrettoSpec.AssertionsField");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleAcceptanceTestAssertionsItem"


    // $ANTLR start "entryRuleAcceptanceTestTitleItem"
    // InternalLibrettoSpec.g:5185:1: entryRuleAcceptanceTestTitleItem returns [EObject current=null] : iv_ruleAcceptanceTestTitleItem= ruleAcceptanceTestTitleItem EOF ;
    public final EObject entryRuleAcceptanceTestTitleItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAcceptanceTestTitleItem = null;


        try {
            // InternalLibrettoSpec.g:5185:64: (iv_ruleAcceptanceTestTitleItem= ruleAcceptanceTestTitleItem EOF )
            // InternalLibrettoSpec.g:5186:2: iv_ruleAcceptanceTestTitleItem= ruleAcceptanceTestTitleItem EOF
            {
             newCompositeNode(grammarAccess.getAcceptanceTestTitleItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAcceptanceTestTitleItem=ruleAcceptanceTestTitleItem();

            state._fsp--;

             current =iv_ruleAcceptanceTestTitleItem; 
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
    // $ANTLR end "entryRuleAcceptanceTestTitleItem"


    // $ANTLR start "ruleAcceptanceTestTitleItem"
    // InternalLibrettoSpec.g:5192:1: ruleAcceptanceTestTitleItem returns [EObject current=null] : ( (lv_title_0_0= ruleTitleField ) ) ;
    public final EObject ruleAcceptanceTestTitleItem() throws RecognitionException {
        EObject current = null;

        EObject lv_title_0_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:5198:2: ( ( (lv_title_0_0= ruleTitleField ) ) )
            // InternalLibrettoSpec.g:5199:2: ( (lv_title_0_0= ruleTitleField ) )
            {
            // InternalLibrettoSpec.g:5199:2: ( (lv_title_0_0= ruleTitleField ) )
            // InternalLibrettoSpec.g:5200:3: (lv_title_0_0= ruleTitleField )
            {
            // InternalLibrettoSpec.g:5200:3: (lv_title_0_0= ruleTitleField )
            // InternalLibrettoSpec.g:5201:4: lv_title_0_0= ruleTitleField
            {

            				newCompositeNode(grammarAccess.getAcceptanceTestTitleItemAccess().getTitleTitleFieldParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_title_0_0=ruleTitleField();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getAcceptanceTestTitleItemRule());
            				}
            				set(
            					current,
            					"title",
            					lv_title_0_0,
            					"com.robenglander.libretto.spec.LibrettoSpec.TitleField");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleAcceptanceTestTitleItem"


    // $ANTLR start "entryRuleAcceptanceTestReferencesItem"
    // InternalLibrettoSpec.g:5221:1: entryRuleAcceptanceTestReferencesItem returns [EObject current=null] : iv_ruleAcceptanceTestReferencesItem= ruleAcceptanceTestReferencesItem EOF ;
    public final EObject entryRuleAcceptanceTestReferencesItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAcceptanceTestReferencesItem = null;


        try {
            // InternalLibrettoSpec.g:5221:69: (iv_ruleAcceptanceTestReferencesItem= ruleAcceptanceTestReferencesItem EOF )
            // InternalLibrettoSpec.g:5222:2: iv_ruleAcceptanceTestReferencesItem= ruleAcceptanceTestReferencesItem EOF
            {
             newCompositeNode(grammarAccess.getAcceptanceTestReferencesItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAcceptanceTestReferencesItem=ruleAcceptanceTestReferencesItem();

            state._fsp--;

             current =iv_ruleAcceptanceTestReferencesItem; 
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
    // $ANTLR end "entryRuleAcceptanceTestReferencesItem"


    // $ANTLR start "ruleAcceptanceTestReferencesItem"
    // InternalLibrettoSpec.g:5228:1: ruleAcceptanceTestReferencesItem returns [EObject current=null] : ( (lv_references_0_0= ruleReferencesField ) ) ;
    public final EObject ruleAcceptanceTestReferencesItem() throws RecognitionException {
        EObject current = null;

        EObject lv_references_0_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:5234:2: ( ( (lv_references_0_0= ruleReferencesField ) ) )
            // InternalLibrettoSpec.g:5235:2: ( (lv_references_0_0= ruleReferencesField ) )
            {
            // InternalLibrettoSpec.g:5235:2: ( (lv_references_0_0= ruleReferencesField ) )
            // InternalLibrettoSpec.g:5236:3: (lv_references_0_0= ruleReferencesField )
            {
            // InternalLibrettoSpec.g:5236:3: (lv_references_0_0= ruleReferencesField )
            // InternalLibrettoSpec.g:5237:4: lv_references_0_0= ruleReferencesField
            {

            				newCompositeNode(grammarAccess.getAcceptanceTestReferencesItemAccess().getReferencesReferencesFieldParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_references_0_0=ruleReferencesField();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getAcceptanceTestReferencesItemRule());
            				}
            				set(
            					current,
            					"references",
            					lv_references_0_0,
            					"com.robenglander.libretto.spec.LibrettoSpec.ReferencesField");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleAcceptanceTestReferencesItem"


    // $ANTLR start "entryRuleAcceptanceTestNotesItem"
    // InternalLibrettoSpec.g:5257:1: entryRuleAcceptanceTestNotesItem returns [EObject current=null] : iv_ruleAcceptanceTestNotesItem= ruleAcceptanceTestNotesItem EOF ;
    public final EObject entryRuleAcceptanceTestNotesItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAcceptanceTestNotesItem = null;


        try {
            // InternalLibrettoSpec.g:5257:64: (iv_ruleAcceptanceTestNotesItem= ruleAcceptanceTestNotesItem EOF )
            // InternalLibrettoSpec.g:5258:2: iv_ruleAcceptanceTestNotesItem= ruleAcceptanceTestNotesItem EOF
            {
             newCompositeNode(grammarAccess.getAcceptanceTestNotesItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAcceptanceTestNotesItem=ruleAcceptanceTestNotesItem();

            state._fsp--;

             current =iv_ruleAcceptanceTestNotesItem; 
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
    // $ANTLR end "entryRuleAcceptanceTestNotesItem"


    // $ANTLR start "ruleAcceptanceTestNotesItem"
    // InternalLibrettoSpec.g:5264:1: ruleAcceptanceTestNotesItem returns [EObject current=null] : ( (lv_notes_0_0= ruleNotesField ) ) ;
    public final EObject ruleAcceptanceTestNotesItem() throws RecognitionException {
        EObject current = null;

        EObject lv_notes_0_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:5270:2: ( ( (lv_notes_0_0= ruleNotesField ) ) )
            // InternalLibrettoSpec.g:5271:2: ( (lv_notes_0_0= ruleNotesField ) )
            {
            // InternalLibrettoSpec.g:5271:2: ( (lv_notes_0_0= ruleNotesField ) )
            // InternalLibrettoSpec.g:5272:3: (lv_notes_0_0= ruleNotesField )
            {
            // InternalLibrettoSpec.g:5272:3: (lv_notes_0_0= ruleNotesField )
            // InternalLibrettoSpec.g:5273:4: lv_notes_0_0= ruleNotesField
            {

            				newCompositeNode(grammarAccess.getAcceptanceTestNotesItemAccess().getNotesNotesFieldParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_notes_0_0=ruleNotesField();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getAcceptanceTestNotesItemRule());
            				}
            				set(
            					current,
            					"notes",
            					lv_notes_0_0,
            					"com.robenglander.libretto.spec.LibrettoSpec.NotesField");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleAcceptanceTestNotesItem"


    // $ANTLR start "entryRuleAcceptanceTestContextItem"
    // InternalLibrettoSpec.g:5293:1: entryRuleAcceptanceTestContextItem returns [EObject current=null] : iv_ruleAcceptanceTestContextItem= ruleAcceptanceTestContextItem EOF ;
    public final EObject entryRuleAcceptanceTestContextItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAcceptanceTestContextItem = null;


        try {
            // InternalLibrettoSpec.g:5293:66: (iv_ruleAcceptanceTestContextItem= ruleAcceptanceTestContextItem EOF )
            // InternalLibrettoSpec.g:5294:2: iv_ruleAcceptanceTestContextItem= ruleAcceptanceTestContextItem EOF
            {
             newCompositeNode(grammarAccess.getAcceptanceTestContextItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAcceptanceTestContextItem=ruleAcceptanceTestContextItem();

            state._fsp--;

             current =iv_ruleAcceptanceTestContextItem; 
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
    // $ANTLR end "entryRuleAcceptanceTestContextItem"


    // $ANTLR start "ruleAcceptanceTestContextItem"
    // InternalLibrettoSpec.g:5300:1: ruleAcceptanceTestContextItem returns [EObject current=null] : ( (lv_context_0_0= ruleContextField ) ) ;
    public final EObject ruleAcceptanceTestContextItem() throws RecognitionException {
        EObject current = null;

        EObject lv_context_0_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:5306:2: ( ( (lv_context_0_0= ruleContextField ) ) )
            // InternalLibrettoSpec.g:5307:2: ( (lv_context_0_0= ruleContextField ) )
            {
            // InternalLibrettoSpec.g:5307:2: ( (lv_context_0_0= ruleContextField ) )
            // InternalLibrettoSpec.g:5308:3: (lv_context_0_0= ruleContextField )
            {
            // InternalLibrettoSpec.g:5308:3: (lv_context_0_0= ruleContextField )
            // InternalLibrettoSpec.g:5309:4: lv_context_0_0= ruleContextField
            {

            				newCompositeNode(grammarAccess.getAcceptanceTestContextItemAccess().getContextContextFieldParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_context_0_0=ruleContextField();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getAcceptanceTestContextItemRule());
            				}
            				set(
            					current,
            					"context",
            					lv_context_0_0,
            					"com.robenglander.libretto.spec.LibrettoSpec.ContextField");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleAcceptanceTestContextItem"


    // $ANTLR start "entryRuleValidatesField"
    // InternalLibrettoSpec.g:5329:1: entryRuleValidatesField returns [EObject current=null] : iv_ruleValidatesField= ruleValidatesField EOF ;
    public final EObject entryRuleValidatesField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValidatesField = null;


        try {
            // InternalLibrettoSpec.g:5329:55: (iv_ruleValidatesField= ruleValidatesField EOF )
            // InternalLibrettoSpec.g:5330:2: iv_ruleValidatesField= ruleValidatesField EOF
            {
             newCompositeNode(grammarAccess.getValidatesFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValidatesField=ruleValidatesField();

            state._fsp--;

             current =iv_ruleValidatesField; 
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
    // $ANTLR end "entryRuleValidatesField"


    // $ANTLR start "ruleValidatesField"
    // InternalLibrettoSpec.g:5336:1: ruleValidatesField returns [EObject current=null] : (otherlv_0= 'validates' otherlv_1= ':' ( (lv_value_2_0= ruleBehaviorIdList ) ) ) ;
    public final EObject ruleValidatesField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:5342:2: ( (otherlv_0= 'validates' otherlv_1= ':' ( (lv_value_2_0= ruleBehaviorIdList ) ) ) )
            // InternalLibrettoSpec.g:5343:2: (otherlv_0= 'validates' otherlv_1= ':' ( (lv_value_2_0= ruleBehaviorIdList ) ) )
            {
            // InternalLibrettoSpec.g:5343:2: (otherlv_0= 'validates' otherlv_1= ':' ( (lv_value_2_0= ruleBehaviorIdList ) ) )
            // InternalLibrettoSpec.g:5344:3: otherlv_0= 'validates' otherlv_1= ':' ( (lv_value_2_0= ruleBehaviorIdList ) )
            {
            otherlv_0=(Token)match(input,74,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getValidatesFieldAccess().getValidatesKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getValidatesFieldAccess().getColonKeyword_1());
            		
            // InternalLibrettoSpec.g:5352:3: ( (lv_value_2_0= ruleBehaviorIdList ) )
            // InternalLibrettoSpec.g:5353:4: (lv_value_2_0= ruleBehaviorIdList )
            {
            // InternalLibrettoSpec.g:5353:4: (lv_value_2_0= ruleBehaviorIdList )
            // InternalLibrettoSpec.g:5354:5: lv_value_2_0= ruleBehaviorIdList
            {

            					newCompositeNode(grammarAccess.getValidatesFieldAccess().getValueBehaviorIdListParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleBehaviorIdList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getValidatesFieldRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"com.robenglander.libretto.spec.LibrettoSpec.BehaviorIdList");
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
    // $ANTLR end "ruleValidatesField"


    // $ANTLR start "entryRulePreconditionsField"
    // InternalLibrettoSpec.g:5375:1: entryRulePreconditionsField returns [EObject current=null] : iv_rulePreconditionsField= rulePreconditionsField EOF ;
    public final EObject entryRulePreconditionsField() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreconditionsField = null;


        try {
            // InternalLibrettoSpec.g:5375:59: (iv_rulePreconditionsField= rulePreconditionsField EOF )
            // InternalLibrettoSpec.g:5376:2: iv_rulePreconditionsField= rulePreconditionsField EOF
            {
             newCompositeNode(grammarAccess.getPreconditionsFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePreconditionsField=rulePreconditionsField();

            state._fsp--;

             current =iv_rulePreconditionsField; 
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
    // $ANTLR end "entryRulePreconditionsField"


    // $ANTLR start "rulePreconditionsField"
    // InternalLibrettoSpec.g:5382:1: rulePreconditionsField returns [EObject current=null] : (otherlv_0= 'preconditions' otherlv_1= ':' ( (lv_value_2_0= ruleTextList ) ) ) ;
    public final EObject rulePreconditionsField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:5388:2: ( (otherlv_0= 'preconditions' otherlv_1= ':' ( (lv_value_2_0= ruleTextList ) ) ) )
            // InternalLibrettoSpec.g:5389:2: (otherlv_0= 'preconditions' otherlv_1= ':' ( (lv_value_2_0= ruleTextList ) ) )
            {
            // InternalLibrettoSpec.g:5389:2: (otherlv_0= 'preconditions' otherlv_1= ':' ( (lv_value_2_0= ruleTextList ) ) )
            // InternalLibrettoSpec.g:5390:3: otherlv_0= 'preconditions' otherlv_1= ':' ( (lv_value_2_0= ruleTextList ) )
            {
            otherlv_0=(Token)match(input,75,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getPreconditionsFieldAccess().getPreconditionsKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getPreconditionsFieldAccess().getColonKeyword_1());
            		
            // InternalLibrettoSpec.g:5398:3: ( (lv_value_2_0= ruleTextList ) )
            // InternalLibrettoSpec.g:5399:4: (lv_value_2_0= ruleTextList )
            {
            // InternalLibrettoSpec.g:5399:4: (lv_value_2_0= ruleTextList )
            // InternalLibrettoSpec.g:5400:5: lv_value_2_0= ruleTextList
            {

            					newCompositeNode(grammarAccess.getPreconditionsFieldAccess().getValueTextListParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleTextList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPreconditionsFieldRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"com.robenglander.libretto.spec.LibrettoSpec.TextList");
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
    // $ANTLR end "rulePreconditionsField"


    // $ANTLR start "entryRuleActionsField"
    // InternalLibrettoSpec.g:5421:1: entryRuleActionsField returns [EObject current=null] : iv_ruleActionsField= ruleActionsField EOF ;
    public final EObject entryRuleActionsField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionsField = null;


        try {
            // InternalLibrettoSpec.g:5421:53: (iv_ruleActionsField= ruleActionsField EOF )
            // InternalLibrettoSpec.g:5422:2: iv_ruleActionsField= ruleActionsField EOF
            {
             newCompositeNode(grammarAccess.getActionsFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActionsField=ruleActionsField();

            state._fsp--;

             current =iv_ruleActionsField; 
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
    // $ANTLR end "entryRuleActionsField"


    // $ANTLR start "ruleActionsField"
    // InternalLibrettoSpec.g:5428:1: ruleActionsField returns [EObject current=null] : (otherlv_0= 'actions' otherlv_1= ':' ( (lv_value_2_0= ruleTextList ) ) ) ;
    public final EObject ruleActionsField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:5434:2: ( (otherlv_0= 'actions' otherlv_1= ':' ( (lv_value_2_0= ruleTextList ) ) ) )
            // InternalLibrettoSpec.g:5435:2: (otherlv_0= 'actions' otherlv_1= ':' ( (lv_value_2_0= ruleTextList ) ) )
            {
            // InternalLibrettoSpec.g:5435:2: (otherlv_0= 'actions' otherlv_1= ':' ( (lv_value_2_0= ruleTextList ) ) )
            // InternalLibrettoSpec.g:5436:3: otherlv_0= 'actions' otherlv_1= ':' ( (lv_value_2_0= ruleTextList ) )
            {
            otherlv_0=(Token)match(input,76,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getActionsFieldAccess().getActionsKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getActionsFieldAccess().getColonKeyword_1());
            		
            // InternalLibrettoSpec.g:5444:3: ( (lv_value_2_0= ruleTextList ) )
            // InternalLibrettoSpec.g:5445:4: (lv_value_2_0= ruleTextList )
            {
            // InternalLibrettoSpec.g:5445:4: (lv_value_2_0= ruleTextList )
            // InternalLibrettoSpec.g:5446:5: lv_value_2_0= ruleTextList
            {

            					newCompositeNode(grammarAccess.getActionsFieldAccess().getValueTextListParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleTextList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionsFieldRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"com.robenglander.libretto.spec.LibrettoSpec.TextList");
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
    // $ANTLR end "ruleActionsField"


    // $ANTLR start "entryRuleAssertionsField"
    // InternalLibrettoSpec.g:5467:1: entryRuleAssertionsField returns [EObject current=null] : iv_ruleAssertionsField= ruleAssertionsField EOF ;
    public final EObject entryRuleAssertionsField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertionsField = null;


        try {
            // InternalLibrettoSpec.g:5467:56: (iv_ruleAssertionsField= ruleAssertionsField EOF )
            // InternalLibrettoSpec.g:5468:2: iv_ruleAssertionsField= ruleAssertionsField EOF
            {
             newCompositeNode(grammarAccess.getAssertionsFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssertionsField=ruleAssertionsField();

            state._fsp--;

             current =iv_ruleAssertionsField; 
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
    // $ANTLR end "entryRuleAssertionsField"


    // $ANTLR start "ruleAssertionsField"
    // InternalLibrettoSpec.g:5474:1: ruleAssertionsField returns [EObject current=null] : (otherlv_0= 'assertions' otherlv_1= ':' ( (lv_value_2_0= ruleTextList ) ) ) ;
    public final EObject ruleAssertionsField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:5480:2: ( (otherlv_0= 'assertions' otherlv_1= ':' ( (lv_value_2_0= ruleTextList ) ) ) )
            // InternalLibrettoSpec.g:5481:2: (otherlv_0= 'assertions' otherlv_1= ':' ( (lv_value_2_0= ruleTextList ) ) )
            {
            // InternalLibrettoSpec.g:5481:2: (otherlv_0= 'assertions' otherlv_1= ':' ( (lv_value_2_0= ruleTextList ) ) )
            // InternalLibrettoSpec.g:5482:3: otherlv_0= 'assertions' otherlv_1= ':' ( (lv_value_2_0= ruleTextList ) )
            {
            otherlv_0=(Token)match(input,77,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getAssertionsFieldAccess().getAssertionsKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getAssertionsFieldAccess().getColonKeyword_1());
            		
            // InternalLibrettoSpec.g:5490:3: ( (lv_value_2_0= ruleTextList ) )
            // InternalLibrettoSpec.g:5491:4: (lv_value_2_0= ruleTextList )
            {
            // InternalLibrettoSpec.g:5491:4: (lv_value_2_0= ruleTextList )
            // InternalLibrettoSpec.g:5492:5: lv_value_2_0= ruleTextList
            {

            					newCompositeNode(grammarAccess.getAssertionsFieldAccess().getValueTextListParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleTextList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssertionsFieldRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"com.robenglander.libretto.spec.LibrettoSpec.TextList");
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
    // $ANTLR end "ruleAssertionsField"


    // $ANTLR start "entryRuleImplementationDirectiveRecord"
    // InternalLibrettoSpec.g:5513:1: entryRuleImplementationDirectiveRecord returns [EObject current=null] : iv_ruleImplementationDirectiveRecord= ruleImplementationDirectiveRecord EOF ;
    public final EObject entryRuleImplementationDirectiveRecord() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementationDirectiveRecord = null;


        try {
            // InternalLibrettoSpec.g:5513:70: (iv_ruleImplementationDirectiveRecord= ruleImplementationDirectiveRecord EOF )
            // InternalLibrettoSpec.g:5514:2: iv_ruleImplementationDirectiveRecord= ruleImplementationDirectiveRecord EOF
            {
             newCompositeNode(grammarAccess.getImplementationDirectiveRecordRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImplementationDirectiveRecord=ruleImplementationDirectiveRecord();

            state._fsp--;

             current =iv_ruleImplementationDirectiveRecord; 
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
    // $ANTLR end "entryRuleImplementationDirectiveRecord"


    // $ANTLR start "ruleImplementationDirectiveRecord"
    // InternalLibrettoSpec.g:5520:1: ruleImplementationDirectiveRecord returns [EObject current=null] : (otherlv_0= 'implementation_directive' ( (lv_id_1_0= ruleImplementationDirectiveId ) ) otherlv_2= '{' ( (lv_items_3_0= ruleImplementationDirectiveRecordItem ) )* otherlv_4= '}' ) ;
    public final EObject ruleImplementationDirectiveRecord() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_id_1_0 = null;

        EObject lv_items_3_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:5526:2: ( (otherlv_0= 'implementation_directive' ( (lv_id_1_0= ruleImplementationDirectiveId ) ) otherlv_2= '{' ( (lv_items_3_0= ruleImplementationDirectiveRecordItem ) )* otherlv_4= '}' ) )
            // InternalLibrettoSpec.g:5527:2: (otherlv_0= 'implementation_directive' ( (lv_id_1_0= ruleImplementationDirectiveId ) ) otherlv_2= '{' ( (lv_items_3_0= ruleImplementationDirectiveRecordItem ) )* otherlv_4= '}' )
            {
            // InternalLibrettoSpec.g:5527:2: (otherlv_0= 'implementation_directive' ( (lv_id_1_0= ruleImplementationDirectiveId ) ) otherlv_2= '{' ( (lv_items_3_0= ruleImplementationDirectiveRecordItem ) )* otherlv_4= '}' )
            // InternalLibrettoSpec.g:5528:3: otherlv_0= 'implementation_directive' ( (lv_id_1_0= ruleImplementationDirectiveId ) ) otherlv_2= '{' ( (lv_items_3_0= ruleImplementationDirectiveRecordItem ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,78,FOLLOW_36); 

            			newLeafNode(otherlv_0, grammarAccess.getImplementationDirectiveRecordAccess().getImplementation_directiveKeyword_0());
            		
            // InternalLibrettoSpec.g:5532:3: ( (lv_id_1_0= ruleImplementationDirectiveId ) )
            // InternalLibrettoSpec.g:5533:4: (lv_id_1_0= ruleImplementationDirectiveId )
            {
            // InternalLibrettoSpec.g:5533:4: (lv_id_1_0= ruleImplementationDirectiveId )
            // InternalLibrettoSpec.g:5534:5: lv_id_1_0= ruleImplementationDirectiveId
            {

            					newCompositeNode(grammarAccess.getImplementationDirectiveRecordAccess().getIdImplementationDirectiveIdParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_id_1_0=ruleImplementationDirectiveId();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImplementationDirectiveRecordRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_1_0,
            						"com.robenglander.libretto.spec.LibrettoSpec.ImplementationDirectiveId");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_37); 

            			newLeafNode(otherlv_2, grammarAccess.getImplementationDirectiveRecordAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLibrettoSpec.g:5555:3: ( (lv_items_3_0= ruleImplementationDirectiveRecordItem ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==22||LA35_0==63||(LA35_0>=79 && LA35_0<=86)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalLibrettoSpec.g:5556:4: (lv_items_3_0= ruleImplementationDirectiveRecordItem )
            	    {
            	    // InternalLibrettoSpec.g:5556:4: (lv_items_3_0= ruleImplementationDirectiveRecordItem )
            	    // InternalLibrettoSpec.g:5557:5: lv_items_3_0= ruleImplementationDirectiveRecordItem
            	    {

            	    					newCompositeNode(grammarAccess.getImplementationDirectiveRecordAccess().getItemsImplementationDirectiveRecordItemParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_37);
            	    lv_items_3_0=ruleImplementationDirectiveRecordItem();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getImplementationDirectiveRecordRule());
            	    					}
            	    					add(
            	    						current,
            	    						"items",
            	    						lv_items_3_0,
            	    						"com.robenglander.libretto.spec.LibrettoSpec.ImplementationDirectiveRecordItem");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getImplementationDirectiveRecordAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleImplementationDirectiveRecord"


    // $ANTLR start "entryRuleImplementationDirectiveRecordItem"
    // InternalLibrettoSpec.g:5582:1: entryRuleImplementationDirectiveRecordItem returns [EObject current=null] : iv_ruleImplementationDirectiveRecordItem= ruleImplementationDirectiveRecordItem EOF ;
    public final EObject entryRuleImplementationDirectiveRecordItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementationDirectiveRecordItem = null;


        try {
            // InternalLibrettoSpec.g:5582:74: (iv_ruleImplementationDirectiveRecordItem= ruleImplementationDirectiveRecordItem EOF )
            // InternalLibrettoSpec.g:5583:2: iv_ruleImplementationDirectiveRecordItem= ruleImplementationDirectiveRecordItem EOF
            {
             newCompositeNode(grammarAccess.getImplementationDirectiveRecordItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImplementationDirectiveRecordItem=ruleImplementationDirectiveRecordItem();

            state._fsp--;

             current =iv_ruleImplementationDirectiveRecordItem; 
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
    // $ANTLR end "entryRuleImplementationDirectiveRecordItem"


    // $ANTLR start "ruleImplementationDirectiveRecordItem"
    // InternalLibrettoSpec.g:5589:1: ruleImplementationDirectiveRecordItem returns [EObject current=null] : (this_ImplementationDirectiveSourceItem_0= ruleImplementationDirectiveSourceItem | this_ImplementationDirectiveAppliesToItem_1= ruleImplementationDirectiveAppliesToItem | this_ImplementationDirectiveStrengthItem_2= ruleImplementationDirectiveStrengthItem | this_ImplementationDirectiveDirectiveItem_3= ruleImplementationDirectiveDirectiveItem | this_ImplementationDirectiveCategoryItem_4= ruleImplementationDirectiveCategoryItem | this_ImplementationDirectiveConstraintsItem_5= ruleImplementationDirectiveConstraintsItem | this_ImplementationDirectiveAllowedFlexibilityItem_6= ruleImplementationDirectiveAllowedFlexibilityItem | this_ImplementationDirectiveReferencesItem_7= ruleImplementationDirectiveReferencesItem | this_ImplementationDirectiveRationaleItem_8= ruleImplementationDirectiveRationaleItem | this_ImplementationDirectiveContextItem_9= ruleImplementationDirectiveContextItem ) ;
    public final EObject ruleImplementationDirectiveRecordItem() throws RecognitionException {
        EObject current = null;

        EObject this_ImplementationDirectiveSourceItem_0 = null;

        EObject this_ImplementationDirectiveAppliesToItem_1 = null;

        EObject this_ImplementationDirectiveStrengthItem_2 = null;

        EObject this_ImplementationDirectiveDirectiveItem_3 = null;

        EObject this_ImplementationDirectiveCategoryItem_4 = null;

        EObject this_ImplementationDirectiveConstraintsItem_5 = null;

        EObject this_ImplementationDirectiveAllowedFlexibilityItem_6 = null;

        EObject this_ImplementationDirectiveReferencesItem_7 = null;

        EObject this_ImplementationDirectiveRationaleItem_8 = null;

        EObject this_ImplementationDirectiveContextItem_9 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:5595:2: ( (this_ImplementationDirectiveSourceItem_0= ruleImplementationDirectiveSourceItem | this_ImplementationDirectiveAppliesToItem_1= ruleImplementationDirectiveAppliesToItem | this_ImplementationDirectiveStrengthItem_2= ruleImplementationDirectiveStrengthItem | this_ImplementationDirectiveDirectiveItem_3= ruleImplementationDirectiveDirectiveItem | this_ImplementationDirectiveCategoryItem_4= ruleImplementationDirectiveCategoryItem | this_ImplementationDirectiveConstraintsItem_5= ruleImplementationDirectiveConstraintsItem | this_ImplementationDirectiveAllowedFlexibilityItem_6= ruleImplementationDirectiveAllowedFlexibilityItem | this_ImplementationDirectiveReferencesItem_7= ruleImplementationDirectiveReferencesItem | this_ImplementationDirectiveRationaleItem_8= ruleImplementationDirectiveRationaleItem | this_ImplementationDirectiveContextItem_9= ruleImplementationDirectiveContextItem ) )
            // InternalLibrettoSpec.g:5596:2: (this_ImplementationDirectiveSourceItem_0= ruleImplementationDirectiveSourceItem | this_ImplementationDirectiveAppliesToItem_1= ruleImplementationDirectiveAppliesToItem | this_ImplementationDirectiveStrengthItem_2= ruleImplementationDirectiveStrengthItem | this_ImplementationDirectiveDirectiveItem_3= ruleImplementationDirectiveDirectiveItem | this_ImplementationDirectiveCategoryItem_4= ruleImplementationDirectiveCategoryItem | this_ImplementationDirectiveConstraintsItem_5= ruleImplementationDirectiveConstraintsItem | this_ImplementationDirectiveAllowedFlexibilityItem_6= ruleImplementationDirectiveAllowedFlexibilityItem | this_ImplementationDirectiveReferencesItem_7= ruleImplementationDirectiveReferencesItem | this_ImplementationDirectiveRationaleItem_8= ruleImplementationDirectiveRationaleItem | this_ImplementationDirectiveContextItem_9= ruleImplementationDirectiveContextItem )
            {
            // InternalLibrettoSpec.g:5596:2: (this_ImplementationDirectiveSourceItem_0= ruleImplementationDirectiveSourceItem | this_ImplementationDirectiveAppliesToItem_1= ruleImplementationDirectiveAppliesToItem | this_ImplementationDirectiveStrengthItem_2= ruleImplementationDirectiveStrengthItem | this_ImplementationDirectiveDirectiveItem_3= ruleImplementationDirectiveDirectiveItem | this_ImplementationDirectiveCategoryItem_4= ruleImplementationDirectiveCategoryItem | this_ImplementationDirectiveConstraintsItem_5= ruleImplementationDirectiveConstraintsItem | this_ImplementationDirectiveAllowedFlexibilityItem_6= ruleImplementationDirectiveAllowedFlexibilityItem | this_ImplementationDirectiveReferencesItem_7= ruleImplementationDirectiveReferencesItem | this_ImplementationDirectiveRationaleItem_8= ruleImplementationDirectiveRationaleItem | this_ImplementationDirectiveContextItem_9= ruleImplementationDirectiveContextItem )
            int alt36=10;
            switch ( input.LA(1) ) {
            case 86:
                {
                alt36=1;
                }
                break;
            case 79:
                {
                alt36=2;
                }
                break;
            case 80:
                {
                alt36=3;
                }
                break;
            case 81:
                {
                alt36=4;
                }
                break;
            case 82:
                {
                alt36=5;
                }
                break;
            case 83:
                {
                alt36=6;
                }
                break;
            case 84:
                {
                alt36=7;
                }
                break;
            case 22:
                {
                alt36=8;
                }
                break;
            case 85:
                {
                alt36=9;
                }
                break;
            case 63:
                {
                alt36=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // InternalLibrettoSpec.g:5597:3: this_ImplementationDirectiveSourceItem_0= ruleImplementationDirectiveSourceItem
                    {

                    			newCompositeNode(grammarAccess.getImplementationDirectiveRecordItemAccess().getImplementationDirectiveSourceItemParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ImplementationDirectiveSourceItem_0=ruleImplementationDirectiveSourceItem();

                    state._fsp--;


                    			current = this_ImplementationDirectiveSourceItem_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalLibrettoSpec.g:5606:3: this_ImplementationDirectiveAppliesToItem_1= ruleImplementationDirectiveAppliesToItem
                    {

                    			newCompositeNode(grammarAccess.getImplementationDirectiveRecordItemAccess().getImplementationDirectiveAppliesToItemParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ImplementationDirectiveAppliesToItem_1=ruleImplementationDirectiveAppliesToItem();

                    state._fsp--;


                    			current = this_ImplementationDirectiveAppliesToItem_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalLibrettoSpec.g:5615:3: this_ImplementationDirectiveStrengthItem_2= ruleImplementationDirectiveStrengthItem
                    {

                    			newCompositeNode(grammarAccess.getImplementationDirectiveRecordItemAccess().getImplementationDirectiveStrengthItemParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ImplementationDirectiveStrengthItem_2=ruleImplementationDirectiveStrengthItem();

                    state._fsp--;


                    			current = this_ImplementationDirectiveStrengthItem_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalLibrettoSpec.g:5624:3: this_ImplementationDirectiveDirectiveItem_3= ruleImplementationDirectiveDirectiveItem
                    {

                    			newCompositeNode(grammarAccess.getImplementationDirectiveRecordItemAccess().getImplementationDirectiveDirectiveItemParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ImplementationDirectiveDirectiveItem_3=ruleImplementationDirectiveDirectiveItem();

                    state._fsp--;


                    			current = this_ImplementationDirectiveDirectiveItem_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalLibrettoSpec.g:5633:3: this_ImplementationDirectiveCategoryItem_4= ruleImplementationDirectiveCategoryItem
                    {

                    			newCompositeNode(grammarAccess.getImplementationDirectiveRecordItemAccess().getImplementationDirectiveCategoryItemParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ImplementationDirectiveCategoryItem_4=ruleImplementationDirectiveCategoryItem();

                    state._fsp--;


                    			current = this_ImplementationDirectiveCategoryItem_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalLibrettoSpec.g:5642:3: this_ImplementationDirectiveConstraintsItem_5= ruleImplementationDirectiveConstraintsItem
                    {

                    			newCompositeNode(grammarAccess.getImplementationDirectiveRecordItemAccess().getImplementationDirectiveConstraintsItemParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_ImplementationDirectiveConstraintsItem_5=ruleImplementationDirectiveConstraintsItem();

                    state._fsp--;


                    			current = this_ImplementationDirectiveConstraintsItem_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalLibrettoSpec.g:5651:3: this_ImplementationDirectiveAllowedFlexibilityItem_6= ruleImplementationDirectiveAllowedFlexibilityItem
                    {

                    			newCompositeNode(grammarAccess.getImplementationDirectiveRecordItemAccess().getImplementationDirectiveAllowedFlexibilityItemParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_ImplementationDirectiveAllowedFlexibilityItem_6=ruleImplementationDirectiveAllowedFlexibilityItem();

                    state._fsp--;


                    			current = this_ImplementationDirectiveAllowedFlexibilityItem_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalLibrettoSpec.g:5660:3: this_ImplementationDirectiveReferencesItem_7= ruleImplementationDirectiveReferencesItem
                    {

                    			newCompositeNode(grammarAccess.getImplementationDirectiveRecordItemAccess().getImplementationDirectiveReferencesItemParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_ImplementationDirectiveReferencesItem_7=ruleImplementationDirectiveReferencesItem();

                    state._fsp--;


                    			current = this_ImplementationDirectiveReferencesItem_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalLibrettoSpec.g:5669:3: this_ImplementationDirectiveRationaleItem_8= ruleImplementationDirectiveRationaleItem
                    {

                    			newCompositeNode(grammarAccess.getImplementationDirectiveRecordItemAccess().getImplementationDirectiveRationaleItemParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_ImplementationDirectiveRationaleItem_8=ruleImplementationDirectiveRationaleItem();

                    state._fsp--;


                    			current = this_ImplementationDirectiveRationaleItem_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalLibrettoSpec.g:5678:3: this_ImplementationDirectiveContextItem_9= ruleImplementationDirectiveContextItem
                    {

                    			newCompositeNode(grammarAccess.getImplementationDirectiveRecordItemAccess().getImplementationDirectiveContextItemParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_ImplementationDirectiveContextItem_9=ruleImplementationDirectiveContextItem();

                    state._fsp--;


                    			current = this_ImplementationDirectiveContextItem_9;
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
    // $ANTLR end "ruleImplementationDirectiveRecordItem"


    // $ANTLR start "entryRuleImplementationDirectiveSourceItem"
    // InternalLibrettoSpec.g:5690:1: entryRuleImplementationDirectiveSourceItem returns [EObject current=null] : iv_ruleImplementationDirectiveSourceItem= ruleImplementationDirectiveSourceItem EOF ;
    public final EObject entryRuleImplementationDirectiveSourceItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementationDirectiveSourceItem = null;


        try {
            // InternalLibrettoSpec.g:5690:74: (iv_ruleImplementationDirectiveSourceItem= ruleImplementationDirectiveSourceItem EOF )
            // InternalLibrettoSpec.g:5691:2: iv_ruleImplementationDirectiveSourceItem= ruleImplementationDirectiveSourceItem EOF
            {
             newCompositeNode(grammarAccess.getImplementationDirectiveSourceItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImplementationDirectiveSourceItem=ruleImplementationDirectiveSourceItem();

            state._fsp--;

             current =iv_ruleImplementationDirectiveSourceItem; 
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
    // $ANTLR end "entryRuleImplementationDirectiveSourceItem"


    // $ANTLR start "ruleImplementationDirectiveSourceItem"
    // InternalLibrettoSpec.g:5697:1: ruleImplementationDirectiveSourceItem returns [EObject current=null] : ( (lv_source_0_0= ruleSourceBlock ) ) ;
    public final EObject ruleImplementationDirectiveSourceItem() throws RecognitionException {
        EObject current = null;

        EObject lv_source_0_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:5703:2: ( ( (lv_source_0_0= ruleSourceBlock ) ) )
            // InternalLibrettoSpec.g:5704:2: ( (lv_source_0_0= ruleSourceBlock ) )
            {
            // InternalLibrettoSpec.g:5704:2: ( (lv_source_0_0= ruleSourceBlock ) )
            // InternalLibrettoSpec.g:5705:3: (lv_source_0_0= ruleSourceBlock )
            {
            // InternalLibrettoSpec.g:5705:3: (lv_source_0_0= ruleSourceBlock )
            // InternalLibrettoSpec.g:5706:4: lv_source_0_0= ruleSourceBlock
            {

            				newCompositeNode(grammarAccess.getImplementationDirectiveSourceItemAccess().getSourceSourceBlockParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_source_0_0=ruleSourceBlock();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getImplementationDirectiveSourceItemRule());
            				}
            				set(
            					current,
            					"source",
            					lv_source_0_0,
            					"com.robenglander.libretto.spec.LibrettoSpec.SourceBlock");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleImplementationDirectiveSourceItem"


    // $ANTLR start "entryRuleImplementationDirectiveAppliesToItem"
    // InternalLibrettoSpec.g:5726:1: entryRuleImplementationDirectiveAppliesToItem returns [EObject current=null] : iv_ruleImplementationDirectiveAppliesToItem= ruleImplementationDirectiveAppliesToItem EOF ;
    public final EObject entryRuleImplementationDirectiveAppliesToItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementationDirectiveAppliesToItem = null;


        try {
            // InternalLibrettoSpec.g:5726:77: (iv_ruleImplementationDirectiveAppliesToItem= ruleImplementationDirectiveAppliesToItem EOF )
            // InternalLibrettoSpec.g:5727:2: iv_ruleImplementationDirectiveAppliesToItem= ruleImplementationDirectiveAppliesToItem EOF
            {
             newCompositeNode(grammarAccess.getImplementationDirectiveAppliesToItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImplementationDirectiveAppliesToItem=ruleImplementationDirectiveAppliesToItem();

            state._fsp--;

             current =iv_ruleImplementationDirectiveAppliesToItem; 
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
    // $ANTLR end "entryRuleImplementationDirectiveAppliesToItem"


    // $ANTLR start "ruleImplementationDirectiveAppliesToItem"
    // InternalLibrettoSpec.g:5733:1: ruleImplementationDirectiveAppliesToItem returns [EObject current=null] : ( (lv_appliesTo_0_0= ruleAppliesToField ) ) ;
    public final EObject ruleImplementationDirectiveAppliesToItem() throws RecognitionException {
        EObject current = null;

        EObject lv_appliesTo_0_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:5739:2: ( ( (lv_appliesTo_0_0= ruleAppliesToField ) ) )
            // InternalLibrettoSpec.g:5740:2: ( (lv_appliesTo_0_0= ruleAppliesToField ) )
            {
            // InternalLibrettoSpec.g:5740:2: ( (lv_appliesTo_0_0= ruleAppliesToField ) )
            // InternalLibrettoSpec.g:5741:3: (lv_appliesTo_0_0= ruleAppliesToField )
            {
            // InternalLibrettoSpec.g:5741:3: (lv_appliesTo_0_0= ruleAppliesToField )
            // InternalLibrettoSpec.g:5742:4: lv_appliesTo_0_0= ruleAppliesToField
            {

            				newCompositeNode(grammarAccess.getImplementationDirectiveAppliesToItemAccess().getAppliesToAppliesToFieldParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_appliesTo_0_0=ruleAppliesToField();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getImplementationDirectiveAppliesToItemRule());
            				}
            				set(
            					current,
            					"appliesTo",
            					lv_appliesTo_0_0,
            					"com.robenglander.libretto.spec.LibrettoSpec.AppliesToField");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleImplementationDirectiveAppliesToItem"


    // $ANTLR start "entryRuleImplementationDirectiveStrengthItem"
    // InternalLibrettoSpec.g:5762:1: entryRuleImplementationDirectiveStrengthItem returns [EObject current=null] : iv_ruleImplementationDirectiveStrengthItem= ruleImplementationDirectiveStrengthItem EOF ;
    public final EObject entryRuleImplementationDirectiveStrengthItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementationDirectiveStrengthItem = null;


        try {
            // InternalLibrettoSpec.g:5762:76: (iv_ruleImplementationDirectiveStrengthItem= ruleImplementationDirectiveStrengthItem EOF )
            // InternalLibrettoSpec.g:5763:2: iv_ruleImplementationDirectiveStrengthItem= ruleImplementationDirectiveStrengthItem EOF
            {
             newCompositeNode(grammarAccess.getImplementationDirectiveStrengthItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImplementationDirectiveStrengthItem=ruleImplementationDirectiveStrengthItem();

            state._fsp--;

             current =iv_ruleImplementationDirectiveStrengthItem; 
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
    // $ANTLR end "entryRuleImplementationDirectiveStrengthItem"


    // $ANTLR start "ruleImplementationDirectiveStrengthItem"
    // InternalLibrettoSpec.g:5769:1: ruleImplementationDirectiveStrengthItem returns [EObject current=null] : ( (lv_strength_0_0= ruleStrengthField ) ) ;
    public final EObject ruleImplementationDirectiveStrengthItem() throws RecognitionException {
        EObject current = null;

        EObject lv_strength_0_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:5775:2: ( ( (lv_strength_0_0= ruleStrengthField ) ) )
            // InternalLibrettoSpec.g:5776:2: ( (lv_strength_0_0= ruleStrengthField ) )
            {
            // InternalLibrettoSpec.g:5776:2: ( (lv_strength_0_0= ruleStrengthField ) )
            // InternalLibrettoSpec.g:5777:3: (lv_strength_0_0= ruleStrengthField )
            {
            // InternalLibrettoSpec.g:5777:3: (lv_strength_0_0= ruleStrengthField )
            // InternalLibrettoSpec.g:5778:4: lv_strength_0_0= ruleStrengthField
            {

            				newCompositeNode(grammarAccess.getImplementationDirectiveStrengthItemAccess().getStrengthStrengthFieldParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_strength_0_0=ruleStrengthField();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getImplementationDirectiveStrengthItemRule());
            				}
            				set(
            					current,
            					"strength",
            					lv_strength_0_0,
            					"com.robenglander.libretto.spec.LibrettoSpec.StrengthField");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleImplementationDirectiveStrengthItem"


    // $ANTLR start "entryRuleImplementationDirectiveDirectiveItem"
    // InternalLibrettoSpec.g:5798:1: entryRuleImplementationDirectiveDirectiveItem returns [EObject current=null] : iv_ruleImplementationDirectiveDirectiveItem= ruleImplementationDirectiveDirectiveItem EOF ;
    public final EObject entryRuleImplementationDirectiveDirectiveItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementationDirectiveDirectiveItem = null;


        try {
            // InternalLibrettoSpec.g:5798:77: (iv_ruleImplementationDirectiveDirectiveItem= ruleImplementationDirectiveDirectiveItem EOF )
            // InternalLibrettoSpec.g:5799:2: iv_ruleImplementationDirectiveDirectiveItem= ruleImplementationDirectiveDirectiveItem EOF
            {
             newCompositeNode(grammarAccess.getImplementationDirectiveDirectiveItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImplementationDirectiveDirectiveItem=ruleImplementationDirectiveDirectiveItem();

            state._fsp--;

             current =iv_ruleImplementationDirectiveDirectiveItem; 
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
    // $ANTLR end "entryRuleImplementationDirectiveDirectiveItem"


    // $ANTLR start "ruleImplementationDirectiveDirectiveItem"
    // InternalLibrettoSpec.g:5805:1: ruleImplementationDirectiveDirectiveItem returns [EObject current=null] : ( (lv_directive_0_0= ruleDirectiveField ) ) ;
    public final EObject ruleImplementationDirectiveDirectiveItem() throws RecognitionException {
        EObject current = null;

        EObject lv_directive_0_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:5811:2: ( ( (lv_directive_0_0= ruleDirectiveField ) ) )
            // InternalLibrettoSpec.g:5812:2: ( (lv_directive_0_0= ruleDirectiveField ) )
            {
            // InternalLibrettoSpec.g:5812:2: ( (lv_directive_0_0= ruleDirectiveField ) )
            // InternalLibrettoSpec.g:5813:3: (lv_directive_0_0= ruleDirectiveField )
            {
            // InternalLibrettoSpec.g:5813:3: (lv_directive_0_0= ruleDirectiveField )
            // InternalLibrettoSpec.g:5814:4: lv_directive_0_0= ruleDirectiveField
            {

            				newCompositeNode(grammarAccess.getImplementationDirectiveDirectiveItemAccess().getDirectiveDirectiveFieldParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_directive_0_0=ruleDirectiveField();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getImplementationDirectiveDirectiveItemRule());
            				}
            				set(
            					current,
            					"directive",
            					lv_directive_0_0,
            					"com.robenglander.libretto.spec.LibrettoSpec.DirectiveField");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleImplementationDirectiveDirectiveItem"


    // $ANTLR start "entryRuleImplementationDirectiveCategoryItem"
    // InternalLibrettoSpec.g:5834:1: entryRuleImplementationDirectiveCategoryItem returns [EObject current=null] : iv_ruleImplementationDirectiveCategoryItem= ruleImplementationDirectiveCategoryItem EOF ;
    public final EObject entryRuleImplementationDirectiveCategoryItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementationDirectiveCategoryItem = null;


        try {
            // InternalLibrettoSpec.g:5834:76: (iv_ruleImplementationDirectiveCategoryItem= ruleImplementationDirectiveCategoryItem EOF )
            // InternalLibrettoSpec.g:5835:2: iv_ruleImplementationDirectiveCategoryItem= ruleImplementationDirectiveCategoryItem EOF
            {
             newCompositeNode(grammarAccess.getImplementationDirectiveCategoryItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImplementationDirectiveCategoryItem=ruleImplementationDirectiveCategoryItem();

            state._fsp--;

             current =iv_ruleImplementationDirectiveCategoryItem; 
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
    // $ANTLR end "entryRuleImplementationDirectiveCategoryItem"


    // $ANTLR start "ruleImplementationDirectiveCategoryItem"
    // InternalLibrettoSpec.g:5841:1: ruleImplementationDirectiveCategoryItem returns [EObject current=null] : ( (lv_category_0_0= ruleCategoryField ) ) ;
    public final EObject ruleImplementationDirectiveCategoryItem() throws RecognitionException {
        EObject current = null;

        EObject lv_category_0_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:5847:2: ( ( (lv_category_0_0= ruleCategoryField ) ) )
            // InternalLibrettoSpec.g:5848:2: ( (lv_category_0_0= ruleCategoryField ) )
            {
            // InternalLibrettoSpec.g:5848:2: ( (lv_category_0_0= ruleCategoryField ) )
            // InternalLibrettoSpec.g:5849:3: (lv_category_0_0= ruleCategoryField )
            {
            // InternalLibrettoSpec.g:5849:3: (lv_category_0_0= ruleCategoryField )
            // InternalLibrettoSpec.g:5850:4: lv_category_0_0= ruleCategoryField
            {

            				newCompositeNode(grammarAccess.getImplementationDirectiveCategoryItemAccess().getCategoryCategoryFieldParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_category_0_0=ruleCategoryField();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getImplementationDirectiveCategoryItemRule());
            				}
            				set(
            					current,
            					"category",
            					lv_category_0_0,
            					"com.robenglander.libretto.spec.LibrettoSpec.CategoryField");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleImplementationDirectiveCategoryItem"


    // $ANTLR start "entryRuleImplementationDirectiveConstraintsItem"
    // InternalLibrettoSpec.g:5870:1: entryRuleImplementationDirectiveConstraintsItem returns [EObject current=null] : iv_ruleImplementationDirectiveConstraintsItem= ruleImplementationDirectiveConstraintsItem EOF ;
    public final EObject entryRuleImplementationDirectiveConstraintsItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementationDirectiveConstraintsItem = null;


        try {
            // InternalLibrettoSpec.g:5870:79: (iv_ruleImplementationDirectiveConstraintsItem= ruleImplementationDirectiveConstraintsItem EOF )
            // InternalLibrettoSpec.g:5871:2: iv_ruleImplementationDirectiveConstraintsItem= ruleImplementationDirectiveConstraintsItem EOF
            {
             newCompositeNode(grammarAccess.getImplementationDirectiveConstraintsItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImplementationDirectiveConstraintsItem=ruleImplementationDirectiveConstraintsItem();

            state._fsp--;

             current =iv_ruleImplementationDirectiveConstraintsItem; 
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
    // $ANTLR end "entryRuleImplementationDirectiveConstraintsItem"


    // $ANTLR start "ruleImplementationDirectiveConstraintsItem"
    // InternalLibrettoSpec.g:5877:1: ruleImplementationDirectiveConstraintsItem returns [EObject current=null] : ( (lv_constraints_0_0= ruleConstraintsField ) ) ;
    public final EObject ruleImplementationDirectiveConstraintsItem() throws RecognitionException {
        EObject current = null;

        EObject lv_constraints_0_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:5883:2: ( ( (lv_constraints_0_0= ruleConstraintsField ) ) )
            // InternalLibrettoSpec.g:5884:2: ( (lv_constraints_0_0= ruleConstraintsField ) )
            {
            // InternalLibrettoSpec.g:5884:2: ( (lv_constraints_0_0= ruleConstraintsField ) )
            // InternalLibrettoSpec.g:5885:3: (lv_constraints_0_0= ruleConstraintsField )
            {
            // InternalLibrettoSpec.g:5885:3: (lv_constraints_0_0= ruleConstraintsField )
            // InternalLibrettoSpec.g:5886:4: lv_constraints_0_0= ruleConstraintsField
            {

            				newCompositeNode(grammarAccess.getImplementationDirectiveConstraintsItemAccess().getConstraintsConstraintsFieldParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_constraints_0_0=ruleConstraintsField();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getImplementationDirectiveConstraintsItemRule());
            				}
            				set(
            					current,
            					"constraints",
            					lv_constraints_0_0,
            					"com.robenglander.libretto.spec.LibrettoSpec.ConstraintsField");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleImplementationDirectiveConstraintsItem"


    // $ANTLR start "entryRuleImplementationDirectiveAllowedFlexibilityItem"
    // InternalLibrettoSpec.g:5906:1: entryRuleImplementationDirectiveAllowedFlexibilityItem returns [EObject current=null] : iv_ruleImplementationDirectiveAllowedFlexibilityItem= ruleImplementationDirectiveAllowedFlexibilityItem EOF ;
    public final EObject entryRuleImplementationDirectiveAllowedFlexibilityItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementationDirectiveAllowedFlexibilityItem = null;


        try {
            // InternalLibrettoSpec.g:5906:86: (iv_ruleImplementationDirectiveAllowedFlexibilityItem= ruleImplementationDirectiveAllowedFlexibilityItem EOF )
            // InternalLibrettoSpec.g:5907:2: iv_ruleImplementationDirectiveAllowedFlexibilityItem= ruleImplementationDirectiveAllowedFlexibilityItem EOF
            {
             newCompositeNode(grammarAccess.getImplementationDirectiveAllowedFlexibilityItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImplementationDirectiveAllowedFlexibilityItem=ruleImplementationDirectiveAllowedFlexibilityItem();

            state._fsp--;

             current =iv_ruleImplementationDirectiveAllowedFlexibilityItem; 
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
    // $ANTLR end "entryRuleImplementationDirectiveAllowedFlexibilityItem"


    // $ANTLR start "ruleImplementationDirectiveAllowedFlexibilityItem"
    // InternalLibrettoSpec.g:5913:1: ruleImplementationDirectiveAllowedFlexibilityItem returns [EObject current=null] : ( (lv_allowedFlexibility_0_0= ruleAllowedFlexibilityField ) ) ;
    public final EObject ruleImplementationDirectiveAllowedFlexibilityItem() throws RecognitionException {
        EObject current = null;

        EObject lv_allowedFlexibility_0_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:5919:2: ( ( (lv_allowedFlexibility_0_0= ruleAllowedFlexibilityField ) ) )
            // InternalLibrettoSpec.g:5920:2: ( (lv_allowedFlexibility_0_0= ruleAllowedFlexibilityField ) )
            {
            // InternalLibrettoSpec.g:5920:2: ( (lv_allowedFlexibility_0_0= ruleAllowedFlexibilityField ) )
            // InternalLibrettoSpec.g:5921:3: (lv_allowedFlexibility_0_0= ruleAllowedFlexibilityField )
            {
            // InternalLibrettoSpec.g:5921:3: (lv_allowedFlexibility_0_0= ruleAllowedFlexibilityField )
            // InternalLibrettoSpec.g:5922:4: lv_allowedFlexibility_0_0= ruleAllowedFlexibilityField
            {

            				newCompositeNode(grammarAccess.getImplementationDirectiveAllowedFlexibilityItemAccess().getAllowedFlexibilityAllowedFlexibilityFieldParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_allowedFlexibility_0_0=ruleAllowedFlexibilityField();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getImplementationDirectiveAllowedFlexibilityItemRule());
            				}
            				set(
            					current,
            					"allowedFlexibility",
            					lv_allowedFlexibility_0_0,
            					"com.robenglander.libretto.spec.LibrettoSpec.AllowedFlexibilityField");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleImplementationDirectiveAllowedFlexibilityItem"


    // $ANTLR start "entryRuleImplementationDirectiveReferencesItem"
    // InternalLibrettoSpec.g:5942:1: entryRuleImplementationDirectiveReferencesItem returns [EObject current=null] : iv_ruleImplementationDirectiveReferencesItem= ruleImplementationDirectiveReferencesItem EOF ;
    public final EObject entryRuleImplementationDirectiveReferencesItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementationDirectiveReferencesItem = null;


        try {
            // InternalLibrettoSpec.g:5942:78: (iv_ruleImplementationDirectiveReferencesItem= ruleImplementationDirectiveReferencesItem EOF )
            // InternalLibrettoSpec.g:5943:2: iv_ruleImplementationDirectiveReferencesItem= ruleImplementationDirectiveReferencesItem EOF
            {
             newCompositeNode(grammarAccess.getImplementationDirectiveReferencesItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImplementationDirectiveReferencesItem=ruleImplementationDirectiveReferencesItem();

            state._fsp--;

             current =iv_ruleImplementationDirectiveReferencesItem; 
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
    // $ANTLR end "entryRuleImplementationDirectiveReferencesItem"


    // $ANTLR start "ruleImplementationDirectiveReferencesItem"
    // InternalLibrettoSpec.g:5949:1: ruleImplementationDirectiveReferencesItem returns [EObject current=null] : ( (lv_references_0_0= ruleReferencesField ) ) ;
    public final EObject ruleImplementationDirectiveReferencesItem() throws RecognitionException {
        EObject current = null;

        EObject lv_references_0_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:5955:2: ( ( (lv_references_0_0= ruleReferencesField ) ) )
            // InternalLibrettoSpec.g:5956:2: ( (lv_references_0_0= ruleReferencesField ) )
            {
            // InternalLibrettoSpec.g:5956:2: ( (lv_references_0_0= ruleReferencesField ) )
            // InternalLibrettoSpec.g:5957:3: (lv_references_0_0= ruleReferencesField )
            {
            // InternalLibrettoSpec.g:5957:3: (lv_references_0_0= ruleReferencesField )
            // InternalLibrettoSpec.g:5958:4: lv_references_0_0= ruleReferencesField
            {

            				newCompositeNode(grammarAccess.getImplementationDirectiveReferencesItemAccess().getReferencesReferencesFieldParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_references_0_0=ruleReferencesField();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getImplementationDirectiveReferencesItemRule());
            				}
            				set(
            					current,
            					"references",
            					lv_references_0_0,
            					"com.robenglander.libretto.spec.LibrettoSpec.ReferencesField");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleImplementationDirectiveReferencesItem"


    // $ANTLR start "entryRuleImplementationDirectiveRationaleItem"
    // InternalLibrettoSpec.g:5978:1: entryRuleImplementationDirectiveRationaleItem returns [EObject current=null] : iv_ruleImplementationDirectiveRationaleItem= ruleImplementationDirectiveRationaleItem EOF ;
    public final EObject entryRuleImplementationDirectiveRationaleItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementationDirectiveRationaleItem = null;


        try {
            // InternalLibrettoSpec.g:5978:77: (iv_ruleImplementationDirectiveRationaleItem= ruleImplementationDirectiveRationaleItem EOF )
            // InternalLibrettoSpec.g:5979:2: iv_ruleImplementationDirectiveRationaleItem= ruleImplementationDirectiveRationaleItem EOF
            {
             newCompositeNode(grammarAccess.getImplementationDirectiveRationaleItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImplementationDirectiveRationaleItem=ruleImplementationDirectiveRationaleItem();

            state._fsp--;

             current =iv_ruleImplementationDirectiveRationaleItem; 
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
    // $ANTLR end "entryRuleImplementationDirectiveRationaleItem"


    // $ANTLR start "ruleImplementationDirectiveRationaleItem"
    // InternalLibrettoSpec.g:5985:1: ruleImplementationDirectiveRationaleItem returns [EObject current=null] : ( (lv_rationale_0_0= ruleRationaleField ) ) ;
    public final EObject ruleImplementationDirectiveRationaleItem() throws RecognitionException {
        EObject current = null;

        EObject lv_rationale_0_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:5991:2: ( ( (lv_rationale_0_0= ruleRationaleField ) ) )
            // InternalLibrettoSpec.g:5992:2: ( (lv_rationale_0_0= ruleRationaleField ) )
            {
            // InternalLibrettoSpec.g:5992:2: ( (lv_rationale_0_0= ruleRationaleField ) )
            // InternalLibrettoSpec.g:5993:3: (lv_rationale_0_0= ruleRationaleField )
            {
            // InternalLibrettoSpec.g:5993:3: (lv_rationale_0_0= ruleRationaleField )
            // InternalLibrettoSpec.g:5994:4: lv_rationale_0_0= ruleRationaleField
            {

            				newCompositeNode(grammarAccess.getImplementationDirectiveRationaleItemAccess().getRationaleRationaleFieldParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_rationale_0_0=ruleRationaleField();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getImplementationDirectiveRationaleItemRule());
            				}
            				set(
            					current,
            					"rationale",
            					lv_rationale_0_0,
            					"com.robenglander.libretto.spec.LibrettoSpec.RationaleField");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleImplementationDirectiveRationaleItem"


    // $ANTLR start "entryRuleImplementationDirectiveContextItem"
    // InternalLibrettoSpec.g:6014:1: entryRuleImplementationDirectiveContextItem returns [EObject current=null] : iv_ruleImplementationDirectiveContextItem= ruleImplementationDirectiveContextItem EOF ;
    public final EObject entryRuleImplementationDirectiveContextItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementationDirectiveContextItem = null;


        try {
            // InternalLibrettoSpec.g:6014:75: (iv_ruleImplementationDirectiveContextItem= ruleImplementationDirectiveContextItem EOF )
            // InternalLibrettoSpec.g:6015:2: iv_ruleImplementationDirectiveContextItem= ruleImplementationDirectiveContextItem EOF
            {
             newCompositeNode(grammarAccess.getImplementationDirectiveContextItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImplementationDirectiveContextItem=ruleImplementationDirectiveContextItem();

            state._fsp--;

             current =iv_ruleImplementationDirectiveContextItem; 
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
    // $ANTLR end "entryRuleImplementationDirectiveContextItem"


    // $ANTLR start "ruleImplementationDirectiveContextItem"
    // InternalLibrettoSpec.g:6021:1: ruleImplementationDirectiveContextItem returns [EObject current=null] : ( (lv_context_0_0= ruleContextField ) ) ;
    public final EObject ruleImplementationDirectiveContextItem() throws RecognitionException {
        EObject current = null;

        EObject lv_context_0_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:6027:2: ( ( (lv_context_0_0= ruleContextField ) ) )
            // InternalLibrettoSpec.g:6028:2: ( (lv_context_0_0= ruleContextField ) )
            {
            // InternalLibrettoSpec.g:6028:2: ( (lv_context_0_0= ruleContextField ) )
            // InternalLibrettoSpec.g:6029:3: (lv_context_0_0= ruleContextField )
            {
            // InternalLibrettoSpec.g:6029:3: (lv_context_0_0= ruleContextField )
            // InternalLibrettoSpec.g:6030:4: lv_context_0_0= ruleContextField
            {

            				newCompositeNode(grammarAccess.getImplementationDirectiveContextItemAccess().getContextContextFieldParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_context_0_0=ruleContextField();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getImplementationDirectiveContextItemRule());
            				}
            				set(
            					current,
            					"context",
            					lv_context_0_0,
            					"com.robenglander.libretto.spec.LibrettoSpec.ContextField");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleImplementationDirectiveContextItem"


    // $ANTLR start "entryRuleAppliesToField"
    // InternalLibrettoSpec.g:6050:1: entryRuleAppliesToField returns [EObject current=null] : iv_ruleAppliesToField= ruleAppliesToField EOF ;
    public final EObject entryRuleAppliesToField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppliesToField = null;


        try {
            // InternalLibrettoSpec.g:6050:55: (iv_ruleAppliesToField= ruleAppliesToField EOF )
            // InternalLibrettoSpec.g:6051:2: iv_ruleAppliesToField= ruleAppliesToField EOF
            {
             newCompositeNode(grammarAccess.getAppliesToFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAppliesToField=ruleAppliesToField();

            state._fsp--;

             current =iv_ruleAppliesToField; 
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
    // $ANTLR end "entryRuleAppliesToField"


    // $ANTLR start "ruleAppliesToField"
    // InternalLibrettoSpec.g:6057:1: ruleAppliesToField returns [EObject current=null] : (otherlv_0= 'applies_to' otherlv_1= ':' ( (lv_value_2_0= ruleIdentifierList ) ) ) ;
    public final EObject ruleAppliesToField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:6063:2: ( (otherlv_0= 'applies_to' otherlv_1= ':' ( (lv_value_2_0= ruleIdentifierList ) ) ) )
            // InternalLibrettoSpec.g:6064:2: (otherlv_0= 'applies_to' otherlv_1= ':' ( (lv_value_2_0= ruleIdentifierList ) ) )
            {
            // InternalLibrettoSpec.g:6064:2: (otherlv_0= 'applies_to' otherlv_1= ':' ( (lv_value_2_0= ruleIdentifierList ) ) )
            // InternalLibrettoSpec.g:6065:3: otherlv_0= 'applies_to' otherlv_1= ':' ( (lv_value_2_0= ruleIdentifierList ) )
            {
            otherlv_0=(Token)match(input,79,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getAppliesToFieldAccess().getApplies_toKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getAppliesToFieldAccess().getColonKeyword_1());
            		
            // InternalLibrettoSpec.g:6073:3: ( (lv_value_2_0= ruleIdentifierList ) )
            // InternalLibrettoSpec.g:6074:4: (lv_value_2_0= ruleIdentifierList )
            {
            // InternalLibrettoSpec.g:6074:4: (lv_value_2_0= ruleIdentifierList )
            // InternalLibrettoSpec.g:6075:5: lv_value_2_0= ruleIdentifierList
            {

            					newCompositeNode(grammarAccess.getAppliesToFieldAccess().getValueIdentifierListParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleIdentifierList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAppliesToFieldRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"com.robenglander.libretto.spec.LibrettoSpec.IdentifierList");
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
    // $ANTLR end "ruleAppliesToField"


    // $ANTLR start "entryRuleStrengthField"
    // InternalLibrettoSpec.g:6096:1: entryRuleStrengthField returns [EObject current=null] : iv_ruleStrengthField= ruleStrengthField EOF ;
    public final EObject entryRuleStrengthField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStrengthField = null;


        try {
            // InternalLibrettoSpec.g:6096:54: (iv_ruleStrengthField= ruleStrengthField EOF )
            // InternalLibrettoSpec.g:6097:2: iv_ruleStrengthField= ruleStrengthField EOF
            {
             newCompositeNode(grammarAccess.getStrengthFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStrengthField=ruleStrengthField();

            state._fsp--;

             current =iv_ruleStrengthField; 
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
    // $ANTLR end "entryRuleStrengthField"


    // $ANTLR start "ruleStrengthField"
    // InternalLibrettoSpec.g:6103:1: ruleStrengthField returns [EObject current=null] : (otherlv_0= 'strength' otherlv_1= ':' ( (lv_value_2_0= ruleStrengthValue ) ) ) ;
    public final EObject ruleStrengthField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Enumerator lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:6109:2: ( (otherlv_0= 'strength' otherlv_1= ':' ( (lv_value_2_0= ruleStrengthValue ) ) ) )
            // InternalLibrettoSpec.g:6110:2: (otherlv_0= 'strength' otherlv_1= ':' ( (lv_value_2_0= ruleStrengthValue ) ) )
            {
            // InternalLibrettoSpec.g:6110:2: (otherlv_0= 'strength' otherlv_1= ':' ( (lv_value_2_0= ruleStrengthValue ) ) )
            // InternalLibrettoSpec.g:6111:3: otherlv_0= 'strength' otherlv_1= ':' ( (lv_value_2_0= ruleStrengthValue ) )
            {
            otherlv_0=(Token)match(input,80,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getStrengthFieldAccess().getStrengthKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getStrengthFieldAccess().getColonKeyword_1());
            		
            // InternalLibrettoSpec.g:6119:3: ( (lv_value_2_0= ruleStrengthValue ) )
            // InternalLibrettoSpec.g:6120:4: (lv_value_2_0= ruleStrengthValue )
            {
            // InternalLibrettoSpec.g:6120:4: (lv_value_2_0= ruleStrengthValue )
            // InternalLibrettoSpec.g:6121:5: lv_value_2_0= ruleStrengthValue
            {

            					newCompositeNode(grammarAccess.getStrengthFieldAccess().getValueStrengthValueEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleStrengthValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStrengthFieldRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"com.robenglander.libretto.spec.LibrettoSpec.StrengthValue");
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
    // $ANTLR end "ruleStrengthField"


    // $ANTLR start "entryRuleDirectiveField"
    // InternalLibrettoSpec.g:6142:1: entryRuleDirectiveField returns [EObject current=null] : iv_ruleDirectiveField= ruleDirectiveField EOF ;
    public final EObject entryRuleDirectiveField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirectiveField = null;


        try {
            // InternalLibrettoSpec.g:6142:55: (iv_ruleDirectiveField= ruleDirectiveField EOF )
            // InternalLibrettoSpec.g:6143:2: iv_ruleDirectiveField= ruleDirectiveField EOF
            {
             newCompositeNode(grammarAccess.getDirectiveFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDirectiveField=ruleDirectiveField();

            state._fsp--;

             current =iv_ruleDirectiveField; 
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
    // $ANTLR end "entryRuleDirectiveField"


    // $ANTLR start "ruleDirectiveField"
    // InternalLibrettoSpec.g:6149:1: ruleDirectiveField returns [EObject current=null] : (otherlv_0= 'directive' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) ) ;
    public final EObject ruleDirectiveField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:6155:2: ( (otherlv_0= 'directive' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) ) )
            // InternalLibrettoSpec.g:6156:2: (otherlv_0= 'directive' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) )
            {
            // InternalLibrettoSpec.g:6156:2: (otherlv_0= 'directive' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) )
            // InternalLibrettoSpec.g:6157:3: otherlv_0= 'directive' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) )
            {
            otherlv_0=(Token)match(input,81,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getDirectiveFieldAccess().getDirectiveKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getDirectiveFieldAccess().getColonKeyword_1());
            		
            // InternalLibrettoSpec.g:6165:3: ( (lv_value_2_0= ruleTextValue ) )
            // InternalLibrettoSpec.g:6166:4: (lv_value_2_0= ruleTextValue )
            {
            // InternalLibrettoSpec.g:6166:4: (lv_value_2_0= ruleTextValue )
            // InternalLibrettoSpec.g:6167:5: lv_value_2_0= ruleTextValue
            {

            					newCompositeNode(grammarAccess.getDirectiveFieldAccess().getValueTextValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleTextValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDirectiveFieldRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"com.robenglander.libretto.spec.LibrettoSpec.TextValue");
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
    // $ANTLR end "ruleDirectiveField"


    // $ANTLR start "entryRuleCategoryField"
    // InternalLibrettoSpec.g:6188:1: entryRuleCategoryField returns [EObject current=null] : iv_ruleCategoryField= ruleCategoryField EOF ;
    public final EObject entryRuleCategoryField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCategoryField = null;


        try {
            // InternalLibrettoSpec.g:6188:54: (iv_ruleCategoryField= ruleCategoryField EOF )
            // InternalLibrettoSpec.g:6189:2: iv_ruleCategoryField= ruleCategoryField EOF
            {
             newCompositeNode(grammarAccess.getCategoryFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCategoryField=ruleCategoryField();

            state._fsp--;

             current =iv_ruleCategoryField; 
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
    // $ANTLR end "entryRuleCategoryField"


    // $ANTLR start "ruleCategoryField"
    // InternalLibrettoSpec.g:6195:1: ruleCategoryField returns [EObject current=null] : (otherlv_0= 'category' otherlv_1= ':' ( (lv_value_2_0= ruleIdentifierValue ) ) ) ;
    public final EObject ruleCategoryField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:6201:2: ( (otherlv_0= 'category' otherlv_1= ':' ( (lv_value_2_0= ruleIdentifierValue ) ) ) )
            // InternalLibrettoSpec.g:6202:2: (otherlv_0= 'category' otherlv_1= ':' ( (lv_value_2_0= ruleIdentifierValue ) ) )
            {
            // InternalLibrettoSpec.g:6202:2: (otherlv_0= 'category' otherlv_1= ':' ( (lv_value_2_0= ruleIdentifierValue ) ) )
            // InternalLibrettoSpec.g:6203:3: otherlv_0= 'category' otherlv_1= ':' ( (lv_value_2_0= ruleIdentifierValue ) )
            {
            otherlv_0=(Token)match(input,82,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getCategoryFieldAccess().getCategoryKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCategoryFieldAccess().getColonKeyword_1());
            		
            // InternalLibrettoSpec.g:6211:3: ( (lv_value_2_0= ruleIdentifierValue ) )
            // InternalLibrettoSpec.g:6212:4: (lv_value_2_0= ruleIdentifierValue )
            {
            // InternalLibrettoSpec.g:6212:4: (lv_value_2_0= ruleIdentifierValue )
            // InternalLibrettoSpec.g:6213:5: lv_value_2_0= ruleIdentifierValue
            {

            					newCompositeNode(grammarAccess.getCategoryFieldAccess().getValueIdentifierValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleIdentifierValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCategoryFieldRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"com.robenglander.libretto.spec.LibrettoSpec.IdentifierValue");
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
    // $ANTLR end "ruleCategoryField"


    // $ANTLR start "entryRuleConstraintsField"
    // InternalLibrettoSpec.g:6234:1: entryRuleConstraintsField returns [EObject current=null] : iv_ruleConstraintsField= ruleConstraintsField EOF ;
    public final EObject entryRuleConstraintsField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraintsField = null;


        try {
            // InternalLibrettoSpec.g:6234:57: (iv_ruleConstraintsField= ruleConstraintsField EOF )
            // InternalLibrettoSpec.g:6235:2: iv_ruleConstraintsField= ruleConstraintsField EOF
            {
             newCompositeNode(grammarAccess.getConstraintsFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstraintsField=ruleConstraintsField();

            state._fsp--;

             current =iv_ruleConstraintsField; 
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
    // $ANTLR end "entryRuleConstraintsField"


    // $ANTLR start "ruleConstraintsField"
    // InternalLibrettoSpec.g:6241:1: ruleConstraintsField returns [EObject current=null] : (otherlv_0= 'constraints' otherlv_1= ':' ( (lv_value_2_0= ruleTextList ) ) ) ;
    public final EObject ruleConstraintsField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:6247:2: ( (otherlv_0= 'constraints' otherlv_1= ':' ( (lv_value_2_0= ruleTextList ) ) ) )
            // InternalLibrettoSpec.g:6248:2: (otherlv_0= 'constraints' otherlv_1= ':' ( (lv_value_2_0= ruleTextList ) ) )
            {
            // InternalLibrettoSpec.g:6248:2: (otherlv_0= 'constraints' otherlv_1= ':' ( (lv_value_2_0= ruleTextList ) ) )
            // InternalLibrettoSpec.g:6249:3: otherlv_0= 'constraints' otherlv_1= ':' ( (lv_value_2_0= ruleTextList ) )
            {
            otherlv_0=(Token)match(input,83,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getConstraintsFieldAccess().getConstraintsKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getConstraintsFieldAccess().getColonKeyword_1());
            		
            // InternalLibrettoSpec.g:6257:3: ( (lv_value_2_0= ruleTextList ) )
            // InternalLibrettoSpec.g:6258:4: (lv_value_2_0= ruleTextList )
            {
            // InternalLibrettoSpec.g:6258:4: (lv_value_2_0= ruleTextList )
            // InternalLibrettoSpec.g:6259:5: lv_value_2_0= ruleTextList
            {

            					newCompositeNode(grammarAccess.getConstraintsFieldAccess().getValueTextListParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleTextList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstraintsFieldRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"com.robenglander.libretto.spec.LibrettoSpec.TextList");
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
    // $ANTLR end "ruleConstraintsField"


    // $ANTLR start "entryRuleAllowedFlexibilityField"
    // InternalLibrettoSpec.g:6280:1: entryRuleAllowedFlexibilityField returns [EObject current=null] : iv_ruleAllowedFlexibilityField= ruleAllowedFlexibilityField EOF ;
    public final EObject entryRuleAllowedFlexibilityField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllowedFlexibilityField = null;


        try {
            // InternalLibrettoSpec.g:6280:64: (iv_ruleAllowedFlexibilityField= ruleAllowedFlexibilityField EOF )
            // InternalLibrettoSpec.g:6281:2: iv_ruleAllowedFlexibilityField= ruleAllowedFlexibilityField EOF
            {
             newCompositeNode(grammarAccess.getAllowedFlexibilityFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAllowedFlexibilityField=ruleAllowedFlexibilityField();

            state._fsp--;

             current =iv_ruleAllowedFlexibilityField; 
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
    // $ANTLR end "entryRuleAllowedFlexibilityField"


    // $ANTLR start "ruleAllowedFlexibilityField"
    // InternalLibrettoSpec.g:6287:1: ruleAllowedFlexibilityField returns [EObject current=null] : (otherlv_0= 'allowed_flexibility' otherlv_1= ':' ( (lv_value_2_0= ruleTextList ) ) ) ;
    public final EObject ruleAllowedFlexibilityField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:6293:2: ( (otherlv_0= 'allowed_flexibility' otherlv_1= ':' ( (lv_value_2_0= ruleTextList ) ) ) )
            // InternalLibrettoSpec.g:6294:2: (otherlv_0= 'allowed_flexibility' otherlv_1= ':' ( (lv_value_2_0= ruleTextList ) ) )
            {
            // InternalLibrettoSpec.g:6294:2: (otherlv_0= 'allowed_flexibility' otherlv_1= ':' ( (lv_value_2_0= ruleTextList ) ) )
            // InternalLibrettoSpec.g:6295:3: otherlv_0= 'allowed_flexibility' otherlv_1= ':' ( (lv_value_2_0= ruleTextList ) )
            {
            otherlv_0=(Token)match(input,84,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getAllowedFlexibilityFieldAccess().getAllowed_flexibilityKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getAllowedFlexibilityFieldAccess().getColonKeyword_1());
            		
            // InternalLibrettoSpec.g:6303:3: ( (lv_value_2_0= ruleTextList ) )
            // InternalLibrettoSpec.g:6304:4: (lv_value_2_0= ruleTextList )
            {
            // InternalLibrettoSpec.g:6304:4: (lv_value_2_0= ruleTextList )
            // InternalLibrettoSpec.g:6305:5: lv_value_2_0= ruleTextList
            {

            					newCompositeNode(grammarAccess.getAllowedFlexibilityFieldAccess().getValueTextListParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleTextList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAllowedFlexibilityFieldRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"com.robenglander.libretto.spec.LibrettoSpec.TextList");
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
    // $ANTLR end "ruleAllowedFlexibilityField"


    // $ANTLR start "entryRuleRationaleField"
    // InternalLibrettoSpec.g:6326:1: entryRuleRationaleField returns [EObject current=null] : iv_ruleRationaleField= ruleRationaleField EOF ;
    public final EObject entryRuleRationaleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRationaleField = null;


        try {
            // InternalLibrettoSpec.g:6326:55: (iv_ruleRationaleField= ruleRationaleField EOF )
            // InternalLibrettoSpec.g:6327:2: iv_ruleRationaleField= ruleRationaleField EOF
            {
             newCompositeNode(grammarAccess.getRationaleFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRationaleField=ruleRationaleField();

            state._fsp--;

             current =iv_ruleRationaleField; 
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
    // $ANTLR end "entryRuleRationaleField"


    // $ANTLR start "ruleRationaleField"
    // InternalLibrettoSpec.g:6333:1: ruleRationaleField returns [EObject current=null] : (otherlv_0= 'rationale' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) ) ;
    public final EObject ruleRationaleField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:6339:2: ( (otherlv_0= 'rationale' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) ) )
            // InternalLibrettoSpec.g:6340:2: (otherlv_0= 'rationale' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) )
            {
            // InternalLibrettoSpec.g:6340:2: (otherlv_0= 'rationale' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) )
            // InternalLibrettoSpec.g:6341:3: otherlv_0= 'rationale' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) )
            {
            otherlv_0=(Token)match(input,85,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getRationaleFieldAccess().getRationaleKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getRationaleFieldAccess().getColonKeyword_1());
            		
            // InternalLibrettoSpec.g:6349:3: ( (lv_value_2_0= ruleTextValue ) )
            // InternalLibrettoSpec.g:6350:4: (lv_value_2_0= ruleTextValue )
            {
            // InternalLibrettoSpec.g:6350:4: (lv_value_2_0= ruleTextValue )
            // InternalLibrettoSpec.g:6351:5: lv_value_2_0= ruleTextValue
            {

            					newCompositeNode(grammarAccess.getRationaleFieldAccess().getValueTextValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleTextValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRationaleFieldRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"com.robenglander.libretto.spec.LibrettoSpec.TextValue");
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
    // $ANTLR end "ruleRationaleField"


    // $ANTLR start "entryRuleSourceBlock"
    // InternalLibrettoSpec.g:6372:1: entryRuleSourceBlock returns [EObject current=null] : iv_ruleSourceBlock= ruleSourceBlock EOF ;
    public final EObject entryRuleSourceBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSourceBlock = null;


        try {
            // InternalLibrettoSpec.g:6372:52: (iv_ruleSourceBlock= ruleSourceBlock EOF )
            // InternalLibrettoSpec.g:6373:2: iv_ruleSourceBlock= ruleSourceBlock EOF
            {
             newCompositeNode(grammarAccess.getSourceBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSourceBlock=ruleSourceBlock();

            state._fsp--;

             current =iv_ruleSourceBlock; 
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
    // $ANTLR end "entryRuleSourceBlock"


    // $ANTLR start "ruleSourceBlock"
    // InternalLibrettoSpec.g:6379:1: ruleSourceBlock returns [EObject current=null] : (otherlv_0= 'source' otherlv_1= '{' ( (lv_items_2_0= ruleSourceBlockItem ) )* otherlv_3= '}' ) ;
    public final EObject ruleSourceBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_items_2_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:6385:2: ( (otherlv_0= 'source' otherlv_1= '{' ( (lv_items_2_0= ruleSourceBlockItem ) )* otherlv_3= '}' ) )
            // InternalLibrettoSpec.g:6386:2: (otherlv_0= 'source' otherlv_1= '{' ( (lv_items_2_0= ruleSourceBlockItem ) )* otherlv_3= '}' )
            {
            // InternalLibrettoSpec.g:6386:2: (otherlv_0= 'source' otherlv_1= '{' ( (lv_items_2_0= ruleSourceBlockItem ) )* otherlv_3= '}' )
            // InternalLibrettoSpec.g:6387:3: otherlv_0= 'source' otherlv_1= '{' ( (lv_items_2_0= ruleSourceBlockItem ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,86,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSourceBlockAccess().getSourceKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_39); 

            			newLeafNode(otherlv_1, grammarAccess.getSourceBlockAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalLibrettoSpec.g:6395:3: ( (lv_items_2_0= ruleSourceBlockItem ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>=87 && LA37_0<=88)) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalLibrettoSpec.g:6396:4: (lv_items_2_0= ruleSourceBlockItem )
            	    {
            	    // InternalLibrettoSpec.g:6396:4: (lv_items_2_0= ruleSourceBlockItem )
            	    // InternalLibrettoSpec.g:6397:5: lv_items_2_0= ruleSourceBlockItem
            	    {

            	    					newCompositeNode(grammarAccess.getSourceBlockAccess().getItemsSourceBlockItemParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_39);
            	    lv_items_2_0=ruleSourceBlockItem();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSourceBlockRule());
            	    					}
            	    					add(
            	    						current,
            	    						"items",
            	    						lv_items_2_0,
            	    						"com.robenglander.libretto.spec.LibrettoSpec.SourceBlockItem");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            otherlv_3=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getSourceBlockAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleSourceBlock"


    // $ANTLR start "entryRuleSourceBlockItem"
    // InternalLibrettoSpec.g:6422:1: entryRuleSourceBlockItem returns [EObject current=null] : iv_ruleSourceBlockItem= ruleSourceBlockItem EOF ;
    public final EObject entryRuleSourceBlockItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSourceBlockItem = null;


        try {
            // InternalLibrettoSpec.g:6422:56: (iv_ruleSourceBlockItem= ruleSourceBlockItem EOF )
            // InternalLibrettoSpec.g:6423:2: iv_ruleSourceBlockItem= ruleSourceBlockItem EOF
            {
             newCompositeNode(grammarAccess.getSourceBlockItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSourceBlockItem=ruleSourceBlockItem();

            state._fsp--;

             current =iv_ruleSourceBlockItem; 
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
    // $ANTLR end "entryRuleSourceBlockItem"


    // $ANTLR start "ruleSourceBlockItem"
    // InternalLibrettoSpec.g:6429:1: ruleSourceBlockItem returns [EObject current=null] : (this_SourceBlockSectionItem_0= ruleSourceBlockSectionItem | this_SourceBlockSubsectionItem_1= ruleSourceBlockSubsectionItem ) ;
    public final EObject ruleSourceBlockItem() throws RecognitionException {
        EObject current = null;

        EObject this_SourceBlockSectionItem_0 = null;

        EObject this_SourceBlockSubsectionItem_1 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:6435:2: ( (this_SourceBlockSectionItem_0= ruleSourceBlockSectionItem | this_SourceBlockSubsectionItem_1= ruleSourceBlockSubsectionItem ) )
            // InternalLibrettoSpec.g:6436:2: (this_SourceBlockSectionItem_0= ruleSourceBlockSectionItem | this_SourceBlockSubsectionItem_1= ruleSourceBlockSubsectionItem )
            {
            // InternalLibrettoSpec.g:6436:2: (this_SourceBlockSectionItem_0= ruleSourceBlockSectionItem | this_SourceBlockSubsectionItem_1= ruleSourceBlockSubsectionItem )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==87) ) {
                alt38=1;
            }
            else if ( (LA38_0==88) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalLibrettoSpec.g:6437:3: this_SourceBlockSectionItem_0= ruleSourceBlockSectionItem
                    {

                    			newCompositeNode(grammarAccess.getSourceBlockItemAccess().getSourceBlockSectionItemParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SourceBlockSectionItem_0=ruleSourceBlockSectionItem();

                    state._fsp--;


                    			current = this_SourceBlockSectionItem_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalLibrettoSpec.g:6446:3: this_SourceBlockSubsectionItem_1= ruleSourceBlockSubsectionItem
                    {

                    			newCompositeNode(grammarAccess.getSourceBlockItemAccess().getSourceBlockSubsectionItemParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SourceBlockSubsectionItem_1=ruleSourceBlockSubsectionItem();

                    state._fsp--;


                    			current = this_SourceBlockSubsectionItem_1;
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
    // $ANTLR end "ruleSourceBlockItem"


    // $ANTLR start "entryRuleSourceBlockSectionItem"
    // InternalLibrettoSpec.g:6458:1: entryRuleSourceBlockSectionItem returns [EObject current=null] : iv_ruleSourceBlockSectionItem= ruleSourceBlockSectionItem EOF ;
    public final EObject entryRuleSourceBlockSectionItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSourceBlockSectionItem = null;


        try {
            // InternalLibrettoSpec.g:6458:63: (iv_ruleSourceBlockSectionItem= ruleSourceBlockSectionItem EOF )
            // InternalLibrettoSpec.g:6459:2: iv_ruleSourceBlockSectionItem= ruleSourceBlockSectionItem EOF
            {
             newCompositeNode(grammarAccess.getSourceBlockSectionItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSourceBlockSectionItem=ruleSourceBlockSectionItem();

            state._fsp--;

             current =iv_ruleSourceBlockSectionItem; 
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
    // $ANTLR end "entryRuleSourceBlockSectionItem"


    // $ANTLR start "ruleSourceBlockSectionItem"
    // InternalLibrettoSpec.g:6465:1: ruleSourceBlockSectionItem returns [EObject current=null] : ( (lv_section_0_0= ruleSectionField ) ) ;
    public final EObject ruleSourceBlockSectionItem() throws RecognitionException {
        EObject current = null;

        EObject lv_section_0_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:6471:2: ( ( (lv_section_0_0= ruleSectionField ) ) )
            // InternalLibrettoSpec.g:6472:2: ( (lv_section_0_0= ruleSectionField ) )
            {
            // InternalLibrettoSpec.g:6472:2: ( (lv_section_0_0= ruleSectionField ) )
            // InternalLibrettoSpec.g:6473:3: (lv_section_0_0= ruleSectionField )
            {
            // InternalLibrettoSpec.g:6473:3: (lv_section_0_0= ruleSectionField )
            // InternalLibrettoSpec.g:6474:4: lv_section_0_0= ruleSectionField
            {

            				newCompositeNode(grammarAccess.getSourceBlockSectionItemAccess().getSectionSectionFieldParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_section_0_0=ruleSectionField();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getSourceBlockSectionItemRule());
            				}
            				set(
            					current,
            					"section",
            					lv_section_0_0,
            					"com.robenglander.libretto.spec.LibrettoSpec.SectionField");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleSourceBlockSectionItem"


    // $ANTLR start "entryRuleSourceBlockSubsectionItem"
    // InternalLibrettoSpec.g:6494:1: entryRuleSourceBlockSubsectionItem returns [EObject current=null] : iv_ruleSourceBlockSubsectionItem= ruleSourceBlockSubsectionItem EOF ;
    public final EObject entryRuleSourceBlockSubsectionItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSourceBlockSubsectionItem = null;


        try {
            // InternalLibrettoSpec.g:6494:66: (iv_ruleSourceBlockSubsectionItem= ruleSourceBlockSubsectionItem EOF )
            // InternalLibrettoSpec.g:6495:2: iv_ruleSourceBlockSubsectionItem= ruleSourceBlockSubsectionItem EOF
            {
             newCompositeNode(grammarAccess.getSourceBlockSubsectionItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSourceBlockSubsectionItem=ruleSourceBlockSubsectionItem();

            state._fsp--;

             current =iv_ruleSourceBlockSubsectionItem; 
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
    // $ANTLR end "entryRuleSourceBlockSubsectionItem"


    // $ANTLR start "ruleSourceBlockSubsectionItem"
    // InternalLibrettoSpec.g:6501:1: ruleSourceBlockSubsectionItem returns [EObject current=null] : ( (lv_subsection_0_0= ruleSubsectionField ) ) ;
    public final EObject ruleSourceBlockSubsectionItem() throws RecognitionException {
        EObject current = null;

        EObject lv_subsection_0_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:6507:2: ( ( (lv_subsection_0_0= ruleSubsectionField ) ) )
            // InternalLibrettoSpec.g:6508:2: ( (lv_subsection_0_0= ruleSubsectionField ) )
            {
            // InternalLibrettoSpec.g:6508:2: ( (lv_subsection_0_0= ruleSubsectionField ) )
            // InternalLibrettoSpec.g:6509:3: (lv_subsection_0_0= ruleSubsectionField )
            {
            // InternalLibrettoSpec.g:6509:3: (lv_subsection_0_0= ruleSubsectionField )
            // InternalLibrettoSpec.g:6510:4: lv_subsection_0_0= ruleSubsectionField
            {

            				newCompositeNode(grammarAccess.getSourceBlockSubsectionItemAccess().getSubsectionSubsectionFieldParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_subsection_0_0=ruleSubsectionField();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getSourceBlockSubsectionItemRule());
            				}
            				set(
            					current,
            					"subsection",
            					lv_subsection_0_0,
            					"com.robenglander.libretto.spec.LibrettoSpec.SubsectionField");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleSourceBlockSubsectionItem"


    // $ANTLR start "entryRuleSectionField"
    // InternalLibrettoSpec.g:6530:1: entryRuleSectionField returns [EObject current=null] : iv_ruleSectionField= ruleSectionField EOF ;
    public final EObject entryRuleSectionField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSectionField = null;


        try {
            // InternalLibrettoSpec.g:6530:53: (iv_ruleSectionField= ruleSectionField EOF )
            // InternalLibrettoSpec.g:6531:2: iv_ruleSectionField= ruleSectionField EOF
            {
             newCompositeNode(grammarAccess.getSectionFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSectionField=ruleSectionField();

            state._fsp--;

             current =iv_ruleSectionField; 
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
    // $ANTLR end "entryRuleSectionField"


    // $ANTLR start "ruleSectionField"
    // InternalLibrettoSpec.g:6537:1: ruleSectionField returns [EObject current=null] : (otherlv_0= 'section' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) ) ;
    public final EObject ruleSectionField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:6543:2: ( (otherlv_0= 'section' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) ) )
            // InternalLibrettoSpec.g:6544:2: (otherlv_0= 'section' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) )
            {
            // InternalLibrettoSpec.g:6544:2: (otherlv_0= 'section' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) )
            // InternalLibrettoSpec.g:6545:3: otherlv_0= 'section' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) )
            {
            otherlv_0=(Token)match(input,87,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getSectionFieldAccess().getSectionKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getSectionFieldAccess().getColonKeyword_1());
            		
            // InternalLibrettoSpec.g:6553:3: ( (lv_value_2_0= ruleTextValue ) )
            // InternalLibrettoSpec.g:6554:4: (lv_value_2_0= ruleTextValue )
            {
            // InternalLibrettoSpec.g:6554:4: (lv_value_2_0= ruleTextValue )
            // InternalLibrettoSpec.g:6555:5: lv_value_2_0= ruleTextValue
            {

            					newCompositeNode(grammarAccess.getSectionFieldAccess().getValueTextValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleTextValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSectionFieldRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"com.robenglander.libretto.spec.LibrettoSpec.TextValue");
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
    // $ANTLR end "ruleSectionField"


    // $ANTLR start "entryRuleSubsectionField"
    // InternalLibrettoSpec.g:6576:1: entryRuleSubsectionField returns [EObject current=null] : iv_ruleSubsectionField= ruleSubsectionField EOF ;
    public final EObject entryRuleSubsectionField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubsectionField = null;


        try {
            // InternalLibrettoSpec.g:6576:56: (iv_ruleSubsectionField= ruleSubsectionField EOF )
            // InternalLibrettoSpec.g:6577:2: iv_ruleSubsectionField= ruleSubsectionField EOF
            {
             newCompositeNode(grammarAccess.getSubsectionFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubsectionField=ruleSubsectionField();

            state._fsp--;

             current =iv_ruleSubsectionField; 
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
    // $ANTLR end "entryRuleSubsectionField"


    // $ANTLR start "ruleSubsectionField"
    // InternalLibrettoSpec.g:6583:1: ruleSubsectionField returns [EObject current=null] : (otherlv_0= 'subsection' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) ) ;
    public final EObject ruleSubsectionField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:6589:2: ( (otherlv_0= 'subsection' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) ) )
            // InternalLibrettoSpec.g:6590:2: (otherlv_0= 'subsection' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) )
            {
            // InternalLibrettoSpec.g:6590:2: (otherlv_0= 'subsection' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) )
            // InternalLibrettoSpec.g:6591:3: otherlv_0= 'subsection' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) )
            {
            otherlv_0=(Token)match(input,88,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getSubsectionFieldAccess().getSubsectionKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getSubsectionFieldAccess().getColonKeyword_1());
            		
            // InternalLibrettoSpec.g:6599:3: ( (lv_value_2_0= ruleTextValue ) )
            // InternalLibrettoSpec.g:6600:4: (lv_value_2_0= ruleTextValue )
            {
            // InternalLibrettoSpec.g:6600:4: (lv_value_2_0= ruleTextValue )
            // InternalLibrettoSpec.g:6601:5: lv_value_2_0= ruleTextValue
            {

            					newCompositeNode(grammarAccess.getSubsectionFieldAccess().getValueTextValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleTextValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubsectionFieldRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"com.robenglander.libretto.spec.LibrettoSpec.TextValue");
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
    // $ANTLR end "ruleSubsectionField"


    // $ANTLR start "entryRuleTextField"
    // InternalLibrettoSpec.g:6622:1: entryRuleTextField returns [EObject current=null] : iv_ruleTextField= ruleTextField EOF ;
    public final EObject entryRuleTextField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextField = null;


        try {
            // InternalLibrettoSpec.g:6622:50: (iv_ruleTextField= ruleTextField EOF )
            // InternalLibrettoSpec.g:6623:2: iv_ruleTextField= ruleTextField EOF
            {
             newCompositeNode(grammarAccess.getTextFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTextField=ruleTextField();

            state._fsp--;

             current =iv_ruleTextField; 
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
    // $ANTLR end "entryRuleTextField"


    // $ANTLR start "ruleTextField"
    // InternalLibrettoSpec.g:6629:1: ruleTextField returns [EObject current=null] : (otherlv_0= 'text' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) ) ;
    public final EObject ruleTextField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:6635:2: ( (otherlv_0= 'text' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) ) )
            // InternalLibrettoSpec.g:6636:2: (otherlv_0= 'text' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) )
            {
            // InternalLibrettoSpec.g:6636:2: (otherlv_0= 'text' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) ) )
            // InternalLibrettoSpec.g:6637:3: otherlv_0= 'text' otherlv_1= ':' ( (lv_value_2_0= ruleTextValue ) )
            {
            otherlv_0=(Token)match(input,89,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getTextFieldAccess().getTextKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getTextFieldAccess().getColonKeyword_1());
            		
            // InternalLibrettoSpec.g:6645:3: ( (lv_value_2_0= ruleTextValue ) )
            // InternalLibrettoSpec.g:6646:4: (lv_value_2_0= ruleTextValue )
            {
            // InternalLibrettoSpec.g:6646:4: (lv_value_2_0= ruleTextValue )
            // InternalLibrettoSpec.g:6647:5: lv_value_2_0= ruleTextValue
            {

            					newCompositeNode(grammarAccess.getTextFieldAccess().getValueTextValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleTextValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTextFieldRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"com.robenglander.libretto.spec.LibrettoSpec.TextValue");
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
    // $ANTLR end "ruleTextField"


    // $ANTLR start "entryRuleBehaviorId"
    // InternalLibrettoSpec.g:6668:1: entryRuleBehaviorId returns [String current=null] : iv_ruleBehaviorId= ruleBehaviorId EOF ;
    public final String entryRuleBehaviorId() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBehaviorId = null;


        try {
            // InternalLibrettoSpec.g:6668:50: (iv_ruleBehaviorId= ruleBehaviorId EOF )
            // InternalLibrettoSpec.g:6669:2: iv_ruleBehaviorId= ruleBehaviorId EOF
            {
             newCompositeNode(grammarAccess.getBehaviorIdRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBehaviorId=ruleBehaviorId();

            state._fsp--;

             current =iv_ruleBehaviorId.getText(); 
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
    // $ANTLR end "entryRuleBehaviorId"


    // $ANTLR start "ruleBehaviorId"
    // InternalLibrettoSpec.g:6675:1: ruleBehaviorId returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_BEHAVIOR_ID_0= RULE_BEHAVIOR_ID ;
    public final AntlrDatatypeRuleToken ruleBehaviorId() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BEHAVIOR_ID_0=null;


        	enterRule();

        try {
            // InternalLibrettoSpec.g:6681:2: (this_BEHAVIOR_ID_0= RULE_BEHAVIOR_ID )
            // InternalLibrettoSpec.g:6682:2: this_BEHAVIOR_ID_0= RULE_BEHAVIOR_ID
            {
            this_BEHAVIOR_ID_0=(Token)match(input,RULE_BEHAVIOR_ID,FOLLOW_2); 

            		current.merge(this_BEHAVIOR_ID_0);
            	

            		newLeafNode(this_BEHAVIOR_ID_0, grammarAccess.getBehaviorIdAccess().getBEHAVIOR_IDTerminalRuleCall());
            	

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
    // $ANTLR end "ruleBehaviorId"


    // $ANTLR start "entryRuleAcceptanceTestId"
    // InternalLibrettoSpec.g:6692:1: entryRuleAcceptanceTestId returns [String current=null] : iv_ruleAcceptanceTestId= ruleAcceptanceTestId EOF ;
    public final String entryRuleAcceptanceTestId() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAcceptanceTestId = null;


        try {
            // InternalLibrettoSpec.g:6692:56: (iv_ruleAcceptanceTestId= ruleAcceptanceTestId EOF )
            // InternalLibrettoSpec.g:6693:2: iv_ruleAcceptanceTestId= ruleAcceptanceTestId EOF
            {
             newCompositeNode(grammarAccess.getAcceptanceTestIdRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAcceptanceTestId=ruleAcceptanceTestId();

            state._fsp--;

             current =iv_ruleAcceptanceTestId.getText(); 
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
    // $ANTLR end "entryRuleAcceptanceTestId"


    // $ANTLR start "ruleAcceptanceTestId"
    // InternalLibrettoSpec.g:6699:1: ruleAcceptanceTestId returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ACCEPTANCE_TEST_ID_0= RULE_ACCEPTANCE_TEST_ID ;
    public final AntlrDatatypeRuleToken ruleAcceptanceTestId() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ACCEPTANCE_TEST_ID_0=null;


        	enterRule();

        try {
            // InternalLibrettoSpec.g:6705:2: (this_ACCEPTANCE_TEST_ID_0= RULE_ACCEPTANCE_TEST_ID )
            // InternalLibrettoSpec.g:6706:2: this_ACCEPTANCE_TEST_ID_0= RULE_ACCEPTANCE_TEST_ID
            {
            this_ACCEPTANCE_TEST_ID_0=(Token)match(input,RULE_ACCEPTANCE_TEST_ID,FOLLOW_2); 

            		current.merge(this_ACCEPTANCE_TEST_ID_0);
            	

            		newLeafNode(this_ACCEPTANCE_TEST_ID_0, grammarAccess.getAcceptanceTestIdAccess().getACCEPTANCE_TEST_IDTerminalRuleCall());
            	

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
    // $ANTLR end "ruleAcceptanceTestId"


    // $ANTLR start "entryRuleImplementationDirectiveId"
    // InternalLibrettoSpec.g:6716:1: entryRuleImplementationDirectiveId returns [String current=null] : iv_ruleImplementationDirectiveId= ruleImplementationDirectiveId EOF ;
    public final String entryRuleImplementationDirectiveId() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImplementationDirectiveId = null;


        try {
            // InternalLibrettoSpec.g:6716:65: (iv_ruleImplementationDirectiveId= ruleImplementationDirectiveId EOF )
            // InternalLibrettoSpec.g:6717:2: iv_ruleImplementationDirectiveId= ruleImplementationDirectiveId EOF
            {
             newCompositeNode(grammarAccess.getImplementationDirectiveIdRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImplementationDirectiveId=ruleImplementationDirectiveId();

            state._fsp--;

             current =iv_ruleImplementationDirectiveId.getText(); 
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
    // $ANTLR end "entryRuleImplementationDirectiveId"


    // $ANTLR start "ruleImplementationDirectiveId"
    // InternalLibrettoSpec.g:6723:1: ruleImplementationDirectiveId returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_IMPLEMENTATION_DIRECTIVE_ID_0= RULE_IMPLEMENTATION_DIRECTIVE_ID ;
    public final AntlrDatatypeRuleToken ruleImplementationDirectiveId() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IMPLEMENTATION_DIRECTIVE_ID_0=null;


        	enterRule();

        try {
            // InternalLibrettoSpec.g:6729:2: (this_IMPLEMENTATION_DIRECTIVE_ID_0= RULE_IMPLEMENTATION_DIRECTIVE_ID )
            // InternalLibrettoSpec.g:6730:2: this_IMPLEMENTATION_DIRECTIVE_ID_0= RULE_IMPLEMENTATION_DIRECTIVE_ID
            {
            this_IMPLEMENTATION_DIRECTIVE_ID_0=(Token)match(input,RULE_IMPLEMENTATION_DIRECTIVE_ID,FOLLOW_2); 

            		current.merge(this_IMPLEMENTATION_DIRECTIVE_ID_0);
            	

            		newLeafNode(this_IMPLEMENTATION_DIRECTIVE_ID_0, grammarAccess.getImplementationDirectiveIdAccess().getIMPLEMENTATION_DIRECTIVE_IDTerminalRuleCall());
            	

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
    // $ANTLR end "ruleImplementationDirectiveId"


    // $ANTLR start "entryRuleRefId"
    // InternalLibrettoSpec.g:6740:1: entryRuleRefId returns [String current=null] : iv_ruleRefId= ruleRefId EOF ;
    public final String entryRuleRefId() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRefId = null;


        try {
            // InternalLibrettoSpec.g:6740:45: (iv_ruleRefId= ruleRefId EOF )
            // InternalLibrettoSpec.g:6741:2: iv_ruleRefId= ruleRefId EOF
            {
             newCompositeNode(grammarAccess.getRefIdRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRefId=ruleRefId();

            state._fsp--;

             current =iv_ruleRefId.getText(); 
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
    // $ANTLR end "entryRuleRefId"


    // $ANTLR start "ruleRefId"
    // InternalLibrettoSpec.g:6747:1: ruleRefId returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_REF_ID_0= RULE_REF_ID ;
    public final AntlrDatatypeRuleToken ruleRefId() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_REF_ID_0=null;


        	enterRule();

        try {
            // InternalLibrettoSpec.g:6753:2: (this_REF_ID_0= RULE_REF_ID )
            // InternalLibrettoSpec.g:6754:2: this_REF_ID_0= RULE_REF_ID
            {
            this_REF_ID_0=(Token)match(input,RULE_REF_ID,FOLLOW_2); 

            		current.merge(this_REF_ID_0);
            	

            		newLeafNode(this_REF_ID_0, grammarAccess.getRefIdAccess().getREF_IDTerminalRuleCall());
            	

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
    // $ANTLR end "ruleRefId"


    // $ANTLR start "entryRuleOosId"
    // InternalLibrettoSpec.g:6764:1: entryRuleOosId returns [String current=null] : iv_ruleOosId= ruleOosId EOF ;
    public final String entryRuleOosId() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOosId = null;


        try {
            // InternalLibrettoSpec.g:6764:45: (iv_ruleOosId= ruleOosId EOF )
            // InternalLibrettoSpec.g:6765:2: iv_ruleOosId= ruleOosId EOF
            {
             newCompositeNode(grammarAccess.getOosIdRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOosId=ruleOosId();

            state._fsp--;

             current =iv_ruleOosId.getText(); 
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
    // $ANTLR end "entryRuleOosId"


    // $ANTLR start "ruleOosId"
    // InternalLibrettoSpec.g:6771:1: ruleOosId returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_OOS_ID_0= RULE_OOS_ID ;
    public final AntlrDatatypeRuleToken ruleOosId() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_OOS_ID_0=null;


        	enterRule();

        try {
            // InternalLibrettoSpec.g:6777:2: (this_OOS_ID_0= RULE_OOS_ID )
            // InternalLibrettoSpec.g:6778:2: this_OOS_ID_0= RULE_OOS_ID
            {
            this_OOS_ID_0=(Token)match(input,RULE_OOS_ID,FOLLOW_2); 

            		current.merge(this_OOS_ID_0);
            	

            		newLeafNode(this_OOS_ID_0, grammarAccess.getOosIdAccess().getOOS_IDTerminalRuleCall());
            	

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
    // $ANTLR end "ruleOosId"


    // $ANTLR start "entryRuleIdentifierList"
    // InternalLibrettoSpec.g:6788:1: entryRuleIdentifierList returns [EObject current=null] : iv_ruleIdentifierList= ruleIdentifierList EOF ;
    public final EObject entryRuleIdentifierList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdentifierList = null;


        try {
            // InternalLibrettoSpec.g:6788:55: (iv_ruleIdentifierList= ruleIdentifierList EOF )
            // InternalLibrettoSpec.g:6789:2: iv_ruleIdentifierList= ruleIdentifierList EOF
            {
             newCompositeNode(grammarAccess.getIdentifierListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIdentifierList=ruleIdentifierList();

            state._fsp--;

             current =iv_ruleIdentifierList; 
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
    // $ANTLR end "entryRuleIdentifierList"


    // $ANTLR start "ruleIdentifierList"
    // InternalLibrettoSpec.g:6795:1: ruleIdentifierList returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleIdentifierValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleIdentifierValue ) ) )* )? otherlv_5= ']' ) ;
    public final EObject ruleIdentifierList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_values_2_0 = null;

        EObject lv_values_4_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:6801:2: ( ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleIdentifierValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleIdentifierValue ) ) )* )? otherlv_5= ']' ) )
            // InternalLibrettoSpec.g:6802:2: ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleIdentifierValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleIdentifierValue ) ) )* )? otherlv_5= ']' )
            {
            // InternalLibrettoSpec.g:6802:2: ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleIdentifierValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleIdentifierValue ) ) )* )? otherlv_5= ']' )
            // InternalLibrettoSpec.g:6803:3: () otherlv_1= '[' ( ( (lv_values_2_0= ruleIdentifierValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleIdentifierValue ) ) )* )? otherlv_5= ']'
            {
            // InternalLibrettoSpec.g:6803:3: ()
            // InternalLibrettoSpec.g:6804:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIdentifierListAccess().getIdentifierListAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,90,FOLLOW_40); 

            			newLeafNode(otherlv_1, grammarAccess.getIdentifierListAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalLibrettoSpec.g:6814:3: ( ( (lv_values_2_0= ruleIdentifierValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleIdentifierValue ) ) )* )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_LIBRETTO_ID) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalLibrettoSpec.g:6815:4: ( (lv_values_2_0= ruleIdentifierValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleIdentifierValue ) ) )*
                    {
                    // InternalLibrettoSpec.g:6815:4: ( (lv_values_2_0= ruleIdentifierValue ) )
                    // InternalLibrettoSpec.g:6816:5: (lv_values_2_0= ruleIdentifierValue )
                    {
                    // InternalLibrettoSpec.g:6816:5: (lv_values_2_0= ruleIdentifierValue )
                    // InternalLibrettoSpec.g:6817:6: lv_values_2_0= ruleIdentifierValue
                    {

                    						newCompositeNode(grammarAccess.getIdentifierListAccess().getValuesIdentifierValueParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_41);
                    lv_values_2_0=ruleIdentifierValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIdentifierListRule());
                    						}
                    						add(
                    							current,
                    							"values",
                    							lv_values_2_0,
                    							"com.robenglander.libretto.spec.LibrettoSpec.IdentifierValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalLibrettoSpec.g:6834:4: (otherlv_3= ',' ( (lv_values_4_0= ruleIdentifierValue ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==91) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalLibrettoSpec.g:6835:5: otherlv_3= ',' ( (lv_values_4_0= ruleIdentifierValue ) )
                    	    {
                    	    otherlv_3=(Token)match(input,91,FOLLOW_3); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getIdentifierListAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalLibrettoSpec.g:6839:5: ( (lv_values_4_0= ruleIdentifierValue ) )
                    	    // InternalLibrettoSpec.g:6840:6: (lv_values_4_0= ruleIdentifierValue )
                    	    {
                    	    // InternalLibrettoSpec.g:6840:6: (lv_values_4_0= ruleIdentifierValue )
                    	    // InternalLibrettoSpec.g:6841:7: lv_values_4_0= ruleIdentifierValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getIdentifierListAccess().getValuesIdentifierValueParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_41);
                    	    lv_values_4_0=ruleIdentifierValue();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getIdentifierListRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"values",
                    	    								lv_values_4_0,
                    	    								"com.robenglander.libretto.spec.LibrettoSpec.IdentifierValue");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,92,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getIdentifierListAccess().getRightSquareBracketKeyword_3());
            		

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
    // $ANTLR end "ruleIdentifierList"


    // $ANTLR start "entryRuleBehaviorIdList"
    // InternalLibrettoSpec.g:6868:1: entryRuleBehaviorIdList returns [EObject current=null] : iv_ruleBehaviorIdList= ruleBehaviorIdList EOF ;
    public final EObject entryRuleBehaviorIdList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviorIdList = null;


        try {
            // InternalLibrettoSpec.g:6868:55: (iv_ruleBehaviorIdList= ruleBehaviorIdList EOF )
            // InternalLibrettoSpec.g:6869:2: iv_ruleBehaviorIdList= ruleBehaviorIdList EOF
            {
             newCompositeNode(grammarAccess.getBehaviorIdListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBehaviorIdList=ruleBehaviorIdList();

            state._fsp--;

             current =iv_ruleBehaviorIdList; 
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
    // $ANTLR end "entryRuleBehaviorIdList"


    // $ANTLR start "ruleBehaviorIdList"
    // InternalLibrettoSpec.g:6875:1: ruleBehaviorIdList returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleBehaviorId ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleBehaviorId ) ) )* )? otherlv_5= ']' ) ;
    public final EObject ruleBehaviorIdList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_values_2_0 = null;

        AntlrDatatypeRuleToken lv_values_4_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:6881:2: ( ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleBehaviorId ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleBehaviorId ) ) )* )? otherlv_5= ']' ) )
            // InternalLibrettoSpec.g:6882:2: ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleBehaviorId ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleBehaviorId ) ) )* )? otherlv_5= ']' )
            {
            // InternalLibrettoSpec.g:6882:2: ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleBehaviorId ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleBehaviorId ) ) )* )? otherlv_5= ']' )
            // InternalLibrettoSpec.g:6883:3: () otherlv_1= '[' ( ( (lv_values_2_0= ruleBehaviorId ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleBehaviorId ) ) )* )? otherlv_5= ']'
            {
            // InternalLibrettoSpec.g:6883:3: ()
            // InternalLibrettoSpec.g:6884:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBehaviorIdListAccess().getBehaviorIdListAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,90,FOLLOW_42); 

            			newLeafNode(otherlv_1, grammarAccess.getBehaviorIdListAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalLibrettoSpec.g:6894:3: ( ( (lv_values_2_0= ruleBehaviorId ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleBehaviorId ) ) )* )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_BEHAVIOR_ID) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalLibrettoSpec.g:6895:4: ( (lv_values_2_0= ruleBehaviorId ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleBehaviorId ) ) )*
                    {
                    // InternalLibrettoSpec.g:6895:4: ( (lv_values_2_0= ruleBehaviorId ) )
                    // InternalLibrettoSpec.g:6896:5: (lv_values_2_0= ruleBehaviorId )
                    {
                    // InternalLibrettoSpec.g:6896:5: (lv_values_2_0= ruleBehaviorId )
                    // InternalLibrettoSpec.g:6897:6: lv_values_2_0= ruleBehaviorId
                    {

                    						newCompositeNode(grammarAccess.getBehaviorIdListAccess().getValuesBehaviorIdParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_41);
                    lv_values_2_0=ruleBehaviorId();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBehaviorIdListRule());
                    						}
                    						add(
                    							current,
                    							"values",
                    							lv_values_2_0,
                    							"com.robenglander.libretto.spec.LibrettoSpec.BehaviorId");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalLibrettoSpec.g:6914:4: (otherlv_3= ',' ( (lv_values_4_0= ruleBehaviorId ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==91) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalLibrettoSpec.g:6915:5: otherlv_3= ',' ( (lv_values_4_0= ruleBehaviorId ) )
                    	    {
                    	    otherlv_3=(Token)match(input,91,FOLLOW_27); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getBehaviorIdListAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalLibrettoSpec.g:6919:5: ( (lv_values_4_0= ruleBehaviorId ) )
                    	    // InternalLibrettoSpec.g:6920:6: (lv_values_4_0= ruleBehaviorId )
                    	    {
                    	    // InternalLibrettoSpec.g:6920:6: (lv_values_4_0= ruleBehaviorId )
                    	    // InternalLibrettoSpec.g:6921:7: lv_values_4_0= ruleBehaviorId
                    	    {

                    	    							newCompositeNode(grammarAccess.getBehaviorIdListAccess().getValuesBehaviorIdParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_41);
                    	    lv_values_4_0=ruleBehaviorId();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBehaviorIdListRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"values",
                    	    								lv_values_4_0,
                    	    								"com.robenglander.libretto.spec.LibrettoSpec.BehaviorId");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,92,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getBehaviorIdListAccess().getRightSquareBracketKeyword_3());
            		

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
    // $ANTLR end "ruleBehaviorIdList"


    // $ANTLR start "entryRuleReferenceIdList"
    // InternalLibrettoSpec.g:6948:1: entryRuleReferenceIdList returns [EObject current=null] : iv_ruleReferenceIdList= ruleReferenceIdList EOF ;
    public final EObject entryRuleReferenceIdList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceIdList = null;


        try {
            // InternalLibrettoSpec.g:6948:56: (iv_ruleReferenceIdList= ruleReferenceIdList EOF )
            // InternalLibrettoSpec.g:6949:2: iv_ruleReferenceIdList= ruleReferenceIdList EOF
            {
             newCompositeNode(grammarAccess.getReferenceIdListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReferenceIdList=ruleReferenceIdList();

            state._fsp--;

             current =iv_ruleReferenceIdList; 
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
    // $ANTLR end "entryRuleReferenceIdList"


    // $ANTLR start "ruleReferenceIdList"
    // InternalLibrettoSpec.g:6955:1: ruleReferenceIdList returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleRefId ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleRefId ) ) )* )? otherlv_5= ']' ) ;
    public final EObject ruleReferenceIdList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_values_2_0 = null;

        AntlrDatatypeRuleToken lv_values_4_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:6961:2: ( ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleRefId ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleRefId ) ) )* )? otherlv_5= ']' ) )
            // InternalLibrettoSpec.g:6962:2: ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleRefId ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleRefId ) ) )* )? otherlv_5= ']' )
            {
            // InternalLibrettoSpec.g:6962:2: ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleRefId ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleRefId ) ) )* )? otherlv_5= ']' )
            // InternalLibrettoSpec.g:6963:3: () otherlv_1= '[' ( ( (lv_values_2_0= ruleRefId ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleRefId ) ) )* )? otherlv_5= ']'
            {
            // InternalLibrettoSpec.g:6963:3: ()
            // InternalLibrettoSpec.g:6964:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getReferenceIdListAccess().getReferenceIdListAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,90,FOLLOW_43); 

            			newLeafNode(otherlv_1, grammarAccess.getReferenceIdListAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalLibrettoSpec.g:6974:3: ( ( (lv_values_2_0= ruleRefId ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleRefId ) ) )* )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_REF_ID) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalLibrettoSpec.g:6975:4: ( (lv_values_2_0= ruleRefId ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleRefId ) ) )*
                    {
                    // InternalLibrettoSpec.g:6975:4: ( (lv_values_2_0= ruleRefId ) )
                    // InternalLibrettoSpec.g:6976:5: (lv_values_2_0= ruleRefId )
                    {
                    // InternalLibrettoSpec.g:6976:5: (lv_values_2_0= ruleRefId )
                    // InternalLibrettoSpec.g:6977:6: lv_values_2_0= ruleRefId
                    {

                    						newCompositeNode(grammarAccess.getReferenceIdListAccess().getValuesRefIdParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_41);
                    lv_values_2_0=ruleRefId();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReferenceIdListRule());
                    						}
                    						add(
                    							current,
                    							"values",
                    							lv_values_2_0,
                    							"com.robenglander.libretto.spec.LibrettoSpec.RefId");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalLibrettoSpec.g:6994:4: (otherlv_3= ',' ( (lv_values_4_0= ruleRefId ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==91) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // InternalLibrettoSpec.g:6995:5: otherlv_3= ',' ( (lv_values_4_0= ruleRefId ) )
                    	    {
                    	    otherlv_3=(Token)match(input,91,FOLLOW_21); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getReferenceIdListAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalLibrettoSpec.g:6999:5: ( (lv_values_4_0= ruleRefId ) )
                    	    // InternalLibrettoSpec.g:7000:6: (lv_values_4_0= ruleRefId )
                    	    {
                    	    // InternalLibrettoSpec.g:7000:6: (lv_values_4_0= ruleRefId )
                    	    // InternalLibrettoSpec.g:7001:7: lv_values_4_0= ruleRefId
                    	    {

                    	    							newCompositeNode(grammarAccess.getReferenceIdListAccess().getValuesRefIdParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_41);
                    	    lv_values_4_0=ruleRefId();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getReferenceIdListRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"values",
                    	    								lv_values_4_0,
                    	    								"com.robenglander.libretto.spec.LibrettoSpec.RefId");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,92,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getReferenceIdListAccess().getRightSquareBracketKeyword_3());
            		

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
    // $ANTLR end "ruleReferenceIdList"


    // $ANTLR start "entryRuleTextList"
    // InternalLibrettoSpec.g:7028:1: entryRuleTextList returns [EObject current=null] : iv_ruleTextList= ruleTextList EOF ;
    public final EObject entryRuleTextList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextList = null;


        try {
            // InternalLibrettoSpec.g:7028:49: (iv_ruleTextList= ruleTextList EOF )
            // InternalLibrettoSpec.g:7029:2: iv_ruleTextList= ruleTextList EOF
            {
             newCompositeNode(grammarAccess.getTextListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTextList=ruleTextList();

            state._fsp--;

             current =iv_ruleTextList; 
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
    // $ANTLR end "entryRuleTextList"


    // $ANTLR start "ruleTextList"
    // InternalLibrettoSpec.g:7035:1: ruleTextList returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleTextValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleTextValue ) ) )* )? otherlv_5= ']' ) ;
    public final EObject ruleTextList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_values_2_0 = null;

        EObject lv_values_4_0 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:7041:2: ( ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleTextValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleTextValue ) ) )* )? otherlv_5= ']' ) )
            // InternalLibrettoSpec.g:7042:2: ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleTextValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleTextValue ) ) )* )? otherlv_5= ']' )
            {
            // InternalLibrettoSpec.g:7042:2: ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleTextValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleTextValue ) ) )* )? otherlv_5= ']' )
            // InternalLibrettoSpec.g:7043:3: () otherlv_1= '[' ( ( (lv_values_2_0= ruleTextValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleTextValue ) ) )* )? otherlv_5= ']'
            {
            // InternalLibrettoSpec.g:7043:3: ()
            // InternalLibrettoSpec.g:7044:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTextListAccess().getTextListAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,90,FOLLOW_44); 

            			newLeafNode(otherlv_1, grammarAccess.getTextListAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalLibrettoSpec.g:7054:3: ( ( (lv_values_2_0= ruleTextValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleTextValue ) ) )* )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=RULE_STRING && LA46_0<=RULE_TEXT_BLOCK)) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalLibrettoSpec.g:7055:4: ( (lv_values_2_0= ruleTextValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleTextValue ) ) )*
                    {
                    // InternalLibrettoSpec.g:7055:4: ( (lv_values_2_0= ruleTextValue ) )
                    // InternalLibrettoSpec.g:7056:5: (lv_values_2_0= ruleTextValue )
                    {
                    // InternalLibrettoSpec.g:7056:5: (lv_values_2_0= ruleTextValue )
                    // InternalLibrettoSpec.g:7057:6: lv_values_2_0= ruleTextValue
                    {

                    						newCompositeNode(grammarAccess.getTextListAccess().getValuesTextValueParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_41);
                    lv_values_2_0=ruleTextValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTextListRule());
                    						}
                    						add(
                    							current,
                    							"values",
                    							lv_values_2_0,
                    							"com.robenglander.libretto.spec.LibrettoSpec.TextValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalLibrettoSpec.g:7074:4: (otherlv_3= ',' ( (lv_values_4_0= ruleTextValue ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==91) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // InternalLibrettoSpec.g:7075:5: otherlv_3= ',' ( (lv_values_4_0= ruleTextValue ) )
                    	    {
                    	    otherlv_3=(Token)match(input,91,FOLLOW_18); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getTextListAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalLibrettoSpec.g:7079:5: ( (lv_values_4_0= ruleTextValue ) )
                    	    // InternalLibrettoSpec.g:7080:6: (lv_values_4_0= ruleTextValue )
                    	    {
                    	    // InternalLibrettoSpec.g:7080:6: (lv_values_4_0= ruleTextValue )
                    	    // InternalLibrettoSpec.g:7081:7: lv_values_4_0= ruleTextValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getTextListAccess().getValuesTextValueParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_41);
                    	    lv_values_4_0=ruleTextValue();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTextListRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"values",
                    	    								lv_values_4_0,
                    	    								"com.robenglander.libretto.spec.LibrettoSpec.TextValue");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,92,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getTextListAccess().getRightSquareBracketKeyword_3());
            		

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
    // $ANTLR end "ruleTextList"


    // $ANTLR start "entryRuleTextValue"
    // InternalLibrettoSpec.g:7108:1: entryRuleTextValue returns [EObject current=null] : iv_ruleTextValue= ruleTextValue EOF ;
    public final EObject entryRuleTextValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextValue = null;


        try {
            // InternalLibrettoSpec.g:7108:50: (iv_ruleTextValue= ruleTextValue EOF )
            // InternalLibrettoSpec.g:7109:2: iv_ruleTextValue= ruleTextValue EOF
            {
             newCompositeNode(grammarAccess.getTextValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTextValue=ruleTextValue();

            state._fsp--;

             current =iv_ruleTextValue; 
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
    // $ANTLR end "entryRuleTextValue"


    // $ANTLR start "ruleTextValue"
    // InternalLibrettoSpec.g:7115:1: ruleTextValue returns [EObject current=null] : ( ( () ( (lv_text_1_0= RULE_STRING ) ) ) | ( () ( (lv_text_3_0= RULE_TEXT_BLOCK ) ) ) ) ;
    public final EObject ruleTextValue() throws RecognitionException {
        EObject current = null;

        Token lv_text_1_0=null;
        Token lv_text_3_0=null;


        	enterRule();

        try {
            // InternalLibrettoSpec.g:7121:2: ( ( ( () ( (lv_text_1_0= RULE_STRING ) ) ) | ( () ( (lv_text_3_0= RULE_TEXT_BLOCK ) ) ) ) )
            // InternalLibrettoSpec.g:7122:2: ( ( () ( (lv_text_1_0= RULE_STRING ) ) ) | ( () ( (lv_text_3_0= RULE_TEXT_BLOCK ) ) ) )
            {
            // InternalLibrettoSpec.g:7122:2: ( ( () ( (lv_text_1_0= RULE_STRING ) ) ) | ( () ( (lv_text_3_0= RULE_TEXT_BLOCK ) ) ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_STRING) ) {
                alt47=1;
            }
            else if ( (LA47_0==RULE_TEXT_BLOCK) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // InternalLibrettoSpec.g:7123:3: ( () ( (lv_text_1_0= RULE_STRING ) ) )
                    {
                    // InternalLibrettoSpec.g:7123:3: ( () ( (lv_text_1_0= RULE_STRING ) ) )
                    // InternalLibrettoSpec.g:7124:4: () ( (lv_text_1_0= RULE_STRING ) )
                    {
                    // InternalLibrettoSpec.g:7124:4: ()
                    // InternalLibrettoSpec.g:7125:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTextValueAccess().getTextValueAction_0_0(),
                    						current);
                    				

                    }

                    // InternalLibrettoSpec.g:7131:4: ( (lv_text_1_0= RULE_STRING ) )
                    // InternalLibrettoSpec.g:7132:5: (lv_text_1_0= RULE_STRING )
                    {
                    // InternalLibrettoSpec.g:7132:5: (lv_text_1_0= RULE_STRING )
                    // InternalLibrettoSpec.g:7133:6: lv_text_1_0= RULE_STRING
                    {
                    lv_text_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_text_1_0, grammarAccess.getTextValueAccess().getTextSTRINGTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTextValueRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"text",
                    							lv_text_1_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalLibrettoSpec.g:7151:3: ( () ( (lv_text_3_0= RULE_TEXT_BLOCK ) ) )
                    {
                    // InternalLibrettoSpec.g:7151:3: ( () ( (lv_text_3_0= RULE_TEXT_BLOCK ) ) )
                    // InternalLibrettoSpec.g:7152:4: () ( (lv_text_3_0= RULE_TEXT_BLOCK ) )
                    {
                    // InternalLibrettoSpec.g:7152:4: ()
                    // InternalLibrettoSpec.g:7153:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTextValueAccess().getTextValueAction_1_0(),
                    						current);
                    				

                    }

                    // InternalLibrettoSpec.g:7159:4: ( (lv_text_3_0= RULE_TEXT_BLOCK ) )
                    // InternalLibrettoSpec.g:7160:5: (lv_text_3_0= RULE_TEXT_BLOCK )
                    {
                    // InternalLibrettoSpec.g:7160:5: (lv_text_3_0= RULE_TEXT_BLOCK )
                    // InternalLibrettoSpec.g:7161:6: lv_text_3_0= RULE_TEXT_BLOCK
                    {
                    lv_text_3_0=(Token)match(input,RULE_TEXT_BLOCK,FOLLOW_2); 

                    						newLeafNode(lv_text_3_0, grammarAccess.getTextValueAccess().getTextTEXT_BLOCKTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTextValueRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"text",
                    							lv_text_3_0,
                    							"com.robenglander.libretto.spec.LibrettoSpec.TEXT_BLOCK");
                    					

                    }


                    }


                    }


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
    // $ANTLR end "ruleTextValue"


    // $ANTLR start "entryRuleIdentifierValue"
    // InternalLibrettoSpec.g:7182:1: entryRuleIdentifierValue returns [EObject current=null] : iv_ruleIdentifierValue= ruleIdentifierValue EOF ;
    public final EObject entryRuleIdentifierValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdentifierValue = null;


        try {
            // InternalLibrettoSpec.g:7182:56: (iv_ruleIdentifierValue= ruleIdentifierValue EOF )
            // InternalLibrettoSpec.g:7183:2: iv_ruleIdentifierValue= ruleIdentifierValue EOF
            {
             newCompositeNode(grammarAccess.getIdentifierValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIdentifierValue=ruleIdentifierValue();

            state._fsp--;

             current =iv_ruleIdentifierValue; 
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
    // $ANTLR end "entryRuleIdentifierValue"


    // $ANTLR start "ruleIdentifierValue"
    // InternalLibrettoSpec.g:7189:1: ruleIdentifierValue returns [EObject current=null] : (this_LIBRETTO_ID_0= RULE_LIBRETTO_ID | this_DottedIdentifier_1= ruleDottedIdentifier ) ;
    public final EObject ruleIdentifierValue() throws RecognitionException {
        EObject current = null;

        Token this_LIBRETTO_ID_0=null;
        EObject this_DottedIdentifier_1 = null;



        	enterRule();

        try {
            // InternalLibrettoSpec.g:7195:2: ( (this_LIBRETTO_ID_0= RULE_LIBRETTO_ID | this_DottedIdentifier_1= ruleDottedIdentifier ) )
            // InternalLibrettoSpec.g:7196:2: (this_LIBRETTO_ID_0= RULE_LIBRETTO_ID | this_DottedIdentifier_1= ruleDottedIdentifier )
            {
            // InternalLibrettoSpec.g:7196:2: (this_LIBRETTO_ID_0= RULE_LIBRETTO_ID | this_DottedIdentifier_1= ruleDottedIdentifier )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_LIBRETTO_ID) ) {
                int LA48_1 = input.LA(2);

                if ( (LA48_1==93) ) {
                    alt48=2;
                }
                else if ( (LA48_1==EOF||(LA48_1>=20 && LA48_1<=22)||LA48_1==32||LA48_1==41||(LA48_1>=45 && LA48_1<=48)||(LA48_1>=54 && LA48_1<=63)||(LA48_1>=79 && LA48_1<=86)||(LA48_1>=91 && LA48_1<=92)) ) {
                    alt48=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 48, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // InternalLibrettoSpec.g:7197:3: this_LIBRETTO_ID_0= RULE_LIBRETTO_ID
                    {
                    this_LIBRETTO_ID_0=(Token)match(input,RULE_LIBRETTO_ID,FOLLOW_2); 

                    			newLeafNode(this_LIBRETTO_ID_0, grammarAccess.getIdentifierValueAccess().getLIBRETTO_IDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalLibrettoSpec.g:7202:3: this_DottedIdentifier_1= ruleDottedIdentifier
                    {

                    			newCompositeNode(grammarAccess.getIdentifierValueAccess().getDottedIdentifierParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DottedIdentifier_1=ruleDottedIdentifier();

                    state._fsp--;


                    			current = this_DottedIdentifier_1;
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
    // $ANTLR end "ruleIdentifierValue"


    // $ANTLR start "entryRuleDottedIdentifier"
    // InternalLibrettoSpec.g:7214:1: entryRuleDottedIdentifier returns [EObject current=null] : iv_ruleDottedIdentifier= ruleDottedIdentifier EOF ;
    public final EObject entryRuleDottedIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDottedIdentifier = null;


        try {
            // InternalLibrettoSpec.g:7214:57: (iv_ruleDottedIdentifier= ruleDottedIdentifier EOF )
            // InternalLibrettoSpec.g:7215:2: iv_ruleDottedIdentifier= ruleDottedIdentifier EOF
            {
             newCompositeNode(grammarAccess.getDottedIdentifierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDottedIdentifier=ruleDottedIdentifier();

            state._fsp--;

             current =iv_ruleDottedIdentifier; 
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
    // $ANTLR end "entryRuleDottedIdentifier"


    // $ANTLR start "ruleDottedIdentifier"
    // InternalLibrettoSpec.g:7221:1: ruleDottedIdentifier returns [EObject current=null] : ( ( (lv_head_0_0= RULE_LIBRETTO_ID ) ) (otherlv_1= '.' ( (lv_tail_2_0= RULE_LIBRETTO_ID ) ) )+ ) ;
    public final EObject ruleDottedIdentifier() throws RecognitionException {
        EObject current = null;

        Token lv_head_0_0=null;
        Token otherlv_1=null;
        Token lv_tail_2_0=null;


        	enterRule();

        try {
            // InternalLibrettoSpec.g:7227:2: ( ( ( (lv_head_0_0= RULE_LIBRETTO_ID ) ) (otherlv_1= '.' ( (lv_tail_2_0= RULE_LIBRETTO_ID ) ) )+ ) )
            // InternalLibrettoSpec.g:7228:2: ( ( (lv_head_0_0= RULE_LIBRETTO_ID ) ) (otherlv_1= '.' ( (lv_tail_2_0= RULE_LIBRETTO_ID ) ) )+ )
            {
            // InternalLibrettoSpec.g:7228:2: ( ( (lv_head_0_0= RULE_LIBRETTO_ID ) ) (otherlv_1= '.' ( (lv_tail_2_0= RULE_LIBRETTO_ID ) ) )+ )
            // InternalLibrettoSpec.g:7229:3: ( (lv_head_0_0= RULE_LIBRETTO_ID ) ) (otherlv_1= '.' ( (lv_tail_2_0= RULE_LIBRETTO_ID ) ) )+
            {
            // InternalLibrettoSpec.g:7229:3: ( (lv_head_0_0= RULE_LIBRETTO_ID ) )
            // InternalLibrettoSpec.g:7230:4: (lv_head_0_0= RULE_LIBRETTO_ID )
            {
            // InternalLibrettoSpec.g:7230:4: (lv_head_0_0= RULE_LIBRETTO_ID )
            // InternalLibrettoSpec.g:7231:5: lv_head_0_0= RULE_LIBRETTO_ID
            {
            lv_head_0_0=(Token)match(input,RULE_LIBRETTO_ID,FOLLOW_45); 

            					newLeafNode(lv_head_0_0, grammarAccess.getDottedIdentifierAccess().getHeadLIBRETTO_IDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDottedIdentifierRule());
            					}
            					setWithLastConsumed(
            						current,
            						"head",
            						lv_head_0_0,
            						"com.robenglander.libretto.spec.LibrettoSpec.LIBRETTO_ID");
            				

            }


            }

            // InternalLibrettoSpec.g:7247:3: (otherlv_1= '.' ( (lv_tail_2_0= RULE_LIBRETTO_ID ) ) )+
            int cnt49=0;
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==93) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalLibrettoSpec.g:7248:4: otherlv_1= '.' ( (lv_tail_2_0= RULE_LIBRETTO_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,93,FOLLOW_3); 

            	    				newLeafNode(otherlv_1, grammarAccess.getDottedIdentifierAccess().getFullStopKeyword_1_0());
            	    			
            	    // InternalLibrettoSpec.g:7252:4: ( (lv_tail_2_0= RULE_LIBRETTO_ID ) )
            	    // InternalLibrettoSpec.g:7253:5: (lv_tail_2_0= RULE_LIBRETTO_ID )
            	    {
            	    // InternalLibrettoSpec.g:7253:5: (lv_tail_2_0= RULE_LIBRETTO_ID )
            	    // InternalLibrettoSpec.g:7254:6: lv_tail_2_0= RULE_LIBRETTO_ID
            	    {
            	    lv_tail_2_0=(Token)match(input,RULE_LIBRETTO_ID,FOLLOW_46); 

            	    						newLeafNode(lv_tail_2_0, grammarAccess.getDottedIdentifierAccess().getTailLIBRETTO_IDTerminalRuleCall_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getDottedIdentifierRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"tail",
            	    							lv_tail_2_0,
            	    							"com.robenglander.libretto.spec.LibrettoSpec.LIBRETTO_ID");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt49 >= 1 ) break loop49;
                        EarlyExitException eee =
                            new EarlyExitException(49, input);
                        throw eee;
                }
                cnt49++;
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
    // $ANTLR end "ruleDottedIdentifier"


    // $ANTLR start "ruleOutcomeClassValue"
    // InternalLibrettoSpec.g:7275:1: ruleOutcomeClassValue returns [Enumerator current=null] : ( (enumLiteral_0= 'returns' ) | (enumLiteral_1= 'rejects' ) ) ;
    public final Enumerator ruleOutcomeClassValue() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalLibrettoSpec.g:7281:2: ( ( (enumLiteral_0= 'returns' ) | (enumLiteral_1= 'rejects' ) ) )
            // InternalLibrettoSpec.g:7282:2: ( (enumLiteral_0= 'returns' ) | (enumLiteral_1= 'rejects' ) )
            {
            // InternalLibrettoSpec.g:7282:2: ( (enumLiteral_0= 'returns' ) | (enumLiteral_1= 'rejects' ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==94) ) {
                alt50=1;
            }
            else if ( (LA50_0==95) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // InternalLibrettoSpec.g:7283:3: (enumLiteral_0= 'returns' )
                    {
                    // InternalLibrettoSpec.g:7283:3: (enumLiteral_0= 'returns' )
                    // InternalLibrettoSpec.g:7284:4: enumLiteral_0= 'returns'
                    {
                    enumLiteral_0=(Token)match(input,94,FOLLOW_2); 

                    				current = grammarAccess.getOutcomeClassValueAccess().getRETURNSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOutcomeClassValueAccess().getRETURNSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLibrettoSpec.g:7291:3: (enumLiteral_1= 'rejects' )
                    {
                    // InternalLibrettoSpec.g:7291:3: (enumLiteral_1= 'rejects' )
                    // InternalLibrettoSpec.g:7292:4: enumLiteral_1= 'rejects'
                    {
                    enumLiteral_1=(Token)match(input,95,FOLLOW_2); 

                    				current = grammarAccess.getOutcomeClassValueAccess().getREJECTSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOutcomeClassValueAccess().getREJECTSEnumLiteralDeclaration_1());
                    			

                    }


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
    // $ANTLR end "ruleOutcomeClassValue"


    // $ANTLR start "ruleMetadataStatusValue"
    // InternalLibrettoSpec.g:7302:1: ruleMetadataStatusValue returns [Enumerator current=null] : ( (enumLiteral_0= 'draft' ) | (enumLiteral_1= 'public' ) ) ;
    public final Enumerator ruleMetadataStatusValue() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalLibrettoSpec.g:7308:2: ( ( (enumLiteral_0= 'draft' ) | (enumLiteral_1= 'public' ) ) )
            // InternalLibrettoSpec.g:7309:2: ( (enumLiteral_0= 'draft' ) | (enumLiteral_1= 'public' ) )
            {
            // InternalLibrettoSpec.g:7309:2: ( (enumLiteral_0= 'draft' ) | (enumLiteral_1= 'public' ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==96) ) {
                alt51=1;
            }
            else if ( (LA51_0==97) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // InternalLibrettoSpec.g:7310:3: (enumLiteral_0= 'draft' )
                    {
                    // InternalLibrettoSpec.g:7310:3: (enumLiteral_0= 'draft' )
                    // InternalLibrettoSpec.g:7311:4: enumLiteral_0= 'draft'
                    {
                    enumLiteral_0=(Token)match(input,96,FOLLOW_2); 

                    				current = grammarAccess.getMetadataStatusValueAccess().getDRAFTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMetadataStatusValueAccess().getDRAFTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLibrettoSpec.g:7318:3: (enumLiteral_1= 'public' )
                    {
                    // InternalLibrettoSpec.g:7318:3: (enumLiteral_1= 'public' )
                    // InternalLibrettoSpec.g:7319:4: enumLiteral_1= 'public'
                    {
                    enumLiteral_1=(Token)match(input,97,FOLLOW_2); 

                    				current = grammarAccess.getMetadataStatusValueAccess().getPUBLICEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMetadataStatusValueAccess().getPUBLICEnumLiteralDeclaration_1());
                    			

                    }


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
    // $ANTLR end "ruleMetadataStatusValue"


    // $ANTLR start "ruleStrengthValue"
    // InternalLibrettoSpec.g:7329:1: ruleStrengthValue returns [Enumerator current=null] : ( (enumLiteral_0= 'required' ) | (enumLiteral_1= 'strongly_preferred' ) | (enumLiteral_2= 'preferred' ) | (enumLiteral_3= 'advisory' ) ) ;
    public final Enumerator ruleStrengthValue() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalLibrettoSpec.g:7335:2: ( ( (enumLiteral_0= 'required' ) | (enumLiteral_1= 'strongly_preferred' ) | (enumLiteral_2= 'preferred' ) | (enumLiteral_3= 'advisory' ) ) )
            // InternalLibrettoSpec.g:7336:2: ( (enumLiteral_0= 'required' ) | (enumLiteral_1= 'strongly_preferred' ) | (enumLiteral_2= 'preferred' ) | (enumLiteral_3= 'advisory' ) )
            {
            // InternalLibrettoSpec.g:7336:2: ( (enumLiteral_0= 'required' ) | (enumLiteral_1= 'strongly_preferred' ) | (enumLiteral_2= 'preferred' ) | (enumLiteral_3= 'advisory' ) )
            int alt52=4;
            switch ( input.LA(1) ) {
            case 98:
                {
                alt52=1;
                }
                break;
            case 99:
                {
                alt52=2;
                }
                break;
            case 100:
                {
                alt52=3;
                }
                break;
            case 101:
                {
                alt52=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // InternalLibrettoSpec.g:7337:3: (enumLiteral_0= 'required' )
                    {
                    // InternalLibrettoSpec.g:7337:3: (enumLiteral_0= 'required' )
                    // InternalLibrettoSpec.g:7338:4: enumLiteral_0= 'required'
                    {
                    enumLiteral_0=(Token)match(input,98,FOLLOW_2); 

                    				current = grammarAccess.getStrengthValueAccess().getREQUIREDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getStrengthValueAccess().getREQUIREDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLibrettoSpec.g:7345:3: (enumLiteral_1= 'strongly_preferred' )
                    {
                    // InternalLibrettoSpec.g:7345:3: (enumLiteral_1= 'strongly_preferred' )
                    // InternalLibrettoSpec.g:7346:4: enumLiteral_1= 'strongly_preferred'
                    {
                    enumLiteral_1=(Token)match(input,99,FOLLOW_2); 

                    				current = grammarAccess.getStrengthValueAccess().getSTRONGLY_PREFERREDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getStrengthValueAccess().getSTRONGLY_PREFERREDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalLibrettoSpec.g:7353:3: (enumLiteral_2= 'preferred' )
                    {
                    // InternalLibrettoSpec.g:7353:3: (enumLiteral_2= 'preferred' )
                    // InternalLibrettoSpec.g:7354:4: enumLiteral_2= 'preferred'
                    {
                    enumLiteral_2=(Token)match(input,100,FOLLOW_2); 

                    				current = grammarAccess.getStrengthValueAccess().getPREFERREDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getStrengthValueAccess().getPREFERREDEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalLibrettoSpec.g:7361:3: (enumLiteral_3= 'advisory' )
                    {
                    // InternalLibrettoSpec.g:7361:3: (enumLiteral_3= 'advisory' )
                    // InternalLibrettoSpec.g:7362:4: enumLiteral_3= 'advisory'
                    {
                    enumLiteral_3=(Token)match(input,101,FOLLOW_2); 

                    				current = grammarAccess.getStrengthValueAccess().getADVISORYEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getStrengthValueAccess().getADVISORYEnumLiteralDeclaration_3());
                    			

                    }


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
    // $ANTLR end "ruleStrengthValue"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000200FFF00000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000001FD00100000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000040000100000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000100000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0006000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0008000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000001L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000008L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0020000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000200L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L,0x0000000000004000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000000L,0x0000000300000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x4000080000100000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x8001E00100300000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000100000L,0x0000000002800000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000100000L,0x0000000003800000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0010000000100000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0xFFC1EA0100700000L,0x0000000000400000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000006L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0x00000000C0000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000100000L,0x00000000000001E0L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0xC001E80100700000L,0x0000000000403C00L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x8001E00100700000L,0x00000000007F8000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000003C00000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000100000L,0x0000000001800000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000010L,0x0000000010000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000018000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000020L,0x0000000010000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000100L,0x0000000010000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000C00L,0x0000000010000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});

}