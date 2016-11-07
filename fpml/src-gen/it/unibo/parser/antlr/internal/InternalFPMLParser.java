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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Pure'", "'{'", "'}'", "'Functions'", "'Data'", "'Effects'", "':'", "'('", "'+'", "')'", "'*'", "'def'", "'IO'", "'main'", "'Undefined'", "'|>'", "'>>='", "'int'", "'String'", "'Unit'", "'ref'", "'()'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
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

                if ( (LA1_0==22) ) {
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
    // InternalFPML.g:247:1: ruleDataBlock returns [EObject current=null] : (otherlv_0= 'Data' otherlv_1= '{' ( (lv_elements_2_0= ruleData ) )* otherlv_3= '}' ) ;
    public final EObject ruleDataBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:253:2: ( (otherlv_0= 'Data' otherlv_1= '{' ( (lv_elements_2_0= ruleData ) )* otherlv_3= '}' ) )
            // InternalFPML.g:254:2: (otherlv_0= 'Data' otherlv_1= '{' ( (lv_elements_2_0= ruleData ) )* otherlv_3= '}' )
            {
            // InternalFPML.g:254:2: (otherlv_0= 'Data' otherlv_1= '{' ( (lv_elements_2_0= ruleData ) )* otherlv_3= '}' )
            // InternalFPML.g:255:3: otherlv_0= 'Data' otherlv_1= '{' ( (lv_elements_2_0= ruleData ) )* otherlv_3= '}'
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

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getDataBlockAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleEffectFullBlock"
    // InternalFPML.g:290:1: entryRuleEffectFullBlock returns [EObject current=null] : iv_ruleEffectFullBlock= ruleEffectFullBlock EOF ;
    public final EObject entryRuleEffectFullBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullBlock = null;


        try {
            // InternalFPML.g:290:56: (iv_ruleEffectFullBlock= ruleEffectFullBlock EOF )
            // InternalFPML.g:291:2: iv_ruleEffectFullBlock= ruleEffectFullBlock EOF
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
    // InternalFPML.g:297:1: ruleEffectFullBlock returns [EObject current=null] : (otherlv_0= 'Effects' otherlv_1= '{' ( (lv_features_2_0= ruleEffectFullFunction ) )* ( (lv_main_3_0= ruleMainFunc ) ) otherlv_4= '}' ) ;
    public final EObject ruleEffectFullBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_features_2_0 = null;

        EObject lv_main_3_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:303:2: ( (otherlv_0= 'Effects' otherlv_1= '{' ( (lv_features_2_0= ruleEffectFullFunction ) )* ( (lv_main_3_0= ruleMainFunc ) ) otherlv_4= '}' ) )
            // InternalFPML.g:304:2: (otherlv_0= 'Effects' otherlv_1= '{' ( (lv_features_2_0= ruleEffectFullFunction ) )* ( (lv_main_3_0= ruleMainFunc ) ) otherlv_4= '}' )
            {
            // InternalFPML.g:304:2: (otherlv_0= 'Effects' otherlv_1= '{' ( (lv_features_2_0= ruleEffectFullFunction ) )* ( (lv_main_3_0= ruleMainFunc ) ) otherlv_4= '}' )
            // InternalFPML.g:305:3: otherlv_0= 'Effects' otherlv_1= '{' ( (lv_features_2_0= ruleEffectFullFunction ) )* ( (lv_main_3_0= ruleMainFunc ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEffectFullBlockAccess().getEffectsKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getEffectFullBlockAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalFPML.g:313:3: ( (lv_features_2_0= ruleEffectFullFunction ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==22) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalFPML.g:314:4: (lv_features_2_0= ruleEffectFullFunction )
            	    {
            	    // InternalFPML.g:314:4: (lv_features_2_0= ruleEffectFullFunction )
            	    // InternalFPML.g:315:5: lv_features_2_0= ruleEffectFullFunction
            	    {

            	    					newCompositeNode(grammarAccess.getEffectFullBlockAccess().getFeaturesEffectFullFunctionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_10);
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
            	    break loop3;
                }
            } while (true);

            // InternalFPML.g:332:3: ( (lv_main_3_0= ruleMainFunc ) )
            // InternalFPML.g:333:4: (lv_main_3_0= ruleMainFunc )
            {
            // InternalFPML.g:333:4: (lv_main_3_0= ruleMainFunc )
            // InternalFPML.g:334:5: lv_main_3_0= ruleMainFunc
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
    // InternalFPML.g:359:1: entryRuleData returns [EObject current=null] : iv_ruleData= ruleData EOF ;
    public final EObject entryRuleData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleData = null;


        try {
            // InternalFPML.g:359:45: (iv_ruleData= ruleData EOF )
            // InternalFPML.g:360:2: iv_ruleData= ruleData EOF
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
    // InternalFPML.g:366:1: ruleData returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_content_2_0= ruleAdt ) ) ) ;
    public final EObject ruleData() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_content_2_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:372:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_content_2_0= ruleAdt ) ) ) )
            // InternalFPML.g:373:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_content_2_0= ruleAdt ) ) )
            {
            // InternalFPML.g:373:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_content_2_0= ruleAdt ) ) )
            // InternalFPML.g:374:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_content_2_0= ruleAdt ) )
            {
            // InternalFPML.g:374:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalFPML.g:375:4: (lv_name_0_0= RULE_ID )
            {
            // InternalFPML.g:375:4: (lv_name_0_0= RULE_ID )
            // InternalFPML.g:376:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_11); 

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

            otherlv_1=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getDataAccess().getColonKeyword_1());
            		
            // InternalFPML.g:396:3: ( (lv_content_2_0= ruleAdt ) )
            // InternalFPML.g:397:4: (lv_content_2_0= ruleAdt )
            {
            // InternalFPML.g:397:4: (lv_content_2_0= ruleAdt )
            // InternalFPML.g:398:5: lv_content_2_0= ruleAdt
            {

            					newCompositeNode(grammarAccess.getDataAccess().getContentAdtParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_content_2_0=ruleAdt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataRule());
            					}
            					set(
            						current,
            						"content",
            						lv_content_2_0,
            						"it.unibo.FPML.Adt");
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


    // $ANTLR start "entryRuleAdt"
    // InternalFPML.g:419:1: entryRuleAdt returns [EObject current=null] : iv_ruleAdt= ruleAdt EOF ;
    public final EObject entryRuleAdt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdt = null;


        try {
            // InternalFPML.g:419:44: (iv_ruleAdt= ruleAdt EOF )
            // InternalFPML.g:420:2: iv_ruleAdt= ruleAdt EOF
            {
             newCompositeNode(grammarAccess.getAdtRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdt=ruleAdt();

            state._fsp--;

             current =iv_ruleAdt; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdt"


    // $ANTLR start "ruleAdt"
    // InternalFPML.g:426:1: ruleAdt returns [EObject current=null] : (this_Argument_0= ruleArgument | this_Value_1= ruleValue | this_SumType_2= ruleSumType | this_ProdType_3= ruleProdType ) ;
    public final EObject ruleAdt() throws RecognitionException {
        EObject current = null;

        EObject this_Argument_0 = null;

        EObject this_Value_1 = null;

        EObject this_SumType_2 = null;

        EObject this_ProdType_3 = null;



        	enterRule();

        try {
            // InternalFPML.g:432:2: ( (this_Argument_0= ruleArgument | this_Value_1= ruleValue | this_SumType_2= ruleSumType | this_ProdType_3= ruleProdType ) )
            // InternalFPML.g:433:2: (this_Argument_0= ruleArgument | this_Value_1= ruleValue | this_SumType_2= ruleSumType | this_ProdType_3= ruleProdType )
            {
            // InternalFPML.g:433:2: (this_Argument_0= ruleArgument | this_Value_1= ruleValue | this_SumType_2= ruleSumType | this_ProdType_3= ruleProdType )
            int alt4=4;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalFPML.g:434:3: this_Argument_0= ruleArgument
                    {

                    			newCompositeNode(grammarAccess.getAdtAccess().getArgumentParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Argument_0=ruleArgument();

                    state._fsp--;


                    			current = this_Argument_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFPML.g:443:3: this_Value_1= ruleValue
                    {

                    			newCompositeNode(grammarAccess.getAdtAccess().getValueParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Value_1=ruleValue();

                    state._fsp--;


                    			current = this_Value_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalFPML.g:452:3: this_SumType_2= ruleSumType
                    {

                    			newCompositeNode(grammarAccess.getAdtAccess().getSumTypeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_SumType_2=ruleSumType();

                    state._fsp--;


                    			current = this_SumType_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalFPML.g:461:3: this_ProdType_3= ruleProdType
                    {

                    			newCompositeNode(grammarAccess.getAdtAccess().getProdTypeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProdType_3=ruleProdType();

                    state._fsp--;


                    			current = this_ProdType_3;
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
    // $ANTLR end "ruleAdt"


    // $ANTLR start "entryRuleSumType"
    // InternalFPML.g:473:1: entryRuleSumType returns [EObject current=null] : iv_ruleSumType= ruleSumType EOF ;
    public final EObject entryRuleSumType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumType = null;


        try {
            // InternalFPML.g:473:48: (iv_ruleSumType= ruleSumType EOF )
            // InternalFPML.g:474:2: iv_ruleSumType= ruleSumType EOF
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
    // InternalFPML.g:480:1: ruleSumType returns [EObject current=null] : (otherlv_0= '(' ( ( (lv_SumAdtElements_1_1= ruleValueType | lv_SumAdtElements_1_2= ruleValue ) ) ) (otherlv_2= '+' ( ( (lv_SumAdtElements_3_1= ruleValueType | lv_SumAdtElements_3_2= ruleValue ) ) ) )+ otherlv_4= ')' ) ;
    public final EObject ruleSumType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_SumAdtElements_1_1 = null;

        EObject lv_SumAdtElements_1_2 = null;

        EObject lv_SumAdtElements_3_1 = null;

        EObject lv_SumAdtElements_3_2 = null;



        	enterRule();

        try {
            // InternalFPML.g:486:2: ( (otherlv_0= '(' ( ( (lv_SumAdtElements_1_1= ruleValueType | lv_SumAdtElements_1_2= ruleValue ) ) ) (otherlv_2= '+' ( ( (lv_SumAdtElements_3_1= ruleValueType | lv_SumAdtElements_3_2= ruleValue ) ) ) )+ otherlv_4= ')' ) )
            // InternalFPML.g:487:2: (otherlv_0= '(' ( ( (lv_SumAdtElements_1_1= ruleValueType | lv_SumAdtElements_1_2= ruleValue ) ) ) (otherlv_2= '+' ( ( (lv_SumAdtElements_3_1= ruleValueType | lv_SumAdtElements_3_2= ruleValue ) ) ) )+ otherlv_4= ')' )
            {
            // InternalFPML.g:487:2: (otherlv_0= '(' ( ( (lv_SumAdtElements_1_1= ruleValueType | lv_SumAdtElements_1_2= ruleValue ) ) ) (otherlv_2= '+' ( ( (lv_SumAdtElements_3_1= ruleValueType | lv_SumAdtElements_3_2= ruleValue ) ) ) )+ otherlv_4= ')' )
            // InternalFPML.g:488:3: otherlv_0= '(' ( ( (lv_SumAdtElements_1_1= ruleValueType | lv_SumAdtElements_1_2= ruleValue ) ) ) (otherlv_2= '+' ( ( (lv_SumAdtElements_3_1= ruleValueType | lv_SumAdtElements_3_2= ruleValue ) ) ) )+ otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getSumTypeAccess().getLeftParenthesisKeyword_0());
            		
            // InternalFPML.g:492:3: ( ( (lv_SumAdtElements_1_1= ruleValueType | lv_SumAdtElements_1_2= ruleValue ) ) )
            // InternalFPML.g:493:4: ( (lv_SumAdtElements_1_1= ruleValueType | lv_SumAdtElements_1_2= ruleValue ) )
            {
            // InternalFPML.g:493:4: ( (lv_SumAdtElements_1_1= ruleValueType | lv_SumAdtElements_1_2= ruleValue ) )
            // InternalFPML.g:494:5: (lv_SumAdtElements_1_1= ruleValueType | lv_SumAdtElements_1_2= ruleValue )
            {
            // InternalFPML.g:494:5: (lv_SumAdtElements_1_1= ruleValueType | lv_SumAdtElements_1_2= ruleValue )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=28 && LA5_0<=29)||LA5_0==31) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=RULE_INT && LA5_0<=RULE_STRING)||LA5_0==32) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalFPML.g:495:6: lv_SumAdtElements_1_1= ruleValueType
                    {

                    						newCompositeNode(grammarAccess.getSumTypeAccess().getSumAdtElementsValueTypeParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_SumAdtElements_1_1=ruleValueType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSumTypeRule());
                    						}
                    						add(
                    							current,
                    							"SumAdtElements",
                    							lv_SumAdtElements_1_1,
                    							"it.unibo.FPML.ValueType");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalFPML.g:511:6: lv_SumAdtElements_1_2= ruleValue
                    {

                    						newCompositeNode(grammarAccess.getSumTypeAccess().getSumAdtElementsValueParserRuleCall_1_0_1());
                    					
                    pushFollow(FOLLOW_14);
                    lv_SumAdtElements_1_2=ruleValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSumTypeRule());
                    						}
                    						add(
                    							current,
                    							"SumAdtElements",
                    							lv_SumAdtElements_1_2,
                    							"it.unibo.FPML.Value");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            // InternalFPML.g:529:3: (otherlv_2= '+' ( ( (lv_SumAdtElements_3_1= ruleValueType | lv_SumAdtElements_3_2= ruleValue ) ) ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalFPML.g:530:4: otherlv_2= '+' ( ( (lv_SumAdtElements_3_1= ruleValueType | lv_SumAdtElements_3_2= ruleValue ) ) )
            	    {
            	    otherlv_2=(Token)match(input,19,FOLLOW_13); 

            	    				newLeafNode(otherlv_2, grammarAccess.getSumTypeAccess().getPlusSignKeyword_2_0());
            	    			
            	    // InternalFPML.g:534:4: ( ( (lv_SumAdtElements_3_1= ruleValueType | lv_SumAdtElements_3_2= ruleValue ) ) )
            	    // InternalFPML.g:535:5: ( (lv_SumAdtElements_3_1= ruleValueType | lv_SumAdtElements_3_2= ruleValue ) )
            	    {
            	    // InternalFPML.g:535:5: ( (lv_SumAdtElements_3_1= ruleValueType | lv_SumAdtElements_3_2= ruleValue ) )
            	    // InternalFPML.g:536:6: (lv_SumAdtElements_3_1= ruleValueType | lv_SumAdtElements_3_2= ruleValue )
            	    {
            	    // InternalFPML.g:536:6: (lv_SumAdtElements_3_1= ruleValueType | lv_SumAdtElements_3_2= ruleValue )
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( ((LA6_0>=28 && LA6_0<=29)||LA6_0==31) ) {
            	        alt6=1;
            	    }
            	    else if ( ((LA6_0>=RULE_INT && LA6_0<=RULE_STRING)||LA6_0==32) ) {
            	        alt6=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 6, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // InternalFPML.g:537:7: lv_SumAdtElements_3_1= ruleValueType
            	            {

            	            							newCompositeNode(grammarAccess.getSumTypeAccess().getSumAdtElementsValueTypeParserRuleCall_2_1_0_0());
            	            						
            	            pushFollow(FOLLOW_15);
            	            lv_SumAdtElements_3_1=ruleValueType();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getSumTypeRule());
            	            							}
            	            							add(
            	            								current,
            	            								"SumAdtElements",
            	            								lv_SumAdtElements_3_1,
            	            								"it.unibo.FPML.ValueType");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalFPML.g:553:7: lv_SumAdtElements_3_2= ruleValue
            	            {

            	            							newCompositeNode(grammarAccess.getSumTypeAccess().getSumAdtElementsValueParserRuleCall_2_1_0_1());
            	            						
            	            pushFollow(FOLLOW_15);
            	            lv_SumAdtElements_3_2=ruleValue();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getSumTypeRule());
            	            							}
            	            							add(
            	            								current,
            	            								"SumAdtElements",
            	            								lv_SumAdtElements_3_2,
            	            								"it.unibo.FPML.Value");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSumTypeAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

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
    // InternalFPML.g:580:1: entryRuleProdType returns [EObject current=null] : iv_ruleProdType= ruleProdType EOF ;
    public final EObject entryRuleProdType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProdType = null;


        try {
            // InternalFPML.g:580:49: (iv_ruleProdType= ruleProdType EOF )
            // InternalFPML.g:581:2: iv_ruleProdType= ruleProdType EOF
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
    // InternalFPML.g:587:1: ruleProdType returns [EObject current=null] : (otherlv_0= '(' ( ( (lv_ProdAdtElements_1_1= ruleValueType | lv_ProdAdtElements_1_2= ruleValue ) ) ) (otherlv_2= '*' ( ( (lv_ProdAdtElements_3_1= ruleValueType | lv_ProdAdtElements_3_2= ruleValue ) ) ) )+ otherlv_4= ')' ) ;
    public final EObject ruleProdType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ProdAdtElements_1_1 = null;

        EObject lv_ProdAdtElements_1_2 = null;

        EObject lv_ProdAdtElements_3_1 = null;

        EObject lv_ProdAdtElements_3_2 = null;



        	enterRule();

        try {
            // InternalFPML.g:593:2: ( (otherlv_0= '(' ( ( (lv_ProdAdtElements_1_1= ruleValueType | lv_ProdAdtElements_1_2= ruleValue ) ) ) (otherlv_2= '*' ( ( (lv_ProdAdtElements_3_1= ruleValueType | lv_ProdAdtElements_3_2= ruleValue ) ) ) )+ otherlv_4= ')' ) )
            // InternalFPML.g:594:2: (otherlv_0= '(' ( ( (lv_ProdAdtElements_1_1= ruleValueType | lv_ProdAdtElements_1_2= ruleValue ) ) ) (otherlv_2= '*' ( ( (lv_ProdAdtElements_3_1= ruleValueType | lv_ProdAdtElements_3_2= ruleValue ) ) ) )+ otherlv_4= ')' )
            {
            // InternalFPML.g:594:2: (otherlv_0= '(' ( ( (lv_ProdAdtElements_1_1= ruleValueType | lv_ProdAdtElements_1_2= ruleValue ) ) ) (otherlv_2= '*' ( ( (lv_ProdAdtElements_3_1= ruleValueType | lv_ProdAdtElements_3_2= ruleValue ) ) ) )+ otherlv_4= ')' )
            // InternalFPML.g:595:3: otherlv_0= '(' ( ( (lv_ProdAdtElements_1_1= ruleValueType | lv_ProdAdtElements_1_2= ruleValue ) ) ) (otherlv_2= '*' ( ( (lv_ProdAdtElements_3_1= ruleValueType | lv_ProdAdtElements_3_2= ruleValue ) ) ) )+ otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getProdTypeAccess().getLeftParenthesisKeyword_0());
            		
            // InternalFPML.g:599:3: ( ( (lv_ProdAdtElements_1_1= ruleValueType | lv_ProdAdtElements_1_2= ruleValue ) ) )
            // InternalFPML.g:600:4: ( (lv_ProdAdtElements_1_1= ruleValueType | lv_ProdAdtElements_1_2= ruleValue ) )
            {
            // InternalFPML.g:600:4: ( (lv_ProdAdtElements_1_1= ruleValueType | lv_ProdAdtElements_1_2= ruleValue ) )
            // InternalFPML.g:601:5: (lv_ProdAdtElements_1_1= ruleValueType | lv_ProdAdtElements_1_2= ruleValue )
            {
            // InternalFPML.g:601:5: (lv_ProdAdtElements_1_1= ruleValueType | lv_ProdAdtElements_1_2= ruleValue )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=28 && LA8_0<=29)||LA8_0==31) ) {
                alt8=1;
            }
            else if ( ((LA8_0>=RULE_INT && LA8_0<=RULE_STRING)||LA8_0==32) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalFPML.g:602:6: lv_ProdAdtElements_1_1= ruleValueType
                    {

                    						newCompositeNode(grammarAccess.getProdTypeAccess().getProdAdtElementsValueTypeParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_ProdAdtElements_1_1=ruleValueType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProdTypeRule());
                    						}
                    						add(
                    							current,
                    							"ProdAdtElements",
                    							lv_ProdAdtElements_1_1,
                    							"it.unibo.FPML.ValueType");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalFPML.g:618:6: lv_ProdAdtElements_1_2= ruleValue
                    {

                    						newCompositeNode(grammarAccess.getProdTypeAccess().getProdAdtElementsValueParserRuleCall_1_0_1());
                    					
                    pushFollow(FOLLOW_16);
                    lv_ProdAdtElements_1_2=ruleValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProdTypeRule());
                    						}
                    						add(
                    							current,
                    							"ProdAdtElements",
                    							lv_ProdAdtElements_1_2,
                    							"it.unibo.FPML.Value");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            // InternalFPML.g:636:3: (otherlv_2= '*' ( ( (lv_ProdAdtElements_3_1= ruleValueType | lv_ProdAdtElements_3_2= ruleValue ) ) ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalFPML.g:637:4: otherlv_2= '*' ( ( (lv_ProdAdtElements_3_1= ruleValueType | lv_ProdAdtElements_3_2= ruleValue ) ) )
            	    {
            	    otherlv_2=(Token)match(input,21,FOLLOW_13); 

            	    				newLeafNode(otherlv_2, grammarAccess.getProdTypeAccess().getAsteriskKeyword_2_0());
            	    			
            	    // InternalFPML.g:641:4: ( ( (lv_ProdAdtElements_3_1= ruleValueType | lv_ProdAdtElements_3_2= ruleValue ) ) )
            	    // InternalFPML.g:642:5: ( (lv_ProdAdtElements_3_1= ruleValueType | lv_ProdAdtElements_3_2= ruleValue ) )
            	    {
            	    // InternalFPML.g:642:5: ( (lv_ProdAdtElements_3_1= ruleValueType | lv_ProdAdtElements_3_2= ruleValue ) )
            	    // InternalFPML.g:643:6: (lv_ProdAdtElements_3_1= ruleValueType | lv_ProdAdtElements_3_2= ruleValue )
            	    {
            	    // InternalFPML.g:643:6: (lv_ProdAdtElements_3_1= ruleValueType | lv_ProdAdtElements_3_2= ruleValue )
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( ((LA9_0>=28 && LA9_0<=29)||LA9_0==31) ) {
            	        alt9=1;
            	    }
            	    else if ( ((LA9_0>=RULE_INT && LA9_0<=RULE_STRING)||LA9_0==32) ) {
            	        alt9=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 9, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // InternalFPML.g:644:7: lv_ProdAdtElements_3_1= ruleValueType
            	            {

            	            							newCompositeNode(grammarAccess.getProdTypeAccess().getProdAdtElementsValueTypeParserRuleCall_2_1_0_0());
            	            						
            	            pushFollow(FOLLOW_17);
            	            lv_ProdAdtElements_3_1=ruleValueType();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getProdTypeRule());
            	            							}
            	            							add(
            	            								current,
            	            								"ProdAdtElements",
            	            								lv_ProdAdtElements_3_1,
            	            								"it.unibo.FPML.ValueType");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalFPML.g:660:7: lv_ProdAdtElements_3_2= ruleValue
            	            {

            	            							newCompositeNode(grammarAccess.getProdTypeAccess().getProdAdtElementsValueParserRuleCall_2_1_0_1());
            	            						
            	            pushFollow(FOLLOW_17);
            	            lv_ProdAdtElements_3_2=ruleValue();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getProdTypeRule());
            	            							}
            	            							add(
            	            								current,
            	            								"ProdAdtElements",
            	            								lv_ProdAdtElements_3_2,
            	            								"it.unibo.FPML.Value");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getProdTypeAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

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
    // InternalFPML.g:687:1: entryRulePureFunction returns [EObject current=null] : iv_rulePureFunction= rulePureFunction EOF ;
    public final EObject entryRulePureFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePureFunction = null;


        try {
            // InternalFPML.g:687:53: (iv_rulePureFunction= rulePureFunction EOF )
            // InternalFPML.g:688:2: iv_rulePureFunction= rulePureFunction EOF
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
    // InternalFPML.g:694:1: rulePureFunction returns [EObject current=null] : (otherlv_0= 'def' ( (lv_returnType_1_0= ruleValueType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_arg_4_0= ruleArgument ) ) otherlv_5= ')' otherlv_6= ':' otherlv_7= '{' ( (lv_functionBody_8_0= ruleFunctionBodyPure ) ) otherlv_9= '}' ) ;
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
            // InternalFPML.g:700:2: ( (otherlv_0= 'def' ( (lv_returnType_1_0= ruleValueType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_arg_4_0= ruleArgument ) ) otherlv_5= ')' otherlv_6= ':' otherlv_7= '{' ( (lv_functionBody_8_0= ruleFunctionBodyPure ) ) otherlv_9= '}' ) )
            // InternalFPML.g:701:2: (otherlv_0= 'def' ( (lv_returnType_1_0= ruleValueType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_arg_4_0= ruleArgument ) ) otherlv_5= ')' otherlv_6= ':' otherlv_7= '{' ( (lv_functionBody_8_0= ruleFunctionBodyPure ) ) otherlv_9= '}' )
            {
            // InternalFPML.g:701:2: (otherlv_0= 'def' ( (lv_returnType_1_0= ruleValueType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_arg_4_0= ruleArgument ) ) otherlv_5= ')' otherlv_6= ':' otherlv_7= '{' ( (lv_functionBody_8_0= ruleFunctionBodyPure ) ) otherlv_9= '}' )
            // InternalFPML.g:702:3: otherlv_0= 'def' ( (lv_returnType_1_0= ruleValueType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_arg_4_0= ruleArgument ) ) otherlv_5= ')' otherlv_6= ':' otherlv_7= '{' ( (lv_functionBody_8_0= ruleFunctionBodyPure ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getPureFunctionAccess().getDefKeyword_0());
            		
            // InternalFPML.g:706:3: ( (lv_returnType_1_0= ruleValueType ) )
            // InternalFPML.g:707:4: (lv_returnType_1_0= ruleValueType )
            {
            // InternalFPML.g:707:4: (lv_returnType_1_0= ruleValueType )
            // InternalFPML.g:708:5: lv_returnType_1_0= ruleValueType
            {

            					newCompositeNode(grammarAccess.getPureFunctionAccess().getReturnTypeValueTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
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

            // InternalFPML.g:725:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalFPML.g:726:4: (lv_name_2_0= RULE_ID )
            {
            // InternalFPML.g:726:4: (lv_name_2_0= RULE_ID )
            // InternalFPML.g:727:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_20); 

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

            otherlv_3=(Token)match(input,18,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getPureFunctionAccess().getLeftParenthesisKeyword_3());
            		
            // InternalFPML.g:747:3: ( (lv_arg_4_0= ruleArgument ) )
            // InternalFPML.g:748:4: (lv_arg_4_0= ruleArgument )
            {
            // InternalFPML.g:748:4: (lv_arg_4_0= ruleArgument )
            // InternalFPML.g:749:5: lv_arg_4_0= ruleArgument
            {

            					newCompositeNode(grammarAccess.getPureFunctionAccess().getArgArgumentParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_21);
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

            otherlv_5=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getPureFunctionAccess().getRightParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getPureFunctionAccess().getColonKeyword_6());
            		
            otherlv_7=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_7, grammarAccess.getPureFunctionAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalFPML.g:778:3: ( (lv_functionBody_8_0= ruleFunctionBodyPure ) )
            // InternalFPML.g:779:4: (lv_functionBody_8_0= ruleFunctionBodyPure )
            {
            // InternalFPML.g:779:4: (lv_functionBody_8_0= ruleFunctionBodyPure )
            // InternalFPML.g:780:5: lv_functionBody_8_0= ruleFunctionBodyPure
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
    // InternalFPML.g:805:1: entryRuleEffectFullFunction returns [EObject current=null] : iv_ruleEffectFullFunction= ruleEffectFullFunction EOF ;
    public final EObject entryRuleEffectFullFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullFunction = null;


        try {
            // InternalFPML.g:805:59: (iv_ruleEffectFullFunction= ruleEffectFullFunction EOF )
            // InternalFPML.g:806:2: iv_ruleEffectFullFunction= ruleEffectFullFunction EOF
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
    // InternalFPML.g:812:1: ruleEffectFullFunction returns [EObject current=null] : (otherlv_0= 'def' ( (lv_returnType_1_0= ruleIOType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_arg_4_0= ruleEffectFullArgument ) ) otherlv_5= ')' otherlv_6= ':' otherlv_7= '{' ( (lv_functionBody_8_0= ruleFunctionBodyEffectFull ) ) otherlv_9= '}' ) ;
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
            // InternalFPML.g:818:2: ( (otherlv_0= 'def' ( (lv_returnType_1_0= ruleIOType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_arg_4_0= ruleEffectFullArgument ) ) otherlv_5= ')' otherlv_6= ':' otherlv_7= '{' ( (lv_functionBody_8_0= ruleFunctionBodyEffectFull ) ) otherlv_9= '}' ) )
            // InternalFPML.g:819:2: (otherlv_0= 'def' ( (lv_returnType_1_0= ruleIOType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_arg_4_0= ruleEffectFullArgument ) ) otherlv_5= ')' otherlv_6= ':' otherlv_7= '{' ( (lv_functionBody_8_0= ruleFunctionBodyEffectFull ) ) otherlv_9= '}' )
            {
            // InternalFPML.g:819:2: (otherlv_0= 'def' ( (lv_returnType_1_0= ruleIOType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_arg_4_0= ruleEffectFullArgument ) ) otherlv_5= ')' otherlv_6= ':' otherlv_7= '{' ( (lv_functionBody_8_0= ruleFunctionBodyEffectFull ) ) otherlv_9= '}' )
            // InternalFPML.g:820:3: otherlv_0= 'def' ( (lv_returnType_1_0= ruleIOType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_arg_4_0= ruleEffectFullArgument ) ) otherlv_5= ')' otherlv_6= ':' otherlv_7= '{' ( (lv_functionBody_8_0= ruleFunctionBodyEffectFull ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getEffectFullFunctionAccess().getDefKeyword_0());
            		
            // InternalFPML.g:824:3: ( (lv_returnType_1_0= ruleIOType ) )
            // InternalFPML.g:825:4: (lv_returnType_1_0= ruleIOType )
            {
            // InternalFPML.g:825:4: (lv_returnType_1_0= ruleIOType )
            // InternalFPML.g:826:5: lv_returnType_1_0= ruleIOType
            {

            					newCompositeNode(grammarAccess.getEffectFullFunctionAccess().getReturnTypeIOTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
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

            // InternalFPML.g:843:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalFPML.g:844:4: (lv_name_2_0= RULE_ID )
            {
            // InternalFPML.g:844:4: (lv_name_2_0= RULE_ID )
            // InternalFPML.g:845:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_20); 

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

            otherlv_3=(Token)match(input,18,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getEffectFullFunctionAccess().getLeftParenthesisKeyword_3());
            		
            // InternalFPML.g:865:3: ( (lv_arg_4_0= ruleEffectFullArgument ) )
            // InternalFPML.g:866:4: (lv_arg_4_0= ruleEffectFullArgument )
            {
            // InternalFPML.g:866:4: (lv_arg_4_0= ruleEffectFullArgument )
            // InternalFPML.g:867:5: lv_arg_4_0= ruleEffectFullArgument
            {

            					newCompositeNode(grammarAccess.getEffectFullFunctionAccess().getArgEffectFullArgumentParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_21);
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

            otherlv_5=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getEffectFullFunctionAccess().getRightParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getEffectFullFunctionAccess().getColonKeyword_6());
            		
            otherlv_7=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_7, grammarAccess.getEffectFullFunctionAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalFPML.g:896:3: ( (lv_functionBody_8_0= ruleFunctionBodyEffectFull ) )
            // InternalFPML.g:897:4: (lv_functionBody_8_0= ruleFunctionBodyEffectFull )
            {
            // InternalFPML.g:897:4: (lv_functionBody_8_0= ruleFunctionBodyEffectFull )
            // InternalFPML.g:898:5: lv_functionBody_8_0= ruleFunctionBodyEffectFull
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
    // InternalFPML.g:923:1: entryRuleMainFunc returns [EObject current=null] : iv_ruleMainFunc= ruleMainFunc EOF ;
    public final EObject entryRuleMainFunc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMainFunc = null;


        try {
            // InternalFPML.g:923:49: (iv_ruleMainFunc= ruleMainFunc EOF )
            // InternalFPML.g:924:2: iv_ruleMainFunc= ruleMainFunc EOF
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
    // InternalFPML.g:930:1: ruleMainFunc returns [EObject current=null] : (otherlv_0= 'IO' ( (lv_returnType_1_0= ruleUnitType ) ) otherlv_2= 'main' otherlv_3= ':' otherlv_4= '{' ( (lv_functionBody_5_0= ruleFunctionBodyEffectFull ) ) otherlv_6= '}' ) ;
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
            // InternalFPML.g:936:2: ( (otherlv_0= 'IO' ( (lv_returnType_1_0= ruleUnitType ) ) otherlv_2= 'main' otherlv_3= ':' otherlv_4= '{' ( (lv_functionBody_5_0= ruleFunctionBodyEffectFull ) ) otherlv_6= '}' ) )
            // InternalFPML.g:937:2: (otherlv_0= 'IO' ( (lv_returnType_1_0= ruleUnitType ) ) otherlv_2= 'main' otherlv_3= ':' otherlv_4= '{' ( (lv_functionBody_5_0= ruleFunctionBodyEffectFull ) ) otherlv_6= '}' )
            {
            // InternalFPML.g:937:2: (otherlv_0= 'IO' ( (lv_returnType_1_0= ruleUnitType ) ) otherlv_2= 'main' otherlv_3= ':' otherlv_4= '{' ( (lv_functionBody_5_0= ruleFunctionBodyEffectFull ) ) otherlv_6= '}' )
            // InternalFPML.g:938:3: otherlv_0= 'IO' ( (lv_returnType_1_0= ruleUnitType ) ) otherlv_2= 'main' otherlv_3= ':' otherlv_4= '{' ( (lv_functionBody_5_0= ruleFunctionBodyEffectFull ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getMainFuncAccess().getIOKeyword_0());
            		
            // InternalFPML.g:942:3: ( (lv_returnType_1_0= ruleUnitType ) )
            // InternalFPML.g:943:4: (lv_returnType_1_0= ruleUnitType )
            {
            // InternalFPML.g:943:4: (lv_returnType_1_0= ruleUnitType )
            // InternalFPML.g:944:5: lv_returnType_1_0= ruleUnitType
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

            otherlv_2=(Token)match(input,24,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getMainFuncAccess().getMainKeyword_2());
            		
            otherlv_3=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getMainFuncAccess().getColonKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_4, grammarAccess.getMainFuncAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalFPML.g:973:3: ( (lv_functionBody_5_0= ruleFunctionBodyEffectFull ) )
            // InternalFPML.g:974:4: (lv_functionBody_5_0= ruleFunctionBodyEffectFull )
            {
            // InternalFPML.g:974:4: (lv_functionBody_5_0= ruleFunctionBodyEffectFull )
            // InternalFPML.g:975:5: lv_functionBody_5_0= ruleFunctionBodyEffectFull
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
    // InternalFPML.g:1000:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalFPML.g:1000:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalFPML.g:1001:2: iv_ruleFunction= ruleFunction EOF
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
    // InternalFPML.g:1007:1: ruleFunction returns [EObject current=null] : (this_PureFunction_0= rulePureFunction | this_EffectFullFunction_1= ruleEffectFullFunction ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        EObject this_PureFunction_0 = null;

        EObject this_EffectFullFunction_1 = null;



        	enterRule();

        try {
            // InternalFPML.g:1013:2: ( (this_PureFunction_0= rulePureFunction | this_EffectFullFunction_1= ruleEffectFullFunction ) )
            // InternalFPML.g:1014:2: (this_PureFunction_0= rulePureFunction | this_EffectFullFunction_1= ruleEffectFullFunction )
            {
            // InternalFPML.g:1014:2: (this_PureFunction_0= rulePureFunction | this_EffectFullFunction_1= ruleEffectFullFunction )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==23) ) {
                    alt11=2;
                }
                else if ( ((LA11_1>=28 && LA11_1<=29)||LA11_1==31) ) {
                    alt11=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalFPML.g:1015:3: this_PureFunction_0= rulePureFunction
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
                    // InternalFPML.g:1024:3: this_EffectFullFunction_1= ruleEffectFullFunction
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
    // InternalFPML.g:1036:1: entryRuleEffectFullArgument returns [EObject current=null] : iv_ruleEffectFullArgument= ruleEffectFullArgument EOF ;
    public final EObject entryRuleEffectFullArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullArgument = null;


        try {
            // InternalFPML.g:1036:59: (iv_ruleEffectFullArgument= ruleEffectFullArgument EOF )
            // InternalFPML.g:1037:2: iv_ruleEffectFullArgument= ruleEffectFullArgument EOF
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
    // InternalFPML.g:1043:1: ruleEffectFullArgument returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) )? ) ;
    public final EObject ruleEffectFullArgument() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:1049:2: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) )? ) )
            // InternalFPML.g:1050:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) )? )
            {
            // InternalFPML.g:1050:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) )? )
            // InternalFPML.g:1051:3: ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) )?
            {
            // InternalFPML.g:1051:3: ( (lv_type_0_0= ruleType ) )
            // InternalFPML.g:1052:4: (lv_type_0_0= ruleType )
            {
            // InternalFPML.g:1052:4: (lv_type_0_0= ruleType )
            // InternalFPML.g:1053:5: lv_type_0_0= ruleType
            {

            					newCompositeNode(grammarAccess.getEffectFullArgumentAccess().getTypeTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_26);
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

            // InternalFPML.g:1070:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalFPML.g:1071:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalFPML.g:1071:4: (lv_name_1_0= RULE_ID )
                    // InternalFPML.g:1072:5: lv_name_1_0= RULE_ID
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
    // InternalFPML.g:1092:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // InternalFPML.g:1092:49: (iv_ruleArgument= ruleArgument EOF )
            // InternalFPML.g:1093:2: iv_ruleArgument= ruleArgument EOF
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
    // InternalFPML.g:1099:1: ruleArgument returns [EObject current=null] : ( ( (lv_type_0_0= ruleValueType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:1105:2: ( ( ( (lv_type_0_0= ruleValueType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalFPML.g:1106:2: ( ( (lv_type_0_0= ruleValueType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalFPML.g:1106:2: ( ( (lv_type_0_0= ruleValueType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalFPML.g:1107:3: ( (lv_type_0_0= ruleValueType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalFPML.g:1107:3: ( (lv_type_0_0= ruleValueType ) )
            // InternalFPML.g:1108:4: (lv_type_0_0= ruleValueType )
            {
            // InternalFPML.g:1108:4: (lv_type_0_0= ruleValueType )
            // InternalFPML.g:1109:5: lv_type_0_0= ruleValueType
            {

            					newCompositeNode(grammarAccess.getArgumentAccess().getTypeValueTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_19);
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

            // InternalFPML.g:1126:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFPML.g:1127:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFPML.g:1127:4: (lv_name_1_0= RULE_ID )
            // InternalFPML.g:1128:5: lv_name_1_0= RULE_ID
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
    // InternalFPML.g:1148:1: entryRuleFunctionBodyPure returns [EObject current=null] : iv_ruleFunctionBodyPure= ruleFunctionBodyPure EOF ;
    public final EObject entryRuleFunctionBodyPure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionBodyPure = null;


        try {
            // InternalFPML.g:1148:57: (iv_ruleFunctionBodyPure= ruleFunctionBodyPure EOF )
            // InternalFPML.g:1149:2: iv_ruleFunctionBodyPure= ruleFunctionBodyPure EOF
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
    // InternalFPML.g:1155:1: ruleFunctionBodyPure returns [EObject current=null] : (this_EmptyFunctionBody_0= ruleEmptyFunctionBody | this_CompositionFunctionBodyPure_1= ruleCompositionFunctionBodyPure ) ;
    public final EObject ruleFunctionBodyPure() throws RecognitionException {
        EObject current = null;

        EObject this_EmptyFunctionBody_0 = null;

        EObject this_CompositionFunctionBodyPure_1 = null;



        	enterRule();

        try {
            // InternalFPML.g:1161:2: ( (this_EmptyFunctionBody_0= ruleEmptyFunctionBody | this_CompositionFunctionBodyPure_1= ruleCompositionFunctionBodyPure ) )
            // InternalFPML.g:1162:2: (this_EmptyFunctionBody_0= ruleEmptyFunctionBody | this_CompositionFunctionBodyPure_1= ruleCompositionFunctionBodyPure )
            {
            // InternalFPML.g:1162:2: (this_EmptyFunctionBody_0= ruleEmptyFunctionBody | this_CompositionFunctionBodyPure_1= ruleCompositionFunctionBodyPure )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ID) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalFPML.g:1163:3: this_EmptyFunctionBody_0= ruleEmptyFunctionBody
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
                    // InternalFPML.g:1172:3: this_CompositionFunctionBodyPure_1= ruleCompositionFunctionBodyPure
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
    // InternalFPML.g:1184:1: entryRuleFunctionBodyEffectFull returns [EObject current=null] : iv_ruleFunctionBodyEffectFull= ruleFunctionBodyEffectFull EOF ;
    public final EObject entryRuleFunctionBodyEffectFull() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionBodyEffectFull = null;


        try {
            // InternalFPML.g:1184:63: (iv_ruleFunctionBodyEffectFull= ruleFunctionBodyEffectFull EOF )
            // InternalFPML.g:1185:2: iv_ruleFunctionBodyEffectFull= ruleFunctionBodyEffectFull EOF
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
    // InternalFPML.g:1191:1: ruleFunctionBodyEffectFull returns [EObject current=null] : (this_EmptyFunctionBody_0= ruleEmptyFunctionBody | this_CompositionFunctionBodyEffect_1= ruleCompositionFunctionBodyEffect ) ;
    public final EObject ruleFunctionBodyEffectFull() throws RecognitionException {
        EObject current = null;

        EObject this_EmptyFunctionBody_0 = null;

        EObject this_CompositionFunctionBodyEffect_1 = null;



        	enterRule();

        try {
            // InternalFPML.g:1197:2: ( (this_EmptyFunctionBody_0= ruleEmptyFunctionBody | this_CompositionFunctionBodyEffect_1= ruleCompositionFunctionBodyEffect ) )
            // InternalFPML.g:1198:2: (this_EmptyFunctionBody_0= ruleEmptyFunctionBody | this_CompositionFunctionBodyEffect_1= ruleCompositionFunctionBodyEffect )
            {
            // InternalFPML.g:1198:2: (this_EmptyFunctionBody_0= ruleEmptyFunctionBody | this_CompositionFunctionBodyEffect_1= ruleCompositionFunctionBodyEffect )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_ID) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalFPML.g:1199:3: this_EmptyFunctionBody_0= ruleEmptyFunctionBody
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
                    // InternalFPML.g:1208:3: this_CompositionFunctionBodyEffect_1= ruleCompositionFunctionBodyEffect
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
    // InternalFPML.g:1220:1: entryRuleEmptyFunctionBody returns [EObject current=null] : iv_ruleEmptyFunctionBody= ruleEmptyFunctionBody EOF ;
    public final EObject entryRuleEmptyFunctionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmptyFunctionBody = null;


        try {
            // InternalFPML.g:1220:58: (iv_ruleEmptyFunctionBody= ruleEmptyFunctionBody EOF )
            // InternalFPML.g:1221:2: iv_ruleEmptyFunctionBody= ruleEmptyFunctionBody EOF
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
    // InternalFPML.g:1227:1: ruleEmptyFunctionBody returns [EObject current=null] : ( () otherlv_1= 'Undefined' ) ;
    public final EObject ruleEmptyFunctionBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFPML.g:1233:2: ( ( () otherlv_1= 'Undefined' ) )
            // InternalFPML.g:1234:2: ( () otherlv_1= 'Undefined' )
            {
            // InternalFPML.g:1234:2: ( () otherlv_1= 'Undefined' )
            // InternalFPML.g:1235:3: () otherlv_1= 'Undefined'
            {
            // InternalFPML.g:1235:3: ()
            // InternalFPML.g:1236:4: 
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
    // InternalFPML.g:1250:1: entryRuleCompositionFunctionBodyPure returns [EObject current=null] : iv_ruleCompositionFunctionBodyPure= ruleCompositionFunctionBodyPure EOF ;
    public final EObject entryRuleCompositionFunctionBodyPure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositionFunctionBodyPure = null;


        try {
            // InternalFPML.g:1250:68: (iv_ruleCompositionFunctionBodyPure= ruleCompositionFunctionBodyPure EOF )
            // InternalFPML.g:1251:2: iv_ruleCompositionFunctionBodyPure= ruleCompositionFunctionBodyPure EOF
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
    // InternalFPML.g:1257:1: ruleCompositionFunctionBodyPure returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '|>' ( (otherlv_2= RULE_ID ) ) ) (otherlv_3= '|>' ( (otherlv_4= RULE_ID ) ) )* ) ;
    public final EObject ruleCompositionFunctionBodyPure() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalFPML.g:1263:2: ( ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '|>' ( (otherlv_2= RULE_ID ) ) ) (otherlv_3= '|>' ( (otherlv_4= RULE_ID ) ) )* ) )
            // InternalFPML.g:1264:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '|>' ( (otherlv_2= RULE_ID ) ) ) (otherlv_3= '|>' ( (otherlv_4= RULE_ID ) ) )* )
            {
            // InternalFPML.g:1264:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '|>' ( (otherlv_2= RULE_ID ) ) ) (otherlv_3= '|>' ( (otherlv_4= RULE_ID ) ) )* )
            // InternalFPML.g:1265:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '|>' ( (otherlv_2= RULE_ID ) ) ) (otherlv_3= '|>' ( (otherlv_4= RULE_ID ) ) )*
            {
            // InternalFPML.g:1265:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '|>' ( (otherlv_2= RULE_ID ) ) )
            // InternalFPML.g:1266:4: ( (otherlv_0= RULE_ID ) ) otherlv_1= '|>' ( (otherlv_2= RULE_ID ) )
            {
            // InternalFPML.g:1266:4: ( (otherlv_0= RULE_ID ) )
            // InternalFPML.g:1267:5: (otherlv_0= RULE_ID )
            {
            // InternalFPML.g:1267:5: (otherlv_0= RULE_ID )
            // InternalFPML.g:1268:6: otherlv_0= RULE_ID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getCompositionFunctionBodyPureRule());
            						}
            					
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_27); 

            						newLeafNode(otherlv_0, grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainInitialPureChainElementCrossReference_0_0_0());
            					

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_19); 

            				newLeafNode(otherlv_1, grammarAccess.getCompositionFunctionBodyPureAccess().getVerticalLineGreaterThanSignKeyword_0_1());
            			
            // InternalFPML.g:1283:4: ( (otherlv_2= RULE_ID ) )
            // InternalFPML.g:1284:5: (otherlv_2= RULE_ID )
            {
            // InternalFPML.g:1284:5: (otherlv_2= RULE_ID )
            // InternalFPML.g:1285:6: otherlv_2= RULE_ID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getCompositionFunctionBodyPureRule());
            						}
            					
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_28); 

            						newLeafNode(otherlv_2, grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainPureFunctionCrossReference_0_2_0());
            					

            }


            }


            }

            // InternalFPML.g:1297:3: (otherlv_3= '|>' ( (otherlv_4= RULE_ID ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==26) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalFPML.g:1298:4: otherlv_3= '|>' ( (otherlv_4= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,26,FOLLOW_19); 

            	    				newLeafNode(otherlv_3, grammarAccess.getCompositionFunctionBodyPureAccess().getVerticalLineGreaterThanSignKeyword_1_0());
            	    			
            	    // InternalFPML.g:1302:4: ( (otherlv_4= RULE_ID ) )
            	    // InternalFPML.g:1303:5: (otherlv_4= RULE_ID )
            	    {
            	    // InternalFPML.g:1303:5: (otherlv_4= RULE_ID )
            	    // InternalFPML.g:1304:6: otherlv_4= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getCompositionFunctionBodyPureRule());
            	    						}
            	    					
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_28); 

            	    						newLeafNode(otherlv_4, grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainPureFunctionCrossReference_1_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalFPML.g:1320:1: entryRuleCompositionFunctionBodyEffect returns [EObject current=null] : iv_ruleCompositionFunctionBodyEffect= ruleCompositionFunctionBodyEffect EOF ;
    public final EObject entryRuleCompositionFunctionBodyEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositionFunctionBodyEffect = null;


        try {
            // InternalFPML.g:1320:70: (iv_ruleCompositionFunctionBodyEffect= ruleCompositionFunctionBodyEffect EOF )
            // InternalFPML.g:1321:2: iv_ruleCompositionFunctionBodyEffect= ruleCompositionFunctionBodyEffect EOF
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
    // InternalFPML.g:1327:1: ruleCompositionFunctionBodyEffect returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '>>=' ( (otherlv_2= RULE_ID ) ) ) (otherlv_3= '>>=' ( (otherlv_4= RULE_ID ) ) )* ) ;
    public final EObject ruleCompositionFunctionBodyEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalFPML.g:1333:2: ( ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '>>=' ( (otherlv_2= RULE_ID ) ) ) (otherlv_3= '>>=' ( (otherlv_4= RULE_ID ) ) )* ) )
            // InternalFPML.g:1334:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '>>=' ( (otherlv_2= RULE_ID ) ) ) (otherlv_3= '>>=' ( (otherlv_4= RULE_ID ) ) )* )
            {
            // InternalFPML.g:1334:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '>>=' ( (otherlv_2= RULE_ID ) ) ) (otherlv_3= '>>=' ( (otherlv_4= RULE_ID ) ) )* )
            // InternalFPML.g:1335:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '>>=' ( (otherlv_2= RULE_ID ) ) ) (otherlv_3= '>>=' ( (otherlv_4= RULE_ID ) ) )*
            {
            // InternalFPML.g:1335:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '>>=' ( (otherlv_2= RULE_ID ) ) )
            // InternalFPML.g:1336:4: ( (otherlv_0= RULE_ID ) ) otherlv_1= '>>=' ( (otherlv_2= RULE_ID ) )
            {
            // InternalFPML.g:1336:4: ( (otherlv_0= RULE_ID ) )
            // InternalFPML.g:1337:5: (otherlv_0= RULE_ID )
            {
            // InternalFPML.g:1337:5: (otherlv_0= RULE_ID )
            // InternalFPML.g:1338:6: otherlv_0= RULE_ID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getCompositionFunctionBodyEffectRule());
            						}
            					
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_29); 

            						newLeafNode(otherlv_0, grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainChainElementCrossReference_0_0_0());
            					

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_19); 

            				newLeafNode(otherlv_1, grammarAccess.getCompositionFunctionBodyEffectAccess().getGreaterThanSignGreaterThanSignEqualsSignKeyword_0_1());
            			
            // InternalFPML.g:1353:4: ( (otherlv_2= RULE_ID ) )
            // InternalFPML.g:1354:5: (otherlv_2= RULE_ID )
            {
            // InternalFPML.g:1354:5: (otherlv_2= RULE_ID )
            // InternalFPML.g:1355:6: otherlv_2= RULE_ID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getCompositionFunctionBodyEffectRule());
            						}
            					
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_30); 

            						newLeafNode(otherlv_2, grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainChainElementCrossReference_0_2_0());
            					

            }


            }


            }

            // InternalFPML.g:1367:3: (otherlv_3= '>>=' ( (otherlv_4= RULE_ID ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==27) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalFPML.g:1368:4: otherlv_3= '>>=' ( (otherlv_4= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,27,FOLLOW_19); 

            	    				newLeafNode(otherlv_3, grammarAccess.getCompositionFunctionBodyEffectAccess().getGreaterThanSignGreaterThanSignEqualsSignKeyword_1_0());
            	    			
            	    // InternalFPML.g:1372:4: ( (otherlv_4= RULE_ID ) )
            	    // InternalFPML.g:1373:5: (otherlv_4= RULE_ID )
            	    {
            	    // InternalFPML.g:1373:5: (otherlv_4= RULE_ID )
            	    // InternalFPML.g:1374:6: otherlv_4= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getCompositionFunctionBodyEffectRule());
            	    						}
            	    					
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_30); 

            	    						newLeafNode(otherlv_4, grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainChainElementCrossReference_1_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalFPML.g:1390:1: entryRuleIOType returns [EObject current=null] : iv_ruleIOType= ruleIOType EOF ;
    public final EObject entryRuleIOType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIOType = null;


        try {
            // InternalFPML.g:1390:47: (iv_ruleIOType= ruleIOType EOF )
            // InternalFPML.g:1391:2: iv_ruleIOType= ruleIOType EOF
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
    // InternalFPML.g:1397:1: ruleIOType returns [EObject current=null] : (otherlv_0= 'IO' ( (lv_type_1_0= ruleType ) ) ) ;
    public final EObject ruleIOType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:1403:2: ( (otherlv_0= 'IO' ( (lv_type_1_0= ruleType ) ) ) )
            // InternalFPML.g:1404:2: (otherlv_0= 'IO' ( (lv_type_1_0= ruleType ) ) )
            {
            // InternalFPML.g:1404:2: (otherlv_0= 'IO' ( (lv_type_1_0= ruleType ) ) )
            // InternalFPML.g:1405:3: otherlv_0= 'IO' ( (lv_type_1_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getIOTypeAccess().getIOKeyword_0());
            		
            // InternalFPML.g:1409:3: ( (lv_type_1_0= ruleType ) )
            // InternalFPML.g:1410:4: (lv_type_1_0= ruleType )
            {
            // InternalFPML.g:1410:4: (lv_type_1_0= ruleType )
            // InternalFPML.g:1411:5: lv_type_1_0= ruleType
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
    // InternalFPML.g:1432:1: entryRuleValueType returns [EObject current=null] : iv_ruleValueType= ruleValueType EOF ;
    public final EObject entryRuleValueType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueType = null;


        try {
            // InternalFPML.g:1432:50: (iv_ruleValueType= ruleValueType EOF )
            // InternalFPML.g:1433:2: iv_ruleValueType= ruleValueType EOF
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
    // InternalFPML.g:1439:1: ruleValueType returns [EObject current=null] : (this_IntegerType_0= ruleIntegerType | this_StringType_1= ruleStringType | this_DataType_2= ruleDataType ) ;
    public final EObject ruleValueType() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerType_0 = null;

        EObject this_StringType_1 = null;

        EObject this_DataType_2 = null;



        	enterRule();

        try {
            // InternalFPML.g:1445:2: ( (this_IntegerType_0= ruleIntegerType | this_StringType_1= ruleStringType | this_DataType_2= ruleDataType ) )
            // InternalFPML.g:1446:2: (this_IntegerType_0= ruleIntegerType | this_StringType_1= ruleStringType | this_DataType_2= ruleDataType )
            {
            // InternalFPML.g:1446:2: (this_IntegerType_0= ruleIntegerType | this_StringType_1= ruleStringType | this_DataType_2= ruleDataType )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt17=1;
                }
                break;
            case 29:
                {
                alt17=2;
                }
                break;
            case 31:
                {
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalFPML.g:1447:3: this_IntegerType_0= ruleIntegerType
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
                    // InternalFPML.g:1456:3: this_StringType_1= ruleStringType
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
                    // InternalFPML.g:1465:3: this_DataType_2= ruleDataType
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
    // InternalFPML.g:1477:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalFPML.g:1477:45: (iv_ruleType= ruleType EOF )
            // InternalFPML.g:1478:2: iv_ruleType= ruleType EOF
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
    // InternalFPML.g:1484:1: ruleType returns [EObject current=null] : (this_ValueType_0= ruleValueType | this_UnitType_1= ruleUnitType ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_ValueType_0 = null;

        EObject this_UnitType_1 = null;



        	enterRule();

        try {
            // InternalFPML.g:1490:2: ( (this_ValueType_0= ruleValueType | this_UnitType_1= ruleUnitType ) )
            // InternalFPML.g:1491:2: (this_ValueType_0= ruleValueType | this_UnitType_1= ruleUnitType )
            {
            // InternalFPML.g:1491:2: (this_ValueType_0= ruleValueType | this_UnitType_1= ruleUnitType )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=28 && LA18_0<=29)||LA18_0==31) ) {
                alt18=1;
            }
            else if ( (LA18_0==30) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalFPML.g:1492:3: this_ValueType_0= ruleValueType
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
                    // InternalFPML.g:1501:3: this_UnitType_1= ruleUnitType
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
    // InternalFPML.g:1513:1: entryRuleIntegerType returns [EObject current=null] : iv_ruleIntegerType= ruleIntegerType EOF ;
    public final EObject entryRuleIntegerType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerType = null;


        try {
            // InternalFPML.g:1513:52: (iv_ruleIntegerType= ruleIntegerType EOF )
            // InternalFPML.g:1514:2: iv_ruleIntegerType= ruleIntegerType EOF
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
    // InternalFPML.g:1520:1: ruleIntegerType returns [EObject current=null] : ( () ( (lv_type_1_0= 'int' ) ) ) ;
    public final EObject ruleIntegerType() throws RecognitionException {
        EObject current = null;

        Token lv_type_1_0=null;


        	enterRule();

        try {
            // InternalFPML.g:1526:2: ( ( () ( (lv_type_1_0= 'int' ) ) ) )
            // InternalFPML.g:1527:2: ( () ( (lv_type_1_0= 'int' ) ) )
            {
            // InternalFPML.g:1527:2: ( () ( (lv_type_1_0= 'int' ) ) )
            // InternalFPML.g:1528:3: () ( (lv_type_1_0= 'int' ) )
            {
            // InternalFPML.g:1528:3: ()
            // InternalFPML.g:1529:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntegerTypeAccess().getIntegerTypeAction_0(),
            					current);
            			

            }

            // InternalFPML.g:1535:3: ( (lv_type_1_0= 'int' ) )
            // InternalFPML.g:1536:4: (lv_type_1_0= 'int' )
            {
            // InternalFPML.g:1536:4: (lv_type_1_0= 'int' )
            // InternalFPML.g:1537:5: lv_type_1_0= 'int'
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
    // InternalFPML.g:1553:1: entryRuleStringType returns [EObject current=null] : iv_ruleStringType= ruleStringType EOF ;
    public final EObject entryRuleStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringType = null;


        try {
            // InternalFPML.g:1553:51: (iv_ruleStringType= ruleStringType EOF )
            // InternalFPML.g:1554:2: iv_ruleStringType= ruleStringType EOF
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
    // InternalFPML.g:1560:1: ruleStringType returns [EObject current=null] : ( () ( (lv_type_1_0= 'String' ) ) ) ;
    public final EObject ruleStringType() throws RecognitionException {
        EObject current = null;

        Token lv_type_1_0=null;


        	enterRule();

        try {
            // InternalFPML.g:1566:2: ( ( () ( (lv_type_1_0= 'String' ) ) ) )
            // InternalFPML.g:1567:2: ( () ( (lv_type_1_0= 'String' ) ) )
            {
            // InternalFPML.g:1567:2: ( () ( (lv_type_1_0= 'String' ) ) )
            // InternalFPML.g:1568:3: () ( (lv_type_1_0= 'String' ) )
            {
            // InternalFPML.g:1568:3: ()
            // InternalFPML.g:1569:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStringTypeAccess().getStringTypeAction_0(),
            					current);
            			

            }

            // InternalFPML.g:1575:3: ( (lv_type_1_0= 'String' ) )
            // InternalFPML.g:1576:4: (lv_type_1_0= 'String' )
            {
            // InternalFPML.g:1576:4: (lv_type_1_0= 'String' )
            // InternalFPML.g:1577:5: lv_type_1_0= 'String'
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
    // InternalFPML.g:1593:1: entryRuleUnitType returns [EObject current=null] : iv_ruleUnitType= ruleUnitType EOF ;
    public final EObject entryRuleUnitType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnitType = null;


        try {
            // InternalFPML.g:1593:49: (iv_ruleUnitType= ruleUnitType EOF )
            // InternalFPML.g:1594:2: iv_ruleUnitType= ruleUnitType EOF
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
    // InternalFPML.g:1600:1: ruleUnitType returns [EObject current=null] : ( () ( (lv_type_1_0= 'Unit' ) ) ) ;
    public final EObject ruleUnitType() throws RecognitionException {
        EObject current = null;

        Token lv_type_1_0=null;


        	enterRule();

        try {
            // InternalFPML.g:1606:2: ( ( () ( (lv_type_1_0= 'Unit' ) ) ) )
            // InternalFPML.g:1607:2: ( () ( (lv_type_1_0= 'Unit' ) ) )
            {
            // InternalFPML.g:1607:2: ( () ( (lv_type_1_0= 'Unit' ) ) )
            // InternalFPML.g:1608:3: () ( (lv_type_1_0= 'Unit' ) )
            {
            // InternalFPML.g:1608:3: ()
            // InternalFPML.g:1609:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUnitTypeAccess().getUnitTypeAction_0(),
            					current);
            			

            }

            // InternalFPML.g:1615:3: ( (lv_type_1_0= 'Unit' ) )
            // InternalFPML.g:1616:4: (lv_type_1_0= 'Unit' )
            {
            // InternalFPML.g:1616:4: (lv_type_1_0= 'Unit' )
            // InternalFPML.g:1617:5: lv_type_1_0= 'Unit'
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
    // InternalFPML.g:1633:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalFPML.g:1633:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalFPML.g:1634:2: iv_ruleDataType= ruleDataType EOF
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
    // InternalFPML.g:1640:1: ruleDataType returns [EObject current=null] : ( () otherlv_1= 'ref' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalFPML.g:1646:2: ( ( () otherlv_1= 'ref' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalFPML.g:1647:2: ( () otherlv_1= 'ref' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalFPML.g:1647:2: ( () otherlv_1= 'ref' ( (otherlv_2= RULE_ID ) ) )
            // InternalFPML.g:1648:3: () otherlv_1= 'ref' ( (otherlv_2= RULE_ID ) )
            {
            // InternalFPML.g:1648:3: ()
            // InternalFPML.g:1649:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDataTypeAccess().getDataTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getDataTypeAccess().getRefKeyword_1());
            		
            // InternalFPML.g:1659:3: ( (otherlv_2= RULE_ID ) )
            // InternalFPML.g:1660:4: (otherlv_2= RULE_ID )
            {
            // InternalFPML.g:1660:4: (otherlv_2= RULE_ID )
            // InternalFPML.g:1661:5: otherlv_2= RULE_ID
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


    // $ANTLR start "entryRuleValue"
    // InternalFPML.g:1676:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalFPML.g:1676:46: (iv_ruleValue= ruleValue EOF )
            // InternalFPML.g:1677:2: iv_ruleValue= ruleValue EOF
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
    // InternalFPML.g:1683:1: ruleValue returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_UnitValue_2= ruleUnitValue ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_IntValue_0 = null;

        EObject this_StringValue_1 = null;

        EObject this_UnitValue_2 = null;



        	enterRule();

        try {
            // InternalFPML.g:1689:2: ( (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_UnitValue_2= ruleUnitValue ) )
            // InternalFPML.g:1690:2: (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_UnitValue_2= ruleUnitValue )
            {
            // InternalFPML.g:1690:2: (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_UnitValue_2= ruleUnitValue )
            int alt19=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt19=1;
                }
                break;
            case RULE_STRING:
                {
                alt19=2;
                }
                break;
            case 32:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalFPML.g:1691:3: this_IntValue_0= ruleIntValue
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getIntValueParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntValue_0=ruleIntValue();

                    state._fsp--;


                    			current = this_IntValue_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFPML.g:1700:3: this_StringValue_1= ruleStringValue
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getStringValueParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringValue_1=ruleStringValue();

                    state._fsp--;


                    			current = this_StringValue_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalFPML.g:1709:3: this_UnitValue_2= ruleUnitValue
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getUnitValueParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_UnitValue_2=ruleUnitValue();

                    state._fsp--;


                    			current = this_UnitValue_2;
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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleIntValue"
    // InternalFPML.g:1721:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // InternalFPML.g:1721:49: (iv_ruleIntValue= ruleIntValue EOF )
            // InternalFPML.g:1722:2: iv_ruleIntValue= ruleIntValue EOF
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
    // InternalFPML.g:1728:1: ruleIntValue returns [EObject current=null] : this_INT_0= RULE_INT ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalFPML.g:1734:2: (this_INT_0= RULE_INT )
            // InternalFPML.g:1735:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            		newLeafNode(this_INT_0, grammarAccess.getIntValueAccess().getINTTerminalRuleCall());
            	

            }


            	leaveRule();

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
    // InternalFPML.g:1742:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalFPML.g:1742:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalFPML.g:1743:2: iv_ruleStringValue= ruleStringValue EOF
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
    // InternalFPML.g:1749:1: ruleStringValue returns [EObject current=null] : this_STRING_0= RULE_STRING ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalFPML.g:1755:2: (this_STRING_0= RULE_STRING )
            // InternalFPML.g:1756:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		newLeafNode(this_STRING_0, grammarAccess.getStringValueAccess().getSTRINGTerminalRuleCall());
            	

            }


            	leaveRule();

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
    // InternalFPML.g:1763:1: entryRuleUnitValue returns [EObject current=null] : iv_ruleUnitValue= ruleUnitValue EOF ;
    public final EObject entryRuleUnitValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnitValue = null;


        try {
            // InternalFPML.g:1763:50: (iv_ruleUnitValue= ruleUnitValue EOF )
            // InternalFPML.g:1764:2: iv_ruleUnitValue= ruleUnitValue EOF
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
    // InternalFPML.g:1770:1: ruleUnitValue returns [EObject current=null] : otherlv_0= '()' ;
    public final EObject ruleUnitValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalFPML.g:1776:2: (otherlv_0= '()' )
            // InternalFPML.g:1777:2: otherlv_0= '()'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_2); 

            		newLeafNode(otherlv_0, grammarAccess.getUnitValueAccess().getLeftParenthesisRightParenthesisKeyword());
            	

            }


            	leaveRule();

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

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\1\5\2\uffff\1\5\2\23\1\4\3\23\2\uffff\1\23";
    static final String dfa_3s = "\1\40\2\uffff\1\40\2\25\1\4\3\25\2\uffff\1\25";
    static final String dfa_4s = "\1\uffff\1\1\1\2\7\uffff\1\3\1\4\1\uffff";
    static final String dfa_5s = "\15\uffff}>";
    static final String[] dfa_6s = {
            "\2\2\13\uffff\1\3\11\uffff\2\1\1\uffff\1\1\1\2",
            "",
            "",
            "\1\7\1\10\25\uffff\1\4\1\5\1\uffff\1\6\1\11",
            "\1\12\1\uffff\1\13",
            "\1\12\1\uffff\1\13",
            "\1\14",
            "\1\12\1\uffff\1\13",
            "\1\12\1\uffff\1\13",
            "\1\12\1\uffff\1\13",
            "",
            "",
            "\1\12\1\uffff\1\13"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "433:2: (this_Argument_0= ruleArgument | this_Value_1= ruleValue | this_SumType_2= ruleSumType | this_ProdType_3= ruleProdType )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000402000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000001B0040060L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000001B0000060L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000B0000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000000F0000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000008000002L});

}