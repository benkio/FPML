package it.unibo.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import it.unibo.services.FPMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFPMLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Pure'", "'{'", "'}'", "'Functions'", "'Data'", "'Value'", "'Effects'", "':'", "'['", "']'", "'+'", "'*'", "'def'", "'('", "','", "')'", "'IO'", "'main'", "'Undefined'", "'|>'", "'>>='", "'int'", "'String'", "'Unit'", "'ref'", "'refIO'", "'F'", "'<'", "'>'", "'FIO'", "'()'", "'Left'", "'Right'", "'IntToString'", "'IntPow'", "'-'", "'mod'", "'applyF'", "'print'", "'randomInt'", "'applyFIO'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
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


        public InternalFPMLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFPMLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFPMLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalFPML.g"; }



     	private FPMLGrammarAccess grammarAccess;

        public InternalFPMLParser(TokenStream input, FPMLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected FPMLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalFPML.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalFPML.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalFPML.g:65:2: iv_ruleModel= ruleModel EOF
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
    // InternalFPML.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_elements_0_0= rulePureBlock ) ) ( (lv_elements_1_0= ruleEffectFullBlock ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;

        EObject lv_elements_1_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:77:2: ( ( ( (lv_elements_0_0= rulePureBlock ) ) ( (lv_elements_1_0= ruleEffectFullBlock ) ) ) )
            // InternalFPML.g:78:2: ( ( (lv_elements_0_0= rulePureBlock ) ) ( (lv_elements_1_0= ruleEffectFullBlock ) ) )
            {
            // InternalFPML.g:78:2: ( ( (lv_elements_0_0= rulePureBlock ) ) ( (lv_elements_1_0= ruleEffectFullBlock ) ) )
            // InternalFPML.g:79:3: ( (lv_elements_0_0= rulePureBlock ) ) ( (lv_elements_1_0= ruleEffectFullBlock ) )
            {
            // InternalFPML.g:79:3: ( (lv_elements_0_0= rulePureBlock ) )
            // InternalFPML.g:80:4: (lv_elements_0_0= rulePureBlock )
            {
            // InternalFPML.g:80:4: (lv_elements_0_0= rulePureBlock )
            // InternalFPML.g:81:5: lv_elements_0_0= rulePureBlock
            {

            					newCompositeNode(grammarAccess.getModelAccess().getElementsPureBlockParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_elements_0_0=rulePureBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_0_0,
            						"it.unibo.FPML.PureBlock");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFPML.g:98:3: ( (lv_elements_1_0= ruleEffectFullBlock ) )
            // InternalFPML.g:99:4: (lv_elements_1_0= ruleEffectFullBlock )
            {
            // InternalFPML.g:99:4: (lv_elements_1_0= ruleEffectFullBlock )
            // InternalFPML.g:100:5: lv_elements_1_0= ruleEffectFullBlock
            {

            					newCompositeNode(grammarAccess.getModelAccess().getElementsEffectFullBlockParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_elements_1_0=ruleEffectFullBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_1_0,
            						"it.unibo.FPML.EffectFullBlock");
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulePureBlock"
    // InternalFPML.g:121:1: entryRulePureBlock returns [EObject current=null] : iv_rulePureBlock= rulePureBlock EOF ;
    public final EObject entryRulePureBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePureBlock = null;


        try {
            // InternalFPML.g:121:50: (iv_rulePureBlock= rulePureBlock EOF )
            // InternalFPML.g:122:2: iv_rulePureBlock= rulePureBlock EOF
            {
             newCompositeNode(grammarAccess.getPureBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePureBlock=rulePureBlock();

            state._fsp--;

             current =iv_rulePureBlock; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePureBlock"


    // $ANTLR start "rulePureBlock"
    // InternalFPML.g:128:1: rulePureBlock returns [EObject current=null] : (otherlv_0= 'Pure' otherlv_1= '{' ( (lv_elements_2_0= rulePureDataBlock ) ) ( (lv_elements_3_0= rulePureFunctionBlock ) ) otherlv_4= '}' ) ;
    public final EObject rulePureBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:134:2: ( (otherlv_0= 'Pure' otherlv_1= '{' ( (lv_elements_2_0= rulePureDataBlock ) ) ( (lv_elements_3_0= rulePureFunctionBlock ) ) otherlv_4= '}' ) )
            // InternalFPML.g:135:2: (otherlv_0= 'Pure' otherlv_1= '{' ( (lv_elements_2_0= rulePureDataBlock ) ) ( (lv_elements_3_0= rulePureFunctionBlock ) ) otherlv_4= '}' )
            {
            // InternalFPML.g:135:2: (otherlv_0= 'Pure' otherlv_1= '{' ( (lv_elements_2_0= rulePureDataBlock ) ) ( (lv_elements_3_0= rulePureFunctionBlock ) ) otherlv_4= '}' )
            // InternalFPML.g:136:3: otherlv_0= 'Pure' otherlv_1= '{' ( (lv_elements_2_0= rulePureDataBlock ) ) ( (lv_elements_3_0= rulePureFunctionBlock ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPureBlockAccess().getPureKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getPureBlockAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalFPML.g:144:3: ( (lv_elements_2_0= rulePureDataBlock ) )
            // InternalFPML.g:145:4: (lv_elements_2_0= rulePureDataBlock )
            {
            // InternalFPML.g:145:4: (lv_elements_2_0= rulePureDataBlock )
            // InternalFPML.g:146:5: lv_elements_2_0= rulePureDataBlock
            {

            					newCompositeNode(grammarAccess.getPureBlockAccess().getElementsPureDataBlockParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_elements_2_0=rulePureDataBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPureBlockRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_2_0,
            						"it.unibo.FPML.PureDataBlock");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFPML.g:163:3: ( (lv_elements_3_0= rulePureFunctionBlock ) )
            // InternalFPML.g:164:4: (lv_elements_3_0= rulePureFunctionBlock )
            {
            // InternalFPML.g:164:4: (lv_elements_3_0= rulePureFunctionBlock )
            // InternalFPML.g:165:5: lv_elements_3_0= rulePureFunctionBlock
            {

            					newCompositeNode(grammarAccess.getPureBlockAccess().getElementsPureFunctionBlockParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_elements_3_0=rulePureFunctionBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPureBlockRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_3_0,
            						"it.unibo.FPML.PureFunctionBlock");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getPureBlockAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePureBlock"


    // $ANTLR start "entryRulePureFunctionBlock"
    // InternalFPML.g:190:1: entryRulePureFunctionBlock returns [EObject current=null] : iv_rulePureFunctionBlock= rulePureFunctionBlock EOF ;
    public final EObject entryRulePureFunctionBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePureFunctionBlock = null;


        try {
            // InternalFPML.g:190:58: (iv_rulePureFunctionBlock= rulePureFunctionBlock EOF )
            // InternalFPML.g:191:2: iv_rulePureFunctionBlock= rulePureFunctionBlock EOF
            {
             newCompositeNode(grammarAccess.getPureFunctionBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePureFunctionBlock=rulePureFunctionBlock();

            state._fsp--;

             current =iv_rulePureFunctionBlock; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePureFunctionBlock"


    // $ANTLR start "rulePureFunctionBlock"
    // InternalFPML.g:197:1: rulePureFunctionBlock returns [EObject current=null] : (otherlv_0= 'Functions' otherlv_1= '{' ( (lv_features_2_0= rulePureFunctionDefinition ) )* otherlv_3= '}' ) ;
    public final EObject rulePureFunctionBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_features_2_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:203:2: ( (otherlv_0= 'Functions' otherlv_1= '{' ( (lv_features_2_0= rulePureFunctionDefinition ) )* otherlv_3= '}' ) )
            // InternalFPML.g:204:2: (otherlv_0= 'Functions' otherlv_1= '{' ( (lv_features_2_0= rulePureFunctionDefinition ) )* otherlv_3= '}' )
            {
            // InternalFPML.g:204:2: (otherlv_0= 'Functions' otherlv_1= '{' ( (lv_features_2_0= rulePureFunctionDefinition ) )* otherlv_3= '}' )
            // InternalFPML.g:205:3: otherlv_0= 'Functions' otherlv_1= '{' ( (lv_features_2_0= rulePureFunctionDefinition ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPureFunctionBlockAccess().getFunctionsKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getPureFunctionBlockAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalFPML.g:213:3: ( (lv_features_2_0= rulePureFunctionDefinition ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==23) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalFPML.g:214:4: (lv_features_2_0= rulePureFunctionDefinition )
            	    {
            	    // InternalFPML.g:214:4: (lv_features_2_0= rulePureFunctionDefinition )
            	    // InternalFPML.g:215:5: lv_features_2_0= rulePureFunctionDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getPureFunctionBlockAccess().getFeaturesPureFunctionDefinitionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_features_2_0=rulePureFunctionDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPureFunctionBlockRule());
            	    					}
            	    					add(
            	    						current,
            	    						"features",
            	    						lv_features_2_0,
            	    						"it.unibo.FPML.PureFunctionDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getPureFunctionBlockAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePureFunctionBlock"


    // $ANTLR start "entryRulePureDataBlock"
    // InternalFPML.g:240:1: entryRulePureDataBlock returns [EObject current=null] : iv_rulePureDataBlock= rulePureDataBlock EOF ;
    public final EObject entryRulePureDataBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePureDataBlock = null;


        try {
            // InternalFPML.g:240:54: (iv_rulePureDataBlock= rulePureDataBlock EOF )
            // InternalFPML.g:241:2: iv_rulePureDataBlock= rulePureDataBlock EOF
            {
             newCompositeNode(grammarAccess.getPureDataBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePureDataBlock=rulePureDataBlock();

            state._fsp--;

             current =iv_rulePureDataBlock; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePureDataBlock"


    // $ANTLR start "rulePureDataBlock"
    // InternalFPML.g:247:1: rulePureDataBlock returns [EObject current=null] : (otherlv_0= 'Data' otherlv_1= '{' ( (lv_elements_2_0= rulePureData ) )* ( (lv_value_3_0= rulePureValueBlock ) ) otherlv_4= '}' ) ;
    public final EObject rulePureDataBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_elements_2_0 = null;

        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:253:2: ( (otherlv_0= 'Data' otherlv_1= '{' ( (lv_elements_2_0= rulePureData ) )* ( (lv_value_3_0= rulePureValueBlock ) ) otherlv_4= '}' ) )
            // InternalFPML.g:254:2: (otherlv_0= 'Data' otherlv_1= '{' ( (lv_elements_2_0= rulePureData ) )* ( (lv_value_3_0= rulePureValueBlock ) ) otherlv_4= '}' )
            {
            // InternalFPML.g:254:2: (otherlv_0= 'Data' otherlv_1= '{' ( (lv_elements_2_0= rulePureData ) )* ( (lv_value_3_0= rulePureValueBlock ) ) otherlv_4= '}' )
            // InternalFPML.g:255:3: otherlv_0= 'Data' otherlv_1= '{' ( (lv_elements_2_0= rulePureData ) )* ( (lv_value_3_0= rulePureValueBlock ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPureDataBlockAccess().getDataKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getPureDataBlockAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalFPML.g:263:3: ( (lv_elements_2_0= rulePureData ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalFPML.g:264:4: (lv_elements_2_0= rulePureData )
            	    {
            	    // InternalFPML.g:264:4: (lv_elements_2_0= rulePureData )
            	    // InternalFPML.g:265:5: lv_elements_2_0= rulePureData
            	    {

            	    					newCompositeNode(grammarAccess.getPureDataBlockAccess().getElementsPureDataParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_elements_2_0=rulePureData();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPureDataBlockRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_2_0,
            	    						"it.unibo.FPML.PureData");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalFPML.g:282:3: ( (lv_value_3_0= rulePureValueBlock ) )
            // InternalFPML.g:283:4: (lv_value_3_0= rulePureValueBlock )
            {
            // InternalFPML.g:283:4: (lv_value_3_0= rulePureValueBlock )
            // InternalFPML.g:284:5: lv_value_3_0= rulePureValueBlock
            {

            					newCompositeNode(grammarAccess.getPureDataBlockAccess().getValuePureValueBlockParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_value_3_0=rulePureValueBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPureDataBlockRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"it.unibo.FPML.PureValueBlock");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getPureDataBlockAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePureDataBlock"


    // $ANTLR start "entryRulePureValueBlock"
    // InternalFPML.g:309:1: entryRulePureValueBlock returns [EObject current=null] : iv_rulePureValueBlock= rulePureValueBlock EOF ;
    public final EObject entryRulePureValueBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePureValueBlock = null;


        try {
            // InternalFPML.g:309:55: (iv_rulePureValueBlock= rulePureValueBlock EOF )
            // InternalFPML.g:310:2: iv_rulePureValueBlock= rulePureValueBlock EOF
            {
             newCompositeNode(grammarAccess.getPureValueBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePureValueBlock=rulePureValueBlock();

            state._fsp--;

             current =iv_rulePureValueBlock; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePureValueBlock"


    // $ANTLR start "rulePureValueBlock"
    // InternalFPML.g:316:1: rulePureValueBlock returns [EObject current=null] : (otherlv_0= 'Value' otherlv_1= '{' ( (lv_elements_2_0= rulePureValue ) )* otherlv_3= '}' ) ;
    public final EObject rulePureValueBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:322:2: ( (otherlv_0= 'Value' otherlv_1= '{' ( (lv_elements_2_0= rulePureValue ) )* otherlv_3= '}' ) )
            // InternalFPML.g:323:2: (otherlv_0= 'Value' otherlv_1= '{' ( (lv_elements_2_0= rulePureValue ) )* otherlv_3= '}' )
            {
            // InternalFPML.g:323:2: (otherlv_0= 'Value' otherlv_1= '{' ( (lv_elements_2_0= rulePureValue ) )* otherlv_3= '}' )
            // InternalFPML.g:324:3: otherlv_0= 'Value' otherlv_1= '{' ( (lv_elements_2_0= rulePureValue ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPureValueBlockAccess().getValueKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getPureValueBlockAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalFPML.g:332:3: ( (lv_elements_2_0= rulePureValue ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalFPML.g:333:4: (lv_elements_2_0= rulePureValue )
            	    {
            	    // InternalFPML.g:333:4: (lv_elements_2_0= rulePureValue )
            	    // InternalFPML.g:334:5: lv_elements_2_0= rulePureValue
            	    {

            	    					newCompositeNode(grammarAccess.getPureValueBlockAccess().getElementsPureValueParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_elements_2_0=rulePureValue();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPureValueBlockRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_2_0,
            	    						"it.unibo.FPML.PureValue");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getPureValueBlockAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePureValueBlock"


    // $ANTLR start "entryRuleEffectFullBlock"
    // InternalFPML.g:359:1: entryRuleEffectFullBlock returns [EObject current=null] : iv_ruleEffectFullBlock= ruleEffectFullBlock EOF ;
    public final EObject entryRuleEffectFullBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullBlock = null;


        try {
            // InternalFPML.g:359:56: (iv_ruleEffectFullBlock= ruleEffectFullBlock EOF )
            // InternalFPML.g:360:2: iv_ruleEffectFullBlock= ruleEffectFullBlock EOF
            {
             newCompositeNode(grammarAccess.getEffectFullBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEffectFullBlock=ruleEffectFullBlock();

            state._fsp--;

             current =iv_ruleEffectFullBlock; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEffectFullBlock"


    // $ANTLR start "ruleEffectFullBlock"
    // InternalFPML.g:366:1: ruleEffectFullBlock returns [EObject current=null] : (otherlv_0= 'Effects' otherlv_1= '{' ( (lv_elements_2_0= ruleEffectFullDataBlock ) ) ( (lv_elements_3_0= ruleEffectFullFunctionBlock ) ) otherlv_4= '}' ) ;
    public final EObject ruleEffectFullBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:372:2: ( (otherlv_0= 'Effects' otherlv_1= '{' ( (lv_elements_2_0= ruleEffectFullDataBlock ) ) ( (lv_elements_3_0= ruleEffectFullFunctionBlock ) ) otherlv_4= '}' ) )
            // InternalFPML.g:373:2: (otherlv_0= 'Effects' otherlv_1= '{' ( (lv_elements_2_0= ruleEffectFullDataBlock ) ) ( (lv_elements_3_0= ruleEffectFullFunctionBlock ) ) otherlv_4= '}' )
            {
            // InternalFPML.g:373:2: (otherlv_0= 'Effects' otherlv_1= '{' ( (lv_elements_2_0= ruleEffectFullDataBlock ) ) ( (lv_elements_3_0= ruleEffectFullFunctionBlock ) ) otherlv_4= '}' )
            // InternalFPML.g:374:3: otherlv_0= 'Effects' otherlv_1= '{' ( (lv_elements_2_0= ruleEffectFullDataBlock ) ) ( (lv_elements_3_0= ruleEffectFullFunctionBlock ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEffectFullBlockAccess().getEffectsKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getEffectFullBlockAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalFPML.g:382:3: ( (lv_elements_2_0= ruleEffectFullDataBlock ) )
            // InternalFPML.g:383:4: (lv_elements_2_0= ruleEffectFullDataBlock )
            {
            // InternalFPML.g:383:4: (lv_elements_2_0= ruleEffectFullDataBlock )
            // InternalFPML.g:384:5: lv_elements_2_0= ruleEffectFullDataBlock
            {

            					newCompositeNode(grammarAccess.getEffectFullBlockAccess().getElementsEffectFullDataBlockParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_elements_2_0=ruleEffectFullDataBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEffectFullBlockRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_2_0,
            						"it.unibo.FPML.EffectFullDataBlock");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFPML.g:401:3: ( (lv_elements_3_0= ruleEffectFullFunctionBlock ) )
            // InternalFPML.g:402:4: (lv_elements_3_0= ruleEffectFullFunctionBlock )
            {
            // InternalFPML.g:402:4: (lv_elements_3_0= ruleEffectFullFunctionBlock )
            // InternalFPML.g:403:5: lv_elements_3_0= ruleEffectFullFunctionBlock
            {

            					newCompositeNode(grammarAccess.getEffectFullBlockAccess().getElementsEffectFullFunctionBlockParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_elements_3_0=ruleEffectFullFunctionBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEffectFullBlockRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_3_0,
            						"it.unibo.FPML.EffectFullFunctionBlock");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEffectFullBlockAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEffectFullBlock"


    // $ANTLR start "entryRuleEffectFullDataBlock"
    // InternalFPML.g:428:1: entryRuleEffectFullDataBlock returns [EObject current=null] : iv_ruleEffectFullDataBlock= ruleEffectFullDataBlock EOF ;
    public final EObject entryRuleEffectFullDataBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullDataBlock = null;


        try {
            // InternalFPML.g:428:60: (iv_ruleEffectFullDataBlock= ruleEffectFullDataBlock EOF )
            // InternalFPML.g:429:2: iv_ruleEffectFullDataBlock= ruleEffectFullDataBlock EOF
            {
             newCompositeNode(grammarAccess.getEffectFullDataBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEffectFullDataBlock=ruleEffectFullDataBlock();

            state._fsp--;

             current =iv_ruleEffectFullDataBlock; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEffectFullDataBlock"


    // $ANTLR start "ruleEffectFullDataBlock"
    // InternalFPML.g:435:1: ruleEffectFullDataBlock returns [EObject current=null] : (otherlv_0= 'Data' otherlv_1= '{' ( (lv_elements_2_0= ruleEffectFullData ) )* ( (lv_value_3_0= ruleEffectFullValueBlock ) ) otherlv_4= '}' ) ;
    public final EObject ruleEffectFullDataBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_elements_2_0 = null;

        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:441:2: ( (otherlv_0= 'Data' otherlv_1= '{' ( (lv_elements_2_0= ruleEffectFullData ) )* ( (lv_value_3_0= ruleEffectFullValueBlock ) ) otherlv_4= '}' ) )
            // InternalFPML.g:442:2: (otherlv_0= 'Data' otherlv_1= '{' ( (lv_elements_2_0= ruleEffectFullData ) )* ( (lv_value_3_0= ruleEffectFullValueBlock ) ) otherlv_4= '}' )
            {
            // InternalFPML.g:442:2: (otherlv_0= 'Data' otherlv_1= '{' ( (lv_elements_2_0= ruleEffectFullData ) )* ( (lv_value_3_0= ruleEffectFullValueBlock ) ) otherlv_4= '}' )
            // InternalFPML.g:443:3: otherlv_0= 'Data' otherlv_1= '{' ( (lv_elements_2_0= ruleEffectFullData ) )* ( (lv_value_3_0= ruleEffectFullValueBlock ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEffectFullDataBlockAccess().getDataKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getEffectFullDataBlockAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalFPML.g:451:3: ( (lv_elements_2_0= ruleEffectFullData ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalFPML.g:452:4: (lv_elements_2_0= ruleEffectFullData )
            	    {
            	    // InternalFPML.g:452:4: (lv_elements_2_0= ruleEffectFullData )
            	    // InternalFPML.g:453:5: lv_elements_2_0= ruleEffectFullData
            	    {

            	    					newCompositeNode(grammarAccess.getEffectFullDataBlockAccess().getElementsEffectFullDataParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_elements_2_0=ruleEffectFullData();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEffectFullDataBlockRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_2_0,
            	    						"it.unibo.FPML.EffectFullData");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalFPML.g:470:3: ( (lv_value_3_0= ruleEffectFullValueBlock ) )
            // InternalFPML.g:471:4: (lv_value_3_0= ruleEffectFullValueBlock )
            {
            // InternalFPML.g:471:4: (lv_value_3_0= ruleEffectFullValueBlock )
            // InternalFPML.g:472:5: lv_value_3_0= ruleEffectFullValueBlock
            {

            					newCompositeNode(grammarAccess.getEffectFullDataBlockAccess().getValueEffectFullValueBlockParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_value_3_0=ruleEffectFullValueBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEffectFullDataBlockRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"it.unibo.FPML.EffectFullValueBlock");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEffectFullDataBlockAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEffectFullDataBlock"


    // $ANTLR start "entryRuleEffectFullValueBlock"
    // InternalFPML.g:497:1: entryRuleEffectFullValueBlock returns [EObject current=null] : iv_ruleEffectFullValueBlock= ruleEffectFullValueBlock EOF ;
    public final EObject entryRuleEffectFullValueBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullValueBlock = null;


        try {
            // InternalFPML.g:497:61: (iv_ruleEffectFullValueBlock= ruleEffectFullValueBlock EOF )
            // InternalFPML.g:498:2: iv_ruleEffectFullValueBlock= ruleEffectFullValueBlock EOF
            {
             newCompositeNode(grammarAccess.getEffectFullValueBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEffectFullValueBlock=ruleEffectFullValueBlock();

            state._fsp--;

             current =iv_ruleEffectFullValueBlock; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEffectFullValueBlock"


    // $ANTLR start "ruleEffectFullValueBlock"
    // InternalFPML.g:504:1: ruleEffectFullValueBlock returns [EObject current=null] : (otherlv_0= 'Value' otherlv_1= '{' ( (lv_elements_2_0= ruleEffectFullValue ) )* otherlv_3= '}' ) ;
    public final EObject ruleEffectFullValueBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:510:2: ( (otherlv_0= 'Value' otherlv_1= '{' ( (lv_elements_2_0= ruleEffectFullValue ) )* otherlv_3= '}' ) )
            // InternalFPML.g:511:2: (otherlv_0= 'Value' otherlv_1= '{' ( (lv_elements_2_0= ruleEffectFullValue ) )* otherlv_3= '}' )
            {
            // InternalFPML.g:511:2: (otherlv_0= 'Value' otherlv_1= '{' ( (lv_elements_2_0= ruleEffectFullValue ) )* otherlv_3= '}' )
            // InternalFPML.g:512:3: otherlv_0= 'Value' otherlv_1= '{' ( (lv_elements_2_0= ruleEffectFullValue ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEffectFullValueBlockAccess().getValueKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getEffectFullValueBlockAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalFPML.g:520:3: ( (lv_elements_2_0= ruleEffectFullValue ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalFPML.g:521:4: (lv_elements_2_0= ruleEffectFullValue )
            	    {
            	    // InternalFPML.g:521:4: (lv_elements_2_0= ruleEffectFullValue )
            	    // InternalFPML.g:522:5: lv_elements_2_0= ruleEffectFullValue
            	    {

            	    					newCompositeNode(grammarAccess.getEffectFullValueBlockAccess().getElementsEffectFullValueParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_elements_2_0=ruleEffectFullValue();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEffectFullValueBlockRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_2_0,
            	    						"it.unibo.FPML.EffectFullValue");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getEffectFullValueBlockAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEffectFullValueBlock"


    // $ANTLR start "entryRuleEffectFullFunctionBlock"
    // InternalFPML.g:547:1: entryRuleEffectFullFunctionBlock returns [EObject current=null] : iv_ruleEffectFullFunctionBlock= ruleEffectFullFunctionBlock EOF ;
    public final EObject entryRuleEffectFullFunctionBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullFunctionBlock = null;


        try {
            // InternalFPML.g:547:64: (iv_ruleEffectFullFunctionBlock= ruleEffectFullFunctionBlock EOF )
            // InternalFPML.g:548:2: iv_ruleEffectFullFunctionBlock= ruleEffectFullFunctionBlock EOF
            {
             newCompositeNode(grammarAccess.getEffectFullFunctionBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEffectFullFunctionBlock=ruleEffectFullFunctionBlock();

            state._fsp--;

             current =iv_ruleEffectFullFunctionBlock; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEffectFullFunctionBlock"


    // $ANTLR start "ruleEffectFullFunctionBlock"
    // InternalFPML.g:554:1: ruleEffectFullFunctionBlock returns [EObject current=null] : (otherlv_0= 'Functions' otherlv_1= '{' ( (lv_features_2_0= ruleEffectFullFunctionDefinition ) )* ( (lv_main_3_0= ruleMainFunc ) ) otherlv_4= '}' ) ;
    public final EObject ruleEffectFullFunctionBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_features_2_0 = null;

        EObject lv_main_3_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:560:2: ( (otherlv_0= 'Functions' otherlv_1= '{' ( (lv_features_2_0= ruleEffectFullFunctionDefinition ) )* ( (lv_main_3_0= ruleMainFunc ) ) otherlv_4= '}' ) )
            // InternalFPML.g:561:2: (otherlv_0= 'Functions' otherlv_1= '{' ( (lv_features_2_0= ruleEffectFullFunctionDefinition ) )* ( (lv_main_3_0= ruleMainFunc ) ) otherlv_4= '}' )
            {
            // InternalFPML.g:561:2: (otherlv_0= 'Functions' otherlv_1= '{' ( (lv_features_2_0= ruleEffectFullFunctionDefinition ) )* ( (lv_main_3_0= ruleMainFunc ) ) otherlv_4= '}' )
            // InternalFPML.g:562:3: otherlv_0= 'Functions' otherlv_1= '{' ( (lv_features_2_0= ruleEffectFullFunctionDefinition ) )* ( (lv_main_3_0= ruleMainFunc ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEffectFullFunctionBlockAccess().getFunctionsKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getEffectFullFunctionBlockAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalFPML.g:570:3: ( (lv_features_2_0= ruleEffectFullFunctionDefinition ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==23) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalFPML.g:571:4: (lv_features_2_0= ruleEffectFullFunctionDefinition )
            	    {
            	    // InternalFPML.g:571:4: (lv_features_2_0= ruleEffectFullFunctionDefinition )
            	    // InternalFPML.g:572:5: lv_features_2_0= ruleEffectFullFunctionDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getEffectFullFunctionBlockAccess().getFeaturesEffectFullFunctionDefinitionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_features_2_0=ruleEffectFullFunctionDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEffectFullFunctionBlockRule());
            	    					}
            	    					add(
            	    						current,
            	    						"features",
            	    						lv_features_2_0,
            	    						"it.unibo.FPML.EffectFullFunctionDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalFPML.g:589:3: ( (lv_main_3_0= ruleMainFunc ) )
            // InternalFPML.g:590:4: (lv_main_3_0= ruleMainFunc )
            {
            // InternalFPML.g:590:4: (lv_main_3_0= ruleMainFunc )
            // InternalFPML.g:591:5: lv_main_3_0= ruleMainFunc
            {

            					newCompositeNode(grammarAccess.getEffectFullFunctionBlockAccess().getMainMainFuncParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_main_3_0=ruleMainFunc();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEffectFullFunctionBlockRule());
            					}
            					set(
            						current,
            						"main",
            						lv_main_3_0,
            						"it.unibo.FPML.MainFunc");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEffectFullFunctionBlockAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEffectFullFunctionBlock"


    // $ANTLR start "entryRulePureData"
    // InternalFPML.g:616:1: entryRulePureData returns [EObject current=null] : iv_rulePureData= rulePureData EOF ;
    public final EObject entryRulePureData() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePureData = null;


        try {
            // InternalFPML.g:616:49: (iv_rulePureData= rulePureData EOF )
            // InternalFPML.g:617:2: iv_rulePureData= rulePureData EOF
            {
             newCompositeNode(grammarAccess.getPureDataRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePureData=rulePureData();

            state._fsp--;

             current =iv_rulePureData; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePureData"


    // $ANTLR start "rulePureData"
    // InternalFPML.g:623:1: rulePureData returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_content_2_0= rulePureAdtType ) ) ) ;
    public final EObject rulePureData() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_content_2_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:629:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_content_2_0= rulePureAdtType ) ) ) )
            // InternalFPML.g:630:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_content_2_0= rulePureAdtType ) ) )
            {
            // InternalFPML.g:630:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_content_2_0= rulePureAdtType ) ) )
            // InternalFPML.g:631:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_content_2_0= rulePureAdtType ) )
            {
            // InternalFPML.g:631:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalFPML.g:632:4: (lv_name_0_0= RULE_ID )
            {
            // InternalFPML.g:632:4: (lv_name_0_0= RULE_ID )
            // InternalFPML.g:633:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_0_0, grammarAccess.getPureDataAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPureDataRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getPureDataAccess().getColonKeyword_1());
            		
            // InternalFPML.g:653:3: ( (lv_content_2_0= rulePureAdtType ) )
            // InternalFPML.g:654:4: (lv_content_2_0= rulePureAdtType )
            {
            // InternalFPML.g:654:4: (lv_content_2_0= rulePureAdtType )
            // InternalFPML.g:655:5: lv_content_2_0= rulePureAdtType
            {

            					newCompositeNode(grammarAccess.getPureDataAccess().getContentPureAdtTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_content_2_0=rulePureAdtType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPureDataRule());
            					}
            					set(
            						current,
            						"content",
            						lv_content_2_0,
            						"it.unibo.FPML.PureAdtType");
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
    // $ANTLR end "rulePureData"


    // $ANTLR start "entryRulePureValue"
    // InternalFPML.g:676:1: entryRulePureValue returns [EObject current=null] : iv_rulePureValue= rulePureValue EOF ;
    public final EObject entryRulePureValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePureValue = null;


        try {
            // InternalFPML.g:676:50: (iv_rulePureValue= rulePureValue EOF )
            // InternalFPML.g:677:2: iv_rulePureValue= rulePureValue EOF
            {
             newCompositeNode(grammarAccess.getPureValueRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePureValue=rulePureValue();

            state._fsp--;

             current =iv_rulePureValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePureValue"


    // $ANTLR start "rulePureValue"
    // InternalFPML.g:683:1: rulePureValue returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_value_3_0= ruleExpression ) ) ) ;
    public final EObject rulePureValue() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:689:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_value_3_0= ruleExpression ) ) ) )
            // InternalFPML.g:690:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_value_3_0= ruleExpression ) ) )
            {
            // InternalFPML.g:690:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_value_3_0= ruleExpression ) ) )
            // InternalFPML.g:691:3: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_value_3_0= ruleExpression ) )
            {
            // InternalFPML.g:691:3: ()
            // InternalFPML.g:692:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPureValueAccess().getPureValueAction_0(),
            					current);
            			

            }

            // InternalFPML.g:698:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFPML.g:699:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFPML.g:699:4: (lv_name_1_0= RULE_ID )
            // InternalFPML.g:700:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPureValueAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPureValueRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getPureValueAccess().getColonKeyword_2());
            		
            // InternalFPML.g:720:3: ( (lv_value_3_0= ruleExpression ) )
            // InternalFPML.g:721:4: (lv_value_3_0= ruleExpression )
            {
            // InternalFPML.g:721:4: (lv_value_3_0= ruleExpression )
            // InternalFPML.g:722:5: lv_value_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getPureValueAccess().getValueExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPureValueRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"it.unibo.FPML.Expression");
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
    // $ANTLR end "rulePureValue"


    // $ANTLR start "entryRulePureAdtType"
    // InternalFPML.g:743:1: entryRulePureAdtType returns [EObject current=null] : iv_rulePureAdtType= rulePureAdtType EOF ;
    public final EObject entryRulePureAdtType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePureAdtType = null;


        try {
            // InternalFPML.g:743:52: (iv_rulePureAdtType= rulePureAdtType EOF )
            // InternalFPML.g:744:2: iv_rulePureAdtType= rulePureAdtType EOF
            {
             newCompositeNode(grammarAccess.getPureAdtTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePureAdtType=rulePureAdtType();

            state._fsp--;

             current =iv_rulePureAdtType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePureAdtType"


    // $ANTLR start "rulePureAdtType"
    // InternalFPML.g:750:1: rulePureAdtType returns [EObject current=null] : (this_ValueType_0= ruleValueType | (otherlv_1= '[' ( (lv_pureAdtElement1_2_0= rulePureAdtType ) ) ( ( (lv_pureAdtElement2_3_1= rulePureSumType | lv_pureAdtElement2_3_2= rulePureProdType ) ) ) otherlv_4= ']' ) ) ;
    public final EObject rulePureAdtType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject this_ValueType_0 = null;

        EObject lv_pureAdtElement1_2_0 = null;

        EObject lv_pureAdtElement2_3_1 = null;

        EObject lv_pureAdtElement2_3_2 = null;



        	enterRule();

        try {
            // InternalFPML.g:756:2: ( (this_ValueType_0= ruleValueType | (otherlv_1= '[' ( (lv_pureAdtElement1_2_0= rulePureAdtType ) ) ( ( (lv_pureAdtElement2_3_1= rulePureSumType | lv_pureAdtElement2_3_2= rulePureProdType ) ) ) otherlv_4= ']' ) ) )
            // InternalFPML.g:757:2: (this_ValueType_0= ruleValueType | (otherlv_1= '[' ( (lv_pureAdtElement1_2_0= rulePureAdtType ) ) ( ( (lv_pureAdtElement2_3_1= rulePureSumType | lv_pureAdtElement2_3_2= rulePureProdType ) ) ) otherlv_4= ']' ) )
            {
            // InternalFPML.g:757:2: (this_ValueType_0= ruleValueType | (otherlv_1= '[' ( (lv_pureAdtElement1_2_0= rulePureAdtType ) ) ( ( (lv_pureAdtElement2_3_1= rulePureSumType | lv_pureAdtElement2_3_2= rulePureProdType ) ) ) otherlv_4= ']' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=32 && LA8_0<=33)||LA8_0==35||LA8_0==37) ) {
                alt8=1;
            }
            else if ( (LA8_0==19) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalFPML.g:758:3: this_ValueType_0= ruleValueType
                    {

                    			newCompositeNode(grammarAccess.getPureAdtTypeAccess().getValueTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ValueType_0=ruleValueType();

                    state._fsp--;


                    			current = this_ValueType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFPML.g:767:3: (otherlv_1= '[' ( (lv_pureAdtElement1_2_0= rulePureAdtType ) ) ( ( (lv_pureAdtElement2_3_1= rulePureSumType | lv_pureAdtElement2_3_2= rulePureProdType ) ) ) otherlv_4= ']' )
                    {
                    // InternalFPML.g:767:3: (otherlv_1= '[' ( (lv_pureAdtElement1_2_0= rulePureAdtType ) ) ( ( (lv_pureAdtElement2_3_1= rulePureSumType | lv_pureAdtElement2_3_2= rulePureProdType ) ) ) otherlv_4= ']' )
                    // InternalFPML.g:768:4: otherlv_1= '[' ( (lv_pureAdtElement1_2_0= rulePureAdtType ) ) ( ( (lv_pureAdtElement2_3_1= rulePureSumType | lv_pureAdtElement2_3_2= rulePureProdType ) ) ) otherlv_4= ']'
                    {
                    otherlv_1=(Token)match(input,19,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getPureAdtTypeAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalFPML.g:772:4: ( (lv_pureAdtElement1_2_0= rulePureAdtType ) )
                    // InternalFPML.g:773:5: (lv_pureAdtElement1_2_0= rulePureAdtType )
                    {
                    // InternalFPML.g:773:5: (lv_pureAdtElement1_2_0= rulePureAdtType )
                    // InternalFPML.g:774:6: lv_pureAdtElement1_2_0= rulePureAdtType
                    {

                    						newCompositeNode(grammarAccess.getPureAdtTypeAccess().getPureAdtElement1PureAdtTypeParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_pureAdtElement1_2_0=rulePureAdtType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPureAdtTypeRule());
                    						}
                    						set(
                    							current,
                    							"pureAdtElement1",
                    							lv_pureAdtElement1_2_0,
                    							"it.unibo.FPML.PureAdtType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFPML.g:791:4: ( ( (lv_pureAdtElement2_3_1= rulePureSumType | lv_pureAdtElement2_3_2= rulePureProdType ) ) )
                    // InternalFPML.g:792:5: ( (lv_pureAdtElement2_3_1= rulePureSumType | lv_pureAdtElement2_3_2= rulePureProdType ) )
                    {
                    // InternalFPML.g:792:5: ( (lv_pureAdtElement2_3_1= rulePureSumType | lv_pureAdtElement2_3_2= rulePureProdType ) )
                    // InternalFPML.g:793:6: (lv_pureAdtElement2_3_1= rulePureSumType | lv_pureAdtElement2_3_2= rulePureProdType )
                    {
                    // InternalFPML.g:793:6: (lv_pureAdtElement2_3_1= rulePureSumType | lv_pureAdtElement2_3_2= rulePureProdType )
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==21) ) {
                        alt7=1;
                    }
                    else if ( (LA7_0==22) ) {
                        alt7=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 0, input);

                        throw nvae;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalFPML.g:794:7: lv_pureAdtElement2_3_1= rulePureSumType
                            {

                            							newCompositeNode(grammarAccess.getPureAdtTypeAccess().getPureAdtElement2PureSumTypeParserRuleCall_1_2_0_0());
                            						
                            pushFollow(FOLLOW_16);
                            lv_pureAdtElement2_3_1=rulePureSumType();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getPureAdtTypeRule());
                            							}
                            							set(
                            								current,
                            								"pureAdtElement2",
                            								lv_pureAdtElement2_3_1,
                            								"it.unibo.FPML.PureSumType");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;
                        case 2 :
                            // InternalFPML.g:810:7: lv_pureAdtElement2_3_2= rulePureProdType
                            {

                            							newCompositeNode(grammarAccess.getPureAdtTypeAccess().getPureAdtElement2PureProdTypeParserRuleCall_1_2_0_1());
                            						
                            pushFollow(FOLLOW_16);
                            lv_pureAdtElement2_3_2=rulePureProdType();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getPureAdtTypeRule());
                            							}
                            							set(
                            								current,
                            								"pureAdtElement2",
                            								lv_pureAdtElement2_3_2,
                            								"it.unibo.FPML.PureProdType");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;

                    }


                    }


                    }

                    otherlv_4=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getPureAdtTypeAccess().getRightSquareBracketKeyword_1_3());
                    			

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
    // $ANTLR end "rulePureAdtType"


    // $ANTLR start "entryRulePureSumType"
    // InternalFPML.g:837:1: entryRulePureSumType returns [EObject current=null] : iv_rulePureSumType= rulePureSumType EOF ;
    public final EObject entryRulePureSumType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePureSumType = null;


        try {
            // InternalFPML.g:837:52: (iv_rulePureSumType= rulePureSumType EOF )
            // InternalFPML.g:838:2: iv_rulePureSumType= rulePureSumType EOF
            {
             newCompositeNode(grammarAccess.getPureSumTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePureSumType=rulePureSumType();

            state._fsp--;

             current =iv_rulePureSumType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePureSumType"


    // $ANTLR start "rulePureSumType"
    // InternalFPML.g:844:1: rulePureSumType returns [EObject current=null] : (otherlv_0= '+' ( (lv_adtElement_1_0= rulePureAdtType ) ) ) ;
    public final EObject rulePureSumType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_adtElement_1_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:850:2: ( (otherlv_0= '+' ( (lv_adtElement_1_0= rulePureAdtType ) ) ) )
            // InternalFPML.g:851:2: (otherlv_0= '+' ( (lv_adtElement_1_0= rulePureAdtType ) ) )
            {
            // InternalFPML.g:851:2: (otherlv_0= '+' ( (lv_adtElement_1_0= rulePureAdtType ) ) )
            // InternalFPML.g:852:3: otherlv_0= '+' ( (lv_adtElement_1_0= rulePureAdtType ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getPureSumTypeAccess().getPlusSignKeyword_0());
            		
            // InternalFPML.g:856:3: ( (lv_adtElement_1_0= rulePureAdtType ) )
            // InternalFPML.g:857:4: (lv_adtElement_1_0= rulePureAdtType )
            {
            // InternalFPML.g:857:4: (lv_adtElement_1_0= rulePureAdtType )
            // InternalFPML.g:858:5: lv_adtElement_1_0= rulePureAdtType
            {

            					newCompositeNode(grammarAccess.getPureSumTypeAccess().getAdtElementPureAdtTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_adtElement_1_0=rulePureAdtType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPureSumTypeRule());
            					}
            					set(
            						current,
            						"adtElement",
            						lv_adtElement_1_0,
            						"it.unibo.FPML.PureAdtType");
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
    // $ANTLR end "rulePureSumType"


    // $ANTLR start "entryRulePureProdType"
    // InternalFPML.g:879:1: entryRulePureProdType returns [EObject current=null] : iv_rulePureProdType= rulePureProdType EOF ;
    public final EObject entryRulePureProdType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePureProdType = null;


        try {
            // InternalFPML.g:879:53: (iv_rulePureProdType= rulePureProdType EOF )
            // InternalFPML.g:880:2: iv_rulePureProdType= rulePureProdType EOF
            {
             newCompositeNode(grammarAccess.getPureProdTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePureProdType=rulePureProdType();

            state._fsp--;

             current =iv_rulePureProdType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePureProdType"


    // $ANTLR start "rulePureProdType"
    // InternalFPML.g:886:1: rulePureProdType returns [EObject current=null] : (otherlv_0= '*' ( (lv_adtElement_1_0= rulePureAdtType ) ) ) ;
    public final EObject rulePureProdType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_adtElement_1_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:892:2: ( (otherlv_0= '*' ( (lv_adtElement_1_0= rulePureAdtType ) ) ) )
            // InternalFPML.g:893:2: (otherlv_0= '*' ( (lv_adtElement_1_0= rulePureAdtType ) ) )
            {
            // InternalFPML.g:893:2: (otherlv_0= '*' ( (lv_adtElement_1_0= rulePureAdtType ) ) )
            // InternalFPML.g:894:3: otherlv_0= '*' ( (lv_adtElement_1_0= rulePureAdtType ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getPureProdTypeAccess().getAsteriskKeyword_0());
            		
            // InternalFPML.g:898:3: ( (lv_adtElement_1_0= rulePureAdtType ) )
            // InternalFPML.g:899:4: (lv_adtElement_1_0= rulePureAdtType )
            {
            // InternalFPML.g:899:4: (lv_adtElement_1_0= rulePureAdtType )
            // InternalFPML.g:900:5: lv_adtElement_1_0= rulePureAdtType
            {

            					newCompositeNode(grammarAccess.getPureProdTypeAccess().getAdtElementPureAdtTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_adtElement_1_0=rulePureAdtType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPureProdTypeRule());
            					}
            					set(
            						current,
            						"adtElement",
            						lv_adtElement_1_0,
            						"it.unibo.FPML.PureAdtType");
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
    // $ANTLR end "rulePureProdType"


    // $ANTLR start "entryRuleEffectFullData"
    // InternalFPML.g:921:1: entryRuleEffectFullData returns [EObject current=null] : iv_ruleEffectFullData= ruleEffectFullData EOF ;
    public final EObject entryRuleEffectFullData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullData = null;


        try {
            // InternalFPML.g:921:55: (iv_ruleEffectFullData= ruleEffectFullData EOF )
            // InternalFPML.g:922:2: iv_ruleEffectFullData= ruleEffectFullData EOF
            {
             newCompositeNode(grammarAccess.getEffectFullDataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEffectFullData=ruleEffectFullData();

            state._fsp--;

             current =iv_ruleEffectFullData; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEffectFullData"


    // $ANTLR start "ruleEffectFullData"
    // InternalFPML.g:928:1: ruleEffectFullData returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_content_2_0= ruleEffectFullAdtType ) ) ) ;
    public final EObject ruleEffectFullData() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_content_2_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:934:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_content_2_0= ruleEffectFullAdtType ) ) ) )
            // InternalFPML.g:935:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_content_2_0= ruleEffectFullAdtType ) ) )
            {
            // InternalFPML.g:935:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_content_2_0= ruleEffectFullAdtType ) ) )
            // InternalFPML.g:936:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_content_2_0= ruleEffectFullAdtType ) )
            {
            // InternalFPML.g:936:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalFPML.g:937:4: (lv_name_0_0= RULE_ID )
            {
            // InternalFPML.g:937:4: (lv_name_0_0= RULE_ID )
            // InternalFPML.g:938:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_0_0, grammarAccess.getEffectFullDataAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEffectFullDataRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getEffectFullDataAccess().getColonKeyword_1());
            		
            // InternalFPML.g:958:3: ( (lv_content_2_0= ruleEffectFullAdtType ) )
            // InternalFPML.g:959:4: (lv_content_2_0= ruleEffectFullAdtType )
            {
            // InternalFPML.g:959:4: (lv_content_2_0= ruleEffectFullAdtType )
            // InternalFPML.g:960:5: lv_content_2_0= ruleEffectFullAdtType
            {

            					newCompositeNode(grammarAccess.getEffectFullDataAccess().getContentEffectFullAdtTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_content_2_0=ruleEffectFullAdtType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEffectFullDataRule());
            					}
            					set(
            						current,
            						"content",
            						lv_content_2_0,
            						"it.unibo.FPML.EffectFullAdtType");
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
    // $ANTLR end "ruleEffectFullData"


    // $ANTLR start "entryRuleEffectFullValue"
    // InternalFPML.g:981:1: entryRuleEffectFullValue returns [EObject current=null] : iv_ruleEffectFullValue= ruleEffectFullValue EOF ;
    public final EObject entryRuleEffectFullValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullValue = null;


        try {
            // InternalFPML.g:981:56: (iv_ruleEffectFullValue= ruleEffectFullValue EOF )
            // InternalFPML.g:982:2: iv_ruleEffectFullValue= ruleEffectFullValue EOF
            {
             newCompositeNode(grammarAccess.getEffectFullValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEffectFullValue=ruleEffectFullValue();

            state._fsp--;

             current =iv_ruleEffectFullValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEffectFullValue"


    // $ANTLR start "ruleEffectFullValue"
    // InternalFPML.g:988:1: ruleEffectFullValue returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEffectFullExpression ) ) ) ;
    public final EObject ruleEffectFullValue() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:994:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEffectFullExpression ) ) ) )
            // InternalFPML.g:995:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEffectFullExpression ) ) )
            {
            // InternalFPML.g:995:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEffectFullExpression ) ) )
            // InternalFPML.g:996:3: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEffectFullExpression ) )
            {
            // InternalFPML.g:996:3: ()
            // InternalFPML.g:997:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEffectFullValueAccess().getEffectFullValueAction_0(),
            					current);
            			

            }

            // InternalFPML.g:1003:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFPML.g:1004:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFPML.g:1004:4: (lv_name_1_0= RULE_ID )
            // InternalFPML.g:1005:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEffectFullValueAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEffectFullValueRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getEffectFullValueAccess().getColonKeyword_2());
            		
            // InternalFPML.g:1025:3: ( (lv_value_3_0= ruleEffectFullExpression ) )
            // InternalFPML.g:1026:4: (lv_value_3_0= ruleEffectFullExpression )
            {
            // InternalFPML.g:1026:4: (lv_value_3_0= ruleEffectFullExpression )
            // InternalFPML.g:1027:5: lv_value_3_0= ruleEffectFullExpression
            {

            					newCompositeNode(grammarAccess.getEffectFullValueAccess().getValueEffectFullExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_3_0=ruleEffectFullExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEffectFullValueRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"it.unibo.FPML.EffectFullExpression");
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
    // $ANTLR end "ruleEffectFullValue"


    // $ANTLR start "entryRuleEffectFullAdtType"
    // InternalFPML.g:1048:1: entryRuleEffectFullAdtType returns [EObject current=null] : iv_ruleEffectFullAdtType= ruleEffectFullAdtType EOF ;
    public final EObject entryRuleEffectFullAdtType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullAdtType = null;


        try {
            // InternalFPML.g:1048:58: (iv_ruleEffectFullAdtType= ruleEffectFullAdtType EOF )
            // InternalFPML.g:1049:2: iv_ruleEffectFullAdtType= ruleEffectFullAdtType EOF
            {
             newCompositeNode(grammarAccess.getEffectFullAdtTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEffectFullAdtType=ruleEffectFullAdtType();

            state._fsp--;

             current =iv_ruleEffectFullAdtType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEffectFullAdtType"


    // $ANTLR start "ruleEffectFullAdtType"
    // InternalFPML.g:1055:1: ruleEffectFullAdtType returns [EObject current=null] : (this_IOType_0= ruleIOType | (otherlv_1= '[' ( (lv_effectFullAdtElement1_2_0= ruleEffectFullAdtType ) ) ( ( (lv_effectFullAdtElement2_3_1= ruleEffectFullSumType | lv_effectFullAdtElement2_3_2= ruleEffectFullProdType ) ) ) otherlv_4= ']' ) ) ;
    public final EObject ruleEffectFullAdtType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject this_IOType_0 = null;

        EObject lv_effectFullAdtElement1_2_0 = null;

        EObject lv_effectFullAdtElement2_3_1 = null;

        EObject lv_effectFullAdtElement2_3_2 = null;



        	enterRule();

        try {
            // InternalFPML.g:1061:2: ( (this_IOType_0= ruleIOType | (otherlv_1= '[' ( (lv_effectFullAdtElement1_2_0= ruleEffectFullAdtType ) ) ( ( (lv_effectFullAdtElement2_3_1= ruleEffectFullSumType | lv_effectFullAdtElement2_3_2= ruleEffectFullProdType ) ) ) otherlv_4= ']' ) ) )
            // InternalFPML.g:1062:2: (this_IOType_0= ruleIOType | (otherlv_1= '[' ( (lv_effectFullAdtElement1_2_0= ruleEffectFullAdtType ) ) ( ( (lv_effectFullAdtElement2_3_1= ruleEffectFullSumType | lv_effectFullAdtElement2_3_2= ruleEffectFullProdType ) ) ) otherlv_4= ']' ) )
            {
            // InternalFPML.g:1062:2: (this_IOType_0= ruleIOType | (otherlv_1= '[' ( (lv_effectFullAdtElement1_2_0= ruleEffectFullAdtType ) ) ( ( (lv_effectFullAdtElement2_3_1= ruleEffectFullSumType | lv_effectFullAdtElement2_3_2= ruleEffectFullProdType ) ) ) otherlv_4= ']' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            else if ( (LA10_0==19) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalFPML.g:1063:3: this_IOType_0= ruleIOType
                    {

                    			newCompositeNode(grammarAccess.getEffectFullAdtTypeAccess().getIOTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IOType_0=ruleIOType();

                    state._fsp--;


                    			current = this_IOType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFPML.g:1072:3: (otherlv_1= '[' ( (lv_effectFullAdtElement1_2_0= ruleEffectFullAdtType ) ) ( ( (lv_effectFullAdtElement2_3_1= ruleEffectFullSumType | lv_effectFullAdtElement2_3_2= ruleEffectFullProdType ) ) ) otherlv_4= ']' )
                    {
                    // InternalFPML.g:1072:3: (otherlv_1= '[' ( (lv_effectFullAdtElement1_2_0= ruleEffectFullAdtType ) ) ( ( (lv_effectFullAdtElement2_3_1= ruleEffectFullSumType | lv_effectFullAdtElement2_3_2= ruleEffectFullProdType ) ) ) otherlv_4= ']' )
                    // InternalFPML.g:1073:4: otherlv_1= '[' ( (lv_effectFullAdtElement1_2_0= ruleEffectFullAdtType ) ) ( ( (lv_effectFullAdtElement2_3_1= ruleEffectFullSumType | lv_effectFullAdtElement2_3_2= ruleEffectFullProdType ) ) ) otherlv_4= ']'
                    {
                    otherlv_1=(Token)match(input,19,FOLLOW_17); 

                    				newLeafNode(otherlv_1, grammarAccess.getEffectFullAdtTypeAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalFPML.g:1077:4: ( (lv_effectFullAdtElement1_2_0= ruleEffectFullAdtType ) )
                    // InternalFPML.g:1078:5: (lv_effectFullAdtElement1_2_0= ruleEffectFullAdtType )
                    {
                    // InternalFPML.g:1078:5: (lv_effectFullAdtElement1_2_0= ruleEffectFullAdtType )
                    // InternalFPML.g:1079:6: lv_effectFullAdtElement1_2_0= ruleEffectFullAdtType
                    {

                    						newCompositeNode(grammarAccess.getEffectFullAdtTypeAccess().getEffectFullAdtElement1EffectFullAdtTypeParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_effectFullAdtElement1_2_0=ruleEffectFullAdtType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEffectFullAdtTypeRule());
                    						}
                    						set(
                    							current,
                    							"effectFullAdtElement1",
                    							lv_effectFullAdtElement1_2_0,
                    							"it.unibo.FPML.EffectFullAdtType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFPML.g:1096:4: ( ( (lv_effectFullAdtElement2_3_1= ruleEffectFullSumType | lv_effectFullAdtElement2_3_2= ruleEffectFullProdType ) ) )
                    // InternalFPML.g:1097:5: ( (lv_effectFullAdtElement2_3_1= ruleEffectFullSumType | lv_effectFullAdtElement2_3_2= ruleEffectFullProdType ) )
                    {
                    // InternalFPML.g:1097:5: ( (lv_effectFullAdtElement2_3_1= ruleEffectFullSumType | lv_effectFullAdtElement2_3_2= ruleEffectFullProdType ) )
                    // InternalFPML.g:1098:6: (lv_effectFullAdtElement2_3_1= ruleEffectFullSumType | lv_effectFullAdtElement2_3_2= ruleEffectFullProdType )
                    {
                    // InternalFPML.g:1098:6: (lv_effectFullAdtElement2_3_1= ruleEffectFullSumType | lv_effectFullAdtElement2_3_2= ruleEffectFullProdType )
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==21) ) {
                        alt9=1;
                    }
                    else if ( (LA9_0==22) ) {
                        alt9=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalFPML.g:1099:7: lv_effectFullAdtElement2_3_1= ruleEffectFullSumType
                            {

                            							newCompositeNode(grammarAccess.getEffectFullAdtTypeAccess().getEffectFullAdtElement2EffectFullSumTypeParserRuleCall_1_2_0_0());
                            						
                            pushFollow(FOLLOW_16);
                            lv_effectFullAdtElement2_3_1=ruleEffectFullSumType();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getEffectFullAdtTypeRule());
                            							}
                            							set(
                            								current,
                            								"effectFullAdtElement2",
                            								lv_effectFullAdtElement2_3_1,
                            								"it.unibo.FPML.EffectFullSumType");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;
                        case 2 :
                            // InternalFPML.g:1115:7: lv_effectFullAdtElement2_3_2= ruleEffectFullProdType
                            {

                            							newCompositeNode(grammarAccess.getEffectFullAdtTypeAccess().getEffectFullAdtElement2EffectFullProdTypeParserRuleCall_1_2_0_1());
                            						
                            pushFollow(FOLLOW_16);
                            lv_effectFullAdtElement2_3_2=ruleEffectFullProdType();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getEffectFullAdtTypeRule());
                            							}
                            							set(
                            								current,
                            								"effectFullAdtElement2",
                            								lv_effectFullAdtElement2_3_2,
                            								"it.unibo.FPML.EffectFullProdType");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;

                    }


                    }


                    }

                    otherlv_4=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getEffectFullAdtTypeAccess().getRightSquareBracketKeyword_1_3());
                    			

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
    // $ANTLR end "ruleEffectFullAdtType"


    // $ANTLR start "entryRuleEffectFullSumType"
    // InternalFPML.g:1142:1: entryRuleEffectFullSumType returns [EObject current=null] : iv_ruleEffectFullSumType= ruleEffectFullSumType EOF ;
    public final EObject entryRuleEffectFullSumType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullSumType = null;


        try {
            // InternalFPML.g:1142:58: (iv_ruleEffectFullSumType= ruleEffectFullSumType EOF )
            // InternalFPML.g:1143:2: iv_ruleEffectFullSumType= ruleEffectFullSumType EOF
            {
             newCompositeNode(grammarAccess.getEffectFullSumTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEffectFullSumType=ruleEffectFullSumType();

            state._fsp--;

             current =iv_ruleEffectFullSumType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEffectFullSumType"


    // $ANTLR start "ruleEffectFullSumType"
    // InternalFPML.g:1149:1: ruleEffectFullSumType returns [EObject current=null] : (otherlv_0= '+' ( (lv_adtElement_1_0= ruleEffectFullAdtType ) ) ) ;
    public final EObject ruleEffectFullSumType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_adtElement_1_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:1155:2: ( (otherlv_0= '+' ( (lv_adtElement_1_0= ruleEffectFullAdtType ) ) ) )
            // InternalFPML.g:1156:2: (otherlv_0= '+' ( (lv_adtElement_1_0= ruleEffectFullAdtType ) ) )
            {
            // InternalFPML.g:1156:2: (otherlv_0= '+' ( (lv_adtElement_1_0= ruleEffectFullAdtType ) ) )
            // InternalFPML.g:1157:3: otherlv_0= '+' ( (lv_adtElement_1_0= ruleEffectFullAdtType ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getEffectFullSumTypeAccess().getPlusSignKeyword_0());
            		
            // InternalFPML.g:1161:3: ( (lv_adtElement_1_0= ruleEffectFullAdtType ) )
            // InternalFPML.g:1162:4: (lv_adtElement_1_0= ruleEffectFullAdtType )
            {
            // InternalFPML.g:1162:4: (lv_adtElement_1_0= ruleEffectFullAdtType )
            // InternalFPML.g:1163:5: lv_adtElement_1_0= ruleEffectFullAdtType
            {

            					newCompositeNode(grammarAccess.getEffectFullSumTypeAccess().getAdtElementEffectFullAdtTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_adtElement_1_0=ruleEffectFullAdtType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEffectFullSumTypeRule());
            					}
            					set(
            						current,
            						"adtElement",
            						lv_adtElement_1_0,
            						"it.unibo.FPML.EffectFullAdtType");
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
    // $ANTLR end "ruleEffectFullSumType"


    // $ANTLR start "entryRuleEffectFullProdType"
    // InternalFPML.g:1184:1: entryRuleEffectFullProdType returns [EObject current=null] : iv_ruleEffectFullProdType= ruleEffectFullProdType EOF ;
    public final EObject entryRuleEffectFullProdType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullProdType = null;


        try {
            // InternalFPML.g:1184:59: (iv_ruleEffectFullProdType= ruleEffectFullProdType EOF )
            // InternalFPML.g:1185:2: iv_ruleEffectFullProdType= ruleEffectFullProdType EOF
            {
             newCompositeNode(grammarAccess.getEffectFullProdTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEffectFullProdType=ruleEffectFullProdType();

            state._fsp--;

             current =iv_ruleEffectFullProdType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEffectFullProdType"


    // $ANTLR start "ruleEffectFullProdType"
    // InternalFPML.g:1191:1: ruleEffectFullProdType returns [EObject current=null] : (otherlv_0= '*' ( (lv_adtElement_1_0= ruleEffectFullAdtType ) ) ) ;
    public final EObject ruleEffectFullProdType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_adtElement_1_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:1197:2: ( (otherlv_0= '*' ( (lv_adtElement_1_0= ruleEffectFullAdtType ) ) ) )
            // InternalFPML.g:1198:2: (otherlv_0= '*' ( (lv_adtElement_1_0= ruleEffectFullAdtType ) ) )
            {
            // InternalFPML.g:1198:2: (otherlv_0= '*' ( (lv_adtElement_1_0= ruleEffectFullAdtType ) ) )
            // InternalFPML.g:1199:3: otherlv_0= '*' ( (lv_adtElement_1_0= ruleEffectFullAdtType ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getEffectFullProdTypeAccess().getAsteriskKeyword_0());
            		
            // InternalFPML.g:1203:3: ( (lv_adtElement_1_0= ruleEffectFullAdtType ) )
            // InternalFPML.g:1204:4: (lv_adtElement_1_0= ruleEffectFullAdtType )
            {
            // InternalFPML.g:1204:4: (lv_adtElement_1_0= ruleEffectFullAdtType )
            // InternalFPML.g:1205:5: lv_adtElement_1_0= ruleEffectFullAdtType
            {

            					newCompositeNode(grammarAccess.getEffectFullProdTypeAccess().getAdtElementEffectFullAdtTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_adtElement_1_0=ruleEffectFullAdtType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEffectFullProdTypeRule());
            					}
            					set(
            						current,
            						"adtElement",
            						lv_adtElement_1_0,
            						"it.unibo.FPML.EffectFullAdtType");
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
    // $ANTLR end "ruleEffectFullProdType"


    // $ANTLR start "entryRulePureFunctionDefinition"
    // InternalFPML.g:1226:1: entryRulePureFunctionDefinition returns [EObject current=null] : iv_rulePureFunctionDefinition= rulePureFunctionDefinition EOF ;
    public final EObject entryRulePureFunctionDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePureFunctionDefinition = null;


        try {
            // InternalFPML.g:1226:63: (iv_rulePureFunctionDefinition= rulePureFunctionDefinition EOF )
            // InternalFPML.g:1227:2: iv_rulePureFunctionDefinition= rulePureFunctionDefinition EOF
            {
             newCompositeNode(grammarAccess.getPureFunctionDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePureFunctionDefinition=rulePureFunctionDefinition();

            state._fsp--;

             current =iv_rulePureFunctionDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePureFunctionDefinition"


    // $ANTLR start "rulePureFunctionDefinition"
    // InternalFPML.g:1233:1: rulePureFunctionDefinition returns [EObject current=null] : (otherlv_0= 'def' ( (lv_returnType_1_0= ruleValueType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_arg_4_0= ruleArgument ) ) (otherlv_5= ',' ( (lv_higherOrderArg_6_0= ruleAdditionalPureArgument ) ) )? otherlv_7= ')' otherlv_8= ':' otherlv_9= '{' ( (lv_functionBody_10_0= ruleFunctionBodyPure ) ) otherlv_11= '}' ) ;
    public final EObject rulePureFunctionDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_returnType_1_0 = null;

        EObject lv_arg_4_0 = null;

        EObject lv_higherOrderArg_6_0 = null;

        EObject lv_functionBody_10_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:1239:2: ( (otherlv_0= 'def' ( (lv_returnType_1_0= ruleValueType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_arg_4_0= ruleArgument ) ) (otherlv_5= ',' ( (lv_higherOrderArg_6_0= ruleAdditionalPureArgument ) ) )? otherlv_7= ')' otherlv_8= ':' otherlv_9= '{' ( (lv_functionBody_10_0= ruleFunctionBodyPure ) ) otherlv_11= '}' ) )
            // InternalFPML.g:1240:2: (otherlv_0= 'def' ( (lv_returnType_1_0= ruleValueType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_arg_4_0= ruleArgument ) ) (otherlv_5= ',' ( (lv_higherOrderArg_6_0= ruleAdditionalPureArgument ) ) )? otherlv_7= ')' otherlv_8= ':' otherlv_9= '{' ( (lv_functionBody_10_0= ruleFunctionBodyPure ) ) otherlv_11= '}' )
            {
            // InternalFPML.g:1240:2: (otherlv_0= 'def' ( (lv_returnType_1_0= ruleValueType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_arg_4_0= ruleArgument ) ) (otherlv_5= ',' ( (lv_higherOrderArg_6_0= ruleAdditionalPureArgument ) ) )? otherlv_7= ')' otherlv_8= ':' otherlv_9= '{' ( (lv_functionBody_10_0= ruleFunctionBodyPure ) ) otherlv_11= '}' )
            // InternalFPML.g:1241:3: otherlv_0= 'def' ( (lv_returnType_1_0= ruleValueType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_arg_4_0= ruleArgument ) ) (otherlv_5= ',' ( (lv_higherOrderArg_6_0= ruleAdditionalPureArgument ) ) )? otherlv_7= ')' otherlv_8= ':' otherlv_9= '{' ( (lv_functionBody_10_0= ruleFunctionBodyPure ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getPureFunctionDefinitionAccess().getDefKeyword_0());
            		
            // InternalFPML.g:1245:3: ( (lv_returnType_1_0= ruleValueType ) )
            // InternalFPML.g:1246:4: (lv_returnType_1_0= ruleValueType )
            {
            // InternalFPML.g:1246:4: (lv_returnType_1_0= ruleValueType )
            // InternalFPML.g:1247:5: lv_returnType_1_0= ruleValueType
            {

            					newCompositeNode(grammarAccess.getPureFunctionDefinitionAccess().getReturnTypeValueTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
            lv_returnType_1_0=ruleValueType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPureFunctionDefinitionRule());
            					}
            					set(
            						current,
            						"returnType",
            						lv_returnType_1_0,
            						"it.unibo.FPML.ValueType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFPML.g:1264:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalFPML.g:1265:4: (lv_name_2_0= RULE_ID )
            {
            // InternalFPML.g:1265:4: (lv_name_2_0= RULE_ID )
            // InternalFPML.g:1266:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(lv_name_2_0, grammarAccess.getPureFunctionDefinitionAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPureFunctionDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getPureFunctionDefinitionAccess().getLeftParenthesisKeyword_3());
            		
            // InternalFPML.g:1286:3: ( (lv_arg_4_0= ruleArgument ) )
            // InternalFPML.g:1287:4: (lv_arg_4_0= ruleArgument )
            {
            // InternalFPML.g:1287:4: (lv_arg_4_0= ruleArgument )
            // InternalFPML.g:1288:5: lv_arg_4_0= ruleArgument
            {

            					newCompositeNode(grammarAccess.getPureFunctionDefinitionAccess().getArgArgumentParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_22);
            lv_arg_4_0=ruleArgument();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPureFunctionDefinitionRule());
            					}
            					set(
            						current,
            						"arg",
            						lv_arg_4_0,
            						"it.unibo.FPML.Argument");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFPML.g:1305:3: (otherlv_5= ',' ( (lv_higherOrderArg_6_0= ruleAdditionalPureArgument ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalFPML.g:1306:4: otherlv_5= ',' ( (lv_higherOrderArg_6_0= ruleAdditionalPureArgument ) )
                    {
                    otherlv_5=(Token)match(input,25,FOLLOW_19); 

                    				newLeafNode(otherlv_5, grammarAccess.getPureFunctionDefinitionAccess().getCommaKeyword_5_0());
                    			
                    // InternalFPML.g:1310:4: ( (lv_higherOrderArg_6_0= ruleAdditionalPureArgument ) )
                    // InternalFPML.g:1311:5: (lv_higherOrderArg_6_0= ruleAdditionalPureArgument )
                    {
                    // InternalFPML.g:1311:5: (lv_higherOrderArg_6_0= ruleAdditionalPureArgument )
                    // InternalFPML.g:1312:6: lv_higherOrderArg_6_0= ruleAdditionalPureArgument
                    {

                    						newCompositeNode(grammarAccess.getPureFunctionDefinitionAccess().getHigherOrderArgAdditionalPureArgumentParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_higherOrderArg_6_0=ruleAdditionalPureArgument();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPureFunctionDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"higherOrderArg",
                    							lv_higherOrderArg_6_0,
                    							"it.unibo.FPML.AdditionalPureArgument");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,26,FOLLOW_12); 

            			newLeafNode(otherlv_7, grammarAccess.getPureFunctionDefinitionAccess().getRightParenthesisKeyword_6());
            		
            otherlv_8=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_8, grammarAccess.getPureFunctionDefinitionAccess().getColonKeyword_7());
            		
            otherlv_9=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_9, grammarAccess.getPureFunctionDefinitionAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalFPML.g:1342:3: ( (lv_functionBody_10_0= ruleFunctionBodyPure ) )
            // InternalFPML.g:1343:4: (lv_functionBody_10_0= ruleFunctionBodyPure )
            {
            // InternalFPML.g:1343:4: (lv_functionBody_10_0= ruleFunctionBodyPure )
            // InternalFPML.g:1344:5: lv_functionBody_10_0= ruleFunctionBodyPure
            {

            					newCompositeNode(grammarAccess.getPureFunctionDefinitionAccess().getFunctionBodyFunctionBodyPureParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_7);
            lv_functionBody_10_0=ruleFunctionBodyPure();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPureFunctionDefinitionRule());
            					}
            					set(
            						current,
            						"functionBody",
            						lv_functionBody_10_0,
            						"it.unibo.FPML.FunctionBodyPure");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getPureFunctionDefinitionAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePureFunctionDefinition"


    // $ANTLR start "entryRuleEffectFullFunctionDefinition"
    // InternalFPML.g:1369:1: entryRuleEffectFullFunctionDefinition returns [EObject current=null] : iv_ruleEffectFullFunctionDefinition= ruleEffectFullFunctionDefinition EOF ;
    public final EObject entryRuleEffectFullFunctionDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullFunctionDefinition = null;


        try {
            // InternalFPML.g:1369:69: (iv_ruleEffectFullFunctionDefinition= ruleEffectFullFunctionDefinition EOF )
            // InternalFPML.g:1370:2: iv_ruleEffectFullFunctionDefinition= ruleEffectFullFunctionDefinition EOF
            {
             newCompositeNode(grammarAccess.getEffectFullFunctionDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEffectFullFunctionDefinition=ruleEffectFullFunctionDefinition();

            state._fsp--;

             current =iv_ruleEffectFullFunctionDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEffectFullFunctionDefinition"


    // $ANTLR start "ruleEffectFullFunctionDefinition"
    // InternalFPML.g:1376:1: ruleEffectFullFunctionDefinition returns [EObject current=null] : (otherlv_0= 'def' ( (lv_returnType_1_0= ruleIOType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_arg_4_0= ruleEffectFullArgument ) ) (otherlv_5= ',' ( (lv_higherOrderArg_6_0= ruleAdditionalEffectFullArgument ) ) )? otherlv_7= ')' otherlv_8= ':' otherlv_9= '{' ( (lv_functionBody_10_0= ruleFunctionBodyEffectFull ) ) otherlv_11= '}' ) ;
    public final EObject ruleEffectFullFunctionDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_returnType_1_0 = null;

        EObject lv_arg_4_0 = null;

        EObject lv_higherOrderArg_6_0 = null;

        EObject lv_functionBody_10_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:1382:2: ( (otherlv_0= 'def' ( (lv_returnType_1_0= ruleIOType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_arg_4_0= ruleEffectFullArgument ) ) (otherlv_5= ',' ( (lv_higherOrderArg_6_0= ruleAdditionalEffectFullArgument ) ) )? otherlv_7= ')' otherlv_8= ':' otherlv_9= '{' ( (lv_functionBody_10_0= ruleFunctionBodyEffectFull ) ) otherlv_11= '}' ) )
            // InternalFPML.g:1383:2: (otherlv_0= 'def' ( (lv_returnType_1_0= ruleIOType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_arg_4_0= ruleEffectFullArgument ) ) (otherlv_5= ',' ( (lv_higherOrderArg_6_0= ruleAdditionalEffectFullArgument ) ) )? otherlv_7= ')' otherlv_8= ':' otherlv_9= '{' ( (lv_functionBody_10_0= ruleFunctionBodyEffectFull ) ) otherlv_11= '}' )
            {
            // InternalFPML.g:1383:2: (otherlv_0= 'def' ( (lv_returnType_1_0= ruleIOType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_arg_4_0= ruleEffectFullArgument ) ) (otherlv_5= ',' ( (lv_higherOrderArg_6_0= ruleAdditionalEffectFullArgument ) ) )? otherlv_7= ')' otherlv_8= ':' otherlv_9= '{' ( (lv_functionBody_10_0= ruleFunctionBodyEffectFull ) ) otherlv_11= '}' )
            // InternalFPML.g:1384:3: otherlv_0= 'def' ( (lv_returnType_1_0= ruleIOType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_arg_4_0= ruleEffectFullArgument ) ) (otherlv_5= ',' ( (lv_higherOrderArg_6_0= ruleAdditionalEffectFullArgument ) ) )? otherlv_7= ')' otherlv_8= ':' otherlv_9= '{' ( (lv_functionBody_10_0= ruleFunctionBodyEffectFull ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getEffectFullFunctionDefinitionAccess().getDefKeyword_0());
            		
            // InternalFPML.g:1388:3: ( (lv_returnType_1_0= ruleIOType ) )
            // InternalFPML.g:1389:4: (lv_returnType_1_0= ruleIOType )
            {
            // InternalFPML.g:1389:4: (lv_returnType_1_0= ruleIOType )
            // InternalFPML.g:1390:5: lv_returnType_1_0= ruleIOType
            {

            					newCompositeNode(grammarAccess.getEffectFullFunctionDefinitionAccess().getReturnTypeIOTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
            lv_returnType_1_0=ruleIOType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEffectFullFunctionDefinitionRule());
            					}
            					set(
            						current,
            						"returnType",
            						lv_returnType_1_0,
            						"it.unibo.FPML.IOType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFPML.g:1407:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalFPML.g:1408:4: (lv_name_2_0= RULE_ID )
            {
            // InternalFPML.g:1408:4: (lv_name_2_0= RULE_ID )
            // InternalFPML.g:1409:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(lv_name_2_0, grammarAccess.getEffectFullFunctionDefinitionAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEffectFullFunctionDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_26); 

            			newLeafNode(otherlv_3, grammarAccess.getEffectFullFunctionDefinitionAccess().getLeftParenthesisKeyword_3());
            		
            // InternalFPML.g:1429:3: ( (lv_arg_4_0= ruleEffectFullArgument ) )
            // InternalFPML.g:1430:4: (lv_arg_4_0= ruleEffectFullArgument )
            {
            // InternalFPML.g:1430:4: (lv_arg_4_0= ruleEffectFullArgument )
            // InternalFPML.g:1431:5: lv_arg_4_0= ruleEffectFullArgument
            {

            					newCompositeNode(grammarAccess.getEffectFullFunctionDefinitionAccess().getArgEffectFullArgumentParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_22);
            lv_arg_4_0=ruleEffectFullArgument();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEffectFullFunctionDefinitionRule());
            					}
            					set(
            						current,
            						"arg",
            						lv_arg_4_0,
            						"it.unibo.FPML.EffectFullArgument");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFPML.g:1448:3: (otherlv_5= ',' ( (lv_higherOrderArg_6_0= ruleAdditionalEffectFullArgument ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalFPML.g:1449:4: otherlv_5= ',' ( (lv_higherOrderArg_6_0= ruleAdditionalEffectFullArgument ) )
                    {
                    otherlv_5=(Token)match(input,25,FOLLOW_26); 

                    				newLeafNode(otherlv_5, grammarAccess.getEffectFullFunctionDefinitionAccess().getCommaKeyword_5_0());
                    			
                    // InternalFPML.g:1453:4: ( (lv_higherOrderArg_6_0= ruleAdditionalEffectFullArgument ) )
                    // InternalFPML.g:1454:5: (lv_higherOrderArg_6_0= ruleAdditionalEffectFullArgument )
                    {
                    // InternalFPML.g:1454:5: (lv_higherOrderArg_6_0= ruleAdditionalEffectFullArgument )
                    // InternalFPML.g:1455:6: lv_higherOrderArg_6_0= ruleAdditionalEffectFullArgument
                    {

                    						newCompositeNode(grammarAccess.getEffectFullFunctionDefinitionAccess().getHigherOrderArgAdditionalEffectFullArgumentParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_higherOrderArg_6_0=ruleAdditionalEffectFullArgument();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEffectFullFunctionDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"higherOrderArg",
                    							lv_higherOrderArg_6_0,
                    							"it.unibo.FPML.AdditionalEffectFullArgument");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,26,FOLLOW_12); 

            			newLeafNode(otherlv_7, grammarAccess.getEffectFullFunctionDefinitionAccess().getRightParenthesisKeyword_6());
            		
            otherlv_8=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_8, grammarAccess.getEffectFullFunctionDefinitionAccess().getColonKeyword_7());
            		
            otherlv_9=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_9, grammarAccess.getEffectFullFunctionDefinitionAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalFPML.g:1485:3: ( (lv_functionBody_10_0= ruleFunctionBodyEffectFull ) )
            // InternalFPML.g:1486:4: (lv_functionBody_10_0= ruleFunctionBodyEffectFull )
            {
            // InternalFPML.g:1486:4: (lv_functionBody_10_0= ruleFunctionBodyEffectFull )
            // InternalFPML.g:1487:5: lv_functionBody_10_0= ruleFunctionBodyEffectFull
            {

            					newCompositeNode(grammarAccess.getEffectFullFunctionDefinitionAccess().getFunctionBodyFunctionBodyEffectFullParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_7);
            lv_functionBody_10_0=ruleFunctionBodyEffectFull();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEffectFullFunctionDefinitionRule());
            					}
            					set(
            						current,
            						"functionBody",
            						lv_functionBody_10_0,
            						"it.unibo.FPML.FunctionBodyEffectFull");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getEffectFullFunctionDefinitionAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEffectFullFunctionDefinition"


    // $ANTLR start "entryRuleMainFunc"
    // InternalFPML.g:1512:1: entryRuleMainFunc returns [EObject current=null] : iv_ruleMainFunc= ruleMainFunc EOF ;
    public final EObject entryRuleMainFunc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMainFunc = null;


        try {
            // InternalFPML.g:1512:49: (iv_ruleMainFunc= ruleMainFunc EOF )
            // InternalFPML.g:1513:2: iv_ruleMainFunc= ruleMainFunc EOF
            {
             newCompositeNode(grammarAccess.getMainFuncRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMainFunc=ruleMainFunc();

            state._fsp--;

             current =iv_ruleMainFunc; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMainFunc"


    // $ANTLR start "ruleMainFunc"
    // InternalFPML.g:1519:1: ruleMainFunc returns [EObject current=null] : (otherlv_0= 'IO' ( (lv_returnType_1_0= ruleUnitType ) ) otherlv_2= 'main' otherlv_3= ':' otherlv_4= '{' ( (lv_functionBody_5_0= ruleFunctionBodyEffectFull ) ) otherlv_6= '}' ) ;
    public final EObject ruleMainFunc() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_returnType_1_0 = null;

        EObject lv_functionBody_5_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:1525:2: ( (otherlv_0= 'IO' ( (lv_returnType_1_0= ruleUnitType ) ) otherlv_2= 'main' otherlv_3= ':' otherlv_4= '{' ( (lv_functionBody_5_0= ruleFunctionBodyEffectFull ) ) otherlv_6= '}' ) )
            // InternalFPML.g:1526:2: (otherlv_0= 'IO' ( (lv_returnType_1_0= ruleUnitType ) ) otherlv_2= 'main' otherlv_3= ':' otherlv_4= '{' ( (lv_functionBody_5_0= ruleFunctionBodyEffectFull ) ) otherlv_6= '}' )
            {
            // InternalFPML.g:1526:2: (otherlv_0= 'IO' ( (lv_returnType_1_0= ruleUnitType ) ) otherlv_2= 'main' otherlv_3= ':' otherlv_4= '{' ( (lv_functionBody_5_0= ruleFunctionBodyEffectFull ) ) otherlv_6= '}' )
            // InternalFPML.g:1527:3: otherlv_0= 'IO' ( (lv_returnType_1_0= ruleUnitType ) ) otherlv_2= 'main' otherlv_3= ':' otherlv_4= '{' ( (lv_functionBody_5_0= ruleFunctionBodyEffectFull ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getMainFuncAccess().getIOKeyword_0());
            		
            // InternalFPML.g:1531:3: ( (lv_returnType_1_0= ruleUnitType ) )
            // InternalFPML.g:1532:4: (lv_returnType_1_0= ruleUnitType )
            {
            // InternalFPML.g:1532:4: (lv_returnType_1_0= ruleUnitType )
            // InternalFPML.g:1533:5: lv_returnType_1_0= ruleUnitType
            {

            					newCompositeNode(grammarAccess.getMainFuncAccess().getReturnTypeUnitTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_28);
            lv_returnType_1_0=ruleUnitType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMainFuncRule());
            					}
            					set(
            						current,
            						"returnType",
            						lv_returnType_1_0,
            						"it.unibo.FPML.UnitType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getMainFuncAccess().getMainKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getMainFuncAccess().getColonKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_4, grammarAccess.getMainFuncAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalFPML.g:1562:3: ( (lv_functionBody_5_0= ruleFunctionBodyEffectFull ) )
            // InternalFPML.g:1563:4: (lv_functionBody_5_0= ruleFunctionBodyEffectFull )
            {
            // InternalFPML.g:1563:4: (lv_functionBody_5_0= ruleFunctionBodyEffectFull )
            // InternalFPML.g:1564:5: lv_functionBody_5_0= ruleFunctionBodyEffectFull
            {

            					newCompositeNode(grammarAccess.getMainFuncAccess().getFunctionBodyFunctionBodyEffectFullParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_7);
            lv_functionBody_5_0=ruleFunctionBodyEffectFull();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMainFuncRule());
            					}
            					set(
            						current,
            						"functionBody",
            						lv_functionBody_5_0,
            						"it.unibo.FPML.FunctionBodyEffectFull");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getMainFuncAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMainFunc"


    // $ANTLR start "entryRuleAdditionalPureArgument"
    // InternalFPML.g:1589:1: entryRuleAdditionalPureArgument returns [EObject current=null] : iv_ruleAdditionalPureArgument= ruleAdditionalPureArgument EOF ;
    public final EObject entryRuleAdditionalPureArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditionalPureArgument = null;


        try {
            // InternalFPML.g:1589:63: (iv_ruleAdditionalPureArgument= ruleAdditionalPureArgument EOF )
            // InternalFPML.g:1590:2: iv_ruleAdditionalPureArgument= ruleAdditionalPureArgument EOF
            {
             newCompositeNode(grammarAccess.getAdditionalPureArgumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdditionalPureArgument=ruleAdditionalPureArgument();

            state._fsp--;

             current =iv_ruleAdditionalPureArgument; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdditionalPureArgument"


    // $ANTLR start "ruleAdditionalPureArgument"
    // InternalFPML.g:1596:1: ruleAdditionalPureArgument returns [EObject current=null] : ( (lv_arg2_0_0= ruleArgument ) ) ;
    public final EObject ruleAdditionalPureArgument() throws RecognitionException {
        EObject current = null;

        EObject lv_arg2_0_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:1602:2: ( ( (lv_arg2_0_0= ruleArgument ) ) )
            // InternalFPML.g:1603:2: ( (lv_arg2_0_0= ruleArgument ) )
            {
            // InternalFPML.g:1603:2: ( (lv_arg2_0_0= ruleArgument ) )
            // InternalFPML.g:1604:3: (lv_arg2_0_0= ruleArgument )
            {
            // InternalFPML.g:1604:3: (lv_arg2_0_0= ruleArgument )
            // InternalFPML.g:1605:4: lv_arg2_0_0= ruleArgument
            {

            				newCompositeNode(grammarAccess.getAdditionalPureArgumentAccess().getArg2ArgumentParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_arg2_0_0=ruleArgument();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getAdditionalPureArgumentRule());
            				}
            				set(
            					current,
            					"arg2",
            					lv_arg2_0_0,
            					"it.unibo.FPML.Argument");
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
    // $ANTLR end "ruleAdditionalPureArgument"


    // $ANTLR start "entryRuleAdditionalEffectFullArgument"
    // InternalFPML.g:1625:1: entryRuleAdditionalEffectFullArgument returns [EObject current=null] : iv_ruleAdditionalEffectFullArgument= ruleAdditionalEffectFullArgument EOF ;
    public final EObject entryRuleAdditionalEffectFullArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditionalEffectFullArgument = null;


        try {
            // InternalFPML.g:1625:69: (iv_ruleAdditionalEffectFullArgument= ruleAdditionalEffectFullArgument EOF )
            // InternalFPML.g:1626:2: iv_ruleAdditionalEffectFullArgument= ruleAdditionalEffectFullArgument EOF
            {
             newCompositeNode(grammarAccess.getAdditionalEffectFullArgumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdditionalEffectFullArgument=ruleAdditionalEffectFullArgument();

            state._fsp--;

             current =iv_ruleAdditionalEffectFullArgument; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdditionalEffectFullArgument"


    // $ANTLR start "ruleAdditionalEffectFullArgument"
    // InternalFPML.g:1632:1: ruleAdditionalEffectFullArgument returns [EObject current=null] : ( (lv_arg2_0_0= ruleEffectFullArgument ) ) ;
    public final EObject ruleAdditionalEffectFullArgument() throws RecognitionException {
        EObject current = null;

        EObject lv_arg2_0_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:1638:2: ( ( (lv_arg2_0_0= ruleEffectFullArgument ) ) )
            // InternalFPML.g:1639:2: ( (lv_arg2_0_0= ruleEffectFullArgument ) )
            {
            // InternalFPML.g:1639:2: ( (lv_arg2_0_0= ruleEffectFullArgument ) )
            // InternalFPML.g:1640:3: (lv_arg2_0_0= ruleEffectFullArgument )
            {
            // InternalFPML.g:1640:3: (lv_arg2_0_0= ruleEffectFullArgument )
            // InternalFPML.g:1641:4: lv_arg2_0_0= ruleEffectFullArgument
            {

            				newCompositeNode(grammarAccess.getAdditionalEffectFullArgumentAccess().getArg2EffectFullArgumentParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_arg2_0_0=ruleEffectFullArgument();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getAdditionalEffectFullArgumentRule());
            				}
            				set(
            					current,
            					"arg2",
            					lv_arg2_0_0,
            					"it.unibo.FPML.EffectFullArgument");
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
    // $ANTLR end "ruleAdditionalEffectFullArgument"


    // $ANTLR start "entryRulePureFunction"
    // InternalFPML.g:1661:1: entryRulePureFunction returns [EObject current=null] : iv_rulePureFunction= rulePureFunction EOF ;
    public final EObject entryRulePureFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePureFunction = null;


        try {
            // InternalFPML.g:1661:53: (iv_rulePureFunction= rulePureFunction EOF )
            // InternalFPML.g:1662:2: iv_rulePureFunction= rulePureFunction EOF
            {
             newCompositeNode(grammarAccess.getPureFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePureFunction=rulePureFunction();

            state._fsp--;

             current =iv_rulePureFunction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePureFunction"


    // $ANTLR start "rulePureFunction"
    // InternalFPML.g:1668:1: rulePureFunction returns [EObject current=null] : (this_PureFunctionDefinition_0= rulePureFunctionDefinition | this_PrimitivePureFunction_1= rulePrimitivePureFunction ) ;
    public final EObject rulePureFunction() throws RecognitionException {
        EObject current = null;

        EObject this_PureFunctionDefinition_0 = null;

        EObject this_PrimitivePureFunction_1 = null;



        	enterRule();

        try {
            // InternalFPML.g:1674:2: ( (this_PureFunctionDefinition_0= rulePureFunctionDefinition | this_PrimitivePureFunction_1= rulePrimitivePureFunction ) )
            // InternalFPML.g:1675:2: (this_PureFunctionDefinition_0= rulePureFunctionDefinition | this_PrimitivePureFunction_1= rulePrimitivePureFunction )
            {
            // InternalFPML.g:1675:2: (this_PureFunctionDefinition_0= rulePureFunctionDefinition | this_PrimitivePureFunction_1= rulePrimitivePureFunction )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            else if ( ((LA13_0>=21 && LA13_0<=22)||(LA13_0>=44 && LA13_0<=48)) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalFPML.g:1676:3: this_PureFunctionDefinition_0= rulePureFunctionDefinition
                    {

                    			newCompositeNode(grammarAccess.getPureFunctionAccess().getPureFunctionDefinitionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PureFunctionDefinition_0=rulePureFunctionDefinition();

                    state._fsp--;


                    			current = this_PureFunctionDefinition_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFPML.g:1685:3: this_PrimitivePureFunction_1= rulePrimitivePureFunction
                    {

                    			newCompositeNode(grammarAccess.getPureFunctionAccess().getPrimitivePureFunctionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrimitivePureFunction_1=rulePrimitivePureFunction();

                    state._fsp--;


                    			current = this_PrimitivePureFunction_1;
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
    // $ANTLR end "rulePureFunction"


    // $ANTLR start "entryRuleEffectFullFunction"
    // InternalFPML.g:1697:1: entryRuleEffectFullFunction returns [EObject current=null] : iv_ruleEffectFullFunction= ruleEffectFullFunction EOF ;
    public final EObject entryRuleEffectFullFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullFunction = null;


        try {
            // InternalFPML.g:1697:59: (iv_ruleEffectFullFunction= ruleEffectFullFunction EOF )
            // InternalFPML.g:1698:2: iv_ruleEffectFullFunction= ruleEffectFullFunction EOF
            {
             newCompositeNode(grammarAccess.getEffectFullFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEffectFullFunction=ruleEffectFullFunction();

            state._fsp--;

             current =iv_ruleEffectFullFunction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEffectFullFunction"


    // $ANTLR start "ruleEffectFullFunction"
    // InternalFPML.g:1704:1: ruleEffectFullFunction returns [EObject current=null] : (this_EffectFullFunctionDefinition_0= ruleEffectFullFunctionDefinition | this_PrimitiveEffectFullFunction_1= rulePrimitiveEffectFullFunction ) ;
    public final EObject ruleEffectFullFunction() throws RecognitionException {
        EObject current = null;

        EObject this_EffectFullFunctionDefinition_0 = null;

        EObject this_PrimitiveEffectFullFunction_1 = null;



        	enterRule();

        try {
            // InternalFPML.g:1710:2: ( (this_EffectFullFunctionDefinition_0= ruleEffectFullFunctionDefinition | this_PrimitiveEffectFullFunction_1= rulePrimitiveEffectFullFunction ) )
            // InternalFPML.g:1711:2: (this_EffectFullFunctionDefinition_0= ruleEffectFullFunctionDefinition | this_PrimitiveEffectFullFunction_1= rulePrimitiveEffectFullFunction )
            {
            // InternalFPML.g:1711:2: (this_EffectFullFunctionDefinition_0= ruleEffectFullFunctionDefinition | this_PrimitiveEffectFullFunction_1= rulePrimitiveEffectFullFunction )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            else if ( (LA14_0==49||LA14_0==51) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalFPML.g:1712:3: this_EffectFullFunctionDefinition_0= ruleEffectFullFunctionDefinition
                    {

                    			newCompositeNode(grammarAccess.getEffectFullFunctionAccess().getEffectFullFunctionDefinitionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EffectFullFunctionDefinition_0=ruleEffectFullFunctionDefinition();

                    state._fsp--;


                    			current = this_EffectFullFunctionDefinition_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFPML.g:1721:3: this_PrimitiveEffectFullFunction_1= rulePrimitiveEffectFullFunction
                    {

                    			newCompositeNode(grammarAccess.getEffectFullFunctionAccess().getPrimitiveEffectFullFunctionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrimitiveEffectFullFunction_1=rulePrimitiveEffectFullFunction();

                    state._fsp--;


                    			current = this_PrimitiveEffectFullFunction_1;
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
    // $ANTLR end "ruleEffectFullFunction"


    // $ANTLR start "entryRulePrimitiveFunction"
    // InternalFPML.g:1733:1: entryRulePrimitiveFunction returns [EObject current=null] : iv_rulePrimitiveFunction= rulePrimitiveFunction EOF ;
    public final EObject entryRulePrimitiveFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveFunction = null;


        try {
            // InternalFPML.g:1733:58: (iv_rulePrimitiveFunction= rulePrimitiveFunction EOF )
            // InternalFPML.g:1734:2: iv_rulePrimitiveFunction= rulePrimitiveFunction EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimitiveFunction=rulePrimitiveFunction();

            state._fsp--;

             current =iv_rulePrimitiveFunction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitiveFunction"


    // $ANTLR start "rulePrimitiveFunction"
    // InternalFPML.g:1740:1: rulePrimitiveFunction returns [EObject current=null] : (this_PrimitiveEffectFullFunction_0= rulePrimitiveEffectFullFunction | this_PrimitivePureFunction_1= rulePrimitivePureFunction ) ;
    public final EObject rulePrimitiveFunction() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveEffectFullFunction_0 = null;

        EObject this_PrimitivePureFunction_1 = null;



        	enterRule();

        try {
            // InternalFPML.g:1746:2: ( (this_PrimitiveEffectFullFunction_0= rulePrimitiveEffectFullFunction | this_PrimitivePureFunction_1= rulePrimitivePureFunction ) )
            // InternalFPML.g:1747:2: (this_PrimitiveEffectFullFunction_0= rulePrimitiveEffectFullFunction | this_PrimitivePureFunction_1= rulePrimitivePureFunction )
            {
            // InternalFPML.g:1747:2: (this_PrimitiveEffectFullFunction_0= rulePrimitiveEffectFullFunction | this_PrimitivePureFunction_1= rulePrimitivePureFunction )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==49||LA15_0==51) ) {
                alt15=1;
            }
            else if ( ((LA15_0>=21 && LA15_0<=22)||(LA15_0>=44 && LA15_0<=48)) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalFPML.g:1748:3: this_PrimitiveEffectFullFunction_0= rulePrimitiveEffectFullFunction
                    {

                    			newCompositeNode(grammarAccess.getPrimitiveFunctionAccess().getPrimitiveEffectFullFunctionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrimitiveEffectFullFunction_0=rulePrimitiveEffectFullFunction();

                    state._fsp--;


                    			current = this_PrimitiveEffectFullFunction_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFPML.g:1757:3: this_PrimitivePureFunction_1= rulePrimitivePureFunction
                    {

                    			newCompositeNode(grammarAccess.getPrimitiveFunctionAccess().getPrimitivePureFunctionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrimitivePureFunction_1=rulePrimitivePureFunction();

                    state._fsp--;


                    			current = this_PrimitivePureFunction_1;
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
    // $ANTLR end "rulePrimitiveFunction"


    // $ANTLR start "entryRuleEffectFullArgument"
    // InternalFPML.g:1769:1: entryRuleEffectFullArgument returns [EObject current=null] : iv_ruleEffectFullArgument= ruleEffectFullArgument EOF ;
    public final EObject entryRuleEffectFullArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullArgument = null;


        try {
            // InternalFPML.g:1769:59: (iv_ruleEffectFullArgument= ruleEffectFullArgument EOF )
            // InternalFPML.g:1770:2: iv_ruleEffectFullArgument= ruleEffectFullArgument EOF
            {
             newCompositeNode(grammarAccess.getEffectFullArgumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEffectFullArgument=ruleEffectFullArgument();

            state._fsp--;

             current =iv_ruleEffectFullArgument; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEffectFullArgument"


    // $ANTLR start "ruleEffectFullArgument"
    // InternalFPML.g:1776:1: ruleEffectFullArgument returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEffectFullArgument() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:1782:2: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalFPML.g:1783:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalFPML.g:1783:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalFPML.g:1784:3: ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalFPML.g:1784:3: ( (lv_type_0_0= ruleType ) )
            // InternalFPML.g:1785:4: (lv_type_0_0= ruleType )
            {
            // InternalFPML.g:1785:4: (lv_type_0_0= ruleType )
            // InternalFPML.g:1786:5: lv_type_0_0= ruleType
            {

            					newCompositeNode(grammarAccess.getEffectFullArgumentAccess().getTypeTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_20);
            lv_type_0_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEffectFullArgumentRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"it.unibo.FPML.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFPML.g:1803:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFPML.g:1804:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFPML.g:1804:4: (lv_name_1_0= RULE_ID )
            // InternalFPML.g:1805:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEffectFullArgumentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEffectFullArgumentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
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
    // $ANTLR end "ruleEffectFullArgument"


    // $ANTLR start "entryRuleArgument"
    // InternalFPML.g:1825:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // InternalFPML.g:1825:49: (iv_ruleArgument= ruleArgument EOF )
            // InternalFPML.g:1826:2: iv_ruleArgument= ruleArgument EOF
            {
             newCompositeNode(grammarAccess.getArgumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArgument=ruleArgument();

            state._fsp--;

             current =iv_ruleArgument; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArgument"


    // $ANTLR start "ruleArgument"
    // InternalFPML.g:1832:1: ruleArgument returns [EObject current=null] : ( ( (lv_type_0_0= ruleValueType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:1838:2: ( ( ( (lv_type_0_0= ruleValueType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalFPML.g:1839:2: ( ( (lv_type_0_0= ruleValueType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalFPML.g:1839:2: ( ( (lv_type_0_0= ruleValueType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalFPML.g:1840:3: ( (lv_type_0_0= ruleValueType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalFPML.g:1840:3: ( (lv_type_0_0= ruleValueType ) )
            // InternalFPML.g:1841:4: (lv_type_0_0= ruleValueType )
            {
            // InternalFPML.g:1841:4: (lv_type_0_0= ruleValueType )
            // InternalFPML.g:1842:5: lv_type_0_0= ruleValueType
            {

            					newCompositeNode(grammarAccess.getArgumentAccess().getTypeValueTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_20);
            lv_type_0_0=ruleValueType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArgumentRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"it.unibo.FPML.ValueType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFPML.g:1859:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFPML.g:1860:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFPML.g:1860:4: (lv_name_1_0= RULE_ID )
            // InternalFPML.g:1861:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getArgumentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArgumentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
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
    // $ANTLR end "ruleArgument"


    // $ANTLR start "entryRuleFunctionBodyPure"
    // InternalFPML.g:1881:1: entryRuleFunctionBodyPure returns [EObject current=null] : iv_ruleFunctionBodyPure= ruleFunctionBodyPure EOF ;
    public final EObject entryRuleFunctionBodyPure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionBodyPure = null;


        try {
            // InternalFPML.g:1881:57: (iv_ruleFunctionBodyPure= ruleFunctionBodyPure EOF )
            // InternalFPML.g:1882:2: iv_ruleFunctionBodyPure= ruleFunctionBodyPure EOF
            {
             newCompositeNode(grammarAccess.getFunctionBodyPureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionBodyPure=ruleFunctionBodyPure();

            state._fsp--;

             current =iv_ruleFunctionBodyPure; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionBodyPure"


    // $ANTLR start "ruleFunctionBodyPure"
    // InternalFPML.g:1888:1: ruleFunctionBodyPure returns [EObject current=null] : (this_EmptyFunctionBody_0= ruleEmptyFunctionBody | this_CompositionFunctionBodyPure_1= ruleCompositionFunctionBodyPure ) ;
    public final EObject ruleFunctionBodyPure() throws RecognitionException {
        EObject current = null;

        EObject this_EmptyFunctionBody_0 = null;

        EObject this_CompositionFunctionBodyPure_1 = null;



        	enterRule();

        try {
            // InternalFPML.g:1894:2: ( (this_EmptyFunctionBody_0= ruleEmptyFunctionBody | this_CompositionFunctionBodyPure_1= ruleCompositionFunctionBodyPure ) )
            // InternalFPML.g:1895:2: (this_EmptyFunctionBody_0= ruleEmptyFunctionBody | this_CompositionFunctionBodyPure_1= ruleCompositionFunctionBodyPure )
            {
            // InternalFPML.g:1895:2: (this_EmptyFunctionBody_0= ruleEmptyFunctionBody | this_CompositionFunctionBodyPure_1= ruleCompositionFunctionBodyPure )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_ID||(LA16_0>=21 && LA16_0<=22)||(LA16_0>=44 && LA16_0<=48)) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalFPML.g:1896:3: this_EmptyFunctionBody_0= ruleEmptyFunctionBody
                    {

                    			newCompositeNode(grammarAccess.getFunctionBodyPureAccess().getEmptyFunctionBodyParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EmptyFunctionBody_0=ruleEmptyFunctionBody();

                    state._fsp--;


                    			current = this_EmptyFunctionBody_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFPML.g:1905:3: this_CompositionFunctionBodyPure_1= ruleCompositionFunctionBodyPure
                    {

                    			newCompositeNode(grammarAccess.getFunctionBodyPureAccess().getCompositionFunctionBodyPureParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CompositionFunctionBodyPure_1=ruleCompositionFunctionBodyPure();

                    state._fsp--;


                    			current = this_CompositionFunctionBodyPure_1;
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
    // $ANTLR end "ruleFunctionBodyPure"


    // $ANTLR start "entryRuleFunctionBodyEffectFull"
    // InternalFPML.g:1917:1: entryRuleFunctionBodyEffectFull returns [EObject current=null] : iv_ruleFunctionBodyEffectFull= ruleFunctionBodyEffectFull EOF ;
    public final EObject entryRuleFunctionBodyEffectFull() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionBodyEffectFull = null;


        try {
            // InternalFPML.g:1917:63: (iv_ruleFunctionBodyEffectFull= ruleFunctionBodyEffectFull EOF )
            // InternalFPML.g:1918:2: iv_ruleFunctionBodyEffectFull= ruleFunctionBodyEffectFull EOF
            {
             newCompositeNode(grammarAccess.getFunctionBodyEffectFullRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionBodyEffectFull=ruleFunctionBodyEffectFull();

            state._fsp--;

             current =iv_ruleFunctionBodyEffectFull; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionBodyEffectFull"


    // $ANTLR start "ruleFunctionBodyEffectFull"
    // InternalFPML.g:1924:1: ruleFunctionBodyEffectFull returns [EObject current=null] : (this_EmptyFunctionBody_0= ruleEmptyFunctionBody | this_CompositionFunctionBodyEffect_1= ruleCompositionFunctionBodyEffect ) ;
    public final EObject ruleFunctionBodyEffectFull() throws RecognitionException {
        EObject current = null;

        EObject this_EmptyFunctionBody_0 = null;

        EObject this_CompositionFunctionBodyEffect_1 = null;



        	enterRule();

        try {
            // InternalFPML.g:1930:2: ( (this_EmptyFunctionBody_0= ruleEmptyFunctionBody | this_CompositionFunctionBodyEffect_1= ruleCompositionFunctionBodyEffect ) )
            // InternalFPML.g:1931:2: (this_EmptyFunctionBody_0= ruleEmptyFunctionBody | this_CompositionFunctionBodyEffect_1= ruleCompositionFunctionBodyEffect )
            {
            // InternalFPML.g:1931:2: (this_EmptyFunctionBody_0= ruleEmptyFunctionBody | this_CompositionFunctionBodyEffect_1= ruleCompositionFunctionBodyEffect )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==29) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_ID||(LA17_0>=21 && LA17_0<=22)||(LA17_0>=44 && LA17_0<=49)||LA17_0==51) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalFPML.g:1932:3: this_EmptyFunctionBody_0= ruleEmptyFunctionBody
                    {

                    			newCompositeNode(grammarAccess.getFunctionBodyEffectFullAccess().getEmptyFunctionBodyParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EmptyFunctionBody_0=ruleEmptyFunctionBody();

                    state._fsp--;


                    			current = this_EmptyFunctionBody_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFPML.g:1941:3: this_CompositionFunctionBodyEffect_1= ruleCompositionFunctionBodyEffect
                    {

                    			newCompositeNode(grammarAccess.getFunctionBodyEffectFullAccess().getCompositionFunctionBodyEffectParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CompositionFunctionBodyEffect_1=ruleCompositionFunctionBodyEffect();

                    state._fsp--;


                    			current = this_CompositionFunctionBodyEffect_1;
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
    // $ANTLR end "ruleFunctionBodyEffectFull"


    // $ANTLR start "entryRuleEmptyFunctionBody"
    // InternalFPML.g:1953:1: entryRuleEmptyFunctionBody returns [EObject current=null] : iv_ruleEmptyFunctionBody= ruleEmptyFunctionBody EOF ;
    public final EObject entryRuleEmptyFunctionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmptyFunctionBody = null;


        try {
            // InternalFPML.g:1953:58: (iv_ruleEmptyFunctionBody= ruleEmptyFunctionBody EOF )
            // InternalFPML.g:1954:2: iv_ruleEmptyFunctionBody= ruleEmptyFunctionBody EOF
            {
             newCompositeNode(grammarAccess.getEmptyFunctionBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEmptyFunctionBody=ruleEmptyFunctionBody();

            state._fsp--;

             current =iv_ruleEmptyFunctionBody; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEmptyFunctionBody"


    // $ANTLR start "ruleEmptyFunctionBody"
    // InternalFPML.g:1960:1: ruleEmptyFunctionBody returns [EObject current=null] : ( () otherlv_1= 'Undefined' ) ;
    public final EObject ruleEmptyFunctionBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFPML.g:1966:2: ( ( () otherlv_1= 'Undefined' ) )
            // InternalFPML.g:1967:2: ( () otherlv_1= 'Undefined' )
            {
            // InternalFPML.g:1967:2: ( () otherlv_1= 'Undefined' )
            // InternalFPML.g:1968:3: () otherlv_1= 'Undefined'
            {
            // InternalFPML.g:1968:3: ()
            // InternalFPML.g:1969:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEmptyFunctionBodyAccess().getEmptyFunctionBodyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getEmptyFunctionBodyAccess().getUndefinedKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEmptyFunctionBody"


    // $ANTLR start "entryRuleCompositionFunctionBodyPure"
    // InternalFPML.g:1983:1: entryRuleCompositionFunctionBodyPure returns [EObject current=null] : iv_ruleCompositionFunctionBodyPure= ruleCompositionFunctionBodyPure EOF ;
    public final EObject entryRuleCompositionFunctionBodyPure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositionFunctionBodyPure = null;


        try {
            // InternalFPML.g:1983:68: (iv_ruleCompositionFunctionBodyPure= ruleCompositionFunctionBodyPure EOF )
            // InternalFPML.g:1984:2: iv_ruleCompositionFunctionBodyPure= ruleCompositionFunctionBodyPure EOF
            {
             newCompositeNode(grammarAccess.getCompositionFunctionBodyPureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompositionFunctionBodyPure=ruleCompositionFunctionBodyPure();

            state._fsp--;

             current =iv_ruleCompositionFunctionBodyPure; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompositionFunctionBodyPure"


    // $ANTLR start "ruleCompositionFunctionBodyPure"
    // InternalFPML.g:1990:1: ruleCompositionFunctionBodyPure returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_functionChain_1_0= ruleCompositionFunctionBodyPureFactor ) )+ ) | ( ( (lv_primitiveElement_2_0= rulePrimitivePureFunction ) ) ( (lv_functionChain_3_0= ruleCompositionFunctionBodyPureFactor ) )+ ) ) ;
    public final EObject ruleCompositionFunctionBodyPure() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_functionChain_1_0 = null;

        EObject lv_primitiveElement_2_0 = null;

        EObject lv_functionChain_3_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:1996:2: ( ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_functionChain_1_0= ruleCompositionFunctionBodyPureFactor ) )+ ) | ( ( (lv_primitiveElement_2_0= rulePrimitivePureFunction ) ) ( (lv_functionChain_3_0= ruleCompositionFunctionBodyPureFactor ) )+ ) ) )
            // InternalFPML.g:1997:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_functionChain_1_0= ruleCompositionFunctionBodyPureFactor ) )+ ) | ( ( (lv_primitiveElement_2_0= rulePrimitivePureFunction ) ) ( (lv_functionChain_3_0= ruleCompositionFunctionBodyPureFactor ) )+ ) )
            {
            // InternalFPML.g:1997:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_functionChain_1_0= ruleCompositionFunctionBodyPureFactor ) )+ ) | ( ( (lv_primitiveElement_2_0= rulePrimitivePureFunction ) ) ( (lv_functionChain_3_0= ruleCompositionFunctionBodyPureFactor ) )+ ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                alt20=1;
            }
            else if ( ((LA20_0>=21 && LA20_0<=22)||(LA20_0>=44 && LA20_0<=48)) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalFPML.g:1998:3: ( ( (otherlv_0= RULE_ID ) ) ( (lv_functionChain_1_0= ruleCompositionFunctionBodyPureFactor ) )+ )
                    {
                    // InternalFPML.g:1998:3: ( ( (otherlv_0= RULE_ID ) ) ( (lv_functionChain_1_0= ruleCompositionFunctionBodyPureFactor ) )+ )
                    // InternalFPML.g:1999:4: ( (otherlv_0= RULE_ID ) ) ( (lv_functionChain_1_0= ruleCompositionFunctionBodyPureFactor ) )+
                    {
                    // InternalFPML.g:1999:4: ( (otherlv_0= RULE_ID ) )
                    // InternalFPML.g:2000:5: (otherlv_0= RULE_ID )
                    {
                    // InternalFPML.g:2000:5: (otherlv_0= RULE_ID )
                    // InternalFPML.g:2001:6: otherlv_0= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCompositionFunctionBodyPureRule());
                    						}
                    					
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_29); 

                    						newLeafNode(otherlv_0, grammarAccess.getCompositionFunctionBodyPureAccess().getReferenceElementPureFunctionDefinitionCrossReference_0_0_0());
                    					

                    }


                    }

                    // InternalFPML.g:2012:4: ( (lv_functionChain_1_0= ruleCompositionFunctionBodyPureFactor ) )+
                    int cnt18=0;
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==30) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalFPML.g:2013:5: (lv_functionChain_1_0= ruleCompositionFunctionBodyPureFactor )
                    	    {
                    	    // InternalFPML.g:2013:5: (lv_functionChain_1_0= ruleCompositionFunctionBodyPureFactor )
                    	    // InternalFPML.g:2014:6: lv_functionChain_1_0= ruleCompositionFunctionBodyPureFactor
                    	    {

                    	    						newCompositeNode(grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainCompositionFunctionBodyPureFactorParserRuleCall_0_1_0());
                    	    					
                    	    pushFollow(FOLLOW_30);
                    	    lv_functionChain_1_0=ruleCompositionFunctionBodyPureFactor();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getCompositionFunctionBodyPureRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"functionChain",
                    	    							lv_functionChain_1_0,
                    	    							"it.unibo.FPML.CompositionFunctionBodyPureFactor");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt18 >= 1 ) break loop18;
                                EarlyExitException eee =
                                    new EarlyExitException(18, input);
                                throw eee;
                        }
                        cnt18++;
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalFPML.g:2033:3: ( ( (lv_primitiveElement_2_0= rulePrimitivePureFunction ) ) ( (lv_functionChain_3_0= ruleCompositionFunctionBodyPureFactor ) )+ )
                    {
                    // InternalFPML.g:2033:3: ( ( (lv_primitiveElement_2_0= rulePrimitivePureFunction ) ) ( (lv_functionChain_3_0= ruleCompositionFunctionBodyPureFactor ) )+ )
                    // InternalFPML.g:2034:4: ( (lv_primitiveElement_2_0= rulePrimitivePureFunction ) ) ( (lv_functionChain_3_0= ruleCompositionFunctionBodyPureFactor ) )+
                    {
                    // InternalFPML.g:2034:4: ( (lv_primitiveElement_2_0= rulePrimitivePureFunction ) )
                    // InternalFPML.g:2035:5: (lv_primitiveElement_2_0= rulePrimitivePureFunction )
                    {
                    // InternalFPML.g:2035:5: (lv_primitiveElement_2_0= rulePrimitivePureFunction )
                    // InternalFPML.g:2036:6: lv_primitiveElement_2_0= rulePrimitivePureFunction
                    {

                    						newCompositeNode(grammarAccess.getCompositionFunctionBodyPureAccess().getPrimitiveElementPrimitivePureFunctionParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_primitiveElement_2_0=rulePrimitivePureFunction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompositionFunctionBodyPureRule());
                    						}
                    						set(
                    							current,
                    							"primitiveElement",
                    							lv_primitiveElement_2_0,
                    							"it.unibo.FPML.PrimitivePureFunction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFPML.g:2053:4: ( (lv_functionChain_3_0= ruleCompositionFunctionBodyPureFactor ) )+
                    int cnt19=0;
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==30) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalFPML.g:2054:5: (lv_functionChain_3_0= ruleCompositionFunctionBodyPureFactor )
                    	    {
                    	    // InternalFPML.g:2054:5: (lv_functionChain_3_0= ruleCompositionFunctionBodyPureFactor )
                    	    // InternalFPML.g:2055:6: lv_functionChain_3_0= ruleCompositionFunctionBodyPureFactor
                    	    {

                    	    						newCompositeNode(grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainCompositionFunctionBodyPureFactorParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_30);
                    	    lv_functionChain_3_0=ruleCompositionFunctionBodyPureFactor();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getCompositionFunctionBodyPureRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"functionChain",
                    	    							lv_functionChain_3_0,
                    	    							"it.unibo.FPML.CompositionFunctionBodyPureFactor");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt19 >= 1 ) break loop19;
                                EarlyExitException eee =
                                    new EarlyExitException(19, input);
                                throw eee;
                        }
                        cnt19++;
                    } while (true);


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
    // $ANTLR end "ruleCompositionFunctionBodyPure"


    // $ANTLR start "entryRuleCompositionFunctionBodyPureFactor"
    // InternalFPML.g:2077:1: entryRuleCompositionFunctionBodyPureFactor returns [EObject current=null] : iv_ruleCompositionFunctionBodyPureFactor= ruleCompositionFunctionBodyPureFactor EOF ;
    public final EObject entryRuleCompositionFunctionBodyPureFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositionFunctionBodyPureFactor = null;


        try {
            // InternalFPML.g:2077:74: (iv_ruleCompositionFunctionBodyPureFactor= ruleCompositionFunctionBodyPureFactor EOF )
            // InternalFPML.g:2078:2: iv_ruleCompositionFunctionBodyPureFactor= ruleCompositionFunctionBodyPureFactor EOF
            {
             newCompositeNode(grammarAccess.getCompositionFunctionBodyPureFactorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompositionFunctionBodyPureFactor=ruleCompositionFunctionBodyPureFactor();

            state._fsp--;

             current =iv_ruleCompositionFunctionBodyPureFactor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompositionFunctionBodyPureFactor"


    // $ANTLR start "ruleCompositionFunctionBodyPureFactor"
    // InternalFPML.g:2084:1: ruleCompositionFunctionBodyPureFactor returns [EObject current=null] : ( (otherlv_0= '|>' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= '|>' ( (lv_PrimitiveElement_3_0= rulePrimitivePureFunction ) ) ) ) ;
    public final EObject ruleCompositionFunctionBodyPureFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_PrimitiveElement_3_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:2090:2: ( ( (otherlv_0= '|>' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= '|>' ( (lv_PrimitiveElement_3_0= rulePrimitivePureFunction ) ) ) ) )
            // InternalFPML.g:2091:2: ( (otherlv_0= '|>' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= '|>' ( (lv_PrimitiveElement_3_0= rulePrimitivePureFunction ) ) ) )
            {
            // InternalFPML.g:2091:2: ( (otherlv_0= '|>' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= '|>' ( (lv_PrimitiveElement_3_0= rulePrimitivePureFunction ) ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==30) ) {
                int LA21_1 = input.LA(2);

                if ( ((LA21_1>=21 && LA21_1<=22)||(LA21_1>=44 && LA21_1<=48)) ) {
                    alt21=2;
                }
                else if ( (LA21_1==RULE_ID) ) {
                    alt21=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalFPML.g:2092:3: (otherlv_0= '|>' ( (otherlv_1= RULE_ID ) ) )
                    {
                    // InternalFPML.g:2092:3: (otherlv_0= '|>' ( (otherlv_1= RULE_ID ) ) )
                    // InternalFPML.g:2093:4: otherlv_0= '|>' ( (otherlv_1= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,30,FOLLOW_20); 

                    				newLeafNode(otherlv_0, grammarAccess.getCompositionFunctionBodyPureFactorAccess().getVerticalLineGreaterThanSignKeyword_0_0());
                    			
                    // InternalFPML.g:2097:4: ( (otherlv_1= RULE_ID ) )
                    // InternalFPML.g:2098:5: (otherlv_1= RULE_ID )
                    {
                    // InternalFPML.g:2098:5: (otherlv_1= RULE_ID )
                    // InternalFPML.g:2099:6: otherlv_1= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCompositionFunctionBodyPureFactorRule());
                    						}
                    					
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_1, grammarAccess.getCompositionFunctionBodyPureFactorAccess().getReferenceElementPureFunctionDefinitionCrossReference_0_1_0());
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFPML.g:2112:3: (otherlv_2= '|>' ( (lv_PrimitiveElement_3_0= rulePrimitivePureFunction ) ) )
                    {
                    // InternalFPML.g:2112:3: (otherlv_2= '|>' ( (lv_PrimitiveElement_3_0= rulePrimitivePureFunction ) ) )
                    // InternalFPML.g:2113:4: otherlv_2= '|>' ( (lv_PrimitiveElement_3_0= rulePrimitivePureFunction ) )
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_24); 

                    				newLeafNode(otherlv_2, grammarAccess.getCompositionFunctionBodyPureFactorAccess().getVerticalLineGreaterThanSignKeyword_1_0());
                    			
                    // InternalFPML.g:2117:4: ( (lv_PrimitiveElement_3_0= rulePrimitivePureFunction ) )
                    // InternalFPML.g:2118:5: (lv_PrimitiveElement_3_0= rulePrimitivePureFunction )
                    {
                    // InternalFPML.g:2118:5: (lv_PrimitiveElement_3_0= rulePrimitivePureFunction )
                    // InternalFPML.g:2119:6: lv_PrimitiveElement_3_0= rulePrimitivePureFunction
                    {

                    						newCompositeNode(grammarAccess.getCompositionFunctionBodyPureFactorAccess().getPrimitiveElementPrimitivePureFunctionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_PrimitiveElement_3_0=rulePrimitivePureFunction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompositionFunctionBodyPureFactorRule());
                    						}
                    						set(
                    							current,
                    							"PrimitiveElement",
                    							lv_PrimitiveElement_3_0,
                    							"it.unibo.FPML.PrimitivePureFunction");
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
    // $ANTLR end "ruleCompositionFunctionBodyPureFactor"


    // $ANTLR start "entryRuleCompositionFunctionBodyEffect"
    // InternalFPML.g:2141:1: entryRuleCompositionFunctionBodyEffect returns [EObject current=null] : iv_ruleCompositionFunctionBodyEffect= ruleCompositionFunctionBodyEffect EOF ;
    public final EObject entryRuleCompositionFunctionBodyEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositionFunctionBodyEffect = null;


        try {
            // InternalFPML.g:2141:70: (iv_ruleCompositionFunctionBodyEffect= ruleCompositionFunctionBodyEffect EOF )
            // InternalFPML.g:2142:2: iv_ruleCompositionFunctionBodyEffect= ruleCompositionFunctionBodyEffect EOF
            {
             newCompositeNode(grammarAccess.getCompositionFunctionBodyEffectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompositionFunctionBodyEffect=ruleCompositionFunctionBodyEffect();

            state._fsp--;

             current =iv_ruleCompositionFunctionBodyEffect; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompositionFunctionBodyEffect"


    // $ANTLR start "ruleCompositionFunctionBodyEffect"
    // InternalFPML.g:2148:1: ruleCompositionFunctionBodyEffect returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_functionChain_1_0= ruleCompositionFunctionBodyEffectFullFactor ) )+ ) | ( ( (lv_primitiveElement_2_0= rulePrimitiveFunction ) ) ( (lv_functionChain_3_0= ruleCompositionFunctionBodyEffectFullFactor ) )+ ) ) ;
    public final EObject ruleCompositionFunctionBodyEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_functionChain_1_0 = null;

        EObject lv_primitiveElement_2_0 = null;

        EObject lv_functionChain_3_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:2154:2: ( ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_functionChain_1_0= ruleCompositionFunctionBodyEffectFullFactor ) )+ ) | ( ( (lv_primitiveElement_2_0= rulePrimitiveFunction ) ) ( (lv_functionChain_3_0= ruleCompositionFunctionBodyEffectFullFactor ) )+ ) ) )
            // InternalFPML.g:2155:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_functionChain_1_0= ruleCompositionFunctionBodyEffectFullFactor ) )+ ) | ( ( (lv_primitiveElement_2_0= rulePrimitiveFunction ) ) ( (lv_functionChain_3_0= ruleCompositionFunctionBodyEffectFullFactor ) )+ ) )
            {
            // InternalFPML.g:2155:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_functionChain_1_0= ruleCompositionFunctionBodyEffectFullFactor ) )+ ) | ( ( (lv_primitiveElement_2_0= rulePrimitiveFunction ) ) ( (lv_functionChain_3_0= ruleCompositionFunctionBodyEffectFullFactor ) )+ ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            else if ( ((LA24_0>=21 && LA24_0<=22)||(LA24_0>=44 && LA24_0<=49)||LA24_0==51) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalFPML.g:2156:3: ( ( (otherlv_0= RULE_ID ) ) ( (lv_functionChain_1_0= ruleCompositionFunctionBodyEffectFullFactor ) )+ )
                    {
                    // InternalFPML.g:2156:3: ( ( (otherlv_0= RULE_ID ) ) ( (lv_functionChain_1_0= ruleCompositionFunctionBodyEffectFullFactor ) )+ )
                    // InternalFPML.g:2157:4: ( (otherlv_0= RULE_ID ) ) ( (lv_functionChain_1_0= ruleCompositionFunctionBodyEffectFullFactor ) )+
                    {
                    // InternalFPML.g:2157:4: ( (otherlv_0= RULE_ID ) )
                    // InternalFPML.g:2158:5: (otherlv_0= RULE_ID )
                    {
                    // InternalFPML.g:2158:5: (otherlv_0= RULE_ID )
                    // InternalFPML.g:2159:6: otherlv_0= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCompositionFunctionBodyEffectRule());
                    						}
                    					
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_31); 

                    						newLeafNode(otherlv_0, grammarAccess.getCompositionFunctionBodyEffectAccess().getReferenceElementEffectFullReferenceCrossReference_0_0_0());
                    					

                    }


                    }

                    // InternalFPML.g:2170:4: ( (lv_functionChain_1_0= ruleCompositionFunctionBodyEffectFullFactor ) )+
                    int cnt22=0;
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==31) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalFPML.g:2171:5: (lv_functionChain_1_0= ruleCompositionFunctionBodyEffectFullFactor )
                    	    {
                    	    // InternalFPML.g:2171:5: (lv_functionChain_1_0= ruleCompositionFunctionBodyEffectFullFactor )
                    	    // InternalFPML.g:2172:6: lv_functionChain_1_0= ruleCompositionFunctionBodyEffectFullFactor
                    	    {

                    	    						newCompositeNode(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainCompositionFunctionBodyEffectFullFactorParserRuleCall_0_1_0());
                    	    					
                    	    pushFollow(FOLLOW_32);
                    	    lv_functionChain_1_0=ruleCompositionFunctionBodyEffectFullFactor();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getCompositionFunctionBodyEffectRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"functionChain",
                    	    							lv_functionChain_1_0,
                    	    							"it.unibo.FPML.CompositionFunctionBodyEffectFullFactor");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt22 >= 1 ) break loop22;
                                EarlyExitException eee =
                                    new EarlyExitException(22, input);
                                throw eee;
                        }
                        cnt22++;
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalFPML.g:2191:3: ( ( (lv_primitiveElement_2_0= rulePrimitiveFunction ) ) ( (lv_functionChain_3_0= ruleCompositionFunctionBodyEffectFullFactor ) )+ )
                    {
                    // InternalFPML.g:2191:3: ( ( (lv_primitiveElement_2_0= rulePrimitiveFunction ) ) ( (lv_functionChain_3_0= ruleCompositionFunctionBodyEffectFullFactor ) )+ )
                    // InternalFPML.g:2192:4: ( (lv_primitiveElement_2_0= rulePrimitiveFunction ) ) ( (lv_functionChain_3_0= ruleCompositionFunctionBodyEffectFullFactor ) )+
                    {
                    // InternalFPML.g:2192:4: ( (lv_primitiveElement_2_0= rulePrimitiveFunction ) )
                    // InternalFPML.g:2193:5: (lv_primitiveElement_2_0= rulePrimitiveFunction )
                    {
                    // InternalFPML.g:2193:5: (lv_primitiveElement_2_0= rulePrimitiveFunction )
                    // InternalFPML.g:2194:6: lv_primitiveElement_2_0= rulePrimitiveFunction
                    {

                    						newCompositeNode(grammarAccess.getCompositionFunctionBodyEffectAccess().getPrimitiveElementPrimitiveFunctionParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_primitiveElement_2_0=rulePrimitiveFunction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompositionFunctionBodyEffectRule());
                    						}
                    						set(
                    							current,
                    							"primitiveElement",
                    							lv_primitiveElement_2_0,
                    							"it.unibo.FPML.PrimitiveFunction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFPML.g:2211:4: ( (lv_functionChain_3_0= ruleCompositionFunctionBodyEffectFullFactor ) )+
                    int cnt23=0;
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==31) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalFPML.g:2212:5: (lv_functionChain_3_0= ruleCompositionFunctionBodyEffectFullFactor )
                    	    {
                    	    // InternalFPML.g:2212:5: (lv_functionChain_3_0= ruleCompositionFunctionBodyEffectFullFactor )
                    	    // InternalFPML.g:2213:6: lv_functionChain_3_0= ruleCompositionFunctionBodyEffectFullFactor
                    	    {

                    	    						newCompositeNode(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainCompositionFunctionBodyEffectFullFactorParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_32);
                    	    lv_functionChain_3_0=ruleCompositionFunctionBodyEffectFullFactor();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getCompositionFunctionBodyEffectRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"functionChain",
                    	    							lv_functionChain_3_0,
                    	    							"it.unibo.FPML.CompositionFunctionBodyEffectFullFactor");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt23 >= 1 ) break loop23;
                                EarlyExitException eee =
                                    new EarlyExitException(23, input);
                                throw eee;
                        }
                        cnt23++;
                    } while (true);


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
    // $ANTLR end "ruleCompositionFunctionBodyEffect"


    // $ANTLR start "entryRuleCompositionFunctionBodyEffectFullFactor"
    // InternalFPML.g:2235:1: entryRuleCompositionFunctionBodyEffectFullFactor returns [EObject current=null] : iv_ruleCompositionFunctionBodyEffectFullFactor= ruleCompositionFunctionBodyEffectFullFactor EOF ;
    public final EObject entryRuleCompositionFunctionBodyEffectFullFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositionFunctionBodyEffectFullFactor = null;


        try {
            // InternalFPML.g:2235:80: (iv_ruleCompositionFunctionBodyEffectFullFactor= ruleCompositionFunctionBodyEffectFullFactor EOF )
            // InternalFPML.g:2236:2: iv_ruleCompositionFunctionBodyEffectFullFactor= ruleCompositionFunctionBodyEffectFullFactor EOF
            {
             newCompositeNode(grammarAccess.getCompositionFunctionBodyEffectFullFactorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompositionFunctionBodyEffectFullFactor=ruleCompositionFunctionBodyEffectFullFactor();

            state._fsp--;

             current =iv_ruleCompositionFunctionBodyEffectFullFactor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompositionFunctionBodyEffectFullFactor"


    // $ANTLR start "ruleCompositionFunctionBodyEffectFullFactor"
    // InternalFPML.g:2242:1: ruleCompositionFunctionBodyEffectFullFactor returns [EObject current=null] : ( (otherlv_0= '>>=' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= '>>=' ( (lv_PrimitiveElement_3_0= rulePrimitiveFunction ) ) ) ) ;
    public final EObject ruleCompositionFunctionBodyEffectFullFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_PrimitiveElement_3_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:2248:2: ( ( (otherlv_0= '>>=' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= '>>=' ( (lv_PrimitiveElement_3_0= rulePrimitiveFunction ) ) ) ) )
            // InternalFPML.g:2249:2: ( (otherlv_0= '>>=' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= '>>=' ( (lv_PrimitiveElement_3_0= rulePrimitiveFunction ) ) ) )
            {
            // InternalFPML.g:2249:2: ( (otherlv_0= '>>=' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= '>>=' ( (lv_PrimitiveElement_3_0= rulePrimitiveFunction ) ) ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==31) ) {
                int LA25_1 = input.LA(2);

                if ( ((LA25_1>=21 && LA25_1<=22)||(LA25_1>=44 && LA25_1<=49)||LA25_1==51) ) {
                    alt25=2;
                }
                else if ( (LA25_1==RULE_ID) ) {
                    alt25=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalFPML.g:2250:3: (otherlv_0= '>>=' ( (otherlv_1= RULE_ID ) ) )
                    {
                    // InternalFPML.g:2250:3: (otherlv_0= '>>=' ( (otherlv_1= RULE_ID ) ) )
                    // InternalFPML.g:2251:4: otherlv_0= '>>=' ( (otherlv_1= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,31,FOLLOW_20); 

                    				newLeafNode(otherlv_0, grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getGreaterThanSignGreaterThanSignEqualsSignKeyword_0_0());
                    			
                    // InternalFPML.g:2255:4: ( (otherlv_1= RULE_ID ) )
                    // InternalFPML.g:2256:5: (otherlv_1= RULE_ID )
                    {
                    // InternalFPML.g:2256:5: (otherlv_1= RULE_ID )
                    // InternalFPML.g:2257:6: otherlv_1= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCompositionFunctionBodyEffectFullFactorRule());
                    						}
                    					
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_1, grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getReferenceElementEffectFullReferenceCrossReference_0_1_0());
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFPML.g:2270:3: (otherlv_2= '>>=' ( (lv_PrimitiveElement_3_0= rulePrimitiveFunction ) ) )
                    {
                    // InternalFPML.g:2270:3: (otherlv_2= '>>=' ( (lv_PrimitiveElement_3_0= rulePrimitiveFunction ) ) )
                    // InternalFPML.g:2271:4: otherlv_2= '>>=' ( (lv_PrimitiveElement_3_0= rulePrimitiveFunction ) )
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_24); 

                    				newLeafNode(otherlv_2, grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getGreaterThanSignGreaterThanSignEqualsSignKeyword_1_0());
                    			
                    // InternalFPML.g:2275:4: ( (lv_PrimitiveElement_3_0= rulePrimitiveFunction ) )
                    // InternalFPML.g:2276:5: (lv_PrimitiveElement_3_0= rulePrimitiveFunction )
                    {
                    // InternalFPML.g:2276:5: (lv_PrimitiveElement_3_0= rulePrimitiveFunction )
                    // InternalFPML.g:2277:6: lv_PrimitiveElement_3_0= rulePrimitiveFunction
                    {

                    						newCompositeNode(grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getPrimitiveElementPrimitiveFunctionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_PrimitiveElement_3_0=rulePrimitiveFunction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompositionFunctionBodyEffectFullFactorRule());
                    						}
                    						set(
                    							current,
                    							"PrimitiveElement",
                    							lv_PrimitiveElement_3_0,
                    							"it.unibo.FPML.PrimitiveFunction");
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
    // $ANTLR end "ruleCompositionFunctionBodyEffectFullFactor"


    // $ANTLR start "entryRuleIOType"
    // InternalFPML.g:2299:1: entryRuleIOType returns [EObject current=null] : iv_ruleIOType= ruleIOType EOF ;
    public final EObject entryRuleIOType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIOType = null;


        try {
            // InternalFPML.g:2299:47: (iv_ruleIOType= ruleIOType EOF )
            // InternalFPML.g:2300:2: iv_ruleIOType= ruleIOType EOF
            {
             newCompositeNode(grammarAccess.getIOTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIOType=ruleIOType();

            state._fsp--;

             current =iv_ruleIOType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIOType"


    // $ANTLR start "ruleIOType"
    // InternalFPML.g:2306:1: ruleIOType returns [EObject current=null] : (otherlv_0= 'IO' ( (lv_type_1_0= ruleType ) ) ) ;
    public final EObject ruleIOType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:2312:2: ( (otherlv_0= 'IO' ( (lv_type_1_0= ruleType ) ) ) )
            // InternalFPML.g:2313:2: (otherlv_0= 'IO' ( (lv_type_1_0= ruleType ) ) )
            {
            // InternalFPML.g:2313:2: (otherlv_0= 'IO' ( (lv_type_1_0= ruleType ) ) )
            // InternalFPML.g:2314:3: otherlv_0= 'IO' ( (lv_type_1_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getIOTypeAccess().getIOKeyword_0());
            		
            // InternalFPML.g:2318:3: ( (lv_type_1_0= ruleType ) )
            // InternalFPML.g:2319:4: (lv_type_1_0= ruleType )
            {
            // InternalFPML.g:2319:4: (lv_type_1_0= ruleType )
            // InternalFPML.g:2320:5: lv_type_1_0= ruleType
            {

            					newCompositeNode(grammarAccess.getIOTypeAccess().getTypeTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_1_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIOTypeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"it.unibo.FPML.Type");
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
    // $ANTLR end "ruleIOType"


    // $ANTLR start "entryRuleValueType"
    // InternalFPML.g:2341:1: entryRuleValueType returns [EObject current=null] : iv_ruleValueType= ruleValueType EOF ;
    public final EObject entryRuleValueType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueType = null;


        try {
            // InternalFPML.g:2341:50: (iv_ruleValueType= ruleValueType EOF )
            // InternalFPML.g:2342:2: iv_ruleValueType= ruleValueType EOF
            {
             newCompositeNode(grammarAccess.getValueTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValueType=ruleValueType();

            state._fsp--;

             current =iv_ruleValueType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValueType"


    // $ANTLR start "ruleValueType"
    // InternalFPML.g:2348:1: ruleValueType returns [EObject current=null] : (this_IntegerType_0= ruleIntegerType | this_StringType_1= ruleStringType | this_DataType_2= ruleDataType | this_PureFunctionType_3= rulePureFunctionType ) ;
    public final EObject ruleValueType() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerType_0 = null;

        EObject this_StringType_1 = null;

        EObject this_DataType_2 = null;

        EObject this_PureFunctionType_3 = null;



        	enterRule();

        try {
            // InternalFPML.g:2354:2: ( (this_IntegerType_0= ruleIntegerType | this_StringType_1= ruleStringType | this_DataType_2= ruleDataType | this_PureFunctionType_3= rulePureFunctionType ) )
            // InternalFPML.g:2355:2: (this_IntegerType_0= ruleIntegerType | this_StringType_1= ruleStringType | this_DataType_2= ruleDataType | this_PureFunctionType_3= rulePureFunctionType )
            {
            // InternalFPML.g:2355:2: (this_IntegerType_0= ruleIntegerType | this_StringType_1= ruleStringType | this_DataType_2= ruleDataType | this_PureFunctionType_3= rulePureFunctionType )
            int alt26=4;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt26=1;
                }
                break;
            case 33:
                {
                alt26=2;
                }
                break;
            case 35:
                {
                alt26=3;
                }
                break;
            case 37:
                {
                alt26=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalFPML.g:2356:3: this_IntegerType_0= ruleIntegerType
                    {

                    			newCompositeNode(grammarAccess.getValueTypeAccess().getIntegerTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntegerType_0=ruleIntegerType();

                    state._fsp--;


                    			current = this_IntegerType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFPML.g:2365:3: this_StringType_1= ruleStringType
                    {

                    			newCompositeNode(grammarAccess.getValueTypeAccess().getStringTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringType_1=ruleStringType();

                    state._fsp--;


                    			current = this_StringType_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalFPML.g:2374:3: this_DataType_2= ruleDataType
                    {

                    			newCompositeNode(grammarAccess.getValueTypeAccess().getDataTypeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataType_2=ruleDataType();

                    state._fsp--;


                    			current = this_DataType_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalFPML.g:2383:3: this_PureFunctionType_3= rulePureFunctionType
                    {

                    			newCompositeNode(grammarAccess.getValueTypeAccess().getPureFunctionTypeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_PureFunctionType_3=rulePureFunctionType();

                    state._fsp--;


                    			current = this_PureFunctionType_3;
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
    // $ANTLR end "ruleValueType"


    // $ANTLR start "entryRuleType"
    // InternalFPML.g:2395:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalFPML.g:2395:45: (iv_ruleType= ruleType EOF )
            // InternalFPML.g:2396:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalFPML.g:2402:1: ruleType returns [EObject current=null] : (this_ValueType_0= ruleValueType | this_UnitType_1= ruleUnitType | this_EffectFullFunctionType_2= ruleEffectFullFunctionType | this_EffectFullDataType_3= ruleEffectFullDataType ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_ValueType_0 = null;

        EObject this_UnitType_1 = null;

        EObject this_EffectFullFunctionType_2 = null;

        EObject this_EffectFullDataType_3 = null;



        	enterRule();

        try {
            // InternalFPML.g:2408:2: ( (this_ValueType_0= ruleValueType | this_UnitType_1= ruleUnitType | this_EffectFullFunctionType_2= ruleEffectFullFunctionType | this_EffectFullDataType_3= ruleEffectFullDataType ) )
            // InternalFPML.g:2409:2: (this_ValueType_0= ruleValueType | this_UnitType_1= ruleUnitType | this_EffectFullFunctionType_2= ruleEffectFullFunctionType | this_EffectFullDataType_3= ruleEffectFullDataType )
            {
            // InternalFPML.g:2409:2: (this_ValueType_0= ruleValueType | this_UnitType_1= ruleUnitType | this_EffectFullFunctionType_2= ruleEffectFullFunctionType | this_EffectFullDataType_3= ruleEffectFullDataType )
            int alt27=4;
            switch ( input.LA(1) ) {
            case 32:
            case 33:
            case 35:
            case 37:
                {
                alt27=1;
                }
                break;
            case 34:
                {
                alt27=2;
                }
                break;
            case 40:
                {
                alt27=3;
                }
                break;
            case 36:
                {
                alt27=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalFPML.g:2410:3: this_ValueType_0= ruleValueType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getValueTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ValueType_0=ruleValueType();

                    state._fsp--;


                    			current = this_ValueType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFPML.g:2419:3: this_UnitType_1= ruleUnitType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getUnitTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_UnitType_1=ruleUnitType();

                    state._fsp--;


                    			current = this_UnitType_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalFPML.g:2428:3: this_EffectFullFunctionType_2= ruleEffectFullFunctionType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getEffectFullFunctionTypeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_EffectFullFunctionType_2=ruleEffectFullFunctionType();

                    state._fsp--;


                    			current = this_EffectFullFunctionType_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalFPML.g:2437:3: this_EffectFullDataType_3= ruleEffectFullDataType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getEffectFullDataTypeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_EffectFullDataType_3=ruleEffectFullDataType();

                    state._fsp--;


                    			current = this_EffectFullDataType_3;
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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleIntegerType"
    // InternalFPML.g:2449:1: entryRuleIntegerType returns [EObject current=null] : iv_ruleIntegerType= ruleIntegerType EOF ;
    public final EObject entryRuleIntegerType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerType = null;


        try {
            // InternalFPML.g:2449:52: (iv_ruleIntegerType= ruleIntegerType EOF )
            // InternalFPML.g:2450:2: iv_ruleIntegerType= ruleIntegerType EOF
            {
             newCompositeNode(grammarAccess.getIntegerTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntegerType=ruleIntegerType();

            state._fsp--;

             current =iv_ruleIntegerType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntegerType"


    // $ANTLR start "ruleIntegerType"
    // InternalFPML.g:2456:1: ruleIntegerType returns [EObject current=null] : ( () ( (lv_type_1_0= 'int' ) ) ) ;
    public final EObject ruleIntegerType() throws RecognitionException {
        EObject current = null;

        Token lv_type_1_0=null;


        	enterRule();

        try {
            // InternalFPML.g:2462:2: ( ( () ( (lv_type_1_0= 'int' ) ) ) )
            // InternalFPML.g:2463:2: ( () ( (lv_type_1_0= 'int' ) ) )
            {
            // InternalFPML.g:2463:2: ( () ( (lv_type_1_0= 'int' ) ) )
            // InternalFPML.g:2464:3: () ( (lv_type_1_0= 'int' ) )
            {
            // InternalFPML.g:2464:3: ()
            // InternalFPML.g:2465:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntegerTypeAccess().getIntegerTypeAction_0(),
            					current);
            			

            }

            // InternalFPML.g:2471:3: ( (lv_type_1_0= 'int' ) )
            // InternalFPML.g:2472:4: (lv_type_1_0= 'int' )
            {
            // InternalFPML.g:2472:4: (lv_type_1_0= 'int' )
            // InternalFPML.g:2473:5: lv_type_1_0= 'int'
            {
            lv_type_1_0=(Token)match(input,32,FOLLOW_2); 

            					newLeafNode(lv_type_1_0, grammarAccess.getIntegerTypeAccess().getTypeIntKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntegerTypeRule());
            					}
            					setWithLastConsumed(current, "type", lv_type_1_0, "int");
            				

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
    // $ANTLR end "ruleIntegerType"


    // $ANTLR start "entryRuleStringType"
    // InternalFPML.g:2489:1: entryRuleStringType returns [EObject current=null] : iv_ruleStringType= ruleStringType EOF ;
    public final EObject entryRuleStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringType = null;


        try {
            // InternalFPML.g:2489:51: (iv_ruleStringType= ruleStringType EOF )
            // InternalFPML.g:2490:2: iv_ruleStringType= ruleStringType EOF
            {
             newCompositeNode(grammarAccess.getStringTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringType=ruleStringType();

            state._fsp--;

             current =iv_ruleStringType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringType"


    // $ANTLR start "ruleStringType"
    // InternalFPML.g:2496:1: ruleStringType returns [EObject current=null] : ( () ( (lv_type_1_0= 'String' ) ) ) ;
    public final EObject ruleStringType() throws RecognitionException {
        EObject current = null;

        Token lv_type_1_0=null;


        	enterRule();

        try {
            // InternalFPML.g:2502:2: ( ( () ( (lv_type_1_0= 'String' ) ) ) )
            // InternalFPML.g:2503:2: ( () ( (lv_type_1_0= 'String' ) ) )
            {
            // InternalFPML.g:2503:2: ( () ( (lv_type_1_0= 'String' ) ) )
            // InternalFPML.g:2504:3: () ( (lv_type_1_0= 'String' ) )
            {
            // InternalFPML.g:2504:3: ()
            // InternalFPML.g:2505:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStringTypeAccess().getStringTypeAction_0(),
            					current);
            			

            }

            // InternalFPML.g:2511:3: ( (lv_type_1_0= 'String' ) )
            // InternalFPML.g:2512:4: (lv_type_1_0= 'String' )
            {
            // InternalFPML.g:2512:4: (lv_type_1_0= 'String' )
            // InternalFPML.g:2513:5: lv_type_1_0= 'String'
            {
            lv_type_1_0=(Token)match(input,33,FOLLOW_2); 

            					newLeafNode(lv_type_1_0, grammarAccess.getStringTypeAccess().getTypeStringKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStringTypeRule());
            					}
            					setWithLastConsumed(current, "type", lv_type_1_0, "String");
            				

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
    // $ANTLR end "ruleStringType"


    // $ANTLR start "entryRuleUnitType"
    // InternalFPML.g:2529:1: entryRuleUnitType returns [EObject current=null] : iv_ruleUnitType= ruleUnitType EOF ;
    public final EObject entryRuleUnitType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnitType = null;


        try {
            // InternalFPML.g:2529:49: (iv_ruleUnitType= ruleUnitType EOF )
            // InternalFPML.g:2530:2: iv_ruleUnitType= ruleUnitType EOF
            {
             newCompositeNode(grammarAccess.getUnitTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnitType=ruleUnitType();

            state._fsp--;

             current =iv_ruleUnitType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnitType"


    // $ANTLR start "ruleUnitType"
    // InternalFPML.g:2536:1: ruleUnitType returns [EObject current=null] : ( () ( (lv_type_1_0= 'Unit' ) ) ) ;
    public final EObject ruleUnitType() throws RecognitionException {
        EObject current = null;

        Token lv_type_1_0=null;


        	enterRule();

        try {
            // InternalFPML.g:2542:2: ( ( () ( (lv_type_1_0= 'Unit' ) ) ) )
            // InternalFPML.g:2543:2: ( () ( (lv_type_1_0= 'Unit' ) ) )
            {
            // InternalFPML.g:2543:2: ( () ( (lv_type_1_0= 'Unit' ) ) )
            // InternalFPML.g:2544:3: () ( (lv_type_1_0= 'Unit' ) )
            {
            // InternalFPML.g:2544:3: ()
            // InternalFPML.g:2545:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUnitTypeAccess().getUnitTypeAction_0(),
            					current);
            			

            }

            // InternalFPML.g:2551:3: ( (lv_type_1_0= 'Unit' ) )
            // InternalFPML.g:2552:4: (lv_type_1_0= 'Unit' )
            {
            // InternalFPML.g:2552:4: (lv_type_1_0= 'Unit' )
            // InternalFPML.g:2553:5: lv_type_1_0= 'Unit'
            {
            lv_type_1_0=(Token)match(input,34,FOLLOW_2); 

            					newLeafNode(lv_type_1_0, grammarAccess.getUnitTypeAccess().getTypeUnitKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUnitTypeRule());
            					}
            					setWithLastConsumed(current, "type", lv_type_1_0, "Unit");
            				

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
    // $ANTLR end "ruleUnitType"


    // $ANTLR start "entryRuleDataType"
    // InternalFPML.g:2569:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalFPML.g:2569:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalFPML.g:2570:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalFPML.g:2576:1: ruleDataType returns [EObject current=null] : ( () otherlv_1= 'ref' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalFPML.g:2582:2: ( ( () otherlv_1= 'ref' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalFPML.g:2583:2: ( () otherlv_1= 'ref' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalFPML.g:2583:2: ( () otherlv_1= 'ref' ( (otherlv_2= RULE_ID ) ) )
            // InternalFPML.g:2584:3: () otherlv_1= 'ref' ( (otherlv_2= RULE_ID ) )
            {
            // InternalFPML.g:2584:3: ()
            // InternalFPML.g:2585:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDataTypeAccess().getDataTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getDataTypeAccess().getRefKeyword_1());
            		
            // InternalFPML.g:2595:3: ( (otherlv_2= RULE_ID ) )
            // InternalFPML.g:2596:4: (otherlv_2= RULE_ID )
            {
            // InternalFPML.g:2596:4: (otherlv_2= RULE_ID )
            // InternalFPML.g:2597:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataTypeRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getDataTypeAccess().getTypePureDataCrossReference_2_0());
            				

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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleEffectFullDataType"
    // InternalFPML.g:2612:1: entryRuleEffectFullDataType returns [EObject current=null] : iv_ruleEffectFullDataType= ruleEffectFullDataType EOF ;
    public final EObject entryRuleEffectFullDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullDataType = null;


        try {
            // InternalFPML.g:2612:59: (iv_ruleEffectFullDataType= ruleEffectFullDataType EOF )
            // InternalFPML.g:2613:2: iv_ruleEffectFullDataType= ruleEffectFullDataType EOF
            {
             newCompositeNode(grammarAccess.getEffectFullDataTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEffectFullDataType=ruleEffectFullDataType();

            state._fsp--;

             current =iv_ruleEffectFullDataType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEffectFullDataType"


    // $ANTLR start "ruleEffectFullDataType"
    // InternalFPML.g:2619:1: ruleEffectFullDataType returns [EObject current=null] : ( () otherlv_1= 'refIO' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleEffectFullDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalFPML.g:2625:2: ( ( () otherlv_1= 'refIO' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalFPML.g:2626:2: ( () otherlv_1= 'refIO' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalFPML.g:2626:2: ( () otherlv_1= 'refIO' ( (otherlv_2= RULE_ID ) ) )
            // InternalFPML.g:2627:3: () otherlv_1= 'refIO' ( (otherlv_2= RULE_ID ) )
            {
            // InternalFPML.g:2627:3: ()
            // InternalFPML.g:2628:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEffectFullDataTypeAccess().getEffectFullDataTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getEffectFullDataTypeAccess().getRefIOKeyword_1());
            		
            // InternalFPML.g:2638:3: ( (otherlv_2= RULE_ID ) )
            // InternalFPML.g:2639:4: (otherlv_2= RULE_ID )
            {
            // InternalFPML.g:2639:4: (otherlv_2= RULE_ID )
            // InternalFPML.g:2640:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEffectFullDataTypeRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getEffectFullDataTypeAccess().getTypeEffectFullDataCrossReference_2_0());
            				

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
    // $ANTLR end "ruleEffectFullDataType"


    // $ANTLR start "entryRulePureFunctionType"
    // InternalFPML.g:2655:1: entryRulePureFunctionType returns [EObject current=null] : iv_rulePureFunctionType= rulePureFunctionType EOF ;
    public final EObject entryRulePureFunctionType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePureFunctionType = null;


        try {
            // InternalFPML.g:2655:57: (iv_rulePureFunctionType= rulePureFunctionType EOF )
            // InternalFPML.g:2656:2: iv_rulePureFunctionType= rulePureFunctionType EOF
            {
             newCompositeNode(grammarAccess.getPureFunctionTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePureFunctionType=rulePureFunctionType();

            state._fsp--;

             current =iv_rulePureFunctionType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePureFunctionType"


    // $ANTLR start "rulePureFunctionType"
    // InternalFPML.g:2662:1: rulePureFunctionType returns [EObject current=null] : ( () otherlv_1= 'F' otherlv_2= '<' ( (lv_argType_3_0= ruleValueType ) ) otherlv_4= ',' ( (lv_returnType_5_0= ruleValueType ) ) otherlv_6= '>' ) ;
    public final EObject rulePureFunctionType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_argType_3_0 = null;

        EObject lv_returnType_5_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:2668:2: ( ( () otherlv_1= 'F' otherlv_2= '<' ( (lv_argType_3_0= ruleValueType ) ) otherlv_4= ',' ( (lv_returnType_5_0= ruleValueType ) ) otherlv_6= '>' ) )
            // InternalFPML.g:2669:2: ( () otherlv_1= 'F' otherlv_2= '<' ( (lv_argType_3_0= ruleValueType ) ) otherlv_4= ',' ( (lv_returnType_5_0= ruleValueType ) ) otherlv_6= '>' )
            {
            // InternalFPML.g:2669:2: ( () otherlv_1= 'F' otherlv_2= '<' ( (lv_argType_3_0= ruleValueType ) ) otherlv_4= ',' ( (lv_returnType_5_0= ruleValueType ) ) otherlv_6= '>' )
            // InternalFPML.g:2670:3: () otherlv_1= 'F' otherlv_2= '<' ( (lv_argType_3_0= ruleValueType ) ) otherlv_4= ',' ( (lv_returnType_5_0= ruleValueType ) ) otherlv_6= '>'
            {
            // InternalFPML.g:2670:3: ()
            // InternalFPML.g:2671:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPureFunctionTypeAccess().getPureFunctionTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,37,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getPureFunctionTypeAccess().getFKeyword_1());
            		
            otherlv_2=(Token)match(input,38,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getPureFunctionTypeAccess().getLessThanSignKeyword_2());
            		
            // InternalFPML.g:2685:3: ( (lv_argType_3_0= ruleValueType ) )
            // InternalFPML.g:2686:4: (lv_argType_3_0= ruleValueType )
            {
            // InternalFPML.g:2686:4: (lv_argType_3_0= ruleValueType )
            // InternalFPML.g:2687:5: lv_argType_3_0= ruleValueType
            {

            					newCompositeNode(grammarAccess.getPureFunctionTypeAccess().getArgTypeValueTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_34);
            lv_argType_3_0=ruleValueType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPureFunctionTypeRule());
            					}
            					set(
            						current,
            						"argType",
            						lv_argType_3_0,
            						"it.unibo.FPML.ValueType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_4, grammarAccess.getPureFunctionTypeAccess().getCommaKeyword_4());
            		
            // InternalFPML.g:2708:3: ( (lv_returnType_5_0= ruleValueType ) )
            // InternalFPML.g:2709:4: (lv_returnType_5_0= ruleValueType )
            {
            // InternalFPML.g:2709:4: (lv_returnType_5_0= ruleValueType )
            // InternalFPML.g:2710:5: lv_returnType_5_0= ruleValueType
            {

            					newCompositeNode(grammarAccess.getPureFunctionTypeAccess().getReturnTypeValueTypeParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_35);
            lv_returnType_5_0=ruleValueType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPureFunctionTypeRule());
            					}
            					set(
            						current,
            						"returnType",
            						lv_returnType_5_0,
            						"it.unibo.FPML.ValueType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,39,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getPureFunctionTypeAccess().getGreaterThanSignKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePureFunctionType"


    // $ANTLR start "entryRuleEffectFullFunctionType"
    // InternalFPML.g:2735:1: entryRuleEffectFullFunctionType returns [EObject current=null] : iv_ruleEffectFullFunctionType= ruleEffectFullFunctionType EOF ;
    public final EObject entryRuleEffectFullFunctionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullFunctionType = null;


        try {
            // InternalFPML.g:2735:63: (iv_ruleEffectFullFunctionType= ruleEffectFullFunctionType EOF )
            // InternalFPML.g:2736:2: iv_ruleEffectFullFunctionType= ruleEffectFullFunctionType EOF
            {
             newCompositeNode(grammarAccess.getEffectFullFunctionTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEffectFullFunctionType=ruleEffectFullFunctionType();

            state._fsp--;

             current =iv_ruleEffectFullFunctionType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEffectFullFunctionType"


    // $ANTLR start "ruleEffectFullFunctionType"
    // InternalFPML.g:2742:1: ruleEffectFullFunctionType returns [EObject current=null] : ( () otherlv_1= 'FIO' otherlv_2= '<' ( (lv_argType_3_0= ruleType ) ) otherlv_4= ',' ( (lv_returnType_5_0= ruleIOType ) ) otherlv_6= '>' ) ;
    public final EObject ruleEffectFullFunctionType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_argType_3_0 = null;

        EObject lv_returnType_5_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:2748:2: ( ( () otherlv_1= 'FIO' otherlv_2= '<' ( (lv_argType_3_0= ruleType ) ) otherlv_4= ',' ( (lv_returnType_5_0= ruleIOType ) ) otherlv_6= '>' ) )
            // InternalFPML.g:2749:2: ( () otherlv_1= 'FIO' otherlv_2= '<' ( (lv_argType_3_0= ruleType ) ) otherlv_4= ',' ( (lv_returnType_5_0= ruleIOType ) ) otherlv_6= '>' )
            {
            // InternalFPML.g:2749:2: ( () otherlv_1= 'FIO' otherlv_2= '<' ( (lv_argType_3_0= ruleType ) ) otherlv_4= ',' ( (lv_returnType_5_0= ruleIOType ) ) otherlv_6= '>' )
            // InternalFPML.g:2750:3: () otherlv_1= 'FIO' otherlv_2= '<' ( (lv_argType_3_0= ruleType ) ) otherlv_4= ',' ( (lv_returnType_5_0= ruleIOType ) ) otherlv_6= '>'
            {
            // InternalFPML.g:2750:3: ()
            // InternalFPML.g:2751:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEffectFullFunctionTypeAccess().getEffectFullFunctionTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,40,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getEffectFullFunctionTypeAccess().getFIOKeyword_1());
            		
            otherlv_2=(Token)match(input,38,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getEffectFullFunctionTypeAccess().getLessThanSignKeyword_2());
            		
            // InternalFPML.g:2765:3: ( (lv_argType_3_0= ruleType ) )
            // InternalFPML.g:2766:4: (lv_argType_3_0= ruleType )
            {
            // InternalFPML.g:2766:4: (lv_argType_3_0= ruleType )
            // InternalFPML.g:2767:5: lv_argType_3_0= ruleType
            {

            					newCompositeNode(grammarAccess.getEffectFullFunctionTypeAccess().getArgTypeTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_34);
            lv_argType_3_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEffectFullFunctionTypeRule());
            					}
            					set(
            						current,
            						"argType",
            						lv_argType_3_0,
            						"it.unibo.FPML.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,25,FOLLOW_25); 

            			newLeafNode(otherlv_4, grammarAccess.getEffectFullFunctionTypeAccess().getCommaKeyword_4());
            		
            // InternalFPML.g:2788:3: ( (lv_returnType_5_0= ruleIOType ) )
            // InternalFPML.g:2789:4: (lv_returnType_5_0= ruleIOType )
            {
            // InternalFPML.g:2789:4: (lv_returnType_5_0= ruleIOType )
            // InternalFPML.g:2790:5: lv_returnType_5_0= ruleIOType
            {

            					newCompositeNode(grammarAccess.getEffectFullFunctionTypeAccess().getReturnTypeIOTypeParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_35);
            lv_returnType_5_0=ruleIOType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEffectFullFunctionTypeRule());
            					}
            					set(
            						current,
            						"returnType",
            						lv_returnType_5_0,
            						"it.unibo.FPML.IOType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,39,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getEffectFullFunctionTypeAccess().getGreaterThanSignKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEffectFullFunctionType"


    // $ANTLR start "entryRuleEffectFullExpression"
    // InternalFPML.g:2815:1: entryRuleEffectFullExpression returns [EObject current=null] : iv_ruleEffectFullExpression= ruleEffectFullExpression EOF ;
    public final EObject entryRuleEffectFullExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullExpression = null;


        try {
            // InternalFPML.g:2815:61: (iv_ruleEffectFullExpression= ruleEffectFullExpression EOF )
            // InternalFPML.g:2816:2: iv_ruleEffectFullExpression= ruleEffectFullExpression EOF
            {
             newCompositeNode(grammarAccess.getEffectFullExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEffectFullExpression=ruleEffectFullExpression();

            state._fsp--;

             current =iv_ruleEffectFullExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEffectFullExpression"


    // $ANTLR start "ruleEffectFullExpression"
    // InternalFPML.g:2822:1: ruleEffectFullExpression returns [EObject current=null] : ( (otherlv_0= 'IO' otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) | this_UnitValue_4= ruleUnitValue | this_EffectFullFunctionValue_5= ruleEffectFullFunctionValue | this_EffectFullDataValue_6= ruleEffectFullDataValue ) ;
    public final EObject ruleEffectFullExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_Expression_2 = null;

        EObject this_UnitValue_4 = null;

        EObject this_EffectFullFunctionValue_5 = null;

        EObject this_EffectFullDataValue_6 = null;



        	enterRule();

        try {
            // InternalFPML.g:2828:2: ( ( (otherlv_0= 'IO' otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) | this_UnitValue_4= ruleUnitValue | this_EffectFullFunctionValue_5= ruleEffectFullFunctionValue | this_EffectFullDataValue_6= ruleEffectFullDataValue ) )
            // InternalFPML.g:2829:2: ( (otherlv_0= 'IO' otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) | this_UnitValue_4= ruleUnitValue | this_EffectFullFunctionValue_5= ruleEffectFullFunctionValue | this_EffectFullDataValue_6= ruleEffectFullDataValue )
            {
            // InternalFPML.g:2829:2: ( (otherlv_0= 'IO' otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) | this_UnitValue_4= ruleUnitValue | this_EffectFullFunctionValue_5= ruleEffectFullFunctionValue | this_EffectFullDataValue_6= ruleEffectFullDataValue )
            int alt28=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt28=1;
                }
                break;
            case 41:
                {
                alt28=2;
                }
                break;
            case 19:
            case 21:
            case 22:
            case 29:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 51:
                {
                alt28=3;
                }
                break;
            case RULE_ID:
                {
                int LA28_4 = input.LA(2);

                if ( (LA28_4==31) ) {
                    alt28=3;
                }
                else if ( (LA28_4==24) ) {
                    alt28=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalFPML.g:2830:3: (otherlv_0= 'IO' otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' )
                    {
                    // InternalFPML.g:2830:3: (otherlv_0= 'IO' otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' )
                    // InternalFPML.g:2831:4: otherlv_0= 'IO' otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')'
                    {
                    otherlv_0=(Token)match(input,27,FOLLOW_21); 

                    				newLeafNode(otherlv_0, grammarAccess.getEffectFullExpressionAccess().getIOKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,24,FOLLOW_14); 

                    				newLeafNode(otherlv_1, grammarAccess.getEffectFullExpressionAccess().getLeftParenthesisKeyword_0_1());
                    			

                    				newCompositeNode(grammarAccess.getEffectFullExpressionAccess().getExpressionParserRuleCall_0_2());
                    			
                    pushFollow(FOLLOW_23);
                    this_Expression_2=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_2;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_3=(Token)match(input,26,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getEffectFullExpressionAccess().getRightParenthesisKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFPML.g:2853:3: this_UnitValue_4= ruleUnitValue
                    {

                    			newCompositeNode(grammarAccess.getEffectFullExpressionAccess().getUnitValueParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_UnitValue_4=ruleUnitValue();

                    state._fsp--;


                    			current = this_UnitValue_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalFPML.g:2862:3: this_EffectFullFunctionValue_5= ruleEffectFullFunctionValue
                    {

                    			newCompositeNode(grammarAccess.getEffectFullExpressionAccess().getEffectFullFunctionValueParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_EffectFullFunctionValue_5=ruleEffectFullFunctionValue();

                    state._fsp--;


                    			current = this_EffectFullFunctionValue_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalFPML.g:2871:3: this_EffectFullDataValue_6= ruleEffectFullDataValue
                    {

                    			newCompositeNode(grammarAccess.getEffectFullExpressionAccess().getEffectFullDataValueParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_EffectFullDataValue_6=ruleEffectFullDataValue();

                    state._fsp--;


                    			current = this_EffectFullDataValue_6;
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
    // $ANTLR end "ruleEffectFullExpression"


    // $ANTLR start "entryRuleUnitValue"
    // InternalFPML.g:2883:1: entryRuleUnitValue returns [EObject current=null] : iv_ruleUnitValue= ruleUnitValue EOF ;
    public final EObject entryRuleUnitValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnitValue = null;


        try {
            // InternalFPML.g:2883:50: (iv_ruleUnitValue= ruleUnitValue EOF )
            // InternalFPML.g:2884:2: iv_ruleUnitValue= ruleUnitValue EOF
            {
             newCompositeNode(grammarAccess.getUnitValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnitValue=ruleUnitValue();

            state._fsp--;

             current =iv_ruleUnitValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnitValue"


    // $ANTLR start "ruleUnitValue"
    // InternalFPML.g:2890:1: ruleUnitValue returns [EObject current=null] : ( () otherlv_1= '()' ) ;
    public final EObject ruleUnitValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFPML.g:2896:2: ( ( () otherlv_1= '()' ) )
            // InternalFPML.g:2897:2: ( () otherlv_1= '()' )
            {
            // InternalFPML.g:2897:2: ( () otherlv_1= '()' )
            // InternalFPML.g:2898:3: () otherlv_1= '()'
            {
            // InternalFPML.g:2898:3: ()
            // InternalFPML.g:2899:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUnitValueAccess().getUnitTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getUnitValueAccess().getLeftParenthesisRightParenthesisKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnitValue"


    // $ANTLR start "entryRuleEffectFullFunctionValue"
    // InternalFPML.g:2913:1: entryRuleEffectFullFunctionValue returns [EObject current=null] : iv_ruleEffectFullFunctionValue= ruleEffectFullFunctionValue EOF ;
    public final EObject entryRuleEffectFullFunctionValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullFunctionValue = null;


        try {
            // InternalFPML.g:2913:64: (iv_ruleEffectFullFunctionValue= ruleEffectFullFunctionValue EOF )
            // InternalFPML.g:2914:2: iv_ruleEffectFullFunctionValue= ruleEffectFullFunctionValue EOF
            {
             newCompositeNode(grammarAccess.getEffectFullFunctionValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEffectFullFunctionValue=ruleEffectFullFunctionValue();

            state._fsp--;

             current =iv_ruleEffectFullFunctionValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEffectFullFunctionValue"


    // $ANTLR start "ruleEffectFullFunctionValue"
    // InternalFPML.g:2920:1: ruleEffectFullFunctionValue returns [EObject current=null] : ( (lv_value_0_0= ruleEffectFullLambda ) ) ;
    public final EObject ruleEffectFullFunctionValue() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:2926:2: ( ( (lv_value_0_0= ruleEffectFullLambda ) ) )
            // InternalFPML.g:2927:2: ( (lv_value_0_0= ruleEffectFullLambda ) )
            {
            // InternalFPML.g:2927:2: ( (lv_value_0_0= ruleEffectFullLambda ) )
            // InternalFPML.g:2928:3: (lv_value_0_0= ruleEffectFullLambda )
            {
            // InternalFPML.g:2928:3: (lv_value_0_0= ruleEffectFullLambda )
            // InternalFPML.g:2929:4: lv_value_0_0= ruleEffectFullLambda
            {

            				newCompositeNode(grammarAccess.getEffectFullFunctionValueAccess().getValueEffectFullLambdaParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleEffectFullLambda();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getEffectFullFunctionValueRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"it.unibo.FPML.EffectFullLambda");
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
    // $ANTLR end "ruleEffectFullFunctionValue"


    // $ANTLR start "entryRuleEffectFullValueRef"
    // InternalFPML.g:2949:1: entryRuleEffectFullValueRef returns [EObject current=null] : iv_ruleEffectFullValueRef= ruleEffectFullValueRef EOF ;
    public final EObject entryRuleEffectFullValueRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullValueRef = null;


        try {
            // InternalFPML.g:2949:59: (iv_ruleEffectFullValueRef= ruleEffectFullValueRef EOF )
            // InternalFPML.g:2950:2: iv_ruleEffectFullValueRef= ruleEffectFullValueRef EOF
            {
             newCompositeNode(grammarAccess.getEffectFullValueRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEffectFullValueRef=ruleEffectFullValueRef();

            state._fsp--;

             current =iv_ruleEffectFullValueRef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEffectFullValueRef"


    // $ANTLR start "ruleEffectFullValueRef"
    // InternalFPML.g:2956:1: ruleEffectFullValueRef returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleEffectFullValueRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFPML.g:2962:2: ( ( () ( (otherlv_1= RULE_ID ) ) ) )
            // InternalFPML.g:2963:2: ( () ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalFPML.g:2963:2: ( () ( (otherlv_1= RULE_ID ) ) )
            // InternalFPML.g:2964:3: () ( (otherlv_1= RULE_ID ) )
            {
            // InternalFPML.g:2964:3: ()
            // InternalFPML.g:2965:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEffectFullValueRefAccess().getEffectFullValueRefAction_0(),
            					current);
            			

            }

            // InternalFPML.g:2971:3: ( (otherlv_1= RULE_ID ) )
            // InternalFPML.g:2972:4: (otherlv_1= RULE_ID )
            {
            // InternalFPML.g:2972:4: (otherlv_1= RULE_ID )
            // InternalFPML.g:2973:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEffectFullValueRefRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getEffectFullValueRefAccess().getValueEffectFullValueCrossReference_1_0());
            				

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
    // $ANTLR end "ruleEffectFullValueRef"


    // $ANTLR start "entryRuleEffectFullLambda"
    // InternalFPML.g:2988:1: entryRuleEffectFullLambda returns [EObject current=null] : iv_ruleEffectFullLambda= ruleEffectFullLambda EOF ;
    public final EObject entryRuleEffectFullLambda() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullLambda = null;


        try {
            // InternalFPML.g:2988:57: (iv_ruleEffectFullLambda= ruleEffectFullLambda EOF )
            // InternalFPML.g:2989:2: iv_ruleEffectFullLambda= ruleEffectFullLambda EOF
            {
             newCompositeNode(grammarAccess.getEffectFullLambdaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEffectFullLambda=ruleEffectFullLambda();

            state._fsp--;

             current =iv_ruleEffectFullLambda; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEffectFullLambda"


    // $ANTLR start "ruleEffectFullLambda"
    // InternalFPML.g:2995:1: ruleEffectFullLambda returns [EObject current=null] : ( ( () otherlv_1= '[' ( (lv_arg_2_0= ruleEffectFullArgument ) ) otherlv_3= ']' otherlv_4= ':' ( (lv_functionBody_5_0= ruleFunctionBodyEffectFull ) ) ) | ( () ( (lv_functionBody_7_0= ruleFunctionBodyEffectFull ) ) ) ) ;
    public final EObject ruleEffectFullLambda() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_arg_2_0 = null;

        EObject lv_functionBody_5_0 = null;

        EObject lv_functionBody_7_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:3001:2: ( ( ( () otherlv_1= '[' ( (lv_arg_2_0= ruleEffectFullArgument ) ) otherlv_3= ']' otherlv_4= ':' ( (lv_functionBody_5_0= ruleFunctionBodyEffectFull ) ) ) | ( () ( (lv_functionBody_7_0= ruleFunctionBodyEffectFull ) ) ) ) )
            // InternalFPML.g:3002:2: ( ( () otherlv_1= '[' ( (lv_arg_2_0= ruleEffectFullArgument ) ) otherlv_3= ']' otherlv_4= ':' ( (lv_functionBody_5_0= ruleFunctionBodyEffectFull ) ) ) | ( () ( (lv_functionBody_7_0= ruleFunctionBodyEffectFull ) ) ) )
            {
            // InternalFPML.g:3002:2: ( ( () otherlv_1= '[' ( (lv_arg_2_0= ruleEffectFullArgument ) ) otherlv_3= ']' otherlv_4= ':' ( (lv_functionBody_5_0= ruleFunctionBodyEffectFull ) ) ) | ( () ( (lv_functionBody_7_0= ruleFunctionBodyEffectFull ) ) ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==19) ) {
                alt29=1;
            }
            else if ( (LA29_0==RULE_ID||(LA29_0>=21 && LA29_0<=22)||LA29_0==29||(LA29_0>=44 && LA29_0<=49)||LA29_0==51) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalFPML.g:3003:3: ( () otherlv_1= '[' ( (lv_arg_2_0= ruleEffectFullArgument ) ) otherlv_3= ']' otherlv_4= ':' ( (lv_functionBody_5_0= ruleFunctionBodyEffectFull ) ) )
                    {
                    // InternalFPML.g:3003:3: ( () otherlv_1= '[' ( (lv_arg_2_0= ruleEffectFullArgument ) ) otherlv_3= ']' otherlv_4= ':' ( (lv_functionBody_5_0= ruleFunctionBodyEffectFull ) ) )
                    // InternalFPML.g:3004:4: () otherlv_1= '[' ( (lv_arg_2_0= ruleEffectFullArgument ) ) otherlv_3= ']' otherlv_4= ':' ( (lv_functionBody_5_0= ruleFunctionBodyEffectFull ) )
                    {
                    // InternalFPML.g:3004:4: ()
                    // InternalFPML.g:3005:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getEffectFullLambdaAccess().getEffectFullLambdaAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,19,FOLLOW_26); 

                    				newLeafNode(otherlv_1, grammarAccess.getEffectFullLambdaAccess().getLeftSquareBracketKeyword_0_1());
                    			
                    // InternalFPML.g:3015:4: ( (lv_arg_2_0= ruleEffectFullArgument ) )
                    // InternalFPML.g:3016:5: (lv_arg_2_0= ruleEffectFullArgument )
                    {
                    // InternalFPML.g:3016:5: (lv_arg_2_0= ruleEffectFullArgument )
                    // InternalFPML.g:3017:6: lv_arg_2_0= ruleEffectFullArgument
                    {

                    						newCompositeNode(grammarAccess.getEffectFullLambdaAccess().getArgEffectFullArgumentParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_arg_2_0=ruleEffectFullArgument();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEffectFullLambdaRule());
                    						}
                    						set(
                    							current,
                    							"arg",
                    							lv_arg_2_0,
                    							"it.unibo.FPML.EffectFullArgument");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,20,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getEffectFullLambdaAccess().getRightSquareBracketKeyword_0_3());
                    			
                    otherlv_4=(Token)match(input,18,FOLLOW_24); 

                    				newLeafNode(otherlv_4, grammarAccess.getEffectFullLambdaAccess().getColonKeyword_0_4());
                    			
                    // InternalFPML.g:3042:4: ( (lv_functionBody_5_0= ruleFunctionBodyEffectFull ) )
                    // InternalFPML.g:3043:5: (lv_functionBody_5_0= ruleFunctionBodyEffectFull )
                    {
                    // InternalFPML.g:3043:5: (lv_functionBody_5_0= ruleFunctionBodyEffectFull )
                    // InternalFPML.g:3044:6: lv_functionBody_5_0= ruleFunctionBodyEffectFull
                    {

                    						newCompositeNode(grammarAccess.getEffectFullLambdaAccess().getFunctionBodyFunctionBodyEffectFullParserRuleCall_0_5_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_functionBody_5_0=ruleFunctionBodyEffectFull();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEffectFullLambdaRule());
                    						}
                    						set(
                    							current,
                    							"functionBody",
                    							lv_functionBody_5_0,
                    							"it.unibo.FPML.FunctionBodyEffectFull");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFPML.g:3063:3: ( () ( (lv_functionBody_7_0= ruleFunctionBodyEffectFull ) ) )
                    {
                    // InternalFPML.g:3063:3: ( () ( (lv_functionBody_7_0= ruleFunctionBodyEffectFull ) ) )
                    // InternalFPML.g:3064:4: () ( (lv_functionBody_7_0= ruleFunctionBodyEffectFull ) )
                    {
                    // InternalFPML.g:3064:4: ()
                    // InternalFPML.g:3065:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getEffectFullLambdaAccess().getEffectFullLambdaAction_1_0(),
                    						current);
                    				

                    }

                    // InternalFPML.g:3071:4: ( (lv_functionBody_7_0= ruleFunctionBodyEffectFull ) )
                    // InternalFPML.g:3072:5: (lv_functionBody_7_0= ruleFunctionBodyEffectFull )
                    {
                    // InternalFPML.g:3072:5: (lv_functionBody_7_0= ruleFunctionBodyEffectFull )
                    // InternalFPML.g:3073:6: lv_functionBody_7_0= ruleFunctionBodyEffectFull
                    {

                    						newCompositeNode(grammarAccess.getEffectFullLambdaAccess().getFunctionBodyFunctionBodyEffectFullParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_functionBody_7_0=ruleFunctionBodyEffectFull();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEffectFullLambdaRule());
                    						}
                    						set(
                    							current,
                    							"functionBody",
                    							lv_functionBody_7_0,
                    							"it.unibo.FPML.FunctionBodyEffectFull");
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
    // $ANTLR end "ruleEffectFullLambda"


    // $ANTLR start "entryRuleExpression"
    // InternalFPML.g:3095:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalFPML.g:3095:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalFPML.g:3096:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalFPML.g:3102:1: ruleExpression returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_DataValue_2= ruleDataValue | this_FunctionValue_3= ruleFunctionValue ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_IntValue_0 = null;

        EObject this_StringValue_1 = null;

        EObject this_DataValue_2 = null;

        EObject this_FunctionValue_3 = null;



        	enterRule();

        try {
            // InternalFPML.g:3108:2: ( (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_DataValue_2= ruleDataValue | this_FunctionValue_3= ruleFunctionValue ) )
            // InternalFPML.g:3109:2: (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_DataValue_2= ruleDataValue | this_FunctionValue_3= ruleFunctionValue )
            {
            // InternalFPML.g:3109:2: (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_DataValue_2= ruleDataValue | this_FunctionValue_3= ruleFunctionValue )
            int alt30=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt30=1;
                }
                break;
            case RULE_STRING:
                {
                alt30=2;
                }
                break;
            case RULE_ID:
                {
                alt30=3;
                }
                break;
            case 24:
                {
                alt30=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalFPML.g:3110:3: this_IntValue_0= ruleIntValue
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getIntValueParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntValue_0=ruleIntValue();

                    state._fsp--;


                    			current = this_IntValue_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFPML.g:3119:3: this_StringValue_1= ruleStringValue
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getStringValueParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringValue_1=ruleStringValue();

                    state._fsp--;


                    			current = this_StringValue_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalFPML.g:3128:3: this_DataValue_2= ruleDataValue
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getDataValueParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataValue_2=ruleDataValue();

                    state._fsp--;


                    			current = this_DataValue_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalFPML.g:3137:3: this_FunctionValue_3= ruleFunctionValue
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getFunctionValueParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_FunctionValue_3=ruleFunctionValue();

                    state._fsp--;


                    			current = this_FunctionValue_3;
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleIntValue"
    // InternalFPML.g:3149:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // InternalFPML.g:3149:49: (iv_ruleIntValue= ruleIntValue EOF )
            // InternalFPML.g:3150:2: iv_ruleIntValue= ruleIntValue EOF
            {
             newCompositeNode(grammarAccess.getIntValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntValue=ruleIntValue();

            state._fsp--;

             current =iv_ruleIntValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntValue"


    // $ANTLR start "ruleIntValue"
    // InternalFPML.g:3156:1: ruleIntValue returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalFPML.g:3162:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // InternalFPML.g:3163:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // InternalFPML.g:3163:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // InternalFPML.g:3164:3: () ( (lv_value_1_0= RULE_INT ) )
            {
            // InternalFPML.g:3164:3: ()
            // InternalFPML.g:3165:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntValueAccess().getIntegerTypeAction_0(),
            					current);
            			

            }

            // InternalFPML.g:3171:3: ( (lv_value_1_0= RULE_INT ) )
            // InternalFPML.g:3172:4: (lv_value_1_0= RULE_INT )
            {
            // InternalFPML.g:3172:4: (lv_value_1_0= RULE_INT )
            // InternalFPML.g:3173:5: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntValueRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
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
    // $ANTLR end "ruleIntValue"


    // $ANTLR start "entryRuleStringValue"
    // InternalFPML.g:3193:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalFPML.g:3193:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalFPML.g:3194:2: iv_ruleStringValue= ruleStringValue EOF
            {
             newCompositeNode(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;

             current =iv_ruleStringValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // InternalFPML.g:3200:1: ruleStringValue returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalFPML.g:3206:2: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalFPML.g:3207:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalFPML.g:3207:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalFPML.g:3208:3: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // InternalFPML.g:3208:3: ()
            // InternalFPML.g:3209:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStringValueAccess().getStringTypeAction_0(),
            					current);
            			

            }

            // InternalFPML.g:3215:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalFPML.g:3216:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalFPML.g:3216:4: (lv_value_1_0= RULE_STRING )
            // InternalFPML.g:3217:5: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStringValueRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
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
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleFunctionValue"
    // InternalFPML.g:3237:1: entryRuleFunctionValue returns [EObject current=null] : iv_ruleFunctionValue= ruleFunctionValue EOF ;
    public final EObject entryRuleFunctionValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionValue = null;


        try {
            // InternalFPML.g:3237:54: (iv_ruleFunctionValue= ruleFunctionValue EOF )
            // InternalFPML.g:3238:2: iv_ruleFunctionValue= ruleFunctionValue EOF
            {
             newCompositeNode(grammarAccess.getFunctionValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionValue=ruleFunctionValue();

            state._fsp--;

             current =iv_ruleFunctionValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionValue"


    // $ANTLR start "ruleFunctionValue"
    // InternalFPML.g:3244:1: ruleFunctionValue returns [EObject current=null] : ( (lv_value_0_0= rulePureLambda ) ) ;
    public final EObject ruleFunctionValue() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:3250:2: ( ( (lv_value_0_0= rulePureLambda ) ) )
            // InternalFPML.g:3251:2: ( (lv_value_0_0= rulePureLambda ) )
            {
            // InternalFPML.g:3251:2: ( (lv_value_0_0= rulePureLambda ) )
            // InternalFPML.g:3252:3: (lv_value_0_0= rulePureLambda )
            {
            // InternalFPML.g:3252:3: (lv_value_0_0= rulePureLambda )
            // InternalFPML.g:3253:4: lv_value_0_0= rulePureLambda
            {

            				newCompositeNode(grammarAccess.getFunctionValueAccess().getValuePureLambdaParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=rulePureLambda();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getFunctionValueRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"it.unibo.FPML.PureLambda");
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
    // $ANTLR end "ruleFunctionValue"


    // $ANTLR start "entryRuleDataValue"
    // InternalFPML.g:3273:1: entryRuleDataValue returns [EObject current=null] : iv_ruleDataValue= ruleDataValue EOF ;
    public final EObject entryRuleDataValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataValue = null;


        try {
            // InternalFPML.g:3273:50: (iv_ruleDataValue= ruleDataValue EOF )
            // InternalFPML.g:3274:2: iv_ruleDataValue= ruleDataValue EOF
            {
             newCompositeNode(grammarAccess.getDataValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataValue=ruleDataValue();

            state._fsp--;

             current =iv_ruleDataValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataValue"


    // $ANTLR start "ruleDataValue"
    // InternalFPML.g:3280:1: ruleDataValue returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_value_3_0= rulePureAdtValue ) ) otherlv_4= ')' ) ;
    public final EObject ruleDataValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:3286:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_value_3_0= rulePureAdtValue ) ) otherlv_4= ')' ) )
            // InternalFPML.g:3287:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_value_3_0= rulePureAdtValue ) ) otherlv_4= ')' )
            {
            // InternalFPML.g:3287:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_value_3_0= rulePureAdtValue ) ) otherlv_4= ')' )
            // InternalFPML.g:3288:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_value_3_0= rulePureAdtValue ) ) otherlv_4= ')'
            {
            // InternalFPML.g:3288:3: ()
            // InternalFPML.g:3289:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDataValueAccess().getDataValueAction_0(),
            					current);
            			

            }

            // InternalFPML.g:3295:3: ( (otherlv_1= RULE_ID ) )
            // InternalFPML.g:3296:4: (otherlv_1= RULE_ID )
            {
            // InternalFPML.g:3296:4: (otherlv_1= RULE_ID )
            // InternalFPML.g:3297:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataValueRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(otherlv_1, grammarAccess.getDataValueAccess().getTypePureDataCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getDataValueAccess().getLeftParenthesisKeyword_2());
            		
            // InternalFPML.g:3312:3: ( (lv_value_3_0= rulePureAdtValue ) )
            // InternalFPML.g:3313:4: (lv_value_3_0= rulePureAdtValue )
            {
            // InternalFPML.g:3313:4: (lv_value_3_0= rulePureAdtValue )
            // InternalFPML.g:3314:5: lv_value_3_0= rulePureAdtValue
            {

            					newCompositeNode(grammarAccess.getDataValueAccess().getValuePureAdtValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_23);
            lv_value_3_0=rulePureAdtValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataValueRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"it.unibo.FPML.PureAdtValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDataValueAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataValue"


    // $ANTLR start "entryRuleEffectFullDataValue"
    // InternalFPML.g:3339:1: entryRuleEffectFullDataValue returns [EObject current=null] : iv_ruleEffectFullDataValue= ruleEffectFullDataValue EOF ;
    public final EObject entryRuleEffectFullDataValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullDataValue = null;


        try {
            // InternalFPML.g:3339:60: (iv_ruleEffectFullDataValue= ruleEffectFullDataValue EOF )
            // InternalFPML.g:3340:2: iv_ruleEffectFullDataValue= ruleEffectFullDataValue EOF
            {
             newCompositeNode(grammarAccess.getEffectFullDataValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEffectFullDataValue=ruleEffectFullDataValue();

            state._fsp--;

             current =iv_ruleEffectFullDataValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEffectFullDataValue"


    // $ANTLR start "ruleEffectFullDataValue"
    // InternalFPML.g:3346:1: ruleEffectFullDataValue returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_value_3_0= ruleEffectFullAdtValue ) ) otherlv_4= ')' ) ;
    public final EObject ruleEffectFullDataValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:3352:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_value_3_0= ruleEffectFullAdtValue ) ) otherlv_4= ')' ) )
            // InternalFPML.g:3353:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_value_3_0= ruleEffectFullAdtValue ) ) otherlv_4= ')' )
            {
            // InternalFPML.g:3353:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_value_3_0= ruleEffectFullAdtValue ) ) otherlv_4= ')' )
            // InternalFPML.g:3354:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_value_3_0= ruleEffectFullAdtValue ) ) otherlv_4= ')'
            {
            // InternalFPML.g:3354:3: ()
            // InternalFPML.g:3355:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEffectFullDataValueAccess().getEffectFullDataValueAction_0(),
            					current);
            			

            }

            // InternalFPML.g:3361:3: ( (otherlv_1= RULE_ID ) )
            // InternalFPML.g:3362:4: (otherlv_1= RULE_ID )
            {
            // InternalFPML.g:3362:4: (otherlv_1= RULE_ID )
            // InternalFPML.g:3363:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEffectFullDataValueRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(otherlv_1, grammarAccess.getEffectFullDataValueAccess().getTypeEffectFullDataCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_37); 

            			newLeafNode(otherlv_2, grammarAccess.getEffectFullDataValueAccess().getLeftParenthesisKeyword_2());
            		
            // InternalFPML.g:3378:3: ( (lv_value_3_0= ruleEffectFullAdtValue ) )
            // InternalFPML.g:3379:4: (lv_value_3_0= ruleEffectFullAdtValue )
            {
            // InternalFPML.g:3379:4: (lv_value_3_0= ruleEffectFullAdtValue )
            // InternalFPML.g:3380:5: lv_value_3_0= ruleEffectFullAdtValue
            {

            					newCompositeNode(grammarAccess.getEffectFullDataValueAccess().getValueEffectFullAdtValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_23);
            lv_value_3_0=ruleEffectFullAdtValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEffectFullDataValueRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"it.unibo.FPML.EffectFullAdtValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEffectFullDataValueAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEffectFullDataValue"


    // $ANTLR start "entryRulePureValueRef"
    // InternalFPML.g:3405:1: entryRulePureValueRef returns [EObject current=null] : iv_rulePureValueRef= rulePureValueRef EOF ;
    public final EObject entryRulePureValueRef() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePureValueRef = null;


        try {
            // InternalFPML.g:3405:53: (iv_rulePureValueRef= rulePureValueRef EOF )
            // InternalFPML.g:3406:2: iv_rulePureValueRef= rulePureValueRef EOF
            {
             newCompositeNode(grammarAccess.getPureValueRefRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePureValueRef=rulePureValueRef();

            state._fsp--;

             current =iv_rulePureValueRef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePureValueRef"


    // $ANTLR start "rulePureValueRef"
    // InternalFPML.g:3412:1: rulePureValueRef returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject rulePureValueRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFPML.g:3418:2: ( ( () ( (otherlv_1= RULE_ID ) ) ) )
            // InternalFPML.g:3419:2: ( () ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalFPML.g:3419:2: ( () ( (otherlv_1= RULE_ID ) ) )
            // InternalFPML.g:3420:3: () ( (otherlv_1= RULE_ID ) )
            {
            // InternalFPML.g:3420:3: ()
            // InternalFPML.g:3421:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPureValueRefAccess().getPureValueRefAction_0(),
            					current);
            			

            }

            // InternalFPML.g:3427:3: ( (otherlv_1= RULE_ID ) )
            // InternalFPML.g:3428:4: (otherlv_1= RULE_ID )
            {
            // InternalFPML.g:3428:4: (otherlv_1= RULE_ID )
            // InternalFPML.g:3429:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPureValueRefRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getPureValueRefAccess().getValuePureValueCrossReference_1_0());
            				

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
    // $ANTLR end "rulePureValueRef"


    // $ANTLR start "entryRulePureLambda"
    // InternalFPML.g:3444:1: entryRulePureLambda returns [EObject current=null] : iv_rulePureLambda= rulePureLambda EOF ;
    public final EObject entryRulePureLambda() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePureLambda = null;


        try {
            // InternalFPML.g:3444:51: (iv_rulePureLambda= rulePureLambda EOF )
            // InternalFPML.g:3445:2: iv_rulePureLambda= rulePureLambda EOF
            {
             newCompositeNode(grammarAccess.getPureLambdaRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePureLambda=rulePureLambda();

            state._fsp--;

             current =iv_rulePureLambda; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePureLambda"


    // $ANTLR start "rulePureLambda"
    // InternalFPML.g:3451:1: rulePureLambda returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_arg_2_0= ruleArgument ) ) otherlv_3= ')' otherlv_4= ':' ( (lv_functionBody_5_0= ruleFunctionBodyPure ) ) ) ;
    public final EObject rulePureLambda() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_arg_2_0 = null;

        EObject lv_functionBody_5_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:3457:2: ( ( () otherlv_1= '(' ( (lv_arg_2_0= ruleArgument ) ) otherlv_3= ')' otherlv_4= ':' ( (lv_functionBody_5_0= ruleFunctionBodyPure ) ) ) )
            // InternalFPML.g:3458:2: ( () otherlv_1= '(' ( (lv_arg_2_0= ruleArgument ) ) otherlv_3= ')' otherlv_4= ':' ( (lv_functionBody_5_0= ruleFunctionBodyPure ) ) )
            {
            // InternalFPML.g:3458:2: ( () otherlv_1= '(' ( (lv_arg_2_0= ruleArgument ) ) otherlv_3= ')' otherlv_4= ':' ( (lv_functionBody_5_0= ruleFunctionBodyPure ) ) )
            // InternalFPML.g:3459:3: () otherlv_1= '(' ( (lv_arg_2_0= ruleArgument ) ) otherlv_3= ')' otherlv_4= ':' ( (lv_functionBody_5_0= ruleFunctionBodyPure ) )
            {
            // InternalFPML.g:3459:3: ()
            // InternalFPML.g:3460:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPureLambdaAccess().getPureLambdaAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getPureLambdaAccess().getLeftParenthesisKeyword_1());
            		
            // InternalFPML.g:3470:3: ( (lv_arg_2_0= ruleArgument ) )
            // InternalFPML.g:3471:4: (lv_arg_2_0= ruleArgument )
            {
            // InternalFPML.g:3471:4: (lv_arg_2_0= ruleArgument )
            // InternalFPML.g:3472:5: lv_arg_2_0= ruleArgument
            {

            					newCompositeNode(grammarAccess.getPureLambdaAccess().getArgArgumentParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_23);
            lv_arg_2_0=ruleArgument();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPureLambdaRule());
            					}
            					set(
            						current,
            						"arg",
            						lv_arg_2_0,
            						"it.unibo.FPML.Argument");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getPureLambdaAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,18,FOLLOW_24); 

            			newLeafNode(otherlv_4, grammarAccess.getPureLambdaAccess().getColonKeyword_4());
            		
            // InternalFPML.g:3497:3: ( (lv_functionBody_5_0= ruleFunctionBodyPure ) )
            // InternalFPML.g:3498:4: (lv_functionBody_5_0= ruleFunctionBodyPure )
            {
            // InternalFPML.g:3498:4: (lv_functionBody_5_0= ruleFunctionBodyPure )
            // InternalFPML.g:3499:5: lv_functionBody_5_0= ruleFunctionBodyPure
            {

            					newCompositeNode(grammarAccess.getPureLambdaAccess().getFunctionBodyFunctionBodyPureParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_functionBody_5_0=ruleFunctionBodyPure();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPureLambdaRule());
            					}
            					set(
            						current,
            						"functionBody",
            						lv_functionBody_5_0,
            						"it.unibo.FPML.FunctionBodyPure");
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
    // $ANTLR end "rulePureLambda"


    // $ANTLR start "entryRulePureAdtValue"
    // InternalFPML.g:3520:1: entryRulePureAdtValue returns [EObject current=null] : iv_rulePureAdtValue= rulePureAdtValue EOF ;
    public final EObject entryRulePureAdtValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePureAdtValue = null;


        try {
            // InternalFPML.g:3520:53: (iv_rulePureAdtValue= rulePureAdtValue EOF )
            // InternalFPML.g:3521:2: iv_rulePureAdtValue= rulePureAdtValue EOF
            {
             newCompositeNode(grammarAccess.getPureAdtValueRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePureAdtValue=rulePureAdtValue();

            state._fsp--;

             current =iv_rulePureAdtValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePureAdtValue"


    // $ANTLR start "rulePureAdtValue"
    // InternalFPML.g:3527:1: rulePureAdtValue returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_PureValueRef_2= rulePureValueRef | this_DataValue_3= ruleDataValue | this_PureSumValue_4= rulePureSumValue | this_FunctionValue_5= ruleFunctionValue | this_PureProdValue_6= rulePureProdValue ) ;
    public final EObject rulePureAdtValue() throws RecognitionException {
        EObject current = null;

        EObject this_IntValue_0 = null;

        EObject this_StringValue_1 = null;

        EObject this_PureValueRef_2 = null;

        EObject this_DataValue_3 = null;

        EObject this_PureSumValue_4 = null;

        EObject this_FunctionValue_5 = null;

        EObject this_PureProdValue_6 = null;



        	enterRule();

        try {
            // InternalFPML.g:3533:2: ( (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_PureValueRef_2= rulePureValueRef | this_DataValue_3= ruleDataValue | this_PureSumValue_4= rulePureSumValue | this_FunctionValue_5= ruleFunctionValue | this_PureProdValue_6= rulePureProdValue ) )
            // InternalFPML.g:3534:2: (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_PureValueRef_2= rulePureValueRef | this_DataValue_3= ruleDataValue | this_PureSumValue_4= rulePureSumValue | this_FunctionValue_5= ruleFunctionValue | this_PureProdValue_6= rulePureProdValue )
            {
            // InternalFPML.g:3534:2: (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_PureValueRef_2= rulePureValueRef | this_DataValue_3= ruleDataValue | this_PureSumValue_4= rulePureSumValue | this_FunctionValue_5= ruleFunctionValue | this_PureProdValue_6= rulePureProdValue )
            int alt31=7;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // InternalFPML.g:3535:3: this_IntValue_0= ruleIntValue
                    {

                    			newCompositeNode(grammarAccess.getPureAdtValueAccess().getIntValueParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntValue_0=ruleIntValue();

                    state._fsp--;


                    			current = this_IntValue_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFPML.g:3544:3: this_StringValue_1= ruleStringValue
                    {

                    			newCompositeNode(grammarAccess.getPureAdtValueAccess().getStringValueParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringValue_1=ruleStringValue();

                    state._fsp--;


                    			current = this_StringValue_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalFPML.g:3553:3: this_PureValueRef_2= rulePureValueRef
                    {

                    			newCompositeNode(grammarAccess.getPureAdtValueAccess().getPureValueRefParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_PureValueRef_2=rulePureValueRef();

                    state._fsp--;


                    			current = this_PureValueRef_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalFPML.g:3562:3: this_DataValue_3= ruleDataValue
                    {

                    			newCompositeNode(grammarAccess.getPureAdtValueAccess().getDataValueParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataValue_3=ruleDataValue();

                    state._fsp--;


                    			current = this_DataValue_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalFPML.g:3571:3: this_PureSumValue_4= rulePureSumValue
                    {

                    			newCompositeNode(grammarAccess.getPureAdtValueAccess().getPureSumValueParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_PureSumValue_4=rulePureSumValue();

                    state._fsp--;


                    			current = this_PureSumValue_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalFPML.g:3580:3: this_FunctionValue_5= ruleFunctionValue
                    {

                    			newCompositeNode(grammarAccess.getPureAdtValueAccess().getFunctionValueParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_FunctionValue_5=ruleFunctionValue();

                    state._fsp--;


                    			current = this_FunctionValue_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalFPML.g:3589:3: this_PureProdValue_6= rulePureProdValue
                    {

                    			newCompositeNode(grammarAccess.getPureAdtValueAccess().getPureProdValueParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_PureProdValue_6=rulePureProdValue();

                    state._fsp--;


                    			current = this_PureProdValue_6;
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
    // $ANTLR end "rulePureAdtValue"


    // $ANTLR start "entryRulePureProdValue"
    // InternalFPML.g:3601:1: entryRulePureProdValue returns [EObject current=null] : iv_rulePureProdValue= rulePureProdValue EOF ;
    public final EObject entryRulePureProdValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePureProdValue = null;


        try {
            // InternalFPML.g:3601:54: (iv_rulePureProdValue= rulePureProdValue EOF )
            // InternalFPML.g:3602:2: iv_rulePureProdValue= rulePureProdValue EOF
            {
             newCompositeNode(grammarAccess.getPureProdValueRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePureProdValue=rulePureProdValue();

            state._fsp--;

             current =iv_rulePureProdValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePureProdValue"


    // $ANTLR start "rulePureProdValue"
    // InternalFPML.g:3608:1: rulePureProdValue returns [EObject current=null] : (otherlv_0= '(' ( (lv_prodAdtElement1_1_0= rulePureAdtValue ) ) otherlv_2= ',' ( (lv_prodAdtElement2_3_0= rulePureAdtValue ) ) otherlv_4= ')' ) ;
    public final EObject rulePureProdValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_prodAdtElement1_1_0 = null;

        EObject lv_prodAdtElement2_3_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:3614:2: ( (otherlv_0= '(' ( (lv_prodAdtElement1_1_0= rulePureAdtValue ) ) otherlv_2= ',' ( (lv_prodAdtElement2_3_0= rulePureAdtValue ) ) otherlv_4= ')' ) )
            // InternalFPML.g:3615:2: (otherlv_0= '(' ( (lv_prodAdtElement1_1_0= rulePureAdtValue ) ) otherlv_2= ',' ( (lv_prodAdtElement2_3_0= rulePureAdtValue ) ) otherlv_4= ')' )
            {
            // InternalFPML.g:3615:2: (otherlv_0= '(' ( (lv_prodAdtElement1_1_0= rulePureAdtValue ) ) otherlv_2= ',' ( (lv_prodAdtElement2_3_0= rulePureAdtValue ) ) otherlv_4= ')' )
            // InternalFPML.g:3616:3: otherlv_0= '(' ( (lv_prodAdtElement1_1_0= rulePureAdtValue ) ) otherlv_2= ',' ( (lv_prodAdtElement2_3_0= rulePureAdtValue ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_36); 

            			newLeafNode(otherlv_0, grammarAccess.getPureProdValueAccess().getLeftParenthesisKeyword_0());
            		
            // InternalFPML.g:3620:3: ( (lv_prodAdtElement1_1_0= rulePureAdtValue ) )
            // InternalFPML.g:3621:4: (lv_prodAdtElement1_1_0= rulePureAdtValue )
            {
            // InternalFPML.g:3621:4: (lv_prodAdtElement1_1_0= rulePureAdtValue )
            // InternalFPML.g:3622:5: lv_prodAdtElement1_1_0= rulePureAdtValue
            {

            					newCompositeNode(grammarAccess.getPureProdValueAccess().getProdAdtElement1PureAdtValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_34);
            lv_prodAdtElement1_1_0=rulePureAdtValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPureProdValueRule());
            					}
            					set(
            						current,
            						"prodAdtElement1",
            						lv_prodAdtElement1_1_0,
            						"it.unibo.FPML.PureAdtValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getPureProdValueAccess().getCommaKeyword_2());
            		
            // InternalFPML.g:3643:3: ( (lv_prodAdtElement2_3_0= rulePureAdtValue ) )
            // InternalFPML.g:3644:4: (lv_prodAdtElement2_3_0= rulePureAdtValue )
            {
            // InternalFPML.g:3644:4: (lv_prodAdtElement2_3_0= rulePureAdtValue )
            // InternalFPML.g:3645:5: lv_prodAdtElement2_3_0= rulePureAdtValue
            {

            					newCompositeNode(grammarAccess.getPureProdValueAccess().getProdAdtElement2PureAdtValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_23);
            lv_prodAdtElement2_3_0=rulePureAdtValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPureProdValueRule());
            					}
            					set(
            						current,
            						"prodAdtElement2",
            						lv_prodAdtElement2_3_0,
            						"it.unibo.FPML.PureAdtValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getPureProdValueAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePureProdValue"


    // $ANTLR start "entryRulePureSumValue"
    // InternalFPML.g:3670:1: entryRulePureSumValue returns [EObject current=null] : iv_rulePureSumValue= rulePureSumValue EOF ;
    public final EObject entryRulePureSumValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePureSumValue = null;


        try {
            // InternalFPML.g:3670:53: (iv_rulePureSumValue= rulePureSumValue EOF )
            // InternalFPML.g:3671:2: iv_rulePureSumValue= rulePureSumValue EOF
            {
             newCompositeNode(grammarAccess.getPureSumValueRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePureSumValue=rulePureSumValue();

            state._fsp--;

             current =iv_rulePureSumValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePureSumValue"


    // $ANTLR start "rulePureSumValue"
    // InternalFPML.g:3677:1: rulePureSumValue returns [EObject current=null] : ( (otherlv_0= 'Left' otherlv_1= '(' ( (lv_sumAdtElement1_2_0= rulePureAdtValue ) ) otherlv_3= ')' ) | (otherlv_4= 'Right' otherlv_5= '(' ( (lv_sumAdtElement2_6_0= rulePureAdtValue ) ) otherlv_7= ')' ) ) ;
    public final EObject rulePureSumValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_sumAdtElement1_2_0 = null;

        EObject lv_sumAdtElement2_6_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:3683:2: ( ( (otherlv_0= 'Left' otherlv_1= '(' ( (lv_sumAdtElement1_2_0= rulePureAdtValue ) ) otherlv_3= ')' ) | (otherlv_4= 'Right' otherlv_5= '(' ( (lv_sumAdtElement2_6_0= rulePureAdtValue ) ) otherlv_7= ')' ) ) )
            // InternalFPML.g:3684:2: ( (otherlv_0= 'Left' otherlv_1= '(' ( (lv_sumAdtElement1_2_0= rulePureAdtValue ) ) otherlv_3= ')' ) | (otherlv_4= 'Right' otherlv_5= '(' ( (lv_sumAdtElement2_6_0= rulePureAdtValue ) ) otherlv_7= ')' ) )
            {
            // InternalFPML.g:3684:2: ( (otherlv_0= 'Left' otherlv_1= '(' ( (lv_sumAdtElement1_2_0= rulePureAdtValue ) ) otherlv_3= ')' ) | (otherlv_4= 'Right' otherlv_5= '(' ( (lv_sumAdtElement2_6_0= rulePureAdtValue ) ) otherlv_7= ')' ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==42) ) {
                alt32=1;
            }
            else if ( (LA32_0==43) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalFPML.g:3685:3: (otherlv_0= 'Left' otherlv_1= '(' ( (lv_sumAdtElement1_2_0= rulePureAdtValue ) ) otherlv_3= ')' )
                    {
                    // InternalFPML.g:3685:3: (otherlv_0= 'Left' otherlv_1= '(' ( (lv_sumAdtElement1_2_0= rulePureAdtValue ) ) otherlv_3= ')' )
                    // InternalFPML.g:3686:4: otherlv_0= 'Left' otherlv_1= '(' ( (lv_sumAdtElement1_2_0= rulePureAdtValue ) ) otherlv_3= ')'
                    {
                    otherlv_0=(Token)match(input,42,FOLLOW_21); 

                    				newLeafNode(otherlv_0, grammarAccess.getPureSumValueAccess().getLeftKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,24,FOLLOW_36); 

                    				newLeafNode(otherlv_1, grammarAccess.getPureSumValueAccess().getLeftParenthesisKeyword_0_1());
                    			
                    // InternalFPML.g:3694:4: ( (lv_sumAdtElement1_2_0= rulePureAdtValue ) )
                    // InternalFPML.g:3695:5: (lv_sumAdtElement1_2_0= rulePureAdtValue )
                    {
                    // InternalFPML.g:3695:5: (lv_sumAdtElement1_2_0= rulePureAdtValue )
                    // InternalFPML.g:3696:6: lv_sumAdtElement1_2_0= rulePureAdtValue
                    {

                    						newCompositeNode(grammarAccess.getPureSumValueAccess().getSumAdtElement1PureAdtValueParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_sumAdtElement1_2_0=rulePureAdtValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPureSumValueRule());
                    						}
                    						set(
                    							current,
                    							"sumAdtElement1",
                    							lv_sumAdtElement1_2_0,
                    							"it.unibo.FPML.PureAdtValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,26,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getPureSumValueAccess().getRightParenthesisKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFPML.g:3719:3: (otherlv_4= 'Right' otherlv_5= '(' ( (lv_sumAdtElement2_6_0= rulePureAdtValue ) ) otherlv_7= ')' )
                    {
                    // InternalFPML.g:3719:3: (otherlv_4= 'Right' otherlv_5= '(' ( (lv_sumAdtElement2_6_0= rulePureAdtValue ) ) otherlv_7= ')' )
                    // InternalFPML.g:3720:4: otherlv_4= 'Right' otherlv_5= '(' ( (lv_sumAdtElement2_6_0= rulePureAdtValue ) ) otherlv_7= ')'
                    {
                    otherlv_4=(Token)match(input,43,FOLLOW_21); 

                    				newLeafNode(otherlv_4, grammarAccess.getPureSumValueAccess().getRightKeyword_1_0());
                    			
                    otherlv_5=(Token)match(input,24,FOLLOW_36); 

                    				newLeafNode(otherlv_5, grammarAccess.getPureSumValueAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalFPML.g:3728:4: ( (lv_sumAdtElement2_6_0= rulePureAdtValue ) )
                    // InternalFPML.g:3729:5: (lv_sumAdtElement2_6_0= rulePureAdtValue )
                    {
                    // InternalFPML.g:3729:5: (lv_sumAdtElement2_6_0= rulePureAdtValue )
                    // InternalFPML.g:3730:6: lv_sumAdtElement2_6_0= rulePureAdtValue
                    {

                    						newCompositeNode(grammarAccess.getPureSumValueAccess().getSumAdtElement2PureAdtValueParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_sumAdtElement2_6_0=rulePureAdtValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPureSumValueRule());
                    						}
                    						set(
                    							current,
                    							"sumAdtElement2",
                    							lv_sumAdtElement2_6_0,
                    							"it.unibo.FPML.PureAdtValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,26,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getPureSumValueAccess().getRightParenthesisKeyword_1_3());
                    			

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
    // $ANTLR end "rulePureSumValue"


    // $ANTLR start "entryRuleEffectFullAdtValue"
    // InternalFPML.g:3756:1: entryRuleEffectFullAdtValue returns [EObject current=null] : iv_ruleEffectFullAdtValue= ruleEffectFullAdtValue EOF ;
    public final EObject entryRuleEffectFullAdtValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullAdtValue = null;


        try {
            // InternalFPML.g:3756:59: (iv_ruleEffectFullAdtValue= ruleEffectFullAdtValue EOF )
            // InternalFPML.g:3757:2: iv_ruleEffectFullAdtValue= ruleEffectFullAdtValue EOF
            {
             newCompositeNode(grammarAccess.getEffectFullAdtValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEffectFullAdtValue=ruleEffectFullAdtValue();

            state._fsp--;

             current =iv_ruleEffectFullAdtValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEffectFullAdtValue"


    // $ANTLR start "ruleEffectFullAdtValue"
    // InternalFPML.g:3763:1: ruleEffectFullAdtValue returns [EObject current=null] : ( (otherlv_0= 'IO' this_PureAdtValue_1= rulePureAdtValue ) | this_UnitValue_2= ruleUnitValue | this_EffectFullFunctionValue_3= ruleEffectFullFunctionValue | this_EffectFullProdValue_4= ruleEffectFullProdValue | this_EffectFullValueRef_5= ruleEffectFullValueRef | this_EffectFullSumValue_6= ruleEffectFullSumValue ) ;
    public final EObject ruleEffectFullAdtValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_PureAdtValue_1 = null;

        EObject this_UnitValue_2 = null;

        EObject this_EffectFullFunctionValue_3 = null;

        EObject this_EffectFullProdValue_4 = null;

        EObject this_EffectFullValueRef_5 = null;

        EObject this_EffectFullSumValue_6 = null;



        	enterRule();

        try {
            // InternalFPML.g:3769:2: ( ( (otherlv_0= 'IO' this_PureAdtValue_1= rulePureAdtValue ) | this_UnitValue_2= ruleUnitValue | this_EffectFullFunctionValue_3= ruleEffectFullFunctionValue | this_EffectFullProdValue_4= ruleEffectFullProdValue | this_EffectFullValueRef_5= ruleEffectFullValueRef | this_EffectFullSumValue_6= ruleEffectFullSumValue ) )
            // InternalFPML.g:3770:2: ( (otherlv_0= 'IO' this_PureAdtValue_1= rulePureAdtValue ) | this_UnitValue_2= ruleUnitValue | this_EffectFullFunctionValue_3= ruleEffectFullFunctionValue | this_EffectFullProdValue_4= ruleEffectFullProdValue | this_EffectFullValueRef_5= ruleEffectFullValueRef | this_EffectFullSumValue_6= ruleEffectFullSumValue )
            {
            // InternalFPML.g:3770:2: ( (otherlv_0= 'IO' this_PureAdtValue_1= rulePureAdtValue ) | this_UnitValue_2= ruleUnitValue | this_EffectFullFunctionValue_3= ruleEffectFullFunctionValue | this_EffectFullProdValue_4= ruleEffectFullProdValue | this_EffectFullValueRef_5= ruleEffectFullValueRef | this_EffectFullSumValue_6= ruleEffectFullSumValue )
            int alt33=6;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt33=1;
                }
                break;
            case 41:
                {
                alt33=2;
                }
                break;
            case 19:
            case 21:
            case 22:
            case 29:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 51:
                {
                alt33=3;
                }
                break;
            case RULE_ID:
                {
                int LA33_4 = input.LA(2);

                if ( (LA33_4==31) ) {
                    alt33=3;
                }
                else if ( (LA33_4==EOF||(LA33_4>=25 && LA33_4<=26)) ) {
                    alt33=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 4, input);

                    throw nvae;
                }
                }
                break;
            case 24:
                {
                alt33=4;
                }
                break;
            case 42:
            case 43:
                {
                alt33=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalFPML.g:3771:3: (otherlv_0= 'IO' this_PureAdtValue_1= rulePureAdtValue )
                    {
                    // InternalFPML.g:3771:3: (otherlv_0= 'IO' this_PureAdtValue_1= rulePureAdtValue )
                    // InternalFPML.g:3772:4: otherlv_0= 'IO' this_PureAdtValue_1= rulePureAdtValue
                    {
                    otherlv_0=(Token)match(input,27,FOLLOW_36); 

                    				newLeafNode(otherlv_0, grammarAccess.getEffectFullAdtValueAccess().getIOKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getEffectFullAdtValueAccess().getPureAdtValueParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_PureAdtValue_1=rulePureAdtValue();

                    state._fsp--;


                    				current = this_PureAdtValue_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFPML.g:3786:3: this_UnitValue_2= ruleUnitValue
                    {

                    			newCompositeNode(grammarAccess.getEffectFullAdtValueAccess().getUnitValueParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_UnitValue_2=ruleUnitValue();

                    state._fsp--;


                    			current = this_UnitValue_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalFPML.g:3795:3: this_EffectFullFunctionValue_3= ruleEffectFullFunctionValue
                    {

                    			newCompositeNode(grammarAccess.getEffectFullAdtValueAccess().getEffectFullFunctionValueParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_EffectFullFunctionValue_3=ruleEffectFullFunctionValue();

                    state._fsp--;


                    			current = this_EffectFullFunctionValue_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalFPML.g:3804:3: this_EffectFullProdValue_4= ruleEffectFullProdValue
                    {

                    			newCompositeNode(grammarAccess.getEffectFullAdtValueAccess().getEffectFullProdValueParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_EffectFullProdValue_4=ruleEffectFullProdValue();

                    state._fsp--;


                    			current = this_EffectFullProdValue_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalFPML.g:3813:3: this_EffectFullValueRef_5= ruleEffectFullValueRef
                    {

                    			newCompositeNode(grammarAccess.getEffectFullAdtValueAccess().getEffectFullValueRefParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_EffectFullValueRef_5=ruleEffectFullValueRef();

                    state._fsp--;


                    			current = this_EffectFullValueRef_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalFPML.g:3822:3: this_EffectFullSumValue_6= ruleEffectFullSumValue
                    {

                    			newCompositeNode(grammarAccess.getEffectFullAdtValueAccess().getEffectFullSumValueParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_EffectFullSumValue_6=ruleEffectFullSumValue();

                    state._fsp--;


                    			current = this_EffectFullSumValue_6;
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
    // $ANTLR end "ruleEffectFullAdtValue"


    // $ANTLR start "entryRuleEffectFullProdValue"
    // InternalFPML.g:3834:1: entryRuleEffectFullProdValue returns [EObject current=null] : iv_ruleEffectFullProdValue= ruleEffectFullProdValue EOF ;
    public final EObject entryRuleEffectFullProdValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullProdValue = null;


        try {
            // InternalFPML.g:3834:60: (iv_ruleEffectFullProdValue= ruleEffectFullProdValue EOF )
            // InternalFPML.g:3835:2: iv_ruleEffectFullProdValue= ruleEffectFullProdValue EOF
            {
             newCompositeNode(grammarAccess.getEffectFullProdValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEffectFullProdValue=ruleEffectFullProdValue();

            state._fsp--;

             current =iv_ruleEffectFullProdValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEffectFullProdValue"


    // $ANTLR start "ruleEffectFullProdValue"
    // InternalFPML.g:3841:1: ruleEffectFullProdValue returns [EObject current=null] : (otherlv_0= '(' ( (lv_prodAdtElement1_1_0= ruleEffectFullAdtValue ) ) otherlv_2= ',' ( (lv_prodAdtElement2_3_0= ruleEffectFullAdtValue ) ) otherlv_4= ')' ) ;
    public final EObject ruleEffectFullProdValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_prodAdtElement1_1_0 = null;

        EObject lv_prodAdtElement2_3_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:3847:2: ( (otherlv_0= '(' ( (lv_prodAdtElement1_1_0= ruleEffectFullAdtValue ) ) otherlv_2= ',' ( (lv_prodAdtElement2_3_0= ruleEffectFullAdtValue ) ) otherlv_4= ')' ) )
            // InternalFPML.g:3848:2: (otherlv_0= '(' ( (lv_prodAdtElement1_1_0= ruleEffectFullAdtValue ) ) otherlv_2= ',' ( (lv_prodAdtElement2_3_0= ruleEffectFullAdtValue ) ) otherlv_4= ')' )
            {
            // InternalFPML.g:3848:2: (otherlv_0= '(' ( (lv_prodAdtElement1_1_0= ruleEffectFullAdtValue ) ) otherlv_2= ',' ( (lv_prodAdtElement2_3_0= ruleEffectFullAdtValue ) ) otherlv_4= ')' )
            // InternalFPML.g:3849:3: otherlv_0= '(' ( (lv_prodAdtElement1_1_0= ruleEffectFullAdtValue ) ) otherlv_2= ',' ( (lv_prodAdtElement2_3_0= ruleEffectFullAdtValue ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_37); 

            			newLeafNode(otherlv_0, grammarAccess.getEffectFullProdValueAccess().getLeftParenthesisKeyword_0());
            		
            // InternalFPML.g:3853:3: ( (lv_prodAdtElement1_1_0= ruleEffectFullAdtValue ) )
            // InternalFPML.g:3854:4: (lv_prodAdtElement1_1_0= ruleEffectFullAdtValue )
            {
            // InternalFPML.g:3854:4: (lv_prodAdtElement1_1_0= ruleEffectFullAdtValue )
            // InternalFPML.g:3855:5: lv_prodAdtElement1_1_0= ruleEffectFullAdtValue
            {

            					newCompositeNode(grammarAccess.getEffectFullProdValueAccess().getProdAdtElement1EffectFullAdtValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_34);
            lv_prodAdtElement1_1_0=ruleEffectFullAdtValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEffectFullProdValueRule());
            					}
            					set(
            						current,
            						"prodAdtElement1",
            						lv_prodAdtElement1_1_0,
            						"it.unibo.FPML.EffectFullAdtValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_37); 

            			newLeafNode(otherlv_2, grammarAccess.getEffectFullProdValueAccess().getCommaKeyword_2());
            		
            // InternalFPML.g:3876:3: ( (lv_prodAdtElement2_3_0= ruleEffectFullAdtValue ) )
            // InternalFPML.g:3877:4: (lv_prodAdtElement2_3_0= ruleEffectFullAdtValue )
            {
            // InternalFPML.g:3877:4: (lv_prodAdtElement2_3_0= ruleEffectFullAdtValue )
            // InternalFPML.g:3878:5: lv_prodAdtElement2_3_0= ruleEffectFullAdtValue
            {

            					newCompositeNode(grammarAccess.getEffectFullProdValueAccess().getProdAdtElement2EffectFullAdtValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_23);
            lv_prodAdtElement2_3_0=ruleEffectFullAdtValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEffectFullProdValueRule());
            					}
            					set(
            						current,
            						"prodAdtElement2",
            						lv_prodAdtElement2_3_0,
            						"it.unibo.FPML.EffectFullAdtValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEffectFullProdValueAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEffectFullProdValue"


    // $ANTLR start "entryRuleEffectFullSumValue"
    // InternalFPML.g:3903:1: entryRuleEffectFullSumValue returns [EObject current=null] : iv_ruleEffectFullSumValue= ruleEffectFullSumValue EOF ;
    public final EObject entryRuleEffectFullSumValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullSumValue = null;


        try {
            // InternalFPML.g:3903:59: (iv_ruleEffectFullSumValue= ruleEffectFullSumValue EOF )
            // InternalFPML.g:3904:2: iv_ruleEffectFullSumValue= ruleEffectFullSumValue EOF
            {
             newCompositeNode(grammarAccess.getEffectFullSumValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEffectFullSumValue=ruleEffectFullSumValue();

            state._fsp--;

             current =iv_ruleEffectFullSumValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEffectFullSumValue"


    // $ANTLR start "ruleEffectFullSumValue"
    // InternalFPML.g:3910:1: ruleEffectFullSumValue returns [EObject current=null] : ( (otherlv_0= 'Left' otherlv_1= '(' ( (lv_sumAdtElement1_2_0= ruleEffectFullAdtValue ) ) otherlv_3= ')' ) | (otherlv_4= 'Right' otherlv_5= '(' ( (lv_sumAdtElement2_6_0= ruleEffectFullAdtValue ) ) otherlv_7= ')' ) ) ;
    public final EObject ruleEffectFullSumValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_sumAdtElement1_2_0 = null;

        EObject lv_sumAdtElement2_6_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:3916:2: ( ( (otherlv_0= 'Left' otherlv_1= '(' ( (lv_sumAdtElement1_2_0= ruleEffectFullAdtValue ) ) otherlv_3= ')' ) | (otherlv_4= 'Right' otherlv_5= '(' ( (lv_sumAdtElement2_6_0= ruleEffectFullAdtValue ) ) otherlv_7= ')' ) ) )
            // InternalFPML.g:3917:2: ( (otherlv_0= 'Left' otherlv_1= '(' ( (lv_sumAdtElement1_2_0= ruleEffectFullAdtValue ) ) otherlv_3= ')' ) | (otherlv_4= 'Right' otherlv_5= '(' ( (lv_sumAdtElement2_6_0= ruleEffectFullAdtValue ) ) otherlv_7= ')' ) )
            {
            // InternalFPML.g:3917:2: ( (otherlv_0= 'Left' otherlv_1= '(' ( (lv_sumAdtElement1_2_0= ruleEffectFullAdtValue ) ) otherlv_3= ')' ) | (otherlv_4= 'Right' otherlv_5= '(' ( (lv_sumAdtElement2_6_0= ruleEffectFullAdtValue ) ) otherlv_7= ')' ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==42) ) {
                alt34=1;
            }
            else if ( (LA34_0==43) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalFPML.g:3918:3: (otherlv_0= 'Left' otherlv_1= '(' ( (lv_sumAdtElement1_2_0= ruleEffectFullAdtValue ) ) otherlv_3= ')' )
                    {
                    // InternalFPML.g:3918:3: (otherlv_0= 'Left' otherlv_1= '(' ( (lv_sumAdtElement1_2_0= ruleEffectFullAdtValue ) ) otherlv_3= ')' )
                    // InternalFPML.g:3919:4: otherlv_0= 'Left' otherlv_1= '(' ( (lv_sumAdtElement1_2_0= ruleEffectFullAdtValue ) ) otherlv_3= ')'
                    {
                    otherlv_0=(Token)match(input,42,FOLLOW_21); 

                    				newLeafNode(otherlv_0, grammarAccess.getEffectFullSumValueAccess().getLeftKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,24,FOLLOW_37); 

                    				newLeafNode(otherlv_1, grammarAccess.getEffectFullSumValueAccess().getLeftParenthesisKeyword_0_1());
                    			
                    // InternalFPML.g:3927:4: ( (lv_sumAdtElement1_2_0= ruleEffectFullAdtValue ) )
                    // InternalFPML.g:3928:5: (lv_sumAdtElement1_2_0= ruleEffectFullAdtValue )
                    {
                    // InternalFPML.g:3928:5: (lv_sumAdtElement1_2_0= ruleEffectFullAdtValue )
                    // InternalFPML.g:3929:6: lv_sumAdtElement1_2_0= ruleEffectFullAdtValue
                    {

                    						newCompositeNode(grammarAccess.getEffectFullSumValueAccess().getSumAdtElement1EffectFullAdtValueParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_sumAdtElement1_2_0=ruleEffectFullAdtValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEffectFullSumValueRule());
                    						}
                    						set(
                    							current,
                    							"sumAdtElement1",
                    							lv_sumAdtElement1_2_0,
                    							"it.unibo.FPML.EffectFullAdtValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,26,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getEffectFullSumValueAccess().getRightParenthesisKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFPML.g:3952:3: (otherlv_4= 'Right' otherlv_5= '(' ( (lv_sumAdtElement2_6_0= ruleEffectFullAdtValue ) ) otherlv_7= ')' )
                    {
                    // InternalFPML.g:3952:3: (otherlv_4= 'Right' otherlv_5= '(' ( (lv_sumAdtElement2_6_0= ruleEffectFullAdtValue ) ) otherlv_7= ')' )
                    // InternalFPML.g:3953:4: otherlv_4= 'Right' otherlv_5= '(' ( (lv_sumAdtElement2_6_0= ruleEffectFullAdtValue ) ) otherlv_7= ')'
                    {
                    otherlv_4=(Token)match(input,43,FOLLOW_21); 

                    				newLeafNode(otherlv_4, grammarAccess.getEffectFullSumValueAccess().getRightKeyword_1_0());
                    			
                    otherlv_5=(Token)match(input,24,FOLLOW_37); 

                    				newLeafNode(otherlv_5, grammarAccess.getEffectFullSumValueAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalFPML.g:3961:4: ( (lv_sumAdtElement2_6_0= ruleEffectFullAdtValue ) )
                    // InternalFPML.g:3962:5: (lv_sumAdtElement2_6_0= ruleEffectFullAdtValue )
                    {
                    // InternalFPML.g:3962:5: (lv_sumAdtElement2_6_0= ruleEffectFullAdtValue )
                    // InternalFPML.g:3963:6: lv_sumAdtElement2_6_0= ruleEffectFullAdtValue
                    {

                    						newCompositeNode(grammarAccess.getEffectFullSumValueAccess().getSumAdtElement2EffectFullAdtValueParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_sumAdtElement2_6_0=ruleEffectFullAdtValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEffectFullSumValueRule());
                    						}
                    						set(
                    							current,
                    							"sumAdtElement2",
                    							lv_sumAdtElement2_6_0,
                    							"it.unibo.FPML.EffectFullAdtValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,26,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getEffectFullSumValueAccess().getRightParenthesisKeyword_1_3());
                    			

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
    // $ANTLR end "ruleEffectFullSumValue"


    // $ANTLR start "entryRulePrimitivePureFunction"
    // InternalFPML.g:3989:1: entryRulePrimitivePureFunction returns [EObject current=null] : iv_rulePrimitivePureFunction= rulePrimitivePureFunction EOF ;
    public final EObject entryRulePrimitivePureFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitivePureFunction = null;


        try {
            // InternalFPML.g:3989:62: (iv_rulePrimitivePureFunction= rulePrimitivePureFunction EOF )
            // InternalFPML.g:3990:2: iv_rulePrimitivePureFunction= rulePrimitivePureFunction EOF
            {
             newCompositeNode(grammarAccess.getPrimitivePureFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimitivePureFunction=rulePrimitivePureFunction();

            state._fsp--;

             current =iv_rulePrimitivePureFunction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitivePureFunction"


    // $ANTLR start "rulePrimitivePureFunction"
    // InternalFPML.g:3996:1: rulePrimitivePureFunction returns [EObject current=null] : (this_IntToString_0= ruleIntToString | this_IntPow_1= ruleIntPow | this_Plus_2= rulePlus | this_Minus_3= ruleMinus | this_Times_4= ruleTimes | this_Mod_5= ruleMod | this_ApplyF_6= ruleApplyF ) ;
    public final EObject rulePrimitivePureFunction() throws RecognitionException {
        EObject current = null;

        EObject this_IntToString_0 = null;

        EObject this_IntPow_1 = null;

        EObject this_Plus_2 = null;

        EObject this_Minus_3 = null;

        EObject this_Times_4 = null;

        EObject this_Mod_5 = null;

        EObject this_ApplyF_6 = null;



        	enterRule();

        try {
            // InternalFPML.g:4002:2: ( (this_IntToString_0= ruleIntToString | this_IntPow_1= ruleIntPow | this_Plus_2= rulePlus | this_Minus_3= ruleMinus | this_Times_4= ruleTimes | this_Mod_5= ruleMod | this_ApplyF_6= ruleApplyF ) )
            // InternalFPML.g:4003:2: (this_IntToString_0= ruleIntToString | this_IntPow_1= ruleIntPow | this_Plus_2= rulePlus | this_Minus_3= ruleMinus | this_Times_4= ruleTimes | this_Mod_5= ruleMod | this_ApplyF_6= ruleApplyF )
            {
            // InternalFPML.g:4003:2: (this_IntToString_0= ruleIntToString | this_IntPow_1= ruleIntPow | this_Plus_2= rulePlus | this_Minus_3= ruleMinus | this_Times_4= ruleTimes | this_Mod_5= ruleMod | this_ApplyF_6= ruleApplyF )
            int alt35=7;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt35=1;
                }
                break;
            case 45:
                {
                alt35=2;
                }
                break;
            case 21:
                {
                alt35=3;
                }
                break;
            case 46:
                {
                alt35=4;
                }
                break;
            case 22:
                {
                alt35=5;
                }
                break;
            case 47:
                {
                alt35=6;
                }
                break;
            case 48:
                {
                alt35=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalFPML.g:4004:3: this_IntToString_0= ruleIntToString
                    {

                    			newCompositeNode(grammarAccess.getPrimitivePureFunctionAccess().getIntToStringParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntToString_0=ruleIntToString();

                    state._fsp--;


                    			current = this_IntToString_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFPML.g:4013:3: this_IntPow_1= ruleIntPow
                    {

                    			newCompositeNode(grammarAccess.getPrimitivePureFunctionAccess().getIntPowParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntPow_1=ruleIntPow();

                    state._fsp--;


                    			current = this_IntPow_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalFPML.g:4022:3: this_Plus_2= rulePlus
                    {

                    			newCompositeNode(grammarAccess.getPrimitivePureFunctionAccess().getPlusParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Plus_2=rulePlus();

                    state._fsp--;


                    			current = this_Plus_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalFPML.g:4031:3: this_Minus_3= ruleMinus
                    {

                    			newCompositeNode(grammarAccess.getPrimitivePureFunctionAccess().getMinusParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Minus_3=ruleMinus();

                    state._fsp--;


                    			current = this_Minus_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalFPML.g:4040:3: this_Times_4= ruleTimes
                    {

                    			newCompositeNode(grammarAccess.getPrimitivePureFunctionAccess().getTimesParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Times_4=ruleTimes();

                    state._fsp--;


                    			current = this_Times_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalFPML.g:4049:3: this_Mod_5= ruleMod
                    {

                    			newCompositeNode(grammarAccess.getPrimitivePureFunctionAccess().getModParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Mod_5=ruleMod();

                    state._fsp--;


                    			current = this_Mod_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalFPML.g:4058:3: this_ApplyF_6= ruleApplyF
                    {

                    			newCompositeNode(grammarAccess.getPrimitivePureFunctionAccess().getApplyFParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_ApplyF_6=ruleApplyF();

                    state._fsp--;


                    			current = this_ApplyF_6;
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
    // $ANTLR end "rulePrimitivePureFunction"


    // $ANTLR start "entryRuleIntToString"
    // InternalFPML.g:4070:1: entryRuleIntToString returns [EObject current=null] : iv_ruleIntToString= ruleIntToString EOF ;
    public final EObject entryRuleIntToString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntToString = null;


        try {
            // InternalFPML.g:4070:52: (iv_ruleIntToString= ruleIntToString EOF )
            // InternalFPML.g:4071:2: iv_ruleIntToString= ruleIntToString EOF
            {
             newCompositeNode(grammarAccess.getIntToStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntToString=ruleIntToString();

            state._fsp--;

             current =iv_ruleIntToString; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntToString"


    // $ANTLR start "ruleIntToString"
    // InternalFPML.g:4077:1: ruleIntToString returns [EObject current=null] : ( () otherlv_1= 'IntToString' ) ;
    public final EObject ruleIntToString() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFPML.g:4083:2: ( ( () otherlv_1= 'IntToString' ) )
            // InternalFPML.g:4084:2: ( () otherlv_1= 'IntToString' )
            {
            // InternalFPML.g:4084:2: ( () otherlv_1= 'IntToString' )
            // InternalFPML.g:4085:3: () otherlv_1= 'IntToString'
            {
            // InternalFPML.g:4085:3: ()
            // InternalFPML.g:4086:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntToStringAccess().getIntToStringAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,44,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getIntToStringAccess().getIntToStringKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntToString"


    // $ANTLR start "entryRuleIntPow"
    // InternalFPML.g:4100:1: entryRuleIntPow returns [EObject current=null] : iv_ruleIntPow= ruleIntPow EOF ;
    public final EObject entryRuleIntPow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntPow = null;


        try {
            // InternalFPML.g:4100:47: (iv_ruleIntPow= ruleIntPow EOF )
            // InternalFPML.g:4101:2: iv_ruleIntPow= ruleIntPow EOF
            {
             newCompositeNode(grammarAccess.getIntPowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntPow=ruleIntPow();

            state._fsp--;

             current =iv_ruleIntPow; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntPow"


    // $ANTLR start "ruleIntPow"
    // InternalFPML.g:4107:1: ruleIntPow returns [EObject current=null] : ( () otherlv_1= 'IntPow' ) ;
    public final EObject ruleIntPow() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFPML.g:4113:2: ( ( () otherlv_1= 'IntPow' ) )
            // InternalFPML.g:4114:2: ( () otherlv_1= 'IntPow' )
            {
            // InternalFPML.g:4114:2: ( () otherlv_1= 'IntPow' )
            // InternalFPML.g:4115:3: () otherlv_1= 'IntPow'
            {
            // InternalFPML.g:4115:3: ()
            // InternalFPML.g:4116:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntPowAccess().getIntPowAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,45,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getIntPowAccess().getIntPowKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntPow"


    // $ANTLR start "entryRulePlus"
    // InternalFPML.g:4130:1: entryRulePlus returns [EObject current=null] : iv_rulePlus= rulePlus EOF ;
    public final EObject entryRulePlus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlus = null;


        try {
            // InternalFPML.g:4130:45: (iv_rulePlus= rulePlus EOF )
            // InternalFPML.g:4131:2: iv_rulePlus= rulePlus EOF
            {
             newCompositeNode(grammarAccess.getPlusRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlus=rulePlus();

            state._fsp--;

             current =iv_rulePlus; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlus"


    // $ANTLR start "rulePlus"
    // InternalFPML.g:4137:1: rulePlus returns [EObject current=null] : ( () otherlv_1= '+' ) ;
    public final EObject rulePlus() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFPML.g:4143:2: ( ( () otherlv_1= '+' ) )
            // InternalFPML.g:4144:2: ( () otherlv_1= '+' )
            {
            // InternalFPML.g:4144:2: ( () otherlv_1= '+' )
            // InternalFPML.g:4145:3: () otherlv_1= '+'
            {
            // InternalFPML.g:4145:3: ()
            // InternalFPML.g:4146:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPlusAccess().getPlusAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getPlusAccess().getPlusSignKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlus"


    // $ANTLR start "entryRuleMinus"
    // InternalFPML.g:4160:1: entryRuleMinus returns [EObject current=null] : iv_ruleMinus= ruleMinus EOF ;
    public final EObject entryRuleMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinus = null;


        try {
            // InternalFPML.g:4160:46: (iv_ruleMinus= ruleMinus EOF )
            // InternalFPML.g:4161:2: iv_ruleMinus= ruleMinus EOF
            {
             newCompositeNode(grammarAccess.getMinusRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMinus=ruleMinus();

            state._fsp--;

             current =iv_ruleMinus; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMinus"


    // $ANTLR start "ruleMinus"
    // InternalFPML.g:4167:1: ruleMinus returns [EObject current=null] : ( () otherlv_1= '-' ) ;
    public final EObject ruleMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFPML.g:4173:2: ( ( () otherlv_1= '-' ) )
            // InternalFPML.g:4174:2: ( () otherlv_1= '-' )
            {
            // InternalFPML.g:4174:2: ( () otherlv_1= '-' )
            // InternalFPML.g:4175:3: () otherlv_1= '-'
            {
            // InternalFPML.g:4175:3: ()
            // InternalFPML.g:4176:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMinusAccess().getMinusAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,46,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getMinusAccess().getHyphenMinusKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMinus"


    // $ANTLR start "entryRuleTimes"
    // InternalFPML.g:4190:1: entryRuleTimes returns [EObject current=null] : iv_ruleTimes= ruleTimes EOF ;
    public final EObject entryRuleTimes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimes = null;


        try {
            // InternalFPML.g:4190:46: (iv_ruleTimes= ruleTimes EOF )
            // InternalFPML.g:4191:2: iv_ruleTimes= ruleTimes EOF
            {
             newCompositeNode(grammarAccess.getTimesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTimes=ruleTimes();

            state._fsp--;

             current =iv_ruleTimes; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTimes"


    // $ANTLR start "ruleTimes"
    // InternalFPML.g:4197:1: ruleTimes returns [EObject current=null] : ( () otherlv_1= '*' ) ;
    public final EObject ruleTimes() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFPML.g:4203:2: ( ( () otherlv_1= '*' ) )
            // InternalFPML.g:4204:2: ( () otherlv_1= '*' )
            {
            // InternalFPML.g:4204:2: ( () otherlv_1= '*' )
            // InternalFPML.g:4205:3: () otherlv_1= '*'
            {
            // InternalFPML.g:4205:3: ()
            // InternalFPML.g:4206:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTimesAccess().getTimesAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getTimesAccess().getAsteriskKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimes"


    // $ANTLR start "entryRuleMod"
    // InternalFPML.g:4220:1: entryRuleMod returns [EObject current=null] : iv_ruleMod= ruleMod EOF ;
    public final EObject entryRuleMod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMod = null;


        try {
            // InternalFPML.g:4220:44: (iv_ruleMod= ruleMod EOF )
            // InternalFPML.g:4221:2: iv_ruleMod= ruleMod EOF
            {
             newCompositeNode(grammarAccess.getModRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMod=ruleMod();

            state._fsp--;

             current =iv_ruleMod; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMod"


    // $ANTLR start "ruleMod"
    // InternalFPML.g:4227:1: ruleMod returns [EObject current=null] : ( () otherlv_1= 'mod' ) ;
    public final EObject ruleMod() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFPML.g:4233:2: ( ( () otherlv_1= 'mod' ) )
            // InternalFPML.g:4234:2: ( () otherlv_1= 'mod' )
            {
            // InternalFPML.g:4234:2: ( () otherlv_1= 'mod' )
            // InternalFPML.g:4235:3: () otherlv_1= 'mod'
            {
            // InternalFPML.g:4235:3: ()
            // InternalFPML.g:4236:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getModAccess().getModAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,47,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getModAccess().getModKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMod"


    // $ANTLR start "entryRuleApplyF"
    // InternalFPML.g:4250:1: entryRuleApplyF returns [EObject current=null] : iv_ruleApplyF= ruleApplyF EOF ;
    public final EObject entryRuleApplyF() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplyF = null;


        try {
            // InternalFPML.g:4250:47: (iv_ruleApplyF= ruleApplyF EOF )
            // InternalFPML.g:4251:2: iv_ruleApplyF= ruleApplyF EOF
            {
             newCompositeNode(grammarAccess.getApplyFRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleApplyF=ruleApplyF();

            state._fsp--;

             current =iv_ruleApplyF; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleApplyF"


    // $ANTLR start "ruleApplyF"
    // InternalFPML.g:4257:1: ruleApplyF returns [EObject current=null] : ( () otherlv_1= 'applyF' ( (lv_functionType_2_0= rulePureFunctionType ) ) ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleApplyF() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_functionType_2_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:4263:2: ( ( () otherlv_1= 'applyF' ( (lv_functionType_2_0= rulePureFunctionType ) ) ( (otherlv_3= RULE_ID ) ) ) )
            // InternalFPML.g:4264:2: ( () otherlv_1= 'applyF' ( (lv_functionType_2_0= rulePureFunctionType ) ) ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalFPML.g:4264:2: ( () otherlv_1= 'applyF' ( (lv_functionType_2_0= rulePureFunctionType ) ) ( (otherlv_3= RULE_ID ) ) )
            // InternalFPML.g:4265:3: () otherlv_1= 'applyF' ( (lv_functionType_2_0= rulePureFunctionType ) ) ( (otherlv_3= RULE_ID ) )
            {
            // InternalFPML.g:4265:3: ()
            // InternalFPML.g:4266:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getApplyFAccess().getApplyFAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,48,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getApplyFAccess().getApplyFKeyword_1());
            		
            // InternalFPML.g:4276:3: ( (lv_functionType_2_0= rulePureFunctionType ) )
            // InternalFPML.g:4277:4: (lv_functionType_2_0= rulePureFunctionType )
            {
            // InternalFPML.g:4277:4: (lv_functionType_2_0= rulePureFunctionType )
            // InternalFPML.g:4278:5: lv_functionType_2_0= rulePureFunctionType
            {

            					newCompositeNode(grammarAccess.getApplyFAccess().getFunctionTypePureFunctionTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_20);
            lv_functionType_2_0=rulePureFunctionType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getApplyFRule());
            					}
            					set(
            						current,
            						"functionType",
            						lv_functionType_2_0,
            						"it.unibo.FPML.PureFunctionType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFPML.g:4295:3: ( (otherlv_3= RULE_ID ) )
            // InternalFPML.g:4296:4: (otherlv_3= RULE_ID )
            {
            // InternalFPML.g:4296:4: (otherlv_3= RULE_ID )
            // InternalFPML.g:4297:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getApplyFRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getApplyFAccess().getValuePureReferenceCrossReference_3_0());
            				

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
    // $ANTLR end "ruleApplyF"


    // $ANTLR start "entryRulePrimitiveEffectFullFunction"
    // InternalFPML.g:4312:1: entryRulePrimitiveEffectFullFunction returns [EObject current=null] : iv_rulePrimitiveEffectFullFunction= rulePrimitiveEffectFullFunction EOF ;
    public final EObject entryRulePrimitiveEffectFullFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveEffectFullFunction = null;


        try {
            // InternalFPML.g:4312:68: (iv_rulePrimitiveEffectFullFunction= rulePrimitiveEffectFullFunction EOF )
            // InternalFPML.g:4313:2: iv_rulePrimitiveEffectFullFunction= rulePrimitiveEffectFullFunction EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveEffectFullFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimitiveEffectFullFunction=rulePrimitiveEffectFullFunction();

            state._fsp--;

             current =iv_rulePrimitiveEffectFullFunction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitiveEffectFullFunction"


    // $ANTLR start "rulePrimitiveEffectFullFunction"
    // InternalFPML.g:4319:1: rulePrimitiveEffectFullFunction returns [EObject current=null] : (this_PrimitivePrint_0= rulePrimitivePrint | this_ApplyFIO_1= ruleApplyFIO ) ;
    public final EObject rulePrimitiveEffectFullFunction() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitivePrint_0 = null;

        EObject this_ApplyFIO_1 = null;



        	enterRule();

        try {
            // InternalFPML.g:4325:2: ( (this_PrimitivePrint_0= rulePrimitivePrint | this_ApplyFIO_1= ruleApplyFIO ) )
            // InternalFPML.g:4326:2: (this_PrimitivePrint_0= rulePrimitivePrint | this_ApplyFIO_1= ruleApplyFIO )
            {
            // InternalFPML.g:4326:2: (this_PrimitivePrint_0= rulePrimitivePrint | this_ApplyFIO_1= ruleApplyFIO )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==49) ) {
                alt36=1;
            }
            else if ( (LA36_0==51) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalFPML.g:4327:3: this_PrimitivePrint_0= rulePrimitivePrint
                    {

                    			newCompositeNode(grammarAccess.getPrimitiveEffectFullFunctionAccess().getPrimitivePrintParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrimitivePrint_0=rulePrimitivePrint();

                    state._fsp--;


                    			current = this_PrimitivePrint_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFPML.g:4336:3: this_ApplyFIO_1= ruleApplyFIO
                    {

                    			newCompositeNode(grammarAccess.getPrimitiveEffectFullFunctionAccess().getApplyFIOParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ApplyFIO_1=ruleApplyFIO();

                    state._fsp--;


                    			current = this_ApplyFIO_1;
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
    // $ANTLR end "rulePrimitiveEffectFullFunction"


    // $ANTLR start "entryRulePrimitivePrint"
    // InternalFPML.g:4348:1: entryRulePrimitivePrint returns [EObject current=null] : iv_rulePrimitivePrint= rulePrimitivePrint EOF ;
    public final EObject entryRulePrimitivePrint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitivePrint = null;


        try {
            // InternalFPML.g:4348:55: (iv_rulePrimitivePrint= rulePrimitivePrint EOF )
            // InternalFPML.g:4349:2: iv_rulePrimitivePrint= rulePrimitivePrint EOF
            {
             newCompositeNode(grammarAccess.getPrimitivePrintRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimitivePrint=rulePrimitivePrint();

            state._fsp--;

             current =iv_rulePrimitivePrint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitivePrint"


    // $ANTLR start "rulePrimitivePrint"
    // InternalFPML.g:4355:1: rulePrimitivePrint returns [EObject current=null] : ( () otherlv_1= 'print' ) ;
    public final EObject rulePrimitivePrint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFPML.g:4361:2: ( ( () otherlv_1= 'print' ) )
            // InternalFPML.g:4362:2: ( () otherlv_1= 'print' )
            {
            // InternalFPML.g:4362:2: ( () otherlv_1= 'print' )
            // InternalFPML.g:4363:3: () otherlv_1= 'print'
            {
            // InternalFPML.g:4363:3: ()
            // InternalFPML.g:4364:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPrimitivePrintAccess().getPrimitivePrintAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,49,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getPrimitivePrintAccess().getPrintKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitivePrint"


    // $ANTLR start "entryRulePrimitiveEffectFullValue"
    // InternalFPML.g:4378:1: entryRulePrimitiveEffectFullValue returns [EObject current=null] : iv_rulePrimitiveEffectFullValue= rulePrimitiveEffectFullValue EOF ;
    public final EObject entryRulePrimitiveEffectFullValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveEffectFullValue = null;


        try {
            // InternalFPML.g:4378:65: (iv_rulePrimitiveEffectFullValue= rulePrimitiveEffectFullValue EOF )
            // InternalFPML.g:4379:2: iv_rulePrimitiveEffectFullValue= rulePrimitiveEffectFullValue EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveEffectFullValueRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimitiveEffectFullValue=rulePrimitiveEffectFullValue();

            state._fsp--;

             current =iv_rulePrimitiveEffectFullValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitiveEffectFullValue"


    // $ANTLR start "rulePrimitiveEffectFullValue"
    // InternalFPML.g:4385:1: rulePrimitiveEffectFullValue returns [EObject current=null] : this_PrimitiveRandom_0= rulePrimitiveRandom ;
    public final EObject rulePrimitiveEffectFullValue() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveRandom_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:4391:2: (this_PrimitiveRandom_0= rulePrimitiveRandom )
            // InternalFPML.g:4392:2: this_PrimitiveRandom_0= rulePrimitiveRandom
            {

            		newCompositeNode(grammarAccess.getPrimitiveEffectFullValueAccess().getPrimitiveRandomParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_PrimitiveRandom_0=rulePrimitiveRandom();

            state._fsp--;


            		current = this_PrimitiveRandom_0;
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
    // $ANTLR end "rulePrimitiveEffectFullValue"


    // $ANTLR start "entryRulePrimitiveRandom"
    // InternalFPML.g:4403:1: entryRulePrimitiveRandom returns [EObject current=null] : iv_rulePrimitiveRandom= rulePrimitiveRandom EOF ;
    public final EObject entryRulePrimitiveRandom() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveRandom = null;


        try {
            // InternalFPML.g:4403:56: (iv_rulePrimitiveRandom= rulePrimitiveRandom EOF )
            // InternalFPML.g:4404:2: iv_rulePrimitiveRandom= rulePrimitiveRandom EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveRandomRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimitiveRandom=rulePrimitiveRandom();

            state._fsp--;

             current =iv_rulePrimitiveRandom; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitiveRandom"


    // $ANTLR start "rulePrimitiveRandom"
    // InternalFPML.g:4410:1: rulePrimitiveRandom returns [EObject current=null] : ( () otherlv_1= 'randomInt' ) ;
    public final EObject rulePrimitiveRandom() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFPML.g:4416:2: ( ( () otherlv_1= 'randomInt' ) )
            // InternalFPML.g:4417:2: ( () otherlv_1= 'randomInt' )
            {
            // InternalFPML.g:4417:2: ( () otherlv_1= 'randomInt' )
            // InternalFPML.g:4418:3: () otherlv_1= 'randomInt'
            {
            // InternalFPML.g:4418:3: ()
            // InternalFPML.g:4419:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPrimitiveRandomAccess().getPrimitiveRandomAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,50,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getPrimitiveRandomAccess().getRandomIntKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitiveRandom"


    // $ANTLR start "entryRuleApplyFIO"
    // InternalFPML.g:4433:1: entryRuleApplyFIO returns [EObject current=null] : iv_ruleApplyFIO= ruleApplyFIO EOF ;
    public final EObject entryRuleApplyFIO() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplyFIO = null;


        try {
            // InternalFPML.g:4433:49: (iv_ruleApplyFIO= ruleApplyFIO EOF )
            // InternalFPML.g:4434:2: iv_ruleApplyFIO= ruleApplyFIO EOF
            {
             newCompositeNode(grammarAccess.getApplyFIORule()); 
            pushFollow(FOLLOW_1);
            iv_ruleApplyFIO=ruleApplyFIO();

            state._fsp--;

             current =iv_ruleApplyFIO; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleApplyFIO"


    // $ANTLR start "ruleApplyFIO"
    // InternalFPML.g:4440:1: ruleApplyFIO returns [EObject current=null] : ( () otherlv_1= 'applyFIO' ( (lv_functionType_2_0= ruleEffectFullFunctionType ) ) ( (lv_value_3_0= ruleApplyFIOFactor ) ) ) ;
    public final EObject ruleApplyFIO() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_functionType_2_0 = null;

        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:4446:2: ( ( () otherlv_1= 'applyFIO' ( (lv_functionType_2_0= ruleEffectFullFunctionType ) ) ( (lv_value_3_0= ruleApplyFIOFactor ) ) ) )
            // InternalFPML.g:4447:2: ( () otherlv_1= 'applyFIO' ( (lv_functionType_2_0= ruleEffectFullFunctionType ) ) ( (lv_value_3_0= ruleApplyFIOFactor ) ) )
            {
            // InternalFPML.g:4447:2: ( () otherlv_1= 'applyFIO' ( (lv_functionType_2_0= ruleEffectFullFunctionType ) ) ( (lv_value_3_0= ruleApplyFIOFactor ) ) )
            // InternalFPML.g:4448:3: () otherlv_1= 'applyFIO' ( (lv_functionType_2_0= ruleEffectFullFunctionType ) ) ( (lv_value_3_0= ruleApplyFIOFactor ) )
            {
            // InternalFPML.g:4448:3: ()
            // InternalFPML.g:4449:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getApplyFIOAccess().getApplyFIOAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,51,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getApplyFIOAccess().getApplyFIOKeyword_1());
            		
            // InternalFPML.g:4459:3: ( (lv_functionType_2_0= ruleEffectFullFunctionType ) )
            // InternalFPML.g:4460:4: (lv_functionType_2_0= ruleEffectFullFunctionType )
            {
            // InternalFPML.g:4460:4: (lv_functionType_2_0= ruleEffectFullFunctionType )
            // InternalFPML.g:4461:5: lv_functionType_2_0= ruleEffectFullFunctionType
            {

            					newCompositeNode(grammarAccess.getApplyFIOAccess().getFunctionTypeEffectFullFunctionTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_39);
            lv_functionType_2_0=ruleEffectFullFunctionType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getApplyFIORule());
            					}
            					set(
            						current,
            						"functionType",
            						lv_functionType_2_0,
            						"it.unibo.FPML.EffectFullFunctionType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFPML.g:4478:3: ( (lv_value_3_0= ruleApplyFIOFactor ) )
            // InternalFPML.g:4479:4: (lv_value_3_0= ruleApplyFIOFactor )
            {
            // InternalFPML.g:4479:4: (lv_value_3_0= ruleApplyFIOFactor )
            // InternalFPML.g:4480:5: lv_value_3_0= ruleApplyFIOFactor
            {

            					newCompositeNode(grammarAccess.getApplyFIOAccess().getValueApplyFIOFactorParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_3_0=ruleApplyFIOFactor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getApplyFIORule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"it.unibo.FPML.ApplyFIOFactor");
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
    // $ANTLR end "ruleApplyFIO"


    // $ANTLR start "entryRuleApplyFIOFactor"
    // InternalFPML.g:4501:1: entryRuleApplyFIOFactor returns [EObject current=null] : iv_ruleApplyFIOFactor= ruleApplyFIOFactor EOF ;
    public final EObject entryRuleApplyFIOFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplyFIOFactor = null;


        try {
            // InternalFPML.g:4501:55: (iv_ruleApplyFIOFactor= ruleApplyFIOFactor EOF )
            // InternalFPML.g:4502:2: iv_ruleApplyFIOFactor= ruleApplyFIOFactor EOF
            {
             newCompositeNode(grammarAccess.getApplyFIOFactorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleApplyFIOFactor=ruleApplyFIOFactor();

            state._fsp--;

             current =iv_ruleApplyFIOFactor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleApplyFIOFactor"


    // $ANTLR start "ruleApplyFIOFactor"
    // InternalFPML.g:4508:1: ruleApplyFIOFactor returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | ( (lv_valuePrimitive_1_0= rulePrimitiveEffectFullValue ) ) ) ;
    public final EObject ruleApplyFIOFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_valuePrimitive_1_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:4514:2: ( ( ( (otherlv_0= RULE_ID ) ) | ( (lv_valuePrimitive_1_0= rulePrimitiveEffectFullValue ) ) ) )
            // InternalFPML.g:4515:2: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_valuePrimitive_1_0= rulePrimitiveEffectFullValue ) ) )
            {
            // InternalFPML.g:4515:2: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_valuePrimitive_1_0= rulePrimitiveEffectFullValue ) ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID) ) {
                alt37=1;
            }
            else if ( (LA37_0==50) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalFPML.g:4516:3: ( (otherlv_0= RULE_ID ) )
                    {
                    // InternalFPML.g:4516:3: ( (otherlv_0= RULE_ID ) )
                    // InternalFPML.g:4517:4: (otherlv_0= RULE_ID )
                    {
                    // InternalFPML.g:4517:4: (otherlv_0= RULE_ID )
                    // InternalFPML.g:4518:5: otherlv_0= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getApplyFIOFactorRule());
                    					}
                    				
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_0, grammarAccess.getApplyFIOFactorAccess().getValueReferenceEffectFullReferenceCrossReference_0_0());
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFPML.g:4530:3: ( (lv_valuePrimitive_1_0= rulePrimitiveEffectFullValue ) )
                    {
                    // InternalFPML.g:4530:3: ( (lv_valuePrimitive_1_0= rulePrimitiveEffectFullValue ) )
                    // InternalFPML.g:4531:4: (lv_valuePrimitive_1_0= rulePrimitiveEffectFullValue )
                    {
                    // InternalFPML.g:4531:4: (lv_valuePrimitive_1_0= rulePrimitiveEffectFullValue )
                    // InternalFPML.g:4532:5: lv_valuePrimitive_1_0= rulePrimitiveEffectFullValue
                    {

                    					newCompositeNode(grammarAccess.getApplyFIOFactorAccess().getValuePrimitivePrimitiveEffectFullValueParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_valuePrimitive_1_0=rulePrimitiveEffectFullValue();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getApplyFIOFactorRule());
                    					}
                    					set(
                    						current,
                    						"valuePrimitive",
                    						lv_valuePrimitive_1_0,
                    						"it.unibo.FPML.PrimitiveEffectFullValue");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleApplyFIOFactor"

    // Delegated rules


    protected DFA31 dfa31 = new DFA31(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\3\uffff\1\7\6\uffff";
    static final String dfa_3s = "\1\4\2\uffff\1\30\1\uffff\1\4\4\uffff";
    static final String dfa_4s = "\1\53\2\uffff\1\32\1\uffff\1\53\4\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\2\1\uffff\1\5\1\uffff\1\4\1\3\1\6\1\7";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\3\1\1\1\2\21\uffff\1\5\21\uffff\2\4",
            "",
            "",
            "\1\6\2\7",
            "",
            "\3\11\21\uffff\1\11\7\uffff\2\10\1\uffff\1\10\1\uffff\1\10\4\uffff\2\11",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "3534:2: (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_PureValueRef_2= rulePureValueRef | this_DataValue_3= ruleDataValue | this_PureSumValue_4= rulePureSumValue | this_FunctionValue_5= ruleFunctionValue | this_PureProdValue_6= rulePureProdValue )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000008800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000002B00080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000070L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008080000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000BF20028680010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000002B00000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000BF00020680010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000013F00000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x00000C0001000070L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x000BFE0029680010L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0004000000000010L});

}