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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Pure'", "'{'", "'}'", "'Functions'", "'Data'", "'Value'", "'Effects'", "':'", "'['", "']'", "'+'", "'*'", "'def'", "'('", "')'", "'IO'", "'main'", "'Undefined'", "'|>'", "'>>='", "'->'", "'ref'", "'F'", "'<'", "','", "'>'", "'FIO'", "'()'", "'Left'", "'Right'", "'IntToString'", "'IntPow'", "'-'", "'mod'", "'apply'", "'print'", "'int'", "'String'", "'Unit'"
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


    // $ANTLR start "entryRuleApply"
    // InternalFPML.g:1378:1: entryRuleApply : ruleApply EOF ;
    public final void entryRuleApply() throws RecognitionException {
        try {
            // InternalFPML.g:1379:1: ( ruleApply EOF )
            // InternalFPML.g:1380:1: ruleApply EOF
            {
             before(grammarAccess.getApplyRule()); 
            pushFollow(FOLLOW_1);
            ruleApply();

            state._fsp--;

             after(grammarAccess.getApplyRule()); 
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
    // $ANTLR end "entryRuleApply"


    // $ANTLR start "ruleApply"
    // InternalFPML.g:1387:1: ruleApply : ( ( rule__Apply__Group__0 ) ) ;
    public final void ruleApply() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1391:2: ( ( ( rule__Apply__Group__0 ) ) )
            // InternalFPML.g:1392:2: ( ( rule__Apply__Group__0 ) )
            {
            // InternalFPML.g:1392:2: ( ( rule__Apply__Group__0 ) )
            // InternalFPML.g:1393:3: ( rule__Apply__Group__0 )
            {
             before(grammarAccess.getApplyAccess().getGroup()); 
            // InternalFPML.g:1394:3: ( rule__Apply__Group__0 )
            // InternalFPML.g:1394:4: rule__Apply__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Apply__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getApplyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleApply"


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
    // InternalFPML.g:1412:1: rulePrimitiveEffectFullFunction : ( rulePrimitivePrint ) ;
    public final void rulePrimitiveEffectFullFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1416:2: ( ( rulePrimitivePrint ) )
            // InternalFPML.g:1417:2: ( rulePrimitivePrint )
            {
            // InternalFPML.g:1417:2: ( rulePrimitivePrint )
            // InternalFPML.g:1418:3: rulePrimitivePrint
            {
             before(grammarAccess.getPrimitiveEffectFullFunctionAccess().getPrimitivePrintParserRuleCall()); 
            pushFollow(FOLLOW_2);
            rulePrimitivePrint();

            state._fsp--;

             after(grammarAccess.getPrimitiveEffectFullFunctionAccess().getPrimitivePrintParserRuleCall()); 

            }


            }

        }
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


    // $ANTLR start "rule__AdtType__Alternatives"
    // InternalFPML.g:1452:1: rule__AdtType__Alternatives : ( ( ruleValueType ) | ( ( rule__AdtType__Group_1__0 ) ) );
    public final void rule__AdtType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1456:1: ( ( ruleValueType ) | ( ( rule__AdtType__Group_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=32 && LA1_0<=33)||(LA1_0>=47 && LA1_0<=48)) ) {
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
                    // InternalFPML.g:1457:2: ( ruleValueType )
                    {
                    // InternalFPML.g:1457:2: ( ruleValueType )
                    // InternalFPML.g:1458:3: ruleValueType
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
                    // InternalFPML.g:1463:2: ( ( rule__AdtType__Group_1__0 ) )
                    {
                    // InternalFPML.g:1463:2: ( ( rule__AdtType__Group_1__0 ) )
                    // InternalFPML.g:1464:3: ( rule__AdtType__Group_1__0 )
                    {
                     before(grammarAccess.getAdtTypeAccess().getGroup_1()); 
                    // InternalFPML.g:1465:3: ( rule__AdtType__Group_1__0 )
                    // InternalFPML.g:1465:4: rule__AdtType__Group_1__0
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
    // InternalFPML.g:1473:1: rule__AdtType__AdtElement2Alternatives_1_2_0 : ( ( ruleSumType ) | ( ruleProdType ) );
    public final void rule__AdtType__AdtElement2Alternatives_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1477:1: ( ( ruleSumType ) | ( ruleProdType ) )
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
                    // InternalFPML.g:1478:2: ( ruleSumType )
                    {
                    // InternalFPML.g:1478:2: ( ruleSumType )
                    // InternalFPML.g:1479:3: ruleSumType
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
                    // InternalFPML.g:1484:2: ( ruleProdType )
                    {
                    // InternalFPML.g:1484:2: ( ruleProdType )
                    // InternalFPML.g:1485:3: ruleProdType
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
    // InternalFPML.g:1494:1: rule__FunctionBodyPure__Alternatives : ( ( ruleEmptyFunctionBody ) | ( ruleCompositionFunctionBodyPure ) );
    public final void rule__FunctionBodyPure__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1498:1: ( ( ruleEmptyFunctionBody ) | ( ruleCompositionFunctionBodyPure ) )
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
                    // InternalFPML.g:1499:2: ( ruleEmptyFunctionBody )
                    {
                    // InternalFPML.g:1499:2: ( ruleEmptyFunctionBody )
                    // InternalFPML.g:1500:3: ruleEmptyFunctionBody
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
                    // InternalFPML.g:1505:2: ( ruleCompositionFunctionBodyPure )
                    {
                    // InternalFPML.g:1505:2: ( ruleCompositionFunctionBodyPure )
                    // InternalFPML.g:1506:3: ruleCompositionFunctionBodyPure
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
    // InternalFPML.g:1515:1: rule__FunctionBodyEffectFull__Alternatives : ( ( ruleEmptyFunctionBody ) | ( ruleCompositionFunctionBodyEffect ) );
    public final void rule__FunctionBodyEffectFull__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1519:1: ( ( ruleEmptyFunctionBody ) | ( ruleCompositionFunctionBodyEffect ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==28) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID||LA4_0==46) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalFPML.g:1520:2: ( ruleEmptyFunctionBody )
                    {
                    // InternalFPML.g:1520:2: ( ruleEmptyFunctionBody )
                    // InternalFPML.g:1521:3: ruleEmptyFunctionBody
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
                    // InternalFPML.g:1526:2: ( ruleCompositionFunctionBodyEffect )
                    {
                    // InternalFPML.g:1526:2: ( ruleCompositionFunctionBodyEffect )
                    // InternalFPML.g:1527:3: ruleCompositionFunctionBodyEffect
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
    // InternalFPML.g:1536:1: rule__CompositionFunctionBodyPure__Alternatives : ( ( ( rule__CompositionFunctionBodyPure__Group_0__0 ) ) | ( ( rule__CompositionFunctionBodyPure__Group_1__0 ) ) );
    public final void rule__CompositionFunctionBodyPure__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1540:1: ( ( ( rule__CompositionFunctionBodyPure__Group_0__0 ) ) | ( ( rule__CompositionFunctionBodyPure__Group_1__0 ) ) )
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
                    // InternalFPML.g:1541:2: ( ( rule__CompositionFunctionBodyPure__Group_0__0 ) )
                    {
                    // InternalFPML.g:1541:2: ( ( rule__CompositionFunctionBodyPure__Group_0__0 ) )
                    // InternalFPML.g:1542:3: ( rule__CompositionFunctionBodyPure__Group_0__0 )
                    {
                     before(grammarAccess.getCompositionFunctionBodyPureAccess().getGroup_0()); 
                    // InternalFPML.g:1543:3: ( rule__CompositionFunctionBodyPure__Group_0__0 )
                    // InternalFPML.g:1543:4: rule__CompositionFunctionBodyPure__Group_0__0
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
                    // InternalFPML.g:1547:2: ( ( rule__CompositionFunctionBodyPure__Group_1__0 ) )
                    {
                    // InternalFPML.g:1547:2: ( ( rule__CompositionFunctionBodyPure__Group_1__0 ) )
                    // InternalFPML.g:1548:3: ( rule__CompositionFunctionBodyPure__Group_1__0 )
                    {
                     before(grammarAccess.getCompositionFunctionBodyPureAccess().getGroup_1()); 
                    // InternalFPML.g:1549:3: ( rule__CompositionFunctionBodyPure__Group_1__0 )
                    // InternalFPML.g:1549:4: rule__CompositionFunctionBodyPure__Group_1__0
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
    // InternalFPML.g:1557:1: rule__CompositionFunctionBodyPureFactor__Alternatives : ( ( ( rule__CompositionFunctionBodyPureFactor__Group_0__0 ) ) | ( ( rule__CompositionFunctionBodyPureFactor__Group_1__0 ) ) );
    public final void rule__CompositionFunctionBodyPureFactor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1561:1: ( ( ( rule__CompositionFunctionBodyPureFactor__Group_0__0 ) ) | ( ( rule__CompositionFunctionBodyPureFactor__Group_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==29) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==RULE_ID) ) {
                    alt6=1;
                }
                else if ( ((LA6_1>=21 && LA6_1<=22)||(LA6_1>=41 && LA6_1<=45)) ) {
                    alt6=2;
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
                    // InternalFPML.g:1562:2: ( ( rule__CompositionFunctionBodyPureFactor__Group_0__0 ) )
                    {
                    // InternalFPML.g:1562:2: ( ( rule__CompositionFunctionBodyPureFactor__Group_0__0 ) )
                    // InternalFPML.g:1563:3: ( rule__CompositionFunctionBodyPureFactor__Group_0__0 )
                    {
                     before(grammarAccess.getCompositionFunctionBodyPureFactorAccess().getGroup_0()); 
                    // InternalFPML.g:1564:3: ( rule__CompositionFunctionBodyPureFactor__Group_0__0 )
                    // InternalFPML.g:1564:4: rule__CompositionFunctionBodyPureFactor__Group_0__0
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
                    // InternalFPML.g:1568:2: ( ( rule__CompositionFunctionBodyPureFactor__Group_1__0 ) )
                    {
                    // InternalFPML.g:1568:2: ( ( rule__CompositionFunctionBodyPureFactor__Group_1__0 ) )
                    // InternalFPML.g:1569:3: ( rule__CompositionFunctionBodyPureFactor__Group_1__0 )
                    {
                     before(grammarAccess.getCompositionFunctionBodyPureFactorAccess().getGroup_1()); 
                    // InternalFPML.g:1570:3: ( rule__CompositionFunctionBodyPureFactor__Group_1__0 )
                    // InternalFPML.g:1570:4: rule__CompositionFunctionBodyPureFactor__Group_1__0
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
    // InternalFPML.g:1578:1: rule__CompositionFunctionBodyEffect__Alternatives : ( ( ( rule__CompositionFunctionBodyEffect__Group_0__0 ) ) | ( ( rule__CompositionFunctionBodyEffect__Group_1__0 ) ) );
    public final void rule__CompositionFunctionBodyEffect__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1582:1: ( ( ( rule__CompositionFunctionBodyEffect__Group_0__0 ) ) | ( ( rule__CompositionFunctionBodyEffect__Group_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            else if ( (LA7_0==46) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalFPML.g:1583:2: ( ( rule__CompositionFunctionBodyEffect__Group_0__0 ) )
                    {
                    // InternalFPML.g:1583:2: ( ( rule__CompositionFunctionBodyEffect__Group_0__0 ) )
                    // InternalFPML.g:1584:3: ( rule__CompositionFunctionBodyEffect__Group_0__0 )
                    {
                     before(grammarAccess.getCompositionFunctionBodyEffectAccess().getGroup_0()); 
                    // InternalFPML.g:1585:3: ( rule__CompositionFunctionBodyEffect__Group_0__0 )
                    // InternalFPML.g:1585:4: rule__CompositionFunctionBodyEffect__Group_0__0
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
                    // InternalFPML.g:1589:2: ( ( rule__CompositionFunctionBodyEffect__Group_1__0 ) )
                    {
                    // InternalFPML.g:1589:2: ( ( rule__CompositionFunctionBodyEffect__Group_1__0 ) )
                    // InternalFPML.g:1590:3: ( rule__CompositionFunctionBodyEffect__Group_1__0 )
                    {
                     before(grammarAccess.getCompositionFunctionBodyEffectAccess().getGroup_1()); 
                    // InternalFPML.g:1591:3: ( rule__CompositionFunctionBodyEffect__Group_1__0 )
                    // InternalFPML.g:1591:4: rule__CompositionFunctionBodyEffect__Group_1__0
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


    // $ANTLR start "rule__CompositionFunctionBodyEffectFullFactor__Alternatives"
    // InternalFPML.g:1599:1: rule__CompositionFunctionBodyEffectFullFactor__Alternatives : ( ( ( rule__CompositionFunctionBodyEffectFullFactor__Group_0__0 ) ) | ( ( rule__CompositionFunctionBodyEffectFullFactor__Group_1__0 ) ) );
    public final void rule__CompositionFunctionBodyEffectFullFactor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1603:1: ( ( ( rule__CompositionFunctionBodyEffectFullFactor__Group_0__0 ) ) | ( ( rule__CompositionFunctionBodyEffectFullFactor__Group_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==30) ) {
                int LA8_1 = input.LA(2);

                if ( ((LA8_1>=21 && LA8_1<=22)||(LA8_1>=41 && LA8_1<=46)) ) {
                    alt8=2;
                }
                else if ( (LA8_1==RULE_ID) ) {
                    alt8=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalFPML.g:1604:2: ( ( rule__CompositionFunctionBodyEffectFullFactor__Group_0__0 ) )
                    {
                    // InternalFPML.g:1604:2: ( ( rule__CompositionFunctionBodyEffectFullFactor__Group_0__0 ) )
                    // InternalFPML.g:1605:3: ( rule__CompositionFunctionBodyEffectFullFactor__Group_0__0 )
                    {
                     before(grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getGroup_0()); 
                    // InternalFPML.g:1606:3: ( rule__CompositionFunctionBodyEffectFullFactor__Group_0__0 )
                    // InternalFPML.g:1606:4: rule__CompositionFunctionBodyEffectFullFactor__Group_0__0
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
                    // InternalFPML.g:1610:2: ( ( rule__CompositionFunctionBodyEffectFullFactor__Group_1__0 ) )
                    {
                    // InternalFPML.g:1610:2: ( ( rule__CompositionFunctionBodyEffectFullFactor__Group_1__0 ) )
                    // InternalFPML.g:1611:3: ( rule__CompositionFunctionBodyEffectFullFactor__Group_1__0 )
                    {
                     before(grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getGroup_1()); 
                    // InternalFPML.g:1612:3: ( rule__CompositionFunctionBodyEffectFullFactor__Group_1__0 )
                    // InternalFPML.g:1612:4: rule__CompositionFunctionBodyEffectFullFactor__Group_1__0
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
    // InternalFPML.g:1620:1: rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAlternatives_1_1_0 : ( ( rulePrimitiveEffectFullFunction ) | ( rulePrimitivePureFunction ) );
    public final void rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1624:1: ( ( rulePrimitiveEffectFullFunction ) | ( rulePrimitivePureFunction ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==46) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=21 && LA9_0<=22)||(LA9_0>=41 && LA9_0<=45)) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalFPML.g:1625:2: ( rulePrimitiveEffectFullFunction )
                    {
                    // InternalFPML.g:1625:2: ( rulePrimitiveEffectFullFunction )
                    // InternalFPML.g:1626:3: rulePrimitiveEffectFullFunction
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
                    // InternalFPML.g:1631:2: ( rulePrimitivePureFunction )
                    {
                    // InternalFPML.g:1631:2: ( rulePrimitivePureFunction )
                    // InternalFPML.g:1632:3: rulePrimitivePureFunction
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
    // InternalFPML.g:1641:1: rule__ValueType__Alternatives : ( ( ruleIntegerType ) | ( ruleStringType ) | ( ruleDataType ) | ( rulePureFunctionType ) );
    public final void rule__ValueType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1645:1: ( ( ruleIntegerType ) | ( ruleStringType ) | ( ruleDataType ) | ( rulePureFunctionType ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt10=1;
                }
                break;
            case 48:
                {
                alt10=2;
                }
                break;
            case 32:
                {
                alt10=3;
                }
                break;
            case 33:
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
                    // InternalFPML.g:1646:2: ( ruleIntegerType )
                    {
                    // InternalFPML.g:1646:2: ( ruleIntegerType )
                    // InternalFPML.g:1647:3: ruleIntegerType
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
                    // InternalFPML.g:1652:2: ( ruleStringType )
                    {
                    // InternalFPML.g:1652:2: ( ruleStringType )
                    // InternalFPML.g:1653:3: ruleStringType
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
                    // InternalFPML.g:1658:2: ( ruleDataType )
                    {
                    // InternalFPML.g:1658:2: ( ruleDataType )
                    // InternalFPML.g:1659:3: ruleDataType
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
                    // InternalFPML.g:1664:2: ( rulePureFunctionType )
                    {
                    // InternalFPML.g:1664:2: ( rulePureFunctionType )
                    // InternalFPML.g:1665:3: rulePureFunctionType
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
    // InternalFPML.g:1674:1: rule__Type__Alternatives : ( ( ruleValueType ) | ( ruleUnitType ) | ( ruleEffectFullFunctionType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1678:1: ( ( ruleValueType ) | ( ruleUnitType ) | ( ruleEffectFullFunctionType ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 32:
            case 33:
            case 47:
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
            case 37:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalFPML.g:1679:2: ( ruleValueType )
                    {
                    // InternalFPML.g:1679:2: ( ruleValueType )
                    // InternalFPML.g:1680:3: ruleValueType
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
                    // InternalFPML.g:1685:2: ( ruleUnitType )
                    {
                    // InternalFPML.g:1685:2: ( ruleUnitType )
                    // InternalFPML.g:1686:3: ruleUnitType
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
                    // InternalFPML.g:1691:2: ( ruleEffectFullFunctionType )
                    {
                    // InternalFPML.g:1691:2: ( ruleEffectFullFunctionType )
                    // InternalFPML.g:1692:3: ruleEffectFullFunctionType
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
    // InternalFPML.g:1701:1: rule__Expression__Alternatives : ( ( ruleIntValue ) | ( ruleStringValue ) | ( ruleUnitValue ) | ( ruleDataValue ) | ( ruleFunctionValue ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1705:1: ( ( ruleIntValue ) | ( ruleStringValue ) | ( ruleUnitValue ) | ( ruleDataValue ) | ( ruleFunctionValue ) )
            int alt12=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt12=1;
                }
                break;
            case RULE_STRING:
                {
                alt12=2;
                }
                break;
            case 38:
                {
                alt12=3;
                }
                break;
            case RULE_ID:
                {
                alt12=4;
                }
                break;
            case 24:
                {
                alt12=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalFPML.g:1706:2: ( ruleIntValue )
                    {
                    // InternalFPML.g:1706:2: ( ruleIntValue )
                    // InternalFPML.g:1707:3: ruleIntValue
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
                    // InternalFPML.g:1712:2: ( ruleStringValue )
                    {
                    // InternalFPML.g:1712:2: ( ruleStringValue )
                    // InternalFPML.g:1713:3: ruleStringValue
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
                    // InternalFPML.g:1718:2: ( ruleUnitValue )
                    {
                    // InternalFPML.g:1718:2: ( ruleUnitValue )
                    // InternalFPML.g:1719:3: ruleUnitValue
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
                    // InternalFPML.g:1724:2: ( ruleDataValue )
                    {
                    // InternalFPML.g:1724:2: ( ruleDataValue )
                    // InternalFPML.g:1725:3: ruleDataValue
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
                    // InternalFPML.g:1730:2: ( ruleFunctionValue )
                    {
                    // InternalFPML.g:1730:2: ( ruleFunctionValue )
                    // InternalFPML.g:1731:3: ruleFunctionValue
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
    // InternalFPML.g:1740:1: rule__AdtValue__Alternatives : ( ( ruleIntValue ) | ( ruleStringValue ) | ( ruleValueRef ) | ( ruleDataValue ) | ( ruleSumValue ) | ( ruleFunctionValue ) | ( ruleProdValue ) );
    public final void rule__AdtValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1744:1: ( ( ruleIntValue ) | ( ruleStringValue ) | ( ruleValueRef ) | ( ruleDataValue ) | ( ruleSumValue ) | ( ruleFunctionValue ) | ( ruleProdValue ) )
            int alt13=7;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // InternalFPML.g:1745:2: ( ruleIntValue )
                    {
                    // InternalFPML.g:1745:2: ( ruleIntValue )
                    // InternalFPML.g:1746:3: ruleIntValue
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
                    // InternalFPML.g:1751:2: ( ruleStringValue )
                    {
                    // InternalFPML.g:1751:2: ( ruleStringValue )
                    // InternalFPML.g:1752:3: ruleStringValue
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
                    // InternalFPML.g:1757:2: ( ruleValueRef )
                    {
                    // InternalFPML.g:1757:2: ( ruleValueRef )
                    // InternalFPML.g:1758:3: ruleValueRef
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
                    // InternalFPML.g:1763:2: ( ruleDataValue )
                    {
                    // InternalFPML.g:1763:2: ( ruleDataValue )
                    // InternalFPML.g:1764:3: ruleDataValue
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
                    // InternalFPML.g:1769:2: ( ruleSumValue )
                    {
                    // InternalFPML.g:1769:2: ( ruleSumValue )
                    // InternalFPML.g:1770:3: ruleSumValue
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
                    // InternalFPML.g:1775:2: ( ruleFunctionValue )
                    {
                    // InternalFPML.g:1775:2: ( ruleFunctionValue )
                    // InternalFPML.g:1776:3: ruleFunctionValue
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
                    // InternalFPML.g:1781:2: ( ruleProdValue )
                    {
                    // InternalFPML.g:1781:2: ( ruleProdValue )
                    // InternalFPML.g:1782:3: ruleProdValue
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
    // InternalFPML.g:1791:1: rule__SumValue__Alternatives : ( ( ( rule__SumValue__Group_0__0 ) ) | ( ( rule__SumValue__Group_1__0 ) ) );
    public final void rule__SumValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1795:1: ( ( ( rule__SumValue__Group_0__0 ) ) | ( ( rule__SumValue__Group_1__0 ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==39) ) {
                alt14=1;
            }
            else if ( (LA14_0==40) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalFPML.g:1796:2: ( ( rule__SumValue__Group_0__0 ) )
                    {
                    // InternalFPML.g:1796:2: ( ( rule__SumValue__Group_0__0 ) )
                    // InternalFPML.g:1797:3: ( rule__SumValue__Group_0__0 )
                    {
                     before(grammarAccess.getSumValueAccess().getGroup_0()); 
                    // InternalFPML.g:1798:3: ( rule__SumValue__Group_0__0 )
                    // InternalFPML.g:1798:4: rule__SumValue__Group_0__0
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
                    // InternalFPML.g:1802:2: ( ( rule__SumValue__Group_1__0 ) )
                    {
                    // InternalFPML.g:1802:2: ( ( rule__SumValue__Group_1__0 ) )
                    // InternalFPML.g:1803:3: ( rule__SumValue__Group_1__0 )
                    {
                     before(grammarAccess.getSumValueAccess().getGroup_1()); 
                    // InternalFPML.g:1804:3: ( rule__SumValue__Group_1__0 )
                    // InternalFPML.g:1804:4: rule__SumValue__Group_1__0
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
    // InternalFPML.g:1812:1: rule__PrimitivePureFunction__Alternatives : ( ( ruleIntToString ) | ( ruleIntPow ) | ( rulePlus ) | ( ruleMinus ) | ( ruleTimes ) | ( ruleMod ) | ( ruleApply ) );
    public final void rule__PrimitivePureFunction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1816:1: ( ( ruleIntToString ) | ( ruleIntPow ) | ( rulePlus ) | ( ruleMinus ) | ( ruleTimes ) | ( ruleMod ) | ( ruleApply ) )
            int alt15=7;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt15=1;
                }
                break;
            case 42:
                {
                alt15=2;
                }
                break;
            case 21:
                {
                alt15=3;
                }
                break;
            case 43:
                {
                alt15=4;
                }
                break;
            case 22:
                {
                alt15=5;
                }
                break;
            case 44:
                {
                alt15=6;
                }
                break;
            case 45:
                {
                alt15=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalFPML.g:1817:2: ( ruleIntToString )
                    {
                    // InternalFPML.g:1817:2: ( ruleIntToString )
                    // InternalFPML.g:1818:3: ruleIntToString
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
                    // InternalFPML.g:1823:2: ( ruleIntPow )
                    {
                    // InternalFPML.g:1823:2: ( ruleIntPow )
                    // InternalFPML.g:1824:3: ruleIntPow
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
                    // InternalFPML.g:1829:2: ( rulePlus )
                    {
                    // InternalFPML.g:1829:2: ( rulePlus )
                    // InternalFPML.g:1830:3: rulePlus
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
                    // InternalFPML.g:1835:2: ( ruleMinus )
                    {
                    // InternalFPML.g:1835:2: ( ruleMinus )
                    // InternalFPML.g:1836:3: ruleMinus
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
                    // InternalFPML.g:1841:2: ( ruleTimes )
                    {
                    // InternalFPML.g:1841:2: ( ruleTimes )
                    // InternalFPML.g:1842:3: ruleTimes
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
                    // InternalFPML.g:1847:2: ( ruleMod )
                    {
                    // InternalFPML.g:1847:2: ( ruleMod )
                    // InternalFPML.g:1848:3: ruleMod
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
                    // InternalFPML.g:1853:2: ( ruleApply )
                    {
                    // InternalFPML.g:1853:2: ( ruleApply )
                    // InternalFPML.g:1854:3: ruleApply
                    {
                     before(grammarAccess.getPrimitivePureFunctionAccess().getApplyParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleApply();

                    state._fsp--;

                     after(grammarAccess.getPrimitivePureFunctionAccess().getApplyParserRuleCall_6()); 

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


    // $ANTLR start "rule__Model__Group__0"
    // InternalFPML.g:1863:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1867:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalFPML.g:1868:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalFPML.g:1875:1: rule__Model__Group__0__Impl : ( ( rule__Model__ElementsAssignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1879:1: ( ( ( rule__Model__ElementsAssignment_0 ) ) )
            // InternalFPML.g:1880:1: ( ( rule__Model__ElementsAssignment_0 ) )
            {
            // InternalFPML.g:1880:1: ( ( rule__Model__ElementsAssignment_0 ) )
            // InternalFPML.g:1881:2: ( rule__Model__ElementsAssignment_0 )
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_0()); 
            // InternalFPML.g:1882:2: ( rule__Model__ElementsAssignment_0 )
            // InternalFPML.g:1882:3: rule__Model__ElementsAssignment_0
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
    // InternalFPML.g:1890:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1894:1: ( rule__Model__Group__1__Impl )
            // InternalFPML.g:1895:2: rule__Model__Group__1__Impl
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
    // InternalFPML.g:1901:1: rule__Model__Group__1__Impl : ( ( rule__Model__ElementsAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1905:1: ( ( ( rule__Model__ElementsAssignment_1 ) ) )
            // InternalFPML.g:1906:1: ( ( rule__Model__ElementsAssignment_1 ) )
            {
            // InternalFPML.g:1906:1: ( ( rule__Model__ElementsAssignment_1 ) )
            // InternalFPML.g:1907:2: ( rule__Model__ElementsAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_1()); 
            // InternalFPML.g:1908:2: ( rule__Model__ElementsAssignment_1 )
            // InternalFPML.g:1908:3: rule__Model__ElementsAssignment_1
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
    // InternalFPML.g:1917:1: rule__PureBlock__Group__0 : rule__PureBlock__Group__0__Impl rule__PureBlock__Group__1 ;
    public final void rule__PureBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1921:1: ( rule__PureBlock__Group__0__Impl rule__PureBlock__Group__1 )
            // InternalFPML.g:1922:2: rule__PureBlock__Group__0__Impl rule__PureBlock__Group__1
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
    // InternalFPML.g:1929:1: rule__PureBlock__Group__0__Impl : ( 'Pure' ) ;
    public final void rule__PureBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1933:1: ( ( 'Pure' ) )
            // InternalFPML.g:1934:1: ( 'Pure' )
            {
            // InternalFPML.g:1934:1: ( 'Pure' )
            // InternalFPML.g:1935:2: 'Pure'
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
    // InternalFPML.g:1944:1: rule__PureBlock__Group__1 : rule__PureBlock__Group__1__Impl rule__PureBlock__Group__2 ;
    public final void rule__PureBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1948:1: ( rule__PureBlock__Group__1__Impl rule__PureBlock__Group__2 )
            // InternalFPML.g:1949:2: rule__PureBlock__Group__1__Impl rule__PureBlock__Group__2
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
    // InternalFPML.g:1956:1: rule__PureBlock__Group__1__Impl : ( '{' ) ;
    public final void rule__PureBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1960:1: ( ( '{' ) )
            // InternalFPML.g:1961:1: ( '{' )
            {
            // InternalFPML.g:1961:1: ( '{' )
            // InternalFPML.g:1962:2: '{'
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
    // InternalFPML.g:1971:1: rule__PureBlock__Group__2 : rule__PureBlock__Group__2__Impl rule__PureBlock__Group__3 ;
    public final void rule__PureBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1975:1: ( rule__PureBlock__Group__2__Impl rule__PureBlock__Group__3 )
            // InternalFPML.g:1976:2: rule__PureBlock__Group__2__Impl rule__PureBlock__Group__3
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
    // InternalFPML.g:1983:1: rule__PureBlock__Group__2__Impl : ( ( rule__PureBlock__ElementsAssignment_2 ) ) ;
    public final void rule__PureBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1987:1: ( ( ( rule__PureBlock__ElementsAssignment_2 ) ) )
            // InternalFPML.g:1988:1: ( ( rule__PureBlock__ElementsAssignment_2 ) )
            {
            // InternalFPML.g:1988:1: ( ( rule__PureBlock__ElementsAssignment_2 ) )
            // InternalFPML.g:1989:2: ( rule__PureBlock__ElementsAssignment_2 )
            {
             before(grammarAccess.getPureBlockAccess().getElementsAssignment_2()); 
            // InternalFPML.g:1990:2: ( rule__PureBlock__ElementsAssignment_2 )
            // InternalFPML.g:1990:3: rule__PureBlock__ElementsAssignment_2
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
    // InternalFPML.g:1998:1: rule__PureBlock__Group__3 : rule__PureBlock__Group__3__Impl rule__PureBlock__Group__4 ;
    public final void rule__PureBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2002:1: ( rule__PureBlock__Group__3__Impl rule__PureBlock__Group__4 )
            // InternalFPML.g:2003:2: rule__PureBlock__Group__3__Impl rule__PureBlock__Group__4
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
    // InternalFPML.g:2010:1: rule__PureBlock__Group__3__Impl : ( ( rule__PureBlock__ElementsAssignment_3 ) ) ;
    public final void rule__PureBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2014:1: ( ( ( rule__PureBlock__ElementsAssignment_3 ) ) )
            // InternalFPML.g:2015:1: ( ( rule__PureBlock__ElementsAssignment_3 ) )
            {
            // InternalFPML.g:2015:1: ( ( rule__PureBlock__ElementsAssignment_3 ) )
            // InternalFPML.g:2016:2: ( rule__PureBlock__ElementsAssignment_3 )
            {
             before(grammarAccess.getPureBlockAccess().getElementsAssignment_3()); 
            // InternalFPML.g:2017:2: ( rule__PureBlock__ElementsAssignment_3 )
            // InternalFPML.g:2017:3: rule__PureBlock__ElementsAssignment_3
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
    // InternalFPML.g:2025:1: rule__PureBlock__Group__4 : rule__PureBlock__Group__4__Impl ;
    public final void rule__PureBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2029:1: ( rule__PureBlock__Group__4__Impl )
            // InternalFPML.g:2030:2: rule__PureBlock__Group__4__Impl
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
    // InternalFPML.g:2036:1: rule__PureBlock__Group__4__Impl : ( '}' ) ;
    public final void rule__PureBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2040:1: ( ( '}' ) )
            // InternalFPML.g:2041:1: ( '}' )
            {
            // InternalFPML.g:2041:1: ( '}' )
            // InternalFPML.g:2042:2: '}'
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
    // InternalFPML.g:2052:1: rule__PureFunctionBlock__Group__0 : rule__PureFunctionBlock__Group__0__Impl rule__PureFunctionBlock__Group__1 ;
    public final void rule__PureFunctionBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2056:1: ( rule__PureFunctionBlock__Group__0__Impl rule__PureFunctionBlock__Group__1 )
            // InternalFPML.g:2057:2: rule__PureFunctionBlock__Group__0__Impl rule__PureFunctionBlock__Group__1
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
    // InternalFPML.g:2064:1: rule__PureFunctionBlock__Group__0__Impl : ( 'Functions' ) ;
    public final void rule__PureFunctionBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2068:1: ( ( 'Functions' ) )
            // InternalFPML.g:2069:1: ( 'Functions' )
            {
            // InternalFPML.g:2069:1: ( 'Functions' )
            // InternalFPML.g:2070:2: 'Functions'
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
    // InternalFPML.g:2079:1: rule__PureFunctionBlock__Group__1 : rule__PureFunctionBlock__Group__1__Impl rule__PureFunctionBlock__Group__2 ;
    public final void rule__PureFunctionBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2083:1: ( rule__PureFunctionBlock__Group__1__Impl rule__PureFunctionBlock__Group__2 )
            // InternalFPML.g:2084:2: rule__PureFunctionBlock__Group__1__Impl rule__PureFunctionBlock__Group__2
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
    // InternalFPML.g:2091:1: rule__PureFunctionBlock__Group__1__Impl : ( '{' ) ;
    public final void rule__PureFunctionBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2095:1: ( ( '{' ) )
            // InternalFPML.g:2096:1: ( '{' )
            {
            // InternalFPML.g:2096:1: ( '{' )
            // InternalFPML.g:2097:2: '{'
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
    // InternalFPML.g:2106:1: rule__PureFunctionBlock__Group__2 : rule__PureFunctionBlock__Group__2__Impl rule__PureFunctionBlock__Group__3 ;
    public final void rule__PureFunctionBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2110:1: ( rule__PureFunctionBlock__Group__2__Impl rule__PureFunctionBlock__Group__3 )
            // InternalFPML.g:2111:2: rule__PureFunctionBlock__Group__2__Impl rule__PureFunctionBlock__Group__3
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
    // InternalFPML.g:2118:1: rule__PureFunctionBlock__Group__2__Impl : ( ( rule__PureFunctionBlock__FeaturesAssignment_2 )* ) ;
    public final void rule__PureFunctionBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2122:1: ( ( ( rule__PureFunctionBlock__FeaturesAssignment_2 )* ) )
            // InternalFPML.g:2123:1: ( ( rule__PureFunctionBlock__FeaturesAssignment_2 )* )
            {
            // InternalFPML.g:2123:1: ( ( rule__PureFunctionBlock__FeaturesAssignment_2 )* )
            // InternalFPML.g:2124:2: ( rule__PureFunctionBlock__FeaturesAssignment_2 )*
            {
             before(grammarAccess.getPureFunctionBlockAccess().getFeaturesAssignment_2()); 
            // InternalFPML.g:2125:2: ( rule__PureFunctionBlock__FeaturesAssignment_2 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==23) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalFPML.g:2125:3: rule__PureFunctionBlock__FeaturesAssignment_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__PureFunctionBlock__FeaturesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalFPML.g:2133:1: rule__PureFunctionBlock__Group__3 : rule__PureFunctionBlock__Group__3__Impl ;
    public final void rule__PureFunctionBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2137:1: ( rule__PureFunctionBlock__Group__3__Impl )
            // InternalFPML.g:2138:2: rule__PureFunctionBlock__Group__3__Impl
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
    // InternalFPML.g:2144:1: rule__PureFunctionBlock__Group__3__Impl : ( '}' ) ;
    public final void rule__PureFunctionBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2148:1: ( ( '}' ) )
            // InternalFPML.g:2149:1: ( '}' )
            {
            // InternalFPML.g:2149:1: ( '}' )
            // InternalFPML.g:2150:2: '}'
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
    // InternalFPML.g:2160:1: rule__DataBlock__Group__0 : rule__DataBlock__Group__0__Impl rule__DataBlock__Group__1 ;
    public final void rule__DataBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2164:1: ( rule__DataBlock__Group__0__Impl rule__DataBlock__Group__1 )
            // InternalFPML.g:2165:2: rule__DataBlock__Group__0__Impl rule__DataBlock__Group__1
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
    // InternalFPML.g:2172:1: rule__DataBlock__Group__0__Impl : ( 'Data' ) ;
    public final void rule__DataBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2176:1: ( ( 'Data' ) )
            // InternalFPML.g:2177:1: ( 'Data' )
            {
            // InternalFPML.g:2177:1: ( 'Data' )
            // InternalFPML.g:2178:2: 'Data'
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
    // InternalFPML.g:2187:1: rule__DataBlock__Group__1 : rule__DataBlock__Group__1__Impl rule__DataBlock__Group__2 ;
    public final void rule__DataBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2191:1: ( rule__DataBlock__Group__1__Impl rule__DataBlock__Group__2 )
            // InternalFPML.g:2192:2: rule__DataBlock__Group__1__Impl rule__DataBlock__Group__2
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
    // InternalFPML.g:2199:1: rule__DataBlock__Group__1__Impl : ( '{' ) ;
    public final void rule__DataBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2203:1: ( ( '{' ) )
            // InternalFPML.g:2204:1: ( '{' )
            {
            // InternalFPML.g:2204:1: ( '{' )
            // InternalFPML.g:2205:2: '{'
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
    // InternalFPML.g:2214:1: rule__DataBlock__Group__2 : rule__DataBlock__Group__2__Impl rule__DataBlock__Group__3 ;
    public final void rule__DataBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2218:1: ( rule__DataBlock__Group__2__Impl rule__DataBlock__Group__3 )
            // InternalFPML.g:2219:2: rule__DataBlock__Group__2__Impl rule__DataBlock__Group__3
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
    // InternalFPML.g:2226:1: rule__DataBlock__Group__2__Impl : ( ( rule__DataBlock__ElementsAssignment_2 )* ) ;
    public final void rule__DataBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2230:1: ( ( ( rule__DataBlock__ElementsAssignment_2 )* ) )
            // InternalFPML.g:2231:1: ( ( rule__DataBlock__ElementsAssignment_2 )* )
            {
            // InternalFPML.g:2231:1: ( ( rule__DataBlock__ElementsAssignment_2 )* )
            // InternalFPML.g:2232:2: ( rule__DataBlock__ElementsAssignment_2 )*
            {
             before(grammarAccess.getDataBlockAccess().getElementsAssignment_2()); 
            // InternalFPML.g:2233:2: ( rule__DataBlock__ElementsAssignment_2 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalFPML.g:2233:3: rule__DataBlock__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__DataBlock__ElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalFPML.g:2241:1: rule__DataBlock__Group__3 : rule__DataBlock__Group__3__Impl rule__DataBlock__Group__4 ;
    public final void rule__DataBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2245:1: ( rule__DataBlock__Group__3__Impl rule__DataBlock__Group__4 )
            // InternalFPML.g:2246:2: rule__DataBlock__Group__3__Impl rule__DataBlock__Group__4
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
    // InternalFPML.g:2253:1: rule__DataBlock__Group__3__Impl : ( ( rule__DataBlock__ValueAssignment_3 ) ) ;
    public final void rule__DataBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2257:1: ( ( ( rule__DataBlock__ValueAssignment_3 ) ) )
            // InternalFPML.g:2258:1: ( ( rule__DataBlock__ValueAssignment_3 ) )
            {
            // InternalFPML.g:2258:1: ( ( rule__DataBlock__ValueAssignment_3 ) )
            // InternalFPML.g:2259:2: ( rule__DataBlock__ValueAssignment_3 )
            {
             before(grammarAccess.getDataBlockAccess().getValueAssignment_3()); 
            // InternalFPML.g:2260:2: ( rule__DataBlock__ValueAssignment_3 )
            // InternalFPML.g:2260:3: rule__DataBlock__ValueAssignment_3
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
    // InternalFPML.g:2268:1: rule__DataBlock__Group__4 : rule__DataBlock__Group__4__Impl ;
    public final void rule__DataBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2272:1: ( rule__DataBlock__Group__4__Impl )
            // InternalFPML.g:2273:2: rule__DataBlock__Group__4__Impl
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
    // InternalFPML.g:2279:1: rule__DataBlock__Group__4__Impl : ( '}' ) ;
    public final void rule__DataBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2283:1: ( ( '}' ) )
            // InternalFPML.g:2284:1: ( '}' )
            {
            // InternalFPML.g:2284:1: ( '}' )
            // InternalFPML.g:2285:2: '}'
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
    // InternalFPML.g:2295:1: rule__ValueBlock__Group__0 : rule__ValueBlock__Group__0__Impl rule__ValueBlock__Group__1 ;
    public final void rule__ValueBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2299:1: ( rule__ValueBlock__Group__0__Impl rule__ValueBlock__Group__1 )
            // InternalFPML.g:2300:2: rule__ValueBlock__Group__0__Impl rule__ValueBlock__Group__1
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
    // InternalFPML.g:2307:1: rule__ValueBlock__Group__0__Impl : ( 'Value' ) ;
    public final void rule__ValueBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2311:1: ( ( 'Value' ) )
            // InternalFPML.g:2312:1: ( 'Value' )
            {
            // InternalFPML.g:2312:1: ( 'Value' )
            // InternalFPML.g:2313:2: 'Value'
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
    // InternalFPML.g:2322:1: rule__ValueBlock__Group__1 : rule__ValueBlock__Group__1__Impl rule__ValueBlock__Group__2 ;
    public final void rule__ValueBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2326:1: ( rule__ValueBlock__Group__1__Impl rule__ValueBlock__Group__2 )
            // InternalFPML.g:2327:2: rule__ValueBlock__Group__1__Impl rule__ValueBlock__Group__2
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
    // InternalFPML.g:2334:1: rule__ValueBlock__Group__1__Impl : ( '{' ) ;
    public final void rule__ValueBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2338:1: ( ( '{' ) )
            // InternalFPML.g:2339:1: ( '{' )
            {
            // InternalFPML.g:2339:1: ( '{' )
            // InternalFPML.g:2340:2: '{'
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
    // InternalFPML.g:2349:1: rule__ValueBlock__Group__2 : rule__ValueBlock__Group__2__Impl rule__ValueBlock__Group__3 ;
    public final void rule__ValueBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2353:1: ( rule__ValueBlock__Group__2__Impl rule__ValueBlock__Group__3 )
            // InternalFPML.g:2354:2: rule__ValueBlock__Group__2__Impl rule__ValueBlock__Group__3
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
    // InternalFPML.g:2361:1: rule__ValueBlock__Group__2__Impl : ( ( rule__ValueBlock__ElementsAssignment_2 )* ) ;
    public final void rule__ValueBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2365:1: ( ( ( rule__ValueBlock__ElementsAssignment_2 )* ) )
            // InternalFPML.g:2366:1: ( ( rule__ValueBlock__ElementsAssignment_2 )* )
            {
            // InternalFPML.g:2366:1: ( ( rule__ValueBlock__ElementsAssignment_2 )* )
            // InternalFPML.g:2367:2: ( rule__ValueBlock__ElementsAssignment_2 )*
            {
             before(grammarAccess.getValueBlockAccess().getElementsAssignment_2()); 
            // InternalFPML.g:2368:2: ( rule__ValueBlock__ElementsAssignment_2 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalFPML.g:2368:3: rule__ValueBlock__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ValueBlock__ElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalFPML.g:2376:1: rule__ValueBlock__Group__3 : rule__ValueBlock__Group__3__Impl ;
    public final void rule__ValueBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2380:1: ( rule__ValueBlock__Group__3__Impl )
            // InternalFPML.g:2381:2: rule__ValueBlock__Group__3__Impl
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
    // InternalFPML.g:2387:1: rule__ValueBlock__Group__3__Impl : ( '}' ) ;
    public final void rule__ValueBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2391:1: ( ( '}' ) )
            // InternalFPML.g:2392:1: ( '}' )
            {
            // InternalFPML.g:2392:1: ( '}' )
            // InternalFPML.g:2393:2: '}'
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
    // InternalFPML.g:2403:1: rule__EffectFullBlock__Group__0 : rule__EffectFullBlock__Group__0__Impl rule__EffectFullBlock__Group__1 ;
    public final void rule__EffectFullBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2407:1: ( rule__EffectFullBlock__Group__0__Impl rule__EffectFullBlock__Group__1 )
            // InternalFPML.g:2408:2: rule__EffectFullBlock__Group__0__Impl rule__EffectFullBlock__Group__1
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
    // InternalFPML.g:2415:1: rule__EffectFullBlock__Group__0__Impl : ( 'Effects' ) ;
    public final void rule__EffectFullBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2419:1: ( ( 'Effects' ) )
            // InternalFPML.g:2420:1: ( 'Effects' )
            {
            // InternalFPML.g:2420:1: ( 'Effects' )
            // InternalFPML.g:2421:2: 'Effects'
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
    // InternalFPML.g:2430:1: rule__EffectFullBlock__Group__1 : rule__EffectFullBlock__Group__1__Impl rule__EffectFullBlock__Group__2 ;
    public final void rule__EffectFullBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2434:1: ( rule__EffectFullBlock__Group__1__Impl rule__EffectFullBlock__Group__2 )
            // InternalFPML.g:2435:2: rule__EffectFullBlock__Group__1__Impl rule__EffectFullBlock__Group__2
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
    // InternalFPML.g:2442:1: rule__EffectFullBlock__Group__1__Impl : ( '{' ) ;
    public final void rule__EffectFullBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2446:1: ( ( '{' ) )
            // InternalFPML.g:2447:1: ( '{' )
            {
            // InternalFPML.g:2447:1: ( '{' )
            // InternalFPML.g:2448:2: '{'
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
    // InternalFPML.g:2457:1: rule__EffectFullBlock__Group__2 : rule__EffectFullBlock__Group__2__Impl rule__EffectFullBlock__Group__3 ;
    public final void rule__EffectFullBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2461:1: ( rule__EffectFullBlock__Group__2__Impl rule__EffectFullBlock__Group__3 )
            // InternalFPML.g:2462:2: rule__EffectFullBlock__Group__2__Impl rule__EffectFullBlock__Group__3
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
    // InternalFPML.g:2469:1: rule__EffectFullBlock__Group__2__Impl : ( ( rule__EffectFullBlock__FeaturesAssignment_2 )* ) ;
    public final void rule__EffectFullBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2473:1: ( ( ( rule__EffectFullBlock__FeaturesAssignment_2 )* ) )
            // InternalFPML.g:2474:1: ( ( rule__EffectFullBlock__FeaturesAssignment_2 )* )
            {
            // InternalFPML.g:2474:1: ( ( rule__EffectFullBlock__FeaturesAssignment_2 )* )
            // InternalFPML.g:2475:2: ( rule__EffectFullBlock__FeaturesAssignment_2 )*
            {
             before(grammarAccess.getEffectFullBlockAccess().getFeaturesAssignment_2()); 
            // InternalFPML.g:2476:2: ( rule__EffectFullBlock__FeaturesAssignment_2 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==23) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalFPML.g:2476:3: rule__EffectFullBlock__FeaturesAssignment_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__EffectFullBlock__FeaturesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalFPML.g:2484:1: rule__EffectFullBlock__Group__3 : rule__EffectFullBlock__Group__3__Impl rule__EffectFullBlock__Group__4 ;
    public final void rule__EffectFullBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2488:1: ( rule__EffectFullBlock__Group__3__Impl rule__EffectFullBlock__Group__4 )
            // InternalFPML.g:2489:2: rule__EffectFullBlock__Group__3__Impl rule__EffectFullBlock__Group__4
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
    // InternalFPML.g:2496:1: rule__EffectFullBlock__Group__3__Impl : ( ( rule__EffectFullBlock__MainAssignment_3 ) ) ;
    public final void rule__EffectFullBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2500:1: ( ( ( rule__EffectFullBlock__MainAssignment_3 ) ) )
            // InternalFPML.g:2501:1: ( ( rule__EffectFullBlock__MainAssignment_3 ) )
            {
            // InternalFPML.g:2501:1: ( ( rule__EffectFullBlock__MainAssignment_3 ) )
            // InternalFPML.g:2502:2: ( rule__EffectFullBlock__MainAssignment_3 )
            {
             before(grammarAccess.getEffectFullBlockAccess().getMainAssignment_3()); 
            // InternalFPML.g:2503:2: ( rule__EffectFullBlock__MainAssignment_3 )
            // InternalFPML.g:2503:3: rule__EffectFullBlock__MainAssignment_3
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
    // InternalFPML.g:2511:1: rule__EffectFullBlock__Group__4 : rule__EffectFullBlock__Group__4__Impl ;
    public final void rule__EffectFullBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2515:1: ( rule__EffectFullBlock__Group__4__Impl )
            // InternalFPML.g:2516:2: rule__EffectFullBlock__Group__4__Impl
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
    // InternalFPML.g:2522:1: rule__EffectFullBlock__Group__4__Impl : ( '}' ) ;
    public final void rule__EffectFullBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2526:1: ( ( '}' ) )
            // InternalFPML.g:2527:1: ( '}' )
            {
            // InternalFPML.g:2527:1: ( '}' )
            // InternalFPML.g:2528:2: '}'
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
    // InternalFPML.g:2538:1: rule__Data__Group__0 : rule__Data__Group__0__Impl rule__Data__Group__1 ;
    public final void rule__Data__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2542:1: ( rule__Data__Group__0__Impl rule__Data__Group__1 )
            // InternalFPML.g:2543:2: rule__Data__Group__0__Impl rule__Data__Group__1
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
    // InternalFPML.g:2550:1: rule__Data__Group__0__Impl : ( ( rule__Data__NameAssignment_0 ) ) ;
    public final void rule__Data__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2554:1: ( ( ( rule__Data__NameAssignment_0 ) ) )
            // InternalFPML.g:2555:1: ( ( rule__Data__NameAssignment_0 ) )
            {
            // InternalFPML.g:2555:1: ( ( rule__Data__NameAssignment_0 ) )
            // InternalFPML.g:2556:2: ( rule__Data__NameAssignment_0 )
            {
             before(grammarAccess.getDataAccess().getNameAssignment_0()); 
            // InternalFPML.g:2557:2: ( rule__Data__NameAssignment_0 )
            // InternalFPML.g:2557:3: rule__Data__NameAssignment_0
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
    // InternalFPML.g:2565:1: rule__Data__Group__1 : rule__Data__Group__1__Impl rule__Data__Group__2 ;
    public final void rule__Data__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2569:1: ( rule__Data__Group__1__Impl rule__Data__Group__2 )
            // InternalFPML.g:2570:2: rule__Data__Group__1__Impl rule__Data__Group__2
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
    // InternalFPML.g:2577:1: rule__Data__Group__1__Impl : ( ':' ) ;
    public final void rule__Data__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2581:1: ( ( ':' ) )
            // InternalFPML.g:2582:1: ( ':' )
            {
            // InternalFPML.g:2582:1: ( ':' )
            // InternalFPML.g:2583:2: ':'
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
    // InternalFPML.g:2592:1: rule__Data__Group__2 : rule__Data__Group__2__Impl ;
    public final void rule__Data__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2596:1: ( rule__Data__Group__2__Impl )
            // InternalFPML.g:2597:2: rule__Data__Group__2__Impl
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
    // InternalFPML.g:2603:1: rule__Data__Group__2__Impl : ( ( rule__Data__ContentAssignment_2 ) ) ;
    public final void rule__Data__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2607:1: ( ( ( rule__Data__ContentAssignment_2 ) ) )
            // InternalFPML.g:2608:1: ( ( rule__Data__ContentAssignment_2 ) )
            {
            // InternalFPML.g:2608:1: ( ( rule__Data__ContentAssignment_2 ) )
            // InternalFPML.g:2609:2: ( rule__Data__ContentAssignment_2 )
            {
             before(grammarAccess.getDataAccess().getContentAssignment_2()); 
            // InternalFPML.g:2610:2: ( rule__Data__ContentAssignment_2 )
            // InternalFPML.g:2610:3: rule__Data__ContentAssignment_2
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
    // InternalFPML.g:2619:1: rule__Value__Group__0 : rule__Value__Group__0__Impl rule__Value__Group__1 ;
    public final void rule__Value__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2623:1: ( rule__Value__Group__0__Impl rule__Value__Group__1 )
            // InternalFPML.g:2624:2: rule__Value__Group__0__Impl rule__Value__Group__1
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
    // InternalFPML.g:2631:1: rule__Value__Group__0__Impl : ( ( rule__Value__NameAssignment_0 ) ) ;
    public final void rule__Value__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2635:1: ( ( ( rule__Value__NameAssignment_0 ) ) )
            // InternalFPML.g:2636:1: ( ( rule__Value__NameAssignment_0 ) )
            {
            // InternalFPML.g:2636:1: ( ( rule__Value__NameAssignment_0 ) )
            // InternalFPML.g:2637:2: ( rule__Value__NameAssignment_0 )
            {
             before(grammarAccess.getValueAccess().getNameAssignment_0()); 
            // InternalFPML.g:2638:2: ( rule__Value__NameAssignment_0 )
            // InternalFPML.g:2638:3: rule__Value__NameAssignment_0
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
    // InternalFPML.g:2646:1: rule__Value__Group__1 : rule__Value__Group__1__Impl rule__Value__Group__2 ;
    public final void rule__Value__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2650:1: ( rule__Value__Group__1__Impl rule__Value__Group__2 )
            // InternalFPML.g:2651:2: rule__Value__Group__1__Impl rule__Value__Group__2
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
    // InternalFPML.g:2658:1: rule__Value__Group__1__Impl : ( ':' ) ;
    public final void rule__Value__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2662:1: ( ( ':' ) )
            // InternalFPML.g:2663:1: ( ':' )
            {
            // InternalFPML.g:2663:1: ( ':' )
            // InternalFPML.g:2664:2: ':'
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
    // InternalFPML.g:2673:1: rule__Value__Group__2 : rule__Value__Group__2__Impl ;
    public final void rule__Value__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2677:1: ( rule__Value__Group__2__Impl )
            // InternalFPML.g:2678:2: rule__Value__Group__2__Impl
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
    // InternalFPML.g:2684:1: rule__Value__Group__2__Impl : ( ( rule__Value__ValueAssignment_2 ) ) ;
    public final void rule__Value__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2688:1: ( ( ( rule__Value__ValueAssignment_2 ) ) )
            // InternalFPML.g:2689:1: ( ( rule__Value__ValueAssignment_2 ) )
            {
            // InternalFPML.g:2689:1: ( ( rule__Value__ValueAssignment_2 ) )
            // InternalFPML.g:2690:2: ( rule__Value__ValueAssignment_2 )
            {
             before(grammarAccess.getValueAccess().getValueAssignment_2()); 
            // InternalFPML.g:2691:2: ( rule__Value__ValueAssignment_2 )
            // InternalFPML.g:2691:3: rule__Value__ValueAssignment_2
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
    // InternalFPML.g:2700:1: rule__AdtType__Group_1__0 : rule__AdtType__Group_1__0__Impl rule__AdtType__Group_1__1 ;
    public final void rule__AdtType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2704:1: ( rule__AdtType__Group_1__0__Impl rule__AdtType__Group_1__1 )
            // InternalFPML.g:2705:2: rule__AdtType__Group_1__0__Impl rule__AdtType__Group_1__1
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
    // InternalFPML.g:2712:1: rule__AdtType__Group_1__0__Impl : ( '[' ) ;
    public final void rule__AdtType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2716:1: ( ( '[' ) )
            // InternalFPML.g:2717:1: ( '[' )
            {
            // InternalFPML.g:2717:1: ( '[' )
            // InternalFPML.g:2718:2: '['
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
    // InternalFPML.g:2727:1: rule__AdtType__Group_1__1 : rule__AdtType__Group_1__1__Impl rule__AdtType__Group_1__2 ;
    public final void rule__AdtType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2731:1: ( rule__AdtType__Group_1__1__Impl rule__AdtType__Group_1__2 )
            // InternalFPML.g:2732:2: rule__AdtType__Group_1__1__Impl rule__AdtType__Group_1__2
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
    // InternalFPML.g:2739:1: rule__AdtType__Group_1__1__Impl : ( ( rule__AdtType__AdtElement1Assignment_1_1 ) ) ;
    public final void rule__AdtType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2743:1: ( ( ( rule__AdtType__AdtElement1Assignment_1_1 ) ) )
            // InternalFPML.g:2744:1: ( ( rule__AdtType__AdtElement1Assignment_1_1 ) )
            {
            // InternalFPML.g:2744:1: ( ( rule__AdtType__AdtElement1Assignment_1_1 ) )
            // InternalFPML.g:2745:2: ( rule__AdtType__AdtElement1Assignment_1_1 )
            {
             before(grammarAccess.getAdtTypeAccess().getAdtElement1Assignment_1_1()); 
            // InternalFPML.g:2746:2: ( rule__AdtType__AdtElement1Assignment_1_1 )
            // InternalFPML.g:2746:3: rule__AdtType__AdtElement1Assignment_1_1
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
    // InternalFPML.g:2754:1: rule__AdtType__Group_1__2 : rule__AdtType__Group_1__2__Impl rule__AdtType__Group_1__3 ;
    public final void rule__AdtType__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2758:1: ( rule__AdtType__Group_1__2__Impl rule__AdtType__Group_1__3 )
            // InternalFPML.g:2759:2: rule__AdtType__Group_1__2__Impl rule__AdtType__Group_1__3
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
    // InternalFPML.g:2766:1: rule__AdtType__Group_1__2__Impl : ( ( rule__AdtType__AdtElement2Assignment_1_2 ) ) ;
    public final void rule__AdtType__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2770:1: ( ( ( rule__AdtType__AdtElement2Assignment_1_2 ) ) )
            // InternalFPML.g:2771:1: ( ( rule__AdtType__AdtElement2Assignment_1_2 ) )
            {
            // InternalFPML.g:2771:1: ( ( rule__AdtType__AdtElement2Assignment_1_2 ) )
            // InternalFPML.g:2772:2: ( rule__AdtType__AdtElement2Assignment_1_2 )
            {
             before(grammarAccess.getAdtTypeAccess().getAdtElement2Assignment_1_2()); 
            // InternalFPML.g:2773:2: ( rule__AdtType__AdtElement2Assignment_1_2 )
            // InternalFPML.g:2773:3: rule__AdtType__AdtElement2Assignment_1_2
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
    // InternalFPML.g:2781:1: rule__AdtType__Group_1__3 : rule__AdtType__Group_1__3__Impl ;
    public final void rule__AdtType__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2785:1: ( rule__AdtType__Group_1__3__Impl )
            // InternalFPML.g:2786:2: rule__AdtType__Group_1__3__Impl
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
    // InternalFPML.g:2792:1: rule__AdtType__Group_1__3__Impl : ( ']' ) ;
    public final void rule__AdtType__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2796:1: ( ( ']' ) )
            // InternalFPML.g:2797:1: ( ']' )
            {
            // InternalFPML.g:2797:1: ( ']' )
            // InternalFPML.g:2798:2: ']'
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
    // InternalFPML.g:2808:1: rule__SumType__Group__0 : rule__SumType__Group__0__Impl rule__SumType__Group__1 ;
    public final void rule__SumType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2812:1: ( rule__SumType__Group__0__Impl rule__SumType__Group__1 )
            // InternalFPML.g:2813:2: rule__SumType__Group__0__Impl rule__SumType__Group__1
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
    // InternalFPML.g:2820:1: rule__SumType__Group__0__Impl : ( '+' ) ;
    public final void rule__SumType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2824:1: ( ( '+' ) )
            // InternalFPML.g:2825:1: ( '+' )
            {
            // InternalFPML.g:2825:1: ( '+' )
            // InternalFPML.g:2826:2: '+'
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
    // InternalFPML.g:2835:1: rule__SumType__Group__1 : rule__SumType__Group__1__Impl ;
    public final void rule__SumType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2839:1: ( rule__SumType__Group__1__Impl )
            // InternalFPML.g:2840:2: rule__SumType__Group__1__Impl
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
    // InternalFPML.g:2846:1: rule__SumType__Group__1__Impl : ( ( rule__SumType__AdtElementAssignment_1 ) ) ;
    public final void rule__SumType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2850:1: ( ( ( rule__SumType__AdtElementAssignment_1 ) ) )
            // InternalFPML.g:2851:1: ( ( rule__SumType__AdtElementAssignment_1 ) )
            {
            // InternalFPML.g:2851:1: ( ( rule__SumType__AdtElementAssignment_1 ) )
            // InternalFPML.g:2852:2: ( rule__SumType__AdtElementAssignment_1 )
            {
             before(grammarAccess.getSumTypeAccess().getAdtElementAssignment_1()); 
            // InternalFPML.g:2853:2: ( rule__SumType__AdtElementAssignment_1 )
            // InternalFPML.g:2853:3: rule__SumType__AdtElementAssignment_1
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
    // InternalFPML.g:2862:1: rule__ProdType__Group__0 : rule__ProdType__Group__0__Impl rule__ProdType__Group__1 ;
    public final void rule__ProdType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2866:1: ( rule__ProdType__Group__0__Impl rule__ProdType__Group__1 )
            // InternalFPML.g:2867:2: rule__ProdType__Group__0__Impl rule__ProdType__Group__1
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
    // InternalFPML.g:2874:1: rule__ProdType__Group__0__Impl : ( '*' ) ;
    public final void rule__ProdType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2878:1: ( ( '*' ) )
            // InternalFPML.g:2879:1: ( '*' )
            {
            // InternalFPML.g:2879:1: ( '*' )
            // InternalFPML.g:2880:2: '*'
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
    // InternalFPML.g:2889:1: rule__ProdType__Group__1 : rule__ProdType__Group__1__Impl ;
    public final void rule__ProdType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2893:1: ( rule__ProdType__Group__1__Impl )
            // InternalFPML.g:2894:2: rule__ProdType__Group__1__Impl
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
    // InternalFPML.g:2900:1: rule__ProdType__Group__1__Impl : ( ( rule__ProdType__AdtElementAssignment_1 ) ) ;
    public final void rule__ProdType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2904:1: ( ( ( rule__ProdType__AdtElementAssignment_1 ) ) )
            // InternalFPML.g:2905:1: ( ( rule__ProdType__AdtElementAssignment_1 ) )
            {
            // InternalFPML.g:2905:1: ( ( rule__ProdType__AdtElementAssignment_1 ) )
            // InternalFPML.g:2906:2: ( rule__ProdType__AdtElementAssignment_1 )
            {
             before(grammarAccess.getProdTypeAccess().getAdtElementAssignment_1()); 
            // InternalFPML.g:2907:2: ( rule__ProdType__AdtElementAssignment_1 )
            // InternalFPML.g:2907:3: rule__ProdType__AdtElementAssignment_1
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
    // InternalFPML.g:2916:1: rule__PureFunctionDefinition__Group__0 : rule__PureFunctionDefinition__Group__0__Impl rule__PureFunctionDefinition__Group__1 ;
    public final void rule__PureFunctionDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2920:1: ( rule__PureFunctionDefinition__Group__0__Impl rule__PureFunctionDefinition__Group__1 )
            // InternalFPML.g:2921:2: rule__PureFunctionDefinition__Group__0__Impl rule__PureFunctionDefinition__Group__1
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
    // InternalFPML.g:2928:1: rule__PureFunctionDefinition__Group__0__Impl : ( 'def' ) ;
    public final void rule__PureFunctionDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2932:1: ( ( 'def' ) )
            // InternalFPML.g:2933:1: ( 'def' )
            {
            // InternalFPML.g:2933:1: ( 'def' )
            // InternalFPML.g:2934:2: 'def'
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
    // InternalFPML.g:2943:1: rule__PureFunctionDefinition__Group__1 : rule__PureFunctionDefinition__Group__1__Impl rule__PureFunctionDefinition__Group__2 ;
    public final void rule__PureFunctionDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2947:1: ( rule__PureFunctionDefinition__Group__1__Impl rule__PureFunctionDefinition__Group__2 )
            // InternalFPML.g:2948:2: rule__PureFunctionDefinition__Group__1__Impl rule__PureFunctionDefinition__Group__2
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
    // InternalFPML.g:2955:1: rule__PureFunctionDefinition__Group__1__Impl : ( ( rule__PureFunctionDefinition__ReturnTypeAssignment_1 ) ) ;
    public final void rule__PureFunctionDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2959:1: ( ( ( rule__PureFunctionDefinition__ReturnTypeAssignment_1 ) ) )
            // InternalFPML.g:2960:1: ( ( rule__PureFunctionDefinition__ReturnTypeAssignment_1 ) )
            {
            // InternalFPML.g:2960:1: ( ( rule__PureFunctionDefinition__ReturnTypeAssignment_1 ) )
            // InternalFPML.g:2961:2: ( rule__PureFunctionDefinition__ReturnTypeAssignment_1 )
            {
             before(grammarAccess.getPureFunctionDefinitionAccess().getReturnTypeAssignment_1()); 
            // InternalFPML.g:2962:2: ( rule__PureFunctionDefinition__ReturnTypeAssignment_1 )
            // InternalFPML.g:2962:3: rule__PureFunctionDefinition__ReturnTypeAssignment_1
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
    // InternalFPML.g:2970:1: rule__PureFunctionDefinition__Group__2 : rule__PureFunctionDefinition__Group__2__Impl rule__PureFunctionDefinition__Group__3 ;
    public final void rule__PureFunctionDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2974:1: ( rule__PureFunctionDefinition__Group__2__Impl rule__PureFunctionDefinition__Group__3 )
            // InternalFPML.g:2975:2: rule__PureFunctionDefinition__Group__2__Impl rule__PureFunctionDefinition__Group__3
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
    // InternalFPML.g:2982:1: rule__PureFunctionDefinition__Group__2__Impl : ( ( rule__PureFunctionDefinition__NameAssignment_2 ) ) ;
    public final void rule__PureFunctionDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2986:1: ( ( ( rule__PureFunctionDefinition__NameAssignment_2 ) ) )
            // InternalFPML.g:2987:1: ( ( rule__PureFunctionDefinition__NameAssignment_2 ) )
            {
            // InternalFPML.g:2987:1: ( ( rule__PureFunctionDefinition__NameAssignment_2 ) )
            // InternalFPML.g:2988:2: ( rule__PureFunctionDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getPureFunctionDefinitionAccess().getNameAssignment_2()); 
            // InternalFPML.g:2989:2: ( rule__PureFunctionDefinition__NameAssignment_2 )
            // InternalFPML.g:2989:3: rule__PureFunctionDefinition__NameAssignment_2
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
    // InternalFPML.g:2997:1: rule__PureFunctionDefinition__Group__3 : rule__PureFunctionDefinition__Group__3__Impl rule__PureFunctionDefinition__Group__4 ;
    public final void rule__PureFunctionDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3001:1: ( rule__PureFunctionDefinition__Group__3__Impl rule__PureFunctionDefinition__Group__4 )
            // InternalFPML.g:3002:2: rule__PureFunctionDefinition__Group__3__Impl rule__PureFunctionDefinition__Group__4
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
    // InternalFPML.g:3009:1: rule__PureFunctionDefinition__Group__3__Impl : ( '(' ) ;
    public final void rule__PureFunctionDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3013:1: ( ( '(' ) )
            // InternalFPML.g:3014:1: ( '(' )
            {
            // InternalFPML.g:3014:1: ( '(' )
            // InternalFPML.g:3015:2: '('
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
    // InternalFPML.g:3024:1: rule__PureFunctionDefinition__Group__4 : rule__PureFunctionDefinition__Group__4__Impl rule__PureFunctionDefinition__Group__5 ;
    public final void rule__PureFunctionDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3028:1: ( rule__PureFunctionDefinition__Group__4__Impl rule__PureFunctionDefinition__Group__5 )
            // InternalFPML.g:3029:2: rule__PureFunctionDefinition__Group__4__Impl rule__PureFunctionDefinition__Group__5
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
    // InternalFPML.g:3036:1: rule__PureFunctionDefinition__Group__4__Impl : ( ( rule__PureFunctionDefinition__ArgAssignment_4 ) ) ;
    public final void rule__PureFunctionDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3040:1: ( ( ( rule__PureFunctionDefinition__ArgAssignment_4 ) ) )
            // InternalFPML.g:3041:1: ( ( rule__PureFunctionDefinition__ArgAssignment_4 ) )
            {
            // InternalFPML.g:3041:1: ( ( rule__PureFunctionDefinition__ArgAssignment_4 ) )
            // InternalFPML.g:3042:2: ( rule__PureFunctionDefinition__ArgAssignment_4 )
            {
             before(grammarAccess.getPureFunctionDefinitionAccess().getArgAssignment_4()); 
            // InternalFPML.g:3043:2: ( rule__PureFunctionDefinition__ArgAssignment_4 )
            // InternalFPML.g:3043:3: rule__PureFunctionDefinition__ArgAssignment_4
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
    // InternalFPML.g:3051:1: rule__PureFunctionDefinition__Group__5 : rule__PureFunctionDefinition__Group__5__Impl rule__PureFunctionDefinition__Group__6 ;
    public final void rule__PureFunctionDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3055:1: ( rule__PureFunctionDefinition__Group__5__Impl rule__PureFunctionDefinition__Group__6 )
            // InternalFPML.g:3056:2: rule__PureFunctionDefinition__Group__5__Impl rule__PureFunctionDefinition__Group__6
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
    // InternalFPML.g:3063:1: rule__PureFunctionDefinition__Group__5__Impl : ( ')' ) ;
    public final void rule__PureFunctionDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3067:1: ( ( ')' ) )
            // InternalFPML.g:3068:1: ( ')' )
            {
            // InternalFPML.g:3068:1: ( ')' )
            // InternalFPML.g:3069:2: ')'
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
    // InternalFPML.g:3078:1: rule__PureFunctionDefinition__Group__6 : rule__PureFunctionDefinition__Group__6__Impl rule__PureFunctionDefinition__Group__7 ;
    public final void rule__PureFunctionDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3082:1: ( rule__PureFunctionDefinition__Group__6__Impl rule__PureFunctionDefinition__Group__7 )
            // InternalFPML.g:3083:2: rule__PureFunctionDefinition__Group__6__Impl rule__PureFunctionDefinition__Group__7
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
    // InternalFPML.g:3090:1: rule__PureFunctionDefinition__Group__6__Impl : ( ':' ) ;
    public final void rule__PureFunctionDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3094:1: ( ( ':' ) )
            // InternalFPML.g:3095:1: ( ':' )
            {
            // InternalFPML.g:3095:1: ( ':' )
            // InternalFPML.g:3096:2: ':'
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
    // InternalFPML.g:3105:1: rule__PureFunctionDefinition__Group__7 : rule__PureFunctionDefinition__Group__7__Impl rule__PureFunctionDefinition__Group__8 ;
    public final void rule__PureFunctionDefinition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3109:1: ( rule__PureFunctionDefinition__Group__7__Impl rule__PureFunctionDefinition__Group__8 )
            // InternalFPML.g:3110:2: rule__PureFunctionDefinition__Group__7__Impl rule__PureFunctionDefinition__Group__8
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
    // InternalFPML.g:3117:1: rule__PureFunctionDefinition__Group__7__Impl : ( '{' ) ;
    public final void rule__PureFunctionDefinition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3121:1: ( ( '{' ) )
            // InternalFPML.g:3122:1: ( '{' )
            {
            // InternalFPML.g:3122:1: ( '{' )
            // InternalFPML.g:3123:2: '{'
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
    // InternalFPML.g:3132:1: rule__PureFunctionDefinition__Group__8 : rule__PureFunctionDefinition__Group__8__Impl rule__PureFunctionDefinition__Group__9 ;
    public final void rule__PureFunctionDefinition__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3136:1: ( rule__PureFunctionDefinition__Group__8__Impl rule__PureFunctionDefinition__Group__9 )
            // InternalFPML.g:3137:2: rule__PureFunctionDefinition__Group__8__Impl rule__PureFunctionDefinition__Group__9
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
    // InternalFPML.g:3144:1: rule__PureFunctionDefinition__Group__8__Impl : ( ( rule__PureFunctionDefinition__FunctionBodyAssignment_8 ) ) ;
    public final void rule__PureFunctionDefinition__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3148:1: ( ( ( rule__PureFunctionDefinition__FunctionBodyAssignment_8 ) ) )
            // InternalFPML.g:3149:1: ( ( rule__PureFunctionDefinition__FunctionBodyAssignment_8 ) )
            {
            // InternalFPML.g:3149:1: ( ( rule__PureFunctionDefinition__FunctionBodyAssignment_8 ) )
            // InternalFPML.g:3150:2: ( rule__PureFunctionDefinition__FunctionBodyAssignment_8 )
            {
             before(grammarAccess.getPureFunctionDefinitionAccess().getFunctionBodyAssignment_8()); 
            // InternalFPML.g:3151:2: ( rule__PureFunctionDefinition__FunctionBodyAssignment_8 )
            // InternalFPML.g:3151:3: rule__PureFunctionDefinition__FunctionBodyAssignment_8
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
    // InternalFPML.g:3159:1: rule__PureFunctionDefinition__Group__9 : rule__PureFunctionDefinition__Group__9__Impl ;
    public final void rule__PureFunctionDefinition__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3163:1: ( rule__PureFunctionDefinition__Group__9__Impl )
            // InternalFPML.g:3164:2: rule__PureFunctionDefinition__Group__9__Impl
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
    // InternalFPML.g:3170:1: rule__PureFunctionDefinition__Group__9__Impl : ( '}' ) ;
    public final void rule__PureFunctionDefinition__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3174:1: ( ( '}' ) )
            // InternalFPML.g:3175:1: ( '}' )
            {
            // InternalFPML.g:3175:1: ( '}' )
            // InternalFPML.g:3176:2: '}'
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
    // InternalFPML.g:3186:1: rule__EffectFullFunctionDefinition__Group__0 : rule__EffectFullFunctionDefinition__Group__0__Impl rule__EffectFullFunctionDefinition__Group__1 ;
    public final void rule__EffectFullFunctionDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3190:1: ( rule__EffectFullFunctionDefinition__Group__0__Impl rule__EffectFullFunctionDefinition__Group__1 )
            // InternalFPML.g:3191:2: rule__EffectFullFunctionDefinition__Group__0__Impl rule__EffectFullFunctionDefinition__Group__1
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
    // InternalFPML.g:3198:1: rule__EffectFullFunctionDefinition__Group__0__Impl : ( 'def' ) ;
    public final void rule__EffectFullFunctionDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3202:1: ( ( 'def' ) )
            // InternalFPML.g:3203:1: ( 'def' )
            {
            // InternalFPML.g:3203:1: ( 'def' )
            // InternalFPML.g:3204:2: 'def'
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
    // InternalFPML.g:3213:1: rule__EffectFullFunctionDefinition__Group__1 : rule__EffectFullFunctionDefinition__Group__1__Impl rule__EffectFullFunctionDefinition__Group__2 ;
    public final void rule__EffectFullFunctionDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3217:1: ( rule__EffectFullFunctionDefinition__Group__1__Impl rule__EffectFullFunctionDefinition__Group__2 )
            // InternalFPML.g:3218:2: rule__EffectFullFunctionDefinition__Group__1__Impl rule__EffectFullFunctionDefinition__Group__2
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
    // InternalFPML.g:3225:1: rule__EffectFullFunctionDefinition__Group__1__Impl : ( ( rule__EffectFullFunctionDefinition__ReturnTypeAssignment_1 ) ) ;
    public final void rule__EffectFullFunctionDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3229:1: ( ( ( rule__EffectFullFunctionDefinition__ReturnTypeAssignment_1 ) ) )
            // InternalFPML.g:3230:1: ( ( rule__EffectFullFunctionDefinition__ReturnTypeAssignment_1 ) )
            {
            // InternalFPML.g:3230:1: ( ( rule__EffectFullFunctionDefinition__ReturnTypeAssignment_1 ) )
            // InternalFPML.g:3231:2: ( rule__EffectFullFunctionDefinition__ReturnTypeAssignment_1 )
            {
             before(grammarAccess.getEffectFullFunctionDefinitionAccess().getReturnTypeAssignment_1()); 
            // InternalFPML.g:3232:2: ( rule__EffectFullFunctionDefinition__ReturnTypeAssignment_1 )
            // InternalFPML.g:3232:3: rule__EffectFullFunctionDefinition__ReturnTypeAssignment_1
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
    // InternalFPML.g:3240:1: rule__EffectFullFunctionDefinition__Group__2 : rule__EffectFullFunctionDefinition__Group__2__Impl rule__EffectFullFunctionDefinition__Group__3 ;
    public final void rule__EffectFullFunctionDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3244:1: ( rule__EffectFullFunctionDefinition__Group__2__Impl rule__EffectFullFunctionDefinition__Group__3 )
            // InternalFPML.g:3245:2: rule__EffectFullFunctionDefinition__Group__2__Impl rule__EffectFullFunctionDefinition__Group__3
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
    // InternalFPML.g:3252:1: rule__EffectFullFunctionDefinition__Group__2__Impl : ( ( rule__EffectFullFunctionDefinition__NameAssignment_2 ) ) ;
    public final void rule__EffectFullFunctionDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3256:1: ( ( ( rule__EffectFullFunctionDefinition__NameAssignment_2 ) ) )
            // InternalFPML.g:3257:1: ( ( rule__EffectFullFunctionDefinition__NameAssignment_2 ) )
            {
            // InternalFPML.g:3257:1: ( ( rule__EffectFullFunctionDefinition__NameAssignment_2 ) )
            // InternalFPML.g:3258:2: ( rule__EffectFullFunctionDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getEffectFullFunctionDefinitionAccess().getNameAssignment_2()); 
            // InternalFPML.g:3259:2: ( rule__EffectFullFunctionDefinition__NameAssignment_2 )
            // InternalFPML.g:3259:3: rule__EffectFullFunctionDefinition__NameAssignment_2
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
    // InternalFPML.g:3267:1: rule__EffectFullFunctionDefinition__Group__3 : rule__EffectFullFunctionDefinition__Group__3__Impl rule__EffectFullFunctionDefinition__Group__4 ;
    public final void rule__EffectFullFunctionDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3271:1: ( rule__EffectFullFunctionDefinition__Group__3__Impl rule__EffectFullFunctionDefinition__Group__4 )
            // InternalFPML.g:3272:2: rule__EffectFullFunctionDefinition__Group__3__Impl rule__EffectFullFunctionDefinition__Group__4
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
    // InternalFPML.g:3279:1: rule__EffectFullFunctionDefinition__Group__3__Impl : ( '(' ) ;
    public final void rule__EffectFullFunctionDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3283:1: ( ( '(' ) )
            // InternalFPML.g:3284:1: ( '(' )
            {
            // InternalFPML.g:3284:1: ( '(' )
            // InternalFPML.g:3285:2: '('
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
    // InternalFPML.g:3294:1: rule__EffectFullFunctionDefinition__Group__4 : rule__EffectFullFunctionDefinition__Group__4__Impl rule__EffectFullFunctionDefinition__Group__5 ;
    public final void rule__EffectFullFunctionDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3298:1: ( rule__EffectFullFunctionDefinition__Group__4__Impl rule__EffectFullFunctionDefinition__Group__5 )
            // InternalFPML.g:3299:2: rule__EffectFullFunctionDefinition__Group__4__Impl rule__EffectFullFunctionDefinition__Group__5
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
    // InternalFPML.g:3306:1: rule__EffectFullFunctionDefinition__Group__4__Impl : ( ( rule__EffectFullFunctionDefinition__ArgAssignment_4 ) ) ;
    public final void rule__EffectFullFunctionDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3310:1: ( ( ( rule__EffectFullFunctionDefinition__ArgAssignment_4 ) ) )
            // InternalFPML.g:3311:1: ( ( rule__EffectFullFunctionDefinition__ArgAssignment_4 ) )
            {
            // InternalFPML.g:3311:1: ( ( rule__EffectFullFunctionDefinition__ArgAssignment_4 ) )
            // InternalFPML.g:3312:2: ( rule__EffectFullFunctionDefinition__ArgAssignment_4 )
            {
             before(grammarAccess.getEffectFullFunctionDefinitionAccess().getArgAssignment_4()); 
            // InternalFPML.g:3313:2: ( rule__EffectFullFunctionDefinition__ArgAssignment_4 )
            // InternalFPML.g:3313:3: rule__EffectFullFunctionDefinition__ArgAssignment_4
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
    // InternalFPML.g:3321:1: rule__EffectFullFunctionDefinition__Group__5 : rule__EffectFullFunctionDefinition__Group__5__Impl rule__EffectFullFunctionDefinition__Group__6 ;
    public final void rule__EffectFullFunctionDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3325:1: ( rule__EffectFullFunctionDefinition__Group__5__Impl rule__EffectFullFunctionDefinition__Group__6 )
            // InternalFPML.g:3326:2: rule__EffectFullFunctionDefinition__Group__5__Impl rule__EffectFullFunctionDefinition__Group__6
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
    // InternalFPML.g:3333:1: rule__EffectFullFunctionDefinition__Group__5__Impl : ( ')' ) ;
    public final void rule__EffectFullFunctionDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3337:1: ( ( ')' ) )
            // InternalFPML.g:3338:1: ( ')' )
            {
            // InternalFPML.g:3338:1: ( ')' )
            // InternalFPML.g:3339:2: ')'
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
    // InternalFPML.g:3348:1: rule__EffectFullFunctionDefinition__Group__6 : rule__EffectFullFunctionDefinition__Group__6__Impl rule__EffectFullFunctionDefinition__Group__7 ;
    public final void rule__EffectFullFunctionDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3352:1: ( rule__EffectFullFunctionDefinition__Group__6__Impl rule__EffectFullFunctionDefinition__Group__7 )
            // InternalFPML.g:3353:2: rule__EffectFullFunctionDefinition__Group__6__Impl rule__EffectFullFunctionDefinition__Group__7
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
    // InternalFPML.g:3360:1: rule__EffectFullFunctionDefinition__Group__6__Impl : ( ':' ) ;
    public final void rule__EffectFullFunctionDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3364:1: ( ( ':' ) )
            // InternalFPML.g:3365:1: ( ':' )
            {
            // InternalFPML.g:3365:1: ( ':' )
            // InternalFPML.g:3366:2: ':'
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
    // InternalFPML.g:3375:1: rule__EffectFullFunctionDefinition__Group__7 : rule__EffectFullFunctionDefinition__Group__7__Impl rule__EffectFullFunctionDefinition__Group__8 ;
    public final void rule__EffectFullFunctionDefinition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3379:1: ( rule__EffectFullFunctionDefinition__Group__7__Impl rule__EffectFullFunctionDefinition__Group__8 )
            // InternalFPML.g:3380:2: rule__EffectFullFunctionDefinition__Group__7__Impl rule__EffectFullFunctionDefinition__Group__8
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
    // InternalFPML.g:3387:1: rule__EffectFullFunctionDefinition__Group__7__Impl : ( '{' ) ;
    public final void rule__EffectFullFunctionDefinition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3391:1: ( ( '{' ) )
            // InternalFPML.g:3392:1: ( '{' )
            {
            // InternalFPML.g:3392:1: ( '{' )
            // InternalFPML.g:3393:2: '{'
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
    // InternalFPML.g:3402:1: rule__EffectFullFunctionDefinition__Group__8 : rule__EffectFullFunctionDefinition__Group__8__Impl rule__EffectFullFunctionDefinition__Group__9 ;
    public final void rule__EffectFullFunctionDefinition__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3406:1: ( rule__EffectFullFunctionDefinition__Group__8__Impl rule__EffectFullFunctionDefinition__Group__9 )
            // InternalFPML.g:3407:2: rule__EffectFullFunctionDefinition__Group__8__Impl rule__EffectFullFunctionDefinition__Group__9
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
    // InternalFPML.g:3414:1: rule__EffectFullFunctionDefinition__Group__8__Impl : ( ( rule__EffectFullFunctionDefinition__FunctionBodyAssignment_8 ) ) ;
    public final void rule__EffectFullFunctionDefinition__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3418:1: ( ( ( rule__EffectFullFunctionDefinition__FunctionBodyAssignment_8 ) ) )
            // InternalFPML.g:3419:1: ( ( rule__EffectFullFunctionDefinition__FunctionBodyAssignment_8 ) )
            {
            // InternalFPML.g:3419:1: ( ( rule__EffectFullFunctionDefinition__FunctionBodyAssignment_8 ) )
            // InternalFPML.g:3420:2: ( rule__EffectFullFunctionDefinition__FunctionBodyAssignment_8 )
            {
             before(grammarAccess.getEffectFullFunctionDefinitionAccess().getFunctionBodyAssignment_8()); 
            // InternalFPML.g:3421:2: ( rule__EffectFullFunctionDefinition__FunctionBodyAssignment_8 )
            // InternalFPML.g:3421:3: rule__EffectFullFunctionDefinition__FunctionBodyAssignment_8
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
    // InternalFPML.g:3429:1: rule__EffectFullFunctionDefinition__Group__9 : rule__EffectFullFunctionDefinition__Group__9__Impl ;
    public final void rule__EffectFullFunctionDefinition__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3433:1: ( rule__EffectFullFunctionDefinition__Group__9__Impl )
            // InternalFPML.g:3434:2: rule__EffectFullFunctionDefinition__Group__9__Impl
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
    // InternalFPML.g:3440:1: rule__EffectFullFunctionDefinition__Group__9__Impl : ( '}' ) ;
    public final void rule__EffectFullFunctionDefinition__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3444:1: ( ( '}' ) )
            // InternalFPML.g:3445:1: ( '}' )
            {
            // InternalFPML.g:3445:1: ( '}' )
            // InternalFPML.g:3446:2: '}'
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
    // InternalFPML.g:3456:1: rule__MainFunc__Group__0 : rule__MainFunc__Group__0__Impl rule__MainFunc__Group__1 ;
    public final void rule__MainFunc__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3460:1: ( rule__MainFunc__Group__0__Impl rule__MainFunc__Group__1 )
            // InternalFPML.g:3461:2: rule__MainFunc__Group__0__Impl rule__MainFunc__Group__1
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
    // InternalFPML.g:3468:1: rule__MainFunc__Group__0__Impl : ( 'IO' ) ;
    public final void rule__MainFunc__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3472:1: ( ( 'IO' ) )
            // InternalFPML.g:3473:1: ( 'IO' )
            {
            // InternalFPML.g:3473:1: ( 'IO' )
            // InternalFPML.g:3474:2: 'IO'
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
    // InternalFPML.g:3483:1: rule__MainFunc__Group__1 : rule__MainFunc__Group__1__Impl rule__MainFunc__Group__2 ;
    public final void rule__MainFunc__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3487:1: ( rule__MainFunc__Group__1__Impl rule__MainFunc__Group__2 )
            // InternalFPML.g:3488:2: rule__MainFunc__Group__1__Impl rule__MainFunc__Group__2
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
    // InternalFPML.g:3495:1: rule__MainFunc__Group__1__Impl : ( ( rule__MainFunc__ReturnTypeAssignment_1 ) ) ;
    public final void rule__MainFunc__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3499:1: ( ( ( rule__MainFunc__ReturnTypeAssignment_1 ) ) )
            // InternalFPML.g:3500:1: ( ( rule__MainFunc__ReturnTypeAssignment_1 ) )
            {
            // InternalFPML.g:3500:1: ( ( rule__MainFunc__ReturnTypeAssignment_1 ) )
            // InternalFPML.g:3501:2: ( rule__MainFunc__ReturnTypeAssignment_1 )
            {
             before(grammarAccess.getMainFuncAccess().getReturnTypeAssignment_1()); 
            // InternalFPML.g:3502:2: ( rule__MainFunc__ReturnTypeAssignment_1 )
            // InternalFPML.g:3502:3: rule__MainFunc__ReturnTypeAssignment_1
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
    // InternalFPML.g:3510:1: rule__MainFunc__Group__2 : rule__MainFunc__Group__2__Impl rule__MainFunc__Group__3 ;
    public final void rule__MainFunc__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3514:1: ( rule__MainFunc__Group__2__Impl rule__MainFunc__Group__3 )
            // InternalFPML.g:3515:2: rule__MainFunc__Group__2__Impl rule__MainFunc__Group__3
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
    // InternalFPML.g:3522:1: rule__MainFunc__Group__2__Impl : ( 'main' ) ;
    public final void rule__MainFunc__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3526:1: ( ( 'main' ) )
            // InternalFPML.g:3527:1: ( 'main' )
            {
            // InternalFPML.g:3527:1: ( 'main' )
            // InternalFPML.g:3528:2: 'main'
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
    // InternalFPML.g:3537:1: rule__MainFunc__Group__3 : rule__MainFunc__Group__3__Impl rule__MainFunc__Group__4 ;
    public final void rule__MainFunc__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3541:1: ( rule__MainFunc__Group__3__Impl rule__MainFunc__Group__4 )
            // InternalFPML.g:3542:2: rule__MainFunc__Group__3__Impl rule__MainFunc__Group__4
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
    // InternalFPML.g:3549:1: rule__MainFunc__Group__3__Impl : ( ':' ) ;
    public final void rule__MainFunc__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3553:1: ( ( ':' ) )
            // InternalFPML.g:3554:1: ( ':' )
            {
            // InternalFPML.g:3554:1: ( ':' )
            // InternalFPML.g:3555:2: ':'
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
    // InternalFPML.g:3564:1: rule__MainFunc__Group__4 : rule__MainFunc__Group__4__Impl rule__MainFunc__Group__5 ;
    public final void rule__MainFunc__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3568:1: ( rule__MainFunc__Group__4__Impl rule__MainFunc__Group__5 )
            // InternalFPML.g:3569:2: rule__MainFunc__Group__4__Impl rule__MainFunc__Group__5
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
    // InternalFPML.g:3576:1: rule__MainFunc__Group__4__Impl : ( '{' ) ;
    public final void rule__MainFunc__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3580:1: ( ( '{' ) )
            // InternalFPML.g:3581:1: ( '{' )
            {
            // InternalFPML.g:3581:1: ( '{' )
            // InternalFPML.g:3582:2: '{'
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
    // InternalFPML.g:3591:1: rule__MainFunc__Group__5 : rule__MainFunc__Group__5__Impl rule__MainFunc__Group__6 ;
    public final void rule__MainFunc__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3595:1: ( rule__MainFunc__Group__5__Impl rule__MainFunc__Group__6 )
            // InternalFPML.g:3596:2: rule__MainFunc__Group__5__Impl rule__MainFunc__Group__6
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
    // InternalFPML.g:3603:1: rule__MainFunc__Group__5__Impl : ( ( rule__MainFunc__FunctionBodyAssignment_5 ) ) ;
    public final void rule__MainFunc__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3607:1: ( ( ( rule__MainFunc__FunctionBodyAssignment_5 ) ) )
            // InternalFPML.g:3608:1: ( ( rule__MainFunc__FunctionBodyAssignment_5 ) )
            {
            // InternalFPML.g:3608:1: ( ( rule__MainFunc__FunctionBodyAssignment_5 ) )
            // InternalFPML.g:3609:2: ( rule__MainFunc__FunctionBodyAssignment_5 )
            {
             before(grammarAccess.getMainFuncAccess().getFunctionBodyAssignment_5()); 
            // InternalFPML.g:3610:2: ( rule__MainFunc__FunctionBodyAssignment_5 )
            // InternalFPML.g:3610:3: rule__MainFunc__FunctionBodyAssignment_5
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
    // InternalFPML.g:3618:1: rule__MainFunc__Group__6 : rule__MainFunc__Group__6__Impl ;
    public final void rule__MainFunc__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3622:1: ( rule__MainFunc__Group__6__Impl )
            // InternalFPML.g:3623:2: rule__MainFunc__Group__6__Impl
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
    // InternalFPML.g:3629:1: rule__MainFunc__Group__6__Impl : ( '}' ) ;
    public final void rule__MainFunc__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3633:1: ( ( '}' ) )
            // InternalFPML.g:3634:1: ( '}' )
            {
            // InternalFPML.g:3634:1: ( '}' )
            // InternalFPML.g:3635:2: '}'
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
    // InternalFPML.g:3645:1: rule__EffectFullArgument__Group__0 : rule__EffectFullArgument__Group__0__Impl rule__EffectFullArgument__Group__1 ;
    public final void rule__EffectFullArgument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3649:1: ( rule__EffectFullArgument__Group__0__Impl rule__EffectFullArgument__Group__1 )
            // InternalFPML.g:3650:2: rule__EffectFullArgument__Group__0__Impl rule__EffectFullArgument__Group__1
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
    // InternalFPML.g:3657:1: rule__EffectFullArgument__Group__0__Impl : ( ( rule__EffectFullArgument__TypeAssignment_0 ) ) ;
    public final void rule__EffectFullArgument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3661:1: ( ( ( rule__EffectFullArgument__TypeAssignment_0 ) ) )
            // InternalFPML.g:3662:1: ( ( rule__EffectFullArgument__TypeAssignment_0 ) )
            {
            // InternalFPML.g:3662:1: ( ( rule__EffectFullArgument__TypeAssignment_0 ) )
            // InternalFPML.g:3663:2: ( rule__EffectFullArgument__TypeAssignment_0 )
            {
             before(grammarAccess.getEffectFullArgumentAccess().getTypeAssignment_0()); 
            // InternalFPML.g:3664:2: ( rule__EffectFullArgument__TypeAssignment_0 )
            // InternalFPML.g:3664:3: rule__EffectFullArgument__TypeAssignment_0
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
    // InternalFPML.g:3672:1: rule__EffectFullArgument__Group__1 : rule__EffectFullArgument__Group__1__Impl ;
    public final void rule__EffectFullArgument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3676:1: ( rule__EffectFullArgument__Group__1__Impl )
            // InternalFPML.g:3677:2: rule__EffectFullArgument__Group__1__Impl
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
    // InternalFPML.g:3683:1: rule__EffectFullArgument__Group__1__Impl : ( ( rule__EffectFullArgument__NameAssignment_1 ) ) ;
    public final void rule__EffectFullArgument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3687:1: ( ( ( rule__EffectFullArgument__NameAssignment_1 ) ) )
            // InternalFPML.g:3688:1: ( ( rule__EffectFullArgument__NameAssignment_1 ) )
            {
            // InternalFPML.g:3688:1: ( ( rule__EffectFullArgument__NameAssignment_1 ) )
            // InternalFPML.g:3689:2: ( rule__EffectFullArgument__NameAssignment_1 )
            {
             before(grammarAccess.getEffectFullArgumentAccess().getNameAssignment_1()); 
            // InternalFPML.g:3690:2: ( rule__EffectFullArgument__NameAssignment_1 )
            // InternalFPML.g:3690:3: rule__EffectFullArgument__NameAssignment_1
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
    // InternalFPML.g:3699:1: rule__Argument__Group__0 : rule__Argument__Group__0__Impl rule__Argument__Group__1 ;
    public final void rule__Argument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3703:1: ( rule__Argument__Group__0__Impl rule__Argument__Group__1 )
            // InternalFPML.g:3704:2: rule__Argument__Group__0__Impl rule__Argument__Group__1
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
    // InternalFPML.g:3711:1: rule__Argument__Group__0__Impl : ( ( rule__Argument__TypeAssignment_0 ) ) ;
    public final void rule__Argument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3715:1: ( ( ( rule__Argument__TypeAssignment_0 ) ) )
            // InternalFPML.g:3716:1: ( ( rule__Argument__TypeAssignment_0 ) )
            {
            // InternalFPML.g:3716:1: ( ( rule__Argument__TypeAssignment_0 ) )
            // InternalFPML.g:3717:2: ( rule__Argument__TypeAssignment_0 )
            {
             before(grammarAccess.getArgumentAccess().getTypeAssignment_0()); 
            // InternalFPML.g:3718:2: ( rule__Argument__TypeAssignment_0 )
            // InternalFPML.g:3718:3: rule__Argument__TypeAssignment_0
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
    // InternalFPML.g:3726:1: rule__Argument__Group__1 : rule__Argument__Group__1__Impl ;
    public final void rule__Argument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3730:1: ( rule__Argument__Group__1__Impl )
            // InternalFPML.g:3731:2: rule__Argument__Group__1__Impl
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
    // InternalFPML.g:3737:1: rule__Argument__Group__1__Impl : ( ( rule__Argument__NameAssignment_1 ) ) ;
    public final void rule__Argument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3741:1: ( ( ( rule__Argument__NameAssignment_1 ) ) )
            // InternalFPML.g:3742:1: ( ( rule__Argument__NameAssignment_1 ) )
            {
            // InternalFPML.g:3742:1: ( ( rule__Argument__NameAssignment_1 ) )
            // InternalFPML.g:3743:2: ( rule__Argument__NameAssignment_1 )
            {
             before(grammarAccess.getArgumentAccess().getNameAssignment_1()); 
            // InternalFPML.g:3744:2: ( rule__Argument__NameAssignment_1 )
            // InternalFPML.g:3744:3: rule__Argument__NameAssignment_1
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
    // InternalFPML.g:3753:1: rule__EmptyFunctionBody__Group__0 : rule__EmptyFunctionBody__Group__0__Impl rule__EmptyFunctionBody__Group__1 ;
    public final void rule__EmptyFunctionBody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3757:1: ( rule__EmptyFunctionBody__Group__0__Impl rule__EmptyFunctionBody__Group__1 )
            // InternalFPML.g:3758:2: rule__EmptyFunctionBody__Group__0__Impl rule__EmptyFunctionBody__Group__1
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
    // InternalFPML.g:3765:1: rule__EmptyFunctionBody__Group__0__Impl : ( () ) ;
    public final void rule__EmptyFunctionBody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3769:1: ( ( () ) )
            // InternalFPML.g:3770:1: ( () )
            {
            // InternalFPML.g:3770:1: ( () )
            // InternalFPML.g:3771:2: ()
            {
             before(grammarAccess.getEmptyFunctionBodyAccess().getEmptyFunctionBodyAction_0()); 
            // InternalFPML.g:3772:2: ()
            // InternalFPML.g:3772:3: 
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
    // InternalFPML.g:3780:1: rule__EmptyFunctionBody__Group__1 : rule__EmptyFunctionBody__Group__1__Impl ;
    public final void rule__EmptyFunctionBody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3784:1: ( rule__EmptyFunctionBody__Group__1__Impl )
            // InternalFPML.g:3785:2: rule__EmptyFunctionBody__Group__1__Impl
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
    // InternalFPML.g:3791:1: rule__EmptyFunctionBody__Group__1__Impl : ( 'Undefined' ) ;
    public final void rule__EmptyFunctionBody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3795:1: ( ( 'Undefined' ) )
            // InternalFPML.g:3796:1: ( 'Undefined' )
            {
            // InternalFPML.g:3796:1: ( 'Undefined' )
            // InternalFPML.g:3797:2: 'Undefined'
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
    // InternalFPML.g:3807:1: rule__CompositionFunctionBodyPure__Group_0__0 : rule__CompositionFunctionBodyPure__Group_0__0__Impl rule__CompositionFunctionBodyPure__Group_0__1 ;
    public final void rule__CompositionFunctionBodyPure__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3811:1: ( rule__CompositionFunctionBodyPure__Group_0__0__Impl rule__CompositionFunctionBodyPure__Group_0__1 )
            // InternalFPML.g:3812:2: rule__CompositionFunctionBodyPure__Group_0__0__Impl rule__CompositionFunctionBodyPure__Group_0__1
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
    // InternalFPML.g:3819:1: rule__CompositionFunctionBodyPure__Group_0__0__Impl : ( ( rule__CompositionFunctionBodyPure__ReferenceElementAssignment_0_0 ) ) ;
    public final void rule__CompositionFunctionBodyPure__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3823:1: ( ( ( rule__CompositionFunctionBodyPure__ReferenceElementAssignment_0_0 ) ) )
            // InternalFPML.g:3824:1: ( ( rule__CompositionFunctionBodyPure__ReferenceElementAssignment_0_0 ) )
            {
            // InternalFPML.g:3824:1: ( ( rule__CompositionFunctionBodyPure__ReferenceElementAssignment_0_0 ) )
            // InternalFPML.g:3825:2: ( rule__CompositionFunctionBodyPure__ReferenceElementAssignment_0_0 )
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getReferenceElementAssignment_0_0()); 
            // InternalFPML.g:3826:2: ( rule__CompositionFunctionBodyPure__ReferenceElementAssignment_0_0 )
            // InternalFPML.g:3826:3: rule__CompositionFunctionBodyPure__ReferenceElementAssignment_0_0
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
    // InternalFPML.g:3834:1: rule__CompositionFunctionBodyPure__Group_0__1 : rule__CompositionFunctionBodyPure__Group_0__1__Impl rule__CompositionFunctionBodyPure__Group_0__2 ;
    public final void rule__CompositionFunctionBodyPure__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3838:1: ( rule__CompositionFunctionBodyPure__Group_0__1__Impl rule__CompositionFunctionBodyPure__Group_0__2 )
            // InternalFPML.g:3839:2: rule__CompositionFunctionBodyPure__Group_0__1__Impl rule__CompositionFunctionBodyPure__Group_0__2
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
    // InternalFPML.g:3846:1: rule__CompositionFunctionBodyPure__Group_0__1__Impl : ( ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 ) ) ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 )* ) ) ;
    public final void rule__CompositionFunctionBodyPure__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3850:1: ( ( ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 ) ) ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 )* ) ) )
            // InternalFPML.g:3851:1: ( ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 ) ) ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 )* ) )
            {
            // InternalFPML.g:3851:1: ( ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 ) ) ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 )* ) )
            // InternalFPML.g:3852:2: ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 ) ) ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 )* )
            {
            // InternalFPML.g:3852:2: ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 ) )
            // InternalFPML.g:3853:3: ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 )
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainAssignment_0_1()); 
            // InternalFPML.g:3854:3: ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 )
            // InternalFPML.g:3854:4: rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1
            {
            pushFollow(FOLLOW_32);
            rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainAssignment_0_1()); 

            }

            // InternalFPML.g:3857:2: ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 )* )
            // InternalFPML.g:3858:3: ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 )*
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainAssignment_0_1()); 
            // InternalFPML.g:3859:3: ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==29) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalFPML.g:3859:4: rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalFPML.g:3868:1: rule__CompositionFunctionBodyPure__Group_0__2 : rule__CompositionFunctionBodyPure__Group_0__2__Impl ;
    public final void rule__CompositionFunctionBodyPure__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3872:1: ( rule__CompositionFunctionBodyPure__Group_0__2__Impl )
            // InternalFPML.g:3873:2: rule__CompositionFunctionBodyPure__Group_0__2__Impl
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
    // InternalFPML.g:3879:1: rule__CompositionFunctionBodyPure__Group_0__2__Impl : ( ( rule__CompositionFunctionBodyPure__ReturnFunctionAssignment_0_2 )? ) ;
    public final void rule__CompositionFunctionBodyPure__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3883:1: ( ( ( rule__CompositionFunctionBodyPure__ReturnFunctionAssignment_0_2 )? ) )
            // InternalFPML.g:3884:1: ( ( rule__CompositionFunctionBodyPure__ReturnFunctionAssignment_0_2 )? )
            {
            // InternalFPML.g:3884:1: ( ( rule__CompositionFunctionBodyPure__ReturnFunctionAssignment_0_2 )? )
            // InternalFPML.g:3885:2: ( rule__CompositionFunctionBodyPure__ReturnFunctionAssignment_0_2 )?
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getReturnFunctionAssignment_0_2()); 
            // InternalFPML.g:3886:2: ( rule__CompositionFunctionBodyPure__ReturnFunctionAssignment_0_2 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==31) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalFPML.g:3886:3: rule__CompositionFunctionBodyPure__ReturnFunctionAssignment_0_2
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
    // InternalFPML.g:3895:1: rule__CompositionFunctionBodyPure__Group_1__0 : rule__CompositionFunctionBodyPure__Group_1__0__Impl rule__CompositionFunctionBodyPure__Group_1__1 ;
    public final void rule__CompositionFunctionBodyPure__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3899:1: ( rule__CompositionFunctionBodyPure__Group_1__0__Impl rule__CompositionFunctionBodyPure__Group_1__1 )
            // InternalFPML.g:3900:2: rule__CompositionFunctionBodyPure__Group_1__0__Impl rule__CompositionFunctionBodyPure__Group_1__1
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
    // InternalFPML.g:3907:1: rule__CompositionFunctionBodyPure__Group_1__0__Impl : ( ( rule__CompositionFunctionBodyPure__PrimitiveElementAssignment_1_0 ) ) ;
    public final void rule__CompositionFunctionBodyPure__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3911:1: ( ( ( rule__CompositionFunctionBodyPure__PrimitiveElementAssignment_1_0 ) ) )
            // InternalFPML.g:3912:1: ( ( rule__CompositionFunctionBodyPure__PrimitiveElementAssignment_1_0 ) )
            {
            // InternalFPML.g:3912:1: ( ( rule__CompositionFunctionBodyPure__PrimitiveElementAssignment_1_0 ) )
            // InternalFPML.g:3913:2: ( rule__CompositionFunctionBodyPure__PrimitiveElementAssignment_1_0 )
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getPrimitiveElementAssignment_1_0()); 
            // InternalFPML.g:3914:2: ( rule__CompositionFunctionBodyPure__PrimitiveElementAssignment_1_0 )
            // InternalFPML.g:3914:3: rule__CompositionFunctionBodyPure__PrimitiveElementAssignment_1_0
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
    // InternalFPML.g:3922:1: rule__CompositionFunctionBodyPure__Group_1__1 : rule__CompositionFunctionBodyPure__Group_1__1__Impl rule__CompositionFunctionBodyPure__Group_1__2 ;
    public final void rule__CompositionFunctionBodyPure__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3926:1: ( rule__CompositionFunctionBodyPure__Group_1__1__Impl rule__CompositionFunctionBodyPure__Group_1__2 )
            // InternalFPML.g:3927:2: rule__CompositionFunctionBodyPure__Group_1__1__Impl rule__CompositionFunctionBodyPure__Group_1__2
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
    // InternalFPML.g:3934:1: rule__CompositionFunctionBodyPure__Group_1__1__Impl : ( ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 ) ) ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 )* ) ) ;
    public final void rule__CompositionFunctionBodyPure__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3938:1: ( ( ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 ) ) ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 )* ) ) )
            // InternalFPML.g:3939:1: ( ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 ) ) ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 )* ) )
            {
            // InternalFPML.g:3939:1: ( ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 ) ) ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 )* ) )
            // InternalFPML.g:3940:2: ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 ) ) ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 )* )
            {
            // InternalFPML.g:3940:2: ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 ) )
            // InternalFPML.g:3941:3: ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 )
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainAssignment_1_1()); 
            // InternalFPML.g:3942:3: ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 )
            // InternalFPML.g:3942:4: rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1
            {
            pushFollow(FOLLOW_32);
            rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainAssignment_1_1()); 

            }

            // InternalFPML.g:3945:2: ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 )* )
            // InternalFPML.g:3946:3: ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 )*
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainAssignment_1_1()); 
            // InternalFPML.g:3947:3: ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==29) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalFPML.g:3947:4: rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalFPML.g:3956:1: rule__CompositionFunctionBodyPure__Group_1__2 : rule__CompositionFunctionBodyPure__Group_1__2__Impl ;
    public final void rule__CompositionFunctionBodyPure__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3960:1: ( rule__CompositionFunctionBodyPure__Group_1__2__Impl )
            // InternalFPML.g:3961:2: rule__CompositionFunctionBodyPure__Group_1__2__Impl
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
    // InternalFPML.g:3967:1: rule__CompositionFunctionBodyPure__Group_1__2__Impl : ( ( rule__CompositionFunctionBodyPure__ReturnFunctionAssignment_1_2 )? ) ;
    public final void rule__CompositionFunctionBodyPure__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3971:1: ( ( ( rule__CompositionFunctionBodyPure__ReturnFunctionAssignment_1_2 )? ) )
            // InternalFPML.g:3972:1: ( ( rule__CompositionFunctionBodyPure__ReturnFunctionAssignment_1_2 )? )
            {
            // InternalFPML.g:3972:1: ( ( rule__CompositionFunctionBodyPure__ReturnFunctionAssignment_1_2 )? )
            // InternalFPML.g:3973:2: ( rule__CompositionFunctionBodyPure__ReturnFunctionAssignment_1_2 )?
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getReturnFunctionAssignment_1_2()); 
            // InternalFPML.g:3974:2: ( rule__CompositionFunctionBodyPure__ReturnFunctionAssignment_1_2 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==31) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalFPML.g:3974:3: rule__CompositionFunctionBodyPure__ReturnFunctionAssignment_1_2
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
    // InternalFPML.g:3983:1: rule__CompositionFunctionBodyPureFactor__Group_0__0 : rule__CompositionFunctionBodyPureFactor__Group_0__0__Impl rule__CompositionFunctionBodyPureFactor__Group_0__1 ;
    public final void rule__CompositionFunctionBodyPureFactor__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3987:1: ( rule__CompositionFunctionBodyPureFactor__Group_0__0__Impl rule__CompositionFunctionBodyPureFactor__Group_0__1 )
            // InternalFPML.g:3988:2: rule__CompositionFunctionBodyPureFactor__Group_0__0__Impl rule__CompositionFunctionBodyPureFactor__Group_0__1
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
    // InternalFPML.g:3995:1: rule__CompositionFunctionBodyPureFactor__Group_0__0__Impl : ( '|>' ) ;
    public final void rule__CompositionFunctionBodyPureFactor__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3999:1: ( ( '|>' ) )
            // InternalFPML.g:4000:1: ( '|>' )
            {
            // InternalFPML.g:4000:1: ( '|>' )
            // InternalFPML.g:4001:2: '|>'
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
    // InternalFPML.g:4010:1: rule__CompositionFunctionBodyPureFactor__Group_0__1 : rule__CompositionFunctionBodyPureFactor__Group_0__1__Impl ;
    public final void rule__CompositionFunctionBodyPureFactor__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4014:1: ( rule__CompositionFunctionBodyPureFactor__Group_0__1__Impl )
            // InternalFPML.g:4015:2: rule__CompositionFunctionBodyPureFactor__Group_0__1__Impl
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
    // InternalFPML.g:4021:1: rule__CompositionFunctionBodyPureFactor__Group_0__1__Impl : ( ( rule__CompositionFunctionBodyPureFactor__ReferenceElementAssignment_0_1 ) ) ;
    public final void rule__CompositionFunctionBodyPureFactor__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4025:1: ( ( ( rule__CompositionFunctionBodyPureFactor__ReferenceElementAssignment_0_1 ) ) )
            // InternalFPML.g:4026:1: ( ( rule__CompositionFunctionBodyPureFactor__ReferenceElementAssignment_0_1 ) )
            {
            // InternalFPML.g:4026:1: ( ( rule__CompositionFunctionBodyPureFactor__ReferenceElementAssignment_0_1 ) )
            // InternalFPML.g:4027:2: ( rule__CompositionFunctionBodyPureFactor__ReferenceElementAssignment_0_1 )
            {
             before(grammarAccess.getCompositionFunctionBodyPureFactorAccess().getReferenceElementAssignment_0_1()); 
            // InternalFPML.g:4028:2: ( rule__CompositionFunctionBodyPureFactor__ReferenceElementAssignment_0_1 )
            // InternalFPML.g:4028:3: rule__CompositionFunctionBodyPureFactor__ReferenceElementAssignment_0_1
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
    // InternalFPML.g:4037:1: rule__CompositionFunctionBodyPureFactor__Group_1__0 : rule__CompositionFunctionBodyPureFactor__Group_1__0__Impl rule__CompositionFunctionBodyPureFactor__Group_1__1 ;
    public final void rule__CompositionFunctionBodyPureFactor__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4041:1: ( rule__CompositionFunctionBodyPureFactor__Group_1__0__Impl rule__CompositionFunctionBodyPureFactor__Group_1__1 )
            // InternalFPML.g:4042:2: rule__CompositionFunctionBodyPureFactor__Group_1__0__Impl rule__CompositionFunctionBodyPureFactor__Group_1__1
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
    // InternalFPML.g:4049:1: rule__CompositionFunctionBodyPureFactor__Group_1__0__Impl : ( '|>' ) ;
    public final void rule__CompositionFunctionBodyPureFactor__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4053:1: ( ( '|>' ) )
            // InternalFPML.g:4054:1: ( '|>' )
            {
            // InternalFPML.g:4054:1: ( '|>' )
            // InternalFPML.g:4055:2: '|>'
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
    // InternalFPML.g:4064:1: rule__CompositionFunctionBodyPureFactor__Group_1__1 : rule__CompositionFunctionBodyPureFactor__Group_1__1__Impl ;
    public final void rule__CompositionFunctionBodyPureFactor__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4068:1: ( rule__CompositionFunctionBodyPureFactor__Group_1__1__Impl )
            // InternalFPML.g:4069:2: rule__CompositionFunctionBodyPureFactor__Group_1__1__Impl
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
    // InternalFPML.g:4075:1: rule__CompositionFunctionBodyPureFactor__Group_1__1__Impl : ( ( rule__CompositionFunctionBodyPureFactor__PrimitiveElementAssignment_1_1 ) ) ;
    public final void rule__CompositionFunctionBodyPureFactor__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4079:1: ( ( ( rule__CompositionFunctionBodyPureFactor__PrimitiveElementAssignment_1_1 ) ) )
            // InternalFPML.g:4080:1: ( ( rule__CompositionFunctionBodyPureFactor__PrimitiveElementAssignment_1_1 ) )
            {
            // InternalFPML.g:4080:1: ( ( rule__CompositionFunctionBodyPureFactor__PrimitiveElementAssignment_1_1 ) )
            // InternalFPML.g:4081:2: ( rule__CompositionFunctionBodyPureFactor__PrimitiveElementAssignment_1_1 )
            {
             before(grammarAccess.getCompositionFunctionBodyPureFactorAccess().getPrimitiveElementAssignment_1_1()); 
            // InternalFPML.g:4082:2: ( rule__CompositionFunctionBodyPureFactor__PrimitiveElementAssignment_1_1 )
            // InternalFPML.g:4082:3: rule__CompositionFunctionBodyPureFactor__PrimitiveElementAssignment_1_1
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
    // InternalFPML.g:4091:1: rule__CompositionFunctionBodyEffect__Group_0__0 : rule__CompositionFunctionBodyEffect__Group_0__0__Impl rule__CompositionFunctionBodyEffect__Group_0__1 ;
    public final void rule__CompositionFunctionBodyEffect__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4095:1: ( rule__CompositionFunctionBodyEffect__Group_0__0__Impl rule__CompositionFunctionBodyEffect__Group_0__1 )
            // InternalFPML.g:4096:2: rule__CompositionFunctionBodyEffect__Group_0__0__Impl rule__CompositionFunctionBodyEffect__Group_0__1
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
    // InternalFPML.g:4103:1: rule__CompositionFunctionBodyEffect__Group_0__0__Impl : ( ( rule__CompositionFunctionBodyEffect__ReferenceElementAssignment_0_0 ) ) ;
    public final void rule__CompositionFunctionBodyEffect__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4107:1: ( ( ( rule__CompositionFunctionBodyEffect__ReferenceElementAssignment_0_0 ) ) )
            // InternalFPML.g:4108:1: ( ( rule__CompositionFunctionBodyEffect__ReferenceElementAssignment_0_0 ) )
            {
            // InternalFPML.g:4108:1: ( ( rule__CompositionFunctionBodyEffect__ReferenceElementAssignment_0_0 ) )
            // InternalFPML.g:4109:2: ( rule__CompositionFunctionBodyEffect__ReferenceElementAssignment_0_0 )
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getReferenceElementAssignment_0_0()); 
            // InternalFPML.g:4110:2: ( rule__CompositionFunctionBodyEffect__ReferenceElementAssignment_0_0 )
            // InternalFPML.g:4110:3: rule__CompositionFunctionBodyEffect__ReferenceElementAssignment_0_0
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
    // InternalFPML.g:4118:1: rule__CompositionFunctionBodyEffect__Group_0__1 : rule__CompositionFunctionBodyEffect__Group_0__1__Impl rule__CompositionFunctionBodyEffect__Group_0__2 ;
    public final void rule__CompositionFunctionBodyEffect__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4122:1: ( rule__CompositionFunctionBodyEffect__Group_0__1__Impl rule__CompositionFunctionBodyEffect__Group_0__2 )
            // InternalFPML.g:4123:2: rule__CompositionFunctionBodyEffect__Group_0__1__Impl rule__CompositionFunctionBodyEffect__Group_0__2
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
    // InternalFPML.g:4130:1: rule__CompositionFunctionBodyEffect__Group_0__1__Impl : ( ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 ) ) ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 )* ) ) ;
    public final void rule__CompositionFunctionBodyEffect__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4134:1: ( ( ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 ) ) ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 )* ) ) )
            // InternalFPML.g:4135:1: ( ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 ) ) ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 )* ) )
            {
            // InternalFPML.g:4135:1: ( ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 ) ) ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 )* ) )
            // InternalFPML.g:4136:2: ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 ) ) ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 )* )
            {
            // InternalFPML.g:4136:2: ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 ) )
            // InternalFPML.g:4137:3: ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 )
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainAssignment_0_1()); 
            // InternalFPML.g:4138:3: ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 )
            // InternalFPML.g:4138:4: rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1
            {
            pushFollow(FOLLOW_34);
            rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainAssignment_0_1()); 

            }

            // InternalFPML.g:4141:2: ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 )* )
            // InternalFPML.g:4142:3: ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 )*
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainAssignment_0_1()); 
            // InternalFPML.g:4143:3: ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==30) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalFPML.g:4143:4: rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalFPML.g:4152:1: rule__CompositionFunctionBodyEffect__Group_0__2 : rule__CompositionFunctionBodyEffect__Group_0__2__Impl ;
    public final void rule__CompositionFunctionBodyEffect__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4156:1: ( rule__CompositionFunctionBodyEffect__Group_0__2__Impl )
            // InternalFPML.g:4157:2: rule__CompositionFunctionBodyEffect__Group_0__2__Impl
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
    // InternalFPML.g:4163:1: rule__CompositionFunctionBodyEffect__Group_0__2__Impl : ( ( rule__CompositionFunctionBodyEffect__ReturnFunctionAssignment_0_2 )? ) ;
    public final void rule__CompositionFunctionBodyEffect__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4167:1: ( ( ( rule__CompositionFunctionBodyEffect__ReturnFunctionAssignment_0_2 )? ) )
            // InternalFPML.g:4168:1: ( ( rule__CompositionFunctionBodyEffect__ReturnFunctionAssignment_0_2 )? )
            {
            // InternalFPML.g:4168:1: ( ( rule__CompositionFunctionBodyEffect__ReturnFunctionAssignment_0_2 )? )
            // InternalFPML.g:4169:2: ( rule__CompositionFunctionBodyEffect__ReturnFunctionAssignment_0_2 )?
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getReturnFunctionAssignment_0_2()); 
            // InternalFPML.g:4170:2: ( rule__CompositionFunctionBodyEffect__ReturnFunctionAssignment_0_2 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==31) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalFPML.g:4170:3: rule__CompositionFunctionBodyEffect__ReturnFunctionAssignment_0_2
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
    // InternalFPML.g:4179:1: rule__CompositionFunctionBodyEffect__Group_1__0 : rule__CompositionFunctionBodyEffect__Group_1__0__Impl rule__CompositionFunctionBodyEffect__Group_1__1 ;
    public final void rule__CompositionFunctionBodyEffect__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4183:1: ( rule__CompositionFunctionBodyEffect__Group_1__0__Impl rule__CompositionFunctionBodyEffect__Group_1__1 )
            // InternalFPML.g:4184:2: rule__CompositionFunctionBodyEffect__Group_1__0__Impl rule__CompositionFunctionBodyEffect__Group_1__1
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
    // InternalFPML.g:4191:1: rule__CompositionFunctionBodyEffect__Group_1__0__Impl : ( ( rule__CompositionFunctionBodyEffect__PrimitiveElementAssignment_1_0 ) ) ;
    public final void rule__CompositionFunctionBodyEffect__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4195:1: ( ( ( rule__CompositionFunctionBodyEffect__PrimitiveElementAssignment_1_0 ) ) )
            // InternalFPML.g:4196:1: ( ( rule__CompositionFunctionBodyEffect__PrimitiveElementAssignment_1_0 ) )
            {
            // InternalFPML.g:4196:1: ( ( rule__CompositionFunctionBodyEffect__PrimitiveElementAssignment_1_0 ) )
            // InternalFPML.g:4197:2: ( rule__CompositionFunctionBodyEffect__PrimitiveElementAssignment_1_0 )
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getPrimitiveElementAssignment_1_0()); 
            // InternalFPML.g:4198:2: ( rule__CompositionFunctionBodyEffect__PrimitiveElementAssignment_1_0 )
            // InternalFPML.g:4198:3: rule__CompositionFunctionBodyEffect__PrimitiveElementAssignment_1_0
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
    // InternalFPML.g:4206:1: rule__CompositionFunctionBodyEffect__Group_1__1 : rule__CompositionFunctionBodyEffect__Group_1__1__Impl rule__CompositionFunctionBodyEffect__Group_1__2 ;
    public final void rule__CompositionFunctionBodyEffect__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4210:1: ( rule__CompositionFunctionBodyEffect__Group_1__1__Impl rule__CompositionFunctionBodyEffect__Group_1__2 )
            // InternalFPML.g:4211:2: rule__CompositionFunctionBodyEffect__Group_1__1__Impl rule__CompositionFunctionBodyEffect__Group_1__2
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
    // InternalFPML.g:4218:1: rule__CompositionFunctionBodyEffect__Group_1__1__Impl : ( ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 ) ) ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 )* ) ) ;
    public final void rule__CompositionFunctionBodyEffect__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4222:1: ( ( ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 ) ) ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 )* ) ) )
            // InternalFPML.g:4223:1: ( ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 ) ) ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 )* ) )
            {
            // InternalFPML.g:4223:1: ( ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 ) ) ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 )* ) )
            // InternalFPML.g:4224:2: ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 ) ) ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 )* )
            {
            // InternalFPML.g:4224:2: ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 ) )
            // InternalFPML.g:4225:3: ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 )
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainAssignment_1_1()); 
            // InternalFPML.g:4226:3: ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 )
            // InternalFPML.g:4226:4: rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1
            {
            pushFollow(FOLLOW_34);
            rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainAssignment_1_1()); 

            }

            // InternalFPML.g:4229:2: ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 )* )
            // InternalFPML.g:4230:3: ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 )*
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainAssignment_1_1()); 
            // InternalFPML.g:4231:3: ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==30) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalFPML.g:4231:4: rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalFPML.g:4240:1: rule__CompositionFunctionBodyEffect__Group_1__2 : rule__CompositionFunctionBodyEffect__Group_1__2__Impl ;
    public final void rule__CompositionFunctionBodyEffect__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4244:1: ( rule__CompositionFunctionBodyEffect__Group_1__2__Impl )
            // InternalFPML.g:4245:2: rule__CompositionFunctionBodyEffect__Group_1__2__Impl
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
    // InternalFPML.g:4251:1: rule__CompositionFunctionBodyEffect__Group_1__2__Impl : ( ( rule__CompositionFunctionBodyEffect__ReturnFunctionAssignment_1_2 )? ) ;
    public final void rule__CompositionFunctionBodyEffect__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4255:1: ( ( ( rule__CompositionFunctionBodyEffect__ReturnFunctionAssignment_1_2 )? ) )
            // InternalFPML.g:4256:1: ( ( rule__CompositionFunctionBodyEffect__ReturnFunctionAssignment_1_2 )? )
            {
            // InternalFPML.g:4256:1: ( ( rule__CompositionFunctionBodyEffect__ReturnFunctionAssignment_1_2 )? )
            // InternalFPML.g:4257:2: ( rule__CompositionFunctionBodyEffect__ReturnFunctionAssignment_1_2 )?
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getReturnFunctionAssignment_1_2()); 
            // InternalFPML.g:4258:2: ( rule__CompositionFunctionBodyEffect__ReturnFunctionAssignment_1_2 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==31) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalFPML.g:4258:3: rule__CompositionFunctionBodyEffect__ReturnFunctionAssignment_1_2
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
    // InternalFPML.g:4267:1: rule__CompositionFunctionBodyEffectFullFactor__Group_0__0 : rule__CompositionFunctionBodyEffectFullFactor__Group_0__0__Impl rule__CompositionFunctionBodyEffectFullFactor__Group_0__1 ;
    public final void rule__CompositionFunctionBodyEffectFullFactor__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4271:1: ( rule__CompositionFunctionBodyEffectFullFactor__Group_0__0__Impl rule__CompositionFunctionBodyEffectFullFactor__Group_0__1 )
            // InternalFPML.g:4272:2: rule__CompositionFunctionBodyEffectFullFactor__Group_0__0__Impl rule__CompositionFunctionBodyEffectFullFactor__Group_0__1
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
    // InternalFPML.g:4279:1: rule__CompositionFunctionBodyEffectFullFactor__Group_0__0__Impl : ( '>>=' ) ;
    public final void rule__CompositionFunctionBodyEffectFullFactor__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4283:1: ( ( '>>=' ) )
            // InternalFPML.g:4284:1: ( '>>=' )
            {
            // InternalFPML.g:4284:1: ( '>>=' )
            // InternalFPML.g:4285:2: '>>='
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
    // InternalFPML.g:4294:1: rule__CompositionFunctionBodyEffectFullFactor__Group_0__1 : rule__CompositionFunctionBodyEffectFullFactor__Group_0__1__Impl ;
    public final void rule__CompositionFunctionBodyEffectFullFactor__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4298:1: ( rule__CompositionFunctionBodyEffectFullFactor__Group_0__1__Impl )
            // InternalFPML.g:4299:2: rule__CompositionFunctionBodyEffectFullFactor__Group_0__1__Impl
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
    // InternalFPML.g:4305:1: rule__CompositionFunctionBodyEffectFullFactor__Group_0__1__Impl : ( ( rule__CompositionFunctionBodyEffectFullFactor__ReferenceElementAssignment_0_1 ) ) ;
    public final void rule__CompositionFunctionBodyEffectFullFactor__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4309:1: ( ( ( rule__CompositionFunctionBodyEffectFullFactor__ReferenceElementAssignment_0_1 ) ) )
            // InternalFPML.g:4310:1: ( ( rule__CompositionFunctionBodyEffectFullFactor__ReferenceElementAssignment_0_1 ) )
            {
            // InternalFPML.g:4310:1: ( ( rule__CompositionFunctionBodyEffectFullFactor__ReferenceElementAssignment_0_1 ) )
            // InternalFPML.g:4311:2: ( rule__CompositionFunctionBodyEffectFullFactor__ReferenceElementAssignment_0_1 )
            {
             before(grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getReferenceElementAssignment_0_1()); 
            // InternalFPML.g:4312:2: ( rule__CompositionFunctionBodyEffectFullFactor__ReferenceElementAssignment_0_1 )
            // InternalFPML.g:4312:3: rule__CompositionFunctionBodyEffectFullFactor__ReferenceElementAssignment_0_1
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
    // InternalFPML.g:4321:1: rule__CompositionFunctionBodyEffectFullFactor__Group_1__0 : rule__CompositionFunctionBodyEffectFullFactor__Group_1__0__Impl rule__CompositionFunctionBodyEffectFullFactor__Group_1__1 ;
    public final void rule__CompositionFunctionBodyEffectFullFactor__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4325:1: ( rule__CompositionFunctionBodyEffectFullFactor__Group_1__0__Impl rule__CompositionFunctionBodyEffectFullFactor__Group_1__1 )
            // InternalFPML.g:4326:2: rule__CompositionFunctionBodyEffectFullFactor__Group_1__0__Impl rule__CompositionFunctionBodyEffectFullFactor__Group_1__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalFPML.g:4333:1: rule__CompositionFunctionBodyEffectFullFactor__Group_1__0__Impl : ( '>>=' ) ;
    public final void rule__CompositionFunctionBodyEffectFullFactor__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4337:1: ( ( '>>=' ) )
            // InternalFPML.g:4338:1: ( '>>=' )
            {
            // InternalFPML.g:4338:1: ( '>>=' )
            // InternalFPML.g:4339:2: '>>='
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
    // InternalFPML.g:4348:1: rule__CompositionFunctionBodyEffectFullFactor__Group_1__1 : rule__CompositionFunctionBodyEffectFullFactor__Group_1__1__Impl ;
    public final void rule__CompositionFunctionBodyEffectFullFactor__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4352:1: ( rule__CompositionFunctionBodyEffectFullFactor__Group_1__1__Impl )
            // InternalFPML.g:4353:2: rule__CompositionFunctionBodyEffectFullFactor__Group_1__1__Impl
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
    // InternalFPML.g:4359:1: rule__CompositionFunctionBodyEffectFullFactor__Group_1__1__Impl : ( ( rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAssignment_1_1 ) ) ;
    public final void rule__CompositionFunctionBodyEffectFullFactor__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4363:1: ( ( ( rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAssignment_1_1 ) ) )
            // InternalFPML.g:4364:1: ( ( rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAssignment_1_1 ) )
            {
            // InternalFPML.g:4364:1: ( ( rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAssignment_1_1 ) )
            // InternalFPML.g:4365:2: ( rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAssignment_1_1 )
            {
             before(grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getPrimitiveElementAssignment_1_1()); 
            // InternalFPML.g:4366:2: ( rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAssignment_1_1 )
            // InternalFPML.g:4366:3: rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAssignment_1_1
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
    // InternalFPML.g:4375:1: rule__ReturnPureFunction__Group__0 : rule__ReturnPureFunction__Group__0__Impl rule__ReturnPureFunction__Group__1 ;
    public final void rule__ReturnPureFunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4379:1: ( rule__ReturnPureFunction__Group__0__Impl rule__ReturnPureFunction__Group__1 )
            // InternalFPML.g:4380:2: rule__ReturnPureFunction__Group__0__Impl rule__ReturnPureFunction__Group__1
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
    // InternalFPML.g:4387:1: rule__ReturnPureFunction__Group__0__Impl : ( '->' ) ;
    public final void rule__ReturnPureFunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4391:1: ( ( '->' ) )
            // InternalFPML.g:4392:1: ( '->' )
            {
            // InternalFPML.g:4392:1: ( '->' )
            // InternalFPML.g:4393:2: '->'
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
    // InternalFPML.g:4402:1: rule__ReturnPureFunction__Group__1 : rule__ReturnPureFunction__Group__1__Impl rule__ReturnPureFunction__Group__2 ;
    public final void rule__ReturnPureFunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4406:1: ( rule__ReturnPureFunction__Group__1__Impl rule__ReturnPureFunction__Group__2 )
            // InternalFPML.g:4407:2: rule__ReturnPureFunction__Group__1__Impl rule__ReturnPureFunction__Group__2
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
    // InternalFPML.g:4414:1: rule__ReturnPureFunction__Group__1__Impl : ( '(' ) ;
    public final void rule__ReturnPureFunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4418:1: ( ( '(' ) )
            // InternalFPML.g:4419:1: ( '(' )
            {
            // InternalFPML.g:4419:1: ( '(' )
            // InternalFPML.g:4420:2: '('
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
    // InternalFPML.g:4429:1: rule__ReturnPureFunction__Group__2 : rule__ReturnPureFunction__Group__2__Impl rule__ReturnPureFunction__Group__3 ;
    public final void rule__ReturnPureFunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4433:1: ( rule__ReturnPureFunction__Group__2__Impl rule__ReturnPureFunction__Group__3 )
            // InternalFPML.g:4434:2: rule__ReturnPureFunction__Group__2__Impl rule__ReturnPureFunction__Group__3
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
    // InternalFPML.g:4441:1: rule__ReturnPureFunction__Group__2__Impl : ( ( rule__ReturnPureFunction__LambdaFunctionBodyAssignment_2 ) ) ;
    public final void rule__ReturnPureFunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4445:1: ( ( ( rule__ReturnPureFunction__LambdaFunctionBodyAssignment_2 ) ) )
            // InternalFPML.g:4446:1: ( ( rule__ReturnPureFunction__LambdaFunctionBodyAssignment_2 ) )
            {
            // InternalFPML.g:4446:1: ( ( rule__ReturnPureFunction__LambdaFunctionBodyAssignment_2 ) )
            // InternalFPML.g:4447:2: ( rule__ReturnPureFunction__LambdaFunctionBodyAssignment_2 )
            {
             before(grammarAccess.getReturnPureFunctionAccess().getLambdaFunctionBodyAssignment_2()); 
            // InternalFPML.g:4448:2: ( rule__ReturnPureFunction__LambdaFunctionBodyAssignment_2 )
            // InternalFPML.g:4448:3: rule__ReturnPureFunction__LambdaFunctionBodyAssignment_2
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
    // InternalFPML.g:4456:1: rule__ReturnPureFunction__Group__3 : rule__ReturnPureFunction__Group__3__Impl ;
    public final void rule__ReturnPureFunction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4460:1: ( rule__ReturnPureFunction__Group__3__Impl )
            // InternalFPML.g:4461:2: rule__ReturnPureFunction__Group__3__Impl
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
    // InternalFPML.g:4467:1: rule__ReturnPureFunction__Group__3__Impl : ( ')' ) ;
    public final void rule__ReturnPureFunction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4471:1: ( ( ')' ) )
            // InternalFPML.g:4472:1: ( ')' )
            {
            // InternalFPML.g:4472:1: ( ')' )
            // InternalFPML.g:4473:2: ')'
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
    // InternalFPML.g:4483:1: rule__ReturnEffectFullFunction__Group__0 : rule__ReturnEffectFullFunction__Group__0__Impl rule__ReturnEffectFullFunction__Group__1 ;
    public final void rule__ReturnEffectFullFunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4487:1: ( rule__ReturnEffectFullFunction__Group__0__Impl rule__ReturnEffectFullFunction__Group__1 )
            // InternalFPML.g:4488:2: rule__ReturnEffectFullFunction__Group__0__Impl rule__ReturnEffectFullFunction__Group__1
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
    // InternalFPML.g:4495:1: rule__ReturnEffectFullFunction__Group__0__Impl : ( '->' ) ;
    public final void rule__ReturnEffectFullFunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4499:1: ( ( '->' ) )
            // InternalFPML.g:4500:1: ( '->' )
            {
            // InternalFPML.g:4500:1: ( '->' )
            // InternalFPML.g:4501:2: '->'
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
    // InternalFPML.g:4510:1: rule__ReturnEffectFullFunction__Group__1 : rule__ReturnEffectFullFunction__Group__1__Impl rule__ReturnEffectFullFunction__Group__2 ;
    public final void rule__ReturnEffectFullFunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4514:1: ( rule__ReturnEffectFullFunction__Group__1__Impl rule__ReturnEffectFullFunction__Group__2 )
            // InternalFPML.g:4515:2: rule__ReturnEffectFullFunction__Group__1__Impl rule__ReturnEffectFullFunction__Group__2
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
    // InternalFPML.g:4522:1: rule__ReturnEffectFullFunction__Group__1__Impl : ( '(' ) ;
    public final void rule__ReturnEffectFullFunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4526:1: ( ( '(' ) )
            // InternalFPML.g:4527:1: ( '(' )
            {
            // InternalFPML.g:4527:1: ( '(' )
            // InternalFPML.g:4528:2: '('
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
    // InternalFPML.g:4537:1: rule__ReturnEffectFullFunction__Group__2 : rule__ReturnEffectFullFunction__Group__2__Impl rule__ReturnEffectFullFunction__Group__3 ;
    public final void rule__ReturnEffectFullFunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4541:1: ( rule__ReturnEffectFullFunction__Group__2__Impl rule__ReturnEffectFullFunction__Group__3 )
            // InternalFPML.g:4542:2: rule__ReturnEffectFullFunction__Group__2__Impl rule__ReturnEffectFullFunction__Group__3
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
    // InternalFPML.g:4549:1: rule__ReturnEffectFullFunction__Group__2__Impl : ( ( rule__ReturnEffectFullFunction__LambdaFunctionBodyAssignment_2 ) ) ;
    public final void rule__ReturnEffectFullFunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4553:1: ( ( ( rule__ReturnEffectFullFunction__LambdaFunctionBodyAssignment_2 ) ) )
            // InternalFPML.g:4554:1: ( ( rule__ReturnEffectFullFunction__LambdaFunctionBodyAssignment_2 ) )
            {
            // InternalFPML.g:4554:1: ( ( rule__ReturnEffectFullFunction__LambdaFunctionBodyAssignment_2 ) )
            // InternalFPML.g:4555:2: ( rule__ReturnEffectFullFunction__LambdaFunctionBodyAssignment_2 )
            {
             before(grammarAccess.getReturnEffectFullFunctionAccess().getLambdaFunctionBodyAssignment_2()); 
            // InternalFPML.g:4556:2: ( rule__ReturnEffectFullFunction__LambdaFunctionBodyAssignment_2 )
            // InternalFPML.g:4556:3: rule__ReturnEffectFullFunction__LambdaFunctionBodyAssignment_2
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
    // InternalFPML.g:4564:1: rule__ReturnEffectFullFunction__Group__3 : rule__ReturnEffectFullFunction__Group__3__Impl ;
    public final void rule__ReturnEffectFullFunction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4568:1: ( rule__ReturnEffectFullFunction__Group__3__Impl )
            // InternalFPML.g:4569:2: rule__ReturnEffectFullFunction__Group__3__Impl
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
    // InternalFPML.g:4575:1: rule__ReturnEffectFullFunction__Group__3__Impl : ( ')' ) ;
    public final void rule__ReturnEffectFullFunction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4579:1: ( ( ')' ) )
            // InternalFPML.g:4580:1: ( ')' )
            {
            // InternalFPML.g:4580:1: ( ')' )
            // InternalFPML.g:4581:2: ')'
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
    // InternalFPML.g:4591:1: rule__IOType__Group__0 : rule__IOType__Group__0__Impl rule__IOType__Group__1 ;
    public final void rule__IOType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4595:1: ( rule__IOType__Group__0__Impl rule__IOType__Group__1 )
            // InternalFPML.g:4596:2: rule__IOType__Group__0__Impl rule__IOType__Group__1
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
    // InternalFPML.g:4603:1: rule__IOType__Group__0__Impl : ( 'IO' ) ;
    public final void rule__IOType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4607:1: ( ( 'IO' ) )
            // InternalFPML.g:4608:1: ( 'IO' )
            {
            // InternalFPML.g:4608:1: ( 'IO' )
            // InternalFPML.g:4609:2: 'IO'
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
    // InternalFPML.g:4618:1: rule__IOType__Group__1 : rule__IOType__Group__1__Impl ;
    public final void rule__IOType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4622:1: ( rule__IOType__Group__1__Impl )
            // InternalFPML.g:4623:2: rule__IOType__Group__1__Impl
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
    // InternalFPML.g:4629:1: rule__IOType__Group__1__Impl : ( ( rule__IOType__TypeAssignment_1 ) ) ;
    public final void rule__IOType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4633:1: ( ( ( rule__IOType__TypeAssignment_1 ) ) )
            // InternalFPML.g:4634:1: ( ( rule__IOType__TypeAssignment_1 ) )
            {
            // InternalFPML.g:4634:1: ( ( rule__IOType__TypeAssignment_1 ) )
            // InternalFPML.g:4635:2: ( rule__IOType__TypeAssignment_1 )
            {
             before(grammarAccess.getIOTypeAccess().getTypeAssignment_1()); 
            // InternalFPML.g:4636:2: ( rule__IOType__TypeAssignment_1 )
            // InternalFPML.g:4636:3: rule__IOType__TypeAssignment_1
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
    // InternalFPML.g:4645:1: rule__IntegerType__Group__0 : rule__IntegerType__Group__0__Impl rule__IntegerType__Group__1 ;
    public final void rule__IntegerType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4649:1: ( rule__IntegerType__Group__0__Impl rule__IntegerType__Group__1 )
            // InternalFPML.g:4650:2: rule__IntegerType__Group__0__Impl rule__IntegerType__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalFPML.g:4657:1: rule__IntegerType__Group__0__Impl : ( () ) ;
    public final void rule__IntegerType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4661:1: ( ( () ) )
            // InternalFPML.g:4662:1: ( () )
            {
            // InternalFPML.g:4662:1: ( () )
            // InternalFPML.g:4663:2: ()
            {
             before(grammarAccess.getIntegerTypeAccess().getIntegerTypeAction_0()); 
            // InternalFPML.g:4664:2: ()
            // InternalFPML.g:4664:3: 
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
    // InternalFPML.g:4672:1: rule__IntegerType__Group__1 : rule__IntegerType__Group__1__Impl ;
    public final void rule__IntegerType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4676:1: ( rule__IntegerType__Group__1__Impl )
            // InternalFPML.g:4677:2: rule__IntegerType__Group__1__Impl
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
    // InternalFPML.g:4683:1: rule__IntegerType__Group__1__Impl : ( ( rule__IntegerType__TypeAssignment_1 ) ) ;
    public final void rule__IntegerType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4687:1: ( ( ( rule__IntegerType__TypeAssignment_1 ) ) )
            // InternalFPML.g:4688:1: ( ( rule__IntegerType__TypeAssignment_1 ) )
            {
            // InternalFPML.g:4688:1: ( ( rule__IntegerType__TypeAssignment_1 ) )
            // InternalFPML.g:4689:2: ( rule__IntegerType__TypeAssignment_1 )
            {
             before(grammarAccess.getIntegerTypeAccess().getTypeAssignment_1()); 
            // InternalFPML.g:4690:2: ( rule__IntegerType__TypeAssignment_1 )
            // InternalFPML.g:4690:3: rule__IntegerType__TypeAssignment_1
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
    // InternalFPML.g:4699:1: rule__StringType__Group__0 : rule__StringType__Group__0__Impl rule__StringType__Group__1 ;
    public final void rule__StringType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4703:1: ( rule__StringType__Group__0__Impl rule__StringType__Group__1 )
            // InternalFPML.g:4704:2: rule__StringType__Group__0__Impl rule__StringType__Group__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalFPML.g:4711:1: rule__StringType__Group__0__Impl : ( () ) ;
    public final void rule__StringType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4715:1: ( ( () ) )
            // InternalFPML.g:4716:1: ( () )
            {
            // InternalFPML.g:4716:1: ( () )
            // InternalFPML.g:4717:2: ()
            {
             before(grammarAccess.getStringTypeAccess().getStringTypeAction_0()); 
            // InternalFPML.g:4718:2: ()
            // InternalFPML.g:4718:3: 
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
    // InternalFPML.g:4726:1: rule__StringType__Group__1 : rule__StringType__Group__1__Impl ;
    public final void rule__StringType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4730:1: ( rule__StringType__Group__1__Impl )
            // InternalFPML.g:4731:2: rule__StringType__Group__1__Impl
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
    // InternalFPML.g:4737:1: rule__StringType__Group__1__Impl : ( ( rule__StringType__TypeAssignment_1 ) ) ;
    public final void rule__StringType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4741:1: ( ( ( rule__StringType__TypeAssignment_1 ) ) )
            // InternalFPML.g:4742:1: ( ( rule__StringType__TypeAssignment_1 ) )
            {
            // InternalFPML.g:4742:1: ( ( rule__StringType__TypeAssignment_1 ) )
            // InternalFPML.g:4743:2: ( rule__StringType__TypeAssignment_1 )
            {
             before(grammarAccess.getStringTypeAccess().getTypeAssignment_1()); 
            // InternalFPML.g:4744:2: ( rule__StringType__TypeAssignment_1 )
            // InternalFPML.g:4744:3: rule__StringType__TypeAssignment_1
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
    // InternalFPML.g:4753:1: rule__UnitType__Group__0 : rule__UnitType__Group__0__Impl rule__UnitType__Group__1 ;
    public final void rule__UnitType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4757:1: ( rule__UnitType__Group__0__Impl rule__UnitType__Group__1 )
            // InternalFPML.g:4758:2: rule__UnitType__Group__0__Impl rule__UnitType__Group__1
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
    // InternalFPML.g:4765:1: rule__UnitType__Group__0__Impl : ( () ) ;
    public final void rule__UnitType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4769:1: ( ( () ) )
            // InternalFPML.g:4770:1: ( () )
            {
            // InternalFPML.g:4770:1: ( () )
            // InternalFPML.g:4771:2: ()
            {
             before(grammarAccess.getUnitTypeAccess().getUnitTypeAction_0()); 
            // InternalFPML.g:4772:2: ()
            // InternalFPML.g:4772:3: 
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
    // InternalFPML.g:4780:1: rule__UnitType__Group__1 : rule__UnitType__Group__1__Impl ;
    public final void rule__UnitType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4784:1: ( rule__UnitType__Group__1__Impl )
            // InternalFPML.g:4785:2: rule__UnitType__Group__1__Impl
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
    // InternalFPML.g:4791:1: rule__UnitType__Group__1__Impl : ( ( rule__UnitType__TypeAssignment_1 ) ) ;
    public final void rule__UnitType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4795:1: ( ( ( rule__UnitType__TypeAssignment_1 ) ) )
            // InternalFPML.g:4796:1: ( ( rule__UnitType__TypeAssignment_1 ) )
            {
            // InternalFPML.g:4796:1: ( ( rule__UnitType__TypeAssignment_1 ) )
            // InternalFPML.g:4797:2: ( rule__UnitType__TypeAssignment_1 )
            {
             before(grammarAccess.getUnitTypeAccess().getTypeAssignment_1()); 
            // InternalFPML.g:4798:2: ( rule__UnitType__TypeAssignment_1 )
            // InternalFPML.g:4798:3: rule__UnitType__TypeAssignment_1
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
    // InternalFPML.g:4807:1: rule__DataType__Group__0 : rule__DataType__Group__0__Impl rule__DataType__Group__1 ;
    public final void rule__DataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4811:1: ( rule__DataType__Group__0__Impl rule__DataType__Group__1 )
            // InternalFPML.g:4812:2: rule__DataType__Group__0__Impl rule__DataType__Group__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalFPML.g:4819:1: rule__DataType__Group__0__Impl : ( () ) ;
    public final void rule__DataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4823:1: ( ( () ) )
            // InternalFPML.g:4824:1: ( () )
            {
            // InternalFPML.g:4824:1: ( () )
            // InternalFPML.g:4825:2: ()
            {
             before(grammarAccess.getDataTypeAccess().getDataTypeAction_0()); 
            // InternalFPML.g:4826:2: ()
            // InternalFPML.g:4826:3: 
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
    // InternalFPML.g:4834:1: rule__DataType__Group__1 : rule__DataType__Group__1__Impl rule__DataType__Group__2 ;
    public final void rule__DataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4838:1: ( rule__DataType__Group__1__Impl rule__DataType__Group__2 )
            // InternalFPML.g:4839:2: rule__DataType__Group__1__Impl rule__DataType__Group__2
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
    // InternalFPML.g:4846:1: rule__DataType__Group__1__Impl : ( 'ref' ) ;
    public final void rule__DataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4850:1: ( ( 'ref' ) )
            // InternalFPML.g:4851:1: ( 'ref' )
            {
            // InternalFPML.g:4851:1: ( 'ref' )
            // InternalFPML.g:4852:2: 'ref'
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
    // InternalFPML.g:4861:1: rule__DataType__Group__2 : rule__DataType__Group__2__Impl ;
    public final void rule__DataType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4865:1: ( rule__DataType__Group__2__Impl )
            // InternalFPML.g:4866:2: rule__DataType__Group__2__Impl
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
    // InternalFPML.g:4872:1: rule__DataType__Group__2__Impl : ( ( rule__DataType__TypeAssignment_2 ) ) ;
    public final void rule__DataType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4876:1: ( ( ( rule__DataType__TypeAssignment_2 ) ) )
            // InternalFPML.g:4877:1: ( ( rule__DataType__TypeAssignment_2 ) )
            {
            // InternalFPML.g:4877:1: ( ( rule__DataType__TypeAssignment_2 ) )
            // InternalFPML.g:4878:2: ( rule__DataType__TypeAssignment_2 )
            {
             before(grammarAccess.getDataTypeAccess().getTypeAssignment_2()); 
            // InternalFPML.g:4879:2: ( rule__DataType__TypeAssignment_2 )
            // InternalFPML.g:4879:3: rule__DataType__TypeAssignment_2
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
    // InternalFPML.g:4888:1: rule__PureFunctionType__Group__0 : rule__PureFunctionType__Group__0__Impl rule__PureFunctionType__Group__1 ;
    public final void rule__PureFunctionType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4892:1: ( rule__PureFunctionType__Group__0__Impl rule__PureFunctionType__Group__1 )
            // InternalFPML.g:4893:2: rule__PureFunctionType__Group__0__Impl rule__PureFunctionType__Group__1
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
    // InternalFPML.g:4900:1: rule__PureFunctionType__Group__0__Impl : ( () ) ;
    public final void rule__PureFunctionType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4904:1: ( ( () ) )
            // InternalFPML.g:4905:1: ( () )
            {
            // InternalFPML.g:4905:1: ( () )
            // InternalFPML.g:4906:2: ()
            {
             before(grammarAccess.getPureFunctionTypeAccess().getPureFunctionTypeAction_0()); 
            // InternalFPML.g:4907:2: ()
            // InternalFPML.g:4907:3: 
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
    // InternalFPML.g:4915:1: rule__PureFunctionType__Group__1 : rule__PureFunctionType__Group__1__Impl rule__PureFunctionType__Group__2 ;
    public final void rule__PureFunctionType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4919:1: ( rule__PureFunctionType__Group__1__Impl rule__PureFunctionType__Group__2 )
            // InternalFPML.g:4920:2: rule__PureFunctionType__Group__1__Impl rule__PureFunctionType__Group__2
            {
            pushFollow(FOLLOW_39);
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
    // InternalFPML.g:4927:1: rule__PureFunctionType__Group__1__Impl : ( 'F' ) ;
    public final void rule__PureFunctionType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4931:1: ( ( 'F' ) )
            // InternalFPML.g:4932:1: ( 'F' )
            {
            // InternalFPML.g:4932:1: ( 'F' )
            // InternalFPML.g:4933:2: 'F'
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
    // InternalFPML.g:4942:1: rule__PureFunctionType__Group__2 : rule__PureFunctionType__Group__2__Impl rule__PureFunctionType__Group__3 ;
    public final void rule__PureFunctionType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4946:1: ( rule__PureFunctionType__Group__2__Impl rule__PureFunctionType__Group__3 )
            // InternalFPML.g:4947:2: rule__PureFunctionType__Group__2__Impl rule__PureFunctionType__Group__3
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
    // InternalFPML.g:4954:1: rule__PureFunctionType__Group__2__Impl : ( '<' ) ;
    public final void rule__PureFunctionType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4958:1: ( ( '<' ) )
            // InternalFPML.g:4959:1: ( '<' )
            {
            // InternalFPML.g:4959:1: ( '<' )
            // InternalFPML.g:4960:2: '<'
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
    // InternalFPML.g:4969:1: rule__PureFunctionType__Group__3 : rule__PureFunctionType__Group__3__Impl rule__PureFunctionType__Group__4 ;
    public final void rule__PureFunctionType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4973:1: ( rule__PureFunctionType__Group__3__Impl rule__PureFunctionType__Group__4 )
            // InternalFPML.g:4974:2: rule__PureFunctionType__Group__3__Impl rule__PureFunctionType__Group__4
            {
            pushFollow(FOLLOW_40);
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
    // InternalFPML.g:4981:1: rule__PureFunctionType__Group__3__Impl : ( ( rule__PureFunctionType__ArgTypeAssignment_3 ) ) ;
    public final void rule__PureFunctionType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4985:1: ( ( ( rule__PureFunctionType__ArgTypeAssignment_3 ) ) )
            // InternalFPML.g:4986:1: ( ( rule__PureFunctionType__ArgTypeAssignment_3 ) )
            {
            // InternalFPML.g:4986:1: ( ( rule__PureFunctionType__ArgTypeAssignment_3 ) )
            // InternalFPML.g:4987:2: ( rule__PureFunctionType__ArgTypeAssignment_3 )
            {
             before(grammarAccess.getPureFunctionTypeAccess().getArgTypeAssignment_3()); 
            // InternalFPML.g:4988:2: ( rule__PureFunctionType__ArgTypeAssignment_3 )
            // InternalFPML.g:4988:3: rule__PureFunctionType__ArgTypeAssignment_3
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
    // InternalFPML.g:4996:1: rule__PureFunctionType__Group__4 : rule__PureFunctionType__Group__4__Impl rule__PureFunctionType__Group__5 ;
    public final void rule__PureFunctionType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5000:1: ( rule__PureFunctionType__Group__4__Impl rule__PureFunctionType__Group__5 )
            // InternalFPML.g:5001:2: rule__PureFunctionType__Group__4__Impl rule__PureFunctionType__Group__5
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
    // InternalFPML.g:5008:1: rule__PureFunctionType__Group__4__Impl : ( ',' ) ;
    public final void rule__PureFunctionType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5012:1: ( ( ',' ) )
            // InternalFPML.g:5013:1: ( ',' )
            {
            // InternalFPML.g:5013:1: ( ',' )
            // InternalFPML.g:5014:2: ','
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
    // InternalFPML.g:5023:1: rule__PureFunctionType__Group__5 : rule__PureFunctionType__Group__5__Impl rule__PureFunctionType__Group__6 ;
    public final void rule__PureFunctionType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5027:1: ( rule__PureFunctionType__Group__5__Impl rule__PureFunctionType__Group__6 )
            // InternalFPML.g:5028:2: rule__PureFunctionType__Group__5__Impl rule__PureFunctionType__Group__6
            {
            pushFollow(FOLLOW_41);
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
    // InternalFPML.g:5035:1: rule__PureFunctionType__Group__5__Impl : ( ( rule__PureFunctionType__ReturnTypeAssignment_5 ) ) ;
    public final void rule__PureFunctionType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5039:1: ( ( ( rule__PureFunctionType__ReturnTypeAssignment_5 ) ) )
            // InternalFPML.g:5040:1: ( ( rule__PureFunctionType__ReturnTypeAssignment_5 ) )
            {
            // InternalFPML.g:5040:1: ( ( rule__PureFunctionType__ReturnTypeAssignment_5 ) )
            // InternalFPML.g:5041:2: ( rule__PureFunctionType__ReturnTypeAssignment_5 )
            {
             before(grammarAccess.getPureFunctionTypeAccess().getReturnTypeAssignment_5()); 
            // InternalFPML.g:5042:2: ( rule__PureFunctionType__ReturnTypeAssignment_5 )
            // InternalFPML.g:5042:3: rule__PureFunctionType__ReturnTypeAssignment_5
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
    // InternalFPML.g:5050:1: rule__PureFunctionType__Group__6 : rule__PureFunctionType__Group__6__Impl ;
    public final void rule__PureFunctionType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5054:1: ( rule__PureFunctionType__Group__6__Impl )
            // InternalFPML.g:5055:2: rule__PureFunctionType__Group__6__Impl
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
    // InternalFPML.g:5061:1: rule__PureFunctionType__Group__6__Impl : ( '>' ) ;
    public final void rule__PureFunctionType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5065:1: ( ( '>' ) )
            // InternalFPML.g:5066:1: ( '>' )
            {
            // InternalFPML.g:5066:1: ( '>' )
            // InternalFPML.g:5067:2: '>'
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
    // InternalFPML.g:5077:1: rule__EffectFullFunctionType__Group__0 : rule__EffectFullFunctionType__Group__0__Impl rule__EffectFullFunctionType__Group__1 ;
    public final void rule__EffectFullFunctionType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5081:1: ( rule__EffectFullFunctionType__Group__0__Impl rule__EffectFullFunctionType__Group__1 )
            // InternalFPML.g:5082:2: rule__EffectFullFunctionType__Group__0__Impl rule__EffectFullFunctionType__Group__1
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
    // InternalFPML.g:5089:1: rule__EffectFullFunctionType__Group__0__Impl : ( () ) ;
    public final void rule__EffectFullFunctionType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5093:1: ( ( () ) )
            // InternalFPML.g:5094:1: ( () )
            {
            // InternalFPML.g:5094:1: ( () )
            // InternalFPML.g:5095:2: ()
            {
             before(grammarAccess.getEffectFullFunctionTypeAccess().getEffectFullFunctionTypeAction_0()); 
            // InternalFPML.g:5096:2: ()
            // InternalFPML.g:5096:3: 
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
    // InternalFPML.g:5104:1: rule__EffectFullFunctionType__Group__1 : rule__EffectFullFunctionType__Group__1__Impl rule__EffectFullFunctionType__Group__2 ;
    public final void rule__EffectFullFunctionType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5108:1: ( rule__EffectFullFunctionType__Group__1__Impl rule__EffectFullFunctionType__Group__2 )
            // InternalFPML.g:5109:2: rule__EffectFullFunctionType__Group__1__Impl rule__EffectFullFunctionType__Group__2
            {
            pushFollow(FOLLOW_39);
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
    // InternalFPML.g:5116:1: rule__EffectFullFunctionType__Group__1__Impl : ( 'FIO' ) ;
    public final void rule__EffectFullFunctionType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5120:1: ( ( 'FIO' ) )
            // InternalFPML.g:5121:1: ( 'FIO' )
            {
            // InternalFPML.g:5121:1: ( 'FIO' )
            // InternalFPML.g:5122:2: 'FIO'
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
    // InternalFPML.g:5131:1: rule__EffectFullFunctionType__Group__2 : rule__EffectFullFunctionType__Group__2__Impl rule__EffectFullFunctionType__Group__3 ;
    public final void rule__EffectFullFunctionType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5135:1: ( rule__EffectFullFunctionType__Group__2__Impl rule__EffectFullFunctionType__Group__3 )
            // InternalFPML.g:5136:2: rule__EffectFullFunctionType__Group__2__Impl rule__EffectFullFunctionType__Group__3
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
    // InternalFPML.g:5143:1: rule__EffectFullFunctionType__Group__2__Impl : ( '<' ) ;
    public final void rule__EffectFullFunctionType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5147:1: ( ( '<' ) )
            // InternalFPML.g:5148:1: ( '<' )
            {
            // InternalFPML.g:5148:1: ( '<' )
            // InternalFPML.g:5149:2: '<'
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
    // InternalFPML.g:5158:1: rule__EffectFullFunctionType__Group__3 : rule__EffectFullFunctionType__Group__3__Impl rule__EffectFullFunctionType__Group__4 ;
    public final void rule__EffectFullFunctionType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5162:1: ( rule__EffectFullFunctionType__Group__3__Impl rule__EffectFullFunctionType__Group__4 )
            // InternalFPML.g:5163:2: rule__EffectFullFunctionType__Group__3__Impl rule__EffectFullFunctionType__Group__4
            {
            pushFollow(FOLLOW_40);
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
    // InternalFPML.g:5170:1: rule__EffectFullFunctionType__Group__3__Impl : ( ( rule__EffectFullFunctionType__ArgTypeAssignment_3 ) ) ;
    public final void rule__EffectFullFunctionType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5174:1: ( ( ( rule__EffectFullFunctionType__ArgTypeAssignment_3 ) ) )
            // InternalFPML.g:5175:1: ( ( rule__EffectFullFunctionType__ArgTypeAssignment_3 ) )
            {
            // InternalFPML.g:5175:1: ( ( rule__EffectFullFunctionType__ArgTypeAssignment_3 ) )
            // InternalFPML.g:5176:2: ( rule__EffectFullFunctionType__ArgTypeAssignment_3 )
            {
             before(grammarAccess.getEffectFullFunctionTypeAccess().getArgTypeAssignment_3()); 
            // InternalFPML.g:5177:2: ( rule__EffectFullFunctionType__ArgTypeAssignment_3 )
            // InternalFPML.g:5177:3: rule__EffectFullFunctionType__ArgTypeAssignment_3
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
    // InternalFPML.g:5185:1: rule__EffectFullFunctionType__Group__4 : rule__EffectFullFunctionType__Group__4__Impl rule__EffectFullFunctionType__Group__5 ;
    public final void rule__EffectFullFunctionType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5189:1: ( rule__EffectFullFunctionType__Group__4__Impl rule__EffectFullFunctionType__Group__5 )
            // InternalFPML.g:5190:2: rule__EffectFullFunctionType__Group__4__Impl rule__EffectFullFunctionType__Group__5
            {
            pushFollow(FOLLOW_24);
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
    // InternalFPML.g:5197:1: rule__EffectFullFunctionType__Group__4__Impl : ( ',' ) ;
    public final void rule__EffectFullFunctionType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5201:1: ( ( ',' ) )
            // InternalFPML.g:5202:1: ( ',' )
            {
            // InternalFPML.g:5202:1: ( ',' )
            // InternalFPML.g:5203:2: ','
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
    // InternalFPML.g:5212:1: rule__EffectFullFunctionType__Group__5 : rule__EffectFullFunctionType__Group__5__Impl rule__EffectFullFunctionType__Group__6 ;
    public final void rule__EffectFullFunctionType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5216:1: ( rule__EffectFullFunctionType__Group__5__Impl rule__EffectFullFunctionType__Group__6 )
            // InternalFPML.g:5217:2: rule__EffectFullFunctionType__Group__5__Impl rule__EffectFullFunctionType__Group__6
            {
            pushFollow(FOLLOW_41);
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
    // InternalFPML.g:5224:1: rule__EffectFullFunctionType__Group__5__Impl : ( ( rule__EffectFullFunctionType__ReturnTypeAssignment_5 ) ) ;
    public final void rule__EffectFullFunctionType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5228:1: ( ( ( rule__EffectFullFunctionType__ReturnTypeAssignment_5 ) ) )
            // InternalFPML.g:5229:1: ( ( rule__EffectFullFunctionType__ReturnTypeAssignment_5 ) )
            {
            // InternalFPML.g:5229:1: ( ( rule__EffectFullFunctionType__ReturnTypeAssignment_5 ) )
            // InternalFPML.g:5230:2: ( rule__EffectFullFunctionType__ReturnTypeAssignment_5 )
            {
             before(grammarAccess.getEffectFullFunctionTypeAccess().getReturnTypeAssignment_5()); 
            // InternalFPML.g:5231:2: ( rule__EffectFullFunctionType__ReturnTypeAssignment_5 )
            // InternalFPML.g:5231:3: rule__EffectFullFunctionType__ReturnTypeAssignment_5
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
    // InternalFPML.g:5239:1: rule__EffectFullFunctionType__Group__6 : rule__EffectFullFunctionType__Group__6__Impl ;
    public final void rule__EffectFullFunctionType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5243:1: ( rule__EffectFullFunctionType__Group__6__Impl )
            // InternalFPML.g:5244:2: rule__EffectFullFunctionType__Group__6__Impl
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
    // InternalFPML.g:5250:1: rule__EffectFullFunctionType__Group__6__Impl : ( '>' ) ;
    public final void rule__EffectFullFunctionType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5254:1: ( ( '>' ) )
            // InternalFPML.g:5255:1: ( '>' )
            {
            // InternalFPML.g:5255:1: ( '>' )
            // InternalFPML.g:5256:2: '>'
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
    // InternalFPML.g:5266:1: rule__IntValue__Group__0 : rule__IntValue__Group__0__Impl rule__IntValue__Group__1 ;
    public final void rule__IntValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5270:1: ( rule__IntValue__Group__0__Impl rule__IntValue__Group__1 )
            // InternalFPML.g:5271:2: rule__IntValue__Group__0__Impl rule__IntValue__Group__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalFPML.g:5278:1: rule__IntValue__Group__0__Impl : ( () ) ;
    public final void rule__IntValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5282:1: ( ( () ) )
            // InternalFPML.g:5283:1: ( () )
            {
            // InternalFPML.g:5283:1: ( () )
            // InternalFPML.g:5284:2: ()
            {
             before(grammarAccess.getIntValueAccess().getIntegerTypeAction_0()); 
            // InternalFPML.g:5285:2: ()
            // InternalFPML.g:5285:3: 
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
    // InternalFPML.g:5293:1: rule__IntValue__Group__1 : rule__IntValue__Group__1__Impl ;
    public final void rule__IntValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5297:1: ( rule__IntValue__Group__1__Impl )
            // InternalFPML.g:5298:2: rule__IntValue__Group__1__Impl
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
    // InternalFPML.g:5304:1: rule__IntValue__Group__1__Impl : ( ( rule__IntValue__ValueAssignment_1 ) ) ;
    public final void rule__IntValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5308:1: ( ( ( rule__IntValue__ValueAssignment_1 ) ) )
            // InternalFPML.g:5309:1: ( ( rule__IntValue__ValueAssignment_1 ) )
            {
            // InternalFPML.g:5309:1: ( ( rule__IntValue__ValueAssignment_1 ) )
            // InternalFPML.g:5310:2: ( rule__IntValue__ValueAssignment_1 )
            {
             before(grammarAccess.getIntValueAccess().getValueAssignment_1()); 
            // InternalFPML.g:5311:2: ( rule__IntValue__ValueAssignment_1 )
            // InternalFPML.g:5311:3: rule__IntValue__ValueAssignment_1
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
    // InternalFPML.g:5320:1: rule__StringValue__Group__0 : rule__StringValue__Group__0__Impl rule__StringValue__Group__1 ;
    public final void rule__StringValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5324:1: ( rule__StringValue__Group__0__Impl rule__StringValue__Group__1 )
            // InternalFPML.g:5325:2: rule__StringValue__Group__0__Impl rule__StringValue__Group__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalFPML.g:5332:1: rule__StringValue__Group__0__Impl : ( () ) ;
    public final void rule__StringValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5336:1: ( ( () ) )
            // InternalFPML.g:5337:1: ( () )
            {
            // InternalFPML.g:5337:1: ( () )
            // InternalFPML.g:5338:2: ()
            {
             before(grammarAccess.getStringValueAccess().getStringTypeAction_0()); 
            // InternalFPML.g:5339:2: ()
            // InternalFPML.g:5339:3: 
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
    // InternalFPML.g:5347:1: rule__StringValue__Group__1 : rule__StringValue__Group__1__Impl ;
    public final void rule__StringValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5351:1: ( rule__StringValue__Group__1__Impl )
            // InternalFPML.g:5352:2: rule__StringValue__Group__1__Impl
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
    // InternalFPML.g:5358:1: rule__StringValue__Group__1__Impl : ( ( rule__StringValue__ValueAssignment_1 ) ) ;
    public final void rule__StringValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5362:1: ( ( ( rule__StringValue__ValueAssignment_1 ) ) )
            // InternalFPML.g:5363:1: ( ( rule__StringValue__ValueAssignment_1 ) )
            {
            // InternalFPML.g:5363:1: ( ( rule__StringValue__ValueAssignment_1 ) )
            // InternalFPML.g:5364:2: ( rule__StringValue__ValueAssignment_1 )
            {
             before(grammarAccess.getStringValueAccess().getValueAssignment_1()); 
            // InternalFPML.g:5365:2: ( rule__StringValue__ValueAssignment_1 )
            // InternalFPML.g:5365:3: rule__StringValue__ValueAssignment_1
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
    // InternalFPML.g:5374:1: rule__UnitValue__Group__0 : rule__UnitValue__Group__0__Impl rule__UnitValue__Group__1 ;
    public final void rule__UnitValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5378:1: ( rule__UnitValue__Group__0__Impl rule__UnitValue__Group__1 )
            // InternalFPML.g:5379:2: rule__UnitValue__Group__0__Impl rule__UnitValue__Group__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalFPML.g:5386:1: rule__UnitValue__Group__0__Impl : ( () ) ;
    public final void rule__UnitValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5390:1: ( ( () ) )
            // InternalFPML.g:5391:1: ( () )
            {
            // InternalFPML.g:5391:1: ( () )
            // InternalFPML.g:5392:2: ()
            {
             before(grammarAccess.getUnitValueAccess().getUnitTypeAction_0()); 
            // InternalFPML.g:5393:2: ()
            // InternalFPML.g:5393:3: 
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
    // InternalFPML.g:5401:1: rule__UnitValue__Group__1 : rule__UnitValue__Group__1__Impl ;
    public final void rule__UnitValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5405:1: ( rule__UnitValue__Group__1__Impl )
            // InternalFPML.g:5406:2: rule__UnitValue__Group__1__Impl
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
    // InternalFPML.g:5412:1: rule__UnitValue__Group__1__Impl : ( '()' ) ;
    public final void rule__UnitValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5416:1: ( ( '()' ) )
            // InternalFPML.g:5417:1: ( '()' )
            {
            // InternalFPML.g:5417:1: ( '()' )
            // InternalFPML.g:5418:2: '()'
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
    // InternalFPML.g:5428:1: rule__DataValue__Group__0 : rule__DataValue__Group__0__Impl rule__DataValue__Group__1 ;
    public final void rule__DataValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5432:1: ( rule__DataValue__Group__0__Impl rule__DataValue__Group__1 )
            // InternalFPML.g:5433:2: rule__DataValue__Group__0__Impl rule__DataValue__Group__1
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
    // InternalFPML.g:5440:1: rule__DataValue__Group__0__Impl : ( () ) ;
    public final void rule__DataValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5444:1: ( ( () ) )
            // InternalFPML.g:5445:1: ( () )
            {
            // InternalFPML.g:5445:1: ( () )
            // InternalFPML.g:5446:2: ()
            {
             before(grammarAccess.getDataValueAccess().getDataValueAction_0()); 
            // InternalFPML.g:5447:2: ()
            // InternalFPML.g:5447:3: 
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
    // InternalFPML.g:5455:1: rule__DataValue__Group__1 : rule__DataValue__Group__1__Impl rule__DataValue__Group__2 ;
    public final void rule__DataValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5459:1: ( rule__DataValue__Group__1__Impl rule__DataValue__Group__2 )
            // InternalFPML.g:5460:2: rule__DataValue__Group__1__Impl rule__DataValue__Group__2
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
    // InternalFPML.g:5467:1: rule__DataValue__Group__1__Impl : ( ( rule__DataValue__TypeAssignment_1 ) ) ;
    public final void rule__DataValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5471:1: ( ( ( rule__DataValue__TypeAssignment_1 ) ) )
            // InternalFPML.g:5472:1: ( ( rule__DataValue__TypeAssignment_1 ) )
            {
            // InternalFPML.g:5472:1: ( ( rule__DataValue__TypeAssignment_1 ) )
            // InternalFPML.g:5473:2: ( rule__DataValue__TypeAssignment_1 )
            {
             before(grammarAccess.getDataValueAccess().getTypeAssignment_1()); 
            // InternalFPML.g:5474:2: ( rule__DataValue__TypeAssignment_1 )
            // InternalFPML.g:5474:3: rule__DataValue__TypeAssignment_1
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
    // InternalFPML.g:5482:1: rule__DataValue__Group__2 : rule__DataValue__Group__2__Impl rule__DataValue__Group__3 ;
    public final void rule__DataValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5486:1: ( rule__DataValue__Group__2__Impl rule__DataValue__Group__3 )
            // InternalFPML.g:5487:2: rule__DataValue__Group__2__Impl rule__DataValue__Group__3
            {
            pushFollow(FOLLOW_45);
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
    // InternalFPML.g:5494:1: rule__DataValue__Group__2__Impl : ( '(' ) ;
    public final void rule__DataValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5498:1: ( ( '(' ) )
            // InternalFPML.g:5499:1: ( '(' )
            {
            // InternalFPML.g:5499:1: ( '(' )
            // InternalFPML.g:5500:2: '('
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
    // InternalFPML.g:5509:1: rule__DataValue__Group__3 : rule__DataValue__Group__3__Impl rule__DataValue__Group__4 ;
    public final void rule__DataValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5513:1: ( rule__DataValue__Group__3__Impl rule__DataValue__Group__4 )
            // InternalFPML.g:5514:2: rule__DataValue__Group__3__Impl rule__DataValue__Group__4
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
    // InternalFPML.g:5521:1: rule__DataValue__Group__3__Impl : ( ( rule__DataValue__ValueAssignment_3 ) ) ;
    public final void rule__DataValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5525:1: ( ( ( rule__DataValue__ValueAssignment_3 ) ) )
            // InternalFPML.g:5526:1: ( ( rule__DataValue__ValueAssignment_3 ) )
            {
            // InternalFPML.g:5526:1: ( ( rule__DataValue__ValueAssignment_3 ) )
            // InternalFPML.g:5527:2: ( rule__DataValue__ValueAssignment_3 )
            {
             before(grammarAccess.getDataValueAccess().getValueAssignment_3()); 
            // InternalFPML.g:5528:2: ( rule__DataValue__ValueAssignment_3 )
            // InternalFPML.g:5528:3: rule__DataValue__ValueAssignment_3
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
    // InternalFPML.g:5536:1: rule__DataValue__Group__4 : rule__DataValue__Group__4__Impl ;
    public final void rule__DataValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5540:1: ( rule__DataValue__Group__4__Impl )
            // InternalFPML.g:5541:2: rule__DataValue__Group__4__Impl
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
    // InternalFPML.g:5547:1: rule__DataValue__Group__4__Impl : ( ')' ) ;
    public final void rule__DataValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5551:1: ( ( ')' ) )
            // InternalFPML.g:5552:1: ( ')' )
            {
            // InternalFPML.g:5552:1: ( ')' )
            // InternalFPML.g:5553:2: ')'
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
    // InternalFPML.g:5563:1: rule__ValueRef__Group__0 : rule__ValueRef__Group__0__Impl rule__ValueRef__Group__1 ;
    public final void rule__ValueRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5567:1: ( rule__ValueRef__Group__0__Impl rule__ValueRef__Group__1 )
            // InternalFPML.g:5568:2: rule__ValueRef__Group__0__Impl rule__ValueRef__Group__1
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
    // InternalFPML.g:5575:1: rule__ValueRef__Group__0__Impl : ( () ) ;
    public final void rule__ValueRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5579:1: ( ( () ) )
            // InternalFPML.g:5580:1: ( () )
            {
            // InternalFPML.g:5580:1: ( () )
            // InternalFPML.g:5581:2: ()
            {
             before(grammarAccess.getValueRefAccess().getValueRefAction_0()); 
            // InternalFPML.g:5582:2: ()
            // InternalFPML.g:5582:3: 
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
    // InternalFPML.g:5590:1: rule__ValueRef__Group__1 : rule__ValueRef__Group__1__Impl ;
    public final void rule__ValueRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5594:1: ( rule__ValueRef__Group__1__Impl )
            // InternalFPML.g:5595:2: rule__ValueRef__Group__1__Impl
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
    // InternalFPML.g:5601:1: rule__ValueRef__Group__1__Impl : ( ( rule__ValueRef__ValueAssignment_1 ) ) ;
    public final void rule__ValueRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5605:1: ( ( ( rule__ValueRef__ValueAssignment_1 ) ) )
            // InternalFPML.g:5606:1: ( ( rule__ValueRef__ValueAssignment_1 ) )
            {
            // InternalFPML.g:5606:1: ( ( rule__ValueRef__ValueAssignment_1 ) )
            // InternalFPML.g:5607:2: ( rule__ValueRef__ValueAssignment_1 )
            {
             before(grammarAccess.getValueRefAccess().getValueAssignment_1()); 
            // InternalFPML.g:5608:2: ( rule__ValueRef__ValueAssignment_1 )
            // InternalFPML.g:5608:3: rule__ValueRef__ValueAssignment_1
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
    // InternalFPML.g:5617:1: rule__PureLambda__Group__0 : rule__PureLambda__Group__0__Impl rule__PureLambda__Group__1 ;
    public final void rule__PureLambda__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5621:1: ( rule__PureLambda__Group__0__Impl rule__PureLambda__Group__1 )
            // InternalFPML.g:5622:2: rule__PureLambda__Group__0__Impl rule__PureLambda__Group__1
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
    // InternalFPML.g:5629:1: rule__PureLambda__Group__0__Impl : ( '(' ) ;
    public final void rule__PureLambda__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5633:1: ( ( '(' ) )
            // InternalFPML.g:5634:1: ( '(' )
            {
            // InternalFPML.g:5634:1: ( '(' )
            // InternalFPML.g:5635:2: '('
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
    // InternalFPML.g:5644:1: rule__PureLambda__Group__1 : rule__PureLambda__Group__1__Impl rule__PureLambda__Group__2 ;
    public final void rule__PureLambda__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5648:1: ( rule__PureLambda__Group__1__Impl rule__PureLambda__Group__2 )
            // InternalFPML.g:5649:2: rule__PureLambda__Group__1__Impl rule__PureLambda__Group__2
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
    // InternalFPML.g:5656:1: rule__PureLambda__Group__1__Impl : ( ( rule__PureLambda__ArgAssignment_1 ) ) ;
    public final void rule__PureLambda__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5660:1: ( ( ( rule__PureLambda__ArgAssignment_1 ) ) )
            // InternalFPML.g:5661:1: ( ( rule__PureLambda__ArgAssignment_1 ) )
            {
            // InternalFPML.g:5661:1: ( ( rule__PureLambda__ArgAssignment_1 ) )
            // InternalFPML.g:5662:2: ( rule__PureLambda__ArgAssignment_1 )
            {
             before(grammarAccess.getPureLambdaAccess().getArgAssignment_1()); 
            // InternalFPML.g:5663:2: ( rule__PureLambda__ArgAssignment_1 )
            // InternalFPML.g:5663:3: rule__PureLambda__ArgAssignment_1
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
    // InternalFPML.g:5671:1: rule__PureLambda__Group__2 : rule__PureLambda__Group__2__Impl rule__PureLambda__Group__3 ;
    public final void rule__PureLambda__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5675:1: ( rule__PureLambda__Group__2__Impl rule__PureLambda__Group__3 )
            // InternalFPML.g:5676:2: rule__PureLambda__Group__2__Impl rule__PureLambda__Group__3
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
    // InternalFPML.g:5683:1: rule__PureLambda__Group__2__Impl : ( ')' ) ;
    public final void rule__PureLambda__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5687:1: ( ( ')' ) )
            // InternalFPML.g:5688:1: ( ')' )
            {
            // InternalFPML.g:5688:1: ( ')' )
            // InternalFPML.g:5689:2: ')'
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
    // InternalFPML.g:5698:1: rule__PureLambda__Group__3 : rule__PureLambda__Group__3__Impl rule__PureLambda__Group__4 ;
    public final void rule__PureLambda__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5702:1: ( rule__PureLambda__Group__3__Impl rule__PureLambda__Group__4 )
            // InternalFPML.g:5703:2: rule__PureLambda__Group__3__Impl rule__PureLambda__Group__4
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
    // InternalFPML.g:5710:1: rule__PureLambda__Group__3__Impl : ( ':' ) ;
    public final void rule__PureLambda__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5714:1: ( ( ':' ) )
            // InternalFPML.g:5715:1: ( ':' )
            {
            // InternalFPML.g:5715:1: ( ':' )
            // InternalFPML.g:5716:2: ':'
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
    // InternalFPML.g:5725:1: rule__PureLambda__Group__4 : rule__PureLambda__Group__4__Impl ;
    public final void rule__PureLambda__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5729:1: ( rule__PureLambda__Group__4__Impl )
            // InternalFPML.g:5730:2: rule__PureLambda__Group__4__Impl
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
    // InternalFPML.g:5736:1: rule__PureLambda__Group__4__Impl : ( ( rule__PureLambda__FunctionBodyAssignment_4 ) ) ;
    public final void rule__PureLambda__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5740:1: ( ( ( rule__PureLambda__FunctionBodyAssignment_4 ) ) )
            // InternalFPML.g:5741:1: ( ( rule__PureLambda__FunctionBodyAssignment_4 ) )
            {
            // InternalFPML.g:5741:1: ( ( rule__PureLambda__FunctionBodyAssignment_4 ) )
            // InternalFPML.g:5742:2: ( rule__PureLambda__FunctionBodyAssignment_4 )
            {
             before(grammarAccess.getPureLambdaAccess().getFunctionBodyAssignment_4()); 
            // InternalFPML.g:5743:2: ( rule__PureLambda__FunctionBodyAssignment_4 )
            // InternalFPML.g:5743:3: rule__PureLambda__FunctionBodyAssignment_4
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
    // InternalFPML.g:5752:1: rule__EffectFullLambda__Group__0 : rule__EffectFullLambda__Group__0__Impl rule__EffectFullLambda__Group__1 ;
    public final void rule__EffectFullLambda__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5756:1: ( rule__EffectFullLambda__Group__0__Impl rule__EffectFullLambda__Group__1 )
            // InternalFPML.g:5757:2: rule__EffectFullLambda__Group__0__Impl rule__EffectFullLambda__Group__1
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
    // InternalFPML.g:5764:1: rule__EffectFullLambda__Group__0__Impl : ( '(' ) ;
    public final void rule__EffectFullLambda__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5768:1: ( ( '(' ) )
            // InternalFPML.g:5769:1: ( '(' )
            {
            // InternalFPML.g:5769:1: ( '(' )
            // InternalFPML.g:5770:2: '('
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
    // InternalFPML.g:5779:1: rule__EffectFullLambda__Group__1 : rule__EffectFullLambda__Group__1__Impl rule__EffectFullLambda__Group__2 ;
    public final void rule__EffectFullLambda__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5783:1: ( rule__EffectFullLambda__Group__1__Impl rule__EffectFullLambda__Group__2 )
            // InternalFPML.g:5784:2: rule__EffectFullLambda__Group__1__Impl rule__EffectFullLambda__Group__2
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
    // InternalFPML.g:5791:1: rule__EffectFullLambda__Group__1__Impl : ( ( rule__EffectFullLambda__ArgAssignment_1 ) ) ;
    public final void rule__EffectFullLambda__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5795:1: ( ( ( rule__EffectFullLambda__ArgAssignment_1 ) ) )
            // InternalFPML.g:5796:1: ( ( rule__EffectFullLambda__ArgAssignment_1 ) )
            {
            // InternalFPML.g:5796:1: ( ( rule__EffectFullLambda__ArgAssignment_1 ) )
            // InternalFPML.g:5797:2: ( rule__EffectFullLambda__ArgAssignment_1 )
            {
             before(grammarAccess.getEffectFullLambdaAccess().getArgAssignment_1()); 
            // InternalFPML.g:5798:2: ( rule__EffectFullLambda__ArgAssignment_1 )
            // InternalFPML.g:5798:3: rule__EffectFullLambda__ArgAssignment_1
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
    // InternalFPML.g:5806:1: rule__EffectFullLambda__Group__2 : rule__EffectFullLambda__Group__2__Impl rule__EffectFullLambda__Group__3 ;
    public final void rule__EffectFullLambda__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5810:1: ( rule__EffectFullLambda__Group__2__Impl rule__EffectFullLambda__Group__3 )
            // InternalFPML.g:5811:2: rule__EffectFullLambda__Group__2__Impl rule__EffectFullLambda__Group__3
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
    // InternalFPML.g:5818:1: rule__EffectFullLambda__Group__2__Impl : ( ')' ) ;
    public final void rule__EffectFullLambda__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5822:1: ( ( ')' ) )
            // InternalFPML.g:5823:1: ( ')' )
            {
            // InternalFPML.g:5823:1: ( ')' )
            // InternalFPML.g:5824:2: ')'
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
    // InternalFPML.g:5833:1: rule__EffectFullLambda__Group__3 : rule__EffectFullLambda__Group__3__Impl rule__EffectFullLambda__Group__4 ;
    public final void rule__EffectFullLambda__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5837:1: ( rule__EffectFullLambda__Group__3__Impl rule__EffectFullLambda__Group__4 )
            // InternalFPML.g:5838:2: rule__EffectFullLambda__Group__3__Impl rule__EffectFullLambda__Group__4
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
    // InternalFPML.g:5845:1: rule__EffectFullLambda__Group__3__Impl : ( ':' ) ;
    public final void rule__EffectFullLambda__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5849:1: ( ( ':' ) )
            // InternalFPML.g:5850:1: ( ':' )
            {
            // InternalFPML.g:5850:1: ( ':' )
            // InternalFPML.g:5851:2: ':'
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
    // InternalFPML.g:5860:1: rule__EffectFullLambda__Group__4 : rule__EffectFullLambda__Group__4__Impl ;
    public final void rule__EffectFullLambda__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5864:1: ( rule__EffectFullLambda__Group__4__Impl )
            // InternalFPML.g:5865:2: rule__EffectFullLambda__Group__4__Impl
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
    // InternalFPML.g:5871:1: rule__EffectFullLambda__Group__4__Impl : ( ( rule__EffectFullLambda__FunctionBodyAssignment_4 ) ) ;
    public final void rule__EffectFullLambda__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5875:1: ( ( ( rule__EffectFullLambda__FunctionBodyAssignment_4 ) ) )
            // InternalFPML.g:5876:1: ( ( rule__EffectFullLambda__FunctionBodyAssignment_4 ) )
            {
            // InternalFPML.g:5876:1: ( ( rule__EffectFullLambda__FunctionBodyAssignment_4 ) )
            // InternalFPML.g:5877:2: ( rule__EffectFullLambda__FunctionBodyAssignment_4 )
            {
             before(grammarAccess.getEffectFullLambdaAccess().getFunctionBodyAssignment_4()); 
            // InternalFPML.g:5878:2: ( rule__EffectFullLambda__FunctionBodyAssignment_4 )
            // InternalFPML.g:5878:3: rule__EffectFullLambda__FunctionBodyAssignment_4
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
    // InternalFPML.g:5887:1: rule__ProdValue__Group__0 : rule__ProdValue__Group__0__Impl rule__ProdValue__Group__1 ;
    public final void rule__ProdValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5891:1: ( rule__ProdValue__Group__0__Impl rule__ProdValue__Group__1 )
            // InternalFPML.g:5892:2: rule__ProdValue__Group__0__Impl rule__ProdValue__Group__1
            {
            pushFollow(FOLLOW_45);
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
    // InternalFPML.g:5899:1: rule__ProdValue__Group__0__Impl : ( '(' ) ;
    public final void rule__ProdValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5903:1: ( ( '(' ) )
            // InternalFPML.g:5904:1: ( '(' )
            {
            // InternalFPML.g:5904:1: ( '(' )
            // InternalFPML.g:5905:2: '('
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
    // InternalFPML.g:5914:1: rule__ProdValue__Group__1 : rule__ProdValue__Group__1__Impl rule__ProdValue__Group__2 ;
    public final void rule__ProdValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5918:1: ( rule__ProdValue__Group__1__Impl rule__ProdValue__Group__2 )
            // InternalFPML.g:5919:2: rule__ProdValue__Group__1__Impl rule__ProdValue__Group__2
            {
            pushFollow(FOLLOW_40);
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
    // InternalFPML.g:5926:1: rule__ProdValue__Group__1__Impl : ( ( rule__ProdValue__ProdAdtElement1Assignment_1 ) ) ;
    public final void rule__ProdValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5930:1: ( ( ( rule__ProdValue__ProdAdtElement1Assignment_1 ) ) )
            // InternalFPML.g:5931:1: ( ( rule__ProdValue__ProdAdtElement1Assignment_1 ) )
            {
            // InternalFPML.g:5931:1: ( ( rule__ProdValue__ProdAdtElement1Assignment_1 ) )
            // InternalFPML.g:5932:2: ( rule__ProdValue__ProdAdtElement1Assignment_1 )
            {
             before(grammarAccess.getProdValueAccess().getProdAdtElement1Assignment_1()); 
            // InternalFPML.g:5933:2: ( rule__ProdValue__ProdAdtElement1Assignment_1 )
            // InternalFPML.g:5933:3: rule__ProdValue__ProdAdtElement1Assignment_1
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
    // InternalFPML.g:5941:1: rule__ProdValue__Group__2 : rule__ProdValue__Group__2__Impl rule__ProdValue__Group__3 ;
    public final void rule__ProdValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5945:1: ( rule__ProdValue__Group__2__Impl rule__ProdValue__Group__3 )
            // InternalFPML.g:5946:2: rule__ProdValue__Group__2__Impl rule__ProdValue__Group__3
            {
            pushFollow(FOLLOW_45);
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
    // InternalFPML.g:5953:1: rule__ProdValue__Group__2__Impl : ( ',' ) ;
    public final void rule__ProdValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5957:1: ( ( ',' ) )
            // InternalFPML.g:5958:1: ( ',' )
            {
            // InternalFPML.g:5958:1: ( ',' )
            // InternalFPML.g:5959:2: ','
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
    // InternalFPML.g:5968:1: rule__ProdValue__Group__3 : rule__ProdValue__Group__3__Impl rule__ProdValue__Group__4 ;
    public final void rule__ProdValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5972:1: ( rule__ProdValue__Group__3__Impl rule__ProdValue__Group__4 )
            // InternalFPML.g:5973:2: rule__ProdValue__Group__3__Impl rule__ProdValue__Group__4
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
    // InternalFPML.g:5980:1: rule__ProdValue__Group__3__Impl : ( ( rule__ProdValue__ProdAdtElement2Assignment_3 ) ) ;
    public final void rule__ProdValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5984:1: ( ( ( rule__ProdValue__ProdAdtElement2Assignment_3 ) ) )
            // InternalFPML.g:5985:1: ( ( rule__ProdValue__ProdAdtElement2Assignment_3 ) )
            {
            // InternalFPML.g:5985:1: ( ( rule__ProdValue__ProdAdtElement2Assignment_3 ) )
            // InternalFPML.g:5986:2: ( rule__ProdValue__ProdAdtElement2Assignment_3 )
            {
             before(grammarAccess.getProdValueAccess().getProdAdtElement2Assignment_3()); 
            // InternalFPML.g:5987:2: ( rule__ProdValue__ProdAdtElement2Assignment_3 )
            // InternalFPML.g:5987:3: rule__ProdValue__ProdAdtElement2Assignment_3
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
    // InternalFPML.g:5995:1: rule__ProdValue__Group__4 : rule__ProdValue__Group__4__Impl ;
    public final void rule__ProdValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5999:1: ( rule__ProdValue__Group__4__Impl )
            // InternalFPML.g:6000:2: rule__ProdValue__Group__4__Impl
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
    // InternalFPML.g:6006:1: rule__ProdValue__Group__4__Impl : ( ')' ) ;
    public final void rule__ProdValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6010:1: ( ( ')' ) )
            // InternalFPML.g:6011:1: ( ')' )
            {
            // InternalFPML.g:6011:1: ( ')' )
            // InternalFPML.g:6012:2: ')'
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
    // InternalFPML.g:6022:1: rule__SumValue__Group_0__0 : rule__SumValue__Group_0__0__Impl rule__SumValue__Group_0__1 ;
    public final void rule__SumValue__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6026:1: ( rule__SumValue__Group_0__0__Impl rule__SumValue__Group_0__1 )
            // InternalFPML.g:6027:2: rule__SumValue__Group_0__0__Impl rule__SumValue__Group_0__1
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
    // InternalFPML.g:6034:1: rule__SumValue__Group_0__0__Impl : ( 'Left' ) ;
    public final void rule__SumValue__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6038:1: ( ( 'Left' ) )
            // InternalFPML.g:6039:1: ( 'Left' )
            {
            // InternalFPML.g:6039:1: ( 'Left' )
            // InternalFPML.g:6040:2: 'Left'
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
    // InternalFPML.g:6049:1: rule__SumValue__Group_0__1 : rule__SumValue__Group_0__1__Impl rule__SumValue__Group_0__2 ;
    public final void rule__SumValue__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6053:1: ( rule__SumValue__Group_0__1__Impl rule__SumValue__Group_0__2 )
            // InternalFPML.g:6054:2: rule__SumValue__Group_0__1__Impl rule__SumValue__Group_0__2
            {
            pushFollow(FOLLOW_45);
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
    // InternalFPML.g:6061:1: rule__SumValue__Group_0__1__Impl : ( '(' ) ;
    public final void rule__SumValue__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6065:1: ( ( '(' ) )
            // InternalFPML.g:6066:1: ( '(' )
            {
            // InternalFPML.g:6066:1: ( '(' )
            // InternalFPML.g:6067:2: '('
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
    // InternalFPML.g:6076:1: rule__SumValue__Group_0__2 : rule__SumValue__Group_0__2__Impl rule__SumValue__Group_0__3 ;
    public final void rule__SumValue__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6080:1: ( rule__SumValue__Group_0__2__Impl rule__SumValue__Group_0__3 )
            // InternalFPML.g:6081:2: rule__SumValue__Group_0__2__Impl rule__SumValue__Group_0__3
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
    // InternalFPML.g:6088:1: rule__SumValue__Group_0__2__Impl : ( ( rule__SumValue__SumAdtElement1Assignment_0_2 ) ) ;
    public final void rule__SumValue__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6092:1: ( ( ( rule__SumValue__SumAdtElement1Assignment_0_2 ) ) )
            // InternalFPML.g:6093:1: ( ( rule__SumValue__SumAdtElement1Assignment_0_2 ) )
            {
            // InternalFPML.g:6093:1: ( ( rule__SumValue__SumAdtElement1Assignment_0_2 ) )
            // InternalFPML.g:6094:2: ( rule__SumValue__SumAdtElement1Assignment_0_2 )
            {
             before(grammarAccess.getSumValueAccess().getSumAdtElement1Assignment_0_2()); 
            // InternalFPML.g:6095:2: ( rule__SumValue__SumAdtElement1Assignment_0_2 )
            // InternalFPML.g:6095:3: rule__SumValue__SumAdtElement1Assignment_0_2
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
    // InternalFPML.g:6103:1: rule__SumValue__Group_0__3 : rule__SumValue__Group_0__3__Impl ;
    public final void rule__SumValue__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6107:1: ( rule__SumValue__Group_0__3__Impl )
            // InternalFPML.g:6108:2: rule__SumValue__Group_0__3__Impl
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
    // InternalFPML.g:6114:1: rule__SumValue__Group_0__3__Impl : ( ')' ) ;
    public final void rule__SumValue__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6118:1: ( ( ')' ) )
            // InternalFPML.g:6119:1: ( ')' )
            {
            // InternalFPML.g:6119:1: ( ')' )
            // InternalFPML.g:6120:2: ')'
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
    // InternalFPML.g:6130:1: rule__SumValue__Group_1__0 : rule__SumValue__Group_1__0__Impl rule__SumValue__Group_1__1 ;
    public final void rule__SumValue__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6134:1: ( rule__SumValue__Group_1__0__Impl rule__SumValue__Group_1__1 )
            // InternalFPML.g:6135:2: rule__SumValue__Group_1__0__Impl rule__SumValue__Group_1__1
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
    // InternalFPML.g:6142:1: rule__SumValue__Group_1__0__Impl : ( 'Right' ) ;
    public final void rule__SumValue__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6146:1: ( ( 'Right' ) )
            // InternalFPML.g:6147:1: ( 'Right' )
            {
            // InternalFPML.g:6147:1: ( 'Right' )
            // InternalFPML.g:6148:2: 'Right'
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
    // InternalFPML.g:6157:1: rule__SumValue__Group_1__1 : rule__SumValue__Group_1__1__Impl rule__SumValue__Group_1__2 ;
    public final void rule__SumValue__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6161:1: ( rule__SumValue__Group_1__1__Impl rule__SumValue__Group_1__2 )
            // InternalFPML.g:6162:2: rule__SumValue__Group_1__1__Impl rule__SumValue__Group_1__2
            {
            pushFollow(FOLLOW_45);
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
    // InternalFPML.g:6169:1: rule__SumValue__Group_1__1__Impl : ( '(' ) ;
    public final void rule__SumValue__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6173:1: ( ( '(' ) )
            // InternalFPML.g:6174:1: ( '(' )
            {
            // InternalFPML.g:6174:1: ( '(' )
            // InternalFPML.g:6175:2: '('
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
    // InternalFPML.g:6184:1: rule__SumValue__Group_1__2 : rule__SumValue__Group_1__2__Impl rule__SumValue__Group_1__3 ;
    public final void rule__SumValue__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6188:1: ( rule__SumValue__Group_1__2__Impl rule__SumValue__Group_1__3 )
            // InternalFPML.g:6189:2: rule__SumValue__Group_1__2__Impl rule__SumValue__Group_1__3
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
    // InternalFPML.g:6196:1: rule__SumValue__Group_1__2__Impl : ( ( rule__SumValue__SumAdtElement2Assignment_1_2 ) ) ;
    public final void rule__SumValue__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6200:1: ( ( ( rule__SumValue__SumAdtElement2Assignment_1_2 ) ) )
            // InternalFPML.g:6201:1: ( ( rule__SumValue__SumAdtElement2Assignment_1_2 ) )
            {
            // InternalFPML.g:6201:1: ( ( rule__SumValue__SumAdtElement2Assignment_1_2 ) )
            // InternalFPML.g:6202:2: ( rule__SumValue__SumAdtElement2Assignment_1_2 )
            {
             before(grammarAccess.getSumValueAccess().getSumAdtElement2Assignment_1_2()); 
            // InternalFPML.g:6203:2: ( rule__SumValue__SumAdtElement2Assignment_1_2 )
            // InternalFPML.g:6203:3: rule__SumValue__SumAdtElement2Assignment_1_2
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
    // InternalFPML.g:6211:1: rule__SumValue__Group_1__3 : rule__SumValue__Group_1__3__Impl ;
    public final void rule__SumValue__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6215:1: ( rule__SumValue__Group_1__3__Impl )
            // InternalFPML.g:6216:2: rule__SumValue__Group_1__3__Impl
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
    // InternalFPML.g:6222:1: rule__SumValue__Group_1__3__Impl : ( ')' ) ;
    public final void rule__SumValue__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6226:1: ( ( ')' ) )
            // InternalFPML.g:6227:1: ( ')' )
            {
            // InternalFPML.g:6227:1: ( ')' )
            // InternalFPML.g:6228:2: ')'
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
    // InternalFPML.g:6238:1: rule__IntToString__Group__0 : rule__IntToString__Group__0__Impl rule__IntToString__Group__1 ;
    public final void rule__IntToString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6242:1: ( rule__IntToString__Group__0__Impl rule__IntToString__Group__1 )
            // InternalFPML.g:6243:2: rule__IntToString__Group__0__Impl rule__IntToString__Group__1
            {
            pushFollow(FOLLOW_46);
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
    // InternalFPML.g:6250:1: rule__IntToString__Group__0__Impl : ( () ) ;
    public final void rule__IntToString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6254:1: ( ( () ) )
            // InternalFPML.g:6255:1: ( () )
            {
            // InternalFPML.g:6255:1: ( () )
            // InternalFPML.g:6256:2: ()
            {
             before(grammarAccess.getIntToStringAccess().getIntToStringAction_0()); 
            // InternalFPML.g:6257:2: ()
            // InternalFPML.g:6257:3: 
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
    // InternalFPML.g:6265:1: rule__IntToString__Group__1 : rule__IntToString__Group__1__Impl ;
    public final void rule__IntToString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6269:1: ( rule__IntToString__Group__1__Impl )
            // InternalFPML.g:6270:2: rule__IntToString__Group__1__Impl
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
    // InternalFPML.g:6276:1: rule__IntToString__Group__1__Impl : ( 'IntToString' ) ;
    public final void rule__IntToString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6280:1: ( ( 'IntToString' ) )
            // InternalFPML.g:6281:1: ( 'IntToString' )
            {
            // InternalFPML.g:6281:1: ( 'IntToString' )
            // InternalFPML.g:6282:2: 'IntToString'
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
    // InternalFPML.g:6292:1: rule__IntPow__Group__0 : rule__IntPow__Group__0__Impl rule__IntPow__Group__1 ;
    public final void rule__IntPow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6296:1: ( rule__IntPow__Group__0__Impl rule__IntPow__Group__1 )
            // InternalFPML.g:6297:2: rule__IntPow__Group__0__Impl rule__IntPow__Group__1
            {
            pushFollow(FOLLOW_47);
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
    // InternalFPML.g:6304:1: rule__IntPow__Group__0__Impl : ( () ) ;
    public final void rule__IntPow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6308:1: ( ( () ) )
            // InternalFPML.g:6309:1: ( () )
            {
            // InternalFPML.g:6309:1: ( () )
            // InternalFPML.g:6310:2: ()
            {
             before(grammarAccess.getIntPowAccess().getIntPowAction_0()); 
            // InternalFPML.g:6311:2: ()
            // InternalFPML.g:6311:3: 
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
    // InternalFPML.g:6319:1: rule__IntPow__Group__1 : rule__IntPow__Group__1__Impl ;
    public final void rule__IntPow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6323:1: ( rule__IntPow__Group__1__Impl )
            // InternalFPML.g:6324:2: rule__IntPow__Group__1__Impl
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
    // InternalFPML.g:6330:1: rule__IntPow__Group__1__Impl : ( 'IntPow' ) ;
    public final void rule__IntPow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6334:1: ( ( 'IntPow' ) )
            // InternalFPML.g:6335:1: ( 'IntPow' )
            {
            // InternalFPML.g:6335:1: ( 'IntPow' )
            // InternalFPML.g:6336:2: 'IntPow'
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
    // InternalFPML.g:6346:1: rule__Plus__Group__0 : rule__Plus__Group__0__Impl rule__Plus__Group__1 ;
    public final void rule__Plus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6350:1: ( rule__Plus__Group__0__Impl rule__Plus__Group__1 )
            // InternalFPML.g:6351:2: rule__Plus__Group__0__Impl rule__Plus__Group__1
            {
            pushFollow(FOLLOW_48);
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
    // InternalFPML.g:6358:1: rule__Plus__Group__0__Impl : ( () ) ;
    public final void rule__Plus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6362:1: ( ( () ) )
            // InternalFPML.g:6363:1: ( () )
            {
            // InternalFPML.g:6363:1: ( () )
            // InternalFPML.g:6364:2: ()
            {
             before(grammarAccess.getPlusAccess().getPlusAction_0()); 
            // InternalFPML.g:6365:2: ()
            // InternalFPML.g:6365:3: 
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
    // InternalFPML.g:6373:1: rule__Plus__Group__1 : rule__Plus__Group__1__Impl ;
    public final void rule__Plus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6377:1: ( rule__Plus__Group__1__Impl )
            // InternalFPML.g:6378:2: rule__Plus__Group__1__Impl
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
    // InternalFPML.g:6384:1: rule__Plus__Group__1__Impl : ( '+' ) ;
    public final void rule__Plus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6388:1: ( ( '+' ) )
            // InternalFPML.g:6389:1: ( '+' )
            {
            // InternalFPML.g:6389:1: ( '+' )
            // InternalFPML.g:6390:2: '+'
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
    // InternalFPML.g:6400:1: rule__Minus__Group__0 : rule__Minus__Group__0__Impl rule__Minus__Group__1 ;
    public final void rule__Minus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6404:1: ( rule__Minus__Group__0__Impl rule__Minus__Group__1 )
            // InternalFPML.g:6405:2: rule__Minus__Group__0__Impl rule__Minus__Group__1
            {
            pushFollow(FOLLOW_49);
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
    // InternalFPML.g:6412:1: rule__Minus__Group__0__Impl : ( () ) ;
    public final void rule__Minus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6416:1: ( ( () ) )
            // InternalFPML.g:6417:1: ( () )
            {
            // InternalFPML.g:6417:1: ( () )
            // InternalFPML.g:6418:2: ()
            {
             before(grammarAccess.getMinusAccess().getMinusAction_0()); 
            // InternalFPML.g:6419:2: ()
            // InternalFPML.g:6419:3: 
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
    // InternalFPML.g:6427:1: rule__Minus__Group__1 : rule__Minus__Group__1__Impl ;
    public final void rule__Minus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6431:1: ( rule__Minus__Group__1__Impl )
            // InternalFPML.g:6432:2: rule__Minus__Group__1__Impl
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
    // InternalFPML.g:6438:1: rule__Minus__Group__1__Impl : ( '-' ) ;
    public final void rule__Minus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6442:1: ( ( '-' ) )
            // InternalFPML.g:6443:1: ( '-' )
            {
            // InternalFPML.g:6443:1: ( '-' )
            // InternalFPML.g:6444:2: '-'
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
    // InternalFPML.g:6454:1: rule__Times__Group__0 : rule__Times__Group__0__Impl rule__Times__Group__1 ;
    public final void rule__Times__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6458:1: ( rule__Times__Group__0__Impl rule__Times__Group__1 )
            // InternalFPML.g:6459:2: rule__Times__Group__0__Impl rule__Times__Group__1
            {
            pushFollow(FOLLOW_50);
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
    // InternalFPML.g:6466:1: rule__Times__Group__0__Impl : ( () ) ;
    public final void rule__Times__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6470:1: ( ( () ) )
            // InternalFPML.g:6471:1: ( () )
            {
            // InternalFPML.g:6471:1: ( () )
            // InternalFPML.g:6472:2: ()
            {
             before(grammarAccess.getTimesAccess().getTimesAction_0()); 
            // InternalFPML.g:6473:2: ()
            // InternalFPML.g:6473:3: 
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
    // InternalFPML.g:6481:1: rule__Times__Group__1 : rule__Times__Group__1__Impl ;
    public final void rule__Times__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6485:1: ( rule__Times__Group__1__Impl )
            // InternalFPML.g:6486:2: rule__Times__Group__1__Impl
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
    // InternalFPML.g:6492:1: rule__Times__Group__1__Impl : ( '*' ) ;
    public final void rule__Times__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6496:1: ( ( '*' ) )
            // InternalFPML.g:6497:1: ( '*' )
            {
            // InternalFPML.g:6497:1: ( '*' )
            // InternalFPML.g:6498:2: '*'
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
    // InternalFPML.g:6508:1: rule__Mod__Group__0 : rule__Mod__Group__0__Impl rule__Mod__Group__1 ;
    public final void rule__Mod__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6512:1: ( rule__Mod__Group__0__Impl rule__Mod__Group__1 )
            // InternalFPML.g:6513:2: rule__Mod__Group__0__Impl rule__Mod__Group__1
            {
            pushFollow(FOLLOW_51);
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
    // InternalFPML.g:6520:1: rule__Mod__Group__0__Impl : ( () ) ;
    public final void rule__Mod__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6524:1: ( ( () ) )
            // InternalFPML.g:6525:1: ( () )
            {
            // InternalFPML.g:6525:1: ( () )
            // InternalFPML.g:6526:2: ()
            {
             before(grammarAccess.getModAccess().getModAction_0()); 
            // InternalFPML.g:6527:2: ()
            // InternalFPML.g:6527:3: 
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
    // InternalFPML.g:6535:1: rule__Mod__Group__1 : rule__Mod__Group__1__Impl ;
    public final void rule__Mod__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6539:1: ( rule__Mod__Group__1__Impl )
            // InternalFPML.g:6540:2: rule__Mod__Group__1__Impl
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
    // InternalFPML.g:6546:1: rule__Mod__Group__1__Impl : ( 'mod' ) ;
    public final void rule__Mod__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6550:1: ( ( 'mod' ) )
            // InternalFPML.g:6551:1: ( 'mod' )
            {
            // InternalFPML.g:6551:1: ( 'mod' )
            // InternalFPML.g:6552:2: 'mod'
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


    // $ANTLR start "rule__Apply__Group__0"
    // InternalFPML.g:6562:1: rule__Apply__Group__0 : rule__Apply__Group__0__Impl rule__Apply__Group__1 ;
    public final void rule__Apply__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6566:1: ( rule__Apply__Group__0__Impl rule__Apply__Group__1 )
            // InternalFPML.g:6567:2: rule__Apply__Group__0__Impl rule__Apply__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__Apply__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Apply__Group__1();

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
    // $ANTLR end "rule__Apply__Group__0"


    // $ANTLR start "rule__Apply__Group__0__Impl"
    // InternalFPML.g:6574:1: rule__Apply__Group__0__Impl : ( () ) ;
    public final void rule__Apply__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6578:1: ( ( () ) )
            // InternalFPML.g:6579:1: ( () )
            {
            // InternalFPML.g:6579:1: ( () )
            // InternalFPML.g:6580:2: ()
            {
             before(grammarAccess.getApplyAccess().getApplyAction_0()); 
            // InternalFPML.g:6581:2: ()
            // InternalFPML.g:6581:3: 
            {
            }

             after(grammarAccess.getApplyAccess().getApplyAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Apply__Group__0__Impl"


    // $ANTLR start "rule__Apply__Group__1"
    // InternalFPML.g:6589:1: rule__Apply__Group__1 : rule__Apply__Group__1__Impl rule__Apply__Group__2 ;
    public final void rule__Apply__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6593:1: ( rule__Apply__Group__1__Impl rule__Apply__Group__2 )
            // InternalFPML.g:6594:2: rule__Apply__Group__1__Impl rule__Apply__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__Apply__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Apply__Group__2();

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
    // $ANTLR end "rule__Apply__Group__1"


    // $ANTLR start "rule__Apply__Group__1__Impl"
    // InternalFPML.g:6601:1: rule__Apply__Group__1__Impl : ( 'apply' ) ;
    public final void rule__Apply__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6605:1: ( ( 'apply' ) )
            // InternalFPML.g:6606:1: ( 'apply' )
            {
            // InternalFPML.g:6606:1: ( 'apply' )
            // InternalFPML.g:6607:2: 'apply'
            {
             before(grammarAccess.getApplyAccess().getApplyKeyword_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getApplyAccess().getApplyKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Apply__Group__1__Impl"


    // $ANTLR start "rule__Apply__Group__2"
    // InternalFPML.g:6616:1: rule__Apply__Group__2 : rule__Apply__Group__2__Impl ;
    public final void rule__Apply__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6620:1: ( rule__Apply__Group__2__Impl )
            // InternalFPML.g:6621:2: rule__Apply__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Apply__Group__2__Impl();

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
    // $ANTLR end "rule__Apply__Group__2"


    // $ANTLR start "rule__Apply__Group__2__Impl"
    // InternalFPML.g:6627:1: rule__Apply__Group__2__Impl : ( ( rule__Apply__ValueAssignment_2 ) ) ;
    public final void rule__Apply__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6631:1: ( ( ( rule__Apply__ValueAssignment_2 ) ) )
            // InternalFPML.g:6632:1: ( ( rule__Apply__ValueAssignment_2 ) )
            {
            // InternalFPML.g:6632:1: ( ( rule__Apply__ValueAssignment_2 ) )
            // InternalFPML.g:6633:2: ( rule__Apply__ValueAssignment_2 )
            {
             before(grammarAccess.getApplyAccess().getValueAssignment_2()); 
            // InternalFPML.g:6634:2: ( rule__Apply__ValueAssignment_2 )
            // InternalFPML.g:6634:3: rule__Apply__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Apply__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getApplyAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Apply__Group__2__Impl"


    // $ANTLR start "rule__PrimitivePrint__Group__0"
    // InternalFPML.g:6643:1: rule__PrimitivePrint__Group__0 : rule__PrimitivePrint__Group__0__Impl rule__PrimitivePrint__Group__1 ;
    public final void rule__PrimitivePrint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6647:1: ( rule__PrimitivePrint__Group__0__Impl rule__PrimitivePrint__Group__1 )
            // InternalFPML.g:6648:2: rule__PrimitivePrint__Group__0__Impl rule__PrimitivePrint__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalFPML.g:6655:1: rule__PrimitivePrint__Group__0__Impl : ( () ) ;
    public final void rule__PrimitivePrint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6659:1: ( ( () ) )
            // InternalFPML.g:6660:1: ( () )
            {
            // InternalFPML.g:6660:1: ( () )
            // InternalFPML.g:6661:2: ()
            {
             before(grammarAccess.getPrimitivePrintAccess().getPrimitivePrintAction_0()); 
            // InternalFPML.g:6662:2: ()
            // InternalFPML.g:6662:3: 
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
    // InternalFPML.g:6670:1: rule__PrimitivePrint__Group__1 : rule__PrimitivePrint__Group__1__Impl ;
    public final void rule__PrimitivePrint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6674:1: ( rule__PrimitivePrint__Group__1__Impl )
            // InternalFPML.g:6675:2: rule__PrimitivePrint__Group__1__Impl
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
    // InternalFPML.g:6681:1: rule__PrimitivePrint__Group__1__Impl : ( 'print' ) ;
    public final void rule__PrimitivePrint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6685:1: ( ( 'print' ) )
            // InternalFPML.g:6686:1: ( 'print' )
            {
            // InternalFPML.g:6686:1: ( 'print' )
            // InternalFPML.g:6687:2: 'print'
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


    // $ANTLR start "rule__Model__ElementsAssignment_0"
    // InternalFPML.g:6697:1: rule__Model__ElementsAssignment_0 : ( rulePureBlock ) ;
    public final void rule__Model__ElementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6701:1: ( ( rulePureBlock ) )
            // InternalFPML.g:6702:2: ( rulePureBlock )
            {
            // InternalFPML.g:6702:2: ( rulePureBlock )
            // InternalFPML.g:6703:3: rulePureBlock
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
    // InternalFPML.g:6712:1: rule__Model__ElementsAssignment_1 : ( ruleEffectFullBlock ) ;
    public final void rule__Model__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6716:1: ( ( ruleEffectFullBlock ) )
            // InternalFPML.g:6717:2: ( ruleEffectFullBlock )
            {
            // InternalFPML.g:6717:2: ( ruleEffectFullBlock )
            // InternalFPML.g:6718:3: ruleEffectFullBlock
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
    // InternalFPML.g:6727:1: rule__PureBlock__ElementsAssignment_2 : ( rulePureFunctionBlock ) ;
    public final void rule__PureBlock__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6731:1: ( ( rulePureFunctionBlock ) )
            // InternalFPML.g:6732:2: ( rulePureFunctionBlock )
            {
            // InternalFPML.g:6732:2: ( rulePureFunctionBlock )
            // InternalFPML.g:6733:3: rulePureFunctionBlock
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
    // InternalFPML.g:6742:1: rule__PureBlock__ElementsAssignment_3 : ( ruleDataBlock ) ;
    public final void rule__PureBlock__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6746:1: ( ( ruleDataBlock ) )
            // InternalFPML.g:6747:2: ( ruleDataBlock )
            {
            // InternalFPML.g:6747:2: ( ruleDataBlock )
            // InternalFPML.g:6748:3: ruleDataBlock
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
    // InternalFPML.g:6757:1: rule__PureFunctionBlock__FeaturesAssignment_2 : ( rulePureFunctionDefinition ) ;
    public final void rule__PureFunctionBlock__FeaturesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6761:1: ( ( rulePureFunctionDefinition ) )
            // InternalFPML.g:6762:2: ( rulePureFunctionDefinition )
            {
            // InternalFPML.g:6762:2: ( rulePureFunctionDefinition )
            // InternalFPML.g:6763:3: rulePureFunctionDefinition
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
    // InternalFPML.g:6772:1: rule__DataBlock__ElementsAssignment_2 : ( ruleData ) ;
    public final void rule__DataBlock__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6776:1: ( ( ruleData ) )
            // InternalFPML.g:6777:2: ( ruleData )
            {
            // InternalFPML.g:6777:2: ( ruleData )
            // InternalFPML.g:6778:3: ruleData
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
    // InternalFPML.g:6787:1: rule__DataBlock__ValueAssignment_3 : ( ruleValueBlock ) ;
    public final void rule__DataBlock__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6791:1: ( ( ruleValueBlock ) )
            // InternalFPML.g:6792:2: ( ruleValueBlock )
            {
            // InternalFPML.g:6792:2: ( ruleValueBlock )
            // InternalFPML.g:6793:3: ruleValueBlock
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
    // InternalFPML.g:6802:1: rule__ValueBlock__ElementsAssignment_2 : ( ruleValue ) ;
    public final void rule__ValueBlock__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6806:1: ( ( ruleValue ) )
            // InternalFPML.g:6807:2: ( ruleValue )
            {
            // InternalFPML.g:6807:2: ( ruleValue )
            // InternalFPML.g:6808:3: ruleValue
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
    // InternalFPML.g:6817:1: rule__EffectFullBlock__FeaturesAssignment_2 : ( ruleEffectFullFunctionDefinition ) ;
    public final void rule__EffectFullBlock__FeaturesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6821:1: ( ( ruleEffectFullFunctionDefinition ) )
            // InternalFPML.g:6822:2: ( ruleEffectFullFunctionDefinition )
            {
            // InternalFPML.g:6822:2: ( ruleEffectFullFunctionDefinition )
            // InternalFPML.g:6823:3: ruleEffectFullFunctionDefinition
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
    // InternalFPML.g:6832:1: rule__EffectFullBlock__MainAssignment_3 : ( ruleMainFunc ) ;
    public final void rule__EffectFullBlock__MainAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6836:1: ( ( ruleMainFunc ) )
            // InternalFPML.g:6837:2: ( ruleMainFunc )
            {
            // InternalFPML.g:6837:2: ( ruleMainFunc )
            // InternalFPML.g:6838:3: ruleMainFunc
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
    // InternalFPML.g:6847:1: rule__Data__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Data__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6851:1: ( ( RULE_ID ) )
            // InternalFPML.g:6852:2: ( RULE_ID )
            {
            // InternalFPML.g:6852:2: ( RULE_ID )
            // InternalFPML.g:6853:3: RULE_ID
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
    // InternalFPML.g:6862:1: rule__Data__ContentAssignment_2 : ( ruleAdtType ) ;
    public final void rule__Data__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6866:1: ( ( ruleAdtType ) )
            // InternalFPML.g:6867:2: ( ruleAdtType )
            {
            // InternalFPML.g:6867:2: ( ruleAdtType )
            // InternalFPML.g:6868:3: ruleAdtType
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
    // InternalFPML.g:6877:1: rule__Value__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Value__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6881:1: ( ( RULE_ID ) )
            // InternalFPML.g:6882:2: ( RULE_ID )
            {
            // InternalFPML.g:6882:2: ( RULE_ID )
            // InternalFPML.g:6883:3: RULE_ID
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
    // InternalFPML.g:6892:1: rule__Value__ValueAssignment_2 : ( ruleExpression ) ;
    public final void rule__Value__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6896:1: ( ( ruleExpression ) )
            // InternalFPML.g:6897:2: ( ruleExpression )
            {
            // InternalFPML.g:6897:2: ( ruleExpression )
            // InternalFPML.g:6898:3: ruleExpression
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
    // InternalFPML.g:6907:1: rule__AdtType__AdtElement1Assignment_1_1 : ( ruleAdtType ) ;
    public final void rule__AdtType__AdtElement1Assignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6911:1: ( ( ruleAdtType ) )
            // InternalFPML.g:6912:2: ( ruleAdtType )
            {
            // InternalFPML.g:6912:2: ( ruleAdtType )
            // InternalFPML.g:6913:3: ruleAdtType
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
    // InternalFPML.g:6922:1: rule__AdtType__AdtElement2Assignment_1_2 : ( ( rule__AdtType__AdtElement2Alternatives_1_2_0 ) ) ;
    public final void rule__AdtType__AdtElement2Assignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6926:1: ( ( ( rule__AdtType__AdtElement2Alternatives_1_2_0 ) ) )
            // InternalFPML.g:6927:2: ( ( rule__AdtType__AdtElement2Alternatives_1_2_0 ) )
            {
            // InternalFPML.g:6927:2: ( ( rule__AdtType__AdtElement2Alternatives_1_2_0 ) )
            // InternalFPML.g:6928:3: ( rule__AdtType__AdtElement2Alternatives_1_2_0 )
            {
             before(grammarAccess.getAdtTypeAccess().getAdtElement2Alternatives_1_2_0()); 
            // InternalFPML.g:6929:3: ( rule__AdtType__AdtElement2Alternatives_1_2_0 )
            // InternalFPML.g:6929:4: rule__AdtType__AdtElement2Alternatives_1_2_0
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
    // InternalFPML.g:6937:1: rule__SumType__AdtElementAssignment_1 : ( ruleAdtType ) ;
    public final void rule__SumType__AdtElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6941:1: ( ( ruleAdtType ) )
            // InternalFPML.g:6942:2: ( ruleAdtType )
            {
            // InternalFPML.g:6942:2: ( ruleAdtType )
            // InternalFPML.g:6943:3: ruleAdtType
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
    // InternalFPML.g:6952:1: rule__ProdType__AdtElementAssignment_1 : ( ruleAdtType ) ;
    public final void rule__ProdType__AdtElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6956:1: ( ( ruleAdtType ) )
            // InternalFPML.g:6957:2: ( ruleAdtType )
            {
            // InternalFPML.g:6957:2: ( ruleAdtType )
            // InternalFPML.g:6958:3: ruleAdtType
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
    // InternalFPML.g:6967:1: rule__PureFunctionDefinition__ReturnTypeAssignment_1 : ( ruleValueType ) ;
    public final void rule__PureFunctionDefinition__ReturnTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6971:1: ( ( ruleValueType ) )
            // InternalFPML.g:6972:2: ( ruleValueType )
            {
            // InternalFPML.g:6972:2: ( ruleValueType )
            // InternalFPML.g:6973:3: ruleValueType
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
    // InternalFPML.g:6982:1: rule__PureFunctionDefinition__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__PureFunctionDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6986:1: ( ( RULE_ID ) )
            // InternalFPML.g:6987:2: ( RULE_ID )
            {
            // InternalFPML.g:6987:2: ( RULE_ID )
            // InternalFPML.g:6988:3: RULE_ID
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
    // InternalFPML.g:6997:1: rule__PureFunctionDefinition__ArgAssignment_4 : ( ruleArgument ) ;
    public final void rule__PureFunctionDefinition__ArgAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7001:1: ( ( ruleArgument ) )
            // InternalFPML.g:7002:2: ( ruleArgument )
            {
            // InternalFPML.g:7002:2: ( ruleArgument )
            // InternalFPML.g:7003:3: ruleArgument
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
    // InternalFPML.g:7012:1: rule__PureFunctionDefinition__FunctionBodyAssignment_8 : ( ruleFunctionBodyPure ) ;
    public final void rule__PureFunctionDefinition__FunctionBodyAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7016:1: ( ( ruleFunctionBodyPure ) )
            // InternalFPML.g:7017:2: ( ruleFunctionBodyPure )
            {
            // InternalFPML.g:7017:2: ( ruleFunctionBodyPure )
            // InternalFPML.g:7018:3: ruleFunctionBodyPure
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
    // InternalFPML.g:7027:1: rule__EffectFullFunctionDefinition__ReturnTypeAssignment_1 : ( ruleIOType ) ;
    public final void rule__EffectFullFunctionDefinition__ReturnTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7031:1: ( ( ruleIOType ) )
            // InternalFPML.g:7032:2: ( ruleIOType )
            {
            // InternalFPML.g:7032:2: ( ruleIOType )
            // InternalFPML.g:7033:3: ruleIOType
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
    // InternalFPML.g:7042:1: rule__EffectFullFunctionDefinition__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__EffectFullFunctionDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7046:1: ( ( RULE_ID ) )
            // InternalFPML.g:7047:2: ( RULE_ID )
            {
            // InternalFPML.g:7047:2: ( RULE_ID )
            // InternalFPML.g:7048:3: RULE_ID
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
    // InternalFPML.g:7057:1: rule__EffectFullFunctionDefinition__ArgAssignment_4 : ( ruleEffectFullArgument ) ;
    public final void rule__EffectFullFunctionDefinition__ArgAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7061:1: ( ( ruleEffectFullArgument ) )
            // InternalFPML.g:7062:2: ( ruleEffectFullArgument )
            {
            // InternalFPML.g:7062:2: ( ruleEffectFullArgument )
            // InternalFPML.g:7063:3: ruleEffectFullArgument
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
    // InternalFPML.g:7072:1: rule__EffectFullFunctionDefinition__FunctionBodyAssignment_8 : ( ruleFunctionBodyEffectFull ) ;
    public final void rule__EffectFullFunctionDefinition__FunctionBodyAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7076:1: ( ( ruleFunctionBodyEffectFull ) )
            // InternalFPML.g:7077:2: ( ruleFunctionBodyEffectFull )
            {
            // InternalFPML.g:7077:2: ( ruleFunctionBodyEffectFull )
            // InternalFPML.g:7078:3: ruleFunctionBodyEffectFull
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
    // InternalFPML.g:7087:1: rule__MainFunc__ReturnTypeAssignment_1 : ( ruleUnitType ) ;
    public final void rule__MainFunc__ReturnTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7091:1: ( ( ruleUnitType ) )
            // InternalFPML.g:7092:2: ( ruleUnitType )
            {
            // InternalFPML.g:7092:2: ( ruleUnitType )
            // InternalFPML.g:7093:3: ruleUnitType
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
    // InternalFPML.g:7102:1: rule__MainFunc__FunctionBodyAssignment_5 : ( ruleFunctionBodyEffectFull ) ;
    public final void rule__MainFunc__FunctionBodyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7106:1: ( ( ruleFunctionBodyEffectFull ) )
            // InternalFPML.g:7107:2: ( ruleFunctionBodyEffectFull )
            {
            // InternalFPML.g:7107:2: ( ruleFunctionBodyEffectFull )
            // InternalFPML.g:7108:3: ruleFunctionBodyEffectFull
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
    // InternalFPML.g:7117:1: rule__EffectFullArgument__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__EffectFullArgument__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7121:1: ( ( ruleType ) )
            // InternalFPML.g:7122:2: ( ruleType )
            {
            // InternalFPML.g:7122:2: ( ruleType )
            // InternalFPML.g:7123:3: ruleType
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
    // InternalFPML.g:7132:1: rule__EffectFullArgument__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EffectFullArgument__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7136:1: ( ( RULE_ID ) )
            // InternalFPML.g:7137:2: ( RULE_ID )
            {
            // InternalFPML.g:7137:2: ( RULE_ID )
            // InternalFPML.g:7138:3: RULE_ID
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
    // InternalFPML.g:7147:1: rule__Argument__TypeAssignment_0 : ( ruleValueType ) ;
    public final void rule__Argument__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7151:1: ( ( ruleValueType ) )
            // InternalFPML.g:7152:2: ( ruleValueType )
            {
            // InternalFPML.g:7152:2: ( ruleValueType )
            // InternalFPML.g:7153:3: ruleValueType
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
    // InternalFPML.g:7162:1: rule__Argument__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Argument__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7166:1: ( ( RULE_ID ) )
            // InternalFPML.g:7167:2: ( RULE_ID )
            {
            // InternalFPML.g:7167:2: ( RULE_ID )
            // InternalFPML.g:7168:3: RULE_ID
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
    // InternalFPML.g:7177:1: rule__CompositionFunctionBodyPure__ReferenceElementAssignment_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__CompositionFunctionBodyPure__ReferenceElementAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7181:1: ( ( ( RULE_ID ) ) )
            // InternalFPML.g:7182:2: ( ( RULE_ID ) )
            {
            // InternalFPML.g:7182:2: ( ( RULE_ID ) )
            // InternalFPML.g:7183:3: ( RULE_ID )
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getReferenceElementPureFunctionDefinitionCrossReference_0_0_0()); 
            // InternalFPML.g:7184:3: ( RULE_ID )
            // InternalFPML.g:7185:4: RULE_ID
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
    // InternalFPML.g:7196:1: rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 : ( ruleCompositionFunctionBodyPureFactor ) ;
    public final void rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7200:1: ( ( ruleCompositionFunctionBodyPureFactor ) )
            // InternalFPML.g:7201:2: ( ruleCompositionFunctionBodyPureFactor )
            {
            // InternalFPML.g:7201:2: ( ruleCompositionFunctionBodyPureFactor )
            // InternalFPML.g:7202:3: ruleCompositionFunctionBodyPureFactor
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
    // InternalFPML.g:7211:1: rule__CompositionFunctionBodyPure__ReturnFunctionAssignment_0_2 : ( ruleReturnPureFunction ) ;
    public final void rule__CompositionFunctionBodyPure__ReturnFunctionAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7215:1: ( ( ruleReturnPureFunction ) )
            // InternalFPML.g:7216:2: ( ruleReturnPureFunction )
            {
            // InternalFPML.g:7216:2: ( ruleReturnPureFunction )
            // InternalFPML.g:7217:3: ruleReturnPureFunction
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
    // InternalFPML.g:7226:1: rule__CompositionFunctionBodyPure__PrimitiveElementAssignment_1_0 : ( rulePrimitivePureFunction ) ;
    public final void rule__CompositionFunctionBodyPure__PrimitiveElementAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7230:1: ( ( rulePrimitivePureFunction ) )
            // InternalFPML.g:7231:2: ( rulePrimitivePureFunction )
            {
            // InternalFPML.g:7231:2: ( rulePrimitivePureFunction )
            // InternalFPML.g:7232:3: rulePrimitivePureFunction
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
    // InternalFPML.g:7241:1: rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 : ( ruleCompositionFunctionBodyPureFactor ) ;
    public final void rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7245:1: ( ( ruleCompositionFunctionBodyPureFactor ) )
            // InternalFPML.g:7246:2: ( ruleCompositionFunctionBodyPureFactor )
            {
            // InternalFPML.g:7246:2: ( ruleCompositionFunctionBodyPureFactor )
            // InternalFPML.g:7247:3: ruleCompositionFunctionBodyPureFactor
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
    // InternalFPML.g:7256:1: rule__CompositionFunctionBodyPure__ReturnFunctionAssignment_1_2 : ( ruleReturnPureFunction ) ;
    public final void rule__CompositionFunctionBodyPure__ReturnFunctionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7260:1: ( ( ruleReturnPureFunction ) )
            // InternalFPML.g:7261:2: ( ruleReturnPureFunction )
            {
            // InternalFPML.g:7261:2: ( ruleReturnPureFunction )
            // InternalFPML.g:7262:3: ruleReturnPureFunction
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
    // InternalFPML.g:7271:1: rule__CompositionFunctionBodyPureFactor__ReferenceElementAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__CompositionFunctionBodyPureFactor__ReferenceElementAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7275:1: ( ( ( RULE_ID ) ) )
            // InternalFPML.g:7276:2: ( ( RULE_ID ) )
            {
            // InternalFPML.g:7276:2: ( ( RULE_ID ) )
            // InternalFPML.g:7277:3: ( RULE_ID )
            {
             before(grammarAccess.getCompositionFunctionBodyPureFactorAccess().getReferenceElementPureFunctionDefinitionCrossReference_0_1_0()); 
            // InternalFPML.g:7278:3: ( RULE_ID )
            // InternalFPML.g:7279:4: RULE_ID
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
    // InternalFPML.g:7290:1: rule__CompositionFunctionBodyPureFactor__PrimitiveElementAssignment_1_1 : ( rulePrimitivePureFunction ) ;
    public final void rule__CompositionFunctionBodyPureFactor__PrimitiveElementAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7294:1: ( ( rulePrimitivePureFunction ) )
            // InternalFPML.g:7295:2: ( rulePrimitivePureFunction )
            {
            // InternalFPML.g:7295:2: ( rulePrimitivePureFunction )
            // InternalFPML.g:7296:3: rulePrimitivePureFunction
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
    // InternalFPML.g:7305:1: rule__CompositionFunctionBodyEffect__ReferenceElementAssignment_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__CompositionFunctionBodyEffect__ReferenceElementAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7309:1: ( ( ( RULE_ID ) ) )
            // InternalFPML.g:7310:2: ( ( RULE_ID ) )
            {
            // InternalFPML.g:7310:2: ( ( RULE_ID ) )
            // InternalFPML.g:7311:3: ( RULE_ID )
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getReferenceElementChainElementCrossReference_0_0_0()); 
            // InternalFPML.g:7312:3: ( RULE_ID )
            // InternalFPML.g:7313:4: RULE_ID
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
    // InternalFPML.g:7324:1: rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 : ( ruleCompositionFunctionBodyEffectFullFactor ) ;
    public final void rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7328:1: ( ( ruleCompositionFunctionBodyEffectFullFactor ) )
            // InternalFPML.g:7329:2: ( ruleCompositionFunctionBodyEffectFullFactor )
            {
            // InternalFPML.g:7329:2: ( ruleCompositionFunctionBodyEffectFullFactor )
            // InternalFPML.g:7330:3: ruleCompositionFunctionBodyEffectFullFactor
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
    // InternalFPML.g:7339:1: rule__CompositionFunctionBodyEffect__ReturnFunctionAssignment_0_2 : ( ruleReturnEffectFullFunction ) ;
    public final void rule__CompositionFunctionBodyEffect__ReturnFunctionAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7343:1: ( ( ruleReturnEffectFullFunction ) )
            // InternalFPML.g:7344:2: ( ruleReturnEffectFullFunction )
            {
            // InternalFPML.g:7344:2: ( ruleReturnEffectFullFunction )
            // InternalFPML.g:7345:3: ruleReturnEffectFullFunction
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
    // InternalFPML.g:7354:1: rule__CompositionFunctionBodyEffect__PrimitiveElementAssignment_1_0 : ( rulePrimitiveEffectFullFunction ) ;
    public final void rule__CompositionFunctionBodyEffect__PrimitiveElementAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7358:1: ( ( rulePrimitiveEffectFullFunction ) )
            // InternalFPML.g:7359:2: ( rulePrimitiveEffectFullFunction )
            {
            // InternalFPML.g:7359:2: ( rulePrimitiveEffectFullFunction )
            // InternalFPML.g:7360:3: rulePrimitiveEffectFullFunction
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getPrimitiveElementPrimitiveEffectFullFunctionParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            rulePrimitiveEffectFullFunction();

            state._fsp--;

             after(grammarAccess.getCompositionFunctionBodyEffectAccess().getPrimitiveElementPrimitiveEffectFullFunctionParserRuleCall_1_0_0()); 

            }


            }

        }
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
    // InternalFPML.g:7369:1: rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 : ( ruleCompositionFunctionBodyEffectFullFactor ) ;
    public final void rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7373:1: ( ( ruleCompositionFunctionBodyEffectFullFactor ) )
            // InternalFPML.g:7374:2: ( ruleCompositionFunctionBodyEffectFullFactor )
            {
            // InternalFPML.g:7374:2: ( ruleCompositionFunctionBodyEffectFullFactor )
            // InternalFPML.g:7375:3: ruleCompositionFunctionBodyEffectFullFactor
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
    // InternalFPML.g:7384:1: rule__CompositionFunctionBodyEffect__ReturnFunctionAssignment_1_2 : ( ruleReturnEffectFullFunction ) ;
    public final void rule__CompositionFunctionBodyEffect__ReturnFunctionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7388:1: ( ( ruleReturnEffectFullFunction ) )
            // InternalFPML.g:7389:2: ( ruleReturnEffectFullFunction )
            {
            // InternalFPML.g:7389:2: ( ruleReturnEffectFullFunction )
            // InternalFPML.g:7390:3: ruleReturnEffectFullFunction
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
    // InternalFPML.g:7399:1: rule__CompositionFunctionBodyEffectFullFactor__ReferenceElementAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__CompositionFunctionBodyEffectFullFactor__ReferenceElementAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7403:1: ( ( ( RULE_ID ) ) )
            // InternalFPML.g:7404:2: ( ( RULE_ID ) )
            {
            // InternalFPML.g:7404:2: ( ( RULE_ID ) )
            // InternalFPML.g:7405:3: ( RULE_ID )
            {
             before(grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getReferenceElementChainElementCrossReference_0_1_0()); 
            // InternalFPML.g:7406:3: ( RULE_ID )
            // InternalFPML.g:7407:4: RULE_ID
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
    // InternalFPML.g:7418:1: rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAssignment_1_1 : ( ( rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAlternatives_1_1_0 ) ) ;
    public final void rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7422:1: ( ( ( rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAlternatives_1_1_0 ) ) )
            // InternalFPML.g:7423:2: ( ( rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAlternatives_1_1_0 ) )
            {
            // InternalFPML.g:7423:2: ( ( rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAlternatives_1_1_0 ) )
            // InternalFPML.g:7424:3: ( rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAlternatives_1_1_0 )
            {
             before(grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getPrimitiveElementAlternatives_1_1_0()); 
            // InternalFPML.g:7425:3: ( rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAlternatives_1_1_0 )
            // InternalFPML.g:7425:4: rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAlternatives_1_1_0
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
    // InternalFPML.g:7433:1: rule__ReturnPureFunction__LambdaFunctionBodyAssignment_2 : ( rulePureLambda ) ;
    public final void rule__ReturnPureFunction__LambdaFunctionBodyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7437:1: ( ( rulePureLambda ) )
            // InternalFPML.g:7438:2: ( rulePureLambda )
            {
            // InternalFPML.g:7438:2: ( rulePureLambda )
            // InternalFPML.g:7439:3: rulePureLambda
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
    // InternalFPML.g:7448:1: rule__ReturnEffectFullFunction__LambdaFunctionBodyAssignment_2 : ( ruleEffectFullLambda ) ;
    public final void rule__ReturnEffectFullFunction__LambdaFunctionBodyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7452:1: ( ( ruleEffectFullLambda ) )
            // InternalFPML.g:7453:2: ( ruleEffectFullLambda )
            {
            // InternalFPML.g:7453:2: ( ruleEffectFullLambda )
            // InternalFPML.g:7454:3: ruleEffectFullLambda
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
    // InternalFPML.g:7463:1: rule__IOType__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__IOType__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7467:1: ( ( ruleType ) )
            // InternalFPML.g:7468:2: ( ruleType )
            {
            // InternalFPML.g:7468:2: ( ruleType )
            // InternalFPML.g:7469:3: ruleType
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
    // InternalFPML.g:7478:1: rule__IntegerType__TypeAssignment_1 : ( ( 'int' ) ) ;
    public final void rule__IntegerType__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7482:1: ( ( ( 'int' ) ) )
            // InternalFPML.g:7483:2: ( ( 'int' ) )
            {
            // InternalFPML.g:7483:2: ( ( 'int' ) )
            // InternalFPML.g:7484:3: ( 'int' )
            {
             before(grammarAccess.getIntegerTypeAccess().getTypeIntKeyword_1_0()); 
            // InternalFPML.g:7485:3: ( 'int' )
            // InternalFPML.g:7486:4: 'int'
            {
             before(grammarAccess.getIntegerTypeAccess().getTypeIntKeyword_1_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalFPML.g:7497:1: rule__StringType__TypeAssignment_1 : ( ( 'String' ) ) ;
    public final void rule__StringType__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7501:1: ( ( ( 'String' ) ) )
            // InternalFPML.g:7502:2: ( ( 'String' ) )
            {
            // InternalFPML.g:7502:2: ( ( 'String' ) )
            // InternalFPML.g:7503:3: ( 'String' )
            {
             before(grammarAccess.getStringTypeAccess().getTypeStringKeyword_1_0()); 
            // InternalFPML.g:7504:3: ( 'String' )
            // InternalFPML.g:7505:4: 'String'
            {
             before(grammarAccess.getStringTypeAccess().getTypeStringKeyword_1_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalFPML.g:7516:1: rule__UnitType__TypeAssignment_1 : ( ( 'Unit' ) ) ;
    public final void rule__UnitType__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7520:1: ( ( ( 'Unit' ) ) )
            // InternalFPML.g:7521:2: ( ( 'Unit' ) )
            {
            // InternalFPML.g:7521:2: ( ( 'Unit' ) )
            // InternalFPML.g:7522:3: ( 'Unit' )
            {
             before(grammarAccess.getUnitTypeAccess().getTypeUnitKeyword_1_0()); 
            // InternalFPML.g:7523:3: ( 'Unit' )
            // InternalFPML.g:7524:4: 'Unit'
            {
             before(grammarAccess.getUnitTypeAccess().getTypeUnitKeyword_1_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalFPML.g:7535:1: rule__DataType__TypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__DataType__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7539:1: ( ( ( RULE_ID ) ) )
            // InternalFPML.g:7540:2: ( ( RULE_ID ) )
            {
            // InternalFPML.g:7540:2: ( ( RULE_ID ) )
            // InternalFPML.g:7541:3: ( RULE_ID )
            {
             before(grammarAccess.getDataTypeAccess().getTypeDataCrossReference_2_0()); 
            // InternalFPML.g:7542:3: ( RULE_ID )
            // InternalFPML.g:7543:4: RULE_ID
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
    // InternalFPML.g:7554:1: rule__PureFunctionType__ArgTypeAssignment_3 : ( ruleValueType ) ;
    public final void rule__PureFunctionType__ArgTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7558:1: ( ( ruleValueType ) )
            // InternalFPML.g:7559:2: ( ruleValueType )
            {
            // InternalFPML.g:7559:2: ( ruleValueType )
            // InternalFPML.g:7560:3: ruleValueType
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
    // InternalFPML.g:7569:1: rule__PureFunctionType__ReturnTypeAssignment_5 : ( ruleValueType ) ;
    public final void rule__PureFunctionType__ReturnTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7573:1: ( ( ruleValueType ) )
            // InternalFPML.g:7574:2: ( ruleValueType )
            {
            // InternalFPML.g:7574:2: ( ruleValueType )
            // InternalFPML.g:7575:3: ruleValueType
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
    // InternalFPML.g:7584:1: rule__EffectFullFunctionType__ArgTypeAssignment_3 : ( ruleType ) ;
    public final void rule__EffectFullFunctionType__ArgTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7588:1: ( ( ruleType ) )
            // InternalFPML.g:7589:2: ( ruleType )
            {
            // InternalFPML.g:7589:2: ( ruleType )
            // InternalFPML.g:7590:3: ruleType
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
    // InternalFPML.g:7599:1: rule__EffectFullFunctionType__ReturnTypeAssignment_5 : ( ruleIOType ) ;
    public final void rule__EffectFullFunctionType__ReturnTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7603:1: ( ( ruleIOType ) )
            // InternalFPML.g:7604:2: ( ruleIOType )
            {
            // InternalFPML.g:7604:2: ( ruleIOType )
            // InternalFPML.g:7605:3: ruleIOType
            {
             before(grammarAccess.getEffectFullFunctionTypeAccess().getReturnTypeIOTypeParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleIOType();

            state._fsp--;

             after(grammarAccess.getEffectFullFunctionTypeAccess().getReturnTypeIOTypeParserRuleCall_5_0()); 

            }


            }

        }
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
    // InternalFPML.g:7614:1: rule__IntValue__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__IntValue__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7618:1: ( ( RULE_INT ) )
            // InternalFPML.g:7619:2: ( RULE_INT )
            {
            // InternalFPML.g:7619:2: ( RULE_INT )
            // InternalFPML.g:7620:3: RULE_INT
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
    // InternalFPML.g:7629:1: rule__StringValue__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__StringValue__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7633:1: ( ( RULE_STRING ) )
            // InternalFPML.g:7634:2: ( RULE_STRING )
            {
            // InternalFPML.g:7634:2: ( RULE_STRING )
            // InternalFPML.g:7635:3: RULE_STRING
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
    // InternalFPML.g:7644:1: rule__FunctionValue__ValueAssignment : ( rulePureLambda ) ;
    public final void rule__FunctionValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7648:1: ( ( rulePureLambda ) )
            // InternalFPML.g:7649:2: ( rulePureLambda )
            {
            // InternalFPML.g:7649:2: ( rulePureLambda )
            // InternalFPML.g:7650:3: rulePureLambda
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
    // InternalFPML.g:7659:1: rule__DataValue__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__DataValue__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7663:1: ( ( ( RULE_ID ) ) )
            // InternalFPML.g:7664:2: ( ( RULE_ID ) )
            {
            // InternalFPML.g:7664:2: ( ( RULE_ID ) )
            // InternalFPML.g:7665:3: ( RULE_ID )
            {
             before(grammarAccess.getDataValueAccess().getTypeDataCrossReference_1_0()); 
            // InternalFPML.g:7666:3: ( RULE_ID )
            // InternalFPML.g:7667:4: RULE_ID
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
    // InternalFPML.g:7678:1: rule__DataValue__ValueAssignment_3 : ( ruleAdtValue ) ;
    public final void rule__DataValue__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7682:1: ( ( ruleAdtValue ) )
            // InternalFPML.g:7683:2: ( ruleAdtValue )
            {
            // InternalFPML.g:7683:2: ( ruleAdtValue )
            // InternalFPML.g:7684:3: ruleAdtValue
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
    // InternalFPML.g:7693:1: rule__ValueRef__ValueAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ValueRef__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7697:1: ( ( ( RULE_ID ) ) )
            // InternalFPML.g:7698:2: ( ( RULE_ID ) )
            {
            // InternalFPML.g:7698:2: ( ( RULE_ID ) )
            // InternalFPML.g:7699:3: ( RULE_ID )
            {
             before(grammarAccess.getValueRefAccess().getValuePureReferenceCrossReference_1_0()); 
            // InternalFPML.g:7700:3: ( RULE_ID )
            // InternalFPML.g:7701:4: RULE_ID
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
    // InternalFPML.g:7712:1: rule__PureLambda__ArgAssignment_1 : ( ruleArgument ) ;
    public final void rule__PureLambda__ArgAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7716:1: ( ( ruleArgument ) )
            // InternalFPML.g:7717:2: ( ruleArgument )
            {
            // InternalFPML.g:7717:2: ( ruleArgument )
            // InternalFPML.g:7718:3: ruleArgument
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
    // InternalFPML.g:7727:1: rule__PureLambda__FunctionBodyAssignment_4 : ( ruleFunctionBodyPure ) ;
    public final void rule__PureLambda__FunctionBodyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7731:1: ( ( ruleFunctionBodyPure ) )
            // InternalFPML.g:7732:2: ( ruleFunctionBodyPure )
            {
            // InternalFPML.g:7732:2: ( ruleFunctionBodyPure )
            // InternalFPML.g:7733:3: ruleFunctionBodyPure
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
    // InternalFPML.g:7742:1: rule__EffectFullLambda__ArgAssignment_1 : ( ruleEffectFullArgument ) ;
    public final void rule__EffectFullLambda__ArgAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7746:1: ( ( ruleEffectFullArgument ) )
            // InternalFPML.g:7747:2: ( ruleEffectFullArgument )
            {
            // InternalFPML.g:7747:2: ( ruleEffectFullArgument )
            // InternalFPML.g:7748:3: ruleEffectFullArgument
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
    // InternalFPML.g:7757:1: rule__EffectFullLambda__FunctionBodyAssignment_4 : ( ruleFunctionBodyEffectFull ) ;
    public final void rule__EffectFullLambda__FunctionBodyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7761:1: ( ( ruleFunctionBodyEffectFull ) )
            // InternalFPML.g:7762:2: ( ruleFunctionBodyEffectFull )
            {
            // InternalFPML.g:7762:2: ( ruleFunctionBodyEffectFull )
            // InternalFPML.g:7763:3: ruleFunctionBodyEffectFull
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
    // InternalFPML.g:7772:1: rule__ProdValue__ProdAdtElement1Assignment_1 : ( ruleAdtValue ) ;
    public final void rule__ProdValue__ProdAdtElement1Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7776:1: ( ( ruleAdtValue ) )
            // InternalFPML.g:7777:2: ( ruleAdtValue )
            {
            // InternalFPML.g:7777:2: ( ruleAdtValue )
            // InternalFPML.g:7778:3: ruleAdtValue
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
    // InternalFPML.g:7787:1: rule__ProdValue__ProdAdtElement2Assignment_3 : ( ruleAdtValue ) ;
    public final void rule__ProdValue__ProdAdtElement2Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7791:1: ( ( ruleAdtValue ) )
            // InternalFPML.g:7792:2: ( ruleAdtValue )
            {
            // InternalFPML.g:7792:2: ( ruleAdtValue )
            // InternalFPML.g:7793:3: ruleAdtValue
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
    // InternalFPML.g:7802:1: rule__SumValue__SumAdtElement1Assignment_0_2 : ( ruleAdtValue ) ;
    public final void rule__SumValue__SumAdtElement1Assignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7806:1: ( ( ruleAdtValue ) )
            // InternalFPML.g:7807:2: ( ruleAdtValue )
            {
            // InternalFPML.g:7807:2: ( ruleAdtValue )
            // InternalFPML.g:7808:3: ruleAdtValue
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
    // InternalFPML.g:7817:1: rule__SumValue__SumAdtElement2Assignment_1_2 : ( ruleAdtValue ) ;
    public final void rule__SumValue__SumAdtElement2Assignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7821:1: ( ( ruleAdtValue ) )
            // InternalFPML.g:7822:2: ( ruleAdtValue )
            {
            // InternalFPML.g:7822:2: ( ruleAdtValue )
            // InternalFPML.g:7823:3: ruleAdtValue
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


    // $ANTLR start "rule__Apply__ValueAssignment_2"
    // InternalFPML.g:7832:1: rule__Apply__ValueAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Apply__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7836:1: ( ( ( RULE_ID ) ) )
            // InternalFPML.g:7837:2: ( ( RULE_ID ) )
            {
            // InternalFPML.g:7837:2: ( ( RULE_ID ) )
            // InternalFPML.g:7838:3: ( RULE_ID )
            {
             before(grammarAccess.getApplyAccess().getValueValueCrossReference_2_0()); 
            // InternalFPML.g:7839:3: ( RULE_ID )
            // InternalFPML.g:7840:4: RULE_ID
            {
             before(grammarAccess.getApplyAccess().getValueValueIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getApplyAccess().getValueValueIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getApplyAccess().getValueValueCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Apply__ValueAssignment_2"

    // Delegated rules


    protected DFA13 dfa13 = new DFA13(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\3\uffff\1\7\6\uffff";
    static final String dfa_3s = "\1\4\2\uffff\1\30\1\uffff\1\4\4\uffff";
    static final String dfa_4s = "\1\50\2\uffff\1\43\1\uffff\1\60\4\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\2\1\uffff\1\5\1\uffff\1\4\1\3\1\7\1\6";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\3\1\1\1\2\21\uffff\1\5\16\uffff\2\4",
            "",
            "",
            "\1\6\1\7\11\uffff\1\7",
            "",
            "\3\10\21\uffff\1\10\7\uffff\2\11\5\uffff\2\10\6\uffff\2\11",
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

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1740:1: rule__AdtValue__Alternatives : ( ( ruleIntValue ) | ( ruleStringValue ) | ( ruleValueRef ) | ( ruleDataValue ) | ( ruleSumValue ) | ( ruleFunctionValue ) | ( ruleProdValue ) );";
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
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0001800300080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000004001000070L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0001800300000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00003E0010600010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0003802300000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000400010000010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00007E0010600010L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x000001C001000070L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000100000000000L});

}