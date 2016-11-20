package it.unibo.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import it.unibo.services.FPMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFPMLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Pure'", "'{'", "'}'", "'Functions'", "'Data'", "'Value'", "'Effects'", "':'", "'['", "']'", "'+'", "'*'", "'def'", "'('", "')'", "'IO'", "'main'", "'Undefined'", "'|>'", "'>>='", "'->'", "'ref'", "'F'", "'<'", "','", "'>'", "'FIO'", "'()'", "'Left'", "'Right'", "'IntToString'", "'IntPow'", "'-'", "'mod'", "'applyF'", "'print'", "'applyFIO'", "'int'", "'String'", "'Unit'"
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

    	public void setGrammarAccess(FPMLGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalFPML.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalFPML.g:54:1: ( ruleModel EOF )
            // InternalFPML.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalFPML.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalFPML.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalFPML.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalFPML.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalFPML.g:69:3: ( rule__Model__Group__0 )
            // InternalFPML.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulePureBlock"
    // InternalFPML.g:78:1: entryRulePureBlock : rulePureBlock EOF ;
    public final void entryRulePureBlock() throws RecognitionException {
        try {
            // InternalFPML.g:79:1: ( rulePureBlock EOF )
            // InternalFPML.g:80:1: rulePureBlock EOF
            {
             before(grammarAccess.getPureBlockRule()); 
            pushFollow(FOLLOW_1);
            rulePureBlock();

            state._fsp--;

             after(grammarAccess.getPureBlockRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePureBlock"


    // $ANTLR start "rulePureBlock"
    // InternalFPML.g:87:1: rulePureBlock : ( ( rule__PureBlock__Group__0 ) ) ;
    public final void rulePureBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:91:2: ( ( ( rule__PureBlock__Group__0 ) ) )
            // InternalFPML.g:92:2: ( ( rule__PureBlock__Group__0 ) )
            {
            // InternalFPML.g:92:2: ( ( rule__PureBlock__Group__0 ) )
            // InternalFPML.g:93:3: ( rule__PureBlock__Group__0 )
            {
             before(grammarAccess.getPureBlockAccess().getGroup()); 
            // InternalFPML.g:94:3: ( rule__PureBlock__Group__0 )
            // InternalFPML.g:94:4: rule__PureBlock__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PureBlock__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPureBlockAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePureBlock"


    // $ANTLR start "entryRulePureFunctionBlock"
    // InternalFPML.g:103:1: entryRulePureFunctionBlock : rulePureFunctionBlock EOF ;
    public final void entryRulePureFunctionBlock() throws RecognitionException {
        try {
            // InternalFPML.g:104:1: ( rulePureFunctionBlock EOF )
            // InternalFPML.g:105:1: rulePureFunctionBlock EOF
            {
             before(grammarAccess.getPureFunctionBlockRule()); 
            pushFollow(FOLLOW_1);
            rulePureFunctionBlock();

            state._fsp--;

             after(grammarAccess.getPureFunctionBlockRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePureFunctionBlock"


    // $ANTLR start "rulePureFunctionBlock"
    // InternalFPML.g:112:1: rulePureFunctionBlock : ( ( rule__PureFunctionBlock__Group__0 ) ) ;
    public final void rulePureFunctionBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:116:2: ( ( ( rule__PureFunctionBlock__Group__0 ) ) )
            // InternalFPML.g:117:2: ( ( rule__PureFunctionBlock__Group__0 ) )
            {
            // InternalFPML.g:117:2: ( ( rule__PureFunctionBlock__Group__0 ) )
            // InternalFPML.g:118:3: ( rule__PureFunctionBlock__Group__0 )
            {
             before(grammarAccess.getPureFunctionBlockAccess().getGroup()); 
            // InternalFPML.g:119:3: ( rule__PureFunctionBlock__Group__0 )
            // InternalFPML.g:119:4: rule__PureFunctionBlock__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PureFunctionBlock__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPureFunctionBlockAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePureFunctionBlock"


    // $ANTLR start "entryRuleDataBlock"
    // InternalFPML.g:128:1: entryRuleDataBlock : ruleDataBlock EOF ;
    public final void entryRuleDataBlock() throws RecognitionException {
        try {
            // InternalFPML.g:129:1: ( ruleDataBlock EOF )
            // InternalFPML.g:130:1: ruleDataBlock EOF
            {
             before(grammarAccess.getDataBlockRule()); 
            pushFollow(FOLLOW_1);
            ruleDataBlock();

            state._fsp--;

             after(grammarAccess.getDataBlockRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDataBlock"


    // $ANTLR start "ruleDataBlock"
    // InternalFPML.g:137:1: ruleDataBlock : ( ( rule__DataBlock__Group__0 ) ) ;
    public final void ruleDataBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:141:2: ( ( ( rule__DataBlock__Group__0 ) ) )
            // InternalFPML.g:142:2: ( ( rule__DataBlock__Group__0 ) )
            {
            // InternalFPML.g:142:2: ( ( rule__DataBlock__Group__0 ) )
            // InternalFPML.g:143:3: ( rule__DataBlock__Group__0 )
            {
             before(grammarAccess.getDataBlockAccess().getGroup()); 
            // InternalFPML.g:144:3: ( rule__DataBlock__Group__0 )
            // InternalFPML.g:144:4: rule__DataBlock__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataBlock__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataBlockAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataBlock"


    // $ANTLR start "entryRuleValueBlock"
    // InternalFPML.g:153:1: entryRuleValueBlock : ruleValueBlock EOF ;
    public final void entryRuleValueBlock() throws RecognitionException {
        try {
            // InternalFPML.g:154:1: ( ruleValueBlock EOF )
            // InternalFPML.g:155:1: ruleValueBlock EOF
            {
             before(grammarAccess.getValueBlockRule()); 
            pushFollow(FOLLOW_1);
            ruleValueBlock();

            state._fsp--;

             after(grammarAccess.getValueBlockRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValueBlock"


    // $ANTLR start "ruleValueBlock"
    // InternalFPML.g:162:1: ruleValueBlock : ( ( rule__ValueBlock__Group__0 ) ) ;
    public final void ruleValueBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:166:2: ( ( ( rule__ValueBlock__Group__0 ) ) )
            // InternalFPML.g:167:2: ( ( rule__ValueBlock__Group__0 ) )
            {
            // InternalFPML.g:167:2: ( ( rule__ValueBlock__Group__0 ) )
            // InternalFPML.g:168:3: ( rule__ValueBlock__Group__0 )
            {
             before(grammarAccess.getValueBlockAccess().getGroup()); 
            // InternalFPML.g:169:3: ( rule__ValueBlock__Group__0 )
            // InternalFPML.g:169:4: rule__ValueBlock__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ValueBlock__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getValueBlockAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValueBlock"


    // $ANTLR start "entryRuleEffectFullBlock"
    // InternalFPML.g:178:1: entryRuleEffectFullBlock : ruleEffectFullBlock EOF ;
    public final void entryRuleEffectFullBlock() throws RecognitionException {
        try {
            // InternalFPML.g:179:1: ( ruleEffectFullBlock EOF )
            // InternalFPML.g:180:1: ruleEffectFullBlock EOF
            {
             before(grammarAccess.getEffectFullBlockRule()); 
            pushFollow(FOLLOW_1);
            ruleEffectFullBlock();

            state._fsp--;

             after(grammarAccess.getEffectFullBlockRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEffectFullBlock"


    // $ANTLR start "ruleEffectFullBlock"
    // InternalFPML.g:187:1: ruleEffectFullBlock : ( ( rule__EffectFullBlock__Group__0 ) ) ;
    public final void ruleEffectFullBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:191:2: ( ( ( rule__EffectFullBlock__Group__0 ) ) )
            // InternalFPML.g:192:2: ( ( rule__EffectFullBlock__Group__0 ) )
            {
            // InternalFPML.g:192:2: ( ( rule__EffectFullBlock__Group__0 ) )
            // InternalFPML.g:193:3: ( rule__EffectFullBlock__Group__0 )
            {
             before(grammarAccess.getEffectFullBlockAccess().getGroup()); 
            // InternalFPML.g:194:3: ( rule__EffectFullBlock__Group__0 )
            // InternalFPML.g:194:4: rule__EffectFullBlock__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullBlock__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEffectFullBlockAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEffectFullBlock"


    // $ANTLR start "entryRuleData"
    // InternalFPML.g:203:1: entryRuleData : ruleData EOF ;
    public final void entryRuleData() throws RecognitionException {
        try {
            // InternalFPML.g:204:1: ( ruleData EOF )
            // InternalFPML.g:205:1: ruleData EOF
            {
             before(grammarAccess.getDataRule()); 
            pushFollow(FOLLOW_1);
            ruleData();

            state._fsp--;

             after(grammarAccess.getDataRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleData"


    // $ANTLR start "ruleData"
    // InternalFPML.g:212:1: ruleData : ( ( rule__Data__Group__0 ) ) ;
    public final void ruleData() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:216:2: ( ( ( rule__Data__Group__0 ) ) )
            // InternalFPML.g:217:2: ( ( rule__Data__Group__0 ) )
            {
            // InternalFPML.g:217:2: ( ( rule__Data__Group__0 ) )
            // InternalFPML.g:218:3: ( rule__Data__Group__0 )
            {
             before(grammarAccess.getDataAccess().getGroup()); 
            // InternalFPML.g:219:3: ( rule__Data__Group__0 )
            // InternalFPML.g:219:4: rule__Data__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Data__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleData"


    // $ANTLR start "entryRuleValue"
    // InternalFPML.g:228:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalFPML.g:229:1: ( ruleValue EOF )
            // InternalFPML.g:230:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalFPML.g:237:1: ruleValue : ( ( rule__Value__Group__0 ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:241:2: ( ( ( rule__Value__Group__0 ) ) )
            // InternalFPML.g:242:2: ( ( rule__Value__Group__0 ) )
            {
            // InternalFPML.g:242:2: ( ( rule__Value__Group__0 ) )
            // InternalFPML.g:243:3: ( rule__Value__Group__0 )
            {
             before(grammarAccess.getValueAccess().getGroup()); 
            // InternalFPML.g:244:3: ( rule__Value__Group__0 )
            // InternalFPML.g:244:4: rule__Value__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Value__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleAdtType"
    // InternalFPML.g:253:1: entryRuleAdtType : ruleAdtType EOF ;
    public final void entryRuleAdtType() throws RecognitionException {
        try {
            // InternalFPML.g:254:1: ( ruleAdtType EOF )
            // InternalFPML.g:255:1: ruleAdtType EOF
            {
             before(grammarAccess.getAdtTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleAdtType();

            state._fsp--;

             after(grammarAccess.getAdtTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAdtType"


    // $ANTLR start "ruleAdtType"
    // InternalFPML.g:262:1: ruleAdtType : ( ( rule__AdtType__Alternatives ) ) ;
    public final void ruleAdtType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:266:2: ( ( ( rule__AdtType__Alternatives ) ) )
            // InternalFPML.g:267:2: ( ( rule__AdtType__Alternatives ) )
            {
            // InternalFPML.g:267:2: ( ( rule__AdtType__Alternatives ) )
            // InternalFPML.g:268:3: ( rule__AdtType__Alternatives )
            {
             before(grammarAccess.getAdtTypeAccess().getAlternatives()); 
            // InternalFPML.g:269:3: ( rule__AdtType__Alternatives )
            // InternalFPML.g:269:4: rule__AdtType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AdtType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAdtTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAdtType"


    // $ANTLR start "entryRuleSumType"
    // InternalFPML.g:278:1: entryRuleSumType : ruleSumType EOF ;
    public final void entryRuleSumType() throws RecognitionException {
        try {
            // InternalFPML.g:279:1: ( ruleSumType EOF )
            // InternalFPML.g:280:1: ruleSumType EOF
            {
             before(grammarAccess.getSumTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleSumType();

            state._fsp--;

             after(grammarAccess.getSumTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSumType"


    // $ANTLR start "ruleSumType"
    // InternalFPML.g:287:1: ruleSumType : ( ( rule__SumType__Group__0 ) ) ;
    public final void ruleSumType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:291:2: ( ( ( rule__SumType__Group__0 ) ) )
            // InternalFPML.g:292:2: ( ( rule__SumType__Group__0 ) )
            {
            // InternalFPML.g:292:2: ( ( rule__SumType__Group__0 ) )
            // InternalFPML.g:293:3: ( rule__SumType__Group__0 )
            {
             before(grammarAccess.getSumTypeAccess().getGroup()); 
            // InternalFPML.g:294:3: ( rule__SumType__Group__0 )
            // InternalFPML.g:294:4: rule__SumType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SumType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSumTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSumType"


    // $ANTLR start "entryRuleProdType"
    // InternalFPML.g:303:1: entryRuleProdType : ruleProdType EOF ;
    public final void entryRuleProdType() throws RecognitionException {
        try {
            // InternalFPML.g:304:1: ( ruleProdType EOF )
            // InternalFPML.g:305:1: ruleProdType EOF
            {
             before(grammarAccess.getProdTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleProdType();

            state._fsp--;

             after(grammarAccess.getProdTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProdType"


    // $ANTLR start "ruleProdType"
    // InternalFPML.g:312:1: ruleProdType : ( ( rule__ProdType__Group__0 ) ) ;
    public final void ruleProdType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:316:2: ( ( ( rule__ProdType__Group__0 ) ) )
            // InternalFPML.g:317:2: ( ( rule__ProdType__Group__0 ) )
            {
            // InternalFPML.g:317:2: ( ( rule__ProdType__Group__0 ) )
            // InternalFPML.g:318:3: ( rule__ProdType__Group__0 )
            {
             before(grammarAccess.getProdTypeAccess().getGroup()); 
            // InternalFPML.g:319:3: ( rule__ProdType__Group__0 )
            // InternalFPML.g:319:4: rule__ProdType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ProdType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProdTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProdType"


    // $ANTLR start "entryRulePureFunctionDefinition"
    // InternalFPML.g:328:1: entryRulePureFunctionDefinition : rulePureFunctionDefinition EOF ;
    public final void entryRulePureFunctionDefinition() throws RecognitionException {
        try {
            // InternalFPML.g:329:1: ( rulePureFunctionDefinition EOF )
            // InternalFPML.g:330:1: rulePureFunctionDefinition EOF
            {
             before(grammarAccess.getPureFunctionDefinitionRule()); 
            pushFollow(FOLLOW_1);
            rulePureFunctionDefinition();

            state._fsp--;

             after(grammarAccess.getPureFunctionDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePureFunctionDefinition"


    // $ANTLR start "rulePureFunctionDefinition"
    // InternalFPML.g:337:1: rulePureFunctionDefinition : ( ( rule__PureFunctionDefinition__Group__0 ) ) ;
    public final void rulePureFunctionDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:341:2: ( ( ( rule__PureFunctionDefinition__Group__0 ) ) )
            // InternalFPML.g:342:2: ( ( rule__PureFunctionDefinition__Group__0 ) )
            {
            // InternalFPML.g:342:2: ( ( rule__PureFunctionDefinition__Group__0 ) )
            // InternalFPML.g:343:3: ( rule__PureFunctionDefinition__Group__0 )
            {
             before(grammarAccess.getPureFunctionDefinitionAccess().getGroup()); 
            // InternalFPML.g:344:3: ( rule__PureFunctionDefinition__Group__0 )
            // InternalFPML.g:344:4: rule__PureFunctionDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PureFunctionDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPureFunctionDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePureFunctionDefinition"


    // $ANTLR start "entryRuleEffectFullFunctionDefinition"
    // InternalFPML.g:353:1: entryRuleEffectFullFunctionDefinition : ruleEffectFullFunctionDefinition EOF ;
    public final void entryRuleEffectFullFunctionDefinition() throws RecognitionException {
        try {
            // InternalFPML.g:354:1: ( ruleEffectFullFunctionDefinition EOF )
            // InternalFPML.g:355:1: ruleEffectFullFunctionDefinition EOF
            {
             before(grammarAccess.getEffectFullFunctionDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleEffectFullFunctionDefinition();

            state._fsp--;

             after(grammarAccess.getEffectFullFunctionDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEffectFullFunctionDefinition"


    // $ANTLR start "ruleEffectFullFunctionDefinition"
    // InternalFPML.g:362:1: ruleEffectFullFunctionDefinition : ( ( rule__EffectFullFunctionDefinition__Group__0 ) ) ;
    public final void ruleEffectFullFunctionDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:366:2: ( ( ( rule__EffectFullFunctionDefinition__Group__0 ) ) )
            // InternalFPML.g:367:2: ( ( rule__EffectFullFunctionDefinition__Group__0 ) )
            {
            // InternalFPML.g:367:2: ( ( rule__EffectFullFunctionDefinition__Group__0 ) )
            // InternalFPML.g:368:3: ( rule__EffectFullFunctionDefinition__Group__0 )
            {
             before(grammarAccess.getEffectFullFunctionDefinitionAccess().getGroup()); 
            // InternalFPML.g:369:3: ( rule__EffectFullFunctionDefinition__Group__0 )
            // InternalFPML.g:369:4: rule__EffectFullFunctionDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullFunctionDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEffectFullFunctionDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEffectFullFunctionDefinition"


    // $ANTLR start "entryRuleMainFunc"
    // InternalFPML.g:378:1: entryRuleMainFunc : ruleMainFunc EOF ;
    public final void entryRuleMainFunc() throws RecognitionException {
        try {
            // InternalFPML.g:379:1: ( ruleMainFunc EOF )
            // InternalFPML.g:380:1: ruleMainFunc EOF
            {
             before(grammarAccess.getMainFuncRule()); 
            pushFollow(FOLLOW_1);
            ruleMainFunc();

            state._fsp--;

             after(grammarAccess.getMainFuncRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMainFunc"


    // $ANTLR start "ruleMainFunc"
    // InternalFPML.g:387:1: ruleMainFunc : ( ( rule__MainFunc__Group__0 ) ) ;
    public final void ruleMainFunc() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:391:2: ( ( ( rule__MainFunc__Group__0 ) ) )
            // InternalFPML.g:392:2: ( ( rule__MainFunc__Group__0 ) )
            {
            // InternalFPML.g:392:2: ( ( rule__MainFunc__Group__0 ) )
            // InternalFPML.g:393:3: ( rule__MainFunc__Group__0 )
            {
             before(grammarAccess.getMainFuncAccess().getGroup()); 
            // InternalFPML.g:394:3: ( rule__MainFunc__Group__0 )
            // InternalFPML.g:394:4: rule__MainFunc__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MainFunc__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMainFuncAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMainFunc"


    // $ANTLR start "entryRuleEffectFullArgument"
    // InternalFPML.g:403:1: entryRuleEffectFullArgument : ruleEffectFullArgument EOF ;
    public final void entryRuleEffectFullArgument() throws RecognitionException {
        try {
            // InternalFPML.g:404:1: ( ruleEffectFullArgument EOF )
            // InternalFPML.g:405:1: ruleEffectFullArgument EOF
            {
             before(grammarAccess.getEffectFullArgumentRule()); 
            pushFollow(FOLLOW_1);
            ruleEffectFullArgument();

            state._fsp--;

             after(grammarAccess.getEffectFullArgumentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEffectFullArgument"


    // $ANTLR start "ruleEffectFullArgument"
    // InternalFPML.g:412:1: ruleEffectFullArgument : ( ( rule__EffectFullArgument__Group__0 ) ) ;
    public final void ruleEffectFullArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:416:2: ( ( ( rule__EffectFullArgument__Group__0 ) ) )
            // InternalFPML.g:417:2: ( ( rule__EffectFullArgument__Group__0 ) )
            {
            // InternalFPML.g:417:2: ( ( rule__EffectFullArgument__Group__0 ) )
            // InternalFPML.g:418:3: ( rule__EffectFullArgument__Group__0 )
            {
             before(grammarAccess.getEffectFullArgumentAccess().getGroup()); 
            // InternalFPML.g:419:3: ( rule__EffectFullArgument__Group__0 )
            // InternalFPML.g:419:4: rule__EffectFullArgument__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullArgument__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEffectFullArgumentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEffectFullArgument"


    // $ANTLR start "entryRuleArgument"
    // InternalFPML.g:428:1: entryRuleArgument : ruleArgument EOF ;
    public final void entryRuleArgument() throws RecognitionException {
        try {
            // InternalFPML.g:429:1: ( ruleArgument EOF )
            // InternalFPML.g:430:1: ruleArgument EOF
            {
             before(grammarAccess.getArgumentRule()); 
            pushFollow(FOLLOW_1);
            ruleArgument();

            state._fsp--;

             after(grammarAccess.getArgumentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArgument"


    // $ANTLR start "ruleArgument"
    // InternalFPML.g:437:1: ruleArgument : ( ( rule__Argument__Group__0 ) ) ;
    public final void ruleArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:441:2: ( ( ( rule__Argument__Group__0 ) ) )
            // InternalFPML.g:442:2: ( ( rule__Argument__Group__0 ) )
            {
            // InternalFPML.g:442:2: ( ( rule__Argument__Group__0 ) )
            // InternalFPML.g:443:3: ( rule__Argument__Group__0 )
            {
             before(grammarAccess.getArgumentAccess().getGroup()); 
            // InternalFPML.g:444:3: ( rule__Argument__Group__0 )
            // InternalFPML.g:444:4: rule__Argument__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Argument__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArgumentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArgument"


    // $ANTLR start "entryRuleFunctionBodyPure"
    // InternalFPML.g:453:1: entryRuleFunctionBodyPure : ruleFunctionBodyPure EOF ;
    public final void entryRuleFunctionBodyPure() throws RecognitionException {
        try {
            // InternalFPML.g:454:1: ( ruleFunctionBodyPure EOF )
            // InternalFPML.g:455:1: ruleFunctionBodyPure EOF
            {
             before(grammarAccess.getFunctionBodyPureRule()); 
            pushFollow(FOLLOW_1);
            ruleFunctionBodyPure();

            state._fsp--;

             after(grammarAccess.getFunctionBodyPureRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFunctionBodyPure"


    // $ANTLR start "ruleFunctionBodyPure"
    // InternalFPML.g:462:1: ruleFunctionBodyPure : ( ( rule__FunctionBodyPure__Alternatives ) ) ;
    public final void ruleFunctionBodyPure() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:466:2: ( ( ( rule__FunctionBodyPure__Alternatives ) ) )
            // InternalFPML.g:467:2: ( ( rule__FunctionBodyPure__Alternatives ) )
            {
            // InternalFPML.g:467:2: ( ( rule__FunctionBodyPure__Alternatives ) )
            // InternalFPML.g:468:3: ( rule__FunctionBodyPure__Alternatives )
            {
             before(grammarAccess.getFunctionBodyPureAccess().getAlternatives()); 
            // InternalFPML.g:469:3: ( rule__FunctionBodyPure__Alternatives )
            // InternalFPML.g:469:4: rule__FunctionBodyPure__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FunctionBodyPure__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFunctionBodyPureAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunctionBodyPure"


    // $ANTLR start "entryRuleFunctionBodyEffectFull"
    // InternalFPML.g:478:1: entryRuleFunctionBodyEffectFull : ruleFunctionBodyEffectFull EOF ;
    public final void entryRuleFunctionBodyEffectFull() throws RecognitionException {
        try {
            // InternalFPML.g:479:1: ( ruleFunctionBodyEffectFull EOF )
            // InternalFPML.g:480:1: ruleFunctionBodyEffectFull EOF
            {
             before(grammarAccess.getFunctionBodyEffectFullRule()); 
            pushFollow(FOLLOW_1);
            ruleFunctionBodyEffectFull();

            state._fsp--;

             after(grammarAccess.getFunctionBodyEffectFullRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFunctionBodyEffectFull"


    // $ANTLR start "ruleFunctionBodyEffectFull"
    // InternalFPML.g:487:1: ruleFunctionBodyEffectFull : ( ( rule__FunctionBodyEffectFull__Alternatives ) ) ;
    public final void ruleFunctionBodyEffectFull() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:491:2: ( ( ( rule__FunctionBodyEffectFull__Alternatives ) ) )
            // InternalFPML.g:492:2: ( ( rule__FunctionBodyEffectFull__Alternatives ) )
            {
            // InternalFPML.g:492:2: ( ( rule__FunctionBodyEffectFull__Alternatives ) )
            // InternalFPML.g:493:3: ( rule__FunctionBodyEffectFull__Alternatives )
            {
             before(grammarAccess.getFunctionBodyEffectFullAccess().getAlternatives()); 
            // InternalFPML.g:494:3: ( rule__FunctionBodyEffectFull__Alternatives )
            // InternalFPML.g:494:4: rule__FunctionBodyEffectFull__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FunctionBodyEffectFull__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFunctionBodyEffectFullAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunctionBodyEffectFull"


    // $ANTLR start "entryRuleEmptyFunctionBody"
    // InternalFPML.g:503:1: entryRuleEmptyFunctionBody : ruleEmptyFunctionBody EOF ;
    public final void entryRuleEmptyFunctionBody() throws RecognitionException {
        try {
            // InternalFPML.g:504:1: ( ruleEmptyFunctionBody EOF )
            // InternalFPML.g:505:1: ruleEmptyFunctionBody EOF
            {
             before(grammarAccess.getEmptyFunctionBodyRule()); 
            pushFollow(FOLLOW_1);
            ruleEmptyFunctionBody();

            state._fsp--;

             after(grammarAccess.getEmptyFunctionBodyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEmptyFunctionBody"


    // $ANTLR start "ruleEmptyFunctionBody"
    // InternalFPML.g:512:1: ruleEmptyFunctionBody : ( ( rule__EmptyFunctionBody__Group__0 ) ) ;
    public final void ruleEmptyFunctionBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:516:2: ( ( ( rule__EmptyFunctionBody__Group__0 ) ) )
            // InternalFPML.g:517:2: ( ( rule__EmptyFunctionBody__Group__0 ) )
            {
            // InternalFPML.g:517:2: ( ( rule__EmptyFunctionBody__Group__0 ) )
            // InternalFPML.g:518:3: ( rule__EmptyFunctionBody__Group__0 )
            {
             before(grammarAccess.getEmptyFunctionBodyAccess().getGroup()); 
            // InternalFPML.g:519:3: ( rule__EmptyFunctionBody__Group__0 )
            // InternalFPML.g:519:4: rule__EmptyFunctionBody__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EmptyFunctionBody__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEmptyFunctionBodyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEmptyFunctionBody"


    // $ANTLR start "entryRuleCompositionFunctionBodyPure"
    // InternalFPML.g:528:1: entryRuleCompositionFunctionBodyPure : ruleCompositionFunctionBodyPure EOF ;
    public final void entryRuleCompositionFunctionBodyPure() throws RecognitionException {
        try {
            // InternalFPML.g:529:1: ( ruleCompositionFunctionBodyPure EOF )
            // InternalFPML.g:530:1: ruleCompositionFunctionBodyPure EOF
            {
             before(grammarAccess.getCompositionFunctionBodyPureRule()); 
            pushFollow(FOLLOW_1);
            ruleCompositionFunctionBodyPure();

            state._fsp--;

             after(grammarAccess.getCompositionFunctionBodyPureRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCompositionFunctionBodyPure"


    // $ANTLR start "ruleCompositionFunctionBodyPure"
    // InternalFPML.g:537:1: ruleCompositionFunctionBodyPure : ( ( rule__CompositionFunctionBodyPure__Alternatives ) ) ;
    public final void ruleCompositionFunctionBodyPure() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:541:2: ( ( ( rule__CompositionFunctionBodyPure__Alternatives ) ) )
            // InternalFPML.g:542:2: ( ( rule__CompositionFunctionBodyPure__Alternatives ) )
            {
            // InternalFPML.g:542:2: ( ( rule__CompositionFunctionBodyPure__Alternatives ) )
            // InternalFPML.g:543:3: ( rule__CompositionFunctionBodyPure__Alternatives )
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getAlternatives()); 
            // InternalFPML.g:544:3: ( rule__CompositionFunctionBodyPure__Alternatives )
            // InternalFPML.g:544:4: rule__CompositionFunctionBodyPure__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CompositionFunctionBodyPure__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCompositionFunctionBodyPureAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompositionFunctionBodyPure"


    // $ANTLR start "entryRuleCompositionFunctionBodyPureFactor"
    // InternalFPML.g:553:1: entryRuleCompositionFunctionBodyPureFactor : ruleCompositionFunctionBodyPureFactor EOF ;
    public final void entryRuleCompositionFunctionBodyPureFactor() throws RecognitionException {
        try {
            // InternalFPML.g:554:1: ( ruleCompositionFunctionBodyPureFactor EOF )
            // InternalFPML.g:555:1: ruleCompositionFunctionBodyPureFactor EOF
            {
             before(grammarAccess.getCompositionFunctionBodyPureFactorRule()); 
            pushFollow(FOLLOW_1);
            ruleCompositionFunctionBodyPureFactor();

            state._fsp--;

             after(grammarAccess.getCompositionFunctionBodyPureFactorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCompositionFunctionBodyPureFactor"


    // $ANTLR start "ruleCompositionFunctionBodyPureFactor"
    // InternalFPML.g:562:1: ruleCompositionFunctionBodyPureFactor : ( ( rule__CompositionFunctionBodyPureFactor__Alternatives ) ) ;
    public final void ruleCompositionFunctionBodyPureFactor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:566:2: ( ( ( rule__CompositionFunctionBodyPureFactor__Alternatives ) ) )
            // InternalFPML.g:567:2: ( ( rule__CompositionFunctionBodyPureFactor__Alternatives ) )
            {
            // InternalFPML.g:567:2: ( ( rule__CompositionFunctionBodyPureFactor__Alternatives ) )
            // InternalFPML.g:568:3: ( rule__CompositionFunctionBodyPureFactor__Alternatives )
            {
             before(grammarAccess.getCompositionFunctionBodyPureFactorAccess().getAlternatives()); 
            // InternalFPML.g:569:3: ( rule__CompositionFunctionBodyPureFactor__Alternatives )
            // InternalFPML.g:569:4: rule__CompositionFunctionBodyPureFactor__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CompositionFunctionBodyPureFactor__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCompositionFunctionBodyPureFactorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompositionFunctionBodyPureFactor"


    // $ANTLR start "entryRuleCompositionFunctionBodyEffect"
    // InternalFPML.g:578:1: entryRuleCompositionFunctionBodyEffect : ruleCompositionFunctionBodyEffect EOF ;
    public final void entryRuleCompositionFunctionBodyEffect() throws RecognitionException {
        try {
            // InternalFPML.g:579:1: ( ruleCompositionFunctionBodyEffect EOF )
            // InternalFPML.g:580:1: ruleCompositionFunctionBodyEffect EOF
            {
             before(grammarAccess.getCompositionFunctionBodyEffectRule()); 
            pushFollow(FOLLOW_1);
            ruleCompositionFunctionBodyEffect();

            state._fsp--;

             after(grammarAccess.getCompositionFunctionBodyEffectRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCompositionFunctionBodyEffect"


    // $ANTLR start "ruleCompositionFunctionBodyEffect"
    // InternalFPML.g:587:1: ruleCompositionFunctionBodyEffect : ( ( rule__CompositionFunctionBodyEffect__Alternatives ) ) ;
    public final void ruleCompositionFunctionBodyEffect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:591:2: ( ( ( rule__CompositionFunctionBodyEffect__Alternatives ) ) )
            // InternalFPML.g:592:2: ( ( rule__CompositionFunctionBodyEffect__Alternatives ) )
            {
            // InternalFPML.g:592:2: ( ( rule__CompositionFunctionBodyEffect__Alternatives ) )
            // InternalFPML.g:593:3: ( rule__CompositionFunctionBodyEffect__Alternatives )
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getAlternatives()); 
            // InternalFPML.g:594:3: ( rule__CompositionFunctionBodyEffect__Alternatives )
            // InternalFPML.g:594:4: rule__CompositionFunctionBodyEffect__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CompositionFunctionBodyEffect__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCompositionFunctionBodyEffectAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompositionFunctionBodyEffect"


    // $ANTLR start "entryRuleCompositionFunctionBodyEffectFullFactor"
    // InternalFPML.g:603:1: entryRuleCompositionFunctionBodyEffectFullFactor : ruleCompositionFunctionBodyEffectFullFactor EOF ;
    public final void entryRuleCompositionFunctionBodyEffectFullFactor() throws RecognitionException {
        try {
            // InternalFPML.g:604:1: ( ruleCompositionFunctionBodyEffectFullFactor EOF )
            // InternalFPML.g:605:1: ruleCompositionFunctionBodyEffectFullFactor EOF
            {
             before(grammarAccess.getCompositionFunctionBodyEffectFullFactorRule()); 
            pushFollow(FOLLOW_1);
            ruleCompositionFunctionBodyEffectFullFactor();

            state._fsp--;

             after(grammarAccess.getCompositionFunctionBodyEffectFullFactorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCompositionFunctionBodyEffectFullFactor"


    // $ANTLR start "ruleCompositionFunctionBodyEffectFullFactor"
    // InternalFPML.g:612:1: ruleCompositionFunctionBodyEffectFullFactor : ( ( rule__CompositionFunctionBodyEffectFullFactor__Alternatives ) ) ;
    public final void ruleCompositionFunctionBodyEffectFullFactor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:616:2: ( ( ( rule__CompositionFunctionBodyEffectFullFactor__Alternatives ) ) )
            // InternalFPML.g:617:2: ( ( rule__CompositionFunctionBodyEffectFullFactor__Alternatives ) )
            {
            // InternalFPML.g:617:2: ( ( rule__CompositionFunctionBodyEffectFullFactor__Alternatives ) )
            // InternalFPML.g:618:3: ( rule__CompositionFunctionBodyEffectFullFactor__Alternatives )
            {
             before(grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getAlternatives()); 
            // InternalFPML.g:619:3: ( rule__CompositionFunctionBodyEffectFullFactor__Alternatives )
            // InternalFPML.g:619:4: rule__CompositionFunctionBodyEffectFullFactor__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CompositionFunctionBodyEffectFullFactor__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompositionFunctionBodyEffectFullFactor"


    // $ANTLR start "entryRuleReturnPureFunction"
    // InternalFPML.g:628:1: entryRuleReturnPureFunction : ruleReturnPureFunction EOF ;
    public final void entryRuleReturnPureFunction() throws RecognitionException {
        try {
            // InternalFPML.g:629:1: ( ruleReturnPureFunction EOF )
            // InternalFPML.g:630:1: ruleReturnPureFunction EOF
            {
             before(grammarAccess.getReturnPureFunctionRule()); 
            pushFollow(FOLLOW_1);
            ruleReturnPureFunction();

            state._fsp--;

             after(grammarAccess.getReturnPureFunctionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReturnPureFunction"


    // $ANTLR start "ruleReturnPureFunction"
    // InternalFPML.g:637:1: ruleReturnPureFunction : ( ( rule__ReturnPureFunction__Group__0 ) ) ;
    public final void ruleReturnPureFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:641:2: ( ( ( rule__ReturnPureFunction__Group__0 ) ) )
            // InternalFPML.g:642:2: ( ( rule__ReturnPureFunction__Group__0 ) )
            {
            // InternalFPML.g:642:2: ( ( rule__ReturnPureFunction__Group__0 ) )
            // InternalFPML.g:643:3: ( rule__ReturnPureFunction__Group__0 )
            {
             before(grammarAccess.getReturnPureFunctionAccess().getGroup()); 
            // InternalFPML.g:644:3: ( rule__ReturnPureFunction__Group__0 )
            // InternalFPML.g:644:4: rule__ReturnPureFunction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReturnPureFunction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReturnPureFunctionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReturnPureFunction"


    // $ANTLR start "entryRuleReturnEffectFullFunction"
    // InternalFPML.g:653:1: entryRuleReturnEffectFullFunction : ruleReturnEffectFullFunction EOF ;
    public final void entryRuleReturnEffectFullFunction() throws RecognitionException {
        try {
            // InternalFPML.g:654:1: ( ruleReturnEffectFullFunction EOF )
            // InternalFPML.g:655:1: ruleReturnEffectFullFunction EOF
            {
             before(grammarAccess.getReturnEffectFullFunctionRule()); 
            pushFollow(FOLLOW_1);
            ruleReturnEffectFullFunction();

            state._fsp--;

             after(grammarAccess.getReturnEffectFullFunctionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReturnEffectFullFunction"


    // $ANTLR start "ruleReturnEffectFullFunction"
    // InternalFPML.g:662:1: ruleReturnEffectFullFunction : ( ( rule__ReturnEffectFullFunction__Group__0 ) ) ;
    public final void ruleReturnEffectFullFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:666:2: ( ( ( rule__ReturnEffectFullFunction__Group__0 ) ) )
            // InternalFPML.g:667:2: ( ( rule__ReturnEffectFullFunction__Group__0 ) )
            {
            // InternalFPML.g:667:2: ( ( rule__ReturnEffectFullFunction__Group__0 ) )
            // InternalFPML.g:668:3: ( rule__ReturnEffectFullFunction__Group__0 )
            {
             before(grammarAccess.getReturnEffectFullFunctionAccess().getGroup()); 
            // InternalFPML.g:669:3: ( rule__ReturnEffectFullFunction__Group__0 )
            // InternalFPML.g:669:4: rule__ReturnEffectFullFunction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReturnEffectFullFunction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReturnEffectFullFunctionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReturnEffectFullFunction"


    // $ANTLR start "entryRuleIOType"
    // InternalFPML.g:678:1: entryRuleIOType : ruleIOType EOF ;
    public final void entryRuleIOType() throws RecognitionException {
        try {
            // InternalFPML.g:679:1: ( ruleIOType EOF )
            // InternalFPML.g:680:1: ruleIOType EOF
            {
             before(grammarAccess.getIOTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleIOType();

            state._fsp--;

             after(grammarAccess.getIOTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIOType"


    // $ANTLR start "ruleIOType"
    // InternalFPML.g:687:1: ruleIOType : ( ( rule__IOType__Group__0 ) ) ;
    public final void ruleIOType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:691:2: ( ( ( rule__IOType__Group__0 ) ) )
            // InternalFPML.g:692:2: ( ( rule__IOType__Group__0 ) )
            {
            // InternalFPML.g:692:2: ( ( rule__IOType__Group__0 ) )
            // InternalFPML.g:693:3: ( rule__IOType__Group__0 )
            {
             before(grammarAccess.getIOTypeAccess().getGroup()); 
            // InternalFPML.g:694:3: ( rule__IOType__Group__0 )
            // InternalFPML.g:694:4: rule__IOType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IOType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIOTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIOType"


    // $ANTLR start "entryRuleValueType"
    // InternalFPML.g:703:1: entryRuleValueType : ruleValueType EOF ;
    public final void entryRuleValueType() throws RecognitionException {
        try {
            // InternalFPML.g:704:1: ( ruleValueType EOF )
            // InternalFPML.g:705:1: ruleValueType EOF
            {
             before(grammarAccess.getValueTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleValueType();

            state._fsp--;

             after(grammarAccess.getValueTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValueType"


    // $ANTLR start "ruleValueType"
    // InternalFPML.g:712:1: ruleValueType : ( ( rule__ValueType__Alternatives ) ) ;
    public final void ruleValueType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:716:2: ( ( ( rule__ValueType__Alternatives ) ) )
            // InternalFPML.g:717:2: ( ( rule__ValueType__Alternatives ) )
            {
            // InternalFPML.g:717:2: ( ( rule__ValueType__Alternatives ) )
            // InternalFPML.g:718:3: ( rule__ValueType__Alternatives )
            {
             before(grammarAccess.getValueTypeAccess().getAlternatives()); 
            // InternalFPML.g:719:3: ( rule__ValueType__Alternatives )
            // InternalFPML.g:719:4: rule__ValueType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ValueType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValueType"


    // $ANTLR start "entryRuleType"
    // InternalFPML.g:728:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalFPML.g:729:1: ( ruleType EOF )
            // InternalFPML.g:730:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalFPML.g:737:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:741:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalFPML.g:742:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalFPML.g:742:2: ( ( rule__Type__Alternatives ) )
            // InternalFPML.g:743:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalFPML.g:744:3: ( rule__Type__Alternatives )
            // InternalFPML.g:744:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleIntegerType"
    // InternalFPML.g:753:1: entryRuleIntegerType : ruleIntegerType EOF ;
    public final void entryRuleIntegerType() throws RecognitionException {
        try {
            // InternalFPML.g:754:1: ( ruleIntegerType EOF )
            // InternalFPML.g:755:1: ruleIntegerType EOF
            {
             before(grammarAccess.getIntegerTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleIntegerType();

            state._fsp--;

             after(grammarAccess.getIntegerTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntegerType"


    // $ANTLR start "ruleIntegerType"
    // InternalFPML.g:762:1: ruleIntegerType : ( ( rule__IntegerType__Group__0 ) ) ;
    public final void ruleIntegerType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:766:2: ( ( ( rule__IntegerType__Group__0 ) ) )
            // InternalFPML.g:767:2: ( ( rule__IntegerType__Group__0 ) )
            {
            // InternalFPML.g:767:2: ( ( rule__IntegerType__Group__0 ) )
            // InternalFPML.g:768:3: ( rule__IntegerType__Group__0 )
            {
             before(grammarAccess.getIntegerTypeAccess().getGroup()); 
            // InternalFPML.g:769:3: ( rule__IntegerType__Group__0 )
            // InternalFPML.g:769:4: rule__IntegerType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IntegerType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntegerTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntegerType"


    // $ANTLR start "entryRuleStringType"
    // InternalFPML.g:778:1: entryRuleStringType : ruleStringType EOF ;
    public final void entryRuleStringType() throws RecognitionException {
        try {
            // InternalFPML.g:779:1: ( ruleStringType EOF )
            // InternalFPML.g:780:1: ruleStringType EOF
            {
             before(grammarAccess.getStringTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleStringType();

            state._fsp--;

             after(grammarAccess.getStringTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringType"


    // $ANTLR start "ruleStringType"
    // InternalFPML.g:787:1: ruleStringType : ( ( rule__StringType__Group__0 ) ) ;
    public final void ruleStringType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:791:2: ( ( ( rule__StringType__Group__0 ) ) )
            // InternalFPML.g:792:2: ( ( rule__StringType__Group__0 ) )
            {
            // InternalFPML.g:792:2: ( ( rule__StringType__Group__0 ) )
            // InternalFPML.g:793:3: ( rule__StringType__Group__0 )
            {
             before(grammarAccess.getStringTypeAccess().getGroup()); 
            // InternalFPML.g:794:3: ( rule__StringType__Group__0 )
            // InternalFPML.g:794:4: rule__StringType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StringType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringType"


    // $ANTLR start "entryRuleUnitType"
    // InternalFPML.g:803:1: entryRuleUnitType : ruleUnitType EOF ;
    public final void entryRuleUnitType() throws RecognitionException {
        try {
            // InternalFPML.g:804:1: ( ruleUnitType EOF )
            // InternalFPML.g:805:1: ruleUnitType EOF
            {
             before(grammarAccess.getUnitTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleUnitType();

            state._fsp--;

             after(grammarAccess.getUnitTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnitType"


    // $ANTLR start "ruleUnitType"
    // InternalFPML.g:812:1: ruleUnitType : ( ( rule__UnitType__Group__0 ) ) ;
    public final void ruleUnitType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:816:2: ( ( ( rule__UnitType__Group__0 ) ) )
            // InternalFPML.g:817:2: ( ( rule__UnitType__Group__0 ) )
            {
            // InternalFPML.g:817:2: ( ( rule__UnitType__Group__0 ) )
            // InternalFPML.g:818:3: ( rule__UnitType__Group__0 )
            {
             before(grammarAccess.getUnitTypeAccess().getGroup()); 
            // InternalFPML.g:819:3: ( rule__UnitType__Group__0 )
            // InternalFPML.g:819:4: rule__UnitType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UnitType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUnitTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnitType"


    // $ANTLR start "entryRuleDataType"
    // InternalFPML.g:828:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // InternalFPML.g:829:1: ( ruleDataType EOF )
            // InternalFPML.g:830:1: ruleDataType EOF
            {
             before(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getDataTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalFPML.g:837:1: ruleDataType : ( ( rule__DataType__Group__0 ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:841:2: ( ( ( rule__DataType__Group__0 ) ) )
            // InternalFPML.g:842:2: ( ( rule__DataType__Group__0 ) )
            {
            // InternalFPML.g:842:2: ( ( rule__DataType__Group__0 ) )
            // InternalFPML.g:843:3: ( rule__DataType__Group__0 )
            {
             before(grammarAccess.getDataTypeAccess().getGroup()); 
            // InternalFPML.g:844:3: ( rule__DataType__Group__0 )
            // InternalFPML.g:844:4: rule__DataType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRulePureFunctionType"
    // InternalFPML.g:853:1: entryRulePureFunctionType : rulePureFunctionType EOF ;
    public final void entryRulePureFunctionType() throws RecognitionException {
        try {
            // InternalFPML.g:854:1: ( rulePureFunctionType EOF )
            // InternalFPML.g:855:1: rulePureFunctionType EOF
            {
             before(grammarAccess.getPureFunctionTypeRule()); 
            pushFollow(FOLLOW_1);
            rulePureFunctionType();

            state._fsp--;

             after(grammarAccess.getPureFunctionTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePureFunctionType"


    // $ANTLR start "rulePureFunctionType"
    // InternalFPML.g:862:1: rulePureFunctionType : ( ( rule__PureFunctionType__Group__0 ) ) ;
    public final void rulePureFunctionType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:866:2: ( ( ( rule__PureFunctionType__Group__0 ) ) )
            // InternalFPML.g:867:2: ( ( rule__PureFunctionType__Group__0 ) )
            {
            // InternalFPML.g:867:2: ( ( rule__PureFunctionType__Group__0 ) )
            // InternalFPML.g:868:3: ( rule__PureFunctionType__Group__0 )
            {
             before(grammarAccess.getPureFunctionTypeAccess().getGroup()); 
            // InternalFPML.g:869:3: ( rule__PureFunctionType__Group__0 )
            // InternalFPML.g:869:4: rule__PureFunctionType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PureFunctionType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPureFunctionTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePureFunctionType"


    // $ANTLR start "entryRuleEffectFullFunctionType"
    // InternalFPML.g:878:1: entryRuleEffectFullFunctionType : ruleEffectFullFunctionType EOF ;
    public final void entryRuleEffectFullFunctionType() throws RecognitionException {
        try {
            // InternalFPML.g:879:1: ( ruleEffectFullFunctionType EOF )
            // InternalFPML.g:880:1: ruleEffectFullFunctionType EOF
            {
             before(grammarAccess.getEffectFullFunctionTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleEffectFullFunctionType();

            state._fsp--;

             after(grammarAccess.getEffectFullFunctionTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEffectFullFunctionType"


    // $ANTLR start "ruleEffectFullFunctionType"
    // InternalFPML.g:887:1: ruleEffectFullFunctionType : ( ( rule__EffectFullFunctionType__Group__0 ) ) ;
    public final void ruleEffectFullFunctionType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:891:2: ( ( ( rule__EffectFullFunctionType__Group__0 ) ) )
            // InternalFPML.g:892:2: ( ( rule__EffectFullFunctionType__Group__0 ) )
            {
            // InternalFPML.g:892:2: ( ( rule__EffectFullFunctionType__Group__0 ) )
            // InternalFPML.g:893:3: ( rule__EffectFullFunctionType__Group__0 )
            {
             before(grammarAccess.getEffectFullFunctionTypeAccess().getGroup()); 
            // InternalFPML.g:894:3: ( rule__EffectFullFunctionType__Group__0 )
            // InternalFPML.g:894:4: rule__EffectFullFunctionType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullFunctionType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEffectFullFunctionTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEffectFullFunctionType"


    // $ANTLR start "entryRuleExpression"
    // InternalFPML.g:903:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalFPML.g:904:1: ( ruleExpression EOF )
            // InternalFPML.g:905:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalFPML.g:912:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:916:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalFPML.g:917:2: ( ( rule__Expression__Alternatives ) )
            {
            // InternalFPML.g:917:2: ( ( rule__Expression__Alternatives ) )
            // InternalFPML.g:918:3: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // InternalFPML.g:919:3: ( rule__Expression__Alternatives )
            // InternalFPML.g:919:4: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleIntValue"
    // InternalFPML.g:928:1: entryRuleIntValue : ruleIntValue EOF ;
    public final void entryRuleIntValue() throws RecognitionException {
        try {
            // InternalFPML.g:929:1: ( ruleIntValue EOF )
            // InternalFPML.g:930:1: ruleIntValue EOF
            {
             before(grammarAccess.getIntValueRule()); 
            pushFollow(FOLLOW_1);
            ruleIntValue();

            state._fsp--;

             after(grammarAccess.getIntValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntValue"


    // $ANTLR start "ruleIntValue"
    // InternalFPML.g:937:1: ruleIntValue : ( ( rule__IntValue__Group__0 ) ) ;
    public final void ruleIntValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:941:2: ( ( ( rule__IntValue__Group__0 ) ) )
            // InternalFPML.g:942:2: ( ( rule__IntValue__Group__0 ) )
            {
            // InternalFPML.g:942:2: ( ( rule__IntValue__Group__0 ) )
            // InternalFPML.g:943:3: ( rule__IntValue__Group__0 )
            {
             before(grammarAccess.getIntValueAccess().getGroup()); 
            // InternalFPML.g:944:3: ( rule__IntValue__Group__0 )
            // InternalFPML.g:944:4: rule__IntValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IntValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntValue"


    // $ANTLR start "entryRuleStringValue"
    // InternalFPML.g:953:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // InternalFPML.g:954:1: ( ruleStringValue EOF )
            // InternalFPML.g:955:1: ruleStringValue EOF
            {
             before(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_1);
            ruleStringValue();

            state._fsp--;

             after(grammarAccess.getStringValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // InternalFPML.g:962:1: ruleStringValue : ( ( rule__StringValue__Group__0 ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:966:2: ( ( ( rule__StringValue__Group__0 ) ) )
            // InternalFPML.g:967:2: ( ( rule__StringValue__Group__0 ) )
            {
            // InternalFPML.g:967:2: ( ( rule__StringValue__Group__0 ) )
            // InternalFPML.g:968:3: ( rule__StringValue__Group__0 )
            {
             before(grammarAccess.getStringValueAccess().getGroup()); 
            // InternalFPML.g:969:3: ( rule__StringValue__Group__0 )
            // InternalFPML.g:969:4: rule__StringValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StringValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleUnitValue"
    // InternalFPML.g:978:1: entryRuleUnitValue : ruleUnitValue EOF ;
    public final void entryRuleUnitValue() throws RecognitionException {
        try {
            // InternalFPML.g:979:1: ( ruleUnitValue EOF )
            // InternalFPML.g:980:1: ruleUnitValue EOF
            {
             before(grammarAccess.getUnitValueRule()); 
            pushFollow(FOLLOW_1);
            ruleUnitValue();

            state._fsp--;

             after(grammarAccess.getUnitValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnitValue"


    // $ANTLR start "ruleUnitValue"
    // InternalFPML.g:987:1: ruleUnitValue : ( ( rule__UnitValue__Group__0 ) ) ;
    public final void ruleUnitValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:991:2: ( ( ( rule__UnitValue__Group__0 ) ) )
            // InternalFPML.g:992:2: ( ( rule__UnitValue__Group__0 ) )
            {
            // InternalFPML.g:992:2: ( ( rule__UnitValue__Group__0 ) )
            // InternalFPML.g:993:3: ( rule__UnitValue__Group__0 )
            {
             before(grammarAccess.getUnitValueAccess().getGroup()); 
            // InternalFPML.g:994:3: ( rule__UnitValue__Group__0 )
            // InternalFPML.g:994:4: rule__UnitValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UnitValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUnitValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnitValue"


    // $ANTLR start "entryRuleFunctionValue"
    // InternalFPML.g:1003:1: entryRuleFunctionValue : ruleFunctionValue EOF ;
    public final void entryRuleFunctionValue() throws RecognitionException {
        try {
            // InternalFPML.g:1004:1: ( ruleFunctionValue EOF )
            // InternalFPML.g:1005:1: ruleFunctionValue EOF
            {
             before(grammarAccess.getFunctionValueRule()); 
            pushFollow(FOLLOW_1);
            ruleFunctionValue();

            state._fsp--;

             after(grammarAccess.getFunctionValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFunctionValue"


    // $ANTLR start "ruleFunctionValue"
    // InternalFPML.g:1012:1: ruleFunctionValue : ( ( rule__FunctionValue__ValueAssignment ) ) ;
    public final void ruleFunctionValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1016:2: ( ( ( rule__FunctionValue__ValueAssignment ) ) )
            // InternalFPML.g:1017:2: ( ( rule__FunctionValue__ValueAssignment ) )
            {
            // InternalFPML.g:1017:2: ( ( rule__FunctionValue__ValueAssignment ) )
            // InternalFPML.g:1018:3: ( rule__FunctionValue__ValueAssignment )
            {
             before(grammarAccess.getFunctionValueAccess().getValueAssignment()); 
            // InternalFPML.g:1019:3: ( rule__FunctionValue__ValueAssignment )
            // InternalFPML.g:1019:4: rule__FunctionValue__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__FunctionValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getFunctionValueAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunctionValue"


    // $ANTLR start "entryRuleDataValue"
    // InternalFPML.g:1028:1: entryRuleDataValue : ruleDataValue EOF ;
    public final void entryRuleDataValue() throws RecognitionException {
        try {
            // InternalFPML.g:1029:1: ( ruleDataValue EOF )
            // InternalFPML.g:1030:1: ruleDataValue EOF
            {
             before(grammarAccess.getDataValueRule()); 
            pushFollow(FOLLOW_1);
            ruleDataValue();

            state._fsp--;

             after(grammarAccess.getDataValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDataValue"


    // $ANTLR start "ruleDataValue"
    // InternalFPML.g:1037:1: ruleDataValue : ( ( rule__DataValue__Group__0 ) ) ;
    public final void ruleDataValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1041:2: ( ( ( rule__DataValue__Group__0 ) ) )
            // InternalFPML.g:1042:2: ( ( rule__DataValue__Group__0 ) )
            {
            // InternalFPML.g:1042:2: ( ( rule__DataValue__Group__0 ) )
            // InternalFPML.g:1043:3: ( rule__DataValue__Group__0 )
            {
             before(grammarAccess.getDataValueAccess().getGroup()); 
            // InternalFPML.g:1044:3: ( rule__DataValue__Group__0 )
            // InternalFPML.g:1044:4: rule__DataValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataValue"


    // $ANTLR start "entryRuleValueRef"
    // InternalFPML.g:1053:1: entryRuleValueRef : ruleValueRef EOF ;
    public final void entryRuleValueRef() throws RecognitionException {
        try {
            // InternalFPML.g:1054:1: ( ruleValueRef EOF )
            // InternalFPML.g:1055:1: ruleValueRef EOF
            {
             before(grammarAccess.getValueRefRule()); 
            pushFollow(FOLLOW_1);
            ruleValueRef();

            state._fsp--;

             after(grammarAccess.getValueRefRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValueRef"


    // $ANTLR start "ruleValueRef"
    // InternalFPML.g:1062:1: ruleValueRef : ( ( rule__ValueRef__Group__0 ) ) ;
    public final void ruleValueRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1066:2: ( ( ( rule__ValueRef__Group__0 ) ) )
            // InternalFPML.g:1067:2: ( ( rule__ValueRef__Group__0 ) )
            {
            // InternalFPML.g:1067:2: ( ( rule__ValueRef__Group__0 ) )
            // InternalFPML.g:1068:3: ( rule__ValueRef__Group__0 )
            {
             before(grammarAccess.getValueRefAccess().getGroup()); 
            // InternalFPML.g:1069:3: ( rule__ValueRef__Group__0 )
            // InternalFPML.g:1069:4: rule__ValueRef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ValueRef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getValueRefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValueRef"


    // $ANTLR start "entryRulePureLambda"
    // InternalFPML.g:1078:1: entryRulePureLambda : rulePureLambda EOF ;
    public final void entryRulePureLambda() throws RecognitionException {
        try {
            // InternalFPML.g:1079:1: ( rulePureLambda EOF )
            // InternalFPML.g:1080:1: rulePureLambda EOF
            {
             before(grammarAccess.getPureLambdaRule()); 
            pushFollow(FOLLOW_1);
            rulePureLambda();

            state._fsp--;

             after(grammarAccess.getPureLambdaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePureLambda"


    // $ANTLR start "rulePureLambda"
    // InternalFPML.g:1087:1: rulePureLambda : ( ( rule__PureLambda__Group__0 ) ) ;
    public final void rulePureLambda() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1091:2: ( ( ( rule__PureLambda__Group__0 ) ) )
            // InternalFPML.g:1092:2: ( ( rule__PureLambda__Group__0 ) )
            {
            // InternalFPML.g:1092:2: ( ( rule__PureLambda__Group__0 ) )
            // InternalFPML.g:1093:3: ( rule__PureLambda__Group__0 )
            {
             before(grammarAccess.getPureLambdaAccess().getGroup()); 
            // InternalFPML.g:1094:3: ( rule__PureLambda__Group__0 )
            // InternalFPML.g:1094:4: rule__PureLambda__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PureLambda__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPureLambdaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePureLambda"


    // $ANTLR start "entryRuleEffectFullLambda"
    // InternalFPML.g:1103:1: entryRuleEffectFullLambda : ruleEffectFullLambda EOF ;
    public final void entryRuleEffectFullLambda() throws RecognitionException {
        try {
            // InternalFPML.g:1104:1: ( ruleEffectFullLambda EOF )
            // InternalFPML.g:1105:1: ruleEffectFullLambda EOF
            {
             before(grammarAccess.getEffectFullLambdaRule()); 
            pushFollow(FOLLOW_1);
            ruleEffectFullLambda();

            state._fsp--;

             after(grammarAccess.getEffectFullLambdaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEffectFullLambda"


    // $ANTLR start "ruleEffectFullLambda"
    // InternalFPML.g:1112:1: ruleEffectFullLambda : ( ( rule__EffectFullLambda__Group__0 ) ) ;
    public final void ruleEffectFullLambda() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1116:2: ( ( ( rule__EffectFullLambda__Group__0 ) ) )
            // InternalFPML.g:1117:2: ( ( rule__EffectFullLambda__Group__0 ) )
            {
            // InternalFPML.g:1117:2: ( ( rule__EffectFullLambda__Group__0 ) )
            // InternalFPML.g:1118:3: ( rule__EffectFullLambda__Group__0 )
            {
             before(grammarAccess.getEffectFullLambdaAccess().getGroup()); 
            // InternalFPML.g:1119:3: ( rule__EffectFullLambda__Group__0 )
            // InternalFPML.g:1119:4: rule__EffectFullLambda__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullLambda__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEffectFullLambdaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEffectFullLambda"


    // $ANTLR start "entryRuleAdtValue"
    // InternalFPML.g:1128:1: entryRuleAdtValue : ruleAdtValue EOF ;
    public final void entryRuleAdtValue() throws RecognitionException {
        try {
            // InternalFPML.g:1129:1: ( ruleAdtValue EOF )
            // InternalFPML.g:1130:1: ruleAdtValue EOF
            {
             before(grammarAccess.getAdtValueRule()); 
            pushFollow(FOLLOW_1);
            ruleAdtValue();

            state._fsp--;

             after(grammarAccess.getAdtValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAdtValue"


    // $ANTLR start "ruleAdtValue"
    // InternalFPML.g:1137:1: ruleAdtValue : ( ( rule__AdtValue__Alternatives ) ) ;
    public final void ruleAdtValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1141:2: ( ( ( rule__AdtValue__Alternatives ) ) )
            // InternalFPML.g:1142:2: ( ( rule__AdtValue__Alternatives ) )
            {
            // InternalFPML.g:1142:2: ( ( rule__AdtValue__Alternatives ) )
            // InternalFPML.g:1143:3: ( rule__AdtValue__Alternatives )
            {
             before(grammarAccess.getAdtValueAccess().getAlternatives()); 
            // InternalFPML.g:1144:3: ( rule__AdtValue__Alternatives )
            // InternalFPML.g:1144:4: rule__AdtValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AdtValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAdtValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAdtValue"


    // $ANTLR start "entryRuleProdValue"
    // InternalFPML.g:1153:1: entryRuleProdValue : ruleProdValue EOF ;
    public final void entryRuleProdValue() throws RecognitionException {
        try {
            // InternalFPML.g:1154:1: ( ruleProdValue EOF )
            // InternalFPML.g:1155:1: ruleProdValue EOF
            {
             before(grammarAccess.getProdValueRule()); 
            pushFollow(FOLLOW_1);
            ruleProdValue();

            state._fsp--;

             after(grammarAccess.getProdValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProdValue"


    // $ANTLR start "ruleProdValue"
    // InternalFPML.g:1162:1: ruleProdValue : ( ( rule__ProdValue__Group__0 ) ) ;
    public final void ruleProdValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1166:2: ( ( ( rule__ProdValue__Group__0 ) ) )
            // InternalFPML.g:1167:2: ( ( rule__ProdValue__Group__0 ) )
            {
            // InternalFPML.g:1167:2: ( ( rule__ProdValue__Group__0 ) )
            // InternalFPML.g:1168:3: ( rule__ProdValue__Group__0 )
            {
             before(grammarAccess.getProdValueAccess().getGroup()); 
            // InternalFPML.g:1169:3: ( rule__ProdValue__Group__0 )
            // InternalFPML.g:1169:4: rule__ProdValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ProdValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProdValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProdValue"


    // $ANTLR start "entryRuleSumValue"
    // InternalFPML.g:1178:1: entryRuleSumValue : ruleSumValue EOF ;
    public final void entryRuleSumValue() throws RecognitionException {
        try {
            // InternalFPML.g:1179:1: ( ruleSumValue EOF )
            // InternalFPML.g:1180:1: ruleSumValue EOF
            {
             before(grammarAccess.getSumValueRule()); 
            pushFollow(FOLLOW_1);
            ruleSumValue();

            state._fsp--;

             after(grammarAccess.getSumValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSumValue"


    // $ANTLR start "ruleSumValue"
    // InternalFPML.g:1187:1: ruleSumValue : ( ( rule__SumValue__Alternatives ) ) ;
    public final void ruleSumValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1191:2: ( ( ( rule__SumValue__Alternatives ) ) )
            // InternalFPML.g:1192:2: ( ( rule__SumValue__Alternatives ) )
            {
            // InternalFPML.g:1192:2: ( ( rule__SumValue__Alternatives ) )
            // InternalFPML.g:1193:3: ( rule__SumValue__Alternatives )
            {
             before(grammarAccess.getSumValueAccess().getAlternatives()); 
            // InternalFPML.g:1194:3: ( rule__SumValue__Alternatives )
            // InternalFPML.g:1194:4: rule__SumValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SumValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSumValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSumValue"


    // $ANTLR start "entryRulePrimitivePureFunction"
    // InternalFPML.g:1203:1: entryRulePrimitivePureFunction : rulePrimitivePureFunction EOF ;
    public final void entryRulePrimitivePureFunction() throws RecognitionException {
        try {
            // InternalFPML.g:1204:1: ( rulePrimitivePureFunction EOF )
            // InternalFPML.g:1205:1: rulePrimitivePureFunction EOF
            {
             before(grammarAccess.getPrimitivePureFunctionRule()); 
            pushFollow(FOLLOW_1);
            rulePrimitivePureFunction();

            state._fsp--;

             after(grammarAccess.getPrimitivePureFunctionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimitivePureFunction"


    // $ANTLR start "rulePrimitivePureFunction"
    // InternalFPML.g:1212:1: rulePrimitivePureFunction : ( ( rule__PrimitivePureFunction__Alternatives ) ) ;
    public final void rulePrimitivePureFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1216:2: ( ( ( rule__PrimitivePureFunction__Alternatives ) ) )
            // InternalFPML.g:1217:2: ( ( rule__PrimitivePureFunction__Alternatives ) )
            {
            // InternalFPML.g:1217:2: ( ( rule__PrimitivePureFunction__Alternatives ) )
            // InternalFPML.g:1218:3: ( rule__PrimitivePureFunction__Alternatives )
            {
             before(grammarAccess.getPrimitivePureFunctionAccess().getAlternatives()); 
            // InternalFPML.g:1219:3: ( rule__PrimitivePureFunction__Alternatives )
            // InternalFPML.g:1219:4: rule__PrimitivePureFunction__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PrimitivePureFunction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimitivePureFunctionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimitivePureFunction"


    // $ANTLR start "entryRuleIntToString"
    // InternalFPML.g:1228:1: entryRuleIntToString : ruleIntToString EOF ;
    public final void entryRuleIntToString() throws RecognitionException {
        try {
            // InternalFPML.g:1229:1: ( ruleIntToString EOF )
            // InternalFPML.g:1230:1: ruleIntToString EOF
            {
             before(grammarAccess.getIntToStringRule()); 
            pushFollow(FOLLOW_1);
            ruleIntToString();

            state._fsp--;

             after(grammarAccess.getIntToStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntToString"


    // $ANTLR start "ruleIntToString"
    // InternalFPML.g:1237:1: ruleIntToString : ( ( rule__IntToString__Group__0 ) ) ;
    public final void ruleIntToString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1241:2: ( ( ( rule__IntToString__Group__0 ) ) )
            // InternalFPML.g:1242:2: ( ( rule__IntToString__Group__0 ) )
            {
            // InternalFPML.g:1242:2: ( ( rule__IntToString__Group__0 ) )
            // InternalFPML.g:1243:3: ( rule__IntToString__Group__0 )
            {
             before(grammarAccess.getIntToStringAccess().getGroup()); 
            // InternalFPML.g:1244:3: ( rule__IntToString__Group__0 )
            // InternalFPML.g:1244:4: rule__IntToString__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IntToString__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntToStringAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntToString"


    // $ANTLR start "entryRuleIntPow"
    // InternalFPML.g:1253:1: entryRuleIntPow : ruleIntPow EOF ;
    public final void entryRuleIntPow() throws RecognitionException {
        try {
            // InternalFPML.g:1254:1: ( ruleIntPow EOF )
            // InternalFPML.g:1255:1: ruleIntPow EOF
            {
             before(grammarAccess.getIntPowRule()); 
            pushFollow(FOLLOW_1);
            ruleIntPow();

            state._fsp--;

             after(grammarAccess.getIntPowRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntPow"


    // $ANTLR start "ruleIntPow"
    // InternalFPML.g:1262:1: ruleIntPow : ( ( rule__IntPow__Group__0 ) ) ;
    public final void ruleIntPow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1266:2: ( ( ( rule__IntPow__Group__0 ) ) )
            // InternalFPML.g:1267:2: ( ( rule__IntPow__Group__0 ) )
            {
            // InternalFPML.g:1267:2: ( ( rule__IntPow__Group__0 ) )
            // InternalFPML.g:1268:3: ( rule__IntPow__Group__0 )
            {
             before(grammarAccess.getIntPowAccess().getGroup()); 
            // InternalFPML.g:1269:3: ( rule__IntPow__Group__0 )
            // InternalFPML.g:1269:4: rule__IntPow__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IntPow__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntPowAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntPow"


    // $ANTLR start "entryRulePlus"
    // InternalFPML.g:1278:1: entryRulePlus : rulePlus EOF ;
    public final void entryRulePlus() throws RecognitionException {
        try {
            // InternalFPML.g:1279:1: ( rulePlus EOF )
            // InternalFPML.g:1280:1: rulePlus EOF
            {
             before(grammarAccess.getPlusRule()); 
            pushFollow(FOLLOW_1);
            rulePlus();

            state._fsp--;

             after(grammarAccess.getPlusRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePlus"


    // $ANTLR start "rulePlus"
    // InternalFPML.g:1287:1: rulePlus : ( ( rule__Plus__Group__0 ) ) ;
    public final void rulePlus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1291:2: ( ( ( rule__Plus__Group__0 ) ) )
            // InternalFPML.g:1292:2: ( ( rule__Plus__Group__0 ) )
            {
            // InternalFPML.g:1292:2: ( ( rule__Plus__Group__0 ) )
            // InternalFPML.g:1293:3: ( rule__Plus__Group__0 )
            {
             before(grammarAccess.getPlusAccess().getGroup()); 
            // InternalFPML.g:1294:3: ( rule__Plus__Group__0 )
            // InternalFPML.g:1294:4: rule__Plus__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Plus__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlusAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlus"


    // $ANTLR start "entryRuleMinus"
    // InternalFPML.g:1303:1: entryRuleMinus : ruleMinus EOF ;
    public final void entryRuleMinus() throws RecognitionException {
        try {
            // InternalFPML.g:1304:1: ( ruleMinus EOF )
            // InternalFPML.g:1305:1: ruleMinus EOF
            {
             before(grammarAccess.getMinusRule()); 
            pushFollow(FOLLOW_1);
            ruleMinus();

            state._fsp--;

             after(grammarAccess.getMinusRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMinus"


    // $ANTLR start "ruleMinus"
    // InternalFPML.g:1312:1: ruleMinus : ( ( rule__Minus__Group__0 ) ) ;
    public final void ruleMinus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1316:2: ( ( ( rule__Minus__Group__0 ) ) )
            // InternalFPML.g:1317:2: ( ( rule__Minus__Group__0 ) )
            {
            // InternalFPML.g:1317:2: ( ( rule__Minus__Group__0 ) )
            // InternalFPML.g:1318:3: ( rule__Minus__Group__0 )
            {
             before(grammarAccess.getMinusAccess().getGroup()); 
            // InternalFPML.g:1319:3: ( rule__Minus__Group__0 )
            // InternalFPML.g:1319:4: rule__Minus__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Minus__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMinusAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMinus"


    // $ANTLR start "entryRuleTimes"
    // InternalFPML.g:1328:1: entryRuleTimes : ruleTimes EOF ;
    public final void entryRuleTimes() throws RecognitionException {
        try {
            // InternalFPML.g:1329:1: ( ruleTimes EOF )
            // InternalFPML.g:1330:1: ruleTimes EOF
            {
             before(grammarAccess.getTimesRule()); 
            pushFollow(FOLLOW_1);
            ruleTimes();

            state._fsp--;

             after(grammarAccess.getTimesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTimes"


    // $ANTLR start "ruleTimes"
    // InternalFPML.g:1337:1: ruleTimes : ( ( rule__Times__Group__0 ) ) ;
    public final void ruleTimes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1341:2: ( ( ( rule__Times__Group__0 ) ) )
            // InternalFPML.g:1342:2: ( ( rule__Times__Group__0 ) )
            {
            // InternalFPML.g:1342:2: ( ( rule__Times__Group__0 ) )
            // InternalFPML.g:1343:3: ( rule__Times__Group__0 )
            {
             before(grammarAccess.getTimesAccess().getGroup()); 
            // InternalFPML.g:1344:3: ( rule__Times__Group__0 )
            // InternalFPML.g:1344:4: rule__Times__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Times__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTimesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTimes"


    // $ANTLR start "entryRuleMod"
    // InternalFPML.g:1353:1: entryRuleMod : ruleMod EOF ;
    public final void entryRuleMod() throws RecognitionException {
        try {
            // InternalFPML.g:1354:1: ( ruleMod EOF )
            // InternalFPML.g:1355:1: ruleMod EOF
            {
             before(grammarAccess.getModRule()); 
            pushFollow(FOLLOW_1);
            ruleMod();

            state._fsp--;

             after(grammarAccess.getModRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMod"


    // $ANTLR start "ruleMod"
    // InternalFPML.g:1362:1: ruleMod : ( ( rule__Mod__Group__0 ) ) ;
    public final void ruleMod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1366:2: ( ( ( rule__Mod__Group__0 ) ) )
            // InternalFPML.g:1367:2: ( ( rule__Mod__Group__0 ) )
            {
            // InternalFPML.g:1367:2: ( ( rule__Mod__Group__0 ) )
            // InternalFPML.g:1368:3: ( rule__Mod__Group__0 )
            {
             before(grammarAccess.getModAccess().getGroup()); 
            // InternalFPML.g:1369:3: ( rule__Mod__Group__0 )
            // InternalFPML.g:1369:4: rule__Mod__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Mod__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMod"


    // $ANTLR start "entryRuleApplyF"
    // InternalFPML.g:1378:1: entryRuleApplyF : ruleApplyF EOF ;
    public final void entryRuleApplyF() throws RecognitionException {
        try {
            // InternalFPML.g:1379:1: ( ruleApplyF EOF )
            // InternalFPML.g:1380:1: ruleApplyF EOF
            {
             before(grammarAccess.getApplyFRule()); 
            pushFollow(FOLLOW_1);
            ruleApplyF();

            state._fsp--;

             after(grammarAccess.getApplyFRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleApplyF"


    // $ANTLR start "ruleApplyF"
    // InternalFPML.g:1387:1: ruleApplyF : ( ( rule__ApplyF__Group__0 ) ) ;
    public final void ruleApplyF() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1391:2: ( ( ( rule__ApplyF__Group__0 ) ) )
            // InternalFPML.g:1392:2: ( ( rule__ApplyF__Group__0 ) )
            {
            // InternalFPML.g:1392:2: ( ( rule__ApplyF__Group__0 ) )
            // InternalFPML.g:1393:3: ( rule__ApplyF__Group__0 )
            {
             before(grammarAccess.getApplyFAccess().getGroup()); 
            // InternalFPML.g:1394:3: ( rule__ApplyF__Group__0 )
            // InternalFPML.g:1394:4: rule__ApplyF__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ApplyF__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getApplyFAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleApplyF"


    // $ANTLR start "entryRulePrimitiveEffectFullFunction"
    // InternalFPML.g:1403:1: entryRulePrimitiveEffectFullFunction : rulePrimitiveEffectFullFunction EOF ;
    public final void entryRulePrimitiveEffectFullFunction() throws RecognitionException {
        try {
            // InternalFPML.g:1404:1: ( rulePrimitiveEffectFullFunction EOF )
            // InternalFPML.g:1405:1: rulePrimitiveEffectFullFunction EOF
            {
             before(grammarAccess.getPrimitiveEffectFullFunctionRule()); 
            pushFollow(FOLLOW_1);
            rulePrimitiveEffectFullFunction();

            state._fsp--;

             after(grammarAccess.getPrimitiveEffectFullFunctionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimitiveEffectFullFunction"


    // $ANTLR start "rulePrimitiveEffectFullFunction"
    // InternalFPML.g:1412:1: rulePrimitiveEffectFullFunction : ( ( rule__PrimitiveEffectFullFunction__Alternatives ) ) ;
    public final void rulePrimitiveEffectFullFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1416:2: ( ( ( rule__PrimitiveEffectFullFunction__Alternatives ) ) )
            // InternalFPML.g:1417:2: ( ( rule__PrimitiveEffectFullFunction__Alternatives ) )
            {
            // InternalFPML.g:1417:2: ( ( rule__PrimitiveEffectFullFunction__Alternatives ) )
            // InternalFPML.g:1418:3: ( rule__PrimitiveEffectFullFunction__Alternatives )
            {
             before(grammarAccess.getPrimitiveEffectFullFunctionAccess().getAlternatives()); 
            // InternalFPML.g:1419:3: ( rule__PrimitiveEffectFullFunction__Alternatives )
            // InternalFPML.g:1419:4: rule__PrimitiveEffectFullFunction__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveEffectFullFunction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveEffectFullFunctionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimitiveEffectFullFunction"


    // $ANTLR start "entryRulePrimitivePrint"
    // InternalFPML.g:1428:1: entryRulePrimitivePrint : rulePrimitivePrint EOF ;
    public final void entryRulePrimitivePrint() throws RecognitionException {
        try {
            // InternalFPML.g:1429:1: ( rulePrimitivePrint EOF )
            // InternalFPML.g:1430:1: rulePrimitivePrint EOF
            {
             before(grammarAccess.getPrimitivePrintRule()); 
            pushFollow(FOLLOW_1);
            rulePrimitivePrint();

            state._fsp--;

             after(grammarAccess.getPrimitivePrintRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimitivePrint"


    // $ANTLR start "rulePrimitivePrint"
    // InternalFPML.g:1437:1: rulePrimitivePrint : ( ( rule__PrimitivePrint__Group__0 ) ) ;
    public final void rulePrimitivePrint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1441:2: ( ( ( rule__PrimitivePrint__Group__0 ) ) )
            // InternalFPML.g:1442:2: ( ( rule__PrimitivePrint__Group__0 ) )
            {
            // InternalFPML.g:1442:2: ( ( rule__PrimitivePrint__Group__0 ) )
            // InternalFPML.g:1443:3: ( rule__PrimitivePrint__Group__0 )
            {
             before(grammarAccess.getPrimitivePrintAccess().getGroup()); 
            // InternalFPML.g:1444:3: ( rule__PrimitivePrint__Group__0 )
            // InternalFPML.g:1444:4: rule__PrimitivePrint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PrimitivePrint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrimitivePrintAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimitivePrint"


    // $ANTLR start "entryRuleApplyFIO"
    // InternalFPML.g:1453:1: entryRuleApplyFIO : ruleApplyFIO EOF ;
    public final void entryRuleApplyFIO() throws RecognitionException {
        try {
            // InternalFPML.g:1454:1: ( ruleApplyFIO EOF )
            // InternalFPML.g:1455:1: ruleApplyFIO EOF
            {
             before(grammarAccess.getApplyFIORule()); 
            pushFollow(FOLLOW_1);
            ruleApplyFIO();

            state._fsp--;

             after(grammarAccess.getApplyFIORule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleApplyFIO"


    // $ANTLR start "ruleApplyFIO"
    // InternalFPML.g:1462:1: ruleApplyFIO : ( ( rule__ApplyFIO__Group__0 ) ) ;
    public final void ruleApplyFIO() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1466:2: ( ( ( rule__ApplyFIO__Group__0 ) ) )
            // InternalFPML.g:1467:2: ( ( rule__ApplyFIO__Group__0 ) )
            {
            // InternalFPML.g:1467:2: ( ( rule__ApplyFIO__Group__0 ) )
            // InternalFPML.g:1468:3: ( rule__ApplyFIO__Group__0 )
            {
             before(grammarAccess.getApplyFIOAccess().getGroup()); 
            // InternalFPML.g:1469:3: ( rule__ApplyFIO__Group__0 )
            // InternalFPML.g:1469:4: rule__ApplyFIO__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ApplyFIO__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getApplyFIOAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleApplyFIO"


    // $ANTLR start "rule__AdtType__Alternatives"
    // InternalFPML.g:1477:1: rule__AdtType__Alternatives : ( ( ruleValueType ) | ( ( rule__AdtType__Group_1__0 ) ) );
    public final void rule__AdtType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1481:1: ( ( ruleValueType ) | ( ( rule__AdtType__Group_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=32 && LA1_0<=33)||(LA1_0>=48 && LA1_0<=49)) ) {
                alt1=1;
            }
            else if ( (LA1_0==19) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalFPML.g:1482:2: ( ruleValueType )
                    {
                    // InternalFPML.g:1482:2: ( ruleValueType )
                    // InternalFPML.g:1483:3: ruleValueType
                    {
                     before(grammarAccess.getAdtTypeAccess().getValueTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleValueType();

                    state._fsp--;

                     after(grammarAccess.getAdtTypeAccess().getValueTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFPML.g:1488:2: ( ( rule__AdtType__Group_1__0 ) )
                    {
                    // InternalFPML.g:1488:2: ( ( rule__AdtType__Group_1__0 ) )
                    // InternalFPML.g:1489:3: ( rule__AdtType__Group_1__0 )
                    {
                     before(grammarAccess.getAdtTypeAccess().getGroup_1()); 
                    // InternalFPML.g:1490:3: ( rule__AdtType__Group_1__0 )
                    // InternalFPML.g:1490:4: rule__AdtType__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AdtType__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAdtTypeAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdtType__Alternatives"


    // $ANTLR start "rule__AdtType__AdtElement2Alternatives_1_2_0"
    // InternalFPML.g:1498:1: rule__AdtType__AdtElement2Alternatives_1_2_0 : ( ( ruleSumType ) | ( ruleProdType ) );
    public final void rule__AdtType__AdtElement2Alternatives_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1502:1: ( ( ruleSumType ) | ( ruleProdType ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==21) ) {
                alt2=1;
            }
            else if ( (LA2_0==22) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalFPML.g:1503:2: ( ruleSumType )
                    {
                    // InternalFPML.g:1503:2: ( ruleSumType )
                    // InternalFPML.g:1504:3: ruleSumType
                    {
                     before(grammarAccess.getAdtTypeAccess().getAdtElement2SumTypeParserRuleCall_1_2_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSumType();

                    state._fsp--;

                     after(grammarAccess.getAdtTypeAccess().getAdtElement2SumTypeParserRuleCall_1_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFPML.g:1509:2: ( ruleProdType )
                    {
                    // InternalFPML.g:1509:2: ( ruleProdType )
                    // InternalFPML.g:1510:3: ruleProdType
                    {
                     before(grammarAccess.getAdtTypeAccess().getAdtElement2ProdTypeParserRuleCall_1_2_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleProdType();

                    state._fsp--;

                     after(grammarAccess.getAdtTypeAccess().getAdtElement2ProdTypeParserRuleCall_1_2_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdtType__AdtElement2Alternatives_1_2_0"


    // $ANTLR start "rule__FunctionBodyPure__Alternatives"
    // InternalFPML.g:1519:1: rule__FunctionBodyPure__Alternatives : ( ( ruleEmptyFunctionBody ) | ( ruleCompositionFunctionBodyPure ) );
    public final void rule__FunctionBodyPure__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1523:1: ( ( ruleEmptyFunctionBody ) | ( ruleCompositionFunctionBodyPure ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==28) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID||(LA3_0>=21 && LA3_0<=22)||(LA3_0>=41 && LA3_0<=45)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalFPML.g:1524:2: ( ruleEmptyFunctionBody )
                    {
                    // InternalFPML.g:1524:2: ( ruleEmptyFunctionBody )
                    // InternalFPML.g:1525:3: ruleEmptyFunctionBody
                    {
                     before(grammarAccess.getFunctionBodyPureAccess().getEmptyFunctionBodyParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEmptyFunctionBody();

                    state._fsp--;

                     after(grammarAccess.getFunctionBodyPureAccess().getEmptyFunctionBodyParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFPML.g:1530:2: ( ruleCompositionFunctionBodyPure )
                    {
                    // InternalFPML.g:1530:2: ( ruleCompositionFunctionBodyPure )
                    // InternalFPML.g:1531:3: ruleCompositionFunctionBodyPure
                    {
                     before(grammarAccess.getFunctionBodyPureAccess().getCompositionFunctionBodyPureParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCompositionFunctionBodyPure();

                    state._fsp--;

                     after(grammarAccess.getFunctionBodyPureAccess().getCompositionFunctionBodyPureParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionBodyPure__Alternatives"


    // $ANTLR start "rule__FunctionBodyEffectFull__Alternatives"
    // InternalFPML.g:1540:1: rule__FunctionBodyEffectFull__Alternatives : ( ( ruleEmptyFunctionBody ) | ( ruleCompositionFunctionBodyEffect ) );
    public final void rule__FunctionBodyEffectFull__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1544:1: ( ( ruleEmptyFunctionBody ) | ( ruleCompositionFunctionBodyEffect ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==28) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID||(LA4_0>=21 && LA4_0<=22)||(LA4_0>=41 && LA4_0<=47)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalFPML.g:1545:2: ( ruleEmptyFunctionBody )
                    {
                    // InternalFPML.g:1545:2: ( ruleEmptyFunctionBody )
                    // InternalFPML.g:1546:3: ruleEmptyFunctionBody
                    {
                     before(grammarAccess.getFunctionBodyEffectFullAccess().getEmptyFunctionBodyParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEmptyFunctionBody();

                    state._fsp--;

                     after(grammarAccess.getFunctionBodyEffectFullAccess().getEmptyFunctionBodyParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFPML.g:1551:2: ( ruleCompositionFunctionBodyEffect )
                    {
                    // InternalFPML.g:1551:2: ( ruleCompositionFunctionBodyEffect )
                    // InternalFPML.g:1552:3: ruleCompositionFunctionBodyEffect
                    {
                     before(grammarAccess.getFunctionBodyEffectFullAccess().getCompositionFunctionBodyEffectParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCompositionFunctionBodyEffect();

                    state._fsp--;

                     after(grammarAccess.getFunctionBodyEffectFullAccess().getCompositionFunctionBodyEffectParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionBodyEffectFull__Alternatives"


    // $ANTLR start "rule__CompositionFunctionBodyPure__Alternatives"
    // InternalFPML.g:1561:1: rule__CompositionFunctionBodyPure__Alternatives : ( ( ( rule__CompositionFunctionBodyPure__Group_0__0 ) ) | ( ( rule__CompositionFunctionBodyPure__Group_1__0 ) ) );
    public final void rule__CompositionFunctionBodyPure__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1565:1: ( ( ( rule__CompositionFunctionBodyPure__Group_0__0 ) ) | ( ( rule__CompositionFunctionBodyPure__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=21 && LA5_0<=22)||(LA5_0>=41 && LA5_0<=45)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalFPML.g:1566:2: ( ( rule__CompositionFunctionBodyPure__Group_0__0 ) )
                    {
                    // InternalFPML.g:1566:2: ( ( rule__CompositionFunctionBodyPure__Group_0__0 ) )
                    // InternalFPML.g:1567:3: ( rule__CompositionFunctionBodyPure__Group_0__0 )
                    {
                     before(grammarAccess.getCompositionFunctionBodyPureAccess().getGroup_0()); 
                    // InternalFPML.g:1568:3: ( rule__CompositionFunctionBodyPure__Group_0__0 )
                    // InternalFPML.g:1568:4: rule__CompositionFunctionBodyPure__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompositionFunctionBodyPure__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCompositionFunctionBodyPureAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFPML.g:1572:2: ( ( rule__CompositionFunctionBodyPure__Group_1__0 ) )
                    {
                    // InternalFPML.g:1572:2: ( ( rule__CompositionFunctionBodyPure__Group_1__0 ) )
                    // InternalFPML.g:1573:3: ( rule__CompositionFunctionBodyPure__Group_1__0 )
                    {
                     before(grammarAccess.getCompositionFunctionBodyPureAccess().getGroup_1()); 
                    // InternalFPML.g:1574:3: ( rule__CompositionFunctionBodyPure__Group_1__0 )
                    // InternalFPML.g:1574:4: rule__CompositionFunctionBodyPure__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompositionFunctionBodyPure__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCompositionFunctionBodyPureAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionFunctionBodyPure__Alternatives"


    // $ANTLR start "rule__CompositionFunctionBodyPureFactor__Alternatives"
    // InternalFPML.g:1582:1: rule__CompositionFunctionBodyPureFactor__Alternatives : ( ( ( rule__CompositionFunctionBodyPureFactor__Group_0__0 ) ) | ( ( rule__CompositionFunctionBodyPureFactor__Group_1__0 ) ) );
    public final void rule__CompositionFunctionBodyPureFactor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1586:1: ( ( ( rule__CompositionFunctionBodyPureFactor__Group_0__0 ) ) | ( ( rule__CompositionFunctionBodyPureFactor__Group_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==29) ) {
                int LA6_1 = input.LA(2);

                if ( ((LA6_1>=21 && LA6_1<=22)||(LA6_1>=41 && LA6_1<=45)) ) {
                    alt6=2;
                }
                else if ( (LA6_1==RULE_ID) ) {
                    alt6=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalFPML.g:1587:2: ( ( rule__CompositionFunctionBodyPureFactor__Group_0__0 ) )
                    {
                    // InternalFPML.g:1587:2: ( ( rule__CompositionFunctionBodyPureFactor__Group_0__0 ) )
                    // InternalFPML.g:1588:3: ( rule__CompositionFunctionBodyPureFactor__Group_0__0 )
                    {
                     before(grammarAccess.getCompositionFunctionBodyPureFactorAccess().getGroup_0()); 
                    // InternalFPML.g:1589:3: ( rule__CompositionFunctionBodyPureFactor__Group_0__0 )
                    // InternalFPML.g:1589:4: rule__CompositionFunctionBodyPureFactor__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompositionFunctionBodyPureFactor__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCompositionFunctionBodyPureFactorAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFPML.g:1593:2: ( ( rule__CompositionFunctionBodyPureFactor__Group_1__0 ) )
                    {
                    // InternalFPML.g:1593:2: ( ( rule__CompositionFunctionBodyPureFactor__Group_1__0 ) )
                    // InternalFPML.g:1594:3: ( rule__CompositionFunctionBodyPureFactor__Group_1__0 )
                    {
                     before(grammarAccess.getCompositionFunctionBodyPureFactorAccess().getGroup_1()); 
                    // InternalFPML.g:1595:3: ( rule__CompositionFunctionBodyPureFactor__Group_1__0 )
                    // InternalFPML.g:1595:4: rule__CompositionFunctionBodyPureFactor__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompositionFunctionBodyPureFactor__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCompositionFunctionBodyPureFactorAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionFunctionBodyPureFactor__Alternatives"


    // $ANTLR start "rule__CompositionFunctionBodyEffect__Alternatives"
    // InternalFPML.g:1603:1: rule__CompositionFunctionBodyEffect__Alternatives : ( ( ( rule__CompositionFunctionBodyEffect__Group_0__0 ) ) | ( ( rule__CompositionFunctionBodyEffect__Group_1__0 ) ) );
    public final void rule__CompositionFunctionBodyEffect__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1607:1: ( ( ( rule__CompositionFunctionBodyEffect__Group_0__0 ) ) | ( ( rule__CompositionFunctionBodyEffect__Group_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=21 && LA7_0<=22)||(LA7_0>=41 && LA7_0<=47)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalFPML.g:1608:2: ( ( rule__CompositionFunctionBodyEffect__Group_0__0 ) )
                    {
                    // InternalFPML.g:1608:2: ( ( rule__CompositionFunctionBodyEffect__Group_0__0 ) )
                    // InternalFPML.g:1609:3: ( rule__CompositionFunctionBodyEffect__Group_0__0 )
                    {
                     before(grammarAccess.getCompositionFunctionBodyEffectAccess().getGroup_0()); 
                    // InternalFPML.g:1610:3: ( rule__CompositionFunctionBodyEffect__Group_0__0 )
                    // InternalFPML.g:1610:4: rule__CompositionFunctionBodyEffect__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompositionFunctionBodyEffect__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCompositionFunctionBodyEffectAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFPML.g:1614:2: ( ( rule__CompositionFunctionBodyEffect__Group_1__0 ) )
                    {
                    // InternalFPML.g:1614:2: ( ( rule__CompositionFunctionBodyEffect__Group_1__0 ) )
                    // InternalFPML.g:1615:3: ( rule__CompositionFunctionBodyEffect__Group_1__0 )
                    {
                     before(grammarAccess.getCompositionFunctionBodyEffectAccess().getGroup_1()); 
                    // InternalFPML.g:1616:3: ( rule__CompositionFunctionBodyEffect__Group_1__0 )
                    // InternalFPML.g:1616:4: rule__CompositionFunctionBodyEffect__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompositionFunctionBodyEffect__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCompositionFunctionBodyEffectAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionFunctionBodyEffect__Alternatives"


    // $ANTLR start "rule__CompositionFunctionBodyEffect__PrimitiveElementAlternatives_1_0_0"
    // InternalFPML.g:1624:1: rule__CompositionFunctionBodyEffect__PrimitiveElementAlternatives_1_0_0 : ( ( rulePrimitiveEffectFullFunction ) | ( rulePrimitivePureFunction ) );
    public final void rule__CompositionFunctionBodyEffect__PrimitiveElementAlternatives_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1628:1: ( ( rulePrimitiveEffectFullFunction ) | ( rulePrimitivePureFunction ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=46 && LA8_0<=47)) ) {
                alt8=1;
            }
            else if ( ((LA8_0>=21 && LA8_0<=22)||(LA8_0>=41 && LA8_0<=45)) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalFPML.g:1629:2: ( rulePrimitiveEffectFullFunction )
                    {
                    // InternalFPML.g:1629:2: ( rulePrimitiveEffectFullFunction )
                    // InternalFPML.g:1630:3: rulePrimitiveEffectFullFunction
                    {
                     before(grammarAccess.getCompositionFunctionBodyEffectAccess().getPrimitiveElementPrimitiveEffectFullFunctionParserRuleCall_1_0_0_0()); 
                    pushFollow(FOLLOW_2);
                    rulePrimitiveEffectFullFunction();

                    state._fsp--;

                     after(grammarAccess.getCompositionFunctionBodyEffectAccess().getPrimitiveElementPrimitiveEffectFullFunctionParserRuleCall_1_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFPML.g:1635:2: ( rulePrimitivePureFunction )
                    {
                    // InternalFPML.g:1635:2: ( rulePrimitivePureFunction )
                    // InternalFPML.g:1636:3: rulePrimitivePureFunction
                    {
                     before(grammarAccess.getCompositionFunctionBodyEffectAccess().getPrimitiveElementPrimitivePureFunctionParserRuleCall_1_0_0_1()); 
                    pushFollow(FOLLOW_2);
                    rulePrimitivePureFunction();

                    state._fsp--;

                     after(grammarAccess.getCompositionFunctionBodyEffectAccess().getPrimitiveElementPrimitivePureFunctionParserRuleCall_1_0_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionFunctionBodyEffect__PrimitiveElementAlternatives_1_0_0"


    // $ANTLR start "rule__CompositionFunctionBodyEffectFullFactor__Alternatives"
    // InternalFPML.g:1645:1: rule__CompositionFunctionBodyEffectFullFactor__Alternatives : ( ( ( rule__CompositionFunctionBodyEffectFullFactor__Group_0__0 ) ) | ( ( rule__CompositionFunctionBodyEffectFullFactor__Group_1__0 ) ) );
    public final void rule__CompositionFunctionBodyEffectFullFactor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1649:1: ( ( ( rule__CompositionFunctionBodyEffectFullFactor__Group_0__0 ) ) | ( ( rule__CompositionFunctionBodyEffectFullFactor__Group_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==30) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==RULE_ID) ) {
                    alt9=1;
                }
                else if ( ((LA9_1>=21 && LA9_1<=22)||(LA9_1>=41 && LA9_1<=47)) ) {
                    alt9=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalFPML.g:1650:2: ( ( rule__CompositionFunctionBodyEffectFullFactor__Group_0__0 ) )
                    {
                    // InternalFPML.g:1650:2: ( ( rule__CompositionFunctionBodyEffectFullFactor__Group_0__0 ) )
                    // InternalFPML.g:1651:3: ( rule__CompositionFunctionBodyEffectFullFactor__Group_0__0 )
                    {
                     before(grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getGroup_0()); 
                    // InternalFPML.g:1652:3: ( rule__CompositionFunctionBodyEffectFullFactor__Group_0__0 )
                    // InternalFPML.g:1652:4: rule__CompositionFunctionBodyEffectFullFactor__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompositionFunctionBodyEffectFullFactor__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFPML.g:1656:2: ( ( rule__CompositionFunctionBodyEffectFullFactor__Group_1__0 ) )
                    {
                    // InternalFPML.g:1656:2: ( ( rule__CompositionFunctionBodyEffectFullFactor__Group_1__0 ) )
                    // InternalFPML.g:1657:3: ( rule__CompositionFunctionBodyEffectFullFactor__Group_1__0 )
                    {
                     before(grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getGroup_1()); 
                    // InternalFPML.g:1658:3: ( rule__CompositionFunctionBodyEffectFullFactor__Group_1__0 )
                    // InternalFPML.g:1658:4: rule__CompositionFunctionBodyEffectFullFactor__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompositionFunctionBodyEffectFullFactor__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionFunctionBodyEffectFullFactor__Alternatives"


    // $ANTLR start "rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAlternatives_1_1_0"
    // InternalFPML.g:1666:1: rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAlternatives_1_1_0 : ( ( rulePrimitiveEffectFullFunction ) | ( rulePrimitivePureFunction ) );
    public final void rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1670:1: ( ( rulePrimitiveEffectFullFunction ) | ( rulePrimitivePureFunction ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=46 && LA10_0<=47)) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=21 && LA10_0<=22)||(LA10_0>=41 && LA10_0<=45)) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalFPML.g:1671:2: ( rulePrimitiveEffectFullFunction )
                    {
                    // InternalFPML.g:1671:2: ( rulePrimitiveEffectFullFunction )
                    // InternalFPML.g:1672:3: rulePrimitiveEffectFullFunction
                    {
                     before(grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getPrimitiveElementPrimitiveEffectFullFunctionParserRuleCall_1_1_0_0()); 
                    pushFollow(FOLLOW_2);
                    rulePrimitiveEffectFullFunction();

                    state._fsp--;

                     after(grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getPrimitiveElementPrimitiveEffectFullFunctionParserRuleCall_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFPML.g:1677:2: ( rulePrimitivePureFunction )
                    {
                    // InternalFPML.g:1677:2: ( rulePrimitivePureFunction )
                    // InternalFPML.g:1678:3: rulePrimitivePureFunction
                    {
                     before(grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getPrimitiveElementPrimitivePureFunctionParserRuleCall_1_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    rulePrimitivePureFunction();

                    state._fsp--;

                     after(grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getPrimitiveElementPrimitivePureFunctionParserRuleCall_1_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAlternatives_1_1_0"


    // $ANTLR start "rule__ValueType__Alternatives"
    // InternalFPML.g:1687:1: rule__ValueType__Alternatives : ( ( ruleIntegerType ) | ( ruleStringType ) | ( ruleDataType ) | ( rulePureFunctionType ) );
    public final void rule__ValueType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1691:1: ( ( ruleIntegerType ) | ( ruleStringType ) | ( ruleDataType ) | ( rulePureFunctionType ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt11=1;
                }
                break;
            case 49:
                {
                alt11=2;
                }
                break;
            case 32:
                {
                alt11=3;
                }
                break;
            case 33:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalFPML.g:1692:2: ( ruleIntegerType )
                    {
                    // InternalFPML.g:1692:2: ( ruleIntegerType )
                    // InternalFPML.g:1693:3: ruleIntegerType
                    {
                     before(grammarAccess.getValueTypeAccess().getIntegerTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleIntegerType();

                    state._fsp--;

                     after(grammarAccess.getValueTypeAccess().getIntegerTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFPML.g:1698:2: ( ruleStringType )
                    {
                    // InternalFPML.g:1698:2: ( ruleStringType )
                    // InternalFPML.g:1699:3: ruleStringType
                    {
                     before(grammarAccess.getValueTypeAccess().getStringTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleStringType();

                    state._fsp--;

                     after(grammarAccess.getValueTypeAccess().getStringTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFPML.g:1704:2: ( ruleDataType )
                    {
                    // InternalFPML.g:1704:2: ( ruleDataType )
                    // InternalFPML.g:1705:3: ruleDataType
                    {
                     before(grammarAccess.getValueTypeAccess().getDataTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDataType();

                    state._fsp--;

                     after(grammarAccess.getValueTypeAccess().getDataTypeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalFPML.g:1710:2: ( rulePureFunctionType )
                    {
                    // InternalFPML.g:1710:2: ( rulePureFunctionType )
                    // InternalFPML.g:1711:3: rulePureFunctionType
                    {
                     before(grammarAccess.getValueTypeAccess().getPureFunctionTypeParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    rulePureFunctionType();

                    state._fsp--;

                     after(grammarAccess.getValueTypeAccess().getPureFunctionTypeParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueType__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalFPML.g:1720:1: rule__Type__Alternatives : ( ( ruleValueType ) | ( ruleUnitType ) | ( ruleEffectFullFunctionType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1724:1: ( ( ruleValueType ) | ( ruleUnitType ) | ( ruleEffectFullFunctionType ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 32:
            case 33:
            case 48:
            case 49:
                {
                alt12=1;
                }
                break;
            case 50:
                {
                alt12=2;
                }
                break;
            case 37:
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
                    // InternalFPML.g:1725:2: ( ruleValueType )
                    {
                    // InternalFPML.g:1725:2: ( ruleValueType )
                    // InternalFPML.g:1726:3: ruleValueType
                    {
                     before(grammarAccess.getTypeAccess().getValueTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleValueType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getValueTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFPML.g:1731:2: ( ruleUnitType )
                    {
                    // InternalFPML.g:1731:2: ( ruleUnitType )
                    // InternalFPML.g:1732:3: ruleUnitType
                    {
                     before(grammarAccess.getTypeAccess().getUnitTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleUnitType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getUnitTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFPML.g:1737:2: ( ruleEffectFullFunctionType )
                    {
                    // InternalFPML.g:1737:2: ( ruleEffectFullFunctionType )
                    // InternalFPML.g:1738:3: ruleEffectFullFunctionType
                    {
                     before(grammarAccess.getTypeAccess().getEffectFullFunctionTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleEffectFullFunctionType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getEffectFullFunctionTypeParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__Expression__Alternatives"
    // InternalFPML.g:1747:1: rule__Expression__Alternatives : ( ( ruleIntValue ) | ( ruleStringValue ) | ( ruleUnitValue ) | ( ruleDataValue ) | ( ruleFunctionValue ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1751:1: ( ( ruleIntValue ) | ( ruleStringValue ) | ( ruleUnitValue ) | ( ruleDataValue ) | ( ruleFunctionValue ) )
            int alt13=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt13=1;
                }
                break;
            case RULE_STRING:
                {
                alt13=2;
                }
                break;
            case 38:
                {
                alt13=3;
                }
                break;
            case RULE_ID:
                {
                alt13=4;
                }
                break;
            case 24:
                {
                alt13=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalFPML.g:1752:2: ( ruleIntValue )
                    {
                    // InternalFPML.g:1752:2: ( ruleIntValue )
                    // InternalFPML.g:1753:3: ruleIntValue
                    {
                     before(grammarAccess.getExpressionAccess().getIntValueParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleIntValue();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getIntValueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFPML.g:1758:2: ( ruleStringValue )
                    {
                    // InternalFPML.g:1758:2: ( ruleStringValue )
                    // InternalFPML.g:1759:3: ruleStringValue
                    {
                     before(grammarAccess.getExpressionAccess().getStringValueParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleStringValue();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getStringValueParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFPML.g:1764:2: ( ruleUnitValue )
                    {
                    // InternalFPML.g:1764:2: ( ruleUnitValue )
                    // InternalFPML.g:1765:3: ruleUnitValue
                    {
                     before(grammarAccess.getExpressionAccess().getUnitValueParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleUnitValue();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getUnitValueParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalFPML.g:1770:2: ( ruleDataValue )
                    {
                    // InternalFPML.g:1770:2: ( ruleDataValue )
                    // InternalFPML.g:1771:3: ruleDataValue
                    {
                     before(grammarAccess.getExpressionAccess().getDataValueParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleDataValue();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getDataValueParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalFPML.g:1776:2: ( ruleFunctionValue )
                    {
                    // InternalFPML.g:1776:2: ( ruleFunctionValue )
                    // InternalFPML.g:1777:3: ruleFunctionValue
                    {
                     before(grammarAccess.getExpressionAccess().getFunctionValueParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleFunctionValue();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getFunctionValueParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Alternatives"


    // $ANTLR start "rule__AdtValue__Alternatives"
    // InternalFPML.g:1786:1: rule__AdtValue__Alternatives : ( ( ruleIntValue ) | ( ruleStringValue ) | ( ruleValueRef ) | ( ruleDataValue ) | ( ruleSumValue ) | ( ruleFunctionValue ) | ( ruleProdValue ) );
    public final void rule__AdtValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1790:1: ( ( ruleIntValue ) | ( ruleStringValue ) | ( ruleValueRef ) | ( ruleDataValue ) | ( ruleSumValue ) | ( ruleFunctionValue ) | ( ruleProdValue ) )
            int alt14=7;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // InternalFPML.g:1791:2: ( ruleIntValue )
                    {
                    // InternalFPML.g:1791:2: ( ruleIntValue )
                    // InternalFPML.g:1792:3: ruleIntValue
                    {
                     before(grammarAccess.getAdtValueAccess().getIntValueParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleIntValue();

                    state._fsp--;

                     after(grammarAccess.getAdtValueAccess().getIntValueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFPML.g:1797:2: ( ruleStringValue )
                    {
                    // InternalFPML.g:1797:2: ( ruleStringValue )
                    // InternalFPML.g:1798:3: ruleStringValue
                    {
                     before(grammarAccess.getAdtValueAccess().getStringValueParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleStringValue();

                    state._fsp--;

                     after(grammarAccess.getAdtValueAccess().getStringValueParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFPML.g:1803:2: ( ruleValueRef )
                    {
                    // InternalFPML.g:1803:2: ( ruleValueRef )
                    // InternalFPML.g:1804:3: ruleValueRef
                    {
                     before(grammarAccess.getAdtValueAccess().getValueRefParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleValueRef();

                    state._fsp--;

                     after(grammarAccess.getAdtValueAccess().getValueRefParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalFPML.g:1809:2: ( ruleDataValue )
                    {
                    // InternalFPML.g:1809:2: ( ruleDataValue )
                    // InternalFPML.g:1810:3: ruleDataValue
                    {
                     before(grammarAccess.getAdtValueAccess().getDataValueParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleDataValue();

                    state._fsp--;

                     after(grammarAccess.getAdtValueAccess().getDataValueParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalFPML.g:1815:2: ( ruleSumValue )
                    {
                    // InternalFPML.g:1815:2: ( ruleSumValue )
                    // InternalFPML.g:1816:3: ruleSumValue
                    {
                     before(grammarAccess.getAdtValueAccess().getSumValueParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleSumValue();

                    state._fsp--;

                     after(grammarAccess.getAdtValueAccess().getSumValueParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalFPML.g:1821:2: ( ruleFunctionValue )
                    {
                    // InternalFPML.g:1821:2: ( ruleFunctionValue )
                    // InternalFPML.g:1822:3: ruleFunctionValue
                    {
                     before(grammarAccess.getAdtValueAccess().getFunctionValueParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleFunctionValue();

                    state._fsp--;

                     after(grammarAccess.getAdtValueAccess().getFunctionValueParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalFPML.g:1827:2: ( ruleProdValue )
                    {
                    // InternalFPML.g:1827:2: ( ruleProdValue )
                    // InternalFPML.g:1828:3: ruleProdValue
                    {
                     before(grammarAccess.getAdtValueAccess().getProdValueParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleProdValue();

                    state._fsp--;

                     after(grammarAccess.getAdtValueAccess().getProdValueParserRuleCall_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdtValue__Alternatives"


    // $ANTLR start "rule__SumValue__Alternatives"
    // InternalFPML.g:1837:1: rule__SumValue__Alternatives : ( ( ( rule__SumValue__Group_0__0 ) ) | ( ( rule__SumValue__Group_1__0 ) ) );
    public final void rule__SumValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1841:1: ( ( ( rule__SumValue__Group_0__0 ) ) | ( ( rule__SumValue__Group_1__0 ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==39) ) {
                alt15=1;
            }
            else if ( (LA15_0==40) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalFPML.g:1842:2: ( ( rule__SumValue__Group_0__0 ) )
                    {
                    // InternalFPML.g:1842:2: ( ( rule__SumValue__Group_0__0 ) )
                    // InternalFPML.g:1843:3: ( rule__SumValue__Group_0__0 )
                    {
                     before(grammarAccess.getSumValueAccess().getGroup_0()); 
                    // InternalFPML.g:1844:3: ( rule__SumValue__Group_0__0 )
                    // InternalFPML.g:1844:4: rule__SumValue__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SumValue__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSumValueAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFPML.g:1848:2: ( ( rule__SumValue__Group_1__0 ) )
                    {
                    // InternalFPML.g:1848:2: ( ( rule__SumValue__Group_1__0 ) )
                    // InternalFPML.g:1849:3: ( rule__SumValue__Group_1__0 )
                    {
                     before(grammarAccess.getSumValueAccess().getGroup_1()); 
                    // InternalFPML.g:1850:3: ( rule__SumValue__Group_1__0 )
                    // InternalFPML.g:1850:4: rule__SumValue__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SumValue__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSumValueAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SumValue__Alternatives"


    // $ANTLR start "rule__PrimitivePureFunction__Alternatives"
    // InternalFPML.g:1858:1: rule__PrimitivePureFunction__Alternatives : ( ( ruleIntToString ) | ( ruleIntPow ) | ( rulePlus ) | ( ruleMinus ) | ( ruleTimes ) | ( ruleMod ) | ( ruleApplyF ) );
    public final void rule__PrimitivePureFunction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1862:1: ( ( ruleIntToString ) | ( ruleIntPow ) | ( rulePlus ) | ( ruleMinus ) | ( ruleTimes ) | ( ruleMod ) | ( ruleApplyF ) )
            int alt16=7;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt16=1;
                }
                break;
            case 42:
                {
                alt16=2;
                }
                break;
            case 21:
                {
                alt16=3;
                }
                break;
            case 43:
                {
                alt16=4;
                }
                break;
            case 22:
                {
                alt16=5;
                }
                break;
            case 44:
                {
                alt16=6;
                }
                break;
            case 45:
                {
                alt16=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalFPML.g:1863:2: ( ruleIntToString )
                    {
                    // InternalFPML.g:1863:2: ( ruleIntToString )
                    // InternalFPML.g:1864:3: ruleIntToString
                    {
                     before(grammarAccess.getPrimitivePureFunctionAccess().getIntToStringParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleIntToString();

                    state._fsp--;

                     after(grammarAccess.getPrimitivePureFunctionAccess().getIntToStringParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFPML.g:1869:2: ( ruleIntPow )
                    {
                    // InternalFPML.g:1869:2: ( ruleIntPow )
                    // InternalFPML.g:1870:3: ruleIntPow
                    {
                     before(grammarAccess.getPrimitivePureFunctionAccess().getIntPowParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIntPow();

                    state._fsp--;

                     after(grammarAccess.getPrimitivePureFunctionAccess().getIntPowParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFPML.g:1875:2: ( rulePlus )
                    {
                    // InternalFPML.g:1875:2: ( rulePlus )
                    // InternalFPML.g:1876:3: rulePlus
                    {
                     before(grammarAccess.getPrimitivePureFunctionAccess().getPlusParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    rulePlus();

                    state._fsp--;

                     after(grammarAccess.getPrimitivePureFunctionAccess().getPlusParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalFPML.g:1881:2: ( ruleMinus )
                    {
                    // InternalFPML.g:1881:2: ( ruleMinus )
                    // InternalFPML.g:1882:3: ruleMinus
                    {
                     before(grammarAccess.getPrimitivePureFunctionAccess().getMinusParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleMinus();

                    state._fsp--;

                     after(grammarAccess.getPrimitivePureFunctionAccess().getMinusParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalFPML.g:1887:2: ( ruleTimes )
                    {
                    // InternalFPML.g:1887:2: ( ruleTimes )
                    // InternalFPML.g:1888:3: ruleTimes
                    {
                     before(grammarAccess.getPrimitivePureFunctionAccess().getTimesParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleTimes();

                    state._fsp--;

                     after(grammarAccess.getPrimitivePureFunctionAccess().getTimesParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalFPML.g:1893:2: ( ruleMod )
                    {
                    // InternalFPML.g:1893:2: ( ruleMod )
                    // InternalFPML.g:1894:3: ruleMod
                    {
                     before(grammarAccess.getPrimitivePureFunctionAccess().getModParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleMod();

                    state._fsp--;

                     after(grammarAccess.getPrimitivePureFunctionAccess().getModParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalFPML.g:1899:2: ( ruleApplyF )
                    {
                    // InternalFPML.g:1899:2: ( ruleApplyF )
                    // InternalFPML.g:1900:3: ruleApplyF
                    {
                     before(grammarAccess.getPrimitivePureFunctionAccess().getApplyFParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleApplyF();

                    state._fsp--;

                     after(grammarAccess.getPrimitivePureFunctionAccess().getApplyFParserRuleCall_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitivePureFunction__Alternatives"


    // $ANTLR start "rule__PrimitiveEffectFullFunction__Alternatives"
    // InternalFPML.g:1909:1: rule__PrimitiveEffectFullFunction__Alternatives : ( ( rulePrimitivePrint ) | ( ruleApplyFIO ) );
    public final void rule__PrimitiveEffectFullFunction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1913:1: ( ( rulePrimitivePrint ) | ( ruleApplyFIO ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==46) ) {
                alt17=1;
            }
            else if ( (LA17_0==47) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalFPML.g:1914:2: ( rulePrimitivePrint )
                    {
                    // InternalFPML.g:1914:2: ( rulePrimitivePrint )
                    // InternalFPML.g:1915:3: rulePrimitivePrint
                    {
                     before(grammarAccess.getPrimitiveEffectFullFunctionAccess().getPrimitivePrintParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePrimitivePrint();

                    state._fsp--;

                     after(grammarAccess.getPrimitiveEffectFullFunctionAccess().getPrimitivePrintParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFPML.g:1920:2: ( ruleApplyFIO )
                    {
                    // InternalFPML.g:1920:2: ( ruleApplyFIO )
                    // InternalFPML.g:1921:3: ruleApplyFIO
                    {
                     before(grammarAccess.getPrimitiveEffectFullFunctionAccess().getApplyFIOParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleApplyFIO();

                    state._fsp--;

                     after(grammarAccess.getPrimitiveEffectFullFunctionAccess().getApplyFIOParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveEffectFullFunction__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalFPML.g:1930:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1934:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalFPML.g:1935:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalFPML.g:1942:1: rule__Model__Group__0__Impl : ( ( rule__Model__ElementsAssignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1946:1: ( ( ( rule__Model__ElementsAssignment_0 ) ) )
            // InternalFPML.g:1947:1: ( ( rule__Model__ElementsAssignment_0 ) )
            {
            // InternalFPML.g:1947:1: ( ( rule__Model__ElementsAssignment_0 ) )
            // InternalFPML.g:1948:2: ( rule__Model__ElementsAssignment_0 )
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_0()); 
            // InternalFPML.g:1949:2: ( rule__Model__ElementsAssignment_0 )
            // InternalFPML.g:1949:3: rule__Model__ElementsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Model__ElementsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getElementsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalFPML.g:1957:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1961:1: ( rule__Model__Group__1__Impl )
            // InternalFPML.g:1962:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalFPML.g:1968:1: rule__Model__Group__1__Impl : ( ( rule__Model__ElementsAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1972:1: ( ( ( rule__Model__ElementsAssignment_1 ) ) )
            // InternalFPML.g:1973:1: ( ( rule__Model__ElementsAssignment_1 ) )
            {
            // InternalFPML.g:1973:1: ( ( rule__Model__ElementsAssignment_1 ) )
            // InternalFPML.g:1974:2: ( rule__Model__ElementsAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_1()); 
            // InternalFPML.g:1975:2: ( rule__Model__ElementsAssignment_1 )
            // InternalFPML.g:1975:3: rule__Model__ElementsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__ElementsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getElementsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__PureBlock__Group__0"
    // InternalFPML.g:1984:1: rule__PureBlock__Group__0 : rule__PureBlock__Group__0__Impl rule__PureBlock__Group__1 ;
    public final void rule__PureBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1988:1: ( rule__PureBlock__Group__0__Impl rule__PureBlock__Group__1 )
            // InternalFPML.g:1989:2: rule__PureBlock__Group__0__Impl rule__PureBlock__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__PureBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PureBlock__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureBlock__Group__0"


    // $ANTLR start "rule__PureBlock__Group__0__Impl"
    // InternalFPML.g:1996:1: rule__PureBlock__Group__0__Impl : ( 'Pure' ) ;
    public final void rule__PureBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2000:1: ( ( 'Pure' ) )
            // InternalFPML.g:2001:1: ( 'Pure' )
            {
            // InternalFPML.g:2001:1: ( 'Pure' )
            // InternalFPML.g:2002:2: 'Pure'
            {
             before(grammarAccess.getPureBlockAccess().getPureKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getPureBlockAccess().getPureKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureBlock__Group__0__Impl"


    // $ANTLR start "rule__PureBlock__Group__1"
    // InternalFPML.g:2011:1: rule__PureBlock__Group__1 : rule__PureBlock__Group__1__Impl rule__PureBlock__Group__2 ;
    public final void rule__PureBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2015:1: ( rule__PureBlock__Group__1__Impl rule__PureBlock__Group__2 )
            // InternalFPML.g:2016:2: rule__PureBlock__Group__1__Impl rule__PureBlock__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__PureBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PureBlock__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureBlock__Group__1"


    // $ANTLR start "rule__PureBlock__Group__1__Impl"
    // InternalFPML.g:2023:1: rule__PureBlock__Group__1__Impl : ( '{' ) ;
    public final void rule__PureBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2027:1: ( ( '{' ) )
            // InternalFPML.g:2028:1: ( '{' )
            {
            // InternalFPML.g:2028:1: ( '{' )
            // InternalFPML.g:2029:2: '{'
            {
             before(grammarAccess.getPureBlockAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getPureBlockAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureBlock__Group__1__Impl"


    // $ANTLR start "rule__PureBlock__Group__2"
    // InternalFPML.g:2038:1: rule__PureBlock__Group__2 : rule__PureBlock__Group__2__Impl rule__PureBlock__Group__3 ;
    public final void rule__PureBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2042:1: ( rule__PureBlock__Group__2__Impl rule__PureBlock__Group__3 )
            // InternalFPML.g:2043:2: rule__PureBlock__Group__2__Impl rule__PureBlock__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__PureBlock__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PureBlock__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureBlock__Group__2"


    // $ANTLR start "rule__PureBlock__Group__2__Impl"
    // InternalFPML.g:2050:1: rule__PureBlock__Group__2__Impl : ( ( rule__PureBlock__ElementsAssignment_2 ) ) ;
    public final void rule__PureBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2054:1: ( ( ( rule__PureBlock__ElementsAssignment_2 ) ) )
            // InternalFPML.g:2055:1: ( ( rule__PureBlock__ElementsAssignment_2 ) )
            {
            // InternalFPML.g:2055:1: ( ( rule__PureBlock__ElementsAssignment_2 ) )
            // InternalFPML.g:2056:2: ( rule__PureBlock__ElementsAssignment_2 )
            {
             before(grammarAccess.getPureBlockAccess().getElementsAssignment_2()); 
            // InternalFPML.g:2057:2: ( rule__PureBlock__ElementsAssignment_2 )
            // InternalFPML.g:2057:3: rule__PureBlock__ElementsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PureBlock__ElementsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPureBlockAccess().getElementsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureBlock__Group__2__Impl"


    // $ANTLR start "rule__PureBlock__Group__3"
    // InternalFPML.g:2065:1: rule__PureBlock__Group__3 : rule__PureBlock__Group__3__Impl rule__PureBlock__Group__4 ;
    public final void rule__PureBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2069:1: ( rule__PureBlock__Group__3__Impl rule__PureBlock__Group__4 )
            // InternalFPML.g:2070:2: rule__PureBlock__Group__3__Impl rule__PureBlock__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__PureBlock__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PureBlock__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureBlock__Group__3"


    // $ANTLR start "rule__PureBlock__Group__3__Impl"
    // InternalFPML.g:2077:1: rule__PureBlock__Group__3__Impl : ( ( rule__PureBlock__ElementsAssignment_3 ) ) ;
    public final void rule__PureBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2081:1: ( ( ( rule__PureBlock__ElementsAssignment_3 ) ) )
            // InternalFPML.g:2082:1: ( ( rule__PureBlock__ElementsAssignment_3 ) )
            {
            // InternalFPML.g:2082:1: ( ( rule__PureBlock__ElementsAssignment_3 ) )
            // InternalFPML.g:2083:2: ( rule__PureBlock__ElementsAssignment_3 )
            {
             before(grammarAccess.getPureBlockAccess().getElementsAssignment_3()); 
            // InternalFPML.g:2084:2: ( rule__PureBlock__ElementsAssignment_3 )
            // InternalFPML.g:2084:3: rule__PureBlock__ElementsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__PureBlock__ElementsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPureBlockAccess().getElementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureBlock__Group__3__Impl"


    // $ANTLR start "rule__PureBlock__Group__4"
    // InternalFPML.g:2092:1: rule__PureBlock__Group__4 : rule__PureBlock__Group__4__Impl ;
    public final void rule__PureBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2096:1: ( rule__PureBlock__Group__4__Impl )
            // InternalFPML.g:2097:2: rule__PureBlock__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PureBlock__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureBlock__Group__4"


    // $ANTLR start "rule__PureBlock__Group__4__Impl"
    // InternalFPML.g:2103:1: rule__PureBlock__Group__4__Impl : ( '}' ) ;
    public final void rule__PureBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2107:1: ( ( '}' ) )
            // InternalFPML.g:2108:1: ( '}' )
            {
            // InternalFPML.g:2108:1: ( '}' )
            // InternalFPML.g:2109:2: '}'
            {
             before(grammarAccess.getPureBlockAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPureBlockAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureBlock__Group__4__Impl"


    // $ANTLR start "rule__PureFunctionBlock__Group__0"
    // InternalFPML.g:2119:1: rule__PureFunctionBlock__Group__0 : rule__PureFunctionBlock__Group__0__Impl rule__PureFunctionBlock__Group__1 ;
    public final void rule__PureFunctionBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2123:1: ( rule__PureFunctionBlock__Group__0__Impl rule__PureFunctionBlock__Group__1 )
            // InternalFPML.g:2124:2: rule__PureFunctionBlock__Group__0__Impl rule__PureFunctionBlock__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__PureFunctionBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PureFunctionBlock__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunctionBlock__Group__0"


    // $ANTLR start "rule__PureFunctionBlock__Group__0__Impl"
    // InternalFPML.g:2131:1: rule__PureFunctionBlock__Group__0__Impl : ( 'Functions' ) ;
    public final void rule__PureFunctionBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2135:1: ( ( 'Functions' ) )
            // InternalFPML.g:2136:1: ( 'Functions' )
            {
            // InternalFPML.g:2136:1: ( 'Functions' )
            // InternalFPML.g:2137:2: 'Functions'
            {
             before(grammarAccess.getPureFunctionBlockAccess().getFunctionsKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPureFunctionBlockAccess().getFunctionsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunctionBlock__Group__0__Impl"


    // $ANTLR start "rule__PureFunctionBlock__Group__1"
    // InternalFPML.g:2146:1: rule__PureFunctionBlock__Group__1 : rule__PureFunctionBlock__Group__1__Impl rule__PureFunctionBlock__Group__2 ;
    public final void rule__PureFunctionBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2150:1: ( rule__PureFunctionBlock__Group__1__Impl rule__PureFunctionBlock__Group__2 )
            // InternalFPML.g:2151:2: rule__PureFunctionBlock__Group__1__Impl rule__PureFunctionBlock__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__PureFunctionBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PureFunctionBlock__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunctionBlock__Group__1"


    // $ANTLR start "rule__PureFunctionBlock__Group__1__Impl"
    // InternalFPML.g:2158:1: rule__PureFunctionBlock__Group__1__Impl : ( '{' ) ;
    public final void rule__PureFunctionBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2162:1: ( ( '{' ) )
            // InternalFPML.g:2163:1: ( '{' )
            {
            // InternalFPML.g:2163:1: ( '{' )
            // InternalFPML.g:2164:2: '{'
            {
             before(grammarAccess.getPureFunctionBlockAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getPureFunctionBlockAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunctionBlock__Group__1__Impl"


    // $ANTLR start "rule__PureFunctionBlock__Group__2"
    // InternalFPML.g:2173:1: rule__PureFunctionBlock__Group__2 : rule__PureFunctionBlock__Group__2__Impl rule__PureFunctionBlock__Group__3 ;
    public final void rule__PureFunctionBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2177:1: ( rule__PureFunctionBlock__Group__2__Impl rule__PureFunctionBlock__Group__3 )
            // InternalFPML.g:2178:2: rule__PureFunctionBlock__Group__2__Impl rule__PureFunctionBlock__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__PureFunctionBlock__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PureFunctionBlock__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunctionBlock__Group__2"


    // $ANTLR start "rule__PureFunctionBlock__Group__2__Impl"
    // InternalFPML.g:2185:1: rule__PureFunctionBlock__Group__2__Impl : ( ( rule__PureFunctionBlock__FeaturesAssignment_2 )* ) ;
    public final void rule__PureFunctionBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2189:1: ( ( ( rule__PureFunctionBlock__FeaturesAssignment_2 )* ) )
            // InternalFPML.g:2190:1: ( ( rule__PureFunctionBlock__FeaturesAssignment_2 )* )
            {
            // InternalFPML.g:2190:1: ( ( rule__PureFunctionBlock__FeaturesAssignment_2 )* )
            // InternalFPML.g:2191:2: ( rule__PureFunctionBlock__FeaturesAssignment_2 )*
            {
             before(grammarAccess.getPureFunctionBlockAccess().getFeaturesAssignment_2()); 
            // InternalFPML.g:2192:2: ( rule__PureFunctionBlock__FeaturesAssignment_2 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==23) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalFPML.g:2192:3: rule__PureFunctionBlock__FeaturesAssignment_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__PureFunctionBlock__FeaturesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getPureFunctionBlockAccess().getFeaturesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunctionBlock__Group__2__Impl"


    // $ANTLR start "rule__PureFunctionBlock__Group__3"
    // InternalFPML.g:2200:1: rule__PureFunctionBlock__Group__3 : rule__PureFunctionBlock__Group__3__Impl ;
    public final void rule__PureFunctionBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2204:1: ( rule__PureFunctionBlock__Group__3__Impl )
            // InternalFPML.g:2205:2: rule__PureFunctionBlock__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PureFunctionBlock__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunctionBlock__Group__3"


    // $ANTLR start "rule__PureFunctionBlock__Group__3__Impl"
    // InternalFPML.g:2211:1: rule__PureFunctionBlock__Group__3__Impl : ( '}' ) ;
    public final void rule__PureFunctionBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2215:1: ( ( '}' ) )
            // InternalFPML.g:2216:1: ( '}' )
            {
            // InternalFPML.g:2216:1: ( '}' )
            // InternalFPML.g:2217:2: '}'
            {
             before(grammarAccess.getPureFunctionBlockAccess().getRightCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPureFunctionBlockAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunctionBlock__Group__3__Impl"


    // $ANTLR start "rule__DataBlock__Group__0"
    // InternalFPML.g:2227:1: rule__DataBlock__Group__0 : rule__DataBlock__Group__0__Impl rule__DataBlock__Group__1 ;
    public final void rule__DataBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2231:1: ( rule__DataBlock__Group__0__Impl rule__DataBlock__Group__1 )
            // InternalFPML.g:2232:2: rule__DataBlock__Group__0__Impl rule__DataBlock__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__DataBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataBlock__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataBlock__Group__0"


    // $ANTLR start "rule__DataBlock__Group__0__Impl"
    // InternalFPML.g:2239:1: rule__DataBlock__Group__0__Impl : ( 'Data' ) ;
    public final void rule__DataBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2243:1: ( ( 'Data' ) )
            // InternalFPML.g:2244:1: ( 'Data' )
            {
            // InternalFPML.g:2244:1: ( 'Data' )
            // InternalFPML.g:2245:2: 'Data'
            {
             before(grammarAccess.getDataBlockAccess().getDataKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getDataBlockAccess().getDataKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataBlock__Group__0__Impl"


    // $ANTLR start "rule__DataBlock__Group__1"
    // InternalFPML.g:2254:1: rule__DataBlock__Group__1 : rule__DataBlock__Group__1__Impl rule__DataBlock__Group__2 ;
    public final void rule__DataBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2258:1: ( rule__DataBlock__Group__1__Impl rule__DataBlock__Group__2 )
            // InternalFPML.g:2259:2: rule__DataBlock__Group__1__Impl rule__DataBlock__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__DataBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataBlock__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataBlock__Group__1"


    // $ANTLR start "rule__DataBlock__Group__1__Impl"
    // InternalFPML.g:2266:1: rule__DataBlock__Group__1__Impl : ( '{' ) ;
    public final void rule__DataBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2270:1: ( ( '{' ) )
            // InternalFPML.g:2271:1: ( '{' )
            {
            // InternalFPML.g:2271:1: ( '{' )
            // InternalFPML.g:2272:2: '{'
            {
             before(grammarAccess.getDataBlockAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getDataBlockAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataBlock__Group__1__Impl"


    // $ANTLR start "rule__DataBlock__Group__2"
    // InternalFPML.g:2281:1: rule__DataBlock__Group__2 : rule__DataBlock__Group__2__Impl rule__DataBlock__Group__3 ;
    public final void rule__DataBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2285:1: ( rule__DataBlock__Group__2__Impl rule__DataBlock__Group__3 )
            // InternalFPML.g:2286:2: rule__DataBlock__Group__2__Impl rule__DataBlock__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__DataBlock__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataBlock__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataBlock__Group__2"


    // $ANTLR start "rule__DataBlock__Group__2__Impl"
    // InternalFPML.g:2293:1: rule__DataBlock__Group__2__Impl : ( ( rule__DataBlock__ElementsAssignment_2 )* ) ;
    public final void rule__DataBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2297:1: ( ( ( rule__DataBlock__ElementsAssignment_2 )* ) )
            // InternalFPML.g:2298:1: ( ( rule__DataBlock__ElementsAssignment_2 )* )
            {
            // InternalFPML.g:2298:1: ( ( rule__DataBlock__ElementsAssignment_2 )* )
            // InternalFPML.g:2299:2: ( rule__DataBlock__ElementsAssignment_2 )*
            {
             before(grammarAccess.getDataBlockAccess().getElementsAssignment_2()); 
            // InternalFPML.g:2300:2: ( rule__DataBlock__ElementsAssignment_2 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalFPML.g:2300:3: rule__DataBlock__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__DataBlock__ElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getDataBlockAccess().getElementsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataBlock__Group__2__Impl"


    // $ANTLR start "rule__DataBlock__Group__3"
    // InternalFPML.g:2308:1: rule__DataBlock__Group__3 : rule__DataBlock__Group__3__Impl rule__DataBlock__Group__4 ;
    public final void rule__DataBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2312:1: ( rule__DataBlock__Group__3__Impl rule__DataBlock__Group__4 )
            // InternalFPML.g:2313:2: rule__DataBlock__Group__3__Impl rule__DataBlock__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__DataBlock__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataBlock__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataBlock__Group__3"


    // $ANTLR start "rule__DataBlock__Group__3__Impl"
    // InternalFPML.g:2320:1: rule__DataBlock__Group__3__Impl : ( ( rule__DataBlock__ValueAssignment_3 ) ) ;
    public final void rule__DataBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2324:1: ( ( ( rule__DataBlock__ValueAssignment_3 ) ) )
            // InternalFPML.g:2325:1: ( ( rule__DataBlock__ValueAssignment_3 ) )
            {
            // InternalFPML.g:2325:1: ( ( rule__DataBlock__ValueAssignment_3 ) )
            // InternalFPML.g:2326:2: ( rule__DataBlock__ValueAssignment_3 )
            {
             before(grammarAccess.getDataBlockAccess().getValueAssignment_3()); 
            // InternalFPML.g:2327:2: ( rule__DataBlock__ValueAssignment_3 )
            // InternalFPML.g:2327:3: rule__DataBlock__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__DataBlock__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDataBlockAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataBlock__Group__3__Impl"


    // $ANTLR start "rule__DataBlock__Group__4"
    // InternalFPML.g:2335:1: rule__DataBlock__Group__4 : rule__DataBlock__Group__4__Impl ;
    public final void rule__DataBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2339:1: ( rule__DataBlock__Group__4__Impl )
            // InternalFPML.g:2340:2: rule__DataBlock__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataBlock__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataBlock__Group__4"


    // $ANTLR start "rule__DataBlock__Group__4__Impl"
    // InternalFPML.g:2346:1: rule__DataBlock__Group__4__Impl : ( '}' ) ;
    public final void rule__DataBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2350:1: ( ( '}' ) )
            // InternalFPML.g:2351:1: ( '}' )
            {
            // InternalFPML.g:2351:1: ( '}' )
            // InternalFPML.g:2352:2: '}'
            {
             before(grammarAccess.getDataBlockAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getDataBlockAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataBlock__Group__4__Impl"


    // $ANTLR start "rule__ValueBlock__Group__0"
    // InternalFPML.g:2362:1: rule__ValueBlock__Group__0 : rule__ValueBlock__Group__0__Impl rule__ValueBlock__Group__1 ;
    public final void rule__ValueBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2366:1: ( rule__ValueBlock__Group__0__Impl rule__ValueBlock__Group__1 )
            // InternalFPML.g:2367:2: rule__ValueBlock__Group__0__Impl rule__ValueBlock__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ValueBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValueBlock__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueBlock__Group__0"


    // $ANTLR start "rule__ValueBlock__Group__0__Impl"
    // InternalFPML.g:2374:1: rule__ValueBlock__Group__0__Impl : ( 'Value' ) ;
    public final void rule__ValueBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2378:1: ( ( 'Value' ) )
            // InternalFPML.g:2379:1: ( 'Value' )
            {
            // InternalFPML.g:2379:1: ( 'Value' )
            // InternalFPML.g:2380:2: 'Value'
            {
             before(grammarAccess.getValueBlockAccess().getValueKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getValueBlockAccess().getValueKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueBlock__Group__0__Impl"


    // $ANTLR start "rule__ValueBlock__Group__1"
    // InternalFPML.g:2389:1: rule__ValueBlock__Group__1 : rule__ValueBlock__Group__1__Impl rule__ValueBlock__Group__2 ;
    public final void rule__ValueBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2393:1: ( rule__ValueBlock__Group__1__Impl rule__ValueBlock__Group__2 )
            // InternalFPML.g:2394:2: rule__ValueBlock__Group__1__Impl rule__ValueBlock__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__ValueBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValueBlock__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueBlock__Group__1"


    // $ANTLR start "rule__ValueBlock__Group__1__Impl"
    // InternalFPML.g:2401:1: rule__ValueBlock__Group__1__Impl : ( '{' ) ;
    public final void rule__ValueBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2405:1: ( ( '{' ) )
            // InternalFPML.g:2406:1: ( '{' )
            {
            // InternalFPML.g:2406:1: ( '{' )
            // InternalFPML.g:2407:2: '{'
            {
             before(grammarAccess.getValueBlockAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getValueBlockAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueBlock__Group__1__Impl"


    // $ANTLR start "rule__ValueBlock__Group__2"
    // InternalFPML.g:2416:1: rule__ValueBlock__Group__2 : rule__ValueBlock__Group__2__Impl rule__ValueBlock__Group__3 ;
    public final void rule__ValueBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2420:1: ( rule__ValueBlock__Group__2__Impl rule__ValueBlock__Group__3 )
            // InternalFPML.g:2421:2: rule__ValueBlock__Group__2__Impl rule__ValueBlock__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__ValueBlock__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValueBlock__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueBlock__Group__2"


    // $ANTLR start "rule__ValueBlock__Group__2__Impl"
    // InternalFPML.g:2428:1: rule__ValueBlock__Group__2__Impl : ( ( rule__ValueBlock__ElementsAssignment_2 )* ) ;
    public final void rule__ValueBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2432:1: ( ( ( rule__ValueBlock__ElementsAssignment_2 )* ) )
            // InternalFPML.g:2433:1: ( ( rule__ValueBlock__ElementsAssignment_2 )* )
            {
            // InternalFPML.g:2433:1: ( ( rule__ValueBlock__ElementsAssignment_2 )* )
            // InternalFPML.g:2434:2: ( rule__ValueBlock__ElementsAssignment_2 )*
            {
             before(grammarAccess.getValueBlockAccess().getElementsAssignment_2()); 
            // InternalFPML.g:2435:2: ( rule__ValueBlock__ElementsAssignment_2 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalFPML.g:2435:3: rule__ValueBlock__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ValueBlock__ElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getValueBlockAccess().getElementsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueBlock__Group__2__Impl"


    // $ANTLR start "rule__ValueBlock__Group__3"
    // InternalFPML.g:2443:1: rule__ValueBlock__Group__3 : rule__ValueBlock__Group__3__Impl ;
    public final void rule__ValueBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2447:1: ( rule__ValueBlock__Group__3__Impl )
            // InternalFPML.g:2448:2: rule__ValueBlock__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ValueBlock__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueBlock__Group__3"


    // $ANTLR start "rule__ValueBlock__Group__3__Impl"
    // InternalFPML.g:2454:1: rule__ValueBlock__Group__3__Impl : ( '}' ) ;
    public final void rule__ValueBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2458:1: ( ( '}' ) )
            // InternalFPML.g:2459:1: ( '}' )
            {
            // InternalFPML.g:2459:1: ( '}' )
            // InternalFPML.g:2460:2: '}'
            {
             before(grammarAccess.getValueBlockAccess().getRightCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getValueBlockAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueBlock__Group__3__Impl"


    // $ANTLR start "rule__EffectFullBlock__Group__0"
    // InternalFPML.g:2470:1: rule__EffectFullBlock__Group__0 : rule__EffectFullBlock__Group__0__Impl rule__EffectFullBlock__Group__1 ;
    public final void rule__EffectFullBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2474:1: ( rule__EffectFullBlock__Group__0__Impl rule__EffectFullBlock__Group__1 )
            // InternalFPML.g:2475:2: rule__EffectFullBlock__Group__0__Impl rule__EffectFullBlock__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__EffectFullBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullBlock__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullBlock__Group__0"


    // $ANTLR start "rule__EffectFullBlock__Group__0__Impl"
    // InternalFPML.g:2482:1: rule__EffectFullBlock__Group__0__Impl : ( 'Effects' ) ;
    public final void rule__EffectFullBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2486:1: ( ( 'Effects' ) )
            // InternalFPML.g:2487:1: ( 'Effects' )
            {
            // InternalFPML.g:2487:1: ( 'Effects' )
            // InternalFPML.g:2488:2: 'Effects'
            {
             before(grammarAccess.getEffectFullBlockAccess().getEffectsKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getEffectFullBlockAccess().getEffectsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullBlock__Group__0__Impl"


    // $ANTLR start "rule__EffectFullBlock__Group__1"
    // InternalFPML.g:2497:1: rule__EffectFullBlock__Group__1 : rule__EffectFullBlock__Group__1__Impl rule__EffectFullBlock__Group__2 ;
    public final void rule__EffectFullBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2501:1: ( rule__EffectFullBlock__Group__1__Impl rule__EffectFullBlock__Group__2 )
            // InternalFPML.g:2502:2: rule__EffectFullBlock__Group__1__Impl rule__EffectFullBlock__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__EffectFullBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullBlock__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullBlock__Group__1"


    // $ANTLR start "rule__EffectFullBlock__Group__1__Impl"
    // InternalFPML.g:2509:1: rule__EffectFullBlock__Group__1__Impl : ( '{' ) ;
    public final void rule__EffectFullBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2513:1: ( ( '{' ) )
            // InternalFPML.g:2514:1: ( '{' )
            {
            // InternalFPML.g:2514:1: ( '{' )
            // InternalFPML.g:2515:2: '{'
            {
             before(grammarAccess.getEffectFullBlockAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getEffectFullBlockAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullBlock__Group__1__Impl"


    // $ANTLR start "rule__EffectFullBlock__Group__2"
    // InternalFPML.g:2524:1: rule__EffectFullBlock__Group__2 : rule__EffectFullBlock__Group__2__Impl rule__EffectFullBlock__Group__3 ;
    public final void rule__EffectFullBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2528:1: ( rule__EffectFullBlock__Group__2__Impl rule__EffectFullBlock__Group__3 )
            // InternalFPML.g:2529:2: rule__EffectFullBlock__Group__2__Impl rule__EffectFullBlock__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__EffectFullBlock__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullBlock__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullBlock__Group__2"


    // $ANTLR start "rule__EffectFullBlock__Group__2__Impl"
    // InternalFPML.g:2536:1: rule__EffectFullBlock__Group__2__Impl : ( ( rule__EffectFullBlock__FeaturesAssignment_2 )* ) ;
    public final void rule__EffectFullBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2540:1: ( ( ( rule__EffectFullBlock__FeaturesAssignment_2 )* ) )
            // InternalFPML.g:2541:1: ( ( rule__EffectFullBlock__FeaturesAssignment_2 )* )
            {
            // InternalFPML.g:2541:1: ( ( rule__EffectFullBlock__FeaturesAssignment_2 )* )
            // InternalFPML.g:2542:2: ( rule__EffectFullBlock__FeaturesAssignment_2 )*
            {
             before(grammarAccess.getEffectFullBlockAccess().getFeaturesAssignment_2()); 
            // InternalFPML.g:2543:2: ( rule__EffectFullBlock__FeaturesAssignment_2 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==23) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalFPML.g:2543:3: rule__EffectFullBlock__FeaturesAssignment_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__EffectFullBlock__FeaturesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getEffectFullBlockAccess().getFeaturesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullBlock__Group__2__Impl"


    // $ANTLR start "rule__EffectFullBlock__Group__3"
    // InternalFPML.g:2551:1: rule__EffectFullBlock__Group__3 : rule__EffectFullBlock__Group__3__Impl rule__EffectFullBlock__Group__4 ;
    public final void rule__EffectFullBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2555:1: ( rule__EffectFullBlock__Group__3__Impl rule__EffectFullBlock__Group__4 )
            // InternalFPML.g:2556:2: rule__EffectFullBlock__Group__3__Impl rule__EffectFullBlock__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__EffectFullBlock__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullBlock__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullBlock__Group__3"


    // $ANTLR start "rule__EffectFullBlock__Group__3__Impl"
    // InternalFPML.g:2563:1: rule__EffectFullBlock__Group__3__Impl : ( ( rule__EffectFullBlock__MainAssignment_3 ) ) ;
    public final void rule__EffectFullBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2567:1: ( ( ( rule__EffectFullBlock__MainAssignment_3 ) ) )
            // InternalFPML.g:2568:1: ( ( rule__EffectFullBlock__MainAssignment_3 ) )
            {
            // InternalFPML.g:2568:1: ( ( rule__EffectFullBlock__MainAssignment_3 ) )
            // InternalFPML.g:2569:2: ( rule__EffectFullBlock__MainAssignment_3 )
            {
             before(grammarAccess.getEffectFullBlockAccess().getMainAssignment_3()); 
            // InternalFPML.g:2570:2: ( rule__EffectFullBlock__MainAssignment_3 )
            // InternalFPML.g:2570:3: rule__EffectFullBlock__MainAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullBlock__MainAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEffectFullBlockAccess().getMainAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullBlock__Group__3__Impl"


    // $ANTLR start "rule__EffectFullBlock__Group__4"
    // InternalFPML.g:2578:1: rule__EffectFullBlock__Group__4 : rule__EffectFullBlock__Group__4__Impl ;
    public final void rule__EffectFullBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2582:1: ( rule__EffectFullBlock__Group__4__Impl )
            // InternalFPML.g:2583:2: rule__EffectFullBlock__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullBlock__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullBlock__Group__4"


    // $ANTLR start "rule__EffectFullBlock__Group__4__Impl"
    // InternalFPML.g:2589:1: rule__EffectFullBlock__Group__4__Impl : ( '}' ) ;
    public final void rule__EffectFullBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2593:1: ( ( '}' ) )
            // InternalFPML.g:2594:1: ( '}' )
            {
            // InternalFPML.g:2594:1: ( '}' )
            // InternalFPML.g:2595:2: '}'
            {
             before(grammarAccess.getEffectFullBlockAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getEffectFullBlockAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullBlock__Group__4__Impl"


    // $ANTLR start "rule__Data__Group__0"
    // InternalFPML.g:2605:1: rule__Data__Group__0 : rule__Data__Group__0__Impl rule__Data__Group__1 ;
    public final void rule__Data__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2609:1: ( rule__Data__Group__0__Impl rule__Data__Group__1 )
            // InternalFPML.g:2610:2: rule__Data__Group__0__Impl rule__Data__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Data__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group__0"


    // $ANTLR start "rule__Data__Group__0__Impl"
    // InternalFPML.g:2617:1: rule__Data__Group__0__Impl : ( ( rule__Data__NameAssignment_0 ) ) ;
    public final void rule__Data__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2621:1: ( ( ( rule__Data__NameAssignment_0 ) ) )
            // InternalFPML.g:2622:1: ( ( rule__Data__NameAssignment_0 ) )
            {
            // InternalFPML.g:2622:1: ( ( rule__Data__NameAssignment_0 ) )
            // InternalFPML.g:2623:2: ( rule__Data__NameAssignment_0 )
            {
             before(grammarAccess.getDataAccess().getNameAssignment_0()); 
            // InternalFPML.g:2624:2: ( rule__Data__NameAssignment_0 )
            // InternalFPML.g:2624:3: rule__Data__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Data__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDataAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group__0__Impl"


    // $ANTLR start "rule__Data__Group__1"
    // InternalFPML.g:2632:1: rule__Data__Group__1 : rule__Data__Group__1__Impl rule__Data__Group__2 ;
    public final void rule__Data__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2636:1: ( rule__Data__Group__1__Impl rule__Data__Group__2 )
            // InternalFPML.g:2637:2: rule__Data__Group__1__Impl rule__Data__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Data__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group__1"


    // $ANTLR start "rule__Data__Group__1__Impl"
    // InternalFPML.g:2644:1: rule__Data__Group__1__Impl : ( ':' ) ;
    public final void rule__Data__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2648:1: ( ( ':' ) )
            // InternalFPML.g:2649:1: ( ':' )
            {
            // InternalFPML.g:2649:1: ( ':' )
            // InternalFPML.g:2650:2: ':'
            {
             before(grammarAccess.getDataAccess().getColonKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getDataAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group__1__Impl"


    // $ANTLR start "rule__Data__Group__2"
    // InternalFPML.g:2659:1: rule__Data__Group__2 : rule__Data__Group__2__Impl ;
    public final void rule__Data__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2663:1: ( rule__Data__Group__2__Impl )
            // InternalFPML.g:2664:2: rule__Data__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Data__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group__2"


    // $ANTLR start "rule__Data__Group__2__Impl"
    // InternalFPML.g:2670:1: rule__Data__Group__2__Impl : ( ( rule__Data__ContentAssignment_2 ) ) ;
    public final void rule__Data__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2674:1: ( ( ( rule__Data__ContentAssignment_2 ) ) )
            // InternalFPML.g:2675:1: ( ( rule__Data__ContentAssignment_2 ) )
            {
            // InternalFPML.g:2675:1: ( ( rule__Data__ContentAssignment_2 ) )
            // InternalFPML.g:2676:2: ( rule__Data__ContentAssignment_2 )
            {
             before(grammarAccess.getDataAccess().getContentAssignment_2()); 
            // InternalFPML.g:2677:2: ( rule__Data__ContentAssignment_2 )
            // InternalFPML.g:2677:3: rule__Data__ContentAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Data__ContentAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDataAccess().getContentAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group__2__Impl"


    // $ANTLR start "rule__Value__Group__0"
    // InternalFPML.g:2686:1: rule__Value__Group__0 : rule__Value__Group__0__Impl rule__Value__Group__1 ;
    public final void rule__Value__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2690:1: ( rule__Value__Group__0__Impl rule__Value__Group__1 )
            // InternalFPML.g:2691:2: rule__Value__Group__0__Impl rule__Value__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Value__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group__0"


    // $ANTLR start "rule__Value__Group__0__Impl"
    // InternalFPML.g:2698:1: rule__Value__Group__0__Impl : ( ( rule__Value__NameAssignment_0 ) ) ;
    public final void rule__Value__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2702:1: ( ( ( rule__Value__NameAssignment_0 ) ) )
            // InternalFPML.g:2703:1: ( ( rule__Value__NameAssignment_0 ) )
            {
            // InternalFPML.g:2703:1: ( ( rule__Value__NameAssignment_0 ) )
            // InternalFPML.g:2704:2: ( rule__Value__NameAssignment_0 )
            {
             before(grammarAccess.getValueAccess().getNameAssignment_0()); 
            // InternalFPML.g:2705:2: ( rule__Value__NameAssignment_0 )
            // InternalFPML.g:2705:3: rule__Value__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Value__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group__0__Impl"


    // $ANTLR start "rule__Value__Group__1"
    // InternalFPML.g:2713:1: rule__Value__Group__1 : rule__Value__Group__1__Impl rule__Value__Group__2 ;
    public final void rule__Value__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2717:1: ( rule__Value__Group__1__Impl rule__Value__Group__2 )
            // InternalFPML.g:2718:2: rule__Value__Group__1__Impl rule__Value__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Value__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group__1"


    // $ANTLR start "rule__Value__Group__1__Impl"
    // InternalFPML.g:2725:1: rule__Value__Group__1__Impl : ( ':' ) ;
    public final void rule__Value__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2729:1: ( ( ':' ) )
            // InternalFPML.g:2730:1: ( ':' )
            {
            // InternalFPML.g:2730:1: ( ':' )
            // InternalFPML.g:2731:2: ':'
            {
             before(grammarAccess.getValueAccess().getColonKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group__1__Impl"


    // $ANTLR start "rule__Value__Group__2"
    // InternalFPML.g:2740:1: rule__Value__Group__2 : rule__Value__Group__2__Impl ;
    public final void rule__Value__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2744:1: ( rule__Value__Group__2__Impl )
            // InternalFPML.g:2745:2: rule__Value__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Value__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group__2"


    // $ANTLR start "rule__Value__Group__2__Impl"
    // InternalFPML.g:2751:1: rule__Value__Group__2__Impl : ( ( rule__Value__ValueAssignment_2 ) ) ;
    public final void rule__Value__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2755:1: ( ( ( rule__Value__ValueAssignment_2 ) ) )
            // InternalFPML.g:2756:1: ( ( rule__Value__ValueAssignment_2 ) )
            {
            // InternalFPML.g:2756:1: ( ( rule__Value__ValueAssignment_2 ) )
            // InternalFPML.g:2757:2: ( rule__Value__ValueAssignment_2 )
            {
             before(grammarAccess.getValueAccess().getValueAssignment_2()); 
            // InternalFPML.g:2758:2: ( rule__Value__ValueAssignment_2 )
            // InternalFPML.g:2758:3: rule__Value__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Value__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group__2__Impl"


    // $ANTLR start "rule__AdtType__Group_1__0"
    // InternalFPML.g:2767:1: rule__AdtType__Group_1__0 : rule__AdtType__Group_1__0__Impl rule__AdtType__Group_1__1 ;
    public final void rule__AdtType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2771:1: ( rule__AdtType__Group_1__0__Impl rule__AdtType__Group_1__1 )
            // InternalFPML.g:2772:2: rule__AdtType__Group_1__0__Impl rule__AdtType__Group_1__1
            {
            pushFollow(FOLLOW_15);
            rule__AdtType__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdtType__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdtType__Group_1__0"


    // $ANTLR start "rule__AdtType__Group_1__0__Impl"
    // InternalFPML.g:2779:1: rule__AdtType__Group_1__0__Impl : ( '[' ) ;
    public final void rule__AdtType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2783:1: ( ( '[' ) )
            // InternalFPML.g:2784:1: ( '[' )
            {
            // InternalFPML.g:2784:1: ( '[' )
            // InternalFPML.g:2785:2: '['
            {
             before(grammarAccess.getAdtTypeAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getAdtTypeAccess().getLeftSquareBracketKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdtType__Group_1__0__Impl"


    // $ANTLR start "rule__AdtType__Group_1__1"
    // InternalFPML.g:2794:1: rule__AdtType__Group_1__1 : rule__AdtType__Group_1__1__Impl rule__AdtType__Group_1__2 ;
    public final void rule__AdtType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2798:1: ( rule__AdtType__Group_1__1__Impl rule__AdtType__Group_1__2 )
            // InternalFPML.g:2799:2: rule__AdtType__Group_1__1__Impl rule__AdtType__Group_1__2
            {
            pushFollow(FOLLOW_17);
            rule__AdtType__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdtType__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdtType__Group_1__1"


    // $ANTLR start "rule__AdtType__Group_1__1__Impl"
    // InternalFPML.g:2806:1: rule__AdtType__Group_1__1__Impl : ( ( rule__AdtType__AdtElement1Assignment_1_1 ) ) ;
    public final void rule__AdtType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2810:1: ( ( ( rule__AdtType__AdtElement1Assignment_1_1 ) ) )
            // InternalFPML.g:2811:1: ( ( rule__AdtType__AdtElement1Assignment_1_1 ) )
            {
            // InternalFPML.g:2811:1: ( ( rule__AdtType__AdtElement1Assignment_1_1 ) )
            // InternalFPML.g:2812:2: ( rule__AdtType__AdtElement1Assignment_1_1 )
            {
             before(grammarAccess.getAdtTypeAccess().getAdtElement1Assignment_1_1()); 
            // InternalFPML.g:2813:2: ( rule__AdtType__AdtElement1Assignment_1_1 )
            // InternalFPML.g:2813:3: rule__AdtType__AdtElement1Assignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AdtType__AdtElement1Assignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAdtTypeAccess().getAdtElement1Assignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdtType__Group_1__1__Impl"


    // $ANTLR start "rule__AdtType__Group_1__2"
    // InternalFPML.g:2821:1: rule__AdtType__Group_1__2 : rule__AdtType__Group_1__2__Impl rule__AdtType__Group_1__3 ;
    public final void rule__AdtType__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2825:1: ( rule__AdtType__Group_1__2__Impl rule__AdtType__Group_1__3 )
            // InternalFPML.g:2826:2: rule__AdtType__Group_1__2__Impl rule__AdtType__Group_1__3
            {
            pushFollow(FOLLOW_18);
            rule__AdtType__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdtType__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdtType__Group_1__2"


    // $ANTLR start "rule__AdtType__Group_1__2__Impl"
    // InternalFPML.g:2833:1: rule__AdtType__Group_1__2__Impl : ( ( rule__AdtType__AdtElement2Assignment_1_2 ) ) ;
    public final void rule__AdtType__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2837:1: ( ( ( rule__AdtType__AdtElement2Assignment_1_2 ) ) )
            // InternalFPML.g:2838:1: ( ( rule__AdtType__AdtElement2Assignment_1_2 ) )
            {
            // InternalFPML.g:2838:1: ( ( rule__AdtType__AdtElement2Assignment_1_2 ) )
            // InternalFPML.g:2839:2: ( rule__AdtType__AdtElement2Assignment_1_2 )
            {
             before(grammarAccess.getAdtTypeAccess().getAdtElement2Assignment_1_2()); 
            // InternalFPML.g:2840:2: ( rule__AdtType__AdtElement2Assignment_1_2 )
            // InternalFPML.g:2840:3: rule__AdtType__AdtElement2Assignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__AdtType__AdtElement2Assignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAdtTypeAccess().getAdtElement2Assignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdtType__Group_1__2__Impl"


    // $ANTLR start "rule__AdtType__Group_1__3"
    // InternalFPML.g:2848:1: rule__AdtType__Group_1__3 : rule__AdtType__Group_1__3__Impl ;
    public final void rule__AdtType__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2852:1: ( rule__AdtType__Group_1__3__Impl )
            // InternalFPML.g:2853:2: rule__AdtType__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AdtType__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdtType__Group_1__3"


    // $ANTLR start "rule__AdtType__Group_1__3__Impl"
    // InternalFPML.g:2859:1: rule__AdtType__Group_1__3__Impl : ( ']' ) ;
    public final void rule__AdtType__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2863:1: ( ( ']' ) )
            // InternalFPML.g:2864:1: ( ']' )
            {
            // InternalFPML.g:2864:1: ( ']' )
            // InternalFPML.g:2865:2: ']'
            {
             before(grammarAccess.getAdtTypeAccess().getRightSquareBracketKeyword_1_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAdtTypeAccess().getRightSquareBracketKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdtType__Group_1__3__Impl"


    // $ANTLR start "rule__SumType__Group__0"
    // InternalFPML.g:2875:1: rule__SumType__Group__0 : rule__SumType__Group__0__Impl rule__SumType__Group__1 ;
    public final void rule__SumType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2879:1: ( rule__SumType__Group__0__Impl rule__SumType__Group__1 )
            // InternalFPML.g:2880:2: rule__SumType__Group__0__Impl rule__SumType__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__SumType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SumType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SumType__Group__0"


    // $ANTLR start "rule__SumType__Group__0__Impl"
    // InternalFPML.g:2887:1: rule__SumType__Group__0__Impl : ( '+' ) ;
    public final void rule__SumType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2891:1: ( ( '+' ) )
            // InternalFPML.g:2892:1: ( '+' )
            {
            // InternalFPML.g:2892:1: ( '+' )
            // InternalFPML.g:2893:2: '+'
            {
             before(grammarAccess.getSumTypeAccess().getPlusSignKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSumTypeAccess().getPlusSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SumType__Group__0__Impl"


    // $ANTLR start "rule__SumType__Group__1"
    // InternalFPML.g:2902:1: rule__SumType__Group__1 : rule__SumType__Group__1__Impl ;
    public final void rule__SumType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2906:1: ( rule__SumType__Group__1__Impl )
            // InternalFPML.g:2907:2: rule__SumType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SumType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SumType__Group__1"


    // $ANTLR start "rule__SumType__Group__1__Impl"
    // InternalFPML.g:2913:1: rule__SumType__Group__1__Impl : ( ( rule__SumType__AdtElementAssignment_1 ) ) ;
    public final void rule__SumType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2917:1: ( ( ( rule__SumType__AdtElementAssignment_1 ) ) )
            // InternalFPML.g:2918:1: ( ( rule__SumType__AdtElementAssignment_1 ) )
            {
            // InternalFPML.g:2918:1: ( ( rule__SumType__AdtElementAssignment_1 ) )
            // InternalFPML.g:2919:2: ( rule__SumType__AdtElementAssignment_1 )
            {
             before(grammarAccess.getSumTypeAccess().getAdtElementAssignment_1()); 
            // InternalFPML.g:2920:2: ( rule__SumType__AdtElementAssignment_1 )
            // InternalFPML.g:2920:3: rule__SumType__AdtElementAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SumType__AdtElementAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSumTypeAccess().getAdtElementAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SumType__Group__1__Impl"


    // $ANTLR start "rule__ProdType__Group__0"
    // InternalFPML.g:2929:1: rule__ProdType__Group__0 : rule__ProdType__Group__0__Impl rule__ProdType__Group__1 ;
    public final void rule__ProdType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2933:1: ( rule__ProdType__Group__0__Impl rule__ProdType__Group__1 )
            // InternalFPML.g:2934:2: rule__ProdType__Group__0__Impl rule__ProdType__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__ProdType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProdType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProdType__Group__0"


    // $ANTLR start "rule__ProdType__Group__0__Impl"
    // InternalFPML.g:2941:1: rule__ProdType__Group__0__Impl : ( '*' ) ;
    public final void rule__ProdType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2945:1: ( ( '*' ) )
            // InternalFPML.g:2946:1: ( '*' )
            {
            // InternalFPML.g:2946:1: ( '*' )
            // InternalFPML.g:2947:2: '*'
            {
             before(grammarAccess.getProdTypeAccess().getAsteriskKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getProdTypeAccess().getAsteriskKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProdType__Group__0__Impl"


    // $ANTLR start "rule__ProdType__Group__1"
    // InternalFPML.g:2956:1: rule__ProdType__Group__1 : rule__ProdType__Group__1__Impl ;
    public final void rule__ProdType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2960:1: ( rule__ProdType__Group__1__Impl )
            // InternalFPML.g:2961:2: rule__ProdType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProdType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProdType__Group__1"


    // $ANTLR start "rule__ProdType__Group__1__Impl"
    // InternalFPML.g:2967:1: rule__ProdType__Group__1__Impl : ( ( rule__ProdType__AdtElementAssignment_1 ) ) ;
    public final void rule__ProdType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2971:1: ( ( ( rule__ProdType__AdtElementAssignment_1 ) ) )
            // InternalFPML.g:2972:1: ( ( rule__ProdType__AdtElementAssignment_1 ) )
            {
            // InternalFPML.g:2972:1: ( ( rule__ProdType__AdtElementAssignment_1 ) )
            // InternalFPML.g:2973:2: ( rule__ProdType__AdtElementAssignment_1 )
            {
             before(grammarAccess.getProdTypeAccess().getAdtElementAssignment_1()); 
            // InternalFPML.g:2974:2: ( rule__ProdType__AdtElementAssignment_1 )
            // InternalFPML.g:2974:3: rule__ProdType__AdtElementAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ProdType__AdtElementAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProdTypeAccess().getAdtElementAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProdType__Group__1__Impl"


    // $ANTLR start "rule__PureFunctionDefinition__Group__0"
    // InternalFPML.g:2983:1: rule__PureFunctionDefinition__Group__0 : rule__PureFunctionDefinition__Group__0__Impl rule__PureFunctionDefinition__Group__1 ;
    public final void rule__PureFunctionDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2987:1: ( rule__PureFunctionDefinition__Group__0__Impl rule__PureFunctionDefinition__Group__1 )
            // InternalFPML.g:2988:2: rule__PureFunctionDefinition__Group__0__Impl rule__PureFunctionDefinition__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__PureFunctionDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PureFunctionDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunctionDefinition__Group__0"


    // $ANTLR start "rule__PureFunctionDefinition__Group__0__Impl"
    // InternalFPML.g:2995:1: rule__PureFunctionDefinition__Group__0__Impl : ( 'def' ) ;
    public final void rule__PureFunctionDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2999:1: ( ( 'def' ) )
            // InternalFPML.g:3000:1: ( 'def' )
            {
            // InternalFPML.g:3000:1: ( 'def' )
            // InternalFPML.g:3001:2: 'def'
            {
             before(grammarAccess.getPureFunctionDefinitionAccess().getDefKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPureFunctionDefinitionAccess().getDefKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunctionDefinition__Group__0__Impl"


    // $ANTLR start "rule__PureFunctionDefinition__Group__1"
    // InternalFPML.g:3010:1: rule__PureFunctionDefinition__Group__1 : rule__PureFunctionDefinition__Group__1__Impl rule__PureFunctionDefinition__Group__2 ;
    public final void rule__PureFunctionDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3014:1: ( rule__PureFunctionDefinition__Group__1__Impl rule__PureFunctionDefinition__Group__2 )
            // InternalFPML.g:3015:2: rule__PureFunctionDefinition__Group__1__Impl rule__PureFunctionDefinition__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__PureFunctionDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PureFunctionDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunctionDefinition__Group__1"


    // $ANTLR start "rule__PureFunctionDefinition__Group__1__Impl"
    // InternalFPML.g:3022:1: rule__PureFunctionDefinition__Group__1__Impl : ( ( rule__PureFunctionDefinition__ReturnTypeAssignment_1 ) ) ;
    public final void rule__PureFunctionDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3026:1: ( ( ( rule__PureFunctionDefinition__ReturnTypeAssignment_1 ) ) )
            // InternalFPML.g:3027:1: ( ( rule__PureFunctionDefinition__ReturnTypeAssignment_1 ) )
            {
            // InternalFPML.g:3027:1: ( ( rule__PureFunctionDefinition__ReturnTypeAssignment_1 ) )
            // InternalFPML.g:3028:2: ( rule__PureFunctionDefinition__ReturnTypeAssignment_1 )
            {
             before(grammarAccess.getPureFunctionDefinitionAccess().getReturnTypeAssignment_1()); 
            // InternalFPML.g:3029:2: ( rule__PureFunctionDefinition__ReturnTypeAssignment_1 )
            // InternalFPML.g:3029:3: rule__PureFunctionDefinition__ReturnTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PureFunctionDefinition__ReturnTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPureFunctionDefinitionAccess().getReturnTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunctionDefinition__Group__1__Impl"


    // $ANTLR start "rule__PureFunctionDefinition__Group__2"
    // InternalFPML.g:3037:1: rule__PureFunctionDefinition__Group__2 : rule__PureFunctionDefinition__Group__2__Impl rule__PureFunctionDefinition__Group__3 ;
    public final void rule__PureFunctionDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3041:1: ( rule__PureFunctionDefinition__Group__2__Impl rule__PureFunctionDefinition__Group__3 )
            // InternalFPML.g:3042:2: rule__PureFunctionDefinition__Group__2__Impl rule__PureFunctionDefinition__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__PureFunctionDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PureFunctionDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunctionDefinition__Group__2"


    // $ANTLR start "rule__PureFunctionDefinition__Group__2__Impl"
    // InternalFPML.g:3049:1: rule__PureFunctionDefinition__Group__2__Impl : ( ( rule__PureFunctionDefinition__NameAssignment_2 ) ) ;
    public final void rule__PureFunctionDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3053:1: ( ( ( rule__PureFunctionDefinition__NameAssignment_2 ) ) )
            // InternalFPML.g:3054:1: ( ( rule__PureFunctionDefinition__NameAssignment_2 ) )
            {
            // InternalFPML.g:3054:1: ( ( rule__PureFunctionDefinition__NameAssignment_2 ) )
            // InternalFPML.g:3055:2: ( rule__PureFunctionDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getPureFunctionDefinitionAccess().getNameAssignment_2()); 
            // InternalFPML.g:3056:2: ( rule__PureFunctionDefinition__NameAssignment_2 )
            // InternalFPML.g:3056:3: rule__PureFunctionDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PureFunctionDefinition__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPureFunctionDefinitionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunctionDefinition__Group__2__Impl"


    // $ANTLR start "rule__PureFunctionDefinition__Group__3"
    // InternalFPML.g:3064:1: rule__PureFunctionDefinition__Group__3 : rule__PureFunctionDefinition__Group__3__Impl rule__PureFunctionDefinition__Group__4 ;
    public final void rule__PureFunctionDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3068:1: ( rule__PureFunctionDefinition__Group__3__Impl rule__PureFunctionDefinition__Group__4 )
            // InternalFPML.g:3069:2: rule__PureFunctionDefinition__Group__3__Impl rule__PureFunctionDefinition__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__PureFunctionDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PureFunctionDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunctionDefinition__Group__3"


    // $ANTLR start "rule__PureFunctionDefinition__Group__3__Impl"
    // InternalFPML.g:3076:1: rule__PureFunctionDefinition__Group__3__Impl : ( '(' ) ;
    public final void rule__PureFunctionDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3080:1: ( ( '(' ) )
            // InternalFPML.g:3081:1: ( '(' )
            {
            // InternalFPML.g:3081:1: ( '(' )
            // InternalFPML.g:3082:2: '('
            {
             before(grammarAccess.getPureFunctionDefinitionAccess().getLeftParenthesisKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPureFunctionDefinitionAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunctionDefinition__Group__3__Impl"


    // $ANTLR start "rule__PureFunctionDefinition__Group__4"
    // InternalFPML.g:3091:1: rule__PureFunctionDefinition__Group__4 : rule__PureFunctionDefinition__Group__4__Impl rule__PureFunctionDefinition__Group__5 ;
    public final void rule__PureFunctionDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3095:1: ( rule__PureFunctionDefinition__Group__4__Impl rule__PureFunctionDefinition__Group__5 )
            // InternalFPML.g:3096:2: rule__PureFunctionDefinition__Group__4__Impl rule__PureFunctionDefinition__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__PureFunctionDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PureFunctionDefinition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunctionDefinition__Group__4"


    // $ANTLR start "rule__PureFunctionDefinition__Group__4__Impl"
    // InternalFPML.g:3103:1: rule__PureFunctionDefinition__Group__4__Impl : ( ( rule__PureFunctionDefinition__ArgAssignment_4 ) ) ;
    public final void rule__PureFunctionDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3107:1: ( ( ( rule__PureFunctionDefinition__ArgAssignment_4 ) ) )
            // InternalFPML.g:3108:1: ( ( rule__PureFunctionDefinition__ArgAssignment_4 ) )
            {
            // InternalFPML.g:3108:1: ( ( rule__PureFunctionDefinition__ArgAssignment_4 ) )
            // InternalFPML.g:3109:2: ( rule__PureFunctionDefinition__ArgAssignment_4 )
            {
             before(grammarAccess.getPureFunctionDefinitionAccess().getArgAssignment_4()); 
            // InternalFPML.g:3110:2: ( rule__PureFunctionDefinition__ArgAssignment_4 )
            // InternalFPML.g:3110:3: rule__PureFunctionDefinition__ArgAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__PureFunctionDefinition__ArgAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPureFunctionDefinitionAccess().getArgAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunctionDefinition__Group__4__Impl"


    // $ANTLR start "rule__PureFunctionDefinition__Group__5"
    // InternalFPML.g:3118:1: rule__PureFunctionDefinition__Group__5 : rule__PureFunctionDefinition__Group__5__Impl rule__PureFunctionDefinition__Group__6 ;
    public final void rule__PureFunctionDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3122:1: ( rule__PureFunctionDefinition__Group__5__Impl rule__PureFunctionDefinition__Group__6 )
            // InternalFPML.g:3123:2: rule__PureFunctionDefinition__Group__5__Impl rule__PureFunctionDefinition__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__PureFunctionDefinition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PureFunctionDefinition__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunctionDefinition__Group__5"


    // $ANTLR start "rule__PureFunctionDefinition__Group__5__Impl"
    // InternalFPML.g:3130:1: rule__PureFunctionDefinition__Group__5__Impl : ( ')' ) ;
    public final void rule__PureFunctionDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3134:1: ( ( ')' ) )
            // InternalFPML.g:3135:1: ( ')' )
            {
            // InternalFPML.g:3135:1: ( ')' )
            // InternalFPML.g:3136:2: ')'
            {
             before(grammarAccess.getPureFunctionDefinitionAccess().getRightParenthesisKeyword_5()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPureFunctionDefinitionAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunctionDefinition__Group__5__Impl"


    // $ANTLR start "rule__PureFunctionDefinition__Group__6"
    // InternalFPML.g:3145:1: rule__PureFunctionDefinition__Group__6 : rule__PureFunctionDefinition__Group__6__Impl rule__PureFunctionDefinition__Group__7 ;
    public final void rule__PureFunctionDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3149:1: ( rule__PureFunctionDefinition__Group__6__Impl rule__PureFunctionDefinition__Group__7 )
            // InternalFPML.g:3150:2: rule__PureFunctionDefinition__Group__6__Impl rule__PureFunctionDefinition__Group__7
            {
            pushFollow(FOLLOW_4);
            rule__PureFunctionDefinition__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PureFunctionDefinition__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunctionDefinition__Group__6"


    // $ANTLR start "rule__PureFunctionDefinition__Group__6__Impl"
    // InternalFPML.g:3157:1: rule__PureFunctionDefinition__Group__6__Impl : ( ':' ) ;
    public final void rule__PureFunctionDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3161:1: ( ( ':' ) )
            // InternalFPML.g:3162:1: ( ':' )
            {
            // InternalFPML.g:3162:1: ( ':' )
            // InternalFPML.g:3163:2: ':'
            {
             before(grammarAccess.getPureFunctionDefinitionAccess().getColonKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPureFunctionDefinitionAccess().getColonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunctionDefinition__Group__6__Impl"


    // $ANTLR start "rule__PureFunctionDefinition__Group__7"
    // InternalFPML.g:3172:1: rule__PureFunctionDefinition__Group__7 : rule__PureFunctionDefinition__Group__7__Impl rule__PureFunctionDefinition__Group__8 ;
    public final void rule__PureFunctionDefinition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3176:1: ( rule__PureFunctionDefinition__Group__7__Impl rule__PureFunctionDefinition__Group__8 )
            // InternalFPML.g:3177:2: rule__PureFunctionDefinition__Group__7__Impl rule__PureFunctionDefinition__Group__8
            {
            pushFollow(FOLLOW_23);
            rule__PureFunctionDefinition__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PureFunctionDefinition__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunctionDefinition__Group__7"


    // $ANTLR start "rule__PureFunctionDefinition__Group__7__Impl"
    // InternalFPML.g:3184:1: rule__PureFunctionDefinition__Group__7__Impl : ( '{' ) ;
    public final void rule__PureFunctionDefinition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3188:1: ( ( '{' ) )
            // InternalFPML.g:3189:1: ( '{' )
            {
            // InternalFPML.g:3189:1: ( '{' )
            // InternalFPML.g:3190:2: '{'
            {
             before(grammarAccess.getPureFunctionDefinitionAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getPureFunctionDefinitionAccess().getLeftCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunctionDefinition__Group__7__Impl"


    // $ANTLR start "rule__PureFunctionDefinition__Group__8"
    // InternalFPML.g:3199:1: rule__PureFunctionDefinition__Group__8 : rule__PureFunctionDefinition__Group__8__Impl rule__PureFunctionDefinition__Group__9 ;
    public final void rule__PureFunctionDefinition__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3203:1: ( rule__PureFunctionDefinition__Group__8__Impl rule__PureFunctionDefinition__Group__9 )
            // InternalFPML.g:3204:2: rule__PureFunctionDefinition__Group__8__Impl rule__PureFunctionDefinition__Group__9
            {
            pushFollow(FOLLOW_7);
            rule__PureFunctionDefinition__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PureFunctionDefinition__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunctionDefinition__Group__8"


    // $ANTLR start "rule__PureFunctionDefinition__Group__8__Impl"
    // InternalFPML.g:3211:1: rule__PureFunctionDefinition__Group__8__Impl : ( ( rule__PureFunctionDefinition__FunctionBodyAssignment_8 ) ) ;
    public final void rule__PureFunctionDefinition__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3215:1: ( ( ( rule__PureFunctionDefinition__FunctionBodyAssignment_8 ) ) )
            // InternalFPML.g:3216:1: ( ( rule__PureFunctionDefinition__FunctionBodyAssignment_8 ) )
            {
            // InternalFPML.g:3216:1: ( ( rule__PureFunctionDefinition__FunctionBodyAssignment_8 ) )
            // InternalFPML.g:3217:2: ( rule__PureFunctionDefinition__FunctionBodyAssignment_8 )
            {
             before(grammarAccess.getPureFunctionDefinitionAccess().getFunctionBodyAssignment_8()); 
            // InternalFPML.g:3218:2: ( rule__PureFunctionDefinition__FunctionBodyAssignment_8 )
            // InternalFPML.g:3218:3: rule__PureFunctionDefinition__FunctionBodyAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__PureFunctionDefinition__FunctionBodyAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getPureFunctionDefinitionAccess().getFunctionBodyAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunctionDefinition__Group__8__Impl"


    // $ANTLR start "rule__PureFunctionDefinition__Group__9"
    // InternalFPML.g:3226:1: rule__PureFunctionDefinition__Group__9 : rule__PureFunctionDefinition__Group__9__Impl ;
    public final void rule__PureFunctionDefinition__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3230:1: ( rule__PureFunctionDefinition__Group__9__Impl )
            // InternalFPML.g:3231:2: rule__PureFunctionDefinition__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PureFunctionDefinition__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunctionDefinition__Group__9"


    // $ANTLR start "rule__PureFunctionDefinition__Group__9__Impl"
    // InternalFPML.g:3237:1: rule__PureFunctionDefinition__Group__9__Impl : ( '}' ) ;
    public final void rule__PureFunctionDefinition__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3241:1: ( ( '}' ) )
            // InternalFPML.g:3242:1: ( '}' )
            {
            // InternalFPML.g:3242:1: ( '}' )
            // InternalFPML.g:3243:2: '}'
            {
             before(grammarAccess.getPureFunctionDefinitionAccess().getRightCurlyBracketKeyword_9()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPureFunctionDefinitionAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunctionDefinition__Group__9__Impl"


    // $ANTLR start "rule__EffectFullFunctionDefinition__Group__0"
    // InternalFPML.g:3253:1: rule__EffectFullFunctionDefinition__Group__0 : rule__EffectFullFunctionDefinition__Group__0__Impl rule__EffectFullFunctionDefinition__Group__1 ;
    public final void rule__EffectFullFunctionDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3257:1: ( rule__EffectFullFunctionDefinition__Group__0__Impl rule__EffectFullFunctionDefinition__Group__1 )
            // InternalFPML.g:3258:2: rule__EffectFullFunctionDefinition__Group__0__Impl rule__EffectFullFunctionDefinition__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__EffectFullFunctionDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullFunctionDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunctionDefinition__Group__0"


    // $ANTLR start "rule__EffectFullFunctionDefinition__Group__0__Impl"
    // InternalFPML.g:3265:1: rule__EffectFullFunctionDefinition__Group__0__Impl : ( 'def' ) ;
    public final void rule__EffectFullFunctionDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3269:1: ( ( 'def' ) )
            // InternalFPML.g:3270:1: ( 'def' )
            {
            // InternalFPML.g:3270:1: ( 'def' )
            // InternalFPML.g:3271:2: 'def'
            {
             before(grammarAccess.getEffectFullFunctionDefinitionAccess().getDefKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getEffectFullFunctionDefinitionAccess().getDefKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunctionDefinition__Group__0__Impl"


    // $ANTLR start "rule__EffectFullFunctionDefinition__Group__1"
    // InternalFPML.g:3280:1: rule__EffectFullFunctionDefinition__Group__1 : rule__EffectFullFunctionDefinition__Group__1__Impl rule__EffectFullFunctionDefinition__Group__2 ;
    public final void rule__EffectFullFunctionDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3284:1: ( rule__EffectFullFunctionDefinition__Group__1__Impl rule__EffectFullFunctionDefinition__Group__2 )
            // InternalFPML.g:3285:2: rule__EffectFullFunctionDefinition__Group__1__Impl rule__EffectFullFunctionDefinition__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__EffectFullFunctionDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullFunctionDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunctionDefinition__Group__1"


    // $ANTLR start "rule__EffectFullFunctionDefinition__Group__1__Impl"
    // InternalFPML.g:3292:1: rule__EffectFullFunctionDefinition__Group__1__Impl : ( ( rule__EffectFullFunctionDefinition__ReturnTypeAssignment_1 ) ) ;
    public final void rule__EffectFullFunctionDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3296:1: ( ( ( rule__EffectFullFunctionDefinition__ReturnTypeAssignment_1 ) ) )
            // InternalFPML.g:3297:1: ( ( rule__EffectFullFunctionDefinition__ReturnTypeAssignment_1 ) )
            {
            // InternalFPML.g:3297:1: ( ( rule__EffectFullFunctionDefinition__ReturnTypeAssignment_1 ) )
            // InternalFPML.g:3298:2: ( rule__EffectFullFunctionDefinition__ReturnTypeAssignment_1 )
            {
             before(grammarAccess.getEffectFullFunctionDefinitionAccess().getReturnTypeAssignment_1()); 
            // InternalFPML.g:3299:2: ( rule__EffectFullFunctionDefinition__ReturnTypeAssignment_1 )
            // InternalFPML.g:3299:3: rule__EffectFullFunctionDefinition__ReturnTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullFunctionDefinition__ReturnTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEffectFullFunctionDefinitionAccess().getReturnTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunctionDefinition__Group__1__Impl"


    // $ANTLR start "rule__EffectFullFunctionDefinition__Group__2"
    // InternalFPML.g:3307:1: rule__EffectFullFunctionDefinition__Group__2 : rule__EffectFullFunctionDefinition__Group__2__Impl rule__EffectFullFunctionDefinition__Group__3 ;
    public final void rule__EffectFullFunctionDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3311:1: ( rule__EffectFullFunctionDefinition__Group__2__Impl rule__EffectFullFunctionDefinition__Group__3 )
            // InternalFPML.g:3312:2: rule__EffectFullFunctionDefinition__Group__2__Impl rule__EffectFullFunctionDefinition__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__EffectFullFunctionDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullFunctionDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunctionDefinition__Group__2"


    // $ANTLR start "rule__EffectFullFunctionDefinition__Group__2__Impl"
    // InternalFPML.g:3319:1: rule__EffectFullFunctionDefinition__Group__2__Impl : ( ( rule__EffectFullFunctionDefinition__NameAssignment_2 ) ) ;
    public final void rule__EffectFullFunctionDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3323:1: ( ( ( rule__EffectFullFunctionDefinition__NameAssignment_2 ) ) )
            // InternalFPML.g:3324:1: ( ( rule__EffectFullFunctionDefinition__NameAssignment_2 ) )
            {
            // InternalFPML.g:3324:1: ( ( rule__EffectFullFunctionDefinition__NameAssignment_2 ) )
            // InternalFPML.g:3325:2: ( rule__EffectFullFunctionDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getEffectFullFunctionDefinitionAccess().getNameAssignment_2()); 
            // InternalFPML.g:3326:2: ( rule__EffectFullFunctionDefinition__NameAssignment_2 )
            // InternalFPML.g:3326:3: rule__EffectFullFunctionDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullFunctionDefinition__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEffectFullFunctionDefinitionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunctionDefinition__Group__2__Impl"


    // $ANTLR start "rule__EffectFullFunctionDefinition__Group__3"
    // InternalFPML.g:3334:1: rule__EffectFullFunctionDefinition__Group__3 : rule__EffectFullFunctionDefinition__Group__3__Impl rule__EffectFullFunctionDefinition__Group__4 ;
    public final void rule__EffectFullFunctionDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3338:1: ( rule__EffectFullFunctionDefinition__Group__3__Impl rule__EffectFullFunctionDefinition__Group__4 )
            // InternalFPML.g:3339:2: rule__EffectFullFunctionDefinition__Group__3__Impl rule__EffectFullFunctionDefinition__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__EffectFullFunctionDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullFunctionDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunctionDefinition__Group__3"


    // $ANTLR start "rule__EffectFullFunctionDefinition__Group__3__Impl"
    // InternalFPML.g:3346:1: rule__EffectFullFunctionDefinition__Group__3__Impl : ( '(' ) ;
    public final void rule__EffectFullFunctionDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3350:1: ( ( '(' ) )
            // InternalFPML.g:3351:1: ( '(' )
            {
            // InternalFPML.g:3351:1: ( '(' )
            // InternalFPML.g:3352:2: '('
            {
             before(grammarAccess.getEffectFullFunctionDefinitionAccess().getLeftParenthesisKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getEffectFullFunctionDefinitionAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunctionDefinition__Group__3__Impl"


    // $ANTLR start "rule__EffectFullFunctionDefinition__Group__4"
    // InternalFPML.g:3361:1: rule__EffectFullFunctionDefinition__Group__4 : rule__EffectFullFunctionDefinition__Group__4__Impl rule__EffectFullFunctionDefinition__Group__5 ;
    public final void rule__EffectFullFunctionDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3365:1: ( rule__EffectFullFunctionDefinition__Group__4__Impl rule__EffectFullFunctionDefinition__Group__5 )
            // InternalFPML.g:3366:2: rule__EffectFullFunctionDefinition__Group__4__Impl rule__EffectFullFunctionDefinition__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__EffectFullFunctionDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullFunctionDefinition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunctionDefinition__Group__4"


    // $ANTLR start "rule__EffectFullFunctionDefinition__Group__4__Impl"
    // InternalFPML.g:3373:1: rule__EffectFullFunctionDefinition__Group__4__Impl : ( ( rule__EffectFullFunctionDefinition__ArgAssignment_4 ) ) ;
    public final void rule__EffectFullFunctionDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3377:1: ( ( ( rule__EffectFullFunctionDefinition__ArgAssignment_4 ) ) )
            // InternalFPML.g:3378:1: ( ( rule__EffectFullFunctionDefinition__ArgAssignment_4 ) )
            {
            // InternalFPML.g:3378:1: ( ( rule__EffectFullFunctionDefinition__ArgAssignment_4 ) )
            // InternalFPML.g:3379:2: ( rule__EffectFullFunctionDefinition__ArgAssignment_4 )
            {
             before(grammarAccess.getEffectFullFunctionDefinitionAccess().getArgAssignment_4()); 
            // InternalFPML.g:3380:2: ( rule__EffectFullFunctionDefinition__ArgAssignment_4 )
            // InternalFPML.g:3380:3: rule__EffectFullFunctionDefinition__ArgAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullFunctionDefinition__ArgAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEffectFullFunctionDefinitionAccess().getArgAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunctionDefinition__Group__4__Impl"


    // $ANTLR start "rule__EffectFullFunctionDefinition__Group__5"
    // InternalFPML.g:3388:1: rule__EffectFullFunctionDefinition__Group__5 : rule__EffectFullFunctionDefinition__Group__5__Impl rule__EffectFullFunctionDefinition__Group__6 ;
    public final void rule__EffectFullFunctionDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3392:1: ( rule__EffectFullFunctionDefinition__Group__5__Impl rule__EffectFullFunctionDefinition__Group__6 )
            // InternalFPML.g:3393:2: rule__EffectFullFunctionDefinition__Group__5__Impl rule__EffectFullFunctionDefinition__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__EffectFullFunctionDefinition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullFunctionDefinition__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunctionDefinition__Group__5"


    // $ANTLR start "rule__EffectFullFunctionDefinition__Group__5__Impl"
    // InternalFPML.g:3400:1: rule__EffectFullFunctionDefinition__Group__5__Impl : ( ')' ) ;
    public final void rule__EffectFullFunctionDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3404:1: ( ( ')' ) )
            // InternalFPML.g:3405:1: ( ')' )
            {
            // InternalFPML.g:3405:1: ( ')' )
            // InternalFPML.g:3406:2: ')'
            {
             before(grammarAccess.getEffectFullFunctionDefinitionAccess().getRightParenthesisKeyword_5()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getEffectFullFunctionDefinitionAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunctionDefinition__Group__5__Impl"


    // $ANTLR start "rule__EffectFullFunctionDefinition__Group__6"
    // InternalFPML.g:3415:1: rule__EffectFullFunctionDefinition__Group__6 : rule__EffectFullFunctionDefinition__Group__6__Impl rule__EffectFullFunctionDefinition__Group__7 ;
    public final void rule__EffectFullFunctionDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3419:1: ( rule__EffectFullFunctionDefinition__Group__6__Impl rule__EffectFullFunctionDefinition__Group__7 )
            // InternalFPML.g:3420:2: rule__EffectFullFunctionDefinition__Group__6__Impl rule__EffectFullFunctionDefinition__Group__7
            {
            pushFollow(FOLLOW_4);
            rule__EffectFullFunctionDefinition__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullFunctionDefinition__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunctionDefinition__Group__6"


    // $ANTLR start "rule__EffectFullFunctionDefinition__Group__6__Impl"
    // InternalFPML.g:3427:1: rule__EffectFullFunctionDefinition__Group__6__Impl : ( ':' ) ;
    public final void rule__EffectFullFunctionDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3431:1: ( ( ':' ) )
            // InternalFPML.g:3432:1: ( ':' )
            {
            // InternalFPML.g:3432:1: ( ':' )
            // InternalFPML.g:3433:2: ':'
            {
             before(grammarAccess.getEffectFullFunctionDefinitionAccess().getColonKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getEffectFullFunctionDefinitionAccess().getColonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunctionDefinition__Group__6__Impl"


    // $ANTLR start "rule__EffectFullFunctionDefinition__Group__7"
    // InternalFPML.g:3442:1: rule__EffectFullFunctionDefinition__Group__7 : rule__EffectFullFunctionDefinition__Group__7__Impl rule__EffectFullFunctionDefinition__Group__8 ;
    public final void rule__EffectFullFunctionDefinition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3446:1: ( rule__EffectFullFunctionDefinition__Group__7__Impl rule__EffectFullFunctionDefinition__Group__8 )
            // InternalFPML.g:3447:2: rule__EffectFullFunctionDefinition__Group__7__Impl rule__EffectFullFunctionDefinition__Group__8
            {
            pushFollow(FOLLOW_26);
            rule__EffectFullFunctionDefinition__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullFunctionDefinition__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunctionDefinition__Group__7"


    // $ANTLR start "rule__EffectFullFunctionDefinition__Group__7__Impl"
    // InternalFPML.g:3454:1: rule__EffectFullFunctionDefinition__Group__7__Impl : ( '{' ) ;
    public final void rule__EffectFullFunctionDefinition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3458:1: ( ( '{' ) )
            // InternalFPML.g:3459:1: ( '{' )
            {
            // InternalFPML.g:3459:1: ( '{' )
            // InternalFPML.g:3460:2: '{'
            {
             before(grammarAccess.getEffectFullFunctionDefinitionAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getEffectFullFunctionDefinitionAccess().getLeftCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunctionDefinition__Group__7__Impl"


    // $ANTLR start "rule__EffectFullFunctionDefinition__Group__8"
    // InternalFPML.g:3469:1: rule__EffectFullFunctionDefinition__Group__8 : rule__EffectFullFunctionDefinition__Group__8__Impl rule__EffectFullFunctionDefinition__Group__9 ;
    public final void rule__EffectFullFunctionDefinition__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3473:1: ( rule__EffectFullFunctionDefinition__Group__8__Impl rule__EffectFullFunctionDefinition__Group__9 )
            // InternalFPML.g:3474:2: rule__EffectFullFunctionDefinition__Group__8__Impl rule__EffectFullFunctionDefinition__Group__9
            {
            pushFollow(FOLLOW_7);
            rule__EffectFullFunctionDefinition__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullFunctionDefinition__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunctionDefinition__Group__8"


    // $ANTLR start "rule__EffectFullFunctionDefinition__Group__8__Impl"
    // InternalFPML.g:3481:1: rule__EffectFullFunctionDefinition__Group__8__Impl : ( ( rule__EffectFullFunctionDefinition__FunctionBodyAssignment_8 ) ) ;
    public final void rule__EffectFullFunctionDefinition__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3485:1: ( ( ( rule__EffectFullFunctionDefinition__FunctionBodyAssignment_8 ) ) )
            // InternalFPML.g:3486:1: ( ( rule__EffectFullFunctionDefinition__FunctionBodyAssignment_8 ) )
            {
            // InternalFPML.g:3486:1: ( ( rule__EffectFullFunctionDefinition__FunctionBodyAssignment_8 ) )
            // InternalFPML.g:3487:2: ( rule__EffectFullFunctionDefinition__FunctionBodyAssignment_8 )
            {
             before(grammarAccess.getEffectFullFunctionDefinitionAccess().getFunctionBodyAssignment_8()); 
            // InternalFPML.g:3488:2: ( rule__EffectFullFunctionDefinition__FunctionBodyAssignment_8 )
            // InternalFPML.g:3488:3: rule__EffectFullFunctionDefinition__FunctionBodyAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullFunctionDefinition__FunctionBodyAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getEffectFullFunctionDefinitionAccess().getFunctionBodyAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunctionDefinition__Group__8__Impl"


    // $ANTLR start "rule__EffectFullFunctionDefinition__Group__9"
    // InternalFPML.g:3496:1: rule__EffectFullFunctionDefinition__Group__9 : rule__EffectFullFunctionDefinition__Group__9__Impl ;
    public final void rule__EffectFullFunctionDefinition__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3500:1: ( rule__EffectFullFunctionDefinition__Group__9__Impl )
            // InternalFPML.g:3501:2: rule__EffectFullFunctionDefinition__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullFunctionDefinition__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunctionDefinition__Group__9"


    // $ANTLR start "rule__EffectFullFunctionDefinition__Group__9__Impl"
    // InternalFPML.g:3507:1: rule__EffectFullFunctionDefinition__Group__9__Impl : ( '}' ) ;
    public final void rule__EffectFullFunctionDefinition__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3511:1: ( ( '}' ) )
            // InternalFPML.g:3512:1: ( '}' )
            {
            // InternalFPML.g:3512:1: ( '}' )
            // InternalFPML.g:3513:2: '}'
            {
             before(grammarAccess.getEffectFullFunctionDefinitionAccess().getRightCurlyBracketKeyword_9()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getEffectFullFunctionDefinitionAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunctionDefinition__Group__9__Impl"


    // $ANTLR start "rule__MainFunc__Group__0"
    // InternalFPML.g:3523:1: rule__MainFunc__Group__0 : rule__MainFunc__Group__0__Impl rule__MainFunc__Group__1 ;
    public final void rule__MainFunc__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3527:1: ( rule__MainFunc__Group__0__Impl rule__MainFunc__Group__1 )
            // InternalFPML.g:3528:2: rule__MainFunc__Group__0__Impl rule__MainFunc__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__MainFunc__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainFunc__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainFunc__Group__0"


    // $ANTLR start "rule__MainFunc__Group__0__Impl"
    // InternalFPML.g:3535:1: rule__MainFunc__Group__0__Impl : ( 'IO' ) ;
    public final void rule__MainFunc__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3539:1: ( ( 'IO' ) )
            // InternalFPML.g:3540:1: ( 'IO' )
            {
            // InternalFPML.g:3540:1: ( 'IO' )
            // InternalFPML.g:3541:2: 'IO'
            {
             before(grammarAccess.getMainFuncAccess().getIOKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMainFuncAccess().getIOKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainFunc__Group__0__Impl"


    // $ANTLR start "rule__MainFunc__Group__1"
    // InternalFPML.g:3550:1: rule__MainFunc__Group__1 : rule__MainFunc__Group__1__Impl rule__MainFunc__Group__2 ;
    public final void rule__MainFunc__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3554:1: ( rule__MainFunc__Group__1__Impl rule__MainFunc__Group__2 )
            // InternalFPML.g:3555:2: rule__MainFunc__Group__1__Impl rule__MainFunc__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__MainFunc__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainFunc__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainFunc__Group__1"


    // $ANTLR start "rule__MainFunc__Group__1__Impl"
    // InternalFPML.g:3562:1: rule__MainFunc__Group__1__Impl : ( ( rule__MainFunc__ReturnTypeAssignment_1 ) ) ;
    public final void rule__MainFunc__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3566:1: ( ( ( rule__MainFunc__ReturnTypeAssignment_1 ) ) )
            // InternalFPML.g:3567:1: ( ( rule__MainFunc__ReturnTypeAssignment_1 ) )
            {
            // InternalFPML.g:3567:1: ( ( rule__MainFunc__ReturnTypeAssignment_1 ) )
            // InternalFPML.g:3568:2: ( rule__MainFunc__ReturnTypeAssignment_1 )
            {
             before(grammarAccess.getMainFuncAccess().getReturnTypeAssignment_1()); 
            // InternalFPML.g:3569:2: ( rule__MainFunc__ReturnTypeAssignment_1 )
            // InternalFPML.g:3569:3: rule__MainFunc__ReturnTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MainFunc__ReturnTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMainFuncAccess().getReturnTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainFunc__Group__1__Impl"


    // $ANTLR start "rule__MainFunc__Group__2"
    // InternalFPML.g:3577:1: rule__MainFunc__Group__2 : rule__MainFunc__Group__2__Impl rule__MainFunc__Group__3 ;
    public final void rule__MainFunc__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3581:1: ( rule__MainFunc__Group__2__Impl rule__MainFunc__Group__3 )
            // InternalFPML.g:3582:2: rule__MainFunc__Group__2__Impl rule__MainFunc__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__MainFunc__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainFunc__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainFunc__Group__2"


    // $ANTLR start "rule__MainFunc__Group__2__Impl"
    // InternalFPML.g:3589:1: rule__MainFunc__Group__2__Impl : ( 'main' ) ;
    public final void rule__MainFunc__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3593:1: ( ( 'main' ) )
            // InternalFPML.g:3594:1: ( 'main' )
            {
            // InternalFPML.g:3594:1: ( 'main' )
            // InternalFPML.g:3595:2: 'main'
            {
             before(grammarAccess.getMainFuncAccess().getMainKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getMainFuncAccess().getMainKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainFunc__Group__2__Impl"


    // $ANTLR start "rule__MainFunc__Group__3"
    // InternalFPML.g:3604:1: rule__MainFunc__Group__3 : rule__MainFunc__Group__3__Impl rule__MainFunc__Group__4 ;
    public final void rule__MainFunc__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3608:1: ( rule__MainFunc__Group__3__Impl rule__MainFunc__Group__4 )
            // InternalFPML.g:3609:2: rule__MainFunc__Group__3__Impl rule__MainFunc__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__MainFunc__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainFunc__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainFunc__Group__3"


    // $ANTLR start "rule__MainFunc__Group__3__Impl"
    // InternalFPML.g:3616:1: rule__MainFunc__Group__3__Impl : ( ':' ) ;
    public final void rule__MainFunc__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3620:1: ( ( ':' ) )
            // InternalFPML.g:3621:1: ( ':' )
            {
            // InternalFPML.g:3621:1: ( ':' )
            // InternalFPML.g:3622:2: ':'
            {
             before(grammarAccess.getMainFuncAccess().getColonKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMainFuncAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainFunc__Group__3__Impl"


    // $ANTLR start "rule__MainFunc__Group__4"
    // InternalFPML.g:3631:1: rule__MainFunc__Group__4 : rule__MainFunc__Group__4__Impl rule__MainFunc__Group__5 ;
    public final void rule__MainFunc__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3635:1: ( rule__MainFunc__Group__4__Impl rule__MainFunc__Group__5 )
            // InternalFPML.g:3636:2: rule__MainFunc__Group__4__Impl rule__MainFunc__Group__5
            {
            pushFollow(FOLLOW_26);
            rule__MainFunc__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainFunc__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainFunc__Group__4"


    // $ANTLR start "rule__MainFunc__Group__4__Impl"
    // InternalFPML.g:3643:1: rule__MainFunc__Group__4__Impl : ( '{' ) ;
    public final void rule__MainFunc__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3647:1: ( ( '{' ) )
            // InternalFPML.g:3648:1: ( '{' )
            {
            // InternalFPML.g:3648:1: ( '{' )
            // InternalFPML.g:3649:2: '{'
            {
             before(grammarAccess.getMainFuncAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMainFuncAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainFunc__Group__4__Impl"


    // $ANTLR start "rule__MainFunc__Group__5"
    // InternalFPML.g:3658:1: rule__MainFunc__Group__5 : rule__MainFunc__Group__5__Impl rule__MainFunc__Group__6 ;
    public final void rule__MainFunc__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3662:1: ( rule__MainFunc__Group__5__Impl rule__MainFunc__Group__6 )
            // InternalFPML.g:3663:2: rule__MainFunc__Group__5__Impl rule__MainFunc__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__MainFunc__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainFunc__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainFunc__Group__5"


    // $ANTLR start "rule__MainFunc__Group__5__Impl"
    // InternalFPML.g:3670:1: rule__MainFunc__Group__5__Impl : ( ( rule__MainFunc__FunctionBodyAssignment_5 ) ) ;
    public final void rule__MainFunc__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3674:1: ( ( ( rule__MainFunc__FunctionBodyAssignment_5 ) ) )
            // InternalFPML.g:3675:1: ( ( rule__MainFunc__FunctionBodyAssignment_5 ) )
            {
            // InternalFPML.g:3675:1: ( ( rule__MainFunc__FunctionBodyAssignment_5 ) )
            // InternalFPML.g:3676:2: ( rule__MainFunc__FunctionBodyAssignment_5 )
            {
             before(grammarAccess.getMainFuncAccess().getFunctionBodyAssignment_5()); 
            // InternalFPML.g:3677:2: ( rule__MainFunc__FunctionBodyAssignment_5 )
            // InternalFPML.g:3677:3: rule__MainFunc__FunctionBodyAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__MainFunc__FunctionBodyAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getMainFuncAccess().getFunctionBodyAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainFunc__Group__5__Impl"


    // $ANTLR start "rule__MainFunc__Group__6"
    // InternalFPML.g:3685:1: rule__MainFunc__Group__6 : rule__MainFunc__Group__6__Impl ;
    public final void rule__MainFunc__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3689:1: ( rule__MainFunc__Group__6__Impl )
            // InternalFPML.g:3690:2: rule__MainFunc__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MainFunc__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainFunc__Group__6"


    // $ANTLR start "rule__MainFunc__Group__6__Impl"
    // InternalFPML.g:3696:1: rule__MainFunc__Group__6__Impl : ( '}' ) ;
    public final void rule__MainFunc__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3700:1: ( ( '}' ) )
            // InternalFPML.g:3701:1: ( '}' )
            {
            // InternalFPML.g:3701:1: ( '}' )
            // InternalFPML.g:3702:2: '}'
            {
             before(grammarAccess.getMainFuncAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getMainFuncAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainFunc__Group__6__Impl"


    // $ANTLR start "rule__EffectFullArgument__Group__0"
    // InternalFPML.g:3712:1: rule__EffectFullArgument__Group__0 : rule__EffectFullArgument__Group__0__Impl rule__EffectFullArgument__Group__1 ;
    public final void rule__EffectFullArgument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3716:1: ( rule__EffectFullArgument__Group__0__Impl rule__EffectFullArgument__Group__1 )
            // InternalFPML.g:3717:2: rule__EffectFullArgument__Group__0__Impl rule__EffectFullArgument__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__EffectFullArgument__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullArgument__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullArgument__Group__0"


    // $ANTLR start "rule__EffectFullArgument__Group__0__Impl"
    // InternalFPML.g:3724:1: rule__EffectFullArgument__Group__0__Impl : ( ( rule__EffectFullArgument__TypeAssignment_0 ) ) ;
    public final void rule__EffectFullArgument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3728:1: ( ( ( rule__EffectFullArgument__TypeAssignment_0 ) ) )
            // InternalFPML.g:3729:1: ( ( rule__EffectFullArgument__TypeAssignment_0 ) )
            {
            // InternalFPML.g:3729:1: ( ( rule__EffectFullArgument__TypeAssignment_0 ) )
            // InternalFPML.g:3730:2: ( rule__EffectFullArgument__TypeAssignment_0 )
            {
             before(grammarAccess.getEffectFullArgumentAccess().getTypeAssignment_0()); 
            // InternalFPML.g:3731:2: ( rule__EffectFullArgument__TypeAssignment_0 )
            // InternalFPML.g:3731:3: rule__EffectFullArgument__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullArgument__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEffectFullArgumentAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullArgument__Group__0__Impl"


    // $ANTLR start "rule__EffectFullArgument__Group__1"
    // InternalFPML.g:3739:1: rule__EffectFullArgument__Group__1 : rule__EffectFullArgument__Group__1__Impl ;
    public final void rule__EffectFullArgument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3743:1: ( rule__EffectFullArgument__Group__1__Impl )
            // InternalFPML.g:3744:2: rule__EffectFullArgument__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullArgument__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullArgument__Group__1"


    // $ANTLR start "rule__EffectFullArgument__Group__1__Impl"
    // InternalFPML.g:3750:1: rule__EffectFullArgument__Group__1__Impl : ( ( rule__EffectFullArgument__NameAssignment_1 ) ) ;
    public final void rule__EffectFullArgument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3754:1: ( ( ( rule__EffectFullArgument__NameAssignment_1 ) ) )
            // InternalFPML.g:3755:1: ( ( rule__EffectFullArgument__NameAssignment_1 ) )
            {
            // InternalFPML.g:3755:1: ( ( rule__EffectFullArgument__NameAssignment_1 ) )
            // InternalFPML.g:3756:2: ( rule__EffectFullArgument__NameAssignment_1 )
            {
             before(grammarAccess.getEffectFullArgumentAccess().getNameAssignment_1()); 
            // InternalFPML.g:3757:2: ( rule__EffectFullArgument__NameAssignment_1 )
            // InternalFPML.g:3757:3: rule__EffectFullArgument__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullArgument__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEffectFullArgumentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullArgument__Group__1__Impl"


    // $ANTLR start "rule__Argument__Group__0"
    // InternalFPML.g:3766:1: rule__Argument__Group__0 : rule__Argument__Group__0__Impl rule__Argument__Group__1 ;
    public final void rule__Argument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3770:1: ( rule__Argument__Group__0__Impl rule__Argument__Group__1 )
            // InternalFPML.g:3771:2: rule__Argument__Group__0__Impl rule__Argument__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Argument__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Argument__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group__0"


    // $ANTLR start "rule__Argument__Group__0__Impl"
    // InternalFPML.g:3778:1: rule__Argument__Group__0__Impl : ( ( rule__Argument__TypeAssignment_0 ) ) ;
    public final void rule__Argument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3782:1: ( ( ( rule__Argument__TypeAssignment_0 ) ) )
            // InternalFPML.g:3783:1: ( ( rule__Argument__TypeAssignment_0 ) )
            {
            // InternalFPML.g:3783:1: ( ( rule__Argument__TypeAssignment_0 ) )
            // InternalFPML.g:3784:2: ( rule__Argument__TypeAssignment_0 )
            {
             before(grammarAccess.getArgumentAccess().getTypeAssignment_0()); 
            // InternalFPML.g:3785:2: ( rule__Argument__TypeAssignment_0 )
            // InternalFPML.g:3785:3: rule__Argument__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Argument__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getArgumentAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group__0__Impl"


    // $ANTLR start "rule__Argument__Group__1"
    // InternalFPML.g:3793:1: rule__Argument__Group__1 : rule__Argument__Group__1__Impl ;
    public final void rule__Argument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3797:1: ( rule__Argument__Group__1__Impl )
            // InternalFPML.g:3798:2: rule__Argument__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Argument__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group__1"


    // $ANTLR start "rule__Argument__Group__1__Impl"
    // InternalFPML.g:3804:1: rule__Argument__Group__1__Impl : ( ( rule__Argument__NameAssignment_1 ) ) ;
    public final void rule__Argument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3808:1: ( ( ( rule__Argument__NameAssignment_1 ) ) )
            // InternalFPML.g:3809:1: ( ( rule__Argument__NameAssignment_1 ) )
            {
            // InternalFPML.g:3809:1: ( ( rule__Argument__NameAssignment_1 ) )
            // InternalFPML.g:3810:2: ( rule__Argument__NameAssignment_1 )
            {
             before(grammarAccess.getArgumentAccess().getNameAssignment_1()); 
            // InternalFPML.g:3811:2: ( rule__Argument__NameAssignment_1 )
            // InternalFPML.g:3811:3: rule__Argument__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Argument__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getArgumentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group__1__Impl"


    // $ANTLR start "rule__EmptyFunctionBody__Group__0"
    // InternalFPML.g:3820:1: rule__EmptyFunctionBody__Group__0 : rule__EmptyFunctionBody__Group__0__Impl rule__EmptyFunctionBody__Group__1 ;
    public final void rule__EmptyFunctionBody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3824:1: ( rule__EmptyFunctionBody__Group__0__Impl rule__EmptyFunctionBody__Group__1 )
            // InternalFPML.g:3825:2: rule__EmptyFunctionBody__Group__0__Impl rule__EmptyFunctionBody__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__EmptyFunctionBody__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EmptyFunctionBody__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmptyFunctionBody__Group__0"


    // $ANTLR start "rule__EmptyFunctionBody__Group__0__Impl"
    // InternalFPML.g:3832:1: rule__EmptyFunctionBody__Group__0__Impl : ( () ) ;
    public final void rule__EmptyFunctionBody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3836:1: ( ( () ) )
            // InternalFPML.g:3837:1: ( () )
            {
            // InternalFPML.g:3837:1: ( () )
            // InternalFPML.g:3838:2: ()
            {
             before(grammarAccess.getEmptyFunctionBodyAccess().getEmptyFunctionBodyAction_0()); 
            // InternalFPML.g:3839:2: ()
            // InternalFPML.g:3839:3: 
            {
            }

             after(grammarAccess.getEmptyFunctionBodyAccess().getEmptyFunctionBodyAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmptyFunctionBody__Group__0__Impl"


    // $ANTLR start "rule__EmptyFunctionBody__Group__1"
    // InternalFPML.g:3847:1: rule__EmptyFunctionBody__Group__1 : rule__EmptyFunctionBody__Group__1__Impl ;
    public final void rule__EmptyFunctionBody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3851:1: ( rule__EmptyFunctionBody__Group__1__Impl )
            // InternalFPML.g:3852:2: rule__EmptyFunctionBody__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EmptyFunctionBody__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmptyFunctionBody__Group__1"


    // $ANTLR start "rule__EmptyFunctionBody__Group__1__Impl"
    // InternalFPML.g:3858:1: rule__EmptyFunctionBody__Group__1__Impl : ( 'Undefined' ) ;
    public final void rule__EmptyFunctionBody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3862:1: ( ( 'Undefined' ) )
            // InternalFPML.g:3863:1: ( 'Undefined' )
            {
            // InternalFPML.g:3863:1: ( 'Undefined' )
            // InternalFPML.g:3864:2: 'Undefined'
            {
             before(grammarAccess.getEmptyFunctionBodyAccess().getUndefinedKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getEmptyFunctionBodyAccess().getUndefinedKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmptyFunctionBody__Group__1__Impl"


    // $ANTLR start "rule__CompositionFunctionBodyPure__Group_0__0"
    // InternalFPML.g:3874:1: rule__CompositionFunctionBodyPure__Group_0__0 : rule__CompositionFunctionBodyPure__Group_0__0__Impl rule__CompositionFunctionBodyPure__Group_0__1 ;
    public final void rule__CompositionFunctionBodyPure__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3878:1: ( rule__CompositionFunctionBodyPure__Group_0__0__Impl rule__CompositionFunctionBodyPure__Group_0__1 )
            // InternalFPML.g:3879:2: rule__CompositionFunctionBodyPure__Group_0__0__Impl rule__CompositionFunctionBodyPure__Group_0__1
            {
            pushFollow(FOLLOW_30);
            rule__CompositionFunctionBodyPure__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositionFunctionBodyPure__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionFunctionBodyPure__Group_0__0"


    // $ANTLR start "rule__CompositionFunctionBodyPure__Group_0__0__Impl"
    // InternalFPML.g:3886:1: rule__CompositionFunctionBodyPure__Group_0__0__Impl : ( ( rule__CompositionFunctionBodyPure__ReferenceElementAssignment_0_0 ) ) ;
    public final void rule__CompositionFunctionBodyPure__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3890:1: ( ( ( rule__CompositionFunctionBodyPure__ReferenceElementAssignment_0_0 ) ) )
            // InternalFPML.g:3891:1: ( ( rule__CompositionFunctionBodyPure__ReferenceElementAssignment_0_0 ) )
            {
            // InternalFPML.g:3891:1: ( ( rule__CompositionFunctionBodyPure__ReferenceElementAssignment_0_0 ) )
            // InternalFPML.g:3892:2: ( rule__CompositionFunctionBodyPure__ReferenceElementAssignment_0_0 )
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getReferenceElementAssignment_0_0()); 
            // InternalFPML.g:3893:2: ( rule__CompositionFunctionBodyPure__ReferenceElementAssignment_0_0 )
            // InternalFPML.g:3893:3: rule__CompositionFunctionBodyPure__ReferenceElementAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__CompositionFunctionBodyPure__ReferenceElementAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getCompositionFunctionBodyPureAccess().getReferenceElementAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionFunctionBodyPure__Group_0__0__Impl"


    // $ANTLR start "rule__CompositionFunctionBodyPure__Group_0__1"
    // InternalFPML.g:3901:1: rule__CompositionFunctionBodyPure__Group_0__1 : rule__CompositionFunctionBodyPure__Group_0__1__Impl rule__CompositionFunctionBodyPure__Group_0__2 ;
    public final void rule__CompositionFunctionBodyPure__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3905:1: ( rule__CompositionFunctionBodyPure__Group_0__1__Impl rule__CompositionFunctionBodyPure__Group_0__2 )
            // InternalFPML.g:3906:2: rule__CompositionFunctionBodyPure__Group_0__1__Impl rule__CompositionFunctionBodyPure__Group_0__2
            {
            pushFollow(FOLLOW_31);
            rule__CompositionFunctionBodyPure__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositionFunctionBodyPure__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionFunctionBodyPure__Group_0__1"


    // $ANTLR start "rule__CompositionFunctionBodyPure__Group_0__1__Impl"
    // InternalFPML.g:3913:1: rule__CompositionFunctionBodyPure__Group_0__1__Impl : ( ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 ) ) ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 )* ) ) ;
    public final void rule__CompositionFunctionBodyPure__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3917:1: ( ( ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 ) ) ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 )* ) ) )
            // InternalFPML.g:3918:1: ( ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 ) ) ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 )* ) )
            {
            // InternalFPML.g:3918:1: ( ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 ) ) ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 )* ) )
            // InternalFPML.g:3919:2: ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 ) ) ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 )* )
            {
            // InternalFPML.g:3919:2: ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 ) )
            // InternalFPML.g:3920:3: ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 )
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainAssignment_0_1()); 
            // InternalFPML.g:3921:3: ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 )
            // InternalFPML.g:3921:4: rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1
            {
            pushFollow(FOLLOW_32);
            rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainAssignment_0_1()); 

            }

            // InternalFPML.g:3924:2: ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 )* )
            // InternalFPML.g:3925:3: ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 )*
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainAssignment_0_1()); 
            // InternalFPML.g:3926:3: ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==29) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalFPML.g:3926:4: rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainAssignment_0_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionFunctionBodyPure__Group_0__1__Impl"


    // $ANTLR start "rule__CompositionFunctionBodyPure__Group_0__2"
    // InternalFPML.g:3935:1: rule__CompositionFunctionBodyPure__Group_0__2 : rule__CompositionFunctionBodyPure__Group_0__2__Impl ;
    public final void rule__CompositionFunctionBodyPure__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3939:1: ( rule__CompositionFunctionBodyPure__Group_0__2__Impl )
            // InternalFPML.g:3940:2: rule__CompositionFunctionBodyPure__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositionFunctionBodyPure__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionFunctionBodyPure__Group_0__2"


    // $ANTLR start "rule__CompositionFunctionBodyPure__Group_0__2__Impl"
    // InternalFPML.g:3946:1: rule__CompositionFunctionBodyPure__Group_0__2__Impl : ( ( rule__CompositionFunctionBodyPure__ReturnFunctionAssignment_0_2 )? ) ;
    public final void rule__CompositionFunctionBodyPure__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3950:1: ( ( ( rule__CompositionFunctionBodyPure__ReturnFunctionAssignment_0_2 )? ) )
            // InternalFPML.g:3951:1: ( ( rule__CompositionFunctionBodyPure__ReturnFunctionAssignment_0_2 )? )
            {
            // InternalFPML.g:3951:1: ( ( rule__CompositionFunctionBodyPure__ReturnFunctionAssignment_0_2 )? )
            // InternalFPML.g:3952:2: ( rule__CompositionFunctionBodyPure__ReturnFunctionAssignment_0_2 )?
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getReturnFunctionAssignment_0_2()); 
            // InternalFPML.g:3953:2: ( rule__CompositionFunctionBodyPure__ReturnFunctionAssignment_0_2 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==31) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalFPML.g:3953:3: rule__CompositionFunctionBodyPure__ReturnFunctionAssignment_0_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompositionFunctionBodyPure__ReturnFunctionAssignment_0_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompositionFunctionBodyPureAccess().getReturnFunctionAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionFunctionBodyPure__Group_0__2__Impl"


    // $ANTLR start "rule__CompositionFunctionBodyPure__Group_1__0"
    // InternalFPML.g:3962:1: rule__CompositionFunctionBodyPure__Group_1__0 : rule__CompositionFunctionBodyPure__Group_1__0__Impl rule__CompositionFunctionBodyPure__Group_1__1 ;
    public final void rule__CompositionFunctionBodyPure__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3966:1: ( rule__CompositionFunctionBodyPure__Group_1__0__Impl rule__CompositionFunctionBodyPure__Group_1__1 )
            // InternalFPML.g:3967:2: rule__CompositionFunctionBodyPure__Group_1__0__Impl rule__CompositionFunctionBodyPure__Group_1__1
            {
            pushFollow(FOLLOW_30);
            rule__CompositionFunctionBodyPure__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositionFunctionBodyPure__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionFunctionBodyPure__Group_1__0"


    // $ANTLR start "rule__CompositionFunctionBodyPure__Group_1__0__Impl"
    // InternalFPML.g:3974:1: rule__CompositionFunctionBodyPure__Group_1__0__Impl : ( ( rule__CompositionFunctionBodyPure__PrimitiveElementAssignment_1_0 ) ) ;
    public final void rule__CompositionFunctionBodyPure__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3978:1: ( ( ( rule__CompositionFunctionBodyPure__PrimitiveElementAssignment_1_0 ) ) )
            // InternalFPML.g:3979:1: ( ( rule__CompositionFunctionBodyPure__PrimitiveElementAssignment_1_0 ) )
            {
            // InternalFPML.g:3979:1: ( ( rule__CompositionFunctionBodyPure__PrimitiveElementAssignment_1_0 ) )
            // InternalFPML.g:3980:2: ( rule__CompositionFunctionBodyPure__PrimitiveElementAssignment_1_0 )
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getPrimitiveElementAssignment_1_0()); 
            // InternalFPML.g:3981:2: ( rule__CompositionFunctionBodyPure__PrimitiveElementAssignment_1_0 )
            // InternalFPML.g:3981:3: rule__CompositionFunctionBodyPure__PrimitiveElementAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__CompositionFunctionBodyPure__PrimitiveElementAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getCompositionFunctionBodyPureAccess().getPrimitiveElementAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionFunctionBodyPure__Group_1__0__Impl"


    // $ANTLR start "rule__CompositionFunctionBodyPure__Group_1__1"
    // InternalFPML.g:3989:1: rule__CompositionFunctionBodyPure__Group_1__1 : rule__CompositionFunctionBodyPure__Group_1__1__Impl rule__CompositionFunctionBodyPure__Group_1__2 ;
    public final void rule__CompositionFunctionBodyPure__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3993:1: ( rule__CompositionFunctionBodyPure__Group_1__1__Impl rule__CompositionFunctionBodyPure__Group_1__2 )
            // InternalFPML.g:3994:2: rule__CompositionFunctionBodyPure__Group_1__1__Impl rule__CompositionFunctionBodyPure__Group_1__2
            {
            pushFollow(FOLLOW_31);
            rule__CompositionFunctionBodyPure__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositionFunctionBodyPure__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionFunctionBodyPure__Group_1__1"


    // $ANTLR start "rule__CompositionFunctionBodyPure__Group_1__1__Impl"
    // InternalFPML.g:4001:1: rule__CompositionFunctionBodyPure__Group_1__1__Impl : ( ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 ) ) ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 )* ) ) ;
    public final void rule__CompositionFunctionBodyPure__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4005:1: ( ( ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 ) ) ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 )* ) ) )
            // InternalFPML.g:4006:1: ( ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 ) ) ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 )* ) )
            {
            // InternalFPML.g:4006:1: ( ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 ) ) ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 )* ) )
            // InternalFPML.g:4007:2: ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 ) ) ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 )* )
            {
            // InternalFPML.g:4007:2: ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 ) )
            // InternalFPML.g:4008:3: ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 )
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainAssignment_1_1()); 
            // InternalFPML.g:4009:3: ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 )
            // InternalFPML.g:4009:4: rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1
            {
            pushFollow(FOLLOW_32);
            rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainAssignment_1_1()); 

            }

            // InternalFPML.g:4012:2: ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 )* )
            // InternalFPML.g:4013:3: ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 )*
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainAssignment_1_1()); 
            // InternalFPML.g:4014:3: ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==29) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalFPML.g:4014:4: rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainAssignment_1_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionFunctionBodyPure__Group_1__1__Impl"


    // $ANTLR start "rule__CompositionFunctionBodyPure__Group_1__2"
    // InternalFPML.g:4023:1: rule__CompositionFunctionBodyPure__Group_1__2 : rule__CompositionFunctionBodyPure__Group_1__2__Impl ;
    public final void rule__CompositionFunctionBodyPure__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4027:1: ( rule__CompositionFunctionBodyPure__Group_1__2__Impl )
            // InternalFPML.g:4028:2: rule__CompositionFunctionBodyPure__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositionFunctionBodyPure__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionFunctionBodyPure__Group_1__2"


    // $ANTLR start "rule__CompositionFunctionBodyPure__Group_1__2__Impl"
    // InternalFPML.g:4034:1: rule__CompositionFunctionBodyPure__Group_1__2__Impl : ( ( rule__CompositionFunctionBodyPure__ReturnFunctionAssignment_1_2 )? ) ;
    public final void rule__CompositionFunctionBodyPure__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4038:1: ( ( ( rule__CompositionFunctionBodyPure__ReturnFunctionAssignment_1_2 )? ) )
            // InternalFPML.g:4039:1: ( ( rule__CompositionFunctionBodyPure__ReturnFunctionAssignment_1_2 )? )
            {
            // InternalFPML.g:4039:1: ( ( rule__CompositionFunctionBodyPure__ReturnFunctionAssignment_1_2 )? )
            // InternalFPML.g:4040:2: ( rule__CompositionFunctionBodyPure__ReturnFunctionAssignment_1_2 )?
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getReturnFunctionAssignment_1_2()); 
            // InternalFPML.g:4041:2: ( rule__CompositionFunctionBodyPure__ReturnFunctionAssignment_1_2 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==31) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalFPML.g:4041:3: rule__CompositionFunctionBodyPure__ReturnFunctionAssignment_1_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompositionFunctionBodyPure__ReturnFunctionAssignment_1_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompositionFunctionBodyPureAccess().getReturnFunctionAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionFunctionBodyPure__Group_1__2__Impl"


    // $ANTLR start "rule__CompositionFunctionBodyPureFactor__Group_0__0"
    // InternalFPML.g:4050:1: rule__CompositionFunctionBodyPureFactor__Group_0__0 : rule__CompositionFunctionBodyPureFactor__Group_0__0__Impl rule__CompositionFunctionBodyPureFactor__Group_0__1 ;
    public final void rule__CompositionFunctionBodyPureFactor__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4054:1: ( rule__CompositionFunctionBodyPureFactor__Group_0__0__Impl rule__CompositionFunctionBodyPureFactor__Group_0__1 )
            // InternalFPML.g:4055:2: rule__CompositionFunctionBodyPureFactor__Group_0__0__Impl rule__CompositionFunctionBodyPureFactor__Group_0__1
            {
            pushFollow(FOLLOW_20);
            rule__CompositionFunctionBodyPureFactor__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositionFunctionBodyPureFactor__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionFunctionBodyPureFactor__Group_0__0"


    // $ANTLR start "rule__CompositionFunctionBodyPureFactor__Group_0__0__Impl"
    // InternalFPML.g:4062:1: rule__CompositionFunctionBodyPureFactor__Group_0__0__Impl : ( '|>' ) ;
    public final void rule__CompositionFunctionBodyPureFactor__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4066:1: ( ( '|>' ) )
            // InternalFPML.g:4067:1: ( '|>' )
            {
            // InternalFPML.g:4067:1: ( '|>' )
            // InternalFPML.g:4068:2: '|>'
            {
             before(grammarAccess.getCompositionFunctionBodyPureFactorAccess().getVerticalLineGreaterThanSignKeyword_0_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getCompositionFunctionBodyPureFactorAccess().getVerticalLineGreaterThanSignKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionFunctionBodyPureFactor__Group_0__0__Impl"


    // $ANTLR start "rule__CompositionFunctionBodyPureFactor__Group_0__1"
    // InternalFPML.g:4077:1: rule__CompositionFunctionBodyPureFactor__Group_0__1 : rule__CompositionFunctionBodyPureFactor__Group_0__1__Impl ;
    public final void rule__CompositionFunctionBodyPureFactor__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4081:1: ( rule__CompositionFunctionBodyPureFactor__Group_0__1__Impl )
            // InternalFPML.g:4082:2: rule__CompositionFunctionBodyPureFactor__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositionFunctionBodyPureFactor__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionFunctionBodyPureFactor__Group_0__1"


    // $ANTLR start "rule__CompositionFunctionBodyPureFactor__Group_0__1__Impl"
    // InternalFPML.g:4088:1: rule__CompositionFunctionBodyPureFactor__Group_0__1__Impl : ( ( rule__CompositionFunctionBodyPureFactor__ReferenceElementAssignment_0_1 ) ) ;
    public final void rule__CompositionFunctionBodyPureFactor__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4092:1: ( ( ( rule__CompositionFunctionBodyPureFactor__ReferenceElementAssignment_0_1 ) ) )
            // InternalFPML.g:4093:1: ( ( rule__CompositionFunctionBodyPureFactor__ReferenceElementAssignment_0_1 ) )
            {
            // InternalFPML.g:4093:1: ( ( rule__CompositionFunctionBodyPureFactor__ReferenceElementAssignment_0_1 ) )
            // InternalFPML.g:4094:2: ( rule__CompositionFunctionBodyPureFactor__ReferenceElementAssignment_0_1 )
            {
             before(grammarAccess.getCompositionFunctionBodyPureFactorAccess().getReferenceElementAssignment_0_1()); 
            // InternalFPML.g:4095:2: ( rule__CompositionFunctionBodyPureFactor__ReferenceElementAssignment_0_1 )
            // InternalFPML.g:4095:3: rule__CompositionFunctionBodyPureFactor__ReferenceElementAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositionFunctionBodyPureFactor__ReferenceElementAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositionFunctionBodyPureFactorAccess().getReferenceElementAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionFunctionBodyPureFactor__Group_0__1__Impl"


    // $ANTLR start "rule__CompositionFunctionBodyPureFactor__Group_1__0"
    // InternalFPML.g:4104:1: rule__CompositionFunctionBodyPureFactor__Group_1__0 : rule__CompositionFunctionBodyPureFactor__Group_1__0__Impl rule__CompositionFunctionBodyPureFactor__Group_1__1 ;
    public final void rule__CompositionFunctionBodyPureFactor__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4108:1: ( rule__CompositionFunctionBodyPureFactor__Group_1__0__Impl rule__CompositionFunctionBodyPureFactor__Group_1__1 )
            // InternalFPML.g:4109:2: rule__CompositionFunctionBodyPureFactor__Group_1__0__Impl rule__CompositionFunctionBodyPureFactor__Group_1__1
            {
            pushFollow(FOLLOW_23);
            rule__CompositionFunctionBodyPureFactor__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositionFunctionBodyPureFactor__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionFunctionBodyPureFactor__Group_1__0"


    // $ANTLR start "rule__CompositionFunctionBodyPureFactor__Group_1__0__Impl"
    // InternalFPML.g:4116:1: rule__CompositionFunctionBodyPureFactor__Group_1__0__Impl : ( '|>' ) ;
    public final void rule__CompositionFunctionBodyPureFactor__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4120:1: ( ( '|>' ) )
            // InternalFPML.g:4121:1: ( '|>' )
            {
            // InternalFPML.g:4121:1: ( '|>' )
            // InternalFPML.g:4122:2: '|>'
            {
             before(grammarAccess.getCompositionFunctionBodyPureFactorAccess().getVerticalLineGreaterThanSignKeyword_1_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getCompositionFunctionBodyPureFactorAccess().getVerticalLineGreaterThanSignKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionFunctionBodyPureFactor__Group_1__0__Impl"


    // $ANTLR start "rule__CompositionFunctionBodyPureFactor__Group_1__1"
    // InternalFPML.g:4131:1: rule__CompositionFunctionBodyPureFactor__Group_1__1 : rule__CompositionFunctionBodyPureFactor__Group_1__1__Impl ;
    public final void rule__CompositionFunctionBodyPureFactor__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4135:1: ( rule__CompositionFunctionBodyPureFactor__Group_1__1__Impl )
            // InternalFPML.g:4136:2: rule__CompositionFunctionBodyPureFactor__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositionFunctionBodyPureFactor__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionFunctionBodyPureFactor__Group_1__1"


    // $ANTLR start "rule__CompositionFunctionBodyPureFactor__Group_1__1__Impl"
    // InternalFPML.g:4142:1: rule__CompositionFunctionBodyPureFactor__Group_1__1__Impl : ( ( rule__CompositionFunctionBodyPureFactor__PrimitiveElementAssignment_1_1 ) ) ;
    public final void rule__CompositionFunctionBodyPureFactor__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4146:1: ( ( ( rule__CompositionFunctionBodyPureFactor__PrimitiveElementAssignment_1_1 ) ) )
            // InternalFPML.g:4147:1: ( ( rule__CompositionFunctionBodyPureFactor__PrimitiveElementAssignment_1_1 ) )
            {
            // InternalFPML.g:4147:1: ( ( rule__CompositionFunctionBodyPureFactor__PrimitiveElementAssignment_1_1 ) )
            // InternalFPML.g:4148:2: ( rule__CompositionFunctionBodyPureFactor__PrimitiveElementAssignment_1_1 )
            {
             before(grammarAccess.getCompositionFunctionBodyPureFactorAccess().getPrimitiveElementAssignment_1_1()); 
            // InternalFPML.g:4149:2: ( rule__CompositionFunctionBodyPureFactor__PrimitiveElementAssignment_1_1 )
            // InternalFPML.g:4149:3: rule__CompositionFunctionBodyPureFactor__PrimitiveElementAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositionFunctionBodyPureFactor__PrimitiveElementAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositionFunctionBodyPureFactorAccess().getPrimitiveElementAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionFunctionBodyPureFactor__Group_1__1__Impl"


    // $ANTLR start "rule__CompositionFunctionBodyEffect__Group_0__0"
    // InternalFPML.g:4158:1: rule__CompositionFunctionBodyEffect__Group_0__0 : rule__CompositionFunctionBodyEffect__Group_0__0__Impl rule__CompositionFunctionBodyEffect__Group_0__1 ;
    public final void rule__CompositionFunctionBodyEffect__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4162:1: ( rule__CompositionFunctionBodyEffect__Group_0__0__Impl rule__CompositionFunctionBodyEffect__Group_0__1 )
            // InternalFPML.g:4163:2: rule__CompositionFunctionBodyEffect__Group_0__0__Impl rule__CompositionFunctionBodyEffect__Group_0__1
            {
            pushFollow(FOLLOW_33);
            rule__CompositionFunctionBodyEffect__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositionFunctionBodyEffect__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionFunctionBodyEffect__Group_0__0"


    // $ANTLR start "rule__CompositionFunctionBodyEffect__Group_0__0__Impl"
    // InternalFPML.g:4170:1: rule__CompositionFunctionBodyEffect__Group_0__0__Impl : ( ( rule__CompositionFunctionBodyEffect__ReferenceElementAssignment_0_0 ) ) ;
    public final void rule__CompositionFunctionBodyEffect__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4174:1: ( ( ( rule__CompositionFunctionBodyEffect__ReferenceElementAssignment_0_0 ) ) )
            // InternalFPML.g:4175:1: ( ( rule__CompositionFunctionBodyEffect__ReferenceElementAssignment_0_0 ) )
            {
            // InternalFPML.g:4175:1: ( ( rule__CompositionFunctionBodyEffect__ReferenceElementAssignment_0_0 ) )
            // InternalFPML.g:4176:2: ( rule__CompositionFunctionBodyEffect__ReferenceElementAssignment_0_0 )
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getReferenceElementAssignment_0_0()); 
            // InternalFPML.g:4177:2: ( rule__CompositionFunctionBodyEffect__ReferenceElementAssignment_0_0 )
            // InternalFPML.g:4177:3: rule__CompositionFunctionBodyEffect__ReferenceElementAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__CompositionFunctionBodyEffect__ReferenceElementAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getCompositionFunctionBodyEffectAccess().getReferenceElementAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionFunctionBodyEffect__Group_0__0__Impl"


    // $ANTLR start "rule__CompositionFunctionBodyEffect__Group_0__1"
    // InternalFPML.g:4185:1: rule__CompositionFunctionBodyEffect__Group_0__1 : rule__CompositionFunctionBodyEffect__Group_0__1__Impl rule__CompositionFunctionBodyEffect__Group_0__2 ;
    public final void rule__CompositionFunctionBodyEffect__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4189:1: ( rule__CompositionFunctionBodyEffect__Group_0__1__Impl rule__CompositionFunctionBodyEffect__Group_0__2 )
            // InternalFPML.g:4190:2: rule__CompositionFunctionBodyEffect__Group_0__1__Impl rule__CompositionFunctionBodyEffect__Group_0__2
            {
            pushFollow(FOLLOW_31);
            rule__CompositionFunctionBodyEffect__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositionFunctionBodyEffect__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionFunctionBodyEffect__Group_0__1"


    // $ANTLR start "rule__CompositionFunctionBodyEffect__Group_0__1__Impl"
    // InternalFPML.g:4197:1: rule__CompositionFunctionBodyEffect__Group_0__1__Impl : ( ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 ) ) ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 )* ) ) ;
    public final void rule__CompositionFunctionBodyEffect__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4201:1: ( ( ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 ) ) ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 )* ) ) )
            // InternalFPML.g:4202:1: ( ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 ) ) ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 )* ) )
            {
            // InternalFPML.g:4202:1: ( ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 ) ) ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 )* ) )
            // InternalFPML.g:4203:2: ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 ) ) ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 )* )
            {
            // InternalFPML.g:4203:2: ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 ) )
            // InternalFPML.g:4204:3: ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 )
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainAssignment_0_1()); 
            // InternalFPML.g:4205:3: ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 )
            // InternalFPML.g:4205:4: rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1
            {
            pushFollow(FOLLOW_34);
            rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainAssignment_0_1()); 

            }

            // InternalFPML.g:4208:2: ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 )* )
            // InternalFPML.g:4209:3: ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 )*
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainAssignment_0_1()); 
            // InternalFPML.g:4210:3: ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==30) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalFPML.g:4210:4: rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainAssignment_0_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionFunctionBodyEffect__Group_0__1__Impl"


    // $ANTLR start "rule__CompositionFunctionBodyEffect__Group_0__2"
    // InternalFPML.g:4219:1: rule__CompositionFunctionBodyEffect__Group_0__2 : rule__CompositionFunctionBodyEffect__Group_0__2__Impl ;
    public final void rule__CompositionFunctionBodyEffect__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4223:1: ( rule__CompositionFunctionBodyEffect__Group_0__2__Impl )
            // InternalFPML.g:4224:2: rule__CompositionFunctionBodyEffect__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositionFunctionBodyEffect__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionFunctionBodyEffect__Group_0__2"


    // $ANTLR start "rule__CompositionFunctionBodyEffect__Group_0__2__Impl"
    // InternalFPML.g:4230:1: rule__CompositionFunctionBodyEffect__Group_0__2__Impl : ( ( rule__CompositionFunctionBodyEffect__ReturnFunctionAssignment_0_2 )? ) ;
    public final void rule__CompositionFunctionBodyEffect__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4234:1: ( ( ( rule__CompositionFunctionBodyEffect__ReturnFunctionAssignment_0_2 )? ) )
            // InternalFPML.g:4235:1: ( ( rule__CompositionFunctionBodyEffect__ReturnFunctionAssignment_0_2 )? )
            {
            // InternalFPML.g:4235:1: ( ( rule__CompositionFunctionBodyEffect__ReturnFunctionAssignment_0_2 )? )
            // InternalFPML.g:4236:2: ( rule__CompositionFunctionBodyEffect__ReturnFunctionAssignment_0_2 )?
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getReturnFunctionAssignment_0_2()); 
            // InternalFPML.g:4237:2: ( rule__CompositionFunctionBodyEffect__ReturnFunctionAssignment_0_2 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==31) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalFPML.g:4237:3: rule__CompositionFunctionBodyEffect__ReturnFunctionAssignment_0_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompositionFunctionBodyEffect__ReturnFunctionAssignment_0_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompositionFunctionBodyEffectAccess().getReturnFunctionAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionFunctionBodyEffect__Group_0__2__Impl"


    // $ANTLR start "rule__CompositionFunctionBodyEffect__Group_1__0"
    // InternalFPML.g:4246:1: rule__CompositionFunctionBodyEffect__Group_1__0 : rule__CompositionFunctionBodyEffect__Group_1__0__Impl rule__CompositionFunctionBodyEffect__Group_1__1 ;
    public final void rule__CompositionFunctionBodyEffect__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4250:1: ( rule__CompositionFunctionBodyEffect__Group_1__0__Impl rule__CompositionFunctionBodyEffect__Group_1__1 )
            // InternalFPML.g:4251:2: rule__CompositionFunctionBodyEffect__Group_1__0__Impl rule__CompositionFunctionBodyEffect__Group_1__1
            {
            pushFollow(FOLLOW_33);
            rule__CompositionFunctionBodyEffect__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositionFunctionBodyEffect__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionFunctionBodyEffect__Group_1__0"


    // $ANTLR start "rule__CompositionFunctionBodyEffect__Group_1__0__Impl"
    // InternalFPML.g:4258:1: rule__CompositionFunctionBodyEffect__Group_1__0__Impl : ( ( rule__CompositionFunctionBodyEffect__PrimitiveElementAssignment_1_0 ) ) ;
    public final void rule__CompositionFunctionBodyEffect__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4262:1: ( ( ( rule__CompositionFunctionBodyEffect__PrimitiveElementAssignment_1_0 ) ) )
            // InternalFPML.g:4263:1: ( ( rule__CompositionFunctionBodyEffect__PrimitiveElementAssignment_1_0 ) )
            {
            // InternalFPML.g:4263:1: ( ( rule__CompositionFunctionBodyEffect__PrimitiveElementAssignment_1_0 ) )
            // InternalFPML.g:4264:2: ( rule__CompositionFunctionBodyEffect__PrimitiveElementAssignment_1_0 )
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getPrimitiveElementAssignment_1_0()); 
            // InternalFPML.g:4265:2: ( rule__CompositionFunctionBodyEffect__PrimitiveElementAssignment_1_0 )
            // InternalFPML.g:4265:3: rule__CompositionFunctionBodyEffect__PrimitiveElementAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__CompositionFunctionBodyEffect__PrimitiveElementAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getCompositionFunctionBodyEffectAccess().getPrimitiveElementAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionFunctionBodyEffect__Group_1__0__Impl"


    // $ANTLR start "rule__CompositionFunctionBodyEffect__Group_1__1"
    // InternalFPML.g:4273:1: rule__CompositionFunctionBodyEffect__Group_1__1 : rule__CompositionFunctionBodyEffect__Group_1__1__Impl rule__CompositionFunctionBodyEffect__Group_1__2 ;
    public final void rule__CompositionFunctionBodyEffect__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4277:1: ( rule__CompositionFunctionBodyEffect__Group_1__1__Impl rule__CompositionFunctionBodyEffect__Group_1__2 )
            // InternalFPML.g:4278:2: rule__CompositionFunctionBodyEffect__Group_1__1__Impl rule__CompositionFunctionBodyEffect__Group_1__2
            {
            pushFollow(FOLLOW_31);
            rule__CompositionFunctionBodyEffect__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositionFunctionBodyEffect__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionFunctionBodyEffect__Group_1__1"


    // $ANTLR start "rule__CompositionFunctionBodyEffect__Group_1__1__Impl"
    // InternalFPML.g:4285:1: rule__CompositionFunctionBodyEffect__Group_1__1__Impl : ( ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 ) ) ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 )* ) ) ;
    public final void rule__CompositionFunctionBodyEffect__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4289:1: ( ( ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 ) ) ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 )* ) ) )
            // InternalFPML.g:4290:1: ( ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 ) ) ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 )* ) )
            {
            // InternalFPML.g:4290:1: ( ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 ) ) ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 )* ) )
            // InternalFPML.g:4291:2: ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 ) ) ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 )* )
            {
            // InternalFPML.g:4291:2: ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 ) )
            // InternalFPML.g:4292:3: ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 )
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainAssignment_1_1()); 
            // InternalFPML.g:4293:3: ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 )
            // InternalFPML.g:4293:4: rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1
            {
            pushFollow(FOLLOW_34);
            rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainAssignment_1_1()); 

            }

            // InternalFPML.g:4296:2: ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 )* )
            // InternalFPML.g:4297:3: ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 )*
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainAssignment_1_1()); 
            // InternalFPML.g:4298:3: ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==30) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalFPML.g:4298:4: rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainAssignment_1_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionFunctionBodyEffect__Group_1__1__Impl"


    // $ANTLR start "rule__CompositionFunctionBodyEffect__Group_1__2"
    // InternalFPML.g:4307:1: rule__CompositionFunctionBodyEffect__Group_1__2 : rule__CompositionFunctionBodyEffect__Group_1__2__Impl ;
    public final void rule__CompositionFunctionBodyEffect__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4311:1: ( rule__CompositionFunctionBodyEffect__Group_1__2__Impl )
            // InternalFPML.g:4312:2: rule__CompositionFunctionBodyEffect__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositionFunctionBodyEffect__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionFunctionBodyEffect__Group_1__2"


    // $ANTLR start "rule__CompositionFunctionBodyEffect__Group_1__2__Impl"
    // InternalFPML.g:4318:1: rule__CompositionFunctionBodyEffect__Group_1__2__Impl : ( ( rule__CompositionFunctionBodyEffect__ReturnFunctionAssignment_1_2 )? ) ;
    public final void rule__CompositionFunctionBodyEffect__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4322:1: ( ( ( rule__CompositionFunctionBodyEffect__ReturnFunctionAssignment_1_2 )? ) )
            // InternalFPML.g:4323:1: ( ( rule__CompositionFunctionBodyEffect__ReturnFunctionAssignment_1_2 )? )
            {
            // InternalFPML.g:4323:1: ( ( rule__CompositionFunctionBodyEffect__ReturnFunctionAssignment_1_2 )? )
            // InternalFPML.g:4324:2: ( rule__CompositionFunctionBodyEffect__ReturnFunctionAssignment_1_2 )?
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getReturnFunctionAssignment_1_2()); 
            // InternalFPML.g:4325:2: ( rule__CompositionFunctionBodyEffect__ReturnFunctionAssignment_1_2 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==31) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalFPML.g:4325:3: rule__CompositionFunctionBodyEffect__ReturnFunctionAssignment_1_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompositionFunctionBodyEffect__ReturnFunctionAssignment_1_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompositionFunctionBodyEffectAccess().getReturnFunctionAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionFunctionBodyEffect__Group_1__2__Impl"


    // $ANTLR start "rule__CompositionFunctionBodyEffectFullFactor__Group_0__0"
    // InternalFPML.g:4334:1: rule__CompositionFunctionBodyEffectFullFactor__Group_0__0 : rule__CompositionFunctionBodyEffectFullFactor__Group_0__0__Impl rule__CompositionFunctionBodyEffectFullFactor__Group_0__1 ;
    public final void rule__CompositionFunctionBodyEffectFullFactor__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4338:1: ( rule__CompositionFunctionBodyEffectFullFactor__Group_0__0__Impl rule__CompositionFunctionBodyEffectFullFactor__Group_0__1 )
            // InternalFPML.g:4339:2: rule__CompositionFunctionBodyEffectFullFactor__Group_0__0__Impl rule__CompositionFunctionBodyEffectFullFactor__Group_0__1
            {
            pushFollow(FOLLOW_20);
            rule__CompositionFunctionBodyEffectFullFactor__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositionFunctionBodyEffectFullFactor__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionFunctionBodyEffectFullFactor__Group_0__0"


    // $ANTLR start "rule__CompositionFunctionBodyEffectFullFactor__Group_0__0__Impl"
    // InternalFPML.g:4346:1: rule__CompositionFunctionBodyEffectFullFactor__Group_0__0__Impl : ( '>>=' ) ;
    public final void rule__CompositionFunctionBodyEffectFullFactor__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4350:1: ( ( '>>=' ) )
            // InternalFPML.g:4351:1: ( '>>=' )
            {
            // InternalFPML.g:4351:1: ( '>>=' )
            // InternalFPML.g:4352:2: '>>='
            {
             before(grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getGreaterThanSignGreaterThanSignEqualsSignKeyword_0_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getGreaterThanSignGreaterThanSignEqualsSignKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionFunctionBodyEffectFullFactor__Group_0__0__Impl"


    // $ANTLR start "rule__CompositionFunctionBodyEffectFullFactor__Group_0__1"
    // InternalFPML.g:4361:1: rule__CompositionFunctionBodyEffectFullFactor__Group_0__1 : rule__CompositionFunctionBodyEffectFullFactor__Group_0__1__Impl ;
    public final void rule__CompositionFunctionBodyEffectFullFactor__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4365:1: ( rule__CompositionFunctionBodyEffectFullFactor__Group_0__1__Impl )
            // InternalFPML.g:4366:2: rule__CompositionFunctionBodyEffectFullFactor__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositionFunctionBodyEffectFullFactor__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionFunctionBodyEffectFullFactor__Group_0__1"


    // $ANTLR start "rule__CompositionFunctionBodyEffectFullFactor__Group_0__1__Impl"
    // InternalFPML.g:4372:1: rule__CompositionFunctionBodyEffectFullFactor__Group_0__1__Impl : ( ( rule__CompositionFunctionBodyEffectFullFactor__ReferenceElementAssignment_0_1 ) ) ;
    public final void rule__CompositionFunctionBodyEffectFullFactor__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4376:1: ( ( ( rule__CompositionFunctionBodyEffectFullFactor__ReferenceElementAssignment_0_1 ) ) )
            // InternalFPML.g:4377:1: ( ( rule__CompositionFunctionBodyEffectFullFactor__ReferenceElementAssignment_0_1 ) )
            {
            // InternalFPML.g:4377:1: ( ( rule__CompositionFunctionBodyEffectFullFactor__ReferenceElementAssignment_0_1 ) )
            // InternalFPML.g:4378:2: ( rule__CompositionFunctionBodyEffectFullFactor__ReferenceElementAssignment_0_1 )
            {
             before(grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getReferenceElementAssignment_0_1()); 
            // InternalFPML.g:4379:2: ( rule__CompositionFunctionBodyEffectFullFactor__ReferenceElementAssignment_0_1 )
            // InternalFPML.g:4379:3: rule__CompositionFunctionBodyEffectFullFactor__ReferenceElementAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositionFunctionBodyEffectFullFactor__ReferenceElementAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getReferenceElementAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionFunctionBodyEffectFullFactor__Group_0__1__Impl"


    // $ANTLR start "rule__CompositionFunctionBodyEffectFullFactor__Group_1__0"
    // InternalFPML.g:4388:1: rule__CompositionFunctionBodyEffectFullFactor__Group_1__0 : rule__CompositionFunctionBodyEffectFullFactor__Group_1__0__Impl rule__CompositionFunctionBodyEffectFullFactor__Group_1__1 ;
    public final void rule__CompositionFunctionBodyEffectFullFactor__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4392:1: ( rule__CompositionFunctionBodyEffectFullFactor__Group_1__0__Impl rule__CompositionFunctionBodyEffectFullFactor__Group_1__1 )
            // InternalFPML.g:4393:2: rule__CompositionFunctionBodyEffectFullFactor__Group_1__0__Impl rule__CompositionFunctionBodyEffectFullFactor__Group_1__1
            {
            pushFollow(FOLLOW_26);
            rule__CompositionFunctionBodyEffectFullFactor__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositionFunctionBodyEffectFullFactor__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionFunctionBodyEffectFullFactor__Group_1__0"


    // $ANTLR start "rule__CompositionFunctionBodyEffectFullFactor__Group_1__0__Impl"
    // InternalFPML.g:4400:1: rule__CompositionFunctionBodyEffectFullFactor__Group_1__0__Impl : ( '>>=' ) ;
    public final void rule__CompositionFunctionBodyEffectFullFactor__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4404:1: ( ( '>>=' ) )
            // InternalFPML.g:4405:1: ( '>>=' )
            {
            // InternalFPML.g:4405:1: ( '>>=' )
            // InternalFPML.g:4406:2: '>>='
            {
             before(grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getGreaterThanSignGreaterThanSignEqualsSignKeyword_1_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getGreaterThanSignGreaterThanSignEqualsSignKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionFunctionBodyEffectFullFactor__Group_1__0__Impl"


    // $ANTLR start "rule__CompositionFunctionBodyEffectFullFactor__Group_1__1"
    // InternalFPML.g:4415:1: rule__CompositionFunctionBodyEffectFullFactor__Group_1__1 : rule__CompositionFunctionBodyEffectFullFactor__Group_1__1__Impl ;
    public final void rule__CompositionFunctionBodyEffectFullFactor__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4419:1: ( rule__CompositionFunctionBodyEffectFullFactor__Group_1__1__Impl )
            // InternalFPML.g:4420:2: rule__CompositionFunctionBodyEffectFullFactor__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositionFunctionBodyEffectFullFactor__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionFunctionBodyEffectFullFactor__Group_1__1"


    // $ANTLR start "rule__CompositionFunctionBodyEffectFullFactor__Group_1__1__Impl"
    // InternalFPML.g:4426:1: rule__CompositionFunctionBodyEffectFullFactor__Group_1__1__Impl : ( ( rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAssignment_1_1 ) ) ;
    public final void rule__CompositionFunctionBodyEffectFullFactor__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4430:1: ( ( ( rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAssignment_1_1 ) ) )
            // InternalFPML.g:4431:1: ( ( rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAssignment_1_1 ) )
            {
            // InternalFPML.g:4431:1: ( ( rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAssignment_1_1 ) )
            // InternalFPML.g:4432:2: ( rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAssignment_1_1 )
            {
             before(grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getPrimitiveElementAssignment_1_1()); 
            // InternalFPML.g:4433:2: ( rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAssignment_1_1 )
            // InternalFPML.g:4433:3: rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getPrimitiveElementAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionFunctionBodyEffectFullFactor__Group_1__1__Impl"


    // $ANTLR start "rule__ReturnPureFunction__Group__0"
    // InternalFPML.g:4442:1: rule__ReturnPureFunction__Group__0 : rule__ReturnPureFunction__Group__0__Impl rule__ReturnPureFunction__Group__1 ;
    public final void rule__ReturnPureFunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4446:1: ( rule__ReturnPureFunction__Group__0__Impl rule__ReturnPureFunction__Group__1 )
            // InternalFPML.g:4447:2: rule__ReturnPureFunction__Group__0__Impl rule__ReturnPureFunction__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__ReturnPureFunction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReturnPureFunction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnPureFunction__Group__0"


    // $ANTLR start "rule__ReturnPureFunction__Group__0__Impl"
    // InternalFPML.g:4454:1: rule__ReturnPureFunction__Group__0__Impl : ( '->' ) ;
    public final void rule__ReturnPureFunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4458:1: ( ( '->' ) )
            // InternalFPML.g:4459:1: ( '->' )
            {
            // InternalFPML.g:4459:1: ( '->' )
            // InternalFPML.g:4460:2: '->'
            {
             before(grammarAccess.getReturnPureFunctionAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getReturnPureFunctionAccess().getHyphenMinusGreaterThanSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnPureFunction__Group__0__Impl"


    // $ANTLR start "rule__ReturnPureFunction__Group__1"
    // InternalFPML.g:4469:1: rule__ReturnPureFunction__Group__1 : rule__ReturnPureFunction__Group__1__Impl rule__ReturnPureFunction__Group__2 ;
    public final void rule__ReturnPureFunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4473:1: ( rule__ReturnPureFunction__Group__1__Impl rule__ReturnPureFunction__Group__2 )
            // InternalFPML.g:4474:2: rule__ReturnPureFunction__Group__1__Impl rule__ReturnPureFunction__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__ReturnPureFunction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReturnPureFunction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnPureFunction__Group__1"


    // $ANTLR start "rule__ReturnPureFunction__Group__1__Impl"
    // InternalFPML.g:4481:1: rule__ReturnPureFunction__Group__1__Impl : ( '(' ) ;
    public final void rule__ReturnPureFunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4485:1: ( ( '(' ) )
            // InternalFPML.g:4486:1: ( '(' )
            {
            // InternalFPML.g:4486:1: ( '(' )
            // InternalFPML.g:4487:2: '('
            {
             before(grammarAccess.getReturnPureFunctionAccess().getLeftParenthesisKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getReturnPureFunctionAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnPureFunction__Group__1__Impl"


    // $ANTLR start "rule__ReturnPureFunction__Group__2"
    // InternalFPML.g:4496:1: rule__ReturnPureFunction__Group__2 : rule__ReturnPureFunction__Group__2__Impl rule__ReturnPureFunction__Group__3 ;
    public final void rule__ReturnPureFunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4500:1: ( rule__ReturnPureFunction__Group__2__Impl rule__ReturnPureFunction__Group__3 )
            // InternalFPML.g:4501:2: rule__ReturnPureFunction__Group__2__Impl rule__ReturnPureFunction__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__ReturnPureFunction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReturnPureFunction__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnPureFunction__Group__2"


    // $ANTLR start "rule__ReturnPureFunction__Group__2__Impl"
    // InternalFPML.g:4508:1: rule__ReturnPureFunction__Group__2__Impl : ( ( rule__ReturnPureFunction__LambdaFunctionBodyAssignment_2 ) ) ;
    public final void rule__ReturnPureFunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4512:1: ( ( ( rule__ReturnPureFunction__LambdaFunctionBodyAssignment_2 ) ) )
            // InternalFPML.g:4513:1: ( ( rule__ReturnPureFunction__LambdaFunctionBodyAssignment_2 ) )
            {
            // InternalFPML.g:4513:1: ( ( rule__ReturnPureFunction__LambdaFunctionBodyAssignment_2 ) )
            // InternalFPML.g:4514:2: ( rule__ReturnPureFunction__LambdaFunctionBodyAssignment_2 )
            {
             before(grammarAccess.getReturnPureFunctionAccess().getLambdaFunctionBodyAssignment_2()); 
            // InternalFPML.g:4515:2: ( rule__ReturnPureFunction__LambdaFunctionBodyAssignment_2 )
            // InternalFPML.g:4515:3: rule__ReturnPureFunction__LambdaFunctionBodyAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ReturnPureFunction__LambdaFunctionBodyAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getReturnPureFunctionAccess().getLambdaFunctionBodyAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnPureFunction__Group__2__Impl"


    // $ANTLR start "rule__ReturnPureFunction__Group__3"
    // InternalFPML.g:4523:1: rule__ReturnPureFunction__Group__3 : rule__ReturnPureFunction__Group__3__Impl ;
    public final void rule__ReturnPureFunction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4527:1: ( rule__ReturnPureFunction__Group__3__Impl )
            // InternalFPML.g:4528:2: rule__ReturnPureFunction__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReturnPureFunction__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnPureFunction__Group__3"


    // $ANTLR start "rule__ReturnPureFunction__Group__3__Impl"
    // InternalFPML.g:4534:1: rule__ReturnPureFunction__Group__3__Impl : ( ')' ) ;
    public final void rule__ReturnPureFunction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4538:1: ( ( ')' ) )
            // InternalFPML.g:4539:1: ( ')' )
            {
            // InternalFPML.g:4539:1: ( ')' )
            // InternalFPML.g:4540:2: ')'
            {
             before(grammarAccess.getReturnPureFunctionAccess().getRightParenthesisKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getReturnPureFunctionAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnPureFunction__Group__3__Impl"


    // $ANTLR start "rule__ReturnEffectFullFunction__Group__0"
    // InternalFPML.g:4550:1: rule__ReturnEffectFullFunction__Group__0 : rule__ReturnEffectFullFunction__Group__0__Impl rule__ReturnEffectFullFunction__Group__1 ;
    public final void rule__ReturnEffectFullFunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4554:1: ( rule__ReturnEffectFullFunction__Group__0__Impl rule__ReturnEffectFullFunction__Group__1 )
            // InternalFPML.g:4555:2: rule__ReturnEffectFullFunction__Group__0__Impl rule__ReturnEffectFullFunction__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__ReturnEffectFullFunction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReturnEffectFullFunction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnEffectFullFunction__Group__0"


    // $ANTLR start "rule__ReturnEffectFullFunction__Group__0__Impl"
    // InternalFPML.g:4562:1: rule__ReturnEffectFullFunction__Group__0__Impl : ( '->' ) ;
    public final void rule__ReturnEffectFullFunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4566:1: ( ( '->' ) )
            // InternalFPML.g:4567:1: ( '->' )
            {
            // InternalFPML.g:4567:1: ( '->' )
            // InternalFPML.g:4568:2: '->'
            {
             before(grammarAccess.getReturnEffectFullFunctionAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getReturnEffectFullFunctionAccess().getHyphenMinusGreaterThanSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnEffectFullFunction__Group__0__Impl"


    // $ANTLR start "rule__ReturnEffectFullFunction__Group__1"
    // InternalFPML.g:4577:1: rule__ReturnEffectFullFunction__Group__1 : rule__ReturnEffectFullFunction__Group__1__Impl rule__ReturnEffectFullFunction__Group__2 ;
    public final void rule__ReturnEffectFullFunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4581:1: ( rule__ReturnEffectFullFunction__Group__1__Impl rule__ReturnEffectFullFunction__Group__2 )
            // InternalFPML.g:4582:2: rule__ReturnEffectFullFunction__Group__1__Impl rule__ReturnEffectFullFunction__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__ReturnEffectFullFunction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReturnEffectFullFunction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnEffectFullFunction__Group__1"


    // $ANTLR start "rule__ReturnEffectFullFunction__Group__1__Impl"
    // InternalFPML.g:4589:1: rule__ReturnEffectFullFunction__Group__1__Impl : ( '(' ) ;
    public final void rule__ReturnEffectFullFunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4593:1: ( ( '(' ) )
            // InternalFPML.g:4594:1: ( '(' )
            {
            // InternalFPML.g:4594:1: ( '(' )
            // InternalFPML.g:4595:2: '('
            {
             before(grammarAccess.getReturnEffectFullFunctionAccess().getLeftParenthesisKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getReturnEffectFullFunctionAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnEffectFullFunction__Group__1__Impl"


    // $ANTLR start "rule__ReturnEffectFullFunction__Group__2"
    // InternalFPML.g:4604:1: rule__ReturnEffectFullFunction__Group__2 : rule__ReturnEffectFullFunction__Group__2__Impl rule__ReturnEffectFullFunction__Group__3 ;
    public final void rule__ReturnEffectFullFunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4608:1: ( rule__ReturnEffectFullFunction__Group__2__Impl rule__ReturnEffectFullFunction__Group__3 )
            // InternalFPML.g:4609:2: rule__ReturnEffectFullFunction__Group__2__Impl rule__ReturnEffectFullFunction__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__ReturnEffectFullFunction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReturnEffectFullFunction__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnEffectFullFunction__Group__2"


    // $ANTLR start "rule__ReturnEffectFullFunction__Group__2__Impl"
    // InternalFPML.g:4616:1: rule__ReturnEffectFullFunction__Group__2__Impl : ( ( rule__ReturnEffectFullFunction__LambdaFunctionBodyAssignment_2 ) ) ;
    public final void rule__ReturnEffectFullFunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4620:1: ( ( ( rule__ReturnEffectFullFunction__LambdaFunctionBodyAssignment_2 ) ) )
            // InternalFPML.g:4621:1: ( ( rule__ReturnEffectFullFunction__LambdaFunctionBodyAssignment_2 ) )
            {
            // InternalFPML.g:4621:1: ( ( rule__ReturnEffectFullFunction__LambdaFunctionBodyAssignment_2 ) )
            // InternalFPML.g:4622:2: ( rule__ReturnEffectFullFunction__LambdaFunctionBodyAssignment_2 )
            {
             before(grammarAccess.getReturnEffectFullFunctionAccess().getLambdaFunctionBodyAssignment_2()); 
            // InternalFPML.g:4623:2: ( rule__ReturnEffectFullFunction__LambdaFunctionBodyAssignment_2 )
            // InternalFPML.g:4623:3: rule__ReturnEffectFullFunction__LambdaFunctionBodyAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ReturnEffectFullFunction__LambdaFunctionBodyAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getReturnEffectFullFunctionAccess().getLambdaFunctionBodyAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnEffectFullFunction__Group__2__Impl"


    // $ANTLR start "rule__ReturnEffectFullFunction__Group__3"
    // InternalFPML.g:4631:1: rule__ReturnEffectFullFunction__Group__3 : rule__ReturnEffectFullFunction__Group__3__Impl ;
    public final void rule__ReturnEffectFullFunction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4635:1: ( rule__ReturnEffectFullFunction__Group__3__Impl )
            // InternalFPML.g:4636:2: rule__ReturnEffectFullFunction__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReturnEffectFullFunction__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnEffectFullFunction__Group__3"


    // $ANTLR start "rule__ReturnEffectFullFunction__Group__3__Impl"
    // InternalFPML.g:4642:1: rule__ReturnEffectFullFunction__Group__3__Impl : ( ')' ) ;
    public final void rule__ReturnEffectFullFunction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4646:1: ( ( ')' ) )
            // InternalFPML.g:4647:1: ( ')' )
            {
            // InternalFPML.g:4647:1: ( ')' )
            // InternalFPML.g:4648:2: ')'
            {
             before(grammarAccess.getReturnEffectFullFunctionAccess().getRightParenthesisKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getReturnEffectFullFunctionAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnEffectFullFunction__Group__3__Impl"


    // $ANTLR start "rule__IOType__Group__0"
    // InternalFPML.g:4658:1: rule__IOType__Group__0 : rule__IOType__Group__0__Impl rule__IOType__Group__1 ;
    public final void rule__IOType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4662:1: ( rule__IOType__Group__0__Impl rule__IOType__Group__1 )
            // InternalFPML.g:4663:2: rule__IOType__Group__0__Impl rule__IOType__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__IOType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IOType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IOType__Group__0"


    // $ANTLR start "rule__IOType__Group__0__Impl"
    // InternalFPML.g:4670:1: rule__IOType__Group__0__Impl : ( 'IO' ) ;
    public final void rule__IOType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4674:1: ( ( 'IO' ) )
            // InternalFPML.g:4675:1: ( 'IO' )
            {
            // InternalFPML.g:4675:1: ( 'IO' )
            // InternalFPML.g:4676:2: 'IO'
            {
             before(grammarAccess.getIOTypeAccess().getIOKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getIOTypeAccess().getIOKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IOType__Group__0__Impl"


    // $ANTLR start "rule__IOType__Group__1"
    // InternalFPML.g:4685:1: rule__IOType__Group__1 : rule__IOType__Group__1__Impl ;
    public final void rule__IOType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4689:1: ( rule__IOType__Group__1__Impl )
            // InternalFPML.g:4690:2: rule__IOType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IOType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IOType__Group__1"


    // $ANTLR start "rule__IOType__Group__1__Impl"
    // InternalFPML.g:4696:1: rule__IOType__Group__1__Impl : ( ( rule__IOType__TypeAssignment_1 ) ) ;
    public final void rule__IOType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4700:1: ( ( ( rule__IOType__TypeAssignment_1 ) ) )
            // InternalFPML.g:4701:1: ( ( rule__IOType__TypeAssignment_1 ) )
            {
            // InternalFPML.g:4701:1: ( ( rule__IOType__TypeAssignment_1 ) )
            // InternalFPML.g:4702:2: ( rule__IOType__TypeAssignment_1 )
            {
             before(grammarAccess.getIOTypeAccess().getTypeAssignment_1()); 
            // InternalFPML.g:4703:2: ( rule__IOType__TypeAssignment_1 )
            // InternalFPML.g:4703:3: rule__IOType__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__IOType__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIOTypeAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IOType__Group__1__Impl"


    // $ANTLR start "rule__IntegerType__Group__0"
    // InternalFPML.g:4712:1: rule__IntegerType__Group__0 : rule__IntegerType__Group__0__Impl rule__IntegerType__Group__1 ;
    public final void rule__IntegerType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4716:1: ( rule__IntegerType__Group__0__Impl rule__IntegerType__Group__1 )
            // InternalFPML.g:4717:2: rule__IntegerType__Group__0__Impl rule__IntegerType__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__IntegerType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerType__Group__0"


    // $ANTLR start "rule__IntegerType__Group__0__Impl"
    // InternalFPML.g:4724:1: rule__IntegerType__Group__0__Impl : ( () ) ;
    public final void rule__IntegerType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4728:1: ( ( () ) )
            // InternalFPML.g:4729:1: ( () )
            {
            // InternalFPML.g:4729:1: ( () )
            // InternalFPML.g:4730:2: ()
            {
             before(grammarAccess.getIntegerTypeAccess().getIntegerTypeAction_0()); 
            // InternalFPML.g:4731:2: ()
            // InternalFPML.g:4731:3: 
            {
            }

             after(grammarAccess.getIntegerTypeAccess().getIntegerTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerType__Group__0__Impl"


    // $ANTLR start "rule__IntegerType__Group__1"
    // InternalFPML.g:4739:1: rule__IntegerType__Group__1 : rule__IntegerType__Group__1__Impl ;
    public final void rule__IntegerType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4743:1: ( rule__IntegerType__Group__1__Impl )
            // InternalFPML.g:4744:2: rule__IntegerType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntegerType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerType__Group__1"


    // $ANTLR start "rule__IntegerType__Group__1__Impl"
    // InternalFPML.g:4750:1: rule__IntegerType__Group__1__Impl : ( ( rule__IntegerType__TypeAssignment_1 ) ) ;
    public final void rule__IntegerType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4754:1: ( ( ( rule__IntegerType__TypeAssignment_1 ) ) )
            // InternalFPML.g:4755:1: ( ( rule__IntegerType__TypeAssignment_1 ) )
            {
            // InternalFPML.g:4755:1: ( ( rule__IntegerType__TypeAssignment_1 ) )
            // InternalFPML.g:4756:2: ( rule__IntegerType__TypeAssignment_1 )
            {
             before(grammarAccess.getIntegerTypeAccess().getTypeAssignment_1()); 
            // InternalFPML.g:4757:2: ( rule__IntegerType__TypeAssignment_1 )
            // InternalFPML.g:4757:3: rule__IntegerType__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__IntegerType__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIntegerTypeAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerType__Group__1__Impl"


    // $ANTLR start "rule__StringType__Group__0"
    // InternalFPML.g:4766:1: rule__StringType__Group__0 : rule__StringType__Group__0__Impl rule__StringType__Group__1 ;
    public final void rule__StringType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4770:1: ( rule__StringType__Group__0__Impl rule__StringType__Group__1 )
            // InternalFPML.g:4771:2: rule__StringType__Group__0__Impl rule__StringType__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__StringType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group__0"


    // $ANTLR start "rule__StringType__Group__0__Impl"
    // InternalFPML.g:4778:1: rule__StringType__Group__0__Impl : ( () ) ;
    public final void rule__StringType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4782:1: ( ( () ) )
            // InternalFPML.g:4783:1: ( () )
            {
            // InternalFPML.g:4783:1: ( () )
            // InternalFPML.g:4784:2: ()
            {
             before(grammarAccess.getStringTypeAccess().getStringTypeAction_0()); 
            // InternalFPML.g:4785:2: ()
            // InternalFPML.g:4785:3: 
            {
            }

             after(grammarAccess.getStringTypeAccess().getStringTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group__0__Impl"


    // $ANTLR start "rule__StringType__Group__1"
    // InternalFPML.g:4793:1: rule__StringType__Group__1 : rule__StringType__Group__1__Impl ;
    public final void rule__StringType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4797:1: ( rule__StringType__Group__1__Impl )
            // InternalFPML.g:4798:2: rule__StringType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group__1"


    // $ANTLR start "rule__StringType__Group__1__Impl"
    // InternalFPML.g:4804:1: rule__StringType__Group__1__Impl : ( ( rule__StringType__TypeAssignment_1 ) ) ;
    public final void rule__StringType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4808:1: ( ( ( rule__StringType__TypeAssignment_1 ) ) )
            // InternalFPML.g:4809:1: ( ( rule__StringType__TypeAssignment_1 ) )
            {
            // InternalFPML.g:4809:1: ( ( rule__StringType__TypeAssignment_1 ) )
            // InternalFPML.g:4810:2: ( rule__StringType__TypeAssignment_1 )
            {
             before(grammarAccess.getStringTypeAccess().getTypeAssignment_1()); 
            // InternalFPML.g:4811:2: ( rule__StringType__TypeAssignment_1 )
            // InternalFPML.g:4811:3: rule__StringType__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__StringType__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStringTypeAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group__1__Impl"


    // $ANTLR start "rule__UnitType__Group__0"
    // InternalFPML.g:4820:1: rule__UnitType__Group__0 : rule__UnitType__Group__0__Impl rule__UnitType__Group__1 ;
    public final void rule__UnitType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4824:1: ( rule__UnitType__Group__0__Impl rule__UnitType__Group__1 )
            // InternalFPML.g:4825:2: rule__UnitType__Group__0__Impl rule__UnitType__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__UnitType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnitType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitType__Group__0"


    // $ANTLR start "rule__UnitType__Group__0__Impl"
    // InternalFPML.g:4832:1: rule__UnitType__Group__0__Impl : ( () ) ;
    public final void rule__UnitType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4836:1: ( ( () ) )
            // InternalFPML.g:4837:1: ( () )
            {
            // InternalFPML.g:4837:1: ( () )
            // InternalFPML.g:4838:2: ()
            {
             before(grammarAccess.getUnitTypeAccess().getUnitTypeAction_0()); 
            // InternalFPML.g:4839:2: ()
            // InternalFPML.g:4839:3: 
            {
            }

             after(grammarAccess.getUnitTypeAccess().getUnitTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitType__Group__0__Impl"


    // $ANTLR start "rule__UnitType__Group__1"
    // InternalFPML.g:4847:1: rule__UnitType__Group__1 : rule__UnitType__Group__1__Impl ;
    public final void rule__UnitType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4851:1: ( rule__UnitType__Group__1__Impl )
            // InternalFPML.g:4852:2: rule__UnitType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnitType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitType__Group__1"


    // $ANTLR start "rule__UnitType__Group__1__Impl"
    // InternalFPML.g:4858:1: rule__UnitType__Group__1__Impl : ( ( rule__UnitType__TypeAssignment_1 ) ) ;
    public final void rule__UnitType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4862:1: ( ( ( rule__UnitType__TypeAssignment_1 ) ) )
            // InternalFPML.g:4863:1: ( ( rule__UnitType__TypeAssignment_1 ) )
            {
            // InternalFPML.g:4863:1: ( ( rule__UnitType__TypeAssignment_1 ) )
            // InternalFPML.g:4864:2: ( rule__UnitType__TypeAssignment_1 )
            {
             before(grammarAccess.getUnitTypeAccess().getTypeAssignment_1()); 
            // InternalFPML.g:4865:2: ( rule__UnitType__TypeAssignment_1 )
            // InternalFPML.g:4865:3: rule__UnitType__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__UnitType__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUnitTypeAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitType__Group__1__Impl"


    // $ANTLR start "rule__DataType__Group__0"
    // InternalFPML.g:4874:1: rule__DataType__Group__0 : rule__DataType__Group__0__Impl rule__DataType__Group__1 ;
    public final void rule__DataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4878:1: ( rule__DataType__Group__0__Impl rule__DataType__Group__1 )
            // InternalFPML.g:4879:2: rule__DataType__Group__0__Impl rule__DataType__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__DataType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__0"


    // $ANTLR start "rule__DataType__Group__0__Impl"
    // InternalFPML.g:4886:1: rule__DataType__Group__0__Impl : ( () ) ;
    public final void rule__DataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4890:1: ( ( () ) )
            // InternalFPML.g:4891:1: ( () )
            {
            // InternalFPML.g:4891:1: ( () )
            // InternalFPML.g:4892:2: ()
            {
             before(grammarAccess.getDataTypeAccess().getDataTypeAction_0()); 
            // InternalFPML.g:4893:2: ()
            // InternalFPML.g:4893:3: 
            {
            }

             after(grammarAccess.getDataTypeAccess().getDataTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__0__Impl"


    // $ANTLR start "rule__DataType__Group__1"
    // InternalFPML.g:4901:1: rule__DataType__Group__1 : rule__DataType__Group__1__Impl rule__DataType__Group__2 ;
    public final void rule__DataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4905:1: ( rule__DataType__Group__1__Impl rule__DataType__Group__2 )
            // InternalFPML.g:4906:2: rule__DataType__Group__1__Impl rule__DataType__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__DataType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__1"


    // $ANTLR start "rule__DataType__Group__1__Impl"
    // InternalFPML.g:4913:1: rule__DataType__Group__1__Impl : ( 'ref' ) ;
    public final void rule__DataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4917:1: ( ( 'ref' ) )
            // InternalFPML.g:4918:1: ( 'ref' )
            {
            // InternalFPML.g:4918:1: ( 'ref' )
            // InternalFPML.g:4919:2: 'ref'
            {
             before(grammarAccess.getDataTypeAccess().getRefKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getRefKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__1__Impl"


    // $ANTLR start "rule__DataType__Group__2"
    // InternalFPML.g:4928:1: rule__DataType__Group__2 : rule__DataType__Group__2__Impl ;
    public final void rule__DataType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4932:1: ( rule__DataType__Group__2__Impl )
            // InternalFPML.g:4933:2: rule__DataType__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__2"


    // $ANTLR start "rule__DataType__Group__2__Impl"
    // InternalFPML.g:4939:1: rule__DataType__Group__2__Impl : ( ( rule__DataType__TypeAssignment_2 ) ) ;
    public final void rule__DataType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4943:1: ( ( ( rule__DataType__TypeAssignment_2 ) ) )
            // InternalFPML.g:4944:1: ( ( rule__DataType__TypeAssignment_2 ) )
            {
            // InternalFPML.g:4944:1: ( ( rule__DataType__TypeAssignment_2 ) )
            // InternalFPML.g:4945:2: ( rule__DataType__TypeAssignment_2 )
            {
             before(grammarAccess.getDataTypeAccess().getTypeAssignment_2()); 
            // InternalFPML.g:4946:2: ( rule__DataType__TypeAssignment_2 )
            // InternalFPML.g:4946:3: rule__DataType__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DataType__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__2__Impl"


    // $ANTLR start "rule__PureFunctionType__Group__0"
    // InternalFPML.g:4955:1: rule__PureFunctionType__Group__0 : rule__PureFunctionType__Group__0__Impl rule__PureFunctionType__Group__1 ;
    public final void rule__PureFunctionType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4959:1: ( rule__PureFunctionType__Group__0__Impl rule__PureFunctionType__Group__1 )
            // InternalFPML.g:4960:2: rule__PureFunctionType__Group__0__Impl rule__PureFunctionType__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__PureFunctionType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PureFunctionType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunctionType__Group__0"


    // $ANTLR start "rule__PureFunctionType__Group__0__Impl"
    // InternalFPML.g:4967:1: rule__PureFunctionType__Group__0__Impl : ( () ) ;
    public final void rule__PureFunctionType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4971:1: ( ( () ) )
            // InternalFPML.g:4972:1: ( () )
            {
            // InternalFPML.g:4972:1: ( () )
            // InternalFPML.g:4973:2: ()
            {
             before(grammarAccess.getPureFunctionTypeAccess().getPureFunctionTypeAction_0()); 
            // InternalFPML.g:4974:2: ()
            // InternalFPML.g:4974:3: 
            {
            }

             after(grammarAccess.getPureFunctionTypeAccess().getPureFunctionTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunctionType__Group__0__Impl"


    // $ANTLR start "rule__PureFunctionType__Group__1"
    // InternalFPML.g:4982:1: rule__PureFunctionType__Group__1 : rule__PureFunctionType__Group__1__Impl rule__PureFunctionType__Group__2 ;
    public final void rule__PureFunctionType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4986:1: ( rule__PureFunctionType__Group__1__Impl rule__PureFunctionType__Group__2 )
            // InternalFPML.g:4987:2: rule__PureFunctionType__Group__1__Impl rule__PureFunctionType__Group__2
            {
            pushFollow(FOLLOW_38);
            rule__PureFunctionType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PureFunctionType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunctionType__Group__1"


    // $ANTLR start "rule__PureFunctionType__Group__1__Impl"
    // InternalFPML.g:4994:1: rule__PureFunctionType__Group__1__Impl : ( 'F' ) ;
    public final void rule__PureFunctionType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4998:1: ( ( 'F' ) )
            // InternalFPML.g:4999:1: ( 'F' )
            {
            // InternalFPML.g:4999:1: ( 'F' )
            // InternalFPML.g:5000:2: 'F'
            {
             before(grammarAccess.getPureFunctionTypeAccess().getFKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getPureFunctionTypeAccess().getFKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunctionType__Group__1__Impl"


    // $ANTLR start "rule__PureFunctionType__Group__2"
    // InternalFPML.g:5009:1: rule__PureFunctionType__Group__2 : rule__PureFunctionType__Group__2__Impl rule__PureFunctionType__Group__3 ;
    public final void rule__PureFunctionType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5013:1: ( rule__PureFunctionType__Group__2__Impl rule__PureFunctionType__Group__3 )
            // InternalFPML.g:5014:2: rule__PureFunctionType__Group__2__Impl rule__PureFunctionType__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__PureFunctionType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PureFunctionType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunctionType__Group__2"


    // $ANTLR start "rule__PureFunctionType__Group__2__Impl"
    // InternalFPML.g:5021:1: rule__PureFunctionType__Group__2__Impl : ( '<' ) ;
    public final void rule__PureFunctionType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5025:1: ( ( '<' ) )
            // InternalFPML.g:5026:1: ( '<' )
            {
            // InternalFPML.g:5026:1: ( '<' )
            // InternalFPML.g:5027:2: '<'
            {
             before(grammarAccess.getPureFunctionTypeAccess().getLessThanSignKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getPureFunctionTypeAccess().getLessThanSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunctionType__Group__2__Impl"


    // $ANTLR start "rule__PureFunctionType__Group__3"
    // InternalFPML.g:5036:1: rule__PureFunctionType__Group__3 : rule__PureFunctionType__Group__3__Impl rule__PureFunctionType__Group__4 ;
    public final void rule__PureFunctionType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5040:1: ( rule__PureFunctionType__Group__3__Impl rule__PureFunctionType__Group__4 )
            // InternalFPML.g:5041:2: rule__PureFunctionType__Group__3__Impl rule__PureFunctionType__Group__4
            {
            pushFollow(FOLLOW_39);
            rule__PureFunctionType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PureFunctionType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunctionType__Group__3"


    // $ANTLR start "rule__PureFunctionType__Group__3__Impl"
    // InternalFPML.g:5048:1: rule__PureFunctionType__Group__3__Impl : ( ( rule__PureFunctionType__ArgTypeAssignment_3 ) ) ;
    public final void rule__PureFunctionType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5052:1: ( ( ( rule__PureFunctionType__ArgTypeAssignment_3 ) ) )
            // InternalFPML.g:5053:1: ( ( rule__PureFunctionType__ArgTypeAssignment_3 ) )
            {
            // InternalFPML.g:5053:1: ( ( rule__PureFunctionType__ArgTypeAssignment_3 ) )
            // InternalFPML.g:5054:2: ( rule__PureFunctionType__ArgTypeAssignment_3 )
            {
             before(grammarAccess.getPureFunctionTypeAccess().getArgTypeAssignment_3()); 
            // InternalFPML.g:5055:2: ( rule__PureFunctionType__ArgTypeAssignment_3 )
            // InternalFPML.g:5055:3: rule__PureFunctionType__ArgTypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__PureFunctionType__ArgTypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPureFunctionTypeAccess().getArgTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunctionType__Group__3__Impl"


    // $ANTLR start "rule__PureFunctionType__Group__4"
    // InternalFPML.g:5063:1: rule__PureFunctionType__Group__4 : rule__PureFunctionType__Group__4__Impl rule__PureFunctionType__Group__5 ;
    public final void rule__PureFunctionType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5067:1: ( rule__PureFunctionType__Group__4__Impl rule__PureFunctionType__Group__5 )
            // InternalFPML.g:5068:2: rule__PureFunctionType__Group__4__Impl rule__PureFunctionType__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__PureFunctionType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PureFunctionType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunctionType__Group__4"


    // $ANTLR start "rule__PureFunctionType__Group__4__Impl"
    // InternalFPML.g:5075:1: rule__PureFunctionType__Group__4__Impl : ( ',' ) ;
    public final void rule__PureFunctionType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5079:1: ( ( ',' ) )
            // InternalFPML.g:5080:1: ( ',' )
            {
            // InternalFPML.g:5080:1: ( ',' )
            // InternalFPML.g:5081:2: ','
            {
             before(grammarAccess.getPureFunctionTypeAccess().getCommaKeyword_4()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getPureFunctionTypeAccess().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunctionType__Group__4__Impl"


    // $ANTLR start "rule__PureFunctionType__Group__5"
    // InternalFPML.g:5090:1: rule__PureFunctionType__Group__5 : rule__PureFunctionType__Group__5__Impl rule__PureFunctionType__Group__6 ;
    public final void rule__PureFunctionType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5094:1: ( rule__PureFunctionType__Group__5__Impl rule__PureFunctionType__Group__6 )
            // InternalFPML.g:5095:2: rule__PureFunctionType__Group__5__Impl rule__PureFunctionType__Group__6
            {
            pushFollow(FOLLOW_40);
            rule__PureFunctionType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PureFunctionType__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunctionType__Group__5"


    // $ANTLR start "rule__PureFunctionType__Group__5__Impl"
    // InternalFPML.g:5102:1: rule__PureFunctionType__Group__5__Impl : ( ( rule__PureFunctionType__ReturnTypeAssignment_5 ) ) ;
    public final void rule__PureFunctionType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5106:1: ( ( ( rule__PureFunctionType__ReturnTypeAssignment_5 ) ) )
            // InternalFPML.g:5107:1: ( ( rule__PureFunctionType__ReturnTypeAssignment_5 ) )
            {
            // InternalFPML.g:5107:1: ( ( rule__PureFunctionType__ReturnTypeAssignment_5 ) )
            // InternalFPML.g:5108:2: ( rule__PureFunctionType__ReturnTypeAssignment_5 )
            {
             before(grammarAccess.getPureFunctionTypeAccess().getReturnTypeAssignment_5()); 
            // InternalFPML.g:5109:2: ( rule__PureFunctionType__ReturnTypeAssignment_5 )
            // InternalFPML.g:5109:3: rule__PureFunctionType__ReturnTypeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__PureFunctionType__ReturnTypeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getPureFunctionTypeAccess().getReturnTypeAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunctionType__Group__5__Impl"


    // $ANTLR start "rule__PureFunctionType__Group__6"
    // InternalFPML.g:5117:1: rule__PureFunctionType__Group__6 : rule__PureFunctionType__Group__6__Impl ;
    public final void rule__PureFunctionType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5121:1: ( rule__PureFunctionType__Group__6__Impl )
            // InternalFPML.g:5122:2: rule__PureFunctionType__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PureFunctionType__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunctionType__Group__6"


    // $ANTLR start "rule__PureFunctionType__Group__6__Impl"
    // InternalFPML.g:5128:1: rule__PureFunctionType__Group__6__Impl : ( '>' ) ;
    public final void rule__PureFunctionType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5132:1: ( ( '>' ) )
            // InternalFPML.g:5133:1: ( '>' )
            {
            // InternalFPML.g:5133:1: ( '>' )
            // InternalFPML.g:5134:2: '>'
            {
             before(grammarAccess.getPureFunctionTypeAccess().getGreaterThanSignKeyword_6()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getPureFunctionTypeAccess().getGreaterThanSignKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunctionType__Group__6__Impl"


    // $ANTLR start "rule__EffectFullFunctionType__Group__0"
    // InternalFPML.g:5144:1: rule__EffectFullFunctionType__Group__0 : rule__EffectFullFunctionType__Group__0__Impl rule__EffectFullFunctionType__Group__1 ;
    public final void rule__EffectFullFunctionType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5148:1: ( rule__EffectFullFunctionType__Group__0__Impl rule__EffectFullFunctionType__Group__1 )
            // InternalFPML.g:5149:2: rule__EffectFullFunctionType__Group__0__Impl rule__EffectFullFunctionType__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__EffectFullFunctionType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullFunctionType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunctionType__Group__0"


    // $ANTLR start "rule__EffectFullFunctionType__Group__0__Impl"
    // InternalFPML.g:5156:1: rule__EffectFullFunctionType__Group__0__Impl : ( () ) ;
    public final void rule__EffectFullFunctionType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5160:1: ( ( () ) )
            // InternalFPML.g:5161:1: ( () )
            {
            // InternalFPML.g:5161:1: ( () )
            // InternalFPML.g:5162:2: ()
            {
             before(grammarAccess.getEffectFullFunctionTypeAccess().getEffectFullFunctionTypeAction_0()); 
            // InternalFPML.g:5163:2: ()
            // InternalFPML.g:5163:3: 
            {
            }

             after(grammarAccess.getEffectFullFunctionTypeAccess().getEffectFullFunctionTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunctionType__Group__0__Impl"


    // $ANTLR start "rule__EffectFullFunctionType__Group__1"
    // InternalFPML.g:5171:1: rule__EffectFullFunctionType__Group__1 : rule__EffectFullFunctionType__Group__1__Impl rule__EffectFullFunctionType__Group__2 ;
    public final void rule__EffectFullFunctionType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5175:1: ( rule__EffectFullFunctionType__Group__1__Impl rule__EffectFullFunctionType__Group__2 )
            // InternalFPML.g:5176:2: rule__EffectFullFunctionType__Group__1__Impl rule__EffectFullFunctionType__Group__2
            {
            pushFollow(FOLLOW_38);
            rule__EffectFullFunctionType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullFunctionType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunctionType__Group__1"


    // $ANTLR start "rule__EffectFullFunctionType__Group__1__Impl"
    // InternalFPML.g:5183:1: rule__EffectFullFunctionType__Group__1__Impl : ( 'FIO' ) ;
    public final void rule__EffectFullFunctionType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5187:1: ( ( 'FIO' ) )
            // InternalFPML.g:5188:1: ( 'FIO' )
            {
            // InternalFPML.g:5188:1: ( 'FIO' )
            // InternalFPML.g:5189:2: 'FIO'
            {
             before(grammarAccess.getEffectFullFunctionTypeAccess().getFIOKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getEffectFullFunctionTypeAccess().getFIOKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunctionType__Group__1__Impl"


    // $ANTLR start "rule__EffectFullFunctionType__Group__2"
    // InternalFPML.g:5198:1: rule__EffectFullFunctionType__Group__2 : rule__EffectFullFunctionType__Group__2__Impl rule__EffectFullFunctionType__Group__3 ;
    public final void rule__EffectFullFunctionType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5202:1: ( rule__EffectFullFunctionType__Group__2__Impl rule__EffectFullFunctionType__Group__3 )
            // InternalFPML.g:5203:2: rule__EffectFullFunctionType__Group__2__Impl rule__EffectFullFunctionType__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__EffectFullFunctionType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullFunctionType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunctionType__Group__2"


    // $ANTLR start "rule__EffectFullFunctionType__Group__2__Impl"
    // InternalFPML.g:5210:1: rule__EffectFullFunctionType__Group__2__Impl : ( '<' ) ;
    public final void rule__EffectFullFunctionType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5214:1: ( ( '<' ) )
            // InternalFPML.g:5215:1: ( '<' )
            {
            // InternalFPML.g:5215:1: ( '<' )
            // InternalFPML.g:5216:2: '<'
            {
             before(grammarAccess.getEffectFullFunctionTypeAccess().getLessThanSignKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getEffectFullFunctionTypeAccess().getLessThanSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunctionType__Group__2__Impl"


    // $ANTLR start "rule__EffectFullFunctionType__Group__3"
    // InternalFPML.g:5225:1: rule__EffectFullFunctionType__Group__3 : rule__EffectFullFunctionType__Group__3__Impl rule__EffectFullFunctionType__Group__4 ;
    public final void rule__EffectFullFunctionType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5229:1: ( rule__EffectFullFunctionType__Group__3__Impl rule__EffectFullFunctionType__Group__4 )
            // InternalFPML.g:5230:2: rule__EffectFullFunctionType__Group__3__Impl rule__EffectFullFunctionType__Group__4
            {
            pushFollow(FOLLOW_39);
            rule__EffectFullFunctionType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullFunctionType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunctionType__Group__3"


    // $ANTLR start "rule__EffectFullFunctionType__Group__3__Impl"
    // InternalFPML.g:5237:1: rule__EffectFullFunctionType__Group__3__Impl : ( ( rule__EffectFullFunctionType__ArgTypeAssignment_3 ) ) ;
    public final void rule__EffectFullFunctionType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5241:1: ( ( ( rule__EffectFullFunctionType__ArgTypeAssignment_3 ) ) )
            // InternalFPML.g:5242:1: ( ( rule__EffectFullFunctionType__ArgTypeAssignment_3 ) )
            {
            // InternalFPML.g:5242:1: ( ( rule__EffectFullFunctionType__ArgTypeAssignment_3 ) )
            // InternalFPML.g:5243:2: ( rule__EffectFullFunctionType__ArgTypeAssignment_3 )
            {
             before(grammarAccess.getEffectFullFunctionTypeAccess().getArgTypeAssignment_3()); 
            // InternalFPML.g:5244:2: ( rule__EffectFullFunctionType__ArgTypeAssignment_3 )
            // InternalFPML.g:5244:3: rule__EffectFullFunctionType__ArgTypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullFunctionType__ArgTypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEffectFullFunctionTypeAccess().getArgTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunctionType__Group__3__Impl"


    // $ANTLR start "rule__EffectFullFunctionType__Group__4"
    // InternalFPML.g:5252:1: rule__EffectFullFunctionType__Group__4 : rule__EffectFullFunctionType__Group__4__Impl rule__EffectFullFunctionType__Group__5 ;
    public final void rule__EffectFullFunctionType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5256:1: ( rule__EffectFullFunctionType__Group__4__Impl rule__EffectFullFunctionType__Group__5 )
            // InternalFPML.g:5257:2: rule__EffectFullFunctionType__Group__4__Impl rule__EffectFullFunctionType__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__EffectFullFunctionType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullFunctionType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunctionType__Group__4"


    // $ANTLR start "rule__EffectFullFunctionType__Group__4__Impl"
    // InternalFPML.g:5264:1: rule__EffectFullFunctionType__Group__4__Impl : ( ',' ) ;
    public final void rule__EffectFullFunctionType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5268:1: ( ( ',' ) )
            // InternalFPML.g:5269:1: ( ',' )
            {
            // InternalFPML.g:5269:1: ( ',' )
            // InternalFPML.g:5270:2: ','
            {
             before(grammarAccess.getEffectFullFunctionTypeAccess().getCommaKeyword_4()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getEffectFullFunctionTypeAccess().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunctionType__Group__4__Impl"


    // $ANTLR start "rule__EffectFullFunctionType__Group__5"
    // InternalFPML.g:5279:1: rule__EffectFullFunctionType__Group__5 : rule__EffectFullFunctionType__Group__5__Impl rule__EffectFullFunctionType__Group__6 ;
    public final void rule__EffectFullFunctionType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5283:1: ( rule__EffectFullFunctionType__Group__5__Impl rule__EffectFullFunctionType__Group__6 )
            // InternalFPML.g:5284:2: rule__EffectFullFunctionType__Group__5__Impl rule__EffectFullFunctionType__Group__6
            {
            pushFollow(FOLLOW_40);
            rule__EffectFullFunctionType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullFunctionType__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunctionType__Group__5"


    // $ANTLR start "rule__EffectFullFunctionType__Group__5__Impl"
    // InternalFPML.g:5291:1: rule__EffectFullFunctionType__Group__5__Impl : ( ( rule__EffectFullFunctionType__ReturnTypeAssignment_5 ) ) ;
    public final void rule__EffectFullFunctionType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5295:1: ( ( ( rule__EffectFullFunctionType__ReturnTypeAssignment_5 ) ) )
            // InternalFPML.g:5296:1: ( ( rule__EffectFullFunctionType__ReturnTypeAssignment_5 ) )
            {
            // InternalFPML.g:5296:1: ( ( rule__EffectFullFunctionType__ReturnTypeAssignment_5 ) )
            // InternalFPML.g:5297:2: ( rule__EffectFullFunctionType__ReturnTypeAssignment_5 )
            {
             before(grammarAccess.getEffectFullFunctionTypeAccess().getReturnTypeAssignment_5()); 
            // InternalFPML.g:5298:2: ( rule__EffectFullFunctionType__ReturnTypeAssignment_5 )
            // InternalFPML.g:5298:3: rule__EffectFullFunctionType__ReturnTypeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullFunctionType__ReturnTypeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getEffectFullFunctionTypeAccess().getReturnTypeAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunctionType__Group__5__Impl"


    // $ANTLR start "rule__EffectFullFunctionType__Group__6"
    // InternalFPML.g:5306:1: rule__EffectFullFunctionType__Group__6 : rule__EffectFullFunctionType__Group__6__Impl ;
    public final void rule__EffectFullFunctionType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5310:1: ( rule__EffectFullFunctionType__Group__6__Impl )
            // InternalFPML.g:5311:2: rule__EffectFullFunctionType__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullFunctionType__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunctionType__Group__6"


    // $ANTLR start "rule__EffectFullFunctionType__Group__6__Impl"
    // InternalFPML.g:5317:1: rule__EffectFullFunctionType__Group__6__Impl : ( '>' ) ;
    public final void rule__EffectFullFunctionType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5321:1: ( ( '>' ) )
            // InternalFPML.g:5322:1: ( '>' )
            {
            // InternalFPML.g:5322:1: ( '>' )
            // InternalFPML.g:5323:2: '>'
            {
             before(grammarAccess.getEffectFullFunctionTypeAccess().getGreaterThanSignKeyword_6()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getEffectFullFunctionTypeAccess().getGreaterThanSignKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunctionType__Group__6__Impl"


    // $ANTLR start "rule__IntValue__Group__0"
    // InternalFPML.g:5333:1: rule__IntValue__Group__0 : rule__IntValue__Group__0__Impl rule__IntValue__Group__1 ;
    public final void rule__IntValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5337:1: ( rule__IntValue__Group__0__Impl rule__IntValue__Group__1 )
            // InternalFPML.g:5338:2: rule__IntValue__Group__0__Impl rule__IntValue__Group__1
            {
            pushFollow(FOLLOW_41);
            rule__IntValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntValue__Group__0"


    // $ANTLR start "rule__IntValue__Group__0__Impl"
    // InternalFPML.g:5345:1: rule__IntValue__Group__0__Impl : ( () ) ;
    public final void rule__IntValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5349:1: ( ( () ) )
            // InternalFPML.g:5350:1: ( () )
            {
            // InternalFPML.g:5350:1: ( () )
            // InternalFPML.g:5351:2: ()
            {
             before(grammarAccess.getIntValueAccess().getIntegerTypeAction_0()); 
            // InternalFPML.g:5352:2: ()
            // InternalFPML.g:5352:3: 
            {
            }

             after(grammarAccess.getIntValueAccess().getIntegerTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntValue__Group__0__Impl"


    // $ANTLR start "rule__IntValue__Group__1"
    // InternalFPML.g:5360:1: rule__IntValue__Group__1 : rule__IntValue__Group__1__Impl ;
    public final void rule__IntValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5364:1: ( rule__IntValue__Group__1__Impl )
            // InternalFPML.g:5365:2: rule__IntValue__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntValue__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntValue__Group__1"


    // $ANTLR start "rule__IntValue__Group__1__Impl"
    // InternalFPML.g:5371:1: rule__IntValue__Group__1__Impl : ( ( rule__IntValue__ValueAssignment_1 ) ) ;
    public final void rule__IntValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5375:1: ( ( ( rule__IntValue__ValueAssignment_1 ) ) )
            // InternalFPML.g:5376:1: ( ( rule__IntValue__ValueAssignment_1 ) )
            {
            // InternalFPML.g:5376:1: ( ( rule__IntValue__ValueAssignment_1 ) )
            // InternalFPML.g:5377:2: ( rule__IntValue__ValueAssignment_1 )
            {
             before(grammarAccess.getIntValueAccess().getValueAssignment_1()); 
            // InternalFPML.g:5378:2: ( rule__IntValue__ValueAssignment_1 )
            // InternalFPML.g:5378:3: rule__IntValue__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__IntValue__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIntValueAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntValue__Group__1__Impl"


    // $ANTLR start "rule__StringValue__Group__0"
    // InternalFPML.g:5387:1: rule__StringValue__Group__0 : rule__StringValue__Group__0__Impl rule__StringValue__Group__1 ;
    public final void rule__StringValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5391:1: ( rule__StringValue__Group__0__Impl rule__StringValue__Group__1 )
            // InternalFPML.g:5392:2: rule__StringValue__Group__0__Impl rule__StringValue__Group__1
            {
            pushFollow(FOLLOW_42);
            rule__StringValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__Group__0"


    // $ANTLR start "rule__StringValue__Group__0__Impl"
    // InternalFPML.g:5399:1: rule__StringValue__Group__0__Impl : ( () ) ;
    public final void rule__StringValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5403:1: ( ( () ) )
            // InternalFPML.g:5404:1: ( () )
            {
            // InternalFPML.g:5404:1: ( () )
            // InternalFPML.g:5405:2: ()
            {
             before(grammarAccess.getStringValueAccess().getStringTypeAction_0()); 
            // InternalFPML.g:5406:2: ()
            // InternalFPML.g:5406:3: 
            {
            }

             after(grammarAccess.getStringValueAccess().getStringTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__Group__0__Impl"


    // $ANTLR start "rule__StringValue__Group__1"
    // InternalFPML.g:5414:1: rule__StringValue__Group__1 : rule__StringValue__Group__1__Impl ;
    public final void rule__StringValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5418:1: ( rule__StringValue__Group__1__Impl )
            // InternalFPML.g:5419:2: rule__StringValue__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringValue__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__Group__1"


    // $ANTLR start "rule__StringValue__Group__1__Impl"
    // InternalFPML.g:5425:1: rule__StringValue__Group__1__Impl : ( ( rule__StringValue__ValueAssignment_1 ) ) ;
    public final void rule__StringValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5429:1: ( ( ( rule__StringValue__ValueAssignment_1 ) ) )
            // InternalFPML.g:5430:1: ( ( rule__StringValue__ValueAssignment_1 ) )
            {
            // InternalFPML.g:5430:1: ( ( rule__StringValue__ValueAssignment_1 ) )
            // InternalFPML.g:5431:2: ( rule__StringValue__ValueAssignment_1 )
            {
             before(grammarAccess.getStringValueAccess().getValueAssignment_1()); 
            // InternalFPML.g:5432:2: ( rule__StringValue__ValueAssignment_1 )
            // InternalFPML.g:5432:3: rule__StringValue__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__StringValue__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStringValueAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__Group__1__Impl"


    // $ANTLR start "rule__UnitValue__Group__0"
    // InternalFPML.g:5441:1: rule__UnitValue__Group__0 : rule__UnitValue__Group__0__Impl rule__UnitValue__Group__1 ;
    public final void rule__UnitValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5445:1: ( rule__UnitValue__Group__0__Impl rule__UnitValue__Group__1 )
            // InternalFPML.g:5446:2: rule__UnitValue__Group__0__Impl rule__UnitValue__Group__1
            {
            pushFollow(FOLLOW_43);
            rule__UnitValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnitValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitValue__Group__0"


    // $ANTLR start "rule__UnitValue__Group__0__Impl"
    // InternalFPML.g:5453:1: rule__UnitValue__Group__0__Impl : ( () ) ;
    public final void rule__UnitValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5457:1: ( ( () ) )
            // InternalFPML.g:5458:1: ( () )
            {
            // InternalFPML.g:5458:1: ( () )
            // InternalFPML.g:5459:2: ()
            {
             before(grammarAccess.getUnitValueAccess().getUnitTypeAction_0()); 
            // InternalFPML.g:5460:2: ()
            // InternalFPML.g:5460:3: 
            {
            }

             after(grammarAccess.getUnitValueAccess().getUnitTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitValue__Group__0__Impl"


    // $ANTLR start "rule__UnitValue__Group__1"
    // InternalFPML.g:5468:1: rule__UnitValue__Group__1 : rule__UnitValue__Group__1__Impl ;
    public final void rule__UnitValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5472:1: ( rule__UnitValue__Group__1__Impl )
            // InternalFPML.g:5473:2: rule__UnitValue__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnitValue__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitValue__Group__1"


    // $ANTLR start "rule__UnitValue__Group__1__Impl"
    // InternalFPML.g:5479:1: rule__UnitValue__Group__1__Impl : ( '()' ) ;
    public final void rule__UnitValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5483:1: ( ( '()' ) )
            // InternalFPML.g:5484:1: ( '()' )
            {
            // InternalFPML.g:5484:1: ( '()' )
            // InternalFPML.g:5485:2: '()'
            {
             before(grammarAccess.getUnitValueAccess().getLeftParenthesisRightParenthesisKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getUnitValueAccess().getLeftParenthesisRightParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitValue__Group__1__Impl"


    // $ANTLR start "rule__DataValue__Group__0"
    // InternalFPML.g:5495:1: rule__DataValue__Group__0 : rule__DataValue__Group__0__Impl rule__DataValue__Group__1 ;
    public final void rule__DataValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5499:1: ( rule__DataValue__Group__0__Impl rule__DataValue__Group__1 )
            // InternalFPML.g:5500:2: rule__DataValue__Group__0__Impl rule__DataValue__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__DataValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataValue__Group__0"


    // $ANTLR start "rule__DataValue__Group__0__Impl"
    // InternalFPML.g:5507:1: rule__DataValue__Group__0__Impl : ( () ) ;
    public final void rule__DataValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5511:1: ( ( () ) )
            // InternalFPML.g:5512:1: ( () )
            {
            // InternalFPML.g:5512:1: ( () )
            // InternalFPML.g:5513:2: ()
            {
             before(grammarAccess.getDataValueAccess().getDataValueAction_0()); 
            // InternalFPML.g:5514:2: ()
            // InternalFPML.g:5514:3: 
            {
            }

             after(grammarAccess.getDataValueAccess().getDataValueAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataValue__Group__0__Impl"


    // $ANTLR start "rule__DataValue__Group__1"
    // InternalFPML.g:5522:1: rule__DataValue__Group__1 : rule__DataValue__Group__1__Impl rule__DataValue__Group__2 ;
    public final void rule__DataValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5526:1: ( rule__DataValue__Group__1__Impl rule__DataValue__Group__2 )
            // InternalFPML.g:5527:2: rule__DataValue__Group__1__Impl rule__DataValue__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__DataValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataValue__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataValue__Group__1"


    // $ANTLR start "rule__DataValue__Group__1__Impl"
    // InternalFPML.g:5534:1: rule__DataValue__Group__1__Impl : ( ( rule__DataValue__TypeAssignment_1 ) ) ;
    public final void rule__DataValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5538:1: ( ( ( rule__DataValue__TypeAssignment_1 ) ) )
            // InternalFPML.g:5539:1: ( ( rule__DataValue__TypeAssignment_1 ) )
            {
            // InternalFPML.g:5539:1: ( ( rule__DataValue__TypeAssignment_1 ) )
            // InternalFPML.g:5540:2: ( rule__DataValue__TypeAssignment_1 )
            {
             before(grammarAccess.getDataValueAccess().getTypeAssignment_1()); 
            // InternalFPML.g:5541:2: ( rule__DataValue__TypeAssignment_1 )
            // InternalFPML.g:5541:3: rule__DataValue__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DataValue__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDataValueAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataValue__Group__1__Impl"


    // $ANTLR start "rule__DataValue__Group__2"
    // InternalFPML.g:5549:1: rule__DataValue__Group__2 : rule__DataValue__Group__2__Impl rule__DataValue__Group__3 ;
    public final void rule__DataValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5553:1: ( rule__DataValue__Group__2__Impl rule__DataValue__Group__3 )
            // InternalFPML.g:5554:2: rule__DataValue__Group__2__Impl rule__DataValue__Group__3
            {
            pushFollow(FOLLOW_44);
            rule__DataValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataValue__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataValue__Group__2"


    // $ANTLR start "rule__DataValue__Group__2__Impl"
    // InternalFPML.g:5561:1: rule__DataValue__Group__2__Impl : ( '(' ) ;
    public final void rule__DataValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5565:1: ( ( '(' ) )
            // InternalFPML.g:5566:1: ( '(' )
            {
            // InternalFPML.g:5566:1: ( '(' )
            // InternalFPML.g:5567:2: '('
            {
             before(grammarAccess.getDataValueAccess().getLeftParenthesisKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getDataValueAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataValue__Group__2__Impl"


    // $ANTLR start "rule__DataValue__Group__3"
    // InternalFPML.g:5576:1: rule__DataValue__Group__3 : rule__DataValue__Group__3__Impl rule__DataValue__Group__4 ;
    public final void rule__DataValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5580:1: ( rule__DataValue__Group__3__Impl rule__DataValue__Group__4 )
            // InternalFPML.g:5581:2: rule__DataValue__Group__3__Impl rule__DataValue__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__DataValue__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataValue__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataValue__Group__3"


    // $ANTLR start "rule__DataValue__Group__3__Impl"
    // InternalFPML.g:5588:1: rule__DataValue__Group__3__Impl : ( ( rule__DataValue__ValueAssignment_3 ) ) ;
    public final void rule__DataValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5592:1: ( ( ( rule__DataValue__ValueAssignment_3 ) ) )
            // InternalFPML.g:5593:1: ( ( rule__DataValue__ValueAssignment_3 ) )
            {
            // InternalFPML.g:5593:1: ( ( rule__DataValue__ValueAssignment_3 ) )
            // InternalFPML.g:5594:2: ( rule__DataValue__ValueAssignment_3 )
            {
             before(grammarAccess.getDataValueAccess().getValueAssignment_3()); 
            // InternalFPML.g:5595:2: ( rule__DataValue__ValueAssignment_3 )
            // InternalFPML.g:5595:3: rule__DataValue__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__DataValue__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDataValueAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataValue__Group__3__Impl"


    // $ANTLR start "rule__DataValue__Group__4"
    // InternalFPML.g:5603:1: rule__DataValue__Group__4 : rule__DataValue__Group__4__Impl ;
    public final void rule__DataValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5607:1: ( rule__DataValue__Group__4__Impl )
            // InternalFPML.g:5608:2: rule__DataValue__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataValue__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataValue__Group__4"


    // $ANTLR start "rule__DataValue__Group__4__Impl"
    // InternalFPML.g:5614:1: rule__DataValue__Group__4__Impl : ( ')' ) ;
    public final void rule__DataValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5618:1: ( ( ')' ) )
            // InternalFPML.g:5619:1: ( ')' )
            {
            // InternalFPML.g:5619:1: ( ')' )
            // InternalFPML.g:5620:2: ')'
            {
             before(grammarAccess.getDataValueAccess().getRightParenthesisKeyword_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getDataValueAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataValue__Group__4__Impl"


    // $ANTLR start "rule__ValueRef__Group__0"
    // InternalFPML.g:5630:1: rule__ValueRef__Group__0 : rule__ValueRef__Group__0__Impl rule__ValueRef__Group__1 ;
    public final void rule__ValueRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5634:1: ( rule__ValueRef__Group__0__Impl rule__ValueRef__Group__1 )
            // InternalFPML.g:5635:2: rule__ValueRef__Group__0__Impl rule__ValueRef__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__ValueRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValueRef__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueRef__Group__0"


    // $ANTLR start "rule__ValueRef__Group__0__Impl"
    // InternalFPML.g:5642:1: rule__ValueRef__Group__0__Impl : ( () ) ;
    public final void rule__ValueRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5646:1: ( ( () ) )
            // InternalFPML.g:5647:1: ( () )
            {
            // InternalFPML.g:5647:1: ( () )
            // InternalFPML.g:5648:2: ()
            {
             before(grammarAccess.getValueRefAccess().getValueRefAction_0()); 
            // InternalFPML.g:5649:2: ()
            // InternalFPML.g:5649:3: 
            {
            }

             after(grammarAccess.getValueRefAccess().getValueRefAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueRef__Group__0__Impl"


    // $ANTLR start "rule__ValueRef__Group__1"
    // InternalFPML.g:5657:1: rule__ValueRef__Group__1 : rule__ValueRef__Group__1__Impl ;
    public final void rule__ValueRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5661:1: ( rule__ValueRef__Group__1__Impl )
            // InternalFPML.g:5662:2: rule__ValueRef__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ValueRef__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueRef__Group__1"


    // $ANTLR start "rule__ValueRef__Group__1__Impl"
    // InternalFPML.g:5668:1: rule__ValueRef__Group__1__Impl : ( ( rule__ValueRef__ValueAssignment_1 ) ) ;
    public final void rule__ValueRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5672:1: ( ( ( rule__ValueRef__ValueAssignment_1 ) ) )
            // InternalFPML.g:5673:1: ( ( rule__ValueRef__ValueAssignment_1 ) )
            {
            // InternalFPML.g:5673:1: ( ( rule__ValueRef__ValueAssignment_1 ) )
            // InternalFPML.g:5674:2: ( rule__ValueRef__ValueAssignment_1 )
            {
             before(grammarAccess.getValueRefAccess().getValueAssignment_1()); 
            // InternalFPML.g:5675:2: ( rule__ValueRef__ValueAssignment_1 )
            // InternalFPML.g:5675:3: rule__ValueRef__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ValueRef__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getValueRefAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueRef__Group__1__Impl"


    // $ANTLR start "rule__PureLambda__Group__0"
    // InternalFPML.g:5684:1: rule__PureLambda__Group__0 : rule__PureLambda__Group__0__Impl rule__PureLambda__Group__1 ;
    public final void rule__PureLambda__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5688:1: ( rule__PureLambda__Group__0__Impl rule__PureLambda__Group__1 )
            // InternalFPML.g:5689:2: rule__PureLambda__Group__0__Impl rule__PureLambda__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__PureLambda__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PureLambda__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureLambda__Group__0"


    // $ANTLR start "rule__PureLambda__Group__0__Impl"
    // InternalFPML.g:5696:1: rule__PureLambda__Group__0__Impl : ( '(' ) ;
    public final void rule__PureLambda__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5700:1: ( ( '(' ) )
            // InternalFPML.g:5701:1: ( '(' )
            {
            // InternalFPML.g:5701:1: ( '(' )
            // InternalFPML.g:5702:2: '('
            {
             before(grammarAccess.getPureLambdaAccess().getLeftParenthesisKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPureLambdaAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureLambda__Group__0__Impl"


    // $ANTLR start "rule__PureLambda__Group__1"
    // InternalFPML.g:5711:1: rule__PureLambda__Group__1 : rule__PureLambda__Group__1__Impl rule__PureLambda__Group__2 ;
    public final void rule__PureLambda__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5715:1: ( rule__PureLambda__Group__1__Impl rule__PureLambda__Group__2 )
            // InternalFPML.g:5716:2: rule__PureLambda__Group__1__Impl rule__PureLambda__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__PureLambda__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PureLambda__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureLambda__Group__1"


    // $ANTLR start "rule__PureLambda__Group__1__Impl"
    // InternalFPML.g:5723:1: rule__PureLambda__Group__1__Impl : ( ( rule__PureLambda__ArgAssignment_1 ) ) ;
    public final void rule__PureLambda__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5727:1: ( ( ( rule__PureLambda__ArgAssignment_1 ) ) )
            // InternalFPML.g:5728:1: ( ( rule__PureLambda__ArgAssignment_1 ) )
            {
            // InternalFPML.g:5728:1: ( ( rule__PureLambda__ArgAssignment_1 ) )
            // InternalFPML.g:5729:2: ( rule__PureLambda__ArgAssignment_1 )
            {
             before(grammarAccess.getPureLambdaAccess().getArgAssignment_1()); 
            // InternalFPML.g:5730:2: ( rule__PureLambda__ArgAssignment_1 )
            // InternalFPML.g:5730:3: rule__PureLambda__ArgAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PureLambda__ArgAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPureLambdaAccess().getArgAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureLambda__Group__1__Impl"


    // $ANTLR start "rule__PureLambda__Group__2"
    // InternalFPML.g:5738:1: rule__PureLambda__Group__2 : rule__PureLambda__Group__2__Impl rule__PureLambda__Group__3 ;
    public final void rule__PureLambda__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5742:1: ( rule__PureLambda__Group__2__Impl rule__PureLambda__Group__3 )
            // InternalFPML.g:5743:2: rule__PureLambda__Group__2__Impl rule__PureLambda__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__PureLambda__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PureLambda__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureLambda__Group__2"


    // $ANTLR start "rule__PureLambda__Group__2__Impl"
    // InternalFPML.g:5750:1: rule__PureLambda__Group__2__Impl : ( ')' ) ;
    public final void rule__PureLambda__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5754:1: ( ( ')' ) )
            // InternalFPML.g:5755:1: ( ')' )
            {
            // InternalFPML.g:5755:1: ( ')' )
            // InternalFPML.g:5756:2: ')'
            {
             before(grammarAccess.getPureLambdaAccess().getRightParenthesisKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPureLambdaAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureLambda__Group__2__Impl"


    // $ANTLR start "rule__PureLambda__Group__3"
    // InternalFPML.g:5765:1: rule__PureLambda__Group__3 : rule__PureLambda__Group__3__Impl rule__PureLambda__Group__4 ;
    public final void rule__PureLambda__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5769:1: ( rule__PureLambda__Group__3__Impl rule__PureLambda__Group__4 )
            // InternalFPML.g:5770:2: rule__PureLambda__Group__3__Impl rule__PureLambda__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__PureLambda__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PureLambda__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureLambda__Group__3"


    // $ANTLR start "rule__PureLambda__Group__3__Impl"
    // InternalFPML.g:5777:1: rule__PureLambda__Group__3__Impl : ( ':' ) ;
    public final void rule__PureLambda__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5781:1: ( ( ':' ) )
            // InternalFPML.g:5782:1: ( ':' )
            {
            // InternalFPML.g:5782:1: ( ':' )
            // InternalFPML.g:5783:2: ':'
            {
             before(grammarAccess.getPureLambdaAccess().getColonKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPureLambdaAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureLambda__Group__3__Impl"


    // $ANTLR start "rule__PureLambda__Group__4"
    // InternalFPML.g:5792:1: rule__PureLambda__Group__4 : rule__PureLambda__Group__4__Impl ;
    public final void rule__PureLambda__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5796:1: ( rule__PureLambda__Group__4__Impl )
            // InternalFPML.g:5797:2: rule__PureLambda__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PureLambda__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureLambda__Group__4"


    // $ANTLR start "rule__PureLambda__Group__4__Impl"
    // InternalFPML.g:5803:1: rule__PureLambda__Group__4__Impl : ( ( rule__PureLambda__FunctionBodyAssignment_4 ) ) ;
    public final void rule__PureLambda__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5807:1: ( ( ( rule__PureLambda__FunctionBodyAssignment_4 ) ) )
            // InternalFPML.g:5808:1: ( ( rule__PureLambda__FunctionBodyAssignment_4 ) )
            {
            // InternalFPML.g:5808:1: ( ( rule__PureLambda__FunctionBodyAssignment_4 ) )
            // InternalFPML.g:5809:2: ( rule__PureLambda__FunctionBodyAssignment_4 )
            {
             before(grammarAccess.getPureLambdaAccess().getFunctionBodyAssignment_4()); 
            // InternalFPML.g:5810:2: ( rule__PureLambda__FunctionBodyAssignment_4 )
            // InternalFPML.g:5810:3: rule__PureLambda__FunctionBodyAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__PureLambda__FunctionBodyAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPureLambdaAccess().getFunctionBodyAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureLambda__Group__4__Impl"


    // $ANTLR start "rule__EffectFullLambda__Group__0"
    // InternalFPML.g:5819:1: rule__EffectFullLambda__Group__0 : rule__EffectFullLambda__Group__0__Impl rule__EffectFullLambda__Group__1 ;
    public final void rule__EffectFullLambda__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5823:1: ( rule__EffectFullLambda__Group__0__Impl rule__EffectFullLambda__Group__1 )
            // InternalFPML.g:5824:2: rule__EffectFullLambda__Group__0__Impl rule__EffectFullLambda__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__EffectFullLambda__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullLambda__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullLambda__Group__0"


    // $ANTLR start "rule__EffectFullLambda__Group__0__Impl"
    // InternalFPML.g:5831:1: rule__EffectFullLambda__Group__0__Impl : ( '(' ) ;
    public final void rule__EffectFullLambda__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5835:1: ( ( '(' ) )
            // InternalFPML.g:5836:1: ( '(' )
            {
            // InternalFPML.g:5836:1: ( '(' )
            // InternalFPML.g:5837:2: '('
            {
             before(grammarAccess.getEffectFullLambdaAccess().getLeftParenthesisKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getEffectFullLambdaAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullLambda__Group__0__Impl"


    // $ANTLR start "rule__EffectFullLambda__Group__1"
    // InternalFPML.g:5846:1: rule__EffectFullLambda__Group__1 : rule__EffectFullLambda__Group__1__Impl rule__EffectFullLambda__Group__2 ;
    public final void rule__EffectFullLambda__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5850:1: ( rule__EffectFullLambda__Group__1__Impl rule__EffectFullLambda__Group__2 )
            // InternalFPML.g:5851:2: rule__EffectFullLambda__Group__1__Impl rule__EffectFullLambda__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__EffectFullLambda__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullLambda__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullLambda__Group__1"


    // $ANTLR start "rule__EffectFullLambda__Group__1__Impl"
    // InternalFPML.g:5858:1: rule__EffectFullLambda__Group__1__Impl : ( ( rule__EffectFullLambda__ArgAssignment_1 ) ) ;
    public final void rule__EffectFullLambda__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5862:1: ( ( ( rule__EffectFullLambda__ArgAssignment_1 ) ) )
            // InternalFPML.g:5863:1: ( ( rule__EffectFullLambda__ArgAssignment_1 ) )
            {
            // InternalFPML.g:5863:1: ( ( rule__EffectFullLambda__ArgAssignment_1 ) )
            // InternalFPML.g:5864:2: ( rule__EffectFullLambda__ArgAssignment_1 )
            {
             before(grammarAccess.getEffectFullLambdaAccess().getArgAssignment_1()); 
            // InternalFPML.g:5865:2: ( rule__EffectFullLambda__ArgAssignment_1 )
            // InternalFPML.g:5865:3: rule__EffectFullLambda__ArgAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullLambda__ArgAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEffectFullLambdaAccess().getArgAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullLambda__Group__1__Impl"


    // $ANTLR start "rule__EffectFullLambda__Group__2"
    // InternalFPML.g:5873:1: rule__EffectFullLambda__Group__2 : rule__EffectFullLambda__Group__2__Impl rule__EffectFullLambda__Group__3 ;
    public final void rule__EffectFullLambda__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5877:1: ( rule__EffectFullLambda__Group__2__Impl rule__EffectFullLambda__Group__3 )
            // InternalFPML.g:5878:2: rule__EffectFullLambda__Group__2__Impl rule__EffectFullLambda__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__EffectFullLambda__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullLambda__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullLambda__Group__2"


    // $ANTLR start "rule__EffectFullLambda__Group__2__Impl"
    // InternalFPML.g:5885:1: rule__EffectFullLambda__Group__2__Impl : ( ')' ) ;
    public final void rule__EffectFullLambda__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5889:1: ( ( ')' ) )
            // InternalFPML.g:5890:1: ( ')' )
            {
            // InternalFPML.g:5890:1: ( ')' )
            // InternalFPML.g:5891:2: ')'
            {
             before(grammarAccess.getEffectFullLambdaAccess().getRightParenthesisKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getEffectFullLambdaAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullLambda__Group__2__Impl"


    // $ANTLR start "rule__EffectFullLambda__Group__3"
    // InternalFPML.g:5900:1: rule__EffectFullLambda__Group__3 : rule__EffectFullLambda__Group__3__Impl rule__EffectFullLambda__Group__4 ;
    public final void rule__EffectFullLambda__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5904:1: ( rule__EffectFullLambda__Group__3__Impl rule__EffectFullLambda__Group__4 )
            // InternalFPML.g:5905:2: rule__EffectFullLambda__Group__3__Impl rule__EffectFullLambda__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__EffectFullLambda__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullLambda__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullLambda__Group__3"


    // $ANTLR start "rule__EffectFullLambda__Group__3__Impl"
    // InternalFPML.g:5912:1: rule__EffectFullLambda__Group__3__Impl : ( ':' ) ;
    public final void rule__EffectFullLambda__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5916:1: ( ( ':' ) )
            // InternalFPML.g:5917:1: ( ':' )
            {
            // InternalFPML.g:5917:1: ( ':' )
            // InternalFPML.g:5918:2: ':'
            {
             before(grammarAccess.getEffectFullLambdaAccess().getColonKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getEffectFullLambdaAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullLambda__Group__3__Impl"


    // $ANTLR start "rule__EffectFullLambda__Group__4"
    // InternalFPML.g:5927:1: rule__EffectFullLambda__Group__4 : rule__EffectFullLambda__Group__4__Impl ;
    public final void rule__EffectFullLambda__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5931:1: ( rule__EffectFullLambda__Group__4__Impl )
            // InternalFPML.g:5932:2: rule__EffectFullLambda__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullLambda__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullLambda__Group__4"


    // $ANTLR start "rule__EffectFullLambda__Group__4__Impl"
    // InternalFPML.g:5938:1: rule__EffectFullLambda__Group__4__Impl : ( ( rule__EffectFullLambda__FunctionBodyAssignment_4 ) ) ;
    public final void rule__EffectFullLambda__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5942:1: ( ( ( rule__EffectFullLambda__FunctionBodyAssignment_4 ) ) )
            // InternalFPML.g:5943:1: ( ( rule__EffectFullLambda__FunctionBodyAssignment_4 ) )
            {
            // InternalFPML.g:5943:1: ( ( rule__EffectFullLambda__FunctionBodyAssignment_4 ) )
            // InternalFPML.g:5944:2: ( rule__EffectFullLambda__FunctionBodyAssignment_4 )
            {
             before(grammarAccess.getEffectFullLambdaAccess().getFunctionBodyAssignment_4()); 
            // InternalFPML.g:5945:2: ( rule__EffectFullLambda__FunctionBodyAssignment_4 )
            // InternalFPML.g:5945:3: rule__EffectFullLambda__FunctionBodyAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullLambda__FunctionBodyAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEffectFullLambdaAccess().getFunctionBodyAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullLambda__Group__4__Impl"


    // $ANTLR start "rule__ProdValue__Group__0"
    // InternalFPML.g:5954:1: rule__ProdValue__Group__0 : rule__ProdValue__Group__0__Impl rule__ProdValue__Group__1 ;
    public final void rule__ProdValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5958:1: ( rule__ProdValue__Group__0__Impl rule__ProdValue__Group__1 )
            // InternalFPML.g:5959:2: rule__ProdValue__Group__0__Impl rule__ProdValue__Group__1
            {
            pushFollow(FOLLOW_44);
            rule__ProdValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProdValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProdValue__Group__0"


    // $ANTLR start "rule__ProdValue__Group__0__Impl"
    // InternalFPML.g:5966:1: rule__ProdValue__Group__0__Impl : ( '(' ) ;
    public final void rule__ProdValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5970:1: ( ( '(' ) )
            // InternalFPML.g:5971:1: ( '(' )
            {
            // InternalFPML.g:5971:1: ( '(' )
            // InternalFPML.g:5972:2: '('
            {
             before(grammarAccess.getProdValueAccess().getLeftParenthesisKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getProdValueAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProdValue__Group__0__Impl"


    // $ANTLR start "rule__ProdValue__Group__1"
    // InternalFPML.g:5981:1: rule__ProdValue__Group__1 : rule__ProdValue__Group__1__Impl rule__ProdValue__Group__2 ;
    public final void rule__ProdValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5985:1: ( rule__ProdValue__Group__1__Impl rule__ProdValue__Group__2 )
            // InternalFPML.g:5986:2: rule__ProdValue__Group__1__Impl rule__ProdValue__Group__2
            {
            pushFollow(FOLLOW_39);
            rule__ProdValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProdValue__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProdValue__Group__1"


    // $ANTLR start "rule__ProdValue__Group__1__Impl"
    // InternalFPML.g:5993:1: rule__ProdValue__Group__1__Impl : ( ( rule__ProdValue__ProdAdtElement1Assignment_1 ) ) ;
    public final void rule__ProdValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5997:1: ( ( ( rule__ProdValue__ProdAdtElement1Assignment_1 ) ) )
            // InternalFPML.g:5998:1: ( ( rule__ProdValue__ProdAdtElement1Assignment_1 ) )
            {
            // InternalFPML.g:5998:1: ( ( rule__ProdValue__ProdAdtElement1Assignment_1 ) )
            // InternalFPML.g:5999:2: ( rule__ProdValue__ProdAdtElement1Assignment_1 )
            {
             before(grammarAccess.getProdValueAccess().getProdAdtElement1Assignment_1()); 
            // InternalFPML.g:6000:2: ( rule__ProdValue__ProdAdtElement1Assignment_1 )
            // InternalFPML.g:6000:3: rule__ProdValue__ProdAdtElement1Assignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ProdValue__ProdAdtElement1Assignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProdValueAccess().getProdAdtElement1Assignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProdValue__Group__1__Impl"


    // $ANTLR start "rule__ProdValue__Group__2"
    // InternalFPML.g:6008:1: rule__ProdValue__Group__2 : rule__ProdValue__Group__2__Impl rule__ProdValue__Group__3 ;
    public final void rule__ProdValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6012:1: ( rule__ProdValue__Group__2__Impl rule__ProdValue__Group__3 )
            // InternalFPML.g:6013:2: rule__ProdValue__Group__2__Impl rule__ProdValue__Group__3
            {
            pushFollow(FOLLOW_44);
            rule__ProdValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProdValue__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProdValue__Group__2"


    // $ANTLR start "rule__ProdValue__Group__2__Impl"
    // InternalFPML.g:6020:1: rule__ProdValue__Group__2__Impl : ( ',' ) ;
    public final void rule__ProdValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6024:1: ( ( ',' ) )
            // InternalFPML.g:6025:1: ( ',' )
            {
            // InternalFPML.g:6025:1: ( ',' )
            // InternalFPML.g:6026:2: ','
            {
             before(grammarAccess.getProdValueAccess().getCommaKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getProdValueAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProdValue__Group__2__Impl"


    // $ANTLR start "rule__ProdValue__Group__3"
    // InternalFPML.g:6035:1: rule__ProdValue__Group__3 : rule__ProdValue__Group__3__Impl rule__ProdValue__Group__4 ;
    public final void rule__ProdValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6039:1: ( rule__ProdValue__Group__3__Impl rule__ProdValue__Group__4 )
            // InternalFPML.g:6040:2: rule__ProdValue__Group__3__Impl rule__ProdValue__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__ProdValue__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProdValue__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProdValue__Group__3"


    // $ANTLR start "rule__ProdValue__Group__3__Impl"
    // InternalFPML.g:6047:1: rule__ProdValue__Group__3__Impl : ( ( rule__ProdValue__ProdAdtElement2Assignment_3 ) ) ;
    public final void rule__ProdValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6051:1: ( ( ( rule__ProdValue__ProdAdtElement2Assignment_3 ) ) )
            // InternalFPML.g:6052:1: ( ( rule__ProdValue__ProdAdtElement2Assignment_3 ) )
            {
            // InternalFPML.g:6052:1: ( ( rule__ProdValue__ProdAdtElement2Assignment_3 ) )
            // InternalFPML.g:6053:2: ( rule__ProdValue__ProdAdtElement2Assignment_3 )
            {
             before(grammarAccess.getProdValueAccess().getProdAdtElement2Assignment_3()); 
            // InternalFPML.g:6054:2: ( rule__ProdValue__ProdAdtElement2Assignment_3 )
            // InternalFPML.g:6054:3: rule__ProdValue__ProdAdtElement2Assignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ProdValue__ProdAdtElement2Assignment_3();

            state._fsp--;


            }

             after(grammarAccess.getProdValueAccess().getProdAdtElement2Assignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProdValue__Group__3__Impl"


    // $ANTLR start "rule__ProdValue__Group__4"
    // InternalFPML.g:6062:1: rule__ProdValue__Group__4 : rule__ProdValue__Group__4__Impl ;
    public final void rule__ProdValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6066:1: ( rule__ProdValue__Group__4__Impl )
            // InternalFPML.g:6067:2: rule__ProdValue__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProdValue__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProdValue__Group__4"


    // $ANTLR start "rule__ProdValue__Group__4__Impl"
    // InternalFPML.g:6073:1: rule__ProdValue__Group__4__Impl : ( ')' ) ;
    public final void rule__ProdValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6077:1: ( ( ')' ) )
            // InternalFPML.g:6078:1: ( ')' )
            {
            // InternalFPML.g:6078:1: ( ')' )
            // InternalFPML.g:6079:2: ')'
            {
             before(grammarAccess.getProdValueAccess().getRightParenthesisKeyword_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getProdValueAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProdValue__Group__4__Impl"


    // $ANTLR start "rule__SumValue__Group_0__0"
    // InternalFPML.g:6089:1: rule__SumValue__Group_0__0 : rule__SumValue__Group_0__0__Impl rule__SumValue__Group_0__1 ;
    public final void rule__SumValue__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6093:1: ( rule__SumValue__Group_0__0__Impl rule__SumValue__Group_0__1 )
            // InternalFPML.g:6094:2: rule__SumValue__Group_0__0__Impl rule__SumValue__Group_0__1
            {
            pushFollow(FOLLOW_21);
            rule__SumValue__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SumValue__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SumValue__Group_0__0"


    // $ANTLR start "rule__SumValue__Group_0__0__Impl"
    // InternalFPML.g:6101:1: rule__SumValue__Group_0__0__Impl : ( 'Left' ) ;
    public final void rule__SumValue__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6105:1: ( ( 'Left' ) )
            // InternalFPML.g:6106:1: ( 'Left' )
            {
            // InternalFPML.g:6106:1: ( 'Left' )
            // InternalFPML.g:6107:2: 'Left'
            {
             before(grammarAccess.getSumValueAccess().getLeftKeyword_0_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getSumValueAccess().getLeftKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SumValue__Group_0__0__Impl"


    // $ANTLR start "rule__SumValue__Group_0__1"
    // InternalFPML.g:6116:1: rule__SumValue__Group_0__1 : rule__SumValue__Group_0__1__Impl rule__SumValue__Group_0__2 ;
    public final void rule__SumValue__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6120:1: ( rule__SumValue__Group_0__1__Impl rule__SumValue__Group_0__2 )
            // InternalFPML.g:6121:2: rule__SumValue__Group_0__1__Impl rule__SumValue__Group_0__2
            {
            pushFollow(FOLLOW_44);
            rule__SumValue__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SumValue__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SumValue__Group_0__1"


    // $ANTLR start "rule__SumValue__Group_0__1__Impl"
    // InternalFPML.g:6128:1: rule__SumValue__Group_0__1__Impl : ( '(' ) ;
    public final void rule__SumValue__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6132:1: ( ( '(' ) )
            // InternalFPML.g:6133:1: ( '(' )
            {
            // InternalFPML.g:6133:1: ( '(' )
            // InternalFPML.g:6134:2: '('
            {
             before(grammarAccess.getSumValueAccess().getLeftParenthesisKeyword_0_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSumValueAccess().getLeftParenthesisKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SumValue__Group_0__1__Impl"


    // $ANTLR start "rule__SumValue__Group_0__2"
    // InternalFPML.g:6143:1: rule__SumValue__Group_0__2 : rule__SumValue__Group_0__2__Impl rule__SumValue__Group_0__3 ;
    public final void rule__SumValue__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6147:1: ( rule__SumValue__Group_0__2__Impl rule__SumValue__Group_0__3 )
            // InternalFPML.g:6148:2: rule__SumValue__Group_0__2__Impl rule__SumValue__Group_0__3
            {
            pushFollow(FOLLOW_22);
            rule__SumValue__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SumValue__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SumValue__Group_0__2"


    // $ANTLR start "rule__SumValue__Group_0__2__Impl"
    // InternalFPML.g:6155:1: rule__SumValue__Group_0__2__Impl : ( ( rule__SumValue__SumAdtElement1Assignment_0_2 ) ) ;
    public final void rule__SumValue__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6159:1: ( ( ( rule__SumValue__SumAdtElement1Assignment_0_2 ) ) )
            // InternalFPML.g:6160:1: ( ( rule__SumValue__SumAdtElement1Assignment_0_2 ) )
            {
            // InternalFPML.g:6160:1: ( ( rule__SumValue__SumAdtElement1Assignment_0_2 ) )
            // InternalFPML.g:6161:2: ( rule__SumValue__SumAdtElement1Assignment_0_2 )
            {
             before(grammarAccess.getSumValueAccess().getSumAdtElement1Assignment_0_2()); 
            // InternalFPML.g:6162:2: ( rule__SumValue__SumAdtElement1Assignment_0_2 )
            // InternalFPML.g:6162:3: rule__SumValue__SumAdtElement1Assignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__SumValue__SumAdtElement1Assignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getSumValueAccess().getSumAdtElement1Assignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SumValue__Group_0__2__Impl"


    // $ANTLR start "rule__SumValue__Group_0__3"
    // InternalFPML.g:6170:1: rule__SumValue__Group_0__3 : rule__SumValue__Group_0__3__Impl ;
    public final void rule__SumValue__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6174:1: ( rule__SumValue__Group_0__3__Impl )
            // InternalFPML.g:6175:2: rule__SumValue__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SumValue__Group_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SumValue__Group_0__3"


    // $ANTLR start "rule__SumValue__Group_0__3__Impl"
    // InternalFPML.g:6181:1: rule__SumValue__Group_0__3__Impl : ( ')' ) ;
    public final void rule__SumValue__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6185:1: ( ( ')' ) )
            // InternalFPML.g:6186:1: ( ')' )
            {
            // InternalFPML.g:6186:1: ( ')' )
            // InternalFPML.g:6187:2: ')'
            {
             before(grammarAccess.getSumValueAccess().getRightParenthesisKeyword_0_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSumValueAccess().getRightParenthesisKeyword_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SumValue__Group_0__3__Impl"


    // $ANTLR start "rule__SumValue__Group_1__0"
    // InternalFPML.g:6197:1: rule__SumValue__Group_1__0 : rule__SumValue__Group_1__0__Impl rule__SumValue__Group_1__1 ;
    public final void rule__SumValue__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6201:1: ( rule__SumValue__Group_1__0__Impl rule__SumValue__Group_1__1 )
            // InternalFPML.g:6202:2: rule__SumValue__Group_1__0__Impl rule__SumValue__Group_1__1
            {
            pushFollow(FOLLOW_21);
            rule__SumValue__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SumValue__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SumValue__Group_1__0"


    // $ANTLR start "rule__SumValue__Group_1__0__Impl"
    // InternalFPML.g:6209:1: rule__SumValue__Group_1__0__Impl : ( 'Right' ) ;
    public final void rule__SumValue__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6213:1: ( ( 'Right' ) )
            // InternalFPML.g:6214:1: ( 'Right' )
            {
            // InternalFPML.g:6214:1: ( 'Right' )
            // InternalFPML.g:6215:2: 'Right'
            {
             before(grammarAccess.getSumValueAccess().getRightKeyword_1_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getSumValueAccess().getRightKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SumValue__Group_1__0__Impl"


    // $ANTLR start "rule__SumValue__Group_1__1"
    // InternalFPML.g:6224:1: rule__SumValue__Group_1__1 : rule__SumValue__Group_1__1__Impl rule__SumValue__Group_1__2 ;
    public final void rule__SumValue__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6228:1: ( rule__SumValue__Group_1__1__Impl rule__SumValue__Group_1__2 )
            // InternalFPML.g:6229:2: rule__SumValue__Group_1__1__Impl rule__SumValue__Group_1__2
            {
            pushFollow(FOLLOW_44);
            rule__SumValue__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SumValue__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SumValue__Group_1__1"


    // $ANTLR start "rule__SumValue__Group_1__1__Impl"
    // InternalFPML.g:6236:1: rule__SumValue__Group_1__1__Impl : ( '(' ) ;
    public final void rule__SumValue__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6240:1: ( ( '(' ) )
            // InternalFPML.g:6241:1: ( '(' )
            {
            // InternalFPML.g:6241:1: ( '(' )
            // InternalFPML.g:6242:2: '('
            {
             before(grammarAccess.getSumValueAccess().getLeftParenthesisKeyword_1_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSumValueAccess().getLeftParenthesisKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SumValue__Group_1__1__Impl"


    // $ANTLR start "rule__SumValue__Group_1__2"
    // InternalFPML.g:6251:1: rule__SumValue__Group_1__2 : rule__SumValue__Group_1__2__Impl rule__SumValue__Group_1__3 ;
    public final void rule__SumValue__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6255:1: ( rule__SumValue__Group_1__2__Impl rule__SumValue__Group_1__3 )
            // InternalFPML.g:6256:2: rule__SumValue__Group_1__2__Impl rule__SumValue__Group_1__3
            {
            pushFollow(FOLLOW_22);
            rule__SumValue__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SumValue__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SumValue__Group_1__2"


    // $ANTLR start "rule__SumValue__Group_1__2__Impl"
    // InternalFPML.g:6263:1: rule__SumValue__Group_1__2__Impl : ( ( rule__SumValue__SumAdtElement2Assignment_1_2 ) ) ;
    public final void rule__SumValue__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6267:1: ( ( ( rule__SumValue__SumAdtElement2Assignment_1_2 ) ) )
            // InternalFPML.g:6268:1: ( ( rule__SumValue__SumAdtElement2Assignment_1_2 ) )
            {
            // InternalFPML.g:6268:1: ( ( rule__SumValue__SumAdtElement2Assignment_1_2 ) )
            // InternalFPML.g:6269:2: ( rule__SumValue__SumAdtElement2Assignment_1_2 )
            {
             before(grammarAccess.getSumValueAccess().getSumAdtElement2Assignment_1_2()); 
            // InternalFPML.g:6270:2: ( rule__SumValue__SumAdtElement2Assignment_1_2 )
            // InternalFPML.g:6270:3: rule__SumValue__SumAdtElement2Assignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__SumValue__SumAdtElement2Assignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getSumValueAccess().getSumAdtElement2Assignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SumValue__Group_1__2__Impl"


    // $ANTLR start "rule__SumValue__Group_1__3"
    // InternalFPML.g:6278:1: rule__SumValue__Group_1__3 : rule__SumValue__Group_1__3__Impl ;
    public final void rule__SumValue__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6282:1: ( rule__SumValue__Group_1__3__Impl )
            // InternalFPML.g:6283:2: rule__SumValue__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SumValue__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SumValue__Group_1__3"


    // $ANTLR start "rule__SumValue__Group_1__3__Impl"
    // InternalFPML.g:6289:1: rule__SumValue__Group_1__3__Impl : ( ')' ) ;
    public final void rule__SumValue__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6293:1: ( ( ')' ) )
            // InternalFPML.g:6294:1: ( ')' )
            {
            // InternalFPML.g:6294:1: ( ')' )
            // InternalFPML.g:6295:2: ')'
            {
             before(grammarAccess.getSumValueAccess().getRightParenthesisKeyword_1_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSumValueAccess().getRightParenthesisKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SumValue__Group_1__3__Impl"


    // $ANTLR start "rule__IntToString__Group__0"
    // InternalFPML.g:6305:1: rule__IntToString__Group__0 : rule__IntToString__Group__0__Impl rule__IntToString__Group__1 ;
    public final void rule__IntToString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6309:1: ( rule__IntToString__Group__0__Impl rule__IntToString__Group__1 )
            // InternalFPML.g:6310:2: rule__IntToString__Group__0__Impl rule__IntToString__Group__1
            {
            pushFollow(FOLLOW_45);
            rule__IntToString__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntToString__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntToString__Group__0"


    // $ANTLR start "rule__IntToString__Group__0__Impl"
    // InternalFPML.g:6317:1: rule__IntToString__Group__0__Impl : ( () ) ;
    public final void rule__IntToString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6321:1: ( ( () ) )
            // InternalFPML.g:6322:1: ( () )
            {
            // InternalFPML.g:6322:1: ( () )
            // InternalFPML.g:6323:2: ()
            {
             before(grammarAccess.getIntToStringAccess().getIntToStringAction_0()); 
            // InternalFPML.g:6324:2: ()
            // InternalFPML.g:6324:3: 
            {
            }

             after(grammarAccess.getIntToStringAccess().getIntToStringAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntToString__Group__0__Impl"


    // $ANTLR start "rule__IntToString__Group__1"
    // InternalFPML.g:6332:1: rule__IntToString__Group__1 : rule__IntToString__Group__1__Impl ;
    public final void rule__IntToString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6336:1: ( rule__IntToString__Group__1__Impl )
            // InternalFPML.g:6337:2: rule__IntToString__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntToString__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntToString__Group__1"


    // $ANTLR start "rule__IntToString__Group__1__Impl"
    // InternalFPML.g:6343:1: rule__IntToString__Group__1__Impl : ( 'IntToString' ) ;
    public final void rule__IntToString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6347:1: ( ( 'IntToString' ) )
            // InternalFPML.g:6348:1: ( 'IntToString' )
            {
            // InternalFPML.g:6348:1: ( 'IntToString' )
            // InternalFPML.g:6349:2: 'IntToString'
            {
             before(grammarAccess.getIntToStringAccess().getIntToStringKeyword_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getIntToStringAccess().getIntToStringKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntToString__Group__1__Impl"


    // $ANTLR start "rule__IntPow__Group__0"
    // InternalFPML.g:6359:1: rule__IntPow__Group__0 : rule__IntPow__Group__0__Impl rule__IntPow__Group__1 ;
    public final void rule__IntPow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6363:1: ( rule__IntPow__Group__0__Impl rule__IntPow__Group__1 )
            // InternalFPML.g:6364:2: rule__IntPow__Group__0__Impl rule__IntPow__Group__1
            {
            pushFollow(FOLLOW_46);
            rule__IntPow__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntPow__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntPow__Group__0"


    // $ANTLR start "rule__IntPow__Group__0__Impl"
    // InternalFPML.g:6371:1: rule__IntPow__Group__0__Impl : ( () ) ;
    public final void rule__IntPow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6375:1: ( ( () ) )
            // InternalFPML.g:6376:1: ( () )
            {
            // InternalFPML.g:6376:1: ( () )
            // InternalFPML.g:6377:2: ()
            {
             before(grammarAccess.getIntPowAccess().getIntPowAction_0()); 
            // InternalFPML.g:6378:2: ()
            // InternalFPML.g:6378:3: 
            {
            }

             after(grammarAccess.getIntPowAccess().getIntPowAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntPow__Group__0__Impl"


    // $ANTLR start "rule__IntPow__Group__1"
    // InternalFPML.g:6386:1: rule__IntPow__Group__1 : rule__IntPow__Group__1__Impl ;
    public final void rule__IntPow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6390:1: ( rule__IntPow__Group__1__Impl )
            // InternalFPML.g:6391:2: rule__IntPow__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntPow__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntPow__Group__1"


    // $ANTLR start "rule__IntPow__Group__1__Impl"
    // InternalFPML.g:6397:1: rule__IntPow__Group__1__Impl : ( 'IntPow' ) ;
    public final void rule__IntPow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6401:1: ( ( 'IntPow' ) )
            // InternalFPML.g:6402:1: ( 'IntPow' )
            {
            // InternalFPML.g:6402:1: ( 'IntPow' )
            // InternalFPML.g:6403:2: 'IntPow'
            {
             before(grammarAccess.getIntPowAccess().getIntPowKeyword_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getIntPowAccess().getIntPowKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntPow__Group__1__Impl"


    // $ANTLR start "rule__Plus__Group__0"
    // InternalFPML.g:6413:1: rule__Plus__Group__0 : rule__Plus__Group__0__Impl rule__Plus__Group__1 ;
    public final void rule__Plus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6417:1: ( rule__Plus__Group__0__Impl rule__Plus__Group__1 )
            // InternalFPML.g:6418:2: rule__Plus__Group__0__Impl rule__Plus__Group__1
            {
            pushFollow(FOLLOW_47);
            rule__Plus__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Plus__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Plus__Group__0"


    // $ANTLR start "rule__Plus__Group__0__Impl"
    // InternalFPML.g:6425:1: rule__Plus__Group__0__Impl : ( () ) ;
    public final void rule__Plus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6429:1: ( ( () ) )
            // InternalFPML.g:6430:1: ( () )
            {
            // InternalFPML.g:6430:1: ( () )
            // InternalFPML.g:6431:2: ()
            {
             before(grammarAccess.getPlusAccess().getPlusAction_0()); 
            // InternalFPML.g:6432:2: ()
            // InternalFPML.g:6432:3: 
            {
            }

             after(grammarAccess.getPlusAccess().getPlusAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Plus__Group__0__Impl"


    // $ANTLR start "rule__Plus__Group__1"
    // InternalFPML.g:6440:1: rule__Plus__Group__1 : rule__Plus__Group__1__Impl ;
    public final void rule__Plus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6444:1: ( rule__Plus__Group__1__Impl )
            // InternalFPML.g:6445:2: rule__Plus__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Plus__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Plus__Group__1"


    // $ANTLR start "rule__Plus__Group__1__Impl"
    // InternalFPML.g:6451:1: rule__Plus__Group__1__Impl : ( '+' ) ;
    public final void rule__Plus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6455:1: ( ( '+' ) )
            // InternalFPML.g:6456:1: ( '+' )
            {
            // InternalFPML.g:6456:1: ( '+' )
            // InternalFPML.g:6457:2: '+'
            {
             before(grammarAccess.getPlusAccess().getPlusSignKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPlusAccess().getPlusSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Plus__Group__1__Impl"


    // $ANTLR start "rule__Minus__Group__0"
    // InternalFPML.g:6467:1: rule__Minus__Group__0 : rule__Minus__Group__0__Impl rule__Minus__Group__1 ;
    public final void rule__Minus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6471:1: ( rule__Minus__Group__0__Impl rule__Minus__Group__1 )
            // InternalFPML.g:6472:2: rule__Minus__Group__0__Impl rule__Minus__Group__1
            {
            pushFollow(FOLLOW_48);
            rule__Minus__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Minus__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Minus__Group__0"


    // $ANTLR start "rule__Minus__Group__0__Impl"
    // InternalFPML.g:6479:1: rule__Minus__Group__0__Impl : ( () ) ;
    public final void rule__Minus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6483:1: ( ( () ) )
            // InternalFPML.g:6484:1: ( () )
            {
            // InternalFPML.g:6484:1: ( () )
            // InternalFPML.g:6485:2: ()
            {
             before(grammarAccess.getMinusAccess().getMinusAction_0()); 
            // InternalFPML.g:6486:2: ()
            // InternalFPML.g:6486:3: 
            {
            }

             after(grammarAccess.getMinusAccess().getMinusAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Minus__Group__0__Impl"


    // $ANTLR start "rule__Minus__Group__1"
    // InternalFPML.g:6494:1: rule__Minus__Group__1 : rule__Minus__Group__1__Impl ;
    public final void rule__Minus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6498:1: ( rule__Minus__Group__1__Impl )
            // InternalFPML.g:6499:2: rule__Minus__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Minus__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Minus__Group__1"


    // $ANTLR start "rule__Minus__Group__1__Impl"
    // InternalFPML.g:6505:1: rule__Minus__Group__1__Impl : ( '-' ) ;
    public final void rule__Minus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6509:1: ( ( '-' ) )
            // InternalFPML.g:6510:1: ( '-' )
            {
            // InternalFPML.g:6510:1: ( '-' )
            // InternalFPML.g:6511:2: '-'
            {
             before(grammarAccess.getMinusAccess().getHyphenMinusKeyword_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getMinusAccess().getHyphenMinusKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Minus__Group__1__Impl"


    // $ANTLR start "rule__Times__Group__0"
    // InternalFPML.g:6521:1: rule__Times__Group__0 : rule__Times__Group__0__Impl rule__Times__Group__1 ;
    public final void rule__Times__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6525:1: ( rule__Times__Group__0__Impl rule__Times__Group__1 )
            // InternalFPML.g:6526:2: rule__Times__Group__0__Impl rule__Times__Group__1
            {
            pushFollow(FOLLOW_49);
            rule__Times__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Times__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Times__Group__0"


    // $ANTLR start "rule__Times__Group__0__Impl"
    // InternalFPML.g:6533:1: rule__Times__Group__0__Impl : ( () ) ;
    public final void rule__Times__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6537:1: ( ( () ) )
            // InternalFPML.g:6538:1: ( () )
            {
            // InternalFPML.g:6538:1: ( () )
            // InternalFPML.g:6539:2: ()
            {
             before(grammarAccess.getTimesAccess().getTimesAction_0()); 
            // InternalFPML.g:6540:2: ()
            // InternalFPML.g:6540:3: 
            {
            }

             after(grammarAccess.getTimesAccess().getTimesAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Times__Group__0__Impl"


    // $ANTLR start "rule__Times__Group__1"
    // InternalFPML.g:6548:1: rule__Times__Group__1 : rule__Times__Group__1__Impl ;
    public final void rule__Times__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6552:1: ( rule__Times__Group__1__Impl )
            // InternalFPML.g:6553:2: rule__Times__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Times__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Times__Group__1"


    // $ANTLR start "rule__Times__Group__1__Impl"
    // InternalFPML.g:6559:1: rule__Times__Group__1__Impl : ( '*' ) ;
    public final void rule__Times__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6563:1: ( ( '*' ) )
            // InternalFPML.g:6564:1: ( '*' )
            {
            // InternalFPML.g:6564:1: ( '*' )
            // InternalFPML.g:6565:2: '*'
            {
             before(grammarAccess.getTimesAccess().getAsteriskKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTimesAccess().getAsteriskKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Times__Group__1__Impl"


    // $ANTLR start "rule__Mod__Group__0"
    // InternalFPML.g:6575:1: rule__Mod__Group__0 : rule__Mod__Group__0__Impl rule__Mod__Group__1 ;
    public final void rule__Mod__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6579:1: ( rule__Mod__Group__0__Impl rule__Mod__Group__1 )
            // InternalFPML.g:6580:2: rule__Mod__Group__0__Impl rule__Mod__Group__1
            {
            pushFollow(FOLLOW_50);
            rule__Mod__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mod__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mod__Group__0"


    // $ANTLR start "rule__Mod__Group__0__Impl"
    // InternalFPML.g:6587:1: rule__Mod__Group__0__Impl : ( () ) ;
    public final void rule__Mod__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6591:1: ( ( () ) )
            // InternalFPML.g:6592:1: ( () )
            {
            // InternalFPML.g:6592:1: ( () )
            // InternalFPML.g:6593:2: ()
            {
             before(grammarAccess.getModAccess().getModAction_0()); 
            // InternalFPML.g:6594:2: ()
            // InternalFPML.g:6594:3: 
            {
            }

             after(grammarAccess.getModAccess().getModAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mod__Group__0__Impl"


    // $ANTLR start "rule__Mod__Group__1"
    // InternalFPML.g:6602:1: rule__Mod__Group__1 : rule__Mod__Group__1__Impl ;
    public final void rule__Mod__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6606:1: ( rule__Mod__Group__1__Impl )
            // InternalFPML.g:6607:2: rule__Mod__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mod__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mod__Group__1"


    // $ANTLR start "rule__Mod__Group__1__Impl"
    // InternalFPML.g:6613:1: rule__Mod__Group__1__Impl : ( 'mod' ) ;
    public final void rule__Mod__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6617:1: ( ( 'mod' ) )
            // InternalFPML.g:6618:1: ( 'mod' )
            {
            // InternalFPML.g:6618:1: ( 'mod' )
            // InternalFPML.g:6619:2: 'mod'
            {
             before(grammarAccess.getModAccess().getModKeyword_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getModAccess().getModKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mod__Group__1__Impl"


    // $ANTLR start "rule__ApplyF__Group__0"
    // InternalFPML.g:6629:1: rule__ApplyF__Group__0 : rule__ApplyF__Group__0__Impl rule__ApplyF__Group__1 ;
    public final void rule__ApplyF__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6633:1: ( rule__ApplyF__Group__0__Impl rule__ApplyF__Group__1 )
            // InternalFPML.g:6634:2: rule__ApplyF__Group__0__Impl rule__ApplyF__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__ApplyF__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplyF__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplyF__Group__0"


    // $ANTLR start "rule__ApplyF__Group__0__Impl"
    // InternalFPML.g:6641:1: rule__ApplyF__Group__0__Impl : ( () ) ;
    public final void rule__ApplyF__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6645:1: ( ( () ) )
            // InternalFPML.g:6646:1: ( () )
            {
            // InternalFPML.g:6646:1: ( () )
            // InternalFPML.g:6647:2: ()
            {
             before(grammarAccess.getApplyFAccess().getApplyFAction_0()); 
            // InternalFPML.g:6648:2: ()
            // InternalFPML.g:6648:3: 
            {
            }

             after(grammarAccess.getApplyFAccess().getApplyFAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplyF__Group__0__Impl"


    // $ANTLR start "rule__ApplyF__Group__1"
    // InternalFPML.g:6656:1: rule__ApplyF__Group__1 : rule__ApplyF__Group__1__Impl rule__ApplyF__Group__2 ;
    public final void rule__ApplyF__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6660:1: ( rule__ApplyF__Group__1__Impl rule__ApplyF__Group__2 )
            // InternalFPML.g:6661:2: rule__ApplyF__Group__1__Impl rule__ApplyF__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__ApplyF__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplyF__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplyF__Group__1"


    // $ANTLR start "rule__ApplyF__Group__1__Impl"
    // InternalFPML.g:6668:1: rule__ApplyF__Group__1__Impl : ( 'applyF' ) ;
    public final void rule__ApplyF__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6672:1: ( ( 'applyF' ) )
            // InternalFPML.g:6673:1: ( 'applyF' )
            {
            // InternalFPML.g:6673:1: ( 'applyF' )
            // InternalFPML.g:6674:2: 'applyF'
            {
             before(grammarAccess.getApplyFAccess().getApplyFKeyword_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getApplyFAccess().getApplyFKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplyF__Group__1__Impl"


    // $ANTLR start "rule__ApplyF__Group__2"
    // InternalFPML.g:6683:1: rule__ApplyF__Group__2 : rule__ApplyF__Group__2__Impl ;
    public final void rule__ApplyF__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6687:1: ( rule__ApplyF__Group__2__Impl )
            // InternalFPML.g:6688:2: rule__ApplyF__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ApplyF__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplyF__Group__2"


    // $ANTLR start "rule__ApplyF__Group__2__Impl"
    // InternalFPML.g:6694:1: rule__ApplyF__Group__2__Impl : ( ( rule__ApplyF__ValueAssignment_2 ) ) ;
    public final void rule__ApplyF__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6698:1: ( ( ( rule__ApplyF__ValueAssignment_2 ) ) )
            // InternalFPML.g:6699:1: ( ( rule__ApplyF__ValueAssignment_2 ) )
            {
            // InternalFPML.g:6699:1: ( ( rule__ApplyF__ValueAssignment_2 ) )
            // InternalFPML.g:6700:2: ( rule__ApplyF__ValueAssignment_2 )
            {
             before(grammarAccess.getApplyFAccess().getValueAssignment_2()); 
            // InternalFPML.g:6701:2: ( rule__ApplyF__ValueAssignment_2 )
            // InternalFPML.g:6701:3: rule__ApplyF__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ApplyF__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getApplyFAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplyF__Group__2__Impl"


    // $ANTLR start "rule__PrimitivePrint__Group__0"
    // InternalFPML.g:6710:1: rule__PrimitivePrint__Group__0 : rule__PrimitivePrint__Group__0__Impl rule__PrimitivePrint__Group__1 ;
    public final void rule__PrimitivePrint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6714:1: ( rule__PrimitivePrint__Group__0__Impl rule__PrimitivePrint__Group__1 )
            // InternalFPML.g:6715:2: rule__PrimitivePrint__Group__0__Impl rule__PrimitivePrint__Group__1
            {
            pushFollow(FOLLOW_51);
            rule__PrimitivePrint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitivePrint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitivePrint__Group__0"


    // $ANTLR start "rule__PrimitivePrint__Group__0__Impl"
    // InternalFPML.g:6722:1: rule__PrimitivePrint__Group__0__Impl : ( () ) ;
    public final void rule__PrimitivePrint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6726:1: ( ( () ) )
            // InternalFPML.g:6727:1: ( () )
            {
            // InternalFPML.g:6727:1: ( () )
            // InternalFPML.g:6728:2: ()
            {
             before(grammarAccess.getPrimitivePrintAccess().getPrimitivePrintAction_0()); 
            // InternalFPML.g:6729:2: ()
            // InternalFPML.g:6729:3: 
            {
            }

             after(grammarAccess.getPrimitivePrintAccess().getPrimitivePrintAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitivePrint__Group__0__Impl"


    // $ANTLR start "rule__PrimitivePrint__Group__1"
    // InternalFPML.g:6737:1: rule__PrimitivePrint__Group__1 : rule__PrimitivePrint__Group__1__Impl ;
    public final void rule__PrimitivePrint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6741:1: ( rule__PrimitivePrint__Group__1__Impl )
            // InternalFPML.g:6742:2: rule__PrimitivePrint__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimitivePrint__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitivePrint__Group__1"


    // $ANTLR start "rule__PrimitivePrint__Group__1__Impl"
    // InternalFPML.g:6748:1: rule__PrimitivePrint__Group__1__Impl : ( 'print' ) ;
    public final void rule__PrimitivePrint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6752:1: ( ( 'print' ) )
            // InternalFPML.g:6753:1: ( 'print' )
            {
            // InternalFPML.g:6753:1: ( 'print' )
            // InternalFPML.g:6754:2: 'print'
            {
             before(grammarAccess.getPrimitivePrintAccess().getPrintKeyword_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getPrimitivePrintAccess().getPrintKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitivePrint__Group__1__Impl"


    // $ANTLR start "rule__ApplyFIO__Group__0"
    // InternalFPML.g:6764:1: rule__ApplyFIO__Group__0 : rule__ApplyFIO__Group__0__Impl rule__ApplyFIO__Group__1 ;
    public final void rule__ApplyFIO__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6768:1: ( rule__ApplyFIO__Group__0__Impl rule__ApplyFIO__Group__1 )
            // InternalFPML.g:6769:2: rule__ApplyFIO__Group__0__Impl rule__ApplyFIO__Group__1
            {
            pushFollow(FOLLOW_52);
            rule__ApplyFIO__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplyFIO__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplyFIO__Group__0"


    // $ANTLR start "rule__ApplyFIO__Group__0__Impl"
    // InternalFPML.g:6776:1: rule__ApplyFIO__Group__0__Impl : ( () ) ;
    public final void rule__ApplyFIO__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6780:1: ( ( () ) )
            // InternalFPML.g:6781:1: ( () )
            {
            // InternalFPML.g:6781:1: ( () )
            // InternalFPML.g:6782:2: ()
            {
             before(grammarAccess.getApplyFIOAccess().getApplyFIOAction_0()); 
            // InternalFPML.g:6783:2: ()
            // InternalFPML.g:6783:3: 
            {
            }

             after(grammarAccess.getApplyFIOAccess().getApplyFIOAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplyFIO__Group__0__Impl"


    // $ANTLR start "rule__ApplyFIO__Group__1"
    // InternalFPML.g:6791:1: rule__ApplyFIO__Group__1 : rule__ApplyFIO__Group__1__Impl rule__ApplyFIO__Group__2 ;
    public final void rule__ApplyFIO__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6795:1: ( rule__ApplyFIO__Group__1__Impl rule__ApplyFIO__Group__2 )
            // InternalFPML.g:6796:2: rule__ApplyFIO__Group__1__Impl rule__ApplyFIO__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__ApplyFIO__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplyFIO__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplyFIO__Group__1"


    // $ANTLR start "rule__ApplyFIO__Group__1__Impl"
    // InternalFPML.g:6803:1: rule__ApplyFIO__Group__1__Impl : ( 'applyFIO' ) ;
    public final void rule__ApplyFIO__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6807:1: ( ( 'applyFIO' ) )
            // InternalFPML.g:6808:1: ( 'applyFIO' )
            {
            // InternalFPML.g:6808:1: ( 'applyFIO' )
            // InternalFPML.g:6809:2: 'applyFIO'
            {
             before(grammarAccess.getApplyFIOAccess().getApplyFIOKeyword_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getApplyFIOAccess().getApplyFIOKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplyFIO__Group__1__Impl"


    // $ANTLR start "rule__ApplyFIO__Group__2"
    // InternalFPML.g:6818:1: rule__ApplyFIO__Group__2 : rule__ApplyFIO__Group__2__Impl ;
    public final void rule__ApplyFIO__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6822:1: ( rule__ApplyFIO__Group__2__Impl )
            // InternalFPML.g:6823:2: rule__ApplyFIO__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ApplyFIO__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplyFIO__Group__2"


    // $ANTLR start "rule__ApplyFIO__Group__2__Impl"
    // InternalFPML.g:6829:1: rule__ApplyFIO__Group__2__Impl : ( ( rule__ApplyFIO__ValueAssignment_2 ) ) ;
    public final void rule__ApplyFIO__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6833:1: ( ( ( rule__ApplyFIO__ValueAssignment_2 ) ) )
            // InternalFPML.g:6834:1: ( ( rule__ApplyFIO__ValueAssignment_2 ) )
            {
            // InternalFPML.g:6834:1: ( ( rule__ApplyFIO__ValueAssignment_2 ) )
            // InternalFPML.g:6835:2: ( rule__ApplyFIO__ValueAssignment_2 )
            {
             before(grammarAccess.getApplyFIOAccess().getValueAssignment_2()); 
            // InternalFPML.g:6836:2: ( rule__ApplyFIO__ValueAssignment_2 )
            // InternalFPML.g:6836:3: rule__ApplyFIO__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ApplyFIO__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getApplyFIOAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplyFIO__Group__2__Impl"


    // $ANTLR start "rule__Model__ElementsAssignment_0"
    // InternalFPML.g:6845:1: rule__Model__ElementsAssignment_0 : ( rulePureBlock ) ;
    public final void rule__Model__ElementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6849:1: ( ( rulePureBlock ) )
            // InternalFPML.g:6850:2: ( rulePureBlock )
            {
            // InternalFPML.g:6850:2: ( rulePureBlock )
            // InternalFPML.g:6851:3: rulePureBlock
            {
             before(grammarAccess.getModelAccess().getElementsPureBlockParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePureBlock();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementsPureBlockParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ElementsAssignment_0"


    // $ANTLR start "rule__Model__ElementsAssignment_1"
    // InternalFPML.g:6860:1: rule__Model__ElementsAssignment_1 : ( ruleEffectFullBlock ) ;
    public final void rule__Model__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6864:1: ( ( ruleEffectFullBlock ) )
            // InternalFPML.g:6865:2: ( ruleEffectFullBlock )
            {
            // InternalFPML.g:6865:2: ( ruleEffectFullBlock )
            // InternalFPML.g:6866:3: ruleEffectFullBlock
            {
             before(grammarAccess.getModelAccess().getElementsEffectFullBlockParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEffectFullBlock();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementsEffectFullBlockParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ElementsAssignment_1"


    // $ANTLR start "rule__PureBlock__ElementsAssignment_2"
    // InternalFPML.g:6875:1: rule__PureBlock__ElementsAssignment_2 : ( rulePureFunctionBlock ) ;
    public final void rule__PureBlock__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6879:1: ( ( rulePureFunctionBlock ) )
            // InternalFPML.g:6880:2: ( rulePureFunctionBlock )
            {
            // InternalFPML.g:6880:2: ( rulePureFunctionBlock )
            // InternalFPML.g:6881:3: rulePureFunctionBlock
            {
             before(grammarAccess.getPureBlockAccess().getElementsPureFunctionBlockParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePureFunctionBlock();

            state._fsp--;

             after(grammarAccess.getPureBlockAccess().getElementsPureFunctionBlockParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureBlock__ElementsAssignment_2"


    // $ANTLR start "rule__PureBlock__ElementsAssignment_3"
    // InternalFPML.g:6890:1: rule__PureBlock__ElementsAssignment_3 : ( ruleDataBlock ) ;
    public final void rule__PureBlock__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6894:1: ( ( ruleDataBlock ) )
            // InternalFPML.g:6895:2: ( ruleDataBlock )
            {
            // InternalFPML.g:6895:2: ( ruleDataBlock )
            // InternalFPML.g:6896:3: ruleDataBlock
            {
             before(grammarAccess.getPureBlockAccess().getElementsDataBlockParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDataBlock();

            state._fsp--;

             after(grammarAccess.getPureBlockAccess().getElementsDataBlockParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureBlock__ElementsAssignment_3"


    // $ANTLR start "rule__PureFunctionBlock__FeaturesAssignment_2"
    // InternalFPML.g:6905:1: rule__PureFunctionBlock__FeaturesAssignment_2 : ( rulePureFunctionDefinition ) ;
    public final void rule__PureFunctionBlock__FeaturesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6909:1: ( ( rulePureFunctionDefinition ) )
            // InternalFPML.g:6910:2: ( rulePureFunctionDefinition )
            {
            // InternalFPML.g:6910:2: ( rulePureFunctionDefinition )
            // InternalFPML.g:6911:3: rulePureFunctionDefinition
            {
             before(grammarAccess.getPureFunctionBlockAccess().getFeaturesPureFunctionDefinitionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePureFunctionDefinition();

            state._fsp--;

             after(grammarAccess.getPureFunctionBlockAccess().getFeaturesPureFunctionDefinitionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunctionBlock__FeaturesAssignment_2"


    // $ANTLR start "rule__DataBlock__ElementsAssignment_2"
    // InternalFPML.g:6920:1: rule__DataBlock__ElementsAssignment_2 : ( ruleData ) ;
    public final void rule__DataBlock__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6924:1: ( ( ruleData ) )
            // InternalFPML.g:6925:2: ( ruleData )
            {
            // InternalFPML.g:6925:2: ( ruleData )
            // InternalFPML.g:6926:3: ruleData
            {
             before(grammarAccess.getDataBlockAccess().getElementsDataParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleData();

            state._fsp--;

             after(grammarAccess.getDataBlockAccess().getElementsDataParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataBlock__ElementsAssignment_2"


    // $ANTLR start "rule__DataBlock__ValueAssignment_3"
    // InternalFPML.g:6935:1: rule__DataBlock__ValueAssignment_3 : ( ruleValueBlock ) ;
    public final void rule__DataBlock__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6939:1: ( ( ruleValueBlock ) )
            // InternalFPML.g:6940:2: ( ruleValueBlock )
            {
            // InternalFPML.g:6940:2: ( ruleValueBlock )
            // InternalFPML.g:6941:3: ruleValueBlock
            {
             before(grammarAccess.getDataBlockAccess().getValueValueBlockParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleValueBlock();

            state._fsp--;

             after(grammarAccess.getDataBlockAccess().getValueValueBlockParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataBlock__ValueAssignment_3"


    // $ANTLR start "rule__ValueBlock__ElementsAssignment_2"
    // InternalFPML.g:6950:1: rule__ValueBlock__ElementsAssignment_2 : ( ruleValue ) ;
    public final void rule__ValueBlock__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6954:1: ( ( ruleValue ) )
            // InternalFPML.g:6955:2: ( ruleValue )
            {
            // InternalFPML.g:6955:2: ( ruleValue )
            // InternalFPML.g:6956:3: ruleValue
            {
             before(grammarAccess.getValueBlockAccess().getElementsValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueBlockAccess().getElementsValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueBlock__ElementsAssignment_2"


    // $ANTLR start "rule__EffectFullBlock__FeaturesAssignment_2"
    // InternalFPML.g:6965:1: rule__EffectFullBlock__FeaturesAssignment_2 : ( ruleEffectFullFunctionDefinition ) ;
    public final void rule__EffectFullBlock__FeaturesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6969:1: ( ( ruleEffectFullFunctionDefinition ) )
            // InternalFPML.g:6970:2: ( ruleEffectFullFunctionDefinition )
            {
            // InternalFPML.g:6970:2: ( ruleEffectFullFunctionDefinition )
            // InternalFPML.g:6971:3: ruleEffectFullFunctionDefinition
            {
             before(grammarAccess.getEffectFullBlockAccess().getFeaturesEffectFullFunctionDefinitionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEffectFullFunctionDefinition();

            state._fsp--;

             after(grammarAccess.getEffectFullBlockAccess().getFeaturesEffectFullFunctionDefinitionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullBlock__FeaturesAssignment_2"


    // $ANTLR start "rule__EffectFullBlock__MainAssignment_3"
    // InternalFPML.g:6980:1: rule__EffectFullBlock__MainAssignment_3 : ( ruleMainFunc ) ;
    public final void rule__EffectFullBlock__MainAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6984:1: ( ( ruleMainFunc ) )
            // InternalFPML.g:6985:2: ( ruleMainFunc )
            {
            // InternalFPML.g:6985:2: ( ruleMainFunc )
            // InternalFPML.g:6986:3: ruleMainFunc
            {
             before(grammarAccess.getEffectFullBlockAccess().getMainMainFuncParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMainFunc();

            state._fsp--;

             after(grammarAccess.getEffectFullBlockAccess().getMainMainFuncParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullBlock__MainAssignment_3"


    // $ANTLR start "rule__Data__NameAssignment_0"
    // InternalFPML.g:6995:1: rule__Data__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Data__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6999:1: ( ( RULE_ID ) )
            // InternalFPML.g:7000:2: ( RULE_ID )
            {
            // InternalFPML.g:7000:2: ( RULE_ID )
            // InternalFPML.g:7001:3: RULE_ID
            {
             before(grammarAccess.getDataAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__NameAssignment_0"


    // $ANTLR start "rule__Data__ContentAssignment_2"
    // InternalFPML.g:7010:1: rule__Data__ContentAssignment_2 : ( ruleAdtType ) ;
    public final void rule__Data__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7014:1: ( ( ruleAdtType ) )
            // InternalFPML.g:7015:2: ( ruleAdtType )
            {
            // InternalFPML.g:7015:2: ( ruleAdtType )
            // InternalFPML.g:7016:3: ruleAdtType
            {
             before(grammarAccess.getDataAccess().getContentAdtTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAdtType();

            state._fsp--;

             after(grammarAccess.getDataAccess().getContentAdtTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__ContentAssignment_2"


    // $ANTLR start "rule__Value__NameAssignment_0"
    // InternalFPML.g:7025:1: rule__Value__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Value__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7029:1: ( ( RULE_ID ) )
            // InternalFPML.g:7030:2: ( RULE_ID )
            {
            // InternalFPML.g:7030:2: ( RULE_ID )
            // InternalFPML.g:7031:3: RULE_ID
            {
             before(grammarAccess.getValueAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__NameAssignment_0"


    // $ANTLR start "rule__Value__ValueAssignment_2"
    // InternalFPML.g:7040:1: rule__Value__ValueAssignment_2 : ( ruleExpression ) ;
    public final void rule__Value__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7044:1: ( ( ruleExpression ) )
            // InternalFPML.g:7045:2: ( ruleExpression )
            {
            // InternalFPML.g:7045:2: ( ruleExpression )
            // InternalFPML.g:7046:3: ruleExpression
            {
             before(grammarAccess.getValueAccess().getValueExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getValueAccess().getValueExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__ValueAssignment_2"


    // $ANTLR start "rule__AdtType__AdtElement1Assignment_1_1"
    // InternalFPML.g:7055:1: rule__AdtType__AdtElement1Assignment_1_1 : ( ruleAdtType ) ;
    public final void rule__AdtType__AdtElement1Assignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7059:1: ( ( ruleAdtType ) )
            // InternalFPML.g:7060:2: ( ruleAdtType )
            {
            // InternalFPML.g:7060:2: ( ruleAdtType )
            // InternalFPML.g:7061:3: ruleAdtType
            {
             before(grammarAccess.getAdtTypeAccess().getAdtElement1AdtTypeParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAdtType();

            state._fsp--;

             after(grammarAccess.getAdtTypeAccess().getAdtElement1AdtTypeParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdtType__AdtElement1Assignment_1_1"


    // $ANTLR start "rule__AdtType__AdtElement2Assignment_1_2"
    // InternalFPML.g:7070:1: rule__AdtType__AdtElement2Assignment_1_2 : ( ( rule__AdtType__AdtElement2Alternatives_1_2_0 ) ) ;
    public final void rule__AdtType__AdtElement2Assignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7074:1: ( ( ( rule__AdtType__AdtElement2Alternatives_1_2_0 ) ) )
            // InternalFPML.g:7075:2: ( ( rule__AdtType__AdtElement2Alternatives_1_2_0 ) )
            {
            // InternalFPML.g:7075:2: ( ( rule__AdtType__AdtElement2Alternatives_1_2_0 ) )
            // InternalFPML.g:7076:3: ( rule__AdtType__AdtElement2Alternatives_1_2_0 )
            {
             before(grammarAccess.getAdtTypeAccess().getAdtElement2Alternatives_1_2_0()); 
            // InternalFPML.g:7077:3: ( rule__AdtType__AdtElement2Alternatives_1_2_0 )
            // InternalFPML.g:7077:4: rule__AdtType__AdtElement2Alternatives_1_2_0
            {
            pushFollow(FOLLOW_2);
            rule__AdtType__AdtElement2Alternatives_1_2_0();

            state._fsp--;


            }

             after(grammarAccess.getAdtTypeAccess().getAdtElement2Alternatives_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdtType__AdtElement2Assignment_1_2"


    // $ANTLR start "rule__SumType__AdtElementAssignment_1"
    // InternalFPML.g:7085:1: rule__SumType__AdtElementAssignment_1 : ( ruleAdtType ) ;
    public final void rule__SumType__AdtElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7089:1: ( ( ruleAdtType ) )
            // InternalFPML.g:7090:2: ( ruleAdtType )
            {
            // InternalFPML.g:7090:2: ( ruleAdtType )
            // InternalFPML.g:7091:3: ruleAdtType
            {
             before(grammarAccess.getSumTypeAccess().getAdtElementAdtTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAdtType();

            state._fsp--;

             after(grammarAccess.getSumTypeAccess().getAdtElementAdtTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SumType__AdtElementAssignment_1"


    // $ANTLR start "rule__ProdType__AdtElementAssignment_1"
    // InternalFPML.g:7100:1: rule__ProdType__AdtElementAssignment_1 : ( ruleAdtType ) ;
    public final void rule__ProdType__AdtElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7104:1: ( ( ruleAdtType ) )
            // InternalFPML.g:7105:2: ( ruleAdtType )
            {
            // InternalFPML.g:7105:2: ( ruleAdtType )
            // InternalFPML.g:7106:3: ruleAdtType
            {
             before(grammarAccess.getProdTypeAccess().getAdtElementAdtTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAdtType();

            state._fsp--;

             after(grammarAccess.getProdTypeAccess().getAdtElementAdtTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProdType__AdtElementAssignment_1"


    // $ANTLR start "rule__PureFunctionDefinition__ReturnTypeAssignment_1"
    // InternalFPML.g:7115:1: rule__PureFunctionDefinition__ReturnTypeAssignment_1 : ( ruleValueType ) ;
    public final void rule__PureFunctionDefinition__ReturnTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7119:1: ( ( ruleValueType ) )
            // InternalFPML.g:7120:2: ( ruleValueType )
            {
            // InternalFPML.g:7120:2: ( ruleValueType )
            // InternalFPML.g:7121:3: ruleValueType
            {
             before(grammarAccess.getPureFunctionDefinitionAccess().getReturnTypeValueTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValueType();

            state._fsp--;

             after(grammarAccess.getPureFunctionDefinitionAccess().getReturnTypeValueTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunctionDefinition__ReturnTypeAssignment_1"


    // $ANTLR start "rule__PureFunctionDefinition__NameAssignment_2"
    // InternalFPML.g:7130:1: rule__PureFunctionDefinition__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__PureFunctionDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7134:1: ( ( RULE_ID ) )
            // InternalFPML.g:7135:2: ( RULE_ID )
            {
            // InternalFPML.g:7135:2: ( RULE_ID )
            // InternalFPML.g:7136:3: RULE_ID
            {
             before(grammarAccess.getPureFunctionDefinitionAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPureFunctionDefinitionAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunctionDefinition__NameAssignment_2"


    // $ANTLR start "rule__PureFunctionDefinition__ArgAssignment_4"
    // InternalFPML.g:7145:1: rule__PureFunctionDefinition__ArgAssignment_4 : ( ruleArgument ) ;
    public final void rule__PureFunctionDefinition__ArgAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7149:1: ( ( ruleArgument ) )
            // InternalFPML.g:7150:2: ( ruleArgument )
            {
            // InternalFPML.g:7150:2: ( ruleArgument )
            // InternalFPML.g:7151:3: ruleArgument
            {
             before(grammarAccess.getPureFunctionDefinitionAccess().getArgArgumentParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleArgument();

            state._fsp--;

             after(grammarAccess.getPureFunctionDefinitionAccess().getArgArgumentParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunctionDefinition__ArgAssignment_4"


    // $ANTLR start "rule__PureFunctionDefinition__FunctionBodyAssignment_8"
    // InternalFPML.g:7160:1: rule__PureFunctionDefinition__FunctionBodyAssignment_8 : ( ruleFunctionBodyPure ) ;
    public final void rule__PureFunctionDefinition__FunctionBodyAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7164:1: ( ( ruleFunctionBodyPure ) )
            // InternalFPML.g:7165:2: ( ruleFunctionBodyPure )
            {
            // InternalFPML.g:7165:2: ( ruleFunctionBodyPure )
            // InternalFPML.g:7166:3: ruleFunctionBodyPure
            {
             before(grammarAccess.getPureFunctionDefinitionAccess().getFunctionBodyFunctionBodyPureParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleFunctionBodyPure();

            state._fsp--;

             after(grammarAccess.getPureFunctionDefinitionAccess().getFunctionBodyFunctionBodyPureParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunctionDefinition__FunctionBodyAssignment_8"


    // $ANTLR start "rule__EffectFullFunctionDefinition__ReturnTypeAssignment_1"
    // InternalFPML.g:7175:1: rule__EffectFullFunctionDefinition__ReturnTypeAssignment_1 : ( ruleIOType ) ;
    public final void rule__EffectFullFunctionDefinition__ReturnTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7179:1: ( ( ruleIOType ) )
            // InternalFPML.g:7180:2: ( ruleIOType )
            {
            // InternalFPML.g:7180:2: ( ruleIOType )
            // InternalFPML.g:7181:3: ruleIOType
            {
             before(grammarAccess.getEffectFullFunctionDefinitionAccess().getReturnTypeIOTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleIOType();

            state._fsp--;

             after(grammarAccess.getEffectFullFunctionDefinitionAccess().getReturnTypeIOTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunctionDefinition__ReturnTypeAssignment_1"


    // $ANTLR start "rule__EffectFullFunctionDefinition__NameAssignment_2"
    // InternalFPML.g:7190:1: rule__EffectFullFunctionDefinition__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__EffectFullFunctionDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7194:1: ( ( RULE_ID ) )
            // InternalFPML.g:7195:2: ( RULE_ID )
            {
            // InternalFPML.g:7195:2: ( RULE_ID )
            // InternalFPML.g:7196:3: RULE_ID
            {
             before(grammarAccess.getEffectFullFunctionDefinitionAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEffectFullFunctionDefinitionAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunctionDefinition__NameAssignment_2"


    // $ANTLR start "rule__EffectFullFunctionDefinition__ArgAssignment_4"
    // InternalFPML.g:7205:1: rule__EffectFullFunctionDefinition__ArgAssignment_4 : ( ruleEffectFullArgument ) ;
    public final void rule__EffectFullFunctionDefinition__ArgAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7209:1: ( ( ruleEffectFullArgument ) )
            // InternalFPML.g:7210:2: ( ruleEffectFullArgument )
            {
            // InternalFPML.g:7210:2: ( ruleEffectFullArgument )
            // InternalFPML.g:7211:3: ruleEffectFullArgument
            {
             before(grammarAccess.getEffectFullFunctionDefinitionAccess().getArgEffectFullArgumentParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEffectFullArgument();

            state._fsp--;

             after(grammarAccess.getEffectFullFunctionDefinitionAccess().getArgEffectFullArgumentParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunctionDefinition__ArgAssignment_4"


    // $ANTLR start "rule__EffectFullFunctionDefinition__FunctionBodyAssignment_8"
    // InternalFPML.g:7220:1: rule__EffectFullFunctionDefinition__FunctionBodyAssignment_8 : ( ruleFunctionBodyEffectFull ) ;
    public final void rule__EffectFullFunctionDefinition__FunctionBodyAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7224:1: ( ( ruleFunctionBodyEffectFull ) )
            // InternalFPML.g:7225:2: ( ruleFunctionBodyEffectFull )
            {
            // InternalFPML.g:7225:2: ( ruleFunctionBodyEffectFull )
            // InternalFPML.g:7226:3: ruleFunctionBodyEffectFull
            {
             before(grammarAccess.getEffectFullFunctionDefinitionAccess().getFunctionBodyFunctionBodyEffectFullParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleFunctionBodyEffectFull();

            state._fsp--;

             after(grammarAccess.getEffectFullFunctionDefinitionAccess().getFunctionBodyFunctionBodyEffectFullParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunctionDefinition__FunctionBodyAssignment_8"


    // $ANTLR start "rule__MainFunc__ReturnTypeAssignment_1"
    // InternalFPML.g:7235:1: rule__MainFunc__ReturnTypeAssignment_1 : ( ruleUnitType ) ;
    public final void rule__MainFunc__ReturnTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7239:1: ( ( ruleUnitType ) )
            // InternalFPML.g:7240:2: ( ruleUnitType )
            {
            // InternalFPML.g:7240:2: ( ruleUnitType )
            // InternalFPML.g:7241:3: ruleUnitType
            {
             before(grammarAccess.getMainFuncAccess().getReturnTypeUnitTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUnitType();

            state._fsp--;

             after(grammarAccess.getMainFuncAccess().getReturnTypeUnitTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainFunc__ReturnTypeAssignment_1"


    // $ANTLR start "rule__MainFunc__FunctionBodyAssignment_5"
    // InternalFPML.g:7250:1: rule__MainFunc__FunctionBodyAssignment_5 : ( ruleFunctionBodyEffectFull ) ;
    public final void rule__MainFunc__FunctionBodyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7254:1: ( ( ruleFunctionBodyEffectFull ) )
            // InternalFPML.g:7255:2: ( ruleFunctionBodyEffectFull )
            {
            // InternalFPML.g:7255:2: ( ruleFunctionBodyEffectFull )
            // InternalFPML.g:7256:3: ruleFunctionBodyEffectFull
            {
             before(grammarAccess.getMainFuncAccess().getFunctionBodyFunctionBodyEffectFullParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleFunctionBodyEffectFull();

            state._fsp--;

             after(grammarAccess.getMainFuncAccess().getFunctionBodyFunctionBodyEffectFullParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainFunc__FunctionBodyAssignment_5"


    // $ANTLR start "rule__EffectFullArgument__TypeAssignment_0"
    // InternalFPML.g:7265:1: rule__EffectFullArgument__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__EffectFullArgument__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7269:1: ( ( ruleType ) )
            // InternalFPML.g:7270:2: ( ruleType )
            {
            // InternalFPML.g:7270:2: ( ruleType )
            // InternalFPML.g:7271:3: ruleType
            {
             before(grammarAccess.getEffectFullArgumentAccess().getTypeTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getEffectFullArgumentAccess().getTypeTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullArgument__TypeAssignment_0"


    // $ANTLR start "rule__EffectFullArgument__NameAssignment_1"
    // InternalFPML.g:7280:1: rule__EffectFullArgument__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EffectFullArgument__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7284:1: ( ( RULE_ID ) )
            // InternalFPML.g:7285:2: ( RULE_ID )
            {
            // InternalFPML.g:7285:2: ( RULE_ID )
            // InternalFPML.g:7286:3: RULE_ID
            {
             before(grammarAccess.getEffectFullArgumentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEffectFullArgumentAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullArgument__NameAssignment_1"


    // $ANTLR start "rule__Argument__TypeAssignment_0"
    // InternalFPML.g:7295:1: rule__Argument__TypeAssignment_0 : ( ruleValueType ) ;
    public final void rule__Argument__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7299:1: ( ( ruleValueType ) )
            // InternalFPML.g:7300:2: ( ruleValueType )
            {
            // InternalFPML.g:7300:2: ( ruleValueType )
            // InternalFPML.g:7301:3: ruleValueType
            {
             before(grammarAccess.getArgumentAccess().getTypeValueTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleValueType();

            state._fsp--;

             after(grammarAccess.getArgumentAccess().getTypeValueTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__TypeAssignment_0"


    // $ANTLR start "rule__Argument__NameAssignment_1"
    // InternalFPML.g:7310:1: rule__Argument__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Argument__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7314:1: ( ( RULE_ID ) )
            // InternalFPML.g:7315:2: ( RULE_ID )
            {
            // InternalFPML.g:7315:2: ( RULE_ID )
            // InternalFPML.g:7316:3: RULE_ID
            {
             before(grammarAccess.getArgumentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getArgumentAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__NameAssignment_1"


    // $ANTLR start "rule__CompositionFunctionBodyPure__ReferenceElementAssignment_0_0"
    // InternalFPML.g:7325:1: rule__CompositionFunctionBodyPure__ReferenceElementAssignment_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__CompositionFunctionBodyPure__ReferenceElementAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7329:1: ( ( ( RULE_ID ) ) )
            // InternalFPML.g:7330:2: ( ( RULE_ID ) )
            {
            // InternalFPML.g:7330:2: ( ( RULE_ID ) )
            // InternalFPML.g:7331:3: ( RULE_ID )
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getReferenceElementPureFunctionDefinitionCrossReference_0_0_0()); 
            // InternalFPML.g:7332:3: ( RULE_ID )
            // InternalFPML.g:7333:4: RULE_ID
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getReferenceElementPureFunctionDefinitionIDTerminalRuleCall_0_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCompositionFunctionBodyPureAccess().getReferenceElementPureFunctionDefinitionIDTerminalRuleCall_0_0_0_1()); 

            }

             after(grammarAccess.getCompositionFunctionBodyPureAccess().getReferenceElementPureFunctionDefinitionCrossReference_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionFunctionBodyPure__ReferenceElementAssignment_0_0"


    // $ANTLR start "rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1"
    // InternalFPML.g:7344:1: rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 : ( ruleCompositionFunctionBodyPureFactor ) ;
    public final void rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7348:1: ( ( ruleCompositionFunctionBodyPureFactor ) )
            // InternalFPML.g:7349:2: ( ruleCompositionFunctionBodyPureFactor )
            {
            // InternalFPML.g:7349:2: ( ruleCompositionFunctionBodyPureFactor )
            // InternalFPML.g:7350:3: ruleCompositionFunctionBodyPureFactor
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainCompositionFunctionBodyPureFactorParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCompositionFunctionBodyPureFactor();

            state._fsp--;

             after(grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainCompositionFunctionBodyPureFactorParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1"


    // $ANTLR start "rule__CompositionFunctionBodyPure__ReturnFunctionAssignment_0_2"
    // InternalFPML.g:7359:1: rule__CompositionFunctionBodyPure__ReturnFunctionAssignment_0_2 : ( ruleReturnPureFunction ) ;
    public final void rule__CompositionFunctionBodyPure__ReturnFunctionAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7363:1: ( ( ruleReturnPureFunction ) )
            // InternalFPML.g:7364:2: ( ruleReturnPureFunction )
            {
            // InternalFPML.g:7364:2: ( ruleReturnPureFunction )
            // InternalFPML.g:7365:3: ruleReturnPureFunction
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getReturnFunctionReturnPureFunctionParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleReturnPureFunction();

            state._fsp--;

             after(grammarAccess.getCompositionFunctionBodyPureAccess().getReturnFunctionReturnPureFunctionParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionFunctionBodyPure__ReturnFunctionAssignment_0_2"


    // $ANTLR start "rule__CompositionFunctionBodyPure__PrimitiveElementAssignment_1_0"
    // InternalFPML.g:7374:1: rule__CompositionFunctionBodyPure__PrimitiveElementAssignment_1_0 : ( rulePrimitivePureFunction ) ;
    public final void rule__CompositionFunctionBodyPure__PrimitiveElementAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7378:1: ( ( rulePrimitivePureFunction ) )
            // InternalFPML.g:7379:2: ( rulePrimitivePureFunction )
            {
            // InternalFPML.g:7379:2: ( rulePrimitivePureFunction )
            // InternalFPML.g:7380:3: rulePrimitivePureFunction
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getPrimitiveElementPrimitivePureFunctionParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            rulePrimitivePureFunction();

            state._fsp--;

             after(grammarAccess.getCompositionFunctionBodyPureAccess().getPrimitiveElementPrimitivePureFunctionParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionFunctionBodyPure__PrimitiveElementAssignment_1_0"


    // $ANTLR start "rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1"
    // InternalFPML.g:7389:1: rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 : ( ruleCompositionFunctionBodyPureFactor ) ;
    public final void rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7393:1: ( ( ruleCompositionFunctionBodyPureFactor ) )
            // InternalFPML.g:7394:2: ( ruleCompositionFunctionBodyPureFactor )
            {
            // InternalFPML.g:7394:2: ( ruleCompositionFunctionBodyPureFactor )
            // InternalFPML.g:7395:3: ruleCompositionFunctionBodyPureFactor
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainCompositionFunctionBodyPureFactorParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCompositionFunctionBodyPureFactor();

            state._fsp--;

             after(grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainCompositionFunctionBodyPureFactorParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1"


    // $ANTLR start "rule__CompositionFunctionBodyPure__ReturnFunctionAssignment_1_2"
    // InternalFPML.g:7404:1: rule__CompositionFunctionBodyPure__ReturnFunctionAssignment_1_2 : ( ruleReturnPureFunction ) ;
    public final void rule__CompositionFunctionBodyPure__ReturnFunctionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7408:1: ( ( ruleReturnPureFunction ) )
            // InternalFPML.g:7409:2: ( ruleReturnPureFunction )
            {
            // InternalFPML.g:7409:2: ( ruleReturnPureFunction )
            // InternalFPML.g:7410:3: ruleReturnPureFunction
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getReturnFunctionReturnPureFunctionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleReturnPureFunction();

            state._fsp--;

             after(grammarAccess.getCompositionFunctionBodyPureAccess().getReturnFunctionReturnPureFunctionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionFunctionBodyPure__ReturnFunctionAssignment_1_2"


    // $ANTLR start "rule__CompositionFunctionBodyPureFactor__ReferenceElementAssignment_0_1"
    // InternalFPML.g:7419:1: rule__CompositionFunctionBodyPureFactor__ReferenceElementAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__CompositionFunctionBodyPureFactor__ReferenceElementAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7423:1: ( ( ( RULE_ID ) ) )
            // InternalFPML.g:7424:2: ( ( RULE_ID ) )
            {
            // InternalFPML.g:7424:2: ( ( RULE_ID ) )
            // InternalFPML.g:7425:3: ( RULE_ID )
            {
             before(grammarAccess.getCompositionFunctionBodyPureFactorAccess().getReferenceElementPureFunctionDefinitionCrossReference_0_1_0()); 
            // InternalFPML.g:7426:3: ( RULE_ID )
            // InternalFPML.g:7427:4: RULE_ID
            {
             before(grammarAccess.getCompositionFunctionBodyPureFactorAccess().getReferenceElementPureFunctionDefinitionIDTerminalRuleCall_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCompositionFunctionBodyPureFactorAccess().getReferenceElementPureFunctionDefinitionIDTerminalRuleCall_0_1_0_1()); 

            }

             after(grammarAccess.getCompositionFunctionBodyPureFactorAccess().getReferenceElementPureFunctionDefinitionCrossReference_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionFunctionBodyPureFactor__ReferenceElementAssignment_0_1"


    // $ANTLR start "rule__CompositionFunctionBodyPureFactor__PrimitiveElementAssignment_1_1"
    // InternalFPML.g:7438:1: rule__CompositionFunctionBodyPureFactor__PrimitiveElementAssignment_1_1 : ( rulePrimitivePureFunction ) ;
    public final void rule__CompositionFunctionBodyPureFactor__PrimitiveElementAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7442:1: ( ( rulePrimitivePureFunction ) )
            // InternalFPML.g:7443:2: ( rulePrimitivePureFunction )
            {
            // InternalFPML.g:7443:2: ( rulePrimitivePureFunction )
            // InternalFPML.g:7444:3: rulePrimitivePureFunction
            {
             before(grammarAccess.getCompositionFunctionBodyPureFactorAccess().getPrimitiveElementPrimitivePureFunctionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulePrimitivePureFunction();

            state._fsp--;

             after(grammarAccess.getCompositionFunctionBodyPureFactorAccess().getPrimitiveElementPrimitivePureFunctionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionFunctionBodyPureFactor__PrimitiveElementAssignment_1_1"


    // $ANTLR start "rule__CompositionFunctionBodyEffect__ReferenceElementAssignment_0_0"
    // InternalFPML.g:7453:1: rule__CompositionFunctionBodyEffect__ReferenceElementAssignment_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__CompositionFunctionBodyEffect__ReferenceElementAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7457:1: ( ( ( RULE_ID ) ) )
            // InternalFPML.g:7458:2: ( ( RULE_ID ) )
            {
            // InternalFPML.g:7458:2: ( ( RULE_ID ) )
            // InternalFPML.g:7459:3: ( RULE_ID )
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getReferenceElementChainElementCrossReference_0_0_0()); 
            // InternalFPML.g:7460:3: ( RULE_ID )
            // InternalFPML.g:7461:4: RULE_ID
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getReferenceElementChainElementIDTerminalRuleCall_0_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCompositionFunctionBodyEffectAccess().getReferenceElementChainElementIDTerminalRuleCall_0_0_0_1()); 

            }

             after(grammarAccess.getCompositionFunctionBodyEffectAccess().getReferenceElementChainElementCrossReference_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionFunctionBodyEffect__ReferenceElementAssignment_0_0"


    // $ANTLR start "rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1"
    // InternalFPML.g:7472:1: rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 : ( ruleCompositionFunctionBodyEffectFullFactor ) ;
    public final void rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7476:1: ( ( ruleCompositionFunctionBodyEffectFullFactor ) )
            // InternalFPML.g:7477:2: ( ruleCompositionFunctionBodyEffectFullFactor )
            {
            // InternalFPML.g:7477:2: ( ruleCompositionFunctionBodyEffectFullFactor )
            // InternalFPML.g:7478:3: ruleCompositionFunctionBodyEffectFullFactor
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainCompositionFunctionBodyEffectFullFactorParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCompositionFunctionBodyEffectFullFactor();

            state._fsp--;

             after(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainCompositionFunctionBodyEffectFullFactorParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1"


    // $ANTLR start "rule__CompositionFunctionBodyEffect__ReturnFunctionAssignment_0_2"
    // InternalFPML.g:7487:1: rule__CompositionFunctionBodyEffect__ReturnFunctionAssignment_0_2 : ( ruleReturnEffectFullFunction ) ;
    public final void rule__CompositionFunctionBodyEffect__ReturnFunctionAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7491:1: ( ( ruleReturnEffectFullFunction ) )
            // InternalFPML.g:7492:2: ( ruleReturnEffectFullFunction )
            {
            // InternalFPML.g:7492:2: ( ruleReturnEffectFullFunction )
            // InternalFPML.g:7493:3: ruleReturnEffectFullFunction
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getReturnFunctionReturnEffectFullFunctionParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleReturnEffectFullFunction();

            state._fsp--;

             after(grammarAccess.getCompositionFunctionBodyEffectAccess().getReturnFunctionReturnEffectFullFunctionParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionFunctionBodyEffect__ReturnFunctionAssignment_0_2"


    // $ANTLR start "rule__CompositionFunctionBodyEffect__PrimitiveElementAssignment_1_0"
    // InternalFPML.g:7502:1: rule__CompositionFunctionBodyEffect__PrimitiveElementAssignment_1_0 : ( ( rule__CompositionFunctionBodyEffect__PrimitiveElementAlternatives_1_0_0 ) ) ;
    public final void rule__CompositionFunctionBodyEffect__PrimitiveElementAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7506:1: ( ( ( rule__CompositionFunctionBodyEffect__PrimitiveElementAlternatives_1_0_0 ) ) )
            // InternalFPML.g:7507:2: ( ( rule__CompositionFunctionBodyEffect__PrimitiveElementAlternatives_1_0_0 ) )
            {
            // InternalFPML.g:7507:2: ( ( rule__CompositionFunctionBodyEffect__PrimitiveElementAlternatives_1_0_0 ) )
            // InternalFPML.g:7508:3: ( rule__CompositionFunctionBodyEffect__PrimitiveElementAlternatives_1_0_0 )
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getPrimitiveElementAlternatives_1_0_0()); 
            // InternalFPML.g:7509:3: ( rule__CompositionFunctionBodyEffect__PrimitiveElementAlternatives_1_0_0 )
            // InternalFPML.g:7509:4: rule__CompositionFunctionBodyEffect__PrimitiveElementAlternatives_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__CompositionFunctionBodyEffect__PrimitiveElementAlternatives_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getCompositionFunctionBodyEffectAccess().getPrimitiveElementAlternatives_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionFunctionBodyEffect__PrimitiveElementAssignment_1_0"


    // $ANTLR start "rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1"
    // InternalFPML.g:7517:1: rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 : ( ruleCompositionFunctionBodyEffectFullFactor ) ;
    public final void rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7521:1: ( ( ruleCompositionFunctionBodyEffectFullFactor ) )
            // InternalFPML.g:7522:2: ( ruleCompositionFunctionBodyEffectFullFactor )
            {
            // InternalFPML.g:7522:2: ( ruleCompositionFunctionBodyEffectFullFactor )
            // InternalFPML.g:7523:3: ruleCompositionFunctionBodyEffectFullFactor
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainCompositionFunctionBodyEffectFullFactorParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCompositionFunctionBodyEffectFullFactor();

            state._fsp--;

             after(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainCompositionFunctionBodyEffectFullFactorParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1"


    // $ANTLR start "rule__CompositionFunctionBodyEffect__ReturnFunctionAssignment_1_2"
    // InternalFPML.g:7532:1: rule__CompositionFunctionBodyEffect__ReturnFunctionAssignment_1_2 : ( ruleReturnEffectFullFunction ) ;
    public final void rule__CompositionFunctionBodyEffect__ReturnFunctionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7536:1: ( ( ruleReturnEffectFullFunction ) )
            // InternalFPML.g:7537:2: ( ruleReturnEffectFullFunction )
            {
            // InternalFPML.g:7537:2: ( ruleReturnEffectFullFunction )
            // InternalFPML.g:7538:3: ruleReturnEffectFullFunction
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getReturnFunctionReturnEffectFullFunctionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleReturnEffectFullFunction();

            state._fsp--;

             after(grammarAccess.getCompositionFunctionBodyEffectAccess().getReturnFunctionReturnEffectFullFunctionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionFunctionBodyEffect__ReturnFunctionAssignment_1_2"


    // $ANTLR start "rule__CompositionFunctionBodyEffectFullFactor__ReferenceElementAssignment_0_1"
    // InternalFPML.g:7547:1: rule__CompositionFunctionBodyEffectFullFactor__ReferenceElementAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__CompositionFunctionBodyEffectFullFactor__ReferenceElementAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7551:1: ( ( ( RULE_ID ) ) )
            // InternalFPML.g:7552:2: ( ( RULE_ID ) )
            {
            // InternalFPML.g:7552:2: ( ( RULE_ID ) )
            // InternalFPML.g:7553:3: ( RULE_ID )
            {
             before(grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getReferenceElementChainElementCrossReference_0_1_0()); 
            // InternalFPML.g:7554:3: ( RULE_ID )
            // InternalFPML.g:7555:4: RULE_ID
            {
             before(grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getReferenceElementChainElementIDTerminalRuleCall_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getReferenceElementChainElementIDTerminalRuleCall_0_1_0_1()); 

            }

             after(grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getReferenceElementChainElementCrossReference_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionFunctionBodyEffectFullFactor__ReferenceElementAssignment_0_1"


    // $ANTLR start "rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAssignment_1_1"
    // InternalFPML.g:7566:1: rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAssignment_1_1 : ( ( rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAlternatives_1_1_0 ) ) ;
    public final void rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7570:1: ( ( ( rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAlternatives_1_1_0 ) ) )
            // InternalFPML.g:7571:2: ( ( rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAlternatives_1_1_0 ) )
            {
            // InternalFPML.g:7571:2: ( ( rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAlternatives_1_1_0 ) )
            // InternalFPML.g:7572:3: ( rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAlternatives_1_1_0 )
            {
             before(grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getPrimitiveElementAlternatives_1_1_0()); 
            // InternalFPML.g:7573:3: ( rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAlternatives_1_1_0 )
            // InternalFPML.g:7573:4: rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getPrimitiveElementAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAssignment_1_1"


    // $ANTLR start "rule__ReturnPureFunction__LambdaFunctionBodyAssignment_2"
    // InternalFPML.g:7581:1: rule__ReturnPureFunction__LambdaFunctionBodyAssignment_2 : ( rulePureLambda ) ;
    public final void rule__ReturnPureFunction__LambdaFunctionBodyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7585:1: ( ( rulePureLambda ) )
            // InternalFPML.g:7586:2: ( rulePureLambda )
            {
            // InternalFPML.g:7586:2: ( rulePureLambda )
            // InternalFPML.g:7587:3: rulePureLambda
            {
             before(grammarAccess.getReturnPureFunctionAccess().getLambdaFunctionBodyPureLambdaParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePureLambda();

            state._fsp--;

             after(grammarAccess.getReturnPureFunctionAccess().getLambdaFunctionBodyPureLambdaParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnPureFunction__LambdaFunctionBodyAssignment_2"


    // $ANTLR start "rule__ReturnEffectFullFunction__LambdaFunctionBodyAssignment_2"
    // InternalFPML.g:7596:1: rule__ReturnEffectFullFunction__LambdaFunctionBodyAssignment_2 : ( ruleEffectFullLambda ) ;
    public final void rule__ReturnEffectFullFunction__LambdaFunctionBodyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7600:1: ( ( ruleEffectFullLambda ) )
            // InternalFPML.g:7601:2: ( ruleEffectFullLambda )
            {
            // InternalFPML.g:7601:2: ( ruleEffectFullLambda )
            // InternalFPML.g:7602:3: ruleEffectFullLambda
            {
             before(grammarAccess.getReturnEffectFullFunctionAccess().getLambdaFunctionBodyEffectFullLambdaParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEffectFullLambda();

            state._fsp--;

             after(grammarAccess.getReturnEffectFullFunctionAccess().getLambdaFunctionBodyEffectFullLambdaParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnEffectFullFunction__LambdaFunctionBodyAssignment_2"


    // $ANTLR start "rule__IOType__TypeAssignment_1"
    // InternalFPML.g:7611:1: rule__IOType__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__IOType__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7615:1: ( ( ruleType ) )
            // InternalFPML.g:7616:2: ( ruleType )
            {
            // InternalFPML.g:7616:2: ( ruleType )
            // InternalFPML.g:7617:3: ruleType
            {
             before(grammarAccess.getIOTypeAccess().getTypeTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getIOTypeAccess().getTypeTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IOType__TypeAssignment_1"


    // $ANTLR start "rule__IntegerType__TypeAssignment_1"
    // InternalFPML.g:7626:1: rule__IntegerType__TypeAssignment_1 : ( ( 'int' ) ) ;
    public final void rule__IntegerType__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7630:1: ( ( ( 'int' ) ) )
            // InternalFPML.g:7631:2: ( ( 'int' ) )
            {
            // InternalFPML.g:7631:2: ( ( 'int' ) )
            // InternalFPML.g:7632:3: ( 'int' )
            {
             before(grammarAccess.getIntegerTypeAccess().getTypeIntKeyword_1_0()); 
            // InternalFPML.g:7633:3: ( 'int' )
            // InternalFPML.g:7634:4: 'int'
            {
             before(grammarAccess.getIntegerTypeAccess().getTypeIntKeyword_1_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getIntegerTypeAccess().getTypeIntKeyword_1_0()); 

            }

             after(grammarAccess.getIntegerTypeAccess().getTypeIntKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerType__TypeAssignment_1"


    // $ANTLR start "rule__StringType__TypeAssignment_1"
    // InternalFPML.g:7645:1: rule__StringType__TypeAssignment_1 : ( ( 'String' ) ) ;
    public final void rule__StringType__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7649:1: ( ( ( 'String' ) ) )
            // InternalFPML.g:7650:2: ( ( 'String' ) )
            {
            // InternalFPML.g:7650:2: ( ( 'String' ) )
            // InternalFPML.g:7651:3: ( 'String' )
            {
             before(grammarAccess.getStringTypeAccess().getTypeStringKeyword_1_0()); 
            // InternalFPML.g:7652:3: ( 'String' )
            // InternalFPML.g:7653:4: 'String'
            {
             before(grammarAccess.getStringTypeAccess().getTypeStringKeyword_1_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getStringTypeAccess().getTypeStringKeyword_1_0()); 

            }

             after(grammarAccess.getStringTypeAccess().getTypeStringKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__TypeAssignment_1"


    // $ANTLR start "rule__UnitType__TypeAssignment_1"
    // InternalFPML.g:7664:1: rule__UnitType__TypeAssignment_1 : ( ( 'Unit' ) ) ;
    public final void rule__UnitType__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7668:1: ( ( ( 'Unit' ) ) )
            // InternalFPML.g:7669:2: ( ( 'Unit' ) )
            {
            // InternalFPML.g:7669:2: ( ( 'Unit' ) )
            // InternalFPML.g:7670:3: ( 'Unit' )
            {
             before(grammarAccess.getUnitTypeAccess().getTypeUnitKeyword_1_0()); 
            // InternalFPML.g:7671:3: ( 'Unit' )
            // InternalFPML.g:7672:4: 'Unit'
            {
             before(grammarAccess.getUnitTypeAccess().getTypeUnitKeyword_1_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getUnitTypeAccess().getTypeUnitKeyword_1_0()); 

            }

             after(grammarAccess.getUnitTypeAccess().getTypeUnitKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitType__TypeAssignment_1"


    // $ANTLR start "rule__DataType__TypeAssignment_2"
    // InternalFPML.g:7683:1: rule__DataType__TypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__DataType__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7687:1: ( ( ( RULE_ID ) ) )
            // InternalFPML.g:7688:2: ( ( RULE_ID ) )
            {
            // InternalFPML.g:7688:2: ( ( RULE_ID ) )
            // InternalFPML.g:7689:3: ( RULE_ID )
            {
             before(grammarAccess.getDataTypeAccess().getTypeDataCrossReference_2_0()); 
            // InternalFPML.g:7690:3: ( RULE_ID )
            // InternalFPML.g:7691:4: RULE_ID
            {
             before(grammarAccess.getDataTypeAccess().getTypeDataIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getTypeDataIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getDataTypeAccess().getTypeDataCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__TypeAssignment_2"


    // $ANTLR start "rule__PureFunctionType__ArgTypeAssignment_3"
    // InternalFPML.g:7702:1: rule__PureFunctionType__ArgTypeAssignment_3 : ( ruleValueType ) ;
    public final void rule__PureFunctionType__ArgTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7706:1: ( ( ruleValueType ) )
            // InternalFPML.g:7707:2: ( ruleValueType )
            {
            // InternalFPML.g:7707:2: ( ruleValueType )
            // InternalFPML.g:7708:3: ruleValueType
            {
             before(grammarAccess.getPureFunctionTypeAccess().getArgTypeValueTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleValueType();

            state._fsp--;

             after(grammarAccess.getPureFunctionTypeAccess().getArgTypeValueTypeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunctionType__ArgTypeAssignment_3"


    // $ANTLR start "rule__PureFunctionType__ReturnTypeAssignment_5"
    // InternalFPML.g:7717:1: rule__PureFunctionType__ReturnTypeAssignment_5 : ( ruleValueType ) ;
    public final void rule__PureFunctionType__ReturnTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7721:1: ( ( ruleValueType ) )
            // InternalFPML.g:7722:2: ( ruleValueType )
            {
            // InternalFPML.g:7722:2: ( ruleValueType )
            // InternalFPML.g:7723:3: ruleValueType
            {
             before(grammarAccess.getPureFunctionTypeAccess().getReturnTypeValueTypeParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleValueType();

            state._fsp--;

             after(grammarAccess.getPureFunctionTypeAccess().getReturnTypeValueTypeParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunctionType__ReturnTypeAssignment_5"


    // $ANTLR start "rule__EffectFullFunctionType__ArgTypeAssignment_3"
    // InternalFPML.g:7732:1: rule__EffectFullFunctionType__ArgTypeAssignment_3 : ( ruleType ) ;
    public final void rule__EffectFullFunctionType__ArgTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7736:1: ( ( ruleType ) )
            // InternalFPML.g:7737:2: ( ruleType )
            {
            // InternalFPML.g:7737:2: ( ruleType )
            // InternalFPML.g:7738:3: ruleType
            {
             before(grammarAccess.getEffectFullFunctionTypeAccess().getArgTypeTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getEffectFullFunctionTypeAccess().getArgTypeTypeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunctionType__ArgTypeAssignment_3"


    // $ANTLR start "rule__EffectFullFunctionType__ReturnTypeAssignment_5"
    // InternalFPML.g:7747:1: rule__EffectFullFunctionType__ReturnTypeAssignment_5 : ( ruleType ) ;
    public final void rule__EffectFullFunctionType__ReturnTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7751:1: ( ( ruleType ) )
            // InternalFPML.g:7752:2: ( ruleType )
            {
            // InternalFPML.g:7752:2: ( ruleType )
            // InternalFPML.g:7753:3: ruleType
            {
             before(grammarAccess.getEffectFullFunctionTypeAccess().getReturnTypeTypeParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getEffectFullFunctionTypeAccess().getReturnTypeTypeParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunctionType__ReturnTypeAssignment_5"


    // $ANTLR start "rule__IntValue__ValueAssignment_1"
    // InternalFPML.g:7762:1: rule__IntValue__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__IntValue__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7766:1: ( ( RULE_INT ) )
            // InternalFPML.g:7767:2: ( RULE_INT )
            {
            // InternalFPML.g:7767:2: ( RULE_INT )
            // InternalFPML.g:7768:3: RULE_INT
            {
             before(grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntValue__ValueAssignment_1"


    // $ANTLR start "rule__StringValue__ValueAssignment_1"
    // InternalFPML.g:7777:1: rule__StringValue__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__StringValue__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7781:1: ( ( RULE_STRING ) )
            // InternalFPML.g:7782:2: ( RULE_STRING )
            {
            // InternalFPML.g:7782:2: ( RULE_STRING )
            // InternalFPML.g:7783:3: RULE_STRING
            {
             before(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__ValueAssignment_1"


    // $ANTLR start "rule__FunctionValue__ValueAssignment"
    // InternalFPML.g:7792:1: rule__FunctionValue__ValueAssignment : ( rulePureLambda ) ;
    public final void rule__FunctionValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7796:1: ( ( rulePureLambda ) )
            // InternalFPML.g:7797:2: ( rulePureLambda )
            {
            // InternalFPML.g:7797:2: ( rulePureLambda )
            // InternalFPML.g:7798:3: rulePureLambda
            {
             before(grammarAccess.getFunctionValueAccess().getValuePureLambdaParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePureLambda();

            state._fsp--;

             after(grammarAccess.getFunctionValueAccess().getValuePureLambdaParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionValue__ValueAssignment"


    // $ANTLR start "rule__DataValue__TypeAssignment_1"
    // InternalFPML.g:7807:1: rule__DataValue__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__DataValue__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7811:1: ( ( ( RULE_ID ) ) )
            // InternalFPML.g:7812:2: ( ( RULE_ID ) )
            {
            // InternalFPML.g:7812:2: ( ( RULE_ID ) )
            // InternalFPML.g:7813:3: ( RULE_ID )
            {
             before(grammarAccess.getDataValueAccess().getTypeDataCrossReference_1_0()); 
            // InternalFPML.g:7814:3: ( RULE_ID )
            // InternalFPML.g:7815:4: RULE_ID
            {
             before(grammarAccess.getDataValueAccess().getTypeDataIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataValueAccess().getTypeDataIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getDataValueAccess().getTypeDataCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataValue__TypeAssignment_1"


    // $ANTLR start "rule__DataValue__ValueAssignment_3"
    // InternalFPML.g:7826:1: rule__DataValue__ValueAssignment_3 : ( ruleAdtValue ) ;
    public final void rule__DataValue__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7830:1: ( ( ruleAdtValue ) )
            // InternalFPML.g:7831:2: ( ruleAdtValue )
            {
            // InternalFPML.g:7831:2: ( ruleAdtValue )
            // InternalFPML.g:7832:3: ruleAdtValue
            {
             before(grammarAccess.getDataValueAccess().getValueAdtValueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAdtValue();

            state._fsp--;

             after(grammarAccess.getDataValueAccess().getValueAdtValueParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataValue__ValueAssignment_3"


    // $ANTLR start "rule__ValueRef__ValueAssignment_1"
    // InternalFPML.g:7841:1: rule__ValueRef__ValueAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ValueRef__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7845:1: ( ( ( RULE_ID ) ) )
            // InternalFPML.g:7846:2: ( ( RULE_ID ) )
            {
            // InternalFPML.g:7846:2: ( ( RULE_ID ) )
            // InternalFPML.g:7847:3: ( RULE_ID )
            {
             before(grammarAccess.getValueRefAccess().getValuePureReferenceCrossReference_1_0()); 
            // InternalFPML.g:7848:3: ( RULE_ID )
            // InternalFPML.g:7849:4: RULE_ID
            {
             before(grammarAccess.getValueRefAccess().getValuePureReferenceIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getValueRefAccess().getValuePureReferenceIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getValueRefAccess().getValuePureReferenceCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueRef__ValueAssignment_1"


    // $ANTLR start "rule__PureLambda__ArgAssignment_1"
    // InternalFPML.g:7860:1: rule__PureLambda__ArgAssignment_1 : ( ruleArgument ) ;
    public final void rule__PureLambda__ArgAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7864:1: ( ( ruleArgument ) )
            // InternalFPML.g:7865:2: ( ruleArgument )
            {
            // InternalFPML.g:7865:2: ( ruleArgument )
            // InternalFPML.g:7866:3: ruleArgument
            {
             before(grammarAccess.getPureLambdaAccess().getArgArgumentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleArgument();

            state._fsp--;

             after(grammarAccess.getPureLambdaAccess().getArgArgumentParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureLambda__ArgAssignment_1"


    // $ANTLR start "rule__PureLambda__FunctionBodyAssignment_4"
    // InternalFPML.g:7875:1: rule__PureLambda__FunctionBodyAssignment_4 : ( ruleFunctionBodyPure ) ;
    public final void rule__PureLambda__FunctionBodyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7879:1: ( ( ruleFunctionBodyPure ) )
            // InternalFPML.g:7880:2: ( ruleFunctionBodyPure )
            {
            // InternalFPML.g:7880:2: ( ruleFunctionBodyPure )
            // InternalFPML.g:7881:3: ruleFunctionBodyPure
            {
             before(grammarAccess.getPureLambdaAccess().getFunctionBodyFunctionBodyPureParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleFunctionBodyPure();

            state._fsp--;

             after(grammarAccess.getPureLambdaAccess().getFunctionBodyFunctionBodyPureParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureLambda__FunctionBodyAssignment_4"


    // $ANTLR start "rule__EffectFullLambda__ArgAssignment_1"
    // InternalFPML.g:7890:1: rule__EffectFullLambda__ArgAssignment_1 : ( ruleEffectFullArgument ) ;
    public final void rule__EffectFullLambda__ArgAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7894:1: ( ( ruleEffectFullArgument ) )
            // InternalFPML.g:7895:2: ( ruleEffectFullArgument )
            {
            // InternalFPML.g:7895:2: ( ruleEffectFullArgument )
            // InternalFPML.g:7896:3: ruleEffectFullArgument
            {
             before(grammarAccess.getEffectFullLambdaAccess().getArgEffectFullArgumentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEffectFullArgument();

            state._fsp--;

             after(grammarAccess.getEffectFullLambdaAccess().getArgEffectFullArgumentParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullLambda__ArgAssignment_1"


    // $ANTLR start "rule__EffectFullLambda__FunctionBodyAssignment_4"
    // InternalFPML.g:7905:1: rule__EffectFullLambda__FunctionBodyAssignment_4 : ( ruleFunctionBodyEffectFull ) ;
    public final void rule__EffectFullLambda__FunctionBodyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7909:1: ( ( ruleFunctionBodyEffectFull ) )
            // InternalFPML.g:7910:2: ( ruleFunctionBodyEffectFull )
            {
            // InternalFPML.g:7910:2: ( ruleFunctionBodyEffectFull )
            // InternalFPML.g:7911:3: ruleFunctionBodyEffectFull
            {
             before(grammarAccess.getEffectFullLambdaAccess().getFunctionBodyFunctionBodyEffectFullParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleFunctionBodyEffectFull();

            state._fsp--;

             after(grammarAccess.getEffectFullLambdaAccess().getFunctionBodyFunctionBodyEffectFullParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullLambda__FunctionBodyAssignment_4"


    // $ANTLR start "rule__ProdValue__ProdAdtElement1Assignment_1"
    // InternalFPML.g:7920:1: rule__ProdValue__ProdAdtElement1Assignment_1 : ( ruleAdtValue ) ;
    public final void rule__ProdValue__ProdAdtElement1Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7924:1: ( ( ruleAdtValue ) )
            // InternalFPML.g:7925:2: ( ruleAdtValue )
            {
            // InternalFPML.g:7925:2: ( ruleAdtValue )
            // InternalFPML.g:7926:3: ruleAdtValue
            {
             before(grammarAccess.getProdValueAccess().getProdAdtElement1AdtValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAdtValue();

            state._fsp--;

             after(grammarAccess.getProdValueAccess().getProdAdtElement1AdtValueParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProdValue__ProdAdtElement1Assignment_1"


    // $ANTLR start "rule__ProdValue__ProdAdtElement2Assignment_3"
    // InternalFPML.g:7935:1: rule__ProdValue__ProdAdtElement2Assignment_3 : ( ruleAdtValue ) ;
    public final void rule__ProdValue__ProdAdtElement2Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7939:1: ( ( ruleAdtValue ) )
            // InternalFPML.g:7940:2: ( ruleAdtValue )
            {
            // InternalFPML.g:7940:2: ( ruleAdtValue )
            // InternalFPML.g:7941:3: ruleAdtValue
            {
             before(grammarAccess.getProdValueAccess().getProdAdtElement2AdtValueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAdtValue();

            state._fsp--;

             after(grammarAccess.getProdValueAccess().getProdAdtElement2AdtValueParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProdValue__ProdAdtElement2Assignment_3"


    // $ANTLR start "rule__SumValue__SumAdtElement1Assignment_0_2"
    // InternalFPML.g:7950:1: rule__SumValue__SumAdtElement1Assignment_0_2 : ( ruleAdtValue ) ;
    public final void rule__SumValue__SumAdtElement1Assignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7954:1: ( ( ruleAdtValue ) )
            // InternalFPML.g:7955:2: ( ruleAdtValue )
            {
            // InternalFPML.g:7955:2: ( ruleAdtValue )
            // InternalFPML.g:7956:3: ruleAdtValue
            {
             before(grammarAccess.getSumValueAccess().getSumAdtElement1AdtValueParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAdtValue();

            state._fsp--;

             after(grammarAccess.getSumValueAccess().getSumAdtElement1AdtValueParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SumValue__SumAdtElement1Assignment_0_2"


    // $ANTLR start "rule__SumValue__SumAdtElement2Assignment_1_2"
    // InternalFPML.g:7965:1: rule__SumValue__SumAdtElement2Assignment_1_2 : ( ruleAdtValue ) ;
    public final void rule__SumValue__SumAdtElement2Assignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7969:1: ( ( ruleAdtValue ) )
            // InternalFPML.g:7970:2: ( ruleAdtValue )
            {
            // InternalFPML.g:7970:2: ( ruleAdtValue )
            // InternalFPML.g:7971:3: ruleAdtValue
            {
             before(grammarAccess.getSumValueAccess().getSumAdtElement2AdtValueParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAdtValue();

            state._fsp--;

             after(grammarAccess.getSumValueAccess().getSumAdtElement2AdtValueParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SumValue__SumAdtElement2Assignment_1_2"


    // $ANTLR start "rule__ApplyF__ValueAssignment_2"
    // InternalFPML.g:7980:1: rule__ApplyF__ValueAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ApplyF__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7984:1: ( ( ( RULE_ID ) ) )
            // InternalFPML.g:7985:2: ( ( RULE_ID ) )
            {
            // InternalFPML.g:7985:2: ( ( RULE_ID ) )
            // InternalFPML.g:7986:3: ( RULE_ID )
            {
             before(grammarAccess.getApplyFAccess().getValueValueCrossReference_2_0()); 
            // InternalFPML.g:7987:3: ( RULE_ID )
            // InternalFPML.g:7988:4: RULE_ID
            {
             before(grammarAccess.getApplyFAccess().getValueValueIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getApplyFAccess().getValueValueIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getApplyFAccess().getValueValueCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplyF__ValueAssignment_2"


    // $ANTLR start "rule__ApplyFIO__ValueAssignment_2"
    // InternalFPML.g:7999:1: rule__ApplyFIO__ValueAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ApplyFIO__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:8003:1: ( ( ( RULE_ID ) ) )
            // InternalFPML.g:8004:2: ( ( RULE_ID ) )
            {
            // InternalFPML.g:8004:2: ( ( RULE_ID ) )
            // InternalFPML.g:8005:3: ( RULE_ID )
            {
             before(grammarAccess.getApplyFIOAccess().getValueValueCrossReference_2_0()); 
            // InternalFPML.g:8006:3: ( RULE_ID )
            // InternalFPML.g:8007:4: RULE_ID
            {
             before(grammarAccess.getApplyFIOAccess().getValueValueIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getApplyFIOAccess().getValueValueIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getApplyFIOAccess().getValueValueCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplyFIO__ValueAssignment_2"

    // Delegated rules


    protected DFA14 dfa14 = new DFA14(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\3\uffff\1\7\6\uffff";
    static final String dfa_3s = "\1\4\2\uffff\1\30\1\uffff\1\4\4\uffff";
    static final String dfa_4s = "\1\50\2\uffff\1\43\1\uffff\1\61\4\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\2\1\uffff\1\5\1\uffff\1\4\1\3\1\6\1\7";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\3\1\1\1\2\21\uffff\1\5\16\uffff\2\4",
            "",
            "",
            "\1\6\1\7\11\uffff\1\7",
            "",
            "\3\11\21\uffff\1\11\7\uffff\2\10\5\uffff\2\11\7\uffff\2\10",
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

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1786:1: rule__AdtValue__Alternatives : ( ( ruleIntValue ) | ( ruleStringValue ) | ( ruleValueRef ) | ( ruleDataValue ) | ( ruleSumValue ) | ( ruleFunctionValue ) | ( ruleProdValue ) );";
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
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0003000300080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000004001000070L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0003000300000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00003E0010600010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0007002300000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000FE0010600010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x000001C001000070L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000C00000000000L});

}