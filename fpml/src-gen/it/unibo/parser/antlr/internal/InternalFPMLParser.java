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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Pure'", "'{'", "'}'", "'Functions'", "'Data'", "'Value'", "'Effects'", "':'", "'['", "']'", "'+'", "'*'", "'def'", "'('", "')'", "'IO'", "'main'", "'Undefined'", "'|>'", "'>>='", "'->'", "'int'", "'String'", "'Unit'", "'ref'", "'F'", "'<'", "','", "'>'", "'FIO'", "'()'", "'Left'", "'Right'", "'IntToString'", "'IntPow'", "'-'", "'mod'", "'apply'", "'print'"
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
    // InternalFPML.g:366:1: ruleEffectFullBlock returns [EObject current=null] : (otherlv_0= 'Effects' otherlv_1= '{' ( (lv_features_2_0= ruleEffectFullFunctionDefinition ) )* ( (lv_main_3_0= ruleMainFunc ) ) otherlv_4= '}' ) ;
    public final EObject ruleEffectFullBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_features_2_0 = null;

        EObject lv_main_3_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:372:2: ( (otherlv_0= 'Effects' otherlv_1= '{' ( (lv_features_2_0= ruleEffectFullFunctionDefinition ) )* ( (lv_main_3_0= ruleMainFunc ) ) otherlv_4= '}' ) )
            // InternalFPML.g:373:2: (otherlv_0= 'Effects' otherlv_1= '{' ( (lv_features_2_0= ruleEffectFullFunctionDefinition ) )* ( (lv_main_3_0= ruleMainFunc ) ) otherlv_4= '}' )
            {
            // InternalFPML.g:373:2: (otherlv_0= 'Effects' otherlv_1= '{' ( (lv_features_2_0= ruleEffectFullFunctionDefinition ) )* ( (lv_main_3_0= ruleMainFunc ) ) otherlv_4= '}' )
            // InternalFPML.g:374:3: otherlv_0= 'Effects' otherlv_1= '{' ( (lv_features_2_0= ruleEffectFullFunctionDefinition ) )* ( (lv_main_3_0= ruleMainFunc ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEffectFullBlockAccess().getEffectsKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getEffectFullBlockAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalFPML.g:382:3: ( (lv_features_2_0= ruleEffectFullFunctionDefinition ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==23) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalFPML.g:383:4: (lv_features_2_0= ruleEffectFullFunctionDefinition )
            	    {
            	    // InternalFPML.g:383:4: (lv_features_2_0= ruleEffectFullFunctionDefinition )
            	    // InternalFPML.g:384:5: lv_features_2_0= ruleEffectFullFunctionDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getEffectFullBlockAccess().getFeaturesEffectFullFunctionDefinitionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_features_2_0=ruleEffectFullFunctionDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEffectFullBlockRule());
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

            if ( ((LA6_0>=32 && LA6_0<=33)||(LA6_0>=35 && LA6_0<=36)) ) {
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


    // $ANTLR start "entryRulePureFunctionDefinition"
    // InternalFPML.g:726:1: entryRulePureFunctionDefinition returns [EObject current=null] : iv_rulePureFunctionDefinition= rulePureFunctionDefinition EOF ;
    public final EObject entryRulePureFunctionDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePureFunctionDefinition = null;


        try {
            // InternalFPML.g:726:63: (iv_rulePureFunctionDefinition= rulePureFunctionDefinition EOF )
            // InternalFPML.g:727:2: iv_rulePureFunctionDefinition= rulePureFunctionDefinition EOF
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
    // InternalFPML.g:733:1: rulePureFunctionDefinition returns [EObject current=null] : (otherlv_0= 'def' ( (lv_returnType_1_0= ruleValueType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_arg_4_0= ruleArgument ) ) otherlv_5= ')' otherlv_6= ':' otherlv_7= '{' ( (lv_functionBody_8_0= ruleFunctionBodyPure ) ) otherlv_9= '}' ) ;
    public final EObject rulePureFunctionDefinition() throws RecognitionException {
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

            			newLeafNode(otherlv_0, grammarAccess.getPureFunctionDefinitionAccess().getDefKeyword_0());
            		
            // InternalFPML.g:745:3: ( (lv_returnType_1_0= ruleValueType ) )
            // InternalFPML.g:746:4: (lv_returnType_1_0= ruleValueType )
            {
            // InternalFPML.g:746:4: (lv_returnType_1_0= ruleValueType )
            // InternalFPML.g:747:5: lv_returnType_1_0= ruleValueType
            {

            					newCompositeNode(grammarAccess.getPureFunctionDefinitionAccess().getReturnTypeValueTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_18);
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

            // InternalFPML.g:764:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalFPML.g:765:4: (lv_name_2_0= RULE_ID )
            {
            // InternalFPML.g:765:4: (lv_name_2_0= RULE_ID )
            // InternalFPML.g:766:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_19); 

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

            otherlv_3=(Token)match(input,24,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getPureFunctionDefinitionAccess().getLeftParenthesisKeyword_3());
            		
            // InternalFPML.g:786:3: ( (lv_arg_4_0= ruleArgument ) )
            // InternalFPML.g:787:4: (lv_arg_4_0= ruleArgument )
            {
            // InternalFPML.g:787:4: (lv_arg_4_0= ruleArgument )
            // InternalFPML.g:788:5: lv_arg_4_0= ruleArgument
            {

            					newCompositeNode(grammarAccess.getPureFunctionDefinitionAccess().getArgArgumentParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_20);
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

            otherlv_5=(Token)match(input,25,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getPureFunctionDefinitionAccess().getRightParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getPureFunctionDefinitionAccess().getColonKeyword_6());
            		
            otherlv_7=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_7, grammarAccess.getPureFunctionDefinitionAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalFPML.g:817:3: ( (lv_functionBody_8_0= ruleFunctionBodyPure ) )
            // InternalFPML.g:818:4: (lv_functionBody_8_0= ruleFunctionBodyPure )
            {
            // InternalFPML.g:818:4: (lv_functionBody_8_0= ruleFunctionBodyPure )
            // InternalFPML.g:819:5: lv_functionBody_8_0= ruleFunctionBodyPure
            {

            					newCompositeNode(grammarAccess.getPureFunctionDefinitionAccess().getFunctionBodyFunctionBodyPureParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_7);
            lv_functionBody_8_0=ruleFunctionBodyPure();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPureFunctionDefinitionRule());
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

            			newLeafNode(otherlv_9, grammarAccess.getPureFunctionDefinitionAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

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
    // InternalFPML.g:844:1: entryRuleEffectFullFunctionDefinition returns [EObject current=null] : iv_ruleEffectFullFunctionDefinition= ruleEffectFullFunctionDefinition EOF ;
    public final EObject entryRuleEffectFullFunctionDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullFunctionDefinition = null;


        try {
            // InternalFPML.g:844:69: (iv_ruleEffectFullFunctionDefinition= ruleEffectFullFunctionDefinition EOF )
            // InternalFPML.g:845:2: iv_ruleEffectFullFunctionDefinition= ruleEffectFullFunctionDefinition EOF
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
    // InternalFPML.g:851:1: ruleEffectFullFunctionDefinition returns [EObject current=null] : (otherlv_0= 'def' ( (lv_returnType_1_0= ruleIOType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_arg_4_0= ruleEffectFullArgument ) ) otherlv_5= ')' otherlv_6= ':' otherlv_7= '{' ( (lv_functionBody_8_0= ruleFunctionBodyEffectFull ) ) otherlv_9= '}' ) ;
    public final EObject ruleEffectFullFunctionDefinition() throws RecognitionException {
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

            			newLeafNode(otherlv_0, grammarAccess.getEffectFullFunctionDefinitionAccess().getDefKeyword_0());
            		
            // InternalFPML.g:863:3: ( (lv_returnType_1_0= ruleIOType ) )
            // InternalFPML.g:864:4: (lv_returnType_1_0= ruleIOType )
            {
            // InternalFPML.g:864:4: (lv_returnType_1_0= ruleIOType )
            // InternalFPML.g:865:5: lv_returnType_1_0= ruleIOType
            {

            					newCompositeNode(grammarAccess.getEffectFullFunctionDefinitionAccess().getReturnTypeIOTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_18);
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

            // InternalFPML.g:882:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalFPML.g:883:4: (lv_name_2_0= RULE_ID )
            {
            // InternalFPML.g:883:4: (lv_name_2_0= RULE_ID )
            // InternalFPML.g:884:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_19); 

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

            otherlv_3=(Token)match(input,24,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getEffectFullFunctionDefinitionAccess().getLeftParenthesisKeyword_3());
            		
            // InternalFPML.g:904:3: ( (lv_arg_4_0= ruleEffectFullArgument ) )
            // InternalFPML.g:905:4: (lv_arg_4_0= ruleEffectFullArgument )
            {
            // InternalFPML.g:905:4: (lv_arg_4_0= ruleEffectFullArgument )
            // InternalFPML.g:906:5: lv_arg_4_0= ruleEffectFullArgument
            {

            					newCompositeNode(grammarAccess.getEffectFullFunctionDefinitionAccess().getArgEffectFullArgumentParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_20);
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

            otherlv_5=(Token)match(input,25,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getEffectFullFunctionDefinitionAccess().getRightParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getEffectFullFunctionDefinitionAccess().getColonKeyword_6());
            		
            otherlv_7=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_7, grammarAccess.getEffectFullFunctionDefinitionAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalFPML.g:935:3: ( (lv_functionBody_8_0= ruleFunctionBodyEffectFull ) )
            // InternalFPML.g:936:4: (lv_functionBody_8_0= ruleFunctionBodyEffectFull )
            {
            // InternalFPML.g:936:4: (lv_functionBody_8_0= ruleFunctionBodyEffectFull )
            // InternalFPML.g:937:5: lv_functionBody_8_0= ruleFunctionBodyEffectFull
            {

            					newCompositeNode(grammarAccess.getEffectFullFunctionDefinitionAccess().getFunctionBodyFunctionBodyEffectFullParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_7);
            lv_functionBody_8_0=ruleFunctionBodyEffectFull();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEffectFullFunctionDefinitionRule());
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

            			newLeafNode(otherlv_9, grammarAccess.getEffectFullFunctionDefinitionAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

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
            otherlv_0=(Token)match(input,26,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getMainFuncAccess().getIOKeyword_0());
            		
            // InternalFPML.g:981:3: ( (lv_returnType_1_0= ruleUnitType ) )
            // InternalFPML.g:982:4: (lv_returnType_1_0= ruleUnitType )
            {
            // InternalFPML.g:982:4: (lv_returnType_1_0= ruleUnitType )
            // InternalFPML.g:983:5: lv_returnType_1_0= ruleUnitType
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

            otherlv_2=(Token)match(input,27,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getMainFuncAccess().getMainKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getMainFuncAccess().getColonKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_24); 

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


    // $ANTLR start "entryRuleEffectFullArgument"
    // InternalFPML.g:1039:1: entryRuleEffectFullArgument returns [EObject current=null] : iv_ruleEffectFullArgument= ruleEffectFullArgument EOF ;
    public final EObject entryRuleEffectFullArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullArgument = null;


        try {
            // InternalFPML.g:1039:59: (iv_ruleEffectFullArgument= ruleEffectFullArgument EOF )
            // InternalFPML.g:1040:2: iv_ruleEffectFullArgument= ruleEffectFullArgument EOF
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
    // InternalFPML.g:1046:1: ruleEffectFullArgument returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEffectFullArgument() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:1052:2: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalFPML.g:1053:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalFPML.g:1053:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalFPML.g:1054:3: ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalFPML.g:1054:3: ( (lv_type_0_0= ruleType ) )
            // InternalFPML.g:1055:4: (lv_type_0_0= ruleType )
            {
            // InternalFPML.g:1055:4: (lv_type_0_0= ruleType )
            // InternalFPML.g:1056:5: lv_type_0_0= ruleType
            {

            					newCompositeNode(grammarAccess.getEffectFullArgumentAccess().getTypeTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_18);
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

            // InternalFPML.g:1073:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFPML.g:1074:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFPML.g:1074:4: (lv_name_1_0= RULE_ID )
            // InternalFPML.g:1075:5: lv_name_1_0= RULE_ID
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
    // InternalFPML.g:1095:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // InternalFPML.g:1095:49: (iv_ruleArgument= ruleArgument EOF )
            // InternalFPML.g:1096:2: iv_ruleArgument= ruleArgument EOF
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
    // InternalFPML.g:1102:1: ruleArgument returns [EObject current=null] : ( ( (lv_type_0_0= ruleValueType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:1108:2: ( ( ( (lv_type_0_0= ruleValueType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalFPML.g:1109:2: ( ( (lv_type_0_0= ruleValueType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalFPML.g:1109:2: ( ( (lv_type_0_0= ruleValueType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalFPML.g:1110:3: ( (lv_type_0_0= ruleValueType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalFPML.g:1110:3: ( (lv_type_0_0= ruleValueType ) )
            // InternalFPML.g:1111:4: (lv_type_0_0= ruleValueType )
            {
            // InternalFPML.g:1111:4: (lv_type_0_0= ruleValueType )
            // InternalFPML.g:1112:5: lv_type_0_0= ruleValueType
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

            // InternalFPML.g:1129:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFPML.g:1130:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFPML.g:1130:4: (lv_name_1_0= RULE_ID )
            // InternalFPML.g:1131:5: lv_name_1_0= RULE_ID
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
    // InternalFPML.g:1151:1: entryRuleFunctionBodyPure returns [EObject current=null] : iv_ruleFunctionBodyPure= ruleFunctionBodyPure EOF ;
    public final EObject entryRuleFunctionBodyPure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionBodyPure = null;


        try {
            // InternalFPML.g:1151:57: (iv_ruleFunctionBodyPure= ruleFunctionBodyPure EOF )
            // InternalFPML.g:1152:2: iv_ruleFunctionBodyPure= ruleFunctionBodyPure EOF
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
    // InternalFPML.g:1158:1: ruleFunctionBodyPure returns [EObject current=null] : (this_EmptyFunctionBody_0= ruleEmptyFunctionBody | this_CompositionFunctionBodyPure_1= ruleCompositionFunctionBodyPure ) ;
    public final EObject ruleFunctionBodyPure() throws RecognitionException {
        EObject current = null;

        EObject this_EmptyFunctionBody_0 = null;

        EObject this_CompositionFunctionBodyPure_1 = null;



        	enterRule();

        try {
            // InternalFPML.g:1164:2: ( (this_EmptyFunctionBody_0= ruleEmptyFunctionBody | this_CompositionFunctionBodyPure_1= ruleCompositionFunctionBodyPure ) )
            // InternalFPML.g:1165:2: (this_EmptyFunctionBody_0= ruleEmptyFunctionBody | this_CompositionFunctionBodyPure_1= ruleCompositionFunctionBodyPure )
            {
            // InternalFPML.g:1165:2: (this_EmptyFunctionBody_0= ruleEmptyFunctionBody | this_CompositionFunctionBodyPure_1= ruleCompositionFunctionBodyPure )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==28) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID||(LA7_0>=21 && LA7_0<=22)||(LA7_0>=44 && LA7_0<=48)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalFPML.g:1166:3: this_EmptyFunctionBody_0= ruleEmptyFunctionBody
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
                    // InternalFPML.g:1175:3: this_CompositionFunctionBodyPure_1= ruleCompositionFunctionBodyPure
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
    // InternalFPML.g:1187:1: entryRuleFunctionBodyEffectFull returns [EObject current=null] : iv_ruleFunctionBodyEffectFull= ruleFunctionBodyEffectFull EOF ;
    public final EObject entryRuleFunctionBodyEffectFull() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionBodyEffectFull = null;


        try {
            // InternalFPML.g:1187:63: (iv_ruleFunctionBodyEffectFull= ruleFunctionBodyEffectFull EOF )
            // InternalFPML.g:1188:2: iv_ruleFunctionBodyEffectFull= ruleFunctionBodyEffectFull EOF
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
    // InternalFPML.g:1194:1: ruleFunctionBodyEffectFull returns [EObject current=null] : (this_EmptyFunctionBody_0= ruleEmptyFunctionBody | this_CompositionFunctionBodyEffect_1= ruleCompositionFunctionBodyEffect ) ;
    public final EObject ruleFunctionBodyEffectFull() throws RecognitionException {
        EObject current = null;

        EObject this_EmptyFunctionBody_0 = null;

        EObject this_CompositionFunctionBodyEffect_1 = null;



        	enterRule();

        try {
            // InternalFPML.g:1200:2: ( (this_EmptyFunctionBody_0= ruleEmptyFunctionBody | this_CompositionFunctionBodyEffect_1= ruleCompositionFunctionBodyEffect ) )
            // InternalFPML.g:1201:2: (this_EmptyFunctionBody_0= ruleEmptyFunctionBody | this_CompositionFunctionBodyEffect_1= ruleCompositionFunctionBodyEffect )
            {
            // InternalFPML.g:1201:2: (this_EmptyFunctionBody_0= ruleEmptyFunctionBody | this_CompositionFunctionBodyEffect_1= ruleCompositionFunctionBodyEffect )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==28) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID||LA8_0==49) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalFPML.g:1202:3: this_EmptyFunctionBody_0= ruleEmptyFunctionBody
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
                    // InternalFPML.g:1211:3: this_CompositionFunctionBodyEffect_1= ruleCompositionFunctionBodyEffect
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
    // InternalFPML.g:1223:1: entryRuleEmptyFunctionBody returns [EObject current=null] : iv_ruleEmptyFunctionBody= ruleEmptyFunctionBody EOF ;
    public final EObject entryRuleEmptyFunctionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmptyFunctionBody = null;


        try {
            // InternalFPML.g:1223:58: (iv_ruleEmptyFunctionBody= ruleEmptyFunctionBody EOF )
            // InternalFPML.g:1224:2: iv_ruleEmptyFunctionBody= ruleEmptyFunctionBody EOF
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
    // InternalFPML.g:1230:1: ruleEmptyFunctionBody returns [EObject current=null] : ( () otherlv_1= 'Undefined' ) ;
    public final EObject ruleEmptyFunctionBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFPML.g:1236:2: ( ( () otherlv_1= 'Undefined' ) )
            // InternalFPML.g:1237:2: ( () otherlv_1= 'Undefined' )
            {
            // InternalFPML.g:1237:2: ( () otherlv_1= 'Undefined' )
            // InternalFPML.g:1238:3: () otherlv_1= 'Undefined'
            {
            // InternalFPML.g:1238:3: ()
            // InternalFPML.g:1239:4: 
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
    // InternalFPML.g:1253:1: entryRuleCompositionFunctionBodyPure returns [EObject current=null] : iv_ruleCompositionFunctionBodyPure= ruleCompositionFunctionBodyPure EOF ;
    public final EObject entryRuleCompositionFunctionBodyPure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositionFunctionBodyPure = null;


        try {
            // InternalFPML.g:1253:68: (iv_ruleCompositionFunctionBodyPure= ruleCompositionFunctionBodyPure EOF )
            // InternalFPML.g:1254:2: iv_ruleCompositionFunctionBodyPure= ruleCompositionFunctionBodyPure EOF
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
    // InternalFPML.g:1260:1: ruleCompositionFunctionBodyPure returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_functionChain_1_0= ruleCompositionFunctionBodyPureFactor ) )+ ( (lv_returnFunction_2_0= ruleReturnPureFunction ) )? ) | ( ( (lv_primitiveElement_3_0= rulePrimitivePureFunction ) ) ( (lv_functionChain_4_0= ruleCompositionFunctionBodyPureFactor ) )+ ( (lv_returnFunction_5_0= ruleReturnPureFunction ) )? ) ) ;
    public final EObject ruleCompositionFunctionBodyPure() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_functionChain_1_0 = null;

        EObject lv_returnFunction_2_0 = null;

        EObject lv_primitiveElement_3_0 = null;

        EObject lv_functionChain_4_0 = null;

        EObject lv_returnFunction_5_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:1266:2: ( ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_functionChain_1_0= ruleCompositionFunctionBodyPureFactor ) )+ ( (lv_returnFunction_2_0= ruleReturnPureFunction ) )? ) | ( ( (lv_primitiveElement_3_0= rulePrimitivePureFunction ) ) ( (lv_functionChain_4_0= ruleCompositionFunctionBodyPureFactor ) )+ ( (lv_returnFunction_5_0= ruleReturnPureFunction ) )? ) ) )
            // InternalFPML.g:1267:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_functionChain_1_0= ruleCompositionFunctionBodyPureFactor ) )+ ( (lv_returnFunction_2_0= ruleReturnPureFunction ) )? ) | ( ( (lv_primitiveElement_3_0= rulePrimitivePureFunction ) ) ( (lv_functionChain_4_0= ruleCompositionFunctionBodyPureFactor ) )+ ( (lv_returnFunction_5_0= ruleReturnPureFunction ) )? ) )
            {
            // InternalFPML.g:1267:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_functionChain_1_0= ruleCompositionFunctionBodyPureFactor ) )+ ( (lv_returnFunction_2_0= ruleReturnPureFunction ) )? ) | ( ( (lv_primitiveElement_3_0= rulePrimitivePureFunction ) ) ( (lv_functionChain_4_0= ruleCompositionFunctionBodyPureFactor ) )+ ( (lv_returnFunction_5_0= ruleReturnPureFunction ) )? ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
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
                    // InternalFPML.g:1268:3: ( ( (otherlv_0= RULE_ID ) ) ( (lv_functionChain_1_0= ruleCompositionFunctionBodyPureFactor ) )+ ( (lv_returnFunction_2_0= ruleReturnPureFunction ) )? )
                    {
                    // InternalFPML.g:1268:3: ( ( (otherlv_0= RULE_ID ) ) ( (lv_functionChain_1_0= ruleCompositionFunctionBodyPureFactor ) )+ ( (lv_returnFunction_2_0= ruleReturnPureFunction ) )? )
                    // InternalFPML.g:1269:4: ( (otherlv_0= RULE_ID ) ) ( (lv_functionChain_1_0= ruleCompositionFunctionBodyPureFactor ) )+ ( (lv_returnFunction_2_0= ruleReturnPureFunction ) )?
                    {
                    // InternalFPML.g:1269:4: ( (otherlv_0= RULE_ID ) )
                    // InternalFPML.g:1270:5: (otherlv_0= RULE_ID )
                    {
                    // InternalFPML.g:1270:5: (otherlv_0= RULE_ID )
                    // InternalFPML.g:1271:6: otherlv_0= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCompositionFunctionBodyPureRule());
                    						}
                    					
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_27); 

                    						newLeafNode(otherlv_0, grammarAccess.getCompositionFunctionBodyPureAccess().getReferenceElementPureFunctionDefinitionCrossReference_0_0_0());
                    					

                    }


                    }

                    // InternalFPML.g:1282:4: ( (lv_functionChain_1_0= ruleCompositionFunctionBodyPureFactor ) )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==29) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalFPML.g:1283:5: (lv_functionChain_1_0= ruleCompositionFunctionBodyPureFactor )
                    	    {
                    	    // InternalFPML.g:1283:5: (lv_functionChain_1_0= ruleCompositionFunctionBodyPureFactor )
                    	    // InternalFPML.g:1284:6: lv_functionChain_1_0= ruleCompositionFunctionBodyPureFactor
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
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);

                    // InternalFPML.g:1301:4: ( (lv_returnFunction_2_0= ruleReturnPureFunction ) )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==31) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalFPML.g:1302:5: (lv_returnFunction_2_0= ruleReturnPureFunction )
                            {
                            // InternalFPML.g:1302:5: (lv_returnFunction_2_0= ruleReturnPureFunction )
                            // InternalFPML.g:1303:6: lv_returnFunction_2_0= ruleReturnPureFunction
                            {

                            						newCompositeNode(grammarAccess.getCompositionFunctionBodyPureAccess().getReturnFunctionReturnPureFunctionParserRuleCall_0_2_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_returnFunction_2_0=ruleReturnPureFunction();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getCompositionFunctionBodyPureRule());
                            						}
                            						set(
                            							current,
                            							"returnFunction",
                            							lv_returnFunction_2_0,
                            							"it.unibo.FPML.ReturnPureFunction");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFPML.g:1322:3: ( ( (lv_primitiveElement_3_0= rulePrimitivePureFunction ) ) ( (lv_functionChain_4_0= ruleCompositionFunctionBodyPureFactor ) )+ ( (lv_returnFunction_5_0= ruleReturnPureFunction ) )? )
                    {
                    // InternalFPML.g:1322:3: ( ( (lv_primitiveElement_3_0= rulePrimitivePureFunction ) ) ( (lv_functionChain_4_0= ruleCompositionFunctionBodyPureFactor ) )+ ( (lv_returnFunction_5_0= ruleReturnPureFunction ) )? )
                    // InternalFPML.g:1323:4: ( (lv_primitiveElement_3_0= rulePrimitivePureFunction ) ) ( (lv_functionChain_4_0= ruleCompositionFunctionBodyPureFactor ) )+ ( (lv_returnFunction_5_0= ruleReturnPureFunction ) )?
                    {
                    // InternalFPML.g:1323:4: ( (lv_primitiveElement_3_0= rulePrimitivePureFunction ) )
                    // InternalFPML.g:1324:5: (lv_primitiveElement_3_0= rulePrimitivePureFunction )
                    {
                    // InternalFPML.g:1324:5: (lv_primitiveElement_3_0= rulePrimitivePureFunction )
                    // InternalFPML.g:1325:6: lv_primitiveElement_3_0= rulePrimitivePureFunction
                    {

                    						newCompositeNode(grammarAccess.getCompositionFunctionBodyPureAccess().getPrimitiveElementPrimitivePureFunctionParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_primitiveElement_3_0=rulePrimitivePureFunction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompositionFunctionBodyPureRule());
                    						}
                    						set(
                    							current,
                    							"primitiveElement",
                    							lv_primitiveElement_3_0,
                    							"it.unibo.FPML.PrimitivePureFunction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFPML.g:1342:4: ( (lv_functionChain_4_0= ruleCompositionFunctionBodyPureFactor ) )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==29) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalFPML.g:1343:5: (lv_functionChain_4_0= ruleCompositionFunctionBodyPureFactor )
                    	    {
                    	    // InternalFPML.g:1343:5: (lv_functionChain_4_0= ruleCompositionFunctionBodyPureFactor )
                    	    // InternalFPML.g:1344:6: lv_functionChain_4_0= ruleCompositionFunctionBodyPureFactor
                    	    {

                    	    						newCompositeNode(grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainCompositionFunctionBodyPureFactorParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_28);
                    	    lv_functionChain_4_0=ruleCompositionFunctionBodyPureFactor();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getCompositionFunctionBodyPureRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"functionChain",
                    	    							lv_functionChain_4_0,
                    	    							"it.unibo.FPML.CompositionFunctionBodyPureFactor");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt11 >= 1 ) break loop11;
                                EarlyExitException eee =
                                    new EarlyExitException(11, input);
                                throw eee;
                        }
                        cnt11++;
                    } while (true);

                    // InternalFPML.g:1361:4: ( (lv_returnFunction_5_0= ruleReturnPureFunction ) )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==31) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalFPML.g:1362:5: (lv_returnFunction_5_0= ruleReturnPureFunction )
                            {
                            // InternalFPML.g:1362:5: (lv_returnFunction_5_0= ruleReturnPureFunction )
                            // InternalFPML.g:1363:6: lv_returnFunction_5_0= ruleReturnPureFunction
                            {

                            						newCompositeNode(grammarAccess.getCompositionFunctionBodyPureAccess().getReturnFunctionReturnPureFunctionParserRuleCall_1_2_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_returnFunction_5_0=ruleReturnPureFunction();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getCompositionFunctionBodyPureRule());
                            						}
                            						set(
                            							current,
                            							"returnFunction",
                            							lv_returnFunction_5_0,
                            							"it.unibo.FPML.ReturnPureFunction");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

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
    // $ANTLR end "ruleCompositionFunctionBodyPure"


    // $ANTLR start "entryRuleCompositionFunctionBodyPureFactor"
    // InternalFPML.g:1385:1: entryRuleCompositionFunctionBodyPureFactor returns [EObject current=null] : iv_ruleCompositionFunctionBodyPureFactor= ruleCompositionFunctionBodyPureFactor EOF ;
    public final EObject entryRuleCompositionFunctionBodyPureFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositionFunctionBodyPureFactor = null;


        try {
            // InternalFPML.g:1385:74: (iv_ruleCompositionFunctionBodyPureFactor= ruleCompositionFunctionBodyPureFactor EOF )
            // InternalFPML.g:1386:2: iv_ruleCompositionFunctionBodyPureFactor= ruleCompositionFunctionBodyPureFactor EOF
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
    // InternalFPML.g:1392:1: ruleCompositionFunctionBodyPureFactor returns [EObject current=null] : ( (otherlv_0= '|>' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= '|>' ( (lv_PrimitiveElement_3_0= rulePrimitivePureFunction ) ) ) ) ;
    public final EObject ruleCompositionFunctionBodyPureFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_PrimitiveElement_3_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:1398:2: ( ( (otherlv_0= '|>' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= '|>' ( (lv_PrimitiveElement_3_0= rulePrimitivePureFunction ) ) ) ) )
            // InternalFPML.g:1399:2: ( (otherlv_0= '|>' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= '|>' ( (lv_PrimitiveElement_3_0= rulePrimitivePureFunction ) ) ) )
            {
            // InternalFPML.g:1399:2: ( (otherlv_0= '|>' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= '|>' ( (lv_PrimitiveElement_3_0= rulePrimitivePureFunction ) ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==29) ) {
                int LA14_1 = input.LA(2);

                if ( ((LA14_1>=21 && LA14_1<=22)||(LA14_1>=44 && LA14_1<=48)) ) {
                    alt14=2;
                }
                else if ( (LA14_1==RULE_ID) ) {
                    alt14=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalFPML.g:1400:3: (otherlv_0= '|>' ( (otherlv_1= RULE_ID ) ) )
                    {
                    // InternalFPML.g:1400:3: (otherlv_0= '|>' ( (otherlv_1= RULE_ID ) ) )
                    // InternalFPML.g:1401:4: otherlv_0= '|>' ( (otherlv_1= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,29,FOLLOW_18); 

                    				newLeafNode(otherlv_0, grammarAccess.getCompositionFunctionBodyPureFactorAccess().getVerticalLineGreaterThanSignKeyword_0_0());
                    			
                    // InternalFPML.g:1405:4: ( (otherlv_1= RULE_ID ) )
                    // InternalFPML.g:1406:5: (otherlv_1= RULE_ID )
                    {
                    // InternalFPML.g:1406:5: (otherlv_1= RULE_ID )
                    // InternalFPML.g:1407:6: otherlv_1= RULE_ID
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
                    // InternalFPML.g:1420:3: (otherlv_2= '|>' ( (lv_PrimitiveElement_3_0= rulePrimitivePureFunction ) ) )
                    {
                    // InternalFPML.g:1420:3: (otherlv_2= '|>' ( (lv_PrimitiveElement_3_0= rulePrimitivePureFunction ) ) )
                    // InternalFPML.g:1421:4: otherlv_2= '|>' ( (lv_PrimitiveElement_3_0= rulePrimitivePureFunction ) )
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_21); 

                    				newLeafNode(otherlv_2, grammarAccess.getCompositionFunctionBodyPureFactorAccess().getVerticalLineGreaterThanSignKeyword_1_0());
                    			
                    // InternalFPML.g:1425:4: ( (lv_PrimitiveElement_3_0= rulePrimitivePureFunction ) )
                    // InternalFPML.g:1426:5: (lv_PrimitiveElement_3_0= rulePrimitivePureFunction )
                    {
                    // InternalFPML.g:1426:5: (lv_PrimitiveElement_3_0= rulePrimitivePureFunction )
                    // InternalFPML.g:1427:6: lv_PrimitiveElement_3_0= rulePrimitivePureFunction
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
    // InternalFPML.g:1449:1: entryRuleCompositionFunctionBodyEffect returns [EObject current=null] : iv_ruleCompositionFunctionBodyEffect= ruleCompositionFunctionBodyEffect EOF ;
    public final EObject entryRuleCompositionFunctionBodyEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositionFunctionBodyEffect = null;


        try {
            // InternalFPML.g:1449:70: (iv_ruleCompositionFunctionBodyEffect= ruleCompositionFunctionBodyEffect EOF )
            // InternalFPML.g:1450:2: iv_ruleCompositionFunctionBodyEffect= ruleCompositionFunctionBodyEffect EOF
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
    // InternalFPML.g:1456:1: ruleCompositionFunctionBodyEffect returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_functionChain_1_0= ruleCompositionFunctionBodyEffectFullFactor ) )+ ( (lv_returnFunction_2_0= ruleReturnEffectFullFunction ) )? ) | ( ( (lv_primitiveElement_3_0= rulePrimitiveEffectFullFunction ) ) ( (lv_functionChain_4_0= ruleCompositionFunctionBodyEffectFullFactor ) )+ ( (lv_returnFunction_5_0= ruleReturnEffectFullFunction ) )? ) ) ;
    public final EObject ruleCompositionFunctionBodyEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_functionChain_1_0 = null;

        EObject lv_returnFunction_2_0 = null;

        EObject lv_primitiveElement_3_0 = null;

        EObject lv_functionChain_4_0 = null;

        EObject lv_returnFunction_5_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:1462:2: ( ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_functionChain_1_0= ruleCompositionFunctionBodyEffectFullFactor ) )+ ( (lv_returnFunction_2_0= ruleReturnEffectFullFunction ) )? ) | ( ( (lv_primitiveElement_3_0= rulePrimitiveEffectFullFunction ) ) ( (lv_functionChain_4_0= ruleCompositionFunctionBodyEffectFullFactor ) )+ ( (lv_returnFunction_5_0= ruleReturnEffectFullFunction ) )? ) ) )
            // InternalFPML.g:1463:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_functionChain_1_0= ruleCompositionFunctionBodyEffectFullFactor ) )+ ( (lv_returnFunction_2_0= ruleReturnEffectFullFunction ) )? ) | ( ( (lv_primitiveElement_3_0= rulePrimitiveEffectFullFunction ) ) ( (lv_functionChain_4_0= ruleCompositionFunctionBodyEffectFullFactor ) )+ ( (lv_returnFunction_5_0= ruleReturnEffectFullFunction ) )? ) )
            {
            // InternalFPML.g:1463:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_functionChain_1_0= ruleCompositionFunctionBodyEffectFullFactor ) )+ ( (lv_returnFunction_2_0= ruleReturnEffectFullFunction ) )? ) | ( ( (lv_primitiveElement_3_0= rulePrimitiveEffectFullFunction ) ) ( (lv_functionChain_4_0= ruleCompositionFunctionBodyEffectFullFactor ) )+ ( (lv_returnFunction_5_0= ruleReturnEffectFullFunction ) )? ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            else if ( (LA19_0==49) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalFPML.g:1464:3: ( ( (otherlv_0= RULE_ID ) ) ( (lv_functionChain_1_0= ruleCompositionFunctionBodyEffectFullFactor ) )+ ( (lv_returnFunction_2_0= ruleReturnEffectFullFunction ) )? )
                    {
                    // InternalFPML.g:1464:3: ( ( (otherlv_0= RULE_ID ) ) ( (lv_functionChain_1_0= ruleCompositionFunctionBodyEffectFullFactor ) )+ ( (lv_returnFunction_2_0= ruleReturnEffectFullFunction ) )? )
                    // InternalFPML.g:1465:4: ( (otherlv_0= RULE_ID ) ) ( (lv_functionChain_1_0= ruleCompositionFunctionBodyEffectFullFactor ) )+ ( (lv_returnFunction_2_0= ruleReturnEffectFullFunction ) )?
                    {
                    // InternalFPML.g:1465:4: ( (otherlv_0= RULE_ID ) )
                    // InternalFPML.g:1466:5: (otherlv_0= RULE_ID )
                    {
                    // InternalFPML.g:1466:5: (otherlv_0= RULE_ID )
                    // InternalFPML.g:1467:6: otherlv_0= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCompositionFunctionBodyEffectRule());
                    						}
                    					
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_29); 

                    						newLeafNode(otherlv_0, grammarAccess.getCompositionFunctionBodyEffectAccess().getReferenceElementChainElementCrossReference_0_0_0());
                    					

                    }


                    }

                    // InternalFPML.g:1478:4: ( (lv_functionChain_1_0= ruleCompositionFunctionBodyEffectFullFactor ) )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==30) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalFPML.g:1479:5: (lv_functionChain_1_0= ruleCompositionFunctionBodyEffectFullFactor )
                    	    {
                    	    // InternalFPML.g:1479:5: (lv_functionChain_1_0= ruleCompositionFunctionBodyEffectFullFactor )
                    	    // InternalFPML.g:1480:6: lv_functionChain_1_0= ruleCompositionFunctionBodyEffectFullFactor
                    	    {

                    	    						newCompositeNode(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainCompositionFunctionBodyEffectFullFactorParserRuleCall_0_1_0());
                    	    					
                    	    pushFollow(FOLLOW_30);
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
                    	    if ( cnt15 >= 1 ) break loop15;
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                throw eee;
                        }
                        cnt15++;
                    } while (true);

                    // InternalFPML.g:1497:4: ( (lv_returnFunction_2_0= ruleReturnEffectFullFunction ) )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==31) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalFPML.g:1498:5: (lv_returnFunction_2_0= ruleReturnEffectFullFunction )
                            {
                            // InternalFPML.g:1498:5: (lv_returnFunction_2_0= ruleReturnEffectFullFunction )
                            // InternalFPML.g:1499:6: lv_returnFunction_2_0= ruleReturnEffectFullFunction
                            {

                            						newCompositeNode(grammarAccess.getCompositionFunctionBodyEffectAccess().getReturnFunctionReturnEffectFullFunctionParserRuleCall_0_2_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_returnFunction_2_0=ruleReturnEffectFullFunction();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getCompositionFunctionBodyEffectRule());
                            						}
                            						set(
                            							current,
                            							"returnFunction",
                            							lv_returnFunction_2_0,
                            							"it.unibo.FPML.ReturnEffectFullFunction");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFPML.g:1518:3: ( ( (lv_primitiveElement_3_0= rulePrimitiveEffectFullFunction ) ) ( (lv_functionChain_4_0= ruleCompositionFunctionBodyEffectFullFactor ) )+ ( (lv_returnFunction_5_0= ruleReturnEffectFullFunction ) )? )
                    {
                    // InternalFPML.g:1518:3: ( ( (lv_primitiveElement_3_0= rulePrimitiveEffectFullFunction ) ) ( (lv_functionChain_4_0= ruleCompositionFunctionBodyEffectFullFactor ) )+ ( (lv_returnFunction_5_0= ruleReturnEffectFullFunction ) )? )
                    // InternalFPML.g:1519:4: ( (lv_primitiveElement_3_0= rulePrimitiveEffectFullFunction ) ) ( (lv_functionChain_4_0= ruleCompositionFunctionBodyEffectFullFactor ) )+ ( (lv_returnFunction_5_0= ruleReturnEffectFullFunction ) )?
                    {
                    // InternalFPML.g:1519:4: ( (lv_primitiveElement_3_0= rulePrimitiveEffectFullFunction ) )
                    // InternalFPML.g:1520:5: (lv_primitiveElement_3_0= rulePrimitiveEffectFullFunction )
                    {
                    // InternalFPML.g:1520:5: (lv_primitiveElement_3_0= rulePrimitiveEffectFullFunction )
                    // InternalFPML.g:1521:6: lv_primitiveElement_3_0= rulePrimitiveEffectFullFunction
                    {

                    						newCompositeNode(grammarAccess.getCompositionFunctionBodyEffectAccess().getPrimitiveElementPrimitiveEffectFullFunctionParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_primitiveElement_3_0=rulePrimitiveEffectFullFunction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompositionFunctionBodyEffectRule());
                    						}
                    						set(
                    							current,
                    							"primitiveElement",
                    							lv_primitiveElement_3_0,
                    							"it.unibo.FPML.PrimitiveEffectFullFunction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFPML.g:1538:4: ( (lv_functionChain_4_0= ruleCompositionFunctionBodyEffectFullFactor ) )+
                    int cnt17=0;
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==30) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalFPML.g:1539:5: (lv_functionChain_4_0= ruleCompositionFunctionBodyEffectFullFactor )
                    	    {
                    	    // InternalFPML.g:1539:5: (lv_functionChain_4_0= ruleCompositionFunctionBodyEffectFullFactor )
                    	    // InternalFPML.g:1540:6: lv_functionChain_4_0= ruleCompositionFunctionBodyEffectFullFactor
                    	    {

                    	    						newCompositeNode(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainCompositionFunctionBodyEffectFullFactorParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_30);
                    	    lv_functionChain_4_0=ruleCompositionFunctionBodyEffectFullFactor();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getCompositionFunctionBodyEffectRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"functionChain",
                    	    							lv_functionChain_4_0,
                    	    							"it.unibo.FPML.CompositionFunctionBodyEffectFullFactor");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt17 >= 1 ) break loop17;
                                EarlyExitException eee =
                                    new EarlyExitException(17, input);
                                throw eee;
                        }
                        cnt17++;
                    } while (true);

                    // InternalFPML.g:1557:4: ( (lv_returnFunction_5_0= ruleReturnEffectFullFunction ) )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==31) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalFPML.g:1558:5: (lv_returnFunction_5_0= ruleReturnEffectFullFunction )
                            {
                            // InternalFPML.g:1558:5: (lv_returnFunction_5_0= ruleReturnEffectFullFunction )
                            // InternalFPML.g:1559:6: lv_returnFunction_5_0= ruleReturnEffectFullFunction
                            {

                            						newCompositeNode(grammarAccess.getCompositionFunctionBodyEffectAccess().getReturnFunctionReturnEffectFullFunctionParserRuleCall_1_2_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_returnFunction_5_0=ruleReturnEffectFullFunction();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getCompositionFunctionBodyEffectRule());
                            						}
                            						set(
                            							current,
                            							"returnFunction",
                            							lv_returnFunction_5_0,
                            							"it.unibo.FPML.ReturnEffectFullFunction");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

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
    // $ANTLR end "ruleCompositionFunctionBodyEffect"


    // $ANTLR start "entryRuleCompositionFunctionBodyEffectFullFactor"
    // InternalFPML.g:1581:1: entryRuleCompositionFunctionBodyEffectFullFactor returns [EObject current=null] : iv_ruleCompositionFunctionBodyEffectFullFactor= ruleCompositionFunctionBodyEffectFullFactor EOF ;
    public final EObject entryRuleCompositionFunctionBodyEffectFullFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositionFunctionBodyEffectFullFactor = null;


        try {
            // InternalFPML.g:1581:80: (iv_ruleCompositionFunctionBodyEffectFullFactor= ruleCompositionFunctionBodyEffectFullFactor EOF )
            // InternalFPML.g:1582:2: iv_ruleCompositionFunctionBodyEffectFullFactor= ruleCompositionFunctionBodyEffectFullFactor EOF
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
    // InternalFPML.g:1588:1: ruleCompositionFunctionBodyEffectFullFactor returns [EObject current=null] : ( (otherlv_0= '>>=' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= '>>=' ( ( (lv_PrimitiveElement_3_1= rulePrimitiveEffectFullFunction | lv_PrimitiveElement_3_2= rulePrimitivePureFunction ) ) ) ) ) ;
    public final EObject ruleCompositionFunctionBodyEffectFullFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_PrimitiveElement_3_1 = null;

        EObject lv_PrimitiveElement_3_2 = null;



        	enterRule();

        try {
            // InternalFPML.g:1594:2: ( ( (otherlv_0= '>>=' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= '>>=' ( ( (lv_PrimitiveElement_3_1= rulePrimitiveEffectFullFunction | lv_PrimitiveElement_3_2= rulePrimitivePureFunction ) ) ) ) ) )
            // InternalFPML.g:1595:2: ( (otherlv_0= '>>=' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= '>>=' ( ( (lv_PrimitiveElement_3_1= rulePrimitiveEffectFullFunction | lv_PrimitiveElement_3_2= rulePrimitivePureFunction ) ) ) ) )
            {
            // InternalFPML.g:1595:2: ( (otherlv_0= '>>=' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= '>>=' ( ( (lv_PrimitiveElement_3_1= rulePrimitiveEffectFullFunction | lv_PrimitiveElement_3_2= rulePrimitivePureFunction ) ) ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==30) ) {
                int LA21_1 = input.LA(2);

                if ( ((LA21_1>=21 && LA21_1<=22)||(LA21_1>=44 && LA21_1<=49)) ) {
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
                    // InternalFPML.g:1596:3: (otherlv_0= '>>=' ( (otherlv_1= RULE_ID ) ) )
                    {
                    // InternalFPML.g:1596:3: (otherlv_0= '>>=' ( (otherlv_1= RULE_ID ) ) )
                    // InternalFPML.g:1597:4: otherlv_0= '>>=' ( (otherlv_1= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,30,FOLLOW_18); 

                    				newLeafNode(otherlv_0, grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getGreaterThanSignGreaterThanSignEqualsSignKeyword_0_0());
                    			
                    // InternalFPML.g:1601:4: ( (otherlv_1= RULE_ID ) )
                    // InternalFPML.g:1602:5: (otherlv_1= RULE_ID )
                    {
                    // InternalFPML.g:1602:5: (otherlv_1= RULE_ID )
                    // InternalFPML.g:1603:6: otherlv_1= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCompositionFunctionBodyEffectFullFactorRule());
                    						}
                    					
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_1, grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getReferenceElementChainElementCrossReference_0_1_0());
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFPML.g:1616:3: (otherlv_2= '>>=' ( ( (lv_PrimitiveElement_3_1= rulePrimitiveEffectFullFunction | lv_PrimitiveElement_3_2= rulePrimitivePureFunction ) ) ) )
                    {
                    // InternalFPML.g:1616:3: (otherlv_2= '>>=' ( ( (lv_PrimitiveElement_3_1= rulePrimitiveEffectFullFunction | lv_PrimitiveElement_3_2= rulePrimitivePureFunction ) ) ) )
                    // InternalFPML.g:1617:4: otherlv_2= '>>=' ( ( (lv_PrimitiveElement_3_1= rulePrimitiveEffectFullFunction | lv_PrimitiveElement_3_2= rulePrimitivePureFunction ) ) )
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_31); 

                    				newLeafNode(otherlv_2, grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getGreaterThanSignGreaterThanSignEqualsSignKeyword_1_0());
                    			
                    // InternalFPML.g:1621:4: ( ( (lv_PrimitiveElement_3_1= rulePrimitiveEffectFullFunction | lv_PrimitiveElement_3_2= rulePrimitivePureFunction ) ) )
                    // InternalFPML.g:1622:5: ( (lv_PrimitiveElement_3_1= rulePrimitiveEffectFullFunction | lv_PrimitiveElement_3_2= rulePrimitivePureFunction ) )
                    {
                    // InternalFPML.g:1622:5: ( (lv_PrimitiveElement_3_1= rulePrimitiveEffectFullFunction | lv_PrimitiveElement_3_2= rulePrimitivePureFunction ) )
                    // InternalFPML.g:1623:6: (lv_PrimitiveElement_3_1= rulePrimitiveEffectFullFunction | lv_PrimitiveElement_3_2= rulePrimitivePureFunction )
                    {
                    // InternalFPML.g:1623:6: (lv_PrimitiveElement_3_1= rulePrimitiveEffectFullFunction | lv_PrimitiveElement_3_2= rulePrimitivePureFunction )
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==49) ) {
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
                            // InternalFPML.g:1624:7: lv_PrimitiveElement_3_1= rulePrimitiveEffectFullFunction
                            {

                            							newCompositeNode(grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getPrimitiveElementPrimitiveEffectFullFunctionParserRuleCall_1_1_0_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_PrimitiveElement_3_1=rulePrimitiveEffectFullFunction();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getCompositionFunctionBodyEffectFullFactorRule());
                            							}
                            							set(
                            								current,
                            								"PrimitiveElement",
                            								lv_PrimitiveElement_3_1,
                            								"it.unibo.FPML.PrimitiveEffectFullFunction");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;
                        case 2 :
                            // InternalFPML.g:1640:7: lv_PrimitiveElement_3_2= rulePrimitivePureFunction
                            {

                            							newCompositeNode(grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getPrimitiveElementPrimitivePureFunctionParserRuleCall_1_1_0_1());
                            						
                            pushFollow(FOLLOW_2);
                            lv_PrimitiveElement_3_2=rulePrimitivePureFunction();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getCompositionFunctionBodyEffectFullFactorRule());
                            							}
                            							set(
                            								current,
                            								"PrimitiveElement",
                            								lv_PrimitiveElement_3_2,
                            								"it.unibo.FPML.PrimitivePureFunction");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;

                    }


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


    // $ANTLR start "entryRuleReturnPureFunction"
    // InternalFPML.g:1663:1: entryRuleReturnPureFunction returns [EObject current=null] : iv_ruleReturnPureFunction= ruleReturnPureFunction EOF ;
    public final EObject entryRuleReturnPureFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnPureFunction = null;


        try {
            // InternalFPML.g:1663:59: (iv_ruleReturnPureFunction= ruleReturnPureFunction EOF )
            // InternalFPML.g:1664:2: iv_ruleReturnPureFunction= ruleReturnPureFunction EOF
            {
             newCompositeNode(grammarAccess.getReturnPureFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReturnPureFunction=ruleReturnPureFunction();

            state._fsp--;

             current =iv_ruleReturnPureFunction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReturnPureFunction"


    // $ANTLR start "ruleReturnPureFunction"
    // InternalFPML.g:1670:1: ruleReturnPureFunction returns [EObject current=null] : (otherlv_0= '->' otherlv_1= '(' ( (lv_lambdaFunctionBody_2_0= rulePureLambda ) ) otherlv_3= ')' ) ;
    public final EObject ruleReturnPureFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_lambdaFunctionBody_2_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:1676:2: ( (otherlv_0= '->' otherlv_1= '(' ( (lv_lambdaFunctionBody_2_0= rulePureLambda ) ) otherlv_3= ')' ) )
            // InternalFPML.g:1677:2: (otherlv_0= '->' otherlv_1= '(' ( (lv_lambdaFunctionBody_2_0= rulePureLambda ) ) otherlv_3= ')' )
            {
            // InternalFPML.g:1677:2: (otherlv_0= '->' otherlv_1= '(' ( (lv_lambdaFunctionBody_2_0= rulePureLambda ) ) otherlv_3= ')' )
            // InternalFPML.g:1678:3: otherlv_0= '->' otherlv_1= '(' ( (lv_lambdaFunctionBody_2_0= rulePureLambda ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getReturnPureFunctionAccess().getHyphenMinusGreaterThanSignKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getReturnPureFunctionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalFPML.g:1686:3: ( (lv_lambdaFunctionBody_2_0= rulePureLambda ) )
            // InternalFPML.g:1687:4: (lv_lambdaFunctionBody_2_0= rulePureLambda )
            {
            // InternalFPML.g:1687:4: (lv_lambdaFunctionBody_2_0= rulePureLambda )
            // InternalFPML.g:1688:5: lv_lambdaFunctionBody_2_0= rulePureLambda
            {

            					newCompositeNode(grammarAccess.getReturnPureFunctionAccess().getLambdaFunctionBodyPureLambdaParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_20);
            lv_lambdaFunctionBody_2_0=rulePureLambda();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReturnPureFunctionRule());
            					}
            					set(
            						current,
            						"lambdaFunctionBody",
            						lv_lambdaFunctionBody_2_0,
            						"it.unibo.FPML.PureLambda");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getReturnPureFunctionAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReturnPureFunction"


    // $ANTLR start "entryRuleReturnEffectFullFunction"
    // InternalFPML.g:1713:1: entryRuleReturnEffectFullFunction returns [EObject current=null] : iv_ruleReturnEffectFullFunction= ruleReturnEffectFullFunction EOF ;
    public final EObject entryRuleReturnEffectFullFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnEffectFullFunction = null;


        try {
            // InternalFPML.g:1713:65: (iv_ruleReturnEffectFullFunction= ruleReturnEffectFullFunction EOF )
            // InternalFPML.g:1714:2: iv_ruleReturnEffectFullFunction= ruleReturnEffectFullFunction EOF
            {
             newCompositeNode(grammarAccess.getReturnEffectFullFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReturnEffectFullFunction=ruleReturnEffectFullFunction();

            state._fsp--;

             current =iv_ruleReturnEffectFullFunction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReturnEffectFullFunction"


    // $ANTLR start "ruleReturnEffectFullFunction"
    // InternalFPML.g:1720:1: ruleReturnEffectFullFunction returns [EObject current=null] : (otherlv_0= '->' otherlv_1= '(' ( (lv_lambdaFunctionBody_2_0= ruleEffectFullLambda ) ) otherlv_3= ')' ) ;
    public final EObject ruleReturnEffectFullFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_lambdaFunctionBody_2_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:1726:2: ( (otherlv_0= '->' otherlv_1= '(' ( (lv_lambdaFunctionBody_2_0= ruleEffectFullLambda ) ) otherlv_3= ')' ) )
            // InternalFPML.g:1727:2: (otherlv_0= '->' otherlv_1= '(' ( (lv_lambdaFunctionBody_2_0= ruleEffectFullLambda ) ) otherlv_3= ')' )
            {
            // InternalFPML.g:1727:2: (otherlv_0= '->' otherlv_1= '(' ( (lv_lambdaFunctionBody_2_0= ruleEffectFullLambda ) ) otherlv_3= ')' )
            // InternalFPML.g:1728:3: otherlv_0= '->' otherlv_1= '(' ( (lv_lambdaFunctionBody_2_0= ruleEffectFullLambda ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getReturnEffectFullFunctionAccess().getHyphenMinusGreaterThanSignKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getReturnEffectFullFunctionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalFPML.g:1736:3: ( (lv_lambdaFunctionBody_2_0= ruleEffectFullLambda ) )
            // InternalFPML.g:1737:4: (lv_lambdaFunctionBody_2_0= ruleEffectFullLambda )
            {
            // InternalFPML.g:1737:4: (lv_lambdaFunctionBody_2_0= ruleEffectFullLambda )
            // InternalFPML.g:1738:5: lv_lambdaFunctionBody_2_0= ruleEffectFullLambda
            {

            					newCompositeNode(grammarAccess.getReturnEffectFullFunctionAccess().getLambdaFunctionBodyEffectFullLambdaParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_20);
            lv_lambdaFunctionBody_2_0=ruleEffectFullLambda();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReturnEffectFullFunctionRule());
            					}
            					set(
            						current,
            						"lambdaFunctionBody",
            						lv_lambdaFunctionBody_2_0,
            						"it.unibo.FPML.EffectFullLambda");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getReturnEffectFullFunctionAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReturnEffectFullFunction"


    // $ANTLR start "entryRuleIOType"
    // InternalFPML.g:1763:1: entryRuleIOType returns [EObject current=null] : iv_ruleIOType= ruleIOType EOF ;
    public final EObject entryRuleIOType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIOType = null;


        try {
            // InternalFPML.g:1763:47: (iv_ruleIOType= ruleIOType EOF )
            // InternalFPML.g:1764:2: iv_ruleIOType= ruleIOType EOF
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
    // InternalFPML.g:1770:1: ruleIOType returns [EObject current=null] : (otherlv_0= 'IO' ( (lv_type_1_0= ruleType ) ) ) ;
    public final EObject ruleIOType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:1776:2: ( (otherlv_0= 'IO' ( (lv_type_1_0= ruleType ) ) ) )
            // InternalFPML.g:1777:2: (otherlv_0= 'IO' ( (lv_type_1_0= ruleType ) ) )
            {
            // InternalFPML.g:1777:2: (otherlv_0= 'IO' ( (lv_type_1_0= ruleType ) ) )
            // InternalFPML.g:1778:3: otherlv_0= 'IO' ( (lv_type_1_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getIOTypeAccess().getIOKeyword_0());
            		
            // InternalFPML.g:1782:3: ( (lv_type_1_0= ruleType ) )
            // InternalFPML.g:1783:4: (lv_type_1_0= ruleType )
            {
            // InternalFPML.g:1783:4: (lv_type_1_0= ruleType )
            // InternalFPML.g:1784:5: lv_type_1_0= ruleType
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
    // InternalFPML.g:1805:1: entryRuleValueType returns [EObject current=null] : iv_ruleValueType= ruleValueType EOF ;
    public final EObject entryRuleValueType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueType = null;


        try {
            // InternalFPML.g:1805:50: (iv_ruleValueType= ruleValueType EOF )
            // InternalFPML.g:1806:2: iv_ruleValueType= ruleValueType EOF
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
    // InternalFPML.g:1812:1: ruleValueType returns [EObject current=null] : (this_IntegerType_0= ruleIntegerType | this_StringType_1= ruleStringType | this_DataType_2= ruleDataType | this_PureFunctionType_3= rulePureFunctionType ) ;
    public final EObject ruleValueType() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerType_0 = null;

        EObject this_StringType_1 = null;

        EObject this_DataType_2 = null;

        EObject this_PureFunctionType_3 = null;



        	enterRule();

        try {
            // InternalFPML.g:1818:2: ( (this_IntegerType_0= ruleIntegerType | this_StringType_1= ruleStringType | this_DataType_2= ruleDataType | this_PureFunctionType_3= rulePureFunctionType ) )
            // InternalFPML.g:1819:2: (this_IntegerType_0= ruleIntegerType | this_StringType_1= ruleStringType | this_DataType_2= ruleDataType | this_PureFunctionType_3= rulePureFunctionType )
            {
            // InternalFPML.g:1819:2: (this_IntegerType_0= ruleIntegerType | this_StringType_1= ruleStringType | this_DataType_2= ruleDataType | this_PureFunctionType_3= rulePureFunctionType )
            int alt22=4;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt22=1;
                }
                break;
            case 33:
                {
                alt22=2;
                }
                break;
            case 35:
                {
                alt22=3;
                }
                break;
            case 36:
                {
                alt22=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalFPML.g:1820:3: this_IntegerType_0= ruleIntegerType
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
                    // InternalFPML.g:1829:3: this_StringType_1= ruleStringType
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
                    // InternalFPML.g:1838:3: this_DataType_2= ruleDataType
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
                    // InternalFPML.g:1847:3: this_PureFunctionType_3= rulePureFunctionType
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
    // InternalFPML.g:1859:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalFPML.g:1859:45: (iv_ruleType= ruleType EOF )
            // InternalFPML.g:1860:2: iv_ruleType= ruleType EOF
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
    // InternalFPML.g:1866:1: ruleType returns [EObject current=null] : (this_ValueType_0= ruleValueType | this_UnitType_1= ruleUnitType | this_EffectFullFunctionType_2= ruleEffectFullFunctionType ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_ValueType_0 = null;

        EObject this_UnitType_1 = null;

        EObject this_EffectFullFunctionType_2 = null;



        	enterRule();

        try {
            // InternalFPML.g:1872:2: ( (this_ValueType_0= ruleValueType | this_UnitType_1= ruleUnitType | this_EffectFullFunctionType_2= ruleEffectFullFunctionType ) )
            // InternalFPML.g:1873:2: (this_ValueType_0= ruleValueType | this_UnitType_1= ruleUnitType | this_EffectFullFunctionType_2= ruleEffectFullFunctionType )
            {
            // InternalFPML.g:1873:2: (this_ValueType_0= ruleValueType | this_UnitType_1= ruleUnitType | this_EffectFullFunctionType_2= ruleEffectFullFunctionType )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 32:
            case 33:
            case 35:
            case 36:
                {
                alt23=1;
                }
                break;
            case 34:
                {
                alt23=2;
                }
                break;
            case 40:
                {
                alt23=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalFPML.g:1874:3: this_ValueType_0= ruleValueType
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
                    // InternalFPML.g:1883:3: this_UnitType_1= ruleUnitType
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
                    // InternalFPML.g:1892:3: this_EffectFullFunctionType_2= ruleEffectFullFunctionType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getEffectFullFunctionTypeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_EffectFullFunctionType_2=ruleEffectFullFunctionType();

                    state._fsp--;


                    			current = this_EffectFullFunctionType_2;
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
    // InternalFPML.g:1904:1: entryRuleIntegerType returns [EObject current=null] : iv_ruleIntegerType= ruleIntegerType EOF ;
    public final EObject entryRuleIntegerType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerType = null;


        try {
            // InternalFPML.g:1904:52: (iv_ruleIntegerType= ruleIntegerType EOF )
            // InternalFPML.g:1905:2: iv_ruleIntegerType= ruleIntegerType EOF
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
    // InternalFPML.g:1911:1: ruleIntegerType returns [EObject current=null] : ( () ( (lv_type_1_0= 'int' ) ) ) ;
    public final EObject ruleIntegerType() throws RecognitionException {
        EObject current = null;

        Token lv_type_1_0=null;


        	enterRule();

        try {
            // InternalFPML.g:1917:2: ( ( () ( (lv_type_1_0= 'int' ) ) ) )
            // InternalFPML.g:1918:2: ( () ( (lv_type_1_0= 'int' ) ) )
            {
            // InternalFPML.g:1918:2: ( () ( (lv_type_1_0= 'int' ) ) )
            // InternalFPML.g:1919:3: () ( (lv_type_1_0= 'int' ) )
            {
            // InternalFPML.g:1919:3: ()
            // InternalFPML.g:1920:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntegerTypeAccess().getIntegerTypeAction_0(),
            					current);
            			

            }

            // InternalFPML.g:1926:3: ( (lv_type_1_0= 'int' ) )
            // InternalFPML.g:1927:4: (lv_type_1_0= 'int' )
            {
            // InternalFPML.g:1927:4: (lv_type_1_0= 'int' )
            // InternalFPML.g:1928:5: lv_type_1_0= 'int'
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
    // InternalFPML.g:1944:1: entryRuleStringType returns [EObject current=null] : iv_ruleStringType= ruleStringType EOF ;
    public final EObject entryRuleStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringType = null;


        try {
            // InternalFPML.g:1944:51: (iv_ruleStringType= ruleStringType EOF )
            // InternalFPML.g:1945:2: iv_ruleStringType= ruleStringType EOF
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
    // InternalFPML.g:1951:1: ruleStringType returns [EObject current=null] : ( () ( (lv_type_1_0= 'String' ) ) ) ;
    public final EObject ruleStringType() throws RecognitionException {
        EObject current = null;

        Token lv_type_1_0=null;


        	enterRule();

        try {
            // InternalFPML.g:1957:2: ( ( () ( (lv_type_1_0= 'String' ) ) ) )
            // InternalFPML.g:1958:2: ( () ( (lv_type_1_0= 'String' ) ) )
            {
            // InternalFPML.g:1958:2: ( () ( (lv_type_1_0= 'String' ) ) )
            // InternalFPML.g:1959:3: () ( (lv_type_1_0= 'String' ) )
            {
            // InternalFPML.g:1959:3: ()
            // InternalFPML.g:1960:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStringTypeAccess().getStringTypeAction_0(),
            					current);
            			

            }

            // InternalFPML.g:1966:3: ( (lv_type_1_0= 'String' ) )
            // InternalFPML.g:1967:4: (lv_type_1_0= 'String' )
            {
            // InternalFPML.g:1967:4: (lv_type_1_0= 'String' )
            // InternalFPML.g:1968:5: lv_type_1_0= 'String'
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
    // InternalFPML.g:1984:1: entryRuleUnitType returns [EObject current=null] : iv_ruleUnitType= ruleUnitType EOF ;
    public final EObject entryRuleUnitType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnitType = null;


        try {
            // InternalFPML.g:1984:49: (iv_ruleUnitType= ruleUnitType EOF )
            // InternalFPML.g:1985:2: iv_ruleUnitType= ruleUnitType EOF
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
    // InternalFPML.g:1991:1: ruleUnitType returns [EObject current=null] : ( () ( (lv_type_1_0= 'Unit' ) ) ) ;
    public final EObject ruleUnitType() throws RecognitionException {
        EObject current = null;

        Token lv_type_1_0=null;


        	enterRule();

        try {
            // InternalFPML.g:1997:2: ( ( () ( (lv_type_1_0= 'Unit' ) ) ) )
            // InternalFPML.g:1998:2: ( () ( (lv_type_1_0= 'Unit' ) ) )
            {
            // InternalFPML.g:1998:2: ( () ( (lv_type_1_0= 'Unit' ) ) )
            // InternalFPML.g:1999:3: () ( (lv_type_1_0= 'Unit' ) )
            {
            // InternalFPML.g:1999:3: ()
            // InternalFPML.g:2000:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUnitTypeAccess().getUnitTypeAction_0(),
            					current);
            			

            }

            // InternalFPML.g:2006:3: ( (lv_type_1_0= 'Unit' ) )
            // InternalFPML.g:2007:4: (lv_type_1_0= 'Unit' )
            {
            // InternalFPML.g:2007:4: (lv_type_1_0= 'Unit' )
            // InternalFPML.g:2008:5: lv_type_1_0= 'Unit'
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
    // InternalFPML.g:2024:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalFPML.g:2024:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalFPML.g:2025:2: iv_ruleDataType= ruleDataType EOF
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
    // InternalFPML.g:2031:1: ruleDataType returns [EObject current=null] : ( () otherlv_1= 'ref' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalFPML.g:2037:2: ( ( () otherlv_1= 'ref' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalFPML.g:2038:2: ( () otherlv_1= 'ref' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalFPML.g:2038:2: ( () otherlv_1= 'ref' ( (otherlv_2= RULE_ID ) ) )
            // InternalFPML.g:2039:3: () otherlv_1= 'ref' ( (otherlv_2= RULE_ID ) )
            {
            // InternalFPML.g:2039:3: ()
            // InternalFPML.g:2040:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDataTypeAccess().getDataTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getDataTypeAccess().getRefKeyword_1());
            		
            // InternalFPML.g:2050:3: ( (otherlv_2= RULE_ID ) )
            // InternalFPML.g:2051:4: (otherlv_2= RULE_ID )
            {
            // InternalFPML.g:2051:4: (otherlv_2= RULE_ID )
            // InternalFPML.g:2052:5: otherlv_2= RULE_ID
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


    // $ANTLR start "entryRulePureFunctionType"
    // InternalFPML.g:2067:1: entryRulePureFunctionType returns [EObject current=null] : iv_rulePureFunctionType= rulePureFunctionType EOF ;
    public final EObject entryRulePureFunctionType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePureFunctionType = null;


        try {
            // InternalFPML.g:2067:57: (iv_rulePureFunctionType= rulePureFunctionType EOF )
            // InternalFPML.g:2068:2: iv_rulePureFunctionType= rulePureFunctionType EOF
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
    // InternalFPML.g:2074:1: rulePureFunctionType returns [EObject current=null] : ( () otherlv_1= 'F' otherlv_2= '<' ( (lv_argType_3_0= ruleValueType ) ) otherlv_4= ',' ( (lv_returnType_5_0= ruleValueType ) ) otherlv_6= '>' ) ;
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
            // InternalFPML.g:2080:2: ( ( () otherlv_1= 'F' otherlv_2= '<' ( (lv_argType_3_0= ruleValueType ) ) otherlv_4= ',' ( (lv_returnType_5_0= ruleValueType ) ) otherlv_6= '>' ) )
            // InternalFPML.g:2081:2: ( () otherlv_1= 'F' otherlv_2= '<' ( (lv_argType_3_0= ruleValueType ) ) otherlv_4= ',' ( (lv_returnType_5_0= ruleValueType ) ) otherlv_6= '>' )
            {
            // InternalFPML.g:2081:2: ( () otherlv_1= 'F' otherlv_2= '<' ( (lv_argType_3_0= ruleValueType ) ) otherlv_4= ',' ( (lv_returnType_5_0= ruleValueType ) ) otherlv_6= '>' )
            // InternalFPML.g:2082:3: () otherlv_1= 'F' otherlv_2= '<' ( (lv_argType_3_0= ruleValueType ) ) otherlv_4= ',' ( (lv_returnType_5_0= ruleValueType ) ) otherlv_6= '>'
            {
            // InternalFPML.g:2082:3: ()
            // InternalFPML.g:2083:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPureFunctionTypeAccess().getPureFunctionTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getPureFunctionTypeAccess().getFKeyword_1());
            		
            otherlv_2=(Token)match(input,37,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getPureFunctionTypeAccess().getLessThanSignKeyword_2());
            		
            // InternalFPML.g:2097:3: ( (lv_argType_3_0= ruleValueType ) )
            // InternalFPML.g:2098:4: (lv_argType_3_0= ruleValueType )
            {
            // InternalFPML.g:2098:4: (lv_argType_3_0= ruleValueType )
            // InternalFPML.g:2099:5: lv_argType_3_0= ruleValueType
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

            otherlv_4=(Token)match(input,38,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getPureFunctionTypeAccess().getCommaKeyword_4());
            		
            // InternalFPML.g:2120:3: ( (lv_returnType_5_0= ruleValueType ) )
            // InternalFPML.g:2121:4: (lv_returnType_5_0= ruleValueType )
            {
            // InternalFPML.g:2121:4: (lv_returnType_5_0= ruleValueType )
            // InternalFPML.g:2122:5: lv_returnType_5_0= ruleValueType
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
    // InternalFPML.g:2147:1: entryRuleEffectFullFunctionType returns [EObject current=null] : iv_ruleEffectFullFunctionType= ruleEffectFullFunctionType EOF ;
    public final EObject entryRuleEffectFullFunctionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullFunctionType = null;


        try {
            // InternalFPML.g:2147:63: (iv_ruleEffectFullFunctionType= ruleEffectFullFunctionType EOF )
            // InternalFPML.g:2148:2: iv_ruleEffectFullFunctionType= ruleEffectFullFunctionType EOF
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
    // InternalFPML.g:2154:1: ruleEffectFullFunctionType returns [EObject current=null] : ( () otherlv_1= 'FIO' otherlv_2= '<' ( (lv_argType_3_0= ruleType ) ) otherlv_4= ',' ( (lv_returnType_5_0= ruleIOType ) ) otherlv_6= '>' ) ;
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
            // InternalFPML.g:2160:2: ( ( () otherlv_1= 'FIO' otherlv_2= '<' ( (lv_argType_3_0= ruleType ) ) otherlv_4= ',' ( (lv_returnType_5_0= ruleIOType ) ) otherlv_6= '>' ) )
            // InternalFPML.g:2161:2: ( () otherlv_1= 'FIO' otherlv_2= '<' ( (lv_argType_3_0= ruleType ) ) otherlv_4= ',' ( (lv_returnType_5_0= ruleIOType ) ) otherlv_6= '>' )
            {
            // InternalFPML.g:2161:2: ( () otherlv_1= 'FIO' otherlv_2= '<' ( (lv_argType_3_0= ruleType ) ) otherlv_4= ',' ( (lv_returnType_5_0= ruleIOType ) ) otherlv_6= '>' )
            // InternalFPML.g:2162:3: () otherlv_1= 'FIO' otherlv_2= '<' ( (lv_argType_3_0= ruleType ) ) otherlv_4= ',' ( (lv_returnType_5_0= ruleIOType ) ) otherlv_6= '>'
            {
            // InternalFPML.g:2162:3: ()
            // InternalFPML.g:2163:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEffectFullFunctionTypeAccess().getEffectFullFunctionTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,40,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getEffectFullFunctionTypeAccess().getFIOKeyword_1());
            		
            otherlv_2=(Token)match(input,37,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getEffectFullFunctionTypeAccess().getLessThanSignKeyword_2());
            		
            // InternalFPML.g:2177:3: ( (lv_argType_3_0= ruleType ) )
            // InternalFPML.g:2178:4: (lv_argType_3_0= ruleType )
            {
            // InternalFPML.g:2178:4: (lv_argType_3_0= ruleType )
            // InternalFPML.g:2179:5: lv_argType_3_0= ruleType
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

            otherlv_4=(Token)match(input,38,FOLLOW_22); 

            			newLeafNode(otherlv_4, grammarAccess.getEffectFullFunctionTypeAccess().getCommaKeyword_4());
            		
            // InternalFPML.g:2200:3: ( (lv_returnType_5_0= ruleIOType ) )
            // InternalFPML.g:2201:4: (lv_returnType_5_0= ruleIOType )
            {
            // InternalFPML.g:2201:4: (lv_returnType_5_0= ruleIOType )
            // InternalFPML.g:2202:5: lv_returnType_5_0= ruleIOType
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


    // $ANTLR start "entryRuleExpression"
    // InternalFPML.g:2227:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalFPML.g:2227:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalFPML.g:2228:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalFPML.g:2234:1: ruleExpression returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_UnitValue_2= ruleUnitValue | this_DataValue_3= ruleDataValue | this_FunctionValue_4= ruleFunctionValue ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_IntValue_0 = null;

        EObject this_StringValue_1 = null;

        EObject this_UnitValue_2 = null;

        EObject this_DataValue_3 = null;

        EObject this_FunctionValue_4 = null;



        	enterRule();

        try {
            // InternalFPML.g:2240:2: ( (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_UnitValue_2= ruleUnitValue | this_DataValue_3= ruleDataValue | this_FunctionValue_4= ruleFunctionValue ) )
            // InternalFPML.g:2241:2: (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_UnitValue_2= ruleUnitValue | this_DataValue_3= ruleDataValue | this_FunctionValue_4= ruleFunctionValue )
            {
            // InternalFPML.g:2241:2: (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_UnitValue_2= ruleUnitValue | this_DataValue_3= ruleDataValue | this_FunctionValue_4= ruleFunctionValue )
            int alt24=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt24=1;
                }
                break;
            case RULE_STRING:
                {
                alt24=2;
                }
                break;
            case 41:
                {
                alt24=3;
                }
                break;
            case RULE_ID:
                {
                alt24=4;
                }
                break;
            case 24:
                {
                alt24=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalFPML.g:2242:3: this_IntValue_0= ruleIntValue
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
                    // InternalFPML.g:2251:3: this_StringValue_1= ruleStringValue
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
                    // InternalFPML.g:2260:3: this_UnitValue_2= ruleUnitValue
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
                    // InternalFPML.g:2269:3: this_DataValue_3= ruleDataValue
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getDataValueParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataValue_3=ruleDataValue();

                    state._fsp--;


                    			current = this_DataValue_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalFPML.g:2278:3: this_FunctionValue_4= ruleFunctionValue
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getFunctionValueParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_FunctionValue_4=ruleFunctionValue();

                    state._fsp--;


                    			current = this_FunctionValue_4;
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
    // InternalFPML.g:2290:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // InternalFPML.g:2290:49: (iv_ruleIntValue= ruleIntValue EOF )
            // InternalFPML.g:2291:2: iv_ruleIntValue= ruleIntValue EOF
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
    // InternalFPML.g:2297:1: ruleIntValue returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalFPML.g:2303:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // InternalFPML.g:2304:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // InternalFPML.g:2304:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // InternalFPML.g:2305:3: () ( (lv_value_1_0= RULE_INT ) )
            {
            // InternalFPML.g:2305:3: ()
            // InternalFPML.g:2306:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntValueAccess().getIntegerTypeAction_0(),
            					current);
            			

            }

            // InternalFPML.g:2312:3: ( (lv_value_1_0= RULE_INT ) )
            // InternalFPML.g:2313:4: (lv_value_1_0= RULE_INT )
            {
            // InternalFPML.g:2313:4: (lv_value_1_0= RULE_INT )
            // InternalFPML.g:2314:5: lv_value_1_0= RULE_INT
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
    // InternalFPML.g:2334:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalFPML.g:2334:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalFPML.g:2335:2: iv_ruleStringValue= ruleStringValue EOF
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
    // InternalFPML.g:2341:1: ruleStringValue returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalFPML.g:2347:2: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalFPML.g:2348:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalFPML.g:2348:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalFPML.g:2349:3: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // InternalFPML.g:2349:3: ()
            // InternalFPML.g:2350:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStringValueAccess().getStringTypeAction_0(),
            					current);
            			

            }

            // InternalFPML.g:2356:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalFPML.g:2357:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalFPML.g:2357:4: (lv_value_1_0= RULE_STRING )
            // InternalFPML.g:2358:5: lv_value_1_0= RULE_STRING
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
    // InternalFPML.g:2378:1: entryRuleUnitValue returns [EObject current=null] : iv_ruleUnitValue= ruleUnitValue EOF ;
    public final EObject entryRuleUnitValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnitValue = null;


        try {
            // InternalFPML.g:2378:50: (iv_ruleUnitValue= ruleUnitValue EOF )
            // InternalFPML.g:2379:2: iv_ruleUnitValue= ruleUnitValue EOF
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
    // InternalFPML.g:2385:1: ruleUnitValue returns [EObject current=null] : ( () otherlv_1= '()' ) ;
    public final EObject ruleUnitValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFPML.g:2391:2: ( ( () otherlv_1= '()' ) )
            // InternalFPML.g:2392:2: ( () otherlv_1= '()' )
            {
            // InternalFPML.g:2392:2: ( () otherlv_1= '()' )
            // InternalFPML.g:2393:3: () otherlv_1= '()'
            {
            // InternalFPML.g:2393:3: ()
            // InternalFPML.g:2394:4: 
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


    // $ANTLR start "entryRuleFunctionValue"
    // InternalFPML.g:2408:1: entryRuleFunctionValue returns [EObject current=null] : iv_ruleFunctionValue= ruleFunctionValue EOF ;
    public final EObject entryRuleFunctionValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionValue = null;


        try {
            // InternalFPML.g:2408:54: (iv_ruleFunctionValue= ruleFunctionValue EOF )
            // InternalFPML.g:2409:2: iv_ruleFunctionValue= ruleFunctionValue EOF
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
    // InternalFPML.g:2415:1: ruleFunctionValue returns [EObject current=null] : ( (lv_value_0_0= rulePureLambda ) ) ;
    public final EObject ruleFunctionValue() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:2421:2: ( ( (lv_value_0_0= rulePureLambda ) ) )
            // InternalFPML.g:2422:2: ( (lv_value_0_0= rulePureLambda ) )
            {
            // InternalFPML.g:2422:2: ( (lv_value_0_0= rulePureLambda ) )
            // InternalFPML.g:2423:3: (lv_value_0_0= rulePureLambda )
            {
            // InternalFPML.g:2423:3: (lv_value_0_0= rulePureLambda )
            // InternalFPML.g:2424:4: lv_value_0_0= rulePureLambda
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
    // InternalFPML.g:2444:1: entryRuleDataValue returns [EObject current=null] : iv_ruleDataValue= ruleDataValue EOF ;
    public final EObject entryRuleDataValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataValue = null;


        try {
            // InternalFPML.g:2444:50: (iv_ruleDataValue= ruleDataValue EOF )
            // InternalFPML.g:2445:2: iv_ruleDataValue= ruleDataValue EOF
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
    // InternalFPML.g:2451:1: ruleDataValue returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_value_3_0= ruleAdtValue ) ) otherlv_4= ')' ) ;
    public final EObject ruleDataValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:2457:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_value_3_0= ruleAdtValue ) ) otherlv_4= ')' ) )
            // InternalFPML.g:2458:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_value_3_0= ruleAdtValue ) ) otherlv_4= ')' )
            {
            // InternalFPML.g:2458:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_value_3_0= ruleAdtValue ) ) otherlv_4= ')' )
            // InternalFPML.g:2459:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_value_3_0= ruleAdtValue ) ) otherlv_4= ')'
            {
            // InternalFPML.g:2459:3: ()
            // InternalFPML.g:2460:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDataValueAccess().getDataValueAction_0(),
            					current);
            			

            }

            // InternalFPML.g:2466:3: ( (otherlv_1= RULE_ID ) )
            // InternalFPML.g:2467:4: (otherlv_1= RULE_ID )
            {
            // InternalFPML.g:2467:4: (otherlv_1= RULE_ID )
            // InternalFPML.g:2468:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataValueRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(otherlv_1, grammarAccess.getDataValueAccess().getTypeDataCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_35); 

            			newLeafNode(otherlv_2, grammarAccess.getDataValueAccess().getLeftParenthesisKeyword_2());
            		
            // InternalFPML.g:2483:3: ( (lv_value_3_0= ruleAdtValue ) )
            // InternalFPML.g:2484:4: (lv_value_3_0= ruleAdtValue )
            {
            // InternalFPML.g:2484:4: (lv_value_3_0= ruleAdtValue )
            // InternalFPML.g:2485:5: lv_value_3_0= ruleAdtValue
            {

            					newCompositeNode(grammarAccess.getDataValueAccess().getValueAdtValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_20);
            lv_value_3_0=ruleAdtValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataValueRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"it.unibo.FPML.AdtValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,25,FOLLOW_2); 

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


    // $ANTLR start "entryRuleValueRef"
    // InternalFPML.g:2510:1: entryRuleValueRef returns [EObject current=null] : iv_ruleValueRef= ruleValueRef EOF ;
    public final EObject entryRuleValueRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueRef = null;


        try {
            // InternalFPML.g:2510:49: (iv_ruleValueRef= ruleValueRef EOF )
            // InternalFPML.g:2511:2: iv_ruleValueRef= ruleValueRef EOF
            {
             newCompositeNode(grammarAccess.getValueRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValueRef=ruleValueRef();

            state._fsp--;

             current =iv_ruleValueRef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValueRef"


    // $ANTLR start "ruleValueRef"
    // InternalFPML.g:2517:1: ruleValueRef returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleValueRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFPML.g:2523:2: ( ( () ( (otherlv_1= RULE_ID ) ) ) )
            // InternalFPML.g:2524:2: ( () ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalFPML.g:2524:2: ( () ( (otherlv_1= RULE_ID ) ) )
            // InternalFPML.g:2525:3: () ( (otherlv_1= RULE_ID ) )
            {
            // InternalFPML.g:2525:3: ()
            // InternalFPML.g:2526:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getValueRefAccess().getValueRefAction_0(),
            					current);
            			

            }

            // InternalFPML.g:2532:3: ( (otherlv_1= RULE_ID ) )
            // InternalFPML.g:2533:4: (otherlv_1= RULE_ID )
            {
            // InternalFPML.g:2533:4: (otherlv_1= RULE_ID )
            // InternalFPML.g:2534:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getValueRefRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getValueRefAccess().getValuePureReferenceCrossReference_1_0());
            				

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
    // $ANTLR end "ruleValueRef"


    // $ANTLR start "entryRulePureLambda"
    // InternalFPML.g:2549:1: entryRulePureLambda returns [EObject current=null] : iv_rulePureLambda= rulePureLambda EOF ;
    public final EObject entryRulePureLambda() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePureLambda = null;


        try {
            // InternalFPML.g:2549:51: (iv_rulePureLambda= rulePureLambda EOF )
            // InternalFPML.g:2550:2: iv_rulePureLambda= rulePureLambda EOF
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
    // InternalFPML.g:2556:1: rulePureLambda returns [EObject current=null] : (otherlv_0= '(' ( (lv_arg_1_0= ruleArgument ) ) otherlv_2= ')' otherlv_3= ':' ( (lv_functionBody_4_0= ruleFunctionBodyPure ) ) ) ;
    public final EObject rulePureLambda() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_arg_1_0 = null;

        EObject lv_functionBody_4_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:2562:2: ( (otherlv_0= '(' ( (lv_arg_1_0= ruleArgument ) ) otherlv_2= ')' otherlv_3= ':' ( (lv_functionBody_4_0= ruleFunctionBodyPure ) ) ) )
            // InternalFPML.g:2563:2: (otherlv_0= '(' ( (lv_arg_1_0= ruleArgument ) ) otherlv_2= ')' otherlv_3= ':' ( (lv_functionBody_4_0= ruleFunctionBodyPure ) ) )
            {
            // InternalFPML.g:2563:2: (otherlv_0= '(' ( (lv_arg_1_0= ruleArgument ) ) otherlv_2= ')' otherlv_3= ':' ( (lv_functionBody_4_0= ruleFunctionBodyPure ) ) )
            // InternalFPML.g:2564:3: otherlv_0= '(' ( (lv_arg_1_0= ruleArgument ) ) otherlv_2= ')' otherlv_3= ':' ( (lv_functionBody_4_0= ruleFunctionBodyPure ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getPureLambdaAccess().getLeftParenthesisKeyword_0());
            		
            // InternalFPML.g:2568:3: ( (lv_arg_1_0= ruleArgument ) )
            // InternalFPML.g:2569:4: (lv_arg_1_0= ruleArgument )
            {
            // InternalFPML.g:2569:4: (lv_arg_1_0= ruleArgument )
            // InternalFPML.g:2570:5: lv_arg_1_0= ruleArgument
            {

            					newCompositeNode(grammarAccess.getPureLambdaAccess().getArgArgumentParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
            lv_arg_1_0=ruleArgument();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPureLambdaRule());
            					}
            					set(
            						current,
            						"arg",
            						lv_arg_1_0,
            						"it.unibo.FPML.Argument");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getPureLambdaAccess().getRightParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getPureLambdaAccess().getColonKeyword_3());
            		
            // InternalFPML.g:2595:3: ( (lv_functionBody_4_0= ruleFunctionBodyPure ) )
            // InternalFPML.g:2596:4: (lv_functionBody_4_0= ruleFunctionBodyPure )
            {
            // InternalFPML.g:2596:4: (lv_functionBody_4_0= ruleFunctionBodyPure )
            // InternalFPML.g:2597:5: lv_functionBody_4_0= ruleFunctionBodyPure
            {

            					newCompositeNode(grammarAccess.getPureLambdaAccess().getFunctionBodyFunctionBodyPureParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_functionBody_4_0=ruleFunctionBodyPure();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPureLambdaRule());
            					}
            					set(
            						current,
            						"functionBody",
            						lv_functionBody_4_0,
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


    // $ANTLR start "entryRuleEffectFullLambda"
    // InternalFPML.g:2618:1: entryRuleEffectFullLambda returns [EObject current=null] : iv_ruleEffectFullLambda= ruleEffectFullLambda EOF ;
    public final EObject entryRuleEffectFullLambda() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullLambda = null;


        try {
            // InternalFPML.g:2618:57: (iv_ruleEffectFullLambda= ruleEffectFullLambda EOF )
            // InternalFPML.g:2619:2: iv_ruleEffectFullLambda= ruleEffectFullLambda EOF
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
    // InternalFPML.g:2625:1: ruleEffectFullLambda returns [EObject current=null] : (otherlv_0= '(' ( (lv_arg_1_0= ruleEffectFullArgument ) ) otherlv_2= ')' otherlv_3= ':' ( (lv_functionBody_4_0= ruleFunctionBodyEffectFull ) ) ) ;
    public final EObject ruleEffectFullLambda() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_arg_1_0 = null;

        EObject lv_functionBody_4_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:2631:2: ( (otherlv_0= '(' ( (lv_arg_1_0= ruleEffectFullArgument ) ) otherlv_2= ')' otherlv_3= ':' ( (lv_functionBody_4_0= ruleFunctionBodyEffectFull ) ) ) )
            // InternalFPML.g:2632:2: (otherlv_0= '(' ( (lv_arg_1_0= ruleEffectFullArgument ) ) otherlv_2= ')' otherlv_3= ':' ( (lv_functionBody_4_0= ruleFunctionBodyEffectFull ) ) )
            {
            // InternalFPML.g:2632:2: (otherlv_0= '(' ( (lv_arg_1_0= ruleEffectFullArgument ) ) otherlv_2= ')' otherlv_3= ':' ( (lv_functionBody_4_0= ruleFunctionBodyEffectFull ) ) )
            // InternalFPML.g:2633:3: otherlv_0= '(' ( (lv_arg_1_0= ruleEffectFullArgument ) ) otherlv_2= ')' otherlv_3= ':' ( (lv_functionBody_4_0= ruleFunctionBodyEffectFull ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getEffectFullLambdaAccess().getLeftParenthesisKeyword_0());
            		
            // InternalFPML.g:2637:3: ( (lv_arg_1_0= ruleEffectFullArgument ) )
            // InternalFPML.g:2638:4: (lv_arg_1_0= ruleEffectFullArgument )
            {
            // InternalFPML.g:2638:4: (lv_arg_1_0= ruleEffectFullArgument )
            // InternalFPML.g:2639:5: lv_arg_1_0= ruleEffectFullArgument
            {

            					newCompositeNode(grammarAccess.getEffectFullLambdaAccess().getArgEffectFullArgumentParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
            lv_arg_1_0=ruleEffectFullArgument();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEffectFullLambdaRule());
            					}
            					set(
            						current,
            						"arg",
            						lv_arg_1_0,
            						"it.unibo.FPML.EffectFullArgument");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getEffectFullLambdaAccess().getRightParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getEffectFullLambdaAccess().getColonKeyword_3());
            		
            // InternalFPML.g:2664:3: ( (lv_functionBody_4_0= ruleFunctionBodyEffectFull ) )
            // InternalFPML.g:2665:4: (lv_functionBody_4_0= ruleFunctionBodyEffectFull )
            {
            // InternalFPML.g:2665:4: (lv_functionBody_4_0= ruleFunctionBodyEffectFull )
            // InternalFPML.g:2666:5: lv_functionBody_4_0= ruleFunctionBodyEffectFull
            {

            					newCompositeNode(grammarAccess.getEffectFullLambdaAccess().getFunctionBodyFunctionBodyEffectFullParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_functionBody_4_0=ruleFunctionBodyEffectFull();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEffectFullLambdaRule());
            					}
            					set(
            						current,
            						"functionBody",
            						lv_functionBody_4_0,
            						"it.unibo.FPML.FunctionBodyEffectFull");
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
    // $ANTLR end "ruleEffectFullLambda"


    // $ANTLR start "entryRuleAdtValue"
    // InternalFPML.g:2687:1: entryRuleAdtValue returns [EObject current=null] : iv_ruleAdtValue= ruleAdtValue EOF ;
    public final EObject entryRuleAdtValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdtValue = null;


        try {
            // InternalFPML.g:2687:49: (iv_ruleAdtValue= ruleAdtValue EOF )
            // InternalFPML.g:2688:2: iv_ruleAdtValue= ruleAdtValue EOF
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
    // InternalFPML.g:2694:1: ruleAdtValue returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_ValueRef_2= ruleValueRef | this_DataValue_3= ruleDataValue | this_SumValue_4= ruleSumValue | this_FunctionValue_5= ruleFunctionValue | this_ProdValue_6= ruleProdValue ) ;
    public final EObject ruleAdtValue() throws RecognitionException {
        EObject current = null;

        EObject this_IntValue_0 = null;

        EObject this_StringValue_1 = null;

        EObject this_ValueRef_2 = null;

        EObject this_DataValue_3 = null;

        EObject this_SumValue_4 = null;

        EObject this_FunctionValue_5 = null;

        EObject this_ProdValue_6 = null;



        	enterRule();

        try {
            // InternalFPML.g:2700:2: ( (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_ValueRef_2= ruleValueRef | this_DataValue_3= ruleDataValue | this_SumValue_4= ruleSumValue | this_FunctionValue_5= ruleFunctionValue | this_ProdValue_6= ruleProdValue ) )
            // InternalFPML.g:2701:2: (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_ValueRef_2= ruleValueRef | this_DataValue_3= ruleDataValue | this_SumValue_4= ruleSumValue | this_FunctionValue_5= ruleFunctionValue | this_ProdValue_6= ruleProdValue )
            {
            // InternalFPML.g:2701:2: (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_ValueRef_2= ruleValueRef | this_DataValue_3= ruleDataValue | this_SumValue_4= ruleSumValue | this_FunctionValue_5= ruleFunctionValue | this_ProdValue_6= ruleProdValue )
            int alt25=7;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // InternalFPML.g:2702:3: this_IntValue_0= ruleIntValue
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
                    // InternalFPML.g:2711:3: this_StringValue_1= ruleStringValue
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
                    // InternalFPML.g:2720:3: this_ValueRef_2= ruleValueRef
                    {

                    			newCompositeNode(grammarAccess.getAdtValueAccess().getValueRefParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ValueRef_2=ruleValueRef();

                    state._fsp--;


                    			current = this_ValueRef_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalFPML.g:2729:3: this_DataValue_3= ruleDataValue
                    {

                    			newCompositeNode(grammarAccess.getAdtValueAccess().getDataValueParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataValue_3=ruleDataValue();

                    state._fsp--;


                    			current = this_DataValue_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalFPML.g:2738:3: this_SumValue_4= ruleSumValue
                    {

                    			newCompositeNode(grammarAccess.getAdtValueAccess().getSumValueParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_SumValue_4=ruleSumValue();

                    state._fsp--;


                    			current = this_SumValue_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalFPML.g:2747:3: this_FunctionValue_5= ruleFunctionValue
                    {

                    			newCompositeNode(grammarAccess.getAdtValueAccess().getFunctionValueParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_FunctionValue_5=ruleFunctionValue();

                    state._fsp--;


                    			current = this_FunctionValue_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalFPML.g:2756:3: this_ProdValue_6= ruleProdValue
                    {

                    			newCompositeNode(grammarAccess.getAdtValueAccess().getProdValueParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProdValue_6=ruleProdValue();

                    state._fsp--;


                    			current = this_ProdValue_6;
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
    // $ANTLR end "ruleAdtValue"


    // $ANTLR start "entryRuleProdValue"
    // InternalFPML.g:2768:1: entryRuleProdValue returns [EObject current=null] : iv_ruleProdValue= ruleProdValue EOF ;
    public final EObject entryRuleProdValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProdValue = null;


        try {
            // InternalFPML.g:2768:50: (iv_ruleProdValue= ruleProdValue EOF )
            // InternalFPML.g:2769:2: iv_ruleProdValue= ruleProdValue EOF
            {
             newCompositeNode(grammarAccess.getProdValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProdValue=ruleProdValue();

            state._fsp--;

             current =iv_ruleProdValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProdValue"


    // $ANTLR start "ruleProdValue"
    // InternalFPML.g:2775:1: ruleProdValue returns [EObject current=null] : (otherlv_0= '(' ( (lv_prodAdtElement1_1_0= ruleAdtValue ) ) otherlv_2= ',' ( (lv_prodAdtElement2_3_0= ruleAdtValue ) ) otherlv_4= ')' ) ;
    public final EObject ruleProdValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_prodAdtElement1_1_0 = null;

        EObject lv_prodAdtElement2_3_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:2781:2: ( (otherlv_0= '(' ( (lv_prodAdtElement1_1_0= ruleAdtValue ) ) otherlv_2= ',' ( (lv_prodAdtElement2_3_0= ruleAdtValue ) ) otherlv_4= ')' ) )
            // InternalFPML.g:2782:2: (otherlv_0= '(' ( (lv_prodAdtElement1_1_0= ruleAdtValue ) ) otherlv_2= ',' ( (lv_prodAdtElement2_3_0= ruleAdtValue ) ) otherlv_4= ')' )
            {
            // InternalFPML.g:2782:2: (otherlv_0= '(' ( (lv_prodAdtElement1_1_0= ruleAdtValue ) ) otherlv_2= ',' ( (lv_prodAdtElement2_3_0= ruleAdtValue ) ) otherlv_4= ')' )
            // InternalFPML.g:2783:3: otherlv_0= '(' ( (lv_prodAdtElement1_1_0= ruleAdtValue ) ) otherlv_2= ',' ( (lv_prodAdtElement2_3_0= ruleAdtValue ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_35); 

            			newLeafNode(otherlv_0, grammarAccess.getProdValueAccess().getLeftParenthesisKeyword_0());
            		
            // InternalFPML.g:2787:3: ( (lv_prodAdtElement1_1_0= ruleAdtValue ) )
            // InternalFPML.g:2788:4: (lv_prodAdtElement1_1_0= ruleAdtValue )
            {
            // InternalFPML.g:2788:4: (lv_prodAdtElement1_1_0= ruleAdtValue )
            // InternalFPML.g:2789:5: lv_prodAdtElement1_1_0= ruleAdtValue
            {

            					newCompositeNode(grammarAccess.getProdValueAccess().getProdAdtElement1AdtValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_33);
            lv_prodAdtElement1_1_0=ruleAdtValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProdValueRule());
            					}
            					set(
            						current,
            						"prodAdtElement1",
            						lv_prodAdtElement1_1_0,
            						"it.unibo.FPML.AdtValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,38,FOLLOW_35); 

            			newLeafNode(otherlv_2, grammarAccess.getProdValueAccess().getCommaKeyword_2());
            		
            // InternalFPML.g:2810:3: ( (lv_prodAdtElement2_3_0= ruleAdtValue ) )
            // InternalFPML.g:2811:4: (lv_prodAdtElement2_3_0= ruleAdtValue )
            {
            // InternalFPML.g:2811:4: (lv_prodAdtElement2_3_0= ruleAdtValue )
            // InternalFPML.g:2812:5: lv_prodAdtElement2_3_0= ruleAdtValue
            {

            					newCompositeNode(grammarAccess.getProdValueAccess().getProdAdtElement2AdtValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_20);
            lv_prodAdtElement2_3_0=ruleAdtValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProdValueRule());
            					}
            					set(
            						current,
            						"prodAdtElement2",
            						lv_prodAdtElement2_3_0,
            						"it.unibo.FPML.AdtValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getProdValueAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProdValue"


    // $ANTLR start "entryRuleSumValue"
    // InternalFPML.g:2837:1: entryRuleSumValue returns [EObject current=null] : iv_ruleSumValue= ruleSumValue EOF ;
    public final EObject entryRuleSumValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumValue = null;


        try {
            // InternalFPML.g:2837:49: (iv_ruleSumValue= ruleSumValue EOF )
            // InternalFPML.g:2838:2: iv_ruleSumValue= ruleSumValue EOF
            {
             newCompositeNode(grammarAccess.getSumValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSumValue=ruleSumValue();

            state._fsp--;

             current =iv_ruleSumValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSumValue"


    // $ANTLR start "ruleSumValue"
    // InternalFPML.g:2844:1: ruleSumValue returns [EObject current=null] : ( (otherlv_0= 'Left' otherlv_1= '(' ( (lv_sumAdtElement1_2_0= ruleAdtValue ) ) otherlv_3= ')' ) | (otherlv_4= 'Right' otherlv_5= '(' ( (lv_sumAdtElement2_6_0= ruleAdtValue ) ) otherlv_7= ')' ) ) ;
    public final EObject ruleSumValue() throws RecognitionException {
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
            // InternalFPML.g:2850:2: ( ( (otherlv_0= 'Left' otherlv_1= '(' ( (lv_sumAdtElement1_2_0= ruleAdtValue ) ) otherlv_3= ')' ) | (otherlv_4= 'Right' otherlv_5= '(' ( (lv_sumAdtElement2_6_0= ruleAdtValue ) ) otherlv_7= ')' ) ) )
            // InternalFPML.g:2851:2: ( (otherlv_0= 'Left' otherlv_1= '(' ( (lv_sumAdtElement1_2_0= ruleAdtValue ) ) otherlv_3= ')' ) | (otherlv_4= 'Right' otherlv_5= '(' ( (lv_sumAdtElement2_6_0= ruleAdtValue ) ) otherlv_7= ')' ) )
            {
            // InternalFPML.g:2851:2: ( (otherlv_0= 'Left' otherlv_1= '(' ( (lv_sumAdtElement1_2_0= ruleAdtValue ) ) otherlv_3= ')' ) | (otherlv_4= 'Right' otherlv_5= '(' ( (lv_sumAdtElement2_6_0= ruleAdtValue ) ) otherlv_7= ')' ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==42) ) {
                alt26=1;
            }
            else if ( (LA26_0==43) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalFPML.g:2852:3: (otherlv_0= 'Left' otherlv_1= '(' ( (lv_sumAdtElement1_2_0= ruleAdtValue ) ) otherlv_3= ')' )
                    {
                    // InternalFPML.g:2852:3: (otherlv_0= 'Left' otherlv_1= '(' ( (lv_sumAdtElement1_2_0= ruleAdtValue ) ) otherlv_3= ')' )
                    // InternalFPML.g:2853:4: otherlv_0= 'Left' otherlv_1= '(' ( (lv_sumAdtElement1_2_0= ruleAdtValue ) ) otherlv_3= ')'
                    {
                    otherlv_0=(Token)match(input,42,FOLLOW_19); 

                    				newLeafNode(otherlv_0, grammarAccess.getSumValueAccess().getLeftKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,24,FOLLOW_35); 

                    				newLeafNode(otherlv_1, grammarAccess.getSumValueAccess().getLeftParenthesisKeyword_0_1());
                    			
                    // InternalFPML.g:2861:4: ( (lv_sumAdtElement1_2_0= ruleAdtValue ) )
                    // InternalFPML.g:2862:5: (lv_sumAdtElement1_2_0= ruleAdtValue )
                    {
                    // InternalFPML.g:2862:5: (lv_sumAdtElement1_2_0= ruleAdtValue )
                    // InternalFPML.g:2863:6: lv_sumAdtElement1_2_0= ruleAdtValue
                    {

                    						newCompositeNode(grammarAccess.getSumValueAccess().getSumAdtElement1AdtValueParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_sumAdtElement1_2_0=ruleAdtValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSumValueRule());
                    						}
                    						set(
                    							current,
                    							"sumAdtElement1",
                    							lv_sumAdtElement1_2_0,
                    							"it.unibo.FPML.AdtValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getSumValueAccess().getRightParenthesisKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFPML.g:2886:3: (otherlv_4= 'Right' otherlv_5= '(' ( (lv_sumAdtElement2_6_0= ruleAdtValue ) ) otherlv_7= ')' )
                    {
                    // InternalFPML.g:2886:3: (otherlv_4= 'Right' otherlv_5= '(' ( (lv_sumAdtElement2_6_0= ruleAdtValue ) ) otherlv_7= ')' )
                    // InternalFPML.g:2887:4: otherlv_4= 'Right' otherlv_5= '(' ( (lv_sumAdtElement2_6_0= ruleAdtValue ) ) otherlv_7= ')'
                    {
                    otherlv_4=(Token)match(input,43,FOLLOW_19); 

                    				newLeafNode(otherlv_4, grammarAccess.getSumValueAccess().getRightKeyword_1_0());
                    			
                    otherlv_5=(Token)match(input,24,FOLLOW_35); 

                    				newLeafNode(otherlv_5, grammarAccess.getSumValueAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalFPML.g:2895:4: ( (lv_sumAdtElement2_6_0= ruleAdtValue ) )
                    // InternalFPML.g:2896:5: (lv_sumAdtElement2_6_0= ruleAdtValue )
                    {
                    // InternalFPML.g:2896:5: (lv_sumAdtElement2_6_0= ruleAdtValue )
                    // InternalFPML.g:2897:6: lv_sumAdtElement2_6_0= ruleAdtValue
                    {

                    						newCompositeNode(grammarAccess.getSumValueAccess().getSumAdtElement2AdtValueParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_sumAdtElement2_6_0=ruleAdtValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSumValueRule());
                    						}
                    						set(
                    							current,
                    							"sumAdtElement2",
                    							lv_sumAdtElement2_6_0,
                    							"it.unibo.FPML.AdtValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getSumValueAccess().getRightParenthesisKeyword_1_3());
                    			

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
    // $ANTLR end "ruleSumValue"


    // $ANTLR start "entryRulePrimitivePureFunction"
    // InternalFPML.g:2923:1: entryRulePrimitivePureFunction returns [EObject current=null] : iv_rulePrimitivePureFunction= rulePrimitivePureFunction EOF ;
    public final EObject entryRulePrimitivePureFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitivePureFunction = null;


        try {
            // InternalFPML.g:2923:62: (iv_rulePrimitivePureFunction= rulePrimitivePureFunction EOF )
            // InternalFPML.g:2924:2: iv_rulePrimitivePureFunction= rulePrimitivePureFunction EOF
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
    // InternalFPML.g:2930:1: rulePrimitivePureFunction returns [EObject current=null] : (this_IntToString_0= ruleIntToString | this_IntPow_1= ruleIntPow | this_Plus_2= rulePlus | this_Minus_3= ruleMinus | this_Times_4= ruleTimes | this_Mod_5= ruleMod | this_Apply_6= ruleApply ) ;
    public final EObject rulePrimitivePureFunction() throws RecognitionException {
        EObject current = null;

        EObject this_IntToString_0 = null;

        EObject this_IntPow_1 = null;

        EObject this_Plus_2 = null;

        EObject this_Minus_3 = null;

        EObject this_Times_4 = null;

        EObject this_Mod_5 = null;

        EObject this_Apply_6 = null;



        	enterRule();

        try {
            // InternalFPML.g:2936:2: ( (this_IntToString_0= ruleIntToString | this_IntPow_1= ruleIntPow | this_Plus_2= rulePlus | this_Minus_3= ruleMinus | this_Times_4= ruleTimes | this_Mod_5= ruleMod | this_Apply_6= ruleApply ) )
            // InternalFPML.g:2937:2: (this_IntToString_0= ruleIntToString | this_IntPow_1= ruleIntPow | this_Plus_2= rulePlus | this_Minus_3= ruleMinus | this_Times_4= ruleTimes | this_Mod_5= ruleMod | this_Apply_6= ruleApply )
            {
            // InternalFPML.g:2937:2: (this_IntToString_0= ruleIntToString | this_IntPow_1= ruleIntPow | this_Plus_2= rulePlus | this_Minus_3= ruleMinus | this_Times_4= ruleTimes | this_Mod_5= ruleMod | this_Apply_6= ruleApply )
            int alt27=7;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt27=1;
                }
                break;
            case 45:
                {
                alt27=2;
                }
                break;
            case 21:
                {
                alt27=3;
                }
                break;
            case 46:
                {
                alt27=4;
                }
                break;
            case 22:
                {
                alt27=5;
                }
                break;
            case 47:
                {
                alt27=6;
                }
                break;
            case 48:
                {
                alt27=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalFPML.g:2938:3: this_IntToString_0= ruleIntToString
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
                    // InternalFPML.g:2947:3: this_IntPow_1= ruleIntPow
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
                    // InternalFPML.g:2956:3: this_Plus_2= rulePlus
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
                    // InternalFPML.g:2965:3: this_Minus_3= ruleMinus
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
                    // InternalFPML.g:2974:3: this_Times_4= ruleTimes
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
                    // InternalFPML.g:2983:3: this_Mod_5= ruleMod
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
                    // InternalFPML.g:2992:3: this_Apply_6= ruleApply
                    {

                    			newCompositeNode(grammarAccess.getPrimitivePureFunctionAccess().getApplyParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Apply_6=ruleApply();

                    state._fsp--;


                    			current = this_Apply_6;
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
    // InternalFPML.g:3004:1: entryRuleIntToString returns [EObject current=null] : iv_ruleIntToString= ruleIntToString EOF ;
    public final EObject entryRuleIntToString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntToString = null;


        try {
            // InternalFPML.g:3004:52: (iv_ruleIntToString= ruleIntToString EOF )
            // InternalFPML.g:3005:2: iv_ruleIntToString= ruleIntToString EOF
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
    // InternalFPML.g:3011:1: ruleIntToString returns [EObject current=null] : ( () otherlv_1= 'IntToString' ) ;
    public final EObject ruleIntToString() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFPML.g:3017:2: ( ( () otherlv_1= 'IntToString' ) )
            // InternalFPML.g:3018:2: ( () otherlv_1= 'IntToString' )
            {
            // InternalFPML.g:3018:2: ( () otherlv_1= 'IntToString' )
            // InternalFPML.g:3019:3: () otherlv_1= 'IntToString'
            {
            // InternalFPML.g:3019:3: ()
            // InternalFPML.g:3020:4: 
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
    // InternalFPML.g:3034:1: entryRuleIntPow returns [EObject current=null] : iv_ruleIntPow= ruleIntPow EOF ;
    public final EObject entryRuleIntPow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntPow = null;


        try {
            // InternalFPML.g:3034:47: (iv_ruleIntPow= ruleIntPow EOF )
            // InternalFPML.g:3035:2: iv_ruleIntPow= ruleIntPow EOF
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
    // InternalFPML.g:3041:1: ruleIntPow returns [EObject current=null] : ( () otherlv_1= 'IntPow' ) ;
    public final EObject ruleIntPow() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFPML.g:3047:2: ( ( () otherlv_1= 'IntPow' ) )
            // InternalFPML.g:3048:2: ( () otherlv_1= 'IntPow' )
            {
            // InternalFPML.g:3048:2: ( () otherlv_1= 'IntPow' )
            // InternalFPML.g:3049:3: () otherlv_1= 'IntPow'
            {
            // InternalFPML.g:3049:3: ()
            // InternalFPML.g:3050:4: 
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
    // InternalFPML.g:3064:1: entryRulePlus returns [EObject current=null] : iv_rulePlus= rulePlus EOF ;
    public final EObject entryRulePlus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlus = null;


        try {
            // InternalFPML.g:3064:45: (iv_rulePlus= rulePlus EOF )
            // InternalFPML.g:3065:2: iv_rulePlus= rulePlus EOF
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
    // InternalFPML.g:3071:1: rulePlus returns [EObject current=null] : ( () otherlv_1= '+' ) ;
    public final EObject rulePlus() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFPML.g:3077:2: ( ( () otherlv_1= '+' ) )
            // InternalFPML.g:3078:2: ( () otherlv_1= '+' )
            {
            // InternalFPML.g:3078:2: ( () otherlv_1= '+' )
            // InternalFPML.g:3079:3: () otherlv_1= '+'
            {
            // InternalFPML.g:3079:3: ()
            // InternalFPML.g:3080:4: 
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
    // InternalFPML.g:3094:1: entryRuleMinus returns [EObject current=null] : iv_ruleMinus= ruleMinus EOF ;
    public final EObject entryRuleMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinus = null;


        try {
            // InternalFPML.g:3094:46: (iv_ruleMinus= ruleMinus EOF )
            // InternalFPML.g:3095:2: iv_ruleMinus= ruleMinus EOF
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
    // InternalFPML.g:3101:1: ruleMinus returns [EObject current=null] : ( () otherlv_1= '-' ) ;
    public final EObject ruleMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFPML.g:3107:2: ( ( () otherlv_1= '-' ) )
            // InternalFPML.g:3108:2: ( () otherlv_1= '-' )
            {
            // InternalFPML.g:3108:2: ( () otherlv_1= '-' )
            // InternalFPML.g:3109:3: () otherlv_1= '-'
            {
            // InternalFPML.g:3109:3: ()
            // InternalFPML.g:3110:4: 
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
    // InternalFPML.g:3124:1: entryRuleTimes returns [EObject current=null] : iv_ruleTimes= ruleTimes EOF ;
    public final EObject entryRuleTimes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimes = null;


        try {
            // InternalFPML.g:3124:46: (iv_ruleTimes= ruleTimes EOF )
            // InternalFPML.g:3125:2: iv_ruleTimes= ruleTimes EOF
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
    // InternalFPML.g:3131:1: ruleTimes returns [EObject current=null] : ( () otherlv_1= '*' ) ;
    public final EObject ruleTimes() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFPML.g:3137:2: ( ( () otherlv_1= '*' ) )
            // InternalFPML.g:3138:2: ( () otherlv_1= '*' )
            {
            // InternalFPML.g:3138:2: ( () otherlv_1= '*' )
            // InternalFPML.g:3139:3: () otherlv_1= '*'
            {
            // InternalFPML.g:3139:3: ()
            // InternalFPML.g:3140:4: 
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
    // InternalFPML.g:3154:1: entryRuleMod returns [EObject current=null] : iv_ruleMod= ruleMod EOF ;
    public final EObject entryRuleMod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMod = null;


        try {
            // InternalFPML.g:3154:44: (iv_ruleMod= ruleMod EOF )
            // InternalFPML.g:3155:2: iv_ruleMod= ruleMod EOF
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
    // InternalFPML.g:3161:1: ruleMod returns [EObject current=null] : ( () otherlv_1= 'mod' ) ;
    public final EObject ruleMod() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFPML.g:3167:2: ( ( () otherlv_1= 'mod' ) )
            // InternalFPML.g:3168:2: ( () otherlv_1= 'mod' )
            {
            // InternalFPML.g:3168:2: ( () otherlv_1= 'mod' )
            // InternalFPML.g:3169:3: () otherlv_1= 'mod'
            {
            // InternalFPML.g:3169:3: ()
            // InternalFPML.g:3170:4: 
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


    // $ANTLR start "entryRuleApply"
    // InternalFPML.g:3184:1: entryRuleApply returns [EObject current=null] : iv_ruleApply= ruleApply EOF ;
    public final EObject entryRuleApply() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApply = null;


        try {
            // InternalFPML.g:3184:46: (iv_ruleApply= ruleApply EOF )
            // InternalFPML.g:3185:2: iv_ruleApply= ruleApply EOF
            {
             newCompositeNode(grammarAccess.getApplyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleApply=ruleApply();

            state._fsp--;

             current =iv_ruleApply; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleApply"


    // $ANTLR start "ruleApply"
    // InternalFPML.g:3191:1: ruleApply returns [EObject current=null] : ( () otherlv_1= 'apply' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleApply() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalFPML.g:3197:2: ( ( () otherlv_1= 'apply' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalFPML.g:3198:2: ( () otherlv_1= 'apply' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalFPML.g:3198:2: ( () otherlv_1= 'apply' ( (otherlv_2= RULE_ID ) ) )
            // InternalFPML.g:3199:3: () otherlv_1= 'apply' ( (otherlv_2= RULE_ID ) )
            {
            // InternalFPML.g:3199:3: ()
            // InternalFPML.g:3200:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getApplyAccess().getApplyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,48,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getApplyAccess().getApplyKeyword_1());
            		
            // InternalFPML.g:3210:3: ( (otherlv_2= RULE_ID ) )
            // InternalFPML.g:3211:4: (otherlv_2= RULE_ID )
            {
            // InternalFPML.g:3211:4: (otherlv_2= RULE_ID )
            // InternalFPML.g:3212:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getApplyRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getApplyAccess().getValueValueCrossReference_2_0());
            				

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
    // $ANTLR end "ruleApply"


    // $ANTLR start "entryRulePrimitiveEffectFullFunction"
    // InternalFPML.g:3227:1: entryRulePrimitiveEffectFullFunction returns [EObject current=null] : iv_rulePrimitiveEffectFullFunction= rulePrimitiveEffectFullFunction EOF ;
    public final EObject entryRulePrimitiveEffectFullFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveEffectFullFunction = null;


        try {
            // InternalFPML.g:3227:68: (iv_rulePrimitiveEffectFullFunction= rulePrimitiveEffectFullFunction EOF )
            // InternalFPML.g:3228:2: iv_rulePrimitiveEffectFullFunction= rulePrimitiveEffectFullFunction EOF
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
    // InternalFPML.g:3234:1: rulePrimitiveEffectFullFunction returns [EObject current=null] : this_PrimitivePrint_0= rulePrimitivePrint ;
    public final EObject rulePrimitiveEffectFullFunction() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitivePrint_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:3240:2: (this_PrimitivePrint_0= rulePrimitivePrint )
            // InternalFPML.g:3241:2: this_PrimitivePrint_0= rulePrimitivePrint
            {

            		newCompositeNode(grammarAccess.getPrimitiveEffectFullFunctionAccess().getPrimitivePrintParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_PrimitivePrint_0=rulePrimitivePrint();

            state._fsp--;


            		current = this_PrimitivePrint_0;
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
    // $ANTLR end "rulePrimitiveEffectFullFunction"


    // $ANTLR start "entryRulePrimitivePrint"
    // InternalFPML.g:3252:1: entryRulePrimitivePrint returns [EObject current=null] : iv_rulePrimitivePrint= rulePrimitivePrint EOF ;
    public final EObject entryRulePrimitivePrint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitivePrint = null;


        try {
            // InternalFPML.g:3252:55: (iv_rulePrimitivePrint= rulePrimitivePrint EOF )
            // InternalFPML.g:3253:2: iv_rulePrimitivePrint= rulePrimitivePrint EOF
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
    // InternalFPML.g:3259:1: rulePrimitivePrint returns [EObject current=null] : ( () otherlv_1= 'print' ) ;
    public final EObject rulePrimitivePrint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFPML.g:3265:2: ( ( () otherlv_1= 'print' ) )
            // InternalFPML.g:3266:2: ( () otherlv_1= 'print' )
            {
            // InternalFPML.g:3266:2: ( () otherlv_1= 'print' )
            // InternalFPML.g:3267:3: () otherlv_1= 'print'
            {
            // InternalFPML.g:3267:3: ()
            // InternalFPML.g:3268:4: 
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

    // Delegated rules


    protected DFA25 dfa25 = new DFA25(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\3\uffff\1\6\6\uffff";
    static final String dfa_3s = "\1\4\2\uffff\1\30\1\uffff\1\4\4\uffff";
    static final String dfa_4s = "\1\53\2\uffff\1\46\1\uffff\1\53\4\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\2\1\uffff\1\5\1\uffff\1\3\1\4\1\7\1\6";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\3\1\1\1\2\21\uffff\1\5\21\uffff\2\4",
            "",
            "",
            "\1\7\1\6\14\uffff\1\6",
            "",
            "\3\10\21\uffff\1\10\7\uffff\2\11\1\uffff\2\11\5\uffff\2\10",
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

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "2701:2: (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_ValueRef_2= ruleValueRef | this_DataValue_3= ruleDataValue | this_SumValue_4= ruleSumValue | this_FunctionValue_5= ruleFunctionValue | this_ProdValue_6= ruleProdValue )";
        }
    }
 

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
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000001B00080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000020001000070L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000001B00000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0001F00010600010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000011F00000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0002000010000010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000000A0000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0003F00010600010L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00000E0001000070L});

}