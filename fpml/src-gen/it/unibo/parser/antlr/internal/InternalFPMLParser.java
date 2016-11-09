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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Pure'", "'{'", "'}'", "'Functions'", "'Data'", "'Value'", "'Effects'", "':'", "'['", "']'", "'+'", "'*'", "'def'", "'('", "')'", "'IO'", "'main'", "'Undefined'", "'|>'", "'>>='", "'int'", "'String'", "'Unit'", "'ref'", "'()'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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
    // InternalFPML.g:128:1: rulePureBlock returns [EObject current=null] : (otherlv_0= 'Pure' otherlv_1= '{' ( (lv_elements_2_0= rulePureFunctionBlock ) ) ( (lv_elements_3_0= ruleDataBlock ) ) otherlv_4= '}' ) ;
    public final EObject rulePureBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:134:2: ( (otherlv_0= 'Pure' otherlv_1= '{' ( (lv_elements_2_0= rulePureFunctionBlock ) ) ( (lv_elements_3_0= ruleDataBlock ) ) otherlv_4= '}' ) )
            // InternalFPML.g:135:2: (otherlv_0= 'Pure' otherlv_1= '{' ( (lv_elements_2_0= rulePureFunctionBlock ) ) ( (lv_elements_3_0= ruleDataBlock ) ) otherlv_4= '}' )
            {
            // InternalFPML.g:135:2: (otherlv_0= 'Pure' otherlv_1= '{' ( (lv_elements_2_0= rulePureFunctionBlock ) ) ( (lv_elements_3_0= ruleDataBlock ) ) otherlv_4= '}' )
            // InternalFPML.g:136:3: otherlv_0= 'Pure' otherlv_1= '{' ( (lv_elements_2_0= rulePureFunctionBlock ) ) ( (lv_elements_3_0= ruleDataBlock ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPureBlockAccess().getPureKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getPureBlockAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalFPML.g:144:3: ( (lv_elements_2_0= rulePureFunctionBlock ) )
            // InternalFPML.g:145:4: (lv_elements_2_0= rulePureFunctionBlock )
            {
            // InternalFPML.g:145:4: (lv_elements_2_0= rulePureFunctionBlock )
            // InternalFPML.g:146:5: lv_elements_2_0= rulePureFunctionBlock
            {

            					newCompositeNode(grammarAccess.getPureBlockAccess().getElementsPureFunctionBlockParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_elements_2_0=rulePureFunctionBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPureBlockRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_2_0,
            						"it.unibo.FPML.PureFunctionBlock");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFPML.g:163:3: ( (lv_elements_3_0= ruleDataBlock ) )
            // InternalFPML.g:164:4: (lv_elements_3_0= ruleDataBlock )
            {
            // InternalFPML.g:164:4: (lv_elements_3_0= ruleDataBlock )
            // InternalFPML.g:165:5: lv_elements_3_0= ruleDataBlock
            {

            					newCompositeNode(grammarAccess.getPureBlockAccess().getElementsDataBlockParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_elements_3_0=ruleDataBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPureBlockRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_3_0,
            						"it.unibo.FPML.DataBlock");
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
    // InternalFPML.g:197:1: rulePureFunctionBlock returns [EObject current=null] : (otherlv_0= 'Functions' otherlv_1= '{' ( (lv_features_2_0= rulePureFunction ) )* otherlv_3= '}' ) ;
    public final EObject rulePureFunctionBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_features_2_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:203:2: ( (otherlv_0= 'Functions' otherlv_1= '{' ( (lv_features_2_0= rulePureFunction ) )* otherlv_3= '}' ) )
            // InternalFPML.g:204:2: (otherlv_0= 'Functions' otherlv_1= '{' ( (lv_features_2_0= rulePureFunction ) )* otherlv_3= '}' )
            {
            // InternalFPML.g:204:2: (otherlv_0= 'Functions' otherlv_1= '{' ( (lv_features_2_0= rulePureFunction ) )* otherlv_3= '}' )
            // InternalFPML.g:205:3: otherlv_0= 'Functions' otherlv_1= '{' ( (lv_features_2_0= rulePureFunction ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPureFunctionBlockAccess().getFunctionsKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getPureFunctionBlockAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalFPML.g:213:3: ( (lv_features_2_0= rulePureFunction ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==23) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalFPML.g:214:4: (lv_features_2_0= rulePureFunction )
            	    {
            	    // InternalFPML.g:214:4: (lv_features_2_0= rulePureFunction )
            	    // InternalFPML.g:215:5: lv_features_2_0= rulePureFunction
            	    {

            	    					newCompositeNode(grammarAccess.getPureFunctionBlockAccess().getFeaturesPureFunctionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_features_2_0=rulePureFunction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPureFunctionBlockRule());
            	    					}
            	    					add(
            	    						current,
            	    						"features",
            	    						lv_features_2_0,
            	    						"it.unibo.FPML.PureFunction");
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


    // $ANTLR start "entryRuleDataBlock"
    // InternalFPML.g:240:1: entryRuleDataBlock returns [EObject current=null] : iv_ruleDataBlock= ruleDataBlock EOF ;
    public final EObject entryRuleDataBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataBlock = null;


        try {
            // InternalFPML.g:240:50: (iv_ruleDataBlock= ruleDataBlock EOF )
            // InternalFPML.g:241:2: iv_ruleDataBlock= ruleDataBlock EOF
            {
             newCompositeNode(grammarAccess.getDataBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataBlock=ruleDataBlock();

            state._fsp--;

             current =iv_ruleDataBlock; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataBlock"


    // $ANTLR start "ruleDataBlock"
    // InternalFPML.g:247:1: ruleDataBlock returns [EObject current=null] : (otherlv_0= 'Data' otherlv_1= '{' ( (lv_elements_2_0= ruleData ) )* ( (lv_value_3_0= ruleValueBlock ) ) otherlv_4= '}' ) ;
    public final EObject ruleDataBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_elements_2_0 = null;

        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:253:2: ( (otherlv_0= 'Data' otherlv_1= '{' ( (lv_elements_2_0= ruleData ) )* ( (lv_value_3_0= ruleValueBlock ) ) otherlv_4= '}' ) )
            // InternalFPML.g:254:2: (otherlv_0= 'Data' otherlv_1= '{' ( (lv_elements_2_0= ruleData ) )* ( (lv_value_3_0= ruleValueBlock ) ) otherlv_4= '}' )
            {
            // InternalFPML.g:254:2: (otherlv_0= 'Data' otherlv_1= '{' ( (lv_elements_2_0= ruleData ) )* ( (lv_value_3_0= ruleValueBlock ) ) otherlv_4= '}' )
            // InternalFPML.g:255:3: otherlv_0= 'Data' otherlv_1= '{' ( (lv_elements_2_0= ruleData ) )* ( (lv_value_3_0= ruleValueBlock ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDataBlockAccess().getDataKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getDataBlockAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalFPML.g:263:3: ( (lv_elements_2_0= ruleData ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalFPML.g:264:4: (lv_elements_2_0= ruleData )
            	    {
            	    // InternalFPML.g:264:4: (lv_elements_2_0= ruleData )
            	    // InternalFPML.g:265:5: lv_elements_2_0= ruleData
            	    {

            	    					newCompositeNode(grammarAccess.getDataBlockAccess().getElementsDataParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_elements_2_0=ruleData();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDataBlockRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_2_0,
            	    						"it.unibo.FPML.Data");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalFPML.g:282:3: ( (lv_value_3_0= ruleValueBlock ) )
            // InternalFPML.g:283:4: (lv_value_3_0= ruleValueBlock )
            {
            // InternalFPML.g:283:4: (lv_value_3_0= ruleValueBlock )
            // InternalFPML.g:284:5: lv_value_3_0= ruleValueBlock
            {

            					newCompositeNode(grammarAccess.getDataBlockAccess().getValueValueBlockParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_value_3_0=ruleValueBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataBlockRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"it.unibo.FPML.ValueBlock");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDataBlockAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataBlock"


    // $ANTLR start "entryRuleValueBlock"
    // InternalFPML.g:309:1: entryRuleValueBlock returns [EObject current=null] : iv_ruleValueBlock= ruleValueBlock EOF ;
    public final EObject entryRuleValueBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueBlock = null;


        try {
            // InternalFPML.g:309:51: (iv_ruleValueBlock= ruleValueBlock EOF )
            // InternalFPML.g:310:2: iv_ruleValueBlock= ruleValueBlock EOF
            {
             newCompositeNode(grammarAccess.getValueBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValueBlock=ruleValueBlock();

            state._fsp--;

             current =iv_ruleValueBlock; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValueBlock"


    // $ANTLR start "ruleValueBlock"
    // InternalFPML.g:316:1: ruleValueBlock returns [EObject current=null] : (otherlv_0= 'Value' otherlv_1= '{' ( (lv_elements_2_0= ruleValue ) )* otherlv_3= '}' ) ;
    public final EObject ruleValueBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:322:2: ( (otherlv_0= 'Value' otherlv_1= '{' ( (lv_elements_2_0= ruleValue ) )* otherlv_3= '}' ) )
            // InternalFPML.g:323:2: (otherlv_0= 'Value' otherlv_1= '{' ( (lv_elements_2_0= ruleValue ) )* otherlv_3= '}' )
            {
            // InternalFPML.g:323:2: (otherlv_0= 'Value' otherlv_1= '{' ( (lv_elements_2_0= ruleValue ) )* otherlv_3= '}' )
            // InternalFPML.g:324:3: otherlv_0= 'Value' otherlv_1= '{' ( (lv_elements_2_0= ruleValue ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getValueBlockAccess().getValueKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getValueBlockAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalFPML.g:332:3: ( (lv_elements_2_0= ruleValue ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalFPML.g:333:4: (lv_elements_2_0= ruleValue )
            	    {
            	    // InternalFPML.g:333:4: (lv_elements_2_0= ruleValue )
            	    // InternalFPML.g:334:5: lv_elements_2_0= ruleValue
            	    {

            	    					newCompositeNode(grammarAccess.getValueBlockAccess().getElementsValueParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_elements_2_0=ruleValue();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getValueBlockRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_2_0,
            	    						"it.unibo.FPML.Value");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getValueBlockAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValueBlock"


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
    // InternalFPML.g:366:1: ruleEffectFullBlock returns [EObject current=null] : (otherlv_0= 'Effects' otherlv_1= '{' ( (lv_features_2_0= ruleEffectFullFunction ) )* ( (lv_main_3_0= ruleMainFunc ) ) otherlv_4= '}' ) ;
    public final EObject ruleEffectFullBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_features_2_0 = null;

        EObject lv_main_3_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:372:2: ( (otherlv_0= 'Effects' otherlv_1= '{' ( (lv_features_2_0= ruleEffectFullFunction ) )* ( (lv_main_3_0= ruleMainFunc ) ) otherlv_4= '}' ) )
            // InternalFPML.g:373:2: (otherlv_0= 'Effects' otherlv_1= '{' ( (lv_features_2_0= ruleEffectFullFunction ) )* ( (lv_main_3_0= ruleMainFunc ) ) otherlv_4= '}' )
            {
            // InternalFPML.g:373:2: (otherlv_0= 'Effects' otherlv_1= '{' ( (lv_features_2_0= ruleEffectFullFunction ) )* ( (lv_main_3_0= ruleMainFunc ) ) otherlv_4= '}' )
            // InternalFPML.g:374:3: otherlv_0= 'Effects' otherlv_1= '{' ( (lv_features_2_0= ruleEffectFullFunction ) )* ( (lv_main_3_0= ruleMainFunc ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEffectFullBlockAccess().getEffectsKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getEffectFullBlockAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalFPML.g:382:3: ( (lv_features_2_0= ruleEffectFullFunction ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==23) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalFPML.g:383:4: (lv_features_2_0= ruleEffectFullFunction )
            	    {
            	    // InternalFPML.g:383:4: (lv_features_2_0= ruleEffectFullFunction )
            	    // InternalFPML.g:384:5: lv_features_2_0= ruleEffectFullFunction
            	    {

            	    					newCompositeNode(grammarAccess.getEffectFullBlockAccess().getFeaturesEffectFullFunctionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_features_2_0=ruleEffectFullFunction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEffectFullBlockRule());
            	    					}
            	    					add(
            	    						current,
            	    						"features",
            	    						lv_features_2_0,
            	    						"it.unibo.FPML.EffectFullFunction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalFPML.g:401:3: ( (lv_main_3_0= ruleMainFunc ) )
            // InternalFPML.g:402:4: (lv_main_3_0= ruleMainFunc )
            {
            // InternalFPML.g:402:4: (lv_main_3_0= ruleMainFunc )
            // InternalFPML.g:403:5: lv_main_3_0= ruleMainFunc
            {

            					newCompositeNode(grammarAccess.getEffectFullBlockAccess().getMainMainFuncParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_main_3_0=ruleMainFunc();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEffectFullBlockRule());
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


    // $ANTLR start "entryRuleData"
    // InternalFPML.g:428:1: entryRuleData returns [EObject current=null] : iv_ruleData= ruleData EOF ;
    public final EObject entryRuleData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleData = null;


        try {
            // InternalFPML.g:428:45: (iv_ruleData= ruleData EOF )
            // InternalFPML.g:429:2: iv_ruleData= ruleData EOF
            {
             newCompositeNode(grammarAccess.getDataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleData=ruleData();

            state._fsp--;

             current =iv_ruleData; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleData"


    // $ANTLR start "ruleData"
    // InternalFPML.g:435:1: ruleData returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_content_2_0= ruleAdtType ) ) ) ;
    public final EObject ruleData() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_content_2_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:441:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_content_2_0= ruleAdtType ) ) ) )
            // InternalFPML.g:442:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_content_2_0= ruleAdtType ) ) )
            {
            // InternalFPML.g:442:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_content_2_0= ruleAdtType ) ) )
            // InternalFPML.g:443:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_content_2_0= ruleAdtType ) )
            {
            // InternalFPML.g:443:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalFPML.g:444:4: (lv_name_0_0= RULE_ID )
            {
            // InternalFPML.g:444:4: (lv_name_0_0= RULE_ID )
            // InternalFPML.g:445:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_0_0, grammarAccess.getDataAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getDataAccess().getColonKeyword_1());
            		
            // InternalFPML.g:465:3: ( (lv_content_2_0= ruleAdtType ) )
            // InternalFPML.g:466:4: (lv_content_2_0= ruleAdtType )
            {
            // InternalFPML.g:466:4: (lv_content_2_0= ruleAdtType )
            // InternalFPML.g:467:5: lv_content_2_0= ruleAdtType
            {

            					newCompositeNode(grammarAccess.getDataAccess().getContentAdtTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_content_2_0=ruleAdtType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataRule());
            					}
            					set(
            						current,
            						"content",
            						lv_content_2_0,
            						"it.unibo.FPML.AdtType");
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
    // $ANTLR end "ruleData"


    // $ANTLR start "entryRuleValue"
    // InternalFPML.g:488:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalFPML.g:488:46: (iv_ruleValue= ruleValue EOF )
            // InternalFPML.g:489:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalFPML.g:495:1: ruleValue returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleExpression ) ) ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:501:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleExpression ) ) ) )
            // InternalFPML.g:502:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleExpression ) ) )
            {
            // InternalFPML.g:502:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleExpression ) ) )
            // InternalFPML.g:503:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleExpression ) )
            {
            // InternalFPML.g:503:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalFPML.g:504:4: (lv_name_0_0= RULE_ID )
            {
            // InternalFPML.g:504:4: (lv_name_0_0= RULE_ID )
            // InternalFPML.g:505:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_0_0, grammarAccess.getValueAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getValueRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getValueAccess().getColonKeyword_1());
            		
            // InternalFPML.g:525:3: ( (lv_value_2_0= ruleExpression ) )
            // InternalFPML.g:526:4: (lv_value_2_0= ruleExpression )
            {
            // InternalFPML.g:526:4: (lv_value_2_0= ruleExpression )
            // InternalFPML.g:527:5: lv_value_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getValueAccess().getValueExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getValueRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleAdtType"
    // InternalFPML.g:548:1: entryRuleAdtType returns [EObject current=null] : iv_ruleAdtType= ruleAdtType EOF ;
    public final EObject entryRuleAdtType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdtType = null;


        try {
            // InternalFPML.g:548:48: (iv_ruleAdtType= ruleAdtType EOF )
            // InternalFPML.g:549:2: iv_ruleAdtType= ruleAdtType EOF
            {
             newCompositeNode(grammarAccess.getAdtTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdtType=ruleAdtType();

            state._fsp--;

             current =iv_ruleAdtType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdtType"


    // $ANTLR start "ruleAdtType"
    // InternalFPML.g:555:1: ruleAdtType returns [EObject current=null] : (this_ValueType_0= ruleValueType | (otherlv_1= '[' ( (lv_adtElement1_2_0= ruleAdtType ) ) ( ( (lv_adtElement2_3_1= ruleSumType | lv_adtElement2_3_2= ruleProdType ) ) ) otherlv_4= ']' ) ) ;
    public final EObject ruleAdtType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject this_ValueType_0 = null;

        EObject lv_adtElement1_2_0 = null;

        EObject lv_adtElement2_3_1 = null;

        EObject lv_adtElement2_3_2 = null;



        	enterRule();

        try {
            // InternalFPML.g:561:2: ( (this_ValueType_0= ruleValueType | (otherlv_1= '[' ( (lv_adtElement1_2_0= ruleAdtType ) ) ( ( (lv_adtElement2_3_1= ruleSumType | lv_adtElement2_3_2= ruleProdType ) ) ) otherlv_4= ']' ) ) )
            // InternalFPML.g:562:2: (this_ValueType_0= ruleValueType | (otherlv_1= '[' ( (lv_adtElement1_2_0= ruleAdtType ) ) ( ( (lv_adtElement2_3_1= ruleSumType | lv_adtElement2_3_2= ruleProdType ) ) ) otherlv_4= ']' ) )
            {
            // InternalFPML.g:562:2: (this_ValueType_0= ruleValueType | (otherlv_1= '[' ( (lv_adtElement1_2_0= ruleAdtType ) ) ( ( (lv_adtElement2_3_1= ruleSumType | lv_adtElement2_3_2= ruleProdType ) ) ) otherlv_4= ']' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=31 && LA6_0<=32)||LA6_0==34) ) {
                alt6=1;
            }
            else if ( (LA6_0==19) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalFPML.g:563:3: this_ValueType_0= ruleValueType
                    {

                    			newCompositeNode(grammarAccess.getAdtTypeAccess().getValueTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ValueType_0=ruleValueType();

                    state._fsp--;


                    			current = this_ValueType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFPML.g:572:3: (otherlv_1= '[' ( (lv_adtElement1_2_0= ruleAdtType ) ) ( ( (lv_adtElement2_3_1= ruleSumType | lv_adtElement2_3_2= ruleProdType ) ) ) otherlv_4= ']' )
                    {
                    // InternalFPML.g:572:3: (otherlv_1= '[' ( (lv_adtElement1_2_0= ruleAdtType ) ) ( ( (lv_adtElement2_3_1= ruleSumType | lv_adtElement2_3_2= ruleProdType ) ) ) otherlv_4= ']' )
                    // InternalFPML.g:573:4: otherlv_1= '[' ( (lv_adtElement1_2_0= ruleAdtType ) ) ( ( (lv_adtElement2_3_1= ruleSumType | lv_adtElement2_3_2= ruleProdType ) ) ) otherlv_4= ']'
                    {
                    otherlv_1=(Token)match(input,19,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getAdtTypeAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalFPML.g:577:4: ( (lv_adtElement1_2_0= ruleAdtType ) )
                    // InternalFPML.g:578:5: (lv_adtElement1_2_0= ruleAdtType )
                    {
                    // InternalFPML.g:578:5: (lv_adtElement1_2_0= ruleAdtType )
                    // InternalFPML.g:579:6: lv_adtElement1_2_0= ruleAdtType
                    {

                    						newCompositeNode(grammarAccess.getAdtTypeAccess().getAdtElement1AdtTypeParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_adtElement1_2_0=ruleAdtType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAdtTypeRule());
                    						}
                    						set(
                    							current,
                    							"adtElement1",
                    							lv_adtElement1_2_0,
                    							"it.unibo.FPML.AdtType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFPML.g:596:4: ( ( (lv_adtElement2_3_1= ruleSumType | lv_adtElement2_3_2= ruleProdType ) ) )
                    // InternalFPML.g:597:5: ( (lv_adtElement2_3_1= ruleSumType | lv_adtElement2_3_2= ruleProdType ) )
                    {
                    // InternalFPML.g:597:5: ( (lv_adtElement2_3_1= ruleSumType | lv_adtElement2_3_2= ruleProdType ) )
                    // InternalFPML.g:598:6: (lv_adtElement2_3_1= ruleSumType | lv_adtElement2_3_2= ruleProdType )
                    {
                    // InternalFPML.g:598:6: (lv_adtElement2_3_1= ruleSumType | lv_adtElement2_3_2= ruleProdType )
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==21) ) {
                        alt5=1;
                    }
                    else if ( (LA5_0==22) ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        throw nvae;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalFPML.g:599:7: lv_adtElement2_3_1= ruleSumType
                            {

                            							newCompositeNode(grammarAccess.getAdtTypeAccess().getAdtElement2SumTypeParserRuleCall_1_2_0_0());
                            						
                            pushFollow(FOLLOW_16);
                            lv_adtElement2_3_1=ruleSumType();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getAdtTypeRule());
                            							}
                            							set(
                            								current,
                            								"adtElement2",
                            								lv_adtElement2_3_1,
                            								"it.unibo.FPML.SumType");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;
                        case 2 :
                            // InternalFPML.g:615:7: lv_adtElement2_3_2= ruleProdType
                            {

                            							newCompositeNode(grammarAccess.getAdtTypeAccess().getAdtElement2ProdTypeParserRuleCall_1_2_0_1());
                            						
                            pushFollow(FOLLOW_16);
                            lv_adtElement2_3_2=ruleProdType();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getAdtTypeRule());
                            							}
                            							set(
                            								current,
                            								"adtElement2",
                            								lv_adtElement2_3_2,
                            								"it.unibo.FPML.ProdType");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;

                    }


                    }


                    }

                    otherlv_4=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getAdtTypeAccess().getRightSquareBracketKeyword_1_3());
                    			

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
    // $ANTLR end "ruleAdtType"


    // $ANTLR start "entryRuleSumType"
    // InternalFPML.g:642:1: entryRuleSumType returns [EObject current=null] : iv_ruleSumType= ruleSumType EOF ;
    public final EObject entryRuleSumType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumType = null;


        try {
            // InternalFPML.g:642:48: (iv_ruleSumType= ruleSumType EOF )
            // InternalFPML.g:643:2: iv_ruleSumType= ruleSumType EOF
            {
             newCompositeNode(grammarAccess.getSumTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSumType=ruleSumType();

            state._fsp--;

             current =iv_ruleSumType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSumType"


    // $ANTLR start "ruleSumType"
    // InternalFPML.g:649:1: ruleSumType returns [EObject current=null] : (otherlv_0= '+' ( (lv_adtElement_1_0= ruleAdtType ) ) ) ;
    public final EObject ruleSumType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_adtElement_1_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:655:2: ( (otherlv_0= '+' ( (lv_adtElement_1_0= ruleAdtType ) ) ) )
            // InternalFPML.g:656:2: (otherlv_0= '+' ( (lv_adtElement_1_0= ruleAdtType ) ) )
            {
            // InternalFPML.g:656:2: (otherlv_0= '+' ( (lv_adtElement_1_0= ruleAdtType ) ) )
            // InternalFPML.g:657:3: otherlv_0= '+' ( (lv_adtElement_1_0= ruleAdtType ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getSumTypeAccess().getPlusSignKeyword_0());
            		
            // InternalFPML.g:661:3: ( (lv_adtElement_1_0= ruleAdtType ) )
            // InternalFPML.g:662:4: (lv_adtElement_1_0= ruleAdtType )
            {
            // InternalFPML.g:662:4: (lv_adtElement_1_0= ruleAdtType )
            // InternalFPML.g:663:5: lv_adtElement_1_0= ruleAdtType
            {

            					newCompositeNode(grammarAccess.getSumTypeAccess().getAdtElementAdtTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_adtElement_1_0=ruleAdtType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSumTypeRule());
            					}
            					set(
            						current,
            						"adtElement",
            						lv_adtElement_1_0,
            						"it.unibo.FPML.AdtType");
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
    // $ANTLR end "ruleSumType"


    // $ANTLR start "entryRuleProdType"
    // InternalFPML.g:684:1: entryRuleProdType returns [EObject current=null] : iv_ruleProdType= ruleProdType EOF ;
    public final EObject entryRuleProdType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProdType = null;


        try {
            // InternalFPML.g:684:49: (iv_ruleProdType= ruleProdType EOF )
            // InternalFPML.g:685:2: iv_ruleProdType= ruleProdType EOF
            {
             newCompositeNode(grammarAccess.getProdTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProdType=ruleProdType();

            state._fsp--;

             current =iv_ruleProdType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProdType"


    // $ANTLR start "ruleProdType"
    // InternalFPML.g:691:1: ruleProdType returns [EObject current=null] : (otherlv_0= '*' ( (lv_adtElement_1_0= ruleAdtType ) ) ) ;
    public final EObject ruleProdType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_adtElement_1_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:697:2: ( (otherlv_0= '*' ( (lv_adtElement_1_0= ruleAdtType ) ) ) )
            // InternalFPML.g:698:2: (otherlv_0= '*' ( (lv_adtElement_1_0= ruleAdtType ) ) )
            {
            // InternalFPML.g:698:2: (otherlv_0= '*' ( (lv_adtElement_1_0= ruleAdtType ) ) )
            // InternalFPML.g:699:3: otherlv_0= '*' ( (lv_adtElement_1_0= ruleAdtType ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getProdTypeAccess().getAsteriskKeyword_0());
            		
            // InternalFPML.g:703:3: ( (lv_adtElement_1_0= ruleAdtType ) )
            // InternalFPML.g:704:4: (lv_adtElement_1_0= ruleAdtType )
            {
            // InternalFPML.g:704:4: (lv_adtElement_1_0= ruleAdtType )
            // InternalFPML.g:705:5: lv_adtElement_1_0= ruleAdtType
            {

            					newCompositeNode(grammarAccess.getProdTypeAccess().getAdtElementAdtTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_adtElement_1_0=ruleAdtType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProdTypeRule());
            					}
            					set(
            						current,
            						"adtElement",
            						lv_adtElement_1_0,
            						"it.unibo.FPML.AdtType");
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
    // $ANTLR end "ruleProdType"


    // $ANTLR start "entryRulePureFunction"
    // InternalFPML.g:726:1: entryRulePureFunction returns [EObject current=null] : iv_rulePureFunction= rulePureFunction EOF ;
    public final EObject entryRulePureFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePureFunction = null;


        try {
            // InternalFPML.g:726:53: (iv_rulePureFunction= rulePureFunction EOF )
            // InternalFPML.g:727:2: iv_rulePureFunction= rulePureFunction EOF
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
    // InternalFPML.g:733:1: rulePureFunction returns [EObject current=null] : (otherlv_0= 'def' ( (lv_returnType_1_0= ruleValueType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_arg_4_0= ruleArgument ) ) otherlv_5= ')' otherlv_6= ':' otherlv_7= '{' ( (lv_functionBody_8_0= ruleFunctionBodyPure ) ) otherlv_9= '}' ) ;
    public final EObject rulePureFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_returnType_1_0 = null;

        EObject lv_arg_4_0 = null;

        EObject lv_functionBody_8_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:739:2: ( (otherlv_0= 'def' ( (lv_returnType_1_0= ruleValueType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_arg_4_0= ruleArgument ) ) otherlv_5= ')' otherlv_6= ':' otherlv_7= '{' ( (lv_functionBody_8_0= ruleFunctionBodyPure ) ) otherlv_9= '}' ) )
            // InternalFPML.g:740:2: (otherlv_0= 'def' ( (lv_returnType_1_0= ruleValueType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_arg_4_0= ruleArgument ) ) otherlv_5= ')' otherlv_6= ':' otherlv_7= '{' ( (lv_functionBody_8_0= ruleFunctionBodyPure ) ) otherlv_9= '}' )
            {
            // InternalFPML.g:740:2: (otherlv_0= 'def' ( (lv_returnType_1_0= ruleValueType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_arg_4_0= ruleArgument ) ) otherlv_5= ')' otherlv_6= ':' otherlv_7= '{' ( (lv_functionBody_8_0= ruleFunctionBodyPure ) ) otherlv_9= '}' )
            // InternalFPML.g:741:3: otherlv_0= 'def' ( (lv_returnType_1_0= ruleValueType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_arg_4_0= ruleArgument ) ) otherlv_5= ')' otherlv_6= ':' otherlv_7= '{' ( (lv_functionBody_8_0= ruleFunctionBodyPure ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getPureFunctionAccess().getDefKeyword_0());
            		
            // InternalFPML.g:745:3: ( (lv_returnType_1_0= ruleValueType ) )
            // InternalFPML.g:746:4: (lv_returnType_1_0= ruleValueType )
            {
            // InternalFPML.g:746:4: (lv_returnType_1_0= ruleValueType )
            // InternalFPML.g:747:5: lv_returnType_1_0= ruleValueType
            {

            					newCompositeNode(grammarAccess.getPureFunctionAccess().getReturnTypeValueTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_18);
            lv_returnType_1_0=ruleValueType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPureFunctionRule());
            					}
            					set(
            						current,
            						"returnType",
            						lv_returnType_1_0,
            						"it.unibo.FPML.ValueType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFPML.g:764:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalFPML.g:765:4: (lv_name_2_0= RULE_ID )
            {
            // InternalFPML.g:765:4: (lv_name_2_0= RULE_ID )
            // InternalFPML.g:766:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(lv_name_2_0, grammarAccess.getPureFunctionAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPureFunctionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getPureFunctionAccess().getLeftParenthesisKeyword_3());
            		
            // InternalFPML.g:786:3: ( (lv_arg_4_0= ruleArgument ) )
            // InternalFPML.g:787:4: (lv_arg_4_0= ruleArgument )
            {
            // InternalFPML.g:787:4: (lv_arg_4_0= ruleArgument )
            // InternalFPML.g:788:5: lv_arg_4_0= ruleArgument
            {

            					newCompositeNode(grammarAccess.getPureFunctionAccess().getArgArgumentParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_20);
            lv_arg_4_0=ruleArgument();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPureFunctionRule());
            					}
            					set(
            						current,
            						"arg",
            						lv_arg_4_0,
            						"it.unibo.FPML.Argument");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,25,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getPureFunctionAccess().getRightParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getPureFunctionAccess().getColonKeyword_6());
            		
            otherlv_7=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_7, grammarAccess.getPureFunctionAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalFPML.g:817:3: ( (lv_functionBody_8_0= ruleFunctionBodyPure ) )
            // InternalFPML.g:818:4: (lv_functionBody_8_0= ruleFunctionBodyPure )
            {
            // InternalFPML.g:818:4: (lv_functionBody_8_0= ruleFunctionBodyPure )
            // InternalFPML.g:819:5: lv_functionBody_8_0= ruleFunctionBodyPure
            {

            					newCompositeNode(grammarAccess.getPureFunctionAccess().getFunctionBodyFunctionBodyPureParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_7);
            lv_functionBody_8_0=ruleFunctionBodyPure();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPureFunctionRule());
            					}
            					set(
            						current,
            						"functionBody",
            						lv_functionBody_8_0,
            						"it.unibo.FPML.FunctionBodyPure");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getPureFunctionAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

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
    // InternalFPML.g:844:1: entryRuleEffectFullFunction returns [EObject current=null] : iv_ruleEffectFullFunction= ruleEffectFullFunction EOF ;
    public final EObject entryRuleEffectFullFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullFunction = null;


        try {
            // InternalFPML.g:844:59: (iv_ruleEffectFullFunction= ruleEffectFullFunction EOF )
            // InternalFPML.g:845:2: iv_ruleEffectFullFunction= ruleEffectFullFunction EOF
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
    // InternalFPML.g:851:1: ruleEffectFullFunction returns [EObject current=null] : (otherlv_0= 'def' ( (lv_returnType_1_0= ruleIOType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_arg_4_0= ruleEffectFullArgument ) ) otherlv_5= ')' otherlv_6= ':' otherlv_7= '{' ( (lv_functionBody_8_0= ruleFunctionBodyEffectFull ) ) otherlv_9= '}' ) ;
    public final EObject ruleEffectFullFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_returnType_1_0 = null;

        EObject lv_arg_4_0 = null;

        EObject lv_functionBody_8_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:857:2: ( (otherlv_0= 'def' ( (lv_returnType_1_0= ruleIOType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_arg_4_0= ruleEffectFullArgument ) ) otherlv_5= ')' otherlv_6= ':' otherlv_7= '{' ( (lv_functionBody_8_0= ruleFunctionBodyEffectFull ) ) otherlv_9= '}' ) )
            // InternalFPML.g:858:2: (otherlv_0= 'def' ( (lv_returnType_1_0= ruleIOType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_arg_4_0= ruleEffectFullArgument ) ) otherlv_5= ')' otherlv_6= ':' otherlv_7= '{' ( (lv_functionBody_8_0= ruleFunctionBodyEffectFull ) ) otherlv_9= '}' )
            {
            // InternalFPML.g:858:2: (otherlv_0= 'def' ( (lv_returnType_1_0= ruleIOType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_arg_4_0= ruleEffectFullArgument ) ) otherlv_5= ')' otherlv_6= ':' otherlv_7= '{' ( (lv_functionBody_8_0= ruleFunctionBodyEffectFull ) ) otherlv_9= '}' )
            // InternalFPML.g:859:3: otherlv_0= 'def' ( (lv_returnType_1_0= ruleIOType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_arg_4_0= ruleEffectFullArgument ) ) otherlv_5= ')' otherlv_6= ':' otherlv_7= '{' ( (lv_functionBody_8_0= ruleFunctionBodyEffectFull ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getEffectFullFunctionAccess().getDefKeyword_0());
            		
            // InternalFPML.g:863:3: ( (lv_returnType_1_0= ruleIOType ) )
            // InternalFPML.g:864:4: (lv_returnType_1_0= ruleIOType )
            {
            // InternalFPML.g:864:4: (lv_returnType_1_0= ruleIOType )
            // InternalFPML.g:865:5: lv_returnType_1_0= ruleIOType
            {

            					newCompositeNode(grammarAccess.getEffectFullFunctionAccess().getReturnTypeIOTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_18);
            lv_returnType_1_0=ruleIOType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEffectFullFunctionRule());
            					}
            					set(
            						current,
            						"returnType",
            						lv_returnType_1_0,
            						"it.unibo.FPML.IOType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFPML.g:882:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalFPML.g:883:4: (lv_name_2_0= RULE_ID )
            {
            // InternalFPML.g:883:4: (lv_name_2_0= RULE_ID )
            // InternalFPML.g:884:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(lv_name_2_0, grammarAccess.getEffectFullFunctionAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEffectFullFunctionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getEffectFullFunctionAccess().getLeftParenthesisKeyword_3());
            		
            // InternalFPML.g:904:3: ( (lv_arg_4_0= ruleEffectFullArgument ) )
            // InternalFPML.g:905:4: (lv_arg_4_0= ruleEffectFullArgument )
            {
            // InternalFPML.g:905:4: (lv_arg_4_0= ruleEffectFullArgument )
            // InternalFPML.g:906:5: lv_arg_4_0= ruleEffectFullArgument
            {

            					newCompositeNode(grammarAccess.getEffectFullFunctionAccess().getArgEffectFullArgumentParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_20);
            lv_arg_4_0=ruleEffectFullArgument();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEffectFullFunctionRule());
            					}
            					set(
            						current,
            						"arg",
            						lv_arg_4_0,
            						"it.unibo.FPML.EffectFullArgument");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,25,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getEffectFullFunctionAccess().getRightParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getEffectFullFunctionAccess().getColonKeyword_6());
            		
            otherlv_7=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_7, grammarAccess.getEffectFullFunctionAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalFPML.g:935:3: ( (lv_functionBody_8_0= ruleFunctionBodyEffectFull ) )
            // InternalFPML.g:936:4: (lv_functionBody_8_0= ruleFunctionBodyEffectFull )
            {
            // InternalFPML.g:936:4: (lv_functionBody_8_0= ruleFunctionBodyEffectFull )
            // InternalFPML.g:937:5: lv_functionBody_8_0= ruleFunctionBodyEffectFull
            {

            					newCompositeNode(grammarAccess.getEffectFullFunctionAccess().getFunctionBodyFunctionBodyEffectFullParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_7);
            lv_functionBody_8_0=ruleFunctionBodyEffectFull();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEffectFullFunctionRule());
            					}
            					set(
            						current,
            						"functionBody",
            						lv_functionBody_8_0,
            						"it.unibo.FPML.FunctionBodyEffectFull");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getEffectFullFunctionAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleMainFunc"
    // InternalFPML.g:962:1: entryRuleMainFunc returns [EObject current=null] : iv_ruleMainFunc= ruleMainFunc EOF ;
    public final EObject entryRuleMainFunc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMainFunc = null;


        try {
            // InternalFPML.g:962:49: (iv_ruleMainFunc= ruleMainFunc EOF )
            // InternalFPML.g:963:2: iv_ruleMainFunc= ruleMainFunc EOF
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
    // InternalFPML.g:969:1: ruleMainFunc returns [EObject current=null] : (otherlv_0= 'IO' ( (lv_returnType_1_0= ruleUnitType ) ) otherlv_2= 'main' otherlv_3= ':' otherlv_4= '{' ( (lv_functionBody_5_0= ruleFunctionBodyEffectFull ) ) otherlv_6= '}' ) ;
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
            // InternalFPML.g:975:2: ( (otherlv_0= 'IO' ( (lv_returnType_1_0= ruleUnitType ) ) otherlv_2= 'main' otherlv_3= ':' otherlv_4= '{' ( (lv_functionBody_5_0= ruleFunctionBodyEffectFull ) ) otherlv_6= '}' ) )
            // InternalFPML.g:976:2: (otherlv_0= 'IO' ( (lv_returnType_1_0= ruleUnitType ) ) otherlv_2= 'main' otherlv_3= ':' otherlv_4= '{' ( (lv_functionBody_5_0= ruleFunctionBodyEffectFull ) ) otherlv_6= '}' )
            {
            // InternalFPML.g:976:2: (otherlv_0= 'IO' ( (lv_returnType_1_0= ruleUnitType ) ) otherlv_2= 'main' otherlv_3= ':' otherlv_4= '{' ( (lv_functionBody_5_0= ruleFunctionBodyEffectFull ) ) otherlv_6= '}' )
            // InternalFPML.g:977:3: otherlv_0= 'IO' ( (lv_returnType_1_0= ruleUnitType ) ) otherlv_2= 'main' otherlv_3= ':' otherlv_4= '{' ( (lv_functionBody_5_0= ruleFunctionBodyEffectFull ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getMainFuncAccess().getIOKeyword_0());
            		
            // InternalFPML.g:981:3: ( (lv_returnType_1_0= ruleUnitType ) )
            // InternalFPML.g:982:4: (lv_returnType_1_0= ruleUnitType )
            {
            // InternalFPML.g:982:4: (lv_returnType_1_0= ruleUnitType )
            // InternalFPML.g:983:5: lv_returnType_1_0= ruleUnitType
            {

            					newCompositeNode(grammarAccess.getMainFuncAccess().getReturnTypeUnitTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_24);
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

            otherlv_2=(Token)match(input,27,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getMainFuncAccess().getMainKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getMainFuncAccess().getColonKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_4, grammarAccess.getMainFuncAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalFPML.g:1012:3: ( (lv_functionBody_5_0= ruleFunctionBodyEffectFull ) )
            // InternalFPML.g:1013:4: (lv_functionBody_5_0= ruleFunctionBodyEffectFull )
            {
            // InternalFPML.g:1013:4: (lv_functionBody_5_0= ruleFunctionBodyEffectFull )
            // InternalFPML.g:1014:5: lv_functionBody_5_0= ruleFunctionBodyEffectFull
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


    // $ANTLR start "entryRuleFunction"
    // InternalFPML.g:1039:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalFPML.g:1039:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalFPML.g:1040:2: iv_ruleFunction= ruleFunction EOF
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
    // InternalFPML.g:1046:1: ruleFunction returns [EObject current=null] : (this_PureFunction_0= rulePureFunction | this_EffectFullFunction_1= ruleEffectFullFunction ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        EObject this_PureFunction_0 = null;

        EObject this_EffectFullFunction_1 = null;



        	enterRule();

        try {
            // InternalFPML.g:1052:2: ( (this_PureFunction_0= rulePureFunction | this_EffectFullFunction_1= ruleEffectFullFunction ) )
            // InternalFPML.g:1053:2: (this_PureFunction_0= rulePureFunction | this_EffectFullFunction_1= ruleEffectFullFunction )
            {
            // InternalFPML.g:1053:2: (this_PureFunction_0= rulePureFunction | this_EffectFullFunction_1= ruleEffectFullFunction )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                int LA7_1 = input.LA(2);

                if ( ((LA7_1>=31 && LA7_1<=32)||LA7_1==34) ) {
                    alt7=1;
                }
                else if ( (LA7_1==26) ) {
                    alt7=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalFPML.g:1054:3: this_PureFunction_0= rulePureFunction
                    {

                    			newCompositeNode(grammarAccess.getFunctionAccess().getPureFunctionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PureFunction_0=rulePureFunction();

                    state._fsp--;


                    			current = this_PureFunction_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFPML.g:1063:3: this_EffectFullFunction_1= ruleEffectFullFunction
                    {

                    			newCompositeNode(grammarAccess.getFunctionAccess().getEffectFullFunctionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EffectFullFunction_1=ruleEffectFullFunction();

                    state._fsp--;


                    			current = this_EffectFullFunction_1;
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


    // $ANTLR start "entryRuleEffectFullArgument"
    // InternalFPML.g:1075:1: entryRuleEffectFullArgument returns [EObject current=null] : iv_ruleEffectFullArgument= ruleEffectFullArgument EOF ;
    public final EObject entryRuleEffectFullArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullArgument = null;


        try {
            // InternalFPML.g:1075:59: (iv_ruleEffectFullArgument= ruleEffectFullArgument EOF )
            // InternalFPML.g:1076:2: iv_ruleEffectFullArgument= ruleEffectFullArgument EOF
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
    // InternalFPML.g:1082:1: ruleEffectFullArgument returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) )? ) ;
    public final EObject ruleEffectFullArgument() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:1088:2: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) )? ) )
            // InternalFPML.g:1089:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) )? )
            {
            // InternalFPML.g:1089:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) )? )
            // InternalFPML.g:1090:3: ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) )?
            {
            // InternalFPML.g:1090:3: ( (lv_type_0_0= ruleType ) )
            // InternalFPML.g:1091:4: (lv_type_0_0= ruleType )
            {
            // InternalFPML.g:1091:4: (lv_type_0_0= ruleType )
            // InternalFPML.g:1092:5: lv_type_0_0= ruleType
            {

            					newCompositeNode(grammarAccess.getEffectFullArgumentAccess().getTypeTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_25);
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

            // InternalFPML.g:1109:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalFPML.g:1110:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalFPML.g:1110:4: (lv_name_1_0= RULE_ID )
                    // InternalFPML.g:1111:5: lv_name_1_0= RULE_ID
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
    // $ANTLR end "ruleEffectFullArgument"


    // $ANTLR start "entryRuleArgument"
    // InternalFPML.g:1131:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // InternalFPML.g:1131:49: (iv_ruleArgument= ruleArgument EOF )
            // InternalFPML.g:1132:2: iv_ruleArgument= ruleArgument EOF
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
    // InternalFPML.g:1138:1: ruleArgument returns [EObject current=null] : ( ( (lv_type_0_0= ruleValueType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:1144:2: ( ( ( (lv_type_0_0= ruleValueType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalFPML.g:1145:2: ( ( (lv_type_0_0= ruleValueType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalFPML.g:1145:2: ( ( (lv_type_0_0= ruleValueType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalFPML.g:1146:3: ( (lv_type_0_0= ruleValueType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalFPML.g:1146:3: ( (lv_type_0_0= ruleValueType ) )
            // InternalFPML.g:1147:4: (lv_type_0_0= ruleValueType )
            {
            // InternalFPML.g:1147:4: (lv_type_0_0= ruleValueType )
            // InternalFPML.g:1148:5: lv_type_0_0= ruleValueType
            {

            					newCompositeNode(grammarAccess.getArgumentAccess().getTypeValueTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_18);
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

            // InternalFPML.g:1165:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFPML.g:1166:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFPML.g:1166:4: (lv_name_1_0= RULE_ID )
            // InternalFPML.g:1167:5: lv_name_1_0= RULE_ID
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
    // InternalFPML.g:1187:1: entryRuleFunctionBodyPure returns [EObject current=null] : iv_ruleFunctionBodyPure= ruleFunctionBodyPure EOF ;
    public final EObject entryRuleFunctionBodyPure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionBodyPure = null;


        try {
            // InternalFPML.g:1187:57: (iv_ruleFunctionBodyPure= ruleFunctionBodyPure EOF )
            // InternalFPML.g:1188:2: iv_ruleFunctionBodyPure= ruleFunctionBodyPure EOF
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
    // InternalFPML.g:1194:1: ruleFunctionBodyPure returns [EObject current=null] : (this_EmptyFunctionBody_0= ruleEmptyFunctionBody | this_CompositionFunctionBodyPure_1= ruleCompositionFunctionBodyPure ) ;
    public final EObject ruleFunctionBodyPure() throws RecognitionException {
        EObject current = null;

        EObject this_EmptyFunctionBody_0 = null;

        EObject this_CompositionFunctionBodyPure_1 = null;



        	enterRule();

        try {
            // InternalFPML.g:1200:2: ( (this_EmptyFunctionBody_0= ruleEmptyFunctionBody | this_CompositionFunctionBodyPure_1= ruleCompositionFunctionBodyPure ) )
            // InternalFPML.g:1201:2: (this_EmptyFunctionBody_0= ruleEmptyFunctionBody | this_CompositionFunctionBodyPure_1= ruleCompositionFunctionBodyPure )
            {
            // InternalFPML.g:1201:2: (this_EmptyFunctionBody_0= ruleEmptyFunctionBody | this_CompositionFunctionBodyPure_1= ruleCompositionFunctionBodyPure )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==28) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalFPML.g:1202:3: this_EmptyFunctionBody_0= ruleEmptyFunctionBody
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
                    // InternalFPML.g:1211:3: this_CompositionFunctionBodyPure_1= ruleCompositionFunctionBodyPure
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
    // InternalFPML.g:1223:1: entryRuleFunctionBodyEffectFull returns [EObject current=null] : iv_ruleFunctionBodyEffectFull= ruleFunctionBodyEffectFull EOF ;
    public final EObject entryRuleFunctionBodyEffectFull() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionBodyEffectFull = null;


        try {
            // InternalFPML.g:1223:63: (iv_ruleFunctionBodyEffectFull= ruleFunctionBodyEffectFull EOF )
            // InternalFPML.g:1224:2: iv_ruleFunctionBodyEffectFull= ruleFunctionBodyEffectFull EOF
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
    // InternalFPML.g:1230:1: ruleFunctionBodyEffectFull returns [EObject current=null] : (this_EmptyFunctionBody_0= ruleEmptyFunctionBody | this_CompositionFunctionBodyEffect_1= ruleCompositionFunctionBodyEffect ) ;
    public final EObject ruleFunctionBodyEffectFull() throws RecognitionException {
        EObject current = null;

        EObject this_EmptyFunctionBody_0 = null;

        EObject this_CompositionFunctionBodyEffect_1 = null;



        	enterRule();

        try {
            // InternalFPML.g:1236:2: ( (this_EmptyFunctionBody_0= ruleEmptyFunctionBody | this_CompositionFunctionBodyEffect_1= ruleCompositionFunctionBodyEffect ) )
            // InternalFPML.g:1237:2: (this_EmptyFunctionBody_0= ruleEmptyFunctionBody | this_CompositionFunctionBodyEffect_1= ruleCompositionFunctionBodyEffect )
            {
            // InternalFPML.g:1237:2: (this_EmptyFunctionBody_0= ruleEmptyFunctionBody | this_CompositionFunctionBodyEffect_1= ruleCompositionFunctionBodyEffect )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalFPML.g:1238:3: this_EmptyFunctionBody_0= ruleEmptyFunctionBody
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
                    // InternalFPML.g:1247:3: this_CompositionFunctionBodyEffect_1= ruleCompositionFunctionBodyEffect
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
    // InternalFPML.g:1259:1: entryRuleEmptyFunctionBody returns [EObject current=null] : iv_ruleEmptyFunctionBody= ruleEmptyFunctionBody EOF ;
    public final EObject entryRuleEmptyFunctionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmptyFunctionBody = null;


        try {
            // InternalFPML.g:1259:58: (iv_ruleEmptyFunctionBody= ruleEmptyFunctionBody EOF )
            // InternalFPML.g:1260:2: iv_ruleEmptyFunctionBody= ruleEmptyFunctionBody EOF
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
    // InternalFPML.g:1266:1: ruleEmptyFunctionBody returns [EObject current=null] : ( () otherlv_1= 'Undefined' ) ;
    public final EObject ruleEmptyFunctionBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFPML.g:1272:2: ( ( () otherlv_1= 'Undefined' ) )
            // InternalFPML.g:1273:2: ( () otherlv_1= 'Undefined' )
            {
            // InternalFPML.g:1273:2: ( () otherlv_1= 'Undefined' )
            // InternalFPML.g:1274:3: () otherlv_1= 'Undefined'
            {
            // InternalFPML.g:1274:3: ()
            // InternalFPML.g:1275:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEmptyFunctionBodyAccess().getEmptyFunctionBodyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_2); 

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
    // InternalFPML.g:1289:1: entryRuleCompositionFunctionBodyPure returns [EObject current=null] : iv_ruleCompositionFunctionBodyPure= ruleCompositionFunctionBodyPure EOF ;
    public final EObject entryRuleCompositionFunctionBodyPure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositionFunctionBodyPure = null;


        try {
            // InternalFPML.g:1289:68: (iv_ruleCompositionFunctionBodyPure= ruleCompositionFunctionBodyPure EOF )
            // InternalFPML.g:1290:2: iv_ruleCompositionFunctionBodyPure= ruleCompositionFunctionBodyPure EOF
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
    // InternalFPML.g:1296:1: ruleCompositionFunctionBodyPure returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '|>' ( (otherlv_2= RULE_ID ) ) ) (otherlv_3= '|>' ( (otherlv_4= RULE_ID ) ) )* ) ;
    public final EObject ruleCompositionFunctionBodyPure() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalFPML.g:1302:2: ( ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '|>' ( (otherlv_2= RULE_ID ) ) ) (otherlv_3= '|>' ( (otherlv_4= RULE_ID ) ) )* ) )
            // InternalFPML.g:1303:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '|>' ( (otherlv_2= RULE_ID ) ) ) (otherlv_3= '|>' ( (otherlv_4= RULE_ID ) ) )* )
            {
            // InternalFPML.g:1303:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '|>' ( (otherlv_2= RULE_ID ) ) ) (otherlv_3= '|>' ( (otherlv_4= RULE_ID ) ) )* )
            // InternalFPML.g:1304:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '|>' ( (otherlv_2= RULE_ID ) ) ) (otherlv_3= '|>' ( (otherlv_4= RULE_ID ) ) )*
            {
            // InternalFPML.g:1304:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '|>' ( (otherlv_2= RULE_ID ) ) )
            // InternalFPML.g:1305:4: ( (otherlv_0= RULE_ID ) ) otherlv_1= '|>' ( (otherlv_2= RULE_ID ) )
            {
            // InternalFPML.g:1305:4: ( (otherlv_0= RULE_ID ) )
            // InternalFPML.g:1306:5: (otherlv_0= RULE_ID )
            {
            // InternalFPML.g:1306:5: (otherlv_0= RULE_ID )
            // InternalFPML.g:1307:6: otherlv_0= RULE_ID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getCompositionFunctionBodyPureRule());
            						}
            					
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_26); 

            						newLeafNode(otherlv_0, grammarAccess.getCompositionFunctionBodyPureAccess().getInitialElementInitialPureChainElementCrossReference_0_0_0());
            					

            }


            }

            otherlv_1=(Token)match(input,29,FOLLOW_18); 

            				newLeafNode(otherlv_1, grammarAccess.getCompositionFunctionBodyPureAccess().getVerticalLineGreaterThanSignKeyword_0_1());
            			
            // InternalFPML.g:1322:4: ( (otherlv_2= RULE_ID ) )
            // InternalFPML.g:1323:5: (otherlv_2= RULE_ID )
            {
            // InternalFPML.g:1323:5: (otherlv_2= RULE_ID )
            // InternalFPML.g:1324:6: otherlv_2= RULE_ID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getCompositionFunctionBodyPureRule());
            						}
            					
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_27); 

            						newLeafNode(otherlv_2, grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainPureFunctionCrossReference_0_2_0());
            					

            }


            }


            }

            // InternalFPML.g:1336:3: (otherlv_3= '|>' ( (otherlv_4= RULE_ID ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==29) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalFPML.g:1337:4: otherlv_3= '|>' ( (otherlv_4= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,29,FOLLOW_18); 

            	    				newLeafNode(otherlv_3, grammarAccess.getCompositionFunctionBodyPureAccess().getVerticalLineGreaterThanSignKeyword_1_0());
            	    			
            	    // InternalFPML.g:1341:4: ( (otherlv_4= RULE_ID ) )
            	    // InternalFPML.g:1342:5: (otherlv_4= RULE_ID )
            	    {
            	    // InternalFPML.g:1342:5: (otherlv_4= RULE_ID )
            	    // InternalFPML.g:1343:6: otherlv_4= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getCompositionFunctionBodyPureRule());
            	    						}
            	    					
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_27); 

            	    						newLeafNode(otherlv_4, grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainPureFunctionCrossReference_1_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // $ANTLR end "ruleCompositionFunctionBodyPure"


    // $ANTLR start "entryRuleCompositionFunctionBodyEffect"
    // InternalFPML.g:1359:1: entryRuleCompositionFunctionBodyEffect returns [EObject current=null] : iv_ruleCompositionFunctionBodyEffect= ruleCompositionFunctionBodyEffect EOF ;
    public final EObject entryRuleCompositionFunctionBodyEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositionFunctionBodyEffect = null;


        try {
            // InternalFPML.g:1359:70: (iv_ruleCompositionFunctionBodyEffect= ruleCompositionFunctionBodyEffect EOF )
            // InternalFPML.g:1360:2: iv_ruleCompositionFunctionBodyEffect= ruleCompositionFunctionBodyEffect EOF
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
    // InternalFPML.g:1366:1: ruleCompositionFunctionBodyEffect returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '>>=' ( (otherlv_2= RULE_ID ) ) ) (otherlv_3= '>>=' ( (otherlv_4= RULE_ID ) ) )* ) ;
    public final EObject ruleCompositionFunctionBodyEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalFPML.g:1372:2: ( ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '>>=' ( (otherlv_2= RULE_ID ) ) ) (otherlv_3= '>>=' ( (otherlv_4= RULE_ID ) ) )* ) )
            // InternalFPML.g:1373:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '>>=' ( (otherlv_2= RULE_ID ) ) ) (otherlv_3= '>>=' ( (otherlv_4= RULE_ID ) ) )* )
            {
            // InternalFPML.g:1373:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '>>=' ( (otherlv_2= RULE_ID ) ) ) (otherlv_3= '>>=' ( (otherlv_4= RULE_ID ) ) )* )
            // InternalFPML.g:1374:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '>>=' ( (otherlv_2= RULE_ID ) ) ) (otherlv_3= '>>=' ( (otherlv_4= RULE_ID ) ) )*
            {
            // InternalFPML.g:1374:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '>>=' ( (otherlv_2= RULE_ID ) ) )
            // InternalFPML.g:1375:4: ( (otherlv_0= RULE_ID ) ) otherlv_1= '>>=' ( (otherlv_2= RULE_ID ) )
            {
            // InternalFPML.g:1375:4: ( (otherlv_0= RULE_ID ) )
            // InternalFPML.g:1376:5: (otherlv_0= RULE_ID )
            {
            // InternalFPML.g:1376:5: (otherlv_0= RULE_ID )
            // InternalFPML.g:1377:6: otherlv_0= RULE_ID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getCompositionFunctionBodyEffectRule());
            						}
            					
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            						newLeafNode(otherlv_0, grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainChainElementCrossReference_0_0_0());
            					

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_18); 

            				newLeafNode(otherlv_1, grammarAccess.getCompositionFunctionBodyEffectAccess().getGreaterThanSignGreaterThanSignEqualsSignKeyword_0_1());
            			
            // InternalFPML.g:1392:4: ( (otherlv_2= RULE_ID ) )
            // InternalFPML.g:1393:5: (otherlv_2= RULE_ID )
            {
            // InternalFPML.g:1393:5: (otherlv_2= RULE_ID )
            // InternalFPML.g:1394:6: otherlv_2= RULE_ID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getCompositionFunctionBodyEffectRule());
            						}
            					
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_29); 

            						newLeafNode(otherlv_2, grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainChainElementCrossReference_0_2_0());
            					

            }


            }


            }

            // InternalFPML.g:1406:3: (otherlv_3= '>>=' ( (otherlv_4= RULE_ID ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==30) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalFPML.g:1407:4: otherlv_3= '>>=' ( (otherlv_4= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,30,FOLLOW_18); 

            	    				newLeafNode(otherlv_3, grammarAccess.getCompositionFunctionBodyEffectAccess().getGreaterThanSignGreaterThanSignEqualsSignKeyword_1_0());
            	    			
            	    // InternalFPML.g:1411:4: ( (otherlv_4= RULE_ID ) )
            	    // InternalFPML.g:1412:5: (otherlv_4= RULE_ID )
            	    {
            	    // InternalFPML.g:1412:5: (otherlv_4= RULE_ID )
            	    // InternalFPML.g:1413:6: otherlv_4= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getCompositionFunctionBodyEffectRule());
            	    						}
            	    					
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_29); 

            	    						newLeafNode(otherlv_4, grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainChainElementCrossReference_1_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // $ANTLR end "ruleCompositionFunctionBodyEffect"


    // $ANTLR start "entryRuleIOType"
    // InternalFPML.g:1429:1: entryRuleIOType returns [EObject current=null] : iv_ruleIOType= ruleIOType EOF ;
    public final EObject entryRuleIOType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIOType = null;


        try {
            // InternalFPML.g:1429:47: (iv_ruleIOType= ruleIOType EOF )
            // InternalFPML.g:1430:2: iv_ruleIOType= ruleIOType EOF
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
    // InternalFPML.g:1436:1: ruleIOType returns [EObject current=null] : (otherlv_0= 'IO' ( (lv_type_1_0= ruleType ) ) ) ;
    public final EObject ruleIOType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:1442:2: ( (otherlv_0= 'IO' ( (lv_type_1_0= ruleType ) ) ) )
            // InternalFPML.g:1443:2: (otherlv_0= 'IO' ( (lv_type_1_0= ruleType ) ) )
            {
            // InternalFPML.g:1443:2: (otherlv_0= 'IO' ( (lv_type_1_0= ruleType ) ) )
            // InternalFPML.g:1444:3: otherlv_0= 'IO' ( (lv_type_1_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getIOTypeAccess().getIOKeyword_0());
            		
            // InternalFPML.g:1448:3: ( (lv_type_1_0= ruleType ) )
            // InternalFPML.g:1449:4: (lv_type_1_0= ruleType )
            {
            // InternalFPML.g:1449:4: (lv_type_1_0= ruleType )
            // InternalFPML.g:1450:5: lv_type_1_0= ruleType
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
    // InternalFPML.g:1471:1: entryRuleValueType returns [EObject current=null] : iv_ruleValueType= ruleValueType EOF ;
    public final EObject entryRuleValueType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueType = null;


        try {
            // InternalFPML.g:1471:50: (iv_ruleValueType= ruleValueType EOF )
            // InternalFPML.g:1472:2: iv_ruleValueType= ruleValueType EOF
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
    // InternalFPML.g:1478:1: ruleValueType returns [EObject current=null] : (this_IntegerType_0= ruleIntegerType | this_StringType_1= ruleStringType | this_DataType_2= ruleDataType ) ;
    public final EObject ruleValueType() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerType_0 = null;

        EObject this_StringType_1 = null;

        EObject this_DataType_2 = null;



        	enterRule();

        try {
            // InternalFPML.g:1484:2: ( (this_IntegerType_0= ruleIntegerType | this_StringType_1= ruleStringType | this_DataType_2= ruleDataType ) )
            // InternalFPML.g:1485:2: (this_IntegerType_0= ruleIntegerType | this_StringType_1= ruleStringType | this_DataType_2= ruleDataType )
            {
            // InternalFPML.g:1485:2: (this_IntegerType_0= ruleIntegerType | this_StringType_1= ruleStringType | this_DataType_2= ruleDataType )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt13=1;
                }
                break;
            case 32:
                {
                alt13=2;
                }
                break;
            case 34:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalFPML.g:1486:3: this_IntegerType_0= ruleIntegerType
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
                    // InternalFPML.g:1495:3: this_StringType_1= ruleStringType
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
                    // InternalFPML.g:1504:3: this_DataType_2= ruleDataType
                    {

                    			newCompositeNode(grammarAccess.getValueTypeAccess().getDataTypeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataType_2=ruleDataType();

                    state._fsp--;


                    			current = this_DataType_2;
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
    // InternalFPML.g:1516:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalFPML.g:1516:45: (iv_ruleType= ruleType EOF )
            // InternalFPML.g:1517:2: iv_ruleType= ruleType EOF
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
    // InternalFPML.g:1523:1: ruleType returns [EObject current=null] : (this_ValueType_0= ruleValueType | this_UnitType_1= ruleUnitType ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_ValueType_0 = null;

        EObject this_UnitType_1 = null;



        	enterRule();

        try {
            // InternalFPML.g:1529:2: ( (this_ValueType_0= ruleValueType | this_UnitType_1= ruleUnitType ) )
            // InternalFPML.g:1530:2: (this_ValueType_0= ruleValueType | this_UnitType_1= ruleUnitType )
            {
            // InternalFPML.g:1530:2: (this_ValueType_0= ruleValueType | this_UnitType_1= ruleUnitType )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=31 && LA14_0<=32)||LA14_0==34) ) {
                alt14=1;
            }
            else if ( (LA14_0==33) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalFPML.g:1531:3: this_ValueType_0= ruleValueType
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
                    // InternalFPML.g:1540:3: this_UnitType_1= ruleUnitType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getUnitTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_UnitType_1=ruleUnitType();

                    state._fsp--;


                    			current = this_UnitType_1;
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
    // InternalFPML.g:1552:1: entryRuleIntegerType returns [EObject current=null] : iv_ruleIntegerType= ruleIntegerType EOF ;
    public final EObject entryRuleIntegerType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerType = null;


        try {
            // InternalFPML.g:1552:52: (iv_ruleIntegerType= ruleIntegerType EOF )
            // InternalFPML.g:1553:2: iv_ruleIntegerType= ruleIntegerType EOF
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
    // InternalFPML.g:1559:1: ruleIntegerType returns [EObject current=null] : ( () ( (lv_type_1_0= 'int' ) ) ) ;
    public final EObject ruleIntegerType() throws RecognitionException {
        EObject current = null;

        Token lv_type_1_0=null;


        	enterRule();

        try {
            // InternalFPML.g:1565:2: ( ( () ( (lv_type_1_0= 'int' ) ) ) )
            // InternalFPML.g:1566:2: ( () ( (lv_type_1_0= 'int' ) ) )
            {
            // InternalFPML.g:1566:2: ( () ( (lv_type_1_0= 'int' ) ) )
            // InternalFPML.g:1567:3: () ( (lv_type_1_0= 'int' ) )
            {
            // InternalFPML.g:1567:3: ()
            // InternalFPML.g:1568:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntegerTypeAccess().getIntegerTypeAction_0(),
            					current);
            			

            }

            // InternalFPML.g:1574:3: ( (lv_type_1_0= 'int' ) )
            // InternalFPML.g:1575:4: (lv_type_1_0= 'int' )
            {
            // InternalFPML.g:1575:4: (lv_type_1_0= 'int' )
            // InternalFPML.g:1576:5: lv_type_1_0= 'int'
            {
            lv_type_1_0=(Token)match(input,31,FOLLOW_2); 

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
    // InternalFPML.g:1592:1: entryRuleStringType returns [EObject current=null] : iv_ruleStringType= ruleStringType EOF ;
    public final EObject entryRuleStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringType = null;


        try {
            // InternalFPML.g:1592:51: (iv_ruleStringType= ruleStringType EOF )
            // InternalFPML.g:1593:2: iv_ruleStringType= ruleStringType EOF
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
    // InternalFPML.g:1599:1: ruleStringType returns [EObject current=null] : ( () ( (lv_type_1_0= 'String' ) ) ) ;
    public final EObject ruleStringType() throws RecognitionException {
        EObject current = null;

        Token lv_type_1_0=null;


        	enterRule();

        try {
            // InternalFPML.g:1605:2: ( ( () ( (lv_type_1_0= 'String' ) ) ) )
            // InternalFPML.g:1606:2: ( () ( (lv_type_1_0= 'String' ) ) )
            {
            // InternalFPML.g:1606:2: ( () ( (lv_type_1_0= 'String' ) ) )
            // InternalFPML.g:1607:3: () ( (lv_type_1_0= 'String' ) )
            {
            // InternalFPML.g:1607:3: ()
            // InternalFPML.g:1608:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStringTypeAccess().getStringTypeAction_0(),
            					current);
            			

            }

            // InternalFPML.g:1614:3: ( (lv_type_1_0= 'String' ) )
            // InternalFPML.g:1615:4: (lv_type_1_0= 'String' )
            {
            // InternalFPML.g:1615:4: (lv_type_1_0= 'String' )
            // InternalFPML.g:1616:5: lv_type_1_0= 'String'
            {
            lv_type_1_0=(Token)match(input,32,FOLLOW_2); 

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
    // InternalFPML.g:1632:1: entryRuleUnitType returns [EObject current=null] : iv_ruleUnitType= ruleUnitType EOF ;
    public final EObject entryRuleUnitType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnitType = null;


        try {
            // InternalFPML.g:1632:49: (iv_ruleUnitType= ruleUnitType EOF )
            // InternalFPML.g:1633:2: iv_ruleUnitType= ruleUnitType EOF
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
    // InternalFPML.g:1639:1: ruleUnitType returns [EObject current=null] : ( () ( (lv_type_1_0= 'Unit' ) ) ) ;
    public final EObject ruleUnitType() throws RecognitionException {
        EObject current = null;

        Token lv_type_1_0=null;


        	enterRule();

        try {
            // InternalFPML.g:1645:2: ( ( () ( (lv_type_1_0= 'Unit' ) ) ) )
            // InternalFPML.g:1646:2: ( () ( (lv_type_1_0= 'Unit' ) ) )
            {
            // InternalFPML.g:1646:2: ( () ( (lv_type_1_0= 'Unit' ) ) )
            // InternalFPML.g:1647:3: () ( (lv_type_1_0= 'Unit' ) )
            {
            // InternalFPML.g:1647:3: ()
            // InternalFPML.g:1648:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUnitTypeAccess().getUnitTypeAction_0(),
            					current);
            			

            }

            // InternalFPML.g:1654:3: ( (lv_type_1_0= 'Unit' ) )
            // InternalFPML.g:1655:4: (lv_type_1_0= 'Unit' )
            {
            // InternalFPML.g:1655:4: (lv_type_1_0= 'Unit' )
            // InternalFPML.g:1656:5: lv_type_1_0= 'Unit'
            {
            lv_type_1_0=(Token)match(input,33,FOLLOW_2); 

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
    // InternalFPML.g:1672:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalFPML.g:1672:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalFPML.g:1673:2: iv_ruleDataType= ruleDataType EOF
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
    // InternalFPML.g:1679:1: ruleDataType returns [EObject current=null] : ( () otherlv_1= 'ref' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalFPML.g:1685:2: ( ( () otherlv_1= 'ref' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalFPML.g:1686:2: ( () otherlv_1= 'ref' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalFPML.g:1686:2: ( () otherlv_1= 'ref' ( (otherlv_2= RULE_ID ) ) )
            // InternalFPML.g:1687:3: () otherlv_1= 'ref' ( (otherlv_2= RULE_ID ) )
            {
            // InternalFPML.g:1687:3: ()
            // InternalFPML.g:1688:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDataTypeAccess().getDataTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getDataTypeAccess().getRefKeyword_1());
            		
            // InternalFPML.g:1698:3: ( (otherlv_2= RULE_ID ) )
            // InternalFPML.g:1699:4: (otherlv_2= RULE_ID )
            {
            // InternalFPML.g:1699:4: (otherlv_2= RULE_ID )
            // InternalFPML.g:1700:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataTypeRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getDataTypeAccess().getTypeDataCrossReference_2_0());
            				

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


    // $ANTLR start "entryRuleExpression"
    // InternalFPML.g:1715:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalFPML.g:1715:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalFPML.g:1716:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalFPML.g:1722:1: ruleExpression returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_UnitValue_2= ruleUnitValue | this_DataValue_3= ruleDataValue ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_IntValue_0 = null;

        EObject this_StringValue_1 = null;

        EObject this_UnitValue_2 = null;

        EObject this_DataValue_3 = null;



        	enterRule();

        try {
            // InternalFPML.g:1728:2: ( (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_UnitValue_2= ruleUnitValue | this_DataValue_3= ruleDataValue ) )
            // InternalFPML.g:1729:2: (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_UnitValue_2= ruleUnitValue | this_DataValue_3= ruleDataValue )
            {
            // InternalFPML.g:1729:2: (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_UnitValue_2= ruleUnitValue | this_DataValue_3= ruleDataValue )
            int alt15=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt15=1;
                }
                break;
            case RULE_STRING:
                {
                alt15=2;
                }
                break;
            case 35:
                {
                alt15=3;
                }
                break;
            case RULE_ID:
                {
                alt15=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalFPML.g:1730:3: this_IntValue_0= ruleIntValue
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
                    // InternalFPML.g:1739:3: this_StringValue_1= ruleStringValue
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
                    // InternalFPML.g:1748:3: this_UnitValue_2= ruleUnitValue
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getUnitValueParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_UnitValue_2=ruleUnitValue();

                    state._fsp--;


                    			current = this_UnitValue_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalFPML.g:1757:3: this_DataValue_3= ruleDataValue
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getDataValueParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataValue_3=ruleDataValue();

                    state._fsp--;


                    			current = this_DataValue_3;
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
    // InternalFPML.g:1769:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // InternalFPML.g:1769:49: (iv_ruleIntValue= ruleIntValue EOF )
            // InternalFPML.g:1770:2: iv_ruleIntValue= ruleIntValue EOF
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
    // InternalFPML.g:1776:1: ruleIntValue returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalFPML.g:1782:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // InternalFPML.g:1783:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // InternalFPML.g:1783:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // InternalFPML.g:1784:3: () ( (lv_value_1_0= RULE_INT ) )
            {
            // InternalFPML.g:1784:3: ()
            // InternalFPML.g:1785:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntValueAccess().getIntegerTypeAction_0(),
            					current);
            			

            }

            // InternalFPML.g:1791:3: ( (lv_value_1_0= RULE_INT ) )
            // InternalFPML.g:1792:4: (lv_value_1_0= RULE_INT )
            {
            // InternalFPML.g:1792:4: (lv_value_1_0= RULE_INT )
            // InternalFPML.g:1793:5: lv_value_1_0= RULE_INT
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
    // InternalFPML.g:1813:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalFPML.g:1813:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalFPML.g:1814:2: iv_ruleStringValue= ruleStringValue EOF
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
    // InternalFPML.g:1820:1: ruleStringValue returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalFPML.g:1826:2: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalFPML.g:1827:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalFPML.g:1827:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalFPML.g:1828:3: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // InternalFPML.g:1828:3: ()
            // InternalFPML.g:1829:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStringValueAccess().getStringTypeAction_0(),
            					current);
            			

            }

            // InternalFPML.g:1835:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalFPML.g:1836:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalFPML.g:1836:4: (lv_value_1_0= RULE_STRING )
            // InternalFPML.g:1837:5: lv_value_1_0= RULE_STRING
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


    // $ANTLR start "entryRuleUnitValue"
    // InternalFPML.g:1857:1: entryRuleUnitValue returns [EObject current=null] : iv_ruleUnitValue= ruleUnitValue EOF ;
    public final EObject entryRuleUnitValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnitValue = null;


        try {
            // InternalFPML.g:1857:50: (iv_ruleUnitValue= ruleUnitValue EOF )
            // InternalFPML.g:1858:2: iv_ruleUnitValue= ruleUnitValue EOF
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
    // InternalFPML.g:1864:1: ruleUnitValue returns [EObject current=null] : ( () otherlv_1= '()' ) ;
    public final EObject ruleUnitValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFPML.g:1870:2: ( ( () otherlv_1= '()' ) )
            // InternalFPML.g:1871:2: ( () otherlv_1= '()' )
            {
            // InternalFPML.g:1871:2: ( () otherlv_1= '()' )
            // InternalFPML.g:1872:3: () otherlv_1= '()'
            {
            // InternalFPML.g:1872:3: ()
            // InternalFPML.g:1873:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUnitValueAccess().getUnitTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_2); 

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


    // $ANTLR start "entryRuleDataValue"
    // InternalFPML.g:1887:1: entryRuleDataValue returns [EObject current=null] : iv_ruleDataValue= ruleDataValue EOF ;
    public final EObject entryRuleDataValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataValue = null;


        try {
            // InternalFPML.g:1887:50: (iv_ruleDataValue= ruleDataValue EOF )
            // InternalFPML.g:1888:2: iv_ruleDataValue= ruleDataValue EOF
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
    // InternalFPML.g:1894:1: ruleDataValue returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_value_2_0= ruleAdtValue ) ) otherlv_3= ')' ) ;
    public final EObject ruleDataValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:1900:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_value_2_0= ruleAdtValue ) ) otherlv_3= ')' ) )
            // InternalFPML.g:1901:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_value_2_0= ruleAdtValue ) ) otherlv_3= ')' )
            {
            // InternalFPML.g:1901:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_value_2_0= ruleAdtValue ) ) otherlv_3= ')' )
            // InternalFPML.g:1902:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_value_2_0= ruleAdtValue ) ) otherlv_3= ')'
            {
            // InternalFPML.g:1902:3: ( (otherlv_0= RULE_ID ) )
            // InternalFPML.g:1903:4: (otherlv_0= RULE_ID )
            {
            // InternalFPML.g:1903:4: (otherlv_0= RULE_ID )
            // InternalFPML.g:1904:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataValueRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(otherlv_0, grammarAccess.getDataValueAccess().getTypeDataCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getDataValueAccess().getLeftParenthesisKeyword_1());
            		
            // InternalFPML.g:1919:3: ( (lv_value_2_0= ruleAdtValue ) )
            // InternalFPML.g:1920:4: (lv_value_2_0= ruleAdtValue )
            {
            // InternalFPML.g:1920:4: (lv_value_2_0= ruleAdtValue )
            // InternalFPML.g:1921:5: lv_value_2_0= ruleAdtValue
            {

            					newCompositeNode(grammarAccess.getDataValueAccess().getValueAdtValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_20);
            lv_value_2_0=ruleAdtValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataValueRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"it.unibo.FPML.AdtValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getDataValueAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleAdtValue"
    // InternalFPML.g:1946:1: entryRuleAdtValue returns [EObject current=null] : iv_ruleAdtValue= ruleAdtValue EOF ;
    public final EObject entryRuleAdtValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdtValue = null;


        try {
            // InternalFPML.g:1946:49: (iv_ruleAdtValue= ruleAdtValue EOF )
            // InternalFPML.g:1947:2: iv_ruleAdtValue= ruleAdtValue EOF
            {
             newCompositeNode(grammarAccess.getAdtValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdtValue=ruleAdtValue();

            state._fsp--;

             current =iv_ruleAdtValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdtValue"


    // $ANTLR start "ruleAdtValue"
    // InternalFPML.g:1953:1: ruleAdtValue returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_DataValue_2= ruleDataValue | (otherlv_3= '(' ( (lv_adtElements_4_0= ruleAdtValue ) ) ( (lv_adtElements_5_0= ruleProdTypeValue ) ) otherlv_6= ')' ) ) ;
    public final EObject ruleAdtValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject this_IntValue_0 = null;

        EObject this_StringValue_1 = null;

        EObject this_DataValue_2 = null;

        EObject lv_adtElements_4_0 = null;

        EObject lv_adtElements_5_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:1959:2: ( (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_DataValue_2= ruleDataValue | (otherlv_3= '(' ( (lv_adtElements_4_0= ruleAdtValue ) ) ( (lv_adtElements_5_0= ruleProdTypeValue ) ) otherlv_6= ')' ) ) )
            // InternalFPML.g:1960:2: (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_DataValue_2= ruleDataValue | (otherlv_3= '(' ( (lv_adtElements_4_0= ruleAdtValue ) ) ( (lv_adtElements_5_0= ruleProdTypeValue ) ) otherlv_6= ')' ) )
            {
            // InternalFPML.g:1960:2: (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_DataValue_2= ruleDataValue | (otherlv_3= '(' ( (lv_adtElements_4_0= ruleAdtValue ) ) ( (lv_adtElements_5_0= ruleProdTypeValue ) ) otherlv_6= ')' ) )
            int alt16=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt16=1;
                }
                break;
            case RULE_STRING:
                {
                alt16=2;
                }
                break;
            case RULE_ID:
                {
                alt16=3;
                }
                break;
            case 24:
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
                    // InternalFPML.g:1961:3: this_IntValue_0= ruleIntValue
                    {

                    			newCompositeNode(grammarAccess.getAdtValueAccess().getIntValueParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntValue_0=ruleIntValue();

                    state._fsp--;


                    			current = this_IntValue_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFPML.g:1970:3: this_StringValue_1= ruleStringValue
                    {

                    			newCompositeNode(grammarAccess.getAdtValueAccess().getStringValueParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringValue_1=ruleStringValue();

                    state._fsp--;


                    			current = this_StringValue_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalFPML.g:1979:3: this_DataValue_2= ruleDataValue
                    {

                    			newCompositeNode(grammarAccess.getAdtValueAccess().getDataValueParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataValue_2=ruleDataValue();

                    state._fsp--;


                    			current = this_DataValue_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalFPML.g:1988:3: (otherlv_3= '(' ( (lv_adtElements_4_0= ruleAdtValue ) ) ( (lv_adtElements_5_0= ruleProdTypeValue ) ) otherlv_6= ')' )
                    {
                    // InternalFPML.g:1988:3: (otherlv_3= '(' ( (lv_adtElements_4_0= ruleAdtValue ) ) ( (lv_adtElements_5_0= ruleProdTypeValue ) ) otherlv_6= ')' )
                    // InternalFPML.g:1989:4: otherlv_3= '(' ( (lv_adtElements_4_0= ruleAdtValue ) ) ( (lv_adtElements_5_0= ruleProdTypeValue ) ) otherlv_6= ')'
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_30); 

                    				newLeafNode(otherlv_3, grammarAccess.getAdtValueAccess().getLeftParenthesisKeyword_3_0());
                    			
                    // InternalFPML.g:1993:4: ( (lv_adtElements_4_0= ruleAdtValue ) )
                    // InternalFPML.g:1994:5: (lv_adtElements_4_0= ruleAdtValue )
                    {
                    // InternalFPML.g:1994:5: (lv_adtElements_4_0= ruleAdtValue )
                    // InternalFPML.g:1995:6: lv_adtElements_4_0= ruleAdtValue
                    {

                    						newCompositeNode(grammarAccess.getAdtValueAccess().getAdtElementsAdtValueParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_adtElements_4_0=ruleAdtValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAdtValueRule());
                    						}
                    						add(
                    							current,
                    							"adtElements",
                    							lv_adtElements_4_0,
                    							"it.unibo.FPML.AdtValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFPML.g:2012:4: ( (lv_adtElements_5_0= ruleProdTypeValue ) )
                    // InternalFPML.g:2013:5: (lv_adtElements_5_0= ruleProdTypeValue )
                    {
                    // InternalFPML.g:2013:5: (lv_adtElements_5_0= ruleProdTypeValue )
                    // InternalFPML.g:2014:6: lv_adtElements_5_0= ruleProdTypeValue
                    {

                    						newCompositeNode(grammarAccess.getAdtValueAccess().getAdtElementsProdTypeValueParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_adtElements_5_0=ruleProdTypeValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAdtValueRule());
                    						}
                    						add(
                    							current,
                    							"adtElements",
                    							lv_adtElements_5_0,
                    							"it.unibo.FPML.ProdTypeValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getAdtValueAccess().getRightParenthesisKeyword_3_3());
                    			

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
    // $ANTLR end "ruleAdtValue"


    // $ANTLR start "entryRuleProdTypeValue"
    // InternalFPML.g:2040:1: entryRuleProdTypeValue returns [EObject current=null] : iv_ruleProdTypeValue= ruleProdTypeValue EOF ;
    public final EObject entryRuleProdTypeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProdTypeValue = null;


        try {
            // InternalFPML.g:2040:54: (iv_ruleProdTypeValue= ruleProdTypeValue EOF )
            // InternalFPML.g:2041:2: iv_ruleProdTypeValue= ruleProdTypeValue EOF
            {
             newCompositeNode(grammarAccess.getProdTypeValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProdTypeValue=ruleProdTypeValue();

            state._fsp--;

             current =iv_ruleProdTypeValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProdTypeValue"


    // $ANTLR start "ruleProdTypeValue"
    // InternalFPML.g:2047:1: ruleProdTypeValue returns [EObject current=null] : (otherlv_0= '*' ( (lv_ProdAdtElements_1_0= ruleAdtValue ) ) ) ;
    public final EObject ruleProdTypeValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_ProdAdtElements_1_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:2053:2: ( (otherlv_0= '*' ( (lv_ProdAdtElements_1_0= ruleAdtValue ) ) ) )
            // InternalFPML.g:2054:2: (otherlv_0= '*' ( (lv_ProdAdtElements_1_0= ruleAdtValue ) ) )
            {
            // InternalFPML.g:2054:2: (otherlv_0= '*' ( (lv_ProdAdtElements_1_0= ruleAdtValue ) ) )
            // InternalFPML.g:2055:3: otherlv_0= '*' ( (lv_ProdAdtElements_1_0= ruleAdtValue ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getProdTypeValueAccess().getAsteriskKeyword_0());
            		
            // InternalFPML.g:2059:3: ( (lv_ProdAdtElements_1_0= ruleAdtValue ) )
            // InternalFPML.g:2060:4: (lv_ProdAdtElements_1_0= ruleAdtValue )
            {
            // InternalFPML.g:2060:4: (lv_ProdAdtElements_1_0= ruleAdtValue )
            // InternalFPML.g:2061:5: lv_ProdAdtElements_1_0= ruleAdtValue
            {

            					newCompositeNode(grammarAccess.getProdTypeValueAccess().getProdAdtElementsAdtValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_ProdAdtElements_1_0=ruleAdtValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProdTypeValueRule());
            					}
            					add(
            						current,
            						"ProdAdtElements",
            						lv_ProdAdtElements_1_0,
            						"it.unibo.FPML.AdtValue");
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
    // $ANTLR end "ruleProdTypeValue"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000004800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000580080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000800000070L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000580000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000780000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000801000070L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000400000L});

}