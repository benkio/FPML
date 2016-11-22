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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Pure'", "'{'", "'}'", "'Functions'", "'Data'", "'Value'", "'Effects'", "':'", "'['", "']'", "'+'", "'*'", "'def'", "'('", "')'", "','", "'IO'", "'main'", "'Undefined'", "'|>'", "'>>='", "'ref'", "'F'", "'<'", "'>'", "'FIO'", "'Left'", "'Right'", "'IntToString'", "'IntPow'", "'-'", "'mod'", "'applyF'", "'print'", "'applyFIO'", "'int'", "'String'", "'Unit'"
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


    // $ANTLR start "entryRuleFunction"
    // InternalFPML.g:403:1: entryRuleFunction : ruleFunction EOF ;
    public final void entryRuleFunction() throws RecognitionException {
        try {
            // InternalFPML.g:404:1: ( ruleFunction EOF )
            // InternalFPML.g:405:1: ruleFunction EOF
            {
             before(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            ruleFunction();

            state._fsp--;

             after(grammarAccess.getFunctionRule()); 
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
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalFPML.g:412:1: ruleFunction : ( ( rule__Function__Alternatives ) ) ;
    public final void ruleFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:416:2: ( ( ( rule__Function__Alternatives ) ) )
            // InternalFPML.g:417:2: ( ( rule__Function__Alternatives ) )
            {
            // InternalFPML.g:417:2: ( ( rule__Function__Alternatives ) )
            // InternalFPML.g:418:3: ( rule__Function__Alternatives )
            {
             before(grammarAccess.getFunctionAccess().getAlternatives()); 
            // InternalFPML.g:419:3: ( rule__Function__Alternatives )
            // InternalFPML.g:419:4: rule__Function__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Function__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRulePureFunction"
    // InternalFPML.g:428:1: entryRulePureFunction : rulePureFunction EOF ;
    public final void entryRulePureFunction() throws RecognitionException {
        try {
            // InternalFPML.g:429:1: ( rulePureFunction EOF )
            // InternalFPML.g:430:1: rulePureFunction EOF
            {
             before(grammarAccess.getPureFunctionRule()); 
            pushFollow(FOLLOW_1);
            rulePureFunction();

            state._fsp--;

             after(grammarAccess.getPureFunctionRule()); 
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
    // $ANTLR end "entryRulePureFunction"


    // $ANTLR start "rulePureFunction"
    // InternalFPML.g:437:1: rulePureFunction : ( ( rule__PureFunction__Alternatives ) ) ;
    public final void rulePureFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:441:2: ( ( ( rule__PureFunction__Alternatives ) ) )
            // InternalFPML.g:442:2: ( ( rule__PureFunction__Alternatives ) )
            {
            // InternalFPML.g:442:2: ( ( rule__PureFunction__Alternatives ) )
            // InternalFPML.g:443:3: ( rule__PureFunction__Alternatives )
            {
             before(grammarAccess.getPureFunctionAccess().getAlternatives()); 
            // InternalFPML.g:444:3: ( rule__PureFunction__Alternatives )
            // InternalFPML.g:444:4: rule__PureFunction__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PureFunction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPureFunctionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePureFunction"


    // $ANTLR start "entryRuleEffectFullFunction"
    // InternalFPML.g:453:1: entryRuleEffectFullFunction : ruleEffectFullFunction EOF ;
    public final void entryRuleEffectFullFunction() throws RecognitionException {
        try {
            // InternalFPML.g:454:1: ( ruleEffectFullFunction EOF )
            // InternalFPML.g:455:1: ruleEffectFullFunction EOF
            {
             before(grammarAccess.getEffectFullFunctionRule()); 
            pushFollow(FOLLOW_1);
            ruleEffectFullFunction();

            state._fsp--;

             after(grammarAccess.getEffectFullFunctionRule()); 
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
    // $ANTLR end "entryRuleEffectFullFunction"


    // $ANTLR start "ruleEffectFullFunction"
    // InternalFPML.g:462:1: ruleEffectFullFunction : ( ( rule__EffectFullFunction__Alternatives ) ) ;
    public final void ruleEffectFullFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:466:2: ( ( ( rule__EffectFullFunction__Alternatives ) ) )
            // InternalFPML.g:467:2: ( ( rule__EffectFullFunction__Alternatives ) )
            {
            // InternalFPML.g:467:2: ( ( rule__EffectFullFunction__Alternatives ) )
            // InternalFPML.g:468:3: ( rule__EffectFullFunction__Alternatives )
            {
             before(grammarAccess.getEffectFullFunctionAccess().getAlternatives()); 
            // InternalFPML.g:469:3: ( rule__EffectFullFunction__Alternatives )
            // InternalFPML.g:469:4: rule__EffectFullFunction__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullFunction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEffectFullFunctionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEffectFullFunction"


    // $ANTLR start "entryRuleEffectFullArgument"
    // InternalFPML.g:478:1: entryRuleEffectFullArgument : ruleEffectFullArgument EOF ;
    public final void entryRuleEffectFullArgument() throws RecognitionException {
        try {
            // InternalFPML.g:479:1: ( ruleEffectFullArgument EOF )
            // InternalFPML.g:480:1: ruleEffectFullArgument EOF
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
    // InternalFPML.g:487:1: ruleEffectFullArgument : ( ( rule__EffectFullArgument__Group__0 ) ) ;
    public final void ruleEffectFullArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:491:2: ( ( ( rule__EffectFullArgument__Group__0 ) ) )
            // InternalFPML.g:492:2: ( ( rule__EffectFullArgument__Group__0 ) )
            {
            // InternalFPML.g:492:2: ( ( rule__EffectFullArgument__Group__0 ) )
            // InternalFPML.g:493:3: ( rule__EffectFullArgument__Group__0 )
            {
             before(grammarAccess.getEffectFullArgumentAccess().getGroup()); 
            // InternalFPML.g:494:3: ( rule__EffectFullArgument__Group__0 )
            // InternalFPML.g:494:4: rule__EffectFullArgument__Group__0
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
    // InternalFPML.g:503:1: entryRuleArgument : ruleArgument EOF ;
    public final void entryRuleArgument() throws RecognitionException {
        try {
            // InternalFPML.g:504:1: ( ruleArgument EOF )
            // InternalFPML.g:505:1: ruleArgument EOF
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
    // InternalFPML.g:512:1: ruleArgument : ( ( rule__Argument__Group__0 ) ) ;
    public final void ruleArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:516:2: ( ( ( rule__Argument__Group__0 ) ) )
            // InternalFPML.g:517:2: ( ( rule__Argument__Group__0 ) )
            {
            // InternalFPML.g:517:2: ( ( rule__Argument__Group__0 ) )
            // InternalFPML.g:518:3: ( rule__Argument__Group__0 )
            {
             before(grammarAccess.getArgumentAccess().getGroup()); 
            // InternalFPML.g:519:3: ( rule__Argument__Group__0 )
            // InternalFPML.g:519:4: rule__Argument__Group__0
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
    // InternalFPML.g:528:1: entryRuleFunctionBodyPure : ruleFunctionBodyPure EOF ;
    public final void entryRuleFunctionBodyPure() throws RecognitionException {
        try {
            // InternalFPML.g:529:1: ( ruleFunctionBodyPure EOF )
            // InternalFPML.g:530:1: ruleFunctionBodyPure EOF
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
    // InternalFPML.g:537:1: ruleFunctionBodyPure : ( ( rule__FunctionBodyPure__Alternatives ) ) ;
    public final void ruleFunctionBodyPure() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:541:2: ( ( ( rule__FunctionBodyPure__Alternatives ) ) )
            // InternalFPML.g:542:2: ( ( rule__FunctionBodyPure__Alternatives ) )
            {
            // InternalFPML.g:542:2: ( ( rule__FunctionBodyPure__Alternatives ) )
            // InternalFPML.g:543:3: ( rule__FunctionBodyPure__Alternatives )
            {
             before(grammarAccess.getFunctionBodyPureAccess().getAlternatives()); 
            // InternalFPML.g:544:3: ( rule__FunctionBodyPure__Alternatives )
            // InternalFPML.g:544:4: rule__FunctionBodyPure__Alternatives
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
    // InternalFPML.g:553:1: entryRuleFunctionBodyEffectFull : ruleFunctionBodyEffectFull EOF ;
    public final void entryRuleFunctionBodyEffectFull() throws RecognitionException {
        try {
            // InternalFPML.g:554:1: ( ruleFunctionBodyEffectFull EOF )
            // InternalFPML.g:555:1: ruleFunctionBodyEffectFull EOF
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
    // InternalFPML.g:562:1: ruleFunctionBodyEffectFull : ( ( rule__FunctionBodyEffectFull__Alternatives ) ) ;
    public final void ruleFunctionBodyEffectFull() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:566:2: ( ( ( rule__FunctionBodyEffectFull__Alternatives ) ) )
            // InternalFPML.g:567:2: ( ( rule__FunctionBodyEffectFull__Alternatives ) )
            {
            // InternalFPML.g:567:2: ( ( rule__FunctionBodyEffectFull__Alternatives ) )
            // InternalFPML.g:568:3: ( rule__FunctionBodyEffectFull__Alternatives )
            {
             before(grammarAccess.getFunctionBodyEffectFullAccess().getAlternatives()); 
            // InternalFPML.g:569:3: ( rule__FunctionBodyEffectFull__Alternatives )
            // InternalFPML.g:569:4: rule__FunctionBodyEffectFull__Alternatives
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
    // InternalFPML.g:578:1: entryRuleEmptyFunctionBody : ruleEmptyFunctionBody EOF ;
    public final void entryRuleEmptyFunctionBody() throws RecognitionException {
        try {
            // InternalFPML.g:579:1: ( ruleEmptyFunctionBody EOF )
            // InternalFPML.g:580:1: ruleEmptyFunctionBody EOF
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
    // InternalFPML.g:587:1: ruleEmptyFunctionBody : ( ( rule__EmptyFunctionBody__Group__0 ) ) ;
    public final void ruleEmptyFunctionBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:591:2: ( ( ( rule__EmptyFunctionBody__Group__0 ) ) )
            // InternalFPML.g:592:2: ( ( rule__EmptyFunctionBody__Group__0 ) )
            {
            // InternalFPML.g:592:2: ( ( rule__EmptyFunctionBody__Group__0 ) )
            // InternalFPML.g:593:3: ( rule__EmptyFunctionBody__Group__0 )
            {
             before(grammarAccess.getEmptyFunctionBodyAccess().getGroup()); 
            // InternalFPML.g:594:3: ( rule__EmptyFunctionBody__Group__0 )
            // InternalFPML.g:594:4: rule__EmptyFunctionBody__Group__0
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
    // InternalFPML.g:603:1: entryRuleCompositionFunctionBodyPure : ruleCompositionFunctionBodyPure EOF ;
    public final void entryRuleCompositionFunctionBodyPure() throws RecognitionException {
        try {
            // InternalFPML.g:604:1: ( ruleCompositionFunctionBodyPure EOF )
            // InternalFPML.g:605:1: ruleCompositionFunctionBodyPure EOF
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
    // InternalFPML.g:612:1: ruleCompositionFunctionBodyPure : ( ( rule__CompositionFunctionBodyPure__Alternatives ) ) ;
    public final void ruleCompositionFunctionBodyPure() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:616:2: ( ( ( rule__CompositionFunctionBodyPure__Alternatives ) ) )
            // InternalFPML.g:617:2: ( ( rule__CompositionFunctionBodyPure__Alternatives ) )
            {
            // InternalFPML.g:617:2: ( ( rule__CompositionFunctionBodyPure__Alternatives ) )
            // InternalFPML.g:618:3: ( rule__CompositionFunctionBodyPure__Alternatives )
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getAlternatives()); 
            // InternalFPML.g:619:3: ( rule__CompositionFunctionBodyPure__Alternatives )
            // InternalFPML.g:619:4: rule__CompositionFunctionBodyPure__Alternatives
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
    // InternalFPML.g:628:1: entryRuleCompositionFunctionBodyPureFactor : ruleCompositionFunctionBodyPureFactor EOF ;
    public final void entryRuleCompositionFunctionBodyPureFactor() throws RecognitionException {
        try {
            // InternalFPML.g:629:1: ( ruleCompositionFunctionBodyPureFactor EOF )
            // InternalFPML.g:630:1: ruleCompositionFunctionBodyPureFactor EOF
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
    // InternalFPML.g:637:1: ruleCompositionFunctionBodyPureFactor : ( ( rule__CompositionFunctionBodyPureFactor__Alternatives ) ) ;
    public final void ruleCompositionFunctionBodyPureFactor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:641:2: ( ( ( rule__CompositionFunctionBodyPureFactor__Alternatives ) ) )
            // InternalFPML.g:642:2: ( ( rule__CompositionFunctionBodyPureFactor__Alternatives ) )
            {
            // InternalFPML.g:642:2: ( ( rule__CompositionFunctionBodyPureFactor__Alternatives ) )
            // InternalFPML.g:643:3: ( rule__CompositionFunctionBodyPureFactor__Alternatives )
            {
             before(grammarAccess.getCompositionFunctionBodyPureFactorAccess().getAlternatives()); 
            // InternalFPML.g:644:3: ( rule__CompositionFunctionBodyPureFactor__Alternatives )
            // InternalFPML.g:644:4: rule__CompositionFunctionBodyPureFactor__Alternatives
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
    // InternalFPML.g:653:1: entryRuleCompositionFunctionBodyEffect : ruleCompositionFunctionBodyEffect EOF ;
    public final void entryRuleCompositionFunctionBodyEffect() throws RecognitionException {
        try {
            // InternalFPML.g:654:1: ( ruleCompositionFunctionBodyEffect EOF )
            // InternalFPML.g:655:1: ruleCompositionFunctionBodyEffect EOF
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
    // InternalFPML.g:662:1: ruleCompositionFunctionBodyEffect : ( ( rule__CompositionFunctionBodyEffect__Alternatives ) ) ;
    public final void ruleCompositionFunctionBodyEffect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:666:2: ( ( ( rule__CompositionFunctionBodyEffect__Alternatives ) ) )
            // InternalFPML.g:667:2: ( ( rule__CompositionFunctionBodyEffect__Alternatives ) )
            {
            // InternalFPML.g:667:2: ( ( rule__CompositionFunctionBodyEffect__Alternatives ) )
            // InternalFPML.g:668:3: ( rule__CompositionFunctionBodyEffect__Alternatives )
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getAlternatives()); 
            // InternalFPML.g:669:3: ( rule__CompositionFunctionBodyEffect__Alternatives )
            // InternalFPML.g:669:4: rule__CompositionFunctionBodyEffect__Alternatives
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
    // InternalFPML.g:678:1: entryRuleCompositionFunctionBodyEffectFullFactor : ruleCompositionFunctionBodyEffectFullFactor EOF ;
    public final void entryRuleCompositionFunctionBodyEffectFullFactor() throws RecognitionException {
        try {
            // InternalFPML.g:679:1: ( ruleCompositionFunctionBodyEffectFullFactor EOF )
            // InternalFPML.g:680:1: ruleCompositionFunctionBodyEffectFullFactor EOF
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
    // InternalFPML.g:687:1: ruleCompositionFunctionBodyEffectFullFactor : ( ( rule__CompositionFunctionBodyEffectFullFactor__Alternatives ) ) ;
    public final void ruleCompositionFunctionBodyEffectFullFactor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:691:2: ( ( ( rule__CompositionFunctionBodyEffectFullFactor__Alternatives ) ) )
            // InternalFPML.g:692:2: ( ( rule__CompositionFunctionBodyEffectFullFactor__Alternatives ) )
            {
            // InternalFPML.g:692:2: ( ( rule__CompositionFunctionBodyEffectFullFactor__Alternatives ) )
            // InternalFPML.g:693:3: ( rule__CompositionFunctionBodyEffectFullFactor__Alternatives )
            {
             before(grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getAlternatives()); 
            // InternalFPML.g:694:3: ( rule__CompositionFunctionBodyEffectFullFactor__Alternatives )
            // InternalFPML.g:694:4: rule__CompositionFunctionBodyEffectFullFactor__Alternatives
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


    // $ANTLR start "entryRuleIOType"
    // InternalFPML.g:703:1: entryRuleIOType : ruleIOType EOF ;
    public final void entryRuleIOType() throws RecognitionException {
        try {
            // InternalFPML.g:704:1: ( ruleIOType EOF )
            // InternalFPML.g:705:1: ruleIOType EOF
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
    // InternalFPML.g:712:1: ruleIOType : ( ( rule__IOType__Group__0 ) ) ;
    public final void ruleIOType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:716:2: ( ( ( rule__IOType__Group__0 ) ) )
            // InternalFPML.g:717:2: ( ( rule__IOType__Group__0 ) )
            {
            // InternalFPML.g:717:2: ( ( rule__IOType__Group__0 ) )
            // InternalFPML.g:718:3: ( rule__IOType__Group__0 )
            {
             before(grammarAccess.getIOTypeAccess().getGroup()); 
            // InternalFPML.g:719:3: ( rule__IOType__Group__0 )
            // InternalFPML.g:719:4: rule__IOType__Group__0
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
    // InternalFPML.g:728:1: entryRuleValueType : ruleValueType EOF ;
    public final void entryRuleValueType() throws RecognitionException {
        try {
            // InternalFPML.g:729:1: ( ruleValueType EOF )
            // InternalFPML.g:730:1: ruleValueType EOF
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
    // InternalFPML.g:737:1: ruleValueType : ( ( rule__ValueType__Alternatives ) ) ;
    public final void ruleValueType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:741:2: ( ( ( rule__ValueType__Alternatives ) ) )
            // InternalFPML.g:742:2: ( ( rule__ValueType__Alternatives ) )
            {
            // InternalFPML.g:742:2: ( ( rule__ValueType__Alternatives ) )
            // InternalFPML.g:743:3: ( rule__ValueType__Alternatives )
            {
             before(grammarAccess.getValueTypeAccess().getAlternatives()); 
            // InternalFPML.g:744:3: ( rule__ValueType__Alternatives )
            // InternalFPML.g:744:4: rule__ValueType__Alternatives
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
    // InternalFPML.g:753:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalFPML.g:754:1: ( ruleType EOF )
            // InternalFPML.g:755:1: ruleType EOF
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
    // InternalFPML.g:762:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:766:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalFPML.g:767:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalFPML.g:767:2: ( ( rule__Type__Alternatives ) )
            // InternalFPML.g:768:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalFPML.g:769:3: ( rule__Type__Alternatives )
            // InternalFPML.g:769:4: rule__Type__Alternatives
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
    // InternalFPML.g:778:1: entryRuleIntegerType : ruleIntegerType EOF ;
    public final void entryRuleIntegerType() throws RecognitionException {
        try {
            // InternalFPML.g:779:1: ( ruleIntegerType EOF )
            // InternalFPML.g:780:1: ruleIntegerType EOF
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
    // InternalFPML.g:787:1: ruleIntegerType : ( ( rule__IntegerType__Group__0 ) ) ;
    public final void ruleIntegerType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:791:2: ( ( ( rule__IntegerType__Group__0 ) ) )
            // InternalFPML.g:792:2: ( ( rule__IntegerType__Group__0 ) )
            {
            // InternalFPML.g:792:2: ( ( rule__IntegerType__Group__0 ) )
            // InternalFPML.g:793:3: ( rule__IntegerType__Group__0 )
            {
             before(grammarAccess.getIntegerTypeAccess().getGroup()); 
            // InternalFPML.g:794:3: ( rule__IntegerType__Group__0 )
            // InternalFPML.g:794:4: rule__IntegerType__Group__0
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
    // InternalFPML.g:803:1: entryRuleStringType : ruleStringType EOF ;
    public final void entryRuleStringType() throws RecognitionException {
        try {
            // InternalFPML.g:804:1: ( ruleStringType EOF )
            // InternalFPML.g:805:1: ruleStringType EOF
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
    // InternalFPML.g:812:1: ruleStringType : ( ( rule__StringType__Group__0 ) ) ;
    public final void ruleStringType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:816:2: ( ( ( rule__StringType__Group__0 ) ) )
            // InternalFPML.g:817:2: ( ( rule__StringType__Group__0 ) )
            {
            // InternalFPML.g:817:2: ( ( rule__StringType__Group__0 ) )
            // InternalFPML.g:818:3: ( rule__StringType__Group__0 )
            {
             before(grammarAccess.getStringTypeAccess().getGroup()); 
            // InternalFPML.g:819:3: ( rule__StringType__Group__0 )
            // InternalFPML.g:819:4: rule__StringType__Group__0
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
    // InternalFPML.g:828:1: entryRuleUnitType : ruleUnitType EOF ;
    public final void entryRuleUnitType() throws RecognitionException {
        try {
            // InternalFPML.g:829:1: ( ruleUnitType EOF )
            // InternalFPML.g:830:1: ruleUnitType EOF
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
    // InternalFPML.g:837:1: ruleUnitType : ( ( rule__UnitType__Group__0 ) ) ;
    public final void ruleUnitType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:841:2: ( ( ( rule__UnitType__Group__0 ) ) )
            // InternalFPML.g:842:2: ( ( rule__UnitType__Group__0 ) )
            {
            // InternalFPML.g:842:2: ( ( rule__UnitType__Group__0 ) )
            // InternalFPML.g:843:3: ( rule__UnitType__Group__0 )
            {
             before(grammarAccess.getUnitTypeAccess().getGroup()); 
            // InternalFPML.g:844:3: ( rule__UnitType__Group__0 )
            // InternalFPML.g:844:4: rule__UnitType__Group__0
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
    // InternalFPML.g:853:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // InternalFPML.g:854:1: ( ruleDataType EOF )
            // InternalFPML.g:855:1: ruleDataType EOF
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
    // InternalFPML.g:862:1: ruleDataType : ( ( rule__DataType__Group__0 ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:866:2: ( ( ( rule__DataType__Group__0 ) ) )
            // InternalFPML.g:867:2: ( ( rule__DataType__Group__0 ) )
            {
            // InternalFPML.g:867:2: ( ( rule__DataType__Group__0 ) )
            // InternalFPML.g:868:3: ( rule__DataType__Group__0 )
            {
             before(grammarAccess.getDataTypeAccess().getGroup()); 
            // InternalFPML.g:869:3: ( rule__DataType__Group__0 )
            // InternalFPML.g:869:4: rule__DataType__Group__0
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
    // InternalFPML.g:878:1: entryRulePureFunctionType : rulePureFunctionType EOF ;
    public final void entryRulePureFunctionType() throws RecognitionException {
        try {
            // InternalFPML.g:879:1: ( rulePureFunctionType EOF )
            // InternalFPML.g:880:1: rulePureFunctionType EOF
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
    // InternalFPML.g:887:1: rulePureFunctionType : ( ( rule__PureFunctionType__Group__0 ) ) ;
    public final void rulePureFunctionType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:891:2: ( ( ( rule__PureFunctionType__Group__0 ) ) )
            // InternalFPML.g:892:2: ( ( rule__PureFunctionType__Group__0 ) )
            {
            // InternalFPML.g:892:2: ( ( rule__PureFunctionType__Group__0 ) )
            // InternalFPML.g:893:3: ( rule__PureFunctionType__Group__0 )
            {
             before(grammarAccess.getPureFunctionTypeAccess().getGroup()); 
            // InternalFPML.g:894:3: ( rule__PureFunctionType__Group__0 )
            // InternalFPML.g:894:4: rule__PureFunctionType__Group__0
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
    // InternalFPML.g:903:1: entryRuleEffectFullFunctionType : ruleEffectFullFunctionType EOF ;
    public final void entryRuleEffectFullFunctionType() throws RecognitionException {
        try {
            // InternalFPML.g:904:1: ( ruleEffectFullFunctionType EOF )
            // InternalFPML.g:905:1: ruleEffectFullFunctionType EOF
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
    // InternalFPML.g:912:1: ruleEffectFullFunctionType : ( ( rule__EffectFullFunctionType__Group__0 ) ) ;
    public final void ruleEffectFullFunctionType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:916:2: ( ( ( rule__EffectFullFunctionType__Group__0 ) ) )
            // InternalFPML.g:917:2: ( ( rule__EffectFullFunctionType__Group__0 ) )
            {
            // InternalFPML.g:917:2: ( ( rule__EffectFullFunctionType__Group__0 ) )
            // InternalFPML.g:918:3: ( rule__EffectFullFunctionType__Group__0 )
            {
             before(grammarAccess.getEffectFullFunctionTypeAccess().getGroup()); 
            // InternalFPML.g:919:3: ( rule__EffectFullFunctionType__Group__0 )
            // InternalFPML.g:919:4: rule__EffectFullFunctionType__Group__0
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
    // InternalFPML.g:928:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalFPML.g:929:1: ( ruleExpression EOF )
            // InternalFPML.g:930:1: ruleExpression EOF
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
    // InternalFPML.g:937:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:941:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalFPML.g:942:2: ( ( rule__Expression__Alternatives ) )
            {
            // InternalFPML.g:942:2: ( ( rule__Expression__Alternatives ) )
            // InternalFPML.g:943:3: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // InternalFPML.g:944:3: ( rule__Expression__Alternatives )
            // InternalFPML.g:944:4: rule__Expression__Alternatives
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
    // InternalFPML.g:953:1: entryRuleIntValue : ruleIntValue EOF ;
    public final void entryRuleIntValue() throws RecognitionException {
        try {
            // InternalFPML.g:954:1: ( ruleIntValue EOF )
            // InternalFPML.g:955:1: ruleIntValue EOF
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
    // InternalFPML.g:962:1: ruleIntValue : ( ( rule__IntValue__Group__0 ) ) ;
    public final void ruleIntValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:966:2: ( ( ( rule__IntValue__Group__0 ) ) )
            // InternalFPML.g:967:2: ( ( rule__IntValue__Group__0 ) )
            {
            // InternalFPML.g:967:2: ( ( rule__IntValue__Group__0 ) )
            // InternalFPML.g:968:3: ( rule__IntValue__Group__0 )
            {
             before(grammarAccess.getIntValueAccess().getGroup()); 
            // InternalFPML.g:969:3: ( rule__IntValue__Group__0 )
            // InternalFPML.g:969:4: rule__IntValue__Group__0
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
    // InternalFPML.g:978:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // InternalFPML.g:979:1: ( ruleStringValue EOF )
            // InternalFPML.g:980:1: ruleStringValue EOF
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
    // InternalFPML.g:987:1: ruleStringValue : ( ( rule__StringValue__Group__0 ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:991:2: ( ( ( rule__StringValue__Group__0 ) ) )
            // InternalFPML.g:992:2: ( ( rule__StringValue__Group__0 ) )
            {
            // InternalFPML.g:992:2: ( ( rule__StringValue__Group__0 ) )
            // InternalFPML.g:993:3: ( rule__StringValue__Group__0 )
            {
             before(grammarAccess.getStringValueAccess().getGroup()); 
            // InternalFPML.g:994:3: ( rule__StringValue__Group__0 )
            // InternalFPML.g:994:4: rule__StringValue__Group__0
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


    // $ANTLR start "entryRuleAdtValue"
    // InternalFPML.g:1103:1: entryRuleAdtValue : ruleAdtValue EOF ;
    public final void entryRuleAdtValue() throws RecognitionException {
        try {
            // InternalFPML.g:1104:1: ( ruleAdtValue EOF )
            // InternalFPML.g:1105:1: ruleAdtValue EOF
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
    // InternalFPML.g:1112:1: ruleAdtValue : ( ( rule__AdtValue__Alternatives ) ) ;
    public final void ruleAdtValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1116:2: ( ( ( rule__AdtValue__Alternatives ) ) )
            // InternalFPML.g:1117:2: ( ( rule__AdtValue__Alternatives ) )
            {
            // InternalFPML.g:1117:2: ( ( rule__AdtValue__Alternatives ) )
            // InternalFPML.g:1118:3: ( rule__AdtValue__Alternatives )
            {
             before(grammarAccess.getAdtValueAccess().getAlternatives()); 
            // InternalFPML.g:1119:3: ( rule__AdtValue__Alternatives )
            // InternalFPML.g:1119:4: rule__AdtValue__Alternatives
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
    // InternalFPML.g:1128:1: entryRuleProdValue : ruleProdValue EOF ;
    public final void entryRuleProdValue() throws RecognitionException {
        try {
            // InternalFPML.g:1129:1: ( ruleProdValue EOF )
            // InternalFPML.g:1130:1: ruleProdValue EOF
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
    // InternalFPML.g:1137:1: ruleProdValue : ( ( rule__ProdValue__Group__0 ) ) ;
    public final void ruleProdValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1141:2: ( ( ( rule__ProdValue__Group__0 ) ) )
            // InternalFPML.g:1142:2: ( ( rule__ProdValue__Group__0 ) )
            {
            // InternalFPML.g:1142:2: ( ( rule__ProdValue__Group__0 ) )
            // InternalFPML.g:1143:3: ( rule__ProdValue__Group__0 )
            {
             before(grammarAccess.getProdValueAccess().getGroup()); 
            // InternalFPML.g:1144:3: ( rule__ProdValue__Group__0 )
            // InternalFPML.g:1144:4: rule__ProdValue__Group__0
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
    // InternalFPML.g:1153:1: entryRuleSumValue : ruleSumValue EOF ;
    public final void entryRuleSumValue() throws RecognitionException {
        try {
            // InternalFPML.g:1154:1: ( ruleSumValue EOF )
            // InternalFPML.g:1155:1: ruleSumValue EOF
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
    // InternalFPML.g:1162:1: ruleSumValue : ( ( rule__SumValue__Alternatives ) ) ;
    public final void ruleSumValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1166:2: ( ( ( rule__SumValue__Alternatives ) ) )
            // InternalFPML.g:1167:2: ( ( rule__SumValue__Alternatives ) )
            {
            // InternalFPML.g:1167:2: ( ( rule__SumValue__Alternatives ) )
            // InternalFPML.g:1168:3: ( rule__SumValue__Alternatives )
            {
             before(grammarAccess.getSumValueAccess().getAlternatives()); 
            // InternalFPML.g:1169:3: ( rule__SumValue__Alternatives )
            // InternalFPML.g:1169:4: rule__SumValue__Alternatives
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
    // InternalFPML.g:1178:1: entryRulePrimitivePureFunction : rulePrimitivePureFunction EOF ;
    public final void entryRulePrimitivePureFunction() throws RecognitionException {
        try {
            // InternalFPML.g:1179:1: ( rulePrimitivePureFunction EOF )
            // InternalFPML.g:1180:1: rulePrimitivePureFunction EOF
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
    // InternalFPML.g:1187:1: rulePrimitivePureFunction : ( ( rule__PrimitivePureFunction__Alternatives ) ) ;
    public final void rulePrimitivePureFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1191:2: ( ( ( rule__PrimitivePureFunction__Alternatives ) ) )
            // InternalFPML.g:1192:2: ( ( rule__PrimitivePureFunction__Alternatives ) )
            {
            // InternalFPML.g:1192:2: ( ( rule__PrimitivePureFunction__Alternatives ) )
            // InternalFPML.g:1193:3: ( rule__PrimitivePureFunction__Alternatives )
            {
             before(grammarAccess.getPrimitivePureFunctionAccess().getAlternatives()); 
            // InternalFPML.g:1194:3: ( rule__PrimitivePureFunction__Alternatives )
            // InternalFPML.g:1194:4: rule__PrimitivePureFunction__Alternatives
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
    // InternalFPML.g:1203:1: entryRuleIntToString : ruleIntToString EOF ;
    public final void entryRuleIntToString() throws RecognitionException {
        try {
            // InternalFPML.g:1204:1: ( ruleIntToString EOF )
            // InternalFPML.g:1205:1: ruleIntToString EOF
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
    // InternalFPML.g:1212:1: ruleIntToString : ( ( rule__IntToString__Group__0 ) ) ;
    public final void ruleIntToString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1216:2: ( ( ( rule__IntToString__Group__0 ) ) )
            // InternalFPML.g:1217:2: ( ( rule__IntToString__Group__0 ) )
            {
            // InternalFPML.g:1217:2: ( ( rule__IntToString__Group__0 ) )
            // InternalFPML.g:1218:3: ( rule__IntToString__Group__0 )
            {
             before(grammarAccess.getIntToStringAccess().getGroup()); 
            // InternalFPML.g:1219:3: ( rule__IntToString__Group__0 )
            // InternalFPML.g:1219:4: rule__IntToString__Group__0
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
    // InternalFPML.g:1228:1: entryRuleIntPow : ruleIntPow EOF ;
    public final void entryRuleIntPow() throws RecognitionException {
        try {
            // InternalFPML.g:1229:1: ( ruleIntPow EOF )
            // InternalFPML.g:1230:1: ruleIntPow EOF
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
    // InternalFPML.g:1237:1: ruleIntPow : ( ( rule__IntPow__Group__0 ) ) ;
    public final void ruleIntPow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1241:2: ( ( ( rule__IntPow__Group__0 ) ) )
            // InternalFPML.g:1242:2: ( ( rule__IntPow__Group__0 ) )
            {
            // InternalFPML.g:1242:2: ( ( rule__IntPow__Group__0 ) )
            // InternalFPML.g:1243:3: ( rule__IntPow__Group__0 )
            {
             before(grammarAccess.getIntPowAccess().getGroup()); 
            // InternalFPML.g:1244:3: ( rule__IntPow__Group__0 )
            // InternalFPML.g:1244:4: rule__IntPow__Group__0
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
    // InternalFPML.g:1253:1: entryRulePlus : rulePlus EOF ;
    public final void entryRulePlus() throws RecognitionException {
        try {
            // InternalFPML.g:1254:1: ( rulePlus EOF )
            // InternalFPML.g:1255:1: rulePlus EOF
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
    // InternalFPML.g:1262:1: rulePlus : ( ( rule__Plus__Group__0 ) ) ;
    public final void rulePlus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1266:2: ( ( ( rule__Plus__Group__0 ) ) )
            // InternalFPML.g:1267:2: ( ( rule__Plus__Group__0 ) )
            {
            // InternalFPML.g:1267:2: ( ( rule__Plus__Group__0 ) )
            // InternalFPML.g:1268:3: ( rule__Plus__Group__0 )
            {
             before(grammarAccess.getPlusAccess().getGroup()); 
            // InternalFPML.g:1269:3: ( rule__Plus__Group__0 )
            // InternalFPML.g:1269:4: rule__Plus__Group__0
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
    // InternalFPML.g:1278:1: entryRuleMinus : ruleMinus EOF ;
    public final void entryRuleMinus() throws RecognitionException {
        try {
            // InternalFPML.g:1279:1: ( ruleMinus EOF )
            // InternalFPML.g:1280:1: ruleMinus EOF
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
    // InternalFPML.g:1287:1: ruleMinus : ( ( rule__Minus__Group__0 ) ) ;
    public final void ruleMinus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1291:2: ( ( ( rule__Minus__Group__0 ) ) )
            // InternalFPML.g:1292:2: ( ( rule__Minus__Group__0 ) )
            {
            // InternalFPML.g:1292:2: ( ( rule__Minus__Group__0 ) )
            // InternalFPML.g:1293:3: ( rule__Minus__Group__0 )
            {
             before(grammarAccess.getMinusAccess().getGroup()); 
            // InternalFPML.g:1294:3: ( rule__Minus__Group__0 )
            // InternalFPML.g:1294:4: rule__Minus__Group__0
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
    // InternalFPML.g:1303:1: entryRuleTimes : ruleTimes EOF ;
    public final void entryRuleTimes() throws RecognitionException {
        try {
            // InternalFPML.g:1304:1: ( ruleTimes EOF )
            // InternalFPML.g:1305:1: ruleTimes EOF
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
    // InternalFPML.g:1312:1: ruleTimes : ( ( rule__Times__Group__0 ) ) ;
    public final void ruleTimes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1316:2: ( ( ( rule__Times__Group__0 ) ) )
            // InternalFPML.g:1317:2: ( ( rule__Times__Group__0 ) )
            {
            // InternalFPML.g:1317:2: ( ( rule__Times__Group__0 ) )
            // InternalFPML.g:1318:3: ( rule__Times__Group__0 )
            {
             before(grammarAccess.getTimesAccess().getGroup()); 
            // InternalFPML.g:1319:3: ( rule__Times__Group__0 )
            // InternalFPML.g:1319:4: rule__Times__Group__0
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
    // InternalFPML.g:1328:1: entryRuleMod : ruleMod EOF ;
    public final void entryRuleMod() throws RecognitionException {
        try {
            // InternalFPML.g:1329:1: ( ruleMod EOF )
            // InternalFPML.g:1330:1: ruleMod EOF
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
    // InternalFPML.g:1337:1: ruleMod : ( ( rule__Mod__Group__0 ) ) ;
    public final void ruleMod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1341:2: ( ( ( rule__Mod__Group__0 ) ) )
            // InternalFPML.g:1342:2: ( ( rule__Mod__Group__0 ) )
            {
            // InternalFPML.g:1342:2: ( ( rule__Mod__Group__0 ) )
            // InternalFPML.g:1343:3: ( rule__Mod__Group__0 )
            {
             before(grammarAccess.getModAccess().getGroup()); 
            // InternalFPML.g:1344:3: ( rule__Mod__Group__0 )
            // InternalFPML.g:1344:4: rule__Mod__Group__0
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
    // InternalFPML.g:1353:1: entryRuleApplyF : ruleApplyF EOF ;
    public final void entryRuleApplyF() throws RecognitionException {
        try {
            // InternalFPML.g:1354:1: ( ruleApplyF EOF )
            // InternalFPML.g:1355:1: ruleApplyF EOF
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
    // InternalFPML.g:1362:1: ruleApplyF : ( ( rule__ApplyF__Group__0 ) ) ;
    public final void ruleApplyF() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1366:2: ( ( ( rule__ApplyF__Group__0 ) ) )
            // InternalFPML.g:1367:2: ( ( rule__ApplyF__Group__0 ) )
            {
            // InternalFPML.g:1367:2: ( ( rule__ApplyF__Group__0 ) )
            // InternalFPML.g:1368:3: ( rule__ApplyF__Group__0 )
            {
             before(grammarAccess.getApplyFAccess().getGroup()); 
            // InternalFPML.g:1369:3: ( rule__ApplyF__Group__0 )
            // InternalFPML.g:1369:4: rule__ApplyF__Group__0
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
    // InternalFPML.g:1378:1: entryRulePrimitiveEffectFullFunction : rulePrimitiveEffectFullFunction EOF ;
    public final void entryRulePrimitiveEffectFullFunction() throws RecognitionException {
        try {
            // InternalFPML.g:1379:1: ( rulePrimitiveEffectFullFunction EOF )
            // InternalFPML.g:1380:1: rulePrimitiveEffectFullFunction EOF
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
    // InternalFPML.g:1387:1: rulePrimitiveEffectFullFunction : ( ( rule__PrimitiveEffectFullFunction__Alternatives ) ) ;
    public final void rulePrimitiveEffectFullFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1391:2: ( ( ( rule__PrimitiveEffectFullFunction__Alternatives ) ) )
            // InternalFPML.g:1392:2: ( ( rule__PrimitiveEffectFullFunction__Alternatives ) )
            {
            // InternalFPML.g:1392:2: ( ( rule__PrimitiveEffectFullFunction__Alternatives ) )
            // InternalFPML.g:1393:3: ( rule__PrimitiveEffectFullFunction__Alternatives )
            {
             before(grammarAccess.getPrimitiveEffectFullFunctionAccess().getAlternatives()); 
            // InternalFPML.g:1394:3: ( rule__PrimitiveEffectFullFunction__Alternatives )
            // InternalFPML.g:1394:4: rule__PrimitiveEffectFullFunction__Alternatives
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
    // InternalFPML.g:1403:1: entryRulePrimitivePrint : rulePrimitivePrint EOF ;
    public final void entryRulePrimitivePrint() throws RecognitionException {
        try {
            // InternalFPML.g:1404:1: ( rulePrimitivePrint EOF )
            // InternalFPML.g:1405:1: rulePrimitivePrint EOF
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
    // InternalFPML.g:1412:1: rulePrimitivePrint : ( ( rule__PrimitivePrint__Group__0 ) ) ;
    public final void rulePrimitivePrint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1416:2: ( ( ( rule__PrimitivePrint__Group__0 ) ) )
            // InternalFPML.g:1417:2: ( ( rule__PrimitivePrint__Group__0 ) )
            {
            // InternalFPML.g:1417:2: ( ( rule__PrimitivePrint__Group__0 ) )
            // InternalFPML.g:1418:3: ( rule__PrimitivePrint__Group__0 )
            {
             before(grammarAccess.getPrimitivePrintAccess().getGroup()); 
            // InternalFPML.g:1419:3: ( rule__PrimitivePrint__Group__0 )
            // InternalFPML.g:1419:4: rule__PrimitivePrint__Group__0
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
    // InternalFPML.g:1428:1: entryRuleApplyFIO : ruleApplyFIO EOF ;
    public final void entryRuleApplyFIO() throws RecognitionException {
        try {
            // InternalFPML.g:1429:1: ( ruleApplyFIO EOF )
            // InternalFPML.g:1430:1: ruleApplyFIO EOF
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
    // InternalFPML.g:1437:1: ruleApplyFIO : ( ( rule__ApplyFIO__Group__0 ) ) ;
    public final void ruleApplyFIO() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1441:2: ( ( ( rule__ApplyFIO__Group__0 ) ) )
            // InternalFPML.g:1442:2: ( ( rule__ApplyFIO__Group__0 ) )
            {
            // InternalFPML.g:1442:2: ( ( rule__ApplyFIO__Group__0 ) )
            // InternalFPML.g:1443:3: ( rule__ApplyFIO__Group__0 )
            {
             before(grammarAccess.getApplyFIOAccess().getGroup()); 
            // InternalFPML.g:1444:3: ( rule__ApplyFIO__Group__0 )
            // InternalFPML.g:1444:4: rule__ApplyFIO__Group__0
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
    // InternalFPML.g:1452:1: rule__AdtType__Alternatives : ( ( ruleValueType ) | ( ( rule__AdtType__Group_1__0 ) ) );
    public final void rule__AdtType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1456:1: ( ( ruleValueType ) | ( ( rule__AdtType__Group_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=32 && LA1_0<=33)||(LA1_0>=46 && LA1_0<=47)) ) {
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


    // $ANTLR start "rule__Function__Alternatives"
    // InternalFPML.g:1494:1: rule__Function__Alternatives : ( ( ruleEffectFullFunction ) | ( rulePureFunction ) );
    public final void rule__Function__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1498:1: ( ( ruleEffectFullFunction ) | ( rulePureFunction ) )
            int alt3=2;
            switch ( input.LA(1) ) {
            case 23:
                {
                int LA3_1 = input.LA(2);

                if ( ((LA3_1>=32 && LA3_1<=33)||(LA3_1>=46 && LA3_1<=47)) ) {
                    alt3=2;
                }
                else if ( (LA3_1==27) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case 44:
            case 45:
                {
                alt3=1;
                }
                break;
            case 21:
            case 22:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
                {
                alt3=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalFPML.g:1499:2: ( ruleEffectFullFunction )
                    {
                    // InternalFPML.g:1499:2: ( ruleEffectFullFunction )
                    // InternalFPML.g:1500:3: ruleEffectFullFunction
                    {
                     before(grammarAccess.getFunctionAccess().getEffectFullFunctionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEffectFullFunction();

                    state._fsp--;

                     after(grammarAccess.getFunctionAccess().getEffectFullFunctionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFPML.g:1505:2: ( rulePureFunction )
                    {
                    // InternalFPML.g:1505:2: ( rulePureFunction )
                    // InternalFPML.g:1506:3: rulePureFunction
                    {
                     before(grammarAccess.getFunctionAccess().getPureFunctionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePureFunction();

                    state._fsp--;

                     after(grammarAccess.getFunctionAccess().getPureFunctionParserRuleCall_1()); 

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
    // $ANTLR end "rule__Function__Alternatives"


    // $ANTLR start "rule__PureFunction__Alternatives"
    // InternalFPML.g:1515:1: rule__PureFunction__Alternatives : ( ( rulePureFunctionDefinition ) | ( rulePrimitivePureFunction ) );
    public final void rule__PureFunction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1519:1: ( ( rulePureFunctionDefinition ) | ( rulePrimitivePureFunction ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==23) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=21 && LA4_0<=22)||(LA4_0>=39 && LA4_0<=43)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalFPML.g:1520:2: ( rulePureFunctionDefinition )
                    {
                    // InternalFPML.g:1520:2: ( rulePureFunctionDefinition )
                    // InternalFPML.g:1521:3: rulePureFunctionDefinition
                    {
                     before(grammarAccess.getPureFunctionAccess().getPureFunctionDefinitionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePureFunctionDefinition();

                    state._fsp--;

                     after(grammarAccess.getPureFunctionAccess().getPureFunctionDefinitionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFPML.g:1526:2: ( rulePrimitivePureFunction )
                    {
                    // InternalFPML.g:1526:2: ( rulePrimitivePureFunction )
                    // InternalFPML.g:1527:3: rulePrimitivePureFunction
                    {
                     before(grammarAccess.getPureFunctionAccess().getPrimitivePureFunctionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePrimitivePureFunction();

                    state._fsp--;

                     after(grammarAccess.getPureFunctionAccess().getPrimitivePureFunctionParserRuleCall_1()); 

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
    // $ANTLR end "rule__PureFunction__Alternatives"


    // $ANTLR start "rule__EffectFullFunction__Alternatives"
    // InternalFPML.g:1536:1: rule__EffectFullFunction__Alternatives : ( ( ruleEffectFullFunctionDefinition ) | ( rulePrimitiveEffectFullFunction ) );
    public final void rule__EffectFullFunction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1540:1: ( ( ruleEffectFullFunctionDefinition ) | ( rulePrimitiveEffectFullFunction ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=44 && LA5_0<=45)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalFPML.g:1541:2: ( ruleEffectFullFunctionDefinition )
                    {
                    // InternalFPML.g:1541:2: ( ruleEffectFullFunctionDefinition )
                    // InternalFPML.g:1542:3: ruleEffectFullFunctionDefinition
                    {
                     before(grammarAccess.getEffectFullFunctionAccess().getEffectFullFunctionDefinitionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEffectFullFunctionDefinition();

                    state._fsp--;

                     after(grammarAccess.getEffectFullFunctionAccess().getEffectFullFunctionDefinitionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFPML.g:1547:2: ( rulePrimitiveEffectFullFunction )
                    {
                    // InternalFPML.g:1547:2: ( rulePrimitiveEffectFullFunction )
                    // InternalFPML.g:1548:3: rulePrimitiveEffectFullFunction
                    {
                     before(grammarAccess.getEffectFullFunctionAccess().getPrimitiveEffectFullFunctionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePrimitiveEffectFullFunction();

                    state._fsp--;

                     after(grammarAccess.getEffectFullFunctionAccess().getPrimitiveEffectFullFunctionParserRuleCall_1()); 

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
    // $ANTLR end "rule__EffectFullFunction__Alternatives"


    // $ANTLR start "rule__FunctionBodyPure__Alternatives"
    // InternalFPML.g:1557:1: rule__FunctionBodyPure__Alternatives : ( ( ruleEmptyFunctionBody ) | ( ruleCompositionFunctionBodyPure ) );
    public final void rule__FunctionBodyPure__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1561:1: ( ( ruleEmptyFunctionBody ) | ( ruleCompositionFunctionBodyPure ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==29) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID||(LA6_0>=21 && LA6_0<=22)||(LA6_0>=39 && LA6_0<=43)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalFPML.g:1562:2: ( ruleEmptyFunctionBody )
                    {
                    // InternalFPML.g:1562:2: ( ruleEmptyFunctionBody )
                    // InternalFPML.g:1563:3: ruleEmptyFunctionBody
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
                    // InternalFPML.g:1568:2: ( ruleCompositionFunctionBodyPure )
                    {
                    // InternalFPML.g:1568:2: ( ruleCompositionFunctionBodyPure )
                    // InternalFPML.g:1569:3: ruleCompositionFunctionBodyPure
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
    // InternalFPML.g:1578:1: rule__FunctionBodyEffectFull__Alternatives : ( ( ruleEmptyFunctionBody ) | ( ruleCompositionFunctionBodyEffect ) );
    public final void rule__FunctionBodyEffectFull__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1582:1: ( ( ruleEmptyFunctionBody ) | ( ruleCompositionFunctionBodyEffect ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==29) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID||(LA7_0>=21 && LA7_0<=22)||(LA7_0>=39 && LA7_0<=45)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalFPML.g:1583:2: ( ruleEmptyFunctionBody )
                    {
                    // InternalFPML.g:1583:2: ( ruleEmptyFunctionBody )
                    // InternalFPML.g:1584:3: ruleEmptyFunctionBody
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
                    // InternalFPML.g:1589:2: ( ruleCompositionFunctionBodyEffect )
                    {
                    // InternalFPML.g:1589:2: ( ruleCompositionFunctionBodyEffect )
                    // InternalFPML.g:1590:3: ruleCompositionFunctionBodyEffect
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
    // InternalFPML.g:1599:1: rule__CompositionFunctionBodyPure__Alternatives : ( ( ( rule__CompositionFunctionBodyPure__Group_0__0 ) ) | ( ( rule__CompositionFunctionBodyPure__Group_1__0 ) ) );
    public final void rule__CompositionFunctionBodyPure__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1603:1: ( ( ( rule__CompositionFunctionBodyPure__Group_0__0 ) ) | ( ( rule__CompositionFunctionBodyPure__Group_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            else if ( ((LA8_0>=21 && LA8_0<=22)||(LA8_0>=39 && LA8_0<=43)) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalFPML.g:1604:2: ( ( rule__CompositionFunctionBodyPure__Group_0__0 ) )
                    {
                    // InternalFPML.g:1604:2: ( ( rule__CompositionFunctionBodyPure__Group_0__0 ) )
                    // InternalFPML.g:1605:3: ( rule__CompositionFunctionBodyPure__Group_0__0 )
                    {
                     before(grammarAccess.getCompositionFunctionBodyPureAccess().getGroup_0()); 
                    // InternalFPML.g:1606:3: ( rule__CompositionFunctionBodyPure__Group_0__0 )
                    // InternalFPML.g:1606:4: rule__CompositionFunctionBodyPure__Group_0__0
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
                    // InternalFPML.g:1610:2: ( ( rule__CompositionFunctionBodyPure__Group_1__0 ) )
                    {
                    // InternalFPML.g:1610:2: ( ( rule__CompositionFunctionBodyPure__Group_1__0 ) )
                    // InternalFPML.g:1611:3: ( rule__CompositionFunctionBodyPure__Group_1__0 )
                    {
                     before(grammarAccess.getCompositionFunctionBodyPureAccess().getGroup_1()); 
                    // InternalFPML.g:1612:3: ( rule__CompositionFunctionBodyPure__Group_1__0 )
                    // InternalFPML.g:1612:4: rule__CompositionFunctionBodyPure__Group_1__0
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
    // InternalFPML.g:1620:1: rule__CompositionFunctionBodyPureFactor__Alternatives : ( ( ( rule__CompositionFunctionBodyPureFactor__Group_0__0 ) ) | ( ( rule__CompositionFunctionBodyPureFactor__Group_1__0 ) ) );
    public final void rule__CompositionFunctionBodyPureFactor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1624:1: ( ( ( rule__CompositionFunctionBodyPureFactor__Group_0__0 ) ) | ( ( rule__CompositionFunctionBodyPureFactor__Group_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==30) ) {
                int LA9_1 = input.LA(2);

                if ( ((LA9_1>=21 && LA9_1<=22)||(LA9_1>=39 && LA9_1<=43)) ) {
                    alt9=2;
                }
                else if ( (LA9_1==RULE_ID) ) {
                    alt9=1;
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
                    // InternalFPML.g:1625:2: ( ( rule__CompositionFunctionBodyPureFactor__Group_0__0 ) )
                    {
                    // InternalFPML.g:1625:2: ( ( rule__CompositionFunctionBodyPureFactor__Group_0__0 ) )
                    // InternalFPML.g:1626:3: ( rule__CompositionFunctionBodyPureFactor__Group_0__0 )
                    {
                     before(grammarAccess.getCompositionFunctionBodyPureFactorAccess().getGroup_0()); 
                    // InternalFPML.g:1627:3: ( rule__CompositionFunctionBodyPureFactor__Group_0__0 )
                    // InternalFPML.g:1627:4: rule__CompositionFunctionBodyPureFactor__Group_0__0
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
                    // InternalFPML.g:1631:2: ( ( rule__CompositionFunctionBodyPureFactor__Group_1__0 ) )
                    {
                    // InternalFPML.g:1631:2: ( ( rule__CompositionFunctionBodyPureFactor__Group_1__0 ) )
                    // InternalFPML.g:1632:3: ( rule__CompositionFunctionBodyPureFactor__Group_1__0 )
                    {
                     before(grammarAccess.getCompositionFunctionBodyPureFactorAccess().getGroup_1()); 
                    // InternalFPML.g:1633:3: ( rule__CompositionFunctionBodyPureFactor__Group_1__0 )
                    // InternalFPML.g:1633:4: rule__CompositionFunctionBodyPureFactor__Group_1__0
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
    // InternalFPML.g:1641:1: rule__CompositionFunctionBodyEffect__Alternatives : ( ( ( rule__CompositionFunctionBodyEffect__Group_0__0 ) ) | ( ( rule__CompositionFunctionBodyEffect__Group_1__0 ) ) );
    public final void rule__CompositionFunctionBodyEffect__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1645:1: ( ( ( rule__CompositionFunctionBodyEffect__Group_0__0 ) ) | ( ( rule__CompositionFunctionBodyEffect__Group_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=21 && LA10_0<=22)||(LA10_0>=39 && LA10_0<=45)) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalFPML.g:1646:2: ( ( rule__CompositionFunctionBodyEffect__Group_0__0 ) )
                    {
                    // InternalFPML.g:1646:2: ( ( rule__CompositionFunctionBodyEffect__Group_0__0 ) )
                    // InternalFPML.g:1647:3: ( rule__CompositionFunctionBodyEffect__Group_0__0 )
                    {
                     before(grammarAccess.getCompositionFunctionBodyEffectAccess().getGroup_0()); 
                    // InternalFPML.g:1648:3: ( rule__CompositionFunctionBodyEffect__Group_0__0 )
                    // InternalFPML.g:1648:4: rule__CompositionFunctionBodyEffect__Group_0__0
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
                    // InternalFPML.g:1652:2: ( ( rule__CompositionFunctionBodyEffect__Group_1__0 ) )
                    {
                    // InternalFPML.g:1652:2: ( ( rule__CompositionFunctionBodyEffect__Group_1__0 ) )
                    // InternalFPML.g:1653:3: ( rule__CompositionFunctionBodyEffect__Group_1__0 )
                    {
                     before(grammarAccess.getCompositionFunctionBodyEffectAccess().getGroup_1()); 
                    // InternalFPML.g:1654:3: ( rule__CompositionFunctionBodyEffect__Group_1__0 )
                    // InternalFPML.g:1654:4: rule__CompositionFunctionBodyEffect__Group_1__0
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
    // InternalFPML.g:1662:1: rule__CompositionFunctionBodyEffect__PrimitiveElementAlternatives_1_0_0 : ( ( rulePrimitiveEffectFullFunction ) | ( rulePrimitivePureFunction ) );
    public final void rule__CompositionFunctionBodyEffect__PrimitiveElementAlternatives_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1666:1: ( ( rulePrimitiveEffectFullFunction ) | ( rulePrimitivePureFunction ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=44 && LA11_0<=45)) ) {
                alt11=1;
            }
            else if ( ((LA11_0>=21 && LA11_0<=22)||(LA11_0>=39 && LA11_0<=43)) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalFPML.g:1667:2: ( rulePrimitiveEffectFullFunction )
                    {
                    // InternalFPML.g:1667:2: ( rulePrimitiveEffectFullFunction )
                    // InternalFPML.g:1668:3: rulePrimitiveEffectFullFunction
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
                    // InternalFPML.g:1673:2: ( rulePrimitivePureFunction )
                    {
                    // InternalFPML.g:1673:2: ( rulePrimitivePureFunction )
                    // InternalFPML.g:1674:3: rulePrimitivePureFunction
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
    // InternalFPML.g:1683:1: rule__CompositionFunctionBodyEffectFullFactor__Alternatives : ( ( ( rule__CompositionFunctionBodyEffectFullFactor__Group_0__0 ) ) | ( ( rule__CompositionFunctionBodyEffectFullFactor__Group_1__0 ) ) );
    public final void rule__CompositionFunctionBodyEffectFullFactor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1687:1: ( ( ( rule__CompositionFunctionBodyEffectFullFactor__Group_0__0 ) ) | ( ( rule__CompositionFunctionBodyEffectFullFactor__Group_1__0 ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==31) ) {
                int LA12_1 = input.LA(2);

                if ( ((LA12_1>=21 && LA12_1<=22)||(LA12_1>=39 && LA12_1<=45)) ) {
                    alt12=2;
                }
                else if ( (LA12_1==RULE_ID) ) {
                    alt12=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalFPML.g:1688:2: ( ( rule__CompositionFunctionBodyEffectFullFactor__Group_0__0 ) )
                    {
                    // InternalFPML.g:1688:2: ( ( rule__CompositionFunctionBodyEffectFullFactor__Group_0__0 ) )
                    // InternalFPML.g:1689:3: ( rule__CompositionFunctionBodyEffectFullFactor__Group_0__0 )
                    {
                     before(grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getGroup_0()); 
                    // InternalFPML.g:1690:3: ( rule__CompositionFunctionBodyEffectFullFactor__Group_0__0 )
                    // InternalFPML.g:1690:4: rule__CompositionFunctionBodyEffectFullFactor__Group_0__0
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
                    // InternalFPML.g:1694:2: ( ( rule__CompositionFunctionBodyEffectFullFactor__Group_1__0 ) )
                    {
                    // InternalFPML.g:1694:2: ( ( rule__CompositionFunctionBodyEffectFullFactor__Group_1__0 ) )
                    // InternalFPML.g:1695:3: ( rule__CompositionFunctionBodyEffectFullFactor__Group_1__0 )
                    {
                     before(grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getGroup_1()); 
                    // InternalFPML.g:1696:3: ( rule__CompositionFunctionBodyEffectFullFactor__Group_1__0 )
                    // InternalFPML.g:1696:4: rule__CompositionFunctionBodyEffectFullFactor__Group_1__0
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
    // InternalFPML.g:1704:1: rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAlternatives_1_1_0 : ( ( rulePrimitiveEffectFullFunction ) | ( rulePrimitivePureFunction ) );
    public final void rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1708:1: ( ( rulePrimitiveEffectFullFunction ) | ( rulePrimitivePureFunction ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=44 && LA13_0<=45)) ) {
                alt13=1;
            }
            else if ( ((LA13_0>=21 && LA13_0<=22)||(LA13_0>=39 && LA13_0<=43)) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalFPML.g:1709:2: ( rulePrimitiveEffectFullFunction )
                    {
                    // InternalFPML.g:1709:2: ( rulePrimitiveEffectFullFunction )
                    // InternalFPML.g:1710:3: rulePrimitiveEffectFullFunction
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
                    // InternalFPML.g:1715:2: ( rulePrimitivePureFunction )
                    {
                    // InternalFPML.g:1715:2: ( rulePrimitivePureFunction )
                    // InternalFPML.g:1716:3: rulePrimitivePureFunction
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
    // InternalFPML.g:1725:1: rule__ValueType__Alternatives : ( ( ruleIntegerType ) | ( ruleStringType ) | ( ruleDataType ) | ( rulePureFunctionType ) );
    public final void rule__ValueType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1729:1: ( ( ruleIntegerType ) | ( ruleStringType ) | ( ruleDataType ) | ( rulePureFunctionType ) )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt14=1;
                }
                break;
            case 47:
                {
                alt14=2;
                }
                break;
            case 32:
                {
                alt14=3;
                }
                break;
            case 33:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalFPML.g:1730:2: ( ruleIntegerType )
                    {
                    // InternalFPML.g:1730:2: ( ruleIntegerType )
                    // InternalFPML.g:1731:3: ruleIntegerType
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
                    // InternalFPML.g:1736:2: ( ruleStringType )
                    {
                    // InternalFPML.g:1736:2: ( ruleStringType )
                    // InternalFPML.g:1737:3: ruleStringType
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
                    // InternalFPML.g:1742:2: ( ruleDataType )
                    {
                    // InternalFPML.g:1742:2: ( ruleDataType )
                    // InternalFPML.g:1743:3: ruleDataType
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
                    // InternalFPML.g:1748:2: ( rulePureFunctionType )
                    {
                    // InternalFPML.g:1748:2: ( rulePureFunctionType )
                    // InternalFPML.g:1749:3: rulePureFunctionType
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
    // InternalFPML.g:1758:1: rule__Type__Alternatives : ( ( ruleValueType ) | ( ruleUnitType ) | ( ruleEffectFullFunctionType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1762:1: ( ( ruleValueType ) | ( ruleUnitType ) | ( ruleEffectFullFunctionType ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 32:
            case 33:
            case 46:
            case 47:
                {
                alt15=1;
                }
                break;
            case 48:
                {
                alt15=2;
                }
                break;
            case 36:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalFPML.g:1763:2: ( ruleValueType )
                    {
                    // InternalFPML.g:1763:2: ( ruleValueType )
                    // InternalFPML.g:1764:3: ruleValueType
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
                    // InternalFPML.g:1769:2: ( ruleUnitType )
                    {
                    // InternalFPML.g:1769:2: ( ruleUnitType )
                    // InternalFPML.g:1770:3: ruleUnitType
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
                    // InternalFPML.g:1775:2: ( ruleEffectFullFunctionType )
                    {
                    // InternalFPML.g:1775:2: ( ruleEffectFullFunctionType )
                    // InternalFPML.g:1776:3: ruleEffectFullFunctionType
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
    // InternalFPML.g:1785:1: rule__Expression__Alternatives : ( ( ruleIntValue ) | ( ruleStringValue ) | ( ruleDataValue ) | ( ruleFunctionValue ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1789:1: ( ( ruleIntValue ) | ( ruleStringValue ) | ( ruleDataValue ) | ( ruleFunctionValue ) )
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
                    // InternalFPML.g:1790:2: ( ruleIntValue )
                    {
                    // InternalFPML.g:1790:2: ( ruleIntValue )
                    // InternalFPML.g:1791:3: ruleIntValue
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
                    // InternalFPML.g:1796:2: ( ruleStringValue )
                    {
                    // InternalFPML.g:1796:2: ( ruleStringValue )
                    // InternalFPML.g:1797:3: ruleStringValue
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
                    // InternalFPML.g:1802:2: ( ruleDataValue )
                    {
                    // InternalFPML.g:1802:2: ( ruleDataValue )
                    // InternalFPML.g:1803:3: ruleDataValue
                    {
                     before(grammarAccess.getExpressionAccess().getDataValueParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDataValue();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getDataValueParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalFPML.g:1808:2: ( ruleFunctionValue )
                    {
                    // InternalFPML.g:1808:2: ( ruleFunctionValue )
                    // InternalFPML.g:1809:3: ruleFunctionValue
                    {
                     before(grammarAccess.getExpressionAccess().getFunctionValueParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleFunctionValue();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getFunctionValueParserRuleCall_3()); 

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
    // InternalFPML.g:1818:1: rule__AdtValue__Alternatives : ( ( ruleIntValue ) | ( ruleStringValue ) | ( ruleValueRef ) | ( ruleDataValue ) | ( ruleSumValue ) | ( ruleFunctionValue ) | ( ruleProdValue ) );
    public final void rule__AdtValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1822:1: ( ( ruleIntValue ) | ( ruleStringValue ) | ( ruleValueRef ) | ( ruleDataValue ) | ( ruleSumValue ) | ( ruleFunctionValue ) | ( ruleProdValue ) )
            int alt17=7;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // InternalFPML.g:1823:2: ( ruleIntValue )
                    {
                    // InternalFPML.g:1823:2: ( ruleIntValue )
                    // InternalFPML.g:1824:3: ruleIntValue
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
                    // InternalFPML.g:1829:2: ( ruleStringValue )
                    {
                    // InternalFPML.g:1829:2: ( ruleStringValue )
                    // InternalFPML.g:1830:3: ruleStringValue
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
                    // InternalFPML.g:1835:2: ( ruleValueRef )
                    {
                    // InternalFPML.g:1835:2: ( ruleValueRef )
                    // InternalFPML.g:1836:3: ruleValueRef
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
                    // InternalFPML.g:1841:2: ( ruleDataValue )
                    {
                    // InternalFPML.g:1841:2: ( ruleDataValue )
                    // InternalFPML.g:1842:3: ruleDataValue
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
                    // InternalFPML.g:1847:2: ( ruleSumValue )
                    {
                    // InternalFPML.g:1847:2: ( ruleSumValue )
                    // InternalFPML.g:1848:3: ruleSumValue
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
                    // InternalFPML.g:1853:2: ( ruleFunctionValue )
                    {
                    // InternalFPML.g:1853:2: ( ruleFunctionValue )
                    // InternalFPML.g:1854:3: ruleFunctionValue
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
                    // InternalFPML.g:1859:2: ( ruleProdValue )
                    {
                    // InternalFPML.g:1859:2: ( ruleProdValue )
                    // InternalFPML.g:1860:3: ruleProdValue
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
    // InternalFPML.g:1869:1: rule__SumValue__Alternatives : ( ( ( rule__SumValue__Group_0__0 ) ) | ( ( rule__SumValue__Group_1__0 ) ) );
    public final void rule__SumValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1873:1: ( ( ( rule__SumValue__Group_0__0 ) ) | ( ( rule__SumValue__Group_1__0 ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==37) ) {
                alt18=1;
            }
            else if ( (LA18_0==38) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalFPML.g:1874:2: ( ( rule__SumValue__Group_0__0 ) )
                    {
                    // InternalFPML.g:1874:2: ( ( rule__SumValue__Group_0__0 ) )
                    // InternalFPML.g:1875:3: ( rule__SumValue__Group_0__0 )
                    {
                     before(grammarAccess.getSumValueAccess().getGroup_0()); 
                    // InternalFPML.g:1876:3: ( rule__SumValue__Group_0__0 )
                    // InternalFPML.g:1876:4: rule__SumValue__Group_0__0
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
                    // InternalFPML.g:1880:2: ( ( rule__SumValue__Group_1__0 ) )
                    {
                    // InternalFPML.g:1880:2: ( ( rule__SumValue__Group_1__0 ) )
                    // InternalFPML.g:1881:3: ( rule__SumValue__Group_1__0 )
                    {
                     before(grammarAccess.getSumValueAccess().getGroup_1()); 
                    // InternalFPML.g:1882:3: ( rule__SumValue__Group_1__0 )
                    // InternalFPML.g:1882:4: rule__SumValue__Group_1__0
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
    // InternalFPML.g:1890:1: rule__PrimitivePureFunction__Alternatives : ( ( ruleIntToString ) | ( ruleIntPow ) | ( rulePlus ) | ( ruleMinus ) | ( ruleTimes ) | ( ruleMod ) | ( ruleApplyF ) );
    public final void rule__PrimitivePureFunction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1894:1: ( ( ruleIntToString ) | ( ruleIntPow ) | ( rulePlus ) | ( ruleMinus ) | ( ruleTimes ) | ( ruleMod ) | ( ruleApplyF ) )
            int alt19=7;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt19=1;
                }
                break;
            case 40:
                {
                alt19=2;
                }
                break;
            case 21:
                {
                alt19=3;
                }
                break;
            case 41:
                {
                alt19=4;
                }
                break;
            case 22:
                {
                alt19=5;
                }
                break;
            case 42:
                {
                alt19=6;
                }
                break;
            case 43:
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
                    // InternalFPML.g:1895:2: ( ruleIntToString )
                    {
                    // InternalFPML.g:1895:2: ( ruleIntToString )
                    // InternalFPML.g:1896:3: ruleIntToString
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
                    // InternalFPML.g:1901:2: ( ruleIntPow )
                    {
                    // InternalFPML.g:1901:2: ( ruleIntPow )
                    // InternalFPML.g:1902:3: ruleIntPow
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
                    // InternalFPML.g:1907:2: ( rulePlus )
                    {
                    // InternalFPML.g:1907:2: ( rulePlus )
                    // InternalFPML.g:1908:3: rulePlus
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
                    // InternalFPML.g:1913:2: ( ruleMinus )
                    {
                    // InternalFPML.g:1913:2: ( ruleMinus )
                    // InternalFPML.g:1914:3: ruleMinus
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
                    // InternalFPML.g:1919:2: ( ruleTimes )
                    {
                    // InternalFPML.g:1919:2: ( ruleTimes )
                    // InternalFPML.g:1920:3: ruleTimes
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
                    // InternalFPML.g:1925:2: ( ruleMod )
                    {
                    // InternalFPML.g:1925:2: ( ruleMod )
                    // InternalFPML.g:1926:3: ruleMod
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
                    // InternalFPML.g:1931:2: ( ruleApplyF )
                    {
                    // InternalFPML.g:1931:2: ( ruleApplyF )
                    // InternalFPML.g:1932:3: ruleApplyF
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
    // InternalFPML.g:1941:1: rule__PrimitiveEffectFullFunction__Alternatives : ( ( rulePrimitivePrint ) | ( ruleApplyFIO ) );
    public final void rule__PrimitiveEffectFullFunction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1945:1: ( ( rulePrimitivePrint ) | ( ruleApplyFIO ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==44) ) {
                alt20=1;
            }
            else if ( (LA20_0==45) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalFPML.g:1946:2: ( rulePrimitivePrint )
                    {
                    // InternalFPML.g:1946:2: ( rulePrimitivePrint )
                    // InternalFPML.g:1947:3: rulePrimitivePrint
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
                    // InternalFPML.g:1952:2: ( ruleApplyFIO )
                    {
                    // InternalFPML.g:1952:2: ( ruleApplyFIO )
                    // InternalFPML.g:1953:3: ruleApplyFIO
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
    // InternalFPML.g:1962:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1966:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalFPML.g:1967:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalFPML.g:1974:1: rule__Model__Group__0__Impl : ( ( rule__Model__ElementsAssignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1978:1: ( ( ( rule__Model__ElementsAssignment_0 ) ) )
            // InternalFPML.g:1979:1: ( ( rule__Model__ElementsAssignment_0 ) )
            {
            // InternalFPML.g:1979:1: ( ( rule__Model__ElementsAssignment_0 ) )
            // InternalFPML.g:1980:2: ( rule__Model__ElementsAssignment_0 )
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_0()); 
            // InternalFPML.g:1981:2: ( rule__Model__ElementsAssignment_0 )
            // InternalFPML.g:1981:3: rule__Model__ElementsAssignment_0
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
    // InternalFPML.g:1989:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:1993:1: ( rule__Model__Group__1__Impl )
            // InternalFPML.g:1994:2: rule__Model__Group__1__Impl
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
    // InternalFPML.g:2000:1: rule__Model__Group__1__Impl : ( ( rule__Model__ElementsAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2004:1: ( ( ( rule__Model__ElementsAssignment_1 ) ) )
            // InternalFPML.g:2005:1: ( ( rule__Model__ElementsAssignment_1 ) )
            {
            // InternalFPML.g:2005:1: ( ( rule__Model__ElementsAssignment_1 ) )
            // InternalFPML.g:2006:2: ( rule__Model__ElementsAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_1()); 
            // InternalFPML.g:2007:2: ( rule__Model__ElementsAssignment_1 )
            // InternalFPML.g:2007:3: rule__Model__ElementsAssignment_1
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
    // InternalFPML.g:2016:1: rule__PureBlock__Group__0 : rule__PureBlock__Group__0__Impl rule__PureBlock__Group__1 ;
    public final void rule__PureBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2020:1: ( rule__PureBlock__Group__0__Impl rule__PureBlock__Group__1 )
            // InternalFPML.g:2021:2: rule__PureBlock__Group__0__Impl rule__PureBlock__Group__1
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
    // InternalFPML.g:2028:1: rule__PureBlock__Group__0__Impl : ( 'Pure' ) ;
    public final void rule__PureBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2032:1: ( ( 'Pure' ) )
            // InternalFPML.g:2033:1: ( 'Pure' )
            {
            // InternalFPML.g:2033:1: ( 'Pure' )
            // InternalFPML.g:2034:2: 'Pure'
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
    // InternalFPML.g:2043:1: rule__PureBlock__Group__1 : rule__PureBlock__Group__1__Impl rule__PureBlock__Group__2 ;
    public final void rule__PureBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2047:1: ( rule__PureBlock__Group__1__Impl rule__PureBlock__Group__2 )
            // InternalFPML.g:2048:2: rule__PureBlock__Group__1__Impl rule__PureBlock__Group__2
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
    // InternalFPML.g:2055:1: rule__PureBlock__Group__1__Impl : ( '{' ) ;
    public final void rule__PureBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2059:1: ( ( '{' ) )
            // InternalFPML.g:2060:1: ( '{' )
            {
            // InternalFPML.g:2060:1: ( '{' )
            // InternalFPML.g:2061:2: '{'
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
    // InternalFPML.g:2070:1: rule__PureBlock__Group__2 : rule__PureBlock__Group__2__Impl rule__PureBlock__Group__3 ;
    public final void rule__PureBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2074:1: ( rule__PureBlock__Group__2__Impl rule__PureBlock__Group__3 )
            // InternalFPML.g:2075:2: rule__PureBlock__Group__2__Impl rule__PureBlock__Group__3
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
    // InternalFPML.g:2082:1: rule__PureBlock__Group__2__Impl : ( ( rule__PureBlock__ElementsAssignment_2 ) ) ;
    public final void rule__PureBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2086:1: ( ( ( rule__PureBlock__ElementsAssignment_2 ) ) )
            // InternalFPML.g:2087:1: ( ( rule__PureBlock__ElementsAssignment_2 ) )
            {
            // InternalFPML.g:2087:1: ( ( rule__PureBlock__ElementsAssignment_2 ) )
            // InternalFPML.g:2088:2: ( rule__PureBlock__ElementsAssignment_2 )
            {
             before(grammarAccess.getPureBlockAccess().getElementsAssignment_2()); 
            // InternalFPML.g:2089:2: ( rule__PureBlock__ElementsAssignment_2 )
            // InternalFPML.g:2089:3: rule__PureBlock__ElementsAssignment_2
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
    // InternalFPML.g:2097:1: rule__PureBlock__Group__3 : rule__PureBlock__Group__3__Impl rule__PureBlock__Group__4 ;
    public final void rule__PureBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2101:1: ( rule__PureBlock__Group__3__Impl rule__PureBlock__Group__4 )
            // InternalFPML.g:2102:2: rule__PureBlock__Group__3__Impl rule__PureBlock__Group__4
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
    // InternalFPML.g:2109:1: rule__PureBlock__Group__3__Impl : ( ( rule__PureBlock__ElementsAssignment_3 ) ) ;
    public final void rule__PureBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2113:1: ( ( ( rule__PureBlock__ElementsAssignment_3 ) ) )
            // InternalFPML.g:2114:1: ( ( rule__PureBlock__ElementsAssignment_3 ) )
            {
            // InternalFPML.g:2114:1: ( ( rule__PureBlock__ElementsAssignment_3 ) )
            // InternalFPML.g:2115:2: ( rule__PureBlock__ElementsAssignment_3 )
            {
             before(grammarAccess.getPureBlockAccess().getElementsAssignment_3()); 
            // InternalFPML.g:2116:2: ( rule__PureBlock__ElementsAssignment_3 )
            // InternalFPML.g:2116:3: rule__PureBlock__ElementsAssignment_3
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
    // InternalFPML.g:2124:1: rule__PureBlock__Group__4 : rule__PureBlock__Group__4__Impl ;
    public final void rule__PureBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2128:1: ( rule__PureBlock__Group__4__Impl )
            // InternalFPML.g:2129:2: rule__PureBlock__Group__4__Impl
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
    // InternalFPML.g:2135:1: rule__PureBlock__Group__4__Impl : ( '}' ) ;
    public final void rule__PureBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2139:1: ( ( '}' ) )
            // InternalFPML.g:2140:1: ( '}' )
            {
            // InternalFPML.g:2140:1: ( '}' )
            // InternalFPML.g:2141:2: '}'
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
    // InternalFPML.g:2151:1: rule__PureFunctionBlock__Group__0 : rule__PureFunctionBlock__Group__0__Impl rule__PureFunctionBlock__Group__1 ;
    public final void rule__PureFunctionBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2155:1: ( rule__PureFunctionBlock__Group__0__Impl rule__PureFunctionBlock__Group__1 )
            // InternalFPML.g:2156:2: rule__PureFunctionBlock__Group__0__Impl rule__PureFunctionBlock__Group__1
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
    // InternalFPML.g:2163:1: rule__PureFunctionBlock__Group__0__Impl : ( 'Functions' ) ;
    public final void rule__PureFunctionBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2167:1: ( ( 'Functions' ) )
            // InternalFPML.g:2168:1: ( 'Functions' )
            {
            // InternalFPML.g:2168:1: ( 'Functions' )
            // InternalFPML.g:2169:2: 'Functions'
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
    // InternalFPML.g:2178:1: rule__PureFunctionBlock__Group__1 : rule__PureFunctionBlock__Group__1__Impl rule__PureFunctionBlock__Group__2 ;
    public final void rule__PureFunctionBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2182:1: ( rule__PureFunctionBlock__Group__1__Impl rule__PureFunctionBlock__Group__2 )
            // InternalFPML.g:2183:2: rule__PureFunctionBlock__Group__1__Impl rule__PureFunctionBlock__Group__2
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
    // InternalFPML.g:2190:1: rule__PureFunctionBlock__Group__1__Impl : ( '{' ) ;
    public final void rule__PureFunctionBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2194:1: ( ( '{' ) )
            // InternalFPML.g:2195:1: ( '{' )
            {
            // InternalFPML.g:2195:1: ( '{' )
            // InternalFPML.g:2196:2: '{'
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
    // InternalFPML.g:2205:1: rule__PureFunctionBlock__Group__2 : rule__PureFunctionBlock__Group__2__Impl rule__PureFunctionBlock__Group__3 ;
    public final void rule__PureFunctionBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2209:1: ( rule__PureFunctionBlock__Group__2__Impl rule__PureFunctionBlock__Group__3 )
            // InternalFPML.g:2210:2: rule__PureFunctionBlock__Group__2__Impl rule__PureFunctionBlock__Group__3
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
    // InternalFPML.g:2217:1: rule__PureFunctionBlock__Group__2__Impl : ( ( rule__PureFunctionBlock__FeaturesAssignment_2 )* ) ;
    public final void rule__PureFunctionBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2221:1: ( ( ( rule__PureFunctionBlock__FeaturesAssignment_2 )* ) )
            // InternalFPML.g:2222:1: ( ( rule__PureFunctionBlock__FeaturesAssignment_2 )* )
            {
            // InternalFPML.g:2222:1: ( ( rule__PureFunctionBlock__FeaturesAssignment_2 )* )
            // InternalFPML.g:2223:2: ( rule__PureFunctionBlock__FeaturesAssignment_2 )*
            {
             before(grammarAccess.getPureFunctionBlockAccess().getFeaturesAssignment_2()); 
            // InternalFPML.g:2224:2: ( rule__PureFunctionBlock__FeaturesAssignment_2 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==23) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalFPML.g:2224:3: rule__PureFunctionBlock__FeaturesAssignment_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__PureFunctionBlock__FeaturesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalFPML.g:2232:1: rule__PureFunctionBlock__Group__3 : rule__PureFunctionBlock__Group__3__Impl ;
    public final void rule__PureFunctionBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2236:1: ( rule__PureFunctionBlock__Group__3__Impl )
            // InternalFPML.g:2237:2: rule__PureFunctionBlock__Group__3__Impl
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
    // InternalFPML.g:2243:1: rule__PureFunctionBlock__Group__3__Impl : ( '}' ) ;
    public final void rule__PureFunctionBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2247:1: ( ( '}' ) )
            // InternalFPML.g:2248:1: ( '}' )
            {
            // InternalFPML.g:2248:1: ( '}' )
            // InternalFPML.g:2249:2: '}'
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
    // InternalFPML.g:2259:1: rule__DataBlock__Group__0 : rule__DataBlock__Group__0__Impl rule__DataBlock__Group__1 ;
    public final void rule__DataBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2263:1: ( rule__DataBlock__Group__0__Impl rule__DataBlock__Group__1 )
            // InternalFPML.g:2264:2: rule__DataBlock__Group__0__Impl rule__DataBlock__Group__1
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
    // InternalFPML.g:2271:1: rule__DataBlock__Group__0__Impl : ( 'Data' ) ;
    public final void rule__DataBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2275:1: ( ( 'Data' ) )
            // InternalFPML.g:2276:1: ( 'Data' )
            {
            // InternalFPML.g:2276:1: ( 'Data' )
            // InternalFPML.g:2277:2: 'Data'
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
    // InternalFPML.g:2286:1: rule__DataBlock__Group__1 : rule__DataBlock__Group__1__Impl rule__DataBlock__Group__2 ;
    public final void rule__DataBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2290:1: ( rule__DataBlock__Group__1__Impl rule__DataBlock__Group__2 )
            // InternalFPML.g:2291:2: rule__DataBlock__Group__1__Impl rule__DataBlock__Group__2
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
    // InternalFPML.g:2298:1: rule__DataBlock__Group__1__Impl : ( '{' ) ;
    public final void rule__DataBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2302:1: ( ( '{' ) )
            // InternalFPML.g:2303:1: ( '{' )
            {
            // InternalFPML.g:2303:1: ( '{' )
            // InternalFPML.g:2304:2: '{'
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
    // InternalFPML.g:2313:1: rule__DataBlock__Group__2 : rule__DataBlock__Group__2__Impl rule__DataBlock__Group__3 ;
    public final void rule__DataBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2317:1: ( rule__DataBlock__Group__2__Impl rule__DataBlock__Group__3 )
            // InternalFPML.g:2318:2: rule__DataBlock__Group__2__Impl rule__DataBlock__Group__3
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
    // InternalFPML.g:2325:1: rule__DataBlock__Group__2__Impl : ( ( rule__DataBlock__ElementsAssignment_2 )* ) ;
    public final void rule__DataBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2329:1: ( ( ( rule__DataBlock__ElementsAssignment_2 )* ) )
            // InternalFPML.g:2330:1: ( ( rule__DataBlock__ElementsAssignment_2 )* )
            {
            // InternalFPML.g:2330:1: ( ( rule__DataBlock__ElementsAssignment_2 )* )
            // InternalFPML.g:2331:2: ( rule__DataBlock__ElementsAssignment_2 )*
            {
             before(grammarAccess.getDataBlockAccess().getElementsAssignment_2()); 
            // InternalFPML.g:2332:2: ( rule__DataBlock__ElementsAssignment_2 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalFPML.g:2332:3: rule__DataBlock__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__DataBlock__ElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalFPML.g:2340:1: rule__DataBlock__Group__3 : rule__DataBlock__Group__3__Impl rule__DataBlock__Group__4 ;
    public final void rule__DataBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2344:1: ( rule__DataBlock__Group__3__Impl rule__DataBlock__Group__4 )
            // InternalFPML.g:2345:2: rule__DataBlock__Group__3__Impl rule__DataBlock__Group__4
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
    // InternalFPML.g:2352:1: rule__DataBlock__Group__3__Impl : ( ( rule__DataBlock__ValueAssignment_3 ) ) ;
    public final void rule__DataBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2356:1: ( ( ( rule__DataBlock__ValueAssignment_3 ) ) )
            // InternalFPML.g:2357:1: ( ( rule__DataBlock__ValueAssignment_3 ) )
            {
            // InternalFPML.g:2357:1: ( ( rule__DataBlock__ValueAssignment_3 ) )
            // InternalFPML.g:2358:2: ( rule__DataBlock__ValueAssignment_3 )
            {
             before(grammarAccess.getDataBlockAccess().getValueAssignment_3()); 
            // InternalFPML.g:2359:2: ( rule__DataBlock__ValueAssignment_3 )
            // InternalFPML.g:2359:3: rule__DataBlock__ValueAssignment_3
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
    // InternalFPML.g:2367:1: rule__DataBlock__Group__4 : rule__DataBlock__Group__4__Impl ;
    public final void rule__DataBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2371:1: ( rule__DataBlock__Group__4__Impl )
            // InternalFPML.g:2372:2: rule__DataBlock__Group__4__Impl
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
    // InternalFPML.g:2378:1: rule__DataBlock__Group__4__Impl : ( '}' ) ;
    public final void rule__DataBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2382:1: ( ( '}' ) )
            // InternalFPML.g:2383:1: ( '}' )
            {
            // InternalFPML.g:2383:1: ( '}' )
            // InternalFPML.g:2384:2: '}'
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
    // InternalFPML.g:2394:1: rule__ValueBlock__Group__0 : rule__ValueBlock__Group__0__Impl rule__ValueBlock__Group__1 ;
    public final void rule__ValueBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2398:1: ( rule__ValueBlock__Group__0__Impl rule__ValueBlock__Group__1 )
            // InternalFPML.g:2399:2: rule__ValueBlock__Group__0__Impl rule__ValueBlock__Group__1
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
    // InternalFPML.g:2406:1: rule__ValueBlock__Group__0__Impl : ( 'Value' ) ;
    public final void rule__ValueBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2410:1: ( ( 'Value' ) )
            // InternalFPML.g:2411:1: ( 'Value' )
            {
            // InternalFPML.g:2411:1: ( 'Value' )
            // InternalFPML.g:2412:2: 'Value'
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
    // InternalFPML.g:2421:1: rule__ValueBlock__Group__1 : rule__ValueBlock__Group__1__Impl rule__ValueBlock__Group__2 ;
    public final void rule__ValueBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2425:1: ( rule__ValueBlock__Group__1__Impl rule__ValueBlock__Group__2 )
            // InternalFPML.g:2426:2: rule__ValueBlock__Group__1__Impl rule__ValueBlock__Group__2
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
    // InternalFPML.g:2433:1: rule__ValueBlock__Group__1__Impl : ( '{' ) ;
    public final void rule__ValueBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2437:1: ( ( '{' ) )
            // InternalFPML.g:2438:1: ( '{' )
            {
            // InternalFPML.g:2438:1: ( '{' )
            // InternalFPML.g:2439:2: '{'
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
    // InternalFPML.g:2448:1: rule__ValueBlock__Group__2 : rule__ValueBlock__Group__2__Impl rule__ValueBlock__Group__3 ;
    public final void rule__ValueBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2452:1: ( rule__ValueBlock__Group__2__Impl rule__ValueBlock__Group__3 )
            // InternalFPML.g:2453:2: rule__ValueBlock__Group__2__Impl rule__ValueBlock__Group__3
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
    // InternalFPML.g:2460:1: rule__ValueBlock__Group__2__Impl : ( ( rule__ValueBlock__ElementsAssignment_2 )* ) ;
    public final void rule__ValueBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2464:1: ( ( ( rule__ValueBlock__ElementsAssignment_2 )* ) )
            // InternalFPML.g:2465:1: ( ( rule__ValueBlock__ElementsAssignment_2 )* )
            {
            // InternalFPML.g:2465:1: ( ( rule__ValueBlock__ElementsAssignment_2 )* )
            // InternalFPML.g:2466:2: ( rule__ValueBlock__ElementsAssignment_2 )*
            {
             before(grammarAccess.getValueBlockAccess().getElementsAssignment_2()); 
            // InternalFPML.g:2467:2: ( rule__ValueBlock__ElementsAssignment_2 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalFPML.g:2467:3: rule__ValueBlock__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ValueBlock__ElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalFPML.g:2475:1: rule__ValueBlock__Group__3 : rule__ValueBlock__Group__3__Impl ;
    public final void rule__ValueBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2479:1: ( rule__ValueBlock__Group__3__Impl )
            // InternalFPML.g:2480:2: rule__ValueBlock__Group__3__Impl
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
    // InternalFPML.g:2486:1: rule__ValueBlock__Group__3__Impl : ( '}' ) ;
    public final void rule__ValueBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2490:1: ( ( '}' ) )
            // InternalFPML.g:2491:1: ( '}' )
            {
            // InternalFPML.g:2491:1: ( '}' )
            // InternalFPML.g:2492:2: '}'
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
    // InternalFPML.g:2502:1: rule__EffectFullBlock__Group__0 : rule__EffectFullBlock__Group__0__Impl rule__EffectFullBlock__Group__1 ;
    public final void rule__EffectFullBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2506:1: ( rule__EffectFullBlock__Group__0__Impl rule__EffectFullBlock__Group__1 )
            // InternalFPML.g:2507:2: rule__EffectFullBlock__Group__0__Impl rule__EffectFullBlock__Group__1
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
    // InternalFPML.g:2514:1: rule__EffectFullBlock__Group__0__Impl : ( 'Effects' ) ;
    public final void rule__EffectFullBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2518:1: ( ( 'Effects' ) )
            // InternalFPML.g:2519:1: ( 'Effects' )
            {
            // InternalFPML.g:2519:1: ( 'Effects' )
            // InternalFPML.g:2520:2: 'Effects'
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
    // InternalFPML.g:2529:1: rule__EffectFullBlock__Group__1 : rule__EffectFullBlock__Group__1__Impl rule__EffectFullBlock__Group__2 ;
    public final void rule__EffectFullBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2533:1: ( rule__EffectFullBlock__Group__1__Impl rule__EffectFullBlock__Group__2 )
            // InternalFPML.g:2534:2: rule__EffectFullBlock__Group__1__Impl rule__EffectFullBlock__Group__2
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
    // InternalFPML.g:2541:1: rule__EffectFullBlock__Group__1__Impl : ( '{' ) ;
    public final void rule__EffectFullBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2545:1: ( ( '{' ) )
            // InternalFPML.g:2546:1: ( '{' )
            {
            // InternalFPML.g:2546:1: ( '{' )
            // InternalFPML.g:2547:2: '{'
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
    // InternalFPML.g:2556:1: rule__EffectFullBlock__Group__2 : rule__EffectFullBlock__Group__2__Impl rule__EffectFullBlock__Group__3 ;
    public final void rule__EffectFullBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2560:1: ( rule__EffectFullBlock__Group__2__Impl rule__EffectFullBlock__Group__3 )
            // InternalFPML.g:2561:2: rule__EffectFullBlock__Group__2__Impl rule__EffectFullBlock__Group__3
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
    // InternalFPML.g:2568:1: rule__EffectFullBlock__Group__2__Impl : ( ( rule__EffectFullBlock__FeaturesAssignment_2 )* ) ;
    public final void rule__EffectFullBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2572:1: ( ( ( rule__EffectFullBlock__FeaturesAssignment_2 )* ) )
            // InternalFPML.g:2573:1: ( ( rule__EffectFullBlock__FeaturesAssignment_2 )* )
            {
            // InternalFPML.g:2573:1: ( ( rule__EffectFullBlock__FeaturesAssignment_2 )* )
            // InternalFPML.g:2574:2: ( rule__EffectFullBlock__FeaturesAssignment_2 )*
            {
             before(grammarAccess.getEffectFullBlockAccess().getFeaturesAssignment_2()); 
            // InternalFPML.g:2575:2: ( rule__EffectFullBlock__FeaturesAssignment_2 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==23) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalFPML.g:2575:3: rule__EffectFullBlock__FeaturesAssignment_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__EffectFullBlock__FeaturesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalFPML.g:2583:1: rule__EffectFullBlock__Group__3 : rule__EffectFullBlock__Group__3__Impl rule__EffectFullBlock__Group__4 ;
    public final void rule__EffectFullBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2587:1: ( rule__EffectFullBlock__Group__3__Impl rule__EffectFullBlock__Group__4 )
            // InternalFPML.g:2588:2: rule__EffectFullBlock__Group__3__Impl rule__EffectFullBlock__Group__4
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
    // InternalFPML.g:2595:1: rule__EffectFullBlock__Group__3__Impl : ( ( rule__EffectFullBlock__MainAssignment_3 ) ) ;
    public final void rule__EffectFullBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2599:1: ( ( ( rule__EffectFullBlock__MainAssignment_3 ) ) )
            // InternalFPML.g:2600:1: ( ( rule__EffectFullBlock__MainAssignment_3 ) )
            {
            // InternalFPML.g:2600:1: ( ( rule__EffectFullBlock__MainAssignment_3 ) )
            // InternalFPML.g:2601:2: ( rule__EffectFullBlock__MainAssignment_3 )
            {
             before(grammarAccess.getEffectFullBlockAccess().getMainAssignment_3()); 
            // InternalFPML.g:2602:2: ( rule__EffectFullBlock__MainAssignment_3 )
            // InternalFPML.g:2602:3: rule__EffectFullBlock__MainAssignment_3
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
    // InternalFPML.g:2610:1: rule__EffectFullBlock__Group__4 : rule__EffectFullBlock__Group__4__Impl ;
    public final void rule__EffectFullBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2614:1: ( rule__EffectFullBlock__Group__4__Impl )
            // InternalFPML.g:2615:2: rule__EffectFullBlock__Group__4__Impl
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
    // InternalFPML.g:2621:1: rule__EffectFullBlock__Group__4__Impl : ( '}' ) ;
    public final void rule__EffectFullBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2625:1: ( ( '}' ) )
            // InternalFPML.g:2626:1: ( '}' )
            {
            // InternalFPML.g:2626:1: ( '}' )
            // InternalFPML.g:2627:2: '}'
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
    // InternalFPML.g:2637:1: rule__Data__Group__0 : rule__Data__Group__0__Impl rule__Data__Group__1 ;
    public final void rule__Data__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2641:1: ( rule__Data__Group__0__Impl rule__Data__Group__1 )
            // InternalFPML.g:2642:2: rule__Data__Group__0__Impl rule__Data__Group__1
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
    // InternalFPML.g:2649:1: rule__Data__Group__0__Impl : ( ( rule__Data__NameAssignment_0 ) ) ;
    public final void rule__Data__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2653:1: ( ( ( rule__Data__NameAssignment_0 ) ) )
            // InternalFPML.g:2654:1: ( ( rule__Data__NameAssignment_0 ) )
            {
            // InternalFPML.g:2654:1: ( ( rule__Data__NameAssignment_0 ) )
            // InternalFPML.g:2655:2: ( rule__Data__NameAssignment_0 )
            {
             before(grammarAccess.getDataAccess().getNameAssignment_0()); 
            // InternalFPML.g:2656:2: ( rule__Data__NameAssignment_0 )
            // InternalFPML.g:2656:3: rule__Data__NameAssignment_0
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
    // InternalFPML.g:2664:1: rule__Data__Group__1 : rule__Data__Group__1__Impl rule__Data__Group__2 ;
    public final void rule__Data__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2668:1: ( rule__Data__Group__1__Impl rule__Data__Group__2 )
            // InternalFPML.g:2669:2: rule__Data__Group__1__Impl rule__Data__Group__2
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
    // InternalFPML.g:2676:1: rule__Data__Group__1__Impl : ( ':' ) ;
    public final void rule__Data__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2680:1: ( ( ':' ) )
            // InternalFPML.g:2681:1: ( ':' )
            {
            // InternalFPML.g:2681:1: ( ':' )
            // InternalFPML.g:2682:2: ':'
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
    // InternalFPML.g:2691:1: rule__Data__Group__2 : rule__Data__Group__2__Impl ;
    public final void rule__Data__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2695:1: ( rule__Data__Group__2__Impl )
            // InternalFPML.g:2696:2: rule__Data__Group__2__Impl
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
    // InternalFPML.g:2702:1: rule__Data__Group__2__Impl : ( ( rule__Data__ContentAssignment_2 ) ) ;
    public final void rule__Data__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2706:1: ( ( ( rule__Data__ContentAssignment_2 ) ) )
            // InternalFPML.g:2707:1: ( ( rule__Data__ContentAssignment_2 ) )
            {
            // InternalFPML.g:2707:1: ( ( rule__Data__ContentAssignment_2 ) )
            // InternalFPML.g:2708:2: ( rule__Data__ContentAssignment_2 )
            {
             before(grammarAccess.getDataAccess().getContentAssignment_2()); 
            // InternalFPML.g:2709:2: ( rule__Data__ContentAssignment_2 )
            // InternalFPML.g:2709:3: rule__Data__ContentAssignment_2
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
    // InternalFPML.g:2718:1: rule__Value__Group__0 : rule__Value__Group__0__Impl rule__Value__Group__1 ;
    public final void rule__Value__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2722:1: ( rule__Value__Group__0__Impl rule__Value__Group__1 )
            // InternalFPML.g:2723:2: rule__Value__Group__0__Impl rule__Value__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalFPML.g:2730:1: rule__Value__Group__0__Impl : ( () ) ;
    public final void rule__Value__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2734:1: ( ( () ) )
            // InternalFPML.g:2735:1: ( () )
            {
            // InternalFPML.g:2735:1: ( () )
            // InternalFPML.g:2736:2: ()
            {
             before(grammarAccess.getValueAccess().getValueAction_0()); 
            // InternalFPML.g:2737:2: ()
            // InternalFPML.g:2737:3: 
            {
            }

             after(grammarAccess.getValueAccess().getValueAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group__0__Impl"


    // $ANTLR start "rule__Value__Group__1"
    // InternalFPML.g:2745:1: rule__Value__Group__1 : rule__Value__Group__1__Impl rule__Value__Group__2 ;
    public final void rule__Value__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2749:1: ( rule__Value__Group__1__Impl rule__Value__Group__2 )
            // InternalFPML.g:2750:2: rule__Value__Group__1__Impl rule__Value__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalFPML.g:2757:1: rule__Value__Group__1__Impl : ( ( rule__Value__NameAssignment_1 ) ) ;
    public final void rule__Value__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2761:1: ( ( ( rule__Value__NameAssignment_1 ) ) )
            // InternalFPML.g:2762:1: ( ( rule__Value__NameAssignment_1 ) )
            {
            // InternalFPML.g:2762:1: ( ( rule__Value__NameAssignment_1 ) )
            // InternalFPML.g:2763:2: ( rule__Value__NameAssignment_1 )
            {
             before(grammarAccess.getValueAccess().getNameAssignment_1()); 
            // InternalFPML.g:2764:2: ( rule__Value__NameAssignment_1 )
            // InternalFPML.g:2764:3: rule__Value__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Value__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalFPML.g:2772:1: rule__Value__Group__2 : rule__Value__Group__2__Impl rule__Value__Group__3 ;
    public final void rule__Value__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2776:1: ( rule__Value__Group__2__Impl rule__Value__Group__3 )
            // InternalFPML.g:2777:2: rule__Value__Group__2__Impl rule__Value__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Value__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group__3();

            state._fsp--;


            }

        }
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
    // InternalFPML.g:2784:1: rule__Value__Group__2__Impl : ( ':' ) ;
    public final void rule__Value__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2788:1: ( ( ':' ) )
            // InternalFPML.g:2789:1: ( ':' )
            {
            // InternalFPML.g:2789:1: ( ':' )
            // InternalFPML.g:2790:2: ':'
            {
             before(grammarAccess.getValueAccess().getColonKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getColonKeyword_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Value__Group__3"
    // InternalFPML.g:2799:1: rule__Value__Group__3 : rule__Value__Group__3__Impl ;
    public final void rule__Value__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2803:1: ( rule__Value__Group__3__Impl )
            // InternalFPML.g:2804:2: rule__Value__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Value__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group__3"


    // $ANTLR start "rule__Value__Group__3__Impl"
    // InternalFPML.g:2810:1: rule__Value__Group__3__Impl : ( ( rule__Value__ValueAssignment_3 ) ) ;
    public final void rule__Value__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2814:1: ( ( ( rule__Value__ValueAssignment_3 ) ) )
            // InternalFPML.g:2815:1: ( ( rule__Value__ValueAssignment_3 ) )
            {
            // InternalFPML.g:2815:1: ( ( rule__Value__ValueAssignment_3 ) )
            // InternalFPML.g:2816:2: ( rule__Value__ValueAssignment_3 )
            {
             before(grammarAccess.getValueAccess().getValueAssignment_3()); 
            // InternalFPML.g:2817:2: ( rule__Value__ValueAssignment_3 )
            // InternalFPML.g:2817:3: rule__Value__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Value__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group__3__Impl"


    // $ANTLR start "rule__AdtType__Group_1__0"
    // InternalFPML.g:2826:1: rule__AdtType__Group_1__0 : rule__AdtType__Group_1__0__Impl rule__AdtType__Group_1__1 ;
    public final void rule__AdtType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2830:1: ( rule__AdtType__Group_1__0__Impl rule__AdtType__Group_1__1 )
            // InternalFPML.g:2831:2: rule__AdtType__Group_1__0__Impl rule__AdtType__Group_1__1
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
    // InternalFPML.g:2838:1: rule__AdtType__Group_1__0__Impl : ( '[' ) ;
    public final void rule__AdtType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2842:1: ( ( '[' ) )
            // InternalFPML.g:2843:1: ( '[' )
            {
            // InternalFPML.g:2843:1: ( '[' )
            // InternalFPML.g:2844:2: '['
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
    // InternalFPML.g:2853:1: rule__AdtType__Group_1__1 : rule__AdtType__Group_1__1__Impl rule__AdtType__Group_1__2 ;
    public final void rule__AdtType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2857:1: ( rule__AdtType__Group_1__1__Impl rule__AdtType__Group_1__2 )
            // InternalFPML.g:2858:2: rule__AdtType__Group_1__1__Impl rule__AdtType__Group_1__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalFPML.g:2865:1: rule__AdtType__Group_1__1__Impl : ( ( rule__AdtType__AdtElement1Assignment_1_1 ) ) ;
    public final void rule__AdtType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2869:1: ( ( ( rule__AdtType__AdtElement1Assignment_1_1 ) ) )
            // InternalFPML.g:2870:1: ( ( rule__AdtType__AdtElement1Assignment_1_1 ) )
            {
            // InternalFPML.g:2870:1: ( ( rule__AdtType__AdtElement1Assignment_1_1 ) )
            // InternalFPML.g:2871:2: ( rule__AdtType__AdtElement1Assignment_1_1 )
            {
             before(grammarAccess.getAdtTypeAccess().getAdtElement1Assignment_1_1()); 
            // InternalFPML.g:2872:2: ( rule__AdtType__AdtElement1Assignment_1_1 )
            // InternalFPML.g:2872:3: rule__AdtType__AdtElement1Assignment_1_1
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
    // InternalFPML.g:2880:1: rule__AdtType__Group_1__2 : rule__AdtType__Group_1__2__Impl rule__AdtType__Group_1__3 ;
    public final void rule__AdtType__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2884:1: ( rule__AdtType__Group_1__2__Impl rule__AdtType__Group_1__3 )
            // InternalFPML.g:2885:2: rule__AdtType__Group_1__2__Impl rule__AdtType__Group_1__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalFPML.g:2892:1: rule__AdtType__Group_1__2__Impl : ( ( rule__AdtType__AdtElement2Assignment_1_2 ) ) ;
    public final void rule__AdtType__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2896:1: ( ( ( rule__AdtType__AdtElement2Assignment_1_2 ) ) )
            // InternalFPML.g:2897:1: ( ( rule__AdtType__AdtElement2Assignment_1_2 ) )
            {
            // InternalFPML.g:2897:1: ( ( rule__AdtType__AdtElement2Assignment_1_2 ) )
            // InternalFPML.g:2898:2: ( rule__AdtType__AdtElement2Assignment_1_2 )
            {
             before(grammarAccess.getAdtTypeAccess().getAdtElement2Assignment_1_2()); 
            // InternalFPML.g:2899:2: ( rule__AdtType__AdtElement2Assignment_1_2 )
            // InternalFPML.g:2899:3: rule__AdtType__AdtElement2Assignment_1_2
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
    // InternalFPML.g:2907:1: rule__AdtType__Group_1__3 : rule__AdtType__Group_1__3__Impl ;
    public final void rule__AdtType__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2911:1: ( rule__AdtType__Group_1__3__Impl )
            // InternalFPML.g:2912:2: rule__AdtType__Group_1__3__Impl
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
    // InternalFPML.g:2918:1: rule__AdtType__Group_1__3__Impl : ( ']' ) ;
    public final void rule__AdtType__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2922:1: ( ( ']' ) )
            // InternalFPML.g:2923:1: ( ']' )
            {
            // InternalFPML.g:2923:1: ( ']' )
            // InternalFPML.g:2924:2: ']'
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
    // InternalFPML.g:2934:1: rule__SumType__Group__0 : rule__SumType__Group__0__Impl rule__SumType__Group__1 ;
    public final void rule__SumType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2938:1: ( rule__SumType__Group__0__Impl rule__SumType__Group__1 )
            // InternalFPML.g:2939:2: rule__SumType__Group__0__Impl rule__SumType__Group__1
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
    // InternalFPML.g:2946:1: rule__SumType__Group__0__Impl : ( '+' ) ;
    public final void rule__SumType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2950:1: ( ( '+' ) )
            // InternalFPML.g:2951:1: ( '+' )
            {
            // InternalFPML.g:2951:1: ( '+' )
            // InternalFPML.g:2952:2: '+'
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
    // InternalFPML.g:2961:1: rule__SumType__Group__1 : rule__SumType__Group__1__Impl ;
    public final void rule__SumType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2965:1: ( rule__SumType__Group__1__Impl )
            // InternalFPML.g:2966:2: rule__SumType__Group__1__Impl
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
    // InternalFPML.g:2972:1: rule__SumType__Group__1__Impl : ( ( rule__SumType__AdtElementAssignment_1 ) ) ;
    public final void rule__SumType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2976:1: ( ( ( rule__SumType__AdtElementAssignment_1 ) ) )
            // InternalFPML.g:2977:1: ( ( rule__SumType__AdtElementAssignment_1 ) )
            {
            // InternalFPML.g:2977:1: ( ( rule__SumType__AdtElementAssignment_1 ) )
            // InternalFPML.g:2978:2: ( rule__SumType__AdtElementAssignment_1 )
            {
             before(grammarAccess.getSumTypeAccess().getAdtElementAssignment_1()); 
            // InternalFPML.g:2979:2: ( rule__SumType__AdtElementAssignment_1 )
            // InternalFPML.g:2979:3: rule__SumType__AdtElementAssignment_1
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
    // InternalFPML.g:2988:1: rule__ProdType__Group__0 : rule__ProdType__Group__0__Impl rule__ProdType__Group__1 ;
    public final void rule__ProdType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:2992:1: ( rule__ProdType__Group__0__Impl rule__ProdType__Group__1 )
            // InternalFPML.g:2993:2: rule__ProdType__Group__0__Impl rule__ProdType__Group__1
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
    // InternalFPML.g:3000:1: rule__ProdType__Group__0__Impl : ( '*' ) ;
    public final void rule__ProdType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3004:1: ( ( '*' ) )
            // InternalFPML.g:3005:1: ( '*' )
            {
            // InternalFPML.g:3005:1: ( '*' )
            // InternalFPML.g:3006:2: '*'
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
    // InternalFPML.g:3015:1: rule__ProdType__Group__1 : rule__ProdType__Group__1__Impl ;
    public final void rule__ProdType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3019:1: ( rule__ProdType__Group__1__Impl )
            // InternalFPML.g:3020:2: rule__ProdType__Group__1__Impl
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
    // InternalFPML.g:3026:1: rule__ProdType__Group__1__Impl : ( ( rule__ProdType__AdtElementAssignment_1 ) ) ;
    public final void rule__ProdType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3030:1: ( ( ( rule__ProdType__AdtElementAssignment_1 ) ) )
            // InternalFPML.g:3031:1: ( ( rule__ProdType__AdtElementAssignment_1 ) )
            {
            // InternalFPML.g:3031:1: ( ( rule__ProdType__AdtElementAssignment_1 ) )
            // InternalFPML.g:3032:2: ( rule__ProdType__AdtElementAssignment_1 )
            {
             before(grammarAccess.getProdTypeAccess().getAdtElementAssignment_1()); 
            // InternalFPML.g:3033:2: ( rule__ProdType__AdtElementAssignment_1 )
            // InternalFPML.g:3033:3: rule__ProdType__AdtElementAssignment_1
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
    // InternalFPML.g:3042:1: rule__PureFunctionDefinition__Group__0 : rule__PureFunctionDefinition__Group__0__Impl rule__PureFunctionDefinition__Group__1 ;
    public final void rule__PureFunctionDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3046:1: ( rule__PureFunctionDefinition__Group__0__Impl rule__PureFunctionDefinition__Group__1 )
            // InternalFPML.g:3047:2: rule__PureFunctionDefinition__Group__0__Impl rule__PureFunctionDefinition__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalFPML.g:3054:1: rule__PureFunctionDefinition__Group__0__Impl : ( 'def' ) ;
    public final void rule__PureFunctionDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3058:1: ( ( 'def' ) )
            // InternalFPML.g:3059:1: ( 'def' )
            {
            // InternalFPML.g:3059:1: ( 'def' )
            // InternalFPML.g:3060:2: 'def'
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
    // InternalFPML.g:3069:1: rule__PureFunctionDefinition__Group__1 : rule__PureFunctionDefinition__Group__1__Impl rule__PureFunctionDefinition__Group__2 ;
    public final void rule__PureFunctionDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3073:1: ( rule__PureFunctionDefinition__Group__1__Impl rule__PureFunctionDefinition__Group__2 )
            // InternalFPML.g:3074:2: rule__PureFunctionDefinition__Group__1__Impl rule__PureFunctionDefinition__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalFPML.g:3081:1: rule__PureFunctionDefinition__Group__1__Impl : ( ( rule__PureFunctionDefinition__ReturnTypeAssignment_1 ) ) ;
    public final void rule__PureFunctionDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3085:1: ( ( ( rule__PureFunctionDefinition__ReturnTypeAssignment_1 ) ) )
            // InternalFPML.g:3086:1: ( ( rule__PureFunctionDefinition__ReturnTypeAssignment_1 ) )
            {
            // InternalFPML.g:3086:1: ( ( rule__PureFunctionDefinition__ReturnTypeAssignment_1 ) )
            // InternalFPML.g:3087:2: ( rule__PureFunctionDefinition__ReturnTypeAssignment_1 )
            {
             before(grammarAccess.getPureFunctionDefinitionAccess().getReturnTypeAssignment_1()); 
            // InternalFPML.g:3088:2: ( rule__PureFunctionDefinition__ReturnTypeAssignment_1 )
            // InternalFPML.g:3088:3: rule__PureFunctionDefinition__ReturnTypeAssignment_1
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
    // InternalFPML.g:3096:1: rule__PureFunctionDefinition__Group__2 : rule__PureFunctionDefinition__Group__2__Impl rule__PureFunctionDefinition__Group__3 ;
    public final void rule__PureFunctionDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3100:1: ( rule__PureFunctionDefinition__Group__2__Impl rule__PureFunctionDefinition__Group__3 )
            // InternalFPML.g:3101:2: rule__PureFunctionDefinition__Group__2__Impl rule__PureFunctionDefinition__Group__3
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
    // InternalFPML.g:3108:1: rule__PureFunctionDefinition__Group__2__Impl : ( ( rule__PureFunctionDefinition__NameAssignment_2 ) ) ;
    public final void rule__PureFunctionDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3112:1: ( ( ( rule__PureFunctionDefinition__NameAssignment_2 ) ) )
            // InternalFPML.g:3113:1: ( ( rule__PureFunctionDefinition__NameAssignment_2 ) )
            {
            // InternalFPML.g:3113:1: ( ( rule__PureFunctionDefinition__NameAssignment_2 ) )
            // InternalFPML.g:3114:2: ( rule__PureFunctionDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getPureFunctionDefinitionAccess().getNameAssignment_2()); 
            // InternalFPML.g:3115:2: ( rule__PureFunctionDefinition__NameAssignment_2 )
            // InternalFPML.g:3115:3: rule__PureFunctionDefinition__NameAssignment_2
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
    // InternalFPML.g:3123:1: rule__PureFunctionDefinition__Group__3 : rule__PureFunctionDefinition__Group__3__Impl rule__PureFunctionDefinition__Group__4 ;
    public final void rule__PureFunctionDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3127:1: ( rule__PureFunctionDefinition__Group__3__Impl rule__PureFunctionDefinition__Group__4 )
            // InternalFPML.g:3128:2: rule__PureFunctionDefinition__Group__3__Impl rule__PureFunctionDefinition__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalFPML.g:3135:1: rule__PureFunctionDefinition__Group__3__Impl : ( '(' ) ;
    public final void rule__PureFunctionDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3139:1: ( ( '(' ) )
            // InternalFPML.g:3140:1: ( '(' )
            {
            // InternalFPML.g:3140:1: ( '(' )
            // InternalFPML.g:3141:2: '('
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
    // InternalFPML.g:3150:1: rule__PureFunctionDefinition__Group__4 : rule__PureFunctionDefinition__Group__4__Impl rule__PureFunctionDefinition__Group__5 ;
    public final void rule__PureFunctionDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3154:1: ( rule__PureFunctionDefinition__Group__4__Impl rule__PureFunctionDefinition__Group__5 )
            // InternalFPML.g:3155:2: rule__PureFunctionDefinition__Group__4__Impl rule__PureFunctionDefinition__Group__5
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
    // InternalFPML.g:3162:1: rule__PureFunctionDefinition__Group__4__Impl : ( ( rule__PureFunctionDefinition__ArgAssignment_4 ) ) ;
    public final void rule__PureFunctionDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3166:1: ( ( ( rule__PureFunctionDefinition__ArgAssignment_4 ) ) )
            // InternalFPML.g:3167:1: ( ( rule__PureFunctionDefinition__ArgAssignment_4 ) )
            {
            // InternalFPML.g:3167:1: ( ( rule__PureFunctionDefinition__ArgAssignment_4 ) )
            // InternalFPML.g:3168:2: ( rule__PureFunctionDefinition__ArgAssignment_4 )
            {
             before(grammarAccess.getPureFunctionDefinitionAccess().getArgAssignment_4()); 
            // InternalFPML.g:3169:2: ( rule__PureFunctionDefinition__ArgAssignment_4 )
            // InternalFPML.g:3169:3: rule__PureFunctionDefinition__ArgAssignment_4
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
    // InternalFPML.g:3177:1: rule__PureFunctionDefinition__Group__5 : rule__PureFunctionDefinition__Group__5__Impl rule__PureFunctionDefinition__Group__6 ;
    public final void rule__PureFunctionDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3181:1: ( rule__PureFunctionDefinition__Group__5__Impl rule__PureFunctionDefinition__Group__6 )
            // InternalFPML.g:3182:2: rule__PureFunctionDefinition__Group__5__Impl rule__PureFunctionDefinition__Group__6
            {
            pushFollow(FOLLOW_22);
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
    // InternalFPML.g:3189:1: rule__PureFunctionDefinition__Group__5__Impl : ( ( rule__PureFunctionDefinition__Group_5__0 )? ) ;
    public final void rule__PureFunctionDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3193:1: ( ( ( rule__PureFunctionDefinition__Group_5__0 )? ) )
            // InternalFPML.g:3194:1: ( ( rule__PureFunctionDefinition__Group_5__0 )? )
            {
            // InternalFPML.g:3194:1: ( ( rule__PureFunctionDefinition__Group_5__0 )? )
            // InternalFPML.g:3195:2: ( rule__PureFunctionDefinition__Group_5__0 )?
            {
             before(grammarAccess.getPureFunctionDefinitionAccess().getGroup_5()); 
            // InternalFPML.g:3196:2: ( rule__PureFunctionDefinition__Group_5__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==26) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalFPML.g:3196:3: rule__PureFunctionDefinition__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PureFunctionDefinition__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPureFunctionDefinitionAccess().getGroup_5()); 

            }


            }

        }
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
    // InternalFPML.g:3204:1: rule__PureFunctionDefinition__Group__6 : rule__PureFunctionDefinition__Group__6__Impl rule__PureFunctionDefinition__Group__7 ;
    public final void rule__PureFunctionDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3208:1: ( rule__PureFunctionDefinition__Group__6__Impl rule__PureFunctionDefinition__Group__7 )
            // InternalFPML.g:3209:2: rule__PureFunctionDefinition__Group__6__Impl rule__PureFunctionDefinition__Group__7
            {
            pushFollow(FOLLOW_14);
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
    // InternalFPML.g:3216:1: rule__PureFunctionDefinition__Group__6__Impl : ( ')' ) ;
    public final void rule__PureFunctionDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3220:1: ( ( ')' ) )
            // InternalFPML.g:3221:1: ( ')' )
            {
            // InternalFPML.g:3221:1: ( ')' )
            // InternalFPML.g:3222:2: ')'
            {
             before(grammarAccess.getPureFunctionDefinitionAccess().getRightParenthesisKeyword_6()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPureFunctionDefinitionAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
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
    // InternalFPML.g:3231:1: rule__PureFunctionDefinition__Group__7 : rule__PureFunctionDefinition__Group__7__Impl rule__PureFunctionDefinition__Group__8 ;
    public final void rule__PureFunctionDefinition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3235:1: ( rule__PureFunctionDefinition__Group__7__Impl rule__PureFunctionDefinition__Group__8 )
            // InternalFPML.g:3236:2: rule__PureFunctionDefinition__Group__7__Impl rule__PureFunctionDefinition__Group__8
            {
            pushFollow(FOLLOW_4);
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
    // InternalFPML.g:3243:1: rule__PureFunctionDefinition__Group__7__Impl : ( ':' ) ;
    public final void rule__PureFunctionDefinition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3247:1: ( ( ':' ) )
            // InternalFPML.g:3248:1: ( ':' )
            {
            // InternalFPML.g:3248:1: ( ':' )
            // InternalFPML.g:3249:2: ':'
            {
             before(grammarAccess.getPureFunctionDefinitionAccess().getColonKeyword_7()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPureFunctionDefinitionAccess().getColonKeyword_7()); 

            }


            }

        }
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
    // InternalFPML.g:3258:1: rule__PureFunctionDefinition__Group__8 : rule__PureFunctionDefinition__Group__8__Impl rule__PureFunctionDefinition__Group__9 ;
    public final void rule__PureFunctionDefinition__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3262:1: ( rule__PureFunctionDefinition__Group__8__Impl rule__PureFunctionDefinition__Group__9 )
            // InternalFPML.g:3263:2: rule__PureFunctionDefinition__Group__8__Impl rule__PureFunctionDefinition__Group__9
            {
            pushFollow(FOLLOW_23);
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
    // InternalFPML.g:3270:1: rule__PureFunctionDefinition__Group__8__Impl : ( '{' ) ;
    public final void rule__PureFunctionDefinition__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3274:1: ( ( '{' ) )
            // InternalFPML.g:3275:1: ( '{' )
            {
            // InternalFPML.g:3275:1: ( '{' )
            // InternalFPML.g:3276:2: '{'
            {
             before(grammarAccess.getPureFunctionDefinitionAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getPureFunctionDefinitionAccess().getLeftCurlyBracketKeyword_8()); 

            }


            }

        }
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
    // InternalFPML.g:3285:1: rule__PureFunctionDefinition__Group__9 : rule__PureFunctionDefinition__Group__9__Impl rule__PureFunctionDefinition__Group__10 ;
    public final void rule__PureFunctionDefinition__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3289:1: ( rule__PureFunctionDefinition__Group__9__Impl rule__PureFunctionDefinition__Group__10 )
            // InternalFPML.g:3290:2: rule__PureFunctionDefinition__Group__9__Impl rule__PureFunctionDefinition__Group__10
            {
            pushFollow(FOLLOW_7);
            rule__PureFunctionDefinition__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PureFunctionDefinition__Group__10();

            state._fsp--;


            }

        }
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
    // InternalFPML.g:3297:1: rule__PureFunctionDefinition__Group__9__Impl : ( ( rule__PureFunctionDefinition__FunctionBodyAssignment_9 ) ) ;
    public final void rule__PureFunctionDefinition__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3301:1: ( ( ( rule__PureFunctionDefinition__FunctionBodyAssignment_9 ) ) )
            // InternalFPML.g:3302:1: ( ( rule__PureFunctionDefinition__FunctionBodyAssignment_9 ) )
            {
            // InternalFPML.g:3302:1: ( ( rule__PureFunctionDefinition__FunctionBodyAssignment_9 ) )
            // InternalFPML.g:3303:2: ( rule__PureFunctionDefinition__FunctionBodyAssignment_9 )
            {
             before(grammarAccess.getPureFunctionDefinitionAccess().getFunctionBodyAssignment_9()); 
            // InternalFPML.g:3304:2: ( rule__PureFunctionDefinition__FunctionBodyAssignment_9 )
            // InternalFPML.g:3304:3: rule__PureFunctionDefinition__FunctionBodyAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__PureFunctionDefinition__FunctionBodyAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getPureFunctionDefinitionAccess().getFunctionBodyAssignment_9()); 

            }


            }

        }
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


    // $ANTLR start "rule__PureFunctionDefinition__Group__10"
    // InternalFPML.g:3312:1: rule__PureFunctionDefinition__Group__10 : rule__PureFunctionDefinition__Group__10__Impl ;
    public final void rule__PureFunctionDefinition__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3316:1: ( rule__PureFunctionDefinition__Group__10__Impl )
            // InternalFPML.g:3317:2: rule__PureFunctionDefinition__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PureFunctionDefinition__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunctionDefinition__Group__10"


    // $ANTLR start "rule__PureFunctionDefinition__Group__10__Impl"
    // InternalFPML.g:3323:1: rule__PureFunctionDefinition__Group__10__Impl : ( '}' ) ;
    public final void rule__PureFunctionDefinition__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3327:1: ( ( '}' ) )
            // InternalFPML.g:3328:1: ( '}' )
            {
            // InternalFPML.g:3328:1: ( '}' )
            // InternalFPML.g:3329:2: '}'
            {
             before(grammarAccess.getPureFunctionDefinitionAccess().getRightCurlyBracketKeyword_10()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPureFunctionDefinitionAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunctionDefinition__Group__10__Impl"


    // $ANTLR start "rule__PureFunctionDefinition__Group_5__0"
    // InternalFPML.g:3339:1: rule__PureFunctionDefinition__Group_5__0 : rule__PureFunctionDefinition__Group_5__0__Impl rule__PureFunctionDefinition__Group_5__1 ;
    public final void rule__PureFunctionDefinition__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3343:1: ( rule__PureFunctionDefinition__Group_5__0__Impl rule__PureFunctionDefinition__Group_5__1 )
            // InternalFPML.g:3344:2: rule__PureFunctionDefinition__Group_5__0__Impl rule__PureFunctionDefinition__Group_5__1
            {
            pushFollow(FOLLOW_20);
            rule__PureFunctionDefinition__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PureFunctionDefinition__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunctionDefinition__Group_5__0"


    // $ANTLR start "rule__PureFunctionDefinition__Group_5__0__Impl"
    // InternalFPML.g:3351:1: rule__PureFunctionDefinition__Group_5__0__Impl : ( ',' ) ;
    public final void rule__PureFunctionDefinition__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3355:1: ( ( ',' ) )
            // InternalFPML.g:3356:1: ( ',' )
            {
            // InternalFPML.g:3356:1: ( ',' )
            // InternalFPML.g:3357:2: ','
            {
             before(grammarAccess.getPureFunctionDefinitionAccess().getCommaKeyword_5_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getPureFunctionDefinitionAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunctionDefinition__Group_5__0__Impl"


    // $ANTLR start "rule__PureFunctionDefinition__Group_5__1"
    // InternalFPML.g:3366:1: rule__PureFunctionDefinition__Group_5__1 : rule__PureFunctionDefinition__Group_5__1__Impl ;
    public final void rule__PureFunctionDefinition__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3370:1: ( rule__PureFunctionDefinition__Group_5__1__Impl )
            // InternalFPML.g:3371:2: rule__PureFunctionDefinition__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PureFunctionDefinition__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunctionDefinition__Group_5__1"


    // $ANTLR start "rule__PureFunctionDefinition__Group_5__1__Impl"
    // InternalFPML.g:3377:1: rule__PureFunctionDefinition__Group_5__1__Impl : ( ( rule__PureFunctionDefinition__Arg2Assignment_5_1 ) ) ;
    public final void rule__PureFunctionDefinition__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3381:1: ( ( ( rule__PureFunctionDefinition__Arg2Assignment_5_1 ) ) )
            // InternalFPML.g:3382:1: ( ( rule__PureFunctionDefinition__Arg2Assignment_5_1 ) )
            {
            // InternalFPML.g:3382:1: ( ( rule__PureFunctionDefinition__Arg2Assignment_5_1 ) )
            // InternalFPML.g:3383:2: ( rule__PureFunctionDefinition__Arg2Assignment_5_1 )
            {
             before(grammarAccess.getPureFunctionDefinitionAccess().getArg2Assignment_5_1()); 
            // InternalFPML.g:3384:2: ( rule__PureFunctionDefinition__Arg2Assignment_5_1 )
            // InternalFPML.g:3384:3: rule__PureFunctionDefinition__Arg2Assignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__PureFunctionDefinition__Arg2Assignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getPureFunctionDefinitionAccess().getArg2Assignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunctionDefinition__Group_5__1__Impl"


    // $ANTLR start "rule__EffectFullFunctionDefinition__Group__0"
    // InternalFPML.g:3393:1: rule__EffectFullFunctionDefinition__Group__0 : rule__EffectFullFunctionDefinition__Group__0__Impl rule__EffectFullFunctionDefinition__Group__1 ;
    public final void rule__EffectFullFunctionDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3397:1: ( rule__EffectFullFunctionDefinition__Group__0__Impl rule__EffectFullFunctionDefinition__Group__1 )
            // InternalFPML.g:3398:2: rule__EffectFullFunctionDefinition__Group__0__Impl rule__EffectFullFunctionDefinition__Group__1
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
    // InternalFPML.g:3405:1: rule__EffectFullFunctionDefinition__Group__0__Impl : ( 'def' ) ;
    public final void rule__EffectFullFunctionDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3409:1: ( ( 'def' ) )
            // InternalFPML.g:3410:1: ( 'def' )
            {
            // InternalFPML.g:3410:1: ( 'def' )
            // InternalFPML.g:3411:2: 'def'
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
    // InternalFPML.g:3420:1: rule__EffectFullFunctionDefinition__Group__1 : rule__EffectFullFunctionDefinition__Group__1__Impl rule__EffectFullFunctionDefinition__Group__2 ;
    public final void rule__EffectFullFunctionDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3424:1: ( rule__EffectFullFunctionDefinition__Group__1__Impl rule__EffectFullFunctionDefinition__Group__2 )
            // InternalFPML.g:3425:2: rule__EffectFullFunctionDefinition__Group__1__Impl rule__EffectFullFunctionDefinition__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalFPML.g:3432:1: rule__EffectFullFunctionDefinition__Group__1__Impl : ( ( rule__EffectFullFunctionDefinition__ReturnTypeAssignment_1 ) ) ;
    public final void rule__EffectFullFunctionDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3436:1: ( ( ( rule__EffectFullFunctionDefinition__ReturnTypeAssignment_1 ) ) )
            // InternalFPML.g:3437:1: ( ( rule__EffectFullFunctionDefinition__ReturnTypeAssignment_1 ) )
            {
            // InternalFPML.g:3437:1: ( ( rule__EffectFullFunctionDefinition__ReturnTypeAssignment_1 ) )
            // InternalFPML.g:3438:2: ( rule__EffectFullFunctionDefinition__ReturnTypeAssignment_1 )
            {
             before(grammarAccess.getEffectFullFunctionDefinitionAccess().getReturnTypeAssignment_1()); 
            // InternalFPML.g:3439:2: ( rule__EffectFullFunctionDefinition__ReturnTypeAssignment_1 )
            // InternalFPML.g:3439:3: rule__EffectFullFunctionDefinition__ReturnTypeAssignment_1
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
    // InternalFPML.g:3447:1: rule__EffectFullFunctionDefinition__Group__2 : rule__EffectFullFunctionDefinition__Group__2__Impl rule__EffectFullFunctionDefinition__Group__3 ;
    public final void rule__EffectFullFunctionDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3451:1: ( rule__EffectFullFunctionDefinition__Group__2__Impl rule__EffectFullFunctionDefinition__Group__3 )
            // InternalFPML.g:3452:2: rule__EffectFullFunctionDefinition__Group__2__Impl rule__EffectFullFunctionDefinition__Group__3
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
    // InternalFPML.g:3459:1: rule__EffectFullFunctionDefinition__Group__2__Impl : ( ( rule__EffectFullFunctionDefinition__NameAssignment_2 ) ) ;
    public final void rule__EffectFullFunctionDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3463:1: ( ( ( rule__EffectFullFunctionDefinition__NameAssignment_2 ) ) )
            // InternalFPML.g:3464:1: ( ( rule__EffectFullFunctionDefinition__NameAssignment_2 ) )
            {
            // InternalFPML.g:3464:1: ( ( rule__EffectFullFunctionDefinition__NameAssignment_2 ) )
            // InternalFPML.g:3465:2: ( rule__EffectFullFunctionDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getEffectFullFunctionDefinitionAccess().getNameAssignment_2()); 
            // InternalFPML.g:3466:2: ( rule__EffectFullFunctionDefinition__NameAssignment_2 )
            // InternalFPML.g:3466:3: rule__EffectFullFunctionDefinition__NameAssignment_2
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
    // InternalFPML.g:3474:1: rule__EffectFullFunctionDefinition__Group__3 : rule__EffectFullFunctionDefinition__Group__3__Impl rule__EffectFullFunctionDefinition__Group__4 ;
    public final void rule__EffectFullFunctionDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3478:1: ( rule__EffectFullFunctionDefinition__Group__3__Impl rule__EffectFullFunctionDefinition__Group__4 )
            // InternalFPML.g:3479:2: rule__EffectFullFunctionDefinition__Group__3__Impl rule__EffectFullFunctionDefinition__Group__4
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
    // InternalFPML.g:3486:1: rule__EffectFullFunctionDefinition__Group__3__Impl : ( '(' ) ;
    public final void rule__EffectFullFunctionDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3490:1: ( ( '(' ) )
            // InternalFPML.g:3491:1: ( '(' )
            {
            // InternalFPML.g:3491:1: ( '(' )
            // InternalFPML.g:3492:2: '('
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
    // InternalFPML.g:3501:1: rule__EffectFullFunctionDefinition__Group__4 : rule__EffectFullFunctionDefinition__Group__4__Impl rule__EffectFullFunctionDefinition__Group__5 ;
    public final void rule__EffectFullFunctionDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3505:1: ( rule__EffectFullFunctionDefinition__Group__4__Impl rule__EffectFullFunctionDefinition__Group__5 )
            // InternalFPML.g:3506:2: rule__EffectFullFunctionDefinition__Group__4__Impl rule__EffectFullFunctionDefinition__Group__5
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
    // InternalFPML.g:3513:1: rule__EffectFullFunctionDefinition__Group__4__Impl : ( ( rule__EffectFullFunctionDefinition__ArgAssignment_4 ) ) ;
    public final void rule__EffectFullFunctionDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3517:1: ( ( ( rule__EffectFullFunctionDefinition__ArgAssignment_4 ) ) )
            // InternalFPML.g:3518:1: ( ( rule__EffectFullFunctionDefinition__ArgAssignment_4 ) )
            {
            // InternalFPML.g:3518:1: ( ( rule__EffectFullFunctionDefinition__ArgAssignment_4 ) )
            // InternalFPML.g:3519:2: ( rule__EffectFullFunctionDefinition__ArgAssignment_4 )
            {
             before(grammarAccess.getEffectFullFunctionDefinitionAccess().getArgAssignment_4()); 
            // InternalFPML.g:3520:2: ( rule__EffectFullFunctionDefinition__ArgAssignment_4 )
            // InternalFPML.g:3520:3: rule__EffectFullFunctionDefinition__ArgAssignment_4
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
    // InternalFPML.g:3528:1: rule__EffectFullFunctionDefinition__Group__5 : rule__EffectFullFunctionDefinition__Group__5__Impl rule__EffectFullFunctionDefinition__Group__6 ;
    public final void rule__EffectFullFunctionDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3532:1: ( rule__EffectFullFunctionDefinition__Group__5__Impl rule__EffectFullFunctionDefinition__Group__6 )
            // InternalFPML.g:3533:2: rule__EffectFullFunctionDefinition__Group__5__Impl rule__EffectFullFunctionDefinition__Group__6
            {
            pushFollow(FOLLOW_22);
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
    // InternalFPML.g:3540:1: rule__EffectFullFunctionDefinition__Group__5__Impl : ( ( rule__EffectFullFunctionDefinition__Group_5__0 )? ) ;
    public final void rule__EffectFullFunctionDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3544:1: ( ( ( rule__EffectFullFunctionDefinition__Group_5__0 )? ) )
            // InternalFPML.g:3545:1: ( ( rule__EffectFullFunctionDefinition__Group_5__0 )? )
            {
            // InternalFPML.g:3545:1: ( ( rule__EffectFullFunctionDefinition__Group_5__0 )? )
            // InternalFPML.g:3546:2: ( rule__EffectFullFunctionDefinition__Group_5__0 )?
            {
             before(grammarAccess.getEffectFullFunctionDefinitionAccess().getGroup_5()); 
            // InternalFPML.g:3547:2: ( rule__EffectFullFunctionDefinition__Group_5__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==26) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalFPML.g:3547:3: rule__EffectFullFunctionDefinition__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EffectFullFunctionDefinition__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEffectFullFunctionDefinitionAccess().getGroup_5()); 

            }


            }

        }
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
    // InternalFPML.g:3555:1: rule__EffectFullFunctionDefinition__Group__6 : rule__EffectFullFunctionDefinition__Group__6__Impl rule__EffectFullFunctionDefinition__Group__7 ;
    public final void rule__EffectFullFunctionDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3559:1: ( rule__EffectFullFunctionDefinition__Group__6__Impl rule__EffectFullFunctionDefinition__Group__7 )
            // InternalFPML.g:3560:2: rule__EffectFullFunctionDefinition__Group__6__Impl rule__EffectFullFunctionDefinition__Group__7
            {
            pushFollow(FOLLOW_14);
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
    // InternalFPML.g:3567:1: rule__EffectFullFunctionDefinition__Group__6__Impl : ( ')' ) ;
    public final void rule__EffectFullFunctionDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3571:1: ( ( ')' ) )
            // InternalFPML.g:3572:1: ( ')' )
            {
            // InternalFPML.g:3572:1: ( ')' )
            // InternalFPML.g:3573:2: ')'
            {
             before(grammarAccess.getEffectFullFunctionDefinitionAccess().getRightParenthesisKeyword_6()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getEffectFullFunctionDefinitionAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
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
    // InternalFPML.g:3582:1: rule__EffectFullFunctionDefinition__Group__7 : rule__EffectFullFunctionDefinition__Group__7__Impl rule__EffectFullFunctionDefinition__Group__8 ;
    public final void rule__EffectFullFunctionDefinition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3586:1: ( rule__EffectFullFunctionDefinition__Group__7__Impl rule__EffectFullFunctionDefinition__Group__8 )
            // InternalFPML.g:3587:2: rule__EffectFullFunctionDefinition__Group__7__Impl rule__EffectFullFunctionDefinition__Group__8
            {
            pushFollow(FOLLOW_4);
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
    // InternalFPML.g:3594:1: rule__EffectFullFunctionDefinition__Group__7__Impl : ( ':' ) ;
    public final void rule__EffectFullFunctionDefinition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3598:1: ( ( ':' ) )
            // InternalFPML.g:3599:1: ( ':' )
            {
            // InternalFPML.g:3599:1: ( ':' )
            // InternalFPML.g:3600:2: ':'
            {
             before(grammarAccess.getEffectFullFunctionDefinitionAccess().getColonKeyword_7()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getEffectFullFunctionDefinitionAccess().getColonKeyword_7()); 

            }


            }

        }
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
    // InternalFPML.g:3609:1: rule__EffectFullFunctionDefinition__Group__8 : rule__EffectFullFunctionDefinition__Group__8__Impl rule__EffectFullFunctionDefinition__Group__9 ;
    public final void rule__EffectFullFunctionDefinition__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3613:1: ( rule__EffectFullFunctionDefinition__Group__8__Impl rule__EffectFullFunctionDefinition__Group__9 )
            // InternalFPML.g:3614:2: rule__EffectFullFunctionDefinition__Group__8__Impl rule__EffectFullFunctionDefinition__Group__9
            {
            pushFollow(FOLLOW_26);
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
    // InternalFPML.g:3621:1: rule__EffectFullFunctionDefinition__Group__8__Impl : ( '{' ) ;
    public final void rule__EffectFullFunctionDefinition__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3625:1: ( ( '{' ) )
            // InternalFPML.g:3626:1: ( '{' )
            {
            // InternalFPML.g:3626:1: ( '{' )
            // InternalFPML.g:3627:2: '{'
            {
             before(grammarAccess.getEffectFullFunctionDefinitionAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getEffectFullFunctionDefinitionAccess().getLeftCurlyBracketKeyword_8()); 

            }


            }

        }
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
    // InternalFPML.g:3636:1: rule__EffectFullFunctionDefinition__Group__9 : rule__EffectFullFunctionDefinition__Group__9__Impl rule__EffectFullFunctionDefinition__Group__10 ;
    public final void rule__EffectFullFunctionDefinition__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3640:1: ( rule__EffectFullFunctionDefinition__Group__9__Impl rule__EffectFullFunctionDefinition__Group__10 )
            // InternalFPML.g:3641:2: rule__EffectFullFunctionDefinition__Group__9__Impl rule__EffectFullFunctionDefinition__Group__10
            {
            pushFollow(FOLLOW_7);
            rule__EffectFullFunctionDefinition__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullFunctionDefinition__Group__10();

            state._fsp--;


            }

        }
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
    // InternalFPML.g:3648:1: rule__EffectFullFunctionDefinition__Group__9__Impl : ( ( rule__EffectFullFunctionDefinition__FunctionBodyAssignment_9 ) ) ;
    public final void rule__EffectFullFunctionDefinition__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3652:1: ( ( ( rule__EffectFullFunctionDefinition__FunctionBodyAssignment_9 ) ) )
            // InternalFPML.g:3653:1: ( ( rule__EffectFullFunctionDefinition__FunctionBodyAssignment_9 ) )
            {
            // InternalFPML.g:3653:1: ( ( rule__EffectFullFunctionDefinition__FunctionBodyAssignment_9 ) )
            // InternalFPML.g:3654:2: ( rule__EffectFullFunctionDefinition__FunctionBodyAssignment_9 )
            {
             before(grammarAccess.getEffectFullFunctionDefinitionAccess().getFunctionBodyAssignment_9()); 
            // InternalFPML.g:3655:2: ( rule__EffectFullFunctionDefinition__FunctionBodyAssignment_9 )
            // InternalFPML.g:3655:3: rule__EffectFullFunctionDefinition__FunctionBodyAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullFunctionDefinition__FunctionBodyAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getEffectFullFunctionDefinitionAccess().getFunctionBodyAssignment_9()); 

            }


            }

        }
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


    // $ANTLR start "rule__EffectFullFunctionDefinition__Group__10"
    // InternalFPML.g:3663:1: rule__EffectFullFunctionDefinition__Group__10 : rule__EffectFullFunctionDefinition__Group__10__Impl ;
    public final void rule__EffectFullFunctionDefinition__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3667:1: ( rule__EffectFullFunctionDefinition__Group__10__Impl )
            // InternalFPML.g:3668:2: rule__EffectFullFunctionDefinition__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullFunctionDefinition__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunctionDefinition__Group__10"


    // $ANTLR start "rule__EffectFullFunctionDefinition__Group__10__Impl"
    // InternalFPML.g:3674:1: rule__EffectFullFunctionDefinition__Group__10__Impl : ( '}' ) ;
    public final void rule__EffectFullFunctionDefinition__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3678:1: ( ( '}' ) )
            // InternalFPML.g:3679:1: ( '}' )
            {
            // InternalFPML.g:3679:1: ( '}' )
            // InternalFPML.g:3680:2: '}'
            {
             before(grammarAccess.getEffectFullFunctionDefinitionAccess().getRightCurlyBracketKeyword_10()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getEffectFullFunctionDefinitionAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunctionDefinition__Group__10__Impl"


    // $ANTLR start "rule__EffectFullFunctionDefinition__Group_5__0"
    // InternalFPML.g:3690:1: rule__EffectFullFunctionDefinition__Group_5__0 : rule__EffectFullFunctionDefinition__Group_5__0__Impl rule__EffectFullFunctionDefinition__Group_5__1 ;
    public final void rule__EffectFullFunctionDefinition__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3694:1: ( rule__EffectFullFunctionDefinition__Group_5__0__Impl rule__EffectFullFunctionDefinition__Group_5__1 )
            // InternalFPML.g:3695:2: rule__EffectFullFunctionDefinition__Group_5__0__Impl rule__EffectFullFunctionDefinition__Group_5__1
            {
            pushFollow(FOLLOW_25);
            rule__EffectFullFunctionDefinition__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectFullFunctionDefinition__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunctionDefinition__Group_5__0"


    // $ANTLR start "rule__EffectFullFunctionDefinition__Group_5__0__Impl"
    // InternalFPML.g:3702:1: rule__EffectFullFunctionDefinition__Group_5__0__Impl : ( ',' ) ;
    public final void rule__EffectFullFunctionDefinition__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3706:1: ( ( ',' ) )
            // InternalFPML.g:3707:1: ( ',' )
            {
            // InternalFPML.g:3707:1: ( ',' )
            // InternalFPML.g:3708:2: ','
            {
             before(grammarAccess.getEffectFullFunctionDefinitionAccess().getCommaKeyword_5_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getEffectFullFunctionDefinitionAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunctionDefinition__Group_5__0__Impl"


    // $ANTLR start "rule__EffectFullFunctionDefinition__Group_5__1"
    // InternalFPML.g:3717:1: rule__EffectFullFunctionDefinition__Group_5__1 : rule__EffectFullFunctionDefinition__Group_5__1__Impl ;
    public final void rule__EffectFullFunctionDefinition__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3721:1: ( rule__EffectFullFunctionDefinition__Group_5__1__Impl )
            // InternalFPML.g:3722:2: rule__EffectFullFunctionDefinition__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullFunctionDefinition__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunctionDefinition__Group_5__1"


    // $ANTLR start "rule__EffectFullFunctionDefinition__Group_5__1__Impl"
    // InternalFPML.g:3728:1: rule__EffectFullFunctionDefinition__Group_5__1__Impl : ( ( rule__EffectFullFunctionDefinition__Arg2Assignment_5_1 ) ) ;
    public final void rule__EffectFullFunctionDefinition__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3732:1: ( ( ( rule__EffectFullFunctionDefinition__Arg2Assignment_5_1 ) ) )
            // InternalFPML.g:3733:1: ( ( rule__EffectFullFunctionDefinition__Arg2Assignment_5_1 ) )
            {
            // InternalFPML.g:3733:1: ( ( rule__EffectFullFunctionDefinition__Arg2Assignment_5_1 ) )
            // InternalFPML.g:3734:2: ( rule__EffectFullFunctionDefinition__Arg2Assignment_5_1 )
            {
             before(grammarAccess.getEffectFullFunctionDefinitionAccess().getArg2Assignment_5_1()); 
            // InternalFPML.g:3735:2: ( rule__EffectFullFunctionDefinition__Arg2Assignment_5_1 )
            // InternalFPML.g:3735:3: rule__EffectFullFunctionDefinition__Arg2Assignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__EffectFullFunctionDefinition__Arg2Assignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getEffectFullFunctionDefinitionAccess().getArg2Assignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunctionDefinition__Group_5__1__Impl"


    // $ANTLR start "rule__MainFunc__Group__0"
    // InternalFPML.g:3744:1: rule__MainFunc__Group__0 : rule__MainFunc__Group__0__Impl rule__MainFunc__Group__1 ;
    public final void rule__MainFunc__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3748:1: ( rule__MainFunc__Group__0__Impl rule__MainFunc__Group__1 )
            // InternalFPML.g:3749:2: rule__MainFunc__Group__0__Impl rule__MainFunc__Group__1
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
    // InternalFPML.g:3756:1: rule__MainFunc__Group__0__Impl : ( 'IO' ) ;
    public final void rule__MainFunc__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3760:1: ( ( 'IO' ) )
            // InternalFPML.g:3761:1: ( 'IO' )
            {
            // InternalFPML.g:3761:1: ( 'IO' )
            // InternalFPML.g:3762:2: 'IO'
            {
             before(grammarAccess.getMainFuncAccess().getIOKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalFPML.g:3771:1: rule__MainFunc__Group__1 : rule__MainFunc__Group__1__Impl rule__MainFunc__Group__2 ;
    public final void rule__MainFunc__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3775:1: ( rule__MainFunc__Group__1__Impl rule__MainFunc__Group__2 )
            // InternalFPML.g:3776:2: rule__MainFunc__Group__1__Impl rule__MainFunc__Group__2
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
    // InternalFPML.g:3783:1: rule__MainFunc__Group__1__Impl : ( ( rule__MainFunc__ReturnTypeAssignment_1 ) ) ;
    public final void rule__MainFunc__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3787:1: ( ( ( rule__MainFunc__ReturnTypeAssignment_1 ) ) )
            // InternalFPML.g:3788:1: ( ( rule__MainFunc__ReturnTypeAssignment_1 ) )
            {
            // InternalFPML.g:3788:1: ( ( rule__MainFunc__ReturnTypeAssignment_1 ) )
            // InternalFPML.g:3789:2: ( rule__MainFunc__ReturnTypeAssignment_1 )
            {
             before(grammarAccess.getMainFuncAccess().getReturnTypeAssignment_1()); 
            // InternalFPML.g:3790:2: ( rule__MainFunc__ReturnTypeAssignment_1 )
            // InternalFPML.g:3790:3: rule__MainFunc__ReturnTypeAssignment_1
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
    // InternalFPML.g:3798:1: rule__MainFunc__Group__2 : rule__MainFunc__Group__2__Impl rule__MainFunc__Group__3 ;
    public final void rule__MainFunc__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3802:1: ( rule__MainFunc__Group__2__Impl rule__MainFunc__Group__3 )
            // InternalFPML.g:3803:2: rule__MainFunc__Group__2__Impl rule__MainFunc__Group__3
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
    // InternalFPML.g:3810:1: rule__MainFunc__Group__2__Impl : ( 'main' ) ;
    public final void rule__MainFunc__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3814:1: ( ( 'main' ) )
            // InternalFPML.g:3815:1: ( 'main' )
            {
            // InternalFPML.g:3815:1: ( 'main' )
            // InternalFPML.g:3816:2: 'main'
            {
             before(grammarAccess.getMainFuncAccess().getMainKeyword_2()); 
            match(input,28,FOLLOW_2); 
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
    // InternalFPML.g:3825:1: rule__MainFunc__Group__3 : rule__MainFunc__Group__3__Impl rule__MainFunc__Group__4 ;
    public final void rule__MainFunc__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3829:1: ( rule__MainFunc__Group__3__Impl rule__MainFunc__Group__4 )
            // InternalFPML.g:3830:2: rule__MainFunc__Group__3__Impl rule__MainFunc__Group__4
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
    // InternalFPML.g:3837:1: rule__MainFunc__Group__3__Impl : ( ':' ) ;
    public final void rule__MainFunc__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3841:1: ( ( ':' ) )
            // InternalFPML.g:3842:1: ( ':' )
            {
            // InternalFPML.g:3842:1: ( ':' )
            // InternalFPML.g:3843:2: ':'
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
    // InternalFPML.g:3852:1: rule__MainFunc__Group__4 : rule__MainFunc__Group__4__Impl rule__MainFunc__Group__5 ;
    public final void rule__MainFunc__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3856:1: ( rule__MainFunc__Group__4__Impl rule__MainFunc__Group__5 )
            // InternalFPML.g:3857:2: rule__MainFunc__Group__4__Impl rule__MainFunc__Group__5
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
    // InternalFPML.g:3864:1: rule__MainFunc__Group__4__Impl : ( '{' ) ;
    public final void rule__MainFunc__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3868:1: ( ( '{' ) )
            // InternalFPML.g:3869:1: ( '{' )
            {
            // InternalFPML.g:3869:1: ( '{' )
            // InternalFPML.g:3870:2: '{'
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
    // InternalFPML.g:3879:1: rule__MainFunc__Group__5 : rule__MainFunc__Group__5__Impl rule__MainFunc__Group__6 ;
    public final void rule__MainFunc__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3883:1: ( rule__MainFunc__Group__5__Impl rule__MainFunc__Group__6 )
            // InternalFPML.g:3884:2: rule__MainFunc__Group__5__Impl rule__MainFunc__Group__6
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
    // InternalFPML.g:3891:1: rule__MainFunc__Group__5__Impl : ( ( rule__MainFunc__FunctionBodyAssignment_5 ) ) ;
    public final void rule__MainFunc__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3895:1: ( ( ( rule__MainFunc__FunctionBodyAssignment_5 ) ) )
            // InternalFPML.g:3896:1: ( ( rule__MainFunc__FunctionBodyAssignment_5 ) )
            {
            // InternalFPML.g:3896:1: ( ( rule__MainFunc__FunctionBodyAssignment_5 ) )
            // InternalFPML.g:3897:2: ( rule__MainFunc__FunctionBodyAssignment_5 )
            {
             before(grammarAccess.getMainFuncAccess().getFunctionBodyAssignment_5()); 
            // InternalFPML.g:3898:2: ( rule__MainFunc__FunctionBodyAssignment_5 )
            // InternalFPML.g:3898:3: rule__MainFunc__FunctionBodyAssignment_5
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
    // InternalFPML.g:3906:1: rule__MainFunc__Group__6 : rule__MainFunc__Group__6__Impl ;
    public final void rule__MainFunc__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3910:1: ( rule__MainFunc__Group__6__Impl )
            // InternalFPML.g:3911:2: rule__MainFunc__Group__6__Impl
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
    // InternalFPML.g:3917:1: rule__MainFunc__Group__6__Impl : ( '}' ) ;
    public final void rule__MainFunc__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3921:1: ( ( '}' ) )
            // InternalFPML.g:3922:1: ( '}' )
            {
            // InternalFPML.g:3922:1: ( '}' )
            // InternalFPML.g:3923:2: '}'
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
    // InternalFPML.g:3933:1: rule__EffectFullArgument__Group__0 : rule__EffectFullArgument__Group__0__Impl rule__EffectFullArgument__Group__1 ;
    public final void rule__EffectFullArgument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3937:1: ( rule__EffectFullArgument__Group__0__Impl rule__EffectFullArgument__Group__1 )
            // InternalFPML.g:3938:2: rule__EffectFullArgument__Group__0__Impl rule__EffectFullArgument__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalFPML.g:3945:1: rule__EffectFullArgument__Group__0__Impl : ( ( rule__EffectFullArgument__TypeAssignment_0 ) ) ;
    public final void rule__EffectFullArgument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3949:1: ( ( ( rule__EffectFullArgument__TypeAssignment_0 ) ) )
            // InternalFPML.g:3950:1: ( ( rule__EffectFullArgument__TypeAssignment_0 ) )
            {
            // InternalFPML.g:3950:1: ( ( rule__EffectFullArgument__TypeAssignment_0 ) )
            // InternalFPML.g:3951:2: ( rule__EffectFullArgument__TypeAssignment_0 )
            {
             before(grammarAccess.getEffectFullArgumentAccess().getTypeAssignment_0()); 
            // InternalFPML.g:3952:2: ( rule__EffectFullArgument__TypeAssignment_0 )
            // InternalFPML.g:3952:3: rule__EffectFullArgument__TypeAssignment_0
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
    // InternalFPML.g:3960:1: rule__EffectFullArgument__Group__1 : rule__EffectFullArgument__Group__1__Impl ;
    public final void rule__EffectFullArgument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3964:1: ( rule__EffectFullArgument__Group__1__Impl )
            // InternalFPML.g:3965:2: rule__EffectFullArgument__Group__1__Impl
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
    // InternalFPML.g:3971:1: rule__EffectFullArgument__Group__1__Impl : ( ( rule__EffectFullArgument__NameAssignment_1 ) ) ;
    public final void rule__EffectFullArgument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3975:1: ( ( ( rule__EffectFullArgument__NameAssignment_1 ) ) )
            // InternalFPML.g:3976:1: ( ( rule__EffectFullArgument__NameAssignment_1 ) )
            {
            // InternalFPML.g:3976:1: ( ( rule__EffectFullArgument__NameAssignment_1 ) )
            // InternalFPML.g:3977:2: ( rule__EffectFullArgument__NameAssignment_1 )
            {
             before(grammarAccess.getEffectFullArgumentAccess().getNameAssignment_1()); 
            // InternalFPML.g:3978:2: ( rule__EffectFullArgument__NameAssignment_1 )
            // InternalFPML.g:3978:3: rule__EffectFullArgument__NameAssignment_1
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
    // InternalFPML.g:3987:1: rule__Argument__Group__0 : rule__Argument__Group__0__Impl rule__Argument__Group__1 ;
    public final void rule__Argument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:3991:1: ( rule__Argument__Group__0__Impl rule__Argument__Group__1 )
            // InternalFPML.g:3992:2: rule__Argument__Group__0__Impl rule__Argument__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalFPML.g:3999:1: rule__Argument__Group__0__Impl : ( ( rule__Argument__TypeAssignment_0 ) ) ;
    public final void rule__Argument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4003:1: ( ( ( rule__Argument__TypeAssignment_0 ) ) )
            // InternalFPML.g:4004:1: ( ( rule__Argument__TypeAssignment_0 ) )
            {
            // InternalFPML.g:4004:1: ( ( rule__Argument__TypeAssignment_0 ) )
            // InternalFPML.g:4005:2: ( rule__Argument__TypeAssignment_0 )
            {
             before(grammarAccess.getArgumentAccess().getTypeAssignment_0()); 
            // InternalFPML.g:4006:2: ( rule__Argument__TypeAssignment_0 )
            // InternalFPML.g:4006:3: rule__Argument__TypeAssignment_0
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
    // InternalFPML.g:4014:1: rule__Argument__Group__1 : rule__Argument__Group__1__Impl ;
    public final void rule__Argument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4018:1: ( rule__Argument__Group__1__Impl )
            // InternalFPML.g:4019:2: rule__Argument__Group__1__Impl
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
    // InternalFPML.g:4025:1: rule__Argument__Group__1__Impl : ( ( rule__Argument__NameAssignment_1 ) ) ;
    public final void rule__Argument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4029:1: ( ( ( rule__Argument__NameAssignment_1 ) ) )
            // InternalFPML.g:4030:1: ( ( rule__Argument__NameAssignment_1 ) )
            {
            // InternalFPML.g:4030:1: ( ( rule__Argument__NameAssignment_1 ) )
            // InternalFPML.g:4031:2: ( rule__Argument__NameAssignment_1 )
            {
             before(grammarAccess.getArgumentAccess().getNameAssignment_1()); 
            // InternalFPML.g:4032:2: ( rule__Argument__NameAssignment_1 )
            // InternalFPML.g:4032:3: rule__Argument__NameAssignment_1
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
    // InternalFPML.g:4041:1: rule__EmptyFunctionBody__Group__0 : rule__EmptyFunctionBody__Group__0__Impl rule__EmptyFunctionBody__Group__1 ;
    public final void rule__EmptyFunctionBody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4045:1: ( rule__EmptyFunctionBody__Group__0__Impl rule__EmptyFunctionBody__Group__1 )
            // InternalFPML.g:4046:2: rule__EmptyFunctionBody__Group__0__Impl rule__EmptyFunctionBody__Group__1
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
    // InternalFPML.g:4053:1: rule__EmptyFunctionBody__Group__0__Impl : ( () ) ;
    public final void rule__EmptyFunctionBody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4057:1: ( ( () ) )
            // InternalFPML.g:4058:1: ( () )
            {
            // InternalFPML.g:4058:1: ( () )
            // InternalFPML.g:4059:2: ()
            {
             before(grammarAccess.getEmptyFunctionBodyAccess().getEmptyFunctionBodyAction_0()); 
            // InternalFPML.g:4060:2: ()
            // InternalFPML.g:4060:3: 
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
    // InternalFPML.g:4068:1: rule__EmptyFunctionBody__Group__1 : rule__EmptyFunctionBody__Group__1__Impl ;
    public final void rule__EmptyFunctionBody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4072:1: ( rule__EmptyFunctionBody__Group__1__Impl )
            // InternalFPML.g:4073:2: rule__EmptyFunctionBody__Group__1__Impl
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
    // InternalFPML.g:4079:1: rule__EmptyFunctionBody__Group__1__Impl : ( 'Undefined' ) ;
    public final void rule__EmptyFunctionBody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4083:1: ( ( 'Undefined' ) )
            // InternalFPML.g:4084:1: ( 'Undefined' )
            {
            // InternalFPML.g:4084:1: ( 'Undefined' )
            // InternalFPML.g:4085:2: 'Undefined'
            {
             before(grammarAccess.getEmptyFunctionBodyAccess().getUndefinedKeyword_1()); 
            match(input,29,FOLLOW_2); 
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
    // InternalFPML.g:4095:1: rule__CompositionFunctionBodyPure__Group_0__0 : rule__CompositionFunctionBodyPure__Group_0__0__Impl rule__CompositionFunctionBodyPure__Group_0__1 ;
    public final void rule__CompositionFunctionBodyPure__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4099:1: ( rule__CompositionFunctionBodyPure__Group_0__0__Impl rule__CompositionFunctionBodyPure__Group_0__1 )
            // InternalFPML.g:4100:2: rule__CompositionFunctionBodyPure__Group_0__0__Impl rule__CompositionFunctionBodyPure__Group_0__1
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
    // InternalFPML.g:4107:1: rule__CompositionFunctionBodyPure__Group_0__0__Impl : ( ( rule__CompositionFunctionBodyPure__ReferenceElementAssignment_0_0 ) ) ;
    public final void rule__CompositionFunctionBodyPure__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4111:1: ( ( ( rule__CompositionFunctionBodyPure__ReferenceElementAssignment_0_0 ) ) )
            // InternalFPML.g:4112:1: ( ( rule__CompositionFunctionBodyPure__ReferenceElementAssignment_0_0 ) )
            {
            // InternalFPML.g:4112:1: ( ( rule__CompositionFunctionBodyPure__ReferenceElementAssignment_0_0 ) )
            // InternalFPML.g:4113:2: ( rule__CompositionFunctionBodyPure__ReferenceElementAssignment_0_0 )
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getReferenceElementAssignment_0_0()); 
            // InternalFPML.g:4114:2: ( rule__CompositionFunctionBodyPure__ReferenceElementAssignment_0_0 )
            // InternalFPML.g:4114:3: rule__CompositionFunctionBodyPure__ReferenceElementAssignment_0_0
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
    // InternalFPML.g:4122:1: rule__CompositionFunctionBodyPure__Group_0__1 : rule__CompositionFunctionBodyPure__Group_0__1__Impl ;
    public final void rule__CompositionFunctionBodyPure__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4126:1: ( rule__CompositionFunctionBodyPure__Group_0__1__Impl )
            // InternalFPML.g:4127:2: rule__CompositionFunctionBodyPure__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositionFunctionBodyPure__Group_0__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalFPML.g:4133:1: rule__CompositionFunctionBodyPure__Group_0__1__Impl : ( ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 ) ) ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 )* ) ) ;
    public final void rule__CompositionFunctionBodyPure__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4137:1: ( ( ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 ) ) ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 )* ) ) )
            // InternalFPML.g:4138:1: ( ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 ) ) ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 )* ) )
            {
            // InternalFPML.g:4138:1: ( ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 ) ) ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 )* ) )
            // InternalFPML.g:4139:2: ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 ) ) ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 )* )
            {
            // InternalFPML.g:4139:2: ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 ) )
            // InternalFPML.g:4140:3: ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 )
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainAssignment_0_1()); 
            // InternalFPML.g:4141:3: ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 )
            // InternalFPML.g:4141:4: rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1
            {
            pushFollow(FOLLOW_31);
            rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainAssignment_0_1()); 

            }

            // InternalFPML.g:4144:2: ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 )* )
            // InternalFPML.g:4145:3: ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 )*
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainAssignment_0_1()); 
            // InternalFPML.g:4146:3: ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==30) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalFPML.g:4146:4: rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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


    // $ANTLR start "rule__CompositionFunctionBodyPure__Group_1__0"
    // InternalFPML.g:4156:1: rule__CompositionFunctionBodyPure__Group_1__0 : rule__CompositionFunctionBodyPure__Group_1__0__Impl rule__CompositionFunctionBodyPure__Group_1__1 ;
    public final void rule__CompositionFunctionBodyPure__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4160:1: ( rule__CompositionFunctionBodyPure__Group_1__0__Impl rule__CompositionFunctionBodyPure__Group_1__1 )
            // InternalFPML.g:4161:2: rule__CompositionFunctionBodyPure__Group_1__0__Impl rule__CompositionFunctionBodyPure__Group_1__1
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
    // InternalFPML.g:4168:1: rule__CompositionFunctionBodyPure__Group_1__0__Impl : ( ( rule__CompositionFunctionBodyPure__PrimitiveElementAssignment_1_0 ) ) ;
    public final void rule__CompositionFunctionBodyPure__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4172:1: ( ( ( rule__CompositionFunctionBodyPure__PrimitiveElementAssignment_1_0 ) ) )
            // InternalFPML.g:4173:1: ( ( rule__CompositionFunctionBodyPure__PrimitiveElementAssignment_1_0 ) )
            {
            // InternalFPML.g:4173:1: ( ( rule__CompositionFunctionBodyPure__PrimitiveElementAssignment_1_0 ) )
            // InternalFPML.g:4174:2: ( rule__CompositionFunctionBodyPure__PrimitiveElementAssignment_1_0 )
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getPrimitiveElementAssignment_1_0()); 
            // InternalFPML.g:4175:2: ( rule__CompositionFunctionBodyPure__PrimitiveElementAssignment_1_0 )
            // InternalFPML.g:4175:3: rule__CompositionFunctionBodyPure__PrimitiveElementAssignment_1_0
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
    // InternalFPML.g:4183:1: rule__CompositionFunctionBodyPure__Group_1__1 : rule__CompositionFunctionBodyPure__Group_1__1__Impl ;
    public final void rule__CompositionFunctionBodyPure__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4187:1: ( rule__CompositionFunctionBodyPure__Group_1__1__Impl )
            // InternalFPML.g:4188:2: rule__CompositionFunctionBodyPure__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositionFunctionBodyPure__Group_1__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalFPML.g:4194:1: rule__CompositionFunctionBodyPure__Group_1__1__Impl : ( ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 ) ) ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 )* ) ) ;
    public final void rule__CompositionFunctionBodyPure__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4198:1: ( ( ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 ) ) ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 )* ) ) )
            // InternalFPML.g:4199:1: ( ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 ) ) ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 )* ) )
            {
            // InternalFPML.g:4199:1: ( ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 ) ) ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 )* ) )
            // InternalFPML.g:4200:2: ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 ) ) ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 )* )
            {
            // InternalFPML.g:4200:2: ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 ) )
            // InternalFPML.g:4201:3: ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 )
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainAssignment_1_1()); 
            // InternalFPML.g:4202:3: ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 )
            // InternalFPML.g:4202:4: rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1
            {
            pushFollow(FOLLOW_31);
            rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainAssignment_1_1()); 

            }

            // InternalFPML.g:4205:2: ( ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 )* )
            // InternalFPML.g:4206:3: ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 )*
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getFunctionChainAssignment_1_1()); 
            // InternalFPML.g:4207:3: ( rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==30) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalFPML.g:4207:4: rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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


    // $ANTLR start "rule__CompositionFunctionBodyPureFactor__Group_0__0"
    // InternalFPML.g:4217:1: rule__CompositionFunctionBodyPureFactor__Group_0__0 : rule__CompositionFunctionBodyPureFactor__Group_0__0__Impl rule__CompositionFunctionBodyPureFactor__Group_0__1 ;
    public final void rule__CompositionFunctionBodyPureFactor__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4221:1: ( rule__CompositionFunctionBodyPureFactor__Group_0__0__Impl rule__CompositionFunctionBodyPureFactor__Group_0__1 )
            // InternalFPML.g:4222:2: rule__CompositionFunctionBodyPureFactor__Group_0__0__Impl rule__CompositionFunctionBodyPureFactor__Group_0__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalFPML.g:4229:1: rule__CompositionFunctionBodyPureFactor__Group_0__0__Impl : ( '|>' ) ;
    public final void rule__CompositionFunctionBodyPureFactor__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4233:1: ( ( '|>' ) )
            // InternalFPML.g:4234:1: ( '|>' )
            {
            // InternalFPML.g:4234:1: ( '|>' )
            // InternalFPML.g:4235:2: '|>'
            {
             before(grammarAccess.getCompositionFunctionBodyPureFactorAccess().getVerticalLineGreaterThanSignKeyword_0_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalFPML.g:4244:1: rule__CompositionFunctionBodyPureFactor__Group_0__1 : rule__CompositionFunctionBodyPureFactor__Group_0__1__Impl ;
    public final void rule__CompositionFunctionBodyPureFactor__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4248:1: ( rule__CompositionFunctionBodyPureFactor__Group_0__1__Impl )
            // InternalFPML.g:4249:2: rule__CompositionFunctionBodyPureFactor__Group_0__1__Impl
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
    // InternalFPML.g:4255:1: rule__CompositionFunctionBodyPureFactor__Group_0__1__Impl : ( ( rule__CompositionFunctionBodyPureFactor__ReferenceElementAssignment_0_1 ) ) ;
    public final void rule__CompositionFunctionBodyPureFactor__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4259:1: ( ( ( rule__CompositionFunctionBodyPureFactor__ReferenceElementAssignment_0_1 ) ) )
            // InternalFPML.g:4260:1: ( ( rule__CompositionFunctionBodyPureFactor__ReferenceElementAssignment_0_1 ) )
            {
            // InternalFPML.g:4260:1: ( ( rule__CompositionFunctionBodyPureFactor__ReferenceElementAssignment_0_1 ) )
            // InternalFPML.g:4261:2: ( rule__CompositionFunctionBodyPureFactor__ReferenceElementAssignment_0_1 )
            {
             before(grammarAccess.getCompositionFunctionBodyPureFactorAccess().getReferenceElementAssignment_0_1()); 
            // InternalFPML.g:4262:2: ( rule__CompositionFunctionBodyPureFactor__ReferenceElementAssignment_0_1 )
            // InternalFPML.g:4262:3: rule__CompositionFunctionBodyPureFactor__ReferenceElementAssignment_0_1
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
    // InternalFPML.g:4271:1: rule__CompositionFunctionBodyPureFactor__Group_1__0 : rule__CompositionFunctionBodyPureFactor__Group_1__0__Impl rule__CompositionFunctionBodyPureFactor__Group_1__1 ;
    public final void rule__CompositionFunctionBodyPureFactor__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4275:1: ( rule__CompositionFunctionBodyPureFactor__Group_1__0__Impl rule__CompositionFunctionBodyPureFactor__Group_1__1 )
            // InternalFPML.g:4276:2: rule__CompositionFunctionBodyPureFactor__Group_1__0__Impl rule__CompositionFunctionBodyPureFactor__Group_1__1
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
    // InternalFPML.g:4283:1: rule__CompositionFunctionBodyPureFactor__Group_1__0__Impl : ( '|>' ) ;
    public final void rule__CompositionFunctionBodyPureFactor__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4287:1: ( ( '|>' ) )
            // InternalFPML.g:4288:1: ( '|>' )
            {
            // InternalFPML.g:4288:1: ( '|>' )
            // InternalFPML.g:4289:2: '|>'
            {
             before(grammarAccess.getCompositionFunctionBodyPureFactorAccess().getVerticalLineGreaterThanSignKeyword_1_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalFPML.g:4298:1: rule__CompositionFunctionBodyPureFactor__Group_1__1 : rule__CompositionFunctionBodyPureFactor__Group_1__1__Impl ;
    public final void rule__CompositionFunctionBodyPureFactor__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4302:1: ( rule__CompositionFunctionBodyPureFactor__Group_1__1__Impl )
            // InternalFPML.g:4303:2: rule__CompositionFunctionBodyPureFactor__Group_1__1__Impl
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
    // InternalFPML.g:4309:1: rule__CompositionFunctionBodyPureFactor__Group_1__1__Impl : ( ( rule__CompositionFunctionBodyPureFactor__PrimitiveElementAssignment_1_1 ) ) ;
    public final void rule__CompositionFunctionBodyPureFactor__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4313:1: ( ( ( rule__CompositionFunctionBodyPureFactor__PrimitiveElementAssignment_1_1 ) ) )
            // InternalFPML.g:4314:1: ( ( rule__CompositionFunctionBodyPureFactor__PrimitiveElementAssignment_1_1 ) )
            {
            // InternalFPML.g:4314:1: ( ( rule__CompositionFunctionBodyPureFactor__PrimitiveElementAssignment_1_1 ) )
            // InternalFPML.g:4315:2: ( rule__CompositionFunctionBodyPureFactor__PrimitiveElementAssignment_1_1 )
            {
             before(grammarAccess.getCompositionFunctionBodyPureFactorAccess().getPrimitiveElementAssignment_1_1()); 
            // InternalFPML.g:4316:2: ( rule__CompositionFunctionBodyPureFactor__PrimitiveElementAssignment_1_1 )
            // InternalFPML.g:4316:3: rule__CompositionFunctionBodyPureFactor__PrimitiveElementAssignment_1_1
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
    // InternalFPML.g:4325:1: rule__CompositionFunctionBodyEffect__Group_0__0 : rule__CompositionFunctionBodyEffect__Group_0__0__Impl rule__CompositionFunctionBodyEffect__Group_0__1 ;
    public final void rule__CompositionFunctionBodyEffect__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4329:1: ( rule__CompositionFunctionBodyEffect__Group_0__0__Impl rule__CompositionFunctionBodyEffect__Group_0__1 )
            // InternalFPML.g:4330:2: rule__CompositionFunctionBodyEffect__Group_0__0__Impl rule__CompositionFunctionBodyEffect__Group_0__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalFPML.g:4337:1: rule__CompositionFunctionBodyEffect__Group_0__0__Impl : ( ( rule__CompositionFunctionBodyEffect__ReferenceElementAssignment_0_0 ) ) ;
    public final void rule__CompositionFunctionBodyEffect__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4341:1: ( ( ( rule__CompositionFunctionBodyEffect__ReferenceElementAssignment_0_0 ) ) )
            // InternalFPML.g:4342:1: ( ( rule__CompositionFunctionBodyEffect__ReferenceElementAssignment_0_0 ) )
            {
            // InternalFPML.g:4342:1: ( ( rule__CompositionFunctionBodyEffect__ReferenceElementAssignment_0_0 ) )
            // InternalFPML.g:4343:2: ( rule__CompositionFunctionBodyEffect__ReferenceElementAssignment_0_0 )
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getReferenceElementAssignment_0_0()); 
            // InternalFPML.g:4344:2: ( rule__CompositionFunctionBodyEffect__ReferenceElementAssignment_0_0 )
            // InternalFPML.g:4344:3: rule__CompositionFunctionBodyEffect__ReferenceElementAssignment_0_0
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
    // InternalFPML.g:4352:1: rule__CompositionFunctionBodyEffect__Group_0__1 : rule__CompositionFunctionBodyEffect__Group_0__1__Impl ;
    public final void rule__CompositionFunctionBodyEffect__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4356:1: ( rule__CompositionFunctionBodyEffect__Group_0__1__Impl )
            // InternalFPML.g:4357:2: rule__CompositionFunctionBodyEffect__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositionFunctionBodyEffect__Group_0__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalFPML.g:4363:1: rule__CompositionFunctionBodyEffect__Group_0__1__Impl : ( ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 ) ) ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 )* ) ) ;
    public final void rule__CompositionFunctionBodyEffect__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4367:1: ( ( ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 ) ) ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 )* ) ) )
            // InternalFPML.g:4368:1: ( ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 ) ) ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 )* ) )
            {
            // InternalFPML.g:4368:1: ( ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 ) ) ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 )* ) )
            // InternalFPML.g:4369:2: ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 ) ) ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 )* )
            {
            // InternalFPML.g:4369:2: ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 ) )
            // InternalFPML.g:4370:3: ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 )
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainAssignment_0_1()); 
            // InternalFPML.g:4371:3: ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 )
            // InternalFPML.g:4371:4: rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1
            {
            pushFollow(FOLLOW_33);
            rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainAssignment_0_1()); 

            }

            // InternalFPML.g:4374:2: ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 )* )
            // InternalFPML.g:4375:3: ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 )*
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainAssignment_0_1()); 
            // InternalFPML.g:4376:3: ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==31) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalFPML.g:4376:4: rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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


    // $ANTLR start "rule__CompositionFunctionBodyEffect__Group_1__0"
    // InternalFPML.g:4386:1: rule__CompositionFunctionBodyEffect__Group_1__0 : rule__CompositionFunctionBodyEffect__Group_1__0__Impl rule__CompositionFunctionBodyEffect__Group_1__1 ;
    public final void rule__CompositionFunctionBodyEffect__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4390:1: ( rule__CompositionFunctionBodyEffect__Group_1__0__Impl rule__CompositionFunctionBodyEffect__Group_1__1 )
            // InternalFPML.g:4391:2: rule__CompositionFunctionBodyEffect__Group_1__0__Impl rule__CompositionFunctionBodyEffect__Group_1__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalFPML.g:4398:1: rule__CompositionFunctionBodyEffect__Group_1__0__Impl : ( ( rule__CompositionFunctionBodyEffect__PrimitiveElementAssignment_1_0 ) ) ;
    public final void rule__CompositionFunctionBodyEffect__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4402:1: ( ( ( rule__CompositionFunctionBodyEffect__PrimitiveElementAssignment_1_0 ) ) )
            // InternalFPML.g:4403:1: ( ( rule__CompositionFunctionBodyEffect__PrimitiveElementAssignment_1_0 ) )
            {
            // InternalFPML.g:4403:1: ( ( rule__CompositionFunctionBodyEffect__PrimitiveElementAssignment_1_0 ) )
            // InternalFPML.g:4404:2: ( rule__CompositionFunctionBodyEffect__PrimitiveElementAssignment_1_0 )
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getPrimitiveElementAssignment_1_0()); 
            // InternalFPML.g:4405:2: ( rule__CompositionFunctionBodyEffect__PrimitiveElementAssignment_1_0 )
            // InternalFPML.g:4405:3: rule__CompositionFunctionBodyEffect__PrimitiveElementAssignment_1_0
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
    // InternalFPML.g:4413:1: rule__CompositionFunctionBodyEffect__Group_1__1 : rule__CompositionFunctionBodyEffect__Group_1__1__Impl ;
    public final void rule__CompositionFunctionBodyEffect__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4417:1: ( rule__CompositionFunctionBodyEffect__Group_1__1__Impl )
            // InternalFPML.g:4418:2: rule__CompositionFunctionBodyEffect__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositionFunctionBodyEffect__Group_1__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalFPML.g:4424:1: rule__CompositionFunctionBodyEffect__Group_1__1__Impl : ( ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 ) ) ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 )* ) ) ;
    public final void rule__CompositionFunctionBodyEffect__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4428:1: ( ( ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 ) ) ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 )* ) ) )
            // InternalFPML.g:4429:1: ( ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 ) ) ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 )* ) )
            {
            // InternalFPML.g:4429:1: ( ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 ) ) ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 )* ) )
            // InternalFPML.g:4430:2: ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 ) ) ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 )* )
            {
            // InternalFPML.g:4430:2: ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 ) )
            // InternalFPML.g:4431:3: ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 )
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainAssignment_1_1()); 
            // InternalFPML.g:4432:3: ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 )
            // InternalFPML.g:4432:4: rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1
            {
            pushFollow(FOLLOW_33);
            rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainAssignment_1_1()); 

            }

            // InternalFPML.g:4435:2: ( ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 )* )
            // InternalFPML.g:4436:3: ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 )*
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getFunctionChainAssignment_1_1()); 
            // InternalFPML.g:4437:3: ( rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==31) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalFPML.g:4437:4: rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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


    // $ANTLR start "rule__CompositionFunctionBodyEffectFullFactor__Group_0__0"
    // InternalFPML.g:4447:1: rule__CompositionFunctionBodyEffectFullFactor__Group_0__0 : rule__CompositionFunctionBodyEffectFullFactor__Group_0__0__Impl rule__CompositionFunctionBodyEffectFullFactor__Group_0__1 ;
    public final void rule__CompositionFunctionBodyEffectFullFactor__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4451:1: ( rule__CompositionFunctionBodyEffectFullFactor__Group_0__0__Impl rule__CompositionFunctionBodyEffectFullFactor__Group_0__1 )
            // InternalFPML.g:4452:2: rule__CompositionFunctionBodyEffectFullFactor__Group_0__0__Impl rule__CompositionFunctionBodyEffectFullFactor__Group_0__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalFPML.g:4459:1: rule__CompositionFunctionBodyEffectFullFactor__Group_0__0__Impl : ( '>>=' ) ;
    public final void rule__CompositionFunctionBodyEffectFullFactor__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4463:1: ( ( '>>=' ) )
            // InternalFPML.g:4464:1: ( '>>=' )
            {
            // InternalFPML.g:4464:1: ( '>>=' )
            // InternalFPML.g:4465:2: '>>='
            {
             before(grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getGreaterThanSignGreaterThanSignEqualsSignKeyword_0_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalFPML.g:4474:1: rule__CompositionFunctionBodyEffectFullFactor__Group_0__1 : rule__CompositionFunctionBodyEffectFullFactor__Group_0__1__Impl ;
    public final void rule__CompositionFunctionBodyEffectFullFactor__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4478:1: ( rule__CompositionFunctionBodyEffectFullFactor__Group_0__1__Impl )
            // InternalFPML.g:4479:2: rule__CompositionFunctionBodyEffectFullFactor__Group_0__1__Impl
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
    // InternalFPML.g:4485:1: rule__CompositionFunctionBodyEffectFullFactor__Group_0__1__Impl : ( ( rule__CompositionFunctionBodyEffectFullFactor__ReferenceElementAssignment_0_1 ) ) ;
    public final void rule__CompositionFunctionBodyEffectFullFactor__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4489:1: ( ( ( rule__CompositionFunctionBodyEffectFullFactor__ReferenceElementAssignment_0_1 ) ) )
            // InternalFPML.g:4490:1: ( ( rule__CompositionFunctionBodyEffectFullFactor__ReferenceElementAssignment_0_1 ) )
            {
            // InternalFPML.g:4490:1: ( ( rule__CompositionFunctionBodyEffectFullFactor__ReferenceElementAssignment_0_1 ) )
            // InternalFPML.g:4491:2: ( rule__CompositionFunctionBodyEffectFullFactor__ReferenceElementAssignment_0_1 )
            {
             before(grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getReferenceElementAssignment_0_1()); 
            // InternalFPML.g:4492:2: ( rule__CompositionFunctionBodyEffectFullFactor__ReferenceElementAssignment_0_1 )
            // InternalFPML.g:4492:3: rule__CompositionFunctionBodyEffectFullFactor__ReferenceElementAssignment_0_1
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
    // InternalFPML.g:4501:1: rule__CompositionFunctionBodyEffectFullFactor__Group_1__0 : rule__CompositionFunctionBodyEffectFullFactor__Group_1__0__Impl rule__CompositionFunctionBodyEffectFullFactor__Group_1__1 ;
    public final void rule__CompositionFunctionBodyEffectFullFactor__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4505:1: ( rule__CompositionFunctionBodyEffectFullFactor__Group_1__0__Impl rule__CompositionFunctionBodyEffectFullFactor__Group_1__1 )
            // InternalFPML.g:4506:2: rule__CompositionFunctionBodyEffectFullFactor__Group_1__0__Impl rule__CompositionFunctionBodyEffectFullFactor__Group_1__1
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
    // InternalFPML.g:4513:1: rule__CompositionFunctionBodyEffectFullFactor__Group_1__0__Impl : ( '>>=' ) ;
    public final void rule__CompositionFunctionBodyEffectFullFactor__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4517:1: ( ( '>>=' ) )
            // InternalFPML.g:4518:1: ( '>>=' )
            {
            // InternalFPML.g:4518:1: ( '>>=' )
            // InternalFPML.g:4519:2: '>>='
            {
             before(grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getGreaterThanSignGreaterThanSignEqualsSignKeyword_1_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalFPML.g:4528:1: rule__CompositionFunctionBodyEffectFullFactor__Group_1__1 : rule__CompositionFunctionBodyEffectFullFactor__Group_1__1__Impl ;
    public final void rule__CompositionFunctionBodyEffectFullFactor__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4532:1: ( rule__CompositionFunctionBodyEffectFullFactor__Group_1__1__Impl )
            // InternalFPML.g:4533:2: rule__CompositionFunctionBodyEffectFullFactor__Group_1__1__Impl
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
    // InternalFPML.g:4539:1: rule__CompositionFunctionBodyEffectFullFactor__Group_1__1__Impl : ( ( rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAssignment_1_1 ) ) ;
    public final void rule__CompositionFunctionBodyEffectFullFactor__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4543:1: ( ( ( rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAssignment_1_1 ) ) )
            // InternalFPML.g:4544:1: ( ( rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAssignment_1_1 ) )
            {
            // InternalFPML.g:4544:1: ( ( rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAssignment_1_1 ) )
            // InternalFPML.g:4545:2: ( rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAssignment_1_1 )
            {
             before(grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getPrimitiveElementAssignment_1_1()); 
            // InternalFPML.g:4546:2: ( rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAssignment_1_1 )
            // InternalFPML.g:4546:3: rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAssignment_1_1
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


    // $ANTLR start "rule__IOType__Group__0"
    // InternalFPML.g:4555:1: rule__IOType__Group__0 : rule__IOType__Group__0__Impl rule__IOType__Group__1 ;
    public final void rule__IOType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4559:1: ( rule__IOType__Group__0__Impl rule__IOType__Group__1 )
            // InternalFPML.g:4560:2: rule__IOType__Group__0__Impl rule__IOType__Group__1
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
    // InternalFPML.g:4567:1: rule__IOType__Group__0__Impl : ( 'IO' ) ;
    public final void rule__IOType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4571:1: ( ( 'IO' ) )
            // InternalFPML.g:4572:1: ( 'IO' )
            {
            // InternalFPML.g:4572:1: ( 'IO' )
            // InternalFPML.g:4573:2: 'IO'
            {
             before(grammarAccess.getIOTypeAccess().getIOKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalFPML.g:4582:1: rule__IOType__Group__1 : rule__IOType__Group__1__Impl ;
    public final void rule__IOType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4586:1: ( rule__IOType__Group__1__Impl )
            // InternalFPML.g:4587:2: rule__IOType__Group__1__Impl
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
    // InternalFPML.g:4593:1: rule__IOType__Group__1__Impl : ( ( rule__IOType__TypeAssignment_1 ) ) ;
    public final void rule__IOType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4597:1: ( ( ( rule__IOType__TypeAssignment_1 ) ) )
            // InternalFPML.g:4598:1: ( ( rule__IOType__TypeAssignment_1 ) )
            {
            // InternalFPML.g:4598:1: ( ( rule__IOType__TypeAssignment_1 ) )
            // InternalFPML.g:4599:2: ( rule__IOType__TypeAssignment_1 )
            {
             before(grammarAccess.getIOTypeAccess().getTypeAssignment_1()); 
            // InternalFPML.g:4600:2: ( rule__IOType__TypeAssignment_1 )
            // InternalFPML.g:4600:3: rule__IOType__TypeAssignment_1
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
    // InternalFPML.g:4609:1: rule__IntegerType__Group__0 : rule__IntegerType__Group__0__Impl rule__IntegerType__Group__1 ;
    public final void rule__IntegerType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4613:1: ( rule__IntegerType__Group__0__Impl rule__IntegerType__Group__1 )
            // InternalFPML.g:4614:2: rule__IntegerType__Group__0__Impl rule__IntegerType__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalFPML.g:4621:1: rule__IntegerType__Group__0__Impl : ( () ) ;
    public final void rule__IntegerType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4625:1: ( ( () ) )
            // InternalFPML.g:4626:1: ( () )
            {
            // InternalFPML.g:4626:1: ( () )
            // InternalFPML.g:4627:2: ()
            {
             before(grammarAccess.getIntegerTypeAccess().getIntegerTypeAction_0()); 
            // InternalFPML.g:4628:2: ()
            // InternalFPML.g:4628:3: 
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
    // InternalFPML.g:4636:1: rule__IntegerType__Group__1 : rule__IntegerType__Group__1__Impl ;
    public final void rule__IntegerType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4640:1: ( rule__IntegerType__Group__1__Impl )
            // InternalFPML.g:4641:2: rule__IntegerType__Group__1__Impl
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
    // InternalFPML.g:4647:1: rule__IntegerType__Group__1__Impl : ( ( rule__IntegerType__TypeAssignment_1 ) ) ;
    public final void rule__IntegerType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4651:1: ( ( ( rule__IntegerType__TypeAssignment_1 ) ) )
            // InternalFPML.g:4652:1: ( ( rule__IntegerType__TypeAssignment_1 ) )
            {
            // InternalFPML.g:4652:1: ( ( rule__IntegerType__TypeAssignment_1 ) )
            // InternalFPML.g:4653:2: ( rule__IntegerType__TypeAssignment_1 )
            {
             before(grammarAccess.getIntegerTypeAccess().getTypeAssignment_1()); 
            // InternalFPML.g:4654:2: ( rule__IntegerType__TypeAssignment_1 )
            // InternalFPML.g:4654:3: rule__IntegerType__TypeAssignment_1
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
    // InternalFPML.g:4663:1: rule__StringType__Group__0 : rule__StringType__Group__0__Impl rule__StringType__Group__1 ;
    public final void rule__StringType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4667:1: ( rule__StringType__Group__0__Impl rule__StringType__Group__1 )
            // InternalFPML.g:4668:2: rule__StringType__Group__0__Impl rule__StringType__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalFPML.g:4675:1: rule__StringType__Group__0__Impl : ( () ) ;
    public final void rule__StringType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4679:1: ( ( () ) )
            // InternalFPML.g:4680:1: ( () )
            {
            // InternalFPML.g:4680:1: ( () )
            // InternalFPML.g:4681:2: ()
            {
             before(grammarAccess.getStringTypeAccess().getStringTypeAction_0()); 
            // InternalFPML.g:4682:2: ()
            // InternalFPML.g:4682:3: 
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
    // InternalFPML.g:4690:1: rule__StringType__Group__1 : rule__StringType__Group__1__Impl ;
    public final void rule__StringType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4694:1: ( rule__StringType__Group__1__Impl )
            // InternalFPML.g:4695:2: rule__StringType__Group__1__Impl
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
    // InternalFPML.g:4701:1: rule__StringType__Group__1__Impl : ( ( rule__StringType__TypeAssignment_1 ) ) ;
    public final void rule__StringType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4705:1: ( ( ( rule__StringType__TypeAssignment_1 ) ) )
            // InternalFPML.g:4706:1: ( ( rule__StringType__TypeAssignment_1 ) )
            {
            // InternalFPML.g:4706:1: ( ( rule__StringType__TypeAssignment_1 ) )
            // InternalFPML.g:4707:2: ( rule__StringType__TypeAssignment_1 )
            {
             before(grammarAccess.getStringTypeAccess().getTypeAssignment_1()); 
            // InternalFPML.g:4708:2: ( rule__StringType__TypeAssignment_1 )
            // InternalFPML.g:4708:3: rule__StringType__TypeAssignment_1
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
    // InternalFPML.g:4717:1: rule__UnitType__Group__0 : rule__UnitType__Group__0__Impl rule__UnitType__Group__1 ;
    public final void rule__UnitType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4721:1: ( rule__UnitType__Group__0__Impl rule__UnitType__Group__1 )
            // InternalFPML.g:4722:2: rule__UnitType__Group__0__Impl rule__UnitType__Group__1
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
    // InternalFPML.g:4729:1: rule__UnitType__Group__0__Impl : ( () ) ;
    public final void rule__UnitType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4733:1: ( ( () ) )
            // InternalFPML.g:4734:1: ( () )
            {
            // InternalFPML.g:4734:1: ( () )
            // InternalFPML.g:4735:2: ()
            {
             before(grammarAccess.getUnitTypeAccess().getUnitTypeAction_0()); 
            // InternalFPML.g:4736:2: ()
            // InternalFPML.g:4736:3: 
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
    // InternalFPML.g:4744:1: rule__UnitType__Group__1 : rule__UnitType__Group__1__Impl ;
    public final void rule__UnitType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4748:1: ( rule__UnitType__Group__1__Impl )
            // InternalFPML.g:4749:2: rule__UnitType__Group__1__Impl
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
    // InternalFPML.g:4755:1: rule__UnitType__Group__1__Impl : ( ( rule__UnitType__TypeAssignment_1 ) ) ;
    public final void rule__UnitType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4759:1: ( ( ( rule__UnitType__TypeAssignment_1 ) ) )
            // InternalFPML.g:4760:1: ( ( rule__UnitType__TypeAssignment_1 ) )
            {
            // InternalFPML.g:4760:1: ( ( rule__UnitType__TypeAssignment_1 ) )
            // InternalFPML.g:4761:2: ( rule__UnitType__TypeAssignment_1 )
            {
             before(grammarAccess.getUnitTypeAccess().getTypeAssignment_1()); 
            // InternalFPML.g:4762:2: ( rule__UnitType__TypeAssignment_1 )
            // InternalFPML.g:4762:3: rule__UnitType__TypeAssignment_1
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
    // InternalFPML.g:4771:1: rule__DataType__Group__0 : rule__DataType__Group__0__Impl rule__DataType__Group__1 ;
    public final void rule__DataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4775:1: ( rule__DataType__Group__0__Impl rule__DataType__Group__1 )
            // InternalFPML.g:4776:2: rule__DataType__Group__0__Impl rule__DataType__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalFPML.g:4783:1: rule__DataType__Group__0__Impl : ( () ) ;
    public final void rule__DataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4787:1: ( ( () ) )
            // InternalFPML.g:4788:1: ( () )
            {
            // InternalFPML.g:4788:1: ( () )
            // InternalFPML.g:4789:2: ()
            {
             before(grammarAccess.getDataTypeAccess().getDataTypeAction_0()); 
            // InternalFPML.g:4790:2: ()
            // InternalFPML.g:4790:3: 
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
    // InternalFPML.g:4798:1: rule__DataType__Group__1 : rule__DataType__Group__1__Impl rule__DataType__Group__2 ;
    public final void rule__DataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4802:1: ( rule__DataType__Group__1__Impl rule__DataType__Group__2 )
            // InternalFPML.g:4803:2: rule__DataType__Group__1__Impl rule__DataType__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalFPML.g:4810:1: rule__DataType__Group__1__Impl : ( 'ref' ) ;
    public final void rule__DataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4814:1: ( ( 'ref' ) )
            // InternalFPML.g:4815:1: ( 'ref' )
            {
            // InternalFPML.g:4815:1: ( 'ref' )
            // InternalFPML.g:4816:2: 'ref'
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
    // InternalFPML.g:4825:1: rule__DataType__Group__2 : rule__DataType__Group__2__Impl ;
    public final void rule__DataType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4829:1: ( rule__DataType__Group__2__Impl )
            // InternalFPML.g:4830:2: rule__DataType__Group__2__Impl
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
    // InternalFPML.g:4836:1: rule__DataType__Group__2__Impl : ( ( rule__DataType__TypeAssignment_2 ) ) ;
    public final void rule__DataType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4840:1: ( ( ( rule__DataType__TypeAssignment_2 ) ) )
            // InternalFPML.g:4841:1: ( ( rule__DataType__TypeAssignment_2 ) )
            {
            // InternalFPML.g:4841:1: ( ( rule__DataType__TypeAssignment_2 ) )
            // InternalFPML.g:4842:2: ( rule__DataType__TypeAssignment_2 )
            {
             before(grammarAccess.getDataTypeAccess().getTypeAssignment_2()); 
            // InternalFPML.g:4843:2: ( rule__DataType__TypeAssignment_2 )
            // InternalFPML.g:4843:3: rule__DataType__TypeAssignment_2
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
    // InternalFPML.g:4852:1: rule__PureFunctionType__Group__0 : rule__PureFunctionType__Group__0__Impl rule__PureFunctionType__Group__1 ;
    public final void rule__PureFunctionType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4856:1: ( rule__PureFunctionType__Group__0__Impl rule__PureFunctionType__Group__1 )
            // InternalFPML.g:4857:2: rule__PureFunctionType__Group__0__Impl rule__PureFunctionType__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalFPML.g:4864:1: rule__PureFunctionType__Group__0__Impl : ( () ) ;
    public final void rule__PureFunctionType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4868:1: ( ( () ) )
            // InternalFPML.g:4869:1: ( () )
            {
            // InternalFPML.g:4869:1: ( () )
            // InternalFPML.g:4870:2: ()
            {
             before(grammarAccess.getPureFunctionTypeAccess().getPureFunctionTypeAction_0()); 
            // InternalFPML.g:4871:2: ()
            // InternalFPML.g:4871:3: 
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
    // InternalFPML.g:4879:1: rule__PureFunctionType__Group__1 : rule__PureFunctionType__Group__1__Impl rule__PureFunctionType__Group__2 ;
    public final void rule__PureFunctionType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4883:1: ( rule__PureFunctionType__Group__1__Impl rule__PureFunctionType__Group__2 )
            // InternalFPML.g:4884:2: rule__PureFunctionType__Group__1__Impl rule__PureFunctionType__Group__2
            {
            pushFollow(FOLLOW_37);
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
    // InternalFPML.g:4891:1: rule__PureFunctionType__Group__1__Impl : ( 'F' ) ;
    public final void rule__PureFunctionType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4895:1: ( ( 'F' ) )
            // InternalFPML.g:4896:1: ( 'F' )
            {
            // InternalFPML.g:4896:1: ( 'F' )
            // InternalFPML.g:4897:2: 'F'
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
    // InternalFPML.g:4906:1: rule__PureFunctionType__Group__2 : rule__PureFunctionType__Group__2__Impl rule__PureFunctionType__Group__3 ;
    public final void rule__PureFunctionType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4910:1: ( rule__PureFunctionType__Group__2__Impl rule__PureFunctionType__Group__3 )
            // InternalFPML.g:4911:2: rule__PureFunctionType__Group__2__Impl rule__PureFunctionType__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalFPML.g:4918:1: rule__PureFunctionType__Group__2__Impl : ( '<' ) ;
    public final void rule__PureFunctionType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4922:1: ( ( '<' ) )
            // InternalFPML.g:4923:1: ( '<' )
            {
            // InternalFPML.g:4923:1: ( '<' )
            // InternalFPML.g:4924:2: '<'
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
    // InternalFPML.g:4933:1: rule__PureFunctionType__Group__3 : rule__PureFunctionType__Group__3__Impl rule__PureFunctionType__Group__4 ;
    public final void rule__PureFunctionType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4937:1: ( rule__PureFunctionType__Group__3__Impl rule__PureFunctionType__Group__4 )
            // InternalFPML.g:4938:2: rule__PureFunctionType__Group__3__Impl rule__PureFunctionType__Group__4
            {
            pushFollow(FOLLOW_38);
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
    // InternalFPML.g:4945:1: rule__PureFunctionType__Group__3__Impl : ( ( rule__PureFunctionType__ArgTypeAssignment_3 ) ) ;
    public final void rule__PureFunctionType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4949:1: ( ( ( rule__PureFunctionType__ArgTypeAssignment_3 ) ) )
            // InternalFPML.g:4950:1: ( ( rule__PureFunctionType__ArgTypeAssignment_3 ) )
            {
            // InternalFPML.g:4950:1: ( ( rule__PureFunctionType__ArgTypeAssignment_3 ) )
            // InternalFPML.g:4951:2: ( rule__PureFunctionType__ArgTypeAssignment_3 )
            {
             before(grammarAccess.getPureFunctionTypeAccess().getArgTypeAssignment_3()); 
            // InternalFPML.g:4952:2: ( rule__PureFunctionType__ArgTypeAssignment_3 )
            // InternalFPML.g:4952:3: rule__PureFunctionType__ArgTypeAssignment_3
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
    // InternalFPML.g:4960:1: rule__PureFunctionType__Group__4 : rule__PureFunctionType__Group__4__Impl rule__PureFunctionType__Group__5 ;
    public final void rule__PureFunctionType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4964:1: ( rule__PureFunctionType__Group__4__Impl rule__PureFunctionType__Group__5 )
            // InternalFPML.g:4965:2: rule__PureFunctionType__Group__4__Impl rule__PureFunctionType__Group__5
            {
            pushFollow(FOLLOW_20);
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
    // InternalFPML.g:4972:1: rule__PureFunctionType__Group__4__Impl : ( ',' ) ;
    public final void rule__PureFunctionType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4976:1: ( ( ',' ) )
            // InternalFPML.g:4977:1: ( ',' )
            {
            // InternalFPML.g:4977:1: ( ',' )
            // InternalFPML.g:4978:2: ','
            {
             before(grammarAccess.getPureFunctionTypeAccess().getCommaKeyword_4()); 
            match(input,26,FOLLOW_2); 
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
    // InternalFPML.g:4987:1: rule__PureFunctionType__Group__5 : rule__PureFunctionType__Group__5__Impl rule__PureFunctionType__Group__6 ;
    public final void rule__PureFunctionType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:4991:1: ( rule__PureFunctionType__Group__5__Impl rule__PureFunctionType__Group__6 )
            // InternalFPML.g:4992:2: rule__PureFunctionType__Group__5__Impl rule__PureFunctionType__Group__6
            {
            pushFollow(FOLLOW_39);
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
    // InternalFPML.g:4999:1: rule__PureFunctionType__Group__5__Impl : ( ( rule__PureFunctionType__ReturnTypeAssignment_5 ) ) ;
    public final void rule__PureFunctionType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5003:1: ( ( ( rule__PureFunctionType__ReturnTypeAssignment_5 ) ) )
            // InternalFPML.g:5004:1: ( ( rule__PureFunctionType__ReturnTypeAssignment_5 ) )
            {
            // InternalFPML.g:5004:1: ( ( rule__PureFunctionType__ReturnTypeAssignment_5 ) )
            // InternalFPML.g:5005:2: ( rule__PureFunctionType__ReturnTypeAssignment_5 )
            {
             before(grammarAccess.getPureFunctionTypeAccess().getReturnTypeAssignment_5()); 
            // InternalFPML.g:5006:2: ( rule__PureFunctionType__ReturnTypeAssignment_5 )
            // InternalFPML.g:5006:3: rule__PureFunctionType__ReturnTypeAssignment_5
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
    // InternalFPML.g:5014:1: rule__PureFunctionType__Group__6 : rule__PureFunctionType__Group__6__Impl ;
    public final void rule__PureFunctionType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5018:1: ( rule__PureFunctionType__Group__6__Impl )
            // InternalFPML.g:5019:2: rule__PureFunctionType__Group__6__Impl
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
    // InternalFPML.g:5025:1: rule__PureFunctionType__Group__6__Impl : ( '>' ) ;
    public final void rule__PureFunctionType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5029:1: ( ( '>' ) )
            // InternalFPML.g:5030:1: ( '>' )
            {
            // InternalFPML.g:5030:1: ( '>' )
            // InternalFPML.g:5031:2: '>'
            {
             before(grammarAccess.getPureFunctionTypeAccess().getGreaterThanSignKeyword_6()); 
            match(input,35,FOLLOW_2); 
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
    // InternalFPML.g:5041:1: rule__EffectFullFunctionType__Group__0 : rule__EffectFullFunctionType__Group__0__Impl rule__EffectFullFunctionType__Group__1 ;
    public final void rule__EffectFullFunctionType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5045:1: ( rule__EffectFullFunctionType__Group__0__Impl rule__EffectFullFunctionType__Group__1 )
            // InternalFPML.g:5046:2: rule__EffectFullFunctionType__Group__0__Impl rule__EffectFullFunctionType__Group__1
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
    // InternalFPML.g:5053:1: rule__EffectFullFunctionType__Group__0__Impl : ( () ) ;
    public final void rule__EffectFullFunctionType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5057:1: ( ( () ) )
            // InternalFPML.g:5058:1: ( () )
            {
            // InternalFPML.g:5058:1: ( () )
            // InternalFPML.g:5059:2: ()
            {
             before(grammarAccess.getEffectFullFunctionTypeAccess().getEffectFullFunctionTypeAction_0()); 
            // InternalFPML.g:5060:2: ()
            // InternalFPML.g:5060:3: 
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
    // InternalFPML.g:5068:1: rule__EffectFullFunctionType__Group__1 : rule__EffectFullFunctionType__Group__1__Impl rule__EffectFullFunctionType__Group__2 ;
    public final void rule__EffectFullFunctionType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5072:1: ( rule__EffectFullFunctionType__Group__1__Impl rule__EffectFullFunctionType__Group__2 )
            // InternalFPML.g:5073:2: rule__EffectFullFunctionType__Group__1__Impl rule__EffectFullFunctionType__Group__2
            {
            pushFollow(FOLLOW_37);
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
    // InternalFPML.g:5080:1: rule__EffectFullFunctionType__Group__1__Impl : ( 'FIO' ) ;
    public final void rule__EffectFullFunctionType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5084:1: ( ( 'FIO' ) )
            // InternalFPML.g:5085:1: ( 'FIO' )
            {
            // InternalFPML.g:5085:1: ( 'FIO' )
            // InternalFPML.g:5086:2: 'FIO'
            {
             before(grammarAccess.getEffectFullFunctionTypeAccess().getFIOKeyword_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalFPML.g:5095:1: rule__EffectFullFunctionType__Group__2 : rule__EffectFullFunctionType__Group__2__Impl rule__EffectFullFunctionType__Group__3 ;
    public final void rule__EffectFullFunctionType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5099:1: ( rule__EffectFullFunctionType__Group__2__Impl rule__EffectFullFunctionType__Group__3 )
            // InternalFPML.g:5100:2: rule__EffectFullFunctionType__Group__2__Impl rule__EffectFullFunctionType__Group__3
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
    // InternalFPML.g:5107:1: rule__EffectFullFunctionType__Group__2__Impl : ( '<' ) ;
    public final void rule__EffectFullFunctionType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5111:1: ( ( '<' ) )
            // InternalFPML.g:5112:1: ( '<' )
            {
            // InternalFPML.g:5112:1: ( '<' )
            // InternalFPML.g:5113:2: '<'
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
    // InternalFPML.g:5122:1: rule__EffectFullFunctionType__Group__3 : rule__EffectFullFunctionType__Group__3__Impl rule__EffectFullFunctionType__Group__4 ;
    public final void rule__EffectFullFunctionType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5126:1: ( rule__EffectFullFunctionType__Group__3__Impl rule__EffectFullFunctionType__Group__4 )
            // InternalFPML.g:5127:2: rule__EffectFullFunctionType__Group__3__Impl rule__EffectFullFunctionType__Group__4
            {
            pushFollow(FOLLOW_38);
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
    // InternalFPML.g:5134:1: rule__EffectFullFunctionType__Group__3__Impl : ( ( rule__EffectFullFunctionType__ArgTypeAssignment_3 ) ) ;
    public final void rule__EffectFullFunctionType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5138:1: ( ( ( rule__EffectFullFunctionType__ArgTypeAssignment_3 ) ) )
            // InternalFPML.g:5139:1: ( ( rule__EffectFullFunctionType__ArgTypeAssignment_3 ) )
            {
            // InternalFPML.g:5139:1: ( ( rule__EffectFullFunctionType__ArgTypeAssignment_3 ) )
            // InternalFPML.g:5140:2: ( rule__EffectFullFunctionType__ArgTypeAssignment_3 )
            {
             before(grammarAccess.getEffectFullFunctionTypeAccess().getArgTypeAssignment_3()); 
            // InternalFPML.g:5141:2: ( rule__EffectFullFunctionType__ArgTypeAssignment_3 )
            // InternalFPML.g:5141:3: rule__EffectFullFunctionType__ArgTypeAssignment_3
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
    // InternalFPML.g:5149:1: rule__EffectFullFunctionType__Group__4 : rule__EffectFullFunctionType__Group__4__Impl rule__EffectFullFunctionType__Group__5 ;
    public final void rule__EffectFullFunctionType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5153:1: ( rule__EffectFullFunctionType__Group__4__Impl rule__EffectFullFunctionType__Group__5 )
            // InternalFPML.g:5154:2: rule__EffectFullFunctionType__Group__4__Impl rule__EffectFullFunctionType__Group__5
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
    // InternalFPML.g:5161:1: rule__EffectFullFunctionType__Group__4__Impl : ( ',' ) ;
    public final void rule__EffectFullFunctionType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5165:1: ( ( ',' ) )
            // InternalFPML.g:5166:1: ( ',' )
            {
            // InternalFPML.g:5166:1: ( ',' )
            // InternalFPML.g:5167:2: ','
            {
             before(grammarAccess.getEffectFullFunctionTypeAccess().getCommaKeyword_4()); 
            match(input,26,FOLLOW_2); 
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
    // InternalFPML.g:5176:1: rule__EffectFullFunctionType__Group__5 : rule__EffectFullFunctionType__Group__5__Impl rule__EffectFullFunctionType__Group__6 ;
    public final void rule__EffectFullFunctionType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5180:1: ( rule__EffectFullFunctionType__Group__5__Impl rule__EffectFullFunctionType__Group__6 )
            // InternalFPML.g:5181:2: rule__EffectFullFunctionType__Group__5__Impl rule__EffectFullFunctionType__Group__6
            {
            pushFollow(FOLLOW_39);
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
    // InternalFPML.g:5188:1: rule__EffectFullFunctionType__Group__5__Impl : ( ( rule__EffectFullFunctionType__ReturnTypeAssignment_5 ) ) ;
    public final void rule__EffectFullFunctionType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5192:1: ( ( ( rule__EffectFullFunctionType__ReturnTypeAssignment_5 ) ) )
            // InternalFPML.g:5193:1: ( ( rule__EffectFullFunctionType__ReturnTypeAssignment_5 ) )
            {
            // InternalFPML.g:5193:1: ( ( rule__EffectFullFunctionType__ReturnTypeAssignment_5 ) )
            // InternalFPML.g:5194:2: ( rule__EffectFullFunctionType__ReturnTypeAssignment_5 )
            {
             before(grammarAccess.getEffectFullFunctionTypeAccess().getReturnTypeAssignment_5()); 
            // InternalFPML.g:5195:2: ( rule__EffectFullFunctionType__ReturnTypeAssignment_5 )
            // InternalFPML.g:5195:3: rule__EffectFullFunctionType__ReturnTypeAssignment_5
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
    // InternalFPML.g:5203:1: rule__EffectFullFunctionType__Group__6 : rule__EffectFullFunctionType__Group__6__Impl ;
    public final void rule__EffectFullFunctionType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5207:1: ( rule__EffectFullFunctionType__Group__6__Impl )
            // InternalFPML.g:5208:2: rule__EffectFullFunctionType__Group__6__Impl
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
    // InternalFPML.g:5214:1: rule__EffectFullFunctionType__Group__6__Impl : ( '>' ) ;
    public final void rule__EffectFullFunctionType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5218:1: ( ( '>' ) )
            // InternalFPML.g:5219:1: ( '>' )
            {
            // InternalFPML.g:5219:1: ( '>' )
            // InternalFPML.g:5220:2: '>'
            {
             before(grammarAccess.getEffectFullFunctionTypeAccess().getGreaterThanSignKeyword_6()); 
            match(input,35,FOLLOW_2); 
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
    // InternalFPML.g:5230:1: rule__IntValue__Group__0 : rule__IntValue__Group__0__Impl rule__IntValue__Group__1 ;
    public final void rule__IntValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5234:1: ( rule__IntValue__Group__0__Impl rule__IntValue__Group__1 )
            // InternalFPML.g:5235:2: rule__IntValue__Group__0__Impl rule__IntValue__Group__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalFPML.g:5242:1: rule__IntValue__Group__0__Impl : ( () ) ;
    public final void rule__IntValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5246:1: ( ( () ) )
            // InternalFPML.g:5247:1: ( () )
            {
            // InternalFPML.g:5247:1: ( () )
            // InternalFPML.g:5248:2: ()
            {
             before(grammarAccess.getIntValueAccess().getIntegerTypeAction_0()); 
            // InternalFPML.g:5249:2: ()
            // InternalFPML.g:5249:3: 
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
    // InternalFPML.g:5257:1: rule__IntValue__Group__1 : rule__IntValue__Group__1__Impl ;
    public final void rule__IntValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5261:1: ( rule__IntValue__Group__1__Impl )
            // InternalFPML.g:5262:2: rule__IntValue__Group__1__Impl
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
    // InternalFPML.g:5268:1: rule__IntValue__Group__1__Impl : ( ( rule__IntValue__ValueAssignment_1 ) ) ;
    public final void rule__IntValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5272:1: ( ( ( rule__IntValue__ValueAssignment_1 ) ) )
            // InternalFPML.g:5273:1: ( ( rule__IntValue__ValueAssignment_1 ) )
            {
            // InternalFPML.g:5273:1: ( ( rule__IntValue__ValueAssignment_1 ) )
            // InternalFPML.g:5274:2: ( rule__IntValue__ValueAssignment_1 )
            {
             before(grammarAccess.getIntValueAccess().getValueAssignment_1()); 
            // InternalFPML.g:5275:2: ( rule__IntValue__ValueAssignment_1 )
            // InternalFPML.g:5275:3: rule__IntValue__ValueAssignment_1
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
    // InternalFPML.g:5284:1: rule__StringValue__Group__0 : rule__StringValue__Group__0__Impl rule__StringValue__Group__1 ;
    public final void rule__StringValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5288:1: ( rule__StringValue__Group__0__Impl rule__StringValue__Group__1 )
            // InternalFPML.g:5289:2: rule__StringValue__Group__0__Impl rule__StringValue__Group__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalFPML.g:5296:1: rule__StringValue__Group__0__Impl : ( () ) ;
    public final void rule__StringValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5300:1: ( ( () ) )
            // InternalFPML.g:5301:1: ( () )
            {
            // InternalFPML.g:5301:1: ( () )
            // InternalFPML.g:5302:2: ()
            {
             before(grammarAccess.getStringValueAccess().getStringTypeAction_0()); 
            // InternalFPML.g:5303:2: ()
            // InternalFPML.g:5303:3: 
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
    // InternalFPML.g:5311:1: rule__StringValue__Group__1 : rule__StringValue__Group__1__Impl ;
    public final void rule__StringValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5315:1: ( rule__StringValue__Group__1__Impl )
            // InternalFPML.g:5316:2: rule__StringValue__Group__1__Impl
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
    // InternalFPML.g:5322:1: rule__StringValue__Group__1__Impl : ( ( rule__StringValue__ValueAssignment_1 ) ) ;
    public final void rule__StringValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5326:1: ( ( ( rule__StringValue__ValueAssignment_1 ) ) )
            // InternalFPML.g:5327:1: ( ( rule__StringValue__ValueAssignment_1 ) )
            {
            // InternalFPML.g:5327:1: ( ( rule__StringValue__ValueAssignment_1 ) )
            // InternalFPML.g:5328:2: ( rule__StringValue__ValueAssignment_1 )
            {
             before(grammarAccess.getStringValueAccess().getValueAssignment_1()); 
            // InternalFPML.g:5329:2: ( rule__StringValue__ValueAssignment_1 )
            // InternalFPML.g:5329:3: rule__StringValue__ValueAssignment_1
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


    // $ANTLR start "rule__DataValue__Group__0"
    // InternalFPML.g:5338:1: rule__DataValue__Group__0 : rule__DataValue__Group__0__Impl rule__DataValue__Group__1 ;
    public final void rule__DataValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5342:1: ( rule__DataValue__Group__0__Impl rule__DataValue__Group__1 )
            // InternalFPML.g:5343:2: rule__DataValue__Group__0__Impl rule__DataValue__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalFPML.g:5350:1: rule__DataValue__Group__0__Impl : ( () ) ;
    public final void rule__DataValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5354:1: ( ( () ) )
            // InternalFPML.g:5355:1: ( () )
            {
            // InternalFPML.g:5355:1: ( () )
            // InternalFPML.g:5356:2: ()
            {
             before(grammarAccess.getDataValueAccess().getDataValueAction_0()); 
            // InternalFPML.g:5357:2: ()
            // InternalFPML.g:5357:3: 
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
    // InternalFPML.g:5365:1: rule__DataValue__Group__1 : rule__DataValue__Group__1__Impl rule__DataValue__Group__2 ;
    public final void rule__DataValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5369:1: ( rule__DataValue__Group__1__Impl rule__DataValue__Group__2 )
            // InternalFPML.g:5370:2: rule__DataValue__Group__1__Impl rule__DataValue__Group__2
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
    // InternalFPML.g:5377:1: rule__DataValue__Group__1__Impl : ( ( rule__DataValue__TypeAssignment_1 ) ) ;
    public final void rule__DataValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5381:1: ( ( ( rule__DataValue__TypeAssignment_1 ) ) )
            // InternalFPML.g:5382:1: ( ( rule__DataValue__TypeAssignment_1 ) )
            {
            // InternalFPML.g:5382:1: ( ( rule__DataValue__TypeAssignment_1 ) )
            // InternalFPML.g:5383:2: ( rule__DataValue__TypeAssignment_1 )
            {
             before(grammarAccess.getDataValueAccess().getTypeAssignment_1()); 
            // InternalFPML.g:5384:2: ( rule__DataValue__TypeAssignment_1 )
            // InternalFPML.g:5384:3: rule__DataValue__TypeAssignment_1
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
    // InternalFPML.g:5392:1: rule__DataValue__Group__2 : rule__DataValue__Group__2__Impl rule__DataValue__Group__3 ;
    public final void rule__DataValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5396:1: ( rule__DataValue__Group__2__Impl rule__DataValue__Group__3 )
            // InternalFPML.g:5397:2: rule__DataValue__Group__2__Impl rule__DataValue__Group__3
            {
            pushFollow(FOLLOW_42);
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
    // InternalFPML.g:5404:1: rule__DataValue__Group__2__Impl : ( '(' ) ;
    public final void rule__DataValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5408:1: ( ( '(' ) )
            // InternalFPML.g:5409:1: ( '(' )
            {
            // InternalFPML.g:5409:1: ( '(' )
            // InternalFPML.g:5410:2: '('
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
    // InternalFPML.g:5419:1: rule__DataValue__Group__3 : rule__DataValue__Group__3__Impl rule__DataValue__Group__4 ;
    public final void rule__DataValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5423:1: ( rule__DataValue__Group__3__Impl rule__DataValue__Group__4 )
            // InternalFPML.g:5424:2: rule__DataValue__Group__3__Impl rule__DataValue__Group__4
            {
            pushFollow(FOLLOW_43);
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
    // InternalFPML.g:5431:1: rule__DataValue__Group__3__Impl : ( ( rule__DataValue__ValueAssignment_3 ) ) ;
    public final void rule__DataValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5435:1: ( ( ( rule__DataValue__ValueAssignment_3 ) ) )
            // InternalFPML.g:5436:1: ( ( rule__DataValue__ValueAssignment_3 ) )
            {
            // InternalFPML.g:5436:1: ( ( rule__DataValue__ValueAssignment_3 ) )
            // InternalFPML.g:5437:2: ( rule__DataValue__ValueAssignment_3 )
            {
             before(grammarAccess.getDataValueAccess().getValueAssignment_3()); 
            // InternalFPML.g:5438:2: ( rule__DataValue__ValueAssignment_3 )
            // InternalFPML.g:5438:3: rule__DataValue__ValueAssignment_3
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
    // InternalFPML.g:5446:1: rule__DataValue__Group__4 : rule__DataValue__Group__4__Impl ;
    public final void rule__DataValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5450:1: ( rule__DataValue__Group__4__Impl )
            // InternalFPML.g:5451:2: rule__DataValue__Group__4__Impl
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
    // InternalFPML.g:5457:1: rule__DataValue__Group__4__Impl : ( ')' ) ;
    public final void rule__DataValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5461:1: ( ( ')' ) )
            // InternalFPML.g:5462:1: ( ')' )
            {
            // InternalFPML.g:5462:1: ( ')' )
            // InternalFPML.g:5463:2: ')'
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
    // InternalFPML.g:5473:1: rule__ValueRef__Group__0 : rule__ValueRef__Group__0__Impl rule__ValueRef__Group__1 ;
    public final void rule__ValueRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5477:1: ( rule__ValueRef__Group__0__Impl rule__ValueRef__Group__1 )
            // InternalFPML.g:5478:2: rule__ValueRef__Group__0__Impl rule__ValueRef__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalFPML.g:5485:1: rule__ValueRef__Group__0__Impl : ( () ) ;
    public final void rule__ValueRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5489:1: ( ( () ) )
            // InternalFPML.g:5490:1: ( () )
            {
            // InternalFPML.g:5490:1: ( () )
            // InternalFPML.g:5491:2: ()
            {
             before(grammarAccess.getValueRefAccess().getValueRefAction_0()); 
            // InternalFPML.g:5492:2: ()
            // InternalFPML.g:5492:3: 
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
    // InternalFPML.g:5500:1: rule__ValueRef__Group__1 : rule__ValueRef__Group__1__Impl ;
    public final void rule__ValueRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5504:1: ( rule__ValueRef__Group__1__Impl )
            // InternalFPML.g:5505:2: rule__ValueRef__Group__1__Impl
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
    // InternalFPML.g:5511:1: rule__ValueRef__Group__1__Impl : ( ( rule__ValueRef__ValueAssignment_1 ) ) ;
    public final void rule__ValueRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5515:1: ( ( ( rule__ValueRef__ValueAssignment_1 ) ) )
            // InternalFPML.g:5516:1: ( ( rule__ValueRef__ValueAssignment_1 ) )
            {
            // InternalFPML.g:5516:1: ( ( rule__ValueRef__ValueAssignment_1 ) )
            // InternalFPML.g:5517:2: ( rule__ValueRef__ValueAssignment_1 )
            {
             before(grammarAccess.getValueRefAccess().getValueAssignment_1()); 
            // InternalFPML.g:5518:2: ( rule__ValueRef__ValueAssignment_1 )
            // InternalFPML.g:5518:3: rule__ValueRef__ValueAssignment_1
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
    // InternalFPML.g:5527:1: rule__PureLambda__Group__0 : rule__PureLambda__Group__0__Impl rule__PureLambda__Group__1 ;
    public final void rule__PureLambda__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5531:1: ( rule__PureLambda__Group__0__Impl rule__PureLambda__Group__1 )
            // InternalFPML.g:5532:2: rule__PureLambda__Group__0__Impl rule__PureLambda__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalFPML.g:5539:1: rule__PureLambda__Group__0__Impl : ( () ) ;
    public final void rule__PureLambda__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5543:1: ( ( () ) )
            // InternalFPML.g:5544:1: ( () )
            {
            // InternalFPML.g:5544:1: ( () )
            // InternalFPML.g:5545:2: ()
            {
             before(grammarAccess.getPureLambdaAccess().getPureLambdaAction_0()); 
            // InternalFPML.g:5546:2: ()
            // InternalFPML.g:5546:3: 
            {
            }

             after(grammarAccess.getPureLambdaAccess().getPureLambdaAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureLambda__Group__0__Impl"


    // $ANTLR start "rule__PureLambda__Group__1"
    // InternalFPML.g:5554:1: rule__PureLambda__Group__1 : rule__PureLambda__Group__1__Impl rule__PureLambda__Group__2 ;
    public final void rule__PureLambda__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5558:1: ( rule__PureLambda__Group__1__Impl rule__PureLambda__Group__2 )
            // InternalFPML.g:5559:2: rule__PureLambda__Group__1__Impl rule__PureLambda__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalFPML.g:5566:1: rule__PureLambda__Group__1__Impl : ( '(' ) ;
    public final void rule__PureLambda__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5570:1: ( ( '(' ) )
            // InternalFPML.g:5571:1: ( '(' )
            {
            // InternalFPML.g:5571:1: ( '(' )
            // InternalFPML.g:5572:2: '('
            {
             before(grammarAccess.getPureLambdaAccess().getLeftParenthesisKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPureLambdaAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
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
    // InternalFPML.g:5581:1: rule__PureLambda__Group__2 : rule__PureLambda__Group__2__Impl rule__PureLambda__Group__3 ;
    public final void rule__PureLambda__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5585:1: ( rule__PureLambda__Group__2__Impl rule__PureLambda__Group__3 )
            // InternalFPML.g:5586:2: rule__PureLambda__Group__2__Impl rule__PureLambda__Group__3
            {
            pushFollow(FOLLOW_43);
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
    // InternalFPML.g:5593:1: rule__PureLambda__Group__2__Impl : ( ( rule__PureLambda__ArgAssignment_2 ) ) ;
    public final void rule__PureLambda__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5597:1: ( ( ( rule__PureLambda__ArgAssignment_2 ) ) )
            // InternalFPML.g:5598:1: ( ( rule__PureLambda__ArgAssignment_2 ) )
            {
            // InternalFPML.g:5598:1: ( ( rule__PureLambda__ArgAssignment_2 ) )
            // InternalFPML.g:5599:2: ( rule__PureLambda__ArgAssignment_2 )
            {
             before(grammarAccess.getPureLambdaAccess().getArgAssignment_2()); 
            // InternalFPML.g:5600:2: ( rule__PureLambda__ArgAssignment_2 )
            // InternalFPML.g:5600:3: rule__PureLambda__ArgAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PureLambda__ArgAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPureLambdaAccess().getArgAssignment_2()); 

            }


            }

        }
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
    // InternalFPML.g:5608:1: rule__PureLambda__Group__3 : rule__PureLambda__Group__3__Impl rule__PureLambda__Group__4 ;
    public final void rule__PureLambda__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5612:1: ( rule__PureLambda__Group__3__Impl rule__PureLambda__Group__4 )
            // InternalFPML.g:5613:2: rule__PureLambda__Group__3__Impl rule__PureLambda__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalFPML.g:5620:1: rule__PureLambda__Group__3__Impl : ( ')' ) ;
    public final void rule__PureLambda__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5624:1: ( ( ')' ) )
            // InternalFPML.g:5625:1: ( ')' )
            {
            // InternalFPML.g:5625:1: ( ')' )
            // InternalFPML.g:5626:2: ')'
            {
             before(grammarAccess.getPureLambdaAccess().getRightParenthesisKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPureLambdaAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
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
    // InternalFPML.g:5635:1: rule__PureLambda__Group__4 : rule__PureLambda__Group__4__Impl rule__PureLambda__Group__5 ;
    public final void rule__PureLambda__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5639:1: ( rule__PureLambda__Group__4__Impl rule__PureLambda__Group__5 )
            // InternalFPML.g:5640:2: rule__PureLambda__Group__4__Impl rule__PureLambda__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__PureLambda__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PureLambda__Group__5();

            state._fsp--;


            }

        }
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
    // InternalFPML.g:5647:1: rule__PureLambda__Group__4__Impl : ( ':' ) ;
    public final void rule__PureLambda__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5651:1: ( ( ':' ) )
            // InternalFPML.g:5652:1: ( ':' )
            {
            // InternalFPML.g:5652:1: ( ':' )
            // InternalFPML.g:5653:2: ':'
            {
             before(grammarAccess.getPureLambdaAccess().getColonKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPureLambdaAccess().getColonKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__PureLambda__Group__5"
    // InternalFPML.g:5662:1: rule__PureLambda__Group__5 : rule__PureLambda__Group__5__Impl ;
    public final void rule__PureLambda__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5666:1: ( rule__PureLambda__Group__5__Impl )
            // InternalFPML.g:5667:2: rule__PureLambda__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PureLambda__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureLambda__Group__5"


    // $ANTLR start "rule__PureLambda__Group__5__Impl"
    // InternalFPML.g:5673:1: rule__PureLambda__Group__5__Impl : ( ( rule__PureLambda__FunctionBodyAssignment_5 ) ) ;
    public final void rule__PureLambda__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5677:1: ( ( ( rule__PureLambda__FunctionBodyAssignment_5 ) ) )
            // InternalFPML.g:5678:1: ( ( rule__PureLambda__FunctionBodyAssignment_5 ) )
            {
            // InternalFPML.g:5678:1: ( ( rule__PureLambda__FunctionBodyAssignment_5 ) )
            // InternalFPML.g:5679:2: ( rule__PureLambda__FunctionBodyAssignment_5 )
            {
             before(grammarAccess.getPureLambdaAccess().getFunctionBodyAssignment_5()); 
            // InternalFPML.g:5680:2: ( rule__PureLambda__FunctionBodyAssignment_5 )
            // InternalFPML.g:5680:3: rule__PureLambda__FunctionBodyAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__PureLambda__FunctionBodyAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getPureLambdaAccess().getFunctionBodyAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureLambda__Group__5__Impl"


    // $ANTLR start "rule__ProdValue__Group__0"
    // InternalFPML.g:5689:1: rule__ProdValue__Group__0 : rule__ProdValue__Group__0__Impl rule__ProdValue__Group__1 ;
    public final void rule__ProdValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5693:1: ( rule__ProdValue__Group__0__Impl rule__ProdValue__Group__1 )
            // InternalFPML.g:5694:2: rule__ProdValue__Group__0__Impl rule__ProdValue__Group__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalFPML.g:5701:1: rule__ProdValue__Group__0__Impl : ( '(' ) ;
    public final void rule__ProdValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5705:1: ( ( '(' ) )
            // InternalFPML.g:5706:1: ( '(' )
            {
            // InternalFPML.g:5706:1: ( '(' )
            // InternalFPML.g:5707:2: '('
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
    // InternalFPML.g:5716:1: rule__ProdValue__Group__1 : rule__ProdValue__Group__1__Impl rule__ProdValue__Group__2 ;
    public final void rule__ProdValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5720:1: ( rule__ProdValue__Group__1__Impl rule__ProdValue__Group__2 )
            // InternalFPML.g:5721:2: rule__ProdValue__Group__1__Impl rule__ProdValue__Group__2
            {
            pushFollow(FOLLOW_38);
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
    // InternalFPML.g:5728:1: rule__ProdValue__Group__1__Impl : ( ( rule__ProdValue__ProdAdtElement1Assignment_1 ) ) ;
    public final void rule__ProdValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5732:1: ( ( ( rule__ProdValue__ProdAdtElement1Assignment_1 ) ) )
            // InternalFPML.g:5733:1: ( ( rule__ProdValue__ProdAdtElement1Assignment_1 ) )
            {
            // InternalFPML.g:5733:1: ( ( rule__ProdValue__ProdAdtElement1Assignment_1 ) )
            // InternalFPML.g:5734:2: ( rule__ProdValue__ProdAdtElement1Assignment_1 )
            {
             before(grammarAccess.getProdValueAccess().getProdAdtElement1Assignment_1()); 
            // InternalFPML.g:5735:2: ( rule__ProdValue__ProdAdtElement1Assignment_1 )
            // InternalFPML.g:5735:3: rule__ProdValue__ProdAdtElement1Assignment_1
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
    // InternalFPML.g:5743:1: rule__ProdValue__Group__2 : rule__ProdValue__Group__2__Impl rule__ProdValue__Group__3 ;
    public final void rule__ProdValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5747:1: ( rule__ProdValue__Group__2__Impl rule__ProdValue__Group__3 )
            // InternalFPML.g:5748:2: rule__ProdValue__Group__2__Impl rule__ProdValue__Group__3
            {
            pushFollow(FOLLOW_42);
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
    // InternalFPML.g:5755:1: rule__ProdValue__Group__2__Impl : ( ',' ) ;
    public final void rule__ProdValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5759:1: ( ( ',' ) )
            // InternalFPML.g:5760:1: ( ',' )
            {
            // InternalFPML.g:5760:1: ( ',' )
            // InternalFPML.g:5761:2: ','
            {
             before(grammarAccess.getProdValueAccess().getCommaKeyword_2()); 
            match(input,26,FOLLOW_2); 
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
    // InternalFPML.g:5770:1: rule__ProdValue__Group__3 : rule__ProdValue__Group__3__Impl rule__ProdValue__Group__4 ;
    public final void rule__ProdValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5774:1: ( rule__ProdValue__Group__3__Impl rule__ProdValue__Group__4 )
            // InternalFPML.g:5775:2: rule__ProdValue__Group__3__Impl rule__ProdValue__Group__4
            {
            pushFollow(FOLLOW_43);
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
    // InternalFPML.g:5782:1: rule__ProdValue__Group__3__Impl : ( ( rule__ProdValue__ProdAdtElement2Assignment_3 ) ) ;
    public final void rule__ProdValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5786:1: ( ( ( rule__ProdValue__ProdAdtElement2Assignment_3 ) ) )
            // InternalFPML.g:5787:1: ( ( rule__ProdValue__ProdAdtElement2Assignment_3 ) )
            {
            // InternalFPML.g:5787:1: ( ( rule__ProdValue__ProdAdtElement2Assignment_3 ) )
            // InternalFPML.g:5788:2: ( rule__ProdValue__ProdAdtElement2Assignment_3 )
            {
             before(grammarAccess.getProdValueAccess().getProdAdtElement2Assignment_3()); 
            // InternalFPML.g:5789:2: ( rule__ProdValue__ProdAdtElement2Assignment_3 )
            // InternalFPML.g:5789:3: rule__ProdValue__ProdAdtElement2Assignment_3
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
    // InternalFPML.g:5797:1: rule__ProdValue__Group__4 : rule__ProdValue__Group__4__Impl ;
    public final void rule__ProdValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5801:1: ( rule__ProdValue__Group__4__Impl )
            // InternalFPML.g:5802:2: rule__ProdValue__Group__4__Impl
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
    // InternalFPML.g:5808:1: rule__ProdValue__Group__4__Impl : ( ')' ) ;
    public final void rule__ProdValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5812:1: ( ( ')' ) )
            // InternalFPML.g:5813:1: ( ')' )
            {
            // InternalFPML.g:5813:1: ( ')' )
            // InternalFPML.g:5814:2: ')'
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
    // InternalFPML.g:5824:1: rule__SumValue__Group_0__0 : rule__SumValue__Group_0__0__Impl rule__SumValue__Group_0__1 ;
    public final void rule__SumValue__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5828:1: ( rule__SumValue__Group_0__0__Impl rule__SumValue__Group_0__1 )
            // InternalFPML.g:5829:2: rule__SumValue__Group_0__0__Impl rule__SumValue__Group_0__1
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
    // InternalFPML.g:5836:1: rule__SumValue__Group_0__0__Impl : ( 'Left' ) ;
    public final void rule__SumValue__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5840:1: ( ( 'Left' ) )
            // InternalFPML.g:5841:1: ( 'Left' )
            {
            // InternalFPML.g:5841:1: ( 'Left' )
            // InternalFPML.g:5842:2: 'Left'
            {
             before(grammarAccess.getSumValueAccess().getLeftKeyword_0_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalFPML.g:5851:1: rule__SumValue__Group_0__1 : rule__SumValue__Group_0__1__Impl rule__SumValue__Group_0__2 ;
    public final void rule__SumValue__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5855:1: ( rule__SumValue__Group_0__1__Impl rule__SumValue__Group_0__2 )
            // InternalFPML.g:5856:2: rule__SumValue__Group_0__1__Impl rule__SumValue__Group_0__2
            {
            pushFollow(FOLLOW_42);
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
    // InternalFPML.g:5863:1: rule__SumValue__Group_0__1__Impl : ( '(' ) ;
    public final void rule__SumValue__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5867:1: ( ( '(' ) )
            // InternalFPML.g:5868:1: ( '(' )
            {
            // InternalFPML.g:5868:1: ( '(' )
            // InternalFPML.g:5869:2: '('
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
    // InternalFPML.g:5878:1: rule__SumValue__Group_0__2 : rule__SumValue__Group_0__2__Impl rule__SumValue__Group_0__3 ;
    public final void rule__SumValue__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5882:1: ( rule__SumValue__Group_0__2__Impl rule__SumValue__Group_0__3 )
            // InternalFPML.g:5883:2: rule__SumValue__Group_0__2__Impl rule__SumValue__Group_0__3
            {
            pushFollow(FOLLOW_43);
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
    // InternalFPML.g:5890:1: rule__SumValue__Group_0__2__Impl : ( ( rule__SumValue__SumAdtElement1Assignment_0_2 ) ) ;
    public final void rule__SumValue__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5894:1: ( ( ( rule__SumValue__SumAdtElement1Assignment_0_2 ) ) )
            // InternalFPML.g:5895:1: ( ( rule__SumValue__SumAdtElement1Assignment_0_2 ) )
            {
            // InternalFPML.g:5895:1: ( ( rule__SumValue__SumAdtElement1Assignment_0_2 ) )
            // InternalFPML.g:5896:2: ( rule__SumValue__SumAdtElement1Assignment_0_2 )
            {
             before(grammarAccess.getSumValueAccess().getSumAdtElement1Assignment_0_2()); 
            // InternalFPML.g:5897:2: ( rule__SumValue__SumAdtElement1Assignment_0_2 )
            // InternalFPML.g:5897:3: rule__SumValue__SumAdtElement1Assignment_0_2
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
    // InternalFPML.g:5905:1: rule__SumValue__Group_0__3 : rule__SumValue__Group_0__3__Impl ;
    public final void rule__SumValue__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5909:1: ( rule__SumValue__Group_0__3__Impl )
            // InternalFPML.g:5910:2: rule__SumValue__Group_0__3__Impl
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
    // InternalFPML.g:5916:1: rule__SumValue__Group_0__3__Impl : ( ')' ) ;
    public final void rule__SumValue__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5920:1: ( ( ')' ) )
            // InternalFPML.g:5921:1: ( ')' )
            {
            // InternalFPML.g:5921:1: ( ')' )
            // InternalFPML.g:5922:2: ')'
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
    // InternalFPML.g:5932:1: rule__SumValue__Group_1__0 : rule__SumValue__Group_1__0__Impl rule__SumValue__Group_1__1 ;
    public final void rule__SumValue__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5936:1: ( rule__SumValue__Group_1__0__Impl rule__SumValue__Group_1__1 )
            // InternalFPML.g:5937:2: rule__SumValue__Group_1__0__Impl rule__SumValue__Group_1__1
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
    // InternalFPML.g:5944:1: rule__SumValue__Group_1__0__Impl : ( 'Right' ) ;
    public final void rule__SumValue__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5948:1: ( ( 'Right' ) )
            // InternalFPML.g:5949:1: ( 'Right' )
            {
            // InternalFPML.g:5949:1: ( 'Right' )
            // InternalFPML.g:5950:2: 'Right'
            {
             before(grammarAccess.getSumValueAccess().getRightKeyword_1_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalFPML.g:5959:1: rule__SumValue__Group_1__1 : rule__SumValue__Group_1__1__Impl rule__SumValue__Group_1__2 ;
    public final void rule__SumValue__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5963:1: ( rule__SumValue__Group_1__1__Impl rule__SumValue__Group_1__2 )
            // InternalFPML.g:5964:2: rule__SumValue__Group_1__1__Impl rule__SumValue__Group_1__2
            {
            pushFollow(FOLLOW_42);
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
    // InternalFPML.g:5971:1: rule__SumValue__Group_1__1__Impl : ( '(' ) ;
    public final void rule__SumValue__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5975:1: ( ( '(' ) )
            // InternalFPML.g:5976:1: ( '(' )
            {
            // InternalFPML.g:5976:1: ( '(' )
            // InternalFPML.g:5977:2: '('
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
    // InternalFPML.g:5986:1: rule__SumValue__Group_1__2 : rule__SumValue__Group_1__2__Impl rule__SumValue__Group_1__3 ;
    public final void rule__SumValue__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:5990:1: ( rule__SumValue__Group_1__2__Impl rule__SumValue__Group_1__3 )
            // InternalFPML.g:5991:2: rule__SumValue__Group_1__2__Impl rule__SumValue__Group_1__3
            {
            pushFollow(FOLLOW_43);
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
    // InternalFPML.g:5998:1: rule__SumValue__Group_1__2__Impl : ( ( rule__SumValue__SumAdtElement2Assignment_1_2 ) ) ;
    public final void rule__SumValue__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6002:1: ( ( ( rule__SumValue__SumAdtElement2Assignment_1_2 ) ) )
            // InternalFPML.g:6003:1: ( ( rule__SumValue__SumAdtElement2Assignment_1_2 ) )
            {
            // InternalFPML.g:6003:1: ( ( rule__SumValue__SumAdtElement2Assignment_1_2 ) )
            // InternalFPML.g:6004:2: ( rule__SumValue__SumAdtElement2Assignment_1_2 )
            {
             before(grammarAccess.getSumValueAccess().getSumAdtElement2Assignment_1_2()); 
            // InternalFPML.g:6005:2: ( rule__SumValue__SumAdtElement2Assignment_1_2 )
            // InternalFPML.g:6005:3: rule__SumValue__SumAdtElement2Assignment_1_2
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
    // InternalFPML.g:6013:1: rule__SumValue__Group_1__3 : rule__SumValue__Group_1__3__Impl ;
    public final void rule__SumValue__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6017:1: ( rule__SumValue__Group_1__3__Impl )
            // InternalFPML.g:6018:2: rule__SumValue__Group_1__3__Impl
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
    // InternalFPML.g:6024:1: rule__SumValue__Group_1__3__Impl : ( ')' ) ;
    public final void rule__SumValue__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6028:1: ( ( ')' ) )
            // InternalFPML.g:6029:1: ( ')' )
            {
            // InternalFPML.g:6029:1: ( ')' )
            // InternalFPML.g:6030:2: ')'
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
    // InternalFPML.g:6040:1: rule__IntToString__Group__0 : rule__IntToString__Group__0__Impl rule__IntToString__Group__1 ;
    public final void rule__IntToString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6044:1: ( rule__IntToString__Group__0__Impl rule__IntToString__Group__1 )
            // InternalFPML.g:6045:2: rule__IntToString__Group__0__Impl rule__IntToString__Group__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalFPML.g:6052:1: rule__IntToString__Group__0__Impl : ( () ) ;
    public final void rule__IntToString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6056:1: ( ( () ) )
            // InternalFPML.g:6057:1: ( () )
            {
            // InternalFPML.g:6057:1: ( () )
            // InternalFPML.g:6058:2: ()
            {
             before(grammarAccess.getIntToStringAccess().getIntToStringAction_0()); 
            // InternalFPML.g:6059:2: ()
            // InternalFPML.g:6059:3: 
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
    // InternalFPML.g:6067:1: rule__IntToString__Group__1 : rule__IntToString__Group__1__Impl ;
    public final void rule__IntToString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6071:1: ( rule__IntToString__Group__1__Impl )
            // InternalFPML.g:6072:2: rule__IntToString__Group__1__Impl
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
    // InternalFPML.g:6078:1: rule__IntToString__Group__1__Impl : ( 'IntToString' ) ;
    public final void rule__IntToString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6082:1: ( ( 'IntToString' ) )
            // InternalFPML.g:6083:1: ( 'IntToString' )
            {
            // InternalFPML.g:6083:1: ( 'IntToString' )
            // InternalFPML.g:6084:2: 'IntToString'
            {
             before(grammarAccess.getIntToStringAccess().getIntToStringKeyword_1()); 
            match(input,39,FOLLOW_2); 
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
    // InternalFPML.g:6094:1: rule__IntPow__Group__0 : rule__IntPow__Group__0__Impl rule__IntPow__Group__1 ;
    public final void rule__IntPow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6098:1: ( rule__IntPow__Group__0__Impl rule__IntPow__Group__1 )
            // InternalFPML.g:6099:2: rule__IntPow__Group__0__Impl rule__IntPow__Group__1
            {
            pushFollow(FOLLOW_45);
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
    // InternalFPML.g:6106:1: rule__IntPow__Group__0__Impl : ( () ) ;
    public final void rule__IntPow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6110:1: ( ( () ) )
            // InternalFPML.g:6111:1: ( () )
            {
            // InternalFPML.g:6111:1: ( () )
            // InternalFPML.g:6112:2: ()
            {
             before(grammarAccess.getIntPowAccess().getIntPowAction_0()); 
            // InternalFPML.g:6113:2: ()
            // InternalFPML.g:6113:3: 
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
    // InternalFPML.g:6121:1: rule__IntPow__Group__1 : rule__IntPow__Group__1__Impl ;
    public final void rule__IntPow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6125:1: ( rule__IntPow__Group__1__Impl )
            // InternalFPML.g:6126:2: rule__IntPow__Group__1__Impl
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
    // InternalFPML.g:6132:1: rule__IntPow__Group__1__Impl : ( 'IntPow' ) ;
    public final void rule__IntPow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6136:1: ( ( 'IntPow' ) )
            // InternalFPML.g:6137:1: ( 'IntPow' )
            {
            // InternalFPML.g:6137:1: ( 'IntPow' )
            // InternalFPML.g:6138:2: 'IntPow'
            {
             before(grammarAccess.getIntPowAccess().getIntPowKeyword_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalFPML.g:6148:1: rule__Plus__Group__0 : rule__Plus__Group__0__Impl rule__Plus__Group__1 ;
    public final void rule__Plus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6152:1: ( rule__Plus__Group__0__Impl rule__Plus__Group__1 )
            // InternalFPML.g:6153:2: rule__Plus__Group__0__Impl rule__Plus__Group__1
            {
            pushFollow(FOLLOW_46);
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
    // InternalFPML.g:6160:1: rule__Plus__Group__0__Impl : ( () ) ;
    public final void rule__Plus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6164:1: ( ( () ) )
            // InternalFPML.g:6165:1: ( () )
            {
            // InternalFPML.g:6165:1: ( () )
            // InternalFPML.g:6166:2: ()
            {
             before(grammarAccess.getPlusAccess().getPlusAction_0()); 
            // InternalFPML.g:6167:2: ()
            // InternalFPML.g:6167:3: 
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
    // InternalFPML.g:6175:1: rule__Plus__Group__1 : rule__Plus__Group__1__Impl ;
    public final void rule__Plus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6179:1: ( rule__Plus__Group__1__Impl )
            // InternalFPML.g:6180:2: rule__Plus__Group__1__Impl
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
    // InternalFPML.g:6186:1: rule__Plus__Group__1__Impl : ( '+' ) ;
    public final void rule__Plus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6190:1: ( ( '+' ) )
            // InternalFPML.g:6191:1: ( '+' )
            {
            // InternalFPML.g:6191:1: ( '+' )
            // InternalFPML.g:6192:2: '+'
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
    // InternalFPML.g:6202:1: rule__Minus__Group__0 : rule__Minus__Group__0__Impl rule__Minus__Group__1 ;
    public final void rule__Minus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6206:1: ( rule__Minus__Group__0__Impl rule__Minus__Group__1 )
            // InternalFPML.g:6207:2: rule__Minus__Group__0__Impl rule__Minus__Group__1
            {
            pushFollow(FOLLOW_47);
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
    // InternalFPML.g:6214:1: rule__Minus__Group__0__Impl : ( () ) ;
    public final void rule__Minus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6218:1: ( ( () ) )
            // InternalFPML.g:6219:1: ( () )
            {
            // InternalFPML.g:6219:1: ( () )
            // InternalFPML.g:6220:2: ()
            {
             before(grammarAccess.getMinusAccess().getMinusAction_0()); 
            // InternalFPML.g:6221:2: ()
            // InternalFPML.g:6221:3: 
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
    // InternalFPML.g:6229:1: rule__Minus__Group__1 : rule__Minus__Group__1__Impl ;
    public final void rule__Minus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6233:1: ( rule__Minus__Group__1__Impl )
            // InternalFPML.g:6234:2: rule__Minus__Group__1__Impl
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
    // InternalFPML.g:6240:1: rule__Minus__Group__1__Impl : ( '-' ) ;
    public final void rule__Minus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6244:1: ( ( '-' ) )
            // InternalFPML.g:6245:1: ( '-' )
            {
            // InternalFPML.g:6245:1: ( '-' )
            // InternalFPML.g:6246:2: '-'
            {
             before(grammarAccess.getMinusAccess().getHyphenMinusKeyword_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalFPML.g:6256:1: rule__Times__Group__0 : rule__Times__Group__0__Impl rule__Times__Group__1 ;
    public final void rule__Times__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6260:1: ( rule__Times__Group__0__Impl rule__Times__Group__1 )
            // InternalFPML.g:6261:2: rule__Times__Group__0__Impl rule__Times__Group__1
            {
            pushFollow(FOLLOW_48);
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
    // InternalFPML.g:6268:1: rule__Times__Group__0__Impl : ( () ) ;
    public final void rule__Times__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6272:1: ( ( () ) )
            // InternalFPML.g:6273:1: ( () )
            {
            // InternalFPML.g:6273:1: ( () )
            // InternalFPML.g:6274:2: ()
            {
             before(grammarAccess.getTimesAccess().getTimesAction_0()); 
            // InternalFPML.g:6275:2: ()
            // InternalFPML.g:6275:3: 
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
    // InternalFPML.g:6283:1: rule__Times__Group__1 : rule__Times__Group__1__Impl ;
    public final void rule__Times__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6287:1: ( rule__Times__Group__1__Impl )
            // InternalFPML.g:6288:2: rule__Times__Group__1__Impl
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
    // InternalFPML.g:6294:1: rule__Times__Group__1__Impl : ( '*' ) ;
    public final void rule__Times__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6298:1: ( ( '*' ) )
            // InternalFPML.g:6299:1: ( '*' )
            {
            // InternalFPML.g:6299:1: ( '*' )
            // InternalFPML.g:6300:2: '*'
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
    // InternalFPML.g:6310:1: rule__Mod__Group__0 : rule__Mod__Group__0__Impl rule__Mod__Group__1 ;
    public final void rule__Mod__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6314:1: ( rule__Mod__Group__0__Impl rule__Mod__Group__1 )
            // InternalFPML.g:6315:2: rule__Mod__Group__0__Impl rule__Mod__Group__1
            {
            pushFollow(FOLLOW_49);
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
    // InternalFPML.g:6322:1: rule__Mod__Group__0__Impl : ( () ) ;
    public final void rule__Mod__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6326:1: ( ( () ) )
            // InternalFPML.g:6327:1: ( () )
            {
            // InternalFPML.g:6327:1: ( () )
            // InternalFPML.g:6328:2: ()
            {
             before(grammarAccess.getModAccess().getModAction_0()); 
            // InternalFPML.g:6329:2: ()
            // InternalFPML.g:6329:3: 
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
    // InternalFPML.g:6337:1: rule__Mod__Group__1 : rule__Mod__Group__1__Impl ;
    public final void rule__Mod__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6341:1: ( rule__Mod__Group__1__Impl )
            // InternalFPML.g:6342:2: rule__Mod__Group__1__Impl
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
    // InternalFPML.g:6348:1: rule__Mod__Group__1__Impl : ( 'mod' ) ;
    public final void rule__Mod__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6352:1: ( ( 'mod' ) )
            // InternalFPML.g:6353:1: ( 'mod' )
            {
            // InternalFPML.g:6353:1: ( 'mod' )
            // InternalFPML.g:6354:2: 'mod'
            {
             before(grammarAccess.getModAccess().getModKeyword_1()); 
            match(input,42,FOLLOW_2); 
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
    // InternalFPML.g:6364:1: rule__ApplyF__Group__0 : rule__ApplyF__Group__0__Impl rule__ApplyF__Group__1 ;
    public final void rule__ApplyF__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6368:1: ( rule__ApplyF__Group__0__Impl rule__ApplyF__Group__1 )
            // InternalFPML.g:6369:2: rule__ApplyF__Group__0__Impl rule__ApplyF__Group__1
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
    // InternalFPML.g:6376:1: rule__ApplyF__Group__0__Impl : ( () ) ;
    public final void rule__ApplyF__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6380:1: ( ( () ) )
            // InternalFPML.g:6381:1: ( () )
            {
            // InternalFPML.g:6381:1: ( () )
            // InternalFPML.g:6382:2: ()
            {
             before(grammarAccess.getApplyFAccess().getApplyFAction_0()); 
            // InternalFPML.g:6383:2: ()
            // InternalFPML.g:6383:3: 
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
    // InternalFPML.g:6391:1: rule__ApplyF__Group__1 : rule__ApplyF__Group__1__Impl rule__ApplyF__Group__2 ;
    public final void rule__ApplyF__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6395:1: ( rule__ApplyF__Group__1__Impl rule__ApplyF__Group__2 )
            // InternalFPML.g:6396:2: rule__ApplyF__Group__1__Impl rule__ApplyF__Group__2
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
    // InternalFPML.g:6403:1: rule__ApplyF__Group__1__Impl : ( 'applyF' ) ;
    public final void rule__ApplyF__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6407:1: ( ( 'applyF' ) )
            // InternalFPML.g:6408:1: ( 'applyF' )
            {
            // InternalFPML.g:6408:1: ( 'applyF' )
            // InternalFPML.g:6409:2: 'applyF'
            {
             before(grammarAccess.getApplyFAccess().getApplyFKeyword_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalFPML.g:6418:1: rule__ApplyF__Group__2 : rule__ApplyF__Group__2__Impl rule__ApplyF__Group__3 ;
    public final void rule__ApplyF__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6422:1: ( rule__ApplyF__Group__2__Impl rule__ApplyF__Group__3 )
            // InternalFPML.g:6423:2: rule__ApplyF__Group__2__Impl rule__ApplyF__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__ApplyF__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplyF__Group__3();

            state._fsp--;


            }

        }
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
    // InternalFPML.g:6430:1: rule__ApplyF__Group__2__Impl : ( ( rule__ApplyF__FunctionTypeAssignment_2 ) ) ;
    public final void rule__ApplyF__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6434:1: ( ( ( rule__ApplyF__FunctionTypeAssignment_2 ) ) )
            // InternalFPML.g:6435:1: ( ( rule__ApplyF__FunctionTypeAssignment_2 ) )
            {
            // InternalFPML.g:6435:1: ( ( rule__ApplyF__FunctionTypeAssignment_2 ) )
            // InternalFPML.g:6436:2: ( rule__ApplyF__FunctionTypeAssignment_2 )
            {
             before(grammarAccess.getApplyFAccess().getFunctionTypeAssignment_2()); 
            // InternalFPML.g:6437:2: ( rule__ApplyF__FunctionTypeAssignment_2 )
            // InternalFPML.g:6437:3: rule__ApplyF__FunctionTypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ApplyF__FunctionTypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getApplyFAccess().getFunctionTypeAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__ApplyF__Group__3"
    // InternalFPML.g:6445:1: rule__ApplyF__Group__3 : rule__ApplyF__Group__3__Impl ;
    public final void rule__ApplyF__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6449:1: ( rule__ApplyF__Group__3__Impl )
            // InternalFPML.g:6450:2: rule__ApplyF__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ApplyF__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplyF__Group__3"


    // $ANTLR start "rule__ApplyF__Group__3__Impl"
    // InternalFPML.g:6456:1: rule__ApplyF__Group__3__Impl : ( ( rule__ApplyF__ValueAssignment_3 ) ) ;
    public final void rule__ApplyF__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6460:1: ( ( ( rule__ApplyF__ValueAssignment_3 ) ) )
            // InternalFPML.g:6461:1: ( ( rule__ApplyF__ValueAssignment_3 ) )
            {
            // InternalFPML.g:6461:1: ( ( rule__ApplyF__ValueAssignment_3 ) )
            // InternalFPML.g:6462:2: ( rule__ApplyF__ValueAssignment_3 )
            {
             before(grammarAccess.getApplyFAccess().getValueAssignment_3()); 
            // InternalFPML.g:6463:2: ( rule__ApplyF__ValueAssignment_3 )
            // InternalFPML.g:6463:3: rule__ApplyF__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ApplyF__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getApplyFAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplyF__Group__3__Impl"


    // $ANTLR start "rule__PrimitivePrint__Group__0"
    // InternalFPML.g:6472:1: rule__PrimitivePrint__Group__0 : rule__PrimitivePrint__Group__0__Impl rule__PrimitivePrint__Group__1 ;
    public final void rule__PrimitivePrint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6476:1: ( rule__PrimitivePrint__Group__0__Impl rule__PrimitivePrint__Group__1 )
            // InternalFPML.g:6477:2: rule__PrimitivePrint__Group__0__Impl rule__PrimitivePrint__Group__1
            {
            pushFollow(FOLLOW_50);
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
    // InternalFPML.g:6484:1: rule__PrimitivePrint__Group__0__Impl : ( () ) ;
    public final void rule__PrimitivePrint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6488:1: ( ( () ) )
            // InternalFPML.g:6489:1: ( () )
            {
            // InternalFPML.g:6489:1: ( () )
            // InternalFPML.g:6490:2: ()
            {
             before(grammarAccess.getPrimitivePrintAccess().getPrimitivePrintAction_0()); 
            // InternalFPML.g:6491:2: ()
            // InternalFPML.g:6491:3: 
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
    // InternalFPML.g:6499:1: rule__PrimitivePrint__Group__1 : rule__PrimitivePrint__Group__1__Impl ;
    public final void rule__PrimitivePrint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6503:1: ( rule__PrimitivePrint__Group__1__Impl )
            // InternalFPML.g:6504:2: rule__PrimitivePrint__Group__1__Impl
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
    // InternalFPML.g:6510:1: rule__PrimitivePrint__Group__1__Impl : ( 'print' ) ;
    public final void rule__PrimitivePrint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6514:1: ( ( 'print' ) )
            // InternalFPML.g:6515:1: ( 'print' )
            {
            // InternalFPML.g:6515:1: ( 'print' )
            // InternalFPML.g:6516:2: 'print'
            {
             before(grammarAccess.getPrimitivePrintAccess().getPrintKeyword_1()); 
            match(input,44,FOLLOW_2); 
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
    // InternalFPML.g:6526:1: rule__ApplyFIO__Group__0 : rule__ApplyFIO__Group__0__Impl rule__ApplyFIO__Group__1 ;
    public final void rule__ApplyFIO__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6530:1: ( rule__ApplyFIO__Group__0__Impl rule__ApplyFIO__Group__1 )
            // InternalFPML.g:6531:2: rule__ApplyFIO__Group__0__Impl rule__ApplyFIO__Group__1
            {
            pushFollow(FOLLOW_51);
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
    // InternalFPML.g:6538:1: rule__ApplyFIO__Group__0__Impl : ( () ) ;
    public final void rule__ApplyFIO__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6542:1: ( ( () ) )
            // InternalFPML.g:6543:1: ( () )
            {
            // InternalFPML.g:6543:1: ( () )
            // InternalFPML.g:6544:2: ()
            {
             before(grammarAccess.getApplyFIOAccess().getApplyFIOAction_0()); 
            // InternalFPML.g:6545:2: ()
            // InternalFPML.g:6545:3: 
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
    // InternalFPML.g:6553:1: rule__ApplyFIO__Group__1 : rule__ApplyFIO__Group__1__Impl rule__ApplyFIO__Group__2 ;
    public final void rule__ApplyFIO__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6557:1: ( rule__ApplyFIO__Group__1__Impl rule__ApplyFIO__Group__2 )
            // InternalFPML.g:6558:2: rule__ApplyFIO__Group__1__Impl rule__ApplyFIO__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalFPML.g:6565:1: rule__ApplyFIO__Group__1__Impl : ( 'applyFIO' ) ;
    public final void rule__ApplyFIO__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6569:1: ( ( 'applyFIO' ) )
            // InternalFPML.g:6570:1: ( 'applyFIO' )
            {
            // InternalFPML.g:6570:1: ( 'applyFIO' )
            // InternalFPML.g:6571:2: 'applyFIO'
            {
             before(grammarAccess.getApplyFIOAccess().getApplyFIOKeyword_1()); 
            match(input,45,FOLLOW_2); 
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
    // InternalFPML.g:6580:1: rule__ApplyFIO__Group__2 : rule__ApplyFIO__Group__2__Impl rule__ApplyFIO__Group__3 ;
    public final void rule__ApplyFIO__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6584:1: ( rule__ApplyFIO__Group__2__Impl rule__ApplyFIO__Group__3 )
            // InternalFPML.g:6585:2: rule__ApplyFIO__Group__2__Impl rule__ApplyFIO__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__ApplyFIO__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplyFIO__Group__3();

            state._fsp--;


            }

        }
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
    // InternalFPML.g:6592:1: rule__ApplyFIO__Group__2__Impl : ( ( rule__ApplyFIO__FunctionTypeAssignment_2 ) ) ;
    public final void rule__ApplyFIO__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6596:1: ( ( ( rule__ApplyFIO__FunctionTypeAssignment_2 ) ) )
            // InternalFPML.g:6597:1: ( ( rule__ApplyFIO__FunctionTypeAssignment_2 ) )
            {
            // InternalFPML.g:6597:1: ( ( rule__ApplyFIO__FunctionTypeAssignment_2 ) )
            // InternalFPML.g:6598:2: ( rule__ApplyFIO__FunctionTypeAssignment_2 )
            {
             before(grammarAccess.getApplyFIOAccess().getFunctionTypeAssignment_2()); 
            // InternalFPML.g:6599:2: ( rule__ApplyFIO__FunctionTypeAssignment_2 )
            // InternalFPML.g:6599:3: rule__ApplyFIO__FunctionTypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ApplyFIO__FunctionTypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getApplyFIOAccess().getFunctionTypeAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__ApplyFIO__Group__3"
    // InternalFPML.g:6607:1: rule__ApplyFIO__Group__3 : rule__ApplyFIO__Group__3__Impl ;
    public final void rule__ApplyFIO__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6611:1: ( rule__ApplyFIO__Group__3__Impl )
            // InternalFPML.g:6612:2: rule__ApplyFIO__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ApplyFIO__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplyFIO__Group__3"


    // $ANTLR start "rule__ApplyFIO__Group__3__Impl"
    // InternalFPML.g:6618:1: rule__ApplyFIO__Group__3__Impl : ( ( rule__ApplyFIO__ValueAssignment_3 ) ) ;
    public final void rule__ApplyFIO__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6622:1: ( ( ( rule__ApplyFIO__ValueAssignment_3 ) ) )
            // InternalFPML.g:6623:1: ( ( rule__ApplyFIO__ValueAssignment_3 ) )
            {
            // InternalFPML.g:6623:1: ( ( rule__ApplyFIO__ValueAssignment_3 ) )
            // InternalFPML.g:6624:2: ( rule__ApplyFIO__ValueAssignment_3 )
            {
             before(grammarAccess.getApplyFIOAccess().getValueAssignment_3()); 
            // InternalFPML.g:6625:2: ( rule__ApplyFIO__ValueAssignment_3 )
            // InternalFPML.g:6625:3: rule__ApplyFIO__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ApplyFIO__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getApplyFIOAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplyFIO__Group__3__Impl"


    // $ANTLR start "rule__Model__ElementsAssignment_0"
    // InternalFPML.g:6634:1: rule__Model__ElementsAssignment_0 : ( rulePureBlock ) ;
    public final void rule__Model__ElementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6638:1: ( ( rulePureBlock ) )
            // InternalFPML.g:6639:2: ( rulePureBlock )
            {
            // InternalFPML.g:6639:2: ( rulePureBlock )
            // InternalFPML.g:6640:3: rulePureBlock
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
    // InternalFPML.g:6649:1: rule__Model__ElementsAssignment_1 : ( ruleEffectFullBlock ) ;
    public final void rule__Model__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6653:1: ( ( ruleEffectFullBlock ) )
            // InternalFPML.g:6654:2: ( ruleEffectFullBlock )
            {
            // InternalFPML.g:6654:2: ( ruleEffectFullBlock )
            // InternalFPML.g:6655:3: ruleEffectFullBlock
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
    // InternalFPML.g:6664:1: rule__PureBlock__ElementsAssignment_2 : ( ruleDataBlock ) ;
    public final void rule__PureBlock__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6668:1: ( ( ruleDataBlock ) )
            // InternalFPML.g:6669:2: ( ruleDataBlock )
            {
            // InternalFPML.g:6669:2: ( ruleDataBlock )
            // InternalFPML.g:6670:3: ruleDataBlock
            {
             before(grammarAccess.getPureBlockAccess().getElementsDataBlockParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDataBlock();

            state._fsp--;

             after(grammarAccess.getPureBlockAccess().getElementsDataBlockParserRuleCall_2_0()); 

            }


            }

        }
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
    // InternalFPML.g:6679:1: rule__PureBlock__ElementsAssignment_3 : ( rulePureFunctionBlock ) ;
    public final void rule__PureBlock__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6683:1: ( ( rulePureFunctionBlock ) )
            // InternalFPML.g:6684:2: ( rulePureFunctionBlock )
            {
            // InternalFPML.g:6684:2: ( rulePureFunctionBlock )
            // InternalFPML.g:6685:3: rulePureFunctionBlock
            {
             before(grammarAccess.getPureBlockAccess().getElementsPureFunctionBlockParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePureFunctionBlock();

            state._fsp--;

             after(grammarAccess.getPureBlockAccess().getElementsPureFunctionBlockParserRuleCall_3_0()); 

            }


            }

        }
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
    // InternalFPML.g:6694:1: rule__PureFunctionBlock__FeaturesAssignment_2 : ( rulePureFunctionDefinition ) ;
    public final void rule__PureFunctionBlock__FeaturesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6698:1: ( ( rulePureFunctionDefinition ) )
            // InternalFPML.g:6699:2: ( rulePureFunctionDefinition )
            {
            // InternalFPML.g:6699:2: ( rulePureFunctionDefinition )
            // InternalFPML.g:6700:3: rulePureFunctionDefinition
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
    // InternalFPML.g:6709:1: rule__DataBlock__ElementsAssignment_2 : ( ruleData ) ;
    public final void rule__DataBlock__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6713:1: ( ( ruleData ) )
            // InternalFPML.g:6714:2: ( ruleData )
            {
            // InternalFPML.g:6714:2: ( ruleData )
            // InternalFPML.g:6715:3: ruleData
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
    // InternalFPML.g:6724:1: rule__DataBlock__ValueAssignment_3 : ( ruleValueBlock ) ;
    public final void rule__DataBlock__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6728:1: ( ( ruleValueBlock ) )
            // InternalFPML.g:6729:2: ( ruleValueBlock )
            {
            // InternalFPML.g:6729:2: ( ruleValueBlock )
            // InternalFPML.g:6730:3: ruleValueBlock
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
    // InternalFPML.g:6739:1: rule__ValueBlock__ElementsAssignment_2 : ( ruleValue ) ;
    public final void rule__ValueBlock__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6743:1: ( ( ruleValue ) )
            // InternalFPML.g:6744:2: ( ruleValue )
            {
            // InternalFPML.g:6744:2: ( ruleValue )
            // InternalFPML.g:6745:3: ruleValue
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
    // InternalFPML.g:6754:1: rule__EffectFullBlock__FeaturesAssignment_2 : ( ruleEffectFullFunctionDefinition ) ;
    public final void rule__EffectFullBlock__FeaturesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6758:1: ( ( ruleEffectFullFunctionDefinition ) )
            // InternalFPML.g:6759:2: ( ruleEffectFullFunctionDefinition )
            {
            // InternalFPML.g:6759:2: ( ruleEffectFullFunctionDefinition )
            // InternalFPML.g:6760:3: ruleEffectFullFunctionDefinition
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
    // InternalFPML.g:6769:1: rule__EffectFullBlock__MainAssignment_3 : ( ruleMainFunc ) ;
    public final void rule__EffectFullBlock__MainAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6773:1: ( ( ruleMainFunc ) )
            // InternalFPML.g:6774:2: ( ruleMainFunc )
            {
            // InternalFPML.g:6774:2: ( ruleMainFunc )
            // InternalFPML.g:6775:3: ruleMainFunc
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
    // InternalFPML.g:6784:1: rule__Data__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Data__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6788:1: ( ( RULE_ID ) )
            // InternalFPML.g:6789:2: ( RULE_ID )
            {
            // InternalFPML.g:6789:2: ( RULE_ID )
            // InternalFPML.g:6790:3: RULE_ID
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
    // InternalFPML.g:6799:1: rule__Data__ContentAssignment_2 : ( ruleAdtType ) ;
    public final void rule__Data__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6803:1: ( ( ruleAdtType ) )
            // InternalFPML.g:6804:2: ( ruleAdtType )
            {
            // InternalFPML.g:6804:2: ( ruleAdtType )
            // InternalFPML.g:6805:3: ruleAdtType
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


    // $ANTLR start "rule__Value__NameAssignment_1"
    // InternalFPML.g:6814:1: rule__Value__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Value__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6818:1: ( ( RULE_ID ) )
            // InternalFPML.g:6819:2: ( RULE_ID )
            {
            // InternalFPML.g:6819:2: ( RULE_ID )
            // InternalFPML.g:6820:3: RULE_ID
            {
             before(grammarAccess.getValueAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__NameAssignment_1"


    // $ANTLR start "rule__Value__ValueAssignment_3"
    // InternalFPML.g:6829:1: rule__Value__ValueAssignment_3 : ( ruleExpression ) ;
    public final void rule__Value__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6833:1: ( ( ruleExpression ) )
            // InternalFPML.g:6834:2: ( ruleExpression )
            {
            // InternalFPML.g:6834:2: ( ruleExpression )
            // InternalFPML.g:6835:3: ruleExpression
            {
             before(grammarAccess.getValueAccess().getValueExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getValueAccess().getValueExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__ValueAssignment_3"


    // $ANTLR start "rule__AdtType__AdtElement1Assignment_1_1"
    // InternalFPML.g:6844:1: rule__AdtType__AdtElement1Assignment_1_1 : ( ruleAdtType ) ;
    public final void rule__AdtType__AdtElement1Assignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6848:1: ( ( ruleAdtType ) )
            // InternalFPML.g:6849:2: ( ruleAdtType )
            {
            // InternalFPML.g:6849:2: ( ruleAdtType )
            // InternalFPML.g:6850:3: ruleAdtType
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
    // InternalFPML.g:6859:1: rule__AdtType__AdtElement2Assignment_1_2 : ( ( rule__AdtType__AdtElement2Alternatives_1_2_0 ) ) ;
    public final void rule__AdtType__AdtElement2Assignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6863:1: ( ( ( rule__AdtType__AdtElement2Alternatives_1_2_0 ) ) )
            // InternalFPML.g:6864:2: ( ( rule__AdtType__AdtElement2Alternatives_1_2_0 ) )
            {
            // InternalFPML.g:6864:2: ( ( rule__AdtType__AdtElement2Alternatives_1_2_0 ) )
            // InternalFPML.g:6865:3: ( rule__AdtType__AdtElement2Alternatives_1_2_0 )
            {
             before(grammarAccess.getAdtTypeAccess().getAdtElement2Alternatives_1_2_0()); 
            // InternalFPML.g:6866:3: ( rule__AdtType__AdtElement2Alternatives_1_2_0 )
            // InternalFPML.g:6866:4: rule__AdtType__AdtElement2Alternatives_1_2_0
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
    // InternalFPML.g:6874:1: rule__SumType__AdtElementAssignment_1 : ( ruleAdtType ) ;
    public final void rule__SumType__AdtElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6878:1: ( ( ruleAdtType ) )
            // InternalFPML.g:6879:2: ( ruleAdtType )
            {
            // InternalFPML.g:6879:2: ( ruleAdtType )
            // InternalFPML.g:6880:3: ruleAdtType
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
    // InternalFPML.g:6889:1: rule__ProdType__AdtElementAssignment_1 : ( ruleAdtType ) ;
    public final void rule__ProdType__AdtElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6893:1: ( ( ruleAdtType ) )
            // InternalFPML.g:6894:2: ( ruleAdtType )
            {
            // InternalFPML.g:6894:2: ( ruleAdtType )
            // InternalFPML.g:6895:3: ruleAdtType
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
    // InternalFPML.g:6904:1: rule__PureFunctionDefinition__ReturnTypeAssignment_1 : ( ruleValueType ) ;
    public final void rule__PureFunctionDefinition__ReturnTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6908:1: ( ( ruleValueType ) )
            // InternalFPML.g:6909:2: ( ruleValueType )
            {
            // InternalFPML.g:6909:2: ( ruleValueType )
            // InternalFPML.g:6910:3: ruleValueType
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
    // InternalFPML.g:6919:1: rule__PureFunctionDefinition__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__PureFunctionDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6923:1: ( ( RULE_ID ) )
            // InternalFPML.g:6924:2: ( RULE_ID )
            {
            // InternalFPML.g:6924:2: ( RULE_ID )
            // InternalFPML.g:6925:3: RULE_ID
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
    // InternalFPML.g:6934:1: rule__PureFunctionDefinition__ArgAssignment_4 : ( ruleArgument ) ;
    public final void rule__PureFunctionDefinition__ArgAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6938:1: ( ( ruleArgument ) )
            // InternalFPML.g:6939:2: ( ruleArgument )
            {
            // InternalFPML.g:6939:2: ( ruleArgument )
            // InternalFPML.g:6940:3: ruleArgument
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


    // $ANTLR start "rule__PureFunctionDefinition__Arg2Assignment_5_1"
    // InternalFPML.g:6949:1: rule__PureFunctionDefinition__Arg2Assignment_5_1 : ( ruleArgument ) ;
    public final void rule__PureFunctionDefinition__Arg2Assignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6953:1: ( ( ruleArgument ) )
            // InternalFPML.g:6954:2: ( ruleArgument )
            {
            // InternalFPML.g:6954:2: ( ruleArgument )
            // InternalFPML.g:6955:3: ruleArgument
            {
             before(grammarAccess.getPureFunctionDefinitionAccess().getArg2ArgumentParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleArgument();

            state._fsp--;

             after(grammarAccess.getPureFunctionDefinitionAccess().getArg2ArgumentParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunctionDefinition__Arg2Assignment_5_1"


    // $ANTLR start "rule__PureFunctionDefinition__FunctionBodyAssignment_9"
    // InternalFPML.g:6964:1: rule__PureFunctionDefinition__FunctionBodyAssignment_9 : ( ruleFunctionBodyPure ) ;
    public final void rule__PureFunctionDefinition__FunctionBodyAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6968:1: ( ( ruleFunctionBodyPure ) )
            // InternalFPML.g:6969:2: ( ruleFunctionBodyPure )
            {
            // InternalFPML.g:6969:2: ( ruleFunctionBodyPure )
            // InternalFPML.g:6970:3: ruleFunctionBodyPure
            {
             before(grammarAccess.getPureFunctionDefinitionAccess().getFunctionBodyFunctionBodyPureParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleFunctionBodyPure();

            state._fsp--;

             after(grammarAccess.getPureFunctionDefinitionAccess().getFunctionBodyFunctionBodyPureParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureFunctionDefinition__FunctionBodyAssignment_9"


    // $ANTLR start "rule__EffectFullFunctionDefinition__ReturnTypeAssignment_1"
    // InternalFPML.g:6979:1: rule__EffectFullFunctionDefinition__ReturnTypeAssignment_1 : ( ruleIOType ) ;
    public final void rule__EffectFullFunctionDefinition__ReturnTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6983:1: ( ( ruleIOType ) )
            // InternalFPML.g:6984:2: ( ruleIOType )
            {
            // InternalFPML.g:6984:2: ( ruleIOType )
            // InternalFPML.g:6985:3: ruleIOType
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
    // InternalFPML.g:6994:1: rule__EffectFullFunctionDefinition__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__EffectFullFunctionDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:6998:1: ( ( RULE_ID ) )
            // InternalFPML.g:6999:2: ( RULE_ID )
            {
            // InternalFPML.g:6999:2: ( RULE_ID )
            // InternalFPML.g:7000:3: RULE_ID
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
    // InternalFPML.g:7009:1: rule__EffectFullFunctionDefinition__ArgAssignment_4 : ( ruleEffectFullArgument ) ;
    public final void rule__EffectFullFunctionDefinition__ArgAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7013:1: ( ( ruleEffectFullArgument ) )
            // InternalFPML.g:7014:2: ( ruleEffectFullArgument )
            {
            // InternalFPML.g:7014:2: ( ruleEffectFullArgument )
            // InternalFPML.g:7015:3: ruleEffectFullArgument
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


    // $ANTLR start "rule__EffectFullFunctionDefinition__Arg2Assignment_5_1"
    // InternalFPML.g:7024:1: rule__EffectFullFunctionDefinition__Arg2Assignment_5_1 : ( ruleEffectFullArgument ) ;
    public final void rule__EffectFullFunctionDefinition__Arg2Assignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7028:1: ( ( ruleEffectFullArgument ) )
            // InternalFPML.g:7029:2: ( ruleEffectFullArgument )
            {
            // InternalFPML.g:7029:2: ( ruleEffectFullArgument )
            // InternalFPML.g:7030:3: ruleEffectFullArgument
            {
             before(grammarAccess.getEffectFullFunctionDefinitionAccess().getArg2EffectFullArgumentParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEffectFullArgument();

            state._fsp--;

             after(grammarAccess.getEffectFullFunctionDefinitionAccess().getArg2EffectFullArgumentParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunctionDefinition__Arg2Assignment_5_1"


    // $ANTLR start "rule__EffectFullFunctionDefinition__FunctionBodyAssignment_9"
    // InternalFPML.g:7039:1: rule__EffectFullFunctionDefinition__FunctionBodyAssignment_9 : ( ruleFunctionBodyEffectFull ) ;
    public final void rule__EffectFullFunctionDefinition__FunctionBodyAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7043:1: ( ( ruleFunctionBodyEffectFull ) )
            // InternalFPML.g:7044:2: ( ruleFunctionBodyEffectFull )
            {
            // InternalFPML.g:7044:2: ( ruleFunctionBodyEffectFull )
            // InternalFPML.g:7045:3: ruleFunctionBodyEffectFull
            {
             before(grammarAccess.getEffectFullFunctionDefinitionAccess().getFunctionBodyFunctionBodyEffectFullParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleFunctionBodyEffectFull();

            state._fsp--;

             after(grammarAccess.getEffectFullFunctionDefinitionAccess().getFunctionBodyFunctionBodyEffectFullParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectFullFunctionDefinition__FunctionBodyAssignment_9"


    // $ANTLR start "rule__MainFunc__ReturnTypeAssignment_1"
    // InternalFPML.g:7054:1: rule__MainFunc__ReturnTypeAssignment_1 : ( ruleUnitType ) ;
    public final void rule__MainFunc__ReturnTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7058:1: ( ( ruleUnitType ) )
            // InternalFPML.g:7059:2: ( ruleUnitType )
            {
            // InternalFPML.g:7059:2: ( ruleUnitType )
            // InternalFPML.g:7060:3: ruleUnitType
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
    // InternalFPML.g:7069:1: rule__MainFunc__FunctionBodyAssignment_5 : ( ruleFunctionBodyEffectFull ) ;
    public final void rule__MainFunc__FunctionBodyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7073:1: ( ( ruleFunctionBodyEffectFull ) )
            // InternalFPML.g:7074:2: ( ruleFunctionBodyEffectFull )
            {
            // InternalFPML.g:7074:2: ( ruleFunctionBodyEffectFull )
            // InternalFPML.g:7075:3: ruleFunctionBodyEffectFull
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
    // InternalFPML.g:7084:1: rule__EffectFullArgument__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__EffectFullArgument__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7088:1: ( ( ruleType ) )
            // InternalFPML.g:7089:2: ( ruleType )
            {
            // InternalFPML.g:7089:2: ( ruleType )
            // InternalFPML.g:7090:3: ruleType
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
    // InternalFPML.g:7099:1: rule__EffectFullArgument__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EffectFullArgument__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7103:1: ( ( RULE_ID ) )
            // InternalFPML.g:7104:2: ( RULE_ID )
            {
            // InternalFPML.g:7104:2: ( RULE_ID )
            // InternalFPML.g:7105:3: RULE_ID
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
    // InternalFPML.g:7114:1: rule__Argument__TypeAssignment_0 : ( ruleValueType ) ;
    public final void rule__Argument__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7118:1: ( ( ruleValueType ) )
            // InternalFPML.g:7119:2: ( ruleValueType )
            {
            // InternalFPML.g:7119:2: ( ruleValueType )
            // InternalFPML.g:7120:3: ruleValueType
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
    // InternalFPML.g:7129:1: rule__Argument__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Argument__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7133:1: ( ( RULE_ID ) )
            // InternalFPML.g:7134:2: ( RULE_ID )
            {
            // InternalFPML.g:7134:2: ( RULE_ID )
            // InternalFPML.g:7135:3: RULE_ID
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
    // InternalFPML.g:7144:1: rule__CompositionFunctionBodyPure__ReferenceElementAssignment_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__CompositionFunctionBodyPure__ReferenceElementAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7148:1: ( ( ( RULE_ID ) ) )
            // InternalFPML.g:7149:2: ( ( RULE_ID ) )
            {
            // InternalFPML.g:7149:2: ( ( RULE_ID ) )
            // InternalFPML.g:7150:3: ( RULE_ID )
            {
             before(grammarAccess.getCompositionFunctionBodyPureAccess().getReferenceElementPureFunctionDefinitionCrossReference_0_0_0()); 
            // InternalFPML.g:7151:3: ( RULE_ID )
            // InternalFPML.g:7152:4: RULE_ID
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
    // InternalFPML.g:7163:1: rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1 : ( ruleCompositionFunctionBodyPureFactor ) ;
    public final void rule__CompositionFunctionBodyPure__FunctionChainAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7167:1: ( ( ruleCompositionFunctionBodyPureFactor ) )
            // InternalFPML.g:7168:2: ( ruleCompositionFunctionBodyPureFactor )
            {
            // InternalFPML.g:7168:2: ( ruleCompositionFunctionBodyPureFactor )
            // InternalFPML.g:7169:3: ruleCompositionFunctionBodyPureFactor
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


    // $ANTLR start "rule__CompositionFunctionBodyPure__PrimitiveElementAssignment_1_0"
    // InternalFPML.g:7178:1: rule__CompositionFunctionBodyPure__PrimitiveElementAssignment_1_0 : ( rulePrimitivePureFunction ) ;
    public final void rule__CompositionFunctionBodyPure__PrimitiveElementAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7182:1: ( ( rulePrimitivePureFunction ) )
            // InternalFPML.g:7183:2: ( rulePrimitivePureFunction )
            {
            // InternalFPML.g:7183:2: ( rulePrimitivePureFunction )
            // InternalFPML.g:7184:3: rulePrimitivePureFunction
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
    // InternalFPML.g:7193:1: rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1 : ( ruleCompositionFunctionBodyPureFactor ) ;
    public final void rule__CompositionFunctionBodyPure__FunctionChainAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7197:1: ( ( ruleCompositionFunctionBodyPureFactor ) )
            // InternalFPML.g:7198:2: ( ruleCompositionFunctionBodyPureFactor )
            {
            // InternalFPML.g:7198:2: ( ruleCompositionFunctionBodyPureFactor )
            // InternalFPML.g:7199:3: ruleCompositionFunctionBodyPureFactor
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


    // $ANTLR start "rule__CompositionFunctionBodyPureFactor__ReferenceElementAssignment_0_1"
    // InternalFPML.g:7208:1: rule__CompositionFunctionBodyPureFactor__ReferenceElementAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__CompositionFunctionBodyPureFactor__ReferenceElementAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7212:1: ( ( ( RULE_ID ) ) )
            // InternalFPML.g:7213:2: ( ( RULE_ID ) )
            {
            // InternalFPML.g:7213:2: ( ( RULE_ID ) )
            // InternalFPML.g:7214:3: ( RULE_ID )
            {
             before(grammarAccess.getCompositionFunctionBodyPureFactorAccess().getReferenceElementPureFunctionDefinitionCrossReference_0_1_0()); 
            // InternalFPML.g:7215:3: ( RULE_ID )
            // InternalFPML.g:7216:4: RULE_ID
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
    // InternalFPML.g:7227:1: rule__CompositionFunctionBodyPureFactor__PrimitiveElementAssignment_1_1 : ( rulePrimitivePureFunction ) ;
    public final void rule__CompositionFunctionBodyPureFactor__PrimitiveElementAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7231:1: ( ( rulePrimitivePureFunction ) )
            // InternalFPML.g:7232:2: ( rulePrimitivePureFunction )
            {
            // InternalFPML.g:7232:2: ( rulePrimitivePureFunction )
            // InternalFPML.g:7233:3: rulePrimitivePureFunction
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
    // InternalFPML.g:7242:1: rule__CompositionFunctionBodyEffect__ReferenceElementAssignment_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__CompositionFunctionBodyEffect__ReferenceElementAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7246:1: ( ( ( RULE_ID ) ) )
            // InternalFPML.g:7247:2: ( ( RULE_ID ) )
            {
            // InternalFPML.g:7247:2: ( ( RULE_ID ) )
            // InternalFPML.g:7248:3: ( RULE_ID )
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getReferenceElementEffectFullReferenceCrossReference_0_0_0()); 
            // InternalFPML.g:7249:3: ( RULE_ID )
            // InternalFPML.g:7250:4: RULE_ID
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getReferenceElementEffectFullReferenceIDTerminalRuleCall_0_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCompositionFunctionBodyEffectAccess().getReferenceElementEffectFullReferenceIDTerminalRuleCall_0_0_0_1()); 

            }

             after(grammarAccess.getCompositionFunctionBodyEffectAccess().getReferenceElementEffectFullReferenceCrossReference_0_0_0()); 

            }


            }

        }
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
    // InternalFPML.g:7261:1: rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1 : ( ruleCompositionFunctionBodyEffectFullFactor ) ;
    public final void rule__CompositionFunctionBodyEffect__FunctionChainAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7265:1: ( ( ruleCompositionFunctionBodyEffectFullFactor ) )
            // InternalFPML.g:7266:2: ( ruleCompositionFunctionBodyEffectFullFactor )
            {
            // InternalFPML.g:7266:2: ( ruleCompositionFunctionBodyEffectFullFactor )
            // InternalFPML.g:7267:3: ruleCompositionFunctionBodyEffectFullFactor
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


    // $ANTLR start "rule__CompositionFunctionBodyEffect__PrimitiveElementAssignment_1_0"
    // InternalFPML.g:7276:1: rule__CompositionFunctionBodyEffect__PrimitiveElementAssignment_1_0 : ( ( rule__CompositionFunctionBodyEffect__PrimitiveElementAlternatives_1_0_0 ) ) ;
    public final void rule__CompositionFunctionBodyEffect__PrimitiveElementAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7280:1: ( ( ( rule__CompositionFunctionBodyEffect__PrimitiveElementAlternatives_1_0_0 ) ) )
            // InternalFPML.g:7281:2: ( ( rule__CompositionFunctionBodyEffect__PrimitiveElementAlternatives_1_0_0 ) )
            {
            // InternalFPML.g:7281:2: ( ( rule__CompositionFunctionBodyEffect__PrimitiveElementAlternatives_1_0_0 ) )
            // InternalFPML.g:7282:3: ( rule__CompositionFunctionBodyEffect__PrimitiveElementAlternatives_1_0_0 )
            {
             before(grammarAccess.getCompositionFunctionBodyEffectAccess().getPrimitiveElementAlternatives_1_0_0()); 
            // InternalFPML.g:7283:3: ( rule__CompositionFunctionBodyEffect__PrimitiveElementAlternatives_1_0_0 )
            // InternalFPML.g:7283:4: rule__CompositionFunctionBodyEffect__PrimitiveElementAlternatives_1_0_0
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
    // InternalFPML.g:7291:1: rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1 : ( ruleCompositionFunctionBodyEffectFullFactor ) ;
    public final void rule__CompositionFunctionBodyEffect__FunctionChainAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7295:1: ( ( ruleCompositionFunctionBodyEffectFullFactor ) )
            // InternalFPML.g:7296:2: ( ruleCompositionFunctionBodyEffectFullFactor )
            {
            // InternalFPML.g:7296:2: ( ruleCompositionFunctionBodyEffectFullFactor )
            // InternalFPML.g:7297:3: ruleCompositionFunctionBodyEffectFullFactor
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


    // $ANTLR start "rule__CompositionFunctionBodyEffectFullFactor__ReferenceElementAssignment_0_1"
    // InternalFPML.g:7306:1: rule__CompositionFunctionBodyEffectFullFactor__ReferenceElementAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__CompositionFunctionBodyEffectFullFactor__ReferenceElementAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7310:1: ( ( ( RULE_ID ) ) )
            // InternalFPML.g:7311:2: ( ( RULE_ID ) )
            {
            // InternalFPML.g:7311:2: ( ( RULE_ID ) )
            // InternalFPML.g:7312:3: ( RULE_ID )
            {
             before(grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getReferenceElementEffectFullReferenceCrossReference_0_1_0()); 
            // InternalFPML.g:7313:3: ( RULE_ID )
            // InternalFPML.g:7314:4: RULE_ID
            {
             before(grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getReferenceElementEffectFullReferenceIDTerminalRuleCall_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getReferenceElementEffectFullReferenceIDTerminalRuleCall_0_1_0_1()); 

            }

             after(grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getReferenceElementEffectFullReferenceCrossReference_0_1_0()); 

            }


            }

        }
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
    // InternalFPML.g:7325:1: rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAssignment_1_1 : ( ( rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAlternatives_1_1_0 ) ) ;
    public final void rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7329:1: ( ( ( rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAlternatives_1_1_0 ) ) )
            // InternalFPML.g:7330:2: ( ( rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAlternatives_1_1_0 ) )
            {
            // InternalFPML.g:7330:2: ( ( rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAlternatives_1_1_0 ) )
            // InternalFPML.g:7331:3: ( rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAlternatives_1_1_0 )
            {
             before(grammarAccess.getCompositionFunctionBodyEffectFullFactorAccess().getPrimitiveElementAlternatives_1_1_0()); 
            // InternalFPML.g:7332:3: ( rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAlternatives_1_1_0 )
            // InternalFPML.g:7332:4: rule__CompositionFunctionBodyEffectFullFactor__PrimitiveElementAlternatives_1_1_0
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


    // $ANTLR start "rule__IOType__TypeAssignment_1"
    // InternalFPML.g:7340:1: rule__IOType__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__IOType__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7344:1: ( ( ruleType ) )
            // InternalFPML.g:7345:2: ( ruleType )
            {
            // InternalFPML.g:7345:2: ( ruleType )
            // InternalFPML.g:7346:3: ruleType
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
    // InternalFPML.g:7355:1: rule__IntegerType__TypeAssignment_1 : ( ( 'int' ) ) ;
    public final void rule__IntegerType__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7359:1: ( ( ( 'int' ) ) )
            // InternalFPML.g:7360:2: ( ( 'int' ) )
            {
            // InternalFPML.g:7360:2: ( ( 'int' ) )
            // InternalFPML.g:7361:3: ( 'int' )
            {
             before(grammarAccess.getIntegerTypeAccess().getTypeIntKeyword_1_0()); 
            // InternalFPML.g:7362:3: ( 'int' )
            // InternalFPML.g:7363:4: 'int'
            {
             before(grammarAccess.getIntegerTypeAccess().getTypeIntKeyword_1_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalFPML.g:7374:1: rule__StringType__TypeAssignment_1 : ( ( 'String' ) ) ;
    public final void rule__StringType__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7378:1: ( ( ( 'String' ) ) )
            // InternalFPML.g:7379:2: ( ( 'String' ) )
            {
            // InternalFPML.g:7379:2: ( ( 'String' ) )
            // InternalFPML.g:7380:3: ( 'String' )
            {
             before(grammarAccess.getStringTypeAccess().getTypeStringKeyword_1_0()); 
            // InternalFPML.g:7381:3: ( 'String' )
            // InternalFPML.g:7382:4: 'String'
            {
             before(grammarAccess.getStringTypeAccess().getTypeStringKeyword_1_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalFPML.g:7393:1: rule__UnitType__TypeAssignment_1 : ( ( 'Unit' ) ) ;
    public final void rule__UnitType__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7397:1: ( ( ( 'Unit' ) ) )
            // InternalFPML.g:7398:2: ( ( 'Unit' ) )
            {
            // InternalFPML.g:7398:2: ( ( 'Unit' ) )
            // InternalFPML.g:7399:3: ( 'Unit' )
            {
             before(grammarAccess.getUnitTypeAccess().getTypeUnitKeyword_1_0()); 
            // InternalFPML.g:7400:3: ( 'Unit' )
            // InternalFPML.g:7401:4: 'Unit'
            {
             before(grammarAccess.getUnitTypeAccess().getTypeUnitKeyword_1_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalFPML.g:7412:1: rule__DataType__TypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__DataType__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7416:1: ( ( ( RULE_ID ) ) )
            // InternalFPML.g:7417:2: ( ( RULE_ID ) )
            {
            // InternalFPML.g:7417:2: ( ( RULE_ID ) )
            // InternalFPML.g:7418:3: ( RULE_ID )
            {
             before(grammarAccess.getDataTypeAccess().getTypeDataCrossReference_2_0()); 
            // InternalFPML.g:7419:3: ( RULE_ID )
            // InternalFPML.g:7420:4: RULE_ID
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
    // InternalFPML.g:7431:1: rule__PureFunctionType__ArgTypeAssignment_3 : ( ruleValueType ) ;
    public final void rule__PureFunctionType__ArgTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7435:1: ( ( ruleValueType ) )
            // InternalFPML.g:7436:2: ( ruleValueType )
            {
            // InternalFPML.g:7436:2: ( ruleValueType )
            // InternalFPML.g:7437:3: ruleValueType
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
    // InternalFPML.g:7446:1: rule__PureFunctionType__ReturnTypeAssignment_5 : ( ruleValueType ) ;
    public final void rule__PureFunctionType__ReturnTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7450:1: ( ( ruleValueType ) )
            // InternalFPML.g:7451:2: ( ruleValueType )
            {
            // InternalFPML.g:7451:2: ( ruleValueType )
            // InternalFPML.g:7452:3: ruleValueType
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
    // InternalFPML.g:7461:1: rule__EffectFullFunctionType__ArgTypeAssignment_3 : ( ruleType ) ;
    public final void rule__EffectFullFunctionType__ArgTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7465:1: ( ( ruleType ) )
            // InternalFPML.g:7466:2: ( ruleType )
            {
            // InternalFPML.g:7466:2: ( ruleType )
            // InternalFPML.g:7467:3: ruleType
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
    // InternalFPML.g:7476:1: rule__EffectFullFunctionType__ReturnTypeAssignment_5 : ( ruleType ) ;
    public final void rule__EffectFullFunctionType__ReturnTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7480:1: ( ( ruleType ) )
            // InternalFPML.g:7481:2: ( ruleType )
            {
            // InternalFPML.g:7481:2: ( ruleType )
            // InternalFPML.g:7482:3: ruleType
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
    // InternalFPML.g:7491:1: rule__IntValue__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__IntValue__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7495:1: ( ( RULE_INT ) )
            // InternalFPML.g:7496:2: ( RULE_INT )
            {
            // InternalFPML.g:7496:2: ( RULE_INT )
            // InternalFPML.g:7497:3: RULE_INT
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
    // InternalFPML.g:7506:1: rule__StringValue__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__StringValue__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7510:1: ( ( RULE_STRING ) )
            // InternalFPML.g:7511:2: ( RULE_STRING )
            {
            // InternalFPML.g:7511:2: ( RULE_STRING )
            // InternalFPML.g:7512:3: RULE_STRING
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
    // InternalFPML.g:7521:1: rule__FunctionValue__ValueAssignment : ( rulePureLambda ) ;
    public final void rule__FunctionValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7525:1: ( ( rulePureLambda ) )
            // InternalFPML.g:7526:2: ( rulePureLambda )
            {
            // InternalFPML.g:7526:2: ( rulePureLambda )
            // InternalFPML.g:7527:3: rulePureLambda
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
    // InternalFPML.g:7536:1: rule__DataValue__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__DataValue__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7540:1: ( ( ( RULE_ID ) ) )
            // InternalFPML.g:7541:2: ( ( RULE_ID ) )
            {
            // InternalFPML.g:7541:2: ( ( RULE_ID ) )
            // InternalFPML.g:7542:3: ( RULE_ID )
            {
             before(grammarAccess.getDataValueAccess().getTypeDataCrossReference_1_0()); 
            // InternalFPML.g:7543:3: ( RULE_ID )
            // InternalFPML.g:7544:4: RULE_ID
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
    // InternalFPML.g:7555:1: rule__DataValue__ValueAssignment_3 : ( ruleAdtValue ) ;
    public final void rule__DataValue__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7559:1: ( ( ruleAdtValue ) )
            // InternalFPML.g:7560:2: ( ruleAdtValue )
            {
            // InternalFPML.g:7560:2: ( ruleAdtValue )
            // InternalFPML.g:7561:3: ruleAdtValue
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
    // InternalFPML.g:7570:1: rule__ValueRef__ValueAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ValueRef__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7574:1: ( ( ( RULE_ID ) ) )
            // InternalFPML.g:7575:2: ( ( RULE_ID ) )
            {
            // InternalFPML.g:7575:2: ( ( RULE_ID ) )
            // InternalFPML.g:7576:3: ( RULE_ID )
            {
             before(grammarAccess.getValueRefAccess().getValueValueCrossReference_1_0()); 
            // InternalFPML.g:7577:3: ( RULE_ID )
            // InternalFPML.g:7578:4: RULE_ID
            {
             before(grammarAccess.getValueRefAccess().getValueValueIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getValueRefAccess().getValueValueIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getValueRefAccess().getValueValueCrossReference_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__PureLambda__ArgAssignment_2"
    // InternalFPML.g:7589:1: rule__PureLambda__ArgAssignment_2 : ( ruleArgument ) ;
    public final void rule__PureLambda__ArgAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7593:1: ( ( ruleArgument ) )
            // InternalFPML.g:7594:2: ( ruleArgument )
            {
            // InternalFPML.g:7594:2: ( ruleArgument )
            // InternalFPML.g:7595:3: ruleArgument
            {
             before(grammarAccess.getPureLambdaAccess().getArgArgumentParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleArgument();

            state._fsp--;

             after(grammarAccess.getPureLambdaAccess().getArgArgumentParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureLambda__ArgAssignment_2"


    // $ANTLR start "rule__PureLambda__FunctionBodyAssignment_5"
    // InternalFPML.g:7604:1: rule__PureLambda__FunctionBodyAssignment_5 : ( ruleFunctionBodyPure ) ;
    public final void rule__PureLambda__FunctionBodyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7608:1: ( ( ruleFunctionBodyPure ) )
            // InternalFPML.g:7609:2: ( ruleFunctionBodyPure )
            {
            // InternalFPML.g:7609:2: ( ruleFunctionBodyPure )
            // InternalFPML.g:7610:3: ruleFunctionBodyPure
            {
             before(grammarAccess.getPureLambdaAccess().getFunctionBodyFunctionBodyPureParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleFunctionBodyPure();

            state._fsp--;

             after(grammarAccess.getPureLambdaAccess().getFunctionBodyFunctionBodyPureParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureLambda__FunctionBodyAssignment_5"


    // $ANTLR start "rule__ProdValue__ProdAdtElement1Assignment_1"
    // InternalFPML.g:7619:1: rule__ProdValue__ProdAdtElement1Assignment_1 : ( ruleAdtValue ) ;
    public final void rule__ProdValue__ProdAdtElement1Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7623:1: ( ( ruleAdtValue ) )
            // InternalFPML.g:7624:2: ( ruleAdtValue )
            {
            // InternalFPML.g:7624:2: ( ruleAdtValue )
            // InternalFPML.g:7625:3: ruleAdtValue
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
    // InternalFPML.g:7634:1: rule__ProdValue__ProdAdtElement2Assignment_3 : ( ruleAdtValue ) ;
    public final void rule__ProdValue__ProdAdtElement2Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7638:1: ( ( ruleAdtValue ) )
            // InternalFPML.g:7639:2: ( ruleAdtValue )
            {
            // InternalFPML.g:7639:2: ( ruleAdtValue )
            // InternalFPML.g:7640:3: ruleAdtValue
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
    // InternalFPML.g:7649:1: rule__SumValue__SumAdtElement1Assignment_0_2 : ( ruleAdtValue ) ;
    public final void rule__SumValue__SumAdtElement1Assignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7653:1: ( ( ruleAdtValue ) )
            // InternalFPML.g:7654:2: ( ruleAdtValue )
            {
            // InternalFPML.g:7654:2: ( ruleAdtValue )
            // InternalFPML.g:7655:3: ruleAdtValue
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
    // InternalFPML.g:7664:1: rule__SumValue__SumAdtElement2Assignment_1_2 : ( ruleAdtValue ) ;
    public final void rule__SumValue__SumAdtElement2Assignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7668:1: ( ( ruleAdtValue ) )
            // InternalFPML.g:7669:2: ( ruleAdtValue )
            {
            // InternalFPML.g:7669:2: ( ruleAdtValue )
            // InternalFPML.g:7670:3: ruleAdtValue
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


    // $ANTLR start "rule__ApplyF__FunctionTypeAssignment_2"
    // InternalFPML.g:7679:1: rule__ApplyF__FunctionTypeAssignment_2 : ( rulePureFunctionType ) ;
    public final void rule__ApplyF__FunctionTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7683:1: ( ( rulePureFunctionType ) )
            // InternalFPML.g:7684:2: ( rulePureFunctionType )
            {
            // InternalFPML.g:7684:2: ( rulePureFunctionType )
            // InternalFPML.g:7685:3: rulePureFunctionType
            {
             before(grammarAccess.getApplyFAccess().getFunctionTypePureFunctionTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePureFunctionType();

            state._fsp--;

             after(grammarAccess.getApplyFAccess().getFunctionTypePureFunctionTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplyF__FunctionTypeAssignment_2"


    // $ANTLR start "rule__ApplyF__ValueAssignment_3"
    // InternalFPML.g:7694:1: rule__ApplyF__ValueAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__ApplyF__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7698:1: ( ( ( RULE_ID ) ) )
            // InternalFPML.g:7699:2: ( ( RULE_ID ) )
            {
            // InternalFPML.g:7699:2: ( ( RULE_ID ) )
            // InternalFPML.g:7700:3: ( RULE_ID )
            {
             before(grammarAccess.getApplyFAccess().getValuePureReferenceCrossReference_3_0()); 
            // InternalFPML.g:7701:3: ( RULE_ID )
            // InternalFPML.g:7702:4: RULE_ID
            {
             before(grammarAccess.getApplyFAccess().getValuePureReferenceIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getApplyFAccess().getValuePureReferenceIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getApplyFAccess().getValuePureReferenceCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplyF__ValueAssignment_3"


    // $ANTLR start "rule__ApplyFIO__FunctionTypeAssignment_2"
    // InternalFPML.g:7713:1: rule__ApplyFIO__FunctionTypeAssignment_2 : ( ruleEffectFullFunctionType ) ;
    public final void rule__ApplyFIO__FunctionTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7717:1: ( ( ruleEffectFullFunctionType ) )
            // InternalFPML.g:7718:2: ( ruleEffectFullFunctionType )
            {
            // InternalFPML.g:7718:2: ( ruleEffectFullFunctionType )
            // InternalFPML.g:7719:3: ruleEffectFullFunctionType
            {
             before(grammarAccess.getApplyFIOAccess().getFunctionTypeEffectFullFunctionTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEffectFullFunctionType();

            state._fsp--;

             after(grammarAccess.getApplyFIOAccess().getFunctionTypeEffectFullFunctionTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplyFIO__FunctionTypeAssignment_2"


    // $ANTLR start "rule__ApplyFIO__ValueAssignment_3"
    // InternalFPML.g:7728:1: rule__ApplyFIO__ValueAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__ApplyFIO__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFPML.g:7732:1: ( ( ( RULE_ID ) ) )
            // InternalFPML.g:7733:2: ( ( RULE_ID ) )
            {
            // InternalFPML.g:7733:2: ( ( RULE_ID ) )
            // InternalFPML.g:7734:3: ( RULE_ID )
            {
             before(grammarAccess.getApplyFIOAccess().getValueEffectFullReferenceCrossReference_3_0()); 
            // InternalFPML.g:7735:3: ( RULE_ID )
            // InternalFPML.g:7736:4: RULE_ID
            {
             before(grammarAccess.getApplyFIOAccess().getValueEffectFullReferenceIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getApplyFIOAccess().getValueEffectFullReferenceIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getApplyFIOAccess().getValueEffectFullReferenceCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplyFIO__ValueAssignment_3"

    // Delegated rules


    protected DFA17 dfa17 = new DFA17(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\3\uffff\1\7\6\uffff";
    static final String dfa_3s = "\1\4\2\uffff\1\30\1\uffff\1\4\4\uffff";
    static final String dfa_4s = "\1\46\2\uffff\1\32\1\uffff\1\57\4\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\2\1\uffff\1\5\1\uffff\1\4\1\3\1\6\1\7";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\3\1\1\1\2\21\uffff\1\5\14\uffff\2\4",
            "",
            "",
            "\1\6\2\7",
            "",
            "\3\11\21\uffff\1\11\7\uffff\2\10\3\uffff\2\11\7\uffff\2\10",
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

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1818:1: rule__AdtValue__Alternatives : ( ( ruleIntValue ) | ( ruleStringValue ) | ( ruleValueRef ) | ( ruleDataValue ) | ( ruleSumValue ) | ( ruleFunctionValue ) | ( ruleProdValue ) );";
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
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000C00300080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000070L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000C00300000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000F8020600010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0001C01300000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00003F8020600010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000006001000070L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000300000000000L});

}