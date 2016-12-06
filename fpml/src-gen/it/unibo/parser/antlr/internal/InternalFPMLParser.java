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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Pure'", "'{'", "'}'", "'Functions'", "'Data'", "'Value'", "'Effects'", "':'", "'def'", "'('", "','", "')'", "'IO'", "'main'", "'Undefined'", "'|>'", "'>>='", "'int'", "'String'", "'Unit'", "'ref'", "'refIO'", "'F'", "'<'", "'>'", "'FIO'", "'['", "']'", "'+'", "'*'", "'()'", "'Left'", "'Right'", "'intToString'", "'intPow'", "'-'", "'mod'", "'leftPair'", "'rightPair'", "'applyF'", "'print'", "'randomInt'", "'return'", "'currentTime'", "'applyFIO'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
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

                if ( (LA1_0==19) ) {
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

                if ( (LA6_0==19) ) {
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
    // InternalFPML.g:623:1: rulePureData returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_content_2_0= ruleValueType ) ) ) ;
    public final EObject rulePureData() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_content_2_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:629:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_content_2_0= ruleValueType ) ) ) )
            // InternalFPML.g:630:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_content_2_0= ruleValueType ) ) )
            {
            // InternalFPML.g:630:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_content_2_0= ruleValueType ) ) )
            // InternalFPML.g:631:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_content_2_0= ruleValueType ) )
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
            		
            // InternalFPML.g:653:3: ( (lv_content_2_0= ruleValueType ) )
            // InternalFPML.g:654:4: (lv_content_2_0= ruleValueType )
            {
            // InternalFPML.g:654:4: (lv_content_2_0= ruleValueType )
            // InternalFPML.g:655:5: lv_content_2_0= ruleValueType
            {

            					newCompositeNode(grammarAccess.getPureDataAccess().getContentValueTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_content_2_0=ruleValueType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPureDataRule());
            					}
            					set(
            						current,
            						"content",
            						lv_content_2_0,
            						"it.unibo.FPML.ValueType");
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


    // $ANTLR start "entryRuleEffectFullData"
    // InternalFPML.g:743:1: entryRuleEffectFullData returns [EObject current=null] : iv_ruleEffectFullData= ruleEffectFullData EOF ;
    public final EObject entryRuleEffectFullData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullData = null;


        try {
            // InternalFPML.g:743:55: (iv_ruleEffectFullData= ruleEffectFullData EOF )
            // InternalFPML.g:744:2: iv_ruleEffectFullData= ruleEffectFullData EOF
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
    // InternalFPML.g:750:1: ruleEffectFullData returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_content_2_0= ruleEffectFullType ) ) ) ;
    public final EObject ruleEffectFullData() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_content_2_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:756:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_content_2_0= ruleEffectFullType ) ) ) )
            // InternalFPML.g:757:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_content_2_0= ruleEffectFullType ) ) )
            {
            // InternalFPML.g:757:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_content_2_0= ruleEffectFullType ) ) )
            // InternalFPML.g:758:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_content_2_0= ruleEffectFullType ) )
            {
            // InternalFPML.g:758:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalFPML.g:759:4: (lv_name_0_0= RULE_ID )
            {
            // InternalFPML.g:759:4: (lv_name_0_0= RULE_ID )
            // InternalFPML.g:760:5: lv_name_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,18,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getEffectFullDataAccess().getColonKeyword_1());
            		
            // InternalFPML.g:780:3: ( (lv_content_2_0= ruleEffectFullType ) )
            // InternalFPML.g:781:4: (lv_content_2_0= ruleEffectFullType )
            {
            // InternalFPML.g:781:4: (lv_content_2_0= ruleEffectFullType )
            // InternalFPML.g:782:5: lv_content_2_0= ruleEffectFullType
            {

            					newCompositeNode(grammarAccess.getEffectFullDataAccess().getContentEffectFullTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_content_2_0=ruleEffectFullType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEffectFullDataRule());
            					}
            					set(
            						current,
            						"content",
            						lv_content_2_0,
            						"it.unibo.FPML.EffectFullType");
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
    // InternalFPML.g:803:1: entryRuleEffectFullValue returns [EObject current=null] : iv_ruleEffectFullValue= ruleEffectFullValue EOF ;
    public final EObject entryRuleEffectFullValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullValue = null;


        try {
            // InternalFPML.g:803:56: (iv_ruleEffectFullValue= ruleEffectFullValue EOF )
            // InternalFPML.g:804:2: iv_ruleEffectFullValue= ruleEffectFullValue EOF
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
    // InternalFPML.g:810:1: ruleEffectFullValue returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEffectFullExpression ) ) ) ;
    public final EObject ruleEffectFullValue() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:816:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEffectFullExpression ) ) ) )
            // InternalFPML.g:817:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEffectFullExpression ) ) )
            {
            // InternalFPML.g:817:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEffectFullExpression ) ) )
            // InternalFPML.g:818:3: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEffectFullExpression ) )
            {
            // InternalFPML.g:818:3: ()
            // InternalFPML.g:819:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEffectFullValueAccess().getEffectFullValueAction_0(),
            					current);
            			

            }

            // InternalFPML.g:825:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFPML.g:826:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFPML.g:826:4: (lv_name_1_0= RULE_ID )
            // InternalFPML.g:827:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,18,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getEffectFullValueAccess().getColonKeyword_2());
            		
            // InternalFPML.g:847:3: ( (lv_value_3_0= ruleEffectFullExpression ) )
            // InternalFPML.g:848:4: (lv_value_3_0= ruleEffectFullExpression )
            {
            // InternalFPML.g:848:4: (lv_value_3_0= ruleEffectFullExpression )
            // InternalFPML.g:849:5: lv_value_3_0= ruleEffectFullExpression
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


    // $ANTLR start "entryRulePureFunctionDefinition"
    // InternalFPML.g:870:1: entryRulePureFunctionDefinition returns [EObject current=null] : iv_rulePureFunctionDefinition= rulePureFunctionDefinition EOF ;
    public final EObject entryRulePureFunctionDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePureFunctionDefinition = null;


        try {
            // InternalFPML.g:870:63: (iv_rulePureFunctionDefinition= rulePureFunctionDefinition EOF )
            // InternalFPML.g:871:2: iv_rulePureFunctionDefinition= rulePureFunctionDefinition EOF
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
    // InternalFPML.g:877:1: rulePureFunctionDefinition returns [EObject current=null] : (otherlv_0= 'def' ( (lv_returnType_1_0= ruleValueType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_arg_4_0= ruleArgument ) ) (otherlv_5= ',' ( (lv_higherOrderArg_6_0= ruleAdditionalPureArgument ) ) )? otherlv_7= ')' otherlv_8= ':' otherlv_9= '{' ( (lv_functionBody_10_0= ruleFunctionBodyPure ) ) otherlv_11= '}' ) ;
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
            // InternalFPML.g:883:2: ( (otherlv_0= 'def' ( (lv_returnType_1_0= ruleValueType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_arg_4_0= ruleArgument ) ) (otherlv_5= ',' ( (lv_higherOrderArg_6_0= ruleAdditionalPureArgument ) ) )? otherlv_7= ')' otherlv_8= ':' otherlv_9= '{' ( (lv_functionBody_10_0= ruleFunctionBodyPure ) ) otherlv_11= '}' ) )
            // InternalFPML.g:884:2: (otherlv_0= 'def' ( (lv_returnType_1_0= ruleValueType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_arg_4_0= ruleArgument ) ) (otherlv_5= ',' ( (lv_higherOrderArg_6_0= ruleAdditionalPureArgument ) ) )? otherlv_7= ')' otherlv_8= ':' otherlv_9= '{' ( (lv_functionBody_10_0= ruleFunctionBodyPure ) ) otherlv_11= '}' )
            {
            // InternalFPML.g:884:2: (otherlv_0= 'def' ( (lv_returnType_1_0= ruleValueType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_arg_4_0= ruleArgument ) ) (otherlv_5= ',' ( (lv_higherOrderArg_6_0= ruleAdditionalPureArgument ) ) )? otherlv_7= ')' otherlv_8= ':' otherlv_9= '{' ( (lv_functionBody_10_0= ruleFunctionBodyPure ) ) otherlv_11= '}' )
            // InternalFPML.g:885:3: otherlv_0= 'def' ( (lv_returnType_1_0= ruleValueType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_arg_4_0= ruleArgument ) ) (otherlv_5= ',' ( (lv_higherOrderArg_6_0= ruleAdditionalPureArgument ) ) )? otherlv_7= ')' otherlv_8= ':' otherlv_9= '{' ( (lv_functionBody_10_0= ruleFunctionBodyPure ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getPureFunctionDefinitionAccess().getDefKeyword_0());
            		
            // InternalFPML.g:889:3: ( (lv_returnType_1_0= ruleValueType ) )
            // InternalFPML.g:890:4: (lv_returnType_1_0= ruleValueType )
            {
            // InternalFPML.g:890:4: (lv_returnType_1_0= ruleValueType )
            // InternalFPML.g:891:5: lv_returnType_1_0= ruleValueType
            {

            					newCompositeNode(grammarAccess.getPureFunctionDefinitionAccess().getReturnTypeValueTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_17);
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

            // InternalFPML.g:908:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalFPML.g:909:4: (lv_name_2_0= RULE_ID )
            {
            // InternalFPML.g:909:4: (lv_name_2_0= RULE_ID )
            // InternalFPML.g:910:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_18); 

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

            otherlv_3=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getPureFunctionDefinitionAccess().getLeftParenthesisKeyword_3());
            		
            // InternalFPML.g:930:3: ( (lv_arg_4_0= ruleArgument ) )
            // InternalFPML.g:931:4: (lv_arg_4_0= ruleArgument )
            {
            // InternalFPML.g:931:4: (lv_arg_4_0= ruleArgument )
            // InternalFPML.g:932:5: lv_arg_4_0= ruleArgument
            {

            					newCompositeNode(grammarAccess.getPureFunctionDefinitionAccess().getArgArgumentParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_19);
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

            // InternalFPML.g:949:3: (otherlv_5= ',' ( (lv_higherOrderArg_6_0= ruleAdditionalPureArgument ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalFPML.g:950:4: otherlv_5= ',' ( (lv_higherOrderArg_6_0= ruleAdditionalPureArgument ) )
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_13); 

                    				newLeafNode(otherlv_5, grammarAccess.getPureFunctionDefinitionAccess().getCommaKeyword_5_0());
                    			
                    // InternalFPML.g:954:4: ( (lv_higherOrderArg_6_0= ruleAdditionalPureArgument ) )
                    // InternalFPML.g:955:5: (lv_higherOrderArg_6_0= ruleAdditionalPureArgument )
                    {
                    // InternalFPML.g:955:5: (lv_higherOrderArg_6_0= ruleAdditionalPureArgument )
                    // InternalFPML.g:956:6: lv_higherOrderArg_6_0= ruleAdditionalPureArgument
                    {

                    						newCompositeNode(grammarAccess.getPureFunctionDefinitionAccess().getHigherOrderArgAdditionalPureArgumentParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_20);
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

            otherlv_7=(Token)match(input,22,FOLLOW_12); 

            			newLeafNode(otherlv_7, grammarAccess.getPureFunctionDefinitionAccess().getRightParenthesisKeyword_6());
            		
            otherlv_8=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_8, grammarAccess.getPureFunctionDefinitionAccess().getColonKeyword_7());
            		
            otherlv_9=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_9, grammarAccess.getPureFunctionDefinitionAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalFPML.g:986:3: ( (lv_functionBody_10_0= ruleFunctionBodyPure ) )
            // InternalFPML.g:987:4: (lv_functionBody_10_0= ruleFunctionBodyPure )
            {
            // InternalFPML.g:987:4: (lv_functionBody_10_0= ruleFunctionBodyPure )
            // InternalFPML.g:988:5: lv_functionBody_10_0= ruleFunctionBodyPure
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
    // InternalFPML.g:1013:1: entryRuleEffectFullFunctionDefinition returns [EObject current=null] : iv_ruleEffectFullFunctionDefinition= ruleEffectFullFunctionDefinition EOF ;
    public final EObject entryRuleEffectFullFunctionDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullFunctionDefinition = null;


        try {
            // InternalFPML.g:1013:69: (iv_ruleEffectFullFunctionDefinition= ruleEffectFullFunctionDefinition EOF )
            // InternalFPML.g:1014:2: iv_ruleEffectFullFunctionDefinition= ruleEffectFullFunctionDefinition EOF
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
    // InternalFPML.g:1020:1: ruleEffectFullFunctionDefinition returns [EObject current=null] : (otherlv_0= 'def' ( (lv_returnType_1_0= ruleIOType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_arg_4_0= ruleEffectFullArgument ) ) (otherlv_5= ',' ( (lv_higherOrderArg_6_0= ruleAdditionalEffectFullArgument ) ) )? otherlv_7= ')' otherlv_8= ':' otherlv_9= '{' ( (lv_functionBody_10_0= ruleFunctionBodyEffectFull ) ) otherlv_11= '}' ) ;
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
            // InternalFPML.g:1026:2: ( (otherlv_0= 'def' ( (lv_returnType_1_0= ruleIOType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_arg_4_0= ruleEffectFullArgument ) ) (otherlv_5= ',' ( (lv_higherOrderArg_6_0= ruleAdditionalEffectFullArgument ) ) )? otherlv_7= ')' otherlv_8= ':' otherlv_9= '{' ( (lv_functionBody_10_0= ruleFunctionBodyEffectFull ) ) otherlv_11= '}' ) )
            // InternalFPML.g:1027:2: (otherlv_0= 'def' ( (lv_returnType_1_0= ruleIOType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_arg_4_0= ruleEffectFullArgument ) ) (otherlv_5= ',' ( (lv_higherOrderArg_6_0= ruleAdditionalEffectFullArgument ) ) )? otherlv_7= ')' otherlv_8= ':' otherlv_9= '{' ( (lv_functionBody_10_0= ruleFunctionBodyEffectFull ) ) otherlv_11= '}' )
            {
            // InternalFPML.g:1027:2: (otherlv_0= 'def' ( (lv_returnType_1_0= ruleIOType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_arg_4_0= ruleEffectFullArgument ) ) (otherlv_5= ',' ( (lv_higherOrderArg_6_0= ruleAdditionalEffectFullArgument ) ) )? otherlv_7= ')' otherlv_8= ':' otherlv_9= '{' ( (lv_functionBody_10_0= ruleFunctionBodyEffectFull ) ) otherlv_11= '}' )
            // InternalFPML.g:1028:3: otherlv_0= 'def' ( (lv_returnType_1_0= ruleIOType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_arg_4_0= ruleEffectFullArgument ) ) (otherlv_5= ',' ( (lv_higherOrderArg_6_0= ruleAdditionalEffectFullArgument ) ) )? otherlv_7= ')' otherlv_8= ':' otherlv_9= '{' ( (lv_functionBody_10_0= ruleFunctionBodyEffectFull ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getEffectFullFunctionDefinitionAccess().getDefKeyword_0());
            		
            // InternalFPML.g:1032:3: ( (lv_returnType_1_0= ruleIOType ) )
            // InternalFPML.g:1033:4: (lv_returnType_1_0= ruleIOType )
            {
            // InternalFPML.g:1033:4: (lv_returnType_1_0= ruleIOType )
            // InternalFPML.g:1034:5: lv_returnType_1_0= ruleIOType
            {

            					newCompositeNode(grammarAccess.getEffectFullFunctionDefinitionAccess().getReturnTypeIOTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_17);
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

            // InternalFPML.g:1051:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalFPML.g:1052:4: (lv_name_2_0= RULE_ID )
            {
            // InternalFPML.g:1052:4: (lv_name_2_0= RULE_ID )
            // InternalFPML.g:1053:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_18); 

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

            otherlv_3=(Token)match(input,20,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getEffectFullFunctionDefinitionAccess().getLeftParenthesisKeyword_3());
            		
            // InternalFPML.g:1073:3: ( (lv_arg_4_0= ruleEffectFullArgument ) )
            // InternalFPML.g:1074:4: (lv_arg_4_0= ruleEffectFullArgument )
            {
            // InternalFPML.g:1074:4: (lv_arg_4_0= ruleEffectFullArgument )
            // InternalFPML.g:1075:5: lv_arg_4_0= ruleEffectFullArgument
            {

            					newCompositeNode(grammarAccess.getEffectFullFunctionDefinitionAccess().getArgEffectFullArgumentParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_19);
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

            // InternalFPML.g:1092:3: (otherlv_5= ',' ( (lv_higherOrderArg_6_0= ruleAdditionalEffectFullArgument ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalFPML.g:1093:4: otherlv_5= ',' ( (lv_higherOrderArg_6_0= ruleAdditionalEffectFullArgument ) )
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_23); 

                    				newLeafNode(otherlv_5, grammarAccess.getEffectFullFunctionDefinitionAccess().getCommaKeyword_5_0());
                    			
                    // InternalFPML.g:1097:4: ( (lv_higherOrderArg_6_0= ruleAdditionalEffectFullArgument ) )
                    // InternalFPML.g:1098:5: (lv_higherOrderArg_6_0= ruleAdditionalEffectFullArgument )
                    {
                    // InternalFPML.g:1098:5: (lv_higherOrderArg_6_0= ruleAdditionalEffectFullArgument )
                    // InternalFPML.g:1099:6: lv_higherOrderArg_6_0= ruleAdditionalEffectFullArgument
                    {

                    						newCompositeNode(grammarAccess.getEffectFullFunctionDefinitionAccess().getHigherOrderArgAdditionalEffectFullArgumentParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_20);
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

            otherlv_7=(Token)match(input,22,FOLLOW_12); 

            			newLeafNode(otherlv_7, grammarAccess.getEffectFullFunctionDefinitionAccess().getRightParenthesisKeyword_6());
            		
            otherlv_8=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_8, grammarAccess.getEffectFullFunctionDefinitionAccess().getColonKeyword_7());
            		
            otherlv_9=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_9, grammarAccess.getEffectFullFunctionDefinitionAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalFPML.g:1129:3: ( (lv_functionBody_10_0= ruleFunctionBodyEffectFull ) )
            // InternalFPML.g:1130:4: (lv_functionBody_10_0= ruleFunctionBodyEffectFull )
            {
            // InternalFPML.g:1130:4: (lv_functionBody_10_0= ruleFunctionBodyEffectFull )
            // InternalFPML.g:1131:5: lv_functionBody_10_0= ruleFunctionBodyEffectFull
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
    // InternalFPML.g:1156:1: entryRuleMainFunc returns [EObject current=null] : iv_ruleMainFunc= ruleMainFunc EOF ;
    public final EObject entryRuleMainFunc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMainFunc = null;


        try {
            // InternalFPML.g:1156:49: (iv_ruleMainFunc= ruleMainFunc EOF )
            // InternalFPML.g:1157:2: iv_ruleMainFunc= ruleMainFunc EOF
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
    // InternalFPML.g:1163:1: ruleMainFunc returns [EObject current=null] : (otherlv_0= 'IO' ( (lv_returnType_1_0= ruleUnitType ) ) otherlv_2= 'main' otherlv_3= ':' otherlv_4= '{' ( (lv_functionBody_5_0= ruleFunctionBodyEffectFull ) ) otherlv_6= '}' ) ;
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
            // InternalFPML.g:1169:2: ( (otherlv_0= 'IO' ( (lv_returnType_1_0= ruleUnitType ) ) otherlv_2= 'main' otherlv_3= ':' otherlv_4= '{' ( (lv_functionBody_5_0= ruleFunctionBodyEffectFull ) ) otherlv_6= '}' ) )
            // InternalFPML.g:1170:2: (otherlv_0= 'IO' ( (lv_returnType_1_0= ruleUnitType ) ) otherlv_2= 'main' otherlv_3= ':' otherlv_4= '{' ( (lv_functionBody_5_0= ruleFunctionBodyEffectFull ) ) otherlv_6= '}' )
            {
            // InternalFPML.g:1170:2: (otherlv_0= 'IO' ( (lv_returnType_1_0= ruleUnitType ) ) otherlv_2= 'main' otherlv_3= ':' otherlv_4= '{' ( (lv_functionBody_5_0= ruleFunctionBodyEffectFull ) ) otherlv_6= '}' )
            // InternalFPML.g:1171:3: otherlv_0= 'IO' ( (lv_returnType_1_0= ruleUnitType ) ) otherlv_2= 'main' otherlv_3= ':' otherlv_4= '{' ( (lv_functionBody_5_0= ruleFunctionBodyEffectFull ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getMainFuncAccess().getIOKeyword_0());
            		
            // InternalFPML.g:1175:3: ( (lv_returnType_1_0= ruleUnitType ) )
            // InternalFPML.g:1176:4: (lv_returnType_1_0= ruleUnitType )
            {
            // InternalFPML.g:1176:4: (lv_returnType_1_0= ruleUnitType )
            // InternalFPML.g:1177:5: lv_returnType_1_0= ruleUnitType
            {

            					newCompositeNode(grammarAccess.getMainFuncAccess().getReturnTypeUnitTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_25);
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

            otherlv_2=(Token)match(input,24,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getMainFuncAccess().getMainKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getMainFuncAccess().getColonKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_4, grammarAccess.getMainFuncAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalFPML.g:1206:3: ( (lv_functionBody_5_0= ruleFunctionBodyEffectFull ) )
            // InternalFPML.g:1207:4: (lv_functionBody_5_0= ruleFunctionBodyEffectFull )
            {
            // InternalFPML.g:1207:4: (lv_functionBody_5_0= ruleFunctionBodyEffectFull )
            // InternalFPML.g:1208:5: lv_functionBody_5_0= ruleFunctionBodyEffectFull
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
    // InternalFPML.g:1233:1: entryRuleAdditionalPureArgument returns [EObject current=null] : iv_ruleAdditionalPureArgument= ruleAdditionalPureArgument EOF ;
    public final EObject entryRuleAdditionalPureArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditionalPureArgument = null;


        try {
            // InternalFPML.g:1233:63: (iv_ruleAdditionalPureArgument= ruleAdditionalPureArgument EOF )
            // InternalFPML.g:1234:2: iv_ruleAdditionalPureArgument= ruleAdditionalPureArgument EOF
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
    // InternalFPML.g:1240:1: ruleAdditionalPureArgument returns [EObject current=null] : ( (lv_arg2_0_0= ruleArgument ) ) ;
    public final EObject ruleAdditionalPureArgument() throws RecognitionException {
        EObject current = null;

        EObject lv_arg2_0_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:1246:2: ( ( (lv_arg2_0_0= ruleArgument ) ) )
            // InternalFPML.g:1247:2: ( (lv_arg2_0_0= ruleArgument ) )
            {
            // InternalFPML.g:1247:2: ( (lv_arg2_0_0= ruleArgument ) )
            // InternalFPML.g:1248:3: (lv_arg2_0_0= ruleArgument )
            {
            // InternalFPML.g:1248:3: (lv_arg2_0_0= ruleArgument )
            // InternalFPML.g:1249:4: lv_arg2_0_0= ruleArgument
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
    // InternalFPML.g:1269:1: entryRuleAdditionalEffectFullArgument returns [EObject current=null] : iv_ruleAdditionalEffectFullArgument= ruleAdditionalEffectFullArgument EOF ;
    public final EObject entryRuleAdditionalEffectFullArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditionalEffectFullArgument = null;


        try {
            // InternalFPML.g:1269:69: (iv_ruleAdditionalEffectFullArgument= ruleAdditionalEffectFullArgument EOF )
            // InternalFPML.g:1270:2: iv_ruleAdditionalEffectFullArgument= ruleAdditionalEffectFullArgument EOF
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
    // InternalFPML.g:1276:1: ruleAdditionalEffectFullArgument returns [EObject current=null] : ( (lv_arg2_0_0= ruleEffectFullArgument ) ) ;
    public final EObject ruleAdditionalEffectFullArgument() throws RecognitionException {
        EObject current = null;

        EObject lv_arg2_0_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:1282:2: ( ( (lv_arg2_0_0= ruleEffectFullArgument ) ) )
            // InternalFPML.g:1283:2: ( (lv_arg2_0_0= ruleEffectFullArgument ) )
            {
            // InternalFPML.g:1283:2: ( (lv_arg2_0_0= ruleEffectFullArgument ) )
            // InternalFPML.g:1284:3: (lv_arg2_0_0= ruleEffectFullArgument )
            {
            // InternalFPML.g:1284:3: (lv_arg2_0_0= ruleEffectFullArgument )
            // InternalFPML.g:1285:4: lv_arg2_0_0= ruleEffectFullArgument
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


    // $ANTLR start "entryRuleFunction"
    // InternalFPML.g:1305:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalFPML.g:1305:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalFPML.g:1306:2: iv_ruleFunction= ruleFunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunction=ruleFunction();

            state._fsp--;

             current =iv_ruleFunction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalFPML.g:1312:1: ruleFunction returns [EObject current=null] : (this_EffectFullFunction_0= ruleEffectFullFunction | this_PureFunction_1= rulePureFunction ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        EObject this_EffectFullFunction_0 = null;

        EObject this_PureFunction_1 = null;



        	enterRule();

        try {
            // InternalFPML.g:1318:2: ( (this_EffectFullFunction_0= ruleEffectFullFunction | this_PureFunction_1= rulePureFunction ) )
            // InternalFPML.g:1319:2: (this_EffectFullFunction_0= ruleEffectFullFunction | this_PureFunction_1= rulePureFunction )
            {
            // InternalFPML.g:1319:2: (this_EffectFullFunction_0= ruleEffectFullFunction | this_PureFunction_1= rulePureFunction )
            int alt9=2;
            switch ( input.LA(1) ) {
            case 19:
                {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==23) ) {
                    alt9=1;
                }
                else if ( ((LA9_1>=28 && LA9_1<=31)||LA9_1==33||LA9_1==37) ) {
                    alt9=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
                }
                break;
            case 51:
            case 53:
            case 55:
                {
                alt9=1;
                }
                break;
            case 48:
                {
                int LA9_3 = input.LA(2);

                if ( (LA9_3==37) ) {
                    int LA9_6 = input.LA(3);

                    if ( ((LA9_6>=28 && LA9_6<=31)||LA9_6==33||LA9_6==37) ) {
                        alt9=2;
                    }
                    else if ( (LA9_6==23) ) {
                        alt9=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 6, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 3, input);

                    throw nvae;
                }
                }
                break;
            case 49:
                {
                int LA9_4 = input.LA(2);

                if ( (LA9_4==37) ) {
                    int LA9_7 = input.LA(3);

                    if ( (LA9_7==23) ) {
                        alt9=1;
                    }
                    else if ( ((LA9_7>=28 && LA9_7<=31)||LA9_7==33||LA9_7==37) ) {
                        alt9=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 7, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 4, input);

                    throw nvae;
                }
                }
                break;
            case 28:
            case 29:
            case 30:
            case 31:
            case 33:
            case 37:
            case 39:
            case 40:
            case 44:
            case 45:
            case 46:
            case 47:
            case 50:
                {
                alt9=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalFPML.g:1320:3: this_EffectFullFunction_0= ruleEffectFullFunction
                    {

                    			newCompositeNode(grammarAccess.getFunctionAccess().getEffectFullFunctionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EffectFullFunction_0=ruleEffectFullFunction();

                    state._fsp--;


                    			current = this_EffectFullFunction_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFPML.g:1329:3: this_PureFunction_1= rulePureFunction
                    {

                    			newCompositeNode(grammarAccess.getFunctionAccess().getPureFunctionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PureFunction_1=rulePureFunction();

                    state._fsp--;


                    			current = this_PureFunction_1;
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
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRulePureFunction"
    // InternalFPML.g:1341:1: entryRulePureFunction returns [EObject current=null] : iv_rulePureFunction= rulePureFunction EOF ;
    public final EObject entryRulePureFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePureFunction = null;


        try {
            // InternalFPML.g:1341:53: (iv_rulePureFunction= rulePureFunction EOF )
            // InternalFPML.g:1342:2: iv_rulePureFunction= rulePureFunction EOF
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
    // InternalFPML.g:1348:1: rulePureFunction returns [EObject current=null] : (this_PureFunctionDefinition_0= rulePureFunctionDefinition | this_PrimitivePureFunction_1= rulePrimitivePureFunction | this_Argument_2= ruleArgument ) ;
    public final EObject rulePureFunction() throws RecognitionException {
        EObject current = null;

        EObject this_PureFunctionDefinition_0 = null;

        EObject this_PrimitivePureFunction_1 = null;

        EObject this_Argument_2 = null;



        	enterRule();

        try {
            // InternalFPML.g:1354:2: ( (this_PureFunctionDefinition_0= rulePureFunctionDefinition | this_PrimitivePureFunction_1= rulePrimitivePureFunction | this_Argument_2= ruleArgument ) )
            // InternalFPML.g:1355:2: (this_PureFunctionDefinition_0= rulePureFunctionDefinition | this_PrimitivePureFunction_1= rulePrimitivePureFunction | this_Argument_2= ruleArgument )
            {
            // InternalFPML.g:1355:2: (this_PureFunctionDefinition_0= rulePureFunctionDefinition | this_PrimitivePureFunction_1= rulePrimitivePureFunction | this_Argument_2= ruleArgument )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt10=1;
                }
                break;
            case 39:
            case 40:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
                {
                alt10=2;
                }
                break;
            case 28:
            case 29:
            case 30:
            case 31:
            case 33:
            case 37:
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
                    // InternalFPML.g:1356:3: this_PureFunctionDefinition_0= rulePureFunctionDefinition
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
                    // InternalFPML.g:1365:3: this_PrimitivePureFunction_1= rulePrimitivePureFunction
                    {

                    			newCompositeNode(grammarAccess.getPureFunctionAccess().getPrimitivePureFunctionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrimitivePureFunction_1=rulePrimitivePureFunction();

                    state._fsp--;


                    			current = this_PrimitivePureFunction_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalFPML.g:1374:3: this_Argument_2= ruleArgument
                    {

                    			newCompositeNode(grammarAccess.getPureFunctionAccess().getArgumentParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Argument_2=ruleArgument();

                    state._fsp--;


                    			current = this_Argument_2;
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
    // InternalFPML.g:1386:1: entryRuleEffectFullFunction returns [EObject current=null] : iv_ruleEffectFullFunction= ruleEffectFullFunction EOF ;
    public final EObject entryRuleEffectFullFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullFunction = null;


        try {
            // InternalFPML.g:1386:59: (iv_ruleEffectFullFunction= ruleEffectFullFunction EOF )
            // InternalFPML.g:1387:2: iv_ruleEffectFullFunction= ruleEffectFullFunction EOF
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
    // InternalFPML.g:1393:1: ruleEffectFullFunction returns [EObject current=null] : (this_EffectFullFunctionDefinition_0= ruleEffectFullFunctionDefinition | this_PrimitiveEffectFullFunction_1= rulePrimitiveEffectFullFunction ) ;
    public final EObject ruleEffectFullFunction() throws RecognitionException {
        EObject current = null;

        EObject this_EffectFullFunctionDefinition_0 = null;

        EObject this_PrimitiveEffectFullFunction_1 = null;



        	enterRule();

        try {
            // InternalFPML.g:1399:2: ( (this_EffectFullFunctionDefinition_0= ruleEffectFullFunctionDefinition | this_PrimitiveEffectFullFunction_1= rulePrimitiveEffectFullFunction ) )
            // InternalFPML.g:1400:2: (this_EffectFullFunctionDefinition_0= ruleEffectFullFunctionDefinition | this_PrimitiveEffectFullFunction_1= rulePrimitiveEffectFullFunction )
            {
            // InternalFPML.g:1400:2: (this_EffectFullFunctionDefinition_0= ruleEffectFullFunctionDefinition | this_PrimitiveEffectFullFunction_1= rulePrimitiveEffectFullFunction )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            else if ( ((LA11_0>=48 && LA11_0<=49)||LA11_0==51||LA11_0==53||LA11_0==55) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalFPML.g:1401:3: this_EffectFullFunctionDefinition_0= ruleEffectFullFunctionDefinition
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
                    // InternalFPML.g:1410:3: this_PrimitiveEffectFullFunction_1= rulePrimitiveEffectFullFunction
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
    // InternalFPML.g:1422:1: entryRulePrimitiveFunction returns [EObject current=null] : iv_rulePrimitiveFunction= rulePrimitiveFunction EOF ;
    public final EObject entryRulePrimitiveFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveFunction = null;


        try {
            // InternalFPML.g:1422:58: (iv_rulePrimitiveFunction= rulePrimitiveFunction EOF )
            // InternalFPML.g:1423:2: iv_rulePrimitiveFunction= rulePrimitiveFunction EOF
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
    // InternalFPML.g:1429:1: rulePrimitiveFunction returns [EObject current=null] : (this_PrimitiveEffectFullFunction_0= rulePrimitiveEffectFullFunction | this_PrimitivePureFunction_1= rulePrimitivePureFunction | this_PrimitiveEffectFullValue_2= rulePrimitiveEffectFullValue ) ;
    public final EObject rulePrimitiveFunction() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveEffectFullFunction_0 = null;

        EObject this_PrimitivePureFunction_1 = null;

        EObject this_PrimitiveEffectFullValue_2 = null;



        	enterRule();

        try {
            // InternalFPML.g:1435:2: ( (this_PrimitiveEffectFullFunction_0= rulePrimitiveEffectFullFunction | this_PrimitivePureFunction_1= rulePrimitivePureFunction | this_PrimitiveEffectFullValue_2= rulePrimitiveEffectFullValue ) )
            // InternalFPML.g:1436:2: (this_PrimitiveEffectFullFunction_0= rulePrimitiveEffectFullFunction | this_PrimitivePureFunction_1= rulePrimitivePureFunction | this_PrimitiveEffectFullValue_2= rulePrimitiveEffectFullValue )
            {
            // InternalFPML.g:1436:2: (this_PrimitiveEffectFullFunction_0= rulePrimitiveEffectFullFunction | this_PrimitivePureFunction_1= rulePrimitivePureFunction | this_PrimitiveEffectFullValue_2= rulePrimitiveEffectFullValue )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 51:
            case 53:
            case 55:
                {
                alt12=1;
                }
                break;
            case 48:
                {
                int LA12_2 = input.LA(2);

                if ( (LA12_2==37) ) {
                    int LA12_6 = input.LA(3);

                    if ( ((LA12_6>=28 && LA12_6<=31)||LA12_6==33||LA12_6==37) ) {
                        alt12=2;
                    }
                    else if ( (LA12_6==23) ) {
                        alt12=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 6, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 2, input);

                    throw nvae;
                }
                }
                break;
            case 49:
                {
                int LA12_3 = input.LA(2);

                if ( (LA12_3==37) ) {
                    int LA12_7 = input.LA(3);

                    if ( ((LA12_7>=28 && LA12_7<=31)||LA12_7==33||LA12_7==37) ) {
                        alt12=2;
                    }
                    else if ( (LA12_7==23) ) {
                        alt12=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 7, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 3, input);

                    throw nvae;
                }
                }
                break;
            case 39:
            case 40:
            case 44:
            case 45:
            case 46:
            case 47:
            case 50:
                {
                alt12=2;
                }
                break;
            case 52:
            case 54:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalFPML.g:1437:3: this_PrimitiveEffectFullFunction_0= rulePrimitiveEffectFullFunction
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
                    // InternalFPML.g:1446:3: this_PrimitivePureFunction_1= rulePrimitivePureFunction
                    {

                    			newCompositeNode(grammarAccess.getPrimitiveFunctionAccess().getPrimitivePureFunctionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrimitivePureFunction_1=rulePrimitivePureFunction();

                    state._fsp--;


                    			current = this_PrimitivePureFunction_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalFPML.g:1455:3: this_PrimitiveEffectFullValue_2= rulePrimitiveEffectFullValue
                    {

                    			newCompositeNode(grammarAccess.getPrimitiveFunctionAccess().getPrimitiveEffectFullValueParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrimitiveEffectFullValue_2=rulePrimitiveEffectFullValue();

                    state._fsp--;


                    			current = this_PrimitiveEffectFullValue_2;
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
    // InternalFPML.g:1467:1: entryRuleEffectFullArgument returns [EObject current=null] : iv_ruleEffectFullArgument= ruleEffectFullArgument EOF ;
    public final EObject entryRuleEffectFullArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullArgument = null;


        try {
            // InternalFPML.g:1467:59: (iv_ruleEffectFullArgument= ruleEffectFullArgument EOF )
            // InternalFPML.g:1468:2: iv_ruleEffectFullArgument= ruleEffectFullArgument EOF
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
    // InternalFPML.g:1474:1: ruleEffectFullArgument returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEffectFullArgument() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:1480:2: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalFPML.g:1481:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalFPML.g:1481:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalFPML.g:1482:3: ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalFPML.g:1482:3: ( (lv_type_0_0= ruleType ) )
            // InternalFPML.g:1483:4: (lv_type_0_0= ruleType )
            {
            // InternalFPML.g:1483:4: (lv_type_0_0= ruleType )
            // InternalFPML.g:1484:5: lv_type_0_0= ruleType
            {

            					newCompositeNode(grammarAccess.getEffectFullArgumentAccess().getTypeTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
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

            // InternalFPML.g:1501:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFPML.g:1502:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFPML.g:1502:4: (lv_name_1_0= RULE_ID )
            // InternalFPML.g:1503:5: lv_name_1_0= RULE_ID
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
    // InternalFPML.g:1523:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // InternalFPML.g:1523:49: (iv_ruleArgument= ruleArgument EOF )
            // InternalFPML.g:1524:2: iv_ruleArgument= ruleArgument EOF
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
    // InternalFPML.g:1530:1: ruleArgument returns [EObject current=null] : ( ( (lv_type_0_0= ruleValueType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:1536:2: ( ( ( (lv_type_0_0= ruleValueType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalFPML.g:1537:2: ( ( (lv_type_0_0= ruleValueType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalFPML.g:1537:2: ( ( (lv_type_0_0= ruleValueType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalFPML.g:1538:3: ( (lv_type_0_0= ruleValueType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalFPML.g:1538:3: ( (lv_type_0_0= ruleValueType ) )
            // InternalFPML.g:1539:4: (lv_type_0_0= ruleValueType )
            {
            // InternalFPML.g:1539:4: (lv_type_0_0= ruleValueType )
            // InternalFPML.g:1540:5: lv_type_0_0= ruleValueType
            {

            					newCompositeNode(grammarAccess.getArgumentAccess().getTypeValueTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
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

            // InternalFPML.g:1557:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFPML.g:1558:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFPML.g:1558:4: (lv_name_1_0= RULE_ID )
            // InternalFPML.g:1559:5: lv_name_1_0= RULE_ID
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
    // InternalFPML.g:1579:1: entryRuleFunctionBodyPure returns [EObject current=null] : iv_ruleFunctionBodyPure= ruleFunctionBodyPure EOF ;
    public final EObject entryRuleFunctionBodyPure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionBodyPure = null;


        try {
            // InternalFPML.g:1579:57: (iv_ruleFunctionBodyPure= ruleFunctionBodyPure EOF )
            // InternalFPML.g:1580:2: iv_ruleFunctionBodyPure= ruleFunctionBodyPure EOF
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
    // InternalFPML.g:1586:1: ruleFunctionBodyPure returns [EObject current=null] : (this_EmptyFunctionBody_0= ruleEmptyFunctionBody | this_CompositionFunctionBodyPure_1= ruleCompositionFunctionBodyPure ) ;
    public final EObject ruleFunctionBodyPure() throws RecognitionException {
        EObject current = null;

        EObject this_EmptyFunctionBody_0 = null;

        EObject this_CompositionFunctionBodyPure_1 = null;



        	enterRule();

        try {
            // InternalFPML.g:1592:2: ( (this_EmptyFunctionBody_0= ruleEmptyFunctionBody | this_CompositionFunctionBodyPure_1= ruleCompositionFunctionBodyPure ) )
            // InternalFPML.g:1593:2: (this_EmptyFunctionBody_0= ruleEmptyFunctionBody | this_CompositionFunctionBodyPure_1= ruleCompositionFunctionBodyPure )
            {
            // InternalFPML.g:1593:2: (this_EmptyFunctionBody_0= ruleEmptyFunctionBody | this_CompositionFunctionBodyPure_1= ruleCompositionFunctionBodyPure )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ID||(LA13_0>=39 && LA13_0<=40)||(LA13_0>=44 && LA13_0<=50)) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalFPML.g:1594:3: this_EmptyFunctionBody_0= ruleEmptyFunctionBody
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
                    // InternalFPML.g:1603:3: this_CompositionFunctionBodyPure_1= ruleCompositionFunctionBodyPure
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
    // InternalFPML.g:1615:1: entryRuleFunctionBodyEffectFull returns [EObject current=null] : iv_ruleFunctionBodyEffectFull= ruleFunctionBodyEffectFull EOF ;
    public final EObject entryRuleFunctionBodyEffectFull() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionBodyEffectFull = null;


        try {
            // InternalFPML.g:1615:63: (iv_ruleFunctionBodyEffectFull= ruleFunctionBodyEffectFull EOF )
            // InternalFPML.g:1616:2: iv_ruleFunctionBodyEffectFull= ruleFunctionBodyEffectFull EOF
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
    // InternalFPML.g:1622:1: ruleFunctionBodyEffectFull returns [EObject current=null] : (this_EmptyFunctionBody_0= ruleEmptyFunctionBody | this_CompositionFunctionBodyEffect_1= ruleCompositionFunctionBodyEffect ) ;
    public final EObject ruleFunctionBodyEffectFull() throws RecognitionException {
        EObject current = null;

        EObject this_EmptyFunctionBody_0 = null;

        EObject this_CompositionFunctionBodyEffect_1 = null;



        	enterRule();

        try {
            // InternalFPML.g:1628:2: ( (this_EmptyFunctionBody_0= ruleEmptyFunctionBody | this_CompositionFunctionBodyEffect_1= ruleCompositionFunctionBodyEffect ) )
            // InternalFPML.g:1629:2: (this_EmptyFunctionBody_0= ruleEmptyFunctionBody | this_CompositionFunctionBodyEffect_1= ruleCompositionFunctionBodyEffect )
            {
            // InternalFPML.g:1629:2: (this_EmptyFunctionBody_0= ruleEmptyFunctionBody | this_CompositionFunctionBodyEffect_1= ruleCompositionFunctionBodyEffect )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_ID||(LA14_0>=39 && LA14_0<=40)||(LA14_0>=44 && LA14_0<=55)) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalFPML.g:1630:3: this_EmptyFunctionBody_0= ruleEmptyFunctionBody
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
                    // InternalFPML.g:1639:3: this_CompositionFunctionBodyEffect_1= ruleCompositionFunctionBodyEffect
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
    // InternalFPML.g:1651:1: entryRuleEmptyFunctionBody returns [EObject current=null] : iv_ruleEmptyFunctionBody= ruleEmptyFunctionBody EOF ;
    public final EObject entryRuleEmptyFunctionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmptyFunctionBody = null;


        try {
            // InternalFPML.g:1651:58: (iv_ruleEmptyFunctionBody= ruleEmptyFunctionBody EOF )
            // InternalFPML.g:1652:2: iv_ruleEmptyFunctionBody= ruleEmptyFunctionBody EOF
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
    // InternalFPML.g:1658:1: ruleEmptyFunctionBody returns [EObject current=null] : ( () otherlv_1= 'Undefined' ) ;
    public final EObject ruleEmptyFunctionBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFPML.g:1664:2: ( ( () otherlv_1= 'Undefined' ) )
            // InternalFPML.g:1665:2: ( () otherlv_1= 'Undefined' )
            {
            // InternalFPML.g:1665:2: ( () otherlv_1= 'Undefined' )
            // InternalFPML.g:1666:3: () otherlv_1= 'Undefined'
            {
            // InternalFPML.g:1666:3: ()
            // InternalFPML.g:1667:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEmptyFunctionBodyAccess().getEmptyFunctionBodyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_2); 

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
    // InternalFPML.g:1681:1: entryRuleCompositionFunctionBodyPure returns [EObject current=null] : iv_ruleCompositionFunctionBodyPure= ruleCompositionFunctionBodyPure EOF ;
    public final EObject entryRuleCompositionFunctionBodyPure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositionFunctionBodyPure = null;


        try {
            // InternalFPML.g:1681:68: (iv_ruleCompositionFunctionBodyPure= ruleCompositionFunctionBodyPure EOF )
            // InternalFPML.g:1682:2: iv_ruleCompositionFunctionBodyPure= ruleCompositionFunctionBodyPure EOF
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
    // InternalFPML.g:1688:1: ruleCompositionFunctionBodyPure returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_functionChain_1_0= ruleCompositionFunctionBodyPureFactor ) )+ ) | ( ( (lv_primitiveElement_2_0= rulePrimitivePureFunction ) ) ( (lv_functionChain_3_0= ruleCompositionFunctionBodyPureFactor ) )+ ) ) ;
    public final EObject ruleCompositionFunctionBodyPure() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_functionChain_1_0 = null;

        EObject lv_primitiveElement_2_0 = null;

        EObject lv_functionChain_3_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:1694:2: ( ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_functionChain_1_0= ruleCompositionFunctionBodyPureFactor ) )+ ) | ( ( (lv_primitiveElement_2_0= rulePrimitivePureFunction ) ) ( (lv_functionChain_3_0= ruleCompositionFunctionBodyPureFactor ) )+ ) ) )
            // InternalFPML.g:1695:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_functionChain_1_0= ruleCompositionFunctionBodyPureFactor ) )+ ) | ( ( (lv_primitiveElement_2_0= rulePrimitivePureFunction ) ) ( (lv_functionChain_3_0= ruleCompositionFunctionBodyPureFactor ) )+ ) )
            {
            // InternalFPML.g:1695:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_functionChain_1_0= ruleCompositionFunctionBodyPureFactor ) )+ ) | ( ( (lv_primitiveElement_2_0= rulePrimitivePureFunction ) ) ( (lv_functionChain_3_0= ruleCompositionFunctionBodyPureFactor ) )+ ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                alt17=1;
            }
            else if ( ((LA17_0>=39 && LA17_0<=40)||(LA17_0>=44 && LA17_0<=50)) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalFPML.g:1696:3: ( ( (otherlv_0= RULE_ID ) ) ( (lv_functionChain_1_0= ruleCompositionFunctionBodyPureFactor ) )+ )
                    {
                    // InternalFPML.g:1696:3: ( ( (otherlv_0= RULE_ID ) ) ( (lv_functionChain_1_0= ruleCompositionFunctionBodyPureFactor ) )+ )
                    // InternalFPML.g:1697:4: ( (otherlv_0= RULE_ID ) ) ( (lv_functionChain_1_0= ruleCompositionFunctionBodyPureFactor ) )+
                    {
                    // InternalFPML.g:1697:4: ( (otherlv_0= RULE_ID ) )
                    // InternalFPML.g:1698:5: (otherlv_0= RULE_ID )
                    {
                    // InternalFPML.g:1698:5: (otherlv_0= RULE_ID )
                    // InternalFPML.g:1699:6: otherlv_0= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCompositionFunctionBodyPureRule());
                    						}
                    					
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_26); 

                    						newLeafNode(otherlv_0, grammarAccess.getCompositionFunctionBodyPureAccess().getReferenceElementPureFunctionCrossReference_0_0_0());
                    					

                    }


                    }

                    // InternalFPML.g:1710:4: ( (lv_functionChain_1_0= ruleCompositionFunctionBodyPureFactor ) )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==26) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalFPML.g:1711:5: (lv_functionChain_1_0= ruleCompositionFunctionBodyPureFactor )
                    	    {
                    	    // InternalFPML.g:1711:5: (lv_functionChain_1_0= ruleCompositionFunctionBodyPureFactor )
                    	    // InternalFPML.g:1712:6: lv_functionChain_1_0= ruleCompositionFunctionBodyPureFactor
                    	    {

                    	    						newCompositeNode(grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainCompositionFunctionBodyPureFactorParserRuleCall_0_1_0());
                    	    					
                    	    pushFollow(FOLLOW_27);
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
                    	    if ( cnt15 >= 1 ) break loop15;
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                throw eee;
                        }
                        cnt15++;
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalFPML.g:1731:3: ( ( (lv_primitiveElement_2_0= rulePrimitivePureFunction ) ) ( (lv_functionChain_3_0= ruleCompositionFunctionBodyPureFactor ) )+ )
                    {
                    // InternalFPML.g:1731:3: ( ( (lv_primitiveElement_2_0= rulePrimitivePureFunction ) ) ( (lv_functionChain_3_0= ruleCompositionFunctionBodyPureFactor ) )+ )
                    // InternalFPML.g:1732:4: ( (lv_primitiveElement_2_0= rulePrimitivePureFunction ) ) ( (lv_functionChain_3_0= ruleCompositionFunctionBodyPureFactor ) )+
                    {
                    // InternalFPML.g:1732:4: ( (lv_primitiveElement_2_0= rulePrimitivePureFunction ) )
                    // InternalFPML.g:1733:5: (lv_primitiveElement_2_0= rulePrimitivePureFunction )
                    {
                    // InternalFPML.g:1733:5: (lv_primitiveElement_2_0= rulePrimitivePureFunction )
                    // InternalFPML.g:1734:6: lv_primitiveElement_2_0= rulePrimitivePureFunction
                    {

                    						newCompositeNode(grammarAccess.getCompositionFunctionBodyPureAccess().getPrimitiveElementPrimitivePureFunctionParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_26);
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

                    // InternalFPML.g:1751:4: ( (lv_functionChain_3_0= ruleCompositionFunctionBodyPureFactor ) )+
                    int cnt16=0;
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==26) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalFPML.g:1752:5: (lv_functionChain_3_0= ruleCompositionFunctionBodyPureFactor )
                    	    {
                    	    // InternalFPML.g:1752:5: (lv_functionChain_3_0= ruleCompositionFunctionBodyPureFactor )
                    	    // InternalFPML.g:1753:6: lv_functionChain_3_0= ruleCompositionFunctionBodyPureFactor
                    	    {

                    	    						newCompositeNode(grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainCompositionFunctionBodyPureFactorParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_27);
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
                    	    if ( cnt16 >= 1 ) break loop16;
                                EarlyExitException eee =
                                    new EarlyExitException(16, input);
                                throw eee;
                        }
                        cnt16++;
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
    // InternalFPML.g:1775:1: entryRuleCompositionFunctionBodyPureFactor returns [EObject current=null] : iv_ruleCompositionFunctionBodyPureFactor= ruleCompositionFunctionBodyPureFactor EOF ;
    public final EObject entryRuleCompositionFunctionBodyPureFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositionFunctionBodyPureFactor = null;


        try {
            // InternalFPML.g:1775:74: (iv_ruleCompositionFunctionBodyPureFactor= ruleCompositionFunctionBodyPureFactor EOF )
            // InternalFPML.g:1776:2: iv_ruleCompositionFunctionBodyPureFactor= ruleCompositionFunctionBodyPureFactor EOF
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
    // InternalFPML.g:1782:1: ruleCompositionFunctionBodyPureFactor returns [EObject current=null] : ( (otherlv_0= '|>' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= '|>' ( (lv_PrimitiveElement_3_0= rulePrimitivePureFunction ) ) ) ) ;
    public final EObject ruleCompositionFunctionBodyPureFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_PrimitiveElement_3_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:1788:2: ( ( (otherlv_0= '|>' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= '|>' ( (lv_PrimitiveElement_3_0= rulePrimitivePureFunction ) ) ) ) )
            // InternalFPML.g:1789:2: ( (otherlv_0= '|>' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= '|>' ( (lv_PrimitiveElement_3_0= rulePrimitivePureFunction ) ) ) )
            {
            // InternalFPML.g:1789:2: ( (otherlv_0= '|>' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= '|>' ( (lv_PrimitiveElement_3_0= rulePrimitivePureFunction ) ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==26) ) {
                int LA18_1 = input.LA(2);

                if ( ((LA18_1>=39 && LA18_1<=40)||(LA18_1>=44 && LA18_1<=50)) ) {
                    alt18=2;
                }
                else if ( (LA18_1==RULE_ID) ) {
                    alt18=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalFPML.g:1790:3: (otherlv_0= '|>' ( (otherlv_1= RULE_ID ) ) )
                    {
                    // InternalFPML.g:1790:3: (otherlv_0= '|>' ( (otherlv_1= RULE_ID ) ) )
                    // InternalFPML.g:1791:4: otherlv_0= '|>' ( (otherlv_1= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,26,FOLLOW_17); 

                    				newLeafNode(otherlv_0, grammarAccess.getCompositionFunctionBodyPureFactorAccess().getVerticalLineGreaterThanSignKeyword_0_0());
                    			
                    // InternalFPML.g:1795:4: ( (otherlv_1= RULE_ID ) )
                    // InternalFPML.g:1796:5: (otherlv_1= RULE_ID )
                    {
                    // InternalFPML.g:1796:5: (otherlv_1= RULE_ID )
                    // InternalFPML.g:1797:6: otherlv_1= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCompositionFunctionBodyPureFactorRule());
                    						}
                    					
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_1, grammarAccess.getCompositionFunctionBodyPureFactorAccess().getReferenceElementPureFunctionCrossReference_0_1_0());
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFPML.g:1810:3: (otherlv_2= '|>' ( (lv_PrimitiveElement_3_0= rulePrimitivePureFunction ) ) )
                    {
                    // InternalFPML.g:1810:3: (otherlv_2= '|>' ( (lv_PrimitiveElement_3_0= rulePrimitivePureFunction ) ) )
                    // InternalFPML.g:1811:4: otherlv_2= '|>' ( (lv_PrimitiveElement_3_0= rulePrimitivePureFunction ) )
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_21); 

                    				newLeafNode(otherlv_2, grammarAccess.getCompositionFunctionBodyPureFactorAccess().getVerticalLineGreaterThanSignKeyword_1_0());
                    			
                    // InternalFPML.g:1815:4: ( (lv_PrimitiveElement_3_0= rulePrimitivePureFunction ) )
                    // InternalFPML.g:1816:5: (lv_PrimitiveElement_3_0= rulePrimitivePureFunction )
                    {
                    // InternalFPML.g:1816:5: (lv_PrimitiveElement_3_0= rulePrimitivePureFunction )
                    // InternalFPML.g:1817:6: lv_PrimitiveElement_3_0= rulePrimitivePureFunction
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
    // InternalFPML.g:1839:1: entryRuleCompositionFunctionBodyEffect returns [EObject current=null] : iv_ruleCompositionFunctionBodyEffect= ruleCompositionFunctionBodyEffect EOF ;
    public final EObject entryRuleCompositionFunctionBodyEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositionFunctionBodyEffect = null;


        try {
            // InternalFPML.g:1839:70: (iv_ruleCompositionFunctionBodyEffect= ruleCompositionFunctionBodyEffect EOF )
            // InternalFPML.g:1840:2: iv_ruleCompositionFunctionBodyEffect= ruleCompositionFunctionBodyEffect EOF
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
    // InternalFPML.g:1846:1: ruleCompositionFunctionBodyEffect returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_functionChain_1_0= ruleCompositionFunctionBodyEffectFullFactor ) )+ ) | ( ( (lv_primitiveElement_2_0= rulePrimitiveFunction ) ) ( (lv_functionChain_3_0= ruleCompositionFunctionBodyEffectFullFactor ) )+ ) ) ;
    public final EObject ruleCompositionFunctionBodyEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_functionChain_1_0 = null;

        EObject lv_primitiveElement_2_0 = null;

        EObject lv_functionChain_3_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:1852:2: ( ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_functionChain_1_0= ruleCompositionFunctionBodyEffectFullFactor ) )+ ) | ( ( (lv_primitiveElement_2_0= rulePrimitiveFunction ) ) ( (lv_functionChain_3_0= ruleCompositionFunctionBodyEffectFullFactor ) )+ ) ) )
            // InternalFPML.g:1853:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_functionChain_1_0= ruleCompositionFunctionBodyEffectFullFactor ) )+ ) | ( ( (lv_primitiveElement_2_0= rulePrimitiveFunction ) ) ( (lv_functionChain_3_0= ruleCompositionFunctionBodyEffectFullFactor ) )+ ) )
            {
            // InternalFPML.g:1853:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_functionChain_1_0= ruleCompositionFunctionBodyEffectFullFactor ) )+ ) | ( ( (lv_primitiveElement_2_0= rulePrimitiveFunction ) ) ( (lv_functionChain_3_0= ruleCompositionFunctionBodyEffectFullFactor ) )+ ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            else if ( ((LA21_0>=39 && LA21_0<=40)||(LA21_0>=44 && LA21_0<=55)) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalFPML.g:1854:3: ( ( (otherlv_0= RULE_ID ) ) ( (lv_functionChain_1_0= ruleCompositionFunctionBodyEffectFullFactor ) )+ )
                    {
                    // InternalFPML.g:1854:3: ( ( (otherlv_0= RULE_ID ) ) ( (lv_functionChain_1_0= ruleCompositionFunctionBodyEffectFullFactor ) )+ )
                    // InternalFPML.g:1855:4: ( (otherlv_0= RULE_ID ) ) ( (lv_functionChain_1_0= ruleCompositionFunctionBodyEffectFullFactor ) )+
                    {
                    // InternalFPML.g:1855:4: ( (otherlv_0= RULE_ID ) )
                    // InternalFPML.g:1856:5: (otherlv_0= RULE_ID )
                    {
                    // InternalFPML.g:1856:5: (otherlv_0= RULE_ID )
                    // InternalFPML.g:1857:6: otherlv_0= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCompositionFunctionBodyEffectRule());
                    						}
                    					
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_28); 

                    						newLeafNode(otherlv_0, grammarAccess.getCompositionFunctionBodyEffectAccess().getReferenceElementEffectFullReferenceCrossReference_0_0_0());
                    					

                    }


                    }

                    // InternalFPML.g:1868:4: ( (lv_functionChain_1_0= ruleCompositionFunctionBodyEffectFullFactor ) )+
                    int cnt19=0;
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==27) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalFPML.g:1869:5: (lv_functionChain_1_0= ruleCompositionFunctionBodyEffectFullFactor )
                    	    {
                    	    // InternalFPML.g:1869:5: (lv_functionChain_1_0= ruleCompositionFunctionBodyEffectFullFactor )
                    	    // InternalFPML.g:1870:6: lv_functionChain_1_0= ruleCompositionFunctionBodyEffectFullFactor
                    	    {

                    	    						newCompositeNode(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainCompositionFunctionBodyEffectFullFactorParserRuleCall_0_1_0());
                    	    					
                    	    pushFollow(FOLLOW_29);
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
                case 2 :
                    // InternalFPML.g:1889:3: ( ( (lv_primitiveElement_2_0= rulePrimitiveFunction ) ) ( (lv_functionChain_3_0= ruleCompositionFunctionBodyEffectFullFactor ) )+ )
                    {
                    // InternalFPML.g:1889:3: ( ( (lv_primitiveElement_2_0= rulePrimitiveFunction ) ) ( (lv_functionChain_3_0= ruleCompositionFunctionBodyEffectFullFactor ) )+ )
                    // InternalFPML.g:1890:4: ( (lv_primitiveElement_2_0= rulePrimitiveFunction ) ) ( (lv_functionChain_3_0= ruleCompositionFunctionBodyEffectFullFactor ) )+
                    {
                    // InternalFPML.g:1890:4: ( (lv_primitiveElement_2_0= rulePrimitiveFunction ) )
                    // InternalFPML.g:1891:5: (lv_primitiveElement_2_0= rulePrimitiveFunction )
                    {
                    // InternalFPML.g:1891:5: (lv_primitiveElement_2_0= rulePrimitiveFunction )
                    // InternalFPML.g:1892:6: lv_primitiveElement_2_0= rulePrimitiveFunction
                    {

                    						newCompositeNode(grammarAccess.getCompositionFunctionBodyEffectAccess().getPrimitiveElementPrimitiveFunctionParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_28);
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

                    // InternalFPML.g:1909:4: ( (lv_functionChain_3_0= ruleCompositionFunctionBodyEffectFullFactor ) )+
                    int cnt20=0;
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==27) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalFPML.g:1910:5: (lv_functionChain_3_0= ruleCompositionFunctionBodyEffectFullFactor )
                    	    {
                    	    // InternalFPML.g:1910:5: (lv_functionChain_3_0= ruleCompositionFunctionBodyEffectFullFactor )
                    	    // InternalFPML.g:1911:6: lv_functionChain_3_0= ruleCompositionFunctionBodyEffectFullFactor
                    	    {

                    	    						newCompositeNode(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainCompositionFunctionBodyEffectFullFactorParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_29);
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
                    	    if ( cnt20 >= 1 ) break loop20;
                                EarlyExitException eee =
                                    new EarlyExitException(20, input);
                                throw eee;
                        }
                        cnt20++;
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
    // InternalFPML.g:1933:1: entryRuleCompositionFunctionBodyEffectFullFactor returns [EObject current=null] : iv_ruleCompositionFunctionBodyEffectFullFactor= ruleCompositionFunctionBodyEffectFullFactor EOF ;
    public final EObject entryRuleCompositionFunctionBodyEffectFullFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositionFunctionBodyEffectFullFactor = null;


        try {
            // InternalFPML.g:1933:80: (iv_ruleCompositionFunctionBodyEffectFullFactor= ruleCompositionFunctionBodyEffectFullFactor EOF )
            // InternalFPML.g:1934:2: iv_ruleCompositionFunctionBodyEffectFullFactor= ruleCompositionFunctionBodyEffectFullFactor EOF
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
    // InternalFPML.g:1940:1: ruleCompositionFunctionBodyEffectFullFactor returns [EObject current=null] : ( (otherlv_0= '>>=' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= '>>=' ( (lv_PrimitiveElement_3_0= rulePrimitiveFunction ) ) ) ) ;
    public final EObject ruleCompositionFunctionBodyEffectFullFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_PrimitiveElement_3_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:1946:2: ( ( (otherlv_0= '>>=' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= '>>=' ( (lv_PrimitiveElement_3_0= rulePrimitiveFunction ) ) ) ) )
            // InternalFPML.g:1947:2: ( (otherlv_0= '>>=' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= '>>=' ( (lv_PrimitiveElement_3_0= rulePrimitiveFunction ) ) ) )
            {
            // InternalFPML.g:1947:2: ( (otherlv_0= '>>=' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= '>>=' ( (lv_PrimitiveElement_3_0= rulePrimitiveFunction ) ) ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==27) ) {
                int LA22_1 = input.LA(2);

                if ( ((LA22_1>=39 && LA22_1<=40)||(LA22_1>=44 && LA22_1<=55)) ) {
                    alt22=2;
                }
                else if ( (LA22_1==RULE_ID) ) {
                    alt22=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalFPML.g:1948:3: (otherlv_0= '>>=' ( (otherlv_1= RULE_ID ) ) )
                    {
                    // InternalFPML.g:1948:3: (otherlv_0= '>>=' ( (otherlv_1= RULE_ID ) ) )
                    // InternalFPML.g:1949:4: otherlv_0= '>>=' ( (otherlv_1= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,27,FOLLOW_17); 

                    				newLeafNode(otherlv_0, grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getGreaterThanSignGreaterThanSignEqualsSignKeyword_0_0());
                    			
                    // InternalFPML.g:1953:4: ( (otherlv_1= RULE_ID ) )
                    // InternalFPML.g:1954:5: (otherlv_1= RULE_ID )
                    {
                    // InternalFPML.g:1954:5: (otherlv_1= RULE_ID )
                    // InternalFPML.g:1955:6: otherlv_1= RULE_ID
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
                    // InternalFPML.g:1968:3: (otherlv_2= '>>=' ( (lv_PrimitiveElement_3_0= rulePrimitiveFunction ) ) )
                    {
                    // InternalFPML.g:1968:3: (otherlv_2= '>>=' ( (lv_PrimitiveElement_3_0= rulePrimitiveFunction ) ) )
                    // InternalFPML.g:1969:4: otherlv_2= '>>=' ( (lv_PrimitiveElement_3_0= rulePrimitiveFunction ) )
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_24); 

                    				newLeafNode(otherlv_2, grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getGreaterThanSignGreaterThanSignEqualsSignKeyword_1_0());
                    			
                    // InternalFPML.g:1973:4: ( (lv_PrimitiveElement_3_0= rulePrimitiveFunction ) )
                    // InternalFPML.g:1974:5: (lv_PrimitiveElement_3_0= rulePrimitiveFunction )
                    {
                    // InternalFPML.g:1974:5: (lv_PrimitiveElement_3_0= rulePrimitiveFunction )
                    // InternalFPML.g:1975:6: lv_PrimitiveElement_3_0= rulePrimitiveFunction
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
    // InternalFPML.g:1997:1: entryRuleIOType returns [EObject current=null] : iv_ruleIOType= ruleIOType EOF ;
    public final EObject entryRuleIOType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIOType = null;


        try {
            // InternalFPML.g:1997:47: (iv_ruleIOType= ruleIOType EOF )
            // InternalFPML.g:1998:2: iv_ruleIOType= ruleIOType EOF
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
    // InternalFPML.g:2004:1: ruleIOType returns [EObject current=null] : (otherlv_0= 'IO' ( (lv_type_1_0= ruleType ) ) ) ;
    public final EObject ruleIOType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:2010:2: ( (otherlv_0= 'IO' ( (lv_type_1_0= ruleType ) ) ) )
            // InternalFPML.g:2011:2: (otherlv_0= 'IO' ( (lv_type_1_0= ruleType ) ) )
            {
            // InternalFPML.g:2011:2: (otherlv_0= 'IO' ( (lv_type_1_0= ruleType ) ) )
            // InternalFPML.g:2012:3: otherlv_0= 'IO' ( (lv_type_1_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getIOTypeAccess().getIOKeyword_0());
            		
            // InternalFPML.g:2016:3: ( (lv_type_1_0= ruleType ) )
            // InternalFPML.g:2017:4: (lv_type_1_0= ruleType )
            {
            // InternalFPML.g:2017:4: (lv_type_1_0= ruleType )
            // InternalFPML.g:2018:5: lv_type_1_0= ruleType
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
    // InternalFPML.g:2039:1: entryRuleValueType returns [EObject current=null] : iv_ruleValueType= ruleValueType EOF ;
    public final EObject entryRuleValueType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueType = null;


        try {
            // InternalFPML.g:2039:50: (iv_ruleValueType= ruleValueType EOF )
            // InternalFPML.g:2040:2: iv_ruleValueType= ruleValueType EOF
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
    // InternalFPML.g:2046:1: ruleValueType returns [EObject current=null] : (this_IntegerType_0= ruleIntegerType | this_StringType_1= ruleStringType | this_DataType_2= ruleDataType | this_PureFunctionType_3= rulePureFunctionType | this_PureAlgebraicType_4= rulePureAlgebraicType | this_UnitType_5= ruleUnitType ) ;
    public final EObject ruleValueType() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerType_0 = null;

        EObject this_StringType_1 = null;

        EObject this_DataType_2 = null;

        EObject this_PureFunctionType_3 = null;

        EObject this_PureAlgebraicType_4 = null;

        EObject this_UnitType_5 = null;



        	enterRule();

        try {
            // InternalFPML.g:2052:2: ( (this_IntegerType_0= ruleIntegerType | this_StringType_1= ruleStringType | this_DataType_2= ruleDataType | this_PureFunctionType_3= rulePureFunctionType | this_PureAlgebraicType_4= rulePureAlgebraicType | this_UnitType_5= ruleUnitType ) )
            // InternalFPML.g:2053:2: (this_IntegerType_0= ruleIntegerType | this_StringType_1= ruleStringType | this_DataType_2= ruleDataType | this_PureFunctionType_3= rulePureFunctionType | this_PureAlgebraicType_4= rulePureAlgebraicType | this_UnitType_5= ruleUnitType )
            {
            // InternalFPML.g:2053:2: (this_IntegerType_0= ruleIntegerType | this_StringType_1= ruleStringType | this_DataType_2= ruleDataType | this_PureFunctionType_3= rulePureFunctionType | this_PureAlgebraicType_4= rulePureAlgebraicType | this_UnitType_5= ruleUnitType )
            int alt23=6;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt23=1;
                }
                break;
            case 29:
                {
                alt23=2;
                }
                break;
            case 31:
                {
                alt23=3;
                }
                break;
            case 33:
                {
                alt23=4;
                }
                break;
            case 37:
                {
                alt23=5;
                }
                break;
            case 30:
                {
                alt23=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalFPML.g:2054:3: this_IntegerType_0= ruleIntegerType
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
                    // InternalFPML.g:2063:3: this_StringType_1= ruleStringType
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
                    // InternalFPML.g:2072:3: this_DataType_2= ruleDataType
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
                    // InternalFPML.g:2081:3: this_PureFunctionType_3= rulePureFunctionType
                    {

                    			newCompositeNode(grammarAccess.getValueTypeAccess().getPureFunctionTypeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_PureFunctionType_3=rulePureFunctionType();

                    state._fsp--;


                    			current = this_PureFunctionType_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalFPML.g:2090:3: this_PureAlgebraicType_4= rulePureAlgebraicType
                    {

                    			newCompositeNode(grammarAccess.getValueTypeAccess().getPureAlgebraicTypeParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_PureAlgebraicType_4=rulePureAlgebraicType();

                    state._fsp--;


                    			current = this_PureAlgebraicType_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalFPML.g:2099:3: this_UnitType_5= ruleUnitType
                    {

                    			newCompositeNode(grammarAccess.getValueTypeAccess().getUnitTypeParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_UnitType_5=ruleUnitType();

                    state._fsp--;


                    			current = this_UnitType_5;
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
    // InternalFPML.g:2111:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalFPML.g:2111:45: (iv_ruleType= ruleType EOF )
            // InternalFPML.g:2112:2: iv_ruleType= ruleType EOF
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
    // InternalFPML.g:2118:1: ruleType returns [EObject current=null] : (this_ValueType_0= ruleValueType | this_EffectFullType_1= ruleEffectFullType ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_ValueType_0 = null;

        EObject this_EffectFullType_1 = null;



        	enterRule();

        try {
            // InternalFPML.g:2124:2: ( (this_ValueType_0= ruleValueType | this_EffectFullType_1= ruleEffectFullType ) )
            // InternalFPML.g:2125:2: (this_ValueType_0= ruleValueType | this_EffectFullType_1= ruleEffectFullType )
            {
            // InternalFPML.g:2125:2: (this_ValueType_0= ruleValueType | this_EffectFullType_1= ruleEffectFullType )
            int alt24=2;
            switch ( input.LA(1) ) {
            case 28:
            case 29:
            case 30:
            case 31:
            case 33:
                {
                alt24=1;
                }
                break;
            case 37:
                {
                int LA24_2 = input.LA(2);

                if ( (LA24_2==23) ) {
                    alt24=2;
                }
                else if ( ((LA24_2>=28 && LA24_2<=31)||LA24_2==33||LA24_2==37) ) {
                    alt24=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 2, input);

                    throw nvae;
                }
                }
                break;
            case EOF:
            case RULE_ID:
            case 13:
            case 16:
            case 21:
            case 23:
            case 27:
            case 32:
            case 35:
            case 36:
            case 38:
            case 39:
            case 40:
                {
                alt24=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalFPML.g:2126:3: this_ValueType_0= ruleValueType
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
                    // InternalFPML.g:2135:3: this_EffectFullType_1= ruleEffectFullType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getEffectFullTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EffectFullType_1=ruleEffectFullType();

                    state._fsp--;


                    			current = this_EffectFullType_1;
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


    // $ANTLR start "entryRuleEffectFullType"
    // InternalFPML.g:2147:1: entryRuleEffectFullType returns [EObject current=null] : iv_ruleEffectFullType= ruleEffectFullType EOF ;
    public final EObject entryRuleEffectFullType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullType = null;


        try {
            // InternalFPML.g:2147:55: (iv_ruleEffectFullType= ruleEffectFullType EOF )
            // InternalFPML.g:2148:2: iv_ruleEffectFullType= ruleEffectFullType EOF
            {
             newCompositeNode(grammarAccess.getEffectFullTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEffectFullType=ruleEffectFullType();

            state._fsp--;

             current =iv_ruleEffectFullType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEffectFullType"


    // $ANTLR start "ruleEffectFullType"
    // InternalFPML.g:2154:1: ruleEffectFullType returns [EObject current=null] : (this_EffectFullFunctionType_0= ruleEffectFullFunctionType | this_EffectFullDataType_1= ruleEffectFullDataType | this_EffectFullAlgebraicType_2= ruleEffectFullAlgebraicType | this_IOType_3= ruleIOType | this_VoidType_4= ruleVoidType ) ;
    public final EObject ruleEffectFullType() throws RecognitionException {
        EObject current = null;

        EObject this_EffectFullFunctionType_0 = null;

        EObject this_EffectFullDataType_1 = null;

        EObject this_EffectFullAlgebraicType_2 = null;

        EObject this_IOType_3 = null;

        EObject this_VoidType_4 = null;



        	enterRule();

        try {
            // InternalFPML.g:2160:2: ( (this_EffectFullFunctionType_0= ruleEffectFullFunctionType | this_EffectFullDataType_1= ruleEffectFullDataType | this_EffectFullAlgebraicType_2= ruleEffectFullAlgebraicType | this_IOType_3= ruleIOType | this_VoidType_4= ruleVoidType ) )
            // InternalFPML.g:2161:2: (this_EffectFullFunctionType_0= ruleEffectFullFunctionType | this_EffectFullDataType_1= ruleEffectFullDataType | this_EffectFullAlgebraicType_2= ruleEffectFullAlgebraicType | this_IOType_3= ruleIOType | this_VoidType_4= ruleVoidType )
            {
            // InternalFPML.g:2161:2: (this_EffectFullFunctionType_0= ruleEffectFullFunctionType | this_EffectFullDataType_1= ruleEffectFullDataType | this_EffectFullAlgebraicType_2= ruleEffectFullAlgebraicType | this_IOType_3= ruleIOType | this_VoidType_4= ruleVoidType )
            int alt25=5;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt25=1;
                }
                break;
            case 32:
                {
                alt25=2;
                }
                break;
            case 37:
                {
                alt25=3;
                }
                break;
            case 23:
                {
                alt25=4;
                }
                break;
            case EOF:
            case RULE_ID:
            case 13:
            case 16:
            case 21:
            case 27:
            case 35:
            case 38:
            case 39:
            case 40:
                {
                alt25=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalFPML.g:2162:3: this_EffectFullFunctionType_0= ruleEffectFullFunctionType
                    {

                    			newCompositeNode(grammarAccess.getEffectFullTypeAccess().getEffectFullFunctionTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EffectFullFunctionType_0=ruleEffectFullFunctionType();

                    state._fsp--;


                    			current = this_EffectFullFunctionType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFPML.g:2171:3: this_EffectFullDataType_1= ruleEffectFullDataType
                    {

                    			newCompositeNode(grammarAccess.getEffectFullTypeAccess().getEffectFullDataTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EffectFullDataType_1=ruleEffectFullDataType();

                    state._fsp--;


                    			current = this_EffectFullDataType_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalFPML.g:2180:3: this_EffectFullAlgebraicType_2= ruleEffectFullAlgebraicType
                    {

                    			newCompositeNode(grammarAccess.getEffectFullTypeAccess().getEffectFullAlgebraicTypeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_EffectFullAlgebraicType_2=ruleEffectFullAlgebraicType();

                    state._fsp--;


                    			current = this_EffectFullAlgebraicType_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalFPML.g:2189:3: this_IOType_3= ruleIOType
                    {

                    			newCompositeNode(grammarAccess.getEffectFullTypeAccess().getIOTypeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_IOType_3=ruleIOType();

                    state._fsp--;


                    			current = this_IOType_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalFPML.g:2198:3: this_VoidType_4= ruleVoidType
                    {

                    			newCompositeNode(grammarAccess.getEffectFullTypeAccess().getVoidTypeParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_VoidType_4=ruleVoidType();

                    state._fsp--;


                    			current = this_VoidType_4;
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
    // $ANTLR end "ruleEffectFullType"


    // $ANTLR start "entryRuleVoidType"
    // InternalFPML.g:2210:1: entryRuleVoidType returns [EObject current=null] : iv_ruleVoidType= ruleVoidType EOF ;
    public final EObject entryRuleVoidType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVoidType = null;


        try {
            // InternalFPML.g:2210:49: (iv_ruleVoidType= ruleVoidType EOF )
            // InternalFPML.g:2211:2: iv_ruleVoidType= ruleVoidType EOF
            {
             newCompositeNode(grammarAccess.getVoidTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVoidType=ruleVoidType();

            state._fsp--;

             current =iv_ruleVoidType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVoidType"


    // $ANTLR start "ruleVoidType"
    // InternalFPML.g:2217:1: ruleVoidType returns [EObject current=null] : () ;
    public final EObject ruleVoidType() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalFPML.g:2223:2: ( () )
            // InternalFPML.g:2224:2: ()
            {
            // InternalFPML.g:2224:2: ()
            // InternalFPML.g:2225:3: 
            {

            			current = forceCreateModelElement(
            				grammarAccess.getVoidTypeAccess().getVoidTypeAction(),
            				current);
            		

            }


            }


            	leaveRule();

        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVoidType"


    // $ANTLR start "entryRuleIntegerType"
    // InternalFPML.g:2234:1: entryRuleIntegerType returns [EObject current=null] : iv_ruleIntegerType= ruleIntegerType EOF ;
    public final EObject entryRuleIntegerType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerType = null;


        try {
            // InternalFPML.g:2234:52: (iv_ruleIntegerType= ruleIntegerType EOF )
            // InternalFPML.g:2235:2: iv_ruleIntegerType= ruleIntegerType EOF
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
    // InternalFPML.g:2241:1: ruleIntegerType returns [EObject current=null] : ( () ( (lv_type_1_0= 'int' ) ) ) ;
    public final EObject ruleIntegerType() throws RecognitionException {
        EObject current = null;

        Token lv_type_1_0=null;


        	enterRule();

        try {
            // InternalFPML.g:2247:2: ( ( () ( (lv_type_1_0= 'int' ) ) ) )
            // InternalFPML.g:2248:2: ( () ( (lv_type_1_0= 'int' ) ) )
            {
            // InternalFPML.g:2248:2: ( () ( (lv_type_1_0= 'int' ) ) )
            // InternalFPML.g:2249:3: () ( (lv_type_1_0= 'int' ) )
            {
            // InternalFPML.g:2249:3: ()
            // InternalFPML.g:2250:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntegerTypeAccess().getIntegerTypeAction_0(),
            					current);
            			

            }

            // InternalFPML.g:2256:3: ( (lv_type_1_0= 'int' ) )
            // InternalFPML.g:2257:4: (lv_type_1_0= 'int' )
            {
            // InternalFPML.g:2257:4: (lv_type_1_0= 'int' )
            // InternalFPML.g:2258:5: lv_type_1_0= 'int'
            {
            lv_type_1_0=(Token)match(input,28,FOLLOW_2); 

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
    // InternalFPML.g:2274:1: entryRuleStringType returns [EObject current=null] : iv_ruleStringType= ruleStringType EOF ;
    public final EObject entryRuleStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringType = null;


        try {
            // InternalFPML.g:2274:51: (iv_ruleStringType= ruleStringType EOF )
            // InternalFPML.g:2275:2: iv_ruleStringType= ruleStringType EOF
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
    // InternalFPML.g:2281:1: ruleStringType returns [EObject current=null] : ( () ( (lv_type_1_0= 'String' ) ) ) ;
    public final EObject ruleStringType() throws RecognitionException {
        EObject current = null;

        Token lv_type_1_0=null;


        	enterRule();

        try {
            // InternalFPML.g:2287:2: ( ( () ( (lv_type_1_0= 'String' ) ) ) )
            // InternalFPML.g:2288:2: ( () ( (lv_type_1_0= 'String' ) ) )
            {
            // InternalFPML.g:2288:2: ( () ( (lv_type_1_0= 'String' ) ) )
            // InternalFPML.g:2289:3: () ( (lv_type_1_0= 'String' ) )
            {
            // InternalFPML.g:2289:3: ()
            // InternalFPML.g:2290:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStringTypeAccess().getStringTypeAction_0(),
            					current);
            			

            }

            // InternalFPML.g:2296:3: ( (lv_type_1_0= 'String' ) )
            // InternalFPML.g:2297:4: (lv_type_1_0= 'String' )
            {
            // InternalFPML.g:2297:4: (lv_type_1_0= 'String' )
            // InternalFPML.g:2298:5: lv_type_1_0= 'String'
            {
            lv_type_1_0=(Token)match(input,29,FOLLOW_2); 

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
    // InternalFPML.g:2314:1: entryRuleUnitType returns [EObject current=null] : iv_ruleUnitType= ruleUnitType EOF ;
    public final EObject entryRuleUnitType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnitType = null;


        try {
            // InternalFPML.g:2314:49: (iv_ruleUnitType= ruleUnitType EOF )
            // InternalFPML.g:2315:2: iv_ruleUnitType= ruleUnitType EOF
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
    // InternalFPML.g:2321:1: ruleUnitType returns [EObject current=null] : ( () ( (lv_type_1_0= 'Unit' ) ) ) ;
    public final EObject ruleUnitType() throws RecognitionException {
        EObject current = null;

        Token lv_type_1_0=null;


        	enterRule();

        try {
            // InternalFPML.g:2327:2: ( ( () ( (lv_type_1_0= 'Unit' ) ) ) )
            // InternalFPML.g:2328:2: ( () ( (lv_type_1_0= 'Unit' ) ) )
            {
            // InternalFPML.g:2328:2: ( () ( (lv_type_1_0= 'Unit' ) ) )
            // InternalFPML.g:2329:3: () ( (lv_type_1_0= 'Unit' ) )
            {
            // InternalFPML.g:2329:3: ()
            // InternalFPML.g:2330:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUnitTypeAccess().getUnitTypeAction_0(),
            					current);
            			

            }

            // InternalFPML.g:2336:3: ( (lv_type_1_0= 'Unit' ) )
            // InternalFPML.g:2337:4: (lv_type_1_0= 'Unit' )
            {
            // InternalFPML.g:2337:4: (lv_type_1_0= 'Unit' )
            // InternalFPML.g:2338:5: lv_type_1_0= 'Unit'
            {
            lv_type_1_0=(Token)match(input,30,FOLLOW_2); 

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
    // InternalFPML.g:2354:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalFPML.g:2354:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalFPML.g:2355:2: iv_ruleDataType= ruleDataType EOF
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
    // InternalFPML.g:2361:1: ruleDataType returns [EObject current=null] : ( () otherlv_1= 'ref' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalFPML.g:2367:2: ( ( () otherlv_1= 'ref' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalFPML.g:2368:2: ( () otherlv_1= 'ref' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalFPML.g:2368:2: ( () otherlv_1= 'ref' ( (otherlv_2= RULE_ID ) ) )
            // InternalFPML.g:2369:3: () otherlv_1= 'ref' ( (otherlv_2= RULE_ID ) )
            {
            // InternalFPML.g:2369:3: ()
            // InternalFPML.g:2370:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDataTypeAccess().getDataTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getDataTypeAccess().getRefKeyword_1());
            		
            // InternalFPML.g:2380:3: ( (otherlv_2= RULE_ID ) )
            // InternalFPML.g:2381:4: (otherlv_2= RULE_ID )
            {
            // InternalFPML.g:2381:4: (otherlv_2= RULE_ID )
            // InternalFPML.g:2382:5: otherlv_2= RULE_ID
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
    // InternalFPML.g:2397:1: entryRuleEffectFullDataType returns [EObject current=null] : iv_ruleEffectFullDataType= ruleEffectFullDataType EOF ;
    public final EObject entryRuleEffectFullDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullDataType = null;


        try {
            // InternalFPML.g:2397:59: (iv_ruleEffectFullDataType= ruleEffectFullDataType EOF )
            // InternalFPML.g:2398:2: iv_ruleEffectFullDataType= ruleEffectFullDataType EOF
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
    // InternalFPML.g:2404:1: ruleEffectFullDataType returns [EObject current=null] : ( () otherlv_1= 'refIO' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleEffectFullDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalFPML.g:2410:2: ( ( () otherlv_1= 'refIO' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalFPML.g:2411:2: ( () otherlv_1= 'refIO' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalFPML.g:2411:2: ( () otherlv_1= 'refIO' ( (otherlv_2= RULE_ID ) ) )
            // InternalFPML.g:2412:3: () otherlv_1= 'refIO' ( (otherlv_2= RULE_ID ) )
            {
            // InternalFPML.g:2412:3: ()
            // InternalFPML.g:2413:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEffectFullDataTypeAccess().getEffectFullDataTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getEffectFullDataTypeAccess().getRefIOKeyword_1());
            		
            // InternalFPML.g:2423:3: ( (otherlv_2= RULE_ID ) )
            // InternalFPML.g:2424:4: (otherlv_2= RULE_ID )
            {
            // InternalFPML.g:2424:4: (otherlv_2= RULE_ID )
            // InternalFPML.g:2425:5: otherlv_2= RULE_ID
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
    // InternalFPML.g:2440:1: entryRulePureFunctionType returns [EObject current=null] : iv_rulePureFunctionType= rulePureFunctionType EOF ;
    public final EObject entryRulePureFunctionType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePureFunctionType = null;


        try {
            // InternalFPML.g:2440:57: (iv_rulePureFunctionType= rulePureFunctionType EOF )
            // InternalFPML.g:2441:2: iv_rulePureFunctionType= rulePureFunctionType EOF
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
    // InternalFPML.g:2447:1: rulePureFunctionType returns [EObject current=null] : ( () otherlv_1= 'F' otherlv_2= '<' ( (lv_argType_3_0= ruleValueType ) ) otherlv_4= ',' ( (lv_returnType_5_0= ruleValueType ) ) otherlv_6= '>' ) ;
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
            // InternalFPML.g:2453:2: ( ( () otherlv_1= 'F' otherlv_2= '<' ( (lv_argType_3_0= ruleValueType ) ) otherlv_4= ',' ( (lv_returnType_5_0= ruleValueType ) ) otherlv_6= '>' ) )
            // InternalFPML.g:2454:2: ( () otherlv_1= 'F' otherlv_2= '<' ( (lv_argType_3_0= ruleValueType ) ) otherlv_4= ',' ( (lv_returnType_5_0= ruleValueType ) ) otherlv_6= '>' )
            {
            // InternalFPML.g:2454:2: ( () otherlv_1= 'F' otherlv_2= '<' ( (lv_argType_3_0= ruleValueType ) ) otherlv_4= ',' ( (lv_returnType_5_0= ruleValueType ) ) otherlv_6= '>' )
            // InternalFPML.g:2455:3: () otherlv_1= 'F' otherlv_2= '<' ( (lv_argType_3_0= ruleValueType ) ) otherlv_4= ',' ( (lv_returnType_5_0= ruleValueType ) ) otherlv_6= '>'
            {
            // InternalFPML.g:2455:3: ()
            // InternalFPML.g:2456:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPureFunctionTypeAccess().getPureFunctionTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getPureFunctionTypeAccess().getFKeyword_1());
            		
            otherlv_2=(Token)match(input,34,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getPureFunctionTypeAccess().getLessThanSignKeyword_2());
            		
            // InternalFPML.g:2470:3: ( (lv_argType_3_0= ruleValueType ) )
            // InternalFPML.g:2471:4: (lv_argType_3_0= ruleValueType )
            {
            // InternalFPML.g:2471:4: (lv_argType_3_0= ruleValueType )
            // InternalFPML.g:2472:5: lv_argType_3_0= ruleValueType
            {

            					newCompositeNode(grammarAccess.getPureFunctionTypeAccess().getArgTypeValueTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_31);
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

            otherlv_4=(Token)match(input,21,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getPureFunctionTypeAccess().getCommaKeyword_4());
            		
            // InternalFPML.g:2493:3: ( (lv_returnType_5_0= ruleValueType ) )
            // InternalFPML.g:2494:4: (lv_returnType_5_0= ruleValueType )
            {
            // InternalFPML.g:2494:4: (lv_returnType_5_0= ruleValueType )
            // InternalFPML.g:2495:5: lv_returnType_5_0= ruleValueType
            {

            					newCompositeNode(grammarAccess.getPureFunctionTypeAccess().getReturnTypeValueTypeParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_32);
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

            otherlv_6=(Token)match(input,35,FOLLOW_2); 

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
    // InternalFPML.g:2520:1: entryRuleEffectFullFunctionType returns [EObject current=null] : iv_ruleEffectFullFunctionType= ruleEffectFullFunctionType EOF ;
    public final EObject entryRuleEffectFullFunctionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullFunctionType = null;


        try {
            // InternalFPML.g:2520:63: (iv_ruleEffectFullFunctionType= ruleEffectFullFunctionType EOF )
            // InternalFPML.g:2521:2: iv_ruleEffectFullFunctionType= ruleEffectFullFunctionType EOF
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
    // InternalFPML.g:2527:1: ruleEffectFullFunctionType returns [EObject current=null] : ( () otherlv_1= 'FIO' otherlv_2= '<' ( (lv_argType_3_0= ruleType ) ) otherlv_4= ',' ( (lv_returnType_5_0= ruleIOType ) ) otherlv_6= '>' ) ;
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
            // InternalFPML.g:2533:2: ( ( () otherlv_1= 'FIO' otherlv_2= '<' ( (lv_argType_3_0= ruleType ) ) otherlv_4= ',' ( (lv_returnType_5_0= ruleIOType ) ) otherlv_6= '>' ) )
            // InternalFPML.g:2534:2: ( () otherlv_1= 'FIO' otherlv_2= '<' ( (lv_argType_3_0= ruleType ) ) otherlv_4= ',' ( (lv_returnType_5_0= ruleIOType ) ) otherlv_6= '>' )
            {
            // InternalFPML.g:2534:2: ( () otherlv_1= 'FIO' otherlv_2= '<' ( (lv_argType_3_0= ruleType ) ) otherlv_4= ',' ( (lv_returnType_5_0= ruleIOType ) ) otherlv_6= '>' )
            // InternalFPML.g:2535:3: () otherlv_1= 'FIO' otherlv_2= '<' ( (lv_argType_3_0= ruleType ) ) otherlv_4= ',' ( (lv_returnType_5_0= ruleIOType ) ) otherlv_6= '>'
            {
            // InternalFPML.g:2535:3: ()
            // InternalFPML.g:2536:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEffectFullFunctionTypeAccess().getEffectFullFunctionTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getEffectFullFunctionTypeAccess().getFIOKeyword_1());
            		
            otherlv_2=(Token)match(input,34,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getEffectFullFunctionTypeAccess().getLessThanSignKeyword_2());
            		
            // InternalFPML.g:2550:3: ( (lv_argType_3_0= ruleType ) )
            // InternalFPML.g:2551:4: (lv_argType_3_0= ruleType )
            {
            // InternalFPML.g:2551:4: (lv_argType_3_0= ruleType )
            // InternalFPML.g:2552:5: lv_argType_3_0= ruleType
            {

            					newCompositeNode(grammarAccess.getEffectFullFunctionTypeAccess().getArgTypeTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_31);
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

            otherlv_4=(Token)match(input,21,FOLLOW_22); 

            			newLeafNode(otherlv_4, grammarAccess.getEffectFullFunctionTypeAccess().getCommaKeyword_4());
            		
            // InternalFPML.g:2573:3: ( (lv_returnType_5_0= ruleIOType ) )
            // InternalFPML.g:2574:4: (lv_returnType_5_0= ruleIOType )
            {
            // InternalFPML.g:2574:4: (lv_returnType_5_0= ruleIOType )
            // InternalFPML.g:2575:5: lv_returnType_5_0= ruleIOType
            {

            					newCompositeNode(grammarAccess.getEffectFullFunctionTypeAccess().getReturnTypeIOTypeParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_32);
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

            otherlv_6=(Token)match(input,35,FOLLOW_2); 

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


    // $ANTLR start "entryRulePureAlgebraicType"
    // InternalFPML.g:2600:1: entryRulePureAlgebraicType returns [EObject current=null] : iv_rulePureAlgebraicType= rulePureAlgebraicType EOF ;
    public final EObject entryRulePureAlgebraicType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePureAlgebraicType = null;


        try {
            // InternalFPML.g:2600:58: (iv_rulePureAlgebraicType= rulePureAlgebraicType EOF )
            // InternalFPML.g:2601:2: iv_rulePureAlgebraicType= rulePureAlgebraicType EOF
            {
             newCompositeNode(grammarAccess.getPureAlgebraicTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePureAlgebraicType=rulePureAlgebraicType();

            state._fsp--;

             current =iv_rulePureAlgebraicType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePureAlgebraicType"


    // $ANTLR start "rulePureAlgebraicType"
    // InternalFPML.g:2607:1: rulePureAlgebraicType returns [EObject current=null] : (otherlv_0= '[' ( (lv_pureAdtElement1_1_0= ruleValueType ) ) ( ( (lv_pureAdtElement2_2_1= rulePureSumTypeFactor | lv_pureAdtElement2_2_2= rulePureProdTypeFactor ) ) ) otherlv_3= ']' ) ;
    public final EObject rulePureAlgebraicType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_pureAdtElement1_1_0 = null;

        EObject lv_pureAdtElement2_2_1 = null;

        EObject lv_pureAdtElement2_2_2 = null;



        	enterRule();

        try {
            // InternalFPML.g:2613:2: ( (otherlv_0= '[' ( (lv_pureAdtElement1_1_0= ruleValueType ) ) ( ( (lv_pureAdtElement2_2_1= rulePureSumTypeFactor | lv_pureAdtElement2_2_2= rulePureProdTypeFactor ) ) ) otherlv_3= ']' ) )
            // InternalFPML.g:2614:2: (otherlv_0= '[' ( (lv_pureAdtElement1_1_0= ruleValueType ) ) ( ( (lv_pureAdtElement2_2_1= rulePureSumTypeFactor | lv_pureAdtElement2_2_2= rulePureProdTypeFactor ) ) ) otherlv_3= ']' )
            {
            // InternalFPML.g:2614:2: (otherlv_0= '[' ( (lv_pureAdtElement1_1_0= ruleValueType ) ) ( ( (lv_pureAdtElement2_2_1= rulePureSumTypeFactor | lv_pureAdtElement2_2_2= rulePureProdTypeFactor ) ) ) otherlv_3= ']' )
            // InternalFPML.g:2615:3: otherlv_0= '[' ( (lv_pureAdtElement1_1_0= ruleValueType ) ) ( ( (lv_pureAdtElement2_2_1= rulePureSumTypeFactor | lv_pureAdtElement2_2_2= rulePureProdTypeFactor ) ) ) otherlv_3= ']'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getPureAlgebraicTypeAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalFPML.g:2619:3: ( (lv_pureAdtElement1_1_0= ruleValueType ) )
            // InternalFPML.g:2620:4: (lv_pureAdtElement1_1_0= ruleValueType )
            {
            // InternalFPML.g:2620:4: (lv_pureAdtElement1_1_0= ruleValueType )
            // InternalFPML.g:2621:5: lv_pureAdtElement1_1_0= ruleValueType
            {

            					newCompositeNode(grammarAccess.getPureAlgebraicTypeAccess().getPureAdtElement1ValueTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_33);
            lv_pureAdtElement1_1_0=ruleValueType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPureAlgebraicTypeRule());
            					}
            					set(
            						current,
            						"pureAdtElement1",
            						lv_pureAdtElement1_1_0,
            						"it.unibo.FPML.ValueType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFPML.g:2638:3: ( ( (lv_pureAdtElement2_2_1= rulePureSumTypeFactor | lv_pureAdtElement2_2_2= rulePureProdTypeFactor ) ) )
            // InternalFPML.g:2639:4: ( (lv_pureAdtElement2_2_1= rulePureSumTypeFactor | lv_pureAdtElement2_2_2= rulePureProdTypeFactor ) )
            {
            // InternalFPML.g:2639:4: ( (lv_pureAdtElement2_2_1= rulePureSumTypeFactor | lv_pureAdtElement2_2_2= rulePureProdTypeFactor ) )
            // InternalFPML.g:2640:5: (lv_pureAdtElement2_2_1= rulePureSumTypeFactor | lv_pureAdtElement2_2_2= rulePureProdTypeFactor )
            {
            // InternalFPML.g:2640:5: (lv_pureAdtElement2_2_1= rulePureSumTypeFactor | lv_pureAdtElement2_2_2= rulePureProdTypeFactor )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==39) ) {
                alt26=1;
            }
            else if ( (LA26_0==40) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalFPML.g:2641:6: lv_pureAdtElement2_2_1= rulePureSumTypeFactor
                    {

                    						newCompositeNode(grammarAccess.getPureAlgebraicTypeAccess().getPureAdtElement2PureSumTypeFactorParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_pureAdtElement2_2_1=rulePureSumTypeFactor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPureAlgebraicTypeRule());
                    						}
                    						set(
                    							current,
                    							"pureAdtElement2",
                    							lv_pureAdtElement2_2_1,
                    							"it.unibo.FPML.PureSumTypeFactor");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalFPML.g:2657:6: lv_pureAdtElement2_2_2= rulePureProdTypeFactor
                    {

                    						newCompositeNode(grammarAccess.getPureAlgebraicTypeAccess().getPureAdtElement2PureProdTypeFactorParserRuleCall_2_0_1());
                    					
                    pushFollow(FOLLOW_34);
                    lv_pureAdtElement2_2_2=rulePureProdTypeFactor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPureAlgebraicTypeRule());
                    						}
                    						set(
                    							current,
                    							"pureAdtElement2",
                    							lv_pureAdtElement2_2_2,
                    							"it.unibo.FPML.PureProdTypeFactor");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            otherlv_3=(Token)match(input,38,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getPureAlgebraicTypeAccess().getRightSquareBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePureAlgebraicType"


    // $ANTLR start "entryRulePureSumTypeFactor"
    // InternalFPML.g:2683:1: entryRulePureSumTypeFactor returns [EObject current=null] : iv_rulePureSumTypeFactor= rulePureSumTypeFactor EOF ;
    public final EObject entryRulePureSumTypeFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePureSumTypeFactor = null;


        try {
            // InternalFPML.g:2683:58: (iv_rulePureSumTypeFactor= rulePureSumTypeFactor EOF )
            // InternalFPML.g:2684:2: iv_rulePureSumTypeFactor= rulePureSumTypeFactor EOF
            {
             newCompositeNode(grammarAccess.getPureSumTypeFactorRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePureSumTypeFactor=rulePureSumTypeFactor();

            state._fsp--;

             current =iv_rulePureSumTypeFactor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePureSumTypeFactor"


    // $ANTLR start "rulePureSumTypeFactor"
    // InternalFPML.g:2690:1: rulePureSumTypeFactor returns [EObject current=null] : (otherlv_0= '+' ( (lv_adtElement_1_0= ruleValueType ) ) ) ;
    public final EObject rulePureSumTypeFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_adtElement_1_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:2696:2: ( (otherlv_0= '+' ( (lv_adtElement_1_0= ruleValueType ) ) ) )
            // InternalFPML.g:2697:2: (otherlv_0= '+' ( (lv_adtElement_1_0= ruleValueType ) ) )
            {
            // InternalFPML.g:2697:2: (otherlv_0= '+' ( (lv_adtElement_1_0= ruleValueType ) ) )
            // InternalFPML.g:2698:3: otherlv_0= '+' ( (lv_adtElement_1_0= ruleValueType ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getPureSumTypeFactorAccess().getPlusSignKeyword_0());
            		
            // InternalFPML.g:2702:3: ( (lv_adtElement_1_0= ruleValueType ) )
            // InternalFPML.g:2703:4: (lv_adtElement_1_0= ruleValueType )
            {
            // InternalFPML.g:2703:4: (lv_adtElement_1_0= ruleValueType )
            // InternalFPML.g:2704:5: lv_adtElement_1_0= ruleValueType
            {

            					newCompositeNode(grammarAccess.getPureSumTypeFactorAccess().getAdtElementValueTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_adtElement_1_0=ruleValueType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPureSumTypeFactorRule());
            					}
            					set(
            						current,
            						"adtElement",
            						lv_adtElement_1_0,
            						"it.unibo.FPML.ValueType");
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
    // $ANTLR end "rulePureSumTypeFactor"


    // $ANTLR start "entryRulePureProdTypeFactor"
    // InternalFPML.g:2725:1: entryRulePureProdTypeFactor returns [EObject current=null] : iv_rulePureProdTypeFactor= rulePureProdTypeFactor EOF ;
    public final EObject entryRulePureProdTypeFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePureProdTypeFactor = null;


        try {
            // InternalFPML.g:2725:59: (iv_rulePureProdTypeFactor= rulePureProdTypeFactor EOF )
            // InternalFPML.g:2726:2: iv_rulePureProdTypeFactor= rulePureProdTypeFactor EOF
            {
             newCompositeNode(grammarAccess.getPureProdTypeFactorRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePureProdTypeFactor=rulePureProdTypeFactor();

            state._fsp--;

             current =iv_rulePureProdTypeFactor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePureProdTypeFactor"


    // $ANTLR start "rulePureProdTypeFactor"
    // InternalFPML.g:2732:1: rulePureProdTypeFactor returns [EObject current=null] : (otherlv_0= '*' ( (lv_adtElement_1_0= ruleValueType ) ) ) ;
    public final EObject rulePureProdTypeFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_adtElement_1_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:2738:2: ( (otherlv_0= '*' ( (lv_adtElement_1_0= ruleValueType ) ) ) )
            // InternalFPML.g:2739:2: (otherlv_0= '*' ( (lv_adtElement_1_0= ruleValueType ) ) )
            {
            // InternalFPML.g:2739:2: (otherlv_0= '*' ( (lv_adtElement_1_0= ruleValueType ) ) )
            // InternalFPML.g:2740:3: otherlv_0= '*' ( (lv_adtElement_1_0= ruleValueType ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getPureProdTypeFactorAccess().getAsteriskKeyword_0());
            		
            // InternalFPML.g:2744:3: ( (lv_adtElement_1_0= ruleValueType ) )
            // InternalFPML.g:2745:4: (lv_adtElement_1_0= ruleValueType )
            {
            // InternalFPML.g:2745:4: (lv_adtElement_1_0= ruleValueType )
            // InternalFPML.g:2746:5: lv_adtElement_1_0= ruleValueType
            {

            					newCompositeNode(grammarAccess.getPureProdTypeFactorAccess().getAdtElementValueTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_adtElement_1_0=ruleValueType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPureProdTypeFactorRule());
            					}
            					set(
            						current,
            						"adtElement",
            						lv_adtElement_1_0,
            						"it.unibo.FPML.ValueType");
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
    // $ANTLR end "rulePureProdTypeFactor"


    // $ANTLR start "entryRuleEffectFullAlgebraicType"
    // InternalFPML.g:2767:1: entryRuleEffectFullAlgebraicType returns [EObject current=null] : iv_ruleEffectFullAlgebraicType= ruleEffectFullAlgebraicType EOF ;
    public final EObject entryRuleEffectFullAlgebraicType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullAlgebraicType = null;


        try {
            // InternalFPML.g:2767:64: (iv_ruleEffectFullAlgebraicType= ruleEffectFullAlgebraicType EOF )
            // InternalFPML.g:2768:2: iv_ruleEffectFullAlgebraicType= ruleEffectFullAlgebraicType EOF
            {
             newCompositeNode(grammarAccess.getEffectFullAlgebraicTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEffectFullAlgebraicType=ruleEffectFullAlgebraicType();

            state._fsp--;

             current =iv_ruleEffectFullAlgebraicType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEffectFullAlgebraicType"


    // $ANTLR start "ruleEffectFullAlgebraicType"
    // InternalFPML.g:2774:1: ruleEffectFullAlgebraicType returns [EObject current=null] : (otherlv_0= '[' ( (lv_effectFullAdtElement1_1_0= ruleIOType ) ) ( ( (lv_effectFullAdtElement2_2_1= ruleEffectFullSumTypeFactor | lv_effectFullAdtElement2_2_2= ruleEffectFullProdTypeFactor ) ) ) otherlv_3= ']' ) ;
    public final EObject ruleEffectFullAlgebraicType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_effectFullAdtElement1_1_0 = null;

        EObject lv_effectFullAdtElement2_2_1 = null;

        EObject lv_effectFullAdtElement2_2_2 = null;



        	enterRule();

        try {
            // InternalFPML.g:2780:2: ( (otherlv_0= '[' ( (lv_effectFullAdtElement1_1_0= ruleIOType ) ) ( ( (lv_effectFullAdtElement2_2_1= ruleEffectFullSumTypeFactor | lv_effectFullAdtElement2_2_2= ruleEffectFullProdTypeFactor ) ) ) otherlv_3= ']' ) )
            // InternalFPML.g:2781:2: (otherlv_0= '[' ( (lv_effectFullAdtElement1_1_0= ruleIOType ) ) ( ( (lv_effectFullAdtElement2_2_1= ruleEffectFullSumTypeFactor | lv_effectFullAdtElement2_2_2= ruleEffectFullProdTypeFactor ) ) ) otherlv_3= ']' )
            {
            // InternalFPML.g:2781:2: (otherlv_0= '[' ( (lv_effectFullAdtElement1_1_0= ruleIOType ) ) ( ( (lv_effectFullAdtElement2_2_1= ruleEffectFullSumTypeFactor | lv_effectFullAdtElement2_2_2= ruleEffectFullProdTypeFactor ) ) ) otherlv_3= ']' )
            // InternalFPML.g:2782:3: otherlv_0= '[' ( (lv_effectFullAdtElement1_1_0= ruleIOType ) ) ( ( (lv_effectFullAdtElement2_2_1= ruleEffectFullSumTypeFactor | lv_effectFullAdtElement2_2_2= ruleEffectFullProdTypeFactor ) ) ) otherlv_3= ']'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getEffectFullAlgebraicTypeAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalFPML.g:2786:3: ( (lv_effectFullAdtElement1_1_0= ruleIOType ) )
            // InternalFPML.g:2787:4: (lv_effectFullAdtElement1_1_0= ruleIOType )
            {
            // InternalFPML.g:2787:4: (lv_effectFullAdtElement1_1_0= ruleIOType )
            // InternalFPML.g:2788:5: lv_effectFullAdtElement1_1_0= ruleIOType
            {

            					newCompositeNode(grammarAccess.getEffectFullAlgebraicTypeAccess().getEffectFullAdtElement1IOTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_33);
            lv_effectFullAdtElement1_1_0=ruleIOType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEffectFullAlgebraicTypeRule());
            					}
            					set(
            						current,
            						"effectFullAdtElement1",
            						lv_effectFullAdtElement1_1_0,
            						"it.unibo.FPML.IOType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFPML.g:2805:3: ( ( (lv_effectFullAdtElement2_2_1= ruleEffectFullSumTypeFactor | lv_effectFullAdtElement2_2_2= ruleEffectFullProdTypeFactor ) ) )
            // InternalFPML.g:2806:4: ( (lv_effectFullAdtElement2_2_1= ruleEffectFullSumTypeFactor | lv_effectFullAdtElement2_2_2= ruleEffectFullProdTypeFactor ) )
            {
            // InternalFPML.g:2806:4: ( (lv_effectFullAdtElement2_2_1= ruleEffectFullSumTypeFactor | lv_effectFullAdtElement2_2_2= ruleEffectFullProdTypeFactor ) )
            // InternalFPML.g:2807:5: (lv_effectFullAdtElement2_2_1= ruleEffectFullSumTypeFactor | lv_effectFullAdtElement2_2_2= ruleEffectFullProdTypeFactor )
            {
            // InternalFPML.g:2807:5: (lv_effectFullAdtElement2_2_1= ruleEffectFullSumTypeFactor | lv_effectFullAdtElement2_2_2= ruleEffectFullProdTypeFactor )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==39) ) {
                alt27=1;
            }
            else if ( (LA27_0==40) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalFPML.g:2808:6: lv_effectFullAdtElement2_2_1= ruleEffectFullSumTypeFactor
                    {

                    						newCompositeNode(grammarAccess.getEffectFullAlgebraicTypeAccess().getEffectFullAdtElement2EffectFullSumTypeFactorParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_effectFullAdtElement2_2_1=ruleEffectFullSumTypeFactor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEffectFullAlgebraicTypeRule());
                    						}
                    						set(
                    							current,
                    							"effectFullAdtElement2",
                    							lv_effectFullAdtElement2_2_1,
                    							"it.unibo.FPML.EffectFullSumTypeFactor");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalFPML.g:2824:6: lv_effectFullAdtElement2_2_2= ruleEffectFullProdTypeFactor
                    {

                    						newCompositeNode(grammarAccess.getEffectFullAlgebraicTypeAccess().getEffectFullAdtElement2EffectFullProdTypeFactorParserRuleCall_2_0_1());
                    					
                    pushFollow(FOLLOW_34);
                    lv_effectFullAdtElement2_2_2=ruleEffectFullProdTypeFactor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEffectFullAlgebraicTypeRule());
                    						}
                    						set(
                    							current,
                    							"effectFullAdtElement2",
                    							lv_effectFullAdtElement2_2_2,
                    							"it.unibo.FPML.EffectFullProdTypeFactor");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            otherlv_3=(Token)match(input,38,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getEffectFullAlgebraicTypeAccess().getRightSquareBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEffectFullAlgebraicType"


    // $ANTLR start "entryRuleEffectFullSumTypeFactor"
    // InternalFPML.g:2850:1: entryRuleEffectFullSumTypeFactor returns [EObject current=null] : iv_ruleEffectFullSumTypeFactor= ruleEffectFullSumTypeFactor EOF ;
    public final EObject entryRuleEffectFullSumTypeFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullSumTypeFactor = null;


        try {
            // InternalFPML.g:2850:64: (iv_ruleEffectFullSumTypeFactor= ruleEffectFullSumTypeFactor EOF )
            // InternalFPML.g:2851:2: iv_ruleEffectFullSumTypeFactor= ruleEffectFullSumTypeFactor EOF
            {
             newCompositeNode(grammarAccess.getEffectFullSumTypeFactorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEffectFullSumTypeFactor=ruleEffectFullSumTypeFactor();

            state._fsp--;

             current =iv_ruleEffectFullSumTypeFactor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEffectFullSumTypeFactor"


    // $ANTLR start "ruleEffectFullSumTypeFactor"
    // InternalFPML.g:2857:1: ruleEffectFullSumTypeFactor returns [EObject current=null] : (otherlv_0= '+' ( (lv_adtElement_1_0= ruleIOType ) ) ) ;
    public final EObject ruleEffectFullSumTypeFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_adtElement_1_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:2863:2: ( (otherlv_0= '+' ( (lv_adtElement_1_0= ruleIOType ) ) ) )
            // InternalFPML.g:2864:2: (otherlv_0= '+' ( (lv_adtElement_1_0= ruleIOType ) ) )
            {
            // InternalFPML.g:2864:2: (otherlv_0= '+' ( (lv_adtElement_1_0= ruleIOType ) ) )
            // InternalFPML.g:2865:3: otherlv_0= '+' ( (lv_adtElement_1_0= ruleIOType ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getEffectFullSumTypeFactorAccess().getPlusSignKeyword_0());
            		
            // InternalFPML.g:2869:3: ( (lv_adtElement_1_0= ruleIOType ) )
            // InternalFPML.g:2870:4: (lv_adtElement_1_0= ruleIOType )
            {
            // InternalFPML.g:2870:4: (lv_adtElement_1_0= ruleIOType )
            // InternalFPML.g:2871:5: lv_adtElement_1_0= ruleIOType
            {

            					newCompositeNode(grammarAccess.getEffectFullSumTypeFactorAccess().getAdtElementIOTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_adtElement_1_0=ruleIOType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEffectFullSumTypeFactorRule());
            					}
            					set(
            						current,
            						"adtElement",
            						lv_adtElement_1_0,
            						"it.unibo.FPML.IOType");
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
    // $ANTLR end "ruleEffectFullSumTypeFactor"


    // $ANTLR start "entryRuleEffectFullProdTypeFactor"
    // InternalFPML.g:2892:1: entryRuleEffectFullProdTypeFactor returns [EObject current=null] : iv_ruleEffectFullProdTypeFactor= ruleEffectFullProdTypeFactor EOF ;
    public final EObject entryRuleEffectFullProdTypeFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullProdTypeFactor = null;


        try {
            // InternalFPML.g:2892:65: (iv_ruleEffectFullProdTypeFactor= ruleEffectFullProdTypeFactor EOF )
            // InternalFPML.g:2893:2: iv_ruleEffectFullProdTypeFactor= ruleEffectFullProdTypeFactor EOF
            {
             newCompositeNode(grammarAccess.getEffectFullProdTypeFactorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEffectFullProdTypeFactor=ruleEffectFullProdTypeFactor();

            state._fsp--;

             current =iv_ruleEffectFullProdTypeFactor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEffectFullProdTypeFactor"


    // $ANTLR start "ruleEffectFullProdTypeFactor"
    // InternalFPML.g:2899:1: ruleEffectFullProdTypeFactor returns [EObject current=null] : (otherlv_0= '*' ( (lv_adtElement_1_0= ruleIOType ) ) ) ;
    public final EObject ruleEffectFullProdTypeFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_adtElement_1_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:2905:2: ( (otherlv_0= '*' ( (lv_adtElement_1_0= ruleIOType ) ) ) )
            // InternalFPML.g:2906:2: (otherlv_0= '*' ( (lv_adtElement_1_0= ruleIOType ) ) )
            {
            // InternalFPML.g:2906:2: (otherlv_0= '*' ( (lv_adtElement_1_0= ruleIOType ) ) )
            // InternalFPML.g:2907:3: otherlv_0= '*' ( (lv_adtElement_1_0= ruleIOType ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getEffectFullProdTypeFactorAccess().getAsteriskKeyword_0());
            		
            // InternalFPML.g:2911:3: ( (lv_adtElement_1_0= ruleIOType ) )
            // InternalFPML.g:2912:4: (lv_adtElement_1_0= ruleIOType )
            {
            // InternalFPML.g:2912:4: (lv_adtElement_1_0= ruleIOType )
            // InternalFPML.g:2913:5: lv_adtElement_1_0= ruleIOType
            {

            					newCompositeNode(grammarAccess.getEffectFullProdTypeFactorAccess().getAdtElementIOTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_adtElement_1_0=ruleIOType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEffectFullProdTypeFactorRule());
            					}
            					set(
            						current,
            						"adtElement",
            						lv_adtElement_1_0,
            						"it.unibo.FPML.IOType");
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
    // $ANTLR end "ruleEffectFullProdTypeFactor"


    // $ANTLR start "entryRuleEffectFullExpression"
    // InternalFPML.g:2934:1: entryRuleEffectFullExpression returns [EObject current=null] : iv_ruleEffectFullExpression= ruleEffectFullExpression EOF ;
    public final EObject entryRuleEffectFullExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullExpression = null;


        try {
            // InternalFPML.g:2934:61: (iv_ruleEffectFullExpression= ruleEffectFullExpression EOF )
            // InternalFPML.g:2935:2: iv_ruleEffectFullExpression= ruleEffectFullExpression EOF
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
    // InternalFPML.g:2941:1: ruleEffectFullExpression returns [EObject current=null] : ( ( () otherlv_1= 'IO' otherlv_2= '[' ( (lv_exp_3_0= ruleEffectFullExpression ) ) otherlv_4= ']' ) | (otherlv_5= 'IO' otherlv_6= '(' this_Expression_7= ruleExpression otherlv_8= ')' ) | this_EffectFullFunctionValue_9= ruleEffectFullFunctionValue | this_EffectFullDataValue_10= ruleEffectFullDataValue ) ;
    public final EObject ruleEffectFullExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_exp_3_0 = null;

        EObject this_Expression_7 = null;

        EObject this_EffectFullFunctionValue_9 = null;

        EObject this_EffectFullDataValue_10 = null;



        	enterRule();

        try {
            // InternalFPML.g:2947:2: ( ( ( () otherlv_1= 'IO' otherlv_2= '[' ( (lv_exp_3_0= ruleEffectFullExpression ) ) otherlv_4= ']' ) | (otherlv_5= 'IO' otherlv_6= '(' this_Expression_7= ruleExpression otherlv_8= ')' ) | this_EffectFullFunctionValue_9= ruleEffectFullFunctionValue | this_EffectFullDataValue_10= ruleEffectFullDataValue ) )
            // InternalFPML.g:2948:2: ( ( () otherlv_1= 'IO' otherlv_2= '[' ( (lv_exp_3_0= ruleEffectFullExpression ) ) otherlv_4= ']' ) | (otherlv_5= 'IO' otherlv_6= '(' this_Expression_7= ruleExpression otherlv_8= ')' ) | this_EffectFullFunctionValue_9= ruleEffectFullFunctionValue | this_EffectFullDataValue_10= ruleEffectFullDataValue )
            {
            // InternalFPML.g:2948:2: ( ( () otherlv_1= 'IO' otherlv_2= '[' ( (lv_exp_3_0= ruleEffectFullExpression ) ) otherlv_4= ']' ) | (otherlv_5= 'IO' otherlv_6= '(' this_Expression_7= ruleExpression otherlv_8= ')' ) | this_EffectFullFunctionValue_9= ruleEffectFullFunctionValue | this_EffectFullDataValue_10= ruleEffectFullDataValue )
            int alt28=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==20) ) {
                    alt28=2;
                }
                else if ( (LA28_1==37) ) {
                    alt28=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 1, input);

                    throw nvae;
                }
                }
                break;
            case 37:
                {
                alt28=3;
                }
                break;
            case RULE_ID:
                {
                alt28=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalFPML.g:2949:3: ( () otherlv_1= 'IO' otherlv_2= '[' ( (lv_exp_3_0= ruleEffectFullExpression ) ) otherlv_4= ']' )
                    {
                    // InternalFPML.g:2949:3: ( () otherlv_1= 'IO' otherlv_2= '[' ( (lv_exp_3_0= ruleEffectFullExpression ) ) otherlv_4= ']' )
                    // InternalFPML.g:2950:4: () otherlv_1= 'IO' otherlv_2= '[' ( (lv_exp_3_0= ruleEffectFullExpression ) ) otherlv_4= ']'
                    {
                    // InternalFPML.g:2950:4: ()
                    // InternalFPML.g:2951:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getEffectFullExpressionAccess().getRecursiveEffectFullExpressionAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,23,FOLLOW_35); 

                    				newLeafNode(otherlv_1, grammarAccess.getEffectFullExpressionAccess().getIOKeyword_0_1());
                    			
                    otherlv_2=(Token)match(input,37,FOLLOW_16); 

                    				newLeafNode(otherlv_2, grammarAccess.getEffectFullExpressionAccess().getLeftSquareBracketKeyword_0_2());
                    			
                    // InternalFPML.g:2965:4: ( (lv_exp_3_0= ruleEffectFullExpression ) )
                    // InternalFPML.g:2966:5: (lv_exp_3_0= ruleEffectFullExpression )
                    {
                    // InternalFPML.g:2966:5: (lv_exp_3_0= ruleEffectFullExpression )
                    // InternalFPML.g:2967:6: lv_exp_3_0= ruleEffectFullExpression
                    {

                    						newCompositeNode(grammarAccess.getEffectFullExpressionAccess().getExpEffectFullExpressionParserRuleCall_0_3_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_exp_3_0=ruleEffectFullExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEffectFullExpressionRule());
                    						}
                    						set(
                    							current,
                    							"exp",
                    							lv_exp_3_0,
                    							"it.unibo.FPML.EffectFullExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,38,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getEffectFullExpressionAccess().getRightSquareBracketKeyword_0_4());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFPML.g:2990:3: (otherlv_5= 'IO' otherlv_6= '(' this_Expression_7= ruleExpression otherlv_8= ')' )
                    {
                    // InternalFPML.g:2990:3: (otherlv_5= 'IO' otherlv_6= '(' this_Expression_7= ruleExpression otherlv_8= ')' )
                    // InternalFPML.g:2991:4: otherlv_5= 'IO' otherlv_6= '(' this_Expression_7= ruleExpression otherlv_8= ')'
                    {
                    otherlv_5=(Token)match(input,23,FOLLOW_18); 

                    				newLeafNode(otherlv_5, grammarAccess.getEffectFullExpressionAccess().getIOKeyword_1_0());
                    			
                    otherlv_6=(Token)match(input,20,FOLLOW_14); 

                    				newLeafNode(otherlv_6, grammarAccess.getEffectFullExpressionAccess().getLeftParenthesisKeyword_1_1());
                    			

                    				newCompositeNode(grammarAccess.getEffectFullExpressionAccess().getExpressionParserRuleCall_1_2());
                    			
                    pushFollow(FOLLOW_20);
                    this_Expression_7=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_7;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_8=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getEffectFullExpressionAccess().getRightParenthesisKeyword_1_3());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalFPML.g:3013:3: this_EffectFullFunctionValue_9= ruleEffectFullFunctionValue
                    {

                    			newCompositeNode(grammarAccess.getEffectFullExpressionAccess().getEffectFullFunctionValueParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_EffectFullFunctionValue_9=ruleEffectFullFunctionValue();

                    state._fsp--;


                    			current = this_EffectFullFunctionValue_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalFPML.g:3022:3: this_EffectFullDataValue_10= ruleEffectFullDataValue
                    {

                    			newCompositeNode(grammarAccess.getEffectFullExpressionAccess().getEffectFullDataValueParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_EffectFullDataValue_10=ruleEffectFullDataValue();

                    state._fsp--;


                    			current = this_EffectFullDataValue_10;
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
    // InternalFPML.g:3034:1: entryRuleUnitValue returns [EObject current=null] : iv_ruleUnitValue= ruleUnitValue EOF ;
    public final EObject entryRuleUnitValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnitValue = null;


        try {
            // InternalFPML.g:3034:50: (iv_ruleUnitValue= ruleUnitValue EOF )
            // InternalFPML.g:3035:2: iv_ruleUnitValue= ruleUnitValue EOF
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
    // InternalFPML.g:3041:1: ruleUnitValue returns [EObject current=null] : ( () otherlv_1= '()' ) ;
    public final EObject ruleUnitValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFPML.g:3047:2: ( ( () otherlv_1= '()' ) )
            // InternalFPML.g:3048:2: ( () otherlv_1= '()' )
            {
            // InternalFPML.g:3048:2: ( () otherlv_1= '()' )
            // InternalFPML.g:3049:3: () otherlv_1= '()'
            {
            // InternalFPML.g:3049:3: ()
            // InternalFPML.g:3050:4: 
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
    // InternalFPML.g:3064:1: entryRuleEffectFullFunctionValue returns [EObject current=null] : iv_ruleEffectFullFunctionValue= ruleEffectFullFunctionValue EOF ;
    public final EObject entryRuleEffectFullFunctionValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullFunctionValue = null;


        try {
            // InternalFPML.g:3064:64: (iv_ruleEffectFullFunctionValue= ruleEffectFullFunctionValue EOF )
            // InternalFPML.g:3065:2: iv_ruleEffectFullFunctionValue= ruleEffectFullFunctionValue EOF
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
    // InternalFPML.g:3071:1: ruleEffectFullFunctionValue returns [EObject current=null] : ( (lv_value_0_0= ruleEffectFullLambda ) ) ;
    public final EObject ruleEffectFullFunctionValue() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:3077:2: ( ( (lv_value_0_0= ruleEffectFullLambda ) ) )
            // InternalFPML.g:3078:2: ( (lv_value_0_0= ruleEffectFullLambda ) )
            {
            // InternalFPML.g:3078:2: ( (lv_value_0_0= ruleEffectFullLambda ) )
            // InternalFPML.g:3079:3: (lv_value_0_0= ruleEffectFullLambda )
            {
            // InternalFPML.g:3079:3: (lv_value_0_0= ruleEffectFullLambda )
            // InternalFPML.g:3080:4: lv_value_0_0= ruleEffectFullLambda
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
    // InternalFPML.g:3100:1: entryRuleEffectFullValueRef returns [EObject current=null] : iv_ruleEffectFullValueRef= ruleEffectFullValueRef EOF ;
    public final EObject entryRuleEffectFullValueRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullValueRef = null;


        try {
            // InternalFPML.g:3100:59: (iv_ruleEffectFullValueRef= ruleEffectFullValueRef EOF )
            // InternalFPML.g:3101:2: iv_ruleEffectFullValueRef= ruleEffectFullValueRef EOF
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
    // InternalFPML.g:3107:1: ruleEffectFullValueRef returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleEffectFullValueRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFPML.g:3113:2: ( ( () ( (otherlv_1= RULE_ID ) ) ) )
            // InternalFPML.g:3114:2: ( () ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalFPML.g:3114:2: ( () ( (otherlv_1= RULE_ID ) ) )
            // InternalFPML.g:3115:3: () ( (otherlv_1= RULE_ID ) )
            {
            // InternalFPML.g:3115:3: ()
            // InternalFPML.g:3116:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEffectFullValueRefAccess().getEffectFullValueRefAction_0(),
            					current);
            			

            }

            // InternalFPML.g:3122:3: ( (otherlv_1= RULE_ID ) )
            // InternalFPML.g:3123:4: (otherlv_1= RULE_ID )
            {
            // InternalFPML.g:3123:4: (otherlv_1= RULE_ID )
            // InternalFPML.g:3124:5: otherlv_1= RULE_ID
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
    // InternalFPML.g:3139:1: entryRuleEffectFullLambda returns [EObject current=null] : iv_ruleEffectFullLambda= ruleEffectFullLambda EOF ;
    public final EObject entryRuleEffectFullLambda() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullLambda = null;


        try {
            // InternalFPML.g:3139:57: (iv_ruleEffectFullLambda= ruleEffectFullLambda EOF )
            // InternalFPML.g:3140:2: iv_ruleEffectFullLambda= ruleEffectFullLambda EOF
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
    // InternalFPML.g:3146:1: ruleEffectFullLambda returns [EObject current=null] : ( ( () otherlv_1= '[' ( (lv_arg_2_0= ruleEffectFullArgument ) ) otherlv_3= ']' otherlv_4= ':' otherlv_5= '{' ( (lv_functionBody_6_0= ruleCompositionFunctionBodyEffect ) ) otherlv_7= '}' ) | ( () otherlv_9= '[' otherlv_10= ']' otherlv_11= ':' otherlv_12= '{' ( (lv_functionBody_13_0= ruleCompositionFunctionBodyEffect ) ) otherlv_14= '}' ) ) ;
    public final EObject ruleEffectFullLambda() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject lv_arg_2_0 = null;

        EObject lv_functionBody_6_0 = null;

        EObject lv_functionBody_13_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:3152:2: ( ( ( () otherlv_1= '[' ( (lv_arg_2_0= ruleEffectFullArgument ) ) otherlv_3= ']' otherlv_4= ':' otherlv_5= '{' ( (lv_functionBody_6_0= ruleCompositionFunctionBodyEffect ) ) otherlv_7= '}' ) | ( () otherlv_9= '[' otherlv_10= ']' otherlv_11= ':' otherlv_12= '{' ( (lv_functionBody_13_0= ruleCompositionFunctionBodyEffect ) ) otherlv_14= '}' ) ) )
            // InternalFPML.g:3153:2: ( ( () otherlv_1= '[' ( (lv_arg_2_0= ruleEffectFullArgument ) ) otherlv_3= ']' otherlv_4= ':' otherlv_5= '{' ( (lv_functionBody_6_0= ruleCompositionFunctionBodyEffect ) ) otherlv_7= '}' ) | ( () otherlv_9= '[' otherlv_10= ']' otherlv_11= ':' otherlv_12= '{' ( (lv_functionBody_13_0= ruleCompositionFunctionBodyEffect ) ) otherlv_14= '}' ) )
            {
            // InternalFPML.g:3153:2: ( ( () otherlv_1= '[' ( (lv_arg_2_0= ruleEffectFullArgument ) ) otherlv_3= ']' otherlv_4= ':' otherlv_5= '{' ( (lv_functionBody_6_0= ruleCompositionFunctionBodyEffect ) ) otherlv_7= '}' ) | ( () otherlv_9= '[' otherlv_10= ']' otherlv_11= ':' otherlv_12= '{' ( (lv_functionBody_13_0= ruleCompositionFunctionBodyEffect ) ) otherlv_14= '}' ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==37) ) {
                int LA29_1 = input.LA(2);

                if ( (LA29_1==38) ) {
                    alt29=2;
                }
                else if ( (LA29_1==RULE_ID||LA29_1==23||(LA29_1>=28 && LA29_1<=33)||(LA29_1>=36 && LA29_1<=37)) ) {
                    alt29=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalFPML.g:3154:3: ( () otherlv_1= '[' ( (lv_arg_2_0= ruleEffectFullArgument ) ) otherlv_3= ']' otherlv_4= ':' otherlv_5= '{' ( (lv_functionBody_6_0= ruleCompositionFunctionBodyEffect ) ) otherlv_7= '}' )
                    {
                    // InternalFPML.g:3154:3: ( () otherlv_1= '[' ( (lv_arg_2_0= ruleEffectFullArgument ) ) otherlv_3= ']' otherlv_4= ':' otherlv_5= '{' ( (lv_functionBody_6_0= ruleCompositionFunctionBodyEffect ) ) otherlv_7= '}' )
                    // InternalFPML.g:3155:4: () otherlv_1= '[' ( (lv_arg_2_0= ruleEffectFullArgument ) ) otherlv_3= ']' otherlv_4= ':' otherlv_5= '{' ( (lv_functionBody_6_0= ruleCompositionFunctionBodyEffect ) ) otherlv_7= '}'
                    {
                    // InternalFPML.g:3155:4: ()
                    // InternalFPML.g:3156:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getEffectFullLambdaAccess().getEffectFullLambdaAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,37,FOLLOW_23); 

                    				newLeafNode(otherlv_1, grammarAccess.getEffectFullLambdaAccess().getLeftSquareBracketKeyword_0_1());
                    			
                    // InternalFPML.g:3166:4: ( (lv_arg_2_0= ruleEffectFullArgument ) )
                    // InternalFPML.g:3167:5: (lv_arg_2_0= ruleEffectFullArgument )
                    {
                    // InternalFPML.g:3167:5: (lv_arg_2_0= ruleEffectFullArgument )
                    // InternalFPML.g:3168:6: lv_arg_2_0= ruleEffectFullArgument
                    {

                    						newCompositeNode(grammarAccess.getEffectFullLambdaAccess().getArgEffectFullArgumentParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_34);
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

                    otherlv_3=(Token)match(input,38,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getEffectFullLambdaAccess().getRightSquareBracketKeyword_0_3());
                    			
                    otherlv_4=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getEffectFullLambdaAccess().getColonKeyword_0_4());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_24); 

                    				newLeafNode(otherlv_5, grammarAccess.getEffectFullLambdaAccess().getLeftCurlyBracketKeyword_0_5());
                    			
                    // InternalFPML.g:3197:4: ( (lv_functionBody_6_0= ruleCompositionFunctionBodyEffect ) )
                    // InternalFPML.g:3198:5: (lv_functionBody_6_0= ruleCompositionFunctionBodyEffect )
                    {
                    // InternalFPML.g:3198:5: (lv_functionBody_6_0= ruleCompositionFunctionBodyEffect )
                    // InternalFPML.g:3199:6: lv_functionBody_6_0= ruleCompositionFunctionBodyEffect
                    {

                    						newCompositeNode(grammarAccess.getEffectFullLambdaAccess().getFunctionBodyCompositionFunctionBodyEffectParserRuleCall_0_6_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_functionBody_6_0=ruleCompositionFunctionBodyEffect();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEffectFullLambdaRule());
                    						}
                    						set(
                    							current,
                    							"functionBody",
                    							lv_functionBody_6_0,
                    							"it.unibo.FPML.CompositionFunctionBodyEffect");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getEffectFullLambdaAccess().getRightCurlyBracketKeyword_0_7());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFPML.g:3222:3: ( () otherlv_9= '[' otherlv_10= ']' otherlv_11= ':' otherlv_12= '{' ( (lv_functionBody_13_0= ruleCompositionFunctionBodyEffect ) ) otherlv_14= '}' )
                    {
                    // InternalFPML.g:3222:3: ( () otherlv_9= '[' otherlv_10= ']' otherlv_11= ':' otherlv_12= '{' ( (lv_functionBody_13_0= ruleCompositionFunctionBodyEffect ) ) otherlv_14= '}' )
                    // InternalFPML.g:3223:4: () otherlv_9= '[' otherlv_10= ']' otherlv_11= ':' otherlv_12= '{' ( (lv_functionBody_13_0= ruleCompositionFunctionBodyEffect ) ) otherlv_14= '}'
                    {
                    // InternalFPML.g:3223:4: ()
                    // InternalFPML.g:3224:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getEffectFullLambdaAccess().getEffectFullLambdaAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_9=(Token)match(input,37,FOLLOW_34); 

                    				newLeafNode(otherlv_9, grammarAccess.getEffectFullLambdaAccess().getLeftSquareBracketKeyword_1_1());
                    			
                    otherlv_10=(Token)match(input,38,FOLLOW_12); 

                    				newLeafNode(otherlv_10, grammarAccess.getEffectFullLambdaAccess().getRightSquareBracketKeyword_1_2());
                    			
                    otherlv_11=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_11, grammarAccess.getEffectFullLambdaAccess().getColonKeyword_1_3());
                    			
                    otherlv_12=(Token)match(input,12,FOLLOW_24); 

                    				newLeafNode(otherlv_12, grammarAccess.getEffectFullLambdaAccess().getLeftCurlyBracketKeyword_1_4());
                    			
                    // InternalFPML.g:3246:4: ( (lv_functionBody_13_0= ruleCompositionFunctionBodyEffect ) )
                    // InternalFPML.g:3247:5: (lv_functionBody_13_0= ruleCompositionFunctionBodyEffect )
                    {
                    // InternalFPML.g:3247:5: (lv_functionBody_13_0= ruleCompositionFunctionBodyEffect )
                    // InternalFPML.g:3248:6: lv_functionBody_13_0= ruleCompositionFunctionBodyEffect
                    {

                    						newCompositeNode(grammarAccess.getEffectFullLambdaAccess().getFunctionBodyCompositionFunctionBodyEffectParserRuleCall_1_5_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_functionBody_13_0=ruleCompositionFunctionBodyEffect();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEffectFullLambdaRule());
                    						}
                    						set(
                    							current,
                    							"functionBody",
                    							lv_functionBody_13_0,
                    							"it.unibo.FPML.CompositionFunctionBodyEffect");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_14=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_14, grammarAccess.getEffectFullLambdaAccess().getRightCurlyBracketKeyword_1_6());
                    			

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
    // InternalFPML.g:3274:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalFPML.g:3274:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalFPML.g:3275:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalFPML.g:3281:1: ruleExpression returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_DataValue_2= ruleDataValue | this_FunctionValue_3= ruleFunctionValue | this_UnitValue_4= ruleUnitValue | this_PureValueRef_5= rulePureValueRef | this_PureSumValue_6= rulePureSumValue | this_PureProdValue_7= rulePureProdValue ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_IntValue_0 = null;

        EObject this_StringValue_1 = null;

        EObject this_DataValue_2 = null;

        EObject this_FunctionValue_3 = null;

        EObject this_UnitValue_4 = null;

        EObject this_PureValueRef_5 = null;

        EObject this_PureSumValue_6 = null;

        EObject this_PureProdValue_7 = null;



        	enterRule();

        try {
            // InternalFPML.g:3287:2: ( (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_DataValue_2= ruleDataValue | this_FunctionValue_3= ruleFunctionValue | this_UnitValue_4= ruleUnitValue | this_PureValueRef_5= rulePureValueRef | this_PureSumValue_6= rulePureSumValue | this_PureProdValue_7= rulePureProdValue ) )
            // InternalFPML.g:3288:2: (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_DataValue_2= ruleDataValue | this_FunctionValue_3= ruleFunctionValue | this_UnitValue_4= ruleUnitValue | this_PureValueRef_5= rulePureValueRef | this_PureSumValue_6= rulePureSumValue | this_PureProdValue_7= rulePureProdValue )
            {
            // InternalFPML.g:3288:2: (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_DataValue_2= ruleDataValue | this_FunctionValue_3= ruleFunctionValue | this_UnitValue_4= ruleUnitValue | this_PureValueRef_5= rulePureValueRef | this_PureSumValue_6= rulePureSumValue | this_PureProdValue_7= rulePureProdValue )
            int alt30=8;
            alt30 = dfa30.predict(input);
            switch (alt30) {
                case 1 :
                    // InternalFPML.g:3289:3: this_IntValue_0= ruleIntValue
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
                    // InternalFPML.g:3298:3: this_StringValue_1= ruleStringValue
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
                    // InternalFPML.g:3307:3: this_DataValue_2= ruleDataValue
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
                    // InternalFPML.g:3316:3: this_FunctionValue_3= ruleFunctionValue
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getFunctionValueParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_FunctionValue_3=ruleFunctionValue();

                    state._fsp--;


                    			current = this_FunctionValue_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalFPML.g:3325:3: this_UnitValue_4= ruleUnitValue
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getUnitValueParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_UnitValue_4=ruleUnitValue();

                    state._fsp--;


                    			current = this_UnitValue_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalFPML.g:3334:3: this_PureValueRef_5= rulePureValueRef
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getPureValueRefParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_PureValueRef_5=rulePureValueRef();

                    state._fsp--;


                    			current = this_PureValueRef_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalFPML.g:3343:3: this_PureSumValue_6= rulePureSumValue
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getPureSumValueParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_PureSumValue_6=rulePureSumValue();

                    state._fsp--;


                    			current = this_PureSumValue_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalFPML.g:3352:3: this_PureProdValue_7= rulePureProdValue
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getPureProdValueParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_PureProdValue_7=rulePureProdValue();

                    state._fsp--;


                    			current = this_PureProdValue_7;
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
    // InternalFPML.g:3364:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // InternalFPML.g:3364:49: (iv_ruleIntValue= ruleIntValue EOF )
            // InternalFPML.g:3365:2: iv_ruleIntValue= ruleIntValue EOF
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
    // InternalFPML.g:3371:1: ruleIntValue returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalFPML.g:3377:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // InternalFPML.g:3378:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // InternalFPML.g:3378:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // InternalFPML.g:3379:3: () ( (lv_value_1_0= RULE_INT ) )
            {
            // InternalFPML.g:3379:3: ()
            // InternalFPML.g:3380:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntValueAccess().getIntegerTypeAction_0(),
            					current);
            			

            }

            // InternalFPML.g:3386:3: ( (lv_value_1_0= RULE_INT ) )
            // InternalFPML.g:3387:4: (lv_value_1_0= RULE_INT )
            {
            // InternalFPML.g:3387:4: (lv_value_1_0= RULE_INT )
            // InternalFPML.g:3388:5: lv_value_1_0= RULE_INT
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
    // InternalFPML.g:3408:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalFPML.g:3408:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalFPML.g:3409:2: iv_ruleStringValue= ruleStringValue EOF
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
    // InternalFPML.g:3415:1: ruleStringValue returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalFPML.g:3421:2: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalFPML.g:3422:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalFPML.g:3422:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalFPML.g:3423:3: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // InternalFPML.g:3423:3: ()
            // InternalFPML.g:3424:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStringValueAccess().getStringTypeAction_0(),
            					current);
            			

            }

            // InternalFPML.g:3430:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalFPML.g:3431:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalFPML.g:3431:4: (lv_value_1_0= RULE_STRING )
            // InternalFPML.g:3432:5: lv_value_1_0= RULE_STRING
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
    // InternalFPML.g:3452:1: entryRuleFunctionValue returns [EObject current=null] : iv_ruleFunctionValue= ruleFunctionValue EOF ;
    public final EObject entryRuleFunctionValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionValue = null;


        try {
            // InternalFPML.g:3452:54: (iv_ruleFunctionValue= ruleFunctionValue EOF )
            // InternalFPML.g:3453:2: iv_ruleFunctionValue= ruleFunctionValue EOF
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
    // InternalFPML.g:3459:1: ruleFunctionValue returns [EObject current=null] : ( (lv_value_0_0= rulePureLambda ) ) ;
    public final EObject ruleFunctionValue() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:3465:2: ( ( (lv_value_0_0= rulePureLambda ) ) )
            // InternalFPML.g:3466:2: ( (lv_value_0_0= rulePureLambda ) )
            {
            // InternalFPML.g:3466:2: ( (lv_value_0_0= rulePureLambda ) )
            // InternalFPML.g:3467:3: (lv_value_0_0= rulePureLambda )
            {
            // InternalFPML.g:3467:3: (lv_value_0_0= rulePureLambda )
            // InternalFPML.g:3468:4: lv_value_0_0= rulePureLambda
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
    // InternalFPML.g:3488:1: entryRuleDataValue returns [EObject current=null] : iv_ruleDataValue= ruleDataValue EOF ;
    public final EObject entryRuleDataValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataValue = null;


        try {
            // InternalFPML.g:3488:50: (iv_ruleDataValue= ruleDataValue EOF )
            // InternalFPML.g:3489:2: iv_ruleDataValue= ruleDataValue EOF
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
    // InternalFPML.g:3495:1: ruleDataValue returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_value_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleDataValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:3501:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_value_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalFPML.g:3502:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_value_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalFPML.g:3502:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_value_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalFPML.g:3503:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_value_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            // InternalFPML.g:3503:3: ()
            // InternalFPML.g:3504:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDataValueAccess().getDataValueAction_0(),
            					current);
            			

            }

            // InternalFPML.g:3510:3: ( (otherlv_1= RULE_ID ) )
            // InternalFPML.g:3511:4: (otherlv_1= RULE_ID )
            {
            // InternalFPML.g:3511:4: (otherlv_1= RULE_ID )
            // InternalFPML.g:3512:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataValueRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_1, grammarAccess.getDataValueAccess().getTypePureDataCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getDataValueAccess().getLeftParenthesisKeyword_2());
            		
            // InternalFPML.g:3527:3: ( (lv_value_3_0= ruleExpression ) )
            // InternalFPML.g:3528:4: (lv_value_3_0= ruleExpression )
            {
            // InternalFPML.g:3528:4: (lv_value_3_0= ruleExpression )
            // InternalFPML.g:3529:5: lv_value_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getDataValueAccess().getValueExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_20);
            lv_value_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataValueRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"it.unibo.FPML.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_2); 

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
    // InternalFPML.g:3554:1: entryRuleEffectFullDataValue returns [EObject current=null] : iv_ruleEffectFullDataValue= ruleEffectFullDataValue EOF ;
    public final EObject entryRuleEffectFullDataValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullDataValue = null;


        try {
            // InternalFPML.g:3554:60: (iv_ruleEffectFullDataValue= ruleEffectFullDataValue EOF )
            // InternalFPML.g:3555:2: iv_ruleEffectFullDataValue= ruleEffectFullDataValue EOF
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
    // InternalFPML.g:3561:1: ruleEffectFullDataValue returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_value_3_0= ruleEffectFullAdtValue ) ) otherlv_4= ')' ) ;
    public final EObject ruleEffectFullDataValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:3567:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_value_3_0= ruleEffectFullAdtValue ) ) otherlv_4= ')' ) )
            // InternalFPML.g:3568:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_value_3_0= ruleEffectFullAdtValue ) ) otherlv_4= ')' )
            {
            // InternalFPML.g:3568:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_value_3_0= ruleEffectFullAdtValue ) ) otherlv_4= ')' )
            // InternalFPML.g:3569:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_value_3_0= ruleEffectFullAdtValue ) ) otherlv_4= ')'
            {
            // InternalFPML.g:3569:3: ()
            // InternalFPML.g:3570:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEffectFullDataValueAccess().getEffectFullDataValueAction_0(),
            					current);
            			

            }

            // InternalFPML.g:3576:3: ( (otherlv_1= RULE_ID ) )
            // InternalFPML.g:3577:4: (otherlv_1= RULE_ID )
            {
            // InternalFPML.g:3577:4: (otherlv_1= RULE_ID )
            // InternalFPML.g:3578:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEffectFullDataValueRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_1, grammarAccess.getEffectFullDataValueAccess().getTypeEffectFullDataCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getEffectFullDataValueAccess().getLeftParenthesisKeyword_2());
            		
            // InternalFPML.g:3593:3: ( (lv_value_3_0= ruleEffectFullAdtValue ) )
            // InternalFPML.g:3594:4: (lv_value_3_0= ruleEffectFullAdtValue )
            {
            // InternalFPML.g:3594:4: (lv_value_3_0= ruleEffectFullAdtValue )
            // InternalFPML.g:3595:5: lv_value_3_0= ruleEffectFullAdtValue
            {

            					newCompositeNode(grammarAccess.getEffectFullDataValueAccess().getValueEffectFullAdtValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_20);
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

            otherlv_4=(Token)match(input,22,FOLLOW_2); 

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
    // InternalFPML.g:3620:1: entryRulePureValueRef returns [EObject current=null] : iv_rulePureValueRef= rulePureValueRef EOF ;
    public final EObject entryRulePureValueRef() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePureValueRef = null;


        try {
            // InternalFPML.g:3620:53: (iv_rulePureValueRef= rulePureValueRef EOF )
            // InternalFPML.g:3621:2: iv_rulePureValueRef= rulePureValueRef EOF
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
    // InternalFPML.g:3627:1: rulePureValueRef returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject rulePureValueRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFPML.g:3633:2: ( ( () ( (otherlv_1= RULE_ID ) ) ) )
            // InternalFPML.g:3634:2: ( () ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalFPML.g:3634:2: ( () ( (otherlv_1= RULE_ID ) ) )
            // InternalFPML.g:3635:3: () ( (otherlv_1= RULE_ID ) )
            {
            // InternalFPML.g:3635:3: ()
            // InternalFPML.g:3636:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPureValueRefAccess().getPureValueRefAction_0(),
            					current);
            			

            }

            // InternalFPML.g:3642:3: ( (otherlv_1= RULE_ID ) )
            // InternalFPML.g:3643:4: (otherlv_1= RULE_ID )
            {
            // InternalFPML.g:3643:4: (otherlv_1= RULE_ID )
            // InternalFPML.g:3644:5: otherlv_1= RULE_ID
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
    // InternalFPML.g:3659:1: entryRulePureLambda returns [EObject current=null] : iv_rulePureLambda= rulePureLambda EOF ;
    public final EObject entryRulePureLambda() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePureLambda = null;


        try {
            // InternalFPML.g:3659:51: (iv_rulePureLambda= rulePureLambda EOF )
            // InternalFPML.g:3660:2: iv_rulePureLambda= rulePureLambda EOF
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
    // InternalFPML.g:3666:1: rulePureLambda returns [EObject current=null] : ( ( () otherlv_1= '(' ( (lv_arg_2_0= ruleArgument ) ) otherlv_3= ')' otherlv_4= ':' otherlv_5= '{' ( (lv_functionBody_6_0= ruleCompositionFunctionBodyPure ) ) otherlv_7= '}' ) | ( () otherlv_9= '(' otherlv_10= ')' otherlv_11= ':' otherlv_12= '{' ( (lv_functionBody_13_0= ruleCompositionFunctionBodyPure ) ) otherlv_14= '}' ) ) ;
    public final EObject rulePureLambda() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject lv_arg_2_0 = null;

        EObject lv_functionBody_6_0 = null;

        EObject lv_functionBody_13_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:3672:2: ( ( ( () otherlv_1= '(' ( (lv_arg_2_0= ruleArgument ) ) otherlv_3= ')' otherlv_4= ':' otherlv_5= '{' ( (lv_functionBody_6_0= ruleCompositionFunctionBodyPure ) ) otherlv_7= '}' ) | ( () otherlv_9= '(' otherlv_10= ')' otherlv_11= ':' otherlv_12= '{' ( (lv_functionBody_13_0= ruleCompositionFunctionBodyPure ) ) otherlv_14= '}' ) ) )
            // InternalFPML.g:3673:2: ( ( () otherlv_1= '(' ( (lv_arg_2_0= ruleArgument ) ) otherlv_3= ')' otherlv_4= ':' otherlv_5= '{' ( (lv_functionBody_6_0= ruleCompositionFunctionBodyPure ) ) otherlv_7= '}' ) | ( () otherlv_9= '(' otherlv_10= ')' otherlv_11= ':' otherlv_12= '{' ( (lv_functionBody_13_0= ruleCompositionFunctionBodyPure ) ) otherlv_14= '}' ) )
            {
            // InternalFPML.g:3673:2: ( ( () otherlv_1= '(' ( (lv_arg_2_0= ruleArgument ) ) otherlv_3= ')' otherlv_4= ':' otherlv_5= '{' ( (lv_functionBody_6_0= ruleCompositionFunctionBodyPure ) ) otherlv_7= '}' ) | ( () otherlv_9= '(' otherlv_10= ')' otherlv_11= ':' otherlv_12= '{' ( (lv_functionBody_13_0= ruleCompositionFunctionBodyPure ) ) otherlv_14= '}' ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==20) ) {
                int LA31_1 = input.LA(2);

                if ( ((LA31_1>=28 && LA31_1<=31)||LA31_1==33||LA31_1==37) ) {
                    alt31=1;
                }
                else if ( (LA31_1==22) ) {
                    alt31=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalFPML.g:3674:3: ( () otherlv_1= '(' ( (lv_arg_2_0= ruleArgument ) ) otherlv_3= ')' otherlv_4= ':' otherlv_5= '{' ( (lv_functionBody_6_0= ruleCompositionFunctionBodyPure ) ) otherlv_7= '}' )
                    {
                    // InternalFPML.g:3674:3: ( () otherlv_1= '(' ( (lv_arg_2_0= ruleArgument ) ) otherlv_3= ')' otherlv_4= ':' otherlv_5= '{' ( (lv_functionBody_6_0= ruleCompositionFunctionBodyPure ) ) otherlv_7= '}' )
                    // InternalFPML.g:3675:4: () otherlv_1= '(' ( (lv_arg_2_0= ruleArgument ) ) otherlv_3= ')' otherlv_4= ':' otherlv_5= '{' ( (lv_functionBody_6_0= ruleCompositionFunctionBodyPure ) ) otherlv_7= '}'
                    {
                    // InternalFPML.g:3675:4: ()
                    // InternalFPML.g:3676:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPureLambdaAccess().getPureLambdaAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,20,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getPureLambdaAccess().getLeftParenthesisKeyword_0_1());
                    			
                    // InternalFPML.g:3686:4: ( (lv_arg_2_0= ruleArgument ) )
                    // InternalFPML.g:3687:5: (lv_arg_2_0= ruleArgument )
                    {
                    // InternalFPML.g:3687:5: (lv_arg_2_0= ruleArgument )
                    // InternalFPML.g:3688:6: lv_arg_2_0= ruleArgument
                    {

                    						newCompositeNode(grammarAccess.getPureLambdaAccess().getArgArgumentParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_20);
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

                    otherlv_3=(Token)match(input,22,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getPureLambdaAccess().getRightParenthesisKeyword_0_3());
                    			
                    otherlv_4=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getPureLambdaAccess().getColonKeyword_0_4());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_21); 

                    				newLeafNode(otherlv_5, grammarAccess.getPureLambdaAccess().getLeftCurlyBracketKeyword_0_5());
                    			
                    // InternalFPML.g:3717:4: ( (lv_functionBody_6_0= ruleCompositionFunctionBodyPure ) )
                    // InternalFPML.g:3718:5: (lv_functionBody_6_0= ruleCompositionFunctionBodyPure )
                    {
                    // InternalFPML.g:3718:5: (lv_functionBody_6_0= ruleCompositionFunctionBodyPure )
                    // InternalFPML.g:3719:6: lv_functionBody_6_0= ruleCompositionFunctionBodyPure
                    {

                    						newCompositeNode(grammarAccess.getPureLambdaAccess().getFunctionBodyCompositionFunctionBodyPureParserRuleCall_0_6_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_functionBody_6_0=ruleCompositionFunctionBodyPure();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPureLambdaRule());
                    						}
                    						set(
                    							current,
                    							"functionBody",
                    							lv_functionBody_6_0,
                    							"it.unibo.FPML.CompositionFunctionBodyPure");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getPureLambdaAccess().getRightCurlyBracketKeyword_0_7());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFPML.g:3742:3: ( () otherlv_9= '(' otherlv_10= ')' otherlv_11= ':' otherlv_12= '{' ( (lv_functionBody_13_0= ruleCompositionFunctionBodyPure ) ) otherlv_14= '}' )
                    {
                    // InternalFPML.g:3742:3: ( () otherlv_9= '(' otherlv_10= ')' otherlv_11= ':' otherlv_12= '{' ( (lv_functionBody_13_0= ruleCompositionFunctionBodyPure ) ) otherlv_14= '}' )
                    // InternalFPML.g:3743:4: () otherlv_9= '(' otherlv_10= ')' otherlv_11= ':' otherlv_12= '{' ( (lv_functionBody_13_0= ruleCompositionFunctionBodyPure ) ) otherlv_14= '}'
                    {
                    // InternalFPML.g:3743:4: ()
                    // InternalFPML.g:3744:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPureLambdaAccess().getPureLambdaAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_9=(Token)match(input,20,FOLLOW_20); 

                    				newLeafNode(otherlv_9, grammarAccess.getPureLambdaAccess().getLeftParenthesisKeyword_1_1());
                    			
                    otherlv_10=(Token)match(input,22,FOLLOW_12); 

                    				newLeafNode(otherlv_10, grammarAccess.getPureLambdaAccess().getRightParenthesisKeyword_1_2());
                    			
                    otherlv_11=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_11, grammarAccess.getPureLambdaAccess().getColonKeyword_1_3());
                    			
                    otherlv_12=(Token)match(input,12,FOLLOW_21); 

                    				newLeafNode(otherlv_12, grammarAccess.getPureLambdaAccess().getLeftCurlyBracketKeyword_1_4());
                    			
                    // InternalFPML.g:3766:4: ( (lv_functionBody_13_0= ruleCompositionFunctionBodyPure ) )
                    // InternalFPML.g:3767:5: (lv_functionBody_13_0= ruleCompositionFunctionBodyPure )
                    {
                    // InternalFPML.g:3767:5: (lv_functionBody_13_0= ruleCompositionFunctionBodyPure )
                    // InternalFPML.g:3768:6: lv_functionBody_13_0= ruleCompositionFunctionBodyPure
                    {

                    						newCompositeNode(grammarAccess.getPureLambdaAccess().getFunctionBodyCompositionFunctionBodyPureParserRuleCall_1_5_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_functionBody_13_0=ruleCompositionFunctionBodyPure();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPureLambdaRule());
                    						}
                    						set(
                    							current,
                    							"functionBody",
                    							lv_functionBody_13_0,
                    							"it.unibo.FPML.CompositionFunctionBodyPure");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_14=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_14, grammarAccess.getPureLambdaAccess().getRightCurlyBracketKeyword_1_6());
                    			

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
    // $ANTLR end "rulePureLambda"


    // $ANTLR start "entryRulePureProdValue"
    // InternalFPML.g:3794:1: entryRulePureProdValue returns [EObject current=null] : iv_rulePureProdValue= rulePureProdValue EOF ;
    public final EObject entryRulePureProdValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePureProdValue = null;


        try {
            // InternalFPML.g:3794:54: (iv_rulePureProdValue= rulePureProdValue EOF )
            // InternalFPML.g:3795:2: iv_rulePureProdValue= rulePureProdValue EOF
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
    // InternalFPML.g:3801:1: rulePureProdValue returns [EObject current=null] : (otherlv_0= '(' ( (lv_prodAdtElement1_1_0= ruleExpression ) ) otherlv_2= ',' ( (lv_prodAdtElement2_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject rulePureProdValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_prodAdtElement1_1_0 = null;

        EObject lv_prodAdtElement2_3_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:3807:2: ( (otherlv_0= '(' ( (lv_prodAdtElement1_1_0= ruleExpression ) ) otherlv_2= ',' ( (lv_prodAdtElement2_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalFPML.g:3808:2: (otherlv_0= '(' ( (lv_prodAdtElement1_1_0= ruleExpression ) ) otherlv_2= ',' ( (lv_prodAdtElement2_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalFPML.g:3808:2: (otherlv_0= '(' ( (lv_prodAdtElement1_1_0= ruleExpression ) ) otherlv_2= ',' ( (lv_prodAdtElement2_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalFPML.g:3809:3: otherlv_0= '(' ( (lv_prodAdtElement1_1_0= ruleExpression ) ) otherlv_2= ',' ( (lv_prodAdtElement2_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getPureProdValueAccess().getLeftParenthesisKeyword_0());
            		
            // InternalFPML.g:3813:3: ( (lv_prodAdtElement1_1_0= ruleExpression ) )
            // InternalFPML.g:3814:4: (lv_prodAdtElement1_1_0= ruleExpression )
            {
            // InternalFPML.g:3814:4: (lv_prodAdtElement1_1_0= ruleExpression )
            // InternalFPML.g:3815:5: lv_prodAdtElement1_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getPureProdValueAccess().getProdAdtElement1ExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_31);
            lv_prodAdtElement1_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPureProdValueRule());
            					}
            					set(
            						current,
            						"prodAdtElement1",
            						lv_prodAdtElement1_1_0,
            						"it.unibo.FPML.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getPureProdValueAccess().getCommaKeyword_2());
            		
            // InternalFPML.g:3836:3: ( (lv_prodAdtElement2_3_0= ruleExpression ) )
            // InternalFPML.g:3837:4: (lv_prodAdtElement2_3_0= ruleExpression )
            {
            // InternalFPML.g:3837:4: (lv_prodAdtElement2_3_0= ruleExpression )
            // InternalFPML.g:3838:5: lv_prodAdtElement2_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getPureProdValueAccess().getProdAdtElement2ExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_20);
            lv_prodAdtElement2_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPureProdValueRule());
            					}
            					set(
            						current,
            						"prodAdtElement2",
            						lv_prodAdtElement2_3_0,
            						"it.unibo.FPML.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_2); 

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
    // InternalFPML.g:3863:1: entryRulePureSumValue returns [EObject current=null] : iv_rulePureSumValue= rulePureSumValue EOF ;
    public final EObject entryRulePureSumValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePureSumValue = null;


        try {
            // InternalFPML.g:3863:53: (iv_rulePureSumValue= rulePureSumValue EOF )
            // InternalFPML.g:3864:2: iv_rulePureSumValue= rulePureSumValue EOF
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
    // InternalFPML.g:3870:1: rulePureSumValue returns [EObject current=null] : ( (otherlv_0= 'Left' otherlv_1= '(' ( (lv_sumAdtElement1_2_0= ruleExpression ) ) otherlv_3= ')' ) | (otherlv_4= 'Right' otherlv_5= '(' ( (lv_sumAdtElement2_6_0= ruleExpression ) ) otherlv_7= ')' ) ) ;
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
            // InternalFPML.g:3876:2: ( ( (otherlv_0= 'Left' otherlv_1= '(' ( (lv_sumAdtElement1_2_0= ruleExpression ) ) otherlv_3= ')' ) | (otherlv_4= 'Right' otherlv_5= '(' ( (lv_sumAdtElement2_6_0= ruleExpression ) ) otherlv_7= ')' ) ) )
            // InternalFPML.g:3877:2: ( (otherlv_0= 'Left' otherlv_1= '(' ( (lv_sumAdtElement1_2_0= ruleExpression ) ) otherlv_3= ')' ) | (otherlv_4= 'Right' otherlv_5= '(' ( (lv_sumAdtElement2_6_0= ruleExpression ) ) otherlv_7= ')' ) )
            {
            // InternalFPML.g:3877:2: ( (otherlv_0= 'Left' otherlv_1= '(' ( (lv_sumAdtElement1_2_0= ruleExpression ) ) otherlv_3= ')' ) | (otherlv_4= 'Right' otherlv_5= '(' ( (lv_sumAdtElement2_6_0= ruleExpression ) ) otherlv_7= ')' ) )
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
                    // InternalFPML.g:3878:3: (otherlv_0= 'Left' otherlv_1= '(' ( (lv_sumAdtElement1_2_0= ruleExpression ) ) otherlv_3= ')' )
                    {
                    // InternalFPML.g:3878:3: (otherlv_0= 'Left' otherlv_1= '(' ( (lv_sumAdtElement1_2_0= ruleExpression ) ) otherlv_3= ')' )
                    // InternalFPML.g:3879:4: otherlv_0= 'Left' otherlv_1= '(' ( (lv_sumAdtElement1_2_0= ruleExpression ) ) otherlv_3= ')'
                    {
                    otherlv_0=(Token)match(input,42,FOLLOW_18); 

                    				newLeafNode(otherlv_0, grammarAccess.getPureSumValueAccess().getLeftKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,20,FOLLOW_14); 

                    				newLeafNode(otherlv_1, grammarAccess.getPureSumValueAccess().getLeftParenthesisKeyword_0_1());
                    			
                    // InternalFPML.g:3887:4: ( (lv_sumAdtElement1_2_0= ruleExpression ) )
                    // InternalFPML.g:3888:5: (lv_sumAdtElement1_2_0= ruleExpression )
                    {
                    // InternalFPML.g:3888:5: (lv_sumAdtElement1_2_0= ruleExpression )
                    // InternalFPML.g:3889:6: lv_sumAdtElement1_2_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getPureSumValueAccess().getSumAdtElement1ExpressionParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_sumAdtElement1_2_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPureSumValueRule());
                    						}
                    						set(
                    							current,
                    							"sumAdtElement1",
                    							lv_sumAdtElement1_2_0,
                    							"it.unibo.FPML.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getPureSumValueAccess().getRightParenthesisKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFPML.g:3912:3: (otherlv_4= 'Right' otherlv_5= '(' ( (lv_sumAdtElement2_6_0= ruleExpression ) ) otherlv_7= ')' )
                    {
                    // InternalFPML.g:3912:3: (otherlv_4= 'Right' otherlv_5= '(' ( (lv_sumAdtElement2_6_0= ruleExpression ) ) otherlv_7= ')' )
                    // InternalFPML.g:3913:4: otherlv_4= 'Right' otherlv_5= '(' ( (lv_sumAdtElement2_6_0= ruleExpression ) ) otherlv_7= ')'
                    {
                    otherlv_4=(Token)match(input,43,FOLLOW_18); 

                    				newLeafNode(otherlv_4, grammarAccess.getPureSumValueAccess().getRightKeyword_1_0());
                    			
                    otherlv_5=(Token)match(input,20,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getPureSumValueAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalFPML.g:3921:4: ( (lv_sumAdtElement2_6_0= ruleExpression ) )
                    // InternalFPML.g:3922:5: (lv_sumAdtElement2_6_0= ruleExpression )
                    {
                    // InternalFPML.g:3922:5: (lv_sumAdtElement2_6_0= ruleExpression )
                    // InternalFPML.g:3923:6: lv_sumAdtElement2_6_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getPureSumValueAccess().getSumAdtElement2ExpressionParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_sumAdtElement2_6_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPureSumValueRule());
                    						}
                    						set(
                    							current,
                    							"sumAdtElement2",
                    							lv_sumAdtElement2_6_0,
                    							"it.unibo.FPML.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,22,FOLLOW_2); 

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
    // InternalFPML.g:3949:1: entryRuleEffectFullAdtValue returns [EObject current=null] : iv_ruleEffectFullAdtValue= ruleEffectFullAdtValue EOF ;
    public final EObject entryRuleEffectFullAdtValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullAdtValue = null;


        try {
            // InternalFPML.g:3949:59: (iv_ruleEffectFullAdtValue= ruleEffectFullAdtValue EOF )
            // InternalFPML.g:3950:2: iv_ruleEffectFullAdtValue= ruleEffectFullAdtValue EOF
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
    // InternalFPML.g:3956:1: ruleEffectFullAdtValue returns [EObject current=null] : ( (otherlv_0= 'IO' otherlv_1= '(' ( (lv_innerValue_2_0= ruleExpression ) ) otherlv_3= ')' ) | (otherlv_4= 'IO' otherlv_5= '[' ( (lv_innerValue_6_0= ruleEffectFullAdtValue ) ) otherlv_7= ']' ) | this_EffectFullFunctionValue_8= ruleEffectFullFunctionValue | this_EffectFullProdValue_9= ruleEffectFullProdValue | this_EffectFullValueRef_10= ruleEffectFullValueRef | this_EffectFullDataValue_11= ruleEffectFullDataValue | this_EffectFullSumValue_12= ruleEffectFullSumValue ) ;
    public final EObject ruleEffectFullAdtValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_innerValue_2_0 = null;

        EObject lv_innerValue_6_0 = null;

        EObject this_EffectFullFunctionValue_8 = null;

        EObject this_EffectFullProdValue_9 = null;

        EObject this_EffectFullValueRef_10 = null;

        EObject this_EffectFullDataValue_11 = null;

        EObject this_EffectFullSumValue_12 = null;



        	enterRule();

        try {
            // InternalFPML.g:3962:2: ( ( (otherlv_0= 'IO' otherlv_1= '(' ( (lv_innerValue_2_0= ruleExpression ) ) otherlv_3= ')' ) | (otherlv_4= 'IO' otherlv_5= '[' ( (lv_innerValue_6_0= ruleEffectFullAdtValue ) ) otherlv_7= ']' ) | this_EffectFullFunctionValue_8= ruleEffectFullFunctionValue | this_EffectFullProdValue_9= ruleEffectFullProdValue | this_EffectFullValueRef_10= ruleEffectFullValueRef | this_EffectFullDataValue_11= ruleEffectFullDataValue | this_EffectFullSumValue_12= ruleEffectFullSumValue ) )
            // InternalFPML.g:3963:2: ( (otherlv_0= 'IO' otherlv_1= '(' ( (lv_innerValue_2_0= ruleExpression ) ) otherlv_3= ')' ) | (otherlv_4= 'IO' otherlv_5= '[' ( (lv_innerValue_6_0= ruleEffectFullAdtValue ) ) otherlv_7= ']' ) | this_EffectFullFunctionValue_8= ruleEffectFullFunctionValue | this_EffectFullProdValue_9= ruleEffectFullProdValue | this_EffectFullValueRef_10= ruleEffectFullValueRef | this_EffectFullDataValue_11= ruleEffectFullDataValue | this_EffectFullSumValue_12= ruleEffectFullSumValue )
            {
            // InternalFPML.g:3963:2: ( (otherlv_0= 'IO' otherlv_1= '(' ( (lv_innerValue_2_0= ruleExpression ) ) otherlv_3= ')' ) | (otherlv_4= 'IO' otherlv_5= '[' ( (lv_innerValue_6_0= ruleEffectFullAdtValue ) ) otherlv_7= ']' ) | this_EffectFullFunctionValue_8= ruleEffectFullFunctionValue | this_EffectFullProdValue_9= ruleEffectFullProdValue | this_EffectFullValueRef_10= ruleEffectFullValueRef | this_EffectFullDataValue_11= ruleEffectFullDataValue | this_EffectFullSumValue_12= ruleEffectFullSumValue )
            int alt33=7;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // InternalFPML.g:3964:3: (otherlv_0= 'IO' otherlv_1= '(' ( (lv_innerValue_2_0= ruleExpression ) ) otherlv_3= ')' )
                    {
                    // InternalFPML.g:3964:3: (otherlv_0= 'IO' otherlv_1= '(' ( (lv_innerValue_2_0= ruleExpression ) ) otherlv_3= ')' )
                    // InternalFPML.g:3965:4: otherlv_0= 'IO' otherlv_1= '(' ( (lv_innerValue_2_0= ruleExpression ) ) otherlv_3= ')'
                    {
                    otherlv_0=(Token)match(input,23,FOLLOW_18); 

                    				newLeafNode(otherlv_0, grammarAccess.getEffectFullAdtValueAccess().getIOKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,20,FOLLOW_14); 

                    				newLeafNode(otherlv_1, grammarAccess.getEffectFullAdtValueAccess().getLeftParenthesisKeyword_0_1());
                    			
                    // InternalFPML.g:3973:4: ( (lv_innerValue_2_0= ruleExpression ) )
                    // InternalFPML.g:3974:5: (lv_innerValue_2_0= ruleExpression )
                    {
                    // InternalFPML.g:3974:5: (lv_innerValue_2_0= ruleExpression )
                    // InternalFPML.g:3975:6: lv_innerValue_2_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getEffectFullAdtValueAccess().getInnerValueExpressionParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_innerValue_2_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEffectFullAdtValueRule());
                    						}
                    						set(
                    							current,
                    							"innerValue",
                    							lv_innerValue_2_0,
                    							"it.unibo.FPML.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getEffectFullAdtValueAccess().getRightParenthesisKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFPML.g:3998:3: (otherlv_4= 'IO' otherlv_5= '[' ( (lv_innerValue_6_0= ruleEffectFullAdtValue ) ) otherlv_7= ']' )
                    {
                    // InternalFPML.g:3998:3: (otherlv_4= 'IO' otherlv_5= '[' ( (lv_innerValue_6_0= ruleEffectFullAdtValue ) ) otherlv_7= ']' )
                    // InternalFPML.g:3999:4: otherlv_4= 'IO' otherlv_5= '[' ( (lv_innerValue_6_0= ruleEffectFullAdtValue ) ) otherlv_7= ']'
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_35); 

                    				newLeafNode(otherlv_4, grammarAccess.getEffectFullAdtValueAccess().getIOKeyword_1_0());
                    			
                    otherlv_5=(Token)match(input,37,FOLLOW_36); 

                    				newLeafNode(otherlv_5, grammarAccess.getEffectFullAdtValueAccess().getLeftSquareBracketKeyword_1_1());
                    			
                    // InternalFPML.g:4007:4: ( (lv_innerValue_6_0= ruleEffectFullAdtValue ) )
                    // InternalFPML.g:4008:5: (lv_innerValue_6_0= ruleEffectFullAdtValue )
                    {
                    // InternalFPML.g:4008:5: (lv_innerValue_6_0= ruleEffectFullAdtValue )
                    // InternalFPML.g:4009:6: lv_innerValue_6_0= ruleEffectFullAdtValue
                    {

                    						newCompositeNode(grammarAccess.getEffectFullAdtValueAccess().getInnerValueEffectFullAdtValueParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_innerValue_6_0=ruleEffectFullAdtValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEffectFullAdtValueRule());
                    						}
                    						set(
                    							current,
                    							"innerValue",
                    							lv_innerValue_6_0,
                    							"it.unibo.FPML.EffectFullAdtValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,38,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getEffectFullAdtValueAccess().getRightSquareBracketKeyword_1_3());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalFPML.g:4032:3: this_EffectFullFunctionValue_8= ruleEffectFullFunctionValue
                    {

                    			newCompositeNode(grammarAccess.getEffectFullAdtValueAccess().getEffectFullFunctionValueParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_EffectFullFunctionValue_8=ruleEffectFullFunctionValue();

                    state._fsp--;


                    			current = this_EffectFullFunctionValue_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalFPML.g:4041:3: this_EffectFullProdValue_9= ruleEffectFullProdValue
                    {

                    			newCompositeNode(grammarAccess.getEffectFullAdtValueAccess().getEffectFullProdValueParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_EffectFullProdValue_9=ruleEffectFullProdValue();

                    state._fsp--;


                    			current = this_EffectFullProdValue_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalFPML.g:4050:3: this_EffectFullValueRef_10= ruleEffectFullValueRef
                    {

                    			newCompositeNode(grammarAccess.getEffectFullAdtValueAccess().getEffectFullValueRefParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_EffectFullValueRef_10=ruleEffectFullValueRef();

                    state._fsp--;


                    			current = this_EffectFullValueRef_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalFPML.g:4059:3: this_EffectFullDataValue_11= ruleEffectFullDataValue
                    {

                    			newCompositeNode(grammarAccess.getEffectFullAdtValueAccess().getEffectFullDataValueParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_EffectFullDataValue_11=ruleEffectFullDataValue();

                    state._fsp--;


                    			current = this_EffectFullDataValue_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalFPML.g:4068:3: this_EffectFullSumValue_12= ruleEffectFullSumValue
                    {

                    			newCompositeNode(grammarAccess.getEffectFullAdtValueAccess().getEffectFullSumValueParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_EffectFullSumValue_12=ruleEffectFullSumValue();

                    state._fsp--;


                    			current = this_EffectFullSumValue_12;
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
    // InternalFPML.g:4080:1: entryRuleEffectFullProdValue returns [EObject current=null] : iv_ruleEffectFullProdValue= ruleEffectFullProdValue EOF ;
    public final EObject entryRuleEffectFullProdValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullProdValue = null;


        try {
            // InternalFPML.g:4080:60: (iv_ruleEffectFullProdValue= ruleEffectFullProdValue EOF )
            // InternalFPML.g:4081:2: iv_ruleEffectFullProdValue= ruleEffectFullProdValue EOF
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
    // InternalFPML.g:4087:1: ruleEffectFullProdValue returns [EObject current=null] : (otherlv_0= '(' ( (lv_prodAdtElement1_1_0= ruleEffectFullAdtValue ) ) otherlv_2= ',' ( (lv_prodAdtElement2_3_0= ruleEffectFullAdtValue ) ) otherlv_4= ')' ) ;
    public final EObject ruleEffectFullProdValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_prodAdtElement1_1_0 = null;

        EObject lv_prodAdtElement2_3_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:4093:2: ( (otherlv_0= '(' ( (lv_prodAdtElement1_1_0= ruleEffectFullAdtValue ) ) otherlv_2= ',' ( (lv_prodAdtElement2_3_0= ruleEffectFullAdtValue ) ) otherlv_4= ')' ) )
            // InternalFPML.g:4094:2: (otherlv_0= '(' ( (lv_prodAdtElement1_1_0= ruleEffectFullAdtValue ) ) otherlv_2= ',' ( (lv_prodAdtElement2_3_0= ruleEffectFullAdtValue ) ) otherlv_4= ')' )
            {
            // InternalFPML.g:4094:2: (otherlv_0= '(' ( (lv_prodAdtElement1_1_0= ruleEffectFullAdtValue ) ) otherlv_2= ',' ( (lv_prodAdtElement2_3_0= ruleEffectFullAdtValue ) ) otherlv_4= ')' )
            // InternalFPML.g:4095:3: otherlv_0= '(' ( (lv_prodAdtElement1_1_0= ruleEffectFullAdtValue ) ) otherlv_2= ',' ( (lv_prodAdtElement2_3_0= ruleEffectFullAdtValue ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_36); 

            			newLeafNode(otherlv_0, grammarAccess.getEffectFullProdValueAccess().getLeftParenthesisKeyword_0());
            		
            // InternalFPML.g:4099:3: ( (lv_prodAdtElement1_1_0= ruleEffectFullAdtValue ) )
            // InternalFPML.g:4100:4: (lv_prodAdtElement1_1_0= ruleEffectFullAdtValue )
            {
            // InternalFPML.g:4100:4: (lv_prodAdtElement1_1_0= ruleEffectFullAdtValue )
            // InternalFPML.g:4101:5: lv_prodAdtElement1_1_0= ruleEffectFullAdtValue
            {

            					newCompositeNode(grammarAccess.getEffectFullProdValueAccess().getProdAdtElement1EffectFullAdtValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_31);
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

            otherlv_2=(Token)match(input,21,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getEffectFullProdValueAccess().getCommaKeyword_2());
            		
            // InternalFPML.g:4122:3: ( (lv_prodAdtElement2_3_0= ruleEffectFullAdtValue ) )
            // InternalFPML.g:4123:4: (lv_prodAdtElement2_3_0= ruleEffectFullAdtValue )
            {
            // InternalFPML.g:4123:4: (lv_prodAdtElement2_3_0= ruleEffectFullAdtValue )
            // InternalFPML.g:4124:5: lv_prodAdtElement2_3_0= ruleEffectFullAdtValue
            {

            					newCompositeNode(grammarAccess.getEffectFullProdValueAccess().getProdAdtElement2EffectFullAdtValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_20);
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

            otherlv_4=(Token)match(input,22,FOLLOW_2); 

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
    // InternalFPML.g:4149:1: entryRuleEffectFullSumValue returns [EObject current=null] : iv_ruleEffectFullSumValue= ruleEffectFullSumValue EOF ;
    public final EObject entryRuleEffectFullSumValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullSumValue = null;


        try {
            // InternalFPML.g:4149:59: (iv_ruleEffectFullSumValue= ruleEffectFullSumValue EOF )
            // InternalFPML.g:4150:2: iv_ruleEffectFullSumValue= ruleEffectFullSumValue EOF
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
    // InternalFPML.g:4156:1: ruleEffectFullSumValue returns [EObject current=null] : ( (otherlv_0= 'Left' otherlv_1= '(' ( (lv_sumAdtElement1_2_0= ruleEffectFullAdtValue ) ) otherlv_3= ')' ) | (otherlv_4= 'Right' otherlv_5= '(' ( (lv_sumAdtElement2_6_0= ruleEffectFullAdtValue ) ) otherlv_7= ')' ) ) ;
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
            // InternalFPML.g:4162:2: ( ( (otherlv_0= 'Left' otherlv_1= '(' ( (lv_sumAdtElement1_2_0= ruleEffectFullAdtValue ) ) otherlv_3= ')' ) | (otherlv_4= 'Right' otherlv_5= '(' ( (lv_sumAdtElement2_6_0= ruleEffectFullAdtValue ) ) otherlv_7= ')' ) ) )
            // InternalFPML.g:4163:2: ( (otherlv_0= 'Left' otherlv_1= '(' ( (lv_sumAdtElement1_2_0= ruleEffectFullAdtValue ) ) otherlv_3= ')' ) | (otherlv_4= 'Right' otherlv_5= '(' ( (lv_sumAdtElement2_6_0= ruleEffectFullAdtValue ) ) otherlv_7= ')' ) )
            {
            // InternalFPML.g:4163:2: ( (otherlv_0= 'Left' otherlv_1= '(' ( (lv_sumAdtElement1_2_0= ruleEffectFullAdtValue ) ) otherlv_3= ')' ) | (otherlv_4= 'Right' otherlv_5= '(' ( (lv_sumAdtElement2_6_0= ruleEffectFullAdtValue ) ) otherlv_7= ')' ) )
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
                    // InternalFPML.g:4164:3: (otherlv_0= 'Left' otherlv_1= '(' ( (lv_sumAdtElement1_2_0= ruleEffectFullAdtValue ) ) otherlv_3= ')' )
                    {
                    // InternalFPML.g:4164:3: (otherlv_0= 'Left' otherlv_1= '(' ( (lv_sumAdtElement1_2_0= ruleEffectFullAdtValue ) ) otherlv_3= ')' )
                    // InternalFPML.g:4165:4: otherlv_0= 'Left' otherlv_1= '(' ( (lv_sumAdtElement1_2_0= ruleEffectFullAdtValue ) ) otherlv_3= ')'
                    {
                    otherlv_0=(Token)match(input,42,FOLLOW_18); 

                    				newLeafNode(otherlv_0, grammarAccess.getEffectFullSumValueAccess().getLeftKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,20,FOLLOW_36); 

                    				newLeafNode(otherlv_1, grammarAccess.getEffectFullSumValueAccess().getLeftParenthesisKeyword_0_1());
                    			
                    // InternalFPML.g:4173:4: ( (lv_sumAdtElement1_2_0= ruleEffectFullAdtValue ) )
                    // InternalFPML.g:4174:5: (lv_sumAdtElement1_2_0= ruleEffectFullAdtValue )
                    {
                    // InternalFPML.g:4174:5: (lv_sumAdtElement1_2_0= ruleEffectFullAdtValue )
                    // InternalFPML.g:4175:6: lv_sumAdtElement1_2_0= ruleEffectFullAdtValue
                    {

                    						newCompositeNode(grammarAccess.getEffectFullSumValueAccess().getSumAdtElement1EffectFullAdtValueParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_20);
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

                    otherlv_3=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getEffectFullSumValueAccess().getRightParenthesisKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFPML.g:4198:3: (otherlv_4= 'Right' otherlv_5= '(' ( (lv_sumAdtElement2_6_0= ruleEffectFullAdtValue ) ) otherlv_7= ')' )
                    {
                    // InternalFPML.g:4198:3: (otherlv_4= 'Right' otherlv_5= '(' ( (lv_sumAdtElement2_6_0= ruleEffectFullAdtValue ) ) otherlv_7= ')' )
                    // InternalFPML.g:4199:4: otherlv_4= 'Right' otherlv_5= '(' ( (lv_sumAdtElement2_6_0= ruleEffectFullAdtValue ) ) otherlv_7= ')'
                    {
                    otherlv_4=(Token)match(input,43,FOLLOW_18); 

                    				newLeafNode(otherlv_4, grammarAccess.getEffectFullSumValueAccess().getRightKeyword_1_0());
                    			
                    otherlv_5=(Token)match(input,20,FOLLOW_36); 

                    				newLeafNode(otherlv_5, grammarAccess.getEffectFullSumValueAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalFPML.g:4207:4: ( (lv_sumAdtElement2_6_0= ruleEffectFullAdtValue ) )
                    // InternalFPML.g:4208:5: (lv_sumAdtElement2_6_0= ruleEffectFullAdtValue )
                    {
                    // InternalFPML.g:4208:5: (lv_sumAdtElement2_6_0= ruleEffectFullAdtValue )
                    // InternalFPML.g:4209:6: lv_sumAdtElement2_6_0= ruleEffectFullAdtValue
                    {

                    						newCompositeNode(grammarAccess.getEffectFullSumValueAccess().getSumAdtElement2EffectFullAdtValueParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_20);
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

                    otherlv_7=(Token)match(input,22,FOLLOW_2); 

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
    // InternalFPML.g:4235:1: entryRulePrimitivePureFunction returns [EObject current=null] : iv_rulePrimitivePureFunction= rulePrimitivePureFunction EOF ;
    public final EObject entryRulePrimitivePureFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitivePureFunction = null;


        try {
            // InternalFPML.g:4235:62: (iv_rulePrimitivePureFunction= rulePrimitivePureFunction EOF )
            // InternalFPML.g:4236:2: iv_rulePrimitivePureFunction= rulePrimitivePureFunction EOF
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
    // InternalFPML.g:4242:1: rulePrimitivePureFunction returns [EObject current=null] : (this_IntToString_0= ruleIntToString | this_IntPow_1= ruleIntPow | this_Plus_2= rulePlus | this_Minus_3= ruleMinus | this_Times_4= ruleTimes | this_Mod_5= ruleMod | this_ApplyF_6= ruleApplyF | this_LeftPair_7= ruleLeftPair | this_RightPair_8= ruleRightPair ) ;
    public final EObject rulePrimitivePureFunction() throws RecognitionException {
        EObject current = null;

        EObject this_IntToString_0 = null;

        EObject this_IntPow_1 = null;

        EObject this_Plus_2 = null;

        EObject this_Minus_3 = null;

        EObject this_Times_4 = null;

        EObject this_Mod_5 = null;

        EObject this_ApplyF_6 = null;

        EObject this_LeftPair_7 = null;

        EObject this_RightPair_8 = null;



        	enterRule();

        try {
            // InternalFPML.g:4248:2: ( (this_IntToString_0= ruleIntToString | this_IntPow_1= ruleIntPow | this_Plus_2= rulePlus | this_Minus_3= ruleMinus | this_Times_4= ruleTimes | this_Mod_5= ruleMod | this_ApplyF_6= ruleApplyF | this_LeftPair_7= ruleLeftPair | this_RightPair_8= ruleRightPair ) )
            // InternalFPML.g:4249:2: (this_IntToString_0= ruleIntToString | this_IntPow_1= ruleIntPow | this_Plus_2= rulePlus | this_Minus_3= ruleMinus | this_Times_4= ruleTimes | this_Mod_5= ruleMod | this_ApplyF_6= ruleApplyF | this_LeftPair_7= ruleLeftPair | this_RightPair_8= ruleRightPair )
            {
            // InternalFPML.g:4249:2: (this_IntToString_0= ruleIntToString | this_IntPow_1= ruleIntPow | this_Plus_2= rulePlus | this_Minus_3= ruleMinus | this_Times_4= ruleTimes | this_Mod_5= ruleMod | this_ApplyF_6= ruleApplyF | this_LeftPair_7= ruleLeftPair | this_RightPair_8= ruleRightPair )
            int alt35=9;
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
            case 39:
                {
                alt35=3;
                }
                break;
            case 46:
                {
                alt35=4;
                }
                break;
            case 40:
                {
                alt35=5;
                }
                break;
            case 47:
                {
                alt35=6;
                }
                break;
            case 50:
                {
                alt35=7;
                }
                break;
            case 48:
                {
                alt35=8;
                }
                break;
            case 49:
                {
                alt35=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalFPML.g:4250:3: this_IntToString_0= ruleIntToString
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
                    // InternalFPML.g:4259:3: this_IntPow_1= ruleIntPow
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
                    // InternalFPML.g:4268:3: this_Plus_2= rulePlus
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
                    // InternalFPML.g:4277:3: this_Minus_3= ruleMinus
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
                    // InternalFPML.g:4286:3: this_Times_4= ruleTimes
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
                    // InternalFPML.g:4295:3: this_Mod_5= ruleMod
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
                    // InternalFPML.g:4304:3: this_ApplyF_6= ruleApplyF
                    {

                    			newCompositeNode(grammarAccess.getPrimitivePureFunctionAccess().getApplyFParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_ApplyF_6=ruleApplyF();

                    state._fsp--;


                    			current = this_ApplyF_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalFPML.g:4313:3: this_LeftPair_7= ruleLeftPair
                    {

                    			newCompositeNode(grammarAccess.getPrimitivePureFunctionAccess().getLeftPairParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_LeftPair_7=ruleLeftPair();

                    state._fsp--;


                    			current = this_LeftPair_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalFPML.g:4322:3: this_RightPair_8= ruleRightPair
                    {

                    			newCompositeNode(grammarAccess.getPrimitivePureFunctionAccess().getRightPairParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_RightPair_8=ruleRightPair();

                    state._fsp--;


                    			current = this_RightPair_8;
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
    // InternalFPML.g:4334:1: entryRuleIntToString returns [EObject current=null] : iv_ruleIntToString= ruleIntToString EOF ;
    public final EObject entryRuleIntToString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntToString = null;


        try {
            // InternalFPML.g:4334:52: (iv_ruleIntToString= ruleIntToString EOF )
            // InternalFPML.g:4335:2: iv_ruleIntToString= ruleIntToString EOF
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
    // InternalFPML.g:4341:1: ruleIntToString returns [EObject current=null] : ( () otherlv_1= 'intToString' ) ;
    public final EObject ruleIntToString() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFPML.g:4347:2: ( ( () otherlv_1= 'intToString' ) )
            // InternalFPML.g:4348:2: ( () otherlv_1= 'intToString' )
            {
            // InternalFPML.g:4348:2: ( () otherlv_1= 'intToString' )
            // InternalFPML.g:4349:3: () otherlv_1= 'intToString'
            {
            // InternalFPML.g:4349:3: ()
            // InternalFPML.g:4350:4: 
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
    // InternalFPML.g:4364:1: entryRuleIntPow returns [EObject current=null] : iv_ruleIntPow= ruleIntPow EOF ;
    public final EObject entryRuleIntPow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntPow = null;


        try {
            // InternalFPML.g:4364:47: (iv_ruleIntPow= ruleIntPow EOF )
            // InternalFPML.g:4365:2: iv_ruleIntPow= ruleIntPow EOF
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
    // InternalFPML.g:4371:1: ruleIntPow returns [EObject current=null] : ( () otherlv_1= 'intPow' ) ;
    public final EObject ruleIntPow() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFPML.g:4377:2: ( ( () otherlv_1= 'intPow' ) )
            // InternalFPML.g:4378:2: ( () otherlv_1= 'intPow' )
            {
            // InternalFPML.g:4378:2: ( () otherlv_1= 'intPow' )
            // InternalFPML.g:4379:3: () otherlv_1= 'intPow'
            {
            // InternalFPML.g:4379:3: ()
            // InternalFPML.g:4380:4: 
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
    // InternalFPML.g:4394:1: entryRulePlus returns [EObject current=null] : iv_rulePlus= rulePlus EOF ;
    public final EObject entryRulePlus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlus = null;


        try {
            // InternalFPML.g:4394:45: (iv_rulePlus= rulePlus EOF )
            // InternalFPML.g:4395:2: iv_rulePlus= rulePlus EOF
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
    // InternalFPML.g:4401:1: rulePlus returns [EObject current=null] : ( () otherlv_1= '+' ) ;
    public final EObject rulePlus() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFPML.g:4407:2: ( ( () otherlv_1= '+' ) )
            // InternalFPML.g:4408:2: ( () otherlv_1= '+' )
            {
            // InternalFPML.g:4408:2: ( () otherlv_1= '+' )
            // InternalFPML.g:4409:3: () otherlv_1= '+'
            {
            // InternalFPML.g:4409:3: ()
            // InternalFPML.g:4410:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPlusAccess().getPlusAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_2); 

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
    // InternalFPML.g:4424:1: entryRuleMinus returns [EObject current=null] : iv_ruleMinus= ruleMinus EOF ;
    public final EObject entryRuleMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinus = null;


        try {
            // InternalFPML.g:4424:46: (iv_ruleMinus= ruleMinus EOF )
            // InternalFPML.g:4425:2: iv_ruleMinus= ruleMinus EOF
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
    // InternalFPML.g:4431:1: ruleMinus returns [EObject current=null] : ( () otherlv_1= '-' ) ;
    public final EObject ruleMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFPML.g:4437:2: ( ( () otherlv_1= '-' ) )
            // InternalFPML.g:4438:2: ( () otherlv_1= '-' )
            {
            // InternalFPML.g:4438:2: ( () otherlv_1= '-' )
            // InternalFPML.g:4439:3: () otherlv_1= '-'
            {
            // InternalFPML.g:4439:3: ()
            // InternalFPML.g:4440:4: 
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
    // InternalFPML.g:4454:1: entryRuleTimes returns [EObject current=null] : iv_ruleTimes= ruleTimes EOF ;
    public final EObject entryRuleTimes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimes = null;


        try {
            // InternalFPML.g:4454:46: (iv_ruleTimes= ruleTimes EOF )
            // InternalFPML.g:4455:2: iv_ruleTimes= ruleTimes EOF
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
    // InternalFPML.g:4461:1: ruleTimes returns [EObject current=null] : ( () otherlv_1= '*' ) ;
    public final EObject ruleTimes() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFPML.g:4467:2: ( ( () otherlv_1= '*' ) )
            // InternalFPML.g:4468:2: ( () otherlv_1= '*' )
            {
            // InternalFPML.g:4468:2: ( () otherlv_1= '*' )
            // InternalFPML.g:4469:3: () otherlv_1= '*'
            {
            // InternalFPML.g:4469:3: ()
            // InternalFPML.g:4470:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTimesAccess().getTimesAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,40,FOLLOW_2); 

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
    // InternalFPML.g:4484:1: entryRuleMod returns [EObject current=null] : iv_ruleMod= ruleMod EOF ;
    public final EObject entryRuleMod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMod = null;


        try {
            // InternalFPML.g:4484:44: (iv_ruleMod= ruleMod EOF )
            // InternalFPML.g:4485:2: iv_ruleMod= ruleMod EOF
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
    // InternalFPML.g:4491:1: ruleMod returns [EObject current=null] : ( () otherlv_1= 'mod' ) ;
    public final EObject ruleMod() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFPML.g:4497:2: ( ( () otherlv_1= 'mod' ) )
            // InternalFPML.g:4498:2: ( () otherlv_1= 'mod' )
            {
            // InternalFPML.g:4498:2: ( () otherlv_1= 'mod' )
            // InternalFPML.g:4499:3: () otherlv_1= 'mod'
            {
            // InternalFPML.g:4499:3: ()
            // InternalFPML.g:4500:4: 
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


    // $ANTLR start "entryRuleLeftPair"
    // InternalFPML.g:4514:1: entryRuleLeftPair returns [EObject current=null] : iv_ruleLeftPair= ruleLeftPair EOF ;
    public final EObject entryRuleLeftPair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeftPair = null;


        try {
            // InternalFPML.g:4514:49: (iv_ruleLeftPair= ruleLeftPair EOF )
            // InternalFPML.g:4515:2: iv_ruleLeftPair= ruleLeftPair EOF
            {
             newCompositeNode(grammarAccess.getLeftPairRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLeftPair=ruleLeftPair();

            state._fsp--;

             current =iv_ruleLeftPair; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLeftPair"


    // $ANTLR start "ruleLeftPair"
    // InternalFPML.g:4521:1: ruleLeftPair returns [EObject current=null] : ( () otherlv_1= 'leftPair' ( (lv_type_2_0= rulePureAlgebraicType ) ) ) ;
    public final EObject ruleLeftPair() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:4527:2: ( ( () otherlv_1= 'leftPair' ( (lv_type_2_0= rulePureAlgebraicType ) ) ) )
            // InternalFPML.g:4528:2: ( () otherlv_1= 'leftPair' ( (lv_type_2_0= rulePureAlgebraicType ) ) )
            {
            // InternalFPML.g:4528:2: ( () otherlv_1= 'leftPair' ( (lv_type_2_0= rulePureAlgebraicType ) ) )
            // InternalFPML.g:4529:3: () otherlv_1= 'leftPair' ( (lv_type_2_0= rulePureAlgebraicType ) )
            {
            // InternalFPML.g:4529:3: ()
            // InternalFPML.g:4530:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLeftPairAccess().getLeftPairAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,48,FOLLOW_35); 

            			newLeafNode(otherlv_1, grammarAccess.getLeftPairAccess().getLeftPairKeyword_1());
            		
            // InternalFPML.g:4540:3: ( (lv_type_2_0= rulePureAlgebraicType ) )
            // InternalFPML.g:4541:4: (lv_type_2_0= rulePureAlgebraicType )
            {
            // InternalFPML.g:4541:4: (lv_type_2_0= rulePureAlgebraicType )
            // InternalFPML.g:4542:5: lv_type_2_0= rulePureAlgebraicType
            {

            					newCompositeNode(grammarAccess.getLeftPairAccess().getTypePureAlgebraicTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=rulePureAlgebraicType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLeftPairRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"it.unibo.FPML.PureAlgebraicType");
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
    // $ANTLR end "ruleLeftPair"


    // $ANTLR start "entryRuleRightPair"
    // InternalFPML.g:4563:1: entryRuleRightPair returns [EObject current=null] : iv_ruleRightPair= ruleRightPair EOF ;
    public final EObject entryRuleRightPair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRightPair = null;


        try {
            // InternalFPML.g:4563:50: (iv_ruleRightPair= ruleRightPair EOF )
            // InternalFPML.g:4564:2: iv_ruleRightPair= ruleRightPair EOF
            {
             newCompositeNode(grammarAccess.getRightPairRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRightPair=ruleRightPair();

            state._fsp--;

             current =iv_ruleRightPair; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRightPair"


    // $ANTLR start "ruleRightPair"
    // InternalFPML.g:4570:1: ruleRightPair returns [EObject current=null] : ( () otherlv_1= 'rightPair' ( (lv_type_2_0= rulePureAlgebraicType ) ) ) ;
    public final EObject ruleRightPair() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:4576:2: ( ( () otherlv_1= 'rightPair' ( (lv_type_2_0= rulePureAlgebraicType ) ) ) )
            // InternalFPML.g:4577:2: ( () otherlv_1= 'rightPair' ( (lv_type_2_0= rulePureAlgebraicType ) ) )
            {
            // InternalFPML.g:4577:2: ( () otherlv_1= 'rightPair' ( (lv_type_2_0= rulePureAlgebraicType ) ) )
            // InternalFPML.g:4578:3: () otherlv_1= 'rightPair' ( (lv_type_2_0= rulePureAlgebraicType ) )
            {
            // InternalFPML.g:4578:3: ()
            // InternalFPML.g:4579:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRightPairAccess().getRightPairAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,49,FOLLOW_35); 

            			newLeafNode(otherlv_1, grammarAccess.getRightPairAccess().getRightPairKeyword_1());
            		
            // InternalFPML.g:4589:3: ( (lv_type_2_0= rulePureAlgebraicType ) )
            // InternalFPML.g:4590:4: (lv_type_2_0= rulePureAlgebraicType )
            {
            // InternalFPML.g:4590:4: (lv_type_2_0= rulePureAlgebraicType )
            // InternalFPML.g:4591:5: lv_type_2_0= rulePureAlgebraicType
            {

            					newCompositeNode(grammarAccess.getRightPairAccess().getTypePureAlgebraicTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=rulePureAlgebraicType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRightPairRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"it.unibo.FPML.PureAlgebraicType");
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
    // $ANTLR end "ruleRightPair"


    // $ANTLR start "entryRuleApplyF"
    // InternalFPML.g:4612:1: entryRuleApplyF returns [EObject current=null] : iv_ruleApplyF= ruleApplyF EOF ;
    public final EObject entryRuleApplyF() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplyF = null;


        try {
            // InternalFPML.g:4612:47: (iv_ruleApplyF= ruleApplyF EOF )
            // InternalFPML.g:4613:2: iv_ruleApplyF= ruleApplyF EOF
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
    // InternalFPML.g:4619:1: ruleApplyF returns [EObject current=null] : ( () otherlv_1= 'applyF' ( (lv_functionType_2_0= rulePureFunctionType ) ) ( (lv_value_3_0= ruleApplyFFactor ) ) ) ;
    public final EObject ruleApplyF() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_functionType_2_0 = null;

        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:4625:2: ( ( () otherlv_1= 'applyF' ( (lv_functionType_2_0= rulePureFunctionType ) ) ( (lv_value_3_0= ruleApplyFFactor ) ) ) )
            // InternalFPML.g:4626:2: ( () otherlv_1= 'applyF' ( (lv_functionType_2_0= rulePureFunctionType ) ) ( (lv_value_3_0= ruleApplyFFactor ) ) )
            {
            // InternalFPML.g:4626:2: ( () otherlv_1= 'applyF' ( (lv_functionType_2_0= rulePureFunctionType ) ) ( (lv_value_3_0= ruleApplyFFactor ) ) )
            // InternalFPML.g:4627:3: () otherlv_1= 'applyF' ( (lv_functionType_2_0= rulePureFunctionType ) ) ( (lv_value_3_0= ruleApplyFFactor ) )
            {
            // InternalFPML.g:4627:3: ()
            // InternalFPML.g:4628:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getApplyFAccess().getApplyFAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,50,FOLLOW_37); 

            			newLeafNode(otherlv_1, grammarAccess.getApplyFAccess().getApplyFKeyword_1());
            		
            // InternalFPML.g:4638:3: ( (lv_functionType_2_0= rulePureFunctionType ) )
            // InternalFPML.g:4639:4: (lv_functionType_2_0= rulePureFunctionType )
            {
            // InternalFPML.g:4639:4: (lv_functionType_2_0= rulePureFunctionType )
            // InternalFPML.g:4640:5: lv_functionType_2_0= rulePureFunctionType
            {

            					newCompositeNode(grammarAccess.getApplyFAccess().getFunctionTypePureFunctionTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_38);
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

            // InternalFPML.g:4657:3: ( (lv_value_3_0= ruleApplyFFactor ) )
            // InternalFPML.g:4658:4: (lv_value_3_0= ruleApplyFFactor )
            {
            // InternalFPML.g:4658:4: (lv_value_3_0= ruleApplyFFactor )
            // InternalFPML.g:4659:5: lv_value_3_0= ruleApplyFFactor
            {

            					newCompositeNode(grammarAccess.getApplyFAccess().getValueApplyFFactorParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_3_0=ruleApplyFFactor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getApplyFRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"it.unibo.FPML.ApplyFFactor");
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
    // $ANTLR end "ruleApplyF"


    // $ANTLR start "entryRuleApplyFFactor"
    // InternalFPML.g:4680:1: entryRuleApplyFFactor returns [EObject current=null] : iv_ruleApplyFFactor= ruleApplyFFactor EOF ;
    public final EObject entryRuleApplyFFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplyFFactor = null;


        try {
            // InternalFPML.g:4680:53: (iv_ruleApplyFFactor= ruleApplyFFactor EOF )
            // InternalFPML.g:4681:2: iv_ruleApplyFFactor= ruleApplyFFactor EOF
            {
             newCompositeNode(grammarAccess.getApplyFFactorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleApplyFFactor=ruleApplyFFactor();

            state._fsp--;

             current =iv_ruleApplyFFactor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleApplyFFactor"


    // $ANTLR start "ruleApplyFFactor"
    // InternalFPML.g:4687:1: ruleApplyFFactor returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | (otherlv_1= '(' ( (lv_valueLambda_2_0= rulePureLambda ) ) otherlv_3= ')' ) ) ;
    public final EObject ruleApplyFFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_valueLambda_2_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:4693:2: ( ( ( (otherlv_0= RULE_ID ) ) | (otherlv_1= '(' ( (lv_valueLambda_2_0= rulePureLambda ) ) otherlv_3= ')' ) ) )
            // InternalFPML.g:4694:2: ( ( (otherlv_0= RULE_ID ) ) | (otherlv_1= '(' ( (lv_valueLambda_2_0= rulePureLambda ) ) otherlv_3= ')' ) )
            {
            // InternalFPML.g:4694:2: ( ( (otherlv_0= RULE_ID ) ) | (otherlv_1= '(' ( (lv_valueLambda_2_0= rulePureLambda ) ) otherlv_3= ')' ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ID) ) {
                alt36=1;
            }
            else if ( (LA36_0==20) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalFPML.g:4695:3: ( (otherlv_0= RULE_ID ) )
                    {
                    // InternalFPML.g:4695:3: ( (otherlv_0= RULE_ID ) )
                    // InternalFPML.g:4696:4: (otherlv_0= RULE_ID )
                    {
                    // InternalFPML.g:4696:4: (otherlv_0= RULE_ID )
                    // InternalFPML.g:4697:5: otherlv_0= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getApplyFFactorRule());
                    					}
                    				
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_0, grammarAccess.getApplyFFactorAccess().getValueReferencePureFunctionCrossReference_0_0());
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFPML.g:4709:3: (otherlv_1= '(' ( (lv_valueLambda_2_0= rulePureLambda ) ) otherlv_3= ')' )
                    {
                    // InternalFPML.g:4709:3: (otherlv_1= '(' ( (lv_valueLambda_2_0= rulePureLambda ) ) otherlv_3= ')' )
                    // InternalFPML.g:4710:4: otherlv_1= '(' ( (lv_valueLambda_2_0= rulePureLambda ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_18); 

                    				newLeafNode(otherlv_1, grammarAccess.getApplyFFactorAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalFPML.g:4714:4: ( (lv_valueLambda_2_0= rulePureLambda ) )
                    // InternalFPML.g:4715:5: (lv_valueLambda_2_0= rulePureLambda )
                    {
                    // InternalFPML.g:4715:5: (lv_valueLambda_2_0= rulePureLambda )
                    // InternalFPML.g:4716:6: lv_valueLambda_2_0= rulePureLambda
                    {

                    						newCompositeNode(grammarAccess.getApplyFFactorAccess().getValueLambdaPureLambdaParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_valueLambda_2_0=rulePureLambda();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getApplyFFactorRule());
                    						}
                    						set(
                    							current,
                    							"valueLambda",
                    							lv_valueLambda_2_0,
                    							"it.unibo.FPML.PureLambda");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getApplyFFactorAccess().getRightParenthesisKeyword_1_2());
                    			

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
    // $ANTLR end "ruleApplyFFactor"


    // $ANTLR start "entryRulePrimitiveEffectFullFunction"
    // InternalFPML.g:4742:1: entryRulePrimitiveEffectFullFunction returns [EObject current=null] : iv_rulePrimitiveEffectFullFunction= rulePrimitiveEffectFullFunction EOF ;
    public final EObject entryRulePrimitiveEffectFullFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveEffectFullFunction = null;


        try {
            // InternalFPML.g:4742:68: (iv_rulePrimitiveEffectFullFunction= rulePrimitiveEffectFullFunction EOF )
            // InternalFPML.g:4743:2: iv_rulePrimitiveEffectFullFunction= rulePrimitiveEffectFullFunction EOF
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
    // InternalFPML.g:4749:1: rulePrimitiveEffectFullFunction returns [EObject current=null] : (this_PrimitivePrint_0= rulePrimitivePrint | this_ApplyFIO_1= ruleApplyFIO | this_PrimitiveReturn_2= rulePrimitiveReturn | this_LeftPairIO_3= ruleLeftPairIO | this_RightPairIO_4= ruleRightPairIO ) ;
    public final EObject rulePrimitiveEffectFullFunction() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitivePrint_0 = null;

        EObject this_ApplyFIO_1 = null;

        EObject this_PrimitiveReturn_2 = null;

        EObject this_LeftPairIO_3 = null;

        EObject this_RightPairIO_4 = null;



        	enterRule();

        try {
            // InternalFPML.g:4755:2: ( (this_PrimitivePrint_0= rulePrimitivePrint | this_ApplyFIO_1= ruleApplyFIO | this_PrimitiveReturn_2= rulePrimitiveReturn | this_LeftPairIO_3= ruleLeftPairIO | this_RightPairIO_4= ruleRightPairIO ) )
            // InternalFPML.g:4756:2: (this_PrimitivePrint_0= rulePrimitivePrint | this_ApplyFIO_1= ruleApplyFIO | this_PrimitiveReturn_2= rulePrimitiveReturn | this_LeftPairIO_3= ruleLeftPairIO | this_RightPairIO_4= ruleRightPairIO )
            {
            // InternalFPML.g:4756:2: (this_PrimitivePrint_0= rulePrimitivePrint | this_ApplyFIO_1= ruleApplyFIO | this_PrimitiveReturn_2= rulePrimitiveReturn | this_LeftPairIO_3= ruleLeftPairIO | this_RightPairIO_4= ruleRightPairIO )
            int alt37=5;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt37=1;
                }
                break;
            case 55:
                {
                alt37=2;
                }
                break;
            case 53:
                {
                alt37=3;
                }
                break;
            case 48:
                {
                alt37=4;
                }
                break;
            case 49:
                {
                alt37=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // InternalFPML.g:4757:3: this_PrimitivePrint_0= rulePrimitivePrint
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
                    // InternalFPML.g:4766:3: this_ApplyFIO_1= ruleApplyFIO
                    {

                    			newCompositeNode(grammarAccess.getPrimitiveEffectFullFunctionAccess().getApplyFIOParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ApplyFIO_1=ruleApplyFIO();

                    state._fsp--;


                    			current = this_ApplyFIO_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalFPML.g:4775:3: this_PrimitiveReturn_2= rulePrimitiveReturn
                    {

                    			newCompositeNode(grammarAccess.getPrimitiveEffectFullFunctionAccess().getPrimitiveReturnParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrimitiveReturn_2=rulePrimitiveReturn();

                    state._fsp--;


                    			current = this_PrimitiveReturn_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalFPML.g:4784:3: this_LeftPairIO_3= ruleLeftPairIO
                    {

                    			newCompositeNode(grammarAccess.getPrimitiveEffectFullFunctionAccess().getLeftPairIOParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_LeftPairIO_3=ruleLeftPairIO();

                    state._fsp--;


                    			current = this_LeftPairIO_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalFPML.g:4793:3: this_RightPairIO_4= ruleRightPairIO
                    {

                    			newCompositeNode(grammarAccess.getPrimitiveEffectFullFunctionAccess().getRightPairIOParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_RightPairIO_4=ruleRightPairIO();

                    state._fsp--;


                    			current = this_RightPairIO_4;
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
    // InternalFPML.g:4805:1: entryRulePrimitivePrint returns [EObject current=null] : iv_rulePrimitivePrint= rulePrimitivePrint EOF ;
    public final EObject entryRulePrimitivePrint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitivePrint = null;


        try {
            // InternalFPML.g:4805:55: (iv_rulePrimitivePrint= rulePrimitivePrint EOF )
            // InternalFPML.g:4806:2: iv_rulePrimitivePrint= rulePrimitivePrint EOF
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
    // InternalFPML.g:4812:1: rulePrimitivePrint returns [EObject current=null] : ( () otherlv_1= 'print' ) ;
    public final EObject rulePrimitivePrint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFPML.g:4818:2: ( ( () otherlv_1= 'print' ) )
            // InternalFPML.g:4819:2: ( () otherlv_1= 'print' )
            {
            // InternalFPML.g:4819:2: ( () otherlv_1= 'print' )
            // InternalFPML.g:4820:3: () otherlv_1= 'print'
            {
            // InternalFPML.g:4820:3: ()
            // InternalFPML.g:4821:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPrimitivePrintAccess().getPrimitivePrintAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,51,FOLLOW_2); 

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


    // $ANTLR start "entryRuleLeftPairIO"
    // InternalFPML.g:4835:1: entryRuleLeftPairIO returns [EObject current=null] : iv_ruleLeftPairIO= ruleLeftPairIO EOF ;
    public final EObject entryRuleLeftPairIO() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeftPairIO = null;


        try {
            // InternalFPML.g:4835:51: (iv_ruleLeftPairIO= ruleLeftPairIO EOF )
            // InternalFPML.g:4836:2: iv_ruleLeftPairIO= ruleLeftPairIO EOF
            {
             newCompositeNode(grammarAccess.getLeftPairIORule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLeftPairIO=ruleLeftPairIO();

            state._fsp--;

             current =iv_ruleLeftPairIO; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLeftPairIO"


    // $ANTLR start "ruleLeftPairIO"
    // InternalFPML.g:4842:1: ruleLeftPairIO returns [EObject current=null] : ( () otherlv_1= 'leftPair' ( (lv_type_2_0= ruleEffectFullAlgebraicType ) ) ) ;
    public final EObject ruleLeftPairIO() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:4848:2: ( ( () otherlv_1= 'leftPair' ( (lv_type_2_0= ruleEffectFullAlgebraicType ) ) ) )
            // InternalFPML.g:4849:2: ( () otherlv_1= 'leftPair' ( (lv_type_2_0= ruleEffectFullAlgebraicType ) ) )
            {
            // InternalFPML.g:4849:2: ( () otherlv_1= 'leftPair' ( (lv_type_2_0= ruleEffectFullAlgebraicType ) ) )
            // InternalFPML.g:4850:3: () otherlv_1= 'leftPair' ( (lv_type_2_0= ruleEffectFullAlgebraicType ) )
            {
            // InternalFPML.g:4850:3: ()
            // InternalFPML.g:4851:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLeftPairIOAccess().getLeftPairIOAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,48,FOLLOW_35); 

            			newLeafNode(otherlv_1, grammarAccess.getLeftPairIOAccess().getLeftPairKeyword_1());
            		
            // InternalFPML.g:4861:3: ( (lv_type_2_0= ruleEffectFullAlgebraicType ) )
            // InternalFPML.g:4862:4: (lv_type_2_0= ruleEffectFullAlgebraicType )
            {
            // InternalFPML.g:4862:4: (lv_type_2_0= ruleEffectFullAlgebraicType )
            // InternalFPML.g:4863:5: lv_type_2_0= ruleEffectFullAlgebraicType
            {

            					newCompositeNode(grammarAccess.getLeftPairIOAccess().getTypeEffectFullAlgebraicTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleEffectFullAlgebraicType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLeftPairIORule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"it.unibo.FPML.EffectFullAlgebraicType");
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
    // $ANTLR end "ruleLeftPairIO"


    // $ANTLR start "entryRuleRightPairIO"
    // InternalFPML.g:4884:1: entryRuleRightPairIO returns [EObject current=null] : iv_ruleRightPairIO= ruleRightPairIO EOF ;
    public final EObject entryRuleRightPairIO() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRightPairIO = null;


        try {
            // InternalFPML.g:4884:52: (iv_ruleRightPairIO= ruleRightPairIO EOF )
            // InternalFPML.g:4885:2: iv_ruleRightPairIO= ruleRightPairIO EOF
            {
             newCompositeNode(grammarAccess.getRightPairIORule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRightPairIO=ruleRightPairIO();

            state._fsp--;

             current =iv_ruleRightPairIO; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRightPairIO"


    // $ANTLR start "ruleRightPairIO"
    // InternalFPML.g:4891:1: ruleRightPairIO returns [EObject current=null] : ( () otherlv_1= 'rightPair' ( (lv_type_2_0= ruleEffectFullAlgebraicType ) ) ) ;
    public final EObject ruleRightPairIO() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:4897:2: ( ( () otherlv_1= 'rightPair' ( (lv_type_2_0= ruleEffectFullAlgebraicType ) ) ) )
            // InternalFPML.g:4898:2: ( () otherlv_1= 'rightPair' ( (lv_type_2_0= ruleEffectFullAlgebraicType ) ) )
            {
            // InternalFPML.g:4898:2: ( () otherlv_1= 'rightPair' ( (lv_type_2_0= ruleEffectFullAlgebraicType ) ) )
            // InternalFPML.g:4899:3: () otherlv_1= 'rightPair' ( (lv_type_2_0= ruleEffectFullAlgebraicType ) )
            {
            // InternalFPML.g:4899:3: ()
            // InternalFPML.g:4900:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRightPairIOAccess().getRightPairIOAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,49,FOLLOW_35); 

            			newLeafNode(otherlv_1, grammarAccess.getRightPairIOAccess().getRightPairKeyword_1());
            		
            // InternalFPML.g:4910:3: ( (lv_type_2_0= ruleEffectFullAlgebraicType ) )
            // InternalFPML.g:4911:4: (lv_type_2_0= ruleEffectFullAlgebraicType )
            {
            // InternalFPML.g:4911:4: (lv_type_2_0= ruleEffectFullAlgebraicType )
            // InternalFPML.g:4912:5: lv_type_2_0= ruleEffectFullAlgebraicType
            {

            					newCompositeNode(grammarAccess.getRightPairIOAccess().getTypeEffectFullAlgebraicTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleEffectFullAlgebraicType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRightPairIORule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"it.unibo.FPML.EffectFullAlgebraicType");
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
    // $ANTLR end "ruleRightPairIO"


    // $ANTLR start "entryRulePrimitiveEffectFullValue"
    // InternalFPML.g:4933:1: entryRulePrimitiveEffectFullValue returns [EObject current=null] : iv_rulePrimitiveEffectFullValue= rulePrimitiveEffectFullValue EOF ;
    public final EObject entryRulePrimitiveEffectFullValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveEffectFullValue = null;


        try {
            // InternalFPML.g:4933:65: (iv_rulePrimitiveEffectFullValue= rulePrimitiveEffectFullValue EOF )
            // InternalFPML.g:4934:2: iv_rulePrimitiveEffectFullValue= rulePrimitiveEffectFullValue EOF
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
    // InternalFPML.g:4940:1: rulePrimitiveEffectFullValue returns [EObject current=null] : (this_PrimitiveRandom_0= rulePrimitiveRandom | this_PrimitiveTime_1= rulePrimitiveTime ) ;
    public final EObject rulePrimitiveEffectFullValue() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveRandom_0 = null;

        EObject this_PrimitiveTime_1 = null;



        	enterRule();

        try {
            // InternalFPML.g:4946:2: ( (this_PrimitiveRandom_0= rulePrimitiveRandom | this_PrimitiveTime_1= rulePrimitiveTime ) )
            // InternalFPML.g:4947:2: (this_PrimitiveRandom_0= rulePrimitiveRandom | this_PrimitiveTime_1= rulePrimitiveTime )
            {
            // InternalFPML.g:4947:2: (this_PrimitiveRandom_0= rulePrimitiveRandom | this_PrimitiveTime_1= rulePrimitiveTime )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==52) ) {
                alt38=1;
            }
            else if ( (LA38_0==54) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalFPML.g:4948:3: this_PrimitiveRandom_0= rulePrimitiveRandom
                    {

                    			newCompositeNode(grammarAccess.getPrimitiveEffectFullValueAccess().getPrimitiveRandomParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrimitiveRandom_0=rulePrimitiveRandom();

                    state._fsp--;


                    			current = this_PrimitiveRandom_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFPML.g:4957:3: this_PrimitiveTime_1= rulePrimitiveTime
                    {

                    			newCompositeNode(grammarAccess.getPrimitiveEffectFullValueAccess().getPrimitiveTimeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrimitiveTime_1=rulePrimitiveTime();

                    state._fsp--;


                    			current = this_PrimitiveTime_1;
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
    // $ANTLR end "rulePrimitiveEffectFullValue"


    // $ANTLR start "entryRulePrimitiveRandom"
    // InternalFPML.g:4969:1: entryRulePrimitiveRandom returns [EObject current=null] : iv_rulePrimitiveRandom= rulePrimitiveRandom EOF ;
    public final EObject entryRulePrimitiveRandom() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveRandom = null;


        try {
            // InternalFPML.g:4969:56: (iv_rulePrimitiveRandom= rulePrimitiveRandom EOF )
            // InternalFPML.g:4970:2: iv_rulePrimitiveRandom= rulePrimitiveRandom EOF
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
    // InternalFPML.g:4976:1: rulePrimitiveRandom returns [EObject current=null] : ( () otherlv_1= 'randomInt' ) ;
    public final EObject rulePrimitiveRandom() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFPML.g:4982:2: ( ( () otherlv_1= 'randomInt' ) )
            // InternalFPML.g:4983:2: ( () otherlv_1= 'randomInt' )
            {
            // InternalFPML.g:4983:2: ( () otherlv_1= 'randomInt' )
            // InternalFPML.g:4984:3: () otherlv_1= 'randomInt'
            {
            // InternalFPML.g:4984:3: ()
            // InternalFPML.g:4985:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPrimitiveRandomAccess().getPrimitiveRandomAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,52,FOLLOW_2); 

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


    // $ANTLR start "entryRulePrimitiveReturn"
    // InternalFPML.g:4999:1: entryRulePrimitiveReturn returns [EObject current=null] : iv_rulePrimitiveReturn= rulePrimitiveReturn EOF ;
    public final EObject entryRulePrimitiveReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveReturn = null;


        try {
            // InternalFPML.g:4999:56: (iv_rulePrimitiveReturn= rulePrimitiveReturn EOF )
            // InternalFPML.g:5000:2: iv_rulePrimitiveReturn= rulePrimitiveReturn EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveReturnRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimitiveReturn=rulePrimitiveReturn();

            state._fsp--;

             current =iv_rulePrimitiveReturn; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitiveReturn"


    // $ANTLR start "rulePrimitiveReturn"
    // InternalFPML.g:5006:1: rulePrimitiveReturn returns [EObject current=null] : ( () otherlv_1= 'return' ( (lv_type_2_0= ruleType ) ) ) ;
    public final EObject rulePrimitiveReturn() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:5012:2: ( ( () otherlv_1= 'return' ( (lv_type_2_0= ruleType ) ) ) )
            // InternalFPML.g:5013:2: ( () otherlv_1= 'return' ( (lv_type_2_0= ruleType ) ) )
            {
            // InternalFPML.g:5013:2: ( () otherlv_1= 'return' ( (lv_type_2_0= ruleType ) ) )
            // InternalFPML.g:5014:3: () otherlv_1= 'return' ( (lv_type_2_0= ruleType ) )
            {
            // InternalFPML.g:5014:3: ()
            // InternalFPML.g:5015:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPrimitiveReturnAccess().getPrimitiveReturnAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,53,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getPrimitiveReturnAccess().getReturnKeyword_1());
            		
            // InternalFPML.g:5025:3: ( (lv_type_2_0= ruleType ) )
            // InternalFPML.g:5026:4: (lv_type_2_0= ruleType )
            {
            // InternalFPML.g:5026:4: (lv_type_2_0= ruleType )
            // InternalFPML.g:5027:5: lv_type_2_0= ruleType
            {

            					newCompositeNode(grammarAccess.getPrimitiveReturnAccess().getTypeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPrimitiveReturnRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
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
    // $ANTLR end "rulePrimitiveReturn"


    // $ANTLR start "entryRulePrimitiveTime"
    // InternalFPML.g:5048:1: entryRulePrimitiveTime returns [EObject current=null] : iv_rulePrimitiveTime= rulePrimitiveTime EOF ;
    public final EObject entryRulePrimitiveTime() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveTime = null;


        try {
            // InternalFPML.g:5048:54: (iv_rulePrimitiveTime= rulePrimitiveTime EOF )
            // InternalFPML.g:5049:2: iv_rulePrimitiveTime= rulePrimitiveTime EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveTimeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimitiveTime=rulePrimitiveTime();

            state._fsp--;

             current =iv_rulePrimitiveTime; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitiveTime"


    // $ANTLR start "rulePrimitiveTime"
    // InternalFPML.g:5055:1: rulePrimitiveTime returns [EObject current=null] : ( () otherlv_1= 'currentTime' ) ;
    public final EObject rulePrimitiveTime() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFPML.g:5061:2: ( ( () otherlv_1= 'currentTime' ) )
            // InternalFPML.g:5062:2: ( () otherlv_1= 'currentTime' )
            {
            // InternalFPML.g:5062:2: ( () otherlv_1= 'currentTime' )
            // InternalFPML.g:5063:3: () otherlv_1= 'currentTime'
            {
            // InternalFPML.g:5063:3: ()
            // InternalFPML.g:5064:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPrimitiveTimeAccess().getPrimitiveTimeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,54,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getPrimitiveTimeAccess().getCurrentTimeKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitiveTime"


    // $ANTLR start "entryRuleApplyFIO"
    // InternalFPML.g:5078:1: entryRuleApplyFIO returns [EObject current=null] : iv_ruleApplyFIO= ruleApplyFIO EOF ;
    public final EObject entryRuleApplyFIO() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplyFIO = null;


        try {
            // InternalFPML.g:5078:49: (iv_ruleApplyFIO= ruleApplyFIO EOF )
            // InternalFPML.g:5079:2: iv_ruleApplyFIO= ruleApplyFIO EOF
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
    // InternalFPML.g:5085:1: ruleApplyFIO returns [EObject current=null] : ( () otherlv_1= 'applyFIO' ( (lv_functionType_2_0= ruleEffectFullFunctionType ) ) ( (lv_value_3_0= ruleApplyFIOFactor ) ) ) ;
    public final EObject ruleApplyFIO() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_functionType_2_0 = null;

        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:5091:2: ( ( () otherlv_1= 'applyFIO' ( (lv_functionType_2_0= ruleEffectFullFunctionType ) ) ( (lv_value_3_0= ruleApplyFIOFactor ) ) ) )
            // InternalFPML.g:5092:2: ( () otherlv_1= 'applyFIO' ( (lv_functionType_2_0= ruleEffectFullFunctionType ) ) ( (lv_value_3_0= ruleApplyFIOFactor ) ) )
            {
            // InternalFPML.g:5092:2: ( () otherlv_1= 'applyFIO' ( (lv_functionType_2_0= ruleEffectFullFunctionType ) ) ( (lv_value_3_0= ruleApplyFIOFactor ) ) )
            // InternalFPML.g:5093:3: () otherlv_1= 'applyFIO' ( (lv_functionType_2_0= ruleEffectFullFunctionType ) ) ( (lv_value_3_0= ruleApplyFIOFactor ) )
            {
            // InternalFPML.g:5093:3: ()
            // InternalFPML.g:5094:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getApplyFIOAccess().getApplyFIOAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,55,FOLLOW_39); 

            			newLeafNode(otherlv_1, grammarAccess.getApplyFIOAccess().getApplyFIOKeyword_1());
            		
            // InternalFPML.g:5104:3: ( (lv_functionType_2_0= ruleEffectFullFunctionType ) )
            // InternalFPML.g:5105:4: (lv_functionType_2_0= ruleEffectFullFunctionType )
            {
            // InternalFPML.g:5105:4: (lv_functionType_2_0= ruleEffectFullFunctionType )
            // InternalFPML.g:5106:5: lv_functionType_2_0= ruleEffectFullFunctionType
            {

            					newCompositeNode(grammarAccess.getApplyFIOAccess().getFunctionTypeEffectFullFunctionTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_40);
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

            // InternalFPML.g:5123:3: ( (lv_value_3_0= ruleApplyFIOFactor ) )
            // InternalFPML.g:5124:4: (lv_value_3_0= ruleApplyFIOFactor )
            {
            // InternalFPML.g:5124:4: (lv_value_3_0= ruleApplyFIOFactor )
            // InternalFPML.g:5125:5: lv_value_3_0= ruleApplyFIOFactor
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
    // InternalFPML.g:5146:1: entryRuleApplyFIOFactor returns [EObject current=null] : iv_ruleApplyFIOFactor= ruleApplyFIOFactor EOF ;
    public final EObject entryRuleApplyFIOFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplyFIOFactor = null;


        try {
            // InternalFPML.g:5146:55: (iv_ruleApplyFIOFactor= ruleApplyFIOFactor EOF )
            // InternalFPML.g:5147:2: iv_ruleApplyFIOFactor= ruleApplyFIOFactor EOF
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
    // InternalFPML.g:5153:1: ruleApplyFIOFactor returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | ( (lv_valuePrimitive_1_0= rulePrimitiveEffectFullValue ) ) | (otherlv_2= '(' ( (lv_valueLambda_3_0= ruleEffectFullLambda ) ) otherlv_4= ')' ) ) ;
    public final EObject ruleApplyFIOFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_valuePrimitive_1_0 = null;

        EObject lv_valueLambda_3_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:5159:2: ( ( ( (otherlv_0= RULE_ID ) ) | ( (lv_valuePrimitive_1_0= rulePrimitiveEffectFullValue ) ) | (otherlv_2= '(' ( (lv_valueLambda_3_0= ruleEffectFullLambda ) ) otherlv_4= ')' ) ) )
            // InternalFPML.g:5160:2: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_valuePrimitive_1_0= rulePrimitiveEffectFullValue ) ) | (otherlv_2= '(' ( (lv_valueLambda_3_0= ruleEffectFullLambda ) ) otherlv_4= ')' ) )
            {
            // InternalFPML.g:5160:2: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_valuePrimitive_1_0= rulePrimitiveEffectFullValue ) ) | (otherlv_2= '(' ( (lv_valueLambda_3_0= ruleEffectFullLambda ) ) otherlv_4= ')' ) )
            int alt39=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt39=1;
                }
                break;
            case 52:
            case 54:
                {
                alt39=2;
                }
                break;
            case 20:
                {
                alt39=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalFPML.g:5161:3: ( (otherlv_0= RULE_ID ) )
                    {
                    // InternalFPML.g:5161:3: ( (otherlv_0= RULE_ID ) )
                    // InternalFPML.g:5162:4: (otherlv_0= RULE_ID )
                    {
                    // InternalFPML.g:5162:4: (otherlv_0= RULE_ID )
                    // InternalFPML.g:5163:5: otherlv_0= RULE_ID
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
                    // InternalFPML.g:5175:3: ( (lv_valuePrimitive_1_0= rulePrimitiveEffectFullValue ) )
                    {
                    // InternalFPML.g:5175:3: ( (lv_valuePrimitive_1_0= rulePrimitiveEffectFullValue ) )
                    // InternalFPML.g:5176:4: (lv_valuePrimitive_1_0= rulePrimitiveEffectFullValue )
                    {
                    // InternalFPML.g:5176:4: (lv_valuePrimitive_1_0= rulePrimitiveEffectFullValue )
                    // InternalFPML.g:5177:5: lv_valuePrimitive_1_0= rulePrimitiveEffectFullValue
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
                case 3 :
                    // InternalFPML.g:5195:3: (otherlv_2= '(' ( (lv_valueLambda_3_0= ruleEffectFullLambda ) ) otherlv_4= ')' )
                    {
                    // InternalFPML.g:5195:3: (otherlv_2= '(' ( (lv_valueLambda_3_0= ruleEffectFullLambda ) ) otherlv_4= ')' )
                    // InternalFPML.g:5196:4: otherlv_2= '(' ( (lv_valueLambda_3_0= ruleEffectFullLambda ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_35); 

                    				newLeafNode(otherlv_2, grammarAccess.getApplyFIOFactorAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalFPML.g:5200:4: ( (lv_valueLambda_3_0= ruleEffectFullLambda ) )
                    // InternalFPML.g:5201:5: (lv_valueLambda_3_0= ruleEffectFullLambda )
                    {
                    // InternalFPML.g:5201:5: (lv_valueLambda_3_0= ruleEffectFullLambda )
                    // InternalFPML.g:5202:6: lv_valueLambda_3_0= ruleEffectFullLambda
                    {

                    						newCompositeNode(grammarAccess.getApplyFIOFactorAccess().getValueLambdaEffectFullLambdaParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_valueLambda_3_0=ruleEffectFullLambda();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getApplyFIOFactorRule());
                    						}
                    						set(
                    							current,
                    							"valueLambda",
                    							lv_valueLambda_3_0,
                    							"it.unibo.FPML.EffectFullLambda");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getApplyFIOFactorAccess().getRightParenthesisKeyword_2_2());
                    			

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


    protected DFA30 dfa30 = new DFA30(this);
    protected DFA33 dfa33 = new DFA33(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\3\uffff\1\7\7\uffff";
    static final String dfa_3s = "\1\4\2\uffff\2\4\6\uffff";
    static final String dfa_4s = "\1\53\2\uffff\1\26\1\53\6\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\2\2\uffff\1\5\1\7\1\6\1\3\1\4\1\10";
    static final String dfa_6s = "\13\uffff}>";
    static final String[] dfa_7s = {
            "\1\3\1\1\1\2\15\uffff\1\4\24\uffff\1\5\2\6",
            "",
            "",
            "\1\7\10\uffff\1\7\6\uffff\1\10\2\7",
            "\3\12\15\uffff\1\12\1\uffff\1\11\5\uffff\4\11\1\uffff\1\11\3\uffff\1\11\3\uffff\3\12",
            "",
            "",
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

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "3288:2: (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_DataValue_2= ruleDataValue | this_FunctionValue_3= ruleFunctionValue | this_UnitValue_4= ruleUnitValue | this_PureValueRef_5= rulePureValueRef | this_PureSumValue_6= rulePureSumValue | this_PureProdValue_7= rulePureProdValue )";
        }
    }
    static final String dfa_8s = "\12\uffff";
    static final String dfa_9s = "\4\uffff\1\10\5\uffff";
    static final String dfa_10s = "\1\4\1\24\2\uffff\1\24\5\uffff";
    static final String dfa_11s = "\1\53\1\45\2\uffff\1\46\5\uffff";
    static final String dfa_12s = "\2\uffff\1\3\1\4\1\uffff\1\7\1\2\1\1\1\5\1\6";
    static final String dfa_13s = "\12\uffff}>";
    static final String[] dfa_14s = {
            "\1\4\17\uffff\1\3\2\uffff\1\1\15\uffff\1\2\4\uffff\2\5",
            "\1\7\20\uffff\1\6",
            "",
            "",
            "\1\11\2\10\17\uffff\1\10",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "3963:2: ( (otherlv_0= 'IO' otherlv_1= '(' ( (lv_innerValue_2_0= ruleExpression ) ) otherlv_3= ')' ) | (otherlv_4= 'IO' otherlv_5= '[' ( (lv_innerValue_6_0= ruleEffectFullAdtValue ) ) otherlv_7= ']' ) | this_EffectFullFunctionValue_8= ruleEffectFullFunctionValue | this_EffectFullProdValue_9= ruleEffectFullProdValue | this_EffectFullValueRef_10= ruleEffectFullValueRef | this_EffectFullDataValue_11= ruleEffectFullDataValue | this_EffectFullSumValue_12= ruleEffectFullSumValue )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000880000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000022F0000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000E0000100070L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000003100800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000002000800010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0007F18002000010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000033F0800000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00FFF18002000010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x00000C2000900010L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x00FFF18002100010L});

}