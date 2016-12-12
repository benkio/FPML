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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_BOOLEAN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Pure'", "'{'", "'}'", "'Functions'", "'Data'", "'Value'", "'Effects'", "':'", "'def'", "'('", "','", "')'", "'IO'", "'main'", "'Undefined'", "'|>'", "'>>='", "'int'", "'String'", "'boolean'", "'Unit'", "'ref'", "'refIO'", "'F'", "'<'", "'>'", "'FIO'", "'['", "']'", "'+'", "'*'", "'IOF'", "'()'", "'EffectFullRef'", "'\\\\'", "'->'", "'PureRef'", "'Left'", "'Right'", "'intToString'", "'intPow'", "'-'", "'mod'", "'leftADT'", "'rightADT'", "'applyF'", "'=='", "'<='", "'>='", "'&&'", "'||'", "'extract'", "'isLeft'", "'isRight'", "'if'", "'then'", "'else'", "'print'", "'randomInt'", "'return'", "'currentTime'", "'applyFIO'", "'extractEffectFull'", "'Lift'"
    };
    public static final int T__50=50;
    public static final int RULE_BOOLEAN=7;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
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
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=8;
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
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
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
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
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
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPureBlockAccess().getPureKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_5); 

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

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

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
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPureFunctionBlockAccess().getFunctionsKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getPureFunctionBlockAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalFPML.g:213:3: ( (lv_features_2_0= rulePureFunctionDefinition ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==20) ) {
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

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

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
            otherlv_0=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPureDataBlockAccess().getDataKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_9); 

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

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

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
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPureValueBlockAccess().getValueKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_10); 

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

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

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
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEffectFullBlockAccess().getEffectsKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_5); 

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

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

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
            otherlv_0=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEffectFullDataBlockAccess().getDataKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_9); 

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

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

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
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEffectFullValueBlockAccess().getValueKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_10); 

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

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

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
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEffectFullFunctionBlockAccess().getFunctionsKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getEffectFullFunctionBlockAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalFPML.g:570:3: ( (lv_features_2_0= ruleEffectFullFunctionDefinition ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==20) ) {
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

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

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

            otherlv_1=(Token)match(input,19,FOLLOW_13); 

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

            otherlv_2=(Token)match(input,19,FOLLOW_14); 

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

            otherlv_1=(Token)match(input,19,FOLLOW_15); 

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

            otherlv_2=(Token)match(input,19,FOLLOW_16); 

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
    // InternalFPML.g:877:1: rulePureFunctionDefinition returns [EObject current=null] : (otherlv_0= 'def' ( (lv_returnType_1_0= ruleValueType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_arg_4_0= rulePureArgument ) ) (otherlv_5= ',' ( (lv_higherOrderArg_6_0= ruleAdditionalPureArgument ) ) )? otherlv_7= ')' otherlv_8= ':' otherlv_9= '{' ( (lv_functionBody_10_0= ruleFunctionBodyPure ) ) otherlv_11= '}' ) ;
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
            // InternalFPML.g:883:2: ( (otherlv_0= 'def' ( (lv_returnType_1_0= ruleValueType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_arg_4_0= rulePureArgument ) ) (otherlv_5= ',' ( (lv_higherOrderArg_6_0= ruleAdditionalPureArgument ) ) )? otherlv_7= ')' otherlv_8= ':' otherlv_9= '{' ( (lv_functionBody_10_0= ruleFunctionBodyPure ) ) otherlv_11= '}' ) )
            // InternalFPML.g:884:2: (otherlv_0= 'def' ( (lv_returnType_1_0= ruleValueType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_arg_4_0= rulePureArgument ) ) (otherlv_5= ',' ( (lv_higherOrderArg_6_0= ruleAdditionalPureArgument ) ) )? otherlv_7= ')' otherlv_8= ':' otherlv_9= '{' ( (lv_functionBody_10_0= ruleFunctionBodyPure ) ) otherlv_11= '}' )
            {
            // InternalFPML.g:884:2: (otherlv_0= 'def' ( (lv_returnType_1_0= ruleValueType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_arg_4_0= rulePureArgument ) ) (otherlv_5= ',' ( (lv_higherOrderArg_6_0= ruleAdditionalPureArgument ) ) )? otherlv_7= ')' otherlv_8= ':' otherlv_9= '{' ( (lv_functionBody_10_0= ruleFunctionBodyPure ) ) otherlv_11= '}' )
            // InternalFPML.g:885:3: otherlv_0= 'def' ( (lv_returnType_1_0= ruleValueType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_arg_4_0= rulePureArgument ) ) (otherlv_5= ',' ( (lv_higherOrderArg_6_0= ruleAdditionalPureArgument ) ) )? otherlv_7= ')' otherlv_8= ':' otherlv_9= '{' ( (lv_functionBody_10_0= ruleFunctionBodyPure ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_13); 

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

            otherlv_3=(Token)match(input,21,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getPureFunctionDefinitionAccess().getLeftParenthesisKeyword_3());
            		
            // InternalFPML.g:930:3: ( (lv_arg_4_0= rulePureArgument ) )
            // InternalFPML.g:931:4: (lv_arg_4_0= rulePureArgument )
            {
            // InternalFPML.g:931:4: (lv_arg_4_0= rulePureArgument )
            // InternalFPML.g:932:5: lv_arg_4_0= rulePureArgument
            {

            					newCompositeNode(grammarAccess.getPureFunctionDefinitionAccess().getArgPureArgumentParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_19);
            lv_arg_4_0=rulePureArgument();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPureFunctionDefinitionRule());
            					}
            					set(
            						current,
            						"arg",
            						lv_arg_4_0,
            						"it.unibo.FPML.PureArgument");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFPML.g:949:3: (otherlv_5= ',' ( (lv_higherOrderArg_6_0= ruleAdditionalPureArgument ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalFPML.g:950:4: otherlv_5= ',' ( (lv_higherOrderArg_6_0= ruleAdditionalPureArgument ) )
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_13); 

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

            otherlv_7=(Token)match(input,23,FOLLOW_12); 

            			newLeafNode(otherlv_7, grammarAccess.getPureFunctionDefinitionAccess().getRightParenthesisKeyword_6());
            		
            otherlv_8=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_8, grammarAccess.getPureFunctionDefinitionAccess().getColonKeyword_7());
            		
            otherlv_9=(Token)match(input,13,FOLLOW_21); 

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

            otherlv_11=(Token)match(input,14,FOLLOW_2); 

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
    // InternalFPML.g:1020:1: ruleEffectFullFunctionDefinition returns [EObject current=null] : (otherlv_0= 'def' ( (lv_returnType_1_0= ruleIOType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_arg_4_0= ruleArgument ) ) (otherlv_5= ',' ( (lv_higherOrderArg_6_0= ruleAdditionalEffectFullArgument ) ) )? otherlv_7= ')' otherlv_8= ':' otherlv_9= '{' ( (lv_functionBody_10_0= ruleFunctionBodyEffectFull ) ) otherlv_11= '}' ) ;
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
            // InternalFPML.g:1026:2: ( (otherlv_0= 'def' ( (lv_returnType_1_0= ruleIOType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_arg_4_0= ruleArgument ) ) (otherlv_5= ',' ( (lv_higherOrderArg_6_0= ruleAdditionalEffectFullArgument ) ) )? otherlv_7= ')' otherlv_8= ':' otherlv_9= '{' ( (lv_functionBody_10_0= ruleFunctionBodyEffectFull ) ) otherlv_11= '}' ) )
            // InternalFPML.g:1027:2: (otherlv_0= 'def' ( (lv_returnType_1_0= ruleIOType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_arg_4_0= ruleArgument ) ) (otherlv_5= ',' ( (lv_higherOrderArg_6_0= ruleAdditionalEffectFullArgument ) ) )? otherlv_7= ')' otherlv_8= ':' otherlv_9= '{' ( (lv_functionBody_10_0= ruleFunctionBodyEffectFull ) ) otherlv_11= '}' )
            {
            // InternalFPML.g:1027:2: (otherlv_0= 'def' ( (lv_returnType_1_0= ruleIOType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_arg_4_0= ruleArgument ) ) (otherlv_5= ',' ( (lv_higherOrderArg_6_0= ruleAdditionalEffectFullArgument ) ) )? otherlv_7= ')' otherlv_8= ':' otherlv_9= '{' ( (lv_functionBody_10_0= ruleFunctionBodyEffectFull ) ) otherlv_11= '}' )
            // InternalFPML.g:1028:3: otherlv_0= 'def' ( (lv_returnType_1_0= ruleIOType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_arg_4_0= ruleArgument ) ) (otherlv_5= ',' ( (lv_higherOrderArg_6_0= ruleAdditionalEffectFullArgument ) ) )? otherlv_7= ')' otherlv_8= ':' otherlv_9= '{' ( (lv_functionBody_10_0= ruleFunctionBodyEffectFull ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_22); 

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

            otherlv_3=(Token)match(input,21,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getEffectFullFunctionDefinitionAccess().getLeftParenthesisKeyword_3());
            		
            // InternalFPML.g:1073:3: ( (lv_arg_4_0= ruleArgument ) )
            // InternalFPML.g:1074:4: (lv_arg_4_0= ruleArgument )
            {
            // InternalFPML.g:1074:4: (lv_arg_4_0= ruleArgument )
            // InternalFPML.g:1075:5: lv_arg_4_0= ruleArgument
            {

            					newCompositeNode(grammarAccess.getEffectFullFunctionDefinitionAccess().getArgArgumentParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_19);
            lv_arg_4_0=ruleArgument();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEffectFullFunctionDefinitionRule());
            					}
            					set(
            						current,
            						"arg",
            						lv_arg_4_0,
            						"it.unibo.FPML.Argument");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFPML.g:1092:3: (otherlv_5= ',' ( (lv_higherOrderArg_6_0= ruleAdditionalEffectFullArgument ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalFPML.g:1093:4: otherlv_5= ',' ( (lv_higherOrderArg_6_0= ruleAdditionalEffectFullArgument ) )
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_23); 

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

            otherlv_7=(Token)match(input,23,FOLLOW_12); 

            			newLeafNode(otherlv_7, grammarAccess.getEffectFullFunctionDefinitionAccess().getRightParenthesisKeyword_6());
            		
            otherlv_8=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_8, grammarAccess.getEffectFullFunctionDefinitionAccess().getColonKeyword_7());
            		
            otherlv_9=(Token)match(input,13,FOLLOW_24); 

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

            otherlv_11=(Token)match(input,14,FOLLOW_2); 

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
            otherlv_0=(Token)match(input,24,FOLLOW_13); 

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

            otherlv_2=(Token)match(input,25,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getMainFuncAccess().getMainKeyword_2());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getMainFuncAccess().getColonKeyword_3());
            		
            otherlv_4=(Token)match(input,13,FOLLOW_24); 

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

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

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
    // InternalFPML.g:1240:1: ruleAdditionalPureArgument returns [EObject current=null] : ( (lv_arg2_0_0= rulePureArgument ) ) ;
    public final EObject ruleAdditionalPureArgument() throws RecognitionException {
        EObject current = null;

        EObject lv_arg2_0_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:1246:2: ( ( (lv_arg2_0_0= rulePureArgument ) ) )
            // InternalFPML.g:1247:2: ( (lv_arg2_0_0= rulePureArgument ) )
            {
            // InternalFPML.g:1247:2: ( (lv_arg2_0_0= rulePureArgument ) )
            // InternalFPML.g:1248:3: (lv_arg2_0_0= rulePureArgument )
            {
            // InternalFPML.g:1248:3: (lv_arg2_0_0= rulePureArgument )
            // InternalFPML.g:1249:4: lv_arg2_0_0= rulePureArgument
            {

            				newCompositeNode(grammarAccess.getAdditionalPureArgumentAccess().getArg2PureArgumentParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_arg2_0_0=rulePureArgument();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getAdditionalPureArgumentRule());
            				}
            				set(
            					current,
            					"arg2",
            					lv_arg2_0_0,
            					"it.unibo.FPML.PureArgument");
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
    // InternalFPML.g:1276:1: ruleAdditionalEffectFullArgument returns [EObject current=null] : ( (lv_arg2_0_0= ruleArgument ) ) ;
    public final EObject ruleAdditionalEffectFullArgument() throws RecognitionException {
        EObject current = null;

        EObject lv_arg2_0_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:1282:2: ( ( (lv_arg2_0_0= ruleArgument ) ) )
            // InternalFPML.g:1283:2: ( (lv_arg2_0_0= ruleArgument ) )
            {
            // InternalFPML.g:1283:2: ( (lv_arg2_0_0= ruleArgument ) )
            // InternalFPML.g:1284:3: (lv_arg2_0_0= ruleArgument )
            {
            // InternalFPML.g:1284:3: (lv_arg2_0_0= ruleArgument )
            // InternalFPML.g:1285:4: lv_arg2_0_0= ruleArgument
            {

            				newCompositeNode(grammarAccess.getAdditionalEffectFullArgumentAccess().getArg2ArgumentParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_arg2_0_0=ruleArgument();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getAdditionalEffectFullArgumentRule());
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
    // $ANTLR end "ruleAdditionalEffectFullArgument"


    // $ANTLR start "entryRulePureFunction"
    // InternalFPML.g:1305:1: entryRulePureFunction returns [EObject current=null] : iv_rulePureFunction= rulePureFunction EOF ;
    public final EObject entryRulePureFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePureFunction = null;


        try {
            // InternalFPML.g:1305:53: (iv_rulePureFunction= rulePureFunction EOF )
            // InternalFPML.g:1306:2: iv_rulePureFunction= rulePureFunction EOF
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
    // InternalFPML.g:1312:1: rulePureFunction returns [EObject current=null] : (this_PureFunctionDefinition_0= rulePureFunctionDefinition | this_PrimitivePureFunction_1= rulePrimitivePureFunction | this_PureArgument_2= rulePureArgument | this_Expression_3= ruleExpression | this_PureValue_4= rulePureValue ) ;
    public final EObject rulePureFunction() throws RecognitionException {
        EObject current = null;

        EObject this_PureFunctionDefinition_0 = null;

        EObject this_PrimitivePureFunction_1 = null;

        EObject this_PureArgument_2 = null;

        EObject this_Expression_3 = null;

        EObject this_PureValue_4 = null;



        	enterRule();

        try {
            // InternalFPML.g:1318:2: ( (this_PureFunctionDefinition_0= rulePureFunctionDefinition | this_PrimitivePureFunction_1= rulePrimitivePureFunction | this_PureArgument_2= rulePureArgument | this_Expression_3= ruleExpression | this_PureValue_4= rulePureValue ) )
            // InternalFPML.g:1319:2: (this_PureFunctionDefinition_0= rulePureFunctionDefinition | this_PrimitivePureFunction_1= rulePrimitivePureFunction | this_PureArgument_2= rulePureArgument | this_Expression_3= ruleExpression | this_PureValue_4= rulePureValue )
            {
            // InternalFPML.g:1319:2: (this_PureFunctionDefinition_0= rulePureFunctionDefinition | this_PrimitivePureFunction_1= rulePrimitivePureFunction | this_PureArgument_2= rulePureArgument | this_Expression_3= ruleExpression | this_PureValue_4= rulePureValue )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt9=1;
                }
                break;
            case 36:
            case 37:
            case 41:
            case 42:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
                {
                alt9=2;
                }
                break;
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 35:
            case 39:
                {
                alt9=3;
                }
                break;
            case RULE_INT:
            case RULE_STRING:
            case RULE_BOOLEAN:
            case 21:
            case 44:
            case 46:
            case 48:
            case 49:
            case 50:
                {
                alt9=4;
                }
                break;
            case RULE_ID:
                {
                int LA9_5 = input.LA(2);

                if ( (LA9_5==21) ) {
                    alt9=4;
                }
                else if ( (LA9_5==19) ) {
                    alt9=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 5, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalFPML.g:1320:3: this_PureFunctionDefinition_0= rulePureFunctionDefinition
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
                    // InternalFPML.g:1329:3: this_PrimitivePureFunction_1= rulePrimitivePureFunction
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
                    // InternalFPML.g:1338:3: this_PureArgument_2= rulePureArgument
                    {

                    			newCompositeNode(grammarAccess.getPureFunctionAccess().getPureArgumentParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_PureArgument_2=rulePureArgument();

                    state._fsp--;


                    			current = this_PureArgument_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalFPML.g:1347:3: this_Expression_3= ruleExpression
                    {

                    			newCompositeNode(grammarAccess.getPureFunctionAccess().getExpressionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Expression_3=ruleExpression();

                    state._fsp--;


                    			current = this_Expression_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalFPML.g:1356:3: this_PureValue_4= rulePureValue
                    {

                    			newCompositeNode(grammarAccess.getPureFunctionAccess().getPureValueParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_PureValue_4=rulePureValue();

                    state._fsp--;


                    			current = this_PureValue_4;
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
    // InternalFPML.g:1368:1: entryRuleEffectFullFunction returns [EObject current=null] : iv_ruleEffectFullFunction= ruleEffectFullFunction EOF ;
    public final EObject entryRuleEffectFullFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullFunction = null;


        try {
            // InternalFPML.g:1368:59: (iv_ruleEffectFullFunction= ruleEffectFullFunction EOF )
            // InternalFPML.g:1369:2: iv_ruleEffectFullFunction= ruleEffectFullFunction EOF
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
    // InternalFPML.g:1375:1: ruleEffectFullFunction returns [EObject current=null] : (this_EffectFullFunctionDefinition_0= ruleEffectFullFunctionDefinition | this_PrimitiveEffectFullFunction_1= rulePrimitiveEffectFullFunction | this_EffectFullValue_2= ruleEffectFullValue | this_EffectFullArgument_3= ruleEffectFullArgument ) ;
    public final EObject ruleEffectFullFunction() throws RecognitionException {
        EObject current = null;

        EObject this_EffectFullFunctionDefinition_0 = null;

        EObject this_PrimitiveEffectFullFunction_1 = null;

        EObject this_EffectFullValue_2 = null;

        EObject this_EffectFullArgument_3 = null;



        	enterRule();

        try {
            // InternalFPML.g:1381:2: ( (this_EffectFullFunctionDefinition_0= ruleEffectFullFunctionDefinition | this_PrimitiveEffectFullFunction_1= rulePrimitiveEffectFullFunction | this_EffectFullValue_2= ruleEffectFullValue | this_EffectFullArgument_3= ruleEffectFullArgument ) )
            // InternalFPML.g:1382:2: (this_EffectFullFunctionDefinition_0= ruleEffectFullFunctionDefinition | this_PrimitiveEffectFullFunction_1= rulePrimitiveEffectFullFunction | this_EffectFullValue_2= ruleEffectFullValue | this_EffectFullArgument_3= ruleEffectFullArgument )
            {
            // InternalFPML.g:1382:2: (this_EffectFullFunctionDefinition_0= ruleEffectFullFunctionDefinition | this_PrimitiveEffectFullFunction_1= rulePrimitiveEffectFullFunction | this_EffectFullValue_2= ruleEffectFullValue | this_EffectFullArgument_3= ruleEffectFullArgument )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt10=1;
                }
                break;
            case 55:
            case 56:
            case 64:
            case 65:
            case 66:
            case 69:
            case 71:
            case 73:
            case 74:
            case 75:
                {
                alt10=2;
                }
                break;
            case RULE_ID:
                {
                int LA10_3 = input.LA(2);

                if ( (LA10_3==19) ) {
                    alt10=3;
                }
                else if ( (LA10_3==EOF) ) {
                    alt10=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 3, input);

                    throw nvae;
                }
                }
                break;
            case 13:
            case 24:
            case 34:
            case 38:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalFPML.g:1383:3: this_EffectFullFunctionDefinition_0= ruleEffectFullFunctionDefinition
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
                    // InternalFPML.g:1392:3: this_PrimitiveEffectFullFunction_1= rulePrimitiveEffectFullFunction
                    {

                    			newCompositeNode(grammarAccess.getEffectFullFunctionAccess().getPrimitiveEffectFullFunctionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrimitiveEffectFullFunction_1=rulePrimitiveEffectFullFunction();

                    state._fsp--;


                    			current = this_PrimitiveEffectFullFunction_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalFPML.g:1401:3: this_EffectFullValue_2= ruleEffectFullValue
                    {

                    			newCompositeNode(grammarAccess.getEffectFullFunctionAccess().getEffectFullValueParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_EffectFullValue_2=ruleEffectFullValue();

                    state._fsp--;


                    			current = this_EffectFullValue_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalFPML.g:1410:3: this_EffectFullArgument_3= ruleEffectFullArgument
                    {

                    			newCompositeNode(grammarAccess.getEffectFullFunctionAccess().getEffectFullArgumentParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_EffectFullArgument_3=ruleEffectFullArgument();

                    state._fsp--;


                    			current = this_EffectFullArgument_3;
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


    // $ANTLR start "entryRuleEffectFullPrimitive"
    // InternalFPML.g:1422:1: entryRuleEffectFullPrimitive returns [EObject current=null] : iv_ruleEffectFullPrimitive= ruleEffectFullPrimitive EOF ;
    public final EObject entryRuleEffectFullPrimitive() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullPrimitive = null;


        try {
            // InternalFPML.g:1422:60: (iv_ruleEffectFullPrimitive= ruleEffectFullPrimitive EOF )
            // InternalFPML.g:1423:2: iv_ruleEffectFullPrimitive= ruleEffectFullPrimitive EOF
            {
             newCompositeNode(grammarAccess.getEffectFullPrimitiveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEffectFullPrimitive=ruleEffectFullPrimitive();

            state._fsp--;

             current =iv_ruleEffectFullPrimitive; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEffectFullPrimitive"


    // $ANTLR start "ruleEffectFullPrimitive"
    // InternalFPML.g:1429:1: ruleEffectFullPrimitive returns [EObject current=null] : (this_PrimitiveEffectFullFunction_0= rulePrimitiveEffectFullFunction | this_PrimitiveEffectFullValue_1= rulePrimitiveEffectFullValue ) ;
    public final EObject ruleEffectFullPrimitive() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveEffectFullFunction_0 = null;

        EObject this_PrimitiveEffectFullValue_1 = null;



        	enterRule();

        try {
            // InternalFPML.g:1435:2: ( (this_PrimitiveEffectFullFunction_0= rulePrimitiveEffectFullFunction | this_PrimitiveEffectFullValue_1= rulePrimitiveEffectFullValue ) )
            // InternalFPML.g:1436:2: (this_PrimitiveEffectFullFunction_0= rulePrimitiveEffectFullFunction | this_PrimitiveEffectFullValue_1= rulePrimitiveEffectFullValue )
            {
            // InternalFPML.g:1436:2: (this_PrimitiveEffectFullFunction_0= rulePrimitiveEffectFullFunction | this_PrimitiveEffectFullValue_1= rulePrimitiveEffectFullValue )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=55 && LA11_0<=56)||(LA11_0>=64 && LA11_0<=66)||LA11_0==69||LA11_0==71||(LA11_0>=73 && LA11_0<=75)) ) {
                alt11=1;
            }
            else if ( (LA11_0==70||LA11_0==72) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalFPML.g:1437:3: this_PrimitiveEffectFullFunction_0= rulePrimitiveEffectFullFunction
                    {

                    			newCompositeNode(grammarAccess.getEffectFullPrimitiveAccess().getPrimitiveEffectFullFunctionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrimitiveEffectFullFunction_0=rulePrimitiveEffectFullFunction();

                    state._fsp--;


                    			current = this_PrimitiveEffectFullFunction_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFPML.g:1446:3: this_PrimitiveEffectFullValue_1= rulePrimitiveEffectFullValue
                    {

                    			newCompositeNode(grammarAccess.getEffectFullPrimitiveAccess().getPrimitiveEffectFullValueParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrimitiveEffectFullValue_1=rulePrimitiveEffectFullValue();

                    state._fsp--;


                    			current = this_PrimitiveEffectFullValue_1;
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
    // $ANTLR end "ruleEffectFullPrimitive"


    // $ANTLR start "entryRuleArgument"
    // InternalFPML.g:1458:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // InternalFPML.g:1458:49: (iv_ruleArgument= ruleArgument EOF )
            // InternalFPML.g:1459:2: iv_ruleArgument= ruleArgument EOF
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
    // InternalFPML.g:1465:1: ruleArgument returns [EObject current=null] : (this_EffectFullArgument_0= ruleEffectFullArgument | this_PureArgument_1= rulePureArgument ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        EObject this_EffectFullArgument_0 = null;

        EObject this_PureArgument_1 = null;



        	enterRule();

        try {
            // InternalFPML.g:1471:2: ( (this_EffectFullArgument_0= ruleEffectFullArgument | this_PureArgument_1= rulePureArgument ) )
            // InternalFPML.g:1472:2: (this_EffectFullArgument_0= ruleEffectFullArgument | this_PureArgument_1= rulePureArgument )
            {
            // InternalFPML.g:1472:2: (this_EffectFullArgument_0= ruleEffectFullArgument | this_PureArgument_1= rulePureArgument )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==EOF||LA12_0==RULE_ID||(LA12_0>=13 && LA12_0<=14)||LA12_0==17||LA12_0==22||LA12_0==24||LA12_0==28||LA12_0==34||(LA12_0>=37 && LA12_0<=38)||(LA12_0>=40 && LA12_0<=42)) ) {
                alt12=1;
            }
            else if ( ((LA12_0>=29 && LA12_0<=33)||LA12_0==35||LA12_0==39) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalFPML.g:1473:3: this_EffectFullArgument_0= ruleEffectFullArgument
                    {

                    			newCompositeNode(grammarAccess.getArgumentAccess().getEffectFullArgumentParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EffectFullArgument_0=ruleEffectFullArgument();

                    state._fsp--;


                    			current = this_EffectFullArgument_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFPML.g:1482:3: this_PureArgument_1= rulePureArgument
                    {

                    			newCompositeNode(grammarAccess.getArgumentAccess().getPureArgumentParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PureArgument_1=rulePureArgument();

                    state._fsp--;


                    			current = this_PureArgument_1;
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
    // $ANTLR end "ruleArgument"


    // $ANTLR start "entryRuleEffectFullArgument"
    // InternalFPML.g:1494:1: entryRuleEffectFullArgument returns [EObject current=null] : iv_ruleEffectFullArgument= ruleEffectFullArgument EOF ;
    public final EObject entryRuleEffectFullArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullArgument = null;


        try {
            // InternalFPML.g:1494:59: (iv_ruleEffectFullArgument= ruleEffectFullArgument EOF )
            // InternalFPML.g:1495:2: iv_ruleEffectFullArgument= ruleEffectFullArgument EOF
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
    // InternalFPML.g:1501:1: ruleEffectFullArgument returns [EObject current=null] : ( ( (lv_type_0_0= ruleEffectFullType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEffectFullArgument() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:1507:2: ( ( ( (lv_type_0_0= ruleEffectFullType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalFPML.g:1508:2: ( ( (lv_type_0_0= ruleEffectFullType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalFPML.g:1508:2: ( ( (lv_type_0_0= ruleEffectFullType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalFPML.g:1509:3: ( (lv_type_0_0= ruleEffectFullType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalFPML.g:1509:3: ( (lv_type_0_0= ruleEffectFullType ) )
            // InternalFPML.g:1510:4: (lv_type_0_0= ruleEffectFullType )
            {
            // InternalFPML.g:1510:4: (lv_type_0_0= ruleEffectFullType )
            // InternalFPML.g:1511:5: lv_type_0_0= ruleEffectFullType
            {

            					newCompositeNode(grammarAccess.getEffectFullArgumentAccess().getTypeEffectFullTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
            lv_type_0_0=ruleEffectFullType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEffectFullArgumentRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"it.unibo.FPML.EffectFullType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFPML.g:1528:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFPML.g:1529:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFPML.g:1529:4: (lv_name_1_0= RULE_ID )
            // InternalFPML.g:1530:5: lv_name_1_0= RULE_ID
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


    // $ANTLR start "entryRulePureArgument"
    // InternalFPML.g:1550:1: entryRulePureArgument returns [EObject current=null] : iv_rulePureArgument= rulePureArgument EOF ;
    public final EObject entryRulePureArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePureArgument = null;


        try {
            // InternalFPML.g:1550:53: (iv_rulePureArgument= rulePureArgument EOF )
            // InternalFPML.g:1551:2: iv_rulePureArgument= rulePureArgument EOF
            {
             newCompositeNode(grammarAccess.getPureArgumentRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePureArgument=rulePureArgument();

            state._fsp--;

             current =iv_rulePureArgument; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePureArgument"


    // $ANTLR start "rulePureArgument"
    // InternalFPML.g:1557:1: rulePureArgument returns [EObject current=null] : ( ( (lv_type_0_0= ruleValueType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePureArgument() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:1563:2: ( ( ( (lv_type_0_0= ruleValueType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalFPML.g:1564:2: ( ( (lv_type_0_0= ruleValueType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalFPML.g:1564:2: ( ( (lv_type_0_0= ruleValueType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalFPML.g:1565:3: ( (lv_type_0_0= ruleValueType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalFPML.g:1565:3: ( (lv_type_0_0= ruleValueType ) )
            // InternalFPML.g:1566:4: (lv_type_0_0= ruleValueType )
            {
            // InternalFPML.g:1566:4: (lv_type_0_0= ruleValueType )
            // InternalFPML.g:1567:5: lv_type_0_0= ruleValueType
            {

            					newCompositeNode(grammarAccess.getPureArgumentAccess().getTypeValueTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
            lv_type_0_0=ruleValueType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPureArgumentRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"it.unibo.FPML.ValueType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFPML.g:1584:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFPML.g:1585:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFPML.g:1585:4: (lv_name_1_0= RULE_ID )
            // InternalFPML.g:1586:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPureArgumentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPureArgumentRule());
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
    // $ANTLR end "rulePureArgument"


    // $ANTLR start "entryRuleFunctionBodyPure"
    // InternalFPML.g:1606:1: entryRuleFunctionBodyPure returns [EObject current=null] : iv_ruleFunctionBodyPure= ruleFunctionBodyPure EOF ;
    public final EObject entryRuleFunctionBodyPure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionBodyPure = null;


        try {
            // InternalFPML.g:1606:57: (iv_ruleFunctionBodyPure= ruleFunctionBodyPure EOF )
            // InternalFPML.g:1607:2: iv_ruleFunctionBodyPure= ruleFunctionBodyPure EOF
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
    // InternalFPML.g:1613:1: ruleFunctionBodyPure returns [EObject current=null] : (this_EmptyFunctionBody_0= ruleEmptyFunctionBody | this_CompositionFunctionBodyPure_1= ruleCompositionFunctionBodyPure ) ;
    public final EObject ruleFunctionBodyPure() throws RecognitionException {
        EObject current = null;

        EObject this_EmptyFunctionBody_0 = null;

        EObject this_CompositionFunctionBodyPure_1 = null;



        	enterRule();

        try {
            // InternalFPML.g:1619:2: ( (this_EmptyFunctionBody_0= ruleEmptyFunctionBody | this_CompositionFunctionBodyPure_1= ruleCompositionFunctionBodyPure ) )
            // InternalFPML.g:1620:2: (this_EmptyFunctionBody_0= ruleEmptyFunctionBody | this_CompositionFunctionBodyPure_1= ruleCompositionFunctionBodyPure )
            {
            // InternalFPML.g:1620:2: (this_EmptyFunctionBody_0= ruleEmptyFunctionBody | this_CompositionFunctionBodyPure_1= ruleCompositionFunctionBodyPure )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            else if ( ((LA13_0>=RULE_ID && LA13_0<=RULE_BOOLEAN)||LA13_0==21||(LA13_0>=36 && LA13_0<=37)||(LA13_0>=41 && LA13_0<=42)||LA13_0==44||LA13_0==46||(LA13_0>=48 && LA13_0<=66)) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalFPML.g:1621:3: this_EmptyFunctionBody_0= ruleEmptyFunctionBody
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
                    // InternalFPML.g:1630:3: this_CompositionFunctionBodyPure_1= ruleCompositionFunctionBodyPure
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
    // InternalFPML.g:1642:1: entryRuleFunctionBodyEffectFull returns [EObject current=null] : iv_ruleFunctionBodyEffectFull= ruleFunctionBodyEffectFull EOF ;
    public final EObject entryRuleFunctionBodyEffectFull() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionBodyEffectFull = null;


        try {
            // InternalFPML.g:1642:63: (iv_ruleFunctionBodyEffectFull= ruleFunctionBodyEffectFull EOF )
            // InternalFPML.g:1643:2: iv_ruleFunctionBodyEffectFull= ruleFunctionBodyEffectFull EOF
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
    // InternalFPML.g:1649:1: ruleFunctionBodyEffectFull returns [EObject current=null] : (this_EmptyFunctionBody_0= ruleEmptyFunctionBody | this_CompositionFunctionBodyEffect_1= ruleCompositionFunctionBodyEffect ) ;
    public final EObject ruleFunctionBodyEffectFull() throws RecognitionException {
        EObject current = null;

        EObject this_EmptyFunctionBody_0 = null;

        EObject this_CompositionFunctionBodyEffect_1 = null;



        	enterRule();

        try {
            // InternalFPML.g:1655:2: ( (this_EmptyFunctionBody_0= ruleEmptyFunctionBody | this_CompositionFunctionBodyEffect_1= ruleCompositionFunctionBodyEffect ) )
            // InternalFPML.g:1656:2: (this_EmptyFunctionBody_0= ruleEmptyFunctionBody | this_CompositionFunctionBodyEffect_1= ruleCompositionFunctionBodyEffect )
            {
            // InternalFPML.g:1656:2: (this_EmptyFunctionBody_0= ruleEmptyFunctionBody | this_CompositionFunctionBodyEffect_1= ruleCompositionFunctionBodyEffect )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_ID||LA14_0==24||LA14_0==39||LA14_0==43||(LA14_0>=45 && LA14_0<=46)||(LA14_0>=49 && LA14_0<=50)||(LA14_0>=55 && LA14_0<=56)||(LA14_0>=64 && LA14_0<=66)||(LA14_0>=69 && LA14_0<=75)) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalFPML.g:1657:3: this_EmptyFunctionBody_0= ruleEmptyFunctionBody
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
                    // InternalFPML.g:1666:3: this_CompositionFunctionBodyEffect_1= ruleCompositionFunctionBodyEffect
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
    // InternalFPML.g:1678:1: entryRuleEmptyFunctionBody returns [EObject current=null] : iv_ruleEmptyFunctionBody= ruleEmptyFunctionBody EOF ;
    public final EObject entryRuleEmptyFunctionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmptyFunctionBody = null;


        try {
            // InternalFPML.g:1678:58: (iv_ruleEmptyFunctionBody= ruleEmptyFunctionBody EOF )
            // InternalFPML.g:1679:2: iv_ruleEmptyFunctionBody= ruleEmptyFunctionBody EOF
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
    // InternalFPML.g:1685:1: ruleEmptyFunctionBody returns [EObject current=null] : ( () otherlv_1= 'Undefined' ) ;
    public final EObject ruleEmptyFunctionBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFPML.g:1691:2: ( ( () otherlv_1= 'Undefined' ) )
            // InternalFPML.g:1692:2: ( () otherlv_1= 'Undefined' )
            {
            // InternalFPML.g:1692:2: ( () otherlv_1= 'Undefined' )
            // InternalFPML.g:1693:3: () otherlv_1= 'Undefined'
            {
            // InternalFPML.g:1693:3: ()
            // InternalFPML.g:1694:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEmptyFunctionBodyAccess().getEmptyFunctionBodyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_2); 

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
    // InternalFPML.g:1708:1: entryRuleCompositionFunctionBodyPure returns [EObject current=null] : iv_ruleCompositionFunctionBodyPure= ruleCompositionFunctionBodyPure EOF ;
    public final EObject entryRuleCompositionFunctionBodyPure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositionFunctionBodyPure = null;


        try {
            // InternalFPML.g:1708:68: (iv_ruleCompositionFunctionBodyPure= ruleCompositionFunctionBodyPure EOF )
            // InternalFPML.g:1709:2: iv_ruleCompositionFunctionBodyPure= ruleCompositionFunctionBodyPure EOF
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
    // InternalFPML.g:1715:1: ruleCompositionFunctionBodyPure returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_functionChain_1_0= ruleCompositionFunctionBodyPureFactor ) )+ ) | ( ( (lv_primitiveElement_2_0= rulePrimitivePureFunction ) ) ( (lv_functionChain_3_0= ruleCompositionFunctionBodyPureFactor ) )+ ) | ( ( (lv_expressionElement_4_0= ruleExpression ) ) ( (lv_functionChain_5_0= ruleCompositionFunctionBodyPureFactor ) )+ ) ) ;
    public final EObject ruleCompositionFunctionBodyPure() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_functionChain_1_0 = null;

        EObject lv_primitiveElement_2_0 = null;

        EObject lv_functionChain_3_0 = null;

        EObject lv_expressionElement_4_0 = null;

        EObject lv_functionChain_5_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:1721:2: ( ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_functionChain_1_0= ruleCompositionFunctionBodyPureFactor ) )+ ) | ( ( (lv_primitiveElement_2_0= rulePrimitivePureFunction ) ) ( (lv_functionChain_3_0= ruleCompositionFunctionBodyPureFactor ) )+ ) | ( ( (lv_expressionElement_4_0= ruleExpression ) ) ( (lv_functionChain_5_0= ruleCompositionFunctionBodyPureFactor ) )+ ) ) )
            // InternalFPML.g:1722:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_functionChain_1_0= ruleCompositionFunctionBodyPureFactor ) )+ ) | ( ( (lv_primitiveElement_2_0= rulePrimitivePureFunction ) ) ( (lv_functionChain_3_0= ruleCompositionFunctionBodyPureFactor ) )+ ) | ( ( (lv_expressionElement_4_0= ruleExpression ) ) ( (lv_functionChain_5_0= ruleCompositionFunctionBodyPureFactor ) )+ ) )
            {
            // InternalFPML.g:1722:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_functionChain_1_0= ruleCompositionFunctionBodyPureFactor ) )+ ) | ( ( (lv_primitiveElement_2_0= rulePrimitivePureFunction ) ) ( (lv_functionChain_3_0= ruleCompositionFunctionBodyPureFactor ) )+ ) | ( ( (lv_expressionElement_4_0= ruleExpression ) ) ( (lv_functionChain_5_0= ruleCompositionFunctionBodyPureFactor ) )+ ) )
            int alt18=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==27) ) {
                    alt18=1;
                }
                else if ( (LA18_1==21) ) {
                    alt18=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;
                }
                }
                break;
            case 36:
            case 37:
            case 41:
            case 42:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
                {
                alt18=2;
                }
                break;
            case RULE_INT:
            case RULE_STRING:
            case RULE_BOOLEAN:
            case 21:
            case 44:
            case 46:
            case 48:
            case 49:
            case 50:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalFPML.g:1723:3: ( ( (otherlv_0= RULE_ID ) ) ( (lv_functionChain_1_0= ruleCompositionFunctionBodyPureFactor ) )+ )
                    {
                    // InternalFPML.g:1723:3: ( ( (otherlv_0= RULE_ID ) ) ( (lv_functionChain_1_0= ruleCompositionFunctionBodyPureFactor ) )+ )
                    // InternalFPML.g:1724:4: ( (otherlv_0= RULE_ID ) ) ( (lv_functionChain_1_0= ruleCompositionFunctionBodyPureFactor ) )+
                    {
                    // InternalFPML.g:1724:4: ( (otherlv_0= RULE_ID ) )
                    // InternalFPML.g:1725:5: (otherlv_0= RULE_ID )
                    {
                    // InternalFPML.g:1725:5: (otherlv_0= RULE_ID )
                    // InternalFPML.g:1726:6: otherlv_0= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCompositionFunctionBodyPureRule());
                    						}
                    					
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_26); 

                    						newLeafNode(otherlv_0, grammarAccess.getCompositionFunctionBodyPureAccess().getReferenceElementPureFunctionCrossReference_0_0_0());
                    					

                    }


                    }

                    // InternalFPML.g:1737:4: ( (lv_functionChain_1_0= ruleCompositionFunctionBodyPureFactor ) )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==27) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalFPML.g:1738:5: (lv_functionChain_1_0= ruleCompositionFunctionBodyPureFactor )
                    	    {
                    	    // InternalFPML.g:1738:5: (lv_functionChain_1_0= ruleCompositionFunctionBodyPureFactor )
                    	    // InternalFPML.g:1739:6: lv_functionChain_1_0= ruleCompositionFunctionBodyPureFactor
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
                    // InternalFPML.g:1758:3: ( ( (lv_primitiveElement_2_0= rulePrimitivePureFunction ) ) ( (lv_functionChain_3_0= ruleCompositionFunctionBodyPureFactor ) )+ )
                    {
                    // InternalFPML.g:1758:3: ( ( (lv_primitiveElement_2_0= rulePrimitivePureFunction ) ) ( (lv_functionChain_3_0= ruleCompositionFunctionBodyPureFactor ) )+ )
                    // InternalFPML.g:1759:4: ( (lv_primitiveElement_2_0= rulePrimitivePureFunction ) ) ( (lv_functionChain_3_0= ruleCompositionFunctionBodyPureFactor ) )+
                    {
                    // InternalFPML.g:1759:4: ( (lv_primitiveElement_2_0= rulePrimitivePureFunction ) )
                    // InternalFPML.g:1760:5: (lv_primitiveElement_2_0= rulePrimitivePureFunction )
                    {
                    // InternalFPML.g:1760:5: (lv_primitiveElement_2_0= rulePrimitivePureFunction )
                    // InternalFPML.g:1761:6: lv_primitiveElement_2_0= rulePrimitivePureFunction
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

                    // InternalFPML.g:1778:4: ( (lv_functionChain_3_0= ruleCompositionFunctionBodyPureFactor ) )+
                    int cnt16=0;
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==27) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalFPML.g:1779:5: (lv_functionChain_3_0= ruleCompositionFunctionBodyPureFactor )
                    	    {
                    	    // InternalFPML.g:1779:5: (lv_functionChain_3_0= ruleCompositionFunctionBodyPureFactor )
                    	    // InternalFPML.g:1780:6: lv_functionChain_3_0= ruleCompositionFunctionBodyPureFactor
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
                case 3 :
                    // InternalFPML.g:1799:3: ( ( (lv_expressionElement_4_0= ruleExpression ) ) ( (lv_functionChain_5_0= ruleCompositionFunctionBodyPureFactor ) )+ )
                    {
                    // InternalFPML.g:1799:3: ( ( (lv_expressionElement_4_0= ruleExpression ) ) ( (lv_functionChain_5_0= ruleCompositionFunctionBodyPureFactor ) )+ )
                    // InternalFPML.g:1800:4: ( (lv_expressionElement_4_0= ruleExpression ) ) ( (lv_functionChain_5_0= ruleCompositionFunctionBodyPureFactor ) )+
                    {
                    // InternalFPML.g:1800:4: ( (lv_expressionElement_4_0= ruleExpression ) )
                    // InternalFPML.g:1801:5: (lv_expressionElement_4_0= ruleExpression )
                    {
                    // InternalFPML.g:1801:5: (lv_expressionElement_4_0= ruleExpression )
                    // InternalFPML.g:1802:6: lv_expressionElement_4_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getCompositionFunctionBodyPureAccess().getExpressionElementExpressionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_expressionElement_4_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompositionFunctionBodyPureRule());
                    						}
                    						set(
                    							current,
                    							"expressionElement",
                    							lv_expressionElement_4_0,
                    							"it.unibo.FPML.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFPML.g:1819:4: ( (lv_functionChain_5_0= ruleCompositionFunctionBodyPureFactor ) )+
                    int cnt17=0;
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==27) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalFPML.g:1820:5: (lv_functionChain_5_0= ruleCompositionFunctionBodyPureFactor )
                    	    {
                    	    // InternalFPML.g:1820:5: (lv_functionChain_5_0= ruleCompositionFunctionBodyPureFactor )
                    	    // InternalFPML.g:1821:6: lv_functionChain_5_0= ruleCompositionFunctionBodyPureFactor
                    	    {

                    	    						newCompositeNode(grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainCompositionFunctionBodyPureFactorParserRuleCall_2_1_0());
                    	    					
                    	    pushFollow(FOLLOW_27);
                    	    lv_functionChain_5_0=ruleCompositionFunctionBodyPureFactor();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getCompositionFunctionBodyPureRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"functionChain",
                    	    							lv_functionChain_5_0,
                    	    							"it.unibo.FPML.CompositionFunctionBodyPureFactor");
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
    // InternalFPML.g:1843:1: entryRuleCompositionFunctionBodyPureFactor returns [EObject current=null] : iv_ruleCompositionFunctionBodyPureFactor= ruleCompositionFunctionBodyPureFactor EOF ;
    public final EObject entryRuleCompositionFunctionBodyPureFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositionFunctionBodyPureFactor = null;


        try {
            // InternalFPML.g:1843:74: (iv_ruleCompositionFunctionBodyPureFactor= ruleCompositionFunctionBodyPureFactor EOF )
            // InternalFPML.g:1844:2: iv_ruleCompositionFunctionBodyPureFactor= ruleCompositionFunctionBodyPureFactor EOF
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
    // InternalFPML.g:1850:1: ruleCompositionFunctionBodyPureFactor returns [EObject current=null] : ( (otherlv_0= '|>' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= '|>' ( (lv_primitiveElement_3_0= rulePrimitivePureFunction ) ) ) | (otherlv_4= '|>' ( (lv_expressionElement_5_0= ruleExpression ) ) ) ) ;
    public final EObject ruleCompositionFunctionBodyPureFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_primitiveElement_3_0 = null;

        EObject lv_expressionElement_5_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:1856:2: ( ( (otherlv_0= '|>' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= '|>' ( (lv_primitiveElement_3_0= rulePrimitivePureFunction ) ) ) | (otherlv_4= '|>' ( (lv_expressionElement_5_0= ruleExpression ) ) ) ) )
            // InternalFPML.g:1857:2: ( (otherlv_0= '|>' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= '|>' ( (lv_primitiveElement_3_0= rulePrimitivePureFunction ) ) ) | (otherlv_4= '|>' ( (lv_expressionElement_5_0= ruleExpression ) ) ) )
            {
            // InternalFPML.g:1857:2: ( (otherlv_0= '|>' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= '|>' ( (lv_primitiveElement_3_0= rulePrimitivePureFunction ) ) ) | (otherlv_4= '|>' ( (lv_expressionElement_5_0= ruleExpression ) ) ) )
            int alt19=3;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==27) ) {
                switch ( input.LA(2) ) {
                case RULE_INT:
                case RULE_STRING:
                case RULE_BOOLEAN:
                case 21:
                case 44:
                case 46:
                case 48:
                case 49:
                case 50:
                    {
                    alt19=3;
                    }
                    break;
                case RULE_ID:
                    {
                    int LA19_3 = input.LA(3);

                    if ( (LA19_3==21) ) {
                        alt19=3;
                    }
                    else if ( (LA19_3==EOF||LA19_3==14||LA19_3==27) ) {
                        alt19=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case 36:
                case 37:
                case 41:
                case 42:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                    {
                    alt19=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalFPML.g:1858:3: (otherlv_0= '|>' ( (otherlv_1= RULE_ID ) ) )
                    {
                    // InternalFPML.g:1858:3: (otherlv_0= '|>' ( (otherlv_1= RULE_ID ) ) )
                    // InternalFPML.g:1859:4: otherlv_0= '|>' ( (otherlv_1= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,27,FOLLOW_17); 

                    				newLeafNode(otherlv_0, grammarAccess.getCompositionFunctionBodyPureFactorAccess().getVerticalLineGreaterThanSignKeyword_0_0());
                    			
                    // InternalFPML.g:1863:4: ( (otherlv_1= RULE_ID ) )
                    // InternalFPML.g:1864:5: (otherlv_1= RULE_ID )
                    {
                    // InternalFPML.g:1864:5: (otherlv_1= RULE_ID )
                    // InternalFPML.g:1865:6: otherlv_1= RULE_ID
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
                    // InternalFPML.g:1878:3: (otherlv_2= '|>' ( (lv_primitiveElement_3_0= rulePrimitivePureFunction ) ) )
                    {
                    // InternalFPML.g:1878:3: (otherlv_2= '|>' ( (lv_primitiveElement_3_0= rulePrimitivePureFunction ) ) )
                    // InternalFPML.g:1879:4: otherlv_2= '|>' ( (lv_primitiveElement_3_0= rulePrimitivePureFunction ) )
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_28); 

                    				newLeafNode(otherlv_2, grammarAccess.getCompositionFunctionBodyPureFactorAccess().getVerticalLineGreaterThanSignKeyword_1_0());
                    			
                    // InternalFPML.g:1883:4: ( (lv_primitiveElement_3_0= rulePrimitivePureFunction ) )
                    // InternalFPML.g:1884:5: (lv_primitiveElement_3_0= rulePrimitivePureFunction )
                    {
                    // InternalFPML.g:1884:5: (lv_primitiveElement_3_0= rulePrimitivePureFunction )
                    // InternalFPML.g:1885:6: lv_primitiveElement_3_0= rulePrimitivePureFunction
                    {

                    						newCompositeNode(grammarAccess.getCompositionFunctionBodyPureFactorAccess().getPrimitiveElementPrimitivePureFunctionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_primitiveElement_3_0=rulePrimitivePureFunction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompositionFunctionBodyPureFactorRule());
                    						}
                    						set(
                    							current,
                    							"primitiveElement",
                    							lv_primitiveElement_3_0,
                    							"it.unibo.FPML.PrimitivePureFunction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalFPML.g:1904:3: (otherlv_4= '|>' ( (lv_expressionElement_5_0= ruleExpression ) ) )
                    {
                    // InternalFPML.g:1904:3: (otherlv_4= '|>' ( (lv_expressionElement_5_0= ruleExpression ) ) )
                    // InternalFPML.g:1905:4: otherlv_4= '|>' ( (lv_expressionElement_5_0= ruleExpression ) )
                    {
                    otherlv_4=(Token)match(input,27,FOLLOW_14); 

                    				newLeafNode(otherlv_4, grammarAccess.getCompositionFunctionBodyPureFactorAccess().getVerticalLineGreaterThanSignKeyword_2_0());
                    			
                    // InternalFPML.g:1909:4: ( (lv_expressionElement_5_0= ruleExpression ) )
                    // InternalFPML.g:1910:5: (lv_expressionElement_5_0= ruleExpression )
                    {
                    // InternalFPML.g:1910:5: (lv_expressionElement_5_0= ruleExpression )
                    // InternalFPML.g:1911:6: lv_expressionElement_5_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getCompositionFunctionBodyPureFactorAccess().getExpressionElementExpressionParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expressionElement_5_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompositionFunctionBodyPureFactorRule());
                    						}
                    						set(
                    							current,
                    							"expressionElement",
                    							lv_expressionElement_5_0,
                    							"it.unibo.FPML.Expression");
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
    // InternalFPML.g:1933:1: entryRuleCompositionFunctionBodyEffect returns [EObject current=null] : iv_ruleCompositionFunctionBodyEffect= ruleCompositionFunctionBodyEffect EOF ;
    public final EObject entryRuleCompositionFunctionBodyEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositionFunctionBodyEffect = null;


        try {
            // InternalFPML.g:1933:70: (iv_ruleCompositionFunctionBodyEffect= ruleCompositionFunctionBodyEffect EOF )
            // InternalFPML.g:1934:2: iv_ruleCompositionFunctionBodyEffect= ruleCompositionFunctionBodyEffect EOF
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
    // InternalFPML.g:1940:1: ruleCompositionFunctionBodyEffect returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_functionChain_1_0= ruleCompositionFunctionBodyEffectFullFactor ) )+ ) | ( ( (lv_primitiveElement_2_0= ruleEffectFullPrimitive ) ) ( (lv_functionChain_3_0= ruleCompositionFunctionBodyEffectFullFactor ) )+ ) | ( ( (lv_expressionElement_4_0= ruleEffectFullExpression ) ) ( (lv_functionChain_5_0= ruleCompositionFunctionBodyEffectFullFactor ) )+ ) ) ;
    public final EObject ruleCompositionFunctionBodyEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_functionChain_1_0 = null;

        EObject lv_primitiveElement_2_0 = null;

        EObject lv_functionChain_3_0 = null;

        EObject lv_expressionElement_4_0 = null;

        EObject lv_functionChain_5_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:1946:2: ( ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_functionChain_1_0= ruleCompositionFunctionBodyEffectFullFactor ) )+ ) | ( ( (lv_primitiveElement_2_0= ruleEffectFullPrimitive ) ) ( (lv_functionChain_3_0= ruleCompositionFunctionBodyEffectFullFactor ) )+ ) | ( ( (lv_expressionElement_4_0= ruleEffectFullExpression ) ) ( (lv_functionChain_5_0= ruleCompositionFunctionBodyEffectFullFactor ) )+ ) ) )
            // InternalFPML.g:1947:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_functionChain_1_0= ruleCompositionFunctionBodyEffectFullFactor ) )+ ) | ( ( (lv_primitiveElement_2_0= ruleEffectFullPrimitive ) ) ( (lv_functionChain_3_0= ruleCompositionFunctionBodyEffectFullFactor ) )+ ) | ( ( (lv_expressionElement_4_0= ruleEffectFullExpression ) ) ( (lv_functionChain_5_0= ruleCompositionFunctionBodyEffectFullFactor ) )+ ) )
            {
            // InternalFPML.g:1947:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_functionChain_1_0= ruleCompositionFunctionBodyEffectFullFactor ) )+ ) | ( ( (lv_primitiveElement_2_0= ruleEffectFullPrimitive ) ) ( (lv_functionChain_3_0= ruleCompositionFunctionBodyEffectFullFactor ) )+ ) | ( ( (lv_expressionElement_4_0= ruleEffectFullExpression ) ) ( (lv_functionChain_5_0= ruleCompositionFunctionBodyEffectFullFactor ) )+ ) )
            int alt23=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==28) ) {
                    alt23=1;
                }
                else if ( (LA23_1==39) ) {
                    alt23=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;
                }
                }
                break;
            case 55:
            case 56:
            case 64:
            case 65:
            case 66:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
                {
                alt23=2;
                }
                break;
            case 24:
            case 39:
            case 43:
            case 45:
            case 46:
            case 49:
            case 50:
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
                    // InternalFPML.g:1948:3: ( ( (otherlv_0= RULE_ID ) ) ( (lv_functionChain_1_0= ruleCompositionFunctionBodyEffectFullFactor ) )+ )
                    {
                    // InternalFPML.g:1948:3: ( ( (otherlv_0= RULE_ID ) ) ( (lv_functionChain_1_0= ruleCompositionFunctionBodyEffectFullFactor ) )+ )
                    // InternalFPML.g:1949:4: ( (otherlv_0= RULE_ID ) ) ( (lv_functionChain_1_0= ruleCompositionFunctionBodyEffectFullFactor ) )+
                    {
                    // InternalFPML.g:1949:4: ( (otherlv_0= RULE_ID ) )
                    // InternalFPML.g:1950:5: (otherlv_0= RULE_ID )
                    {
                    // InternalFPML.g:1950:5: (otherlv_0= RULE_ID )
                    // InternalFPML.g:1951:6: otherlv_0= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCompositionFunctionBodyEffectRule());
                    						}
                    					
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_29); 

                    						newLeafNode(otherlv_0, grammarAccess.getCompositionFunctionBodyEffectAccess().getReferenceElementEffectFullFunctionCrossReference_0_0_0());
                    					

                    }


                    }

                    // InternalFPML.g:1962:4: ( (lv_functionChain_1_0= ruleCompositionFunctionBodyEffectFullFactor ) )+
                    int cnt20=0;
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==28) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalFPML.g:1963:5: (lv_functionChain_1_0= ruleCompositionFunctionBodyEffectFullFactor )
                    	    {
                    	    // InternalFPML.g:1963:5: (lv_functionChain_1_0= ruleCompositionFunctionBodyEffectFullFactor )
                    	    // InternalFPML.g:1964:6: lv_functionChain_1_0= ruleCompositionFunctionBodyEffectFullFactor
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
                case 2 :
                    // InternalFPML.g:1983:3: ( ( (lv_primitiveElement_2_0= ruleEffectFullPrimitive ) ) ( (lv_functionChain_3_0= ruleCompositionFunctionBodyEffectFullFactor ) )+ )
                    {
                    // InternalFPML.g:1983:3: ( ( (lv_primitiveElement_2_0= ruleEffectFullPrimitive ) ) ( (lv_functionChain_3_0= ruleCompositionFunctionBodyEffectFullFactor ) )+ )
                    // InternalFPML.g:1984:4: ( (lv_primitiveElement_2_0= ruleEffectFullPrimitive ) ) ( (lv_functionChain_3_0= ruleCompositionFunctionBodyEffectFullFactor ) )+
                    {
                    // InternalFPML.g:1984:4: ( (lv_primitiveElement_2_0= ruleEffectFullPrimitive ) )
                    // InternalFPML.g:1985:5: (lv_primitiveElement_2_0= ruleEffectFullPrimitive )
                    {
                    // InternalFPML.g:1985:5: (lv_primitiveElement_2_0= ruleEffectFullPrimitive )
                    // InternalFPML.g:1986:6: lv_primitiveElement_2_0= ruleEffectFullPrimitive
                    {

                    						newCompositeNode(grammarAccess.getCompositionFunctionBodyEffectAccess().getPrimitiveElementEffectFullPrimitiveParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_primitiveElement_2_0=ruleEffectFullPrimitive();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompositionFunctionBodyEffectRule());
                    						}
                    						set(
                    							current,
                    							"primitiveElement",
                    							lv_primitiveElement_2_0,
                    							"it.unibo.FPML.EffectFullPrimitive");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFPML.g:2003:4: ( (lv_functionChain_3_0= ruleCompositionFunctionBodyEffectFullFactor ) )+
                    int cnt21=0;
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==28) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalFPML.g:2004:5: (lv_functionChain_3_0= ruleCompositionFunctionBodyEffectFullFactor )
                    	    {
                    	    // InternalFPML.g:2004:5: (lv_functionChain_3_0= ruleCompositionFunctionBodyEffectFullFactor )
                    	    // InternalFPML.g:2005:6: lv_functionChain_3_0= ruleCompositionFunctionBodyEffectFullFactor
                    	    {

                    	    						newCompositeNode(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainCompositionFunctionBodyEffectFullFactorParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_30);
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
                    	    if ( cnt21 >= 1 ) break loop21;
                                EarlyExitException eee =
                                    new EarlyExitException(21, input);
                                throw eee;
                        }
                        cnt21++;
                    } while (true);


                    }


                    }
                    break;
                case 3 :
                    // InternalFPML.g:2024:3: ( ( (lv_expressionElement_4_0= ruleEffectFullExpression ) ) ( (lv_functionChain_5_0= ruleCompositionFunctionBodyEffectFullFactor ) )+ )
                    {
                    // InternalFPML.g:2024:3: ( ( (lv_expressionElement_4_0= ruleEffectFullExpression ) ) ( (lv_functionChain_5_0= ruleCompositionFunctionBodyEffectFullFactor ) )+ )
                    // InternalFPML.g:2025:4: ( (lv_expressionElement_4_0= ruleEffectFullExpression ) ) ( (lv_functionChain_5_0= ruleCompositionFunctionBodyEffectFullFactor ) )+
                    {
                    // InternalFPML.g:2025:4: ( (lv_expressionElement_4_0= ruleEffectFullExpression ) )
                    // InternalFPML.g:2026:5: (lv_expressionElement_4_0= ruleEffectFullExpression )
                    {
                    // InternalFPML.g:2026:5: (lv_expressionElement_4_0= ruleEffectFullExpression )
                    // InternalFPML.g:2027:6: lv_expressionElement_4_0= ruleEffectFullExpression
                    {

                    						newCompositeNode(grammarAccess.getCompositionFunctionBodyEffectAccess().getExpressionElementEffectFullExpressionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_expressionElement_4_0=ruleEffectFullExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompositionFunctionBodyEffectRule());
                    						}
                    						set(
                    							current,
                    							"expressionElement",
                    							lv_expressionElement_4_0,
                    							"it.unibo.FPML.EffectFullExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFPML.g:2044:4: ( (lv_functionChain_5_0= ruleCompositionFunctionBodyEffectFullFactor ) )+
                    int cnt22=0;
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==28) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalFPML.g:2045:5: (lv_functionChain_5_0= ruleCompositionFunctionBodyEffectFullFactor )
                    	    {
                    	    // InternalFPML.g:2045:5: (lv_functionChain_5_0= ruleCompositionFunctionBodyEffectFullFactor )
                    	    // InternalFPML.g:2046:6: lv_functionChain_5_0= ruleCompositionFunctionBodyEffectFullFactor
                    	    {

                    	    						newCompositeNode(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainCompositionFunctionBodyEffectFullFactorParserRuleCall_2_1_0());
                    	    					
                    	    pushFollow(FOLLOW_30);
                    	    lv_functionChain_5_0=ruleCompositionFunctionBodyEffectFullFactor();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getCompositionFunctionBodyEffectRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"functionChain",
                    	    							lv_functionChain_5_0,
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

            }


            }


            	leaveRule();

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
    // InternalFPML.g:2068:1: entryRuleCompositionFunctionBodyEffectFullFactor returns [EObject current=null] : iv_ruleCompositionFunctionBodyEffectFullFactor= ruleCompositionFunctionBodyEffectFullFactor EOF ;
    public final EObject entryRuleCompositionFunctionBodyEffectFullFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositionFunctionBodyEffectFullFactor = null;


        try {
            // InternalFPML.g:2068:80: (iv_ruleCompositionFunctionBodyEffectFullFactor= ruleCompositionFunctionBodyEffectFullFactor EOF )
            // InternalFPML.g:2069:2: iv_ruleCompositionFunctionBodyEffectFullFactor= ruleCompositionFunctionBodyEffectFullFactor EOF
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
    // InternalFPML.g:2075:1: ruleCompositionFunctionBodyEffectFullFactor returns [EObject current=null] : ( (otherlv_0= '>>=' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= '>>=' ( (lv_primitiveElement_3_0= ruleEffectFullPrimitive ) ) ) | (otherlv_4= '>>=' ( (lv_expressionElement_5_0= ruleEffectFullExpression ) ) ) ) ;
    public final EObject ruleCompositionFunctionBodyEffectFullFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_primitiveElement_3_0 = null;

        EObject lv_expressionElement_5_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:2081:2: ( ( (otherlv_0= '>>=' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= '>>=' ( (lv_primitiveElement_3_0= ruleEffectFullPrimitive ) ) ) | (otherlv_4= '>>=' ( (lv_expressionElement_5_0= ruleEffectFullExpression ) ) ) ) )
            // InternalFPML.g:2082:2: ( (otherlv_0= '>>=' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= '>>=' ( (lv_primitiveElement_3_0= ruleEffectFullPrimitive ) ) ) | (otherlv_4= '>>=' ( (lv_expressionElement_5_0= ruleEffectFullExpression ) ) ) )
            {
            // InternalFPML.g:2082:2: ( (otherlv_0= '>>=' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= '>>=' ( (lv_primitiveElement_3_0= ruleEffectFullPrimitive ) ) ) | (otherlv_4= '>>=' ( (lv_expressionElement_5_0= ruleEffectFullExpression ) ) ) )
            int alt24=3;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==28) ) {
                switch ( input.LA(2) ) {
                case 24:
                case 39:
                case 43:
                case 45:
                case 46:
                case 49:
                case 50:
                    {
                    alt24=3;
                    }
                    break;
                case RULE_ID:
                    {
                    int LA24_3 = input.LA(3);

                    if ( (LA24_3==EOF||LA24_3==14||LA24_3==28) ) {
                        alt24=1;
                    }
                    else if ( (LA24_3==39) ) {
                        alt24=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case 55:
                case 56:
                case 64:
                case 65:
                case 66:
                case 69:
                case 70:
                case 71:
                case 72:
                case 73:
                case 74:
                case 75:
                    {
                    alt24=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalFPML.g:2083:3: (otherlv_0= '>>=' ( (otherlv_1= RULE_ID ) ) )
                    {
                    // InternalFPML.g:2083:3: (otherlv_0= '>>=' ( (otherlv_1= RULE_ID ) ) )
                    // InternalFPML.g:2084:4: otherlv_0= '>>=' ( (otherlv_1= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,28,FOLLOW_17); 

                    				newLeafNode(otherlv_0, grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getGreaterThanSignGreaterThanSignEqualsSignKeyword_0_0());
                    			
                    // InternalFPML.g:2088:4: ( (otherlv_1= RULE_ID ) )
                    // InternalFPML.g:2089:5: (otherlv_1= RULE_ID )
                    {
                    // InternalFPML.g:2089:5: (otherlv_1= RULE_ID )
                    // InternalFPML.g:2090:6: otherlv_1= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCompositionFunctionBodyEffectFullFactorRule());
                    						}
                    					
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_1, grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getReferenceElementEffectFullFunctionCrossReference_0_1_0());
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFPML.g:2103:3: (otherlv_2= '>>=' ( (lv_primitiveElement_3_0= ruleEffectFullPrimitive ) ) )
                    {
                    // InternalFPML.g:2103:3: (otherlv_2= '>>=' ( (lv_primitiveElement_3_0= ruleEffectFullPrimitive ) ) )
                    // InternalFPML.g:2104:4: otherlv_2= '>>=' ( (lv_primitiveElement_3_0= ruleEffectFullPrimitive ) )
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_31); 

                    				newLeafNode(otherlv_2, grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getGreaterThanSignGreaterThanSignEqualsSignKeyword_1_0());
                    			
                    // InternalFPML.g:2108:4: ( (lv_primitiveElement_3_0= ruleEffectFullPrimitive ) )
                    // InternalFPML.g:2109:5: (lv_primitiveElement_3_0= ruleEffectFullPrimitive )
                    {
                    // InternalFPML.g:2109:5: (lv_primitiveElement_3_0= ruleEffectFullPrimitive )
                    // InternalFPML.g:2110:6: lv_primitiveElement_3_0= ruleEffectFullPrimitive
                    {

                    						newCompositeNode(grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getPrimitiveElementEffectFullPrimitiveParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_primitiveElement_3_0=ruleEffectFullPrimitive();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompositionFunctionBodyEffectFullFactorRule());
                    						}
                    						set(
                    							current,
                    							"primitiveElement",
                    							lv_primitiveElement_3_0,
                    							"it.unibo.FPML.EffectFullPrimitive");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalFPML.g:2129:3: (otherlv_4= '>>=' ( (lv_expressionElement_5_0= ruleEffectFullExpression ) ) )
                    {
                    // InternalFPML.g:2129:3: (otherlv_4= '>>=' ( (lv_expressionElement_5_0= ruleEffectFullExpression ) ) )
                    // InternalFPML.g:2130:4: otherlv_4= '>>=' ( (lv_expressionElement_5_0= ruleEffectFullExpression ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getGreaterThanSignGreaterThanSignEqualsSignKeyword_2_0());
                    			
                    // InternalFPML.g:2134:4: ( (lv_expressionElement_5_0= ruleEffectFullExpression ) )
                    // InternalFPML.g:2135:5: (lv_expressionElement_5_0= ruleEffectFullExpression )
                    {
                    // InternalFPML.g:2135:5: (lv_expressionElement_5_0= ruleEffectFullExpression )
                    // InternalFPML.g:2136:6: lv_expressionElement_5_0= ruleEffectFullExpression
                    {

                    						newCompositeNode(grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getExpressionElementEffectFullExpressionParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expressionElement_5_0=ruleEffectFullExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompositionFunctionBodyEffectFullFactorRule());
                    						}
                    						set(
                    							current,
                    							"expressionElement",
                    							lv_expressionElement_5_0,
                    							"it.unibo.FPML.EffectFullExpression");
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
    // InternalFPML.g:2158:1: entryRuleIOType returns [EObject current=null] : iv_ruleIOType= ruleIOType EOF ;
    public final EObject entryRuleIOType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIOType = null;


        try {
            // InternalFPML.g:2158:47: (iv_ruleIOType= ruleIOType EOF )
            // InternalFPML.g:2159:2: iv_ruleIOType= ruleIOType EOF
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
    // InternalFPML.g:2165:1: ruleIOType returns [EObject current=null] : (otherlv_0= 'IO' ( (lv_type_1_0= ruleType ) ) ) ;
    public final EObject ruleIOType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:2171:2: ( (otherlv_0= 'IO' ( (lv_type_1_0= ruleType ) ) ) )
            // InternalFPML.g:2172:2: (otherlv_0= 'IO' ( (lv_type_1_0= ruleType ) ) )
            {
            // InternalFPML.g:2172:2: (otherlv_0= 'IO' ( (lv_type_1_0= ruleType ) ) )
            // InternalFPML.g:2173:3: otherlv_0= 'IO' ( (lv_type_1_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getIOTypeAccess().getIOKeyword_0());
            		
            // InternalFPML.g:2177:3: ( (lv_type_1_0= ruleType ) )
            // InternalFPML.g:2178:4: (lv_type_1_0= ruleType )
            {
            // InternalFPML.g:2178:4: (lv_type_1_0= ruleType )
            // InternalFPML.g:2179:5: lv_type_1_0= ruleType
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
    // InternalFPML.g:2200:1: entryRuleValueType returns [EObject current=null] : iv_ruleValueType= ruleValueType EOF ;
    public final EObject entryRuleValueType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueType = null;


        try {
            // InternalFPML.g:2200:50: (iv_ruleValueType= ruleValueType EOF )
            // InternalFPML.g:2201:2: iv_ruleValueType= ruleValueType EOF
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
    // InternalFPML.g:2207:1: ruleValueType returns [EObject current=null] : (this_IntegerType_0= ruleIntegerType | this_StringType_1= ruleStringType | this_BooleanType_2= ruleBooleanType | this_DataType_3= ruleDataType | this_PureFunctionType_4= rulePureFunctionType | this_PureAlgebraicType_5= rulePureAlgebraicType | this_UnitType_6= ruleUnitType ) ;
    public final EObject ruleValueType() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerType_0 = null;

        EObject this_StringType_1 = null;

        EObject this_BooleanType_2 = null;

        EObject this_DataType_3 = null;

        EObject this_PureFunctionType_4 = null;

        EObject this_PureAlgebraicType_5 = null;

        EObject this_UnitType_6 = null;



        	enterRule();

        try {
            // InternalFPML.g:2213:2: ( (this_IntegerType_0= ruleIntegerType | this_StringType_1= ruleStringType | this_BooleanType_2= ruleBooleanType | this_DataType_3= ruleDataType | this_PureFunctionType_4= rulePureFunctionType | this_PureAlgebraicType_5= rulePureAlgebraicType | this_UnitType_6= ruleUnitType ) )
            // InternalFPML.g:2214:2: (this_IntegerType_0= ruleIntegerType | this_StringType_1= ruleStringType | this_BooleanType_2= ruleBooleanType | this_DataType_3= ruleDataType | this_PureFunctionType_4= rulePureFunctionType | this_PureAlgebraicType_5= rulePureAlgebraicType | this_UnitType_6= ruleUnitType )
            {
            // InternalFPML.g:2214:2: (this_IntegerType_0= ruleIntegerType | this_StringType_1= ruleStringType | this_BooleanType_2= ruleBooleanType | this_DataType_3= ruleDataType | this_PureFunctionType_4= rulePureFunctionType | this_PureAlgebraicType_5= rulePureAlgebraicType | this_UnitType_6= ruleUnitType )
            int alt25=7;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt25=1;
                }
                break;
            case 30:
                {
                alt25=2;
                }
                break;
            case 31:
                {
                alt25=3;
                }
                break;
            case 33:
                {
                alt25=4;
                }
                break;
            case 35:
                {
                alt25=5;
                }
                break;
            case 39:
                {
                alt25=6;
                }
                break;
            case 32:
                {
                alt25=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalFPML.g:2215:3: this_IntegerType_0= ruleIntegerType
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
                    // InternalFPML.g:2224:3: this_StringType_1= ruleStringType
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
                    // InternalFPML.g:2233:3: this_BooleanType_2= ruleBooleanType
                    {

                    			newCompositeNode(grammarAccess.getValueTypeAccess().getBooleanTypeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanType_2=ruleBooleanType();

                    state._fsp--;


                    			current = this_BooleanType_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalFPML.g:2242:3: this_DataType_3= ruleDataType
                    {

                    			newCompositeNode(grammarAccess.getValueTypeAccess().getDataTypeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataType_3=ruleDataType();

                    state._fsp--;


                    			current = this_DataType_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalFPML.g:2251:3: this_PureFunctionType_4= rulePureFunctionType
                    {

                    			newCompositeNode(grammarAccess.getValueTypeAccess().getPureFunctionTypeParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_PureFunctionType_4=rulePureFunctionType();

                    state._fsp--;


                    			current = this_PureFunctionType_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalFPML.g:2260:3: this_PureAlgebraicType_5= rulePureAlgebraicType
                    {

                    			newCompositeNode(grammarAccess.getValueTypeAccess().getPureAlgebraicTypeParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_PureAlgebraicType_5=rulePureAlgebraicType();

                    state._fsp--;


                    			current = this_PureAlgebraicType_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalFPML.g:2269:3: this_UnitType_6= ruleUnitType
                    {

                    			newCompositeNode(grammarAccess.getValueTypeAccess().getUnitTypeParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_UnitType_6=ruleUnitType();

                    state._fsp--;


                    			current = this_UnitType_6;
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
    // InternalFPML.g:2281:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalFPML.g:2281:45: (iv_ruleType= ruleType EOF )
            // InternalFPML.g:2282:2: iv_ruleType= ruleType EOF
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
    // InternalFPML.g:2288:1: ruleType returns [EObject current=null] : (this_ValueType_0= ruleValueType | this_EffectFullType_1= ruleEffectFullType ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_ValueType_0 = null;

        EObject this_EffectFullType_1 = null;



        	enterRule();

        try {
            // InternalFPML.g:2294:2: ( (this_ValueType_0= ruleValueType | this_EffectFullType_1= ruleEffectFullType ) )
            // InternalFPML.g:2295:2: (this_ValueType_0= ruleValueType | this_EffectFullType_1= ruleEffectFullType )
            {
            // InternalFPML.g:2295:2: (this_ValueType_0= ruleValueType | this_EffectFullType_1= ruleEffectFullType )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=29 && LA26_0<=33)||LA26_0==35||LA26_0==39) ) {
                alt26=1;
            }
            else if ( (LA26_0==EOF||LA26_0==RULE_ID||(LA26_0>=13 && LA26_0<=14)||LA26_0==17||LA26_0==22||LA26_0==24||LA26_0==28||LA26_0==34||(LA26_0>=37 && LA26_0<=38)||(LA26_0>=40 && LA26_0<=42)) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalFPML.g:2296:3: this_ValueType_0= ruleValueType
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
                    // InternalFPML.g:2305:3: this_EffectFullType_1= ruleEffectFullType
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
    // InternalFPML.g:2317:1: entryRuleEffectFullType returns [EObject current=null] : iv_ruleEffectFullType= ruleEffectFullType EOF ;
    public final EObject entryRuleEffectFullType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullType = null;


        try {
            // InternalFPML.g:2317:55: (iv_ruleEffectFullType= ruleEffectFullType EOF )
            // InternalFPML.g:2318:2: iv_ruleEffectFullType= ruleEffectFullType EOF
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
    // InternalFPML.g:2324:1: ruleEffectFullType returns [EObject current=null] : (this_EffectFullFunctionType_0= ruleEffectFullFunctionType | this_EffectFullDataType_1= ruleEffectFullDataType | this_EffectFullAlgebraicType_2= ruleEffectFullAlgebraicType | this_IOType_3= ruleIOType | this_VoidType_4= ruleVoidType ) ;
    public final EObject ruleEffectFullType() throws RecognitionException {
        EObject current = null;

        EObject this_EffectFullFunctionType_0 = null;

        EObject this_EffectFullDataType_1 = null;

        EObject this_EffectFullAlgebraicType_2 = null;

        EObject this_IOType_3 = null;

        EObject this_VoidType_4 = null;



        	enterRule();

        try {
            // InternalFPML.g:2330:2: ( (this_EffectFullFunctionType_0= ruleEffectFullFunctionType | this_EffectFullDataType_1= ruleEffectFullDataType | this_EffectFullAlgebraicType_2= ruleEffectFullAlgebraicType | this_IOType_3= ruleIOType | this_VoidType_4= ruleVoidType ) )
            // InternalFPML.g:2331:2: (this_EffectFullFunctionType_0= ruleEffectFullFunctionType | this_EffectFullDataType_1= ruleEffectFullDataType | this_EffectFullAlgebraicType_2= ruleEffectFullAlgebraicType | this_IOType_3= ruleIOType | this_VoidType_4= ruleVoidType )
            {
            // InternalFPML.g:2331:2: (this_EffectFullFunctionType_0= ruleEffectFullFunctionType | this_EffectFullDataType_1= ruleEffectFullDataType | this_EffectFullAlgebraicType_2= ruleEffectFullAlgebraicType | this_IOType_3= ruleIOType | this_VoidType_4= ruleVoidType )
            int alt27=5;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt27=1;
                }
                break;
            case 34:
                {
                alt27=2;
                }
                break;
            case 13:
                {
                alt27=3;
                }
                break;
            case 24:
                {
                alt27=4;
                }
                break;
            case EOF:
            case RULE_ID:
            case 14:
            case 17:
            case 22:
            case 28:
            case 37:
            case 40:
            case 41:
            case 42:
                {
                alt27=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalFPML.g:2332:3: this_EffectFullFunctionType_0= ruleEffectFullFunctionType
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
                    // InternalFPML.g:2341:3: this_EffectFullDataType_1= ruleEffectFullDataType
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
                    // InternalFPML.g:2350:3: this_EffectFullAlgebraicType_2= ruleEffectFullAlgebraicType
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
                    // InternalFPML.g:2359:3: this_IOType_3= ruleIOType
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
                    // InternalFPML.g:2368:3: this_VoidType_4= ruleVoidType
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
    // InternalFPML.g:2380:1: entryRuleVoidType returns [EObject current=null] : iv_ruleVoidType= ruleVoidType EOF ;
    public final EObject entryRuleVoidType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVoidType = null;


        try {
            // InternalFPML.g:2380:49: (iv_ruleVoidType= ruleVoidType EOF )
            // InternalFPML.g:2381:2: iv_ruleVoidType= ruleVoidType EOF
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
    // InternalFPML.g:2387:1: ruleVoidType returns [EObject current=null] : () ;
    public final EObject ruleVoidType() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalFPML.g:2393:2: ( () )
            // InternalFPML.g:2394:2: ()
            {
            // InternalFPML.g:2394:2: ()
            // InternalFPML.g:2395:3: 
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
    // InternalFPML.g:2404:1: entryRuleIntegerType returns [EObject current=null] : iv_ruleIntegerType= ruleIntegerType EOF ;
    public final EObject entryRuleIntegerType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerType = null;


        try {
            // InternalFPML.g:2404:52: (iv_ruleIntegerType= ruleIntegerType EOF )
            // InternalFPML.g:2405:2: iv_ruleIntegerType= ruleIntegerType EOF
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
    // InternalFPML.g:2411:1: ruleIntegerType returns [EObject current=null] : ( () ( (lv_type_1_0= 'int' ) ) ) ;
    public final EObject ruleIntegerType() throws RecognitionException {
        EObject current = null;

        Token lv_type_1_0=null;


        	enterRule();

        try {
            // InternalFPML.g:2417:2: ( ( () ( (lv_type_1_0= 'int' ) ) ) )
            // InternalFPML.g:2418:2: ( () ( (lv_type_1_0= 'int' ) ) )
            {
            // InternalFPML.g:2418:2: ( () ( (lv_type_1_0= 'int' ) ) )
            // InternalFPML.g:2419:3: () ( (lv_type_1_0= 'int' ) )
            {
            // InternalFPML.g:2419:3: ()
            // InternalFPML.g:2420:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntegerTypeAccess().getIntegerTypeAction_0(),
            					current);
            			

            }

            // InternalFPML.g:2426:3: ( (lv_type_1_0= 'int' ) )
            // InternalFPML.g:2427:4: (lv_type_1_0= 'int' )
            {
            // InternalFPML.g:2427:4: (lv_type_1_0= 'int' )
            // InternalFPML.g:2428:5: lv_type_1_0= 'int'
            {
            lv_type_1_0=(Token)match(input,29,FOLLOW_2); 

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
    // InternalFPML.g:2444:1: entryRuleStringType returns [EObject current=null] : iv_ruleStringType= ruleStringType EOF ;
    public final EObject entryRuleStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringType = null;


        try {
            // InternalFPML.g:2444:51: (iv_ruleStringType= ruleStringType EOF )
            // InternalFPML.g:2445:2: iv_ruleStringType= ruleStringType EOF
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
    // InternalFPML.g:2451:1: ruleStringType returns [EObject current=null] : ( () ( (lv_type_1_0= 'String' ) ) ) ;
    public final EObject ruleStringType() throws RecognitionException {
        EObject current = null;

        Token lv_type_1_0=null;


        	enterRule();

        try {
            // InternalFPML.g:2457:2: ( ( () ( (lv_type_1_0= 'String' ) ) ) )
            // InternalFPML.g:2458:2: ( () ( (lv_type_1_0= 'String' ) ) )
            {
            // InternalFPML.g:2458:2: ( () ( (lv_type_1_0= 'String' ) ) )
            // InternalFPML.g:2459:3: () ( (lv_type_1_0= 'String' ) )
            {
            // InternalFPML.g:2459:3: ()
            // InternalFPML.g:2460:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStringTypeAccess().getStringTypeAction_0(),
            					current);
            			

            }

            // InternalFPML.g:2466:3: ( (lv_type_1_0= 'String' ) )
            // InternalFPML.g:2467:4: (lv_type_1_0= 'String' )
            {
            // InternalFPML.g:2467:4: (lv_type_1_0= 'String' )
            // InternalFPML.g:2468:5: lv_type_1_0= 'String'
            {
            lv_type_1_0=(Token)match(input,30,FOLLOW_2); 

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


    // $ANTLR start "entryRuleBooleanType"
    // InternalFPML.g:2484:1: entryRuleBooleanType returns [EObject current=null] : iv_ruleBooleanType= ruleBooleanType EOF ;
    public final EObject entryRuleBooleanType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanType = null;


        try {
            // InternalFPML.g:2484:52: (iv_ruleBooleanType= ruleBooleanType EOF )
            // InternalFPML.g:2485:2: iv_ruleBooleanType= ruleBooleanType EOF
            {
             newCompositeNode(grammarAccess.getBooleanTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanType=ruleBooleanType();

            state._fsp--;

             current =iv_ruleBooleanType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanType"


    // $ANTLR start "ruleBooleanType"
    // InternalFPML.g:2491:1: ruleBooleanType returns [EObject current=null] : ( () ( (lv_type_1_0= 'boolean' ) ) ) ;
    public final EObject ruleBooleanType() throws RecognitionException {
        EObject current = null;

        Token lv_type_1_0=null;


        	enterRule();

        try {
            // InternalFPML.g:2497:2: ( ( () ( (lv_type_1_0= 'boolean' ) ) ) )
            // InternalFPML.g:2498:2: ( () ( (lv_type_1_0= 'boolean' ) ) )
            {
            // InternalFPML.g:2498:2: ( () ( (lv_type_1_0= 'boolean' ) ) )
            // InternalFPML.g:2499:3: () ( (lv_type_1_0= 'boolean' ) )
            {
            // InternalFPML.g:2499:3: ()
            // InternalFPML.g:2500:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBooleanTypeAccess().getBooleanTypeAction_0(),
            					current);
            			

            }

            // InternalFPML.g:2506:3: ( (lv_type_1_0= 'boolean' ) )
            // InternalFPML.g:2507:4: (lv_type_1_0= 'boolean' )
            {
            // InternalFPML.g:2507:4: (lv_type_1_0= 'boolean' )
            // InternalFPML.g:2508:5: lv_type_1_0= 'boolean'
            {
            lv_type_1_0=(Token)match(input,31,FOLLOW_2); 

            					newLeafNode(lv_type_1_0, grammarAccess.getBooleanTypeAccess().getTypeBooleanKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBooleanTypeRule());
            					}
            					setWithLastConsumed(current, "type", lv_type_1_0, "boolean");
            				

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
    // $ANTLR end "ruleBooleanType"


    // $ANTLR start "entryRuleUnitType"
    // InternalFPML.g:2524:1: entryRuleUnitType returns [EObject current=null] : iv_ruleUnitType= ruleUnitType EOF ;
    public final EObject entryRuleUnitType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnitType = null;


        try {
            // InternalFPML.g:2524:49: (iv_ruleUnitType= ruleUnitType EOF )
            // InternalFPML.g:2525:2: iv_ruleUnitType= ruleUnitType EOF
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
    // InternalFPML.g:2531:1: ruleUnitType returns [EObject current=null] : ( () ( (lv_type_1_0= 'Unit' ) ) ) ;
    public final EObject ruleUnitType() throws RecognitionException {
        EObject current = null;

        Token lv_type_1_0=null;


        	enterRule();

        try {
            // InternalFPML.g:2537:2: ( ( () ( (lv_type_1_0= 'Unit' ) ) ) )
            // InternalFPML.g:2538:2: ( () ( (lv_type_1_0= 'Unit' ) ) )
            {
            // InternalFPML.g:2538:2: ( () ( (lv_type_1_0= 'Unit' ) ) )
            // InternalFPML.g:2539:3: () ( (lv_type_1_0= 'Unit' ) )
            {
            // InternalFPML.g:2539:3: ()
            // InternalFPML.g:2540:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUnitTypeAccess().getUnitTypeAction_0(),
            					current);
            			

            }

            // InternalFPML.g:2546:3: ( (lv_type_1_0= 'Unit' ) )
            // InternalFPML.g:2547:4: (lv_type_1_0= 'Unit' )
            {
            // InternalFPML.g:2547:4: (lv_type_1_0= 'Unit' )
            // InternalFPML.g:2548:5: lv_type_1_0= 'Unit'
            {
            lv_type_1_0=(Token)match(input,32,FOLLOW_2); 

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
    // InternalFPML.g:2564:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalFPML.g:2564:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalFPML.g:2565:2: iv_ruleDataType= ruleDataType EOF
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
    // InternalFPML.g:2571:1: ruleDataType returns [EObject current=null] : ( () otherlv_1= 'ref' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalFPML.g:2577:2: ( ( () otherlv_1= 'ref' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalFPML.g:2578:2: ( () otherlv_1= 'ref' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalFPML.g:2578:2: ( () otherlv_1= 'ref' ( (otherlv_2= RULE_ID ) ) )
            // InternalFPML.g:2579:3: () otherlv_1= 'ref' ( (otherlv_2= RULE_ID ) )
            {
            // InternalFPML.g:2579:3: ()
            // InternalFPML.g:2580:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDataTypeAccess().getDataTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getDataTypeAccess().getRefKeyword_1());
            		
            // InternalFPML.g:2590:3: ( (otherlv_2= RULE_ID ) )
            // InternalFPML.g:2591:4: (otherlv_2= RULE_ID )
            {
            // InternalFPML.g:2591:4: (otherlv_2= RULE_ID )
            // InternalFPML.g:2592:5: otherlv_2= RULE_ID
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
    // InternalFPML.g:2607:1: entryRuleEffectFullDataType returns [EObject current=null] : iv_ruleEffectFullDataType= ruleEffectFullDataType EOF ;
    public final EObject entryRuleEffectFullDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullDataType = null;


        try {
            // InternalFPML.g:2607:59: (iv_ruleEffectFullDataType= ruleEffectFullDataType EOF )
            // InternalFPML.g:2608:2: iv_ruleEffectFullDataType= ruleEffectFullDataType EOF
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
    // InternalFPML.g:2614:1: ruleEffectFullDataType returns [EObject current=null] : ( () otherlv_1= 'refIO' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleEffectFullDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalFPML.g:2620:2: ( ( () otherlv_1= 'refIO' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalFPML.g:2621:2: ( () otherlv_1= 'refIO' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalFPML.g:2621:2: ( () otherlv_1= 'refIO' ( (otherlv_2= RULE_ID ) ) )
            // InternalFPML.g:2622:3: () otherlv_1= 'refIO' ( (otherlv_2= RULE_ID ) )
            {
            // InternalFPML.g:2622:3: ()
            // InternalFPML.g:2623:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEffectFullDataTypeAccess().getEffectFullDataTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getEffectFullDataTypeAccess().getRefIOKeyword_1());
            		
            // InternalFPML.g:2633:3: ( (otherlv_2= RULE_ID ) )
            // InternalFPML.g:2634:4: (otherlv_2= RULE_ID )
            {
            // InternalFPML.g:2634:4: (otherlv_2= RULE_ID )
            // InternalFPML.g:2635:5: otherlv_2= RULE_ID
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
    // InternalFPML.g:2650:1: entryRulePureFunctionType returns [EObject current=null] : iv_rulePureFunctionType= rulePureFunctionType EOF ;
    public final EObject entryRulePureFunctionType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePureFunctionType = null;


        try {
            // InternalFPML.g:2650:57: (iv_rulePureFunctionType= rulePureFunctionType EOF )
            // InternalFPML.g:2651:2: iv_rulePureFunctionType= rulePureFunctionType EOF
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
    // InternalFPML.g:2657:1: rulePureFunctionType returns [EObject current=null] : ( () otherlv_1= 'F' otherlv_2= '<' ( (lv_argType_3_0= ruleValueType ) ) otherlv_4= ',' ( (lv_returnType_5_0= ruleValueType ) ) otherlv_6= '>' ) ;
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
            // InternalFPML.g:2663:2: ( ( () otherlv_1= 'F' otherlv_2= '<' ( (lv_argType_3_0= ruleValueType ) ) otherlv_4= ',' ( (lv_returnType_5_0= ruleValueType ) ) otherlv_6= '>' ) )
            // InternalFPML.g:2664:2: ( () otherlv_1= 'F' otherlv_2= '<' ( (lv_argType_3_0= ruleValueType ) ) otherlv_4= ',' ( (lv_returnType_5_0= ruleValueType ) ) otherlv_6= '>' )
            {
            // InternalFPML.g:2664:2: ( () otherlv_1= 'F' otherlv_2= '<' ( (lv_argType_3_0= ruleValueType ) ) otherlv_4= ',' ( (lv_returnType_5_0= ruleValueType ) ) otherlv_6= '>' )
            // InternalFPML.g:2665:3: () otherlv_1= 'F' otherlv_2= '<' ( (lv_argType_3_0= ruleValueType ) ) otherlv_4= ',' ( (lv_returnType_5_0= ruleValueType ) ) otherlv_6= '>'
            {
            // InternalFPML.g:2665:3: ()
            // InternalFPML.g:2666:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPureFunctionTypeAccess().getPureFunctionTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getPureFunctionTypeAccess().getFKeyword_1());
            		
            otherlv_2=(Token)match(input,36,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getPureFunctionTypeAccess().getLessThanSignKeyword_2());
            		
            // InternalFPML.g:2680:3: ( (lv_argType_3_0= ruleValueType ) )
            // InternalFPML.g:2681:4: (lv_argType_3_0= ruleValueType )
            {
            // InternalFPML.g:2681:4: (lv_argType_3_0= ruleValueType )
            // InternalFPML.g:2682:5: lv_argType_3_0= ruleValueType
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

            otherlv_4=(Token)match(input,22,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getPureFunctionTypeAccess().getCommaKeyword_4());
            		
            // InternalFPML.g:2703:3: ( (lv_returnType_5_0= ruleValueType ) )
            // InternalFPML.g:2704:4: (lv_returnType_5_0= ruleValueType )
            {
            // InternalFPML.g:2704:4: (lv_returnType_5_0= ruleValueType )
            // InternalFPML.g:2705:5: lv_returnType_5_0= ruleValueType
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

            otherlv_6=(Token)match(input,37,FOLLOW_2); 

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
    // InternalFPML.g:2730:1: entryRuleEffectFullFunctionType returns [EObject current=null] : iv_ruleEffectFullFunctionType= ruleEffectFullFunctionType EOF ;
    public final EObject entryRuleEffectFullFunctionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullFunctionType = null;


        try {
            // InternalFPML.g:2730:63: (iv_ruleEffectFullFunctionType= ruleEffectFullFunctionType EOF )
            // InternalFPML.g:2731:2: iv_ruleEffectFullFunctionType= ruleEffectFullFunctionType EOF
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
    // InternalFPML.g:2737:1: ruleEffectFullFunctionType returns [EObject current=null] : ( () otherlv_1= 'FIO' otherlv_2= '<' ( (lv_argType_3_0= ruleType ) ) otherlv_4= ',' ( (lv_returnType_5_0= ruleIOType ) ) otherlv_6= '>' ) ;
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
            // InternalFPML.g:2743:2: ( ( () otherlv_1= 'FIO' otherlv_2= '<' ( (lv_argType_3_0= ruleType ) ) otherlv_4= ',' ( (lv_returnType_5_0= ruleIOType ) ) otherlv_6= '>' ) )
            // InternalFPML.g:2744:2: ( () otherlv_1= 'FIO' otherlv_2= '<' ( (lv_argType_3_0= ruleType ) ) otherlv_4= ',' ( (lv_returnType_5_0= ruleIOType ) ) otherlv_6= '>' )
            {
            // InternalFPML.g:2744:2: ( () otherlv_1= 'FIO' otherlv_2= '<' ( (lv_argType_3_0= ruleType ) ) otherlv_4= ',' ( (lv_returnType_5_0= ruleIOType ) ) otherlv_6= '>' )
            // InternalFPML.g:2745:3: () otherlv_1= 'FIO' otherlv_2= '<' ( (lv_argType_3_0= ruleType ) ) otherlv_4= ',' ( (lv_returnType_5_0= ruleIOType ) ) otherlv_6= '>'
            {
            // InternalFPML.g:2745:3: ()
            // InternalFPML.g:2746:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEffectFullFunctionTypeAccess().getEffectFullFunctionTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,38,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getEffectFullFunctionTypeAccess().getFIOKeyword_1());
            		
            otherlv_2=(Token)match(input,36,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getEffectFullFunctionTypeAccess().getLessThanSignKeyword_2());
            		
            // InternalFPML.g:2760:3: ( (lv_argType_3_0= ruleType ) )
            // InternalFPML.g:2761:4: (lv_argType_3_0= ruleType )
            {
            // InternalFPML.g:2761:4: (lv_argType_3_0= ruleType )
            // InternalFPML.g:2762:5: lv_argType_3_0= ruleType
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

            otherlv_4=(Token)match(input,22,FOLLOW_22); 

            			newLeafNode(otherlv_4, grammarAccess.getEffectFullFunctionTypeAccess().getCommaKeyword_4());
            		
            // InternalFPML.g:2783:3: ( (lv_returnType_5_0= ruleIOType ) )
            // InternalFPML.g:2784:4: (lv_returnType_5_0= ruleIOType )
            {
            // InternalFPML.g:2784:4: (lv_returnType_5_0= ruleIOType )
            // InternalFPML.g:2785:5: lv_returnType_5_0= ruleIOType
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

            otherlv_6=(Token)match(input,37,FOLLOW_2); 

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
    // InternalFPML.g:2810:1: entryRulePureAlgebraicType returns [EObject current=null] : iv_rulePureAlgebraicType= rulePureAlgebraicType EOF ;
    public final EObject entryRulePureAlgebraicType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePureAlgebraicType = null;


        try {
            // InternalFPML.g:2810:58: (iv_rulePureAlgebraicType= rulePureAlgebraicType EOF )
            // InternalFPML.g:2811:2: iv_rulePureAlgebraicType= rulePureAlgebraicType EOF
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
    // InternalFPML.g:2817:1: rulePureAlgebraicType returns [EObject current=null] : (otherlv_0= '[' ( (lv_pureAdtElement1_1_0= ruleValueType ) ) ( ( (lv_pureAdtElement2_2_1= rulePureSumTypeFactor | lv_pureAdtElement2_2_2= rulePureProdTypeFactor ) ) ) otherlv_3= ']' ) ;
    public final EObject rulePureAlgebraicType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_pureAdtElement1_1_0 = null;

        EObject lv_pureAdtElement2_2_1 = null;

        EObject lv_pureAdtElement2_2_2 = null;



        	enterRule();

        try {
            // InternalFPML.g:2823:2: ( (otherlv_0= '[' ( (lv_pureAdtElement1_1_0= ruleValueType ) ) ( ( (lv_pureAdtElement2_2_1= rulePureSumTypeFactor | lv_pureAdtElement2_2_2= rulePureProdTypeFactor ) ) ) otherlv_3= ']' ) )
            // InternalFPML.g:2824:2: (otherlv_0= '[' ( (lv_pureAdtElement1_1_0= ruleValueType ) ) ( ( (lv_pureAdtElement2_2_1= rulePureSumTypeFactor | lv_pureAdtElement2_2_2= rulePureProdTypeFactor ) ) ) otherlv_3= ']' )
            {
            // InternalFPML.g:2824:2: (otherlv_0= '[' ( (lv_pureAdtElement1_1_0= ruleValueType ) ) ( ( (lv_pureAdtElement2_2_1= rulePureSumTypeFactor | lv_pureAdtElement2_2_2= rulePureProdTypeFactor ) ) ) otherlv_3= ']' )
            // InternalFPML.g:2825:3: otherlv_0= '[' ( (lv_pureAdtElement1_1_0= ruleValueType ) ) ( ( (lv_pureAdtElement2_2_1= rulePureSumTypeFactor | lv_pureAdtElement2_2_2= rulePureProdTypeFactor ) ) ) otherlv_3= ']'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getPureAlgebraicTypeAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalFPML.g:2829:3: ( (lv_pureAdtElement1_1_0= ruleValueType ) )
            // InternalFPML.g:2830:4: (lv_pureAdtElement1_1_0= ruleValueType )
            {
            // InternalFPML.g:2830:4: (lv_pureAdtElement1_1_0= ruleValueType )
            // InternalFPML.g:2831:5: lv_pureAdtElement1_1_0= ruleValueType
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

            // InternalFPML.g:2848:3: ( ( (lv_pureAdtElement2_2_1= rulePureSumTypeFactor | lv_pureAdtElement2_2_2= rulePureProdTypeFactor ) ) )
            // InternalFPML.g:2849:4: ( (lv_pureAdtElement2_2_1= rulePureSumTypeFactor | lv_pureAdtElement2_2_2= rulePureProdTypeFactor ) )
            {
            // InternalFPML.g:2849:4: ( (lv_pureAdtElement2_2_1= rulePureSumTypeFactor | lv_pureAdtElement2_2_2= rulePureProdTypeFactor ) )
            // InternalFPML.g:2850:5: (lv_pureAdtElement2_2_1= rulePureSumTypeFactor | lv_pureAdtElement2_2_2= rulePureProdTypeFactor )
            {
            // InternalFPML.g:2850:5: (lv_pureAdtElement2_2_1= rulePureSumTypeFactor | lv_pureAdtElement2_2_2= rulePureProdTypeFactor )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==41) ) {
                alt28=1;
            }
            else if ( (LA28_0==42) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalFPML.g:2851:6: lv_pureAdtElement2_2_1= rulePureSumTypeFactor
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
                    // InternalFPML.g:2867:6: lv_pureAdtElement2_2_2= rulePureProdTypeFactor
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

            otherlv_3=(Token)match(input,40,FOLLOW_2); 

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
    // InternalFPML.g:2893:1: entryRulePureSumTypeFactor returns [EObject current=null] : iv_rulePureSumTypeFactor= rulePureSumTypeFactor EOF ;
    public final EObject entryRulePureSumTypeFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePureSumTypeFactor = null;


        try {
            // InternalFPML.g:2893:58: (iv_rulePureSumTypeFactor= rulePureSumTypeFactor EOF )
            // InternalFPML.g:2894:2: iv_rulePureSumTypeFactor= rulePureSumTypeFactor EOF
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
    // InternalFPML.g:2900:1: rulePureSumTypeFactor returns [EObject current=null] : (otherlv_0= '+' ( (lv_adtElement_1_0= ruleValueType ) ) ) ;
    public final EObject rulePureSumTypeFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_adtElement_1_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:2906:2: ( (otherlv_0= '+' ( (lv_adtElement_1_0= ruleValueType ) ) ) )
            // InternalFPML.g:2907:2: (otherlv_0= '+' ( (lv_adtElement_1_0= ruleValueType ) ) )
            {
            // InternalFPML.g:2907:2: (otherlv_0= '+' ( (lv_adtElement_1_0= ruleValueType ) ) )
            // InternalFPML.g:2908:3: otherlv_0= '+' ( (lv_adtElement_1_0= ruleValueType ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getPureSumTypeFactorAccess().getPlusSignKeyword_0());
            		
            // InternalFPML.g:2912:3: ( (lv_adtElement_1_0= ruleValueType ) )
            // InternalFPML.g:2913:4: (lv_adtElement_1_0= ruleValueType )
            {
            // InternalFPML.g:2913:4: (lv_adtElement_1_0= ruleValueType )
            // InternalFPML.g:2914:5: lv_adtElement_1_0= ruleValueType
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
    // InternalFPML.g:2935:1: entryRulePureProdTypeFactor returns [EObject current=null] : iv_rulePureProdTypeFactor= rulePureProdTypeFactor EOF ;
    public final EObject entryRulePureProdTypeFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePureProdTypeFactor = null;


        try {
            // InternalFPML.g:2935:59: (iv_rulePureProdTypeFactor= rulePureProdTypeFactor EOF )
            // InternalFPML.g:2936:2: iv_rulePureProdTypeFactor= rulePureProdTypeFactor EOF
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
    // InternalFPML.g:2942:1: rulePureProdTypeFactor returns [EObject current=null] : (otherlv_0= '*' ( (lv_adtElement_1_0= ruleValueType ) ) ) ;
    public final EObject rulePureProdTypeFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_adtElement_1_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:2948:2: ( (otherlv_0= '*' ( (lv_adtElement_1_0= ruleValueType ) ) ) )
            // InternalFPML.g:2949:2: (otherlv_0= '*' ( (lv_adtElement_1_0= ruleValueType ) ) )
            {
            // InternalFPML.g:2949:2: (otherlv_0= '*' ( (lv_adtElement_1_0= ruleValueType ) ) )
            // InternalFPML.g:2950:3: otherlv_0= '*' ( (lv_adtElement_1_0= ruleValueType ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getPureProdTypeFactorAccess().getAsteriskKeyword_0());
            		
            // InternalFPML.g:2954:3: ( (lv_adtElement_1_0= ruleValueType ) )
            // InternalFPML.g:2955:4: (lv_adtElement_1_0= ruleValueType )
            {
            // InternalFPML.g:2955:4: (lv_adtElement_1_0= ruleValueType )
            // InternalFPML.g:2956:5: lv_adtElement_1_0= ruleValueType
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
    // InternalFPML.g:2977:1: entryRuleEffectFullAlgebraicType returns [EObject current=null] : iv_ruleEffectFullAlgebraicType= ruleEffectFullAlgebraicType EOF ;
    public final EObject entryRuleEffectFullAlgebraicType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullAlgebraicType = null;


        try {
            // InternalFPML.g:2977:64: (iv_ruleEffectFullAlgebraicType= ruleEffectFullAlgebraicType EOF )
            // InternalFPML.g:2978:2: iv_ruleEffectFullAlgebraicType= ruleEffectFullAlgebraicType EOF
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
    // InternalFPML.g:2984:1: ruleEffectFullAlgebraicType returns [EObject current=null] : (otherlv_0= '{' ( (lv_effectFullAdtElement1_1_0= ruleType ) ) ( ( (lv_effectFullAdtElement2_2_1= ruleEffectFullSumTypeFactor | lv_effectFullAdtElement2_2_2= ruleEffectFullProdTypeFactor ) ) ) otherlv_3= '}' ) ;
    public final EObject ruleEffectFullAlgebraicType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_effectFullAdtElement1_1_0 = null;

        EObject lv_effectFullAdtElement2_2_1 = null;

        EObject lv_effectFullAdtElement2_2_2 = null;



        	enterRule();

        try {
            // InternalFPML.g:2990:2: ( (otherlv_0= '{' ( (lv_effectFullAdtElement1_1_0= ruleType ) ) ( ( (lv_effectFullAdtElement2_2_1= ruleEffectFullSumTypeFactor | lv_effectFullAdtElement2_2_2= ruleEffectFullProdTypeFactor ) ) ) otherlv_3= '}' ) )
            // InternalFPML.g:2991:2: (otherlv_0= '{' ( (lv_effectFullAdtElement1_1_0= ruleType ) ) ( ( (lv_effectFullAdtElement2_2_1= ruleEffectFullSumTypeFactor | lv_effectFullAdtElement2_2_2= ruleEffectFullProdTypeFactor ) ) ) otherlv_3= '}' )
            {
            // InternalFPML.g:2991:2: (otherlv_0= '{' ( (lv_effectFullAdtElement1_1_0= ruleType ) ) ( ( (lv_effectFullAdtElement2_2_1= ruleEffectFullSumTypeFactor | lv_effectFullAdtElement2_2_2= ruleEffectFullProdTypeFactor ) ) ) otherlv_3= '}' )
            // InternalFPML.g:2992:3: otherlv_0= '{' ( (lv_effectFullAdtElement1_1_0= ruleType ) ) ( ( (lv_effectFullAdtElement2_2_1= ruleEffectFullSumTypeFactor | lv_effectFullAdtElement2_2_2= ruleEffectFullProdTypeFactor ) ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getEffectFullAlgebraicTypeAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalFPML.g:2996:3: ( (lv_effectFullAdtElement1_1_0= ruleType ) )
            // InternalFPML.g:2997:4: (lv_effectFullAdtElement1_1_0= ruleType )
            {
            // InternalFPML.g:2997:4: (lv_effectFullAdtElement1_1_0= ruleType )
            // InternalFPML.g:2998:5: lv_effectFullAdtElement1_1_0= ruleType
            {

            					newCompositeNode(grammarAccess.getEffectFullAlgebraicTypeAccess().getEffectFullAdtElement1TypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_35);
            lv_effectFullAdtElement1_1_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEffectFullAlgebraicTypeRule());
            					}
            					set(
            						current,
            						"effectFullAdtElement1",
            						lv_effectFullAdtElement1_1_0,
            						"it.unibo.FPML.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFPML.g:3015:3: ( ( (lv_effectFullAdtElement2_2_1= ruleEffectFullSumTypeFactor | lv_effectFullAdtElement2_2_2= ruleEffectFullProdTypeFactor ) ) )
            // InternalFPML.g:3016:4: ( (lv_effectFullAdtElement2_2_1= ruleEffectFullSumTypeFactor | lv_effectFullAdtElement2_2_2= ruleEffectFullProdTypeFactor ) )
            {
            // InternalFPML.g:3016:4: ( (lv_effectFullAdtElement2_2_1= ruleEffectFullSumTypeFactor | lv_effectFullAdtElement2_2_2= ruleEffectFullProdTypeFactor ) )
            // InternalFPML.g:3017:5: (lv_effectFullAdtElement2_2_1= ruleEffectFullSumTypeFactor | lv_effectFullAdtElement2_2_2= ruleEffectFullProdTypeFactor )
            {
            // InternalFPML.g:3017:5: (lv_effectFullAdtElement2_2_1= ruleEffectFullSumTypeFactor | lv_effectFullAdtElement2_2_2= ruleEffectFullProdTypeFactor )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==41) ) {
                alt29=1;
            }
            else if ( (LA29_0==42) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalFPML.g:3018:6: lv_effectFullAdtElement2_2_1= ruleEffectFullSumTypeFactor
                    {

                    						newCompositeNode(grammarAccess.getEffectFullAlgebraicTypeAccess().getEffectFullAdtElement2EffectFullSumTypeFactorParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_7);
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
                    // InternalFPML.g:3034:6: lv_effectFullAdtElement2_2_2= ruleEffectFullProdTypeFactor
                    {

                    						newCompositeNode(grammarAccess.getEffectFullAlgebraicTypeAccess().getEffectFullAdtElement2EffectFullProdTypeFactorParserRuleCall_2_0_1());
                    					
                    pushFollow(FOLLOW_7);
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

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getEffectFullAlgebraicTypeAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

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
    // InternalFPML.g:3060:1: entryRuleEffectFullSumTypeFactor returns [EObject current=null] : iv_ruleEffectFullSumTypeFactor= ruleEffectFullSumTypeFactor EOF ;
    public final EObject entryRuleEffectFullSumTypeFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullSumTypeFactor = null;


        try {
            // InternalFPML.g:3060:64: (iv_ruleEffectFullSumTypeFactor= ruleEffectFullSumTypeFactor EOF )
            // InternalFPML.g:3061:2: iv_ruleEffectFullSumTypeFactor= ruleEffectFullSumTypeFactor EOF
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
    // InternalFPML.g:3067:1: ruleEffectFullSumTypeFactor returns [EObject current=null] : (otherlv_0= '+' ( (lv_adtElement_1_0= ruleType ) ) ) ;
    public final EObject ruleEffectFullSumTypeFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_adtElement_1_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:3073:2: ( (otherlv_0= '+' ( (lv_adtElement_1_0= ruleType ) ) ) )
            // InternalFPML.g:3074:2: (otherlv_0= '+' ( (lv_adtElement_1_0= ruleType ) ) )
            {
            // InternalFPML.g:3074:2: (otherlv_0= '+' ( (lv_adtElement_1_0= ruleType ) ) )
            // InternalFPML.g:3075:3: otherlv_0= '+' ( (lv_adtElement_1_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getEffectFullSumTypeFactorAccess().getPlusSignKeyword_0());
            		
            // InternalFPML.g:3079:3: ( (lv_adtElement_1_0= ruleType ) )
            // InternalFPML.g:3080:4: (lv_adtElement_1_0= ruleType )
            {
            // InternalFPML.g:3080:4: (lv_adtElement_1_0= ruleType )
            // InternalFPML.g:3081:5: lv_adtElement_1_0= ruleType
            {

            					newCompositeNode(grammarAccess.getEffectFullSumTypeFactorAccess().getAdtElementTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_adtElement_1_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEffectFullSumTypeFactorRule());
            					}
            					set(
            						current,
            						"adtElement",
            						lv_adtElement_1_0,
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
    // $ANTLR end "ruleEffectFullSumTypeFactor"


    // $ANTLR start "entryRuleEffectFullProdTypeFactor"
    // InternalFPML.g:3102:1: entryRuleEffectFullProdTypeFactor returns [EObject current=null] : iv_ruleEffectFullProdTypeFactor= ruleEffectFullProdTypeFactor EOF ;
    public final EObject entryRuleEffectFullProdTypeFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullProdTypeFactor = null;


        try {
            // InternalFPML.g:3102:65: (iv_ruleEffectFullProdTypeFactor= ruleEffectFullProdTypeFactor EOF )
            // InternalFPML.g:3103:2: iv_ruleEffectFullProdTypeFactor= ruleEffectFullProdTypeFactor EOF
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
    // InternalFPML.g:3109:1: ruleEffectFullProdTypeFactor returns [EObject current=null] : (otherlv_0= '*' ( (lv_adtElement_1_0= ruleType ) ) ) ;
    public final EObject ruleEffectFullProdTypeFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_adtElement_1_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:3115:2: ( (otherlv_0= '*' ( (lv_adtElement_1_0= ruleType ) ) ) )
            // InternalFPML.g:3116:2: (otherlv_0= '*' ( (lv_adtElement_1_0= ruleType ) ) )
            {
            // InternalFPML.g:3116:2: (otherlv_0= '*' ( (lv_adtElement_1_0= ruleType ) ) )
            // InternalFPML.g:3117:3: otherlv_0= '*' ( (lv_adtElement_1_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getEffectFullProdTypeFactorAccess().getAsteriskKeyword_0());
            		
            // InternalFPML.g:3121:3: ( (lv_adtElement_1_0= ruleType ) )
            // InternalFPML.g:3122:4: (lv_adtElement_1_0= ruleType )
            {
            // InternalFPML.g:3122:4: (lv_adtElement_1_0= ruleType )
            // InternalFPML.g:3123:5: lv_adtElement_1_0= ruleType
            {

            					newCompositeNode(grammarAccess.getEffectFullProdTypeFactorAccess().getAdtElementTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_adtElement_1_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEffectFullProdTypeFactorRule());
            					}
            					set(
            						current,
            						"adtElement",
            						lv_adtElement_1_0,
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
    // $ANTLR end "ruleEffectFullProdTypeFactor"


    // $ANTLR start "entryRuleEffectFullExpression"
    // InternalFPML.g:3144:1: entryRuleEffectFullExpression returns [EObject current=null] : iv_ruleEffectFullExpression= ruleEffectFullExpression EOF ;
    public final EObject entryRuleEffectFullExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullExpression = null;


        try {
            // InternalFPML.g:3144:61: (iv_ruleEffectFullExpression= ruleEffectFullExpression EOF )
            // InternalFPML.g:3145:2: iv_ruleEffectFullExpression= ruleEffectFullExpression EOF
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
    // InternalFPML.g:3151:1: ruleEffectFullExpression returns [EObject current=null] : ( ( () otherlv_1= 'IO' otherlv_2= '[' ( (lv_innerValue_3_0= ruleEffectFullExpression ) ) otherlv_4= ']' ) | ( () otherlv_6= 'IO' otherlv_7= '(' ( (lv_innerValue_8_0= ruleExpression ) ) otherlv_9= ')' ) | ( () otherlv_11= 'IOF' otherlv_12= '(' ( (otherlv_13= RULE_ID ) ) otherlv_14= ')' ) | ( () otherlv_16= 'IOF' otherlv_17= '(' ( (lv_purePrimitive_18_0= rulePrimitivePureFunction ) ) otherlv_19= ')' ) | ( () otherlv_21= 'IOF' otherlv_22= '[' ( (otherlv_23= RULE_ID ) ) otherlv_24= ']' ) | ( () otherlv_26= 'IOF' otherlv_27= '[' ( (lv_effectFullPrimitive_28_0= rulePrimitiveEffectFullFunction ) ) otherlv_29= ']' ) | this_EffectFullFunctionValue_30= ruleEffectFullFunctionValue | this_EffectFullDataValue_31= ruleEffectFullDataValue | this_EffectFullProdValue_32= ruleEffectFullProdValue | this_EffectFullSumValue_33= ruleEffectFullSumValue | this_EffectFullValueRef_34= ruleEffectFullValueRef ) ;
    public final EObject ruleEffectFullExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        EObject lv_innerValue_3_0 = null;

        EObject lv_innerValue_8_0 = null;

        EObject lv_purePrimitive_18_0 = null;

        EObject lv_effectFullPrimitive_28_0 = null;

        EObject this_EffectFullFunctionValue_30 = null;

        EObject this_EffectFullDataValue_31 = null;

        EObject this_EffectFullProdValue_32 = null;

        EObject this_EffectFullSumValue_33 = null;

        EObject this_EffectFullValueRef_34 = null;



        	enterRule();

        try {
            // InternalFPML.g:3157:2: ( ( ( () otherlv_1= 'IO' otherlv_2= '[' ( (lv_innerValue_3_0= ruleEffectFullExpression ) ) otherlv_4= ']' ) | ( () otherlv_6= 'IO' otherlv_7= '(' ( (lv_innerValue_8_0= ruleExpression ) ) otherlv_9= ')' ) | ( () otherlv_11= 'IOF' otherlv_12= '(' ( (otherlv_13= RULE_ID ) ) otherlv_14= ')' ) | ( () otherlv_16= 'IOF' otherlv_17= '(' ( (lv_purePrimitive_18_0= rulePrimitivePureFunction ) ) otherlv_19= ')' ) | ( () otherlv_21= 'IOF' otherlv_22= '[' ( (otherlv_23= RULE_ID ) ) otherlv_24= ']' ) | ( () otherlv_26= 'IOF' otherlv_27= '[' ( (lv_effectFullPrimitive_28_0= rulePrimitiveEffectFullFunction ) ) otherlv_29= ']' ) | this_EffectFullFunctionValue_30= ruleEffectFullFunctionValue | this_EffectFullDataValue_31= ruleEffectFullDataValue | this_EffectFullProdValue_32= ruleEffectFullProdValue | this_EffectFullSumValue_33= ruleEffectFullSumValue | this_EffectFullValueRef_34= ruleEffectFullValueRef ) )
            // InternalFPML.g:3158:2: ( ( () otherlv_1= 'IO' otherlv_2= '[' ( (lv_innerValue_3_0= ruleEffectFullExpression ) ) otherlv_4= ']' ) | ( () otherlv_6= 'IO' otherlv_7= '(' ( (lv_innerValue_8_0= ruleExpression ) ) otherlv_9= ')' ) | ( () otherlv_11= 'IOF' otherlv_12= '(' ( (otherlv_13= RULE_ID ) ) otherlv_14= ')' ) | ( () otherlv_16= 'IOF' otherlv_17= '(' ( (lv_purePrimitive_18_0= rulePrimitivePureFunction ) ) otherlv_19= ')' ) | ( () otherlv_21= 'IOF' otherlv_22= '[' ( (otherlv_23= RULE_ID ) ) otherlv_24= ']' ) | ( () otherlv_26= 'IOF' otherlv_27= '[' ( (lv_effectFullPrimitive_28_0= rulePrimitiveEffectFullFunction ) ) otherlv_29= ']' ) | this_EffectFullFunctionValue_30= ruleEffectFullFunctionValue | this_EffectFullDataValue_31= ruleEffectFullDataValue | this_EffectFullProdValue_32= ruleEffectFullProdValue | this_EffectFullSumValue_33= ruleEffectFullSumValue | this_EffectFullValueRef_34= ruleEffectFullValueRef )
            {
            // InternalFPML.g:3158:2: ( ( () otherlv_1= 'IO' otherlv_2= '[' ( (lv_innerValue_3_0= ruleEffectFullExpression ) ) otherlv_4= ']' ) | ( () otherlv_6= 'IO' otherlv_7= '(' ( (lv_innerValue_8_0= ruleExpression ) ) otherlv_9= ')' ) | ( () otherlv_11= 'IOF' otherlv_12= '(' ( (otherlv_13= RULE_ID ) ) otherlv_14= ')' ) | ( () otherlv_16= 'IOF' otherlv_17= '(' ( (lv_purePrimitive_18_0= rulePrimitivePureFunction ) ) otherlv_19= ')' ) | ( () otherlv_21= 'IOF' otherlv_22= '[' ( (otherlv_23= RULE_ID ) ) otherlv_24= ']' ) | ( () otherlv_26= 'IOF' otherlv_27= '[' ( (lv_effectFullPrimitive_28_0= rulePrimitiveEffectFullFunction ) ) otherlv_29= ']' ) | this_EffectFullFunctionValue_30= ruleEffectFullFunctionValue | this_EffectFullDataValue_31= ruleEffectFullDataValue | this_EffectFullProdValue_32= ruleEffectFullProdValue | this_EffectFullSumValue_33= ruleEffectFullSumValue | this_EffectFullValueRef_34= ruleEffectFullValueRef )
            int alt30=11;
            alt30 = dfa30.predict(input);
            switch (alt30) {
                case 1 :
                    // InternalFPML.g:3159:3: ( () otherlv_1= 'IO' otherlv_2= '[' ( (lv_innerValue_3_0= ruleEffectFullExpression ) ) otherlv_4= ']' )
                    {
                    // InternalFPML.g:3159:3: ( () otherlv_1= 'IO' otherlv_2= '[' ( (lv_innerValue_3_0= ruleEffectFullExpression ) ) otherlv_4= ']' )
                    // InternalFPML.g:3160:4: () otherlv_1= 'IO' otherlv_2= '[' ( (lv_innerValue_3_0= ruleEffectFullExpression ) ) otherlv_4= ']'
                    {
                    // InternalFPML.g:3160:4: ()
                    // InternalFPML.g:3161:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getEffectFullExpressionAccess().getIOEffectFullExpressionAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,24,FOLLOW_37); 

                    				newLeafNode(otherlv_1, grammarAccess.getEffectFullExpressionAccess().getIOKeyword_0_1());
                    			
                    otherlv_2=(Token)match(input,39,FOLLOW_16); 

                    				newLeafNode(otherlv_2, grammarAccess.getEffectFullExpressionAccess().getLeftSquareBracketKeyword_0_2());
                    			
                    // InternalFPML.g:3175:4: ( (lv_innerValue_3_0= ruleEffectFullExpression ) )
                    // InternalFPML.g:3176:5: (lv_innerValue_3_0= ruleEffectFullExpression )
                    {
                    // InternalFPML.g:3176:5: (lv_innerValue_3_0= ruleEffectFullExpression )
                    // InternalFPML.g:3177:6: lv_innerValue_3_0= ruleEffectFullExpression
                    {

                    						newCompositeNode(grammarAccess.getEffectFullExpressionAccess().getInnerValueEffectFullExpressionParserRuleCall_0_3_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_innerValue_3_0=ruleEffectFullExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEffectFullExpressionRule());
                    						}
                    						set(
                    							current,
                    							"innerValue",
                    							lv_innerValue_3_0,
                    							"it.unibo.FPML.EffectFullExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,40,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getEffectFullExpressionAccess().getRightSquareBracketKeyword_0_4());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFPML.g:3200:3: ( () otherlv_6= 'IO' otherlv_7= '(' ( (lv_innerValue_8_0= ruleExpression ) ) otherlv_9= ')' )
                    {
                    // InternalFPML.g:3200:3: ( () otherlv_6= 'IO' otherlv_7= '(' ( (lv_innerValue_8_0= ruleExpression ) ) otherlv_9= ')' )
                    // InternalFPML.g:3201:4: () otherlv_6= 'IO' otherlv_7= '(' ( (lv_innerValue_8_0= ruleExpression ) ) otherlv_9= ')'
                    {
                    // InternalFPML.g:3201:4: ()
                    // InternalFPML.g:3202:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getEffectFullExpressionAccess().getIOExpressionAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_6=(Token)match(input,24,FOLLOW_18); 

                    				newLeafNode(otherlv_6, grammarAccess.getEffectFullExpressionAccess().getIOKeyword_1_1());
                    			
                    otherlv_7=(Token)match(input,21,FOLLOW_14); 

                    				newLeafNode(otherlv_7, grammarAccess.getEffectFullExpressionAccess().getLeftParenthesisKeyword_1_2());
                    			
                    // InternalFPML.g:3216:4: ( (lv_innerValue_8_0= ruleExpression ) )
                    // InternalFPML.g:3217:5: (lv_innerValue_8_0= ruleExpression )
                    {
                    // InternalFPML.g:3217:5: (lv_innerValue_8_0= ruleExpression )
                    // InternalFPML.g:3218:6: lv_innerValue_8_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getEffectFullExpressionAccess().getInnerValueExpressionParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_innerValue_8_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEffectFullExpressionRule());
                    						}
                    						set(
                    							current,
                    							"innerValue",
                    							lv_innerValue_8_0,
                    							"it.unibo.FPML.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getEffectFullExpressionAccess().getRightParenthesisKeyword_1_4());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalFPML.g:3241:3: ( () otherlv_11= 'IOF' otherlv_12= '(' ( (otherlv_13= RULE_ID ) ) otherlv_14= ')' )
                    {
                    // InternalFPML.g:3241:3: ( () otherlv_11= 'IOF' otherlv_12= '(' ( (otherlv_13= RULE_ID ) ) otherlv_14= ')' )
                    // InternalFPML.g:3242:4: () otherlv_11= 'IOF' otherlv_12= '(' ( (otherlv_13= RULE_ID ) ) otherlv_14= ')'
                    {
                    // InternalFPML.g:3242:4: ()
                    // InternalFPML.g:3243:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getEffectFullExpressionAccess().getIOPureFunctionAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_11=(Token)match(input,43,FOLLOW_18); 

                    				newLeafNode(otherlv_11, grammarAccess.getEffectFullExpressionAccess().getIOFKeyword_2_1());
                    			
                    otherlv_12=(Token)match(input,21,FOLLOW_17); 

                    				newLeafNode(otherlv_12, grammarAccess.getEffectFullExpressionAccess().getLeftParenthesisKeyword_2_2());
                    			
                    // InternalFPML.g:3257:4: ( (otherlv_13= RULE_ID ) )
                    // InternalFPML.g:3258:5: (otherlv_13= RULE_ID )
                    {
                    // InternalFPML.g:3258:5: (otherlv_13= RULE_ID )
                    // InternalFPML.g:3259:6: otherlv_13= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEffectFullExpressionRule());
                    						}
                    					
                    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_20); 

                    						newLeafNode(otherlv_13, grammarAccess.getEffectFullExpressionAccess().getPureFunctionPureFunctionCrossReference_2_3_0());
                    					

                    }


                    }

                    otherlv_14=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_14, grammarAccess.getEffectFullExpressionAccess().getRightParenthesisKeyword_2_4());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalFPML.g:3276:3: ( () otherlv_16= 'IOF' otherlv_17= '(' ( (lv_purePrimitive_18_0= rulePrimitivePureFunction ) ) otherlv_19= ')' )
                    {
                    // InternalFPML.g:3276:3: ( () otherlv_16= 'IOF' otherlv_17= '(' ( (lv_purePrimitive_18_0= rulePrimitivePureFunction ) ) otherlv_19= ')' )
                    // InternalFPML.g:3277:4: () otherlv_16= 'IOF' otherlv_17= '(' ( (lv_purePrimitive_18_0= rulePrimitivePureFunction ) ) otherlv_19= ')'
                    {
                    // InternalFPML.g:3277:4: ()
                    // InternalFPML.g:3278:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getEffectFullExpressionAccess().getIOPureFunctionAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_16=(Token)match(input,43,FOLLOW_18); 

                    				newLeafNode(otherlv_16, grammarAccess.getEffectFullExpressionAccess().getIOFKeyword_3_1());
                    			
                    otherlv_17=(Token)match(input,21,FOLLOW_28); 

                    				newLeafNode(otherlv_17, grammarAccess.getEffectFullExpressionAccess().getLeftParenthesisKeyword_3_2());
                    			
                    // InternalFPML.g:3292:4: ( (lv_purePrimitive_18_0= rulePrimitivePureFunction ) )
                    // InternalFPML.g:3293:5: (lv_purePrimitive_18_0= rulePrimitivePureFunction )
                    {
                    // InternalFPML.g:3293:5: (lv_purePrimitive_18_0= rulePrimitivePureFunction )
                    // InternalFPML.g:3294:6: lv_purePrimitive_18_0= rulePrimitivePureFunction
                    {

                    						newCompositeNode(grammarAccess.getEffectFullExpressionAccess().getPurePrimitivePrimitivePureFunctionParserRuleCall_3_3_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_purePrimitive_18_0=rulePrimitivePureFunction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEffectFullExpressionRule());
                    						}
                    						set(
                    							current,
                    							"purePrimitive",
                    							lv_purePrimitive_18_0,
                    							"it.unibo.FPML.PrimitivePureFunction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_19=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_19, grammarAccess.getEffectFullExpressionAccess().getRightParenthesisKeyword_3_4());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalFPML.g:3317:3: ( () otherlv_21= 'IOF' otherlv_22= '[' ( (otherlv_23= RULE_ID ) ) otherlv_24= ']' )
                    {
                    // InternalFPML.g:3317:3: ( () otherlv_21= 'IOF' otherlv_22= '[' ( (otherlv_23= RULE_ID ) ) otherlv_24= ']' )
                    // InternalFPML.g:3318:4: () otherlv_21= 'IOF' otherlv_22= '[' ( (otherlv_23= RULE_ID ) ) otherlv_24= ']'
                    {
                    // InternalFPML.g:3318:4: ()
                    // InternalFPML.g:3319:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getEffectFullExpressionAccess().getIOEffectFullFunctionAction_4_0(),
                    						current);
                    				

                    }

                    otherlv_21=(Token)match(input,43,FOLLOW_37); 

                    				newLeafNode(otherlv_21, grammarAccess.getEffectFullExpressionAccess().getIOFKeyword_4_1());
                    			
                    otherlv_22=(Token)match(input,39,FOLLOW_17); 

                    				newLeafNode(otherlv_22, grammarAccess.getEffectFullExpressionAccess().getLeftSquareBracketKeyword_4_2());
                    			
                    // InternalFPML.g:3333:4: ( (otherlv_23= RULE_ID ) )
                    // InternalFPML.g:3334:5: (otherlv_23= RULE_ID )
                    {
                    // InternalFPML.g:3334:5: (otherlv_23= RULE_ID )
                    // InternalFPML.g:3335:6: otherlv_23= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEffectFullExpressionRule());
                    						}
                    					
                    otherlv_23=(Token)match(input,RULE_ID,FOLLOW_36); 

                    						newLeafNode(otherlv_23, grammarAccess.getEffectFullExpressionAccess().getEffectFullFunctionEffectFullFunctionCrossReference_4_3_0());
                    					

                    }


                    }

                    otherlv_24=(Token)match(input,40,FOLLOW_2); 

                    				newLeafNode(otherlv_24, grammarAccess.getEffectFullExpressionAccess().getRightSquareBracketKeyword_4_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalFPML.g:3352:3: ( () otherlv_26= 'IOF' otherlv_27= '[' ( (lv_effectFullPrimitive_28_0= rulePrimitiveEffectFullFunction ) ) otherlv_29= ']' )
                    {
                    // InternalFPML.g:3352:3: ( () otherlv_26= 'IOF' otherlv_27= '[' ( (lv_effectFullPrimitive_28_0= rulePrimitiveEffectFullFunction ) ) otherlv_29= ']' )
                    // InternalFPML.g:3353:4: () otherlv_26= 'IOF' otherlv_27= '[' ( (lv_effectFullPrimitive_28_0= rulePrimitiveEffectFullFunction ) ) otherlv_29= ']'
                    {
                    // InternalFPML.g:3353:4: ()
                    // InternalFPML.g:3354:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getEffectFullExpressionAccess().getIOEffectFullFunctionAction_5_0(),
                    						current);
                    				

                    }

                    otherlv_26=(Token)match(input,43,FOLLOW_37); 

                    				newLeafNode(otherlv_26, grammarAccess.getEffectFullExpressionAccess().getIOFKeyword_5_1());
                    			
                    otherlv_27=(Token)match(input,39,FOLLOW_38); 

                    				newLeafNode(otherlv_27, grammarAccess.getEffectFullExpressionAccess().getLeftSquareBracketKeyword_5_2());
                    			
                    // InternalFPML.g:3368:4: ( (lv_effectFullPrimitive_28_0= rulePrimitiveEffectFullFunction ) )
                    // InternalFPML.g:3369:5: (lv_effectFullPrimitive_28_0= rulePrimitiveEffectFullFunction )
                    {
                    // InternalFPML.g:3369:5: (lv_effectFullPrimitive_28_0= rulePrimitiveEffectFullFunction )
                    // InternalFPML.g:3370:6: lv_effectFullPrimitive_28_0= rulePrimitiveEffectFullFunction
                    {

                    						newCompositeNode(grammarAccess.getEffectFullExpressionAccess().getEffectFullPrimitivePrimitiveEffectFullFunctionParserRuleCall_5_3_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_effectFullPrimitive_28_0=rulePrimitiveEffectFullFunction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEffectFullExpressionRule());
                    						}
                    						set(
                    							current,
                    							"effectFullPrimitive",
                    							lv_effectFullPrimitive_28_0,
                    							"it.unibo.FPML.PrimitiveEffectFullFunction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_29=(Token)match(input,40,FOLLOW_2); 

                    				newLeafNode(otherlv_29, grammarAccess.getEffectFullExpressionAccess().getRightSquareBracketKeyword_5_4());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalFPML.g:3393:3: this_EffectFullFunctionValue_30= ruleEffectFullFunctionValue
                    {

                    			newCompositeNode(grammarAccess.getEffectFullExpressionAccess().getEffectFullFunctionValueParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_EffectFullFunctionValue_30=ruleEffectFullFunctionValue();

                    state._fsp--;


                    			current = this_EffectFullFunctionValue_30;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalFPML.g:3402:3: this_EffectFullDataValue_31= ruleEffectFullDataValue
                    {

                    			newCompositeNode(grammarAccess.getEffectFullExpressionAccess().getEffectFullDataValueParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_EffectFullDataValue_31=ruleEffectFullDataValue();

                    state._fsp--;


                    			current = this_EffectFullDataValue_31;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalFPML.g:3411:3: this_EffectFullProdValue_32= ruleEffectFullProdValue
                    {

                    			newCompositeNode(grammarAccess.getEffectFullExpressionAccess().getEffectFullProdValueParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_EffectFullProdValue_32=ruleEffectFullProdValue();

                    state._fsp--;


                    			current = this_EffectFullProdValue_32;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalFPML.g:3420:3: this_EffectFullSumValue_33= ruleEffectFullSumValue
                    {

                    			newCompositeNode(grammarAccess.getEffectFullExpressionAccess().getEffectFullSumValueParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_EffectFullSumValue_33=ruleEffectFullSumValue();

                    state._fsp--;


                    			current = this_EffectFullSumValue_33;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalFPML.g:3429:3: this_EffectFullValueRef_34= ruleEffectFullValueRef
                    {

                    			newCompositeNode(grammarAccess.getEffectFullExpressionAccess().getEffectFullValueRefParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_EffectFullValueRef_34=ruleEffectFullValueRef();

                    state._fsp--;


                    			current = this_EffectFullValueRef_34;
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
    // InternalFPML.g:3441:1: entryRuleUnitValue returns [EObject current=null] : iv_ruleUnitValue= ruleUnitValue EOF ;
    public final EObject entryRuleUnitValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnitValue = null;


        try {
            // InternalFPML.g:3441:50: (iv_ruleUnitValue= ruleUnitValue EOF )
            // InternalFPML.g:3442:2: iv_ruleUnitValue= ruleUnitValue EOF
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
    // InternalFPML.g:3448:1: ruleUnitValue returns [EObject current=null] : ( () otherlv_1= '()' ) ;
    public final EObject ruleUnitValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFPML.g:3454:2: ( ( () otherlv_1= '()' ) )
            // InternalFPML.g:3455:2: ( () otherlv_1= '()' )
            {
            // InternalFPML.g:3455:2: ( () otherlv_1= '()' )
            // InternalFPML.g:3456:3: () otherlv_1= '()'
            {
            // InternalFPML.g:3456:3: ()
            // InternalFPML.g:3457:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUnitValueAccess().getUnitTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,44,FOLLOW_2); 

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
    // InternalFPML.g:3471:1: entryRuleEffectFullFunctionValue returns [EObject current=null] : iv_ruleEffectFullFunctionValue= ruleEffectFullFunctionValue EOF ;
    public final EObject entryRuleEffectFullFunctionValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullFunctionValue = null;


        try {
            // InternalFPML.g:3471:64: (iv_ruleEffectFullFunctionValue= ruleEffectFullFunctionValue EOF )
            // InternalFPML.g:3472:2: iv_ruleEffectFullFunctionValue= ruleEffectFullFunctionValue EOF
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
    // InternalFPML.g:3478:1: ruleEffectFullFunctionValue returns [EObject current=null] : ( (lv_value_0_0= ruleEffectFullLambda ) ) ;
    public final EObject ruleEffectFullFunctionValue() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:3484:2: ( ( (lv_value_0_0= ruleEffectFullLambda ) ) )
            // InternalFPML.g:3485:2: ( (lv_value_0_0= ruleEffectFullLambda ) )
            {
            // InternalFPML.g:3485:2: ( (lv_value_0_0= ruleEffectFullLambda ) )
            // InternalFPML.g:3486:3: (lv_value_0_0= ruleEffectFullLambda )
            {
            // InternalFPML.g:3486:3: (lv_value_0_0= ruleEffectFullLambda )
            // InternalFPML.g:3487:4: lv_value_0_0= ruleEffectFullLambda
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
    // InternalFPML.g:3507:1: entryRuleEffectFullValueRef returns [EObject current=null] : iv_ruleEffectFullValueRef= ruleEffectFullValueRef EOF ;
    public final EObject entryRuleEffectFullValueRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullValueRef = null;


        try {
            // InternalFPML.g:3507:59: (iv_ruleEffectFullValueRef= ruleEffectFullValueRef EOF )
            // InternalFPML.g:3508:2: iv_ruleEffectFullValueRef= ruleEffectFullValueRef EOF
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
    // InternalFPML.g:3514:1: ruleEffectFullValueRef returns [EObject current=null] : ( () otherlv_1= 'EffectFullRef' otherlv_2= '[' ( (otherlv_3= RULE_ID ) ) otherlv_4= ']' ) ;
    public final EObject ruleEffectFullValueRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalFPML.g:3520:2: ( ( () otherlv_1= 'EffectFullRef' otherlv_2= '[' ( (otherlv_3= RULE_ID ) ) otherlv_4= ']' ) )
            // InternalFPML.g:3521:2: ( () otherlv_1= 'EffectFullRef' otherlv_2= '[' ( (otherlv_3= RULE_ID ) ) otherlv_4= ']' )
            {
            // InternalFPML.g:3521:2: ( () otherlv_1= 'EffectFullRef' otherlv_2= '[' ( (otherlv_3= RULE_ID ) ) otherlv_4= ']' )
            // InternalFPML.g:3522:3: () otherlv_1= 'EffectFullRef' otherlv_2= '[' ( (otherlv_3= RULE_ID ) ) otherlv_4= ']'
            {
            // InternalFPML.g:3522:3: ()
            // InternalFPML.g:3523:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEffectFullValueRefAccess().getEffectFullValueRefAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,45,FOLLOW_37); 

            			newLeafNode(otherlv_1, grammarAccess.getEffectFullValueRefAccess().getEffectFullRefKeyword_1());
            		
            otherlv_2=(Token)match(input,39,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getEffectFullValueRefAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalFPML.g:3537:3: ( (otherlv_3= RULE_ID ) )
            // InternalFPML.g:3538:4: (otherlv_3= RULE_ID )
            {
            // InternalFPML.g:3538:4: (otherlv_3= RULE_ID )
            // InternalFPML.g:3539:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEffectFullValueRefRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_36); 

            					newLeafNode(otherlv_3, grammarAccess.getEffectFullValueRefAccess().getValueEffectFullValueCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,40,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEffectFullValueRefAccess().getRightSquareBracketKeyword_4());
            		

            }


            }


            	leaveRule();

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
    // InternalFPML.g:3558:1: entryRuleEffectFullLambda returns [EObject current=null] : iv_ruleEffectFullLambda= ruleEffectFullLambda EOF ;
    public final EObject entryRuleEffectFullLambda() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullLambda = null;


        try {
            // InternalFPML.g:3558:57: (iv_ruleEffectFullLambda= ruleEffectFullLambda EOF )
            // InternalFPML.g:3559:2: iv_ruleEffectFullLambda= ruleEffectFullLambda EOF
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
    // InternalFPML.g:3565:1: ruleEffectFullLambda returns [EObject current=null] : ( ( () otherlv_1= '\\\\' otherlv_2= '[' ( (lv_arg_3_0= ruleArgument ) ) otherlv_4= ']' otherlv_5= '->' otherlv_6= '{' ( (lv_functionBody_7_0= ruleCompositionFunctionBodyEffect ) ) otherlv_8= '}' ) | ( () otherlv_10= '\\\\' otherlv_11= '[' otherlv_12= ']' otherlv_13= '->' otherlv_14= '{' ( (lv_functionBody_15_0= ruleCompositionFunctionBodyEffect ) ) otherlv_16= '}' ) ) ;
    public final EObject ruleEffectFullLambda() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        EObject lv_arg_3_0 = null;

        EObject lv_functionBody_7_0 = null;

        EObject lv_functionBody_15_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:3571:2: ( ( ( () otherlv_1= '\\\\' otherlv_2= '[' ( (lv_arg_3_0= ruleArgument ) ) otherlv_4= ']' otherlv_5= '->' otherlv_6= '{' ( (lv_functionBody_7_0= ruleCompositionFunctionBodyEffect ) ) otherlv_8= '}' ) | ( () otherlv_10= '\\\\' otherlv_11= '[' otherlv_12= ']' otherlv_13= '->' otherlv_14= '{' ( (lv_functionBody_15_0= ruleCompositionFunctionBodyEffect ) ) otherlv_16= '}' ) ) )
            // InternalFPML.g:3572:2: ( ( () otherlv_1= '\\\\' otherlv_2= '[' ( (lv_arg_3_0= ruleArgument ) ) otherlv_4= ']' otherlv_5= '->' otherlv_6= '{' ( (lv_functionBody_7_0= ruleCompositionFunctionBodyEffect ) ) otherlv_8= '}' ) | ( () otherlv_10= '\\\\' otherlv_11= '[' otherlv_12= ']' otherlv_13= '->' otherlv_14= '{' ( (lv_functionBody_15_0= ruleCompositionFunctionBodyEffect ) ) otherlv_16= '}' ) )
            {
            // InternalFPML.g:3572:2: ( ( () otherlv_1= '\\\\' otherlv_2= '[' ( (lv_arg_3_0= ruleArgument ) ) otherlv_4= ']' otherlv_5= '->' otherlv_6= '{' ( (lv_functionBody_7_0= ruleCompositionFunctionBodyEffect ) ) otherlv_8= '}' ) | ( () otherlv_10= '\\\\' otherlv_11= '[' otherlv_12= ']' otherlv_13= '->' otherlv_14= '{' ( (lv_functionBody_15_0= ruleCompositionFunctionBodyEffect ) ) otherlv_16= '}' ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==46) ) {
                int LA31_1 = input.LA(2);

                if ( (LA31_1==39) ) {
                    int LA31_2 = input.LA(3);

                    if ( (LA31_2==40) ) {
                        alt31=2;
                    }
                    else if ( (LA31_2==RULE_ID||LA31_2==13||LA31_2==24||(LA31_2>=29 && LA31_2<=35)||(LA31_2>=38 && LA31_2<=39)) ) {
                        alt31=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 2, input);

                        throw nvae;
                    }
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
                    // InternalFPML.g:3573:3: ( () otherlv_1= '\\\\' otherlv_2= '[' ( (lv_arg_3_0= ruleArgument ) ) otherlv_4= ']' otherlv_5= '->' otherlv_6= '{' ( (lv_functionBody_7_0= ruleCompositionFunctionBodyEffect ) ) otherlv_8= '}' )
                    {
                    // InternalFPML.g:3573:3: ( () otherlv_1= '\\\\' otherlv_2= '[' ( (lv_arg_3_0= ruleArgument ) ) otherlv_4= ']' otherlv_5= '->' otherlv_6= '{' ( (lv_functionBody_7_0= ruleCompositionFunctionBodyEffect ) ) otherlv_8= '}' )
                    // InternalFPML.g:3574:4: () otherlv_1= '\\\\' otherlv_2= '[' ( (lv_arg_3_0= ruleArgument ) ) otherlv_4= ']' otherlv_5= '->' otherlv_6= '{' ( (lv_functionBody_7_0= ruleCompositionFunctionBodyEffect ) ) otherlv_8= '}'
                    {
                    // InternalFPML.g:3574:4: ()
                    // InternalFPML.g:3575:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getEffectFullLambdaAccess().getEffectFullLambdaAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,46,FOLLOW_37); 

                    				newLeafNode(otherlv_1, grammarAccess.getEffectFullLambdaAccess().getReverseSolidusKeyword_0_1());
                    			
                    otherlv_2=(Token)match(input,39,FOLLOW_23); 

                    				newLeafNode(otherlv_2, grammarAccess.getEffectFullLambdaAccess().getLeftSquareBracketKeyword_0_2());
                    			
                    // InternalFPML.g:3589:4: ( (lv_arg_3_0= ruleArgument ) )
                    // InternalFPML.g:3590:5: (lv_arg_3_0= ruleArgument )
                    {
                    // InternalFPML.g:3590:5: (lv_arg_3_0= ruleArgument )
                    // InternalFPML.g:3591:6: lv_arg_3_0= ruleArgument
                    {

                    						newCompositeNode(grammarAccess.getEffectFullLambdaAccess().getArgArgumentParserRuleCall_0_3_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_arg_3_0=ruleArgument();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEffectFullLambdaRule());
                    						}
                    						set(
                    							current,
                    							"arg",
                    							lv_arg_3_0,
                    							"it.unibo.FPML.Argument");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,40,FOLLOW_39); 

                    				newLeafNode(otherlv_4, grammarAccess.getEffectFullLambdaAccess().getRightSquareBracketKeyword_0_4());
                    			
                    otherlv_5=(Token)match(input,47,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getEffectFullLambdaAccess().getHyphenMinusGreaterThanSignKeyword_0_5());
                    			
                    otherlv_6=(Token)match(input,13,FOLLOW_24); 

                    				newLeafNode(otherlv_6, grammarAccess.getEffectFullLambdaAccess().getLeftCurlyBracketKeyword_0_6());
                    			
                    // InternalFPML.g:3620:4: ( (lv_functionBody_7_0= ruleCompositionFunctionBodyEffect ) )
                    // InternalFPML.g:3621:5: (lv_functionBody_7_0= ruleCompositionFunctionBodyEffect )
                    {
                    // InternalFPML.g:3621:5: (lv_functionBody_7_0= ruleCompositionFunctionBodyEffect )
                    // InternalFPML.g:3622:6: lv_functionBody_7_0= ruleCompositionFunctionBodyEffect
                    {

                    						newCompositeNode(grammarAccess.getEffectFullLambdaAccess().getFunctionBodyCompositionFunctionBodyEffectParserRuleCall_0_7_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_functionBody_7_0=ruleCompositionFunctionBodyEffect();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEffectFullLambdaRule());
                    						}
                    						set(
                    							current,
                    							"functionBody",
                    							lv_functionBody_7_0,
                    							"it.unibo.FPML.CompositionFunctionBodyEffect");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getEffectFullLambdaAccess().getRightCurlyBracketKeyword_0_8());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFPML.g:3645:3: ( () otherlv_10= '\\\\' otherlv_11= '[' otherlv_12= ']' otherlv_13= '->' otherlv_14= '{' ( (lv_functionBody_15_0= ruleCompositionFunctionBodyEffect ) ) otherlv_16= '}' )
                    {
                    // InternalFPML.g:3645:3: ( () otherlv_10= '\\\\' otherlv_11= '[' otherlv_12= ']' otherlv_13= '->' otherlv_14= '{' ( (lv_functionBody_15_0= ruleCompositionFunctionBodyEffect ) ) otherlv_16= '}' )
                    // InternalFPML.g:3646:4: () otherlv_10= '\\\\' otherlv_11= '[' otherlv_12= ']' otherlv_13= '->' otherlv_14= '{' ( (lv_functionBody_15_0= ruleCompositionFunctionBodyEffect ) ) otherlv_16= '}'
                    {
                    // InternalFPML.g:3646:4: ()
                    // InternalFPML.g:3647:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getEffectFullLambdaAccess().getEffectFullLambdaAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_10=(Token)match(input,46,FOLLOW_37); 

                    				newLeafNode(otherlv_10, grammarAccess.getEffectFullLambdaAccess().getReverseSolidusKeyword_1_1());
                    			
                    otherlv_11=(Token)match(input,39,FOLLOW_36); 

                    				newLeafNode(otherlv_11, grammarAccess.getEffectFullLambdaAccess().getLeftSquareBracketKeyword_1_2());
                    			
                    otherlv_12=(Token)match(input,40,FOLLOW_39); 

                    				newLeafNode(otherlv_12, grammarAccess.getEffectFullLambdaAccess().getRightSquareBracketKeyword_1_3());
                    			
                    otherlv_13=(Token)match(input,47,FOLLOW_4); 

                    				newLeafNode(otherlv_13, grammarAccess.getEffectFullLambdaAccess().getHyphenMinusGreaterThanSignKeyword_1_4());
                    			
                    otherlv_14=(Token)match(input,13,FOLLOW_24); 

                    				newLeafNode(otherlv_14, grammarAccess.getEffectFullLambdaAccess().getLeftCurlyBracketKeyword_1_5());
                    			
                    // InternalFPML.g:3673:4: ( (lv_functionBody_15_0= ruleCompositionFunctionBodyEffect ) )
                    // InternalFPML.g:3674:5: (lv_functionBody_15_0= ruleCompositionFunctionBodyEffect )
                    {
                    // InternalFPML.g:3674:5: (lv_functionBody_15_0= ruleCompositionFunctionBodyEffect )
                    // InternalFPML.g:3675:6: lv_functionBody_15_0= ruleCompositionFunctionBodyEffect
                    {

                    						newCompositeNode(grammarAccess.getEffectFullLambdaAccess().getFunctionBodyCompositionFunctionBodyEffectParserRuleCall_1_6_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_functionBody_15_0=ruleCompositionFunctionBodyEffect();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEffectFullLambdaRule());
                    						}
                    						set(
                    							current,
                    							"functionBody",
                    							lv_functionBody_15_0,
                    							"it.unibo.FPML.CompositionFunctionBodyEffect");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_16=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_16, grammarAccess.getEffectFullLambdaAccess().getRightCurlyBracketKeyword_1_7());
                    			

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
    // InternalFPML.g:3701:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalFPML.g:3701:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalFPML.g:3702:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalFPML.g:3708:1: ruleExpression returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_BooleanValue_2= ruleBooleanValue | this_DataValue_3= ruleDataValue | this_FunctionValue_4= ruleFunctionValue | this_UnitValue_5= ruleUnitValue | this_PureValueRef_6= rulePureValueRef | this_PureSumValue_7= rulePureSumValue | this_PureProdValue_8= rulePureProdValue ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_IntValue_0 = null;

        EObject this_StringValue_1 = null;

        EObject this_BooleanValue_2 = null;

        EObject this_DataValue_3 = null;

        EObject this_FunctionValue_4 = null;

        EObject this_UnitValue_5 = null;

        EObject this_PureValueRef_6 = null;

        EObject this_PureSumValue_7 = null;

        EObject this_PureProdValue_8 = null;



        	enterRule();

        try {
            // InternalFPML.g:3714:2: ( (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_BooleanValue_2= ruleBooleanValue | this_DataValue_3= ruleDataValue | this_FunctionValue_4= ruleFunctionValue | this_UnitValue_5= ruleUnitValue | this_PureValueRef_6= rulePureValueRef | this_PureSumValue_7= rulePureSumValue | this_PureProdValue_8= rulePureProdValue ) )
            // InternalFPML.g:3715:2: (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_BooleanValue_2= ruleBooleanValue | this_DataValue_3= ruleDataValue | this_FunctionValue_4= ruleFunctionValue | this_UnitValue_5= ruleUnitValue | this_PureValueRef_6= rulePureValueRef | this_PureSumValue_7= rulePureSumValue | this_PureProdValue_8= rulePureProdValue )
            {
            // InternalFPML.g:3715:2: (this_IntValue_0= ruleIntValue | this_StringValue_1= ruleStringValue | this_BooleanValue_2= ruleBooleanValue | this_DataValue_3= ruleDataValue | this_FunctionValue_4= ruleFunctionValue | this_UnitValue_5= ruleUnitValue | this_PureValueRef_6= rulePureValueRef | this_PureSumValue_7= rulePureSumValue | this_PureProdValue_8= rulePureProdValue )
            int alt32=9;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt32=1;
                }
                break;
            case RULE_STRING:
                {
                alt32=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt32=3;
                }
                break;
            case RULE_ID:
                {
                alt32=4;
                }
                break;
            case 46:
                {
                alt32=5;
                }
                break;
            case 44:
                {
                alt32=6;
                }
                break;
            case 48:
                {
                alt32=7;
                }
                break;
            case 49:
            case 50:
                {
                alt32=8;
                }
                break;
            case 21:
                {
                alt32=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalFPML.g:3716:3: this_IntValue_0= ruleIntValue
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
                    // InternalFPML.g:3725:3: this_StringValue_1= ruleStringValue
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
                    // InternalFPML.g:3734:3: this_BooleanValue_2= ruleBooleanValue
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getBooleanValueParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanValue_2=ruleBooleanValue();

                    state._fsp--;


                    			current = this_BooleanValue_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalFPML.g:3743:3: this_DataValue_3= ruleDataValue
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
                    // InternalFPML.g:3752:3: this_FunctionValue_4= ruleFunctionValue
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getFunctionValueParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_FunctionValue_4=ruleFunctionValue();

                    state._fsp--;


                    			current = this_FunctionValue_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalFPML.g:3761:3: this_UnitValue_5= ruleUnitValue
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getUnitValueParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_UnitValue_5=ruleUnitValue();

                    state._fsp--;


                    			current = this_UnitValue_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalFPML.g:3770:3: this_PureValueRef_6= rulePureValueRef
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getPureValueRefParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_PureValueRef_6=rulePureValueRef();

                    state._fsp--;


                    			current = this_PureValueRef_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalFPML.g:3779:3: this_PureSumValue_7= rulePureSumValue
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getPureSumValueParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_PureSumValue_7=rulePureSumValue();

                    state._fsp--;


                    			current = this_PureSumValue_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalFPML.g:3788:3: this_PureProdValue_8= rulePureProdValue
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getPureProdValueParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_PureProdValue_8=rulePureProdValue();

                    state._fsp--;


                    			current = this_PureProdValue_8;
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
    // InternalFPML.g:3800:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // InternalFPML.g:3800:49: (iv_ruleIntValue= ruleIntValue EOF )
            // InternalFPML.g:3801:2: iv_ruleIntValue= ruleIntValue EOF
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
    // InternalFPML.g:3807:1: ruleIntValue returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalFPML.g:3813:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // InternalFPML.g:3814:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // InternalFPML.g:3814:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // InternalFPML.g:3815:3: () ( (lv_value_1_0= RULE_INT ) )
            {
            // InternalFPML.g:3815:3: ()
            // InternalFPML.g:3816:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntValueAccess().getIntegerTypeAction_0(),
            					current);
            			

            }

            // InternalFPML.g:3822:3: ( (lv_value_1_0= RULE_INT ) )
            // InternalFPML.g:3823:4: (lv_value_1_0= RULE_INT )
            {
            // InternalFPML.g:3823:4: (lv_value_1_0= RULE_INT )
            // InternalFPML.g:3824:5: lv_value_1_0= RULE_INT
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
    // InternalFPML.g:3844:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalFPML.g:3844:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalFPML.g:3845:2: iv_ruleStringValue= ruleStringValue EOF
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
    // InternalFPML.g:3851:1: ruleStringValue returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalFPML.g:3857:2: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalFPML.g:3858:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalFPML.g:3858:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalFPML.g:3859:3: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // InternalFPML.g:3859:3: ()
            // InternalFPML.g:3860:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStringValueAccess().getStringTypeAction_0(),
            					current);
            			

            }

            // InternalFPML.g:3866:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalFPML.g:3867:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalFPML.g:3867:4: (lv_value_1_0= RULE_STRING )
            // InternalFPML.g:3868:5: lv_value_1_0= RULE_STRING
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


    // $ANTLR start "entryRuleBooleanValue"
    // InternalFPML.g:3888:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // InternalFPML.g:3888:53: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // InternalFPML.g:3889:2: iv_ruleBooleanValue= ruleBooleanValue EOF
            {
             newCompositeNode(grammarAccess.getBooleanValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanValue=ruleBooleanValue();

            state._fsp--;

             current =iv_ruleBooleanValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanValue"


    // $ANTLR start "ruleBooleanValue"
    // InternalFPML.g:3895:1: ruleBooleanValue returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_BOOLEAN ) ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalFPML.g:3901:2: ( ( () ( (lv_value_1_0= RULE_BOOLEAN ) ) ) )
            // InternalFPML.g:3902:2: ( () ( (lv_value_1_0= RULE_BOOLEAN ) ) )
            {
            // InternalFPML.g:3902:2: ( () ( (lv_value_1_0= RULE_BOOLEAN ) ) )
            // InternalFPML.g:3903:3: () ( (lv_value_1_0= RULE_BOOLEAN ) )
            {
            // InternalFPML.g:3903:3: ()
            // InternalFPML.g:3904:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBooleanValueAccess().getBooleanTypeAction_0(),
            					current);
            			

            }

            // InternalFPML.g:3910:3: ( (lv_value_1_0= RULE_BOOLEAN ) )
            // InternalFPML.g:3911:4: (lv_value_1_0= RULE_BOOLEAN )
            {
            // InternalFPML.g:3911:4: (lv_value_1_0= RULE_BOOLEAN )
            // InternalFPML.g:3912:5: lv_value_1_0= RULE_BOOLEAN
            {
            lv_value_1_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getBooleanValueAccess().getValueBOOLEANTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBooleanValueRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"it.unibo.FPML.BOOLEAN");
            				

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
    // $ANTLR end "ruleBooleanValue"


    // $ANTLR start "entryRuleFunctionValue"
    // InternalFPML.g:3932:1: entryRuleFunctionValue returns [EObject current=null] : iv_ruleFunctionValue= ruleFunctionValue EOF ;
    public final EObject entryRuleFunctionValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionValue = null;


        try {
            // InternalFPML.g:3932:54: (iv_ruleFunctionValue= ruleFunctionValue EOF )
            // InternalFPML.g:3933:2: iv_ruleFunctionValue= ruleFunctionValue EOF
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
    // InternalFPML.g:3939:1: ruleFunctionValue returns [EObject current=null] : ( (lv_value_0_0= rulePureLambda ) ) ;
    public final EObject ruleFunctionValue() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:3945:2: ( ( (lv_value_0_0= rulePureLambda ) ) )
            // InternalFPML.g:3946:2: ( (lv_value_0_0= rulePureLambda ) )
            {
            // InternalFPML.g:3946:2: ( (lv_value_0_0= rulePureLambda ) )
            // InternalFPML.g:3947:3: (lv_value_0_0= rulePureLambda )
            {
            // InternalFPML.g:3947:3: (lv_value_0_0= rulePureLambda )
            // InternalFPML.g:3948:4: lv_value_0_0= rulePureLambda
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
    // InternalFPML.g:3968:1: entryRuleDataValue returns [EObject current=null] : iv_ruleDataValue= ruleDataValue EOF ;
    public final EObject entryRuleDataValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataValue = null;


        try {
            // InternalFPML.g:3968:50: (iv_ruleDataValue= ruleDataValue EOF )
            // InternalFPML.g:3969:2: iv_ruleDataValue= ruleDataValue EOF
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
    // InternalFPML.g:3975:1: ruleDataValue returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_value_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleDataValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:3981:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_value_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalFPML.g:3982:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_value_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalFPML.g:3982:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_value_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalFPML.g:3983:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_value_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            // InternalFPML.g:3983:3: ()
            // InternalFPML.g:3984:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDataValueAccess().getDataValueAction_0(),
            					current);
            			

            }

            // InternalFPML.g:3990:3: ( (otherlv_1= RULE_ID ) )
            // InternalFPML.g:3991:4: (otherlv_1= RULE_ID )
            {
            // InternalFPML.g:3991:4: (otherlv_1= RULE_ID )
            // InternalFPML.g:3992:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataValueRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_1, grammarAccess.getDataValueAccess().getTypePureDataCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getDataValueAccess().getLeftParenthesisKeyword_2());
            		
            // InternalFPML.g:4007:3: ( (lv_value_3_0= ruleExpression ) )
            // InternalFPML.g:4008:4: (lv_value_3_0= ruleExpression )
            {
            // InternalFPML.g:4008:4: (lv_value_3_0= ruleExpression )
            // InternalFPML.g:4009:5: lv_value_3_0= ruleExpression
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

            otherlv_4=(Token)match(input,23,FOLLOW_2); 

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
    // InternalFPML.g:4034:1: entryRuleEffectFullDataValue returns [EObject current=null] : iv_ruleEffectFullDataValue= ruleEffectFullDataValue EOF ;
    public final EObject entryRuleEffectFullDataValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullDataValue = null;


        try {
            // InternalFPML.g:4034:60: (iv_ruleEffectFullDataValue= ruleEffectFullDataValue EOF )
            // InternalFPML.g:4035:2: iv_ruleEffectFullDataValue= ruleEffectFullDataValue EOF
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
    // InternalFPML.g:4041:1: ruleEffectFullDataValue returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '[' ( (lv_value_3_0= ruleEffectFullExpression ) ) otherlv_4= ']' ) ;
    public final EObject ruleEffectFullDataValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:4047:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '[' ( (lv_value_3_0= ruleEffectFullExpression ) ) otherlv_4= ']' ) )
            // InternalFPML.g:4048:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '[' ( (lv_value_3_0= ruleEffectFullExpression ) ) otherlv_4= ']' )
            {
            // InternalFPML.g:4048:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '[' ( (lv_value_3_0= ruleEffectFullExpression ) ) otherlv_4= ']' )
            // InternalFPML.g:4049:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= '[' ( (lv_value_3_0= ruleEffectFullExpression ) ) otherlv_4= ']'
            {
            // InternalFPML.g:4049:3: ()
            // InternalFPML.g:4050:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEffectFullDataValueAccess().getEffectFullDataValueAction_0(),
            					current);
            			

            }

            // InternalFPML.g:4056:3: ( (otherlv_1= RULE_ID ) )
            // InternalFPML.g:4057:4: (otherlv_1= RULE_ID )
            {
            // InternalFPML.g:4057:4: (otherlv_1= RULE_ID )
            // InternalFPML.g:4058:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEffectFullDataValueRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_37); 

            					newLeafNode(otherlv_1, grammarAccess.getEffectFullDataValueAccess().getTypeEffectFullDataCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,39,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getEffectFullDataValueAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalFPML.g:4073:3: ( (lv_value_3_0= ruleEffectFullExpression ) )
            // InternalFPML.g:4074:4: (lv_value_3_0= ruleEffectFullExpression )
            {
            // InternalFPML.g:4074:4: (lv_value_3_0= ruleEffectFullExpression )
            // InternalFPML.g:4075:5: lv_value_3_0= ruleEffectFullExpression
            {

            					newCompositeNode(grammarAccess.getEffectFullDataValueAccess().getValueEffectFullExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_36);
            lv_value_3_0=ruleEffectFullExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEffectFullDataValueRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"it.unibo.FPML.EffectFullExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,40,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEffectFullDataValueAccess().getRightSquareBracketKeyword_4());
            		

            }


            }


            	leaveRule();

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
    // InternalFPML.g:4100:1: entryRulePureValueRef returns [EObject current=null] : iv_rulePureValueRef= rulePureValueRef EOF ;
    public final EObject entryRulePureValueRef() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePureValueRef = null;


        try {
            // InternalFPML.g:4100:53: (iv_rulePureValueRef= rulePureValueRef EOF )
            // InternalFPML.g:4101:2: iv_rulePureValueRef= rulePureValueRef EOF
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
    // InternalFPML.g:4107:1: rulePureValueRef returns [EObject current=null] : ( () otherlv_1= 'PureRef' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ) ;
    public final EObject rulePureValueRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalFPML.g:4113:2: ( ( () otherlv_1= 'PureRef' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ) )
            // InternalFPML.g:4114:2: ( () otherlv_1= 'PureRef' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )
            {
            // InternalFPML.g:4114:2: ( () otherlv_1= 'PureRef' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )
            // InternalFPML.g:4115:3: () otherlv_1= 'PureRef' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')'
            {
            // InternalFPML.g:4115:3: ()
            // InternalFPML.g:4116:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPureValueRefAccess().getPureValueRefAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,48,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getPureValueRefAccess().getPureRefKeyword_1());
            		
            otherlv_2=(Token)match(input,21,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getPureValueRefAccess().getLeftParenthesisKeyword_2());
            		
            // InternalFPML.g:4130:3: ( (otherlv_3= RULE_ID ) )
            // InternalFPML.g:4131:4: (otherlv_3= RULE_ID )
            {
            // InternalFPML.g:4131:4: (otherlv_3= RULE_ID )
            // InternalFPML.g:4132:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPureValueRefRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_3, grammarAccess.getPureValueRefAccess().getValuePureValueCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getPureValueRefAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

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
    // InternalFPML.g:4151:1: entryRulePureLambda returns [EObject current=null] : iv_rulePureLambda= rulePureLambda EOF ;
    public final EObject entryRulePureLambda() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePureLambda = null;


        try {
            // InternalFPML.g:4151:51: (iv_rulePureLambda= rulePureLambda EOF )
            // InternalFPML.g:4152:2: iv_rulePureLambda= rulePureLambda EOF
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
    // InternalFPML.g:4158:1: rulePureLambda returns [EObject current=null] : ( ( () otherlv_1= '\\\\' otherlv_2= '(' ( (lv_arg_3_0= rulePureArgument ) ) otherlv_4= ')' otherlv_5= '->' otherlv_6= '{' ( (lv_functionBody_7_0= ruleCompositionFunctionBodyPure ) ) otherlv_8= '}' ) | ( () otherlv_10= '\\\\' otherlv_11= '(' otherlv_12= ')' otherlv_13= '->' otherlv_14= '{' ( (lv_functionBody_15_0= ruleCompositionFunctionBodyPure ) ) otherlv_16= '}' ) ) ;
    public final EObject rulePureLambda() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        EObject lv_arg_3_0 = null;

        EObject lv_functionBody_7_0 = null;

        EObject lv_functionBody_15_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:4164:2: ( ( ( () otherlv_1= '\\\\' otherlv_2= '(' ( (lv_arg_3_0= rulePureArgument ) ) otherlv_4= ')' otherlv_5= '->' otherlv_6= '{' ( (lv_functionBody_7_0= ruleCompositionFunctionBodyPure ) ) otherlv_8= '}' ) | ( () otherlv_10= '\\\\' otherlv_11= '(' otherlv_12= ')' otherlv_13= '->' otherlv_14= '{' ( (lv_functionBody_15_0= ruleCompositionFunctionBodyPure ) ) otherlv_16= '}' ) ) )
            // InternalFPML.g:4165:2: ( ( () otherlv_1= '\\\\' otherlv_2= '(' ( (lv_arg_3_0= rulePureArgument ) ) otherlv_4= ')' otherlv_5= '->' otherlv_6= '{' ( (lv_functionBody_7_0= ruleCompositionFunctionBodyPure ) ) otherlv_8= '}' ) | ( () otherlv_10= '\\\\' otherlv_11= '(' otherlv_12= ')' otherlv_13= '->' otherlv_14= '{' ( (lv_functionBody_15_0= ruleCompositionFunctionBodyPure ) ) otherlv_16= '}' ) )
            {
            // InternalFPML.g:4165:2: ( ( () otherlv_1= '\\\\' otherlv_2= '(' ( (lv_arg_3_0= rulePureArgument ) ) otherlv_4= ')' otherlv_5= '->' otherlv_6= '{' ( (lv_functionBody_7_0= ruleCompositionFunctionBodyPure ) ) otherlv_8= '}' ) | ( () otherlv_10= '\\\\' otherlv_11= '(' otherlv_12= ')' otherlv_13= '->' otherlv_14= '{' ( (lv_functionBody_15_0= ruleCompositionFunctionBodyPure ) ) otherlv_16= '}' ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==46) ) {
                int LA33_1 = input.LA(2);

                if ( (LA33_1==21) ) {
                    int LA33_2 = input.LA(3);

                    if ( (LA33_2==23) ) {
                        alt33=2;
                    }
                    else if ( ((LA33_2>=29 && LA33_2<=33)||LA33_2==35||LA33_2==39) ) {
                        alt33=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalFPML.g:4166:3: ( () otherlv_1= '\\\\' otherlv_2= '(' ( (lv_arg_3_0= rulePureArgument ) ) otherlv_4= ')' otherlv_5= '->' otherlv_6= '{' ( (lv_functionBody_7_0= ruleCompositionFunctionBodyPure ) ) otherlv_8= '}' )
                    {
                    // InternalFPML.g:4166:3: ( () otherlv_1= '\\\\' otherlv_2= '(' ( (lv_arg_3_0= rulePureArgument ) ) otherlv_4= ')' otherlv_5= '->' otherlv_6= '{' ( (lv_functionBody_7_0= ruleCompositionFunctionBodyPure ) ) otherlv_8= '}' )
                    // InternalFPML.g:4167:4: () otherlv_1= '\\\\' otherlv_2= '(' ( (lv_arg_3_0= rulePureArgument ) ) otherlv_4= ')' otherlv_5= '->' otherlv_6= '{' ( (lv_functionBody_7_0= ruleCompositionFunctionBodyPure ) ) otherlv_8= '}'
                    {
                    // InternalFPML.g:4167:4: ()
                    // InternalFPML.g:4168:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPureLambdaAccess().getPureLambdaAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,46,FOLLOW_18); 

                    				newLeafNode(otherlv_1, grammarAccess.getPureLambdaAccess().getReverseSolidusKeyword_0_1());
                    			
                    otherlv_2=(Token)match(input,21,FOLLOW_13); 

                    				newLeafNode(otherlv_2, grammarAccess.getPureLambdaAccess().getLeftParenthesisKeyword_0_2());
                    			
                    // InternalFPML.g:4182:4: ( (lv_arg_3_0= rulePureArgument ) )
                    // InternalFPML.g:4183:5: (lv_arg_3_0= rulePureArgument )
                    {
                    // InternalFPML.g:4183:5: (lv_arg_3_0= rulePureArgument )
                    // InternalFPML.g:4184:6: lv_arg_3_0= rulePureArgument
                    {

                    						newCompositeNode(grammarAccess.getPureLambdaAccess().getArgPureArgumentParserRuleCall_0_3_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_arg_3_0=rulePureArgument();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPureLambdaRule());
                    						}
                    						set(
                    							current,
                    							"arg",
                    							lv_arg_3_0,
                    							"it.unibo.FPML.PureArgument");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,23,FOLLOW_39); 

                    				newLeafNode(otherlv_4, grammarAccess.getPureLambdaAccess().getRightParenthesisKeyword_0_4());
                    			
                    otherlv_5=(Token)match(input,47,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getPureLambdaAccess().getHyphenMinusGreaterThanSignKeyword_0_5());
                    			
                    otherlv_6=(Token)match(input,13,FOLLOW_21); 

                    				newLeafNode(otherlv_6, grammarAccess.getPureLambdaAccess().getLeftCurlyBracketKeyword_0_6());
                    			
                    // InternalFPML.g:4213:4: ( (lv_functionBody_7_0= ruleCompositionFunctionBodyPure ) )
                    // InternalFPML.g:4214:5: (lv_functionBody_7_0= ruleCompositionFunctionBodyPure )
                    {
                    // InternalFPML.g:4214:5: (lv_functionBody_7_0= ruleCompositionFunctionBodyPure )
                    // InternalFPML.g:4215:6: lv_functionBody_7_0= ruleCompositionFunctionBodyPure
                    {

                    						newCompositeNode(grammarAccess.getPureLambdaAccess().getFunctionBodyCompositionFunctionBodyPureParserRuleCall_0_7_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_functionBody_7_0=ruleCompositionFunctionBodyPure();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPureLambdaRule());
                    						}
                    						set(
                    							current,
                    							"functionBody",
                    							lv_functionBody_7_0,
                    							"it.unibo.FPML.CompositionFunctionBodyPure");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getPureLambdaAccess().getRightCurlyBracketKeyword_0_8());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFPML.g:4238:3: ( () otherlv_10= '\\\\' otherlv_11= '(' otherlv_12= ')' otherlv_13= '->' otherlv_14= '{' ( (lv_functionBody_15_0= ruleCompositionFunctionBodyPure ) ) otherlv_16= '}' )
                    {
                    // InternalFPML.g:4238:3: ( () otherlv_10= '\\\\' otherlv_11= '(' otherlv_12= ')' otherlv_13= '->' otherlv_14= '{' ( (lv_functionBody_15_0= ruleCompositionFunctionBodyPure ) ) otherlv_16= '}' )
                    // InternalFPML.g:4239:4: () otherlv_10= '\\\\' otherlv_11= '(' otherlv_12= ')' otherlv_13= '->' otherlv_14= '{' ( (lv_functionBody_15_0= ruleCompositionFunctionBodyPure ) ) otherlv_16= '}'
                    {
                    // InternalFPML.g:4239:4: ()
                    // InternalFPML.g:4240:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPureLambdaAccess().getPureLambdaAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_10=(Token)match(input,46,FOLLOW_18); 

                    				newLeafNode(otherlv_10, grammarAccess.getPureLambdaAccess().getReverseSolidusKeyword_1_1());
                    			
                    otherlv_11=(Token)match(input,21,FOLLOW_20); 

                    				newLeafNode(otherlv_11, grammarAccess.getPureLambdaAccess().getLeftParenthesisKeyword_1_2());
                    			
                    otherlv_12=(Token)match(input,23,FOLLOW_39); 

                    				newLeafNode(otherlv_12, grammarAccess.getPureLambdaAccess().getRightParenthesisKeyword_1_3());
                    			
                    otherlv_13=(Token)match(input,47,FOLLOW_4); 

                    				newLeafNode(otherlv_13, grammarAccess.getPureLambdaAccess().getHyphenMinusGreaterThanSignKeyword_1_4());
                    			
                    otherlv_14=(Token)match(input,13,FOLLOW_21); 

                    				newLeafNode(otherlv_14, grammarAccess.getPureLambdaAccess().getLeftCurlyBracketKeyword_1_5());
                    			
                    // InternalFPML.g:4266:4: ( (lv_functionBody_15_0= ruleCompositionFunctionBodyPure ) )
                    // InternalFPML.g:4267:5: (lv_functionBody_15_0= ruleCompositionFunctionBodyPure )
                    {
                    // InternalFPML.g:4267:5: (lv_functionBody_15_0= ruleCompositionFunctionBodyPure )
                    // InternalFPML.g:4268:6: lv_functionBody_15_0= ruleCompositionFunctionBodyPure
                    {

                    						newCompositeNode(grammarAccess.getPureLambdaAccess().getFunctionBodyCompositionFunctionBodyPureParserRuleCall_1_6_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_functionBody_15_0=ruleCompositionFunctionBodyPure();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPureLambdaRule());
                    						}
                    						set(
                    							current,
                    							"functionBody",
                    							lv_functionBody_15_0,
                    							"it.unibo.FPML.CompositionFunctionBodyPure");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_16=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_16, grammarAccess.getPureLambdaAccess().getRightCurlyBracketKeyword_1_7());
                    			

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
    // InternalFPML.g:4294:1: entryRulePureProdValue returns [EObject current=null] : iv_rulePureProdValue= rulePureProdValue EOF ;
    public final EObject entryRulePureProdValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePureProdValue = null;


        try {
            // InternalFPML.g:4294:54: (iv_rulePureProdValue= rulePureProdValue EOF )
            // InternalFPML.g:4295:2: iv_rulePureProdValue= rulePureProdValue EOF
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
    // InternalFPML.g:4301:1: rulePureProdValue returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_prodAdtElement1_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_prodAdtElement2_4_0= ruleExpression ) ) otherlv_5= ')' ) ;
    public final EObject rulePureProdValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_prodAdtElement1_2_0 = null;

        EObject lv_prodAdtElement2_4_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:4307:2: ( ( () otherlv_1= '(' ( (lv_prodAdtElement1_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_prodAdtElement2_4_0= ruleExpression ) ) otherlv_5= ')' ) )
            // InternalFPML.g:4308:2: ( () otherlv_1= '(' ( (lv_prodAdtElement1_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_prodAdtElement2_4_0= ruleExpression ) ) otherlv_5= ')' )
            {
            // InternalFPML.g:4308:2: ( () otherlv_1= '(' ( (lv_prodAdtElement1_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_prodAdtElement2_4_0= ruleExpression ) ) otherlv_5= ')' )
            // InternalFPML.g:4309:3: () otherlv_1= '(' ( (lv_prodAdtElement1_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_prodAdtElement2_4_0= ruleExpression ) ) otherlv_5= ')'
            {
            // InternalFPML.g:4309:3: ()
            // InternalFPML.g:4310:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPureProdValueAccess().getPureProdValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getPureProdValueAccess().getLeftParenthesisKeyword_1());
            		
            // InternalFPML.g:4320:3: ( (lv_prodAdtElement1_2_0= ruleExpression ) )
            // InternalFPML.g:4321:4: (lv_prodAdtElement1_2_0= ruleExpression )
            {
            // InternalFPML.g:4321:4: (lv_prodAdtElement1_2_0= ruleExpression )
            // InternalFPML.g:4322:5: lv_prodAdtElement1_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getPureProdValueAccess().getProdAdtElement1ExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_33);
            lv_prodAdtElement1_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPureProdValueRule());
            					}
            					set(
            						current,
            						"prodAdtElement1",
            						lv_prodAdtElement1_2_0,
            						"it.unibo.FPML.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getPureProdValueAccess().getCommaKeyword_3());
            		
            // InternalFPML.g:4343:3: ( (lv_prodAdtElement2_4_0= ruleExpression ) )
            // InternalFPML.g:4344:4: (lv_prodAdtElement2_4_0= ruleExpression )
            {
            // InternalFPML.g:4344:4: (lv_prodAdtElement2_4_0= ruleExpression )
            // InternalFPML.g:4345:5: lv_prodAdtElement2_4_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getPureProdValueAccess().getProdAdtElement2ExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_20);
            lv_prodAdtElement2_4_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPureProdValueRule());
            					}
            					set(
            						current,
            						"prodAdtElement2",
            						lv_prodAdtElement2_4_0,
            						"it.unibo.FPML.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPureProdValueAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

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
    // InternalFPML.g:4370:1: entryRulePureSumValue returns [EObject current=null] : iv_rulePureSumValue= rulePureSumValue EOF ;
    public final EObject entryRulePureSumValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePureSumValue = null;


        try {
            // InternalFPML.g:4370:53: (iv_rulePureSumValue= rulePureSumValue EOF )
            // InternalFPML.g:4371:2: iv_rulePureSumValue= rulePureSumValue EOF
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
    // InternalFPML.g:4377:1: rulePureSumValue returns [EObject current=null] : ( ( () otherlv_1= 'Left' otherlv_2= '(' ( (lv_sumAdtElement1_3_0= ruleExpression ) ) otherlv_4= ')' ) | ( () otherlv_6= 'Right' otherlv_7= '(' ( (lv_sumAdtElement2_8_0= ruleExpression ) ) otherlv_9= ')' ) ) ;
    public final EObject rulePureSumValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_sumAdtElement1_3_0 = null;

        EObject lv_sumAdtElement2_8_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:4383:2: ( ( ( () otherlv_1= 'Left' otherlv_2= '(' ( (lv_sumAdtElement1_3_0= ruleExpression ) ) otherlv_4= ')' ) | ( () otherlv_6= 'Right' otherlv_7= '(' ( (lv_sumAdtElement2_8_0= ruleExpression ) ) otherlv_9= ')' ) ) )
            // InternalFPML.g:4384:2: ( ( () otherlv_1= 'Left' otherlv_2= '(' ( (lv_sumAdtElement1_3_0= ruleExpression ) ) otherlv_4= ')' ) | ( () otherlv_6= 'Right' otherlv_7= '(' ( (lv_sumAdtElement2_8_0= ruleExpression ) ) otherlv_9= ')' ) )
            {
            // InternalFPML.g:4384:2: ( ( () otherlv_1= 'Left' otherlv_2= '(' ( (lv_sumAdtElement1_3_0= ruleExpression ) ) otherlv_4= ')' ) | ( () otherlv_6= 'Right' otherlv_7= '(' ( (lv_sumAdtElement2_8_0= ruleExpression ) ) otherlv_9= ')' ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==49) ) {
                alt34=1;
            }
            else if ( (LA34_0==50) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalFPML.g:4385:3: ( () otherlv_1= 'Left' otherlv_2= '(' ( (lv_sumAdtElement1_3_0= ruleExpression ) ) otherlv_4= ')' )
                    {
                    // InternalFPML.g:4385:3: ( () otherlv_1= 'Left' otherlv_2= '(' ( (lv_sumAdtElement1_3_0= ruleExpression ) ) otherlv_4= ')' )
                    // InternalFPML.g:4386:4: () otherlv_1= 'Left' otherlv_2= '(' ( (lv_sumAdtElement1_3_0= ruleExpression ) ) otherlv_4= ')'
                    {
                    // InternalFPML.g:4386:4: ()
                    // InternalFPML.g:4387:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPureSumValueAccess().getPureSumValueAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,49,FOLLOW_18); 

                    				newLeafNode(otherlv_1, grammarAccess.getPureSumValueAccess().getLeftKeyword_0_1());
                    			
                    otherlv_2=(Token)match(input,21,FOLLOW_14); 

                    				newLeafNode(otherlv_2, grammarAccess.getPureSumValueAccess().getLeftParenthesisKeyword_0_2());
                    			
                    // InternalFPML.g:4401:4: ( (lv_sumAdtElement1_3_0= ruleExpression ) )
                    // InternalFPML.g:4402:5: (lv_sumAdtElement1_3_0= ruleExpression )
                    {
                    // InternalFPML.g:4402:5: (lv_sumAdtElement1_3_0= ruleExpression )
                    // InternalFPML.g:4403:6: lv_sumAdtElement1_3_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getPureSumValueAccess().getSumAdtElement1ExpressionParserRuleCall_0_3_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_sumAdtElement1_3_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPureSumValueRule());
                    						}
                    						set(
                    							current,
                    							"sumAdtElement1",
                    							lv_sumAdtElement1_3_0,
                    							"it.unibo.FPML.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getPureSumValueAccess().getRightParenthesisKeyword_0_4());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFPML.g:4426:3: ( () otherlv_6= 'Right' otherlv_7= '(' ( (lv_sumAdtElement2_8_0= ruleExpression ) ) otherlv_9= ')' )
                    {
                    // InternalFPML.g:4426:3: ( () otherlv_6= 'Right' otherlv_7= '(' ( (lv_sumAdtElement2_8_0= ruleExpression ) ) otherlv_9= ')' )
                    // InternalFPML.g:4427:4: () otherlv_6= 'Right' otherlv_7= '(' ( (lv_sumAdtElement2_8_0= ruleExpression ) ) otherlv_9= ')'
                    {
                    // InternalFPML.g:4427:4: ()
                    // InternalFPML.g:4428:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPureSumValueAccess().getPureSumValueAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_6=(Token)match(input,50,FOLLOW_18); 

                    				newLeafNode(otherlv_6, grammarAccess.getPureSumValueAccess().getRightKeyword_1_1());
                    			
                    otherlv_7=(Token)match(input,21,FOLLOW_14); 

                    				newLeafNode(otherlv_7, grammarAccess.getPureSumValueAccess().getLeftParenthesisKeyword_1_2());
                    			
                    // InternalFPML.g:4442:4: ( (lv_sumAdtElement2_8_0= ruleExpression ) )
                    // InternalFPML.g:4443:5: (lv_sumAdtElement2_8_0= ruleExpression )
                    {
                    // InternalFPML.g:4443:5: (lv_sumAdtElement2_8_0= ruleExpression )
                    // InternalFPML.g:4444:6: lv_sumAdtElement2_8_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getPureSumValueAccess().getSumAdtElement2ExpressionParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_sumAdtElement2_8_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPureSumValueRule());
                    						}
                    						set(
                    							current,
                    							"sumAdtElement2",
                    							lv_sumAdtElement2_8_0,
                    							"it.unibo.FPML.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getPureSumValueAccess().getRightParenthesisKeyword_1_4());
                    			

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


    // $ANTLR start "entryRuleEffectFullProdValue"
    // InternalFPML.g:4470:1: entryRuleEffectFullProdValue returns [EObject current=null] : iv_ruleEffectFullProdValue= ruleEffectFullProdValue EOF ;
    public final EObject entryRuleEffectFullProdValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullProdValue = null;


        try {
            // InternalFPML.g:4470:60: (iv_ruleEffectFullProdValue= ruleEffectFullProdValue EOF )
            // InternalFPML.g:4471:2: iv_ruleEffectFullProdValue= ruleEffectFullProdValue EOF
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
    // InternalFPML.g:4477:1: ruleEffectFullProdValue returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_prodAdtElement1_2_0= ruleEffectFullExpression ) ) otherlv_3= ',' ( (lv_prodAdtElement2_4_0= ruleEffectFullExpression ) ) otherlv_5= ']' ) ;
    public final EObject ruleEffectFullProdValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_prodAdtElement1_2_0 = null;

        EObject lv_prodAdtElement2_4_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:4483:2: ( ( () otherlv_1= '[' ( (lv_prodAdtElement1_2_0= ruleEffectFullExpression ) ) otherlv_3= ',' ( (lv_prodAdtElement2_4_0= ruleEffectFullExpression ) ) otherlv_5= ']' ) )
            // InternalFPML.g:4484:2: ( () otherlv_1= '[' ( (lv_prodAdtElement1_2_0= ruleEffectFullExpression ) ) otherlv_3= ',' ( (lv_prodAdtElement2_4_0= ruleEffectFullExpression ) ) otherlv_5= ']' )
            {
            // InternalFPML.g:4484:2: ( () otherlv_1= '[' ( (lv_prodAdtElement1_2_0= ruleEffectFullExpression ) ) otherlv_3= ',' ( (lv_prodAdtElement2_4_0= ruleEffectFullExpression ) ) otherlv_5= ']' )
            // InternalFPML.g:4485:3: () otherlv_1= '[' ( (lv_prodAdtElement1_2_0= ruleEffectFullExpression ) ) otherlv_3= ',' ( (lv_prodAdtElement2_4_0= ruleEffectFullExpression ) ) otherlv_5= ']'
            {
            // InternalFPML.g:4485:3: ()
            // InternalFPML.g:4486:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEffectFullProdValueAccess().getEffectFullProdValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getEffectFullProdValueAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalFPML.g:4496:3: ( (lv_prodAdtElement1_2_0= ruleEffectFullExpression ) )
            // InternalFPML.g:4497:4: (lv_prodAdtElement1_2_0= ruleEffectFullExpression )
            {
            // InternalFPML.g:4497:4: (lv_prodAdtElement1_2_0= ruleEffectFullExpression )
            // InternalFPML.g:4498:5: lv_prodAdtElement1_2_0= ruleEffectFullExpression
            {

            					newCompositeNode(grammarAccess.getEffectFullProdValueAccess().getProdAdtElement1EffectFullExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_33);
            lv_prodAdtElement1_2_0=ruleEffectFullExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEffectFullProdValueRule());
            					}
            					set(
            						current,
            						"prodAdtElement1",
            						lv_prodAdtElement1_2_0,
            						"it.unibo.FPML.EffectFullExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getEffectFullProdValueAccess().getCommaKeyword_3());
            		
            // InternalFPML.g:4519:3: ( (lv_prodAdtElement2_4_0= ruleEffectFullExpression ) )
            // InternalFPML.g:4520:4: (lv_prodAdtElement2_4_0= ruleEffectFullExpression )
            {
            // InternalFPML.g:4520:4: (lv_prodAdtElement2_4_0= ruleEffectFullExpression )
            // InternalFPML.g:4521:5: lv_prodAdtElement2_4_0= ruleEffectFullExpression
            {

            					newCompositeNode(grammarAccess.getEffectFullProdValueAccess().getProdAdtElement2EffectFullExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_36);
            lv_prodAdtElement2_4_0=ruleEffectFullExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEffectFullProdValueRule());
            					}
            					set(
            						current,
            						"prodAdtElement2",
            						lv_prodAdtElement2_4_0,
            						"it.unibo.FPML.EffectFullExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,40,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getEffectFullProdValueAccess().getRightSquareBracketKeyword_5());
            		

            }


            }


            	leaveRule();

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
    // InternalFPML.g:4546:1: entryRuleEffectFullSumValue returns [EObject current=null] : iv_ruleEffectFullSumValue= ruleEffectFullSumValue EOF ;
    public final EObject entryRuleEffectFullSumValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullSumValue = null;


        try {
            // InternalFPML.g:4546:59: (iv_ruleEffectFullSumValue= ruleEffectFullSumValue EOF )
            // InternalFPML.g:4547:2: iv_ruleEffectFullSumValue= ruleEffectFullSumValue EOF
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
    // InternalFPML.g:4553:1: ruleEffectFullSumValue returns [EObject current=null] : ( ( () otherlv_1= 'Left' otherlv_2= '[' ( (lv_sumAdtElement1_3_0= ruleEffectFullExpression ) ) otherlv_4= ']' ) | ( () otherlv_6= 'Right' otherlv_7= '[' ( (lv_sumAdtElement2_8_0= ruleEffectFullExpression ) ) otherlv_9= ']' ) ) ;
    public final EObject ruleEffectFullSumValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_sumAdtElement1_3_0 = null;

        EObject lv_sumAdtElement2_8_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:4559:2: ( ( ( () otherlv_1= 'Left' otherlv_2= '[' ( (lv_sumAdtElement1_3_0= ruleEffectFullExpression ) ) otherlv_4= ']' ) | ( () otherlv_6= 'Right' otherlv_7= '[' ( (lv_sumAdtElement2_8_0= ruleEffectFullExpression ) ) otherlv_9= ']' ) ) )
            // InternalFPML.g:4560:2: ( ( () otherlv_1= 'Left' otherlv_2= '[' ( (lv_sumAdtElement1_3_0= ruleEffectFullExpression ) ) otherlv_4= ']' ) | ( () otherlv_6= 'Right' otherlv_7= '[' ( (lv_sumAdtElement2_8_0= ruleEffectFullExpression ) ) otherlv_9= ']' ) )
            {
            // InternalFPML.g:4560:2: ( ( () otherlv_1= 'Left' otherlv_2= '[' ( (lv_sumAdtElement1_3_0= ruleEffectFullExpression ) ) otherlv_4= ']' ) | ( () otherlv_6= 'Right' otherlv_7= '[' ( (lv_sumAdtElement2_8_0= ruleEffectFullExpression ) ) otherlv_9= ']' ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==49) ) {
                alt35=1;
            }
            else if ( (LA35_0==50) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalFPML.g:4561:3: ( () otherlv_1= 'Left' otherlv_2= '[' ( (lv_sumAdtElement1_3_0= ruleEffectFullExpression ) ) otherlv_4= ']' )
                    {
                    // InternalFPML.g:4561:3: ( () otherlv_1= 'Left' otherlv_2= '[' ( (lv_sumAdtElement1_3_0= ruleEffectFullExpression ) ) otherlv_4= ']' )
                    // InternalFPML.g:4562:4: () otherlv_1= 'Left' otherlv_2= '[' ( (lv_sumAdtElement1_3_0= ruleEffectFullExpression ) ) otherlv_4= ']'
                    {
                    // InternalFPML.g:4562:4: ()
                    // InternalFPML.g:4563:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getEffectFullSumValueAccess().getEffectFullSumValueAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,49,FOLLOW_37); 

                    				newLeafNode(otherlv_1, grammarAccess.getEffectFullSumValueAccess().getLeftKeyword_0_1());
                    			
                    otherlv_2=(Token)match(input,39,FOLLOW_16); 

                    				newLeafNode(otherlv_2, grammarAccess.getEffectFullSumValueAccess().getLeftSquareBracketKeyword_0_2());
                    			
                    // InternalFPML.g:4577:4: ( (lv_sumAdtElement1_3_0= ruleEffectFullExpression ) )
                    // InternalFPML.g:4578:5: (lv_sumAdtElement1_3_0= ruleEffectFullExpression )
                    {
                    // InternalFPML.g:4578:5: (lv_sumAdtElement1_3_0= ruleEffectFullExpression )
                    // InternalFPML.g:4579:6: lv_sumAdtElement1_3_0= ruleEffectFullExpression
                    {

                    						newCompositeNode(grammarAccess.getEffectFullSumValueAccess().getSumAdtElement1EffectFullExpressionParserRuleCall_0_3_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_sumAdtElement1_3_0=ruleEffectFullExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEffectFullSumValueRule());
                    						}
                    						set(
                    							current,
                    							"sumAdtElement1",
                    							lv_sumAdtElement1_3_0,
                    							"it.unibo.FPML.EffectFullExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,40,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getEffectFullSumValueAccess().getRightSquareBracketKeyword_0_4());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFPML.g:4602:3: ( () otherlv_6= 'Right' otherlv_7= '[' ( (lv_sumAdtElement2_8_0= ruleEffectFullExpression ) ) otherlv_9= ']' )
                    {
                    // InternalFPML.g:4602:3: ( () otherlv_6= 'Right' otherlv_7= '[' ( (lv_sumAdtElement2_8_0= ruleEffectFullExpression ) ) otherlv_9= ']' )
                    // InternalFPML.g:4603:4: () otherlv_6= 'Right' otherlv_7= '[' ( (lv_sumAdtElement2_8_0= ruleEffectFullExpression ) ) otherlv_9= ']'
                    {
                    // InternalFPML.g:4603:4: ()
                    // InternalFPML.g:4604:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getEffectFullSumValueAccess().getEffectFullSumValueAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_6=(Token)match(input,50,FOLLOW_37); 

                    				newLeafNode(otherlv_6, grammarAccess.getEffectFullSumValueAccess().getRightKeyword_1_1());
                    			
                    otherlv_7=(Token)match(input,39,FOLLOW_16); 

                    				newLeafNode(otherlv_7, grammarAccess.getEffectFullSumValueAccess().getLeftSquareBracketKeyword_1_2());
                    			
                    // InternalFPML.g:4618:4: ( (lv_sumAdtElement2_8_0= ruleEffectFullExpression ) )
                    // InternalFPML.g:4619:5: (lv_sumAdtElement2_8_0= ruleEffectFullExpression )
                    {
                    // InternalFPML.g:4619:5: (lv_sumAdtElement2_8_0= ruleEffectFullExpression )
                    // InternalFPML.g:4620:6: lv_sumAdtElement2_8_0= ruleEffectFullExpression
                    {

                    						newCompositeNode(grammarAccess.getEffectFullSumValueAccess().getSumAdtElement2EffectFullExpressionParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_sumAdtElement2_8_0=ruleEffectFullExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEffectFullSumValueRule());
                    						}
                    						set(
                    							current,
                    							"sumAdtElement2",
                    							lv_sumAdtElement2_8_0,
                    							"it.unibo.FPML.EffectFullExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,40,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getEffectFullSumValueAccess().getRightSquareBracketKeyword_1_4());
                    			

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
    // InternalFPML.g:4646:1: entryRulePrimitivePureFunction returns [EObject current=null] : iv_rulePrimitivePureFunction= rulePrimitivePureFunction EOF ;
    public final EObject entryRulePrimitivePureFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitivePureFunction = null;


        try {
            // InternalFPML.g:4646:62: (iv_rulePrimitivePureFunction= rulePrimitivePureFunction EOF )
            // InternalFPML.g:4647:2: iv_rulePrimitivePureFunction= rulePrimitivePureFunction EOF
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
    // InternalFPML.g:4653:1: rulePrimitivePureFunction returns [EObject current=null] : (this_IntToString_0= ruleIntToString | this_IntPow_1= ruleIntPow | this_Plus_2= rulePlus | this_Minus_3= ruleMinus | this_Times_4= ruleTimes | this_Mod_5= ruleMod | this_ApplyF_6= ruleApplyF | this_LeftAlgebraic_7= ruleLeftAlgebraic | this_RightAlgebraic_8= ruleRightAlgebraic | this_Equals_9= ruleEquals | this_MinorEquals_10= ruleMinorEquals | this_MajorEquals_11= ruleMajorEquals | this_Minor_12= ruleMinor | this_Major_13= ruleMajor | this_LogicAnd_14= ruleLogicAnd | this_LogicOr_15= ruleLogicOr | this_ExtractPure_16= ruleExtractPure | this_IsLeftPure_17= ruleIsLeftPure | this_IsRightPure_18= ruleIsRightPure | this_PureIf_19= rulePureIf ) ;
    public final EObject rulePrimitivePureFunction() throws RecognitionException {
        EObject current = null;

        EObject this_IntToString_0 = null;

        EObject this_IntPow_1 = null;

        EObject this_Plus_2 = null;

        EObject this_Minus_3 = null;

        EObject this_Times_4 = null;

        EObject this_Mod_5 = null;

        EObject this_ApplyF_6 = null;

        EObject this_LeftAlgebraic_7 = null;

        EObject this_RightAlgebraic_8 = null;

        EObject this_Equals_9 = null;

        EObject this_MinorEquals_10 = null;

        EObject this_MajorEquals_11 = null;

        EObject this_Minor_12 = null;

        EObject this_Major_13 = null;

        EObject this_LogicAnd_14 = null;

        EObject this_LogicOr_15 = null;

        EObject this_ExtractPure_16 = null;

        EObject this_IsLeftPure_17 = null;

        EObject this_IsRightPure_18 = null;

        EObject this_PureIf_19 = null;



        	enterRule();

        try {
            // InternalFPML.g:4659:2: ( (this_IntToString_0= ruleIntToString | this_IntPow_1= ruleIntPow | this_Plus_2= rulePlus | this_Minus_3= ruleMinus | this_Times_4= ruleTimes | this_Mod_5= ruleMod | this_ApplyF_6= ruleApplyF | this_LeftAlgebraic_7= ruleLeftAlgebraic | this_RightAlgebraic_8= ruleRightAlgebraic | this_Equals_9= ruleEquals | this_MinorEquals_10= ruleMinorEquals | this_MajorEquals_11= ruleMajorEquals | this_Minor_12= ruleMinor | this_Major_13= ruleMajor | this_LogicAnd_14= ruleLogicAnd | this_LogicOr_15= ruleLogicOr | this_ExtractPure_16= ruleExtractPure | this_IsLeftPure_17= ruleIsLeftPure | this_IsRightPure_18= ruleIsRightPure | this_PureIf_19= rulePureIf ) )
            // InternalFPML.g:4660:2: (this_IntToString_0= ruleIntToString | this_IntPow_1= ruleIntPow | this_Plus_2= rulePlus | this_Minus_3= ruleMinus | this_Times_4= ruleTimes | this_Mod_5= ruleMod | this_ApplyF_6= ruleApplyF | this_LeftAlgebraic_7= ruleLeftAlgebraic | this_RightAlgebraic_8= ruleRightAlgebraic | this_Equals_9= ruleEquals | this_MinorEquals_10= ruleMinorEquals | this_MajorEquals_11= ruleMajorEquals | this_Minor_12= ruleMinor | this_Major_13= ruleMajor | this_LogicAnd_14= ruleLogicAnd | this_LogicOr_15= ruleLogicOr | this_ExtractPure_16= ruleExtractPure | this_IsLeftPure_17= ruleIsLeftPure | this_IsRightPure_18= ruleIsRightPure | this_PureIf_19= rulePureIf )
            {
            // InternalFPML.g:4660:2: (this_IntToString_0= ruleIntToString | this_IntPow_1= ruleIntPow | this_Plus_2= rulePlus | this_Minus_3= ruleMinus | this_Times_4= ruleTimes | this_Mod_5= ruleMod | this_ApplyF_6= ruleApplyF | this_LeftAlgebraic_7= ruleLeftAlgebraic | this_RightAlgebraic_8= ruleRightAlgebraic | this_Equals_9= ruleEquals | this_MinorEquals_10= ruleMinorEquals | this_MajorEquals_11= ruleMajorEquals | this_Minor_12= ruleMinor | this_Major_13= ruleMajor | this_LogicAnd_14= ruleLogicAnd | this_LogicOr_15= ruleLogicOr | this_ExtractPure_16= ruleExtractPure | this_IsLeftPure_17= ruleIsLeftPure | this_IsRightPure_18= ruleIsRightPure | this_PureIf_19= rulePureIf )
            int alt36=20;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt36=1;
                }
                break;
            case 52:
                {
                alt36=2;
                }
                break;
            case 41:
                {
                alt36=3;
                }
                break;
            case 53:
                {
                alt36=4;
                }
                break;
            case 42:
                {
                alt36=5;
                }
                break;
            case 54:
                {
                alt36=6;
                }
                break;
            case 57:
                {
                alt36=7;
                }
                break;
            case 55:
                {
                alt36=8;
                }
                break;
            case 56:
                {
                alt36=9;
                }
                break;
            case 58:
                {
                alt36=10;
                }
                break;
            case 59:
                {
                alt36=11;
                }
                break;
            case 60:
                {
                alt36=12;
                }
                break;
            case 36:
                {
                alt36=13;
                }
                break;
            case 37:
                {
                alt36=14;
                }
                break;
            case 61:
                {
                alt36=15;
                }
                break;
            case 62:
                {
                alt36=16;
                }
                break;
            case 63:
                {
                alt36=17;
                }
                break;
            case 64:
                {
                alt36=18;
                }
                break;
            case 65:
                {
                alt36=19;
                }
                break;
            case 66:
                {
                alt36=20;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // InternalFPML.g:4661:3: this_IntToString_0= ruleIntToString
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
                    // InternalFPML.g:4670:3: this_IntPow_1= ruleIntPow
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
                    // InternalFPML.g:4679:3: this_Plus_2= rulePlus
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
                    // InternalFPML.g:4688:3: this_Minus_3= ruleMinus
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
                    // InternalFPML.g:4697:3: this_Times_4= ruleTimes
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
                    // InternalFPML.g:4706:3: this_Mod_5= ruleMod
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
                    // InternalFPML.g:4715:3: this_ApplyF_6= ruleApplyF
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
                    // InternalFPML.g:4724:3: this_LeftAlgebraic_7= ruleLeftAlgebraic
                    {

                    			newCompositeNode(grammarAccess.getPrimitivePureFunctionAccess().getLeftAlgebraicParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_LeftAlgebraic_7=ruleLeftAlgebraic();

                    state._fsp--;


                    			current = this_LeftAlgebraic_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalFPML.g:4733:3: this_RightAlgebraic_8= ruleRightAlgebraic
                    {

                    			newCompositeNode(grammarAccess.getPrimitivePureFunctionAccess().getRightAlgebraicParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_RightAlgebraic_8=ruleRightAlgebraic();

                    state._fsp--;


                    			current = this_RightAlgebraic_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalFPML.g:4742:3: this_Equals_9= ruleEquals
                    {

                    			newCompositeNode(grammarAccess.getPrimitivePureFunctionAccess().getEqualsParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_Equals_9=ruleEquals();

                    state._fsp--;


                    			current = this_Equals_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalFPML.g:4751:3: this_MinorEquals_10= ruleMinorEquals
                    {

                    			newCompositeNode(grammarAccess.getPrimitivePureFunctionAccess().getMinorEqualsParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_MinorEquals_10=ruleMinorEquals();

                    state._fsp--;


                    			current = this_MinorEquals_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalFPML.g:4760:3: this_MajorEquals_11= ruleMajorEquals
                    {

                    			newCompositeNode(grammarAccess.getPrimitivePureFunctionAccess().getMajorEqualsParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_MajorEquals_11=ruleMajorEquals();

                    state._fsp--;


                    			current = this_MajorEquals_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalFPML.g:4769:3: this_Minor_12= ruleMinor
                    {

                    			newCompositeNode(grammarAccess.getPrimitivePureFunctionAccess().getMinorParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_Minor_12=ruleMinor();

                    state._fsp--;


                    			current = this_Minor_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 14 :
                    // InternalFPML.g:4778:3: this_Major_13= ruleMajor
                    {

                    			newCompositeNode(grammarAccess.getPrimitivePureFunctionAccess().getMajorParserRuleCall_13());
                    		
                    pushFollow(FOLLOW_2);
                    this_Major_13=ruleMajor();

                    state._fsp--;


                    			current = this_Major_13;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 15 :
                    // InternalFPML.g:4787:3: this_LogicAnd_14= ruleLogicAnd
                    {

                    			newCompositeNode(grammarAccess.getPrimitivePureFunctionAccess().getLogicAndParserRuleCall_14());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicAnd_14=ruleLogicAnd();

                    state._fsp--;


                    			current = this_LogicAnd_14;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 16 :
                    // InternalFPML.g:4796:3: this_LogicOr_15= ruleLogicOr
                    {

                    			newCompositeNode(grammarAccess.getPrimitivePureFunctionAccess().getLogicOrParserRuleCall_15());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicOr_15=ruleLogicOr();

                    state._fsp--;


                    			current = this_LogicOr_15;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 17 :
                    // InternalFPML.g:4805:3: this_ExtractPure_16= ruleExtractPure
                    {

                    			newCompositeNode(grammarAccess.getPrimitivePureFunctionAccess().getExtractPureParserRuleCall_16());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExtractPure_16=ruleExtractPure();

                    state._fsp--;


                    			current = this_ExtractPure_16;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 18 :
                    // InternalFPML.g:4814:3: this_IsLeftPure_17= ruleIsLeftPure
                    {

                    			newCompositeNode(grammarAccess.getPrimitivePureFunctionAccess().getIsLeftPureParserRuleCall_17());
                    		
                    pushFollow(FOLLOW_2);
                    this_IsLeftPure_17=ruleIsLeftPure();

                    state._fsp--;


                    			current = this_IsLeftPure_17;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 19 :
                    // InternalFPML.g:4823:3: this_IsRightPure_18= ruleIsRightPure
                    {

                    			newCompositeNode(grammarAccess.getPrimitivePureFunctionAccess().getIsRightPureParserRuleCall_18());
                    		
                    pushFollow(FOLLOW_2);
                    this_IsRightPure_18=ruleIsRightPure();

                    state._fsp--;


                    			current = this_IsRightPure_18;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 20 :
                    // InternalFPML.g:4832:3: this_PureIf_19= rulePureIf
                    {

                    			newCompositeNode(grammarAccess.getPrimitivePureFunctionAccess().getPureIfParserRuleCall_19());
                    		
                    pushFollow(FOLLOW_2);
                    this_PureIf_19=rulePureIf();

                    state._fsp--;


                    			current = this_PureIf_19;
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
    // InternalFPML.g:4844:1: entryRuleIntToString returns [EObject current=null] : iv_ruleIntToString= ruleIntToString EOF ;
    public final EObject entryRuleIntToString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntToString = null;


        try {
            // InternalFPML.g:4844:52: (iv_ruleIntToString= ruleIntToString EOF )
            // InternalFPML.g:4845:2: iv_ruleIntToString= ruleIntToString EOF
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
    // InternalFPML.g:4851:1: ruleIntToString returns [EObject current=null] : ( () otherlv_1= 'intToString' ) ;
    public final EObject ruleIntToString() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFPML.g:4857:2: ( ( () otherlv_1= 'intToString' ) )
            // InternalFPML.g:4858:2: ( () otherlv_1= 'intToString' )
            {
            // InternalFPML.g:4858:2: ( () otherlv_1= 'intToString' )
            // InternalFPML.g:4859:3: () otherlv_1= 'intToString'
            {
            // InternalFPML.g:4859:3: ()
            // InternalFPML.g:4860:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntToStringAccess().getIntToStringAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,51,FOLLOW_2); 

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
    // InternalFPML.g:4874:1: entryRuleIntPow returns [EObject current=null] : iv_ruleIntPow= ruleIntPow EOF ;
    public final EObject entryRuleIntPow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntPow = null;


        try {
            // InternalFPML.g:4874:47: (iv_ruleIntPow= ruleIntPow EOF )
            // InternalFPML.g:4875:2: iv_ruleIntPow= ruleIntPow EOF
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
    // InternalFPML.g:4881:1: ruleIntPow returns [EObject current=null] : ( () otherlv_1= 'intPow' ) ;
    public final EObject ruleIntPow() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFPML.g:4887:2: ( ( () otherlv_1= 'intPow' ) )
            // InternalFPML.g:4888:2: ( () otherlv_1= 'intPow' )
            {
            // InternalFPML.g:4888:2: ( () otherlv_1= 'intPow' )
            // InternalFPML.g:4889:3: () otherlv_1= 'intPow'
            {
            // InternalFPML.g:4889:3: ()
            // InternalFPML.g:4890:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntPowAccess().getIntPowAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,52,FOLLOW_2); 

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
    // InternalFPML.g:4904:1: entryRulePlus returns [EObject current=null] : iv_rulePlus= rulePlus EOF ;
    public final EObject entryRulePlus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlus = null;


        try {
            // InternalFPML.g:4904:45: (iv_rulePlus= rulePlus EOF )
            // InternalFPML.g:4905:2: iv_rulePlus= rulePlus EOF
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
    // InternalFPML.g:4911:1: rulePlus returns [EObject current=null] : ( () otherlv_1= '+' ( ( (lv_type_2_1= ruleIntegerType | lv_type_2_2= ruleStringType ) ) ) ) ;
    public final EObject rulePlus() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_type_2_1 = null;

        EObject lv_type_2_2 = null;



        	enterRule();

        try {
            // InternalFPML.g:4917:2: ( ( () otherlv_1= '+' ( ( (lv_type_2_1= ruleIntegerType | lv_type_2_2= ruleStringType ) ) ) ) )
            // InternalFPML.g:4918:2: ( () otherlv_1= '+' ( ( (lv_type_2_1= ruleIntegerType | lv_type_2_2= ruleStringType ) ) ) )
            {
            // InternalFPML.g:4918:2: ( () otherlv_1= '+' ( ( (lv_type_2_1= ruleIntegerType | lv_type_2_2= ruleStringType ) ) ) )
            // InternalFPML.g:4919:3: () otherlv_1= '+' ( ( (lv_type_2_1= ruleIntegerType | lv_type_2_2= ruleStringType ) ) )
            {
            // InternalFPML.g:4919:3: ()
            // InternalFPML.g:4920:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPlusAccess().getPlusAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_40); 

            			newLeafNode(otherlv_1, grammarAccess.getPlusAccess().getPlusSignKeyword_1());
            		
            // InternalFPML.g:4930:3: ( ( (lv_type_2_1= ruleIntegerType | lv_type_2_2= ruleStringType ) ) )
            // InternalFPML.g:4931:4: ( (lv_type_2_1= ruleIntegerType | lv_type_2_2= ruleStringType ) )
            {
            // InternalFPML.g:4931:4: ( (lv_type_2_1= ruleIntegerType | lv_type_2_2= ruleStringType ) )
            // InternalFPML.g:4932:5: (lv_type_2_1= ruleIntegerType | lv_type_2_2= ruleStringType )
            {
            // InternalFPML.g:4932:5: (lv_type_2_1= ruleIntegerType | lv_type_2_2= ruleStringType )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==29) ) {
                alt37=1;
            }
            else if ( (LA37_0==30) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalFPML.g:4933:6: lv_type_2_1= ruleIntegerType
                    {

                    						newCompositeNode(grammarAccess.getPlusAccess().getTypeIntegerTypeParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_type_2_1=ruleIntegerType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPlusRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_2_1,
                    							"it.unibo.FPML.IntegerType");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalFPML.g:4949:6: lv_type_2_2= ruleStringType
                    {

                    						newCompositeNode(grammarAccess.getPlusAccess().getTypeStringTypeParserRuleCall_2_0_1());
                    					
                    pushFollow(FOLLOW_2);
                    lv_type_2_2=ruleStringType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPlusRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_2_2,
                    							"it.unibo.FPML.StringType");
                    						afterParserOrEnumRuleCall();
                    					

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
    // $ANTLR end "rulePlus"


    // $ANTLR start "entryRuleMinus"
    // InternalFPML.g:4971:1: entryRuleMinus returns [EObject current=null] : iv_ruleMinus= ruleMinus EOF ;
    public final EObject entryRuleMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinus = null;


        try {
            // InternalFPML.g:4971:46: (iv_ruleMinus= ruleMinus EOF )
            // InternalFPML.g:4972:2: iv_ruleMinus= ruleMinus EOF
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
    // InternalFPML.g:4978:1: ruleMinus returns [EObject current=null] : ( () otherlv_1= '-' ) ;
    public final EObject ruleMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFPML.g:4984:2: ( ( () otherlv_1= '-' ) )
            // InternalFPML.g:4985:2: ( () otherlv_1= '-' )
            {
            // InternalFPML.g:4985:2: ( () otherlv_1= '-' )
            // InternalFPML.g:4986:3: () otherlv_1= '-'
            {
            // InternalFPML.g:4986:3: ()
            // InternalFPML.g:4987:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMinusAccess().getMinusAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,53,FOLLOW_2); 

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
    // InternalFPML.g:5001:1: entryRuleTimes returns [EObject current=null] : iv_ruleTimes= ruleTimes EOF ;
    public final EObject entryRuleTimes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimes = null;


        try {
            // InternalFPML.g:5001:46: (iv_ruleTimes= ruleTimes EOF )
            // InternalFPML.g:5002:2: iv_ruleTimes= ruleTimes EOF
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
    // InternalFPML.g:5008:1: ruleTimes returns [EObject current=null] : ( () otherlv_1= '*' ) ;
    public final EObject ruleTimes() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFPML.g:5014:2: ( ( () otherlv_1= '*' ) )
            // InternalFPML.g:5015:2: ( () otherlv_1= '*' )
            {
            // InternalFPML.g:5015:2: ( () otherlv_1= '*' )
            // InternalFPML.g:5016:3: () otherlv_1= '*'
            {
            // InternalFPML.g:5016:3: ()
            // InternalFPML.g:5017:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTimesAccess().getTimesAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,42,FOLLOW_2); 

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
    // InternalFPML.g:5031:1: entryRuleMod returns [EObject current=null] : iv_ruleMod= ruleMod EOF ;
    public final EObject entryRuleMod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMod = null;


        try {
            // InternalFPML.g:5031:44: (iv_ruleMod= ruleMod EOF )
            // InternalFPML.g:5032:2: iv_ruleMod= ruleMod EOF
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
    // InternalFPML.g:5038:1: ruleMod returns [EObject current=null] : ( () otherlv_1= 'mod' ) ;
    public final EObject ruleMod() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFPML.g:5044:2: ( ( () otherlv_1= 'mod' ) )
            // InternalFPML.g:5045:2: ( () otherlv_1= 'mod' )
            {
            // InternalFPML.g:5045:2: ( () otherlv_1= 'mod' )
            // InternalFPML.g:5046:3: () otherlv_1= 'mod'
            {
            // InternalFPML.g:5046:3: ()
            // InternalFPML.g:5047:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getModAccess().getModAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,54,FOLLOW_2); 

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


    // $ANTLR start "entryRuleLeftAlgebraic"
    // InternalFPML.g:5061:1: entryRuleLeftAlgebraic returns [EObject current=null] : iv_ruleLeftAlgebraic= ruleLeftAlgebraic EOF ;
    public final EObject entryRuleLeftAlgebraic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeftAlgebraic = null;


        try {
            // InternalFPML.g:5061:54: (iv_ruleLeftAlgebraic= ruleLeftAlgebraic EOF )
            // InternalFPML.g:5062:2: iv_ruleLeftAlgebraic= ruleLeftAlgebraic EOF
            {
             newCompositeNode(grammarAccess.getLeftAlgebraicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLeftAlgebraic=ruleLeftAlgebraic();

            state._fsp--;

             current =iv_ruleLeftAlgebraic; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLeftAlgebraic"


    // $ANTLR start "ruleLeftAlgebraic"
    // InternalFPML.g:5068:1: ruleLeftAlgebraic returns [EObject current=null] : ( () otherlv_1= 'leftADT' ( (lv_type_2_0= rulePureAlgebraicType ) ) ) ;
    public final EObject ruleLeftAlgebraic() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:5074:2: ( ( () otherlv_1= 'leftADT' ( (lv_type_2_0= rulePureAlgebraicType ) ) ) )
            // InternalFPML.g:5075:2: ( () otherlv_1= 'leftADT' ( (lv_type_2_0= rulePureAlgebraicType ) ) )
            {
            // InternalFPML.g:5075:2: ( () otherlv_1= 'leftADT' ( (lv_type_2_0= rulePureAlgebraicType ) ) )
            // InternalFPML.g:5076:3: () otherlv_1= 'leftADT' ( (lv_type_2_0= rulePureAlgebraicType ) )
            {
            // InternalFPML.g:5076:3: ()
            // InternalFPML.g:5077:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLeftAlgebraicAccess().getLeftAlgebraicAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,55,FOLLOW_37); 

            			newLeafNode(otherlv_1, grammarAccess.getLeftAlgebraicAccess().getLeftADTKeyword_1());
            		
            // InternalFPML.g:5087:3: ( (lv_type_2_0= rulePureAlgebraicType ) )
            // InternalFPML.g:5088:4: (lv_type_2_0= rulePureAlgebraicType )
            {
            // InternalFPML.g:5088:4: (lv_type_2_0= rulePureAlgebraicType )
            // InternalFPML.g:5089:5: lv_type_2_0= rulePureAlgebraicType
            {

            					newCompositeNode(grammarAccess.getLeftAlgebraicAccess().getTypePureAlgebraicTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=rulePureAlgebraicType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLeftAlgebraicRule());
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
    // $ANTLR end "ruleLeftAlgebraic"


    // $ANTLR start "entryRuleRightAlgebraic"
    // InternalFPML.g:5110:1: entryRuleRightAlgebraic returns [EObject current=null] : iv_ruleRightAlgebraic= ruleRightAlgebraic EOF ;
    public final EObject entryRuleRightAlgebraic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRightAlgebraic = null;


        try {
            // InternalFPML.g:5110:55: (iv_ruleRightAlgebraic= ruleRightAlgebraic EOF )
            // InternalFPML.g:5111:2: iv_ruleRightAlgebraic= ruleRightAlgebraic EOF
            {
             newCompositeNode(grammarAccess.getRightAlgebraicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRightAlgebraic=ruleRightAlgebraic();

            state._fsp--;

             current =iv_ruleRightAlgebraic; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRightAlgebraic"


    // $ANTLR start "ruleRightAlgebraic"
    // InternalFPML.g:5117:1: ruleRightAlgebraic returns [EObject current=null] : ( () otherlv_1= 'rightADT' ( (lv_type_2_0= rulePureAlgebraicType ) ) ) ;
    public final EObject ruleRightAlgebraic() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:5123:2: ( ( () otherlv_1= 'rightADT' ( (lv_type_2_0= rulePureAlgebraicType ) ) ) )
            // InternalFPML.g:5124:2: ( () otherlv_1= 'rightADT' ( (lv_type_2_0= rulePureAlgebraicType ) ) )
            {
            // InternalFPML.g:5124:2: ( () otherlv_1= 'rightADT' ( (lv_type_2_0= rulePureAlgebraicType ) ) )
            // InternalFPML.g:5125:3: () otherlv_1= 'rightADT' ( (lv_type_2_0= rulePureAlgebraicType ) )
            {
            // InternalFPML.g:5125:3: ()
            // InternalFPML.g:5126:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRightAlgebraicAccess().getRightAlgebraicAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,56,FOLLOW_37); 

            			newLeafNode(otherlv_1, grammarAccess.getRightAlgebraicAccess().getRightADTKeyword_1());
            		
            // InternalFPML.g:5136:3: ( (lv_type_2_0= rulePureAlgebraicType ) )
            // InternalFPML.g:5137:4: (lv_type_2_0= rulePureAlgebraicType )
            {
            // InternalFPML.g:5137:4: (lv_type_2_0= rulePureAlgebraicType )
            // InternalFPML.g:5138:5: lv_type_2_0= rulePureAlgebraicType
            {

            					newCompositeNode(grammarAccess.getRightAlgebraicAccess().getTypePureAlgebraicTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=rulePureAlgebraicType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRightAlgebraicRule());
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
    // $ANTLR end "ruleRightAlgebraic"


    // $ANTLR start "entryRuleApplyF"
    // InternalFPML.g:5159:1: entryRuleApplyF returns [EObject current=null] : iv_ruleApplyF= ruleApplyF EOF ;
    public final EObject entryRuleApplyF() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplyF = null;


        try {
            // InternalFPML.g:5159:47: (iv_ruleApplyF= ruleApplyF EOF )
            // InternalFPML.g:5160:2: iv_ruleApplyF= ruleApplyF EOF
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
    // InternalFPML.g:5166:1: ruleApplyF returns [EObject current=null] : ( () otherlv_1= 'applyF' ( (lv_functionType_2_0= rulePureFunctionType ) ) ( (lv_value_3_0= ruleApplyFFactor ) ) ) ;
    public final EObject ruleApplyF() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_functionType_2_0 = null;

        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:5172:2: ( ( () otherlv_1= 'applyF' ( (lv_functionType_2_0= rulePureFunctionType ) ) ( (lv_value_3_0= ruleApplyFFactor ) ) ) )
            // InternalFPML.g:5173:2: ( () otherlv_1= 'applyF' ( (lv_functionType_2_0= rulePureFunctionType ) ) ( (lv_value_3_0= ruleApplyFFactor ) ) )
            {
            // InternalFPML.g:5173:2: ( () otherlv_1= 'applyF' ( (lv_functionType_2_0= rulePureFunctionType ) ) ( (lv_value_3_0= ruleApplyFFactor ) ) )
            // InternalFPML.g:5174:3: () otherlv_1= 'applyF' ( (lv_functionType_2_0= rulePureFunctionType ) ) ( (lv_value_3_0= ruleApplyFFactor ) )
            {
            // InternalFPML.g:5174:3: ()
            // InternalFPML.g:5175:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getApplyFAccess().getApplyFAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,57,FOLLOW_41); 

            			newLeafNode(otherlv_1, grammarAccess.getApplyFAccess().getApplyFKeyword_1());
            		
            // InternalFPML.g:5185:3: ( (lv_functionType_2_0= rulePureFunctionType ) )
            // InternalFPML.g:5186:4: (lv_functionType_2_0= rulePureFunctionType )
            {
            // InternalFPML.g:5186:4: (lv_functionType_2_0= rulePureFunctionType )
            // InternalFPML.g:5187:5: lv_functionType_2_0= rulePureFunctionType
            {

            					newCompositeNode(grammarAccess.getApplyFAccess().getFunctionTypePureFunctionTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_42);
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

            // InternalFPML.g:5204:3: ( (lv_value_3_0= ruleApplyFFactor ) )
            // InternalFPML.g:5205:4: (lv_value_3_0= ruleApplyFFactor )
            {
            // InternalFPML.g:5205:4: (lv_value_3_0= ruleApplyFFactor )
            // InternalFPML.g:5206:5: lv_value_3_0= ruleApplyFFactor
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
    // InternalFPML.g:5227:1: entryRuleApplyFFactor returns [EObject current=null] : iv_ruleApplyFFactor= ruleApplyFFactor EOF ;
    public final EObject entryRuleApplyFFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplyFFactor = null;


        try {
            // InternalFPML.g:5227:53: (iv_ruleApplyFFactor= ruleApplyFFactor EOF )
            // InternalFPML.g:5228:2: iv_ruleApplyFFactor= ruleApplyFFactor EOF
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
    // InternalFPML.g:5234:1: ruleApplyFFactor returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | (otherlv_1= '(' ( (lv_valueExpression_2_0= ruleExpression ) ) otherlv_3= ')' ) ) ;
    public final EObject ruleApplyFFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_valueExpression_2_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:5240:2: ( ( ( (otherlv_0= RULE_ID ) ) | (otherlv_1= '(' ( (lv_valueExpression_2_0= ruleExpression ) ) otherlv_3= ')' ) ) )
            // InternalFPML.g:5241:2: ( ( (otherlv_0= RULE_ID ) ) | (otherlv_1= '(' ( (lv_valueExpression_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            {
            // InternalFPML.g:5241:2: ( ( (otherlv_0= RULE_ID ) ) | (otherlv_1= '(' ( (lv_valueExpression_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_ID) ) {
                alt38=1;
            }
            else if ( (LA38_0==21) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalFPML.g:5242:3: ( (otherlv_0= RULE_ID ) )
                    {
                    // InternalFPML.g:5242:3: ( (otherlv_0= RULE_ID ) )
                    // InternalFPML.g:5243:4: (otherlv_0= RULE_ID )
                    {
                    // InternalFPML.g:5243:4: (otherlv_0= RULE_ID )
                    // InternalFPML.g:5244:5: otherlv_0= RULE_ID
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
                    // InternalFPML.g:5256:3: (otherlv_1= '(' ( (lv_valueExpression_2_0= ruleExpression ) ) otherlv_3= ')' )
                    {
                    // InternalFPML.g:5256:3: (otherlv_1= '(' ( (lv_valueExpression_2_0= ruleExpression ) ) otherlv_3= ')' )
                    // InternalFPML.g:5257:4: otherlv_1= '(' ( (lv_valueExpression_2_0= ruleExpression ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_14); 

                    				newLeafNode(otherlv_1, grammarAccess.getApplyFFactorAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalFPML.g:5261:4: ( (lv_valueExpression_2_0= ruleExpression ) )
                    // InternalFPML.g:5262:5: (lv_valueExpression_2_0= ruleExpression )
                    {
                    // InternalFPML.g:5262:5: (lv_valueExpression_2_0= ruleExpression )
                    // InternalFPML.g:5263:6: lv_valueExpression_2_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getApplyFFactorAccess().getValueExpressionExpressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_valueExpression_2_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getApplyFFactorRule());
                    						}
                    						set(
                    							current,
                    							"valueExpression",
                    							lv_valueExpression_2_0,
                    							"it.unibo.FPML.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,23,FOLLOW_2); 

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


    // $ANTLR start "entryRuleEquals"
    // InternalFPML.g:5289:1: entryRuleEquals returns [EObject current=null] : iv_ruleEquals= ruleEquals EOF ;
    public final EObject entryRuleEquals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquals = null;


        try {
            // InternalFPML.g:5289:47: (iv_ruleEquals= ruleEquals EOF )
            // InternalFPML.g:5290:2: iv_ruleEquals= ruleEquals EOF
            {
             newCompositeNode(grammarAccess.getEqualsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEquals=ruleEquals();

            state._fsp--;

             current =iv_ruleEquals; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEquals"


    // $ANTLR start "ruleEquals"
    // InternalFPML.g:5296:1: ruleEquals returns [EObject current=null] : ( () otherlv_1= '==' ( ( (lv_type_2_1= ruleIntegerType | lv_type_2_2= ruleStringType | lv_type_2_3= ruleBooleanType ) ) ) ) ;
    public final EObject ruleEquals() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_type_2_1 = null;

        EObject lv_type_2_2 = null;

        EObject lv_type_2_3 = null;



        	enterRule();

        try {
            // InternalFPML.g:5302:2: ( ( () otherlv_1= '==' ( ( (lv_type_2_1= ruleIntegerType | lv_type_2_2= ruleStringType | lv_type_2_3= ruleBooleanType ) ) ) ) )
            // InternalFPML.g:5303:2: ( () otherlv_1= '==' ( ( (lv_type_2_1= ruleIntegerType | lv_type_2_2= ruleStringType | lv_type_2_3= ruleBooleanType ) ) ) )
            {
            // InternalFPML.g:5303:2: ( () otherlv_1= '==' ( ( (lv_type_2_1= ruleIntegerType | lv_type_2_2= ruleStringType | lv_type_2_3= ruleBooleanType ) ) ) )
            // InternalFPML.g:5304:3: () otherlv_1= '==' ( ( (lv_type_2_1= ruleIntegerType | lv_type_2_2= ruleStringType | lv_type_2_3= ruleBooleanType ) ) )
            {
            // InternalFPML.g:5304:3: ()
            // InternalFPML.g:5305:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEqualsAccess().getEqualsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,58,FOLLOW_43); 

            			newLeafNode(otherlv_1, grammarAccess.getEqualsAccess().getEqualsSignEqualsSignKeyword_1());
            		
            // InternalFPML.g:5315:3: ( ( (lv_type_2_1= ruleIntegerType | lv_type_2_2= ruleStringType | lv_type_2_3= ruleBooleanType ) ) )
            // InternalFPML.g:5316:4: ( (lv_type_2_1= ruleIntegerType | lv_type_2_2= ruleStringType | lv_type_2_3= ruleBooleanType ) )
            {
            // InternalFPML.g:5316:4: ( (lv_type_2_1= ruleIntegerType | lv_type_2_2= ruleStringType | lv_type_2_3= ruleBooleanType ) )
            // InternalFPML.g:5317:5: (lv_type_2_1= ruleIntegerType | lv_type_2_2= ruleStringType | lv_type_2_3= ruleBooleanType )
            {
            // InternalFPML.g:5317:5: (lv_type_2_1= ruleIntegerType | lv_type_2_2= ruleStringType | lv_type_2_3= ruleBooleanType )
            int alt39=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt39=1;
                }
                break;
            case 30:
                {
                alt39=2;
                }
                break;
            case 31:
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
                    // InternalFPML.g:5318:6: lv_type_2_1= ruleIntegerType
                    {

                    						newCompositeNode(grammarAccess.getEqualsAccess().getTypeIntegerTypeParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_type_2_1=ruleIntegerType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEqualsRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_2_1,
                    							"it.unibo.FPML.IntegerType");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalFPML.g:5334:6: lv_type_2_2= ruleStringType
                    {

                    						newCompositeNode(grammarAccess.getEqualsAccess().getTypeStringTypeParserRuleCall_2_0_1());
                    					
                    pushFollow(FOLLOW_2);
                    lv_type_2_2=ruleStringType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEqualsRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_2_2,
                    							"it.unibo.FPML.StringType");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 3 :
                    // InternalFPML.g:5350:6: lv_type_2_3= ruleBooleanType
                    {

                    						newCompositeNode(grammarAccess.getEqualsAccess().getTypeBooleanTypeParserRuleCall_2_0_2());
                    					
                    pushFollow(FOLLOW_2);
                    lv_type_2_3=ruleBooleanType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEqualsRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_2_3,
                    							"it.unibo.FPML.BooleanType");
                    						afterParserOrEnumRuleCall();
                    					

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
    // $ANTLR end "ruleEquals"


    // $ANTLR start "entryRuleMinorEquals"
    // InternalFPML.g:5372:1: entryRuleMinorEquals returns [EObject current=null] : iv_ruleMinorEquals= ruleMinorEquals EOF ;
    public final EObject entryRuleMinorEquals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinorEquals = null;


        try {
            // InternalFPML.g:5372:52: (iv_ruleMinorEquals= ruleMinorEquals EOF )
            // InternalFPML.g:5373:2: iv_ruleMinorEquals= ruleMinorEquals EOF
            {
             newCompositeNode(grammarAccess.getMinorEqualsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMinorEquals=ruleMinorEquals();

            state._fsp--;

             current =iv_ruleMinorEquals; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMinorEquals"


    // $ANTLR start "ruleMinorEquals"
    // InternalFPML.g:5379:1: ruleMinorEquals returns [EObject current=null] : ( () otherlv_1= '<=' ) ;
    public final EObject ruleMinorEquals() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFPML.g:5385:2: ( ( () otherlv_1= '<=' ) )
            // InternalFPML.g:5386:2: ( () otherlv_1= '<=' )
            {
            // InternalFPML.g:5386:2: ( () otherlv_1= '<=' )
            // InternalFPML.g:5387:3: () otherlv_1= '<='
            {
            // InternalFPML.g:5387:3: ()
            // InternalFPML.g:5388:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMinorEqualsAccess().getMinorEqualsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,59,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getMinorEqualsAccess().getLessThanSignEqualsSignKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMinorEquals"


    // $ANTLR start "entryRuleMajorEquals"
    // InternalFPML.g:5402:1: entryRuleMajorEquals returns [EObject current=null] : iv_ruleMajorEquals= ruleMajorEquals EOF ;
    public final EObject entryRuleMajorEquals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMajorEquals = null;


        try {
            // InternalFPML.g:5402:52: (iv_ruleMajorEquals= ruleMajorEquals EOF )
            // InternalFPML.g:5403:2: iv_ruleMajorEquals= ruleMajorEquals EOF
            {
             newCompositeNode(grammarAccess.getMajorEqualsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMajorEquals=ruleMajorEquals();

            state._fsp--;

             current =iv_ruleMajorEquals; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMajorEquals"


    // $ANTLR start "ruleMajorEquals"
    // InternalFPML.g:5409:1: ruleMajorEquals returns [EObject current=null] : ( () otherlv_1= '>=' ) ;
    public final EObject ruleMajorEquals() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFPML.g:5415:2: ( ( () otherlv_1= '>=' ) )
            // InternalFPML.g:5416:2: ( () otherlv_1= '>=' )
            {
            // InternalFPML.g:5416:2: ( () otherlv_1= '>=' )
            // InternalFPML.g:5417:3: () otherlv_1= '>='
            {
            // InternalFPML.g:5417:3: ()
            // InternalFPML.g:5418:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMajorEqualsAccess().getMajorEqualsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,60,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getMajorEqualsAccess().getGreaterThanSignEqualsSignKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMajorEquals"


    // $ANTLR start "entryRuleMinor"
    // InternalFPML.g:5432:1: entryRuleMinor returns [EObject current=null] : iv_ruleMinor= ruleMinor EOF ;
    public final EObject entryRuleMinor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinor = null;


        try {
            // InternalFPML.g:5432:46: (iv_ruleMinor= ruleMinor EOF )
            // InternalFPML.g:5433:2: iv_ruleMinor= ruleMinor EOF
            {
             newCompositeNode(grammarAccess.getMinorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMinor=ruleMinor();

            state._fsp--;

             current =iv_ruleMinor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMinor"


    // $ANTLR start "ruleMinor"
    // InternalFPML.g:5439:1: ruleMinor returns [EObject current=null] : ( () otherlv_1= '<' ) ;
    public final EObject ruleMinor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFPML.g:5445:2: ( ( () otherlv_1= '<' ) )
            // InternalFPML.g:5446:2: ( () otherlv_1= '<' )
            {
            // InternalFPML.g:5446:2: ( () otherlv_1= '<' )
            // InternalFPML.g:5447:3: () otherlv_1= '<'
            {
            // InternalFPML.g:5447:3: ()
            // InternalFPML.g:5448:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMinorAccess().getMinorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getMinorAccess().getLessThanSignKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMinor"


    // $ANTLR start "entryRuleMajor"
    // InternalFPML.g:5462:1: entryRuleMajor returns [EObject current=null] : iv_ruleMajor= ruleMajor EOF ;
    public final EObject entryRuleMajor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMajor = null;


        try {
            // InternalFPML.g:5462:46: (iv_ruleMajor= ruleMajor EOF )
            // InternalFPML.g:5463:2: iv_ruleMajor= ruleMajor EOF
            {
             newCompositeNode(grammarAccess.getMajorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMajor=ruleMajor();

            state._fsp--;

             current =iv_ruleMajor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMajor"


    // $ANTLR start "ruleMajor"
    // InternalFPML.g:5469:1: ruleMajor returns [EObject current=null] : ( () otherlv_1= '>' ) ;
    public final EObject ruleMajor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFPML.g:5475:2: ( ( () otherlv_1= '>' ) )
            // InternalFPML.g:5476:2: ( () otherlv_1= '>' )
            {
            // InternalFPML.g:5476:2: ( () otherlv_1= '>' )
            // InternalFPML.g:5477:3: () otherlv_1= '>'
            {
            // InternalFPML.g:5477:3: ()
            // InternalFPML.g:5478:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMajorAccess().getMajorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,37,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getMajorAccess().getGreaterThanSignKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMajor"


    // $ANTLR start "entryRuleLogicAnd"
    // InternalFPML.g:5492:1: entryRuleLogicAnd returns [EObject current=null] : iv_ruleLogicAnd= ruleLogicAnd EOF ;
    public final EObject entryRuleLogicAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicAnd = null;


        try {
            // InternalFPML.g:5492:49: (iv_ruleLogicAnd= ruleLogicAnd EOF )
            // InternalFPML.g:5493:2: iv_ruleLogicAnd= ruleLogicAnd EOF
            {
             newCompositeNode(grammarAccess.getLogicAndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicAnd=ruleLogicAnd();

            state._fsp--;

             current =iv_ruleLogicAnd; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicAnd"


    // $ANTLR start "ruleLogicAnd"
    // InternalFPML.g:5499:1: ruleLogicAnd returns [EObject current=null] : ( () otherlv_1= '&&' ) ;
    public final EObject ruleLogicAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFPML.g:5505:2: ( ( () otherlv_1= '&&' ) )
            // InternalFPML.g:5506:2: ( () otherlv_1= '&&' )
            {
            // InternalFPML.g:5506:2: ( () otherlv_1= '&&' )
            // InternalFPML.g:5507:3: () otherlv_1= '&&'
            {
            // InternalFPML.g:5507:3: ()
            // InternalFPML.g:5508:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLogicAndAccess().getLogicAndAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,61,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getLogicAndAccess().getAmpersandAmpersandKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogicAnd"


    // $ANTLR start "entryRuleLogicOr"
    // InternalFPML.g:5522:1: entryRuleLogicOr returns [EObject current=null] : iv_ruleLogicOr= ruleLogicOr EOF ;
    public final EObject entryRuleLogicOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicOr = null;


        try {
            // InternalFPML.g:5522:48: (iv_ruleLogicOr= ruleLogicOr EOF )
            // InternalFPML.g:5523:2: iv_ruleLogicOr= ruleLogicOr EOF
            {
             newCompositeNode(grammarAccess.getLogicOrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicOr=ruleLogicOr();

            state._fsp--;

             current =iv_ruleLogicOr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicOr"


    // $ANTLR start "ruleLogicOr"
    // InternalFPML.g:5529:1: ruleLogicOr returns [EObject current=null] : ( () otherlv_1= '||' ) ;
    public final EObject ruleLogicOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFPML.g:5535:2: ( ( () otherlv_1= '||' ) )
            // InternalFPML.g:5536:2: ( () otherlv_1= '||' )
            {
            // InternalFPML.g:5536:2: ( () otherlv_1= '||' )
            // InternalFPML.g:5537:3: () otherlv_1= '||'
            {
            // InternalFPML.g:5537:3: ()
            // InternalFPML.g:5538:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLogicOrAccess().getLogicOrAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,62,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getLogicOrAccess().getVerticalLineVerticalLineKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogicOr"


    // $ANTLR start "entryRuleExtractPure"
    // InternalFPML.g:5552:1: entryRuleExtractPure returns [EObject current=null] : iv_ruleExtractPure= ruleExtractPure EOF ;
    public final EObject entryRuleExtractPure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtractPure = null;


        try {
            // InternalFPML.g:5552:52: (iv_ruleExtractPure= ruleExtractPure EOF )
            // InternalFPML.g:5553:2: iv_ruleExtractPure= ruleExtractPure EOF
            {
             newCompositeNode(grammarAccess.getExtractPureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExtractPure=ruleExtractPure();

            state._fsp--;

             current =iv_ruleExtractPure; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExtractPure"


    // $ANTLR start "ruleExtractPure"
    // InternalFPML.g:5559:1: ruleExtractPure returns [EObject current=null] : ( () otherlv_1= 'extract' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleExtractPure() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalFPML.g:5565:2: ( ( () otherlv_1= 'extract' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalFPML.g:5566:2: ( () otherlv_1= 'extract' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalFPML.g:5566:2: ( () otherlv_1= 'extract' ( (otherlv_2= RULE_ID ) ) )
            // InternalFPML.g:5567:3: () otherlv_1= 'extract' ( (otherlv_2= RULE_ID ) )
            {
            // InternalFPML.g:5567:3: ()
            // InternalFPML.g:5568:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExtractPureAccess().getExtractPureAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,63,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getExtractPureAccess().getExtractKeyword_1());
            		
            // InternalFPML.g:5578:3: ( (otherlv_2= RULE_ID ) )
            // InternalFPML.g:5579:4: (otherlv_2= RULE_ID )
            {
            // InternalFPML.g:5579:4: (otherlv_2= RULE_ID )
            // InternalFPML.g:5580:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExtractPureRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getExtractPureAccess().getDataPureDataCrossReference_2_0());
            				

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
    // $ANTLR end "ruleExtractPure"


    // $ANTLR start "entryRuleIsLeftPure"
    // InternalFPML.g:5595:1: entryRuleIsLeftPure returns [EObject current=null] : iv_ruleIsLeftPure= ruleIsLeftPure EOF ;
    public final EObject entryRuleIsLeftPure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsLeftPure = null;


        try {
            // InternalFPML.g:5595:51: (iv_ruleIsLeftPure= ruleIsLeftPure EOF )
            // InternalFPML.g:5596:2: iv_ruleIsLeftPure= ruleIsLeftPure EOF
            {
             newCompositeNode(grammarAccess.getIsLeftPureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIsLeftPure=ruleIsLeftPure();

            state._fsp--;

             current =iv_ruleIsLeftPure; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIsLeftPure"


    // $ANTLR start "ruleIsLeftPure"
    // InternalFPML.g:5602:1: ruleIsLeftPure returns [EObject current=null] : ( () otherlv_1= 'isLeft' ( (lv_type_2_0= rulePureAlgebraicType ) ) ) ;
    public final EObject ruleIsLeftPure() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:5608:2: ( ( () otherlv_1= 'isLeft' ( (lv_type_2_0= rulePureAlgebraicType ) ) ) )
            // InternalFPML.g:5609:2: ( () otherlv_1= 'isLeft' ( (lv_type_2_0= rulePureAlgebraicType ) ) )
            {
            // InternalFPML.g:5609:2: ( () otherlv_1= 'isLeft' ( (lv_type_2_0= rulePureAlgebraicType ) ) )
            // InternalFPML.g:5610:3: () otherlv_1= 'isLeft' ( (lv_type_2_0= rulePureAlgebraicType ) )
            {
            // InternalFPML.g:5610:3: ()
            // InternalFPML.g:5611:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIsLeftPureAccess().getIsLeftPureAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,64,FOLLOW_37); 

            			newLeafNode(otherlv_1, grammarAccess.getIsLeftPureAccess().getIsLeftKeyword_1());
            		
            // InternalFPML.g:5621:3: ( (lv_type_2_0= rulePureAlgebraicType ) )
            // InternalFPML.g:5622:4: (lv_type_2_0= rulePureAlgebraicType )
            {
            // InternalFPML.g:5622:4: (lv_type_2_0= rulePureAlgebraicType )
            // InternalFPML.g:5623:5: lv_type_2_0= rulePureAlgebraicType
            {

            					newCompositeNode(grammarAccess.getIsLeftPureAccess().getTypePureAlgebraicTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=rulePureAlgebraicType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIsLeftPureRule());
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
    // $ANTLR end "ruleIsLeftPure"


    // $ANTLR start "entryRuleIsRightPure"
    // InternalFPML.g:5644:1: entryRuleIsRightPure returns [EObject current=null] : iv_ruleIsRightPure= ruleIsRightPure EOF ;
    public final EObject entryRuleIsRightPure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsRightPure = null;


        try {
            // InternalFPML.g:5644:52: (iv_ruleIsRightPure= ruleIsRightPure EOF )
            // InternalFPML.g:5645:2: iv_ruleIsRightPure= ruleIsRightPure EOF
            {
             newCompositeNode(grammarAccess.getIsRightPureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIsRightPure=ruleIsRightPure();

            state._fsp--;

             current =iv_ruleIsRightPure; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIsRightPure"


    // $ANTLR start "ruleIsRightPure"
    // InternalFPML.g:5651:1: ruleIsRightPure returns [EObject current=null] : ( () otherlv_1= 'isRight' ( (lv_type_2_0= rulePureAlgebraicType ) ) ) ;
    public final EObject ruleIsRightPure() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:5657:2: ( ( () otherlv_1= 'isRight' ( (lv_type_2_0= rulePureAlgebraicType ) ) ) )
            // InternalFPML.g:5658:2: ( () otherlv_1= 'isRight' ( (lv_type_2_0= rulePureAlgebraicType ) ) )
            {
            // InternalFPML.g:5658:2: ( () otherlv_1= 'isRight' ( (lv_type_2_0= rulePureAlgebraicType ) ) )
            // InternalFPML.g:5659:3: () otherlv_1= 'isRight' ( (lv_type_2_0= rulePureAlgebraicType ) )
            {
            // InternalFPML.g:5659:3: ()
            // InternalFPML.g:5660:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIsRightPureAccess().getIsRightPureAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,65,FOLLOW_37); 

            			newLeafNode(otherlv_1, grammarAccess.getIsRightPureAccess().getIsRightKeyword_1());
            		
            // InternalFPML.g:5670:3: ( (lv_type_2_0= rulePureAlgebraicType ) )
            // InternalFPML.g:5671:4: (lv_type_2_0= rulePureAlgebraicType )
            {
            // InternalFPML.g:5671:4: (lv_type_2_0= rulePureAlgebraicType )
            // InternalFPML.g:5672:5: lv_type_2_0= rulePureAlgebraicType
            {

            					newCompositeNode(grammarAccess.getIsRightPureAccess().getTypePureAlgebraicTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=rulePureAlgebraicType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIsRightPureRule());
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
    // $ANTLR end "ruleIsRightPure"


    // $ANTLR start "entryRulePureIf"
    // InternalFPML.g:5693:1: entryRulePureIf returns [EObject current=null] : iv_rulePureIf= rulePureIf EOF ;
    public final EObject entryRulePureIf() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePureIf = null;


        try {
            // InternalFPML.g:5693:47: (iv_rulePureIf= rulePureIf EOF )
            // InternalFPML.g:5694:2: iv_rulePureIf= rulePureIf EOF
            {
             newCompositeNode(grammarAccess.getPureIfRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePureIf=rulePureIf();

            state._fsp--;

             current =iv_rulePureIf; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePureIf"


    // $ANTLR start "rulePureIf"
    // InternalFPML.g:5700:1: rulePureIf returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= 'then' otherlv_3= '{' ( (lv_then_4_0= rulePureIfBody ) ) otherlv_5= '}' otherlv_6= 'else' otherlv_7= '{' ( (lv_else_8_0= rulePureIfBody ) ) otherlv_9= '}' ) ;
    public final EObject rulePureIf() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_then_4_0 = null;

        EObject lv_else_8_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:5706:2: ( ( () otherlv_1= 'if' otherlv_2= 'then' otherlv_3= '{' ( (lv_then_4_0= rulePureIfBody ) ) otherlv_5= '}' otherlv_6= 'else' otherlv_7= '{' ( (lv_else_8_0= rulePureIfBody ) ) otherlv_9= '}' ) )
            // InternalFPML.g:5707:2: ( () otherlv_1= 'if' otherlv_2= 'then' otherlv_3= '{' ( (lv_then_4_0= rulePureIfBody ) ) otherlv_5= '}' otherlv_6= 'else' otherlv_7= '{' ( (lv_else_8_0= rulePureIfBody ) ) otherlv_9= '}' )
            {
            // InternalFPML.g:5707:2: ( () otherlv_1= 'if' otherlv_2= 'then' otherlv_3= '{' ( (lv_then_4_0= rulePureIfBody ) ) otherlv_5= '}' otherlv_6= 'else' otherlv_7= '{' ( (lv_else_8_0= rulePureIfBody ) ) otherlv_9= '}' )
            // InternalFPML.g:5708:3: () otherlv_1= 'if' otherlv_2= 'then' otherlv_3= '{' ( (lv_then_4_0= rulePureIfBody ) ) otherlv_5= '}' otherlv_6= 'else' otherlv_7= '{' ( (lv_else_8_0= rulePureIfBody ) ) otherlv_9= '}'
            {
            // InternalFPML.g:5708:3: ()
            // InternalFPML.g:5709:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPureIfAccess().getPureIfAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,66,FOLLOW_44); 

            			newLeafNode(otherlv_1, grammarAccess.getPureIfAccess().getIfKeyword_1());
            		
            otherlv_2=(Token)match(input,67,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getPureIfAccess().getThenKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getPureIfAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalFPML.g:5727:3: ( (lv_then_4_0= rulePureIfBody ) )
            // InternalFPML.g:5728:4: (lv_then_4_0= rulePureIfBody )
            {
            // InternalFPML.g:5728:4: (lv_then_4_0= rulePureIfBody )
            // InternalFPML.g:5729:5: lv_then_4_0= rulePureIfBody
            {

            					newCompositeNode(grammarAccess.getPureIfAccess().getThenPureIfBodyParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_then_4_0=rulePureIfBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPureIfRule());
            					}
            					set(
            						current,
            						"then",
            						lv_then_4_0,
            						"it.unibo.FPML.PureIfBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_45); 

            			newLeafNode(otherlv_5, grammarAccess.getPureIfAccess().getRightCurlyBracketKeyword_5());
            		
            otherlv_6=(Token)match(input,68,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getPureIfAccess().getElseKeyword_6());
            		
            otherlv_7=(Token)match(input,13,FOLLOW_14); 

            			newLeafNode(otherlv_7, grammarAccess.getPureIfAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalFPML.g:5758:3: ( (lv_else_8_0= rulePureIfBody ) )
            // InternalFPML.g:5759:4: (lv_else_8_0= rulePureIfBody )
            {
            // InternalFPML.g:5759:4: (lv_else_8_0= rulePureIfBody )
            // InternalFPML.g:5760:5: lv_else_8_0= rulePureIfBody
            {

            					newCompositeNode(grammarAccess.getPureIfAccess().getElsePureIfBodyParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_7);
            lv_else_8_0=rulePureIfBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPureIfRule());
            					}
            					set(
            						current,
            						"else",
            						lv_else_8_0,
            						"it.unibo.FPML.PureIfBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getPureIfAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePureIf"


    // $ANTLR start "entryRulePureIfBody"
    // InternalFPML.g:5785:1: entryRulePureIfBody returns [EObject current=null] : iv_rulePureIfBody= rulePureIfBody EOF ;
    public final EObject entryRulePureIfBody() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePureIfBody = null;


        try {
            // InternalFPML.g:5785:51: (iv_rulePureIfBody= rulePureIfBody EOF )
            // InternalFPML.g:5786:2: iv_rulePureIfBody= rulePureIfBody EOF
            {
             newCompositeNode(grammarAccess.getPureIfBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePureIfBody=rulePureIfBody();

            state._fsp--;

             current =iv_rulePureIfBody; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePureIfBody"


    // $ANTLR start "rulePureIfBody"
    // InternalFPML.g:5792:1: rulePureIfBody returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | ( (lv_functionExpression_1_0= ruleExpression ) ) ) ;
    public final EObject rulePureIfBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_functionExpression_1_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:5798:2: ( ( ( (otherlv_0= RULE_ID ) ) | ( (lv_functionExpression_1_0= ruleExpression ) ) ) )
            // InternalFPML.g:5799:2: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_functionExpression_1_0= ruleExpression ) ) )
            {
            // InternalFPML.g:5799:2: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_functionExpression_1_0= ruleExpression ) ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ID) ) {
                int LA40_1 = input.LA(2);

                if ( (LA40_1==EOF||LA40_1==14) ) {
                    alt40=1;
                }
                else if ( (LA40_1==21) ) {
                    alt40=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA40_0>=RULE_INT && LA40_0<=RULE_BOOLEAN)||LA40_0==21||LA40_0==44||LA40_0==46||(LA40_0>=48 && LA40_0<=50)) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalFPML.g:5800:3: ( (otherlv_0= RULE_ID ) )
                    {
                    // InternalFPML.g:5800:3: ( (otherlv_0= RULE_ID ) )
                    // InternalFPML.g:5801:4: (otherlv_0= RULE_ID )
                    {
                    // InternalFPML.g:5801:4: (otherlv_0= RULE_ID )
                    // InternalFPML.g:5802:5: otherlv_0= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPureIfBodyRule());
                    					}
                    				
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_0, grammarAccess.getPureIfBodyAccess().getFunctionReferencePureFunctionCrossReference_0_0());
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFPML.g:5814:3: ( (lv_functionExpression_1_0= ruleExpression ) )
                    {
                    // InternalFPML.g:5814:3: ( (lv_functionExpression_1_0= ruleExpression ) )
                    // InternalFPML.g:5815:4: (lv_functionExpression_1_0= ruleExpression )
                    {
                    // InternalFPML.g:5815:4: (lv_functionExpression_1_0= ruleExpression )
                    // InternalFPML.g:5816:5: lv_functionExpression_1_0= ruleExpression
                    {

                    					newCompositeNode(grammarAccess.getPureIfBodyAccess().getFunctionExpressionExpressionParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_functionExpression_1_0=ruleExpression();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPureIfBodyRule());
                    					}
                    					set(
                    						current,
                    						"functionExpression",
                    						lv_functionExpression_1_0,
                    						"it.unibo.FPML.Expression");
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
    // $ANTLR end "rulePureIfBody"


    // $ANTLR start "entryRulePrimitiveEffectFullFunction"
    // InternalFPML.g:5837:1: entryRulePrimitiveEffectFullFunction returns [EObject current=null] : iv_rulePrimitiveEffectFullFunction= rulePrimitiveEffectFullFunction EOF ;
    public final EObject entryRulePrimitiveEffectFullFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveEffectFullFunction = null;


        try {
            // InternalFPML.g:5837:68: (iv_rulePrimitiveEffectFullFunction= rulePrimitiveEffectFullFunction EOF )
            // InternalFPML.g:5838:2: iv_rulePrimitiveEffectFullFunction= rulePrimitiveEffectFullFunction EOF
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
    // InternalFPML.g:5844:1: rulePrimitiveEffectFullFunction returns [EObject current=null] : (this_PrimitivePrint_0= rulePrimitivePrint | this_ApplyFIO_1= ruleApplyFIO | this_PrimitiveReturn_2= rulePrimitiveReturn | this_LeftAlgebraicIO_3= ruleLeftAlgebraicIO | this_RightAlgebraicIO_4= ruleRightAlgebraicIO | this_ExtractEffectFull_5= ruleExtractEffectFull | this_LiftPureFunction_6= ruleLiftPureFunction | this_LiftEffectFullFunction_7= ruleLiftEffectFullFunction | this_IsLeftEffectFull_8= ruleIsLeftEffectFull | this_IsRightEffectFull_9= ruleIsRightEffectFull | this_EffectFullIf_10= ruleEffectFullIf ) ;
    public final EObject rulePrimitiveEffectFullFunction() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitivePrint_0 = null;

        EObject this_ApplyFIO_1 = null;

        EObject this_PrimitiveReturn_2 = null;

        EObject this_LeftAlgebraicIO_3 = null;

        EObject this_RightAlgebraicIO_4 = null;

        EObject this_ExtractEffectFull_5 = null;

        EObject this_LiftPureFunction_6 = null;

        EObject this_LiftEffectFullFunction_7 = null;

        EObject this_IsLeftEffectFull_8 = null;

        EObject this_IsRightEffectFull_9 = null;

        EObject this_EffectFullIf_10 = null;



        	enterRule();

        try {
            // InternalFPML.g:5850:2: ( (this_PrimitivePrint_0= rulePrimitivePrint | this_ApplyFIO_1= ruleApplyFIO | this_PrimitiveReturn_2= rulePrimitiveReturn | this_LeftAlgebraicIO_3= ruleLeftAlgebraicIO | this_RightAlgebraicIO_4= ruleRightAlgebraicIO | this_ExtractEffectFull_5= ruleExtractEffectFull | this_LiftPureFunction_6= ruleLiftPureFunction | this_LiftEffectFullFunction_7= ruleLiftEffectFullFunction | this_IsLeftEffectFull_8= ruleIsLeftEffectFull | this_IsRightEffectFull_9= ruleIsRightEffectFull | this_EffectFullIf_10= ruleEffectFullIf ) )
            // InternalFPML.g:5851:2: (this_PrimitivePrint_0= rulePrimitivePrint | this_ApplyFIO_1= ruleApplyFIO | this_PrimitiveReturn_2= rulePrimitiveReturn | this_LeftAlgebraicIO_3= ruleLeftAlgebraicIO | this_RightAlgebraicIO_4= ruleRightAlgebraicIO | this_ExtractEffectFull_5= ruleExtractEffectFull | this_LiftPureFunction_6= ruleLiftPureFunction | this_LiftEffectFullFunction_7= ruleLiftEffectFullFunction | this_IsLeftEffectFull_8= ruleIsLeftEffectFull | this_IsRightEffectFull_9= ruleIsRightEffectFull | this_EffectFullIf_10= ruleEffectFullIf )
            {
            // InternalFPML.g:5851:2: (this_PrimitivePrint_0= rulePrimitivePrint | this_ApplyFIO_1= ruleApplyFIO | this_PrimitiveReturn_2= rulePrimitiveReturn | this_LeftAlgebraicIO_3= ruleLeftAlgebraicIO | this_RightAlgebraicIO_4= ruleRightAlgebraicIO | this_ExtractEffectFull_5= ruleExtractEffectFull | this_LiftPureFunction_6= ruleLiftPureFunction | this_LiftEffectFullFunction_7= ruleLiftEffectFullFunction | this_IsLeftEffectFull_8= ruleIsLeftEffectFull | this_IsRightEffectFull_9= ruleIsRightEffectFull | this_EffectFullIf_10= ruleEffectFullIf )
            int alt41=11;
            alt41 = dfa41.predict(input);
            switch (alt41) {
                case 1 :
                    // InternalFPML.g:5852:3: this_PrimitivePrint_0= rulePrimitivePrint
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
                    // InternalFPML.g:5861:3: this_ApplyFIO_1= ruleApplyFIO
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
                    // InternalFPML.g:5870:3: this_PrimitiveReturn_2= rulePrimitiveReturn
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
                    // InternalFPML.g:5879:3: this_LeftAlgebraicIO_3= ruleLeftAlgebraicIO
                    {

                    			newCompositeNode(grammarAccess.getPrimitiveEffectFullFunctionAccess().getLeftAlgebraicIOParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_LeftAlgebraicIO_3=ruleLeftAlgebraicIO();

                    state._fsp--;


                    			current = this_LeftAlgebraicIO_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalFPML.g:5888:3: this_RightAlgebraicIO_4= ruleRightAlgebraicIO
                    {

                    			newCompositeNode(grammarAccess.getPrimitiveEffectFullFunctionAccess().getRightAlgebraicIOParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_RightAlgebraicIO_4=ruleRightAlgebraicIO();

                    state._fsp--;


                    			current = this_RightAlgebraicIO_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalFPML.g:5897:3: this_ExtractEffectFull_5= ruleExtractEffectFull
                    {

                    			newCompositeNode(grammarAccess.getPrimitiveEffectFullFunctionAccess().getExtractEffectFullParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExtractEffectFull_5=ruleExtractEffectFull();

                    state._fsp--;


                    			current = this_ExtractEffectFull_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalFPML.g:5906:3: this_LiftPureFunction_6= ruleLiftPureFunction
                    {

                    			newCompositeNode(grammarAccess.getPrimitiveEffectFullFunctionAccess().getLiftPureFunctionParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_LiftPureFunction_6=ruleLiftPureFunction();

                    state._fsp--;


                    			current = this_LiftPureFunction_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalFPML.g:5915:3: this_LiftEffectFullFunction_7= ruleLiftEffectFullFunction
                    {

                    			newCompositeNode(grammarAccess.getPrimitiveEffectFullFunctionAccess().getLiftEffectFullFunctionParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_LiftEffectFullFunction_7=ruleLiftEffectFullFunction();

                    state._fsp--;


                    			current = this_LiftEffectFullFunction_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalFPML.g:5924:3: this_IsLeftEffectFull_8= ruleIsLeftEffectFull
                    {

                    			newCompositeNode(grammarAccess.getPrimitiveEffectFullFunctionAccess().getIsLeftEffectFullParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_IsLeftEffectFull_8=ruleIsLeftEffectFull();

                    state._fsp--;


                    			current = this_IsLeftEffectFull_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalFPML.g:5933:3: this_IsRightEffectFull_9= ruleIsRightEffectFull
                    {

                    			newCompositeNode(grammarAccess.getPrimitiveEffectFullFunctionAccess().getIsRightEffectFullParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_IsRightEffectFull_9=ruleIsRightEffectFull();

                    state._fsp--;


                    			current = this_IsRightEffectFull_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalFPML.g:5942:3: this_EffectFullIf_10= ruleEffectFullIf
                    {

                    			newCompositeNode(grammarAccess.getPrimitiveEffectFullFunctionAccess().getEffectFullIfParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_EffectFullIf_10=ruleEffectFullIf();

                    state._fsp--;


                    			current = this_EffectFullIf_10;
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
    // InternalFPML.g:5954:1: entryRulePrimitivePrint returns [EObject current=null] : iv_rulePrimitivePrint= rulePrimitivePrint EOF ;
    public final EObject entryRulePrimitivePrint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitivePrint = null;


        try {
            // InternalFPML.g:5954:55: (iv_rulePrimitivePrint= rulePrimitivePrint EOF )
            // InternalFPML.g:5955:2: iv_rulePrimitivePrint= rulePrimitivePrint EOF
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
    // InternalFPML.g:5961:1: rulePrimitivePrint returns [EObject current=null] : ( () otherlv_1= 'print' ) ;
    public final EObject rulePrimitivePrint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFPML.g:5967:2: ( ( () otherlv_1= 'print' ) )
            // InternalFPML.g:5968:2: ( () otherlv_1= 'print' )
            {
            // InternalFPML.g:5968:2: ( () otherlv_1= 'print' )
            // InternalFPML.g:5969:3: () otherlv_1= 'print'
            {
            // InternalFPML.g:5969:3: ()
            // InternalFPML.g:5970:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPrimitivePrintAccess().getPrimitivePrintAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,69,FOLLOW_2); 

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


    // $ANTLR start "entryRuleLeftAlgebraicIO"
    // InternalFPML.g:5984:1: entryRuleLeftAlgebraicIO returns [EObject current=null] : iv_ruleLeftAlgebraicIO= ruleLeftAlgebraicIO EOF ;
    public final EObject entryRuleLeftAlgebraicIO() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeftAlgebraicIO = null;


        try {
            // InternalFPML.g:5984:56: (iv_ruleLeftAlgebraicIO= ruleLeftAlgebraicIO EOF )
            // InternalFPML.g:5985:2: iv_ruleLeftAlgebraicIO= ruleLeftAlgebraicIO EOF
            {
             newCompositeNode(grammarAccess.getLeftAlgebraicIORule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLeftAlgebraicIO=ruleLeftAlgebraicIO();

            state._fsp--;

             current =iv_ruleLeftAlgebraicIO; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLeftAlgebraicIO"


    // $ANTLR start "ruleLeftAlgebraicIO"
    // InternalFPML.g:5991:1: ruleLeftAlgebraicIO returns [EObject current=null] : ( () otherlv_1= 'leftADT' ( (lv_type_2_0= ruleEffectFullAlgebraicType ) ) ) ;
    public final EObject ruleLeftAlgebraicIO() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:5997:2: ( ( () otherlv_1= 'leftADT' ( (lv_type_2_0= ruleEffectFullAlgebraicType ) ) ) )
            // InternalFPML.g:5998:2: ( () otherlv_1= 'leftADT' ( (lv_type_2_0= ruleEffectFullAlgebraicType ) ) )
            {
            // InternalFPML.g:5998:2: ( () otherlv_1= 'leftADT' ( (lv_type_2_0= ruleEffectFullAlgebraicType ) ) )
            // InternalFPML.g:5999:3: () otherlv_1= 'leftADT' ( (lv_type_2_0= ruleEffectFullAlgebraicType ) )
            {
            // InternalFPML.g:5999:3: ()
            // InternalFPML.g:6000:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLeftAlgebraicIOAccess().getLeftAlgebraicIOAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,55,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getLeftAlgebraicIOAccess().getLeftADTKeyword_1());
            		
            // InternalFPML.g:6010:3: ( (lv_type_2_0= ruleEffectFullAlgebraicType ) )
            // InternalFPML.g:6011:4: (lv_type_2_0= ruleEffectFullAlgebraicType )
            {
            // InternalFPML.g:6011:4: (lv_type_2_0= ruleEffectFullAlgebraicType )
            // InternalFPML.g:6012:5: lv_type_2_0= ruleEffectFullAlgebraicType
            {

            					newCompositeNode(grammarAccess.getLeftAlgebraicIOAccess().getTypeEffectFullAlgebraicTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleEffectFullAlgebraicType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLeftAlgebraicIORule());
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
    // $ANTLR end "ruleLeftAlgebraicIO"


    // $ANTLR start "entryRuleRightAlgebraicIO"
    // InternalFPML.g:6033:1: entryRuleRightAlgebraicIO returns [EObject current=null] : iv_ruleRightAlgebraicIO= ruleRightAlgebraicIO EOF ;
    public final EObject entryRuleRightAlgebraicIO() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRightAlgebraicIO = null;


        try {
            // InternalFPML.g:6033:57: (iv_ruleRightAlgebraicIO= ruleRightAlgebraicIO EOF )
            // InternalFPML.g:6034:2: iv_ruleRightAlgebraicIO= ruleRightAlgebraicIO EOF
            {
             newCompositeNode(grammarAccess.getRightAlgebraicIORule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRightAlgebraicIO=ruleRightAlgebraicIO();

            state._fsp--;

             current =iv_ruleRightAlgebraicIO; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRightAlgebraicIO"


    // $ANTLR start "ruleRightAlgebraicIO"
    // InternalFPML.g:6040:1: ruleRightAlgebraicIO returns [EObject current=null] : ( () otherlv_1= 'rightADT' ( (lv_type_2_0= ruleEffectFullAlgebraicType ) ) ) ;
    public final EObject ruleRightAlgebraicIO() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:6046:2: ( ( () otherlv_1= 'rightADT' ( (lv_type_2_0= ruleEffectFullAlgebraicType ) ) ) )
            // InternalFPML.g:6047:2: ( () otherlv_1= 'rightADT' ( (lv_type_2_0= ruleEffectFullAlgebraicType ) ) )
            {
            // InternalFPML.g:6047:2: ( () otherlv_1= 'rightADT' ( (lv_type_2_0= ruleEffectFullAlgebraicType ) ) )
            // InternalFPML.g:6048:3: () otherlv_1= 'rightADT' ( (lv_type_2_0= ruleEffectFullAlgebraicType ) )
            {
            // InternalFPML.g:6048:3: ()
            // InternalFPML.g:6049:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRightAlgebraicIOAccess().getRightAlgebraicIOAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,56,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getRightAlgebraicIOAccess().getRightADTKeyword_1());
            		
            // InternalFPML.g:6059:3: ( (lv_type_2_0= ruleEffectFullAlgebraicType ) )
            // InternalFPML.g:6060:4: (lv_type_2_0= ruleEffectFullAlgebraicType )
            {
            // InternalFPML.g:6060:4: (lv_type_2_0= ruleEffectFullAlgebraicType )
            // InternalFPML.g:6061:5: lv_type_2_0= ruleEffectFullAlgebraicType
            {

            					newCompositeNode(grammarAccess.getRightAlgebraicIOAccess().getTypeEffectFullAlgebraicTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleEffectFullAlgebraicType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRightAlgebraicIORule());
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
    // $ANTLR end "ruleRightAlgebraicIO"


    // $ANTLR start "entryRulePrimitiveEffectFullValue"
    // InternalFPML.g:6082:1: entryRulePrimitiveEffectFullValue returns [EObject current=null] : iv_rulePrimitiveEffectFullValue= rulePrimitiveEffectFullValue EOF ;
    public final EObject entryRulePrimitiveEffectFullValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveEffectFullValue = null;


        try {
            // InternalFPML.g:6082:65: (iv_rulePrimitiveEffectFullValue= rulePrimitiveEffectFullValue EOF )
            // InternalFPML.g:6083:2: iv_rulePrimitiveEffectFullValue= rulePrimitiveEffectFullValue EOF
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
    // InternalFPML.g:6089:1: rulePrimitiveEffectFullValue returns [EObject current=null] : (this_PrimitiveRandom_0= rulePrimitiveRandom | this_PrimitiveTime_1= rulePrimitiveTime ) ;
    public final EObject rulePrimitiveEffectFullValue() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveRandom_0 = null;

        EObject this_PrimitiveTime_1 = null;



        	enterRule();

        try {
            // InternalFPML.g:6095:2: ( (this_PrimitiveRandom_0= rulePrimitiveRandom | this_PrimitiveTime_1= rulePrimitiveTime ) )
            // InternalFPML.g:6096:2: (this_PrimitiveRandom_0= rulePrimitiveRandom | this_PrimitiveTime_1= rulePrimitiveTime )
            {
            // InternalFPML.g:6096:2: (this_PrimitiveRandom_0= rulePrimitiveRandom | this_PrimitiveTime_1= rulePrimitiveTime )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==70) ) {
                alt42=1;
            }
            else if ( (LA42_0==72) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalFPML.g:6097:3: this_PrimitiveRandom_0= rulePrimitiveRandom
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
                    // InternalFPML.g:6106:3: this_PrimitiveTime_1= rulePrimitiveTime
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
    // InternalFPML.g:6118:1: entryRulePrimitiveRandom returns [EObject current=null] : iv_rulePrimitiveRandom= rulePrimitiveRandom EOF ;
    public final EObject entryRulePrimitiveRandom() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveRandom = null;


        try {
            // InternalFPML.g:6118:56: (iv_rulePrimitiveRandom= rulePrimitiveRandom EOF )
            // InternalFPML.g:6119:2: iv_rulePrimitiveRandom= rulePrimitiveRandom EOF
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
    // InternalFPML.g:6125:1: rulePrimitiveRandom returns [EObject current=null] : ( () otherlv_1= 'randomInt' ) ;
    public final EObject rulePrimitiveRandom() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFPML.g:6131:2: ( ( () otherlv_1= 'randomInt' ) )
            // InternalFPML.g:6132:2: ( () otherlv_1= 'randomInt' )
            {
            // InternalFPML.g:6132:2: ( () otherlv_1= 'randomInt' )
            // InternalFPML.g:6133:3: () otherlv_1= 'randomInt'
            {
            // InternalFPML.g:6133:3: ()
            // InternalFPML.g:6134:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPrimitiveRandomAccess().getPrimitiveRandomAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,70,FOLLOW_2); 

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
    // InternalFPML.g:6148:1: entryRulePrimitiveReturn returns [EObject current=null] : iv_rulePrimitiveReturn= rulePrimitiveReturn EOF ;
    public final EObject entryRulePrimitiveReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveReturn = null;


        try {
            // InternalFPML.g:6148:56: (iv_rulePrimitiveReturn= rulePrimitiveReturn EOF )
            // InternalFPML.g:6149:2: iv_rulePrimitiveReturn= rulePrimitiveReturn EOF
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
    // InternalFPML.g:6155:1: rulePrimitiveReturn returns [EObject current=null] : ( () otherlv_1= 'return' ( (lv_type_2_0= ruleType ) ) ) ;
    public final EObject rulePrimitiveReturn() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:6161:2: ( ( () otherlv_1= 'return' ( (lv_type_2_0= ruleType ) ) ) )
            // InternalFPML.g:6162:2: ( () otherlv_1= 'return' ( (lv_type_2_0= ruleType ) ) )
            {
            // InternalFPML.g:6162:2: ( () otherlv_1= 'return' ( (lv_type_2_0= ruleType ) ) )
            // InternalFPML.g:6163:3: () otherlv_1= 'return' ( (lv_type_2_0= ruleType ) )
            {
            // InternalFPML.g:6163:3: ()
            // InternalFPML.g:6164:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPrimitiveReturnAccess().getPrimitiveReturnAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,71,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getPrimitiveReturnAccess().getReturnKeyword_1());
            		
            // InternalFPML.g:6174:3: ( (lv_type_2_0= ruleType ) )
            // InternalFPML.g:6175:4: (lv_type_2_0= ruleType )
            {
            // InternalFPML.g:6175:4: (lv_type_2_0= ruleType )
            // InternalFPML.g:6176:5: lv_type_2_0= ruleType
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
    // InternalFPML.g:6197:1: entryRulePrimitiveTime returns [EObject current=null] : iv_rulePrimitiveTime= rulePrimitiveTime EOF ;
    public final EObject entryRulePrimitiveTime() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveTime = null;


        try {
            // InternalFPML.g:6197:54: (iv_rulePrimitiveTime= rulePrimitiveTime EOF )
            // InternalFPML.g:6198:2: iv_rulePrimitiveTime= rulePrimitiveTime EOF
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
    // InternalFPML.g:6204:1: rulePrimitiveTime returns [EObject current=null] : ( () otherlv_1= 'currentTime' ) ;
    public final EObject rulePrimitiveTime() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFPML.g:6210:2: ( ( () otherlv_1= 'currentTime' ) )
            // InternalFPML.g:6211:2: ( () otherlv_1= 'currentTime' )
            {
            // InternalFPML.g:6211:2: ( () otherlv_1= 'currentTime' )
            // InternalFPML.g:6212:3: () otherlv_1= 'currentTime'
            {
            // InternalFPML.g:6212:3: ()
            // InternalFPML.g:6213:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPrimitiveTimeAccess().getPrimitiveTimeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,72,FOLLOW_2); 

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
    // InternalFPML.g:6227:1: entryRuleApplyFIO returns [EObject current=null] : iv_ruleApplyFIO= ruleApplyFIO EOF ;
    public final EObject entryRuleApplyFIO() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplyFIO = null;


        try {
            // InternalFPML.g:6227:49: (iv_ruleApplyFIO= ruleApplyFIO EOF )
            // InternalFPML.g:6228:2: iv_ruleApplyFIO= ruleApplyFIO EOF
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
    // InternalFPML.g:6234:1: ruleApplyFIO returns [EObject current=null] : ( () otherlv_1= 'applyFIO' ( (lv_functionType_2_0= ruleEffectFullFunctionType ) ) ( (lv_value_3_0= ruleApplyFIOFactor ) ) ) ;
    public final EObject ruleApplyFIO() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_functionType_2_0 = null;

        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:6240:2: ( ( () otherlv_1= 'applyFIO' ( (lv_functionType_2_0= ruleEffectFullFunctionType ) ) ( (lv_value_3_0= ruleApplyFIOFactor ) ) ) )
            // InternalFPML.g:6241:2: ( () otherlv_1= 'applyFIO' ( (lv_functionType_2_0= ruleEffectFullFunctionType ) ) ( (lv_value_3_0= ruleApplyFIOFactor ) ) )
            {
            // InternalFPML.g:6241:2: ( () otherlv_1= 'applyFIO' ( (lv_functionType_2_0= ruleEffectFullFunctionType ) ) ( (lv_value_3_0= ruleApplyFIOFactor ) ) )
            // InternalFPML.g:6242:3: () otherlv_1= 'applyFIO' ( (lv_functionType_2_0= ruleEffectFullFunctionType ) ) ( (lv_value_3_0= ruleApplyFIOFactor ) )
            {
            // InternalFPML.g:6242:3: ()
            // InternalFPML.g:6243:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getApplyFIOAccess().getApplyFIOAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,73,FOLLOW_46); 

            			newLeafNode(otherlv_1, grammarAccess.getApplyFIOAccess().getApplyFIOKeyword_1());
            		
            // InternalFPML.g:6253:3: ( (lv_functionType_2_0= ruleEffectFullFunctionType ) )
            // InternalFPML.g:6254:4: (lv_functionType_2_0= ruleEffectFullFunctionType )
            {
            // InternalFPML.g:6254:4: (lv_functionType_2_0= ruleEffectFullFunctionType )
            // InternalFPML.g:6255:5: lv_functionType_2_0= ruleEffectFullFunctionType
            {

            					newCompositeNode(grammarAccess.getApplyFIOAccess().getFunctionTypeEffectFullFunctionTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_47);
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

            // InternalFPML.g:6272:3: ( (lv_value_3_0= ruleApplyFIOFactor ) )
            // InternalFPML.g:6273:4: (lv_value_3_0= ruleApplyFIOFactor )
            {
            // InternalFPML.g:6273:4: (lv_value_3_0= ruleApplyFIOFactor )
            // InternalFPML.g:6274:5: lv_value_3_0= ruleApplyFIOFactor
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
    // InternalFPML.g:6295:1: entryRuleApplyFIOFactor returns [EObject current=null] : iv_ruleApplyFIOFactor= ruleApplyFIOFactor EOF ;
    public final EObject entryRuleApplyFIOFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplyFIOFactor = null;


        try {
            // InternalFPML.g:6295:55: (iv_ruleApplyFIOFactor= ruleApplyFIOFactor EOF )
            // InternalFPML.g:6296:2: iv_ruleApplyFIOFactor= ruleApplyFIOFactor EOF
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
    // InternalFPML.g:6302:1: ruleApplyFIOFactor returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | ( (lv_valuePrimitive_1_0= ruleEffectFullPrimitive ) ) | (otherlv_2= '(' ( (lv_valueExpression_3_0= ruleEffectFullExpression ) ) otherlv_4= ')' ) ) ;
    public final EObject ruleApplyFIOFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_valuePrimitive_1_0 = null;

        EObject lv_valueExpression_3_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:6308:2: ( ( ( (otherlv_0= RULE_ID ) ) | ( (lv_valuePrimitive_1_0= ruleEffectFullPrimitive ) ) | (otherlv_2= '(' ( (lv_valueExpression_3_0= ruleEffectFullExpression ) ) otherlv_4= ')' ) ) )
            // InternalFPML.g:6309:2: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_valuePrimitive_1_0= ruleEffectFullPrimitive ) ) | (otherlv_2= '(' ( (lv_valueExpression_3_0= ruleEffectFullExpression ) ) otherlv_4= ')' ) )
            {
            // InternalFPML.g:6309:2: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_valuePrimitive_1_0= ruleEffectFullPrimitive ) ) | (otherlv_2= '(' ( (lv_valueExpression_3_0= ruleEffectFullExpression ) ) otherlv_4= ')' ) )
            int alt43=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt43=1;
                }
                break;
            case 55:
            case 56:
            case 64:
            case 65:
            case 66:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
                {
                alt43=2;
                }
                break;
            case 21:
                {
                alt43=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // InternalFPML.g:6310:3: ( (otherlv_0= RULE_ID ) )
                    {
                    // InternalFPML.g:6310:3: ( (otherlv_0= RULE_ID ) )
                    // InternalFPML.g:6311:4: (otherlv_0= RULE_ID )
                    {
                    // InternalFPML.g:6311:4: (otherlv_0= RULE_ID )
                    // InternalFPML.g:6312:5: otherlv_0= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getApplyFIOFactorRule());
                    					}
                    				
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_0, grammarAccess.getApplyFIOFactorAccess().getValueReferenceEffectFullFunctionCrossReference_0_0());
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFPML.g:6324:3: ( (lv_valuePrimitive_1_0= ruleEffectFullPrimitive ) )
                    {
                    // InternalFPML.g:6324:3: ( (lv_valuePrimitive_1_0= ruleEffectFullPrimitive ) )
                    // InternalFPML.g:6325:4: (lv_valuePrimitive_1_0= ruleEffectFullPrimitive )
                    {
                    // InternalFPML.g:6325:4: (lv_valuePrimitive_1_0= ruleEffectFullPrimitive )
                    // InternalFPML.g:6326:5: lv_valuePrimitive_1_0= ruleEffectFullPrimitive
                    {

                    					newCompositeNode(grammarAccess.getApplyFIOFactorAccess().getValuePrimitiveEffectFullPrimitiveParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_valuePrimitive_1_0=ruleEffectFullPrimitive();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getApplyFIOFactorRule());
                    					}
                    					set(
                    						current,
                    						"valuePrimitive",
                    						lv_valuePrimitive_1_0,
                    						"it.unibo.FPML.EffectFullPrimitive");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalFPML.g:6344:3: (otherlv_2= '(' ( (lv_valueExpression_3_0= ruleEffectFullExpression ) ) otherlv_4= ')' )
                    {
                    // InternalFPML.g:6344:3: (otherlv_2= '(' ( (lv_valueExpression_3_0= ruleEffectFullExpression ) ) otherlv_4= ')' )
                    // InternalFPML.g:6345:4: otherlv_2= '(' ( (lv_valueExpression_3_0= ruleEffectFullExpression ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_16); 

                    				newLeafNode(otherlv_2, grammarAccess.getApplyFIOFactorAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalFPML.g:6349:4: ( (lv_valueExpression_3_0= ruleEffectFullExpression ) )
                    // InternalFPML.g:6350:5: (lv_valueExpression_3_0= ruleEffectFullExpression )
                    {
                    // InternalFPML.g:6350:5: (lv_valueExpression_3_0= ruleEffectFullExpression )
                    // InternalFPML.g:6351:6: lv_valueExpression_3_0= ruleEffectFullExpression
                    {

                    						newCompositeNode(grammarAccess.getApplyFIOFactorAccess().getValueExpressionEffectFullExpressionParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_valueExpression_3_0=ruleEffectFullExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getApplyFIOFactorRule());
                    						}
                    						set(
                    							current,
                    							"valueExpression",
                    							lv_valueExpression_3_0,
                    							"it.unibo.FPML.EffectFullExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,23,FOLLOW_2); 

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


    // $ANTLR start "entryRuleExtractEffectFull"
    // InternalFPML.g:6377:1: entryRuleExtractEffectFull returns [EObject current=null] : iv_ruleExtractEffectFull= ruleExtractEffectFull EOF ;
    public final EObject entryRuleExtractEffectFull() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtractEffectFull = null;


        try {
            // InternalFPML.g:6377:58: (iv_ruleExtractEffectFull= ruleExtractEffectFull EOF )
            // InternalFPML.g:6378:2: iv_ruleExtractEffectFull= ruleExtractEffectFull EOF
            {
             newCompositeNode(grammarAccess.getExtractEffectFullRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExtractEffectFull=ruleExtractEffectFull();

            state._fsp--;

             current =iv_ruleExtractEffectFull; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExtractEffectFull"


    // $ANTLR start "ruleExtractEffectFull"
    // InternalFPML.g:6384:1: ruleExtractEffectFull returns [EObject current=null] : ( () otherlv_1= 'extractEffectFull' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleExtractEffectFull() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalFPML.g:6390:2: ( ( () otherlv_1= 'extractEffectFull' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalFPML.g:6391:2: ( () otherlv_1= 'extractEffectFull' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalFPML.g:6391:2: ( () otherlv_1= 'extractEffectFull' ( (otherlv_2= RULE_ID ) ) )
            // InternalFPML.g:6392:3: () otherlv_1= 'extractEffectFull' ( (otherlv_2= RULE_ID ) )
            {
            // InternalFPML.g:6392:3: ()
            // InternalFPML.g:6393:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExtractEffectFullAccess().getExtractEffectFullAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,74,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getExtractEffectFullAccess().getExtractEffectFullKeyword_1());
            		
            // InternalFPML.g:6403:3: ( (otherlv_2= RULE_ID ) )
            // InternalFPML.g:6404:4: (otherlv_2= RULE_ID )
            {
            // InternalFPML.g:6404:4: (otherlv_2= RULE_ID )
            // InternalFPML.g:6405:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExtractEffectFullRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getExtractEffectFullAccess().getDataEffectFullDataCrossReference_2_0());
            				

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
    // $ANTLR end "ruleExtractEffectFull"


    // $ANTLR start "entryRuleLiftPureFunction"
    // InternalFPML.g:6420:1: entryRuleLiftPureFunction returns [EObject current=null] : iv_ruleLiftPureFunction= ruleLiftPureFunction EOF ;
    public final EObject entryRuleLiftPureFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiftPureFunction = null;


        try {
            // InternalFPML.g:6420:57: (iv_ruleLiftPureFunction= ruleLiftPureFunction EOF )
            // InternalFPML.g:6421:2: iv_ruleLiftPureFunction= ruleLiftPureFunction EOF
            {
             newCompositeNode(grammarAccess.getLiftPureFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiftPureFunction=ruleLiftPureFunction();

            state._fsp--;

             current =iv_ruleLiftPureFunction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiftPureFunction"


    // $ANTLR start "ruleLiftPureFunction"
    // InternalFPML.g:6427:1: ruleLiftPureFunction returns [EObject current=null] : ( (otherlv_0= 'Lift' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) | (otherlv_4= 'Lift' otherlv_5= '(' ( (lv_functionPrimitive_6_0= rulePrimitivePureFunction ) ) otherlv_7= ')' ) ) ;
    public final EObject ruleLiftPureFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_functionPrimitive_6_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:6433:2: ( ( (otherlv_0= 'Lift' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) | (otherlv_4= 'Lift' otherlv_5= '(' ( (lv_functionPrimitive_6_0= rulePrimitivePureFunction ) ) otherlv_7= ')' ) ) )
            // InternalFPML.g:6434:2: ( (otherlv_0= 'Lift' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) | (otherlv_4= 'Lift' otherlv_5= '(' ( (lv_functionPrimitive_6_0= rulePrimitivePureFunction ) ) otherlv_7= ')' ) )
            {
            // InternalFPML.g:6434:2: ( (otherlv_0= 'Lift' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) | (otherlv_4= 'Lift' otherlv_5= '(' ( (lv_functionPrimitive_6_0= rulePrimitivePureFunction ) ) otherlv_7= ')' ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==75) ) {
                int LA44_1 = input.LA(2);

                if ( (LA44_1==21) ) {
                    int LA44_2 = input.LA(3);

                    if ( ((LA44_2>=36 && LA44_2<=37)||(LA44_2>=41 && LA44_2<=42)||(LA44_2>=51 && LA44_2<=66)) ) {
                        alt44=2;
                    }
                    else if ( (LA44_2==RULE_ID) ) {
                        alt44=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 44, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 44, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalFPML.g:6435:3: (otherlv_0= 'Lift' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
                    {
                    // InternalFPML.g:6435:3: (otherlv_0= 'Lift' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
                    // InternalFPML.g:6436:4: otherlv_0= 'Lift' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')'
                    {
                    otherlv_0=(Token)match(input,75,FOLLOW_18); 

                    				newLeafNode(otherlv_0, grammarAccess.getLiftPureFunctionAccess().getLiftKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,21,FOLLOW_17); 

                    				newLeafNode(otherlv_1, grammarAccess.getLiftPureFunctionAccess().getLeftParenthesisKeyword_0_1());
                    			
                    // InternalFPML.g:6444:4: ( (otherlv_2= RULE_ID ) )
                    // InternalFPML.g:6445:5: (otherlv_2= RULE_ID )
                    {
                    // InternalFPML.g:6445:5: (otherlv_2= RULE_ID )
                    // InternalFPML.g:6446:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLiftPureFunctionRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_20); 

                    						newLeafNode(otherlv_2, grammarAccess.getLiftPureFunctionAccess().getFunctionRefPureFunctionCrossReference_0_2_0());
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getLiftPureFunctionAccess().getRightParenthesisKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFPML.g:6463:3: (otherlv_4= 'Lift' otherlv_5= '(' ( (lv_functionPrimitive_6_0= rulePrimitivePureFunction ) ) otherlv_7= ')' )
                    {
                    // InternalFPML.g:6463:3: (otherlv_4= 'Lift' otherlv_5= '(' ( (lv_functionPrimitive_6_0= rulePrimitivePureFunction ) ) otherlv_7= ')' )
                    // InternalFPML.g:6464:4: otherlv_4= 'Lift' otherlv_5= '(' ( (lv_functionPrimitive_6_0= rulePrimitivePureFunction ) ) otherlv_7= ')'
                    {
                    otherlv_4=(Token)match(input,75,FOLLOW_18); 

                    				newLeafNode(otherlv_4, grammarAccess.getLiftPureFunctionAccess().getLiftKeyword_1_0());
                    			
                    otherlv_5=(Token)match(input,21,FOLLOW_28); 

                    				newLeafNode(otherlv_5, grammarAccess.getLiftPureFunctionAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalFPML.g:6472:4: ( (lv_functionPrimitive_6_0= rulePrimitivePureFunction ) )
                    // InternalFPML.g:6473:5: (lv_functionPrimitive_6_0= rulePrimitivePureFunction )
                    {
                    // InternalFPML.g:6473:5: (lv_functionPrimitive_6_0= rulePrimitivePureFunction )
                    // InternalFPML.g:6474:6: lv_functionPrimitive_6_0= rulePrimitivePureFunction
                    {

                    						newCompositeNode(grammarAccess.getLiftPureFunctionAccess().getFunctionPrimitivePrimitivePureFunctionParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_functionPrimitive_6_0=rulePrimitivePureFunction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLiftPureFunctionRule());
                    						}
                    						set(
                    							current,
                    							"functionPrimitive",
                    							lv_functionPrimitive_6_0,
                    							"it.unibo.FPML.PrimitivePureFunction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getLiftPureFunctionAccess().getRightParenthesisKeyword_1_3());
                    			

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
    // $ANTLR end "ruleLiftPureFunction"


    // $ANTLR start "entryRuleLiftEffectFullFunction"
    // InternalFPML.g:6500:1: entryRuleLiftEffectFullFunction returns [EObject current=null] : iv_ruleLiftEffectFullFunction= ruleLiftEffectFullFunction EOF ;
    public final EObject entryRuleLiftEffectFullFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiftEffectFullFunction = null;


        try {
            // InternalFPML.g:6500:63: (iv_ruleLiftEffectFullFunction= ruleLiftEffectFullFunction EOF )
            // InternalFPML.g:6501:2: iv_ruleLiftEffectFullFunction= ruleLiftEffectFullFunction EOF
            {
             newCompositeNode(grammarAccess.getLiftEffectFullFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiftEffectFullFunction=ruleLiftEffectFullFunction();

            state._fsp--;

             current =iv_ruleLiftEffectFullFunction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiftEffectFullFunction"


    // $ANTLR start "ruleLiftEffectFullFunction"
    // InternalFPML.g:6507:1: ruleLiftEffectFullFunction returns [EObject current=null] : ( (otherlv_0= 'Lift' otherlv_1= '[' ( (otherlv_2= RULE_ID ) ) otherlv_3= ']' ) | (otherlv_4= 'Lift' otherlv_5= '[' ( (lv_functionPrimitive_6_0= rulePrimitiveEffectFullFunction ) ) otherlv_7= ']' ) ) ;
    public final EObject ruleLiftEffectFullFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_functionPrimitive_6_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:6513:2: ( ( (otherlv_0= 'Lift' otherlv_1= '[' ( (otherlv_2= RULE_ID ) ) otherlv_3= ']' ) | (otherlv_4= 'Lift' otherlv_5= '[' ( (lv_functionPrimitive_6_0= rulePrimitiveEffectFullFunction ) ) otherlv_7= ']' ) ) )
            // InternalFPML.g:6514:2: ( (otherlv_0= 'Lift' otherlv_1= '[' ( (otherlv_2= RULE_ID ) ) otherlv_3= ']' ) | (otherlv_4= 'Lift' otherlv_5= '[' ( (lv_functionPrimitive_6_0= rulePrimitiveEffectFullFunction ) ) otherlv_7= ']' ) )
            {
            // InternalFPML.g:6514:2: ( (otherlv_0= 'Lift' otherlv_1= '[' ( (otherlv_2= RULE_ID ) ) otherlv_3= ']' ) | (otherlv_4= 'Lift' otherlv_5= '[' ( (lv_functionPrimitive_6_0= rulePrimitiveEffectFullFunction ) ) otherlv_7= ']' ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==75) ) {
                int LA45_1 = input.LA(2);

                if ( (LA45_1==39) ) {
                    int LA45_2 = input.LA(3);

                    if ( (LA45_2==RULE_ID) ) {
                        alt45=1;
                    }
                    else if ( ((LA45_2>=55 && LA45_2<=56)||(LA45_2>=64 && LA45_2<=66)||LA45_2==69||LA45_2==71||(LA45_2>=73 && LA45_2<=75)) ) {
                        alt45=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 45, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // InternalFPML.g:6515:3: (otherlv_0= 'Lift' otherlv_1= '[' ( (otherlv_2= RULE_ID ) ) otherlv_3= ']' )
                    {
                    // InternalFPML.g:6515:3: (otherlv_0= 'Lift' otherlv_1= '[' ( (otherlv_2= RULE_ID ) ) otherlv_3= ']' )
                    // InternalFPML.g:6516:4: otherlv_0= 'Lift' otherlv_1= '[' ( (otherlv_2= RULE_ID ) ) otherlv_3= ']'
                    {
                    otherlv_0=(Token)match(input,75,FOLLOW_37); 

                    				newLeafNode(otherlv_0, grammarAccess.getLiftEffectFullFunctionAccess().getLiftKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,39,FOLLOW_17); 

                    				newLeafNode(otherlv_1, grammarAccess.getLiftEffectFullFunctionAccess().getLeftSquareBracketKeyword_0_1());
                    			
                    // InternalFPML.g:6524:4: ( (otherlv_2= RULE_ID ) )
                    // InternalFPML.g:6525:5: (otherlv_2= RULE_ID )
                    {
                    // InternalFPML.g:6525:5: (otherlv_2= RULE_ID )
                    // InternalFPML.g:6526:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLiftEffectFullFunctionRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_36); 

                    						newLeafNode(otherlv_2, grammarAccess.getLiftEffectFullFunctionAccess().getFunctionRefEffectFullFunctionCrossReference_0_2_0());
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,40,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getLiftEffectFullFunctionAccess().getRightSquareBracketKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFPML.g:6543:3: (otherlv_4= 'Lift' otherlv_5= '[' ( (lv_functionPrimitive_6_0= rulePrimitiveEffectFullFunction ) ) otherlv_7= ']' )
                    {
                    // InternalFPML.g:6543:3: (otherlv_4= 'Lift' otherlv_5= '[' ( (lv_functionPrimitive_6_0= rulePrimitiveEffectFullFunction ) ) otherlv_7= ']' )
                    // InternalFPML.g:6544:4: otherlv_4= 'Lift' otherlv_5= '[' ( (lv_functionPrimitive_6_0= rulePrimitiveEffectFullFunction ) ) otherlv_7= ']'
                    {
                    otherlv_4=(Token)match(input,75,FOLLOW_37); 

                    				newLeafNode(otherlv_4, grammarAccess.getLiftEffectFullFunctionAccess().getLiftKeyword_1_0());
                    			
                    otherlv_5=(Token)match(input,39,FOLLOW_38); 

                    				newLeafNode(otherlv_5, grammarAccess.getLiftEffectFullFunctionAccess().getLeftSquareBracketKeyword_1_1());
                    			
                    // InternalFPML.g:6552:4: ( (lv_functionPrimitive_6_0= rulePrimitiveEffectFullFunction ) )
                    // InternalFPML.g:6553:5: (lv_functionPrimitive_6_0= rulePrimitiveEffectFullFunction )
                    {
                    // InternalFPML.g:6553:5: (lv_functionPrimitive_6_0= rulePrimitiveEffectFullFunction )
                    // InternalFPML.g:6554:6: lv_functionPrimitive_6_0= rulePrimitiveEffectFullFunction
                    {

                    						newCompositeNode(grammarAccess.getLiftEffectFullFunctionAccess().getFunctionPrimitivePrimitiveEffectFullFunctionParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_functionPrimitive_6_0=rulePrimitiveEffectFullFunction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLiftEffectFullFunctionRule());
                    						}
                    						set(
                    							current,
                    							"functionPrimitive",
                    							lv_functionPrimitive_6_0,
                    							"it.unibo.FPML.PrimitiveEffectFullFunction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,40,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getLiftEffectFullFunctionAccess().getRightSquareBracketKeyword_1_3());
                    			

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
    // $ANTLR end "ruleLiftEffectFullFunction"


    // $ANTLR start "entryRuleIsLeftEffectFull"
    // InternalFPML.g:6580:1: entryRuleIsLeftEffectFull returns [EObject current=null] : iv_ruleIsLeftEffectFull= ruleIsLeftEffectFull EOF ;
    public final EObject entryRuleIsLeftEffectFull() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsLeftEffectFull = null;


        try {
            // InternalFPML.g:6580:57: (iv_ruleIsLeftEffectFull= ruleIsLeftEffectFull EOF )
            // InternalFPML.g:6581:2: iv_ruleIsLeftEffectFull= ruleIsLeftEffectFull EOF
            {
             newCompositeNode(grammarAccess.getIsLeftEffectFullRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIsLeftEffectFull=ruleIsLeftEffectFull();

            state._fsp--;

             current =iv_ruleIsLeftEffectFull; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIsLeftEffectFull"


    // $ANTLR start "ruleIsLeftEffectFull"
    // InternalFPML.g:6587:1: ruleIsLeftEffectFull returns [EObject current=null] : ( () otherlv_1= 'isLeft' ( (lv_type_2_0= ruleEffectFullAlgebraicType ) ) ) ;
    public final EObject ruleIsLeftEffectFull() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:6593:2: ( ( () otherlv_1= 'isLeft' ( (lv_type_2_0= ruleEffectFullAlgebraicType ) ) ) )
            // InternalFPML.g:6594:2: ( () otherlv_1= 'isLeft' ( (lv_type_2_0= ruleEffectFullAlgebraicType ) ) )
            {
            // InternalFPML.g:6594:2: ( () otherlv_1= 'isLeft' ( (lv_type_2_0= ruleEffectFullAlgebraicType ) ) )
            // InternalFPML.g:6595:3: () otherlv_1= 'isLeft' ( (lv_type_2_0= ruleEffectFullAlgebraicType ) )
            {
            // InternalFPML.g:6595:3: ()
            // InternalFPML.g:6596:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIsLeftEffectFullAccess().getIsLeftEffectFullAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,64,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getIsLeftEffectFullAccess().getIsLeftKeyword_1());
            		
            // InternalFPML.g:6606:3: ( (lv_type_2_0= ruleEffectFullAlgebraicType ) )
            // InternalFPML.g:6607:4: (lv_type_2_0= ruleEffectFullAlgebraicType )
            {
            // InternalFPML.g:6607:4: (lv_type_2_0= ruleEffectFullAlgebraicType )
            // InternalFPML.g:6608:5: lv_type_2_0= ruleEffectFullAlgebraicType
            {

            					newCompositeNode(grammarAccess.getIsLeftEffectFullAccess().getTypeEffectFullAlgebraicTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleEffectFullAlgebraicType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIsLeftEffectFullRule());
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
    // $ANTLR end "ruleIsLeftEffectFull"


    // $ANTLR start "entryRuleIsRightEffectFull"
    // InternalFPML.g:6629:1: entryRuleIsRightEffectFull returns [EObject current=null] : iv_ruleIsRightEffectFull= ruleIsRightEffectFull EOF ;
    public final EObject entryRuleIsRightEffectFull() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsRightEffectFull = null;


        try {
            // InternalFPML.g:6629:58: (iv_ruleIsRightEffectFull= ruleIsRightEffectFull EOF )
            // InternalFPML.g:6630:2: iv_ruleIsRightEffectFull= ruleIsRightEffectFull EOF
            {
             newCompositeNode(grammarAccess.getIsRightEffectFullRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIsRightEffectFull=ruleIsRightEffectFull();

            state._fsp--;

             current =iv_ruleIsRightEffectFull; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIsRightEffectFull"


    // $ANTLR start "ruleIsRightEffectFull"
    // InternalFPML.g:6636:1: ruleIsRightEffectFull returns [EObject current=null] : ( () otherlv_1= 'isRight' ( (lv_type_2_0= ruleEffectFullAlgebraicType ) ) ) ;
    public final EObject ruleIsRightEffectFull() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:6642:2: ( ( () otherlv_1= 'isRight' ( (lv_type_2_0= ruleEffectFullAlgebraicType ) ) ) )
            // InternalFPML.g:6643:2: ( () otherlv_1= 'isRight' ( (lv_type_2_0= ruleEffectFullAlgebraicType ) ) )
            {
            // InternalFPML.g:6643:2: ( () otherlv_1= 'isRight' ( (lv_type_2_0= ruleEffectFullAlgebraicType ) ) )
            // InternalFPML.g:6644:3: () otherlv_1= 'isRight' ( (lv_type_2_0= ruleEffectFullAlgebraicType ) )
            {
            // InternalFPML.g:6644:3: ()
            // InternalFPML.g:6645:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIsRightEffectFullAccess().getIsRightEffectFullAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,65,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getIsRightEffectFullAccess().getIsRightKeyword_1());
            		
            // InternalFPML.g:6655:3: ( (lv_type_2_0= ruleEffectFullAlgebraicType ) )
            // InternalFPML.g:6656:4: (lv_type_2_0= ruleEffectFullAlgebraicType )
            {
            // InternalFPML.g:6656:4: (lv_type_2_0= ruleEffectFullAlgebraicType )
            // InternalFPML.g:6657:5: lv_type_2_0= ruleEffectFullAlgebraicType
            {

            					newCompositeNode(grammarAccess.getIsRightEffectFullAccess().getTypeEffectFullAlgebraicTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleEffectFullAlgebraicType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIsRightEffectFullRule());
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
    // $ANTLR end "ruleIsRightEffectFull"


    // $ANTLR start "entryRuleEffectFullIf"
    // InternalFPML.g:6678:1: entryRuleEffectFullIf returns [EObject current=null] : iv_ruleEffectFullIf= ruleEffectFullIf EOF ;
    public final EObject entryRuleEffectFullIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullIf = null;


        try {
            // InternalFPML.g:6678:53: (iv_ruleEffectFullIf= ruleEffectFullIf EOF )
            // InternalFPML.g:6679:2: iv_ruleEffectFullIf= ruleEffectFullIf EOF
            {
             newCompositeNode(grammarAccess.getEffectFullIfRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEffectFullIf=ruleEffectFullIf();

            state._fsp--;

             current =iv_ruleEffectFullIf; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEffectFullIf"


    // $ANTLR start "ruleEffectFullIf"
    // InternalFPML.g:6685:1: ruleEffectFullIf returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= 'then' otherlv_3= '{' ( (lv_then_4_0= ruleEffectFullIfBody ) ) otherlv_5= '}' otherlv_6= 'else' otherlv_7= '{' ( (lv_else_8_0= ruleEffectFullIfBody ) ) otherlv_9= '}' ) ;
    public final EObject ruleEffectFullIf() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_then_4_0 = null;

        EObject lv_else_8_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:6691:2: ( ( () otherlv_1= 'if' otherlv_2= 'then' otherlv_3= '{' ( (lv_then_4_0= ruleEffectFullIfBody ) ) otherlv_5= '}' otherlv_6= 'else' otherlv_7= '{' ( (lv_else_8_0= ruleEffectFullIfBody ) ) otherlv_9= '}' ) )
            // InternalFPML.g:6692:2: ( () otherlv_1= 'if' otherlv_2= 'then' otherlv_3= '{' ( (lv_then_4_0= ruleEffectFullIfBody ) ) otherlv_5= '}' otherlv_6= 'else' otherlv_7= '{' ( (lv_else_8_0= ruleEffectFullIfBody ) ) otherlv_9= '}' )
            {
            // InternalFPML.g:6692:2: ( () otherlv_1= 'if' otherlv_2= 'then' otherlv_3= '{' ( (lv_then_4_0= ruleEffectFullIfBody ) ) otherlv_5= '}' otherlv_6= 'else' otherlv_7= '{' ( (lv_else_8_0= ruleEffectFullIfBody ) ) otherlv_9= '}' )
            // InternalFPML.g:6693:3: () otherlv_1= 'if' otherlv_2= 'then' otherlv_3= '{' ( (lv_then_4_0= ruleEffectFullIfBody ) ) otherlv_5= '}' otherlv_6= 'else' otherlv_7= '{' ( (lv_else_8_0= ruleEffectFullIfBody ) ) otherlv_9= '}'
            {
            // InternalFPML.g:6693:3: ()
            // InternalFPML.g:6694:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEffectFullIfAccess().getEffectFullIfAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,66,FOLLOW_44); 

            			newLeafNode(otherlv_1, grammarAccess.getEffectFullIfAccess().getIfKeyword_1());
            		
            otherlv_2=(Token)match(input,67,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getEffectFullIfAccess().getThenKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getEffectFullIfAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalFPML.g:6712:3: ( (lv_then_4_0= ruleEffectFullIfBody ) )
            // InternalFPML.g:6713:4: (lv_then_4_0= ruleEffectFullIfBody )
            {
            // InternalFPML.g:6713:4: (lv_then_4_0= ruleEffectFullIfBody )
            // InternalFPML.g:6714:5: lv_then_4_0= ruleEffectFullIfBody
            {

            					newCompositeNode(grammarAccess.getEffectFullIfAccess().getThenEffectFullIfBodyParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_then_4_0=ruleEffectFullIfBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEffectFullIfRule());
            					}
            					set(
            						current,
            						"then",
            						lv_then_4_0,
            						"it.unibo.FPML.EffectFullIfBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_45); 

            			newLeafNode(otherlv_5, grammarAccess.getEffectFullIfAccess().getRightCurlyBracketKeyword_5());
            		
            otherlv_6=(Token)match(input,68,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getEffectFullIfAccess().getElseKeyword_6());
            		
            otherlv_7=(Token)match(input,13,FOLLOW_16); 

            			newLeafNode(otherlv_7, grammarAccess.getEffectFullIfAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalFPML.g:6743:3: ( (lv_else_8_0= ruleEffectFullIfBody ) )
            // InternalFPML.g:6744:4: (lv_else_8_0= ruleEffectFullIfBody )
            {
            // InternalFPML.g:6744:4: (lv_else_8_0= ruleEffectFullIfBody )
            // InternalFPML.g:6745:5: lv_else_8_0= ruleEffectFullIfBody
            {

            					newCompositeNode(grammarAccess.getEffectFullIfAccess().getElseEffectFullIfBodyParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_7);
            lv_else_8_0=ruleEffectFullIfBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEffectFullIfRule());
            					}
            					set(
            						current,
            						"else",
            						lv_else_8_0,
            						"it.unibo.FPML.EffectFullIfBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getEffectFullIfAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEffectFullIf"


    // $ANTLR start "entryRuleEffectFullIfBody"
    // InternalFPML.g:6770:1: entryRuleEffectFullIfBody returns [EObject current=null] : iv_ruleEffectFullIfBody= ruleEffectFullIfBody EOF ;
    public final EObject entryRuleEffectFullIfBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectFullIfBody = null;


        try {
            // InternalFPML.g:6770:57: (iv_ruleEffectFullIfBody= ruleEffectFullIfBody EOF )
            // InternalFPML.g:6771:2: iv_ruleEffectFullIfBody= ruleEffectFullIfBody EOF
            {
             newCompositeNode(grammarAccess.getEffectFullIfBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEffectFullIfBody=ruleEffectFullIfBody();

            state._fsp--;

             current =iv_ruleEffectFullIfBody; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEffectFullIfBody"


    // $ANTLR start "ruleEffectFullIfBody"
    // InternalFPML.g:6777:1: ruleEffectFullIfBody returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | ( (lv_functionExpression_1_0= ruleEffectFullExpression ) ) ) ;
    public final EObject ruleEffectFullIfBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_functionExpression_1_0 = null;



        	enterRule();

        try {
            // InternalFPML.g:6783:2: ( ( ( (otherlv_0= RULE_ID ) ) | ( (lv_functionExpression_1_0= ruleEffectFullExpression ) ) ) )
            // InternalFPML.g:6784:2: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_functionExpression_1_0= ruleEffectFullExpression ) ) )
            {
            // InternalFPML.g:6784:2: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_functionExpression_1_0= ruleEffectFullExpression ) ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_ID) ) {
                int LA46_1 = input.LA(2);

                if ( (LA46_1==39) ) {
                    alt46=2;
                }
                else if ( (LA46_1==EOF||LA46_1==14) ) {
                    alt46=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 46, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA46_0==24||LA46_0==39||LA46_0==43||(LA46_0>=45 && LA46_0<=46)||(LA46_0>=49 && LA46_0<=50)) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalFPML.g:6785:3: ( (otherlv_0= RULE_ID ) )
                    {
                    // InternalFPML.g:6785:3: ( (otherlv_0= RULE_ID ) )
                    // InternalFPML.g:6786:4: (otherlv_0= RULE_ID )
                    {
                    // InternalFPML.g:6786:4: (otherlv_0= RULE_ID )
                    // InternalFPML.g:6787:5: otherlv_0= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEffectFullIfBodyRule());
                    					}
                    				
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_0, grammarAccess.getEffectFullIfBodyAccess().getFunctionReferenceEffectFullFunctionCrossReference_0_0());
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFPML.g:6799:3: ( (lv_functionExpression_1_0= ruleEffectFullExpression ) )
                    {
                    // InternalFPML.g:6799:3: ( (lv_functionExpression_1_0= ruleEffectFullExpression ) )
                    // InternalFPML.g:6800:4: (lv_functionExpression_1_0= ruleEffectFullExpression )
                    {
                    // InternalFPML.g:6800:4: (lv_functionExpression_1_0= ruleEffectFullExpression )
                    // InternalFPML.g:6801:5: lv_functionExpression_1_0= ruleEffectFullExpression
                    {

                    					newCompositeNode(grammarAccess.getEffectFullIfBodyAccess().getFunctionExpressionEffectFullExpressionParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_functionExpression_1_0=ruleEffectFullExpression();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEffectFullIfBodyRule());
                    					}
                    					set(
                    						current,
                    						"functionExpression",
                    						lv_functionExpression_1_0,
                    						"it.unibo.FPML.EffectFullExpression");
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
    // $ANTLR end "ruleEffectFullIfBody"

    // Delegated rules


    protected DFA30 dfa30 = new DFA30(this);
    protected DFA41 dfa41 = new DFA41(this);
    static final String dfa_1s = "\20\uffff";
    static final String dfa_2s = "\1\4\2\25\7\uffff\2\4\4\uffff";
    static final String dfa_3s = "\1\62\2\47\7\uffff\1\113\1\102\4\uffff";
    static final String dfa_4s = "\3\uffff\1\7\1\10\1\11\1\12\1\13\1\2\1\1\2\uffff\1\5\1\6\1\3\1\4";
    static final String dfa_5s = "\20\uffff}>";
    static final String[] dfa_6s = {
            "\1\4\23\uffff\1\1\16\uffff\1\5\3\uffff\1\2\1\uffff\1\7\1\3\2\uffff\2\6",
            "\1\10\21\uffff\1\11",
            "\1\13\21\uffff\1\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\14\62\uffff\2\15\7\uffff\3\15\2\uffff\1\15\1\uffff\1\15\1\uffff\3\15",
            "\1\16\37\uffff\2\17\3\uffff\2\17\10\uffff\20\17",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "3158:2: ( ( () otherlv_1= 'IO' otherlv_2= '[' ( (lv_innerValue_3_0= ruleEffectFullExpression ) ) otherlv_4= ']' ) | ( () otherlv_6= 'IO' otherlv_7= '(' ( (lv_innerValue_8_0= ruleExpression ) ) otherlv_9= ')' ) | ( () otherlv_11= 'IOF' otherlv_12= '(' ( (otherlv_13= RULE_ID ) ) otherlv_14= ')' ) | ( () otherlv_16= 'IOF' otherlv_17= '(' ( (lv_purePrimitive_18_0= rulePrimitivePureFunction ) ) otherlv_19= ')' ) | ( () otherlv_21= 'IOF' otherlv_22= '[' ( (otherlv_23= RULE_ID ) ) otherlv_24= ']' ) | ( () otherlv_26= 'IOF' otherlv_27= '[' ( (lv_effectFullPrimitive_28_0= rulePrimitiveEffectFullFunction ) ) otherlv_29= ']' ) | this_EffectFullFunctionValue_30= ruleEffectFullFunctionValue | this_EffectFullDataValue_31= ruleEffectFullDataValue | this_EffectFullProdValue_32= ruleEffectFullProdValue | this_EffectFullSumValue_33= ruleEffectFullSumValue | this_EffectFullValueRef_34= ruleEffectFullValueRef )";
        }
    }
    static final String dfa_7s = "\15\uffff";
    static final String dfa_8s = "\1\67\6\uffff\1\25\5\uffff";
    static final String dfa_9s = "\1\113\6\uffff\1\47\5\uffff";
    static final String dfa_10s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff\1\11\1\12\1\13\1\7\1\10";
    static final String dfa_11s = "\15\uffff}>";
    static final String[] dfa_12s = {
            "\1\4\1\5\7\uffff\1\10\1\11\1\12\2\uffff\1\1\1\uffff\1\3\1\uffff\1\2\1\6\1\7",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\13\21\uffff\1\14",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "5851:2: (this_PrimitivePrint_0= rulePrimitivePrint | this_ApplyFIO_1= ruleApplyFIO | this_PrimitiveReturn_2= rulePrimitiveReturn | this_LeftAlgebraicIO_3= ruleLeftAlgebraicIO | this_RightAlgebraicIO_4= ruleRightAlgebraicIO | this_ExtractEffectFull_5= ruleExtractEffectFull | this_LiftPureFunction_6= ruleLiftPureFunction | this_LiftEffectFullFunction_7= ruleLiftEffectFullFunction | this_IsLeftEffectFull_8= ruleIsLeftEffectFull | this_IsRightEffectFull_9= ruleIsRightEffectFull | this_EffectFullIf_10= ruleEffectFullIf )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000008BE0000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00075000002000F0L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000004401002000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0006688001000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0xFFFF5630042000F0L,0x0000000000000007L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000CFE1002000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0186688005000010L,0x0000000000000FE7L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0xFFF8063000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0180000000000000L,0x0000000000000FE7L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0180000000000000L,0x0000000000000EA7L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0180000000200010L,0x0000000000000FE7L});

}