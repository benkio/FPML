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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Pure'", "'{'", "'}'", "'Functions'", "'Data'", "'Value'", "'Effects'", "':'", "'def'", "'('", "','", "')'", "'IO'", "'main'", "'Undefined'", "'|>'", "'>>='", "'int'", "'String'", "'Unit'", "'ref'", "'refIO'", "'F'", "'<'", "'>'", "'FIO'", "'['", "']'", "'+'", "'*'", "'()'", "'Left'", "'Right'", "'IntToString'", "'IntPow'", "'-'", "'mod'", "'applyF'", "'print'", "'randomInt'", "'return'", "'currentTime'", "'applyFIO'"
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
    public static final int T__52=52;
    public static final int T__53=53;
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
            otherlv_0=(Token)match(input,23,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getMainFuncAccess().getIOKeyword_0());
            		
            // InternalFPML.g:1175:3: ( (lv_returnType_1_0= ruleUnitType ) )
            // InternalFPML.g:1176:4: (lv_returnType_1_0= ruleUnitType )
            {
            // InternalFPML.g:1176:4: (lv_returnType_1_0= ruleUnitType )
            // InternalFPML.g:1177:5: lv_returnType_1_0= ruleUnitType
            {

            					newCompositeNode(grammarAccess.getMainFuncAccess().getReturnTypeUnitTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_26);
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

                if ( ((LA9_1>=28 && LA9_1<=29)||LA9_1==31||LA9_1==33||LA9_1==37) ) {
                    alt9=2;
                }
                else if ( (LA9_1==23) ) {
                    alt9=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
                }
                break;
            case 49:
            case 51:
            case 53:
                {
                alt9=1;
                }
                break;
            case 39:
            case 40:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
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
    // InternalFPML.g:1348:1: rulePureFunction returns [EObject current=null] : (this_PureFunctionDefinition_0= rulePureFunctionDefinition | this_PrimitivePureFunction_1= rulePrimitivePureFunction ) ;
    public final EObject rulePureFunction() throws RecognitionException {
        EObject current = null;

        EObject this_PureFunctionDefinition_0 = null;

        EObject this_PrimitivePureFunction_1 = null;



        	enterRule();

        try {
            // InternalFPML.g:1354:2: ( (this_PureFunctionDefinition_0= rulePureFunctionDefinition | this_PrimitivePureFunction_1= rulePrimitivePureFunction ) )
            // InternalFPML.g:1355:2: (this_PureFunctionDefinition_0= rulePureFunctionDefinition | this_PrimitivePureFunction_1= rulePrimitivePureFunction )
            {
            // InternalFPML.g:1355:2: (this_PureFunctionDefinition_0= rulePureFunctionDefinition | this_PrimitivePureFunction_1= rulePrimitivePureFunction )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=39 && LA10_0<=40)||(LA10_0>=44 && LA10_0<=48)) ) {
                alt10=2;
            }
            else {
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

            }


            }


            	leaveRule();

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
    // InternalFPML.g:1377:1: entryRuleEffectFullFunction returns [EObject current=null] : iv_ruleEffectFullFunction= ruleEffectFullFunction EOF ;
    public final EObject entryRuleEffectFullFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullFunction = null;


        try {
            // InternalFPML.g:1377:59: (iv_ruleEffectFullFunction= ruleEffectFullFunction EOF )
            // InternalFPML.g:1378:2: iv_ruleEffectFullFunction= ruleEffectFullFunction EOF
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
    // InternalFPML.g:1384:1: ruleEffectFullFunction returns [EObject current=null] : (this_EffectFullFunctionDefinition_0= ruleEffectFullFunctionDefinition | this_PrimitiveEffectFullFunction_1= rulePrimitiveEffectFullFunction ) ;
    public final EObject ruleEffectFullFunction() throws RecognitionException {
        EObject current = null;

        EObject this_EffectFullFunctionDefinition_0 = null;

        EObject this_PrimitiveEffectFullFunction_1 = null;



        	enterRule();

        try {
            // InternalFPML.g:1390:2: ( (this_EffectFullFunctionDefinition_0= ruleEffectFullFunctionDefinition | this_PrimitiveEffectFullFunction_1= rulePrimitiveEffectFullFunction ) )
            // InternalFPML.g:1391:2: (this_EffectFullFunctionDefinition_0= ruleEffectFullFunctionDefinition | this_PrimitiveEffectFullFunction_1= rulePrimitiveEffectFullFunction )
            {
            // InternalFPML.g:1391:2: (this_EffectFullFunctionDefinition_0= ruleEffectFullFunctionDefinition | this_PrimitiveEffectFullFunction_1= rulePrimitiveEffectFullFunction )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            else if ( (LA11_0==49||LA11_0==51||LA11_0==53) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalFPML.g:1392:3: this_EffectFullFunctionDefinition_0= ruleEffectFullFunctionDefinition
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
                    // InternalFPML.g:1401:3: this_PrimitiveEffectFullFunction_1= rulePrimitiveEffectFullFunction
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
    // InternalFPML.g:1413:1: entryRulePrimitiveFunction returns [EObject current=null] : iv_rulePrimitiveFunction= rulePrimitiveFunction EOF ;
    public final EObject entryRulePrimitiveFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveFunction = null;


        try {
            // InternalFPML.g:1413:58: (iv_rulePrimitiveFunction= rulePrimitiveFunction EOF )
            // InternalFPML.g:1414:2: iv_rulePrimitiveFunction= rulePrimitiveFunction EOF
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
    // InternalFPML.g:1420:1: rulePrimitiveFunction returns [EObject current=null] : (this_PrimitiveEffectFullFunction_0= rulePrimitiveEffectFullFunction | this_PrimitivePureFunction_1= rulePrimitivePureFunction | this_PrimitiveEffectFullValue_2= rulePrimitiveEffectFullValue ) ;
    public final EObject rulePrimitiveFunction() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveEffectFullFunction_0 = null;

        EObject this_PrimitivePureFunction_1 = null;

        EObject this_PrimitiveEffectFullValue_2 = null;



        	enterRule();

        try {
            // InternalFPML.g:1426:2: ( (this_PrimitiveEffectFullFunction_0= rulePrimitiveEffectFullFunction | this_PrimitivePureFunction_1= rulePrimitivePureFunction | this_PrimitiveEffectFullValue_2= rulePrimitiveEffectFullValue ) )
            // InternalFPML.g:1427:2: (this_PrimitiveEffectFullFunction_0= rulePrimitiveEffectFullFunction | this_PrimitivePureFunction_1= rulePrimitivePureFunction | this_PrimitiveEffectFullValue_2= rulePrimitiveEffectFullValue )
            {
            // InternalFPML.g:1427:2: (this_PrimitiveEffectFullFunction_0= rulePrimitiveEffectFullFunction | this_PrimitivePureFunction_1= rulePrimitivePureFunction | this_PrimitiveEffectFullValue_2= rulePrimitiveEffectFullValue )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 49:
            case 51:
            case 53:
                {
                alt12=1;
                }
                break;
            case 39:
            case 40:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
                {
                alt12=2;
                }
                break;
            case 50:
            case 52:
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
                    // InternalFPML.g:1428:3: this_PrimitiveEffectFullFunction_0= rulePrimitiveEffectFullFunction
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
                    // InternalFPML.g:1437:3: this_PrimitivePureFunction_1= rulePrimitivePureFunction
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
                    // InternalFPML.g:1446:3: this_PrimitiveEffectFullValue_2= rulePrimitiveEffectFullValue
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
    // InternalFPML.g:1458:1: entryRuleEffectFullArgument returns [EObject current=null] : iv_ruleEffectFullArgument= ruleEffectFullArgument EOF ;
    public final EObject entryRuleEffectFullArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullArgument = null;


        try {
            // InternalFPML.g:1458:59: (iv_ruleEffectFullArgument= ruleEffectFullArgument EOF )
            // InternalFPML.g:1459:2: iv_ruleEffectFullArgument= ruleEffectFullArgument EOF
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
    // InternalFPML.g:1465:1: ruleEffectFullArgument returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEffectFullArgument() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:1471:2: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalFPML.g:1472:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalFPML.g:1472:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalFPML.g:1473:3: ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalFPML.g:1473:3: ( (lv_type_0_0= ruleType ) )
            // InternalFPML.g:1474:4: (lv_type_0_0= ruleType )
            {
            // InternalFPML.g:1474:4: (lv_type_0_0= ruleType )
            // InternalFPML.g:1475:5: lv_type_0_0= ruleType
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

            // InternalFPML.g:1492:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFPML.g:1493:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFPML.g:1493:4: (lv_name_1_0= RULE_ID )
            // InternalFPML.g:1494:5: lv_name_1_0= RULE_ID
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
    // InternalFPML.g:1514:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // InternalFPML.g:1514:49: (iv_ruleArgument= ruleArgument EOF )
            // InternalFPML.g:1515:2: iv_ruleArgument= ruleArgument EOF
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
    // InternalFPML.g:1521:1: ruleArgument returns [EObject current=null] : ( ( (lv_type_0_0= ruleValueType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:1527:2: ( ( ( (lv_type_0_0= ruleValueType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalFPML.g:1528:2: ( ( (lv_type_0_0= ruleValueType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalFPML.g:1528:2: ( ( (lv_type_0_0= ruleValueType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalFPML.g:1529:3: ( (lv_type_0_0= ruleValueType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalFPML.g:1529:3: ( (lv_type_0_0= ruleValueType ) )
            // InternalFPML.g:1530:4: (lv_type_0_0= ruleValueType )
            {
            // InternalFPML.g:1530:4: (lv_type_0_0= ruleValueType )
            // InternalFPML.g:1531:5: lv_type_0_0= ruleValueType
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

            // InternalFPML.g:1548:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFPML.g:1549:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFPML.g:1549:4: (lv_name_1_0= RULE_ID )
            // InternalFPML.g:1550:5: lv_name_1_0= RULE_ID
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
    // InternalFPML.g:1570:1: entryRuleFunctionBodyPure returns [EObject current=null] : iv_ruleFunctionBodyPure= ruleFunctionBodyPure EOF ;
    public final EObject entryRuleFunctionBodyPure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionBodyPure = null;


        try {
            // InternalFPML.g:1570:57: (iv_ruleFunctionBodyPure= ruleFunctionBodyPure EOF )
            // InternalFPML.g:1571:2: iv_ruleFunctionBodyPure= ruleFunctionBodyPure EOF
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
    // InternalFPML.g:1577:1: ruleFunctionBodyPure returns [EObject current=null] : (this_EmptyFunctionBody_0= ruleEmptyFunctionBody | this_CompositionFunctionBodyPure_1= ruleCompositionFunctionBodyPure ) ;
    public final EObject ruleFunctionBodyPure() throws RecognitionException {
        EObject current = null;

        EObject this_EmptyFunctionBody_0 = null;

        EObject this_CompositionFunctionBodyPure_1 = null;



        	enterRule();

        try {
            // InternalFPML.g:1583:2: ( (this_EmptyFunctionBody_0= ruleEmptyFunctionBody | this_CompositionFunctionBodyPure_1= ruleCompositionFunctionBodyPure ) )
            // InternalFPML.g:1584:2: (this_EmptyFunctionBody_0= ruleEmptyFunctionBody | this_CompositionFunctionBodyPure_1= ruleCompositionFunctionBodyPure )
            {
            // InternalFPML.g:1584:2: (this_EmptyFunctionBody_0= ruleEmptyFunctionBody | this_CompositionFunctionBodyPure_1= ruleCompositionFunctionBodyPure )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ID||(LA13_0>=39 && LA13_0<=40)||(LA13_0>=44 && LA13_0<=48)) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalFPML.g:1585:3: this_EmptyFunctionBody_0= ruleEmptyFunctionBody
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
                    // InternalFPML.g:1594:3: this_CompositionFunctionBodyPure_1= ruleCompositionFunctionBodyPure
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
    // InternalFPML.g:1606:1: entryRuleFunctionBodyEffectFull returns [EObject current=null] : iv_ruleFunctionBodyEffectFull= ruleFunctionBodyEffectFull EOF ;
    public final EObject entryRuleFunctionBodyEffectFull() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionBodyEffectFull = null;


        try {
            // InternalFPML.g:1606:63: (iv_ruleFunctionBodyEffectFull= ruleFunctionBodyEffectFull EOF )
            // InternalFPML.g:1607:2: iv_ruleFunctionBodyEffectFull= ruleFunctionBodyEffectFull EOF
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
    // InternalFPML.g:1613:1: ruleFunctionBodyEffectFull returns [EObject current=null] : (this_EmptyFunctionBody_0= ruleEmptyFunctionBody | this_CompositionFunctionBodyEffect_1= ruleCompositionFunctionBodyEffect ) ;
    public final EObject ruleFunctionBodyEffectFull() throws RecognitionException {
        EObject current = null;

        EObject this_EmptyFunctionBody_0 = null;

        EObject this_CompositionFunctionBodyEffect_1 = null;



        	enterRule();

        try {
            // InternalFPML.g:1619:2: ( (this_EmptyFunctionBody_0= ruleEmptyFunctionBody | this_CompositionFunctionBodyEffect_1= ruleCompositionFunctionBodyEffect ) )
            // InternalFPML.g:1620:2: (this_EmptyFunctionBody_0= ruleEmptyFunctionBody | this_CompositionFunctionBodyEffect_1= ruleCompositionFunctionBodyEffect )
            {
            // InternalFPML.g:1620:2: (this_EmptyFunctionBody_0= ruleEmptyFunctionBody | this_CompositionFunctionBodyEffect_1= ruleCompositionFunctionBodyEffect )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_ID||(LA14_0>=39 && LA14_0<=40)||(LA14_0>=44 && LA14_0<=53)) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalFPML.g:1621:3: this_EmptyFunctionBody_0= ruleEmptyFunctionBody
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
                    // InternalFPML.g:1630:3: this_CompositionFunctionBodyEffect_1= ruleCompositionFunctionBodyEffect
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
    // InternalFPML.g:1642:1: entryRuleEmptyFunctionBody returns [EObject current=null] : iv_ruleEmptyFunctionBody= ruleEmptyFunctionBody EOF ;
    public final EObject entryRuleEmptyFunctionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmptyFunctionBody = null;


        try {
            // InternalFPML.g:1642:58: (iv_ruleEmptyFunctionBody= ruleEmptyFunctionBody EOF )
            // InternalFPML.g:1643:2: iv_ruleEmptyFunctionBody= ruleEmptyFunctionBody EOF
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
    // InternalFPML.g:1649:1: ruleEmptyFunctionBody returns [EObject current=null] : ( () otherlv_1= 'Undefined' ) ;
    public final EObject ruleEmptyFunctionBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFPML.g:1655:2: ( ( () otherlv_1= 'Undefined' ) )
            // InternalFPML.g:1656:2: ( () otherlv_1= 'Undefined' )
            {
            // InternalFPML.g:1656:2: ( () otherlv_1= 'Undefined' )
            // InternalFPML.g:1657:3: () otherlv_1= 'Undefined'
            {
            // InternalFPML.g:1657:3: ()
            // InternalFPML.g:1658:4: 
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
    // InternalFPML.g:1672:1: entryRuleCompositionFunctionBodyPure returns [EObject current=null] : iv_ruleCompositionFunctionBodyPure= ruleCompositionFunctionBodyPure EOF ;
    public final EObject entryRuleCompositionFunctionBodyPure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositionFunctionBodyPure = null;


        try {
            // InternalFPML.g:1672:68: (iv_ruleCompositionFunctionBodyPure= ruleCompositionFunctionBodyPure EOF )
            // InternalFPML.g:1673:2: iv_ruleCompositionFunctionBodyPure= ruleCompositionFunctionBodyPure EOF
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
    // InternalFPML.g:1679:1: ruleCompositionFunctionBodyPure returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_functionChain_1_0= ruleCompositionFunctionBodyPureFactor ) )+ ) | ( ( (lv_primitiveElement_2_0= rulePrimitivePureFunction ) ) ( (lv_functionChain_3_0= ruleCompositionFunctionBodyPureFactor ) )+ ) ) ;
    public final EObject ruleCompositionFunctionBodyPure() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_functionChain_1_0 = null;

        EObject lv_primitiveElement_2_0 = null;

        EObject lv_functionChain_3_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:1685:2: ( ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_functionChain_1_0= ruleCompositionFunctionBodyPureFactor ) )+ ) | ( ( (lv_primitiveElement_2_0= rulePrimitivePureFunction ) ) ( (lv_functionChain_3_0= ruleCompositionFunctionBodyPureFactor ) )+ ) ) )
            // InternalFPML.g:1686:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_functionChain_1_0= ruleCompositionFunctionBodyPureFactor ) )+ ) | ( ( (lv_primitiveElement_2_0= rulePrimitivePureFunction ) ) ( (lv_functionChain_3_0= ruleCompositionFunctionBodyPureFactor ) )+ ) )
            {
            // InternalFPML.g:1686:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_functionChain_1_0= ruleCompositionFunctionBodyPureFactor ) )+ ) | ( ( (lv_primitiveElement_2_0= rulePrimitivePureFunction ) ) ( (lv_functionChain_3_0= ruleCompositionFunctionBodyPureFactor ) )+ ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                alt17=1;
            }
            else if ( ((LA17_0>=39 && LA17_0<=40)||(LA17_0>=44 && LA17_0<=48)) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalFPML.g:1687:3: ( ( (otherlv_0= RULE_ID ) ) ( (lv_functionChain_1_0= ruleCompositionFunctionBodyPureFactor ) )+ )
                    {
                    // InternalFPML.g:1687:3: ( ( (otherlv_0= RULE_ID ) ) ( (lv_functionChain_1_0= ruleCompositionFunctionBodyPureFactor ) )+ )
                    // InternalFPML.g:1688:4: ( (otherlv_0= RULE_ID ) ) ( (lv_functionChain_1_0= ruleCompositionFunctionBodyPureFactor ) )+
                    {
                    // InternalFPML.g:1688:4: ( (otherlv_0= RULE_ID ) )
                    // InternalFPML.g:1689:5: (otherlv_0= RULE_ID )
                    {
                    // InternalFPML.g:1689:5: (otherlv_0= RULE_ID )
                    // InternalFPML.g:1690:6: otherlv_0= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCompositionFunctionBodyPureRule());
                    						}
                    					
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_27); 

                    						newLeafNode(otherlv_0, grammarAccess.getCompositionFunctionBodyPureAccess().getReferenceElementPureFunctionDefinitionCrossReference_0_0_0());
                    					

                    }


                    }

                    // InternalFPML.g:1701:4: ( (lv_functionChain_1_0= ruleCompositionFunctionBodyPureFactor ) )+
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
                    	    // InternalFPML.g:1702:5: (lv_functionChain_1_0= ruleCompositionFunctionBodyPureFactor )
                    	    {
                    	    // InternalFPML.g:1702:5: (lv_functionChain_1_0= ruleCompositionFunctionBodyPureFactor )
                    	    // InternalFPML.g:1703:6: lv_functionChain_1_0= ruleCompositionFunctionBodyPureFactor
                    	    {

                    	    						newCompositeNode(grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainCompositionFunctionBodyPureFactorParserRuleCall_0_1_0());
                    	    					
                    	    pushFollow(FOLLOW_28);
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
                    // InternalFPML.g:1722:3: ( ( (lv_primitiveElement_2_0= rulePrimitivePureFunction ) ) ( (lv_functionChain_3_0= ruleCompositionFunctionBodyPureFactor ) )+ )
                    {
                    // InternalFPML.g:1722:3: ( ( (lv_primitiveElement_2_0= rulePrimitivePureFunction ) ) ( (lv_functionChain_3_0= ruleCompositionFunctionBodyPureFactor ) )+ )
                    // InternalFPML.g:1723:4: ( (lv_primitiveElement_2_0= rulePrimitivePureFunction ) ) ( (lv_functionChain_3_0= ruleCompositionFunctionBodyPureFactor ) )+
                    {
                    // InternalFPML.g:1723:4: ( (lv_primitiveElement_2_0= rulePrimitivePureFunction ) )
                    // InternalFPML.g:1724:5: (lv_primitiveElement_2_0= rulePrimitivePureFunction )
                    {
                    // InternalFPML.g:1724:5: (lv_primitiveElement_2_0= rulePrimitivePureFunction )
                    // InternalFPML.g:1725:6: lv_primitiveElement_2_0= rulePrimitivePureFunction
                    {

                    						newCompositeNode(grammarAccess.getCompositionFunctionBodyPureAccess().getPrimitiveElementPrimitivePureFunctionParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_27);
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

                    // InternalFPML.g:1742:4: ( (lv_functionChain_3_0= ruleCompositionFunctionBodyPureFactor ) )+
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
                    	    // InternalFPML.g:1743:5: (lv_functionChain_3_0= ruleCompositionFunctionBodyPureFactor )
                    	    {
                    	    // InternalFPML.g:1743:5: (lv_functionChain_3_0= ruleCompositionFunctionBodyPureFactor )
                    	    // InternalFPML.g:1744:6: lv_functionChain_3_0= ruleCompositionFunctionBodyPureFactor
                    	    {

                    	    						newCompositeNode(grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainCompositionFunctionBodyPureFactorParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_28);
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
    // InternalFPML.g:1766:1: entryRuleCompositionFunctionBodyPureFactor returns [EObject current=null] : iv_ruleCompositionFunctionBodyPureFactor= ruleCompositionFunctionBodyPureFactor EOF ;
    public final EObject entryRuleCompositionFunctionBodyPureFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositionFunctionBodyPureFactor = null;


        try {
            // InternalFPML.g:1766:74: (iv_ruleCompositionFunctionBodyPureFactor= ruleCompositionFunctionBodyPureFactor EOF )
            // InternalFPML.g:1767:2: iv_ruleCompositionFunctionBodyPureFactor= ruleCompositionFunctionBodyPureFactor EOF
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
    // InternalFPML.g:1773:1: ruleCompositionFunctionBodyPureFactor returns [EObject current=null] : ( (otherlv_0= '|>' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= '|>' ( (lv_PrimitiveElement_3_0= rulePrimitivePureFunction ) ) ) ) ;
    public final EObject ruleCompositionFunctionBodyPureFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_PrimitiveElement_3_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:1779:2: ( ( (otherlv_0= '|>' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= '|>' ( (lv_PrimitiveElement_3_0= rulePrimitivePureFunction ) ) ) ) )
            // InternalFPML.g:1780:2: ( (otherlv_0= '|>' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= '|>' ( (lv_PrimitiveElement_3_0= rulePrimitivePureFunction ) ) ) )
            {
            // InternalFPML.g:1780:2: ( (otherlv_0= '|>' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= '|>' ( (lv_PrimitiveElement_3_0= rulePrimitivePureFunction ) ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==26) ) {
                int LA18_1 = input.LA(2);

                if ( ((LA18_1>=39 && LA18_1<=40)||(LA18_1>=44 && LA18_1<=48)) ) {
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
                    // InternalFPML.g:1781:3: (otherlv_0= '|>' ( (otherlv_1= RULE_ID ) ) )
                    {
                    // InternalFPML.g:1781:3: (otherlv_0= '|>' ( (otherlv_1= RULE_ID ) ) )
                    // InternalFPML.g:1782:4: otherlv_0= '|>' ( (otherlv_1= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,26,FOLLOW_17); 

                    				newLeafNode(otherlv_0, grammarAccess.getCompositionFunctionBodyPureFactorAccess().getVerticalLineGreaterThanSignKeyword_0_0());
                    			
                    // InternalFPML.g:1786:4: ( (otherlv_1= RULE_ID ) )
                    // InternalFPML.g:1787:5: (otherlv_1= RULE_ID )
                    {
                    // InternalFPML.g:1787:5: (otherlv_1= RULE_ID )
                    // InternalFPML.g:1788:6: otherlv_1= RULE_ID
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
                    // InternalFPML.g:1801:3: (otherlv_2= '|>' ( (lv_PrimitiveElement_3_0= rulePrimitivePureFunction ) ) )
                    {
                    // InternalFPML.g:1801:3: (otherlv_2= '|>' ( (lv_PrimitiveElement_3_0= rulePrimitivePureFunction ) ) )
                    // InternalFPML.g:1802:4: otherlv_2= '|>' ( (lv_PrimitiveElement_3_0= rulePrimitivePureFunction ) )
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_29); 

                    				newLeafNode(otherlv_2, grammarAccess.getCompositionFunctionBodyPureFactorAccess().getVerticalLineGreaterThanSignKeyword_1_0());
                    			
                    // InternalFPML.g:1806:4: ( (lv_PrimitiveElement_3_0= rulePrimitivePureFunction ) )
                    // InternalFPML.g:1807:5: (lv_PrimitiveElement_3_0= rulePrimitivePureFunction )
                    {
                    // InternalFPML.g:1807:5: (lv_PrimitiveElement_3_0= rulePrimitivePureFunction )
                    // InternalFPML.g:1808:6: lv_PrimitiveElement_3_0= rulePrimitivePureFunction
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
    // InternalFPML.g:1830:1: entryRuleCompositionFunctionBodyEffect returns [EObject current=null] : iv_ruleCompositionFunctionBodyEffect= ruleCompositionFunctionBodyEffect EOF ;
    public final EObject entryRuleCompositionFunctionBodyEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositionFunctionBodyEffect = null;


        try {
            // InternalFPML.g:1830:70: (iv_ruleCompositionFunctionBodyEffect= ruleCompositionFunctionBodyEffect EOF )
            // InternalFPML.g:1831:2: iv_ruleCompositionFunctionBodyEffect= ruleCompositionFunctionBodyEffect EOF
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
    // InternalFPML.g:1837:1: ruleCompositionFunctionBodyEffect returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_functionChain_1_0= ruleCompositionFunctionBodyEffectFullFactor ) )+ ) | ( ( (lv_primitiveElement_2_0= rulePrimitiveFunction ) ) ( (lv_functionChain_3_0= ruleCompositionFunctionBodyEffectFullFactor ) )+ ) ) ;
    public final EObject ruleCompositionFunctionBodyEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_functionChain_1_0 = null;

        EObject lv_primitiveElement_2_0 = null;

        EObject lv_functionChain_3_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:1843:2: ( ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_functionChain_1_0= ruleCompositionFunctionBodyEffectFullFactor ) )+ ) | ( ( (lv_primitiveElement_2_0= rulePrimitiveFunction ) ) ( (lv_functionChain_3_0= ruleCompositionFunctionBodyEffectFullFactor ) )+ ) ) )
            // InternalFPML.g:1844:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_functionChain_1_0= ruleCompositionFunctionBodyEffectFullFactor ) )+ ) | ( ( (lv_primitiveElement_2_0= rulePrimitiveFunction ) ) ( (lv_functionChain_3_0= ruleCompositionFunctionBodyEffectFullFactor ) )+ ) )
            {
            // InternalFPML.g:1844:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_functionChain_1_0= ruleCompositionFunctionBodyEffectFullFactor ) )+ ) | ( ( (lv_primitiveElement_2_0= rulePrimitiveFunction ) ) ( (lv_functionChain_3_0= ruleCompositionFunctionBodyEffectFullFactor ) )+ ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            else if ( ((LA21_0>=39 && LA21_0<=40)||(LA21_0>=44 && LA21_0<=53)) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalFPML.g:1845:3: ( ( (otherlv_0= RULE_ID ) ) ( (lv_functionChain_1_0= ruleCompositionFunctionBodyEffectFullFactor ) )+ )
                    {
                    // InternalFPML.g:1845:3: ( ( (otherlv_0= RULE_ID ) ) ( (lv_functionChain_1_0= ruleCompositionFunctionBodyEffectFullFactor ) )+ )
                    // InternalFPML.g:1846:4: ( (otherlv_0= RULE_ID ) ) ( (lv_functionChain_1_0= ruleCompositionFunctionBodyEffectFullFactor ) )+
                    {
                    // InternalFPML.g:1846:4: ( (otherlv_0= RULE_ID ) )
                    // InternalFPML.g:1847:5: (otherlv_0= RULE_ID )
                    {
                    // InternalFPML.g:1847:5: (otherlv_0= RULE_ID )
                    // InternalFPML.g:1848:6: otherlv_0= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCompositionFunctionBodyEffectRule());
                    						}
                    					
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_30); 

                    						newLeafNode(otherlv_0, grammarAccess.getCompositionFunctionBodyEffectAccess().getReferenceElementEffectFullReferenceCrossReference_0_0_0());
                    					

                    }


                    }

                    // InternalFPML.g:1859:4: ( (lv_functionChain_1_0= ruleCompositionFunctionBodyEffectFullFactor ) )+
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
                    	    // InternalFPML.g:1860:5: (lv_functionChain_1_0= ruleCompositionFunctionBodyEffectFullFactor )
                    	    {
                    	    // InternalFPML.g:1860:5: (lv_functionChain_1_0= ruleCompositionFunctionBodyEffectFullFactor )
                    	    // InternalFPML.g:1861:6: lv_functionChain_1_0= ruleCompositionFunctionBodyEffectFullFactor
                    	    {

                    	    						newCompositeNode(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainCompositionFunctionBodyEffectFullFactorParserRuleCall_0_1_0());
                    	    					
                    	    pushFollow(FOLLOW_31);
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
                    // InternalFPML.g:1880:3: ( ( (lv_primitiveElement_2_0= rulePrimitiveFunction ) ) ( (lv_functionChain_3_0= ruleCompositionFunctionBodyEffectFullFactor ) )+ )
                    {
                    // InternalFPML.g:1880:3: ( ( (lv_primitiveElement_2_0= rulePrimitiveFunction ) ) ( (lv_functionChain_3_0= ruleCompositionFunctionBodyEffectFullFactor ) )+ )
                    // InternalFPML.g:1881:4: ( (lv_primitiveElement_2_0= rulePrimitiveFunction ) ) ( (lv_functionChain_3_0= ruleCompositionFunctionBodyEffectFullFactor ) )+
                    {
                    // InternalFPML.g:1881:4: ( (lv_primitiveElement_2_0= rulePrimitiveFunction ) )
                    // InternalFPML.g:1882:5: (lv_primitiveElement_2_0= rulePrimitiveFunction )
                    {
                    // InternalFPML.g:1882:5: (lv_primitiveElement_2_0= rulePrimitiveFunction )
                    // InternalFPML.g:1883:6: lv_primitiveElement_2_0= rulePrimitiveFunction
                    {

                    						newCompositeNode(grammarAccess.getCompositionFunctionBodyEffectAccess().getPrimitiveElementPrimitiveFunctionParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    // InternalFPML.g:1900:4: ( (lv_functionChain_3_0= ruleCompositionFunctionBodyEffectFullFactor ) )+
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
                    	    // InternalFPML.g:1901:5: (lv_functionChain_3_0= ruleCompositionFunctionBodyEffectFullFactor )
                    	    {
                    	    // InternalFPML.g:1901:5: (lv_functionChain_3_0= ruleCompositionFunctionBodyEffectFullFactor )
                    	    // InternalFPML.g:1902:6: lv_functionChain_3_0= ruleCompositionFunctionBodyEffectFullFactor
                    	    {

                    	    						newCompositeNode(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainCompositionFunctionBodyEffectFullFactorParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_31);
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
    // InternalFPML.g:1924:1: entryRuleCompositionFunctionBodyEffectFullFactor returns [EObject current=null] : iv_ruleCompositionFunctionBodyEffectFullFactor= ruleCompositionFunctionBodyEffectFullFactor EOF ;
    public final EObject entryRuleCompositionFunctionBodyEffectFullFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositionFunctionBodyEffectFullFactor = null;


        try {
            // InternalFPML.g:1924:80: (iv_ruleCompositionFunctionBodyEffectFullFactor= ruleCompositionFunctionBodyEffectFullFactor EOF )
            // InternalFPML.g:1925:2: iv_ruleCompositionFunctionBodyEffectFullFactor= ruleCompositionFunctionBodyEffectFullFactor EOF
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
    // InternalFPML.g:1931:1: ruleCompositionFunctionBodyEffectFullFactor returns [EObject current=null] : ( (otherlv_0= '>>=' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= '>>=' ( (lv_PrimitiveElement_3_0= rulePrimitiveFunction ) ) ) ) ;
    public final EObject ruleCompositionFunctionBodyEffectFullFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_PrimitiveElement_3_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:1937:2: ( ( (otherlv_0= '>>=' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= '>>=' ( (lv_PrimitiveElement_3_0= rulePrimitiveFunction ) ) ) ) )
            // InternalFPML.g:1938:2: ( (otherlv_0= '>>=' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= '>>=' ( (lv_PrimitiveElement_3_0= rulePrimitiveFunction ) ) ) )
            {
            // InternalFPML.g:1938:2: ( (otherlv_0= '>>=' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= '>>=' ( (lv_PrimitiveElement_3_0= rulePrimitiveFunction ) ) ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==27) ) {
                int LA22_1 = input.LA(2);

                if ( ((LA22_1>=39 && LA22_1<=40)||(LA22_1>=44 && LA22_1<=53)) ) {
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
                    // InternalFPML.g:1939:3: (otherlv_0= '>>=' ( (otherlv_1= RULE_ID ) ) )
                    {
                    // InternalFPML.g:1939:3: (otherlv_0= '>>=' ( (otherlv_1= RULE_ID ) ) )
                    // InternalFPML.g:1940:4: otherlv_0= '>>=' ( (otherlv_1= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,27,FOLLOW_17); 

                    				newLeafNode(otherlv_0, grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getGreaterThanSignGreaterThanSignEqualsSignKeyword_0_0());
                    			
                    // InternalFPML.g:1944:4: ( (otherlv_1= RULE_ID ) )
                    // InternalFPML.g:1945:5: (otherlv_1= RULE_ID )
                    {
                    // InternalFPML.g:1945:5: (otherlv_1= RULE_ID )
                    // InternalFPML.g:1946:6: otherlv_1= RULE_ID
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
                    // InternalFPML.g:1959:3: (otherlv_2= '>>=' ( (lv_PrimitiveElement_3_0= rulePrimitiveFunction ) ) )
                    {
                    // InternalFPML.g:1959:3: (otherlv_2= '>>=' ( (lv_PrimitiveElement_3_0= rulePrimitiveFunction ) ) )
                    // InternalFPML.g:1960:4: otherlv_2= '>>=' ( (lv_PrimitiveElement_3_0= rulePrimitiveFunction ) )
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_24); 

                    				newLeafNode(otherlv_2, grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getGreaterThanSignGreaterThanSignEqualsSignKeyword_1_0());
                    			
                    // InternalFPML.g:1964:4: ( (lv_PrimitiveElement_3_0= rulePrimitiveFunction ) )
                    // InternalFPML.g:1965:5: (lv_PrimitiveElement_3_0= rulePrimitiveFunction )
                    {
                    // InternalFPML.g:1965:5: (lv_PrimitiveElement_3_0= rulePrimitiveFunction )
                    // InternalFPML.g:1966:6: lv_PrimitiveElement_3_0= rulePrimitiveFunction
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
    // InternalFPML.g:1988:1: entryRuleIOType returns [EObject current=null] : iv_ruleIOType= ruleIOType EOF ;
    public final EObject entryRuleIOType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIOType = null;


        try {
            // InternalFPML.g:1988:47: (iv_ruleIOType= ruleIOType EOF )
            // InternalFPML.g:1989:2: iv_ruleIOType= ruleIOType EOF
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
    // InternalFPML.g:1995:1: ruleIOType returns [EObject current=null] : (otherlv_0= 'IO' ( (lv_type_1_0= ruleType ) ) ) ;
    public final EObject ruleIOType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:2001:2: ( (otherlv_0= 'IO' ( (lv_type_1_0= ruleType ) ) ) )
            // InternalFPML.g:2002:2: (otherlv_0= 'IO' ( (lv_type_1_0= ruleType ) ) )
            {
            // InternalFPML.g:2002:2: (otherlv_0= 'IO' ( (lv_type_1_0= ruleType ) ) )
            // InternalFPML.g:2003:3: otherlv_0= 'IO' ( (lv_type_1_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getIOTypeAccess().getIOKeyword_0());
            		
            // InternalFPML.g:2007:3: ( (lv_type_1_0= ruleType ) )
            // InternalFPML.g:2008:4: (lv_type_1_0= ruleType )
            {
            // InternalFPML.g:2008:4: (lv_type_1_0= ruleType )
            // InternalFPML.g:2009:5: lv_type_1_0= ruleType
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
    // InternalFPML.g:2030:1: entryRuleValueType returns [EObject current=null] : iv_ruleValueType= ruleValueType EOF ;
    public final EObject entryRuleValueType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueType = null;


        try {
            // InternalFPML.g:2030:50: (iv_ruleValueType= ruleValueType EOF )
            // InternalFPML.g:2031:2: iv_ruleValueType= ruleValueType EOF
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
    // InternalFPML.g:2037:1: ruleValueType returns [EObject current=null] : (this_IntegerType_0= ruleIntegerType | this_StringType_1= ruleStringType | this_DataType_2= ruleDataType | this_PureFunctionType_3= rulePureFunctionType | this_PureAlgebraicType_4= rulePureAlgebraicType ) ;
    public final EObject ruleValueType() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerType_0 = null;

        EObject this_StringType_1 = null;

        EObject this_DataType_2 = null;

        EObject this_PureFunctionType_3 = null;

        EObject this_PureAlgebraicType_4 = null;



        	enterRule();

        try {
            // InternalFPML.g:2043:2: ( (this_IntegerType_0= ruleIntegerType | this_StringType_1= ruleStringType | this_DataType_2= ruleDataType | this_PureFunctionType_3= rulePureFunctionType | this_PureAlgebraicType_4= rulePureAlgebraicType ) )
            // InternalFPML.g:2044:2: (this_IntegerType_0= ruleIntegerType | this_StringType_1= ruleStringType | this_DataType_2= ruleDataType | this_PureFunctionType_3= rulePureFunctionType | this_PureAlgebraicType_4= rulePureAlgebraicType )
            {
            // InternalFPML.g:2044:2: (this_IntegerType_0= ruleIntegerType | this_StringType_1= ruleStringType | this_DataType_2= ruleDataType | this_PureFunctionType_3= rulePureFunctionType | this_PureAlgebraicType_4= rulePureAlgebraicType )
            int alt23=5;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalFPML.g:2045:3: this_IntegerType_0= ruleIntegerType
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
                    // InternalFPML.g:2054:3: this_StringType_1= ruleStringType
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
                    // InternalFPML.g:2063:3: this_DataType_2= ruleDataType
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
                    // InternalFPML.g:2072:3: this_PureFunctionType_3= rulePureFunctionType
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
                    // InternalFPML.g:2081:3: this_PureAlgebraicType_4= rulePureAlgebraicType
                    {

                    			newCompositeNode(grammarAccess.getValueTypeAccess().getPureAlgebraicTypeParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_PureAlgebraicType_4=rulePureAlgebraicType();

                    state._fsp--;


                    			current = this_PureAlgebraicType_4;
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
    // InternalFPML.g:2093:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalFPML.g:2093:45: (iv_ruleType= ruleType EOF )
            // InternalFPML.g:2094:2: iv_ruleType= ruleType EOF
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
    // InternalFPML.g:2100:1: ruleType returns [EObject current=null] : (this_ValueType_0= ruleValueType | this_EffectFullType_1= ruleEffectFullType ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_ValueType_0 = null;

        EObject this_EffectFullType_1 = null;



        	enterRule();

        try {
            // InternalFPML.g:2106:2: ( (this_ValueType_0= ruleValueType | this_EffectFullType_1= ruleEffectFullType ) )
            // InternalFPML.g:2107:2: (this_ValueType_0= ruleValueType | this_EffectFullType_1= ruleEffectFullType )
            {
            // InternalFPML.g:2107:2: (this_ValueType_0= ruleValueType | this_EffectFullType_1= ruleEffectFullType )
            int alt24=2;
            switch ( input.LA(1) ) {
            case 28:
            case 29:
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
                else if ( ((LA24_2>=28 && LA24_2<=29)||LA24_2==31||LA24_2==33||LA24_2==37) ) {
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
            case 22:
            case 23:
            case 27:
            case 30:
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
                    // InternalFPML.g:2108:3: this_ValueType_0= ruleValueType
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
                    // InternalFPML.g:2117:3: this_EffectFullType_1= ruleEffectFullType
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
    // InternalFPML.g:2129:1: entryRuleEffectFullType returns [EObject current=null] : iv_ruleEffectFullType= ruleEffectFullType EOF ;
    public final EObject entryRuleEffectFullType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullType = null;


        try {
            // InternalFPML.g:2129:55: (iv_ruleEffectFullType= ruleEffectFullType EOF )
            // InternalFPML.g:2130:2: iv_ruleEffectFullType= ruleEffectFullType EOF
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
    // InternalFPML.g:2136:1: ruleEffectFullType returns [EObject current=null] : (this_UnitType_0= ruleUnitType | this_EffectFullFunctionType_1= ruleEffectFullFunctionType | this_EffectFullDataType_2= ruleEffectFullDataType | this_EffectFullAlgebraicType_3= ruleEffectFullAlgebraicType | this_IOType_4= ruleIOType | this_VoidType_5= ruleVoidType ) ;
    public final EObject ruleEffectFullType() throws RecognitionException {
        EObject current = null;

        EObject this_UnitType_0 = null;

        EObject this_EffectFullFunctionType_1 = null;

        EObject this_EffectFullDataType_2 = null;

        EObject this_EffectFullAlgebraicType_3 = null;

        EObject this_IOType_4 = null;

        EObject this_VoidType_5 = null;



        	enterRule();

        try {
            // InternalFPML.g:2142:2: ( (this_UnitType_0= ruleUnitType | this_EffectFullFunctionType_1= ruleEffectFullFunctionType | this_EffectFullDataType_2= ruleEffectFullDataType | this_EffectFullAlgebraicType_3= ruleEffectFullAlgebraicType | this_IOType_4= ruleIOType | this_VoidType_5= ruleVoidType ) )
            // InternalFPML.g:2143:2: (this_UnitType_0= ruleUnitType | this_EffectFullFunctionType_1= ruleEffectFullFunctionType | this_EffectFullDataType_2= ruleEffectFullDataType | this_EffectFullAlgebraicType_3= ruleEffectFullAlgebraicType | this_IOType_4= ruleIOType | this_VoidType_5= ruleVoidType )
            {
            // InternalFPML.g:2143:2: (this_UnitType_0= ruleUnitType | this_EffectFullFunctionType_1= ruleEffectFullFunctionType | this_EffectFullDataType_2= ruleEffectFullDataType | this_EffectFullAlgebraicType_3= ruleEffectFullAlgebraicType | this_IOType_4= ruleIOType | this_VoidType_5= ruleVoidType )
            int alt25=6;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt25=1;
                }
                break;
            case 36:
                {
                alt25=2;
                }
                break;
            case 32:
                {
                alt25=3;
                }
                break;
            case 37:
                {
                alt25=4;
                }
                break;
            case 23:
                {
                alt25=5;
                }
                break;
            case EOF:
            case RULE_ID:
            case 13:
            case 16:
            case 21:
            case 22:
            case 27:
            case 35:
            case 38:
            case 39:
            case 40:
                {
                alt25=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalFPML.g:2144:3: this_UnitType_0= ruleUnitType
                    {

                    			newCompositeNode(grammarAccess.getEffectFullTypeAccess().getUnitTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_UnitType_0=ruleUnitType();

                    state._fsp--;


                    			current = this_UnitType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFPML.g:2153:3: this_EffectFullFunctionType_1= ruleEffectFullFunctionType
                    {

                    			newCompositeNode(grammarAccess.getEffectFullTypeAccess().getEffectFullFunctionTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EffectFullFunctionType_1=ruleEffectFullFunctionType();

                    state._fsp--;


                    			current = this_EffectFullFunctionType_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalFPML.g:2162:3: this_EffectFullDataType_2= ruleEffectFullDataType
                    {

                    			newCompositeNode(grammarAccess.getEffectFullTypeAccess().getEffectFullDataTypeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_EffectFullDataType_2=ruleEffectFullDataType();

                    state._fsp--;


                    			current = this_EffectFullDataType_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalFPML.g:2171:3: this_EffectFullAlgebraicType_3= ruleEffectFullAlgebraicType
                    {

                    			newCompositeNode(grammarAccess.getEffectFullTypeAccess().getEffectFullAlgebraicTypeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_EffectFullAlgebraicType_3=ruleEffectFullAlgebraicType();

                    state._fsp--;


                    			current = this_EffectFullAlgebraicType_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalFPML.g:2180:3: this_IOType_4= ruleIOType
                    {

                    			newCompositeNode(grammarAccess.getEffectFullTypeAccess().getIOTypeParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_IOType_4=ruleIOType();

                    state._fsp--;


                    			current = this_IOType_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalFPML.g:2189:3: this_VoidType_5= ruleVoidType
                    {

                    			newCompositeNode(grammarAccess.getEffectFullTypeAccess().getVoidTypeParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_VoidType_5=ruleVoidType();

                    state._fsp--;


                    			current = this_VoidType_5;
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
    // InternalFPML.g:2201:1: entryRuleVoidType returns [EObject current=null] : iv_ruleVoidType= ruleVoidType EOF ;
    public final EObject entryRuleVoidType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVoidType = null;


        try {
            // InternalFPML.g:2201:49: (iv_ruleVoidType= ruleVoidType EOF )
            // InternalFPML.g:2202:2: iv_ruleVoidType= ruleVoidType EOF
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
    // InternalFPML.g:2208:1: ruleVoidType returns [EObject current=null] : () ;
    public final EObject ruleVoidType() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalFPML.g:2214:2: ( () )
            // InternalFPML.g:2215:2: ()
            {
            // InternalFPML.g:2215:2: ()
            // InternalFPML.g:2216:3: 
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
    // InternalFPML.g:2225:1: entryRuleIntegerType returns [EObject current=null] : iv_ruleIntegerType= ruleIntegerType EOF ;
    public final EObject entryRuleIntegerType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerType = null;


        try {
            // InternalFPML.g:2225:52: (iv_ruleIntegerType= ruleIntegerType EOF )
            // InternalFPML.g:2226:2: iv_ruleIntegerType= ruleIntegerType EOF
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
    // InternalFPML.g:2232:1: ruleIntegerType returns [EObject current=null] : ( () ( (lv_type_1_0= 'int' ) ) ) ;
    public final EObject ruleIntegerType() throws RecognitionException {
        EObject current = null;

        Token lv_type_1_0=null;


        	enterRule();

        try {
            // InternalFPML.g:2238:2: ( ( () ( (lv_type_1_0= 'int' ) ) ) )
            // InternalFPML.g:2239:2: ( () ( (lv_type_1_0= 'int' ) ) )
            {
            // InternalFPML.g:2239:2: ( () ( (lv_type_1_0= 'int' ) ) )
            // InternalFPML.g:2240:3: () ( (lv_type_1_0= 'int' ) )
            {
            // InternalFPML.g:2240:3: ()
            // InternalFPML.g:2241:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntegerTypeAccess().getIntegerTypeAction_0(),
            					current);
            			

            }

            // InternalFPML.g:2247:3: ( (lv_type_1_0= 'int' ) )
            // InternalFPML.g:2248:4: (lv_type_1_0= 'int' )
            {
            // InternalFPML.g:2248:4: (lv_type_1_0= 'int' )
            // InternalFPML.g:2249:5: lv_type_1_0= 'int'
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
    // InternalFPML.g:2265:1: entryRuleStringType returns [EObject current=null] : iv_ruleStringType= ruleStringType EOF ;
    public final EObject entryRuleStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringType = null;


        try {
            // InternalFPML.g:2265:51: (iv_ruleStringType= ruleStringType EOF )
            // InternalFPML.g:2266:2: iv_ruleStringType= ruleStringType EOF
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
    // InternalFPML.g:2272:1: ruleStringType returns [EObject current=null] : ( () ( (lv_type_1_0= 'String' ) ) ) ;
    public final EObject ruleStringType() throws RecognitionException {
        EObject current = null;

        Token lv_type_1_0=null;


        	enterRule();

        try {
            // InternalFPML.g:2278:2: ( ( () ( (lv_type_1_0= 'String' ) ) ) )
            // InternalFPML.g:2279:2: ( () ( (lv_type_1_0= 'String' ) ) )
            {
            // InternalFPML.g:2279:2: ( () ( (lv_type_1_0= 'String' ) ) )
            // InternalFPML.g:2280:3: () ( (lv_type_1_0= 'String' ) )
            {
            // InternalFPML.g:2280:3: ()
            // InternalFPML.g:2281:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStringTypeAccess().getStringTypeAction_0(),
            					current);
            			

            }

            // InternalFPML.g:2287:3: ( (lv_type_1_0= 'String' ) )
            // InternalFPML.g:2288:4: (lv_type_1_0= 'String' )
            {
            // InternalFPML.g:2288:4: (lv_type_1_0= 'String' )
            // InternalFPML.g:2289:5: lv_type_1_0= 'String'
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
    // InternalFPML.g:2305:1: entryRuleUnitType returns [EObject current=null] : iv_ruleUnitType= ruleUnitType EOF ;
    public final EObject entryRuleUnitType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnitType = null;


        try {
            // InternalFPML.g:2305:49: (iv_ruleUnitType= ruleUnitType EOF )
            // InternalFPML.g:2306:2: iv_ruleUnitType= ruleUnitType EOF
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
    // InternalFPML.g:2312:1: ruleUnitType returns [EObject current=null] : ( () ( (lv_type_1_0= 'Unit' ) ) ) ;
    public final EObject ruleUnitType() throws RecognitionException {
        EObject current = null;

        Token lv_type_1_0=null;


        	enterRule();

        try {
            // InternalFPML.g:2318:2: ( ( () ( (lv_type_1_0= 'Unit' ) ) ) )
            // InternalFPML.g:2319:2: ( () ( (lv_type_1_0= 'Unit' ) ) )
            {
            // InternalFPML.g:2319:2: ( () ( (lv_type_1_0= 'Unit' ) ) )
            // InternalFPML.g:2320:3: () ( (lv_type_1_0= 'Unit' ) )
            {
            // InternalFPML.g:2320:3: ()
            // InternalFPML.g:2321:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUnitTypeAccess().getUnitTypeAction_0(),
            					current);
            			

            }

            // InternalFPML.g:2327:3: ( (lv_type_1_0= 'Unit' ) )
            // InternalFPML.g:2328:4: (lv_type_1_0= 'Unit' )
            {
            // InternalFPML.g:2328:4: (lv_type_1_0= 'Unit' )
            // InternalFPML.g:2329:5: lv_type_1_0= 'Unit'
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
    // InternalFPML.g:2345:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalFPML.g:2345:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalFPML.g:2346:2: iv_ruleDataType= ruleDataType EOF
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
    // InternalFPML.g:2352:1: ruleDataType returns [EObject current=null] : ( () otherlv_1= 'ref' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalFPML.g:2358:2: ( ( () otherlv_1= 'ref' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalFPML.g:2359:2: ( () otherlv_1= 'ref' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalFPML.g:2359:2: ( () otherlv_1= 'ref' ( (otherlv_2= RULE_ID ) ) )
            // InternalFPML.g:2360:3: () otherlv_1= 'ref' ( (otherlv_2= RULE_ID ) )
            {
            // InternalFPML.g:2360:3: ()
            // InternalFPML.g:2361:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDataTypeAccess().getDataTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getDataTypeAccess().getRefKeyword_1());
            		
            // InternalFPML.g:2371:3: ( (otherlv_2= RULE_ID ) )
            // InternalFPML.g:2372:4: (otherlv_2= RULE_ID )
            {
            // InternalFPML.g:2372:4: (otherlv_2= RULE_ID )
            // InternalFPML.g:2373:5: otherlv_2= RULE_ID
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
    // InternalFPML.g:2388:1: entryRuleEffectFullDataType returns [EObject current=null] : iv_ruleEffectFullDataType= ruleEffectFullDataType EOF ;
    public final EObject entryRuleEffectFullDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullDataType = null;


        try {
            // InternalFPML.g:2388:59: (iv_ruleEffectFullDataType= ruleEffectFullDataType EOF )
            // InternalFPML.g:2389:2: iv_ruleEffectFullDataType= ruleEffectFullDataType EOF
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
    // InternalFPML.g:2395:1: ruleEffectFullDataType returns [EObject current=null] : ( () otherlv_1= 'refIO' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleEffectFullDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalFPML.g:2401:2: ( ( () otherlv_1= 'refIO' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalFPML.g:2402:2: ( () otherlv_1= 'refIO' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalFPML.g:2402:2: ( () otherlv_1= 'refIO' ( (otherlv_2= RULE_ID ) ) )
            // InternalFPML.g:2403:3: () otherlv_1= 'refIO' ( (otherlv_2= RULE_ID ) )
            {
            // InternalFPML.g:2403:3: ()
            // InternalFPML.g:2404:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEffectFullDataTypeAccess().getEffectFullDataTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getEffectFullDataTypeAccess().getRefIOKeyword_1());
            		
            // InternalFPML.g:2414:3: ( (otherlv_2= RULE_ID ) )
            // InternalFPML.g:2415:4: (otherlv_2= RULE_ID )
            {
            // InternalFPML.g:2415:4: (otherlv_2= RULE_ID )
            // InternalFPML.g:2416:5: otherlv_2= RULE_ID
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
    // InternalFPML.g:2431:1: entryRulePureFunctionType returns [EObject current=null] : iv_rulePureFunctionType= rulePureFunctionType EOF ;
    public final EObject entryRulePureFunctionType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePureFunctionType = null;


        try {
            // InternalFPML.g:2431:57: (iv_rulePureFunctionType= rulePureFunctionType EOF )
            // InternalFPML.g:2432:2: iv_rulePureFunctionType= rulePureFunctionType EOF
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
    // InternalFPML.g:2438:1: rulePureFunctionType returns [EObject current=null] : ( () otherlv_1= 'F' otherlv_2= '<' ( (lv_argType_3_0= ruleValueType ) ) otherlv_4= ',' ( (lv_returnType_5_0= ruleValueType ) ) otherlv_6= '>' ) ;
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
            // InternalFPML.g:2444:2: ( ( () otherlv_1= 'F' otherlv_2= '<' ( (lv_argType_3_0= ruleValueType ) ) otherlv_4= ',' ( (lv_returnType_5_0= ruleValueType ) ) otherlv_6= '>' ) )
            // InternalFPML.g:2445:2: ( () otherlv_1= 'F' otherlv_2= '<' ( (lv_argType_3_0= ruleValueType ) ) otherlv_4= ',' ( (lv_returnType_5_0= ruleValueType ) ) otherlv_6= '>' )
            {
            // InternalFPML.g:2445:2: ( () otherlv_1= 'F' otherlv_2= '<' ( (lv_argType_3_0= ruleValueType ) ) otherlv_4= ',' ( (lv_returnType_5_0= ruleValueType ) ) otherlv_6= '>' )
            // InternalFPML.g:2446:3: () otherlv_1= 'F' otherlv_2= '<' ( (lv_argType_3_0= ruleValueType ) ) otherlv_4= ',' ( (lv_returnType_5_0= ruleValueType ) ) otherlv_6= '>'
            {
            // InternalFPML.g:2446:3: ()
            // InternalFPML.g:2447:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPureFunctionTypeAccess().getPureFunctionTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getPureFunctionTypeAccess().getFKeyword_1());
            		
            otherlv_2=(Token)match(input,34,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getPureFunctionTypeAccess().getLessThanSignKeyword_2());
            		
            // InternalFPML.g:2461:3: ( (lv_argType_3_0= ruleValueType ) )
            // InternalFPML.g:2462:4: (lv_argType_3_0= ruleValueType )
            {
            // InternalFPML.g:2462:4: (lv_argType_3_0= ruleValueType )
            // InternalFPML.g:2463:5: lv_argType_3_0= ruleValueType
            {

            					newCompositeNode(grammarAccess.getPureFunctionTypeAccess().getArgTypeValueTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_33);
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
            		
            // InternalFPML.g:2484:3: ( (lv_returnType_5_0= ruleValueType ) )
            // InternalFPML.g:2485:4: (lv_returnType_5_0= ruleValueType )
            {
            // InternalFPML.g:2485:4: (lv_returnType_5_0= ruleValueType )
            // InternalFPML.g:2486:5: lv_returnType_5_0= ruleValueType
            {

            					newCompositeNode(grammarAccess.getPureFunctionTypeAccess().getReturnTypeValueTypeParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_34);
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
    // InternalFPML.g:2511:1: entryRuleEffectFullFunctionType returns [EObject current=null] : iv_ruleEffectFullFunctionType= ruleEffectFullFunctionType EOF ;
    public final EObject entryRuleEffectFullFunctionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullFunctionType = null;


        try {
            // InternalFPML.g:2511:63: (iv_ruleEffectFullFunctionType= ruleEffectFullFunctionType EOF )
            // InternalFPML.g:2512:2: iv_ruleEffectFullFunctionType= ruleEffectFullFunctionType EOF
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
    // InternalFPML.g:2518:1: ruleEffectFullFunctionType returns [EObject current=null] : ( () otherlv_1= 'FIO' otherlv_2= '<' ( (lv_argType_3_0= ruleType ) ) otherlv_4= ',' ( (lv_returnType_5_0= ruleIOType ) ) otherlv_6= '>' ) ;
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
            // InternalFPML.g:2524:2: ( ( () otherlv_1= 'FIO' otherlv_2= '<' ( (lv_argType_3_0= ruleType ) ) otherlv_4= ',' ( (lv_returnType_5_0= ruleIOType ) ) otherlv_6= '>' ) )
            // InternalFPML.g:2525:2: ( () otherlv_1= 'FIO' otherlv_2= '<' ( (lv_argType_3_0= ruleType ) ) otherlv_4= ',' ( (lv_returnType_5_0= ruleIOType ) ) otherlv_6= '>' )
            {
            // InternalFPML.g:2525:2: ( () otherlv_1= 'FIO' otherlv_2= '<' ( (lv_argType_3_0= ruleType ) ) otherlv_4= ',' ( (lv_returnType_5_0= ruleIOType ) ) otherlv_6= '>' )
            // InternalFPML.g:2526:3: () otherlv_1= 'FIO' otherlv_2= '<' ( (lv_argType_3_0= ruleType ) ) otherlv_4= ',' ( (lv_returnType_5_0= ruleIOType ) ) otherlv_6= '>'
            {
            // InternalFPML.g:2526:3: ()
            // InternalFPML.g:2527:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEffectFullFunctionTypeAccess().getEffectFullFunctionTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getEffectFullFunctionTypeAccess().getFIOKeyword_1());
            		
            otherlv_2=(Token)match(input,34,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getEffectFullFunctionTypeAccess().getLessThanSignKeyword_2());
            		
            // InternalFPML.g:2541:3: ( (lv_argType_3_0= ruleType ) )
            // InternalFPML.g:2542:4: (lv_argType_3_0= ruleType )
            {
            // InternalFPML.g:2542:4: (lv_argType_3_0= ruleType )
            // InternalFPML.g:2543:5: lv_argType_3_0= ruleType
            {

            					newCompositeNode(grammarAccess.getEffectFullFunctionTypeAccess().getArgTypeTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_33);
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
            		
            // InternalFPML.g:2564:3: ( (lv_returnType_5_0= ruleIOType ) )
            // InternalFPML.g:2565:4: (lv_returnType_5_0= ruleIOType )
            {
            // InternalFPML.g:2565:4: (lv_returnType_5_0= ruleIOType )
            // InternalFPML.g:2566:5: lv_returnType_5_0= ruleIOType
            {

            					newCompositeNode(grammarAccess.getEffectFullFunctionTypeAccess().getReturnTypeIOTypeParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_34);
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
    // InternalFPML.g:2591:1: entryRulePureAlgebraicType returns [EObject current=null] : iv_rulePureAlgebraicType= rulePureAlgebraicType EOF ;
    public final EObject entryRulePureAlgebraicType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePureAlgebraicType = null;


        try {
            // InternalFPML.g:2591:58: (iv_rulePureAlgebraicType= rulePureAlgebraicType EOF )
            // InternalFPML.g:2592:2: iv_rulePureAlgebraicType= rulePureAlgebraicType EOF
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
    // InternalFPML.g:2598:1: rulePureAlgebraicType returns [EObject current=null] : (otherlv_0= '[' ( (lv_pureAdtElement1_1_0= ruleValueType ) ) ( ( (lv_pureAdtElement2_2_1= rulePureSumTypeFactor | lv_pureAdtElement2_2_2= rulePureProdTypeFactor ) ) ) otherlv_3= ']' ) ;
    public final EObject rulePureAlgebraicType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_pureAdtElement1_1_0 = null;

        EObject lv_pureAdtElement2_2_1 = null;

        EObject lv_pureAdtElement2_2_2 = null;



        	enterRule();

        try {
            // InternalFPML.g:2604:2: ( (otherlv_0= '[' ( (lv_pureAdtElement1_1_0= ruleValueType ) ) ( ( (lv_pureAdtElement2_2_1= rulePureSumTypeFactor | lv_pureAdtElement2_2_2= rulePureProdTypeFactor ) ) ) otherlv_3= ']' ) )
            // InternalFPML.g:2605:2: (otherlv_0= '[' ( (lv_pureAdtElement1_1_0= ruleValueType ) ) ( ( (lv_pureAdtElement2_2_1= rulePureSumTypeFactor | lv_pureAdtElement2_2_2= rulePureProdTypeFactor ) ) ) otherlv_3= ']' )
            {
            // InternalFPML.g:2605:2: (otherlv_0= '[' ( (lv_pureAdtElement1_1_0= ruleValueType ) ) ( ( (lv_pureAdtElement2_2_1= rulePureSumTypeFactor | lv_pureAdtElement2_2_2= rulePureProdTypeFactor ) ) ) otherlv_3= ']' )
            // InternalFPML.g:2606:3: otherlv_0= '[' ( (lv_pureAdtElement1_1_0= ruleValueType ) ) ( ( (lv_pureAdtElement2_2_1= rulePureSumTypeFactor | lv_pureAdtElement2_2_2= rulePureProdTypeFactor ) ) ) otherlv_3= ']'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getPureAlgebraicTypeAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalFPML.g:2610:3: ( (lv_pureAdtElement1_1_0= ruleValueType ) )
            // InternalFPML.g:2611:4: (lv_pureAdtElement1_1_0= ruleValueType )
            {
            // InternalFPML.g:2611:4: (lv_pureAdtElement1_1_0= ruleValueType )
            // InternalFPML.g:2612:5: lv_pureAdtElement1_1_0= ruleValueType
            {

            					newCompositeNode(grammarAccess.getPureAlgebraicTypeAccess().getPureAdtElement1ValueTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_35);
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

            // InternalFPML.g:2629:3: ( ( (lv_pureAdtElement2_2_1= rulePureSumTypeFactor | lv_pureAdtElement2_2_2= rulePureProdTypeFactor ) ) )
            // InternalFPML.g:2630:4: ( (lv_pureAdtElement2_2_1= rulePureSumTypeFactor | lv_pureAdtElement2_2_2= rulePureProdTypeFactor ) )
            {
            // InternalFPML.g:2630:4: ( (lv_pureAdtElement2_2_1= rulePureSumTypeFactor | lv_pureAdtElement2_2_2= rulePureProdTypeFactor ) )
            // InternalFPML.g:2631:5: (lv_pureAdtElement2_2_1= rulePureSumTypeFactor | lv_pureAdtElement2_2_2= rulePureProdTypeFactor )
            {
            // InternalFPML.g:2631:5: (lv_pureAdtElement2_2_1= rulePureSumTypeFactor | lv_pureAdtElement2_2_2= rulePureProdTypeFactor )
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
                    // InternalFPML.g:2632:6: lv_pureAdtElement2_2_1= rulePureSumTypeFactor
                    {

                    						newCompositeNode(grammarAccess.getPureAlgebraicTypeAccess().getPureAdtElement2PureSumTypeFactorParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_36);
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
                    // InternalFPML.g:2648:6: lv_pureAdtElement2_2_2= rulePureProdTypeFactor
                    {

                    						newCompositeNode(grammarAccess.getPureAlgebraicTypeAccess().getPureAdtElement2PureProdTypeFactorParserRuleCall_2_0_1());
                    					
                    pushFollow(FOLLOW_36);
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
    // InternalFPML.g:2674:1: entryRulePureSumTypeFactor returns [EObject current=null] : iv_rulePureSumTypeFactor= rulePureSumTypeFactor EOF ;
    public final EObject entryRulePureSumTypeFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePureSumTypeFactor = null;


        try {
            // InternalFPML.g:2674:58: (iv_rulePureSumTypeFactor= rulePureSumTypeFactor EOF )
            // InternalFPML.g:2675:2: iv_rulePureSumTypeFactor= rulePureSumTypeFactor EOF
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
    // InternalFPML.g:2681:1: rulePureSumTypeFactor returns [EObject current=null] : (otherlv_0= '+' ( (lv_adtElement_1_0= ruleValueType ) ) ) ;
    public final EObject rulePureSumTypeFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_adtElement_1_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:2687:2: ( (otherlv_0= '+' ( (lv_adtElement_1_0= ruleValueType ) ) ) )
            // InternalFPML.g:2688:2: (otherlv_0= '+' ( (lv_adtElement_1_0= ruleValueType ) ) )
            {
            // InternalFPML.g:2688:2: (otherlv_0= '+' ( (lv_adtElement_1_0= ruleValueType ) ) )
            // InternalFPML.g:2689:3: otherlv_0= '+' ( (lv_adtElement_1_0= ruleValueType ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getPureSumTypeFactorAccess().getPlusSignKeyword_0());
            		
            // InternalFPML.g:2693:3: ( (lv_adtElement_1_0= ruleValueType ) )
            // InternalFPML.g:2694:4: (lv_adtElement_1_0= ruleValueType )
            {
            // InternalFPML.g:2694:4: (lv_adtElement_1_0= ruleValueType )
            // InternalFPML.g:2695:5: lv_adtElement_1_0= ruleValueType
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
    // InternalFPML.g:2716:1: entryRulePureProdTypeFactor returns [EObject current=null] : iv_rulePureProdTypeFactor= rulePureProdTypeFactor EOF ;
    public final EObject entryRulePureProdTypeFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePureProdTypeFactor = null;


        try {
            // InternalFPML.g:2716:59: (iv_rulePureProdTypeFactor= rulePureProdTypeFactor EOF )
            // InternalFPML.g:2717:2: iv_rulePureProdTypeFactor= rulePureProdTypeFactor EOF
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
    // InternalFPML.g:2723:1: rulePureProdTypeFactor returns [EObject current=null] : (otherlv_0= '*' ( (lv_adtElement_1_0= ruleValueType ) ) ) ;
    public final EObject rulePureProdTypeFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_adtElement_1_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:2729:2: ( (otherlv_0= '*' ( (lv_adtElement_1_0= ruleValueType ) ) ) )
            // InternalFPML.g:2730:2: (otherlv_0= '*' ( (lv_adtElement_1_0= ruleValueType ) ) )
            {
            // InternalFPML.g:2730:2: (otherlv_0= '*' ( (lv_adtElement_1_0= ruleValueType ) ) )
            // InternalFPML.g:2731:3: otherlv_0= '*' ( (lv_adtElement_1_0= ruleValueType ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getPureProdTypeFactorAccess().getAsteriskKeyword_0());
            		
            // InternalFPML.g:2735:3: ( (lv_adtElement_1_0= ruleValueType ) )
            // InternalFPML.g:2736:4: (lv_adtElement_1_0= ruleValueType )
            {
            // InternalFPML.g:2736:4: (lv_adtElement_1_0= ruleValueType )
            // InternalFPML.g:2737:5: lv_adtElement_1_0= ruleValueType
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
    // InternalFPML.g:2758:1: entryRuleEffectFullAlgebraicType returns [EObject current=null] : iv_ruleEffectFullAlgebraicType= ruleEffectFullAlgebraicType EOF ;
    public final EObject entryRuleEffectFullAlgebraicType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullAlgebraicType = null;


        try {
            // InternalFPML.g:2758:64: (iv_ruleEffectFullAlgebraicType= ruleEffectFullAlgebraicType EOF )
            // InternalFPML.g:2759:2: iv_ruleEffectFullAlgebraicType= ruleEffectFullAlgebraicType EOF
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
    // InternalFPML.g:2765:1: ruleEffectFullAlgebraicType returns [EObject current=null] : (otherlv_0= '[' ( (lv_effectFullAdtElement1_1_0= ruleIOType ) ) ( ( (lv_effectFullAdtElement2_2_1= ruleEffectFullSumTypeFactor | lv_effectFullAdtElement2_2_2= ruleEffectFullProdTypeFactor ) ) ) otherlv_3= ']' ) ;
    public final EObject ruleEffectFullAlgebraicType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_effectFullAdtElement1_1_0 = null;

        EObject lv_effectFullAdtElement2_2_1 = null;

        EObject lv_effectFullAdtElement2_2_2 = null;



        	enterRule();

        try {
            // InternalFPML.g:2771:2: ( (otherlv_0= '[' ( (lv_effectFullAdtElement1_1_0= ruleIOType ) ) ( ( (lv_effectFullAdtElement2_2_1= ruleEffectFullSumTypeFactor | lv_effectFullAdtElement2_2_2= ruleEffectFullProdTypeFactor ) ) ) otherlv_3= ']' ) )
            // InternalFPML.g:2772:2: (otherlv_0= '[' ( (lv_effectFullAdtElement1_1_0= ruleIOType ) ) ( ( (lv_effectFullAdtElement2_2_1= ruleEffectFullSumTypeFactor | lv_effectFullAdtElement2_2_2= ruleEffectFullProdTypeFactor ) ) ) otherlv_3= ']' )
            {
            // InternalFPML.g:2772:2: (otherlv_0= '[' ( (lv_effectFullAdtElement1_1_0= ruleIOType ) ) ( ( (lv_effectFullAdtElement2_2_1= ruleEffectFullSumTypeFactor | lv_effectFullAdtElement2_2_2= ruleEffectFullProdTypeFactor ) ) ) otherlv_3= ']' )
            // InternalFPML.g:2773:3: otherlv_0= '[' ( (lv_effectFullAdtElement1_1_0= ruleIOType ) ) ( ( (lv_effectFullAdtElement2_2_1= ruleEffectFullSumTypeFactor | lv_effectFullAdtElement2_2_2= ruleEffectFullProdTypeFactor ) ) ) otherlv_3= ']'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getEffectFullAlgebraicTypeAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalFPML.g:2777:3: ( (lv_effectFullAdtElement1_1_0= ruleIOType ) )
            // InternalFPML.g:2778:4: (lv_effectFullAdtElement1_1_0= ruleIOType )
            {
            // InternalFPML.g:2778:4: (lv_effectFullAdtElement1_1_0= ruleIOType )
            // InternalFPML.g:2779:5: lv_effectFullAdtElement1_1_0= ruleIOType
            {

            					newCompositeNode(grammarAccess.getEffectFullAlgebraicTypeAccess().getEffectFullAdtElement1IOTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_35);
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

            // InternalFPML.g:2796:3: ( ( (lv_effectFullAdtElement2_2_1= ruleEffectFullSumTypeFactor | lv_effectFullAdtElement2_2_2= ruleEffectFullProdTypeFactor ) ) )
            // InternalFPML.g:2797:4: ( (lv_effectFullAdtElement2_2_1= ruleEffectFullSumTypeFactor | lv_effectFullAdtElement2_2_2= ruleEffectFullProdTypeFactor ) )
            {
            // InternalFPML.g:2797:4: ( (lv_effectFullAdtElement2_2_1= ruleEffectFullSumTypeFactor | lv_effectFullAdtElement2_2_2= ruleEffectFullProdTypeFactor ) )
            // InternalFPML.g:2798:5: (lv_effectFullAdtElement2_2_1= ruleEffectFullSumTypeFactor | lv_effectFullAdtElement2_2_2= ruleEffectFullProdTypeFactor )
            {
            // InternalFPML.g:2798:5: (lv_effectFullAdtElement2_2_1= ruleEffectFullSumTypeFactor | lv_effectFullAdtElement2_2_2= ruleEffectFullProdTypeFactor )
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
                    // InternalFPML.g:2799:6: lv_effectFullAdtElement2_2_1= ruleEffectFullSumTypeFactor
                    {

                    						newCompositeNode(grammarAccess.getEffectFullAlgebraicTypeAccess().getEffectFullAdtElement2EffectFullSumTypeFactorParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_36);
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
                    // InternalFPML.g:2815:6: lv_effectFullAdtElement2_2_2= ruleEffectFullProdTypeFactor
                    {

                    						newCompositeNode(grammarAccess.getEffectFullAlgebraicTypeAccess().getEffectFullAdtElement2EffectFullProdTypeFactorParserRuleCall_2_0_1());
                    					
                    pushFollow(FOLLOW_36);
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
    // InternalFPML.g:2841:1: entryRuleEffectFullSumTypeFactor returns [EObject current=null] : iv_ruleEffectFullSumTypeFactor= ruleEffectFullSumTypeFactor EOF ;
    public final EObject entryRuleEffectFullSumTypeFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullSumTypeFactor = null;


        try {
            // InternalFPML.g:2841:64: (iv_ruleEffectFullSumTypeFactor= ruleEffectFullSumTypeFactor EOF )
            // InternalFPML.g:2842:2: iv_ruleEffectFullSumTypeFactor= ruleEffectFullSumTypeFactor EOF
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
    // InternalFPML.g:2848:1: ruleEffectFullSumTypeFactor returns [EObject current=null] : (otherlv_0= '+' ( (lv_adtElement_1_0= ruleIOType ) ) ) ;
    public final EObject ruleEffectFullSumTypeFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_adtElement_1_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:2854:2: ( (otherlv_0= '+' ( (lv_adtElement_1_0= ruleIOType ) ) ) )
            // InternalFPML.g:2855:2: (otherlv_0= '+' ( (lv_adtElement_1_0= ruleIOType ) ) )
            {
            // InternalFPML.g:2855:2: (otherlv_0= '+' ( (lv_adtElement_1_0= ruleIOType ) ) )
            // InternalFPML.g:2856:3: otherlv_0= '+' ( (lv_adtElement_1_0= ruleIOType ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getEffectFullSumTypeFactorAccess().getPlusSignKeyword_0());
            		
            // InternalFPML.g:2860:3: ( (lv_adtElement_1_0= ruleIOType ) )
            // InternalFPML.g:2861:4: (lv_adtElement_1_0= ruleIOType )
            {
            // InternalFPML.g:2861:4: (lv_adtElement_1_0= ruleIOType )
            // InternalFPML.g:2862:5: lv_adtElement_1_0= ruleIOType
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
    // InternalFPML.g:2883:1: entryRuleEffectFullProdTypeFactor returns [EObject current=null] : iv_ruleEffectFullProdTypeFactor= ruleEffectFullProdTypeFactor EOF ;
    public final EObject entryRuleEffectFullProdTypeFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullProdTypeFactor = null;


        try {
            // InternalFPML.g:2883:65: (iv_ruleEffectFullProdTypeFactor= ruleEffectFullProdTypeFactor EOF )
            // InternalFPML.g:2884:2: iv_ruleEffectFullProdTypeFactor= ruleEffectFullProdTypeFactor EOF
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
    // InternalFPML.g:2890:1: ruleEffectFullProdTypeFactor returns [EObject current=null] : (otherlv_0= '*' ( (lv_adtElement_1_0= ruleIOType ) ) ) ;
    public final EObject ruleEffectFullProdTypeFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_adtElement_1_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:2896:2: ( (otherlv_0= '*' ( (lv_adtElement_1_0= ruleIOType ) ) ) )
            // InternalFPML.g:2897:2: (otherlv_0= '*' ( (lv_adtElement_1_0= ruleIOType ) ) )
            {
            // InternalFPML.g:2897:2: (otherlv_0= '*' ( (lv_adtElement_1_0= ruleIOType ) ) )
            // InternalFPML.g:2898:3: otherlv_0= '*' ( (lv_adtElement_1_0= ruleIOType ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getEffectFullProdTypeFactorAccess().getAsteriskKeyword_0());
            		
            // InternalFPML.g:2902:3: ( (lv_adtElement_1_0= ruleIOType ) )
            // InternalFPML.g:2903:4: (lv_adtElement_1_0= ruleIOType )
            {
            // InternalFPML.g:2903:4: (lv_adtElement_1_0= ruleIOType )
            // InternalFPML.g:2904:5: lv_adtElement_1_0= ruleIOType
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
    // InternalFPML.g:2925:1: entryRuleEffectFullExpression returns [EObject current=null] : iv_ruleEffectFullExpression= ruleEffectFullExpression EOF ;
    public final EObject entryRuleEffectFullExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullExpression = null;


        try {
            // InternalFPML.g:2925:61: (iv_ruleEffectFullExpression= ruleEffectFullExpression EOF )
            // InternalFPML.g:2926:2: iv_ruleEffectFullExpression= ruleEffectFullExpression EOF
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
    // InternalFPML.g:2932:1: ruleEffectFullExpression returns [EObject current=null] : ( ( () otherlv_1= 'IO' otherlv_2= '[' ( (lv_exp_3_0= ruleEffectFullExpression ) ) otherlv_4= ']' ) | (otherlv_5= 'IO' otherlv_6= '(' this_Expression_7= ruleExpression otherlv_8= ')' ) | this_UnitValue_9= ruleUnitValue | this_EffectFullFunctionValue_10= ruleEffectFullFunctionValue | this_EffectFullDataValue_11= ruleEffectFullDataValue ) ;
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

        EObject this_UnitValue_9 = null;

        EObject this_EffectFullFunctionValue_10 = null;

        EObject this_EffectFullDataValue_11 = null;



        	enterRule();

        try {
            // InternalFPML.g:2938:2: ( ( ( () otherlv_1= 'IO' otherlv_2= '[' ( (lv_exp_3_0= ruleEffectFullExpression ) ) otherlv_4= ']' ) | (otherlv_5= 'IO' otherlv_6= '(' this_Expression_7= ruleExpression otherlv_8= ')' ) | this_UnitValue_9= ruleUnitValue | this_EffectFullFunctionValue_10= ruleEffectFullFunctionValue | this_EffectFullDataValue_11= ruleEffectFullDataValue ) )
            // InternalFPML.g:2939:2: ( ( () otherlv_1= 'IO' otherlv_2= '[' ( (lv_exp_3_0= ruleEffectFullExpression ) ) otherlv_4= ']' ) | (otherlv_5= 'IO' otherlv_6= '(' this_Expression_7= ruleExpression otherlv_8= ')' ) | this_UnitValue_9= ruleUnitValue | this_EffectFullFunctionValue_10= ruleEffectFullFunctionValue | this_EffectFullDataValue_11= ruleEffectFullDataValue )
            {
            // InternalFPML.g:2939:2: ( ( () otherlv_1= 'IO' otherlv_2= '[' ( (lv_exp_3_0= ruleEffectFullExpression ) ) otherlv_4= ']' ) | (otherlv_5= 'IO' otherlv_6= '(' this_Expression_7= ruleExpression otherlv_8= ')' ) | this_UnitValue_9= ruleUnitValue | this_EffectFullFunctionValue_10= ruleEffectFullFunctionValue | this_EffectFullDataValue_11= ruleEffectFullDataValue )
            int alt28=5;
            switch ( input.LA(1) ) {
            case 23:
                {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==37) ) {
                    alt28=1;
                }
                else if ( (LA28_1==20) ) {
                    alt28=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 1, input);

                    throw nvae;
                }
                }
                break;
            case 41:
                {
                alt28=3;
                }
                break;
            case 25:
            case 37:
            case 39:
            case 40:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
                {
                alt28=4;
                }
                break;
            case RULE_ID:
                {
                int LA28_4 = input.LA(2);

                if ( (LA28_4==20) ) {
                    alt28=5;
                }
                else if ( (LA28_4==27) ) {
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
                    // InternalFPML.g:2940:3: ( () otherlv_1= 'IO' otherlv_2= '[' ( (lv_exp_3_0= ruleEffectFullExpression ) ) otherlv_4= ']' )
                    {
                    // InternalFPML.g:2940:3: ( () otherlv_1= 'IO' otherlv_2= '[' ( (lv_exp_3_0= ruleEffectFullExpression ) ) otherlv_4= ']' )
                    // InternalFPML.g:2941:4: () otherlv_1= 'IO' otherlv_2= '[' ( (lv_exp_3_0= ruleEffectFullExpression ) ) otherlv_4= ']'
                    {
                    // InternalFPML.g:2941:4: ()
                    // InternalFPML.g:2942:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getEffectFullExpressionAccess().getRecursiveEffectFullExpressionAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,23,FOLLOW_37); 

                    				newLeafNode(otherlv_1, grammarAccess.getEffectFullExpressionAccess().getIOKeyword_0_1());
                    			
                    otherlv_2=(Token)match(input,37,FOLLOW_16); 

                    				newLeafNode(otherlv_2, grammarAccess.getEffectFullExpressionAccess().getLeftSquareBracketKeyword_0_2());
                    			
                    // InternalFPML.g:2956:4: ( (lv_exp_3_0= ruleEffectFullExpression ) )
                    // InternalFPML.g:2957:5: (lv_exp_3_0= ruleEffectFullExpression )
                    {
                    // InternalFPML.g:2957:5: (lv_exp_3_0= ruleEffectFullExpression )
                    // InternalFPML.g:2958:6: lv_exp_3_0= ruleEffectFullExpression
                    {

                    						newCompositeNode(grammarAccess.getEffectFullExpressionAccess().getExpEffectFullExpressionParserRuleCall_0_3_0());
                    					
                    pushFollow(FOLLOW_36);
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
                    // InternalFPML.g:2981:3: (otherlv_5= 'IO' otherlv_6= '(' this_Expression_7= ruleExpression otherlv_8= ')' )
                    {
                    // InternalFPML.g:2981:3: (otherlv_5= 'IO' otherlv_6= '(' this_Expression_7= ruleExpression otherlv_8= ')' )
                    // InternalFPML.g:2982:4: otherlv_5= 'IO' otherlv_6= '(' this_Expression_7= ruleExpression otherlv_8= ')'
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
                    // InternalFPML.g:3004:3: this_UnitValue_9= ruleUnitValue
                    {

                    			newCompositeNode(grammarAccess.getEffectFullExpressionAccess().getUnitValueParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_UnitValue_9=ruleUnitValue();

                    state._fsp--;


                    			current = this_UnitValue_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalFPML.g:3013:3: this_EffectFullFunctionValue_10= ruleEffectFullFunctionValue
                    {

                    			newCompositeNode(grammarAccess.getEffectFullExpressionAccess().getEffectFullFunctionValueParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_EffectFullFunctionValue_10=ruleEffectFullFunctionValue();

                    state._fsp--;


                    			current = this_EffectFullFunctionValue_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalFPML.g:3022:3: this_EffectFullDataValue_11= ruleEffectFullDataValue
                    {

                    			newCompositeNode(grammarAccess.getEffectFullExpressionAccess().getEffectFullDataValueParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_EffectFullDataValue_11=ruleEffectFullDataValue();

                    state._fsp--;


                    			current = this_EffectFullDataValue_11;
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
    // InternalFPML.g:3146:1: ruleEffectFullLambda returns [EObject current=null] : ( ( () otherlv_1= '[' ( (lv_arg_2_0= ruleEffectFullArgument ) ) otherlv_3= ']' otherlv_4= ':' ( (lv_functionBody_5_0= ruleFunctionBodyEffectFull ) ) ) | ( () ( (lv_functionBody_7_0= ruleFunctionBodyEffectFull ) ) ) ) ;
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
            // InternalFPML.g:3152:2: ( ( ( () otherlv_1= '[' ( (lv_arg_2_0= ruleEffectFullArgument ) ) otherlv_3= ']' otherlv_4= ':' ( (lv_functionBody_5_0= ruleFunctionBodyEffectFull ) ) ) | ( () ( (lv_functionBody_7_0= ruleFunctionBodyEffectFull ) ) ) ) )
            // InternalFPML.g:3153:2: ( ( () otherlv_1= '[' ( (lv_arg_2_0= ruleEffectFullArgument ) ) otherlv_3= ']' otherlv_4= ':' ( (lv_functionBody_5_0= ruleFunctionBodyEffectFull ) ) ) | ( () ( (lv_functionBody_7_0= ruleFunctionBodyEffectFull ) ) ) )
            {
            // InternalFPML.g:3153:2: ( ( () otherlv_1= '[' ( (lv_arg_2_0= ruleEffectFullArgument ) ) otherlv_3= ']' otherlv_4= ':' ( (lv_functionBody_5_0= ruleFunctionBodyEffectFull ) ) ) | ( () ( (lv_functionBody_7_0= ruleFunctionBodyEffectFull ) ) ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==37) ) {
                alt29=1;
            }
            else if ( (LA29_0==RULE_ID||LA29_0==25||(LA29_0>=39 && LA29_0<=40)||(LA29_0>=44 && LA29_0<=53)) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalFPML.g:3154:3: ( () otherlv_1= '[' ( (lv_arg_2_0= ruleEffectFullArgument ) ) otherlv_3= ']' otherlv_4= ':' ( (lv_functionBody_5_0= ruleFunctionBodyEffectFull ) ) )
                    {
                    // InternalFPML.g:3154:3: ( () otherlv_1= '[' ( (lv_arg_2_0= ruleEffectFullArgument ) ) otherlv_3= ']' otherlv_4= ':' ( (lv_functionBody_5_0= ruleFunctionBodyEffectFull ) ) )
                    // InternalFPML.g:3155:4: () otherlv_1= '[' ( (lv_arg_2_0= ruleEffectFullArgument ) ) otherlv_3= ']' otherlv_4= ':' ( (lv_functionBody_5_0= ruleFunctionBodyEffectFull ) )
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
                    					
                    pushFollow(FOLLOW_36);
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
                    			
                    otherlv_4=(Token)match(input,18,FOLLOW_24); 

                    				newLeafNode(otherlv_4, grammarAccess.getEffectFullLambdaAccess().getColonKeyword_0_4());
                    			
                    // InternalFPML.g:3193:4: ( (lv_functionBody_5_0= ruleFunctionBodyEffectFull ) )
                    // InternalFPML.g:3194:5: (lv_functionBody_5_0= ruleFunctionBodyEffectFull )
                    {
                    // InternalFPML.g:3194:5: (lv_functionBody_5_0= ruleFunctionBodyEffectFull )
                    // InternalFPML.g:3195:6: lv_functionBody_5_0= ruleFunctionBodyEffectFull
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
                    // InternalFPML.g:3214:3: ( () ( (lv_functionBody_7_0= ruleFunctionBodyEffectFull ) ) )
                    {
                    // InternalFPML.g:3214:3: ( () ( (lv_functionBody_7_0= ruleFunctionBodyEffectFull ) ) )
                    // InternalFPML.g:3215:4: () ( (lv_functionBody_7_0= ruleFunctionBodyEffectFull ) )
                    {
                    // InternalFPML.g:3215:4: ()
                    // InternalFPML.g:3216:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getEffectFullLambdaAccess().getEffectFullLambdaAction_1_0(),
                    						current);
                    				

                    }

                    // InternalFPML.g:3222:4: ( (lv_functionBody_7_0= ruleFunctionBodyEffectFull ) )
                    // InternalFPML.g:3223:5: (lv_functionBody_7_0= ruleFunctionBodyEffectFull )
                    {
                    // InternalFPML.g:3223:5: (lv_functionBody_7_0= ruleFunctionBodyEffectFull )
                    // InternalFPML.g:3224:6: lv_functionBody_7_0= ruleFunctionBodyEffectFull
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
    // InternalFPML.g:3246:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalFPML.g:3246:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalFPML.g:3247:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalFPML.g:3253:1: ruleExpression returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_DataValue_2= ruleDataValue | this_FunctionValue_3= ruleFunctionValue ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_IntValue_0 = null;

        EObject this_StringValue_1 = null;

        EObject this_DataValue_2 = null;

        EObject this_FunctionValue_3 = null;



        	enterRule();

        try {
            // InternalFPML.g:3259:2: ( (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_DataValue_2= ruleDataValue | this_FunctionValue_3= ruleFunctionValue ) )
            // InternalFPML.g:3260:2: (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_DataValue_2= ruleDataValue | this_FunctionValue_3= ruleFunctionValue )
            {
            // InternalFPML.g:3260:2: (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_DataValue_2= ruleDataValue | this_FunctionValue_3= ruleFunctionValue )
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
            case 20:
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
                    // InternalFPML.g:3261:3: this_IntValue_0= ruleIntValue
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
                    // InternalFPML.g:3270:3: this_StringValue_1= ruleStringValue
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
                    // InternalFPML.g:3279:3: this_DataValue_2= ruleDataValue
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
                    // InternalFPML.g:3288:3: this_FunctionValue_3= ruleFunctionValue
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
    // InternalFPML.g:3300:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // InternalFPML.g:3300:49: (iv_ruleIntValue= ruleIntValue EOF )
            // InternalFPML.g:3301:2: iv_ruleIntValue= ruleIntValue EOF
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
    // InternalFPML.g:3307:1: ruleIntValue returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalFPML.g:3313:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // InternalFPML.g:3314:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // InternalFPML.g:3314:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // InternalFPML.g:3315:3: () ( (lv_value_1_0= RULE_INT ) )
            {
            // InternalFPML.g:3315:3: ()
            // InternalFPML.g:3316:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntValueAccess().getIntegerTypeAction_0(),
            					current);
            			

            }

            // InternalFPML.g:3322:3: ( (lv_value_1_0= RULE_INT ) )
            // InternalFPML.g:3323:4: (lv_value_1_0= RULE_INT )
            {
            // InternalFPML.g:3323:4: (lv_value_1_0= RULE_INT )
            // InternalFPML.g:3324:5: lv_value_1_0= RULE_INT
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
    // InternalFPML.g:3344:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalFPML.g:3344:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalFPML.g:3345:2: iv_ruleStringValue= ruleStringValue EOF
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
    // InternalFPML.g:3351:1: ruleStringValue returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalFPML.g:3357:2: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalFPML.g:3358:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalFPML.g:3358:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalFPML.g:3359:3: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // InternalFPML.g:3359:3: ()
            // InternalFPML.g:3360:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStringValueAccess().getStringTypeAction_0(),
            					current);
            			

            }

            // InternalFPML.g:3366:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalFPML.g:3367:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalFPML.g:3367:4: (lv_value_1_0= RULE_STRING )
            // InternalFPML.g:3368:5: lv_value_1_0= RULE_STRING
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
    // InternalFPML.g:3388:1: entryRuleFunctionValue returns [EObject current=null] : iv_ruleFunctionValue= ruleFunctionValue EOF ;
    public final EObject entryRuleFunctionValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionValue = null;


        try {
            // InternalFPML.g:3388:54: (iv_ruleFunctionValue= ruleFunctionValue EOF )
            // InternalFPML.g:3389:2: iv_ruleFunctionValue= ruleFunctionValue EOF
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
    // InternalFPML.g:3395:1: ruleFunctionValue returns [EObject current=null] : ( (lv_value_0_0= rulePureLambda ) ) ;
    public final EObject ruleFunctionValue() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:3401:2: ( ( (lv_value_0_0= rulePureLambda ) ) )
            // InternalFPML.g:3402:2: ( (lv_value_0_0= rulePureLambda ) )
            {
            // InternalFPML.g:3402:2: ( (lv_value_0_0= rulePureLambda ) )
            // InternalFPML.g:3403:3: (lv_value_0_0= rulePureLambda )
            {
            // InternalFPML.g:3403:3: (lv_value_0_0= rulePureLambda )
            // InternalFPML.g:3404:4: lv_value_0_0= rulePureLambda
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
    // InternalFPML.g:3424:1: entryRuleDataValue returns [EObject current=null] : iv_ruleDataValue= ruleDataValue EOF ;
    public final EObject entryRuleDataValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataValue = null;


        try {
            // InternalFPML.g:3424:50: (iv_ruleDataValue= ruleDataValue EOF )
            // InternalFPML.g:3425:2: iv_ruleDataValue= ruleDataValue EOF
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
    // InternalFPML.g:3431:1: ruleDataValue returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_value_3_0= rulePureAdtValue ) ) otherlv_4= ')' ) ;
    public final EObject ruleDataValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:3437:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_value_3_0= rulePureAdtValue ) ) otherlv_4= ')' ) )
            // InternalFPML.g:3438:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_value_3_0= rulePureAdtValue ) ) otherlv_4= ')' )
            {
            // InternalFPML.g:3438:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_value_3_0= rulePureAdtValue ) ) otherlv_4= ')' )
            // InternalFPML.g:3439:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_value_3_0= rulePureAdtValue ) ) otherlv_4= ')'
            {
            // InternalFPML.g:3439:3: ()
            // InternalFPML.g:3440:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDataValueAccess().getDataValueAction_0(),
            					current);
            			

            }

            // InternalFPML.g:3446:3: ( (otherlv_1= RULE_ID ) )
            // InternalFPML.g:3447:4: (otherlv_1= RULE_ID )
            {
            // InternalFPML.g:3447:4: (otherlv_1= RULE_ID )
            // InternalFPML.g:3448:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataValueRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_1, grammarAccess.getDataValueAccess().getTypePureDataCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_38); 

            			newLeafNode(otherlv_2, grammarAccess.getDataValueAccess().getLeftParenthesisKeyword_2());
            		
            // InternalFPML.g:3463:3: ( (lv_value_3_0= rulePureAdtValue ) )
            // InternalFPML.g:3464:4: (lv_value_3_0= rulePureAdtValue )
            {
            // InternalFPML.g:3464:4: (lv_value_3_0= rulePureAdtValue )
            // InternalFPML.g:3465:5: lv_value_3_0= rulePureAdtValue
            {

            					newCompositeNode(grammarAccess.getDataValueAccess().getValuePureAdtValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_20);
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
    // InternalFPML.g:3490:1: entryRuleEffectFullDataValue returns [EObject current=null] : iv_ruleEffectFullDataValue= ruleEffectFullDataValue EOF ;
    public final EObject entryRuleEffectFullDataValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullDataValue = null;


        try {
            // InternalFPML.g:3490:60: (iv_ruleEffectFullDataValue= ruleEffectFullDataValue EOF )
            // InternalFPML.g:3491:2: iv_ruleEffectFullDataValue= ruleEffectFullDataValue EOF
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
    // InternalFPML.g:3497:1: ruleEffectFullDataValue returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_value_3_0= ruleEffectFullAdtValue ) ) otherlv_4= ')' ) ;
    public final EObject ruleEffectFullDataValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:3503:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_value_3_0= ruleEffectFullAdtValue ) ) otherlv_4= ')' ) )
            // InternalFPML.g:3504:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_value_3_0= ruleEffectFullAdtValue ) ) otherlv_4= ')' )
            {
            // InternalFPML.g:3504:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_value_3_0= ruleEffectFullAdtValue ) ) otherlv_4= ')' )
            // InternalFPML.g:3505:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_value_3_0= ruleEffectFullAdtValue ) ) otherlv_4= ')'
            {
            // InternalFPML.g:3505:3: ()
            // InternalFPML.g:3506:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEffectFullDataValueAccess().getEffectFullDataValueAction_0(),
            					current);
            			

            }

            // InternalFPML.g:3512:3: ( (otherlv_1= RULE_ID ) )
            // InternalFPML.g:3513:4: (otherlv_1= RULE_ID )
            {
            // InternalFPML.g:3513:4: (otherlv_1= RULE_ID )
            // InternalFPML.g:3514:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEffectFullDataValueRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_1, grammarAccess.getEffectFullDataValueAccess().getTypeEffectFullDataCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getEffectFullDataValueAccess().getLeftParenthesisKeyword_2());
            		
            // InternalFPML.g:3529:3: ( (lv_value_3_0= ruleEffectFullAdtValue ) )
            // InternalFPML.g:3530:4: (lv_value_3_0= ruleEffectFullAdtValue )
            {
            // InternalFPML.g:3530:4: (lv_value_3_0= ruleEffectFullAdtValue )
            // InternalFPML.g:3531:5: lv_value_3_0= ruleEffectFullAdtValue
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
    // InternalFPML.g:3556:1: entryRulePureValueRef returns [EObject current=null] : iv_rulePureValueRef= rulePureValueRef EOF ;
    public final EObject entryRulePureValueRef() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePureValueRef = null;


        try {
            // InternalFPML.g:3556:53: (iv_rulePureValueRef= rulePureValueRef EOF )
            // InternalFPML.g:3557:2: iv_rulePureValueRef= rulePureValueRef EOF
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
    // InternalFPML.g:3563:1: rulePureValueRef returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject rulePureValueRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFPML.g:3569:2: ( ( () ( (otherlv_1= RULE_ID ) ) ) )
            // InternalFPML.g:3570:2: ( () ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalFPML.g:3570:2: ( () ( (otherlv_1= RULE_ID ) ) )
            // InternalFPML.g:3571:3: () ( (otherlv_1= RULE_ID ) )
            {
            // InternalFPML.g:3571:3: ()
            // InternalFPML.g:3572:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPureValueRefAccess().getPureValueRefAction_0(),
            					current);
            			

            }

            // InternalFPML.g:3578:3: ( (otherlv_1= RULE_ID ) )
            // InternalFPML.g:3579:4: (otherlv_1= RULE_ID )
            {
            // InternalFPML.g:3579:4: (otherlv_1= RULE_ID )
            // InternalFPML.g:3580:5: otherlv_1= RULE_ID
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
    // InternalFPML.g:3595:1: entryRulePureLambda returns [EObject current=null] : iv_rulePureLambda= rulePureLambda EOF ;
    public final EObject entryRulePureLambda() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePureLambda = null;


        try {
            // InternalFPML.g:3595:51: (iv_rulePureLambda= rulePureLambda EOF )
            // InternalFPML.g:3596:2: iv_rulePureLambda= rulePureLambda EOF
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
    // InternalFPML.g:3602:1: rulePureLambda returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_arg_2_0= ruleArgument ) ) otherlv_3= ')' otherlv_4= ':' ( (lv_functionBody_5_0= ruleFunctionBodyPure ) ) ) ;
    public final EObject rulePureLambda() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_arg_2_0 = null;

        EObject lv_functionBody_5_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:3608:2: ( ( () otherlv_1= '(' ( (lv_arg_2_0= ruleArgument ) ) otherlv_3= ')' otherlv_4= ':' ( (lv_functionBody_5_0= ruleFunctionBodyPure ) ) ) )
            // InternalFPML.g:3609:2: ( () otherlv_1= '(' ( (lv_arg_2_0= ruleArgument ) ) otherlv_3= ')' otherlv_4= ':' ( (lv_functionBody_5_0= ruleFunctionBodyPure ) ) )
            {
            // InternalFPML.g:3609:2: ( () otherlv_1= '(' ( (lv_arg_2_0= ruleArgument ) ) otherlv_3= ')' otherlv_4= ':' ( (lv_functionBody_5_0= ruleFunctionBodyPure ) ) )
            // InternalFPML.g:3610:3: () otherlv_1= '(' ( (lv_arg_2_0= ruleArgument ) ) otherlv_3= ')' otherlv_4= ':' ( (lv_functionBody_5_0= ruleFunctionBodyPure ) )
            {
            // InternalFPML.g:3610:3: ()
            // InternalFPML.g:3611:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPureLambdaAccess().getPureLambdaAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getPureLambdaAccess().getLeftParenthesisKeyword_1());
            		
            // InternalFPML.g:3621:3: ( (lv_arg_2_0= ruleArgument ) )
            // InternalFPML.g:3622:4: (lv_arg_2_0= ruleArgument )
            {
            // InternalFPML.g:3622:4: (lv_arg_2_0= ruleArgument )
            // InternalFPML.g:3623:5: lv_arg_2_0= ruleArgument
            {

            					newCompositeNode(grammarAccess.getPureLambdaAccess().getArgArgumentParserRuleCall_2_0());
            				
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

            			newLeafNode(otherlv_3, grammarAccess.getPureLambdaAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,18,FOLLOW_21); 

            			newLeafNode(otherlv_4, grammarAccess.getPureLambdaAccess().getColonKeyword_4());
            		
            // InternalFPML.g:3648:3: ( (lv_functionBody_5_0= ruleFunctionBodyPure ) )
            // InternalFPML.g:3649:4: (lv_functionBody_5_0= ruleFunctionBodyPure )
            {
            // InternalFPML.g:3649:4: (lv_functionBody_5_0= ruleFunctionBodyPure )
            // InternalFPML.g:3650:5: lv_functionBody_5_0= ruleFunctionBodyPure
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
    // InternalFPML.g:3671:1: entryRulePureAdtValue returns [EObject current=null] : iv_rulePureAdtValue= rulePureAdtValue EOF ;
    public final EObject entryRulePureAdtValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePureAdtValue = null;


        try {
            // InternalFPML.g:3671:53: (iv_rulePureAdtValue= rulePureAdtValue EOF )
            // InternalFPML.g:3672:2: iv_rulePureAdtValue= rulePureAdtValue EOF
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
    // InternalFPML.g:3678:1: rulePureAdtValue returns [EObject current=null] : (this_Expression_0= ruleExpression | this_PureValueRef_1= rulePureValueRef | this_PureSumValue_2= rulePureSumValue | this_PureProdValue_3= rulePureProdValue ) ;
    public final EObject rulePureAdtValue() throws RecognitionException {
        EObject current = null;

        EObject this_Expression_0 = null;

        EObject this_PureValueRef_1 = null;

        EObject this_PureSumValue_2 = null;

        EObject this_PureProdValue_3 = null;



        	enterRule();

        try {
            // InternalFPML.g:3684:2: ( (this_Expression_0= ruleExpression | this_PureValueRef_1= rulePureValueRef | this_PureSumValue_2= rulePureSumValue | this_PureProdValue_3= rulePureProdValue ) )
            // InternalFPML.g:3685:2: (this_Expression_0= ruleExpression | this_PureValueRef_1= rulePureValueRef | this_PureSumValue_2= rulePureSumValue | this_PureProdValue_3= rulePureProdValue )
            {
            // InternalFPML.g:3685:2: (this_Expression_0= ruleExpression | this_PureValueRef_1= rulePureValueRef | this_PureSumValue_2= rulePureSumValue | this_PureProdValue_3= rulePureProdValue )
            int alt31=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_STRING:
                {
                alt31=1;
                }
                break;
            case RULE_ID:
                {
                int LA31_2 = input.LA(2);

                if ( (LA31_2==20) ) {
                    alt31=1;
                }
                else if ( (LA31_2==EOF||(LA31_2>=21 && LA31_2<=22)) ) {
                    alt31=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 2, input);

                    throw nvae;
                }
                }
                break;
            case 20:
                {
                int LA31_3 = input.LA(2);

                if ( ((LA31_3>=RULE_ID && LA31_3<=RULE_STRING)||LA31_3==20||(LA31_3>=42 && LA31_3<=43)) ) {
                    alt31=4;
                }
                else if ( ((LA31_3>=28 && LA31_3<=29)||LA31_3==31||LA31_3==33||LA31_3==37) ) {
                    alt31=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 3, input);

                    throw nvae;
                }
                }
                break;
            case 42:
            case 43:
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
                    // InternalFPML.g:3686:3: this_Expression_0= ruleExpression
                    {

                    			newCompositeNode(grammarAccess.getPureAdtValueAccess().getExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Expression_0=ruleExpression();

                    state._fsp--;


                    			current = this_Expression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFPML.g:3695:3: this_PureValueRef_1= rulePureValueRef
                    {

                    			newCompositeNode(grammarAccess.getPureAdtValueAccess().getPureValueRefParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PureValueRef_1=rulePureValueRef();

                    state._fsp--;


                    			current = this_PureValueRef_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalFPML.g:3704:3: this_PureSumValue_2= rulePureSumValue
                    {

                    			newCompositeNode(grammarAccess.getPureAdtValueAccess().getPureSumValueParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_PureSumValue_2=rulePureSumValue();

                    state._fsp--;


                    			current = this_PureSumValue_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalFPML.g:3713:3: this_PureProdValue_3= rulePureProdValue
                    {

                    			newCompositeNode(grammarAccess.getPureAdtValueAccess().getPureProdValueParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_PureProdValue_3=rulePureProdValue();

                    state._fsp--;


                    			current = this_PureProdValue_3;
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
    // InternalFPML.g:3725:1: entryRulePureProdValue returns [EObject current=null] : iv_rulePureProdValue= rulePureProdValue EOF ;
    public final EObject entryRulePureProdValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePureProdValue = null;


        try {
            // InternalFPML.g:3725:54: (iv_rulePureProdValue= rulePureProdValue EOF )
            // InternalFPML.g:3726:2: iv_rulePureProdValue= rulePureProdValue EOF
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
    // InternalFPML.g:3732:1: rulePureProdValue returns [EObject current=null] : (otherlv_0= '(' ( (lv_prodAdtElement1_1_0= rulePureAdtValue ) ) otherlv_2= ',' ( (lv_prodAdtElement2_3_0= rulePureAdtValue ) ) otherlv_4= ')' ) ;
    public final EObject rulePureProdValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_prodAdtElement1_1_0 = null;

        EObject lv_prodAdtElement2_3_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:3738:2: ( (otherlv_0= '(' ( (lv_prodAdtElement1_1_0= rulePureAdtValue ) ) otherlv_2= ',' ( (lv_prodAdtElement2_3_0= rulePureAdtValue ) ) otherlv_4= ')' ) )
            // InternalFPML.g:3739:2: (otherlv_0= '(' ( (lv_prodAdtElement1_1_0= rulePureAdtValue ) ) otherlv_2= ',' ( (lv_prodAdtElement2_3_0= rulePureAdtValue ) ) otherlv_4= ')' )
            {
            // InternalFPML.g:3739:2: (otherlv_0= '(' ( (lv_prodAdtElement1_1_0= rulePureAdtValue ) ) otherlv_2= ',' ( (lv_prodAdtElement2_3_0= rulePureAdtValue ) ) otherlv_4= ')' )
            // InternalFPML.g:3740:3: otherlv_0= '(' ( (lv_prodAdtElement1_1_0= rulePureAdtValue ) ) otherlv_2= ',' ( (lv_prodAdtElement2_3_0= rulePureAdtValue ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_38); 

            			newLeafNode(otherlv_0, grammarAccess.getPureProdValueAccess().getLeftParenthesisKeyword_0());
            		
            // InternalFPML.g:3744:3: ( (lv_prodAdtElement1_1_0= rulePureAdtValue ) )
            // InternalFPML.g:3745:4: (lv_prodAdtElement1_1_0= rulePureAdtValue )
            {
            // InternalFPML.g:3745:4: (lv_prodAdtElement1_1_0= rulePureAdtValue )
            // InternalFPML.g:3746:5: lv_prodAdtElement1_1_0= rulePureAdtValue
            {

            					newCompositeNode(grammarAccess.getPureProdValueAccess().getProdAdtElement1PureAdtValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_33);
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

            otherlv_2=(Token)match(input,21,FOLLOW_38); 

            			newLeafNode(otherlv_2, grammarAccess.getPureProdValueAccess().getCommaKeyword_2());
            		
            // InternalFPML.g:3767:3: ( (lv_prodAdtElement2_3_0= rulePureAdtValue ) )
            // InternalFPML.g:3768:4: (lv_prodAdtElement2_3_0= rulePureAdtValue )
            {
            // InternalFPML.g:3768:4: (lv_prodAdtElement2_3_0= rulePureAdtValue )
            // InternalFPML.g:3769:5: lv_prodAdtElement2_3_0= rulePureAdtValue
            {

            					newCompositeNode(grammarAccess.getPureProdValueAccess().getProdAdtElement2PureAdtValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_20);
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
    // InternalFPML.g:3794:1: entryRulePureSumValue returns [EObject current=null] : iv_rulePureSumValue= rulePureSumValue EOF ;
    public final EObject entryRulePureSumValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePureSumValue = null;


        try {
            // InternalFPML.g:3794:53: (iv_rulePureSumValue= rulePureSumValue EOF )
            // InternalFPML.g:3795:2: iv_rulePureSumValue= rulePureSumValue EOF
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
    // InternalFPML.g:3801:1: rulePureSumValue returns [EObject current=null] : ( (otherlv_0= 'Left' otherlv_1= '(' ( (lv_sumAdtElement1_2_0= rulePureAdtValue ) ) otherlv_3= ')' ) | (otherlv_4= 'Right' otherlv_5= '(' ( (lv_sumAdtElement2_6_0= rulePureAdtValue ) ) otherlv_7= ')' ) ) ;
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
            // InternalFPML.g:3807:2: ( ( (otherlv_0= 'Left' otherlv_1= '(' ( (lv_sumAdtElement1_2_0= rulePureAdtValue ) ) otherlv_3= ')' ) | (otherlv_4= 'Right' otherlv_5= '(' ( (lv_sumAdtElement2_6_0= rulePureAdtValue ) ) otherlv_7= ')' ) ) )
            // InternalFPML.g:3808:2: ( (otherlv_0= 'Left' otherlv_1= '(' ( (lv_sumAdtElement1_2_0= rulePureAdtValue ) ) otherlv_3= ')' ) | (otherlv_4= 'Right' otherlv_5= '(' ( (lv_sumAdtElement2_6_0= rulePureAdtValue ) ) otherlv_7= ')' ) )
            {
            // InternalFPML.g:3808:2: ( (otherlv_0= 'Left' otherlv_1= '(' ( (lv_sumAdtElement1_2_0= rulePureAdtValue ) ) otherlv_3= ')' ) | (otherlv_4= 'Right' otherlv_5= '(' ( (lv_sumAdtElement2_6_0= rulePureAdtValue ) ) otherlv_7= ')' ) )
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
                    // InternalFPML.g:3809:3: (otherlv_0= 'Left' otherlv_1= '(' ( (lv_sumAdtElement1_2_0= rulePureAdtValue ) ) otherlv_3= ')' )
                    {
                    // InternalFPML.g:3809:3: (otherlv_0= 'Left' otherlv_1= '(' ( (lv_sumAdtElement1_2_0= rulePureAdtValue ) ) otherlv_3= ')' )
                    // InternalFPML.g:3810:4: otherlv_0= 'Left' otherlv_1= '(' ( (lv_sumAdtElement1_2_0= rulePureAdtValue ) ) otherlv_3= ')'
                    {
                    otherlv_0=(Token)match(input,42,FOLLOW_18); 

                    				newLeafNode(otherlv_0, grammarAccess.getPureSumValueAccess().getLeftKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,20,FOLLOW_38); 

                    				newLeafNode(otherlv_1, grammarAccess.getPureSumValueAccess().getLeftParenthesisKeyword_0_1());
                    			
                    // InternalFPML.g:3818:4: ( (lv_sumAdtElement1_2_0= rulePureAdtValue ) )
                    // InternalFPML.g:3819:5: (lv_sumAdtElement1_2_0= rulePureAdtValue )
                    {
                    // InternalFPML.g:3819:5: (lv_sumAdtElement1_2_0= rulePureAdtValue )
                    // InternalFPML.g:3820:6: lv_sumAdtElement1_2_0= rulePureAdtValue
                    {

                    						newCompositeNode(grammarAccess.getPureSumValueAccess().getSumAdtElement1PureAdtValueParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_20);
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

                    otherlv_3=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getPureSumValueAccess().getRightParenthesisKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFPML.g:3843:3: (otherlv_4= 'Right' otherlv_5= '(' ( (lv_sumAdtElement2_6_0= rulePureAdtValue ) ) otherlv_7= ')' )
                    {
                    // InternalFPML.g:3843:3: (otherlv_4= 'Right' otherlv_5= '(' ( (lv_sumAdtElement2_6_0= rulePureAdtValue ) ) otherlv_7= ')' )
                    // InternalFPML.g:3844:4: otherlv_4= 'Right' otherlv_5= '(' ( (lv_sumAdtElement2_6_0= rulePureAdtValue ) ) otherlv_7= ')'
                    {
                    otherlv_4=(Token)match(input,43,FOLLOW_18); 

                    				newLeafNode(otherlv_4, grammarAccess.getPureSumValueAccess().getRightKeyword_1_0());
                    			
                    otherlv_5=(Token)match(input,20,FOLLOW_38); 

                    				newLeafNode(otherlv_5, grammarAccess.getPureSumValueAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalFPML.g:3852:4: ( (lv_sumAdtElement2_6_0= rulePureAdtValue ) )
                    // InternalFPML.g:3853:5: (lv_sumAdtElement2_6_0= rulePureAdtValue )
                    {
                    // InternalFPML.g:3853:5: (lv_sumAdtElement2_6_0= rulePureAdtValue )
                    // InternalFPML.g:3854:6: lv_sumAdtElement2_6_0= rulePureAdtValue
                    {

                    						newCompositeNode(grammarAccess.getPureSumValueAccess().getSumAdtElement2PureAdtValueParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_20);
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
    // InternalFPML.g:3880:1: entryRuleEffectFullAdtValue returns [EObject current=null] : iv_ruleEffectFullAdtValue= ruleEffectFullAdtValue EOF ;
    public final EObject entryRuleEffectFullAdtValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullAdtValue = null;


        try {
            // InternalFPML.g:3880:59: (iv_ruleEffectFullAdtValue= ruleEffectFullAdtValue EOF )
            // InternalFPML.g:3881:2: iv_ruleEffectFullAdtValue= ruleEffectFullAdtValue EOF
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
    // InternalFPML.g:3887:1: ruleEffectFullAdtValue returns [EObject current=null] : ( (otherlv_0= 'IO' otherlv_1= '(' ( (lv_innerValue_2_0= rulePureAdtValue ) ) otherlv_3= ')' ) | (otherlv_4= 'IO' otherlv_5= '[' ( (lv_innerValue_6_0= ruleEffectFullAdtValue ) ) otherlv_7= ']' ) | this_UnitValue_8= ruleUnitValue | this_EffectFullFunctionValue_9= ruleEffectFullFunctionValue | this_EffectFullProdValue_10= ruleEffectFullProdValue | this_EffectFullValueRef_11= ruleEffectFullValueRef | this_EffectFullDataValue_12= ruleEffectFullDataValue | this_EffectFullSumValue_13= ruleEffectFullSumValue ) ;
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

        EObject this_UnitValue_8 = null;

        EObject this_EffectFullFunctionValue_9 = null;

        EObject this_EffectFullProdValue_10 = null;

        EObject this_EffectFullValueRef_11 = null;

        EObject this_EffectFullDataValue_12 = null;

        EObject this_EffectFullSumValue_13 = null;



        	enterRule();

        try {
            // InternalFPML.g:3893:2: ( ( (otherlv_0= 'IO' otherlv_1= '(' ( (lv_innerValue_2_0= rulePureAdtValue ) ) otherlv_3= ')' ) | (otherlv_4= 'IO' otherlv_5= '[' ( (lv_innerValue_6_0= ruleEffectFullAdtValue ) ) otherlv_7= ']' ) | this_UnitValue_8= ruleUnitValue | this_EffectFullFunctionValue_9= ruleEffectFullFunctionValue | this_EffectFullProdValue_10= ruleEffectFullProdValue | this_EffectFullValueRef_11= ruleEffectFullValueRef | this_EffectFullDataValue_12= ruleEffectFullDataValue | this_EffectFullSumValue_13= ruleEffectFullSumValue ) )
            // InternalFPML.g:3894:2: ( (otherlv_0= 'IO' otherlv_1= '(' ( (lv_innerValue_2_0= rulePureAdtValue ) ) otherlv_3= ')' ) | (otherlv_4= 'IO' otherlv_5= '[' ( (lv_innerValue_6_0= ruleEffectFullAdtValue ) ) otherlv_7= ']' ) | this_UnitValue_8= ruleUnitValue | this_EffectFullFunctionValue_9= ruleEffectFullFunctionValue | this_EffectFullProdValue_10= ruleEffectFullProdValue | this_EffectFullValueRef_11= ruleEffectFullValueRef | this_EffectFullDataValue_12= ruleEffectFullDataValue | this_EffectFullSumValue_13= ruleEffectFullSumValue )
            {
            // InternalFPML.g:3894:2: ( (otherlv_0= 'IO' otherlv_1= '(' ( (lv_innerValue_2_0= rulePureAdtValue ) ) otherlv_3= ')' ) | (otherlv_4= 'IO' otherlv_5= '[' ( (lv_innerValue_6_0= ruleEffectFullAdtValue ) ) otherlv_7= ']' ) | this_UnitValue_8= ruleUnitValue | this_EffectFullFunctionValue_9= ruleEffectFullFunctionValue | this_EffectFullProdValue_10= ruleEffectFullProdValue | this_EffectFullValueRef_11= ruleEffectFullValueRef | this_EffectFullDataValue_12= ruleEffectFullDataValue | this_EffectFullSumValue_13= ruleEffectFullSumValue )
            int alt33=8;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // InternalFPML.g:3895:3: (otherlv_0= 'IO' otherlv_1= '(' ( (lv_innerValue_2_0= rulePureAdtValue ) ) otherlv_3= ')' )
                    {
                    // InternalFPML.g:3895:3: (otherlv_0= 'IO' otherlv_1= '(' ( (lv_innerValue_2_0= rulePureAdtValue ) ) otherlv_3= ')' )
                    // InternalFPML.g:3896:4: otherlv_0= 'IO' otherlv_1= '(' ( (lv_innerValue_2_0= rulePureAdtValue ) ) otherlv_3= ')'
                    {
                    otherlv_0=(Token)match(input,23,FOLLOW_18); 

                    				newLeafNode(otherlv_0, grammarAccess.getEffectFullAdtValueAccess().getIOKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,20,FOLLOW_38); 

                    				newLeafNode(otherlv_1, grammarAccess.getEffectFullAdtValueAccess().getLeftParenthesisKeyword_0_1());
                    			
                    // InternalFPML.g:3904:4: ( (lv_innerValue_2_0= rulePureAdtValue ) )
                    // InternalFPML.g:3905:5: (lv_innerValue_2_0= rulePureAdtValue )
                    {
                    // InternalFPML.g:3905:5: (lv_innerValue_2_0= rulePureAdtValue )
                    // InternalFPML.g:3906:6: lv_innerValue_2_0= rulePureAdtValue
                    {

                    						newCompositeNode(grammarAccess.getEffectFullAdtValueAccess().getInnerValuePureAdtValueParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_innerValue_2_0=rulePureAdtValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEffectFullAdtValueRule());
                    						}
                    						set(
                    							current,
                    							"innerValue",
                    							lv_innerValue_2_0,
                    							"it.unibo.FPML.PureAdtValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getEffectFullAdtValueAccess().getRightParenthesisKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFPML.g:3929:3: (otherlv_4= 'IO' otherlv_5= '[' ( (lv_innerValue_6_0= ruleEffectFullAdtValue ) ) otherlv_7= ']' )
                    {
                    // InternalFPML.g:3929:3: (otherlv_4= 'IO' otherlv_5= '[' ( (lv_innerValue_6_0= ruleEffectFullAdtValue ) ) otherlv_7= ']' )
                    // InternalFPML.g:3930:4: otherlv_4= 'IO' otherlv_5= '[' ( (lv_innerValue_6_0= ruleEffectFullAdtValue ) ) otherlv_7= ']'
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_37); 

                    				newLeafNode(otherlv_4, grammarAccess.getEffectFullAdtValueAccess().getIOKeyword_1_0());
                    			
                    otherlv_5=(Token)match(input,37,FOLLOW_39); 

                    				newLeafNode(otherlv_5, grammarAccess.getEffectFullAdtValueAccess().getLeftSquareBracketKeyword_1_1());
                    			
                    // InternalFPML.g:3938:4: ( (lv_innerValue_6_0= ruleEffectFullAdtValue ) )
                    // InternalFPML.g:3939:5: (lv_innerValue_6_0= ruleEffectFullAdtValue )
                    {
                    // InternalFPML.g:3939:5: (lv_innerValue_6_0= ruleEffectFullAdtValue )
                    // InternalFPML.g:3940:6: lv_innerValue_6_0= ruleEffectFullAdtValue
                    {

                    						newCompositeNode(grammarAccess.getEffectFullAdtValueAccess().getInnerValueEffectFullAdtValueParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_36);
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
                    // InternalFPML.g:3963:3: this_UnitValue_8= ruleUnitValue
                    {

                    			newCompositeNode(grammarAccess.getEffectFullAdtValueAccess().getUnitValueParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_UnitValue_8=ruleUnitValue();

                    state._fsp--;


                    			current = this_UnitValue_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalFPML.g:3972:3: this_EffectFullFunctionValue_9= ruleEffectFullFunctionValue
                    {

                    			newCompositeNode(grammarAccess.getEffectFullAdtValueAccess().getEffectFullFunctionValueParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_EffectFullFunctionValue_9=ruleEffectFullFunctionValue();

                    state._fsp--;


                    			current = this_EffectFullFunctionValue_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalFPML.g:3981:3: this_EffectFullProdValue_10= ruleEffectFullProdValue
                    {

                    			newCompositeNode(grammarAccess.getEffectFullAdtValueAccess().getEffectFullProdValueParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_EffectFullProdValue_10=ruleEffectFullProdValue();

                    state._fsp--;


                    			current = this_EffectFullProdValue_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalFPML.g:3990:3: this_EffectFullValueRef_11= ruleEffectFullValueRef
                    {

                    			newCompositeNode(grammarAccess.getEffectFullAdtValueAccess().getEffectFullValueRefParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_EffectFullValueRef_11=ruleEffectFullValueRef();

                    state._fsp--;


                    			current = this_EffectFullValueRef_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalFPML.g:3999:3: this_EffectFullDataValue_12= ruleEffectFullDataValue
                    {

                    			newCompositeNode(grammarAccess.getEffectFullAdtValueAccess().getEffectFullDataValueParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_EffectFullDataValue_12=ruleEffectFullDataValue();

                    state._fsp--;


                    			current = this_EffectFullDataValue_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalFPML.g:4008:3: this_EffectFullSumValue_13= ruleEffectFullSumValue
                    {

                    			newCompositeNode(grammarAccess.getEffectFullAdtValueAccess().getEffectFullSumValueParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_EffectFullSumValue_13=ruleEffectFullSumValue();

                    state._fsp--;


                    			current = this_EffectFullSumValue_13;
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
    // InternalFPML.g:4020:1: entryRuleEffectFullProdValue returns [EObject current=null] : iv_ruleEffectFullProdValue= ruleEffectFullProdValue EOF ;
    public final EObject entryRuleEffectFullProdValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullProdValue = null;


        try {
            // InternalFPML.g:4020:60: (iv_ruleEffectFullProdValue= ruleEffectFullProdValue EOF )
            // InternalFPML.g:4021:2: iv_ruleEffectFullProdValue= ruleEffectFullProdValue EOF
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
    // InternalFPML.g:4027:1: ruleEffectFullProdValue returns [EObject current=null] : (otherlv_0= '(' ( (lv_prodAdtElement1_1_0= ruleEffectFullAdtValue ) ) otherlv_2= ',' ( (lv_prodAdtElement2_3_0= ruleEffectFullAdtValue ) ) otherlv_4= ')' ) ;
    public final EObject ruleEffectFullProdValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_prodAdtElement1_1_0 = null;

        EObject lv_prodAdtElement2_3_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:4033:2: ( (otherlv_0= '(' ( (lv_prodAdtElement1_1_0= ruleEffectFullAdtValue ) ) otherlv_2= ',' ( (lv_prodAdtElement2_3_0= ruleEffectFullAdtValue ) ) otherlv_4= ')' ) )
            // InternalFPML.g:4034:2: (otherlv_0= '(' ( (lv_prodAdtElement1_1_0= ruleEffectFullAdtValue ) ) otherlv_2= ',' ( (lv_prodAdtElement2_3_0= ruleEffectFullAdtValue ) ) otherlv_4= ')' )
            {
            // InternalFPML.g:4034:2: (otherlv_0= '(' ( (lv_prodAdtElement1_1_0= ruleEffectFullAdtValue ) ) otherlv_2= ',' ( (lv_prodAdtElement2_3_0= ruleEffectFullAdtValue ) ) otherlv_4= ')' )
            // InternalFPML.g:4035:3: otherlv_0= '(' ( (lv_prodAdtElement1_1_0= ruleEffectFullAdtValue ) ) otherlv_2= ',' ( (lv_prodAdtElement2_3_0= ruleEffectFullAdtValue ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_39); 

            			newLeafNode(otherlv_0, grammarAccess.getEffectFullProdValueAccess().getLeftParenthesisKeyword_0());
            		
            // InternalFPML.g:4039:3: ( (lv_prodAdtElement1_1_0= ruleEffectFullAdtValue ) )
            // InternalFPML.g:4040:4: (lv_prodAdtElement1_1_0= ruleEffectFullAdtValue )
            {
            // InternalFPML.g:4040:4: (lv_prodAdtElement1_1_0= ruleEffectFullAdtValue )
            // InternalFPML.g:4041:5: lv_prodAdtElement1_1_0= ruleEffectFullAdtValue
            {

            					newCompositeNode(grammarAccess.getEffectFullProdValueAccess().getProdAdtElement1EffectFullAdtValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_33);
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

            otherlv_2=(Token)match(input,21,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getEffectFullProdValueAccess().getCommaKeyword_2());
            		
            // InternalFPML.g:4062:3: ( (lv_prodAdtElement2_3_0= ruleEffectFullAdtValue ) )
            // InternalFPML.g:4063:4: (lv_prodAdtElement2_3_0= ruleEffectFullAdtValue )
            {
            // InternalFPML.g:4063:4: (lv_prodAdtElement2_3_0= ruleEffectFullAdtValue )
            // InternalFPML.g:4064:5: lv_prodAdtElement2_3_0= ruleEffectFullAdtValue
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
    // InternalFPML.g:4089:1: entryRuleEffectFullSumValue returns [EObject current=null] : iv_ruleEffectFullSumValue= ruleEffectFullSumValue EOF ;
    public final EObject entryRuleEffectFullSumValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullSumValue = null;


        try {
            // InternalFPML.g:4089:59: (iv_ruleEffectFullSumValue= ruleEffectFullSumValue EOF )
            // InternalFPML.g:4090:2: iv_ruleEffectFullSumValue= ruleEffectFullSumValue EOF
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
    // InternalFPML.g:4096:1: ruleEffectFullSumValue returns [EObject current=null] : ( (otherlv_0= 'Left' otherlv_1= '(' ( (lv_sumAdtElement1_2_0= ruleEffectFullAdtValue ) ) otherlv_3= ')' ) | (otherlv_4= 'Right' otherlv_5= '(' ( (lv_sumAdtElement2_6_0= ruleEffectFullAdtValue ) ) otherlv_7= ')' ) ) ;
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
            // InternalFPML.g:4102:2: ( ( (otherlv_0= 'Left' otherlv_1= '(' ( (lv_sumAdtElement1_2_0= ruleEffectFullAdtValue ) ) otherlv_3= ')' ) | (otherlv_4= 'Right' otherlv_5= '(' ( (lv_sumAdtElement2_6_0= ruleEffectFullAdtValue ) ) otherlv_7= ')' ) ) )
            // InternalFPML.g:4103:2: ( (otherlv_0= 'Left' otherlv_1= '(' ( (lv_sumAdtElement1_2_0= ruleEffectFullAdtValue ) ) otherlv_3= ')' ) | (otherlv_4= 'Right' otherlv_5= '(' ( (lv_sumAdtElement2_6_0= ruleEffectFullAdtValue ) ) otherlv_7= ')' ) )
            {
            // InternalFPML.g:4103:2: ( (otherlv_0= 'Left' otherlv_1= '(' ( (lv_sumAdtElement1_2_0= ruleEffectFullAdtValue ) ) otherlv_3= ')' ) | (otherlv_4= 'Right' otherlv_5= '(' ( (lv_sumAdtElement2_6_0= ruleEffectFullAdtValue ) ) otherlv_7= ')' ) )
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
                    // InternalFPML.g:4104:3: (otherlv_0= 'Left' otherlv_1= '(' ( (lv_sumAdtElement1_2_0= ruleEffectFullAdtValue ) ) otherlv_3= ')' )
                    {
                    // InternalFPML.g:4104:3: (otherlv_0= 'Left' otherlv_1= '(' ( (lv_sumAdtElement1_2_0= ruleEffectFullAdtValue ) ) otherlv_3= ')' )
                    // InternalFPML.g:4105:4: otherlv_0= 'Left' otherlv_1= '(' ( (lv_sumAdtElement1_2_0= ruleEffectFullAdtValue ) ) otherlv_3= ')'
                    {
                    otherlv_0=(Token)match(input,42,FOLLOW_18); 

                    				newLeafNode(otherlv_0, grammarAccess.getEffectFullSumValueAccess().getLeftKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,20,FOLLOW_39); 

                    				newLeafNode(otherlv_1, grammarAccess.getEffectFullSumValueAccess().getLeftParenthesisKeyword_0_1());
                    			
                    // InternalFPML.g:4113:4: ( (lv_sumAdtElement1_2_0= ruleEffectFullAdtValue ) )
                    // InternalFPML.g:4114:5: (lv_sumAdtElement1_2_0= ruleEffectFullAdtValue )
                    {
                    // InternalFPML.g:4114:5: (lv_sumAdtElement1_2_0= ruleEffectFullAdtValue )
                    // InternalFPML.g:4115:6: lv_sumAdtElement1_2_0= ruleEffectFullAdtValue
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
                    // InternalFPML.g:4138:3: (otherlv_4= 'Right' otherlv_5= '(' ( (lv_sumAdtElement2_6_0= ruleEffectFullAdtValue ) ) otherlv_7= ')' )
                    {
                    // InternalFPML.g:4138:3: (otherlv_4= 'Right' otherlv_5= '(' ( (lv_sumAdtElement2_6_0= ruleEffectFullAdtValue ) ) otherlv_7= ')' )
                    // InternalFPML.g:4139:4: otherlv_4= 'Right' otherlv_5= '(' ( (lv_sumAdtElement2_6_0= ruleEffectFullAdtValue ) ) otherlv_7= ')'
                    {
                    otherlv_4=(Token)match(input,43,FOLLOW_18); 

                    				newLeafNode(otherlv_4, grammarAccess.getEffectFullSumValueAccess().getRightKeyword_1_0());
                    			
                    otherlv_5=(Token)match(input,20,FOLLOW_39); 

                    				newLeafNode(otherlv_5, grammarAccess.getEffectFullSumValueAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalFPML.g:4147:4: ( (lv_sumAdtElement2_6_0= ruleEffectFullAdtValue ) )
                    // InternalFPML.g:4148:5: (lv_sumAdtElement2_6_0= ruleEffectFullAdtValue )
                    {
                    // InternalFPML.g:4148:5: (lv_sumAdtElement2_6_0= ruleEffectFullAdtValue )
                    // InternalFPML.g:4149:6: lv_sumAdtElement2_6_0= ruleEffectFullAdtValue
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
    // InternalFPML.g:4175:1: entryRulePrimitivePureFunction returns [EObject current=null] : iv_rulePrimitivePureFunction= rulePrimitivePureFunction EOF ;
    public final EObject entryRulePrimitivePureFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitivePureFunction = null;


        try {
            // InternalFPML.g:4175:62: (iv_rulePrimitivePureFunction= rulePrimitivePureFunction EOF )
            // InternalFPML.g:4176:2: iv_rulePrimitivePureFunction= rulePrimitivePureFunction EOF
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
    // InternalFPML.g:4182:1: rulePrimitivePureFunction returns [EObject current=null] : (this_IntToString_0= ruleIntToString | this_IntPow_1= ruleIntPow | this_Plus_2= rulePlus | this_Minus_3= ruleMinus | this_Times_4= ruleTimes | this_Mod_5= ruleMod | this_ApplyF_6= ruleApplyF ) ;
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
            // InternalFPML.g:4188:2: ( (this_IntToString_0= ruleIntToString | this_IntPow_1= ruleIntPow | this_Plus_2= rulePlus | this_Minus_3= ruleMinus | this_Times_4= ruleTimes | this_Mod_5= ruleMod | this_ApplyF_6= ruleApplyF ) )
            // InternalFPML.g:4189:2: (this_IntToString_0= ruleIntToString | this_IntPow_1= ruleIntPow | this_Plus_2= rulePlus | this_Minus_3= ruleMinus | this_Times_4= ruleTimes | this_Mod_5= ruleMod | this_ApplyF_6= ruleApplyF )
            {
            // InternalFPML.g:4189:2: (this_IntToString_0= ruleIntToString | this_IntPow_1= ruleIntPow | this_Plus_2= rulePlus | this_Minus_3= ruleMinus | this_Times_4= ruleTimes | this_Mod_5= ruleMod | this_ApplyF_6= ruleApplyF )
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
                    // InternalFPML.g:4190:3: this_IntToString_0= ruleIntToString
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
                    // InternalFPML.g:4199:3: this_IntPow_1= ruleIntPow
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
                    // InternalFPML.g:4208:3: this_Plus_2= rulePlus
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
                    // InternalFPML.g:4217:3: this_Minus_3= ruleMinus
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
                    // InternalFPML.g:4226:3: this_Times_4= ruleTimes
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
                    // InternalFPML.g:4235:3: this_Mod_5= ruleMod
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
                    // InternalFPML.g:4244:3: this_ApplyF_6= ruleApplyF
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
    // InternalFPML.g:4256:1: entryRuleIntToString returns [EObject current=null] : iv_ruleIntToString= ruleIntToString EOF ;
    public final EObject entryRuleIntToString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntToString = null;


        try {
            // InternalFPML.g:4256:52: (iv_ruleIntToString= ruleIntToString EOF )
            // InternalFPML.g:4257:2: iv_ruleIntToString= ruleIntToString EOF
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
    // InternalFPML.g:4263:1: ruleIntToString returns [EObject current=null] : ( () otherlv_1= 'IntToString' ) ;
    public final EObject ruleIntToString() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFPML.g:4269:2: ( ( () otherlv_1= 'IntToString' ) )
            // InternalFPML.g:4270:2: ( () otherlv_1= 'IntToString' )
            {
            // InternalFPML.g:4270:2: ( () otherlv_1= 'IntToString' )
            // InternalFPML.g:4271:3: () otherlv_1= 'IntToString'
            {
            // InternalFPML.g:4271:3: ()
            // InternalFPML.g:4272:4: 
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
    // InternalFPML.g:4286:1: entryRuleIntPow returns [EObject current=null] : iv_ruleIntPow= ruleIntPow EOF ;
    public final EObject entryRuleIntPow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntPow = null;


        try {
            // InternalFPML.g:4286:47: (iv_ruleIntPow= ruleIntPow EOF )
            // InternalFPML.g:4287:2: iv_ruleIntPow= ruleIntPow EOF
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
    // InternalFPML.g:4293:1: ruleIntPow returns [EObject current=null] : ( () otherlv_1= 'IntPow' ) ;
    public final EObject ruleIntPow() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFPML.g:4299:2: ( ( () otherlv_1= 'IntPow' ) )
            // InternalFPML.g:4300:2: ( () otherlv_1= 'IntPow' )
            {
            // InternalFPML.g:4300:2: ( () otherlv_1= 'IntPow' )
            // InternalFPML.g:4301:3: () otherlv_1= 'IntPow'
            {
            // InternalFPML.g:4301:3: ()
            // InternalFPML.g:4302:4: 
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
    // InternalFPML.g:4316:1: entryRulePlus returns [EObject current=null] : iv_rulePlus= rulePlus EOF ;
    public final EObject entryRulePlus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlus = null;


        try {
            // InternalFPML.g:4316:45: (iv_rulePlus= rulePlus EOF )
            // InternalFPML.g:4317:2: iv_rulePlus= rulePlus EOF
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
    // InternalFPML.g:4323:1: rulePlus returns [EObject current=null] : ( () otherlv_1= '+' ) ;
    public final EObject rulePlus() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFPML.g:4329:2: ( ( () otherlv_1= '+' ) )
            // InternalFPML.g:4330:2: ( () otherlv_1= '+' )
            {
            // InternalFPML.g:4330:2: ( () otherlv_1= '+' )
            // InternalFPML.g:4331:3: () otherlv_1= '+'
            {
            // InternalFPML.g:4331:3: ()
            // InternalFPML.g:4332:4: 
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
    // InternalFPML.g:4346:1: entryRuleMinus returns [EObject current=null] : iv_ruleMinus= ruleMinus EOF ;
    public final EObject entryRuleMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinus = null;


        try {
            // InternalFPML.g:4346:46: (iv_ruleMinus= ruleMinus EOF )
            // InternalFPML.g:4347:2: iv_ruleMinus= ruleMinus EOF
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
    // InternalFPML.g:4353:1: ruleMinus returns [EObject current=null] : ( () otherlv_1= '-' ) ;
    public final EObject ruleMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFPML.g:4359:2: ( ( () otherlv_1= '-' ) )
            // InternalFPML.g:4360:2: ( () otherlv_1= '-' )
            {
            // InternalFPML.g:4360:2: ( () otherlv_1= '-' )
            // InternalFPML.g:4361:3: () otherlv_1= '-'
            {
            // InternalFPML.g:4361:3: ()
            // InternalFPML.g:4362:4: 
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
    // InternalFPML.g:4376:1: entryRuleTimes returns [EObject current=null] : iv_ruleTimes= ruleTimes EOF ;
    public final EObject entryRuleTimes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimes = null;


        try {
            // InternalFPML.g:4376:46: (iv_ruleTimes= ruleTimes EOF )
            // InternalFPML.g:4377:2: iv_ruleTimes= ruleTimes EOF
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
    // InternalFPML.g:4383:1: ruleTimes returns [EObject current=null] : ( () otherlv_1= '*' ) ;
    public final EObject ruleTimes() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFPML.g:4389:2: ( ( () otherlv_1= '*' ) )
            // InternalFPML.g:4390:2: ( () otherlv_1= '*' )
            {
            // InternalFPML.g:4390:2: ( () otherlv_1= '*' )
            // InternalFPML.g:4391:3: () otherlv_1= '*'
            {
            // InternalFPML.g:4391:3: ()
            // InternalFPML.g:4392:4: 
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
    // InternalFPML.g:4406:1: entryRuleMod returns [EObject current=null] : iv_ruleMod= ruleMod EOF ;
    public final EObject entryRuleMod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMod = null;


        try {
            // InternalFPML.g:4406:44: (iv_ruleMod= ruleMod EOF )
            // InternalFPML.g:4407:2: iv_ruleMod= ruleMod EOF
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
    // InternalFPML.g:4413:1: ruleMod returns [EObject current=null] : ( () otherlv_1= 'mod' ) ;
    public final EObject ruleMod() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFPML.g:4419:2: ( ( () otherlv_1= 'mod' ) )
            // InternalFPML.g:4420:2: ( () otherlv_1= 'mod' )
            {
            // InternalFPML.g:4420:2: ( () otherlv_1= 'mod' )
            // InternalFPML.g:4421:3: () otherlv_1= 'mod'
            {
            // InternalFPML.g:4421:3: ()
            // InternalFPML.g:4422:4: 
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
    // InternalFPML.g:4436:1: entryRuleApplyF returns [EObject current=null] : iv_ruleApplyF= ruleApplyF EOF ;
    public final EObject entryRuleApplyF() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplyF = null;


        try {
            // InternalFPML.g:4436:47: (iv_ruleApplyF= ruleApplyF EOF )
            // InternalFPML.g:4437:2: iv_ruleApplyF= ruleApplyF EOF
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
    // InternalFPML.g:4443:1: ruleApplyF returns [EObject current=null] : ( () otherlv_1= 'applyF' ( (lv_functionType_2_0= rulePureFunctionType ) ) ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleApplyF() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_functionType_2_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:4449:2: ( ( () otherlv_1= 'applyF' ( (lv_functionType_2_0= rulePureFunctionType ) ) ( (otherlv_3= RULE_ID ) ) ) )
            // InternalFPML.g:4450:2: ( () otherlv_1= 'applyF' ( (lv_functionType_2_0= rulePureFunctionType ) ) ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalFPML.g:4450:2: ( () otherlv_1= 'applyF' ( (lv_functionType_2_0= rulePureFunctionType ) ) ( (otherlv_3= RULE_ID ) ) )
            // InternalFPML.g:4451:3: () otherlv_1= 'applyF' ( (lv_functionType_2_0= rulePureFunctionType ) ) ( (otherlv_3= RULE_ID ) )
            {
            // InternalFPML.g:4451:3: ()
            // InternalFPML.g:4452:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getApplyFAccess().getApplyFAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,48,FOLLOW_40); 

            			newLeafNode(otherlv_1, grammarAccess.getApplyFAccess().getApplyFKeyword_1());
            		
            // InternalFPML.g:4462:3: ( (lv_functionType_2_0= rulePureFunctionType ) )
            // InternalFPML.g:4463:4: (lv_functionType_2_0= rulePureFunctionType )
            {
            // InternalFPML.g:4463:4: (lv_functionType_2_0= rulePureFunctionType )
            // InternalFPML.g:4464:5: lv_functionType_2_0= rulePureFunctionType
            {

            					newCompositeNode(grammarAccess.getApplyFAccess().getFunctionTypePureFunctionTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
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

            // InternalFPML.g:4481:3: ( (otherlv_3= RULE_ID ) )
            // InternalFPML.g:4482:4: (otherlv_3= RULE_ID )
            {
            // InternalFPML.g:4482:4: (otherlv_3= RULE_ID )
            // InternalFPML.g:4483:5: otherlv_3= RULE_ID
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
    // InternalFPML.g:4498:1: entryRulePrimitiveEffectFullFunction returns [EObject current=null] : iv_rulePrimitiveEffectFullFunction= rulePrimitiveEffectFullFunction EOF ;
    public final EObject entryRulePrimitiveEffectFullFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveEffectFullFunction = null;


        try {
            // InternalFPML.g:4498:68: (iv_rulePrimitiveEffectFullFunction= rulePrimitiveEffectFullFunction EOF )
            // InternalFPML.g:4499:2: iv_rulePrimitiveEffectFullFunction= rulePrimitiveEffectFullFunction EOF
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
    // InternalFPML.g:4505:1: rulePrimitiveEffectFullFunction returns [EObject current=null] : (this_PrimitivePrint_0= rulePrimitivePrint | this_ApplyFIO_1= ruleApplyFIO | this_PrimitiveReturn_2= rulePrimitiveReturn ) ;
    public final EObject rulePrimitiveEffectFullFunction() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitivePrint_0 = null;

        EObject this_ApplyFIO_1 = null;

        EObject this_PrimitiveReturn_2 = null;



        	enterRule();

        try {
            // InternalFPML.g:4511:2: ( (this_PrimitivePrint_0= rulePrimitivePrint | this_ApplyFIO_1= ruleApplyFIO | this_PrimitiveReturn_2= rulePrimitiveReturn ) )
            // InternalFPML.g:4512:2: (this_PrimitivePrint_0= rulePrimitivePrint | this_ApplyFIO_1= ruleApplyFIO | this_PrimitiveReturn_2= rulePrimitiveReturn )
            {
            // InternalFPML.g:4512:2: (this_PrimitivePrint_0= rulePrimitivePrint | this_ApplyFIO_1= ruleApplyFIO | this_PrimitiveReturn_2= rulePrimitiveReturn )
            int alt36=3;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt36=1;
                }
                break;
            case 53:
                {
                alt36=2;
                }
                break;
            case 51:
                {
                alt36=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // InternalFPML.g:4513:3: this_PrimitivePrint_0= rulePrimitivePrint
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
                    // InternalFPML.g:4522:3: this_ApplyFIO_1= ruleApplyFIO
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
                    // InternalFPML.g:4531:3: this_PrimitiveReturn_2= rulePrimitiveReturn
                    {

                    			newCompositeNode(grammarAccess.getPrimitiveEffectFullFunctionAccess().getPrimitiveReturnParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrimitiveReturn_2=rulePrimitiveReturn();

                    state._fsp--;


                    			current = this_PrimitiveReturn_2;
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
    // InternalFPML.g:4543:1: entryRulePrimitivePrint returns [EObject current=null] : iv_rulePrimitivePrint= rulePrimitivePrint EOF ;
    public final EObject entryRulePrimitivePrint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitivePrint = null;


        try {
            // InternalFPML.g:4543:55: (iv_rulePrimitivePrint= rulePrimitivePrint EOF )
            // InternalFPML.g:4544:2: iv_rulePrimitivePrint= rulePrimitivePrint EOF
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
    // InternalFPML.g:4550:1: rulePrimitivePrint returns [EObject current=null] : ( () otherlv_1= 'print' ) ;
    public final EObject rulePrimitivePrint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFPML.g:4556:2: ( ( () otherlv_1= 'print' ) )
            // InternalFPML.g:4557:2: ( () otherlv_1= 'print' )
            {
            // InternalFPML.g:4557:2: ( () otherlv_1= 'print' )
            // InternalFPML.g:4558:3: () otherlv_1= 'print'
            {
            // InternalFPML.g:4558:3: ()
            // InternalFPML.g:4559:4: 
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
    // InternalFPML.g:4573:1: entryRulePrimitiveEffectFullValue returns [EObject current=null] : iv_rulePrimitiveEffectFullValue= rulePrimitiveEffectFullValue EOF ;
    public final EObject entryRulePrimitiveEffectFullValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveEffectFullValue = null;


        try {
            // InternalFPML.g:4573:65: (iv_rulePrimitiveEffectFullValue= rulePrimitiveEffectFullValue EOF )
            // InternalFPML.g:4574:2: iv_rulePrimitiveEffectFullValue= rulePrimitiveEffectFullValue EOF
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
    // InternalFPML.g:4580:1: rulePrimitiveEffectFullValue returns [EObject current=null] : (this_PrimitiveRandom_0= rulePrimitiveRandom | this_PrimitiveTime_1= rulePrimitiveTime ) ;
    public final EObject rulePrimitiveEffectFullValue() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveRandom_0 = null;

        EObject this_PrimitiveTime_1 = null;



        	enterRule();

        try {
            // InternalFPML.g:4586:2: ( (this_PrimitiveRandom_0= rulePrimitiveRandom | this_PrimitiveTime_1= rulePrimitiveTime ) )
            // InternalFPML.g:4587:2: (this_PrimitiveRandom_0= rulePrimitiveRandom | this_PrimitiveTime_1= rulePrimitiveTime )
            {
            // InternalFPML.g:4587:2: (this_PrimitiveRandom_0= rulePrimitiveRandom | this_PrimitiveTime_1= rulePrimitiveTime )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==50) ) {
                alt37=1;
            }
            else if ( (LA37_0==52) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalFPML.g:4588:3: this_PrimitiveRandom_0= rulePrimitiveRandom
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
                    // InternalFPML.g:4597:3: this_PrimitiveTime_1= rulePrimitiveTime
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
    // InternalFPML.g:4609:1: entryRulePrimitiveRandom returns [EObject current=null] : iv_rulePrimitiveRandom= rulePrimitiveRandom EOF ;
    public final EObject entryRulePrimitiveRandom() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveRandom = null;


        try {
            // InternalFPML.g:4609:56: (iv_rulePrimitiveRandom= rulePrimitiveRandom EOF )
            // InternalFPML.g:4610:2: iv_rulePrimitiveRandom= rulePrimitiveRandom EOF
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
    // InternalFPML.g:4616:1: rulePrimitiveRandom returns [EObject current=null] : ( () otherlv_1= 'randomInt' ) ;
    public final EObject rulePrimitiveRandom() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFPML.g:4622:2: ( ( () otherlv_1= 'randomInt' ) )
            // InternalFPML.g:4623:2: ( () otherlv_1= 'randomInt' )
            {
            // InternalFPML.g:4623:2: ( () otherlv_1= 'randomInt' )
            // InternalFPML.g:4624:3: () otherlv_1= 'randomInt'
            {
            // InternalFPML.g:4624:3: ()
            // InternalFPML.g:4625:4: 
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


    // $ANTLR start "entryRulePrimitiveReturn"
    // InternalFPML.g:4639:1: entryRulePrimitiveReturn returns [EObject current=null] : iv_rulePrimitiveReturn= rulePrimitiveReturn EOF ;
    public final EObject entryRulePrimitiveReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveReturn = null;


        try {
            // InternalFPML.g:4639:56: (iv_rulePrimitiveReturn= rulePrimitiveReturn EOF )
            // InternalFPML.g:4640:2: iv_rulePrimitiveReturn= rulePrimitiveReturn EOF
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
    // InternalFPML.g:4646:1: rulePrimitiveReturn returns [EObject current=null] : ( () otherlv_1= 'return' ( (lv_type_2_0= ruleType ) ) ) ;
    public final EObject rulePrimitiveReturn() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:4652:2: ( ( () otherlv_1= 'return' ( (lv_type_2_0= ruleType ) ) ) )
            // InternalFPML.g:4653:2: ( () otherlv_1= 'return' ( (lv_type_2_0= ruleType ) ) )
            {
            // InternalFPML.g:4653:2: ( () otherlv_1= 'return' ( (lv_type_2_0= ruleType ) ) )
            // InternalFPML.g:4654:3: () otherlv_1= 'return' ( (lv_type_2_0= ruleType ) )
            {
            // InternalFPML.g:4654:3: ()
            // InternalFPML.g:4655:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPrimitiveReturnAccess().getPrimitiveReturnAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,51,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getPrimitiveReturnAccess().getReturnKeyword_1());
            		
            // InternalFPML.g:4665:3: ( (lv_type_2_0= ruleType ) )
            // InternalFPML.g:4666:4: (lv_type_2_0= ruleType )
            {
            // InternalFPML.g:4666:4: (lv_type_2_0= ruleType )
            // InternalFPML.g:4667:5: lv_type_2_0= ruleType
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
    // InternalFPML.g:4688:1: entryRulePrimitiveTime returns [EObject current=null] : iv_rulePrimitiveTime= rulePrimitiveTime EOF ;
    public final EObject entryRulePrimitiveTime() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveTime = null;


        try {
            // InternalFPML.g:4688:54: (iv_rulePrimitiveTime= rulePrimitiveTime EOF )
            // InternalFPML.g:4689:2: iv_rulePrimitiveTime= rulePrimitiveTime EOF
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
    // InternalFPML.g:4695:1: rulePrimitiveTime returns [EObject current=null] : ( () otherlv_1= 'currentTime' ) ;
    public final EObject rulePrimitiveTime() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFPML.g:4701:2: ( ( () otherlv_1= 'currentTime' ) )
            // InternalFPML.g:4702:2: ( () otherlv_1= 'currentTime' )
            {
            // InternalFPML.g:4702:2: ( () otherlv_1= 'currentTime' )
            // InternalFPML.g:4703:3: () otherlv_1= 'currentTime'
            {
            // InternalFPML.g:4703:3: ()
            // InternalFPML.g:4704:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPrimitiveTimeAccess().getPrimitiveTimeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,52,FOLLOW_2); 

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
    // InternalFPML.g:4718:1: entryRuleApplyFIO returns [EObject current=null] : iv_ruleApplyFIO= ruleApplyFIO EOF ;
    public final EObject entryRuleApplyFIO() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplyFIO = null;


        try {
            // InternalFPML.g:4718:49: (iv_ruleApplyFIO= ruleApplyFIO EOF )
            // InternalFPML.g:4719:2: iv_ruleApplyFIO= ruleApplyFIO EOF
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
    // InternalFPML.g:4725:1: ruleApplyFIO returns [EObject current=null] : ( () otherlv_1= 'applyFIO' ( (lv_functionType_2_0= ruleEffectFullFunctionType ) ) ( (lv_value_3_0= ruleApplyFIOFactor ) ) ) ;
    public final EObject ruleApplyFIO() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_functionType_2_0 = null;

        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:4731:2: ( ( () otherlv_1= 'applyFIO' ( (lv_functionType_2_0= ruleEffectFullFunctionType ) ) ( (lv_value_3_0= ruleApplyFIOFactor ) ) ) )
            // InternalFPML.g:4732:2: ( () otherlv_1= 'applyFIO' ( (lv_functionType_2_0= ruleEffectFullFunctionType ) ) ( (lv_value_3_0= ruleApplyFIOFactor ) ) )
            {
            // InternalFPML.g:4732:2: ( () otherlv_1= 'applyFIO' ( (lv_functionType_2_0= ruleEffectFullFunctionType ) ) ( (lv_value_3_0= ruleApplyFIOFactor ) ) )
            // InternalFPML.g:4733:3: () otherlv_1= 'applyFIO' ( (lv_functionType_2_0= ruleEffectFullFunctionType ) ) ( (lv_value_3_0= ruleApplyFIOFactor ) )
            {
            // InternalFPML.g:4733:3: ()
            // InternalFPML.g:4734:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getApplyFIOAccess().getApplyFIOAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,53,FOLLOW_41); 

            			newLeafNode(otherlv_1, grammarAccess.getApplyFIOAccess().getApplyFIOKeyword_1());
            		
            // InternalFPML.g:4744:3: ( (lv_functionType_2_0= ruleEffectFullFunctionType ) )
            // InternalFPML.g:4745:4: (lv_functionType_2_0= ruleEffectFullFunctionType )
            {
            // InternalFPML.g:4745:4: (lv_functionType_2_0= ruleEffectFullFunctionType )
            // InternalFPML.g:4746:5: lv_functionType_2_0= ruleEffectFullFunctionType
            {

            					newCompositeNode(grammarAccess.getApplyFIOAccess().getFunctionTypeEffectFullFunctionTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_24);
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

            // InternalFPML.g:4763:3: ( (lv_value_3_0= ruleApplyFIOFactor ) )
            // InternalFPML.g:4764:4: (lv_value_3_0= ruleApplyFIOFactor )
            {
            // InternalFPML.g:4764:4: (lv_value_3_0= ruleApplyFIOFactor )
            // InternalFPML.g:4765:5: lv_value_3_0= ruleApplyFIOFactor
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
    // InternalFPML.g:4786:1: entryRuleApplyFIOFactor returns [EObject current=null] : iv_ruleApplyFIOFactor= ruleApplyFIOFactor EOF ;
    public final EObject entryRuleApplyFIOFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplyFIOFactor = null;


        try {
            // InternalFPML.g:4786:55: (iv_ruleApplyFIOFactor= ruleApplyFIOFactor EOF )
            // InternalFPML.g:4787:2: iv_ruleApplyFIOFactor= ruleApplyFIOFactor EOF
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
    // InternalFPML.g:4793:1: ruleApplyFIOFactor returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | ( (lv_valuePrimitive_1_0= rulePrimitiveEffectFullValue ) ) ) ;
    public final EObject ruleApplyFIOFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_valuePrimitive_1_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:4799:2: ( ( ( (otherlv_0= RULE_ID ) ) | ( (lv_valuePrimitive_1_0= rulePrimitiveEffectFullValue ) ) ) )
            // InternalFPML.g:4800:2: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_valuePrimitive_1_0= rulePrimitiveEffectFullValue ) ) )
            {
            // InternalFPML.g:4800:2: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_valuePrimitive_1_0= rulePrimitiveEffectFullValue ) ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_ID) ) {
                alt38=1;
            }
            else if ( (LA38_0==50||LA38_0==52) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalFPML.g:4801:3: ( (otherlv_0= RULE_ID ) )
                    {
                    // InternalFPML.g:4801:3: ( (otherlv_0= RULE_ID ) )
                    // InternalFPML.g:4802:4: (otherlv_0= RULE_ID )
                    {
                    // InternalFPML.g:4802:4: (otherlv_0= RULE_ID )
                    // InternalFPML.g:4803:5: otherlv_0= RULE_ID
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
                    // InternalFPML.g:4815:3: ( (lv_valuePrimitive_1_0= rulePrimitiveEffectFullValue ) )
                    {
                    // InternalFPML.g:4815:3: ( (lv_valuePrimitive_1_0= rulePrimitiveEffectFullValue ) )
                    // InternalFPML.g:4816:4: (lv_valuePrimitive_1_0= rulePrimitiveEffectFullValue )
                    {
                    // InternalFPML.g:4816:4: (lv_valuePrimitive_1_0= rulePrimitiveEffectFullValue )
                    // InternalFPML.g:4817:5: lv_valuePrimitive_1_0= rulePrimitiveEffectFullValue
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


    protected DFA33 dfa33 = new DFA33(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\4\uffff\1\12\6\uffff";
    static final String dfa_3s = "\1\4\1\24\2\uffff\1\24\6\uffff";
    static final String dfa_4s = "\1\65\1\45\2\uffff\1\46\6\uffff";
    static final String dfa_5s = "\2\uffff\1\3\1\4\1\uffff\1\5\1\10\1\2\1\1\1\7\1\6";
    static final String dfa_6s = "\13\uffff}>";
    static final String[] dfa_7s = {
            "\1\4\17\uffff\1\5\2\uffff\1\1\1\uffff\1\3\13\uffff\1\3\1\uffff\2\3\1\2\2\6\12\3",
            "\1\10\20\uffff\1\7",
            "",
            "",
            "\1\11\2\12\4\uffff\1\3\12\uffff\1\12",
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

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "3894:2: ( (otherlv_0= 'IO' otherlv_1= '(' ( (lv_innerValue_2_0= rulePureAdtValue ) ) otherlv_3= ')' ) | (otherlv_4= 'IO' otherlv_5= '[' ( (lv_innerValue_6_0= ruleEffectFullAdtValue ) ) otherlv_7= ']' ) | this_UnitValue_8= ruleUnitValue | this_EffectFullFunctionValue_9= ruleEffectFullFunctionValue | this_EffectFullProdValue_10= ruleEffectFullProdValue | this_EffectFullValueRef_11= ruleEffectFullValueRef | this_EffectFullDataValue_12= ruleEffectFullDataValue | this_EffectFullSumValue_13= ruleEffectFullSumValue )";
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
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000022B0000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100070L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000003140800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x003FF3A002800010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0001F18002000010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000033F0800000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x003FF1A002000010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0001F18000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x00000C0000100070L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x003FFFA002900010L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000001000000000L});

}